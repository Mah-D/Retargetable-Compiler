public class TransposeTest {
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

	System.err.println("Running test3");
	if (!test3()) {
	    System.err.println("test3 failed");
	} else {
	    System.err.println("test3 succeeded");
	}
    }

    public static boolean test1() {
	final place p0 = place.places(0);
	final place p1 = place.places(1);
	final place p2 = place.places(2);
	final place p3 = place.places(3);
	
	final dist(:rank==2) dI0 = (dist(:rank==2)) ([0:0,0:7]->p0);
	final dist(:rank==2) dI1 = (dist(:rank==2)) ([1:1,0:7]->p1);
	final dist(:rank==2) dI2 = (dist(:rank==2)) ([2:2,0:7]->p2);
	final dist(:rank==2) dI3 = (dist(:rank==2)) ([3:3,0:7]->p3);
	final dist(:rank==2) dInput = dI0 || dI1 || dI2 || dI3;

	final Complex[:rank==2] input = new Complex[dInput] (point [i,j]) {
	    return new Complex(i,j);
	};

	final dist(:rank==2) dO0 = (dist(:rank==2)) ([0:1,0:3]->p0);
	final dist(:rank==2) dO1 = (dist(:rank==2)) ([2:3,0:3]->p1);
	final dist(:rank==2) dO2 = (dist(:rank==2)) ([4:5,0:3]->p2);
	final dist(:rank==2) dO3 = (dist(:rank==2)) ([6:7,0:3]->p3);
	final dist(:rank==2) dOutput = dO0 || dO1 || dO2 || dO3;

	final Complex[:rank==2] output = new Complex[dOutput] (point [i,j]) {
	    return new Complex(j,i);
	};

	final Complex[:rank==2] result = ArrayUtil.transpose(input);

	return output.valueEquals(result);
    }

    public static boolean test2() {
	final region(:rank==1) r1 = [0 : 64];
	final region(:rank==1) r2 = [0 : 128];

	final dist(:rank==2) dInput = X10Util.distBlockStar(r1, r2);
	final dist(:rank==2) dOutput = X10Util.distBlockStar(r2, r1);

	final Complex[:rank==2] input = new Complex[dInput] (point [i,j]) {
	    return new Complex(i,j);
	};

	final Complex[:rank==2] output = new Complex[dOutput] (point [i,j]) {
	    return new Complex(j,i);
	};

	final Complex[:rank==2] result = ArrayUtil.transpose(input);
	
	return output.valueEquals(result);
    }

    public static boolean test3() {
	final region(:rank==1) r1 = [0 : 66];
	final region(:rank==1) r2 = [0 : 130];

	final dist(:rank==2) dInput = X10Util.distBlockStar(r1, r2);
	final dist(:rank==2) dOutput = X10Util.distBlockStar(r2, r1);

	final Complex[:rank==2] input = new Complex[dInput] (point [i,j]) {
	    return new Complex(i,j);
	};

	final Complex[:rank==2] output = new Complex[dOutput] (point [i,j]) {
	    return new Complex(j,i);
	};

	final Complex[:rank==2] result = ArrayUtil.transpose(input);
	
	return output.valueEquals(result);
    }
}