//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> Type()
 * f1 -> Identifier()
 * f2 -> "="
 * f3 -> Expression()
 * f4 -> ";"
 */
public class UpdatableVariableDeclaration implements Node {
   public Type f0;
   public Identifier f1;
   public NodeToken f2;
   public Expression f3;
   public NodeToken f4;

   public UpdatableVariableDeclaration(Type n0, Identifier n1, NodeToken n2, Expression n3, NodeToken n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public UpdatableVariableDeclaration(Type n0, Identifier n1, Expression n2) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken("=");
      f3 = n2;
      f4 = new NodeToken(";");
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

