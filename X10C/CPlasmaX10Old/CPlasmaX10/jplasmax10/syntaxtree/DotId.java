//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "."
 * nodeToken1 -> "id"
 */
public class DotId implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;

   public DotId(Identifier n0, NodeToken n1, NodeToken n2) {
      identifier = n0;
      nodeToken = n1;
      nodeToken1 = n2;
   }

   public DotId(Identifier n0) {
      identifier = n0;
      nodeToken = new NodeToken(".");
      nodeToken1 = new NodeToken("id");
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

