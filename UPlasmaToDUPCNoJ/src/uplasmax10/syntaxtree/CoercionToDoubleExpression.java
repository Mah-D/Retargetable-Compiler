//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * nodeToken1 -> "double"
 * nodeToken2 -> ")"
 * expression -> Expression()
 */
public class CoercionToDoubleExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public Expression expression;

   public CoercionToDoubleExpression(NodeToken n0, NodeToken n1, NodeToken n2, Expression n3) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      expression = n3;
   }

   public CoercionToDoubleExpression(Expression n0) {
      nodeToken = new NodeToken("(");
      nodeToken1 = new NodeToken("double");
      nodeToken2 = new NodeToken(")");
      expression = n0;
   }

   public void accept(uplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(uplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(uplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(uplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

