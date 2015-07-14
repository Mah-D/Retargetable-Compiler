public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}
class Program {
	public static final Region1 _Linpack_r = Program._Linpack_r_init();
	public static final int _Timer_max_counters = Program._Timer_max_counters_init();


	public static void runMain() {
		Timer tmr = (new Timer());
		int count = (0);
		Program.Timer_start(tmr, count);
		final Linpack X10_TEMP4 = (new Linpack());
		Program.Linpack_run(X10_TEMP4);
		Program.Timer_stop(tmr, count);
		final String X10_TEMP7 = ("Wall-clock time for linpack: ");
		final double X10_TEMP8 = (Program.Timer_readTimer(tmr, count));
		final String X10_TEMP9 = (X10_TEMP7 + X10_TEMP8);
		final String X10_TEMP10 = (" secs");
		final String X10_TEMP12 = (X10_TEMP9 + X10_TEMP10);
		System.out.println(X10_TEMP12);
	}

	public static Region1 _Linpack_r_init() {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (2);
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3, X10_TEMP4);
		return X10_TEMP6;
	}

	public static void Linpack_initdataSizesArray(final Linpack X10_TEMP0, final intRefArray1 datasizes) {
		final int X10_TEMP2 = (0);
		final int X10_TEMP5 = (150);
		final int X10_TEMP6 = (X10_TEMP5);
		final Point1 RX10_TEMP0 = new Point1(X10_TEMP2);
		final Dist1 RX10_TEMP1 = datasizes.distValue;
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
			String RX10_TEMP8 = "Bad place access for array datasizes";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue1int(datasizes, RX10_TEMP3, X10_TEMP6);
		final int X10_TEMP8 = (1);
		final int X10_TEMP11 = (1000);
		final int X10_TEMP12 = (X10_TEMP11);
		final Point1 RX10_TEMP11 = new Point1(X10_TEMP8);
		final Dist1 RX10_TEMP12 = datasizes.distValue;
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
			String RX10_TEMP19 = "Bad place access for array datasizes";
			throw new RuntimeException(RX10_TEMP19);
		}
		Program.setRefArrayValue1int(datasizes, RX10_TEMP14, X10_TEMP12);
		final int X10_TEMP14 = (2);
		final int X10_TEMP17 = (2000);
		final int X10_TEMP18 = (X10_TEMP17);
		final Point1 RX10_TEMP22 = new Point1(X10_TEMP14);
		final Dist1 RX10_TEMP23 = datasizes.distValue;
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
			String RX10_TEMP30 = "Bad place access for array datasizes";
			throw new RuntimeException(RX10_TEMP30);
		}
		Program.setRefArrayValue1int(datasizes, RX10_TEMP25, X10_TEMP18);
	}

	public static void Linpack_JGFsetsize(final Linpack X10_TEMP0, final int setSize) {
		final int X10_TEMP3 = (setSize);
		X10_TEMP0.setSize = (X10_TEMP3);
	}

	public static void Linpack_JGFinitialise(final Linpack X10_TEMP0, final Dist1 vd) {
		final Region1 RX10_TEMP0 = vd.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = place.MAX_PLACES;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
		final dist(:rank==1) RX10_TEMP5 = [0 : RX10_TEMP3] -> here;
		final intStub [:rank==1] RX10_TEMP6 = (intStub [:rank==1])(new intStub[RX10_TEMP5]);
		finish {
			for(point(:rank==1)RX10_TEMP7:RX10_TEMP4) {
				final place RX10_TEMP8 = here;
				final int RX10_TEMP9 = RX10_TEMP7[0];
				final place RX10_TEMP10 = place.places(RX10_TEMP9);
				final int RX10_TEMP11 = Program.getDistLocalCount1(vd, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP14= [0 : RX10_TEMP12] -> here;
					final int [:rank==1] RX10_TEMP15 = (int [:rank==1])(new int [RX10_TEMP14](point(:rank==1)RX10_TEMP13) {
						final int X10_TEMP2 = (0);
						return X10_TEMP2;
					}
					);
					final intStub RX10_TEMP16 = new intStub(RX10_TEMP15);
					async(RX10_TEMP8) {
						RX10_TEMP6[RX10_TEMP7] = (RX10_TEMP16);
					}
				}
			}
		}
		final intStub value[:rank==1] RX10_TEMP17 = (intStub value[:rank==1])(new intStub value[RX10_TEMP4](point(:rank==1)RX10_TEMP19){
			final intStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			return RX10_TEMP18;
		});
		final intRefArray1 RX10_TEMP20 = new intRefArray1(vd, RX10_TEMP17);
		final intRefArray1 datasizes = RX10_TEMP20;
		Program.Linpack_initdataSizesArray(X10_TEMP0, datasizes);
		final int X10_TEMP6 = (X10_TEMP0.setSize);
		final Point1 RX10_TEMP21 = new Point1(X10_TEMP6);
		final Dist1 RX10_TEMP22 = datasizes.distValue;
		final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;
		final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, RX10_TEMP21);
		final int RX10_TEMP25 = 0;
		final boolean RX10_TEMP26 = RX10_TEMP24<RX10_TEMP25;
		if (RX10_TEMP26) {
			String RX10_TEMP27 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP27);
		}
		final place RX10_TEMP28 = Program.getPlaceFromDist1(RX10_TEMP22, RX10_TEMP24);
		final place RX10_TEMP30 = here;
		final boolean RX10_TEMP31 = RX10_TEMP28!=RX10_TEMP30;
		if (RX10_TEMP31) {
			String RX10_TEMP29 = "Bad place access for array datasizes";
			throw new RuntimeException(RX10_TEMP29);
		}
		final int RX10_TEMP32 = Program.getRefArrayValue1int(datasizes, RX10_TEMP24);
		final int X10_TEMP9 = (RX10_TEMP32);
		final int X10_TEMP10 = (X10_TEMP9);
		X10_TEMP0.n = (X10_TEMP10);
		final String X10_TEMP11 = ("ATTENTION: Running with smaller size (");
		final int X10_TEMP12 = (X10_TEMP0.n);
		final String X10_TEMP13 = (X10_TEMP11 + X10_TEMP12);
		final String X10_TEMP14 = (" instead of 500)");
		final String X10_TEMP16 = (X10_TEMP13 + X10_TEMP14);
		System.out.println(X10_TEMP16);
		final int X10_TEMP19 = (X10_TEMP0.n);
		final int X10_TEMP20 = (X10_TEMP19);
		X10_TEMP0.ldaa = (X10_TEMP20);
		final int X10_TEMP21 = (X10_TEMP0.ldaa);
		final int X10_TEMP22 = (1);
		final int X10_TEMP25 = (X10_TEMP21 + X10_TEMP22);
		final int X10_TEMP26 = (X10_TEMP25);
		X10_TEMP0.lda = (X10_TEMP26);
		final int X10_TEMP29 = (0);
		final int X10_TEMP30 = (X10_TEMP0.ldaa);
		Region1 vectorRegion = Program.createNewRegion1R(X10_TEMP29, X10_TEMP30);
		final int X10_TEMP36 = (0);
		final int X10_TEMP33 = (X10_TEMP0.ldaa);
		final int X10_TEMP34 = (1);
		final int X10_TEMP37 = (X10_TEMP33 - X10_TEMP34);
		Region1 vectorRegionMinus1 = Program.createNewRegion1R(X10_TEMP36, X10_TEMP37);
		final place X10_TEMP39 = (here);
		Dist1 vectorRegionMinus1Dist = Program.getPlaceDist1(vectorRegionMinus1, X10_TEMP39);
		final int X10_TEMP43 = (0);
		final int X10_TEMP44 = (X10_TEMP0.ldaa);
		final int X10_TEMP47 = (0);
		final int X10_TEMP48 = (X10_TEMP0.lda);
		Region2 rectangularRegion = Program.createNewRegion2RR(X10_TEMP43, X10_TEMP44, X10_TEMP47, X10_TEMP48);
		final int X10_TEMP52 = (0);
		final int X10_TEMP53 = (0);
		final int X10_TEMP56 = (0);
		final int X10_TEMP57 = (X10_TEMP0.lda);
		Region2 slimRegion = Program.createNewRegion2RR(X10_TEMP52, X10_TEMP53, X10_TEMP56, X10_TEMP57);
		final place X10_TEMP59 = (here);
		Dist2 slimRegionDist = Program.getPlaceDist2(slimRegion, X10_TEMP59);
		final int X10_TEMP62 = (X10_TEMP0.lda);
		final int X10_TEMP63 = (1);
		final int X10_TEMP65 = (X10_TEMP62 + X10_TEMP63);
		final Dist2 X10_TEMP66 = Program.getBlockCyclicDist2(rectangularRegion, X10_TEMP65);
		Dist2 rectangular_distribution = X10_TEMP66;
		final Region2 RX10_TEMP33 = rectangular_distribution.dReg;
		final int RX10_TEMP34 = 0;
		final int RX10_TEMP35 = 1;
		int RX10_TEMP36 = place.MAX_PLACES;
		RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP35;
		final region(:rank==1) RX10_TEMP37 = [0 : RX10_TEMP36];
		final dist(:rank==1) RX10_TEMP38 = [0 : RX10_TEMP36] -> here;
		final doubleStub [:rank==1] RX10_TEMP39 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP38]);
		finish {
			for(point(:rank==1)RX10_TEMP40:RX10_TEMP37) {
				final place RX10_TEMP41 = here;
				final int RX10_TEMP42 = RX10_TEMP40[0];
				final place RX10_TEMP43 = place.places(RX10_TEMP42);
				final int RX10_TEMP44 = Program.getDistLocalCount2(rectangular_distribution, RX10_TEMP42);
				final int RX10_TEMP45 = RX10_TEMP44 - RX10_TEMP35;
				async(RX10_TEMP43) {
					final dist(:rank==1) RX10_TEMP46= [0 : RX10_TEMP45] -> here;
					final double [:rank==1] RX10_TEMP47 = (double [:rank==1])(new double [RX10_TEMP46]);
					final doubleStub RX10_TEMP48 = new doubleStub(RX10_TEMP47);
					async(RX10_TEMP41) {
						RX10_TEMP39[RX10_TEMP40] = (RX10_TEMP48);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP49 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP37](point(:rank==1)RX10_TEMP51){
			final doubleStub RX10_TEMP50 = RX10_TEMP39[RX10_TEMP51];
			return RX10_TEMP50;
		});
		final doubleRefArray2 RX10_TEMP52 = new doubleRefArray2(rectangular_distribution, RX10_TEMP49);
		final doubleRefArray2 X10_TEMP70 = RX10_TEMP52;
		final doubleRefArray2 X10_TEMP71 = X10_TEMP70;
		X10_TEMP0.a = (X10_TEMP71);
		final Region2 RX10_TEMP53 = slimRegionDist.dReg;
		final int RX10_TEMP54 = 0;
		final int RX10_TEMP55 = 1;
		int RX10_TEMP56 = place.MAX_PLACES;
		RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP55;
		final region(:rank==1) RX10_TEMP57 = [0 : RX10_TEMP56];
		final dist(:rank==1) RX10_TEMP58 = [0 : RX10_TEMP56] -> here;
		final doubleStub [:rank==1] RX10_TEMP59 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP58]);
		finish {
			for(point(:rank==1)RX10_TEMP60:RX10_TEMP57) {
				final place RX10_TEMP61 = here;
				final int RX10_TEMP62 = RX10_TEMP60[0];
				final place RX10_TEMP63 = place.places(RX10_TEMP62);
				final int RX10_TEMP64 = Program.getDistLocalCount2(slimRegionDist, RX10_TEMP62);
				final int RX10_TEMP65 = RX10_TEMP64 - RX10_TEMP55;
				async(RX10_TEMP63) {
					final dist(:rank==1) RX10_TEMP66= [0 : RX10_TEMP65] -> here;
					final double [:rank==1] RX10_TEMP67 = (double [:rank==1])(new double [RX10_TEMP66]);
					final doubleStub RX10_TEMP68 = new doubleStub(RX10_TEMP67);
					async(RX10_TEMP61) {
						RX10_TEMP59[RX10_TEMP60] = (RX10_TEMP68);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP69 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP57](point(:rank==1)RX10_TEMP71){
			final doubleStub RX10_TEMP70 = RX10_TEMP59[RX10_TEMP71];
			return RX10_TEMP70;
		});
		final doubleRefArray2 RX10_TEMP72 = new doubleRefArray2(slimRegionDist, RX10_TEMP69);
		final doubleRefArray2 X10_TEMP74 = RX10_TEMP72;
		final doubleRefArray2 X10_TEMP75 = X10_TEMP74;
		X10_TEMP0.b = (X10_TEMP75);
		final Region2 RX10_TEMP73 = slimRegionDist.dReg;
		final int RX10_TEMP74 = 0;
		final int RX10_TEMP75 = 1;
		int RX10_TEMP76 = place.MAX_PLACES;
		RX10_TEMP76 = RX10_TEMP76 - RX10_TEMP75;
		final region(:rank==1) RX10_TEMP77 = [0 : RX10_TEMP76];
		final dist(:rank==1) RX10_TEMP78 = [0 : RX10_TEMP76] -> here;
		final doubleStub [:rank==1] RX10_TEMP79 = (doubleStub [:rank==1])(new doubleStub[RX10_TEMP78]);
		finish {
			for(point(:rank==1)RX10_TEMP80:RX10_TEMP77) {
				final place RX10_TEMP81 = here;
				final int RX10_TEMP82 = RX10_TEMP80[0];
				final place RX10_TEMP83 = place.places(RX10_TEMP82);
				final int RX10_TEMP84 = Program.getDistLocalCount2(slimRegionDist, RX10_TEMP82);
				final int RX10_TEMP85 = RX10_TEMP84 - RX10_TEMP75;
				async(RX10_TEMP83) {
					final dist(:rank==1) RX10_TEMP86= [0 : RX10_TEMP85] -> here;
					final double [:rank==1] RX10_TEMP87 = (double [:rank==1])(new double [RX10_TEMP86]);
					final doubleStub RX10_TEMP88 = new doubleStub(RX10_TEMP87);
					async(RX10_TEMP81) {
						RX10_TEMP79[RX10_TEMP80] = (RX10_TEMP88);
					}
				}
			}
		}
		final doubleStub value[:rank==1] RX10_TEMP89 = (doubleStub value[:rank==1])(new doubleStub value[RX10_TEMP77](point(:rank==1)RX10_TEMP91){
			final doubleStub RX10_TEMP90 = RX10_TEMP79[RX10_TEMP91];
			return RX10_TEMP90;
		});
		final doubleRefArray2 RX10_TEMP92 = new doubleRefArray2(slimRegionDist, RX10_TEMP89);
		final doubleRefArray2 X10_TEMP78 = RX10_TEMP92;
		final doubleRefArray2 X10_TEMP79 = X10_TEMP78;
		X10_TEMP0.x = (X10_TEMP79);
		final Region1 RX10_TEMP93 = vectorRegionMinus1Dist.dReg;
		final int RX10_TEMP94 = 0;
		final int RX10_TEMP95 = 1;
		int RX10_TEMP96 = place.MAX_PLACES;
		RX10_TEMP96 = RX10_TEMP96 - RX10_TEMP95;
		final region(:rank==1) RX10_TEMP97 = [0 : RX10_TEMP96];
		final dist(:rank==1) RX10_TEMP98 = [0 : RX10_TEMP96] -> here;
		final intStub [:rank==1] RX10_TEMP99 = (intStub [:rank==1])(new intStub[RX10_TEMP98]);
		finish {
			for(point(:rank==1)RX10_TEMP100:RX10_TEMP97) {
				final place RX10_TEMP101 = here;
				final int RX10_TEMP102 = RX10_TEMP100[0];
				final place RX10_TEMP103 = place.places(RX10_TEMP102);
				final int RX10_TEMP104 = Program.getDistLocalCount1(vectorRegionMinus1Dist, RX10_TEMP102);
				final int RX10_TEMP105 = RX10_TEMP104 - RX10_TEMP95;
				async(RX10_TEMP103) {
					final dist(:rank==1) RX10_TEMP106= [0 : RX10_TEMP105] -> here;
					final int [:rank==1] RX10_TEMP107 = (int [:rank==1])(new int [RX10_TEMP106]);
					final intStub RX10_TEMP108 = new intStub(RX10_TEMP107);
					async(RX10_TEMP101) {
						RX10_TEMP99[RX10_TEMP100] = (RX10_TEMP108);
					}
				}
			}
		}
		final intStub value[:rank==1] RX10_TEMP109 = (intStub value[:rank==1])(new intStub value[RX10_TEMP97](point(:rank==1)RX10_TEMP111){
			final intStub RX10_TEMP110 = RX10_TEMP99[RX10_TEMP111];
			return RX10_TEMP110;
		});
		final intRefArray1 RX10_TEMP112 = new intRefArray1(vectorRegionMinus1Dist, RX10_TEMP109);
		final intRefArray1 X10_TEMP82 = RX10_TEMP112;
		final intRefArray1 X10_TEMP83 = X10_TEMP82;
		X10_TEMP0.ipvt = (X10_TEMP83);
		final int X10_TEMP84 = (X10_TEMP0.n);
		long nl = ((long)X10_TEMP84);
		final double X10_TEMP89 = (2.0);
		final long X10_TEMP86 = (nl * nl);
		final long X10_TEMP88 = (X10_TEMP86 * nl);
		final double X10_TEMP91 = (X10_TEMP89 * X10_TEMP88);
		final double X10_TEMP92 = (3.0);
		final double X10_TEMP96 = (X10_TEMP91 / X10_TEMP92);
		final double X10_TEMP95 = (2.0);
		final long X10_TEMP94 = (nl * nl);
		final double X10_TEMP97 = (X10_TEMP95 * X10_TEMP94);
		final double X10_TEMP100 = (X10_TEMP96 + X10_TEMP97);
		final double X10_TEMP101 = (X10_TEMP100);
		X10_TEMP0.ops = (X10_TEMP101);
		final doubleRefArray2 X10_TEMP106 = X10_TEMP0.a;
		final int X10_TEMP107 = (X10_TEMP0.lda);
		final int X10_TEMP108 = (X10_TEMP0.n);
		final doubleRefArray2 X10_TEMP109 = X10_TEMP0.b;
		final double X10_TEMP112 = (Program.Linpack_matgen(X10_TEMP0, X10_TEMP106, X10_TEMP107, X10_TEMP108, X10_TEMP109));
		final double X10_TEMP113 = (X10_TEMP112);
		X10_TEMP0.norma = (X10_TEMP113);
	}

	public static void Linpack_JGFkernel(final Linpack X10_TEMP0) {
		final doubleRefArray2 X10_TEMP5 = X10_TEMP0.a;
		final int X10_TEMP6 = (X10_TEMP0.lda);
		final int X10_TEMP7 = (X10_TEMP0.n);
		final intRefArray1 X10_TEMP8 = X10_TEMP0.ipvt;
		final int X10_TEMP11 = (Program.Linpack_dgefa(X10_TEMP0, X10_TEMP5, X10_TEMP6, X10_TEMP7, X10_TEMP8));
		final int X10_TEMP12 = (X10_TEMP11);
		X10_TEMP0.info = (X10_TEMP12);
		final doubleRefArray2 X10_TEMP19 = X10_TEMP0.a;
		final int X10_TEMP20 = (X10_TEMP0.lda);
		final int X10_TEMP21 = (X10_TEMP0.n);
		final intRefArray1 X10_TEMP22 = X10_TEMP0.ipvt;
		final doubleRefArray2 X10_TEMP23 = X10_TEMP0.b;
		final int X10_TEMP24 = (0);
		Program.Linpack_dgesl(X10_TEMP0, X10_TEMP19, X10_TEMP20, X10_TEMP21, X10_TEMP22, X10_TEMP23, X10_TEMP24);
	}

	public static void Linpack_JGFvalidate(final Linpack X10_TEMP0, final Dist1 vd) {
		double eps = (0.0);
		double residn = (0.0);
		final Region1 RX10_TEMP0 = vd.dReg;
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
				final int RX10_TEMP11 = Program.getDistLocalCount1(vd, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP14= [0 : RX10_TEMP12] -> here;
					final double [:rank==1] RX10_TEMP15 = (double [:rank==1])(new double [RX10_TEMP14](point(:rank==1)RX10_TEMP13) {
						final double X10_TEMP4 = (0.0);
						return X10_TEMP4;
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
		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(vd, RX10_TEMP17);
		final doubleRefArray1 ref = RX10_TEMP20;
		final int X10_TEMP7 = (0);
		final double X10_TEMP10 = (6.0);
		final double X10_TEMP11 = (X10_TEMP10);
		final Point1 RX10_TEMP21 = new Point1(X10_TEMP7);
		final Dist1 RX10_TEMP22 = ref.distValue;
		final Region1 RX10_TEMP23 = RX10_TEMP22.dReg;
		final int RX10_TEMP24 = Program.searchPointInRegion1(RX10_TEMP23, RX10_TEMP21);
		final int RX10_TEMP25 = 0;
		final boolean RX10_TEMP26 = RX10_TEMP24<RX10_TEMP25;
		if (RX10_TEMP26) {
			String RX10_TEMP27 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP27);
		}
		final place RX10_TEMP28 = Program.getPlaceFromDist1(RX10_TEMP22, RX10_TEMP24);
		final place RX10_TEMP30 = here;
		final boolean RX10_TEMP31 = RX10_TEMP28!=RX10_TEMP30;
		if (RX10_TEMP31) {
			String RX10_TEMP29 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP29);
		}
		Program.setRefArrayValue1double(ref, RX10_TEMP24, X10_TEMP11);
		final int X10_TEMP13 = (1);
		final double X10_TEMP16 = (12.0);
		final double X10_TEMP17 = (X10_TEMP16);
		final Point1 RX10_TEMP32 = new Point1(X10_TEMP13);
		final Dist1 RX10_TEMP33 = ref.distValue;
		final Region1 RX10_TEMP34 = RX10_TEMP33.dReg;
		final int RX10_TEMP35 = Program.searchPointInRegion1(RX10_TEMP34, RX10_TEMP32);
		final int RX10_TEMP36 = 0;
		final boolean RX10_TEMP37 = RX10_TEMP35<RX10_TEMP36;
		if (RX10_TEMP37) {
			String RX10_TEMP38 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP38);
		}
		final place RX10_TEMP39 = Program.getPlaceFromDist1(RX10_TEMP33, RX10_TEMP35);
		final place RX10_TEMP41 = here;
		final boolean RX10_TEMP42 = RX10_TEMP39!=RX10_TEMP41;
		if (RX10_TEMP42) {
			String RX10_TEMP40 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP40);
		}
		Program.setRefArrayValue1double(ref, RX10_TEMP35, X10_TEMP17);
		final int X10_TEMP19 = (2);
		final double X10_TEMP22 = (20.0);
		final double X10_TEMP23 = (X10_TEMP22);
		final Point1 RX10_TEMP43 = new Point1(X10_TEMP19);
		final Dist1 RX10_TEMP44 = ref.distValue;
		final Region1 RX10_TEMP45 = RX10_TEMP44.dReg;
		final int RX10_TEMP46 = Program.searchPointInRegion1(RX10_TEMP45, RX10_TEMP43);
		final int RX10_TEMP47 = 0;
		final boolean RX10_TEMP48 = RX10_TEMP46<RX10_TEMP47;
		if (RX10_TEMP48) {
			String RX10_TEMP49 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP49);
		}
		final place RX10_TEMP50 = Program.getPlaceFromDist1(RX10_TEMP44, RX10_TEMP46);
		final place RX10_TEMP52 = here;
		final boolean RX10_TEMP53 = RX10_TEMP50!=RX10_TEMP52;
		if (RX10_TEMP53) {
			String RX10_TEMP51 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP51);
		}
		Program.setRefArrayValue1double(ref, RX10_TEMP46, X10_TEMP23);
		final int X10_TEMP26 = (0);
		final int X10_TEMP27 = (0);
		final int X10_TEMP30 = (0);
		final int X10_TEMP31 = (X10_TEMP0.n);
		final Region2 tempR = Program.createNewRegion2RR(X10_TEMP26, X10_TEMP27, X10_TEMP30, X10_TEMP31);
		final place X10_TEMP33 = (here);
		final Dist2 tempdist = Program.getPlaceDist2(tempR, X10_TEMP33);
		final Region2 RX10_TEMP55 = tempdist.dReg;
		final int RX10_TEMP58 = 1;
		int RX10_TEMP56 = RX10_TEMP55.regSize;
		RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58;
		final region(:rank==1) RX10_TEMP57 = [0 : RX10_TEMP56];
		for(point(:rank==1) RX10_TEMP54:RX10_TEMP57) {
			final int RX10_TEMP59 = RX10_TEMP54[0];
			final Point2 pt = Program.regionOrdinalPoint2(RX10_TEMP55, RX10_TEMP59);
			int X10_TEMP38 = (0);
			int X10_TEMP39 = (1);
			int RX10_TEMP60 = pt.f0;
			int RX10_TEMP61 = pt.f1;
			RX10_TEMP60 = RX10_TEMP60 * X10_TEMP38;
			RX10_TEMP61 = RX10_TEMP61 * X10_TEMP39;
			final Point2 pt0 = (new Point2(RX10_TEMP60, RX10_TEMP61));
			final doubleRefArray2 X10_TEMP41 = X10_TEMP0.x;
			final doubleRefArray2 X10_TEMP43 = X10_TEMP0.b;
			final Dist2 RX10_TEMP62 = X10_TEMP43.distValue;
			final Region2 RX10_TEMP63 = RX10_TEMP62.dReg;
			final int RX10_TEMP64 = Program.searchPointInRegion2(RX10_TEMP63, pt0);
			final int RX10_TEMP65 = 0;
			final boolean RX10_TEMP66 = RX10_TEMP64<RX10_TEMP65;
			if (RX10_TEMP66) {
				String RX10_TEMP67 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP67);
			}
			final place RX10_TEMP68 = Program.getPlaceFromDist2(RX10_TEMP62, RX10_TEMP64);
			final place RX10_TEMP70 = here;
			final boolean RX10_TEMP71 = RX10_TEMP68!=RX10_TEMP70;
			if (RX10_TEMP71) {
				String RX10_TEMP69 = "Bad place access for array X10_TEMP43";
				throw new RuntimeException(RX10_TEMP69);
			}
			final double RX10_TEMP72 = Program.getRefArrayValue2double(X10_TEMP43, RX10_TEMP64);
			final double X10_TEMP47 = (RX10_TEMP72);
			final double X10_TEMP48 = (X10_TEMP47);
			final Dist2 RX10_TEMP73 = X10_TEMP41.distValue;
			final Region2 RX10_TEMP74 = RX10_TEMP73.dReg;
			final int RX10_TEMP75 = Program.searchPointInRegion2(RX10_TEMP74, pt0);
			final int RX10_TEMP76 = 0;
			final boolean RX10_TEMP77 = RX10_TEMP75<RX10_TEMP76;
			if (RX10_TEMP77) {
				String RX10_TEMP78 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP78);
			}
			final place RX10_TEMP79 = Program.getPlaceFromDist2(RX10_TEMP73, RX10_TEMP75);
			final place RX10_TEMP81 = here;
			final boolean RX10_TEMP82 = RX10_TEMP79!=RX10_TEMP81;
			if (RX10_TEMP82) {
				String RX10_TEMP80 = "Bad place access for array X10_TEMP41";
				throw new RuntimeException(RX10_TEMP80);
			}
			Program.setRefArrayValue2double(X10_TEMP41, RX10_TEMP75, X10_TEMP48);
		}
		final doubleRefArray2 X10_TEMP53 = X10_TEMP0.a;
		final int X10_TEMP54 = (X10_TEMP0.lda);
		final int X10_TEMP55 = (X10_TEMP0.n);
		final doubleRefArray2 X10_TEMP56 = X10_TEMP0.b;
		final double X10_TEMP59 = (Program.Linpack_matgen(X10_TEMP0, X10_TEMP53, X10_TEMP54, X10_TEMP55, X10_TEMP56));
		final double X10_TEMP60 = (X10_TEMP59);
		X10_TEMP0.norma = (X10_TEMP60);
		final Region2 RX10_TEMP84 = tempdist.dReg;
		final int RX10_TEMP87 = 1;
		int RX10_TEMP85 = RX10_TEMP84.regSize;
		RX10_TEMP85 = RX10_TEMP85 - RX10_TEMP87;
		final region(:rank==1) RX10_TEMP86 = [0 : RX10_TEMP85];
		for(point(:rank==1) RX10_TEMP83:RX10_TEMP86) {
			final int RX10_TEMP88 = RX10_TEMP83[0];
			final Point2 pt = Program.regionOrdinalPoint2(RX10_TEMP84, RX10_TEMP88);
			int X10_TEMP64 = (0);
			int X10_TEMP65 = (1);
			int RX10_TEMP89 = pt.f0;
			int RX10_TEMP90 = pt.f1;
			RX10_TEMP89 = RX10_TEMP89 * X10_TEMP64;
			RX10_TEMP90 = RX10_TEMP90 * X10_TEMP65;
			final Point2 pt0 = (new Point2(RX10_TEMP89, RX10_TEMP90));
			final doubleRefArray2 X10_TEMP67 = X10_TEMP0.b;
			final doubleRefArray2 X10_TEMP69 = X10_TEMP0.b;
			final Dist2 RX10_TEMP91 = X10_TEMP69.distValue;
			final Region2 RX10_TEMP92 = RX10_TEMP91.dReg;
			final int RX10_TEMP93 = Program.searchPointInRegion2(RX10_TEMP92, pt0);
			final int RX10_TEMP94 = 0;
			final boolean RX10_TEMP95 = RX10_TEMP93<RX10_TEMP94;
			if (RX10_TEMP95) {
				String RX10_TEMP96 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP96);
			}
			final place RX10_TEMP97 = Program.getPlaceFromDist2(RX10_TEMP91, RX10_TEMP93);
			final place RX10_TEMP99 = here;
			final boolean RX10_TEMP100 = RX10_TEMP97!=RX10_TEMP99;
			if (RX10_TEMP100) {
				String RX10_TEMP98 = "Bad place access for array X10_TEMP69";
				throw new RuntimeException(RX10_TEMP98);
			}
			final double RX10_TEMP101 = Program.getRefArrayValue2double(X10_TEMP69, RX10_TEMP93);
			final double X10_TEMP71 = (RX10_TEMP101);
			final int X10_TEMP72 = 0;
			final double X10_TEMP75 = (X10_TEMP72 - X10_TEMP71);
			final double X10_TEMP76 = (X10_TEMP75);
			final Dist2 RX10_TEMP102 = X10_TEMP67.distValue;
			final Region2 RX10_TEMP103 = RX10_TEMP102.dReg;
			final int RX10_TEMP104 = Program.searchPointInRegion2(RX10_TEMP103, pt0);
			final int RX10_TEMP105 = 0;
			final boolean RX10_TEMP106 = RX10_TEMP104<RX10_TEMP105;
			if (RX10_TEMP106) {
				String RX10_TEMP107 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP107);
			}
			final place RX10_TEMP108 = Program.getPlaceFromDist2(RX10_TEMP102, RX10_TEMP104);
			final place RX10_TEMP110 = here;
			final boolean RX10_TEMP111 = RX10_TEMP108!=RX10_TEMP110;
			if (RX10_TEMP111) {
				String RX10_TEMP109 = "Bad place access for array X10_TEMP67";
				throw new RuntimeException(RX10_TEMP109);
			}
			Program.setRefArrayValue2double(X10_TEMP67, RX10_TEMP104, X10_TEMP76);
		}
		final int X10_TEMP83 = (X10_TEMP0.n);
		final doubleRefArray2 X10_TEMP84 = X10_TEMP0.b;
		final int X10_TEMP85 = (X10_TEMP0.n);
		final int X10_TEMP86 = (X10_TEMP0.lda);
		final doubleRefArray2 X10_TEMP87 = X10_TEMP0.x;
		final doubleRefArray2 X10_TEMP88 = X10_TEMP0.a;
		Program.Linpack_dmxpy(X10_TEMP0, X10_TEMP83, X10_TEMP84, X10_TEMP85, X10_TEMP86, X10_TEMP87, X10_TEMP88);
		final double X10_TEMP91 = (0.0);
		final double X10_TEMP92 = (X10_TEMP91);
		X10_TEMP0.resid = (X10_TEMP92);
		final double X10_TEMP95 = (0.0);
		final double X10_TEMP96 = (X10_TEMP95);
		X10_TEMP0.normx = (X10_TEMP96);
		final Region2 RX10_TEMP113 = tempdist.dReg;
		final int RX10_TEMP116 = 1;
		int RX10_TEMP114 = RX10_TEMP113.regSize;
		RX10_TEMP114 = RX10_TEMP114 - RX10_TEMP116;
		final region(:rank==1) RX10_TEMP115 = [0 : RX10_TEMP114];
		for(point(:rank==1) RX10_TEMP112:RX10_TEMP115) {
			final int RX10_TEMP117 = RX10_TEMP112[0];
			final Point2 pt = Program.regionOrdinalPoint2(RX10_TEMP113, RX10_TEMP117);
			int X10_TEMP100 = (0);
			int X10_TEMP101 = (1);
			int RX10_TEMP118 = pt.f0;
			int RX10_TEMP119 = pt.f1;
			RX10_TEMP118 = RX10_TEMP118 * X10_TEMP100;
			RX10_TEMP119 = RX10_TEMP119 * X10_TEMP101;
			final Point2 pt0 = (new Point2(RX10_TEMP118, RX10_TEMP119));
			final double X10_TEMP107 = (X10_TEMP0.resid);
			final doubleRefArray2 X10_TEMP103 = X10_TEMP0.b;
			final Dist2 RX10_TEMP120 = X10_TEMP103.distValue;
			final Region2 RX10_TEMP121 = RX10_TEMP120.dReg;
			final int RX10_TEMP122 = Program.searchPointInRegion2(RX10_TEMP121, pt0);
			final int RX10_TEMP123 = 0;
			final boolean RX10_TEMP124 = RX10_TEMP122<RX10_TEMP123;
			if (RX10_TEMP124) {
				String RX10_TEMP125 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP125);
			}
			final place RX10_TEMP126 = Program.getPlaceFromDist2(RX10_TEMP120, RX10_TEMP122);
			final place RX10_TEMP128 = here;
			final boolean RX10_TEMP129 = RX10_TEMP126!=RX10_TEMP128;
			if (RX10_TEMP129) {
				String RX10_TEMP127 = "Bad place access for array X10_TEMP103";
				throw new RuntimeException(RX10_TEMP127);
			}
			final double RX10_TEMP130 = Program.getRefArrayValue2double(X10_TEMP103, RX10_TEMP122);
			final double X10_TEMP106 = (RX10_TEMP130);
			final double X10_TEMP108 = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP106));
			final boolean X10_TEMP110 = (X10_TEMP107>X10_TEMP108);
			final boolean X10_TEMP111 = X10_TEMP110;
			final doubleRefArray2 X10_TEMP113 = X10_TEMP0.b;
			final Dist2 RX10_TEMP131 = X10_TEMP113.distValue;
			final Region2 RX10_TEMP132 = RX10_TEMP131.dReg;
			final int RX10_TEMP133 = Program.searchPointInRegion2(RX10_TEMP132, pt0);
			final int RX10_TEMP134 = 0;
			final boolean RX10_TEMP135 = RX10_TEMP133<RX10_TEMP134;
			if (RX10_TEMP135) {
				String RX10_TEMP136 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP136);
			}
			final place RX10_TEMP137 = Program.getPlaceFromDist2(RX10_TEMP131, RX10_TEMP133);
			final place RX10_TEMP139 = here;
			final boolean RX10_TEMP140 = RX10_TEMP137!=RX10_TEMP139;
			if (RX10_TEMP140) {
				String RX10_TEMP138 = "Bad place access for array X10_TEMP113";
				throw new RuntimeException(RX10_TEMP138);
			}
			final double RX10_TEMP141 = Program.getRefArrayValue2double(X10_TEMP113, RX10_TEMP133);
			final double X10_TEMP116 = (RX10_TEMP141);
			double X10_TEMP118 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP116);
			if(X10_TEMP111) {
				X10_TEMP118 = X10_TEMP0.resid;
			}
			final double X10_TEMP119 = X10_TEMP118;
			final double X10_TEMP121 = (X10_TEMP119);
			X10_TEMP0.resid = (X10_TEMP121);
			final double X10_TEMP126 = (X10_TEMP0.normx);
			final doubleRefArray2 X10_TEMP122 = X10_TEMP0.x;
			final Dist2 RX10_TEMP142 = X10_TEMP122.distValue;
			final Region2 RX10_TEMP143 = RX10_TEMP142.dReg;
			final int RX10_TEMP144 = Program.searchPointInRegion2(RX10_TEMP143, pt0);
			final int RX10_TEMP145 = 0;
			final boolean RX10_TEMP146 = RX10_TEMP144<RX10_TEMP145;
			if (RX10_TEMP146) {
				String RX10_TEMP147 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP147);
			}
			final place RX10_TEMP148 = Program.getPlaceFromDist2(RX10_TEMP142, RX10_TEMP144);
			final place RX10_TEMP150 = here;
			final boolean RX10_TEMP151 = RX10_TEMP148!=RX10_TEMP150;
			if (RX10_TEMP151) {
				String RX10_TEMP149 = "Bad place access for array X10_TEMP122";
				throw new RuntimeException(RX10_TEMP149);
			}
			final double RX10_TEMP152 = Program.getRefArrayValue2double(X10_TEMP122, RX10_TEMP144);
			final double X10_TEMP125 = (RX10_TEMP152);
			final double X10_TEMP127 = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP125));
			final boolean X10_TEMP129 = (X10_TEMP126>X10_TEMP127);
			final boolean X10_TEMP130 = X10_TEMP129;
			final doubleRefArray2 X10_TEMP132 = X10_TEMP0.x;
			final Dist2 RX10_TEMP153 = X10_TEMP132.distValue;
			final Region2 RX10_TEMP154 = RX10_TEMP153.dReg;
			final int RX10_TEMP155 = Program.searchPointInRegion2(RX10_TEMP154, pt0);
			final int RX10_TEMP156 = 0;
			final boolean RX10_TEMP157 = RX10_TEMP155<RX10_TEMP156;
			if (RX10_TEMP157) {
				String RX10_TEMP158 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP158);
			}
			final place RX10_TEMP159 = Program.getPlaceFromDist2(RX10_TEMP153, RX10_TEMP155);
			final place RX10_TEMP161 = here;
			final boolean RX10_TEMP162 = RX10_TEMP159!=RX10_TEMP161;
			if (RX10_TEMP162) {
				String RX10_TEMP160 = "Bad place access for array X10_TEMP132";
				throw new RuntimeException(RX10_TEMP160);
			}
			final double RX10_TEMP163 = Program.getRefArrayValue2double(X10_TEMP132, RX10_TEMP155);
			final double X10_TEMP135 = (RX10_TEMP163);
			double X10_TEMP137 = Program.Linpack_myabs(X10_TEMP0, X10_TEMP135);
			if(X10_TEMP130) {
				X10_TEMP137 = X10_TEMP0.normx;
			}
			final double X10_TEMP138 = X10_TEMP137;
			final double X10_TEMP140 = (X10_TEMP138);
			X10_TEMP0.normx = (X10_TEMP140);
		}
		final double X10_TEMP141 = (1.0);
		final double X10_TEMP143 = ((double)X10_TEMP141);
		final double X10_TEMP145 = (Program.Linpack_epslon(X10_TEMP0, X10_TEMP143));
		eps = (X10_TEMP145);
		final double X10_TEMP153 = (X10_TEMP0.resid);
		final double X10_TEMP146 = (X10_TEMP0.n);
		final double X10_TEMP147 = (X10_TEMP0.norma);
		final double X10_TEMP148 = (X10_TEMP146 * X10_TEMP147);
		final double X10_TEMP149 = (X10_TEMP0.normx);
		final double X10_TEMP150 = (X10_TEMP148 * X10_TEMP149);
		final double X10_TEMP152 = (X10_TEMP150 * eps);
		final double X10_TEMP155 = (X10_TEMP153 / X10_TEMP152);
		residn = (X10_TEMP155);
		final int X10_TEMP157 = (X10_TEMP0.setSize);
		final Point1 RX10_TEMP164 = new Point1(X10_TEMP157);
		final Dist1 RX10_TEMP165 = ref.distValue;
		final Region1 RX10_TEMP166 = RX10_TEMP165.dReg;
		final int RX10_TEMP167 = Program.searchPointInRegion1(RX10_TEMP166, RX10_TEMP164);
		final int RX10_TEMP168 = 0;
		final boolean RX10_TEMP169 = RX10_TEMP167<RX10_TEMP168;
		if (RX10_TEMP169) {
			String RX10_TEMP170 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP170);
		}
		final place RX10_TEMP171 = Program.getPlaceFromDist1(RX10_TEMP165, RX10_TEMP167);
		final place RX10_TEMP173 = here;
		final boolean RX10_TEMP174 = RX10_TEMP171!=RX10_TEMP173;
		if (RX10_TEMP174) {
			String RX10_TEMP172 = "Bad place access for array ref";
			throw new RuntimeException(RX10_TEMP172);
		}
		final double RX10_TEMP175 = Program.getRefArrayValue1double(ref, RX10_TEMP167);
		final double X10_TEMP158 = (RX10_TEMP175);
		final boolean X10_TEMP160 = residn>X10_TEMP158;
		if(X10_TEMP160) {
			final String X10_TEMP162 = ("Validation failed");
			System.out.println(X10_TEMP162);
			final String X10_TEMP163 = ("Computed Norm Res = ");
			final String X10_TEMP165 = (X10_TEMP163 + residn);
			System.out.println(X10_TEMP165);
			final String X10_TEMP168 = ("Reference Norm Res = ");
			final int X10_TEMP167 = (X10_TEMP0.setSize);
			final Point1 RX10_TEMP176 = new Point1(X10_TEMP167);
			final Dist1 RX10_TEMP177 = ref.distValue;
			final Region1 RX10_TEMP178 = RX10_TEMP177.dReg;
			final int RX10_TEMP179 = Program.searchPointInRegion1(RX10_TEMP178, RX10_TEMP176);
			final int RX10_TEMP180 = 0;
			final boolean RX10_TEMP181 = RX10_TEMP179<RX10_TEMP180;
			if (RX10_TEMP181) {
				String RX10_TEMP182 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP182);
			}
			final place RX10_TEMP183 = Program.getPlaceFromDist1(RX10_TEMP177, RX10_TEMP179);
			final place RX10_TEMP185 = here;
			final boolean RX10_TEMP186 = RX10_TEMP183!=RX10_TEMP185;
			if (RX10_TEMP186) {
				String RX10_TEMP184 = "Bad place access for array ref";
				throw new RuntimeException(RX10_TEMP184);
			}
			final double RX10_TEMP187 = Program.getRefArrayValue1double(ref, RX10_TEMP179);
			final double X10_TEMP169 = (RX10_TEMP187);
			final String X10_TEMP171 = (X10_TEMP168 + X10_TEMP169);
			System.out.println(X10_TEMP171);
			final String X10_TEMP173 = ("Validation failed");
			throw new RuntimeException(X10_TEMP173);
		}
	}

	public static void Linpack_JGFtidyup(final Linpack X10_TEMP0) {
	}

	public static void Linpack_run(final Linpack X10_TEMP0) {
		final int X10_TEMP2 = (0);
		Program.Linpack_JGFsetsize(X10_TEMP0, X10_TEMP2);
		final place X10_TEMP3 = (here);
		final Dist1 vd = Program.getPlaceDist1(_Linpack_r, X10_TEMP3);
		Program.Linpack_JGFinitialise(X10_TEMP0, vd);
		Program.Linpack_JGFkernel(X10_TEMP0);
		Program.Linpack_JGFvalidate(X10_TEMP0, vd);
		Program.Linpack_JGFtidyup(X10_TEMP0);
	}

	public static double Linpack_read(final Linpack X10_TEMP0, final doubleRefArray2 a, final int i, final int j) {
		final place curr_place = (here);
		final int X10_TEMP4 = (0);
		final int X10_TEMP5 = (0);
		final Region1 tempr = Program.createNewRegion1R(X10_TEMP4, X10_TEMP5);
		final place X10_TEMP7 = (here);
		final Dist1 tempvd = Program.getPlaceDist1(tempr, X10_TEMP7);
		final Region1 RX10_TEMP0 = tempvd.dReg;
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
				final int RX10_TEMP11 = Program.getDistLocalCount1(tempvd, RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				async(RX10_TEMP10) {
					final dist(:rank==1) RX10_TEMP14= [0 : RX10_TEMP12] -> here;
					final double [:rank==1] RX10_TEMP15 = (double [:rank==1])(new double [RX10_TEMP14](point(:rank==1)RX10_TEMP13) {
						final double X10_TEMP10 = (0.0);
						return X10_TEMP10;
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
		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(tempvd, RX10_TEMP17);
		final doubleRefArray1 tempref = RX10_TEMP20;
		finish {
			final Dist2 RX10_TEMP21 = a.distValue;
			final Dist2 X10_TEMP12 = RX10_TEMP21;
			final Point2 RX10_TEMP22 = new Point2(i, j);
			final Region2 RX10_TEMP23 = X10_TEMP12.dReg;
			final int RX10_TEMP24 = Program.searchPointInRegion2(RX10_TEMP23, RX10_TEMP22);
			final int RX10_TEMP25 = 0;
			final boolean RX10_TEMP26 = RX10_TEMP24<RX10_TEMP25;
			if(RX10_TEMP26) {
				final String RX10_TEMP27 = "Point RX10_TEMP22 not found in the distribution X10_TEMP12.";
				throw new RuntimeException(RX10_TEMP27);
			}
			final place RX10_TEMP28 = Program.getPlaceFromDist2(X10_TEMP12, RX10_TEMP24);
			final place X10_TEMP16 = RX10_TEMP28;
			async(X10_TEMP16) {
				final Point2 RX10_TEMP29 = new Point2(i, j);
				final Dist2 RX10_TEMP30 = a.distValue;
				final Region2 RX10_TEMP31 = RX10_TEMP30.dReg;
				final int RX10_TEMP32 = Program.searchPointInRegion2(RX10_TEMP31, RX10_TEMP29);
				final int RX10_TEMP33 = 0;
				final boolean RX10_TEMP34 = RX10_TEMP32<RX10_TEMP33;
				if (RX10_TEMP34) {
					String RX10_TEMP35 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP35);
				}
				final place RX10_TEMP36 = Program.getPlaceFromDist2(RX10_TEMP30, RX10_TEMP32);
				final place RX10_TEMP38 = here;
				final boolean RX10_TEMP39 = RX10_TEMP36!=RX10_TEMP38;
				if (RX10_TEMP39) {
					String RX10_TEMP37 = "Bad place access for array a";
					throw new RuntimeException(RX10_TEMP37);
				}
				final double RX10_TEMP40 = Program.getRefArrayValue2double(a, RX10_TEMP32);
				final double temp = (RX10_TEMP40);
				async(curr_place) {
					final int X10_TEMP22 = (0);
					final double X10_TEMP25 = (temp);
					final Point1 RX10_TEMP41 = new Point1(X10_TEMP22);
					final Dist1 RX10_TEMP42 = tempref.distValue;
					final Region1 RX10_TEMP43 = RX10_TEMP42.dReg;
					final int RX10_TEMP44 = Program.searchPointInRegion1(RX10_TEMP43, RX10_TEMP41);
					final int RX10_TEMP45 = 0;
					final boolean RX10_TEMP46 = RX10_TEMP44<RX10_TEMP45;
					if (RX10_TEMP46) {
						String RX10_TEMP47 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP47);
					}
					final place RX10_TEMP48 = Program.getPlaceFromDist1(RX10_TEMP42, RX10_TEMP44);
					final place RX10_TEMP50 = here;
					final boolean RX10_TEMP51 = RX10_TEMP48!=RX10_TEMP50;
					if (RX10_TEMP51) {
						String RX10_TEMP49 = "Bad place access for array tempref";
						throw new RuntimeException(RX10_TEMP49);
					}
					Program.setRefArrayValue1double(tempref, RX10_TEMP44, X10_TEMP25);
				}
			}
		}
		final int X10_TEMP27 = (0);
		final Point1 RX10_TEMP52 = new Point1(X10_TEMP27);
		final Dist1 RX10_TEMP53 = tempref.distValue;
		final Region1 RX10_TEMP54 = RX10_TEMP53.dReg;
		final int RX10_TEMP55 = Program.searchPointInRegion1(RX10_TEMP54, RX10_TEMP52);
		final int RX10_TEMP56 = 0;
		final boolean RX10_TEMP57 = RX10_TEMP55<RX10_TEMP56;
		if (RX10_TEMP57) {
			String RX10_TEMP58 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP58);
		}
		final place RX10_TEMP59 = Program.getPlaceFromDist1(RX10_TEMP53, RX10_TEMP55);
		final place RX10_TEMP61 = here;
		final boolean RX10_TEMP62 = RX10_TEMP59!=RX10_TEMP61;
		if (RX10_TEMP62) {
			String RX10_TEMP60 = "Bad place access for array tempref";
			throw new RuntimeException(RX10_TEMP60);
		}
		final double RX10_TEMP63 = Program.getRefArrayValue1double(tempref, RX10_TEMP55);
		final double X10_TEMP29 = (RX10_TEMP63);
		return X10_TEMP29;
	}

	public static void Linpack_write(final Linpack X10_TEMP0, final doubleRefArray2 a, final Point2 p, final double val) {
		final Dist2 RX10_TEMP0 = a.distValue;
		final Dist2 X10_TEMP1 = RX10_TEMP0;
		final Region2 RX10_TEMP1 = X10_TEMP1.dReg;
		final int RX10_TEMP2 = Program.searchPointInRegion2(RX10_TEMP1, p);
		final int RX10_TEMP3 = 0;
		final boolean RX10_TEMP4 = RX10_TEMP2<RX10_TEMP3;
		if(RX10_TEMP4) {
			final String RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1.";
			throw new RuntimeException(RX10_TEMP5);
		}
		final place RX10_TEMP6 = Program.getPlaceFromDist2(X10_TEMP1, RX10_TEMP2);
		final place X10_TEMP4 = RX10_TEMP6;
		async(X10_TEMP4) {
			final double X10_TEMP8 = (val);
			final Dist2 RX10_TEMP7 = a.distValue;
			final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;
			final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, p);
			final int RX10_TEMP10 = 0;
			final boolean RX10_TEMP11 = RX10_TEMP9<RX10_TEMP10;
			if (RX10_TEMP11) {
				String RX10_TEMP12 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP12);
			}
			final place RX10_TEMP13 = Program.getPlaceFromDist2(RX10_TEMP7, RX10_TEMP9);
			final place RX10_TEMP15 = here;
			final boolean RX10_TEMP16 = RX10_TEMP13!=RX10_TEMP15;
			if (RX10_TEMP16) {
				String RX10_TEMP14 = "Bad place access for array a";
				throw new RuntimeException(RX10_TEMP14);
			}
			Program.setRefArrayValue2double(a, RX10_TEMP9, X10_TEMP8);
		}
	}

	public static void Linpack_plusWrite(final Linpack X10_TEMP0, final doubleRefArray2 a, final int i, final int j, final double val) {
		final Dist2 RX10_TEMP0 = a.distValue;
		final Dist2 X10_TEMP1 = RX10_TEMP0;
		final Point2 RX10_TEMP1 = new Point2(i, j);
		final Region2 RX10_TEMP2 = X10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP1);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
		if(RX10_TEMP5) {
			final String RX10_TEMP6 = "Point RX10_TEMP1 not found in the distribution X10_TEMP1.";
			throw new RuntimeException(RX10_TEMP6);
		}
		final place RX10_TEMP7 = Program.getPlaceFromDist2(X10_TEMP1, RX10_TEMP3);
		final place X10_TEMP5 = RX10_TEMP7;
		async(X10_TEMP5) {
			final Point2 RX10_TEMP8 = new Point2(i, j);
			final Dist2 RX10_TEMP9 = a.distValue;
			final Region2 RX10_TEMP10 = RX10_TEMP9.dReg;
			final int RX10_TEMP11 = Program.searchPointInRegion2(RX10_TEMP10, RX10_TEMP8);
			final int RX10_TEMP12 = 0;
			final boolean RX10_TEMP13 = RX10_TEMP11<RX10_TEMP12;
			if (RX10_TEMP13) {
				String RX10_TEMP14 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP14);
			}
			final place RX10_TEMP15 = Program.getPlaceFromDist2(RX10_TEMP9, RX10_TEMP11);
			final place RX10_TEMP17 = here;
			final boolean RX10_TEMP18 = RX10_TEMP15!=RX10_TEMP17;
			if (RX10_TEMP18) {
				String RX10_TEMP16 = "Bad place access for array a";
				throw new RuntimeException(RX10_TEMP16);
			}
			final double RX10_TEMP19 = Program.getRefArrayValue2double(a, RX10_TEMP11);
			final double X10_TEMP10 = (RX10_TEMP19);
			final double X10_TEMP13 = (X10_TEMP10 + val);
			final double X10_TEMP14 = (X10_TEMP13);
			final Point2 RX10_TEMP20 = new Point2(i, j);
			final Dist2 RX10_TEMP21 = a.distValue;
			final Region2 RX10_TEMP22 = RX10_TEMP21.dReg;
			final int RX10_TEMP23 = Program.searchPointInRegion2(RX10_TEMP22, RX10_TEMP20);
			final int RX10_TEMP24 = 0;
			final boolean RX10_TEMP25 = RX10_TEMP23<RX10_TEMP24;
			if (RX10_TEMP25) {
				String RX10_TEMP26 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP26);
			}
			final place RX10_TEMP27 = Program.getPlaceFromDist2(RX10_TEMP21, RX10_TEMP23);
			final place RX10_TEMP29 = here;
			final boolean RX10_TEMP30 = RX10_TEMP27!=RX10_TEMP29;
			if (RX10_TEMP30) {
				String RX10_TEMP28 = "Bad place access for array a";
				throw new RuntimeException(RX10_TEMP28);
			}
			Program.setRefArrayValue2double(a, RX10_TEMP23, X10_TEMP14);
		}
	}

	public static double Linpack_myabs(final Linpack X10_TEMP0, final double d) {
		final int X10_TEMP1 = (0);
		final boolean X10_TEMP3 = (d>=X10_TEMP1);
		final boolean X10_TEMP4 = X10_TEMP3;
		final int X10_TEMP6 = 0;
		double X10_TEMP8 = X10_TEMP6 - d;
		if(X10_TEMP4) {
			X10_TEMP8 = d;
		}
		final double X10_TEMP9 = X10_TEMP8;
		return X10_TEMP9;
	}

	public static double Linpack_matgen(final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final doubleRefArray2 b) {
		int init = (1325);
		double norma = (0.0);
		final Dist2 RX10_TEMP1 = a.distValue;
		final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP5 = 1;
		int RX10_TEMP3 = RX10_TEMP2.regSize;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5;
		final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
		for(point(:rank==1) RX10_TEMP0:RX10_TEMP4) {
			final int RX10_TEMP6 = RX10_TEMP0[0];
			final Point2 p = Program.regionOrdinalPoint2(RX10_TEMP2, RX10_TEMP6);
			final int X10_TEMP4 = (3125);
			final int X10_TEMP5 = (X10_TEMP4 * init);
			final int X10_TEMP6 = (65536);
			final int X10_TEMP8 = (X10_TEMP5%X10_TEMP6);
			init = (X10_TEMP8);
			final double X10_TEMP9 = (32768.0);
			final double X10_TEMP11 = (init - X10_TEMP9);
			final double X10_TEMP12 = (16384.0);
			double val = (X10_TEMP11 / X10_TEMP12);
			finish {
				Program.Linpack_write(X10_TEMP0, a, p, val);
			}
			final boolean X10_TEMP17 = val>norma;
			double X10_TEMP20 = norma;
			if(X10_TEMP17) {
				X10_TEMP20 = val;
			}
			final double X10_TEMP21 = X10_TEMP20;
			norma = (X10_TEMP21);
		}
		finish {
			final Dist2 RX10_TEMP8 = b.distValue;
			final Region2 RX10_TEMP9 = RX10_TEMP8.dReg;
			final int RX10_TEMP12 = 1;
			int RX10_TEMP10 = RX10_TEMP9.regSize;
			RX10_TEMP10 = RX10_TEMP10 - RX10_TEMP12;
			final region(:rank==1) RX10_TEMP11 = [0 : RX10_TEMP10];
			for(point(:rank==1) RX10_TEMP7:RX10_TEMP11) {
				final int RX10_TEMP13 = RX10_TEMP7[0];
				final Point2 p = Program.regionOrdinalPoint2(RX10_TEMP9, RX10_TEMP13);
				final Dist2 RX10_TEMP14 = b.distValue;
				final Dist2 X10_TEMP23 = RX10_TEMP14;
				final Region2 RX10_TEMP15 = X10_TEMP23.dReg;
				final int RX10_TEMP16 = Program.searchPointInRegion2(RX10_TEMP15, p);
				final int RX10_TEMP17 = 0;
				final boolean RX10_TEMP18 = RX10_TEMP16<RX10_TEMP17;
				if(RX10_TEMP18) {
					final String RX10_TEMP19 = "Point p not found in the distribution X10_TEMP23.";
					throw new RuntimeException(RX10_TEMP19);
				}
				final place RX10_TEMP20 = Program.getPlaceFromDist2(X10_TEMP23, RX10_TEMP16);
				final place X10_TEMP24 = RX10_TEMP20;
				async(X10_TEMP24) {
					final double X10_TEMP28 = (0.0);
					final double X10_TEMP29 = (X10_TEMP28);
					final Dist2 RX10_TEMP21 = b.distValue;
					final Region2 RX10_TEMP22 = RX10_TEMP21.dReg;
					final int RX10_TEMP23 = Program.searchPointInRegion2(RX10_TEMP22, p);
					final int RX10_TEMP24 = 0;
					final boolean RX10_TEMP25 = RX10_TEMP23<RX10_TEMP24;
					if (RX10_TEMP25) {
						String RX10_TEMP26 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP26);
					}
					final place RX10_TEMP27 = Program.getPlaceFromDist2(RX10_TEMP21, RX10_TEMP23);
					final place RX10_TEMP29 = here;
					final boolean RX10_TEMP30 = RX10_TEMP27!=RX10_TEMP29;
					if (RX10_TEMP30) {
						String RX10_TEMP28 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP28);
					}
					Program.setRefArrayValue2double(b, RX10_TEMP23, X10_TEMP29);
				}
			}
		}
		finish {
			final int X10_TEMP33 = (0);
			final int X10_TEMP31 = (1);
			final int X10_TEMP34 = (n - X10_TEMP31);
			final int X10_TEMP38 = (0);
			final int X10_TEMP36 = (1);
			final int X10_TEMP39 = (n - X10_TEMP36);
			final Region2 X10_TEMP41 = Program.createNewRegion2RR(X10_TEMP33, X10_TEMP34, X10_TEMP38, X10_TEMP39);
			final int RX10_TEMP35 = 1;
			int RX10_TEMP33 = X10_TEMP41.regSize;
			RX10_TEMP33 = RX10_TEMP33 - RX10_TEMP35;
			final region(:rank==1) RX10_TEMP34 = [0 : RX10_TEMP33];
			for(point(:rank==1) RX10_TEMP31:RX10_TEMP34) {
				final int RX10_TEMP36 = RX10_TEMP31[0];
				final Point2 RX10_TEMP32 = Program.regionOrdinalPoint2(X10_TEMP41, RX10_TEMP36);
				final int i = RX10_TEMP32.f0;
				final int j = RX10_TEMP32.f1;
				finish {
					final Dist2 RX10_TEMP37 = a.distValue;
					final Dist2 X10_TEMP42 = RX10_TEMP37;
					final Point2 RX10_TEMP38 = new Point2(i, j);
					final Region2 RX10_TEMP39 = X10_TEMP42.dReg;
					final int RX10_TEMP40 = Program.searchPointInRegion2(RX10_TEMP39, RX10_TEMP38);
					final int RX10_TEMP41 = 0;
					final boolean RX10_TEMP42 = RX10_TEMP40<RX10_TEMP41;
					if(RX10_TEMP42) {
						final String RX10_TEMP43 = "Point RX10_TEMP38 not found in the distribution X10_TEMP42.";
						throw new RuntimeException(RX10_TEMP43);
					}
					final place RX10_TEMP44 = Program.getPlaceFromDist2(X10_TEMP42, RX10_TEMP40);
					final place X10_TEMP46 = RX10_TEMP44;
					async(X10_TEMP46) {
						final int X10_TEMP53 = (0);
						final Point2 RX10_TEMP45 = new Point2(i, j);
						final Dist2 RX10_TEMP46 = a.distValue;
						final Region2 RX10_TEMP47 = RX10_TEMP46.dReg;
						final int RX10_TEMP48 = Program.searchPointInRegion2(RX10_TEMP47, RX10_TEMP45);
						final int RX10_TEMP49 = 0;
						final boolean RX10_TEMP50 = RX10_TEMP48<RX10_TEMP49;
						if (RX10_TEMP50) {
							String RX10_TEMP51 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP51);
						}
						final place RX10_TEMP52 = Program.getPlaceFromDist2(RX10_TEMP46, RX10_TEMP48);
						final place RX10_TEMP54 = here;
						final boolean RX10_TEMP55 = RX10_TEMP52!=RX10_TEMP54;
						if (RX10_TEMP55) {
							String RX10_TEMP53 = "Bad place access for array a";
							throw new RuntimeException(RX10_TEMP53);
						}
						final double RX10_TEMP56 = Program.getRefArrayValue2double(a, RX10_TEMP48);
						final double X10_TEMP54 = (RX10_TEMP56);
						Program.Linpack_plusWrite(X10_TEMP0, b, X10_TEMP53, j, X10_TEMP54);
					}
				}
			}
		}
		return norma;
	}

	public static int Linpack_dgefa(final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final intRefArray1 ipvt) {
		final int X10_TEMP3 = (0);
		final int X10_TEMP4 = (X10_TEMP3);
		X10_TEMP0.infodgefa = (X10_TEMP4);
		final int X10_TEMP5 = (1);
		final int nm1 = (n - X10_TEMP5);
		final int X10_TEMP7 = (0);
		final boolean X10_TEMP9 = nm1>=X10_TEMP7;
		if(X10_TEMP9) {
			final int X10_TEMP13 = (0);
			final int X10_TEMP11 = (1);
			final int X10_TEMP14 = (nm1 - X10_TEMP11);
			Region1 tempr = Program.createNewRegion1R(X10_TEMP13, X10_TEMP14);
			final place X10_TEMP16 = (here);
			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP16);
			final Region1 RX10_TEMP2 = temprDist.dReg;
			final int RX10_TEMP5 = 1;
			int RX10_TEMP3 = RX10_TEMP2.regSize;
			RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5;
			final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
			for(point(:rank==1) RX10_TEMP0:RX10_TEMP4) {
				final int RX10_TEMP6 = RX10_TEMP0[0];
				final Point1 RX10_TEMP1 = Program.regionOrdinalPoint1(RX10_TEMP2, RX10_TEMP6);
				final int k = RX10_TEMP1.f0;
				final int X10_TEMP24 = (n - k);
				final int X10_TEMP25 = (1);
				final int X10_TEMP26 = (Program.Linpack_idamax(X10_TEMP0, X10_TEMP24, a, k, k, X10_TEMP25));
				final int l = (X10_TEMP26 + k);
				final int X10_TEMP31 = (l);
				final Point1 RX10_TEMP7 = new Point1(k);
				final Dist1 RX10_TEMP8 = ipvt.distValue;
				final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;
				final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP7);
				final int RX10_TEMP11 = 0;
				final boolean RX10_TEMP12 = RX10_TEMP10<RX10_TEMP11;
				if (RX10_TEMP12) {
					String RX10_TEMP13 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP13);
				}
				final place RX10_TEMP14 = Program.getPlaceFromDist1(RX10_TEMP8, RX10_TEMP10);
				final place RX10_TEMP16 = here;
				final boolean RX10_TEMP17 = RX10_TEMP14!=RX10_TEMP16;
				if (RX10_TEMP17) {
					String RX10_TEMP15 = "Bad place access for array ipvt";
					throw new RuntimeException(RX10_TEMP15);
				}
				Program.setRefArrayValue1int(ipvt, RX10_TEMP10, X10_TEMP31);
				finish {
					final Dist2 RX10_TEMP18 = a.distValue;
					final Dist2 X10_TEMP32 = RX10_TEMP18;
					int X10_TEMP35 = (1);
					final Point2 RX10_TEMP19 = new Point2(k, X10_TEMP35);
					final Region2 RX10_TEMP20 = X10_TEMP32.dReg;
					final int RX10_TEMP21 = Program.searchPointInRegion2(RX10_TEMP20, RX10_TEMP19);
					final int RX10_TEMP22 = 0;
					final boolean RX10_TEMP23 = RX10_TEMP21<RX10_TEMP22;
					if(RX10_TEMP23) {
						final String RX10_TEMP24 = "Point RX10_TEMP19 not found in the distribution X10_TEMP32.";
						throw new RuntimeException(RX10_TEMP24);
					}
					final place RX10_TEMP25 = Program.getPlaceFromDist2(X10_TEMP32, RX10_TEMP21);
					final place X10_TEMP37 = RX10_TEMP25;
					async(X10_TEMP37) {
						final int X10_TEMP38 = (1);
						final int kp1 = (k + X10_TEMP38);
						final Point2 RX10_TEMP26 = new Point2(k, l);
						final Dist2 RX10_TEMP27 = a.distValue;
						final Region2 RX10_TEMP28 = RX10_TEMP27.dReg;
						final int RX10_TEMP29 = Program.searchPointInRegion2(RX10_TEMP28, RX10_TEMP26);
						final int RX10_TEMP30 = 0;
						final boolean RX10_TEMP31 = RX10_TEMP29<RX10_TEMP30;
						if (RX10_TEMP31) {
							String RX10_TEMP32 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP32);
						}
						final place RX10_TEMP33 = Program.getPlaceFromDist2(RX10_TEMP27, RX10_TEMP29);
						final place RX10_TEMP35 = here;
						final boolean RX10_TEMP36 = RX10_TEMP33!=RX10_TEMP35;
						if (RX10_TEMP36) {
							String RX10_TEMP34 = "Bad place access for array a";
							throw new RuntimeException(RX10_TEMP34);
						}
						final double RX10_TEMP37 = Program.getRefArrayValue2double(a, RX10_TEMP29);
						final double X10_TEMP42 = (RX10_TEMP37);
						final int X10_TEMP43 = (0);
						final boolean X10_TEMP45 = X10_TEMP42!=X10_TEMP43;
						if(X10_TEMP45) {
							final boolean X10_TEMP47 = l!=k;
							if(X10_TEMP47) {
								final boolean X10_TEMP49 = l!=k;
								if(X10_TEMP49) {
									final Point2 RX10_TEMP38 = new Point2(k, l);
									final Dist2 RX10_TEMP39 = a.distValue;
									final Region2 RX10_TEMP40 = RX10_TEMP39.dReg;
									final int RX10_TEMP41 = Program.searchPointInRegion2(RX10_TEMP40, RX10_TEMP38);
									final int RX10_TEMP42 = 0;
									final boolean RX10_TEMP43 = RX10_TEMP41<RX10_TEMP42;
									if (RX10_TEMP43) {
										String RX10_TEMP44 = "Array access index out of bounds";
										throw new RuntimeException(RX10_TEMP44);
									}
									final place RX10_TEMP45 = Program.getPlaceFromDist2(RX10_TEMP39, RX10_TEMP41);
									final place RX10_TEMP47 = here;
									final boolean RX10_TEMP48 = RX10_TEMP45!=RX10_TEMP47;
									if (RX10_TEMP48) {
										String RX10_TEMP46 = "Bad place access for array a";
										throw new RuntimeException(RX10_TEMP46);
									}
									final double RX10_TEMP49 = Program.getRefArrayValue2double(a, RX10_TEMP41);
									double t = (RX10_TEMP49);
									final Point2 RX10_TEMP50 = new Point2(k, k);
									final Dist2 RX10_TEMP51 = a.distValue;
									final Region2 RX10_TEMP52 = RX10_TEMP51.dReg;
									final int RX10_TEMP53 = Program.searchPointInRegion2(RX10_TEMP52, RX10_TEMP50);
									final int RX10_TEMP54 = 0;
									final boolean RX10_TEMP55 = RX10_TEMP53<RX10_TEMP54;
									if (RX10_TEMP55) {
										String RX10_TEMP56 = "Array access index out of bounds";
										throw new RuntimeException(RX10_TEMP56);
									}
									final place RX10_TEMP57 = Program.getPlaceFromDist2(RX10_TEMP51, RX10_TEMP53);
									final place RX10_TEMP59 = here;
									final boolean RX10_TEMP60 = RX10_TEMP57!=RX10_TEMP59;
									if (RX10_TEMP60) {
										String RX10_TEMP58 = "Bad place access for array a";
										throw new RuntimeException(RX10_TEMP58);
									}
									final double RX10_TEMP61 = Program.getRefArrayValue2double(a, RX10_TEMP53);
									final double X10_TEMP59 = (RX10_TEMP61);
									final double X10_TEMP60 = (X10_TEMP59);
									final Point2 RX10_TEMP62 = new Point2(k, l);
									final Dist2 RX10_TEMP63 = a.distValue;
									final Region2 RX10_TEMP64 = RX10_TEMP63.dReg;
									final int RX10_TEMP65 = Program.searchPointInRegion2(RX10_TEMP64, RX10_TEMP62);
									final int RX10_TEMP66 = 0;
									final boolean RX10_TEMP67 = RX10_TEMP65<RX10_TEMP66;
									if (RX10_TEMP67) {
										String RX10_TEMP68 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP68);
									}
									final place RX10_TEMP69 = Program.getPlaceFromDist2(RX10_TEMP63, RX10_TEMP65);
									final place RX10_TEMP71 = here;
									final boolean RX10_TEMP72 = RX10_TEMP69!=RX10_TEMP71;
									if (RX10_TEMP72) {
										String RX10_TEMP70 = "Bad place access for array a";
										throw new RuntimeException(RX10_TEMP70);
									}
									Program.setRefArrayValue2double(a, RX10_TEMP65, X10_TEMP60);
									final double X10_TEMP65 = (t);
									final Point2 RX10_TEMP73 = new Point2(k, k);
									final Dist2 RX10_TEMP74 = a.distValue;
									final Region2 RX10_TEMP75 = RX10_TEMP74.dReg;
									final int RX10_TEMP76 = Program.searchPointInRegion2(RX10_TEMP75, RX10_TEMP73);
									final int RX10_TEMP77 = 0;
									final boolean RX10_TEMP78 = RX10_TEMP76<RX10_TEMP77;
									if (RX10_TEMP78) {
										String RX10_TEMP79 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP79);
									}
									final place RX10_TEMP80 = Program.getPlaceFromDist2(RX10_TEMP74, RX10_TEMP76);
									final place RX10_TEMP82 = here;
									final boolean RX10_TEMP83 = RX10_TEMP80!=RX10_TEMP82;
									if (RX10_TEMP83) {
										String RX10_TEMP81 = "Bad place access for array a";
										throw new RuntimeException(RX10_TEMP81);
									}
									Program.setRefArrayValue2double(a, RX10_TEMP76, X10_TEMP65);
								}
							}
							final double X10_TEMP66 = (1.0);
							final int X10_TEMP67 = 0;
							final double X10_TEMP70 = (X10_TEMP67 - X10_TEMP66);
							final Point2 RX10_TEMP84 = new Point2(k, k);
							final Dist2 RX10_TEMP85 = a.distValue;
							final Region2 RX10_TEMP86 = RX10_TEMP85.dReg;
							final int RX10_TEMP87 = Program.searchPointInRegion2(RX10_TEMP86, RX10_TEMP84);
							final int RX10_TEMP88 = 0;
							final boolean RX10_TEMP89 = RX10_TEMP87<RX10_TEMP88;
							if (RX10_TEMP89) {
								String RX10_TEMP90 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP90);
							}
							final place RX10_TEMP91 = Program.getPlaceFromDist2(RX10_TEMP85, RX10_TEMP87);
							final place RX10_TEMP93 = here;
							final boolean RX10_TEMP94 = RX10_TEMP91!=RX10_TEMP93;
							if (RX10_TEMP94) {
								String RX10_TEMP92 = "Bad place access for array a";
								throw new RuntimeException(RX10_TEMP92);
							}
							final double RX10_TEMP95 = Program.getRefArrayValue2double(a, RX10_TEMP87);
							final double X10_TEMP71 = (RX10_TEMP95);
							final double tx = (X10_TEMP70 / X10_TEMP71);
							final int X10_TEMP74 = (kp1);
							final int X10_TEMP81 = (n - X10_TEMP74);
							final int X10_TEMP82 = (1);
							Program.Linpack_dscal(X10_TEMP0, X10_TEMP81, tx, a, k, kp1, X10_TEMP82);
							finish {
								final int X10_TEMP84 = (1);
								final int X10_TEMP86 = (n - X10_TEMP84);
								Region1 temprkp1 = Program.createNewRegion1R(kp1, X10_TEMP86);
								final place X10_TEMP88 = (here);
								Dist1 temprkp1Dist = Program.getPlaceDist1(temprkp1, X10_TEMP88);
								final Region1 RX10_TEMP98 = temprkp1Dist.dReg;
								final int RX10_TEMP101 = 1;
								int RX10_TEMP99 = RX10_TEMP98.regSize;
								RX10_TEMP99 = RX10_TEMP99 - RX10_TEMP101;
								final region(:rank==1) RX10_TEMP100 = [0 : RX10_TEMP99];
								for(point(:rank==1) RX10_TEMP96:RX10_TEMP100) {
									final int RX10_TEMP102 = RX10_TEMP96[0];
									final Point1 RX10_TEMP97 = Program.regionOrdinalPoint1(RX10_TEMP98, RX10_TEMP102);
									final int j = RX10_TEMP97.f0;
									final Dist2 RX10_TEMP103 = a.distValue;
									final Dist2 X10_TEMP91 = RX10_TEMP103;
									final Point2 RX10_TEMP104 = new Point2(j, l);
									final Region2 RX10_TEMP105 = X10_TEMP91.dReg;
									final int RX10_TEMP106 = Program.searchPointInRegion2(RX10_TEMP105, RX10_TEMP104);
									final int RX10_TEMP107 = 0;
									final boolean RX10_TEMP108 = RX10_TEMP106<RX10_TEMP107;
									if(RX10_TEMP108) {
										final String RX10_TEMP109 = "Point RX10_TEMP104 not found in the distribution X10_TEMP91.";
										throw new RuntimeException(RX10_TEMP109);
									}
									final place RX10_TEMP110 = Program.getPlaceFromDist2(X10_TEMP91, RX10_TEMP106);
									final place X10_TEMP95 = RX10_TEMP110;
									async(X10_TEMP95) {
										final Point2 RX10_TEMP111 = new Point2(j, l);
										final Dist2 RX10_TEMP112 = a.distValue;
										final Region2 RX10_TEMP113 = RX10_TEMP112.dReg;
										final int RX10_TEMP114 = Program.searchPointInRegion2(RX10_TEMP113, RX10_TEMP111);
										final int RX10_TEMP115 = 0;
										final boolean RX10_TEMP116 = RX10_TEMP114<RX10_TEMP115;
										if (RX10_TEMP116) {
											String RX10_TEMP117 = "Array access index out of bounds";
											throw new RuntimeException(RX10_TEMP117);
										}
										final place RX10_TEMP118 = Program.getPlaceFromDist2(RX10_TEMP112, RX10_TEMP114);
										final place RX10_TEMP120 = here;
										final boolean RX10_TEMP121 = RX10_TEMP118!=RX10_TEMP120;
										if (RX10_TEMP121) {
											String RX10_TEMP119 = "Bad place access for array a";
											throw new RuntimeException(RX10_TEMP119);
										}
										final double RX10_TEMP122 = Program.getRefArrayValue2double(a, RX10_TEMP114);
										double t = (RX10_TEMP122);
										final boolean X10_TEMP100 = l!=k;
										if(X10_TEMP100) {
											final Point2 RX10_TEMP123 = new Point2(j, k);
											final Dist2 RX10_TEMP124 = a.distValue;
											final Region2 RX10_TEMP125 = RX10_TEMP124.dReg;
											final int RX10_TEMP126 = Program.searchPointInRegion2(RX10_TEMP125, RX10_TEMP123);
											final int RX10_TEMP127 = 0;
											final boolean RX10_TEMP128 = RX10_TEMP126<RX10_TEMP127;
											if (RX10_TEMP128) {
												String RX10_TEMP129 = "Array access index out of bounds";
												throw new RuntimeException(RX10_TEMP129);
											}
											final place RX10_TEMP130 = Program.getPlaceFromDist2(RX10_TEMP124, RX10_TEMP126);
											final place RX10_TEMP132 = here;
											final boolean RX10_TEMP133 = RX10_TEMP130!=RX10_TEMP132;
											if (RX10_TEMP133) {
												String RX10_TEMP131 = "Bad place access for array a";
												throw new RuntimeException(RX10_TEMP131);
											}
											final double RX10_TEMP134 = Program.getRefArrayValue2double(a, RX10_TEMP126);
											final double X10_TEMP107 = (RX10_TEMP134);
											final double X10_TEMP108 = (X10_TEMP107);
											final Point2 RX10_TEMP135 = new Point2(j, l);
											final Dist2 RX10_TEMP136 = a.distValue;
											final Region2 RX10_TEMP137 = RX10_TEMP136.dReg;
											final int RX10_TEMP138 = Program.searchPointInRegion2(RX10_TEMP137, RX10_TEMP135);
											final int RX10_TEMP139 = 0;
											final boolean RX10_TEMP140 = RX10_TEMP138<RX10_TEMP139;
											if (RX10_TEMP140) {
												String RX10_TEMP141 = "Array index out of bounds";
												throw new RuntimeException(RX10_TEMP141);
											}
											final place RX10_TEMP142 = Program.getPlaceFromDist2(RX10_TEMP136, RX10_TEMP138);
											final place RX10_TEMP144 = here;
											final boolean RX10_TEMP145 = RX10_TEMP142!=RX10_TEMP144;
											if (RX10_TEMP145) {
												String RX10_TEMP143 = "Bad place access for array a";
												throw new RuntimeException(RX10_TEMP143);
											}
											Program.setRefArrayValue2double(a, RX10_TEMP138, X10_TEMP108);
											final double X10_TEMP113 = (t);
											final Point2 RX10_TEMP146 = new Point2(j, k);
											final Dist2 RX10_TEMP147 = a.distValue;
											final Region2 RX10_TEMP148 = RX10_TEMP147.dReg;
											final int RX10_TEMP149 = Program.searchPointInRegion2(RX10_TEMP148, RX10_TEMP146);
											final int RX10_TEMP150 = 0;
											final boolean RX10_TEMP151 = RX10_TEMP149<RX10_TEMP150;
											if (RX10_TEMP151) {
												String RX10_TEMP152 = "Array index out of bounds";
												throw new RuntimeException(RX10_TEMP152);
											}
											final place RX10_TEMP153 = Program.getPlaceFromDist2(RX10_TEMP147, RX10_TEMP149);
											final place RX10_TEMP155 = here;
											final boolean RX10_TEMP156 = RX10_TEMP153!=RX10_TEMP155;
											if (RX10_TEMP156) {
												String RX10_TEMP154 = "Bad place access for array a";
												throw new RuntimeException(RX10_TEMP154);
											}
											Program.setRefArrayValue2double(a, RX10_TEMP149, X10_TEMP113);
										}
										final int X10_TEMP115 = (kp1);
										final int X10_TEMP126 = (n - X10_TEMP115);
										final int X10_TEMP127 = (1);
										final int X10_TEMP128 = (1);
										Program.Linpack_daxpy(X10_TEMP0, X10_TEMP126, t, a, k, kp1, X10_TEMP127, a, j, kp1, X10_TEMP128);
									}
								}
							}
						}
						else {
							final int X10_TEMP131 = (k);
							X10_TEMP0.infodgefa = (X10_TEMP131);
						}
					}
				}
			}
		}
		final int X10_TEMP132 = (1);
		final int X10_TEMP134 = (n - X10_TEMP132);
		final int X10_TEMP135 = (1);
		final int X10_TEMP138 = (n - X10_TEMP135);
		final int X10_TEMP139 = (X10_TEMP138);
		final Point1 RX10_TEMP157 = new Point1(X10_TEMP134);
		final Dist1 RX10_TEMP158 = ipvt.distValue;
		final Region1 RX10_TEMP159 = RX10_TEMP158.dReg;
		final int RX10_TEMP160 = Program.searchPointInRegion1(RX10_TEMP159, RX10_TEMP157);
		final int RX10_TEMP161 = 0;
		final boolean RX10_TEMP162 = RX10_TEMP160<RX10_TEMP161;
		if (RX10_TEMP162) {
			String RX10_TEMP163 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP163);
		}
		final place RX10_TEMP164 = Program.getPlaceFromDist1(RX10_TEMP158, RX10_TEMP160);
		final place RX10_TEMP166 = here;
		final boolean RX10_TEMP167 = RX10_TEMP164!=RX10_TEMP166;
		if (RX10_TEMP167) {
			String RX10_TEMP165 = "Bad place access for array ipvt";
			throw new RuntimeException(RX10_TEMP165);
		}
		Program.setRefArrayValue1int(ipvt, RX10_TEMP160, X10_TEMP139);
		final int X10_TEMP141 = (1);
		final int X10_TEMP145 = (n - X10_TEMP141);
		final int X10_TEMP143 = (1);
		final int X10_TEMP146 = (n - X10_TEMP143);
		double val = (Program.Linpack_read(X10_TEMP0, a, X10_TEMP145, X10_TEMP146));
		final int X10_TEMP148 = (0);
		final boolean X10_TEMP150 = val==X10_TEMP148;
		if(X10_TEMP150) {
			final int X10_TEMP151 = (1);
			final int X10_TEMP154 = (n - X10_TEMP151);
			final int X10_TEMP155 = (X10_TEMP154);
			X10_TEMP0.info = (X10_TEMP155);
		}
		final int X10_TEMP157 = (X10_TEMP0.infodgefa);
		return X10_TEMP157;
	}

	public static void Linpack_dgesl(final Linpack X10_TEMP0, final doubleRefArray2 a, final int lda, final int n, final intRefArray1 ipvt, final doubleRefArray2 b, final int job) {
		final int X10_TEMP1 = (1);
		final int nm1 = (n - X10_TEMP1);
		final int X10_TEMP3 = (0);
		final boolean X10_TEMP5 = job==X10_TEMP3;
		if(X10_TEMP5) {
			final int X10_TEMP6 = (1);
			final boolean X10_TEMP8 = nm1>=X10_TEMP6;
			if(X10_TEMP8) {
				final int X10_TEMP12 = (0);
				final int X10_TEMP10 = (1);
				final int X10_TEMP13 = (nm1 - X10_TEMP10);
				Region1 tempr = Program.createNewRegion1R(X10_TEMP12, X10_TEMP13);
				final place X10_TEMP15 = (here);
				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP15);
				final Region1 RX10_TEMP2 = temprDist.dReg;
				final int RX10_TEMP5 = 1;
				int RX10_TEMP3 = RX10_TEMP2.regSize;
				RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5;
				final region(:rank==1) RX10_TEMP4 = [0 : RX10_TEMP3];
				for(point(:rank==1) RX10_TEMP0:RX10_TEMP4) {
					final int RX10_TEMP6 = RX10_TEMP0[0];
					final Point1 RX10_TEMP1 = Program.regionOrdinalPoint1(RX10_TEMP2, RX10_TEMP6);
					final int k = RX10_TEMP1.f0;
					final Point1 RX10_TEMP7 = new Point1(k);
					final Dist1 RX10_TEMP8 = ipvt.distValue;
					final Region1 RX10_TEMP9 = RX10_TEMP8.dReg;
					final int RX10_TEMP10 = Program.searchPointInRegion1(RX10_TEMP9, RX10_TEMP7);
					final int RX10_TEMP11 = 0;
					final boolean RX10_TEMP12 = RX10_TEMP10<RX10_TEMP11;
					if (RX10_TEMP12) {
						String RX10_TEMP13 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP13);
					}
					final place RX10_TEMP14 = Program.getPlaceFromDist1(RX10_TEMP8, RX10_TEMP10);
					final place RX10_TEMP16 = here;
					final boolean RX10_TEMP17 = RX10_TEMP14!=RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP15 = "Bad place access for array ipvt";
						throw new RuntimeException(RX10_TEMP15);
					}
					final int RX10_TEMP18 = Program.getRefArrayValue1int(ipvt, RX10_TEMP10);
					final int l = (RX10_TEMP18);
					final int X10_TEMP22 = (0);
					final Point2 RX10_TEMP19 = new Point2(X10_TEMP22, l);
					final Dist2 RX10_TEMP20 = b.distValue;
					final Region2 RX10_TEMP21 = RX10_TEMP20.dReg;
					final int RX10_TEMP22 = Program.searchPointInRegion2(RX10_TEMP21, RX10_TEMP19);
					final int RX10_TEMP23 = 0;
					final boolean RX10_TEMP24 = RX10_TEMP22<RX10_TEMP23;
					if (RX10_TEMP24) {
						String RX10_TEMP25 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP25);
					}
					final place RX10_TEMP26 = Program.getPlaceFromDist2(RX10_TEMP20, RX10_TEMP22);
					final place RX10_TEMP28 = here;
					final boolean RX10_TEMP29 = RX10_TEMP26!=RX10_TEMP28;
					if (RX10_TEMP29) {
						String RX10_TEMP27 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP27);
					}
					final double RX10_TEMP30 = Program.getRefArrayValue2double(b, RX10_TEMP22);
					double t = (RX10_TEMP30);
					final boolean X10_TEMP25 = l!=k;
					if(X10_TEMP25) {
						final int X10_TEMP28 = (0);
						final int X10_TEMP31 = (0);
						final Point2 RX10_TEMP31 = new Point2(X10_TEMP31, k);
						final Dist2 RX10_TEMP32 = b.distValue;
						final Region2 RX10_TEMP33 = RX10_TEMP32.dReg;
						final int RX10_TEMP34 = Program.searchPointInRegion2(RX10_TEMP33, RX10_TEMP31);
						final int RX10_TEMP35 = 0;
						final boolean RX10_TEMP36 = RX10_TEMP34<RX10_TEMP35;
						if (RX10_TEMP36) {
							String RX10_TEMP37 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP37);
						}
						final place RX10_TEMP38 = Program.getPlaceFromDist2(RX10_TEMP32, RX10_TEMP34);
						final place RX10_TEMP40 = here;
						final boolean RX10_TEMP41 = RX10_TEMP38!=RX10_TEMP40;
						if (RX10_TEMP41) {
							String RX10_TEMP39 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP39);
						}
						final double RX10_TEMP42 = Program.getRefArrayValue2double(b, RX10_TEMP34);
						final double X10_TEMP34 = (RX10_TEMP42);
						final double X10_TEMP35 = (X10_TEMP34);
						final Point2 RX10_TEMP43 = new Point2(X10_TEMP28, l);
						final Dist2 RX10_TEMP44 = b.distValue;
						final Region2 RX10_TEMP45 = RX10_TEMP44.dReg;
						final int RX10_TEMP46 = Program.searchPointInRegion2(RX10_TEMP45, RX10_TEMP43);
						final int RX10_TEMP47 = 0;
						final boolean RX10_TEMP48 = RX10_TEMP46<RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP49 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP49);
						}
						final place RX10_TEMP50 = Program.getPlaceFromDist2(RX10_TEMP44, RX10_TEMP46);
						final place RX10_TEMP52 = here;
						final boolean RX10_TEMP53 = RX10_TEMP50!=RX10_TEMP52;
						if (RX10_TEMP53) {
							String RX10_TEMP51 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP51);
						}
						Program.setRefArrayValue2double(b, RX10_TEMP46, X10_TEMP35);
						final int X10_TEMP38 = (0);
						final double X10_TEMP41 = (t);
						final Point2 RX10_TEMP54 = new Point2(X10_TEMP38, k);
						final Dist2 RX10_TEMP55 = b.distValue;
						final Region2 RX10_TEMP56 = RX10_TEMP55.dReg;
						final int RX10_TEMP57 = Program.searchPointInRegion2(RX10_TEMP56, RX10_TEMP54);
						final int RX10_TEMP58 = 0;
						final boolean RX10_TEMP59 = RX10_TEMP57<RX10_TEMP58;
						if (RX10_TEMP59) {
							String RX10_TEMP60 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP60);
						}
						final place RX10_TEMP61 = Program.getPlaceFromDist2(RX10_TEMP55, RX10_TEMP57);
						final place RX10_TEMP63 = here;
						final boolean RX10_TEMP64 = RX10_TEMP61!=RX10_TEMP63;
						if (RX10_TEMP64) {
							String RX10_TEMP62 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP62);
						}
						Program.setRefArrayValue2double(b, RX10_TEMP57, X10_TEMP41);
					}
					final int X10_TEMP42 = (1);
					final int kp1 = (k + X10_TEMP42);
					final int X10_TEMP45 = (kp1);
					final int X10_TEMP56 = (n - X10_TEMP45);
					final int X10_TEMP57 = (1);
					final int X10_TEMP58 = (0);
					final int X10_TEMP59 = (1);
					Program.Linpack_daxpy(X10_TEMP0, X10_TEMP56, t, a, k, kp1, X10_TEMP57, b, X10_TEMP58, kp1, X10_TEMP59);
				}
			}
			final int X10_TEMP63 = (0);
			final int X10_TEMP61 = (1);
			final int X10_TEMP64 = (n - X10_TEMP61);
			Region1 tempr = Program.createNewRegion1R(X10_TEMP63, X10_TEMP64);
			final place X10_TEMP66 = (here);
			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP66);
			final Region1 RX10_TEMP67 = temprDist.dReg;
			final int RX10_TEMP70 = 1;
			int RX10_TEMP68 = RX10_TEMP67.regSize;
			RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70;
			final region(:rank==1) RX10_TEMP69 = [0 : RX10_TEMP68];
			for(point(:rank==1) RX10_TEMP65:RX10_TEMP69) {
				final int RX10_TEMP71 = RX10_TEMP65[0];
				final Point1 RX10_TEMP66 = Program.regionOrdinalPoint1(RX10_TEMP67, RX10_TEMP71);
				final int kb = RX10_TEMP66.f0;
				final int X10_TEMP69 = (1);
				final int X10_TEMP71 = (kb + X10_TEMP69);
				final int k = (n - X10_TEMP71);
				final int X10_TEMP75 = (0);
				final int X10_TEMP78 = (0);
				final Point2 RX10_TEMP72 = new Point2(X10_TEMP78, k);
				final Dist2 RX10_TEMP73 = b.distValue;
				final Region2 RX10_TEMP74 = RX10_TEMP73.dReg;
				final int RX10_TEMP75 = Program.searchPointInRegion2(RX10_TEMP74, RX10_TEMP72);
				final int RX10_TEMP76 = 0;
				final boolean RX10_TEMP77 = RX10_TEMP75<RX10_TEMP76;
				if (RX10_TEMP77) {
					String RX10_TEMP78 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP78);
				}
				final place RX10_TEMP79 = Program.getPlaceFromDist2(RX10_TEMP73, RX10_TEMP75);
				final place RX10_TEMP81 = here;
				final boolean RX10_TEMP82 = RX10_TEMP79!=RX10_TEMP81;
				if (RX10_TEMP82) {
					String RX10_TEMP80 = "Bad place access for array b";
					throw new RuntimeException(RX10_TEMP80);
				}
				final double RX10_TEMP83 = Program.getRefArrayValue2double(b, RX10_TEMP75);
				final double X10_TEMP82 = (RX10_TEMP83);
				final double X10_TEMP83 = (Program.Linpack_read(X10_TEMP0, a, k, k));
				final double X10_TEMP86 = (X10_TEMP82 / X10_TEMP83);
				final double X10_TEMP87 = (X10_TEMP86);
				final Point2 RX10_TEMP84 = new Point2(X10_TEMP75, k);
				final Dist2 RX10_TEMP85 = b.distValue;
				final Region2 RX10_TEMP86 = RX10_TEMP85.dReg;
				final int RX10_TEMP87 = Program.searchPointInRegion2(RX10_TEMP86, RX10_TEMP84);
				final int RX10_TEMP88 = 0;
				final boolean RX10_TEMP89 = RX10_TEMP87<RX10_TEMP88;
				if (RX10_TEMP89) {
					String RX10_TEMP90 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP90);
				}
				final place RX10_TEMP91 = Program.getPlaceFromDist2(RX10_TEMP85, RX10_TEMP87);
				final place RX10_TEMP93 = here;
				final boolean RX10_TEMP94 = RX10_TEMP91!=RX10_TEMP93;
				if (RX10_TEMP94) {
					String RX10_TEMP92 = "Bad place access for array b";
					throw new RuntimeException(RX10_TEMP92);
				}
				Program.setRefArrayValue2double(b, RX10_TEMP87, X10_TEMP87);
				final int X10_TEMP90 = (0);
				final Point2 RX10_TEMP95 = new Point2(X10_TEMP90, k);
				final Dist2 RX10_TEMP96 = b.distValue;
				final Region2 RX10_TEMP97 = RX10_TEMP96.dReg;
				final int RX10_TEMP98 = Program.searchPointInRegion2(RX10_TEMP97, RX10_TEMP95);
				final int RX10_TEMP99 = 0;
				final boolean RX10_TEMP100 = RX10_TEMP98<RX10_TEMP99;
				if (RX10_TEMP100) {
					String RX10_TEMP101 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP101);
				}
				final place RX10_TEMP102 = Program.getPlaceFromDist2(RX10_TEMP96, RX10_TEMP98);
				final place RX10_TEMP104 = here;
				final boolean RX10_TEMP105 = RX10_TEMP102!=RX10_TEMP104;
				if (RX10_TEMP105) {
					String RX10_TEMP103 = "Bad place access for array b";
					throw new RuntimeException(RX10_TEMP103);
				}
				final double RX10_TEMP106 = Program.getRefArrayValue2double(b, RX10_TEMP98);
				final double X10_TEMP91 = (RX10_TEMP106);
				final int X10_TEMP92 = 0;
				double t = (X10_TEMP92 - X10_TEMP91);
				final int X10_TEMP104 = (0);
				final int X10_TEMP105 = (1);
				final int X10_TEMP106 = (0);
				final int X10_TEMP107 = (0);
				final int X10_TEMP108 = (1);
				Program.Linpack_daxpy(X10_TEMP0, k, t, a, k, X10_TEMP104, X10_TEMP105, b, X10_TEMP106, X10_TEMP107, X10_TEMP108);
			}
		}
		else {
			final int X10_TEMP112 = (0);
			final int X10_TEMP110 = (1);
			final int X10_TEMP113 = (n - X10_TEMP110);
			Region1 tempr = Program.createNewRegion1R(X10_TEMP112, X10_TEMP113);
			final place X10_TEMP115 = (here);
			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP115);
			final Region1 RX10_TEMP109 = temprDist.dReg;
			final int RX10_TEMP112 = 1;
			int RX10_TEMP110 = RX10_TEMP109.regSize;
			RX10_TEMP110 = RX10_TEMP110 - RX10_TEMP112;
			final region(:rank==1) RX10_TEMP111 = [0 : RX10_TEMP110];
			for(point(:rank==1) RX10_TEMP107:RX10_TEMP111) {
				final int RX10_TEMP113 = RX10_TEMP107[0];
				final Point1 RX10_TEMP108 = Program.regionOrdinalPoint1(RX10_TEMP109, RX10_TEMP113);
				final int k = RX10_TEMP108.f0;
				final int X10_TEMP127 = (0);
				final int X10_TEMP128 = (1);
				final int X10_TEMP129 = (0);
				final int X10_TEMP130 = (0);
				final int X10_TEMP131 = (1);
				double t = (Program.Linpack_ddot(X10_TEMP0, k, a, k, X10_TEMP127, X10_TEMP128, b, X10_TEMP129, X10_TEMP130, X10_TEMP131));
				final int X10_TEMP135 = (0);
				final int X10_TEMP138 = (0);
				final Point2 RX10_TEMP114 = new Point2(X10_TEMP138, k);
				final Dist2 RX10_TEMP115 = b.distValue;
				final Region2 RX10_TEMP116 = RX10_TEMP115.dReg;
				final int RX10_TEMP117 = Program.searchPointInRegion2(RX10_TEMP116, RX10_TEMP114);
				final int RX10_TEMP118 = 0;
				final boolean RX10_TEMP119 = RX10_TEMP117<RX10_TEMP118;
				if (RX10_TEMP119) {
					String RX10_TEMP120 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP120);
				}
				final place RX10_TEMP121 = Program.getPlaceFromDist2(RX10_TEMP115, RX10_TEMP117);
				final place RX10_TEMP123 = here;
				final boolean RX10_TEMP124 = RX10_TEMP121!=RX10_TEMP123;
				if (RX10_TEMP124) {
					String RX10_TEMP122 = "Bad place access for array b";
					throw new RuntimeException(RX10_TEMP122);
				}
				final double RX10_TEMP125 = Program.getRefArrayValue2double(b, RX10_TEMP117);
				final double X10_TEMP139 = (RX10_TEMP125);
				final double X10_TEMP141 = (X10_TEMP139 - t);
				final Point2 RX10_TEMP126 = new Point2(k, k);
				final Dist2 RX10_TEMP127 = a.distValue;
				final Region2 RX10_TEMP128 = RX10_TEMP127.dReg;
				final int RX10_TEMP129 = Program.searchPointInRegion2(RX10_TEMP128, RX10_TEMP126);
				final int RX10_TEMP130 = 0;
				final boolean RX10_TEMP131 = RX10_TEMP129<RX10_TEMP130;
				if (RX10_TEMP131) {
					String RX10_TEMP132 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP132);
				}
				final place RX10_TEMP133 = Program.getPlaceFromDist2(RX10_TEMP127, RX10_TEMP129);
				final place RX10_TEMP135 = here;
				final boolean RX10_TEMP136 = RX10_TEMP133!=RX10_TEMP135;
				if (RX10_TEMP136) {
					String RX10_TEMP134 = "Bad place access for array a";
					throw new RuntimeException(RX10_TEMP134);
				}
				final double RX10_TEMP137 = Program.getRefArrayValue2double(a, RX10_TEMP129);
				final double X10_TEMP144 = (RX10_TEMP137);
				final double X10_TEMP147 = (X10_TEMP141 / X10_TEMP144);
				final double X10_TEMP148 = (X10_TEMP147);
				final Point2 RX10_TEMP138 = new Point2(X10_TEMP135, k);
				final Dist2 RX10_TEMP139 = b.distValue;
				final Region2 RX10_TEMP140 = RX10_TEMP139.dReg;
				final int RX10_TEMP141 = Program.searchPointInRegion2(RX10_TEMP140, RX10_TEMP138);
				final int RX10_TEMP142 = 0;
				final boolean RX10_TEMP143 = RX10_TEMP141<RX10_TEMP142;
				if (RX10_TEMP143) {
					String RX10_TEMP144 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP144);
				}
				final place RX10_TEMP145 = Program.getPlaceFromDist2(RX10_TEMP139, RX10_TEMP141);
				final place RX10_TEMP147 = here;
				final boolean RX10_TEMP148 = RX10_TEMP145!=RX10_TEMP147;
				if (RX10_TEMP148) {
					String RX10_TEMP146 = "Bad place access for array b";
					throw new RuntimeException(RX10_TEMP146);
				}
				Program.setRefArrayValue2double(b, RX10_TEMP141, X10_TEMP148);
			}
			final int X10_TEMP149 = (1);
			final boolean X10_TEMP151 = nm1>=X10_TEMP149;
			if(X10_TEMP151) {
				final int X10_TEMP155 = (1);
				final int X10_TEMP153 = (1);
				final int X10_TEMP156 = (nm1 - X10_TEMP153);
				Region1 temprnm1 = Program.createNewRegion1R(X10_TEMP155, X10_TEMP156);
				final place X10_TEMP158 = (here);
				Dist1 temprnm1Dist = Program.getPlaceDist1(temprnm1, X10_TEMP158);
				final Region1 RX10_TEMP151 = temprnm1Dist.dReg;
				final int RX10_TEMP154 = 1;
				int RX10_TEMP152 = RX10_TEMP151.regSize;
				RX10_TEMP152 = RX10_TEMP152 - RX10_TEMP154;
				final region(:rank==1) RX10_TEMP153 = [0 : RX10_TEMP152];
				for(point(:rank==1) RX10_TEMP149:RX10_TEMP153) {
					final int RX10_TEMP155 = RX10_TEMP149[0];
					final Point1 RX10_TEMP150 = Program.regionOrdinalPoint1(RX10_TEMP151, RX10_TEMP155);
					final int kb = RX10_TEMP150.f0;
					final int X10_TEMP161 = (1);
					final int X10_TEMP163 = (kb + X10_TEMP161);
					final int k = (n - X10_TEMP163);
					final int X10_TEMP165 = (1);
					final int kp1 = (k + X10_TEMP165);
					final int X10_TEMP169 = (0);
					final int X10_TEMP172 = (0);
					final Point2 RX10_TEMP156 = new Point2(X10_TEMP172, k);
					final Dist2 RX10_TEMP157 = b.distValue;
					final Region2 RX10_TEMP158 = RX10_TEMP157.dReg;
					final int RX10_TEMP159 = Program.searchPointInRegion2(RX10_TEMP158, RX10_TEMP156);
					final int RX10_TEMP160 = 0;
					final boolean RX10_TEMP161 = RX10_TEMP159<RX10_TEMP160;
					if (RX10_TEMP161) {
						String RX10_TEMP162 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP162);
					}
					final place RX10_TEMP163 = Program.getPlaceFromDist2(RX10_TEMP157, RX10_TEMP159);
					final place RX10_TEMP165 = here;
					final boolean RX10_TEMP166 = RX10_TEMP163!=RX10_TEMP165;
					if (RX10_TEMP166) {
						String RX10_TEMP164 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP164);
					}
					final double RX10_TEMP167 = Program.getRefArrayValue2double(b, RX10_TEMP159);
					final double X10_TEMP188 = (RX10_TEMP167);
					final int X10_TEMP174 = (kp1);
					final int X10_TEMP184 = (n - X10_TEMP174);
					final int X10_TEMP185 = (1);
					final int X10_TEMP186 = (0);
					final int X10_TEMP187 = (1);
					final double X10_TEMP189 = (Program.Linpack_ddot(X10_TEMP0, X10_TEMP184, a, k, kp1, X10_TEMP185, b, X10_TEMP186, kp1, X10_TEMP187));
					final double X10_TEMP192 = (X10_TEMP188 + X10_TEMP189);
					final double X10_TEMP193 = (X10_TEMP192);
					final Point2 RX10_TEMP168 = new Point2(X10_TEMP169, k);
					final Dist2 RX10_TEMP169 = b.distValue;
					final Region2 RX10_TEMP170 = RX10_TEMP169.dReg;
					final int RX10_TEMP171 = Program.searchPointInRegion2(RX10_TEMP170, RX10_TEMP168);
					final int RX10_TEMP172 = 0;
					final boolean RX10_TEMP173 = RX10_TEMP171<RX10_TEMP172;
					if (RX10_TEMP173) {
						String RX10_TEMP174 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP174);
					}
					final place RX10_TEMP175 = Program.getPlaceFromDist2(RX10_TEMP169, RX10_TEMP171);
					final place RX10_TEMP177 = here;
					final boolean RX10_TEMP178 = RX10_TEMP175!=RX10_TEMP177;
					if (RX10_TEMP178) {
						String RX10_TEMP176 = "Bad place access for array b";
						throw new RuntimeException(RX10_TEMP176);
					}
					Program.setRefArrayValue2double(b, RX10_TEMP171, X10_TEMP193);
					final Point1 RX10_TEMP179 = new Point1(k);
					final Dist1 RX10_TEMP180 = ipvt.distValue;
					final Region1 RX10_TEMP181 = RX10_TEMP180.dReg;
					final int RX10_TEMP182 = Program.searchPointInRegion1(RX10_TEMP181, RX10_TEMP179);
					final int RX10_TEMP183 = 0;
					final boolean RX10_TEMP184 = RX10_TEMP182<RX10_TEMP183;
					if (RX10_TEMP184) {
						String RX10_TEMP185 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP185);
					}
					final place RX10_TEMP186 = Program.getPlaceFromDist1(RX10_TEMP180, RX10_TEMP182);
					final place RX10_TEMP188 = here;
					final boolean RX10_TEMP189 = RX10_TEMP186!=RX10_TEMP188;
					if (RX10_TEMP189) {
						String RX10_TEMP187 = "Bad place access for array ipvt";
						throw new RuntimeException(RX10_TEMP187);
					}
					final int RX10_TEMP190 = Program.getRefArrayValue1int(ipvt, RX10_TEMP182);
					final int l = (RX10_TEMP190);
					final boolean X10_TEMP197 = l!=k;
					if(X10_TEMP197) {
						final int X10_TEMP200 = (0);
						final Point2 RX10_TEMP191 = new Point2(X10_TEMP200, l);
						final Dist2 RX10_TEMP192 = b.distValue;
						final Region2 RX10_TEMP193 = RX10_TEMP192.dReg;
						final int RX10_TEMP194 = Program.searchPointInRegion2(RX10_TEMP193, RX10_TEMP191);
						final int RX10_TEMP195 = 0;
						final boolean RX10_TEMP196 = RX10_TEMP194<RX10_TEMP195;
						if (RX10_TEMP196) {
							String RX10_TEMP197 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP197);
						}
						final place RX10_TEMP198 = Program.getPlaceFromDist2(RX10_TEMP192, RX10_TEMP194);
						final place RX10_TEMP200 = here;
						final boolean RX10_TEMP201 = RX10_TEMP198!=RX10_TEMP200;
						if (RX10_TEMP201) {
							String RX10_TEMP199 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP199);
						}
						final double RX10_TEMP202 = Program.getRefArrayValue2double(b, RX10_TEMP194);
						double t = (RX10_TEMP202);
						final int X10_TEMP204 = (0);
						final int X10_TEMP207 = (0);
						final Point2 RX10_TEMP203 = new Point2(X10_TEMP207, k);
						final Dist2 RX10_TEMP204 = b.distValue;
						final Region2 RX10_TEMP205 = RX10_TEMP204.dReg;
						final int RX10_TEMP206 = Program.searchPointInRegion2(RX10_TEMP205, RX10_TEMP203);
						final int RX10_TEMP207 = 0;
						final boolean RX10_TEMP208 = RX10_TEMP206<RX10_TEMP207;
						if (RX10_TEMP208) {
							String RX10_TEMP209 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP209);
						}
						final place RX10_TEMP210 = Program.getPlaceFromDist2(RX10_TEMP204, RX10_TEMP206);
						final place RX10_TEMP212 = here;
						final boolean RX10_TEMP213 = RX10_TEMP210!=RX10_TEMP212;
						if (RX10_TEMP213) {
							String RX10_TEMP211 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP211);
						}
						final double RX10_TEMP214 = Program.getRefArrayValue2double(b, RX10_TEMP206);
						final double X10_TEMP210 = (RX10_TEMP214);
						final double X10_TEMP211 = (X10_TEMP210);
						final Point2 RX10_TEMP215 = new Point2(X10_TEMP204, l);
						final Dist2 RX10_TEMP216 = b.distValue;
						final Region2 RX10_TEMP217 = RX10_TEMP216.dReg;
						final int RX10_TEMP218 = Program.searchPointInRegion2(RX10_TEMP217, RX10_TEMP215);
						final int RX10_TEMP219 = 0;
						final boolean RX10_TEMP220 = RX10_TEMP218<RX10_TEMP219;
						if (RX10_TEMP220) {
							String RX10_TEMP221 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP221);
						}
						final place RX10_TEMP222 = Program.getPlaceFromDist2(RX10_TEMP216, RX10_TEMP218);
						final place RX10_TEMP224 = here;
						final boolean RX10_TEMP225 = RX10_TEMP222!=RX10_TEMP224;
						if (RX10_TEMP225) {
							String RX10_TEMP223 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP223);
						}
						Program.setRefArrayValue2double(b, RX10_TEMP218, X10_TEMP211);
						final int X10_TEMP214 = (0);
						final double X10_TEMP217 = (t);
						final Point2 RX10_TEMP226 = new Point2(X10_TEMP214, k);
						final Dist2 RX10_TEMP227 = b.distValue;
						final Region2 RX10_TEMP228 = RX10_TEMP227.dReg;
						final int RX10_TEMP229 = Program.searchPointInRegion2(RX10_TEMP228, RX10_TEMP226);
						final int RX10_TEMP230 = 0;
						final boolean RX10_TEMP231 = RX10_TEMP229<RX10_TEMP230;
						if (RX10_TEMP231) {
							String RX10_TEMP232 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP232);
						}
						final place RX10_TEMP233 = Program.getPlaceFromDist2(RX10_TEMP227, RX10_TEMP229);
						final place RX10_TEMP235 = here;
						final boolean RX10_TEMP236 = RX10_TEMP233!=RX10_TEMP235;
						if (RX10_TEMP236) {
							String RX10_TEMP234 = "Bad place access for array b";
							throw new RuntimeException(RX10_TEMP234);
						}
						Program.setRefArrayValue2double(b, RX10_TEMP229, X10_TEMP217);
					}
				}
			}
		}
	}

	public static void Linpack_daxpy(final Linpack X10_TEMP0, final int n, final double da, final doubleRefArray2 dx, final int dxCol, final int dx_off, final int incx, final doubleRefArray2 dy, final int dyCol, final int dy_off, final int incy) {
		final int X10_TEMP1 = (0);
		final boolean X10_TEMP3 = (n>X10_TEMP1);
		final int X10_TEMP4 = (0);
		final boolean X10_TEMP6 = (da!=X10_TEMP4);
		final boolean X10_TEMP8 = X10_TEMP3&&X10_TEMP6;
		if(X10_TEMP8) {
			final int X10_TEMP9 = (1);
			final boolean X10_TEMP11 = (incx!=X10_TEMP9);
			final int X10_TEMP10 = (1);
			final boolean X10_TEMP12 = (incy!=X10_TEMP10);
			final boolean X10_TEMP14 = X10_TEMP11||X10_TEMP12;
			if(X10_TEMP14) {
				int ix = (0);
				int iy = (0);
				final int X10_TEMP17 = (0);
				final boolean X10_TEMP19 = incx<X10_TEMP17;
				if(X10_TEMP19) {
					final int X10_TEMP20 = 0;
					final int X10_TEMP21 = (X10_TEMP20 - n);
					final int X10_TEMP22 = (1);
					final int X10_TEMP24 = (X10_TEMP21 + X10_TEMP22);
					final int X10_TEMP26 = (X10_TEMP24 * incx);
					ix = (X10_TEMP26);
				}
				final int X10_TEMP27 = (0);
				final boolean X10_TEMP29 = incy<X10_TEMP27;
				if(X10_TEMP29) {
					final int X10_TEMP30 = 0;
					final int X10_TEMP31 = (X10_TEMP30 - n);
					final int X10_TEMP32 = (1);
					final int X10_TEMP34 = (X10_TEMP31 + X10_TEMP32);
					final int X10_TEMP36 = (X10_TEMP34 * incy);
					iy = (X10_TEMP36);
				}
				final int X10_TEMP40 = (0);
				final int X10_TEMP38 = (1);
				final int X10_TEMP41 = (n - X10_TEMP38);
				Region1 tempr = Program.createNewRegion1R(X10_TEMP40, X10_TEMP41);
				final place X10_TEMP43 = (here);
				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP43);
				final Region1 RX10_TEMP1 = temprDist.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final region(:rank==1) RX10_TEMP3 = [0 : RX10_TEMP2];
				for(point(:rank==1) RX10_TEMP0:RX10_TEMP3) {
					final int RX10_TEMP5 = RX10_TEMP0[0];
					final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5);
					final int X10_TEMP48 = (iy + dy_off);
					final int X10_TEMP51 = (iy + dy_off);
					final Point2 RX10_TEMP6 = new Point2(dyCol, X10_TEMP51);
					final Dist2 RX10_TEMP7 = dy.distValue;
					final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;
					final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, RX10_TEMP6);
					final int RX10_TEMP10 = 0;
					final boolean RX10_TEMP11 = RX10_TEMP9<RX10_TEMP10;
					if (RX10_TEMP11) {
						String RX10_TEMP12 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP12);
					}
					final place RX10_TEMP13 = Program.getPlaceFromDist2(RX10_TEMP7, RX10_TEMP9);
					final place RX10_TEMP15 = here;
					final boolean RX10_TEMP16 = RX10_TEMP13!=RX10_TEMP15;
					if (RX10_TEMP16) {
						String RX10_TEMP14 = "Bad place access for array dy";
						throw new RuntimeException(RX10_TEMP14);
					}
					final double RX10_TEMP17 = Program.getRefArrayValue2double(dy, RX10_TEMP9);
					final double X10_TEMP59 = (RX10_TEMP17);
					final int X10_TEMP55 = (ix + dx_off);
					final double X10_TEMP56 = (Program.Linpack_read(X10_TEMP0, dx, dxCol, X10_TEMP55));
					final double X10_TEMP58 = (da * X10_TEMP56);
					final double X10_TEMP62 = (X10_TEMP59 + X10_TEMP58);
					final double X10_TEMP63 = (X10_TEMP62);
					final Point2 RX10_TEMP18 = new Point2(dyCol, X10_TEMP48);
					final Dist2 RX10_TEMP19 = dy.distValue;
					final Region2 RX10_TEMP20 = RX10_TEMP19.dReg;
					final int RX10_TEMP21 = Program.searchPointInRegion2(RX10_TEMP20, RX10_TEMP18);
					final int RX10_TEMP22 = 0;
					final boolean RX10_TEMP23 = RX10_TEMP21<RX10_TEMP22;
					if (RX10_TEMP23) {
						String RX10_TEMP24 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP24);
					}
					final place RX10_TEMP25 = Program.getPlaceFromDist2(RX10_TEMP19, RX10_TEMP21);
					final place RX10_TEMP27 = here;
					final boolean RX10_TEMP28 = RX10_TEMP25!=RX10_TEMP27;
					if (RX10_TEMP28) {
						String RX10_TEMP26 = "Bad place access for array dy";
						throw new RuntimeException(RX10_TEMP26);
					}
					Program.setRefArrayValue2double(dy, RX10_TEMP21, X10_TEMP63);
					final int X10_TEMP65 = (ix + incx);
					ix = (X10_TEMP65);
					final int X10_TEMP67 = (iy + incy);
					iy = (X10_TEMP67);
				}
				return;
			}
			final int X10_TEMP71 = (0);
			final int X10_TEMP69 = (1);
			final int X10_TEMP72 = (n - X10_TEMP69);
			Region1 tempr = Program.createNewRegion1R(X10_TEMP71, X10_TEMP72);
			final place X10_TEMP74 = (here);
			Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP74);
			final Region1 RX10_TEMP31 = temprDist.dReg;
			final int RX10_TEMP34 = 1;
			int RX10_TEMP32 = RX10_TEMP31.regSize;
			RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34;
			final region(:rank==1) RX10_TEMP33 = [0 : RX10_TEMP32];
			for(point(:rank==1) RX10_TEMP29:RX10_TEMP33) {
				final int RX10_TEMP35 = RX10_TEMP29[0];
				final Point1 RX10_TEMP30 = Program.regionOrdinalPoint1(RX10_TEMP31, RX10_TEMP35);
				final int i = RX10_TEMP30.f0;
				final int X10_TEMP79 = (i + dy_off);
				final int X10_TEMP82 = (i + dy_off);
				final Point2 RX10_TEMP36 = new Point2(dyCol, X10_TEMP82);
				final Dist2 RX10_TEMP37 = dy.distValue;
				final Region2 RX10_TEMP38 = RX10_TEMP37.dReg;
				final int RX10_TEMP39 = Program.searchPointInRegion2(RX10_TEMP38, RX10_TEMP36);
				final int RX10_TEMP40 = 0;
				final boolean RX10_TEMP41 = RX10_TEMP39<RX10_TEMP40;
				if (RX10_TEMP41) {
					String RX10_TEMP42 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP42);
				}
				final place RX10_TEMP43 = Program.getPlaceFromDist2(RX10_TEMP37, RX10_TEMP39);
				final place RX10_TEMP45 = here;
				final boolean RX10_TEMP46 = RX10_TEMP43!=RX10_TEMP45;
				if (RX10_TEMP46) {
					String RX10_TEMP44 = "Bad place access for array dy";
					throw new RuntimeException(RX10_TEMP44);
				}
				final double RX10_TEMP47 = Program.getRefArrayValue2double(dy, RX10_TEMP39);
				final double X10_TEMP90 = (RX10_TEMP47);
				final int X10_TEMP86 = (i + dx_off);
				final double X10_TEMP87 = (Program.Linpack_read(X10_TEMP0, dx, dxCol, X10_TEMP86));
				final double X10_TEMP89 = (da * X10_TEMP87);
				final double X10_TEMP93 = (X10_TEMP90 + X10_TEMP89);
				final double X10_TEMP94 = (X10_TEMP93);
				final Point2 RX10_TEMP48 = new Point2(dyCol, X10_TEMP79);
				final Dist2 RX10_TEMP49 = dy.distValue;
				final Region2 RX10_TEMP50 = RX10_TEMP49.dReg;
				final int RX10_TEMP51 = Program.searchPointInRegion2(RX10_TEMP50, RX10_TEMP48);
				final int RX10_TEMP52 = 0;
				final boolean RX10_TEMP53 = RX10_TEMP51<RX10_TEMP52;
				if (RX10_TEMP53) {
					String RX10_TEMP54 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP54);
				}
				final place RX10_TEMP55 = Program.getPlaceFromDist2(RX10_TEMP49, RX10_TEMP51);
				final place RX10_TEMP57 = here;
				final boolean RX10_TEMP58 = RX10_TEMP55!=RX10_TEMP57;
				if (RX10_TEMP58) {
					String RX10_TEMP56 = "Bad place access for array dy";
					throw new RuntimeException(RX10_TEMP56);
				}
				Program.setRefArrayValue2double(dy, RX10_TEMP51, X10_TEMP94);
			}
		}
	}

	public static double Linpack_ddot(final Linpack X10_TEMP0, final int n, final doubleRefArray2 dx, final int dxCol, final int dx_off, final int incx, final doubleRefArray2 dy, final int dyCol, final int dy_off, final int incy) {
		double dtemp = (0);
		final int X10_TEMP2 = (0);
		final boolean X10_TEMP4 = n>X10_TEMP2;
		if(X10_TEMP4) {
			final int X10_TEMP5 = (1);
			final boolean X10_TEMP7 = (incx!=X10_TEMP5);
			final int X10_TEMP6 = (1);
			final boolean X10_TEMP8 = (incy!=X10_TEMP6);
			final boolean X10_TEMP10 = X10_TEMP7||X10_TEMP8;
			if(X10_TEMP10) {
				int ix = (0);
				int iy = (0);
				final int X10_TEMP13 = (0);
				final boolean X10_TEMP15 = incx<X10_TEMP13;
				if(X10_TEMP15) {
					final int X10_TEMP16 = 0;
					final int X10_TEMP17 = (X10_TEMP16 - n);
					final int X10_TEMP18 = (1);
					final int X10_TEMP20 = (X10_TEMP17 + X10_TEMP18);
					final int X10_TEMP22 = (X10_TEMP20 * incx);
					ix = (X10_TEMP22);
				}
				final int X10_TEMP23 = (0);
				final boolean X10_TEMP25 = incy<X10_TEMP23;
				if(X10_TEMP25) {
					final int X10_TEMP26 = 0;
					final int X10_TEMP27 = (X10_TEMP26 - n);
					final int X10_TEMP28 = (1);
					final int X10_TEMP30 = (X10_TEMP27 + X10_TEMP28);
					final int X10_TEMP32 = (X10_TEMP30 * incy);
					iy = (X10_TEMP32);
				}
				final int X10_TEMP36 = (0);
				final int X10_TEMP34 = (1);
				final int X10_TEMP37 = (n - X10_TEMP34);
				Region1 tempr = Program.createNewRegion1R(X10_TEMP36, X10_TEMP37);
				final place X10_TEMP39 = (here);
				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP39);
				final Region1 RX10_TEMP1 = temprDist.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final region(:rank==1) RX10_TEMP3 = [0 : RX10_TEMP2];
				for(point(:rank==1) RX10_TEMP0:RX10_TEMP3) {
					final int RX10_TEMP5 = RX10_TEMP0[0];
					final Point1 i = Program.regionOrdinalPoint1(RX10_TEMP1, RX10_TEMP5);
					final int X10_TEMP44 = (ix + dx_off);
					final Point2 RX10_TEMP6 = new Point2(dxCol, X10_TEMP44);
					final Dist2 RX10_TEMP7 = dx.distValue;
					final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;
					final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, RX10_TEMP6);
					final int RX10_TEMP10 = 0;
					final boolean RX10_TEMP11 = RX10_TEMP9<RX10_TEMP10;
					if (RX10_TEMP11) {
						String RX10_TEMP12 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP12);
					}
					final place RX10_TEMP13 = Program.getPlaceFromDist2(RX10_TEMP7, RX10_TEMP9);
					final place RX10_TEMP15 = here;
					final boolean RX10_TEMP16 = RX10_TEMP13!=RX10_TEMP15;
					if (RX10_TEMP16) {
						String RX10_TEMP14 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP14);
					}
					final double RX10_TEMP17 = Program.getRefArrayValue2double(dx, RX10_TEMP9);
					final double X10_TEMP48 = (RX10_TEMP17);
					final int X10_TEMP47 = (iy + dy_off);
					final Point2 RX10_TEMP18 = new Point2(dyCol, X10_TEMP47);
					final Dist2 RX10_TEMP19 = dy.distValue;
					final Region2 RX10_TEMP20 = RX10_TEMP19.dReg;
					final int RX10_TEMP21 = Program.searchPointInRegion2(RX10_TEMP20, RX10_TEMP18);
					final int RX10_TEMP22 = 0;
					final boolean RX10_TEMP23 = RX10_TEMP21<RX10_TEMP22;
					if (RX10_TEMP23) {
						String RX10_TEMP24 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP24);
					}
					final place RX10_TEMP25 = Program.getPlaceFromDist2(RX10_TEMP19, RX10_TEMP21);
					final place RX10_TEMP27 = here;
					final boolean RX10_TEMP28 = RX10_TEMP25!=RX10_TEMP27;
					if (RX10_TEMP28) {
						String RX10_TEMP26 = "Bad place access for array dy";
						throw new RuntimeException(RX10_TEMP26);
					}
					final double RX10_TEMP29 = Program.getRefArrayValue2double(dy, RX10_TEMP21);
					final double X10_TEMP49 = (RX10_TEMP29);
					final double X10_TEMP51 = (X10_TEMP48 * X10_TEMP49);
					final double X10_TEMP53 = (dtemp + X10_TEMP51);
					dtemp = (X10_TEMP53);
					final int X10_TEMP55 = (ix + incx);
					ix = (X10_TEMP55);
					final int X10_TEMP57 = (iy + incy);
					iy = (X10_TEMP57);
				}
			}
			else {
				final int X10_TEMP61 = (0);
				final int X10_TEMP59 = (1);
				final int X10_TEMP62 = (n - X10_TEMP59);
				Region1 tempr = Program.createNewRegion1R(X10_TEMP61, X10_TEMP62);
				final place X10_TEMP64 = (here);
				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP64);
				final Region1 RX10_TEMP32 = temprDist.dReg;
				final int RX10_TEMP35 = 1;
				int RX10_TEMP33 = RX10_TEMP32.regSize;
				RX10_TEMP33 = RX10_TEMP33 - RX10_TEMP35;
				final region(:rank==1) RX10_TEMP34 = [0 : RX10_TEMP33];
				for(point(:rank==1) RX10_TEMP30:RX10_TEMP34) {
					final int RX10_TEMP36 = RX10_TEMP30[0];
					final Point1 RX10_TEMP31 = Program.regionOrdinalPoint1(RX10_TEMP32, RX10_TEMP36);
					final int i = RX10_TEMP31.f0;
					final int X10_TEMP69 = (i + dx_off);
					final Point2 RX10_TEMP37 = new Point2(dxCol, X10_TEMP69);
					final Dist2 RX10_TEMP38 = dx.distValue;
					final Region2 RX10_TEMP39 = RX10_TEMP38.dReg;
					final int RX10_TEMP40 = Program.searchPointInRegion2(RX10_TEMP39, RX10_TEMP37);
					final int RX10_TEMP41 = 0;
					final boolean RX10_TEMP42 = RX10_TEMP40<RX10_TEMP41;
					if (RX10_TEMP42) {
						String RX10_TEMP43 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP43);
					}
					final place RX10_TEMP44 = Program.getPlaceFromDist2(RX10_TEMP38, RX10_TEMP40);
					final place RX10_TEMP46 = here;
					final boolean RX10_TEMP47 = RX10_TEMP44!=RX10_TEMP46;
					if (RX10_TEMP47) {
						String RX10_TEMP45 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP45);
					}
					final double RX10_TEMP48 = Program.getRefArrayValue2double(dx, RX10_TEMP40);
					final double X10_TEMP73 = (RX10_TEMP48);
					final int X10_TEMP72 = (i + dy_off);
					final Point2 RX10_TEMP49 = new Point2(dyCol, X10_TEMP72);
					final Dist2 RX10_TEMP50 = dy.distValue;
					final Region2 RX10_TEMP51 = RX10_TEMP50.dReg;
					final int RX10_TEMP52 = Program.searchPointInRegion2(RX10_TEMP51, RX10_TEMP49);
					final int RX10_TEMP53 = 0;
					final boolean RX10_TEMP54 = RX10_TEMP52<RX10_TEMP53;
					if (RX10_TEMP54) {
						String RX10_TEMP55 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP55);
					}
					final place RX10_TEMP56 = Program.getPlaceFromDist2(RX10_TEMP50, RX10_TEMP52);
					final place RX10_TEMP58 = here;
					final boolean RX10_TEMP59 = RX10_TEMP56!=RX10_TEMP58;
					if (RX10_TEMP59) {
						String RX10_TEMP57 = "Bad place access for array dy";
						throw new RuntimeException(RX10_TEMP57);
					}
					final double RX10_TEMP60 = Program.getRefArrayValue2double(dy, RX10_TEMP52);
					final double X10_TEMP74 = (RX10_TEMP60);
					final double X10_TEMP75 = (X10_TEMP73 * X10_TEMP74);
					final double X10_TEMP77 = (dtemp + X10_TEMP75);
					dtemp = (X10_TEMP77);
				}
			}
		}
		return dtemp;
	}

	public static void Linpack_dscal(final Linpack X10_TEMP0, final int n, final double da, final doubleRefArray2 dx, final int currentCol, final int dx_off, final int incx) {
		final int X10_TEMP1 = (0);
		final boolean X10_TEMP3 = n>X10_TEMP1;
		if(X10_TEMP3) {
			final int X10_TEMP4 = (1);
			final boolean X10_TEMP6 = incx!=X10_TEMP4;
			if(X10_TEMP6) {
				final int nincx = (n * incx);
				int i = (0);
				boolean X10_TEMP11 = i<nincx;
				while(X10_TEMP11) {
					final int X10_TEMP14 = (i + dx_off);
					final int X10_TEMP17 = (i + dx_off);
					final Point2 RX10_TEMP0 = new Point2(currentCol, X10_TEMP17);
					final Dist2 RX10_TEMP1 = dx.distValue;
					final Region2 RX10_TEMP2 = RX10_TEMP1.dReg;
					final int RX10_TEMP3 = Program.searchPointInRegion2(RX10_TEMP2, RX10_TEMP0);
					final int RX10_TEMP4 = 0;
					final boolean RX10_TEMP5 = RX10_TEMP3<RX10_TEMP4;
					if (RX10_TEMP5) {
						String RX10_TEMP6 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP6);
					}
					final place RX10_TEMP7 = Program.getPlaceFromDist2(RX10_TEMP1, RX10_TEMP3);
					final place RX10_TEMP9 = here;
					final boolean RX10_TEMP10 = RX10_TEMP7!=RX10_TEMP9;
					if (RX10_TEMP10) {
						String RX10_TEMP8 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP8);
					}
					final double RX10_TEMP11 = Program.getRefArrayValue2double(dx, RX10_TEMP3);
					final double X10_TEMP18 = (RX10_TEMP11);
					final double X10_TEMP21 = (X10_TEMP18 * da);
					final double X10_TEMP22 = (X10_TEMP21);
					final Point2 RX10_TEMP12 = new Point2(currentCol, X10_TEMP14);
					final Dist2 RX10_TEMP13 = dx.distValue;
					final Region2 RX10_TEMP14 = RX10_TEMP13.dReg;
					final int RX10_TEMP15 = Program.searchPointInRegion2(RX10_TEMP14, RX10_TEMP12);
					final int RX10_TEMP16 = 0;
					final boolean RX10_TEMP17 = RX10_TEMP15<RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP18 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP18);
					}
					final place RX10_TEMP19 = Program.getPlaceFromDist2(RX10_TEMP13, RX10_TEMP15);
					final place RX10_TEMP21 = here;
					final boolean RX10_TEMP22 = RX10_TEMP19!=RX10_TEMP21;
					if (RX10_TEMP22) {
						String RX10_TEMP20 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP20);
					}
					Program.setRefArrayValue2double(dx, RX10_TEMP15, X10_TEMP22);
					final int X10_TEMP24 = (i + incx);
					i = (X10_TEMP24);
					X10_TEMP11 = i<nincx;
				}
			}
			else {
				final int X10_TEMP28 = (0);
				final int X10_TEMP26 = (1);
				final int X10_TEMP29 = (n - X10_TEMP26);
				Region1 tempr = Program.createNewRegion1R(X10_TEMP28, X10_TEMP29);
				final place X10_TEMP31 = (here);
				Dist1 temprDist = Program.getPlaceDist1(tempr, X10_TEMP31);
				final Region1 RX10_TEMP25 = temprDist.dReg;
				final int RX10_TEMP28 = 1;
				int RX10_TEMP26 = RX10_TEMP25.regSize;
				RX10_TEMP26 = RX10_TEMP26 - RX10_TEMP28;
				final region(:rank==1) RX10_TEMP27 = [0 : RX10_TEMP26];
				for(point(:rank==1) RX10_TEMP23:RX10_TEMP27) {
					final int RX10_TEMP29 = RX10_TEMP23[0];
					final Point1 RX10_TEMP24 = Program.regionOrdinalPoint1(RX10_TEMP25, RX10_TEMP29);
					final int i = RX10_TEMP24.f0;
					final int X10_TEMP36 = (i + dx_off);
					final int X10_TEMP39 = (i + dx_off);
					final Point2 RX10_TEMP30 = new Point2(currentCol, X10_TEMP39);
					final Dist2 RX10_TEMP31 = dx.distValue;
					final Region2 RX10_TEMP32 = RX10_TEMP31.dReg;
					final int RX10_TEMP33 = Program.searchPointInRegion2(RX10_TEMP32, RX10_TEMP30);
					final int RX10_TEMP34 = 0;
					final boolean RX10_TEMP35 = RX10_TEMP33<RX10_TEMP34;
					if (RX10_TEMP35) {
						String RX10_TEMP36 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP36);
					}
					final place RX10_TEMP37 = Program.getPlaceFromDist2(RX10_TEMP31, RX10_TEMP33);
					final place RX10_TEMP39 = here;
					final boolean RX10_TEMP40 = RX10_TEMP37!=RX10_TEMP39;
					if (RX10_TEMP40) {
						String RX10_TEMP38 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP38);
					}
					final double RX10_TEMP41 = Program.getRefArrayValue2double(dx, RX10_TEMP33);
					final double X10_TEMP40 = (RX10_TEMP41);
					final double X10_TEMP43 = (X10_TEMP40 * da);
					final double X10_TEMP44 = (X10_TEMP43);
					final Point2 RX10_TEMP42 = new Point2(currentCol, X10_TEMP36);
					final Dist2 RX10_TEMP43 = dx.distValue;
					final Region2 RX10_TEMP44 = RX10_TEMP43.dReg;
					final int RX10_TEMP45 = Program.searchPointInRegion2(RX10_TEMP44, RX10_TEMP42);
					final int RX10_TEMP46 = 0;
					final boolean RX10_TEMP47 = RX10_TEMP45<RX10_TEMP46;
					if (RX10_TEMP47) {
						String RX10_TEMP48 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP48);
					}
					final place RX10_TEMP49 = Program.getPlaceFromDist2(RX10_TEMP43, RX10_TEMP45);
					final place RX10_TEMP51 = here;
					final boolean RX10_TEMP52 = RX10_TEMP49!=RX10_TEMP51;
					if (RX10_TEMP52) {
						String RX10_TEMP50 = "Bad place access for array dx";
						throw new RuntimeException(RX10_TEMP50);
					}
					Program.setRefArrayValue2double(dx, RX10_TEMP45, X10_TEMP44);
				}
			}
		}
	}

	public static int Linpack_idamax(final Linpack X10_TEMP0, final int n, final doubleRefArray2 dx, final int dxk, final int dx_off, final int incx) {
		final int X10_TEMP1 = (1);
		final boolean X10_TEMP3 = n<X10_TEMP1;
		if(X10_TEMP3) {
			final int X10_TEMP4 = (1);
			final int X10_TEMP5 = 0;
			final int X10_TEMP7 = (X10_TEMP5 - X10_TEMP4);
			return X10_TEMP7;
		}
		final int X10_TEMP8 = (1);
		final boolean X10_TEMP10 = n==X10_TEMP8;
		if(X10_TEMP10) {
			final int X10_TEMP12 = (0);
			return X10_TEMP12;
		}
		final int X10_TEMP13 = (1);
		final boolean X10_TEMP15 = incx!=X10_TEMP13;
		if(X10_TEMP15) {
			int itemp = (0);
			final int X10_TEMP19 = (0);
			final int X10_TEMP21 = (X10_TEMP19 + dx_off);
			final double X10_TEMP23 = (Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP21));
			double dmax = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP23));
			final int X10_TEMP25 = (1);
			int ix = (X10_TEMP25 + incx);
			final int X10_TEMP30 = (1);
			final int X10_TEMP28 = (1);
			final int X10_TEMP31 = (n - X10_TEMP28);
			final Region1 X10_TEMP33 = Program.createNewRegion1R(X10_TEMP30, X10_TEMP31);
			final int RX10_TEMP3 = 1;
			int RX10_TEMP1 = X10_TEMP33.regSize;
			RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;
			final region(:rank==1) RX10_TEMP2 = [0 : RX10_TEMP1];
			for(point(:rank==1) RX10_TEMP0:RX10_TEMP2) {
				final int RX10_TEMP4 = RX10_TEMP0[0];
				final Point1 i = Program.regionOrdinalPoint1(X10_TEMP33, RX10_TEMP4);
				final int X10_TEMP37 = (ix + dx_off);
				final double X10_TEMP39 = (Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP37));
				double dtemp = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP39));
				final boolean X10_TEMP42 = dtemp>dmax;
				if(X10_TEMP42) {
					final int X10_TEMP45 = (i.f0);
					itemp = (X10_TEMP45);
					dmax = (dtemp);
				}
				final int X10_TEMP48 = (i.f0);
				final int X10_TEMP50 = (X10_TEMP48 + incx);
				ix = (X10_TEMP50);
			}
			return itemp;
		}
		int itemp = (0);
		final int X10_TEMP55 = (0);
		final int X10_TEMP57 = (X10_TEMP55 + dx_off);
		final double X10_TEMP59 = (Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP57));
		double dmax = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP59));
		final int X10_TEMP64 = (1);
		final int X10_TEMP62 = (1);
		final int X10_TEMP65 = (n - X10_TEMP62);
		final Region1 X10_TEMP67 = Program.createNewRegion1R(X10_TEMP64, X10_TEMP65);
		final int RX10_TEMP8 = 1;
		int RX10_TEMP6 = X10_TEMP67.regSize;
		RX10_TEMP6 = RX10_TEMP6 - RX10_TEMP8;
		final region(:rank==1) RX10_TEMP7 = [0 : RX10_TEMP6];
		for(point(:rank==1) RX10_TEMP5:RX10_TEMP7) {
			final int RX10_TEMP9 = RX10_TEMP5[0];
			final Point1 i = Program.regionOrdinalPoint1(X10_TEMP67, RX10_TEMP9);
			final int X10_TEMP71 = (i.f0);
			final int X10_TEMP73 = (X10_TEMP71 + dx_off);
			final double X10_TEMP75 = (Program.Linpack_read(X10_TEMP0, dx, dxk, X10_TEMP73));
			double dtemp = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP75));
			final boolean X10_TEMP78 = dtemp>dmax;
			if(X10_TEMP78) {
				final int X10_TEMP81 = (i.f0);
				itemp = (X10_TEMP81);
				dmax = (dtemp);
			}
		}
		return itemp;
	}

	public static double Linpack_epslon(final Linpack X10_TEMP0, final double x) {
		final double X10_TEMP1 = (4.0e0);
		final double X10_TEMP2 = (3.0e0);
		final double a = (X10_TEMP1 / X10_TEMP2);
		double eps = (0);
		final int X10_TEMP5 = (0);
		boolean X10_TEMP9 = eps==X10_TEMP5;
		while(X10_TEMP9) {
			final double X10_TEMP10 = (1.0);
			double b = (a - X10_TEMP10);
			final double X10_TEMP12 = (b + b);
			double c = (X10_TEMP12 + b);
			final double X10_TEMP14 = (1.0);
			final double X10_TEMP16 = (c - X10_TEMP14);
			final double X10_TEMP18 = (Program.Linpack_myabs(X10_TEMP0, X10_TEMP16));
			eps = (X10_TEMP18);
			final int X10_TEMP7 = (0);
			X10_TEMP9 = eps==X10_TEMP7;
		}
		final double X10_TEMP20 = (Program.Linpack_myabs(X10_TEMP0, x));
		final double X10_TEMP22 = (eps * X10_TEMP20);
		return X10_TEMP22;
	}

	public static void Linpack_dmxpy(final Linpack X10_TEMP0, final int n1, final doubleRefArray2 y, final int n2, final int ldm, final doubleRefArray2 x, final doubleRefArray2 m) {
		final int X10_TEMP4 = (0);
		final int X10_TEMP2 = (1);
		final int X10_TEMP5 = (n2 - X10_TEMP2);
		final int X10_TEMP9 = (0);
		final int X10_TEMP7 = (1);
		final int X10_TEMP10 = (n1 - X10_TEMP7);
		final Region2 X10_TEMP12 = Program.createNewRegion2RR(X10_TEMP4, X10_TEMP5, X10_TEMP9, X10_TEMP10);
		final int RX10_TEMP4 = 1;
		int RX10_TEMP2 = X10_TEMP12.regSize;
		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
		final region(:rank==1) RX10_TEMP3 = [0 : RX10_TEMP2];
		for(point(:rank==1) RX10_TEMP0:RX10_TEMP3) {
			final int RX10_TEMP5 = RX10_TEMP0[0];
			final Point2 RX10_TEMP1 = Program.regionOrdinalPoint2(X10_TEMP12, RX10_TEMP5);
			final int j = RX10_TEMP1.f0;
			final int i = RX10_TEMP1.f1;
			final int X10_TEMP15 = (0);
			final int X10_TEMP18 = (0);
			final Point2 RX10_TEMP6 = new Point2(X10_TEMP18, i);
			final Dist2 RX10_TEMP7 = y.distValue;
			final Region2 RX10_TEMP8 = RX10_TEMP7.dReg;
			final int RX10_TEMP9 = Program.searchPointInRegion2(RX10_TEMP8, RX10_TEMP6);
			final int RX10_TEMP10 = 0;
			final boolean RX10_TEMP11 = RX10_TEMP9<RX10_TEMP10;
			if (RX10_TEMP11) {
				String RX10_TEMP12 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP12);
			}
			final place RX10_TEMP13 = Program.getPlaceFromDist2(RX10_TEMP7, RX10_TEMP9);
			final place RX10_TEMP15 = here;
			final boolean RX10_TEMP16 = RX10_TEMP13!=RX10_TEMP15;
			if (RX10_TEMP16) {
				String RX10_TEMP14 = "Bad place access for array y";
				throw new RuntimeException(RX10_TEMP14);
			}
			final double RX10_TEMP17 = Program.getRefArrayValue2double(y, RX10_TEMP9);
			final double X10_TEMP29 = (RX10_TEMP17);
			final int X10_TEMP21 = (0);
			final Point2 RX10_TEMP18 = new Point2(X10_TEMP21, j);
			final Dist2 RX10_TEMP19 = x.distValue;
			final Region2 RX10_TEMP20 = RX10_TEMP19.dReg;
			final int RX10_TEMP21 = Program.searchPointInRegion2(RX10_TEMP20, RX10_TEMP18);
			final int RX10_TEMP22 = 0;
			final boolean RX10_TEMP23 = RX10_TEMP21<RX10_TEMP22;
			if (RX10_TEMP23) {
				String RX10_TEMP24 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP24);
			}
			final place RX10_TEMP25 = Program.getPlaceFromDist2(RX10_TEMP19, RX10_TEMP21);
			final place RX10_TEMP27 = here;
			final boolean RX10_TEMP28 = RX10_TEMP25!=RX10_TEMP27;
			if (RX10_TEMP28) {
				String RX10_TEMP26 = "Bad place access for array x";
				throw new RuntimeException(RX10_TEMP26);
			}
			final double RX10_TEMP29 = Program.getRefArrayValue2double(x, RX10_TEMP21);
			final double X10_TEMP25 = (RX10_TEMP29);
			final double X10_TEMP26 = (Program.Linpack_read(X10_TEMP0, m, j, i));
			final double X10_TEMP28 = (X10_TEMP25 * X10_TEMP26);
			final double X10_TEMP32 = (X10_TEMP29 + X10_TEMP28);
			final double X10_TEMP33 = (X10_TEMP32);
			final Point2 RX10_TEMP30 = new Point2(X10_TEMP15, i);
			final Dist2 RX10_TEMP31 = y.distValue;
			final Region2 RX10_TEMP32 = RX10_TEMP31.dReg;
			final int RX10_TEMP33 = Program.searchPointInRegion2(RX10_TEMP32, RX10_TEMP30);
			final int RX10_TEMP34 = 0;
			final boolean RX10_TEMP35 = RX10_TEMP33<RX10_TEMP34;
			if (RX10_TEMP35) {
				String RX10_TEMP36 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP36);
			}
			final place RX10_TEMP37 = Program.getPlaceFromDist2(RX10_TEMP31, RX10_TEMP33);
			final place RX10_TEMP39 = here;
			final boolean RX10_TEMP40 = RX10_TEMP37!=RX10_TEMP39;
			if (RX10_TEMP40) {
				String RX10_TEMP38 = "Bad place access for array y";
				throw new RuntimeException(RX10_TEMP38);
			}
			Program.setRefArrayValue2double(y, RX10_TEMP33, X10_TEMP33);
		}
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

	public static int getRefArrayValue1int(final intRefArray1 array, final int index) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final intStub value[:rank==1] contents = array.contents;
		final intStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		final int returnValue = localArray[localIndex];
		return returnValue;
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

	public static void setRefArrayValue1int(final intRefArray1 array, final int index, final int val) {
	 	final place pl = here;
		final int placeIndex = pl.id;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int value[:rank==1] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final intStub value[:rank==1] contents = array.contents;
		final intStub indexStub = contents[placeIndex];
		final int[:rank==1] localArray = indexStub.localArray;
		localArray[localIndex] = (val);
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

	public static Dist2 getBlockCyclicDist2(final Region2 r, final int blockSize) {
		final int N = r.regSize;
		final int one = 1;
		final place fPlace = place.FIRST_PLACE;
		final int rSize = N - one;
		final region(:rank==1) dReg = [0 : rSize];
		final dist(:rank==1) dDist = [0 : rSize] -> here;
		final place [:rank==1] placeArray = (place [:rank==1])(new place[dDist]);
		Program.getCyclic(placeArray, N, fPlace, blockSize);
		final place value[:rank==1] vPlaceArray = (place value[:rank==1])(new place value[dReg](point(:rank==1) p){final place tempPl = placeArray[p]; return tempPl;});
		final Dist pointDist = new Dist(vPlaceArray, N);
		final Dist2 retDist = new Dist2(r, pointDist);
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

	public static int value[:rank==1] initDist(final int [:rank==1] tempArr, final region(:rank==1) tempReg) {
		final int value[:rank==1] vTemp = (int value[:rank==1]) (new int value[tempReg](point(:rank==1) p) {
			final int tempInt = tempArr[p];
			return tempInt;
		});
		return vTemp;
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

}
class Linpack {
	public int setSize;
	public doubleRefArray2 a;
	public doubleRefArray2 b;
	public doubleRefArray2 x;
	public double ops;
	public double total;
	public double norma;
	public double normx;
	public double resid;
	public double time;
	public double kf;
	public int n;
	public int i;
	public int ntimes;
	public int info;
	public int lda;
	public int ldaa;
	public int kflops;
	public intRefArray1 ipvt;
	public int infodgefa;


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
value doubleStub {
	public final double[:rank==1] localArray;


	public doubleStub (final double[:rank==1] localArray_) {
		localArray = localArray_;
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
value Point2 {
	public final int f0;
	public final int f1;


	public Point2(final int f0_, final int f1_) {
		f0 = f0_;
		f1 = f1_;
	}


}
value intStub {
	public final int[:rank==1] localArray;


	public intStub (final int[:rank==1] localArray_) {
		localArray = localArray_;
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
value Dist1 {
	public final Region1 dReg;
	public final Dist dDist;


	public Dist1(final Region1 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
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
value doubleRefArray1 {
	public final Dist1 distValue;
	public final doubleStub value[:rank==1] contents;


	public doubleRefArray1 (final Dist1 distValue_, final doubleStub value[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
value Point1 {
	public final int f0;


	public Point1(final int f0_) {
		f0 = f0_;
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
value intRefArray1 {
	public final Dist1 distValue;
	public final intStub value[:rank==1] contents;


	public intRefArray1 (final Dist1 distValue_, final intStub value[:rank==1] contents_) {
		distValue = distValue_;
		contents = contents_;
	}


}
