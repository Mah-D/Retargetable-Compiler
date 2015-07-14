//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "."
 * nodeToken1 -> "region"
 * nodeToken2 -> "."
 * nodeToken3 -> "size"
 * nodeToken4 -> "("
 * nodeToken5 -> ")"
 */
public class DotRegionDotSize implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public NodeToken nodeToken4;
   public NodeToken nodeToken5;

   public DotRegionDotSize(Identifier n0, NodeToken n1, NodeToken n2, NodeToken n3, NodeToken n4, NodeToken n5, NodeToken n6) {
      identifier = n0;
      nodeToken = n1;
      nodeToken1 = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
      nodeToken4 = n5;
      nodeToken5 = n6;
   }

   public DotRegionDotSize(Identifier n0) {
      identifier = n0;
      nodeToken = new NodeToken(".");
      nodeToken1 = new NodeToken("region");
      nodeToken2 = new NodeToken(".");
      nodeToken3 = new NodeToken("size");
      nodeToken4 = new NodeToken("(");
      nodeToken5 = new NodeToken(")");
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
