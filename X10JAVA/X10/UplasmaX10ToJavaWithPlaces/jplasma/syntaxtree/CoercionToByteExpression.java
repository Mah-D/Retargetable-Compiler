//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * nodeToken1 -> "byte"
 * nodeToken2 -> ")"
 * expression -> Expression()
 */
public class CoercionToByteExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public Expression expression;

   public CoercionToByteExpression(NodeToken n0, NodeToken n1, NodeToken n2, Expression n3) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      expression = n3;
   }

   public CoercionToByteExpression(Expression n0) {
      nodeToken = new NodeToken("(");
      nodeToken1 = new NodeToken("byte");
      nodeToken2 = new NodeToken(")");
      expression = n0;
   }

   public void accept(jplasma.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasma.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasma.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasma.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

