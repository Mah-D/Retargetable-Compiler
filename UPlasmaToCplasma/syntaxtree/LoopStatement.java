//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "for"
 * nodeToken1 -> "("
 * pointType -> PointType()
 * explodedSpecification -> ExplodedSpecification()
 * nodeToken2 -> ":"
 * identifier -> Identifier()
 * nodeToken3 -> ")"
 * block -> Block()
 */
public class LoopStatement implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public PointType pointType;
   public ExplodedSpecification explodedSpecification;
   public NodeToken nodeToken2;
   public Identifier identifier;
   public NodeToken nodeToken3;
   public Block block;

   public LoopStatement(NodeToken n0, NodeToken n1, PointType n2, ExplodedSpecification n3, NodeToken n4, Identifier n5, NodeToken n6, Block n7) {
      nodeToken = n0;
      nodeToken1 = n1;
      pointType = n2;
      explodedSpecification = n3;
      nodeToken2 = n4;
      identifier = n5;
      nodeToken3 = n6;
      block = n7;
   }

   public LoopStatement(PointType n0, ExplodedSpecification n1, Identifier n2, Block n3) {
      nodeToken = new NodeToken("for");
      nodeToken1 = new NodeToken("(");
      pointType = n0;
      explodedSpecification = n1;
      nodeToken2 = new NodeToken(":");
      identifier = n2;
      nodeToken3 = new NodeToken(")");
      block = n3;
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

