//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "break"
 * nodeToken1 -> ";"
 */
public class BreakStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;

   public BreakStatement(NodeToken n0, NodeToken n1) {
      nodeToken = n0;
      nodeToken1 = n1;
   }

   public BreakStatement() {
      nodeToken = new NodeToken("break");
      nodeToken1 = new NodeToken(";");
   }

   public void accept(uplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(uplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(uplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(uplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

