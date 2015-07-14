//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "."
 * f1 -> "rank"
 * f2 -> "("
 * f3 -> Expression()
 * f4 -> ")"
 */
public class DotRank implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;
   public Expression f3;
   public NodeToken f4;

   public DotRank(NodeToken n0, NodeToken n1, NodeToken n2, Expression n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public DotRank(Expression n0) {
      f0 = new NodeToken(".");
      f1 = new NodeToken("rank");
      f2 = new NodeToken("(");
      f3 = n0;
      f4 = new NodeToken(")");
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

