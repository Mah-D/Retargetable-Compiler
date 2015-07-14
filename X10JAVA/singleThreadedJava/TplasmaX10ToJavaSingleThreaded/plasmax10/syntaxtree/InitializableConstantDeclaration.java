//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> Visibility()
 * f1 -> "final"
 * f2 -> Type()
 * f3 -> Identifier()
 * f4 -> ";"
 */
public class InitializableConstantDeclaration implements Node {
   public Visibility f0;
   public NodeToken f1;
   public Type f2;
   public Identifier f3;
   public NodeToken f4;

   public InitializableConstantDeclaration(Visibility n0, NodeToken n1, Type n2, Identifier n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public InitializableConstantDeclaration(Visibility n0, Type n1, Identifier n2) {
      f0 = n0;
      f1 = new NodeToken("final");
      f2 = n1;
      f3 = n2;
      f4 = new NodeToken(";");
   }

   public void accept(plasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(plasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(plasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(plasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
