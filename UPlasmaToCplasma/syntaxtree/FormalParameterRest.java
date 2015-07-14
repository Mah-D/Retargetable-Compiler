//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> ","
 * finalFormalParameter -> FinalFormalParameter()
 */
public class FormalParameterRest implements Node {
   public NodeToken nodeToken;
   public FinalFormalParameter finalFormalParameter;

   public FormalParameterRest(NodeToken n0, FinalFormalParameter n1) {
      nodeToken = n0;
      finalFormalParameter = n1;
   }

   public FormalParameterRest(FinalFormalParameter n0) {
      nodeToken = new NodeToken(",");
      finalFormalParameter = n0;
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

