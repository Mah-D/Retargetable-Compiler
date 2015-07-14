//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "<="
 * identifier1 -> Identifier()
 */
public class LessThanEqualExpression implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public Identifier identifier1;

   public LessThanEqualExpression(Identifier n0, NodeToken n1, Identifier n2) {
      identifier = n0;
      nodeToken = n1;
      identifier1 = n2;
   }

   public LessThanEqualExpression(Identifier n0, Identifier n1) {
      identifier = n0;
      nodeToken = new NodeToken("<=");
      identifier1 = n1;
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

