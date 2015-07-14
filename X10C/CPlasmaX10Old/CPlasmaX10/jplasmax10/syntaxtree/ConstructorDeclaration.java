//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "public"
 * identifier -> Identifier()
 * nodeToken1 -> "("
 * nodeOptional -> ( FormalParameterList() )?
 * nodeToken2 -> ")"
 * block -> Block()
 */
public class ConstructorDeclaration implements Node {
   public NodeToken nodeToken;
   public Identifier identifier;
   public NodeToken nodeToken1;
   public NodeOptional nodeOptional;
   public NodeToken nodeToken2;
   public Block block;

   public ConstructorDeclaration(NodeToken n0, Identifier n1, NodeToken n2, NodeOptional n3, NodeToken n4, Block n5) {
      nodeToken = n0;
      identifier = n1;
      nodeToken1 = n2;
      nodeOptional = n3;
      nodeToken2 = n4;
      block = n5;
   }

   public ConstructorDeclaration(Identifier n0, NodeOptional n1, Block n2) {
      nodeToken = new NodeToken("public");
      identifier = n0;
      nodeToken1 = new NodeToken("(");
      nodeOptional = n1;
      nodeToken2 = new NodeToken(")");
      block = n2;
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
