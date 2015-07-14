//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> SinExpression()
 *       | CosExpression()
 *       | PowExpression()
 *       | ExpExpression()
 *       | SqrtExpression()
 *       | AbsExpression()
 *       | MinExpression()
 *       | MaxExpression()
 *       | LogExpression()
 */
public class MathExpression implements Node {
   public NodeChoice f0;

   public MathExpression(NodeChoice n0) {
      f0 = n0;
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

