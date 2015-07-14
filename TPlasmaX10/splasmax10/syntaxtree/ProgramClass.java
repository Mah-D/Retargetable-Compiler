//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "class"
 * f1 -> Identifier()
 * f2 -> "{"
 * f3 -> ( ConstantDeclaration() )*
 * f4 -> ( MethodDeclaration() )*
 * f5 -> "}"
 */
public class ProgramClass implements Node {
   public NodeToken f0;
   public Identifier f1;
   public NodeToken f2;
   public NodeListOptional f3;
   public NodeListOptional f4;
   public NodeToken f5;

   public ProgramClass(NodeToken n0, Identifier n1, NodeToken n2, NodeListOptional n3, NodeListOptional n4, NodeToken n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
   }

   public ProgramClass(Identifier n0, NodeListOptional n1, NodeListOptional n2) {
      f0 = new NodeToken("class");
      f1 = n0;
      f2 = new NodeToken("{");
      f3 = n1;
      f4 = n2;
      f5 = new NodeToken("}");
   }

   public void accept(splasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(splasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(splasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(splasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

