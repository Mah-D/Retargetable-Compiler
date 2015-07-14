//
// Generated by JTB 1.3.2
//

package splasmax10.visitor;
import splasmax10.syntaxtree.*;

import java.util.*;

/**
 * All GJ visitors must implement this interface.
 */

public interface GJVisitor<R,A> {

   //
   // GJ Auto class visitors
   //

   public R visit(NodeList n, A argu);
   public R visit(NodeListOptional n, A argu);
   public R visit(NodeOptional n, A argu);
   public R visit(NodeSequence n, A argu);
   public R visit(NodeToken n, A argu);

   //
   // User-generated visitor methods below
   //

   /**
    * f0 -> MainClass()
    * f1 -> ProgramClass()
    * f2 -> ( TopLevelDeclaration() )*
    * f3 -> <EOF>
    */
   public R visit(File n, A argu);

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
   public R visit(MainClass n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( ConstantDeclaration() )*
    * f4 -> ( MethodDeclaration() )*
    * f5 -> "}"
    */
   public R visit(ProgramClass n, A argu);

   /**
    * f0 -> ClassDeclaration()
    *       | ValueDeclaration()
    */
   public R visit(TopLevelDeclaration n, A argu);

   /**
    * f0 -> "class"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( InitializableConstantDeclaration() )*
    * f4 -> ( UpdatableFieldDeclaration() )*
    * f5 -> ( ConstructorDeclaration() )*
    * f6 -> "}"
    */
   public R visit(ClassDeclaration n, A argu);

   /**
    * f0 -> "value"
    * f1 -> Identifier()
    * f2 -> "{"
    * f3 -> ( InitializableConstantDeclaration() )*
    * f4 -> ( ConstructorDeclaration() )*
    * f5 -> "}"
    */
   public R visit(ValueDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> ( FormalParameterList() )?
    * f4 -> ")"
    * f5 -> Block()
    */
   public R visit(ConstructorDeclaration n, A argu);

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
   public R visit(ConstantDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> "final"
    * f2 -> Type()
    * f3 -> Identifier()
    * f4 -> ";"
    */
   public R visit(InitializableConstantDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> ";"
    */
   public R visit(UpdatableFieldDeclaration n, A argu);

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
   public R visit(MethodDeclaration n, A argu);

   /**
    * f0 -> FinalFormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public R visit(FormalParameterList n, A argu);

   /**
    * f0 -> "final"
    * f1 -> Type()
    * f2 -> Identifier()
    */
   public R visit(FinalFormalParameter n, A argu);

   /**
    * f0 -> ","
    * f1 -> FinalFormalParameter()
    */
   public R visit(FormalParameterRest n, A argu);

   /**
    * f0 -> VoidType()
    *       | Type()
    */
   public R visit(ReturnType n, A argu);

   /**
    * f0 -> "void"
    */
   public R visit(VoidType n, A argu);

   /**
    * f0 -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | NonArrayType()
    */
   public R visit(Type n, A argu);

   /**
    * f0 -> NonArrayType()
    * f1 -> "["
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> "]"
    */
   public R visit(UpdatableArrayType n, A argu);

   /**
    * f0 -> NonArrayType()
    * f1 -> "value"
    * f2 -> "["
    * f3 -> ":"
    * f4 -> RankEquation()
    * f5 -> "]"
    */
   public R visit(ValueArrayType n, A argu);

   /**
    * f0 -> "rank==1"
    */
   public R visit(RankEquation n, A argu);

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
   public R visit(NonArrayType n, A argu);

   /**
    * f0 -> "boolean"
    */
   public R visit(BooleanType n, A argu);

   /**
    * f0 -> "byte"
    */
   public R visit(ByteType n, A argu);

   /**
    * f0 -> "short"
    */
   public R visit(ShortType n, A argu);

   /**
    * f0 -> "int"
    */
   public R visit(IntegerType n, A argu);

   /**
    * f0 -> "long"
    */
   public R visit(LongType n, A argu);

   /**
    * f0 -> "double"
    */
   public R visit(DoubleType n, A argu);

   /**
    * f0 -> "String"
    */
   public R visit(StringType n, A argu);

   /**
    * f0 -> "place"
    */
   public R visit(PlaceType n, A argu);

   /**
    * f0 -> "dist"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public R visit(DistType n, A argu);

   /**
    * f0 -> "region"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public R visit(RegionType n, A argu);

   /**
    * f0 -> "point"
    * f1 -> "("
    * f2 -> ":"
    * f3 -> RankEquation()
    * f4 -> ")"
    */
   public R visit(PointType n, A argu);

   /**
    * f0 -> Identifier()
    */
   public R visit(ClassNameType n, A argu);

   /**
    * f0 -> <IDENTIFIER>
    */
   public R visit(Identifier n, A argu);

   /**
    * f0 -> "{"
    * f1 -> ( Statement() )*
    * f2 -> "}"
    */
   public R visit(Block n, A argu);

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
   public R visit(Statement n, A argu);

   /**
    * f0 -> "x10.lang.perf.addLocalOps"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(AddLocalOpsStatement n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "="
    * f2 -> Expression()
    * f3 -> ";"
    */
   public R visit(Assignment n, A argu);

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
   public R visit(ArrayAssignment n, A argu);

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
   public R visit(FieldAssignment n, A argu);

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
   public R visit(ThisFieldAssignment n, A argu);

   /**
    * f0 -> "async"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Block()
    */
   public R visit(AsyncStatement n, A argu);

   /**
    * f0 -> "break"
    * f1 -> ";"
    */
   public R visit(BreakStatement n, A argu);

   /**
    * f0 -> "continue"
    * f1 -> ";"
    */
   public R visit(ContinueStatement n, A argu);

   /**
    * f0 -> "do"
    * f1 -> Block()
    * f2 -> "while"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    * f6 -> ";"
    */
   public R visit(DoStatement n, A argu);

   /**
    * f0 -> "finish"
    * f1 -> Block()
    */
   public R visit(FinishStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Block()
    * f5 -> [ ElseClause() ]
    */
   public R visit(IfStatement n, A argu);

   /**
    * f0 -> "else"
    * f1 -> Block()
    */
   public R visit(ElseClause n, A argu);

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
   public R visit(LoopStatement n, A argu);

   /**
    * f0 -> PointName()
    *       | Coordinates()
    */
   public R visit(ExplodedSpecification n, A argu);

   /**
    * f0 -> Identifier()
    */
   public R visit(PointName n, A argu);

   /**
    * f0 -> "["
    * f1 -> Identifier()
    * f2 -> "]"
    */
   public R visit(Coordinates n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ( IdentifierRest() )*
    */
   public R visit(IdentifierList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Identifier()
    */
   public R visit(IdentifierRest n, A argu);

   /**
    * f0 -> MethodCall()
    * f1 -> ";"
    */
   public R visit(MethodCallStatement n, A argu);

   /**
    * f0 -> MethodCallInConstructor()
    * f1 -> ";"
    */
   public R visit(MethodCallStatementInConstructor n, A argu);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintlnStatement n, A argu);

   /**
    * f0 -> "System.out.print"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintStatement n, A argu);

   /**
    * f0 -> "System.err.println"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> ";"
    */
   public R visit(PrintErrorStatement n, A argu);

   /**
    * f0 -> "return"
    * f1 -> [ Identifier() ]
    * f2 -> ";"
    */
   public R visit(ReturnStatement n, A argu);

   /**
    * f0 -> "switch"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( SwitchEntry() )*
    * f6 -> "}"
    */
   public R visit(SwitchStatement n, A argu);

   /**
    * f0 -> SwitchLabel()
    * f1 -> ":"
    * f2 -> Block()
    */
   public R visit(SwitchEntry n, A argu);

   /**
    * f0 -> Case()
    *       | Default()
    */
   public R visit(SwitchLabel n, A argu);

   /**
    * f0 -> "case"
    * f1 -> Identifier()
    */
   public R visit(Case n, A argu);

   /**
    * f0 -> "default"
    */
   public R visit(Default n, A argu);

   /**
    * f0 -> "throw"
    * f1 -> "new"
    * f2 -> "RuntimeException"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    * f6 -> ";"
    */
   public R visit(ThrowStatement n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    * f4 -> Block()
    */
   public R visit(WhileStatement n, A argu);

   /**
    * f0 -> "final"
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> "="
    * f4 -> Expression()
    * f5 -> ";"
    */
   public R visit(FinalVariableDeclaration n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    * f2 -> "="
    * f3 -> Expression()
    * f4 -> ";"
    */
   public R visit(UpdatableVariableDeclaration n, A argu);

   /**
    * f0 -> ExpressionInParentheses()
    *       | ConditionalOrExpression()
    *       | SimpleDistributionExpression()
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
   public R visit(Expression n, A argu);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public R visit(ExpressionInParentheses n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "||"
    * f2 -> Identifier()
    */
   public R visit(ConditionalOrExpression n, A argu);

   /**
    * f0 -> "["
    * f1 -> "0 :"
    * f2 -> Identifier()
    * f3 -> "]"
    * f4 -> "->"
    * f5 -> "here"
    */
   public R visit(SimpleDistributionExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "->"
    * f2 -> Identifier()
    */
   public R visit(DistributionExpression n, A argu);

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
   public R visit(DistributionUnionExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "&&"
    * f2 -> Identifier()
    */
   public R visit(ConditionalAndExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "|"
    * f2 -> Identifier()
    */
   public R visit(InclusiveOrExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "^"
    * f2 -> Identifier()
    */
   public R visit(ExclusiveOrExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "&"
    * f2 -> Identifier()
    */
   public R visit(AndExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "=="
    * f2 -> Identifier()
    */
   public R visit(EqualsExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "!="
    * f2 -> Identifier()
    */
   public R visit(NonEqualsExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<"
    * f2 -> Identifier()
    */
   public R visit(LessThanExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">"
    * f2 -> Identifier()
    */
   public R visit(GreaterThanExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<="
    * f2 -> Identifier()
    */
   public R visit(LessThanEqualExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">="
    * f2 -> Identifier()
    */
   public R visit(GreaterThanEqualExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "<<"
    * f2 -> Identifier()
    */
   public R visit(ShiftLeftExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">>"
    * f2 -> Identifier()
    */
   public R visit(ShiftRightExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> ">>>"
    * f2 -> Identifier()
    */
   public R visit(ShiftRightUnsignedExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "+"
    * f2 -> Identifier()
    */
   public R visit(PlusExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "-"
    * f2 -> Identifier()
    */
   public R visit(MinusExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "*"
    * f2 -> Identifier()
    */
   public R visit(TimesExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "/"
    * f2 -> Identifier()
    */
   public R visit(DivideExpression n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "%"
    * f2 -> Identifier()
    */
   public R visit(ModulusExpression n, A argu);

   /**
    * f0 -> "["
    * f1 -> "0 :"
    * f2 -> Identifier()
    * f3 -> "]"
    */
   public R visit(RegionConstant n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sin"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(SinExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "cos"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(CosExpression n, A argu);

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
   public R visit(PowExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "exp"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(ExpExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sqrt"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(SqrtExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "abs"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(AbsExpression n, A argu);

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
   public R visit(MinExpression n, A argu);

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
   public R visit(MaxExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "log"
    * f3 -> "("
    * f4 -> Identifier()
    * f5 -> ")"
    */
   public R visit(LogExpression n, A argu);

   /**
    * f0 -> "~"
    * f1 -> Identifier()
    */
   public R visit(ComplimentExpression n, A argu);

   /**
    * f0 -> "!"
    * f1 -> Identifier()
    */
   public R visit(NotExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "int"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public R visit(CoercionToIntExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "double"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public R visit(CoercionToDoubleExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "long"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public R visit(CoercionToLongExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "short"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public R visit(CoercionToShortExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "byte"
    * f2 -> ")"
    * f3 -> Expression()
    */
   public R visit(CoercionToByteExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> TypeAnnotation()
    * f2 -> ")"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public R visit(TypeAnnotatedExpression n, A argu);

   /**
    * f0 -> UpdatableArrayType()
    *       | ValueArrayType()
    *       | DistType()
    *       | RegionType()
    *       | PointType()
    */
   public R visit(TypeAnnotation n, A argu);

   /**
    * f0 -> "place.places"
    * f1 -> "("
    * f2 -> Identifier()
    * f3 -> ")"
    */
   public R visit(Place n, A argu);

   /**
    * f0 -> "System.currentTimeMillis"
    * f1 -> "("
    * f2 -> ")"
    */
   public R visit(CurrentTime n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "["
    * f2 -> Identifier()
    * f3 -> "]"
    */
   public R visit(ArrayAccess n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( IdentifierList() )?
    * f5 -> ")"
    */
   public R visit(MethodCall n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> "this"
    * f5 -> ( IdentifierRest() )*
    * f6 -> ")"
    */
   public R visit(MethodCallInConstructor n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "id"
    */
   public R visit(DotId n, A argu);

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
   public R visit(DotIdentifierDotGet n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "next"
    * f3 -> "("
    * f4 -> ")"
    */
   public R visit(DotNext n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "prev"
    * f3 -> "("
    * f4 -> ")"
    */
   public R visit(DotPrev n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "isFirst"
    * f3 -> "("
    * f4 -> ")"
    */
   public R visit(DotIsFirst n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> "isLast"
    * f3 -> "("
    * f4 -> ")"
    */
   public R visit(DotIsLast n, A argu);

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
   public R visit(DotIdentifierDotRegionDotSize n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "."
    * f2 -> Identifier()
    */
   public R visit(DotIdentifier n, A argu);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> [ IdentifierList() ]
    * f4 -> ")"
    */
   public R visit(NewObject n, A argu);

   /**
    * f0 -> "new"
    * f1 -> NonArrayType()
    * f2 -> "value"
    * f3 -> "["
    * f4 -> Identifier()
    * f5 -> "]"
    * f6 -> ArrayInitializer()
    */
   public R visit(NewValueArray n, A argu);

   /**
    * f0 -> "new"
    * f1 -> NonArrayType()
    * f2 -> "["
    * f3 -> Identifier()
    * f4 -> "]"
    * f5 -> [ ArrayInitializer() ]
    */
   public R visit(NewUpdatableArray n, A argu);

   /**
    * f0 -> <INTEGER_LITERAL>
    */
   public R visit(IntegerLiteral n, A argu);

   /**
    * f0 -> <LONG_LITERAL>
    */
   public R visit(LongLiteral n, A argu);

   /**
    * f0 -> <HEX_LITERAL>
    */
   public R visit(HexLiteral n, A argu);

   /**
    * f0 -> <FLOATING_POINT_LITERAL>
    */
   public R visit(FloatingPointLiteral n, A argu);

   /**
    * f0 -> <STRING_LITERAL>
    */
   public R visit(StringLiteral n, A argu);

   /**
    * f0 -> "true"
    */
   public R visit(True n, A argu);

   /**
    * f0 -> "false"
    */
   public R visit(False n, A argu);

   /**
    * f0 -> "here"
    */
   public R visit(HereLiteral n, A argu);

   /**
    * f0 -> "place.FIRST_PLACE"
    */
   public R visit(PlaceFirstPlace n, A argu);

   /**
    * f0 -> "place.LAST_PLACE"
    */
   public R visit(PlaceLastPlace n, A argu);

   /**
    * f0 -> "place.MAX_PLACES"
    */
   public R visit(PlaceMaxPlaces n, A argu);

   /**
    * f0 -> "java.lang.Integer.SIZE"
    */
   public R visit(JavaIntegerSize n, A argu);

   /**
    * f0 -> "("
    * f1 -> PointType()
    * f2 -> ExplodedSpecification()
    * f3 -> ")"
    * f4 -> Block()
    */
   public R visit(ArrayInitializer n, A argu);

}
