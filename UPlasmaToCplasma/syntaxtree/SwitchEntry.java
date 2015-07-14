//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * switchLabel -> SwitchLabel()
 * nodeToken -> ":"
 * block -> Block()
 */
public class SwitchEntry implements Node {
   public SwitchLabel switchLabel;
   public NodeToken nodeToken;
   public Block block;

   public SwitchEntry(SwitchLabel n0, NodeToken n1, Block n2) {
      switchLabel = n0;
      nodeToken = n1;
      block = n2;
   }

   public SwitchEntry(SwitchLabel n0, Block n1) {
      switchLabel = n0;
      nodeToken = new NodeToken(":");
      block = n1;
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

