/*
 *
 * (C) Copyright IBM Corporation 2006
 *
 *  This file is part of X10 Test.
 *
 */
import x10.lang.Object;
import harness.x10Test;

/**
* Building arrays distributed accross places using the encapsulation approach 
* (1D array of 2D arrays).
* @author Tong
  11/29/2006
*/
public class EncapsulatedArray1D_Dep extends x10Test {
	
	static value Wrapper{
		double [.] m_array;
		Wrapper(double [.] a_array){
			m_array=a_array;
		}
	}
	
        public boolean run() {
        	final int size=5;
        	final region(:rank==2) R=[0:size-1,0:size-1];
        	final dist(:rank==1)  D=(dist(:rank==1))dist.factory.unique(); //the casting here is not natural.
        	final int numOfPlaces=place.MAX_PLACES;
        	
        	final Wrapper value [:rank==1] A=new Wrapper value [D];
        	finish ateach(point [i]: D) A[i]=new Wrapper(new double [R]);
        		
        	//for (int i=0;i<numOfPlaces;i++){	
        	finish ateach (point [i]: D){ 
        		final double [:rank==2] temp=(double [:rank==2]) A[i].m_array;
        		for (point p: temp) temp[p]=i;
        	}
    	
	    return true;
	}
	
	public static void main(String[] args) {
		new EncapsulatedArray1D_Dep().execute();
	}

}

