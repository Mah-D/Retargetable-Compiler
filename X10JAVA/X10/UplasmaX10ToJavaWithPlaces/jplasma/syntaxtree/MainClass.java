//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "public"
 * nodeToken1 -> "class"
 * identifier -> Identifier()
 * nodeToken2 -> "{"
 * nodeToken3 -> "public"
 * nodeToken4 -> "static"
 * nodeToken5 -> "void"
 * nodeToken6 -> "main"
 * nodeToken7 -> "("
 * nodeToken8 -> "String"
 * nodeToken9 -> "["
 * nodeToken10 -> "]"
 * identifier1 -> Identifier()
 * nodeToken11 -> ")"
 * nodeToken12 -> "{"
 * identifier2 -> Identifier()
 * nodeToken13 -> "."
 * identifier3 -> Identifier()
 * nodeToken14 -> "("
 * nodeToken15 -> ")"
 * nodeToken16 -> ";"
 * nodeToken17 -> "}"
 * nodeToken18 -> "}"
 */
public class MainClass implements Node {
   public NodeToken nodeToken;
   public NodeToken nodeToken1;
   public Identifier identifier;
   public NodeToken nodeToken2;
   public NodeToken nodeToken3;
   public NodeToken nodeToken4;
   public NodeToken nodeToken5;
   public NodeToken nodeToken6;
   public NodeToken nodeToken7;
   public NodeToken nodeToken8;
   public NodeToken nodeToken9;
   public NodeToken nodeToken10;
   public Identifier identifier1;
   public NodeToken nodeToken11;
   public NodeToken nodeToken12;
   public Identifier identifier2;
   public NodeToken nodeToken13;
   public Identifier identifier3;
   public NodeToken nodeToken14;
   public NodeToken nodeToken15;
   public NodeToken nodeToken16;
   public NodeToken nodeToken17;
   public NodeToken nodeToken18;

   public MainClass(NodeToken n0, NodeToken n1, Identifier n2, NodeToken n3, NodeToken n4, NodeToken n5, NodeToken n6, NodeToken n7, NodeToken n8, NodeToken n9, NodeToken n10, NodeToken n11, Identifier n12, NodeToken n13, NodeToken n14, Identifier n15, NodeToken n16, Identifier n17, NodeToken n18, NodeToken n19, NodeToken n20, NodeToken n21, NodeToken n22) {
      nodeToken = n0;
      nodeToken1 = n1;
      identifier = n2;
      nodeToken2 = n3;
      nodeToken3 = n4;
      nodeToken4 = n5;
      nodeToken5 = n6;
      nodeToken6 = n7;
      nodeToken7 = n8;
      nodeToken8 = n9;
      nodeToken9 = n10;
      nodeToken10 = n11;
      identifier1 = n12;
      nodeToken11 = n13;
      nodeToken12 = n14;
      identifier2 = n15;
      nodeToken13 = n16;
      identifier3 = n17;
      nodeToken14 = n18;
      nodeToken15 = n19;
      nodeToken16 = n20;
      nodeToken17 = n21;
      nodeToken18 = n22;
   }

   public MainClass(Identifier n0, Identifier n1, Identifier n2, Identifier n3) {
      nodeToken = new NodeToken("public");
      nodeToken1 = new NodeToken("class");
      identifier = n0;
      nodeToken2 = new NodeToken("{");
      nodeToken3 = new NodeToken("public");
      nodeToken4 = new NodeToken("static");
      nodeToken5 = new NodeToken("void");
      nodeToken6 = new NodeToken("main");
      nodeToken7 = new NodeToken("(");
      nodeToken8 = new NodeToken("String");
      nodeToken9 = new NodeToken("[");
      nodeToken10 = new NodeToken("]");
      identifier1 = n1;
      nodeToken11 = new NodeToken(")");
      nodeToken12 = new NodeToken("{");
      identifier2 = n2;
      nodeToken13 = new NodeToken(".");
      identifier3 = n3;
      nodeToken14 = new NodeToken("(");
      nodeToken15 = new NodeToken(")");
      nodeToken16 = new NodeToken(";");
      nodeToken17 = new NodeToken("}");
      nodeToken18 = new NodeToken("}");
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

