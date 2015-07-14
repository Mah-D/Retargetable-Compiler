//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> Identifier()
 * f1 -> "."
 * f2 -> Identifier()
 * f3 -> "("
 * f4 -> "this"
 * f5 -> ( IdentifierRest() )*
 * f6 -> ")"
 */
public class MethodCallInConstructor implements Node {
   public Identifier f0;
   public NodeToken f1;
   public Identifier f2;
   public NodeToken f3;
   public NodeToken f4;
   public NodeListOptional f5;
   public NodeToken f6;

   public MethodCallInConstructor(Identifier n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, NodeListOptional n5, NodeToken n6) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
      f6 = n6;
   }

   public MethodCallInConstructor(Identifier n0, Identifier n1, NodeListOptional n2) {
      f0 = n0;
      f1 = new NodeToken(".");
      f2 = n1;
      f3 = new NodeToken("(");
      f4 = new NodeToken("this");
      f5 = n2;
      f6 = new NodeToken(")");
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

