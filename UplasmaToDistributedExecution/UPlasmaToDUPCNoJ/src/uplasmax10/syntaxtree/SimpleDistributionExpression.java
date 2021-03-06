//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "["
 * nodeToken1 -> "0 :"
 * identifier -> Identifier()
 * nodeToken2 -> "]"
 * nodeToken3 -> "->"
 * nodeToken4 -> "here"
 */
public class SimpleDistributionExpression implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public NodeToken nodeToken4;

   public SimpleDistributionExpression(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, NodeToken n5) {
      nodeToken = n0;
      nodeToken1 = n1;
      identifier = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
      nodeToken4 = n5;
   }

   public SimpleDistributionExpression(Identifier n0) {
      nodeToken = new NodeToken("[");
      nodeToken1 = new NodeToken("0 :");
      identifier = n0;
      nodeToken2 = new NodeToken("]");
      nodeToken3 = new NodeToken("->");
      nodeToken4 = new NodeToken("here");
   }

   public void accept(uplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(uplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(uplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(uplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

