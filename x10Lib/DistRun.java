import x10.lang.*;

public class DistRun
extends x10.
  lang.
  Object
{
    
//#line 2
final public static x10.
      lang.
      region
      R =
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
          x10.
            lang.
            place.
            MAX_PLACES -
            1));
    
    
//#line 3
/* template:Main { */
    public static class Main extends x10.runtime.Activity {
    	private final String[] form;
    	public Main(String[] args) {
    		super("Main Activity");
    		this.form = args;
    	}
    	public void runX10Task() {
    		main(form);
    	}
    }
    
    // the original app-main method
    public static void main(java.
      lang.
      String[] args) {
    	if (x10.lang.Runtime.runtime == null) {
    		System.err.println("Please use the 'x10' script to invoke X10 programs, or see the generated");
    		System.err.println("Java code for alternate invocation instructions.");
    		System.exit(128);
    	}
    {
        
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 9
public static x10.
                 lang.
                 GenericReferenceArray
                 createDist(
                 final x10.
                   lang.
                   region reg,
                 final x10.
                   lang.
                   place pl) {
        
//#line 10
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(reg.
                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
               lang.
               point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                 
//#line 10
return pl;
             } }
             }/* } */,true,false,true)/* } */);
        
//#line 11
return placeArray;
    }
    
    
//#line 15
public static x10.
                  lang.
                  GenericReferenceArray
                  extendDist(
                  final Dist d1,
                  final int x,
                  final int y,
                  final x10.
                    lang.
                    place pl) {
        
//#line 16
final x10.
          lang.
          GenericReferenceArray d1Array =
          d1.
            placeArray;
        
//#line 17
final x10.
          lang.
          region reg =
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
              y));
        
//#line 18
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            reg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 19
final x10.
          lang.
          GenericReferenceArray temp =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dis,(x10.array.Operator.Pointwise)null,true,true,true)/* } */);
        
//#line 20
/* template:forloop { */
        for (java.util.Iterator p__ = (d1Array.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 22
/* template:array_set { */(temp).set(/* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((d1Array).get(p))/* } */))/* } */,p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 24
int tail =
          x;
        
//#line 25
while (tail <=
                             y) {
            
//#line 27
/* template:array_set { */(temp).set(pl,tail)/* } */;
            
//#line 28
tail =
              tail +
                1;
        }
        
//#line 30
final x10.
          lang.
          GenericReferenceArray placeArray =
          (x10.
            lang.
            GenericReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(reg.
                                                                                                                          toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
               lang.
               point p/* } */, x10.compilergenerated.Parameter1 dummy) { {
                 
//#line 30
return /* template:parametric { */((x10.
                   lang.
                   place)(/* template:array_get { */((temp).get(p))/* } */))/* } */;
             } }
             }/* } */,true,false,true)/* } */);
        
//#line 31
return placeArray;
    }
    
    
//#line 35
public static x10.
                  lang.
                  place
                  getPlaceFromDist(
                  final Dist d,
                  final int index) {
        
//#line 36
final x10.
          lang.
          GenericReferenceArray placeArray =
          d.
            placeArray;
        
//#line 37
final x10.
          lang.
          place retPlace =
          /* template:parametric { */((x10.
          lang.
          place)(/* template:array_get { */((placeArray).get(index))/* } */))/* } */;
        
//#line 38
return retPlace;
    }
    
    
//#line 41
public static x10.
                  lang.
                  intArray
                  getCounts(
                  final x10.
                    lang.
                    GenericReferenceArray placeArray) {
        
//#line 42
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            R,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 43
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 44
/* template:forloop { */
        for (java.util.Iterator p__ = (tempCounts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 45
/* template:array_set { */(tempCounts).set(0,p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 47
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 48
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
            
//#line 49
final int index =
              pl.
                id;
            
//#line 50
final int oldVal =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 51
/* template:array_set { */(tempCounts).set(oldVal +
              1,index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 53
final x10.
          lang.
          intArray counts =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(R.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point p/* } */, int dummy) { {
                 
//#line 53
return /* template:array_get { */((tempCounts).get(p))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 54
return counts;
    }
    
    
//#line 57
public static x10.
                  lang.
                  intArray
                  getRunningSum(
                  final x10.
                    lang.
                    GenericReferenceArray placeArray) {
        
//#line 58
final x10.
          lang.
          dist dis =
          x10.
            lang.
            dist.
            factory.
            constant(
            R,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 59
final x10.
          lang.
          IntReferenceArray tempCounts =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dis,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 61
int count =
          0;
        
//#line 62
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 63
count =
              count +
                1;
        }/* } */
        }
        /* } */
        
        
//#line 65
count =
          count -
            1;
        
//#line 67
final x10.
          lang.
          region runReg =
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
              count));
        
//#line 68
final x10.
          lang.
          dist runDist =
          x10.
            lang.
            dist.
            factory.
            constant(
            runReg,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 69
final x10.
          lang.
          IntReferenceArray tempRunSum =
          (x10.
            lang.
            IntReferenceArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runDist,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 71
/* template:forloop { */
        for (java.util.Iterator p__ = (tempCounts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 72
/* template:array_set { */(tempCounts).set(0,p)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 75
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 76
final x10.
              lang.
              place pl =
              /* template:parametric { */((x10.
              lang.
              place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */;
            
//#line 77
final int index =
              pl.
                id;
            
//#line 78
final int temp =
              /* template:array_get { */((tempCounts).get(index))/* } */;
            
//#line 79
/* template:array_set { */(tempRunSum).set(temp,p)/* } */;
            
//#line 80
/* template:array_set { */(tempCounts).set(temp +
              1,index)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 83
final x10.
          lang.
          intArray runSum =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(runReg.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point p/* } */, int dummy) { {
                 
//#line 83
return /* template:array_get { */((tempRunSum).get(p))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 84
return runSum;
    }
    
    
//#line 87
public static int
                  getLocalIndex(
                  final Dist myDist,
                  final int index) {
        
//#line 88
return /* template:array_get { */((myDist.
                                                         runningSum).get(index))/* } */;
    }
    
    
//#line 1
public DistRun() {
        
//#line 1
super();
    }
}

class Dist
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 93
final public x10.
      lang.
      GenericReferenceArray
      placeArray;
    
//#line 94
final public x10.
      lang.
      intArray
      counts;
    
//#line 95
final public x10.
      lang.
      intArray
      runningSum;
    
    
//#line 98
public Dist(final x10.
                              lang.
                              region reg,
                            final x10.
                              lang.
                              place pl) {
        
//#line 98
super();
        
//#line 99
placeArray =
          DistRun.
            createDist(
            reg,
            pl);
        
//#line 100
counts =
          DistRun.
            getCounts(
            placeArray);
        
//#line 101
runningSum =
          (x10.
            lang.
            intArray)
            DistRun.
              getRunningSum(
              placeArray);
    }
    
    
//#line 106
public Dist(final Dist d1,
                             final int x,
                             final int y,
                             final x10.
                               lang.
                               place pl) {
        
//#line 106
super();
        
//#line 107
placeArray =
          DistRun.
            extendDist(
            d1,
            x,
            y,
            pl);
        
//#line 108
counts =
          DistRun.
            getCounts(
            placeArray);
        
//#line 109
runningSum =
          (x10.
            lang.
            intArray)
            DistRun.
              getRunningSum(
              placeArray);
    }
    
    
//#line 112
public void
                   printThis(
                   ) {
        
//#line 114
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("Print Contents of Dist");
        
//#line 115
/* template:forloop { */
        for (java.util.Iterator p__ = (placeArray.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 116
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("p:placeArray = " +
                                                                                                                              p +
                                                                                                                              " " +
                                                                                                                              " : " +
                                                                                                                              /* template:parametric { */((x10.
                                                                                                                                lang.
                                                                                                                                place)(/* template:array_get { */((placeArray).get(p))/* } */))/* } */);
        }/* } */
        }
        /* } */
        
        
//#line 119
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("============================================");
        
//#line 120
/* template:forloop { */
        for (java.util.Iterator p__ = (counts.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 121
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("p:counts = " +
                                                                                                                              p +
                                                                                                                              " " +
                                                                                                                              " : " +
                                                                                                                              /* template:array_get { */((counts).get(p))/* } */);
        }/* } */
        }
        /* } */
        
        
//#line 123
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                     lang.
                                                                                                     System.
                                                                                                     out))/* } */.println("============================================");
        
//#line 124
/* template:forloop { */
        for (java.util.Iterator p__ = (runningSum.
                                         distribution.
                                         region).iterator(); p__.hasNext(); ) {
        	final  x10.
          lang.
          point p = (x10.
          lang.
          point) p__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 125
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                         lang.
                                                                                                         System.
                                                                                                         out))/* } */.println("p:runningSum = " +
                                                                                                                              p +
                                                                                                                              " : " +
                                                                                                                              /* template:array_get { */((runningSum).get(p))/* } */);
        }/* } */
        }
        /* } */
        
    }
}
