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
public Scene(final View v) {
        
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
          getLightArray(
            d1);
        
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
          getSphereArray(
            d2);
        
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
    
    
//#line 49
public x10.
                  lang.
                  GenericReferenceArray
                  getLightArray(
                  final x10.
                    lang.
                    dist d) {
        
//#line 50
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 53
public x10.
                  lang.
                  GenericReferenceArray
                  getSphereArray(
                  final x10.
                    lang.
                    dist d) {
        
//#line 54
return /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(d,(x10.array.Operator.Pointwise)null,true,true,true)/* } */;
    }
    
    
//#line 60
public void
                  addLight(
                  final Light l) {
        
//#line 63
if (lightCount >
                          maxLights -
                          1) {
            
//#line 65
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxLights +
              " lights allowed");
        }
        
//#line 67
/* template:array_set { */(this.
                                                 lights).set(l,lightCount)/* } */;
        
//#line 68
lightCount =
          lightCount +
            1;
    }
    
    
//#line 73
public void
                  addObject(
                  final Sphere object) {
        
//#line 76
if (objectCount >
                          maxObjects -
                          1) {
            
//#line 78
throw new java.
              lang.
              RuntimeException(
              "Only " +
              maxObjects +
              " objects allowed");
        }
        
//#line 80
/* template:array_set { */(this.
                                                 objects).set(object,objectCount)/* } */;
        
//#line 81
objectCount =
          objectCount +
            1;
    }
    
    
//#line 84
public View
                  getView(
                  ) {
        
//#line 86
return this.
                             view;
    }
    
    
//#line 90
public Light
                  getLight(
                  final x10.
                    lang.
                    point number) {
        
//#line 92
return /* template:parametric { */((Light)(/* template:array_get { */((this.
                                                                                             lights).get(number))/* } */))/* } */;
    }
    
    
//#line 96
public Sphere
                  getObject(
                  final x10.
                    lang.
                    point number) {
        
//#line 98
return /* template:parametric { */((Sphere)(/* template:array_get { */((this.
                                                                                              objects).get(number))/* } */))/* } */;
    }
    
    
//#line 102
public int
                   getLights(
                   ) {
        
//#line 104
return this.
                              lightCount;
    }
    
    
//#line 108
public int
                   getObjects(
                   ) {
        
//#line 110
return this.
                              objectCount;
    }
}
