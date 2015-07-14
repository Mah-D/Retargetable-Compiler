//
// Generated by JTB 1.3.2
//

package uplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "&&"
 * identifier1 -> Identifier()
 */
public class ConditionalAndExpression implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public Identifier identifier1;

   public ConditionalAndExpression(Identifier n0, NodeToken n1, Identifier n2) {
      identifier = n0;
      nodeToken = n1;
      identifier1 = n2;
   }

   public ConditionalAndExpression(Identifier n0, Identifier n1) {
      identifier = n0;
      nodeToken = new NodeToken("&&");
      identifier1 = n1;
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

