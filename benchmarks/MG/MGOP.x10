/***************************************************************************************
                 An X10 implementation of the NPB3.0 MG 3D Benchmark 

This class implements the Poisson solver using the multigrid algorithm. For experimental 
purposes, different versions of those stencil operators are presented. The choice for 
overlapping computations and communications can be made by setting the corresponding flag 
in class Util. To fully express the concurrency in the algorithm, foreach loop should be 
used to iterate over local arrays at each place. In the prototype implementation of x10, 
doing so might not be optimal (too many threads) compared with using for loop. However, the
production version of X10 compiler and runtime should be responsible for optimizing foreach 
loops based on the available resources.

Abstract performance metrics (in terms of cycles) are inserted. Flags in class Util can be set 
to determine which part of them are output.

Related classes: MGDriver, LevelData, Util

Author: Tong Wen, IBM Research

Date:   04/04/06
        05/19/06 Correction bugs are fixed in applyOpP and applyOpQ
        11/06/06 Clean up comments
        
        (C) Copyright IBM Corp. 2006
**************************************************************************************/

public class MGOP {
	/*The abstract peformance metrics are in cycles. 
	  An integer operation is assumed to be as half expensive as a Flop.*/
	public static final boolean PERF_On=Util.PERF_OUTPUT;
	public static final double PERF_Comp=1.0/Util.FP_PERCLOCK;
	public static final double PERF_CommL=Util.COMM_LATENCY*Util.CLOCK_SPEED;
	public static final double PERF_CommB=((double)Util.CLOCK_SPEED/(double)Util.COMM_BANDWIDTH)*8.0;
	public static final boolean PERF_InLoop=Util.IN_LOOP;
	public static final boolean PERF_CompOnly=Util.COMP_ONLY;
	public static final boolean PERF_CommOnly=Util.COMM_ONLY;
	public static final boolean OVERLAPPED=Util.OVERLAP_COMMANDCOMP;
	//public static final boolean EXCHANGE_After=(OVERLAPPED?false:Util.EXCHANGE_AFTER); //complained by dep type
	public final  boolean EXCHANGE_After;
	/*coefficients of the stencil operators*/
        private static final region(:rank==1) reg = [0:3];

        public static final double Ac0  = -8.0/3.0;
        public static final double Ac1  = 0.0;
        public static final double Ac2  = 1.0/6.0;
        public static final double Ac3  = 1.0/12.0;
        public static final double Sac0 = -3.0/8.0;
        public static final double Sac1 = 1.0/32.0;
        public static final double Sac2 = -1.0/64.0;
        public static final double Sac3 = 0.0;
        public static final double Pc0  = 1.0/2.0;
        public static final double Pc1  = 1.0/4.0;
        public static final double Pc2  = 1.0/8.0;
        public static final double Pc3  = 1.0/16.0;

	/* the level below which all computation is done solely at place 0. 
	   Data structures are duplicated at place 0 when necessary. */
	private static final int P2SLEVEL=Util.P2SLEVEL-1;
	
	private final int m_size;
	private final region(:rank==3) m_problemDomain;
	private final int m_levels;
	private LevelData [:rank==1] m_r;
	private LevelData [:rank==1] m_z;
	private LevelData m_tempLD;
	
	
	public MGOP(final int a_size){
                boolean temp_EXCHANGE_After = false;
		if (Util.OVERLAP_COMMANDCOMP)
			temp_EXCHANGE_After=false;
		else
			temp_EXCHANGE_After=Util.EXCHANGE_AFTER;
                EXCHANGE_After = temp_EXCHANGE_After;
		
		// assert Util.powerOf2(a_size);
		int i = 0; 
                int j = 0; 
                int k = 0;
		
		m_size=a_size;
		m_problemDomain=[0:a_size-1,0:a_size-1,0:a_size-1];
                final int log_a_size = Util.log2(a_size);
		m_levels = log_a_size;

		if (P2SLEVEL>0){
			i=Util.pow2(P2SLEVEL);j=i*i*i;
			// assert (j>=Util.N_PLACES && P2SLEVEL<log_a_size-1); //make sure each place has at least one array element
		}
		else{
			// assert Util.N_PLACES<=8; //the base size is 2 by 2 by 2.
		}
		/* building distributed arrays at each refinement level */ 
                final dist(:rank==1) d = [0:log_a_size] -> here;
		m_r=new LevelData [d] (point(:rank==1) p) {
		   return new LevelData(Util.pow2(p[0]+1),p[0]>=P2SLEVEL); };
                m_z=new LevelData [d] (point(:rank==1) p) {
		   return new LevelData(Util.pow2(p[0]+1),p[0]>=P2SLEVEL); };
		if (P2SLEVEL>0) m_tempLD=new LevelData(Util.pow2(P2SLEVEL),true);
		System.out.println("Overlapping communication and computation? "+OVERLAPPED+". If not, doing exchange after computation? "+temp_EXCHANGE_After);
	}
	
	/*a_res=a_res-A(a_arg)*/

	public void computeResidual2(final LevelData RES, final LevelData a_arg){
		
		finish ateach(point(:rank==1) [i]:RES.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=RES.getArray(i);
		        final double [:rank==3] arg=a_arg.getArray(i);
			/*apply A on the inner region*/
			region(:rank==3) R=RES.getInnerRegion(i); //removed final
			//foreach(point p:R){ // 23 addition+3 multiplication	
			for(point(:rank==3) p:R){  
				double d0=arg[p];
                                double d1 = 0;
				//d1=0; for(int j=0;j<Util.DIFF1.length;j++) d1+=arg[p+Util.DIFF1[j]];
				double d2=Util.sumDIFF2(p,arg);
				double d3=Util.sumDIFF3(p,arg);
				res[p] = res[p] - (Ac0*d0+Ac2*d2+Ac3*d3);
			}
		}
		if (EXCHANGE_After) finish RES.exchange();
	}
	
	/*a_res=a_arg1-A(a_arg2)*/
	private void computeResidual3(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2){
		if (OVERLAPPED) 
			ComputeResidual_Overlapped(a_res, a_arg1, a_arg2);
		else
			ComputeResidual(a_res, a_arg1,a_arg2);
	}
	
	private void ComputeResidual(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2){
		if (!EXCHANGE_After) finish a_arg2.exchange();
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg1=a_arg1.getArray(i);
		        final double [:rank==3] arg2=a_arg2.getArray(i);
			/*apply A on the inner region*/
			region(:rank==3) R=a_res.getInnerRegion(i); // removed final
			//foreach(point p:R){  // 23 addition+3 multiplication
			for (point(:rank==3) p:R){	
				double d0=arg2[p];
				// double d1;
				//d1=0; for(int j=0;j<Util.DIFF1.length;j++) d1+=arg2[p+Util.DIFF1[j]];
				double d2=Util.sumDIFF2(p,arg2);
				double d3=Util.sumDIFF3(p,arg2);
				res[p]=arg1[p]-Ac0*d0-Ac2*d2-Ac3*d3;
			}
		}
		if (EXCHANGE_After) finish a_res.exchange();
	}
	/*Updating the  outer boundary values and Computing on the inner region are overlapped.*/	
	private void ComputeResidual_Overlapped1(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2){	
	  finish{	
		a_arg2.exchange();
		ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg1=a_arg1.getArray(i);
		        final double [:rank==3] arg2=a_arg2.getArray(i);
			/*apply A on the inner region*/
			region(:rank==3) R=a_res.getINNERRegion(i); //remove final
			//foreach(point p:R){  
			for (point(:rank==3) p:R){//23 addition+3 multiplication	
				double d0=arg2[p];
				//d1=0; for(int j=0;j<Util.DIFF1.length;j++) d1+=arg2[p+Util.DIFF1[j]];
				double d2=Util.sumDIFF2(p,arg2);
				double d3=Util.sumDIFF3(p,arg2);
				res[p]=arg1[p]-Ac0*d0-Ac2*d2-Ac3*d3;
			}
		}
	  }
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg1=a_arg1.getArray(i);
		        final double [:rank==3] arg2=a_arg2.getArray(i);
			/*apply A on the inner region*/
			region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //remove final
			//foreach(point p:R){  
			for (point(:rank==3) p:R){//23 addition+3 multiplication	
				double d0=arg2[p];
				double d2=Util.sumDIFF2(p,arg2);
				double d3=Util.sumDIFF3(p,arg2);
				res[p]=arg1[p]-Ac0*d0-Ac2*d2-Ac3*d3;
			}
		}
	}
	/*fully overlapped version*/	
	private void ComputeResidual_Overlapped(final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2){
		  finish async(here) {	
			ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
				final double [:rank==3] res=a_res.getArray(i);
			        final double [:rank==3] arg1=a_arg1.getArray(i);
			        final double [:rank==3] arg2=a_arg2.getArray(i);
				/*apply A on the inner region*/
				region(:rank==3) R=a_res.getINNERRegion(i); //removed final
				//foreach(point p:R){  
				for (point(:rank==3) p:R){//23 addition+3 multiplication	
					double d0=arg2[p];
					//d1=0; for(int j=0;j<Util.DIFF1.length;j++) d1+=arg2[p+Util.DIFF1[j]];
				        double d2=Util.sumDIFF2(p,arg2);
				        double d3=Util.sumDIFF3(p,arg2);
					res[p]=arg1[p]-Ac0*d0-Ac2*d2-Ac3*d3;
				}
			}
			
			finish a_arg2.exchange(); //If change a_arg2 to a wrong one such as a_arg, compiler can't tell the name of this file.
				
			ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
				final double [:rank==3] res=a_res.getArray(i);
			        final double [:rank==3] arg1=a_arg1.getArray(i);
			        final double [:rank==3] arg2=a_arg2.getArray(i);
				/*apply A on the inner region*/
				region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //removed final
				//foreach(point p:R){  
				for (point(:rank==3) p:R){//23 addition+3 multiplication	
					double d0=arg2[p];
				        double d2=Util.sumDIFF2(p,arg2);
				        double d3=Util.sumDIFF3(p,arg2);
					res[p]=arg1[p]-Ac0*d0-Ac2*d2-Ac3*d3;
				}
			}	
		}
	}
			
	/*a_res=a_res+S(a_arg)*/
	private void smooth(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom){
		if (OVERLAPPED) 
			Smooth_Overlapped(a_res, a_arg, a_isBottom);
		else
			Smooth(a_res, a_arg,a_isBottom);
	}
	private void Smooth(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom){
		if (!EXCHANGE_After) finish a_arg.exchange();
		//final double [.] Sc=Sac; //this statement will make compiler (TypeChecker) in infite loops.
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg=a_arg.getArray(i);
			/*applyOpS is on the inner region*/
			region(:rank==3) R=a_res.getInnerRegion(i); //removed final
			//foreach(point p:R){
			for(point(:rank==3) p:R){//21 addition 3 multiplication	
				double d0=arg[p];
				double d1=Util.sumDIFF1(p,arg);
				double d2=Util.sumDIFF2(p,arg);
				//d3=0; for(int j=0;j<Util.DIFF3.length;j++) d3+=arg2[p+Util.DIFF3[j]];
				//if (a_isBottom)
					//res[p]=Sc[0]*d0+Sc[1]*d1+Sc[2]*d2;
				//else
					res[p] = res[p] + Sac0*d0+Sac1*d1+Sac2*d2;
			}
		}	
		if (EXCHANGE_After) finish a_res.exchange();
	}
	/*Updating the  outer boundary values and Computing on the inner region are overlapped.*/	
	private void Smooth_Overlapped1(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom){
	  finish{
		a_arg.exchange();
		ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg=a_arg.getArray(i);
			/*applyOpS is on the inner region*/
			region(:rank==3) R=a_res.getINNERRegion(i); //removed final
			//foreach(point p:R){
			for(point(:rank==3) p:R){//21 addition 3 multiplication	
				double d0=arg[p];
				double d1=Util.sumDIFF1(p,arg);
				double d2=Util.sumDIFF2(p,arg);
				res[p] = res[p] + Sac0*d0+Sac1*d1+Sac2*d2;
			}
		}
	  }	
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] res=a_res.getArray(i);
		        final double [:rank==3] arg=a_arg.getArray(i);
			/*applyOpS is on the inner region*/
			region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //removed final
			//foreach(point p:R){
			for(point(:rank==3) p:R){//21 addition 3 multiplication	
				double d0=arg[p];
				double d1=Util.sumDIFF1(p,arg);
				double d2=Util.sumDIFF2(p,arg);
				res[p] = res[p] + Sac0*d0+Sac1*d1+Sac2*d2;
			}
		}
	}
	/*fully overlapped version*/	
	private void Smooth_Overlapped(final LevelData a_res, final LevelData a_arg, final boolean a_isBottom){
		  finish async(here) {
			ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
				final double [:rank==3] res=a_res.getArray(i);
			        final double [:rank==3] arg=a_arg.getArray(i);
				/*applyOpS is on the inner region*/
				region(:rank==3) R=a_res.getINNERRegion(i); //removed final
				//foreach(point p:R){
				for(point(:rank==3) p:R){//21 addition 3 multiplication	
					double d0=arg[p];
				        double d1=Util.sumDIFF1(p,arg);
				        double d2=Util.sumDIFF2(p,arg);
					res[p] = res[p] + Sac0*d0+Sac1*d1+Sac2*d2;
				}
			}
			
			finish a_arg.exchange();
			ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
				final double [:rank==3] res=a_res.getArray(i);
			        final double [:rank==3] arg=a_arg.getArray(i);
				/*applyOpS is on the inner region*/
				region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //remove final
				//foreach(point p:R){
				for(point(:rank==3) p:R){//21 addition 3 multiplication	
					double d0=arg[p];
				        double d1=Util.sumDIFF1(p,arg);
				        double d2=Util.sumDIFF2(p,arg);
					res[p] = res[p] + Sac0*d0+Sac1*d1+Sac2*d2;
				}
				}	
		}		
	}
			
	/*a_res=P(a_arg)*/
	private void applyOpP3(final LevelData a_res, final LevelData a_arg, final int a_level){
		if (a_level==P2SLEVEL){ //a_level is the leve id of a_arg
			applyOpP2(m_tempLD, a_arg);
			/* copy m_tempLD to a_res */
				final double [:rank==3] res=a_res.getArray(0);
				//foreach(point [i]:m_tempLD.getPlaces().region){
				//for(point [i]:m_tempLD.getPlaces().region){	
				finish ateach(point(:rank==1) [i]:m_tempLD.getPlaces()){		
					double [:rank==3] temp=m_tempLD.getArray(i); //removed final
					Util.arraycopy3(res, (region(:rank==3))m_tempLD.getInnerRegion(i), temp);
				}
		}	
		else
			applyOpP2(a_res,a_arg);
		if (EXCHANGE_After) finish a_res.exchange();
	}
	private void applyOpP2(final LevelData a_res, final LevelData a_arg){
		if (OVERLAPPED) 
			ApplyOpP_Overlapped(a_res, a_arg);
		else
			ApplyOpP(a_res, a_arg);
	}
	private void ApplyOpP(final LevelData a_res, final LevelData a_arg){
		if (!EXCHANGE_After) finish a_arg.exchange();
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpS is on the inner region*/
                        // Bad place access in the next line:
			region(:rank==3) R=a_res.getInnerRegion(i); //removed final
			//foreach(point pp:R){ 
			for(point(:rank==3) pp:R){//flops:29 addition+4 multiplication; integer: 1 addition 1 mult. 	
				point(:rank==3) p=pp*2+[1,1,1]; //This is the formula to use. But no shift is better
				double d0=arg[p];
						double d1=Util.sumDIFF1(p,arg);
						double d2=Util.sumDIFF2(p,arg);
						double d3=Util.sumDIFF3(p,arg);
				res[pp]=Pc0*d0+Pc1*d1+Pc2*d2+Pc3*d3;
			}
		}	
	}
	/*Updating the  outer boundary values and Computing on the inner region are overlapped.*/	
	private void ApplyOpP_Overlapped1(final LevelData a_res, final LevelData a_arg){
	  finish{	
		a_arg.exchange();
		ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpS is on the inner region*/
			region(:rank==3) R=a_res.getINNERRegion(i); //removed final
			//foreach(point pp:R){ 
			for(point(:rank==3) pp:R){//flops:29 addition+4 multiplication; integer: 1 addition 1 mult. 	
				point(:rank==3) p=pp*2+[1,1,1]; //This is the formula to use. But no shift is better
				double d0=arg[p];
						double d1=Util.sumDIFF1(p,arg);
						double d2=Util.sumDIFF2(p,arg);
						double d3=Util.sumDIFF3(p,arg);
				res[pp]=Pc0*d0+Pc1*d1+Pc2*d2+Pc3*d3;
			}
		}
	  }
	  finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpS is on the inner region*/
			region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //removed final
			//foreach(point pp:R){ 
			for(point(:rank==3) pp:R){//flops:29 addition+4 multiplication; integer: 1 addition 1 mult. 	
				point(:rank==3) p=pp*2+[1,1,1]; //This is the formula to use. But no shift is better
				double d0=arg[p];
						double d1=Util.sumDIFF1(p,arg);
						double d2=Util.sumDIFF2(p,arg);
						double d3=Util.sumDIFF3(p,arg);
				res[pp]=Pc0*d0+Pc1*d1+Pc2*d2+Pc3*d3;
			}
		}
	}
	/*fully overlapped version*/  
	private void ApplyOpP_Overlapped(final LevelData a_res, final LevelData a_arg){
		  finish async(here) {	
				ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
					final double [:rank==3] arg=a_arg.getArray(i);
				        final double [:rank==3] res=a_res.getArray(i);
					/*applyOpS is on the inner region*/
					region(:rank==3) R=a_res.getINNERRegion(i); //removed final
					//foreach(point pp:R){ 
					for(point(:rank==3) pp:R){//flops:29 addition+4 multiplication; integer: 1 addition 1 mult. 	
						point(:rank==3) p=pp*2+[1,1,1]; //This is the formula to use. But no shift is better
						double d0=arg[p];
						double d1=Util.sumDIFF1(p,arg);
						double d2=Util.sumDIFF2(p,arg);
						double d3=Util.sumDIFF3(p,arg);
						res[pp]=Pc0*d0+Pc1*d1+Pc2*d2+Pc3*d3;
					}
				}
			
				finish a_arg.exchange();
			
				ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
					final double [:rank==3] arg=a_arg.getArray(i);
				        final double [:rank==3] res=a_res.getArray(i);
					/*applyOpS is on the inner region*/
					region(:rank==3) R=a_res.getInnerRegion(i)-a_res.getINNERRegion(i); //removed final
					//foreach(point pp:R){ 
					for(point(:rank==3) pp:R){//flops:29 addition+4 multiplication; integer: 1 addition 1 mult. 	
						point(:rank==3) p=pp*2+[1,1,1]; //This is the formula to use. But no shift is better
						double d0=arg[p];
						double d1=Util.sumDIFF1(p,arg);
						double d2=Util.sumDIFF2(p,arg);
						double d3=Util.sumDIFF3(p,arg);
						res[pp]=Pc0*d0+Pc1*d1+Pc2*d2+Pc3*d3;
					}
				}
			
		}		
	}
				
	/*a_res=Q(a_arg)*/
	private void applyOpQ3(final LevelData a_res, final LevelData a_arg, final int a_level){
		if (a_level==P2SLEVEL-1){//a_level is the level id of a_arg
			/* copy a_arg to m_tempLD */
			final double [:rank==3] arg=a_arg.getArray(0);
			finish ateach(point(:rank==1) [i]:m_tempLD.getPlaces()){	
				double [:rank==3] temp=m_tempLD.getArray(i); //removed final
				Util.arraycopy3(temp, (region(:rank==3))temp.region, arg);
			}
			applyOpQ2(a_res, m_tempLD);
		}	
		else {
			applyOpQ2(a_res,a_arg);
                }
	}
	private void applyOpQ2(final LevelData a_res, final LevelData a_arg){
		if (OVERLAPPED) 
			ApplyOpQ_Overlapped(a_res, a_arg);
		else
			ApplyOpQ(a_res, a_arg);
	}

	private void ApplyOpQ(final LevelData a_res, final LevelData a_arg){
		if (!EXCHANGE_After) finish a_arg.exchange();
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpQ is on the shrinked region*/
                        // Bad place access in the next line
			region(:rank==3) R=a_arg.getShrinkedRegion(i); //this is the right formula to use
			//foreach(point p:R){
			for(point(:rank==3) p:R){//flop: 35 addition+8 multiplication; integer: 36 addition+1 mult
				double d=0;
				point(:rank==3) pp=p*2+[1,1,1]; 
				for (point(:rank==3) o[i2,j2,k2]: Util.UNIT_CUBE){
					d=0;
					// for (point(:rank==3) q: Util.QREGIONS[o]) d+=arg[p+q];
					for (point(:rank==3) [i1,j1,k1]: Util.QREGIONS[o]) {
                                            final point(:rank==3) temp = p + [i1,j1,k1];
                                            d = d + arg[temp];
                                        }
					res[pp+[i2,j2,k2]]=d/Util.QREGIONS[o].size();
				}
			}
		}	
	}
	/*Updating the  outer boundary values and Computing on the inner region are overlapped.*/	
	private void ApplyOpQ_Overlapped1(final LevelData a_res, final LevelData a_arg){
	  finish{	
		a_arg.exchange();
		ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpQ is on the shrinked region*/
			region(:rank==3) R=a_arg.getINNERRegion(i); //this is the right formula to use
			//foreach(point p:R){
			for(point(:rank==3) p:R){//flop: 35 addition+8 multiplication; integer: 36 addition+1 mult
				double d=0;
				point(:rank==3) pp=p*2+[1,1,1]; 
				for (point(:rank==3) o[i2,j2,k2]: Util.UNIT_CUBE){
					d=0;
                                        // for (point(:rank==3) q: Util.QREGIONS[o]) d+=arg[p+q];
                                        for (point(:rank==3) [i1,j1,k1]: Util.QREGIONS[o]) {
                                            final point(:rank==3) temp = p + [i1,j1,k1];
                                            d = d + arg[temp];
                                        }
					res[pp+[i2,j2,k2]]=d/Util.QREGIONS[o].size();
				}
			}
		}	
	  }
		finish ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
			final double [:rank==3] arg=a_arg.getArray(i);
		        final double [:rank==3] res=a_res.getArray(i);
			/*applyOpQ is on the shrinked region*/
			region(:rank==3) R=a_arg.getShrinkedRegion(i)-a_arg.getINNERRegion(i); //this is the right formula to use
			//foreach(point p:R){
			for(point(:rank==3) p:R){//flop: 35 addition+8 multiplication; integer: 36 addition+1 mult
				double d=0;
				point(:rank==3) pp=p*2+[1,1,1]; 
				for (point(:rank==3) o[i2,j2,k2]: Util.UNIT_CUBE){
					d=0;
                                        // for (point(:rank==3) q: Util.QREGIONS[o]) d+=arg[p+q];
                                        for (point(:rank==3) [i1,j1,k1]: Util.QREGIONS[o]) {                                                        final point(:rank==3) temp = p + [i1,j1,k1];
                                            d = d + arg[temp];
                                        }
					res[pp+[i2,j2,k2]]=d/Util.QREGIONS[o].size();
				}
			}
		}	
	}
	/*fully overlapped version*/	
	private void ApplyOpQ_Overlapped(final LevelData a_res, final LevelData a_arg){
		  finish async(here) {	
				ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
					final double [:rank==3] arg=a_arg.getArray(i);
				        final double [:rank==3] res=a_res.getArray(i);
					/*applyOpQ is on the shrinked region*/
					region(:rank==3) R=a_arg.getINNERRegion(i); //this is the right formula to use
					//foreach(point p:R){
					for(point(:rank==3) p:R){//flop: 35 addition+8 multiplication; integer: 36 addition+1 mult
						double d=0;
						point(:rank==3) pp=p*2+[1,1,1]; 
						for (point(:rank==3) o[i2,j2,k2]: Util.UNIT_CUBE){
							d=0;
                                                        // for (point(:rank==3) q: Util.QREGIONS[o]) d+=arg[p+q];
                                                        for (point(:rank==3) [i1,j1,k1]: Util.QREGIONS[o]) {                                                                               final point(:rank==3) temp = p + [i1,j1,k1];
                                                            d = d + arg[temp];
                                                        }
							res[pp+[i2,j2,k2]]=d/Util.QREGIONS[o].size();
						}
					}
					
				}	
			
				finish a_arg.exchange();
				
				ateach(point(:rank==1) [i]:a_res.getPlaces()){ /*at each place.*/
					final double [:rank==3] arg=a_arg.getArray(i);
				        final double [:rank==3] res=a_res.getArray(i);
					/*applyOpQ is on the shrinked region*/
					region(:rank==3) R=a_arg.getShrinkedRegion(i)-a_arg.getINNERRegion(i); //this is the right formula to use
					//foreach(point p:R){
					for(point(:rank==3) p:R){//flop: 35 addition+8 multiplication; integer: 36 addition+1 mult
						double d=0;
						point(:rank==3) pp=p*2+[1,1,1]; 
						for (point(:rank==3) o[i2,j2,k2]: Util.UNIT_CUBE){
							d=0;
                                                        // for (point(:rank==3) q: Util.QREGIONS[o]) d+=arg[p+q];
                                                        for (point(:rank==3) [i1,j1,k1]: Util.QREGIONS[o]) {                                                                               final point(:rank==3) temp = p + [i1,j1,k1];
                                                            d = d + arg[temp];
                                                        }
							res[pp+[i2,j2,k2]]=d/Util.QREGIONS[o].size();
						}
					}
				}
		}		
	}
				
	public double MGSolve(final LevelData a_u, final LevelData a_v, final int a_its){
		int l=m_levels-1; 
		m_r[l].setLevelData(a_v);
                System.out.println("The init residual norm is "+m_r[l].norm2());
		double res=0.0;
                int i=0;
		while (i<a_its) {
			System.out.println("Iteration "+i);
			MG();
			a_u.add(m_z[l]);
			computeResidual3(m_r[l],a_v,a_u);
			res=m_r[l].norm2();
			System.out.println("The residual norm is "+res);
                        i++;
		}
		return res;
	}
	
	/*the multigrid algorithm (V-Cycle)*/
	private void MG(){
                int i2=m_levels-1;
		while (i2>0) {
                    applyOpP3(m_r[i2-1], m_r[i2],i2);
                    i2--;
                }
		m_z[0].set(0);smooth(m_z[0],m_r[0], true); 
		//System.out.println("z[0]="+m_z[0].norm2());
                int i3=1;
		while (i3<m_levels) {
			applyOpQ3(m_z[i3], m_z[i3-1], i3-1);
			computeResidual2(m_r[i3], m_z[i3]);
			smooth(m_z[i3], m_r[i3], false);
                        i3++;
		}	
	}
	
	private double residualNorm(){
		int l=m_levels-1;
		return m_r[l].norm2(); 
	}
	
// public static void main(String[] a) {
//     /*	
//         final MGOP MG=new MGOP(32);
//     	System.out.println("number of levels= "+MG.m_levels);
//     	final int lv=MG.m_levels;
//     	MG.m_z[1].set(1); MG.m_z[1].print();
//     	//MG.smooth(MG.m_r[lv-1], MG.m_z[lv-1], false);
//     	//MG.applyOpP(MG.m_z[0],MG.m_z[1], 1);
//     	MG.applyOpQ(MG.m_z[2],MG.m_z[1], 1);
//     	MG.m_z[2].print();
//     */	
//  	
//    	System.out.println("This is MGOP, finished!");
//    
//    }
}
