//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * nodeToken1 -> "int"
 * nodeToken2 -> ")"
 * expression -> Expression()
 */
public class CoercionToIntExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public Expression expression;

   public CoercionToIntExpression(NodeToken n0, NodeToken n1, NodeToken n2, Expression n3) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      expression = n3;
   }

   public CoercionToIntExpression(Expression n0) {
      nodeToken = new NodeToken("(");
      nodeToken1 = new NodeToken("int");
      nodeToken2 = new NodeToken(")");
      expression = n0;
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

