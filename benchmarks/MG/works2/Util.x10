/*****************************************************************************************
           For X10 implementations of the NPB3.0 Benchmarks 

Constants, flags, and widely used methods are contained in this class.

Author: Tong Wen, IBM Research
Date:   04/04/06
        11/06/06 clean up comments
        
        (C) Copyright IBM Corp. 2006
*****************************************************************************************/
public class Util {
	/*For performance modeling. The abstract performance metrics are in cycles, that is,
	  relative to clock speed. However, the following parameters are in real measure. So 
	  the conversion has to be done. The formula can be found in MGOP for instance. Or 
	  one can just set those parameters in cycles directly.*/
	public static final boolean PERF_OUTPUT=true;
	public static final double CLOCK_SPEED=375; //MHZ
	public static final double FP_PERCLOCK=4;
	public static final double COMM_LATENCY=1; //us
	public static final double COMM_BANDWIDTH=2000; //MBytes/s
	public static final boolean IN_LOOP=false; //measure cost inside for/foreach loop. Less acurate due to rounding off to int.
	public static final boolean COMP_ONLY=false; //only measure computation cost
	public static final boolean COMM_ONLY=false; //only measure communication cost. if both are ture, then no one is measured.
	public static final int THREADS_PERFOREACH=1;
	
	public static final boolean OVERLAP_COMMANDCOMP=false; //overlap exchange and computation
	// if the above is true, EXCHAGE_AFTER must be set false
	public static final boolean EXCHANGE_AFTER=false; //update of ghost values in MG after or before computation. 
	/* P2SLEVEL is the level below which computation is done solely at place 0. 
	   The level id starts from 0. At level i, the size is 2^ix2^ix2^i. 
	   There is no computation at level 0.
	   P2SLEVEL should smaller than log2(problem size in one dimension).
	*/
	public static final int P2SLEVEL=1;
	/*N_PLACES<=2^(3*max(P2SLEVEL,1)). To make sure each place must have at least one element of the array.*/
	public static final int N_PLACES=place.MAX_PLACES; 
	public static final dist(:rank==1) ALLPLACES=(dist(:rank==1))dist.UNIQUE;

	/*points in the 3x3x3 stencil*/
	// public static final point [] DIFF1={[1,0,0],[-1,0,0],[0,1,0],[0,-1,0],[0,0,1],[0,0,-1]};
	// public static final point [] DIFF2={[1,1,0],[1,-1,0],[-1,1,0],[-1,-1,0], [1,0,1],[1,0,-1],[-1,0,1],[-1,0,-1],
	// [0,1,1],[0,1,-1],[0,-1,1],[0,-1,-1]};
	// public static final point [] DIFF3={[1,1,1],[1,1,-1], [1,-1,1],[1,-1,-1],[-1,1,1],[-1,1,-1], [-1,-1,1],[-1,-1,-1]};

        public static double sumDIFF1(point(:rank==3) p, double [:rank==3] arg) {
           double d1=0; 
              d1+=arg[p+[1,0,0]];
              d1+=arg[p+[-1,0,0]];
              d1+=arg[p+[0,1,0]];
              d1+=arg[p+[0,-1,0]];
              d1+=arg[p+[0,0,1]];
              d1+=arg[p+[0,0,-1]];
           return d1;
        }

        public static double sumDIFF2(point(:rank==3) p, double [:rank==3] arg) {
           double d1=0; 
              d1+=arg[p+[1,1,0]];
              d1+=arg[p+[1,-1,0]];
              d1+=arg[p+[-1,1,0]];
              d1+=arg[p+[-1,-1,0]];
              d1+=arg[p+[1,0,1]];
              d1+=arg[p+[1,0,-1]];
              d1+=arg[p+[-1,0,1]];
              d1+=arg[p+[-1,0,-1]];
              d1+=arg[p+[0,1,1]];
              d1+=arg[p+[0,1,-1]];
              d1+=arg[p+[0,-1,1]];
              d1+=arg[p+[0,-1,-1]];
           return d1;
        }

        public static double sumDIFF3(point(:rank==3) p, double [:rank==3] arg) {
           double d1=0; 
              d1+=arg[p+[1,1,1]];
              d1+=arg[p+[1,1,-1]];
              d1+=arg[p+[1,-1,1]];
              d1+=arg[p+[1,-1,-1]];
              d1+=arg[p+[-1,1,1]];
              d1+=arg[p+[-1,1,-1]];
              d1+=arg[p+[-1,-1,1]];
              d1+=arg[p+[-1,-1,-1]];
           return d1;
        }

	public static final region(:rank==3) UNIT_CUBE = [0:1,0:1,0:1];
	public static final region(:rank==3) value [:rank==3] QREGIONS = (region(:rank==3) value [:rank==3]) new region(:rank==3) value [UNIT_CUBE] (point(:rank==3) p[a,b,c]) { return [0:a,0:b,0:c];};
	/*there are two faces of the problem domain in each space dimension*/
	public static final int LOW=0; 
	public static final int HIGH=1;
	
	public static boolean powerOf2(int a_int){
		int i=(int)Math.abs(a_int);
		if (i==0) return false;
		else{
			if (i!=(pow2(log2(i)))) return false;
		}
		return true;
	}
	public static int log2(int a_int){
		return (int)(Math.log(a_int)/Math.log(2));
	}
	public static int pow2(int a_int){
		return (int)Math.pow(2,a_int);
	}
// public static region(:rank==3) boundary(region(:rank==3) a_R, int a_direction){
// 	return boundary(a_R, a_direction,[0,0,0]);
// 	}
	/*compute the boundary  at each face*/
	public static region(:rank==3) boundary(region(:rank==3) a_R, int a_direction, int a_padSize0, int a_padSize1, int a_padSize2 ){
		/*direction=+/-{1,2,3} for x,y,z directions. The negative value is for the low side*/
		int i=(int)Math.abs(a_direction);
		boolean IsHigh=(a_direction>0);
		int low0 = a_R.rank(0).low();
		int low1 = a_R.rank(1).low();
		int low2 = a_R.rank(2).low();
		int high0= a_R.rank(0).high();
		int high1= a_R.rank(1).high();
		int high2= a_R.rank(2).high();
		int r=3; // a_R.rank;
		if (i<=r && r==3){
			if (IsHigh){
				return [(i==1?high0+1:low0)-a_padSize0:(i==1?high0+1:high0)+a_padSize0,
				        (i==2?high1+1:low1)-a_padSize1:(i==2?high1+1:high1)+a_padSize1,
				        (i==3?high2+1:low2)-a_padSize2:(i==3?high2+1:high2)+a_padSize2];
			}
			else{
				return [(i==1?low0-1:low0)-a_padSize0:(i==1?low0-1:high0)+a_padSize0,
				        (i==2?low1-1:low1)-a_padSize1:(i==2?low1-1:high1)+a_padSize1,
				        (i==3?low2-1:low2)-a_padSize2:(i==3?low2-1:high2)+a_padSize2];
			}
		}
		else{
			System.out.println("MG3TongValue1.boundary():Warning! invalid inputs!");
			return [0:-1,0:-1,0:-1];
		}
	}
	
	/*It is assumed that the arraycopy methods here are called from the place where a_dest resides.
	  The following methods should be replaced by the built-in array copy method when it is available*/ 
// public static void arraycopy2(final double [.] a_dest, final double[.]  a_src){	
//      	  final region R = ((region(:rank==a_dest.rank))a_src.region)&&((region(:rank==a_dest.rank))a_dest.region); 
//      	  //finish foreach( point p : R){
//      	  finish for( point p : R){	  
//      	    a_dest[p]= future(a_src.distribution.get(p)) {a_src[p]}.force();
//      	  }	  
      	  //for( point p : R) a_dest[p]=a_src[p]; //implicit syntax
// }

	public static void arraycopy3(final double [:rank==3] a_dest, 
                                      final region(:rank==3) a_destR, 
                                      final double [:rank==3] a_src){
  	  for( point(:rank==3) p : a_destR) { 
             // a_dest[p]= a_src[p]; 
             final place h = here;        
             async(a_src.distribution.get(p)) { 
               final double d = a_src[p];
               async(h) { a_dest[p] = d; }
             }
          }
	}

	public static void arraycopy4(final double [:rank==3] a_dest, 
                                      final region(:rank==3) a_destR, 
                                      final double [:rank==3] a_src, 
                                      final int a_trans0,
                                      final int a_trans1,
                                      final int a_trans2){
    	  for (point(:rank==3) p: a_destR) {
              // a_dest[p]=a_src[p+[a_trans0,a_trans1,a_trans2]]; 
             final place h = here;        
             async(a_src.distribution.get(p+[a_trans0,a_trans1,a_trans2])) { 
               final double d = a_src[p+[a_trans0,a_trans1,a_trans2]];
               async(h) { a_dest[p] = d; }
             }
          }
	}

	public Util(){}
	
}
