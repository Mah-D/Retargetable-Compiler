//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "."
 * nodeToken1 -> "prev"
 * nodeToken2 -> "("
 * nodeToken3 -> ")"
 */
public class DotPrev implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;

   public DotPrev(Identifier n0, NodeToken n1, NodeToken n2, NodeToken n3, NodeToken n4) {
      identifier = n0;
      nodeToken = n1;
      nodeToken1 = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
   }

   public DotPrev(Identifier n0) {
      identifier = n0;
      nodeToken = new NodeToken(".");
      nodeToken1 = new NodeToken("prev");
      nodeToken2 = new NodeToken("(");
      nodeToken3 = new NodeToken(")");
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

