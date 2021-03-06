//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * Grammar production:
 * f0 -> ArrayAccess()
 *       | DotDistribution()
 *       | DotRegion()
 *       | DotId()
 *       | DotGet()
 *       | DotContainsPoint()
 *       | DotContains()
 *       | DotEquals()
 *       | DotHigh()
 *       | DotLow()
 *       | DotRank()
 *       | DotNext()
 *       | DotPrev()
 *       | DotIsFirst()
 *       | DotIsLast()
 *       | DotCoord()
 *       | DotOrdinalPoint()
 *       | DotOrdinal()
 *       | DotMax()
 *       | DotSum()
 *       | DotSize()
 *       | DotMethodCall()
 *       | DotIdentifier()
 */
public class PrimarySuffix implements Node {
   public NodeChoice f0;

   public PrimarySuffix(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(plasmax10.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(plasmax10.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(plasmax10.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(plasmax10.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

