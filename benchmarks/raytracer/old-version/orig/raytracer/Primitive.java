package raytracer;

import x10.lang.*;

abstract public class Primitive extends x10.lang.Object
  implements x10.lang.ValueType
{
    
//#line 27
final public raytracer.Surface surf;
    
    
//#line 29
public Primitive() {
        
//#line 29
super();
        
//#line 30
surf = new raytracer.Surface();
    }
    
    
//#line 32
public Primitive(/*nullable<*/raytracer.Surface/*>*/ s) {
        
//#line 32
super();
        
//#line 33
surf =
          ((((s == null))
              ? new raytracer.Surface(
              )
              : (raytracer.Surface)
                  x10.runtime.RuntimeCastChecker.checkCastToNonNullable(
                    s, raytracer.Surface.class)));
    }
    
    
//#line 36
abstract public raytracer.Vec normal(raytracer.Vec pnt);
    
    
//#line 37
abstract public /*nullable<*/raytracer.Isect/*>*/ intersect(
                  raytracer.Ray ry);
    
    
//#line 38
abstract public java.lang.String toString();
    
    
//#line 39
abstract public raytracer.Vec getCenter();
}
