//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeListOptional -> ( IdentifierRest() )*
 */
public class IdentifierList implements Node {
   public Identifier identifier;
   public NodeListOptional nodeListOptional;

   public IdentifierList(Identifier n0, NodeListOptional n1) {
      identifier = n0;
      nodeListOptional = n1;
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

