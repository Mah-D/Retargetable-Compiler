import x10.lang.*;

public class RatePath
extends x10.
  lang.
  Object
{
    
//#line 2
private x10.
      lang.
      DoubleReferenceArray
      pathValue;
    
//#line 3
private int
      nAcceptedPathValue;
    
//#line 4
private double
      dTime;
    
    
//#line 6
public RatePath() {
        
//#line 6
super();
        
//#line 7
x10.
          lang.
          dist dPath =
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
                2596)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 8
final x10.
          lang.
          DoubleReferenceArray pv =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dPath,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 9
pathValue =
          pv;
        
//#line 10
Data0.
                      fill(
                      pv);
        
//#line 11
Data1.
                      fill(
                      pv);
        
//#line 12
Data2.
                      fill(
                      pv);
        
//#line 13
Data3.
                      fill(
                      pv);
        
//#line 14
Data4.
                      fill(
                      pv);
        
//#line 15
Data5.
                      fill(
                      pv);
        
//#line 16
Data6.
                      fill(
                      pv);
        
//#line 17
Data7.
                      fill(
                      pv);
        
//#line 18
Data8.
                      fill(
                      pv);
        
//#line 19
nAcceptedPathValue =
          dPath.
            region.
            size();
        
//#line 20
dTime =
          ((1.0 /
              365.0));
    }
    
    
//#line 23
public RatePath(final MonteCarloPath mc) {
        
//#line 23
super();
        
//#line 24
dTime =
          /* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mc))/* } */.getDTime();
        
//#line 25
pathValue =
          /* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mc))/* } */.getPathValue();
        
//#line 26
nAcceptedPathValue =
          /* template:place-check { */((MonteCarloPath) x10.lang.Runtime.hereCheck(mc))/* } */.getNTimeSteps();
    }
    
    
//#line 29
public ReturnPath
                  getReturnCompounded(
                  ) {
        
//#line 30
x10.
          lang.
          dist dAPV =
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
                nAcceptedPathValue -
                  1)),
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 31
x10.
          lang.
          DoubleReferenceArray returnPathValue =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dAPV,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 32
/* template:array_set { */(returnPathValue).set(0.0,0)/* } */;
        
//#line 34
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           1,
                                           nAcceptedPathValue -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 35
/* template:array_set { */(returnPathValue).set(java.
                                                                          lang.
                                                                          Math.
                                                                          log(
                                                                          /* template:array_get { */((pathValue).get(i))/* } */ /
                                                                            /* template:array_get { */((pathValue).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                                 lang.
                                                                                                                                                                                                                 point.
                                                                                                                                                                                                                 factory.
                                                                                                                                                                                                                 point(
                                                                                                                                                                                                                 -1))))/* } */),i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 38
ReturnPath rPath =
          new ReturnPath(
          returnPathValue,
          nAcceptedPathValue,
          ReturnPath.
            COMPOUNDED);
        
//#line 42
/* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(rPath))/* } */.setDTime(dTime);
        
//#line 43
/* template:place-check { */((ReturnPath) x10.lang.Runtime.hereCheck(rPath))/* } */.estimatePath();
        
//#line 44
return rPath;
    }
    
    
//#line 47
public double
                  getEndPathValue(
                  ) {
        
//#line 48
return /* template:array_get { */((pathValue).get(pathValue.
                                                                        region.
                                                                        size() -
          1))/* } */;
    }
}
