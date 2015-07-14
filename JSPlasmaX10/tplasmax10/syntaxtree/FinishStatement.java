//
// Generated by JTB 1.3.2
//

package tplasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "finish"
 * f1 -> Block()
 */
public class FinishStatement implements Node {
   public NodeToken f0;
   public Block f1;

   public FinishStatement(NodeToken n0, Block n1) {
      f0 = n0;
      f1 = n1;
   }

   public FinishStatement(Block n0) {
      f0 = new NodeToken("finish");
      f1 = n0;
   }

   public void accept(tplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(tplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(tplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(tplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

