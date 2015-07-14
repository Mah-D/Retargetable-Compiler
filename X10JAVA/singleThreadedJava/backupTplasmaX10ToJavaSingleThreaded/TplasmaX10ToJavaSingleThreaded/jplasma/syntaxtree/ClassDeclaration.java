//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "class"
 * identifier -> Identifier()
 * nodeToken1 -> "{"
 * nodeListOptional -> ( InitializableConstantDeclaration() )*
 * nodeListOptional1 -> ( UpdatableFieldDeclaration() )*
 * nodeListOptional2 -> ( ConstructorDeclaration() )*
 * nodeListOptional3 -> ( MethodDeclaration() )*
 * nodeToken2 -> "}"
 */
public class ClassDeclaration implements Node {
   public NodeToken nodeToken;
   public Identifier identifier;
   public NodeToken nodeToken1;
   public NodeListOptional nodeListOptional;
   public NodeListOptional nodeListOptional1;
   public NodeListOptional nodeListOptional2;
   public NodeListOptional nodeListOptional3;
   public NodeToken nodeToken2;

   public ClassDeclaration(NodeToken n0, Identifier n1, NodeToken n2, NodeListOptional n3, NodeListOptional n4, NodeListOptional n5, NodeListOptional n6, NodeToken n7) {
      nodeToken = n0;
      identifier = n1;
      nodeToken1 = n2;
      nodeListOptional = n3;
      nodeListOptional1 = n4;
      nodeListOptional2 = n5;
      nodeListOptional3 = n6;
      nodeToken2 = n7;
   }

   public ClassDeclaration(Identifier n0, NodeListOptional n1, NodeListOptional n2, NodeListOptional n3, NodeListOptional n4) {
      nodeToken = new NodeToken("class");
      identifier = n0;
      nodeToken1 = new NodeToken("{");
      nodeListOptional = n1;
      nodeListOptional1 = n2;
      nodeListOptional2 = n3;
      nodeListOptional3 = n4;
      nodeToken2 = new NodeToken("}");
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

