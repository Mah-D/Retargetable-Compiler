//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * nodeToken1 -> "short"
 * nodeToken2 -> ")"
 * expression -> Expression()
 */
public class CoercionToShortExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public Expression expression;

   public CoercionToShortExpression(NodeToken n0, NodeToken n1, NodeToken n2, Expression n3) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      expression = n3;
   }

   public CoercionToShortExpression(Expression n0) {
      nodeToken = new NodeToken("(");
      nodeToken1 = new NodeToken("short");
      nodeToken2 = new NodeToken(")");
      expression = n0;
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

