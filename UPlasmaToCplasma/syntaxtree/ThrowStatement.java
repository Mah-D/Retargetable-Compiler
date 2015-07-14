//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "throw"
 * nodeToken1 -> "new"
 * nodeToken2 -> "RuntimeException"
 * nodeToken3 -> "("
 * identifier -> Identifier()
 * nodeToken4 -> ")"
 * nodeToken5 -> ";"
 */
public class ThrowStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public Identifier identifier;
   public NodeToken nodeToken4;
   public NodeToken nodeToken5;

   public ThrowStatement(NodeToken n0, NodeToken n1, NodeToken n2, NodeToken n3, Identifier n4, NodeToken n5, NodeToken n6) {
      nodeToken = n0;
      nodeToken1 = n1;
      nodeToken2 = n2;
      nodeToken3 = n3;
      identifier = n4;
      nodeToken4 = n5;
      nodeToken5 = n6;
   }

   public ThrowStatement(Identifier n0) {
      nodeToken = new NodeToken("throw");
      nodeToken1 = new NodeToken("new");
      nodeToken2 = new NodeToken("RuntimeException");
      nodeToken3 = new NodeToken("(");
      identifier = n0;
      nodeToken4 = new NodeToken(")");
      nodeToken5 = new NodeToken(";");
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

