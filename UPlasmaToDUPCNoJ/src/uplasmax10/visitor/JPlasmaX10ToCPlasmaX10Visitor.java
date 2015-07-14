package uplasmax10.visitor;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import uplasmax10.syntaxtree.*;
import util.symboltable.Constants;
import util.symboltable.Symbol;
import util.symboltable.SymbolTable;
import util.symboltable.SymbolTableClassEntry;
import util.symboltable.Constants.ClassType;
import util.symboltable.Symbol.SymIndex;
import util.types.X10Array;
import util.types.X10Class;
import util.types.X10Type;

public class JPlasmaX10ToCPlasmaX10Visitor implements GJVoidVisitor<String> {

	
	private String currentClassName="";
	private String currentMethodName ="";
	
	private StringBuffer code = new StringBuffer(0);
	private StringBuffer hfile = new StringBuffer(0);
	//private boolean insideConstructor;
	private String className;
	private HashMap<String,String> myMethodsForConstructors = new HashMap<String, String>();
	private ArrayList<Pair> myHFileStructs = new ArrayList<Pair>();
	private ArrayList<String> myMethodHFileStructs = new ArrayList<String>();
	private boolean addComma;
	private String passToMyConstructor;
	private int currentTemp=0;
	public HashMap<String, ArrayList<Integer>> myConstructorList = new HashMap<String, ArrayList<Integer>> ();
	private int totalParameters = 0;
	public HashMap<String, ClassObject> myClasses;
	//private String currentAssignment;
	private ArrayList<String> itemsNeededToBeInitilized = new ArrayList<String>();
	private boolean nonePointerVarOnLeft = false;
	private int globalTemp = 0;
	private String switchLabel;
	//private boolean setDefault;
	private boolean setIf;
	private ArrayList<StringBuffer> sbSwitches = new ArrayList<StringBuffer>();
	private int counterGoto = 0;
	//private int sizeOfSwitch;
	private boolean addThisToMethods;
	private boolean needsDefaultConstructor = false;
	private int tempNumber = 0;
	private String globalTempValue = null;
	private int blockid = 0;
	public SymbolTable symbolTable;
	//private boolean inStaticMethod;
	//private boolean firstValue;
	public HashMap<String, ArrayList<String>> aHashMapClasses = new HashMap<String, ArrayList<String>>();
	public ArrayList<String> myListOfClasses = new ArrayList<String>();
	private HashMap<String, Pair> myDepList = new HashMap<String, Pair>();
	private List<Pair> alP=null;
	private boolean isAssignment;
	private int CallocCounter = 0;
	private String ArrayInitilizerSizeVariable = "";
	private StringBuffer ArrayInitStringBuffer = new StringBuffer();
	private String ArrayInitReturnStatementPart1 = null;
	private String ArrayInitReturnStatementPart2 = null;
	private int blockOverallId=0;
	private boolean calledNewValueArray = false;
	private boolean calledNewUpdateArray = false;
	public HashMap<String, ArrayList<String>> whoDependsOnMeList = new HashMap<String, ArrayList<String>>();
	private ArrayList<PairsTypeName> myListAsyncCalls = new ArrayList<PairsTypeName>();
	public HashMap<String, String> myListAsyncConstructorClass;
	private boolean useGarbageCollector = false;
	private boolean useDUPDistributed = true;
	private boolean useCalloc = false;
	private boolean useMallocProfiler= true;
	
	
	private String getMallocProfiler(){
		String temp = "";
		if(useMallocProfiler){
			temp = "(((_task*)_thread_getspecific()) -> total_memory) += ";
		}else{
			return "";
		}
		
		return temp;
		
	}
	private String getEndOFMallocProfiler(){
		if(useMallocProfiler){
			return ")";
		}else{
			return "";
		}
		
	}
	
	
	
	private String malloc() {
		
		String s;
		if(useGarbageCollector) {
		s = "GC_MALLOC_UNCOLLECTABLE";
		}else {
		s = "malloc";
		}
		return s;
	}
	private String mallocuc() {
		
		String s;
		if(useGarbageCollector) {
		s = "GC_MALLOC_UNCOLLECTABLE";
		}else {
		s = "malloc";
		}
		return s;
	}
	
	private String calloc() {
		String s;
		if(useGarbageCollector) {
		s = "GC_MALLOC_UNCOLLECTABLE";
		}else {
		s = "calloc";
		}
		return s;
		
	}
	
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
	
	public boolean checkInLocalParameter(String classNameM, String methodNameM, String ident, int bId){
		
		for(int i = 0; i<=bId; ++i){
			if(myClasses.get(classNameM).myMethods.get(methodNameM).myLocalsParams.containsKey(ident+i)){
			return true;	
			}
		}
		
		return false;
		
	}
	
	//switched this to go backwards
	public PairsTypeName getInLocalParameter(String classNameM, String methodNameM, String ident, int bId){
		for(int i = bId; i>=0; --i){
			if(myClasses.get(classNameM).myMethods.get(methodNameM).myLocalsParams.containsKey(ident+i)){
			return myClasses.get(classNameM).myMethods.get(methodNameM).myLocalsParams.get(ident+i);	
			}
		}
		
		return null;
		
	}

	public void visit(NodeToken n, String argu) {
		code.append(n.tokenImage).append(" ");
	}

	//
	// User-generated visitor methods below
	//

	/**
	 * 
Class -> MainClass() programClass -> ProgramClass() nodeListOptional
	 * -> ( TopLevelDeclaration() )* nodeToken -> <EOF>
	 */
	public void visit(File n, String argu) {
	
		String tempList = "";
		tempList+="typedef unsigned char byte;\n";
		
		buildDepChain();
		//System.out.println("============");
		Collection<Pair> c = myDepList.values();
		Set s =myDepList.entrySet();
		 // Collections.sort((List<Pair>) s);
		 alP = new ArrayList<Pair>();
		
		/* for(Pair x : c){
				//alP.add(x);
			 	
			
			 if(whoDependsOnMeList.containsKey(x.myName) && whoDependsOnMeList.get(x.myName) != null){
					for(String st: whoDependsOnMeList.get(x.myName)){
						
						if(x.ranking > myDepList.get(st).ranking){
							 System.out.println("Program Dep List = "+x.myName+" "+x.ranking);
							System.out.println("=============");
							System.out.println("Dep on Me = "+st+" "+myDepList.get(st).ranking);
							ArrayList<String> temp = aHashMapClasses.get(st);
							myDepList.get(st).setRanking(updateRank(st, temp, x.ranking));
							System.out.println("My New Rank = "+st+" "+myDepList.get(st).ranking);
							System.out.println("=============");
						}
						
					}
			}}*/
			 
				
		 
		  //c = myDepList.values();
		for(Pair x : c){
			alP.add(x);
			//System.out.println("Program Dep List = "+x.myName+" "+x.ranking);
			
		}
		
		
		
		Collections.sort(alP);
		//for(Pair x: alP){
			
			
			//System.out.println("Program Dep List = "+x.myName+" "+x.ranking);
			
			
		//}
		/*
		for(String dep : aHashMapClasses.get("Vec")){
		System.out.println(dep+" dep");
		}
		for(String dep : aHashMapClasses.get("Surface")){
			System.out.println(dep);
			}*/
		
		
		code.insert(0, "#include <stdio.h>\n");
		code.insert(0, "#include <stdlib.h>\n");
		code.insert(0, "#include <sys/time.h>\n");
		code.insert(0, "#include <string.h>\n");
		code.insert(0, "#include <math.h>\n");
		//code.insert(0, "#include <stdint.h>\n");
		if(useDUPDistributed) {
			code.insert(0, "#include \"../inc/RunMain.h\"\n");
			code.insert(0, "#include \"../inc/place.h\"\n");
			code.insert(0, "#include \"../inc/async.h\"\n");
			hfile.insert(0, "#include \"place.h\"\n");
		}else {
			code.insert(0, "#include \"RunMain.h\"\n");
		}
		hfile.insert(0, "#include <stdint.h>\n");
		if(useGarbageCollector) {
		code.insert(0, "#include \"gc.h\"\n");
		}
		hfile.insert(0, tempList);
		
		tempList = "";
		
		
		n.programClass.accept(this, argu);
		n.nodeListOptional.accept(this, argu);
		n.mainClass.accept(this, argu);
		n.nodeToken.accept(this, argu);
		
		StringBuffer sn = new StringBuffer();
		for(Pair temp : myHFileStructs){
			tempList += "typedef struct "+temp+" "+temp+";";
			tempList+="\n";
		}if(useGarbageCollector) {
		hfile.append("\n#define GC_CALLOC(m,n) "+malloc()+"((m)*(n))\n");
		}
		for(Pair p : alP){
			hfile.append(p.code);
		}
		for(String temp : myMethodHFileStructs){
			
			tempList += temp+";\n"; 
		
		}
		if(useDUPDistributed) {
		hfile.append(buildEnum());
		}
		hfile.append(tempList);
		hfile.append(makeTimeH());
		code.append(makeTimeMethod());
		if(useDUPDistributed) {
			code.append(buildThreadRun(true));
			code.append(buildThreadRun(false));
			code.append(getMsgMemManagmentCode());
			code.append(getArraySizeOf());
			code.append(getDeepCopy());
			code.append(getFixPointers()); 
			//code.append(getDumpMemory());
		}
		
		
	}

	private int  buildDepChain() {
		ArrayList<String> temp;
		Set<String> tp;
		int maxNumber = -1;
		for(String className : myListOfClasses){
			
			temp = aHashMapClasses.get(className);
			//handles this argument added later
			if(myListAsyncConstructorClass.containsKey(className)) {
				temp.add(myListAsyncConstructorClass.get(className));
				
			}
			if(temp.size() == 0){
				myDepList.put(className, new Pair(-1, className));
			}else{
				
				 updateRank(className, temp, maxNumber);
				 if(!myDepList.containsKey(className)){
						
						myDepList.put(className, new Pair(-1, className));
				 }
				
			}
		}
		return maxNumber;
		
	}
	
	//updates the rank for building the dependency chain in the h file
	private int updateRank(String className, ArrayList<String> myDep, int maxNumber){
		/*if(className == "Dist1"){
			System.out.println("maxNumber"+maxNumber);
			
		}*/
		
		if(myDep.size() == 0){
			if(!myDepList.containsKey(className)){
				myDepList.put(className, new Pair(-1, className));
			}else{
				myDepList.get(className).setRanking(-1);
					
			}
			return -1;
		}else{
			int tempMAX = -1;
			
			for(String temp: myDep){
				int tempsMaxNumber = -1;
				ArrayList<String> tempList = aHashMapClasses.get(temp);
					if(myDepList.containsKey(temp)){
						
						tempsMaxNumber = myDepList.get(temp).ranking;
					}
					
					tempMAX = updateRank(temp, tempList, tempsMaxNumber);
				
				/**/
				if(tempList.size()!=0 && !myDepList.containsKey(temp)){
					tempMAX++;
					if(tempMAX >= maxNumber){
						maxNumber = tempMAX+1;
					}	
					
					myDepList.put(temp, new Pair(tempMAX, temp));
				
				}
				
				/**/
				else/* =if(tempList.size()!=0 )*/{
					tempMAX++;
					if(tempMAX >= maxNumber){
					maxNumber = tempMAX+1;
					
					}
					if(tempsMaxNumber < tempMAX){
					//myDepList.get(temp).setRanking(tempMAX);
					//System.out.println(temp+" "+ tempMAX+" "+tempsMaxNumber+" "+maxNumber);
					}
					
				}
				
				
				if(!whoDependsOnMeList.containsKey(temp)){
					ArrayList<String> tempHM = new ArrayList<String>();
					whoDependsOnMeList.put(temp, tempHM);
					
				}else{
					ArrayList<String> tempHM = whoDependsOnMeList.get(temp);
					if(tempHM.contains(className)){
						
					}else{
						tempHM.add(className);
					}
				}
			}
			//maxNumber++;
				if(!myDepList.containsKey(className)){
				
					myDepList.put(className, new Pair(maxNumber, className));
				}else{
					
					myDepList.get(className).setRanking(maxNumber);
				}
				return maxNumber;
		}
		
		
		
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
		blockid = 0;
		blockOverallId = 0;
		StringBuffer initconstants = new StringBuffer();
		code.append("/*").append(" ");
		//n.nodeToken.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.identifier.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		currentClassName = n.identifier.nodeToken.tokenImage;
		code.append("*/").append(" ");
		//code.append("int ").append(" ");
		code.append("int32_t ").append(" ");
		//n.nodeToken3.accept(this, argu);
		//n.nodeToken4.accept(this, argu);
		//n.nodeToken5.accept(this, argu);
		if(!useDUPDistributed) {
			n.nodeToken6.accept(this, argu);
		}else {
			code.append("runmain");	
			hfile.append("/*initilizing constants*/ void initconstants();");
			initconstants.append("/*initilizing constants*/ void initconstants(){\n");
		}
		n.nodeToken7.accept(this, argu);
		//code.append("int argc, char *argv[]").append(" ");
		//n.nodeToken8.accept(this, argu);
		//n.nodeToken9.accept(this, argu);
		//n.nodeToken10.accept(this, argu);
		code.append("");
		//n.identifier1.accept(this, argu);
		n.nodeToken11.accept(this, argu);
		code.append("\n");
		n.nodeToken12.accept(this, argu);
		code.append("\n");
		//n.identifier2.accept(this, argu);
		//n.nodeToken13.accept(this, argu);
		if(!useDUPDistributed && useGarbageCollector) {
		code.append("GC_INIT();\n");
		}
		
		for(String temp : itemsNeededToBeInitilized){
			code.append(temp);
			if(useDUPDistributed) {
				initconstants.append(temp);
			}
		}
		
		n.identifier3.accept(this, argu);
		n.nodeToken14.accept(this, argu);
		n.nodeToken15.accept(this, argu);
		n.nodeToken16.accept(this, argu);
		code.append("\nreturn 0;\n");
		n.nodeToken17.accept(this, argu);
		//n.nodeToken18.accept(this, argu);
		code.append("\n");
		if(useDUPDistributed) {
			initconstants.append("\n}\n");
			code.append(initconstants);
		}
		
	}

	/**
	 * nodeToken -> "class" identifier -> Identifier() nodeToken1 -> "{"
	 * nodeListOptional -> ( ConstantDeclaration() )* nodeListOptional1 -> (
	 * StaticMethodDeclaration() )* nodeToken2 -> "}"
	 */
	public void visit(ProgramClass n, String argu) {
		blockid = 0;
		blockOverallId=0;
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
		 blockid = 0;
		 blockOverallId=0;
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
		if(myListAsyncConstructorClass.containsKey(currentClassName)) {
			String thisName = myListAsyncConstructorClass.get(currentClassName);
			code.append("struct "+ thisName+" "+ "THIS /*this*/;\n");
			aHashMapClasses.get(currentClassName).add(thisName);
			//System.out.println(thisName + " "+currentClassName);
			
		}
		
		code.append("\n");
		n.nodeListOptional.accept(this, argu);
		n.nodeListOptional1.accept(this, argu);
		
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		
		//myHFileStructs.add(n.identifier.nodeToken.tokenImage);
		
		
		code.append(";").append(" \n");
		className = n.identifier.nodeToken.tokenImage;
		int index = alP.indexOf(new Pair(className));
		//System.out.println(className);
		
		code.append("\n");
		//hfile.append(code);
		/*commented to fix dependency*/
		alP.get(index).setSetCode(code);
		code = temp;
		needsDefaultConstructor = true;
		n.nodeListOptional2.accept(this, argu);
		if(n.nodeListOptional2.size() == 0){
			String tempIdent = className;
			
			code.append(className+" * "+className+"_"+className+"(struct "+className+" * " +className+"THIS){return "+className+"THIS;}\n");
			myMethodHFileStructs.add(className + "* "+className+"_"+className+"(struct "+className+" * " +className+"THIS);\n");
			
		}else if(needsDefaultConstructor){
			StringBuffer codeTemp = new StringBuffer(); 
			codeTemp.append(className+"* "+className+"_"+className+"_0(");
		    codeTemp.append("struct "+className+" *"+ className+"THIS");		
			codeTemp.append("){return "+className+"THIS;}\n");
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
		 blockid = 0;
		 blockOverallId=0;
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
		if(myListAsyncConstructorClass.containsKey(currentClassName)) {
			String thisName = myListAsyncConstructorClass.get(currentClassName);
			code.append("struct "+ thisName+" "+ "THIS /*this*/;\n");
		
			
			//System.out.println(thisName + " "+currentClassName);
		}
		
		
		n.nodeListOptional.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		className = n.identifier.nodeToken.tokenImage;
		//myHFileStructs.add(n.identifier.nodeToken.tokenImage);
		int index = alP.indexOf(new Pair(className)); 
		code.append(";").append("\n ");
		
		code.append("\n");
		//hfile.append(code);
		/*commented to fix dependency*/
		
		alP.get(index).setSetCode(code);
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
		 blockid = 0;
		 blockOverallId=0;
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		
		
		String tempIdent = currentClassName;
		if(symbolTable.getClassType(tempIdent) != null 
				&&  symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
			code.append("\n").append(className +" ");
		}else{
			code.append("\n").append(className +" *");
		}
	
		
		code.append(className+"_");
		globalTemp++;
		
		if(myConstructorList.get(className).size() < 2){
		n.identifier.accept(this, argu);
		myMethodsForConstructors.put(n.identifier.nodeToken.tokenImage,className+"_"+myConstructorList.get(className).get(0));
		currentMethodName = n.identifier.nodeToken.tokenImage+"_"+myConstructorList.get(className).get(0);
		}else{
		code.append(className+"_"+myConstructorList.get(className).get(0));
		int x = myConstructorList.get(className).get(0);
		myMethodsForConstructors.put(n.identifier.nodeToken.tokenImage,className+"_"+myConstructorList.get(className).get(0));
		currentMethodName =n.identifier.nodeToken.tokenImage+"_"+x;
		//currentMethodName = n.identifier.nodeToken.tokenImage+"_"+myConstructorList.get(className).get(0);
		myConstructorList.get(className).add(myConstructorList.get(className).remove(0));
		}
		
		
		n.nodeToken1.accept(this, argu);
		
		code.append("struct "+className+" *"+ className+"THIS");
		if(myListAsyncConstructorClass.containsKey(currentClassName)) {
			String thisName = myListAsyncConstructorClass.get(currentClassName);
			code.append(", struct "+ thisName+" * "+ thisName+ "THIS /*this*/ ");
			
		}
		
		addComma = true;
		//handles adding the this item to  struct
		
		
		n.nodeOptional.accept(this, argu);
		if(n.nodeOptional.node == null){
			needsDefaultConstructor = false;
		}
		addComma = false;
		n.nodeToken2.accept(this, argu);
		//insideConstructor = true;
		myMethodHFileStructs.add(code.toString());
		tempBuffer.append(code);
		code = tempBuffer;
		n.block.accept(this, argu);
		int x = code.lastIndexOf("}");
		
		
		
		
		String tempConstructorString = "";
		if(symbolTable.getClassType(tempIdent) != null 
				&&  symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
			
			code.insert(x,"\n return  *"+className+"THIS" +"; \n\n");
			tempConstructorString = ""+className+"THIS->" +"";
		}else{
			code.insert(x,"\n return  "+className+"THIS" +"; \n\n");
			tempConstructorString = ""+className+"THIS." +"";
		}
		
		if(myListAsyncConstructorClass.containsKey(currentClassName)) {
			
			String thisName = myListAsyncConstructorClass.get(currentClassName);
			
			code.insert(x,tempConstructorString+"THIS = *" +thisName+ "THIS;" );
		}
		//insideConstructor = false;
		
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
			String tempIdent = n.identifier.nodeToken.tokenImage;
			n.type.accept(this, argu);
			if( (symbolTable.lookupField(tempIdent, currentClassName) != null 
					&& ((X10Class)(symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) ){
				code.append("/*VALUE*/ ");
			}else{
			code.append("* ");
			}
			
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
			String tempIdent = n.identifier.nodeToken.tokenImage;
			if ((symbolTable.lookupField(tempIdent, currentClassName) != null 
					&& ((X10Class)(symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName) !=null && ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE) ){
							code.append("/*value*/ ");
			}else{
				code.append("* ");
			}
			code.append(" /*const*/").append(" ");
		}else if(n.type.nodeChoice.choice instanceof UpdatableArrayType || n.type.nodeChoice.choice instanceof ValueArrayType){
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
			String tempIdent = n.identifier.nodeToken.tokenImage;
			if( ((symbolTable.lookupField(tempIdent, currentClassName) != null 
					&& ((X10Class)(symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName) !=null && ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE)) ){
			}else{
			code.append("*");
			}
		}else{
			n.type.accept(this, argu);
		}
		
		n.identifier.accept(this, argu);
		/*if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
			//code.append("[]");
		}*/
		n.nodeToken1.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "public" nodeToken1 -> "static" returnType -> ReturnType()
	 * identifier -> Identifier() nodeToken2 -> "(" nodeOptional -> (
	 * FormalParameterList() )? nodeToken3 -> ")" block -> Block()
	 */
	public void visit(StaticMethodDeclaration n, String argu) {
		 blockid = 0;
		 blockOverallId=0;
		 //inStaticMethod = true;
		 //n.nodeToken.accept(this, argu);
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		
		//n.nodeToken1.accept(this, argu);
		n.returnType.accept(this, argu);
		currentMethodName = n.identifier.nodeToken.tokenImage;	
		if((n.returnType.nodeChoice.choice instanceof Type) && (((Type)n.returnType.nodeChoice.choice).nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)((Type)n.returnType.nodeChoice.choice).nodeChoice.choice).nodeChoice.choice instanceof ClassNameType )){
			if(  (symbolTable.lookupMethodReturnType(currentClassName, currentMethodName) instanceof X10Class && ( (X10Class)symbolTable.lookupMethodReturnType(currentClassName, currentMethodName) ).type == Constants.ClassType.VALUE) ){
				
			}else{
			//System.out.println("=========="+""+n.identifier.nodeToken.tokenImage+" "+symbolTable.lookupMethodReturnType(currentClassName, currentMethodName);
			code.append(" * ");
			}
		
		}
	
		code.append("/*static*/");
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
		 blockid = 0;
		 blockOverallId=0;
		//n.nodeToken.accept(this, argu);
		StringBuffer tempBuffer = code;
		code = new StringBuffer();
		//inStaticMethod = false;
		n.returnType.accept(this, argu);
		currentMethodName = n.identifier.nodeToken.tokenImage;
		if((n.returnType.nodeChoice.choice instanceof Type) && (((Type)n.returnType.nodeChoice.choice).nodeChoice.choice instanceof NonArrayType) && (((NonArrayType)((Type)n.returnType.nodeChoice.choice).nodeChoice.choice).nodeChoice.choice instanceof ClassNameType )){
			
			if(  (symbolTable.lookupMethodReturnType(currentClassName, currentMethodName) instanceof X10Class && ( (X10Class)symbolTable.lookupMethodReturnType(currentClassName, currentMethodName) ).type == Constants.ClassType.VALUE) ){
			
			}else{
			code.append(" * ");
			}
		
		}
		
		n.identifier.accept(this, argu);
		
		n.nodeToken1.accept(this, argu);
		//adding this to methods
		if(addThisToMethods){
			code.append("struct "+className+" *"+ className+"THIS");
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
		//firstValue = true;
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
			String tempIdent = n.identifier.nodeToken.tokenImage;
			
			if(( (symbolTable.lookupField(tempIdent, currentClassName) !=null) && (( ((X10Class) (symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE))
					|| (symbolTable.lookupVariableInScope(tempIdent, blockid+1, currentClassName, currentMethodName) !=null) && ((X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid+1, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE)){
				//do nothing
				//System.out.println(tempIdent+" "+blockid+" "+currentClassName+" "+currentMethodName);
				//firstValue = false;
			}else{
				//System.out.println(symbolTable.lookupVariableInScope(tempIdent, blockid+1, currentClassName, currentMethodName) +"out "+tempIdent+" "+blockid+" "+currentClassName+" "+currentMethodName);
				code.append(" *").append(" ");
			}
			code.append("const").append(" ");
		}else if(n.type.nodeChoice.choice instanceof UpdatableArrayType || n.type.nodeChoice.choice instanceof ValueArrayType){
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
	    * nodeChoice -> UpdatableArrayType()
	    *       | ValueArrayType()
	    *       | NonArrayType()
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
		code.append("* ");
		String tempIdent = ((ClassNameType)n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
			if( symbolTable.getClassType(tempIdent) != null 
				&&  symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
			}else{
				code.append("* ");	
			}
		
		}else{
			n.nonArrayType.accept(this, argu);
			code.append("* ");

		}
		
		//n.nodeToken.accept(this, argu);
		//n.nodeToken1.accept(this, argu);

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
	    *       | DistType()
	    *       | RegionType()
	    *       | PointType()
	    *       | ClassNameType()
	    */
	public void visit(NonArrayType n, String argu) {
		
		n.nodeChoice.accept(this, argu);

	}

	/**
	 * nodeToken -> "boolean"
	 */
	public void visit(BooleanType n, String argu) {

		//n.nodeToken.accept(this, argu);
		code.append("uint32_t").append(" ");

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
		code.append("int16_t " );
		//n.nodeToken.accept(this, argu);

	}

	/**
	 * nodeToken -> "int"
	 */
	public void visit(IntegerType n, String argu) {

		//n.nodeToken.accept(this, argu);
		//int32_t
		code.append("int32_t ");

	}

	/**
	 * nodeToken -> "long"
	 */
	public void visit(LongType n, String argu) {

		//n.nodeToken.accept(this, argu);
		//code.append("long long ");
		code.append("int64_t ");
		//int64_t
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
		if(useDUPDistributed) {
		code.append("place_t ");
			//code.append("int ");
		}else {
		//code.append("int").append(" ");
		code.append("int32_t").append(" ");
		}
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
		blockOverallId++;
		int tempBlockId = blockid;
		blockid = blockOverallId;
		 
		// System.out.println(blockid);
		n.nodeToken.accept(this, argu);
		code.append("\n");
		n.nodeListOptional.accept(this, argu);
		
		n.nodeToken1.accept(this, argu);
		blockid = tempBlockId;
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
		
		isAssignment = true;
		//currentAssignment = n.identifier.nodeToken.tokenImage;
		String tempCalloc = "";
		if(  symbolTable.lookupVariableInScope(n.identifier.nodeToken.tokenImage, blockid, currentClassName, currentMethodName)!=null )
		{	Symbol sym = symbolTable.lookupVariableInScope(n.identifier.nodeToken.tokenImage, blockid, currentClassName, currentMethodName);
			if(sym.symbolType.isArrayValue) {
				if(!useCalloc){
					CallocCounter = generateTemps();
					tempCalloc = "void * TEMPCALLOCPOINTER"+CallocCounter+";\n";
				}
				ArrayInitReturnStatementPart1=n.identifier.nodeToken.tokenImage;
			}
				  
		}else{
			code.append("* ");	
		}
		StringBuffer temp = code;
		code = new StringBuffer();
		
		n.identifier.accept(this, argu);
		passToMyConstructor = n.identifier.nodeToken.tokenImage;
		n.nodeToken.accept(this, argu);
		
		
		StringBuffer codeTemp2 = code;
		code = new StringBuffer();
		
		
		
		//ArrayInitilizerSizeVariable = n.identifier.nodeToken.tokenImage;
		n.expression.accept(this, argu);
		//ArrayInitilizerSizeVariable = null;
		
		//added to handle array init and add void * calloc to store array size
		if(calledNewValueArray){
			temp.append(tempCalloc);
			calledNewValueArray=false;
			code.append(";"+ArrayInitStringBuffer);
			ArrayInitStringBuffer = new StringBuffer();
		}
		//added to handle optional array init
		else if(calledNewUpdateArray){
			calledNewUpdateArray=false;
			code.append(";"+ArrayInitStringBuffer);
			ArrayInitStringBuffer = new StringBuffer();
		}
		codeTemp2 = temp.append(codeTemp2);
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
		
		isAssignment = false;
	}

	 /**
	    * identifier -> Identifier()
	    * nodeToken -> "["
	    * identifierList -> IdentifierList()
	    * nodeToken1 -> "]"
	    * nodeToken2 -> "="
	    * nodeToken3 -> "("
	    * identifier1 -> Identifier()
	    * nodeToken4 -> ")"
	    * nodeToken5 -> ";"
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
			/*myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left+blockid)*/
		}else if( checkInLocalParameter(currentClassName, currentMethodName, left, blockid) ){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid) ;
		}
		if(leftPTN != null && leftPTN.getType().equals("%c")){
			//took out for warning 1205 code.append("&");
		}
		n.nodeToken3.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
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
	//	currentAssignment = n.identifier.nodeToken.tokenImage;
		//n.nodeToken.accept(this, argu);
		//n.identifier1.accept(this, argu);
		n.nodeToken1.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		code.append("\n");

	}

	/**
	 * nodeToken -> "this" nodeToken1 -> "." identifier -> Identifier()
	 * nodeToken2 -> "=" nodeToken3 -> "(" identifier1 -> Identifier()
	 * nodeToken4 -> ")" nodeToken5 -> ";"
	 */
	public void visit(ThisFieldAssignment n, String argu) {

		//n.nodeToken.accept(this, argu);
		//code.append("(*");
		code.append(className+"THIS->");
		//code.append(")");
		//currentAssignment = n.identifier.nodeToken.tokenImage;
		//n.nodeToken1.accept(this, argu);
		
		n.identifier.accept(this, argu);
		n.nodeToken2.accept(this, argu);
		n.nodeToken3.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		code.append("\n");

	}

	 /**
	    * nodeToken -> "async"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> "{"
	    * identifier1 -> Identifier()
	    * nodeToken4 -> "."
	    * identifier2 -> Identifier()
	    * nodeToken5 -> "("
	    * identifier3 -> Identifier()
	    * nodeToken6 -> ")"
	    * nodeToken7 -> ";"
	    * nodeToken8 -> "}"
	    */
	public void visit(AsyncStatement n, String argu) {

		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append("\n ");
		code.append("{\n");
		if(useDUPDistributed) {
		//n.nodeToken1.accept(this, argu);
		//n.identifier.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		code.append("struct _struct_async a;\n");
		
		code.append("a.method = ");
		//n.identifier1.accept(this, argu);
		//code.append(".");
		//n.nodeToken.accept(this, argu);
		String localType = "NULL";
		String specType = "NULL";
		String ident3 = n.identifier3.nodeToken.tokenImage;
		if(checkInLocalParameter(currentClassName, currentMethodName, ident3, blockid)){
			specType = getInLocalParameter(currentClassName, currentMethodName, ident3, blockid).getSpecificType();
			localType = getInLocalParameter(currentClassName, currentMethodName, ident3, blockid).getType();
		
		}
		myListAsyncCalls.add(new PairsTypeName(n.identifier2.nodeToken.tokenImage,localType ,false, specType));
		//n.identifier2.accept(this, argu);
		
		code.append(" (ASYNC"+(myListAsyncCalls.size()-1)+") ");
		code.append(";\n");
		code.append("a.size = sizeof(");
		n.identifier3.accept(this, argu);
		code.append(");\n");
		code.append("a.params = (void *)(&");
		n.identifier3.accept(this, argu);
		code.append(");\n");
     	code.append("task_dispatch(a, ");
		n.identifier.accept(this, argu);
		code.append(");\n");
		code.append("\n");
		
		}else {
		    //
			//n.identifier1.accept(this,argu);
		   //n.nodeToken4.accept(this,argu);
		    n.identifier2.accept(this,argu);
		    code.append("(");
		    n.identifier3.accept(this,argu);
		    code.append(");\n");
		}
		code.append("\n}/*END OF ASYNC*/\n");
	}

	 /**
	    * nodeToken -> "async"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> "{"
	    * nodeToken4 -> "this"
	    * nodeToken5 -> "."
	    * identifier1 -> Identifier()
	    * nodeToken6 -> "("
	    * identifier2 -> Identifier()
	    * nodeToken7 -> ")"
	    * nodeToken8 -> ";"
	    * nodeToken9 -> "}"
	    */
	   public void visit(AsyncStatementInConstructor n, String argu) {
		    code.append("/*").append(" ");
			n.nodeToken.accept(this, argu);
			code.append(" ").append("*/").append("\n ");
			code.append("{\n");
			if(useDUPDistributed) {
			code.append("struct _struct_async a;\n");
			
			code.append("a.method =");
			//n.identifier.accept(this, argu);
			//code.append(".");
			//n.nodeToken.accept(this, argu);
			
	      //n.nodeToken1.accept(this, argu);
	      //n.identifier.accept(this, argu);
	      //n.nodeToken2.accept(this, argu);
			
			String ident2 = n.identifier2.nodeToken.tokenImage;
			String localType ="NULL";
			String specType = "NULL";
			if(checkInLocalParameter(currentClassName, currentMethodName, ident2, blockid)){
				specType = getInLocalParameter(currentClassName, currentMethodName, ident2, blockid).getSpecificType();
				localType = getInLocalParameter(currentClassName, currentMethodName, ident2, blockid).getType();
			}
	      myListAsyncCalls.add(new PairsTypeName(n.identifier1.nodeToken.tokenImage,localType,true, specType));
	      
	      	code.append(" (ASYNC"+(myListAsyncCalls.size()-1)+") ");
			code.append(";\n");
			code.append("a.size = sizeof(");
			
				n.identifier2.accept(this, argu);
			code.append(");\n");
			code.append("a.params = (void *)(&");
			n.identifier2.accept(this, argu);
			code.append(");\n");
	     	code.append("task_dispatch(a, ");
			n.identifier.accept(this, argu);
			code.append(");\n");
			}else {
				
				  //code.append("program");
				    //n.nodeToken5.accept(this,argu);
				    n.identifier1.accept(this,argu);
				    code.append("(&"+n.identifier2.nodeToken.tokenImage+".THIS,");
				    n.identifier2.accept(this,argu);
				    code.append(");\n");
				
			}
			code.append("\n");
			code.append("}/*End of CONSTRUCTOR ASYNC*/\n");
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
//task_start_finish();
//task_end_finish();
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		if(useDUPDistributed) {
		code.append("task_start_finish();\n");
		}
		n.block.accept(this, argu);
		if(useDUPDistributed) {
		code.append("task_end_finish();\n");	
		}
		code.append("/*END OF FINISH*/\n");

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
	    * pointType -> PointType()
	    * explodedSpecification -> ExplodedSpecification() .. need value
	    * nodeToken2 -> ":"
	    * identifier -> Identifier()
	    * nodeToken3 -> ")"
	    * block -> Block()
	    */
	public void visit(LoopStatement n, String argu) {

		code.append("for ( ");
		n.pointType.accept(this,argu);
		n.explodedSpecification.accept(this, argu);
		code.append("= 0; ");
		n.explodedSpecification.accept(this, argu);
		code.append("<  ");
		code.append(n.identifier.nodeToken+"; ");
		n.explodedSpecification.accept(this, argu);
		code.append("++ )\n ");
		/*n.nodeToken2.accept(this, argu);
		n.identifier.accept(this, argu);
		
		n.integerLiteral.accept(this, argu);
		n.nodeToken4.accept(this, argu);
		n.identifier1.accept(this, argu);
		n.nodeToken5.accept(this, argu);
		n.identifier2.accept(this, argu);
		n.nodeToken6.accept(this, argu);
		n.identifier3.accept(this, argu);
		n.nodeToken7.accept(this, argu);
		n.nodeToken8.accept(this, argu);*/
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
		code.append("fprintf");
		n.nodeToken1.accept(this, argu);
		code.append(" stdout, ");
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		/*myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left+blockid)*/
		}else if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
		}/*else if(myClasses.get("Program").myFields.containsKey(left)){
			leftPTN = myClasses.get("Program").myFields.get(left);
		}
		else {
			System.out.println(checkInLocalParameter(currentClassName, currentMethodName, left, blockid-2));
			System.out.println(checkInLocalParameter(currentClassName, currentMethodName, left, blockid+2));
		}
		System.out.println("PP"+left+""+currentMethodName+""+currentClassName+" "+blockid);
		*/
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
		code.append("fprintf");
		n.nodeToken1.accept(this, argu);
		code.append(" stdout, ");
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
			/*myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.containsKey(left+blockid)*/
		}else if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
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
		}else if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
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

		
		if(ArrayInitReturnStatementPart2 != null){
			
			code.append(ArrayInitReturnStatementPart2);
			
		}else{
			n.nodeToken.accept(this, argu);
		}
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
		
		blockOverallId++;
		int tempBlockId = blockid;
		blockid = blockOverallId;
		
		code.append("\n");
		setIf = true;
		//sizeOfSwitch = n.nodeListOptional.size();
		n.nodeListOptional.accept(this, argu);
		
		
		blockid = tempBlockId;
		
		//sizeOfSwitch = 0;
		
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
		blockid ++;
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
		String left = n.identifier.nodeToken.tokenImage;
		PairsTypeName leftPTN = null;
		if(myClasses.get(currentClassName).myFields.containsKey(left)){
			
			leftPTN = myClasses.get(currentClassName).myFields.get(left);
		}else if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
		}/*else if(myClasses.get("Program").myFields.containsKey(left)){
			leftPTN = myClasses.get("Program").myFields.get(left);
		}*/
		if(leftPTN != null){
			code.append("\""+leftPTN.type+"\",");
		}
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
	    * nodeToken -> "final"
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken1 -> "="
	    * expression -> Expression()
	    * nodeToken2 -> ";"
	    */
	public void visit(FinalVariableDeclaration n, String argu) {
		
		// n.nodeToken.accept(this, argu);

		if (n.type.nodeChoice.choice instanceof NonArrayType
				&& (((NonArrayType) n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType)) {

			code.append("struct ");
			n.type.accept(this, argu);
			String tempIdent = n.identifier.nodeToken.tokenImage;
			// System.out.println(currentClassName+" "+currentMethodName+" "+tempIdent+" "+blockid+" ");

			if (((symbolTable.lookupField(tempIdent, currentClassName) != null && ((X10Class) (symbolTable
					.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable
					.lookupVariableInScope(tempIdent, blockid,
							currentClassName, currentMethodName) != null && ((X10Class) (symbolTable
					.lookupVariableInScope(tempIdent, blockid,
							currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE))) {

				// code.append(" ; ");
				// /code.append("\n");
			} else {
				code.append("* ");
			}

		
			n.identifier.accept(this, argu);
		

			n.expression = removeExpressionInParen(n.expression);
			if (n.expression.nodeChoice.choice instanceof NewObject) {
				if (((symbolTable.lookupField(tempIdent, currentClassName) != null && ((X10Class) (symbolTable
						.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable
						.lookupVariableInScope(tempIdent, blockid,
								currentClassName, currentMethodName) != null && ((X10Class) (symbolTable
						.lookupVariableInScope(tempIdent, blockid,
								currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE))) {

					code.append(" ; ");
					code.append("\n");
					passToMyConstructor = "&"
							+ n.identifier.nodeToken.tokenImage;
				} else {
					n.nodeToken1.accept(this, argu);
					code.append("(struct ");
					n.type.accept(this, argu);
					// code.append(" *) malloc(sizeof(struct ");
					code.append(" *)  ");
					if(useMallocProfiler){
						code.append("("+getMallocProfiler()+" sizeof(struct ");
						n.type.accept(this, argu);
						code.append("),");
					}
					code.append(malloc() + "(sizeof(struct ");
					n.type.accept(this, argu);
					code.append("))");
					if(useMallocProfiler){code.append(")");}
					
					n.nodeToken2.accept(this, argu);
					code.append(" \n");
					code.append("memset("+tempIdent);	
					code.append(",0,sizeof(struct ");
					n.type.accept(this, argu);
					code.append("));");
					code.append(" \n");
					passToMyConstructor = n.identifier.nodeToken.tokenImage;
				}

			} else {
				n.nodeToken1.accept(this, argu);

			}

			
			n.expression.accept(this, argu);
			passToMyConstructor = "";
			n.nodeToken2.accept(this, argu);
			code.append("\n");
			
		} else if (n.type.nodeChoice.choice instanceof UpdatableArrayType) {
			 
			StringBuffer temp = code;
			code = new StringBuffer();
			String tempCalloc = "";
			if (!useCalloc) {
				CallocCounter = generateTemps();
				tempCalloc = "void * TEMPCALLOCPOINTER" + CallocCounter + ";\n";
			}

			n.type.accept(this, argu);
			code.append("const").append(" ");
			n.identifier.accept(this, argu);

			// code.append("[]");
			//to handle return name for array assignment
			ArrayInitReturnStatementPart1 = n.identifier.nodeToken.tokenImage;
			n.nodeToken1.accept(this, argu);
			
			n.expression.accept(this, argu);
			n.nodeToken2.accept(this, argu);
			if (calledNewUpdateArray) {
				temp.append(tempCalloc);
			}
			code = temp.append(code);
			calledNewUpdateArray = false;
			code.append("\n");
			//added to handle optional arrayInit
			code.append(ArrayInitStringBuffer);
			ArrayInitStringBuffer = new StringBuffer();
			
		} else if (n.type.nodeChoice.choice instanceof ValueArrayType) {

			code.append("/*VALUE ARRAY FOR SURE*/\n");
			StringBuffer temp = code;
			code = new StringBuffer();
			String tempCalloc = "";
			if (!useCalloc) {
				CallocCounter = generateTemps();
				tempCalloc = "void * TEMPCALLOCPOINTER" + CallocCounter + ";\n";
			}
			n.type.accept(this, argu);
			code.append("const").append(" ");
			n.identifier.accept(this, argu);
			// code.append("[]");
			ArrayInitReturnStatementPart1 = n.identifier.nodeToken.tokenImage;
			// ArrayInitilizerSizeVariable = n.identifier.nodeToken.tokenImage;
			n.nodeToken1.accept(this, argu);
			n.expression.accept(this, argu);
			n.nodeToken2.accept(this, argu);
			code.append("\n");

			if (calledNewValueArray) {
				temp.append(tempCalloc);
			}
			code = temp.append(code);
			calledNewValueArray = false;
			code.append(ArrayInitStringBuffer);
			ArrayInitStringBuffer = new StringBuffer();
		} else {

			// currentAssignment = n.identifier.nodeToken.tokenImage;
			StringBuffer tempCode = code;
			code = new StringBuffer();

			code.append("const").append(" ");
			n.type.accept(this, argu);
			n.identifier.accept(this, argu);
			n.nodeToken1.accept(this, argu);
			nonePointerVarOnLeft = false;

			StringBuffer codeTemp2 = code;
			code = new StringBuffer();
			ArrayInitilizerSizeVariable = n.identifier.nodeToken.tokenImage;
			n.expression.accept(this, argu);
			ArrayInitilizerSizeVariable = null;
			nonePointerVarOnLeft = false;
			if (globalTempValue != null) {

				codeTemp2.append(globalTempValue + ";");
				code.append(codeTemp2);
				tempCode.append(code);
				code = tempCode;
			}

			else {
				codeTemp2.append(code);
				tempCode.append(codeTemp2);
				code = tempCode;
			}
			globalTempValue = null;
			n.nodeToken2.accept(this, argu);
			code.append("\n");

		}

	}

	private Expression removeExpressionInParen(Expression expression) {
		if(expression.nodeChoice.choice instanceof ExpressionInParentheses){
			 return ((ExpressionInParentheses)expression.nodeChoice.choice).expression;
		}else{
			return expression;
		}
		
	}

	/**
	 * type -> Type() identifier -> Identifier() nodeToken -> "=" expression ->
	 * Expression() nodeToken1 -> ";"
	 */
	public void visit(UpdatableVariableDeclaration n, String argu) {

		code.append("/*UpdatableVariableDeclaration*/\n");
		
		
		if(n.type.nodeChoice.choice instanceof NonArrayType && ( ((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType))
		{   String tempIdent = n.identifier.nodeToken.tokenImage;
			code.append(" struct ");
			n.type.accept(this, argu);
			//System.out.println(currentClassName+" "+currentMethodName+" "+tempIdent+" "+blockid+" ");
			if( ((symbolTable.lookupField(tempIdent, currentClassName) != null 
					&& ((X10Class)(symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName) !=null && ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE)) ){
				n.identifier.accept(this, argu);
				n.nodeToken.accept(this, argu);
				
			}else{
				code.append(" * ");
				n.identifier.accept(this, argu);
			}
			
			
			//if(n.type.nodeChoice.choice instanceof UpdatableArrayType){
				//code.append("[]");
			//}
			//n.nodeToken1.accept(this, argu);
			//code.append("\n");
			//n.identifier.accept(this, argu);
			n.expression = removeExpressionInParen(n.expression);
			if(!( ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE)  && n.expression.nodeChoice.choice instanceof NewObject ){
				n.nodeToken.accept(this, argu);
				code.append("(struct ");
				n.type.accept(this, argu);
				 
				 code.append(" *) ");
					if(useMallocProfiler){
						code.append("("+getMallocProfiler()+" sizeof(struct ");
						n.type.accept(this, argu);
						code.append("),");
					}
				 code.append(mallocuc()+"(sizeof(struct ");
				//code.append(" *) malloc(sizeof(struct ");
				n.type.accept(this, argu);
				code.append("))");
				if(useMallocProfiler){code.append(")");}
				
				n.nodeToken1.accept(this, argu);
				
				
				code.append(" \n");
				code.append("memset("+tempIdent);	
				code.append(",0,sizeof(struct ");
				n.type.accept(this, argu);
				code.append("));");
				code.append(" \n");
				passToMyConstructor = n.identifier.nodeToken.tokenImage;
				
				
			}else if ( ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE ){
				
				passToMyConstructor = "&"+n.identifier.nodeToken.tokenImage;
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
	    * nodeChoice -> ExpressionInParentheses()
	    *       | ConditionalOrExpression()
	    *       | SimpleDistributionExpression()
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
	    *       | PlusOffset()
	    *       | PlusExpression()
	    *       | MinusExpression()
	    *       | TimesOffset()
	    *       | TimesExpression()
	    *       | DivideOffset()
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
	    *       | PointAccess()
	    *       | MethodCall()
	    *       | MethodCallInConstructor()
	    *       | DotId()
	    *       | DotIdentifierDotGet()
	    *       | DotNext()
	    *       | DotPrev()
	    *       | DotIsFirst()
	    *       | DotIsLast()
	    *       | DotRegionDotSize()
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
	public void visit(Expression n, String argu) {
				n.nodeChoice.accept(this, argu);
		

	}

	/**NEEDS A FIX FOR STRINGS TODO
	 * nodeToken -> "(" expression -> Expression() nodeToken1 -> ")"
	 */
	public void visit(ExpressionInParentheses n, String argu) {

		//n.nodeToken.accept(this, argu);
		n.expression.accept(this, argu);
		//n.nodeToken1.accept(this, argu);

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
		
			
		
		 if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
				leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
			
			}else if(myClasses.get(currentClassName).myFields.containsKey(left)){
						leftPTN = myClasses.get(currentClassName).myFields.get(left);
					}/*else if(myClasses.get("Program").myFields.containsKey(left)){
						leftPTN = myClasses.get("Program").myFields.get(left);
					}*/
					else{
						
					}
		 if(checkInLocalParameter(currentClassName, currentMethodName, right, blockid)){
				rightPTN = getInLocalParameter(currentClassName, currentMethodName, right, blockid);
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
		
			
				
		 if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
				leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
			
			}else if(myClasses.get(currentClassName).myFields.containsKey(left)){
						leftPTN = myClasses.get(currentClassName).myFields.get(left);
					}/*else if(myClasses.get("Program").myFields.containsKey(left)){
						leftPTN = myClasses.get("Program").myFields.get(left);
					}*/
					else{
						
					}
		 if(checkInLocalParameter(currentClassName, currentMethodName, right, blockid)){
				rightPTN = getInLocalParameter(currentClassName, currentMethodName, right, blockid);
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
			
			code.append(" char * "+tempValue +" = (char *)"+malloc()+"(1000 * sizeof(char));\n");
			if(useMallocProfiler){
				code.append(getMallocProfiler()+" 1000 * sizeof(char)"); code.append(";\n");
			}
			//code.append(" char * "+tempValue +" = (char *)malloc(1000 * sizeof(char));\n");
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
		//n.nodeToken1.accept(this, argu);
		code.append("int32_t ");
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
		//n.nodeToken1.accept(this, argu);
		//code.append("long long /*CASTING*/");
		code.append("int64_t ");
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
		//n.nodeToken1.accept(this, argu);
		code.append("int16_t ");
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
		if(!useDUPDistributed) {
		code.append("0").append(" ");
		}else {
			code.append("_toplace(");
			n.identifier.accept(this, argu);
			code.append(")");
		}
		//code.append("\n");
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
		}else if(checkInLocalParameter(currentClassName, currentMethodName, left, blockid)){
			leftPTN = getInLocalParameter(currentClassName, currentMethodName, left, blockid);
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
		//code.append(className+"THIS->");
		n.identifier.accept(this, argu);
		//n.identifier.nodeToken.tokenImage;
		
		n.nodeToken2.accept(this, argu);
		code.append(className+"THIS");
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
		
		if(!useDUPDistributed) {
			code.append("0").append(" ");
			}else {
				code.append(""+n.identifier.nodeToken.tokenImage+"");
			}
		
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
		if(!useDUPDistributed) {
			
			code.append("0").append(" ");
		}else {
			code.append("_place_next("+n.identifier.nodeToken.tokenImage+")");
			
		}
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
		if(!useDUPDistributed) {
			code.append("0").append(" ");
		}else {
			code.append("_place_prev("+n.identifier.nodeToken.tokenImage+")");
		}
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
		if(!useDUPDistributed) {
			code.append("1").append(" ");
		}else {
			code.append("_isfirst("+n.identifier.nodeToken.tokenImage+")");
			
		}
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
		if(!useDUPDistributed) {
			code.append("1").append(" ");
		}else {
			code.append(" _islast("+n.identifier.nodeToken.tokenImage+")");
			
		}
		
		
	//	code.append("\n");
	}

	/**
	 * identifier -> Identifier() nodeToken -> "." nodeToken1 -> "length"
	 */
//	public void visit(DotLength n, String argu) {
//		code.append("/*FIX*/ 0");
//		//n.identifier.accept(this, argu);
//		//n.nodeToken.accept(this, argu);
//		//n.nodeToken1.accept(this, argu);
//	//	code.append("\n");
//	}

	/**
	 * identifier -> Identifier() nodeToken -> "." identifier1 -> Identifier()
	 */
	public void visit(DotIdentifier n, String argu) {
		String programTemp = n.identifier.nodeToken.tokenImage;
		if(programTemp.equals("Program")){
			code.append("/*program*/");
			n.identifier1.accept(this, argu);
		}else{
			
			/*if(nonePointerVarOnLeft){
				code.append("*(");
				n.identifier.accept(this, argu);
				code.append("->");
				n.identifier1.accept(this, argu);
			    code.append(")");
			}else{*/
			//code.append("*(");
		n.identifier.accept(this, argu);
		//n.nodeToken.accept(this, argu);
		String tempIdent = n.identifier.nodeToken.tokenImage;
		if((symbolTable.lookupField(tempIdent, currentClassName) != null 
				&& ((X10Class)(symbolTable.lookupField(tempIdent, currentClassName).symbolType)).type == Constants.ClassType.VALUE) || (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName) !=null && ( (X10Class) (symbolTable.lookupVariableInScope(tempIdent, blockid, currentClassName, currentMethodName).symbolType)).type == Constants.ClassType.VALUE) ){
		code.append(".");
		}else{
			code.append("->");	
		}
		n.identifier1.accept(this, argu);
			//}
		//code.append(")");
		}
	//	code.append("\n");
	}

	/**TODO GENERATE TEMPS
	 * nodeToken -> "new" identifier -> Identifier() nodeToken1 -> "("
	 * nodeOptional -> [ IdentifierList() ] nodeToken2 -> ")"
	 */
	public void visit(NewObject n, String argu) {


		
		StringBuffer sb = code;
		code = new StringBuffer();
		
		//builds the constructor call name
		if(!myConstructorList.containsKey(n.identifier.nodeToken.tokenImage) || !(myConstructorList.get(n.identifier.nodeToken.tokenImage) .size() > 1)){
			code.append(n.identifier.nodeToken.tokenImage + "_" + n.identifier.nodeToken.tokenImage);
			
		}
			
		
		n.nodeToken1.accept(this, argu);
		//had a & here
		String tempIdent = n.identifier.nodeToken.tokenImage;
		if(isAssignment && symbolTable.getClassType(tempIdent) != null 
				&&  symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
			code.append("&"+"");
			isAssignment = false;
		}
		code.append(passToMyConstructor+"/*OBJECT INIT IN ASSIGNMENT*/");
		
		//handles this passing for threads 
		if(myListAsyncConstructorClass.containsKey(n.identifier.nodeToken.tokenImage)) {
			String thisName = myListAsyncConstructorClass.get(n.identifier.nodeToken.tokenImage);
			code.append(", "+ thisName + "THIS /*this*/");
			
		}
		addComma = true;
		totalParameters=0;
		n.nodeOptional.accept(this, argu);
		
		//handles passing the object obj to init.
		if(myConstructorList.containsKey(n.identifier.nodeToken.tokenImage) && (myConstructorList.get(n.identifier.nodeToken.tokenImage) .size() > 1)){
			StringBuffer sbTemp = code;
			code = new StringBuffer();
			code.append(n.identifier.nodeToken.tokenImage+"_"+n.identifier.nodeToken.tokenImage+"_"+totalParameters);
			//maybe where it goes.
			
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
		//code.append("HERE");
		calledNewUpdateArray=true;
		//n.nodeToken.accept(this, argu);
		
		code.append("(");
		//n.nonArrayType.accept(this, argu);
		
		String pointer = "";
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
		 String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
			if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
				}else{
					pointer = "* ";
					//code.append("* ");	
				}
			
		}
		
		//code.append("*)");
		if (useCalloc) {
		code.append(calloc()+"("+n.identifier.nodeToken.tokenImage+",sizeof( ");
		//code.append("calloc("+n.identifier.nodeToken.tokenImage+",sizeof( ");
		n.nonArrayType.accept(this, argu);
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
			String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
			if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
				}else{
					code.append("* ");	
				}
			}
		code.append("))");	
		}else {
			String valueClass=  "";
			if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
				String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
				if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
					}else{
						valueClass= "* ";
						pointer = "*";
					}
				}
			
			
			String temp = "TEMPCALLOCPOINTER"+CallocCounter;
			//code.append(" "+temp+" = malloc(sizeof(int)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
			code.append(" "+temp+" = "+mallocuc()+"(sizeof(int32_t)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
			n.nonArrayType.accept(this, argu);
			code.append(valueClass+"))),   ");
			if(useMallocProfiler){
				code.append(getMallocProfiler()+"sizeof(int32_t)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
						n.nonArrayType.accept(this, argu);
						code.append(valueClass+"))"+",");
				
			}
			//add size to 
			
			code.append("((int32_t * )"+temp+")[0] = "+n.identifier.nodeToken.tokenImage+", "+temp+" = ((int32_t * )"+temp+")+1, memset("+temp+",0,"+n.identifier.nodeToken.tokenImage);
			//code.append("((int * )"+temp+")[0] = "+n.identifier.nodeToken.tokenImage+", "+temp+" = ((int * )"+temp+")+1, memset("+temp+",0,"+n.identifier.nodeToken.tokenImage);
			
			code.append("*sizeof(");
			n.nonArrayType.accept(this, argu);code.append(pointer+")");
			code.append(" ) ");
			
			
		}
		
		if(n.nodeOptional.present()){
			
			StringBuffer temp = code;
		code = new StringBuffer();
		
		ArrayInitilizerSizeVariable = n.identifier.nodeToken.tokenImage;
		
		n.nodeOptional.accept(this,argu);
		ArrayInitStringBuffer = code;
		code = temp;
		
		ArrayInitilizerSizeVariable = "/*DEAD*/";
		calledNewValueArray = true;
		}
		//n.nodeToken1.accept(this, argu);
		//n.identifier.accept(this, argu);
		//n.nodeToken2.accept(this, argu);
		
		code.append(")");

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
		//code.append("0").append(" ");
		if(!useDUPDistributed) {
			code.append("0").append(" ");
			}else {
				code.append("_here()");
			}
	}

	/**
	 * nodeToken -> "place.FIRST_PLACE"
	 */
	public void visit(PlaceFirstPlace n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		if(useDUPDistributed) {
		code.append("_place_first()");
		}else {
		code.append("0").append(" ");
		}
	}

	/**
	 * nodeToken -> "place.LAST_PLACE"
	 */
	public void visit(PlaceLastPlace n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		if(useDUPDistributed) {
			code.append("_place_last()");
			}else {
			code.append("0").append(" ");
			}
	}

	/**
	 * nodeToken -> "place.MAX_PLACES"
	 */
	public void visit(PlaceMaxPlaces n, String argu) {
		code.append("/*").append(" ");
		n.nodeToken.accept(this, argu);
		code.append(" ").append("*/").append(" ");
		
		if(useDUPDistributed) {
			code.append("_max_places()");
			}else {
			code.append("1").append(" ");
			}
	}

	/**
	 * nodeToken -> "java.lang.Integer.SIZE"
	 */
	public void visit(JavaIntegerSize n, String argu) {
		//n.nodeToken.accept(this, argu);
		//code.append("8*sizeof(int)");
		code.append("8*sizeof(int32_t)");
	}
	public String makeTimeMethod(){
		String st = "const double getTIME()";
		st+="{\n";
		//st+= "unsigned long long microsecs;\n";
		st+= "uint64_t microsecs;\n";
		st+= "struct timeval tv; \n";
		st+= "gettimeofday(&tv, NULL);\n";
		st+= "microsecs = ((uint64_t)tv.tv_sec * 1000000);\n";
		//st+= "microsecs = ((unsigned long long)tv.tv_sec * 1000000);\n";
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
	
	/**
	    * nonArrayType -> NonArrayType()
	    * nodeToken -> "value"
	    * nodeToken1 -> "["
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> "]"
	    */
	public void visit(ValueArrayType n, String argu) {
		code.append("/*VALUE ARRAY*/ ");
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
			code.append("struct ");	
			n.nonArrayType.accept(this, argu);
			code.append("* ");
			String tempIdent = ((ClassNameType)n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
				if( symbolTable.getClassType(tempIdent) != null 
					&&  symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
				}else{
					code.append("* ");	
				}
			
			}else{
				n.nonArrayType.accept(this, argu);
				code.append("* ");

			}
		
	}
		/**
	    * nodeToken -> "rank==1"
	    */
	public void visit(RankEquation n, String argu) {
		//code.append("int ");
		code.append("int32_t ");
	}

	public void visit(DistType n, String argu) {
		//code.append("int ");
		code.append("int32_t ");
	}

	public void visit(RegionType n, String argu) {
		//code.append("int ");
		code.append("int32_t ");
		
	}
	   /**
	    * nodeToken -> "point"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> ")"
	    */
	public void visit(PointType n, String argu) {
		//code.append("int ");
		code.append("int32_t ");
		
	}


	   /**
	    * nodeChoice -> PointName()
	    *       | Coordinates()
	    */

	public void visit(ExplodedSpecification n, String argu) {
		if(n.nodeChoice.choice instanceof PointName) {
			code.append(""+((PointName)n.nodeChoice.choice).identifier.nodeToken.tokenImage);
			
		}else if(n.nodeChoice.choice instanceof Coordinates) {
			code.append(""+((Coordinates)n.nodeChoice.choice).identifier.nodeToken.tokenImage);
		}else {
			code.append("ERROR");
		}
		
	}
	/**
	    * identifier -> Identifier()
	    */
	public void visit(PointName n, String argu) {
		code.append("/*PointName*/ ");
		n.identifier.accept(this, argu);
		
	}
	 /**
	    * nodeToken -> "["
	    * identifier -> Identifier()
	    * nodeToken1 -> "]"
	    */
	public void visit(Coordinates n, String argu) {
		code.append("/*Coordinates*/ ");
		n.identifier.accept(this, argu);
		
	}
	 /**
	    * nodeToken -> "["
	    * nodeToken1 -> "0 :"
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    * nodeToken3 -> "->"
	    * nodeToken4 -> "here"
	    */
	public void visit(SimpleDistributionExpression n, String argu) {
		// TODO Auto-generated method stub
		code.append("/*SimpleDistributionExpression*/ ");
		n.identifier.accept(this,argu); code.append("+1");
	}
	/**
	    * identifier -> Identifier()
	    * nodeToken -> "+"
	    * nodeToken1 -> "["
	    * identifierList -> IdentifierList()
	    * nodeToken2 -> "]"
	    */
	public void visit(PlusOffset n, String argu) {
		code.append(n.identifier.nodeToken+"+");
		n.identifierList.accept(this, argu);
		
	}

	public void visit(TimesOffset n, String argu) {
		code.append(n.identifier.nodeToken+"*");
		n.identifierList.accept(this, argu);
	}

	public void visit(DivideOffset n, String argu) {
		code.append(n.identifier.nodeToken+"/");
		n.identifierList.accept(this, argu);
	}
	  /**
	    * nodeToken -> "["
	    * nodeToken1 -> "0 :"
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    */
	public void visit(RegionConstant n, String argu) {
		n.identifier.accept(this, argu);
		code.append("+ 1");
	}
	
	/**
	    * nodeToken -> "("
	    * typeAnnotation -> TypeAnnotation()
	    * nodeToken1 -> ")"
	    * nodeToken2 -> "("
	    * expression -> Expression()
	    * nodeToken3 -> ")"
	    */
	public void visit(TypeAnnotatedExpression n, String argu) {
		code.append("(");
		n.typeAnnotation.accept(this, argu);
		code.append(") ");
		//code.append("(");
		n.expression.accept(this, argu);
		//code.append(")");
	}
	 /**
	    * nodeChoice -> UpdatableArrayType()
	    *       | ValueArrayType()
	    *       | DistType()
	    *       | RegionType()
	    *       | PointType()
	    */
	public void visit(TypeAnnotation n, String argu) {
		n.nodeChoice.accept(this, argu);
		
	}
	/**FIX?
	    * identifier -> Identifier()
	    * nodeToken -> "[0]"
	    */
	public void visit(PointAccess n, String argu) {
		code.append("/*PointAccess*/");
		n.identifier.accept(this,argu);
		
	}
	 /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "region"
	    * nodeToken2 -> "."
	    * nodeToken3 -> "size"
	    * nodeToken4 -> "("
	    * nodeToken5 -> ")"
	    */
	public void visit(DotRegionDotSize n, String argu) {
		// TODO Auto-generated method stub
		code.append(n.identifier.nodeToken.tokenImage+"."+"region"+"."+"size");
		
	}
	/**
	    * nodeToken -> "new"
	    * nonArrayType -> NonArrayType()
	    * nodeToken1 -> "value"
	    * nodeToken2 -> "["
	    * identifier -> Identifier()
	    * nodeToken3 -> "]"
	    * arrayInitializer -> ArrayInitializer()
	    */
	public void visit(NewValueArray n, String argu) {
		code.append("/*New VALUE ARRAY*/");
		//n.nodeToken.accept(this, argu);
		String pointer = "";
		ArrayInitilizerSizeVariable = n.identifier.nodeToken.tokenImage;
		code.append("(");
	//	n.nonArrayType.accept(this, argu);
		
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
		
			String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
			if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
				}else{
					pointer = "*";
					//line cut
					//code.append("* ");	
				}
			
		}
		
	//	code.append("*)");
		if (useCalloc) {
		code.append(calloc()+"("+n.identifier.nodeToken.tokenImage+",sizeof( ");
		//code.append("calloc("+n.identifier.nodeToken.tokenImage+",sizeof( ");
		n.nonArrayType.accept(this, argu);
		if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
			String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
			if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
				}else{
					code.append("* ");	
				}
			}
		code.append("))");	
		}else {
			//MALLOC!!! SWITHC SIZEOF(int)+SIZEOF(N) and move it plus SIZEOF(INT)
			//USE COMMA OPERATOR 1st malloc 2nd storesize 3rd memset+1
			String valueClass=  "";
			if(n.nonArrayType.nodeChoice.choice instanceof ClassNameType){
				String tempIdent = ((ClassNameType) n.nonArrayType.nodeChoice.choice).identifier.nodeToken.tokenImage;
				if(   symbolTable.getClassType(tempIdent) == Constants.ClassType.VALUE  ){
					}else{
						valueClass= "* ";	
						pointer = "*";
					}
				}
			
			String temp = "TEMPCALLOCPOINTER"+CallocCounter;
			//code.append(" "+temp+" = malloc(sizeof(int)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
			code.append(" "+temp+" = "+malloc()+"(sizeof(int32_t)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
			n.nonArrayType.accept(this, argu);
			code.append(valueClass+"))),   ");
			//add size to 
			if(useMallocProfiler){
				code.append(getMallocProfiler()+"sizeof(int32_t)+("+n.identifier.nodeToken.tokenImage+"*sizeof( ");
						n.nonArrayType.accept(this, argu);
						code.append(valueClass+"))"+",");
				
			}
			//code.append("((int * )"+temp+")[0] = "+n.identifier.nodeToken.tokenImage+", "+temp+" = ((int * )"+temp+")+1, memset("+temp+",0,"+n.identifier.nodeToken.tokenImage);
			code.append("((int32_t * )"+temp+")[0] = "+n.identifier.nodeToken.tokenImage+", "+temp+" = ((int32_t * )"+temp+")+1, memset("+temp+",0,"+n.identifier.nodeToken.tokenImage);
			code.append("*sizeof(");n.nonArrayType.accept(this, argu);code.append(pointer+")");
			code.append(") ");
		}
		StringBuffer temp = code;
		code = new StringBuffer();
		  
		
		n.arrayInitializer.accept(this,argu);
		ArrayInitStringBuffer = code;
		code = temp;
		
		ArrayInitilizerSizeVariable = "/*DEAD*/";
		calledNewValueArray = true;
		code.append(")");
	}

	   /**
	    * nodeToken -> "("
	    * pointType -> PointType()
	    * explodedSpecification -> ExplodedSpecification()
	    * nodeToken1 -> ")"
	    * block -> Block()
	    */
	public void visit(ArrayInitializer n, String argu) {
		//handle nested arrayInitLoops
		String temp = ArrayInitReturnStatementPart2;
		code.append("\n/*ArrayInitializer*/\n");
		code.append("for");  
		n.nodeToken.accept(this, argu);
		   n.pointType.accept(this, argu);
		  n.explodedSpecification.accept(this, argu);
		  code.append(" = 0;");
		  n.explodedSpecification.accept(this, argu);
		  code.append(" < "+ArrayInitilizerSizeVariable);
		  code.append("; ");
		  n.explodedSpecification.accept(this, argu);
		  code.append("++");
		  n.nodeToken1.accept(this, argu);
		  code.append("\n");
		  if(n.explodedSpecification.nodeChoice.choice instanceof PointName){
			  ArrayInitReturnStatementPart1 += "["+((PointName)n.explodedSpecification.nodeChoice.choice).identifier.nodeToken.tokenImage+"] = ";
		  }else if(n.explodedSpecification.nodeChoice.choice instanceof Coordinates){
			  ArrayInitReturnStatementPart1 += "["+((Coordinates)n.explodedSpecification.nodeChoice.choice).identifier.nodeToken.tokenImage+"] = ";
		  }
		  ArrayInitReturnStatementPart2=ArrayInitReturnStatementPart1;
		  n.block.accept(this, argu);
		  code.append("/*END OF ARRAY INIT*/");
		  ArrayInitReturnStatementPart1=null;
		  ArrayInitReturnStatementPart2=null;
		  ArrayInitReturnStatementPart2 = temp;
	}

	private StringBuffer getArraySizeOf() {
		StringBuffer sbTemp = new StringBuffer();
		for (String className : symbolTable.symbolTable.keySet()) {
			SymbolTableClassEntry stce = symbolTable.symbolTable.get(className);
			if (stce.classType == ClassType.VALUE) {
				String ptr = "className" + " -> ";
				//modified to be int32_t
				String temp = "int32_t getSizeOf" + stce.className + "( struct "
						+ stce.className + " * className" + ")";
				hfile.append(temp + ";\n");
				temp += " {\n";
				// temp +=
				// "    int temp = sizeof(struct "+stce.className+");\n";
				//temp += "    int temp = 0;\n";
				//temp += "    int size = 0;\n";
				temp += "    int32_t temp = 0;\n";
				temp += "    int32_t size = 0;\n";
				
				for (SymIndex fieldName : stce.fields.keySet()) {
					Symbol field = stce.fields.get(fieldName);
					if (field.symbolType.isArrayValue) {
						X10Type array = field.symbolType;
						temp += "		temp += sizeof(int);\n";
						temp += "		size = *(((int32_t *)" + ptr
								+ fieldName.symbolName + ")-1);\n";
						temp += "		temp += size*sizeof("
								+ array.getFlatTypeName() + ");\n";
						
						if (array instanceof X10Class
								&& symbolTable.symbolTable.get(array.typeName).classType == ClassType.VALUE) {
							temp += "	for(int32_t i = 0; i<size; i++) {\n";
							temp += "		temp += getSizeOf"
									+ field.symbolType.getTypeName() + "(&("
									+ ptr + fieldName.symbolName + "[i]));\n";
							temp += "	}\n";
						}
					} else if (field.symbolType instanceof X10Class
							&& symbolTable.symbolTable
									.get(field.symbolType.typeName).classType == ClassType.VALUE) {
						temp += "    temp += getSizeOf"
								+ field.symbolType.typeName + "(&(" + ptr
								+ fieldName.symbolName + "));\n";
					}

				}
				temp += "return temp;\n }\n";
				sbTemp.append(temp);
			}
		}
		return sbTemp;
	}

	private StringBuffer getDeepCopy() {
		StringBuffer sbTemp = new StringBuffer();
		for (String className : symbolTable.symbolTable.keySet()) {
			SymbolTableClassEntry stce = symbolTable.symbolTable.get(className);
			if (stce.classType == ClassType.VALUE) {
				String ptr = "className" + " -> ";
				String temp = "void* deepCopy" + stce.className + "( struct "
						+ stce.className + " * className" + ", void * offset)";
				hfile.append(temp + ";\n");
				temp += " {\n";
				temp += "    int32_t temp = 0;\n";
				temp += "    int32_t size = 0;\n";
				temp += "    int32_t i = 0;\n";
				for (SymIndex fieldName : stce.fields.keySet()) {
					Symbol field = stce.fields.get(fieldName);
					if (!field.symbolType.isArrayValue
							&& (field.symbolType instanceof X10Class)
							&& symbolTable.symbolTable
									.get(field.symbolType.typeName).classType == ClassType.VALUE) {
						temp += "offset = deepCopy"
								+ field.symbolType.getTypeName() + "(&(" + ptr
								+ fieldName.symbolName + "), offset);\n";
					} else if (field.symbolType.isArrayValue) {
						temp += "size = *(((int32_t *)" + ptr
								+ fieldName.symbolName + ")-1);\n";
						temp += "*((int32_t *)offset) = size;\n";
						temp += "offset += sizeof(int32_t);\n";
						temp += "temp = size*sizeof("
								+ field.symbolType.getFlatTypeName() + ");\n";
						temp += "memcpy(offset, (void *) " + ptr
								+ fieldName.symbolName + ", temp);\n";
						temp += "offset += temp;\n";
						// if value class then need to fix internal value arrays
						if (field.symbolType instanceof X10Class
								&& symbolTable.symbolTable
										.get(field.symbolType.typeName).classType == ClassType.VALUE) {
							// calculate size of array of points and add that
							// too offset
							temp += "    for(int32_t i = 0; i<size; i++) {\n";
							temp += "    offset = deepCopy"
									+ field.symbolType.typeName + "(&(" + ptr
									+ fieldName.symbolName + "[i]), offset);\n";
							temp += "    }\n";
						}
					}
				}
				temp += "return offset;\n }\n";
				sbTemp.append(temp);
			}
		}
		return sbTemp;
	}

	private StringBuffer getFixPointers() {
		StringBuffer sbTemp = new StringBuffer();
		for (String className : symbolTable.symbolTable.keySet()) {

			SymbolTableClassEntry stce = symbolTable.symbolTable.get(className);
			if (stce.classType == ClassType.VALUE) {
				String ptr = "className" + " -> ";

				String temp = "void * fixPointer" + stce.className + "( struct "
						+ stce.className + " * className" + ", void * offset)";
				hfile.append(temp + ";\n");
				temp += " {\n";
				temp += "    int32_t temp = 0;\n";
				temp += "    int32_t size = 0;\n";
				temp += "    int32_t i = 0;\n";
				// find sizeoff offset for structure.
				// temp+="if(offset ==0)\n{"
				// temp += "offset += sizeof(*className);\n";
				// temp+="\n}";
				for (SymIndex fieldName : stce.fields.keySet()) {
					Symbol field = stce.fields.get(fieldName);

					if (!field.symbolType.isArrayValue
							&& (field.symbolType instanceof X10Class)
							&& symbolTable.symbolTable
									.get(field.symbolType.typeName).classType == ClassType.VALUE) {
						temp += "offset  = fixPointer"
								+ field.symbolType.getTypeName() + "(&(" + ptr
								+ fieldName.symbolName + "), offset);\n";

					} else if (field.symbolType.isArrayValue) {
						// fixed the pointer to the array
						temp += ptr + fieldName.symbolName + " = "
								+ "offset+sizeof(int32_t);\n";
						// if value class then need to fix internal value arrays
						temp += "offset += sizeof(int32_t);\n";
						temp += "size = *(((int32_t *)" + ptr
								+ fieldName.symbolName + ")-1);\n";
						temp += "offset += size*sizeof("
								+ field.symbolType.getFlatTypeName() + ");\n";
						if (field.symbolType instanceof X10Class
								&& symbolTable.symbolTable
										.get(field.symbolType.typeName).classType == ClassType.VALUE) {
							// calculate size of array of points and add that
							// too offset

							temp += "    for(int32_t i = 0; i<size; i++) {\n";
							temp += "    offset = fixPointer"
									+ field.symbolType.typeName + "(&(" + ptr
									+ fieldName.symbolName + "[i]), offset);\n";
							temp += "    }\n";

						}
					}

				}

				temp += "return offset;\n }\n";
				sbTemp.append(temp);
			}
		}
		return sbTemp;
	}

	// Builds the mapping for Asyncs
	private String buildEnum() {

		String bEnum = "enum AsyncMappings { ";
		int counter = 0;
		for (PairsTypeName ptn : myListAsyncCalls) {
			bEnum += "ASYNC" + counter;
			if (counter < myListAsyncCalls.size() - 1) {
				bEnum += ",";
			}

			counter++;
		}
		bEnum += "};\n";
		return bEnum;
	}

	private StringBuffer getMsgMemManagmentCode() {
		StringBuffer mMMC = new StringBuffer();
		mMMC.append("void * _pack_ASYNC(uint64_t * bufSize, uint32_t headerSize,_async child){\n");
		//hfile.append("void * _pack_ASYNC(uint64_t * bufSize, unsigned long headerSize,_async child);\n");
		//mMMC.append("void * buf;\n unsigned int sizeToMalloc;\n");
		mMMC.append("void * buf;\n uint64_t sizeToMalloc;\n");
		mMMC.append("switch(child.method) {\n");
		int counter = 0;
		for (PairsTypeName ptn : myListAsyncCalls) {
			String temp = "";

			temp += "\t case " + "ASYNC" + counter + " :\n";
			// if in constructor
			// ADD CAST TYPE
			// ADD this fix
			// temp +=
			// "unsigned int sizeToMalloc = getSizeOf"+ptn.getSpecificType()+"(className, sizeof(className));\n";
			String accountForMsgHeader = "\t\tbuf = (void*) "+malloc()+"(sizeToMalloc+headerSize);\n";
			if(useMallocProfiler){
				accountForMsgHeader += getMallocProfiler()+"(sizeToMalloc+headerSize);\n";
			}
			accountForMsgHeader += "\t*bufSize = (sizeToMalloc+headerSize);\n";
			accountForMsgHeader += "\t\tmemcpy((buf+headerSize), child.params, child.size);\n";
			if (ptn.getType().contains("%c")) {
				temp += "\t\t sizeToMalloc = child.size+ getSizeOf"
						+ ptn.getSpecificType() + "((struct "
						+ ptn.getSpecificType() + " * const )child.params);\n";
				// temp +=
				// "\t\t"+ptn.getMyName()+"(*(struct "+ptn.getSpecificType()+" * const )params);\n";
				temp += accountForMsgHeader;

				temp += "\t\t  deepCopy"
						+ ptn.getSpecificType()
						+ "((struct "
						+ ptn.getSpecificType()
						+ " * const )child.params,(buf+headerSize+child.size));\n";

			} else {
				temp += "\t\t  sizeToMalloc = child.size+ getSizeOf"
						+ ptn.getSpecificType() + "((" + ptn.getSpecificType()
						+ " * const )child.params);\n";
				// temp +=
				// "\t\t"+ptn.getMyName()+"(*("+ptn.getSpecificType()+" * const )params);\n";
				temp += accountForMsgHeader;
				temp += "\t\t deepCopy"
						+ ptn.getSpecificType()
						+ "(("
						+ ptn.getSpecificType()
						+ " * const )child.params, (buf+headerSize+child.size));\n";
			}
			// temp+="_dump_memory(buf, bufSize);\n";
			temp += "\t\treturn buf;\n";
			// temp+="\t\tbreak;\n";

			counter++;
			mMMC.append(temp);
		}
		mMMC.append("\t default:\n \n");
		mMMC.append("\tfprintf(stderr, \"%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\\n\", _here());\n\tbreak;\n");
		mMMC.append("}\n}\n");
		return mMMC;

	}

	private String buildThreadRun(boolean useFixPointer) {
		String bTR = "";
		if (useFixPointer) {
			bTR += "void _thread_run(uint32_t method, void * params){\n";
			hfile.append("void _thread_run(uint32_t method, void * params);\n");
		} else {
			bTR += "void _thread_run_local(uint32_t method, void * params){\n";
			hfile.append("void _thread_run_local(uint32_t method, void * params);\n");
		}
		bTR += "switch(method) {\n";
		int counter = 0;
		for (PairsTypeName ptn : myListAsyncCalls) {

			bTR += "\t case " + "ASYNC" + counter + " :\n";
			// if in constructor
			// ADD CAST TYPE
			// ADD this fix
			if (ptn.isInConstructor()) {
				if (ptn.getType().contains("%c")) {
					if (useFixPointer) {
						bTR += "\t\t fixPointer" + ptn.getSpecificType()
								+ "(((struct " + ptn.getSpecificType()
								+ " * const )params), (params+sizeof(struct "
								+ ptn.getSpecificType() + ")));\n";
					}
					bTR += "\t\t" + ptn.getMyName() + "(&(*((struct "
							+ ptn.getSpecificType()
							+ " * const )params)).THIS, *((struct "
							+ ptn.getSpecificType() + " * const )params));\n";
				} else {
					if (useFixPointer) {
						bTR += "\t\t fixPointer" + ptn.getSpecificType() + "(("
								+ ptn.getSpecificType()
								+ ")params, (params+sizeof(struct "
								+ ptn.getSpecificType() + "));\n";
					}
					bTR += "\t\t" + ptn.getMyName() + "(&(*((struct "
							+ ptn.getSpecificType()
							+ " * const )params)).THIS, ("
							+ ptn.getSpecificType() + ")params);\n";
				}
			} else {
				if (ptn.getType().contains("%c")) {
					if (useFixPointer) {
						bTR += "\t\t fixPointer" + ptn.getSpecificType()
								+ "(((struct " + ptn.getSpecificType()
								+ " * const )params), (params+sizeof(struct "
								+ ptn.getSpecificType() + ")));\n";
					}
					bTR += "\t\t" + ptn.getMyName() + "(*(struct "
							+ ptn.getSpecificType() + " * const )params);\n";
				} else {
					if (useFixPointer) {
						bTR += "\t\t fixPointer" + ptn.getSpecificType()
								+ "(((" + ptn.getSpecificType()
								+ " * const )params), (params+sizeof("
								+ ptn.getSpecificType() + ")));\n";
					}
					bTR += "\t\t" + ptn.getMyName() + "(*("
							+ ptn.getSpecificType() + " * const )params);\n";
				}
			}

			bTR += "\t\tbreak;\n";

			counter++;
		}
		bTR += "\t default:\n \n";
		if(useFixPointer){
		bTR += "\tfprintf(stderr, \"%d:ERROR THREAD RUN ====== not the right case\", _here());\n\tbreak;\n";
		}else{
			bTR += "\tfprintf(stderr, \"%d:ERROR THREAD RUN LOCAL ====== not the right case\", _here());\n\tbreak;\n";
		}
		bTR += "}\n}\n";
		return bTR;
	}

	/*
	 * private StringBuffer getDumpMemory(){ StringBuffer sb = new
	 * StringBuffer();
	 * sb.append("void _dump_memory(void* data, unsigned long len) {\n");
	 * hfile.append("void _dump_memory(void* data, unsigned long len);\n");
	 * sb.append("unsigned long i;");
	 * sb.append("fprintf(stderr, \"Data in [%p..%p): \",data,data+len);\n");
	 * sb.append("for (i=0;i<len;i++)\n");
	 * sb.append("fprintf(stderr, \"%x --\", ((unsigned char*)data)[i]);\n");
	 * 
	 * sb.append("}\n"); return sb; }
	 */
	
}
