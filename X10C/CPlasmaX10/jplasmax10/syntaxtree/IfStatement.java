//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "if"
 * nodeToken1 -> "("
 * identifier -> Identifier()
 * nodeToken2 -> ")"
 * block -> Block()
 * nodeOptional -> [ ElseClause() ]
 */
public class IfStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public Block block;
   public NodeOptional nodeOptional;

   public IfStatement(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, Block n4, NodeOptional n5) {
      nodeToken = n0;
      nodeToken1 = n1;
      identifier = n2;
      nodeToken2 = n3;
      block = n4;
      nodeOptional = n5;
   }

   public IfStatement(Identifier n0, Block n1, NodeOptional n2) {
      nodeToken = new NodeToken("if");
      nodeToken1 = new NodeToken("(");
      identifier = n0;
      nodeToken2 = new NodeToken(")");
      block = n1;
      nodeOptional = n2;
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

