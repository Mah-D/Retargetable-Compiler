package jplasma.visitor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

import util.exception.PlasmaException;
import util.symboltable.ClassStructure;
import util.symboltable.Constants;
import util.symboltable.Snippet;
import util.symboltable.Symbol;
import util.symboltable.SymbolTableClassEntry;
import util.symboltable.SymbolTableMethodEntry;
import util.symboltable.Symbol.SymIndex;
import util.symboltable.SymbolTableMethodEntry.MethodSignature;
import util.types.X10Boolean;
import util.types.X10Byte;
import util.types.X10Class;
import util.types.X10Distribution;
import util.types.X10Double;
import util.types.X10Integer;
import util.types.X10Long;
import util.types.X10Place;
import util.types.X10Point;
import util.types.X10ReferenceArray;
import util.types.X10Region;
import util.types.X10SShort;
import util.types.X10String;
import util.types.X10Type;
import util.types.X10Unassigned;
import util.types.X10ValueArray;
import util.types.X10Void;

import java.util.*;

import plasmax10.syntaxtree.ClassMember;
import plasmax10.syntaxtree.DivideAssignment;
import plasmax10.syntaxtree.MinusAssignment;
import plasmax10.syntaxtree.ModuloAssignment;
import plasmax10.syntaxtree.MultiplyAssignment;
import plasmax10.syntaxtree.PlusAssignment;

import jplasma.syntaxtree.*;




import lib.GenerateImports;

public class TplasmaX10JavaSingleThreaded extends GJDepthFirst<Snippet,Snippet>{
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
	public int MAXPLACES = 1;
	private int currentBlock;
	private int blockId;
	private int blockDepth;
	private String arrayInit = "";
	public String tPlasmaCode;
	public String fieldsCode ="";
	private String programClassName;
	private HashMap<String, String> allMyTypes;
	public boolean arrayInitializer = false;

	private String arrayInitializerBlock="";
	private String arrayInitVar="";
	private boolean inTypeAnnotatedExpression;
	private boolean inAsync = false;
	private String asyncPoint = "";
	private String identifierToAddToGlobalHash = "";
	private String addToGlobalHashCode = "";
	private boolean inConstructorInit = false;
	private String initCodePlaceChecks = "\n\nfor(int i =0; i <Program.MAX_PLACES; ++i){Program.globalPointerHashMap.put(i, new HashSet<Integer>());}\n";
	private boolean inConstructor = false;
	private boolean updateArrayInitializer = false;
	private boolean inValueArray = false;
	private boolean inUpdateArray = false;
	private boolean useGetUniqueDist = false;
	
	
	public TplasmaX10JavaSingleThreaded(HashMap<String, SymbolTableClassEntry> classSymbolTable, boolean options[])
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
					//System.out.println(currentMethod.blockMap);
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
	    * mainClass -> MainClass()
	    * programClass -> ProgramClass()
	    * nodeListOptional -> ( TopLevelDeclaration() )*
	    * nodeToken -> <EOF>
	    */
	   public Snippet visit(File n, Snippet argu) {
	      Snippet _ret=null;
	      allMyTypes = new HashMap<String, String>();
	      n.mainClass.accept(this, argu);
	      n.programClass.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      ClassStructure programRM = classes.get("RunMain");
	      System.out.println(GenerateImports.printImports()+"\n");
	      System.out.println(programRM.toString());
	      ClassStructure programC = classes.get("Program");
	      
	      System.out.println(programC.toString());
	      for(String output : classes.keySet()){
				if(!output.equals("Program") && !output.equals("RunMain")){
					System.out.println(classes.get(output));
				}
	      }
	   
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
	   public Snippet visit(MainClass n, Snippet argu) {
	      Snippet _ret=null;
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      
	     // Snippet f2 = 
	      currentClassName = n.identifier.accept(this, argu).expType.getTypeName();
			currentClassBody = new ClassStructure("public class " + currentClassName);
			currentClass = classSymbolTable.get(currentClassName);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      Snippet f7 = n.nodeToken6.accept(this, argu);
	      String methodName = f7.expType.getTypeName();
			currentMethod = currentClass.methods.get(methodName);
	      n.nodeToken7.accept(this, argu);
	      n.nodeToken8.accept(this, argu);
	      n.nodeToken9.accept(this, argu);
	      n.nodeToken10.accept(this, argu);
	      Snippet f12 = n.identifier1.accept(this, argu);
	      String args = f12.expType.getTypeName();
	      n.nodeToken11.accept(this, argu);
	      blockId = 0;
		  currentBlock = 0;
	      n.nodeToken12.accept(this, argu);
	      Snippet f15 = n.identifier2.accept(this, argu);
	      String programClassName = f15.expType.getTypeName();
	      n.nodeToken13.accept(this, argu);
	      Snippet f17 = n.identifier3.accept(this, argu);
	      String programClassRunMethod = f17.expType.getTypeName();
	      n.nodeToken14.accept(this, argu);
	      n.nodeToken15.accept(this, argu);
	      n.nodeToken16.accept(this, argu);
	      n.nodeToken17.accept(this, argu);
	      n.nodeToken18.accept(this, argu);
	     	
	      tPlasmaCode += generateTabs(0) +"\npublic static void main(String[] " + args + ") {\n";
	       //set args to maxplace initilization
	      //if(args.length > 0){maxplaces args[0]}
			tPlasmaCode += generateTabs(1) + programClassName + "." + programClassRunMethod + "(0)" + ";\n";
			tPlasmaCode += generateTabs(0) + "}\n";

			currentClassBody.methods = tPlasmaCode;
			classes.put(currentClassName, currentClassBody);
			currentClass = null;
	      
	      return _ret;
	   }

	   /**
	    * nodeToken -> "class"
	    * identifier -> Identifier()
	    * nodeToken1 -> "{"
	    * nodeListOptional -> ( ConstantDeclaration() )*
	    * nodeListOptional1 -> ( MethodDeclaration() )*
	    * nodeToken2 -> "}"
	    */
	   public Snippet visit(ProgramClass n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      currentClassName = f1.expType.getTypeName();
			currentClass = classSymbolTable.get(currentClassName);
			programClassName = currentClassName;
			currentClassBody = new ClassStructure("class "+currentClassName+"  ");
			 String placeChecksCode = "\n public static final int myUniquePlacePoint = 0;\npublic static final int MAX_PLACES = "+MAXPLACES+";\n\n \npublic static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new HashMap<Integer, HashSet<Integer>>(Program.MAX_PLACES);";
			  
			 placeChecksCode +=  "\n static {for(int i =0; i <Program.MAX_PLACES+1; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}}\n";
			
			
	      n.nodeToken1.accept(this, argu);
	      Snippet f3 = n.nodeListOptional.accept(this, argu);
	      String methodsToAdd ="\npublic static int prev(int x){ if(x==0){ x=Program.MAX_PLACES-1; }else{ x = x-1; } return x;}\n";
	      currentClassBody.methods+=methodsToAdd;
	      Snippet f4 = n.nodeListOptional1.accept(this, argu);
	      if(useGetUniqueDist){
				 placeChecksCode+="\npublic static final Dist1 UniqueDistribution = Program.getUniqueDist(myUniquePlacePoint);";
			}
	     
	      currentClassBody.startBrace="{"+  generateTabs(blockDepth)+placeChecksCode+"\n";
	      n.nodeToken2.accept(this, argu);
	      String tempConstantDeclaration = "";
			String methodDeclaration = "";
			if(f3 != null){
				tempConstantDeclaration = f3.returnTemp;
			}
			if(f4!=null){
				methodDeclaration = f4.returnTemp;
			}
			
	      _ret.returnTemp = generateTabs(0) +"class "+currentClassName+"  "+generateTabs(1) +placeChecksCode+tempConstantDeclaration+"\n"+methodDeclaration+generateTabs(0) +"\n";
			currentClassBody.methods +="\n";
			classes.put(currentClassName, currentClassBody);
			currentClass = null;
	      return _ret;
	   }

	   /**
	    * nodeChoice -> ClassDeclaration()
	    *       | ValueDeclaration()
	    */
	   public Snippet visit(TopLevelDeclaration n, Snippet argu) {
	      Snippet _ret=null;
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
	   public Snippet visit(ClassDeclaration n, Snippet argu) {
	      Snippet _ret=null;
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      currentClassName = f1.expType.getTypeName();
			currentClass = classSymbolTable.get(currentClassName);
	      n.nodeToken1.accept(this, argu);
	      currentClassBody = new ClassStructure(generateTabs(0) +"class "+currentClassName+"  ");
	 	 //String placeChecksCode = "\npublic static final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = RunMain.globalPointerHashMap;";
			
	    
	      n.nodeListOptional.accept(this, argu);
	      n.nodeListOptional1.accept(this, argu);
	      n.nodeListOptional2.accept(this, argu);
	      n.nodeListOptional3.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      
	      currentClassBody.methods +="\n";
			classes.put(currentClassName, currentClassBody);
			currentClass = null;
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
	   public Snippet visit(ValueDeclaration n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      currentClassName = f1.expType.getTypeName();
			currentClass = classSymbolTable.get(currentClassName);
			currentClassBody = new ClassStructure(generateTabs(0) +"/*value*/ class "+currentClassName+" \n"+generateTabs(0));
			
	      n.nodeToken1.accept(this, argu);
	     Snippet f3 =  n.nodeListOptional.accept(this, argu);
	     Snippet f4 =  n.nodeListOptional1.accept(this, argu);
	     Snippet f5 = n.nodeListOptional2.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      String tempInitConstDecl = "";
			String tempConstDecl = "";
	      if(f3 != null){
				tempInitConstDecl = f3.returnTemp;
				
			}if(f4!=null){
				tempConstDecl = f4.returnTemp;
				
			} 
			_ret.returnTemp = "/*value*/ "+currentClassName+" \n"+ tempInitConstDecl+" "+tempConstDecl+"\n";
			currentClassBody.methods+= generateTabs(0)+"";
			classes.put(currentClassName, currentClassBody);
			currentClass = null;
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
	   public Snippet visit(ConstructorDeclaration n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      tPlasmaCode="";
			String constructorName = f1.expType.getTypeName();
			memberSig = new MethodSignature();
			memberSig.methodName = constructorName;

			tempCounter = tempZero;

	      n.nodeToken1.accept(this, argu);
	      blockId = 1;
			currentBlock = 1;
			Snippet f3 = n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      blockId = 0;
			currentBlock = 0;

			currentMethod = currentClass.constructors.get(memberSig.getCompleteMethodSignature());
			
			memberSig = null;

			
			String tempFormalParamList = "";
			if(f3!=null){
				tempFormalParamList += f3.returnTemp+",";
			}
			//f5 is added in tPlasmaCode
			_ret.returnTemp = generateTabs(0)+"public "+constructorName+" ( "+tempFormalParamList+" int myUniquePlacePoint)\n";//+f5.returnTemp;
			
			tPlasmaCode += _ret.returnTemp;
			inConstructor = true;
			
	      n.block.accept(this, argu);
	      	inConstructor = false;
	      currentClassBody.constructors += tPlasmaCode;
			tPlasmaCode="";
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
	   public Snippet visit(ConstantDeclaration n, Snippet argu) {
		   Snippet _ret= new Snippet("","public static final ",null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      Snippet f3 = n.type.accept(this, argu);
	      Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      Snippet f6 = n.methodCall.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp += f3.returnTemp+" "+f4.returnTemp+" = "+f6.returnTemp+";\n";
			currentClassBody.constants += _ret.returnTemp;
			return _ret;
	   }

	   /**
	    * nodeToken -> "public"
	    * nodeToken1 -> "final"
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken2 -> ";"
	    */
	   public Snippet visit(InitializableConstantDeclaration n, Snippet argu) {
	      Snippet _ret=new Snippet("","", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.type.accept(this, argu);
	      Snippet f3 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret.returnTemp += f2.expType.getTypeName()+" "+f3.returnTemp+";";
			//?? possible here
	      tPlasmaCode="";
			//tPlasmaCode += 
			currentClassBody.initConstants+=generateTabs(0)+"public final " + f2.expType.getTypeName()+" "+f3.returnTemp+";\n";;
			tPlasmaCode="";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "public"
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(UpdatableFieldDeclaration n, Snippet argu) {
		   Snippet _ret= new Snippet("","public ",null,false);
	      n.nodeToken.accept(this, argu);
	      tPlasmaCode="";
			Snippet f1 = n.type.accept(this, argu);
			Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      _ret.returnTemp += f1.returnTemp+" "+f2.returnTemp+";";
			String temp = generateTabs(0)+"public " + f1.expType.getTypeName()+" "+f2.returnTemp+";\n";
			currentClassBody.fields+=temp;
			tPlasmaCode="";
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
	   public Snippet visit(MethodDeclaration n, Snippet argu) {
		   Snippet _ret=null;
			tPlasmaCode = "";
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.returnType.accept(this, argu);
	      String tempString = "";
			if(f2 != null){
				//System.out.println(" "+f2.expType+" "+f2.returnTemp);
				tempString = f2.expType.typeName;
			}else{
				tempString = "void ";
			}
	     Snippet f3 =  n.identifier.accept(this, argu);
	      String methodName = f3.expType.getTypeName();
	      memberSig = new MethodSignature();
			memberSig.methodName = methodName;
			currentMethod = currentClass.methods.get(methodName);
			
			
			tempCounter = tempZero;
			blockId = 1;
			currentBlock = 1;
	      n.nodeToken2.accept(this, argu);
	      Snippet f5 = n.nodeOptional.accept(this, argu);
	     // n.nodeToken3.accept(this, argu);
	      memberSig = null;
			blockId = 0;
			currentBlock = 0;
			
			String tempFormal = "";
			if(f5 != null){
				tempFormal = f5.returnTemp+",";
			}else{
				tempFormal = "";
			}
			
			tempString+=" "+methodName+" "+"( "+tempFormal+" int myUniquePlacePoint)";
			
			tPlasmaCode += "public "+tempString+"\n";
			//String placeCheckString = "final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new final HashMap<Integer, HashSet<Integer>>(4)";
			//placeCheckString +=  "final int maxPlaces = 4; \n for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}";
			n.block.accept(this, argu);
	      currentClassBody.methods += tPlasmaCode;
			tPlasmaCode = "";
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
	   public Snippet visit(StaticMethodDeclaration n, Snippet argu) {
		   Snippet _ret=null;
			tPlasmaCode = "";
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.returnType.accept(this, argu);
	      String tempString = "";
			if(f2 != null){
				//System.out.println(" "+f2.expType+" "+f2.returnTemp);
				tempString = f2.expType.typeName;
			}else{
				tempString = "void ";
			}
	     Snippet f3 =  n.identifier.accept(this, argu);
	      String methodName = f3.expType.getTypeName();
	      memberSig = new MethodSignature();
			memberSig.methodName = methodName;
			currentMethod = currentClass.methods.get(methodName);
			
			
			tempCounter = tempZero;
			blockId = 1;
			currentBlock = 1;
	      n.nodeToken2.accept(this, argu);
	      Snippet f5 = n.nodeOptional.accept(this, argu);
	     // n.nodeToken3.accept(this, argu);
	      memberSig = null;
			blockId = 0;
			currentBlock = 0;
			
			String tempFormal = "";
			if(f5 != null){
				tempFormal = f5.returnTemp+",";
			}else{
				tempFormal = "";
			}
			
			tempString+=" "+methodName+" "+"( "+tempFormal+" int myUniquePlacePoint)";
			
			tPlasmaCode += "public static "+tempString+"\n";
			//String placeCheckString = "final HashMap<Integer, HashSet<Integer>> globalPointerHashMap = new final HashMap<Integer, HashSet<Integer>>(4)";
			//placeCheckString +=  "final int maxPlaces = 4; \n for(int i =0; i <maxPlaces; ++i){globalPointerHashMap.put(i, new HashSet<Integer>());}";
			n.block.accept(this, argu);
	      currentClassBody.methods += tPlasmaCode;
			tPlasmaCode = "";
	      return _ret;
		   }

	   /**
	    * finalFormalParameter -> FinalFormalParameter()
	    * nodeListOptional -> ( FormalParameterRest() )*
	    */
	   public Snippet visit(FormalParameterList n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null,false);
	      Snippet f0 = n.finalFormalParameter.accept(this, argu);
	      fieldsCode = "";
	      Snippet f1 = n.nodeListOptional.accept(this, argu);
	   
			
				_ret.returnTemp = f0.returnTemp+fieldsCode;	
				fieldsCode = "";
			
	      return _ret;
	   }

	   /**
	    * nodeToken -> "final"
	    * type -> Type()
	    * identifier -> Identifier()
	    */
	   public Snippet visit(FinalFormalParameter n, Snippet argu) {
	      Snippet _ret=new Snippet("","", null, false);;
	      n.nodeToken.accept(this, argu);
	      Snippet type = n.type.accept(this, argu);
	      Snippet f1 =  n.identifier.accept(this, argu);
	      _ret.returnTemp = "final "+type.expType.getTypeName()+" "+f1.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> ","
	    * finalFormalParameter -> FinalFormalParameter()
	    */
	   public Snippet visit(FormalParameterRest n, Snippet argu) {
	      
	      n.nodeToken.accept(this, argu);
	      Snippet _ret = n.finalFormalParameter.accept(this, argu);
	       
			_ret.returnTemp = ", "+_ret.returnTemp;
			fieldsCode += _ret.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeChoice -> VoidType()
	    *       | Type()
	    */
	   public Snippet visit(ReturnType n, Snippet argu) {
	      Snippet _ret=null;
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "void"
	    */
	   public Snippet visit(VoidType n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
			_ret.returnTemp = "void";
			_ret.expType = new X10Void();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeChoice -> UpdatableArrayType()
	    *       | ValueArrayType()
	    *       | NonArrayType()
	    */
	   public Snippet visit(Type n, Snippet argu) {
	      Snippet _ret=null;
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nonArrayType -> NonArrayType()
	    * nodeToken -> "["
	    * nodeToken1 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken2 -> "]"
	    */
	   public Snippet visit(UpdatableArrayType n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null, false);
			Snippet f0 = n.nonArrayType.accept(this, argu);
			_ret.expType = new X10ReferenceArray(1,f0.expType);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.rankEquation.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret.returnTemp = _ret.expType.typeName+"[]";
			allMyTypes.put(f0.expType.typeName, _ret.expType.typeName);
	      return _ret;
	   }

	   /**
	    * nonArrayType -> NonArrayType()
	    * nodeToken -> "value"
	    * nodeToken1 -> "["
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> "]"
	    */
	   public Snippet visit(ValueArrayType n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null,false);
			Snippet f0 = n.nonArrayType.accept(this, argu);
	      _ret.expType = new X10ValueArray(1, f0.expType);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      Snippet f4 = n.rankEquation.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      _ret.returnTemp = _ret.expType.typeName+" /*value*/ ["+f4.returnTemp+"]";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "rank==1"
	    */
	   public Snippet visit(RankEquation n, Snippet argu) {
		   Snippet _ret= new Snippet("","RANKEQUATION", null,false);
	      n.nodeToken.accept(this, argu);
	      return _ret;
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
	   public Snippet visit(NonArrayType n, Snippet argu) {
	      Snippet _ret=null;
	      
	      _ret =n.nodeChoice.accept(this, argu); 
			_ret.expType.typeName = _ret.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "boolean"
	    */
	   public Snippet visit(BooleanType n, Snippet argu) {
		   Snippet _ret= new Snippet("","boolean",new X10Boolean(), false);
			_ret.expType = new X10Boolean();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "byte"
	    */
	   public Snippet visit(ByteType n, Snippet argu) {
	     
	      Snippet _ret= new Snippet("","byte",new X10Byte(), false);
			_ret.expType = new X10Byte();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "short"
	    */
	   public Snippet visit(ShortType n, Snippet argu) {
		   Snippet _ret= new Snippet("","short",new X10SShort(), false);
			_ret.expType = new X10SShort();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "int"
	    */
	   public Snippet visit(IntegerType n, Snippet argu) {
		   Snippet _ret= new Snippet("","int",new X10Integer(), false);
			_ret.expType = new X10Integer();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "long"
	    */
	   public Snippet visit(LongType n, Snippet argu) {
		   Snippet _ret= new Snippet("","long",new X10Long(), false);
			_ret.expType = new X10Long();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "double"
	    */
	   public Snippet visit(DoubleType n, Snippet argu) {
		   Snippet _ret= new Snippet("","double",new X10Double(), false);
			_ret.expType = new X10Double();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "String"
	    */
	   public Snippet visit(StringType n, Snippet argu) {
		   Snippet _ret= new Snippet("","String",new X10String(), false);
			_ret.expType = new X10String();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "place"
	    * This needs to become an Object
	    */
	   public Snippet visit(PlaceType n, Snippet argu) {
		   Snippet _ret= new Snippet("","int",new X10Place(), false);
			_ret.expType = new X10Place();
	      n.nodeToken.accept(this, argu);
	      return _ret;
	   }




	   /**
	    * nodeToken -> "dist"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(DistType n, Snippet argu) {
		   Snippet _ret=new Snippet("","", null ,false);
			_ret.expType = new X10Distribution(1);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      Snippet f3 = n.rankEquation.accept(this, argu);
	      _ret.returnTemp = "int";
	      n.nodeToken3.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "region"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(RegionType n, Snippet argu) {
	   
	      Snippet _ret= new Snippet("", "int", null ,false);
			_ret.expType = new X10Region(1);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      Snippet f3 = n.rankEquation.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      //_ret.returnTemp = "region("+f3.returnTemp+")";
	      _ret.returnTemp = "int ";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "point"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ":"
	    * rankEquation -> RankEquation()
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(PointType n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null, false);
	      n.nodeToken.accept(this, argu);
	  	_ret.expType = new X10Point(1);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      Snippet f3 = n.rankEquation.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     // _ret.returnTemp = "point("+f3.returnTemp+")";
	      _ret.returnTemp = "int"+"";
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    */
	   public Snippet visit(ClassNameType n, Snippet argu) {
	      Snippet _ret=null;
	      _ret = n.identifier.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> <IDENTIFIER>
	    */
	   public Snippet visit(Identifier n, Snippet argu) {
		   Snippet _ret= null; //new Snippet("", n.nodeToken.tokenImage, null, false);
	     _ret = n.nodeToken.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "{"
	    * nodeListOptional -> ( Statement() )*
	    * nodeToken1 -> "}"
	    */
	   public Snippet visit(Block n, Snippet argu) {
	      Snippet _ret= new Snippet("","", null, false);
	      n.nodeToken.accept(this, argu);

			int temp = currentBlock;
			currentBlock = ++blockId;
			
			blockDepth++;
			tPlasmaCode += generateTabs(blockDepth)+"{\n";
			if(inConstructorInit){
				inConstructorInit=false;
				tPlasmaCode+=generateTabs(blockDepth)+initCodePlaceChecks;
			}else if(inConstructor ){
				String toAdd="";
				//toAdd+= "if(globalPointerHashMap.containsKey(myUniquePlacePoint)){\n";
				if(!inAsync){
					
					toAdd+="\n"+ generateTabs(blockDepth)+"Program.globalPointerHashMap.get(myUniquePlacePoint).add("+"this"+".hashCode());\n";
				}else{
				
					toAdd+="\n"+ generateTabs(blockDepth)+"Program.globalPointerHashMap.get("+asyncPoint+").add("+"this"+".hashCode());\n";
				}
				//toAdd+="\nelse{throw new RuntimeException(\"Object in wrong place\");\n }";
				tPlasmaCode+=toAdd;
			}
	      Snippet f1 = n.nodeListOptional.accept(this, argu);
	      if(f1 != null){
				tPlasmaCode += f1.returnTemp;
			}
	      tPlasmaCode+= generateTabs(blockDepth)+"}\n";
			blockDepth--;
			currentBlock = temp;
	      n.nodeToken1.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeChoice -> AddLocalOpsStatement()
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
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**TO BE REOMVED THIS NEEDS FIXING PROBABLY A CLASS
	    * nodeToken -> "x10.lang.perf.addLocalOps"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public Snippet visit(AddLocalOpsStatement n, Snippet argu) {
	      Snippet _ret=null;
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2  = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      _ret.returnTemp+=generateTabs(blockDepth)+"x10.lang.perf.addLocalOps("+f2.returnTemp+");";
			tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "="
	    * expression -> Expression()
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(Assignment n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	     Snippet f0 = n.identifier.accept(this, argu);
	     //if(!arrayInitializer)
		     arrayInitVar  = f0.returnTemp; 
	     Snippet f1 = n.nodeToken.accept(this, argu);
	     identifierToAddToGlobalHash = f0.returnTemp;
	     Snippet f2 = n.expression.accept(this, argu);
	     identifierToAddToGlobalHash = "";
	     Snippet f3 =  n.nodeToken1.accept(this, argu);
	  
//	     if(arrayInitializer){
//	    	 _ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+" = ";
//	     _ret.returnTemp+=arrayInit +"\n /*ArrayInitilizer*/"+arrayInitializerBlock;	 
//	     arrayInit = "";
//	     arrayInitializerBlock = "";
//	     arrayInitializer = false;
//	     tPlasmaCode+=_ret.returnTemp+"\n";
//	     }else{
	    	 
	    	 _ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+" = ";
	    	 _ret.returnTemp +=f2.returnTemp;
			tPlasmaCode+= f2.preface+"\n";
			tPlasmaCode+=_ret.returnTemp+";\n";
			tPlasmaCode+= f2.postface+"\n";
			
	   // }
	      return _ret;
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
	   public Snippet visit(ArrayAssignment n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null,false);
	     Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      Snippet f2 = n.identifierList.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      Snippet f6 = n.identifier1.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      String arrayIDToSetValue = f0.returnTemp;
			String valueToChangeToo = f6.returnTemp;
			String place = "";
			//Symbol sym = getIdentifier(f0.returnTemp, currentBlock, currentClassName);
			//X10ReferenceArray arr = (X10ReferenceArray)sym.symbolType;
			
			String temp = generateTabs(blockDepth)+f0.returnTemp+"["+f2.returnTemp+"] = "+f6.returnTemp+";";//programClassName+"."+ arr.arrayElementType.typeName.toUpperCase()  +"SetValue"+"("+arrayIDToSetValue+","+ identifierList.get(0)+","+valueToChangeToo+");";
			_ret.returnTemp = temp;
			tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * if( !classes.containsKey(object) && !classSymbolTable.get(object).classType.equals(Constants.ClassType.VALUE) ){
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * identifier1 -> Identifier()
	    * nodeToken1 -> "="
	    * nodeToken2 -> "("
	    * identifier2 -> Identifier()
	    * nodeToken3 -> ")"
	    * nodeToken4 -> ";"
	    */
	   public Snippet visit(FieldAssignment n, Snippet argu) {
	      
	      Snippet _ret = new Snippet("", "", null, false);
	     Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      Snippet f2 = n.identifier1.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	     Snippet f5 = n.identifier2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      String nameOfIdentifier = f0.returnTemp;
	  	String points = "";
	  		
	      if(!inAsync){
			
			points ="myUniquePlacePoint";
		}else{
			
			
			points=asyncPoint+"";
		}
	     
	      _ret.returnTemp = generateTabs(blockDepth)+generatePlaceCheckCode(points, f0.returnTemp)+generateTabs(blockDepth)+f0.returnTemp+"."+f2.returnTemp+" = ("+f5.returnTemp+")"+";";
			tPlasmaCode+=_ret.returnTemp+"\n";
			
			
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
	   public Snippet visit(ThisFieldAssignment n, Snippet argu) {
	      Snippet _ret= new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     Snippet f2 =  n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	    Snippet f5 =  n.identifier1.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"this."+f2.returnTemp+" = ("+f5.returnTemp+");\n";
			tPlasmaCode+= _ret.returnTemp;
			return _ret;
	   }

	   /**TODO this needs to become a class replace with method
	    * nodeToken -> "async"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * block -> Block()
	    * What to do with the code thats since not in method calls eTODO
	    */
	   public Snippet visit(AsyncStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "async", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      tPlasmaCode += generateTabs(blockDepth)+"//async("+f2.returnTemp+")\n";
	      inAsync = true;
	      asyncPoint = f2.returnTemp;
	      n.block.accept(this, argu);
	      inAsync = false;
	      asyncPoint = "";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "break"
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(BreakStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      _ret.returnTemp = "break"+";";
			tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "continue"
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(ContinueStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      _ret.returnTemp = "continue;";
			tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
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
	   public Snippet visit(DoStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      tPlasmaCode+=generateTabs(blockDepth)+"do ";
	      n.block.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	     Snippet f4 =  n.identifier.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      tPlasmaCode+=generateTabs(blockDepth)+"\n while("+f4.returnTemp+");";
	      return _ret;
	   }

	   /**TODO
	    * nodeToken -> "finish"
	    * block -> Block()
	    */
	   public Snippet visit(FinishStatement n, Snippet argu) {
	      Snippet _ret=null;
	      tPlasmaCode+=generateTabs(blockDepth);//+"finish ";
	      n.nodeToken.accept(this, argu);
	      tPlasmaCode+="/*FINISH\n*/";
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
	   public Snippet visit(IfStatement n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"if("+f2.returnTemp+")\n";
			tPlasmaCode+=_ret.returnTemp;
	      n.block.accept(this, argu);
	     Snippet f5 =  n.nodeOptional.accept(this, argu);
	      if(f5!=null){
	  		tPlasmaCode+=f5.returnTemp;
	  		}
	      return _ret;
	   }

	   /**
	    * nodeToken -> "else"
	    * block -> Block()
	    */
	   public Snippet visit(ElseClause n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null, false);
	      n.nodeToken.accept(this, argu);
	      _ret.returnTemp = " ";//+f1.returnTemp;
			tPlasmaCode+=generateTabs(blockDepth)+"else"+"\n";
	      n.block.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "for"
	    * nodeToken1 -> "("
	    * pointType -> PointType()
	    * explodedSpecification -> ExplodedSpecification()
	    * nodeToken2 -> ":"
	    * identifier -> Identifier()
	    * nodeToken3 -> ")"
	    * block -> Block()
	    */
	   public Snippet visit(LoopStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      int temp = currentBlock;
			currentBlock = ++blockId;

	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.pointType.accept(this, argu);
	      Snippet f3 = n.explodedSpecification.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	     Snippet f5 =  n.identifier.accept(this, argu);
	      n.nodeToken3.accept(this, argu);

			currentBlock = temp;
			//_ret.returnTemp = generateTabs(blockDepth)+"for("+f2.returnTemp+f3.returnTemp+" : "+f5.returnTemp+")";//+f7.returnTemp;
			_ret.returnTemp = generateTabs(blockDepth)+"for(int "+f3.returnTemp+"=0"+"; "+f3.returnTemp+" < "+f5.returnTemp+"; "+f3.returnTemp+"++"+")";
			tPlasmaCode+=_ret.returnTemp+"\n";
	      n.block.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeChoice -> PointName()
	    *       | Coordinates()
	    */
	   public Snippet visit(ExplodedSpecification n, Snippet argu) {
	      Snippet _ret=null;
	     _ret =  n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    */
	   public Snippet visit(PointName n, Snippet argu) {
	      Snippet _ret=null;
	      _ret = n.identifier.accept(this, argu);
	      //_ret.returnTemp = "0";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "["
	    * identifier -> Identifier()
	    * nodeToken1 -> "]"
	    */
	   public Snippet visit(Coordinates n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null,false);;
	      n.nodeToken.accept(this, argu);
	     Snippet f1 =  n.identifier.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      //_ret.returnTemp = "["+f1.returnTemp+"]";
	      _ret.returnTemp = ""+f1.returnTemp+"";
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeListOptional -> ( IdentifierRest() )*
	    */
	   public Snippet visit(IdentifierList n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
			Snippet f0 =n.identifier.accept(this, argu);
			fieldsCode = "";
			identifierList.add(f0.returnTemp);
			Snippet f1=n.nodeListOptional.accept(this, argu);
	      _ret.returnTemp= f0.returnTemp+fieldsCode;
			fieldsCode = "";
	      return _ret;
	   }

	   /**
	    * nodeToken -> ","
	    * identifier -> Identifier()
	    */
	   public Snippet visit(IdentifierRest n, Snippet argu) {
	      Snippet _ret=null;
	      n.nodeToken.accept(this, argu);
	     _ret =  n.identifier.accept(this, argu);
			identifierList.add(_ret.returnTemp);
			fieldsCode +=  ","+ _ret.returnTemp;
	      return _ret;
	   }

	   /**
	    * methodCall -> MethodCall()
	    * nodeToken -> ";"
	    */
	   public Snippet visit(MethodCallStatement n, Snippet argu) {
		   Snippet _ret= new Snippet("", "", null, false);
			Snippet f0 =n.methodCall.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp + ";";
			tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * methodCallInConstructor -> MethodCallInConstructor()
	    * nodeToken -> ";"
	    */
	   public Snippet visit(MethodCallStatementInConstructor n, Snippet argu) {
		   Snippet _ret= new Snippet("", "", null, false);;
			Snippet f0 = n.methodCallInConstructor.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp + ";";
			tPlasmaCode+=generateTabs(blockDepth)+_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "System.out.println"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public Snippet visit(PrintlnStatement n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"System.out.println("+f2.returnTemp+");";
			tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "System.out.print"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public Snippet visit(PrintStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"System.out.print("+f2.returnTemp+");";
			tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "System.err.println"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public Snippet visit(PrintErrorStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	  	_ret.returnTemp = generateTabs(blockDepth)+"System.err.println("+f2.returnTemp+");";
		tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "return"
	    * nodeOptional -> [ Identifier() ]
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(ReturnStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.nodeOptional.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	   
	  		
	  			/* ArrayINITCODE */
		if (arrayInitializer) {
			if(f1 == null){
				tPlasmaCode += generateTabs(blockDepth) +arrayInitializerBlock + "  /*updateArrayInitializer BLOCK*/\n";
				
			}else{
				/*Comment f1.returnTemp to fix problem of [value]*/
				tPlasmaCode += generateTabs(blockDepth) +arrayInitializerBlock + f1.returnTemp
				+ ";\n";	
			}
			
		} else {
			// End of ARRAYINITCODE
			if (f1 == null) {
				_ret.returnTemp = "return" + ";";
				tPlasmaCode += generateTabs(blockDepth) + _ret.returnTemp
						+ "\n";
			} else {
				_ret.returnTemp = "return " + f1.returnTemp + ";";
				tPlasmaCode += generateTabs(blockDepth) + _ret.returnTemp
						+ "\n";
			}

		}
	  		
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
	   public Snippet visit(SwitchStatement n, Snippet argu) {
		   Snippet _ret = new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     Snippet f2 =  n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      
	      n.nodeToken4.accept(this, argu);
	      tPlasmaCode+=generateTabs(blockDepth)+"switch("+f2.returnTemp+"){\n";
	      Snippet f5 = n.nodeListOptional.accept(this, argu);
	      if(f5!=null){
	      _ret.returnTemp += f5.returnTemp+"\n";
	      }else{
	    	  _ret.returnTemp += "\n";
	      }
			tPlasmaCode+=_ret.returnTemp+"}";
	      return _ret;
	   }

	   /**
	    * switchLabel -> SwitchLabel()
	    * nodeToken -> ":"
	    * block -> Block()
	    */
	   public Snippet visit(SwitchEntry n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null,false);
	      Snippet f0 = n.switchLabel.accept(this, argu);
	      n.nodeToken.accept(this, argu);

			int temp = currentBlock; 
	     
	      
	      currentBlock = ++blockId;

			

			currentBlock = temp;
			_ret.returnTemp = f0.returnTemp+":";
			tPlasmaCode += generateTabs(blockDepth)+ _ret.returnTemp;
			//f2.returnTemp;
			 n.block.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeChoice -> Case()
	    *       | Default()
	    */
	   public Snippet visit(SwitchLabel n, Snippet argu) {
	      Snippet _ret=null;
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * nodeToken -> "case"
	    * identifier -> Identifier()
	    */
	   public Snippet visit(Case n, Snippet argu) {
		   Snippet _ret=new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 =  n.identifier.accept(this, argu);
	      _ret.returnTemp = "case "+f1.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "default"
	    */
	   public Snippet visit(Default n, Snippet argu) {
		   Snippet _ret=new Snippet("","default", null,false);
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
	   public Snippet visit(ThrowStatement n, Snippet argu) {
	      Snippet _ret= new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"throw "+"new"+" RuntimeException("+f4.returnTemp+");\n";
			tPlasmaCode+=_ret.returnTemp+"\n";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "while"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * block -> Block()
	    */
	   public Snippet visit(WhileStatement n, Snippet argu) {
		   Snippet _ret= new Snippet("", "", null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2 = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret.returnTemp = generateTabs(blockDepth)+"while("+f2.returnTemp+")";//f4.returnTemp;
			tPlasmaCode+=_ret.returnTemp+"\n";
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
	   public Snippet visit(FinalVariableDeclaration n, Snippet argu) {
	      Snippet _ret=new Snippet("","", null, false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.type.accept(this, argu);
	      Snippet f2 = n.identifier.accept(this, argu);
	     // if(!arrayInitializer){
		      arrayInitVar  = f2.returnTemp; 
	      //}
	      n.nodeToken1.accept(this, argu);
	      identifierToAddToGlobalHash = f2.returnTemp;
	      Snippet f4 = n.expression.accept(this, argu);
	      identifierToAddToGlobalHash = "";
	      
	      n.nodeToken2.accept(this, argu);
	   
	     //System.out.println(f1+""+f2+""+f4);
//	      if(arrayInitializer){
//	    	  _ret.returnTemp += generateTabs(blockDepth)+"final "+f1.expType.getTypeName()+" "+f2.returnTemp+" = ";
//	    	  _ret.returnTemp += arrayInit +"\n /*ArrayInitilizer*/"+arrayInitializerBlock;	 
//	 	     arrayInit = "";
//	 	     arrayInitializerBlock = "";
//	 	    arrayInitializer = false;
//	 	    tPlasmaCode+=_ret.returnTemp+"\n";
//	      }else{
	     // System.out.println(f1.expType.getTypeName()+" "+f2.returnTemp);
	      _ret.returnTemp = generateTabs(blockDepth)+"final "+f1.expType.getTypeName()+" "+f2.returnTemp+" = "+f4.returnTemp+";";
			tPlasmaCode += f4.preface+"\n";
			tPlasmaCode += _ret.returnTemp+"\n";
			tPlasmaCode+= f4.postface+"\n";
	      //}
	      return _ret;
	   }

	   /**
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken -> "="
	    * expression -> Expression()
	    * nodeToken1 -> ";"
	    */
	   public Snippet visit(UpdatableVariableDeclaration n, Snippet argu) {
	      Snippet _ret = new Snippet("", "", null, false);
	     Snippet f0 = n.type.accept(this, argu);
	     Snippet f1 =  n.identifier.accept(this, argu);
	     //if(!arrayInitializer)
		      arrayInitVar  = f1.returnTemp; 
	      n.nodeToken.accept(this, argu);
	      identifierToAddToGlobalHash = f1.returnTemp;
	     Snippet f3 =  n.expression.accept(this, argu);
	     identifierToAddToGlobalHash = "";
	      n.nodeToken1.accept(this, argu);
	      
//	      if(arrayInitializer){
//	    	  _ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+" "+f1.returnTemp+" = ";
//	    	  _ret.returnTemp+=arrayInit +"\n /*ArrayInitilizer*/"+arrayInitializerBlock;	 
//	 	     arrayInit = "";
//	 	     arrayInitializerBlock = "";
//	 	    arrayInitializer = false;
//	 	    tPlasmaCode+=_ret.returnTemp+"\n";
//	      }else{
	      _ret.returnTemp = generateTabs(blockDepth)+f0.returnTemp+" "+f1.returnTemp+" = "+f3.returnTemp+";";
			tPlasmaCode+= f3.preface+"\n";
			tPlasmaCode+=_ret.returnTemp+"\n";
			tPlasmaCode+= f3.postface+"\n";
	    	  
	     // }
	      return _ret;
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
	      Snippet _ret=null;
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }
	   
	   
	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "[0]"
	    */
	   public Snippet visit(PointAccess n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      Snippet identifier = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      _ret.returnTemp = ""+identifier.returnTemp+"";
	      return _ret;
	   }

	   
	   /** 
	    * identifier -> Identifier()
	    * nodeToken -> "+"
	    * nodeToken1 -> "["
	    * identifierList -> IdentifierList()
	    * nodeToken2 -> "]"
	    */
	   public Snippet visit(PlusOffset n, Snippet argu) {
	      Snippet _ret= new Snippet("","", null, false);
	      Snippet identifier = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      this.identifierList = new ArrayList<String>(0);
	      n.identifierList.accept(this, argu);
	      String vars = "";
	      int i = 0;
	      for(String str : identifierList)
			{
				if(i==0){
					vars += str;
				}else{
					vars += "+ " + str;
				}
				i++;
			}
	      n.nodeToken2.accept(this, argu);
	      _ret.returnTemp = identifier.returnTemp+" +"+vars;
	      return _ret;
	   }
	   
	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "*"
	    * nodeToken1 -> "["
	    * identifierList -> IdentifierList()
	    * nodeToken2 -> "]"
	    */
	   public Snippet visit(TimesOffset n, Snippet argu) {
		   Snippet _ret= new Snippet("","", null, false);
		   Snippet identifier = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		      n.nodeToken1.accept(this, argu);
		      n.identifierList.accept(this, argu);
		      String vars = "";
		      int i = 0;
		      for(String str : identifierList)
				{
					if(i==0){
						vars += str;
					}else{
						vars += "* " + str;
					}
					i++;
				}
		      n.nodeToken2.accept(this, argu);
		      _ret.returnTemp = identifier.returnTemp+" *"+vars;
		      return _ret;
	   }
	   
	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "/"
	    * nodeToken1 -> "["
	    * identifierList -> IdentifierList()
	    * nodeToken2 -> "]"
	    */
	   public Snippet visit(DivideOffset n, Snippet argu) {
		   Snippet _ret= new Snippet("","", null, false);
		     Snippet identifier = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		      n.nodeToken1.accept(this, argu);
		      n.identifierList.accept(this, argu);
		      String vars = "";
		      int i = 0;
		      for(String str : identifierList)
				{
					if(i==0){
						vars += str;
					}else{
						vars += "/ " + str;
					}
					i++;
				}
		      n.nodeToken2.accept(this, argu);
		      _ret.returnTemp = identifier.returnTemp+" /"+vars;
		      
		      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * expression -> Expression()
	    * nodeToken1 -> ")"
	    */
	   public Snippet visit(ExpressionInParentheses n, Snippet argu) {
	      Snippet _ret=null;
	      n.nodeToken.accept(this, argu);
	     _ret = n.expression.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "||"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ConditionalOrExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     Snippet f0 =  n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 = n.identifier1.accept(this, argu);
	     _ret.returnTemp = f0.returnTemp+" || "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "["
	    * nodeToken1 -> "0 :"
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    * nodeToken3 -> "->"
	    * nodeToken4 -> "here"
	    */
	   public Snippet visit(SimpleDistributionExpression n, Snippet argu) {
	      Snippet _ret=new Snippet("","",null, false);
	      
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet region = n.identifier.accept(this, argu);
	      _ret.returnTemp+=""+region.returnTemp+"+1";
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "&&"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ConditionalAndExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 = n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" && "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "|"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(InclusiveOrExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	      Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 =  n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" | "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "^"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ExclusiveOrExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	     Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 =  n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" ^ "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "&"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(AndExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      Snippet f2 = n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" & "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "=="
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(EqualsExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	     Snippet f0 =  n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 =  n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" == "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "!="
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(NonEqualsExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	      Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      Snippet f2 = n.identifier1.accept(this, argu);
	      _ret.returnTemp = f0.returnTemp+" != "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "<"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(LessThanExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
	     Snippet f0 = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	     Snippet f2 = n.identifier1.accept(this, argu);
	     _ret.returnTemp = f0.returnTemp+" < "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(GreaterThanExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" > "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "<="
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(LessThanEqualExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" <= "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">="
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(GreaterThanEqualExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" >= "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "<<"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ShiftLeftExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" << "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">>"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ShiftRightExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" >> "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">>>"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ShiftRightUnsignedExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" >>> "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "+"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(PlusExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" + "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "-"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(MinusExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" - "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "*"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(TimesExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" * "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "/"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(DivideExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" / "+f2.returnTemp;
	      return _ret;
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "%"
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(ModulusExpression n, Snippet argu) {
		   Snippet _ret= new Snippet("","",null,false);
		   Snippet f0 = n.identifier.accept(this, argu);
		      n.nodeToken.accept(this, argu);
		     Snippet f2 = n.identifier1.accept(this, argu);
		     _ret.returnTemp = f0.returnTemp+" % "+f2.returnTemp;
	      return _ret;
	   }

	   /**FODO THIS NEEDS TO BE FIXED
	    * nodeToken -> "["
	    * nodeToken1 -> "0 :"
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    */
	   public Snippet visit(RegionConstant n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null, false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      Snippet f2  = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      //_ret.returnTemp = "["+f2.returnTemp+"]";
	      _ret.returnTemp = ""+f2.returnTemp+"+1";
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
	   public Snippet visit(SinExpression n, Snippet argu) {
			Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp = "Math.sin("+f4.returnTemp+")";
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
	   public Snippet visit(CosExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	  	_ret.returnTemp = "Math.cos("+f4.returnTemp+")";
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
	   public Snippet visit(PowExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	    Snippet f6 =  n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      _ret.returnTemp = "Math.pow("+f4.returnTemp+", "+f6.returnTemp+")";
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
	   public Snippet visit(ExpExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp = "Math.exp("+f4.returnTemp+")";
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
	   public Snippet visit(SqrtExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp = "Math.sqrt("+f4.returnTemp+")";
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
	   public Snippet visit(AbsExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp = "Math.abs("+f4.returnTemp+")";
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
	   public Snippet visit(MinExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	    Snippet f4 =  n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      Snippet f6 = n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      _ret.returnTemp = "Math.min("+f4.returnTemp+", "+f6.returnTemp+")";
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
	   public Snippet visit(MaxExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     Snippet f4 =  n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	     Snippet f6 = n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      _ret.returnTemp = "Math.max("+f4.returnTemp+", "+f6.returnTemp+")";
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
	   public Snippet visit(LogExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     Snippet f4 = n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      _ret.returnTemp = "Math.log("+f4.returnTemp+")";
	      return _ret;
	   }

	   /**
	    * nodeToken -> "~"
	    * identifier -> Identifier()
	    */
	   public Snippet visit(ComplimentExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      _ret.returnTemp = "~ "+f1.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "!"
	    * identifier -> Identifier()
	    */
	   public Snippet visit(NotExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet f1 = n.identifier.accept(this, argu);
	      _ret.returnTemp = "! "+f1.returnTemp;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "int"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public Snippet visit(CoercionToIntExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	    _ret =  n.expression.accept(this, argu);
	      
			_ret.returnTemp = "(" + "int" + ")" + _ret.returnTemp;
			_ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "double"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public Snippet visit(CoercionToDoubleExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret = n.expression.accept(this, argu);
	      _ret.returnTemp = "(" + "double" + ")" + _ret.returnTemp;
			_ret.expType = new X10Double();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "long"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public Snippet visit(CoercionToLongExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret = n.expression.accept(this, argu);
	      _ret.returnTemp = "(" + "long" + ")" + _ret.returnTemp;
			_ret.expType = new X10Long();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "short"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public Snippet visit(CoercionToShortExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret = n.expression.accept(this, argu);
	      _ret.returnTemp = "(" + "short" + ")" + _ret.returnTemp;
			_ret.expType = new X10SShort();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "byte"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public Snippet visit(CoercionToByteExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      _ret = n.expression.accept(this, argu);
	      _ret.returnTemp = "(" + "byte" + ")" + _ret.returnTemp;
			_ret.expType = new X10Byte();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * typeAnnotation -> TypeAnnotation()
	    * nodeToken1 -> ")"
	    * nodeToken2 -> "("
	    * expression -> Expression()
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(TypeAnnotatedExpression n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet type =n.typeAnnotation.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      inTypeAnnotatedExpression = true;
	     
	      _ret = n.expression.accept(this, argu);
	     if(!inTypeAnnotatedExpression){
	    	 if(type.expType instanceof X10Region || type.expType instanceof X10ValueArray || type.expType instanceof X10Point)
				{
	    		
					_ret.returnTemp = "(" + type.expType.getTypeName() + ")(" + _ret.returnTemp+"";
					
				}
	    	
	     }else{
	    	 if(type.expType instanceof X10Region || type.expType instanceof X10ValueArray || type.expType instanceof X10Point)
				{
					_ret.returnTemp = "(" + type.expType.getTypeName() + ")(" + _ret.returnTemp+")";
					
				} 
	     }
	      inTypeAnnotatedExpression = false;
	      n.nodeToken3.accept(this, argu);
			_ret.expType = type.expType;
	      return _ret;
	   }

	   /**
	    * nodeChoice -> UpdatableArrayType()
	    *       | ValueArrayType()
	    *       | DistType()
	    *       | RegionType()
	    *       | PointType()
	    */
	   public Snippet visit(TypeAnnotation n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.nodeChoice.accept(this, argu);
	      return _ret;
	   }

	   /**TODO needs to be fixed RUNTIME CHECK to see if the ID lies within the bounds
	    * 	    * nodeToken -> "place.places"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    */
	   public Snippet visit(Place n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     _ret = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      //return indentifier
	      //return new Snippet("", "place.places("+ _ret.returnTemp +")", new X10Place(), false);
	      return new Snippet("", _ret.returnTemp, new X10Place(), false);
	   }

	   /**
	    * nodeToken -> "System.currentTimeMillis"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ")"
	    */
	   public Snippet visit(CurrentTime n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      return new Snippet("", "System.currentTimeMillis()", new X10Long(), false);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "["
	    * identifier1 -> Identifier()
	    * nodeToken1 -> "]"
	    */
	   public Snippet visit(ArrayAccess n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      String arrayName = n.identifier.accept(this, argu).returnTemp;
	      arrayInitVar = arrayName;
	      //Symbol sym = getIdentifier(arrayName, currentBlock, currentClassName);
	      n.nodeToken.accept(this, argu);
	      String index = n.identifier1.accept(this, argu).returnTemp;
	      n.nodeToken1.accept(this, argu);
	    //  if(sym.symbolType instanceof X10ValueArray)
				return new Snippet("", arrayName+"["+index+"]", /*sym.symbolType*/null, false);
			//else
				//return new Snippet("", programClassName + "." + getArrayGetValueMethod(((X10ReferenceArray)sym.symbolType).arrayElementType) +"("+arrayName + ", " + index+")", ((X10ReferenceArray)sym.symbolType).arrayElementType, false);
	   }

	  /* private String getArrayGetValueMethod(X10Type arrayElementType) {
			//do what i planned to with the hash map form the parser
			return arrayElementType.getTypeName().toUpperCase()+"GetValue";
		}*/
	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * identifier1 -> Identifier()
	    * nodeToken1 -> "("
	    * nodeOptional -> ( IdentifierList() )?
	    * nodeToken2 -> ")"
	    */
	   public Snippet visit(MethodCall n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      String className = n.identifier.accept(this, argu).expType.getTypeName();
	     // String className2 = n.identifier.accept(this, argu).returnTemp;
	      n.nodeToken.accept(this, argu);
	      String methodName = n.identifier1.accept(this, argu).expType.getTypeName();
	      n.nodeToken1.accept(this, argu);
	      this.identifierList = new ArrayList<String>(0);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);

			SymbolTableClassEntry stce = classSymbolTable.get(className);
			SymbolTableMethodEntry stme = stce.methods.get(methodName);
			Snippet retExp = new Snippet("", "", stme.returnType, false);
			retExp.returnTemp = className + "." + methodName + "(";
			
			
			int i = 0;
			for(String str : identifierList)
			{
				if(i==0){
					retExp.returnTemp += str;
				}else{
					retExp.returnTemp += ", " + str;
				}
				i++;
			}
			String toAdd ="";
			
			//if(classSymbolTable.get(className).constructors.size()!=0){
				if(!inAsync){
					if(i>0){
						toAdd+=",";
					}
					toAdd+="myUniquePlacePoint";
				}else{
					
					if(i>0){
						toAdd+=",";
					}
					toAdd+=asyncPoint+"";
				}
			//}
			retExp.returnTemp +=toAdd+ ")";
			
			if(methodName.equals("getUniqueDist")){
				useGetUniqueDist = true;
				retExp.returnTemp = "Program" + "." + "UniqueDistribution"; 	
			}
			return retExp;
	   }

	   
	   
	  
	 
	   
	   
	   /**
	    * nodeToken -> "this"
	    * nodeToken1 -> "."
	    * identifier -> Identifier()
	    * nodeToken2 -> "("
	    * nodeOptional -> ( IdentifierList() )?
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(MethodCallInConstructor n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      String className = "this";
	      n.nodeToken.accept(this, argu);
	     String methodName = n.identifier.accept(this, argu).expType.getTypeName();
	      this.identifierList = new ArrayList<String>(0);
			//identifierList.add("this");
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      //problem could be here
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	     // SymbolTableClassEntry stce = classSymbolTable.get(className);
	     
			//SymbolTableMethodEntry stme = stce.methods.get(methodName);
			Snippet retExp = new Snippet("", "", null, false);
			retExp.returnTemp = "this" + "." + methodName + "(";
			int i = 0;
			for(String str : identifierList)
			{
				if(i==0)
					retExp.returnTemp += str;
				else
					retExp.returnTemp += ", " + str;
				i++;
			}
			String toAdd ="";
			//if(!classes.containsKey(className)){
			if(!inAsync){
				if(i>0){
					toAdd+=",";
				}
				toAdd+="myUniquePlacePoint";
			}else{
				
				if(i>0){
					toAdd+=",";
				}
				toAdd+=asyncPoint+"";
			}
			//}
			retExp.returnTemp +=toAdd+ ")";
	      return retExp;
	   }

	   
	
	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "id"
	    */
	   public Snippet visit(DotId n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     // return new Snippet("",_ret.returnTemp + ".id", new X10Integer(), false);
	      
	      return new Snippet("","0", new X10Integer(), false);
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
	   public Snippet visit(DotIdentifierDotGet n, Snippet argu) {
		   Snippet _ret=new Snippet("", "", new X10Place(), false);
			
	      String Distn = n.identifier.accept(this, argu).returnTemp;
	      n.nodeToken.accept(this, argu);
	      String Dist =  n.identifier1.accept(this, argu).returnTemp;
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      this.identifierList = new ArrayList<String>(0);
	      n.identifierList.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      String distName = generateTemp();
			_ret.preface = generateTabs(blockDepth) + "final" + " " + Constants.distribution + 
							" " + distName + " = " + Distn+"."+Dist+";\n";
			_ret.returnTemp = programClassName + "." + Constants.getPlaceFromDist + "(" + distName + ", " 
												+ this.identifierList.get(0) + ")";
	      return _ret;
	   }

	   /** 
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "next"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(DotNext n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      //indetifer +1%programclass.maxplaces
	     // return new Snippet("", _ret.returnTemp+".next()", new X10Place(), false);
	      return new Snippet("", "(("+_ret.returnTemp+"+1)%Program.MAX_PLACES)", new X10Place(), false);
	   }

	   /**TODO THIS NEEDS TO BE FIXED TODO PROBLEM
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "prev"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(DotPrev n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      //Maxplaces-identifer%programclass.maxplaces
	      //return new Snippet("", _ret.returnTemp+".prev()", new X10Place(), false);
	      //if(identifier == 0){identifier =Program.MAX_PLACES}else{identifier-1}
	      return new Snippet("", "Program.prev("+_ret.returnTemp+")", new X10Place(), false);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "isFirst"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(DotIsFirst n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      //isFirst if(identifier == 0 )
	      //identifier == 0
	      //return new Snippet("", _ret.returnTemp+".isFirst()", new X10Boolean(), false);
	      return new Snippet("", _ret.returnTemp+"==0", new X10Boolean(), false);
	      
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "isLast"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public Snippet visit(DotIsLast n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret =  n.identifier.accept(this, argu);
	     
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      //identifier == programclass.maxplaces -1 
	      //return new Snippet("", _ret.returnTemp+".isLast()", new X10Boolean(), false);
	      return new Snippet("", _ret.returnTemp+"== Program.MAX_PLACES-1", new X10Boolean(), false);
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
	   public Snippet visit(DotRegionDotSize n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      Snippet _ret1 =  n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      String _ret2 = ".length";
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	     
	      return new Snippet("", _ret1.returnTemp+""+_ret2/*+"."+"size"*/, new X10Integer(), false);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * identifier1 -> Identifier()
	    */
	   public Snippet visit(DotIdentifier n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      String object = n.identifier.accept(this, argu).expType.getTypeName();
	      String identifier = n.identifier1.accept(this, argu).expType.getTypeName();
	     // System.out.println(" "+currentClassName+  object+ " "+identifier+" "+currentBlock);
	      /*Symbol sym1 = getIdentifier(object, currentBlock, currentClassName);
			String refClass = "";
			if(sym1 == null)
				refClass = object; // Static reference
			else
				refClass = sym1.symbolType.getTypeName(); // Object reference
	      */n.nodeToken.accept(this, argu);
	     
	     
			//Symbol sym2 = getIdentifier(identifier, 0, refClass); 
			String toAdd;
			
			if( !classes.containsKey(object) && classSymbolTable.containsKey(object) && !classSymbolTable.get(object).classType.equals(Constants.ClassType.VALUE) ){
			if(!inAsync ){
				tPlasmaCode += generateTabs(blockDepth)+generatePlaceCheckCode( "myUniquePlacePoint", object);
			}else{
				tPlasmaCode += generateTabs(blockDepth)+generatePlaceCheckCode(asyncPoint , object);
			}
			}
			return new Snippet("", ""+object + "." + identifier, /*sym2.symbolType*/null /* Not needed, but kept only as a cross check */, false);
	   }
	   
	   //utilizes a global Hashmap
	  // public HashMap<Integer, Set<Object>> globalPointerHashMap = new HashMap<Integer, Set<Object>>();
	private Object classToAddToGlobalHash;
	   public String generatePlaceCheckCode(String point, String nameOfIdentifier){
		  // globalPointerHashMap.containsKey(1);
		
		  // globalPointerHashMap.get(1).contains(nameOfIdentifier);
		   String ret ="";
		   
		   if(!classes.containsKey(nameOfIdentifier)){
			   ret =  generateTabs(blockDepth)+"if(!Program.globalPointerHashMap.get("+point+").contains("+nameOfIdentifier+".hashCode())){\n"+generateTabs(blockDepth)+"throw new RuntimeException(\"Object in wrong place\");\n"+generateTabs(blockDepth)+"}";
		   }
		   return ret;
	   }

	   /**
	    * nodeToken -> "new"
	    * identifier -> Identifier()
	    * nodeToken1 -> "("
	    * nodeOptional -> [ IdentifierList() ]
	    * nodeToken2 -> ")"
	    */
	   public Snippet visit(NewObject n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      String identifier = n.identifier.accept(this, argu).returnTemp;
	      n.nodeToken1.accept(this, argu);
	      this.identifierList = new ArrayList<String>(0);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	  	String toAdd ="";
		
	  	
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
			
			if(!classes.containsKey(classToAddToGlobalHash) && classSymbolTable.get(identifier).constructors.size()!=0){
			if(!inAsync){
				if(i>0){
					toAdd+=",";
				}
				toAdd+="myUniquePlacePoint"+"";
			}else{
				
				if(i>0){
					toAdd+=",";
				}
				toAdd+=asyncPoint+"";
			}
			}
			ret += toAdd+")";
			
			
			 toAdd ="";
			if(!identifierToAddToGlobalHash.equals("")){
				//toAdd+= "if(Prgoram.globalPointerHashMap.containsKey(myUniquePlacePoint)){\n";
				if(!inAsync){
					
					toAdd+= generateTabs(blockDepth)+"\nProgram.globalPointerHashMap.get(myUniquePlacePoint).add("+identifierToAddToGlobalHash+".hashCode());\n";
				}else{
				
					toAdd+= generateTabs(blockDepth)+"\nProgram.globalPointerHashMap.get("+asyncPoint+").add("+identifierToAddToGlobalHash+".hashCode());\n";
				}
				//toAdd+="\nelse{throw new RuntimeException(\"Object in wrong place\");\n }";
			}
			
			Snippet myRet = new Snippet("", ret, new X10Class(identifier), false);
			myRet.postface += toAdd;
			return myRet;

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
	   public Snippet visit(NewValueArray n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      Snippet elementType =  n.nonArrayType.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      String identifier  = n.identifier.accept(this, argu).returnTemp;
	      inValueArray=true;
	     boolean truth = inTypeAnnotatedExpression;
	     boolean arrayInitTruth = arrayInitializer;
	     String arrayInitializerBlockOld = arrayInitializerBlock;
	      n.arrayInitializer.accept(this, argu);
	      inTypeAnnotatedExpression = truth;
	      inValueArray=false;
	      n.nodeToken3.accept(this, argu);
	      
	      String arrayInit =  "new " + " " + elementType.expType.getTypeName() + "" + "/*value*/" + "[" + identifier + "]";
	    if(inTypeAnnotatedExpression ){  
	    _ret = new Snippet("", 
				"new" + " " + elementType.expType.getTypeName() + "" + "/*value*/" + "[" + identifier + "]);\n/*arrayInitBlock*/\n" + arrayInitializerBlock, 
				new X10ValueArray(1, elementType.expType), false);
	    }else{
	    	_ret = new Snippet("", 
					"new" + " " + elementType.expType.getTypeName() + "" + "/*value*/" + "[" + identifier + "];\n/*arrayInitBlock*/\n" + arrayInitializerBlock, 
					new X10ValueArray(1, elementType.expType), false);
	    }
	   
	      arrayInit = "";
	      arrayInitializerBlock = arrayInitializerBlockOld;
	      arrayInitializer = arrayInitTruth;
	      inTypeAnnotatedExpression = false;
	      return _ret;
	   }

	   /**
	    * nodeToken -> "new"
	    * nonArrayType -> NonArrayType()
	    * nodeToken1 -> "["
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    * nodeOptional -> [ ArrayInitializer() ]
	    */

	   public Snippet visit(NewUpdatableArray n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	     Snippet elementType = n.nonArrayType.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	     Snippet identifier = n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      //_ret.returnTemp = "new "+f1.expType.typeName.toUpperCase()+"Array("+f3.returnTemp+")";
	      
	      updateArrayInitializer = true;
	     //String token = "";
	      String arrayInitializerBlockOld = arrayInitializerBlock;
	      boolean truth = inTypeAnnotatedExpression;
		     boolean arrayInitTruth = arrayInitializer;
	    Snippet ifNull =   n.nodeOptional.accept(this, argu);
	    inUpdateArray = true;
	    if(ifNull != null && inValueArray != true){
	      String arrayInit =  "new " + " " + elementType.expType.getTypeName() + "" + "/*NewUpdatableArray*/" + "[" + identifier.returnTemp + "]";
		    if(inTypeAnnotatedExpression ){  
		    _ret = new Snippet("", 
					"new" + " " + elementType.expType.getTypeName() + "" + "/*NewUpdatableArray*/" + "[" + identifier.returnTemp + "]"+";\n/*arrayInitBlock*/\n" + arrayInitializerBlock, 
					new X10ValueArray(1, elementType.expType), false);
		    }else{
		    	
		    	_ret = new Snippet("", 
						"new" + " " + elementType.expType.getTypeName() + "" + "/*NewUpdatableArray*/" + "[" + identifier.returnTemp + "];\n/*arrayInitBlock*/\n" + arrayInitializerBlock, 
						new X10ValueArray(1, elementType.expType), false);
		    }
		   
		      arrayInit = "";
		      arrayInitializerBlock = arrayInitializerBlockOld;
		      arrayInitializer = arrayInitTruth;
		      updateArrayInitializer = false;
		      inTypeAnnotatedExpression = truth;
	    }else{
	    	updateArrayInitializer= false;
	      _ret.returnTemp = "new "+elementType.expType.typeName+"["+identifier.returnTemp+"]";
	    }
	      return _ret;
	   }

	   /**
	    * nodeToken -> <INTEGER_LITERAL>
	    */
	   public Snippet visit(IntegerLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> <LONG_LITERAL>
	    */
	   public Snippet visit(LongLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Long();
	      return _ret;
	   }

	   /**
	    * nodeToken -> <HEX_LITERAL>
	    */
	   public Snippet visit(HexLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> <FLOATING_POINT_LITERAL>
	    */
	   public Snippet visit(FloatingPointLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Double();
	      return _ret;
	   }

	   /**
	    * nodeToken -> <STRING_LITERAL>
	    */
	   public Snippet visit(StringLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	     _ret.expType = new X10String();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "true"
	    */
	   public Snippet visit(True n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	     _ret.expType = new X10Boolean();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "false"
	    */
	   public Snippet visit(False n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Boolean();
	      return _ret;
	   }

	   /**FTODO THIS MAY NEED TO BE FIXED
	    * nodeToken -> "here"
	    */
	   public Snippet visit(HereLiteral n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	     _ret.returnTemp = "0";
	     _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "place.FIRST_PLACE"
	    */
	   public Snippet visit(PlaceFirstPlace n, Snippet argu) {
	      Snippet _ret= new Snippet("","0",null,false);
	     _ret = n.nodeToken.accept(this, argu);
	     _ret.returnTemp = "0";
	      _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "place.LAST_PLACE"
	    */
	   public Snippet visit(PlaceLastPlace n, Snippet argu) {
	      Snippet _ret= new Snippet("","0",null,false);
	      //_ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "place.MAX_PLACES"
	    */
	   public Snippet visit(PlaceMaxPlaces n, Snippet argu) {
		   
		   //program.max_places;
	      Snippet _ret= new Snippet("","Program.MAX_PLACES",null,false);
	      //_ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Integer();
	      return _ret;
	   }

	   /**
	    * nodeToken -> "java.lang.Integer.SIZE"
	    */
	   public Snippet visit(JavaIntegerSize n, Snippet argu) {
	      Snippet _ret= new Snippet("","java.lang.Integer.SIZE",null,false);
	      _ret = n.nodeToken.accept(this, argu);
	      _ret.expType = new X10Integer();
	     
	      return _ret;
	   }

	   /**
	    * nodeToken -> "("
	    * pointType -> PointType()
	    * explodedSpecification -> ExplodedSpecification()
	    * nodeToken1 -> ")"
	    * block -> Block()
	    */
	   public Snippet visit(ArrayInitializer n, Snippet argu) {
	      Snippet _ret= new Snippet("","",null,false);
	      n.nodeToken.accept(this, argu);
	      int temp = currentBlock;
			currentBlock = blockId+1;
	     Snippet pt = n.pointType.accept(this, argu);
	      identifierList = new ArrayList<String>(0);
	     Snippet expSpec = n.explodedSpecification.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      String points = "";
	      boolean arrayInitTemp = arrayInitializer;
	      arrayInitializer = true;
	      
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
	      
	      
	        currentBlock = temp;
			String tempCode = tPlasmaCode;
			tPlasmaCode = "";
			//if(!updateArrayInitializer){
			arrayInitializerBlock = arrayInitVar+"["+expSpec.returnTemp+"] =";
			String arrayInitializerBlockOld = arrayInitializerBlock;
			String arrayInitVarTemp = arrayInitVar;
			n.block.accept(this, argu);
			arrayInitializerBlock=arrayInitializerBlockOld;
			arrayInitVar = arrayInitVarTemp;
			//_ret = new Snippet("", "(point(:rank==1)"+points+")"+tPlasmaCode, new X10Unassigned("", currentClassName), false);
			_ret = new Snippet("", "new "+pt.returnTemp+")", new X10Unassigned("", currentClassName), false);
			
			arrayInitializerBlock = "for(int "+expSpec.returnTemp+"= 0;"+expSpec.returnTemp+" <"+arrayInitVar+".length ;"+expSpec.returnTemp+"++ )";
			arrayInitializerBlock += tPlasmaCode+"\n";
			tPlasmaCode = tempCode;
			//arrayInitVar = arrayInitVarTemp;
			arrayInitializer=arrayInitTemp;
	      return _ret;
	   }
}
