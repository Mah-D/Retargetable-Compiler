public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program {
	public static final Region1 _MR_r = Program._MR_r_init();
	public static final int _Timer_max_counters = Program._Timer_max_counters_init();
	public static final Dist1 _MR_d = Program._MR_d_init();
	public static final Dist1 _Timer_d = Program._Timer_d_init();
	public static final doubleRefArray1 _Timer_start_time = Program._Timer_start_time_init();
	public static final doubleRefArray1 _Timer_elapsed_time = Program._Timer_elapsed_time_init();
	public static final doubleRefArray1 _Timer_total_time = Program._Timer_total_time_init();


	public static void runMain() {
		Timer tmr = (new Timer());
		int count = (0);
		Program.Timer_start(tmr, count);
		final MR X10_TEMP4 = (new MR());
		Program.MR_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);
		final String X10_TEMP7 = ("Wall-clock time for mapreduce: ");
		final double X10_TEMP8 = (Program.Timer_readTimer(tmr, count));
		final String X10_TEMP9 = (X10_TEMP7 + X10_TEMP8);
		final String X10_TEMP10 = (" secs");
		final String X10_TEMP12 = (X10_TEMP9 + X10_TEMP10);
		System.out.println(X10_TEMP12);
	}

	public static Region1 _MR_r_init() {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (300);
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		return X10_TEMP6;
	}

	public static Dist1 _MR_d_init() {
		final Dist1 X10_TEMP2 = Program.getBlockDist1(_MR_r);
		return X10_TEMP2;
	}

	public static void MR_run(final MR X10_TEMP0) {
		Program.MR_map(X10_TEMP0);
		Program.MR_reduce(X10_TEMP0);
		final int X10_TEMP2 = (X10_TEMP0.total);
		final String X10_TEMP4 = "";
		final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2;
		System.out.println(X10_TEMP3);
	}

	public static void MR_map(final MR X10_TEMP0) {
		final intRefArray1 b = X10_TEMP0.a;
		finish {
			final Dist1 RX10_TEMP1 = b.distValue;
			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
			final Point1 value[:rank==1] RX10_TEMP3 = RX10_TEMP2.pointArray;
			for(point(:rank==1) RX10_TEMP0:RX10_TEMP3) {
				final Point1 p = RX10_TEMP3[RX10_TEMP0];
				final Dist1 RX10_TEMP4 = b.distValue;
				final Dist1 X10_TEMP3 = RX10_TEMP4;
				final Region1 RX10_TEMP5 = X10_TEMP3.dReg;
				final int RX10_TEMP6 = Program.searchPointInRegion1(RX10_TEMP5, p);
				final int RX10_TEMP7 = 0;
				final boolean RX10_TEMP8 = RX10_TEMP6<RX10_TEMP7;
				if(RX10_TEMP8) {
					final String RX10_TEMP9 = "Point p not found in the distribution X10_TEMP3.";
					throw new RuntimeException(RX10_TEMP9);
				}
				final place RX10_TEMP10 = X10_TEMP3.dDist.get(RX10_TEMP6);
				final place X10_TEMP4 = RX10_TEMP10;
				async(X10_TEMP4) {
					final Dist1 RX10_TEMP11 = b.distValue;
					final Region1 RX10_TEMP12 = RX10_TEMP11.dReg;
					final int RX10_TEMP13 = Program.searchPointInRegion1(RX10_TEMP12, p);
					final int RX10_TEMP14 = 0;
					final boolean RX10_TEMP15 = RX10_TEMP13<RX10_TEMP14;
					if (RX10_TEMP15) {
						String RX10_TEMP16 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP16);
					}
					final place RX10_TEMP17 = RX10_TEMP11.dDist.get(RX10_TEMP13);
					final place RX10_TEMP19 = here;
					final boolean RX10_TEMP20 = RX10_TEMP17!=RX10_TEMP19;
					if (RX10_TEMP20) {
						String RX10_TEMP18 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP18);
					}
					final int[:rank==1] RX10_TEMP21 = (int[:rank==1])(b.contents);
					final int X10_TEMP8 = (RX10_TEMP21[RX10_TEMP13]);
					final int X10_TEMP11 = (Program.MR_f(X10_TEMP0, X10_TEMP8));
					final int X10_TEMP12 = (X10_TEMP11);
					final Dist1 RX10_TEMP22 = b.distValue;
					final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;
					final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, p);
					final int RX10_TEMP25 = 0;
					final boolean RX10_TEMP26 = RX10_TEMP24<RX10_TEMP25;
					if (RX10_TEMP26) {
						String RX10_TEMP27 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP27);
					}
					final place RX10_TEMP28 = RX10_TEMP22.dDist.get(RX10_TEMP24);
					final place RX10_TEMP30 = here;
					final boolean RX10_TEMP31 = RX10_TEMP28!=RX10_TEMP30;
					if (RX10_TEMP31) {
						String RX10_TEMP29 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP29);
					}
					final int[:rank==1] RX10_TEMP32 = b.contents;
					RX10_TEMP32[RX10_TEMP24] = (X10_TEMP12);
				}
			}
		}
	}

	public static int MR_f(final MR X10_TEMP0, final int x) {
		int X10_TEMP1 = x;
		final int X10_TEMP3 = (X10_TEMP1 * X10_TEMP1);
		return X10_TEMP3;
	}

	public static void MR_reduce(final MR X10_TEMP0) {
		final place h = (here);
		final intRefArray1 X10_TEMP2 = X10_TEMP0.a;
		final Dist1 RX10_TEMP0 = X10_TEMP2.distValue;
		final Region1 RX10_TEMP1 = RX10_TEMP0.dReg;
		final Region1 reg = RX10_TEMP1;
		final place X10_TEMP4 = (here);
		final Dist1 dis = Program.getPlaceDist1(reg, X10_TEMP4);
		final Region1 RX10_TEMP2 = dis.dReg;
		final dist(:rank==1) RX10_TEMP3 = dis.dDist;
		final int [:rank==1] RX10_TEMP4 = (int [:rank==1])(new int [RX10_TEMP3]);
		final intRefArray1 RX10_TEMP5 = new intRefArray1(dis, RX10_TEMP4);
		final intRefArray1 result = RX10_TEMP5;
		final intRefArray1 X10_TEMP8 = X10_TEMP0.a;
		final Dist1 RX10_TEMP7 = X10_TEMP8.distValue;
		final Region1 RX10_TEMP8 = RX10_TEMP7.dReg;
		final Point1 value[:rank==1] RX10_TEMP9 = RX10_TEMP8.pointArray;
		for(point(:rank==1) RX10_TEMP6:RX10_TEMP9) {
			final Point1 p = RX10_TEMP9[RX10_TEMP6];
			finish {
				final intRefArray1 c = X10_TEMP0.a;
				final intRefArray1 X10_TEMP10 = X10_TEMP0.a;
				final Dist1 RX10_TEMP10 = X10_TEMP10.distValue;
				final Dist1 X10_TEMP11 = RX10_TEMP10;
				final Region1 RX10_TEMP11 = X10_TEMP11.dReg;
				final int RX10_TEMP12 = Program.searchPointInRegion1(RX10_TEMP11, p);
				final int RX10_TEMP13 = 0;
				final boolean RX10_TEMP14 = RX10_TEMP12<RX10_TEMP13;
				if(RX10_TEMP14) {
					final String RX10_TEMP15 = "Point p not found in the distribution X10_TEMP11.";
					throw new RuntimeException(RX10_TEMP15);
				}
				final place RX10_TEMP16 = X10_TEMP11.dDist.get(RX10_TEMP12);
				final place X10_TEMP14 = RX10_TEMP16;
				async(X10_TEMP14) {
					final Dist1 RX10_TEMP17 = c.distValue;
					final Region1 RX10_TEMP18 = RX10_TEMP17.dReg;
					final int RX10_TEMP19 = Program.searchPointInRegion1(RX10_TEMP18, p);
					final int RX10_TEMP20 = 0;
					final boolean RX10_TEMP21 = RX10_TEMP19<RX10_TEMP20;
					if (RX10_TEMP21) {
						String RX10_TEMP22 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP22);
					}
					final place RX10_TEMP23 = RX10_TEMP17.dDist.get(RX10_TEMP19);
					final place RX10_TEMP25 = here;
					final boolean RX10_TEMP26 = RX10_TEMP23!=RX10_TEMP25;
					if (RX10_TEMP26) {
						String RX10_TEMP24 = "Bad place access for array c";
						throw new RuntimeException(RX10_TEMP24);
					}
					final int[:rank==1] RX10_TEMP27 = (int[:rank==1])(c.contents);
					final int v = (RX10_TEMP27[RX10_TEMP19]);
					async(h) {
						final int X10_TEMP21 = (v);
						final Dist1 RX10_TEMP28 = result.distValue;
						final Region1 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion1(RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30<RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final place RX10_TEMP34 = RX10_TEMP28.dDist.get(RX10_TEMP30);
						final place RX10_TEMP36 = here;
						final boolean RX10_TEMP37 = RX10_TEMP34!=RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array result";
							throw new RuntimeException(RX10_TEMP35);
						}
						final int[:rank==1] RX10_TEMP38 = result.contents;
						RX10_TEMP38[RX10_TEMP30] = (X10_TEMP21);
					}
				}
			}
		}
		final Dist1 RX10_TEMP40 = result.distValue;
		final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;
		final Point1 value[:rank==1] RX10_TEMP42 = RX10_TEMP41.pointArray;
		for(point(:rank==1) RX10_TEMP39:RX10_TEMP42) {
			final Point1 p = RX10_TEMP42[RX10_TEMP39];
			final int X10_TEMP25 = (X10_TEMP0.total);
			final Dist1 RX10_TEMP43 = result.distValue;
			final Region1 RX10_TEMP44 = RX10_TEMP43.dReg;
			final int RX10_TEMP45 = Program.searchPointInRegion1(RX10_TEMP44, p);
			final int RX10_TEMP46 = 0;
			final boolean RX10_TEMP47 = RX10_TEMP45<RX10_TEMP46;
			if (RX10_TEMP47) {
				String RX10_TEMP48 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP48);
			}
			final place RX10_TEMP49 = RX10_TEMP43.dDist.get(RX10_TEMP45);
			final place RX10_TEMP51 = here;
			final boolean RX10_TEMP52 = RX10_TEMP49!=RX10_TEMP51;
			if (RX10_TEMP52) {
				String RX10_TEMP50 = "Bad place access for array result";
				throw new RuntimeException(RX10_TEMP50);
			}
			final int[:rank==1] RX10_TEMP53 = (int[:rank==1])(result.contents);
			final int X10_TEMP26 = (RX10_TEMP53[RX10_TEMP45]);
			final int X10_TEMP27 = (X10_TEMP25 + X10_TEMP26);
			X10_TEMP0.total = (X10_TEMP27);
		}
	}

	public static int _Timer_max_counters_init() {
		final int X10_TEMP2 = (64);
		return X10_TEMP2;
	}

	public static Dist1 _Timer_d_init() {
		final int X10_TEMP3 = (0);
		final Region1 X10_TEMP4 = Program.createNewRegion1R(X10_TEMP3, _Timer_max_counters);
		final place X10_TEMP5 = (place.FIRST_PLACE);
		final Dist1 X10_TEMP7 = Program.getPlaceDist1(X10_TEMP4, X10_TEMP5);
		return X10_TEMP7;
	}

	public static doubleRefArray1 _Timer_start_time_init() {
		final Region1 RX10_TEMP0 = _Timer_d.dReg;
		final dist(:rank==1) RX10_TEMP1 = _Timer_d.dDist;
		final double [:rank==1] RX10_TEMP2 = (double [:rank==1])(new double [RX10_TEMP1]);
		final doubleRefArray1 RX10_TEMP3 = new doubleRefArray1(_Timer_d, RX10_TEMP2);
		final doubleRefArray1 X10_TEMP2 = RX10_TEMP3;
		return X10_TEMP2;
	}

	public static doubleRefArray1 _Timer_elapsed_time_init() {
		final Region1 RX10_TEMP0 = _Timer_d.dReg;
		final dist(:rank==1) RX10_TEMP1 = _Timer_d.dDist;
		final double [:rank==1] RX10_TEMP2 = (double [:rank==1])(new double [RX10_TEMP1]);
		final doubleRefArray1 RX10_TEMP3 = new doubleRefArray1(_Timer_d, RX10_TEMP2);
		final doubleRefArray1 X10_TEMP2 = RX10_TEMP3;
		return X10_TEMP2;
	}

	public static doubleRefArray1 _Timer_total_time_init() {
		final Region1 RX10_TEMP0 = _Timer_d.dReg;
		final dist(:rank==1) RX10_TEMP1 = _Timer_d.dDist;
		final double [:rank==1] RX10_TEMP2 = (double [:rank==1])(new double [RX10_TEMP1]);
		final doubleRefArray1 RX10_TEMP3 = new doubleRefArray1(_Timer_d, RX10_TEMP2);
		final doubleRefArray1 X10_TEMP2 = RX10_TEMP3;
		return X10_TEMP2;
	}

	public static void Timer_start(final Timer X10_TEMP0, final int n) {
		int X10_TEMP1 = n;
		final double X10_TEMP5 = (System.currentTimeMillis());
		final double X10_TEMP6 = (X10_TEMP5);
		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP1 = _Timer_start_time.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = RX10_TEMP1.dDist.get(RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array _Timer_start_time";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double[:rank==1] RX10_TEMP11 = _Timer_start_time.contents;
		RX10_TEMP11[RX10_TEMP3] = (X10_TEMP6);
	}

	public static void Timer_stop(final Timer X10_TEMP0, final int n) {
		int X10_TEMP1 = n;
		final double X10_TEMP4 = (System.currentTimeMillis());
		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP1 = _Timer_start_time.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = RX10_TEMP1.dDist.get(RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array _Timer_start_time";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double[:rank==1] RX10_TEMP11 = (double[:rank==1])(_Timer_start_time.contents);
		final double X10_TEMP5 = (RX10_TEMP11[RX10_TEMP3]);
		final double X10_TEMP8 = (X10_TEMP4 - X10_TEMP5);
		final double X10_TEMP9 = (X10_TEMP8);
		final Point1 RX10_TEMP12 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP13 = _Timer_elapsed_time.distValue;
		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);
		final int RX10_TEMP16 = 0;
		final boolean RX10_TEMP17 = RX10_TEMP15<RX10_TEMP16;
		if (RX10_TEMP17) {
			String RX10_TEMP18 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP18);
		}
		final place RX10_TEMP19 = RX10_TEMP13.dDist.get(RX10_TEMP15);
		final place RX10_TEMP21 = here;
		final boolean RX10_TEMP22 = RX10_TEMP19!=RX10_TEMP21;
		if (RX10_TEMP22) {
			String RX10_TEMP20 = "Bad place access for array _Timer_elapsed_time";
			throw new RuntimeException(RX10_TEMP20);
		}
		final double[:rank==1] RX10_TEMP23 = _Timer_elapsed_time.contents;
		RX10_TEMP23[RX10_TEMP15] = (X10_TEMP9);
		final Point1 RX10_TEMP24 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP25 = _Timer_elapsed_time.distValue;
		final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
		final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, RX10_TEMP24);
		final int RX10_TEMP28 = 0;
		final boolean RX10_TEMP29 = RX10_TEMP27<RX10_TEMP28;
		if (RX10_TEMP29) {
			String RX10_TEMP30 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP30);
		}
		final place RX10_TEMP31 = RX10_TEMP25.dDist.get(RX10_TEMP27);
		final place RX10_TEMP33 = here;
		final boolean RX10_TEMP34 = RX10_TEMP31!=RX10_TEMP33;
		if (RX10_TEMP34) {
			String RX10_TEMP32 = "Bad place access for array _Timer_elapsed_time";
			throw new RuntimeException(RX10_TEMP32);
		}
		final double[:rank==1] RX10_TEMP35 = (double[:rank==1])(_Timer_elapsed_time.contents);
		final double X10_TEMP12 = (RX10_TEMP35[RX10_TEMP27]);
		final double X10_TEMP13 = (1000);
		final double X10_TEMP14 = (X10_TEMP12 / X10_TEMP13);
		final Point1 RX10_TEMP36 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP37 = _Timer_elapsed_time.distValue;
		final Region1 RX10_TEMP38 = RX10_TEMP37.dReg;
		final int RX10_TEMP39 = Program.searchPointInRegion1(RX10_TEMP38, RX10_TEMP36);
		final int RX10_TEMP40 = 0;
		final boolean RX10_TEMP41 = RX10_TEMP39<RX10_TEMP40;
		if (RX10_TEMP41) {
			String RX10_TEMP42 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP42);
		}
		final place RX10_TEMP43 = RX10_TEMP37.dDist.get(RX10_TEMP39);
		final place RX10_TEMP45 = here;
		final boolean RX10_TEMP46 = RX10_TEMP43!=RX10_TEMP45;
		if (RX10_TEMP46) {
			String RX10_TEMP44 = "Bad place access for array _Timer_elapsed_time";
			throw new RuntimeException(RX10_TEMP44);
		}
		final double[:rank==1] RX10_TEMP47 = _Timer_elapsed_time.contents;
		RX10_TEMP47[RX10_TEMP39] = (X10_TEMP14);
		final Point1 RX10_TEMP48 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP49 = _Timer_total_time.distValue;
		final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;
		final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50, RX10_TEMP48);
		final int RX10_TEMP52 = 0;
		final boolean RX10_TEMP53 = RX10_TEMP51<RX10_TEMP52;
		if (RX10_TEMP53) {
			String RX10_TEMP54 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP54);
		}
		final place RX10_TEMP55 = RX10_TEMP49.dDist.get(RX10_TEMP51);
		final place RX10_TEMP57 = here;
		final boolean RX10_TEMP58 = RX10_TEMP55!=RX10_TEMP57;
		if (RX10_TEMP58) {
			String RX10_TEMP56 = "Bad place access for array _Timer_total_time";
			throw new RuntimeException(RX10_TEMP56);
		}
		final double[:rank==1] RX10_TEMP59 = (double[:rank==1])(_Timer_total_time.contents);
		final double X10_TEMP18 = (RX10_TEMP59[RX10_TEMP51]);
		final Point1 RX10_TEMP60 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP61 = _Timer_elapsed_time.distValue;
		final Region1 RX10_TEMP62 = RX10_TEMP61.dReg;
		final int RX10_TEMP63 = Program.searchPointInRegion1(RX10_TEMP62, RX10_TEMP60);
		final int RX10_TEMP64 = 0;
		final boolean RX10_TEMP65 = RX10_TEMP63<RX10_TEMP64;
		if (RX10_TEMP65) {
			String RX10_TEMP66 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP66);
		}
		final place RX10_TEMP67 = RX10_TEMP61.dDist.get(RX10_TEMP63);
		final place RX10_TEMP69 = here;
		final boolean RX10_TEMP70 = RX10_TEMP67!=RX10_TEMP69;
		if (RX10_TEMP70) {
			String RX10_TEMP68 = "Bad place access for array _Timer_elapsed_time";
			throw new RuntimeException(RX10_TEMP68);
		}
		final double[:rank==1] RX10_TEMP71 = (double[:rank==1])(_Timer_elapsed_time.contents);
		final double X10_TEMP19 = (RX10_TEMP71[RX10_TEMP63]);
		final double X10_TEMP20 = (X10_TEMP18 + X10_TEMP19);
		final Point1 RX10_TEMP72 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP73 = _Timer_total_time.distValue;
		final Region1 RX10_TEMP74 = RX10_TEMP73.dReg;
		final int RX10_TEMP75 = Program.searchPointInRegion1(RX10_TEMP74, RX10_TEMP72);
		final int RX10_TEMP76 = 0;
		final boolean RX10_TEMP77 = RX10_TEMP75<RX10_TEMP76;
		if (RX10_TEMP77) {
			String RX10_TEMP78 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP78);
		}
		final place RX10_TEMP79 = RX10_TEMP73.dDist.get(RX10_TEMP75);
		final place RX10_TEMP81 = here;
		final boolean RX10_TEMP82 = RX10_TEMP79!=RX10_TEMP81;
		if (RX10_TEMP82) {
			String RX10_TEMP80 = "Bad place access for array _Timer_total_time";
			throw new RuntimeException(RX10_TEMP80);
		}
		final double[:rank==1] RX10_TEMP83 = _Timer_total_time.contents;
		RX10_TEMP83[RX10_TEMP75] = (X10_TEMP20);
	}

	public static double Timer_readTimer(final Timer X10_TEMP0, final int n) {
		int X10_TEMP1 = n;
		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP1 = _Timer_total_time.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = RX10_TEMP1.dDist.get(RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array _Timer_total_time";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double[:rank==1] RX10_TEMP11 = (double[:rank==1])(_Timer_total_time.contents);
		final double X10_TEMP4 = (RX10_TEMP11[RX10_TEMP3]);
		return X10_TEMP4;
	}

	public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
		int X10_TEMP1 = n;
		final double X10_TEMP5 = (0);
		final double X10_TEMP6 = (X10_TEMP5);
		final Point1 RX10_TEMP0 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP1 = _Timer_total_time.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = RX10_TEMP1.dDist.get(RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array _Timer_total_time";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double[:rank==1] RX10_TEMP11 = _Timer_total_time.contents;
		RX10_TEMP11[RX10_TEMP3] = (X10_TEMP6);
		final double X10_TEMP10 = (0);
		final double X10_TEMP11 = (X10_TEMP10);
		final Point1 RX10_TEMP12 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP13 = _Timer_start_time.distValue;
		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);
		final int RX10_TEMP16 = 0;
		final boolean RX10_TEMP17 = RX10_TEMP15<RX10_TEMP16;
		if (RX10_TEMP17) {
			String RX10_TEMP18 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP18);
		}
		final place RX10_TEMP19 = RX10_TEMP13.dDist.get(RX10_TEMP15);
		final place RX10_TEMP21 = here;
		final boolean RX10_TEMP22 = RX10_TEMP19!=RX10_TEMP21;
		if (RX10_TEMP22) {
			String RX10_TEMP20 = "Bad place access for array _Timer_start_time";
			throw new RuntimeException(RX10_TEMP20);
		}
		final double[:rank==1] RX10_TEMP23 = _Timer_start_time.contents;
		RX10_TEMP23[RX10_TEMP15] = (X10_TEMP11);
		final double X10_TEMP15 = (0);
		final double X10_TEMP16 = (X10_TEMP15);
		final Point1 RX10_TEMP24 = new Point1(X10_TEMP1);
		final Dist1 RX10_TEMP25 = _Timer_elapsed_time.distValue;
		final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
		final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, RX10_TEMP24);
		final int RX10_TEMP28 = 0;
		final boolean RX10_TEMP29 = RX10_TEMP27<RX10_TEMP28;
		if (RX10_TEMP29) {
			String RX10_TEMP30 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP30);
		}
		final place RX10_TEMP31 = RX10_TEMP25.dDist.get(RX10_TEMP27);
		final place RX10_TEMP33 = here;
		final boolean RX10_TEMP34 = RX10_TEMP31!=RX10_TEMP33;
		if (RX10_TEMP34) {
			String RX10_TEMP32 = "Bad place access for array _Timer_elapsed_time";
			throw new RuntimeException(RX10_TEMP32);
		}
		final double[:rank==1] RX10_TEMP35 = _Timer_elapsed_time.contents;
		RX10_TEMP35[RX10_TEMP27] = (X10_TEMP16);
	}

	public static void Timer_resetAllTimers(final Timer X10_TEMP0) {
		int i = (0);
		boolean X10_TEMP4 = i<_Timer_max_counters;
		while(X10_TEMP4) {
			Program.Timer_resetTimer(X10_TEMP0, i);
			final int X10_TEMP6 = (i);
			final int X10_TEMP7 = 1;
			i = i + X10_TEMP7;
			X10_TEMP4 = i<_Timer_max_counters;
		}
	}

	public static int constantSearchRegion1(final Region1 r, final Point1 target) {
		final int zero = 0;
		final int one = 1;
		
		final int dim0 = r.dim0;
		final int low0 = r.low0;
		final int high0 = low0 + dim0;
		int pt0 = target.f0;
		final boolean lbound0 = pt0 < low0;
		final boolean hbound0 = pt0 >= high0;
		
		final int dim1 = 1;
		
		boolean outRegion = false;
		outRegion = outRegion || lbound0;
		outRegion = outRegion || hbound0;
		if(outRegion) {
			int notFound = 0;
			notFound = notFound - one;
			return notFound;
		}
		
		final int stride1 = 1;
		final int stride0 = stride1 * dim1;
		
		pt0 = pt0 - low0;
		final int offset0 = stride0 * pt0;
		
		int found = 0;
		found = found + offset0;
		return found;
	}

	/**
	  * This method compares two points of the same rank with each other.
	  * @return 0 if pt1 = pt2, 1 if pt1<pt2, 2 if pt1>pt2
	  */
	public static int comparePoint1(final Point1 pt1, final Point1 pt2) {
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		int point1 = 0;
		int point2 = 0;
		boolean lt = false;
		boolean gt = false;
		// Comparing the 0th coordinate
		point1 = pt1.f0;
		point2 = pt2.f0;
		lt = point1 < point2;
		gt = point1 > point2;
		if(lt) {
			return one;
		}
		if(gt) {
			return two;
		}
		return zero;
	}

	public static int binarySearchRegion1(final Region1 r, final Point1 target) {
		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1])(r.pointArray);
		int start = 0;
		int end = r.pointArray.region.size();
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		end = end - one;
		int result = zero - one;
		boolean notDone = start <= end;
		while (notDone)	{
			int mid = start + end;
			mid = mid/two;
			final Point1 temp = pointArray[mid];
			final int pointCompare = Program.comparePoint1(target, temp);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			if (eq)	{
				return mid;
			}
			else {
				if (lt)	{
					end = mid - one;
				}
				else {
					start = mid + one;
				}
			}
			notDone = start <= end;
		}
		return result;
	}

	public static int searchPointInRegion1(final Region1 r, final Point1 target) {
		final boolean regType = r.regType;
		if(regType) {
			final int constantSearch = Program.constantSearchRegion1(r, target);
			return constantSearch;
		}
		final int binarySearch = Program.binarySearchRegion1(r, target);
		return binarySearch;
	}

	public static Dist1 getBlockDist1(final Region1 r) {
		final int R = r.pointArray.region.size();
		final int N = place.MAX_PLACES;
		final int q = R%N;
		final int p = R/N;
		final int one = 1;
		final int zero = 0;
		int blockSize = p + one;
		int arraySize = q * blockSize;
		int offset = 0;
		place initPlace = place.FIRST_PLACE;
		dist(:rank==1) pointDist1 = Program.getCyclic(arraySize, initPlace, blockSize);
		int remainingPlaces = N - q;
		final boolean cond = remainingPlaces == zero;
		if(cond) {
			final Dist1 retDist = new Dist1(r, pointDist1);
			return retDist;
		}
		offset = arraySize;
		blockSize = p;
		arraySize = remainingPlaces * blockSize;
		//initPlace = place.places(q);
		int chunk = blockSize;
		final boolean ifCond = blockSize > arraySize;
		if(ifCond) {
			chunk = arraySize;
		}
		int index = offset;
		int dSize = index + chunk;
		dSize = dSize - one;
		pointDist1 = pointDist1 || ([index : dSize] -> initPlace);
		index = index + chunk;
		arraySize = arraySize - chunk;
		place pl = initPlace;
		boolean whileCond = arraySize != zero;
		while(whileCond) {
			final boolean tailCond = chunk > arraySize;
			if(tailCond) {
				dSize = index + arraySize;
				dSize = dSize - one;
				pointDist1 = pointDist1 || ([index : dSize] -> pl);
				arraySize = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				pointDist1 = pointDist1 || ([index : dSize] -> pl);
				index = index + chunk;
				arraySize = arraySize - chunk;
			}
			pl = pl.next();
			whileCond = arraySize != zero;
		}
		final Dist1 retDist = new Dist1(r, pointDist1);
		return retDist;
	}

	public static Dist1 getPlaceDist1(final Region1 r, final place p) {
		final int rSize = r.pointArray.region.size();
		final dist(:rank==1) pointDist = Program.getCyclic(rSize, place.FIRST_PLACE, rSize);
		final Dist1 retDist = new Dist1(r, pointDist);
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
		place p = initPlace;
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

	public static Region1 createNewRegion1R(final int v1_0, final int v1_1) {
		final int zero = 0;
		final int one = 1;
		
		boolean regType = true;
		final boolean tempBool1 = true;
		regType = regType && tempBool1;
		
		
		final int l1 = v1_1 - v1_0;
		final int dim1 = l1 + one;
		
		final int stride1 = 1;
		final int stride0 = stride1 * dim1;
		
		final int rSize = stride0 - one;
		final region(:rank==1) regArr = [0 : rSize];
		
		final Point1 value[:rank==1] ptArray = (Point1 value[:rank==1])(new Point1 value[regArr] (point(:rank==1) [p]) {
			int f1 = p / stride1;
			f1 = f1 % dim1;
			f1 = f1 + v1_0;
			
			final Point1 retPoint = new Point1(f1);
			return retPoint;
		});
		if(regType) {
			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1);
			return retRegRegular;
		}
		final Region1 retReg = new Region1(ptArray);
		return retReg;
	}

}
class MR {
	public intRefArray1 a;
	public int total;


	public MR() {
		final Dist1 X10_TEMP1 = Program._MR_d;
		final Region1 RX10_TEMP0 = X10_TEMP1.dReg;
		final dist(:rank==1) RX10_TEMP4 = X10_TEMP1.dDist;
		final int [:rank==1] RX10_TEMP5 = (int [:rank==1])(new int [RX10_TEMP4](point(:rank==1)RX10_TEMP1) {
			final Point1 value[:rank==1] RX10_TEMP3 = RX10_TEMP0.pointArray;
			final Point1 RX10_TEMP2 = RX10_TEMP3[RX10_TEMP1];
			final int i = RX10_TEMP2.f0;
			return i;
		}
		);
		final intRefArray1 RX10_TEMP6 = new intRefArray1(X10_TEMP1, RX10_TEMP5);
		final intRefArray1 X10_TEMP4 = RX10_TEMP6;
		a = X10_TEMP4;
		final int X10_TEMP6 = (0);
		total = (X10_TEMP6);
	}



}
class Timer {
	public Timer() {
		int i = (0);
		final int X10_TEMP2 = (Program._Timer_max_counters);
		boolean X10_TEMP6 = i<X10_TEMP2;
		while(X10_TEMP6) {
			final doubleRefArray1 X10_TEMP7 = Program._Timer_start_time;
			final double X10_TEMP11 = (0);
			final double X10_TEMP12 = (X10_TEMP11);
			final Point1 RX10_TEMP0 = new Point1(i);
			final Dist1 RX10_TEMP1 = X10_TEMP7.distValue;
			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
			final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
			final int RX10_TEMP4 = 0;
			final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
			if (RX10_TEMP5) {
				String RX10_TEMP6 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP6);
			}
			final place RX10_TEMP7 = RX10_TEMP1.dDist.get(RX10_TEMP3);
			final place RX10_TEMP9 = here;
			final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
			if (RX10_TEMP10) {
				String RX10_TEMP8 = "Bad place access for array X10_TEMP7";
				throw new RuntimeException(RX10_TEMP8);
			}
			final double[:rank==1] RX10_TEMP11 = X10_TEMP7.contents;
			RX10_TEMP11[RX10_TEMP3] = (X10_TEMP12);
			final doubleRefArray1 X10_TEMP13 = Program._Timer_elapsed_time;
			final double X10_TEMP17 = (0);
			final double X10_TEMP18 = (X10_TEMP17);
			final Point1 RX10_TEMP12 = new Point1(i);
			final Dist1 RX10_TEMP13 = X10_TEMP13.distValue;
			final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
			final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);
			final int RX10_TEMP16 = 0;
			final boolean RX10_TEMP17 = RX10_TEMP15<RX10_TEMP16;
			if (RX10_TEMP17) {
				String RX10_TEMP18 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP18);
			}
			final place RX10_TEMP19 = RX10_TEMP13.dDist.get(RX10_TEMP15);
			final place RX10_TEMP21 = here;
			final boolean RX10_TEMP22 = RX10_TEMP19!=RX10_TEMP21;
			if (RX10_TEMP22) {
				String RX10_TEMP20 = "Bad place access for array X10_TEMP13";
				throw new RuntimeException(RX10_TEMP20);
			}
			final double[:rank==1] RX10_TEMP23 = X10_TEMP13.contents;
			RX10_TEMP23[RX10_TEMP15] = (X10_TEMP18);
			final doubleRefArray1 X10_TEMP19 = Program._Timer_total_time;
			final double X10_TEMP23 = (0);
			final double X10_TEMP24 = (X10_TEMP23);
			final Point1 RX10_TEMP24 = new Point1(i);
			final Dist1 RX10_TEMP25 = X10_TEMP19.distValue;
			final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
			final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26, RX10_TEMP24);
			final int RX10_TEMP28 = 0;
			final boolean RX10_TEMP29 = RX10_TEMP27<RX10_TEMP28;
			if (RX10_TEMP29) {
				String RX10_TEMP30 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP30);
			}
			final place RX10_TEMP31 = RX10_TEMP25.dDist.get(RX10_TEMP27);
			final place RX10_TEMP33 = here;
			final boolean RX10_TEMP34 = RX10_TEMP31!=RX10_TEMP33;
			if (RX10_TEMP34) {
				String RX10_TEMP32 = "Bad place access for array X10_TEMP19";
				throw new RuntimeException(RX10_TEMP32);
			}
			final double[:rank==1] RX10_TEMP35 = X10_TEMP19.contents;
			RX10_TEMP35[RX10_TEMP27] = (X10_TEMP24);
			final int X10_TEMP25 = (i);
			final int X10_TEMP26 = 1;
			i = i + X10_TEMP26;
			final int X10_TEMP4 = (Program._Timer_max_counters);
			X10_TEMP6 = i<X10_TEMP4;
		}
	}



}
value Dist1 {
	public final Region1 dReg;
	public final dist(:rank==1) dDist;


	public Dist1(final Region1 dReg_, final dist(:rank==1) dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}


}
value Point1 {
	public final int f0;


	public Point1(final int f0_) {
		f0 = f0_;
	}


}
value intRefArray1 {
	public final Dist1 distValue;
	public final int[:rank==1] contents;


	public intRefArray1 (final Dist1 distValue_, final int[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value doubleRefArray1 {
	public final Dist1 distValue;
	public final double[:rank==1] contents;


	public doubleRefArray1 (final Dist1 distValue_, final double[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value Region1 {
	public final int regRank;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1 value[:rank==1] pointArray;


	public Region1(final Point1 value[:rank==1] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 1;
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
	}
	public Region1(final Point1 value[:rank==1] pointArray_, final int low0_, final int dim0_) {
		regRank = 1;
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
	}


}
