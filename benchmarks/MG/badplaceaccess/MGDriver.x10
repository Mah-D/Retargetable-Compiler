/***************************************************************************************
               An X10 implementation of the NPB3.0 MG 3D Benchmark 

MG is a benchmark program which solves a three-dimensional
Poisson equation using the multigrid method.

In this implementation, the grid is partitioned across places. It is used to study X10's 
expressiveness rather than to generate performance numbers. Replacing the current arraycopy 
methods with the corresponding built-in ones (to be implemented) will certainly improve 
performance. 

We use X10's runtime support for abstract performance metrics to study the potential performance 
impacts of expressing fined-grained parallelism in the MG algorithm.

Note that the master thread is at the default place 0.
  
Related classes: MGOP, LevelData, Timer, Util 

Date:   05/19/06
        07/31/06 for vs foreach. For unordered loops, make compiler/runtime decides how much 
        parallelism should be applied there?
        11/06/06 Add comments
	12/07/2007 Add the rest of test problems
        
Author: Tong Wen
        IBM Research
 
        (C) Copyright IBM Corp. 2006
*****************************************************************************************/

//import NPB3_0_X10.BMInOut.*;
public class MGDriver {
    public static void driver() {
        int CLASS = 1; // 'S';
         // CLASS = 2; // 'W';
	 // CLASS = 3; // 'A';
	 // CLASS = 4; // 'B';
	 // CLASS = 5; // 'C';
	 // CLASS = 6; // 'D';

    	final boolean isDistributed=true;

    	int problemSize=0; int numberIterations=0; double reference2Norm=0;
    	switch (CLASS){
    	  case 1:
    		problemSize=32; numberIterations=4; reference2Norm=5.30770700573E-5;
    		break;
    	  case 2:
    		problemSize=64; numberIterations=40; reference2Norm=2.50391406439E-18;
    		break;
	  case 3:
	        problemSize=256; numberIterations=4; reference2Norm=2.433365309e-6;
	        break;
	  case 4:
	        problemSize=256;numberIterations = 20;  reference2Norm = 1.80056440132e-6;
	        break;
	  case 5:
	        problemSize=512; numberIterations = 20; reference2Norm = 5.70674826298e-7;
	        break;
	  case 6:
	        problemSize=1024; numberIterations = 50; reference2Norm = 1.58327506043e-10;
	        break;	
    	  default:
    		System.err.println("Class must be one of {S,W,A,B,C,D}!");  
    	}

	    LevelData u=new LevelData(problemSize, isDistributed); // the unknowns
	    LevelData v=new LevelData(problemSize, isDistributed); // the right-hand side
	    v.initialize(CLASS);
	    MGOP MG=new MGOP(problemSize);
	    System.out.println("There are "+Util.N_PLACES+" places. Running problem of class "+CLASS);
	    Timer tmr=new Timer();int count=0;
	    tmr.start(count);
	    double res=0;
	    // try{ 
	    	res=MG.MGSolve(u,v, numberIterations);	
		// }catch(OutOfMemoryError e){
			// //BMArgs.outOfMemoryMessage();
			// System.err.println("out Of Memory!");
			// System.exit(0);
		// }	
	    tmr.stop(count);
	    System.out.println("The reference 2norm is "+reference2Norm+". The difference is "+(res-reference2Norm));
	    System.out.println("Wall-clock time for MGSolve: "+tmr.readTimer(count)+"secs");
    }
}
