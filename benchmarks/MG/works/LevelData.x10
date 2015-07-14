/******************************************************************************************
             An X10 implementation of the NPB3.0 MG 3D Benchmark 

This class implements the distributed array for one level of refinement in the MG algorithm. 
It is implemented using the encapsulation approach rather than through a distribution. The 
reason is that each sub-array overlapps with each other because of the adding of a one-deep 
layer of ghost cells. The method exchange is used to update these ghost cells and also to 
apply the periodic physical boundary condtion.

For experimental purposes, a methods in this class may have different implementations. The 
choice of whether updating the ghost cells after each operation that modifies the values in 
inner region or only when the update is needed can be made by setting the corresponding flag 
in class Util. To fully express the concurrency in the algorithm, foreach loop may be used 
to iterate over local arrays at each place when the order of the iteration does not matter. 
In the current implementation, doing so may not be optimal (too many acitivities) compared 
with using for loop. However, the production version of X10 compiler and runtime should be 
responsible for optimizing foreach loops based on the available hardware resources.

Note that the default place is 0.

Related classes: MGOP, MGDriver, Util

Author: Tong Wen, IBM Research

Date:   04/04/06
Modified: 05/19/06
          Add methods PRINT() and getShrinkedRegion()
          Remove qualifier final before local array?
          08/08/06
          remove final qulifiers for the member declaration
          08/20/06
          add the new exchange method which can be used in parallel with computation
          11/06/06
          clean up comments
          12/07/2007 Change  m_boundaries to be an X10 2D array
          (C) Copyright IBM Corp. 2006
*******************************************************************************************/


//final public class LevelData {
public value LevelData {	
        public String toString() { return ""; }

	/*The abstract peformance metrics are in cycles. 
	  An integer operation is assumed to be as half expensive as a Flop.*/
	public static final boolean PERF_On=Util.PERF_OUTPUT;
	public static final double PERF_Comp=1.0/Util.FP_PERCLOCK;
	public static final double  PERF_CommL=Util.COMM_LATENCY*Util.CLOCK_SPEED;
	public static final double PERF_CommB=((double)Util.CLOCK_SPEED/(double)Util.COMM_BANDWIDTH)*8.0;
	public static final boolean PERF_InLoop=Util.IN_LOOP;
	public static final boolean PERF_CompOnly=Util.COMP_ONLY;
	public static final boolean PERF_CommOnly=Util.COMM_ONLY;
	//public static final boolean 
        //     EXCHANGE_After=
        //       (Util.OVERLAP_COMMANDCOMP?false:Util.EXCHANGE_AFTER);
        // complained by dep type
	public final boolean EXCHANGE_After;
	
	public static final int N_PLACES=Util.N_PLACES;
	public static final int HIGH=Util.HIGH; 
        public static final int LOW=Util.LOW;
	public static final dist(:rank==1) ALLPLACES=(dist(:rank==1))Util.ALLPLACES;
	
	private final int SIZE; /*problem size*/
	private final region(:rank==3) P_DOMAIN; /*problem domain*/
	private final boolean ISPARALLEL; /*distributed or not*/
	
	private final region(:rank==3) [:rank==1] m_regions;/* decomposition of the problem domain, one subdomain for each place */
	private final region(:rank==3)[:rank==1] m_REGIONs;/* with ghost cells or boundaries*/
	//region [] [] m_boundaries; /*boundary at each face*/
	private final region(:rank==3) [:rank==2] m_boundaries;
	
	private final dist(:rank==1) m_places;
	private final int m_numPlaces;

        private final region(:rank==3) m_placeGrid; /*3D index of each subregion*/

        private final int m_low0; 
        private final int m_low1; 
        private final int m_low2; 
        private final int m_hi0;
        private final int m_hi1;
        private final int m_hi2;
        private final int m_size0;
        private final int m_size1;
        private final int m_size2;
        private final int m_cut0;
        private final int m_cut1;
        private final int m_cut2;
        private final int m_block0; 
        private final int m_block1; 
        private final int m_block2; 
        private final int m_blockSize0;
        private final int m_blockSize1;
        private final int m_blockSize2;
        private final dist(:rank==3) [:rank==1] m_dist; 
        private final dist(:rank==3) [:rank==1] m_DIST;
        private final Wrapper [:rank==1] m_u; 

	
	
        public dist(:rank==1) getPlaces(){return m_places;}
        public double [:rank==3] getArray(final int a_idx){
                // assert (a_idx>=0 && a_idx<m_numPlaces);
                return (double[:rank==3])(m_u[a_idx].m_array);
        }
        public region(:rank==3) getInnerRegion(final int a_idx){
		// assert (a_idx>=0 && a_idx<m_numPlaces);
		return (region(:rank==3))get_m_regions(a_idx);
	}
	public region(:rank==3) getINNERRegion(final int a_idx){
		// assert (a_idx>=0 && a_idx<m_numPlaces);
		region(:rank==3) R=(region(:rank==3))m_regions[a_idx];
		return (region(:rank==3))( [R.rank(0).low()+1:R.rank(0).high()-1,R.rank(1).low()+1:R.rank(1).high()-1,R.rank(2).low()+1:R.rank(2).high()-1] );
	}
	public region(:rank==3) getShrinkedRegion(final int a_idx){
		// assert (a_idx>=0 && a_idx<m_numPlaces);
		region(:rank==3) R=(region(:rank==3))get_m_REGIONs(a_idx);
		return (region(:rank==3))( [R.rank(0).low():R.rank(0).high()-1,R.rank(1).low():R.rank(1).high()-1,R.rank(2).low():R.rank(2).high()-1] );
	}
	
	public region(:rank==3) getRegion(final int a_idx){
		// assert (a_idx>=0 && a_idx<m_numPlaces);
		return (region(:rank==3))m_REGIONs[a_idx];
	}
	/*for test purpose*/
	private void print(){
		finish ateach(point(:rank==1) [i]:m_places){
			double res=0;
			double [:rank==3] temp=(double [:rank==3])m_u[i].m_array; //remove final
			for (point(:rank==3) p:m_REGIONs[i]) {res+=Math.abs(temp[p]);}
			System.out.println("block at place "+i+" : "+temp.region+" sum of m_u="+res);
		}
	}
	/*for test purpose*/
	private void PRINT(){
		finish ateach(point(:rank==1) [i]:m_places){
			System.out.println("block at place "+i+" : ");
			double [:rank==3] temp=(double [:rank==3])m_u[i].m_array; //remove final
			int counter=0;
			for (point(:rank==3) p:m_regions[i]) {
				System.out.print (" ["+p+"]= "+temp[p]); counter++;
				if (counter==4){ System.out.print("\n"); counter=0;}
			}
			// System.out.flush(); 
                        System.out.println("");
		}
	}
	public double norm2(){
		final double [:rank==1] results=new double [m_places];
		finish ateach(point(:rank==1) [i]:m_places){
			double res=0;
			final double [:rank==3] temp=(double [:rank==3])m_u[i].m_array; 
			for (point(:rank==3) p: get_m_regions(i)) {   // m_regions[i]) {
                            // res+=temp[p]*temp[p];
                            final place h = here;
                            final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
                            final double[:rank==1] aRecv = new double[dRecv];
                            finish async (temp.distribution[p]) {
                               final double temp3 = temp[p]*temp[p];
                               async (h) { aRecv[0] = temp3; }
                            }
                            res += aRecv[0];
                        }
			results[i]=res;
			// if (PERF_On && (!PERF_CommOnly)) x10.lang.perf.addLocalOps((long)(m_regions[i].size()*PERF_Comp));
			if (PERF_On && (!PERF_CommOnly)) x10.lang.perf.addLocalOps((long)(get_m_regions(i).size()*PERF_Comp));
		}
		double temp=results.sum()/(SIZE*SIZE*SIZE);
		/*The cost is very small here, so we just ignore it*/
		return Math.sqrt(temp);
	}

	public void initialize(final int a_CLASS){
	    finish ateach(point(:rank==1) [i]:m_places){
		final double [:rank==3] temp=(double [:rank==3])m_u[i].m_array; 

/*
                final place h = here;
                final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
                final region(:rank==3)[:rank==1] aRecv = 
                     (region(:rank==3)[:rank==1]) new region(:rank==3)[dRecv];
                finish async (m_regions.distribution[i]) {
                   final region(:rank==3) temp2 = (region(:rank==3)) m_regions[i];
                   async (h) { aRecv[0] = temp2; }
                }
                final region(:rank==3) R = (region(:rank==3)) aRecv[0];
*/
                final region(:rank==3) R = get_m_regions(i);
		// final region(:rank==3) R=(region(:rank==3))m_regions[i]; 

                foreach (point(:rank==3) p[x,y,z] : temp) {
          	    	switch (a_CLASS) {
          	    	case 1:
		            if ((  ( (x== 0) && (y==11) && (z== 2) )
                                || ( (x==13) && (y== 8) && (z==17) )
                                || ( (x== 5) && (y==14) && (z== 0) )
                                || ( (x== 4) && (y==28) && (z==15) )
                                || ( (x==12) && (y== 2) && (z== 1) )
                                || ( (x== 5) && (y==17) && (z== 8) )
                                || ( (x==20) && (y==19) && (z==11) )
                                || ( (x==26) && (y==15) && (z==31) )
                                || ( (x== 8) && (y==25) && (z==22) )
                                || ( (x== 7) && (y==14) && (z==26) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=-1; 
                            }
          
		            if ((  ( (x== 7) && (y== 1) && (z==20) )
                                || ( (x==19) && (y==29) && (z==31) )
                                || ( (x== 2) && (y== 0) && (z== 3) )
                                || ( (x== 4) && (y==22) && (z== 3) )
                                || ( (x== 1) && (y==16) && (z==21) )
                                || ( (x==21) && (y==31) && (z== 6) )
                                || ( (x==12) && (y==15) && (z==12) )
                                || ( (x==30) && (y== 4) && (z==25) )
                                || ( (x==28) && (y== 0) && (z==28) )
                                || ( (x==17) && (y==26) && (z==17) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=1; 
                            }
          	    	    break;
          	    	case 2:
		            if ((  ( (x==38) && (y==60) && (z==51) )
                                || ( (x==50) && (y==15) && (z==23) )
                                || ( (x==18) && (y==45) && (z==36) )
                                || ( (x==25) && (y==14) && (z==36) )
                                || ( (x==26) && (y==25) && (z==25) )
                                || ( (x==32) && (y==37) && (z== 0) )
                                || ( (x==29) && (y==62) && (z==54) )
                                || ( (x==39) && (y==49) && (z==57) )
                                || ( (x==12) && (y==29) && (z==28) )
                                || ( (x==63) && (y==46) && (z==25) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=-1; 
                            }
          
		            if ((  ( (x==27) && (y==32) && (z==45) )
                                || ( (x==39) && (y== 0) && (z== 5) )
                                || ( (x==45) && (y==23) && (z==49) )
                                || ( (x==20) && (y==32) && (z==58) )
                                || ( (x==23) && (y==47) && (z==57) )
                                || ( (x==17) && (y==43) && (z==53) )
                                || ( (x== 8) && (y==16) && (z==48) )
                                || ( (x==51) && (y==46) && (z==26) )
                                || ( (x==58) && (y==19) && (z==62) )
                                || ( (x==58) && (y==15) && (z==54) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=1; 
                            }
          	 	    break;
          	        case 3:  case 4:// class A and B
		            if ((  ( (x==221) && (y== 40) && (z==238) )
                                || ( (x==152) && (y==160) && (z== 34) )
                                || ( (x== 80) && (y==182) && (z==253) )
                                || ( (x==248) && (y==168) && (z==155) )
                                || ( (x==197) && (y==  5) && (z==201) )
                                || ( (x== 90) && (y== 61) && (z==203) )
                                || ( (x== 15) && (y==203) && (z== 30) )
                                || ( (x== 99) && (y==154) && (z== 57) )
                                || ( (x==100) && (y==136) && (z==110) )
                                || ( (x==209) && (y==152) && (z== 96) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=-1; 
                            }
                  
		            if ((  ( (x== 52) && (y==207) && (z== 38) )
                                || ( (x==241) && (y==170) && (z== 12) )
                                || ( (x==201) && (y== 16) && (z==196) )
                                || ( (x==200) && (y== 81) && (z==207) )
                                || ( (x==113) && (y==121) && (z==205) )
                                || ( (x==210) && (y==  5) && (z==246) )
                                || ( (x== 43) && (y==192) && (z==232) )
                                || ( (x==174) && (y==244) && (z==162) )
                                || ( (x==  3) && (y==116) && (z==173) )
                                || ( (x== 55) && (y==118) && (z==165) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=1; 
                            }
          	            break;
          	        case 5: // class C
		            if ((  ( (x==397) && (y==310) && (z==198) )
                                || ( (x== 94) && (y==399) && (z==236) )
                                || ( (x==221) && (y==276) && (z== 59) )
                                || ( (x==342) && (y==137) && (z==166) )
                                || ( (x==381) && (y== 72) && (z==281) )
                                || ( (x==350) && (y==192) && (z==416) )
                                || ( (x== 16) && (y== 19) && (z==455) )
                                || ( (x==152) && (y==336) && (z==  8) )
                                || ( (x==400) && (y==502) && (z==447) )
                                || ( (x== 72) && (y==  0) && (z==105) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=-1; 
                            }
                  
		            if ((  ( (x==308) && (y==359) && (z==  9) )
                                || ( (x==  9) && (y==491) && (z==116) )
                                || ( (x==449) && (y==268) && (z==441) )
                                || ( (x==147) && (y==115) && (z==197) )
                                || ( (x==241) && (y== 85) && (z==  3) )
                                || ( (x==507) && (y== 41) && (z==125) )
                                || ( (x==161) && (y==278) && (z== 73) )
                                || ( (x==144) && (y== 91) && (z==310) )
                                || ( (x==201) && (y==  8) && (z== 49) )
                                || ( (x==149) && (y==399) && (z==329) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=1; 
                            }
          	            break;
          	        case 6: // class D
		            if ((  ( (x==186) && (y==374) && (z==694) )
                                || ( (x==773) && (y==345) && (z==474) )
                                || ( (x==478) && (y==874) && (z==804) )
                                || ( (x==306) && (y== 75) && (z==624) )
                                || ( (x==397) && (y==667) && (z== 49) )
                                || ( (x==606) && (y==199) && (z== 59) )
                                || ( (x==892) && (y== 70) && (z==361) )
                                || ( (x==844) && (y==261) && (z==252) )
                                || ( (x==221) && (y==906) && (z== 14) )
                                || ( (x== 85) && (y==327) && (z==232) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=-1; 
                            }
                  
		            if ((  ( (x==739) && (y==879) && (z==781) )
                                || ( (x==742) && (y==641) && (z==147) )
                                || ( (x==335) && (y==295) && (z==600) )
                                || ( (x==982) && (y==944) && (z==696) )
                                || ( (x==622) && (y==881) && (z==180) )
                                || ( (x==956) && (y==217) && (z==952) )
                                || ( (x==777) && (y==453) && (z==706) )
                                || ( (x==258) && (y==730) && (z==482) )
                                || ( (x==271) && (y== 75) && (z==815) )
                                || ( (x== 78) && (y==276) && (z==250) )
                                )
                                && R.contains(p)) { 
                                      temp[p]=1; 
                            }
          	            break;
          	    }
                }

	    }

	    if (EXCHANGE_After) finish exchange();
	}

        public void set(final double a_db){
                /*setting the inner value to 1*/
             	finish ateach(point(:rank==1) [i]:m_places){
          		final double [:rank==3] temp=(double [:rank==3])get_m_u(i).m_array; //remove final
          		for (point(:rank==3) p:get_m_regions(i)) temp[p]=a_db; 
           	}
           	if (EXCHANGE_After) finish exchange();
        }
        
        public void setLevelData(final LevelData a_LD){
           	/*setting the inner value to 1*/
           	finish ateach(point(:rank==1) [i]:m_places){
          		final double [:rank==3] u=(double [:rank==3])m_u[i].m_array; //remove final
          		final double [:rank==3] temp=a_LD.getArray(i);
                        // Bad place access in the following line:
                        // final region(:rank==3) mri = (region(:rank==3))m_regions[i];

/*
                        final place h = here;
                        final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
                        final region(:rank==3)[:rank==1] aRecv = 
                             (region(:rank==3)[:rank==1]) new region(:rank==3)[dRecv];
                        finish async (m_regions.distribution[i]) {
                           final region(:rank==3) temp3 = (region(:rank==3)) m_regions[i];
                           async (h) { aRecv[0] = temp3; }
                        }
                        final region(:rank==3) mri = (region(:rank==3)) aRecv[0];
*/
                        final region(:rank==3) mri = get_m_regions(i);
          		for (point(:rank==3) p: mri) { 
                            final double tp = temp[p];
                            async( u.distribution[p] ) { u[p]=tp; }
                        }
           	}
           	if (EXCHANGE_After) finish exchange();
        }
	
	public void add(final LevelData a_LD){
		/*setting the inner value to 1*/
		finish ateach(point(:rank==1) [i]:m_places){
			final double [:rank==3] u=(double [:rank==3])get_m_u(i).m_array; //remove final
			final double [:rank==3] temp=a_LD.getArray(i);
			for (point(:rank==3) p:get_m_regions(i)){
				u[p]+=temp[p]; 
				if (PERF_On && (!PERF_CommOnly) && PERF_InLoop) x10.lang.perf.addLocalOps((long)(1.0*PERF_Comp));
			}
			if (PERF_On && (!PERF_CommOnly) && (!PERF_InLoop)) x10.lang.perf.addLocalOps((long)(get_m_regions(i).size()*PERF_Comp));
		}
		if (EXCHANGE_After) finish exchange();
	}
	/*filling the boundary regions. Periodic boundary condition is used for the physical boundary*/
	/*this version can't be used in parallel with the stencil operation in the inner region*/
	private void Exchange(){
		for (point(:rank==1) [j]:[0:2]) { 
                    // for each space dimension and has to be done sequentially
			final int jj=j;
			finish ateach(point(:rank==1) [i]:m_places){
				final int dest0=m_placeGrid.coord(i)[0]; 
				final int dest1=m_placeGrid.coord(i)[1]; 
				final int dest2=m_placeGrid.coord(i)[2]; 
				final int ii=i; 

				for (point(:rank==1) [p]:[LOW:HIGH]){	
				    int disp0=0; 
				    int disp1=0; 
				    int disp2=0; 
                                    int source0=0;
                                    int source1=0;
                                    int source2=0;
                                    int trans0=0;
                                    int trans1=0;
                                    int trans2=0;
				    int sourceID=0;
				    int k=0;
					if (p==LOW){ 
						k=jj*2;
						disp0=(jj==0?1:0);
						disp1=(jj==1?1:0);
						disp2=(jj==2?1:0);
					}
					else{
						k=jj*2+1;
                                                disp0=(jj==0?-1:0);
                                                disp1=(jj==1?-1:0);
                                                disp2=(jj==2?-1:0);
					}	
					source0=dest0-disp0;
					source1=dest1-disp1;
					source2=dest2-disp2;
					//got Eclipse internal error if insert if (m_numPlace>1) here
					if ((m_numPlaces>1)&&PERF_On && (!PERF_CompOnly)) 
                                           x10.lang.perf.addLocalOps((long)(PERF_CommL+PERF_CommB*get_m_boundaries(k,ii).size()));
					if (m_placeGrid.contains([source0,source1,source2])){
						sourceID=m_placeGrid.ordinal([source0,source1,source2]);
						Util.arraycopy3((double [:rank==3])m_u[ii].m_array,
                                                                (region(:rank==3))get_m_boundaries(k,ii),
                                                                (double [:rank==3])m_u[sourceID].m_array);
					}
					else{
                                                if (jj==0) {
						   source0=dest0+disp0*(m_block0-1);
						   source1=dest1+disp1*(m_block0-1);
						   source2=dest2+disp2*(m_block0-1);
                                                }
                                                else if (jj==1) {
						   source0=dest0+disp0*(m_block1-1);
						   source1=dest1+disp1*(m_block1-1);
						   source2=dest2+disp2*(m_block1-1);
                                                }
                                                else {
						   source0=dest0+disp0*(m_block2-1);
						   source1=dest1+disp1*(m_block2-1);
						   source2=dest2+disp2*(m_block2-1);
                                                }
						sourceID=m_placeGrid.ordinal([source0,source1,source2]);
                                                if (jj==0) {
						   trans0=disp0*m_size0;
						   trans1=disp1*m_size0;
						   trans2=disp2*m_size0;
                                                }
                                                else if (jj==1) {
						   trans0=disp0*m_size1;
						   trans1=disp1*m_size1;
						   trans2=disp2*m_size1;
                                                }
                                                else {
						   trans0=disp0*m_size2;
						   trans1=disp1*m_size2;
						   trans2=disp2*m_size2;
                                                }
						Util.arraycopy4((double [:rank==3])m_u[ii].m_array,
                                                                (region(:rank==3))m_boundaries[k,ii],
                                                                (double [:rank==3])m_u[sourceID].m_array, 
                                                                trans0,trans1,trans2);	
					}
					
				}
			}
		}
	}
	/*it seems more efficient to put for loop inside the ateach loop*/

	public void exchange(){
	  async(here) {
		// final clock clk=clock.factory.clock();	
                for (point(:rank==1) [j]:[0:2]) { 
                   // clocked(clk) {
		       finish ateach(point(:rank==1) [i]:m_places) {
                                // for each space dimension and has to be done sequentially
				final int jj=j;
				final int dest0=m_placeGrid.coord(i)[0]; 
				final int dest1=m_placeGrid.coord(i)[1]; 
				final int dest2=m_placeGrid.coord(i)[2]; 
				final int ii=i; 
				finish foreach (point(:rank==1) [p]:[LOW:HIGH]){ 
                                // for each face in parallel
				// finish for (point [p]:[LOW:HIGH])
				int disp0=0; 
				int disp1=0; 
				int disp2=0; 
                                int trans0=0;
                                int trans1=0;
                                int trans2=0;
				int sourceID=0;
				int k=0;
				if (p==LOW) { 
				   k=jj*2;
				   disp0=(jj==0?1:0);
				   disp1=(jj==1?1:0);
				   disp2=(jj==2?1:0);
				}
				else {
				   k=jj*2+1;
                                   disp0=(jj==0?-1:0);
                                   disp1=(jj==1?-1:0);
                                   disp2=(jj==2?-1:0);
				}	
				int source0=dest0-disp0;
				int source1=dest1-disp1;
				int source2=dest2-disp2;
				   if ((m_numPlaces>1) && PERF_On && (!PERF_CompOnly)) {
				        x10.lang.perf.addLocalOps((long)(PERF_CommL+PERF_CommB*get_m_boundaries(k,ii).size()));
                                   }
				   if (m_placeGrid.contains([source0,source1,source2])){
				   	sourceID=m_placeGrid.ordinal([source0,source1,source2]);
                                        double [:rank==3] ma = (double [:rank==3]) get_m_u(ii).m_array;
				   	Util.arraycopy3((double [:rank==3])get_m_u(ii).m_array,
                                                        (region(:rank==3))get_m_boundaries(k,ii),
                                                        (double [:rank==3])get_m_u(sourceID).m_array);
				   }
				   else{
                                        if (jj==0) {
					   source0=dest0+disp0*(m_block0-1);
					   source1=dest1+disp1*(m_block0-1);
					   source2=dest2+disp2*(m_block0-1);
                                        }
                                        else if (jj==1) {
					   source0=dest0+disp0*(m_block1-1);
					   source1=dest1+disp1*(m_block1-1);
					   source2=dest2+disp2*(m_block1-1);
                                        }
                                        else {
					   source0=dest0+disp0*(m_block2-1);
					   source1=dest1+disp1*(m_block2-1);
					   source2=dest2+disp2*(m_block2-1);
                                        }
					sourceID=m_placeGrid.ordinal([source0,source1,source2]);
                                        if (jj==0) {
					   trans0=disp0*m_size0;
					   trans1=disp1*m_size0;
					   trans2=disp2*m_size0;
                                        }
                                        else if (jj==1) {
					   trans0=disp0*m_size1;
					   trans1=disp1*m_size1;
					   trans2=disp2*m_size1;
                                        }
                                        else {
					   trans0=disp0*m_size2;
					   trans1=disp1*m_size2;
					   trans2=disp2*m_size2;
                                        }
					Util.arraycopy4((double [:rank==3])get_m_u(ii).m_array,
                                                        (region(:rank==3))get_m_boundaries(k,ii),
                                                        (double [:rank==3])get_m_u(sourceID).m_array, 
                                                        trans0,trans1,trans2);	
					}
				}
				// next;
                       } // end of for loop
                   } // end of clocked
	  } // end of async	
	} // end of the exchange method

	public LevelData(final int a_problemDomainSize, final boolean a_isParallel) {
		if (Util.OVERLAP_COMMANDCOMP) {
			EXCHANGE_After=false;
                }
		else {
			EXCHANGE_After=Util.EXCHANGE_AFTER;
                }
		
		SIZE=a_problemDomainSize;
		ISPARALLEL=a_isParallel;
		// assert Util.powerOf2(SIZE);
		// assert Util.powerOf2(N_PLACES);
		P_DOMAIN=[0:SIZE-1,0:SIZE-1,0:SIZE-1];
		//System.out.println("num of places: "+place.MAX_PLACES+" problem domain: "+P_DOMAIN);
		
		int numCuts=0;
		if (ISPARALLEL){
			m_places=ALLPLACES;
                        m_numPlaces=N_PLACES; 
			numCuts=Util.log2(N_PLACES);
		}
		else {
			m_places=ALLPLACES|[0:0];
                        m_numPlaces=1;
			numCuts=0;
		}
                dist(:rank==1) d = [0:m_numPlaces] -> here;
		m_regions = (region(:rank==3)[:rank==1])new region(:rank==3) [d];
		m_REGIONs = (region(:rank==3)[:rank==1])new region(:rank==3) [d];
                dist(:rank==2) di = [0:5, 0:m_numPlaces-1]->here;
		//m_boundaries=new region [numFaces][m_numPlaces];
		m_dist = (dist(:rank==3) [:rank==1]) new dist(:rank==3) [d];
		m_DIST = (dist(:rank==3) [:rank==1]) new dist(:rank==3) [d];
		// To be general
		m_low0 = P_DOMAIN.rank(0).low(); 
		m_low1 = P_DOMAIN.rank(1).low(); 
		m_low2 = P_DOMAIN.rank(2).low(); 
		m_hi0 = P_DOMAIN.rank(0).high(); 
		m_hi1 = P_DOMAIN.rank(1).high(); 
		m_hi2 = P_DOMAIN.rank(2).high(); 
		m_size0=m_hi0-m_low0+1; 
		m_size1=m_hi1-m_low1+1; 
		m_size2=m_hi2-m_low2+1; 

		/*compute the cut of problem domain into N_PLACES subdomains*/
		int a=numCuts/3;
		int b=numCuts%3;
                m_cut0 = a+(b>0?1:0);
                m_cut1 = a+(b>1?1:0);
                m_cut2 = a;
		m_block0=Util.pow2(m_cut0);
		m_block1=Util.pow2(m_cut1);
		m_block2=Util.pow2(m_cut2);
		m_blockSize0=m_size0/m_block0;
		m_blockSize1=m_size1/m_block1;
		m_blockSize2=m_size2/m_block2;
		m_placeGrid=[0:m_block0-1, 0:m_block1-1, 0:m_block2-1];
		int i=0;
		/*compute the global data layout*/
		for (point(:rank==3) p: m_placeGrid){
		    /*compute the subregions, one for each place*/
		    m_regions[i]=[m_blockSize0*p[0]+m_low0:   m_blockSize0*(p[0]+1)+m_low0-1, 
		                  m_blockSize1*p[1]+m_low1:   m_blockSize1*(p[1]+1)+m_low1-1,
		                  m_blockSize2*p[2]+m_low2:   m_blockSize2*(p[2]+1)+m_low2-1];
		    m_REGIONs[i]=[m_blockSize0*p[0]+m_low0-1: m_blockSize0*(p[0]+1)+m_low0, 
		                  m_blockSize1*p[1]+m_low1-1: m_blockSize1*(p[1]+1)+m_low1,
		                  m_blockSize2*p[2]+m_low2-1: m_blockSize2*(p[2]+1)+m_low2];
		    m_dist[i]=m_regions[i]->place.places(i);
		    m_DIST[i]=m_REGIONs[i]->place.places(i);
		    i++;//i=m_placeGrid.ordinal(p);
                }
		m_boundaries = (region(:rank==3)[:rank==2]) new region(:rank==3) [di];
                for (point(:rank==2) [j,ii] : di) {
		    /*compute the boundary faces, the order of the faces are lowX,highX,lowY,highY,lowZ,highZ*/
                    if (j==0) { 
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],-(0+1),(0>0?1:0),(0>1?1:0),0);
                    } 
                    if (j==2) { 
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],-(1+1),(1>0?1:0),(1>1?1:0),0);
                    } 
                    if (j==4) { 
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],-(2+1),(2>0?1:0),(2>1?1:0),0);
                    } 
                    if (j==1) {
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],(0+1),(0>0?1:0),(0>1?1:0),0);
                    }
                    if (j==3) {
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],(1+1),(1>0?1:0),(1>1?1:0),0);
                    }
                    if (j==5) {
		      m_boundaries[j,ii] = Util.boundary((region(:rank==3))m_regions[ii],(2+1),(2>0?1:0),(2>1?1:0),0);
                    }
                }

//
		m_u = new Wrapper [ALLPLACES];
                for (point(:rank==1) [k] : [0:N_PLACES-1]) {
                        final dist(:rank==3) disi = (dist(:rank==3))m_DIST[k];
                        finish async(m_u.distribution[k]) {
			   m_u[k]=new Wrapper(new double [disi](point(:rank==3) pp) {
                                        return 0;
                                  });
                        }
                }
//

/* Instead of the nine lines just above, I would rather let 
   m_u be a value array and then write this:
                m_u = new Wrapper value [ALLPLACES] (point(:rank==1) k) {
                        dist(:rank==3) disi = (dist(:rank==3))m_DIST[k];
                        return new Wrapper(
                           new double value [disi](point(:rank==3) pp) {
                                 return 0;
                           }
                        );
                };
*/
	}

       private region(:rank==3) get_m_regions(final int i) {
          final place h = here;
          final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
          final region(:rank==3)[:rank==1] aRecv =
             (region(:rank==3)[:rank==1]) new region(:rank==3)[dRecv];
          finish async (m_regions.distribution[i]) {
             final region(:rank==3) temp3 = (region(:rank==3)) m_regions[i];
             async (h) { aRecv[0] = temp3; }
          }
          final region(:rank==3) mri = (region(:rank==3)) aRecv[0];
          return mri;
      }

       private region(:rank==3) get_m_REGIONs(final int i) {
          final place h = here;
          final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
          final region(:rank==3)[:rank==1] aRecv =
             (region(:rank==3)[:rank==1]) new region(:rank==3)[dRecv];
          finish async (m_REGIONs.distribution[i]) {
             final region(:rank==3) temp3 = (region(:rank==3)) m_REGIONs[i];
             async (h) { aRecv[0] = temp3; }
          }
          final region(:rank==3) mri = (region(:rank==3)) aRecv[0];
          return mri;
      }

       private region(:rank==3) get_m_boundaries(final int i, final int j) {
          final place h = here;
          final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
          final region(:rank==3)[:rank==1] aRecv =
             (region(:rank==3)[:rank==1]) new region(:rank==3)[dRecv];
          finish async (m_boundaries.distribution[i,j]) {
             final region(:rank==3) temp4 = (region(:rank==3)) m_boundaries[i,j];
             async (h) { aRecv[0] = temp4; }
          }
          final region(:rank==3) mri = (region(:rank==3)) aRecv[0];
          return mri;
       }

       private Wrapper get_m_u(final int i) {
          final place h = here;
          final dist(:rank==1) dRecv = (dist(:rank==1)) ([0:0]->here);
          final Wrapper[:rank==1] aRecv =
             (Wrapper[:rank==1]) new Wrapper[dRecv];
          finish async (m_u.distribution[i]) {
             final Wrapper temp4 = m_u[i];
             async (h) { aRecv[0] = temp4; }
          }
          final Wrapper mri = aRecv[0];
          return mri;
       }


//    public static void main(String[] a) {
//    	/*throw new RuntimeException();*/
//    	
//    	final LevelData MG=new LevelData(32, true);//MG.location=place(0);
//    	MG.set(1);
//    	System.out.println("MG.initialize() finished");
//    	MG.print();
//    	MG.Exchange();
//    	MG.print();
//    	System.out.println("The 2norm is "+MG.norm2());
//    	
//    	System.out.println("This is LevelData, finished!");
//    }
	
}
