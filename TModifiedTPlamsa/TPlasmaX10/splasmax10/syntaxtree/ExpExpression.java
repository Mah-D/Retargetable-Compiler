//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "Math"
 * f1 -> "."
 * f2 -> "exp"
 * f3 -> "("
 * f4 -> Identifier()
 * f5 -> ")"
 */
public class ExpExpression implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public NodeToken f2;
   public NodeToken f3;
   public Identifier f4;
   public NodeToken f5;

   public ExpExpression(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, Identifier n4, NodeToken n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
   }

   public ExpExpression(Identifier n0) {
      f0 = new NodeToken("Math");
      f1 = new NodeToken(".");
      f2 = new NodeToken("exp");
      f3 = new NodeToken("(");
      f4 = n0;
      f5 = new NodeToken(")");
   }

   public void accept(splasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(splasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(splasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(splasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

