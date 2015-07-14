//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "+"
 * f1 -> "["
 * f2 -> ExpressionList()
 * f3 -> "]"
 */
public class PlusOffset implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public ExpressionList f2;
   public NodeToken f3;

   public PlusOffset(NodeToken n0, NodeToken n1, ExpressionList n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public PlusOffset(ExpressionList n0) {
      f0 = new NodeToken("+");
      f1 = new NodeToken("[");
      f2 = n0;
      f3 = new NodeToken("]");
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
