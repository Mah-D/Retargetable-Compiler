package jplasmax10.visitor;


import java.util.*;

import jplasmax10.syntaxtree.*;

public class JPlasmaX10ToCPlasmaX10Visitor implements GJVoidVisitor<String> {

	
	private String currentClassName="";
	private String currentMethodName ="";
	
	private StringBuffer code = new StringBuffer(0);
	private StringBuffer hfile = new StringBuffer(0);
	private boolean insideConstructor;
	private String className;
	private HashMap<String,String> myMethodsForConstructors = new HashMap<String, String>();
	private ArrayList<String> myHFileStructs = new ArrayList<String>();
	private ArrayList<String> myMethodHFileStructs = new ArrayList<String>();
	private boolean addComma;
	private String passToMyConstructor;
	private int currentTemp=0;
	public HashMap<String, ArrayList<Integer>> myConstructorList = new HashMap<String, ArrayList<Integer>> ();
	private int totalParameters = 0;
	public HashMap<String, ClassObject> myClasses;
	private String currentAssignment;
	private ArrayList<String> itemsNeededToBeInitilized = new ArrayList<String>();
	private boolean nonePointerVarOnLeft = false;
	private int globalTemp = 0;
	private String switchLabel;
	//private boolean setDefault;
	private boolean setIf;
	private ArrayList<StringBuffer> sbSwitches = new ArrayList<StringBuffer>();
	private int counterGoto = 0;
	private int sizeOfSwitch;
	private boolean addThisToMethods;
	private boolean needsDefaultConstructor = false;
	private int tempNumber = 0;
	private String globalTempValue = null;
	
	
	private int generateTemps(){
		currentTemp++;
		return currentTemp;
	}
	
	public String generateCode() {
		return code.toString();
	}
	public String generateHCode(){
		return hfile.toString();
	}
	
	//
	// Auto class visitors--probably don't need to be overridden.
	//
	public void visit(NodeList n, String argu) {
		int _count = 0;
		for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
			e.nextElement().accept(this, argu);
			_count++;
		}
	}

	public void visit(NodeListOptional n, String argu) {
		if (n.present()) {
			int _count = 0;
			for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
				e.nextElement().accept(this, argu);
				_count++;
			}
		}
	}

	public void visit(NodeOptional n, String argu) {
		if ( n.present() )
		n.node.accept(this, argu);
	}

	public void visit(NodeSequence n, String argu) {
		int _count = 0;
		for (Enumeration<Node> e = n.elements(); e.hasMoreElements();) {
			e.nextElement().accept(this, argu);
			_count++;
		}
	}

	public void visit(NodeToken n, String argu) {
		code.append(n.tokenImage).append(" ");
	}

	//
	// User-generated visitor methods below
	//

	/**
	 * mainClass -> MainClass() programClass -> ProgramClass() nodeListOptional
	 * -> ( TopLevelDeclaration() )* nodeToken -> <EOF>
	 */
	public void visit(File n, String argu) {
	
		String tempList = "";
		tempList+="typedef unsigned char byte;\n";
		for(String temp : myHFileStructs){
			tempList += "typedef struct "+temp+" "+temp+";";
			tempList+="\n";
		}
		code.insert(0, "#include \"RunMain.h\"\n");
		code.insert(0, "#include <stdio.h>\n");
		code.insert(0, "#include <stdlib.h>\n");
		code.insert(0, "#include <sys/time.h>\n");
		code.insert(0, "#include <string.h>\n");
		code.insert(0, "#include <math.h>\n");
		hfile.insert(0, tempList);
		tempList = "";
		
		
		n.programClass.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.mainClass.accept(this, argu);
		n.nodeToken.accept(this, argu);
		for(String temp : myMethodHFileStructs){
			tempList += temp+";\n"; 
		}
		hfile.append(tempList);
		hfile.append(makeTimeH());
		code.append(makeTimeMethod());
	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "class" identifier -> Identifier()
	 * nodeToken2 -> "{" nodeToken3 -> "public" nodeToken4 -> "static"
	 * nodeToken5 -> "void" nodeToken6 -> "main" nodeToken7 -> "(" nodeToken8 ->
	 * "String" nodeToken9 -> "[" nodeToken10 -> "]" identifier1 -> Identifier()
	 * nodeToken11 -> ")" nodeToken12 -> "{" identifier2 -> Identifier()
	 * nodeToken13 -> "." identifier3 -> Identifier() nodeToken14 -> "("
	 * nodeToken15 -> ")" nodeToken16 -> ";" nodeToken17 -> "}" nodeToken18 ->
	 * "}"
	 */
	public void visit(MainClass n, String argu) {
		code.append("/*").append(" ");
		//n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		currentClassName = n.identifier.nodeToken.tokenImage;
		code.append("*/").append(" ");
		code.append("int ").append(" ");
		//n.nodeToken3.accept(this, argu);
		//n.nodeToken4.accept(this, argu);
		//n.nodeToken5.accept(this, argu);
		n.nodeToken6.accept(this, argu);
		n.nodeToken7.accept(this, argu);
		//code.append("int argc, char *argv[]").append(" ");
		//n.nodeToken8.accept(this, argu);
		//n.nodeToken9.accept(this, argu);
		//n.nodeToken10.accept(this, argu);
		code.append("/*TODO*/");
		//n.identifier1.accept(this, argu);
		n.nodeToken11.accept(this, argu);
		n.nodeToken12.accept(this, argu);
		//n.identifier2.accept(this, argu);
		//n.nodeToken13.accept(this, argu);
		for(String temp : itemsNeededToBeInitilized){
			code.append(temp);
		}
		n.identifier3.accept(this, argu);
		n.nodeToken14.accept(this, argu);
		n.nodeToken15.accept(this, argu);
		n.nodeToken16.accept(this, argu);
		code.append("\nreturn 0;\n");
		n.nodeToken17.accept(this, argu);
		//n.nodeToken18.accept(this, argu);
		code.append("\n");
	}

	/**
	 * nodeToken -> "class" identifier -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( ConstantDeclaration() )* nodeListOptional1 -> (
	 * StaticMethodDeclaration() )* nodeToken2 -> "}"
	 */
	public void visit(ProgramClass n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		currentClassName = n.identifier.nodeToken.tokenImage;
		code.append("*/").append(" \n");
		//n.nodeToken1.accept(this, argu);
		currentMethodName = n.identifier.nodeToken.tokenImage;
		n.nodeListOptional.accept(this, argu);
		
		n.nodeListOptional1.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		code.append("\n");
	}

	/**
	 * nodeChoice -> ClassDeclaration() | ValueDeclaration()
	 */
	public void visit(TopLevelDeclaration n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "class" identifier -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( UpdatableFieldDeclaration() )* nodeListOptional2
	 * -> ( ConstructorDeclaration() )* nodeListOptional3 -> (
	 * MethodDeclaration() )* nodeToken2 -> "}"
	 */
	public void visit(ClassDeclaration n, String argu) {
		globalTemp = 0;
		needsDefaultConstructor = false;
		StringBuffer temp = code;
		code = new StringBuffer(0);
		
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		code.append("*/").append(" ");
		
		currentClassName = n.identifier.nodeToken.tokenImage;
		
		code.append("typedef struct").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("\n");
		n.nodeListOptional.accept(this, argu);
		n.nodeListOptional1.accept(this, argu);
		
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		
		myHFileStructs.add(n.identifier.nodeToken.tokenImage);
		
		code.append(";").append(" \n");
		className = n.identifier.nodeToken.tokenImage;
		
		code.append("\n");
		hfile.append(code);
		code = temp;
		needsDefaultConstructor = true;
		n.nodeListOptional2.accept(this, argu);
		if(n.nodeListOptional2.size() == 0){
			code.append(className+" * "+className+"_"+className+"(struct "+className+" * " +className+"TEMP){return "+className+"TEMP;}\n");
			hfile.append(className + "* "+className+"_"+className+"(struct "+className+" * " +className+"TEMP);\n");
		}else if(needsDefaultConstructor){
			StringBuffer codeTemp = new StringBuffer(); 
			codeTemp.append(className+"* "+className+"_"+className+"_0(");
		    codeTemp.append("struct "+className+" *"+ className+"TEMP");		
			codeTemp.append("){return "+className+"TEMP;}\n");
			code.append(codeTemp);
		}
		needsDefaultConstructor = false;
		code.append("\n");
		addThisToMethods = true;
		n.nodeListOptional3.accept(this, argu);
		addThisToMethods = false;
	}

	/**
	 * nodeToken -> "value" identifier -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( InitializableConstantDeclaration() )*
	 * nodeListOptional1 -> ( ConstructorDeclaration() )* nodeListOptional2 -> (
	 * MethodDeclaration() )* nodeToken2 -> "}"
	 */
	public void visit(ValueDeclaration n, String argu) {
		//code.append("class").append(" ");
		globalTemp = 0;
		needsDefaultConstructor = false;
		StringBuffer temp = code;
		code = new StringBuffer(0);
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		
		code.append("*/").append(" ");
		
		code.append("typedef struct").append(" ");
		n.identifier.accept(this, argu);
		currentClassName = n.identifier.nodeToken.tokenImage;
		n.nodeToken1.accept(this, argu);
		code.append("\n");
		
		
		n.nodeListOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		className = n.identifier.nodeToken.tokenImage;
		myHFileStructs.add(n.identifier.nodeToken.tokenImage);
		code.append(";").append("\n ");
		
		code.append("\n");
		hfile.append(code);
		code = temp;
		n.nodeListOptional1.accept(this, argu);
		addThisToMethods = true;
		n.nodeListOptional2.accept(this, argu);
		addThisToMethods = false;
		//
	}

	/**
	 * nodeToken -> "public" identifier -> Identifier() nodeToken1 -> "("
	 * nodeOptional -> ( FormalParameterList() )? nodeToken2 -> ")" block ->
	 * Block()
	 */
	public void visit(ConstructorDeclaration n, String argu) {
		//n.nodeToken.accept(this, argu);
		
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		
		code.append("\n").append(className +" * ");
		code.append(className+"_");
		globalTemp++;
		
		if(myConstructorList.get(className).size() < 2){
		n.identifier.accept(this, argu);
		myMethodsForConstructors.put(n.identifier.nodeToken.tokenImage,className+"_"+n.identifier.nodeToken.tokenImage);
		currentMethodName = n.identifier.nodeToken.tokenImage+globalTemp;
		}else{
		code.append(className+"_"+myConstructorList.get(className).get(0));
		
		myMethodsForConstructors.put(n.identifier.nodeToken.tokenImage,className+"_"+n.identifier.nodeToken.tokenImage+"_"+myConstructorList.get(className).get(0));
		currentMethodName =n.identifier.nodeToken.tokenImage+globalTemp;
		//currentMethodName = n.identifier.nodeToken.tokenImage+"_"+myConstructorList.get(className).get(0);
		myConstructorList.get(className).add(myConstructorList.get(className).remove(0));
		}
		
		
		n.nodeToken1.accept(this, argu);
		
		code.append("struct "+className+" *"+ className+"TEMP");
		addComma = true;
		n.nodeOptional.accept(this, argu);
		if(n.nodeOptional.node == null){
			needsDefaultConstructor = false;
		}
		addComma = false;
		n.nodeToken2.accept(this, argu);
		insideConstructor = true;
		myMethodHFileStructs.add(code.toString());
		tempBuffer.append(code);
		code = tempBuffer;
		n.block.accept(this, argu);
		int x = code.lastIndexOf("}");
		
		code.insert(x,"\n return  "+className+"TEMP" +"; \n\n");
		
		insideConstructor = false;
		
	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "static" nodeToken2 -> "final" type
	 * -> Type() identifier -> Identifier() nodeToken3 -> "=" methodCall ->
	 * MethodCall() nodeToken4 -> ";"
	 */
	public void visit(ConstantDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		//code.append("const").append(" ");
		
		//code.append("*");
		
		if((n.type.nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType)){
			code.append("struct ");
			n.type.accept(this, argu);
			code.append("* ");
			
		}else{
			n.type.accept(this, argu);
		}
		n.identifier.accept(this, argu);
		code.append(";");
		StringBuffer temp = code;
		code = new StringBuffer();
		n.identifier.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.methodCall.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		itemsNeededToBeInitilized.add(code.toString()+"\n");
		code = temp;
		
		code.append("\n");

	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "final" type -> Type() identifier ->
	 * Identifier() nodeToken2 -> ";"
	 */
	public void visit(InitializableConstantDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		
	
		if((n.type.nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType)){
			code.append("struct ");
			n.type.accept(this, argu);
			code.append("* ");
			code.append(" /*const*/").append(" ");
		}else if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
		n.type.accept(this, argu);
		code.append(" /*const*/").append(" ");
		//code.append("* ");
		
	}else{
		n.type.accept(this, argu);	
		//code.append("* ");
		code.append(" /*const*/").append(" ");
		  
		
		
		}
		
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "public" type -> Type() identifier -> Identifier()
	 * nodeToken1 -> ";"
	 */
	public void visit(UpdatableFieldDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		
		if((n.type.nodeChoice.choice instanceof NonArrayType) && ((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType ){
			code.append("struct ");
			n.type.accept(this, argu);
			//code.append("* ");
			code.append("*");
		}else{
			n.type.accept(this, argu);
		}
		
		n.identifier.accept(this, argu);
		if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
			//code.append("[]");
		}
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "static" returnType -> ReturnType()
	 * identifier -> Identifier() nodeToken2 -> "(" nodeOptional -> (
	 * FormalParameterList() )? nodeToken3 -> ")" block -> Block()
	 */
	public void visit(StaticMethodDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		
		//n.nodeToken1.accept(this, argu);
		n.returnType.accept(this, argu);
		
		if((n.returnType.nodeChoice.choice instanceof Type) && (((Type)n.returnType.nodeChoice.choice).nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)((Type)n.returnType.nodeChoice.choice).nodeChoice.choice).nodeChoice.choice instanceof ClassNameType )){
			code.append(" * ");
		
		}
		currentMethodName = n.identifier.nodeToken.tokenImage;
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		
		
		myMethodHFileStructs.add(code.toString());
		tempBuffer.append(code);
		code = tempBuffer;
		
		n.block.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "public" returnType -> ReturnType() identifier ->
	 * Identifier() nodeToken1 -> "(" nodeOptional -> ( FormalParameterList() )?
	 * nodeToken2 -> ")" block -> Block()
	 */
	public void visit(MethodDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		
		n.returnType.accept(this, argu);
		if((n.returnType.nodeChoice.choice instanceof Type) && (((Type)n.returnType.nodeChoice.choice).nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)((Type)n.returnType.nodeChoice.choice).nodeChoice.choice).nodeChoice.choice instanceof ClassNameType )){
			code.append(" * ");
		
		}
		n.identifier.accept(this, argu);
		currentMethodName = n.identifier.nodeToken.tokenImage;
		n.nodeToken1.accept(this, argu);
		if(addThisToMethods){
			code.append("struct "+className+" *"+ className+"TEMP");
			addComma = true;
		}
		n.nodeOptional.accept(this, argu);
		addComma = false;
		n.nodeToken2.accept(this, argu);
		myMethodHFileStructs.add(code.toString());
		
		tempBuffer.append(code);
		
		code = tempBuffer;
		
		n.block.accept(this, argu);
		code.append("\n");
		

	}

	/**
	 * finalFormalParameter -> FinalFormalParameter() nodeListOptional -> (
	 * FormalParameterRest() )*
	 */
	public void visit(FormalParameterList n, String argu) {
		//totalParameters = 0;
		
		if(n.finalFormalParameter.identifier!=null && addComma){
			code.append(", ");
		}
			n.finalFormalParameter.accept(this, argu);
		n.nodeListOptional.accept(this, argu);

	}

	/**
	 * nodeToken -> "final" type -> Type() identifier -> Identifier()
	 */
	public void visit(FinalFormalParameter n, String argu) {

		//n.nodeToken.accept(this, argu);
		
		//System.out.println(n.identifier.nodeToken.tokenImage);
		
		if((n.type.nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType )){
			
			code.append(" struct").append(" ");
			n.type.accept(this, argu);
			code.append(" *").append(" ");
			code.append("const").append(" ");
		}else if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
			n.type.accept(this, argu);
			code.append("const").append(" ");
		}else{
			code.append("const").append(" ");
			n.type.accept(this, argu);
			
		}
		
		
		
		n.identifier.accept(this, argu);
		
		//code.append("\n");

	}

	/**
	 * nodeToken -> "," finalFormalParameter -> FinalFormalParameter()
	 */
	public void visit(FormalParameterRest n, String argu) {

		n.nodeToken.accept(this, argu);
		n.finalFormalParameter.accept(this, argu);

	}

	/**
	 * nodeChoice -> VoidType() | Type()
	 */
	public void visit(ReturnType n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "void"
	 */
	public void visit(VoidType n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeChoice -> UpdatableArrayType() | NonArrayType()
	 */
	public void visit(Type n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nonArrayType -> NonArrayType() nodeToken -> "[" nodeToken1 -> "]"
	 */
	public void visit(UpdatableArrayType n, String argu) {
		code.append("/*Updatable ARRAY*/ ");
		
		
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
		code.append("struct ");	
		n.nonArrayType.accept(this, argu);
		code.append("** ");
		}else{
			n.nonArrayType.accept(this, argu);
			code.append("* ");

		}
		
		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);

	}

	/**
	 * nodeChoice -> BooleanType() | ByteType() | ShortType() | IntegerType() |
	 * LongType() | DoubleType() | StringType() | PlaceType() | ClassNameType()
	 */
	public void visit(NonArrayType n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "boolean"
	 */
	public void visit(BooleanType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("int").append(" ");

	}

	/**
	 * nodeToken -> "byte"
	 */
	public void visit(ByteType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("char /**/");
	}

	/**
	 * nodeToken -> "short"
	 */
	public void visit(ShortType n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "int"
	 */
	public void visit(IntegerType n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "long"
	 */
	public void visit(LongType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("long long ");
	}

	/**
	 * nodeToken -> "double"
	 */
	public void visit(DoubleType n, String argu) {

		//code.append("double ");
		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "String"
	 */
	public void visit(StringType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("char * ");
	}

	/**
	 * nodeToken -> "place"
	 */
	public void visit(PlaceType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("int").append(" ");
	}

	/**
	 * identifier -> Identifier()
	 */
	public void visit(ClassNameType n, String argu) {

		n.identifier.accept(this, argu);
		
		
	}

	/**
	 * nodeToken -> <IDENTIFIER>
	 */
	public void visit(Identifier n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "{" nodeListOptional -> ( Statement() )* nodeToken1 -> "}"
	 */
	public void visit(Block n, String argu) {
		code.append("\n");
		n.nodeToken.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeChoice -> Assignment() | ArrayAssignment() | FieldAssignment() |
	 * ThisFieldAssignment() | AsyncStatement() | Block() | BreakStatement() |
	 * ContinueStatement() | DoStatement() | FinishStatement() | IfStatement() |
	 * LoopStatement() | MethodCallStatement() |
	 * MethodCallStatementInConstructor() | PrintlnStatement() |
	 * PrintStatement() | PrintErrorStatement() | ReturnStatement() |
	 * SwitchStatement() | ThrowStatement() | WhileStatement() |
	 * FinalVariableDeclaration() | UpdatableVariableDeclaration()
	 */
	public void visit(Statement n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "=" expression -> Expression()
	 * nodeToken1 -> ";"
	 */
	public void visit(Assignment n, String argu) {

		
		StringBuffer tempCode = code;
		code = new StringBuffer();
		
		
		currentAssignment = n.identifier.nodeToken.tokenImage;
		n.identifier.accept(this, argu);
		passToMyConstructor = n.identifier.nodeToken.tokenImage;
		n.nodeToken.accept(this, argu);
		
		
		StringBuffer codeTemp2 = code;
		code = new StringBuffer();
		
		
		
		
		n.expression.accept(this, argu);
		
		if(globalTempValue != null){
			
			codeTemp2.append(globalTempValue+";");
			code.append(codeTemp2);
			tempCode.append(code);
			code= tempCode;
		}else{
			codeTemp2.append(code);
			tempCode.append(codeTemp2);
			code = tempCode;
			n.nodeToken1.accept(this, argu);
		}
		globalTempValue = null;
		
		passToMyConstructor = "/*EMPTY*/";
		

	}

	/**
	 * identifier -> Identifier() nodeToken -> "[" identifierList ->
	 * IdentifierList() nodeToken1 -> "]" nodeToken2 -> "=" identifier1 ->
	 * Identifier() nodeToken3 -> ";"
	 */
	public void visit(ArrayAssignment n, String argu) {

		n.identifier.accept(this, argu);
		//code.append("* ");
		n.nodeToken.accept(this, argu);
		n.identifierList.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		PairsTypeName leftPTN = null;
		String left = n.identifier.nodeToken.tokenImage;
	
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
		}
		if(leftPTN != null && leftPTN.getType().equals("%c")){
			//took out for warning 1205 code.append("&");
		}
		
		n.identifier1.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." identifier1 -> Identifier()
	 * nodeToken1 -> "=" nodeToken2 -> "(" identifier2 -> Identifier()
	 * nodeToken3 -> ")" nodeToken4 -> ";"
	 */
	public void visit(FieldAssignment n, String argu) {
		
		String programTemp = n.identifier.nodeToken.tokenImage;
		if(programTemp.equals("Program")){
			code.append("/*program*/");
			n.identifier1.accept(this, argu);
		}else{
		n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		if(nonePointerVarOnLeft){
			code.append("*(");
			code.append("->");
			n.identifier1.accept(this, argu);
			code.append(")");
		}else{
			code.append("->");
			n.identifier1.accept(this, argu);
		}
		}
		
		//n.identifier.accept(this, argu);
		currentAssignment = n.identifier.nodeToken.tokenImage;
		//n.nodeToken.accept(this, argu);
		//n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		code.append("\n");

	}

	/**TODO
	 * nodeToken -> "this" nodeToken1 -> "." identifier -> Identifier()
	 * nodeToken2 -> "=" nodeToken3 -> "(" identifier1 -> Identifier()
	 * nodeToken4 -> ")" nodeToken5 -> ";"
	 */
	public void visit(ThisFieldAssignment n, String argu) {

		//Tn.nodeToken.accept(this, argu);
		//code.append("(*");
		code.append(className+"TEMP->");
		//Tcode.append(")");
		currentAssignment = n.identifier.nodeToken.tokenImage;
		//Tn.nodeToken1.accept(this, argu);
		
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "async" nodeToken1 -> "(" identifier -> Identifier()
	 * nodeToken2 -> ")" block -> Block()
	 */
	public void visit(AsyncStatement n, String argu) {

		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		n.block.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "break" nodeToken1 -> ";"
	 */
	public void visit(BreakStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "continue" nodeToken1 -> ";"
	 */
	public void visit(ContinueStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "do" block -> Block() nodeToken1 -> "while" nodeToken2 ->
	 * "(" identifier -> Identifier() nodeToken3 -> ")" nodeToken4 -> ";"
	 */
	public void visit(DoStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "finish" block -> Block()
	 */
	public void visit(FinishStatement n, String argu) {

		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		n.block.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "if" nodeToken1 -> "(" identifier -> Identifier() nodeToken2
	 * -> ")" block -> Block() nodeOptional -> [ ElseClause() ]
	 */
	public void visit(IfStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.block.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "else" block -> Block()
	 */
	public void visit(ElseClause n, String argu) {

		n.nodeToken.accept(this, argu);
		n.block.accept(this, argu);
		code.append("\n");

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
	public void visit(LoopStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
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
		code.append("\n");

	}

	/**
	 * identifier -> Identifier() nodeListOptional -> ( IdentifierRest() )*
	 */
	public void visit(IdentifierList n, String argu) {
		if(addComma){
			code.append(", ");
		}
		totalParameters =1;
		n.identifier.accept(this, argu);
		n.nodeListOptional.accept(this, argu);

	}

	/**
	 * nodeToken -> "," identifier -> Identifier()
	 */
	public void visit(IdentifierRest n, String argu) {
		totalParameters ++;
		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);

	}

	/**
	 * methodCall -> MethodCall() nodeToken -> ";"
	 */
	public void visit(MethodCallStatement n, String argu) {

		n.methodCall.accept(this, argu);
		n.nodeToken.accept(this, argu);
		code.append("\n");

	}

	/**
	 * methodCallInConstructor -> MethodCallInConstructor() nodeToken -> ";"
	 */
	public void visit(MethodCallStatementInConstructor n, String argu) {

		n.methodCallInConstructor.accept(this, argu);
		n.nodeToken.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "System.out.println" nodeToken1 -> "(" identifier ->
	 * Identifier() nodeToken2 -> ")" nodeToken3 -> ";"
	 */
	public void visit(PrintlnStatement n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("printf");
		n.nodeToken1.accept(this, argu);
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
		}/*else if(myClasses.get("Program").myFields.containsKey(left)){
			leftPTN = myClasses.get("Program").myFields.get(left);
		}*/
		code.append("\""+leftPTN.type+"\\n\",");
		n.identifier.accept(this, argu);
		
	
		n.nodeToken2.accept(this, argu);
		
		n.nodeToken3.accept(this, argu);
		code.append("\n");
		//code.append("printf(\" \\n\");");

	}

	/**
	 * nodeToken -> "System.out.print" nodeToken1 -> "(" identifier ->
	 * Identifier() nodeToken2 -> ")" nodeToken3 -> ";"
	 */
	public void visit(PrintStatement n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("printf");
		n.nodeToken1.accept(this, argu);
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
		}/*else if(myClasses.get("Program").myFields.containsKey(left)){
			leftPTN = myClasses.get("Program").myFields.get(left);
		}*/
		code.append("\""+leftPTN.type+"\",");
		n.identifier.accept(this, argu);
		
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append("\n");
		

	}

	/**
	 * nodeToken -> "System.err.println" nodeToken1 -> "(" identifier ->
	 * Identifier() nodeToken2 -> ")" nodeToken3 -> ";"
	 */
	public void visit(PrintErrorStatement n, String argu) {

		//n.nodeToken.accept(this, argu);
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
		}/*else if(myClasses.get("Program").myFields.containsKey(left)){
			leftPTN = myClasses.get("Program").myFields.get(left);
		}*/
		code.append("fprintf(stderr, \""+leftPTN.type+"\\n\" , ");
		//n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "return" nodeOptional -> [ Identifier() ] nodeToken1 -> ";"
	 */
	public void visit(ReturnStatement n, String argu) {

		n.nodeToken.accept(this, argu);
		n.nodeOptional.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**CHECK DEFUALT
	 * nodeToken -> "switch" nodeToken1 -> "(" identifier -> Identifier()
	 * nodeToken2 -> ")" nodeToken3 -> "{" nodeListOptional -> ( SwitchEntry()
	 * )* nodeToken4 -> "}"
	 */
	public void visit(SwitchStatement n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		  //n.identifier.accept(this, argu);
		code.append("/*SWITCH CASE*/while(1)");
		switchLabel = n.identifier.nodeToken.tokenImage; 
		//n.nodeToken2.accept(this, argu);
		code.append("\n");
		n.nodeToken3.accept(this, argu);
		code.append("\n");
		setIf = true;
		sizeOfSwitch = n.nodeListOptional.size();
		n.nodeListOptional.accept(this, argu);
		
		sizeOfSwitch = 0;
		
		String st = "goto cs";
		int sizeOfsb = sbSwitches.size();
		code.append("goto cs"+counterGoto).append(";");
		
		int current = 0;
		int temp = counterGoto-sizeOfsb;
		for(StringBuffer sb : sbSwitches){
		
			
				sb.insert(sb.indexOf("{"), "\ncs"+(temp)+":"+"\n");
			
			if(current+1 < sizeOfsb){
				
				sb.insert(sb.lastIndexOf("}"), st+(temp+1)+";"+"\n");
				//code.append(sb);
				
			}
			code.append(sb);
			current++;
			temp++;
		}
		sbSwitches = new ArrayList<StringBuffer>();
		
		
		
		
		
		
		
		code.append("\n");
		code.append("cs"+counterGoto+": {break;}");
		counterGoto++;
		n.nodeToken4.accept(this, argu);
		code.append("/*END OF SWITCH*/");
		code.append("\n");

	}

	/**
	 * switchLabel -> SwitchLabel() nodeToken -> ":" block -> Block()
	 */
	public void visit(SwitchEntry n, String argu) {
		
		if(n.switchLabel.nodeChoice.choice instanceof Case){
			
			if(!setIf){
			
			code.append("else");	
			}
			code.append(" if");
			setIf = false;
			code.append("(");
			code.append(((Case)n.switchLabel.nodeChoice.choice).identifier.nodeToken.tokenImage);
			//n.switchLabel.accept(this, argu);
			
			code.append("==");
			code.append(" "+switchLabel+")\n");
			code.append("goto cs"+counterGoto).append(";");
			code.append("\n");
			counterGoto++;
			
		}else{
			code.append("else\n");
			code.append("goto cs"+counterGoto).append(";");
			code.append("\n");
			counterGoto++;
		}
		setIf = false;
		
		//n.nodeToken.accept(this, argu);
		StringBuffer sb = code;
		code = new StringBuffer();
		n.block.accept(this, argu);
	
		sbSwitches.add(code);
		code = sb;

	}

	/**
	 * nodeChoice -> Case() | Default()
	 */
	public void visit(SwitchLabel n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "case" identifier -> Identifier()
	 */
	public void visit(Case n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.identifier.accept(this, argu);

	}

	/**
	 * nodeToken -> "default"
	 */
	public void visit(Default n, String argu) {

		//n.nodeToken.accept(this, argu);
		
		//code.append("else");

	}

	/**
	 * nodeToken -> "throw" nodeToken1 -> "new" nodeToken2 -> "RuntimeException"
	 * nodeToken3 -> "(" identifier -> Identifier() nodeToken4 -> ")" nodeToken5
	 * -> ";"
	 */
	public void visit(ThrowStatement n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		code.append("fprintf(stderr, ");
		//n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		code.append("\nexit(EXIT_FAILURE);");
		code.append("\n");
	}

	/**
	 * nodeToken -> "while" nodeToken1 -> "(" identifier -> Identifier()
	 * nodeToken2 -> ")" block -> Block()
	 */
	public void visit(WhileStatement n, String argu) {
		code.append("\n");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.block.accept(this, argu);
		code.append("\n");
	}

	/**
	 * nodeToken -> "final" type -> Type() identifier -> Identifier() nodeToken1
	 * -> "=" expression -> Expression() nodeToken2 -> ";"
	 */
	public void visit(FinalVariableDeclaration n, String argu) {

		//n.nodeToken.accept(this, argu);
		
		
		
		
		
		
		if(n.type.nodeChoice.choice instanceof NonArrayType && (((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice  instanceof ClassNameType )){
			
			code.append("struct ");	
		n.type.accept(this, argu);
		
		code.append("* ");
		
		//code.append("const").append(" ");
		//currentAssignment = n.identifier.nodeToken.tokenImage;
		n.identifier.accept(this, argu);
		if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
			//code.append("[]");
		}
	//	n.nodeToken2.accept(this, argu);
	//	code.append("\n");
	//	n.identifier.accept(this, argu);
		if(n.expression.nodeChoice.choice instanceof NewObject){
			n.nodeToken1.accept(this, argu);
			code.append("(struct ");
			n.type.accept(this, argu);
			code.append(" *) malloc(sizeof(struct ");
			n.type.accept(this, argu);
			code.append("))");
			n.nodeToken2.accept(this, argu);
			code.append(" \n");
			passToMyConstructor = n.identifier.nodeToken.tokenImage;
			
			
		}else{
		n.nodeToken1.accept(this, argu);
		
		}
		
		
	
		
		n.expression.accept(this, argu);
		
		
		passToMyConstructor="";
		n.nodeToken2.accept(this, argu);
		
		
		
		
		code.append("\n");
		}else if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
			
			n.type.accept(this, argu);
			code.append("const").append(" ");
			n.identifier.accept(this, argu);
			//code.append("[]");
			n.nodeToken1.accept(this, argu);
			n.expression.accept(this, argu);
			n.nodeToken2.accept(this, argu);
			code.append("\n");
		}else{

			currentAssignment = n.identifier.nodeToken.tokenImage;
			StringBuffer tempCode = code;
			code = new StringBuffer();
			
			
			code.append("const").append(" ");
			n.type.accept(this, argu);
			n.identifier.accept(this, argu);	
			n.nodeToken1.accept(this, argu);
			nonePointerVarOnLeft = false;
			
			StringBuffer codeTemp2 = code;
			code = new StringBuffer();
			
			n.expression.accept(this, argu);
			
			nonePointerVarOnLeft = false;
			if(globalTempValue != null){
				
				codeTemp2.append(globalTempValue+";");
				code.append(codeTemp2);
				tempCode.append(code);
				code= tempCode;
			}
			
			else{
				codeTemp2.append(code);
				tempCode.append(codeTemp2);
				code = tempCode;
			}
			globalTempValue = null;
			n.nodeToken2.accept(this, argu);
			code.append("\n");
			
		}
	
	}

	/**
	 * type -> Type() identifier -> Identifier() nodeToken -> "=" expression ->
	 * Expression() nodeToken1 -> ";"
	 */
	public void visit(UpdatableVariableDeclaration n, String argu) {

		code.append("/*UpdatableVariableDeclaration*/");
		
		if(n.type.nodeChoice.choice instanceof NonArrayType && ( ((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType))
		{
			code.append(" struct ");
			n.type.accept(this, argu);
			code.append(" * ");
			n.identifier.accept(this, argu);
			
			//if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
				//code.append("[]");
			//}
			//n.nodeToken1.accept(this, argu);
			//code.append("\n");
			//n.identifier.accept(this, argu);
			if(n.expression.nodeChoice.choice instanceof NewObject){
				n.nodeToken.accept(this, argu);
				code.append("(struct ");
				n.type.accept(this, argu);
				code.append(" *) malloc(sizeof(struct ");
				n.type.accept(this, argu);
				code.append("))");
				
				n.nodeToken1.accept(this, argu);
				
				
				code.append(" \n");
				passToMyConstructor = n.identifier.nodeToken.tokenImage;
				
				
			}else{
				//code.append("&");
			n.nodeToken.accept(this, argu);
			}
		
			n.expression.accept(this, argu);
			
			passToMyConstructor = "";
			n.nodeToken1.accept(this, argu);
			code.append("\n");
		}else{
			
			
			StringBuffer tempCode = code;
			code = new StringBuffer();
			
			
			n.type.accept(this, argu);
			n.identifier.accept(this, argu);
			
			//n.nodeToken1.accept(this, argu);
			
			//n.identifier.accept(this, argu);
			
			n.nodeToken.accept(this, argu);
			nonePointerVarOnLeft = false;
			

			
			StringBuffer codeTemp2 = code;
			code = new StringBuffer();
			
			
			n.expression.accept(this, argu);
			nonePointerVarOnLeft = false;
			if(globalTempValue != null){
				
				codeTemp2.append(globalTempValue+";");
				code.append(codeTemp2);
				tempCode.append(code);
				code= tempCode;
			}else{
				codeTemp2.append(code);
				tempCode.append(codeTemp2);
				code = tempCode;
				n.nodeToken1.accept(this, argu);	
			}
			globalTempValue = null;
			
			
			code.append("\n");
		}
	}

	/**
	 * nodeChoice -> ExpressionInParentheses() | ConditionalOrExpression() |
	 * ConditionalAndExpression() | InclusiveOrExpression() |
	 * ExclusiveOrExpression() | AndExpression() | EqualsExpression() |
	 * NonEqualsExpression() | LessThanExpression() | GreaterThanExpression() |
	 * LessThanEqualExpression() | GreaterThanEqualExpression() |
	 * ShiftLeftExpression() | ShiftRightExpression() |
	 * ShiftRightUnsignedExpression() | PlusExpression() | MinusExpression() |
	 * TimesExpression() | DivideExpression() | ModulusExpression() |
	 * SinExpression() | CosExpression() | PowExpression() | ExpExpression() |
	 * SqrtExpression() | AbsExpression() | MinExpression() | MaxExpression() |
	 * LogExpression() | ComplimentExpression() | NotExpression() |
	 * CoercionToIntExpression() | CoercionToDoubleExpression() |
	 * CoercionToLongExpression() | CoercionToShortExpression() |
	 * CoercionToByteExpression() | Place() | CurrentTime() | ArrayAccess() |
	 * MethodCall() | MethodCallInConstructor() | DotId() |
	 * DotIdentifierDotGet() | DotNext() | DotPrev() | DotIsFirst() |
	 * DotIsLast() | DotLength() | DotIdentifier() | NewObject() |
	 * NewUpdatableArray() | IntegerLiteral() | LongLiteral() | HexLiteral() |
	 * FloatingPointLiteral() | StringLiteral() | True() | False() |
	 * HereLiteral() | PlaceFirstPlace() | PlaceLastPlace() | PlaceMaxPlaces() |
	 * JavaIntegerSize() | Identifier()
	 */
	public void visit(Expression n, String argu) {

		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "(" expression -> Expression() nodeToken1 -> ")"
	 */
	public void visit(ExpressionInParentheses n, String argu) {

		n.nodeToken.accept(this, argu);
		n.expression.accept(this, argu);
		n.nodeToken1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "||" identifier1 -> Identifier()
	 */
	public void visit(ConditionalOrExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "&&" identifier1 -> Identifier()
	 */
	public void visit(ConditionalAndExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "|" identifier1 -> Identifier()
	 */
	public void visit(InclusiveOrExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "^" identifier1 -> Identifier()
	 */
	public void visit(ExclusiveOrExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "&" identifier1 -> Identifier()
	 */
	public void visit(AndExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "==" identifier1 -> Identifier()
	 */
	public void visit(EqualsExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "!=" identifier1 -> Identifier()
	 */
	public void visit(NonEqualsExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

/**
	 * identifier -> Identifier()
	 * nodeToken -> "<"
	 * identifier1 -> Identifier()
	 */
	public void visit(LessThanExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> ">" identifier1 -> Identifier()
	 */
	public void visit(GreaterThanExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "<=" identifier1 -> Identifier()
	 */
	public void visit(LessThanEqualExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> ">=" identifier1 -> Identifier()
	 */
	public void visit(GreaterThanEqualExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

/**
	 * identifier -> Identifier()
	 * nodeToken -> "<<"
	 * identifier1 -> Identifier()
	 */
	public void visit(ShiftLeftExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> ">>" identifier1 -> Identifier()
	 */
	public void visit(ShiftRightExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> ">>>" identifier1 -> Identifier()
	 */
	public void visit(ShiftRightUnsignedExpression n, String argu) {
		String left = n.identifier.nodeToken.tokenImage;
		String right = n.identifier1.nodeToken.tokenImage;
		//only supports 32  or 64  unsigned bit shifting does not support bit shift of zero

		PairsTypeName leftPTN = null;
		PairsTypeName rightPTN = null;
		
			
		
		 if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
				leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
			
			}else if(myClasses.get(currentClassName).myFields.containsKey(left)){
						leftPTN = myClasses.get(currentClassName).myFields.get(left);
					}/*else if(myClasses.get("Program").myFields.containsKey(left)){
						leftPTN = myClasses.get("Program").myFields.get(left);
					}*/
					else{
						
					}
		 if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(right)){
				rightPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(right);
			}
		 else if(myClasses.get(currentClassName).myFields.containsKey(right)){
						rightPTN = myClasses.get(currentClassName).myFields.get(right);
					} /*else if(myClasses.get("Program").myFields.containsKey(right)){
						rightPTN = myClasses.get("Program").myFields.get(right);
					}*/else{
						
					}
					
		
		
		if((leftPTN != null && rightPTN !=null) && ( leftPTN.type.equals("%lld") || rightPTN.type.equals("%lld"))){
			code.append( "(("+"("+left+" >> "+right+")"+ " ) & ("+"(9223372036854775807"+" >> "+right+")))");
			
		}else{
			code.append( "(("+"("+left+" >> "+right+")"+" ) & ("+"(2147483647"+" >> "+right+")"+"))");
		}
		
		//n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		//n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "+" identifier1 -> Identifier()
	 */
	public void visit(PlusExpression n, String argu) {

	
		String left = n.identifier.nodeToken.tokenImage;
		String right = n.identifier1.nodeToken.tokenImage;
		
		PairsTypeName leftPTN = null;
		PairsTypeName rightPTN = null;
		
			
				
		 if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
				leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
			
			}else if(myClasses.get(currentClassName).myFields.containsKey(left)){
						leftPTN = myClasses.get(currentClassName).myFields.get(left);
					}/*else if(myClasses.get("Program").myFields.containsKey(left)){
						leftPTN = myClasses.get("Program").myFields.get(left);
					}*/
					else{
						
					}
		 if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(right)){
				rightPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(right);
			}
		 else if(myClasses.get(currentClassName).myFields.containsKey(right)){
						rightPTN = myClasses.get(currentClassName).myFields.get(right);
					} /*else if(myClasses.get("Program").myFields.containsKey(right)){
						rightPTN = myClasses.get("Program").myFields.get(right);
					}*/else{
						
					}
					
		
		if((leftPTN != null && rightPTN !=null) && (leftPTN.type.equals("%s") || rightPTN.type.equals("%s"))){
			String tempValue = genTemp();
			code.append("/*ASSIGNMENT STRING*/\n");
			code.append(" char * "+tempValue +" = (char *)malloc(10000 * sizeof(char));\n");
			code.append("sprintf("+tempValue+", \""+leftPTN.type+rightPTN.type+"\","+left+","+right+");\n");
			globalTempValue = tempValue;
		}else{
			n.identifier.accept(this, argu);
			n.nodeToken.accept(this, argu);
			n.identifier1.accept(this, argu);
		}

	}
	
	
	public String genTemp(){
		tempNumber++;
		return "tempC"+tempNumber;
	}

	/**
	 * identifier -> Identifier() nodeToken -> "-" identifier1 -> Identifier()
	 */
	public void visit(MinusExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "*" identifier1 -> Identifier()
	 */
	public void visit(TimesExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "/" identifier1 -> Identifier()
	 */
	public void visit(DivideExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * identifier -> Identifier() nodeToken -> "%" identifier1 -> Identifier()
	 */
	public void visit(ModulusExpression n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "sin" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(SinExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append(std::);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "cos" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(CosExpression n, String argu) {

	//	n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "pow" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> "," identifier1 ->
	 * Identifier() nodeToken5 -> ")"
	 */
	public void visit(PowExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "exp" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(ExpExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "sqrt" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(SqrtExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "abs" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(AbsExpression n, String argu) {

//		n.nodeToken.accept(this, argu);
	//	n.nodeToken1.accept(this, argu);
		//code.append("std::");
		code.append("f");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "min" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> "," identifier1 ->
	 * Identifier() nodeToken5 -> ")"
	 */
	public void visit(MinExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "max" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> "," identifier1 ->
	 * Identifier() nodeToken5 -> ")"
	 */
	public void visit(MaxExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);

	}

	/**
	 * nodeToken -> "Math" nodeToken1 -> "." nodeToken2 -> "log" nodeToken3 ->
	 * "(" identifier -> Identifier() nodeToken4 -> ")"
	 */
	public void visit(LogExpression n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append("std::");
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken4.accept(this, argu);

	}

	/**
	 * nodeToken -> "~" identifier -> Identifier()
	 */
	public void visit(ComplimentExpression n, String argu) {

		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);

	}

	/**
	 * nodeToken -> "!" identifier -> Identifier()
	 */
	public void visit(NotExpression n, String argu) {

		n.nodeToken.accept(this, argu);
		n.identifier.accept(this, argu);
		
	}

	/**
	 * nodeToken -> "(" nodeToken1 -> "int" nodeToken2 -> ")" expression ->
	 * Expression()
	 */
	public void visit(CoercionToIntExpression n, String argu) {
		
		code.append("/*casting*/");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		//code.append("\n");
	}

	/**
	 * nodeToken -> "(" nodeToken1 -> "double" nodeToken2 -> ")" expression ->
	 * Expression()
	 */
	public void visit(CoercionToDoubleExpression n, String argu) {
		code.append("/*casting*/");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		//code.append("\n");
	}

	/**
	 * nodeToken -> "(" nodeToken1 -> "long" nodeToken2 -> ")" expression ->
	 * Expression()
	 */
	public void visit(CoercionToLongExpression n, String argu) {
		code.append("/*casting*/");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append(" long /*CASTING*/");
		
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		//code.append("\n");
	}

	/**
	 * nodeToken -> "(" nodeToken1 -> "short" nodeToken2 -> ")" expression ->
	 * Expression()
	 */
	public void visit(CoercionToShortExpression n, String argu) {
		code.append("/*casting*/");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		//code.append("\n");
	}

	/**
	 * nodeToken -> "(" nodeToken1 -> "byte" nodeToken2 -> ")" expression ->
	 * Expression()
	 */
	public void visit(CoercionToByteExpression n, String argu) {

		n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		code.append("char");
		n.nodeToken2.accept(this, argu);
		n.expression.accept(this, argu);
		//code.append("\n");
	}

	/**
	 * nodeToken -> "place.places" nodeToken1 -> "(" identifier -> Identifier()
	 * nodeToken2 -> ")"
	 */
	public void visit(Place n, String argu) {

		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
		code.append("\n");
	}

	/**
	 * nodeToken -> "System.currentTimeMillis" nodeToken1 -> "(" nodeToken2 ->
	 * ")"
	 */
	public void visit(CurrentTime n, String argu) {
		//code.append("clock");
		code.append("getTIME");
		//n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("");
		n.nodeToken2.accept(this, argu);
		code.append("");
		code.append("\n");
		//code.append("sleep(10);");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "[" identifier1 -> Identifier()
	 * nodeToken1 -> "]"
	 */
	public void visit(ArrayAccess n, String argu) {
		
		PairsTypeName leftPTN = null;
		String left = n.identifier.nodeToken.tokenImage;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.get(left);
		}
		if(leftPTN != null && leftPTN.getType().equals("%c")){
		//	code.append("&");
		}
		
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." identifier1 -> Identifier()
	 * nodeToken1 -> "(" nodeOptional -> ( IdentifierList() )? nodeToken2 -> ")"
	 */
	public void visit(MethodCall n, String argu) {

		//n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		
	//	StringBuffer sb = code;
		//code = new StringBuffer();
		
		//if(!myConstructorList.containsKey(n.identifier1.nodeToken.tokenImage)){
			n.identifier1.accept(this, argu);	
		//}
		
		n.nodeToken1.accept(this, argu);
		
		n.nodeOptional.accept(this, argu);
	/*	if(myConstructorList.containsKey(n.identifier1.nodeToken.tokenImage)){
			StringBuffer sbTemp = new StringBuffer();
			
				
				sbTemp.append("_"+totalParameters);
			
			
			
			sbTemp.append(code);
			code = sbTemp;
		}*/
		n.nodeToken2.accept(this, argu);
		//sb.append(code);
		//code = sb;
		
		//code.append("\n");
	}

	/**
	 * nodeToken -> "this" nodeToken1 -> "." identifier -> Identifier()
	 * nodeToken2 -> "(" nodeOptional -> ( IdentifierList() )? nodeToken3 -> ")"
	 */
	public void visit(MethodCallInConstructor n, String argu) {

		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
		//code.append(className+"TEMP->");
		n.identifier.accept(this, argu);
		//n.identifier.nodeToken.tokenImage;
		
		n.nodeToken2.accept(this, argu);
		code.append(className+"TEMP");
		addComma = true;
		n.nodeOptional.accept(this, argu);
		addComma = false;
		n.nodeToken3.accept(this, argu);
		//code.append("\n");

	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "id"
	 */
	public void visit(DotId n, String argu) {
		code.append("/*").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
		//code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." identifier1 -> Identifier()
	 * nodeToken1 -> "." nodeToken2 -> "get" nodeToken3 -> "(" identifierList ->
	 * IdentifierList() nodeToken4 -> ")"
	 */
	public void visit(DotIdentifierDotGet n, String argu) {

		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifierList.accept(this, argu);
		n.nodeToken4.accept(this, argu);
	//	code.append("\n");

	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "next"
	 * nodeToken2 -> "(" nodeToken3 -> ")"
	 */
	public void visit(DotNext n, String argu) {
		code.append("/*").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
	//	code.append("\n");

	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "prev"
	 * nodeToken2 -> "(" nodeToken3 -> ")"
	 */
	public void visit(DotPrev n, String argu) {
		code.append("/*").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
	//	code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "isFirst"
	 * nodeToken2 -> "(" nodeToken3 -> ")"
	 */
	public void visit(DotIsFirst n, String argu) {
		code.append("/*").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("1").append(" ");
	//s	code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "isLast"
	 * nodeToken2 -> "(" nodeToken3 -> ")"
	 */
	public void visit(DotIsLast n, String argu) {
		code.append("/*").append(" ");
		n.identifier.accept(this, argu);
		n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("1").append(" ");
	//	code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "length"
	 */
	public void visit(DotLength n, String argu) {
		code.append("/*FIX*/ 0");
		//n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);
	//	code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." identifier1 -> Identifier()
	 */
	public void visit(DotIdentifier n, String argu) {
		String programTemp = n.identifier.nodeToken.tokenImage;
		if(programTemp.equals("Program")){
			code.append("/*program*/");
			n.identifier1.accept(this, argu);
		}else{
			
			if(nonePointerVarOnLeft){
				code.append("*(");
				n.identifier.accept(this, argu);
				code.append("->");
				n.identifier1.accept(this, argu);
			    code.append(")");
			}else{
			//code.append("*(");
		n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		code.append("->");
		n.identifier1.accept(this, argu);
			}
		//code.append(")");
		}
	//	code.append("\n");
	}

	/**TODO GENERATE TEMPS
	 * nodeToken -> "new" identifier -> Identifier() nodeToken1 -> "("
	 * nodeOptional -> [ IdentifierList() ] nodeToken2 -> ")"
	 */
	public void visit(NewObject n, String argu) {

		//n.nodeToken.accept(this, argu);
		//code.append("/*");
		
		//code.append("*\");
		//code.append("malloc(sizeof("+n.identifier.nodeToken.tokenImage+"));\n");
		
		//code.append(n.identifier.nodeToken.tokenImage+"Temp"+";\n");
		
		
		//(struct node *) malloc(sizeof(struct node));
		
		
		StringBuffer sb = code;
		code = new StringBuffer();
		
		if(!myConstructorList.containsKey(n.identifier.nodeToken.tokenImage) || !(myConstructorList.get(n.identifier.nodeToken.tokenImage) .size() > 1)){
			code.append(n.identifier.nodeToken.tokenImage + "_" + n.identifier.nodeToken.tokenImage);
		}
			
		
		n.nodeToken1.accept(this, argu);
		//had a & here
		code.append(passToMyConstructor+"");
		addComma = true;
		totalParameters=0;
		n.nodeOptional.accept(this, argu);
		
		if(myConstructorList.containsKey(n.identifier.nodeToken.tokenImage) && (myConstructorList.get(n.identifier.nodeToken.tokenImage) .size() > 1)){
			StringBuffer sbTemp = code;
			code = new StringBuffer();
			code.append(n.identifier.nodeToken.tokenImage+"_"+n.identifier.nodeToken.tokenImage+"_"+totalParameters);
			code.append(sbTemp);
		}
		addComma = false;
		n.nodeToken2.accept(this, argu);
		
		sb.append(code);
		code = sb;
		//code.append("\n");
	}

	/**
	 * nodeToken -> "new" nonArrayType -> NonArrayType() nodeToken1 -> "["
	 * identifier -> Identifier() nodeToken2 -> "]"
	 */
	public void visit(NewUpdatableArray n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("(");
		n.nonArrayType.accept(this, argu);
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
			code.append("*");
		}
		code.append("*)");
		code.append("calloc("+n.identifier.nodeToken.tokenImage+",sizeof( ");
		n.nonArrayType.accept(this, argu);
		code.append("*))");
		//n.nodeToken1.accept(this, argu);
		//n.identifier.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		
	//	code.append("\n");

	}

	/**
	 * nodeToken -> <INTEGER_LITERAL>
	 */
	public void visit(IntegerLiteral n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> <LONG_LITERAL>
	 */
	public void visit(LongLiteral n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> <HEX_LITERAL>
	 */
	public void visit(HexLiteral n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> <FLOATING_POINT_LITERAL>
	 */
	public void visit(FloatingPointLiteral n, String argu) {
		
		String x = n.nodeToken.tokenImage;
		if(x.endsWith("D") ){
			//x = x.substring(0, x.indexOf('D'));
			x=x.replace('D', 'f');
		}else if(x.endsWith("d") ){
			//x = x.substring(0, x.indexOf('d'));
			x=x.replace('d', 'f');
		}
		code.append(x);
		//n.nodeToken.accept(this, argu);
		

	}

	/**
	 * nodeToken -> <STRING_LITERAL>
	 */
	public void visit(StringLiteral n, String argu) {

		n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "true"
	 */
	public void visit(True n, String argu) {

	//	n.nodeToken.accept(this, argu);
		code.append("1").append(" ");
	}

	/**
	 * nodeToken -> "false"
	 */
	public void visit(False n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("0").append(" ");
	}

	/**
	 * nodeToken -> "here"
	 */
	public void visit(HereLiteral n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
	}

	/**
	 * nodeToken -> "place.FIRST_PLACE"
	 */
	public void visit(PlaceFirstPlace n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
	}

	/**
	 * nodeToken -> "place.LAST_PLACE"
	 */
	public void visit(PlaceLastPlace n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("0").append(" ");
	}

	/**
	 * nodeToken -> "place.MAX_PLACES"
	 */
	public void visit(PlaceMaxPlaces n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		code.append("1").append(" ");
	}

	/**MAY BE BROKEN
	 * nodeToken -> "java.lang.Integer.SIZE"
	 */
	public void visit(JavaIntegerSize n, String argu) {
		//n.nodeToken.accept(this, argu);
		code.append("8*sizeof(int)");
		
	}
	public String makeTimeMethod(){
		String st = "const double getTIME()";
		st+="{\n";
		st+= "unsigned long long microsecs;\n";
		st+= "struct timeval tv; \n";
		st+= "gettimeofday(&tv, NULL);\n";
		st+= "microsecs = ((unsigned long long)tv.tv_sec * 1000000);\n";
		st += "microsecs += tv.tv_usec;\n";
		st+= "const double temp = (const double)microsecs;\n";
		st+= "const double temp2 = temp/1000;\n";
		st+= "return temp2; \n";
		st+="}\n";
		
		
		
		
		return st;
	}
	public String makeTimeH(){
		String st = "const double getTIME(); \n";
		
		
		
		
		
		return st;
	}
}
