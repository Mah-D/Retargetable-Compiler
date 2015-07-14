/***************************************************************************************
               An X10 implementation of the NPB3.0 MG 3D Benchmark 

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

public class MGMain {
    public static void main(String[] args) {
        new MGDriver().driver();
    }
}
