//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "<="
 * f1 -> ShiftExpression()
 */
public class LessThanEqualExpression implements Node {
   public NodeToken f0;
   public ShiftExpression f1;

   public LessThanEqualExpression(NodeToken n0, ShiftExpression n1) {
      f0 = n0;
      f1 = n1;
   }

   public LessThanEqualExpression(ShiftExpression n0) {
      f0 = new NodeToken("<=");
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

