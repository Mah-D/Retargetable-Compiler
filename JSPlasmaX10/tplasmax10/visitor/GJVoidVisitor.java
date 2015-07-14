//
// Generated by JTB 1.3.2
//

package tplasmax10.visitor;
import tplasmax10.syntaxtree.*;

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
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ProgramClass()
    * f2 -> ( TopLevelDeclaration() )*
    * f3 -> <EOF>
    */
   public void visit(File n, A argu);

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
   public void visit(MainClass n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( ConstantDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
   public void visit(ProgramClass n, A argu);

   /**
    * f0 -> ClassDeclaration()
    *       | ValueDeclaration()
    */
   public void visit(TopLevelDeclaration n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( InitializableConstantDeclaration() )*
    * f4 -> ( UpdatableFieldDeclaration() )*
    * f5 -> ( ConstructorDeclaration() )*
    * f6 -> "}"
    */
   public void visit(ClassDeclaration n, A argu);

   /**
    * f0 -> "value"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( InitializableConstantDeclaration() )*
    * f4 -> ( ConstructorDeclaration() )*
    * f5 -> "}"
    */
   public void visit(ValueDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ( FormalParameterList() )?
    * f4 -> ")"
    * f5 -> Block()
    */
   public void visit(ConstructorDeclaration n, A argu);

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
   public void visit(ConstantDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> "final"
    * f2 -> Type()
    * f3 -> Identifier()
    * f4 -> ";"
    */
   public void visit(InitializableConstantDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> ";"
    */
   public void visit(UpdatableFieldDeclaration n, A argu);

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
   public void visit(MethodDeclaration n, A argu);

   /**
    * f0 -> FinalFormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public void visit(FormalParameterList n, A argu);

   /**
    * f0 -> "final"
    * f1 -> Type()
    * f2 -> Identifier()
    */
   public void visit(FinalFormalParameter n, A argu);

   /**
    * f0 -> ","
    * f1 -> FinalFormalParameter()
    */
   public void visit(FormalParameterRest n, A argu);

   /**
    * f0 -> VoidType()
    *       | Type()
    */
   public void visit(ReturnType n, A argu);

   /**
    * f0 -> "void"
    */
   public void visit(VoidType n, A argu);

   /**
    * f0 -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | NonArrayType()
    */
   public void visit(Type n, A argu);

   /**
    * f0 -> NonArrayType()
    * f1 -> "["
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> "]"
    */
   public void visit(UpdatableArrayType n, A argu);

   /**
    * f0 -> NonArrayType()
    * f1 -> "value"
    * f2 -> "["
    * f3 -> ":"
    * f4 -> RankEquation()
    * f5 -> "]"
    */
   public void visit(ValueArrayType n, A argu);

   /**
    * f0 -> "rank==1"
    */
   public void visit(RankEquation n, A argu);

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
   public void visit(NonArrayType n, A argu);

   /**
    * f0 -> "boolean"
    */
   public void visit(BooleanType n, A argu);

   /**
    * f0 -> "byte"
    */
   public void visit(ByteType n, A argu);

   /**
    * f0 -> "short"
    */
   public void visit(ShortType n, A argu);

   /**
    * f0 -> "int"
    */
   public void visit(IntegerType n, A argu);

   /**
    * f0 -> "long"
    */
   public void visit(LongType n, A argu);

   /**
    * f0 -> "double"
    */
   public void visit(DoubleType n, A argu);

   /**
    * f0 -> "String"
    */
   public void visit(StringType n, A argu);

   /**
    * f0 -> "place"
    */
   public void visit(PlaceType n, A argu);

   /**
    * f0 -> "dist"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public void visit(DistType n, A argu);

   /**
    * f0 -> "region"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public void visit(RegionType n, A argu);

   /**
    * f0 -> "point"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public void visit(PointType n, A argu);

   /**
    * f0 -> Identifier()
    */
   public void visit(ClassNameType n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public void visit(Identifier n, A argu);

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public void visit(Block n, A argu);

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
   public void visit(Statement n, A argu);

   /**
    * f0 -> "x10.lang.perf.addLocalOps"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(AddLocalOpsStatement n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(Assignment n, A argu);

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
   public void visit(ArrayAssignment n, A argu);

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
   public void visit(FieldAssignment n, A argu);

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
   public void visit(ThisFieldAssignment n, A argu);

   /**
    * f0 -> "async"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> Identifier()
    * f6 -> "."
    * f7 -> Identifier()
    * f8 -> "("
    * f9 -> Identifier()
    * f10 -> ")"
    * f11 -> ";"
    * f12 -> "}"
    */
   public void visit(AsyncStatement n, A argu);

   /**
    * f0 -> "break"
    * f1 -> ";"
    */
   public void visit(BreakStatement n, A argu);

   /**
    * f0 -> "continue"
    * f1 -> ";"
    */
   public void visit(ContinueStatement n, A argu);

   /**
    * f0 -> "do"
    * f1 -> Block()
    * f2 -> "while"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(DoStatement n, A argu);

   /**
    * f0 -> "finish"
    * f1 -> Block()
    */
   public void visit(FinishStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Block()
    * f5 -> [ ElseClause() ]
    */
   public void visit(IfStatement n, A argu);

   /**
    * f0 -> "else"
    * f1 -> Block()
    */
   public void visit(ElseClause n, A argu);

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
   public void visit(LoopStatement n, A argu);

   /**
    * f0 -> PointName()
    *       | Coordinates()
    */
   public void visit(ExplodedSpecification n, A argu);

   /**
    * f0 -> Identifier()
    */
   public void visit(PointName n, A argu);

   /**
    * f0 -> "["
    * f1 -> Identifier()
    * f2 -> "]"
    */
   public void visit(Coordinates n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public void visit(IdentifierList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public void visit(IdentifierRest n, A argu);

   /**
    * f0 -> MethodCall()
    * f1 -> ";"
    */
   public void visit(MethodCallStatement n, A argu);

   /**
    * f0 -> MethodCallInConstructor()
    * f1 -> ";"
    */
   public void visit(MethodCallStatementInConstructor n, A argu);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintlnStatement n, A argu);

   /**
    * f0 -> "System.out.print"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintStatement n, A argu);

   /**
    * f0 -> "System.err.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintErrorStatement n, A argu);

   /**
    * f0 -> "return"
    * f1 -> [ Identifier() ]
    * f2 -> ";"
    */
   public void visit(ReturnStatement n, A argu);

   /**
    * f0 -> "switch"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( SwitchEntry() )*
    * f6 -> "}"
    */
   public void visit(SwitchStatement n, A argu);

   /**
    * f0 -> SwitchLabel()
    * f1 -> ":"
    * f2 -> Block()
    */
   public void visit(SwitchEntry n, A argu);

   /**
    * f0 -> Case()
    *       | Default()
    */
   public void visit(SwitchLabel n, A argu);

   /**
    * f0 -> "case"
    * f1 -> Identifier()
    */
   public void visit(Case n, A argu);

   /**
    * f0 -> "default"
    */
   public void visit(Default n, A argu);

   /**
    * f0 -> "throw"
    * f1 -> "new"
    * f2 -> "RuntimeException"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(ThrowStatement n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Block()
    */
   public void visit(WhileStatement n, A argu);

   /**
    * f0 -> "final"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Expression()
    * f5 -> ";"
    */
   public void visit(FinalVariableDeclaration n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> "="
    * f3 -> Expression()
    * f4 -> ";"
    */
   public void visit(UpdatableVariableDeclaration n, A argu);

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
   public void visit(Expression n, A argu);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public void visit(ExpressionInParentheses n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "||"
    * f2 -> Identifier()
    */
   public void visit(ConditionalOrExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "->"
    * f2 -> Identifier()
    */
   public void visit(DistributionExpression n, A argu);

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
   public void visit(DistributionUnionExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "&&"
    * f2 -> Identifier()
    */
   public void visit(ConditionalAndExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "|"
    * f2 -> Identifier()
    */
   public void visit(InclusiveOrExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "^"
    * f2 -> Identifier()
    */
   public void visit(ExclusiveOrExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "&"
    * f2 -> Identifier()
    */
   public void visit(AndExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "=="
    * f2 -> Identifier()
    */
   public void visit(EqualsExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "!="
    * f2 -> Identifier()
    */
   public void visit(NonEqualsExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<"
    * f2 -> Identifier()
    */
   public void visit(LessThanExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">"
    * f2 -> Identifier()
    */
   public void visit(GreaterThanExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<="
    * f2 -> Identifier()
    */
   public void visit(LessThanEqualExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">="
    * f2 -> Identifier()
    */
   public void visit(GreaterThanEqualExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<<"
    * f2 -> Identifier()
    */
   public void visit(ShiftLeftExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">>"
    * f2 -> Identifier()
    */
   public void visit(ShiftRightExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">>>"
    * f2 -> Identifier()
    */
   public void visit(ShiftRightUnsignedExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "+"
    * f2 -> Identifier()
    */
   public void visit(PlusExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "-"
    * f2 -> Identifier()
    */
   public void visit(MinusExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "*"
    * f2 -> Identifier()
    */
   public void visit(TimesExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "/"
    * f2 -> Identifier()
    */
   public void visit(DivideExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "%"
    * f2 -> Identifier()
    */
   public void visit(ModulusExpression n, A argu);

   /**
    * f0 -> "["
    * f1 -> "0 :"
    * f2 -> Identifier()
    * f3 -> "]"
    */
   public void visit(RegionConstant n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sin"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(SinExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "cos"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(CosExpression n, A argu);

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
   public void visit(PowExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "exp"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(ExpExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sqrt"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(SqrtExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "abs"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(AbsExpression n, A argu);

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
   public void visit(MinExpression n, A argu);

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
   public void visit(MaxExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "log"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public void visit(LogExpression n, A argu);

   /**
    * f0 -> "~"
    * f1 -> Identifier()
    */
   public void visit(ComplimentExpression n, A argu);

   /**
    * f0 -> "!"
    * f1 -> Identifier()
    */
   public void visit(NotExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "int"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public void visit(CoercionToIntExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "double"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public void visit(CoercionToDoubleExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "long"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public void visit(CoercionToLongExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "short"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public void visit(CoercionToShortExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "byte"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public void visit(CoercionToByteExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> TypeAnnotation()
    * f2 -> ")"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(TypeAnnotatedExpression n, A argu);

   /**
    * f0 -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | DistType()
    *       | RegionType()
    *       | PointType()
    */
   public void visit(TypeAnnotation n, A argu);

   /**
    * f0 -> "place.places"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    */
   public void visit(Place n, A argu);

   /**
    * f0 -> "System.currentTimeMillis"
    * f1 -> "("
    * f2 -> ")"
    */
   public void visit(CurrentTime n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Identifier()
    * f3 -> "]"
    */
   public void visit(ArrayAccess n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( IdentifierList() )?
    * f5 -> ")"
    */
   public void visit(MethodCall n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> "this"
    * f5 -> ( IdentifierRest() )*
    * f6 -> ")"
    */
   public void visit(MethodCallInConstructor n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "id"
    */
   public void visit(DotId n, A argu);

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
   public void visit(DotIdentifierDotGet n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "next"
    * f3 -> "("
    * f4 -> ")"
    */
   public void visit(DotNext n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "prev"
    * f3 -> "("
    * f4 -> ")"
    */
   public void visit(DotPrev n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "isFirst"
    * f3 -> "("
    * f4 -> ")"
    */
   public void visit(DotIsFirst n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "isLast"
    * f3 -> "("
    * f4 -> ")"
    */
   public void visit(DotIsLast n, A argu);

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
   public void visit(DotIdentifierDotRegionDotSize n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    */
   public void visit(DotIdentifier n, A argu);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> [ IdentifierList() ]
    * f4 -> ")"
    */
   public void visit(NewObject n, A argu);

   /**
    * f0 -> "new"
    * f1 -> NonArrayType()
    * f2 -> "value"
    * f3 -> "["
    * f4 -> Identifier()
    * f5 -> "]"
    * f6 -> ArrayInitializer()
    */
   public void visit(NewValueArray n, A argu);

   /**
    * f0 -> "new"
    * f1 -> NonArrayType()
    * f2 -> "["
    * f3 -> Identifier()
    * f4 -> "]"
    * f5 -> [ ArrayInitializer() ]
    */
   public void visit(NewUpdatableArray n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public void visit(IntegerLiteral n, A argu);

   /**
    * f0 -> <LONG_LITERAL>
    */
   public void visit(LongLiteral n, A argu);

   /**
    * f0 -> <HEX_LITERAL>
    */
   public void visit(HexLiteral n, A argu);

   /**
    * f0 -> <FLOATING_POINT_LITERAL>
    */
   public void visit(FloatingPointLiteral n, A argu);

   /**
    * f0 -> <STRING_LITERAL>
    */
   public void visit(StringLiteral n, A argu);

   /**
    * f0 -> "true"
    */
   public void visit(True n, A argu);

   /**
    * f0 -> "false"
    */
   public void visit(False n, A argu);

   /**
    * f0 -> "here"
    */
   public void visit(HereLiteral n, A argu);

   /**
    * f0 -> "place.FIRST_PLACE"
    */
   public void visit(PlaceFirstPlace n, A argu);

   /**
    * f0 -> "place.LAST_PLACE"
    */
   public void visit(PlaceLastPlace n, A argu);

   /**
    * f0 -> "place.MAX_PLACES"
    */
   public void visit(PlaceMaxPlaces n, A argu);

   /**
    * f0 -> "java.lang.Integer.SIZE"
    */
   public void visit(JavaIntegerSize n, A argu);

   /**
    * f0 -> "("
    * f1 -> PointType()
    * f2 -> ExplodedSpecification()
    * f3 -> ")"
    * f4 -> Block()
    */
   public void visit(ArrayInitializer n, A argu);

}

