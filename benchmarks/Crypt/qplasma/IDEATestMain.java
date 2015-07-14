import x10.lang.*;

public class IDEATestMain
extends x10.
  lang.
  Object
{
    
    
//#line 2
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
        {
            
//#line 4
Timer tmr =
              new Timer(
              );
            
//#line 5
int count =
              0;
            
//#line 6
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.start(count);
            
//#line 7
/* template:place-check { */((IDEATest) x10.lang.Runtime.hereCheck(new IDEATest(
              )))/* } */.run();
            
//#line 8
/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.stop(count);
            
//#line 9
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                       lang.
                                                                                                       System.
                                                                                                       out))/* } */.println("Wall-clock time for crypt: " +
                                                                                                                            /* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(tmr))/* } */.readTimer(count) +
                                                                                                                            " secs");
        }
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public IDEATestMain() {
        
//#line 1
super();
    }
}

class IDEATest
extends x10.
  lang.
  Object
{
    
//#line 15
final public static int
      array_rows =
      32000;
    
//#line 16
public x10.
      lang.
      ByteReferenceArray
      plain1;
    
//#line 17
public x10.
      lang.
      ByteReferenceArray
      crypt1;
    
//#line 18
public x10.
      lang.
      ByteReferenceArray
      plain2;
    
//#line 19
public x10.
      lang.
      intArray
      userkey;
    
//#line 20
public x10.
      lang.
      intArray
      ZR;
    
//#line 21
public x10.
      lang.
      intArray
      DKR;
    
    
//#line 22
public IDEATest() {
        
//#line 22
super();
        
//#line 23
buildTestData();
        
//#line 24
final x10.
          lang.
          dist D =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 24
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 24
return (((((((x10.
                                             lang.
                                             dist)
                                             x10_generated_objToCast)).
                                           rank() ==
                                           1)))
                                        ? (x10.
                                            lang.
                                            dist)
                                            x10_generated_objToCast
                                        : (x10.
                                            lang.
                                            dist)
                                            x10.
                                              runtime.
                                              RuntimeCastChecker.
                                              throwClassCastException(
                                              (x10.
                                                lang.
                                                dist)
                                                x10_generated_objToCast,
                                              "Constraint is not meet"));
              }
          }.
            checkCast(
            x10.
              lang.
              dist.
              factory.
              block(
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
                  array_rows -
                    1))));
        
//#line 25
plain1 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public byte apply(/* Join: { */x10.
             lang.
             point p/* } */, byte dummy) { {
               
//#line 26
return (byte)
                                    /* template:array_get { */((p).get(0))/* } */;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 28
crypt1 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 29
plain2 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
    }
    
    
//#line 31
public void
                  run(
                  ) {
        
//#line 32
kernel();
        
//#line 33
validate();
    }
    
    
//#line 35
public void
                  kernel(
                  ) {
        
//#line 36
Do();
    }
    
    
//#line 38
public void
                  validate(
                  ) {
        
//#line 39
final x10.
          lang.
          ByteReferenceArray p1 =
          plain1;
        
//#line 40
final x10.
          lang.
          ByteReferenceArray c1 =
          crypt1;
        
//#line 41
final x10.
          lang.
          ByteReferenceArray p2 =
          plain2;
        
//#line 42
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 43
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = plain1.
                                            distribution; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 44
if (/* template:array_get { */((p1).get(pt))/* } */ !=
                                  /* template:array_get { */((p2).get(pt))/* } */) {
                    
//#line 45
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Validation failed");
                    
//#line 46
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Original Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((p1).get(pt))/* } */);
                    
//#line 47
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Encrypted Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((c1).get(pt))/* } */);
                    
//#line 48
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Decrypted Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((p2).get(pt))/* } */);
                    
//#line 49
throw new java.
                      lang.
                      RuntimeException(
                      "Validation failed");
                }
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp0) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp0);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 53
public void
                  Do(
                  ) {
        
//#line 54
final x10.
          lang.
          ByteReferenceArray p1 =
          plain1;
        
//#line 55
final x10.
          lang.
          ByteReferenceArray c1 =
          crypt1;
        
//#line 56
final x10.
          lang.
          ByteReferenceArray p2 =
          plain2;
        
//#line 57
final x10.
          lang.
          intArray fzr =
          ZR;
        
//#line 58
final x10.
          lang.
          intArray fdkr =
          DKR;
        
//#line 59
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 60
/* template:ateach { */
            {
            	x10.lang.dist pt__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pt__ = pt__distCopy.iterator();
            		 pt__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pt = (x10.
              lang.
              point) pt__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pt__distCopy.get(pt)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 61
cipher_idea(
                              p1,
                              c1,
                              fzr);
                
//#line 62
cipher_idea(
                              c1,
                              p2,
                              fdkr);
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp1) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp1);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 65
public void
                  buildTestData(
                  ) {
        
//#line 66
final Random rndnum =
          new Random(
          136506717L);
        
//#line 67
final x10.
          lang.
          region rUserKey =
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
              7));
        
//#line 68
final x10.
          lang.
          dist dUserKey =
          x10.
            lang.
            dist.
            factory.
            constant(
            rUserKey,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 69
final x10.
          lang.
          IntReferenceArray tUserKey =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUserKey,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 70
/* template:forloop { */
        for (java.util.Iterator pt__ = (rUserKey).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 71
/* template:array_set { */(tUserKey).set((short)
                                                                   /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(rndnum))/* } */.nextInt(),pt)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 73
final x10.
          lang.
          intArray tempuserkey =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rUserKey.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point pt/* } */, int dummy) { {
                 
//#line 74
return /* template:array_get { */((tUserKey).get(pt))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 76
userkey =
          tempuserkey;
        
//#line 77
final x10.
          lang.
          intArray tempZR =
          calcEncryptKey(
            tempuserkey);
        
//#line 78
ZR =
          tempZR;
        
//#line 79
calcDecryptKey(
                      tempZR);
    }
    
    
//#line 81
private x10.
                  lang.
                  intArray
                  calcEncryptKey(
                  final x10.
                    lang.
                    intArray auserkey) {
        
//#line 82
int j =
          0;
        
//#line 83
final x10.
          lang.
          region rZ =
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
              51));
        
//#line 84
final x10.
          lang.
          dist dZ =
          x10.
            lang.
            dist.
            factory.
            constant(
            rZ,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 85
final x10.
          lang.
          IntReferenceArray Z =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dZ,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 86
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
                                           0,
                                           7))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 87
/* template:array_set { */(Z).set(/* template:array_get { */((auserkey).get(i))/* } */ &
              65535,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 89
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
                                           8,
                                           51))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 90
j =
              /* template:array_get { */((i).get(0))/* } */ %
                8;
            
//#line 91
if (j <
                              6) {
                
//#line 92
/* template:array_set { */(Z).set(((((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                               lang.
                                                                                                                                                                                               point.
                                                                                                                                                                                               factory.
                                                                                                                                                                                               point(
                                                                                                                                                                                               -7))))/* } */ >>>
                                                                    9)) |
                                                                  ((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                 lang.
                                                                                                                                                                                                 point.
                                                                                                                                                                                                 factory.
                                                                                                                                                                                                 point(
                                                                                                                                                                                                 -6))))/* } */ <<
                                                                      7)))) &
                  65535,i)/* } */;
                
//#line 93
continue;
            }
            
//#line 95
if (j ==
                              6) {
                
//#line 96
/* template:array_set { */(Z).set(((((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                               lang.
                                                                                                                                                                                               point.
                                                                                                                                                                                               factory.
                                                                                                                                                                                               point(
                                                                                                                                                                                               -7))))/* } */ >>>
                                                                    9)) |
                                                                  ((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                                 lang.
                                                                                                                                                                                                 point.
                                                                                                                                                                                                 factory.
                                                                                                                                                                                                 point(
                                                                                                                                                                                                 -14))))/* } */ <<
                                                                      7)))) &
                  65535,i)/* } */;
                
//#line 97
continue;
            }
            
//#line 99
/* template:array_set { */(Z).set(((((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                           lang.
                                                                                                                                                                                           point.
                                                                                                                                                                                           factory.
                                                                                                                                                                                           point(
                                                                                                                                                                                           -15))))/* } */ >>>
                                                                9)) |
                                                              ((/* template:array_get { */((Z).get(/* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i))/* } */.add(x10.
                                                                                                                                                                                             lang.
                                                                                                                                                                                             point.
                                                                                                                                                                                             factory.
                                                                                                                                                                                             point(
                                                                                                                                                                                             -14))))/* } */ <<
                                                                  7)))) &
              65535,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 101
return (x10.
                              lang.
                              intArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rZ.
                                                                                                                                        toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public int apply(/* Join: { */x10.
                                 lang.
                                 point pt/* } */, int dummy) { {
                                   
//#line 102
return /* template:array_get { */((Z).get(pt))/* } */;
                               } }
                               }/* } */,true,false,false)/* } */);
    }
    
    
//#line 105
private void
                   calcDecryptKey(
                   final x10.
                     lang.
                     intArray aZR) {
        
//#line 106
int j =
          0;
        
//#line 107
int k =
          0;
        
//#line 108
int t1 =
          0;
        
//#line 109
int t2 =
          0;
        
//#line 110
int t3 =
          0;
        
//#line 111
final x10.
          lang.
          region rDK =
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
              51));
        
//#line 112
final x10.
          lang.
          dist dDK =
          x10.
            lang.
            dist.
            factory.
            constant(
            rDK,
            /* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 113
final x10.
          lang.
          IntReferenceArray DK =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dDK,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 114
final x10.
          lang.
          intArray Z =
          aZR;
        
//#line 115
t1 =
          inv(
            /* template:array_get { */((Z).get(0))/* } */);
        
//#line 116
t2 =
          -/* template:array_get { */((Z).get(1))/* } */ &
            65535;
        
//#line 117
t3 =
          -/* template:array_get { */((Z).get(2))/* } */ &
            65535;
        
//#line 118
/* template:array_set { */(DK).set(inv(
                                                          /* template:array_get { */((Z).get(3))/* } */),51)/* } */;
        
//#line 119
/* template:array_set { */(DK).set(t3,50)/* } */;
        
//#line 120
/* template:array_set { */(DK).set(t2,49)/* } */;
        
//#line 121
/* template:array_set { */(DK).set(t1,48)/* } */;
        
//#line 122
j =
          47;
        
//#line 123
k =
          4;
        
//#line 124
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
                                           0,
                                           6))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 125
t1 =
              /* template:array_get { */((Z).get(k++))/* } */;
            
//#line 126
/* template:array_set { */(DK).set(/* template:array_get { */((Z).get(k++))/* } */,j--)/* } */;
            
//#line 127
/* template:array_set { */(DK).set(t1,j--)/* } */;
            
//#line 128
t1 =
              inv(
                /* template:array_get { */((Z).get(k++))/* } */);
            
//#line 129
t2 =
              -/* template:array_get { */((Z).get(k++))/* } */ &
                65535;
            
//#line 130
t3 =
              -/* template:array_get { */((Z).get(k++))/* } */ &
                65535;
            
//#line 131
/* template:array_set { */(DK).set(inv(
                                                              /* template:array_get { */((Z).get(k++))/* } */),j--)/* } */;
            
//#line 132
/* template:array_set { */(DK).set(t2,j--)/* } */;
            
//#line 133
/* template:array_set { */(DK).set(t3,j--)/* } */;
            
//#line 134
/* template:array_set { */(DK).set(t1,j--)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 136
t1 =
          /* template:array_get { */((Z).get(k++))/* } */;
        
//#line 137
/* template:array_set { */(DK).set(/* template:array_get { */((Z).get(k++))/* } */,j--)/* } */;
        
//#line 138
/* template:array_set { */(DK).set(t1,j--)/* } */;
        
//#line 139
t1 =
          inv(
            /* template:array_get { */((Z).get(k++))/* } */);
        
//#line 140
t2 =
          -/* template:array_get { */((Z).get(k++))/* } */ &
            65535;
        
//#line 141
t3 =
          -/* template:array_get { */((Z).get(k++))/* } */ &
            65535;
        
//#line 142
/* template:array_set { */(DK).set(inv(
                                                          /* template:array_get { */((Z).get(k++))/* } */),j--)/* } */;
        
//#line 143
/* template:array_set { */(DK).set(t3,j--)/* } */;
        
//#line 144
/* template:array_set { */(DK).set(t2,j--)/* } */;
        
//#line 145
/* template:array_set { */(DK).set(t1,j--)/* } */;
        
//#line 146
DKR =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rDK.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 147
return /* template:array_get { */((DK).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
    }
    
    
//#line 150
private void
                   cipher_idea(
                   final x10.
                     lang.
                     ByteReferenceArray text1,
                   final x10.
                     lang.
                     ByteReferenceArray text2,
                   final x10.
                     lang.
                     intArray key) {
        
//#line 151
if (text1.
                           region.
                           size() %
                           ((8 *
                               x10.
                                 lang.
                                 place.
                                 MAX_PLACES)) !=
                           0) {
            
//#line 152
throw new java.
              lang.
              RuntimeException(
              "Invalid number of places for the distribution size");
        }
        
//#line 154
/* template:forloop { */
        for (java.util.Iterator i__ = (text1.
                                         distribution.
                                         restriction(
                                         /* template:here { */x10.lang.Runtime.here()/* } */).
                                         region).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 155
if (/* template:array_get { */((i).get(0))/* } */ %
                               8 ==
                               0) {
                
//#line 156
x10.
                  lang.
                  point i1 =
                  i;
                
//#line 157
x10.
                  lang.
                  point i2 =
                  i;
                
//#line 158
int ik =
                  0;
                
//#line 159
int x1 =
                  0;
                
//#line 160
int x2 =
                  0;
                
//#line 161
int x3 =
                  0;
                
//#line 162
int x4 =
                  0;
                
//#line 163
int t1 =
                  0;
                
//#line 164
int t2 =
                  0;
                
//#line 165
int r =
                  0;
                
//#line 166
ik =
                  0;
                
//#line 167
r =
                  8;
                
//#line 168
x1 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 169
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 170
x1 =
                  x1 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 171
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 172
x2 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 173
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 174
x2 =
                  x2 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 175
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 176
x3 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 177
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 178
x3 =
                  x3 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 179
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 180
x4 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 181
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 182
x4 =
                  x4 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 183
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 184
do  {
                    
//#line 185
x1 =
                      (int)
                        (((long)
                            x1 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 186
x2 =
                      x2 +
                        /* template:array_get { */((key).get(ik++))/* } */ &
                        65535;
                    
//#line 187
x3 =
                      x3 +
                        /* template:array_get { */((key).get(ik++))/* } */ &
                        65535;
                    
//#line 188
x4 =
                      (int)
                        (((long)
                            x4 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 189
t2 =
                      x1 ^
                        x3;
                    
//#line 190
t2 =
                      (int)
                        (((long)
                            t2 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 191
t1 =
                      t2 +
                        ((x2 ^
                            x4)) &
                        65535;
                    
//#line 192
t1 =
                      (int)
                        (((long)
                            t1 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 193
t2 =
                      t1 +
                        t2 &
                        65535;
                    
//#line 194
x1 =
                      x1 ^
                        t1;
                    
//#line 195
x4 =
                      x4 ^
                        t2;
                    
//#line 196
t2 =
                      t2 ^
                        x2;
                    
//#line 197
x2 =
                      x3 ^
                        t1;
                    
//#line 198
x3 =
                      t2;
                }while(--r !=
                         0); 
                
//#line 200
x1 =
                  (int)
                    (((long)
                        x1 *
                        /* template:array_get { */((key).get(ik++))/* } */ %
                        65537L &
                        65535));
                
//#line 201
x3 =
                  x3 +
                    /* template:array_get { */((key).get(ik++))/* } */ &
                    65535;
                
//#line 202
x2 =
                  x2 +
                    /* template:array_get { */((key).get(ik++))/* } */ &
                    65535;
                
//#line 203
x4 =
                  (int)
                    (((long)
                        x4 *
                        /* template:array_get { */((key).get(ik++))/* } */ %
                        65537L &
                        65535));
                
//#line 204
/* template:array_set { */(text2).set((byte)
                                                                     x1,i2)/* } */;
                
//#line 205
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 206
/* template:array_set { */(text2).set((byte)
                                                                     ((x1 >>>
                                                                         8)),i2)/* } */;
                
//#line 207
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 208
/* template:array_set { */(text2).set((byte)
                                                                     x3,i2)/* } */;
                
//#line 209
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 210
/* template:array_set { */(text2).set((byte)
                                                                     ((x3 >>>
                                                                         8)),i2)/* } */;
                
//#line 211
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 212
/* template:array_set { */(text2).set((byte)
                                                                     x2,i2)/* } */;
                
//#line 213
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 214
/* template:array_set { */(text2).set((byte)
                                                                     ((x2 >>>
                                                                         8)),i2)/* } */;
                
//#line 215
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 216
/* template:array_set { */(text2).set((byte)
                                                                     x4,i2)/* } */;
                
//#line 217
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 218
/* template:array_set { */(text2).set((byte)
                                                                     ((x4 >>>
                                                                         8)),i2)/* } */;
                
//#line 219
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
            }
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 223
private int
                   mul(
                   final int aa,
                   final int ab) {
        
//#line 224
int a =
          aa;
        
//#line 225
int b =
          ab;
        
//#line 226
long p =
          0L;
        
//#line 227
if (a !=
                           0) {
            
//#line 228
if (b !=
                               0) {
                
//#line 229
p =
                  (long)
                    a *
                    b;
                
//#line 230
b =
                  (int)
                    p &
                    65535;
                
//#line 231
a =
                  (int)
                    p >>>
                    16;
                
//#line 232
return (b -
                                       a +
                                       ((b <
                                           a
                                           ? 1
                                           : 0)) &
                                       65535);
            } else {
                
//#line 235
return (((1 -
                                         a)) &
                                       65535);
            }
        } else {
            
//#line 239
return (((1 -
                                     b)) &
                                   65535);
        }
    }
    
    
//#line 242
private int
                   inv(
                   final int ax) {
        
//#line 243
int t0 =
          0;
        
//#line 244
int t1 =
          0;
        
//#line 245
int q =
          0;
        
//#line 246
int y =
          0;
        
//#line 247
int x =
          ax;
        
//#line 248
if (x <=
                           1) {
            
//#line 249
return (x);
        }
        
//#line 251
t1 =
          65537 /
            x;
        
//#line 252
y =
          65537 %
            x;
        
//#line 253
if (y ==
                           1) {
            
//#line 254
return (((1 -
                                     t1)) &
                                   65535);
        }
        
//#line 256
t0 =
          1;
        
//#line 257
do  {
            
//#line 258
q =
              x /
                y;
            
//#line 259
x =
              x %
                y;
            
//#line 260
t0 =
              t0 +
                q *
                t1;
            
//#line 261
if (x ==
                               1) {
                
//#line 262
return (t0);
            }
            
//#line 263
q =
              y /
                x;
            
//#line 264
y =
              y %
                x;
            
//#line 265
t1 =
              t1 +
                q *
                t0;
        }while(y !=
                 1); 
        
//#line 267
return (((1 -
                                 t1)) &
                               65535);
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 272
private long
      seed;
    
//#line 273
final private static long
      multiplier =
      25214903917L;
    
//#line 274
final private static long
      addend =
      11L;
    
//#line 275
final private static long
      mask =
      ((1L <<
          48)) -
      1;
    
    
//#line 276
public Random(final long rseed) {
        
//#line 276
super();
        
//#line 277
setSeed(
                       rseed);
    }
    
    
//#line 279
public void
                   setSeed(
                   final long rseed) {
        
//#line 280
seed =
          ((rseed ^
              multiplier)) &
            mask;
    }
    
    
//#line 282
private int
                   nextbits(
                   final int bits) {
        
//#line 283
long oldseed =
          seed;
        
//#line 284
long nextseed =
          ((oldseed *
              multiplier +
              addend)) &
          mask;
        
//#line 285
seed =
          nextseed;
        
//#line 286
return (int)
                              ((nextseed >>>
                                  ((48 -
                                      bits))));
    }
    
    
//#line 288
public int
                   nextInt(
                   ) {
        
//#line 289
return nextbits(
                              32);
    }
    
    
//#line 291
public long
                   nextLong(
                   ) {
        
//#line 292
return (((long)
                                ((nextbits(
                                    32))) <<
                                32)) +
          nextbits(
            32);
    }
    
    
//#line 294
public boolean
                   nextBoolean(
                   ) {
        
//#line 295
return nextbits(
                              1) !=
          0;
    }
    
    
//#line 297
public double
                   nextDouble(
                   ) {
        
//#line 298
return (((((long)
                                  ((nextbits(
                                      26))) <<
                                  27)) +
                                nextbits(
                                  27))) /
          (double)
            ((1L <<
                53));
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 303
final public static int
      max_counters =
      64;
    
//#line 304
private x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 305
private x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 306
private x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 307
public Timer() {
        
//#line 307
super();
        
//#line 308
final x10.
          lang.
          dist d =
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
                max_counters)),
            x10.
              lang.
              place.
              FIRST_PLACE);
        
//#line 309
start_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 310
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 312
elapsed_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 313
return 0;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 315
total_time =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public double apply(/* Join: { */x10.
             lang.
             point p/* } */, double dummy) { {
               
//#line 316
return 0;
           } }
           }/* } */,true,true,false)/* } */);
    }
    
    
//#line 319
public void
                   start(
                   final int n) {
        
//#line 320
/* template:array_set { */(start_time).set(java.
                                                                  lang.
                                                                  System.
                                                                  currentTimeMillis(),n)/* } */;
    }
    
    
//#line 322
public void
                   stop(
                   final int n) {
        
//#line 323
/* template:array_set { */(elapsed_time).set(java.
                                                                    lang.
                                                                    System.
                                                                    currentTimeMillis() -
          /* template:array_get { */((start_time).get(n))/* } */,n)/* } */;
        
//#line 324
/* template:array_set { */(elapsed_time).set(/* template:array_get { */((elapsed_time).get(n))/* } */ /
          1000,n)/* } */;
        
//#line 325
/* template:array_set { */(total_time).set(/* template:array_get { */((total_time).get(n))/* } */ +
          /* template:array_get { */((elapsed_time).get(n))/* } */,n)/* } */;
    }
    
    
//#line 327
public double
                   readTimer(
                   final int n) {
        
//#line 328
return /* template:array_get { */((total_time).get(n))/* } */;
    }
    
    
//#line 330
public void
                   resetTimer(
                   final int n) {
        
//#line 331
/* template:array_set { */(total_time).set(0,n)/* } */;
        
//#line 332
/* template:array_set { */(start_time).set(0,n)/* } */;
        
//#line 333
/* template:array_set { */(elapsed_time).set(0,n)/* } */;
    }
    
    
//#line 335
public void
                   resetAllTimers(
                   ) {
        
//#line 336
int i =
          0;
        
//#line 337
while (i <
                              max_counters) {
            
//#line 338
resetTimer(
                           i);
            
//#line 339
i++;
        }
    }
}
