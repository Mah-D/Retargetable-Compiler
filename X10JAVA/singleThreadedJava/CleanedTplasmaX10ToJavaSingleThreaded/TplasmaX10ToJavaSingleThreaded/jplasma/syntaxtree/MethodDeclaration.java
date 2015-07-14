//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "public"
 * returnType -> ReturnType()
 * identifier -> Identifier()
 * nodeToken1 -> "("
 * nodeOptional -> ( FormalParameterList() )?
 * nodeToken2 -> ")"
 * block -> Block()
 */
public class MethodDeclaration implements Node {
   public NodeToken nodeToken;
   public ReturnType returnType;
   public Identifier identifier;
   public NodeToken nodeToken1;
   public NodeOptional nodeOptional;
   public NodeToken nodeToken2;
   public Block block;

   public MethodDeclaration(NodeToken n0, ReturnType n1, Identifier n2, NodeToken n3, NodeOptional n4, NodeToken n5, Block n6) {
      nodeToken = n0;
      returnType = n1;
      identifier = n2;
      nodeToken1 = n3;
      nodeOptional = n4;
      nodeToken2 = n5;
      block = n6;
   }

   public MethodDeclaration(ReturnType n0, Identifier n1, NodeOptional n2, Block n3) {
      nodeToken = new NodeToken("public");
      returnType = n0;
      identifier = n1;
      nodeToken1 = new NodeToken("(");
      nodeOptional = n2;
      nodeToken2 = new NodeToken(")");
      block = n3;
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

