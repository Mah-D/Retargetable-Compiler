//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeChoice -> UpdatableArrayType()
 *       | ValueArrayType()
 *       | NonArrayType()
 */
public class Type implements Node {
   public NodeChoice nodeChoice;

   public Type(NodeChoice n0) {
      nodeChoice = n0;
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
