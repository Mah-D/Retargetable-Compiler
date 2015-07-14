import x10.lang.*;

public class FourierTransform2D
extends x10.
  lang.
  Object
  implements x10.
               lang.
               ValueType
{
    
//#line 6
final public int
      maxBits;
    
//#line 9
final public int
      nBits1;
    
//#line 10
final public int
      nBits2;
    
//#line 13
final public int
      length1;
    
//#line 14
final public int
      length2;
    
//#line 17
final public double
      invN;
    
//#line 19
final public x10.
      lang.
      intArray
      tableBitReverse;
    
//#line 20
final public x10.
      lang.
      GenericReferenceArray
      tableSineCosine;
    
    
//#line 22
public FourierTransform2D(final int nBits1,
                                          final int nBits2) {
        
//#line 22
super();
        
//#line 23
this.
                      nBits1 =
          nBits1;
        
//#line 24
this.
                      nBits2 =
          nBits2;
        
//#line 25
maxBits =
          X10Util.
            maxInt(
            nBits1,
            nBits2 -
              1);
        
//#line 27
final int len1 =
          1 <<
          nBits1;
        
//#line 28
final int len2 =
          1 <<
          nBits2;
        
//#line 30
length1 =
          len1;
        
//#line 31
length2 =
          len2;
        
//#line 33
invN =
          1.0 /
            ((2 *
                len1 *
                len2));
        
//#line 35
tableBitReverse =
          initBitReverse(
            nBits1,
            nBits2);
        
//#line 36
tableSineCosine =
          initSineCosine(
            len1,
            len2);
    }
    
    
//#line 42
public x10.
                  lang.
                  GenericReferenceArray
                  transformC(
                  final x10.
                    lang.
                    GenericReferenceArray f) {
        
//#line 43
scrambleY(
                      f);
        
//#line 44
bitReverse(
                      f,
                      0);
        
//#line 45
transformRank(
                      f,
                      0,
                      false);
        
//#line 47
final x10.
          lang.
          GenericReferenceArray g =
          ArrayUtil.
            transpose(
            f);
        
//#line 49
scrambleX(
                      g);
        
//#line 50
bitReverse(
                      g,
                      1);
        
//#line 51
transformRank(
                      g,
                      1,
                      false);
        
//#line 53
return g;
    }
    
    
//#line 59
public x10.
                  lang.
                  GenericReferenceArray
                  transformD(
                  final x10.
                    lang.
                    DoubleReferenceArray f) {
        
//#line 60
return transformC(
                             ArrayUtil.
                               doubleToComplex(
                               f));
    }
    
    
//#line 66
public x10.
                  lang.
                  GenericReferenceArray
                  inverseTransformC(
                  final x10.
                    lang.
                    GenericReferenceArray f) {
        
//#line 67
bitReverse(
                      f,
                      1);
        
//#line 68
transformRank(
                      f,
                      1,
                      true);
        
//#line 69
unscrambleX(
                      f);
        
//#line 71
final x10.
          lang.
          GenericReferenceArray g =
          ArrayUtil.
            transpose(
            f);
        
//#line 73
bitReverse(
                      g,
                      0);
        
//#line 74
transformRank(
                      g,
                      0,
                      true);
        
//#line 75
unscrambleY(
                      g);
        
//#line 77
return g;
    }
    
    
//#line 83
public x10.
                  lang.
                  GenericReferenceArray
                  inverseTransformD(
                  final x10.
                    lang.
                    DoubleReferenceArray f) {
        
//#line 84
return inverseTransformC(
                             ArrayUtil.
                               doubleToComplex(
                               f));
    }
    
    
//#line 90
public x10.
                  lang.
                  intArray
                  initBitReverse(
                  final int nBits1,
                  final int nBits2) {
        
//#line 91
final int maxBits =
          X10Util.
            maxInt(
            nBits2 -
              1,
            nBits1);
        
//#line 93
final x10.
          lang.
          region r =
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
              ((1 <<
                  maxBits)) -
                1));
        
//#line 94
return (x10.
                             lang.
                             intArray)
                             (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(r.
                                                                                                                                       toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                              	public int apply(/* Join: { */x10.
                                lang.
                                point i/* } */, int dummy) { {
                                  
//#line 95
final int i0 =
                                    /* template:array_get { */((i).get(0))/* } */;
                                  
//#line 96
final int i1 =
                                    (((((i0 &
                                           65535)) <<
                                         16)) |
                                       ((((i0 >>
                                             16)) &
                                           65535)));
                                  
//#line 98
final int i2 =
                                    (((((i1 &
                                           16711935)) <<
                                         8)) |
                                       ((((i1 >>
                                             8)) &
                                           16711935)));
                                  
//#line 100
final int i3 =
                                    (((((i2 &
                                           252645135)) <<
                                         4)) |
                                       ((((i2 >>
                                             4)) &
                                           252645135)));
                                  
//#line 102
final int i4 =
                                    (((((i3 &
                                           858993459)) <<
                                         2)) |
                                       ((((i3 >>
                                             2)) &
                                           858993459)));
                                  
//#line 104
final int i5 =
                                    (((((i4 &
                                           1431655765)) <<
                                         1)) |
                                       ((((i4 >>
                                             1)) &
                                           1431655765)));
                                  
//#line 106
return i5 >>>
                                    ((java.
                                        lang.
                                        Integer.
                                        SIZE -
                                        maxBits));
                              } }
                              }/* } */,true,false,false)/* } */);
    }
    
    
//#line 113
public x10.
                   lang.
                   GenericReferenceArray
                   initSineCosine(
                   final int length1,
                   final int length2) {
        
//#line 114
final int maxLength =
          X10Util.
            maxInt(
            length1,
            length2);
        
//#line 115
final double PI2 =
          6.28318530717959;
        
//#line 116
final double k =
          PI2 /
          maxLength;
        
//#line 118
final x10.
          lang.
          region r =
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
              ((maxLength /
                  2)) -
                1));
        
//#line 119
return (x10.
                              lang.
                              GenericReferenceArray)
                              (/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(r.
                                                                                                                                            toDistribution(),/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
                               	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                                 lang.
                                 point i/* } */, x10.compilergenerated.Parameter1 dummy) { {
                                   
//#line 121
final double theta =
                                     k *
                                     /* template:array_get { */((i).get(0))/* } */;
                                   
//#line 122
return new Complex(
                                     java.
                                       lang.
                                       Math.
                                       cos(
                                       theta),
                                     -java.
                                        lang.
                                        Math.
                                        sin(
                                        theta));
                               } }
                               }/* } */,true,false,true)/* } */);
    }
    
    
//#line 130
public void
                   bitReverse(
                   final x10.
                     lang.
                     GenericReferenceArray f,
                   final int rnk) {
        
//#line 131
final int nBits =
          ((rnk ==
              0))
          ? nBits1
          : nBits2 -
          1;
        
//#line 132
final int r1Length =
          ((rnk ==
              0))
          ? length1
          : length2 /
          2;
        
//#line 133
final int nrx =
          ((1 <<
              nBits)) /
          r1Length;
        
//#line 134
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 134
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 135
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 136
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dF,
                    0);
                
//#line 137
/* template:foreach { */
                for (java.util.Iterator __var72____ = (x10.
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
                                                           r1Length -
                                                             1))).iterator(); __var72____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var72__ = (x10.
                  lang.
                  point) __var72____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var72__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var72__).get(0))/* } */;/* } */
{
                    
//#line 138
final int j2 =
                      /* template:array_get { */((tableBitReverse).get(j1))/* } */ >>
                      ((maxBits -
                          nBits));
                    
//#line 139
if (j1 <
                                       j2) {
                        
//#line 140
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 140
/* template:foreach { */
                            for (java.util.Iterator __var73____ = (rLocal1).iterator(); __var73____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var73__ = (x10.
                              lang.
                              point) __var73____.next();
                            	/* Join: { */final int i =
                              /* template:array_get { */((__var73__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int i =
                              /* template:array_get { */((__var73__).get(0))/* } */;/* } */
{
                                
//#line 141
final Complex temp =
                                  /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                
//#line 142
/* template:array_set { */(f).set(/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */,/* Join: { */i,j1/* } */)/* } */;
                                
//#line 143
/* template:array_set { */(f).set(temp,/* Join: { */i,j2/* } */)/* } */;
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp228) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp228);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp227) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp227);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 153
public void
                   scrambleX(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 154
final int nxh =
          length2 /
          2;
        
//#line 155
final int nxhh =
          nxh /
          2;
        
//#line 156
final int kmr =
          X10Util.
            maxInt(
            length1,
            length2) /
          length2;
        
//#line 157
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 157
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 158
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 159
final x10.
                  lang.
                  region rLocal =
                  X10Util.
                    get2DLRegion(
                    dF);
                
//#line 160
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getRank2D(
                    rLocal,
                    0);
                
//#line 162
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    nxhh,
                                                    nxhh))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 163
/* template:array_set { */(f).set(((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt))/* } */))/* } */.
                                                                       getConjg())).
                                                                     multS(
                                                                     2),pt)/* } */;
                    
//#line 164
final x10.
                      lang.
                      point pt0 =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 1,
                                                                                                                 0));
                    
//#line 165
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt0))/* } */))/* } */;
                    
//#line 166
final double t2Real =
                      t2.
                        getReal();
                    
//#line 167
final double t2Imag =
                      t2.
                        getImag();
                    
//#line 168
/* template:array_set { */(f).set(new Complex(
                      t2Real +
                        t2Imag,
                      t2Real -
                        t2Imag),pt0)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 171
/* template:forloop-mult { */{
                x10.lang.region __var230__ = (x10.lang.region) x10.
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
                                                                   nxhh -
                                                                     1));
                if (__var230__.size() > 0 && (__var230__ instanceof x10.array.MultiDimRegion || __var230__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var231__ = __var230__.rank(0).low(), __var232__ = __var230__.rank(0).high(); __var231__ <= __var232__; __var231__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j1 = __var231__;
                /* } */
                /* } */
{
                    
//#line 172
final int j2 =
                      nxh -
                      j1;
                    
//#line 173
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 174
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      t0.
                        getReal());
                    
//#line 175
/* template:foreach { */
                    for (java.util.Iterator __var75____ = (rLocal1).iterator(); __var75____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var75__ = (x10.
                      lang.
                      point) __var75____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var75__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var75__).get(0))/* } */;/* } */
{
                        
//#line 176
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 177
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 178
final Complex t3 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 179
/* template:array_set { */(f).set(s.
                                                                         add(
                                                                         t3),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 180
/* template:array_set { */(f).set(((s.
                                                                           sub(
                                                                           t3))).
                                                                         getConjg(),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var74____ = (__var230__).iterator(); __var74____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var74__ = (x10.
                  lang.
                  point) __var74____.next();
                	/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var74__).get(0))/* } */;/* } */
{
                    
//#line 172
final int j2 =
                      nxh -
                      j1;
                    
//#line 173
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 174
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      t0.
                        getReal());
                    
//#line 175
/* template:foreach { */
                    for (java.util.Iterator __var75____ = (rLocal1).iterator(); __var75____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var75__ = (x10.
                      lang.
                      point) __var75____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var75__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var75__).get(0))/* } */;/* } */
{
                        
//#line 176
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 177
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 178
final Complex t3 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 179
/* template:array_set { */(f).set(s.
                                                                         add(
                                                                         t3),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 180
/* template:array_set { */(f).set(((s.
                                                                           sub(
                                                                           t3))).
                                                                         getConjg(),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp229) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp229);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 189
public void
                   unscrambleX(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 190
final int nxh =
          length2 /
          2;
        
//#line 191
final int nxhh =
          length2 /
          4;
        
//#line 192
final int kmr =
          X10Util.
            maxInt(
            length1,
            length2) /
          length2;
        
//#line 193
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 193
/* template:ateach { */
            {
            	x10.lang.dist pl__distCopy = x10.
                                            lang.
                                            dist.
                                            UNIQUE; // make copy to avoid recomputation
            	for (java.util.Iterator pl__ = pl__distCopy.iterator();
            		 pl__.hasNext(); )
            	{
            		final  x10.
              lang.
              point pl = (x10.
              lang.
              point) pl__.next();
            		/* Join: { *//* } */
            		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
            			(new x10.runtime.Activity() {
            				public void runX10Task() {
            					/* Join: { *//* Join: { *//* } */
{
                
//#line 194
final x10.
                  lang.
                  dist dF =
                  f.
                    distribution;
                
//#line 195
final x10.
                  lang.
                  region rLocal1 =
                  X10Util.
                    getLRank2D(
                    dF,
                    0);
                
//#line 196
/* template:foreach { */
                for (java.util.Iterator __var76____ = (x10.
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
                                                           nxhh -
                                                             1))).iterator(); __var76____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var76__ = (x10.
                  lang.
                  point) __var76____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var76__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var76__).get(0))/* } */;/* } */
{
                    
//#line 197
final int j2 =
                      nxh -
                      j1;
                    
//#line 198
final Complex t0 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                      j1))/* } */))/* } */;
                    
//#line 199
final Complex t1 =
                      new Complex(
                      t0.
                        getImag(),
                      -t0.
                         getReal());
                    
//#line 200
/* template:foreach { */
                    for (java.util.Iterator __var77____ = (rLocal1).iterator(); __var77____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var77__ = (x10.
                      lang.
                      point) __var77____.next();
                    	/* Join: { */final int i =
                      /* template:array_get { */((__var77__).get(0))/* } */;/* } */
                    	x10.lang.Runtime.here().runAsync
                    		(new x10.runtime.Activity() {
                    			public void runX10Task() {
                    				/* Join: { *//* Join: { */final int i =
                      /* template:array_get { */((__var77__).get(0))/* } */;/* } */
{
                        
//#line 201
final Complex t =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */.
                            getConjg();
                        
//#line 202
final Complex s =
                          /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                            add(
                            t);
                        
//#line 203
final Complex t2 =
                          ((/* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */.
                              sub(
                              t))).
                            mult(
                            t1);
                        
//#line 204
/* template:array_set { */(f).set(((s.
                                                                           add(
                                                                           t2))).
                                                                         multS(
                                                                         invN),/* Join: { */i,j1/* } */)/* } */;
                        
//#line 205
/* template:array_set { */(f).set(((((s.
                                                                             sub(
                                                                             t2))).
                                                                           getConjg())).
                                                                         multS(
                                                                         invN),/* Join: { */i,j2/* } */)/* } */;
                    }/* } */
                    			}
                    		});
                    }
                    /* } */
                    
                }/* } */
                			}
                		});
                }
                /* } */
                
                
//#line 209
/* template:foreach { */
                for (java.util.Iterator pt__ = (x10.
                                                  lang.
                                                  region.
                                                  factory.
                                                  region(
                                                  rLocal1,
                                                  x10.
                                                    lang.
                                                    region.
                                                    factory.
                                                    region(
                                                    nxhh,
                                                    nxhh))).iterator(); pt__.hasNext(); ) {
                	final  x10.
                  lang.
                  point pt = (x10.
                  lang.
                  point) pt__.next();
                	/* Join: { *//* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { *//* } */
{
                    
//#line 210
final x10.
                      lang.
                      point pt0 =
                      /* template:place-check { */((x10.lang.point) x10.lang.Runtime.hereCheck(pt))/* } */.mul(x10.
                                                                                                                 lang.
                                                                                                                 point.
                                                                                                                 factory.
                                                                                                                 point(
                                                                                                                 1,
                                                                                                                 0));
                    
//#line 211
final Complex t1 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt0))/* } */))/* } */;
                    
//#line 212
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(pt))/* } */))/* } */;
                    
//#line 214
final double t1Real =
                      t1.
                        getReal();
                    
//#line 215
final double t1Imag =
                      t1.
                        getImag();
                    
//#line 216
final Complex t3 =
                      new Complex(
                      t1Real +
                        t1Imag,
                      t1Real -
                        t1Imag);
                    
//#line 218
/* template:array_set { */(f).set(((t2.
                                                                       getConjg())).
                                                                     multS(
                                                                     2 *
                                                                       invN),pt)/* } */;
                    
//#line 219
/* template:array_set { */(f).set(t3.
                                                                     multS(
                                                                     2 *
                                                                       invN),pt0)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }/* } */
            				}
            			});
            	}
            }
            /* } */
            
        }
        	} catch (Throwable tmp233) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp233);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 227
public void
                   scrambleY(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 228
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 228
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 229
/* template:foreach { */
                for (java.util.Iterator __var78____ = (x10.
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
                                                           ((length1 /
                                                               2)) -
                                                             1))).iterator(); __var78____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var78__ = (x10.
                  lang.
                  point) __var78____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var78__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var78__).get(0))/* } */;/* } */
{
                    
//#line 230
final int j2 =
                      length1 -
                      j1;
                    
//#line 231
final Complex t1 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j2/* } */))/* } */))/* } */;
                    
//#line 232
final Complex t2 =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j1/* } */))/* } */))/* } */;
                    
//#line 233
final Complex s =
                      new Complex(
                      t1.
                        getImag(),
                      t1.
                        getReal());
                    
//#line 234
/* template:array_set { */(f).set(((t2.
                                                                       sub(
                                                                       s))).
                                                                     getConjg(),/* Join: { */0,j2/* } */)/* } */;
                    
//#line 235
/* template:array_set { */(f).set(t2.
                                                                     add(
                                                                     s),/* Join: { */0,j1/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp234) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp234);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 243
public void
                   unscrambleY(
                   final x10.
                     lang.
                     GenericReferenceArray f) {
        
//#line 244
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 244
/* template:Async { */(x10.lang.Runtime.asPlace(x10.
                                                                           lang.
                                                                           place.
                                                                           FIRST_PLACE)).runAsync
            	(new x10.runtime.Activity() {
            		public void runX10Task() {
            			{
                
//#line 245
/* template:foreach { */
                for (java.util.Iterator __var79____ = (x10.
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
                                                           ((length1 /
                                                               2)) -
                                                             1))).iterator(); __var79____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var79__ = (x10.
                  lang.
                  point) __var79____.next();
                	/* Join: { */final int j1 =
                  /* template:array_get { */((__var79__).get(0))/* } */;/* } */
                	x10.lang.Runtime.here().runAsync
                		(new x10.runtime.Activity() {
                			public void runX10Task() {
                				/* Join: { *//* Join: { */final int j1 =
                  /* template:array_get { */((__var79__).get(0))/* } */;/* } */
{
                    
//#line 246
final int j2 =
                      length1 -
                      j1;
                    
//#line 247
final Complex s =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j2/* } */))/* } */))/* } */;
                    
//#line 248
final Complex t =
                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */0,j1/* } */))/* } */))/* } */;
                    
//#line 249
final Complex t1 =
                      t.
                        add(
                        s);
                    
//#line 250
final Complex t2 =
                      t.
                        sub(
                        s);
                    
//#line 251
/* template:array_set { */(f).set(((new Complex(
                                                                       t1.
                                                                         getImag(),
                                                                       t2.
                                                                         getReal()))).
                                                                     multS(
                                                                     0.5),/* Join: { */0,j2/* } */)/* } */;
                    
//#line 252
/* template:array_set { */(f).set(((new Complex(
                                                                       t1.
                                                                         getReal(),
                                                                       t2.
                                                                         getImag()))).
                                                                     multS(
                                                                     0.5),/* Join: { */0,j1/* } */)/* } */;
                }/* } */
                			}
                		});
                }
                /* } */
                
            }
            		}
            	});/* } */
        }
        	} catch (Throwable tmp235) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp235);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 260
public void
                   transformRank(
                   final x10.
                     lang.
                     GenericReferenceArray f,
                   final int rnk,
                   final boolean inverse) {
        
//#line 264
final int nxy =
          X10Util.
            maxInt(
            length1,
            length2);
        
//#line 265
final int nxh =
          length2 /
          2;
        
//#line 266
final int nyh =
          length1 /
          2;
        
//#line 267
final int nxhh =
          length2 /
          4;
        
//#line 268
final int bits =
          ((rnk ==
              0))
          ? nBits1
          : nBits2 -
          1;
        
//#line 269
final int r =
          nxy /
          ((((rnk ==
                0))
              ? length1
              : nxh));
        
//#line 271
/* template:forloop { */
        for (java.util.Iterator exponent__ = (x10.
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
                                                  bits -
                                                    1))).iterator(); exponent__.hasNext(); ) {
        	final  x10.
          lang.
          point exponent = (x10.
          lang.
          point) exponent__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 272
final int stride =
              1 <<
              /* template:array_get { */((exponent).get(0))/* } */;
            
//#line 273
final int width =
              2 *
              stride;
            
//#line 276
final int km =
              ((((rnk ==
                    0))
                  ? nyh
                  : nxhh)) /
              stride;
            
//#line 277
final int kmr =
              km *
              r;
            
//#line 278
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 278
/* template:ateach { */
                {
                	x10.lang.dist pl__distCopy = x10.
                                                lang.
                                                dist.
                                                UNIQUE; // make copy to avoid recomputation
                	for (java.util.Iterator pl__ = pl__distCopy.iterator();
                		 pl__.hasNext(); )
                	{
                		final  x10.
                  lang.
                  point pl = (x10.
                  lang.
                  point) pl__.next();
                		/* Join: { *//* } */
                		((x10.runtime.Place) pl__distCopy.get(pl)).runAsync
                			(new x10.runtime.Activity() {
                				public void runX10Task() {
                					/* Join: { *//* Join: { *//* } */
{
                    
//#line 279
/* template:forloop-mult { */{
                    x10.lang.region __var237__ = (x10.lang.region) x10.
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
                                                                       km -
                                                                         1));
                    if (__var237__.size() > 0 && (__var237__ instanceof x10.array.MultiDimRegion || __var237__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var238__ = __var237__.rank(0).low(), __var239__ = __var237__.rank(0).high(); __var238__ <= __var239__; __var238__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var238__;
                    /* } */
                    /* } */
{
                        
//#line 280
final int lb =
                          width *
                          k;
                        
//#line 281
final int mb =
                          lb +
                          stride;
                        
//#line 282
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 282
/* template:foreach { */
                            for (java.util.Iterator __var81____ = (x10.
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
                                                                       stride -
                                                                         1))).iterator(); __var81____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var81__ = (x10.
                              lang.
                              point) __var81____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var81__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var81__).get(0))/* } */;/* } */
{
                                
//#line 283
final int j1 =
                                  j +
                                  lb;
                                
//#line 284
final int j2 =
                                  j +
                                  mb;
                                
//#line 285
final Complex s =
                                  (((inverse))
                                     ? /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                     j))/* } */))/* } */
                                     : /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                         j))/* } */))/* } */.
                                         getConjg());
                                
//#line 289
final x10.
                                  lang.
                                  dist dF =
                                  f.
                                    distribution;
                                
//#line 290
final x10.
                                  lang.
                                  region rLocal1 =
                                  X10Util.
                                    getLRank2D(
                                    dF,
                                    0);
                                
//#line 292
/* template:foreach { */
                                for (java.util.Iterator __var82____ = (rLocal1).iterator(); __var82____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var82__ = (x10.
                                  lang.
                                  point) __var82____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var82__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var82__).get(0))/* } */;/* } */
{
                                    
//#line 293
final Complex tmp1 =
                                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                    
//#line 294
final Complex tmp2 =
                                      s.
                                        mult(
                                        /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */);
                                    
//#line 295
/* template:array_set { */(f).set(tmp1.
                                                                                     sub(
                                                                                     tmp2),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 296
/* template:array_set { */(f).set(tmp1.
                                                                                     add(
                                                                                     tmp2),/* Join: { */i,j1/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp240) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp240);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var80____ = (__var237__).iterator(); __var80____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var80__ = (x10.
                      lang.
                      point) __var80____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var80__).get(0))/* } */;/* } */
{
                        
//#line 280
final int lb =
                          width *
                          k;
                        
//#line 281
final int mb =
                          lb +
                          stride;
                        
//#line 282
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 282
/* template:foreach { */
                            for (java.util.Iterator __var81____ = (x10.
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
                                                                       stride -
                                                                         1))).iterator(); __var81____.hasNext(); ) {
                            	final  x10.
                              lang.
                              point __var81__ = (x10.
                              lang.
                              point) __var81____.next();
                            	/* Join: { */final int j =
                              /* template:array_get { */((__var81__).get(0))/* } */;/* } */
                            	x10.lang.Runtime.here().runAsync
                            		(new x10.runtime.Activity() {
                            			public void runX10Task() {
                            				/* Join: { *//* Join: { */final int j =
                              /* template:array_get { */((__var81__).get(0))/* } */;/* } */
{
                                
//#line 283
final int j1 =
                                  j +
                                  lb;
                                
//#line 284
final int j2 =
                                  j +
                                  mb;
                                
//#line 285
final Complex s =
                                  (((inverse))
                                     ? /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                     j))/* } */))/* } */
                                     : /* template:parametric { */((Complex)(/* template:array_get { */((tableSineCosine).get(kmr *
                                         j))/* } */))/* } */.
                                         getConjg());
                                
//#line 289
final x10.
                                  lang.
                                  dist dF =
                                  f.
                                    distribution;
                                
//#line 290
final x10.
                                  lang.
                                  region rLocal1 =
                                  X10Util.
                                    getLRank2D(
                                    dF,
                                    0);
                                
//#line 292
/* template:foreach { */
                                for (java.util.Iterator __var82____ = (rLocal1).iterator(); __var82____.hasNext(); ) {
                                	final  x10.
                                  lang.
                                  point __var82__ = (x10.
                                  lang.
                                  point) __var82____.next();
                                	/* Join: { */final int i =
                                  /* template:array_get { */((__var82__).get(0))/* } */;/* } */
                                	x10.lang.Runtime.here().runAsync
                                		(new x10.runtime.Activity() {
                                			public void runX10Task() {
                                				/* Join: { *//* Join: { */final int i =
                                  /* template:array_get { */((__var82__).get(0))/* } */;/* } */
{
                                    
//#line 293
final Complex tmp1 =
                                      /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j1/* } */))/* } */))/* } */;
                                    
//#line 294
final Complex tmp2 =
                                      s.
                                        mult(
                                        /* template:parametric { */((Complex)(/* template:array_get { */((f).get(/* Join: { */i,j2/* } */))/* } */))/* } */);
                                    
//#line 295
/* template:array_set { */(f).set(tmp1.
                                                                                     sub(
                                                                                     tmp2),/* Join: { */i,j2/* } */)/* } */;
                                    
//#line 296
/* template:array_set { */(f).set(tmp1.
                                                                                     add(
                                                                                     tmp2),/* Join: { */i,j1/* } */)/* } */;
                                }/* } */
                                			}
                                		});
                                }
                                /* } */
                                
                            }/* } */
                            			}
                            		});
                            }
                            /* } */
                            
                        }
                        	} catch (Throwable tmp241) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp241);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                				}
                			});
                	}
                }
                /* } */
                
            }
            	} catch (Throwable tmp236) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp236);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 304
public java.
                   lang.
                   String
                   toString(
                   ) {
        
//#line 305
return "FourierTransform: xbits = " +
        nBits1 +
        " ybits = " +
        nBits2;
    }
}
