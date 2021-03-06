//
// Generated by JTB 1.3.2
//

package plasmax10.visitor;

import java.util.*;

import plasmax10.syntaxtree.*;

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
    * f0 -> ( TopLevelDeclaration() )*
    * f1 -> <EOF>
    */
   public void visit(File n, A argu);

   /**
    * f0 -> MainClass()
    *       | ClassDeclaration()
    *       | ValueDeclaration()
    */
   public void visit(TopLevelDeclaration n, A argu);

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
    * f15 -> Statement()
    * f16 -> "}"
    * f17 -> "}"
    */
   public void visit(MainClass n, A argu);

   /**
    * f0 -> [ Public() ]
    * f1 -> "class"
    * f2 -> Identifier()
    * f3 -> "{"
    * f4 -> ( ClassMember() )*
    * f5 -> "}"
    */
   public void visit(ClassDeclaration n, A argu);

   /**
    * f0 -> [ Public() ]
    * f1 -> "value"
    * f2 -> Identifier()
    * f3 -> "{"
    * f4 -> ( ValueMember() )*
    * f5 -> "}"
    */
   public void visit(ValueDeclaration n, A argu);

   /**
    * f0 -> ConstructorDeclaration()
    *       | MethodDeclaration()
    *       | ConstantDeclaration()
    *       | InitializableConstantDeclaration()
    *       | UpdatableFieldDeclaration()
    */
   public void visit(ClassMember n, A argu);

   /**
    * f0 -> ConstructorDeclaration()
    *       | MethodDeclaration()
    *       | ConstantDeclaration()
    *       | InitializableConstantDeclaration()
    */
   public void visit(ValueMember n, A argu);

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
    * f0 -> Public()
    *       | Private()
    */
   public void visit(Visibility n, A argu);

   /**
    * f0 -> Visibility()
    * f1 -> "static"
    * f2 -> "final"
    * f3 -> Type()
    * f4 -> Identifier()
    * f5 -> "="
    * f6 -> Expression()
    * f7 -> ";"
    */
   public void visit(ConstantDeclaration n, A argu);

   /**
    * f0 -> Visibility()
    * f1 -> "final"
    * f2 -> Type()
    * f3 -> Identifier()
    * f4 -> ";"
    */
   public void visit(InitializableConstantDeclaration n, A argu);

   /**
    * f0 -> Visibility()
    * f1 -> Type()
    * f2 -> Identifier()
    * f3 -> ";"
    */
   public void visit(UpdatableFieldDeclaration n, A argu);

   /**
    * f0 -> "public"
    * f1 -> "static"
    */
   public void visit(PublicStatic n, A argu);

   /**
    * f0 -> "public"
    */
   public void visit(Public n, A argu);

   /**
    * f0 -> "private"
    */
   public void visit(Private n, A argu);

   /**
    * f0 -> MethodModifier()
    * f1 -> ReturnType()
    * f2 -> Identifier()
    * f3 -> "("
    * f4 -> ( FormalParameterList() )?
    * f5 -> ")"
    * f6 -> Block()
    */
   public void visit(MethodDeclaration n, A argu);

   /**
    * f0 -> PublicStatic()
    *       | Public()
    *       | Private()
    */
   public void visit(MethodModifier n, A argu);

   /**
    * f0 -> FormalParameter()
    * f1 -> ( FormalParameterRest() )*
    */
   public void visit(FormalParameterList n, A argu);

   /**
    * f0 -> FinalFormalParameter()
    *       | UpdatableFormalParameter()
    */
   public void visit(FormalParameter n, A argu);

   /**
    * f0 -> "final"
    * f1 -> Type()
    * f2 -> Identifier()
    */
   public void visit(FinalFormalParameter n, A argu);

   /**
    * f0 -> Type()
    * f1 -> Identifier()
    */
   public void visit(UpdatableFormalParameter n, A argu);

   /**
    * f0 -> ","
    * f1 -> FormalParameter()
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
    * f4 -> ( DistributionEquation() )?
    * f5 -> "]"
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
    * f0 -> "rank"
    * f1 -> "=="
    * f2 -> IntegerLiteral()
    */
   public void visit(RankEquation n, A argu);

   /**
    * f0 -> "&&"
    * f1 -> "distribution"
    * f2 -> "=="
    * f3 -> Identifier()
    */
   public void visit(DistributionEquation n, A argu);

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
    * f0 -> AddLocalOpsStatement()
    *       | Assignment()
    *       | AsyncStatement()
    *       | Block()
    *       | BreakStatement()
    *       | ContinueStatement()
    *       | DoStatement()
    *       | FinishStatement()
    *       | IfStatement()
    *       | LoopStatement()
    *       | PostfixStatement()
    *       | PrintlnStatement()
    *       | PrintStatement()
    *       | PrintErrorStatement()
    *       | ReturnStatement()
    *       | SwitchStatement()
    *       | ThrowStatement()
    *       | WhileStatement()
    */
   public void visit(Statement n, A argu);

   /**
    * f0 -> "x10.lang.perf.addLocalOps"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(AddLocalOpsStatement n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> AssignmentOperator()
    * f2 -> Expression()
    * f3 -> ";"
    */
   public void visit(Assignment n, A argu);

   /**
    * f0 -> PlainAssignment()
    *       | MultiplyAssignment()
    *       | DivideAssignment()
    *       | ModuloAssignment()
    *       | PlusAssignment()
    *       | MinusAssignment()
    *       | ShiftLeftAssignment()
    *       | ShiftRightAssignment()
    *       | ShiftRightUnsignedAssignment()
    *       | AndAssignment()
    *       | XOrAssignment()
    *       | OrAssignment()
    */
   public void visit(AssignmentOperator n, A argu);

   /**
    * f0 -> "="
    */
   public void visit(PlainAssignment n, A argu);

   /**
    * f0 -> "*="
    */
   public void visit(MultiplyAssignment n, A argu);

   /**
    * f0 -> "/="
    */
   public void visit(DivideAssignment n, A argu);

   /**
    * f0 -> "%="
    */
   public void visit(ModuloAssignment n, A argu);

   /**
    * f0 -> "+="
    */
   public void visit(PlusAssignment n, A argu);

   /**
    * f0 -> "-="
    */
   public void visit(MinusAssignment n, A argu);

   /**
    * f0 -> "<<="
    */
   public void visit(ShiftLeftAssignment n, A argu);

   /**
    * f0 -> ">>="
    */
   public void visit(ShiftRightAssignment n, A argu);

   /**
    * f0 -> ">>>="
    */
   public void visit(ShiftRightUnsignedAssignment n, A argu);

   /**
    * f0 -> "&="
    */
   public void visit(AndAssignment n, A argu);

   /**
    * f0 -> "^="
    */
   public void visit(XOrAssignment n, A argu);

   /**
    * f0 -> "|="
    */
   public void visit(OrAssignment n, A argu);

   /**
    * f0 -> "async"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Block()
    */
   public void visit(AsyncStatement n, A argu);

   /**
    * f0 -> "{"
    * f1 -> ( BlockStatement() )*
    * f2 -> "}"
    */
   public void visit(Block n, A argu);

   /**
    * f0 -> FinalVariableDeclaration()
    *       | UpdatableVariableDeclaration()
    *       | Statement()
    */
   public void visit(BlockStatement n, A argu);

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
    * f1 -> Statement()
    * f2 -> "while"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(DoStatement n, A argu);

   /**
    * f0 -> "finish"
    * f1 -> Statement()
    */
   public void visit(FinishStatement n, A argu);

   /**
    * f0 -> "if"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    * f5 -> [ ElseClause() ]
    */
   public void visit(IfStatement n, A argu);

   /**
    * f0 -> "else"
    * f1 -> Statement()
    */
   public void visit(ElseClause n, A argu);

   /**
    * f0 -> LoopQualifier()
    * f1 -> "("
    * f2 -> PointType()
    * f3 -> ExplodedSpecification()
    * f4 -> ":"
    * f5 -> Expression()
    * f6 -> ")"
    * f7 -> Statement()
    */
   public void visit(LoopStatement n, A argu);

   /**
    * f0 -> Ateach()
    *       | For()
    *       | Foreach()
    */
   public void visit(LoopQualifier n, A argu);

   /**
    * f0 -> "ateach"
    */
   public void visit(Ateach n, A argu);

   /**
    * f0 -> "for"
    */
   public void visit(For n, A argu);

   /**
    * f0 -> "foreach"
    */
   public void visit(Foreach n, A argu);

   /**
    * f0 -> PointNameCoordinates()
    *       | PointName()
    *       | Coordinates()
    */
   public void visit(ExplodedSpecification n, A argu);

   /**
    * f0 -> PointName()
    * f1 -> Coordinates()
    */
   public void visit(PointNameCoordinates n, A argu);

   /**
    * f0 -> Identifier()
    */
   public void visit(PointName n, A argu);

   /**
    * f0 -> "["
    * f1 -> IdentifierList()
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
    * f0 -> PostfixExpression()
    * f1 -> ";"
    */
   public void visit(PostfixStatement n, A argu);

   /**
    * f0 -> "System.out.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintlnStatement n, A argu);

   /**
    * f0 -> "System.out.print"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintStatement n, A argu);

   /**
    * f0 -> "System.err.println"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> ";"
    */
   public void visit(PrintErrorStatement n, A argu);

   /**
    * f0 -> "return"
    * f1 -> [ Expression() ]
    * f2 -> ";"
    */
   public void visit(ReturnStatement n, A argu);

   /**
    * f0 -> "switch"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> "{"
    * f5 -> ( SwitchEntry() )*
    * f6 -> "}"
    */
   public void visit(SwitchStatement n, A argu);

   /**
    * f0 -> SwitchLabel()
    * f1 -> ":"
    * f2 -> ( BlockStatement() )*
    */
   public void visit(SwitchEntry n, A argu);

   /**
    * f0 -> Case()
    *       | Default()
    */
   public void visit(SwitchLabel n, A argu);

   /**
    * f0 -> "case"
    * f1 -> Expression()
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
    * f4 -> Expression()
    * f5 -> ")"
    * f6 -> ";"
    */
   public void visit(ThrowStatement n, A argu);

   /**
    * f0 -> "while"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    * f4 -> Statement()
    */
   public void visit(WhileStatement n, A argu);

   /**
    * f0 -> ConditionalExpression()
    */
   public void visit(Expression n, A argu);

   /**
    * f0 -> ConditionalOrExpression()
    * f1 -> [ ConditionalExpressionRest() ]
    */
   public void visit(ConditionalExpression n, A argu);

   /**
    * f0 -> "?"
    * f1 -> Expression()
    * f2 -> ":"
    * f3 -> Expression()
    */
   public void visit(ConditionalExpressionRest n, A argu);

   /**
    * f0 -> ConditionalAndExpression()
    * f1 -> ( ConditionalOrExpressionRest() )*
    */
   public void visit(ConditionalOrExpression n, A argu);

   /**
    * f0 -> "||"
    * f1 -> ConditionalAndExpression()
    */
   public void visit(ConditionalOrExpressionRest n, A argu);

   /**
    * f0 -> InclusiveOrExpression()
    * f1 -> ( ConditionalAndExpressionRest() )*
    */
   public void visit(ConditionalAndExpression n, A argu);

   /**
    * f0 -> "&&"
    * f1 -> InclusiveOrExpression()
    */
   public void visit(ConditionalAndExpressionRest n, A argu);

   /**
    * f0 -> ExclusiveOrExpression()
    * f1 -> ( InclusiveOrExpressionRest() )*
    */
   public void visit(InclusiveOrExpression n, A argu);

   /**
    * f0 -> "|"
    * f1 -> ExclusiveOrExpression()
    */
   public void visit(InclusiveOrExpressionRest n, A argu);

   /**
    * f0 -> AndExpression()
    * f1 -> ( ExclusiveOrExpressionRest() )*
    */
   public void visit(ExclusiveOrExpression n, A argu);

   /**
    * f0 -> "^"
    * f1 -> AndExpression()
    */
   public void visit(ExclusiveOrExpressionRest n, A argu);

   /**
    * f0 -> EqualityExpression()
    * f1 -> ( AndExpressionRest() )*
    */
   public void visit(AndExpression n, A argu);

   /**
    * f0 -> "&"
    * f1 -> EqualityExpression()
    */
   public void visit(AndExpressionRest n, A argu);

   /**
    * f0 -> RelationalExpression()
    * f1 -> ( EqualityExpressionRest() )?
    */
   public void visit(EqualityExpression n, A argu);

   /**
    * f0 -> EqualsExpression()
    *       | NonEqualsExpression()
    */
   public void visit(EqualityExpressionRest n, A argu);

   /**
    * f0 -> "=="
    * f1 -> RelationalExpression()
    */
   public void visit(EqualsExpression n, A argu);

   /**
    * f0 -> "!="
    * f1 -> RelationalExpression()
    */
   public void visit(NonEqualsExpression n, A argu);

   /**
    * f0 -> ShiftExpression()
    * f1 -> [ RelationalExpressionRest() ]
    */
   public void visit(RelationalExpression n, A argu);

   /**
    * f0 -> LessThanExpression()
    *       | GreaterThanExpression()
    *       | LessThanEqualExpression()
    *       | GreaterThanEqualExpression()
    */
   public void visit(RelationalExpressionRest n, A argu);

   /**
    * f0 -> "<"
    * f1 -> ShiftExpression()
    */
   public void visit(LessThanExpression n, A argu);

   /**
    * f0 -> ">"
    * f1 -> ShiftExpression()
    */
   public void visit(GreaterThanExpression n, A argu);

   /**
    * f0 -> "<="
    * f1 -> ShiftExpression()
    */
   public void visit(LessThanEqualExpression n, A argu);

   /**
    * f0 -> ">="
    * f1 -> ShiftExpression()
    */
   public void visit(GreaterThanEqualExpression n, A argu);

   /**
    * f0 -> AdditiveExpression()
    * f1 -> ( ShiftExpressionRest() )*
    */
   public void visit(ShiftExpression n, A argu);

   /**
    * f0 -> ShiftLeftExpression()
    *       | ShiftRightExpression()
    *       | ShiftRightUnsignedExpression()
    */
   public void visit(ShiftExpressionRest n, A argu);

   /**
    * f0 -> "<<"
    * f1 -> AdditiveExpression()
    */
   public void visit(ShiftLeftExpression n, A argu);

   /**
    * f0 -> ">>"
    * f1 -> AdditiveExpression()
    */
   public void visit(ShiftRightExpression n, A argu);

   /**
    * f0 -> ">>>"
    * f1 -> AdditiveExpression()
    */
   public void visit(ShiftRightUnsignedExpression n, A argu);

   /**
    * f0 -> MultiplicativeExpression()
    * f1 -> ( AdditiveExpressionRest() )*
    */
   public void visit(AdditiveExpression n, A argu);

   /**
    * f0 -> PlusOffset()
    *       | PlusExpression()
    *       | MinusExpression()
    */
   public void visit(AdditiveExpressionRest n, A argu);

   /**
    * f0 -> "+"
    * f1 -> "["
    * f2 -> ExpressionList()
    * f3 -> "]"
    */
   public void visit(PlusOffset n, A argu);

   /**
    * f0 -> "+"
    * f1 -> MultiplicativeExpression()
    */
   public void visit(PlusExpression n, A argu);

   /**
    * f0 -> "-"
    * f1 -> MultiplicativeExpression()
    */
   public void visit(MinusExpression n, A argu);

   /**
    * f0 -> MapExpression()
    * f1 -> ( MultiplicativeExpressionRest() )*
    */
   public void visit(MultiplicativeExpression n, A argu);

   /**
    * f0 -> TimesExpression()
    *       | DivideExpression()
    *       | ModulusExpression()
    */
   public void visit(MultiplicativeExpressionRest n, A argu);

   /**
    * f0 -> "*"
    * f1 -> MapExpression()
    */
   public void visit(TimesExpression n, A argu);

   /**
    * f0 -> "/"
    * f1 -> MapExpression()
    */
   public void visit(DivideExpression n, A argu);

   /**
    * f0 -> "%"
    * f1 -> MapExpression()
    */
   public void visit(ModulusExpression n, A argu);

   /**
    * f0 -> RegionExpression()
    * f1 -> [ MapExpressionRest() ]
    */
   public void visit(MapExpression n, A argu);

   /**
    * f0 -> "->"
    * f1 -> UnaryExpression()
    */
   public void visit(MapExpressionRest n, A argu);

   /**
    * f0 -> RegionConstant()
    *       | UnaryExpression()
    */
   public void visit(RegionExpression n, A argu);

   /**
    * f0 -> "["
    * f1 -> ColonExpression()
    * f2 -> ( ColonRest() )*
    * f3 -> "]"
    */
   public void visit(RegionConstant n, A argu);

   /**
    * f0 -> ","
    * f1 -> ColonExpression()
    */
   public void visit(ColonRest n, A argu);

   /**
    * f0 -> ColonPair()
    *       | Expression()
    */
   public void visit(ColonExpression n, A argu);

   /**
    * f0 -> Expression()
    * f1 -> ":"
    * f2 -> Expression()
    */
   public void visit(ColonPair n, A argu);

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
   public void visit(MathExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sin"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(SinExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "cos"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(CosExpression n, A argu);

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
   public void visit(PowExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "exp"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(ExpExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "sqrt"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(SqrtExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "abs"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(AbsExpression n, A argu);

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
   public void visit(MinExpression n, A argu);

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
   public void visit(MaxExpression n, A argu);

   /**
    * f0 -> "Math"
    * f1 -> "."
    * f2 -> "log"
    * f3 -> "("
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(LogExpression n, A argu);

   /**
    * f0 -> UnaryPlusExpression()
    *       | UnaryMinusExpression()
    *       | PreIncrementExpression()
    *       | PreDecrementExpression()
    *       | ComplimentExpression()
    *       | NotExpression()
    *       | CoercionToIntExpression()
    *       | CoercionToDoubleExpression()
    *       | CoercionToLongExpression()
    *       | CoercionToShortExpression()
    *       | CoercionToByteExpression()
    *       | TypeAnnotatedExpression()
    *       | PostfixExpression()
    */
   public void visit(UnaryExpression n, A argu);

   /**
    * f0 -> "+"
    * f1 -> PrimaryExpression()
    */
   public void visit(UnaryPlusExpression n, A argu);

   /**
    * f0 -> "-"
    * f1 -> PrimaryExpression()
    */
   public void visit(UnaryMinusExpression n, A argu);

   /**
    * f0 -> "++"
    * f1 -> PrimaryExpression()
    */
   public void visit(PreIncrementExpression n, A argu);

   /**
    * f0 -> "--"
    * f1 -> PrimaryExpression()
    */
   public void visit(PreDecrementExpression n, A argu);

   /**
    * f0 -> "~"
    * f1 -> UnaryExpression()
    */
   public void visit(ComplimentExpression n, A argu);

   /**
    * f0 -> "!"
    * f1 -> UnaryExpression()
    */
   public void visit(NotExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "int"
    * f2 -> ")"
    * f3 -> UnaryExpression()
    */
   public void visit(CoercionToIntExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "double"
    * f2 -> ")"
    * f3 -> UnaryExpression()
    */
   public void visit(CoercionToDoubleExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "long"
    * f2 -> ")"
    * f3 -> UnaryExpression()
    */
   public void visit(CoercionToLongExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "short"
    * f2 -> ")"
    * f3 -> UnaryExpression()
    */
   public void visit(CoercionToShortExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> "byte"
    * f2 -> ")"
    * f3 -> UnaryExpression()
    */
   public void visit(CoercionToByteExpression n, A argu);

   /**
    * f0 -> "("
    * f1 -> TypeAnnotation()
    * f2 -> ")"
    * f3 -> UnaryExpression()
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
    * f0 -> PostIncrementExpression()
    *       | PostDecrementExpression()
    *       | PrimaryExpression()
    *       | Place()
    *       | FactoryBlock()
    *       | FactoryBlockCyclic()
    *       | FactoryEmptyRegion()
    *       | CurrentTime()
    */
   public void visit(PostfixExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "++"
    */
   public void visit(PostIncrementExpression n, A argu);

   /**
    * f0 -> PrimaryExpression()
    * f1 -> "--"
    */
   public void visit(PostDecrementExpression n, A argu);

   /**
    * f0 -> PrimaryPrefix()
    * f1 -> ( PrimarySuffix() )*
    */
   public void visit(PrimaryExpression n, A argu);

   /**
    * f0 -> Literal()
    *       | MathExpression()
    *       | This()
    *       | ExpressionInParentheses()
    *       | AllocationExpression()
    *       | MethodCall()
    *       | Identifier()
    */
   public void visit(PrimaryPrefix n, A argu);

   /**
    * f0 -> "this"
    */
   public void visit(This n, A argu);

   /**
    * f0 -> "("
    * f1 -> Expression()
    * f2 -> ")"
    */
   public void visit(ExpressionInParentheses n, A argu);

   /**
    * f0 -> "place.places"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    */
   public void visit(Place n, A argu);

   /**
    * f0 -> "dist.factory.block"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ")"
    */
   public void visit(FactoryBlock n, A argu);

   /**
    * f0 -> "dist.factory.blockCyclic"
    * f1 -> "("
    * f2 -> Expression()
    * f3 -> ","
    * f4 -> Expression()
    * f5 -> ")"
    */
   public void visit(FactoryBlockCyclic n, A argu);

   /**
    * f0 -> "region.factory.emptyRegion"
    * f1 -> "("
    * f2 -> IntegerLiteral()
    * f3 -> ")"
    */
   public void visit(FactoryEmptyRegion n, A argu);

   /**
    * f0 -> "System.currentTimeMillis"
    * f1 -> "("
    * f2 -> ")"
    */
   public void visit(CurrentTime n, A argu);

   /**
    * f0 -> ArrayAccess()
    *       | DotDistribution()
    *       | DotRegion()
    *       | DotId()
    *       | DotGet()
    *       | DotContainsPoint()
    *       | DotContains()
    *       | DotEquals()
    *       | DotHigh()
    *       | DotLow()
    *       | DotRank()
    *       | DotNext()
    *       | DotPrev()
    *       | DotIsFirst()
    *       | DotIsLast()
    *       | DotCoord()
    *       | DotOrdinalPoint()
    *       | DotOrdinal()
    *       | DotMax()
    *       | DotSum()
    *       | DotSize()
    *       | DotMethodCall()
    *       | DotIdentifier()
    */
   public void visit(PrimarySuffix n, A argu);

   /**
    * f0 -> "["
    * f1 -> ExpressionList()
    * f2 -> "]"
    */
   public void visit(ArrayAccess n, A argu);

   /**
    * f0 -> "."
    * f1 -> MethodCall()
    */
   public void visit(DotMethodCall n, A argu);

   /**
    * f0 -> Identifier()
    * f1 -> "("
    * f2 -> ( ExpressionList() )?
    * f3 -> ")"
    */
   public void visit(MethodCall n, A argu);

   /**
    * f0 -> "."
    * f1 -> "distribution"
    */
   public void visit(DotDistribution n, A argu);

   /**
    * f0 -> "."
    * f1 -> "region"
    */
   public void visit(DotRegion n, A argu);

   /**
    * f0 -> "."
    * f1 -> "id"
    */
   public void visit(DotId n, A argu);

   /**
    * f0 -> "."
    * f1 -> "get"
    * f2 -> "("
    * f3 -> ExpressionList()
    * f4 -> ")"
    */
   public void visit(DotGet n, A argu);

   /**
    * f0 -> "."
    * f1 -> "contains"
    * f2 -> "("
    * f3 -> "["
    * f4 -> ExpressionList()
    * f5 -> "]"
    * f6 -> ")"
    */
   public void visit(DotContainsPoint n, A argu);

   /**
    * f0 -> "."
    * f1 -> "contains"
    * f2 -> "("
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DotContains n, A argu);

   /**
    * f0 -> "."
    * f1 -> "equals"
    * f2 -> "("
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DotEquals n, A argu);

   /**
    * f0 -> "."
    * f1 -> "high"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotHigh n, A argu);

   /**
    * f0 -> "."
    * f1 -> "low"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotLow n, A argu);

   /**
    * f0 -> "."
    * f1 -> "rank"
    * f2 -> "("
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DotRank n, A argu);

   /**
    * f0 -> "."
    * f1 -> "next"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotNext n, A argu);

   /**
    * f0 -> "."
    * f1 -> "prev"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotPrev n, A argu);

   /**
    * f0 -> "."
    * f1 -> "isFirst"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotIsFirst n, A argu);

   /**
    * f0 -> "."
    * f1 -> "isLast"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotIsLast n, A argu);

   /**
    * f0 -> "."
    * f1 -> "coord"
    * f2 -> "("
    * f3 -> Expression()
    * f4 -> ")"
    * f5 -> "["
    * f6 -> IntegerLiteral()
    * f7 -> "]"
    */
   public void visit(DotCoord n, A argu);

   /**
    * f0 -> "."
    * f1 -> "ordinal"
    * f2 -> "("
    * f3 -> "["
    * f4 -> ExpressionList()
    * f5 -> "]"
    * f6 -> ")"
    */
   public void visit(DotOrdinalPoint n, A argu);

   /**
    * f0 -> "."
    * f1 -> "ordinal"
    * f2 -> "("
    * f3 -> Expression()
    * f4 -> ")"
    */
   public void visit(DotOrdinal n, A argu);

   /**
    * f0 -> "."
    * f1 -> "max"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotMax n, A argu);

   /**
    * f0 -> "."
    * f1 -> "sum"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotSum n, A argu);

   /**
    * f0 -> "."
    * f1 -> "size"
    * f2 -> "("
    * f3 -> ")"
    */
   public void visit(DotSize n, A argu);

   /**
    * f0 -> "."
    * f1 -> Identifier()
    */
   public void visit(DotIdentifier n, A argu);

   /**
    * f0 -> NewObject()
    *       | NewValueArray()
    *       | NewUpdatableArray()
    */
   public void visit(AllocationExpression n, A argu);

   /**
    * f0 -> "new"
    * f1 -> Identifier()
    * f2 -> "("
    * f3 -> [ ExpressionList() ]
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
    * f0 -> IntegerLiteral()
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
    *       | DistUnique()
    *       | JavaIntegerSize()
    */
   public void visit(Literal n, A argu);

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
    * f0 -> "dist.UNIQUE"
    */
   public void visit(DistUnique n, A argu);

   /**
    * f0 -> "java.lang.Integer.SIZE"
    */
   public void visit(JavaIntegerSize n, A argu);

   /**
    * f0 -> Expression()
    * f1 -> ( ArgumentRest() )*
    */
   public void visit(ExpressionList n, A argu);

   /**
    * f0 -> ","
    * f1 -> Expression()
    */
   public void visit(ArgumentRest n, A argu);

   /**
    * f0 -> "("
    * f1 -> PointType()
    * f2 -> ExplodedSpecification()
    * f3 -> ")"
    * f4 -> Block()
    */
   public void visit(ArrayInitializer n, A argu);

}

