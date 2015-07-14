//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "Math"
 * f1 -> "."
 * f2 -> "pow"
 * f3 -> "("
 * f4 -> Expression()
 * f5 -> ","
 * f6 -> Expression()
 * f7 -> ")"
 */
public class PowExpression implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;
   public NodeToken f3;
   public Expression f4;
   public NodeToken f5;
   public Expression f6;
   public NodeToken f7;

   public PowExpression(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, Expression n4, NodeToken n5, Expression n6, NodeToken n7) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
      f7 = n7;
   }

   public PowExpression(Expression n0, Expression n1) {
      f0 = new NodeToken("Math");
      f1 = new NodeToken(".");
      f2 = new NodeToken("pow");
      f3 = new NodeToken("(");
      f4 = n0;
      f5 = new NodeToken(",");
      f6 = n1;
      f7 = new NodeToken(")");
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

