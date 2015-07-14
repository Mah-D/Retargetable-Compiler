public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program {
	public static final int _Timer_max_counters = Program._Timer_max_counters_init();


	public static void runMain() {
		Timer tmr = (new Timer());
		int count = (0);
		Program.Timer_start(tmr, count);
		final Series X10_TEMP4 = (new Series());
		Program.Series_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);
		final String X10_TEMP7 = ("Wall-clock time for series: ");
		final double X10_TEMP8 = (Program.Timer_readTimer(tmr, count));
		final String X10_TEMP9 = (X10_TEMP7 + X10_TEMP8);
		final String X10_TEMP10 = (" secs");
		final String X10_TEMP12 = (X10_TEMP9 + X10_TEMP10);
		System.out.println(X10_TEMP12);
	}

	public static void Series_setSize(final Series X10_TEMP0, final int setsize) {
		final int X10_TEMP3 = (setsize);
		X10_TEMP0.setsize = (X10_TEMP3);
	}

	public static void Series_initialise(final Series X10_TEMP0, final int n) {
		final int X10_TEMP3 = (n);
		X10_TEMP0.array_rows = (X10_TEMP3);
		Program.Series_buildTestData(X10_TEMP0);
	}

	public static void Series_kernel(final Series X10_TEMP0) {
		Program.Series_Do(X10_TEMP0);
	}

	public static void Series_initRefArray(final Series X10_TEMP0, final doubleRefArray2 ref) {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (0);
		final double X10_TEMP7 = (2.8729524964837996);
		final double X10_TEMP8 = (X10_TEMP7);
		final Point2 RX10_TEMP0 = new Point2(X10_TEMP3, X10_TEMP4);
		final Dist2 RX10_TEMP1 = ref.distValue;
		final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist2(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP3, X10_TEMP8);
		final int X10_TEMP11 = (0);
		final int X10_TEMP12 = (1);
		final double X10_TEMP15 = (0.0);
		final double X10_TEMP16 = (X10_TEMP15);
		final Point2 RX10_TEMP11 = new Point2(X10_TEMP11, X10_TEMP12);
		final Dist2 RX10_TEMP12 = ref.distValue;
		final Region2 RX10_TEMP13 = RX10_TEMP12.dReg;
		final int RX10_TEMP14 = Program.searchPointInRegion2(RX10_TEMP13, RX10_TEMP11);
		final int RX10_TEMP15 = 0;
		final boolean RX10_TEMP16 = RX10_TEMP14<RX10_TEMP15;
		if (RX10_TEMP16) {
			String RX10_TEMP17 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP17);
		}
		final place RX10_TEMP18 = Program.getPlaceFromDist2(RX10_TEMP12, RX10_TEMP14);
		final place RX10_TEMP20 = here;
		final boolean RX10_TEMP21 = RX10_TEMP18!=RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP19 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP19);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP14, X10_TEMP16);
		final int X10_TEMP19 = (1);
		final int X10_TEMP20 = (0);
		final double X10_TEMP23 = (1.1161046676147888);
		final double X10_TEMP24 = (X10_TEMP23);
		final Point2 RX10_TEMP22 = new Point2(X10_TEMP19, X10_TEMP20);
		final Dist2 RX10_TEMP23 = ref.distValue;
		final Region2 RX10_TEMP24 = RX10_TEMP23.dReg;
		final int RX10_TEMP25 = Program.searchPointInRegion2(RX10_TEMP24, RX10_TEMP22);
		final int RX10_TEMP26 = 0;
		final boolean RX10_TEMP27 = RX10_TEMP25<RX10_TEMP26;
		if (RX10_TEMP27) {
			String RX10_TEMP28 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP28);
		}
		final place RX10_TEMP29 = Program.getPlaceFromDist2(RX10_TEMP23, RX10_TEMP25);
		final place RX10_TEMP31 = here;
		final boolean RX10_TEMP32 = RX10_TEMP29!=RX10_TEMP31;
		if (RX10_TEMP32) {
			String RX10_TEMP30 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP30);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP25, X10_TEMP24);
		final int X10_TEMP27 = (1);
		final int X10_TEMP28 = (1);
		final double X10_TEMP29 = (1.8819691893398025);
		final int X10_TEMP30 = 0;
		final double X10_TEMP33 = (X10_TEMP30 - X10_TEMP29);
		final double X10_TEMP34 = (X10_TEMP33);
		final Point2 RX10_TEMP33 = new Point2(X10_TEMP27, X10_TEMP28);
		final Dist2 RX10_TEMP34 = ref.distValue;
		final Region2 RX10_TEMP35 = RX10_TEMP34.dReg;
		final int RX10_TEMP36 = Program.searchPointInRegion2(RX10_TEMP35, RX10_TEMP33);
		final int RX10_TEMP37 = 0;
		final boolean RX10_TEMP38 = RX10_TEMP36<RX10_TEMP37;
		if (RX10_TEMP38) {
			String RX10_TEMP39 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP39);
		}
		final place RX10_TEMP40 = Program.getPlaceFromDist2(RX10_TEMP34, RX10_TEMP36);
		final place RX10_TEMP42 = here;
		final boolean RX10_TEMP43 = RX10_TEMP40!=RX10_TEMP42;
		if (RX10_TEMP43) {
			String RX10_TEMP41 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP41);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP36, X10_TEMP34);
		final int X10_TEMP37 = (2);
		final int X10_TEMP38 = (0);
		final double X10_TEMP41 = (0.34429060398168704);
		final double X10_TEMP42 = (X10_TEMP41);
		final Point2 RX10_TEMP44 = new Point2(X10_TEMP37, X10_TEMP38);
		final Dist2 RX10_TEMP45 = ref.distValue;
		final Region2 RX10_TEMP46 = RX10_TEMP45.dReg;
		final int RX10_TEMP47 = Program.searchPointInRegion2(RX10_TEMP46, RX10_TEMP44);
		final int RX10_TEMP48 = 0;
		final boolean RX10_TEMP49 = RX10_TEMP47<RX10_TEMP48;
		if (RX10_TEMP49) {
			String RX10_TEMP50 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP50);
		}
		final place RX10_TEMP51 = Program.getPlaceFromDist2(RX10_TEMP45, RX10_TEMP47);
		final place RX10_TEMP53 = here;
		final boolean RX10_TEMP54 = RX10_TEMP51!=RX10_TEMP53;
		if (RX10_TEMP54) {
			String RX10_TEMP52 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP52);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP47, X10_TEMP42);
		final int X10_TEMP45 = (2);
		final int X10_TEMP46 = (1);
		final double X10_TEMP47 = (1.1645642623320958);
		final int X10_TEMP48 = 0;
		final double X10_TEMP51 = (X10_TEMP48 - X10_TEMP47);
		final double X10_TEMP52 = (X10_TEMP51);
		final Point2 RX10_TEMP55 = new Point2(X10_TEMP45, X10_TEMP46);
		final Dist2 RX10_TEMP56 = ref.distValue;
		final Region2 RX10_TEMP57 = RX10_TEMP56.dReg;
		final int RX10_TEMP58 = Program.searchPointInRegion2(RX10_TEMP57, RX10_TEMP55);
		final int RX10_TEMP59 = 0;
		final boolean RX10_TEMP60 = RX10_TEMP58<RX10_TEMP59;
		if (RX10_TEMP60) {
			String RX10_TEMP61 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP61);
		}
		final place RX10_TEMP62 = Program.getPlaceFromDist2(RX10_TEMP56, RX10_TEMP58);
		final place RX10_TEMP64 = here;
		final boolean RX10_TEMP65 = RX10_TEMP62!=RX10_TEMP64;
		if (RX10_TEMP65) {
			String RX10_TEMP63 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP63);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP58, X10_TEMP52);
		final int X10_TEMP55 = (3);
		final int X10_TEMP56 = (0);
		final double X10_TEMP59 = (0.15238898702519288);
		final double X10_TEMP60 = (X10_TEMP59);
		final Point2 RX10_TEMP66 = new Point2(X10_TEMP55, X10_TEMP56);
		final Dist2 RX10_TEMP67 = ref.distValue;
		final Region2 RX10_TEMP68 = RX10_TEMP67.dReg;
		final int RX10_TEMP69 = Program.searchPointInRegion2(RX10_TEMP68, RX10_TEMP66);
		final int RX10_TEMP70 = 0;
		final boolean RX10_TEMP71 = RX10_TEMP69<RX10_TEMP70;
		if (RX10_TEMP71) {
			String RX10_TEMP72 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP72);
		}
		final place RX10_TEMP73 = Program.getPlaceFromDist2(RX10_TEMP67, RX10_TEMP69);
		final place RX10_TEMP75 = here;
		final boolean RX10_TEMP76 = RX10_TEMP73!=RX10_TEMP75;
		if (RX10_TEMP76) {
			String RX10_TEMP74 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP74);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP69, X10_TEMP60);
		final int X10_TEMP63 = (3);
		final int X10_TEMP64 = (1);
		final double X10_TEMP65 = (0.8143461113044298);
		final int X10_TEMP66 = 0;
		final double X10_TEMP69 = (X10_TEMP66 - X10_TEMP65);
		final double X10_TEMP70 = (X10_TEMP69);
		final Point2 RX10_TEMP77 = new Point2(X10_TEMP63, X10_TEMP64);
		final Dist2 RX10_TEMP78 = ref.distValue;
		final Region2 RX10_TEMP79 = RX10_TEMP78.dReg;
		final int RX10_TEMP80 = Program.searchPointInRegion2(RX10_TEMP79, RX10_TEMP77);
		final int RX10_TEMP81 = 0;
		final boolean RX10_TEMP82 = RX10_TEMP80<RX10_TEMP81;
		if (RX10_TEMP82) {
			String RX10_TEMP83 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP83);
		}
		final place RX10_TEMP84 = Program.getPlaceFromDist2(RX10_TEMP78, RX10_TEMP80);
		final place RX10_TEMP86 = here;
		final boolean RX10_TEMP87 = RX10_TEMP84!=RX10_TEMP86;
		if (RX10_TEMP87) {
			String RX10_TEMP85 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP85);
		}
		Program.setRefArrayValue2double(ref, RX10_TEMP80, X10_TEMP70);
	}

	public static void Series_validate(final Series X10_TEMP0) {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (3);
		final int X10_TEMP7 = (0);
		final int X10_TEMP8 = (1);
		final Region2 r = Program.createNewRegion2RR(X10_TEMP3, X10_TEMP4, X10_TEMP7, X10_TEMP8);
		final place X10_TEMP10 = (here);
		final Dist2 vd = Program.getPlaceDist2(r, X10_TEMP10);
		final Region2 RX10_TEMP0 = vd.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = place.MAX_PLACES;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
		final dist(:rank==1) RX10_TEMP5 = [0 : RX10_TEMP3] -> here;
		final doubleStub [:rank==1] RX10_TEMP6 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP5]);
		finish {
			for(point(:rank==1)RX10_TEMP7:RX10_TEMP4) {
				final place RX10_TEMP8 = here;
				final int RX10_TEMP9 = RX10_TEMP7[0];
				final place RX10_TEMP10 = place.places(RX10_TEMP9);
				final int RX10_TEMP11 = Program.getDistLocalCount2(vd, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP14= [0 : RX10_TEMP12] -> here;
					final double [:rank==1] RX10_TEMP15 = (double [:rank==1])(new double [RX10_TEMP14](point(:rank==1)RX10_TEMP13) {
						final double X10_TEMP13 = (0.0);
						return X10_TEMP13;
					}
					);
					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15);
					async(RX10_TEMP8) {
						RX10_TEMP6[RX10_TEMP7] = (RX10_TEMP16);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP17 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP4](point(:rank==1)RX10_TEMP19){
			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			return RX10_TEMP18;
		});
		final doubleRefArray2 RX10_TEMP20 = new doubleRefArray2(vd, RX10_TEMP17);
		final doubleRefArray2 ref = RX10_TEMP20;
		Program.Series_initRefArray(X10_TEMP0, ref);
		final Region2 RX10_TEMP23 = vd.dReg;
		final int RX10_TEMP26 = 1;
		int RX10_TEMP24 = RX10_TEMP23.regSize;
		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26;
		final region(:rank==1) RX10_TEMP25 = [0 : RX10_TEMP24];
		for(point(:rank==1) RX10_TEMP21:RX10_TEMP25) {
			final int RX10_TEMP27 = RX10_TEMP21[0];
			final Point2 RX10_TEMP22 = Program.regionOrdinalPoint2(RX10_TEMP23, RX10_TEMP27);
			final int i = RX10_TEMP22.f0;
			final int j = RX10_TEMP22.f1;
			final int ii = (i);
			final int jj = (j);
			double cval = (0);
			final place curr_place = (here);
			final int X10_TEMP23 = (0);
			final int X10_TEMP24 = (0);
			final Region1 tempr = Program.createNewRegion1R(X10_TEMP23, X10_TEMP24);
			final place X10_TEMP26 = (here);
			final Dist1 tempvd = Program.getPlaceDist1(tempr, X10_TEMP26);
			final Region1 RX10_TEMP28 = tempvd.dReg;
			final int RX10_TEMP29 = 0;
			final int RX10_TEMP30 = 1;
			int RX10_TEMP31 = place.MAX_PLACES;
			RX10_TEMP31 = RX10_TEMP31 - RX10_TEMP30;
			final region(:rank==1) RX10_TEMP32 = [0 : RX10_TEMP31];
			final dist(:rank==1) RX10_TEMP33 = [0 : RX10_TEMP31] -> here;
			final doubleStub [:rank==1] RX10_TEMP34 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP33]);
			finish {
				for(point(:rank==1)RX10_TEMP35:RX10_TEMP32) {
					final place RX10_TEMP36 = here;
					final int RX10_TEMP37 = RX10_TEMP35[0];
					final place RX10_TEMP38 = place.places(RX10_TEMP37);
					final int RX10_TEMP39 = Program.getDistLocalCount1(tempvd, RX10_TEMP37);
					final int RX10_TEMP40 = RX10_TEMP39 - RX10_TEMP30;
					async(RX10_TEMP38) {
						final dist(:rank==1) RX10_TEMP42= [0 : RX10_TEMP40] -> here;
						final double [:rank==1] RX10_TEMP43 = (double [:rank==1])(new double [RX10_TEMP42](point(:rank==1)RX10_TEMP41) {
							final double X10_TEMP29 = (0.0);
							return X10_TEMP29;
						}
						);
						final doubleStub RX10_TEMP44 = new doubleStub(RX10_TEMP43);
						async(RX10_TEMP36) {
							RX10_TEMP34[RX10_TEMP35] = (RX10_TEMP44);
						}
					}
				}
			}
			final doubleStub value[:rank==1] RX10_TEMP45 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP32](point(:rank==1)RX10_TEMP47){
				final doubleStub RX10_TEMP46 = RX10_TEMP34[RX10_TEMP47];
				return RX10_TEMP46;
			});
			final doubleRefArray1 RX10_TEMP48 = new doubleRefArray1(tempvd, RX10_TEMP45);
			final doubleRefArray1 tempref = RX10_TEMP48;
			final doubleRefArray2 tA = X10_TEMP0.testArray;
			finish {
				final doubleRefArray2 X10_TEMP32 = X10_TEMP0.testArray;
				final Dist2 RX10_TEMP49 = X10_TEMP32.distValue;
				final Dist2 X10_TEMP33 = RX10_TEMP49;
				final Point2 RX10_TEMP50 = new Point2(j, i);
				final Region2 RX10_TEMP51 = X10_TEMP33.dReg;
				final int RX10_TEMP52 = Program.searchPointInRegion2(RX10_TEMP51, RX10_TEMP50);
				final int RX10_TEMP53 = 0;
				final boolean RX10_TEMP54 = RX10_TEMP52<RX10_TEMP53;
				if(RX10_TEMP54) {
					final String RX10_TEMP55 = "Point RX10_TEMP50 not found in the distribution X10_TEMP33.";
					throw new RuntimeException(RX10_TEMP55);
				}
				final place RX10_TEMP56 = Program.getPlaceFromDist2(X10_TEMP33, RX10_TEMP52);
				final place X10_TEMP37 = RX10_TEMP56;
				async(X10_TEMP37) {
					final Point2 RX10_TEMP57 = new Point2(jj, ii);
					final Dist2 RX10_TEMP58 = tA.distValue;
					final Region2 RX10_TEMP59 = RX10_TEMP58.dReg;
					final int RX10_TEMP60 = Program.searchPointInRegion2(RX10_TEMP59, RX10_TEMP57);
					final int RX10_TEMP61 = 0;
					final boolean RX10_TEMP62 = RX10_TEMP60<RX10_TEMP61;
					if (RX10_TEMP62) {
						String RX10_TEMP63 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP63);
					}
					final place RX10_TEMP64 = Program.getPlaceFromDist2(RX10_TEMP58, RX10_TEMP60);
					final place RX10_TEMP66 = here;
					final boolean RX10_TEMP67 = RX10_TEMP64!=RX10_TEMP66;
					if (RX10_TEMP67) {
						String RX10_TEMP65 = "Bad place access for array tA";
						throw new RuntimeException(RX10_TEMP65);
					}
					final double RX10_TEMP68 = Program.getRefArrayValue2double(tA, RX10_TEMP60);
					final double temp = (RX10_TEMP68);
					async(curr_place) {
						final int X10_TEMP43 = (0);
						final double X10_TEMP46 = (temp);
						final Point1 RX10_TEMP69 = new Point1(X10_TEMP43);
						final Dist1 RX10_TEMP70 = tempref.distValue;
						final Region1 RX10_TEMP71 = RX10_TEMP70.dReg;
						final int RX10_TEMP72 = Program.searchPointInRegion1(RX10_TEMP71, RX10_TEMP69);
						final int RX10_TEMP73 = 0;
						final boolean RX10_TEMP74 = RX10_TEMP72<RX10_TEMP73;
						if (RX10_TEMP74) {
							String RX10_TEMP75 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP75);
						}
						final place RX10_TEMP76 = Program.getPlaceFromDist1(RX10_TEMP70, RX10_TEMP72);
						final place RX10_TEMP78 = here;
						final boolean RX10_TEMP79 = RX10_TEMP76!=RX10_TEMP78;
						if (RX10_TEMP79) {
							String RX10_TEMP77 = "Bad place access for array tempref";
							throw new RuntimeException(RX10_TEMP77);
						}
						Program.setRefArrayValue1double(tempref, RX10_TEMP72, X10_TEMP46);
					}
				}
			}
			final int X10_TEMP48 = (0);
			final Point1 RX10_TEMP80 = new Point1(X10_TEMP48);
			final Dist1 RX10_TEMP81 = tempref.distValue;
			final Region1 RX10_TEMP82 = RX10_TEMP81.dReg;
			final int RX10_TEMP83 = Program.searchPointInRegion1(RX10_TEMP82, RX10_TEMP80);
			final int RX10_TEMP84 = 0;
			final boolean RX10_TEMP85 = RX10_TEMP83<RX10_TEMP84;
			if (RX10_TEMP85) {
				String RX10_TEMP86 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP86);
			}
			final place RX10_TEMP87 = Program.getPlaceFromDist1(RX10_TEMP81, RX10_TEMP83);
			final place RX10_TEMP89 = here;
			final boolean RX10_TEMP90 = RX10_TEMP87!=RX10_TEMP89;
			if (RX10_TEMP90) {
				String RX10_TEMP88 = "Bad place access for array tempref";
				throw new RuntimeException(RX10_TEMP88);
			}
			final double RX10_TEMP91 = Program.getRefArrayValue1double(tempref, RX10_TEMP83);
			final double X10_TEMP50 = (RX10_TEMP91);
			cval = (X10_TEMP50);
			final Point2 RX10_TEMP92 = new Point2(i, j);
			final Dist2 RX10_TEMP93 = ref.distValue;
			final Region2 RX10_TEMP94 = RX10_TEMP93.dReg;
			final int RX10_TEMP95 = Program.searchPointInRegion2(RX10_TEMP94, RX10_TEMP92);
			final int RX10_TEMP96 = 0;
			final boolean RX10_TEMP97 = RX10_TEMP95<RX10_TEMP96;
			if (RX10_TEMP97) {
				String RX10_TEMP98 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP98);
			}
			final place RX10_TEMP99 = Program.getPlaceFromDist2(RX10_TEMP93, RX10_TEMP95);
			final place RX10_TEMP101 = here;
			final boolean RX10_TEMP102 = RX10_TEMP99!=RX10_TEMP101;
			if (RX10_TEMP102) {
				String RX10_TEMP100 = "Bad place access for array ref";
				throw new RuntimeException(RX10_TEMP100);
			}
			final double RX10_TEMP103 = Program.getRefArrayValue2double(ref, RX10_TEMP95);
			final double X10_TEMP53 = (RX10_TEMP103);
			final double X10_TEMP55 = (cval - X10_TEMP53);
			double error = (Math.abs(X10_TEMP55));
			final double X10_TEMP57 = (1.0e-12);
			final boolean X10_TEMP59 = error>X10_TEMP57;
			if(X10_TEMP59) {
				final String X10_TEMP60 = ("Validation failed for coefficient ");
				final String X10_TEMP61 = (X10_TEMP60 + j);
				final String X10_TEMP62 = (",");
				final String X10_TEMP63 = (X10_TEMP61 + X10_TEMP62);
				final String X10_TEMP65 = (X10_TEMP63 + i);
				System.out.println(X10_TEMP65);
				final String X10_TEMP66 = ("Computed value = ");
				final String X10_TEMP68 = (X10_TEMP66 + cval);
				System.out.println(X10_TEMP68);
				final String X10_TEMP71 = ("Reference value = ");
				final Point2 RX10_TEMP104 = new Point2(i, j);
				final Dist2 RX10_TEMP105 = ref.distValue;
				final Region2 RX10_TEMP106 = RX10_TEMP105.dReg;
				final int RX10_TEMP107 = Program.searchPointInRegion2(RX10_TEMP106, RX10_TEMP104);
				final int RX10_TEMP108 = 0;
				final boolean RX10_TEMP109 = RX10_TEMP107<RX10_TEMP108;
				if (RX10_TEMP109) {
					String RX10_TEMP110 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP110);
				}
				final place RX10_TEMP111 = Program.getPlaceFromDist2(RX10_TEMP105, RX10_TEMP107);
				final place RX10_TEMP113 = here;
				final boolean RX10_TEMP114 = RX10_TEMP111!=RX10_TEMP113;
				if (RX10_TEMP114) {
					String RX10_TEMP112 = "Bad place access for array ref";
					throw new RuntimeException(RX10_TEMP112);
				}
				final double RX10_TEMP115 = Program.getRefArrayValue2double(ref, RX10_TEMP107);
				final double X10_TEMP72 = (RX10_TEMP115);
				final String X10_TEMP74 = (X10_TEMP71 + X10_TEMP72);
				System.out.println(X10_TEMP74);
				final String X10_TEMP76 = ("Validation failed");
				throw new RuntimeException(X10_TEMP76);
			}
		}
	}

	public static void Series_tidyup(final Series X10_TEMP0) {
		Program.Series_freeTestData(X10_TEMP0);
	}

	public static void Series_run(final Series X10_TEMP0) {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (0);
		final Region1 tempregion = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		final place X10_TEMP6 = (here);
		final Dist1 tempdist = Program.getPlaceDist1(tempregion, X10_TEMP6);
		int j = (10000);
		final Region1 RX10_TEMP1 = tempdist.dReg;
		final int RX10_TEMP4 = 1;
		int RX10_TEMP2 = RX10_TEMP1.regSize;
		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
		final region(:rank==1) RX10_TEMP3 = [0 : RX10_TEMP2];
		for(point(:rank==1) RX10_TEMP0:RX10_TEMP3) {
			final int RX10_TEMP5 = RX10_TEMP0[0];
			final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5);
			final int X10_TEMP11 = (0);
			Program.Series_setSize(X10_TEMP0, X10_TEMP11);
			final int X10_TEMP14 = (100);
			final int X10_TEMP15 = (0);
			final double X10_TEMP16 = (Math.pow(X10_TEMP14,X10_TEMP15));
			final double X10_TEMP18 = (j * X10_TEMP16);
			final int X10_TEMP20 = ((int)X10_TEMP18);
			Program.Series_initialise(X10_TEMP0, X10_TEMP20);
			Program.Series_kernel(X10_TEMP0);
			Program.Series_validate(X10_TEMP0);
		}
		Program.Series_tidyup(X10_TEMP0);
	}

	public static void Series_buildTestData(final Series X10_TEMP0) {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (1);
		final int X10_TEMP9 = (0);
		final int X10_TEMP6 = (X10_TEMP0.array_rows);
		final int X10_TEMP7 = (1);
		final int X10_TEMP10 = (X10_TEMP6 - X10_TEMP7);
		final Region2 R = Program.createNewRegion2RR(X10_TEMP3, X10_TEMP4, X10_TEMP9, X10_TEMP10);
		final Dist2 X10_TEMP13 = Program.getBlockDist2(R);
		final Dist2 d = X10_TEMP13;
		final Region2 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = place.MAX_PLACES;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
		final dist(:rank==1) RX10_TEMP5 = [0 : RX10_TEMP3] -> here;
		final doubleStub [:rank==1] RX10_TEMP6 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP5]);
		finish {
			for(point(:rank==1)RX10_TEMP7:RX10_TEMP4) {
				final place RX10_TEMP8 = here;
				final int RX10_TEMP9 = RX10_TEMP7[0];
				final place RX10_TEMP10 = place.places(RX10_TEMP9);
				final int RX10_TEMP11 = Program.getDistLocalCount2(d, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP13= [0 : RX10_TEMP12] -> here;
					final double [:rank==1] RX10_TEMP14 = (double [:rank==1])(new double [RX10_TEMP13]);
					final doubleStub RX10_TEMP15 = new doubleStub(RX10_TEMP14);
					async(RX10_TEMP8) {
						RX10_TEMP6[RX10_TEMP7] = (RX10_TEMP15);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP16 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP4](point(:rank==1)RX10_TEMP18){
			final doubleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			return RX10_TEMP17;
		});
		final doubleRefArray2 RX10_TEMP19 = new doubleRefArray2(d, RX10_TEMP16);
		final doubleRefArray2 X10_TEMP15 = RX10_TEMP19;
		final doubleRefArray2 X10_TEMP18 = X10_TEMP15;
		X10_TEMP0.testArray = (X10_TEMP18);
	}

	public static void Series_Do(final Series X10_TEMP0) {
		final doubleRefArray2 X10_TEMP1 = X10_TEMP0.testArray;
		final int X10_TEMP4 = (0);
		final int X10_TEMP5 = (0);
		final double X10_TEMP6 = (0.0);
		final double X10_TEMP14 = ((double)X10_TEMP6);
		final double X10_TEMP8 = (2.0);
		final double X10_TEMP15 = ((double)X10_TEMP8);
		final int X10_TEMP16 = (1000);
		final double X10_TEMP11 = (0.0);
		final double X10_TEMP17 = ((double)X10_TEMP11);
		final int X10_TEMP18 = (0);
		final double X10_TEMP20 = (Program.Series_TrapezoidIntegrate(X10_TEMP0, X10_TEMP14, X10_TEMP15, X10_TEMP16, X10_TEMP17, X10_TEMP18));
		final double X10_TEMP19 = (2.0);
		final double X10_TEMP21 = ((double)X10_TEMP19);
		final double X10_TEMP24 = (X10_TEMP20 / X10_TEMP21);
		final double X10_TEMP25 = (X10_TEMP24);
		final Point2 RX10_TEMP0 = new Point2(X10_TEMP4, X10_TEMP5);
		final Dist2 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist2(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue2double(X10_TEMP1, RX10_TEMP3, X10_TEMP25);
		final double X10_TEMP26 = (3.1415926535897932);
		final double omega = ((double)X10_TEMP26);
		final Dist1 X10_TEMP28 = Program.getUniqueDist();
		final Dist1 U = X10_TEMP28;
		final doubleRefArray2 tA = X10_TEMP0.testArray;
		finish {
			final Region1 RX10_TEMP12 = U.dReg;
			final int RX10_TEMP15 = 1;
			int RX10_TEMP13 = RX10_TEMP12.regSize;
			RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
			final region(:rank==1) RX10_TEMP14 = [0 : RX10_TEMP13];
			for(point(:rank==1) RX10_TEMP11:RX10_TEMP14) {
				final int RX10_TEMP16 = RX10_TEMP11[0];
				final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP12, RX10_TEMP16);
				final Region1 RX10_TEMP17 = U.dReg;
				final int RX10_TEMP18 = Program.searchPointInRegion1(RX10_TEMP17, p);
				final int RX10_TEMP19 = 0;
				final boolean RX10_TEMP20 = RX10_TEMP18<RX10_TEMP19;
				if(RX10_TEMP20) {
					final String RX10_TEMP21 = "Point p not found in the distribution U.";
					throw new RuntimeException(RX10_TEMP21);
				}
				final place RX10_TEMP22 = Program.getPlaceFromDist1(U, RX10_TEMP18);
				final place X10_TEMP32 = RX10_TEMP22;
				async(X10_TEMP32) {
					int ilow = (0);
					final Region1 RX10_TEMP23 = U.dReg;
					final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, p);
					final int RX10_TEMP25 = 0;
					final boolean RX10_TEMP26 = RX10_TEMP24<RX10_TEMP25;
					if(RX10_TEMP26) {
						final String RX10_TEMP27 = "Point p not found in the distribution U.";
						throw new RuntimeException(RX10_TEMP27);
					}
					final place RX10_TEMP28 = Program.getPlaceFromDist1(U, RX10_TEMP24);
					final place X10_TEMP35 = (RX10_TEMP28);
					final boolean X10_TEMP37 = X10_TEMP35.isFirst();
					if(X10_TEMP37) {
						final int X10_TEMP39 = (1);
						ilow = (X10_TEMP39);
					}
					else {
						final int X10_TEMP41 = (0);
						ilow = (X10_TEMP41);
					}
					final Dist2 RX10_TEMP29 = tA.distValue;
					final Dist2 X10_TEMP42 = RX10_TEMP29;
					final place X10_TEMP43 = (here);
					final Dist2 X10_TEMP45 = Program.restrictDist2(X10_TEMP42,X10_TEMP43);
					final Region2 RX10_TEMP31 = X10_TEMP45.dReg;
					final int RX10_TEMP34 = 1;
					int RX10_TEMP32 = RX10_TEMP31.regSize;
					RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34;
					final region(:rank==1) RX10_TEMP33 = [0 : RX10_TEMP32];
					for(point(:rank==1) RX10_TEMP30:RX10_TEMP33) {
						final int RX10_TEMP35 = RX10_TEMP30[0];
						final Point2 pp = Program.regionOrdinalPoint2(RX10_TEMP31, RX10_TEMP35);
						final int X10_TEMP47 = (pp.f1);
						final boolean X10_TEMP49 = X10_TEMP47>=ilow;
						if(X10_TEMP49) {
							final int X10_TEMP51 = (pp.f0);
							final int X10_TEMP52 = (0);
							final boolean X10_TEMP54 = X10_TEMP51==X10_TEMP52;
							if(X10_TEMP54) {
								final double X10_TEMP56 = (0.0);
								final double X10_TEMP66 = ((double)X10_TEMP56);
								final double X10_TEMP58 = (2.0);
								final double X10_TEMP67 = ((double)X10_TEMP58);
								final int X10_TEMP68 = (1000);
								final int X10_TEMP62 = (pp.f1);
								final double X10_TEMP63 = ((double)X10_TEMP62);
								final double X10_TEMP69 = (omega * X10_TEMP63);
								final int X10_TEMP70 = (1);
								final double X10_TEMP73 = (Program.Series_TrapezoidIntegrate(X10_TEMP0, X10_TEMP66, X10_TEMP67, X10_TEMP68, X10_TEMP69, X10_TEMP70));
								final double X10_TEMP74 = (X10_TEMP73);
								final Dist2 RX10_TEMP36 = tA.distValue;
								final Region2 RX10_TEMP37 = RX10_TEMP36.dReg;
								final int RX10_TEMP38 = Program.searchPointInRegion2(RX10_TEMP37, pp);
								final int RX10_TEMP39 = 0;
								final boolean RX10_TEMP40 = RX10_TEMP38<RX10_TEMP39;
								if (RX10_TEMP40) {
									String RX10_TEMP41 = "Array index out of bounds";
									throw new RuntimeException(RX10_TEMP41);
								}
								final place RX10_TEMP42 = Program.getPlaceFromDist2(RX10_TEMP36, RX10_TEMP38);
								final place RX10_TEMP44 = here;
								final boolean RX10_TEMP45 = RX10_TEMP42!=RX10_TEMP44;
								if (RX10_TEMP45) {
									String RX10_TEMP43 = "Bad place access for array tA";
									throw new RuntimeException(RX10_TEMP43);
								}
								Program.setRefArrayValue2double(tA, RX10_TEMP38, X10_TEMP74);
							}
							else {
								final double X10_TEMP76 = (0.0);
								final double X10_TEMP86 = ((double)X10_TEMP76);
								final double X10_TEMP78 = (2.0);
								final double X10_TEMP87 = ((double)X10_TEMP78);
								final int X10_TEMP88 = (1000);
								final int X10_TEMP82 = (pp.f1);
								final double X10_TEMP83 = ((double)X10_TEMP82);
								final double X10_TEMP89 = (omega * X10_TEMP83);
								final int X10_TEMP90 = (2);
								final double X10_TEMP93 = (Program.Series_TrapezoidIntegrate(X10_TEMP0, X10_TEMP86, X10_TEMP87, X10_TEMP88, X10_TEMP89, X10_TEMP90));
								final double X10_TEMP94 = (X10_TEMP93);
								final Dist2 RX10_TEMP46 = tA.distValue;
								final Region2 RX10_TEMP47 = RX10_TEMP46.dReg;
								final int RX10_TEMP48 = Program.searchPointInRegion2(RX10_TEMP47, pp);
								final int RX10_TEMP49 = 0;
								final boolean RX10_TEMP50 = RX10_TEMP48<RX10_TEMP49;
								if (RX10_TEMP50) {
									String RX10_TEMP51 = "Array index out of bounds";
									throw new RuntimeException(RX10_TEMP51);
								}
								final place RX10_TEMP52 = Program.getPlaceFromDist2(RX10_TEMP46, RX10_TEMP48);
								final place RX10_TEMP54 = here;
								final boolean RX10_TEMP55 = RX10_TEMP52!=RX10_TEMP54;
								if (RX10_TEMP55) {
									String RX10_TEMP53 = "Bad place access for array tA";
									throw new RuntimeException(RX10_TEMP53);
								}
								Program.setRefArrayValue2double(tA, RX10_TEMP48, X10_TEMP94);
							}
						}
					}
				}
			}
		}
	}

	public static double Series_TrapezoidIntegrate(final Series X10_TEMP0, final double x0, final double x1, final int a_nsteps, final double omegan, final int select) {
		double x = (0.0);
		double dx = (0.0);
		double rvalue = (0.0);
		int nsteps = (a_nsteps);
		x = (x0);
		final double X10_TEMP7 = (x1 - x0);
		final double X10_TEMP8 = ((double)nsteps);
		final double X10_TEMP10 = (X10_TEMP7 / X10_TEMP8);
		dx = (X10_TEMP10);
		final double X10_TEMP15 = (Program.Series_thefunction(X10_TEMP0, x0, omegan, select));
		final double X10_TEMP14 = (2.0);
		final double X10_TEMP16 = ((double)X10_TEMP14);
		final double X10_TEMP18 = (X10_TEMP15 / X10_TEMP16);
		rvalue = (X10_TEMP18);
		final int X10_TEMP19 = (1);
		final boolean X10_TEMP21 = nsteps!=X10_TEMP19;
		if(X10_TEMP21) {
			final int X10_TEMP22 = (nsteps);
			final int X10_TEMP23 = 1;
			nsteps = nsteps - X10_TEMP23;
			final int X10_TEMP24 = (nsteps);
			final int X10_TEMP25 = 1;
			nsteps = nsteps - X10_TEMP25;
			final int X10_TEMP26 = (0);
			boolean X10_TEMP30 = nsteps>X10_TEMP26;
			while(X10_TEMP30) {
				final double X10_TEMP32 = (x + dx);
				x = (X10_TEMP32);
				final double X10_TEMP36 = (Program.Series_thefunction(X10_TEMP0, x, omegan, select));
				final double X10_TEMP38 = (rvalue + X10_TEMP36);
				rvalue = (X10_TEMP38);
				final int X10_TEMP39 = (nsteps);
				final int X10_TEMP40 = 1;
				nsteps = nsteps - X10_TEMP40;
				final int X10_TEMP28 = (0);
				X10_TEMP30 = nsteps>X10_TEMP28;
			}
		}
		final double X10_TEMP45 = (Program.Series_thefunction(X10_TEMP0, x1, omegan, select));
		final double X10_TEMP44 = (2.0);
		final double X10_TEMP46 = ((double)X10_TEMP44);
		final double X10_TEMP47 = (X10_TEMP45 / X10_TEMP46);
		final double X10_TEMP49 = (rvalue + X10_TEMP47);
		final double X10_TEMP51 = (X10_TEMP49 * dx);
		rvalue = (X10_TEMP51);
		final double X10_TEMP53 = (rvalue);
		return X10_TEMP53;
	}

	public static double Series_thefunction(final Series X10_TEMP0, final double x, final double omegan, final int select) {
		final int X10_TEMP3 = 0;
		final int X10_TEMP13 = 1;
		final int X10_TEMP27 = 2;
		switch(select) {
		case X10_TEMP3: {
			final double X10_TEMP4 = (1.0);
			final double X10_TEMP5 = ((double)X10_TEMP4);
			final double X10_TEMP8 = (x + X10_TEMP5);
			final double X10_TEMP10 = (Math.pow(X10_TEMP8,x));
			return X10_TEMP10;
		}
		case X10_TEMP13: {
			final double X10_TEMP14 = (1.0);
			final double X10_TEMP15 = ((double)X10_TEMP14);
			final double X10_TEMP18 = (x + X10_TEMP15);
			final double X10_TEMP21 = (Math.pow(X10_TEMP18,x));
			final double X10_TEMP20 = (omegan * x);
			final double X10_TEMP22 = (Math.cos(X10_TEMP20));
			final double X10_TEMP24 = (X10_TEMP21 * X10_TEMP22);
			return X10_TEMP24;
		}
		case X10_TEMP27: {
			final double X10_TEMP28 = (1.0);
			final double X10_TEMP29 = ((double)X10_TEMP28);
			final double X10_TEMP32 = (x + X10_TEMP29);
			final double X10_TEMP35 = (Math.pow(X10_TEMP32,x));
			final double X10_TEMP34 = (omegan * x);
			final double X10_TEMP36 = (Math.sin(X10_TEMP34));
			final double X10_TEMP38 = (X10_TEMP35 * X10_TEMP36);
			return X10_TEMP38;
		}
		}
		final double X10_TEMP41 = (0.0);
		return X10_TEMP41;
	}

	public static void Series_freeTestData(final Series X10_TEMP0) {
	}

	public static int _Timer_max_counters_init() {
		final int X10_TEMP2 = (64);
		return X10_TEMP2;
	}

	public static void Timer_start(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.start_time;
		final double X10_TEMP5 = (System.currentTimeMillis());
		final double X10_TEMP6 = (X10_TEMP5);
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6);
	}

	public static void Timer_stop(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.elapsed_time;
		final double X10_TEMP5 = (System.currentTimeMillis());
		final doubleRefArray1 X10_TEMP3 = X10_TEMP0.start_time;
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP3.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP3";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP3, RX10_TEMP3);
		final double X10_TEMP6 = (RX10_TEMP11);
		final double X10_TEMP9 = (X10_TEMP5 - X10_TEMP6);
		final double X10_TEMP10 = (X10_TEMP9);
		final Point1 RX10_TEMP12 = new Point1(n);
		final Dist1 RX10_TEMP13 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14, RX10_TEMP12);
		final int RX10_TEMP16 = 0;
		final boolean RX10_TEMP17 = RX10_TEMP15<RX10_TEMP16;
		if (RX10_TEMP17) {
			String RX10_TEMP18 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP18);
		}
		final place RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13, RX10_TEMP15);
		final place RX10_TEMP21 = here;
		final boolean RX10_TEMP22 = RX10_TEMP19!=RX10_TEMP21;
		if (RX10_TEMP22) {
			String RX10_TEMP20 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP20);
		}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP15, X10_TEMP10);
		final doubleRefArray1 X10_TEMP11 = X10_TEMP0.elapsed_time;
		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;
		final Point1 RX10_TEMP23 = new Point1(n);
		final Dist1 RX10_TEMP24 = X10_TEMP13.distValue;
		final Region1 RX10_TEMP25 = RX10_TEMP24.dReg;
		final int RX10_TEMP26 = Program.searchPointInRegion1(RX10_TEMP25, RX10_TEMP23);
		final int RX10_TEMP27 = 0;
		final boolean RX10_TEMP28 = RX10_TEMP26<RX10_TEMP27;
		if (RX10_TEMP28) {
			String RX10_TEMP29 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP29);
		}
		final place RX10_TEMP30 = Program.getPlaceFromDist1(RX10_TEMP24, RX10_TEMP26);
		final place RX10_TEMP32 = here;
		final boolean RX10_TEMP33 = RX10_TEMP30!=RX10_TEMP32;
		if (RX10_TEMP33) {
			String RX10_TEMP31 = "Bad place access for array X10_TEMP13";
			throw new RuntimeException(RX10_TEMP31);
		}
		final double RX10_TEMP34 = Program.getRefArrayValue1double(X10_TEMP13, RX10_TEMP26);
		final double X10_TEMP15 = (RX10_TEMP34);
		final int X10_TEMP16 = (1000);
		final double X10_TEMP19 = (X10_TEMP15 / X10_TEMP16);
		final double X10_TEMP20 = (X10_TEMP19);
		final Point1 RX10_TEMP35 = new Point1(n);
		final Dist1 RX10_TEMP36 = X10_TEMP11.distValue;
		final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;
		final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37, RX10_TEMP35);
		final int RX10_TEMP39 = 0;
		final boolean RX10_TEMP40 = RX10_TEMP38<RX10_TEMP39;
		if (RX10_TEMP40) {
			String RX10_TEMP41 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP41);
		}
		final place RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36, RX10_TEMP38);
		final place RX10_TEMP44 = here;
		final boolean RX10_TEMP45 = RX10_TEMP42!=RX10_TEMP44;
		if (RX10_TEMP45) {
			String RX10_TEMP43 = "Bad place access for array X10_TEMP11";
			throw new RuntimeException(RX10_TEMP43);
		}
		Program.setRefArrayValue1double(X10_TEMP11, RX10_TEMP38, X10_TEMP20);
		final doubleRefArray1 X10_TEMP21 = X10_TEMP0.total_time;
		final doubleRefArray1 X10_TEMP23 = X10_TEMP0.total_time;
		final Point1 RX10_TEMP46 = new Point1(n);
		final Dist1 RX10_TEMP47 = X10_TEMP23.distValue;
		final Region1 RX10_TEMP48 = RX10_TEMP47.dReg;
		final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48, RX10_TEMP46);
		final int RX10_TEMP50 = 0;
		final boolean RX10_TEMP51 = RX10_TEMP49<RX10_TEMP50;
		if (RX10_TEMP51) {
			String RX10_TEMP52 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP52);
		}
		final place RX10_TEMP53 = Program.getPlaceFromDist1(RX10_TEMP47, RX10_TEMP49);
		final place RX10_TEMP55 = here;
		final boolean RX10_TEMP56 = RX10_TEMP53!=RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP54 = "Bad place access for array X10_TEMP23";
			throw new RuntimeException(RX10_TEMP54);
		}
		final double RX10_TEMP57 = Program.getRefArrayValue1double(X10_TEMP23, RX10_TEMP49);
		final double X10_TEMP27 = (RX10_TEMP57);
		final doubleRefArray1 X10_TEMP25 = X10_TEMP0.elapsed_time;
		final Point1 RX10_TEMP58 = new Point1(n);
		final Dist1 RX10_TEMP59 = X10_TEMP25.distValue;
		final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;
		final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60, RX10_TEMP58);
		final int RX10_TEMP62 = 0;
		final boolean RX10_TEMP63 = RX10_TEMP61<RX10_TEMP62;
		if (RX10_TEMP63) {
			String RX10_TEMP64 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP64);
		}
		final place RX10_TEMP65 = Program.getPlaceFromDist1(RX10_TEMP59, RX10_TEMP61);
		final place RX10_TEMP67 = here;
		final boolean RX10_TEMP68 = RX10_TEMP65!=RX10_TEMP67;
		if (RX10_TEMP68) {
			String RX10_TEMP66 = "Bad place access for array X10_TEMP25";
			throw new RuntimeException(RX10_TEMP66);
		}
		final double RX10_TEMP69 = Program.getRefArrayValue1double(X10_TEMP25, RX10_TEMP61);
		final double X10_TEMP28 = (RX10_TEMP69);
		final double X10_TEMP31 = (X10_TEMP27 + X10_TEMP28);
		final double X10_TEMP32 = (X10_TEMP31);
		final Point1 RX10_TEMP70 = new Point1(n);
		final Dist1 RX10_TEMP71 = X10_TEMP21.distValue;
		final Region1 RX10_TEMP72 = RX10_TEMP71.dReg;
		final int RX10_TEMP73 = Program.searchPointInRegion1(RX10_TEMP72, RX10_TEMP70);
		final int RX10_TEMP74 = 0;
		final boolean RX10_TEMP75 = RX10_TEMP73<RX10_TEMP74;
		if (RX10_TEMP75) {
			String RX10_TEMP76 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP76);
		}
		final place RX10_TEMP77 = Program.getPlaceFromDist1(RX10_TEMP71, RX10_TEMP73);
		final place RX10_TEMP79 = here;
		final boolean RX10_TEMP80 = RX10_TEMP77!=RX10_TEMP79;
		if (RX10_TEMP80) {
			String RX10_TEMP78 = "Bad place access for array X10_TEMP21";
			throw new RuntimeException(RX10_TEMP78);
		}
		Program.setRefArrayValue1double(X10_TEMP21, RX10_TEMP73, X10_TEMP32);
	}

	public static double Timer_readTimer(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP1, RX10_TEMP3);
		final double X10_TEMP4 = (RX10_TEMP11);
		return X10_TEMP4;
	}

	public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;
		final double X10_TEMP5 = (0);
		final double X10_TEMP6 = (X10_TEMP5);
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2, RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final place RX10_TEMP9 = here;
		final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6);
		final doubleRefArray1 X10_TEMP7 = X10_TEMP0.start_time;
		final double X10_TEMP11 = (0);
		final double X10_TEMP12 = (X10_TEMP11);
		final Point1 RX10_TEMP11 = new Point1(n);
		final Dist1 RX10_TEMP12 = X10_TEMP7.distValue;
		final Region1 RX10_TEMP13 = RX10_TEMP12.dReg;
		final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13, RX10_TEMP11);
		final int RX10_TEMP15 = 0;
		final boolean RX10_TEMP16 = RX10_TEMP14<RX10_TEMP15;
		if (RX10_TEMP16) {
			String RX10_TEMP17 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP17);
		}
		final place RX10_TEMP18 = Program.getPlaceFromDist1(RX10_TEMP12, RX10_TEMP14);
		final place RX10_TEMP20 = here;
		final boolean RX10_TEMP21 = RX10_TEMP18!=RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP19 = "Bad place access for array X10_TEMP7";
			throw new RuntimeException(RX10_TEMP19);
		}
		Program.setRefArrayValue1double(X10_TEMP7, RX10_TEMP14, X10_TEMP12);
		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;
		final double X10_TEMP17 = (0);
		final double X10_TEMP18 = (X10_TEMP17);
		final Point1 RX10_TEMP22 = new Point1(n);
		final Dist1 RX10_TEMP23 = X10_TEMP13.distValue;
		final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;
		final int RX10_TEMP25 = Program.searchPointInRegion1(RX10_TEMP24, RX10_TEMP22);
		final int RX10_TEMP26 = 0;
		final boolean RX10_TEMP27 = RX10_TEMP25<RX10_TEMP26;
		if (RX10_TEMP27) {
			String RX10_TEMP28 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP28);
		}
		final place RX10_TEMP29 = Program.getPlaceFromDist1(RX10_TEMP23, RX10_TEMP25);
		final place RX10_TEMP31 = here;
		final boolean RX10_TEMP32 = RX10_TEMP29!=RX10_TEMP31;
		if (RX10_TEMP32) {
			String RX10_TEMP30 = "Bad place access for array X10_TEMP13";
			throw new RuntimeException(RX10_TEMP30);
		}
		Program.setRefArrayValue1double(X10_TEMP13, RX10_TEMP25, X10_TEMP18);
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

	public static void setRefArrayValue2double(final doubleRefArray2 array, final int index, final double val) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist2 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub value[:rank==1] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		localArray[localIndex] = (val);
	}

	public static int constantSearchRegion2(final Region2 r, final Point2 target) {
		final int zero = 0;
		final int one = 1;
		
		final int dim0 = r.dim0;
		final int low0 = r.low0;
		final int high0 = low0 + dim0;
		int pt0 = target.f0;
		final boolean lbound0 = pt0 < low0;
		final boolean hbound0 = pt0 >= high0;
		
		final int dim1 = r.dim1;
		final int low1 = r.low1;
		final int high1 = low1 + dim1;
		int pt1 = target.f1;
		final boolean lbound1 = pt1 < low1;
		final boolean hbound1 = pt1 >= high1;
		
		final int dim2 = 1;
		
		boolean outRegion = false;
		outRegion = outRegion || lbound0;
		outRegion = outRegion || hbound0;
		outRegion = outRegion || lbound1;
		outRegion = outRegion || hbound1;
		if(outRegion) {
			int notFound = 0;
			notFound = notFound - one;
			return notFound;
		}
		
		final int stride2 = 1;
		final int stride1 = stride2 * dim2;
		final int stride0 = stride1 * dim1;
		
		pt0 = pt0 - low0;
		final int offset0 = stride0 * pt0;
		pt1 = pt1 - low1;
		final int offset1 = stride1 * pt1;
		
		int found = 0;
		found = found + offset0;
		found = found + offset1;
		return found;
	}

	public static int binarySearchRegion2(final Region2 r, final Point2 target) {
		final Point2 value[:rank==1] pointArray = (Point2 value[:rank==1])(r.pointArray);
		int start = 0;
		int end = r.regSize;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		end = end - one;
		int result = zero - one;
		boolean notDone = start <= end;
		while (notDone)	{
			int mid = start + end;
			mid = mid/two;
			final Point2 temp = pointArray[mid];
			final int pointCompare = Program.comparePoint2(target, temp);
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

	public static int binarySearchRegion1(final Region1 r, final Point1 target) {
		final Point1 value[:rank==1] pointArray = (Point1 value[:rank==1])(r.pointArray);
		int start = 0;
		int end = r.regSize;
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

	public static void setRefArrayValue1double(final doubleRefArray1 array, final int index, final double val) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub value[:rank==1] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		localArray[localIndex] = (val);
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
		final Dist pointDist1 = new Dist(vPlaceArray, maxPlaces);
		final Dist1 retDist = new Dist1(reg, pointDist1);
		return retDist;
	}

	public static place getPlaceFromDist1(final Dist1 dn, final int index) {
		final Dist d = dn.dDist;
		final place value[:rank==1] placeArray = d.placeArray;
		final place retPlace = placeArray[index];
		return retPlace;
	}

	public static place getPlaceFromDist2(final Dist2 dn, final int index) {
		final Dist d = dn.dDist;
		final place value[:rank==1] placeArray = d.placeArray;
		final place retPlace = placeArray[index];
		return retPlace;
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

	/**
	  * This method compares two points of the same rank with each other.
	  * @return 0 if pt1 = pt2, 1 if pt1<pt2, 2 if pt1>pt2
	  */
	public static int comparePoint2(final Point2 pt1, final Point2 pt2) {
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
		// Comparing the 1th coordinate
		point1 = pt1.f1;
		point2 = pt2.f1;
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

	public static Point2 regionOrdinalPoint2(final Region2 reg, final int ordl) {
		final Point2 value[:rank==1] pointArray = reg .pointArray;
		final Point2 pt = pointArray[ordl];
		return pt;
	}

	public static Point1 regionOrdinalPoint1(final Region1 reg, final int ordl) {
		final Point1 value[:rank==1] pointArray = reg .pointArray;
		final Point1 pt = pointArray[ordl];
		return pt;
	}

	public static double getRefArrayValue1double(final doubleRefArray1 array, final int index) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub value[:rank==1] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static Dist2 getBlockDist2(final Region2 r) {
		final int rSize = r.regSize;
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
		Program.getCyclic(placeArray, arraySize, initPlace, blockSize);
		int remainingPlaces = N - q;
		final boolean cond = remainingPlaces == zero;
		if(cond) {
			final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place value[dReg](point(:rank==1) pt){final place tempPl = placeArray[pt]; return tempPl;});
			final Dist pointDist1 = new Dist(vPlaceArray, rSize);
			final Dist2 retDist = new Dist2(r, pointDist1);
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
		for(point(:rank==1) pt : pointReg0) {
			final point(:rank==1) tempPt = pt + [index];
			placeArray[tempPt] = (initPlace);
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
				for(point(:rank==1) pt : pointReg1) {
					final point(:rank==1) tempPt = pt + [index];
					placeArray[tempPt] = (pl);
				}
				arraySize = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				final int ub = chunk - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				for(point(:rank==1) pt : pointReg1) {
					final point(:rank==1) tempPt = pt + [index];
					placeArray[tempPt] = (pl);
				}
				index = index + chunk;
				arraySize = arraySize - chunk;
			}
			pl = pl.next();
			whileCond = arraySize != zero;
		}
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place value[dReg](point(:rank==1) pt){final place tempPl = placeArray[pt]; return tempPl;});
		final Dist pointDist1 = new Dist(vPlaceArray, rSize);
		final Dist2 retDist = new Dist2(r, pointDist1);
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
		for(point(:rank==1) p : pointReg) {
			placeArray[p] = (initPlace);
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
				for(point(:rank==1) p : pointReg1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = (pl);
				}
				N = 0;
			}
			else {
				dSize = index + chunk;
				dSize = dSize - one;
				final int ub = chunk - one;
				final region(:rank==1) pointReg1 = [0 : ub];
				for(point(:rank==1) p : pointReg1) {
					final point(:rank==1) tempPt = p + [index];
					placeArray[tempPt] = (pl);
				}
				index = index + chunk;
				N = N - chunk;
			}
			pl = pl.next();
			whileCond = N != zero;
		}
	}

	public static int getDistLocalCount2(final Dist2 dn, final int placeIndex) {
		final Dist d = dn.dDist;
		final int value[:rank==1] counts = d.counts;
		final int localCount = counts[placeIndex];
		return localCount;
	}

	public static int getDistLocalCount1(final Dist1 dn, final int placeIndex) {
		final Dist d = dn.dDist;
		final int value[:rank==1] counts = d.counts;
		final int localCount = counts[placeIndex];
		return localCount;
	}

	public static int searchPointInRegion2(final Region2 r, final Point2 target) {
		final boolean regType = r.regType;
		if(regType) {
			final int constantSearch = Program.constantSearchRegion2(r, target);
			return constantSearch;
		}
		final int binarySearch = Program.binarySearchRegion2(r, target);
		return binarySearch;
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

	public static double getRefArrayValue2double(final doubleRefArray2 array, final int index) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist2 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub value[:rank==1] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[:rank==1] localArray = indexStub.localArray;
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static Dist2 getPlaceDist2(final Region2 r, final place p) {
		final int rSize = r.regSize;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final region(:rank==1) dReg = [0 : rSizeMinusOne];
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place value[dReg](point(:rank==1) pt){return p;});
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist2 retDist = new Dist2(r, pointDist);
		return retDist;
	}

	public static Dist1 getPlaceDist1(final Region1 r, final place p) {
		final int rSize = r.regSize;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final region(:rank==1) dReg = [0 : rSizeMinusOne];
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place value[dReg](point(:rank==1) pt){return p;});
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
	}

	public static Dist2 restrictDist2(final Dist2 d, final place p) {
		final int zero = 0;
		final int one = 1;
		final place h = here;
		final Region2 dReg = d.dReg;
		final Dist dDist = d.dDist;
		final int dim = dReg.regSize;
		final int dimMinusOne = dim - one;
		final region(:rank==1) dRegReg = [0 : dimMinusOne];
		final Point2 value[:rank==1] dArray = (Point2 value[:rank==1])(dReg.pointArray);
		final place value[:rank==1] dPlace = (place value[:rank==1])(dDist.placeArray);
		final int value[:rank==1] dCounts = (int value[:rank==1])(dDist.counts);
		final int index = p.id;
		int numPoints = dCounts[index];
		final int rSizeNumPoints = numPoints;
		final int rSize = numPoints - one;
		final region(:rank==1) tempReg = [0 : rSize];
		final dist(:rank==1) tempDist = [0 : rSize]->here;
		final place value[:rank==1] rPlace = (place value[:rank==1])(new place value[tempReg](point(:rank==1) pt){return p;});
		final int[:rank==1] tempArray = (int[:rank==1]) (new int[tempDist]);
		final boolean cond1 = numPoints > zero;
		if(cond1) {
			numPoints = 0;
			for(point(:rank==1) pt : dRegReg) {
				final place dP = dPlace[pt];
				final boolean cond2 = p==dP;
				if(cond2) {
					final int i = pt[0];
					tempArray[numPoints] = (i);
					numPoints = numPoints + one;
				}
			}
		}
		final Point2 value[:rank==1] pointArray = (Point2 value[:rank==1]) (new Point2 value[tempReg] (point(:rank==1) pt) {
			final int idx = tempArray[pt];
			final Point2 dpt = dArray[idx];
			return dpt;
		});
		final Region2 dpReg = new Region2(pointArray);
		final Dist dpDist = new Dist(rPlace, rSizeNumPoints);
		final Dist2 dpDistn = new Dist2(dpReg, dpDist);
		return dpDistn;
	}

	public static int value[:rank==1] initDist(final int [:rank==1] tempArr, final region(:rank==1) tempReg) {
		final int value[:rank==1] vTemp = (int value[:rank==1]) (new int value[tempReg](point(:rank==1) p) {
			final int tempInt = tempArr[p];
			return tempInt;
		});
		return vTemp;
	}

	public static Region2 createNewRegion2RR(final int v1_0, final int v1_1, final int v2_0, final int v2_1) {
		final int zero = 0;
		final int one = 1;
		
		boolean regType = true;
		final boolean tempBool1 = true;
		final boolean tempBool2 = true;
		regType = regType && tempBool1;
		regType = regType && tempBool2;
		
		
		final int l1 = v1_1 - v1_0;
		final int dim1 = l1 + one;
		
		final int l2 = v2_1 - v2_0;
		final int dim2 = l2 + one;
		
		final int stride2 = 1;
		final int stride1 = stride2 * dim2;
		final int stride0 = stride1 * dim1;
		
		final int rSize = stride0 - one;
		final region(:rank==1) regArr = [0 : rSize];
		
		final Point2 value[:rank==1] ptArray = (Point2 value[:rank==1])(new Point2 value[regArr] (point(:rank==1) pt) {
			final int p = pt[0];
			int f1 = p / stride1;
			f1 = f1 % dim1;
			f1 = f1 + v1_0;
			
			int f2 = p / stride2;
			f2 = f2 % dim2;
			f2 = f2 + v2_0;
			
			final Point2 retPoint = new Point2(f1, f2);
			return retPoint;
		});
		if(regType) {
			final Region2 retRegRegular = new Region2(ptArray, v1_0, dim1, v2_0, dim2);
			return retRegRegular;
		}
		final Region2 retReg = new Region2(ptArray);
		return retReg;
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
		
		final Point1 value[:rank==1] ptArray = (Point1 value[:rank==1])(new Point1 value[regArr] (point(:rank==1) pt) {
			final int p = pt[0];
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
class Series {
	public int setsize;
	public int array_rows;
	public doubleRefArray2 testArray;


	public Series() {
	}



}
class Timer {
	public doubleRefArray1 start_time;
	public doubleRefArray1 elapsed_time;
	public doubleRefArray1 total_time;


	public Timer() {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (Program._Timer_max_counters);
		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		final place X10_TEMP6 = (place.FIRST_PLACE);
		final Dist1 d = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6);
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = place.MAX_PLACES;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
		final dist(:rank==1) RX10_TEMP5 = [0 : RX10_TEMP3] -> here;
		final doubleStub [:rank==1] RX10_TEMP6 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP5]);
		finish {
			for(point(:rank==1)RX10_TEMP7:RX10_TEMP4) {
				final place RX10_TEMP8 = here;
				final int RX10_TEMP9 = RX10_TEMP7[0];
				final place RX10_TEMP10 = place.places(RX10_TEMP9);
				final int RX10_TEMP11 = Program.getDistLocalCount1(d, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP14= [0 : RX10_TEMP12] -> here;
					final double [:rank==1] RX10_TEMP15 = (double [:rank==1])(new double [RX10_TEMP14](point(:rank==1)RX10_TEMP13) {
						final double X10_TEMP9 = (0);
						return X10_TEMP9;
					}
					);
					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15);
					async(RX10_TEMP8) {
						RX10_TEMP6[RX10_TEMP7] = (RX10_TEMP16);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP17 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP4](point(:rank==1)RX10_TEMP19){
			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			return RX10_TEMP18;
		});
		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(d, RX10_TEMP17);
		final doubleRefArray1 X10_TEMP11 = RX10_TEMP20;
		start_time = X10_TEMP11;
		final Region1 RX10_TEMP21 = d.dReg;
		final int RX10_TEMP22 = 0;
		final int RX10_TEMP23 = 1;
		int RX10_TEMP24 = place.MAX_PLACES;
		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23;
		final region(:rank==1) RX10_TEMP25 = [0 : RX10_TEMP24];
		final dist(:rank==1) RX10_TEMP26 = [0 : RX10_TEMP24] -> here;
		final doubleStub [:rank==1] RX10_TEMP27 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP26]);
		finish {
			for(point(:rank==1)RX10_TEMP28:RX10_TEMP25) {
				final place RX10_TEMP29 = here;
				final int RX10_TEMP30 = RX10_TEMP28[0];
				final place RX10_TEMP31 = place.places(RX10_TEMP30);
				final int RX10_TEMP32 = Program.getDistLocalCount1(d, RX10_TEMP30);
				final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23;
				async(RX10_TEMP31) {
					final dist(:rank==1) RX10_TEMP35= [0 : RX10_TEMP33] -> here;
					final double [:rank==1] RX10_TEMP36 = (double [:rank==1])(new double [RX10_TEMP35](point(:rank==1)RX10_TEMP34) {
						final double X10_TEMP13 = (0);
						return X10_TEMP13;
					}
					);
					final doubleStub RX10_TEMP37 = new doubleStub(RX10_TEMP36);
					async(RX10_TEMP29) {
						RX10_TEMP27[RX10_TEMP28] = (RX10_TEMP37);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP38 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP25](point(:rank==1)RX10_TEMP40){
			final doubleStub RX10_TEMP39 = RX10_TEMP27[RX10_TEMP40];
			return RX10_TEMP39;
		});
		final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1(d, RX10_TEMP38);
		final doubleRefArray1 X10_TEMP15 = RX10_TEMP41;
		elapsed_time = X10_TEMP15;
		final Region1 RX10_TEMP42 = d.dReg;
		final int RX10_TEMP43 = 0;
		final int RX10_TEMP44 = 1;
		int RX10_TEMP45 = place.MAX_PLACES;
		RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44;
		final region(:rank==1) RX10_TEMP46 = [0 : RX10_TEMP45];
		final dist(:rank==1) RX10_TEMP47 = [0 : RX10_TEMP45] -> here;
		final doubleStub [:rank==1] RX10_TEMP48 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP47]);
		finish {
			for(point(:rank==1)RX10_TEMP49:RX10_TEMP46) {
				final place RX10_TEMP50 = here;
				final int RX10_TEMP51 = RX10_TEMP49[0];
				final place RX10_TEMP52 = place.places(RX10_TEMP51);
				final int RX10_TEMP53 = Program.getDistLocalCount1(d, RX10_TEMP51);
				final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44;
				async(RX10_TEMP52) {
					final dist(:rank==1) RX10_TEMP56= [0 : RX10_TEMP54] -> here;
					final double [:rank==1] RX10_TEMP57 = (double [:rank==1])(new double [RX10_TEMP56](point(:rank==1)RX10_TEMP55) {
						final double X10_TEMP17 = (0);
						return X10_TEMP17;
					}
					);
					final doubleStub RX10_TEMP58 = new doubleStub(RX10_TEMP57);
					async(RX10_TEMP50) {
						RX10_TEMP48[RX10_TEMP49] = (RX10_TEMP58);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP59 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP46](point(:rank==1)RX10_TEMP61){
			final doubleStub RX10_TEMP60 = RX10_TEMP48[RX10_TEMP61];
			return RX10_TEMP60;
		});
		final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1(d, RX10_TEMP59);
		final doubleRefArray1 X10_TEMP19 = RX10_TEMP62;
		total_time = X10_TEMP19;
	}



}
value Point2 {
	public final int f0;
	public final int f1;


	public Point2(final int f0_, final int f1_) {
		f0 = f0_;
		f1 = f1_;
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
		final region(:rank==1) arrayReg = [0 : rSize];
		final dist(:rank==1) runSumDist = [0 : rSize] -> here;
		final int [:rank==1] tempCounts = (int [:rank==1]) (new int[countDist]);
		final int [:rank==1] tempRunSum = (int [:rank==1]) (new int[runSumDist]);

		for(point(:rank==1) p : countReg) {
			tempCounts[p] = (zero);
		}

		for(point(:rank==1) p : arrayReg) {
			final place pl = vPlaceArray[p];
			final int index = pl.id;
			final int oldVal = tempCounts[index];
			tempRunSum[p] = (oldVal);
			final int oldValPlusOne = oldVal + one;
			tempCounts[index] = (oldValPlusOne);
		}

		placeArray = vPlaceArray;
		counts = Program.initDist(tempCounts, countReg);
		runningSum = Program.initDist(tempRunSum, arrayReg);
		}


}
value Point1 {
	public final int f0;


	public Point1(final int f0_) {
		f0 = f0_;
	}


}
value doubleStub {
	public final double[:rank==1] localArray;


	public doubleStub (final double[:rank==1] localArray_) {
		localArray = localArray_;
	}


}
value Dist1 {
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1(final Region1 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}


}
value Region1 {
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1 value[:rank==1] pointArray;


	public Region1(final Point1 value[:rank==1] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 1;
		regSize = pointArray_.region.size();
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
	}
	public Region1(final Point1 value[:rank==1] pointArray_, final int low0_, final int dim0_) {
		regRank = 1;
		regSize = pointArray_.region.size();
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
	}


}
value doubleRefArray2 {
	public final Dist2 distValue;
	public final doubleStub value[:rank==1] contents;


	public doubleRefArray2 (final Dist2 distValue_, final doubleStub value[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value doubleRefArray1 {
	public final Dist1 distValue;
	public final doubleStub value[:rank==1] contents;


	public doubleRefArray1 (final Dist1 distValue_, final doubleStub value[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value Region2 {
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final Point2 value[:rank==1] pointArray;


	public Region2(final Point2 value[:rank==1] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 2;
		regSize = pointArray_.region.size();
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
		low1 = minusOne;
		dim1 = zero;
	}
	public Region2(final Point2 value[:rank==1] pointArray_, final int low0_, final int dim0_, final int low1_, final int dim1_) {
		regRank = 2;
		regSize = pointArray_.region.size();
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
		low1 = low1_;
		dim1 = dim1_;
	}


}
value Dist2 {
	public final Region2 dReg;
	public final Dist dDist;


	public Dist2(final Region2 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}


}
