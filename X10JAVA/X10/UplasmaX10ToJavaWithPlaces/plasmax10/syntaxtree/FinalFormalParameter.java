//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "final"
 * f1 -> Type()
 * f2 -> Identifier()
 */
public class FinalFormalParameter implements Node {
   public NodeToken f0;
   public Type f1;
   public Identifier f2;

   public FinalFormalParameter(NodeToken n0, Type n1, Identifier n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public FinalFormalParameter(Type n0, Identifier n1) {
      f0 = new NodeToken("final");
      f1 = n0;
      f2 = n1;
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

