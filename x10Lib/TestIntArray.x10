public class TestIntArray
{
	//need to input the distribution as well.
	public static final region(:rank==1) myDummyRegion = [0:place.MAX_PLACES-1];
	public static void main(String args[])
	{
		new TestIntArray().run();
	}
	public boolean run() {
		
		int valueInsideArray = 5;
		Dist myDist = new Dist( (region(:rank==1))[0:1], here);
		final place pl = here;
		myDist = new Dist(myDist, 2,3 , here);
		myDist = new Dist(myDist, 4,5, here);
		myDist = new Dist(myDist, 6,7 , here);
		//myDist.printThis();	
		//System.out.println("MAX_PLACES"+place.MAX_PLACES);	
		final IntArray myIntArray = new IntArray(myDummyRegion, myDist, new DistRun());
		
	
		for(point [p]:[0:7]){
			place innerPlace = DistRun.getPlaceFromDist(myDist, p);			
			//System.out.println("innerPlace at p ="+p+" = "+innerPlace);			
			async(innerPlace){

				myIntArray.intSetValue(myIntArray, p, here, p);
			}		
			
		}
		final dist(:rank==1) dTemp = [0:0]-> here;
		final int [:rank==1] t = (int[:rank==1])new int[dTemp](point p) {return 0;}; 
		for(point [p]:[0:7]){
			place innerPlace = DistRun.getPlaceFromDist(myDist, p);			
			//System.out.println("innerPlace at p ="+p+" = "+innerPlace);			
finish {			
			async(innerPlace){

				final int tempVal = myIntArray.intGetValue(myIntArray, p, here);
				async(pl)
				{
					t[0] += tempVal;
				}
			}		
	}		
		}
		System.out.println(t[0]);
		
				
		
		return true;
	}
	
	
}

value IntArray{

//stores all the trasnfer objects 
public final  IntTO value[:rank==1]  contents;
public final Dist distArray;
public final DistRun distRun;
	public IntArray(final region(:rank==1) myDummyRegion, final Dist myDistArray, final DistRun myDR)
	{
		distRun = myDR;
		distArray = myDistArray;
		contents = initilizeTO(myDummyRegion);
		
	}
	
	//this method starts initilizing the first TO structure
	public IntTO[:rank==1] initilizeTO(final region(:rank==1) myDummyRegion)
	{
		//need to replace with dist class
		final dist(:rank==1) myDistribution = myDummyRegion -> here;
		IntTO value[:rank==1] temp = (IntTO value[:rank==1])new IntTO value [myDummyRegion](point [p]){return newIntTO(p, myDummyRegion, distArray.counts[p]);};
		return temp;
	
	}

	//this method initilize the TO objects inside contents and is neccesary because of the array initilizer
	public IntTO newIntTO(final int myPoint, final region(:rank==1) myDummyRegion, final int sizeOfChunk){
	
			// may have to double check math for sizeOfChunk

		//System.out.println("sizeOfChunk= "+sizeOfChunk);
		final dist(:rank==1) dis = [0:sizeOfChunk-1]->here;
		final place pl = here;
		//end of not used code
	
		final dist(:rank==1) tempDis = [0:0]->here;
		final IntTO[:rank==1] temp = new IntTO[tempDis];
		finish
		{
			async(place.places(myPoint)) {
				final IntTO to = new IntTO(sizeOfChunk-1);
			
				//this returns the temp[0] back to he 
				async(pl){
					temp[0] = to;
				}
			}
		}
		final IntTO to = temp[0];
		return to;
		
	}

	//pl is here
	public int intGetValue(final IntArray myIntArray, int index, final place pl){
		final int placeIndex = pl.id;
		
		final IntTO myIntTo =  myIntArray.contents[placeIndex];
		final int[:rank==1] disArray = myIntTo.localArray;
		final Dist myDist = myIntArray.distArray;
		final int localIndex = DistRun.getLocalIndex(myDist, index); // converts the index to the local index		
		final int returnValue = disArray[localIndex];
		return returnValue;
	}
	
	

	public void intSetValue(final IntArray myIntArray, int index, final place pl, int value){
		final int placeIndex = pl.id;
		
		final IntTO myIntTo =  myIntArray.contents[placeIndex];
		//System.out.println("==============================="+placeIndex);
		final int[:rank==1] disArray = myIntTo.localArray;
		final Dist myDist = myIntArray.distArray;
		
		final int localIndex = DistRun.getLocalIndex(myDist, index); // converts the index to the local index		
		System.out.println(localIndex);
		disArray[localIndex] = value;
		
	}

}
//This is the transfer object that will lead to local stored data for Ints
value IntTO {
	public final int[:rank==1] localArray;
	public IntTO(final int size) {
		localArray = setArrayElementsToZero(size);
		
	}
	public int[:rank==1] setArrayElementsToZero(final int size )
	{
		final dist(:rank==1) d = [0:size] -> here;
		System.out.println("here?  "+here);
		int[:rank==1] temp = new int[d](point [p]){return 0;};
		return temp;
	}
}


