//
// Generated by JTB 1.3.2
//

package tplasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> "place.FIRST_PLACE"
 */
public class PlaceFirstPlace implements Node {
   public NodeToken f0;

   public PlaceFirstPlace(NodeToken n0) {
      f0 = n0;
   }

   public PlaceFirstPlace() {
      f0 = new NodeToken("place.FIRST_PLACE");
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

