//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "false"
 */
public class False implements Node {
   public NodeToken nodeToken;

   public False(NodeToken n0) {
      nodeToken = n0;
   }

   public False() {
      nodeToken = new NodeToken("false");
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

