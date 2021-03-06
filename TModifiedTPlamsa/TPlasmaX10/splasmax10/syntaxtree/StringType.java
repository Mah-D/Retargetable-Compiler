//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "String"
 */
public class StringType implements Node {
   public NodeToken f0;

   public StringType(NodeToken n0) {
      f0 = n0;
   }

   public StringType() {
      f0 = new NodeToken("String");
   }

   public void accept(splasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(splasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(splasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(splasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

