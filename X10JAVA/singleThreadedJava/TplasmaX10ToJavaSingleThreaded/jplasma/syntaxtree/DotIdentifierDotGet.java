//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * identifier -> Identifier()
 * nodeToken -> "."
 * identifier1 -> Identifier()
 * nodeToken1 -> "."
 * nodeToken2 -> "get"
 * nodeToken3 -> "("
 * identifierList -> IdentifierList()
 * nodeToken4 -> ")"
 */
public class DotIdentifierDotGet implements Node {
   public Identifier identifier;
   public NodeToken nodeToken;
   public Identifier identifier1;
   public NodeToken nodeToken1;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public IdentifierList identifierList;
   public NodeToken nodeToken4;

   public DotIdentifierDotGet(Identifier n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, NodeToken n5, IdentifierList n6, NodeToken n7) {
      identifier = n0;
      nodeToken = n1;
      identifier1 = n2;
      nodeToken1 = n3;
      nodeToken2 = n4;
      nodeToken3 = n5;
      identifierList = n6;
      nodeToken4 = n7;
   }

   public DotIdentifierDotGet(Identifier n0, Identifier n1, IdentifierList n2) {
      identifier = n0;
      nodeToken = new NodeToken(".");
      identifier1 = n1;
      nodeToken1 = new NodeToken(".");
      nodeToken2 = new NodeToken("get");
      nodeToken3 = new NodeToken("(");
      identifierList = n2;
      nodeToken4 = new NodeToken(")");
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

