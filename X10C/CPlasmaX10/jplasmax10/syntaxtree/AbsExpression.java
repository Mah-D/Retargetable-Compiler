//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "Math"
 * nodeToken1 -> "."
 * nodeToken2 -> "abs"
 * nodeToken3 -> "("
 * identifier -> Identifier()
 * nodeToken4 -> ")"
 */
public class AbsExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public Identifier identifier;
   public NodeToken nodeToken4;

   public AbsExpression(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, Identifier n4, NodeToken n5) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      nodeToken3 = n3;
      identifier = n4;
      nodeToken4 = n5;
   }

   public AbsExpression(Identifier n0) {
      nodeToken = new NodeToken("Math");
      nodeToken1 = new NodeToken(".");
      nodeToken2 = new NodeToken("abs");
      nodeToken3 = new NodeToken("(");
      identifier = n0;
      nodeToken4 = new NodeToken(")");
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

