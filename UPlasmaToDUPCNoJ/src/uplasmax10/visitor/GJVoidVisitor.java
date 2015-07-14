//
// Generated by JTB 1.3.2
//

package uplasmax10.visitor;
import uplasmax10.syntaxtree.*;

import java.util.*;

/**
 * All GJ void visitors must implement this interface.
 */

public interface GJVoidVisitor<A> {

   //
   // GJ void Auto class visitors
   //

   public void visit(NodeList n, A argu);
   public void visit(NodeListOptional n, A argu);
   public void visit(NodeOptional n, A argu);
   public void visit(NodeSequence n, A argu);
   public void visit(NodeToken n, A argu);

   //
   // User-generated uplasmax10.visitor methods below
   //

   /**
    * mainClass -> MainClass()
    * programClass -> ProgramClass()
    * nodeListOptional -> ( TopLevelDeclaration() )*
    * nodeToken -> <EOF>
    */
   public void visit(File n, A argu);

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
   public void visit(MainClass n, A argu);

   /**
    * nodeToken -> "class"
    * identifier -> Identifier()
    * nodeToken1 -> "{"
    * nodeListOptional -> ( ConstantDeclaration() )*
    * nodeListOptional1 -> ( StaticMethodDeclaration() )*
    * nodeToken2 -> "}"
    */
   public void visit(ProgramClass n, A argu);

   /**
    * nodeChoice -> ClassDeclaration()
    *       | ValueDeclaration()
    */
   public void visit(TopLevelDeclaration n, A argu);

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
   public void visit(ClassDeclaration n, A argu);

   /**
    * nodeToken -> "value"
    * identifier -> Identifier()
    * nodeToken1 -> "{"
    * nodeListOptional -> ( InitializableConstantDeclaration() )*
    * nodeListOptional1 -> ( ConstructorDeclaration() )*
    * nodeListOptional2 -> ( MethodDeclaration() )*
    * nodeToken2 -> "}"
    */
   public void visit(ValueDeclaration n, A argu);

   /**
    * nodeToken -> "public"
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( FormalParameterList() )?
    * nodeToken2 -> ")"
    * block -> Block()
    */
   public void visit(ConstructorDeclaration n, A argu);

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
   public void visit(ConstantDeclaration n, A argu);

   /**
    * nodeToken -> "public"
    * nodeToken1 -> "final"
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken2 -> ";"
    */
   public void visit(InitializableConstantDeclaration n, A argu);

   /**
    * nodeToken -> "public"
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken1 -> ";"
    */
   public void visit(UpdatableFieldDeclaration n, A argu);

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
   public void visit(StaticMethodDeclaration n, A argu);

   /**
    * nodeToken -> "public"
    * returnType -> ReturnType()
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( FormalParameterList() )?
    * nodeToken2 -> ")"
    * block -> Block()
    */
   public void visit(MethodDeclaration n, A argu);

   /**
    * finalFormalParameter -> FinalFormalParameter()
    * nodeListOptional -> ( FormalParameterRest() )*
    */
   public void visit(FormalParameterList n, A argu);

   /**
    * nodeToken -> "final"
    * type -> Type()
    * identifier -> Identifier()
    */
   public void visit(FinalFormalParameter n, A argu);

   /**
    * nodeToken -> ","
    * finalFormalParameter -> FinalFormalParameter()
    */
   public void visit(FormalParameterRest n, A argu);

   /**
    * nodeChoice -> VoidType()
    *       | Type()
    */
   public void visit(ReturnType n, A argu);

   /**
    * nodeToken -> "void"
    */
   public void visit(VoidType n, A argu);

   /**
    * nodeChoice -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | NonArrayType()
    */
   public void visit(Type n, A argu);

   /**
    * nonArrayType -> NonArrayType()
    * nodeToken -> "["
    * nodeToken1 -> ":"
    * rankEquation -> RankEquation()
    * nodeToken2 -> "]"
    */
   public void visit(UpdatableArrayType n, A argu);

   /**
    * nonArrayType -> NonArrayType()
    * nodeToken -> "value"
    * nodeToken1 -> "["
    * nodeToken2 -> ":"
    * rankEquation -> RankEquation()
    * nodeToken3 -> "]"
    */
   public void visit(ValueArrayType n, A argu);

   /**
    * nodeToken -> "rank==1"
    */
   public void visit(RankEquation n, A argu);

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
   public void visit(NonArrayType n, A argu);

   /**
    * nodeToken -> "boolean"
    */
   public void visit(BooleanType n, A argu);

   /**
    * nodeToken -> "byte"
    */
   public void visit(ByteType n, A argu);

   /**
    * nodeToken -> "short"
    */
   public void visit(ShortType n, A argu);

   /**
    * nodeToken -> "int"
    */
   public void visit(IntegerType n, A argu);

   /**
    * nodeToken -> "long"
    */
   public void visit(LongType n, A argu);

   /**
    * nodeToken -> "double"
    */
   public void visit(DoubleType n, A argu);

   /**
    * nodeToken -> "String"
    */
   public void visit(StringType n, A argu);

   /**
    * nodeToken -> "place"
    */
   public void visit(PlaceType n, A argu);

   /**
    * nodeToken -> "dist"
    * nodeToken1 -> "("
    * nodeToken2 -> ":"
    * rankEquation -> RankEquation()
    * nodeToken3 -> ")"
    */
   public void visit(DistType n, A argu);

   /**
    * nodeToken -> "region"
    * nodeToken1 -> "("
    * nodeToken2 -> ":"
    * rankEquation -> RankEquation()
    * nodeToken3 -> ")"
    */
   public void visit(RegionType n, A argu);

   /**
    * nodeToken -> "point"
    * nodeToken1 -> "("
    * nodeToken2 -> ":"
    * rankEquation -> RankEquation()
    * nodeToken3 -> ")"
    */
   public void visit(PointType n, A argu);

   /**
    * identifier -> Identifier()
    */
   public void visit(ClassNameType n, A argu);

   /**
    * nodeToken -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu);

   /**
    * nodeToken -> "{"
    * nodeListOptional -> ( Statement() )*
    * nodeToken1 -> "}"
    */
   public void visit(Block n, A argu);

   /**
    * nodeChoice -> Assignment()
    *       | ArrayAssignment()
    *       | FieldAssignment()
    *       | ThisFieldAssignment()
    *       | AsyncStatement()
    *       | AsyncStatementInConstructor()
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
   public void visit(Statement n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "="
    * expression -> Expression()
    * nodeToken1 -> ";"
    */
   public void visit(Assignment n, A argu);

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
   public void visit(ArrayAssignment n, A argu);

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
   public void visit(FieldAssignment n, A argu);

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
   public void visit(ThisFieldAssignment n, A argu);

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
   public void visit(AsyncStatement n, A argu);

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
   public void visit(AsyncStatementInConstructor n, A argu);

   /**
    * nodeToken -> "break"
    * nodeToken1 -> ";"
    */
   public void visit(BreakStatement n, A argu);

   /**
    * nodeToken -> "continue"
    * nodeToken1 -> ";"
    */
   public void visit(ContinueStatement n, A argu);

   /**
    * nodeToken -> "do"
    * block -> Block()
    * nodeToken1 -> "while"
    * nodeToken2 -> "("
    * identifier -> Identifier()
    * nodeToken3 -> ")"
    * nodeToken4 -> ";"
    */
   public void visit(DoStatement n, A argu);

   /**
    * nodeToken -> "finish"
    * block -> Block()
    */
   public void visit(FinishStatement n, A argu);

   /**
    * nodeToken -> "if"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * block -> Block()
    * nodeOptional -> [ ElseClause() ]
    */
   public void visit(IfStatement n, A argu);

   /**
    * nodeToken -> "else"
    * block -> Block()
    */
   public void visit(ElseClause n, A argu);

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
   public void visit(LoopStatement n, A argu);

   /**
    * nodeChoice -> PointName()
    *       | Coordinates()
    */
   public void visit(ExplodedSpecification n, A argu);

   /**
    * identifier -> Identifier()
    */
   public void visit(PointName n, A argu);

   /**
    * nodeToken -> "["
    * identifier -> Identifier()
    * nodeToken1 -> "]"
    */
   public void visit(Coordinates n, A argu);

   /**
    * identifier -> Identifier()
    * nodeListOptional -> ( IdentifierRest() )*
    */
   public void visit(IdentifierList n, A argu);

   /**
    * nodeToken -> ","
    * identifier -> Identifier()
    */
   public void visit(IdentifierRest n, A argu);

   /**
    * methodCall -> MethodCall()
    * nodeToken -> ";"
    */
   public void visit(MethodCallStatement n, A argu);

   /**
    * methodCallInConstructor -> MethodCallInConstructor()
    * nodeToken -> ";"
    */
   public void visit(MethodCallStatementInConstructor n, A argu);

   /**
    * nodeToken -> "System.out.println"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(PrintlnStatement n, A argu);

   /**
    * nodeToken -> "System.out.print"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(PrintStatement n, A argu);

   /**
    * nodeToken -> "System.err.println"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> ";"
    */
   public void visit(PrintErrorStatement n, A argu);

   /**
    * nodeToken -> "return"
    * nodeOptional -> [ Identifier() ]
    * nodeToken1 -> ";"
    */
   public void visit(ReturnStatement n, A argu);

   /**
    * nodeToken -> "switch"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * nodeToken3 -> "{"
    * nodeListOptional -> ( SwitchEntry() )*
    * nodeToken4 -> "}"
    */
   public void visit(SwitchStatement n, A argu);

   /**
    * switchLabel -> SwitchLabel()
    * nodeToken -> ":"
    * block -> Block()
    */
   public void visit(SwitchEntry n, A argu);

   /**
    * nodeChoice -> Case()
    *       | Default()
    */
   public void visit(SwitchLabel n, A argu);

   /**
    * nodeToken -> "case"
    * identifier -> Identifier()
    */
   public void visit(Case n, A argu);

   /**
    * nodeToken -> "default"
    */
   public void visit(Default n, A argu);

   /**
    * nodeToken -> "throw"
    * nodeToken1 -> "new"
    * nodeToken2 -> "RuntimeException"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    * nodeToken5 -> ";"
    */
   public void visit(ThrowStatement n, A argu);

   /**
    * nodeToken -> "while"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    * block -> Block()
    */
   public void visit(WhileStatement n, A argu);

   /**
    * nodeToken -> "final"
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken1 -> "="
    * expression -> Expression()
    * nodeToken2 -> ";"
    */
   public void visit(FinalVariableDeclaration n, A argu);

   /**
    * type -> Type()
    * identifier -> Identifier()
    * nodeToken -> "="
    * expression -> Expression()
    * nodeToken1 -> ";"
    */
   public void visit(UpdatableVariableDeclaration n, A argu);

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
   public void visit(Expression n, A argu);

   /**
    * nodeToken -> "("
    * expression -> Expression()
    * nodeToken1 -> ")"
    */
   public void visit(ExpressionInParentheses n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "||"
    * identifier1 -> Identifier()
    */
   public void visit(ConditionalOrExpression n, A argu);

   /**
    * nodeToken -> "["
    * nodeToken1 -> "0 :"
    * identifier -> Identifier()
    * nodeToken2 -> "]"
    * nodeToken3 -> "->"
    * nodeToken4 -> "here"
    */
   public void visit(SimpleDistributionExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "&&"
    * identifier1 -> Identifier()
    */
   public void visit(ConditionalAndExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "|"
    * identifier1 -> Identifier()
    */
   public void visit(InclusiveOrExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "^"
    * identifier1 -> Identifier()
    */
   public void visit(ExclusiveOrExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "&"
    * identifier1 -> Identifier()
    */
   public void visit(AndExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "=="
    * identifier1 -> Identifier()
    */
   public void visit(EqualsExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "!="
    * identifier1 -> Identifier()
    */
   public void visit(NonEqualsExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "<"
    * identifier1 -> Identifier()
    */
   public void visit(LessThanExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> ">"
    * identifier1 -> Identifier()
    */
   public void visit(GreaterThanExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "<="
    * identifier1 -> Identifier()
    */
   public void visit(LessThanEqualExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> ">="
    * identifier1 -> Identifier()
    */
   public void visit(GreaterThanEqualExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "<<"
    * identifier1 -> Identifier()
    */
   public void visit(ShiftLeftExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> ">>"
    * identifier1 -> Identifier()
    */
   public void visit(ShiftRightExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> ">>>"
    * identifier1 -> Identifier()
    */
   public void visit(ShiftRightUnsignedExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "+"
    * nodeToken1 -> "["
    * identifierList -> IdentifierList()
    * nodeToken2 -> "]"
    */
   public void visit(PlusOffset n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "+"
    * identifier1 -> Identifier()
    */
   public void visit(PlusExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "-"
    * identifier1 -> Identifier()
    */
   public void visit(MinusExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "*"
    * nodeToken1 -> "["
    * identifierList -> IdentifierList()
    * nodeToken2 -> "]"
    */
   public void visit(TimesOffset n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "*"
    * identifier1 -> Identifier()
    */
   public void visit(TimesExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "/"
    * nodeToken1 -> "["
    * identifierList -> IdentifierList()
    * nodeToken2 -> "]"
    */
   public void visit(DivideOffset n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "/"
    * identifier1 -> Identifier()
    */
   public void visit(DivideExpression n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "%"
    * identifier1 -> Identifier()
    */
   public void visit(ModulusExpression n, A argu);

   /**
    * nodeToken -> "["
    * nodeToken1 -> "0 :"
    * identifier -> Identifier()
    * nodeToken2 -> "]"
    */
   public void visit(RegionConstant n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "sin"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(SinExpression n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "cos"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(CosExpression n, A argu);

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
   public void visit(PowExpression n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "exp"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(ExpExpression n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "sqrt"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(SqrtExpression n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "abs"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(AbsExpression n, A argu);

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
   public void visit(MinExpression n, A argu);

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
   public void visit(MaxExpression n, A argu);

   /**
    * nodeToken -> "Math"
    * nodeToken1 -> "."
    * nodeToken2 -> "log"
    * nodeToken3 -> "("
    * identifier -> Identifier()
    * nodeToken4 -> ")"
    */
   public void visit(LogExpression n, A argu);

   /**
    * nodeToken -> "~"
    * identifier -> Identifier()
    */
   public void visit(ComplimentExpression n, A argu);

   /**
    * nodeToken -> "!"
    * identifier -> Identifier()
    */
   public void visit(NotExpression n, A argu);

   /**
    * nodeToken -> "("
    * nodeToken1 -> "int"
    * nodeToken2 -> ")"
    * expression -> Expression()
    */
   public void visit(CoercionToIntExpression n, A argu);

   /**
    * nodeToken -> "("
    * nodeToken1 -> "double"
    * nodeToken2 -> ")"
    * expression -> Expression()
    */
   public void visit(CoercionToDoubleExpression n, A argu);

   /**
    * nodeToken -> "("
    * nodeToken1 -> "long"
    * nodeToken2 -> ")"
    * expression -> Expression()
    */
   public void visit(CoercionToLongExpression n, A argu);

   /**
    * nodeToken -> "("
    * nodeToken1 -> "short"
    * nodeToken2 -> ")"
    * expression -> Expression()
    */
   public void visit(CoercionToShortExpression n, A argu);

   /**
    * nodeToken -> "("
    * nodeToken1 -> "byte"
    * nodeToken2 -> ")"
    * expression -> Expression()
    */
   public void visit(CoercionToByteExpression n, A argu);

   /**
    * nodeToken -> "("
    * typeAnnotation -> TypeAnnotation()
    * nodeToken1 -> ")"
    * nodeToken2 -> "("
    * expression -> Expression()
    * nodeToken3 -> ")"
    */
   public void visit(TypeAnnotatedExpression n, A argu);

   /**
    * nodeChoice -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | DistType()
    *       | RegionType()
    *       | PointType()
    */
   public void visit(TypeAnnotation n, A argu);

   /**
    * nodeToken -> "place.places"
    * nodeToken1 -> "("
    * identifier -> Identifier()
    * nodeToken2 -> ")"
    */
   public void visit(Place n, A argu);

   /**
    * nodeToken -> "System.currentTimeMillis"
    * nodeToken1 -> "("
    * nodeToken2 -> ")"
    */
   public void visit(CurrentTime n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "["
    * identifier1 -> Identifier()
    * nodeToken1 -> "]"
    */
   public void visit(ArrayAccess n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "[0]"
    */
   public void visit(PointAccess n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * identifier1 -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> ( IdentifierList() )?
    * nodeToken2 -> ")"
    */
   public void visit(MethodCall n, A argu);

   /**
    * nodeToken -> "this"
    * nodeToken1 -> "."
    * identifier -> Identifier()
    * nodeToken2 -> "("
    * nodeOptional -> ( IdentifierList() )?
    * nodeToken3 -> ")"
    */
   public void visit(MethodCallInConstructor n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "id"
    */
   public void visit(DotId n, A argu);

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
   public void visit(DotIdentifierDotGet n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "next"
    * nodeToken2 -> "("
    * nodeToken3 -> ")"
    */
   public void visit(DotNext n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "prev"
    * nodeToken2 -> "("
    * nodeToken3 -> ")"
    */
   public void visit(DotPrev n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "isFirst"
    * nodeToken2 -> "("
    * nodeToken3 -> ")"
    */
   public void visit(DotIsFirst n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "isLast"
    * nodeToken2 -> "("
    * nodeToken3 -> ")"
    */
   public void visit(DotIsLast n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * nodeToken1 -> "region"
    * nodeToken2 -> "."
    * nodeToken3 -> "size"
    * nodeToken4 -> "("
    * nodeToken5 -> ")"
    */
   public void visit(DotRegionDotSize n, A argu);

   /**
    * identifier -> Identifier()
    * nodeToken -> "."
    * identifier1 -> Identifier()
    */
   public void visit(DotIdentifier n, A argu);

   /**
    * nodeToken -> "new"
    * identifier -> Identifier()
    * nodeToken1 -> "("
    * nodeOptional -> [ IdentifierList() ]
    * nodeToken2 -> ")"
    */
   public void visit(NewObject n, A argu);

   /**
    * nodeToken -> "new"
    * nonArrayType -> NonArrayType()
    * nodeToken1 -> "value"
    * nodeToken2 -> "["
    * identifier -> Identifier()
    * nodeToken3 -> "]"
    * arrayInitializer -> ArrayInitializer()
    */
   public void visit(NewValueArray n, A argu);

   /**
    * nodeToken -> "new"
    * nonArrayType -> NonArrayType()
    * nodeToken1 -> "["
    * identifier -> Identifier()
    * nodeToken2 -> "]"
    * nodeOptional -> [ ArrayInitializer() ]
    */
   public void visit(NewUpdatableArray n, A argu);

   /**
    * nodeToken -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n, A argu);

   /**
    * nodeToken -> <LONG_LITERAL>
    */
   public void visit(LongLiteral n, A argu);

   /**
    * nodeToken -> <HEX_LITERAL>
    */
   public void visit(HexLiteral n, A argu);

   /**
    * nodeToken -> <FLOATING_POINT_LITERAL>
    */
   public void visit(FloatingPointLiteral n, A argu);

   /**
    * nodeToken -> <STRING_LITERAL>
    */
   public void visit(StringLiteral n, A argu);

   /**
    * nodeToken -> "true"
    */
   public void visit(True n, A argu);

   /**
    * nodeToken -> "false"
    */
   public void visit(False n, A argu);

   /**
    * nodeToken -> "here"
    */
   public void visit(HereLiteral n, A argu);

   /**
    * nodeToken -> "place.FIRST_PLACE"
    */
   public void visit(PlaceFirstPlace n, A argu);

   /**
    * nodeToken -> "place.LAST_PLACE"
    */
   public void visit(PlaceLastPlace n, A argu);

   /**
    * nodeToken -> "place.MAX_PLACES"
    */
   public void visit(PlaceMaxPlaces n, A argu);

   /**
    * nodeToken -> "java.lang.Integer.SIZE"
    */
   public void visit(JavaIntegerSize n, A argu);

   /**
    * nodeToken -> "("
    * pointType -> PointType()
    * explodedSpecification -> ExplodedSpecification()
    * nodeToken1 -> ")"
    * block -> Block()
    */
   public void visit(ArrayInitializer n, A argu);

}

