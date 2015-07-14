import x10.lang.*;

public class IDEATest
extends x10.
  lang.
  Object
{
    
//#line 43
final public static int
      array_rows =
      32000;
    
//#line 48
public x10.
      lang.
      ByteReferenceArray
      plain1;
    
//#line 49
public x10.
      lang.
      ByteReferenceArray
      crypt1;
    
//#line 50
public x10.
      lang.
      ByteReferenceArray
      plain2;
    
//#line 52
public x10.
      lang.
      intArray
      userkey;
    
//#line 53
public x10.
      lang.
      intArray
      ZR;
    
//#line 54
public x10.
      lang.
      intArray
      DKR;
    
    
//#line 56
public IDEATest() {
        
//#line 56
super();
        
//#line 57
buildTestData();
        
//#line 61
final x10.
          lang.
          dist D =
          new x10.
            runtime.
            RuntimeCastChecker.
            DepTypeRuntimeChecking(
            ) {
              
              
//#line 61
public x10.
                            lang.
                            dist
                            checkCast(
                            final x10.
                              lang.
                              dist x10_generated_objToCast) {
                  
//#line 61
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
        
//#line 62
plain1 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
           	public byte apply(/* Join: { */x10.
             lang.
             point p/* } */, byte dummy) { {
               
//#line 62
return (byte)
                                    /* template:array_get { */((p).get(0))/* } */;
           } }
           }/* } */,true,true,false)/* } */);
        
//#line 63
crypt1 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
        
//#line 64
plain2 =
          (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.ByteArray(D,(x10.array.Operator.Pointwise)null,true,true,false)/* } */);
    }
    
    
//#line 68
public void
                  run(
                  ) {
        
//#line 69
kernel();
        
//#line 70
validate();
    }
    
    
//#line 73
public void
                  kernel(
                  ) {
        
//#line 74
Do();
    }
    
    
//#line 77
public void
                  validate(
                  ) {
        
//#line 78
final x10.
          lang.
          ByteReferenceArray p1 =
          plain1;
        
//#line 79
final x10.
          lang.
          ByteReferenceArray c1 =
          crypt1;
        
//#line 80
final x10.
          lang.
          ByteReferenceArray p2 =
          plain2;
        
//#line 82
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 82
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
                
//#line 83
if (/* template:array_get { */((p1).get(pt))/* } */ !=
                                  /* template:array_get { */((p2).get(pt))/* } */) {
                    
//#line 84
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Validation failed");
                    
//#line 85
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Original Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((p1).get(pt))/* } */);
                    
//#line 86
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Encrypted Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((c1).get(pt))/* } */);
                    
//#line 87
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                lang.
                                                                                                                System.
                                                                                                                out))/* } */.println("Decrypted Byte " +
                                                                                                                                     pt +
                                                                                                                                     " = " +
                                                                                                                                     /* template:array_get { */((p2).get(pt))/* } */);
                    
//#line 88
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
    
    
//#line 93
public void
                  Do(
                  ) {
        
//#line 98
final x10.
          lang.
          ByteReferenceArray p1 =
          plain1;
        
//#line 99
final x10.
          lang.
          ByteReferenceArray c1 =
          crypt1;
        
//#line 100
final x10.
          lang.
          ByteReferenceArray p2 =
          plain2;
        
//#line 102
final x10.
          lang.
          intArray fzr =
          ZR;
        
//#line 103
final x10.
          lang.
          intArray fdkr =
          DKR;
        
//#line 105
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 105
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
                
//#line 106
cipher_idea(
                               p1,
                               c1,
                               fzr);
                
//#line 107
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
    
    
//#line 119
public void
                   buildTestData(
                   ) {
        
//#line 123
final Random rndnum =
          new Random(
          136506717L);
        
//#line 135
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
        
//#line 136
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
        
//#line 137
final x10.
          lang.
          IntReferenceArray tUserKey =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dUserKey,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 141
/* template:forloop { */
        for (java.util.Iterator pt__ = (rUserKey).iterator(); pt__.hasNext(); ) {
        	final  x10.
          lang.
          point pt = (x10.
          lang.
          point) pt__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 146
/* template:array_set { */(tUserKey).set((short)
                                                                    /* template:place-check { */((Random) x10.lang.Runtime.hereCheck(rndnum))/* } */.nextInt(),pt)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 149
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
                 
//#line 150
return /* template:array_get { */((tUserKey).get(pt))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
        
//#line 151
userkey =
          tempuserkey;
        
//#line 155
final x10.
          lang.
          intArray tempZR =
          calcEncryptKey(
            tempuserkey);
        
//#line 156
ZR =
          tempZR;
        
//#line 157
calcDecryptKey(
                       tempZR);
    }
    
    
//#line 170
private x10.
                   lang.
                   intArray
                   calcEncryptKey(
                   final x10.
                     lang.
                     intArray auserkey) {
        
//#line 171
int j =
          0;
        
//#line 172
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
        
//#line 173
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
        
//#line 174
final x10.
          lang.
          IntReferenceArray Z =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dZ,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 176
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
            
//#line 177
/* template:array_set { */(Z).set(/* template:array_get { */((auserkey).get(i))/* } */ &
              65535,i)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 192
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
            
//#line 193
j =
              /* template:array_get { */((i).get(0))/* } */ %
                8;
            
//#line 194
if (j <
                               6) {
                
//#line 195
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
                
//#line 197
continue;
            }
            
//#line 200
if (j ==
                               6) {
                
//#line 201
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
                
//#line 203
continue;
            }
            
//#line 208
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
        
        
//#line 211
return (x10.
                              lang.
                              intArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rZ.
                                                                                                                                        toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public int apply(/* Join: { */x10.
                                 lang.
                                 point pt/* } */, int dummy) { {
                                   
//#line 211
return /* template:array_get { */((Z).get(pt))/* } */;
                               } }
                               }/* } */,true,false,false)/* } */);
    }
    
    
//#line 222
private void
                   calcDecryptKey(
                   final x10.
                     lang.
                     intArray aZR) {
        
//#line 223
int j =
          0;
        
//#line 224
int k =
          0;
        
//#line 225
int t1 =
          0;
        
//#line 226
int t2 =
          0;
        
//#line 227
int t3 =
          0;
        
//#line 228
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
        
//#line 229
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
        
//#line 230
final x10.
          lang.
          IntReferenceArray DK =
          /* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dDK,(x10.array.Operator.Pointwise)null,true,true,false)/* } */;
        
//#line 231
final x10.
          lang.
          intArray Z =
          aZR;
        
//#line 233
t1 =
          inv(
            /* template:array_get { */((Z).get(0))/* } */);
        
//#line 234
t2 =
          -/* template:array_get { */((Z).get(1))/* } */ &
            65535;
        
//#line 235
t3 =
          -/* template:array_get { */((Z).get(2))/* } */ &
            65535;
        
//#line 237
/* template:array_set { */(DK).set(inv(
                                                          /* template:array_get { */((Z).get(3))/* } */),51)/* } */;
        
//#line 238
/* template:array_set { */(DK).set(t3,50)/* } */;
        
//#line 239
/* template:array_set { */(DK).set(t2,49)/* } */;
        
//#line 240
/* template:array_set { */(DK).set(t1,48)/* } */;
        
//#line 242
j =
          47;
        
//#line 243
k =
          4;
        
//#line 244
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
            
//#line 245
t1 =
              /* template:array_get { */((Z).get(k++))/* } */;
            
//#line 246
/* template:array_set { */(DK).set(/* template:array_get { */((Z).get(k++))/* } */,j--)/* } */;
            
//#line 247
/* template:array_set { */(DK).set(t1,j--)/* } */;
            
//#line 248
t1 =
              inv(
                /* template:array_get { */((Z).get(k++))/* } */);
            
//#line 249
t2 =
              -/* template:array_get { */((Z).get(k++))/* } */ &
                65535;
            
//#line 250
t3 =
              -/* template:array_get { */((Z).get(k++))/* } */ &
                65535;
            
//#line 251
/* template:array_set { */(DK).set(inv(
                                                              /* template:array_get { */((Z).get(k++))/* } */),j--)/* } */;
            
//#line 252
/* template:array_set { */(DK).set(t2,j--)/* } */;
            
//#line 253
/* template:array_set { */(DK).set(t3,j--)/* } */;
            
//#line 254
/* template:array_set { */(DK).set(t1,j--)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 257
t1 =
          /* template:array_get { */((Z).get(k++))/* } */;
        
//#line 258
/* template:array_set { */(DK).set(/* template:array_get { */((Z).get(k++))/* } */,j--)/* } */;
        
//#line 259
/* template:array_set { */(DK).set(t1,j--)/* } */;
        
//#line 260
t1 =
          inv(
            /* template:array_get { */((Z).get(k++))/* } */);
        
//#line 261
t2 =
          -/* template:array_get { */((Z).get(k++))/* } */ &
            65535;
        
//#line 262
t3 =
          -/* template:array_get { */((Z).get(k++))/* } */ &
            65535;
        
//#line 263
/* template:array_set { */(DK).set(inv(
                                                          /* template:array_get { */((Z).get(k++))/* } */),j--)/* } */;
        
//#line 264
/* template:array_set { */(DK).set(t3,j--)/* } */;
        
//#line 265
/* template:array_set { */(DK).set(t2,j--)/* } */;
        
//#line 266
/* template:array_set { */(DK).set(t1,j--)/* } */;
        
//#line 268
DKR =
          (x10.
            lang.
            intArray)
            (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(rDK.
                                                                                                                      toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
             	public int apply(/* Join: { */x10.
               lang.
               point i/* } */, int dummy) { {
                 
//#line 268
return /* template:array_get { */((DK).get(i))/* } */;
             } }
             }/* } */,true,false,false)/* } */);
    }
    
    
//#line 285
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
        
//#line 289
if (text1.
                           region.
                           size() %
                           ((8 *
                               x10.
                                 lang.
                                 place.
                                 MAX_PLACES)) !=
                           0) {
            
//#line 290
throw new java.
              lang.
              RuntimeException(
              "Invalid number of places for the distribution size");
        }
        
//#line 292
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
            
//#line 293
if (/* template:array_get { */((i).get(0))/* } */ %
                               8 ==
                               0) {
                
//#line 294
x10.
                  lang.
                  point i1 =
                  i;
                
//#line 295
x10.
                  lang.
                  point i2 =
                  i;
                
//#line 296
int ik =
                  0;
                
//#line 297
int x1 =
                  0;
                
//#line 298
int x2 =
                  0;
                
//#line 299
int x3 =
                  0;
                
//#line 300
int x4 =
                  0;
                
//#line 301
int t1 =
                  0;
                
//#line 302
int t2 =
                  0;
                
//#line 304
int r =
                  0;
                
//#line 306
ik =
                  0;
                
//#line 307
r =
                  8;
                
//#line 312
x1 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 313
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 314
x1 =
                  x1 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 315
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 316
x2 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 317
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 318
x2 =
                  x2 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 319
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 320
x3 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 321
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 322
x3 =
                  x3 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 323
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 324
x4 =
                  /* template:array_get { */((text1).get(i1))/* } */ &
                    255;
                
//#line 325
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 326
x4 =
                  x4 |
                    ((/* template:array_get { */((text1).get(i1))/* } */ &
                        255)) <<
                    8;
                
//#line 327
i1 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i1))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 329
do  {
                    
//#line 333
x1 =
                      (int)
                        (((long)
                            x1 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 338
x2 =
                      x2 +
                        /* template:array_get { */((key).get(ik++))/* } */ &
                        65535;
                    
//#line 343
x3 =
                      x3 +
                        /* template:array_get { */((key).get(ik++))/* } */ &
                        65535;
                    
//#line 348
x4 =
                      (int)
                        (((long)
                            x4 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 352
t2 =
                      x1 ^
                        x3;
                    
//#line 360
t2 =
                      (int)
                        (((long)
                            t2 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 364
t1 =
                      t2 +
                        ((x2 ^
                            x4)) &
                        65535;
                    
//#line 369
t1 =
                      (int)
                        (((long)
                            t1 *
                            /* template:array_get { */((key).get(ik++))/* } */ %
                            65537L &
                            65535));
                    
//#line 373
t2 =
                      t1 +
                        t2 &
                        65535;
                    
//#line 377
x1 =
                      x1 ^
                        t1;
                    
//#line 381
x4 =
                      x4 ^
                        t2;
                    
//#line 385
t2 =
                      t2 ^
                        x2;
                    
//#line 389
x2 =
                      x3 ^
                        t1;
                    
//#line 391
x3 =
                      t2;
                }while(--r !=
                         0); 
                
//#line 399
x1 =
                  (int)
                    (((long)
                        x1 *
                        /* template:array_get { */((key).get(ik++))/* } */ %
                        65537L &
                        65535));
                
//#line 405
x3 =
                  x3 +
                    /* template:array_get { */((key).get(ik++))/* } */ &
                    65535;
                
//#line 411
x2 =
                  x2 +
                    /* template:array_get { */((key).get(ik++))/* } */ &
                    65535;
                
//#line 416
x4 =
                  (int)
                    (((long)
                        x4 *
                        /* template:array_get { */((key).get(ik++))/* } */ %
                        65537L &
                        65535));
                
//#line 420
/* template:array_set { */(text2).set((byte)
                                                                     x1,i2)/* } */;
                
//#line 421
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 422
/* template:array_set { */(text2).set((byte)
                                                                     ((x1 >>>
                                                                         8)),i2)/* } */;
                
//#line 423
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 424
/* template:array_set { */(text2).set((byte)
                                                                     x3,i2)/* } */;
                
//#line 425
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 426
/* template:array_set { */(text2).set((byte)
                                                                     ((x3 >>>
                                                                         8)),i2)/* } */;
                
//#line 427
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 428
/* template:array_set { */(text2).set((byte)
                                                                     x2,i2)/* } */;
                
//#line 429
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 430
/* template:array_set { */(text2).set((byte)
                                                                     ((x2 >>>
                                                                         8)),i2)/* } */;
                
//#line 431
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 432
/* template:array_set { */(text2).set((byte)
                                                                     x4,i2)/* } */;
                
//#line 433
i2 =
                  /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(i2))/* } */.add(x10.
                                                                                                             lang.
                                                                                                             point.
                                                                                                             factory.
                                                                                                             point(
                                                                                                             1));
                
//#line 434
/* template:array_set { */(text2).set((byte)
                                                                     ((x4 >>>
                                                                         8)),i2)/* } */;
                
//#line 435
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
    
    
//#line 462
private int
                   mul(
                   final int aa,
                   final int ab) {
        
//#line 463
int a =
          aa;
        
//#line 464
int b =
          ab;
        
//#line 465
long p =
          0L;
        
//#line 467
if (a !=
                           0) {
            
//#line 468
if (b !=
                               0) {
                
//#line 469
p =
                  (long)
                    a *
                    b;
                
//#line 470
b =
                  (int)
                    p &
                    65535;
                
//#line 471
a =
                  (int)
                    p >>>
                    16;
                
//#line 473
return (b -
                                       a +
                                       ((b <
                                           a
                                           ? 1
                                           : 0)) &
                                       65535);
            } else {
                
//#line 475
return (((1 -
                                         a)) &
                                       65535);
            }
        } else {
            
//#line 479
return (((1 -
                                     b)) &
                                   65535);
        }
    }
    
    
//#line 493
private int
                   inv(
                   final int ax) {
        
//#line 494
int t0 =
          0;
        
//#line 495
int t1 =
          0;
        
//#line 496
int q =
          0;
        
//#line 497
int y =
          0;
        
//#line 498
int x =
          ax;
        
//#line 500
if (x <=
                           1) {
            
//#line 501
return (x);
        }
        
//#line 504
t1 =
          65537 /
            x;
        
//#line 505
y =
          65537 %
            x;
        
//#line 506
if (y ==
                           1) {
            
//#line 507
return (((1 -
                                     t1)) &
                                   65535);
        }
        
//#line 510
t0 =
          1;
        
//#line 511
do  {
            
//#line 512
q =
              x /
                y;
            
//#line 513
x =
              x %
                y;
            
//#line 514
t0 =
              t0 +
                q *
                t1;
            
//#line 515
if (x ==
                               1) {
                
//#line 515
return (t0);
            }
            
//#line 516
q =
              y /
                x;
            
//#line 517
y =
              y %
                x;
            
//#line 518
t1 =
              t1 +
                q *
                t0;
        }while(y !=
                 1); 
        
//#line 522
return (((1 -
                                 t1)) &
                               65535);
    }
}
