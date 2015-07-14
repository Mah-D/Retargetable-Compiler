//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "new"
 * nonArrayType -> NonArrayType()
 * nodeToken1 -> "["
 * identifier -> Identifier()
 * nodeToken2 -> "]"
 * nodeOptional -> [ ArrayInitializer() ]
 */
public class NewUpdatableArray implements Node {
   public NodeToken nodeToken;
   public NonArrayType nonArrayType;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public NodeOptional nodeOptional;

   public NewUpdatableArray(NodeToken n0, NonArrayType n1, NodeToken n2, Identifier n3, NodeToken n4, NodeOptional n5) {
      nodeToken = n0;
      nonArrayType = n1;
      nodeToken1 = n2;
      identifier = n3;
      nodeToken2 = n4;
      nodeOptional = n5;
   }

   public NewUpdatableArray(NonArrayType n0, Identifier n1, NodeOptional n2) {
      nodeToken = new NodeToken("new");
      nonArrayType = n0;
      nodeToken1 = new NodeToken("[");
      identifier = n1;
      nodeToken2 = new NodeToken("]");
      nodeOptional = n2;
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

