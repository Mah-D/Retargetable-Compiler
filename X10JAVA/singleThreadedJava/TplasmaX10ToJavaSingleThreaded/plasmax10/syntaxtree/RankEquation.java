//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "rank"
 * f1 -> "=="
 * f2 -> IntegerLiteral()
 */
public class RankEquation implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public IntegerLiteral f2;

   public RankEquation(NodeToken n0, NodeToken n1, IntegerLiteral n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public RankEquation(IntegerLiteral n0) {
      f0 = new NodeToken("rank");
      f1 = new NodeToken("==");
      f2 = n0;
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
