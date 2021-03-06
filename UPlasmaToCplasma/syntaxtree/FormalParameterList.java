//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * finalFormalParameter -> FinalFormalParameter()
 * nodeListOptional -> ( FormalParameterRest() )*
 */
public class FormalParameterList implements Node {
   public FinalFormalParameter finalFormalParameter;
   public NodeListOptional nodeListOptional;

   public FormalParameterList(FinalFormalParameter n0, NodeListOptional n1) {
      finalFormalParameter = n0;
      nodeListOptional = n1;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

