//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "else"
 * block -> Block()
 */
public class ElseClause implements Node {
   public NodeToken nodeToken;
   public Block block;

   public ElseClause(NodeToken n0, Block n1) {
      nodeToken = n0;
      block = n1;
   }

   public ElseClause(Block n0) {
      nodeToken = new NodeToken("else");
      block = n0;
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

