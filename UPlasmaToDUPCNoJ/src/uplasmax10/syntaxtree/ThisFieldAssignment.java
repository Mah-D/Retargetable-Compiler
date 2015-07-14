//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "this"
 * nodeToken1 -> "."
 * identifier -> Identifier()
 * nodeToken2 -> "="
 * nodeToken3 -> "("
 * identifier1 -> Identifier()
 * nodeToken4 -> ")"
 * nodeToken5 -> ";"
 */
public class ThisFieldAssignment implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public Identifier identifier1;
   public NodeToken nodeToken4;
   public NodeToken nodeToken5;

   public ThisFieldAssignment(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, Identifier n5, NodeToken n6, NodeToken n7) {
      nodeToken = n0;
      nodeToken1 = n1;
      identifier = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
      identifier1 = n5;
      nodeToken4 = n6;
      nodeToken5 = n7;
   }

   public ThisFieldAssignment(Identifier n0, Identifier n1) {
      nodeToken = new NodeToken("this");
      nodeToken1 = new NodeToken(".");
      identifier = n0;
      nodeToken2 = new NodeToken("=");
      nodeToken3 = new NodeToken("(");
      identifier1 = n1;
      nodeToken4 = new NodeToken(")");
      nodeToken5 = new NodeToken(";");
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

