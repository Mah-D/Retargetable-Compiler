//
// Generated by JTB 1.3.2
//

package jplasma.syntaxtree;

/**
 * Grammar production:
 * mainClass -> MainClass()
 * programClass -> ProgramClass()
 * nodeListOptional -> ( TopLevelDeclaration() )*
 * nodeToken -> <EOF>
 */
public class File implements Node {
   public MainClass mainClass;
   public ProgramClass programClass;
   public NodeListOptional nodeListOptional;
   public NodeToken nodeToken;

   public File(MainClass n0, ProgramClass n1, NodeListOptional n2, NodeToken n3) {
      mainClass = n0;
      programClass = n1;
      nodeListOptional = n2;
      nodeToken = n3;
   }

   public File(MainClass n0, ProgramClass n1, NodeListOptional n2) {
      mainClass = n0;
      programClass = n1;
      nodeListOptional = n2;
      nodeToken = new NodeToken("");
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

