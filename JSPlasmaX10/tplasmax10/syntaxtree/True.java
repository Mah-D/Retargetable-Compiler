//
// Generated by JTB 1.3.2
//

package tplasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "true"
 */
public class True implements Node {
   public NodeToken f0;

   public True(NodeToken n0) {
      f0 = n0;
   }

   public True() {
      f0 = new NodeToken("true");
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

