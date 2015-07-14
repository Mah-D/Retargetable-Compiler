//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "continue"
 * f1 -> ";"
 */
public class ContinueStatement implements Node {
   public NodeToken f0;
   public NodeToken f1;

   public ContinueStatement(NodeToken n0, NodeToken n1) {
      f0 = n0;
      f1 = n1;
   }

   public ContinueStatement() {
      f0 = new NodeToken("continue");
      f1 = new NodeToken(";");
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

