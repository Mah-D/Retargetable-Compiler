//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "("
 * f1 -> "double"
 * f2 -> ")"
 * f3 -> UnaryExpression()
 */
public class CoercionToDoubleExpression implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;
   public UnaryExpression f3;

   public CoercionToDoubleExpression(NodeToken n0, NodeToken n1, NodeToken n2, UnaryExpression n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public CoercionToDoubleExpression(UnaryExpression n0) {
      f0 = new NodeToken("(");
      f1 = new NodeToken("double");
      f2 = new NodeToken(")");
      f3 = n0;
   }

   public void accept(plasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(plasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(plasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(plasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

