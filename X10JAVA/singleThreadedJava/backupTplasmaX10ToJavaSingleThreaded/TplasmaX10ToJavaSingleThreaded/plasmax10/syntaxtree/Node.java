//
// Generated by JTB 1.3.2
//

package plasmax10.syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(plasmax10.visitor.Visitor v);
   public <R,A> R accept(plasmax10.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(plasmax10.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(plasmax10.visitor.GJVoidVisitor<A> v, A argu);
}

