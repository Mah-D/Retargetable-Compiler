//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "dist.factory.blockCyclic"
 * f1 -> "("
 * f2 -> Expression()
 * f3 -> ","
 * f4 -> Expression()
 * f5 -> ")"
 */
public class FactoryBlockCyclic implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Expression f2;
   public NodeToken f3;
   public Expression f4;
   public NodeToken f5;

   public FactoryBlockCyclic(NodeToken n0, NodeToken n1, Expression n2, NodeToken n3, Expression n4, NodeToken n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
   }

   public FactoryBlockCyclic(Expression n0, Expression n1) {
      f0 = new NodeToken("dist.factory.blockCyclic");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken(",");
      f4 = n1;
      f5 = new NodeToken(")");
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

