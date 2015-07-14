//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "!"
 * f1 -> UnaryExpression()
 */
public class NotExpression implements Node {
   public NodeToken f0;
   public UnaryExpression f1;

   public NotExpression(NodeToken n0, UnaryExpression n1) {
      f0 = n0;
      f1 = n1;
   }

   public NotExpression(UnaryExpression n0) {
      f0 = new NodeToken("!");
      f1 = n0;
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

