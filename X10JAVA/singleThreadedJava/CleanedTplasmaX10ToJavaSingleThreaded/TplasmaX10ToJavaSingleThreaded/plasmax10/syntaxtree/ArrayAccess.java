//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "["
 * f1 -> ExpressionList()
 * f2 -> "]"
 */
public class ArrayAccess implements Node {
   public NodeToken f0;
   public ExpressionList f1;
   public NodeToken f2;

   public ArrayAccess(NodeToken n0, ExpressionList n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public ArrayAccess(ExpressionList n0) {
      f0 = new NodeToken("[");
      f1 = n0;
      f2 = new NodeToken("]");
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

