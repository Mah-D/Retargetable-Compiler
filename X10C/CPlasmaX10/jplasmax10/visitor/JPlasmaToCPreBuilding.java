package jplasmax10.visitor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;

import util.symboltable.SymbolTable;

import jplasmax10.syntaxtree.*;


/*Add underscore to method name 
 * Correct access
 * Fields need to be handled
 * 
 * */

public class JPlasmaToCPreBuilding implements GJVoidVisitor<String>{
	  private String constructorName;
	  public HashMap<String, ArrayList<Integer>> myConstructorNames = new HashMap<String, ArrayList<Integer>>();
	private int totalParameters = 0;
	public HashMap<String, ClassObject> myClasses = new HashMap<String, ClassObject>();
 private String currentClassName = "";
private String currentMethodName;
private int globalTemp = 0;
public SymbolTable symbolTable;
private int blockid = 0;
public HashMap<String, ArrayList<String>> aHashMapClasses = new HashMap<String, ArrayList<String>>();
private ArrayList<String> myListOfDep = new ArrayList<String>();
public ArrayList<String> myListOfClasses = new ArrayList<String>();
private int blockOverallId=0;
	public void visit(NodeList n, String argu) {
	      int _count=0;
	      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
	         e.nextElement().accept(this,argu);
	         _count++;
	      }
	   }

	   public void visit(NodeListOptional n, String argu) {
	      if ( n.present() ) {
	         int _count=0;
	         for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
	            e.nextElement().accept(this,argu);
	            _count++;
	         }
	      }
	   }

	   public void visit(NodeOptional n, String argu) {
	      if ( n.present() )
	         n.node.accept(this,argu);
	   }

	   public void visit(NodeSequence n, String argu) {
	      int _count=0;
	      for ( Enumeration<Node> e = n.elements(); e.hasMoreElements(); ) {
	         e.nextElement().accept(this,argu);
	         _count++;
	      }
	   }

	   public void visit(NodeToken n, String argu) {}

	   //
	   // User-generated visitor methods below
	   //

	   /**
	    * mainClass -> MainClass()
	    * programClass -> ProgramClass()
	    * nodeListOptional -> ( TopLevelDeclaration() )*
	    * nodeToken -> <EOF>
	    */
	   public void visit(File n, String argu) {
	      n.mainClass.accept(this, argu);
	      n.programClass.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	      n.nodeToken.accept(this, argu);
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
	   public void visit(MainClass n, String argu) {
		   blockid = 0;
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentClassName = n.identifier.nodeToken.tokenImage;
	      myClasses.put(n.identifier.nodeToken.tokenImage, new ClassObject(n.identifier.nodeToken.tokenImage, new HashMap<String, MethodObject>(), new HashMap<String, PairsTypeName>()));
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	      n.nodeToken6.accept(this, argu);
	      n.nodeToken7.accept(this, argu);
	      n.nodeToken8.accept(this, argu);
	      n.nodeToken9.accept(this, argu);
	      n.nodeToken10.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken11.accept(this, argu);
	      n.nodeToken12.accept(this, argu);
	      n.identifier2.accept(this, argu);
	      n.nodeToken13.accept(this, argu);
	      n.identifier3.accept(this, argu);
	      n.nodeToken14.accept(this, argu);
	      n.nodeToken15.accept(this, argu);
	      n.nodeToken16.accept(this, argu);
	      n.nodeToken17.accept(this, argu);
	      n.nodeToken18.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "class"
	    * identifier -> Identifier()
	    * nodeToken1 -> "{"
	    * nodeListOptional -> ( ConstantDeclaration() )*
	    * nodeListOptional1 -> ( StaticMethodDeclaration() )*
	    * nodeToken2 -> "}"
	    */
	   public void visit(ProgramClass n, String argu) {
		   blockid = 0;
		   blockOverallId = 0;
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentClassName = n.identifier.nodeToken.tokenImage;
	      myClasses.put(n.identifier.nodeToken.tokenImage, new ClassObject(n.identifier.nodeToken.tokenImage, new HashMap<String, MethodObject>(), new HashMap<String, PairsTypeName>()));
	      n.nodeToken1.accept(this, argu);
	     // currentMethodName = n.identifier.nodeToken.tokenImage;
	    //  myClasses.get(currentClassName).myMethods.put(currentMethodName, new MethodObject(currentMethodName, new HashMap<String, PairsTypeName>()));
	      n.nodeListOptional.accept(this, argu);
	      n.nodeListOptional1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeChoice -> ClassDeclaration()
	    *       | ValueDeclaration()
	    */
	   public void visit(TopLevelDeclaration n, String argu) {
	      n.nodeChoice.accept(this, argu);
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
	   public void visit(ClassDeclaration n, String argu) {
		   blockid = 0;
		   blockOverallId = 0;
		   globalTemp=0;
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentClassName = n.identifier.nodeToken.tokenImage;
	      myClasses.put(n.identifier.nodeToken.tokenImage, new ClassObject(n.identifier.nodeToken.tokenImage, new HashMap<String, MethodObject>(), new HashMap<String, PairsTypeName>()));
	      myListOfDep = new ArrayList<String>();
	      
	      n.nodeToken1.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	      n.nodeListOptional1.accept(this, argu);
	      aHashMapClasses.put(n.identifier.nodeToken.tokenImage, myListOfDep);
	      myListOfClasses.add(n.identifier.nodeToken.tokenImage);
	      n.nodeListOptional2.accept(this, argu);
	      n.nodeListOptional3.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
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
	   public void visit(ValueDeclaration n, String argu) {
		   blockid = 0;
		   globalTemp=0;
		   blockOverallId = 0;
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentClassName = n.identifier.nodeToken.tokenImage;
	      myClasses.put(n.identifier.nodeToken.tokenImage, new ClassObject(n.identifier.nodeToken.tokenImage, new HashMap<String, MethodObject>(), new HashMap<String, PairsTypeName>()));
	      
	      myListOfDep = new ArrayList<String>();
	      n.nodeToken1.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	      aHashMapClasses.put(n.identifier.nodeToken.tokenImage, myListOfDep);
	      myListOfClasses.add(n.identifier.nodeToken.tokenImage);
	     
	      n.nodeListOptional1.accept(this, argu);
	      n.nodeListOptional2.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "public"
	    * identifier -> Identifier()
	    * nodeToken1 -> "("
	    * nodeOptional -> ( FormalParameterList() )?
	    * nodeToken2 -> ")"
	    * block -> Block()
	    */
	   public void visit(ConstructorDeclaration n, String argu) {
		   blockid = 0;
		   blockOverallId = 0;
	      n.nodeToken.accept(this, argu);
	     constructorName =  n.identifier.nodeToken.tokenImage;
	     Integer temp  = 0;
	     globalTemp++;
	     currentMethodName = n.identifier.nodeToken.tokenImage+"_"+globalTemp;
	      myClasses.get(currentClassName).myMethods.put(currentMethodName, new MethodObject(currentMethodName, new HashMap<String, PairsTypeName>()));
	      totalParameters = 0;
	     n.nodeOptional.accept(this, argu);
	     temp = totalParameters;
	     MethodObject mo = myClasses.get(currentClassName).myMethods.get(currentMethodName);
	     myClasses.get(currentClassName).myMethods.put(n.identifier.nodeToken.tokenImage+"_"+totalParameters, mo);
	     
	     
	     if(myConstructorNames.containsKey(constructorName)){
	    	 
	     }else{
	     myConstructorNames.put(constructorName, new ArrayList<Integer>());
	     }
	     
	     
	      n.nodeToken1.accept(this, argu);
	      
	      
	      myConstructorNames.get(constructorName).add(temp);
	      currentMethodName = n.identifier.nodeToken.tokenImage+"_"+totalParameters;
	      myClasses.get(currentClassName).myMethods.put(currentMethodName, new MethodObject(currentMethodName, new HashMap<String, PairsTypeName>()));
	     
	      n.nodeToken2.accept(this, argu);
	      n.block.accept(this, argu);
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
	   public void visit(ConstantDeclaration n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.methodCall.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	// System.out.println(currentClassName+" "+currentMethodName);
	    	  myClasses.get(currentClassName).myFields.put(  n.identifier.nodeToken.tokenImage, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));

	      }
	   }

	   /**
	    * nodeToken -> "public"
	    * nodeToken1 -> "final"
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken2 -> ";"
	    */
	   public void visit(InitializableConstantDeclaration n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	 
myClasses.get(currentClassName).myFields.put(  n.identifier.nodeToken.tokenImage, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));
			if( ((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType){
				myListOfDep.add(((ClassNameType)((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice ).identifier.nodeToken.tokenImage);
			}
	      }
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "public"
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken1 -> ";"
	    */
	   public void visit(UpdatableFieldDeclaration n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	 
	    	  myClasses.get(currentClassName).myFields.put(  n.identifier.nodeToken.tokenImage, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));
	    	  if( ((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice instanceof ClassNameType){
	    			myListOfDep.add(((ClassNameType)((NonArrayType)n.type.nodeChoice.choice).nodeChoice.choice ).identifier.nodeToken.tokenImage);
				}
	      }
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(StaticMethodDeclaration n, String argu) {
		   blockid = 0;
		   blockOverallId = 0;
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.returnType.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentMethodName = n.identifier.nodeToken.tokenImage;
	      myClasses.get(currentClassName).myMethods.put(currentMethodName, new MethodObject(currentMethodName, new HashMap<String, PairsTypeName>()));
	     
	      n.nodeToken2.accept(this, argu);
	      totalParameters = 0;
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.block.accept(this, argu);
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
	   public void visit(MethodDeclaration n, String argu) {
		   blockid = 0;
		   blockOverallId = 0;
	      n.nodeToken.accept(this, argu);
	      n.returnType.accept(this, argu);
	      n.identifier.accept(this, argu);
	      currentMethodName = n.identifier.nodeToken.tokenImage;
	      myClasses.get(currentClassName).myMethods.put(currentMethodName, new MethodObject(currentMethodName, new HashMap<String, PairsTypeName>()));
	      n.nodeToken1.accept(this, argu);
	      totalParameters = 0;
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.block.accept(this, argu);
	   }

	   /**
	    * finalFormalParameter -> FinalFormalParameter()
	    * nodeListOptional -> ( FormalParameterRest() )*
	    */
	   public void visit(FormalParameterList n, String argu) {
		  
	      n.finalFormalParameter.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "final"
	    * type -> Type()
	    * identifier -> Identifier()
	    */
	   public void visit(FinalFormalParameter n, String argu) {
		  totalParameters++;
	      n.nodeToken.accept(this, argu);
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	
	    	  myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.put(  n.identifier.nodeToken.tokenImage+blockid, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));

	      }
	   }

	   /**
	    * nodeToken -> ","
	    * finalFormalParameter -> FinalFormalParameter()
	    */
	   public void visit(FormalParameterRest n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.finalFormalParameter.accept(this, argu);
	   }

	   /**
	    * nodeChoice -> VoidType()
	    *       | Type()
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
	    *       | NonArrayType()
	    */
	   public void visit(Type n, String argu) {
	      n.nodeChoice.accept(this, argu);
	   }

	   /**
	    * nonArrayType -> NonArrayType()
	    * nodeToken -> "["
	    * nodeToken1 -> "]"
	    */
	   public void visit(UpdatableArrayType n, String argu) {
	      n.nonArrayType.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(NonArrayType n, String argu) {
	      n.nodeChoice.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "boolean"
	    */
	   public void visit(BooleanType n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "byte"
	    */
	   public void visit(ByteType n, String argu) {
	      n.nodeToken.accept(this, argu);
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
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "double"
	    */
	   public void visit(DoubleType n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "String"
	    */
	   public void visit(StringType n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "place"
	    */
	   public void visit(PlaceType n, String argu) {
	      n.nodeToken.accept(this, argu);
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
	    * nodeToken -> "{"
	    * nodeListOptional -> ( Statement() )*
	    * nodeToken1 -> "}"
	    */
	   public void visit(Block n, String argu) {
		   int tempBlockId = blockid;
		   blockOverallId++;
			blockid = blockOverallId;
		   //blockid++;
	      n.nodeToken.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      blockid = tempBlockId;
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
	   public void visit(Statement n, String argu) {
	      n.nodeChoice.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "="
	    * expression -> Expression()
	    * nodeToken1 -> ";"
	    */
	   public void visit(Assignment n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.expression.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(ArrayAssignment n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifierList.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
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
	   public void visit(FieldAssignment n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.identifier2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
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
	   public void visit(ThisFieldAssignment n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "async"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * block -> Block()
	    */
	   public void visit(AsyncStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.block.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "break"
	    * nodeToken1 -> ";"
	    */
	   public void visit(BreakStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "continue"
	    * nodeToken1 -> ";"
	    */
	   public void visit(ContinueStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(DoStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.block.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "finish"
	    * block -> Block()
	    */
	   public void visit(FinishStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.block.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "if"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * block -> Block()
	    * nodeOptional -> [ ElseClause() ]
	    */
	   public void visit(IfStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.block.accept(this, argu);
	      n.nodeOptional.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "else"
	    * block -> Block()
	    */
	   public void visit(ElseClause n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.block.accept(this, argu);
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
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeListOptional -> ( IdentifierRest() )*
	    */
	   public void visit(IdentifierList n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeListOptional.accept(this, argu);
	   }

	   /**
	    * nodeToken -> ","
	    * identifier -> Identifier()
	    */
	   public void visit(IdentifierRest n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	   }

	   /**
	    * methodCall -> MethodCall()
	    * nodeToken -> ";"
	    */
	   public void visit(MethodCallStatement n, String argu) {
	      n.methodCall.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * methodCallInConstructor -> MethodCallInConstructor()
	    * nodeToken -> ";"
	    */
	   public void visit(MethodCallStatementInConstructor n, String argu) {
	      n.methodCallInConstructor.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "System.out.println"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public void visit(PrintlnStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "System.out.print"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public void visit(PrintStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "System.err.println"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * nodeToken3 -> ";"
	    */
	   public void visit(PrintErrorStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "return"
	    * nodeOptional -> [ Identifier() ]
	    * nodeToken1 -> ";"
	    */
	   public void visit(ReturnStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(SwitchStatement n, String argu) {
			
			
			
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      blockOverallId++;
			int tempBlockId = blockid;
			blockid = blockOverallId;
	      n.nodeListOptional.accept(this, argu);
	      blockid = tempBlockId;
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * switchLabel -> SwitchLabel()
	    * nodeToken -> ":"
	    * block -> Block()
	    */
	   public void visit(SwitchEntry n, String argu) {
		  blockid++;
	      n.switchLabel.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.block.accept(this, argu);
	   }

	   /**
	    * nodeChoice -> Case()
	    *       | Default()
	    */
	   public void visit(SwitchLabel n, String argu) {
	      n.nodeChoice.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "case"
	    * identifier -> Identifier()
	    */
	   public void visit(Case n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "default"
	    */
	   public void visit(Default n, String argu) {
	      n.nodeToken.accept(this, argu);
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
	   public void visit(ThrowStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "while"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    * block -> Block()
	    */
	   public void visit(WhileStatement n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.block.accept(this, argu);
	   }
	   
	   
	   public String convertToRightSymbol(NonArrayType nat){
		   Node node = nat.nodeChoice.choice;
		   if(node instanceof ClassNameType){
			   return "%class";
		   }else if(node instanceof PlaceType || node instanceof IntegerType  || node instanceof ShortType || node instanceof ByteType){
			   return "%d";
		   }else if(node instanceof DoubleType){
			   return "%f";
		   }else if(node instanceof LongType){
			   return "%lld";
		   }else if(node instanceof BooleanType){
			   return "%d";
		   }else if(node instanceof StringType){
			   return "%s";
		   }else{
			  
			   return "%d BUGERROR";
		   }
	   }
	   
	   
	   public String convertToRightSymbolArrays(UpdatableArrayType nat){
		   Node node = nat.nonArrayType.nodeChoice.choice;
		   if(node instanceof ClassNameType){
			   return "%c";
		   }else if(node instanceof IntegerType || node instanceof DoubleType || node instanceof LongType || node instanceof ShortType || node instanceof ByteType){
			   return "%d";
		   }else if(node instanceof BooleanType){
			   return "%d";
		   }else if(node instanceof StringType){
			   return "%s";
		   }else{
			   return "ERROR CANT CAT";
		   }
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
	      n.nodeToken.accept(this, argu);
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	 
myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.put(  n.identifier.nodeToken.tokenImage+blockid, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));

	      }else if(n.type.nodeChoice.choice instanceof UpdatableArrayType ){
	    	  UpdatableArrayType nat = (UpdatableArrayType)n.type.nodeChoice.choice;
	    	  myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.put(n.identifier.nodeToken.tokenImage+blockid, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbolArrays(nat)));  
	      }
	      n.nodeToken1.accept(this, argu);
	      n.expression.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * type -> Type()
	    * identifier -> Identifier()
	    * nodeToken -> "="
	    * expression -> Expression()
	    * nodeToken1 -> ";"
	    */
	   public void visit(UpdatableVariableDeclaration n, String argu) {
	      n.type.accept(this, argu);
	      n.identifier.accept(this, argu);
	      if(n.type.nodeChoice.choice instanceof NonArrayType ){
	    	  NonArrayType nat = (NonArrayType)n.type.nodeChoice.choice;
	    	 
myClasses.get(currentClassName).myMethods.get(currentMethodName).myLocalsParams.put(  n.identifier.nodeToken.tokenImage+blockid, new PairsTypeName(n.identifier.nodeToken.tokenImage, convertToRightSymbol(nat)));

	      }
	      n.nodeToken.accept(this, argu);
	      n.expression.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(Expression n, String argu) {
	      n.nodeChoice.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * expression -> Expression()
	    * nodeToken1 -> ")"
	    */
	   public void visit(ExpressionInParentheses n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.expression.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "||"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ConditionalOrExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "&&"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ConditionalAndExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "|"
	    * identifier1 -> Identifier()
	    */
	   public void visit(InclusiveOrExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "^"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ExclusiveOrExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "&"
	    * identifier1 -> Identifier()
	    */
	   public void visit(AndExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "=="
	    * identifier1 -> Identifier()
	    */
	   public void visit(EqualsExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "!="
	    * identifier1 -> Identifier()
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
	    * identifier -> Identifier()
	    * nodeToken -> ">"
	    * identifier1 -> Identifier()
	    */
	   public void visit(GreaterThanExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "<="
	    * identifier1 -> Identifier()
	    */
	   public void visit(LessThanEqualExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">="
	    * identifier1 -> Identifier()
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
	    * identifier -> Identifier()
	    * nodeToken -> ">>"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ShiftRightExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> ">>>"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ShiftRightUnsignedExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "+"
	    * identifier1 -> Identifier()
	    */
	   public void visit(PlusExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "-"
	    * identifier1 -> Identifier()
	    */
	   public void visit(MinusExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "*"
	    * identifier1 -> Identifier()
	    */
	   public void visit(TimesExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "/"
	    * identifier1 -> Identifier()
	    */
	   public void visit(DivideExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "%"
	    * identifier1 -> Identifier()
	    */
	   public void visit(ModulusExpression n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "sin"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(SinExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "cos"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(CosExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
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
	   public void visit(PowExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "exp"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(ExpExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "sqrt"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(SqrtExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "abs"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(AbsExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
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
	   public void visit(MinExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
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
	   public void visit(MaxExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken5.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "Math"
	    * nodeToken1 -> "."
	    * nodeToken2 -> "log"
	    * nodeToken3 -> "("
	    * identifier -> Identifier()
	    * nodeToken4 -> ")"
	    */
	   public void visit(LogExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "~"
	    * identifier -> Identifier()
	    */
	   public void visit(ComplimentExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "!"
	    * identifier -> Identifier()
	    */
	   public void visit(NotExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "int"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public void visit(CoercionToIntExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.expression.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "double"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public void visit(CoercionToDoubleExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.expression.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "long"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public void visit(CoercionToLongExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.expression.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "short"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public void visit(CoercionToShortExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.expression.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "("
	    * nodeToken1 -> "byte"
	    * nodeToken2 -> ")"
	    * expression -> Expression()
	    */
	   public void visit(CoercionToByteExpression n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.expression.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "place.places"
	    * nodeToken1 -> "("
	    * identifier -> Identifier()
	    * nodeToken2 -> ")"
	    */
	   public void visit(Place n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "System.currentTimeMillis"
	    * nodeToken1 -> "("
	    * nodeToken2 -> ")"
	    */
	   public void visit(CurrentTime n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "["
	    * identifier1 -> Identifier()
	    * nodeToken1 -> "]"
	    */
	   public void visit(ArrayAccess n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * identifier1 -> Identifier()
	    * nodeToken1 -> "("
	    * nodeOptional -> ( IdentifierList() )?
	    * nodeToken2 -> ")"
	    */
	   public void visit(MethodCall n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "this"
	    * nodeToken1 -> "."
	    * identifier -> Identifier()
	    * nodeToken2 -> "("
	    * nodeOptional -> ( IdentifierList() )?
	    * nodeToken3 -> ")"
	    */
	   public void visit(MethodCallInConstructor n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "id"
	    */
	   public void visit(DotId n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
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
	   public void visit(DotIdentifierDotGet n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	      n.identifierList.accept(this, argu);
	      n.nodeToken4.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "next"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public void visit(DotNext n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "prev"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public void visit(DotPrev n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "isFirst"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public void visit(DotIsFirst n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "isLast"
	    * nodeToken2 -> "("
	    * nodeToken3 -> ")"
	    */
	   public void visit(DotIsLast n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	      n.nodeToken3.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * nodeToken1 -> "length"
	    */
	   public void visit(DotLength n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	   }

	   /**
	    * identifier -> Identifier()
	    * nodeToken -> "."
	    * identifier1 -> Identifier()
	    */
	   public void visit(DotIdentifier n, String argu) {
	      n.identifier.accept(this, argu);
	      n.nodeToken.accept(this, argu);
	      n.identifier1.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "new"
	    * identifier -> Identifier()
	    * nodeToken1 -> "("
	    * nodeOptional -> [ IdentifierList() ]
	    * nodeToken2 -> ")"
	    */
	   public void visit(NewObject n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.nodeOptional.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "new"
	    * nonArrayType -> NonArrayType()
	    * nodeToken1 -> "["
	    * identifier -> Identifier()
	    * nodeToken2 -> "]"
	    */
	   public void visit(NewUpdatableArray n, String argu) {
	      n.nodeToken.accept(this, argu);
	      n.nonArrayType.accept(this, argu);
	      n.nodeToken1.accept(this, argu);
	      n.identifier.accept(this, argu);
	      n.nodeToken2.accept(this, argu);
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
	      n.nodeToken.accept(this, argu);
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
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "false"
	    */
	   public void visit(False n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "here"
	    */
	   public void visit(HereLiteral n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "place.FIRST_PLACE"
	    */
	   public void visit(PlaceFirstPlace n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "place.LAST_PLACE"
	    */
	   public void visit(PlaceLastPlace n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "place.MAX_PLACES"
	    */
	   public void visit(PlaceMaxPlaces n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	   /**
	    * nodeToken -> "java.lang.Integer.SIZE"
	    */
	   public void visit(JavaIntegerSize n, String argu) {
	      n.nodeToken.accept(this, argu);
	   }

	}
