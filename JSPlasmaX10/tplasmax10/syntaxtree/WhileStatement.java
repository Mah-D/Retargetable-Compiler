//
// Generated by JTB 1.3.2
//

package tplasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "while"
 * f1 -> "("
 * f2 -> Identifier()
 * f3 -> ")"
 * f4 -> Block()
 */
public class WhileStatement implements Node {
   public NodeToken f0;
   public NodeToken f1;
   public Identifier f2;
   public NodeToken f3;
   public Block f4;

   public WhileStatement(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, Block n4) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
   }

   public WhileStatement(Identifier n0, Block n1) {
      f0 = new NodeToken("while");
      f1 = new NodeToken("(");
      f2 = n0;
      f3 = new NodeToken(")");
      f4 = n1;
   }

   public void accept(tplasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(tplasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(tplasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(tplasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

