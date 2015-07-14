//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "case"
 * identifier -> Identifier()
 */
public class Case implements Node {
   public NodeToken nodeToken;
   public Identifier identifier;

   public Case(NodeToken n0, Identifier n1) {
      nodeToken = n0;
      identifier = n1;
   }

   public Case(Identifier n0) {
      nodeToken = new NodeToken("case");
      identifier = n0;
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

