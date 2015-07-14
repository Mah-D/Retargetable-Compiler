//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "continue"
 * nodeToken1 -> ";"
 */
public class ContinueStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;

   public ContinueStatement(NodeToken n0, NodeToken n1) {
      nodeToken = n0;
      nodeToken1 = n1;
   }

   public ContinueStatement() {
      nodeToken = new NodeToken("continue");
      nodeToken1 = new NodeToken(";");
   }

   public void accept(jplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
