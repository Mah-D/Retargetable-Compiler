//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "="
 * expression -> Expression()
 * nodeToken1 -> ";"
 */
public class Assignment implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public Expression expression;
   public NodeToken nodeToken1;

   public Assignment(Identifier n0, NodeToken n1, Expression n2, NodeToken n3) {
      identifier = n0;
      nodeToken = n1;
      expression = n2;
      nodeToken1 = n3;
   }

   public Assignment(Identifier n0, Expression n1) {
      identifier = n0;
      nodeToken = new NodeToken("=");
      expression = n1;
      nodeToken1 = new NodeToken(";");
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

