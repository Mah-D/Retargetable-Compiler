//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "void"
 */
public class VoidType implements Node {
   public NodeToken nodeToken;

   public VoidType(NodeToken n0) {
      nodeToken = n0;
   }

   public VoidType() {
      nodeToken = new NodeToken("void");
   }

   public void accept(jplasma.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasma.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasma.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasma.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

