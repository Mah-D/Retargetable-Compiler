//
// Generated by JTB 1.3.2
//

package splasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> BooleanType()
 *       | ByteType()
 *       | ShortType()
 *       | IntegerType()
 *       | LongType()
 *       | DoubleType()
 *       | StringType()
 *       | PlaceType()
 *       | DistType()
 *       | RegionType()
 *       | PointType()
 *       | ClassNameType()
 */
public class NonArrayType implements Node {
   public NodeChoice f0;

   public NonArrayType(NodeChoice n0) {
      f0 = n0;
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

