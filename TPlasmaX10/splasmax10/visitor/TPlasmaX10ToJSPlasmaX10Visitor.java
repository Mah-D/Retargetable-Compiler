package splasmax10.visitor;

import splasmax10.syntaxtree.*;

import java.util.*;

import libParser.LibMethodsSplasma;
import libParser.ParseMainLibFile;

import util.exception.PlasmaException;
import util.symboltable.Symbol.SymIndex;
import util.symboltable.SymbolTableMethodEntry.MethodSignature;
import util.symboltable.*;
import util.types.*;

public class TPlasmaX10ToJSPlasmaX10Visitor extends GJDepthFirst<Snippet,Snippet> {

	public SymbolTableClassEntry currentClass;
	public SymbolTableMethodEntry currentMethod;
	private MethodSignature memberSig;
	private String currentClassName;

	public ClassStructure currentClassBody;
	//where you add all your methods. 

	public HashMap<String, ClassStructure> classes;

	public HashMap<String, SymbolTableClassEntry> classSymbolTable;

	private ArrayList<String> identifierList;

	private int tempCounter;
	private int tempZero = 0;

	private int currentBlock;
	private int blockId;
	private int blockDepth;

	public String tPlasmaCode;
	public String fieldsCode ="";
	private String programClassName;

	public TPlasmaX10ToJSPlasmaX10Visitor(HashMap<String, SymbolTableClassEntry> classSymbolTable, boolean options[])
	{
		this.classSymbolTable = classSymbolTable;
		this.tPlasmaCode = "";
		this.classes = new LinkedHashMap<String, ClassStructure>(0);
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
				return lookupVariableInScope(identifier, currentMethod.blockMap.get(scopeId));
			}
		}
	}

	private Symbol getIdentifier(String identifier, int scopeId, String className)
	{
		if(!className.equals(currentClassName)) scopeId = 0;
		Symbol sym = lookupVariableInScope(identifier, scopeId);
		if(sym==null)
		{
			SymbolTableClassEntry stce = classSymbolTable.get(className);
			SymIndex symId = new SymIndex(identifier,0);
			if (stce.fields.containsKey(symId)) {
				sym = stce.fields.get(symId);
			}
			//else
			//{
			//	util.exception.PlasmaException.throwException("Variable " + identifier + " not found in class " + className + " at scope " + scopeId + ". Dying in shame and inglory...:((", true);
			//}
		}
		return sym;
	}

	private String generateTemp()
	{
		return Constants.tempVar+tempCounter++;
	}

	private String generateTabs(int numTabs)
	{
		String tabStr = "";
		for(int i=0; i<=numTabs; i++)
		{
			tabStr += "	";
		}
		return tabStr;
	}

	public Snippet visit(NodeList n, Snippet argu) {
		Snippet _ret=null;
		int _count=0;
		for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
			e.nextElement().accept(this,argu);
			_count++;
		}
		return _ret;
	}

	public Snippet visit(NodeListOptional n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		if ( n.present() ) {
			
			int _count=0;
			for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
				Snippet temp = e.nextElement().accept(this,argu);
				_count++;
				if(temp != null){
				_ret.returnTemp+=temp.returnTemp;
				}
			}
			
		}
		else
			return null;
		return null;
	}

	public Snippet visit(NodeOptional n, Snippet argu) {
		if ( n.present() )
			return n.node.accept(this,argu);
		else
			return null;
	}

	public Snippet visit(NodeSequence n, Snippet argu) {
		Snippet _ret=null;
		int _count=0;
		for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
			e.nextElement().accept(this,argu);
			_count++;
		}
		return _ret;
	}

	public Snippet visit(NodeToken n, Snippet argu) { 
		if (n.beginLine == -1 || n.beginColumn == -1)
		{

			System.err.println("Line number or token number is not set for token " + n.tokenImage);
		}
		else
		{
			PlasmaException.currColumn = n.beginColumn;
			PlasmaException.currLine = n.beginLine;
		}
		return new Snippet("", n.tokenImage, new X10Unassigned(n.tokenImage, null), false);
	}

	//
	// User-generated visitor methods below
	//

	/**
	 * f0 -> MainClass()
	 * f1 -> ProgramClass()
	 * f2 -> ( TopLevelDeclaration() )*
	 * f3 -> <EOF>
	 */
	public Snippet visit(File n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);

		System.out.println(classes.get("intRefArray1"));
		System.out.println(classes.get("doubleRefArray1"));
		System.out.println(classes.get("MR"));
		System.out.println(classes.get("Timer"));
		System.out.println(classes.get("Region1"));
		System.out.println(classes.get("Point1"));
		//System.out.println(classes.get("Dist"));
		System.out.println(classes.get("Dist1"));
		System.out.println(classes.get("RunMain"));
		
		System.out.println(classes.get("Program"));
		//System.out.println(classes.get(""));
		ParseMainLibFile pmlf = new ParseMainLibFile("/net/nauru/one/home/aitnoren/Desktop/x10Lib/RunMain.x10");
		pmlf.starParsing();
		//System.out.println(pmlf.toString());
		
		LibMethodsSplasma lms = new LibMethodsSplasma(pmlf.getHashMapTempletedMethods());
		
		System.out.println(lms.generateOnlyOnceAllMethods());
		System.out.println(lms.getAllMethodsDups("int"));
		System.out.println(lms.getAllMethodsDups("double"));
		
		//System.out.println(classes.get("IntegerArray"));
		//System.out.println(classes.get("IntegerStub"));
		//System.out.println(classes.get("Dist"));
		
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> "class"
	 * f2 -> Identifier()
	 * f3 -> "{"
	 * f4 -> "public"
	 * f5 -> "static"
	 * f6 -> "void"
	 * f7 -> "main"
	 * f8 -> "("
	 * f9 -> "String"
	 * f10 -> "["
	 * f11 -> "]"
	 * f12 -> Identifier()
	 * f13 -> ")"
	 * f14 -> "{"
	 * f15 -> Identifier()
	 * f16 -> "."
	 * f17 -> Identifier()
	 * f18 -> "("
	 * f19 -> ")"
	 * f20 -> ";"
	 * f21 -> "}"
	 * f22 -> "}"
	 */
	public Snippet visit(MainClass n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		currentClassName = n.f2.accept(this, argu).expType.getTypeName();
		currentClassBody = new ClassStructure("public class " + currentClassName);
		currentClass = classSymbolTable.get(currentClassName);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		String methodName = n.f7.accept(this, argu).expType.getTypeName();
		currentMethod = currentClass.methods.get(methodName);
		n.f8.accept(this, argu);
		n.f9.accept(this, argu);
		n.f10.accept(this, argu);
		n.f11.accept(this, argu);
		String args = n.f12.accept(this, argu).expType.getTypeName();
		n.f13.accept(this, argu);
		blockId = 0;
		currentBlock = 0;

		n.f14.accept(this, argu);
		String programClassName = n.f15.accept(this, argu).expType.getTypeName();
		n.f16.accept(this, argu);
		String programClassRunMethod = n.f17.accept(this, argu).expType.getTypeName();

		n.f18.accept(this, argu);
		n.f19.accept(this, argu);
		n.f20.accept(this, argu);
		n.f21.accept(this, argu);
		n.f22.accept(this, argu);

		tPlasmaCode = generateTabs(0) + "public static void main(String[] " + args + ") {\n";
		tPlasmaCode += generateTabs(1) + programClassName + "." + programClassRunMethod + "()" + ";\n";
		tPlasmaCode += generateTabs(0) + "}\n";

		currentClassBody.methods = tPlasmaCode;
		classes.put(currentClassName, currentClassBody);
		currentClass = null;

		return _ret;
	}

	/**
	 * f0 -> "class"
	 * f1 -> Identifier()
	 * f2 -> "{"
	 * f3 -> ( ConstantDeclaration() )*
	 * f4 -> ( MethodDeclaration() )*
	 * f5 -> "}"
	 */
	public Snippet visit(ProgramClass n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		n.f0.accept(this, argu);
		currentClassName = n.f1.accept(this, argu).expType.getTypeName();
		currentClass = classSymbolTable.get(currentClassName);
		programClassName = currentClassName;
		currentClassBody = new ClassStructure("class "+currentClassName+"  ");
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		String tempConstantDeclaration = "";
		String methodDeclaration = "";
		if(f3 != null){
			tempConstantDeclaration = f3.returnTemp;
		}
		if(f4!=null){
			methodDeclaration = f4.returnTemp;
		}
		//null and set to code
		_ret.returnTemp = generateTabs(0) +"class "+currentClassName+"  "+generateTabs(1) +tempConstantDeclaration+"\n"+methodDeclaration+generateTabs(0) +"\n";
		//tPlasmaCode += _ret.returnTemp;
		
	
		currentClassBody.methods +="\n";
		classes.put(currentClassName, currentClassBody);
		currentClass = null;
		return _ret;
	}

	/**
	 * f0 -> ClassDeclaration()
	 *       | ValueDeclaration()
	 */
	public Snippet visit(TopLevelDeclaration n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "class"
	 * f1 -> Identifier()
	 * f2 -> "{"
	 * f3 -> ( InitializableConstantDeclaration() )*
	 * f4 -> ( UpdatableFieldDeclaration() )*
	 * f5 -> ( ConstructorDeclaration() )*
	 * f6 -> "}"
	 */
	public Snippet visit(ClassDeclaration n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		n.f0.accept(this, argu);
		currentClassName = n.f1.accept(this, argu).expType.getTypeName();
		currentClass = classSymbolTable.get(currentClassName);
		n.f2.accept(this, argu);
		currentClassBody = new ClassStructure(generateTabs(0) +"class "+currentClassName+"  ");
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		//_ret.returnTemp = "class "+currentClassName+"  "+f3.returnTemp+"\n"+f4.returnTemp+"\n"+f5+"\n";
		currentClassBody.methods +="\n";
		classes.put(currentClassName, currentClassBody);
		currentClass = null;
		
		return _ret;
	}

	/**
	 * f0 -> "value"
	 * f1 -> Identifier()
	 * f2 -> "{"
	 * f3 -> ( InitializableConstantDeclaration() )*
	 * f4 -> ( ConstructorDeclaration() )*
	 * f5 -> "}"+
	 */
	public Snippet visit(ValueDeclaration n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		n.f0.accept(this, argu);
		currentClassName = n.f1.accept(this, argu).expType.getTypeName();
		currentClass = classSymbolTable.get(currentClassName);
		currentClassBody = new ClassStructure(generateTabs(0) +"value "+currentClassName+" \n"+generateTabs(0));
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		String tempInitConstDecl = "";
		String tempConstDecl = "";
		if(f3 != null){
			tempInitConstDecl = f3.returnTemp;
			
		}if(f4!=null){
			tempConstDecl = f4.returnTemp;
			
		} 
		_ret.returnTemp = "value "+currentClassName+" \n"+ tempInitConstDecl+" "+tempConstDecl+"\n";
		currentClassBody.methods+= generateTabs(0)+"";
		classes.put(currentClassName, currentClassBody);
		currentClass = null;
		
		
		
		
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> Identifier()
	 * f2 -> "("
	 * f3 -> ( FormalParameterList() )?
	 * f4 -> ")"
	 * f5 -> Block()
	 */
	public Snippet visit(ConstructorDeclaration n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);
		n.f0.accept(this, argu);
		tPlasmaCode="";
		String constructorName = n.f1.accept(this, argu).expType.getTypeName();
		memberSig = new MethodSignature();
		memberSig.methodName = constructorName;

		tempCounter = tempZero;
		n.f2.accept(this, argu);
		blockId = 1;
		currentBlock = 1;
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		blockId = 0;
		currentBlock = 0;

		currentMethod = currentClass.constructors.get(memberSig.getCompleteMethodSignature());
		
		memberSig = null;

		
		String tempFormalParamList = "";
		if(f3!=null){
			tempFormalParamList += f3.returnTemp;
		}
		//f5 is added in tPlasmaCode
		_ret.returnTemp = generateTabs(0)+"public "+constructorName+" ( "+tempFormalParamList+")\n";//+f5.returnTemp;
		
		tPlasmaCode += _ret.returnTemp;
		Snippet f5 = n.f5.accept(this, argu);
		currentClassBody.constructors += tPlasmaCode;
		tPlasmaCode="";
		
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> "static"
	 * f2 -> "final"
	 * f3 -> Type()
	 * f4 -> Identifier()
	 * f5 -> "="
	 * f6 -> MethodCall()
	 * f7 -> ";"
	 */
	public Snippet visit(ConstantDeclaration n, Snippet argu) {
		Snippet _ret= new Snippet("","public static final ",null, false);
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		
		_ret.returnTemp += f3.returnTemp+" "+f4.returnTemp+" = "+f6.returnTemp+";\n";
		currentClassBody.constants += _ret.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> "final"
	 * f2 -> Type()
	 * f3 -> Identifier()
	 * f4 -> ";"
	 */
	public Snippet visit(InitializableConstantDeclaration n, Snippet argu) {
		
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		
		
		Snippet _ret= new Snippet("","public final ",null,false);
		n.f0.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		 n.f4.accept(this, argu);
		_ret.returnTemp += f2.expType.getTypeName()+" "+f3.returnTemp+";";
		tPlasmaCode="";
		//tPlasmaCode += 
		currentClassBody.initConstants+=generateTabs(0)+"public final " + f2.expType.getTypeName()+" "+f3.returnTemp+";\n";;
		tPlasmaCode="";
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> Type()
	 * f2 -> Identifier()
	 * f3 -> ";"
	 */
	public Snippet visit(UpdatableFieldDeclaration n, Snippet argu) {
		Snippet _ret= new Snippet("","public ",null,false);
		n.f0.accept(this, argu);
		tPlasmaCode="";
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		 n.f3.accept(this, argu);
		_ret.returnTemp += f1.returnTemp+" "+f2.returnTemp+";";
		String temp = generateTabs(0)+"public " + f1.expType.getTypeName()+" "+f2.returnTemp+";\n";
		currentClassBody.fields+=temp;
		tPlasmaCode="";
		return _ret;
	}

	/**
	 * f0 -> "public"
	 * f1 -> "static"
	 * f2 -> ReturnType()
	 * f3 -> Identifier()
	 * f4 -> "("
	 * f5 -> ( FormalParameterList() )?
	 * f6 -> ")"
	 * f7 -> Block()
	 */
	public Snippet visit(MethodDeclaration n, Snippet argu) {
		Snippet _ret=null;
		tPlasmaCode = "";
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		String tempString = "";
		if(f2 != null){
			//System.out.println(" "+f2.expType+" "+f2.returnTemp);
			tempString = f2.expType.typeName;
		}else{
			tempString = "void ";
		}
		String methodName = n.f3.accept(this, argu).expType.getTypeName();
		memberSig = new MethodSignature();
		memberSig.methodName = methodName;
		currentMethod = currentClass.methods.get(methodName);
		
		
		tempCounter = tempZero;
		blockId = 1;
		currentBlock = 1;
		n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		memberSig = null;
		blockId = 0;
		currentBlock = 0;
		
		String tempFormal = "";
		if(f5 != null){
			tempFormal = f5.returnTemp;
		}else{
			tempFormal = "";
		}
		
		tempString+=" "+methodName+" "+"( "+tempFormal+")";
		
		tPlasmaCode += "public static "+tempString;
		n.f7.accept(this, argu);
		currentClassBody.methods += tPlasmaCode;
		tPlasmaCode = "";
		return _ret;
	}

	/**
	 * f0 -> FinalFormalParameter()
	 * f1 -> ( FormalParameterRest() )*
	 */
	public Snippet visit(FormalParameterList n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		
		fieldsCode = "";
		Snippet f1 = n.f1.accept(this, argu);
			_ret.returnTemp = f0.returnTemp+fieldsCode;	
			fieldsCode = "";
		
		return _ret;
	}

	/**
	 * f0 -> "final"
	 * f1 -> Type()
	 * f2 -> Identifier()
	 */
	public Snippet visit(FinalFormalParameter n, Snippet argu) {
		Snippet _ret=new Snippet("","", null, false);
		//Snippet f0 = n.f0.accept(this, argu);
		Snippet type = n.f1.accept(this, argu);
		Snippet f1 = n.f2.accept(this, argu);
		//memberSig.formalParameters.add(type.expType);
		_ret.returnTemp = "final "+type.expType.getTypeName()+" "+f1.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> ","
	 * f1 -> FinalFormalParameter()
	 */
	public Snippet visit(FormalParameterRest n, Snippet argu) {
		//Snippet _ret= null;
		n.f0.accept(this, argu);
		Snippet _ret = n.f1.accept(this, argu);
		_ret.returnTemp = ", "+_ret.returnTemp;
		fieldsCode += _ret.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> VoidType()
	 *       | Type()
	 */
	public Snippet visit(ReturnType n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "void"
	 */
	public Snippet visit(VoidType n, Snippet argu) {
		//need to set type to Void?
		Snippet _ret= new Snippet("","",null,false);
		_ret.returnTemp = "void";
		_ret.expType = new X10Void();
			n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> UpdatableArrayType()
	 *       | ValueArrayType()
	 *       | NonArrayType()
	 */
	public Snippet visit(Type n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> NonArrayType()
	 * f1 -> "["
	 * f2 -> ":"
	 * f3 -> RankEquation()
	 * f4 -> "]"
	 */
	public Snippet visit(UpdatableArrayType n, Snippet argu) {
		Snippet _ret= new Snippet("","",null, false);
		Snippet f0 = n.f0.accept(this, argu);
		_ret.expType = new X10ReferenceArray(1,f0.expType);
		//_ret.expType.typeName = f0.expType.typeName;
		
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		//_ret.returnTemp = _ret.expType.typeName+" [:"+f3.returnTemp+"]";
		_ret.returnTemp = _ret.expType.typeName.toUpperCase()+"Array";
		return _ret;
	}

	/**
	 * f0 -> NonArrayType()
	 * f1 -> "value"
	 * f2 -> "["
	 * f3 -> ":"
	 * f4 -> RankEquation()
	 * f5 -> "]"
	 */
	public Snippet visit(ValueArrayType n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		_ret.expType = new X10ValueArray(1, f0.expType);
		Snippet f4 = n.f4.accept(this, argu);
		//_ret.expType.typeName = _ret.expType.typeName+" value[:"+f4.returnTemp+"]";
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		
		n.f5.accept(this, argu);
		_ret.returnTemp = _ret.expType.typeName+" value[:"+f4.returnTemp+"]";
		return _ret;
	}

	/**
	 * f0 -> "rank==1"
	 */
	public Snippet visit(RankEquation n, Snippet argu) {
		Snippet _ret= new Snippet("","rank==1", null,false);
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> BooleanType()
	 *       | ByteType()
	 *       | ShortType()
	 *       | IntegerType()
	 *       | LongType()
	 *       | DoubleType()
	 *       | StringType()
	 *       | PlaceType()
	 *       | DistType()
	 *       | RegionType()
	 *       | PointType()
	 *       | ClassNameType()
	 */
	public Snippet visit(NonArrayType n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType.typeName = _ret.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "boolean"
	 */
	public Snippet visit(BooleanType n, Snippet argu) {
		Snippet _ret= new Snippet("","boolean",new X10Boolean(), false);
		_ret.expType = new X10Boolean();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "byte"
	 */
	public Snippet visit(ByteType n, Snippet argu) {
		Snippet _ret= new Snippet("","byte",new X10Byte(), false);
		_ret.expType = new X10Byte();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "short"
	 */
	public Snippet visit(ShortType n, Snippet argu) {
		Snippet _ret= new Snippet("","short",new X10SShort(), false);
		_ret.expType = new X10SShort();
		//_ret = n.f0.accept(this, argu);
		//_ret.returnTemp = _ret.returnTemp+" -> \"short\""; 
		return _ret;
	}

	/**
	 * f0 -> "int"
	 */
	public Snippet visit(IntegerType n, Snippet argu) {
		Snippet _ret= new Snippet("","int",new X10Integer(), false);
		_ret.expType = new X10Integer();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "long"
	 */
	public Snippet visit(LongType n, Snippet argu) {
		Snippet _ret= new Snippet("","long",new X10Long(), false);
		_ret.expType = new X10Long();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "double"
	 */
	public Snippet visit(DoubleType n, Snippet argu) {
		Snippet _ret= new Snippet("","double",new X10Double(), false);
		_ret.expType = new X10Double();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "String"
	 */
	public Snippet visit(StringType n, Snippet argu) {
		Snippet _ret= new Snippet("","String",new X10String(), false);
		_ret.expType = new X10String();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place"
	 */
	public Snippet visit(PlaceType n, Snippet argu) {
		Snippet _ret= new Snippet("","place",new X10Place(), false);
		_ret.expType = new X10Place();
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "dist"
	 * f1 -> "("
	 * f2 -> ":"
	 * f3 -> RankEquation()
	 * f4 -> ")"
	 */
	public Snippet visit(DistType n, Snippet argu) {
		Snippet _ret=new Snippet("","", null ,false);
		_ret.expType = new X10Distribution(1);
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		//_ret.returnTemp = "dist(:"+f3.returnTemp+")";
		_ret.returnTemp = "Dist";
		return _ret;
	}

	/**
	 * f0 -> "region"
	 * f1 -> "("
	 * f2 -> ":"
	 * f3 -> RankEquation()
	 * f4 -> ")"
	 */
	public Snippet visit(RegionType n, Snippet argu) {
		Snippet _ret= new Snippet("", "region", null ,false);
		_ret.expType = new X10Region(1);
		
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		_ret.returnTemp = "region(:"+f3.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "point"
	 * f1 -> "("
	 * f2 -> ":"
	 * f3 -> RankEquation()
	 * f4 -> ")"
	 */
	public Snippet visit(PointType n, Snippet argu) {
		Snippet _ret=new Snippet("","TODO",null,false);
		_ret.expType = new X10Point(1);
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		_ret.returnTemp = "point(:"+f3.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 */
	public Snippet visit(ClassNameType n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> <IDENTIFIER>
	 */
	public Snippet visit(Identifier n, Snippet argu) {
		Snippet _ret=new Snippet("", n.f0.tokenImage, null, false);
		//_ret.expType.typeName = 
		_ret = n.f0.accept(this, argu);
		
		return _ret;
	}

	/**
	 * f0 -> "{"
	 * f1 -> ( Statement() )*
	 * f2 -> "}"
	 */
	public Snippet visit(Block n, Snippet argu) {
		Snippet _ret= new Snippet("","", null, false);
		Snippet f0 = n.f0.accept(this, argu);

		int temp = currentBlock;
		currentBlock = ++blockId;
		
		blockDepth++;
		tPlasmaCode += generateTabs(blockDepth)+"{\n";
		Snippet f1 = n.f1.accept(this, argu);
		if(f1 != null){
			tPlasmaCode += f1.returnTemp;
		}
		tPlasmaCode+= generateTabs(blockDepth)+"}\n";
		blockDepth--;
		currentBlock = temp;
		Snippet f2 = n.f2.accept(this, argu);
		//_ret.returnTemp = "{ \n "+f1.returnTemp+" \n }";
		return _ret;
	}

	/**
	 * f0 -> AddLocalOpsStatement()
	 *       | Assignment()
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
	public Snippet visit(Statement n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "x10.lang.perf.addLocalOps"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> ";"
	 */
	public Snippet visit(AddLocalOpsStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		//_ret.returnTemp = f0.returnTemp+f1.returnTemp+f2.returnTemp+f3.returnTemp+f4.returnTemp;
		//tPlasmaCode+="x10.lang.perf.addLocalOps("+f2.returnTemp+");";
		_ret.returnTemp+=generateTabs(blockDepth)+"x10.lang.perf.addLocalOps("+f2.returnTemp+");";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "="
	 * f2 -> Expression()
	 * f3 -> ";"
	 */
	public Snippet visit(Assignment n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+f1.returnTemp+f2.returnTemp;
		tPlasmaCode+= f2.preface+"\n";
		tPlasmaCode+=_ret.returnTemp+";\n";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "["
	 * f2 -> IdentifierList()
	 * f3 -> "]"
	 * f4 -> "="
	 * f5 -> "("
	 * f6 -> Identifier()
	 * f7 -> ")"
	 * f8 -> ";"
	 */
	public Snippet visit(ArrayAssignment n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		Snippet f7 = n.f7.accept(this, argu);
		Snippet f8 = n.f8.accept(this, argu);
		String arrayIDToSetValue = f0.returnTemp;
		String valueToChangeToo = f6.returnTemp;
		String place = "";
		Symbol sym = getIdentifier(f0.returnTemp, currentBlock, currentClassName);
		X10ReferenceArray arr = (X10ReferenceArray)sym.symbolType;
		
		String temp = generateTabs(blockDepth)+programClassName+"."+ arr.arrayElementType.typeName.toUpperCase()  +"SetValue"+"("+arrayIDToSetValue+","+ identifierList.get(0)+","+valueToChangeToo+");";
		_ret.returnTemp = temp;
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "="
	 * f4 -> "("
	 * f5 -> Identifier()
	 * f6 -> ")"
	 * f7 -> ";"
	 */
	public Snippet visit(FieldAssignment n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		Snippet f7 = n.f7.accept(this, argu);
		
		_ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+"."+f2.returnTemp+" = ("+f5.returnTemp+")"+";";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "this"
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "="
	 * f4 -> "("
	 * f5 -> Identifier()
	 * f6 -> ")"
	 * f7 -> ";"
	 */
	public Snippet visit(ThisFieldAssignment n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		Snippet f7 = n.f7.accept(this, argu);
		
		_ret.returnTemp = generateTabs(blockDepth)+"this."+f2.returnTemp+" = ("+f5.returnTemp+");\n";
		tPlasmaCode+= _ret.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "async"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> Block()
	 */
	public Snippet visit(AsyncStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "async", null, false);
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		tPlasmaCode += generateTabs(blockDepth)+"async("+f2.returnTemp+")";
		n.f4.accept(this, argu);
		
		return _ret;
	}

	/**
	 * f0 -> "break"
	 * f1 -> ";"
	 */
	public Snippet visit(BreakStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = "break"+";";
		tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "continue"
	 * f1 -> ";"
	 */
	public Snippet visit(ContinueStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = "continue;";
		tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "do"
	 * f1 -> Block()
	 * f2 -> "while"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 * f6 -> ";"
	 */
	public Snippet visit(DoStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		tPlasmaCode+=generateTabs(blockDepth)+"do ";
		Snippet f1 = n.f1.accept(this, argu);
		
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		//_ret.returnTemp = "do"+f1.returnTemp+"\n while("+f4.returnTemp+");";
		tPlasmaCode+=generateTabs(blockDepth)+"\n while("+f4.returnTemp+");";
		return _ret;
	}

	/**
	 * f0 -> "finish"
	 * f1 -> Block()
	 */
	public Snippet visit(FinishStatement n, Snippet argu) {
		Snippet _ret=null;
		tPlasmaCode+=generateTabs(blockDepth)+"finish ";
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		
		//_ret.returnTemp = "finish "+f1.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "if"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> Block()
	 * f5 -> [ ElseClause() ]
	 */
	public Snippet visit(IfStatement n, Snippet argu) {
		Snippet _ret=new Snippet("","",null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		
		_ret.returnTemp = generateTabs(blockDepth)+"if("+f2.returnTemp+")\n";
		tPlasmaCode+=_ret.returnTemp;
		//+f4.returnTemp+
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		if(f5!=null){
		tPlasmaCode+=f5.returnTemp;
		}
		return _ret;
	}

	/**
	 * f0 -> "else"
	 * f1 -> Block()
	 */
	public Snippet visit(ElseClause n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		n.f0.accept(this, argu);
		
		_ret.returnTemp = " ";//+f1.returnTemp;
		tPlasmaCode+=generateTabs(blockDepth)+"else"+"\n";
		Snippet f1 = n.f1.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "for"
	 * f1 -> "("
	 * f2 -> PointType()
	 * f3 -> ExplodedSpecification()
	 * f4 -> ":"
	 * f5 -> Identifier()
	 * f6 -> ")"
	 * f7 -> Block()
	 */
	public Snippet visit(LoopStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);;
		Snippet f0 = n.f0.accept(this, argu);

		int temp = currentBlock;
		currentBlock = ++blockId;

		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		
		
		currentBlock = temp;
		_ret.returnTemp = generateTabs(blockDepth)+"for("+f2.returnTemp+f3.returnTemp+" : "+f5.returnTemp+")";//+f7.returnTemp;
		tPlasmaCode+=_ret.returnTemp+"\n";
		Snippet f7 = n.f7.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> PointName()
	 *       | Coordinates()
	 */
	public Snippet visit(ExplodedSpecification n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 */
	public Snippet visit(PointName n, Snippet argu) {
		
		Snippet _ret = new Snippet("", "", null, true);
		Snippet f0 = n.f0.accept(this, argu);
		return f0;
	}

	/**
	 * f0 -> "["
	 * f1 -> Identifier()
	 * f2 -> "]"
	 */
	public Snippet visit(Coordinates n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		String f0 = "[";
		Snippet f1 = n.f1.accept(this, argu);
		String f2 = "]";
		_ret.returnTemp = f0+f1.returnTemp+f2;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> ( IdentifierRest() )*
	 */
	public Snippet visit(IdentifierList n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		fieldsCode = "";
		identifierList.add(f0.returnTemp);
		Snippet f1= n.f1.accept(this, argu);
		_ret.returnTemp= f0.returnTemp+fieldsCode;
		fieldsCode = "";
		return _ret;
	}

	/**
	 * f0 -> ","
	 * f1 -> Identifier()
	 */
	public Snippet visit(IdentifierRest n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		_ret = n.f1.accept(this, argu);
		identifierList.add(_ret.returnTemp);
		fieldsCode +=  ","+ _ret.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> MethodCall()
	 * f1 -> ";"
	 */
	public Snippet visit(MethodCallStatement n, Snippet argu) {
		Snippet _ret= new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = f0.returnTemp + ";";
		tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> MethodCallInConstructor()
	 * f1 -> ";"
	 */
	public Snippet visit(MethodCallStatementInConstructor n, Snippet argu) {
		Snippet _ret= new Snippet("", "", null, false);;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = f0.returnTemp + ";";
		tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "System.out.println"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> ";"
	 */
	public Snippet visit(PrintlnStatement n, Snippet argu) {
		Snippet _ret= new Snippet("","",null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+"System.out.println("+f2.returnTemp+");";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "System.out.print"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> ";"
	 */
	public Snippet visit(PrintStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+"System.out.print("+f2.returnTemp+");";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "System.err.println"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> ";"
	 */
	public Snippet visit(PrintErrorStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+"System.err.println("+f2.returnTemp+");";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "return"
	 * f1 -> [ Identifier() ]
	 * f2 -> ";"
	 */
	public Snippet visit(ReturnStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		if(f1 == null){
		_ret.returnTemp ="return"+";"; 
		}else{
		_ret.returnTemp = "return "+f1.returnTemp+";";
		}
		tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "switch"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> "{"
	 * f5 -> ( SwitchEntry() )*
	 * f6 -> "}"
	 */
	public Snippet visit(SwitchStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+"switch("+f1.returnTemp+f2.returnTemp+"){\n"+f5.returnTemp+"\n}";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
		
	}

	/**
	 * f0 -> SwitchLabel()
	 * f1 -> ":"
	 * f2 -> Block()
	 */
	public Snippet visit(SwitchEntry n, Snippet argu) {
		Snippet _ret=null;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);

		int temp = currentBlock; 
		currentBlock = ++blockId;

		

		currentBlock = temp;
		_ret.returnTemp = f0.returnTemp+":";
		tPlasmaCode += generateTabs(blockDepth)+ _ret.returnTemp;
		//f2.returnTemp;
		Snippet f2 = n.f2.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> Case()
	 *       | Default()
	 */
	public Snippet visit(SwitchLabel n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "case"
	 * f1 -> Identifier()
	 */
	public Snippet visit(Case n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = "case "+f1.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "default"
	 */
	public Snippet visit(Default n, Snippet argu) {
		Snippet _ret=new Snippet("","default", null,false);
		n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "throw"
	 * f1 -> "new"
	 * f2 -> "RuntimeException"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 * f6 -> ";"
	 */
	public Snippet visit(ThrowStatement n, Snippet argu) {
		Snippet _ret = new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		_ret.returnTemp = "throw "+"new"+" RuntimeException("+f4.returnTemp+");\n";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> "while"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 * f4 -> Block()
	 */
	public Snippet visit(WhileStatement n, Snippet argu) {
		Snippet _ret= new Snippet("", "", null, false);;;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
	
		
		_ret.returnTemp = generateTabs(blockDepth)+"while("+f2.returnTemp+")";//f4.returnTemp;
		tPlasmaCode+=_ret.returnTemp+"\n";
		Snippet f4 = n.f4.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "final"
	 * f1 -> Type()
	 * f2 -> Identifier()
	 * f3 -> "="
	 * f4 -> Expression()
	 * f5 -> ";"
	 */
	public Snippet visit(FinalVariableDeclaration n, Snippet argu) {
		Snippet _ret= new Snippet("", "", null, false);
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		//System.out.println(f1+" "+f2+" "+f4);
		_ret.returnTemp = generateTabs(blockDepth)+"final "+f1.expType.getTypeName()+" "+f2.returnTemp+" = "+f4.returnTemp+";";
		tPlasmaCode += f4.preface+"\n";
		tPlasmaCode += _ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> Type()
	 * f1 -> Identifier()
	 * f2 -> "="
	 * f3 -> Expression()
	 * f4 -> ";"
	 */
	public Snippet visit(UpdatableVariableDeclaration n, Snippet argu) {
		Snippet _ret= new Snippet("", "", null, false);;;
		Snippet f0 = n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		_ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+" "+f1.returnTemp+" = "+f3.returnTemp+";";
		tPlasmaCode+= f3.preface+"\n";
		tPlasmaCode+=_ret.returnTemp+"\n";
		return _ret;
	}

	/**
	 * f0 -> ExpressionInParentheses()
	 *       | ConditionalOrExpression()
	 *       | DistributionExpression()
	 *       | DistributionUnionExpression()
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
	 *       | RegionConstant()
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
	 *       | TypeAnnotatedExpression()
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
	 *       | DotIdentifierDotRegionDotSize()
	 *       | DotIdentifier()
	 *       | NewObject()
	 *       | NewValueArray()
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
	public Snippet visit(Expression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> Expression()
	 * f2 -> ")"
	 */
	public Snippet visit(ExpressionInParentheses n, Snippet argu) {
		Snippet _ret = new Snippet("","",null,false);
		n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		
		if(f1 == null){
			_ret.returnTemp="()\n";
		}
		else{
			_ret.returnTemp="("+f1.returnTemp+")";
		}
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "||"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ConditionalOrExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" || "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "->"
	 * f2 -> Identifier()
	 */
	//createDist
	public Snippet visit(DistributionExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		//_ret.returnTemp = f0.returnTemp+" -> "+f2.returnTemp;
		_ret.returnTemp = "new Dist("+f0.returnTemp+","+f2.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "||"
	 * f2 -> "("
	 * f3 -> "["
	 * f4 -> Identifier()
	 * f5 -> ":"
	 * f6 -> Identifier()
	 * f7 -> "]"
	 * f8 -> "->"
	 * f9 -> Identifier()
	 * f10 -> ")"
	 */
	//extenddist
	//final Dist d1, final int x, final int y, final place pl
	public Snippet visit(DistributionUnionExpression n, Snippet argu) {
		Snippet _ret=new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		n.f8.accept(this, argu);
		Snippet f9 = n.f9.accept(this, argu);
		n.f10.accept(this, argu);
		_ret.returnTemp = "new Dist("+f0.returnTemp+","+f4.returnTemp+","+f6.returnTemp+","+f9.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "&&"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ConditionalAndExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" && "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "|"
	 * f2 -> Identifier()
	 */
	public Snippet visit(InclusiveOrExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" | "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "^"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ExclusiveOrExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" ^ "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "&"
	 * f2 -> Identifier()
	 */
	public Snippet visit(AndExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" & "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "=="
	 * f2 -> Identifier()
	 */
	public Snippet visit(EqualsExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" == "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "!="
	 * f2 -> Identifier()
	 */
	public Snippet visit(NonEqualsExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" != "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "<"
	 * f2 -> Identifier()
	 */
	public Snippet visit(LessThanExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" < "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> ">"
	 * f2 -> Identifier()
	 */
	public Snippet visit(GreaterThanExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" > "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "<="
	 * f2 -> Identifier()
	 */
	public Snippet visit(LessThanEqualExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" <= "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> ">="
	 * f2 -> Identifier()
	 */
	public Snippet visit(GreaterThanEqualExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" >= "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "<<"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ShiftLeftExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" << "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> ">>"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ShiftRightExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" >> "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> ">>>"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ShiftRightUnsignedExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" >>> "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "+"
	 * f2 -> Identifier()
	 */
	public Snippet visit(PlusExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" + "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "-"
	 * f2 -> Identifier()
	 */
	public Snippet visit(MinusExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" - "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "*"
	 * f2 -> Identifier()
	 */
	public Snippet visit(TimesExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" * "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "/"
	 * f2 -> Identifier()
	 */
	public Snippet visit(DivideExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" / "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "%"
	 * f2 -> Identifier()
	 */
	public Snippet visit(ModulusExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);
		Snippet f0 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 = n.f2.accept(this, argu);
		_ret.returnTemp = f0.returnTemp+" % "+f2.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "["
	 * f1 -> "0 :"
	 * f2 -> Identifier()
	 * f3 -> "]"
	 */
	public Snippet visit(RegionConstant n, Snippet argu) {
		Snippet _ret= new Snippet("","",null, false);
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		Snippet f2 =  n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		_ret.returnTemp = "[0:"+f2.returnTemp+"]";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "sin"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(SinExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.sin("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "cos"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(CosExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.cos("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "pow"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ","
	 * f6 -> Identifier()
	 * f7 -> ")"
	 */
	public Snippet visit(PowExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		_ret.returnTemp = "Math.pow("+f4.returnTemp+", "+f6.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "exp"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(ExpExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.exp("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "sqrt"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(SqrtExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.sqrt("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "abs"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(AbsExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.abs("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "min"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ","
	 * f6 -> Identifier()
	 * f7 -> ")"
	 */
	public Snippet visit(MinExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		_ret.returnTemp = "Math.min("+f4.returnTemp+", "+f6.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "max"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ","
	 * f6 -> Identifier()
	 * f7 -> ")"
	 */
	public Snippet visit(MaxExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		Snippet f6 = n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		_ret.returnTemp = "Math.max("+f4.returnTemp+", "+f6.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "Math"
	 * f1 -> "."
	 * f2 -> "log"
	 * f3 -> "("
	 * f4 -> Identifier()
	 * f5 -> ")"
	 */
	public Snippet visit(LogExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		Snippet f4 = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		_ret.returnTemp = "Math.log("+f4.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> "~"
	 * f1 -> Identifier()
	 */
	public Snippet visit(ComplimentExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = "~ "+f1.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "!"
	 * f1 -> Identifier()
	 */
	public Snippet visit(NotExpression n, Snippet argu) {
		Snippet _ret= new Snippet("","",null,false);;
		n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		_ret.returnTemp = "! "+f1.returnTemp;
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "int"
	 * f2 -> ")"
	 * f3 -> Expression()
	 */
	public Snippet visit(CoercionToIntExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		_ret.returnTemp = "(" + "int" + ")" + _ret.returnTemp;
		_ret.expType = new X10Integer();
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "double"
	 * f2 -> ")"
	 * f3 -> Expression()
	 */
	public Snippet visit(CoercionToDoubleExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		_ret.returnTemp = "(" + "double" + ")" + _ret.returnTemp;
		_ret.expType = new X10Double();
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "long"
	 * f2 -> ")"
	 * f3 -> Expression()
	 */
	public Snippet visit(CoercionToLongExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		_ret.returnTemp = "(" + "long" + ")" + _ret.returnTemp;
		_ret.expType = new X10Long();
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "short"
	 * f2 -> ")"
	 * f3 -> Expression()
	 */
	public Snippet visit(CoercionToShortExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		_ret.returnTemp = "(" + "short" + ")" + _ret.returnTemp;
		_ret.expType = new X10SShort();
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> "byte"
	 * f2 -> ")"
	 * f3 -> Expression()
	 */
	public Snippet visit(CoercionToByteExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		_ret = n.f3.accept(this, argu);
		_ret.returnTemp = "(" + "byte" + ")" + _ret.returnTemp;
		_ret.expType = new X10Byte();
		return _ret;
	}
	/**
	 * f0 -> "("
	 * f1 -> TypeAnnotation()
	 * f2 -> ")"
	 * f3 -> "("
	 * f4 -> Expression()
	 * f5 -> ")"
	 */
	public Snippet visit(TypeAnnotatedExpression n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		Snippet type = n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		_ret = n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		if(type.expType instanceof X10Region || type.expType instanceof X10ValueArray || type.expType instanceof X10Point)
		{
			_ret.returnTemp = "(" + type.expType.getTypeName() + ")(" + _ret.returnTemp+")";
			
		}
		_ret.expType = type.expType;
		return _ret;
	}

	/**
	 * f0 -> UpdatableArrayType()
	 *       | ValueArrayType()
	 *       | DistType()
	 *       | RegionType()
	 *       | PointType()
	 */
	public Snippet visit(TypeAnnotation n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		return _ret;
	}

	/**
	 * f0 -> "place.places"
	 * f1 -> "("
	 * f2 -> Identifier()
	 * f3 -> ")"
	 */
	public Snippet visit(Place n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		_ret = n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		return new Snippet("", "place.places("+ _ret.returnTemp +")", new X10Place(), false);
	}

	/**
	 * f0 -> "System.currentTimeMillis"
	 * f1 -> "("
	 * f2 -> ")"
	 */
	public Snippet visit(CurrentTime n, Snippet argu) {
		n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return new Snippet("", "System.currentTimeMillis()", new X10Long(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "["
	 * f2 -> Identifier()
	 * f3 -> "]"
	 */
	public Snippet visit(ArrayAccess n, Snippet argu) {
		String arrayName = n.f0.accept(this, argu).returnTemp;
		Symbol sym = getIdentifier(arrayName, currentBlock, currentClassName);
		n.f1.accept(this, argu);
		String index = n.f2.accept(this, argu).returnTemp;
		n.f3.accept(this, argu);
		if(sym.symbolType instanceof X10ValueArray)
			return new Snippet("", arrayName+"["+index+"]", ((X10ValueArray)sym.symbolType).arrayElementType, false);
		else
			return new Snippet("", programClassName + "." + getArrayGetValueMethod(((X10ReferenceArray)sym.symbolType).arrayElementType) +"("+arrayName + ", " + index+")", ((X10ReferenceArray)sym.symbolType).arrayElementType, false);
	}

	private String getArrayGetValueMethod(X10Type arrayElementType) {
		//do what i planned to with the hash map form the parser
		return arrayElementType.getTypeName().toUpperCase()+"GetValue";
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "("
	 * f4 -> ( IdentifierList() )?
	 * f5 -> ")"
	 */
	public Snippet visit(MethodCall n, Snippet argu) {
		String className = n.f0.accept(this, argu).expType.getTypeName();
		n.f1.accept(this, argu);
		String methodName = n.f2.accept(this, argu).expType.getTypeName();
		n.f3.accept(this, argu);
		this.identifierList = new ArrayList<String>(0);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);

		SymbolTableClassEntry stce = classSymbolTable.get(className);
		SymbolTableMethodEntry stme = stce.methods.get(methodName);
		Snippet retExp = new Snippet("", "", stme.returnType, false);
		retExp.returnTemp = className + "." + methodName + "(";
		int i = 0;
		for(String str : identifierList)
		{
			if(i==0)
				retExp.returnTemp += str;
			else
				retExp.returnTemp += ", " + str;
			i++;
		}
		retExp.returnTemp += ")";
		return retExp;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "("
	 * f4 -> "this"
	 * f5 -> ( IdentifierRest() )*
	 * f6 -> ")"
	 */
	public Snippet visit(MethodCallInConstructor n, Snippet argu) {
		String className = n.f0.accept(this, argu).expType.getTypeName();
		n.f1.accept(this, argu);
		String methodName = n.f2.accept(this, argu).expType.getTypeName();
		this.identifierList = new ArrayList<String>(0);
		identifierList.add("this");
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);

		SymbolTableClassEntry stce = classSymbolTable.get(className);
		SymbolTableMethodEntry stme = stce.methods.get(methodName);
		Snippet retExp = new Snippet("", "", stme.returnType, false);
		retExp.returnTemp = className + "." + methodName + "(";
		int i = 0;
		for(String str : identifierList)
		{
			if(i==0)
				retExp.returnTemp += str;
			else
				retExp.returnTemp += ", " + str;
			i++;
		}
		retExp.returnTemp += ")";
		return retExp;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> "id"
	 */
	public Snippet visit(DotId n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		return new Snippet("",_ret.returnTemp + ".id", new X10Integer(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "."
	 * f4 -> "get"
	 * f5 -> "("
	 * f6 -> IdentifierList()
	 * f7 -> ")"
	 */
	public Snippet visit(DotIdentifierDotGet n, Snippet argu) {
		Snippet _ret=new Snippet("", "", new X10Place(), false);
		String Distn = n.f0.accept(this, argu).returnTemp;
		n.f1.accept(this, argu);
		String Dist = n.f2.accept(this, argu).returnTemp;
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		this.identifierList = new ArrayList<String>(0);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		String distName = generateTemp();
		_ret.preface = generateTabs(blockDepth) + "final" + " " + Constants.distribution + 
						" " + distName + " = " + Distn+"."+Dist+";\n";
		_ret.returnTemp = programClassName + "." + Constants.getPlaceFromDist + "(" + distName + ", " 
											+ this.identifierList.get(0) + ")";		
		return _ret;
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> "next"
	 * f3 -> "("
	 * f4 -> ")"
	 */
	public Snippet visit(DotNext n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return new Snippet("", _ret.returnTemp+".next()", new X10Place(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> "prev"
	 * f3 -> "("
	 * f4 -> ")"
	 */
	public Snippet visit(DotPrev n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return new Snippet("", _ret.returnTemp+".prev()", new X10Place(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> "isFirst"
	 * f3 -> "("
	 * f4 -> ")"
	 */
	public Snippet visit(DotIsFirst n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return new Snippet("", _ret.returnTemp+".isFirst()", new X10Boolean(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> "isLast"
	 * f3 -> "("
	 * f4 -> ")"
	 */
	public Snippet visit(DotIsLast n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		return new Snippet("", _ret.returnTemp+".isLast()", new X10Boolean(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 * f3 -> "."
	 * f4 -> "region"
	 * f5 -> "."
	 * f6 -> "size"
	 * f7 -> "("
	 * f8 -> ")"
	 */
	public Snippet visit(DotIdentifierDotRegionDotSize n, Snippet argu) {
		Snippet _ret1=null;
		Snippet _ret2=null;
		_ret1 = n.f0.accept(this, argu);
		n.f1.accept(this, argu);
		_ret2 = n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		n.f5.accept(this, argu);
		n.f6.accept(this, argu);
		n.f7.accept(this, argu);
		n.f8.accept(this, argu);
		return new Snippet("", _ret1.returnTemp+"."+_ret2.returnTemp+"."+"region"+"."+"size()", new X10Integer(), false);
	}

	/**
	 * f0 -> Identifier()
	 * f1 -> "."
	 * f2 -> Identifier()
	 */
	public Snippet visit(DotIdentifier n, Snippet argu) {
		String object = n.f0.accept(this, argu).expType.getTypeName();
		Symbol sym1 = getIdentifier(object, currentBlock, currentClassName);
		String refClass = "";
		if(sym1 == null)
			refClass = object; // Static reference
		else
			refClass = sym1.symbolType.getTypeName(); // Object reference
		n.f1.accept(this, argu);
		String identifier = n.f2.accept(this, argu).expType.getTypeName();
		Symbol sym2 = getIdentifier(identifier, 0, refClass); 
		return new Snippet("", object + "." + identifier, sym2.symbolType /* Not needed, but kept only as a cross check */, false);
	}

	/**
	 * f0 -> "new"
	 * f1 -> Identifier()
	 * f2 -> "("
	 * f3 -> [ IdentifierList() ]
	 * f4 -> ")"
	 */
	public Snippet visit(NewObject n, Snippet argu) {
		n.f0.accept(this, argu);
		String identifier = n.f1.accept(this, argu).returnTemp;
		n.f2.accept(this, argu);
		this.identifierList = new ArrayList<String>(0);
		n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		String ret = "new " + identifier + "(";
		int i = 0;
		for(String str : identifierList)
		{
			if(i==0)
				ret += str;
			else
				ret += ", " + str;
			i++;
		}
		ret += ")";
		return new Snippet("", ret, new X10Class(identifier), false);
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
	public Snippet visit(NewValueArray n, Snippet argu) {
		n.f0.accept(this, argu);
		Snippet elementType = n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		n.f3.accept(this, argu);
		String identifier = n.f4.accept(this, argu).returnTemp;
		n.f5.accept(this, argu);
		String arrayInit = n.f6.accept(this, argu).returnTemp;
		return new Snippet("", 
				"new" + " " + elementType.expType.getTypeName() + " " + "value" + "[" + identifier + "]" + arrayInit, 
				new X10ValueArray(1, elementType.expType), false);
	}

	/**
	 * f0 -> "new"
	 * f1 -> NonArrayType()
	 * f2 -> "["
	 * f3 -> Identifier()
	 * f4 -> "]"
	 * f5 -> [ ArrayInitializer() ]
	 */
	
	public Snippet visit(NewUpdatableArray n, Snippet argu) {
		Snippet _ret=new Snippet("","",null, false);
		n.f0.accept(this, argu);
		Snippet f1 = n.f1.accept(this, argu);
		n.f2.accept(this, argu);
		Snippet f3 = n.f3.accept(this, argu);
		n.f4.accept(this, argu);
		Snippet f5 = n.f5.accept(this, argu);
		_ret.returnTemp = "new "+f1.expType.typeName.toUpperCase()+"Array("+f3.returnTemp+")";
		return _ret;
	}

	/**
	 * f0 -> <INTEGER_LITERAL>
	 */
	public Snippet visit(IntegerLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Integer();
		return _ret;
	}

	/**
	 * f0 -> <LONG_LITERAL>
	 */
	public Snippet visit(LongLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Long();
		return _ret;
	}

	/**
	 * f0 -> <HEX_LITERAL>
	 */
	public Snippet visit(HexLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Integer();
		return _ret;
	}

	/**
	 * f0 -> <FLOATING_POINT_LITERAL>
	 */
	public Snippet visit(FloatingPointLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Double();
		return _ret;
	}

	/**
	 * f0 -> <STRING_LITERAL>
	 */
	public Snippet visit(StringLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10String();
		return _ret;
	}

	/**
	 * f0 -> "true"
	 */
	public Snippet visit(True n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Boolean();
		return _ret;
	}

	/**
	 * f0 -> "false"
	 */
	public Snippet visit(False n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Boolean();
		return _ret;
	}

	/**
	 * f0 -> "here"
	 */
	public Snippet visit(HereLiteral n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Place();
		return _ret;
	}

	/**
	 * f0 -> "place.FIRST_PLACE"
	 */
	public Snippet visit(PlaceFirstPlace n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Place();
		return _ret;
	}

	/**
	 * f0 -> "place.LAST_PLACE"
	 */
	public Snippet visit(PlaceLastPlace n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Place();
		return _ret;
	}

	/**
	 * f0 -> "place.MAX_PLACES"
	 */
	public Snippet visit(PlaceMaxPlaces n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Integer();
		return _ret;
	}

	/**
	 * f0 -> "java.lang.Integer.SIZE"
	 */
	public Snippet visit(JavaIntegerSize n, Snippet argu) {
		Snippet _ret=null;
		_ret = n.f0.accept(this, argu);
		_ret.expType = new X10Integer();
		return _ret;
	}

	/**
	 * f0 -> "("
	 * f1 -> PointType()
	 * f2 -> ExplodedSpecification()
	 * f3 -> ")"
	 * f4 -> Block()
	 */
	public Snippet visit(ArrayInitializer n, Snippet argu) {
		Snippet _ret=null;
		n.f0.accept(this, argu);
		int temp = currentBlock;
		currentBlock = blockId+1;
		n.f1.accept(this, argu);
		identifierList = new ArrayList<String>(0);
		Snippet expSpec = n.f2.accept(this, argu);
		String points = "";
		if(expSpec != null)
			points = expSpec.returnTemp;
		int i = 0;
		for(String str : identifierList)
		{
			if(i==0)
				points += "[" + str;
			else
				if(i==identifierList.size()-1)
					points += ", " + str + "]";
				else
					points += ", " + str;
			i++;
		}
		n.f3.accept(this, argu);
		currentBlock = temp;
		String tempCode = tPlasmaCode;
		tPlasmaCode = "";
		n.f4.accept(this, argu);
		_ret = new Snippet("", "(point(:rank==1)"+points+")"+tPlasmaCode, new X10Unassigned("", currentClassName), false);
		tPlasmaCode = tempCode;
		return _ret;
	}

}