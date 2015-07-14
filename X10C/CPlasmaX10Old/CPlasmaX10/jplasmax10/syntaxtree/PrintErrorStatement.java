//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "System.err.println"
 * nodeToken1 -> "("
 * identifier -> Identifier()
 * nodeToken2 -> ")"
 * nodeToken3 -> ";"
 */
public class PrintErrorStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;

   public PrintErrorStatement(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4) {
      nodeToken = n0;
      nodeToken1 = n1;
      identifier = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
   }

   public PrintErrorStatement(Identifier n0) {
      nodeToken = new NodeToken("System.err.println");
      nodeToken1 = new NodeToken("(");
      identifier = n0;
      nodeToken2 = new NodeToken(")");
      nodeToken3 = new NodeToken(";");
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

