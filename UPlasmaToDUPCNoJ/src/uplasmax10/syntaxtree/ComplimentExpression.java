//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "~"
 * identifier -> Identifier()
 */
public class ComplimentExpression implements Node {
   public NodeToken nodeToken;
   public Identifier identifier;

   public ComplimentExpression(NodeToken n0, Identifier n1) {
      nodeToken = n0;
      identifier = n1;
   }

   public ComplimentExpression(Identifier n0) {
      nodeToken = new NodeToken("~");
      identifier = n0;
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

