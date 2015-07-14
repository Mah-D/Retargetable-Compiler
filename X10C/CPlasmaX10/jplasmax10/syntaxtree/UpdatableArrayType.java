//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nonArrayType -> NonArrayType()
 * nodeToken -> "["
 * nodeToken1 -> "]"
 */
public class UpdatableArrayType implements Node {
   public NonArrayType nonArrayType;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;

   public UpdatableArrayType(NonArrayType n0, NodeToken n1, NodeToken n2) {
      nonArrayType = n0;
      nodeToken = n1;
      nodeToken1 = n2;
   }

   public UpdatableArrayType(NonArrayType n0) {
      nonArrayType = n0;
      nodeToken = new NodeToken("[");
      nodeToken1 = new NodeToken("]");
   }

   public void accept(jplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

