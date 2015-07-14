public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program {
	public static final Region3 _A_reg = Program._A_reg_init();
	public static final int _A_f1 = (Program._A_f1_init());
	public static final Dist3 _A_dReg = Program._A_dReg_init();
	public static final intValArray3 _A_valArray = Program._A_valArray_init();
	public static final intRefArray3 _A_refArray = Program._A_refArray_init();


	public static void runMain() {
		int X10_TEMP3 = (0);
		int X10_TEMP4 = (1);
		final A X10_TEMP5 = (new A(X10_TEMP3, X10_TEMP4));
		Program.A_run(X10_TEMP5);
	}

	public static Region3 _A_reg_init() {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (1);
		final int X10_TEMP7 = (0);
		final int X10_TEMP8 = (1);
		final int X10_TEMP11 = (0);
		final int X10_TEMP12 = (1);
		final Region3 X10_TEMP14 = Program.createNewRegion3RRR(X10_TEMP3, X10_TEMP4, X10_TEMP7, X10_TEMP8, X10_TEMP11, X10_TEMP12);
		return X10_TEMP14;
	}

	public static Dist3 _A_dReg_init() {
		final place X10_TEMP1 = (here);
		final Dist3 X10_TEMP3 = Program.getPlaceDist3(_A_reg, X10_TEMP1);
		return X10_TEMP3;
	}

	public static intRefArray3 _A_refArray_init() {
		final Region3 RX10_TEMP0 = _A_dReg.dReg;
		final dist(:rank==1) RX10_TEMP4 = _A_dReg.dDist;
		final int [:rank==1] RX10_TEMP5 = (int [:rank==1])(new int [RX10_TEMP4](point(:rank==1)RX10_TEMP1) {
			final Point3 value[:rank==1] RX10_TEMP3 = RX10_TEMP0.pointArray;
			final Point3 RX10_TEMP2 = RX10_TEMP3[RX10_TEMP1];
			final int i = RX10_TEMP2.f0;
			final int j = RX10_TEMP2.f1;
			final int k = RX10_TEMP2.f2;
			final int X10_TEMP1 = (i + j);
			final int X10_TEMP3 = (X10_TEMP1 + k);
			return X10_TEMP3;
		}
		);
		final intRefArray3 RX10_TEMP6 = new intRefArray3(_A_dReg, RX10_TEMP5);
		final intRefArray3 X10_TEMP4 = RX10_TEMP6;
		return X10_TEMP4;
	}

	public static intValArray3 _A_valArray_init() {
		final Region3 RX10_TEMP0 = _A_reg;
		final int RX10_TEMP5 = _A_reg.pointArray.region.size();
		final int RX10_TEMP6 = 1;
		final int RX10_TEMP7 = RX10_TEMP5 - RX10_TEMP6;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP7];
		final int value[:rank==1] RX10_TEMP8 = (int value[:rank==1])(new int value[RX10_TEMP4](point(:rank==1)RX10_TEMP1) {
			final Point3 value[:rank==1] RX10_TEMP3 = RX10_TEMP0.pointArray;
			final Point3 RX10_TEMP2 = RX10_TEMP3[RX10_TEMP1];
			final int i = RX10_TEMP2.f0;
			final int j = RX10_TEMP2.f1;
			final int k = RX10_TEMP2.f2;
			final int X10_TEMP1 = (i + j);
			final int X10_TEMP3 = (X10_TEMP1 + k);
			return X10_TEMP3;
		}
		);
		final intValArray3 RX10_TEMP9 = new intValArray3(_A_reg, RX10_TEMP8);
		final intValArray3 X10_TEMP4 = RX10_TEMP9;
		return X10_TEMP4;
	}

	public static int _A_f1_init() {
		final int X10_TEMP2 = (10);
		return X10_TEMP2;
	}

	public static void A_run(final A X10_TEMP0) {
		final int i = (10);
		Program.A_m1(i);
		Program.A_m2(X10_TEMP0, i);
	}

	public static int A_m1(final int i) {
		int X10_TEMP1 = i;
		final int X10_TEMP3 = (_A_f1 * X10_TEMP1);
		return X10_TEMP3;
	}

	public static int A_m2(final A X10_TEMP0, final int i) {
		int X10_TEMP1 = i;
		final int X10_TEMP2 = (X10_TEMP0.f2);
		final int X10_TEMP3 = (X10_TEMP0.f3);
		final int X10_TEMP5 = (X10_TEMP2 + X10_TEMP3);
		final int X10_TEMP7 = (X10_TEMP5 * X10_TEMP1);
		return X10_TEMP7;
	}

	public static Dist3 getPlaceDist3(final Region3 r, final place p) {
		final int rSize = r.pointArray.region.size();
		final dist(:rank==1) pointDist = Program.getCyclic(rSize, p, rSize);
		final Dist3 retDist = new Dist3(r, pointDist);
		return retDist;
	}

	public static dist(:rank==1) getCyclic(final int arraySize, final place initPlace, final int blockSize) {
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
		dist(:rank==1) pointDist = pointReg -> initPlace;
		index = index + chunk;
		N = N - chunk;
		place p = initPlace.next();
		boolean whileCond = N != zero;
		while(whileCond) {
			final boolean tailCond = chunk > N;
			if(tailCond) {
				dSize = index + N;
				dSize = dSize - one;
				pointDist = pointDist || ([index : dSize] -> p);
				N = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				pointDist = pointDist || ([index : dSize] -> p);
				index = index + chunk;
				N = N - chunk;
			}
			p = p.next();
			whileCond = N != zero;
		}
		return pointDist;
	}

	public static Region3 createNewRegion3RRR(final int v1_0, final int v1_1, final int v2_0, final int v2_1, final int v3_0, final int v3_1) {
		final int zero = 0;
		final int one = 1;
		
		boolean regType = true;
		final boolean tempBool1 = true;
		final boolean tempBool2 = true;
		final boolean tempBool3 = true;
		regType = regType && tempBool1;
		regType = regType && tempBool2;
		regType = regType && tempBool3;
		
		
		final int l1 = v1_1 - v1_0;
		final int dim1 = l1 + one;
		
		final int l2 = v2_1 - v2_0;
		final int dim2 = l2 + one;
		
		final int l3 = v3_1 - v3_0;
		final int dim3 = l3 + one;
		
		final int stride3 = 1;
		final int stride2 = stride3 * dim3;
		final int stride1 = stride2 * dim2;
		final int stride0 = stride1 * dim1;
		
		final int rSize = stride0 - one;
		final region(:rank==1) regArr = [0 : rSize];
		
		final Point3 value[:rank==1] ptArray = (Point3 value[:rank==1])(new Point3 value[regArr] (point(:rank==1) [p]) {
			int f1 = p / stride1;
			f1 = f1 % dim1;
			f1 = f1 + v1_0;
			
			int f2 = p / stride2;
			f2 = f2 % dim2;
			f2 = f2 + v2_0;
			
			int f3 = p / stride3;
			f3 = f3 % dim3;
			f3 = f3 + v3_0;
			
			final Point3 retPoint = new Point3(f1, f2, f3);
			return retPoint;
		});
		if(regType) {
			final Region3 retRegRegular = new Region3(ptArray, v1_0, dim1, v2_0, dim2, v3_0, dim3);
			return retRegRegular;
		}
		final Region3 retReg = new Region3(ptArray);
		return retReg;
	}

}
class A {
	public final int f2;


	public int f3;


	public A(final int f2_, final int f3_) {
		int X10_TEMP1 = (f2_);
		int X10_TEMP2 = (f3_);
		f2 = (X10_TEMP1);
		f3 = (X10_TEMP2);
	}



}
value Point3 {
	public final int f0;
	public final int f1;
	public final int f2;


	public Point3(final int f0_, final int f1_, final int f2_) {
		f0 = f0_;
		f1 = f1_;
		f2 = f2_;
	}


}
value Region3 {
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final int low2;
	public final int dim2;
	public final Point3 value[:rank==1] pointArray;


	public Region3(final Point3 value[:rank==1] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 3;
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
		low1 = minusOne;
		dim1 = zero;
		low2 = minusOne;
		dim2 = zero;
	}
	public Region3(final Point3 value[:rank==1] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_, final int low2_, final int dim2_) {
		regRank = 3;
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
		low1 = low1_;
		dim1 = dim1_;
		low2 = low2_;
		dim2 = dim2_;
	}


}
value intRefArray3 {
	public final Dist3 distValue;
	public final int[:rank==1] contents;


	public intRefArray3 (final Dist3 distValue_, final int[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value Dist3 {
	public final Region3 dReg;
	public final dist(:rank==1) dDist;


	public Dist3(final Region3 dReg_, final dist(:rank==1) dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}


}
value intValArray3 {
	public final Region3 regionValue;
	public final int value[:rank==1] contents;


	public intValArray3 (final Region3 regionValue_, final int value[:rank==1] contents_) {
		regionValue = regionValue_;
		contents = contents_;
	}


}
