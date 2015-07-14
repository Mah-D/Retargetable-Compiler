public class ComplexToDoubleTest {
    public static void main(String[] args) {
	System.err.println("Running test1");
	if (!test1()) {
	    System.err.println("test1 failed");
	} else {
	    System.err.println("test1 succeeded");
	}

	System.err.println("Running test2");
	if (!test2()) {
	    System.err.println("test2 failed");
	} else {
	    System.err.println("test2 succeeded");
	}
    }

    public static boolean test1() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final dist(:rank==1) dY0 = (dist(:rank==1)) ([0:2]->p0);
	final dist(:rank==1) dY1 = (dist(:rank==1)) ([3:3]->p1);
	final dist(:rank==1) dY2 = (dist(:rank==1)) ([4:5]->p2);
	final dist(:rank==1) dY3 = (dist(:rank==1)) ([6:7]->p3);
	final dist(:rank==1) dY = dY0 || dY1 ||	dY2 || dY3;
	final region(:rank==1) rIX = [0 : 1];
	final region(:rank==1) rOX = [0 : 3];
	final dist(:rank==2) dISpace = X10Util.extendRank2D(dY, rIX);
	final dist(:rank==2) dOSpace = X10Util.extendRank2D(dY, rOX);


	final Complex[:rank==2] input = new Complex[dISpace];
	finish ateach (point [i,j] : dISpace) {
	    input[i,j] = new Complex(i + 0.1 * (2 * j), i + 0.1 * (2 * j + 1));
	}

	final double[:rank==2] output = new double[dOSpace];
	finish ateach (point [i,j] : dOSpace) {
	    output[i,j] = i + 0.1 * j;
	}

	final double[:rank==2] result = ArrayUtil.complexToDouble(input);
	
	return output.valueEquals(result);
    }

    public static boolean test2() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	final dist(:rank==1) dY0 = (dist(:rank==1)) ([0:2]->p0);
	final dist(:rank==1) dY1 = (dist(:rank==1)) ([3:3]->p1);
	final dist(:rank==1) dY2 = (dist(:rank==1)) ([4:5]->p2);
	final dist(:rank==1) dY3 = (dist(:rank==1)) ([6:7]->p3);
	final dist(:rank==1) dY = dY0 || dY1 ||	dY2 || dY3;
	final region(:rank==1) rOX = [0 : 1];
	final region(:rank==1) rIX = [0 : 3];
	final dist(:rank==2) dOSpace = X10Util.extendRank2D(dY, rOX);
	final dist(:rank==2) dISpace = X10Util.extendRank2D(dY, rIX);

	final double[:rank==2] input = new double[dISpace];
	finish ateach (point [i,j] : dISpace) {
	    input[i,j] = i + 0.1 * j;
	}

	final Complex[:rank==2] output = new Complex[dOSpace];
	finish ateach (point [i,j] : dOSpace) {
	    output[i,j] = new Complex(i + 0.1 * (2 * j), i + 0.1 * (2 * j + 1));
	}

	final Complex[:rank==2] result = ArrayUtil.doubleToComplex(input);
	
	return output.valueEquals(result);
    }
}