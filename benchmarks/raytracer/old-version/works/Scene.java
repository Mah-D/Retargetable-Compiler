import x10.lang.*;

public class Scene
extends x10.
  lang.
  Object
{
    
//#line 29
final public static int
      maxObjects =
      64;
    
//#line 30
final public static int
      maxLights =
      5;
    
//#line 31
final public x10.
      lang.
      GenericReferenceArray
      lights;
    
//#line 32
final public x10.
      lang.
      GenericReferenceArray
      objects;
    
//#line 33
final private View
      view;
    
//#line 34
private int
      lightCount;
    
//#line 35
private int
      objectCount;
    
    
//#line 37
public Scene(View v) {
        
//#line 38
super();
        
//#line 40
x10.
          lang.
          dist d1 =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                maxLights -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 41
lights =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d1,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 42
x10.
          lang.
          dist d2 =
          x10.
            lang.
            dist.
            factory.
            constant(
            x10.
              lang.
              region.
              factory.
              region(
              x10.
                lang.
                region.
                factory.
                region(
                0,
                maxObjects -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 43
objects =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d2,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 44
view =
          v;
        
//#line 45
lightCount =
          0;
        
//#line 46
objectCount =
          0;
    }
    
    
//#line 51
public void
                  addLight(
                  Light l) {
        
//#line 54
if (lightCount >
                          maxLights -
                          1) {
            
//#line 56
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxLights +
              " lights allowed");
        }
        
//#line 58
/* template:array_set { */(this.
                                                 lights).set(l,lightCount++)/* } */;
    }
    
    
//#line 64
public void
                  addObject(
                  Sphere object) {
        
//#line 67
if (objectCount >
                          maxObjects -
                          1) {
            
//#line 69
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxObjects +
              " objects allowed");
        }
        
//#line 71
/* template:array_set { */(this.
                                                 objects).set(object,objectCount++)/* } */;
    }
    
    
//#line 75
public View
                  getView(
                  ) {
        
//#line 77
return this.
                             view;
    }
    
    
//#line 81
public Light
                  getLight(
                  int number) {
        
//#line 83
return /* template:parametric { */((Light)(/* template:array_get { */((this.
                                                                                             lights).get(number))/* } */))/* } */;
    }
    
    
//#line 87
public Sphere
                  getObject(
                  int number) {
        
//#line 89
return /* template:parametric { */((Sphere)(/* template:array_get { */((this.
                                                                                              objects).get(number))/* } */))/* } */;
    }
    
    
//#line 93
public int
                  getLights(
                  ) {
        
//#line 95
return this.
                             lightCount;
    }
    
    
//#line 99
public int
                  getObjects(
                  ) {
        
//#line 101
return this.
                              objectCount;
    }
}
