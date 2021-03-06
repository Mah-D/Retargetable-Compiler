//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "("
 * pointType -> PointType()
 * explodedSpecification -> ExplodedSpecification()
 * nodeToken1 -> ")"
 * block -> Block()
 */
public class ArrayInitializer implements Node {
   public NodeToken nodeToken;
   public PointType pointType;
   public ExplodedSpecification explodedSpecification;
   public NodeToken nodeToken1;
   public Block block;

   public ArrayInitializer(NodeToken n0, PointType n1, ExplodedSpecification n2, NodeToken n3, Block n4) {
      nodeToken = n0;
      pointType = n1;
      explodedSpecification = n2;
      nodeToken1 = n3;
      block = n4;
   }

   public ArrayInitializer(PointType n0, ExplodedSpecification n1, Block n2) {
      nodeToken = new NodeToken("(");
      pointType = n0;
      explodedSpecification = n1;
      nodeToken1 = new NodeToken(")");
      block = n2;
   }

   public void accept(jplasma.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(jplasma.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(jplasma.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(jplasma.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

