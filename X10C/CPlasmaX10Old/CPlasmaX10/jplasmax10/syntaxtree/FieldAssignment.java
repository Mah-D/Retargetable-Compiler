//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "."
 * identifier1 -> Identifier()
 * nodeToken1 -> "="
 * nodeToken2 -> "("
 * identifier2 -> Identifier()
 * nodeToken3 -> ")"
 * nodeToken4 -> ";"
 */
public class FieldAssignment implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public Identifier identifier1;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public Identifier identifier2;
   public NodeToken nodeToken3;
   public NodeToken nodeToken4;

   public FieldAssignment(Identifier n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, Identifier n5, NodeToken n6, NodeToken n7) {
      identifier = n0;
      nodeToken = n1;
      identifier1 = n2;
      nodeToken1 = n3;
      nodeToken2 = n4;
      identifier2 = n5;
      nodeToken3 = n6;
      nodeToken4 = n7;
   }

   public FieldAssignment(Identifier n0, Identifier n1, Identifier n2) {
      identifier = n0;
      nodeToken = new NodeToken(".");
      identifier1 = n1;
      nodeToken1 = new NodeToken("=");
      nodeToken2 = new NodeToken("(");
      identifier2 = n2;
      nodeToken3 = new NodeToken(")");
      nodeToken4 = new NodeToken(";");
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

