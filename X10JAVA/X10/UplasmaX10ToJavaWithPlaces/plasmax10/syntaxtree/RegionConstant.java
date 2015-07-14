//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "["
 * f1 -> ColonExpression()
 * f2 -> ( ColonRest() )*
 * f3 -> "]"
 */
public class RegionConstant implements Node {
   public NodeToken f0;
   public ColonExpression f1;
   public NodeListOptional f2;
   public NodeToken f3;

   public RegionConstant(NodeToken n0, ColonExpression n1, NodeListOptional n2, NodeToken n3) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
   }

   public RegionConstant(ColonExpression n0, NodeListOptional n1) {
      f0 = new NodeToken("[");
      f1 = n0;
      f2 = n1;
      f3 = new NodeToken("]");
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

