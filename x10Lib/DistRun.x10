public class DistRun {
	public static final region(:rank==1) R = [0:place.MAX_PLACES-1];
	public static void main(String args[])
	{
		//new Dist().run();
	}

	/* dist:== region -> place  */
	public static place value[:rank==1] createDist(final region(:rank==1) reg, final place pl) {
		final place value[:rank==1] placeArray = (place value[:rank==1]) new place value[reg] (point(:rank==1) p){return pl;};
		return placeArray;
	}

	/* dist:== dist || [x:y]-> place  */
	public static place value[:rank==1] extendDist(final Dist d1, final int x, final int y, final place pl) {
		final place value[:rank==1] d1Array = d1.placeArray;
		final region(:rank==1) reg = [0:y]; // we know we only extend arrays...twilight zone...test this
		final dist(:rank==1) dis = reg -> here;
		final place [:rank==1] temp = (place[:rank==1]) new place[dis];
		for(point(:rank==1) p : d1Array)
		{
			temp[p] = d1Array[p];
		}
		int tail = x;
		while(tail <= y) // check the math here..replace with do-while
		{
			temp[tail] = pl;
			tail = tail + 1;
		}
		final place value[:rank==1] placeArray = (place value[:rank==1]) new place value[reg] (point(:rank==1) p){return temp[p];};
		return placeArray;
	}

	/* dist.get(p) */
	public static place getPlaceFromDist(final Dist d, final int index) {
		final place value[:rank==1] placeArray = d.placeArray;
		final place retPlace = placeArray[index];
		return retPlace;
	}

	public static int value[:rank==1] getCounts(final place value[:rank==1] placeArray) {
		final dist(:rank==1) dis = R -> here;
		final int [:rank==1] tempCounts = (int [:rank==1]) new int[dis];
		for(point(:rank==1) p : tempCounts) {
			tempCounts[p] = 0;
		}
		for(point(:rank==1) p : placeArray) {
			final place pl = placeArray[p];
			final int index = pl.id;
			final int oldVal = tempCounts[index];
			tempCounts[index] = oldVal + 1;
		}
		final int value[:rank==1] counts = (int value[:rank==1]) new int value[R](point(:rank==1) p){return tempCounts[p];};
		return counts;
	}

	public static int value[:rank==1] getRunningSum(final place value[:rank==1] placeArray) {
		final dist(:rank==1) dis = R -> here;
		final int [:rank==1] tempCounts = (int [:rank==1]) new int[dis];
		
		int count = 0;
		for(point(:rank==1) p : placeArray) {
			count = count + 1;
		}
		count = count - 1;
		
		final region(:rank==1) runReg = [0:count];
		final dist(:rank==1) runDist = runReg -> here;
		final int [:rank==1] tempRunSum = (int [:rank==1]) new int [runDist];
		
		for(point(:rank==1) p : tempCounts) {
			tempCounts[p] = 0;
		}
	
		for(point(:rank==1) p : placeArray) {
			final place pl = placeArray[p];
			final int index = pl.id;
			final int temp = tempCounts[index];
			tempRunSum[p] = temp;
			tempCounts[index] = temp + 1;
		}
		
		final int value[:rank==1] runSum = (int value[:rank==1]) new int value[runReg](point(:rank==1) p){return tempRunSum[p];};
		return runSum;
	}
	
	public static int getLocalIndex(final Dist myDist, final int index){
		return myDist.runningSum[index];	
	}
}

value Dist {
	public final place value[:rank==1] placeArray;
	public final int value[:rank==1] counts;
	public final int value[:rank==1] runningSum;
	
	// corresponds to the production dist = region -> place
	public Dist(final region(:rank==1) reg, final place pl) {
		placeArray = DistRun.createDist(reg, pl);
		counts = DistRun.getCounts(placeArray);
		runningSum = (int value[:rank==1])DistRun.getRunningSum(placeArray);
		
	}
	
	// corresponds to the production dist = dist || [x:y] -> place
	public Dist(final Dist d1, final int x, final int y, final place pl) {
		placeArray = DistRun.extendDist(d1, x, y, pl);
		counts = DistRun.getCounts(placeArray);
		runningSum = (int value[:rank==1])DistRun.getRunningSum(placeArray);
	}

	public void printThis(){
	
		System.out.println("Print Contents of Dist");
		for(point p: placeArray){
			System.out.println("p:placeArray = "+p+" "+" : "+placeArray[p]);
		}

		System.out.println("============================================");
		for(point p: counts){
			System.out.println("p:counts = "+p+" "+" : "+counts[p]);
		}
		System.out.println("============================================");
		for(point p : runningSum){
			System.out.println("p:runningSum = "+p+" : "+runningSum[p]);
		}



	


	}
}
