public class Test {
	public static void main(String[] args) {
		region(:rank==1) r = [0:-1];
		final dist(:rank==1) d = [0:100]-> here;
		System.out.println(d);
	}

	public static Dist1 getBlockCyclicDist1(final Region1 r, final int blockSize) {
		final int N = r.pointArray.region.size();
		final int one = 1;
		final place fPlace = place.FIRST_PLACE;
		final int rSize = N - one;
		final region(:rank==1) dReg = [0 : rSize];
		final dist(:rank==1) dDist = [0 : rSize] -> here;
		final place [:rank==1] placeArray = (place [:rank==1])(new place[dDist]);
		Test.getCyclic(placeArray, N, fPlace, blockSize);
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place[dReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
	}

	public static Dist1 getUniqueDist() {
		final int one = 1;
		final int zero = 0;
		final int maxPlaces = place.MAX_PLACES;
		final int rSize = maxPlaces - one;
		final region(:rank==1) placeRegion = [0 : rSize];
		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1]) (new Point1 value[placeRegion] (point(:rank==1) p) {
			final int i = p[0];
			final Point1 pt1 = new Point1(i);
			return pt1;
		});
		final place value[:rank==1] vPlaceArray = (place value[:rank==1]) (new place value[placeRegion] (point(:rank==1) p) {
			final int i = p[0];
			final place pl1 = place.places(i);
			return pl1;
		});
		final Region1 reg = new Region1(pointArray, zero, maxPlaces);
		final Dist pointDist1 = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(reg, pointDist1);
		return retDist;
	}

	/*public static Dist1 getBlockDist1(final Region1 r) {
		final int rSize = r.pointArray.region.size();
		final int zero = 0;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final region(:rank==1) dReg = [0 : rSizeMinusOne];
		final dist(:rank==1) dDist = [0 : rSizeMinusOne] -> here;
		final place [:rank==1] placeArray = (place [:rank==1])(new place[dDist]);
		final int N = place.MAX_PLACES;
		final int q = rSize%N;
		final int p = rSize/N;
		int blockSize = p + one;
		int arraySize = q * blockSize;
		int offset = 0;
		place initPlace = place.FIRST_PLACE;
		Test.getCyclic(placeArray, arraySize, initPlace, blockSize);
		int remainingPlaces = N - q;
		final boolean cond = remainingPlaces == zero;
		if(cond) {
			final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place[dReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
			final Dist pointDist1 = new Dist(vPlaceArray, rSize);
			final Dist1 retDist = new Dist1(r, pointDist1);
			return retDist;
		}
		offset = arraySize;
		blockSize = p;
		arraySize = remainingPlaces * blockSize;
		initPlace = place.places(q);
		int chunk = blockSize;
		final boolean ifCond = blockSize > arraySize;
		if(ifCond) {
			chunk = arraySize;
		}
		int index = offset;
		int dSize = index + chunk;
		dSize = dSize - one;
		final int ub0 = chunk - one;
		final region(:rank==1) pointReg0 = [0 : ub0];
		final int value[:rank==1] pointArray0 = (int value[:rank==1])(new int value[pointReg0](point(:rank==1) p){return zero;});
		for(point(:rank==1) p : pointArray0) {
			final point(:rank==1) tempPt = p + [index];
			placeArray[tempPt] = initPlace;
		}
		index = index + chunk;
		arraySize = arraySize - chunk;
		place pl = initPlace.next();
		boolean whileCond = arraySize != zero;
		while(whileCond) {
			final boolean tailCond = chunk > arraySize;
			if(tailCond) {
				dSize = index + arraySize;
				dSize = dSize - one;
				final int ub = arraySize - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				final int value[:rank==1] pointArray1 = (int value[:rank==1])(new int value[pointReg1](point(:rank==1) p){return zero;});
				for(point(:rank==1) p : pointArray1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = pl;
				}
				arraySize = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				final int ub = chunk - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				final int value[:rank==1] pointArray1 = (int value[:rank==1])(new int value[pointReg1](point(:rank==1) p){return zero;});
				for(point(:rank==1) p : pointArray1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = pl;
				}
				index = index + chunk;
				arraySize = arraySize - chunk;
			}
			pl = pl.next();
			whileCond = arraySize != zero;
		}
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place[dReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
		final Dist pointDist1 = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(r, pointDist1);
		return retDist;
	}
*/
	public static Dist1 getPlaceDist1(final Region1 r, final place p) {
		final int rSize = r.pointArray.region.size();
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final region(:rank==1) dReg = [0 : rSizeMinusOne];
		final dist(:rank==1) dDist = [0 : rSizeMinusOne] -> here;
		final place [:rank==1] placeArray = (place [:rank==1])(new place[dDist]);
		Test.getCyclic(placeArray, rSize, p, rSize);
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place[dReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
	}

	public static void getCyclic(final place[:rank==1] placeArray, final int arraySize, final place initPlace, final int blockSize) {
		final int zero = 0;
		final int one = 1;
		int N = arraySize;
		int chunk = blockSize;
		final boolean ifCond = blockSize > N;
		if(ifCond) {
			chunk = N;
		}
		int index = 0;
		int dSize = index + chunk;
		dSize = dSize - one;
		final region(:rank==1) pointReg = [0 : dSize];
		final int value[:rank==1] pointArray = (int value[:rank==1])(new int value[pointReg](point(:rank==1) p){return zero;});
		for(point(:rank==1) p : pointArray) {
			placeArray[p] = initPlace;
		}
		index = index + chunk;
		N = N - chunk;
		place pl = initPlace.next();
		boolean whileCond = N != zero;
		while(whileCond) {
			final boolean tailCond = chunk > N;
			if(tailCond) {
				dSize = index + N;
				dSize = dSize - one;
				final int ub = N - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				final int value[:rank==1] pointArray1 = (int value[:rank==1])(new int value[pointReg1](point(:rank==1) p){return zero;});
				for(point(:rank==1) p : pointArray1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = pl;
				}
				N = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				final int ub = chunk - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				final int value[:rank==1] pointArray1 = (int value[:rank==1])(new int value[pointReg1](point(:rank==1) p){return zero;});
				for(point(:rank==1) p : pointArray1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = pl;
				}
				index = index + chunk;
				N = N - chunk;
			}
			pl = pl.next();
			whileCond = N != zero;
		}
	}

/*	public static Dist1 unionDist1(final Dist1 d1, final Dist1 d2) {
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		final Region1 reg1 = d1.dReg;
		final Point1 value[:rank==1] arr1 = (Point1 value[:rank==1])(reg1.pointArray);
		final Region1 reg2 = d2.dReg;
		final Point1 value[:rank==1] arr2 = (Point1 value[:rank==1])(reg2.pointArray);
		final int size1 = reg1.pointArray.region.size();
		final int size2 = reg2.pointArray.region.size();
		final int rSize = size1 + size2;
		final int zero = 0;
		final int one = 1;
		final int sizeMinusOne = rSize - one;
		final region(:rank==1) tempReg = [0 : sizeMinusOne];
		final dist(:rank==1) tempDist = [0 : sizeMinusOne] -> here;
		final Point1[:rank==1] tempArr = new Point1[tempDist];
		final place [:rank==1] placeArray = (place [:rank==1]) (new place [tempDist]);
		boolean cond1 = index1 < size1;
		boolean cond2 = index2 < size2;
		boolean cond = cond1 && cond2;
		place pPlace = here;
		while(cond) {
			final Point1 p1 = arr1[index1];
			final Point1 p2 = arr2[index2];
			final int pointCompare = Test.comparePoint1(p1,p2);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			if (eq) {
				final String errMsg = "Non-disjoint region in a disjoint union";
				throw new RuntimeException(errMsg);
			}
			if (lt) {
				tempArr[index] = (p1);
				placeArray[index] = (pPlace);
				index1 = index1 + one;
			}
			else {
				tempArr[index] = (p2);
				placeArray[index] = (pPlace);
				index2 = index2 + one;
			}
			index = index + one;
			cond1 = index1 < size1;
			cond2 = index2 < size2;
			cond = cond1 && cond2;
		}
		cond1 = index1 < size1;
		while (cond1) {
			final Point1 tempArrPt = arr1[index1];
			tempArr[index] = (tempArrPt);
			placeArray[index] = (pPlace);
			index1 = index1 + one;
			index = index + one;
			cond1 = index1 < size1;
		}
		cond2 = index2 < size2;
		while (cond2) {
			final Point1 tempArrPt = arr2[index2];
			tempArr[index] = (tempArrPt);
			placeArray[index] = (pPlace);
			index2 = index2 + one;
			index = index + one;
			cond2 = index2 < size2;
		}
		final Point1 value[:rank==1] arr = (Point1 value[:rank==1])(new Point1 value[tempReg] (point(:rank==1) pt) {
			final Point1 retPoint = tempArr[pt];
			return retPoint;
		});
		final Region1 unionReg = new Region1(arr);
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place[tempReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist1 unionDist = new Dist1(unionReg, pointDist);
		return unionDist;
	}
*/
	
public Test()
	{
		final dist(:rank==1) d = (dist(:rank==1))dist.UNIQUE;
		//final int[:rank==1] a = m(d);
		
		//async(here) {
		//	System.out.println(i);
		//}
		this.m2();
		new Test().m(d);
		//i = 10;
		//a = (int [:rank==1])new int[d] (point p) {return 0;};
		//a = (int [:rank==1])m(d);
	}
	public void m2()
	{

	}

	public int[:rank==1] m(final dist(:rank==1) d) 
	{
		m2();
		return (int[:rank==1])new int[d] (point(:rank==1) p) {return 0;};
	}
}
	value Region1 
	 {
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1[:rank==1] pointArray;


	public Region1 ( final Point1[:rank==1] pointArray_)
		{

		final int zero = 0;

		final int one = 1;

		final int minusOne = zero - one;

		regRank=1;

		pointArray=pointArray_;

		regType=false;

		low0=minusOne;

		dim0=zero;
		}
	public Region1 ( final Point1[:rank==1] pointArray_, final int low0_, final int dim0_)
		{

		regRank=1;

		pointArray=pointArray_;

		regType=true;

		low0=low0_;

		dim0=dim0_;
		}


	}
	value Point1 
	 {
	public final int f0;


	public Point1 ( final int f0_)
		{

		f0=f0_;
		}
}

value Dist {

	public final place value[:rank==1] placeArray;
	public final int value[:rank==1] counts;
	public final int value[:rank==1] runningSum;
	
	public Dist(final place value[:rank==1] vPlaceArray, final int arraySize) {
		final int one = 1;
		final int zero = 0;
	
		final int maxPlaces = place.MAX_PLACES;
		final int ub = maxPlaces - one;
		final region(:rank==1) countReg = [0 : ub];
		final dist(:rank==1) countDist = [0 : ub] -> here;

		final int rSize = arraySize - one;
		final region(:rank==1) runSumReg = [0 : rSize];
		final dist(:rank==1) runSumDist = [0 : rSize] -> here;

		final int [:rank==1] tempCounts = (int [:rank==1]) (new int[countDist]);
		
		final int [:rank==1] tempRunSum = (int [:rank==1]) (new int[runSumDist]);
		
		for(point(:rank==1) p : tempCounts) {
			tempCounts[p] = (zero);
		}


		for(point(:rank==1) p : vPlaceArray) {
			final place pl = vPlaceArray[p];
			final int index = pl.id;
			final int oldVal = tempCounts[index];
			tempRunSum[p] = (oldVal);
			final int oldValPlusOne = oldVal + one;
			tempCounts[index] = (oldValPlusOne);
		}

		placeArray = vPlaceArray;
		
		counts = init(tempCounts, countReg);
		runningSum = init(tempRunSum, runSumReg);
	}

	public int value[:rank==1] init(final int [:rank==1] tempArr, final region(:rank==1) tempReg) {
		final int value[:rank==1] vTemp = (int value[:rank==1]) (new int value[tempReg](point(:rank==1) p) {
			final int tempInt = tempArr[p];
			return tempInt;
		});
		return vTemp;
	}
}

	value Dist1 
	 {
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1 ( final Region1 dReg_, final Dist dDist_)
		{

		dReg=dReg_;

		dDist=dDist_;
		}


	}
