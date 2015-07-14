package plasmax10.visitor;
import util.exception.PlasmaException;
import util.symboltable.Constants;
import util.symboltable.Symbol;
import util.symboltable.SymbolTableClassEntry;
import util.symboltable.SymbolTableMethodEntry;
import util.symboltable.Symbol.SymIndex;
import util.types.X10Boolean;
import util.types.X10Byte;
import util.types.X10Class;
import util.types.X10Distribution;
import util.types.X10Double;
import util.types.X10DummyStrArray;
import util.types.X10Integer;
import util.types.X10Long;
import util.types.X10Place;
import util.types.X10Point;
import util.types.X10ReferenceArray;
import util.types.X10ReferenceArrayWithDist;
import util.types.X10Region;
import util.types.X10SShort;
import util.types.X10String;
import util.types.X10Type;
import util.types.X10Unassigned;
import util.types.X10ValueArray;
import util.types.X10Void;

import java.util.*;

import plasmax10.syntaxtree.*;

public class SymbolTableGeneratorVisitor extends GJDepthFirst<X10Type, X10Type> {
	public HashMap<String, SymbolTableClassEntry> classSymbolTable;

	public SymbolTableClassEntry currentClass;

	public SymbolTableMethodEntry currentMethod;

	private int ptRank = 0;

	private int dimCount;

	public int blockId;

	public int parentBlock;
	public int currentBlock;

	private String constantField = null;

	public enum BlockScope {
		PARALLEL /* async, finish, ateach, foreach */,
		SWITCH /* switch */,
		LOOP /* while, for, do-while */,
		METHOD /* method */,
		CONSTRUCTOR /* constructor */,
		CONSTANTINIT /* constant initializer */,
		ARRAYINIT /* array initializer */
	};

	BlockScope currentScope;
	BlockScope outerScope;

	boolean isReturn;
	
	public SymbolTableGeneratorVisitor(HashMap<String, SymbolTableClassEntry> classSymbolTable) {
		if(classSymbolTable == null)
		{
			this.classSymbolTable = new HashMap<String, SymbolTableClassEntry>(0);
		}
		else
			this.classSymbolTable = classSymbolTable;
		this.currentClass = null;
		this.currentMethod = null; 
		this.blockId = 0;
		PlasmaException.currLine = -1;
		PlasmaException.currColumn = -1;
	}
	
	private void checkBreakStatement()
	{
		if(currentScope != BlockScope.LOOP && currentScope != BlockScope.SWITCH)
			PlasmaException.throwException("Break statement can be used only inside a loop or a switch "
					+ currentClass.className + " " + currentMethod.methodSignature.getCompleteMethodSignature()
					+ " " + currentScope, true);
	}

	private void checkContinueStatement()
	{
		if(currentScope != BlockScope.LOOP)
			PlasmaException.throwException("Continue statement can be used only inside a loop "
					+ currentClass.className + " " + currentMethod.methodSignature.getCompleteMethodSignature()
					+ " " + currentScope, true);
	}

	private void checkReturnStatement(X10Type type)
	{
		// If inside async, finish, foreach, ateach
		if(outerScope == BlockScope.PARALLEL)
		{
			PlasmaException.throwException("Return statment not allowed inside async, ateach, foreach, finish", true);
		}

		// If returning in constant initializer
		if(outerScope == BlockScope.CONSTANTINIT)
		{
			PlasmaException.throwException("Return statment not allowed inside constant initializer "
					+ currentMethod.methodSignature.getCompleteMethodSignature(), true);
		}

		// If returning in constructor
		if(outerScope == BlockScope.CONSTRUCTOR)
		{
			if(type != null)
				PlasmaException.throwException("Constructor " 
						+ currentMethod.methodSignature.getCompleteMethodSignature() 
						+ " should have a return type void.", true);
		}

		// If returning in method
		if(outerScope == BlockScope.METHOD)
		{
			if((type != null) && currentMethod.returnType instanceof X10Void)
				PlasmaException.throwException("Expected void return type for method "
						+currentMethod.methodSignature.getCompleteMethodSignature() + ". Got type "+ type, true);

			if((type == null) && !(currentMethod.returnType instanceof X10Void))
				PlasmaException.throwException("Expected " + currentMethod.returnType  + " return type for method "
						+currentMethod.methodSignature.getCompleteMethodSignature() + ". Got type "+ type, true);
		}

		// If returning from array initializer
		if(outerScope == BlockScope.ARRAYINIT)
		{
			if(type == null)
				PlasmaException.throwException("Array initializer cannot have a void return type", true);
		}
	}

	private void checkRank(int dimCount, int ptRank) {
		if(dimCount != ptRank)
			PlasmaException.throwException("Ranks don't match for array initializer in " +
					"method " + currentClass.className + ":" 
					+ currentMethod.methodSignature.getMethodSignature() + dimCount + " " + ptRank,true);
	}

	private void checkConstructorName() {		
		if(!currentMethod.methodSignature.getMethodSignature().equals(currentClass.className))
			PlasmaException.throwException("Constructor name should be same as class name", true);

		for(String methodSig : currentClass.constructors.keySet())
		{
			if(currentMethod.methodSignature.equals(currentClass.constructors.get(methodSig)))
			{
				PlasmaException.throwException("Construtor "
						+ currentMethod.methodSignature.getCompleteMethodSignature()
						+ " already defined in the class "
						+ currentClass.className, true);
			}
		}
	}

	private void verifyClassName(String className)
	{
		if(currentClass==null || !currentClass.className.equals(className))
		{	
			PlasmaException.throwException("Declared class name "
					+ className 
					+ " does not match the expected class name " 
					+ ((currentClass == null) ? null : currentClass.className), true);
		}
	}

	private void checkMethodOverloading() {
		String methodSignature = currentMethod.methodSignature.getMethodSignature();
		if(methodSignature.equals(currentClass.className))
		{
			PlasmaException.throwException("Constructor " 
					+ currentMethod.methodSignature.getCompleteMethodSignature()
					+ " in class " + currentClass.className
					+ " should have X10Type void return type", true);
		}
		if (currentClass.methods.containsKey(methodSignature)) {
			PlasmaException.throwException("Method " + methodSignature
					+ " already defined in class " + currentClass.className, true);
		}
	}

	private Symbol lookupVariableInScope(String identifier, int scopeId)
	{
		if(scopeId == 0) return null;
		else
		{
			SymIndex symId = new SymIndex(identifier, scopeId);
			if(currentMethod.variables.containsKey(symId))
			{
				return currentMethod.variables.get(symId);
			}
			else
			{
				//System.out.println(currentMethod.methodSignature.getCompleteMethodSignature()+currentMethod.blockMap+identifier+scopeId);
				return lookupVariableInScope(identifier, currentMethod.blockMap.get(scopeId));
			}
		}
	}

	private void verifyDistId(X10ReferenceArrayWithDist arrayType)
	{
		Symbol sym = lookupVariableInScope(arrayType.distId, currentBlock);
		if(sym != null)
		{
			// found locally
			if(!(sym.symbolType instanceof X10Distribution) 
					|| sym.modifiability != Constants.Modifiability.FINAL
					|| ((X10Distribution)sym.symbolType).rank != arrayType.rank)
			{
				PlasmaException.throwException("The distribution identifier "
						+ arrayType.distId 
						+ " in class " + currentClass.className 
						+ ":" + currentMethod.methodSignature.getMethodSignature()  
						+ " should be of type X10Distribution and should be declared final", true);
			}
			else return;
		}
		else
		{
			// declaring in a static method, only constants are visible
			if(currentMethod.persistence == Constants.Persistence.STATIC)
			{
				// initializing a constant itself
				// more restrictive, only constants declared before current are visible
				if(constantField != null)
				{
					if(currentClass.fields.containsKey(new SymIndex(arrayType.distId, 0)))
					{
						Symbol constant = currentClass.fields.get(new SymIndex(arrayType.distId, 0));
						Symbol symbol = currentClass.fields.get(new SymIndex(constantField, 0));
						if(!(constant.symbolType instanceof X10Distribution) 
								|| constant.positionId>=symbol.positionId 
								|| constant.persistence != Constants.Persistence.STATIC
								|| constant.modifiability != Constants.Modifiability.FINAL
								|| ((X10Distribution)constant.symbolType).rank != arrayType.rank)
						{
							PlasmaException.throwException("The distribution identifier "
									+ arrayType.distId 
									+ " in class " + currentClass.className  
									+ " should be of type X10Distribution and should be declared static final", true);
						}
						else return;
					}
					else
					{
						PlasmaException.throwException("No distribution identifier "+ arrayType.distId + " defined in class " + currentClass.className, true);
					}
				}
				//static method, only constants are visible
				else
				{
					if(currentClass.fields.containsKey(new SymIndex(arrayType.distId, 0)))
					{
						Symbol constant = currentClass.fields.get(new SymIndex(arrayType.distId, 0));
						if(!(constant.symbolType instanceof X10Distribution)
								|| constant.persistence != Constants.Persistence.STATIC
								|| constant.modifiability != Constants.Modifiability.FINAL
								|| ((X10Distribution)constant.symbolType).rank != arrayType.rank)
						{
							PlasmaException.throwException("The distribution identifier "
									+ arrayType.distId 
									+ " in class " + currentClass.className  
									+ " should be of type X10Distribution and should be declared static final", true);
						}
						else return;
					}
					else
					{
						PlasmaException.throwException("No distribution identifier "+ arrayType.distId + " defined in class " + currentClass.className, true);
					}
				}
			}
			// method declaration, all fields are visible
			else
			{
				if(currentClass.fields.containsKey(new SymIndex(arrayType.distId, 0)))
				{
					Symbol constant = currentClass.fields.get(new SymIndex(arrayType.distId, 0));
					if(!(constant.symbolType instanceof X10Distribution)
							|| constant.modifiability != Constants.Modifiability.FINAL
							|| ((X10Distribution)constant.symbolType).rank != arrayType.rank)
					{
						PlasmaException.throwException("The distribution identifier "
								+ arrayType.distId 
								+ " in class " + currentClass.className  
								+ " should be of type X10Distribution and should be declared static final", true);
					}
					else return;
				}
				else
				{
					PlasmaException.throwException("No distribution identifier "+ arrayType.distId + " defined in class " + currentClass.className, true);
				}
			}
		}
	}

	private void checkDuplicateVariables(String identifier, X10Type type) {
		Symbol sym = lookupVariableInScope(identifier, currentBlock);
		if (sym!=null) 
		{
			PlasmaException.throwException("Duplicate variable declaration " + type + " " + identifier  
					+ " found in " + currentClass.className 
					+ ":" + currentMethod.methodSignature.getMethodSignature(), true); 
		}
		// If needed.....
		/*if (currentClass.fields.containsKey(identifier)) 
		{
			System.out.println("Duplicate field "+ identifier 
					+ " already declared in class" + currentClass.className); 
			//System.exit(0);
		}
		if (currentClass.constants.containsKey(identifier)) 
		{
			System.out.println("Duplicate constant "+ identifier 
					+ " already declared in class" + currentClass.className); 
			//System.exit(0);
		}*/
	}

	/*private void verifyToStringMethod() {
		if(!currentClass.methods.containsKey("toString"))
			PlasmaException.throwException("public String::toString() method required in value class "+ currentClass.className, true);
		else if (!((currentClass.methods.get("toString")).returnType instanceof X10String) 
					|| currentClass.methods.get("toString").visibility != Constants.Visibility.PUBLIC
					|| currentClass.methods.get("toString").persistence != Constants.Persistence.NONSTATIC)
			PlasmaException.throwException("public String::toString() method required in value class "+ currentClass.className, true);
	}*/

	//
	// Auto class visitors--probably don't need to be overridden.
	//
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

	public X10Type visit(NodeToken n, X10Type argu) {
        if (n.beginLine == -1 || n.beginColumn == -1)
        {
        	
        	System.err.println("Line number or token number is not set for token " + n.tokenImage);
        }
        else
        {
        	PlasmaException.currColumn = n.beginColumn;
        	PlasmaException.currLine = n.beginLine;
        }
        return new X10Unassigned(n.tokenImage, null);
    }

	//
	// User-generated visitor methods below
	//

	/**
	 * f0 -> ( TopLevelDeclaration() )*
	 * f1 -> <EOF>
	 */
	public X10Type visit(File n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		//sanitizeSymbolTable();
		return _ret;
	}

	/**
	 * f0 -> MainClass()
	 *       | ClassDeclaration()
	 *       | ValueDeclaration()
	 */
	public X10Type visit(TopLevelDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "public" f1 -> "class" f2 -> Identifier() f3 -> "{" f4 -> "public"
	 * f5 -> "static" f6 -> "void" f7 -> "main" f8 -> "(" f9 -> "String" f10 ->
	 * "[" f11 -> "]" f12 -> Identifier() f13 -> ")" f14 -> "{" f15 ->
	 * Statement() f16 -> "}" f17 -> "}"
	 */
	public X10Type visit(MainClass n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		String className = n.f2.accept(this, argu).typeName;

		currentClass = classSymbolTable.get(className);
		verifyClassName(className);		

		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);

		String methodName = n.f7.accept(this, argu).typeName;
		currentMethod = new SymbolTableMethodEntry();
		currentMethod.methodSignature.methodName = methodName;
		currentMethod.methodSignature.formalParameters.add(new X10DummyStrArray());
		currentMethod.methodClass = className;
		currentMethod.returnType = new X10Void();
		currentMethod.persistence = Constants.Persistence.STATIC;
		currentMethod.visibility = Constants.Visibility.PUBLIC;
		currentMethod.blockMap = new HashMap<Integer, Integer>(0);

		n.f8.accept(this, argu);
		n.f9.accept(this, argu);
		n.f10.accept(this, argu);
		n.f11.accept(this, argu);

		String identifier = n.f12.accept(this, argu).typeName;		
		Symbol sym = new Symbol(identifier,new X10DummyStrArray(),
				Constants.Visibility.LOCAL, 
				Constants.Persistence.NONSTATIC, 
				Constants.Modifiability.NONFINAL, -1, 1, currentClass.className);

		currentMethod.variables.put(sym.symId, sym);
		currentMethod.blockMap.put(1, 0);
		n.f13.accept(this, argu);
		n.f14.accept(this, argu);
		parentBlock = 0;
		blockId = 0;
		currentBlock = 0;
		currentScope = outerScope = BlockScope.METHOD;
		n.f15.accept(this, argu);
		n.f16.accept(this, argu);

		currentClass.methods.put(currentMethod.methodSignature.getMethodSignature(), currentMethod);
		currentMethod = null;

		n.f17.accept(this, argu);		

		classSymbolTable.put(className, currentClass);
		currentClass = null;
		return _ret;
	}

	/**
	 * f0 -> [ public ] f1 -> "class" f2 -> Identifier() f3 -> "{" f4 -> (
	 * ClassMember() )* f5 -> "}"
	 */
	public X10Type visit(ClassDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		String className =n.f2.accept(this, argu).typeName;

		currentClass = classSymbolTable.get(className);
		verifyClassName(className);

		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);

		classSymbolTable.put(className, currentClass);
		currentClass = null;
		return _ret;
	}

	/**
	 * f0 -> [ public ] f1 -> "value" f2 -> Identifier() f3 -> "{" f4 -> (
	 * ValueMember() )* f5 -> "}"
	 */
	public X10Type visit(ValueDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		String className = n.f2.accept(this, argu).typeName;

		currentClass = classSymbolTable.get(className);
		verifyClassName(className);

		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);

		//verifyToStringMethod();
		classSymbolTable.put(className, currentClass);
		currentClass = null;
		return _ret;
	}

	/**
	 * f0 -> ConstructorDeclaration() | MethodDeclaration() |
	 * ConstantDeclaration() | InitializableConstantDeclaration() |
	 * UpdatableFieldDeclaration()
	 */
	public X10Type visit(ClassMember n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ConstructorDeclaration() | MethodDeclaration() |
	 * ConstantDeclaration() | InitializableConstantDeclaration()
	 */
	public X10Type visit(ValueMember n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}


	/**
	 * f0 -> "public" f1 -> Identifier() f2 -> "(" f3 -> ( FormalParameterList() )?
	 * f4 -> ")" f5 -> Block()
	 */
	public X10Type visit(ConstructorDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		String methodName = n.f1.accept(this, argu).typeName;

		currentMethod = new SymbolTableMethodEntry();
		currentMethod.methodSignature.methodName = methodName;
		currentMethod.methodClass = currentClass.className;
		currentMethod.returnType = null;
		currentMethod.persistence = Constants.Persistence.NONSTATIC;
		currentMethod.visibility = Constants.Visibility.PUBLIC;
		currentMethod.blockMap = new HashMap<Integer, Integer>(0);
		//visibleVariables = new HashMap<String, Symbol>(0);
		parentBlock = 0;
		blockId = 1;
		currentBlock = 1;
		currentMethod.blockMap.put(1, 0);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		blockId = 0;
		currentBlock = 0;
		currentScope = outerScope = BlockScope.CONSTRUCTOR;
		n.f5.accept(this, argu);
		//visibleVariables = null;
		checkConstructorName();
		currentClass.constructors.put(currentMethod.methodSignature.getCompleteMethodSignature(), currentMethod);
		currentMethod = null;

		return _ret;
	}

	/**
	 * f0 -> Public() | Private()
	 */
	public X10Type visit(Visibility n, X10Type argu) {
		X10Type _ret = null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Visibility() f1 -> "static" f2 -> "final" f3 -> Type() f4 ->
	 * Identifier() f5 -> "=" f6 -> Expression() f7 -> ";"
	 */
	public X10Type visit(ConstantDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		X10Type type = (X10Type)n.f3.accept(this, argu);
		String identifier = n.f4.accept(this, argu).typeName;
		n.f5.accept(this, argu);

		currentMethod = new SymbolTableMethodEntry();
		currentMethod.methodClass = currentClass.className;
		currentMethod.visibility = Constants.Visibility.PRIVATE;		
		currentMethod.persistence = Constants.Persistence.STATIC;
		currentMethod.returnType = type;
		currentMethod.methodSignature.methodName = "_"+currentClass.className+"_"+identifier+"_init";
		constantField = identifier;
		parentBlock = 0;
		blockId = 1;
		currentBlock = 1;
		currentMethod.blockMap = new HashMap<Integer, Integer>(0);
		currentMethod.blockMap.put(1, 0);
		currentScope = outerScope = BlockScope.CONSTANTINIT;
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		constantField = null;
		Symbol constant = currentClass.fields.get(new SymIndex(identifier, 0));

		//System.out.println(currentClass.fields);
		constant.initializer = currentMethod;

		currentClass.fields.put(constant.symId, constant);
		currentMethod = null;
		return _ret;
	}

	/**
	 * f0 -> Visibility() f1 -> "final" f2 -> Type() f3 -> Identifier() f4 ->
	 * ";"
	 */
	public X10Type visit(InitializableConstantDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);				
		return _ret;
	}

	/**
	 * f0 -> Visibility() f1 -> Type() f2 -> Identifier() f3 -> ";"
	 */
	public X10Type visit(UpdatableFieldDeclaration n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "public" f1 -> "static"
	 */
	public X10Type visit(PublicStatic n, X10Type argu) {
		String _ret=null;
		_ret = n.f0.accept(this, argu).typeName;
		_ret += ";";
		_ret += n.f1.accept(this, argu);
		return new X10Unassigned(_ret,null);
	}

	/**
	 * f0 -> "public"
	 */
	public X10Type visit(Public n, X10Type argu) {
		String _ret=null;
		_ret = n.f0.accept(this, argu).typeName;
		return new X10Unassigned(_ret,null);
	}

	/**
	 * f0 -> "private"
	 */
	public X10Type visit(Private n, X10Type argu) {
		String _ret=null;
		_ret = n.f0.accept(this, argu).typeName;
		return new X10Unassigned(_ret,null);
	}

	/**
	 * f0 -> MethodModifier() f1 -> ReturnType() f2 -> Identifier() f3 -> "(" f4 -> (
	 * FormalParameterList() )? f5 -> ")" f6 -> Block()
	 */
	public X10Type visit(MethodDeclaration n, X10Type argu) {
		X10Type _ret=null;

		currentMethod = new SymbolTableMethodEntry();
		String methodmodifier = n.f0.accept(this, argu).typeName;

		if(methodmodifier.equals(Constants.publicType))
		{
			currentMethod.visibility = Constants.Visibility.PUBLIC;
			currentMethod.persistence = Constants.Persistence.NONSTATIC;
		}
		else if(methodmodifier.equals(Constants.privateType))
		{
			currentMethod.visibility = Constants.Visibility.PRIVATE;
			currentMethod.persistence = Constants.Persistence.NONSTATIC;
		}
		else
		{
			currentMethod.visibility = Constants.Visibility.PUBLIC;
			currentMethod.persistence = Constants.Persistence.STATIC;
		}

		X10Type returnType = (X10Type)n.f1.accept(this, argu);
		currentMethod.methodClass = currentClass.className;
		currentMethod.returnType = returnType;
		String methodName = n.f2.accept(this, argu).typeName;
		currentMethod.methodSignature.methodName = methodName;
		currentMethod.blockMap = new HashMap<Integer, Integer>(0);
		n.f3.accept(this, argu);
		parentBlock = 0;
		blockId = 1;
		currentBlock = 1;
		currentMethod.blockMap.put(1, 0);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);

		checkMethodOverloading();

		blockId = 0;
		currentBlock = 0;
		currentScope = outerScope = BlockScope.METHOD;
		isReturn = false;
		n.f6.accept(this, argu);
		if(!(returnType instanceof X10Void) && !isReturn)
			PlasmaException.throwException("Return statement of type " 
					+ returnType + "expected for method " + currentClass.className 
					+ currentMethod.methodSignature.getCompleteMethodSignature(), true);
		currentClass.methods.put(currentMethod.methodSignature.getMethodSignature(), currentMethod);
		currentMethod = null;
		return _ret;

	}

	/**
	 * f0 -> PublicStatic() | Public() | Private()
	 */
	public X10Type visit(MethodModifier n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> FormalParameter() f1 -> ( FormalParameterRest() )*
	 */
	public X10Type visit(FormalParameterList n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> FinalFormalParameter() | UpdatableFormalParameter()
	 */
	public X10Type visit(FormalParameter n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "final" f1 -> Type() f2 -> Identifier()
	 */
	public X10Type visit(FinalFormalParameter n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		X10Type type = (X10Type)n.f1.accept(this, argu);
		if(type instanceof X10ReferenceArrayWithDist)
			verifyDistId((X10ReferenceArrayWithDist)type);
		String identifier = n.f2.accept(this, argu).typeName;

		checkDuplicateVariables(identifier, type);
		Symbol sym = new Symbol(identifier, type, Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL,-1, currentBlock, currentClass.className);
		//sym.setInitialized(true, null);
		currentMethod.variables.put(sym.symId, sym);

		currentMethod.methodSignature.formalParameters.add(type);

		return _ret;
	}

	/**
	 * f0 -> Type() f1 -> Identifier()
	 */
	public X10Type visit(UpdatableFormalParameter n, X10Type argu) {
		X10Type _ret=null;
		X10Type type = (X10Type)n.f0.accept(this, argu);
		if(type instanceof X10ReferenceArrayWithDist)
			verifyDistId((X10ReferenceArrayWithDist)type);
		String identifier = n.f1.accept(this, argu).typeName;

		checkDuplicateVariables(identifier, type);
		Symbol sym = new Symbol(identifier, type
				, Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.NONFINAL, -1, currentBlock, currentClass.className);
		//sym.setInitialized(true, null);
		currentMethod.variables.put(sym.symId, sym);
		currentMethod.methodSignature.formalParameters.add(type);
		return _ret;
	}

	/**
	 * f0 -> "," f1 -> FormalParameter()
	 */
	public X10Type visit(FormalParameterRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> VoidType() | Type()
	 */
	public X10Type visit(ReturnType n, X10Type argu) {
		X10Type _ret=null;
		_ret = (X10Type)n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "void"
	 */
	public X10Type visit(VoidType n, X10Type argu) {
		X10Type _ret = new X10Void();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> UpdatableArrayType() | ValueArrayType() | NonArrayType()
	 */
	public X10Type visit(Type n, X10Type argu) {
		X10Type _ret=null;
		_ret = (X10Type)n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> NonArrayType() f1 -> "[" f2 -> ":" f3 -> RankEquation() f4 -> (
	 * DistributionEquation() )? f5 -> "]"
	 */
	public X10Type visit(UpdatableArrayType n, X10Type argu) {

		X10Type nonArrayType = (X10Type)n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		String rankStr = n.f3.accept(this, argu).typeName;
		int rank = Integer.parseInt(rankStr);
		X10Type distIdObj = n.f4.accept(this, argu);
		n.f5.accept(this, argu);		

		String distId = null;
		if (distIdObj != null) {			
			distId = distIdObj.typeName;
			return new X10ReferenceArrayWithDist(rank, nonArrayType, distId);
		}
		return new X10ReferenceArray(rank, nonArrayType);
	}

	/**
	 * f0 -> NonArrayType() f1 -> "value" f2 -> "[" f3 -> ":" f4 ->
	 * RankEquation() f5 -> "]"
	 */
	public X10Type visit(ValueArrayType n, X10Type argu) {
		X10Type nonArrayType = (X10Type)n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		String rankStr = n.f4.accept(this, argu).typeName;
		int rank = Integer.parseInt(rankStr);
		n.f5.accept(this, argu);
		return new X10ValueArray(rank, nonArrayType);
	}

	/**
	 * f0 -> "rank" f1 -> "==" f2 -> IntegerLiteral()
	 */
	public X10Type visit(RankEquation n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		_ret = n.f2.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "&&" f1 -> "distribution" f2 -> "==" f3 -> Identifier()
	 */
	public X10Type visit(DistributionEquation n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> BooleanType() | IntegerType() | DoubleType() | StringType() |
	 * PlaceType() | DistType() | RegionType() | PointType() | ClassNameType()
	 */
	public X10Type visit(NonArrayType n, X10Type argu) {
		X10Type typeBase = n.f0.accept(this, argu);
		return typeBase;
	}

	/**
	 * f0 -> "boolean"
	 */
	public X10Type visit(BooleanType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Boolean();
	}

	/**
	 * f0 -> "int"
	 */
	public X10Type visit(IntegerType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Integer();
	}


	/**
	 * f0 -> "long"
	 */
	public X10Type visit(LongType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Long();
	}

	/**
	 * f0 -> "short"
	 */
	public X10Type visit(ShortType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10SShort();
	}

	/**
	 * f0 -> "byte"
	 */
	public X10Type visit(ByteType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Byte();
	}

	/**
	 * f0 -> "double"
	 */
	public X10Type visit(DoubleType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Double();
	}

	/**
	 * f0 -> "String"
	 */
	public X10Type visit(StringType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10String();
	}

	/**
	 * f0 -> "place"
	 */
	public X10Type visit(PlaceType n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Place();
	}

	/**
	 * f0 -> "dist" f1 -> "(" f2 -> ":" f3 -> RankEquation() f4 -> ")"
	 */
	public X10Type visit(DistType n, X10Type argu) {
		String _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu).typeName;
		int rank = Integer.parseInt(_ret);
		n.f4.accept(this, argu);
		return new X10Distribution(rank);		
	}

	/**
	 * f0 -> "region" f1 -> "(" f2 -> ":" f3 -> RankEquation() f4 -> ")"
	 */
	public X10Type visit(RegionType n, X10Type argu) {
		String _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu).typeName;
		int rank = Integer.parseInt(_ret);
		n.f4.accept(this, argu);
		return new X10Region(rank);
	}

	/**
	 * f0 -> "point" f1 -> "(" f2 -> ":" f3 -> RankEquation() f4 -> ")"
	 */
	public X10Type visit(PointType n, X10Type argu) {
		String _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu).typeName;
		int rank = Integer.parseInt(_ret);
		n.f4.accept(this, argu);
		return new X10Point(rank);
	}

	/**
	 * f0 -> Identifier()
	 */
	public X10Type visit(ClassNameType n, X10Type argu) {
		String _ret=null;
		_ret = n.f0.accept(this, argu).typeName;
		return new X10Class(_ret);
	}

	/**
	 * f0 -> <IDENTIFIER>
	 */
	public X10Type visit(Identifier n, X10Type argu) {
		String _ret = null;
		_ret = n.f0.accept(this, argu).typeName;
		return new X10Unassigned(_ret, null);
	}

	/**
	 * f0 -> Assignment() | AddLocalOpsStatement| AsyncStatement() | Block() | BreakStatement() |
	 * ContinueStatement() | DoStatement() | FinishStatement() | IfStatement() |
	 * LoopStatement() |   ThisConstructorCallStatement() | PostfixStatement() | PrefixStatement() |
	 * PrintlnStatement() | PrintStatement() | PrintErrorStatement() |
	 * ReturnStatement() | SwitchStatement() | ThrowStatement() |
	 * WhileStatement()
	 */
	public X10Type visit(Statement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	    * f0 -> "x10.lang.perf.addLocalOps"
	    * f1 -> "("
	    * f2 -> Expression()
	    * f3 -> ")"
	    * f4 -> ";"
	    */
	   public X10Type visit(AddLocalOpsStatement n, X10Type argu) {
	      X10Type _ret=null;
	      n.f0.accept(this, argu);
	      n.f1.accept(this, argu);
	      n.f2.accept(this, argu);
	      n.f3.accept(this, argu);
	      n.f4.accept(this, argu);
	      return _ret;
	   }

	/**
	 * f0 -> PrimaryExpression() f1 -> AssignmentOperator() f2 -> Expression()
	 * f3 -> ";"
	 */
	public X10Type visit(Assignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PlainAssignment() | MultiplyAssignment() | DivideAssignment() |
	 * ModuloAssignment() | PlusAssignment() | MinusAssignment() |
	 * ShiftLeftAssignment() | ShiftRightAssignment() |
	 * ShiftRightUnsignedAssignment() | AndAssignment() | XOrAssignment() |
	 * OrAssignment()
	 */
	public X10Type visit(AssignmentOperator n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "="
	 */
	public X10Type visit(PlainAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "*="
	 */
	public X10Type visit(MultiplyAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "/="
	 */
	public X10Type visit(DivideAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "%="
	 */
	public X10Type visit(ModuloAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "+="
	 */
	public X10Type visit(PlusAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "-="
	 */
	public X10Type visit(MinusAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "<<="
	 */
	public X10Type visit(ShiftLeftAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">>="
	 */
	public X10Type visit(ShiftRightAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">>>="
	 */
	public X10Type visit(ShiftRightUnsignedAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "&="
	 */
	public X10Type visit(AndAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "^="
	 */
	public X10Type visit(XOrAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "|="
	 */
	public X10Type visit(OrAssignment n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "async" f1 -> "(" f2 -> Expression() f3 -> ")" f4 -> Block()
	 */
	public X10Type visit(AsyncStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		BlockScope tempCurr = currentScope;
		BlockScope tempOuter = outerScope;
		currentScope = outerScope = BlockScope.PARALLEL;
		n.f4.accept(this, argu);
		currentScope = tempCurr;
		outerScope = tempOuter;
		return _ret;
	}

	/**
	 * f0 -> "{" f1 -> ( BlockStatement() )* f2 -> "}"
	 */
	public X10Type visit(Block n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		int temp = parentBlock;
		parentBlock = currentBlock;
		currentBlock = ++blockId;
		currentMethod.blockMap.put(currentBlock, parentBlock);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		currentBlock = parentBlock;
		parentBlock = temp;
		return _ret;
	}

	/**
	 * f0 -> FinalVariableDeclaration() | UpdatableVariableDeclaration() |
	 * Statement()
	 */
	public X10Type visit(BlockStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "final" f1 -> Type() f2 -> Identifier() f3 -> "=" f4 ->
	 * Expression() f5 -> ";"
	 */
	public X10Type visit(FinalVariableDeclaration n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		X10Type type = (X10Type)n.f1.accept(this, argu);
		String identifier = n.f2.accept(this, argu).typeName;
		if(type instanceof X10ReferenceArrayWithDist)
			verifyDistId((X10ReferenceArrayWithDist)type);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);

		checkDuplicateVariables(identifier, type);

		Symbol sym = new Symbol(identifier, type, Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock, currentClass.className);
		//sym.setInitialized(true, null);
		currentMethod.variables.put(sym.symId, sym);
		return _ret;
	}

	/**
	 * f0 -> Type() f1 -> Identifier() f2 -> "=" f3 -> Expression() f4 -> ";"
	 */
	public X10Type visit(UpdatableVariableDeclaration n, X10Type argu) {
		X10Type _ret = null;
		X10Type type = (X10Type)n.f0.accept(this, argu);
		String identifier = n.f1.accept(this, argu).typeName;
		if(type instanceof X10ReferenceArrayWithDist)
			verifyDistId((X10ReferenceArrayWithDist)type);

		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		checkDuplicateVariables(identifier, type);
		Symbol sym = new Symbol(identifier, type, Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.NONFINAL, -1, currentBlock, currentClass.className);
		//sym.setInitialized(true, null);
		currentMethod.variables.put(sym.symId, sym);
		return _ret;
	}

	/**
	 * f0 -> "break" f1 -> ";"
	 */
	public X10Type visit(BreakStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		checkBreakStatement();
		return _ret;
	}
	
	/**
	 * f0 -> "continue" f1 -> ";"
	 */
	public X10Type visit(ContinueStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		checkContinueStatement();
		return _ret;
	}

	/**
	 * f0 -> "do" f1 -> Statement() f2 -> "while" f3 -> "(" f4 -> Expression()
	 * f5 -> ")" f6 -> ";"
	 */
	public X10Type visit(DoStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		BlockScope tempCurr = currentScope;
		currentScope = BlockScope.LOOP;	
		n.f1.accept(this, argu);
		currentScope = tempCurr;
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "finish" f1 -> Statement()
	 */
	public X10Type visit(FinishStatement n, X10Type argu) {
		X10Type _ret = null;
		BlockScope tempCurr = currentScope;
		BlockScope tempOuter = outerScope;
		currentScope = outerScope = BlockScope.PARALLEL;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		currentScope = tempCurr;
		outerScope = tempOuter;
		return _ret;
	}

	/**
	 * f0 -> "if" f1 -> "(" f2 -> Expression() f3 -> ")" f4 -> Statement() f5 -> [
	 * ElseClause() ]
	 */
	public X10Type visit(IfStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "else" f1 -> Statement()
	 */
	public X10Type visit(ElseClause n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> LoopQualifier() f1 -> "(" f2 -> PointType() f3 ->
	 * ExplodedSpecification() f4 -> ":" f5 -> Expression() f6 -> ")" f7 ->
	 * Statement()
	 */
	public X10Type visit(LoopStatement n, X10Type argu) {
		X10Type _ret = null;
		String loopQualifier = n.f0.accept(this, argu).typeName;
		n.f1.accept(this, argu);
		X10Point pt = (X10Point)n.f2.accept(this, argu);
		ptRank = pt.rank;
		int temp = parentBlock;
		parentBlock = currentBlock; 
		currentBlock = ++blockId;
		currentMethod.blockMap.put(currentBlock, parentBlock);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		BlockScope tempCurr = currentScope;
		BlockScope tempOuter = outerScope;
		if(loopQualifier.equals("foreach") || loopQualifier.equals("ateach"))
		{
			currentScope = outerScope = BlockScope.PARALLEL;
		}
		else
		{
			currentScope = BlockScope.LOOP;
		}
		n.f7.accept(this, argu);
		currentScope = tempCurr;
		outerScope = tempOuter;

		currentBlock = parentBlock;
		parentBlock = temp;
		return _ret;
	}
	   
	/**
	 * f0 -> Ateach() | For() | Foreach()
	 */
	public X10Type visit(LoopQualifier n, X10Type argu) {
		X10Type _ret = null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "ateach"
	 */
	public X10Type visit(Ateach n, X10Type argu) {
		X10Type _ret = null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "for"
	 */
	public X10Type visit(For n, X10Type argu) {
		X10Type _ret = null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "foreach"
	 */
	public X10Type visit(Foreach n, X10Type argu) {
		X10Type _ret = null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PointNameCoordinates() | PointName() | Coordinates()
	 */
	public X10Type visit(ExplodedSpecification n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}


   /**
    * f0 -> PointName()
    * f1 -> Coordinates()
    */
   public X10Type visit(PointNameCoordinates n, X10Type argu) {
      X10Type _ret = null; 
      n.f0.accept(this, argu);
      n.f1.accept(this, argu);
      return _ret;
   }

	/**
	 * f0 -> Identifier()
	 */
	public X10Type visit(PointName n, X10Type argu) {
		X10Type _ret = null;
		String identifier = n.f0.accept(this, argu).typeName;

		checkDuplicateVariables(identifier, new X10Point(ptRank));
		Symbol sym = new Symbol(identifier, new X10Point(ptRank), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock, currentClass.className);
		sym.initialized = true;
		currentMethod.variables.put(sym.symId, sym);
		return _ret;
	}


   /**
    * f0 -> "["
    * f1 -> IdentifierList()
    * f2 -> "]"
    */
	public X10Type visit(Coordinates n, X10Type argu) {
		X10Type _ret = null;
		dimCount = 1;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return _ret;
	}


   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public X10Type visit(IdentifierList n, X10Type argu) {
		X10Type _ret = null;
		dimCount = 1;
        String identifier = n.f0.accept(this, argu).typeName;
		checkDuplicateVariables(identifier, new X10Integer());
		Symbol sym = new Symbol(identifier, new X10Integer(), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock, currentClass.className);
		sym.initialized = true;
		currentMethod.variables.put(sym.symId, sym);
		n.f1.accept(this, argu);
		checkRank(dimCount, ptRank);
      return _ret; 
   }

	/** f0 -> "," f1 -> Identifier()
      */
	public X10Type visit(IdentifierRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		dimCount++;
		String identifier = n.f1.accept(this, argu).typeName;
		checkDuplicateVariables(identifier, new X10Integer());
		Symbol sym = new Symbol(identifier, new X10Integer(), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock, currentClass.className);
		currentMethod.variables.put(sym.symId, sym);
		return _ret;
	}

    /*
	 * f0 -> Identifier() f1 -> IdentifierList()
	public X10Type visit(PointNameIdentifierList n, X10Type argu) {
		X10Type _ret = null;
		String identifier = n.f0.accept(this, argu).typeName;
		checkDuplicateVariables(identifier, new X10Point(ptRank));
		Symbol sym = new Symbol(identifier, new X10Point(ptRank), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock);
		sym.initialized = true;
		currentMethod.variables.put(sym.symId, sym);
		n.f1.accept(this, argu);
		return _ret;
	}

	 * f0 -> Identifier()
	public X10Type visit(PointName n, X10Type argu) {
		X10Type _ret = null;
		String identifier = n.f0.accept(this, argu).typeName;

		checkDuplicateVariables(identifier, new X10Point(ptRank));
		Symbol sym = new Symbol(identifier, new X10Point(ptRank), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock);
		sym.initialized = true;
		currentMethod.variables.put(sym.symId, sym);

		return _ret;
	}

	 * f0 -> "[" f1 -> Identifier() f2 -> ( IdentifierRest() )* f3 -> "]"
	public X10Type visit(IdentifierList n, X10Type argu) {
		X10Type _ret = null;
		dimCount = 1;
		n.f0.accept(this, argu);
		String identifier = n.f1.accept(this, argu).typeName;

		checkDuplicateVariables(identifier, new X10Integer());
		Symbol sym = new Symbol(identifier, new X10Integer(), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock);
		sym.initialized = true;
		currentMethod.variables.put(sym.symId, sym);

		n.f2.accept(this, argu);
		checkRank(dimCount, ptRank);
		n.f3.accept(this, argu);
		return _ret;
	}

	 * f0 -> "," f1 -> Identifier()
	public X10Type visit(IdentifierRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		dimCount++;
		String identifier = n.f1.accept(this, argu).typeName;
		checkDuplicateVariables(identifier, new X10Integer());
		Symbol sym = new Symbol(identifier, new X10Integer(), Constants.Visibility.LOCAL
				, Constants.Persistence.NONSTATIC
				, Constants.Modifiability.FINAL, -1, currentBlock);
		currentMethod.variables.put(sym.symId, sym);
		return _ret;
	}
	 */

	/**
	 * f0 -> PostfixExpression() f1 -> ";"
	 */
	public X10Type visit(PostfixStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "System.out.println" f1 -> "(" f2 -> Expression() f3 -> ")" f4 ->
	 * ";"
	 */
	public X10Type visit(PrintlnStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "System.out.print" f1 -> "(" f2 -> Expression() f3 -> ")" f4 -> ";"
	 */
	public X10Type visit(PrintStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "System.err.println" f1 -> "(" f2 -> Expression() f3 -> ")" f4 ->
	 * ";"
	 */
	public X10Type visit(PrintErrorStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "return" f1 -> [ Expression() ] f2 -> ";"
	 */
	public X10Type visit(ReturnStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		_ret = n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		checkReturnStatement(_ret);
		isReturn = true;
		return _ret;
	}

	/**
	 * f0 -> "switch" f1 -> "(" f2 -> Expression() f3 -> ")" f4 -> "{" f5 -> (
	 * SwitchEntry() )* f6 -> "}"
	 */
	public X10Type visit(SwitchStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> SwitchLabel() f1 -> ":" f2 -> ( BlockStatement() )*
	 */
	public X10Type visit(SwitchEntry n, X10Type argu) {
		X10Type _ret = null; 
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		int temp = parentBlock;
		parentBlock = currentBlock; 
		currentBlock = ++blockId;
		currentMethod.blockMap.put(currentBlock, parentBlock);

		BlockScope tempCurr = currentScope;
		currentScope = BlockScope.SWITCH;		
		n.f2.accept(this, argu);
		currentScope = tempCurr;

		currentBlock = parentBlock;
		parentBlock = temp;
		return _ret;
	}

	/**
	 * f0 -> Case() | Default()
	 */
	public X10Type visit(SwitchLabel n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "case" f1 -> Expression()
	 */
	public X10Type visit(Case n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "default"
	 */
	public X10Type visit(Default n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "throw" f1 -> "new" f2 -> "RuntimeException" f3 -> "(" f4 ->
	 * Expression() f5 -> ")" f6 -> ";"
	 */
	public X10Type visit(ThrowStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "while" f1 -> "(" f2 -> Expression() f3 -> ")" f4 -> Statement()
	 */
	public X10Type visit(WhileStatement n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		BlockScope tempCurr = currentScope;
		currentScope = BlockScope.LOOP;	
		n.f4.accept(this, argu);
		currentScope = tempCurr;
		return _ret;
	}

	/**
	 * f0 -> ConditionalExpression()
	 */
	public X10Type visit(Expression n, X10Type argu) {
		n.f0.accept(this, argu);
		return new X10Unassigned("exp", null);
	}

	/**
	 * f0 -> ConditionalOrExpression() f1 -> [ ConditionalExpressionRest() ]
	 */
	public X10Type visit(ConditionalExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "?" f1 -> Expression() f2 -> ":" f3 -> Expression()
	 */
	public X10Type visit(ConditionalExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ConditionalAndExpression() f1 -> ( ConditionalOrExpressionRest() )*
	 */
	public X10Type visit(ConditionalOrExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "||" f1 -> ConditionalAndExpression()
	 */
	public X10Type visit(ConditionalOrExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> InclusiveOrExpression() f1 -> ( ConditionalAndExpressionRest() )*
	 */
	public X10Type visit(ConditionalAndExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "&&" f1 -> InclusiveOrExpression()
	 */
	public X10Type visit(ConditionalAndExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ExclusiveOrExpression() f1 -> ( InclusiveOrExpressionRest() )*
	 */
	public X10Type visit(InclusiveOrExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "|" f1 -> ExclusiveOrExpression()
	 */
	public X10Type visit(InclusiveOrExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> AndExpression() f1 -> ( ExclusiveOrExpressionRest() )*
	 */
	public X10Type visit(ExclusiveOrExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "^" f1 -> AndExpression()
	 */
	public X10Type visit(ExclusiveOrExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> EqualityExpression() f1 -> ( AndExpressionRest() )*
	 */
	public X10Type visit(AndExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "&" f1 -> EqualityExpression()
	 */
	public X10Type visit(AndExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> RelationalExpression() f1 -> ( EqualityExpressionRest() )*
	 */
	public X10Type visit(EqualityExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> EqualsExpression() | NonEqualsExpression()
	 */
	public X10Type visit(EqualityExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "==" f1 -> RelationalExpression()
	 */
	public X10Type visit(EqualsExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "!=" f1 -> RelationalExpression()
	 */
	public X10Type visit(NonEqualsExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ShiftExpression() f1 -> [ RelationalExpressionRest() ]
	 */
	public X10Type visit(RelationalExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> LessThanExpression() | GreaterThanExpression() |
	 * LessThanEqualExpression() | GreaterThanEqualExpression()
	 */
	public X10Type visit(RelationalExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "<" f1 -> ShiftExpression()
	 */
	public X10Type visit(LessThanExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">" f1 -> ShiftExpression()
	 */
	public X10Type visit(GreaterThanExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "<=" f1 -> ShiftExpression()
	 */
	public X10Type visit(LessThanEqualExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">=" f1 -> ShiftExpression()
	 */
	public X10Type visit(GreaterThanEqualExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> AdditiveExpression() f1 -> ( ShiftExpressionRest() )*
	 */
	public X10Type visit(ShiftExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ShiftLeftExpression() | ShiftRightExpression() |
	 * ShiftRightUnsignedExpression()
	 */
	public X10Type visit(ShiftExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "<<" f1 -> AdditiveExpression()
	 */
	public X10Type visit(ShiftLeftExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">>" f1 -> AdditiveExpression()
	 */
	public X10Type visit(ShiftRightExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ">>>" f1 -> AdditiveExpression()
	 */
	public X10Type visit(ShiftRightUnsignedExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> MultiplicativeExpression() f1 -> ( AdditiveExpressionRest() )*
	 */
	public X10Type visit(AdditiveExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PlusExpression() | MinusExpression()
	 */
	public X10Type visit(AdditiveExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "+"
	 * f1 -> "["
	 * f2 -> ExpressionList()
	 * f3 -> "]"
	 */
	public X10Type visit(PlusOffset n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "+" f1 -> MultiplicativeExpression()
	 */
	public X10Type visit(PlusExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "-" f1 -> MultiplicativeExpression()
	 */
	public X10Type visit(MinusExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> MapExpression() f1 -> ( MultiplicativeExpressionRest() )*
	 */
	public X10Type visit(MultiplicativeExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> TimesExpression() | DivideExpression() | ModulusExpression()
	 */
	public X10Type visit(MultiplicativeExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "*" f1 -> MapExpression()
	 */
	public X10Type visit(TimesExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "/" f1 -> MapExpression()
	 */
	public X10Type visit(DivideExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "%" f1 -> MapExpression()
	 */
	public X10Type visit(ModulusExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> RegionExpression() f1 -> [ MapExpressionRest() ]
	 */
	public X10Type visit(MapExpression n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "->" f1 -> UnaryExpression()
	 */
	public X10Type visit(MapExpressionRest n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> RegionConstant()
	 *       | UnaryExpression()
	 */
	public X10Type visit(RegionExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "["
	 * f1 -> ColonExpression()
	 * f2 -> ( ColonRest() )*
	 * f3 -> "]"
	 */
	public X10Type visit(RegionConstant n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ","
	 * f1 -> ColonExpression()
	 */
	public X10Type visit(ColonRest n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ColonPair()
	 *       | Expression()
	 */
	public X10Type visit(ColonExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Expression()
	 * f1 -> ":"
	 * f2 -> Expression()
	 */
	public X10Type visit(ColonPair n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> SinExpression()
	 *       | CosExpression()
	 *       | PowExpression()
	 *       | ExpExpression()
	 *       | SqrtExpression()
	 *       | AbsExpression()
	 *       | MinExpression()
	 *       | MaxExpression()
	 *       | LogExpression()
	 */
	public X10Type visit(MathExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "sin"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(SinExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "cos"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(CosExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "pow"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ","
	 * f6 -> Expression()
	 * f7 -> ")"
	 */
	public X10Type visit(PowExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "exp"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(ExpExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "sqrt"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(SqrtExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "abs"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(AbsExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "min"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ","
	 * f6 -> Expression()
	 * f7 -> ")"
	 */
	public X10Type visit(MinExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "max"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ","
	 * f6 -> Expression()
	 * f7 -> ")"
	 */
	public X10Type visit(MaxExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "log"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(LogExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> UnaryPlusExpression()
	 *       | UnaryMinusExpression()
	 *       | ComplimentExpression()
	 *       | NotExpression()
	 *       | CoercionToIntExpression()
	 *       | CoercionToDoubleExpression()
	 *       | TypeAnnotatedExpression()
	 *       | PostfixExpression()
	 */
	public X10Type visit(UnaryExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "+"
	 * f1 -> PrimaryExpression()
	 */
	public X10Type visit(UnaryPlusExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "-"
	 * f1 -> PrimaryExpression()
	 */
	public X10Type visit(UnaryMinusExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "++"
	 * f1 -> PrimaryExpression()
	 */
	public X10Type visit(PreIncrementExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "--"
	 * f1 -> PrimaryExpression()
	 */
	public X10Type visit(PreDecrementExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "~"
	 * f1 -> UnaryExpression()
	 */
	public X10Type visit(ComplimentExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "!"
	 * f1 -> UnaryExpression()
	 */
	public X10Type visit(NotExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "long"
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(CoercionToLongExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "short"
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(CoercionToShortExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "byte"
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(CoercionToByteExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}


	/**
	 * f0 -> "("
	 * f1 -> "int"
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(CoercionToIntExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "double"
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(CoercionToDoubleExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> TypeAnnotation()
	 * f2 -> ")"
	 * f3 -> UnaryExpression()
	 */
	public X10Type visit(TypeAnnotatedExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> UpdatableArrayType()
	 *       | ValueArrayType()
	 *       | DistType()
	 *       | RegionType()
	 *       | PointType()
	 */
	public X10Type visit(TypeAnnotation n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PostIncrementExpression()
	 *       | PostDecrementExpression()
	 *       | PrimaryExpression()
	 *       | Places()
	 *       | FactoryBlock()
	 *       | FactoryEmptyRegion()
	 *       | FactoryPoint()
	 */
	public X10Type visit(PostfixExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PrimaryExpression()
	 * f1 -> "++"
	 */
	public X10Type visit(PostIncrementExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PrimaryExpression()
	 * f1 -> "--"
	 */
	public X10Type visit(PostDecrementExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PrimaryPrefix()
	 * f1 -> ( PrimarySuffix() )*
	 */
	public X10Type visit(PrimaryExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Literal()
	 *       | MathExpression()
	 *       | This()
	 *       | ExpressionInParentheses()
	 *       | AllocationExpression()
	 *       | Identifier()
	 */
	public X10Type visit(PrimaryPrefix n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "this"
	 */
	public X10Type visit(This n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place.places"
	 * f1 -> "("
	 * f2 -> Expression()
	 * f3 -> ")"
	 */
	public X10Type visit(Place n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> Expression()
	 * f2 -> ")"
	 */
	public X10Type visit(ExpressionInParentheses n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "dist.factory.block"
	 * f1 -> "("
	 * f2 -> Expression()
	 * f3 -> ")"
	 */
	public X10Type visit(FactoryBlock n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}



	/**
	 * f0 -> "dist.factory.blockCyclic"
	 * f1 -> "("
	 * f2 -> Expression()
	 * f3 -> ","
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public X10Type visit(FactoryBlockCyclic n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}


	/**
	 * f0 -> "region.factory.emptyRegion"
	 * f1 -> "("
	 * f2 -> IntegerLiteral()
	 * f3 -> ")"
	 */
	public X10Type visit(FactoryEmptyRegion n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "System.currentTimeMillis"
	 * f1 -> "("
	 * f2 -> ")"
	 */
	public X10Type visit(CurrentTime n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ArrayAccess()
	 *       | Arguments()
	 *       | DotDistribution()
	 *       | DotRegion()
	 *       | DotId()
	 *       | DotGet()
	 *       | DotContains()
	 *       | DotEquals()
	 *       | DotHigh()
	 *       | DotLow()
	 *       | DotRank()
	 *       | DotNext()
	 *       | DotPrev()
	 *       | DotIsFirst()
	 *       | DotIsLast()
	 *       | DotMax()
	 *       | DotSum()
	 *       | DotSize()
	 *       | DotIdentifier()
	 *       | DotMethodCall()
	 */
	public X10Type visit(PrimarySuffix n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "["
	 * f1 -> ArgumentList()
	 * f2 -> "]"
	 */
	public X10Type visit(ArrayAccess n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return _ret;
	}

	

	/**
	 * f0 -> "."
	 * f1 -> "distribution"
	 */
	public X10Type visit(DotDistribution n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "region"
	 */
	public X10Type visit(DotRegion n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "id"
	 */
	public X10Type visit(DotId n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "get"
	 * f2 -> "("
	 * f3 -> ArgumentList()
	 * f4 -> ")"
	 */
	public X10Type visit(DotGet n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "contains"
	 * f2 -> "("
	 * f3 -> "["
	 * f4 -> ExpressionList()
	 * f5 -> "]"
	 * f6 -> ")"
	 */
	public X10Type visit(DotContainsPoint n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "contains"
	 * f2 -> "("
	 * f3 -> Expression()
	 * f4 -> ")"
	 */
	public X10Type visit(DotContains n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "equals"
	 * f2 -> "("
	 * f3 -> Expression()
	 * f4 -> ")"
	 */
	public X10Type visit(DotEquals n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "high"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotHigh n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "low"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotLow n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "rank"
	 * f2 -> "("
	 * f3 -> Expression()
	 * f4 -> ")"
	 */
	public X10Type visit(DotRank n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "next"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotNext n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "prev"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotPrev n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "isFirst"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotIsFirst n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "isLast"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotIsLast n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "coord"
	 * f2 -> "("
	 * f3 -> Expression()
	 * f4 -> ")"
	 * f5 -> "["
	 * f6 -> Expression()
	 * f7 -> "]"
	 */
	public X10Type visit(DotCoord n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "ordinal"
	 * f2 -> "("
	 * f3 -> "["
	 * f4 -> ExpressionList()
	 * f5 -> "]"
	 * f6 -> ")"
	 */
	public X10Type visit(DotOrdinalPoint n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "ordinal"
	 * f2 -> "("
	 * f3 -> Expression()
	 * f4 -> ")"
	 */
	public X10Type visit(DotOrdinal n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}	

	/**
	 * f0 -> "."
	 * f1 -> "max"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotMax n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "sum"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotSum n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> "size"
	 * f2 -> "("
	 * f3 -> ")"
	 */
	public X10Type visit(DotSize n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "."
	 * f1 -> Identifier()
	 */
	public X10Type visit(DotIdentifier n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}
	 /**
	    * f0 -> "."
	    * f1 -> MethodCall()
	*/
  public X10Type visit(DotMethodCall n, X10Type argu) {
 	 X10Type _ret = null;
 	  n.f0.accept(this, argu);
	  n.f1.accept(this, argu);
	  return _ret;
   }
  
  /**
   * f0 -> Identifier()
   * f1 -> "("
   * f2 -> ( ExpressionList() )?
   * f3 -> ")"
   */
  public X10Type visit(MethodCall n, X10Type argu) {
     X10Type _ret = null;
 	 n.f0.accept(this, argu);
     n.f1.accept(this, argu);
     n.f2.accept(this, argu);
     n.f3.accept(this, argu);
     return _ret;
  }
	/**
	 * f0 -> NewObject()
	 *       | NewValueArray()
	 *       | NewUpdatableArray()
	 */
	public X10Type visit(AllocationExpression n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "new"
	 * f1 -> Identifier()
	 * f2 -> "("
	 * f3 -> [ ArgumentList() ]
	 * f4 -> ")"
	 */
	public X10Type visit(NewObject n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "new"
	 * f1 -> NonArrayType()
	 * f2 -> "value"
	 * f3 -> "["
	 * f4 -> Identifier()
	 * f5 -> "]"
	 * f6 -> ArrayInitializer()
	 */
	public X10Type visit(NewValueArray n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "new"
	 * f1 -> NonArrayType()
	 * f2 -> "["
	 * f3 -> Identifier()
	 * f4 -> "]"
	 * f5 -> [ ArrayInitializer() ]
	 */
	public X10Type visit(NewUpdatableArray n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> IntegerLiteral()
	 *       | HexLiteral()
	 *       | FloatingPointLiteral()
	 *       | CharacterLiteral()
	 *       | StringLteral()
	 *       | True()
	 *       | False()
	 *       | HereLiteral()
	 *       | PlaceFirstPlace()
	 *       | PlaceLastPlace()
	 *       | PlaceMaxPlaces()
	 *       | DistUnique()
	 *       | JavaIntegerSize()
	 */
	public X10Type visit(Literal n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> <INTEGER_LITERAL>
	 */
	public X10Type visit(IntegerLiteral n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> <HEX_LITERAL>
	 */
	public X10Type visit(HexLiteral n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> <FLOATING_POINT_LITERAL>
	 */
	public X10Type visit(FloatingPointLiteral n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}


	/**
	 * f0 -> <STRING_LITERAL>
	 */
	public X10Type visit(StringLiteral n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "true"
	 */
	public X10Type visit(True n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "false"
	 */
	public X10Type visit(False n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "here"
	 */
	public X10Type visit(HereLiteral n, X10Type argu) {
		X10Type _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place.FIRST_PLACE"
	 */
	public X10Type visit(PlaceFirstPlace n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place.LAST_PLACE"
	 */
	public X10Type visit(PlaceLastPlace n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place.MAX_PLACES"
	 */
	public X10Type visit(PlaceMaxPlaces n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "dist.UNIQUE"
	 */
	public X10Type visit(DistUnique n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "java.lang.Integer.SIZE"
	 */
	public X10Type visit(JavaIntegerSize n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Expression()
	 * f1 -> ( ArgumentRest() )*
	 */
	public X10Type visit(ExpressionList n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> ","
	 * f1 -> Expression()
	 */
	public X10Type visit(ArgumentRest n, X10Type argu) {
		X10Type _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "(" f1 -> PointType() f2 -> ExplodedSpecification() f3 -> ")" f4 ->
	 * Block()
	 */
	public X10Type visit(ArrayInitializer n, X10Type argu) {
		X10Type _ret = null;
		n.f0.accept(this, argu);
		X10Point pt = (X10Point)n.f1.accept(this, argu);
		ptRank = pt.rank;		
		int temp = currentBlock;
		currentBlock = blockId+1;
		currentMethod.blockMap.put(currentBlock, parentBlock);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		currentBlock = temp;
		BlockScope tempCurr = currentScope;
		BlockScope tempOuter = outerScope;
		currentScope = outerScope = BlockScope.ARRAYINIT;
		boolean tempRet = isReturn;
		isReturn = false;
		n.f4.accept(this, argu);
		if(!isReturn)
			PlasmaException.throwException("Return statement expected for array initializer in method " + currentClass.className 
					+ currentMethod.methodSignature.getCompleteMethodSignature(), true);
		isReturn = tempRet;
		currentScope = tempCurr;
		outerScope = tempOuter;
		return _ret;
	}

}
