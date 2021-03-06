//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "[0]"
 */
public class PointAccess implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;

   public PointAccess(Identifier n0, NodeToken n1) {
      identifier = n0;
      nodeToken = n1;
   }

   public PointAccess(Identifier n0) {
      identifier = n0;
      nodeToken = new NodeToken("[0]");
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

