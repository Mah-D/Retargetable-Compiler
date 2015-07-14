package raytracer;

import java.util.Vector;
import x10.lang.*;

public class Scene
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 29
final public java.
      util.
      Vector
      lights;
    
//#line 30
final public java.
      util.
      Vector
      objects;
    
//#line 31
final private raytracer.
      View
      view;
    
    
//#line 33
public Scene(raytracer.
                               View v) {
        
//#line 34
super();
        
//#line 35
lights =
          new java.
            util.
            Vector(
            );
        
//#line 36
objects =
          new java.
            util.
            Vector(
            );
        
//#line 37
view =
          v;
    }
    
    
//#line 40
public void
                  addLight(
                  raytracer.
                    Light l) {
        
//#line 42
/* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                 lights))/* } */.addElement(l);
    }
    
    
//#line 45
public void
                  addObject(
                  raytracer.
                    Primitive object) {
        
//#line 47
/* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                 objects))/* } */.addElement(object);
    }
    
    
//#line 50
public raytracer.
                  View
                  getView(
                  ) {
        
//#line 52
return this.
                             view;
    }
    
    
//#line 55
public raytracer.
                  Light
                  getLight(
                  int number) {
        
//#line 57
return (raytracer.
                             Light)
                             /* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                          lights))/* } */.elementAt(number);
    }
    
    
//#line 60
public raytracer.
                  Primitive
                  getObject(
                  int number) {
        
//#line 62
return (raytracer.
                             Primitive)
                             /* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(objects))/* } */.elementAt(number);
    }
    
    
//#line 65
public int
                  getLights(
                  ) {
        
//#line 67
return /* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                        lights))/* } */.size();
    }
    
    
//#line 70
public int
                  getObjects(
                  ) {
        
//#line 72
return /* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                        objects))/* } */.size();
    }
    
    
//#line 75
public void
                  setObject(
                  raytracer.
                    Primitive object,
                  int pos) {
        
//#line 77
/* template:place-check { */((java.util.Vector) x10.lang.Runtime.hereCheck(this.
                                                                                                 objects))/* } */.setElementAt(object,
                                                                                                                               pos);
    }
}
