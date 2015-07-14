//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * expression -> Expression()
 * nodeToken1 -> ")"
 */
public class ExpressionInParentheses implements Node {
   public NodeToken nodeToken;
   public Expression expression;
   public NodeToken nodeToken1;

   public ExpressionInParentheses(NodeToken n0, Expression n1, NodeToken n2) {
      nodeToken = n0;
      expression = n1;
      nodeToken1 = n2;
   }

   public ExpressionInParentheses(Expression n0) {
      nodeToken = new NodeToken("(");
      expression = n0;
      nodeToken1 = new NodeToken(")");
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

