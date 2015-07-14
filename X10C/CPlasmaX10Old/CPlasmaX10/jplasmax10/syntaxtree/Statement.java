//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
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
public class Statement implements Node {
   public NodeChoice nodeChoice;

   public Statement(NodeChoice n0) {
      nodeChoice = n0;
   }

   public void accept(jplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
