//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "place.LAST_PLACE"
 */
public class PlaceLastPlace implements Node {
   public NodeToken nodeToken;

   public PlaceLastPlace(NodeToken n0) {
      nodeToken = n0;
   }

   public PlaceLastPlace() {
      nodeToken = new NodeToken("place.LAST_PLACE");
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

