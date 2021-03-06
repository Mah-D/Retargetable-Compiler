//
// Generated by JTB 1.3.2
//

package jplasmax10.syntaxtree;

/**
 * The interface which all syntax tree classes must implement.
 */
public interface Node extends java.io.Serializable {
   public void accept(jplasmax10.visitor.Visitor v);
   public <R,A> R accept(jplasmax10.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(jplasmax10.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(jplasmax10.visitor.GJVoidVisitor<A> v, A argu);
}

