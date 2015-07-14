//
// Generated by JTB 1.3.2
//

package tplasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "("
 * f1 -> TypeAnnotation()
 * f2 -> ")"
 * f3 -> "("
 * f4 -> Expression()
 * f5 -> ")"
 */
public class TypeAnnotatedExpression implements Node {
   public NodeToken f0;
   public TypeAnnotation f1;
   public NodeToken f2;
   public NodeToken f3;
   public Expression f4;
   public NodeToken f5;

   public TypeAnnotatedExpression(NodeToken n0, TypeAnnotation n1, NodeToken n2, NodeToken n3, Expression n4, NodeToken n5) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
      f3 = n3;
      f4 = n4;
      f5 = n5;
   }

   public TypeAnnotatedExpression(TypeAnnotation n0, Expression n1) {
      f0 = new NodeToken("(");
      f1 = n0;
      f2 = new NodeToken(")");
      f3 = new NodeToken("(");
      f4 = n1;
      f5 = new NodeToken(")");
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

