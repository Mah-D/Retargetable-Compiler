//
// Generated by JTB 1.3.2
//

package syntaxtree;

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

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
