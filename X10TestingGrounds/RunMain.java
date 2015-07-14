public class RunMain {
	public static void main(String[] args) {
		Program.runMain();
	}
}

class Program {
	public static final Dist1 UniqueDistribution = Program.getUniqueDist();
	public static final Region1 _MGOP_reg = Program._MGOP_reg_init();
	public static final double _MGOP_Ac0 = Program._MGOP_Ac0_init();
	public static final double _MGOP_Ac1 = Program._MGOP_Ac1_init();
	public static final double _MGOP_Ac2 = Program._MGOP_Ac2_init();
	public static final double _MGOP_Ac3 = Program._MGOP_Ac3_init();
	public static final double _MGOP_Sac0 = Program._MGOP_Sac0_init();
	public static final double _MGOP_Sac1 = Program._MGOP_Sac1_init();
	public static final double _MGOP_Sac2 = Program._MGOP_Sac2_init();
	public static final double _MGOP_Sac3 = Program._MGOP_Sac3_init();
	public static final double _MGOP_Pc0 = Program._MGOP_Pc0_init();
	public static final double _MGOP_Pc1 = Program._MGOP_Pc1_init();
	public static final double _MGOP_Pc2 = Program._MGOP_Pc2_init();
	public static final double _MGOP_Pc3 = Program._MGOP_Pc3_init();
	public static final int _Timer_max_counters = Program
			._Timer_max_counters_init();
	public static final boolean _Util_PERF_OUTPUT = Program
			._Util_PERF_OUTPUT_init();
	public static final double _Util_CLOCK_SPEED = Program
			._Util_CLOCK_SPEED_init();
	public static final double _Util_FP_PERCLOCK = Program
			._Util_FP_PERCLOCK_init();
	public static final double _Util_COMM_LATENCY = Program
			._Util_COMM_LATENCY_init();
	public static final double _Util_COMM_BANDWIDTH = Program
			._Util_COMM_BANDWIDTH_init();
	public static final boolean _Util_IN_LOOP = Program._Util_IN_LOOP_init();
	public static final boolean _Util_COMP_ONLY = Program
			._Util_COMP_ONLY_init();
	public static final boolean _Util_COMM_ONLY = Program
			._Util_COMM_ONLY_init();
	public static final int _Util_THREADS_PERFOREACH = Program
			._Util_THREADS_PERFOREACH_init();
	public static final boolean _Util_OVERLAP_COMMANDCOMP = Program
			._Util_OVERLAP_COMMANDCOMP_init();
	public static final boolean _Util_EXCHANGE_AFTER = Program
			._Util_EXCHANGE_AFTER_init();
	public static final int _Util_P2SLEVEL = Program._Util_P2SLEVEL_init();
	public static final int _Util_N_PLACES = Program._Util_N_PLACES_init();
	public static final Region3 _Util_UNIT_CUBE = Program
			._Util_UNIT_CUBE_init();
	public static final int _Util_LOW = Program._Util_LOW_init();
	public static final int _Util_HIGH = Program._Util_HIGH_init();
	public static final boolean _LevelData_PERF_On = Program
			._LevelData_PERF_On_init();
	public static final boolean _MGOP_PERF_On = Program._MGOP_PERF_On_init();
	public static final double _LevelData_PERF_Comp = Program
			._LevelData_PERF_Comp_init();
	public static final double _MGOP_PERF_Comp = Program._MGOP_PERF_Comp_init();
	public static final double _LevelData_PERF_CommL = Program
			._LevelData_PERF_CommL_init();
	public static final double _MGOP_PERF_CommL = Program
			._MGOP_PERF_CommL_init();
	public static final double _LevelData_PERF_CommB = Program
			._LevelData_PERF_CommB_init();
	public static final double _MGOP_PERF_CommB = Program
			._MGOP_PERF_CommB_init();
	public static final boolean _LevelData_PERF_InLoop = Program
			._LevelData_PERF_InLoop_init();
	public static final boolean _MGOP_PERF_InLoop = Program
			._MGOP_PERF_InLoop_init();
	public static final boolean _LevelData_PERF_CompOnly = Program
			._LevelData_PERF_CompOnly_init();
	public static final boolean _MGOP_PERF_CompOnly = Program
			._MGOP_PERF_CompOnly_init();
	public static final boolean _LevelData_PERF_CommOnly = Program
			._LevelData_PERF_CommOnly_init();
	public static final boolean _MGOP_PERF_CommOnly = Program
			._MGOP_PERF_CommOnly_init();
	public static final boolean _MGOP_OVERLAPPED = Program
			._MGOP_OVERLAPPED_init();
	public static final int _MGOP_P2SLEVEL = Program._MGOP_P2SLEVEL_init();
	public static final int _LevelData_N_PLACES = Program
			._LevelData_N_PLACES_init();
	public static final Region3ValArray3 _Util_QREGIONS = Program
			._Util_QREGIONS_init();
	public static final int _LevelData_LOW = Program._LevelData_LOW_init();
	public static final int _LevelData_HIGH = Program._LevelData_HIGH_init();

	public static String LevelData_toString(final LevelData X10_TEMP0) {
		final String X10_TEMP2 = "";
		return X10_TEMP2;
	}

	public static boolean _LevelData_PERF_On_init() {
		return _Util_PERF_OUTPUT;
	}

	public static double _LevelData_PERF_Comp_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP3 = X10_TEMP1 / _Util_FP_PERCLOCK;
		return X10_TEMP3;
	}

	public static double _LevelData_PERF_CommL_init() {
		final double X10_TEMP2 = _Util_COMM_LATENCY * _Util_CLOCK_SPEED;
		return X10_TEMP2;
	}

	public static double _LevelData_PERF_CommB_init() {
		final double X10_TEMP1 = (double) _Util_CLOCK_SPEED;
		final double X10_TEMP2 = (double) _Util_COMM_BANDWIDTH;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		final double X10_TEMP5 = 8.0;
		final double X10_TEMP7 = X10_TEMP4 * X10_TEMP5;
		return X10_TEMP7;
	}

	public static boolean _LevelData_PERF_InLoop_init() {
		return _Util_IN_LOOP;
	}

	public static boolean _LevelData_PERF_CompOnly_init() {
		return _Util_COMP_ONLY;
	}

	public static boolean _LevelData_PERF_CommOnly_init() {
		return _Util_COMM_ONLY;
	}

	public static int _LevelData_N_PLACES_init() {
		return _Util_N_PLACES;
	}

	public static int _LevelData_HIGH_init() {
		return _Util_HIGH;
	}

	public static int _LevelData_LOW_init() {
		return _Util_LOW;
	}

	public static Dist1 LevelData_getPlaces(final LevelData X10_TEMP0) {
		final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
		return X10_TEMP2;
	}

	public static doubleRefArray3 LevelData_getArray(final LevelData X10_TEMP0,
			final int a_idx) {
		final WrapperRefArray1 X10_TEMP1 = X10_TEMP0.m_u;
		final Point1 RX10_TEMP0 = new Point1(a_idx);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		final Wrapper RX10_TEMP11 = Program.getRefArrayValue1Wrapper(X10_TEMP1,
				RX10_TEMP3);
		final Wrapper X10_TEMP3 = RX10_TEMP11;
		final doubleRefArray3 X10_TEMP5 = X10_TEMP3.m_array;
		return X10_TEMP5;
	}

	public static Region3 LevelData_getInnerRegion(final LevelData X10_TEMP0,
			final int a_idx) {
		final Region3 X10_TEMP2 = Program.LevelData_get_m_regions(X10_TEMP0,
				a_idx);
		return X10_TEMP2;
	}

	public static Region3 LevelData_getINNERRegion(final LevelData X10_TEMP0,
			final int a_idx) {
		final Region3RefArray1 X10_TEMP1 = X10_TEMP0.m_regions;
		final Point1 RX10_TEMP0 = new Point1(a_idx);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		final Region3 RX10_TEMP11 = Program.getRefArrayValue1Region3(X10_TEMP1,
				RX10_TEMP3);
		final Region3 X10_TEMP3 = RX10_TEMP11;
		Region3 R = X10_TEMP3;
		final int X10_TEMP6 = 0;
		final int X10_TEMP8 = 3;
		final boolean X10_TEMP7 = X10_TEMP6 >= X10_TEMP8;
		if (X10_TEMP7) {
			final String X10_TEMP9 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP10 = ", expected 3";
			String X10_TEMP11 = X10_TEMP9 + X10_TEMP6;
			X10_TEMP11 = X10_TEMP11 + X10_TEMP10;
			throw new RuntimeException(X10_TEMP11);
		}
		final int X10_TEMP12 = 0;
		final int X10_TEMP13 = 1;
		final int X10_TEMP15 = X10_TEMP12 - X10_TEMP13;
		Region1 X10_TEMP14 = Program.createNewRegion1R(X10_TEMP12, X10_TEMP15);
		final int X10_TEMP16 = 0;
		final boolean X10_TEMP19 = X10_TEMP6 == X10_TEMP16;
		final int X10_TEMP17 = 1;
		final boolean X10_TEMP20 = X10_TEMP6 == X10_TEMP17;
		final int X10_TEMP18 = 2;
		final boolean X10_TEMP21 = X10_TEMP6 == X10_TEMP18;
		final int RX10_TEMP16 = 1;
		int RX10_TEMP14 = R.regSize;
		RX10_TEMP14 = RX10_TEMP14 - RX10_TEMP16;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP15 = RX10_TEMP14 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP15; SX10_TEMP1++) {
			final int RX10_TEMP12 = SX10_TEMP1;
			final int RX10_TEMP17 = RX10_TEMP12;
			final Point3 RX10_TEMP13 = Program.regionOrdinalPoint3(R,
					RX10_TEMP17);
			final int X10_TEMP22 = RX10_TEMP13.f0;
			final int X10_TEMP23 = RX10_TEMP13.f1;
			final int X10_TEMP24 = RX10_TEMP13.f2;
			if (X10_TEMP19) {
				final Region1 X10_TEMP25 = Program.createNewRegion1R(
						X10_TEMP22, X10_TEMP22);
				X10_TEMP14 = Program.unionRegion1(X10_TEMP14, X10_TEMP25);
			} else {
				if (X10_TEMP20) {
					final Region1 X10_TEMP25 = Program.createNewRegion1R(
							X10_TEMP23, X10_TEMP23);
					X10_TEMP14 = Program.unionRegion1(X10_TEMP14, X10_TEMP25);
				} else {
					if (X10_TEMP21) {
						final Region1 X10_TEMP25 = Program.createNewRegion1R(
								X10_TEMP24, X10_TEMP24);
						X10_TEMP14 = Program.unionRegion1(X10_TEMP14,
								X10_TEMP25);
					}
				}
			}
		}
		final Region1 X10_TEMP26 = X10_TEMP14;
		final int RX10_TEMP18 = X10_TEMP26.regSize;
		final int RX10_TEMP19 = 0;
		final boolean RX10_TEMP20 = RX10_TEMP18 <= RX10_TEMP19;
		if (RX10_TEMP20) {
			final String RX10_TEMP21 = "Operation low() not defined on empty region X10_TEMP26";
			throw new RuntimeException(RX10_TEMP21);
		}
		final int X10_TEMP27 = Program.regionLow(X10_TEMP26);
		final int X10_TEMP28 = 1;
		final int X10_TEMP55 = X10_TEMP27 + X10_TEMP28;
		final int X10_TEMP31 = 0;
		final int X10_TEMP33 = 3;
		final boolean X10_TEMP32 = X10_TEMP31 >= X10_TEMP33;
		if (X10_TEMP32) {
			final String X10_TEMP34 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP35 = ", expected 3";
			String X10_TEMP36 = X10_TEMP34 + X10_TEMP31;
			X10_TEMP36 = X10_TEMP36 + X10_TEMP35;
			throw new RuntimeException(X10_TEMP36);
		}
		final int X10_TEMP37 = 0;
		final int X10_TEMP38 = 1;
		final int X10_TEMP40 = X10_TEMP37 - X10_TEMP38;
		Region1 X10_TEMP39 = Program.createNewRegion1R(X10_TEMP37, X10_TEMP40);
		final int X10_TEMP41 = 0;
		final boolean X10_TEMP44 = X10_TEMP31 == X10_TEMP41;
		final int X10_TEMP42 = 1;
		final boolean X10_TEMP45 = X10_TEMP31 == X10_TEMP42;
		final int X10_TEMP43 = 2;
		final boolean X10_TEMP46 = X10_TEMP31 == X10_TEMP43;
		final int RX10_TEMP26 = 1;
		int RX10_TEMP24 = R.regSize;
		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26;
		final int SX10_TEMP2 = 1;
		final int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP2;
		for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP25; SX10_TEMP3++) {
			final int RX10_TEMP22 = SX10_TEMP3;
			final int RX10_TEMP27 = RX10_TEMP22;
			final Point3 RX10_TEMP23 = Program.regionOrdinalPoint3(R,
					RX10_TEMP27);
			final int X10_TEMP47 = RX10_TEMP23.f0;
			final int X10_TEMP48 = RX10_TEMP23.f1;
			final int X10_TEMP49 = RX10_TEMP23.f2;
			if (X10_TEMP44) {
				final Region1 X10_TEMP50 = Program.createNewRegion1R(
						X10_TEMP47, X10_TEMP47);
				X10_TEMP39 = Program.unionRegion1(X10_TEMP39, X10_TEMP50);
			} else {
				if (X10_TEMP45) {
					final Region1 X10_TEMP50 = Program.createNewRegion1R(
							X10_TEMP48, X10_TEMP48);
					X10_TEMP39 = Program.unionRegion1(X10_TEMP39, X10_TEMP50);
				} else {
					if (X10_TEMP46) {
						final Region1 X10_TEMP50 = Program.createNewRegion1R(
								X10_TEMP49, X10_TEMP49);
						X10_TEMP39 = Program.unionRegion1(X10_TEMP39,
								X10_TEMP50);
					}
				}
			}
		}
		final Region1 X10_TEMP51 = X10_TEMP39;
		final int RX10_TEMP28 = X10_TEMP51.regSize;
		final int RX10_TEMP29 = 0;
		final boolean RX10_TEMP30 = RX10_TEMP28 <= RX10_TEMP29;
		if (RX10_TEMP30) {
			final String RX10_TEMP31 = "Operation high() not defined on empty region X10_TEMP51";
			throw new RuntimeException(RX10_TEMP31);
		}
		final int X10_TEMP52 = Program.regionHigh(X10_TEMP51);
		final int X10_TEMP53 = 1;
		final int X10_TEMP56 = X10_TEMP52 - X10_TEMP53;
		final int X10_TEMP58 = 1;
		final int X10_TEMP60 = 3;
		final boolean X10_TEMP59 = X10_TEMP58 >= X10_TEMP60;
		if (X10_TEMP59) {
			final String X10_TEMP61 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP62 = ", expected 3";
			String X10_TEMP63 = X10_TEMP61 + X10_TEMP58;
			X10_TEMP63 = X10_TEMP63 + X10_TEMP62;
			throw new RuntimeException(X10_TEMP63);
		}
		final int X10_TEMP64 = 0;
		final int X10_TEMP65 = 1;
		final int X10_TEMP67 = X10_TEMP64 - X10_TEMP65;
		Region1 X10_TEMP66 = Program.createNewRegion1R(X10_TEMP64, X10_TEMP67);
		final int X10_TEMP68 = 0;
		final boolean X10_TEMP71 = X10_TEMP58 == X10_TEMP68;
		final int X10_TEMP69 = 1;
		final boolean X10_TEMP72 = X10_TEMP58 == X10_TEMP69;
		final int X10_TEMP70 = 2;
		final boolean X10_TEMP73 = X10_TEMP58 == X10_TEMP70;
		final int RX10_TEMP36 = 1;
		int RX10_TEMP34 = R.regSize;
		RX10_TEMP34 = RX10_TEMP34 - RX10_TEMP36;
		final int SX10_TEMP4 = 1;
		final int RX10_TEMP35 = RX10_TEMP34 + SX10_TEMP4;
		for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP35; SX10_TEMP5++) {
			final int RX10_TEMP32 = SX10_TEMP5;
			final int RX10_TEMP37 = RX10_TEMP32;
			final Point3 RX10_TEMP33 = Program.regionOrdinalPoint3(R,
					RX10_TEMP37);
			final int X10_TEMP74 = RX10_TEMP33.f0;
			final int X10_TEMP75 = RX10_TEMP33.f1;
			final int X10_TEMP76 = RX10_TEMP33.f2;
			if (X10_TEMP71) {
				final Region1 X10_TEMP77 = Program.createNewRegion1R(
						X10_TEMP74, X10_TEMP74);
				X10_TEMP66 = Program.unionRegion1(X10_TEMP66, X10_TEMP77);
			} else {
				if (X10_TEMP72) {
					final Region1 X10_TEMP77 = Program.createNewRegion1R(
							X10_TEMP75, X10_TEMP75);
					X10_TEMP66 = Program.unionRegion1(X10_TEMP66, X10_TEMP77);
				} else {
					if (X10_TEMP73) {
						final Region1 X10_TEMP77 = Program.createNewRegion1R(
								X10_TEMP76, X10_TEMP76);
						X10_TEMP66 = Program.unionRegion1(X10_TEMP66,
								X10_TEMP77);
					}
				}
			}
		}
		final Region1 X10_TEMP78 = X10_TEMP66;
		final int RX10_TEMP38 = X10_TEMP78.regSize;
		final int RX10_TEMP39 = 0;
		final boolean RX10_TEMP40 = RX10_TEMP38 <= RX10_TEMP39;
		if (RX10_TEMP40) {
			final String RX10_TEMP41 = "Operation low() not defined on empty region X10_TEMP78";
			throw new RuntimeException(RX10_TEMP41);
		}
		final int X10_TEMP79 = Program.regionLow(X10_TEMP78);
		final int X10_TEMP80 = 1;
		final int X10_TEMP107 = X10_TEMP79 + X10_TEMP80;
		final int X10_TEMP83 = 1;
		final int X10_TEMP85 = 3;
		final boolean X10_TEMP84 = X10_TEMP83 >= X10_TEMP85;
		if (X10_TEMP84) {
			final String X10_TEMP86 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP87 = ", expected 3";
			String X10_TEMP88 = X10_TEMP86 + X10_TEMP83;
			X10_TEMP88 = X10_TEMP88 + X10_TEMP87;
			throw new RuntimeException(X10_TEMP88);
		}
		final int X10_TEMP89 = 0;
		final int X10_TEMP90 = 1;
		final int X10_TEMP92 = X10_TEMP89 - X10_TEMP90;
		Region1 X10_TEMP91 = Program.createNewRegion1R(X10_TEMP89, X10_TEMP92);
		final int X10_TEMP93 = 0;
		final boolean X10_TEMP96 = X10_TEMP83 == X10_TEMP93;
		final int X10_TEMP94 = 1;
		final boolean X10_TEMP97 = X10_TEMP83 == X10_TEMP94;
		final int X10_TEMP95 = 2;
		final boolean X10_TEMP98 = X10_TEMP83 == X10_TEMP95;
		final int RX10_TEMP46 = 1;
		int RX10_TEMP44 = R.regSize;
		RX10_TEMP44 = RX10_TEMP44 - RX10_TEMP46;
		final int SX10_TEMP6 = 1;
		final int RX10_TEMP45 = RX10_TEMP44 + SX10_TEMP6;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP45; SX10_TEMP7++) {
			final int RX10_TEMP42 = SX10_TEMP7;
			final int RX10_TEMP47 = RX10_TEMP42;
			final Point3 RX10_TEMP43 = Program.regionOrdinalPoint3(R,
					RX10_TEMP47);
			final int X10_TEMP99 = RX10_TEMP43.f0;
			final int X10_TEMP100 = RX10_TEMP43.f1;
			final int X10_TEMP101 = RX10_TEMP43.f2;
			if (X10_TEMP96) {
				final Region1 X10_TEMP102 = Program.createNewRegion1R(
						X10_TEMP99, X10_TEMP99);
				X10_TEMP91 = Program.unionRegion1(X10_TEMP91, X10_TEMP102);
			} else {
				if (X10_TEMP97) {
					final Region1 X10_TEMP102 = Program.createNewRegion1R(
							X10_TEMP100, X10_TEMP100);
					X10_TEMP91 = Program.unionRegion1(X10_TEMP91, X10_TEMP102);
				} else {
					if (X10_TEMP98) {
						final Region1 X10_TEMP102 = Program.createNewRegion1R(
								X10_TEMP101, X10_TEMP101);
						X10_TEMP91 = Program.unionRegion1(X10_TEMP91,
								X10_TEMP102);
					}
				}
			}
		}
		final Region1 X10_TEMP103 = X10_TEMP91;
		final int RX10_TEMP48 = X10_TEMP103.regSize;
		final int RX10_TEMP49 = 0;
		final boolean RX10_TEMP50 = RX10_TEMP48 <= RX10_TEMP49;
		if (RX10_TEMP50) {
			final String RX10_TEMP51 = "Operation high() not defined on empty region X10_TEMP103";
			throw new RuntimeException(RX10_TEMP51);
		}
		final int X10_TEMP104 = Program.regionHigh(X10_TEMP103);
		final int X10_TEMP105 = 1;
		final int X10_TEMP108 = X10_TEMP104 - X10_TEMP105;
		final int X10_TEMP110 = 2;
		final int X10_TEMP112 = 3;
		final boolean X10_TEMP111 = X10_TEMP110 >= X10_TEMP112;
		if (X10_TEMP111) {
			final String X10_TEMP113 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP114 = ", expected 3";
			String X10_TEMP115 = X10_TEMP113 + X10_TEMP110;
			X10_TEMP115 = X10_TEMP115 + X10_TEMP114;
			throw new RuntimeException(X10_TEMP115);
		}
		final int X10_TEMP116 = 0;
		final int X10_TEMP117 = 1;
		final int X10_TEMP119 = X10_TEMP116 - X10_TEMP117;
		Region1 X10_TEMP118 = Program.createNewRegion1R(X10_TEMP116,
				X10_TEMP119);
		final int X10_TEMP120 = 0;
		final boolean X10_TEMP123 = X10_TEMP110 == X10_TEMP120;
		final int X10_TEMP121 = 1;
		final boolean X10_TEMP124 = X10_TEMP110 == X10_TEMP121;
		final int X10_TEMP122 = 2;
		final boolean X10_TEMP125 = X10_TEMP110 == X10_TEMP122;
		final int RX10_TEMP56 = 1;
		int RX10_TEMP54 = R.regSize;
		RX10_TEMP54 = RX10_TEMP54 - RX10_TEMP56;
		final int SX10_TEMP8 = 1;
		final int RX10_TEMP55 = RX10_TEMP54 + SX10_TEMP8;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP55; SX10_TEMP9++) {
			final int RX10_TEMP52 = SX10_TEMP9;
			final int RX10_TEMP57 = RX10_TEMP52;
			final Point3 RX10_TEMP53 = Program.regionOrdinalPoint3(R,
					RX10_TEMP57);
			final int X10_TEMP126 = RX10_TEMP53.f0;
			final int X10_TEMP127 = RX10_TEMP53.f1;
			final int X10_TEMP128 = RX10_TEMP53.f2;
			if (X10_TEMP123) {
				final Region1 X10_TEMP129 = Program.createNewRegion1R(
						X10_TEMP126, X10_TEMP126);
				X10_TEMP118 = Program.unionRegion1(X10_TEMP118, X10_TEMP129);
			} else {
				if (X10_TEMP124) {
					final Region1 X10_TEMP129 = Program.createNewRegion1R(
							X10_TEMP127, X10_TEMP127);
					X10_TEMP118 = Program
							.unionRegion1(X10_TEMP118, X10_TEMP129);
				} else {
					if (X10_TEMP125) {
						final Region1 X10_TEMP129 = Program.createNewRegion1R(
								X10_TEMP128, X10_TEMP128);
						X10_TEMP118 = Program.unionRegion1(X10_TEMP118,
								X10_TEMP129);
					}
				}
			}
		}
		final Region1 X10_TEMP130 = X10_TEMP118;
		final int RX10_TEMP58 = X10_TEMP130.regSize;
		final int RX10_TEMP59 = 0;
		final boolean RX10_TEMP60 = RX10_TEMP58 <= RX10_TEMP59;
		if (RX10_TEMP60) {
			final String RX10_TEMP61 = "Operation low() not defined on empty region X10_TEMP130";
			throw new RuntimeException(RX10_TEMP61);
		}
		final int X10_TEMP131 = Program.regionLow(X10_TEMP130);
		final int X10_TEMP132 = 1;
		final int X10_TEMP159 = X10_TEMP131 + X10_TEMP132;
		final int X10_TEMP135 = 2;
		final int X10_TEMP137 = 3;
		final boolean X10_TEMP136 = X10_TEMP135 >= X10_TEMP137;
		if (X10_TEMP136) {
			final String X10_TEMP138 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP139 = ", expected 3";
			String X10_TEMP140 = X10_TEMP138 + X10_TEMP135;
			X10_TEMP140 = X10_TEMP140 + X10_TEMP139;
			throw new RuntimeException(X10_TEMP140);
		}
		final int X10_TEMP141 = 0;
		final int X10_TEMP142 = 1;
		final int X10_TEMP144 = X10_TEMP141 - X10_TEMP142;
		Region1 X10_TEMP143 = Program.createNewRegion1R(X10_TEMP141,
				X10_TEMP144);
		final int X10_TEMP145 = 0;
		final boolean X10_TEMP148 = X10_TEMP135 == X10_TEMP145;
		final int X10_TEMP146 = 1;
		final boolean X10_TEMP149 = X10_TEMP135 == X10_TEMP146;
		final int X10_TEMP147 = 2;
		final boolean X10_TEMP150 = X10_TEMP135 == X10_TEMP147;
		final int RX10_TEMP66 = 1;
		int RX10_TEMP64 = R.regSize;
		RX10_TEMP64 = RX10_TEMP64 - RX10_TEMP66;
		final int SX10_TEMP10 = 1;
		final int RX10_TEMP65 = RX10_TEMP64 + SX10_TEMP10;
		for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP65; SX10_TEMP11++) {
			final int RX10_TEMP62 = SX10_TEMP11;
			final int RX10_TEMP67 = RX10_TEMP62;
			final Point3 RX10_TEMP63 = Program.regionOrdinalPoint3(R,
					RX10_TEMP67);
			final int X10_TEMP151 = RX10_TEMP63.f0;
			final int X10_TEMP152 = RX10_TEMP63.f1;
			final int X10_TEMP153 = RX10_TEMP63.f2;
			if (X10_TEMP148) {
				final Region1 X10_TEMP154 = Program.createNewRegion1R(
						X10_TEMP151, X10_TEMP151);
				X10_TEMP143 = Program.unionRegion1(X10_TEMP143, X10_TEMP154);
			} else {
				if (X10_TEMP149) {
					final Region1 X10_TEMP154 = Program.createNewRegion1R(
							X10_TEMP152, X10_TEMP152);
					X10_TEMP143 = Program
							.unionRegion1(X10_TEMP143, X10_TEMP154);
				} else {
					if (X10_TEMP150) {
						final Region1 X10_TEMP154 = Program.createNewRegion1R(
								X10_TEMP153, X10_TEMP153);
						X10_TEMP143 = Program.unionRegion1(X10_TEMP143,
								X10_TEMP154);
					}
				}
			}
		}
		final Region1 X10_TEMP155 = X10_TEMP143;
		final int RX10_TEMP68 = X10_TEMP155.regSize;
		final int RX10_TEMP69 = 0;
		final boolean RX10_TEMP70 = RX10_TEMP68 <= RX10_TEMP69;
		if (RX10_TEMP70) {
			final String RX10_TEMP71 = "Operation high() not defined on empty region X10_TEMP155";
			throw new RuntimeException(RX10_TEMP71);
		}
		final int X10_TEMP156 = Program.regionHigh(X10_TEMP155);
		final int X10_TEMP157 = 1;
		final int X10_TEMP160 = X10_TEMP156 - X10_TEMP157;
		final Region3 X10_TEMP162 = Program.createNewRegion3RRR(X10_TEMP55,
				X10_TEMP56, X10_TEMP107, X10_TEMP108, X10_TEMP159, X10_TEMP160);
		return X10_TEMP162;
	}

	public static Region3 LevelData_getShrinkedRegion(
			final LevelData X10_TEMP0, final int a_idx) {
		final Region3 X10_TEMP2 = Program.LevelData_get_m_REGIONs(X10_TEMP0,
				a_idx);
		Region3 R = X10_TEMP2;
		final int X10_TEMP5 = 0;
		final int X10_TEMP7 = 3;
		final boolean X10_TEMP6 = X10_TEMP5 >= X10_TEMP7;
		if (X10_TEMP6) {
			final String X10_TEMP8 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP9 = ", expected 3";
			String X10_TEMP10 = X10_TEMP8 + X10_TEMP5;
			X10_TEMP10 = X10_TEMP10 + X10_TEMP9;
			throw new RuntimeException(X10_TEMP10);
		}
		final int X10_TEMP11 = 0;
		final int X10_TEMP12 = 1;
		final int X10_TEMP14 = X10_TEMP11 - X10_TEMP12;
		Region1 X10_TEMP13 = Program.createNewRegion1R(X10_TEMP11, X10_TEMP14);
		final int X10_TEMP15 = 0;
		final boolean X10_TEMP18 = X10_TEMP5 == X10_TEMP15;
		final int X10_TEMP16 = 1;
		final boolean X10_TEMP19 = X10_TEMP5 == X10_TEMP16;
		final int X10_TEMP17 = 2;
		final boolean X10_TEMP20 = X10_TEMP5 == X10_TEMP17;
		final int RX10_TEMP4 = 1;
		int RX10_TEMP2 = R.regSize;
		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
			final int RX10_TEMP0 = SX10_TEMP1;
			final int RX10_TEMP5 = RX10_TEMP0;
			final Point3 RX10_TEMP1 = Program
					.regionOrdinalPoint3(R, RX10_TEMP5);
			final int X10_TEMP21 = RX10_TEMP1.f0;
			final int X10_TEMP22 = RX10_TEMP1.f1;
			final int X10_TEMP23 = RX10_TEMP1.f2;
			if (X10_TEMP18) {
				final Region1 X10_TEMP24 = Program.createNewRegion1R(
						X10_TEMP21, X10_TEMP21);
				X10_TEMP13 = Program.unionRegion1(X10_TEMP13, X10_TEMP24);
			} else {
				if (X10_TEMP19) {
					final Region1 X10_TEMP24 = Program.createNewRegion1R(
							X10_TEMP22, X10_TEMP22);
					X10_TEMP13 = Program.unionRegion1(X10_TEMP13, X10_TEMP24);
				} else {
					if (X10_TEMP20) {
						final Region1 X10_TEMP24 = Program.createNewRegion1R(
								X10_TEMP23, X10_TEMP23);
						X10_TEMP13 = Program.unionRegion1(X10_TEMP13,
								X10_TEMP24);
					}
				}
			}
		}
		final Region1 X10_TEMP25 = X10_TEMP13;
		final int RX10_TEMP6 = X10_TEMP25.regSize;
		final int RX10_TEMP7 = 0;
		final boolean RX10_TEMP8 = RX10_TEMP6 <= RX10_TEMP7;
		if (RX10_TEMP8) {
			final String RX10_TEMP9 = "Operation low() not defined on empty region X10_TEMP25";
			throw new RuntimeException(RX10_TEMP9);
		}
		final int X10_TEMP52 = Program.regionLow(X10_TEMP25);
		final int X10_TEMP28 = 0;
		final int X10_TEMP30 = 3;
		final boolean X10_TEMP29 = X10_TEMP28 >= X10_TEMP30;
		if (X10_TEMP29) {
			final String X10_TEMP31 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP32 = ", expected 3";
			String X10_TEMP33 = X10_TEMP31 + X10_TEMP28;
			X10_TEMP33 = X10_TEMP33 + X10_TEMP32;
			throw new RuntimeException(X10_TEMP33);
		}
		final int X10_TEMP34 = 0;
		final int X10_TEMP35 = 1;
		final int X10_TEMP37 = X10_TEMP34 - X10_TEMP35;
		Region1 X10_TEMP36 = Program.createNewRegion1R(X10_TEMP34, X10_TEMP37);
		final int X10_TEMP38 = 0;
		final boolean X10_TEMP41 = X10_TEMP28 == X10_TEMP38;
		final int X10_TEMP39 = 1;
		final boolean X10_TEMP42 = X10_TEMP28 == X10_TEMP39;
		final int X10_TEMP40 = 2;
		final boolean X10_TEMP43 = X10_TEMP28 == X10_TEMP40;
		final int RX10_TEMP14 = 1;
		int RX10_TEMP12 = R.regSize;
		RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14;
		final int SX10_TEMP2 = 1;
		final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP2;
		for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP13; SX10_TEMP3++) {
			final int RX10_TEMP10 = SX10_TEMP3;
			final int RX10_TEMP15 = RX10_TEMP10;
			final Point3 RX10_TEMP11 = Program.regionOrdinalPoint3(R,
					RX10_TEMP15);
			final int X10_TEMP44 = RX10_TEMP11.f0;
			final int X10_TEMP45 = RX10_TEMP11.f1;
			final int X10_TEMP46 = RX10_TEMP11.f2;
			if (X10_TEMP41) {
				final Region1 X10_TEMP47 = Program.createNewRegion1R(
						X10_TEMP44, X10_TEMP44);
				X10_TEMP36 = Program.unionRegion1(X10_TEMP36, X10_TEMP47);
			} else {
				if (X10_TEMP42) {
					final Region1 X10_TEMP47 = Program.createNewRegion1R(
							X10_TEMP45, X10_TEMP45);
					X10_TEMP36 = Program.unionRegion1(X10_TEMP36, X10_TEMP47);
				} else {
					if (X10_TEMP43) {
						final Region1 X10_TEMP47 = Program.createNewRegion1R(
								X10_TEMP46, X10_TEMP46);
						X10_TEMP36 = Program.unionRegion1(X10_TEMP36,
								X10_TEMP47);
					}
				}
			}
		}
		final Region1 X10_TEMP48 = X10_TEMP36;
		final int RX10_TEMP16 = X10_TEMP48.regSize;
		final int RX10_TEMP17 = 0;
		final boolean RX10_TEMP18 = RX10_TEMP16 <= RX10_TEMP17;
		if (RX10_TEMP18) {
			final String RX10_TEMP19 = "Operation high() not defined on empty region X10_TEMP48";
			throw new RuntimeException(RX10_TEMP19);
		}
		final int X10_TEMP49 = Program.regionHigh(X10_TEMP48);
		final int X10_TEMP50 = 1;
		final int X10_TEMP53 = X10_TEMP49 - X10_TEMP50;
		final int X10_TEMP55 = 1;
		final int X10_TEMP57 = 3;
		final boolean X10_TEMP56 = X10_TEMP55 >= X10_TEMP57;
		if (X10_TEMP56) {
			final String X10_TEMP58 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP59 = ", expected 3";
			String X10_TEMP60 = X10_TEMP58 + X10_TEMP55;
			X10_TEMP60 = X10_TEMP60 + X10_TEMP59;
			throw new RuntimeException(X10_TEMP60);
		}
		final int X10_TEMP61 = 0;
		final int X10_TEMP62 = 1;
		final int X10_TEMP64 = X10_TEMP61 - X10_TEMP62;
		Region1 X10_TEMP63 = Program.createNewRegion1R(X10_TEMP61, X10_TEMP64);
		final int X10_TEMP65 = 0;
		final boolean X10_TEMP68 = X10_TEMP55 == X10_TEMP65;
		final int X10_TEMP66 = 1;
		final boolean X10_TEMP69 = X10_TEMP55 == X10_TEMP66;
		final int X10_TEMP67 = 2;
		final boolean X10_TEMP70 = X10_TEMP55 == X10_TEMP67;
		final int RX10_TEMP24 = 1;
		int RX10_TEMP22 = R.regSize;
		RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24;
		final int SX10_TEMP4 = 1;
		final int RX10_TEMP23 = RX10_TEMP22 + SX10_TEMP4;
		for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP23; SX10_TEMP5++) {
			final int RX10_TEMP20 = SX10_TEMP5;
			final int RX10_TEMP25 = RX10_TEMP20;
			final Point3 RX10_TEMP21 = Program.regionOrdinalPoint3(R,
					RX10_TEMP25);
			final int X10_TEMP71 = RX10_TEMP21.f0;
			final int X10_TEMP72 = RX10_TEMP21.f1;
			final int X10_TEMP73 = RX10_TEMP21.f2;
			if (X10_TEMP68) {
				final Region1 X10_TEMP74 = Program.createNewRegion1R(
						X10_TEMP71, X10_TEMP71);
				X10_TEMP63 = Program.unionRegion1(X10_TEMP63, X10_TEMP74);
			} else {
				if (X10_TEMP69) {
					final Region1 X10_TEMP74 = Program.createNewRegion1R(
							X10_TEMP72, X10_TEMP72);
					X10_TEMP63 = Program.unionRegion1(X10_TEMP63, X10_TEMP74);
				} else {
					if (X10_TEMP70) {
						final Region1 X10_TEMP74 = Program.createNewRegion1R(
								X10_TEMP73, X10_TEMP73);
						X10_TEMP63 = Program.unionRegion1(X10_TEMP63,
								X10_TEMP74);
					}
				}
			}
		}
		final Region1 X10_TEMP75 = X10_TEMP63;
		final int RX10_TEMP26 = X10_TEMP75.regSize;
		final int RX10_TEMP27 = 0;
		final boolean RX10_TEMP28 = RX10_TEMP26 <= RX10_TEMP27;
		if (RX10_TEMP28) {
			final String RX10_TEMP29 = "Operation low() not defined on empty region X10_TEMP75";
			throw new RuntimeException(RX10_TEMP29);
		}
		final int X10_TEMP102 = Program.regionLow(X10_TEMP75);
		final int X10_TEMP78 = 1;
		final int X10_TEMP80 = 3;
		final boolean X10_TEMP79 = X10_TEMP78 >= X10_TEMP80;
		if (X10_TEMP79) {
			final String X10_TEMP81 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP82 = ", expected 3";
			String X10_TEMP83 = X10_TEMP81 + X10_TEMP78;
			X10_TEMP83 = X10_TEMP83 + X10_TEMP82;
			throw new RuntimeException(X10_TEMP83);
		}
		final int X10_TEMP84 = 0;
		final int X10_TEMP85 = 1;
		final int X10_TEMP87 = X10_TEMP84 - X10_TEMP85;
		Region1 X10_TEMP86 = Program.createNewRegion1R(X10_TEMP84, X10_TEMP87);
		final int X10_TEMP88 = 0;
		final boolean X10_TEMP91 = X10_TEMP78 == X10_TEMP88;
		final int X10_TEMP89 = 1;
		final boolean X10_TEMP92 = X10_TEMP78 == X10_TEMP89;
		final int X10_TEMP90 = 2;
		final boolean X10_TEMP93 = X10_TEMP78 == X10_TEMP90;
		final int RX10_TEMP34 = 1;
		int RX10_TEMP32 = R.regSize;
		RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34;
		final int SX10_TEMP6 = 1;
		final int RX10_TEMP33 = RX10_TEMP32 + SX10_TEMP6;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP33; SX10_TEMP7++) {
			final int RX10_TEMP30 = SX10_TEMP7;
			final int RX10_TEMP35 = RX10_TEMP30;
			final Point3 RX10_TEMP31 = Program.regionOrdinalPoint3(R,
					RX10_TEMP35);
			final int X10_TEMP94 = RX10_TEMP31.f0;
			final int X10_TEMP95 = RX10_TEMP31.f1;
			final int X10_TEMP96 = RX10_TEMP31.f2;
			if (X10_TEMP91) {
				final Region1 X10_TEMP97 = Program.createNewRegion1R(
						X10_TEMP94, X10_TEMP94);
				X10_TEMP86 = Program.unionRegion1(X10_TEMP86, X10_TEMP97);
			} else {
				if (X10_TEMP92) {
					final Region1 X10_TEMP97 = Program.createNewRegion1R(
							X10_TEMP95, X10_TEMP95);
					X10_TEMP86 = Program.unionRegion1(X10_TEMP86, X10_TEMP97);
				} else {
					if (X10_TEMP93) {
						final Region1 X10_TEMP97 = Program.createNewRegion1R(
								X10_TEMP96, X10_TEMP96);
						X10_TEMP86 = Program.unionRegion1(X10_TEMP86,
								X10_TEMP97);
					}
				}
			}
		}
		final Region1 X10_TEMP98 = X10_TEMP86;
		final int RX10_TEMP36 = X10_TEMP98.regSize;
		final int RX10_TEMP37 = 0;
		final boolean RX10_TEMP38 = RX10_TEMP36 <= RX10_TEMP37;
		if (RX10_TEMP38) {
			final String RX10_TEMP39 = "Operation high() not defined on empty region X10_TEMP98";
			throw new RuntimeException(RX10_TEMP39);
		}
		final int X10_TEMP99 = Program.regionHigh(X10_TEMP98);
		final int X10_TEMP100 = 1;
		final int X10_TEMP103 = X10_TEMP99 - X10_TEMP100;
		final int X10_TEMP105 = 2;
		final int X10_TEMP107 = 3;
		final boolean X10_TEMP106 = X10_TEMP105 >= X10_TEMP107;
		if (X10_TEMP106) {
			final String X10_TEMP108 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP109 = ", expected 3";
			String X10_TEMP110 = X10_TEMP108 + X10_TEMP105;
			X10_TEMP110 = X10_TEMP110 + X10_TEMP109;
			throw new RuntimeException(X10_TEMP110);
		}
		final int X10_TEMP111 = 0;
		final int X10_TEMP112 = 1;
		final int X10_TEMP114 = X10_TEMP111 - X10_TEMP112;
		Region1 X10_TEMP113 = Program.createNewRegion1R(X10_TEMP111,
				X10_TEMP114);
		final int X10_TEMP115 = 0;
		final boolean X10_TEMP118 = X10_TEMP105 == X10_TEMP115;
		final int X10_TEMP116 = 1;
		final boolean X10_TEMP119 = X10_TEMP105 == X10_TEMP116;
		final int X10_TEMP117 = 2;
		final boolean X10_TEMP120 = X10_TEMP105 == X10_TEMP117;
		final int RX10_TEMP44 = 1;
		int RX10_TEMP42 = R.regSize;
		RX10_TEMP42 = RX10_TEMP42 - RX10_TEMP44;
		final int SX10_TEMP8 = 1;
		final int RX10_TEMP43 = RX10_TEMP42 + SX10_TEMP8;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP43; SX10_TEMP9++) {
			final int RX10_TEMP40 = SX10_TEMP9;
			final int RX10_TEMP45 = RX10_TEMP40;
			final Point3 RX10_TEMP41 = Program.regionOrdinalPoint3(R,
					RX10_TEMP45);
			final int X10_TEMP121 = RX10_TEMP41.f0;
			final int X10_TEMP122 = RX10_TEMP41.f1;
			final int X10_TEMP123 = RX10_TEMP41.f2;
			if (X10_TEMP118) {
				final Region1 X10_TEMP124 = Program.createNewRegion1R(
						X10_TEMP121, X10_TEMP121);
				X10_TEMP113 = Program.unionRegion1(X10_TEMP113, X10_TEMP124);
			} else {
				if (X10_TEMP119) {
					final Region1 X10_TEMP124 = Program.createNewRegion1R(
							X10_TEMP122, X10_TEMP122);
					X10_TEMP113 = Program
							.unionRegion1(X10_TEMP113, X10_TEMP124);
				} else {
					if (X10_TEMP120) {
						final Region1 X10_TEMP124 = Program.createNewRegion1R(
								X10_TEMP123, X10_TEMP123);
						X10_TEMP113 = Program.unionRegion1(X10_TEMP113,
								X10_TEMP124);
					}
				}
			}
		}
		final Region1 X10_TEMP125 = X10_TEMP113;
		final int RX10_TEMP46 = X10_TEMP125.regSize;
		final int RX10_TEMP47 = 0;
		final boolean RX10_TEMP48 = RX10_TEMP46 <= RX10_TEMP47;
		if (RX10_TEMP48) {
			final String RX10_TEMP49 = "Operation low() not defined on empty region X10_TEMP125";
			throw new RuntimeException(RX10_TEMP49);
		}
		final int X10_TEMP152 = Program.regionLow(X10_TEMP125);
		final int X10_TEMP128 = 2;
		final int X10_TEMP130 = 3;
		final boolean X10_TEMP129 = X10_TEMP128 >= X10_TEMP130;
		if (X10_TEMP129) {
			final String X10_TEMP131 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP132 = ", expected 3";
			String X10_TEMP133 = X10_TEMP131 + X10_TEMP128;
			X10_TEMP133 = X10_TEMP133 + X10_TEMP132;
			throw new RuntimeException(X10_TEMP133);
		}
		final int X10_TEMP134 = 0;
		final int X10_TEMP135 = 1;
		final int X10_TEMP137 = X10_TEMP134 - X10_TEMP135;
		Region1 X10_TEMP136 = Program.createNewRegion1R(X10_TEMP134,
				X10_TEMP137);
		final int X10_TEMP138 = 0;
		final boolean X10_TEMP141 = X10_TEMP128 == X10_TEMP138;
		final int X10_TEMP139 = 1;
		final boolean X10_TEMP142 = X10_TEMP128 == X10_TEMP139;
		final int X10_TEMP140 = 2;
		final boolean X10_TEMP143 = X10_TEMP128 == X10_TEMP140;
		final int RX10_TEMP54 = 1;
		int RX10_TEMP52 = R.regSize;
		RX10_TEMP52 = RX10_TEMP52 - RX10_TEMP54;
		final int SX10_TEMP10 = 1;
		final int RX10_TEMP53 = RX10_TEMP52 + SX10_TEMP10;
		for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP53; SX10_TEMP11++) {
			final int RX10_TEMP50 = SX10_TEMP11;
			final int RX10_TEMP55 = RX10_TEMP50;
			final Point3 RX10_TEMP51 = Program.regionOrdinalPoint3(R,
					RX10_TEMP55);
			final int X10_TEMP144 = RX10_TEMP51.f0;
			final int X10_TEMP145 = RX10_TEMP51.f1;
			final int X10_TEMP146 = RX10_TEMP51.f2;
			if (X10_TEMP141) {
				final Region1 X10_TEMP147 = Program.createNewRegion1R(
						X10_TEMP144, X10_TEMP144);
				X10_TEMP136 = Program.unionRegion1(X10_TEMP136, X10_TEMP147);
			} else {
				if (X10_TEMP142) {
					final Region1 X10_TEMP147 = Program.createNewRegion1R(
							X10_TEMP145, X10_TEMP145);
					X10_TEMP136 = Program
							.unionRegion1(X10_TEMP136, X10_TEMP147);
				} else {
					if (X10_TEMP143) {
						final Region1 X10_TEMP147 = Program.createNewRegion1R(
								X10_TEMP146, X10_TEMP146);
						X10_TEMP136 = Program.unionRegion1(X10_TEMP136,
								X10_TEMP147);
					}
				}
			}
		}
		final Region1 X10_TEMP148 = X10_TEMP136;
		final int RX10_TEMP56 = X10_TEMP148.regSize;
		final int RX10_TEMP57 = 0;
		final boolean RX10_TEMP58 = RX10_TEMP56 <= RX10_TEMP57;
		if (RX10_TEMP58) {
			final String RX10_TEMP59 = "Operation high() not defined on empty region X10_TEMP148";
			throw new RuntimeException(RX10_TEMP59);
		}
		final int X10_TEMP149 = Program.regionHigh(X10_TEMP148);
		final int X10_TEMP150 = 1;
		final int X10_TEMP153 = X10_TEMP149 - X10_TEMP150;
		final Region3 X10_TEMP155 = Program.createNewRegion3RRR(X10_TEMP52,
				X10_TEMP53, X10_TEMP102, X10_TEMP103, X10_TEMP152, X10_TEMP153);
		return X10_TEMP155;
	}

	public static Region3 LevelData_getRegion(final LevelData X10_TEMP0,
			final int a_idx) {
		final Region3RefArray1 X10_TEMP1 = X10_TEMP0.m_REGIONs;
		final Point1 RX10_TEMP0 = new Point1(a_idx);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		final Region3 RX10_TEMP11 = Program.getRefArrayValue1Region3(X10_TEMP1,
				RX10_TEMP3);
		final Region3 X10_TEMP3 = RX10_TEMP11;
		return X10_TEMP3;
	}

	public static void LevelData_print(final LevelData X10_TEMP0) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					double res = 0;
					final WrapperRefArray1 X10_TEMP6 = X10_TEMP0.m_u;
					final Point1 RX10_TEMP12 = new Point1(i);
					final Dist1 RX10_TEMP13 = X10_TEMP6.distValue;
					final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
					final int RX10_TEMP15 = Program.searchPointInRegion1(
							RX10_TEMP14, RX10_TEMP12);
					final int RX10_TEMP16 = 0;
					final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP18 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP18);
					}
					final int RX10_TEMP19 = Program.getPlaceFromDist1(
							RX10_TEMP13, RX10_TEMP15);
					final int RX10_TEMP21 = /* here */0;
					final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
					if (RX10_TEMP22) {
						String RX10_TEMP20 = "Bad place access for array X10_TEMP6";
						throw new RuntimeException(RX10_TEMP20);
					}
					final Wrapper RX10_TEMP23 = Program
							.getRefArrayValue1Wrapper(X10_TEMP6, RX10_TEMP15);
					final Wrapper X10_TEMP8 = RX10_TEMP23;
					final doubleRefArray3 X10_TEMP9 = X10_TEMP8.m_array;
					doubleRefArray3 temp = X10_TEMP9;
					final Region3RefArray1 X10_TEMP11 = X10_TEMP0.m_REGIONs;
					final Point1 RX10_TEMP24 = new Point1(i);
					final Dist1 RX10_TEMP25 = X10_TEMP11.distValue;
					final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
					final int RX10_TEMP27 = Program.searchPointInRegion1(
							RX10_TEMP26, RX10_TEMP24);
					final int RX10_TEMP28 = 0;
					final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
					if (RX10_TEMP29) {
						String RX10_TEMP30 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP30);
					}
					final int RX10_TEMP31 = Program.getPlaceFromDist1(
							RX10_TEMP25, RX10_TEMP27);
					final int RX10_TEMP33 = /* here */0;
					final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
					if (RX10_TEMP34) {
						String RX10_TEMP32 = "Bad place access for array X10_TEMP11";
						throw new RuntimeException(RX10_TEMP32);
					}
					final Region3 RX10_TEMP35 = Program
							.getRefArrayValue1Region3(X10_TEMP11, RX10_TEMP27);
					final Region3 X10_TEMP14 = RX10_TEMP35;
					final int RX10_TEMP39 = 1;
					int RX10_TEMP37 = X10_TEMP14.regSize;
					RX10_TEMP37 = RX10_TEMP37 - RX10_TEMP39;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP38 = RX10_TEMP37 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP38; SX10_TEMP3++) {
						final int RX10_TEMP36 = SX10_TEMP3;
						final int RX10_TEMP40 = RX10_TEMP36;
						final Point3 p = Program.regionOrdinalPoint3(
								X10_TEMP14, RX10_TEMP40);
						final Dist3 RX10_TEMP41 = temp.distValue;
						final Region3 RX10_TEMP42 = RX10_TEMP41.dReg;
						final int RX10_TEMP43 = Program.searchPointInRegion3(
								RX10_TEMP42, p);
						final int RX10_TEMP44 = 0;
						final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
						if (RX10_TEMP45) {
							String RX10_TEMP46 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP46);
						}
						final int RX10_TEMP47 = Program.getPlaceFromDist3(
								RX10_TEMP41, RX10_TEMP43);
						final int RX10_TEMP49 = /* here */0;
						final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
						if (RX10_TEMP50) {
							String RX10_TEMP48 = "Bad place access for array temp";
							throw new RuntimeException(RX10_TEMP48);
						}
						final double RX10_TEMP51 = Program
								.getRefArrayValue3double(temp, RX10_TEMP43);
						final double X10_TEMP17 = RX10_TEMP51;
						final double X10_TEMP18 = Math.abs(X10_TEMP17);
						final double X10_TEMP20 = res + X10_TEMP18;
						res = X10_TEMP20;
					}
					final String X10_TEMP21 = "block at place ";
					final String X10_TEMP22 = X10_TEMP21 + i;
					final String X10_TEMP23 = " : ";
					final String X10_TEMP24 = X10_TEMP22 + X10_TEMP23;
					final Dist3 RX10_TEMP52 = temp.distValue;
					final Region3 RX10_TEMP53 = RX10_TEMP52.dReg;
					final Region3 X10_TEMP25 = RX10_TEMP53;
					final String RX10_TEMP54 = Program
							.toStringRegion3(X10_TEMP25);
					final String X10_TEMP26 = X10_TEMP24 + RX10_TEMP54;
					final String X10_TEMP27 = " sum of m_u=";
					final String X10_TEMP28 = X10_TEMP26 + X10_TEMP27;
					final String X10_TEMP30 = X10_TEMP28 + res;
					System.out.println(X10_TEMP30);
				}
			}
		}
	}

	public static void LevelData_PRINT(final LevelData X10_TEMP0) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final String X10_TEMP5 = "block at place ";
					final String X10_TEMP6 = X10_TEMP5 + i;
					final String X10_TEMP7 = " : ";
					final String X10_TEMP9 = X10_TEMP6 + X10_TEMP7;
					System.out.println(X10_TEMP9);
					final WrapperRefArray1 X10_TEMP10 = X10_TEMP0.m_u;
					final Point1 RX10_TEMP12 = new Point1(i);
					final Dist1 RX10_TEMP13 = X10_TEMP10.distValue;
					final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
					final int RX10_TEMP15 = Program.searchPointInRegion1(
							RX10_TEMP14, RX10_TEMP12);
					final int RX10_TEMP16 = 0;
					final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP18 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP18);
					}
					final int RX10_TEMP19 = Program.getPlaceFromDist1(
							RX10_TEMP13, RX10_TEMP15);
					final int RX10_TEMP21 = /* here */0;
					final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
					if (RX10_TEMP22) {
						String RX10_TEMP20 = "Bad place access for array X10_TEMP10";
						throw new RuntimeException(RX10_TEMP20);
					}
					final Wrapper RX10_TEMP23 = Program
							.getRefArrayValue1Wrapper(X10_TEMP10, RX10_TEMP15);
					final Wrapper X10_TEMP12 = RX10_TEMP23;
					final doubleRefArray3 X10_TEMP13 = X10_TEMP12.m_array;
					doubleRefArray3 temp = X10_TEMP13;
					int counter = 0;
					final Region3RefArray1 X10_TEMP16 = X10_TEMP0.m_regions;
					final Point1 RX10_TEMP24 = new Point1(i);
					final Dist1 RX10_TEMP25 = X10_TEMP16.distValue;
					final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
					final int RX10_TEMP27 = Program.searchPointInRegion1(
							RX10_TEMP26, RX10_TEMP24);
					final int RX10_TEMP28 = 0;
					final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
					if (RX10_TEMP29) {
						String RX10_TEMP30 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP30);
					}
					final int RX10_TEMP31 = Program.getPlaceFromDist1(
							RX10_TEMP25, RX10_TEMP27);
					final int RX10_TEMP33 = /* here */0;
					final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
					if (RX10_TEMP34) {
						String RX10_TEMP32 = "Bad place access for array X10_TEMP16";
						throw new RuntimeException(RX10_TEMP32);
					}
					final Region3 RX10_TEMP35 = Program
							.getRefArrayValue1Region3(X10_TEMP16, RX10_TEMP27);
					final Region3 X10_TEMP19 = RX10_TEMP35;
					final int RX10_TEMP39 = 1;
					int RX10_TEMP37 = X10_TEMP19.regSize;
					RX10_TEMP37 = RX10_TEMP37 - RX10_TEMP39;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP38 = RX10_TEMP37 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP38; SX10_TEMP3++) {
						final int RX10_TEMP36 = SX10_TEMP3;
						final int RX10_TEMP40 = RX10_TEMP36;
						final Point3 p = Program.regionOrdinalPoint3(
								X10_TEMP19, RX10_TEMP40);
						final String X10_TEMP20 = " [";
						final String RX10_TEMP41 = Program.toStringPoint3(p);
						final String X10_TEMP21 = X10_TEMP20 + RX10_TEMP41;
						final String X10_TEMP22 = "]= ";
						final String X10_TEMP24 = X10_TEMP21 + X10_TEMP22;
						final Dist3 RX10_TEMP42 = temp.distValue;
						final Region3 RX10_TEMP43 = RX10_TEMP42.dReg;
						final int RX10_TEMP44 = Program.searchPointInRegion3(
								RX10_TEMP43, p);
						final int RX10_TEMP45 = 0;
						final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45;
						if (RX10_TEMP46) {
							String RX10_TEMP47 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP47);
						}
						final int RX10_TEMP48 = Program.getPlaceFromDist3(
								RX10_TEMP42, RX10_TEMP44);
						final int RX10_TEMP50 = /* here */0;
						final boolean RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50;
						if (RX10_TEMP51) {
							String RX10_TEMP49 = "Bad place access for array temp";
							throw new RuntimeException(RX10_TEMP49);
						}
						final double RX10_TEMP52 = Program
								.getRefArrayValue3double(temp, RX10_TEMP44);
						final double X10_TEMP25 = RX10_TEMP52;
						final String X10_TEMP27 = X10_TEMP24 + X10_TEMP25;
						System.out.print(X10_TEMP27);
						final int X10_TEMP28 = counter;
						final int X10_TEMP29 = 1;
						counter = counter + X10_TEMP29;
						final int X10_TEMP30 = 4;
						final boolean X10_TEMP32 = counter == X10_TEMP30;
						if (X10_TEMP32) {
							final String X10_TEMP34 = "\n";
							System.out.print(X10_TEMP34);
							final int X10_TEMP36 = 0;
							counter = X10_TEMP36;
						}
					}
					final String X10_TEMP38 = "";
					System.out.println(X10_TEMP38);
				}
			}
		}
	}

	public static double LevelData_norm2(final LevelData X10_TEMP0) {
		final Dist1 X10_TEMP1 = X10_TEMP0.m_places;
		final Region1 RX10_TEMP0 = X10_TEMP1.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(X10_TEMP1,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final double[] RX10_TEMP14 = new double[RX10_TEMP13];
					final doubleStub RX10_TEMP15 = new doubleStub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP6 = new doubleStub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final doubleStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final doubleStub[] RX10_TEMP16 = SX10_TEMP6;
		final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1(X10_TEMP1,
				RX10_TEMP16);
		final doubleRefArray1 results = RX10_TEMP19; /* finish */
		{
			final Dist1 X10_TEMP4 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP21 = X10_TEMP4.dReg;
			final int RX10_TEMP24 = 1;
			int RX10_TEMP22 = RX10_TEMP21.regSize;
			RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24;
			final int SX10_TEMP9 = 1;
			final int RX10_TEMP23 = RX10_TEMP22 + SX10_TEMP9;
			for (int SX10_TEMP10 = 0; SX10_TEMP10 < RX10_TEMP23; SX10_TEMP10++) {
				final int RX10_TEMP20 = SX10_TEMP10;
				final int RX10_TEMP25 = RX10_TEMP20;
				final Point1 X10_TEMP5 = Program.regionOrdinalPoint1(
						RX10_TEMP21, RX10_TEMP25);
				final int i = X10_TEMP5.f0;
				final Region1 RX10_TEMP26 = X10_TEMP4.dReg;
				final int RX10_TEMP27 = Program.searchPointInRegion1(
						RX10_TEMP26, X10_TEMP5);
				final int RX10_TEMP28 = 0;
				final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
				if (RX10_TEMP29) {
					final String RX10_TEMP30 = "Point X10_TEMP5 not found in the distribution X10_TEMP4.";
					throw new RuntimeException(RX10_TEMP30);
				}
				final int RX10_TEMP31 = Program.getPlaceFromDist1(X10_TEMP4,
						RX10_TEMP27);
				final int X10_TEMP6 = RX10_TEMP31; /* async ( X10_TEMP6 ) */
				{
					double res = 0;
					final WrapperRefArray1 X10_TEMP8 = X10_TEMP0.m_u;
					final Point1 RX10_TEMP32 = new Point1(i);
					final Dist1 RX10_TEMP33 = X10_TEMP8.distValue;
					final Region1 RX10_TEMP34 = RX10_TEMP33.dReg;
					final int RX10_TEMP35 = Program.searchPointInRegion1(
							RX10_TEMP34, RX10_TEMP32);
					final int RX10_TEMP36 = 0;
					final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36;
					if (RX10_TEMP37) {
						String RX10_TEMP38 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP38);
					}
					final int RX10_TEMP39 = Program.getPlaceFromDist1(
							RX10_TEMP33, RX10_TEMP35);
					final int RX10_TEMP41 = /* here */0;
					final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41;
					if (RX10_TEMP42) {
						String RX10_TEMP40 = "Bad place access for array X10_TEMP8";
						throw new RuntimeException(RX10_TEMP40);
					}
					final Wrapper RX10_TEMP43 = Program
							.getRefArrayValue1Wrapper(X10_TEMP8, RX10_TEMP35);
					final Wrapper X10_TEMP10 = RX10_TEMP43;
					final doubleRefArray3 X10_TEMP11 = X10_TEMP10.m_array;
					final doubleRefArray3 temp = X10_TEMP11;
					final Region3 X10_TEMP15 = Program.LevelData_get_m_regions(
							X10_TEMP0, i);
					final int RX10_TEMP47 = 1;
					int RX10_TEMP45 = X10_TEMP15.regSize;
					RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP47;
					final int SX10_TEMP11 = 1;
					final int RX10_TEMP46 = RX10_TEMP45 + SX10_TEMP11;
					for (int SX10_TEMP12 = 0; SX10_TEMP12 < RX10_TEMP46; SX10_TEMP12++) {
						final int RX10_TEMP44 = SX10_TEMP12;
						final int RX10_TEMP48 = RX10_TEMP44;
						final Point3 p = Program.regionOrdinalPoint3(
								X10_TEMP15, RX10_TEMP48);
						final int h = /* here */0;
						final int X10_TEMP19 = 0;
						final int X10_TEMP20 = 0;
						final Region1 X10_TEMP21 = Program.createNewRegion1R(
								X10_TEMP19, X10_TEMP20);
						final int X10_TEMP22 = /* here */0;
						final Dist1 X10_TEMP24 = Program.getPlaceDist1(
								X10_TEMP21, X10_TEMP22);
						final Dist1 dRecv = X10_TEMP24;
						final Region1 RX10_TEMP49 = dRecv.dReg;
						final int RX10_TEMP50 = 0;
						final int RX10_TEMP51 = 1;
						int RX10_TEMP52 = /* place.MAX_PLACES */1;
						RX10_TEMP52 = RX10_TEMP52 - RX10_TEMP51;
						final int SX10_TEMP13 = 1;
						final int RX10_TEMP53 = RX10_TEMP52 + SX10_TEMP13;
						final int SX10_TEMP14 = 1;
						final int RX10_TEMP54 = RX10_TEMP52 + SX10_TEMP14;
						final doubleStub[] RX10_TEMP55 = new doubleStub[RX10_TEMP54]; /* finish */
						{
							for (int SX10_TEMP16 = 0; SX10_TEMP16 < RX10_TEMP53; SX10_TEMP16++) {
								final int RX10_TEMP56 = SX10_TEMP16;
								final int RX10_TEMP57 = /* here */0;
								final int RX10_TEMP58 = RX10_TEMP56;
								final int RX10_TEMP59 = /*
														 * place.places (
														 * RX10_TEMP58 )
														 */0;
								final int RX10_TEMP60 = Program
										.getDistLocalCount1(dRecv, RX10_TEMP58);
								final int RX10_TEMP61 = RX10_TEMP60
										- RX10_TEMP51; /* async ( RX10_TEMP59 ) */
								{
									final int SX10_TEMP17 = 1;
									final int RX10_TEMP62 = RX10_TEMP61
											+ SX10_TEMP17;
									final double[] RX10_TEMP63 = new double[RX10_TEMP62];
									final doubleStub RX10_TEMP64 = new doubleStub(
											RX10_TEMP63); /* async ( RX10_TEMP57 ) */
									{
										RX10_TEMP55[RX10_TEMP56] = RX10_TEMP64;
									}
								}
							}
						}
						final doubleStub[] SX10_TEMP19 = new doubleStub[RX10_TEMP53];
						final int SX10_TEMP21 = SX10_TEMP19.length;
						for (int SX10_TEMP20 = 0; SX10_TEMP20 < SX10_TEMP21; SX10_TEMP20++) {
							final int RX10_TEMP67 = SX10_TEMP20;
							final doubleStub RX10_TEMP66 = RX10_TEMP55[RX10_TEMP67];
							SX10_TEMP19[RX10_TEMP67] = RX10_TEMP66;
						}
						final doubleStub[] RX10_TEMP65 = SX10_TEMP19;
						final doubleRefArray1 RX10_TEMP68 = new doubleRefArray1(
								dRecv, RX10_TEMP65);
						final doubleRefArray1 aRecv = RX10_TEMP68; /* finish */
						{
							final Dist3 RX10_TEMP69 = temp.distValue;
							final Dist3 X10_TEMP27 = RX10_TEMP69;
							final Region3 RX10_TEMP70 = X10_TEMP27.dReg;
							final int RX10_TEMP71 = Program
									.searchPointInRegion3(RX10_TEMP70, p);
							final int RX10_TEMP72 = 0;
							final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72;
							if (RX10_TEMP73) {
								final String RX10_TEMP74 = "Point p not found in the distribution X10_TEMP27.";
								throw new RuntimeException(RX10_TEMP74);
							}
							final int RX10_TEMP75 = Program.getPlaceFromDist3(
									X10_TEMP27, RX10_TEMP71);
							final int X10_TEMP30 = RX10_TEMP75; /*
																 * async (
																 * X10_TEMP30 )
																 */
							{
								final Dist3 RX10_TEMP76 = temp.distValue;
								final Region3 RX10_TEMP77 = RX10_TEMP76.dReg;
								final int RX10_TEMP78 = Program
										.searchPointInRegion3(RX10_TEMP77, p);
								final int RX10_TEMP79 = 0;
								final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79;
								if (RX10_TEMP80) {
									String RX10_TEMP81 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP81);
								}
								final int RX10_TEMP82 = Program
										.getPlaceFromDist3(RX10_TEMP76,
												RX10_TEMP78);
								final int RX10_TEMP84 = /* here */0;
								final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84;
								if (RX10_TEMP85) {
									String RX10_TEMP83 = "Bad place access for array temp";
									throw new RuntimeException(RX10_TEMP83);
								}
								final double RX10_TEMP86 = Program
										.getRefArrayValue3double(temp,
												RX10_TEMP78);
								final double X10_TEMP33 = RX10_TEMP86;
								final Dist3 RX10_TEMP87 = temp.distValue;
								final Region3 RX10_TEMP88 = RX10_TEMP87.dReg;
								final int RX10_TEMP89 = Program
										.searchPointInRegion3(RX10_TEMP88, p);
								final int RX10_TEMP90 = 0;
								final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;
								if (RX10_TEMP91) {
									String RX10_TEMP92 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP92);
								}
								final int RX10_TEMP93 = Program
										.getPlaceFromDist3(RX10_TEMP87,
												RX10_TEMP89);
								final int RX10_TEMP95 = /* here */0;
								final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95;
								if (RX10_TEMP96) {
									String RX10_TEMP94 = "Bad place access for array temp";
									throw new RuntimeException(RX10_TEMP94);
								}
								final double RX10_TEMP97 = Program
										.getRefArrayValue3double(temp,
												RX10_TEMP89);
								final double X10_TEMP34 = RX10_TEMP97;
								final double temp3 = X10_TEMP33 * X10_TEMP34; /*
																			 * async
																			 * (
																			 * h
																			 * )
																			 */
								{
									final int X10_TEMP38 = 0;
									final double X10_TEMP41 = temp3;
									final Point1 RX10_TEMP98 = new Point1(
											X10_TEMP38);
									final Dist1 RX10_TEMP99 = aRecv.distValue;
									final Region1 RX10_TEMP100 = RX10_TEMP99.dReg;
									final int RX10_TEMP101 = Program
											.searchPointInRegion1(RX10_TEMP100,
													RX10_TEMP98);
									final int RX10_TEMP102 = 0;
									final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102;
									if (RX10_TEMP103) {
										String RX10_TEMP104 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP104);
									}
									final int RX10_TEMP105 = Program
											.getPlaceFromDist1(RX10_TEMP99,
													RX10_TEMP101);
									final int RX10_TEMP107 = /* here */0;
									final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107;
									if (RX10_TEMP108) {
										String RX10_TEMP106 = "Bad place access for array aRecv";
										throw new RuntimeException(RX10_TEMP106);
									}
									Program.setRefArrayValue1double(aRecv,
											RX10_TEMP101, X10_TEMP41);
								}
							}
						}
						final int X10_TEMP43 = 0;
						final Point1 RX10_TEMP109 = new Point1(X10_TEMP43);
						final Dist1 RX10_TEMP110 = aRecv.distValue;
						final Region1 RX10_TEMP111 = RX10_TEMP110.dReg;
						final int RX10_TEMP112 = Program.searchPointInRegion1(
								RX10_TEMP111, RX10_TEMP109);
						final int RX10_TEMP113 = 0;
						final boolean RX10_TEMP114 = RX10_TEMP112 < RX10_TEMP113;
						if (RX10_TEMP114) {
							String RX10_TEMP115 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP115);
						}
						final int RX10_TEMP116 = Program.getPlaceFromDist1(
								RX10_TEMP110, RX10_TEMP112);
						final int RX10_TEMP118 = /* here */0;
						final boolean RX10_TEMP119 = RX10_TEMP116 != RX10_TEMP118;
						if (RX10_TEMP119) {
							String RX10_TEMP117 = "Bad place access for array aRecv";
							throw new RuntimeException(RX10_TEMP117);
						}
						final double RX10_TEMP120 = Program
								.getRefArrayValue1double(aRecv, RX10_TEMP112);
						final double X10_TEMP44 = RX10_TEMP120;
						final double X10_TEMP46 = res + X10_TEMP44;
						res = X10_TEMP46;
					}
					final double X10_TEMP50 = res;
					final Point1 RX10_TEMP121 = new Point1(i);
					final Dist1 RX10_TEMP122 = results.distValue;
					final Region1 RX10_TEMP123 = RX10_TEMP122.dReg;
					final int RX10_TEMP124 = Program.searchPointInRegion1(
							RX10_TEMP123, RX10_TEMP121);
					final int RX10_TEMP125 = 0;
					final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125;
					if (RX10_TEMP126) {
						String RX10_TEMP127 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP127);
					}
					final int RX10_TEMP128 = Program.getPlaceFromDist1(
							RX10_TEMP122, RX10_TEMP124);
					final int RX10_TEMP130 = /* here */0;
					final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130;
					if (RX10_TEMP131) {
						String RX10_TEMP129 = "Bad place access for array results";
						throw new RuntimeException(RX10_TEMP129);
					}
					Program.setRefArrayValue1double(results, RX10_TEMP124,
							X10_TEMP50);
				}
			}
		}
		final double X10_TEMP57 = Program.doublerefArraySum1(results);
		final int X10_TEMP51 = X10_TEMP0.SIZE;
		final int X10_TEMP52 = X10_TEMP0.SIZE;
		final int X10_TEMP53 = X10_TEMP51 * X10_TEMP52;
		final int X10_TEMP54 = X10_TEMP0.SIZE;
		final int X10_TEMP56 = X10_TEMP53 * X10_TEMP54;
		double temp = X10_TEMP57 / X10_TEMP56;
		System.out.println(temp+"temp");
		final double X10_TEMP61 = Math.sqrt(temp);
		System.out.println(X10_TEMP61+"X10_TEMP61");
		return X10_TEMP61;
	}

	public static void LevelData_initialize(final LevelData X10_TEMP0,
			final int a_CLASS) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final WrapperRefArray1 X10_TEMP5 = X10_TEMP0.m_u;
					final Point1 RX10_TEMP12 = new Point1(i);
					final Dist1 RX10_TEMP13 = X10_TEMP5.distValue;
					final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
					final int RX10_TEMP15 = Program.searchPointInRegion1(
							RX10_TEMP14, RX10_TEMP12);
					final int RX10_TEMP16 = 0;
					final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP18 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP18);
					}
					final int RX10_TEMP19 = Program.getPlaceFromDist1(
							RX10_TEMP13, RX10_TEMP15);
					final int RX10_TEMP21 = /* here */0;
					final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
					if (RX10_TEMP22) {
						String RX10_TEMP20 = "Bad place access for array X10_TEMP5";
						throw new RuntimeException(RX10_TEMP20);
					}
					final Wrapper RX10_TEMP23 = Program
							.getRefArrayValue1Wrapper(X10_TEMP5, RX10_TEMP15);
					final Wrapper X10_TEMP7 = RX10_TEMP23;
					final doubleRefArray3 X10_TEMP8 = X10_TEMP7.m_array;
					final doubleRefArray3 temp = X10_TEMP8;
					final Region3 R = Program.LevelData_get_m_regions(
							X10_TEMP0, i);
					final int X10_TEMP13 = /* here */0;
					final Dist3 RX10_TEMP25 = temp.distValue;
					final Region3 RX10_TEMP26 = RX10_TEMP25.dReg;
					final int RX10_TEMP29 = 1;
					int RX10_TEMP27 = RX10_TEMP26.regSize;
					RX10_TEMP27 = RX10_TEMP27 - RX10_TEMP29;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP28 = RX10_TEMP27 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP28; SX10_TEMP3++) {
						final int RX10_TEMP24 = SX10_TEMP3;
						final int RX10_TEMP30 = RX10_TEMP24;
						final Point3 p = Program.regionOrdinalPoint3(
								RX10_TEMP26, RX10_TEMP30);
						final int x = p.f0;
						final int y = p.f1;
						final int z = p.f2; /* async ( X10_TEMP13 ) */
						{
							final int X10_TEMP16 = 1;
							final int X10_TEMP298 = 2;
							final int X10_TEMP580 = 3;
							final int X10_TEMP582 = 4;
							final int X10_TEMP864 = 5;
							final int X10_TEMP1146 = 6;
							switch (a_CLASS) {
							case X10_TEMP16: {
								final int X10_TEMP17 = 0;
								final boolean X10_TEMP19 = x == X10_TEMP17;
								final int X10_TEMP20 = 11;
								final boolean X10_TEMP22 = y == X10_TEMP20;
								final boolean X10_TEMP26 = X10_TEMP19
										&& X10_TEMP22;
								final int X10_TEMP23 = 2;
								final boolean X10_TEMP25 = z == X10_TEMP23;
								final boolean X10_TEMP28 = X10_TEMP26
										&& X10_TEMP25;
								final int X10_TEMP29 = 13;
								final boolean X10_TEMP31 = x == X10_TEMP29;
								final int X10_TEMP32 = 8;
								final boolean X10_TEMP34 = y == X10_TEMP32;
								final boolean X10_TEMP38 = X10_TEMP31
										&& X10_TEMP34;
								final int X10_TEMP35 = 17;
								final boolean X10_TEMP37 = z == X10_TEMP35;
								final boolean X10_TEMP40 = X10_TEMP38
										&& X10_TEMP37;
								final boolean X10_TEMP53 = X10_TEMP28
										|| X10_TEMP40;
								final int X10_TEMP41 = 5;
								final boolean X10_TEMP43 = x == X10_TEMP41;
								final int X10_TEMP44 = 14;
								final boolean X10_TEMP46 = y == X10_TEMP44;
								final boolean X10_TEMP50 = X10_TEMP43
										&& X10_TEMP46;
								final int X10_TEMP47 = 0;
								final boolean X10_TEMP49 = z == X10_TEMP47;
								final boolean X10_TEMP52 = X10_TEMP50
										&& X10_TEMP49;
								final boolean X10_TEMP66 = X10_TEMP53
										|| X10_TEMP52;
								final int X10_TEMP54 = 4;
								final boolean X10_TEMP56 = x == X10_TEMP54;
								final int X10_TEMP57 = 28;
								final boolean X10_TEMP59 = y == X10_TEMP57;
								final boolean X10_TEMP63 = X10_TEMP56
										&& X10_TEMP59;
								final int X10_TEMP60 = 15;
								final boolean X10_TEMP62 = z == X10_TEMP60;
								final boolean X10_TEMP65 = X10_TEMP63
										&& X10_TEMP62;
								final boolean X10_TEMP79 = X10_TEMP66
										|| X10_TEMP65;
								final int X10_TEMP67 = 12;
								final boolean X10_TEMP69 = x == X10_TEMP67;
								final int X10_TEMP70 = 2;
								final boolean X10_TEMP72 = y == X10_TEMP70;
								final boolean X10_TEMP76 = X10_TEMP69
										&& X10_TEMP72;
								final int X10_TEMP73 = 1;
								final boolean X10_TEMP75 = z == X10_TEMP73;
								final boolean X10_TEMP78 = X10_TEMP76
										&& X10_TEMP75;
								final boolean X10_TEMP92 = X10_TEMP79
										|| X10_TEMP78;
								final int X10_TEMP80 = 5;
								final boolean X10_TEMP82 = x == X10_TEMP80;
								final int X10_TEMP83 = 17;
								final boolean X10_TEMP85 = y == X10_TEMP83;
								final boolean X10_TEMP89 = X10_TEMP82
										&& X10_TEMP85;
								final int X10_TEMP86 = 8;
								final boolean X10_TEMP88 = z == X10_TEMP86;
								final boolean X10_TEMP91 = X10_TEMP89
										&& X10_TEMP88;
								final boolean X10_TEMP105 = X10_TEMP92
										|| X10_TEMP91;
								final int X10_TEMP93 = 20;
								final boolean X10_TEMP95 = x == X10_TEMP93;
								final int X10_TEMP96 = 19;
								final boolean X10_TEMP98 = y == X10_TEMP96;
								final boolean X10_TEMP102 = X10_TEMP95
										&& X10_TEMP98;
								final int X10_TEMP99 = 11;
								final boolean X10_TEMP101 = z == X10_TEMP99;
								final boolean X10_TEMP104 = X10_TEMP102
										&& X10_TEMP101;
								final boolean X10_TEMP118 = X10_TEMP105
										|| X10_TEMP104;
								final int X10_TEMP106 = 26;
								final boolean X10_TEMP108 = x == X10_TEMP106;
								final int X10_TEMP109 = 15;
								final boolean X10_TEMP111 = y == X10_TEMP109;
								final boolean X10_TEMP115 = X10_TEMP108
										&& X10_TEMP111;
								final int X10_TEMP112 = 31;
								final boolean X10_TEMP114 = z == X10_TEMP112;
								final boolean X10_TEMP117 = X10_TEMP115
										&& X10_TEMP114;
								final boolean X10_TEMP131 = X10_TEMP118
										|| X10_TEMP117;
								final int X10_TEMP119 = 8;
								final boolean X10_TEMP121 = x == X10_TEMP119;
								final int X10_TEMP122 = 25;
								final boolean X10_TEMP124 = y == X10_TEMP122;
								final boolean X10_TEMP128 = X10_TEMP121
										&& X10_TEMP124;
								final int X10_TEMP125 = 22;
								final boolean X10_TEMP127 = z == X10_TEMP125;
								final boolean X10_TEMP130 = X10_TEMP128
										&& X10_TEMP127;
								final boolean X10_TEMP144 = X10_TEMP131
										|| X10_TEMP130;
								final int X10_TEMP132 = 7;
								final boolean X10_TEMP134 = x == X10_TEMP132;
								final int X10_TEMP135 = 14;
								final boolean X10_TEMP137 = y == X10_TEMP135;
								final boolean X10_TEMP141 = X10_TEMP134
										&& X10_TEMP137;
								final int X10_TEMP138 = 26;
								final boolean X10_TEMP140 = z == X10_TEMP138;
								final boolean X10_TEMP143 = X10_TEMP141
										&& X10_TEMP140;
								final boolean X10_TEMP146 = X10_TEMP144
										|| X10_TEMP143;
								final boolean RX10_TEMP31 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP148 = RX10_TEMP31;
								final boolean X10_TEMP150 = X10_TEMP146
										&& X10_TEMP148;
								if (X10_TEMP150) {
									final int X10_TEMP152 = 1;
									final int X10_TEMP153 = 0;
									final double X10_TEMP156 = X10_TEMP153
											- X10_TEMP152;
									final double X10_TEMP157 = X10_TEMP156;
									final Dist3 RX10_TEMP32 = temp.distValue;
									final Region3 RX10_TEMP33 = RX10_TEMP32.dReg;
									final int RX10_TEMP34 = Program
											.searchPointInRegion3(RX10_TEMP33,
													p);
									final int RX10_TEMP35 = 0;
									final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35;
									if (RX10_TEMP36) {
										String RX10_TEMP37 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP37);
									}
									final int RX10_TEMP38 = Program
											.getPlaceFromDist3(RX10_TEMP32,
													RX10_TEMP34);
									final int RX10_TEMP40 = /* here */0;
									final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40;
									if (RX10_TEMP41) {
										String RX10_TEMP39 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP39);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP34, X10_TEMP157);
								}
								final int X10_TEMP158 = 7;
								final boolean X10_TEMP160 = x == X10_TEMP158;
								final int X10_TEMP161 = 1;
								final boolean X10_TEMP163 = y == X10_TEMP161;
								final boolean X10_TEMP167 = X10_TEMP160
										&& X10_TEMP163;
								final int X10_TEMP164 = 20;
								final boolean X10_TEMP166 = z == X10_TEMP164;
								final boolean X10_TEMP169 = X10_TEMP167
										&& X10_TEMP166;
								final int X10_TEMP170 = 19;
								final boolean X10_TEMP172 = x == X10_TEMP170;
								final int X10_TEMP173 = 29;
								final boolean X10_TEMP175 = y == X10_TEMP173;
								final boolean X10_TEMP179 = X10_TEMP172
										&& X10_TEMP175;
								final int X10_TEMP176 = 31;
								final boolean X10_TEMP178 = z == X10_TEMP176;
								final boolean X10_TEMP181 = X10_TEMP179
										&& X10_TEMP178;
								final boolean X10_TEMP194 = X10_TEMP169
										|| X10_TEMP181;
								final int X10_TEMP182 = 2;
								final boolean X10_TEMP184 = x == X10_TEMP182;
								final int X10_TEMP185 = 0;
								final boolean X10_TEMP187 = y == X10_TEMP185;
								final boolean X10_TEMP191 = X10_TEMP184
										&& X10_TEMP187;
								final int X10_TEMP188 = 3;
								final boolean X10_TEMP190 = z == X10_TEMP188;
								final boolean X10_TEMP193 = X10_TEMP191
										&& X10_TEMP190;
								final boolean X10_TEMP207 = X10_TEMP194
										|| X10_TEMP193;
								final int X10_TEMP195 = 4;
								final boolean X10_TEMP197 = x == X10_TEMP195;
								final int X10_TEMP198 = 22;
								final boolean X10_TEMP200 = y == X10_TEMP198;
								final boolean X10_TEMP204 = X10_TEMP197
										&& X10_TEMP200;
								final int X10_TEMP201 = 3;
								final boolean X10_TEMP203 = z == X10_TEMP201;
								final boolean X10_TEMP206 = X10_TEMP204
										&& X10_TEMP203;
								final boolean X10_TEMP220 = X10_TEMP207
										|| X10_TEMP206;
								final int X10_TEMP208 = 1;
								final boolean X10_TEMP210 = x == X10_TEMP208;
								final int X10_TEMP211 = 16;
								final boolean X10_TEMP213 = y == X10_TEMP211;
								final boolean X10_TEMP217 = X10_TEMP210
										&& X10_TEMP213;
								final int X10_TEMP214 = 21;
								final boolean X10_TEMP216 = z == X10_TEMP214;
								final boolean X10_TEMP219 = X10_TEMP217
										&& X10_TEMP216;
								final boolean X10_TEMP233 = X10_TEMP220
										|| X10_TEMP219;
								final int X10_TEMP221 = 21;
								final boolean X10_TEMP223 = x == X10_TEMP221;
								final int X10_TEMP224 = 31;
								final boolean X10_TEMP226 = y == X10_TEMP224;
								final boolean X10_TEMP230 = X10_TEMP223
										&& X10_TEMP226;
								final int X10_TEMP227 = 6;
								final boolean X10_TEMP229 = z == X10_TEMP227;
								final boolean X10_TEMP232 = X10_TEMP230
										&& X10_TEMP229;
								final boolean X10_TEMP246 = X10_TEMP233
										|| X10_TEMP232;
								final int X10_TEMP234 = 12;
								final boolean X10_TEMP236 = x == X10_TEMP234;
								final int X10_TEMP237 = 15;
								final boolean X10_TEMP239 = y == X10_TEMP237;
								final boolean X10_TEMP243 = X10_TEMP236
										&& X10_TEMP239;
								final int X10_TEMP240 = 12;
								final boolean X10_TEMP242 = z == X10_TEMP240;
								final boolean X10_TEMP245 = X10_TEMP243
										&& X10_TEMP242;
								final boolean X10_TEMP259 = X10_TEMP246
										|| X10_TEMP245;
								final int X10_TEMP247 = 30;
								final boolean X10_TEMP249 = x == X10_TEMP247;
								final int X10_TEMP250 = 4;
								final boolean X10_TEMP252 = y == X10_TEMP250;
								final boolean X10_TEMP256 = X10_TEMP249
										&& X10_TEMP252;
								final int X10_TEMP253 = 25;
								final boolean X10_TEMP255 = z == X10_TEMP253;
								final boolean X10_TEMP258 = X10_TEMP256
										&& X10_TEMP255;
								final boolean X10_TEMP272 = X10_TEMP259
										|| X10_TEMP258;
								final int X10_TEMP260 = 28;
								final boolean X10_TEMP262 = x == X10_TEMP260;
								final int X10_TEMP263 = 0;
								final boolean X10_TEMP265 = y == X10_TEMP263;
								final boolean X10_TEMP269 = X10_TEMP262
										&& X10_TEMP265;
								final int X10_TEMP266 = 28;
								final boolean X10_TEMP268 = z == X10_TEMP266;
								final boolean X10_TEMP271 = X10_TEMP269
										&& X10_TEMP268;
								final boolean X10_TEMP285 = X10_TEMP272
										|| X10_TEMP271;
								final int X10_TEMP273 = 17;
								final boolean X10_TEMP275 = x == X10_TEMP273;
								final int X10_TEMP276 = 26;
								final boolean X10_TEMP278 = y == X10_TEMP276;
								final boolean X10_TEMP282 = X10_TEMP275
										&& X10_TEMP278;
								final int X10_TEMP279 = 17;
								final boolean X10_TEMP281 = z == X10_TEMP279;
								final boolean X10_TEMP284 = X10_TEMP282
										&& X10_TEMP281;
								final boolean X10_TEMP287 = X10_TEMP285
										|| X10_TEMP284;
								final boolean RX10_TEMP42 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP289 = RX10_TEMP42;
								final boolean X10_TEMP291 = X10_TEMP287
										&& X10_TEMP289;
								if (X10_TEMP291) {
									final double X10_TEMP295 = 1;
									final double X10_TEMP296 = X10_TEMP295;
									final Dist3 RX10_TEMP43 = temp.distValue;
									final Region3 RX10_TEMP44 = RX10_TEMP43.dReg;
									final int RX10_TEMP45 = Program
											.searchPointInRegion3(RX10_TEMP44,
													p);
									final int RX10_TEMP46 = 0;
									final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
									if (RX10_TEMP47) {
										String RX10_TEMP48 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP48);
									}
									final int RX10_TEMP49 = Program
											.getPlaceFromDist3(RX10_TEMP43,
													RX10_TEMP45);
									final int RX10_TEMP51 = /* here */0;
									final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
									if (RX10_TEMP52) {
										String RX10_TEMP50 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP50);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP45, X10_TEMP296);
								}
								break;
							}
							case X10_TEMP298: {
								final int X10_TEMP299 = 38;
								final boolean X10_TEMP301 = x == X10_TEMP299;
								final int X10_TEMP302 = 60;
								final boolean X10_TEMP304 = y == X10_TEMP302;
								final boolean X10_TEMP308 = X10_TEMP301
										&& X10_TEMP304;
								final int X10_TEMP305 = 51;
								final boolean X10_TEMP307 = z == X10_TEMP305;
								final boolean X10_TEMP310 = X10_TEMP308
										&& X10_TEMP307;
								final int X10_TEMP311 = 50;
								final boolean X10_TEMP313 = x == X10_TEMP311;
								final int X10_TEMP314 = 15;
								final boolean X10_TEMP316 = y == X10_TEMP314;
								final boolean X10_TEMP320 = X10_TEMP313
										&& X10_TEMP316;
								final int X10_TEMP317 = 23;
								final boolean X10_TEMP319 = z == X10_TEMP317;
								final boolean X10_TEMP322 = X10_TEMP320
										&& X10_TEMP319;
								final boolean X10_TEMP335 = X10_TEMP310
										|| X10_TEMP322;
								final int X10_TEMP323 = 18;
								final boolean X10_TEMP325 = x == X10_TEMP323;
								final int X10_TEMP326 = 45;
								final boolean X10_TEMP328 = y == X10_TEMP326;
								final boolean X10_TEMP332 = X10_TEMP325
										&& X10_TEMP328;
								final int X10_TEMP329 = 36;
								final boolean X10_TEMP331 = z == X10_TEMP329;
								final boolean X10_TEMP334 = X10_TEMP332
										&& X10_TEMP331;
								final boolean X10_TEMP348 = X10_TEMP335
										|| X10_TEMP334;
								final int X10_TEMP336 = 25;
								final boolean X10_TEMP338 = x == X10_TEMP336;
								final int X10_TEMP339 = 14;
								final boolean X10_TEMP341 = y == X10_TEMP339;
								final boolean X10_TEMP345 = X10_TEMP338
										&& X10_TEMP341;
								final int X10_TEMP342 = 36;
								final boolean X10_TEMP344 = z == X10_TEMP342;
								final boolean X10_TEMP347 = X10_TEMP345
										&& X10_TEMP344;
								final boolean X10_TEMP361 = X10_TEMP348
										|| X10_TEMP347;
								final int X10_TEMP349 = 26;
								final boolean X10_TEMP351 = x == X10_TEMP349;
								final int X10_TEMP352 = 25;
								final boolean X10_TEMP354 = y == X10_TEMP352;
								final boolean X10_TEMP358 = X10_TEMP351
										&& X10_TEMP354;
								final int X10_TEMP355 = 25;
								final boolean X10_TEMP357 = z == X10_TEMP355;
								final boolean X10_TEMP360 = X10_TEMP358
										&& X10_TEMP357;
								final boolean X10_TEMP374 = X10_TEMP361
										|| X10_TEMP360;
								final int X10_TEMP362 = 32;
								final boolean X10_TEMP364 = x == X10_TEMP362;
								final int X10_TEMP365 = 37;
								final boolean X10_TEMP367 = y == X10_TEMP365;
								final boolean X10_TEMP371 = X10_TEMP364
										&& X10_TEMP367;
								final int X10_TEMP368 = 0;
								final boolean X10_TEMP370 = z == X10_TEMP368;
								final boolean X10_TEMP373 = X10_TEMP371
										&& X10_TEMP370;
								final boolean X10_TEMP387 = X10_TEMP374
										|| X10_TEMP373;
								final int X10_TEMP375 = 29;
								final boolean X10_TEMP377 = x == X10_TEMP375;
								final int X10_TEMP378 = 62;
								final boolean X10_TEMP380 = y == X10_TEMP378;
								final boolean X10_TEMP384 = X10_TEMP377
										&& X10_TEMP380;
								final int X10_TEMP381 = 54;
								final boolean X10_TEMP383 = z == X10_TEMP381;
								final boolean X10_TEMP386 = X10_TEMP384
										&& X10_TEMP383;
								final boolean X10_TEMP400 = X10_TEMP387
										|| X10_TEMP386;
								final int X10_TEMP388 = 39;
								final boolean X10_TEMP390 = x == X10_TEMP388;
								final int X10_TEMP391 = 49;
								final boolean X10_TEMP393 = y == X10_TEMP391;
								final boolean X10_TEMP397 = X10_TEMP390
										&& X10_TEMP393;
								final int X10_TEMP394 = 57;
								final boolean X10_TEMP396 = z == X10_TEMP394;
								final boolean X10_TEMP399 = X10_TEMP397
										&& X10_TEMP396;
								final boolean X10_TEMP413 = X10_TEMP400
										|| X10_TEMP399;
								final int X10_TEMP401 = 12;
								final boolean X10_TEMP403 = x == X10_TEMP401;
								final int X10_TEMP404 = 29;
								final boolean X10_TEMP406 = y == X10_TEMP404;
								final boolean X10_TEMP410 = X10_TEMP403
										&& X10_TEMP406;
								final int X10_TEMP407 = 28;
								final boolean X10_TEMP409 = z == X10_TEMP407;
								final boolean X10_TEMP412 = X10_TEMP410
										&& X10_TEMP409;
								final boolean X10_TEMP426 = X10_TEMP413
										|| X10_TEMP412;
								final int X10_TEMP414 = 63;
								final boolean X10_TEMP416 = x == X10_TEMP414;
								final int X10_TEMP417 = 46;
								final boolean X10_TEMP419 = y == X10_TEMP417;
								final boolean X10_TEMP423 = X10_TEMP416
										&& X10_TEMP419;
								final int X10_TEMP420 = 25;
								final boolean X10_TEMP422 = z == X10_TEMP420;
								final boolean X10_TEMP425 = X10_TEMP423
										&& X10_TEMP422;
								final boolean X10_TEMP428 = X10_TEMP426
										|| X10_TEMP425;
								final boolean RX10_TEMP53 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP430 = RX10_TEMP53;
								final boolean X10_TEMP432 = X10_TEMP428
										&& X10_TEMP430;
								if (X10_TEMP432) {
									final int X10_TEMP434 = 1;
									final int X10_TEMP435 = 0;
									final double X10_TEMP438 = X10_TEMP435
											- X10_TEMP434;
									final double X10_TEMP439 = X10_TEMP438;
									final Dist3 RX10_TEMP54 = temp.distValue;
									final Region3 RX10_TEMP55 = RX10_TEMP54.dReg;
									final int RX10_TEMP56 = Program
											.searchPointInRegion3(RX10_TEMP55,
													p);
									final int RX10_TEMP57 = 0;
									final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
									if (RX10_TEMP58) {
										String RX10_TEMP59 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP59);
									}
									final int RX10_TEMP60 = Program
											.getPlaceFromDist3(RX10_TEMP54,
													RX10_TEMP56);
									final int RX10_TEMP62 = /* here */0;
									final boolean RX10_TEMP63 = RX10_TEMP60 != RX10_TEMP62;
									if (RX10_TEMP63) {
										String RX10_TEMP61 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP61);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP56, X10_TEMP439);
								}
								final int X10_TEMP440 = 27;
								final boolean X10_TEMP442 = x == X10_TEMP440;
								final int X10_TEMP443 = 32;
								final boolean X10_TEMP445 = y == X10_TEMP443;
								final boolean X10_TEMP449 = X10_TEMP442
										&& X10_TEMP445;
								final int X10_TEMP446 = 45;
								final boolean X10_TEMP448 = z == X10_TEMP446;
								final boolean X10_TEMP451 = X10_TEMP449
										&& X10_TEMP448;
								final int X10_TEMP452 = 39;
								final boolean X10_TEMP454 = x == X10_TEMP452;
								final int X10_TEMP455 = 0;
								final boolean X10_TEMP457 = y == X10_TEMP455;
								final boolean X10_TEMP461 = X10_TEMP454
										&& X10_TEMP457;
								final int X10_TEMP458 = 5;
								final boolean X10_TEMP460 = z == X10_TEMP458;
								final boolean X10_TEMP463 = X10_TEMP461
										&& X10_TEMP460;
								final boolean X10_TEMP476 = X10_TEMP451
										|| X10_TEMP463;
								final int X10_TEMP464 = 45;
								final boolean X10_TEMP466 = x == X10_TEMP464;
								final int X10_TEMP467 = 23;
								final boolean X10_TEMP469 = y == X10_TEMP467;
								final boolean X10_TEMP473 = X10_TEMP466
										&& X10_TEMP469;
								final int X10_TEMP470 = 49;
								final boolean X10_TEMP472 = z == X10_TEMP470;
								final boolean X10_TEMP475 = X10_TEMP473
										&& X10_TEMP472;
								final boolean X10_TEMP489 = X10_TEMP476
										|| X10_TEMP475;
								final int X10_TEMP477 = 20;
								final boolean X10_TEMP479 = x == X10_TEMP477;
								final int X10_TEMP480 = 32;
								final boolean X10_TEMP482 = y == X10_TEMP480;
								final boolean X10_TEMP486 = X10_TEMP479
										&& X10_TEMP482;
								final int X10_TEMP483 = 58;
								final boolean X10_TEMP485 = z == X10_TEMP483;
								final boolean X10_TEMP488 = X10_TEMP486
										&& X10_TEMP485;
								final boolean X10_TEMP502 = X10_TEMP489
										|| X10_TEMP488;
								final int X10_TEMP490 = 23;
								final boolean X10_TEMP492 = x == X10_TEMP490;
								final int X10_TEMP493 = 47;
								final boolean X10_TEMP495 = y == X10_TEMP493;
								final boolean X10_TEMP499 = X10_TEMP492
										&& X10_TEMP495;
								final int X10_TEMP496 = 57;
								final boolean X10_TEMP498 = z == X10_TEMP496;
								final boolean X10_TEMP501 = X10_TEMP499
										&& X10_TEMP498;
								final boolean X10_TEMP515 = X10_TEMP502
										|| X10_TEMP501;
								final int X10_TEMP503 = 17;
								final boolean X10_TEMP505 = x == X10_TEMP503;
								final int X10_TEMP506 = 43;
								final boolean X10_TEMP508 = y == X10_TEMP506;
								final boolean X10_TEMP512 = X10_TEMP505
										&& X10_TEMP508;
								final int X10_TEMP509 = 53;
								final boolean X10_TEMP511 = z == X10_TEMP509;
								final boolean X10_TEMP514 = X10_TEMP512
										&& X10_TEMP511;
								final boolean X10_TEMP528 = X10_TEMP515
										|| X10_TEMP514;
								final int X10_TEMP516 = 8;
								final boolean X10_TEMP518 = x == X10_TEMP516;
								final int X10_TEMP519 = 16;
								final boolean X10_TEMP521 = y == X10_TEMP519;
								final boolean X10_TEMP525 = X10_TEMP518
										&& X10_TEMP521;
								final int X10_TEMP522 = 48;
								final boolean X10_TEMP524 = z == X10_TEMP522;
								final boolean X10_TEMP527 = X10_TEMP525
										&& X10_TEMP524;
								final boolean X10_TEMP541 = X10_TEMP528
										|| X10_TEMP527;
								final int X10_TEMP529 = 51;
								final boolean X10_TEMP531 = x == X10_TEMP529;
								final int X10_TEMP532 = 46;
								final boolean X10_TEMP534 = y == X10_TEMP532;
								final boolean X10_TEMP538 = X10_TEMP531
										&& X10_TEMP534;
								final int X10_TEMP535 = 26;
								final boolean X10_TEMP537 = z == X10_TEMP535;
								final boolean X10_TEMP540 = X10_TEMP538
										&& X10_TEMP537;
								final boolean X10_TEMP554 = X10_TEMP541
										|| X10_TEMP540;
								final int X10_TEMP542 = 58;
								final boolean X10_TEMP544 = x == X10_TEMP542;
								final int X10_TEMP545 = 19;
								final boolean X10_TEMP547 = y == X10_TEMP545;
								final boolean X10_TEMP551 = X10_TEMP544
										&& X10_TEMP547;
								final int X10_TEMP548 = 62;
								final boolean X10_TEMP550 = z == X10_TEMP548;
								final boolean X10_TEMP553 = X10_TEMP551
										&& X10_TEMP550;
								final boolean X10_TEMP567 = X10_TEMP554
										|| X10_TEMP553;
								final int X10_TEMP555 = 58;
								final boolean X10_TEMP557 = x == X10_TEMP555;
								final int X10_TEMP558 = 15;
								final boolean X10_TEMP560 = y == X10_TEMP558;
								final boolean X10_TEMP564 = X10_TEMP557
										&& X10_TEMP560;
								final int X10_TEMP561 = 54;
								final boolean X10_TEMP563 = z == X10_TEMP561;
								final boolean X10_TEMP566 = X10_TEMP564
										&& X10_TEMP563;
								final boolean X10_TEMP569 = X10_TEMP567
										|| X10_TEMP566;
								final boolean RX10_TEMP64 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP571 = RX10_TEMP64;
								final boolean X10_TEMP573 = X10_TEMP569
										&& X10_TEMP571;
								if (X10_TEMP573) {
									final double X10_TEMP577 = 1;
									final double X10_TEMP578 = X10_TEMP577;
									final Dist3 RX10_TEMP65 = temp.distValue;
									final Region3 RX10_TEMP66 = RX10_TEMP65.dReg;
									final int RX10_TEMP67 = Program
											.searchPointInRegion3(RX10_TEMP66,
													p);
									final int RX10_TEMP68 = 0;
									final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68;
									if (RX10_TEMP69) {
										String RX10_TEMP70 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP70);
									}
									final int RX10_TEMP71 = Program
											.getPlaceFromDist3(RX10_TEMP65,
													RX10_TEMP67);
									final int RX10_TEMP73 = /* here */0;
									final boolean RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73;
									if (RX10_TEMP74) {
										String RX10_TEMP72 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP72);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP67, X10_TEMP578);
								}
								break;
							}
							case X10_TEMP580: {
							}
							case X10_TEMP582: {
								final int X10_TEMP583 = 221;
								final boolean X10_TEMP585 = x == X10_TEMP583;
								final int X10_TEMP586 = 40;
								final boolean X10_TEMP588 = y == X10_TEMP586;
								final boolean X10_TEMP592 = X10_TEMP585
										&& X10_TEMP588;
								final int X10_TEMP589 = 238;
								final boolean X10_TEMP591 = z == X10_TEMP589;
								final boolean X10_TEMP594 = X10_TEMP592
										&& X10_TEMP591;
								final int X10_TEMP595 = 152;
								final boolean X10_TEMP597 = x == X10_TEMP595;
								final int X10_TEMP598 = 160;
								final boolean X10_TEMP600 = y == X10_TEMP598;
								final boolean X10_TEMP604 = X10_TEMP597
										&& X10_TEMP600;
								final int X10_TEMP601 = 34;
								final boolean X10_TEMP603 = z == X10_TEMP601;
								final boolean X10_TEMP606 = X10_TEMP604
										&& X10_TEMP603;
								final boolean X10_TEMP619 = X10_TEMP594
										|| X10_TEMP606;
								final int X10_TEMP607 = 80;
								final boolean X10_TEMP609 = x == X10_TEMP607;
								final int X10_TEMP610 = 182;
								final boolean X10_TEMP612 = y == X10_TEMP610;
								final boolean X10_TEMP616 = X10_TEMP609
										&& X10_TEMP612;
								final int X10_TEMP613 = 253;
								final boolean X10_TEMP615 = z == X10_TEMP613;
								final boolean X10_TEMP618 = X10_TEMP616
										&& X10_TEMP615;
								final boolean X10_TEMP632 = X10_TEMP619
										|| X10_TEMP618;
								final int X10_TEMP620 = 248;
								final boolean X10_TEMP622 = x == X10_TEMP620;
								final int X10_TEMP623 = 168;
								final boolean X10_TEMP625 = y == X10_TEMP623;
								final boolean X10_TEMP629 = X10_TEMP622
										&& X10_TEMP625;
								final int X10_TEMP626 = 155;
								final boolean X10_TEMP628 = z == X10_TEMP626;
								final boolean X10_TEMP631 = X10_TEMP629
										&& X10_TEMP628;
								final boolean X10_TEMP645 = X10_TEMP632
										|| X10_TEMP631;
								final int X10_TEMP633 = 197;
								final boolean X10_TEMP635 = x == X10_TEMP633;
								final int X10_TEMP636 = 5;
								final boolean X10_TEMP638 = y == X10_TEMP636;
								final boolean X10_TEMP642 = X10_TEMP635
										&& X10_TEMP638;
								final int X10_TEMP639 = 201;
								final boolean X10_TEMP641 = z == X10_TEMP639;
								final boolean X10_TEMP644 = X10_TEMP642
										&& X10_TEMP641;
								final boolean X10_TEMP658 = X10_TEMP645
										|| X10_TEMP644;
								final int X10_TEMP646 = 90;
								final boolean X10_TEMP648 = x == X10_TEMP646;
								final int X10_TEMP649 = 61;
								final boolean X10_TEMP651 = y == X10_TEMP649;
								final boolean X10_TEMP655 = X10_TEMP648
										&& X10_TEMP651;
								final int X10_TEMP652 = 203;
								final boolean X10_TEMP654 = z == X10_TEMP652;
								final boolean X10_TEMP657 = X10_TEMP655
										&& X10_TEMP654;
								final boolean X10_TEMP671 = X10_TEMP658
										|| X10_TEMP657;
								final int X10_TEMP659 = 15;
								final boolean X10_TEMP661 = x == X10_TEMP659;
								final int X10_TEMP662 = 203;
								final boolean X10_TEMP664 = y == X10_TEMP662;
								final boolean X10_TEMP668 = X10_TEMP661
										&& X10_TEMP664;
								final int X10_TEMP665 = 30;
								final boolean X10_TEMP667 = z == X10_TEMP665;
								final boolean X10_TEMP670 = X10_TEMP668
										&& X10_TEMP667;
								final boolean X10_TEMP684 = X10_TEMP671
										|| X10_TEMP670;
								final int X10_TEMP672 = 99;
								final boolean X10_TEMP674 = x == X10_TEMP672;
								final int X10_TEMP675 = 154;
								final boolean X10_TEMP677 = y == X10_TEMP675;
								final boolean X10_TEMP681 = X10_TEMP674
										&& X10_TEMP677;
								final int X10_TEMP678 = 57;
								final boolean X10_TEMP680 = z == X10_TEMP678;
								final boolean X10_TEMP683 = X10_TEMP681
										&& X10_TEMP680;
								final boolean X10_TEMP697 = X10_TEMP684
										|| X10_TEMP683;
								final int X10_TEMP685 = 100;
								final boolean X10_TEMP687 = x == X10_TEMP685;
								final int X10_TEMP688 = 136;
								final boolean X10_TEMP690 = y == X10_TEMP688;
								final boolean X10_TEMP694 = X10_TEMP687
										&& X10_TEMP690;
								final int X10_TEMP691 = 110;
								final boolean X10_TEMP693 = z == X10_TEMP691;
								final boolean X10_TEMP696 = X10_TEMP694
										&& X10_TEMP693;
								final boolean X10_TEMP710 = X10_TEMP697
										|| X10_TEMP696;
								final int X10_TEMP698 = 209;
								final boolean X10_TEMP700 = x == X10_TEMP698;
								final int X10_TEMP701 = 152;
								final boolean X10_TEMP703 = y == X10_TEMP701;
								final boolean X10_TEMP707 = X10_TEMP700
										&& X10_TEMP703;
								final int X10_TEMP704 = 96;
								final boolean X10_TEMP706 = z == X10_TEMP704;
								final boolean X10_TEMP709 = X10_TEMP707
										&& X10_TEMP706;
								final boolean X10_TEMP712 = X10_TEMP710
										|| X10_TEMP709;
								final boolean RX10_TEMP75 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP714 = RX10_TEMP75;
								final boolean X10_TEMP716 = X10_TEMP712
										&& X10_TEMP714;
								if (X10_TEMP716) {
									final int X10_TEMP718 = 1;
									final int X10_TEMP719 = 0;
									final double X10_TEMP722 = X10_TEMP719
											- X10_TEMP718;
									final double X10_TEMP723 = X10_TEMP722;
									final Dist3 RX10_TEMP76 = temp.distValue;
									final Region3 RX10_TEMP77 = RX10_TEMP76.dReg;
									final int RX10_TEMP78 = Program
											.searchPointInRegion3(RX10_TEMP77,
													p);
									final int RX10_TEMP79 = 0;
									final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79;
									if (RX10_TEMP80) {
										String RX10_TEMP81 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP81);
									}
									final int RX10_TEMP82 = Program
											.getPlaceFromDist3(RX10_TEMP76,
													RX10_TEMP78);
									final int RX10_TEMP84 = /* here */0;
									final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84;
									if (RX10_TEMP85) {
										String RX10_TEMP83 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP83);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP78, X10_TEMP723);
								}
								final int X10_TEMP724 = 52;
								final boolean X10_TEMP726 = x == X10_TEMP724;
								final int X10_TEMP727 = 207;
								final boolean X10_TEMP729 = y == X10_TEMP727;
								final boolean X10_TEMP733 = X10_TEMP726
										&& X10_TEMP729;
								final int X10_TEMP730 = 38;
								final boolean X10_TEMP732 = z == X10_TEMP730;
								final boolean X10_TEMP735 = X10_TEMP733
										&& X10_TEMP732;
								final int X10_TEMP736 = 241;
								final boolean X10_TEMP738 = x == X10_TEMP736;
								final int X10_TEMP739 = 170;
								final boolean X10_TEMP741 = y == X10_TEMP739;
								final boolean X10_TEMP745 = X10_TEMP738
										&& X10_TEMP741;
								final int X10_TEMP742 = 12;
								final boolean X10_TEMP744 = z == X10_TEMP742;
								final boolean X10_TEMP747 = X10_TEMP745
										&& X10_TEMP744;
								final boolean X10_TEMP760 = X10_TEMP735
										|| X10_TEMP747;
								final int X10_TEMP748 = 201;
								final boolean X10_TEMP750 = x == X10_TEMP748;
								final int X10_TEMP751 = 16;
								final boolean X10_TEMP753 = y == X10_TEMP751;
								final boolean X10_TEMP757 = X10_TEMP750
										&& X10_TEMP753;
								final int X10_TEMP754 = 196;
								final boolean X10_TEMP756 = z == X10_TEMP754;
								final boolean X10_TEMP759 = X10_TEMP757
										&& X10_TEMP756;
								final boolean X10_TEMP773 = X10_TEMP760
										|| X10_TEMP759;
								final int X10_TEMP761 = 200;
								final boolean X10_TEMP763 = x == X10_TEMP761;
								final int X10_TEMP764 = 81;
								final boolean X10_TEMP766 = y == X10_TEMP764;
								final boolean X10_TEMP770 = X10_TEMP763
										&& X10_TEMP766;
								final int X10_TEMP767 = 207;
								final boolean X10_TEMP769 = z == X10_TEMP767;
								final boolean X10_TEMP772 = X10_TEMP770
										&& X10_TEMP769;
								final boolean X10_TEMP786 = X10_TEMP773
										|| X10_TEMP772;
								final int X10_TEMP774 = 113;
								final boolean X10_TEMP776 = x == X10_TEMP774;
								final int X10_TEMP777 = 121;
								final boolean X10_TEMP779 = y == X10_TEMP777;
								final boolean X10_TEMP783 = X10_TEMP776
										&& X10_TEMP779;
								final int X10_TEMP780 = 205;
								final boolean X10_TEMP782 = z == X10_TEMP780;
								final boolean X10_TEMP785 = X10_TEMP783
										&& X10_TEMP782;
								final boolean X10_TEMP799 = X10_TEMP786
										|| X10_TEMP785;
								final int X10_TEMP787 = 210;
								final boolean X10_TEMP789 = x == X10_TEMP787;
								final int X10_TEMP790 = 5;
								final boolean X10_TEMP792 = y == X10_TEMP790;
								final boolean X10_TEMP796 = X10_TEMP789
										&& X10_TEMP792;
								final int X10_TEMP793 = 246;
								final boolean X10_TEMP795 = z == X10_TEMP793;
								final boolean X10_TEMP798 = X10_TEMP796
										&& X10_TEMP795;
								final boolean X10_TEMP812 = X10_TEMP799
										|| X10_TEMP798;
								final int X10_TEMP800 = 43;
								final boolean X10_TEMP802 = x == X10_TEMP800;
								final int X10_TEMP803 = 192;
								final boolean X10_TEMP805 = y == X10_TEMP803;
								final boolean X10_TEMP809 = X10_TEMP802
										&& X10_TEMP805;
								final int X10_TEMP806 = 232;
								final boolean X10_TEMP808 = z == X10_TEMP806;
								final boolean X10_TEMP811 = X10_TEMP809
										&& X10_TEMP808;
								final boolean X10_TEMP825 = X10_TEMP812
										|| X10_TEMP811;
								final int X10_TEMP813 = 174;
								final boolean X10_TEMP815 = x == X10_TEMP813;
								final int X10_TEMP816 = 244;
								final boolean X10_TEMP818 = y == X10_TEMP816;
								final boolean X10_TEMP822 = X10_TEMP815
										&& X10_TEMP818;
								final int X10_TEMP819 = 162;
								final boolean X10_TEMP821 = z == X10_TEMP819;
								final boolean X10_TEMP824 = X10_TEMP822
										&& X10_TEMP821;
								final boolean X10_TEMP838 = X10_TEMP825
										|| X10_TEMP824;
								final int X10_TEMP826 = 3;
								final boolean X10_TEMP828 = x == X10_TEMP826;
								final int X10_TEMP829 = 116;
								final boolean X10_TEMP831 = y == X10_TEMP829;
								final boolean X10_TEMP835 = X10_TEMP828
										&& X10_TEMP831;
								final int X10_TEMP832 = 173;
								final boolean X10_TEMP834 = z == X10_TEMP832;
								final boolean X10_TEMP837 = X10_TEMP835
										&& X10_TEMP834;
								final boolean X10_TEMP851 = X10_TEMP838
										|| X10_TEMP837;
								final int X10_TEMP839 = 55;
								final boolean X10_TEMP841 = x == X10_TEMP839;
								final int X10_TEMP842 = 118;
								final boolean X10_TEMP844 = y == X10_TEMP842;
								final boolean X10_TEMP848 = X10_TEMP841
										&& X10_TEMP844;
								final int X10_TEMP845 = 165;
								final boolean X10_TEMP847 = z == X10_TEMP845;
								final boolean X10_TEMP850 = X10_TEMP848
										&& X10_TEMP847;
								final boolean X10_TEMP853 = X10_TEMP851
										|| X10_TEMP850;
								final boolean RX10_TEMP86 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP855 = RX10_TEMP86;
								final boolean X10_TEMP857 = X10_TEMP853
										&& X10_TEMP855;
								if (X10_TEMP857) {
									final double X10_TEMP861 = 1;
									final double X10_TEMP862 = X10_TEMP861;
									final Dist3 RX10_TEMP87 = temp.distValue;
									final Region3 RX10_TEMP88 = RX10_TEMP87.dReg;
									final int RX10_TEMP89 = Program
											.searchPointInRegion3(RX10_TEMP88,
													p);
									final int RX10_TEMP90 = 0;
									final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;
									if (RX10_TEMP91) {
										String RX10_TEMP92 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP92);
									}
									final int RX10_TEMP93 = Program
											.getPlaceFromDist3(RX10_TEMP87,
													RX10_TEMP89);
									final int RX10_TEMP95 = /* here */0;
									final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95;
									if (RX10_TEMP96) {
										String RX10_TEMP94 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP94);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP89, X10_TEMP862);
								}
								break;
							}
							case X10_TEMP864: {
								final int X10_TEMP865 = 397;
								final boolean X10_TEMP867 = x == X10_TEMP865;
								final int X10_TEMP868 = 310;
								final boolean X10_TEMP870 = y == X10_TEMP868;
								final boolean X10_TEMP874 = X10_TEMP867
										&& X10_TEMP870;
								final int X10_TEMP871 = 198;
								final boolean X10_TEMP873 = z == X10_TEMP871;
								final boolean X10_TEMP876 = X10_TEMP874
										&& X10_TEMP873;
								final int X10_TEMP877 = 94;
								final boolean X10_TEMP879 = x == X10_TEMP877;
								final int X10_TEMP880 = 399;
								final boolean X10_TEMP882 = y == X10_TEMP880;
								final boolean X10_TEMP886 = X10_TEMP879
										&& X10_TEMP882;
								final int X10_TEMP883 = 236;
								final boolean X10_TEMP885 = z == X10_TEMP883;
								final boolean X10_TEMP888 = X10_TEMP886
										&& X10_TEMP885;
								final boolean X10_TEMP901 = X10_TEMP876
										|| X10_TEMP888;
								final int X10_TEMP889 = 221;
								final boolean X10_TEMP891 = x == X10_TEMP889;
								final int X10_TEMP892 = 276;
								final boolean X10_TEMP894 = y == X10_TEMP892;
								final boolean X10_TEMP898 = X10_TEMP891
										&& X10_TEMP894;
								final int X10_TEMP895 = 59;
								final boolean X10_TEMP897 = z == X10_TEMP895;
								final boolean X10_TEMP900 = X10_TEMP898
										&& X10_TEMP897;
								final boolean X10_TEMP914 = X10_TEMP901
										|| X10_TEMP900;
								final int X10_TEMP902 = 342;
								final boolean X10_TEMP904 = x == X10_TEMP902;
								final int X10_TEMP905 = 137;
								final boolean X10_TEMP907 = y == X10_TEMP905;
								final boolean X10_TEMP911 = X10_TEMP904
										&& X10_TEMP907;
								final int X10_TEMP908 = 166;
								final boolean X10_TEMP910 = z == X10_TEMP908;
								final boolean X10_TEMP913 = X10_TEMP911
										&& X10_TEMP910;
								final boolean X10_TEMP927 = X10_TEMP914
										|| X10_TEMP913;
								final int X10_TEMP915 = 381;
								final boolean X10_TEMP917 = x == X10_TEMP915;
								final int X10_TEMP918 = 72;
								final boolean X10_TEMP920 = y == X10_TEMP918;
								final boolean X10_TEMP924 = X10_TEMP917
										&& X10_TEMP920;
								final int X10_TEMP921 = 281;
								final boolean X10_TEMP923 = z == X10_TEMP921;
								final boolean X10_TEMP926 = X10_TEMP924
										&& X10_TEMP923;
								final boolean X10_TEMP940 = X10_TEMP927
										|| X10_TEMP926;
								final int X10_TEMP928 = 350;
								final boolean X10_TEMP930 = x == X10_TEMP928;
								final int X10_TEMP931 = 192;
								final boolean X10_TEMP933 = y == X10_TEMP931;
								final boolean X10_TEMP937 = X10_TEMP930
										&& X10_TEMP933;
								final int X10_TEMP934 = 416;
								final boolean X10_TEMP936 = z == X10_TEMP934;
								final boolean X10_TEMP939 = X10_TEMP937
										&& X10_TEMP936;
								final boolean X10_TEMP953 = X10_TEMP940
										|| X10_TEMP939;
								final int X10_TEMP941 = 16;
								final boolean X10_TEMP943 = x == X10_TEMP941;
								final int X10_TEMP944 = 19;
								final boolean X10_TEMP946 = y == X10_TEMP944;
								final boolean X10_TEMP950 = X10_TEMP943
										&& X10_TEMP946;
								final int X10_TEMP947 = 455;
								final boolean X10_TEMP949 = z == X10_TEMP947;
								final boolean X10_TEMP952 = X10_TEMP950
										&& X10_TEMP949;
								final boolean X10_TEMP966 = X10_TEMP953
										|| X10_TEMP952;
								final int X10_TEMP954 = 152;
								final boolean X10_TEMP956 = x == X10_TEMP954;
								final int X10_TEMP957 = 336;
								final boolean X10_TEMP959 = y == X10_TEMP957;
								final boolean X10_TEMP963 = X10_TEMP956
										&& X10_TEMP959;
								final int X10_TEMP960 = 8;
								final boolean X10_TEMP962 = z == X10_TEMP960;
								final boolean X10_TEMP965 = X10_TEMP963
										&& X10_TEMP962;
								final boolean X10_TEMP979 = X10_TEMP966
										|| X10_TEMP965;
								final int X10_TEMP967 = 400;
								final boolean X10_TEMP969 = x == X10_TEMP967;
								final int X10_TEMP970 = 502;
								final boolean X10_TEMP972 = y == X10_TEMP970;
								final boolean X10_TEMP976 = X10_TEMP969
										&& X10_TEMP972;
								final int X10_TEMP973 = 447;
								final boolean X10_TEMP975 = z == X10_TEMP973;
								final boolean X10_TEMP978 = X10_TEMP976
										&& X10_TEMP975;
								final boolean X10_TEMP992 = X10_TEMP979
										|| X10_TEMP978;
								final int X10_TEMP980 = 72;
								final boolean X10_TEMP982 = x == X10_TEMP980;
								final int X10_TEMP983 = 0;
								final boolean X10_TEMP985 = y == X10_TEMP983;
								final boolean X10_TEMP989 = X10_TEMP982
										&& X10_TEMP985;
								final int X10_TEMP986 = 105;
								final boolean X10_TEMP988 = z == X10_TEMP986;
								final boolean X10_TEMP991 = X10_TEMP989
										&& X10_TEMP988;
								final boolean X10_TEMP994 = X10_TEMP992
										|| X10_TEMP991;
								final boolean RX10_TEMP97 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP996 = RX10_TEMP97;
								final boolean X10_TEMP998 = X10_TEMP994
										&& X10_TEMP996;
								if (X10_TEMP998) {
									final int X10_TEMP1000 = 1;
									final int X10_TEMP1001 = 0;
									final double X10_TEMP1004 = X10_TEMP1001
											- X10_TEMP1000;
									final double X10_TEMP1005 = X10_TEMP1004;
									final Dist3 RX10_TEMP98 = temp.distValue;
									final Region3 RX10_TEMP99 = RX10_TEMP98.dReg;
									final int RX10_TEMP100 = Program
											.searchPointInRegion3(RX10_TEMP99,
													p);
									final int RX10_TEMP101 = 0;
									final boolean RX10_TEMP102 = RX10_TEMP100 < RX10_TEMP101;
									if (RX10_TEMP102) {
										String RX10_TEMP103 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP103);
									}
									final int RX10_TEMP104 = Program
											.getPlaceFromDist3(RX10_TEMP98,
													RX10_TEMP100);
									final int RX10_TEMP106 = /* here */0;
									final boolean RX10_TEMP107 = RX10_TEMP104 != RX10_TEMP106;
									if (RX10_TEMP107) {
										String RX10_TEMP105 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP105);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP100, X10_TEMP1005);
								}
								final int X10_TEMP1006 = 308;
								final boolean X10_TEMP1008 = x == X10_TEMP1006;
								final int X10_TEMP1009 = 359;
								final boolean X10_TEMP1011 = y == X10_TEMP1009;
								final boolean X10_TEMP1015 = X10_TEMP1008
										&& X10_TEMP1011;
								final int X10_TEMP1012 = 9;
								final boolean X10_TEMP1014 = z == X10_TEMP1012;
								final boolean X10_TEMP1017 = X10_TEMP1015
										&& X10_TEMP1014;
								final int X10_TEMP1018 = 9;
								final boolean X10_TEMP1020 = x == X10_TEMP1018;
								final int X10_TEMP1021 = 491;
								final boolean X10_TEMP1023 = y == X10_TEMP1021;
								final boolean X10_TEMP1027 = X10_TEMP1020
										&& X10_TEMP1023;
								final int X10_TEMP1024 = 116;
								final boolean X10_TEMP1026 = z == X10_TEMP1024;
								final boolean X10_TEMP1029 = X10_TEMP1027
										&& X10_TEMP1026;
								final boolean X10_TEMP1042 = X10_TEMP1017
										|| X10_TEMP1029;
								final int X10_TEMP1030 = 449;
								final boolean X10_TEMP1032 = x == X10_TEMP1030;
								final int X10_TEMP1033 = 268;
								final boolean X10_TEMP1035 = y == X10_TEMP1033;
								final boolean X10_TEMP1039 = X10_TEMP1032
										&& X10_TEMP1035;
								final int X10_TEMP1036 = 441;
								final boolean X10_TEMP1038 = z == X10_TEMP1036;
								final boolean X10_TEMP1041 = X10_TEMP1039
										&& X10_TEMP1038;
								final boolean X10_TEMP1055 = X10_TEMP1042
										|| X10_TEMP1041;
								final int X10_TEMP1043 = 147;
								final boolean X10_TEMP1045 = x == X10_TEMP1043;
								final int X10_TEMP1046 = 115;
								final boolean X10_TEMP1048 = y == X10_TEMP1046;
								final boolean X10_TEMP1052 = X10_TEMP1045
										&& X10_TEMP1048;
								final int X10_TEMP1049 = 197;
								final boolean X10_TEMP1051 = z == X10_TEMP1049;
								final boolean X10_TEMP1054 = X10_TEMP1052
										&& X10_TEMP1051;
								final boolean X10_TEMP1068 = X10_TEMP1055
										|| X10_TEMP1054;
								final int X10_TEMP1056 = 241;
								final boolean X10_TEMP1058 = x == X10_TEMP1056;
								final int X10_TEMP1059 = 85;
								final boolean X10_TEMP1061 = y == X10_TEMP1059;
								final boolean X10_TEMP1065 = X10_TEMP1058
										&& X10_TEMP1061;
								final int X10_TEMP1062 = 3;
								final boolean X10_TEMP1064 = z == X10_TEMP1062;
								final boolean X10_TEMP1067 = X10_TEMP1065
										&& X10_TEMP1064;
								final boolean X10_TEMP1081 = X10_TEMP1068
										|| X10_TEMP1067;
								final int X10_TEMP1069 = 507;
								final boolean X10_TEMP1071 = x == X10_TEMP1069;
								final int X10_TEMP1072 = 41;
								final boolean X10_TEMP1074 = y == X10_TEMP1072;
								final boolean X10_TEMP1078 = X10_TEMP1071
										&& X10_TEMP1074;
								final int X10_TEMP1075 = 125;
								final boolean X10_TEMP1077 = z == X10_TEMP1075;
								final boolean X10_TEMP1080 = X10_TEMP1078
										&& X10_TEMP1077;
								final boolean X10_TEMP1094 = X10_TEMP1081
										|| X10_TEMP1080;
								final int X10_TEMP1082 = 161;
								final boolean X10_TEMP1084 = x == X10_TEMP1082;
								final int X10_TEMP1085 = 278;
								final boolean X10_TEMP1087 = y == X10_TEMP1085;
								final boolean X10_TEMP1091 = X10_TEMP1084
										&& X10_TEMP1087;
								final int X10_TEMP1088 = 73;
								final boolean X10_TEMP1090 = z == X10_TEMP1088;
								final boolean X10_TEMP1093 = X10_TEMP1091
										&& X10_TEMP1090;
								final boolean X10_TEMP1107 = X10_TEMP1094
										|| X10_TEMP1093;
								final int X10_TEMP1095 = 144;
								final boolean X10_TEMP1097 = x == X10_TEMP1095;
								final int X10_TEMP1098 = 91;
								final boolean X10_TEMP1100 = y == X10_TEMP1098;
								final boolean X10_TEMP1104 = X10_TEMP1097
										&& X10_TEMP1100;
								final int X10_TEMP1101 = 310;
								final boolean X10_TEMP1103 = z == X10_TEMP1101;
								final boolean X10_TEMP1106 = X10_TEMP1104
										&& X10_TEMP1103;
								final boolean X10_TEMP1120 = X10_TEMP1107
										|| X10_TEMP1106;
								final int X10_TEMP1108 = 201;
								final boolean X10_TEMP1110 = x == X10_TEMP1108;
								final int X10_TEMP1111 = 8;
								final boolean X10_TEMP1113 = y == X10_TEMP1111;
								final boolean X10_TEMP1117 = X10_TEMP1110
										&& X10_TEMP1113;
								final int X10_TEMP1114 = 49;
								final boolean X10_TEMP1116 = z == X10_TEMP1114;
								final boolean X10_TEMP1119 = X10_TEMP1117
										&& X10_TEMP1116;
								final boolean X10_TEMP1133 = X10_TEMP1120
										|| X10_TEMP1119;
								final int X10_TEMP1121 = 149;
								final boolean X10_TEMP1123 = x == X10_TEMP1121;
								final int X10_TEMP1124 = 399;
								final boolean X10_TEMP1126 = y == X10_TEMP1124;
								final boolean X10_TEMP1130 = X10_TEMP1123
										&& X10_TEMP1126;
								final int X10_TEMP1127 = 329;
								final boolean X10_TEMP1129 = z == X10_TEMP1127;
								final boolean X10_TEMP1132 = X10_TEMP1130
										&& X10_TEMP1129;
								final boolean X10_TEMP1135 = X10_TEMP1133
										|| X10_TEMP1132;
								final boolean RX10_TEMP108 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP1137 = RX10_TEMP108;
								final boolean X10_TEMP1139 = X10_TEMP1135
										&& X10_TEMP1137;
								if (X10_TEMP1139) {
									final double X10_TEMP1143 = 1;
									final double X10_TEMP1144 = X10_TEMP1143;
									final Dist3 RX10_TEMP109 = temp.distValue;
									final Region3 RX10_TEMP110 = RX10_TEMP109.dReg;
									final int RX10_TEMP111 = Program
											.searchPointInRegion3(RX10_TEMP110,
													p);
									final int RX10_TEMP112 = 0;
									final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112;
									if (RX10_TEMP113) {
										String RX10_TEMP114 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP114);
									}
									final int RX10_TEMP115 = Program
											.getPlaceFromDist3(RX10_TEMP109,
													RX10_TEMP111);
									final int RX10_TEMP117 = /* here */0;
									final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117;
									if (RX10_TEMP118) {
										String RX10_TEMP116 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP116);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP111, X10_TEMP1144);
								}
								break;
							}
							case X10_TEMP1146: {
								final int X10_TEMP1147 = 186;
								final boolean X10_TEMP1149 = x == X10_TEMP1147;
								final int X10_TEMP1150 = 374;
								final boolean X10_TEMP1152 = y == X10_TEMP1150;
								final boolean X10_TEMP1156 = X10_TEMP1149
										&& X10_TEMP1152;
								final int X10_TEMP1153 = 694;
								final boolean X10_TEMP1155 = z == X10_TEMP1153;
								final boolean X10_TEMP1158 = X10_TEMP1156
										&& X10_TEMP1155;
								final int X10_TEMP1159 = 773;
								final boolean X10_TEMP1161 = x == X10_TEMP1159;
								final int X10_TEMP1162 = 345;
								final boolean X10_TEMP1164 = y == X10_TEMP1162;
								final boolean X10_TEMP1168 = X10_TEMP1161
										&& X10_TEMP1164;
								final int X10_TEMP1165 = 474;
								final boolean X10_TEMP1167 = z == X10_TEMP1165;
								final boolean X10_TEMP1170 = X10_TEMP1168
										&& X10_TEMP1167;
								final boolean X10_TEMP1183 = X10_TEMP1158
										|| X10_TEMP1170;
								final int X10_TEMP1171 = 478;
								final boolean X10_TEMP1173 = x == X10_TEMP1171;
								final int X10_TEMP1174 = 874;
								final boolean X10_TEMP1176 = y == X10_TEMP1174;
								final boolean X10_TEMP1180 = X10_TEMP1173
										&& X10_TEMP1176;
								final int X10_TEMP1177 = 804;
								final boolean X10_TEMP1179 = z == X10_TEMP1177;
								final boolean X10_TEMP1182 = X10_TEMP1180
										&& X10_TEMP1179;
								final boolean X10_TEMP1196 = X10_TEMP1183
										|| X10_TEMP1182;
								final int X10_TEMP1184 = 306;
								final boolean X10_TEMP1186 = x == X10_TEMP1184;
								final int X10_TEMP1187 = 75;
								final boolean X10_TEMP1189 = y == X10_TEMP1187;
								final boolean X10_TEMP1193 = X10_TEMP1186
										&& X10_TEMP1189;
								final int X10_TEMP1190 = 624;
								final boolean X10_TEMP1192 = z == X10_TEMP1190;
								final boolean X10_TEMP1195 = X10_TEMP1193
										&& X10_TEMP1192;
								final boolean X10_TEMP1209 = X10_TEMP1196
										|| X10_TEMP1195;
								final int X10_TEMP1197 = 397;
								final boolean X10_TEMP1199 = x == X10_TEMP1197;
								final int X10_TEMP1200 = 667;
								final boolean X10_TEMP1202 = y == X10_TEMP1200;
								final boolean X10_TEMP1206 = X10_TEMP1199
										&& X10_TEMP1202;
								final int X10_TEMP1203 = 49;
								final boolean X10_TEMP1205 = z == X10_TEMP1203;
								final boolean X10_TEMP1208 = X10_TEMP1206
										&& X10_TEMP1205;
								final boolean X10_TEMP1222 = X10_TEMP1209
										|| X10_TEMP1208;
								final int X10_TEMP1210 = 606;
								final boolean X10_TEMP1212 = x == X10_TEMP1210;
								final int X10_TEMP1213 = 199;
								final boolean X10_TEMP1215 = y == X10_TEMP1213;
								final boolean X10_TEMP1219 = X10_TEMP1212
										&& X10_TEMP1215;
								final int X10_TEMP1216 = 59;
								final boolean X10_TEMP1218 = z == X10_TEMP1216;
								final boolean X10_TEMP1221 = X10_TEMP1219
										&& X10_TEMP1218;
								final boolean X10_TEMP1235 = X10_TEMP1222
										|| X10_TEMP1221;
								final int X10_TEMP1223 = 892;
								final boolean X10_TEMP1225 = x == X10_TEMP1223;
								final int X10_TEMP1226 = 70;
								final boolean X10_TEMP1228 = y == X10_TEMP1226;
								final boolean X10_TEMP1232 = X10_TEMP1225
										&& X10_TEMP1228;
								final int X10_TEMP1229 = 361;
								final boolean X10_TEMP1231 = z == X10_TEMP1229;
								final boolean X10_TEMP1234 = X10_TEMP1232
										&& X10_TEMP1231;
								final boolean X10_TEMP1248 = X10_TEMP1235
										|| X10_TEMP1234;
								final int X10_TEMP1236 = 844;
								final boolean X10_TEMP1238 = x == X10_TEMP1236;
								final int X10_TEMP1239 = 261;
								final boolean X10_TEMP1241 = y == X10_TEMP1239;
								final boolean X10_TEMP1245 = X10_TEMP1238
										&& X10_TEMP1241;
								final int X10_TEMP1242 = 252;
								final boolean X10_TEMP1244 = z == X10_TEMP1242;
								final boolean X10_TEMP1247 = X10_TEMP1245
										&& X10_TEMP1244;
								final boolean X10_TEMP1261 = X10_TEMP1248
										|| X10_TEMP1247;
								final int X10_TEMP1249 = 221;
								final boolean X10_TEMP1251 = x == X10_TEMP1249;
								final int X10_TEMP1252 = 906;
								final boolean X10_TEMP1254 = y == X10_TEMP1252;
								final boolean X10_TEMP1258 = X10_TEMP1251
										&& X10_TEMP1254;
								final int X10_TEMP1255 = 14;
								final boolean X10_TEMP1257 = z == X10_TEMP1255;
								final boolean X10_TEMP1260 = X10_TEMP1258
										&& X10_TEMP1257;
								final boolean X10_TEMP1274 = X10_TEMP1261
										|| X10_TEMP1260;
								final int X10_TEMP1262 = 85;
								final boolean X10_TEMP1264 = x == X10_TEMP1262;
								final int X10_TEMP1265 = 327;
								final boolean X10_TEMP1267 = y == X10_TEMP1265;
								final boolean X10_TEMP1271 = X10_TEMP1264
										&& X10_TEMP1267;
								final int X10_TEMP1268 = 232;
								final boolean X10_TEMP1270 = z == X10_TEMP1268;
								final boolean X10_TEMP1273 = X10_TEMP1271
										&& X10_TEMP1270;
								final boolean X10_TEMP1276 = X10_TEMP1274
										|| X10_TEMP1273;
								final boolean RX10_TEMP119 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP1278 = RX10_TEMP119;
								final boolean X10_TEMP1280 = X10_TEMP1276
										&& X10_TEMP1278;
								if (X10_TEMP1280) {
									final int X10_TEMP1282 = 1;
									final int X10_TEMP1283 = 0;
									final double X10_TEMP1286 = X10_TEMP1283
											- X10_TEMP1282;
									final double X10_TEMP1287 = X10_TEMP1286;
									final Dist3 RX10_TEMP120 = temp.distValue;
									final Region3 RX10_TEMP121 = RX10_TEMP120.dReg;
									final int RX10_TEMP122 = Program
											.searchPointInRegion3(RX10_TEMP121,
													p);
									final int RX10_TEMP123 = 0;
									final boolean RX10_TEMP124 = RX10_TEMP122 < RX10_TEMP123;
									if (RX10_TEMP124) {
										String RX10_TEMP125 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP125);
									}
									final int RX10_TEMP126 = Program
											.getPlaceFromDist3(RX10_TEMP120,
													RX10_TEMP122);
									final int RX10_TEMP128 = /* here */0;
									final boolean RX10_TEMP129 = RX10_TEMP126 != RX10_TEMP128;
									if (RX10_TEMP129) {
										String RX10_TEMP127 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP127);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP122, X10_TEMP1287);
								}
								final int X10_TEMP1288 = 739;
								final boolean X10_TEMP1290 = x == X10_TEMP1288;
								final int X10_TEMP1291 = 879;
								final boolean X10_TEMP1293 = y == X10_TEMP1291;
								final boolean X10_TEMP1297 = X10_TEMP1290
										&& X10_TEMP1293;
								final int X10_TEMP1294 = 781;
								final boolean X10_TEMP1296 = z == X10_TEMP1294;
								final boolean X10_TEMP1299 = X10_TEMP1297
										&& X10_TEMP1296;
								final int X10_TEMP1300 = 742;
								final boolean X10_TEMP1302 = x == X10_TEMP1300;
								final int X10_TEMP1303 = 641;
								final boolean X10_TEMP1305 = y == X10_TEMP1303;
								final boolean X10_TEMP1309 = X10_TEMP1302
										&& X10_TEMP1305;
								final int X10_TEMP1306 = 147;
								final boolean X10_TEMP1308 = z == X10_TEMP1306;
								final boolean X10_TEMP1311 = X10_TEMP1309
										&& X10_TEMP1308;
								final boolean X10_TEMP1324 = X10_TEMP1299
										|| X10_TEMP1311;
								final int X10_TEMP1312 = 335;
								final boolean X10_TEMP1314 = x == X10_TEMP1312;
								final int X10_TEMP1315 = 295;
								final boolean X10_TEMP1317 = y == X10_TEMP1315;
								final boolean X10_TEMP1321 = X10_TEMP1314
										&& X10_TEMP1317;
								final int X10_TEMP1318 = 600;
								final boolean X10_TEMP1320 = z == X10_TEMP1318;
								final boolean X10_TEMP1323 = X10_TEMP1321
										&& X10_TEMP1320;
								final boolean X10_TEMP1337 = X10_TEMP1324
										|| X10_TEMP1323;
								final int X10_TEMP1325 = 982;
								final boolean X10_TEMP1327 = x == X10_TEMP1325;
								final int X10_TEMP1328 = 944;
								final boolean X10_TEMP1330 = y == X10_TEMP1328;
								final boolean X10_TEMP1334 = X10_TEMP1327
										&& X10_TEMP1330;
								final int X10_TEMP1331 = 696;
								final boolean X10_TEMP1333 = z == X10_TEMP1331;
								final boolean X10_TEMP1336 = X10_TEMP1334
										&& X10_TEMP1333;
								final boolean X10_TEMP1350 = X10_TEMP1337
										|| X10_TEMP1336;
								final int X10_TEMP1338 = 622;
								final boolean X10_TEMP1340 = x == X10_TEMP1338;
								final int X10_TEMP1341 = 881;
								final boolean X10_TEMP1343 = y == X10_TEMP1341;
								final boolean X10_TEMP1347 = X10_TEMP1340
										&& X10_TEMP1343;
								final int X10_TEMP1344 = 180;
								final boolean X10_TEMP1346 = z == X10_TEMP1344;
								final boolean X10_TEMP1349 = X10_TEMP1347
										&& X10_TEMP1346;
								final boolean X10_TEMP1363 = X10_TEMP1350
										|| X10_TEMP1349;
								final int X10_TEMP1351 = 956;
								final boolean X10_TEMP1353 = x == X10_TEMP1351;
								final int X10_TEMP1354 = 217;
								final boolean X10_TEMP1356 = y == X10_TEMP1354;
								final boolean X10_TEMP1360 = X10_TEMP1353
										&& X10_TEMP1356;
								final int X10_TEMP1357 = 952;
								final boolean X10_TEMP1359 = z == X10_TEMP1357;
								final boolean X10_TEMP1362 = X10_TEMP1360
										&& X10_TEMP1359;
								final boolean X10_TEMP1376 = X10_TEMP1363
										|| X10_TEMP1362;
								final int X10_TEMP1364 = 777;
								final boolean X10_TEMP1366 = x == X10_TEMP1364;
								final int X10_TEMP1367 = 453;
								final boolean X10_TEMP1369 = y == X10_TEMP1367;
								final boolean X10_TEMP1373 = X10_TEMP1366
										&& X10_TEMP1369;
								final int X10_TEMP1370 = 706;
								final boolean X10_TEMP1372 = z == X10_TEMP1370;
								final boolean X10_TEMP1375 = X10_TEMP1373
										&& X10_TEMP1372;
								final boolean X10_TEMP1389 = X10_TEMP1376
										|| X10_TEMP1375;
								final int X10_TEMP1377 = 258;
								final boolean X10_TEMP1379 = x == X10_TEMP1377;
								final int X10_TEMP1380 = 730;
								final boolean X10_TEMP1382 = y == X10_TEMP1380;
								final boolean X10_TEMP1386 = X10_TEMP1379
										&& X10_TEMP1382;
								final int X10_TEMP1383 = 482;
								final boolean X10_TEMP1385 = z == X10_TEMP1383;
								final boolean X10_TEMP1388 = X10_TEMP1386
										&& X10_TEMP1385;
								final boolean X10_TEMP1402 = X10_TEMP1389
										|| X10_TEMP1388;
								final int X10_TEMP1390 = 271;
								final boolean X10_TEMP1392 = x == X10_TEMP1390;
								final int X10_TEMP1393 = 75;
								final boolean X10_TEMP1395 = y == X10_TEMP1393;
								final boolean X10_TEMP1399 = X10_TEMP1392
										&& X10_TEMP1395;
								final int X10_TEMP1396 = 815;
								final boolean X10_TEMP1398 = z == X10_TEMP1396;
								final boolean X10_TEMP1401 = X10_TEMP1399
										&& X10_TEMP1398;
								final boolean X10_TEMP1415 = X10_TEMP1402
										|| X10_TEMP1401;
								final int X10_TEMP1403 = 78;
								final boolean X10_TEMP1405 = x == X10_TEMP1403;
								final int X10_TEMP1406 = 276;
								final boolean X10_TEMP1408 = y == X10_TEMP1406;
								final boolean X10_TEMP1412 = X10_TEMP1405
										&& X10_TEMP1408;
								final int X10_TEMP1409 = 250;
								final boolean X10_TEMP1411 = z == X10_TEMP1409;
								final boolean X10_TEMP1414 = X10_TEMP1412
										&& X10_TEMP1411;
								final boolean X10_TEMP1417 = X10_TEMP1415
										|| X10_TEMP1414;
								final boolean RX10_TEMP130 = Program
										.regionContainsPoint3(R, p);
								final boolean X10_TEMP1419 = RX10_TEMP130;
								final boolean X10_TEMP1421 = X10_TEMP1417
										&& X10_TEMP1419;
								if (X10_TEMP1421) {
									final double X10_TEMP1425 = 1;
									final double X10_TEMP1426 = X10_TEMP1425;
									final Dist3 RX10_TEMP131 = temp.distValue;
									final Region3 RX10_TEMP132 = RX10_TEMP131.dReg;
									final int RX10_TEMP133 = Program
											.searchPointInRegion3(RX10_TEMP132,
													p);
									final int RX10_TEMP134 = 0;
									final boolean RX10_TEMP135 = RX10_TEMP133 < RX10_TEMP134;
									if (RX10_TEMP135) {
										String RX10_TEMP136 = "Array index out of bounds";
										throw new RuntimeException(RX10_TEMP136);
									}
									final int RX10_TEMP137 = Program
											.getPlaceFromDist3(RX10_TEMP131,
													RX10_TEMP133);
									final int RX10_TEMP139 = /* here */0;
									final boolean RX10_TEMP140 = RX10_TEMP137 != RX10_TEMP139;
									if (RX10_TEMP140) {
										String RX10_TEMP138 = "Bad place access for array temp";
										throw new RuntimeException(RX10_TEMP138);
									}
									Program.setRefArrayValue3double(temp,
											RX10_TEMP133, X10_TEMP1426);
								}
								break;
							}
							}
						}
					}
				}
			}
		}
		final boolean X10_TEMP1428 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP1428) { /* finish */
			{
				Program.LevelData_exchange(X10_TEMP0);
			}
		}
	}

	public static void LevelData_set(final LevelData X10_TEMP0,
			final double a_db) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final Wrapper X10_TEMP6 = Program.LevelData_get_m_u(
							X10_TEMP0, i);
					final doubleRefArray3 X10_TEMP7 = X10_TEMP6.m_array;
					final doubleRefArray3 temp = X10_TEMP7;
					final Region3 X10_TEMP11 = Program.LevelData_get_m_regions(
							X10_TEMP0, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = X10_TEMP11.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(
								X10_TEMP11, RX10_TEMP16);
						final double X10_TEMP15 = a_db;
						final Dist3 RX10_TEMP17 = temp.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array temp";
							throw new RuntimeException(RX10_TEMP24);
						}
						Program.setRefArrayValue3double(temp, RX10_TEMP19,
								X10_TEMP15);
					}
				}
			}
		}
		final boolean X10_TEMP17 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP17) { /* finish */
			{
				Program.LevelData_exchange(X10_TEMP0);
			}
		}
	}

	public static void LevelData_setLevelData(final LevelData X10_TEMP0,
			final LevelData a_LD) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final WrapperRefArray1 X10_TEMP5 = X10_TEMP0.m_u;
					final Point1 RX10_TEMP12 = new Point1(i);
					final Dist1 RX10_TEMP13 = X10_TEMP5.distValue;
					final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
					final int RX10_TEMP15 = Program.searchPointInRegion1(
							RX10_TEMP14, RX10_TEMP12);
					final int RX10_TEMP16 = 0;
					final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
					if (RX10_TEMP17) {
						String RX10_TEMP18 = "Array access index out of bounds";
						throw new RuntimeException(RX10_TEMP18);
					}
					final int RX10_TEMP19 = Program.getPlaceFromDist1(
							RX10_TEMP13, RX10_TEMP15);
					final int RX10_TEMP21 = /* here */0;
					final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
					if (RX10_TEMP22) {
						String RX10_TEMP20 = "Bad place access for array X10_TEMP5";
						throw new RuntimeException(RX10_TEMP20);
					}
					final Wrapper RX10_TEMP23 = Program
							.getRefArrayValue1Wrapper(X10_TEMP5, RX10_TEMP15);
					final Wrapper X10_TEMP7 = RX10_TEMP23;
					final doubleRefArray3 X10_TEMP8 = X10_TEMP7.m_array;
					final doubleRefArray3 u = X10_TEMP8;
					final doubleRefArray3 temp = Program.LevelData_getArray(
							a_LD, i);
					final Region3 mri = Program.LevelData_get_m_regions(
							X10_TEMP0, i);
					final int RX10_TEMP27 = 1;
					int RX10_TEMP25 = mri.regSize;
					RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP26 = RX10_TEMP25 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP26; SX10_TEMP3++) {
						final int RX10_TEMP24 = SX10_TEMP3;
						final int RX10_TEMP28 = RX10_TEMP24;
						final Point3 p = Program.regionOrdinalPoint3(mri,
								RX10_TEMP28);
						final Dist3 RX10_TEMP29 = temp.distValue;
						final Region3 RX10_TEMP30 = RX10_TEMP29.dReg;
						final int RX10_TEMP31 = Program.searchPointInRegion3(
								RX10_TEMP30, p);
						final int RX10_TEMP32 = 0;
						final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
						if (RX10_TEMP33) {
							String RX10_TEMP34 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP34);
						}
						final int RX10_TEMP35 = Program.getPlaceFromDist3(
								RX10_TEMP29, RX10_TEMP31);
						final int RX10_TEMP37 = /* here */0;
						final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
						if (RX10_TEMP38) {
							String RX10_TEMP36 = "Bad place access for array temp";
							throw new RuntimeException(RX10_TEMP36);
						}
						final double RX10_TEMP39 = Program
								.getRefArrayValue3double(temp, RX10_TEMP31);
						final double tp = RX10_TEMP39;
						final Dist3 RX10_TEMP40 = u.distValue;
						final Dist3 X10_TEMP17 = RX10_TEMP40;
						final Region3 RX10_TEMP41 = X10_TEMP17.dReg;
						final int RX10_TEMP42 = Program.searchPointInRegion3(
								RX10_TEMP41, p);
						final int RX10_TEMP43 = 0;
						final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;
						if (RX10_TEMP44) {
							final String RX10_TEMP45 = "Point p not found in the distribution X10_TEMP17.";
							throw new RuntimeException(RX10_TEMP45);
						}
						final int RX10_TEMP46 = Program.getPlaceFromDist3(
								X10_TEMP17, RX10_TEMP42);
						final int X10_TEMP20 = RX10_TEMP46; /*
															 * async (
															 * X10_TEMP20 )
															 */
						{
							final double X10_TEMP24 = tp;
							final Dist3 RX10_TEMP47 = u.distValue;
							final Region3 RX10_TEMP48 = RX10_TEMP47.dReg;
							final int RX10_TEMP49 = Program
									.searchPointInRegion3(RX10_TEMP48, p);
							final int RX10_TEMP50 = 0;
							final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;
							if (RX10_TEMP51) {
								String RX10_TEMP52 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP52);
							}
							final int RX10_TEMP53 = Program.getPlaceFromDist3(
									RX10_TEMP47, RX10_TEMP49);
							final int RX10_TEMP55 = /* here */0;
							final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55;
							if (RX10_TEMP56) {
								String RX10_TEMP54 = "Bad place access for array u";
								throw new RuntimeException(RX10_TEMP54);
							}
							Program.setRefArrayValue3double(u, RX10_TEMP49,
									X10_TEMP24);
						}
					}
				}
			}
		}
		final boolean X10_TEMP26 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP26) { /* finish */
			{
				Program.LevelData_exchange(X10_TEMP0);
			}
		}
	}

	public static void LevelData_add(final LevelData X10_TEMP0,
			final LevelData a_LD) { /* finish */
		{
			final Dist1 X10_TEMP2 = X10_TEMP0.m_places;
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final Wrapper X10_TEMP6 = Program.LevelData_get_m_u(
							X10_TEMP0, i);
					final doubleRefArray3 X10_TEMP7 = X10_TEMP6.m_array;
					final doubleRefArray3 u = X10_TEMP7;
					final doubleRefArray3 temp = Program.LevelData_getArray(
							a_LD, i);
					final Region3 X10_TEMP13 = Program.LevelData_get_m_regions(
							X10_TEMP0, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = X10_TEMP13.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(
								X10_TEMP13, RX10_TEMP16);
						final Dist3 RX10_TEMP17 = u.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array u";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(u, RX10_TEMP19);
						final double X10_TEMP17 = RX10_TEMP27;
						final Dist3 RX10_TEMP28 = temp.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array temp";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(temp, RX10_TEMP30);
						final double X10_TEMP18 = RX10_TEMP38;
						final double X10_TEMP21 = X10_TEMP17 + X10_TEMP18;
						final double X10_TEMP22 = X10_TEMP21;
						final Dist3 RX10_TEMP39 = u.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array u";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(u, RX10_TEMP41,
								X10_TEMP22);
					}
				}
			}
		}
		final boolean X10_TEMP24 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP24) { /* finish */
			{
				Program.LevelData_exchange(X10_TEMP0);
			}
		}
	}

	public static void LevelData_Exchange(final LevelData X10_TEMP0) {
		final int X10_TEMP3 = 0;
		final int X10_TEMP4 = 2;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3,
				X10_TEMP4);
		final int RX10_TEMP4 = 1;
		int RX10_TEMP2 = X10_TEMP6.regSize;
		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
			final int RX10_TEMP0 = SX10_TEMP1;
			final int RX10_TEMP5 = RX10_TEMP0;
			final Point1 RX10_TEMP1 = Program.regionOrdinalPoint1(X10_TEMP6,
					RX10_TEMP5);
			final int j = RX10_TEMP1.f0;
			final int jj = j; /* finish */
			{
				final Dist1 X10_TEMP9 = X10_TEMP0.m_places;
				final Region1 RX10_TEMP7 = X10_TEMP9.dReg;
				final int RX10_TEMP10 = 1;
				int RX10_TEMP8 = RX10_TEMP7.regSize;
				RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10;
				final int SX10_TEMP2 = 1;
				final int RX10_TEMP9 = RX10_TEMP8 + SX10_TEMP2;
				for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP9; SX10_TEMP3++) {
					final int RX10_TEMP6 = SX10_TEMP3;
					final int RX10_TEMP11 = RX10_TEMP6;
					final Point1 X10_TEMP10 = Program.regionOrdinalPoint1(
							RX10_TEMP7, RX10_TEMP11);
					final int i = X10_TEMP10.f0;
					final Region1 RX10_TEMP12 = X10_TEMP9.dReg;
					final int RX10_TEMP13 = Program.searchPointInRegion1(
							RX10_TEMP12, X10_TEMP10);
					final int RX10_TEMP14 = 0;
					final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14;
					if (RX10_TEMP15) {
						final String RX10_TEMP16 = "Point X10_TEMP10 not found in the distribution X10_TEMP9.";
						throw new RuntimeException(RX10_TEMP16);
					}
					final int RX10_TEMP17 = Program.getPlaceFromDist1(
							X10_TEMP9, RX10_TEMP13);
					final int X10_TEMP11 = RX10_TEMP17; /* async ( X10_TEMP11 ) */
					{
						final Region3 X10_TEMP12 = X10_TEMP0.m_placeGrid;
						final int RX10_TEMP18 = X10_TEMP12.regSize;
						final int RX10_TEMP19 = 0;
						boolean RX10_TEMP20 = i < RX10_TEMP19;
						boolean RX10_TEMP21 = i >= RX10_TEMP18;
						RX10_TEMP20 = RX10_TEMP20 || RX10_TEMP21;
						if (RX10_TEMP20) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final Point3 RX10_TEMP23 = Program.regionOrdinalPoint3(
								X10_TEMP12, i);
						final int RX10_TEMP24 = RX10_TEMP23.f0;
						final int dest0 = RX10_TEMP24;
						final Region3 X10_TEMP15 = X10_TEMP0.m_placeGrid;
						final int RX10_TEMP25 = X10_TEMP15.regSize;
						final int RX10_TEMP26 = 0;
						boolean RX10_TEMP27 = i < RX10_TEMP26;
						boolean RX10_TEMP28 = i >= RX10_TEMP25;
						RX10_TEMP27 = RX10_TEMP27 || RX10_TEMP28;
						if (RX10_TEMP27) {
							String RX10_TEMP29 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP29);
						}
						final Point3 RX10_TEMP30 = Program.regionOrdinalPoint3(
								X10_TEMP15, i);
						final int RX10_TEMP31 = RX10_TEMP30.f1;
						final int dest1 = RX10_TEMP31;
						final Region3 X10_TEMP18 = X10_TEMP0.m_placeGrid;
						final int RX10_TEMP32 = X10_TEMP18.regSize;
						final int RX10_TEMP33 = 0;
						boolean RX10_TEMP34 = i < RX10_TEMP33;
						boolean RX10_TEMP35 = i >= RX10_TEMP32;
						RX10_TEMP34 = RX10_TEMP34 || RX10_TEMP35;
						if (RX10_TEMP34) {
							String RX10_TEMP36 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP36);
						}
						final Point3 RX10_TEMP37 = Program.regionOrdinalPoint3(
								X10_TEMP18, i);
						final int RX10_TEMP38 = RX10_TEMP37.f2;
						final int dest2 = RX10_TEMP38;
						final int ii = i;
						final Region1 X10_TEMP25 = Program.createNewRegion1R(
								_LevelData_LOW, _LevelData_HIGH);
						final int RX10_TEMP43 = 1;
						int RX10_TEMP41 = X10_TEMP25.regSize;
						RX10_TEMP41 = RX10_TEMP41 - RX10_TEMP43;
						final int SX10_TEMP4 = 1;
						final int RX10_TEMP42 = RX10_TEMP41 + SX10_TEMP4;
						for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP42; SX10_TEMP5++) {
							final int RX10_TEMP39 = SX10_TEMP5;
							final int RX10_TEMP44 = RX10_TEMP39;
							final Point1 RX10_TEMP40 = Program
									.regionOrdinalPoint1(X10_TEMP25,
											RX10_TEMP44);
							final int p = RX10_TEMP40.f0;
							int disp0 = 0;
							int disp1 = 0;
							int disp2 = 0;
							int source0 = 0;
							int source1 = 0;
							int source2 = 0;
							int trans0 = 0;
							int trans1 = 0;
							int trans2 = 0;
							int sourceID = 0;
							int k = 0;
							final boolean X10_TEMP38 = p == _LevelData_LOW;
							if (X10_TEMP38) {
								final int X10_TEMP39 = 2;
								final int X10_TEMP41 = jj * X10_TEMP39;
								k = X10_TEMP41;
								final int X10_TEMP42 = 0;
								final boolean X10_TEMP43 = jj == X10_TEMP42;
								int X10_TEMP46 = 0;
								if (X10_TEMP43) {
									X10_TEMP46 = 1;
								}
								final int X10_TEMP47 = X10_TEMP46;
								final int X10_TEMP48 = X10_TEMP47;
								disp0 = X10_TEMP48;
								final int X10_TEMP50 = 1;
								final boolean X10_TEMP51 = jj == X10_TEMP50;
								int X10_TEMP54 = 0;
								if (X10_TEMP51) {
									X10_TEMP54 = 1;
								}
								final int X10_TEMP55 = X10_TEMP54;
								final int X10_TEMP56 = X10_TEMP55;
								disp1 = X10_TEMP56;
								final int X10_TEMP58 = 2;
								final boolean X10_TEMP59 = jj == X10_TEMP58;
								int X10_TEMP62 = 0;
								if (X10_TEMP59) {
									X10_TEMP62 = 1;
								}
								final int X10_TEMP63 = X10_TEMP62;
								final int X10_TEMP64 = X10_TEMP63;
								disp2 = X10_TEMP64;
							} else {
								final int X10_TEMP66 = 2;
								final int X10_TEMP67 = jj * X10_TEMP66;
								final int X10_TEMP68 = 1;
								final int X10_TEMP70 = X10_TEMP67 + X10_TEMP68;
								k = X10_TEMP70;
								final int X10_TEMP71 = 0;
								final boolean X10_TEMP72 = jj == X10_TEMP71;
								final int X10_TEMP73 = 1;
								final int X10_TEMP74 = 0;
								int X10_TEMP77 = 0;
								if (X10_TEMP72) {
									X10_TEMP77 = X10_TEMP74 - X10_TEMP73;
								}
								final int X10_TEMP78 = X10_TEMP77;
								final int X10_TEMP79 = X10_TEMP78;
								disp0 = X10_TEMP79;
								final int X10_TEMP81 = 1;
								final boolean X10_TEMP82 = jj == X10_TEMP81;
								final int X10_TEMP83 = 1;
								final int X10_TEMP84 = 0;
								int X10_TEMP87 = 0;
								if (X10_TEMP82) {
									X10_TEMP87 = X10_TEMP84 - X10_TEMP83;
								}
								final int X10_TEMP88 = X10_TEMP87;
								final int X10_TEMP89 = X10_TEMP88;
								disp1 = X10_TEMP89;
								final int X10_TEMP91 = 2;
								final boolean X10_TEMP92 = jj == X10_TEMP91;
								final int X10_TEMP93 = 1;
								final int X10_TEMP94 = 0;
								int X10_TEMP97 = 0;
								if (X10_TEMP92) {
									X10_TEMP97 = X10_TEMP94 - X10_TEMP93;
								}
								final int X10_TEMP98 = X10_TEMP97;
								final int X10_TEMP99 = X10_TEMP98;
								disp2 = X10_TEMP99;
							}
							final int X10_TEMP102 = dest0 - disp0;
							source0 = X10_TEMP102;
							final int X10_TEMP104 = dest1 - disp1;
							source1 = X10_TEMP104;
							final int X10_TEMP106 = dest2 - disp2;
							source2 = X10_TEMP106;
							final Region3 X10_TEMP107 = X10_TEMP0.m_placeGrid;
							final Point3 RX10_TEMP45 = new Point3(source0,
									source1, source2);
							final boolean RX10_TEMP46 = Program
									.regionContainsPoint3(X10_TEMP107,
											RX10_TEMP45);
							final boolean X10_TEMP112 = RX10_TEMP46;
							if (X10_TEMP112) {
								final Region3 X10_TEMP113 = X10_TEMP0.m_placeGrid;
								final Point3 RX10_TEMP47 = new Point3(source0,
										source1, source2);
								final int RX10_TEMP48 = Program
										.searchPointInRegion3(X10_TEMP113,
												RX10_TEMP47);
								final int RX10_TEMP49 = 0;
								final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49;
								if (RX10_TEMP50) {
									String RX10_TEMP51 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP51);
								}
								final int X10_TEMP118 = RX10_TEMP48;
								sourceID = X10_TEMP118;
								final WrapperRefArray1 X10_TEMP119 = X10_TEMP0.m_u;
								final Point1 RX10_TEMP52 = new Point1(ii);
								final Dist1 RX10_TEMP53 = X10_TEMP119.distValue;
								final Region1 RX10_TEMP54 = RX10_TEMP53.dReg;
								final int RX10_TEMP55 = Program
										.searchPointInRegion1(RX10_TEMP54,
												RX10_TEMP52);
								final int RX10_TEMP56 = 0;
								final boolean RX10_TEMP57 = RX10_TEMP55 < RX10_TEMP56;
								if (RX10_TEMP57) {
									String RX10_TEMP58 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP58);
								}
								final int RX10_TEMP59 = Program
										.getPlaceFromDist1(RX10_TEMP53,
												RX10_TEMP55);
								final int RX10_TEMP61 = /* here */0;
								final boolean RX10_TEMP62 = RX10_TEMP59 != RX10_TEMP61;
								if (RX10_TEMP62) {
									String RX10_TEMP60 = "Bad place access for array X10_TEMP119";
									throw new RuntimeException(RX10_TEMP60);
								}
								final Wrapper RX10_TEMP63 = Program
										.getRefArrayValue1Wrapper(X10_TEMP119,
												RX10_TEMP55);
								final Wrapper X10_TEMP121 = RX10_TEMP63;
								final doubleRefArray3 X10_TEMP122 = X10_TEMP121.m_array;
								final Region3 X10_TEMP126 = Program
										.LevelData_get_m_boundaries(X10_TEMP0,
												k, ii);
								final WrapperRefArray1 X10_TEMP128 = X10_TEMP0.m_u;
								final Point1 RX10_TEMP64 = new Point1(sourceID);
								final Dist1 RX10_TEMP65 = X10_TEMP128.distValue;
								final Region1 RX10_TEMP66 = RX10_TEMP65.dReg;
								final int RX10_TEMP67 = Program
										.searchPointInRegion1(RX10_TEMP66,
												RX10_TEMP64);
								final int RX10_TEMP68 = 0;
								final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68;
								if (RX10_TEMP69) {
									String RX10_TEMP70 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP70);
								}
								final int RX10_TEMP71 = Program
										.getPlaceFromDist1(RX10_TEMP65,
												RX10_TEMP67);
								final int RX10_TEMP73 = /* here */0;
								final boolean RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73;
								if (RX10_TEMP74) {
									String RX10_TEMP72 = "Bad place access for array X10_TEMP128";
									throw new RuntimeException(RX10_TEMP72);
								}
								final Wrapper RX10_TEMP75 = Program
										.getRefArrayValue1Wrapper(X10_TEMP128,
												RX10_TEMP67);
								final Wrapper X10_TEMP130 = RX10_TEMP75;
								final doubleRefArray3 X10_TEMP131 = X10_TEMP130.m_array;
								Program.Util_arraycopy3(X10_TEMP122,
										X10_TEMP126, X10_TEMP131);
							} else {
								final int X10_TEMP133 = 0;
								final boolean X10_TEMP135 = jj == X10_TEMP133;
								if (X10_TEMP135) {
									final int X10_TEMP136 = X10_TEMP0.m_block0;
									final int X10_TEMP137 = 1;
									final int X10_TEMP139 = X10_TEMP136
											- X10_TEMP137;
									final int X10_TEMP140 = disp0 * X10_TEMP139;
									final int X10_TEMP142 = dest0 + X10_TEMP140;
									source0 = X10_TEMP142;
									final int X10_TEMP143 = X10_TEMP0.m_block0;
									final int X10_TEMP144 = 1;
									final int X10_TEMP146 = X10_TEMP143
											- X10_TEMP144;
									final int X10_TEMP147 = disp1 * X10_TEMP146;
									final int X10_TEMP149 = dest1 + X10_TEMP147;
									source1 = X10_TEMP149;
									final int X10_TEMP150 = X10_TEMP0.m_block0;
									final int X10_TEMP151 = 1;
									final int X10_TEMP153 = X10_TEMP150
											- X10_TEMP151;
									final int X10_TEMP154 = disp2 * X10_TEMP153;
									final int X10_TEMP156 = dest2 + X10_TEMP154;
									source2 = X10_TEMP156;
								} else {
									final int X10_TEMP157 = 1;
									final boolean X10_TEMP159 = jj == X10_TEMP157;
									if (X10_TEMP159) {
										final int X10_TEMP160 = X10_TEMP0.m_block1;
										final int X10_TEMP161 = 1;
										final int X10_TEMP163 = X10_TEMP160
												- X10_TEMP161;
										final int X10_TEMP164 = disp0
												* X10_TEMP163;
										final int X10_TEMP166 = dest0
												+ X10_TEMP164;
										source0 = X10_TEMP166;
										final int X10_TEMP167 = X10_TEMP0.m_block1;
										final int X10_TEMP168 = 1;
										final int X10_TEMP170 = X10_TEMP167
												- X10_TEMP168;
										final int X10_TEMP171 = disp1
												* X10_TEMP170;
										final int X10_TEMP173 = dest1
												+ X10_TEMP171;
										source1 = X10_TEMP173;
										final int X10_TEMP174 = X10_TEMP0.m_block1;
										final int X10_TEMP175 = 1;
										final int X10_TEMP177 = X10_TEMP174
												- X10_TEMP175;
										final int X10_TEMP178 = disp2
												* X10_TEMP177;
										final int X10_TEMP180 = dest2
												+ X10_TEMP178;
										source2 = X10_TEMP180;
									} else {
										final int X10_TEMP181 = X10_TEMP0.m_block2;
										final int X10_TEMP182 = 1;
										final int X10_TEMP184 = X10_TEMP181
												- X10_TEMP182;
										final int X10_TEMP185 = disp0
												* X10_TEMP184;
										final int X10_TEMP187 = dest0
												+ X10_TEMP185;
										source0 = X10_TEMP187;
										final int X10_TEMP188 = X10_TEMP0.m_block2;
										final int X10_TEMP189 = 1;
										final int X10_TEMP191 = X10_TEMP188
												- X10_TEMP189;
										final int X10_TEMP192 = disp1
												* X10_TEMP191;
										final int X10_TEMP194 = dest1
												+ X10_TEMP192;
										source1 = X10_TEMP194;
										final int X10_TEMP195 = X10_TEMP0.m_block2;
										final int X10_TEMP196 = 1;
										final int X10_TEMP198 = X10_TEMP195
												- X10_TEMP196;
										final int X10_TEMP199 = disp2
												* X10_TEMP198;
										final int X10_TEMP201 = dest2
												+ X10_TEMP199;
										source2 = X10_TEMP201;
									}
								}
								final Region3 X10_TEMP202 = X10_TEMP0.m_placeGrid;
								final Point3 RX10_TEMP76 = new Point3(source0,
										source1, source2);
								final int RX10_TEMP77 = Program
										.searchPointInRegion3(X10_TEMP202,
												RX10_TEMP76);
								final int RX10_TEMP78 = 0;
								final boolean RX10_TEMP79 = RX10_TEMP77 < RX10_TEMP78;
								if (RX10_TEMP79) {
									String RX10_TEMP80 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP80);
								}
								final int X10_TEMP207 = RX10_TEMP77;
								sourceID = X10_TEMP207;
								final int X10_TEMP208 = 0;
								final boolean X10_TEMP210 = jj == X10_TEMP208;
								if (X10_TEMP210) {
									final int X10_TEMP211 = X10_TEMP0.m_size0;
									final int X10_TEMP213 = disp0 * X10_TEMP211;
									trans0 = X10_TEMP213;
									final int X10_TEMP214 = X10_TEMP0.m_size0;
									final int X10_TEMP216 = disp1 * X10_TEMP214;
									trans1 = X10_TEMP216;
									final int X10_TEMP217 = X10_TEMP0.m_size0;
									final int X10_TEMP219 = disp2 * X10_TEMP217;
									trans2 = X10_TEMP219;
								} else {
									final int X10_TEMP220 = 1;
									final boolean X10_TEMP222 = jj == X10_TEMP220;
									if (X10_TEMP222) {
										final int X10_TEMP223 = X10_TEMP0.m_size1;
										final int X10_TEMP225 = disp0
												* X10_TEMP223;
										trans0 = X10_TEMP225;
										final int X10_TEMP226 = X10_TEMP0.m_size1;
										final int X10_TEMP228 = disp1
												* X10_TEMP226;
										trans1 = X10_TEMP228;
										final int X10_TEMP229 = X10_TEMP0.m_size1;
										final int X10_TEMP231 = disp2
												* X10_TEMP229;
										trans2 = X10_TEMP231;
									} else {
										final int X10_TEMP232 = X10_TEMP0.m_size2;
										final int X10_TEMP234 = disp0
												* X10_TEMP232;
										trans0 = X10_TEMP234;
										final int X10_TEMP235 = X10_TEMP0.m_size2;
										final int X10_TEMP237 = disp1
												* X10_TEMP235;
										trans1 = X10_TEMP237;
										final int X10_TEMP238 = X10_TEMP0.m_size2;
										final int X10_TEMP240 = disp2
												* X10_TEMP238;
										trans2 = X10_TEMP240;
									}
								}
								final WrapperRefArray1 X10_TEMP241 = X10_TEMP0.m_u;
								final Point1 RX10_TEMP81 = new Point1(ii);
								final Dist1 RX10_TEMP82 = X10_TEMP241.distValue;
								final Region1 RX10_TEMP83 = RX10_TEMP82.dReg;
								final int RX10_TEMP84 = Program
										.searchPointInRegion1(RX10_TEMP83,
												RX10_TEMP81);
								final int RX10_TEMP85 = 0;
								final boolean RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85;
								if (RX10_TEMP86) {
									String RX10_TEMP87 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP87);
								}
								final int RX10_TEMP88 = Program
										.getPlaceFromDist1(RX10_TEMP82,
												RX10_TEMP84);
								final int RX10_TEMP90 = /* here */0;
								final boolean RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90;
								if (RX10_TEMP91) {
									String RX10_TEMP89 = "Bad place access for array X10_TEMP241";
									throw new RuntimeException(RX10_TEMP89);
								}
								final Wrapper RX10_TEMP92 = Program
										.getRefArrayValue1Wrapper(X10_TEMP241,
												RX10_TEMP84);
								final Wrapper X10_TEMP243 = RX10_TEMP92;
								final doubleRefArray3 X10_TEMP244 = X10_TEMP243.m_array;
								final Region3RefArray2 X10_TEMP246 = X10_TEMP0.m_boundaries;
								final Point2 RX10_TEMP93 = new Point2(k, ii);
								final Dist2 RX10_TEMP94 = X10_TEMP246.distValue;
								final Region2 RX10_TEMP95 = RX10_TEMP94.dReg;
								final int RX10_TEMP96 = Program
										.searchPointInRegion2(RX10_TEMP95,
												RX10_TEMP93);
								final int RX10_TEMP97 = 0;
								final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;
								if (RX10_TEMP98) {
									String RX10_TEMP99 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP99);
								}
								final int RX10_TEMP100 = Program
										.getPlaceFromDist2(RX10_TEMP94,
												RX10_TEMP96);
								final int RX10_TEMP102 = /* here */0;
								final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;
								if (RX10_TEMP103) {
									String RX10_TEMP101 = "Bad place access for array X10_TEMP246";
									throw new RuntimeException(RX10_TEMP101);
								}
								final Region3 RX10_TEMP104 = Program
										.getRefArrayValue2Region3(X10_TEMP246,
												RX10_TEMP96);
								final Region3 X10_TEMP249 = RX10_TEMP104;
								final WrapperRefArray1 X10_TEMP251 = X10_TEMP0.m_u;
								final Point1 RX10_TEMP105 = new Point1(sourceID);
								final Dist1 RX10_TEMP106 = X10_TEMP251.distValue;
								final Region1 RX10_TEMP107 = RX10_TEMP106.dReg;
								final int RX10_TEMP108 = Program
										.searchPointInRegion1(RX10_TEMP107,
												RX10_TEMP105);
								final int RX10_TEMP109 = 0;
								final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109;
								if (RX10_TEMP110) {
									String RX10_TEMP111 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP111);
								}
								final int RX10_TEMP112 = Program
										.getPlaceFromDist1(RX10_TEMP106,
												RX10_TEMP108);
								final int RX10_TEMP114 = /* here */0;
								final boolean RX10_TEMP115 = RX10_TEMP112 != RX10_TEMP114;
								if (RX10_TEMP115) {
									String RX10_TEMP113 = "Bad place access for array X10_TEMP251";
									throw new RuntimeException(RX10_TEMP113);
								}
								final Wrapper RX10_TEMP116 = Program
										.getRefArrayValue1Wrapper(X10_TEMP251,
												RX10_TEMP108);
								final Wrapper X10_TEMP253 = RX10_TEMP116;
								final doubleRefArray3 X10_TEMP254 = X10_TEMP253.m_array;
								Program.Util_arraycopy4(X10_TEMP244,
										X10_TEMP249, X10_TEMP254, trans0,
										trans1, trans2);
							}
						}
					}
				}
			}
		}
	}

	public static void LevelData_exchange(final LevelData X10_TEMP0) {
		final int X10_TEMP2 = /* here */0; /* async ( X10_TEMP2 ) */
		{
			final int X10_TEMP5 = 0;
			final int X10_TEMP6 = 2;
			final Region1 X10_TEMP8 = Program.createNewRegion1R(X10_TEMP5,
					X10_TEMP6);
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = X10_TEMP8.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 RX10_TEMP1 = Program.regionOrdinalPoint1(
						X10_TEMP8, RX10_TEMP5);
				final int j = RX10_TEMP1.f0; /* finish */
				{
					final Dist1 X10_TEMP10 = X10_TEMP0.m_places;
					final Region1 RX10_TEMP7 = X10_TEMP10.dReg;
					final int RX10_TEMP10 = 1;
					int RX10_TEMP8 = RX10_TEMP7.regSize;
					RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP9 = RX10_TEMP8 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP9; SX10_TEMP3++) {
						final int RX10_TEMP6 = SX10_TEMP3;
						final int RX10_TEMP11 = RX10_TEMP6;
						final Point1 X10_TEMP11 = Program.regionOrdinalPoint1(
								RX10_TEMP7, RX10_TEMP11);
						final int i = X10_TEMP11.f0;
						final Region1 RX10_TEMP12 = X10_TEMP10.dReg;
						final int RX10_TEMP13 = Program.searchPointInRegion1(
								RX10_TEMP12, X10_TEMP11);
						final int RX10_TEMP14 = 0;
						final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14;
						if (RX10_TEMP15) {
							final String RX10_TEMP16 = "Point X10_TEMP11 not found in the distribution X10_TEMP10.";
							throw new RuntimeException(RX10_TEMP16);
						}
						final int RX10_TEMP17 = Program.getPlaceFromDist1(
								X10_TEMP10, RX10_TEMP13);
						final int X10_TEMP12 = RX10_TEMP17; /*
															 * async (
															 * X10_TEMP12 )
															 */
						{
							final int jj = j;
							final Region3 X10_TEMP14 = X10_TEMP0.m_placeGrid;
							final int RX10_TEMP18 = X10_TEMP14.regSize;
							final int RX10_TEMP19 = 0;
							boolean RX10_TEMP20 = i < RX10_TEMP19;
							boolean RX10_TEMP21 = i >= RX10_TEMP18;
							RX10_TEMP20 = RX10_TEMP20 || RX10_TEMP21;
							if (RX10_TEMP20) {
								String RX10_TEMP22 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP22);
							}
							final Point3 RX10_TEMP23 = Program
									.regionOrdinalPoint3(X10_TEMP14, i);
							final int RX10_TEMP24 = RX10_TEMP23.f0;
							final int dest0 = RX10_TEMP24;
							final Region3 X10_TEMP17 = X10_TEMP0.m_placeGrid;
							final int RX10_TEMP25 = X10_TEMP17.regSize;
							final int RX10_TEMP26 = 0;
							boolean RX10_TEMP27 = i < RX10_TEMP26;
							boolean RX10_TEMP28 = i >= RX10_TEMP25;
							RX10_TEMP27 = RX10_TEMP27 || RX10_TEMP28;
							if (RX10_TEMP27) {
								String RX10_TEMP29 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP29);
							}
							final Point3 RX10_TEMP30 = Program
									.regionOrdinalPoint3(X10_TEMP17, i);
							final int RX10_TEMP31 = RX10_TEMP30.f1;
							final int dest1 = RX10_TEMP31;
							final Region3 X10_TEMP20 = X10_TEMP0.m_placeGrid;
							final int RX10_TEMP32 = X10_TEMP20.regSize;
							final int RX10_TEMP33 = 0;
							boolean RX10_TEMP34 = i < RX10_TEMP33;
							boolean RX10_TEMP35 = i >= RX10_TEMP32;
							RX10_TEMP34 = RX10_TEMP34 || RX10_TEMP35;
							if (RX10_TEMP34) {
								String RX10_TEMP36 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP36);
							}
							final Point3 RX10_TEMP37 = Program
									.regionOrdinalPoint3(X10_TEMP20, i);
							final int RX10_TEMP38 = RX10_TEMP37.f2;
							final int dest2 = RX10_TEMP38;
							final int ii = i; /* finish */
							{
								final Region1 X10_TEMP27 = Program
										.createNewRegion1R(_LevelData_LOW,
												_LevelData_HIGH);
								final int X10_TEMP28 = /* here */0;
								final int RX10_TEMP43 = 1;
								int RX10_TEMP41 = X10_TEMP27.regSize;
								RX10_TEMP41 = RX10_TEMP41 - RX10_TEMP43;
								final int SX10_TEMP4 = 1;
								final int RX10_TEMP42 = RX10_TEMP41
										+ SX10_TEMP4;
								for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP42; SX10_TEMP5++) {
									final int RX10_TEMP39 = SX10_TEMP5;
									final int RX10_TEMP44 = RX10_TEMP39;
									final Point1 RX10_TEMP40 = Program
											.regionOrdinalPoint1(X10_TEMP27,
													RX10_TEMP44);
									final int p = RX10_TEMP40.f0; /*
																 * async (
																 * X10_TEMP28 )
																 */
									{
										int disp0 = 0;
										int disp1 = 0;
										int disp2 = 0;
										int trans0 = 0;
										int trans1 = 0;
										int trans2 = 0;
										int sourceID = 0;
										int k = 0;
										final boolean X10_TEMP38 = p == _LevelData_LOW;
										if (X10_TEMP38) {
											final int X10_TEMP39 = 2;
											final int X10_TEMP41 = jj
													* X10_TEMP39;
											k = X10_TEMP41;
											final int X10_TEMP42 = 0;
											final boolean X10_TEMP43 = jj == X10_TEMP42;
											int X10_TEMP46 = 0;
											if (X10_TEMP43) {
												X10_TEMP46 = 1;
											}
											final int X10_TEMP47 = X10_TEMP46;
											final int X10_TEMP48 = X10_TEMP47;
											disp0 = X10_TEMP48;
											final int X10_TEMP50 = 1;
											final boolean X10_TEMP51 = jj == X10_TEMP50;
											int X10_TEMP54 = 0;
											if (X10_TEMP51) {
												X10_TEMP54 = 1;
											}
											final int X10_TEMP55 = X10_TEMP54;
											final int X10_TEMP56 = X10_TEMP55;
											disp1 = X10_TEMP56;
											final int X10_TEMP58 = 2;
											final boolean X10_TEMP59 = jj == X10_TEMP58;
											int X10_TEMP62 = 0;
											if (X10_TEMP59) {
												X10_TEMP62 = 1;
											}
											final int X10_TEMP63 = X10_TEMP62;
											final int X10_TEMP64 = X10_TEMP63;
											disp2 = X10_TEMP64;
										} else {
											final int X10_TEMP66 = 2;
											final int X10_TEMP67 = jj
													* X10_TEMP66;
											final int X10_TEMP68 = 1;
											final int X10_TEMP70 = X10_TEMP67
													+ X10_TEMP68;
											k = X10_TEMP70;
											final int X10_TEMP71 = 0;
											final boolean X10_TEMP72 = jj == X10_TEMP71;
											final int X10_TEMP73 = 1;
											final int X10_TEMP74 = 0;
											int X10_TEMP77 = 0;
											if (X10_TEMP72) {
												X10_TEMP77 = X10_TEMP74
														- X10_TEMP73;
											}
											final int X10_TEMP78 = X10_TEMP77;
											final int X10_TEMP79 = X10_TEMP78;
											disp0 = X10_TEMP79;
											final int X10_TEMP81 = 1;
											final boolean X10_TEMP82 = jj == X10_TEMP81;
											final int X10_TEMP83 = 1;
											final int X10_TEMP84 = 0;
											int X10_TEMP87 = 0;
											if (X10_TEMP82) {
												X10_TEMP87 = X10_TEMP84
														- X10_TEMP83;
											}
											final int X10_TEMP88 = X10_TEMP87;
											final int X10_TEMP89 = X10_TEMP88;
											disp1 = X10_TEMP89;
											final int X10_TEMP91 = 2;
											final boolean X10_TEMP92 = jj == X10_TEMP91;
											final int X10_TEMP93 = 1;
											final int X10_TEMP94 = 0;
											int X10_TEMP97 = 0;
											if (X10_TEMP92) {
												X10_TEMP97 = X10_TEMP94
														- X10_TEMP93;
											}
											final int X10_TEMP98 = X10_TEMP97;
											final int X10_TEMP99 = X10_TEMP98;
											disp2 = X10_TEMP99;
										}
										int source0 = dest0 - disp0;
										int source1 = dest1 - disp1;
										int source2 = dest2 - disp2;
										final Region3 X10_TEMP104 = X10_TEMP0.m_placeGrid;
										final Point3 RX10_TEMP45 = new Point3(
												source0, source1, source2);
										final boolean RX10_TEMP46 = Program
												.regionContainsPoint3(
														X10_TEMP104,
														RX10_TEMP45);
										final boolean X10_TEMP109 = RX10_TEMP46;
										if (X10_TEMP109) {
											final Region3 X10_TEMP110 = X10_TEMP0.m_placeGrid;
											final Point3 RX10_TEMP47 = new Point3(
													source0, source1, source2);
											final int RX10_TEMP48 = Program
													.searchPointInRegion3(
															X10_TEMP110,
															RX10_TEMP47);
											final int RX10_TEMP49 = 0;
											final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49;
											if (RX10_TEMP50) {
												String RX10_TEMP51 = "Array access index out of bounds";
												throw new RuntimeException(
														RX10_TEMP51);
											}
											final int X10_TEMP115 = RX10_TEMP48;
											sourceID = X10_TEMP115;
											final Wrapper X10_TEMP117 = Program
													.LevelData_get_m_u(
															X10_TEMP0, ii);
											final doubleRefArray3 X10_TEMP118 = X10_TEMP117.m_array;
											doubleRefArray3 ma = X10_TEMP118;
											final Wrapper X10_TEMP121 = Program
													.LevelData_get_m_u(
															X10_TEMP0, ii);
											final doubleRefArray3 X10_TEMP122 = X10_TEMP121.m_array;
											final Region3 X10_TEMP126 = Program
													.LevelData_get_m_boundaries(
															X10_TEMP0, k, ii);
											final Wrapper X10_TEMP129 = Program
													.LevelData_get_m_u(
															X10_TEMP0, sourceID);
											final doubleRefArray3 X10_TEMP130 = X10_TEMP129.m_array;
											Program.Util_arraycopy3(
													X10_TEMP122, X10_TEMP126,
													X10_TEMP130);
										} else {
											final int X10_TEMP132 = 0;
											final boolean X10_TEMP134 = jj == X10_TEMP132;
											if (X10_TEMP134) {
												final int X10_TEMP135 = X10_TEMP0.m_block0;
												final int X10_TEMP136 = 1;
												final int X10_TEMP138 = X10_TEMP135
														- X10_TEMP136;
												final int X10_TEMP139 = disp0
														* X10_TEMP138;
												final int X10_TEMP141 = dest0
														+ X10_TEMP139;
												source0 = X10_TEMP141;
												final int X10_TEMP142 = X10_TEMP0.m_block0;
												final int X10_TEMP143 = 1;
												final int X10_TEMP145 = X10_TEMP142
														- X10_TEMP143;
												final int X10_TEMP146 = disp1
														* X10_TEMP145;
												final int X10_TEMP148 = dest1
														+ X10_TEMP146;
												source1 = X10_TEMP148;
												final int X10_TEMP149 = X10_TEMP0.m_block0;
												final int X10_TEMP150 = 1;
												final int X10_TEMP152 = X10_TEMP149
														- X10_TEMP150;
												final int X10_TEMP153 = disp2
														* X10_TEMP152;
												final int X10_TEMP155 = dest2
														+ X10_TEMP153;
												source2 = X10_TEMP155;
											} else {
												final int X10_TEMP156 = 1;
												final boolean X10_TEMP158 = jj == X10_TEMP156;
												if (X10_TEMP158) {
													final int X10_TEMP159 = X10_TEMP0.m_block1;
													final int X10_TEMP160 = 1;
													final int X10_TEMP162 = X10_TEMP159
															- X10_TEMP160;
													final int X10_TEMP163 = disp0
															* X10_TEMP162;
													final int X10_TEMP165 = dest0
															+ X10_TEMP163;
													source0 = X10_TEMP165;
													final int X10_TEMP166 = X10_TEMP0.m_block1;
													final int X10_TEMP167 = 1;
													final int X10_TEMP169 = X10_TEMP166
															- X10_TEMP167;
													final int X10_TEMP170 = disp1
															* X10_TEMP169;
													final int X10_TEMP172 = dest1
															+ X10_TEMP170;
													source1 = X10_TEMP172;
													final int X10_TEMP173 = X10_TEMP0.m_block1;
													final int X10_TEMP174 = 1;
													final int X10_TEMP176 = X10_TEMP173
															- X10_TEMP174;
													final int X10_TEMP177 = disp2
															* X10_TEMP176;
													final int X10_TEMP179 = dest2
															+ X10_TEMP177;
													source2 = X10_TEMP179;
												} else {
													final int X10_TEMP180 = X10_TEMP0.m_block2;
													final int X10_TEMP181 = 1;
													final int X10_TEMP183 = X10_TEMP180
															- X10_TEMP181;
													final int X10_TEMP184 = disp0
															* X10_TEMP183;
													final int X10_TEMP186 = dest0
															+ X10_TEMP184;
													source0 = X10_TEMP186;
													final int X10_TEMP187 = X10_TEMP0.m_block2;
													final int X10_TEMP188 = 1;
													final int X10_TEMP190 = X10_TEMP187
															- X10_TEMP188;
													final int X10_TEMP191 = disp1
															* X10_TEMP190;
													final int X10_TEMP193 = dest1
															+ X10_TEMP191;
													source1 = X10_TEMP193;
													final int X10_TEMP194 = X10_TEMP0.m_block2;
													final int X10_TEMP195 = 1;
													final int X10_TEMP197 = X10_TEMP194
															- X10_TEMP195;
													final int X10_TEMP198 = disp2
															* X10_TEMP197;
													final int X10_TEMP200 = dest2
															+ X10_TEMP198;
													source2 = X10_TEMP200;
												}
											}
											final Region3 X10_TEMP201 = X10_TEMP0.m_placeGrid;
											final Point3 RX10_TEMP52 = new Point3(
													source0, source1, source2);
											final int RX10_TEMP53 = Program
													.searchPointInRegion3(
															X10_TEMP201,
															RX10_TEMP52);
											final int RX10_TEMP54 = 0;
											final boolean RX10_TEMP55 = RX10_TEMP53 < RX10_TEMP54;
											if (RX10_TEMP55) {
												String RX10_TEMP56 = "Array access index out of bounds";
												throw new RuntimeException(
														RX10_TEMP56);
											}
											final int X10_TEMP206 = RX10_TEMP53;
											sourceID = X10_TEMP206;
											final int X10_TEMP207 = 0;
											final boolean X10_TEMP209 = jj == X10_TEMP207;
											if (X10_TEMP209) {
												final int X10_TEMP210 = X10_TEMP0.m_size0;
												final int X10_TEMP212 = disp0
														* X10_TEMP210;
												trans0 = X10_TEMP212;
												final int X10_TEMP213 = X10_TEMP0.m_size0;
												final int X10_TEMP215 = disp1
														* X10_TEMP213;
												trans1 = X10_TEMP215;
												final int X10_TEMP216 = X10_TEMP0.m_size0;
												final int X10_TEMP218 = disp2
														* X10_TEMP216;
												trans2 = X10_TEMP218;
											} else {
												final int X10_TEMP219 = 1;
												final boolean X10_TEMP221 = jj == X10_TEMP219;
												if (X10_TEMP221) {
													final int X10_TEMP222 = X10_TEMP0.m_size1;
													final int X10_TEMP224 = disp0
															* X10_TEMP222;
													trans0 = X10_TEMP224;
													final int X10_TEMP225 = X10_TEMP0.m_size1;
													final int X10_TEMP227 = disp1
															* X10_TEMP225;
													trans1 = X10_TEMP227;
													final int X10_TEMP228 = X10_TEMP0.m_size1;
													final int X10_TEMP230 = disp2
															* X10_TEMP228;
													trans2 = X10_TEMP230;
												} else {
													final int X10_TEMP231 = X10_TEMP0.m_size2;
													final int X10_TEMP233 = disp0
															* X10_TEMP231;
													trans0 = X10_TEMP233;
													final int X10_TEMP234 = X10_TEMP0.m_size2;
													final int X10_TEMP236 = disp1
															* X10_TEMP234;
													trans1 = X10_TEMP236;
													final int X10_TEMP237 = X10_TEMP0.m_size2;
													final int X10_TEMP239 = disp2
															* X10_TEMP237;
													trans2 = X10_TEMP239;
												}
											}
											final Wrapper X10_TEMP241 = Program
													.LevelData_get_m_u(
															X10_TEMP0, ii);
											final doubleRefArray3 X10_TEMP242 = X10_TEMP241.m_array;
											final Region3 X10_TEMP246 = Program
													.LevelData_get_m_boundaries(
															X10_TEMP0, k, ii);
											final Wrapper X10_TEMP249 = Program
													.LevelData_get_m_u(
															X10_TEMP0, sourceID);
											final doubleRefArray3 X10_TEMP250 = X10_TEMP249.m_array;
											Program.Util_arraycopy4(
													X10_TEMP242, X10_TEMP246,
													X10_TEMP250, trans0,
													trans1, trans2);
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static Region3 LevelData_get_m_regions(final LevelData X10_TEMP0,
			final int i) {
		final int h = /* here */0;
		final int X10_TEMP4 = 0;
		final int X10_TEMP5 = 0;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4,
				X10_TEMP5);
		final int X10_TEMP7 = /* here */0;
		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);
		final Dist1 dRecv = X10_TEMP9;
		final Region1 RX10_TEMP0 = dRecv.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Region3Stub[] RX10_TEMP6 = new Region3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(dRecv,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Region3[] RX10_TEMP14 = new Region3[RX10_TEMP13];
					final Region3Stub RX10_TEMP15 = new Region3Stub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Region3Stub[] SX10_TEMP6 = new Region3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Region3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Region3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1(dRecv,
				RX10_TEMP16);
		final Region3RefArray1 X10_TEMP11 = RX10_TEMP19;
		final Region3RefArray1 aRecv = X10_TEMP11; /* finish */
		{
			final Region3RefArray1 X10_TEMP13 = X10_TEMP0.m_regions;
			final Dist1 RX10_TEMP20 = X10_TEMP13.distValue;
			final Dist1 X10_TEMP14 = RX10_TEMP20;
			final Point1 RX10_TEMP21 = new Point1(i);
			final Region1 RX10_TEMP22 = X10_TEMP14.dReg;
			final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22,
					RX10_TEMP21);
			final int RX10_TEMP24 = 0;
			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if (RX10_TEMP25) {
				final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14.";
				throw new RuntimeException(RX10_TEMP26);
			}
			final int RX10_TEMP27 = Program.getPlaceFromDist1(X10_TEMP14,
					RX10_TEMP23);
			final int X10_TEMP17 = RX10_TEMP27; /* async ( X10_TEMP17 ) */
			{
				final Region3RefArray1 X10_TEMP18 = X10_TEMP0.m_regions;
				final Point1 RX10_TEMP28 = new Point1(i);
				final Dist1 RX10_TEMP29 = X10_TEMP18.distValue;
				final Region1 RX10_TEMP30 = RX10_TEMP29.dReg;
				final int RX10_TEMP31 = Program.searchPointInRegion1(
						RX10_TEMP30, RX10_TEMP28);
				final int RX10_TEMP32 = 0;
				final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
				if (RX10_TEMP33) {
					String RX10_TEMP34 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP34);
				}
				final int RX10_TEMP35 = Program.getPlaceFromDist1(RX10_TEMP29,
						RX10_TEMP31);
				final int RX10_TEMP37 = /* here */0;
				final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
				if (RX10_TEMP38) {
					String RX10_TEMP36 = "Bad place access for array X10_TEMP18";
					throw new RuntimeException(RX10_TEMP36);
				}
				final Region3 RX10_TEMP39 = Program.getRefArrayValue1Region3(
						X10_TEMP18, RX10_TEMP31);
				final Region3 X10_TEMP20 = RX10_TEMP39;
				final Region3 temp3 = X10_TEMP20; /* async ( h ) */
				{
					final int X10_TEMP24 = 0;
					final Region3 X10_TEMP27 = temp3;
					final Point1 RX10_TEMP40 = new Point1(X10_TEMP24);
					final Dist1 RX10_TEMP41 = aRecv.distValue;
					final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;
					final int RX10_TEMP43 = Program.searchPointInRegion1(
							RX10_TEMP42, RX10_TEMP40);
					final int RX10_TEMP44 = 0;
					final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
					if (RX10_TEMP45) {
						String RX10_TEMP46 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP46);
					}
					final int RX10_TEMP47 = Program.getPlaceFromDist1(
							RX10_TEMP41, RX10_TEMP43);
					final int RX10_TEMP49 = /* here */0;
					final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
					if (RX10_TEMP50) {
						String RX10_TEMP48 = "Bad place access for array aRecv";
						throw new RuntimeException(RX10_TEMP48);
					}
					Program.setRefArrayValue1Region3(aRecv, RX10_TEMP43,
							X10_TEMP27);
				}
			}
		}
		final int X10_TEMP29 = 0;
		final Point1 RX10_TEMP51 = new Point1(X10_TEMP29);
		final Dist1 RX10_TEMP52 = aRecv.distValue;
		final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;
		final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53,
				RX10_TEMP51);
		final int RX10_TEMP55 = 0;
		final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP57 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP57);
		}
		final int RX10_TEMP58 = Program.getPlaceFromDist1(RX10_TEMP52,
				RX10_TEMP54);
		final int RX10_TEMP60 = /* here */0;
		final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
		if (RX10_TEMP61) {
			String RX10_TEMP59 = "Bad place access for array aRecv";
			throw new RuntimeException(RX10_TEMP59);
		}
		final Region3 RX10_TEMP62 = Program.getRefArrayValue1Region3(aRecv,
				RX10_TEMP54);
		final Region3 X10_TEMP30 = RX10_TEMP62;
		final Region3 mri = X10_TEMP30;
		return mri;
	}

	public static Region3 LevelData_get_m_REGIONs(final LevelData X10_TEMP0,
			final int i) {
		final int h = /* here */0;
		final int X10_TEMP4 = 0;
		final int X10_TEMP5 = 0;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4,
				X10_TEMP5);
		final int X10_TEMP7 = /* here */0;
		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);
		final Dist1 dRecv = X10_TEMP9;
		final Region1 RX10_TEMP0 = dRecv.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Region3Stub[] RX10_TEMP6 = new Region3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(dRecv,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Region3[] RX10_TEMP14 = new Region3[RX10_TEMP13];
					final Region3Stub RX10_TEMP15 = new Region3Stub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Region3Stub[] SX10_TEMP6 = new Region3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Region3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Region3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1(dRecv,
				RX10_TEMP16);
		final Region3RefArray1 X10_TEMP11 = RX10_TEMP19;
		final Region3RefArray1 aRecv = X10_TEMP11; /* finish */
		{
			final Region3RefArray1 X10_TEMP13 = X10_TEMP0.m_REGIONs;
			final Dist1 RX10_TEMP20 = X10_TEMP13.distValue;
			final Dist1 X10_TEMP14 = RX10_TEMP20;
			final Point1 RX10_TEMP21 = new Point1(i);
			final Region1 RX10_TEMP22 = X10_TEMP14.dReg;
			final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22,
					RX10_TEMP21);
			final int RX10_TEMP24 = 0;
			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if (RX10_TEMP25) {
				final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14.";
				throw new RuntimeException(RX10_TEMP26);
			}
			final int RX10_TEMP27 = Program.getPlaceFromDist1(X10_TEMP14,
					RX10_TEMP23);
			final int X10_TEMP17 = RX10_TEMP27; /* async ( X10_TEMP17 ) */
			{
				final Region3RefArray1 X10_TEMP18 = X10_TEMP0.m_REGIONs;
				final Point1 RX10_TEMP28 = new Point1(i);
				final Dist1 RX10_TEMP29 = X10_TEMP18.distValue;
				final Region1 RX10_TEMP30 = RX10_TEMP29.dReg;
				final int RX10_TEMP31 = Program.searchPointInRegion1(
						RX10_TEMP30, RX10_TEMP28);
				final int RX10_TEMP32 = 0;
				final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
				if (RX10_TEMP33) {
					String RX10_TEMP34 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP34);
				}
				final int RX10_TEMP35 = Program.getPlaceFromDist1(RX10_TEMP29,
						RX10_TEMP31);
				final int RX10_TEMP37 = /* here */0;
				final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
				if (RX10_TEMP38) {
					String RX10_TEMP36 = "Bad place access for array X10_TEMP18";
					throw new RuntimeException(RX10_TEMP36);
				}
				final Region3 RX10_TEMP39 = Program.getRefArrayValue1Region3(
						X10_TEMP18, RX10_TEMP31);
				final Region3 X10_TEMP20 = RX10_TEMP39;
				final Region3 temp3 = X10_TEMP20; /* async ( h ) */
				{
					final int X10_TEMP24 = 0;
					final Region3 X10_TEMP27 = temp3;
					final Point1 RX10_TEMP40 = new Point1(X10_TEMP24);
					final Dist1 RX10_TEMP41 = aRecv.distValue;
					final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;
					final int RX10_TEMP43 = Program.searchPointInRegion1(
							RX10_TEMP42, RX10_TEMP40);
					final int RX10_TEMP44 = 0;
					final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
					if (RX10_TEMP45) {
						String RX10_TEMP46 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP46);
					}
					final int RX10_TEMP47 = Program.getPlaceFromDist1(
							RX10_TEMP41, RX10_TEMP43);
					final int RX10_TEMP49 = /* here */0;
					final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
					if (RX10_TEMP50) {
						String RX10_TEMP48 = "Bad place access for array aRecv";
						throw new RuntimeException(RX10_TEMP48);
					}
					Program.setRefArrayValue1Region3(aRecv, RX10_TEMP43,
							X10_TEMP27);
				}
			}
		}
		final int X10_TEMP29 = 0;
		final Point1 RX10_TEMP51 = new Point1(X10_TEMP29);
		final Dist1 RX10_TEMP52 = aRecv.distValue;
		final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;
		final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53,
				RX10_TEMP51);
		final int RX10_TEMP55 = 0;
		final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP57 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP57);
		}
		final int RX10_TEMP58 = Program.getPlaceFromDist1(RX10_TEMP52,
				RX10_TEMP54);
		final int RX10_TEMP60 = /* here */0;
		final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
		if (RX10_TEMP61) {
			String RX10_TEMP59 = "Bad place access for array aRecv";
			throw new RuntimeException(RX10_TEMP59);
		}
		final Region3 RX10_TEMP62 = Program.getRefArrayValue1Region3(aRecv,
				RX10_TEMP54);
		final Region3 X10_TEMP30 = RX10_TEMP62;
		final Region3 mri = X10_TEMP30;
		return mri;
	}

	public static Region3 LevelData_get_m_boundaries(final LevelData X10_TEMP0,
			final int i, final int j) {
		final int h = /* here */0;
		final int X10_TEMP4 = 0;
		final int X10_TEMP5 = 0;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4,
				X10_TEMP5);
		final int X10_TEMP7 = /* here */0;
		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);
		final Dist1 dRecv = X10_TEMP9;
		final Region1 RX10_TEMP0 = dRecv.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Region3Stub[] RX10_TEMP6 = new Region3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(dRecv,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Region3[] RX10_TEMP14 = new Region3[RX10_TEMP13];
					final Region3Stub RX10_TEMP15 = new Region3Stub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Region3Stub[] SX10_TEMP6 = new Region3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Region3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Region3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1(dRecv,
				RX10_TEMP16);
		final Region3RefArray1 X10_TEMP11 = RX10_TEMP19;
		final Region3RefArray1 aRecv = X10_TEMP11; /* finish */
		{
			final Region3RefArray2 X10_TEMP13 = X10_TEMP0.m_boundaries;
			final Dist2 RX10_TEMP20 = X10_TEMP13.distValue;
			final Dist2 X10_TEMP14 = RX10_TEMP20;
			final Point2 RX10_TEMP21 = new Point2(i, j);
			final Region2 RX10_TEMP22 = X10_TEMP14.dReg;
			final int RX10_TEMP23 = Program.searchPointInRegion2(RX10_TEMP22,
					RX10_TEMP21);
			final int RX10_TEMP24 = 0;
			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if (RX10_TEMP25) {
				final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14.";
				throw new RuntimeException(RX10_TEMP26);
			}
			final int RX10_TEMP27 = Program.getPlaceFromDist2(X10_TEMP14,
					RX10_TEMP23);
			final int X10_TEMP18 = RX10_TEMP27; /* async ( X10_TEMP18 ) */
			{
				final Region3RefArray2 X10_TEMP19 = X10_TEMP0.m_boundaries;
				final Point2 RX10_TEMP28 = new Point2(i, j);
				final Dist2 RX10_TEMP29 = X10_TEMP19.distValue;
				final Region2 RX10_TEMP30 = RX10_TEMP29.dReg;
				final int RX10_TEMP31 = Program.searchPointInRegion2(
						RX10_TEMP30, RX10_TEMP28);
				final int RX10_TEMP32 = 0;
				final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
				if (RX10_TEMP33) {
					String RX10_TEMP34 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP34);
				}
				final int RX10_TEMP35 = Program.getPlaceFromDist2(RX10_TEMP29,
						RX10_TEMP31);
				final int RX10_TEMP37 = /* here */0;
				final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
				if (RX10_TEMP38) {
					String RX10_TEMP36 = "Bad place access for array X10_TEMP19";
					throw new RuntimeException(RX10_TEMP36);
				}
				final Region3 RX10_TEMP39 = Program.getRefArrayValue2Region3(
						X10_TEMP19, RX10_TEMP31);
				final Region3 X10_TEMP22 = RX10_TEMP39;
				final Region3 temp4 = X10_TEMP22; /* async ( h ) */
				{
					final int X10_TEMP26 = 0;
					final Region3 X10_TEMP29 = temp4;
					final Point1 RX10_TEMP40 = new Point1(X10_TEMP26);
					final Dist1 RX10_TEMP41 = aRecv.distValue;
					final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;
					final int RX10_TEMP43 = Program.searchPointInRegion1(
							RX10_TEMP42, RX10_TEMP40);
					final int RX10_TEMP44 = 0;
					final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
					if (RX10_TEMP45) {
						String RX10_TEMP46 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP46);
					}
					final int RX10_TEMP47 = Program.getPlaceFromDist1(
							RX10_TEMP41, RX10_TEMP43);
					final int RX10_TEMP49 = /* here */0;
					final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
					if (RX10_TEMP50) {
						String RX10_TEMP48 = "Bad place access for array aRecv";
						throw new RuntimeException(RX10_TEMP48);
					}
					Program.setRefArrayValue1Region3(aRecv, RX10_TEMP43,
							X10_TEMP29);
				}
			}
		}
		final int X10_TEMP31 = 0;
		final Point1 RX10_TEMP51 = new Point1(X10_TEMP31);
		final Dist1 RX10_TEMP52 = aRecv.distValue;
		final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;
		final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53,
				RX10_TEMP51);
		final int RX10_TEMP55 = 0;
		final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP57 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP57);
		}
		final int RX10_TEMP58 = Program.getPlaceFromDist1(RX10_TEMP52,
				RX10_TEMP54);
		final int RX10_TEMP60 = /* here */0;
		final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
		if (RX10_TEMP61) {
			String RX10_TEMP59 = "Bad place access for array aRecv";
			throw new RuntimeException(RX10_TEMP59);
		}
		final Region3 RX10_TEMP62 = Program.getRefArrayValue1Region3(aRecv,
				RX10_TEMP54);
		final Region3 X10_TEMP32 = RX10_TEMP62;
		final Region3 mri = X10_TEMP32;
		return mri;
	}

	public static Wrapper LevelData_get_m_u(final LevelData X10_TEMP0,
			final int i) {
		final int h = /* here */0;
		final int X10_TEMP4 = 0;
		final int X10_TEMP5 = 0;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP4,
				X10_TEMP5);
		final int X10_TEMP7 = /* here */0;
		final Dist1 X10_TEMP9 = Program.getPlaceDist1(X10_TEMP6, X10_TEMP7);
		final Dist1 dRecv = X10_TEMP9;
		final Region1 RX10_TEMP0 = dRecv.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final WrapperStub[] RX10_TEMP6 = new WrapperStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(dRecv,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Wrapper[] RX10_TEMP14 = new Wrapper[RX10_TEMP13];
					final WrapperStub RX10_TEMP15 = new WrapperStub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final WrapperStub[] SX10_TEMP6 = new WrapperStub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final WrapperStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final WrapperStub[] RX10_TEMP16 = SX10_TEMP6;
		final WrapperRefArray1 RX10_TEMP19 = new WrapperRefArray1(dRecv,
				RX10_TEMP16);
		final WrapperRefArray1 X10_TEMP11 = RX10_TEMP19;
		final WrapperRefArray1 aRecv = X10_TEMP11; /* finish */
		{
			final WrapperRefArray1 X10_TEMP13 = X10_TEMP0.m_u;
			final Dist1 RX10_TEMP20 = X10_TEMP13.distValue;
			final Dist1 X10_TEMP14 = RX10_TEMP20;
			final Point1 RX10_TEMP21 = new Point1(i);
			final Region1 RX10_TEMP22 = X10_TEMP14.dReg;
			final int RX10_TEMP23 = Program.searchPointInRegion1(RX10_TEMP22,
					RX10_TEMP21);
			final int RX10_TEMP24 = 0;
			final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24;
			if (RX10_TEMP25) {
				final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14.";
				throw new RuntimeException(RX10_TEMP26);
			}
			final int RX10_TEMP27 = Program.getPlaceFromDist1(X10_TEMP14,
					RX10_TEMP23);
			final int X10_TEMP17 = RX10_TEMP27; /* async ( X10_TEMP17 ) */
			{
				final WrapperRefArray1 X10_TEMP18 = X10_TEMP0.m_u;
				final Point1 RX10_TEMP28 = new Point1(i);
				final Dist1 RX10_TEMP29 = X10_TEMP18.distValue;
				final Region1 RX10_TEMP30 = RX10_TEMP29.dReg;
				final int RX10_TEMP31 = Program.searchPointInRegion1(
						RX10_TEMP30, RX10_TEMP28);
				final int RX10_TEMP32 = 0;
				final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
				if (RX10_TEMP33) {
					String RX10_TEMP34 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP34);
				}
				final int RX10_TEMP35 = Program.getPlaceFromDist1(RX10_TEMP29,
						RX10_TEMP31);
				final int RX10_TEMP37 = /* here */0;
				final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
				if (RX10_TEMP38) {
					String RX10_TEMP36 = "Bad place access for array X10_TEMP18";
					throw new RuntimeException(RX10_TEMP36);
				}
				final Wrapper RX10_TEMP39 = Program.getRefArrayValue1Wrapper(
						X10_TEMP18, RX10_TEMP31);
				final Wrapper temp4 = RX10_TEMP39; /* async ( h ) */
				{
					final int X10_TEMP23 = 0;
					final Wrapper X10_TEMP26 = temp4;
					final Point1 RX10_TEMP40 = new Point1(X10_TEMP23);
					final Dist1 RX10_TEMP41 = aRecv.distValue;
					final Region1 RX10_TEMP42 = RX10_TEMP41.dReg;
					final int RX10_TEMP43 = Program.searchPointInRegion1(
							RX10_TEMP42, RX10_TEMP40);
					final int RX10_TEMP44 = 0;
					final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44;
					if (RX10_TEMP45) {
						String RX10_TEMP46 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP46);
					}
					final int RX10_TEMP47 = Program.getPlaceFromDist1(
							RX10_TEMP41, RX10_TEMP43);
					final int RX10_TEMP49 = /* here */0;
					final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49;
					if (RX10_TEMP50) {
						String RX10_TEMP48 = "Bad place access for array aRecv";
						throw new RuntimeException(RX10_TEMP48);
					}
					Program.setRefArrayValue1Wrapper(aRecv, RX10_TEMP43,
							X10_TEMP26);
				}
			}
		}
		final int X10_TEMP28 = 0;
		final Point1 RX10_TEMP51 = new Point1(X10_TEMP28);
		final Dist1 RX10_TEMP52 = aRecv.distValue;
		final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;
		final int RX10_TEMP54 = Program.searchPointInRegion1(RX10_TEMP53,
				RX10_TEMP51);
		final int RX10_TEMP55 = 0;
		final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP57 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP57);
		}
		final int RX10_TEMP58 = Program.getPlaceFromDist1(RX10_TEMP52,
				RX10_TEMP54);
		final int RX10_TEMP60 = /* here */0;
		final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
		if (RX10_TEMP61) {
			String RX10_TEMP59 = "Bad place access for array aRecv";
			throw new RuntimeException(RX10_TEMP59);
		}
		final Wrapper RX10_TEMP62 = Program.getRefArrayValue1Wrapper(aRecv,
				RX10_TEMP54);
		final Wrapper mri = RX10_TEMP62;
		return mri;
	}

	public static void MGDriver_driver() {
		int CLASS = 1;
		final boolean isDistributed = true;
		int problemSize = 0;
		int numberIterations = 0;
		double reference2Norm = 0;
		final int X10_TEMP8 = 1;
		final int X10_TEMP16 = 2;
		final int X10_TEMP24 = 3;
		final int X10_TEMP32 = 4;
		final int X10_TEMP40 = 5;
		final int X10_TEMP48 = 6;
		switch (CLASS) {
		case X10_TEMP8: {
			final int X10_TEMP10 = 32;
			problemSize = X10_TEMP10;
			final int X10_TEMP12 = 4;
			numberIterations = X10_TEMP12;
			final double X10_TEMP14 = 5.30770700573E-5;
			reference2Norm = X10_TEMP14;
			break;
		}
		case X10_TEMP16: {
			final int X10_TEMP18 = 64;
			problemSize = X10_TEMP18;
			final int X10_TEMP20 = 40;
			numberIterations = X10_TEMP20;
			final double X10_TEMP22 = 2.50391406439E-18;
			reference2Norm = X10_TEMP22;
			break;
		}
		case X10_TEMP24: {
			final int X10_TEMP26 = 256;
			problemSize = X10_TEMP26;
			final int X10_TEMP28 = 4;
			numberIterations = X10_TEMP28;
			final double X10_TEMP30 = 2.433365309e-6;
			reference2Norm = X10_TEMP30;
			break;
		}
		case X10_TEMP32: {
			final int X10_TEMP34 = 256;
			problemSize = X10_TEMP34;
			final int X10_TEMP36 = 20;
			numberIterations = X10_TEMP36;
			final double X10_TEMP38 = 1.80056440132e-6;
			reference2Norm = X10_TEMP38;
			break;
		}
		case X10_TEMP40: {
			final int X10_TEMP42 = 512;
			problemSize = X10_TEMP42;
			final int X10_TEMP44 = 20;
			numberIterations = X10_TEMP44;
			final double X10_TEMP46 = 5.70674826298e-7;
			reference2Norm = X10_TEMP46;
			break;
		}
		case X10_TEMP48: {
			final int X10_TEMP50 = 1024;
			problemSize = X10_TEMP50;
			final int X10_TEMP52 = 50;
			numberIterations = X10_TEMP52;
			final double X10_TEMP54 = 1.58327506043e-10;
			reference2Norm = X10_TEMP54;
			break;
		}
		default: {
			final String X10_TEMP56 = "Class must be one of {S,W,A,B,C,D}!";
			System.err.println(X10_TEMP56);
		}
		}
		LevelData u = new LevelData(problemSize, isDistributed);
		LevelData v = new LevelData(problemSize, isDistributed);
		Program.LevelData_initialize(v, CLASS);
		MGOP MG = new MGOP(problemSize);
		final String X10_TEMP66 = "There are ";
		final String X10_TEMP67 = X10_TEMP66 + _Util_N_PLACES;
		final String X10_TEMP68 = " places. Running problem of class ";
		final String X10_TEMP69 = X10_TEMP67 + X10_TEMP68;
		final String X10_TEMP71 = X10_TEMP69 + CLASS;
		System.out.println(X10_TEMP71);
		Timer tmr = new Timer();
		int count = 0;
		Program.Timer_start(tmr, count);
		double res = 0;
		final double X10_TEMP80 = Program.MGOP_MGSolve(MG, u, v,
				numberIterations);
		res = X10_TEMP80;
		Program.Timer_stop(tmr, count);
		final String X10_TEMP82 = "The reference 2norm is ";
		final String X10_TEMP83 = X10_TEMP82 + reference2Norm;
		final String X10_TEMP84 = ". The difference is ";
		final String X10_TEMP87 = X10_TEMP83 + X10_TEMP84;
		final double X10_TEMP86 = res - reference2Norm;
		final String X10_TEMP89 = X10_TEMP87 + X10_TEMP86;
		System.out.println(X10_TEMP89);
		final String X10_TEMP91 = "Wall-clock time for MGSolve: ";
		final double X10_TEMP92 = Program.Timer_readTimer(tmr, count);
		final String X10_TEMP93 = X10_TEMP91 + X10_TEMP92;
		final String X10_TEMP94 = "secs";
		final String X10_TEMP96 = X10_TEMP93 + X10_TEMP94;
		System.out.println(X10_TEMP96);
	}

	public static void runMain() {
		final MGDriver X10_TEMP1 = new MGDriver();
		Program.MGDriver_driver();
	}

	public static boolean _MGOP_PERF_On_init() {
		return _Util_PERF_OUTPUT;
	}

	public static double _MGOP_PERF_Comp_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP3 = X10_TEMP1 / _Util_FP_PERCLOCK;
		return X10_TEMP3;
	}

	public static double _MGOP_PERF_CommL_init() {
		final double X10_TEMP2 = _Util_COMM_LATENCY * _Util_CLOCK_SPEED;
		return X10_TEMP2;
	}

	public static double _MGOP_PERF_CommB_init() {
		final double X10_TEMP1 = (double) _Util_CLOCK_SPEED;
		final double X10_TEMP2 = (double) _Util_COMM_BANDWIDTH;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		final double X10_TEMP5 = 8.0;
		final double X10_TEMP7 = X10_TEMP4 * X10_TEMP5;
		return X10_TEMP7;
	}

	public static boolean _MGOP_PERF_InLoop_init() {
		return _Util_IN_LOOP;
	}

	public static boolean _MGOP_PERF_CompOnly_init() {
		return _Util_COMP_ONLY;
	}

	public static boolean _MGOP_PERF_CommOnly_init() {
		return _Util_COMM_ONLY;
	}

	public static boolean _MGOP_OVERLAPPED_init() {
		return _Util_OVERLAP_COMMANDCOMP;
	}

	public static Region1 _MGOP_reg_init() {
		final int X10_TEMP3 = 0;
		final int X10_TEMP4 = 3;
		final Region1 X10_TEMP6 = Program.createNewRegion1R(X10_TEMP3,
				X10_TEMP4);
		return X10_TEMP6;
	}

	public static double _MGOP_Ac0_init() {
		final double X10_TEMP1 = 8.0;
		final int X10_TEMP2 = 0;
		final double X10_TEMP3 = X10_TEMP2 - X10_TEMP1;
		final double X10_TEMP4 = 3.0;
		final double X10_TEMP6 = X10_TEMP3 / X10_TEMP4;
		return X10_TEMP6;
	}

	public static double _MGOP_Ac1_init() {
		final double X10_TEMP2 = 0.0;
		return X10_TEMP2;
	}

	public static double _MGOP_Ac2_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 6.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Ac3_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 12.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Sac0_init() {
		final double X10_TEMP1 = 3.0;
		final int X10_TEMP2 = 0;
		final double X10_TEMP3 = X10_TEMP2 - X10_TEMP1;
		final double X10_TEMP4 = 8.0;
		final double X10_TEMP6 = X10_TEMP3 / X10_TEMP4;
		return X10_TEMP6;
	}

	public static double _MGOP_Sac1_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 32.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Sac2_init() {
		final double X10_TEMP1 = 1.0;
		final int X10_TEMP2 = 0;
		final double X10_TEMP3 = X10_TEMP2 - X10_TEMP1;
		final double X10_TEMP4 = 64.0;
		final double X10_TEMP6 = X10_TEMP3 / X10_TEMP4;
		return X10_TEMP6;
	}

	public static double _MGOP_Sac3_init() {
		final double X10_TEMP2 = 0.0;
		return X10_TEMP2;
	}

	public static double _MGOP_Pc0_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 2.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Pc1_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 4.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Pc2_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 8.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static double _MGOP_Pc3_init() {
		final double X10_TEMP1 = 1.0;
		final double X10_TEMP2 = 16.0;
		final double X10_TEMP4 = X10_TEMP1 / X10_TEMP2;
		return X10_TEMP4;
	}

	public static int _MGOP_P2SLEVEL_init() {
		final int X10_TEMP1 = 1;
		final int X10_TEMP3 = _Util_P2SLEVEL - X10_TEMP1;
		return X10_TEMP3;
	}

	public static void MGOP_computeResidual2(final MGOP X10_TEMP0,
			final LevelData RES, final LevelData a_arg) { /* finish */
		{
			final Dist1 X10_TEMP2 = Program.LevelData_getPlaces(RES);
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(RES,
							i);
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					Region3 R = Program.LevelData_getInnerRegion(RES, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final Dist3 RX10_TEMP17 = arg.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(arg, RX10_TEMP19);
						double d0 = RX10_TEMP27;
						double d1 = 0;
						double d2 = Program.Util_sumDIFF2(p, arg);
						double d3 = Program.Util_sumDIFF3(p, arg);
						final Dist3 RX10_TEMP28 = res.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(res, RX10_TEMP30);
						final double X10_TEMP29 = RX10_TEMP38;
						final double X10_TEMP23 = _MGOP_Ac0 * d0;
						final double X10_TEMP24 = _MGOP_Ac2 * d2;
						final double X10_TEMP25 = X10_TEMP23 + X10_TEMP24;
						final double X10_TEMP26 = _MGOP_Ac3 * d3;
						final double X10_TEMP28 = X10_TEMP25 + X10_TEMP26;
						final double X10_TEMP32 = X10_TEMP29 - X10_TEMP28;
						final double X10_TEMP33 = X10_TEMP32;
						final Dist3 RX10_TEMP39 = res.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP41,
								X10_TEMP33);
					}
				}
			}
		}
		final boolean X10_TEMP35 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP35) { /* finish */
			{
				Program.LevelData_exchange(RES);
			}
		}
	}

	public static void MGOP_computeResidual3(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg1,
			final LevelData a_arg2) {
		if (_MGOP_OVERLAPPED) {
			Program.MGOP_ComputeResidual_Overlapped(X10_TEMP0, a_res, a_arg1,
					a_arg2);
		} else {
			Program.MGOP_ComputeResidual(X10_TEMP0, a_res, a_arg1, a_arg2);
		}
	}

	public static void MGOP_ComputeResidual(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg1,
			final LevelData a_arg2) {
		final boolean X10_TEMP1 = X10_TEMP0.EXCHANGE_After;
		final boolean X10_TEMP3 = !X10_TEMP1;
		if (X10_TEMP3) { /* finish */
			{
				Program.LevelData_exchange(a_arg2);
			}
		} /* finish */
		{
			final Dist1 X10_TEMP5 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP5.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP6 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP6.f0;
				final Region1 RX10_TEMP6 = X10_TEMP5.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP6);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP5,
						RX10_TEMP7);
				final int X10_TEMP7 = RX10_TEMP11; /* async ( X10_TEMP7 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg1 = Program.LevelData_getArray(
							a_arg1, i);
					final doubleRefArray3 arg2 = Program.LevelData_getArray(
							a_arg2, i);
					Region3 R = Program.LevelData_getInnerRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final Dist3 RX10_TEMP17 = arg2.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array arg2";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(arg2, RX10_TEMP19);
						double d0 = RX10_TEMP27;
						double d2 = Program.Util_sumDIFF2(p, arg2);
						double d3 = Program.Util_sumDIFF3(p, arg2);
						final Dist3 RX10_TEMP28 = arg1.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array arg1";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(arg1, RX10_TEMP30);
						final double X10_TEMP27 = RX10_TEMP38;
						final double X10_TEMP28 = _MGOP_Ac0 * d0;
						final double X10_TEMP29 = X10_TEMP27 - X10_TEMP28;
						final double X10_TEMP30 = _MGOP_Ac2 * d2;
						final double X10_TEMP31 = X10_TEMP29 - X10_TEMP30;
						final double X10_TEMP32 = _MGOP_Ac3 * d3;
						final double X10_TEMP35 = X10_TEMP31 - X10_TEMP32;
						final double X10_TEMP36 = X10_TEMP35;
						final Dist3 RX10_TEMP39 = res.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP41,
								X10_TEMP36);
					}
				}
			}
		}
		final boolean X10_TEMP38 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP38) { /* finish */
			{
				Program.LevelData_exchange(a_res);
			}
		}
	}

	public static void MGOP_ComputeResidual_Overlapped1(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg1,
			final LevelData a_arg2) { /* finish */
		{
			Program.LevelData_exchange(a_arg2);
			final Dist1 X10_TEMP2 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg1 = Program.LevelData_getArray(
							a_arg1, i);
					final doubleRefArray3 arg2 = Program.LevelData_getArray(
							a_arg2, i);
					Region3 R = Program.LevelData_getINNERRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final Dist3 RX10_TEMP17 = arg2.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array arg2";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(arg2, RX10_TEMP19);
						double d0 = RX10_TEMP27;
						double d2 = Program.Util_sumDIFF2(p, arg2);
						double d3 = Program.Util_sumDIFF3(p, arg2);
						final Dist3 RX10_TEMP28 = arg1.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array arg1";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(arg1, RX10_TEMP30);
						final double X10_TEMP24 = RX10_TEMP38;
						final double X10_TEMP25 = _MGOP_Ac0 * d0;
						final double X10_TEMP26 = X10_TEMP24 - X10_TEMP25;
						final double X10_TEMP27 = _MGOP_Ac2 * d2;
						final double X10_TEMP28 = X10_TEMP26 - X10_TEMP27;
						final double X10_TEMP29 = _MGOP_Ac3 * d3;
						final double X10_TEMP32 = X10_TEMP28 - X10_TEMP29;
						final double X10_TEMP33 = X10_TEMP32;
						final Dist3 RX10_TEMP39 = res.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP41,
								X10_TEMP33);
					}
				}
			}
		} /* finish */
		{
			final Dist1 X10_TEMP35 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP50 = X10_TEMP35.dReg;
			final int RX10_TEMP53 = 1;
			int RX10_TEMP51 = RX10_TEMP50.regSize;
			RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53;
			final int SX10_TEMP4 = 1;
			final int RX10_TEMP52 = RX10_TEMP51 + SX10_TEMP4;
			for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP52; SX10_TEMP5++) {
				final int RX10_TEMP49 = SX10_TEMP5;
				final int RX10_TEMP54 = RX10_TEMP49;
				final Point1 X10_TEMP36 = Program.regionOrdinalPoint1(
						RX10_TEMP50, RX10_TEMP54);
				final int i = X10_TEMP36.f0;
				final Region1 RX10_TEMP55 = X10_TEMP35.dReg;
				final int RX10_TEMP56 = Program.searchPointInRegion1(
						RX10_TEMP55, X10_TEMP36);
				final int RX10_TEMP57 = 0;
				final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
				if (RX10_TEMP58) {
					final String RX10_TEMP59 = "Point X10_TEMP36 not found in the distribution X10_TEMP35.";
					throw new RuntimeException(RX10_TEMP59);
				}
				final int RX10_TEMP60 = Program.getPlaceFromDist1(X10_TEMP35,
						RX10_TEMP56);
				final int X10_TEMP37 = RX10_TEMP60; /* async ( X10_TEMP37 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg1 = Program.LevelData_getArray(
							a_arg1, i);
					final doubleRefArray3 arg2 = Program.LevelData_getArray(
							a_arg2, i);
					final Region3 X10_TEMP46 = Program
							.LevelData_getInnerRegion(a_res, i);
					final Region3 X10_TEMP47 = Program
							.LevelData_getINNERRegion(a_res, i);
					final int X10_TEMP48 = 0;
					final int X10_TEMP49 = 1;
					final int X10_TEMP50 = X10_TEMP48 - X10_TEMP49;
					final int X10_TEMP51 = /* here */0;
					Region3 X10_TEMP52 = Program.createNewRegion3RRR(
							X10_TEMP48, X10_TEMP50, X10_TEMP48, X10_TEMP50,
							X10_TEMP48, X10_TEMP50);
					final int RX10_TEMP64 = 1;
					int RX10_TEMP62 = X10_TEMP46.regSize;
					RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64;
					final int SX10_TEMP6 = 1;
					final int RX10_TEMP63 = RX10_TEMP62 + SX10_TEMP6;
					for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP63; SX10_TEMP7++) {
						final int RX10_TEMP61 = SX10_TEMP7;
						final int RX10_TEMP65 = RX10_TEMP61;
						final Point3 X10_TEMP53 = Program.regionOrdinalPoint3(
								X10_TEMP46, RX10_TEMP65);
						final int X10_TEMP54 = X10_TEMP53.f0;
						final int X10_TEMP55 = X10_TEMP53.f1;
						final int X10_TEMP56 = X10_TEMP53.f2;
						final boolean RX10_TEMP66 = Program
								.regionContainsPoint3(X10_TEMP47, X10_TEMP53);
						boolean X10_TEMP57 = RX10_TEMP66;
						X10_TEMP57 = !X10_TEMP57;
						if (X10_TEMP57) {
							final Region3 X10_TEMP58 = Program
									.createNewRegion3RRR(X10_TEMP54,
											X10_TEMP54, X10_TEMP55, X10_TEMP55,
											X10_TEMP56, X10_TEMP56);
							X10_TEMP52 = Program.unionRegion3(X10_TEMP52,
									X10_TEMP58);
						}
					}
					final Region3 X10_TEMP59 = X10_TEMP52;
					Region3 R = X10_TEMP59;
					final int RX10_TEMP70 = 1;
					int RX10_TEMP68 = R.regSize;
					RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70;
					final int SX10_TEMP8 = 1;
					final int RX10_TEMP69 = RX10_TEMP68 + SX10_TEMP8;
					for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP69; SX10_TEMP9++) {
						final int RX10_TEMP67 = SX10_TEMP9;
						final int RX10_TEMP71 = RX10_TEMP67;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP71);
						final Dist3 RX10_TEMP72 = arg2.distValue;
						final Region3 RX10_TEMP73 = RX10_TEMP72.dReg;
						final int RX10_TEMP74 = Program.searchPointInRegion3(
								RX10_TEMP73, p);
						final int RX10_TEMP75 = 0;
						final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75;
						if (RX10_TEMP76) {
							String RX10_TEMP77 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP77);
						}
						final int RX10_TEMP78 = Program.getPlaceFromDist3(
								RX10_TEMP72, RX10_TEMP74);
						final int RX10_TEMP80 = /* here */0;
						final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80;
						if (RX10_TEMP81) {
							String RX10_TEMP79 = "Bad place access for array arg2";
							throw new RuntimeException(RX10_TEMP79);
						}
						final double RX10_TEMP82 = Program
								.getRefArrayValue3double(arg2, RX10_TEMP74);
						double d0 = RX10_TEMP82;
						double d2 = Program.Util_sumDIFF2(p, arg2);
						double d3 = Program.Util_sumDIFF3(p, arg2);
						final Dist3 RX10_TEMP83 = arg1.distValue;
						final Region3 RX10_TEMP84 = RX10_TEMP83.dReg;
						final int RX10_TEMP85 = Program.searchPointInRegion3(
								RX10_TEMP84, p);
						final int RX10_TEMP86 = 0;
						final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86;
						if (RX10_TEMP87) {
							String RX10_TEMP88 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP88);
						}
						final int RX10_TEMP89 = Program.getPlaceFromDist3(
								RX10_TEMP83, RX10_TEMP85);
						final int RX10_TEMP91 = /* here */0;
						final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91;
						if (RX10_TEMP92) {
							String RX10_TEMP90 = "Bad place access for array arg1";
							throw new RuntimeException(RX10_TEMP90);
						}
						final double RX10_TEMP93 = Program
								.getRefArrayValue3double(arg1, RX10_TEMP85);
						final double X10_TEMP72 = RX10_TEMP93;
						final double X10_TEMP73 = _MGOP_Ac0 * d0;
						final double X10_TEMP74 = X10_TEMP72 - X10_TEMP73;
						final double X10_TEMP75 = _MGOP_Ac2 * d2;
						final double X10_TEMP76 = X10_TEMP74 - X10_TEMP75;
						final double X10_TEMP77 = _MGOP_Ac3 * d3;
						final double X10_TEMP80 = X10_TEMP76 - X10_TEMP77;
						final double X10_TEMP81 = X10_TEMP80;
						final Dist3 RX10_TEMP94 = res.distValue;
						final Region3 RX10_TEMP95 = RX10_TEMP94.dReg;
						final int RX10_TEMP96 = Program.searchPointInRegion3(
								RX10_TEMP95, p);
						final int RX10_TEMP97 = 0;
						final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;
						if (RX10_TEMP98) {
							String RX10_TEMP99 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP99);
						}
						final int RX10_TEMP100 = Program.getPlaceFromDist3(
								RX10_TEMP94, RX10_TEMP96);
						final int RX10_TEMP102 = /* here */0;
						final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;
						if (RX10_TEMP103) {
							String RX10_TEMP101 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP101);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP96,
								X10_TEMP81);
					}
				}
			}
		}
	}

	public static void MGOP_ComputeResidual_Overlapped(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg1,
			final LevelData a_arg2) { /* finish */
		{
			final int X10_TEMP2 = /* here */0; /* async ( X10_TEMP2 ) */
			{
				final Dist1 X10_TEMP4 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP1 = X10_TEMP4.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP5 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP5.f0;
					final Region1 RX10_TEMP6 = X10_TEMP4.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP5);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP4, RX10_TEMP7);
					final int X10_TEMP6 = RX10_TEMP11; /* async ( X10_TEMP6 ) */
					{
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final doubleRefArray3 arg1 = Program
								.LevelData_getArray(a_arg1, i);
						final doubleRefArray3 arg2 = Program
								.LevelData_getArray(a_arg2, i);
						Region3 R = Program.LevelData_getINNERRegion(a_res, i);
						final int RX10_TEMP15 = 1;
						int RX10_TEMP13 = R.regSize;
						RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
						final int SX10_TEMP2 = 1;
						final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
						for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
							final int RX10_TEMP12 = SX10_TEMP3;
							final int RX10_TEMP16 = RX10_TEMP12;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP16);
							final Dist3 RX10_TEMP17 = arg2.distValue;
							final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
							final int RX10_TEMP19 = Program
									.searchPointInRegion3(RX10_TEMP18, p);
							final int RX10_TEMP20 = 0;
							final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
							if (RX10_TEMP21) {
								String RX10_TEMP22 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP22);
							}
							final int RX10_TEMP23 = Program.getPlaceFromDist3(
									RX10_TEMP17, RX10_TEMP19);
							final int RX10_TEMP25 = /* here */0;
							final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
							if (RX10_TEMP26) {
								String RX10_TEMP24 = "Bad place access for array arg2";
								throw new RuntimeException(RX10_TEMP24);
							}
							final double RX10_TEMP27 = Program
									.getRefArrayValue3double(arg2, RX10_TEMP19);
							double d0 = RX10_TEMP27;
							double d2 = Program.Util_sumDIFF2(p, arg2);
							double d3 = Program.Util_sumDIFF3(p, arg2);
							final Dist3 RX10_TEMP28 = arg1.distValue;
							final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
							final int RX10_TEMP30 = Program
									.searchPointInRegion3(RX10_TEMP29, p);
							final int RX10_TEMP31 = 0;
							final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
							if (RX10_TEMP32) {
								String RX10_TEMP33 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP33);
							}
							final int RX10_TEMP34 = Program.getPlaceFromDist3(
									RX10_TEMP28, RX10_TEMP30);
							final int RX10_TEMP36 = /* here */0;
							final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
							if (RX10_TEMP37) {
								String RX10_TEMP35 = "Bad place access for array arg1";
								throw new RuntimeException(RX10_TEMP35);
							}
							final double RX10_TEMP38 = Program
									.getRefArrayValue3double(arg1, RX10_TEMP30);
							final double X10_TEMP26 = RX10_TEMP38;
							final double X10_TEMP27 = _MGOP_Ac0 * d0;
							final double X10_TEMP28 = X10_TEMP26 - X10_TEMP27;
							final double X10_TEMP29 = _MGOP_Ac2 * d2;
							final double X10_TEMP30 = X10_TEMP28 - X10_TEMP29;
							final double X10_TEMP31 = _MGOP_Ac3 * d3;
							final double X10_TEMP34 = X10_TEMP30 - X10_TEMP31;
							final double X10_TEMP35 = X10_TEMP34;
							final Dist3 RX10_TEMP39 = res.distValue;
							final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
							final int RX10_TEMP41 = Program
									.searchPointInRegion3(RX10_TEMP40, p);
							final int RX10_TEMP42 = 0;
							final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
							if (RX10_TEMP43) {
								String RX10_TEMP44 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP44);
							}
							final int RX10_TEMP45 = Program.getPlaceFromDist3(
									RX10_TEMP39, RX10_TEMP41);
							final int RX10_TEMP47 = /* here */0;
							final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
							if (RX10_TEMP48) {
								String RX10_TEMP46 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP46);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP41,
									X10_TEMP35);
						}
					}
				} /* finish */
				{
					Program.LevelData_exchange(a_arg2);
				}
				final Dist1 X10_TEMP37 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP50 = X10_TEMP37.dReg;
				final int RX10_TEMP53 = 1;
				int RX10_TEMP51 = RX10_TEMP50.regSize;
				RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53;
				final int SX10_TEMP4 = 1;
				final int RX10_TEMP52 = RX10_TEMP51 + SX10_TEMP4;
				for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP52; SX10_TEMP5++) {
					final int RX10_TEMP49 = SX10_TEMP5;
					final int RX10_TEMP54 = RX10_TEMP49;
					final Point1 X10_TEMP38 = Program.regionOrdinalPoint1(
							RX10_TEMP50, RX10_TEMP54);
					final int i = X10_TEMP38.f0;
					final Region1 RX10_TEMP55 = X10_TEMP37.dReg;
					final int RX10_TEMP56 = Program.searchPointInRegion1(
							RX10_TEMP55, X10_TEMP38);
					final int RX10_TEMP57 = 0;
					final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
					if (RX10_TEMP58) {
						final String RX10_TEMP59 = "Point X10_TEMP38 not found in the distribution X10_TEMP37.";
						throw new RuntimeException(RX10_TEMP59);
					}
					final int RX10_TEMP60 = Program.getPlaceFromDist1(
							X10_TEMP37, RX10_TEMP56);
					final int X10_TEMP39 = RX10_TEMP60; /* async ( X10_TEMP39 ) */
					{
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final doubleRefArray3 arg1 = Program
								.LevelData_getArray(a_arg1, i);
						final doubleRefArray3 arg2 = Program
								.LevelData_getArray(a_arg2, i);
						final Region3 X10_TEMP48 = Program
								.LevelData_getInnerRegion(a_res, i);
						final Region3 X10_TEMP49 = Program
								.LevelData_getINNERRegion(a_res, i);
						final int X10_TEMP50 = 0;
						final int X10_TEMP51 = 1;
						final int X10_TEMP52 = X10_TEMP50 - X10_TEMP51;
						final int X10_TEMP53 = /* here */0;
						Region3 X10_TEMP54 = Program.createNewRegion3RRR(
								X10_TEMP50, X10_TEMP52, X10_TEMP50, X10_TEMP52,
								X10_TEMP50, X10_TEMP52);
						final int RX10_TEMP64 = 1;
						int RX10_TEMP62 = X10_TEMP48.regSize;
						RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64;
						final int SX10_TEMP6 = 1;
						final int RX10_TEMP63 = RX10_TEMP62 + SX10_TEMP6;
						for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP63; SX10_TEMP7++) {
							final int RX10_TEMP61 = SX10_TEMP7;
							final int RX10_TEMP65 = RX10_TEMP61;
							final Point3 X10_TEMP55 = Program
									.regionOrdinalPoint3(X10_TEMP48,
											RX10_TEMP65);
							final int X10_TEMP56 = X10_TEMP55.f0;
							final int X10_TEMP57 = X10_TEMP55.f1;
							final int X10_TEMP58 = X10_TEMP55.f2;
							final boolean RX10_TEMP66 = Program
									.regionContainsPoint3(X10_TEMP49,
											X10_TEMP55);
							boolean X10_TEMP59 = RX10_TEMP66;
							X10_TEMP59 = !X10_TEMP59;
							if (X10_TEMP59) {
								final Region3 X10_TEMP60 = Program
										.createNewRegion3RRR(X10_TEMP56,
												X10_TEMP56, X10_TEMP57,
												X10_TEMP57, X10_TEMP58,
												X10_TEMP58);
								X10_TEMP54 = Program.unionRegion3(X10_TEMP54,
										X10_TEMP60);
							}
						}
						final Region3 X10_TEMP61 = X10_TEMP54;
						Region3 R = X10_TEMP61;
						final int RX10_TEMP70 = 1;
						int RX10_TEMP68 = R.regSize;
						RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70;
						final int SX10_TEMP8 = 1;
						final int RX10_TEMP69 = RX10_TEMP68 + SX10_TEMP8;
						for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP69; SX10_TEMP9++) {
							final int RX10_TEMP67 = SX10_TEMP9;
							final int RX10_TEMP71 = RX10_TEMP67;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP71);
							final Dist3 RX10_TEMP72 = arg2.distValue;
							final Region3 RX10_TEMP73 = RX10_TEMP72.dReg;
							final int RX10_TEMP74 = Program
									.searchPointInRegion3(RX10_TEMP73, p);
							final int RX10_TEMP75 = 0;
							final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75;
							if (RX10_TEMP76) {
								String RX10_TEMP77 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP77);
							}
							final int RX10_TEMP78 = Program.getPlaceFromDist3(
									RX10_TEMP72, RX10_TEMP74);
							final int RX10_TEMP80 = /* here */0;
							final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80;
							if (RX10_TEMP81) {
								String RX10_TEMP79 = "Bad place access for array arg2";
								throw new RuntimeException(RX10_TEMP79);
							}
							final double RX10_TEMP82 = Program
									.getRefArrayValue3double(arg2, RX10_TEMP74);
							double d0 = RX10_TEMP82;
							double d2 = Program.Util_sumDIFF2(p, arg2);
							double d3 = Program.Util_sumDIFF3(p, arg2);
							final Dist3 RX10_TEMP83 = arg1.distValue;
							final Region3 RX10_TEMP84 = RX10_TEMP83.dReg;
							final int RX10_TEMP85 = Program
									.searchPointInRegion3(RX10_TEMP84, p);
							final int RX10_TEMP86 = 0;
							final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86;
							if (RX10_TEMP87) {
								String RX10_TEMP88 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP88);
							}
							final int RX10_TEMP89 = Program.getPlaceFromDist3(
									RX10_TEMP83, RX10_TEMP85);
							final int RX10_TEMP91 = /* here */0;
							final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91;
							if (RX10_TEMP92) {
								String RX10_TEMP90 = "Bad place access for array arg1";
								throw new RuntimeException(RX10_TEMP90);
							}
							final double RX10_TEMP93 = Program
									.getRefArrayValue3double(arg1, RX10_TEMP85);
							final double X10_TEMP74 = RX10_TEMP93;
							final double X10_TEMP75 = _MGOP_Ac0 * d0;
							final double X10_TEMP76 = X10_TEMP74 - X10_TEMP75;
							final double X10_TEMP77 = _MGOP_Ac2 * d2;
							final double X10_TEMP78 = X10_TEMP76 - X10_TEMP77;
							final double X10_TEMP79 = _MGOP_Ac3 * d3;
							final double X10_TEMP82 = X10_TEMP78 - X10_TEMP79;
							final double X10_TEMP83 = X10_TEMP82;
							final Dist3 RX10_TEMP94 = res.distValue;
							final Region3 RX10_TEMP95 = RX10_TEMP94.dReg;
							final int RX10_TEMP96 = Program
									.searchPointInRegion3(RX10_TEMP95, p);
							final int RX10_TEMP97 = 0;
							final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;
							if (RX10_TEMP98) {
								String RX10_TEMP99 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP99);
							}
							final int RX10_TEMP100 = Program.getPlaceFromDist3(
									RX10_TEMP94, RX10_TEMP96);
							final int RX10_TEMP102 = /* here */0;
							final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;
							if (RX10_TEMP103) {
								String RX10_TEMP101 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP101);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP96,
									X10_TEMP83);
						}
					}
				}
			}
		}
	}

	public static void MGOP_smooth(final MGOP X10_TEMP0, final LevelData a_res,
			final LevelData a_arg, final boolean a_isBottom) {
		if (_MGOP_OVERLAPPED) {
			Program.MGOP_Smooth_Overlapped(X10_TEMP0, a_res, a_arg, a_isBottom);
		} else {
			Program.MGOP_Smooth(X10_TEMP0, a_res, a_arg, a_isBottom);
		}
	}

	public static void MGOP_Smooth(final MGOP X10_TEMP0, final LevelData a_res,
			final LevelData a_arg, final boolean a_isBottom) {
		final boolean X10_TEMP1 = X10_TEMP0.EXCHANGE_After;
		final boolean X10_TEMP3 = !X10_TEMP1;
		if (X10_TEMP3) { /* finish */
			{
				Program.LevelData_exchange(a_arg);
			}
		} /* finish */
		{
			final Dist1 X10_TEMP5 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP5.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP6 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP6.f0;
				final Region1 RX10_TEMP6 = X10_TEMP5.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP6);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP5,
						RX10_TEMP7);
				final int X10_TEMP7 = RX10_TEMP11; /* async ( X10_TEMP7 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					Region3 R = Program.LevelData_getInnerRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final Dist3 RX10_TEMP17 = arg.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(arg, RX10_TEMP19);
						double d0 = RX10_TEMP27;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						final Dist3 RX10_TEMP28 = res.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(res, RX10_TEMP30);
						final double X10_TEMP25 = RX10_TEMP38;
						final double X10_TEMP26 = _MGOP_Sac0 * d0;
						final double X10_TEMP27 = X10_TEMP25 + X10_TEMP26;
						final double X10_TEMP28 = _MGOP_Sac1 * d1;
						final double X10_TEMP29 = X10_TEMP27 + X10_TEMP28;
						final double X10_TEMP30 = _MGOP_Sac2 * d2;
						final double X10_TEMP33 = X10_TEMP29 + X10_TEMP30;
						final double X10_TEMP34 = X10_TEMP33;
						final Dist3 RX10_TEMP39 = res.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP41,
								X10_TEMP34);
					}
				}
			}
		}
		final boolean X10_TEMP36 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP36) { /* finish */
			{
				Program.LevelData_exchange(a_res);
			}
		}
	}

	public static void MGOP_Smooth_Overlapped1(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg,
			final boolean a_isBottom) { /* finish */
		{
			Program.LevelData_exchange(a_arg);
			final Dist1 X10_TEMP2 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					Region3 R = Program.LevelData_getINNERRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final Dist3 RX10_TEMP17 = arg.distValue;
						final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
						final int RX10_TEMP19 = Program.searchPointInRegion3(
								RX10_TEMP18, p);
						final int RX10_TEMP20 = 0;
						final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
						if (RX10_TEMP21) {
							String RX10_TEMP22 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP22);
						}
						final int RX10_TEMP23 = Program.getPlaceFromDist3(
								RX10_TEMP17, RX10_TEMP19);
						final int RX10_TEMP25 = /* here */0;
						final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
						if (RX10_TEMP26) {
							String RX10_TEMP24 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP24);
						}
						final double RX10_TEMP27 = Program
								.getRefArrayValue3double(arg, RX10_TEMP19);
						double d0 = RX10_TEMP27;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						final Dist3 RX10_TEMP28 = res.distValue;
						final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
						final int RX10_TEMP30 = Program.searchPointInRegion3(
								RX10_TEMP29, p);
						final int RX10_TEMP31 = 0;
						final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP33 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP33);
						}
						final int RX10_TEMP34 = Program.getPlaceFromDist3(
								RX10_TEMP28, RX10_TEMP30);
						final int RX10_TEMP36 = /* here */0;
						final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
						if (RX10_TEMP37) {
							String RX10_TEMP35 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP35);
						}
						final double RX10_TEMP38 = Program
								.getRefArrayValue3double(res, RX10_TEMP30);
						final double X10_TEMP22 = RX10_TEMP38;
						final double X10_TEMP23 = _MGOP_Sac0 * d0;
						final double X10_TEMP24 = X10_TEMP22 + X10_TEMP23;
						final double X10_TEMP25 = _MGOP_Sac1 * d1;
						final double X10_TEMP26 = X10_TEMP24 + X10_TEMP25;
						final double X10_TEMP27 = _MGOP_Sac2 * d2;
						final double X10_TEMP30 = X10_TEMP26 + X10_TEMP27;
						final double X10_TEMP31 = X10_TEMP30;
						final Dist3 RX10_TEMP39 = res.distValue;
						final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
						final int RX10_TEMP41 = Program.searchPointInRegion3(
								RX10_TEMP40, p);
						final int RX10_TEMP42 = 0;
						final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP44 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP44);
						}
						final int RX10_TEMP45 = Program.getPlaceFromDist3(
								RX10_TEMP39, RX10_TEMP41);
						final int RX10_TEMP47 = /* here */0;
						final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
						if (RX10_TEMP48) {
							String RX10_TEMP46 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP46);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP41,
								X10_TEMP31);
					}
				}
			}
		} /* finish */
		{
			final Dist1 X10_TEMP33 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP50 = X10_TEMP33.dReg;
			final int RX10_TEMP53 = 1;
			int RX10_TEMP51 = RX10_TEMP50.regSize;
			RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53;
			final int SX10_TEMP4 = 1;
			final int RX10_TEMP52 = RX10_TEMP51 + SX10_TEMP4;
			for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP52; SX10_TEMP5++) {
				final int RX10_TEMP49 = SX10_TEMP5;
				final int RX10_TEMP54 = RX10_TEMP49;
				final Point1 X10_TEMP34 = Program.regionOrdinalPoint1(
						RX10_TEMP50, RX10_TEMP54);
				final int i = X10_TEMP34.f0;
				final Region1 RX10_TEMP55 = X10_TEMP33.dReg;
				final int RX10_TEMP56 = Program.searchPointInRegion1(
						RX10_TEMP55, X10_TEMP34);
				final int RX10_TEMP57 = 0;
				final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
				if (RX10_TEMP58) {
					final String RX10_TEMP59 = "Point X10_TEMP34 not found in the distribution X10_TEMP33.";
					throw new RuntimeException(RX10_TEMP59);
				}
				final int RX10_TEMP60 = Program.getPlaceFromDist1(X10_TEMP33,
						RX10_TEMP56);
				final int X10_TEMP35 = RX10_TEMP60; /* async ( X10_TEMP35 ) */
				{
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final Region3 X10_TEMP42 = Program
							.LevelData_getInnerRegion(a_res, i);
					final Region3 X10_TEMP43 = Program
							.LevelData_getINNERRegion(a_res, i);
					final int X10_TEMP44 = 0;
					final int X10_TEMP45 = 1;
					final int X10_TEMP46 = X10_TEMP44 - X10_TEMP45;
					final int X10_TEMP47 = /* here */0;
					Region3 X10_TEMP48 = Program.createNewRegion3RRR(
							X10_TEMP44, X10_TEMP46, X10_TEMP44, X10_TEMP46,
							X10_TEMP44, X10_TEMP46);
					final int RX10_TEMP64 = 1;
					int RX10_TEMP62 = X10_TEMP42.regSize;
					RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64;
					final int SX10_TEMP6 = 1;
					final int RX10_TEMP63 = RX10_TEMP62 + SX10_TEMP6;
					for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP63; SX10_TEMP7++) {
						final int RX10_TEMP61 = SX10_TEMP7;
						final int RX10_TEMP65 = RX10_TEMP61;
						final Point3 X10_TEMP49 = Program.regionOrdinalPoint3(
								X10_TEMP42, RX10_TEMP65);
						final int X10_TEMP50 = X10_TEMP49.f0;
						final int X10_TEMP51 = X10_TEMP49.f1;
						final int X10_TEMP52 = X10_TEMP49.f2;
						final boolean RX10_TEMP66 = Program
								.regionContainsPoint3(X10_TEMP43, X10_TEMP49);
						boolean X10_TEMP53 = RX10_TEMP66;
						X10_TEMP53 = !X10_TEMP53;
						if (X10_TEMP53) {
							final Region3 X10_TEMP54 = Program
									.createNewRegion3RRR(X10_TEMP50,
											X10_TEMP50, X10_TEMP51, X10_TEMP51,
											X10_TEMP52, X10_TEMP52);
							X10_TEMP48 = Program.unionRegion3(X10_TEMP48,
									X10_TEMP54);
						}
					}
					final Region3 X10_TEMP55 = X10_TEMP48;
					Region3 R = X10_TEMP55;
					final int RX10_TEMP70 = 1;
					int RX10_TEMP68 = R.regSize;
					RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70;
					final int SX10_TEMP8 = 1;
					final int RX10_TEMP69 = RX10_TEMP68 + SX10_TEMP8;
					for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP69; SX10_TEMP9++) {
						final int RX10_TEMP67 = SX10_TEMP9;
						final int RX10_TEMP71 = RX10_TEMP67;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP71);
						final Dist3 RX10_TEMP72 = arg.distValue;
						final Region3 RX10_TEMP73 = RX10_TEMP72.dReg;
						final int RX10_TEMP74 = Program.searchPointInRegion3(
								RX10_TEMP73, p);
						final int RX10_TEMP75 = 0;
						final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75;
						if (RX10_TEMP76) {
							String RX10_TEMP77 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP77);
						}
						final int RX10_TEMP78 = Program.getPlaceFromDist3(
								RX10_TEMP72, RX10_TEMP74);
						final int RX10_TEMP80 = /* here */0;
						final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80;
						if (RX10_TEMP81) {
							String RX10_TEMP79 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP79);
						}
						final double RX10_TEMP82 = Program
								.getRefArrayValue3double(arg, RX10_TEMP74);
						double d0 = RX10_TEMP82;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						final Dist3 RX10_TEMP83 = res.distValue;
						final Region3 RX10_TEMP84 = RX10_TEMP83.dReg;
						final int RX10_TEMP85 = Program.searchPointInRegion3(
								RX10_TEMP84, p);
						final int RX10_TEMP86 = 0;
						final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86;
						if (RX10_TEMP87) {
							String RX10_TEMP88 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP88);
						}
						final int RX10_TEMP89 = Program.getPlaceFromDist3(
								RX10_TEMP83, RX10_TEMP85);
						final int RX10_TEMP91 = /* here */0;
						final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91;
						if (RX10_TEMP92) {
							String RX10_TEMP90 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP90);
						}
						final double RX10_TEMP93 = Program
								.getRefArrayValue3double(res, RX10_TEMP85);
						final double X10_TEMP68 = RX10_TEMP93;
						final double X10_TEMP69 = _MGOP_Sac0 * d0;
						final double X10_TEMP70 = X10_TEMP68 + X10_TEMP69;
						final double X10_TEMP71 = _MGOP_Sac1 * d1;
						final double X10_TEMP72 = X10_TEMP70 + X10_TEMP71;
						final double X10_TEMP73 = _MGOP_Sac2 * d2;
						final double X10_TEMP76 = X10_TEMP72 + X10_TEMP73;
						final double X10_TEMP77 = X10_TEMP76;
						final Dist3 RX10_TEMP94 = res.distValue;
						final Region3 RX10_TEMP95 = RX10_TEMP94.dReg;
						final int RX10_TEMP96 = Program.searchPointInRegion3(
								RX10_TEMP95, p);
						final int RX10_TEMP97 = 0;
						final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;
						if (RX10_TEMP98) {
							String RX10_TEMP99 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP99);
						}
						final int RX10_TEMP100 = Program.getPlaceFromDist3(
								RX10_TEMP94, RX10_TEMP96);
						final int RX10_TEMP102 = /* here */0;
						final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;
						if (RX10_TEMP103) {
							String RX10_TEMP101 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP101);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP96,
								X10_TEMP77);
					}
				}
			}
		}
	}

	public static void MGOP_Smooth_Overlapped(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg,
			final boolean a_isBottom) { /* finish */
		{
			final int X10_TEMP2 = /* here */0; /* async ( X10_TEMP2 ) */
			{
				final Dist1 X10_TEMP4 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP1 = X10_TEMP4.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP5 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP5.f0;
					final Region1 RX10_TEMP6 = X10_TEMP4.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP5);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP4, RX10_TEMP7);
					final int X10_TEMP6 = RX10_TEMP11; /* async ( X10_TEMP6 ) */
					{
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						Region3 R = Program.LevelData_getINNERRegion(a_res, i);
						final int RX10_TEMP15 = 1;
						int RX10_TEMP13 = R.regSize;
						RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
						final int SX10_TEMP2 = 1;
						final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
						for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
							final int RX10_TEMP12 = SX10_TEMP3;
							final int RX10_TEMP16 = RX10_TEMP12;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP16);
							final Dist3 RX10_TEMP17 = arg.distValue;
							final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
							final int RX10_TEMP19 = Program
									.searchPointInRegion3(RX10_TEMP18, p);
							final int RX10_TEMP20 = 0;
							final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
							if (RX10_TEMP21) {
								String RX10_TEMP22 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP22);
							}
							final int RX10_TEMP23 = Program.getPlaceFromDist3(
									RX10_TEMP17, RX10_TEMP19);
							final int RX10_TEMP25 = /* here */0;
							final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
							if (RX10_TEMP26) {
								String RX10_TEMP24 = "Bad place access for array arg";
								throw new RuntimeException(RX10_TEMP24);
							}
							final double RX10_TEMP27 = Program
									.getRefArrayValue3double(arg, RX10_TEMP19);
							double d0 = RX10_TEMP27;
							double d1 = Program.Util_sumDIFF1(p, arg);
							double d2 = Program.Util_sumDIFF2(p, arg);
							final Dist3 RX10_TEMP28 = res.distValue;
							final Region3 RX10_TEMP29 = RX10_TEMP28.dReg;
							final int RX10_TEMP30 = Program
									.searchPointInRegion3(RX10_TEMP29, p);
							final int RX10_TEMP31 = 0;
							final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31;
							if (RX10_TEMP32) {
								String RX10_TEMP33 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP33);
							}
							final int RX10_TEMP34 = Program.getPlaceFromDist3(
									RX10_TEMP28, RX10_TEMP30);
							final int RX10_TEMP36 = /* here */0;
							final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36;
							if (RX10_TEMP37) {
								String RX10_TEMP35 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP35);
							}
							final double RX10_TEMP38 = Program
									.getRefArrayValue3double(res, RX10_TEMP30);
							final double X10_TEMP24 = RX10_TEMP38;
							final double X10_TEMP25 = _MGOP_Sac0 * d0;
							final double X10_TEMP26 = X10_TEMP24 + X10_TEMP25;
							final double X10_TEMP27 = _MGOP_Sac1 * d1;
							final double X10_TEMP28 = X10_TEMP26 + X10_TEMP27;
							final double X10_TEMP29 = _MGOP_Sac2 * d2;
							final double X10_TEMP32 = X10_TEMP28 + X10_TEMP29;
							final double X10_TEMP33 = X10_TEMP32;
							final Dist3 RX10_TEMP39 = res.distValue;
							final Region3 RX10_TEMP40 = RX10_TEMP39.dReg;
							final int RX10_TEMP41 = Program
									.searchPointInRegion3(RX10_TEMP40, p);
							final int RX10_TEMP42 = 0;
							final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42;
							if (RX10_TEMP43) {
								String RX10_TEMP44 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP44);
							}
							final int RX10_TEMP45 = Program.getPlaceFromDist3(
									RX10_TEMP39, RX10_TEMP41);
							final int RX10_TEMP47 = /* here */0;
							final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47;
							if (RX10_TEMP48) {
								String RX10_TEMP46 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP46);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP41,
									X10_TEMP33);
						}
					}
				} /* finish */
				{
					Program.LevelData_exchange(a_arg);
				}
				final Dist1 X10_TEMP35 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP50 = X10_TEMP35.dReg;
				final int RX10_TEMP53 = 1;
				int RX10_TEMP51 = RX10_TEMP50.regSize;
				RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53;
				final int SX10_TEMP4 = 1;
				final int RX10_TEMP52 = RX10_TEMP51 + SX10_TEMP4;
				for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP52; SX10_TEMP5++) {
					final int RX10_TEMP49 = SX10_TEMP5;
					final int RX10_TEMP54 = RX10_TEMP49;
					final Point1 X10_TEMP36 = Program.regionOrdinalPoint1(
							RX10_TEMP50, RX10_TEMP54);
					final int i = X10_TEMP36.f0;
					final Region1 RX10_TEMP55 = X10_TEMP35.dReg;
					final int RX10_TEMP56 = Program.searchPointInRegion1(
							RX10_TEMP55, X10_TEMP36);
					final int RX10_TEMP57 = 0;
					final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57;
					if (RX10_TEMP58) {
						final String RX10_TEMP59 = "Point X10_TEMP36 not found in the distribution X10_TEMP35.";
						throw new RuntimeException(RX10_TEMP59);
					}
					final int RX10_TEMP60 = Program.getPlaceFromDist1(
							X10_TEMP35, RX10_TEMP56);
					final int X10_TEMP37 = RX10_TEMP60; /* async ( X10_TEMP37 ) */
					{
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						final Region3 X10_TEMP44 = Program
								.LevelData_getInnerRegion(a_res, i);
						final Region3 X10_TEMP45 = Program
								.LevelData_getINNERRegion(a_res, i);
						final int X10_TEMP46 = 0;
						final int X10_TEMP47 = 1;
						final int X10_TEMP48 = X10_TEMP46 - X10_TEMP47;
						final int X10_TEMP49 = /* here */0;
						Region3 X10_TEMP50 = Program.createNewRegion3RRR(
								X10_TEMP46, X10_TEMP48, X10_TEMP46, X10_TEMP48,
								X10_TEMP46, X10_TEMP48);
						final int RX10_TEMP64 = 1;
						int RX10_TEMP62 = X10_TEMP44.regSize;
						RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64;
						final int SX10_TEMP6 = 1;
						final int RX10_TEMP63 = RX10_TEMP62 + SX10_TEMP6;
						for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP63; SX10_TEMP7++) {
							final int RX10_TEMP61 = SX10_TEMP7;
							final int RX10_TEMP65 = RX10_TEMP61;
							final Point3 X10_TEMP51 = Program
									.regionOrdinalPoint3(X10_TEMP44,
											RX10_TEMP65);
							final int X10_TEMP52 = X10_TEMP51.f0;
							final int X10_TEMP53 = X10_TEMP51.f1;
							final int X10_TEMP54 = X10_TEMP51.f2;
							final boolean RX10_TEMP66 = Program
									.regionContainsPoint3(X10_TEMP45,
											X10_TEMP51);
							boolean X10_TEMP55 = RX10_TEMP66;
							X10_TEMP55 = !X10_TEMP55;
							if (X10_TEMP55) {
								final Region3 X10_TEMP56 = Program
										.createNewRegion3RRR(X10_TEMP52,
												X10_TEMP52, X10_TEMP53,
												X10_TEMP53, X10_TEMP54,
												X10_TEMP54);
								X10_TEMP50 = Program.unionRegion3(X10_TEMP50,
										X10_TEMP56);
							}
						}
						final Region3 X10_TEMP57 = X10_TEMP50;
						Region3 R = X10_TEMP57;
						final int RX10_TEMP70 = 1;
						int RX10_TEMP68 = R.regSize;
						RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70;
						final int SX10_TEMP8 = 1;
						final int RX10_TEMP69 = RX10_TEMP68 + SX10_TEMP8;
						for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP69; SX10_TEMP9++) {
							final int RX10_TEMP67 = SX10_TEMP9;
							final int RX10_TEMP71 = RX10_TEMP67;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP71);
							final Dist3 RX10_TEMP72 = arg.distValue;
							final Region3 RX10_TEMP73 = RX10_TEMP72.dReg;
							final int RX10_TEMP74 = Program
									.searchPointInRegion3(RX10_TEMP73, p);
							final int RX10_TEMP75 = 0;
							final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75;
							if (RX10_TEMP76) {
								String RX10_TEMP77 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP77);
							}
							final int RX10_TEMP78 = Program.getPlaceFromDist3(
									RX10_TEMP72, RX10_TEMP74);
							final int RX10_TEMP80 = /* here */0;
							final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80;
							if (RX10_TEMP81) {
								String RX10_TEMP79 = "Bad place access for array arg";
								throw new RuntimeException(RX10_TEMP79);
							}
							final double RX10_TEMP82 = Program
									.getRefArrayValue3double(arg, RX10_TEMP74);
							double d0 = RX10_TEMP82;
							double d1 = Program.Util_sumDIFF1(p, arg);
							double d2 = Program.Util_sumDIFF2(p, arg);
							final Dist3 RX10_TEMP83 = res.distValue;
							final Region3 RX10_TEMP84 = RX10_TEMP83.dReg;
							final int RX10_TEMP85 = Program
									.searchPointInRegion3(RX10_TEMP84, p);
							final int RX10_TEMP86 = 0;
							final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86;
							if (RX10_TEMP87) {
								String RX10_TEMP88 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP88);
							}
							final int RX10_TEMP89 = Program.getPlaceFromDist3(
									RX10_TEMP83, RX10_TEMP85);
							final int RX10_TEMP91 = /* here */0;
							final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91;
							if (RX10_TEMP92) {
								String RX10_TEMP90 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP90);
							}
							final double RX10_TEMP93 = Program
									.getRefArrayValue3double(res, RX10_TEMP85);
							final double X10_TEMP70 = RX10_TEMP93;
							final double X10_TEMP71 = _MGOP_Sac0 * d0;
							final double X10_TEMP72 = X10_TEMP70 + X10_TEMP71;
							final double X10_TEMP73 = _MGOP_Sac1 * d1;
							final double X10_TEMP74 = X10_TEMP72 + X10_TEMP73;
							final double X10_TEMP75 = _MGOP_Sac2 * d2;
							final double X10_TEMP78 = X10_TEMP74 + X10_TEMP75;
							final double X10_TEMP79 = X10_TEMP78;
							final Dist3 RX10_TEMP94 = res.distValue;
							final Region3 RX10_TEMP95 = RX10_TEMP94.dReg;
							final int RX10_TEMP96 = Program
									.searchPointInRegion3(RX10_TEMP95, p);
							final int RX10_TEMP97 = 0;
							final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97;
							if (RX10_TEMP98) {
								String RX10_TEMP99 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP99);
							}
							final int RX10_TEMP100 = Program.getPlaceFromDist3(
									RX10_TEMP94, RX10_TEMP96);
							final int RX10_TEMP102 = /* here */0;
							final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102;
							if (RX10_TEMP103) {
								String RX10_TEMP101 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP101);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP96,
									X10_TEMP79);
						}
					}
				}
			}
		}
	}

	public static void MGOP_applyOpP3(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg, final int a_level) {
		final boolean X10_TEMP2 = a_level == _MGOP_P2SLEVEL;
		if (X10_TEMP2) {
			final LevelData X10_TEMP5 = X10_TEMP0.m_tempLD;
			Program.MGOP_applyOpP2(X10_TEMP0, X10_TEMP5, a_arg);
			final int X10_TEMP7 = 0;
			final doubleRefArray3 res = Program.LevelData_getArray(a_res,
					X10_TEMP7); /* finish */
			{
				final LevelData X10_TEMP9 = X10_TEMP0.m_tempLD;
				final Dist1 X10_TEMP11 = Program.LevelData_getPlaces(X10_TEMP9);
				final Region1 RX10_TEMP1 = X10_TEMP11.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP12 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP12.f0;
					final Region1 RX10_TEMP6 = X10_TEMP11.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP12);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP12 not found in the distribution X10_TEMP11.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP11, RX10_TEMP7);
					final int X10_TEMP13 = RX10_TEMP11; /* async ( X10_TEMP13 ) */
					{
						final LevelData X10_TEMP14 = X10_TEMP0.m_tempLD;
						doubleRefArray3 temp = Program.LevelData_getArray(
								X10_TEMP14, i);
						final LevelData X10_TEMP18 = X10_TEMP0.m_tempLD;
						final Region3 X10_TEMP20 = Program
								.LevelData_getInnerRegion(X10_TEMP18, i);
						Program.Util_arraycopy3(res, X10_TEMP20, temp);
					}
				}
			}
		} else {
			Program.MGOP_applyOpP2(X10_TEMP0, a_res, a_arg);
		}
		final boolean X10_TEMP26 = X10_TEMP0.EXCHANGE_After;
		if (X10_TEMP26) { /* finish */
			{
				Program.LevelData_exchange(a_res);
			}
		}
	}

	public static void MGOP_applyOpP2(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) {
		if (_MGOP_OVERLAPPED) {
			Program.MGOP_ApplyOpP_Overlapped(X10_TEMP0, a_res, a_arg);
		} else {
			Program.MGOP_ApplyOpP(X10_TEMP0, a_res, a_arg);
		}
	}

	public static void MGOP_ApplyOpP(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) {
		final boolean X10_TEMP1 = X10_TEMP0.EXCHANGE_After;
		final boolean X10_TEMP3 = !X10_TEMP1;
		if (X10_TEMP3) { /* finish */
			{
				Program.LevelData_exchange(a_arg);
			}
		} /* finish */
		{
			final Dist1 X10_TEMP5 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP5.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP6 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP6.f0;
				final Region1 RX10_TEMP6 = X10_TEMP5.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP6);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP5,
						RX10_TEMP7);
				final int X10_TEMP7 = RX10_TEMP11; /* async ( X10_TEMP7 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					Region3 R = Program.LevelData_getInnerRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 pp = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final int X10_TEMP15 = 2;
						int RX10_TEMP17 = pp.f0;
						RX10_TEMP17 = RX10_TEMP17 * X10_TEMP15;
						int RX10_TEMP18 = pp.f1;
						RX10_TEMP18 = RX10_TEMP18 * X10_TEMP15;
						int RX10_TEMP19 = pp.f2;
						RX10_TEMP19 = RX10_TEMP19 * X10_TEMP15;
						final Point3 X10_TEMP19 = new Point3(RX10_TEMP17,
								RX10_TEMP18, RX10_TEMP19);
						int X10_TEMP20 = 1;
						int X10_TEMP21 = 1;
						int X10_TEMP22 = 1;
						int RX10_TEMP20 = X10_TEMP19.f0;
						int RX10_TEMP21 = X10_TEMP19.f1;
						int RX10_TEMP22 = X10_TEMP19.f2;
						RX10_TEMP20 = RX10_TEMP20 + X10_TEMP20;
						RX10_TEMP21 = RX10_TEMP21 + X10_TEMP21;
						RX10_TEMP22 = RX10_TEMP22 + X10_TEMP22;
						Point3 p = new Point3(RX10_TEMP20, RX10_TEMP21,
								RX10_TEMP22);
						final Dist3 RX10_TEMP23 = arg.distValue;
						final Region3 RX10_TEMP24 = RX10_TEMP23.dReg;
						final int RX10_TEMP25 = Program.searchPointInRegion3(
								RX10_TEMP24, p);
						final int RX10_TEMP26 = 0;
						final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;
						if (RX10_TEMP27) {
							String RX10_TEMP28 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP28);
						}
						final int RX10_TEMP29 = Program.getPlaceFromDist3(
								RX10_TEMP23, RX10_TEMP25);
						final int RX10_TEMP31 = /* here */0;
						final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP30 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP30);
						}
						final double RX10_TEMP33 = Program
								.getRefArrayValue3double(arg, RX10_TEMP25);
						double d0 = RX10_TEMP33;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						double d3 = Program.Util_sumDIFF3(p, arg);
						final double X10_TEMP36 = _MGOP_Pc0 * d0;
						final double X10_TEMP37 = _MGOP_Pc1 * d1;
						final double X10_TEMP38 = X10_TEMP36 + X10_TEMP37;
						final double X10_TEMP39 = _MGOP_Pc2 * d2;
						final double X10_TEMP40 = X10_TEMP38 + X10_TEMP39;
						final double X10_TEMP41 = _MGOP_Pc3 * d3;
						final double X10_TEMP44 = X10_TEMP40 + X10_TEMP41;
						final double X10_TEMP45 = X10_TEMP44;
						final Dist3 RX10_TEMP34 = res.distValue;
						final Region3 RX10_TEMP35 = RX10_TEMP34.dReg;
						final int RX10_TEMP36 = Program.searchPointInRegion3(
								RX10_TEMP35, pp);
						final int RX10_TEMP37 = 0;
						final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
						if (RX10_TEMP38) {
							String RX10_TEMP39 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP39);
						}
						final int RX10_TEMP40 = Program.getPlaceFromDist3(
								RX10_TEMP34, RX10_TEMP36);
						final int RX10_TEMP42 = /* here */0;
						final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP41 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP41);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP36,
								X10_TEMP45);
					}
				}
			}
		}
	}

	public static void MGOP_ApplyOpP_Overlapped1(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) { /* finish */
		{
			Program.LevelData_exchange(a_arg);
			final Dist1 X10_TEMP2 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					Region3 R = Program.LevelData_getINNERRegion(a_res, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 pp = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						final int X10_TEMP12 = 2;
						int RX10_TEMP17 = pp.f0;
						RX10_TEMP17 = RX10_TEMP17 * X10_TEMP12;
						int RX10_TEMP18 = pp.f1;
						RX10_TEMP18 = RX10_TEMP18 * X10_TEMP12;
						int RX10_TEMP19 = pp.f2;
						RX10_TEMP19 = RX10_TEMP19 * X10_TEMP12;
						final Point3 X10_TEMP16 = new Point3(RX10_TEMP17,
								RX10_TEMP18, RX10_TEMP19);
						int X10_TEMP17 = 1;
						int X10_TEMP18 = 1;
						int X10_TEMP19 = 1;
						int RX10_TEMP20 = X10_TEMP16.f0;
						int RX10_TEMP21 = X10_TEMP16.f1;
						int RX10_TEMP22 = X10_TEMP16.f2;
						RX10_TEMP20 = RX10_TEMP20 + X10_TEMP17;
						RX10_TEMP21 = RX10_TEMP21 + X10_TEMP18;
						RX10_TEMP22 = RX10_TEMP22 + X10_TEMP19;
						Point3 p = new Point3(RX10_TEMP20, RX10_TEMP21,
								RX10_TEMP22);
						final Dist3 RX10_TEMP23 = arg.distValue;
						final Region3 RX10_TEMP24 = RX10_TEMP23.dReg;
						final int RX10_TEMP25 = Program.searchPointInRegion3(
								RX10_TEMP24, p);
						final int RX10_TEMP26 = 0;
						final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;
						if (RX10_TEMP27) {
							String RX10_TEMP28 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP28);
						}
						final int RX10_TEMP29 = Program.getPlaceFromDist3(
								RX10_TEMP23, RX10_TEMP25);
						final int RX10_TEMP31 = /* here */0;
						final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;
						if (RX10_TEMP32) {
							String RX10_TEMP30 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP30);
						}
						final double RX10_TEMP33 = Program
								.getRefArrayValue3double(arg, RX10_TEMP25);
						double d0 = RX10_TEMP33;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						double d3 = Program.Util_sumDIFF3(p, arg);
						final double X10_TEMP33 = _MGOP_Pc0 * d0;
						final double X10_TEMP34 = _MGOP_Pc1 * d1;
						final double X10_TEMP35 = X10_TEMP33 + X10_TEMP34;
						final double X10_TEMP36 = _MGOP_Pc2 * d2;
						final double X10_TEMP37 = X10_TEMP35 + X10_TEMP36;
						final double X10_TEMP38 = _MGOP_Pc3 * d3;
						final double X10_TEMP41 = X10_TEMP37 + X10_TEMP38;
						final double X10_TEMP42 = X10_TEMP41;
						final Dist3 RX10_TEMP34 = res.distValue;
						final Region3 RX10_TEMP35 = RX10_TEMP34.dReg;
						final int RX10_TEMP36 = Program.searchPointInRegion3(
								RX10_TEMP35, pp);
						final int RX10_TEMP37 = 0;
						final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
						if (RX10_TEMP38) {
							String RX10_TEMP39 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP39);
						}
						final int RX10_TEMP40 = Program.getPlaceFromDist3(
								RX10_TEMP34, RX10_TEMP36);
						final int RX10_TEMP42 = /* here */0;
						final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
						if (RX10_TEMP43) {
							String RX10_TEMP41 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP41);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP36,
								X10_TEMP42);
					}
				}
			}
		} /* finish */
		{
			final Dist1 X10_TEMP44 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP45 = X10_TEMP44.dReg;
			final int RX10_TEMP48 = 1;
			int RX10_TEMP46 = RX10_TEMP45.regSize;
			RX10_TEMP46 = RX10_TEMP46 - RX10_TEMP48;
			final int SX10_TEMP4 = 1;
			final int RX10_TEMP47 = RX10_TEMP46 + SX10_TEMP4;
			for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP47; SX10_TEMP5++) {
				final int RX10_TEMP44 = SX10_TEMP5;
				final int RX10_TEMP49 = RX10_TEMP44;
				final Point1 X10_TEMP45 = Program.regionOrdinalPoint1(
						RX10_TEMP45, RX10_TEMP49);
				final int i = X10_TEMP45.f0;
				final Region1 RX10_TEMP50 = X10_TEMP44.dReg;
				final int RX10_TEMP51 = Program.searchPointInRegion1(
						RX10_TEMP50, X10_TEMP45);
				final int RX10_TEMP52 = 0;
				final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;
				if (RX10_TEMP53) {
					final String RX10_TEMP54 = "Point X10_TEMP45 not found in the distribution X10_TEMP44.";
					throw new RuntimeException(RX10_TEMP54);
				}
				final int RX10_TEMP55 = Program.getPlaceFromDist1(X10_TEMP44,
						RX10_TEMP51);
				final int X10_TEMP46 = RX10_TEMP55; /* async ( X10_TEMP46 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final Region3 X10_TEMP53 = Program
							.LevelData_getInnerRegion(a_res, i);
					final Region3 X10_TEMP54 = Program
							.LevelData_getINNERRegion(a_res, i);
					final int X10_TEMP55 = 0;
					final int X10_TEMP56 = 1;
					final int X10_TEMP57 = X10_TEMP55 - X10_TEMP56;
					final int X10_TEMP58 = /* here */0;
					Region3 X10_TEMP59 = Program.createNewRegion3RRR(
							X10_TEMP55, X10_TEMP57, X10_TEMP55, X10_TEMP57,
							X10_TEMP55, X10_TEMP57);
					final int RX10_TEMP59 = 1;
					int RX10_TEMP57 = X10_TEMP53.regSize;
					RX10_TEMP57 = RX10_TEMP57 - RX10_TEMP59;
					final int SX10_TEMP6 = 1;
					final int RX10_TEMP58 = RX10_TEMP57 + SX10_TEMP6;
					for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP58; SX10_TEMP7++) {
						final int RX10_TEMP56 = SX10_TEMP7;
						final int RX10_TEMP60 = RX10_TEMP56;
						final Point3 X10_TEMP60 = Program.regionOrdinalPoint3(
								X10_TEMP53, RX10_TEMP60);
						final int X10_TEMP61 = X10_TEMP60.f0;
						final int X10_TEMP62 = X10_TEMP60.f1;
						final int X10_TEMP63 = X10_TEMP60.f2;
						final boolean RX10_TEMP61 = Program
								.regionContainsPoint3(X10_TEMP54, X10_TEMP60);
						boolean X10_TEMP64 = RX10_TEMP61;
						X10_TEMP64 = !X10_TEMP64;
						if (X10_TEMP64) {
							final Region3 X10_TEMP65 = Program
									.createNewRegion3RRR(X10_TEMP61,
											X10_TEMP61, X10_TEMP62, X10_TEMP62,
											X10_TEMP63, X10_TEMP63);
							X10_TEMP59 = Program.unionRegion3(X10_TEMP59,
									X10_TEMP65);
						}
					}
					final Region3 X10_TEMP66 = X10_TEMP59;
					Region3 R = X10_TEMP66;
					final int RX10_TEMP65 = 1;
					int RX10_TEMP63 = R.regSize;
					RX10_TEMP63 = RX10_TEMP63 - RX10_TEMP65;
					final int SX10_TEMP8 = 1;
					final int RX10_TEMP64 = RX10_TEMP63 + SX10_TEMP8;
					for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP64; SX10_TEMP9++) {
						final int RX10_TEMP62 = SX10_TEMP9;
						final int RX10_TEMP66 = RX10_TEMP62;
						final Point3 pp = Program.regionOrdinalPoint3(R,
								RX10_TEMP66);
						final int X10_TEMP69 = 2;
						int RX10_TEMP67 = pp.f0;
						RX10_TEMP67 = RX10_TEMP67 * X10_TEMP69;
						int RX10_TEMP68 = pp.f1;
						RX10_TEMP68 = RX10_TEMP68 * X10_TEMP69;
						int RX10_TEMP69 = pp.f2;
						RX10_TEMP69 = RX10_TEMP69 * X10_TEMP69;
						final Point3 X10_TEMP73 = new Point3(RX10_TEMP67,
								RX10_TEMP68, RX10_TEMP69);
						int X10_TEMP74 = 1;
						int X10_TEMP75 = 1;
						int X10_TEMP76 = 1;
						int RX10_TEMP70 = X10_TEMP73.f0;
						int RX10_TEMP71 = X10_TEMP73.f1;
						int RX10_TEMP72 = X10_TEMP73.f2;
						RX10_TEMP70 = RX10_TEMP70 + X10_TEMP74;
						RX10_TEMP71 = RX10_TEMP71 + X10_TEMP75;
						RX10_TEMP72 = RX10_TEMP72 + X10_TEMP76;
						Point3 p = new Point3(RX10_TEMP70, RX10_TEMP71,
								RX10_TEMP72);
						final Dist3 RX10_TEMP73 = arg.distValue;
						final Region3 RX10_TEMP74 = RX10_TEMP73.dReg;
						final int RX10_TEMP75 = Program.searchPointInRegion3(
								RX10_TEMP74, p);
						final int RX10_TEMP76 = 0;
						final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
						if (RX10_TEMP77) {
							String RX10_TEMP78 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP78);
						}
						final int RX10_TEMP79 = Program.getPlaceFromDist3(
								RX10_TEMP73, RX10_TEMP75);
						final int RX10_TEMP81 = /* here */0;
						final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
						if (RX10_TEMP82) {
							String RX10_TEMP80 = "Bad place access for array arg";
							throw new RuntimeException(RX10_TEMP80);
						}
						final double RX10_TEMP83 = Program
								.getRefArrayValue3double(arg, RX10_TEMP75);
						double d0 = RX10_TEMP83;
						double d1 = Program.Util_sumDIFF1(p, arg);
						double d2 = Program.Util_sumDIFF2(p, arg);
						double d3 = Program.Util_sumDIFF3(p, arg);
						final double X10_TEMP90 = _MGOP_Pc0 * d0;
						final double X10_TEMP91 = _MGOP_Pc1 * d1;
						final double X10_TEMP92 = X10_TEMP90 + X10_TEMP91;
						final double X10_TEMP93 = _MGOP_Pc2 * d2;
						final double X10_TEMP94 = X10_TEMP92 + X10_TEMP93;
						final double X10_TEMP95 = _MGOP_Pc3 * d3;
						final double X10_TEMP98 = X10_TEMP94 + X10_TEMP95;
						final double X10_TEMP99 = X10_TEMP98;
						final Dist3 RX10_TEMP84 = res.distValue;
						final Region3 RX10_TEMP85 = RX10_TEMP84.dReg;
						final int RX10_TEMP86 = Program.searchPointInRegion3(
								RX10_TEMP85, pp);
						final int RX10_TEMP87 = 0;
						final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87;
						if (RX10_TEMP88) {
							String RX10_TEMP89 = "Array index out of bounds";
							throw new RuntimeException(RX10_TEMP89);
						}
						final int RX10_TEMP90 = Program.getPlaceFromDist3(
								RX10_TEMP84, RX10_TEMP86);
						final int RX10_TEMP92 = /* here */0;
						final boolean RX10_TEMP93 = RX10_TEMP90 != RX10_TEMP92;
						if (RX10_TEMP93) {
							String RX10_TEMP91 = "Bad place access for array res";
							throw new RuntimeException(RX10_TEMP91);
						}
						Program.setRefArrayValue3double(res, RX10_TEMP86,
								X10_TEMP99);
					}
				}
			}
		}
	}

	public static void MGOP_ApplyOpP_Overlapped(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) { /* finish */
		{
			final int X10_TEMP2 = /* here */0; /* async ( X10_TEMP2 ) */
			{
				final Dist1 X10_TEMP4 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP1 = X10_TEMP4.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP5 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP5.f0;
					final Region1 RX10_TEMP6 = X10_TEMP4.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP5);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP4, RX10_TEMP7);
					final int X10_TEMP6 = RX10_TEMP11; /* async ( X10_TEMP6 ) */
					{
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						Region3 R = Program.LevelData_getINNERRegion(a_res, i);
						final int RX10_TEMP15 = 1;
						int RX10_TEMP13 = R.regSize;
						RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
						final int SX10_TEMP2 = 1;
						final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
						for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
							final int RX10_TEMP12 = SX10_TEMP3;
							final int RX10_TEMP16 = RX10_TEMP12;
							final Point3 pp = Program.regionOrdinalPoint3(R,
									RX10_TEMP16);
							final int X10_TEMP14 = 2;
							int RX10_TEMP17 = pp.f0;
							RX10_TEMP17 = RX10_TEMP17 * X10_TEMP14;
							int RX10_TEMP18 = pp.f1;
							RX10_TEMP18 = RX10_TEMP18 * X10_TEMP14;
							int RX10_TEMP19 = pp.f2;
							RX10_TEMP19 = RX10_TEMP19 * X10_TEMP14;
							final Point3 X10_TEMP18 = new Point3(RX10_TEMP17,
									RX10_TEMP18, RX10_TEMP19);
							int X10_TEMP19 = 1;
							int X10_TEMP20 = 1;
							int X10_TEMP21 = 1;
							int RX10_TEMP20 = X10_TEMP18.f0;
							int RX10_TEMP21 = X10_TEMP18.f1;
							int RX10_TEMP22 = X10_TEMP18.f2;
							RX10_TEMP20 = RX10_TEMP20 + X10_TEMP19;
							RX10_TEMP21 = RX10_TEMP21 + X10_TEMP20;
							RX10_TEMP22 = RX10_TEMP22 + X10_TEMP21;
							Point3 p = new Point3(RX10_TEMP20, RX10_TEMP21,
									RX10_TEMP22);
							final Dist3 RX10_TEMP23 = arg.distValue;
							final Region3 RX10_TEMP24 = RX10_TEMP23.dReg;
							final int RX10_TEMP25 = Program
									.searchPointInRegion3(RX10_TEMP24, p);
							final int RX10_TEMP26 = 0;
							final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;
							if (RX10_TEMP27) {
								String RX10_TEMP28 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP28);
							}
							final int RX10_TEMP29 = Program.getPlaceFromDist3(
									RX10_TEMP23, RX10_TEMP25);
							final int RX10_TEMP31 = /* here */0;
							final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;
							if (RX10_TEMP32) {
								String RX10_TEMP30 = "Bad place access for array arg";
								throw new RuntimeException(RX10_TEMP30);
							}
							final double RX10_TEMP33 = Program
									.getRefArrayValue3double(arg, RX10_TEMP25);
							double d0 = RX10_TEMP33;
							double d1 = Program.Util_sumDIFF1(p, arg);
							double d2 = Program.Util_sumDIFF2(p, arg);
							double d3 = Program.Util_sumDIFF3(p, arg);
							final double X10_TEMP35 = _MGOP_Pc0 * d0;
							final double X10_TEMP36 = _MGOP_Pc1 * d1;
							final double X10_TEMP37 = X10_TEMP35 + X10_TEMP36;
							final double X10_TEMP38 = _MGOP_Pc2 * d2;
							final double X10_TEMP39 = X10_TEMP37 + X10_TEMP38;
							final double X10_TEMP40 = _MGOP_Pc3 * d3;
							final double X10_TEMP43 = X10_TEMP39 + X10_TEMP40;
							final double X10_TEMP44 = X10_TEMP43;
							final Dist3 RX10_TEMP34 = res.distValue;
							final Region3 RX10_TEMP35 = RX10_TEMP34.dReg;
							final int RX10_TEMP36 = Program
									.searchPointInRegion3(RX10_TEMP35, pp);
							final int RX10_TEMP37 = 0;
							final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37;
							if (RX10_TEMP38) {
								String RX10_TEMP39 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP39);
							}
							final int RX10_TEMP40 = Program.getPlaceFromDist3(
									RX10_TEMP34, RX10_TEMP36);
							final int RX10_TEMP42 = /* here */0;
							final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42;
							if (RX10_TEMP43) {
								String RX10_TEMP41 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP41);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP36,
									X10_TEMP44);
						}
					}
				} /* finish */
				{
					Program.LevelData_exchange(a_arg);
				}
				final Dist1 X10_TEMP46 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP45 = X10_TEMP46.dReg;
				final int RX10_TEMP48 = 1;
				int RX10_TEMP46 = RX10_TEMP45.regSize;
				RX10_TEMP46 = RX10_TEMP46 - RX10_TEMP48;
				final int SX10_TEMP4 = 1;
				final int RX10_TEMP47 = RX10_TEMP46 + SX10_TEMP4;
				for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP47; SX10_TEMP5++) {
					final int RX10_TEMP44 = SX10_TEMP5;
					final int RX10_TEMP49 = RX10_TEMP44;
					final Point1 X10_TEMP47 = Program.regionOrdinalPoint1(
							RX10_TEMP45, RX10_TEMP49);
					final int i = X10_TEMP47.f0;
					final Region1 RX10_TEMP50 = X10_TEMP46.dReg;
					final int RX10_TEMP51 = Program.searchPointInRegion1(
							RX10_TEMP50, X10_TEMP47);
					final int RX10_TEMP52 = 0;
					final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;
					if (RX10_TEMP53) {
						final String RX10_TEMP54 = "Point X10_TEMP47 not found in the distribution X10_TEMP46.";
						throw new RuntimeException(RX10_TEMP54);
					}
					final int RX10_TEMP55 = Program.getPlaceFromDist1(
							X10_TEMP46, RX10_TEMP51);
					final int X10_TEMP48 = RX10_TEMP55; /* async ( X10_TEMP48 ) */
					{
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final Region3 X10_TEMP55 = Program
								.LevelData_getInnerRegion(a_res, i);
						final Region3 X10_TEMP56 = Program
								.LevelData_getINNERRegion(a_res, i);
						final int X10_TEMP57 = 0;
						final int X10_TEMP58 = 1;
						final int X10_TEMP59 = X10_TEMP57 - X10_TEMP58;
						final int X10_TEMP60 = /* here */0;
						Region3 X10_TEMP61 = Program.createNewRegion3RRR(
								X10_TEMP57, X10_TEMP59, X10_TEMP57, X10_TEMP59,
								X10_TEMP57, X10_TEMP59);
						final int RX10_TEMP59 = 1;
						int RX10_TEMP57 = X10_TEMP55.regSize;
						RX10_TEMP57 = RX10_TEMP57 - RX10_TEMP59;
						final int SX10_TEMP6 = 1;
						final int RX10_TEMP58 = RX10_TEMP57 + SX10_TEMP6;
						for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP58; SX10_TEMP7++) {
							final int RX10_TEMP56 = SX10_TEMP7;
							final int RX10_TEMP60 = RX10_TEMP56;
							final Point3 X10_TEMP62 = Program
									.regionOrdinalPoint3(X10_TEMP55,
											RX10_TEMP60);
							final int X10_TEMP63 = X10_TEMP62.f0;
							final int X10_TEMP64 = X10_TEMP62.f1;
							final int X10_TEMP65 = X10_TEMP62.f2;
							final boolean RX10_TEMP61 = Program
									.regionContainsPoint3(X10_TEMP56,
											X10_TEMP62);
							boolean X10_TEMP66 = RX10_TEMP61;
							X10_TEMP66 = !X10_TEMP66;
							if (X10_TEMP66) {
								final Region3 X10_TEMP67 = Program
										.createNewRegion3RRR(X10_TEMP63,
												X10_TEMP63, X10_TEMP64,
												X10_TEMP64, X10_TEMP65,
												X10_TEMP65);
								X10_TEMP61 = Program.unionRegion3(X10_TEMP61,
										X10_TEMP67);
							}
						}
						final Region3 X10_TEMP68 = X10_TEMP61;
						Region3 R = X10_TEMP68;
						final int RX10_TEMP65 = 1;
						int RX10_TEMP63 = R.regSize;
						RX10_TEMP63 = RX10_TEMP63 - RX10_TEMP65;
						final int SX10_TEMP8 = 1;
						final int RX10_TEMP64 = RX10_TEMP63 + SX10_TEMP8;
						for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP64; SX10_TEMP9++) {
							final int RX10_TEMP62 = SX10_TEMP9;
							final int RX10_TEMP66 = RX10_TEMP62;
							final Point3 pp = Program.regionOrdinalPoint3(R,
									RX10_TEMP66);
							final int X10_TEMP71 = 2;
							int RX10_TEMP67 = pp.f0;
							RX10_TEMP67 = RX10_TEMP67 * X10_TEMP71;
							int RX10_TEMP68 = pp.f1;
							RX10_TEMP68 = RX10_TEMP68 * X10_TEMP71;
							int RX10_TEMP69 = pp.f2;
							RX10_TEMP69 = RX10_TEMP69 * X10_TEMP71;
							final Point3 X10_TEMP75 = new Point3(RX10_TEMP67,
									RX10_TEMP68, RX10_TEMP69);
							int X10_TEMP76 = 1;
							int X10_TEMP77 = 1;
							int X10_TEMP78 = 1;
							int RX10_TEMP70 = X10_TEMP75.f0;
							int RX10_TEMP71 = X10_TEMP75.f1;
							int RX10_TEMP72 = X10_TEMP75.f2;
							RX10_TEMP70 = RX10_TEMP70 + X10_TEMP76;
							RX10_TEMP71 = RX10_TEMP71 + X10_TEMP77;
							RX10_TEMP72 = RX10_TEMP72 + X10_TEMP78;
							Point3 p = new Point3(RX10_TEMP70, RX10_TEMP71,
									RX10_TEMP72);
							final Dist3 RX10_TEMP73 = arg.distValue;
							final Region3 RX10_TEMP74 = RX10_TEMP73.dReg;
							final int RX10_TEMP75 = Program
									.searchPointInRegion3(RX10_TEMP74, p);
							final int RX10_TEMP76 = 0;
							final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
							if (RX10_TEMP77) {
								String RX10_TEMP78 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP78);
							}
							final int RX10_TEMP79 = Program.getPlaceFromDist3(
									RX10_TEMP73, RX10_TEMP75);
							final int RX10_TEMP81 = /* here */0;
							final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
							if (RX10_TEMP82) {
								String RX10_TEMP80 = "Bad place access for array arg";
								throw new RuntimeException(RX10_TEMP80);
							}
							final double RX10_TEMP83 = Program
									.getRefArrayValue3double(arg, RX10_TEMP75);
							double d0 = RX10_TEMP83;
							double d1 = Program.Util_sumDIFF1(p, arg);
							double d2 = Program.Util_sumDIFF2(p, arg);
							double d3 = Program.Util_sumDIFF3(p, arg);
							final double X10_TEMP92 = _MGOP_Pc0 * d0;
							final double X10_TEMP93 = _MGOP_Pc1 * d1;
							final double X10_TEMP94 = X10_TEMP92 + X10_TEMP93;
							final double X10_TEMP95 = _MGOP_Pc2 * d2;
							final double X10_TEMP96 = X10_TEMP94 + X10_TEMP95;
							final double X10_TEMP97 = _MGOP_Pc3 * d3;
							final double X10_TEMP100 = X10_TEMP96 + X10_TEMP97;
							final double X10_TEMP101 = X10_TEMP100;
							final Dist3 RX10_TEMP84 = res.distValue;
							final Region3 RX10_TEMP85 = RX10_TEMP84.dReg;
							final int RX10_TEMP86 = Program
									.searchPointInRegion3(RX10_TEMP85, pp);
							final int RX10_TEMP87 = 0;
							final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87;
							if (RX10_TEMP88) {
								String RX10_TEMP89 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP89);
							}
							final int RX10_TEMP90 = Program.getPlaceFromDist3(
									RX10_TEMP84, RX10_TEMP86);
							final int RX10_TEMP92 = /* here */0;
							final boolean RX10_TEMP93 = RX10_TEMP90 != RX10_TEMP92;
							if (RX10_TEMP93) {
								String RX10_TEMP91 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP91);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP86,
									X10_TEMP101);
						}
					}
				}
			}
		}
	}

	public static void MGOP_applyOpQ3(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg, final int a_level) {
		final int X10_TEMP1 = 1;
		final int X10_TEMP2 = _MGOP_P2SLEVEL - X10_TEMP1;
		final boolean X10_TEMP4 = a_level == X10_TEMP2;
		if (X10_TEMP4) {
			final int X10_TEMP6 = 0;
			final doubleRefArray3 arg = Program.LevelData_getArray(a_arg,
					X10_TEMP6); /* finish */
			{
				final LevelData X10_TEMP8 = X10_TEMP0.m_tempLD;
				final Dist1 X10_TEMP10 = Program.LevelData_getPlaces(X10_TEMP8);
				final Region1 RX10_TEMP1 = X10_TEMP10.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP11 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP11.f0;
					final Region1 RX10_TEMP6 = X10_TEMP10.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP11);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP11 not found in the distribution X10_TEMP10.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP10, RX10_TEMP7);
					final int X10_TEMP12 = RX10_TEMP11; /* async ( X10_TEMP12 ) */
					{
						final LevelData X10_TEMP13 = X10_TEMP0.m_tempLD;
						doubleRefArray3 temp = Program.LevelData_getArray(
								X10_TEMP13, i);
						final Dist3 RX10_TEMP12 = temp.distValue;
						final Region3 RX10_TEMP13 = RX10_TEMP12.dReg;
						final Region3 X10_TEMP17 = RX10_TEMP13;
						Program.Util_arraycopy3(temp, X10_TEMP17, arg);
					}
				}
			}
			final LevelData X10_TEMP22 = X10_TEMP0.m_tempLD;
			Program.MGOP_applyOpQ2(X10_TEMP0, a_res, X10_TEMP22);
		} else {
			Program.MGOP_applyOpQ2(X10_TEMP0, a_res, a_arg);
		}
	}

	public static void MGOP_applyOpQ2(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) {
		if (_MGOP_OVERLAPPED) {
			Program.MGOP_ApplyOpQ_Overlapped(X10_TEMP0, a_res, a_arg);
		} else {
			Program.MGOP_ApplyOpQ(X10_TEMP0, a_res, a_arg);
		}
	}

	public static void MGOP_ApplyOpQ(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) {
		final boolean X10_TEMP1 = X10_TEMP0.EXCHANGE_After;
		final boolean X10_TEMP3 = !X10_TEMP1;
		if (X10_TEMP3) { /* finish */
			{
				Program.LevelData_exchange(a_arg);
			}
		} /* finish */
		{
			final Dist1 X10_TEMP5 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP5.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP6 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP6.f0;
				final Region1 RX10_TEMP6 = X10_TEMP5.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP6);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP5,
						RX10_TEMP7);
				final int X10_TEMP7 = RX10_TEMP11; /* async ( X10_TEMP7 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					Region3 R = Program.LevelData_getShrinkedRegion(a_arg, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						double d = 0;
						final int X10_TEMP16 = 2;
						int RX10_TEMP17 = p.f0;
						RX10_TEMP17 = RX10_TEMP17 * X10_TEMP16;
						int RX10_TEMP18 = p.f1;
						RX10_TEMP18 = RX10_TEMP18 * X10_TEMP16;
						int RX10_TEMP19 = p.f2;
						RX10_TEMP19 = RX10_TEMP19 * X10_TEMP16;
						final Point3 X10_TEMP20 = new Point3(RX10_TEMP17,
								RX10_TEMP18, RX10_TEMP19);
						int X10_TEMP21 = 1;
						int X10_TEMP22 = 1;
						int X10_TEMP23 = 1;
						int RX10_TEMP20 = X10_TEMP20.f0;
						int RX10_TEMP21 = X10_TEMP20.f1;
						int RX10_TEMP22 = X10_TEMP20.f2;
						RX10_TEMP20 = RX10_TEMP20 + X10_TEMP21;
						RX10_TEMP21 = RX10_TEMP21 + X10_TEMP22;
						RX10_TEMP22 = RX10_TEMP22 + X10_TEMP23;
						Point3 pp = new Point3(RX10_TEMP20, RX10_TEMP21,
								RX10_TEMP22);
						final int RX10_TEMP26 = 1;
						int RX10_TEMP24 = _Util_UNIT_CUBE.regSize;
						RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26;
						final int SX10_TEMP4 = 1;
						final int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP4;
						for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP25; SX10_TEMP5++) {
							final int RX10_TEMP23 = SX10_TEMP5;
							final int RX10_TEMP27 = RX10_TEMP23;
							final Point3 o = Program.regionOrdinalPoint3(
									_Util_UNIT_CUBE, RX10_TEMP27);
							final int i2 = o.f0;
							final int j2 = o.f1;
							final int k2 = o.f2;
							final double X10_TEMP27 = 0;
							d = X10_TEMP27;
							final Region3 RX10_TEMP28 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP29 = Program
									.searchPointInRegion3(RX10_TEMP28, o);
							final int RX10_TEMP30 = 0;
							final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;
							if (RX10_TEMP31) {
								String RX10_TEMP32 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP32);
							}
							final Region3[] RX10_TEMP33 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP30 = RX10_TEMP33[RX10_TEMP29];
							final int RX10_TEMP38 = 1;
							int RX10_TEMP36 = X10_TEMP30.regSize;
							RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38;
							final int SX10_TEMP6 = 1;
							final int RX10_TEMP37 = RX10_TEMP36 + SX10_TEMP6;
							for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP37; SX10_TEMP7++) {
								final int RX10_TEMP34 = SX10_TEMP7;
								final int RX10_TEMP39 = RX10_TEMP34;
								final Point3 RX10_TEMP35 = Program
										.regionOrdinalPoint3(X10_TEMP30,
												RX10_TEMP39);
								final int i1 = RX10_TEMP35.f0;
								final int j1 = RX10_TEMP35.f1;
								final int k1 = RX10_TEMP35.f2;
								int RX10_TEMP40 = p.f0;
								int RX10_TEMP41 = p.f1;
								int RX10_TEMP42 = p.f2;
								RX10_TEMP40 = RX10_TEMP40 + i1;
								RX10_TEMP41 = RX10_TEMP41 + j1;
								RX10_TEMP42 = RX10_TEMP42 + k1;
								final Point3 temp = new Point3(RX10_TEMP40,
										RX10_TEMP41, RX10_TEMP42);
								final Dist3 RX10_TEMP43 = arg.distValue;
								final Region3 RX10_TEMP44 = RX10_TEMP43.dReg;
								final int RX10_TEMP45 = Program
										.searchPointInRegion3(RX10_TEMP44, temp);
								final int RX10_TEMP46 = 0;
								final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
								if (RX10_TEMP47) {
									String RX10_TEMP48 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP48);
								}
								final int RX10_TEMP49 = Program
										.getPlaceFromDist3(RX10_TEMP43,
												RX10_TEMP45);
								final int RX10_TEMP51 = /* here */0;
								final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
								if (RX10_TEMP52) {
									String RX10_TEMP50 = "Bad place access for array arg";
									throw new RuntimeException(RX10_TEMP50);
								}
								final double RX10_TEMP53 = Program
										.getRefArrayValue3double(arg,
												RX10_TEMP45);
								final double X10_TEMP36 = RX10_TEMP53;
								final double X10_TEMP38 = d + X10_TEMP36;
								d = X10_TEMP38;
							}
							int RX10_TEMP54 = pp.f0;
							int RX10_TEMP55 = pp.f1;
							int RX10_TEMP56 = pp.f2;
							RX10_TEMP54 = RX10_TEMP54 + i2;
							RX10_TEMP55 = RX10_TEMP55 + j2;
							RX10_TEMP56 = RX10_TEMP56 + k2;
							final Point3 X10_TEMP43 = new Point3(RX10_TEMP54,
									RX10_TEMP55, RX10_TEMP56);
							final Region3 RX10_TEMP57 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP58 = Program
									.searchPointInRegion3(RX10_TEMP57, o);
							final int RX10_TEMP59 = 0;
							final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;
							if (RX10_TEMP60) {
								String RX10_TEMP61 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP61);
							}
							final Region3[] RX10_TEMP62 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP45 = RX10_TEMP62[RX10_TEMP58];
							final int X10_TEMP46 = X10_TEMP45.regSize;
							final double X10_TEMP49 = d / X10_TEMP46;
							final double X10_TEMP50 = X10_TEMP49;
							final Dist3 RX10_TEMP63 = res.distValue;
							final Region3 RX10_TEMP64 = RX10_TEMP63.dReg;
							final int RX10_TEMP65 = Program
									.searchPointInRegion3(RX10_TEMP64,
											X10_TEMP43);
							final int RX10_TEMP66 = 0;
							final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66;
							if (RX10_TEMP67) {
								String RX10_TEMP68 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP68);
							}
							final int RX10_TEMP69 = Program.getPlaceFromDist3(
									RX10_TEMP63, RX10_TEMP65);
							final int RX10_TEMP71 = /* here */0;
							final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71;
							if (RX10_TEMP72) {
								String RX10_TEMP70 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP70);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP65,
									X10_TEMP50);
						}
					}
				}
			}
		}
	}

	public static void MGOP_ApplyOpQ_Overlapped1(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) { /* finish */
		{
			Program.LevelData_exchange(a_arg);
			final Dist1 X10_TEMP2 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP1 = X10_TEMP2.dReg;
			final int RX10_TEMP4 = 1;
			int RX10_TEMP2 = RX10_TEMP1.regSize;
			RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
			final int SX10_TEMP0 = 1;
			final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
			for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
				final int RX10_TEMP0 = SX10_TEMP1;
				final int RX10_TEMP5 = RX10_TEMP0;
				final Point1 X10_TEMP3 = Program.regionOrdinalPoint1(
						RX10_TEMP1, RX10_TEMP5);
				final int i = X10_TEMP3.f0;
				final Region1 RX10_TEMP6 = X10_TEMP2.dReg;
				final int RX10_TEMP7 = Program.searchPointInRegion1(RX10_TEMP6,
						X10_TEMP3);
				final int RX10_TEMP8 = 0;
				final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
				if (RX10_TEMP9) {
					final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2.";
					throw new RuntimeException(RX10_TEMP10);
				}
				final int RX10_TEMP11 = Program.getPlaceFromDist1(X10_TEMP2,
						RX10_TEMP7);
				final int X10_TEMP4 = RX10_TEMP11; /* async ( X10_TEMP4 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					Region3 R = Program.LevelData_getINNERRegion(a_arg, i);
					final int RX10_TEMP15 = 1;
					int RX10_TEMP13 = R.regSize;
					RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
					final int SX10_TEMP2 = 1;
					final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
					for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
						final int RX10_TEMP12 = SX10_TEMP3;
						final int RX10_TEMP16 = RX10_TEMP12;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP16);
						double d = 0;
						final int X10_TEMP13 = 2;
						int RX10_TEMP17 = p.f0;
						RX10_TEMP17 = RX10_TEMP17 * X10_TEMP13;
						int RX10_TEMP18 = p.f1;
						RX10_TEMP18 = RX10_TEMP18 * X10_TEMP13;
						int RX10_TEMP19 = p.f2;
						RX10_TEMP19 = RX10_TEMP19 * X10_TEMP13;
						final Point3 X10_TEMP17 = new Point3(RX10_TEMP17,
								RX10_TEMP18, RX10_TEMP19);
						int X10_TEMP18 = 1;
						int X10_TEMP19 = 1;
						int X10_TEMP20 = 1;
						int RX10_TEMP20 = X10_TEMP17.f0;
						int RX10_TEMP21 = X10_TEMP17.f1;
						int RX10_TEMP22 = X10_TEMP17.f2;
						RX10_TEMP20 = RX10_TEMP20 + X10_TEMP18;
						RX10_TEMP21 = RX10_TEMP21 + X10_TEMP19;
						RX10_TEMP22 = RX10_TEMP22 + X10_TEMP20;
						Point3 pp = new Point3(RX10_TEMP20, RX10_TEMP21,
								RX10_TEMP22);
						final int RX10_TEMP26 = 1;
						int RX10_TEMP24 = _Util_UNIT_CUBE.regSize;
						RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26;
						final int SX10_TEMP4 = 1;
						final int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP4;
						for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP25; SX10_TEMP5++) {
							final int RX10_TEMP23 = SX10_TEMP5;
							final int RX10_TEMP27 = RX10_TEMP23;
							final Point3 o = Program.regionOrdinalPoint3(
									_Util_UNIT_CUBE, RX10_TEMP27);
							final int i2 = o.f0;
							final int j2 = o.f1;
							final int k2 = o.f2;
							final double X10_TEMP24 = 0;
							d = X10_TEMP24;
							final Region3 RX10_TEMP28 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP29 = Program
									.searchPointInRegion3(RX10_TEMP28, o);
							final int RX10_TEMP30 = 0;
							final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;
							if (RX10_TEMP31) {
								String RX10_TEMP32 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP32);
							}
							final Region3[] RX10_TEMP33 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP27 = RX10_TEMP33[RX10_TEMP29];
							final int RX10_TEMP38 = 1;
							int RX10_TEMP36 = X10_TEMP27.regSize;
							RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38;
							final int SX10_TEMP6 = 1;
							final int RX10_TEMP37 = RX10_TEMP36 + SX10_TEMP6;
							for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP37; SX10_TEMP7++) {
								final int RX10_TEMP34 = SX10_TEMP7;
								final int RX10_TEMP39 = RX10_TEMP34;
								final Point3 RX10_TEMP35 = Program
										.regionOrdinalPoint3(X10_TEMP27,
												RX10_TEMP39);
								final int i1 = RX10_TEMP35.f0;
								final int j1 = RX10_TEMP35.f1;
								final int k1 = RX10_TEMP35.f2;
								int RX10_TEMP40 = p.f0;
								int RX10_TEMP41 = p.f1;
								int RX10_TEMP42 = p.f2;
								RX10_TEMP40 = RX10_TEMP40 + i1;
								RX10_TEMP41 = RX10_TEMP41 + j1;
								RX10_TEMP42 = RX10_TEMP42 + k1;
								final Point3 temp = new Point3(RX10_TEMP40,
										RX10_TEMP41, RX10_TEMP42);
								final Dist3 RX10_TEMP43 = arg.distValue;
								final Region3 RX10_TEMP44 = RX10_TEMP43.dReg;
								final int RX10_TEMP45 = Program
										.searchPointInRegion3(RX10_TEMP44, temp);
								final int RX10_TEMP46 = 0;
								final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
								if (RX10_TEMP47) {
									String RX10_TEMP48 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP48);
								}
								final int RX10_TEMP49 = Program
										.getPlaceFromDist3(RX10_TEMP43,
												RX10_TEMP45);
								final int RX10_TEMP51 = /* here */0;
								final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
								if (RX10_TEMP52) {
									String RX10_TEMP50 = "Bad place access for array arg";
									throw new RuntimeException(RX10_TEMP50);
								}
								final double RX10_TEMP53 = Program
										.getRefArrayValue3double(arg,
												RX10_TEMP45);
								final double X10_TEMP33 = RX10_TEMP53;
								final double X10_TEMP35 = d + X10_TEMP33;
								d = X10_TEMP35;
							}
							int RX10_TEMP54 = pp.f0;
							int RX10_TEMP55 = pp.f1;
							int RX10_TEMP56 = pp.f2;
							RX10_TEMP54 = RX10_TEMP54 + i2;
							RX10_TEMP55 = RX10_TEMP55 + j2;
							RX10_TEMP56 = RX10_TEMP56 + k2;
							final Point3 X10_TEMP40 = new Point3(RX10_TEMP54,
									RX10_TEMP55, RX10_TEMP56);
							final Region3 RX10_TEMP57 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP58 = Program
									.searchPointInRegion3(RX10_TEMP57, o);
							final int RX10_TEMP59 = 0;
							final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;
							if (RX10_TEMP60) {
								String RX10_TEMP61 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP61);
							}
							final Region3[] RX10_TEMP62 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP42 = RX10_TEMP62[RX10_TEMP58];
							final int X10_TEMP43 = X10_TEMP42.regSize;
							final double X10_TEMP46 = d / X10_TEMP43;
							final double X10_TEMP47 = X10_TEMP46;
							final Dist3 RX10_TEMP63 = res.distValue;
							final Region3 RX10_TEMP64 = RX10_TEMP63.dReg;
							final int RX10_TEMP65 = Program
									.searchPointInRegion3(RX10_TEMP64,
											X10_TEMP40);
							final int RX10_TEMP66 = 0;
							final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66;
							if (RX10_TEMP67) {
								String RX10_TEMP68 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP68);
							}
							final int RX10_TEMP69 = Program.getPlaceFromDist3(
									RX10_TEMP63, RX10_TEMP65);
							final int RX10_TEMP71 = /* here */0;
							final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71;
							if (RX10_TEMP72) {
								String RX10_TEMP70 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP70);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP65,
									X10_TEMP47);
						}
					}
				}
			}
		} /* finish */
		{
			final Dist1 X10_TEMP49 = Program.LevelData_getPlaces(a_res);
			final Region1 RX10_TEMP74 = X10_TEMP49.dReg;
			final int RX10_TEMP77 = 1;
			int RX10_TEMP75 = RX10_TEMP74.regSize;
			RX10_TEMP75 = RX10_TEMP75 - RX10_TEMP77;
			final int SX10_TEMP8 = 1;
			final int RX10_TEMP76 = RX10_TEMP75 + SX10_TEMP8;
			for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP76; SX10_TEMP9++) {
				final int RX10_TEMP73 = SX10_TEMP9;
				final int RX10_TEMP78 = RX10_TEMP73;
				final Point1 X10_TEMP50 = Program.regionOrdinalPoint1(
						RX10_TEMP74, RX10_TEMP78);
				final int i = X10_TEMP50.f0;
				final Region1 RX10_TEMP79 = X10_TEMP49.dReg;
				final int RX10_TEMP80 = Program.searchPointInRegion1(
						RX10_TEMP79, X10_TEMP50);
				final int RX10_TEMP81 = 0;
				final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81;
				if (RX10_TEMP82) {
					final String RX10_TEMP83 = "Point X10_TEMP50 not found in the distribution X10_TEMP49.";
					throw new RuntimeException(RX10_TEMP83);
				}
				final int RX10_TEMP84 = Program.getPlaceFromDist1(X10_TEMP49,
						RX10_TEMP80);
				final int X10_TEMP51 = RX10_TEMP84; /* async ( X10_TEMP51 ) */
				{
					final doubleRefArray3 arg = Program.LevelData_getArray(
							a_arg, i);
					final doubleRefArray3 res = Program.LevelData_getArray(
							a_res, i);
					final Region3 X10_TEMP58 = Program
							.LevelData_getShrinkedRegion(a_arg, i);
					final Region3 X10_TEMP59 = Program
							.LevelData_getINNERRegion(a_arg, i);
					final int X10_TEMP60 = 0;
					final int X10_TEMP61 = 1;
					final int X10_TEMP62 = X10_TEMP60 - X10_TEMP61;
					final int X10_TEMP63 = /* here */0;
					Region3 X10_TEMP64 = Program.createNewRegion3RRR(
							X10_TEMP60, X10_TEMP62, X10_TEMP60, X10_TEMP62,
							X10_TEMP60, X10_TEMP62);
					final int RX10_TEMP88 = 1;
					int RX10_TEMP86 = X10_TEMP58.regSize;
					RX10_TEMP86 = RX10_TEMP86 - RX10_TEMP88;
					final int SX10_TEMP10 = 1;
					final int RX10_TEMP87 = RX10_TEMP86 + SX10_TEMP10;
					for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP87; SX10_TEMP11++) {
						final int RX10_TEMP85 = SX10_TEMP11;
						final int RX10_TEMP89 = RX10_TEMP85;
						final Point3 X10_TEMP65 = Program.regionOrdinalPoint3(
								X10_TEMP58, RX10_TEMP89);
						final int X10_TEMP66 = X10_TEMP65.f0;
						final int X10_TEMP67 = X10_TEMP65.f1;
						final int X10_TEMP68 = X10_TEMP65.f2;
						final boolean RX10_TEMP90 = Program
								.regionContainsPoint3(X10_TEMP59, X10_TEMP65);
						boolean X10_TEMP69 = RX10_TEMP90;
						X10_TEMP69 = !X10_TEMP69;
						if (X10_TEMP69) {
							final Region3 X10_TEMP70 = Program
									.createNewRegion3RRR(X10_TEMP66,
											X10_TEMP66, X10_TEMP67, X10_TEMP67,
											X10_TEMP68, X10_TEMP68);
							X10_TEMP64 = Program.unionRegion3(X10_TEMP64,
									X10_TEMP70);
						}
					}
					final Region3 X10_TEMP71 = X10_TEMP64;
					Region3 R = X10_TEMP71;
					final int RX10_TEMP94 = 1;
					int RX10_TEMP92 = R.regSize;
					RX10_TEMP92 = RX10_TEMP92 - RX10_TEMP94;
					final int SX10_TEMP12 = 1;
					final int RX10_TEMP93 = RX10_TEMP92 + SX10_TEMP12;
					for (int SX10_TEMP13 = 0; SX10_TEMP13 < RX10_TEMP93; SX10_TEMP13++) {
						final int RX10_TEMP91 = SX10_TEMP13;
						final int RX10_TEMP95 = RX10_TEMP91;
						final Point3 p = Program.regionOrdinalPoint3(R,
								RX10_TEMP95);
						double d = 0;
						final int X10_TEMP75 = 2;
						int RX10_TEMP96 = p.f0;
						RX10_TEMP96 = RX10_TEMP96 * X10_TEMP75;
						int RX10_TEMP97 = p.f1;
						RX10_TEMP97 = RX10_TEMP97 * X10_TEMP75;
						int RX10_TEMP98 = p.f2;
						RX10_TEMP98 = RX10_TEMP98 * X10_TEMP75;
						final Point3 X10_TEMP79 = new Point3(RX10_TEMP96,
								RX10_TEMP97, RX10_TEMP98);
						int X10_TEMP80 = 1;
						int X10_TEMP81 = 1;
						int X10_TEMP82 = 1;
						int RX10_TEMP99 = X10_TEMP79.f0;
						int RX10_TEMP100 = X10_TEMP79.f1;
						int RX10_TEMP101 = X10_TEMP79.f2;
						RX10_TEMP99 = RX10_TEMP99 + X10_TEMP80;
						RX10_TEMP100 = RX10_TEMP100 + X10_TEMP81;
						RX10_TEMP101 = RX10_TEMP101 + X10_TEMP82;
						Point3 pp = new Point3(RX10_TEMP99, RX10_TEMP100,
								RX10_TEMP101);
						final int RX10_TEMP105 = 1;
						int RX10_TEMP103 = _Util_UNIT_CUBE.regSize;
						RX10_TEMP103 = RX10_TEMP103 - RX10_TEMP105;
						final int SX10_TEMP14 = 1;
						final int RX10_TEMP104 = RX10_TEMP103 + SX10_TEMP14;
						for (int SX10_TEMP15 = 0; SX10_TEMP15 < RX10_TEMP104; SX10_TEMP15++) {
							final int RX10_TEMP102 = SX10_TEMP15;
							final int RX10_TEMP106 = RX10_TEMP102;
							final Point3 o = Program.regionOrdinalPoint3(
									_Util_UNIT_CUBE, RX10_TEMP106);
							final int i2 = o.f0;
							final int j2 = o.f1;
							final int k2 = o.f2;
							final double X10_TEMP86 = 0;
							d = X10_TEMP86;
							final Region3 RX10_TEMP107 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP108 = Program
									.searchPointInRegion3(RX10_TEMP107, o);
							final int RX10_TEMP109 = 0;
							final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109;
							if (RX10_TEMP110) {
								String RX10_TEMP111 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP111);
							}
							final Region3[] RX10_TEMP112 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP89 = RX10_TEMP112[RX10_TEMP108];
							final int RX10_TEMP117 = 1;
							int RX10_TEMP115 = X10_TEMP89.regSize;
							RX10_TEMP115 = RX10_TEMP115 - RX10_TEMP117;
							final int SX10_TEMP16 = 1;
							final int RX10_TEMP116 = RX10_TEMP115 + SX10_TEMP16;
							for (int SX10_TEMP17 = 0; SX10_TEMP17 < RX10_TEMP116; SX10_TEMP17++) {
								final int RX10_TEMP113 = SX10_TEMP17;
								final int RX10_TEMP118 = RX10_TEMP113;
								final Point3 RX10_TEMP114 = Program
										.regionOrdinalPoint3(X10_TEMP89,
												RX10_TEMP118);
								final int i1 = RX10_TEMP114.f0;
								final int j1 = RX10_TEMP114.f1;
								final int k1 = RX10_TEMP114.f2;
								int RX10_TEMP119 = p.f0;
								int RX10_TEMP120 = p.f1;
								int RX10_TEMP121 = p.f2;
								RX10_TEMP119 = RX10_TEMP119 + i1;
								RX10_TEMP120 = RX10_TEMP120 + j1;
								RX10_TEMP121 = RX10_TEMP121 + k1;
								final Point3 temp = new Point3(RX10_TEMP119,
										RX10_TEMP120, RX10_TEMP121);
								final Dist3 RX10_TEMP122 = arg.distValue;
								final Region3 RX10_TEMP123 = RX10_TEMP122.dReg;
								final int RX10_TEMP124 = Program
										.searchPointInRegion3(RX10_TEMP123,
												temp);
								final int RX10_TEMP125 = 0;
								final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125;
								if (RX10_TEMP126) {
									String RX10_TEMP127 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP127);
								}
								final int RX10_TEMP128 = Program
										.getPlaceFromDist3(RX10_TEMP122,
												RX10_TEMP124);
								final int RX10_TEMP130 = /* here */0;
								final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130;
								if (RX10_TEMP131) {
									String RX10_TEMP129 = "Bad place access for array arg";
									throw new RuntimeException(RX10_TEMP129);
								}
								final double RX10_TEMP132 = Program
										.getRefArrayValue3double(arg,
												RX10_TEMP124);
								final double X10_TEMP95 = RX10_TEMP132;
								final double X10_TEMP97 = d + X10_TEMP95;
								d = X10_TEMP97;
							}
							int RX10_TEMP133 = pp.f0;
							int RX10_TEMP134 = pp.f1;
							int RX10_TEMP135 = pp.f2;
							RX10_TEMP133 = RX10_TEMP133 + i2;
							RX10_TEMP134 = RX10_TEMP134 + j2;
							RX10_TEMP135 = RX10_TEMP135 + k2;
							final Point3 X10_TEMP102 = new Point3(RX10_TEMP133,
									RX10_TEMP134, RX10_TEMP135);
							final Region3 RX10_TEMP136 = _Util_QREGIONS.regionValue;
							final int RX10_TEMP137 = Program
									.searchPointInRegion3(RX10_TEMP136, o);
							final int RX10_TEMP138 = 0;
							final boolean RX10_TEMP139 = RX10_TEMP137 < RX10_TEMP138;
							if (RX10_TEMP139) {
								String RX10_TEMP140 = "Array access index out of bounds";
								throw new RuntimeException(RX10_TEMP140);
							}
							final Region3[] RX10_TEMP141 = _Util_QREGIONS.contents;
							final Region3 X10_TEMP104 = RX10_TEMP141[RX10_TEMP137];
							final int X10_TEMP105 = X10_TEMP104.regSize;
							final double X10_TEMP108 = d / X10_TEMP105;
							final double X10_TEMP109 = X10_TEMP108;
							final Dist3 RX10_TEMP142 = res.distValue;
							final Region3 RX10_TEMP143 = RX10_TEMP142.dReg;
							final int RX10_TEMP144 = Program
									.searchPointInRegion3(RX10_TEMP143,
											X10_TEMP102);
							final int RX10_TEMP145 = 0;
							final boolean RX10_TEMP146 = RX10_TEMP144 < RX10_TEMP145;
							if (RX10_TEMP146) {
								String RX10_TEMP147 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP147);
							}
							final int RX10_TEMP148 = Program.getPlaceFromDist3(
									RX10_TEMP142, RX10_TEMP144);
							final int RX10_TEMP150 = /* here */0;
							final boolean RX10_TEMP151 = RX10_TEMP148 != RX10_TEMP150;
							if (RX10_TEMP151) {
								String RX10_TEMP149 = "Bad place access for array res";
								throw new RuntimeException(RX10_TEMP149);
							}
							Program.setRefArrayValue3double(res, RX10_TEMP144,
									X10_TEMP109);
						}
					}
				}
			}
		}
	}

	public static void MGOP_ApplyOpQ_Overlapped(final MGOP X10_TEMP0,
			final LevelData a_res, final LevelData a_arg) { /* finish */
		{
			final int X10_TEMP2 = /* here */0; /* async ( X10_TEMP2 ) */
			{
				final Dist1 X10_TEMP4 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP1 = X10_TEMP4.dReg;
				final int RX10_TEMP4 = 1;
				int RX10_TEMP2 = RX10_TEMP1.regSize;
				RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
				final int SX10_TEMP0 = 1;
				final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
				for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
					final int RX10_TEMP0 = SX10_TEMP1;
					final int RX10_TEMP5 = RX10_TEMP0;
					final Point1 X10_TEMP5 = Program.regionOrdinalPoint1(
							RX10_TEMP1, RX10_TEMP5);
					final int i = X10_TEMP5.f0;
					final Region1 RX10_TEMP6 = X10_TEMP4.dReg;
					final int RX10_TEMP7 = Program.searchPointInRegion1(
							RX10_TEMP6, X10_TEMP5);
					final int RX10_TEMP8 = 0;
					final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
					if (RX10_TEMP9) {
						final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4.";
						throw new RuntimeException(RX10_TEMP10);
					}
					final int RX10_TEMP11 = Program.getPlaceFromDist1(
							X10_TEMP4, RX10_TEMP7);
					final int X10_TEMP6 = RX10_TEMP11; /* async ( X10_TEMP6 ) */
					{
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						Region3 R = Program.LevelData_getINNERRegion(a_arg, i);
						final int RX10_TEMP15 = 1;
						int RX10_TEMP13 = R.regSize;
						RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15;
						final int SX10_TEMP2 = 1;
						final int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP2;
						for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP14; SX10_TEMP3++) {
							final int RX10_TEMP12 = SX10_TEMP3;
							final int RX10_TEMP16 = RX10_TEMP12;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP16);
							double d = 0;
							final int X10_TEMP15 = 2;
							int RX10_TEMP17 = p.f0;
							RX10_TEMP17 = RX10_TEMP17 * X10_TEMP15;
							int RX10_TEMP18 = p.f1;
							RX10_TEMP18 = RX10_TEMP18 * X10_TEMP15;
							int RX10_TEMP19 = p.f2;
							RX10_TEMP19 = RX10_TEMP19 * X10_TEMP15;
							final Point3 X10_TEMP19 = new Point3(RX10_TEMP17,
									RX10_TEMP18, RX10_TEMP19);
							int X10_TEMP20 = 1;
							int X10_TEMP21 = 1;
							int X10_TEMP22 = 1;
							int RX10_TEMP20 = X10_TEMP19.f0;
							int RX10_TEMP21 = X10_TEMP19.f1;
							int RX10_TEMP22 = X10_TEMP19.f2;
							RX10_TEMP20 = RX10_TEMP20 + X10_TEMP20;
							RX10_TEMP21 = RX10_TEMP21 + X10_TEMP21;
							RX10_TEMP22 = RX10_TEMP22 + X10_TEMP22;
							Point3 pp = new Point3(RX10_TEMP20, RX10_TEMP21,
									RX10_TEMP22);
							final int RX10_TEMP26 = 1;
							int RX10_TEMP24 = _Util_UNIT_CUBE.regSize;
							RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26;
							final int SX10_TEMP4 = 1;
							final int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP4;
							for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP25; SX10_TEMP5++) {
								final int RX10_TEMP23 = SX10_TEMP5;
								final int RX10_TEMP27 = RX10_TEMP23;
								final Point3 o = Program.regionOrdinalPoint3(
										_Util_UNIT_CUBE, RX10_TEMP27);
								final int i2 = o.f0;
								final int j2 = o.f1;
								final int k2 = o.f2;
								final double X10_TEMP26 = 0;
								d = X10_TEMP26;
								final Region3 RX10_TEMP28 = _Util_QREGIONS.regionValue;
								final int RX10_TEMP29 = Program
										.searchPointInRegion3(RX10_TEMP28, o);
								final int RX10_TEMP30 = 0;
								final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30;
								if (RX10_TEMP31) {
									String RX10_TEMP32 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP32);
								}
								final Region3[] RX10_TEMP33 = _Util_QREGIONS.contents;
								final Region3 X10_TEMP29 = RX10_TEMP33[RX10_TEMP29];
								final int RX10_TEMP38 = 1;
								int RX10_TEMP36 = X10_TEMP29.regSize;
								RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38;
								final int SX10_TEMP6 = 1;
								final int RX10_TEMP37 = RX10_TEMP36
										+ SX10_TEMP6;
								for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP37; SX10_TEMP7++) {
									final int RX10_TEMP34 = SX10_TEMP7;
									final int RX10_TEMP39 = RX10_TEMP34;
									final Point3 RX10_TEMP35 = Program
											.regionOrdinalPoint3(X10_TEMP29,
													RX10_TEMP39);
									final int i1 = RX10_TEMP35.f0;
									final int j1 = RX10_TEMP35.f1;
									final int k1 = RX10_TEMP35.f2;
									int RX10_TEMP40 = p.f0;
									int RX10_TEMP41 = p.f1;
									int RX10_TEMP42 = p.f2;
									RX10_TEMP40 = RX10_TEMP40 + i1;
									RX10_TEMP41 = RX10_TEMP41 + j1;
									RX10_TEMP42 = RX10_TEMP42 + k1;
									final Point3 temp = new Point3(RX10_TEMP40,
											RX10_TEMP41, RX10_TEMP42);
									final Dist3 RX10_TEMP43 = arg.distValue;
									final Region3 RX10_TEMP44 = RX10_TEMP43.dReg;
									final int RX10_TEMP45 = Program
											.searchPointInRegion3(RX10_TEMP44,
													temp);
									final int RX10_TEMP46 = 0;
									final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46;
									if (RX10_TEMP47) {
										String RX10_TEMP48 = "Array access index out of bounds";
										throw new RuntimeException(RX10_TEMP48);
									}
									final int RX10_TEMP49 = Program
											.getPlaceFromDist3(RX10_TEMP43,
													RX10_TEMP45);
									final int RX10_TEMP51 = /* here */0;
									final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51;
									if (RX10_TEMP52) {
										String RX10_TEMP50 = "Bad place access for array arg";
										throw new RuntimeException(RX10_TEMP50);
									}
									final double RX10_TEMP53 = Program
											.getRefArrayValue3double(arg,
													RX10_TEMP45);
									final double X10_TEMP35 = RX10_TEMP53;
									final double X10_TEMP37 = d + X10_TEMP35;
									d = X10_TEMP37;
								}
								int RX10_TEMP54 = pp.f0;
								int RX10_TEMP55 = pp.f1;
								int RX10_TEMP56 = pp.f2;
								RX10_TEMP54 = RX10_TEMP54 + i2;
								RX10_TEMP55 = RX10_TEMP55 + j2;
								RX10_TEMP56 = RX10_TEMP56 + k2;
								final Point3 X10_TEMP42 = new Point3(
										RX10_TEMP54, RX10_TEMP55, RX10_TEMP56);
								final Region3 RX10_TEMP57 = _Util_QREGIONS.regionValue;
								final int RX10_TEMP58 = Program
										.searchPointInRegion3(RX10_TEMP57, o);
								final int RX10_TEMP59 = 0;
								final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59;
								if (RX10_TEMP60) {
									String RX10_TEMP61 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP61);
								}
								final Region3[] RX10_TEMP62 = _Util_QREGIONS.contents;
								final Region3 X10_TEMP44 = RX10_TEMP62[RX10_TEMP58];
								final int X10_TEMP45 = X10_TEMP44.regSize;
								final double X10_TEMP48 = d / X10_TEMP45;
								final double X10_TEMP49 = X10_TEMP48;
								final Dist3 RX10_TEMP63 = res.distValue;
								final Region3 RX10_TEMP64 = RX10_TEMP63.dReg;
								final int RX10_TEMP65 = Program
										.searchPointInRegion3(RX10_TEMP64,
												X10_TEMP42);
								final int RX10_TEMP66 = 0;
								final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66;
								if (RX10_TEMP67) {
									String RX10_TEMP68 = "Array index out of bounds";
									throw new RuntimeException(RX10_TEMP68);
								}
								final int RX10_TEMP69 = Program
										.getPlaceFromDist3(RX10_TEMP63,
												RX10_TEMP65);
								final int RX10_TEMP71 = /* here */0;
								final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71;
								if (RX10_TEMP72) {
									String RX10_TEMP70 = "Bad place access for array res";
									throw new RuntimeException(RX10_TEMP70);
								}
								Program.setRefArrayValue3double(res,
										RX10_TEMP65, X10_TEMP49);
							}
						}
					}
				} /* finish */
				{
					Program.LevelData_exchange(a_arg);
				}
				final Dist1 X10_TEMP51 = Program.LevelData_getPlaces(a_res);
				final Region1 RX10_TEMP74 = X10_TEMP51.dReg;
				final int RX10_TEMP77 = 1;
				int RX10_TEMP75 = RX10_TEMP74.regSize;
				RX10_TEMP75 = RX10_TEMP75 - RX10_TEMP77;
				final int SX10_TEMP8 = 1;
				final int RX10_TEMP76 = RX10_TEMP75 + SX10_TEMP8;
				for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP76; SX10_TEMP9++) {
					final int RX10_TEMP73 = SX10_TEMP9;
					final int RX10_TEMP78 = RX10_TEMP73;
					final Point1 X10_TEMP52 = Program.regionOrdinalPoint1(
							RX10_TEMP74, RX10_TEMP78);
					final int i = X10_TEMP52.f0;
					final Region1 RX10_TEMP79 = X10_TEMP51.dReg;
					final int RX10_TEMP80 = Program.searchPointInRegion1(
							RX10_TEMP79, X10_TEMP52);
					final int RX10_TEMP81 = 0;
					final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81;
					if (RX10_TEMP82) {
						final String RX10_TEMP83 = "Point X10_TEMP52 not found in the distribution X10_TEMP51.";
						throw new RuntimeException(RX10_TEMP83);
					}
					final int RX10_TEMP84 = Program.getPlaceFromDist1(
							X10_TEMP51, RX10_TEMP80);
					final int X10_TEMP53 = RX10_TEMP84; /* async ( X10_TEMP53 ) */
					{
						final doubleRefArray3 arg = Program.LevelData_getArray(
								a_arg, i);
						final doubleRefArray3 res = Program.LevelData_getArray(
								a_res, i);
						final Region3 X10_TEMP60 = Program
								.LevelData_getShrinkedRegion(a_arg, i);
						final Region3 X10_TEMP61 = Program
								.LevelData_getINNERRegion(a_arg, i);
						final int X10_TEMP62 = 0;
						final int X10_TEMP63 = 1;
						final int X10_TEMP64 = X10_TEMP62 - X10_TEMP63;
						final int X10_TEMP65 = /* here */0;
						Region3 X10_TEMP66 = Program.createNewRegion3RRR(
								X10_TEMP62, X10_TEMP64, X10_TEMP62, X10_TEMP64,
								X10_TEMP62, X10_TEMP64);
						final int RX10_TEMP88 = 1;
						int RX10_TEMP86 = X10_TEMP60.regSize;
						RX10_TEMP86 = RX10_TEMP86 - RX10_TEMP88;
						final int SX10_TEMP10 = 1;
						final int RX10_TEMP87 = RX10_TEMP86 + SX10_TEMP10;
						for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP87; SX10_TEMP11++) {
							final int RX10_TEMP85 = SX10_TEMP11;
							final int RX10_TEMP89 = RX10_TEMP85;
							final Point3 X10_TEMP67 = Program
									.regionOrdinalPoint3(X10_TEMP60,
											RX10_TEMP89);
							final int X10_TEMP68 = X10_TEMP67.f0;
							final int X10_TEMP69 = X10_TEMP67.f1;
							final int X10_TEMP70 = X10_TEMP67.f2;
							final boolean RX10_TEMP90 = Program
									.regionContainsPoint3(X10_TEMP61,
											X10_TEMP67);
							boolean X10_TEMP71 = RX10_TEMP90;
							X10_TEMP71 = !X10_TEMP71;
							if (X10_TEMP71) {
								final Region3 X10_TEMP72 = Program
										.createNewRegion3RRR(X10_TEMP68,
												X10_TEMP68, X10_TEMP69,
												X10_TEMP69, X10_TEMP70,
												X10_TEMP70);
								X10_TEMP66 = Program.unionRegion3(X10_TEMP66,
										X10_TEMP72);
							}
						}
						final Region3 X10_TEMP73 = X10_TEMP66;
						Region3 R = X10_TEMP73;
						final int RX10_TEMP94 = 1;
						int RX10_TEMP92 = R.regSize;
						RX10_TEMP92 = RX10_TEMP92 - RX10_TEMP94;
						final int SX10_TEMP12 = 1;
						final int RX10_TEMP93 = RX10_TEMP92 + SX10_TEMP12;
						for (int SX10_TEMP13 = 0; SX10_TEMP13 < RX10_TEMP93; SX10_TEMP13++) {
							final int RX10_TEMP91 = SX10_TEMP13;
							final int RX10_TEMP95 = RX10_TEMP91;
							final Point3 p = Program.regionOrdinalPoint3(R,
									RX10_TEMP95);
							double d = 0;
							final int X10_TEMP77 = 2;
							int RX10_TEMP96 = p.f0;
							RX10_TEMP96 = RX10_TEMP96 * X10_TEMP77;
							int RX10_TEMP97 = p.f1;
							RX10_TEMP97 = RX10_TEMP97 * X10_TEMP77;
							int RX10_TEMP98 = p.f2;
							RX10_TEMP98 = RX10_TEMP98 * X10_TEMP77;
							final Point3 X10_TEMP81 = new Point3(RX10_TEMP96,
									RX10_TEMP97, RX10_TEMP98);
							int X10_TEMP82 = 1;
							int X10_TEMP83 = 1;
							int X10_TEMP84 = 1;
							int RX10_TEMP99 = X10_TEMP81.f0;
							int RX10_TEMP100 = X10_TEMP81.f1;
							int RX10_TEMP101 = X10_TEMP81.f2;
							RX10_TEMP99 = RX10_TEMP99 + X10_TEMP82;
							RX10_TEMP100 = RX10_TEMP100 + X10_TEMP83;
							RX10_TEMP101 = RX10_TEMP101 + X10_TEMP84;
							Point3 pp = new Point3(RX10_TEMP99, RX10_TEMP100,
									RX10_TEMP101);
							final int RX10_TEMP105 = 1;
							int RX10_TEMP103 = _Util_UNIT_CUBE.regSize;
							RX10_TEMP103 = RX10_TEMP103 - RX10_TEMP105;
							final int SX10_TEMP14 = 1;
							final int RX10_TEMP104 = RX10_TEMP103 + SX10_TEMP14;
							for (int SX10_TEMP15 = 0; SX10_TEMP15 < RX10_TEMP104; SX10_TEMP15++) {
								final int RX10_TEMP102 = SX10_TEMP15;
								final int RX10_TEMP106 = RX10_TEMP102;
								final Point3 o = Program.regionOrdinalPoint3(
										_Util_UNIT_CUBE, RX10_TEMP106);
								final int i2 = o.f0;
								final int j2 = o.f1;
								final int k2 = o.f2;
								final double X10_TEMP88 = 0;
								d = X10_TEMP88;
								final Region3 RX10_TEMP107 = _Util_QREGIONS.regionValue;
								final int RX10_TEMP108 = Program
										.searchPointInRegion3(RX10_TEMP107, o);
								final int RX10_TEMP109 = 0;
								final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109;
								if (RX10_TEMP110) {
									String RX10_TEMP111 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP111);
								}
								final Region3[] RX10_TEMP112 = _Util_QREGIONS.contents;
								final Region3 X10_TEMP91 = RX10_TEMP112[RX10_TEMP108];
								final int RX10_TEMP117 = 1;
								int RX10_TEMP115 = X10_TEMP91.regSize;
								RX10_TEMP115 = RX10_TEMP115 - RX10_TEMP117;
								final int SX10_TEMP16 = 1;
								final int RX10_TEMP116 = RX10_TEMP115
										+ SX10_TEMP16;
								for (int SX10_TEMP17 = 0; SX10_TEMP17 < RX10_TEMP116; SX10_TEMP17++) {
									final int RX10_TEMP113 = SX10_TEMP17;
									final int RX10_TEMP118 = RX10_TEMP113;
									final Point3 RX10_TEMP114 = Program
											.regionOrdinalPoint3(X10_TEMP91,
													RX10_TEMP118);
									final int i1 = RX10_TEMP114.f0;
									final int j1 = RX10_TEMP114.f1;
									final int k1 = RX10_TEMP114.f2;
									int RX10_TEMP119 = p.f0;
									int RX10_TEMP120 = p.f1;
									int RX10_TEMP121 = p.f2;
									RX10_TEMP119 = RX10_TEMP119 + i1;
									RX10_TEMP120 = RX10_TEMP120 + j1;
									RX10_TEMP121 = RX10_TEMP121 + k1;
									final Point3 temp = new Point3(
											RX10_TEMP119, RX10_TEMP120,
											RX10_TEMP121);
									final Dist3 RX10_TEMP122 = arg.distValue;
									final Region3 RX10_TEMP123 = RX10_TEMP122.dReg;
									final int RX10_TEMP124 = Program
											.searchPointInRegion3(RX10_TEMP123,
													temp);
									final int RX10_TEMP125 = 0;
									final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125;
									if (RX10_TEMP126) {
										String RX10_TEMP127 = "Array access index out of bounds";
										throw new RuntimeException(RX10_TEMP127);
									}
									final int RX10_TEMP128 = Program
											.getPlaceFromDist3(RX10_TEMP122,
													RX10_TEMP124);
									final int RX10_TEMP130 = /* here */0;
									final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130;
									if (RX10_TEMP131) {
										String RX10_TEMP129 = "Bad place access for array arg";
										throw new RuntimeException(RX10_TEMP129);
									}
									final double RX10_TEMP132 = Program
											.getRefArrayValue3double(arg,
													RX10_TEMP124);
									final double X10_TEMP97 = RX10_TEMP132;
									final double X10_TEMP99 = d + X10_TEMP97;
									d = X10_TEMP99;
								}
								int RX10_TEMP133 = pp.f0;
								int RX10_TEMP134 = pp.f1;
								int RX10_TEMP135 = pp.f2;
								RX10_TEMP133 = RX10_TEMP133 + i2;
								RX10_TEMP134 = RX10_TEMP134 + j2;
								RX10_TEMP135 = RX10_TEMP135 + k2;
								final Point3 X10_TEMP104 = new Point3(
										RX10_TEMP133, RX10_TEMP134,
										RX10_TEMP135);
								final Region3 RX10_TEMP136 = _Util_QREGIONS.regionValue;
								final int RX10_TEMP137 = Program
										.searchPointInRegion3(RX10_TEMP136, o);
								final int RX10_TEMP138 = 0;
								final boolean RX10_TEMP139 = RX10_TEMP137 < RX10_TEMP138;
								if (RX10_TEMP139) {
									String RX10_TEMP140 = "Array access index out of bounds";
									throw new RuntimeException(RX10_TEMP140);
								}
								final Region3[] RX10_TEMP141 = _Util_QREGIONS.contents;
								final Region3 X10_TEMP106 = RX10_TEMP141[RX10_TEMP137];
								final int X10_TEMP107 = X10_TEMP106.regSize;
								final double X10_TEMP110 = d / X10_TEMP107;
								final double X10_TEMP111 = X10_TEMP110;
								final Dist3 RX10_TEMP142 = res.distValue;
								final Region3 RX10_TEMP143 = RX10_TEMP142.dReg;
								final int RX10_TEMP144 = Program
										.searchPointInRegion3(RX10_TEMP143,
												X10_TEMP104);
								final int RX10_TEMP145 = 0;
								final boolean RX10_TEMP146 = RX10_TEMP144 < RX10_TEMP145;
								if (RX10_TEMP146) {
									String RX10_TEMP147 = "Array index out of bounds";
									throw new RuntimeException(RX10_TEMP147);
								}
								final int RX10_TEMP148 = Program
										.getPlaceFromDist3(RX10_TEMP142,
												RX10_TEMP144);
								final int RX10_TEMP150 = /* here */0;
								final boolean RX10_TEMP151 = RX10_TEMP148 != RX10_TEMP150;
								if (RX10_TEMP151) {
									String RX10_TEMP149 = "Bad place access for array res";
									throw new RuntimeException(RX10_TEMP149);
								}
								Program.setRefArrayValue3double(res,
										RX10_TEMP144, X10_TEMP111);
							}
						}
					}
				}
			}
		}
	}

	public static double MGOP_MGSolve(final MGOP X10_TEMP0,
			final LevelData a_u, final LevelData a_v, final int a_its) {
		final int X10_TEMP1 = X10_TEMP0.m_levels;
		final int X10_TEMP2 = 1;
		int l = X10_TEMP1 - X10_TEMP2;
		final LevelDataRefArray1 X10_TEMP4 = X10_TEMP0.m_r;
		final Point1 RX10_TEMP0 = new Point1(l);
		final Dist1 RX10_TEMP1 = X10_TEMP4.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP4";
			throw new RuntimeException(RX10_TEMP8);
		}
		final LevelData RX10_TEMP11 = Program.getRefArrayValue1LevelData(
				X10_TEMP4, RX10_TEMP3);
		final LevelData X10_TEMP6 = RX10_TEMP11;
		Program.LevelData_setLevelData(X10_TEMP6, a_v);
		final String X10_TEMP11 = "The init residual norm is ";
		final LevelDataRefArray1 X10_TEMP8 = X10_TEMP0.m_r;
		final Point1 RX10_TEMP12 = new Point1(l);
		final Dist1 RX10_TEMP13 = X10_TEMP8.distValue;
		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14,
				RX10_TEMP12);
		final int RX10_TEMP16 = 0;
		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
		if (RX10_TEMP17) {
			String RX10_TEMP18 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP18);
		}
		final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13,
				RX10_TEMP15);
		final int RX10_TEMP21 = /* here */0;
		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
		if (RX10_TEMP22) {
			String RX10_TEMP20 = "Bad place access for array X10_TEMP8";
			throw new RuntimeException(RX10_TEMP20);
		}
		final LevelData RX10_TEMP23 = Program.getRefArrayValue1LevelData(
				X10_TEMP8, RX10_TEMP15);
		final LevelData X10_TEMP10 = RX10_TEMP23;
		final double X10_TEMP12 = Program.LevelData_norm2(X10_TEMP10);
		
		final String X10_TEMP14 = X10_TEMP11 + X10_TEMP12;
		System.out.println(X10_TEMP12+"Program.LevelData_norm2");
		System.out.println(X10_TEMP14);
		double res = 0.0;
		int i = 0;
		boolean X10_TEMP19 = i < a_its;
		while (X10_TEMP19) {
			final String X10_TEMP20 = "Iteration ";
			final String X10_TEMP22 = X10_TEMP20 + i;
			System.out.println(X10_TEMP22);
			Program.MGOP_MG(X10_TEMP0);
			final LevelDataRefArray1 X10_TEMP23 = X10_TEMP0.m_z;
			final Point1 RX10_TEMP24 = new Point1(l);
			final Dist1 RX10_TEMP25 = X10_TEMP23.distValue;
			final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
			final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26,
					RX10_TEMP24);
			final int RX10_TEMP28 = 0;
			final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
			if (RX10_TEMP29) {
				String RX10_TEMP30 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP30);
			}
			final int RX10_TEMP31 = Program.getPlaceFromDist1(RX10_TEMP25,
					RX10_TEMP27);
			final int RX10_TEMP33 = /* here */0;
			final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
			if (RX10_TEMP34) {
				String RX10_TEMP32 = "Bad place access for array X10_TEMP23";
				throw new RuntimeException(RX10_TEMP32);
			}
			final LevelData RX10_TEMP35 = Program.getRefArrayValue1LevelData(
					X10_TEMP23, RX10_TEMP27);
			final LevelData X10_TEMP26 = RX10_TEMP35;
			Program.LevelData_add(a_u, X10_TEMP26);
			final LevelDataRefArray1 X10_TEMP27 = X10_TEMP0.m_r;
			final Point1 RX10_TEMP36 = new Point1(l);
			final Dist1 RX10_TEMP37 = X10_TEMP27.distValue;
			final Region1 RX10_TEMP38 = RX10_TEMP37.dReg;
			final int RX10_TEMP39 = Program.searchPointInRegion1(RX10_TEMP38,
					RX10_TEMP36);
			final int RX10_TEMP40 = 0;
			final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40;
			if (RX10_TEMP41) {
				String RX10_TEMP42 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP42);
			}
			final int RX10_TEMP43 = Program.getPlaceFromDist1(RX10_TEMP37,
					RX10_TEMP39);
			final int RX10_TEMP45 = /* here */0;
			final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;
			if (RX10_TEMP46) {
				String RX10_TEMP44 = "Bad place access for array X10_TEMP27";
				throw new RuntimeException(RX10_TEMP44);
			}
			final LevelData RX10_TEMP47 = Program.getRefArrayValue1LevelData(
					X10_TEMP27, RX10_TEMP39);
			final LevelData X10_TEMP32 = RX10_TEMP47;
			Program.MGOP_computeResidual3(X10_TEMP0, X10_TEMP32, a_v, a_u);
			final LevelDataRefArray1 X10_TEMP33 = X10_TEMP0.m_r;
			final Point1 RX10_TEMP48 = new Point1(l);
			final Dist1 RX10_TEMP49 = X10_TEMP33.distValue;
			final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;
			final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50,
					RX10_TEMP48);
			final int RX10_TEMP52 = 0;
			final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;
			if (RX10_TEMP53) {
				String RX10_TEMP54 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP54);
			}
			final int RX10_TEMP55 = Program.getPlaceFromDist1(RX10_TEMP49,
					RX10_TEMP51);
			final int RX10_TEMP57 = /* here */0;
			final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;
			if (RX10_TEMP58) {
				String RX10_TEMP56 = "Bad place access for array X10_TEMP33";
				throw new RuntimeException(RX10_TEMP56);
			}
			final LevelData RX10_TEMP59 = Program.getRefArrayValue1LevelData(
					X10_TEMP33, RX10_TEMP51);
			final LevelData X10_TEMP35 = RX10_TEMP59;
			final double X10_TEMP37 = Program.LevelData_norm2(X10_TEMP35);
			res = X10_TEMP37;
			final String X10_TEMP38 = "The residual norm is ";
			final String X10_TEMP40 = X10_TEMP38 + res;
			System.out.println(X10_TEMP40);
			final int X10_TEMP41 = i;
			final int X10_TEMP42 = 1;
			i = i + X10_TEMP42;
			X10_TEMP19 = i < a_its;
		}
		return res;
	}

	public static void MGOP_MG(final MGOP X10_TEMP0) {
		final int X10_TEMP1 = X10_TEMP0.m_levels;
		final int X10_TEMP2 = 1;
		int i2 = X10_TEMP1 - X10_TEMP2;
		final int X10_TEMP4 = 0;
		boolean X10_TEMP8 = i2 > X10_TEMP4;
		while (X10_TEMP8) {
			final LevelDataRefArray1 X10_TEMP9 = X10_TEMP0.m_r;
			final int X10_TEMP10 = 1;
			final int X10_TEMP12 = i2 - X10_TEMP10;
			final Point1 RX10_TEMP0 = new Point1(X10_TEMP12);
			final Dist1 RX10_TEMP1 = X10_TEMP9.distValue;
			final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
			final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
					RX10_TEMP0);
			final int RX10_TEMP4 = 0;
			final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
			if (RX10_TEMP5) {
				String RX10_TEMP6 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP6);
			}
			final int RX10_TEMP7 = Program.getPlaceFromDist1(RX10_TEMP1,
					RX10_TEMP3);
			final int RX10_TEMP9 = /* here */0;
			final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
			if (RX10_TEMP10) {
				String RX10_TEMP8 = "Bad place access for array X10_TEMP9";
				throw new RuntimeException(RX10_TEMP8);
			}
			final LevelData RX10_TEMP11 = Program.getRefArrayValue1LevelData(
					X10_TEMP9, RX10_TEMP3);
			final LevelData X10_TEMP18 = RX10_TEMP11;
			final LevelDataRefArray1 X10_TEMP14 = X10_TEMP0.m_r;
			final Point1 RX10_TEMP12 = new Point1(i2);
			final Dist1 RX10_TEMP13 = X10_TEMP14.distValue;
			final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
			final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14,
					RX10_TEMP12);
			final int RX10_TEMP16 = 0;
			final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
			if (RX10_TEMP17) {
				String RX10_TEMP18 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP18);
			}
			final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13,
					RX10_TEMP15);
			final int RX10_TEMP21 = /* here */0;
			final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
			if (RX10_TEMP22) {
				String RX10_TEMP20 = "Bad place access for array X10_TEMP14";
				throw new RuntimeException(RX10_TEMP20);
			}
			final LevelData RX10_TEMP23 = Program.getRefArrayValue1LevelData(
					X10_TEMP14, RX10_TEMP15);
			final LevelData X10_TEMP19 = RX10_TEMP23;
			Program.MGOP_applyOpP3(X10_TEMP0, X10_TEMP18, X10_TEMP19, i2);
			final int X10_TEMP20 = i2;
			final int X10_TEMP21 = 1;
			i2 = i2 - X10_TEMP21;
			final int X10_TEMP6 = 0;
			X10_TEMP8 = i2 > X10_TEMP6;
		}
		final LevelDataRefArray1 X10_TEMP22 = X10_TEMP0.m_z;
		final int X10_TEMP24 = 0;
		final Point1 RX10_TEMP24 = new Point1(X10_TEMP24);
		final Dist1 RX10_TEMP25 = X10_TEMP22.distValue;
		final Region1 RX10_TEMP26 = RX10_TEMP25.dReg;
		final int RX10_TEMP27 = Program.searchPointInRegion1(RX10_TEMP26,
				RX10_TEMP24);
		final int RX10_TEMP28 = 0;
		final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28;
		if (RX10_TEMP29) {
			String RX10_TEMP30 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP30);
		}
		final int RX10_TEMP31 = Program.getPlaceFromDist1(RX10_TEMP25,
				RX10_TEMP27);
		final int RX10_TEMP33 = /* here */0;
		final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33;
		if (RX10_TEMP34) {
			String RX10_TEMP32 = "Bad place access for array X10_TEMP22";
			throw new RuntimeException(RX10_TEMP32);
		}
		final LevelData RX10_TEMP35 = Program.getRefArrayValue1LevelData(
				X10_TEMP22, RX10_TEMP27);
		final LevelData X10_TEMP25 = RX10_TEMP35;
		final int X10_TEMP27 = 0;
		Program.LevelData_set(X10_TEMP25, X10_TEMP27);
		final LevelDataRefArray1 X10_TEMP28 = X10_TEMP0.m_z;
		final int X10_TEMP30 = 0;
		final Point1 RX10_TEMP36 = new Point1(X10_TEMP30);
		final Dist1 RX10_TEMP37 = X10_TEMP28.distValue;
		final Region1 RX10_TEMP38 = RX10_TEMP37.dReg;
		final int RX10_TEMP39 = Program.searchPointInRegion1(RX10_TEMP38,
				RX10_TEMP36);
		final int RX10_TEMP40 = 0;
		final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40;
		if (RX10_TEMP41) {
			String RX10_TEMP42 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP42);
		}
		final int RX10_TEMP43 = Program.getPlaceFromDist1(RX10_TEMP37,
				RX10_TEMP39);
		final int RX10_TEMP45 = /* here */0;
		final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45;
		if (RX10_TEMP46) {
			String RX10_TEMP44 = "Bad place access for array X10_TEMP28";
			throw new RuntimeException(RX10_TEMP44);
		}
		final LevelData RX10_TEMP47 = Program.getRefArrayValue1LevelData(
				X10_TEMP28, RX10_TEMP39);
		final LevelData X10_TEMP37 = RX10_TEMP47;
		final LevelDataRefArray1 X10_TEMP32 = X10_TEMP0.m_r;
		final int X10_TEMP34 = 0;
		final Point1 RX10_TEMP48 = new Point1(X10_TEMP34);
		final Dist1 RX10_TEMP49 = X10_TEMP32.distValue;
		final Region1 RX10_TEMP50 = RX10_TEMP49.dReg;
		final int RX10_TEMP51 = Program.searchPointInRegion1(RX10_TEMP50,
				RX10_TEMP48);
		final int RX10_TEMP52 = 0;
		final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52;
		if (RX10_TEMP53) {
			String RX10_TEMP54 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP54);
		}
		final int RX10_TEMP55 = Program.getPlaceFromDist1(RX10_TEMP49,
				RX10_TEMP51);
		final int RX10_TEMP57 = /* here */0;
		final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57;
		if (RX10_TEMP58) {
			String RX10_TEMP56 = "Bad place access for array X10_TEMP32";
			throw new RuntimeException(RX10_TEMP56);
		}
		final LevelData RX10_TEMP59 = Program.getRefArrayValue1LevelData(
				X10_TEMP32, RX10_TEMP51);
		final LevelData X10_TEMP38 = RX10_TEMP59;
		final boolean X10_TEMP39 = true;
		Program.MGOP_smooth(X10_TEMP0, X10_TEMP37, X10_TEMP38, X10_TEMP39);
		int i3 = 1;
		final int X10_TEMP41 = X10_TEMP0.m_levels;
		boolean X10_TEMP45 = i3 < X10_TEMP41;
		while (X10_TEMP45) {
			final LevelDataRefArray1 X10_TEMP46 = X10_TEMP0.m_z;
			final Point1 RX10_TEMP60 = new Point1(i3);
			final Dist1 RX10_TEMP61 = X10_TEMP46.distValue;
			final Region1 RX10_TEMP62 = RX10_TEMP61.dReg;
			final int RX10_TEMP63 = Program.searchPointInRegion1(RX10_TEMP62,
					RX10_TEMP60);
			final int RX10_TEMP64 = 0;
			final boolean RX10_TEMP65 = RX10_TEMP63 < RX10_TEMP64;
			if (RX10_TEMP65) {
				String RX10_TEMP66 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP66);
			}
			final int RX10_TEMP67 = Program.getPlaceFromDist1(RX10_TEMP61,
					RX10_TEMP63);
			final int RX10_TEMP69 = /* here */0;
			final boolean RX10_TEMP70 = RX10_TEMP67 != RX10_TEMP69;
			if (RX10_TEMP70) {
				String RX10_TEMP68 = "Bad place access for array X10_TEMP46";
				throw new RuntimeException(RX10_TEMP68);
			}
			final LevelData RX10_TEMP71 = Program.getRefArrayValue1LevelData(
					X10_TEMP46, RX10_TEMP63);
			final LevelData X10_TEMP56 = RX10_TEMP71;
			final LevelDataRefArray1 X10_TEMP49 = X10_TEMP0.m_z;
			final int X10_TEMP50 = 1;
			final int X10_TEMP52 = i3 - X10_TEMP50;
			final Point1 RX10_TEMP72 = new Point1(X10_TEMP52);
			final Dist1 RX10_TEMP73 = X10_TEMP49.distValue;
			final Region1 RX10_TEMP74 = RX10_TEMP73.dReg;
			final int RX10_TEMP75 = Program.searchPointInRegion1(RX10_TEMP74,
					RX10_TEMP72);
			final int RX10_TEMP76 = 0;
			final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
			if (RX10_TEMP77) {
				String RX10_TEMP78 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP78);
			}
			final int RX10_TEMP79 = Program.getPlaceFromDist1(RX10_TEMP73,
					RX10_TEMP75);
			final int RX10_TEMP81 = /* here */0;
			final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
			if (RX10_TEMP82) {
				String RX10_TEMP80 = "Bad place access for array X10_TEMP49";
				throw new RuntimeException(RX10_TEMP80);
			}
			final LevelData RX10_TEMP83 = Program.getRefArrayValue1LevelData(
					X10_TEMP49, RX10_TEMP75);
			final LevelData X10_TEMP57 = RX10_TEMP83;
			final int X10_TEMP54 = 1;
			final int X10_TEMP58 = i3 - X10_TEMP54;
			Program.MGOP_applyOpQ3(X10_TEMP0, X10_TEMP56, X10_TEMP57,
					X10_TEMP58);
			final LevelDataRefArray1 X10_TEMP59 = X10_TEMP0.m_r;
			final Point1 RX10_TEMP84 = new Point1(i3);
			final Dist1 RX10_TEMP85 = X10_TEMP59.distValue;
			final Region1 RX10_TEMP86 = RX10_TEMP85.dReg;
			final int RX10_TEMP87 = Program.searchPointInRegion1(RX10_TEMP86,
					RX10_TEMP84);
			final int RX10_TEMP88 = 0;
			final boolean RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88;
			if (RX10_TEMP89) {
				String RX10_TEMP90 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP90);
			}
			final int RX10_TEMP91 = Program.getPlaceFromDist1(RX10_TEMP85,
					RX10_TEMP87);
			final int RX10_TEMP93 = /* here */0;
			final boolean RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93;
			if (RX10_TEMP94) {
				String RX10_TEMP92 = "Bad place access for array X10_TEMP59";
				throw new RuntimeException(RX10_TEMP92);
			}
			final LevelData RX10_TEMP95 = Program.getRefArrayValue1LevelData(
					X10_TEMP59, RX10_TEMP87);
			final LevelData X10_TEMP65 = RX10_TEMP95;
			final LevelDataRefArray1 X10_TEMP62 = X10_TEMP0.m_z;
			final Point1 RX10_TEMP96 = new Point1(i3);
			final Dist1 RX10_TEMP97 = X10_TEMP62.distValue;
			final Region1 RX10_TEMP98 = RX10_TEMP97.dReg;
			final int RX10_TEMP99 = Program.searchPointInRegion1(RX10_TEMP98,
					RX10_TEMP96);
			final int RX10_TEMP100 = 0;
			final boolean RX10_TEMP101 = RX10_TEMP99 < RX10_TEMP100;
			if (RX10_TEMP101) {
				String RX10_TEMP102 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP102);
			}
			final int RX10_TEMP103 = Program.getPlaceFromDist1(RX10_TEMP97,
					RX10_TEMP99);
			final int RX10_TEMP105 = /* here */0;
			final boolean RX10_TEMP106 = RX10_TEMP103 != RX10_TEMP105;
			if (RX10_TEMP106) {
				String RX10_TEMP104 = "Bad place access for array X10_TEMP62";
				throw new RuntimeException(RX10_TEMP104);
			}
			final LevelData RX10_TEMP107 = Program.getRefArrayValue1LevelData(
					X10_TEMP62, RX10_TEMP99);
			final LevelData X10_TEMP66 = RX10_TEMP107;
			Program.MGOP_computeResidual2(X10_TEMP0, X10_TEMP65, X10_TEMP66);
			final LevelDataRefArray1 X10_TEMP67 = X10_TEMP0.m_z;
			final Point1 RX10_TEMP108 = new Point1(i3);
			final Dist1 RX10_TEMP109 = X10_TEMP67.distValue;
			final Region1 RX10_TEMP110 = RX10_TEMP109.dReg;
			final int RX10_TEMP111 = Program.searchPointInRegion1(RX10_TEMP110,
					RX10_TEMP108);
			final int RX10_TEMP112 = 0;
			final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112;
			if (RX10_TEMP113) {
				String RX10_TEMP114 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP114);
			}
			final int RX10_TEMP115 = Program.getPlaceFromDist1(RX10_TEMP109,
					RX10_TEMP111);
			final int RX10_TEMP117 = /* here */0;
			final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117;
			if (RX10_TEMP118) {
				String RX10_TEMP116 = "Bad place access for array X10_TEMP67";
				throw new RuntimeException(RX10_TEMP116);
			}
			final LevelData RX10_TEMP119 = Program.getRefArrayValue1LevelData(
					X10_TEMP67, RX10_TEMP111);
			final LevelData X10_TEMP74 = RX10_TEMP119;
			final LevelDataRefArray1 X10_TEMP70 = X10_TEMP0.m_r;
			final Point1 RX10_TEMP120 = new Point1(i3);
			final Dist1 RX10_TEMP121 = X10_TEMP70.distValue;
			final Region1 RX10_TEMP122 = RX10_TEMP121.dReg;
			final int RX10_TEMP123 = Program.searchPointInRegion1(RX10_TEMP122,
					RX10_TEMP120);
			final int RX10_TEMP124 = 0;
			final boolean RX10_TEMP125 = RX10_TEMP123 < RX10_TEMP124;
			if (RX10_TEMP125) {
				String RX10_TEMP126 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP126);
			}
			final int RX10_TEMP127 = Program.getPlaceFromDist1(RX10_TEMP121,
					RX10_TEMP123);
			final int RX10_TEMP129 = /* here */0;
			final boolean RX10_TEMP130 = RX10_TEMP127 != RX10_TEMP129;
			if (RX10_TEMP130) {
				String RX10_TEMP128 = "Bad place access for array X10_TEMP70";
				throw new RuntimeException(RX10_TEMP128);
			}
			final LevelData RX10_TEMP131 = Program.getRefArrayValue1LevelData(
					X10_TEMP70, RX10_TEMP123);
			final LevelData X10_TEMP75 = RX10_TEMP131;
			final boolean X10_TEMP76 = false;
			Program.MGOP_smooth(X10_TEMP0, X10_TEMP74, X10_TEMP75, X10_TEMP76);
			final int X10_TEMP77 = i3;
			final int X10_TEMP78 = 1;
			i3 = i3 + X10_TEMP78;
			final int X10_TEMP43 = X10_TEMP0.m_levels;
			X10_TEMP45 = i3 < X10_TEMP43;
		}
	}

	public static double MGOP_residualNorm(final MGOP X10_TEMP0) {
		final int X10_TEMP1 = X10_TEMP0.m_levels;
		final int X10_TEMP2 = 1;
		int l = X10_TEMP1 - X10_TEMP2;
		final LevelDataRefArray1 X10_TEMP4 = X10_TEMP0.m_r;
		final Point1 RX10_TEMP0 = new Point1(l);
		final Dist1 RX10_TEMP1 = X10_TEMP4.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP4";
			throw new RuntimeException(RX10_TEMP8);
		}
		final LevelData RX10_TEMP11 = Program.getRefArrayValue1LevelData(
				X10_TEMP4, RX10_TEMP3);
		final LevelData X10_TEMP6 = RX10_TEMP11;
		final double X10_TEMP8 = Program.LevelData_norm2(X10_TEMP6);
		return X10_TEMP8;
	}

	public static int _Timer_max_counters_init() {
		final int X10_TEMP2 = 64;
		return X10_TEMP2;
	}

	public static void Timer_start(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.start_time;
		final double X10_TEMP5 = System.currentTimeMillis();
		final double X10_TEMP6 = X10_TEMP5;
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6);
	}

	public static void Timer_stop(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.elapsed_time;
		final double X10_TEMP5 = System.currentTimeMillis();
		final doubleRefArray1 X10_TEMP3 = X10_TEMP0.start_time;
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP3.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP3";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP3,
				RX10_TEMP3);
		final double X10_TEMP6 = RX10_TEMP11;
		final double X10_TEMP9 = X10_TEMP5 - X10_TEMP6;
		final double X10_TEMP10 = X10_TEMP9;
		final Point1 RX10_TEMP12 = new Point1(n);
		final Dist1 RX10_TEMP13 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP14 = RX10_TEMP13.dReg;
		final int RX10_TEMP15 = Program.searchPointInRegion1(RX10_TEMP14,
				RX10_TEMP12);
		final int RX10_TEMP16 = 0;
		final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16;
		if (RX10_TEMP17) {
			String RX10_TEMP18 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP18);
		}
		final int RX10_TEMP19 = Program.getPlaceFromDist1(RX10_TEMP13,
				RX10_TEMP15);
		final int RX10_TEMP21 = /* here */0;
		final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21;
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
		final int RX10_TEMP26 = Program.searchPointInRegion1(RX10_TEMP25,
				RX10_TEMP23);
		final int RX10_TEMP27 = 0;
		final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27;
		if (RX10_TEMP28) {
			String RX10_TEMP29 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP29);
		}
		final int RX10_TEMP30 = Program.getPlaceFromDist1(RX10_TEMP24,
				RX10_TEMP26);
		final int RX10_TEMP32 = /* here */0;
		final boolean RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32;
		if (RX10_TEMP33) {
			String RX10_TEMP31 = "Bad place access for array X10_TEMP13";
			throw new RuntimeException(RX10_TEMP31);
		}
		final double RX10_TEMP34 = Program.getRefArrayValue1double(X10_TEMP13,
				RX10_TEMP26);
		final double X10_TEMP15 = RX10_TEMP34;
		final int X10_TEMP16 = 1000;
		final double X10_TEMP19 = X10_TEMP15 / X10_TEMP16;
		final double X10_TEMP20 = X10_TEMP19;
		final Point1 RX10_TEMP35 = new Point1(n);
		final Dist1 RX10_TEMP36 = X10_TEMP11.distValue;
		final Region1 RX10_TEMP37 = RX10_TEMP36.dReg;
		final int RX10_TEMP38 = Program.searchPointInRegion1(RX10_TEMP37,
				RX10_TEMP35);
		final int RX10_TEMP39 = 0;
		final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39;
		if (RX10_TEMP40) {
			String RX10_TEMP41 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP41);
		}
		final int RX10_TEMP42 = Program.getPlaceFromDist1(RX10_TEMP36,
				RX10_TEMP38);
		final int RX10_TEMP44 = /* here */0;
		final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44;
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
		final int RX10_TEMP49 = Program.searchPointInRegion1(RX10_TEMP48,
				RX10_TEMP46);
		final int RX10_TEMP50 = 0;
		final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50;
		if (RX10_TEMP51) {
			String RX10_TEMP52 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP52);
		}
		final int RX10_TEMP53 = Program.getPlaceFromDist1(RX10_TEMP47,
				RX10_TEMP49);
		final int RX10_TEMP55 = /* here */0;
		final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55;
		if (RX10_TEMP56) {
			String RX10_TEMP54 = "Bad place access for array X10_TEMP23";
			throw new RuntimeException(RX10_TEMP54);
		}
		final double RX10_TEMP57 = Program.getRefArrayValue1double(X10_TEMP23,
				RX10_TEMP49);
		final double X10_TEMP27 = RX10_TEMP57;
		final doubleRefArray1 X10_TEMP25 = X10_TEMP0.elapsed_time;
		final Point1 RX10_TEMP58 = new Point1(n);
		final Dist1 RX10_TEMP59 = X10_TEMP25.distValue;
		final Region1 RX10_TEMP60 = RX10_TEMP59.dReg;
		final int RX10_TEMP61 = Program.searchPointInRegion1(RX10_TEMP60,
				RX10_TEMP58);
		final int RX10_TEMP62 = 0;
		final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;
		if (RX10_TEMP63) {
			String RX10_TEMP64 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP64);
		}
		final int RX10_TEMP65 = Program.getPlaceFromDist1(RX10_TEMP59,
				RX10_TEMP61);
		final int RX10_TEMP67 = /* here */0;
		final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;
		if (RX10_TEMP68) {
			String RX10_TEMP66 = "Bad place access for array X10_TEMP25";
			throw new RuntimeException(RX10_TEMP66);
		}
		final double RX10_TEMP69 = Program.getRefArrayValue1double(X10_TEMP25,
				RX10_TEMP61);
		final double X10_TEMP28 = RX10_TEMP69;
		final double X10_TEMP31 = X10_TEMP27 + X10_TEMP28;
		final double X10_TEMP32 = X10_TEMP31;
		final Point1 RX10_TEMP70 = new Point1(n);
		final Dist1 RX10_TEMP71 = X10_TEMP21.distValue;
		final Region1 RX10_TEMP72 = RX10_TEMP71.dReg;
		final int RX10_TEMP73 = Program.searchPointInRegion1(RX10_TEMP72,
				RX10_TEMP70);
		final int RX10_TEMP74 = 0;
		final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74;
		if (RX10_TEMP75) {
			String RX10_TEMP76 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP76);
		}
		final int RX10_TEMP77 = Program.getPlaceFromDist1(RX10_TEMP71,
				RX10_TEMP73);
		final int RX10_TEMP79 = /* here */0;
		final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79;
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
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		final double RX10_TEMP11 = Program.getRefArrayValue1double(X10_TEMP1,
				RX10_TEMP3);
		final double X10_TEMP4 = RX10_TEMP11;
		return X10_TEMP4;
	}

	public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
		final doubleRefArray1 X10_TEMP1 = X10_TEMP0.total_time;
		final double X10_TEMP5 = 0;
		final double X10_TEMP6 = X10_TEMP5;
		final Point1 RX10_TEMP0 = new Point1(n);
		final Dist1 RX10_TEMP1 = X10_TEMP1.distValue;
		final Region1 RX10_TEMP2 = RX10_TEMP1.dReg;
		final int RX10_TEMP3 = Program.searchPointInRegion1(RX10_TEMP2,
				RX10_TEMP0);
		final int RX10_TEMP4 = 0;
		final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4;
		if (RX10_TEMP5) {
			String RX10_TEMP6 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP6);
		}
		final int RX10_TEMP7 = Program
				.getPlaceFromDist1(RX10_TEMP1, RX10_TEMP3);
		final int RX10_TEMP9 = /* here */0;
		final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9;
		if (RX10_TEMP10) {
			String RX10_TEMP8 = "Bad place access for array X10_TEMP1";
			throw new RuntimeException(RX10_TEMP8);
		}
		Program.setRefArrayValue1double(X10_TEMP1, RX10_TEMP3, X10_TEMP6);
		final doubleRefArray1 X10_TEMP7 = X10_TEMP0.start_time;
		final double X10_TEMP11 = 0;
		final double X10_TEMP12 = X10_TEMP11;
		final Point1 RX10_TEMP11 = new Point1(n);
		final Dist1 RX10_TEMP12 = X10_TEMP7.distValue;
		final Region1 RX10_TEMP13 = RX10_TEMP12.dReg;
		final int RX10_TEMP14 = Program.searchPointInRegion1(RX10_TEMP13,
				RX10_TEMP11);
		final int RX10_TEMP15 = 0;
		final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;
		if (RX10_TEMP16) {
			String RX10_TEMP17 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP17);
		}
		final int RX10_TEMP18 = Program.getPlaceFromDist1(RX10_TEMP12,
				RX10_TEMP14);
		final int RX10_TEMP20 = /* here */0;
		final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP19 = "Bad place access for array X10_TEMP7";
			throw new RuntimeException(RX10_TEMP19);
		}
		Program.setRefArrayValue1double(X10_TEMP7, RX10_TEMP14, X10_TEMP12);
		final doubleRefArray1 X10_TEMP13 = X10_TEMP0.elapsed_time;
		final double X10_TEMP17 = 0;
		final double X10_TEMP18 = X10_TEMP17;
		final Point1 RX10_TEMP22 = new Point1(n);
		final Dist1 RX10_TEMP23 = X10_TEMP13.distValue;
		final Region1 RX10_TEMP24 = RX10_TEMP23.dReg;
		final int RX10_TEMP25 = Program.searchPointInRegion1(RX10_TEMP24,
				RX10_TEMP22);
		final int RX10_TEMP26 = 0;
		final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;
		if (RX10_TEMP27) {
			String RX10_TEMP28 = "Array index out of bounds";
			throw new RuntimeException(RX10_TEMP28);
		}
		final int RX10_TEMP29 = Program.getPlaceFromDist1(RX10_TEMP23,
				RX10_TEMP25);
		final int RX10_TEMP31 = /* here */0;
		final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;
		if (RX10_TEMP32) {
			String RX10_TEMP30 = "Bad place access for array X10_TEMP13";
			throw new RuntimeException(RX10_TEMP30);
		}
		Program.setRefArrayValue1double(X10_TEMP13, RX10_TEMP25, X10_TEMP18);
	}

	public static void Timer_resetAllTimers(final Timer X10_TEMP0) {
		int i = 0;
		boolean X10_TEMP4 = i < _Timer_max_counters;
		while (X10_TEMP4) {
			Program.Timer_resetTimer(X10_TEMP0, i);
			final int X10_TEMP6 = i;
			final int X10_TEMP7 = 1;
			i = i + X10_TEMP7;
			X10_TEMP4 = i < _Timer_max_counters;
		}
	}

	public static boolean _Util_PERF_OUTPUT_init() {
		final boolean X10_TEMP2 = true;
		return X10_TEMP2;
	}

	public static double _Util_CLOCK_SPEED_init() {
		final double X10_TEMP2 = 375;
		return X10_TEMP2;
	}

	public static double _Util_FP_PERCLOCK_init() {
		final double X10_TEMP2 = 4;
		return X10_TEMP2;
	}

	public static double _Util_COMM_LATENCY_init() {
		final double X10_TEMP2 = 1;
		return X10_TEMP2;
	}

	public static double _Util_COMM_BANDWIDTH_init() {
		final double X10_TEMP2 = 2000;
		return X10_TEMP2;
	}

	public static boolean _Util_IN_LOOP_init() {
		final boolean X10_TEMP2 = false;
		return X10_TEMP2;
	}

	public static boolean _Util_COMP_ONLY_init() {
		final boolean X10_TEMP2 = false;
		return X10_TEMP2;
	}

	public static boolean _Util_COMM_ONLY_init() {
		final boolean X10_TEMP2 = false;
		return X10_TEMP2;
	}

	public static int _Util_THREADS_PERFOREACH_init() {
		final int X10_TEMP2 = 1;
		return X10_TEMP2;
	}

	public static boolean _Util_OVERLAP_COMMANDCOMP_init() {
		final boolean X10_TEMP2 = false;
		return X10_TEMP2;
	}

	public static boolean _Util_EXCHANGE_AFTER_init() {
		final boolean X10_TEMP2 = false;
		return X10_TEMP2;
	}

	public static int _Util_P2SLEVEL_init() {
		final int X10_TEMP2 = 1;
		return X10_TEMP2;
	}

	public static int _Util_N_PLACES_init() {
		final int X10_TEMP2 = /* place.MAX_PLACES */1;
		return X10_TEMP2;
	}

	public static double Util_sumDIFF1(final Point3 p, final doubleRefArray3 arg) {
		double d1 = 0;
		int X10_TEMP5 = 1;
		int X10_TEMP6 = 0;
		int X10_TEMP7 = 0;
		int RX10_TEMP0 = p.f0;
		int RX10_TEMP1 = p.f1;
		int RX10_TEMP2 = p.f2;
		RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5;
		RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6;
		RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7;
		final Point3 X10_TEMP9 = new Point3(RX10_TEMP0, RX10_TEMP1, RX10_TEMP2);
		final Dist3 RX10_TEMP3 = arg.distValue;
		final Region3 RX10_TEMP4 = RX10_TEMP3.dReg;
		final int RX10_TEMP5 = Program.searchPointInRegion3(RX10_TEMP4,
				X10_TEMP9);
		final int RX10_TEMP6 = 0;
		final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6;
		if (RX10_TEMP7) {
			String RX10_TEMP8 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP8);
		}
		final int RX10_TEMP9 = Program
				.getPlaceFromDist3(RX10_TEMP3, RX10_TEMP5);
		final int RX10_TEMP11 = /* here */0;
		final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11;
		if (RX10_TEMP12) {
			String RX10_TEMP10 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP10);
		}
		final double RX10_TEMP13 = Program.getRefArrayValue3double(arg,
				RX10_TEMP5);
		final double X10_TEMP10 = RX10_TEMP13;
		final double X10_TEMP12 = d1 + X10_TEMP10;
		d1 = X10_TEMP12;
		final int X10_TEMP13 = 1;
		final int X10_TEMP14 = 0;
		int X10_TEMP18 = X10_TEMP14 - X10_TEMP13;
		int X10_TEMP19 = 0;
		int X10_TEMP20 = 0;
		int RX10_TEMP14 = p.f0;
		int RX10_TEMP15 = p.f1;
		int RX10_TEMP16 = p.f2;
		RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18;
		RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19;
		RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20;
		final Point3 X10_TEMP22 = new Point3(RX10_TEMP14, RX10_TEMP15,
				RX10_TEMP16);
		final Dist3 RX10_TEMP17 = arg.distValue;
		final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
		final int RX10_TEMP19 = Program.searchPointInRegion3(RX10_TEMP18,
				X10_TEMP22);
		final int RX10_TEMP20 = 0;
		final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP22 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP22);
		}
		final int RX10_TEMP23 = Program.getPlaceFromDist3(RX10_TEMP17,
				RX10_TEMP19);
		final int RX10_TEMP25 = /* here */0;
		final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
		if (RX10_TEMP26) {
			String RX10_TEMP24 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP24);
		}
		final double RX10_TEMP27 = Program.getRefArrayValue3double(arg,
				RX10_TEMP19);
		final double X10_TEMP23 = RX10_TEMP27;
		final double X10_TEMP25 = d1 + X10_TEMP23;
		d1 = X10_TEMP25;
		int X10_TEMP29 = 0;
		int X10_TEMP30 = 1;
		int X10_TEMP31 = 0;
		int RX10_TEMP28 = p.f0;
		int RX10_TEMP29 = p.f1;
		int RX10_TEMP30 = p.f2;
		RX10_TEMP28 = RX10_TEMP28 + X10_TEMP29;
		RX10_TEMP29 = RX10_TEMP29 + X10_TEMP30;
		RX10_TEMP30 = RX10_TEMP30 + X10_TEMP31;
		final Point3 X10_TEMP33 = new Point3(RX10_TEMP28, RX10_TEMP29,
				RX10_TEMP30);
		final Dist3 RX10_TEMP31 = arg.distValue;
		final Region3 RX10_TEMP32 = RX10_TEMP31.dReg;
		final int RX10_TEMP33 = Program.searchPointInRegion3(RX10_TEMP32,
				X10_TEMP33);
		final int RX10_TEMP34 = 0;
		final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34;
		if (RX10_TEMP35) {
			String RX10_TEMP36 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP36);
		}
		final int RX10_TEMP37 = Program.getPlaceFromDist3(RX10_TEMP31,
				RX10_TEMP33);
		final int RX10_TEMP39 = /* here */0;
		final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39;
		if (RX10_TEMP40) {
			String RX10_TEMP38 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP38);
		}
		final double RX10_TEMP41 = Program.getRefArrayValue3double(arg,
				RX10_TEMP33);
		final double X10_TEMP34 = RX10_TEMP41;
		final double X10_TEMP36 = d1 + X10_TEMP34;
		d1 = X10_TEMP36;
		int X10_TEMP42 = 0;
		final int X10_TEMP38 = 1;
		final int X10_TEMP39 = 0;
		int X10_TEMP43 = X10_TEMP39 - X10_TEMP38;
		int X10_TEMP44 = 0;
		int RX10_TEMP42 = p.f0;
		int RX10_TEMP43 = p.f1;
		int RX10_TEMP44 = p.f2;
		RX10_TEMP42 = RX10_TEMP42 + X10_TEMP42;
		RX10_TEMP43 = RX10_TEMP43 + X10_TEMP43;
		RX10_TEMP44 = RX10_TEMP44 + X10_TEMP44;
		final Point3 X10_TEMP46 = new Point3(RX10_TEMP42, RX10_TEMP43,
				RX10_TEMP44);
		final Dist3 RX10_TEMP45 = arg.distValue;
		final Region3 RX10_TEMP46 = RX10_TEMP45.dReg;
		final int RX10_TEMP47 = Program.searchPointInRegion3(RX10_TEMP46,
				X10_TEMP46);
		final int RX10_TEMP48 = 0;
		final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48;
		if (RX10_TEMP49) {
			String RX10_TEMP50 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP50);
		}
		final int RX10_TEMP51 = Program.getPlaceFromDist3(RX10_TEMP45,
				RX10_TEMP47);
		final int RX10_TEMP53 = /* here */0;
		final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53;
		if (RX10_TEMP54) {
			String RX10_TEMP52 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP52);
		}
		final double RX10_TEMP55 = Program.getRefArrayValue3double(arg,
				RX10_TEMP47);
		final double X10_TEMP47 = RX10_TEMP55;
		final double X10_TEMP49 = d1 + X10_TEMP47;
		d1 = X10_TEMP49;
		int X10_TEMP53 = 0;
		int X10_TEMP54 = 0;
		int X10_TEMP55 = 1;
		int RX10_TEMP56 = p.f0;
		int RX10_TEMP57 = p.f1;
		int RX10_TEMP58 = p.f2;
		RX10_TEMP56 = RX10_TEMP56 + X10_TEMP53;
		RX10_TEMP57 = RX10_TEMP57 + X10_TEMP54;
		RX10_TEMP58 = RX10_TEMP58 + X10_TEMP55;
		final Point3 X10_TEMP57 = new Point3(RX10_TEMP56, RX10_TEMP57,
				RX10_TEMP58);
		final Dist3 RX10_TEMP59 = arg.distValue;
		final Region3 RX10_TEMP60 = RX10_TEMP59.dReg;
		final int RX10_TEMP61 = Program.searchPointInRegion3(RX10_TEMP60,
				X10_TEMP57);
		final int RX10_TEMP62 = 0;
		final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;
		if (RX10_TEMP63) {
			String RX10_TEMP64 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP64);
		}
		final int RX10_TEMP65 = Program.getPlaceFromDist3(RX10_TEMP59,
				RX10_TEMP61);
		final int RX10_TEMP67 = /* here */0;
		final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;
		if (RX10_TEMP68) {
			String RX10_TEMP66 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP66);
		}
		final double RX10_TEMP69 = Program.getRefArrayValue3double(arg,
				RX10_TEMP61);
		final double X10_TEMP58 = RX10_TEMP69;
		final double X10_TEMP60 = d1 + X10_TEMP58;
		d1 = X10_TEMP60;
		int X10_TEMP66 = 0;
		int X10_TEMP67 = 0;
		final int X10_TEMP63 = 1;
		final int X10_TEMP64 = 0;
		int X10_TEMP68 = X10_TEMP64 - X10_TEMP63;
		int RX10_TEMP70 = p.f0;
		int RX10_TEMP71 = p.f1;
		int RX10_TEMP72 = p.f2;
		RX10_TEMP70 = RX10_TEMP70 + X10_TEMP66;
		RX10_TEMP71 = RX10_TEMP71 + X10_TEMP67;
		RX10_TEMP72 = RX10_TEMP72 + X10_TEMP68;
		final Point3 X10_TEMP70 = new Point3(RX10_TEMP70, RX10_TEMP71,
				RX10_TEMP72);
		final Dist3 RX10_TEMP73 = arg.distValue;
		final Region3 RX10_TEMP74 = RX10_TEMP73.dReg;
		final int RX10_TEMP75 = Program.searchPointInRegion3(RX10_TEMP74,
				X10_TEMP70);
		final int RX10_TEMP76 = 0;
		final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
		if (RX10_TEMP77) {
			String RX10_TEMP78 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP78);
		}
		final int RX10_TEMP79 = Program.getPlaceFromDist3(RX10_TEMP73,
				RX10_TEMP75);
		final int RX10_TEMP81 = /* here */0;
		final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
		if (RX10_TEMP82) {
			String RX10_TEMP80 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP80);
		}
		final double RX10_TEMP83 = Program.getRefArrayValue3double(arg,
				RX10_TEMP75);
		final double X10_TEMP71 = RX10_TEMP83;
		final double X10_TEMP73 = d1 + X10_TEMP71;
		d1 = X10_TEMP73;
		return d1;
	}

	public static double Util_sumDIFF2(final Point3 p, final doubleRefArray3 arg) {
		double d1 = 0;
		int X10_TEMP5 = 1;
		int X10_TEMP6 = 1;
		int X10_TEMP7 = 0;
		int RX10_TEMP0 = p.f0;
		int RX10_TEMP1 = p.f1;
		int RX10_TEMP2 = p.f2;
		RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5;
		RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6;
		RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7;
		final Point3 X10_TEMP9 = new Point3(RX10_TEMP0, RX10_TEMP1, RX10_TEMP2);
		final Dist3 RX10_TEMP3 = arg.distValue;
		final Region3 RX10_TEMP4 = RX10_TEMP3.dReg;
		final int RX10_TEMP5 = Program.searchPointInRegion3(RX10_TEMP4,
				X10_TEMP9);
		final int RX10_TEMP6 = 0;
		final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6;
		if (RX10_TEMP7) {
			String RX10_TEMP8 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP8);
		}
		final int RX10_TEMP9 = Program
				.getPlaceFromDist3(RX10_TEMP3, RX10_TEMP5);
		final int RX10_TEMP11 = /* here */0;
		final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11;
		if (RX10_TEMP12) {
			String RX10_TEMP10 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP10);
		}
		final double RX10_TEMP13 = Program.getRefArrayValue3double(arg,
				RX10_TEMP5);
		final double X10_TEMP10 = RX10_TEMP13;
		final double X10_TEMP12 = d1 + X10_TEMP10;
		d1 = X10_TEMP12;
		int X10_TEMP18 = 1;
		final int X10_TEMP14 = 1;
		final int X10_TEMP15 = 0;
		int X10_TEMP19 = X10_TEMP15 - X10_TEMP14;
		int X10_TEMP20 = 0;
		int RX10_TEMP14 = p.f0;
		int RX10_TEMP15 = p.f1;
		int RX10_TEMP16 = p.f2;
		RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18;
		RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19;
		RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20;
		final Point3 X10_TEMP22 = new Point3(RX10_TEMP14, RX10_TEMP15,
				RX10_TEMP16);
		final Dist3 RX10_TEMP17 = arg.distValue;
		final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
		final int RX10_TEMP19 = Program.searchPointInRegion3(RX10_TEMP18,
				X10_TEMP22);
		final int RX10_TEMP20 = 0;
		final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP22 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP22);
		}
		final int RX10_TEMP23 = Program.getPlaceFromDist3(RX10_TEMP17,
				RX10_TEMP19);
		final int RX10_TEMP25 = /* here */0;
		final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
		if (RX10_TEMP26) {
			String RX10_TEMP24 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP24);
		}
		final double RX10_TEMP27 = Program.getRefArrayValue3double(arg,
				RX10_TEMP19);
		final double X10_TEMP23 = RX10_TEMP27;
		final double X10_TEMP25 = d1 + X10_TEMP23;
		d1 = X10_TEMP25;
		final int X10_TEMP26 = 1;
		final int X10_TEMP27 = 0;
		int X10_TEMP31 = X10_TEMP27 - X10_TEMP26;
		int X10_TEMP32 = 1;
		int X10_TEMP33 = 0;
		int RX10_TEMP28 = p.f0;
		int RX10_TEMP29 = p.f1;
		int RX10_TEMP30 = p.f2;
		RX10_TEMP28 = RX10_TEMP28 + X10_TEMP31;
		RX10_TEMP29 = RX10_TEMP29 + X10_TEMP32;
		RX10_TEMP30 = RX10_TEMP30 + X10_TEMP33;
		final Point3 X10_TEMP35 = new Point3(RX10_TEMP28, RX10_TEMP29,
				RX10_TEMP30);
		final Dist3 RX10_TEMP31 = arg.distValue;
		final Region3 RX10_TEMP32 = RX10_TEMP31.dReg;
		final int RX10_TEMP33 = Program.searchPointInRegion3(RX10_TEMP32,
				X10_TEMP35);
		final int RX10_TEMP34 = 0;
		final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34;
		if (RX10_TEMP35) {
			String RX10_TEMP36 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP36);
		}
		final int RX10_TEMP37 = Program.getPlaceFromDist3(RX10_TEMP31,
				RX10_TEMP33);
		final int RX10_TEMP39 = /* here */0;
		final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39;
		if (RX10_TEMP40) {
			String RX10_TEMP38 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP38);
		}
		final double RX10_TEMP41 = Program.getRefArrayValue3double(arg,
				RX10_TEMP33);
		final double X10_TEMP36 = RX10_TEMP41;
		final double X10_TEMP38 = d1 + X10_TEMP36;
		d1 = X10_TEMP38;
		final int X10_TEMP39 = 1;
		final int X10_TEMP40 = 0;
		int X10_TEMP46 = X10_TEMP40 - X10_TEMP39;
		final int X10_TEMP42 = 1;
		final int X10_TEMP43 = 0;
		int X10_TEMP47 = X10_TEMP43 - X10_TEMP42;
		int X10_TEMP48 = 0;
		int RX10_TEMP42 = p.f0;
		int RX10_TEMP43 = p.f1;
		int RX10_TEMP44 = p.f2;
		RX10_TEMP42 = RX10_TEMP42 + X10_TEMP46;
		RX10_TEMP43 = RX10_TEMP43 + X10_TEMP47;
		RX10_TEMP44 = RX10_TEMP44 + X10_TEMP48;
		final Point3 X10_TEMP50 = new Point3(RX10_TEMP42, RX10_TEMP43,
				RX10_TEMP44);
		final Dist3 RX10_TEMP45 = arg.distValue;
		final Region3 RX10_TEMP46 = RX10_TEMP45.dReg;
		final int RX10_TEMP47 = Program.searchPointInRegion3(RX10_TEMP46,
				X10_TEMP50);
		final int RX10_TEMP48 = 0;
		final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48;
		if (RX10_TEMP49) {
			String RX10_TEMP50 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP50);
		}
		final int RX10_TEMP51 = Program.getPlaceFromDist3(RX10_TEMP45,
				RX10_TEMP47);
		final int RX10_TEMP53 = /* here */0;
		final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53;
		if (RX10_TEMP54) {
			String RX10_TEMP52 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP52);
		}
		final double RX10_TEMP55 = Program.getRefArrayValue3double(arg,
				RX10_TEMP47);
		final double X10_TEMP51 = RX10_TEMP55;
		final double X10_TEMP53 = d1 + X10_TEMP51;
		d1 = X10_TEMP53;
		int X10_TEMP57 = 1;
		int X10_TEMP58 = 0;
		int X10_TEMP59 = 1;
		int RX10_TEMP56 = p.f0;
		int RX10_TEMP57 = p.f1;
		int RX10_TEMP58 = p.f2;
		RX10_TEMP56 = RX10_TEMP56 + X10_TEMP57;
		RX10_TEMP57 = RX10_TEMP57 + X10_TEMP58;
		RX10_TEMP58 = RX10_TEMP58 + X10_TEMP59;
		final Point3 X10_TEMP61 = new Point3(RX10_TEMP56, RX10_TEMP57,
				RX10_TEMP58);
		final Dist3 RX10_TEMP59 = arg.distValue;
		final Region3 RX10_TEMP60 = RX10_TEMP59.dReg;
		final int RX10_TEMP61 = Program.searchPointInRegion3(RX10_TEMP60,
				X10_TEMP61);
		final int RX10_TEMP62 = 0;
		final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;
		if (RX10_TEMP63) {
			String RX10_TEMP64 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP64);
		}
		final int RX10_TEMP65 = Program.getPlaceFromDist3(RX10_TEMP59,
				RX10_TEMP61);
		final int RX10_TEMP67 = /* here */0;
		final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;
		if (RX10_TEMP68) {
			String RX10_TEMP66 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP66);
		}
		final double RX10_TEMP69 = Program.getRefArrayValue3double(arg,
				RX10_TEMP61);
		final double X10_TEMP62 = RX10_TEMP69;
		final double X10_TEMP64 = d1 + X10_TEMP62;
		d1 = X10_TEMP64;
		int X10_TEMP70 = 1;
		int X10_TEMP71 = 0;
		final int X10_TEMP67 = 1;
		final int X10_TEMP68 = 0;
		int X10_TEMP72 = X10_TEMP68 - X10_TEMP67;
		int RX10_TEMP70 = p.f0;
		int RX10_TEMP71 = p.f1;
		int RX10_TEMP72 = p.f2;
		RX10_TEMP70 = RX10_TEMP70 + X10_TEMP70;
		RX10_TEMP71 = RX10_TEMP71 + X10_TEMP71;
		RX10_TEMP72 = RX10_TEMP72 + X10_TEMP72;
		final Point3 X10_TEMP74 = new Point3(RX10_TEMP70, RX10_TEMP71,
				RX10_TEMP72);
		final Dist3 RX10_TEMP73 = arg.distValue;
		final Region3 RX10_TEMP74 = RX10_TEMP73.dReg;
		final int RX10_TEMP75 = Program.searchPointInRegion3(RX10_TEMP74,
				X10_TEMP74);
		final int RX10_TEMP76 = 0;
		final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
		if (RX10_TEMP77) {
			String RX10_TEMP78 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP78);
		}
		final int RX10_TEMP79 = Program.getPlaceFromDist3(RX10_TEMP73,
				RX10_TEMP75);
		final int RX10_TEMP81 = /* here */0;
		final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
		if (RX10_TEMP82) {
			String RX10_TEMP80 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP80);
		}
		final double RX10_TEMP83 = Program.getRefArrayValue3double(arg,
				RX10_TEMP75);
		final double X10_TEMP75 = RX10_TEMP83;
		final double X10_TEMP77 = d1 + X10_TEMP75;
		d1 = X10_TEMP77;
		final int X10_TEMP78 = 1;
		final int X10_TEMP79 = 0;
		int X10_TEMP83 = X10_TEMP79 - X10_TEMP78;
		int X10_TEMP84 = 0;
		int X10_TEMP85 = 1;
		int RX10_TEMP84 = p.f0;
		int RX10_TEMP85 = p.f1;
		int RX10_TEMP86 = p.f2;
		RX10_TEMP84 = RX10_TEMP84 + X10_TEMP83;
		RX10_TEMP85 = RX10_TEMP85 + X10_TEMP84;
		RX10_TEMP86 = RX10_TEMP86 + X10_TEMP85;
		final Point3 X10_TEMP87 = new Point3(RX10_TEMP84, RX10_TEMP85,
				RX10_TEMP86);
		final Dist3 RX10_TEMP87 = arg.distValue;
		final Region3 RX10_TEMP88 = RX10_TEMP87.dReg;
		final int RX10_TEMP89 = Program.searchPointInRegion3(RX10_TEMP88,
				X10_TEMP87);
		final int RX10_TEMP90 = 0;
		final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;
		if (RX10_TEMP91) {
			String RX10_TEMP92 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP92);
		}
		final int RX10_TEMP93 = Program.getPlaceFromDist3(RX10_TEMP87,
				RX10_TEMP89);
		final int RX10_TEMP95 = /* here */0;
		final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95;
		if (RX10_TEMP96) {
			String RX10_TEMP94 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP94);
		}
		final double RX10_TEMP97 = Program.getRefArrayValue3double(arg,
				RX10_TEMP89);
		final double X10_TEMP88 = RX10_TEMP97;
		final double X10_TEMP90 = d1 + X10_TEMP88;
		d1 = X10_TEMP90;
		final int X10_TEMP91 = 1;
		final int X10_TEMP92 = 0;
		int X10_TEMP98 = X10_TEMP92 - X10_TEMP91;
		int X10_TEMP99 = 0;
		final int X10_TEMP95 = 1;
		final int X10_TEMP96 = 0;
		int X10_TEMP100 = X10_TEMP96 - X10_TEMP95;
		int RX10_TEMP98 = p.f0;
		int RX10_TEMP99 = p.f1;
		int RX10_TEMP100 = p.f2;
		RX10_TEMP98 = RX10_TEMP98 + X10_TEMP98;
		RX10_TEMP99 = RX10_TEMP99 + X10_TEMP99;
		RX10_TEMP100 = RX10_TEMP100 + X10_TEMP100;
		final Point3 X10_TEMP102 = new Point3(RX10_TEMP98, RX10_TEMP99,
				RX10_TEMP100);
		final Dist3 RX10_TEMP101 = arg.distValue;
		final Region3 RX10_TEMP102 = RX10_TEMP101.dReg;
		final int RX10_TEMP103 = Program.searchPointInRegion3(RX10_TEMP102,
				X10_TEMP102);
		final int RX10_TEMP104 = 0;
		final boolean RX10_TEMP105 = RX10_TEMP103 < RX10_TEMP104;
		if (RX10_TEMP105) {
			String RX10_TEMP106 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP106);
		}
		final int RX10_TEMP107 = Program.getPlaceFromDist3(RX10_TEMP101,
				RX10_TEMP103);
		final int RX10_TEMP109 = /* here */0;
		final boolean RX10_TEMP110 = RX10_TEMP107 != RX10_TEMP109;
		if (RX10_TEMP110) {
			String RX10_TEMP108 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP108);
		}
		final double RX10_TEMP111 = Program.getRefArrayValue3double(arg,
				RX10_TEMP103);
		final double X10_TEMP103 = RX10_TEMP111;
		final double X10_TEMP105 = d1 + X10_TEMP103;
		d1 = X10_TEMP105;
		int X10_TEMP109 = 0;
		int X10_TEMP110 = 1;
		int X10_TEMP111 = 1;
		int RX10_TEMP112 = p.f0;
		int RX10_TEMP113 = p.f1;
		int RX10_TEMP114 = p.f2;
		RX10_TEMP112 = RX10_TEMP112 + X10_TEMP109;
		RX10_TEMP113 = RX10_TEMP113 + X10_TEMP110;
		RX10_TEMP114 = RX10_TEMP114 + X10_TEMP111;
		final Point3 X10_TEMP113 = new Point3(RX10_TEMP112, RX10_TEMP113,
				RX10_TEMP114);
		final Dist3 RX10_TEMP115 = arg.distValue;
		final Region3 RX10_TEMP116 = RX10_TEMP115.dReg;
		final int RX10_TEMP117 = Program.searchPointInRegion3(RX10_TEMP116,
				X10_TEMP113);
		final int RX10_TEMP118 = 0;
		final boolean RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118;
		if (RX10_TEMP119) {
			String RX10_TEMP120 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP120);
		}
		final int RX10_TEMP121 = Program.getPlaceFromDist3(RX10_TEMP115,
				RX10_TEMP117);
		final int RX10_TEMP123 = /* here */0;
		final boolean RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123;
		if (RX10_TEMP124) {
			String RX10_TEMP122 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP122);
		}
		final double RX10_TEMP125 = Program.getRefArrayValue3double(arg,
				RX10_TEMP117);
		final double X10_TEMP114 = RX10_TEMP125;
		final double X10_TEMP116 = d1 + X10_TEMP114;
		d1 = X10_TEMP116;
		int X10_TEMP122 = 0;
		int X10_TEMP123 = 1;
		final int X10_TEMP119 = 1;
		final int X10_TEMP120 = 0;
		int X10_TEMP124 = X10_TEMP120 - X10_TEMP119;
		int RX10_TEMP126 = p.f0;
		int RX10_TEMP127 = p.f1;
		int RX10_TEMP128 = p.f2;
		RX10_TEMP126 = RX10_TEMP126 + X10_TEMP122;
		RX10_TEMP127 = RX10_TEMP127 + X10_TEMP123;
		RX10_TEMP128 = RX10_TEMP128 + X10_TEMP124;
		final Point3 X10_TEMP126 = new Point3(RX10_TEMP126, RX10_TEMP127,
				RX10_TEMP128);
		final Dist3 RX10_TEMP129 = arg.distValue;
		final Region3 RX10_TEMP130 = RX10_TEMP129.dReg;
		final int RX10_TEMP131 = Program.searchPointInRegion3(RX10_TEMP130,
				X10_TEMP126);
		final int RX10_TEMP132 = 0;
		final boolean RX10_TEMP133 = RX10_TEMP131 < RX10_TEMP132;
		if (RX10_TEMP133) {
			String RX10_TEMP134 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP134);
		}
		final int RX10_TEMP135 = Program.getPlaceFromDist3(RX10_TEMP129,
				RX10_TEMP131);
		final int RX10_TEMP137 = /* here */0;
		final boolean RX10_TEMP138 = RX10_TEMP135 != RX10_TEMP137;
		if (RX10_TEMP138) {
			String RX10_TEMP136 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP136);
		}
		final double RX10_TEMP139 = Program.getRefArrayValue3double(arg,
				RX10_TEMP131);
		final double X10_TEMP127 = RX10_TEMP139;
		final double X10_TEMP129 = d1 + X10_TEMP127;
		d1 = X10_TEMP129;
		int X10_TEMP135 = 0;
		final int X10_TEMP131 = 1;
		final int X10_TEMP132 = 0;
		int X10_TEMP136 = X10_TEMP132 - X10_TEMP131;
		int X10_TEMP137 = 1;
		int RX10_TEMP140 = p.f0;
		int RX10_TEMP141 = p.f1;
		int RX10_TEMP142 = p.f2;
		RX10_TEMP140 = RX10_TEMP140 + X10_TEMP135;
		RX10_TEMP141 = RX10_TEMP141 + X10_TEMP136;
		RX10_TEMP142 = RX10_TEMP142 + X10_TEMP137;
		final Point3 X10_TEMP139 = new Point3(RX10_TEMP140, RX10_TEMP141,
				RX10_TEMP142);
		final Dist3 RX10_TEMP143 = arg.distValue;
		final Region3 RX10_TEMP144 = RX10_TEMP143.dReg;
		final int RX10_TEMP145 = Program.searchPointInRegion3(RX10_TEMP144,
				X10_TEMP139);
		final int RX10_TEMP146 = 0;
		final boolean RX10_TEMP147 = RX10_TEMP145 < RX10_TEMP146;
		if (RX10_TEMP147) {
			String RX10_TEMP148 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP148);
		}
		final int RX10_TEMP149 = Program.getPlaceFromDist3(RX10_TEMP143,
				RX10_TEMP145);
		final int RX10_TEMP151 = /* here */0;
		final boolean RX10_TEMP152 = RX10_TEMP149 != RX10_TEMP151;
		if (RX10_TEMP152) {
			String RX10_TEMP150 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP150);
		}
		final double RX10_TEMP153 = Program.getRefArrayValue3double(arg,
				RX10_TEMP145);
		final double X10_TEMP140 = RX10_TEMP153;
		final double X10_TEMP142 = d1 + X10_TEMP140;
		d1 = X10_TEMP142;
		int X10_TEMP150 = 0;
		final int X10_TEMP144 = 1;
		final int X10_TEMP145 = 0;
		int X10_TEMP151 = X10_TEMP145 - X10_TEMP144;
		final int X10_TEMP147 = 1;
		final int X10_TEMP148 = 0;
		int X10_TEMP152 = X10_TEMP148 - X10_TEMP147;
		int RX10_TEMP154 = p.f0;
		int RX10_TEMP155 = p.f1;
		int RX10_TEMP156 = p.f2;
		RX10_TEMP154 = RX10_TEMP154 + X10_TEMP150;
		RX10_TEMP155 = RX10_TEMP155 + X10_TEMP151;
		RX10_TEMP156 = RX10_TEMP156 + X10_TEMP152;
		final Point3 X10_TEMP154 = new Point3(RX10_TEMP154, RX10_TEMP155,
				RX10_TEMP156);
		final Dist3 RX10_TEMP157 = arg.distValue;
		final Region3 RX10_TEMP158 = RX10_TEMP157.dReg;
		final int RX10_TEMP159 = Program.searchPointInRegion3(RX10_TEMP158,
				X10_TEMP154);
		final int RX10_TEMP160 = 0;
		final boolean RX10_TEMP161 = RX10_TEMP159 < RX10_TEMP160;
		if (RX10_TEMP161) {
			String RX10_TEMP162 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP162);
		}
		final int RX10_TEMP163 = Program.getPlaceFromDist3(RX10_TEMP157,
				RX10_TEMP159);
		final int RX10_TEMP165 = /* here */0;
		final boolean RX10_TEMP166 = RX10_TEMP163 != RX10_TEMP165;
		if (RX10_TEMP166) {
			String RX10_TEMP164 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP164);
		}
		final double RX10_TEMP167 = Program.getRefArrayValue3double(arg,
				RX10_TEMP159);
		final double X10_TEMP155 = RX10_TEMP167;
		final double X10_TEMP157 = d1 + X10_TEMP155;
		d1 = X10_TEMP157;
		return d1;
	}

	public static double Util_sumDIFF3(final Point3 p, final doubleRefArray3 arg) {
		double d1 = 0;
		int X10_TEMP5 = 1;
		int X10_TEMP6 = 1;
		int X10_TEMP7 = 1;
		int RX10_TEMP0 = p.f0;
		int RX10_TEMP1 = p.f1;
		int RX10_TEMP2 = p.f2;
		RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5;
		RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6;
		RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7;
		final Point3 X10_TEMP9 = new Point3(RX10_TEMP0, RX10_TEMP1, RX10_TEMP2);
		final Dist3 RX10_TEMP3 = arg.distValue;
		final Region3 RX10_TEMP4 = RX10_TEMP3.dReg;
		final int RX10_TEMP5 = Program.searchPointInRegion3(RX10_TEMP4,
				X10_TEMP9);
		final int RX10_TEMP6 = 0;
		final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6;
		if (RX10_TEMP7) {
			String RX10_TEMP8 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP8);
		}
		final int RX10_TEMP9 = Program
				.getPlaceFromDist3(RX10_TEMP3, RX10_TEMP5);
		final int RX10_TEMP11 = /* here */0;
		final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11;
		if (RX10_TEMP12) {
			String RX10_TEMP10 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP10);
		}
		final double RX10_TEMP13 = Program.getRefArrayValue3double(arg,
				RX10_TEMP5);
		final double X10_TEMP10 = RX10_TEMP13;
		final double X10_TEMP12 = d1 + X10_TEMP10;
		d1 = X10_TEMP12;
		int X10_TEMP18 = 1;
		int X10_TEMP19 = 1;
		final int X10_TEMP15 = 1;
		final int X10_TEMP16 = 0;
		int X10_TEMP20 = X10_TEMP16 - X10_TEMP15;
		int RX10_TEMP14 = p.f0;
		int RX10_TEMP15 = p.f1;
		int RX10_TEMP16 = p.f2;
		RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18;
		RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19;
		RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20;
		final Point3 X10_TEMP22 = new Point3(RX10_TEMP14, RX10_TEMP15,
				RX10_TEMP16);
		final Dist3 RX10_TEMP17 = arg.distValue;
		final Region3 RX10_TEMP18 = RX10_TEMP17.dReg;
		final int RX10_TEMP19 = Program.searchPointInRegion3(RX10_TEMP18,
				X10_TEMP22);
		final int RX10_TEMP20 = 0;
		final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20;
		if (RX10_TEMP21) {
			String RX10_TEMP22 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP22);
		}
		final int RX10_TEMP23 = Program.getPlaceFromDist3(RX10_TEMP17,
				RX10_TEMP19);
		final int RX10_TEMP25 = /* here */0;
		final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25;
		if (RX10_TEMP26) {
			String RX10_TEMP24 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP24);
		}
		final double RX10_TEMP27 = Program.getRefArrayValue3double(arg,
				RX10_TEMP19);
		final double X10_TEMP23 = RX10_TEMP27;
		final double X10_TEMP25 = d1 + X10_TEMP23;
		d1 = X10_TEMP25;
		int X10_TEMP31 = 1;
		final int X10_TEMP27 = 1;
		final int X10_TEMP28 = 0;
		int X10_TEMP32 = X10_TEMP28 - X10_TEMP27;
		int X10_TEMP33 = 1;
		int RX10_TEMP28 = p.f0;
		int RX10_TEMP29 = p.f1;
		int RX10_TEMP30 = p.f2;
		RX10_TEMP28 = RX10_TEMP28 + X10_TEMP31;
		RX10_TEMP29 = RX10_TEMP29 + X10_TEMP32;
		RX10_TEMP30 = RX10_TEMP30 + X10_TEMP33;
		final Point3 X10_TEMP35 = new Point3(RX10_TEMP28, RX10_TEMP29,
				RX10_TEMP30);
		final Dist3 RX10_TEMP31 = arg.distValue;
		final Region3 RX10_TEMP32 = RX10_TEMP31.dReg;
		final int RX10_TEMP33 = Program.searchPointInRegion3(RX10_TEMP32,
				X10_TEMP35);
		final int RX10_TEMP34 = 0;
		final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34;
		if (RX10_TEMP35) {
			String RX10_TEMP36 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP36);
		}
		final int RX10_TEMP37 = Program.getPlaceFromDist3(RX10_TEMP31,
				RX10_TEMP33);
		final int RX10_TEMP39 = /* here */0;
		final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39;
		if (RX10_TEMP40) {
			String RX10_TEMP38 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP38);
		}
		final double RX10_TEMP41 = Program.getRefArrayValue3double(arg,
				RX10_TEMP33);
		final double X10_TEMP36 = RX10_TEMP41;
		final double X10_TEMP38 = d1 + X10_TEMP36;
		d1 = X10_TEMP38;
		int X10_TEMP46 = 1;
		final int X10_TEMP40 = 1;
		final int X10_TEMP41 = 0;
		int X10_TEMP47 = X10_TEMP41 - X10_TEMP40;
		final int X10_TEMP43 = 1;
		final int X10_TEMP44 = 0;
		int X10_TEMP48 = X10_TEMP44 - X10_TEMP43;
		int RX10_TEMP42 = p.f0;
		int RX10_TEMP43 = p.f1;
		int RX10_TEMP44 = p.f2;
		RX10_TEMP42 = RX10_TEMP42 + X10_TEMP46;
		RX10_TEMP43 = RX10_TEMP43 + X10_TEMP47;
		RX10_TEMP44 = RX10_TEMP44 + X10_TEMP48;
		final Point3 X10_TEMP50 = new Point3(RX10_TEMP42, RX10_TEMP43,
				RX10_TEMP44);
		final Dist3 RX10_TEMP45 = arg.distValue;
		final Region3 RX10_TEMP46 = RX10_TEMP45.dReg;
		final int RX10_TEMP47 = Program.searchPointInRegion3(RX10_TEMP46,
				X10_TEMP50);
		final int RX10_TEMP48 = 0;
		final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48;
		if (RX10_TEMP49) {
			String RX10_TEMP50 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP50);
		}
		final int RX10_TEMP51 = Program.getPlaceFromDist3(RX10_TEMP45,
				RX10_TEMP47);
		final int RX10_TEMP53 = /* here */0;
		final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53;
		if (RX10_TEMP54) {
			String RX10_TEMP52 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP52);
		}
		final double RX10_TEMP55 = Program.getRefArrayValue3double(arg,
				RX10_TEMP47);
		final double X10_TEMP51 = RX10_TEMP55;
		final double X10_TEMP53 = d1 + X10_TEMP51;
		d1 = X10_TEMP53;
		final int X10_TEMP54 = 1;
		final int X10_TEMP55 = 0;
		int X10_TEMP59 = X10_TEMP55 - X10_TEMP54;
		int X10_TEMP60 = 1;
		int X10_TEMP61 = 1;
		int RX10_TEMP56 = p.f0;
		int RX10_TEMP57 = p.f1;
		int RX10_TEMP58 = p.f2;
		RX10_TEMP56 = RX10_TEMP56 + X10_TEMP59;
		RX10_TEMP57 = RX10_TEMP57 + X10_TEMP60;
		RX10_TEMP58 = RX10_TEMP58 + X10_TEMP61;
		final Point3 X10_TEMP63 = new Point3(RX10_TEMP56, RX10_TEMP57,
				RX10_TEMP58);
		final Dist3 RX10_TEMP59 = arg.distValue;
		final Region3 RX10_TEMP60 = RX10_TEMP59.dReg;
		final int RX10_TEMP61 = Program.searchPointInRegion3(RX10_TEMP60,
				X10_TEMP63);
		final int RX10_TEMP62 = 0;
		final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62;
		if (RX10_TEMP63) {
			String RX10_TEMP64 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP64);
		}
		final int RX10_TEMP65 = Program.getPlaceFromDist3(RX10_TEMP59,
				RX10_TEMP61);
		final int RX10_TEMP67 = /* here */0;
		final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67;
		if (RX10_TEMP68) {
			String RX10_TEMP66 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP66);
		}
		final double RX10_TEMP69 = Program.getRefArrayValue3double(arg,
				RX10_TEMP61);
		final double X10_TEMP64 = RX10_TEMP69;
		final double X10_TEMP66 = d1 + X10_TEMP64;
		d1 = X10_TEMP66;
		final int X10_TEMP67 = 1;
		final int X10_TEMP68 = 0;
		int X10_TEMP74 = X10_TEMP68 - X10_TEMP67;
		int X10_TEMP75 = 1;
		final int X10_TEMP71 = 1;
		final int X10_TEMP72 = 0;
		int X10_TEMP76 = X10_TEMP72 - X10_TEMP71;
		int RX10_TEMP70 = p.f0;
		int RX10_TEMP71 = p.f1;
		int RX10_TEMP72 = p.f2;
		RX10_TEMP70 = RX10_TEMP70 + X10_TEMP74;
		RX10_TEMP71 = RX10_TEMP71 + X10_TEMP75;
		RX10_TEMP72 = RX10_TEMP72 + X10_TEMP76;
		final Point3 X10_TEMP78 = new Point3(RX10_TEMP70, RX10_TEMP71,
				RX10_TEMP72);
		final Dist3 RX10_TEMP73 = arg.distValue;
		final Region3 RX10_TEMP74 = RX10_TEMP73.dReg;
		final int RX10_TEMP75 = Program.searchPointInRegion3(RX10_TEMP74,
				X10_TEMP78);
		final int RX10_TEMP76 = 0;
		final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76;
		if (RX10_TEMP77) {
			String RX10_TEMP78 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP78);
		}
		final int RX10_TEMP79 = Program.getPlaceFromDist3(RX10_TEMP73,
				RX10_TEMP75);
		final int RX10_TEMP81 = /* here */0;
		final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81;
		if (RX10_TEMP82) {
			String RX10_TEMP80 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP80);
		}
		final double RX10_TEMP83 = Program.getRefArrayValue3double(arg,
				RX10_TEMP75);
		final double X10_TEMP79 = RX10_TEMP83;
		final double X10_TEMP81 = d1 + X10_TEMP79;
		d1 = X10_TEMP81;
		final int X10_TEMP82 = 1;
		final int X10_TEMP83 = 0;
		int X10_TEMP89 = X10_TEMP83 - X10_TEMP82;
		final int X10_TEMP85 = 1;
		final int X10_TEMP86 = 0;
		int X10_TEMP90 = X10_TEMP86 - X10_TEMP85;
		int X10_TEMP91 = 1;
		int RX10_TEMP84 = p.f0;
		int RX10_TEMP85 = p.f1;
		int RX10_TEMP86 = p.f2;
		RX10_TEMP84 = RX10_TEMP84 + X10_TEMP89;
		RX10_TEMP85 = RX10_TEMP85 + X10_TEMP90;
		RX10_TEMP86 = RX10_TEMP86 + X10_TEMP91;
		final Point3 X10_TEMP93 = new Point3(RX10_TEMP84, RX10_TEMP85,
				RX10_TEMP86);
		final Dist3 RX10_TEMP87 = arg.distValue;
		final Region3 RX10_TEMP88 = RX10_TEMP87.dReg;
		final int RX10_TEMP89 = Program.searchPointInRegion3(RX10_TEMP88,
				X10_TEMP93);
		final int RX10_TEMP90 = 0;
		final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90;
		if (RX10_TEMP91) {
			String RX10_TEMP92 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP92);
		}
		final int RX10_TEMP93 = Program.getPlaceFromDist3(RX10_TEMP87,
				RX10_TEMP89);
		final int RX10_TEMP95 = /* here */0;
		final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95;
		if (RX10_TEMP96) {
			String RX10_TEMP94 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP94);
		}
		final double RX10_TEMP97 = Program.getRefArrayValue3double(arg,
				RX10_TEMP89);
		final double X10_TEMP94 = RX10_TEMP97;
		final double X10_TEMP96 = d1 + X10_TEMP94;
		d1 = X10_TEMP96;
		final int X10_TEMP97 = 1;
		final int X10_TEMP98 = 0;
		int X10_TEMP106 = X10_TEMP98 - X10_TEMP97;
		final int X10_TEMP100 = 1;
		final int X10_TEMP101 = 0;
		int X10_TEMP107 = X10_TEMP101 - X10_TEMP100;
		final int X10_TEMP103 = 1;
		final int X10_TEMP104 = 0;
		int X10_TEMP108 = X10_TEMP104 - X10_TEMP103;
		int RX10_TEMP98 = p.f0;
		int RX10_TEMP99 = p.f1;
		int RX10_TEMP100 = p.f2;
		RX10_TEMP98 = RX10_TEMP98 + X10_TEMP106;
		RX10_TEMP99 = RX10_TEMP99 + X10_TEMP107;
		RX10_TEMP100 = RX10_TEMP100 + X10_TEMP108;
		final Point3 X10_TEMP110 = new Point3(RX10_TEMP98, RX10_TEMP99,
				RX10_TEMP100);
		final Dist3 RX10_TEMP101 = arg.distValue;
		final Region3 RX10_TEMP102 = RX10_TEMP101.dReg;
		final int RX10_TEMP103 = Program.searchPointInRegion3(RX10_TEMP102,
				X10_TEMP110);
		final int RX10_TEMP104 = 0;
		final boolean RX10_TEMP105 = RX10_TEMP103 < RX10_TEMP104;
		if (RX10_TEMP105) {
			String RX10_TEMP106 = "Array access index out of bounds";
			throw new RuntimeException(RX10_TEMP106);
		}
		final int RX10_TEMP107 = Program.getPlaceFromDist3(RX10_TEMP101,
				RX10_TEMP103);
		final int RX10_TEMP109 = /* here */0;
		final boolean RX10_TEMP110 = RX10_TEMP107 != RX10_TEMP109;
		if (RX10_TEMP110) {
			String RX10_TEMP108 = "Bad place access for array arg";
			throw new RuntimeException(RX10_TEMP108);
		}
		final double RX10_TEMP111 = Program.getRefArrayValue3double(arg,
				RX10_TEMP103);
		final double X10_TEMP111 = RX10_TEMP111;
		final double X10_TEMP113 = d1 + X10_TEMP111;
		d1 = X10_TEMP113;
		return d1;
	}

	public static Region3 _Util_UNIT_CUBE_init() {
		final int X10_TEMP3 = 0;
		final int X10_TEMP4 = 1;
		final int X10_TEMP7 = 0;
		final int X10_TEMP8 = 1;
		final int X10_TEMP11 = 0;
		final int X10_TEMP12 = 1;
		final Region3 X10_TEMP14 = Program.createNewRegion3RRR(X10_TEMP3,
				X10_TEMP4, X10_TEMP7, X10_TEMP8, X10_TEMP11, X10_TEMP12);
		return X10_TEMP14;
	}

	public static Region3ValArray3 _Util_QREGIONS_init() {
		final Region3 RX10_TEMP0 = _Util_UNIT_CUBE;
		final int RX10_TEMP4 = _Util_UNIT_CUBE.regSize;
		final int RX10_TEMP5 = 1;
		final int RX10_TEMP6 = RX10_TEMP4 - RX10_TEMP5;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP3 = RX10_TEMP6 + SX10_TEMP0;
		final Region3[] SX10_TEMP1 = new Region3[RX10_TEMP3];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int RX10_TEMP1 = SX10_TEMP2;
			final int RX10_TEMP2 = RX10_TEMP1;
			final Point3 p = Program
					.regionOrdinalPoint3(RX10_TEMP0, RX10_TEMP2);
			final int a = p.f0;
			final int b = p.f1;
			final int c = p.f2;
			final int X10_TEMP3 = 0;
			final int X10_TEMP6 = 0;
			final int X10_TEMP9 = 0;
			final Region3 X10_TEMP11 = Program.createNewRegion3RRR(X10_TEMP3,
					a, X10_TEMP6, b, X10_TEMP9, c);
			SX10_TEMP1[RX10_TEMP1] = X10_TEMP11;
		}
		final Region3[] RX10_TEMP7 = SX10_TEMP1;
		final Region3ValArray3 RX10_TEMP8 = new Region3ValArray3(
				_Util_UNIT_CUBE, RX10_TEMP7);
		final Region3ValArray3 X10_TEMP12 = RX10_TEMP8;
		return X10_TEMP12;
	}

	public static int _Util_LOW_init() {
		final int X10_TEMP2 = 0;
		return X10_TEMP2;
	}

	public static int _Util_HIGH_init() {
		final int X10_TEMP2 = 1;
		return X10_TEMP2;
	}

	public static boolean Util_powerOf2(final int a_int) {
		final int X10_TEMP2 = Math.abs(a_int);
		int i = (int) X10_TEMP2;
		final int X10_TEMP4 = 0;
		final boolean X10_TEMP6 = i == X10_TEMP4;
		if (X10_TEMP6) {
			final boolean X10_TEMP8 = false;
			return X10_TEMP8;
		} else {
			final int X10_TEMP11 = Program.Util_log2(i);
			final int X10_TEMP13 = Program.Util_pow2(X10_TEMP11);
			final boolean X10_TEMP15 = i != X10_TEMP13;
			if (X10_TEMP15) {
				final boolean X10_TEMP17 = false;
				return X10_TEMP17;
			}
		}
		final boolean X10_TEMP19 = true;
		return X10_TEMP19;
	}

	public static int Util_log2(final int a_int) {
		final double X10_TEMP4 = Math.log(a_int);
		final int X10_TEMP3 = 2;
		final double X10_TEMP5 = Math.log(X10_TEMP3);
		final double X10_TEMP7 = X10_TEMP4 / X10_TEMP5;
		final int X10_TEMP9 = (int) X10_TEMP7;
		return X10_TEMP9;
	}

	public static int Util_pow2(final int a_int) {
		final int X10_TEMP3 = 2;
		final double X10_TEMP4 = Math.pow(X10_TEMP3, a_int);
		final int X10_TEMP6 = (int) X10_TEMP4;
		return X10_TEMP6;
	}

	public static Region3 Util_boundary(final Region3 a_R,
			final int a_direction, final int a_padSize0, final int a_padSize1,
			final int a_padSize2) {
		final int X10_TEMP2 = Math.abs(a_direction);
		int i = (int) X10_TEMP2;
		final int X10_TEMP4 = 0;
		final boolean X10_TEMP6 = a_direction > X10_TEMP4;
		boolean IsHigh = X10_TEMP6;
		final int X10_TEMP9 = 0;
		final int X10_TEMP11 = 3;
		final boolean X10_TEMP10 = X10_TEMP9 >= X10_TEMP11;
		if (X10_TEMP10) {
			final String X10_TEMP12 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP13 = ", expected 3";
			String X10_TEMP14 = X10_TEMP12 + X10_TEMP9;
			X10_TEMP14 = X10_TEMP14 + X10_TEMP13;
			throw new RuntimeException(X10_TEMP14);
		}
		final int X10_TEMP15 = 0;
		final int X10_TEMP16 = 1;
		final int X10_TEMP18 = X10_TEMP15 - X10_TEMP16;
		Region1 X10_TEMP17 = Program.createNewRegion1R(X10_TEMP15, X10_TEMP18);
		final int X10_TEMP19 = 0;
		final boolean X10_TEMP22 = X10_TEMP9 == X10_TEMP19;
		final int X10_TEMP20 = 1;
		final boolean X10_TEMP23 = X10_TEMP9 == X10_TEMP20;
		final int X10_TEMP21 = 2;
		final boolean X10_TEMP24 = X10_TEMP9 == X10_TEMP21;
		final int RX10_TEMP4 = 1;
		int RX10_TEMP2 = a_R.regSize;
		RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP3; SX10_TEMP1++) {
			final int RX10_TEMP0 = SX10_TEMP1;
			final int RX10_TEMP5 = RX10_TEMP0;
			final Point3 RX10_TEMP1 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP5);
			final int X10_TEMP25 = RX10_TEMP1.f0;
			final int X10_TEMP26 = RX10_TEMP1.f1;
			final int X10_TEMP27 = RX10_TEMP1.f2;
			if (X10_TEMP22) {
				final Region1 X10_TEMP28 = Program.createNewRegion1R(
						X10_TEMP25, X10_TEMP25);
				X10_TEMP17 = Program.unionRegion1(X10_TEMP17, X10_TEMP28);
			} else {
				if (X10_TEMP23) {
					final Region1 X10_TEMP28 = Program.createNewRegion1R(
							X10_TEMP26, X10_TEMP26);
					X10_TEMP17 = Program.unionRegion1(X10_TEMP17, X10_TEMP28);
				} else {
					if (X10_TEMP24) {
						final Region1 X10_TEMP28 = Program.createNewRegion1R(
								X10_TEMP27, X10_TEMP27);
						X10_TEMP17 = Program.unionRegion1(X10_TEMP17,
								X10_TEMP28);
					}
				}
			}
		}
		final Region1 X10_TEMP29 = X10_TEMP17;
		final int RX10_TEMP6 = X10_TEMP29.regSize;
		final int RX10_TEMP7 = 0;
		final boolean RX10_TEMP8 = RX10_TEMP6 <= RX10_TEMP7;
		if (RX10_TEMP8) {
			final String RX10_TEMP9 = "Operation low() not defined on empty region X10_TEMP29";
			throw new RuntimeException(RX10_TEMP9);
		}
		int low0 = Program.regionLow(X10_TEMP29);
		final int X10_TEMP32 = 1;
		final int X10_TEMP34 = 3;
		final boolean X10_TEMP33 = X10_TEMP32 >= X10_TEMP34;
		if (X10_TEMP33) {
			final String X10_TEMP35 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP36 = ", expected 3";
			String X10_TEMP37 = X10_TEMP35 + X10_TEMP32;
			X10_TEMP37 = X10_TEMP37 + X10_TEMP36;
			throw new RuntimeException(X10_TEMP37);
		}
		final int X10_TEMP38 = 0;
		final int X10_TEMP39 = 1;
		final int X10_TEMP41 = X10_TEMP38 - X10_TEMP39;
		Region1 X10_TEMP40 = Program.createNewRegion1R(X10_TEMP38, X10_TEMP41);
		final int X10_TEMP42 = 0;
		final boolean X10_TEMP45 = X10_TEMP32 == X10_TEMP42;
		final int X10_TEMP43 = 1;
		final boolean X10_TEMP46 = X10_TEMP32 == X10_TEMP43;
		final int X10_TEMP44 = 2;
		final boolean X10_TEMP47 = X10_TEMP32 == X10_TEMP44;
		final int RX10_TEMP14 = 1;
		int RX10_TEMP12 = a_R.regSize;
		RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14;
		final int SX10_TEMP2 = 1;
		final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP2;
		for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP13; SX10_TEMP3++) {
			final int RX10_TEMP10 = SX10_TEMP3;
			final int RX10_TEMP15 = RX10_TEMP10;
			final Point3 RX10_TEMP11 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP15);
			final int X10_TEMP48 = RX10_TEMP11.f0;
			final int X10_TEMP49 = RX10_TEMP11.f1;
			final int X10_TEMP50 = RX10_TEMP11.f2;
			if (X10_TEMP45) {
				final Region1 X10_TEMP51 = Program.createNewRegion1R(
						X10_TEMP48, X10_TEMP48);
				X10_TEMP40 = Program.unionRegion1(X10_TEMP40, X10_TEMP51);
			} else {
				if (X10_TEMP46) {
					final Region1 X10_TEMP51 = Program.createNewRegion1R(
							X10_TEMP49, X10_TEMP49);
					X10_TEMP40 = Program.unionRegion1(X10_TEMP40, X10_TEMP51);
				} else {
					if (X10_TEMP47) {
						final Region1 X10_TEMP51 = Program.createNewRegion1R(
								X10_TEMP50, X10_TEMP50);
						X10_TEMP40 = Program.unionRegion1(X10_TEMP40,
								X10_TEMP51);
					}
				}
			}
		}
		final Region1 X10_TEMP52 = X10_TEMP40;
		final int RX10_TEMP16 = X10_TEMP52.regSize;
		final int RX10_TEMP17 = 0;
		final boolean RX10_TEMP18 = RX10_TEMP16 <= RX10_TEMP17;
		if (RX10_TEMP18) {
			final String RX10_TEMP19 = "Operation low() not defined on empty region X10_TEMP52";
			throw new RuntimeException(RX10_TEMP19);
		}
		int low1 = Program.regionLow(X10_TEMP52);
		final int X10_TEMP55 = 2;
		final int X10_TEMP57 = 3;
		final boolean X10_TEMP56 = X10_TEMP55 >= X10_TEMP57;
		if (X10_TEMP56) {
			final String X10_TEMP58 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP59 = ", expected 3";
			String X10_TEMP60 = X10_TEMP58 + X10_TEMP55;
			X10_TEMP60 = X10_TEMP60 + X10_TEMP59;
			throw new RuntimeException(X10_TEMP60);
		}
		final int X10_TEMP61 = 0;
		final int X10_TEMP62 = 1;
		final int X10_TEMP64 = X10_TEMP61 - X10_TEMP62;
		Region1 X10_TEMP63 = Program.createNewRegion1R(X10_TEMP61, X10_TEMP64);
		final int X10_TEMP65 = 0;
		final boolean X10_TEMP68 = X10_TEMP55 == X10_TEMP65;
		final int X10_TEMP66 = 1;
		final boolean X10_TEMP69 = X10_TEMP55 == X10_TEMP66;
		final int X10_TEMP67 = 2;
		final boolean X10_TEMP70 = X10_TEMP55 == X10_TEMP67;
		final int RX10_TEMP24 = 1;
		int RX10_TEMP22 = a_R.regSize;
		RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24;
		final int SX10_TEMP4 = 1;
		final int RX10_TEMP23 = RX10_TEMP22 + SX10_TEMP4;
		for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP23; SX10_TEMP5++) {
			final int RX10_TEMP20 = SX10_TEMP5;
			final int RX10_TEMP25 = RX10_TEMP20;
			final Point3 RX10_TEMP21 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP25);
			final int X10_TEMP71 = RX10_TEMP21.f0;
			final int X10_TEMP72 = RX10_TEMP21.f1;
			final int X10_TEMP73 = RX10_TEMP21.f2;
			if (X10_TEMP68) {
				final Region1 X10_TEMP74 = Program.createNewRegion1R(
						X10_TEMP71, X10_TEMP71);
				X10_TEMP63 = Program.unionRegion1(X10_TEMP63, X10_TEMP74);
			} else {
				if (X10_TEMP69) {
					final Region1 X10_TEMP74 = Program.createNewRegion1R(
							X10_TEMP72, X10_TEMP72);
					X10_TEMP63 = Program.unionRegion1(X10_TEMP63, X10_TEMP74);
				} else {
					if (X10_TEMP70) {
						final Region1 X10_TEMP74 = Program.createNewRegion1R(
								X10_TEMP73, X10_TEMP73);
						X10_TEMP63 = Program.unionRegion1(X10_TEMP63,
								X10_TEMP74);
					}
				}
			}
		}
		final Region1 X10_TEMP75 = X10_TEMP63;
		final int RX10_TEMP26 = X10_TEMP75.regSize;
		final int RX10_TEMP27 = 0;
		final boolean RX10_TEMP28 = RX10_TEMP26 <= RX10_TEMP27;
		if (RX10_TEMP28) {
			final String RX10_TEMP29 = "Operation low() not defined on empty region X10_TEMP75";
			throw new RuntimeException(RX10_TEMP29);
		}
		int low2 = Program.regionLow(X10_TEMP75);
		final int X10_TEMP78 = 0;
		final int X10_TEMP80 = 3;
		final boolean X10_TEMP79 = X10_TEMP78 >= X10_TEMP80;
		if (X10_TEMP79) {
			final String X10_TEMP81 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP82 = ", expected 3";
			String X10_TEMP83 = X10_TEMP81 + X10_TEMP78;
			X10_TEMP83 = X10_TEMP83 + X10_TEMP82;
			throw new RuntimeException(X10_TEMP83);
		}
		final int X10_TEMP84 = 0;
		final int X10_TEMP85 = 1;
		final int X10_TEMP87 = X10_TEMP84 - X10_TEMP85;
		Region1 X10_TEMP86 = Program.createNewRegion1R(X10_TEMP84, X10_TEMP87);
		final int X10_TEMP88 = 0;
		final boolean X10_TEMP91 = X10_TEMP78 == X10_TEMP88;
		final int X10_TEMP89 = 1;
		final boolean X10_TEMP92 = X10_TEMP78 == X10_TEMP89;
		final int X10_TEMP90 = 2;
		final boolean X10_TEMP93 = X10_TEMP78 == X10_TEMP90;
		final int RX10_TEMP34 = 1;
		int RX10_TEMP32 = a_R.regSize;
		RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34;
		final int SX10_TEMP6 = 1;
		final int RX10_TEMP33 = RX10_TEMP32 + SX10_TEMP6;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP33; SX10_TEMP7++) {
			final int RX10_TEMP30 = SX10_TEMP7;
			final int RX10_TEMP35 = RX10_TEMP30;
			final Point3 RX10_TEMP31 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP35);
			final int X10_TEMP94 = RX10_TEMP31.f0;
			final int X10_TEMP95 = RX10_TEMP31.f1;
			final int X10_TEMP96 = RX10_TEMP31.f2;
			if (X10_TEMP91) {
				final Region1 X10_TEMP97 = Program.createNewRegion1R(
						X10_TEMP94, X10_TEMP94);
				X10_TEMP86 = Program.unionRegion1(X10_TEMP86, X10_TEMP97);
			} else {
				if (X10_TEMP92) {
					final Region1 X10_TEMP97 = Program.createNewRegion1R(
							X10_TEMP95, X10_TEMP95);
					X10_TEMP86 = Program.unionRegion1(X10_TEMP86, X10_TEMP97);
				} else {
					if (X10_TEMP93) {
						final Region1 X10_TEMP97 = Program.createNewRegion1R(
								X10_TEMP96, X10_TEMP96);
						X10_TEMP86 = Program.unionRegion1(X10_TEMP86,
								X10_TEMP97);
					}
				}
			}
		}
		final Region1 X10_TEMP98 = X10_TEMP86;
		final int RX10_TEMP36 = X10_TEMP98.regSize;
		final int RX10_TEMP37 = 0;
		final boolean RX10_TEMP38 = RX10_TEMP36 <= RX10_TEMP37;
		if (RX10_TEMP38) {
			final String RX10_TEMP39 = "Operation high() not defined on empty region X10_TEMP98";
			throw new RuntimeException(RX10_TEMP39);
		}
		int high0 = Program.regionHigh(X10_TEMP98);
		final int X10_TEMP101 = 1;
		final int X10_TEMP103 = 3;
		final boolean X10_TEMP102 = X10_TEMP101 >= X10_TEMP103;
		if (X10_TEMP102) {
			final String X10_TEMP104 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP105 = ", expected 3";
			String X10_TEMP106 = X10_TEMP104 + X10_TEMP101;
			X10_TEMP106 = X10_TEMP106 + X10_TEMP105;
			throw new RuntimeException(X10_TEMP106);
		}
		final int X10_TEMP107 = 0;
		final int X10_TEMP108 = 1;
		final int X10_TEMP110 = X10_TEMP107 - X10_TEMP108;
		Region1 X10_TEMP109 = Program.createNewRegion1R(X10_TEMP107,
				X10_TEMP110);
		final int X10_TEMP111 = 0;
		final boolean X10_TEMP114 = X10_TEMP101 == X10_TEMP111;
		final int X10_TEMP112 = 1;
		final boolean X10_TEMP115 = X10_TEMP101 == X10_TEMP112;
		final int X10_TEMP113 = 2;
		final boolean X10_TEMP116 = X10_TEMP101 == X10_TEMP113;
		final int RX10_TEMP44 = 1;
		int RX10_TEMP42 = a_R.regSize;
		RX10_TEMP42 = RX10_TEMP42 - RX10_TEMP44;
		final int SX10_TEMP8 = 1;
		final int RX10_TEMP43 = RX10_TEMP42 + SX10_TEMP8;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP43; SX10_TEMP9++) {
			final int RX10_TEMP40 = SX10_TEMP9;
			final int RX10_TEMP45 = RX10_TEMP40;
			final Point3 RX10_TEMP41 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP45);
			final int X10_TEMP117 = RX10_TEMP41.f0;
			final int X10_TEMP118 = RX10_TEMP41.f1;
			final int X10_TEMP119 = RX10_TEMP41.f2;
			if (X10_TEMP114) {
				final Region1 X10_TEMP120 = Program.createNewRegion1R(
						X10_TEMP117, X10_TEMP117);
				X10_TEMP109 = Program.unionRegion1(X10_TEMP109, X10_TEMP120);
			} else {
				if (X10_TEMP115) {
					final Region1 X10_TEMP120 = Program.createNewRegion1R(
							X10_TEMP118, X10_TEMP118);
					X10_TEMP109 = Program
							.unionRegion1(X10_TEMP109, X10_TEMP120);
				} else {
					if (X10_TEMP116) {
						final Region1 X10_TEMP120 = Program.createNewRegion1R(
								X10_TEMP119, X10_TEMP119);
						X10_TEMP109 = Program.unionRegion1(X10_TEMP109,
								X10_TEMP120);
					}
				}
			}
		}
		final Region1 X10_TEMP121 = X10_TEMP109;
		final int RX10_TEMP46 = X10_TEMP121.regSize;
		final int RX10_TEMP47 = 0;
		final boolean RX10_TEMP48 = RX10_TEMP46 <= RX10_TEMP47;
		if (RX10_TEMP48) {
			final String RX10_TEMP49 = "Operation high() not defined on empty region X10_TEMP121";
			throw new RuntimeException(RX10_TEMP49);
		}
		int high1 = Program.regionHigh(X10_TEMP121);
		final int X10_TEMP124 = 2;
		final int X10_TEMP126 = 3;
		final boolean X10_TEMP125 = X10_TEMP124 >= X10_TEMP126;
		if (X10_TEMP125) {
			final String X10_TEMP127 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP128 = ", expected 3";
			String X10_TEMP129 = X10_TEMP127 + X10_TEMP124;
			X10_TEMP129 = X10_TEMP129 + X10_TEMP128;
			throw new RuntimeException(X10_TEMP129);
		}
		final int X10_TEMP130 = 0;
		final int X10_TEMP131 = 1;
		final int X10_TEMP133 = X10_TEMP130 - X10_TEMP131;
		Region1 X10_TEMP132 = Program.createNewRegion1R(X10_TEMP130,
				X10_TEMP133);
		final int X10_TEMP134 = 0;
		final boolean X10_TEMP137 = X10_TEMP124 == X10_TEMP134;
		final int X10_TEMP135 = 1;
		final boolean X10_TEMP138 = X10_TEMP124 == X10_TEMP135;
		final int X10_TEMP136 = 2;
		final boolean X10_TEMP139 = X10_TEMP124 == X10_TEMP136;
		final int RX10_TEMP54 = 1;
		int RX10_TEMP52 = a_R.regSize;
		RX10_TEMP52 = RX10_TEMP52 - RX10_TEMP54;
		final int SX10_TEMP10 = 1;
		final int RX10_TEMP53 = RX10_TEMP52 + SX10_TEMP10;
		for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP53; SX10_TEMP11++) {
			final int RX10_TEMP50 = SX10_TEMP11;
			final int RX10_TEMP55 = RX10_TEMP50;
			final Point3 RX10_TEMP51 = Program.regionOrdinalPoint3(a_R,
					RX10_TEMP55);
			final int X10_TEMP140 = RX10_TEMP51.f0;
			final int X10_TEMP141 = RX10_TEMP51.f1;
			final int X10_TEMP142 = RX10_TEMP51.f2;
			if (X10_TEMP137) {
				final Region1 X10_TEMP143 = Program.createNewRegion1R(
						X10_TEMP140, X10_TEMP140);
				X10_TEMP132 = Program.unionRegion1(X10_TEMP132, X10_TEMP143);
			} else {
				if (X10_TEMP138) {
					final Region1 X10_TEMP143 = Program.createNewRegion1R(
							X10_TEMP141, X10_TEMP141);
					X10_TEMP132 = Program
							.unionRegion1(X10_TEMP132, X10_TEMP143);
				} else {
					if (X10_TEMP139) {
						final Region1 X10_TEMP143 = Program.createNewRegion1R(
								X10_TEMP142, X10_TEMP142);
						X10_TEMP132 = Program.unionRegion1(X10_TEMP132,
								X10_TEMP143);
					}
				}
			}
		}
		final Region1 X10_TEMP144 = X10_TEMP132;
		final int RX10_TEMP56 = X10_TEMP144.regSize;
		final int RX10_TEMP57 = 0;
		final boolean RX10_TEMP58 = RX10_TEMP56 <= RX10_TEMP57;
		if (RX10_TEMP58) {
			final String RX10_TEMP59 = "Operation high() not defined on empty region X10_TEMP144";
			throw new RuntimeException(RX10_TEMP59);
		}
		int high2 = Program.regionHigh(X10_TEMP144);
		int r = 3;
		final boolean X10_TEMP148 = i <= r;
		final int X10_TEMP147 = 3;
		final boolean X10_TEMP149 = r == X10_TEMP147;
		final boolean X10_TEMP151 = X10_TEMP148 && X10_TEMP149;
		if (X10_TEMP151) {
			if (IsHigh) {
				final int X10_TEMP153 = 1;
				final boolean X10_TEMP154 = i == X10_TEMP153;
				final int X10_TEMP155 = 1;
				int X10_TEMP158 = low0;
				if (X10_TEMP154) {
					X10_TEMP158 = high0 + X10_TEMP155;
				}
				final int X10_TEMP159 = X10_TEMP158;
				final int X10_TEMP160 = X10_TEMP159;
				final int X10_TEMP171 = X10_TEMP160 - a_padSize0;
				final int X10_TEMP162 = 1;
				final boolean X10_TEMP163 = i == X10_TEMP162;
				final int X10_TEMP164 = 1;
				int X10_TEMP167 = high0;
				if (X10_TEMP163) {
					X10_TEMP167 = high0 + X10_TEMP164;
				}
				final int X10_TEMP168 = X10_TEMP167;
				final int X10_TEMP169 = X10_TEMP168;
				final int X10_TEMP172 = X10_TEMP169 + a_padSize0;
				final int X10_TEMP173 = 2;
				final boolean X10_TEMP174 = i == X10_TEMP173;
				final int X10_TEMP175 = 1;
				int X10_TEMP178 = low1;
				if (X10_TEMP174) {
					X10_TEMP178 = high1 + X10_TEMP175;
				}
				final int X10_TEMP179 = X10_TEMP178;
				final int X10_TEMP180 = X10_TEMP179;
				final int X10_TEMP191 = X10_TEMP180 - a_padSize1;
				final int X10_TEMP182 = 2;
				final boolean X10_TEMP183 = i == X10_TEMP182;
				final int X10_TEMP184 = 1;
				int X10_TEMP187 = high1;
				if (X10_TEMP183) {
					X10_TEMP187 = high1 + X10_TEMP184;
				}
				final int X10_TEMP188 = X10_TEMP187;
				final int X10_TEMP189 = X10_TEMP188;
				final int X10_TEMP192 = X10_TEMP189 + a_padSize1;
				final int X10_TEMP193 = 3;
				final boolean X10_TEMP194 = i == X10_TEMP193;
				final int X10_TEMP195 = 1;
				int X10_TEMP198 = low2;
				if (X10_TEMP194) {
					X10_TEMP198 = high2 + X10_TEMP195;
				}
				final int X10_TEMP199 = X10_TEMP198;
				final int X10_TEMP200 = X10_TEMP199;
				final int X10_TEMP211 = X10_TEMP200 - a_padSize2;
				final int X10_TEMP202 = 3;
				final boolean X10_TEMP203 = i == X10_TEMP202;
				final int X10_TEMP204 = 1;
				int X10_TEMP207 = high2;
				if (X10_TEMP203) {
					X10_TEMP207 = high2 + X10_TEMP204;
				}
				final int X10_TEMP208 = X10_TEMP207;
				final int X10_TEMP209 = X10_TEMP208;
				final int X10_TEMP212 = X10_TEMP209 + a_padSize2;
				final Region3 X10_TEMP214 = Program.createNewRegion3RRR(
						X10_TEMP171, X10_TEMP172, X10_TEMP191, X10_TEMP192,
						X10_TEMP211, X10_TEMP212);
				return X10_TEMP214;
			} else {
				final int X10_TEMP215 = 1;
				final boolean X10_TEMP216 = i == X10_TEMP215;
				final int X10_TEMP217 = 1;
				int X10_TEMP220 = low0;
				if (X10_TEMP216) {
					X10_TEMP220 = low0 - X10_TEMP217;
				}
				final int X10_TEMP221 = X10_TEMP220;
				final int X10_TEMP222 = X10_TEMP221;
				final int X10_TEMP233 = X10_TEMP222 - a_padSize0;
				final int X10_TEMP224 = 1;
				final boolean X10_TEMP225 = i == X10_TEMP224;
				final int X10_TEMP226 = 1;
				int X10_TEMP229 = high0;
				if (X10_TEMP225) {
					X10_TEMP229 = low0 - X10_TEMP226;
				}
				final int X10_TEMP230 = X10_TEMP229;
				final int X10_TEMP231 = X10_TEMP230;
				final int X10_TEMP234 = X10_TEMP231 + a_padSize0;
				final int X10_TEMP235 = 2;
				final boolean X10_TEMP236 = i == X10_TEMP235;
				final int X10_TEMP237 = 1;
				int X10_TEMP240 = low1;
				if (X10_TEMP236) {
					X10_TEMP240 = low1 - X10_TEMP237;
				}
				final int X10_TEMP241 = X10_TEMP240;
				final int X10_TEMP242 = X10_TEMP241;
				final int X10_TEMP253 = X10_TEMP242 - a_padSize1;
				final int X10_TEMP244 = 2;
				final boolean X10_TEMP245 = i == X10_TEMP244;
				final int X10_TEMP246 = 1;
				int X10_TEMP249 = high1;
				if (X10_TEMP245) {
					X10_TEMP249 = low1 - X10_TEMP246;
				}
				final int X10_TEMP250 = X10_TEMP249;
				final int X10_TEMP251 = X10_TEMP250;
				final int X10_TEMP254 = X10_TEMP251 + a_padSize1;
				final int X10_TEMP255 = 3;
				final boolean X10_TEMP256 = i == X10_TEMP255;
				final int X10_TEMP257 = 1;
				int X10_TEMP260 = low2;
				if (X10_TEMP256) {
					X10_TEMP260 = low2 - X10_TEMP257;
				}
				final int X10_TEMP261 = X10_TEMP260;
				final int X10_TEMP262 = X10_TEMP261;
				final int X10_TEMP273 = X10_TEMP262 - a_padSize2;
				final int X10_TEMP264 = 3;
				final boolean X10_TEMP265 = i == X10_TEMP264;
				final int X10_TEMP266 = 1;
				int X10_TEMP269 = high2;
				if (X10_TEMP265) {
					X10_TEMP269 = low2 - X10_TEMP266;
				}
				final int X10_TEMP270 = X10_TEMP269;
				final int X10_TEMP271 = X10_TEMP270;
				final int X10_TEMP274 = X10_TEMP271 + a_padSize2;
				final Region3 X10_TEMP276 = Program.createNewRegion3RRR(
						X10_TEMP233, X10_TEMP234, X10_TEMP253, X10_TEMP254,
						X10_TEMP273, X10_TEMP274);
				return X10_TEMP276;
			}
		} else {
			final String X10_TEMP278 = "MG3TongValue1.boundary():Warning! invalid inputs!";
			System.out.println(X10_TEMP278);
			final int X10_TEMP283 = 0;
			final int X10_TEMP280 = 1;
			final int X10_TEMP281 = 0;
			final int X10_TEMP284 = X10_TEMP281 - X10_TEMP280;
			final int X10_TEMP289 = 0;
			final int X10_TEMP286 = 1;
			final int X10_TEMP287 = 0;
			final int X10_TEMP290 = X10_TEMP287 - X10_TEMP286;
			final int X10_TEMP295 = 0;
			final int X10_TEMP292 = 1;
			final int X10_TEMP293 = 0;
			final int X10_TEMP296 = X10_TEMP293 - X10_TEMP292;
			final Region3 X10_TEMP298 = Program.createNewRegion3RRR(
					X10_TEMP283, X10_TEMP284, X10_TEMP289, X10_TEMP290,
					X10_TEMP295, X10_TEMP296);
			return X10_TEMP298;
		}
	}

	public static void Util_arraycopy3(final doubleRefArray3 a_dest,
			final Region3 a_destR, final doubleRefArray3 a_src) {
		final int RX10_TEMP3 = 1;
		int RX10_TEMP1 = a_destR.regSize;
		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP2 = RX10_TEMP1 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP2; SX10_TEMP1++) {
			final int RX10_TEMP0 = SX10_TEMP1;
			final int RX10_TEMP4 = RX10_TEMP0;
			final Point3 p = Program.regionOrdinalPoint3(a_destR, RX10_TEMP4);
			final int h = /* here */0;
			final Dist3 RX10_TEMP5 = a_src.distValue;
			final Dist3 X10_TEMP3 = RX10_TEMP5;
			final Region3 RX10_TEMP6 = X10_TEMP3.dReg;
			final int RX10_TEMP7 = Program.searchPointInRegion3(RX10_TEMP6, p);
			final int RX10_TEMP8 = 0;
			final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8;
			if (RX10_TEMP9) {
				final String RX10_TEMP10 = "Point p not found in the distribution X10_TEMP3.";
				throw new RuntimeException(RX10_TEMP10);
			}
			final int RX10_TEMP11 = Program.getPlaceFromDist3(X10_TEMP3,
					RX10_TEMP7);
			final int X10_TEMP6 = RX10_TEMP11; /* async ( X10_TEMP6 ) */
			{
				final Dist3 RX10_TEMP12 = a_src.distValue;
				final Region3 RX10_TEMP13 = RX10_TEMP12.dReg;
				final int RX10_TEMP14 = Program.searchPointInRegion3(
						RX10_TEMP13, p);
				final int RX10_TEMP15 = 0;
				final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15;
				if (RX10_TEMP16) {
					String RX10_TEMP17 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP17);
				}
				final int RX10_TEMP18 = Program.getPlaceFromDist3(RX10_TEMP12,
						RX10_TEMP14);
				final int RX10_TEMP20 = /* here */0;
				final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20;
				if (RX10_TEMP21) {
					String RX10_TEMP19 = "Bad place access for array a_src";
					throw new RuntimeException(RX10_TEMP19);
				}
				final double RX10_TEMP22 = Program.getRefArrayValue3double(
						a_src, RX10_TEMP14);
				final double d = RX10_TEMP22; /* async ( h ) */
				{
					final double X10_TEMP13 = d;
					final Dist3 RX10_TEMP23 = a_dest.distValue;
					final Region3 RX10_TEMP24 = RX10_TEMP23.dReg;
					final int RX10_TEMP25 = Program.searchPointInRegion3(
							RX10_TEMP24, p);
					final int RX10_TEMP26 = 0;
					final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26;
					if (RX10_TEMP27) {
						String RX10_TEMP28 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP28);
					}
					final int RX10_TEMP29 = Program.getPlaceFromDist3(
							RX10_TEMP23, RX10_TEMP25);
					final int RX10_TEMP31 = /* here */0;
					final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31;
					if (RX10_TEMP32) {
						String RX10_TEMP30 = "Bad place access for array a_dest";
						throw new RuntimeException(RX10_TEMP30);
					}
					Program.setRefArrayValue3double(a_dest, RX10_TEMP25,
							X10_TEMP13);
				}
			}
		}
	}

	public static void Util_arraycopy4(final doubleRefArray3 a_dest,
			final Region3 a_destR, final doubleRefArray3 a_src,
			final int a_trans0, final int a_trans1, final int a_trans2) {
		final int RX10_TEMP3 = 1;
		int RX10_TEMP1 = a_destR.regSize;
		RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP2 = RX10_TEMP1 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP2; SX10_TEMP1++) {
			final int RX10_TEMP0 = SX10_TEMP1;
			final int RX10_TEMP4 = RX10_TEMP0;
			final Point3 p = Program.regionOrdinalPoint3(a_destR, RX10_TEMP4);
			final int h = /* here */0;
			final Dist3 RX10_TEMP5 = a_src.distValue;
			final Dist3 X10_TEMP3 = RX10_TEMP5;
			int RX10_TEMP6 = p.f0;
			int RX10_TEMP7 = p.f1;
			int RX10_TEMP8 = p.f2;
			RX10_TEMP6 = RX10_TEMP6 + a_trans0;
			RX10_TEMP7 = RX10_TEMP7 + a_trans1;
			RX10_TEMP8 = RX10_TEMP8 + a_trans2;
			Point3 X10_TEMP8 = new Point3(RX10_TEMP6, RX10_TEMP7, RX10_TEMP8);
			final Region3 RX10_TEMP9 = X10_TEMP3.dReg;
			final int RX10_TEMP10 = Program.searchPointInRegion3(RX10_TEMP9,
					X10_TEMP8);
			final int RX10_TEMP11 = 0;
			final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11;
			if (RX10_TEMP12) {
				final String RX10_TEMP13 = "Point X10_TEMP8 not found in the distribution X10_TEMP3.";
				throw new RuntimeException(RX10_TEMP13);
			}
			final int RX10_TEMP14 = Program.getPlaceFromDist3(X10_TEMP3,
					RX10_TEMP10);
			final int X10_TEMP10 = RX10_TEMP14; /* async ( X10_TEMP10 ) */
			{
				int RX10_TEMP15 = p.f0;
				int RX10_TEMP16 = p.f1;
				int RX10_TEMP17 = p.f2;
				RX10_TEMP15 = RX10_TEMP15 + a_trans0;
				RX10_TEMP16 = RX10_TEMP16 + a_trans1;
				RX10_TEMP17 = RX10_TEMP17 + a_trans2;
				final Point3 X10_TEMP15 = new Point3(RX10_TEMP15, RX10_TEMP16,
						RX10_TEMP17);
				final Dist3 RX10_TEMP18 = a_src.distValue;
				final Region3 RX10_TEMP19 = RX10_TEMP18.dReg;
				final int RX10_TEMP20 = Program.searchPointInRegion3(
						RX10_TEMP19, X10_TEMP15);
				final int RX10_TEMP21 = 0;
				final boolean RX10_TEMP22 = RX10_TEMP20 < RX10_TEMP21;
				if (RX10_TEMP22) {
					String RX10_TEMP23 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP23);
				}
				final int RX10_TEMP24 = Program.getPlaceFromDist3(RX10_TEMP18,
						RX10_TEMP20);
				final int RX10_TEMP26 = /* here */0;
				final boolean RX10_TEMP27 = RX10_TEMP24 != RX10_TEMP26;
				if (RX10_TEMP27) {
					String RX10_TEMP25 = "Bad place access for array a_src";
					throw new RuntimeException(RX10_TEMP25);
				}
				final double RX10_TEMP28 = Program.getRefArrayValue3double(
						a_src, RX10_TEMP20);
				final double d = RX10_TEMP28; /* async ( h ) */
				{
					final double X10_TEMP21 = d;
					final Dist3 RX10_TEMP29 = a_dest.distValue;
					final Region3 RX10_TEMP30 = RX10_TEMP29.dReg;
					final int RX10_TEMP31 = Program.searchPointInRegion3(
							RX10_TEMP30, p);
					final int RX10_TEMP32 = 0;
					final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32;
					if (RX10_TEMP33) {
						String RX10_TEMP34 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP34);
					}
					final int RX10_TEMP35 = Program.getPlaceFromDist3(
							RX10_TEMP29, RX10_TEMP31);
					final int RX10_TEMP37 = /* here */0;
					final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37;
					if (RX10_TEMP38) {
						String RX10_TEMP36 = "Bad place access for array a_dest";
						throw new RuntimeException(RX10_TEMP36);
					}
					Program.setRefArrayValue3double(a_dest, RX10_TEMP31,
							X10_TEMP21);
				}
			}
		}
	}

	public static String Wrapper_toString(final Wrapper X10_TEMP0) {
		final String X10_TEMP2 = "";
		return X10_TEMP2;
	}

	public static double doublerefArraySum1(final doubleRefArray1 sumArray) {
		final int maxPlaces = /* place.MAX_PLACES */1;
		final int one = 1;
		final int zero = 0;
		final int maxPlacesMinusOne = maxPlaces - one;
		final Region1 dReg = Program.createNewRegion1R(zero, maxPlacesMinusOne);
		final int source = /* here */0;
		final Dist1 dSum = Program.getPlaceDist1(dReg, source);
		final double initVal = 0;
		final Region1 RX10_TEMP0 = dSum.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(dSum,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP4;
					final double[] SX10_TEMP5 = new double[RX10_TEMP14];
					final int SX10_TEMP7 = SX10_TEMP5.length;
					for (int SX10_TEMP6 = 0; SX10_TEMP6 < SX10_TEMP7; SX10_TEMP6++) {
						final int RX10_TEMP13 = SX10_TEMP6;
						SX10_TEMP5[RX10_TEMP13] = initVal;
					}
					final double[] RX10_TEMP15 = SX10_TEMP5;
					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP8 = new doubleStub[RX10_TEMP4];
		final int SX10_TEMP10 = SX10_TEMP8.length;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < SX10_TEMP10; SX10_TEMP9++) {
			final int RX10_TEMP19 = SX10_TEMP9;
			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			SX10_TEMP8[RX10_TEMP19] = RX10_TEMP18;
		}
		final doubleStub[] RX10_TEMP17 = SX10_TEMP8;
		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(dSum,
				RX10_TEMP17);
		final doubleRefArray1 localSumArray = RX10_TEMP20;
		final Dist1 dUnique = Program.UniqueDistribution; /* finish */
		{
			final Region1 RX10_TEMP22 = dUnique.dReg;
			final int RX10_TEMP25 = 1;
			int RX10_TEMP23 = RX10_TEMP22.regSize;
			RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25;
			final int SX10_TEMP11 = 1;
			final int RX10_TEMP24 = RX10_TEMP23 + SX10_TEMP11;
			for (int SX10_TEMP12 = 0; SX10_TEMP12 < RX10_TEMP24; SX10_TEMP12++) {
				final int RX10_TEMP21 = SX10_TEMP12;
				final int RX10_TEMP26 = RX10_TEMP21;
				final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP22,
						RX10_TEMP26);
				final Region1 RX10_TEMP27 = dUnique.dReg;
				final int RX10_TEMP28 = Program.searchPointInRegion1(
						RX10_TEMP27, p);
				final int RX10_TEMP29 = 0;
				final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29;
				if (RX10_TEMP30) {
					final String RX10_TEMP31 = "Point p not found in the distribution dUnique.";
					throw new RuntimeException(RX10_TEMP31);
				}
				final int RX10_TEMP32 = Program.getPlaceFromDist1(dUnique,
						RX10_TEMP28);
				final int nthPlace = RX10_TEMP32; /* async ( nthPlace ) */
				{
					double localSumTemp = 0;
					final int thisPlace = /* here */0;
					final Dist1 RX10_TEMP33 = sumArray.distValue;
					final Dist1 sumArrayDist = RX10_TEMP33;
					final Dist1 sumArrayDistHere = Program.restrictDist1(
							sumArrayDist, thisPlace);
					final Region1 RX10_TEMP35 = sumArrayDistHere.dReg;
					final int RX10_TEMP38 = 1;
					int RX10_TEMP36 = RX10_TEMP35.regSize;
					RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38;
					final int SX10_TEMP13 = 1;
					final int RX10_TEMP37 = RX10_TEMP36 + SX10_TEMP13;
					for (int SX10_TEMP14 = 0; SX10_TEMP14 < RX10_TEMP37; SX10_TEMP14++) {
						final int RX10_TEMP34 = SX10_TEMP14;
						final int RX10_TEMP39 = RX10_TEMP34;
						final Point1 pt = Program.regionOrdinalPoint1(
								RX10_TEMP35, RX10_TEMP39);
						final Dist1 RX10_TEMP40 = sumArray.distValue;
						final Region1 RX10_TEMP41 = RX10_TEMP40.dReg;
						final int RX10_TEMP42 = Program.searchPointInRegion1(
								RX10_TEMP41, pt);
						final int RX10_TEMP43 = 0;
						final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43;
						if (RX10_TEMP44) {
							String RX10_TEMP45 = "Array access index out of bounds";
							throw new RuntimeException(RX10_TEMP45);
						}
						final int RX10_TEMP46 = Program.getPlaceFromDist1(
								RX10_TEMP40, RX10_TEMP42);
						final int RX10_TEMP48 = /* here */0;
						final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48;
						if (RX10_TEMP49) {
							String RX10_TEMP47 = "Bad place access for array sumArray";
							throw new RuntimeException(RX10_TEMP47);
						}
						final double RX10_TEMP50 = Program
								.getRefArrayValue1double(sumArray, RX10_TEMP42);
						final double localSumCurr = RX10_TEMP50;
						localSumTemp = localSumTemp + localSumCurr;
					}
					final boolean isNotEqual = localSumTemp != zero;
					if (isNotEqual) {
						final int index = /* thisPlace . id */0;
						final double localSum = localSumTemp; /* async ( source ) */
						{
							final Point1 RX10_TEMP51 = new Point1(index);
							final Dist1 RX10_TEMP52 = localSumArray.distValue;
							final Region1 RX10_TEMP53 = RX10_TEMP52.dReg;
							final int RX10_TEMP54 = Program
									.searchPointInRegion1(RX10_TEMP53,
											RX10_TEMP51);
							final int RX10_TEMP55 = 0;
							final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55;
							if (RX10_TEMP56) {
								String RX10_TEMP57 = "Array index out of bounds";
								throw new RuntimeException(RX10_TEMP57);
							}
							final int RX10_TEMP58 = Program.getPlaceFromDist1(
									RX10_TEMP52, RX10_TEMP54);
							final int RX10_TEMP60 = /* here */0;
							final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60;
							if (RX10_TEMP61) {
								String RX10_TEMP59 = "Bad place access for array localSumArray";
								throw new RuntimeException(RX10_TEMP59);
							}
							Program.setRefArrayValue1double(localSumArray,
									RX10_TEMP54, localSum);
						}
					}
				}
			}
		}
		double globalSum = 0;
		final Dist1 RX10_TEMP63 = localSumArray.distValue;
		final Region1 RX10_TEMP64 = RX10_TEMP63.dReg;
		final int RX10_TEMP67 = 1;
		int RX10_TEMP65 = RX10_TEMP64.regSize;
		RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67;
		final int SX10_TEMP15 = 1;
		final int RX10_TEMP66 = RX10_TEMP65 + SX10_TEMP15;
		for (int SX10_TEMP16 = 0; SX10_TEMP16 < RX10_TEMP66; SX10_TEMP16++) {
			final int RX10_TEMP62 = SX10_TEMP16;
			final int RX10_TEMP68 = RX10_TEMP62;
			final Point1 p = Program.regionOrdinalPoint1(RX10_TEMP64,
					RX10_TEMP68);
			final Dist1 RX10_TEMP69 = localSumArray.distValue;
			final Region1 RX10_TEMP70 = RX10_TEMP69.dReg;
			final int RX10_TEMP71 = Program
					.searchPointInRegion1(RX10_TEMP70, p);
			final int RX10_TEMP72 = 0;
			final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72;
			if (RX10_TEMP73) {
				String RX10_TEMP74 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP74);
			}
			final int RX10_TEMP75 = Program.getPlaceFromDist1(RX10_TEMP69,
					RX10_TEMP71);
			final int RX10_TEMP77 = /* here */0;
			final boolean RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77;
			if (RX10_TEMP78) {
				String RX10_TEMP76 = "Bad place access for array localSumArray";
				throw new RuntimeException(RX10_TEMP76);
			}
			final double RX10_TEMP79 = Program.getRefArrayValue1double(
					localSumArray, RX10_TEMP71);
			final double localSumCurr = RX10_TEMP79;
			globalSum = globalSum + localSumCurr;
		}
		return globalSum;
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
		if (outRegion) {
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

	public static int constantSearchRegion3(final Region3 r, final Point3 target) {
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
		final int dim2 = r.dim2;
		final int low2 = r.low2;
		final int high2 = low2 + dim2;
		int pt2 = target.f2;
		final boolean lbound2 = pt2 < low2;
		final boolean hbound2 = pt2 >= high2;
		final int dim3 = 1;
		boolean outRegion = false;
		outRegion = outRegion || lbound0;
		outRegion = outRegion || hbound0;
		outRegion = outRegion || lbound1;
		outRegion = outRegion || hbound1;
		outRegion = outRegion || lbound2;
		outRegion = outRegion || hbound2;
		if (outRegion) {
			int notFound = 0;
			notFound = notFound - one;
			return notFound;
		}
		final int stride3 = 1;
		final int stride2 = stride3 * dim3;
		final int stride1 = stride2 * dim2;
		final int stride0 = stride1 * dim1;
		pt0 = pt0 - low0;
		final int offset0 = stride0 * pt0;
		pt1 = pt1 - low1;
		final int offset1 = stride1 * pt1;
		pt2 = pt2 - low2;
		final int offset2 = stride2 * pt2;
		int found = 0;
		found = found + offset0;
		found = found + offset1;
		found = found + offset2;
		return found;
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
		if (outRegion) {
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

	public static LevelData getRefArrayValue1LevelData(
			final LevelDataRefArray1 array, final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final LevelDataStub[] contents = array.contents;
		final LevelDataStub indexStub = contents[placeIndex];
		final LevelData[] localArray = indexStub.localArray;
		final LevelData returnValue = localArray[localIndex];
		return returnValue;
	}

	public static String toStringPoint3(final Point3 p) {
		String str = "";
		final int f0 = p.f0;
		final int f1 = p.f1;
		final int f2 = p.f2;
		String lSq = "[";
		String comma = ",";
		String rSq = "]";
		str = str + lSq;
		str = str + f0;
		str = str + comma;
		str = str + f1;
		str = str + comma;
		str = str + f2;
		str = str + rSq;
		return str;
	}

	public static void setRefArrayValue1double(final doubleRefArray1 array,
			final int index, final double val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub[] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static int getPlaceFromDist3(final Dist3 dn, final int index) {
		final Dist d = dn.dDist;
		final int[] placeArray = d.placeArray;
		final int retPlace = placeArray[index];
		return retPlace;
	}

	public static int getPlaceFromDist1(final Dist1 dn, final int index) {
		final Dist d = dn.dDist;
		final int[] placeArray = d.placeArray;
		final int retPlace = placeArray[index];
		return retPlace;
	}

	public static int getPlaceFromDist2(final Dist2 dn, final int index) {
		final Dist d = dn.dDist;
		final int[] placeArray = d.placeArray;
		final int retPlace = placeArray[index];
		return retPlace;
	}

	public static void setRefArrayValue1Region3(final Region3RefArray1 array,
			final int index, final Region3 val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Region3Stub[] contents = array.contents;
		final Region3Stub indexStub = contents[placeIndex];
		final Region3[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static int regionLow(final Region1 r) {
		final int index = 0;
		final Point1[] array = r.pointArray;
		final Point1 lowPoint = array[index];
		final int lw = lowPoint.f0;
		return lw;
	}

	public static double getRefArrayValue1double(final doubleRefArray1 array,
			final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub[] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[] localArray = indexStub.localArray;
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static Dist1 restrictDist1(final Dist1 d, final int p) {
		final int zero = 0;
		final int one = 1;
		final int h = /* here */0;
		final Region1 dReg = d.dReg;
		final Dist dDist = d.dDist;
		final int dim = dReg.regSize;
		final int dimMinusOne = dim - one;
		final int SX10_TEMP0 = 1;
		final int dRegReg = dimMinusOne + SX10_TEMP0;
		final Point1[] dArray = dReg.pointArray;
		final int[] dPlace = dDist.placeArray;
		final int[] dCounts = dDist.counts;
		final int index = /* p . id */0;
		int numPoints = dCounts[index];
		final int rSizeNumPoints = numPoints;
		final int rSize = numPoints - one;
		final int SX10_TEMP1 = 1;
		final int tempReg = rSize + SX10_TEMP1;
		final int SX10_TEMP2 = 1;
		final int tempDist = rSize + SX10_TEMP2;
		final int[] SX10_TEMP3 = new int[tempReg];
		final int SX10_TEMP5 = SX10_TEMP3.length;
		for (int SX10_TEMP4 = 0; SX10_TEMP4 < SX10_TEMP5; SX10_TEMP4++) {
			final int pt = SX10_TEMP4;
			SX10_TEMP3[pt] = p;
		}
		final int[] rPlace = SX10_TEMP3;
		final int[] tempArray = new int[tempDist];
		final boolean cond1 = numPoints > zero;
		if (cond1) {
			numPoints = 0;
			for (int SX10_TEMP7 = 0; SX10_TEMP7 < dRegReg; SX10_TEMP7++) {
				final int pt = SX10_TEMP7;
				final int dP = dPlace[pt];
				final boolean cond2 = p == dP;
				if (cond2) {
					final int i = pt;
					tempArray[numPoints] = i;
					numPoints = numPoints + one;
				}
			}
		}
		final Point1[] SX10_TEMP8 = new Point1[tempReg];
		final int SX10_TEMP10 = SX10_TEMP8.length;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < SX10_TEMP10; SX10_TEMP9++) {
			final int pt = SX10_TEMP9;
			final int idx = tempArray[pt];
			final Point1 dpt = dArray[idx];
			SX10_TEMP8[pt] = dpt;
		}
		final Point1[] pointArray = SX10_TEMP8;
		final Region1 dpReg = new Region1(pointArray);
		final Dist dpDist = new Dist(rPlace, rSizeNumPoints);
		final Dist1 dpDistn = new Dist1(dpReg, dpDist);
		return dpDistn;
	}

	public static Region1 unionRegion1(final Region1 reg1, final Region1 reg2) {
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		final Point1[] arr1 = reg1.pointArray;
		final Point1[] arr2 = reg2.pointArray;
		final int size1 = reg1.regSize;
		final int size2 = reg2.regSize;
		boolean cond1 = index1 < size1;
		boolean cond2 = index2 < size2;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		boolean cond = cond1 && cond2;
		while (cond) {
			final Point1 p1 = arr1[index1];
			final Point1 p2 = arr2[index2];
			final int pointCompare = Program.comparePoint1(p1, p2);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			final boolean gt = pointCompare == two;
			if (eq) {
				index1 = index1 + one;
				index2 = index2 + one;
			}
			if (lt) {
				index1 = index1 + one;
			}
			if (gt) {
				index2 = index2 + one;
			}
			index = index + one;
			cond1 = index1 < size1;
			cond2 = index2 < size2;
			cond = cond1 && cond2;
		}
		cond1 = index1 < size1;
		while (cond1) {
			index1 = index1 + one;
			index = index + one;
			cond1 = index1 < size1;
		}
		cond2 = index2 < size2;
		while (cond2) {
			index2 = index2 + one;
			index = index + one;
			cond2 = index2 < size2;
		}
		final int rSize = index;
		final int sizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int tempReg = sizeMinusOne + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int tempDist = sizeMinusOne + SX10_TEMP1;
		final Point1[] tempArr = new Point1[tempDist];
		index1 = 0;
		index2 = 0;
		index = 0;
		cond1 = index1 < size1;
		cond2 = index2 < size2;
		cond = cond1 && cond2;
		while (cond) {
			final Point1 p1 = arr1[index1];
			final Point1 p2 = arr2[index2];
			final int pointCompare = Program.comparePoint1(p1, p2);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			final boolean gt = pointCompare == two;
			if (eq) {
				tempArr[index] = p1;
				index1 = index1 + one;
				index2 = index2 + one;
			}
			if (lt) {
				tempArr[index] = p1;
				index1 = index1 + one;
			}
			if (gt) {
				tempArr[index] = p2;
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
			tempArr[index] = tempArrPt;
			index1 = index1 + one;
			index = index + one;
			cond1 = index1 < size1;
		}
		cond2 = index2 < size2;
		while (cond2) {
			final Point1 tempArrPt = arr2[index2];
			tempArr[index] = tempArrPt;
			index2 = index2 + one;
			index = index + one;
			cond2 = index2 < size2;
		}
		final Point1[] SX10_TEMP3 = new Point1[tempReg];
		final int SX10_TEMP5 = SX10_TEMP3.length;
		for (int SX10_TEMP4 = 0; SX10_TEMP4 < SX10_TEMP5; SX10_TEMP4++) {
			final int pt = SX10_TEMP4;
			final Point1 retPoint = tempArr[pt];
			SX10_TEMP3[pt] = retPoint;
		}
		final Point1[] arr = SX10_TEMP3;
		final Region1 unionReg = new Region1(arr);
		return unionReg;
	}

	public static Wrapper getRefArrayValue1Wrapper(
			final WrapperRefArray1 array, final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final WrapperStub[] contents = array.contents;
		final WrapperStub indexStub = contents[placeIndex];
		final Wrapper[] localArray = indexStub.localArray;
		final Wrapper returnValue = localArray[localIndex];
		return returnValue;
	}

	public static boolean regionContainsPoint3(final Region3 r,
			final Point3 target) {
		final int temp = Program.searchPointInRegion3(r, target);
		final int zero = 0;
		final boolean containsPt = temp >= zero;
		return containsPt;
	}

	public static String toStringRegion3(final Region3 r) {
		String str = "";
		final int dim = r.regSize;
		final int one = 1;
		final int dimMinusOne = dim - one;
		final int SX10_TEMP0 = 1;
		final int rReg = dimMinusOne + SX10_TEMP0;
		final Point3[] regArray = r.pointArray;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < rReg; SX10_TEMP1++) {
			final int pt1 = SX10_TEMP1;
			Point3 pt = regArray[pt1];
			String ptStr = Program.toStringPoint3(pt);
			String lBrace = "{";
			String rBrace = "}";
			String endLine = "\n";
			String colon = ":";
			str = str + lBrace;
			str = str + pt1;
			str = str + colon;
			str = str + ptStr;
			str = str + rBrace;
			str = str + endLine;
		}
		return str;
	}

	public static Region3 getRefArrayValue1Region3(
			final Region3RefArray1 array, final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Region3Stub[] contents = array.contents;
		final Region3Stub indexStub = contents[placeIndex];
		final Region3[] localArray = indexStub.localArray;
		final Region3 returnValue = localArray[localIndex];
		return returnValue;
	}

	public static int getDistLocalCount2(final Dist2 dn, final int placeIndex) {
		final Dist d = dn.dDist;
		final int[] counts = d.counts;
		final int localCount = counts[placeIndex];
		return localCount;
	}

	public static int getDistLocalCount3(final Dist3 dn, final int placeIndex) {
		final Dist d = dn.dDist;
		final int[] counts = d.counts;
		final int localCount = counts[placeIndex];
		return localCount;
	}

	public static int getDistLocalCount1(final Dist1 dn, final int placeIndex) {
		final Dist d = dn.dDist;
		final int[] counts = d.counts;
		final int localCount = counts[placeIndex];
		return localCount;
	}

	public static void setRefArrayValue1Dist3(final Dist3RefArray1 array,
			final int index, final Dist3 val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Dist3Stub[] contents = array.contents;
		final Dist3Stub indexStub = contents[placeIndex];
		final Dist3[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static Region3 unionRegion3(final Region3 reg1, final Region3 reg2) {
		int index1 = 0;
		int index2 = 0;
		int index = 0;
		final Point3[] arr1 = reg1.pointArray;
		final Point3[] arr2 = reg2.pointArray;
		final int size1 = reg1.regSize;
		final int size2 = reg2.regSize;
		boolean cond1 = index1 < size1;
		boolean cond2 = index2 < size2;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		boolean cond = cond1 && cond2;
		while (cond) {
			final Point3 p1 = arr1[index1];
			final Point3 p2 = arr2[index2];
			final int pointCompare = Program.comparePoint3(p1, p2);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			final boolean gt = pointCompare == two;
			if (eq) {
				index1 = index1 + one;
				index2 = index2 + one;
			}
			if (lt) {
				index1 = index1 + one;
			}
			if (gt) {
				index2 = index2 + one;
			}
			index = index + one;
			cond1 = index1 < size1;
			cond2 = index2 < size2;
			cond = cond1 && cond2;
		}
		cond1 = index1 < size1;
		while (cond1) {
			index1 = index1 + one;
			index = index + one;
			cond1 = index1 < size1;
		}
		cond2 = index2 < size2;
		while (cond2) {
			index2 = index2 + one;
			index = index + one;
			cond2 = index2 < size2;
		}
		final int rSize = index;
		final int sizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int tempReg = sizeMinusOne + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int tempDist = sizeMinusOne + SX10_TEMP1;
		final Point3[] tempArr = new Point3[tempDist];
		index1 = 0;
		index2 = 0;
		index = 0;
		cond1 = index1 < size1;
		cond2 = index2 < size2;
		cond = cond1 && cond2;
		while (cond) {
			final Point3 p1 = arr1[index1];
			final Point3 p2 = arr2[index2];
			final int pointCompare = Program.comparePoint3(p1, p2);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			final boolean gt = pointCompare == two;
			if (eq) {
				tempArr[index] = p1;
				index1 = index1 + one;
				index2 = index2 + one;
			}
			if (lt) {
				tempArr[index] = p1;
				index1 = index1 + one;
			}
			if (gt) {
				tempArr[index] = p2;
				index2 = index2 + one;
			}
			index = index + one;
			cond1 = index1 < size1;
			cond2 = index2 < size2;
			cond = cond1 && cond2;
		}
		cond1 = index1 < size1;
		while (cond1) {
			final Point3 tempArrPt = arr1[index1];
			tempArr[index] = tempArrPt;
			index1 = index1 + one;
			index = index + one;
			cond1 = index1 < size1;
		}
		cond2 = index2 < size2;
		while (cond2) {
			final Point3 tempArrPt = arr2[index2];
			tempArr[index] = tempArrPt;
			index2 = index2 + one;
			index = index + one;
			cond2 = index2 < size2;
		}
		final Point3[] SX10_TEMP3 = new Point3[tempReg];
		final int SX10_TEMP5 = SX10_TEMP3.length;
		for (int SX10_TEMP4 = 0; SX10_TEMP4 < SX10_TEMP5; SX10_TEMP4++) {
			final int pt = SX10_TEMP4;
			final Point3 retPoint = tempArr[pt];
			SX10_TEMP3[pt] = retPoint;
		}
		final Point3[] arr = SX10_TEMP3;
		final Region3 unionReg = new Region3(arr);
		return unionReg;
	}

	public static Dist2 getPlaceDist2(final Region2 r, final int p) {
		final int rSize = r.regSize;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int dReg = rSizeMinusOne + SX10_TEMP0;
		final int[] SX10_TEMP1 = new int[dReg];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			SX10_TEMP1[pt] = p;
		}
		final int[] vPlaceArray = SX10_TEMP1;
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist2 retDist = new Dist2(r, pointDist);
		return retDist;
	}

	public static Dist1 getPlaceDist1(final Region1 r, final int p) {
		final int rSize = r.regSize;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int dReg = rSizeMinusOne + SX10_TEMP0;
		final int[] SX10_TEMP1 = new int[dReg];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			SX10_TEMP1[pt] = p;
		}
		final int[] vPlaceArray = SX10_TEMP1;
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist1 retDist = new Dist1(r, pointDist);
		return retDist;
	}

	public static Dist3 getPlaceDist3(final Region3 r, final int p) {
		final int rSize = r.regSize;
		final int one = 1;
		final int rSizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int dReg = rSizeMinusOne + SX10_TEMP0;
		final int[] SX10_TEMP1 = new int[dReg];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			SX10_TEMP1[pt] = p;
		}
		final int[] vPlaceArray = SX10_TEMP1;
		final Dist pointDist = new Dist(vPlaceArray, rSize);
		final Dist3 retDist = new Dist3(r, pointDist);
		return retDist;
	}

	public static int binarySearchRegion2(final Region2 r, final Point2 target) {
		final Point2[] pointArray = r.pointArray;
		int start = 0;
		int end = r.regSize;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		end = end - one;
		int result = zero - one;
		boolean notDone = start <= end;
		while (notDone) {
			int mid = start + end;
			mid = mid / two;
			final Point2 temp = pointArray[mid];
			final int pointCompare = Program.comparePoint2(target, temp);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			if (eq) {
				return mid;
			} else {
				if (lt) {
					end = mid - one;
				} else {
					start = mid + one;
				}
			}
			notDone = start <= end;
		}
		return result;
	}

	public static int binarySearchRegion1(final Region1 r, final Point1 target) {
		final Point1[] pointArray = r.pointArray;
		int start = 0;
		int end = r.regSize;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		end = end - one;
		int result = zero - one;
		boolean notDone = start <= end;
		while (notDone) {
			int mid = start + end;
			mid = mid / two;
			final Point1 temp = pointArray[mid];
			final int pointCompare = Program.comparePoint1(target, temp);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			if (eq) {
				return mid;
			} else {
				if (lt) {
					end = mid - one;
				} else {
					start = mid + one;
				}
			}
			notDone = start <= end;
		}
		return result;
	}

	public static int binarySearchRegion3(final Region3 r, final Point3 target) {
		final Point3[] pointArray = r.pointArray;
		int start = 0;
		int end = r.regSize;
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		end = end - one;
		int result = zero - one;
		boolean notDone = start <= end;
		while (notDone) {
			int mid = start + end;
			mid = mid / two;
			final Point3 temp = pointArray[mid];
			final int pointCompare = Program.comparePoint3(target, temp);
			final boolean eq = pointCompare == zero;
			final boolean lt = pointCompare == one;
			if (eq) {
				return mid;
			} else {
				if (lt) {
					end = mid - one;
				} else {
					start = mid + one;
				}
			}
			notDone = start <= end;
		}
		return result;
	}

	public static Dist1 getUniqueDist() {
		final int one = 1;
		final int zero = 0;
		final int maxPlaces = /* place.MAX_PLACES */1;
		final int rSize = maxPlaces - one;
		final int SX10_TEMP0 = 1;
		final int placeRegion = rSize + SX10_TEMP0;
		final Point1[] SX10_TEMP1 = new Point1[placeRegion];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int p = SX10_TEMP2;
			final int i = p;
			final Point1 pt1 = new Point1(i);
			SX10_TEMP1[p] = pt1;
		}
		final Point1[] pointArray = SX10_TEMP1;
		final int[] SX10_TEMP4 = new int[placeRegion];
		final int SX10_TEMP6 = SX10_TEMP4.length;
		for (int SX10_TEMP5 = 0; SX10_TEMP5 < SX10_TEMP6; SX10_TEMP5++) {
			final int p = SX10_TEMP5;
			final int i = p;
			final int pl1 = /* place.places ( i ) */0;
			SX10_TEMP4[p] = pl1;
		}
		final int[] vPlaceArray = SX10_TEMP4;
		final Region1 reg = new Region1(pointArray, zero, maxPlaces);
		final Dist pointDist1 = new Dist(vPlaceArray, maxPlaces);
		final Dist1 retDist = new Dist1(reg, pointDist1);
		return retDist;
	}

	public static void setRefArrayValue2Region3(final Region3RefArray2 array,
			final int index, final Region3 val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist2 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Region3Stub[] contents = array.contents;
		final Region3Stub indexStub = contents[placeIndex];
		final Region3[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static void setRefArrayValue3double(final doubleRefArray3 array,
			final int index, final double val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist3 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub[] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static Region3 getRefArrayValue2Region3(
			final Region3RefArray2 array, final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist2 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Region3Stub[] contents = array.contents;
		final Region3Stub indexStub = contents[placeIndex];
		final Region3[] localArray = indexStub.localArray;
		final Region3 returnValue = localArray[localIndex];
		return returnValue;
	}

	public static int regionHigh(final Region1 r) {
		final Point1[] array = r.pointArray;
		int index = r.regSize;
		final int one = 1;
		index = index - one;
		final Point1 highPoint = array[index];
		final int hgh = highPoint.f0;
		return hgh;
	}

	public static int comparePoint1(final Point1 pt1, final Point1 pt2) {
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		int point1 = 0;
		int point2 = 0;
		boolean lt = false;
		boolean gt = false;
		point1 = pt1.f0;
		point2 = pt2.f0;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		return zero;
	}

	public static int comparePoint2(final Point2 pt1, final Point2 pt2) {
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		int point1 = 0;
		int point2 = 0;
		boolean lt = false;
		boolean gt = false;
		point1 = pt1.f0;
		point2 = pt2.f0;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		point1 = pt1.f1;
		point2 = pt2.f1;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		return zero;
	}

	public static Point2 regionOrdinalPoint2(final Region2 reg, final int ordl) {
		final Point2[] pointArray = reg.pointArray;
		final Point2 pt = pointArray[ordl];
		return pt;
	}

	public static Point1 regionOrdinalPoint1(final Region1 reg, final int ordl) {
		final Point1[] pointArray = reg.pointArray;
		final Point1 pt = pointArray[ordl];
		return pt;
	}

	public static int comparePoint3(final Point3 pt1, final Point3 pt2) {
		final int zero = 0;
		final int one = 1;
		final int two = 2;
		int point1 = 0;
		int point2 = 0;
		boolean lt = false;
		boolean gt = false;
		point1 = pt1.f0;
		point2 = pt2.f0;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		point1 = pt1.f1;
		point2 = pt2.f1;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		point1 = pt1.f2;
		point2 = pt2.f2;
		lt = point1 < point2;
		gt = point1 > point2;
		if (lt) {
			return one;
		}
		if (gt) {
			return two;
		}
		return zero;
	}

	public static double getRefArrayValue3double(final doubleRefArray3 array,
			final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist3 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final doubleStub[] contents = array.contents;
		final doubleStub indexStub = contents[placeIndex];
		final double[] localArray = indexStub.localArray;
		final double returnValue = localArray[localIndex];
		return returnValue;
	}

	public static Point3 regionOrdinalPoint3(final Region3 reg, final int ordl) {
		final Point3[] pointArray = reg.pointArray;
		final Point3 pt = pointArray[ordl];
		return pt;
	}

	public static Dist3 getRefArrayValue1Dist3(final Dist3RefArray1 array,
			final int index) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final Dist3Stub[] contents = array.contents;
		final Dist3Stub indexStub = contents[placeIndex];
		final Dist3[] localArray = indexStub.localArray;
		final Dist3 returnValue = localArray[localIndex];
		return returnValue;
	}

	public static Point1[] getDistLocalArray1(final Dist1 dn,
			final int placeIndex) {
		final Region1 r = dn.dReg;
		final Point1[] pointArray = r.pointArray;
		final int rSize = r.regSize;
		final Dist d = dn.dDist;
		final int[] placeArray = d.placeArray;
		final int one = 1;
		final int currPlace = /* place.places ( placeIndex ) */0;
		final int[] counts = d.counts;
		final int localCount = counts[placeIndex];
		final int localCountMinusOne = localCount - one;
		final int rSizeMinusOne = rSize - one;
		final int SX10_TEMP0 = 1;
		final int localRegion = localCountMinusOne + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int placeRegion = rSizeMinusOne + SX10_TEMP1;
		final int SX10_TEMP2 = 1;
		final int localDist = localCountMinusOne + SX10_TEMP2;
		final Point1[] tempPointArray = new Point1[localDist];
		int tempCount = 0;
		for (int SX10_TEMP4 = 0; SX10_TEMP4 < placeRegion; SX10_TEMP4++) {
			final int p = SX10_TEMP4;
			final int pl = placeArray[p];
			final boolean cond = pl == currPlace;
			if (cond) {
				final Point1 tempPoint = pointArray[p];
				tempPointArray[tempCount] = tempPoint;
				tempCount = tempCount + one;
			}
		}
		final Point1[] SX10_TEMP5 = new Point1[localRegion];
		final int SX10_TEMP7 = SX10_TEMP5.length;
		for (int SX10_TEMP6 = 0; SX10_TEMP6 < SX10_TEMP7; SX10_TEMP6++) {
			final int p = SX10_TEMP6;
			final Point1 tempPoint = tempPointArray[p];
			SX10_TEMP5[p] = tempPoint;
		}
		final Point1[] vPointArray = SX10_TEMP5;
		return vPointArray;
	}

	public static void getCyclic(final int[] placeArray, final int arraySize,
			final int initPlace, final int blockSize) {
		final int zero = 0;
		final int one = 1;
		int N = arraySize;
		int chunk = blockSize;
		final boolean ifCond = blockSize > N;
		if (ifCond) {
			chunk = N;
		}
		int index = 0;
		int dSize = index + chunk;
		dSize = dSize - one;
		final int SX10_TEMP0 = 1;
		final int pointReg = dSize + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < pointReg; SX10_TEMP1++) {
			final int p = SX10_TEMP1;
			placeArray[p] = initPlace;
		}
		index = index + chunk;
		N = N - chunk;
		int pl = /* initPlace . next ( ) */0;
		boolean whileCond = N != zero;
		while (whileCond) {
			final boolean tailCond = chunk > N;
			if (tailCond) {
				dSize = index + N;
				dSize = dSize - one;
				final int ub = N - one;
				final int SX10_TEMP2 = 1;
				final int pointReg1 = ub + SX10_TEMP2;
				for (int SX10_TEMP3 = 0; SX10_TEMP3 < pointReg1; SX10_TEMP3++) {
					final int p = SX10_TEMP3;
					final int tempPt = p + index;
					placeArray[tempPt] = pl;
				}
				N = 0;
			} else {
				dSize = index + chunk;
				dSize = dSize - one;
				final int ub = chunk - one;
				final int SX10_TEMP4 = 1;
				final int pointReg1 = ub + SX10_TEMP4;
				for (int SX10_TEMP5 = 0; SX10_TEMP5 < pointReg1; SX10_TEMP5++) {
					final int p = SX10_TEMP5;
					final int tempPt = p + index;
					placeArray[tempPt] = pl;
				}
				index = index + chunk;
				N = N - chunk;
			}
			pl = /* pl . next ( ) */0;
			whileCond = N != zero;
		}
	}

	public static int searchPointInRegion2(final Region2 r, final Point2 target) {
		final boolean regType = r.regType;
		if (regType) {
			final int constantSearch = Program.constantSearchRegion2(r, target);
			return constantSearch;
		}
		final int binarySearch = Program.binarySearchRegion2(r, target);
		return binarySearch;
	}

	public static int searchPointInRegion1(final Region1 r, final Point1 target) {
		final boolean regType = r.regType;
		if (regType) {
			final int constantSearch = Program.constantSearchRegion1(r, target);
			return constantSearch;
		}
		final int binarySearch = Program.binarySearchRegion1(r, target);
		return binarySearch;
	}

	public static void setRefArrayValue1Wrapper(final WrapperRefArray1 array,
			final int index, final Wrapper val) {
		final int pl = /* here */0;
		final int placeIndex = /* pl . id */0;
		final Dist1 dArray = array.distValue;
		final Dist dDist = dArray.dDist;
		final int[] runSum = dDist.runningSum;
		final int localIndex = runSum[index];
		final WrapperStub[] contents = array.contents;
		final WrapperStub indexStub = contents[placeIndex];
		final Wrapper[] localArray = indexStub.localArray;
		localArray[localIndex] = val;
	}

	public static int searchPointInRegion3(final Region3 r, final Point3 target) {
		final boolean regType = r.regType;
		if (regType) {
			final int constantSearch = Program.constantSearchRegion3(r, target);
			return constantSearch;
		}
		final int binarySearch = Program.binarySearchRegion3(r, target);
		return binarySearch;
	}

	public static int[] initDist(final int[] tempArr, final int tempReg) {
		final int[] SX10_TEMP0 = new int[tempReg];
		final int SX10_TEMP2 = SX10_TEMP0.length;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < SX10_TEMP2; SX10_TEMP1++) {
			final int p = SX10_TEMP1;
			final int tempInt = tempArr[p];
			SX10_TEMP0[p] = tempInt;
		}
		final int[] vTemp = SX10_TEMP0;
		return vTemp;
	}

	public static Region2 createNewRegion2RR(final int v1_0, final int v1_1,
			final int v2_0, final int v2_1) {
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
		final int SX10_TEMP0 = 1;
		final int regArr = rSize + SX10_TEMP0;
		final Point2[] SX10_TEMP1 = new Point2[regArr];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			final int p = pt;
			int f1 = p / stride1;
			f1 = f1 % dim1;
			f1 = f1 + v1_0;
			int f2 = p / stride2;
			f2 = f2 % dim2;
			f2 = f2 + v2_0;
			final Point2 retPoint = new Point2(f1, f2);
			SX10_TEMP1[pt] = retPoint;
		}
		final Point2[] ptArray = SX10_TEMP1;
		if (regType) {
			final Region2 retRegRegular = new Region2(ptArray, v1_0, dim1,
					v2_0, dim2);
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
		final int SX10_TEMP0 = 1;
		final int regArr = rSize + SX10_TEMP0;
		final Point1[] SX10_TEMP1 = new Point1[regArr];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			final int p = pt;
			int f1 = p / stride1;
			f1 = f1 % dim1;
			f1 = f1 + v1_0;
			final Point1 retPoint = new Point1(f1);
			SX10_TEMP1[pt] = retPoint;
		}
		final Point1[] ptArray = SX10_TEMP1;
		if (regType) {
			final Region1 retRegRegular = new Region1(ptArray, v1_0, dim1);
			return retRegRegular;
		}
		final Region1 retReg = new Region1(ptArray);
		return retReg;
	}

	public static Region3 createNewRegion3RRR(final int v1_0, final int v1_1,
			final int v2_0, final int v2_1, final int v3_0, final int v3_1) {
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
		final int SX10_TEMP0 = 1;
		final int regArr = rSize + SX10_TEMP0;
		final Point3[] SX10_TEMP1 = new Point3[regArr];
		final int SX10_TEMP3 = SX10_TEMP1.length;
		for (int SX10_TEMP2 = 0; SX10_TEMP2 < SX10_TEMP3; SX10_TEMP2++) {
			final int pt = SX10_TEMP2;
			final int p = pt;
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
			SX10_TEMP1[pt] = retPoint;
		}
		final Point3[] ptArray = SX10_TEMP1;
		if (regType) {
			final Region3 retRegRegular = new Region3(ptArray, v1_0, dim1,
					v2_0, dim2, v3_0, dim3);
			return retRegRegular;
		}
		final Region3 retReg = new Region3(ptArray);
		return retReg;
	}
}

class LevelData {
	public final boolean EXCHANGE_After;
	public final int SIZE;
	public final Region3 P_DOMAIN;
	public final boolean ISPARALLEL;
	public final Region3RefArray1 m_regions;
	public final Region3RefArray1 m_REGIONs;
	public final Region3RefArray2 m_boundaries;
	public final Dist1 m_places;
	public final int m_numPlaces;
	public final Region3 m_placeGrid;
	public final int m_size0;
	public final int m_size1;
	public final int m_size2;
	public final int m_block0;
	public final int m_block1;
	public final int m_block2;
	public final Dist3RefArray1 m_dist;
	public final Dist3RefArray1 m_DIST;
	public final WrapperRefArray1 m_u;

	public LevelData(final int a_problemDomainSize, final boolean a_isParallel) {
		final Dist1 X10_TEMP1 = Program.UniqueDistribution;
		final Dist1 ALLPLACES = X10_TEMP1;
		final boolean X10_TEMP4 = Program._Util_OVERLAP_COMMANDCOMP;
		if (X10_TEMP4) {
			final boolean X10_TEMP6 = false;
			EXCHANGE_After = X10_TEMP6;
		} else {
			final boolean X10_TEMP8 = Program._Util_EXCHANGE_AFTER;
			EXCHANGE_After = X10_TEMP8;
		}
		SIZE = a_problemDomainSize;
		ISPARALLEL = a_isParallel;
		final int X10_TEMP14 = 0;
		final int X10_TEMP12 = 1;
		final int X10_TEMP15 = a_problemDomainSize - X10_TEMP12;
		final int X10_TEMP19 = 0;
		final int X10_TEMP17 = 1;
		final int X10_TEMP20 = a_problemDomainSize - X10_TEMP17;
		final int X10_TEMP24 = 0;
		final int X10_TEMP22 = 1;
		final int X10_TEMP25 = a_problemDomainSize - X10_TEMP22;
		final Region3 temp_P_DOMAIN = Program.createNewRegion3RRR(X10_TEMP14,
				X10_TEMP15, X10_TEMP19, X10_TEMP20, X10_TEMP24, X10_TEMP25);
		P_DOMAIN = temp_P_DOMAIN;
		int numCuts = 0;
		int temp_m_numPlaces = 0;
		if (a_isParallel) {
			m_places = ALLPLACES;
			final int X10_TEMP33 = Program._LevelData_N_PLACES;
			temp_m_numPlaces = X10_TEMP33;
			final int X10_TEMP35 = Program._LevelData_N_PLACES;
			final int X10_TEMP37 = Program.Util_log2(X10_TEMP35);
			numCuts = X10_TEMP37;
		} else {
			final int X10_TEMP40 = 0;
			final int X10_TEMP41 = 0;
			final Region1 X10_TEMP44 = Program.createNewRegion1R(X10_TEMP40,
					X10_TEMP41);
			int X10_TEMP43 = 0;
			final Point1 RX10_TEMP0 = new Point1(X10_TEMP43);
			final Region1 RX10_TEMP1 = ALLPLACES.dReg;
			final int RX10_TEMP2 = Program.searchPointInRegion1(RX10_TEMP1,
					RX10_TEMP0);
			final int RX10_TEMP3 = 0;
			final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3;
			if (RX10_TEMP4) {
				final String RX10_TEMP5 = "Point RX10_TEMP0 not found in the distribution ALLPLACES.";
				throw new RuntimeException(RX10_TEMP5);
			}
			final int RX10_TEMP6 = Program.getPlaceFromDist1(ALLPLACES,
					RX10_TEMP2);
			final int X10_TEMP45 = RX10_TEMP6;
			final Dist1 X10_TEMP47 = Program.getPlaceDist1(X10_TEMP44,
					X10_TEMP45);
			m_places = X10_TEMP47;
			final int X10_TEMP49 = 1;
			temp_m_numPlaces = X10_TEMP49;
			final int X10_TEMP51 = 0;
			numCuts = X10_TEMP51;
		}
		m_numPlaces = temp_m_numPlaces;
		final int X10_TEMP55 = 0;
		final Region1 X10_TEMP56 = Program.createNewRegion1R(X10_TEMP55,
				temp_m_numPlaces);
		final int X10_TEMP57 = /* here */0;
		Dist1 d = Program.getPlaceDist1(X10_TEMP56, X10_TEMP57);
		final int X10_TEMP61 = 0;
		final int X10_TEMP62 = 5;
		final int X10_TEMP66 = 0;
		final int X10_TEMP64 = 1;
		final int X10_TEMP67 = temp_m_numPlaces - X10_TEMP64;
		final Region2 X10_TEMP68 = Program.createNewRegion2RR(X10_TEMP61,
				X10_TEMP62, X10_TEMP66, X10_TEMP67);
		final int X10_TEMP69 = /* here */0;
		Dist2 di = Program.getPlaceDist2(X10_TEMP68, X10_TEMP69);
		final Dist3RefArray1 X10_TEMP73 = this.LevelData_getDist3Array(d);
		final Dist3RefArray1 temp_m_dist = X10_TEMP73;
		m_dist = temp_m_dist;
		final Dist3RefArray1 X10_TEMP78 = this.LevelData_getDist3Array(d);
		final Dist3RefArray1 temp_m_DIST = X10_TEMP78;
		m_DIST = temp_m_DIST;
		final int X10_TEMP82 = 0;
		final int X10_TEMP84 = 3;
		final boolean X10_TEMP83 = X10_TEMP82 >= X10_TEMP84;
		if (X10_TEMP83) {
			final String X10_TEMP85 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP86 = ", expected 3";
			String X10_TEMP87 = X10_TEMP85 + X10_TEMP82;
			X10_TEMP87 = X10_TEMP87 + X10_TEMP86;
			throw new RuntimeException(X10_TEMP87);
		}
		final int X10_TEMP88 = 0;
		final int X10_TEMP89 = 1;
		final int X10_TEMP91 = X10_TEMP88 - X10_TEMP89;
		Region1 X10_TEMP90 = Program.createNewRegion1R(X10_TEMP88, X10_TEMP91);
		final int X10_TEMP92 = 0;
		final boolean X10_TEMP95 = X10_TEMP82 == X10_TEMP92;
		final int X10_TEMP93 = 1;
		final boolean X10_TEMP96 = X10_TEMP82 == X10_TEMP93;
		final int X10_TEMP94 = 2;
		final boolean X10_TEMP97 = X10_TEMP82 == X10_TEMP94;
		final int RX10_TEMP11 = 1;
		int RX10_TEMP9 = temp_P_DOMAIN.regSize;
		RX10_TEMP9 = RX10_TEMP9 - RX10_TEMP11;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP10 = RX10_TEMP9 + SX10_TEMP0;
		for (int SX10_TEMP1 = 0; SX10_TEMP1 < RX10_TEMP10; SX10_TEMP1++) {
			final int RX10_TEMP7 = SX10_TEMP1;
			final int RX10_TEMP12 = RX10_TEMP7;
			final Point3 RX10_TEMP8 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP12);
			final int X10_TEMP98 = RX10_TEMP8.f0;
			final int X10_TEMP99 = RX10_TEMP8.f1;
			final int X10_TEMP100 = RX10_TEMP8.f2;
			if (X10_TEMP95) {
				final Region1 X10_TEMP101 = Program.createNewRegion1R(
						X10_TEMP98, X10_TEMP98);
				X10_TEMP90 = Program.unionRegion1(X10_TEMP90, X10_TEMP101);
			} else {
				if (X10_TEMP96) {
					final Region1 X10_TEMP101 = Program.createNewRegion1R(
							X10_TEMP99, X10_TEMP99);
					X10_TEMP90 = Program.unionRegion1(X10_TEMP90, X10_TEMP101);
				} else {
					if (X10_TEMP97) {
						final Region1 X10_TEMP101 = Program.createNewRegion1R(
								X10_TEMP100, X10_TEMP100);
						X10_TEMP90 = Program.unionRegion1(X10_TEMP90,
								X10_TEMP101);
					}
				}
			}
		}
		final Region1 X10_TEMP102 = X10_TEMP90;
		final int RX10_TEMP13 = X10_TEMP102.regSize;
		final int RX10_TEMP14 = 0;
		final boolean RX10_TEMP15 = RX10_TEMP13 <= RX10_TEMP14;
		if (RX10_TEMP15) {
			final String RX10_TEMP16 = "Operation low() not defined on empty region X10_TEMP102";
			throw new RuntimeException(RX10_TEMP16);
		}
		final int m_low0 = Program.regionLow(X10_TEMP102);
		final int X10_TEMP105 = 1;
		final int X10_TEMP107 = 3;
		final boolean X10_TEMP106 = X10_TEMP105 >= X10_TEMP107;
		if (X10_TEMP106) {
			final String X10_TEMP108 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP109 = ", expected 3";
			String X10_TEMP110 = X10_TEMP108 + X10_TEMP105;
			X10_TEMP110 = X10_TEMP110 + X10_TEMP109;
			throw new RuntimeException(X10_TEMP110);
		}
		final int X10_TEMP111 = 0;
		final int X10_TEMP112 = 1;
		final int X10_TEMP114 = X10_TEMP111 - X10_TEMP112;
		Region1 X10_TEMP113 = Program.createNewRegion1R(X10_TEMP111,
				X10_TEMP114);
		final int X10_TEMP115 = 0;
		final boolean X10_TEMP118 = X10_TEMP105 == X10_TEMP115;
		final int X10_TEMP116 = 1;
		final boolean X10_TEMP119 = X10_TEMP105 == X10_TEMP116;
		final int X10_TEMP117 = 2;
		final boolean X10_TEMP120 = X10_TEMP105 == X10_TEMP117;
		final int RX10_TEMP21 = 1;
		int RX10_TEMP19 = temp_P_DOMAIN.regSize;
		RX10_TEMP19 = RX10_TEMP19 - RX10_TEMP21;
		final int SX10_TEMP2 = 1;
		final int RX10_TEMP20 = RX10_TEMP19 + SX10_TEMP2;
		for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP20; SX10_TEMP3++) {
			final int RX10_TEMP17 = SX10_TEMP3;
			final int RX10_TEMP22 = RX10_TEMP17;
			final Point3 RX10_TEMP18 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP22);
			final int X10_TEMP121 = RX10_TEMP18.f0;
			final int X10_TEMP122 = RX10_TEMP18.f1;
			final int X10_TEMP123 = RX10_TEMP18.f2;
			if (X10_TEMP118) {
				final Region1 X10_TEMP124 = Program.createNewRegion1R(
						X10_TEMP121, X10_TEMP121);
				X10_TEMP113 = Program.unionRegion1(X10_TEMP113, X10_TEMP124);
			} else {
				if (X10_TEMP119) {
					final Region1 X10_TEMP124 = Program.createNewRegion1R(
							X10_TEMP122, X10_TEMP122);
					X10_TEMP113 = Program
							.unionRegion1(X10_TEMP113, X10_TEMP124);
				} else {
					if (X10_TEMP120) {
						final Region1 X10_TEMP124 = Program.createNewRegion1R(
								X10_TEMP123, X10_TEMP123);
						X10_TEMP113 = Program.unionRegion1(X10_TEMP113,
								X10_TEMP124);
					}
				}
			}
		}
		final Region1 X10_TEMP125 = X10_TEMP113;
		final int RX10_TEMP23 = X10_TEMP125.regSize;
		final int RX10_TEMP24 = 0;
		final boolean RX10_TEMP25 = RX10_TEMP23 <= RX10_TEMP24;
		if (RX10_TEMP25) {
			final String RX10_TEMP26 = "Operation low() not defined on empty region X10_TEMP125";
			throw new RuntimeException(RX10_TEMP26);
		}
		final int m_low1 = Program.regionLow(X10_TEMP125);
		final int X10_TEMP128 = 2;
		final int X10_TEMP130 = 3;
		final boolean X10_TEMP129 = X10_TEMP128 >= X10_TEMP130;
		if (X10_TEMP129) {
			final String X10_TEMP131 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP132 = ", expected 3";
			String X10_TEMP133 = X10_TEMP131 + X10_TEMP128;
			X10_TEMP133 = X10_TEMP133 + X10_TEMP132;
			throw new RuntimeException(X10_TEMP133);
		}
		final int X10_TEMP134 = 0;
		final int X10_TEMP135 = 1;
		final int X10_TEMP137 = X10_TEMP134 - X10_TEMP135;
		Region1 X10_TEMP136 = Program.createNewRegion1R(X10_TEMP134,
				X10_TEMP137);
		final int X10_TEMP138 = 0;
		final boolean X10_TEMP141 = X10_TEMP128 == X10_TEMP138;
		final int X10_TEMP139 = 1;
		final boolean X10_TEMP142 = X10_TEMP128 == X10_TEMP139;
		final int X10_TEMP140 = 2;
		final boolean X10_TEMP143 = X10_TEMP128 == X10_TEMP140;
		final int RX10_TEMP31 = 1;
		int RX10_TEMP29 = temp_P_DOMAIN.regSize;
		RX10_TEMP29 = RX10_TEMP29 - RX10_TEMP31;
		final int SX10_TEMP4 = 1;
		final int RX10_TEMP30 = RX10_TEMP29 + SX10_TEMP4;
		for (int SX10_TEMP5 = 0; SX10_TEMP5 < RX10_TEMP30; SX10_TEMP5++) {
			final int RX10_TEMP27 = SX10_TEMP5;
			final int RX10_TEMP32 = RX10_TEMP27;
			final Point3 RX10_TEMP28 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP32);
			final int X10_TEMP144 = RX10_TEMP28.f0;
			final int X10_TEMP145 = RX10_TEMP28.f1;
			final int X10_TEMP146 = RX10_TEMP28.f2;
			if (X10_TEMP141) {
				final Region1 X10_TEMP147 = Program.createNewRegion1R(
						X10_TEMP144, X10_TEMP144);
				X10_TEMP136 = Program.unionRegion1(X10_TEMP136, X10_TEMP147);
			} else {
				if (X10_TEMP142) {
					final Region1 X10_TEMP147 = Program.createNewRegion1R(
							X10_TEMP145, X10_TEMP145);
					X10_TEMP136 = Program
							.unionRegion1(X10_TEMP136, X10_TEMP147);
				} else {
					if (X10_TEMP143) {
						final Region1 X10_TEMP147 = Program.createNewRegion1R(
								X10_TEMP146, X10_TEMP146);
						X10_TEMP136 = Program.unionRegion1(X10_TEMP136,
								X10_TEMP147);
					}
				}
			}
		}
		final Region1 X10_TEMP148 = X10_TEMP136;
		final int RX10_TEMP33 = X10_TEMP148.regSize;
		final int RX10_TEMP34 = 0;
		final boolean RX10_TEMP35 = RX10_TEMP33 <= RX10_TEMP34;
		if (RX10_TEMP35) {
			final String RX10_TEMP36 = "Operation low() not defined on empty region X10_TEMP148";
			throw new RuntimeException(RX10_TEMP36);
		}
		final int m_low2 = Program.regionLow(X10_TEMP148);
		final int X10_TEMP151 = 0;
		final int X10_TEMP153 = 3;
		final boolean X10_TEMP152 = X10_TEMP151 >= X10_TEMP153;
		if (X10_TEMP152) {
			final String X10_TEMP154 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP155 = ", expected 3";
			String X10_TEMP156 = X10_TEMP154 + X10_TEMP151;
			X10_TEMP156 = X10_TEMP156 + X10_TEMP155;
			throw new RuntimeException(X10_TEMP156);
		}
		final int X10_TEMP157 = 0;
		final int X10_TEMP158 = 1;
		final int X10_TEMP160 = X10_TEMP157 - X10_TEMP158;
		Region1 X10_TEMP159 = Program.createNewRegion1R(X10_TEMP157,
				X10_TEMP160);
		final int X10_TEMP161 = 0;
		final boolean X10_TEMP164 = X10_TEMP151 == X10_TEMP161;
		final int X10_TEMP162 = 1;
		final boolean X10_TEMP165 = X10_TEMP151 == X10_TEMP162;
		final int X10_TEMP163 = 2;
		final boolean X10_TEMP166 = X10_TEMP151 == X10_TEMP163;
		final int RX10_TEMP41 = 1;
		int RX10_TEMP39 = temp_P_DOMAIN.regSize;
		RX10_TEMP39 = RX10_TEMP39 - RX10_TEMP41;
		final int SX10_TEMP6 = 1;
		final int RX10_TEMP40 = RX10_TEMP39 + SX10_TEMP6;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < RX10_TEMP40; SX10_TEMP7++) {
			final int RX10_TEMP37 = SX10_TEMP7;
			final int RX10_TEMP42 = RX10_TEMP37;
			final Point3 RX10_TEMP38 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP42);
			final int X10_TEMP167 = RX10_TEMP38.f0;
			final int X10_TEMP168 = RX10_TEMP38.f1;
			final int X10_TEMP169 = RX10_TEMP38.f2;
			if (X10_TEMP164) {
				final Region1 X10_TEMP170 = Program.createNewRegion1R(
						X10_TEMP167, X10_TEMP167);
				X10_TEMP159 = Program.unionRegion1(X10_TEMP159, X10_TEMP170);
			} else {
				if (X10_TEMP165) {
					final Region1 X10_TEMP170 = Program.createNewRegion1R(
							X10_TEMP168, X10_TEMP168);
					X10_TEMP159 = Program
							.unionRegion1(X10_TEMP159, X10_TEMP170);
				} else {
					if (X10_TEMP166) {
						final Region1 X10_TEMP170 = Program.createNewRegion1R(
								X10_TEMP169, X10_TEMP169);
						X10_TEMP159 = Program.unionRegion1(X10_TEMP159,
								X10_TEMP170);
					}
				}
			}
		}
		final Region1 X10_TEMP171 = X10_TEMP159;
		final int RX10_TEMP43 = X10_TEMP171.regSize;
		final int RX10_TEMP44 = 0;
		final boolean RX10_TEMP45 = RX10_TEMP43 <= RX10_TEMP44;
		if (RX10_TEMP45) {
			final String RX10_TEMP46 = "Operation high() not defined on empty region X10_TEMP171";
			throw new RuntimeException(RX10_TEMP46);
		}
		final int m_hi0 = Program.regionHigh(X10_TEMP171);
		final int X10_TEMP174 = 1;
		final int X10_TEMP176 = 3;
		final boolean X10_TEMP175 = X10_TEMP174 >= X10_TEMP176;
		if (X10_TEMP175) {
			final String X10_TEMP177 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP178 = ", expected 3";
			String X10_TEMP179 = X10_TEMP177 + X10_TEMP174;
			X10_TEMP179 = X10_TEMP179 + X10_TEMP178;
			throw new RuntimeException(X10_TEMP179);
		}
		final int X10_TEMP180 = 0;
		final int X10_TEMP181 = 1;
		final int X10_TEMP183 = X10_TEMP180 - X10_TEMP181;
		Region1 X10_TEMP182 = Program.createNewRegion1R(X10_TEMP180,
				X10_TEMP183);
		final int X10_TEMP184 = 0;
		final boolean X10_TEMP187 = X10_TEMP174 == X10_TEMP184;
		final int X10_TEMP185 = 1;
		final boolean X10_TEMP188 = X10_TEMP174 == X10_TEMP185;
		final int X10_TEMP186 = 2;
		final boolean X10_TEMP189 = X10_TEMP174 == X10_TEMP186;
		final int RX10_TEMP51 = 1;
		int RX10_TEMP49 = temp_P_DOMAIN.regSize;
		RX10_TEMP49 = RX10_TEMP49 - RX10_TEMP51;
		final int SX10_TEMP8 = 1;
		final int RX10_TEMP50 = RX10_TEMP49 + SX10_TEMP8;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < RX10_TEMP50; SX10_TEMP9++) {
			final int RX10_TEMP47 = SX10_TEMP9;
			final int RX10_TEMP52 = RX10_TEMP47;
			final Point3 RX10_TEMP48 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP52);
			final int X10_TEMP190 = RX10_TEMP48.f0;
			final int X10_TEMP191 = RX10_TEMP48.f1;
			final int X10_TEMP192 = RX10_TEMP48.f2;
			if (X10_TEMP187) {
				final Region1 X10_TEMP193 = Program.createNewRegion1R(
						X10_TEMP190, X10_TEMP190);
				X10_TEMP182 = Program.unionRegion1(X10_TEMP182, X10_TEMP193);
			} else {
				if (X10_TEMP188) {
					final Region1 X10_TEMP193 = Program.createNewRegion1R(
							X10_TEMP191, X10_TEMP191);
					X10_TEMP182 = Program
							.unionRegion1(X10_TEMP182, X10_TEMP193);
				} else {
					if (X10_TEMP189) {
						final Region1 X10_TEMP193 = Program.createNewRegion1R(
								X10_TEMP192, X10_TEMP192);
						X10_TEMP182 = Program.unionRegion1(X10_TEMP182,
								X10_TEMP193);
					}
				}
			}
		}
		final Region1 X10_TEMP194 = X10_TEMP182;
		final int RX10_TEMP53 = X10_TEMP194.regSize;
		final int RX10_TEMP54 = 0;
		final boolean RX10_TEMP55 = RX10_TEMP53 <= RX10_TEMP54;
		if (RX10_TEMP55) {
			final String RX10_TEMP56 = "Operation high() not defined on empty region X10_TEMP194";
			throw new RuntimeException(RX10_TEMP56);
		}
		final int m_hi1 = Program.regionHigh(X10_TEMP194);
		final int X10_TEMP197 = 2;
		final int X10_TEMP199 = 3;
		final boolean X10_TEMP198 = X10_TEMP197 >= X10_TEMP199;
		if (X10_TEMP198) {
			final String X10_TEMP200 = "Invalid dimension for rank projection. Got ";
			final String X10_TEMP201 = ", expected 3";
			String X10_TEMP202 = X10_TEMP200 + X10_TEMP197;
			X10_TEMP202 = X10_TEMP202 + X10_TEMP201;
			throw new RuntimeException(X10_TEMP202);
		}
		final int X10_TEMP203 = 0;
		final int X10_TEMP204 = 1;
		final int X10_TEMP206 = X10_TEMP203 - X10_TEMP204;
		Region1 X10_TEMP205 = Program.createNewRegion1R(X10_TEMP203,
				X10_TEMP206);
		final int X10_TEMP207 = 0;
		final boolean X10_TEMP210 = X10_TEMP197 == X10_TEMP207;
		final int X10_TEMP208 = 1;
		final boolean X10_TEMP211 = X10_TEMP197 == X10_TEMP208;
		final int X10_TEMP209 = 2;
		final boolean X10_TEMP212 = X10_TEMP197 == X10_TEMP209;
		final int RX10_TEMP61 = 1;
		int RX10_TEMP59 = temp_P_DOMAIN.regSize;
		RX10_TEMP59 = RX10_TEMP59 - RX10_TEMP61;
		final int SX10_TEMP10 = 1;
		final int RX10_TEMP60 = RX10_TEMP59 + SX10_TEMP10;
		for (int SX10_TEMP11 = 0; SX10_TEMP11 < RX10_TEMP60; SX10_TEMP11++) {
			final int RX10_TEMP57 = SX10_TEMP11;
			final int RX10_TEMP62 = RX10_TEMP57;
			final Point3 RX10_TEMP58 = Program.regionOrdinalPoint3(
					temp_P_DOMAIN, RX10_TEMP62);
			final int X10_TEMP213 = RX10_TEMP58.f0;
			final int X10_TEMP214 = RX10_TEMP58.f1;
			final int X10_TEMP215 = RX10_TEMP58.f2;
			if (X10_TEMP210) {
				final Region1 X10_TEMP216 = Program.createNewRegion1R(
						X10_TEMP213, X10_TEMP213);
				X10_TEMP205 = Program.unionRegion1(X10_TEMP205, X10_TEMP216);
			} else {
				if (X10_TEMP211) {
					final Region1 X10_TEMP216 = Program.createNewRegion1R(
							X10_TEMP214, X10_TEMP214);
					X10_TEMP205 = Program
							.unionRegion1(X10_TEMP205, X10_TEMP216);
				} else {
					if (X10_TEMP212) {
						final Region1 X10_TEMP216 = Program.createNewRegion1R(
								X10_TEMP215, X10_TEMP215);
						X10_TEMP205 = Program.unionRegion1(X10_TEMP205,
								X10_TEMP216);
					}
				}
			}
		}
		final Region1 X10_TEMP217 = X10_TEMP205;
		final int RX10_TEMP63 = X10_TEMP217.regSize;
		final int RX10_TEMP64 = 0;
		final boolean RX10_TEMP65 = RX10_TEMP63 <= RX10_TEMP64;
		if (RX10_TEMP65) {
			final String RX10_TEMP66 = "Operation high() not defined on empty region X10_TEMP217";
			throw new RuntimeException(RX10_TEMP66);
		}
		final int m_hi2 = Program.regionHigh(X10_TEMP217);
		final int X10_TEMP219 = m_hi0 - m_low0;
		final int X10_TEMP220 = 1;
		final int temp_m_size0 = X10_TEMP219 + X10_TEMP220;
		final int X10_TEMP222 = m_hi1 - m_low1;
		final int X10_TEMP223 = 1;
		final int temp_m_size1 = X10_TEMP222 + X10_TEMP223;
		final int X10_TEMP225 = m_hi2 - m_low2;
		final int X10_TEMP226 = 1;
		final int temp_m_size2 = X10_TEMP225 + X10_TEMP226;
		m_size0 = temp_m_size0;
		m_size1 = temp_m_size1;
		m_size2 = temp_m_size2;
		final int X10_TEMP231 = 3;
		int a = numCuts / X10_TEMP231;
		final int X10_TEMP233 = 3;
		int b = numCuts % X10_TEMP233;
		final int X10_TEMP235 = 0;
		final boolean X10_TEMP236 = b > X10_TEMP235;
		int X10_TEMP239 = 0;
		if (X10_TEMP236) {
			X10_TEMP239 = 1;
		}
		final int X10_TEMP240 = X10_TEMP239;
		final int X10_TEMP241 = X10_TEMP240;
		final int m_cut0 = a + X10_TEMP241;
		final int X10_TEMP243 = 1;
		final boolean X10_TEMP244 = b > X10_TEMP243;
		int X10_TEMP247 = 0;
		if (X10_TEMP244) {
			X10_TEMP247 = 1;
		}
		final int X10_TEMP248 = X10_TEMP247;
		final int X10_TEMP249 = X10_TEMP248;
		final int m_cut1 = a + X10_TEMP249;
		final int m_cut2 = a;
		final int pow2_m_cut0 = Program.Util_pow2(m_cut0);
		final int pow2_m_cut1 = Program.Util_pow2(m_cut1);
		final int pow2_m_cut2 = Program.Util_pow2(m_cut2);
		m_block0 = pow2_m_cut0;
		m_block1 = pow2_m_cut1;
		m_block2 = pow2_m_cut2;
		final int m_blockSize0 = temp_m_size0 / pow2_m_cut0;
		final int m_blockSize1 = temp_m_size1 / pow2_m_cut1;
		final int m_blockSize2 = temp_m_size2 / pow2_m_cut2;
		final int X10_TEMP267 = 0;
		final int X10_TEMP265 = 1;
		final int X10_TEMP268 = pow2_m_cut0 - X10_TEMP265;
		final int X10_TEMP272 = 0;
		final int X10_TEMP270 = 1;
		final int X10_TEMP273 = pow2_m_cut1 - X10_TEMP270;
		final int X10_TEMP277 = 0;
		final int X10_TEMP275 = 1;
		final int X10_TEMP278 = pow2_m_cut2 - X10_TEMP275;
		final Region3 temp_m_placeGrid = Program.createNewRegion3RRR(
				X10_TEMP267, X10_TEMP268, X10_TEMP272, X10_TEMP273,
				X10_TEMP277, X10_TEMP278);
		m_placeGrid = temp_m_placeGrid;
		int i = 0;
		final Region3RefArray1 X10_TEMP284 = this.LevelData_getRegion3Array1(d);
		Region3RefArray1 m_reg = X10_TEMP284;
		final Region3RefArray1 X10_TEMP288 = this.LevelData_getRegion3Array1(d);
		Region3RefArray1 m_REG = X10_TEMP288;
		final int RX10_TEMP71 = 1;
		int RX10_TEMP69 = temp_m_placeGrid.regSize;
		RX10_TEMP69 = RX10_TEMP69 - RX10_TEMP71;
		final int SX10_TEMP12 = 1;
		final int RX10_TEMP70 = RX10_TEMP69 + SX10_TEMP12;
		for (int SX10_TEMP13 = 0; SX10_TEMP13 < RX10_TEMP70; SX10_TEMP13++) {
			final int RX10_TEMP67 = SX10_TEMP13;
			final int RX10_TEMP72 = RX10_TEMP67;
			final Point3 RX10_TEMP68 = Program.regionOrdinalPoint3(
					temp_m_placeGrid, RX10_TEMP72);
			final int x = RX10_TEMP68.f0;
			final int y = RX10_TEMP68.f1;
			final int z = RX10_TEMP68.f2;
			final int X10_TEMP291 = m_blockSize0 * x;
			final int mrl0 = X10_TEMP291 + m_low0;
			final int X10_TEMP293 = m_blockSize1 * y;
			final int mrl1 = X10_TEMP293 + m_low1;
			final int X10_TEMP295 = m_blockSize2 * z;
			final int mrl2 = X10_TEMP295 + m_low2;
			final int X10_TEMP297 = 1;
			final int X10_TEMP299 = x + X10_TEMP297;
			final int X10_TEMP300 = m_blockSize0 * X10_TEMP299;
			final int mrh0 = X10_TEMP300 + m_low0;
			final int X10_TEMP302 = 1;
			final int X10_TEMP304 = y + X10_TEMP302;
			final int X10_TEMP305 = m_blockSize1 * X10_TEMP304;
			final int mrh1 = X10_TEMP305 + m_low1;
			final int X10_TEMP307 = 1;
			final int X10_TEMP309 = z + X10_TEMP307;
			final int X10_TEMP310 = m_blockSize2 * X10_TEMP309;
			final int mrh2 = X10_TEMP310 + m_low2;
			final int X10_TEMP314 = 1;
			final int X10_TEMP316 = mrh0 - X10_TEMP314;
			final int X10_TEMP318 = 1;
			final int X10_TEMP320 = mrh1 - X10_TEMP318;
			final int X10_TEMP322 = 1;
			final int X10_TEMP324 = mrh2 - X10_TEMP322;
			final Region3 X10_TEMP327 = Program.createNewRegion3RRR(mrl0,
					X10_TEMP316, mrl1, X10_TEMP320, mrl2, X10_TEMP324);
			final Region3 X10_TEMP328 = X10_TEMP327;
			final Point1 RX10_TEMP73 = new Point1(i);
			final Dist1 RX10_TEMP74 = m_reg.distValue;
			final Region1 RX10_TEMP75 = RX10_TEMP74.dReg;
			final int RX10_TEMP76 = Program.searchPointInRegion1(RX10_TEMP75,
					RX10_TEMP73);
			final int RX10_TEMP77 = 0;
			final boolean RX10_TEMP78 = RX10_TEMP76 < RX10_TEMP77;
			if (RX10_TEMP78) {
				String RX10_TEMP79 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP79);
			}
			final int RX10_TEMP80 = Program.getPlaceFromDist1(RX10_TEMP74,
					RX10_TEMP76);
			final int RX10_TEMP82 = /* here */0;
			final boolean RX10_TEMP83 = RX10_TEMP80 != RX10_TEMP82;
			if (RX10_TEMP83) {
				String RX10_TEMP81 = "Bad place access for array m_reg";
				throw new RuntimeException(RX10_TEMP81);
			}
			Program.setRefArrayValue1Region3(m_reg, RX10_TEMP76, X10_TEMP328);
			final int X10_TEMP330 = 1;
			final int X10_TEMP333 = mrl0 - X10_TEMP330;
			final int X10_TEMP334 = 1;
			final int X10_TEMP337 = mrl1 - X10_TEMP334;
			final int X10_TEMP338 = 1;
			final int X10_TEMP341 = mrl2 - X10_TEMP338;
			final Region3 X10_TEMP344 = Program.createNewRegion3RRR(
					X10_TEMP333, mrh0, X10_TEMP337, mrh1, X10_TEMP341, mrh2);
			final Region3 X10_TEMP345 = X10_TEMP344;
			final Point1 RX10_TEMP84 = new Point1(i);
			final Dist1 RX10_TEMP85 = m_REG.distValue;
			final Region1 RX10_TEMP86 = RX10_TEMP85.dReg;
			final int RX10_TEMP87 = Program.searchPointInRegion1(RX10_TEMP86,
					RX10_TEMP84);
			final int RX10_TEMP88 = 0;
			final boolean RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88;
			if (RX10_TEMP89) {
				String RX10_TEMP90 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP90);
			}
			final int RX10_TEMP91 = Program.getPlaceFromDist1(RX10_TEMP85,
					RX10_TEMP87);
			final int RX10_TEMP93 = /* here */0;
			final boolean RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93;
			if (RX10_TEMP94) {
				String RX10_TEMP92 = "Bad place access for array m_REG";
				throw new RuntimeException(RX10_TEMP92);
			}
			Program.setRefArrayValue1Region3(m_REG, RX10_TEMP87, X10_TEMP345);
			final int X10_TEMP348 = 1;
			final int X10_TEMP350 = mrh0 - X10_TEMP348;
			final int X10_TEMP352 = 1;
			final int X10_TEMP354 = mrh1 - X10_TEMP352;
			final int X10_TEMP356 = 1;
			final int X10_TEMP358 = mrh2 - X10_TEMP356;
			final Region3 X10_TEMP360 = Program.createNewRegion3RRR(mrl0,
					X10_TEMP350, mrl1, X10_TEMP354, mrl2, X10_TEMP358);
			final int X10_TEMP361 = /* place.places ( i ) */0;
			final Dist3 X10_TEMP364 = Program.getPlaceDist3(X10_TEMP360,
					X10_TEMP361);
			final Dist3 X10_TEMP365 = X10_TEMP364;
			final Point1 RX10_TEMP95 = new Point1(i);
			final Dist1 RX10_TEMP96 = temp_m_dist.distValue;
			final Region1 RX10_TEMP97 = RX10_TEMP96.dReg;
			final int RX10_TEMP98 = Program.searchPointInRegion1(RX10_TEMP97,
					RX10_TEMP95);
			final int RX10_TEMP99 = 0;
			final boolean RX10_TEMP100 = RX10_TEMP98 < RX10_TEMP99;
			if (RX10_TEMP100) {
				String RX10_TEMP101 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP101);
			}
			final int RX10_TEMP102 = Program.getPlaceFromDist1(RX10_TEMP96,
					RX10_TEMP98);
			final int RX10_TEMP104 = /* here */0;
			final boolean RX10_TEMP105 = RX10_TEMP102 != RX10_TEMP104;
			if (RX10_TEMP105) {
				String RX10_TEMP103 = "Bad place access for array temp_m_dist";
				throw new RuntimeException(RX10_TEMP103);
			}
			Program.setRefArrayValue1Dist3(temp_m_dist, RX10_TEMP98,
					X10_TEMP365);
			final int X10_TEMP367 = 1;
			final int X10_TEMP370 = mrl0 - X10_TEMP367;
			final int X10_TEMP371 = 1;
			final int X10_TEMP374 = mrl1 - X10_TEMP371;
			final int X10_TEMP375 = 1;
			final int X10_TEMP378 = mrl2 - X10_TEMP375;
			final Region3 X10_TEMP380 = Program.createNewRegion3RRR(
					X10_TEMP370, mrh0, X10_TEMP374, mrh1, X10_TEMP378, mrh2);
			final int X10_TEMP381 = /* place.places ( i ) */0;
			final Dist3 X10_TEMP384 = Program.getPlaceDist3(X10_TEMP380,
					X10_TEMP381);
			final Dist3 X10_TEMP385 = X10_TEMP384;
			final Point1 RX10_TEMP106 = new Point1(i);
			final Dist1 RX10_TEMP107 = temp_m_DIST.distValue;
			final Region1 RX10_TEMP108 = RX10_TEMP107.dReg;
			final int RX10_TEMP109 = Program.searchPointInRegion1(RX10_TEMP108,
					RX10_TEMP106);
			final int RX10_TEMP110 = 0;
			final boolean RX10_TEMP111 = RX10_TEMP109 < RX10_TEMP110;
			if (RX10_TEMP111) {
				String RX10_TEMP112 = "Array index out of bounds";
				throw new RuntimeException(RX10_TEMP112);
			}
			final int RX10_TEMP113 = Program.getPlaceFromDist1(RX10_TEMP107,
					RX10_TEMP109);
			final int RX10_TEMP115 = /* here */0;
			final boolean RX10_TEMP116 = RX10_TEMP113 != RX10_TEMP115;
			if (RX10_TEMP116) {
				String RX10_TEMP114 = "Bad place access for array temp_m_DIST";
				throw new RuntimeException(RX10_TEMP114);
			}
			Program.setRefArrayValue1Dist3(temp_m_DIST, RX10_TEMP109,
					X10_TEMP385);
			final int X10_TEMP386 = i;
			final int X10_TEMP387 = 1;
			i = i + X10_TEMP387;
		}
		m_regions = m_reg;
		m_REGIONs = m_REG;
		final Region3RefArray2 X10_TEMP392 = this
				.LevelData_getRegion3Array2(di);
		Region3RefArray2 temp_m_boundaries = X10_TEMP392;
		final Region2 RX10_TEMP119 = di.dReg;
		final int RX10_TEMP122 = 1;
		int RX10_TEMP120 = RX10_TEMP119.regSize;
		RX10_TEMP120 = RX10_TEMP120 - RX10_TEMP122;
		final int SX10_TEMP14 = 1;
		final int RX10_TEMP121 = RX10_TEMP120 + SX10_TEMP14;
		for (int SX10_TEMP15 = 0; SX10_TEMP15 < RX10_TEMP121; SX10_TEMP15++) {
			final int RX10_TEMP117 = SX10_TEMP15;
			final int RX10_TEMP123 = RX10_TEMP117;
			final Point2 RX10_TEMP118 = Program.regionOrdinalPoint2(
					RX10_TEMP119, RX10_TEMP123);
			final int j = RX10_TEMP118.f0;
			final int ii = RX10_TEMP118.f1;
			final int X10_TEMP395 = 0;
			final boolean X10_TEMP397 = j == X10_TEMP395;
			if (X10_TEMP397) {
				final Point1 RX10_TEMP124 = new Point1(ii);
				final Dist1 RX10_TEMP125 = m_reg.distValue;
				final Region1 RX10_TEMP126 = RX10_TEMP125.dReg;
				final int RX10_TEMP127 = Program.searchPointInRegion1(
						RX10_TEMP126, RX10_TEMP124);
				final int RX10_TEMP128 = 0;
				final boolean RX10_TEMP129 = RX10_TEMP127 < RX10_TEMP128;
				if (RX10_TEMP129) {
					String RX10_TEMP130 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP130);
				}
				final int RX10_TEMP131 = Program.getPlaceFromDist1(
						RX10_TEMP125, RX10_TEMP127);
				final int RX10_TEMP133 = /* here */0;
				final boolean RX10_TEMP134 = RX10_TEMP131 != RX10_TEMP133;
				if (RX10_TEMP134) {
					String RX10_TEMP132 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP132);
				}
				final Region3 RX10_TEMP135 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP127);
				final Region3 X10_TEMP401 = RX10_TEMP135;
				final int X10_TEMP403 = 0;
				final int X10_TEMP404 = 1;
				final int X10_TEMP406 = X10_TEMP403 + X10_TEMP404;
				final int X10_TEMP407 = 0;
				final int X10_TEMP428 = X10_TEMP407 - X10_TEMP406;
				final int X10_TEMP409 = 0;
				final int X10_TEMP410 = 0;
				final boolean X10_TEMP411 = X10_TEMP409 > X10_TEMP410;
				int X10_TEMP414 = 0;
				if (X10_TEMP411) {
					X10_TEMP414 = 1;
				}
				final int X10_TEMP415 = X10_TEMP414;
				final int X10_TEMP416 = X10_TEMP415;
				final int X10_TEMP418 = 0;
				final int X10_TEMP419 = 1;
				final boolean X10_TEMP420 = X10_TEMP418 > X10_TEMP419;
				int X10_TEMP423 = 0;
				if (X10_TEMP420) {
					X10_TEMP423 = 1;
				}
				final int X10_TEMP424 = X10_TEMP423;
				final int X10_TEMP425 = X10_TEMP424;
				final int X10_TEMP429 = 0;
				final Region3 X10_TEMP432 = Program.Util_boundary(X10_TEMP401,
						X10_TEMP428, X10_TEMP416, X10_TEMP425, X10_TEMP429);
				final Region3 X10_TEMP433 = X10_TEMP432;
				final Point2 RX10_TEMP136 = new Point2(j, ii);
				final Dist2 RX10_TEMP137 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP138 = RX10_TEMP137.dReg;
				final int RX10_TEMP139 = Program.searchPointInRegion2(
						RX10_TEMP138, RX10_TEMP136);
				final int RX10_TEMP140 = 0;
				final boolean RX10_TEMP141 = RX10_TEMP139 < RX10_TEMP140;
				if (RX10_TEMP141) {
					String RX10_TEMP142 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP142);
				}
				final int RX10_TEMP143 = Program.getPlaceFromDist2(
						RX10_TEMP137, RX10_TEMP139);
				final int RX10_TEMP145 = /* here */0;
				final boolean RX10_TEMP146 = RX10_TEMP143 != RX10_TEMP145;
				if (RX10_TEMP146) {
					String RX10_TEMP144 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP144);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP139, X10_TEMP433);
			}
			final int X10_TEMP434 = 2;
			final boolean X10_TEMP436 = j == X10_TEMP434;
			if (X10_TEMP436) {
				final Point1 RX10_TEMP147 = new Point1(ii);
				final Dist1 RX10_TEMP148 = m_reg.distValue;
				final Region1 RX10_TEMP149 = RX10_TEMP148.dReg;
				final int RX10_TEMP150 = Program.searchPointInRegion1(
						RX10_TEMP149, RX10_TEMP147);
				final int RX10_TEMP151 = 0;
				final boolean RX10_TEMP152 = RX10_TEMP150 < RX10_TEMP151;
				if (RX10_TEMP152) {
					String RX10_TEMP153 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP153);
				}
				final int RX10_TEMP154 = Program.getPlaceFromDist1(
						RX10_TEMP148, RX10_TEMP150);
				final int RX10_TEMP156 = /* here */0;
				final boolean RX10_TEMP157 = RX10_TEMP154 != RX10_TEMP156;
				if (RX10_TEMP157) {
					String RX10_TEMP155 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP155);
				}
				final Region3 RX10_TEMP158 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP150);
				final Region3 X10_TEMP440 = RX10_TEMP158;
				final int X10_TEMP442 = 1;
				final int X10_TEMP443 = 1;
				final int X10_TEMP445 = X10_TEMP442 + X10_TEMP443;
				final int X10_TEMP446 = 0;
				final int X10_TEMP467 = X10_TEMP446 - X10_TEMP445;
				final int X10_TEMP448 = 1;
				final int X10_TEMP449 = 0;
				final boolean X10_TEMP450 = X10_TEMP448 > X10_TEMP449;
				int X10_TEMP453 = 0;
				if (X10_TEMP450) {
					X10_TEMP453 = 1;
				}
				final int X10_TEMP454 = X10_TEMP453;
				final int X10_TEMP455 = X10_TEMP454;
				final int X10_TEMP457 = 1;
				final int X10_TEMP458 = 1;
				final boolean X10_TEMP459 = X10_TEMP457 > X10_TEMP458;
				int X10_TEMP462 = 0;
				if (X10_TEMP459) {
					X10_TEMP462 = 1;
				}
				final int X10_TEMP463 = X10_TEMP462;
				final int X10_TEMP464 = X10_TEMP463;
				final int X10_TEMP468 = 0;
				final Region3 X10_TEMP471 = Program.Util_boundary(X10_TEMP440,
						X10_TEMP467, X10_TEMP455, X10_TEMP464, X10_TEMP468);
				final Region3 X10_TEMP472 = X10_TEMP471;
				final Point2 RX10_TEMP159 = new Point2(j, ii);
				final Dist2 RX10_TEMP160 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP161 = RX10_TEMP160.dReg;
				final int RX10_TEMP162 = Program.searchPointInRegion2(
						RX10_TEMP161, RX10_TEMP159);
				final int RX10_TEMP163 = 0;
				final boolean RX10_TEMP164 = RX10_TEMP162 < RX10_TEMP163;
				if (RX10_TEMP164) {
					String RX10_TEMP165 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP165);
				}
				final int RX10_TEMP166 = Program.getPlaceFromDist2(
						RX10_TEMP160, RX10_TEMP162);
				final int RX10_TEMP168 = /* here */0;
				final boolean RX10_TEMP169 = RX10_TEMP166 != RX10_TEMP168;
				if (RX10_TEMP169) {
					String RX10_TEMP167 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP167);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP162, X10_TEMP472);
			}
			final int X10_TEMP473 = 4;
			final boolean X10_TEMP475 = j == X10_TEMP473;
			if (X10_TEMP475) {
				final Point1 RX10_TEMP170 = new Point1(ii);
				final Dist1 RX10_TEMP171 = m_reg.distValue;
				final Region1 RX10_TEMP172 = RX10_TEMP171.dReg;
				final int RX10_TEMP173 = Program.searchPointInRegion1(
						RX10_TEMP172, RX10_TEMP170);
				final int RX10_TEMP174 = 0;
				final boolean RX10_TEMP175 = RX10_TEMP173 < RX10_TEMP174;
				if (RX10_TEMP175) {
					String RX10_TEMP176 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP176);
				}
				final int RX10_TEMP177 = Program.getPlaceFromDist1(
						RX10_TEMP171, RX10_TEMP173);
				final int RX10_TEMP179 = /* here */0;
				final boolean RX10_TEMP180 = RX10_TEMP177 != RX10_TEMP179;
				if (RX10_TEMP180) {
					String RX10_TEMP178 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP178);
				}
				final Region3 RX10_TEMP181 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP173);
				final Region3 X10_TEMP479 = RX10_TEMP181;
				final int X10_TEMP481 = 2;
				final int X10_TEMP482 = 1;
				final int X10_TEMP484 = X10_TEMP481 + X10_TEMP482;
				final int X10_TEMP485 = 0;
				final int X10_TEMP506 = X10_TEMP485 - X10_TEMP484;
				final int X10_TEMP487 = 2;
				final int X10_TEMP488 = 0;
				final boolean X10_TEMP489 = X10_TEMP487 > X10_TEMP488;
				int X10_TEMP492 = 0;
				if (X10_TEMP489) {
					X10_TEMP492 = 1;
				}
				final int X10_TEMP493 = X10_TEMP492;
				final int X10_TEMP494 = X10_TEMP493;
				final int X10_TEMP496 = 2;
				final int X10_TEMP497 = 1;
				final boolean X10_TEMP498 = X10_TEMP496 > X10_TEMP497;
				int X10_TEMP501 = 0;
				if (X10_TEMP498) {
					X10_TEMP501 = 1;
				}
				final int X10_TEMP502 = X10_TEMP501;
				final int X10_TEMP503 = X10_TEMP502;
				final int X10_TEMP507 = 0;
				final Region3 X10_TEMP510 = Program.Util_boundary(X10_TEMP479,
						X10_TEMP506, X10_TEMP494, X10_TEMP503, X10_TEMP507);
				final Region3 X10_TEMP511 = X10_TEMP510;
				final Point2 RX10_TEMP182 = new Point2(j, ii);
				final Dist2 RX10_TEMP183 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP184 = RX10_TEMP183.dReg;
				final int RX10_TEMP185 = Program.searchPointInRegion2(
						RX10_TEMP184, RX10_TEMP182);
				final int RX10_TEMP186 = 0;
				final boolean RX10_TEMP187 = RX10_TEMP185 < RX10_TEMP186;
				if (RX10_TEMP187) {
					String RX10_TEMP188 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP188);
				}
				final int RX10_TEMP189 = Program.getPlaceFromDist2(
						RX10_TEMP183, RX10_TEMP185);
				final int RX10_TEMP191 = /* here */0;
				final boolean RX10_TEMP192 = RX10_TEMP189 != RX10_TEMP191;
				if (RX10_TEMP192) {
					String RX10_TEMP190 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP190);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP185, X10_TEMP511);
			}
			final int X10_TEMP512 = 1;
			final boolean X10_TEMP514 = j == X10_TEMP512;
			if (X10_TEMP514) {
				final Point1 RX10_TEMP193 = new Point1(ii);
				final Dist1 RX10_TEMP194 = m_reg.distValue;
				final Region1 RX10_TEMP195 = RX10_TEMP194.dReg;
				final int RX10_TEMP196 = Program.searchPointInRegion1(
						RX10_TEMP195, RX10_TEMP193);
				final int RX10_TEMP197 = 0;
				final boolean RX10_TEMP198 = RX10_TEMP196 < RX10_TEMP197;
				if (RX10_TEMP198) {
					String RX10_TEMP199 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP199);
				}
				final int RX10_TEMP200 = Program.getPlaceFromDist1(
						RX10_TEMP194, RX10_TEMP196);
				final int RX10_TEMP202 = /* here */0;
				final boolean RX10_TEMP203 = RX10_TEMP200 != RX10_TEMP202;
				if (RX10_TEMP203) {
					String RX10_TEMP201 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP201);
				}
				final Region3 RX10_TEMP204 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP196);
				final Region3 X10_TEMP518 = RX10_TEMP204;
				final int X10_TEMP520 = 0;
				final int X10_TEMP521 = 1;
				final int X10_TEMP523 = X10_TEMP520 + X10_TEMP521;
				final int X10_TEMP525 = 0;
				final int X10_TEMP526 = 0;
				final boolean X10_TEMP527 = X10_TEMP525 > X10_TEMP526;
				int X10_TEMP530 = 0;
				if (X10_TEMP527) {
					X10_TEMP530 = 1;
				}
				final int X10_TEMP531 = X10_TEMP530;
				final int X10_TEMP532 = X10_TEMP531;
				final int X10_TEMP534 = 0;
				final int X10_TEMP535 = 1;
				final boolean X10_TEMP536 = X10_TEMP534 > X10_TEMP535;
				int X10_TEMP539 = 0;
				if (X10_TEMP536) {
					X10_TEMP539 = 1;
				}
				final int X10_TEMP540 = X10_TEMP539;
				final int X10_TEMP541 = X10_TEMP540;
				final int X10_TEMP544 = 0;
				final Region3 X10_TEMP547 = Program.Util_boundary(X10_TEMP518,
						X10_TEMP523, X10_TEMP532, X10_TEMP541, X10_TEMP544);
				final Region3 X10_TEMP548 = X10_TEMP547;
				final Point2 RX10_TEMP205 = new Point2(j, ii);
				final Dist2 RX10_TEMP206 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP207 = RX10_TEMP206.dReg;
				final int RX10_TEMP208 = Program.searchPointInRegion2(
						RX10_TEMP207, RX10_TEMP205);
				final int RX10_TEMP209 = 0;
				final boolean RX10_TEMP210 = RX10_TEMP208 < RX10_TEMP209;
				if (RX10_TEMP210) {
					String RX10_TEMP211 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP211);
				}
				final int RX10_TEMP212 = Program.getPlaceFromDist2(
						RX10_TEMP206, RX10_TEMP208);
				final int RX10_TEMP214 = /* here */0;
				final boolean RX10_TEMP215 = RX10_TEMP212 != RX10_TEMP214;
				if (RX10_TEMP215) {
					String RX10_TEMP213 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP213);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP208, X10_TEMP548);
			}
			final int X10_TEMP549 = 3;
			final boolean X10_TEMP551 = j == X10_TEMP549;
			if (X10_TEMP551) {
				final Point1 RX10_TEMP216 = new Point1(ii);
				final Dist1 RX10_TEMP217 = m_reg.distValue;
				final Region1 RX10_TEMP218 = RX10_TEMP217.dReg;
				final int RX10_TEMP219 = Program.searchPointInRegion1(
						RX10_TEMP218, RX10_TEMP216);
				final int RX10_TEMP220 = 0;
				final boolean RX10_TEMP221 = RX10_TEMP219 < RX10_TEMP220;
				if (RX10_TEMP221) {
					String RX10_TEMP222 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP222);
				}
				final int RX10_TEMP223 = Program.getPlaceFromDist1(
						RX10_TEMP217, RX10_TEMP219);
				final int RX10_TEMP225 = /* here */0;
				final boolean RX10_TEMP226 = RX10_TEMP223 != RX10_TEMP225;
				if (RX10_TEMP226) {
					String RX10_TEMP224 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP224);
				}
				final Region3 RX10_TEMP227 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP219);
				final Region3 X10_TEMP555 = RX10_TEMP227;
				final int X10_TEMP557 = 1;
				final int X10_TEMP558 = 1;
				final int X10_TEMP560 = X10_TEMP557 + X10_TEMP558;
				final int X10_TEMP562 = 1;
				final int X10_TEMP563 = 0;
				final boolean X10_TEMP564 = X10_TEMP562 > X10_TEMP563;
				int X10_TEMP567 = 0;
				if (X10_TEMP564) {
					X10_TEMP567 = 1;
				}
				final int X10_TEMP568 = X10_TEMP567;
				final int X10_TEMP569 = X10_TEMP568;
				final int X10_TEMP571 = 1;
				final int X10_TEMP572 = 1;
				final boolean X10_TEMP573 = X10_TEMP571 > X10_TEMP572;
				int X10_TEMP576 = 0;
				if (X10_TEMP573) {
					X10_TEMP576 = 1;
				}
				final int X10_TEMP577 = X10_TEMP576;
				final int X10_TEMP578 = X10_TEMP577;
				final int X10_TEMP581 = 0;
				final Region3 X10_TEMP584 = Program.Util_boundary(X10_TEMP555,
						X10_TEMP560, X10_TEMP569, X10_TEMP578, X10_TEMP581);
				final Region3 X10_TEMP585 = X10_TEMP584;
				final Point2 RX10_TEMP228 = new Point2(j, ii);
				final Dist2 RX10_TEMP229 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP230 = RX10_TEMP229.dReg;
				final int RX10_TEMP231 = Program.searchPointInRegion2(
						RX10_TEMP230, RX10_TEMP228);
				final int RX10_TEMP232 = 0;
				final boolean RX10_TEMP233 = RX10_TEMP231 < RX10_TEMP232;
				if (RX10_TEMP233) {
					String RX10_TEMP234 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP234);
				}
				final int RX10_TEMP235 = Program.getPlaceFromDist2(
						RX10_TEMP229, RX10_TEMP231);
				final int RX10_TEMP237 = /* here */0;
				final boolean RX10_TEMP238 = RX10_TEMP235 != RX10_TEMP237;
				if (RX10_TEMP238) {
					String RX10_TEMP236 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP236);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP231, X10_TEMP585);
			}
			final int X10_TEMP586 = 5;
			final boolean X10_TEMP588 = j == X10_TEMP586;
			if (X10_TEMP588) {
				final Point1 RX10_TEMP239 = new Point1(ii);
				final Dist1 RX10_TEMP240 = m_reg.distValue;
				final Region1 RX10_TEMP241 = RX10_TEMP240.dReg;
				final int RX10_TEMP242 = Program.searchPointInRegion1(
						RX10_TEMP241, RX10_TEMP239);
				final int RX10_TEMP243 = 0;
				final boolean RX10_TEMP244 = RX10_TEMP242 < RX10_TEMP243;
				if (RX10_TEMP244) {
					String RX10_TEMP245 = "Array access index out of bounds";
					throw new RuntimeException(RX10_TEMP245);
				}
				final int RX10_TEMP246 = Program.getPlaceFromDist1(
						RX10_TEMP240, RX10_TEMP242);
				final int RX10_TEMP248 = /* here */0;
				final boolean RX10_TEMP249 = RX10_TEMP246 != RX10_TEMP248;
				if (RX10_TEMP249) {
					String RX10_TEMP247 = "Bad place access for array m_reg";
					throw new RuntimeException(RX10_TEMP247);
				}
				final Region3 RX10_TEMP250 = Program.getRefArrayValue1Region3(
						m_reg, RX10_TEMP242);
				final Region3 X10_TEMP592 = RX10_TEMP250;
				final int X10_TEMP594 = 2;
				final int X10_TEMP595 = 1;
				final int X10_TEMP597 = X10_TEMP594 + X10_TEMP595;
				final int X10_TEMP599 = 2;
				final int X10_TEMP600 = 0;
				final boolean X10_TEMP601 = X10_TEMP599 > X10_TEMP600;
				int X10_TEMP604 = 0;
				if (X10_TEMP601) {
					X10_TEMP604 = 1;
				}
				final int X10_TEMP605 = X10_TEMP604;
				final int X10_TEMP606 = X10_TEMP605;
				final int X10_TEMP608 = 2;
				final int X10_TEMP609 = 1;
				final boolean X10_TEMP610 = X10_TEMP608 > X10_TEMP609;
				int X10_TEMP613 = 0;
				if (X10_TEMP610) {
					X10_TEMP613 = 1;
				}
				final int X10_TEMP614 = X10_TEMP613;
				final int X10_TEMP615 = X10_TEMP614;
				final int X10_TEMP618 = 0;
				final Region3 X10_TEMP621 = Program.Util_boundary(X10_TEMP592,
						X10_TEMP597, X10_TEMP606, X10_TEMP615, X10_TEMP618);
				final Region3 X10_TEMP622 = X10_TEMP621;
				final Point2 RX10_TEMP251 = new Point2(j, ii);
				final Dist2 RX10_TEMP252 = temp_m_boundaries.distValue;
				final Region2 RX10_TEMP253 = RX10_TEMP252.dReg;
				final int RX10_TEMP254 = Program.searchPointInRegion2(
						RX10_TEMP253, RX10_TEMP251);
				final int RX10_TEMP255 = 0;
				final boolean RX10_TEMP256 = RX10_TEMP254 < RX10_TEMP255;
				if (RX10_TEMP256) {
					String RX10_TEMP257 = "Array index out of bounds";
					throw new RuntimeException(RX10_TEMP257);
				}
				final int RX10_TEMP258 = Program.getPlaceFromDist2(
						RX10_TEMP252, RX10_TEMP254);
				final int RX10_TEMP260 = /* here */0;
				final boolean RX10_TEMP261 = RX10_TEMP258 != RX10_TEMP260;
				if (RX10_TEMP261) {
					String RX10_TEMP259 = "Bad place access for array temp_m_boundaries";
					throw new RuntimeException(RX10_TEMP259);
				}
				Program.setRefArrayValue2Region3(temp_m_boundaries,
						RX10_TEMP254, X10_TEMP622);
			}
		}
		m_boundaries = temp_m_boundaries;
		final WrapperRefArray1 temp_m_u = this
				.LevelData_getWrapperArray(ALLPLACES);
		m_u = temp_m_u;
		final int X10_TEMP632 = 0;
		final int X10_TEMP629 = Program._LevelData_N_PLACES;
		final int X10_TEMP630 = 1;
		final int X10_TEMP633 = X10_TEMP629 - X10_TEMP630;
		final Region1 X10_TEMP635 = Program.createNewRegion1R(X10_TEMP632,
				X10_TEMP633);
		final int RX10_TEMP266 = 1;
		int RX10_TEMP264 = X10_TEMP635.regSize;
		RX10_TEMP264 = RX10_TEMP264 - RX10_TEMP266;
		final int SX10_TEMP16 = 1;
		final int RX10_TEMP265 = RX10_TEMP264 + SX10_TEMP16;
		for (int SX10_TEMP17 = 0; SX10_TEMP17 < RX10_TEMP265; SX10_TEMP17++) {
			final int RX10_TEMP262 = SX10_TEMP17;
			final int RX10_TEMP267 = RX10_TEMP262;
			final Point1 RX10_TEMP263 = Program.regionOrdinalPoint1(
					X10_TEMP635, RX10_TEMP267);
			final int k = RX10_TEMP263.f0;
			final Point1 RX10_TEMP268 = new Point1(k);
			final Dist1 RX10_TEMP269 = temp_m_DIST.distValue;
			final Region1 RX10_TEMP270 = RX10_TEMP269.dReg;
			final int RX10_TEMP271 = Program.searchPointInRegion1(RX10_TEMP270,
					RX10_TEMP268);
			final int RX10_TEMP272 = 0;
			final boolean RX10_TEMP273 = RX10_TEMP271 < RX10_TEMP272;
			if (RX10_TEMP273) {
				String RX10_TEMP274 = "Array access index out of bounds";
				throw new RuntimeException(RX10_TEMP274);
			}
			final int RX10_TEMP275 = Program.getPlaceFromDist1(RX10_TEMP269,
					RX10_TEMP271);
			final int RX10_TEMP277 = /* here */0;
			final boolean RX10_TEMP278 = RX10_TEMP275 != RX10_TEMP277;
			if (RX10_TEMP278) {
				String RX10_TEMP276 = "Bad place access for array temp_m_DIST";
				throw new RuntimeException(RX10_TEMP276);
			}
			final Dist3 RX10_TEMP279 = Program.getRefArrayValue1Dist3(
					temp_m_DIST, RX10_TEMP271);
			final Dist3 X10_TEMP637 = RX10_TEMP279;
			final Dist3 disi = X10_TEMP637; /* finish */
			{
				final Dist1 RX10_TEMP280 = temp_m_u.distValue;
				final Dist1 X10_TEMP639 = RX10_TEMP280;
				final Point1 RX10_TEMP281 = new Point1(k);
				final Region1 RX10_TEMP282 = X10_TEMP639.dReg;
				final int RX10_TEMP283 = Program.searchPointInRegion1(
						RX10_TEMP282, RX10_TEMP281);
				final int RX10_TEMP284 = 0;
				final boolean RX10_TEMP285 = RX10_TEMP283 < RX10_TEMP284;
				if (RX10_TEMP285) {
					final String RX10_TEMP286 = "Point RX10_TEMP281 not found in the distribution X10_TEMP639.";
					throw new RuntimeException(RX10_TEMP286);
				}
				final int RX10_TEMP287 = Program.getPlaceFromDist1(X10_TEMP639,
						RX10_TEMP283);
				final int X10_TEMP642 = RX10_TEMP287; /* async ( X10_TEMP642 ) */
				{
					doubleRefArray3 X10_TEMP647 = this
							.LevelData_getDoubleArray(disi);
					final Wrapper X10_TEMP650 = new Wrapper(X10_TEMP647);
					final Wrapper X10_TEMP651 = X10_TEMP650;
					final Point1 RX10_TEMP288 = new Point1(k);
					final Dist1 RX10_TEMP289 = temp_m_u.distValue;
					final Region1 RX10_TEMP290 = RX10_TEMP289.dReg;
					final int RX10_TEMP291 = Program.searchPointInRegion1(
							RX10_TEMP290, RX10_TEMP288);
					final int RX10_TEMP292 = 0;
					final boolean RX10_TEMP293 = RX10_TEMP291 < RX10_TEMP292;
					if (RX10_TEMP293) {
						String RX10_TEMP294 = "Array index out of bounds";
						throw new RuntimeException(RX10_TEMP294);
					}
					final int RX10_TEMP295 = Program.getPlaceFromDist1(
							RX10_TEMP289, RX10_TEMP291);
					final int RX10_TEMP297 = /* here */0;
					final boolean RX10_TEMP298 = RX10_TEMP295 != RX10_TEMP297;
					if (RX10_TEMP298) {
						String RX10_TEMP296 = "Bad place access for array temp_m_u";
						throw new RuntimeException(RX10_TEMP296);
					}
					Program.setRefArrayValue1Wrapper(temp_m_u, RX10_TEMP291,
							X10_TEMP651);
				}
			}
		}
	}

	public Dist3RefArray1 LevelData_getDist3Array(final Dist1 d) {
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Dist3Stub[] RX10_TEMP6 = new Dist3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Dist3[] RX10_TEMP14 = new Dist3[RX10_TEMP13];
					final Dist3Stub RX10_TEMP15 = new Dist3Stub(RX10_TEMP14); /*
																			 * async
																			 * (
																			 * RX10_TEMP8
																			 * )
																			 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Dist3Stub[] SX10_TEMP6 = new Dist3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Dist3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Dist3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Dist3RefArray1 RX10_TEMP19 = new Dist3RefArray1(d, RX10_TEMP16);
		final Dist3RefArray1 X10_TEMP1 = RX10_TEMP19;
		return X10_TEMP1;
	}

	public Region3RefArray1 LevelData_getRegion3Array1(final Dist1 d) {
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Region3Stub[] RX10_TEMP6 = new Region3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Region3[] RX10_TEMP14 = new Region3[RX10_TEMP13];
					final Region3Stub RX10_TEMP15 = new Region3Stub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Region3Stub[] SX10_TEMP6 = new Region3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Region3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Region3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1(d,
				RX10_TEMP16);
		final Region3RefArray1 X10_TEMP1 = RX10_TEMP19;
		return X10_TEMP1;
	}

	public Region3RefArray2 LevelData_getRegion3Array2(final Dist2 d) {
		final Region2 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final Region3Stub[] RX10_TEMP6 = new Region3Stub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount2(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Region3[] RX10_TEMP14 = new Region3[RX10_TEMP13];
					final Region3Stub RX10_TEMP15 = new Region3Stub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final Region3Stub[] SX10_TEMP6 = new Region3Stub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final Region3Stub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final Region3Stub[] RX10_TEMP16 = SX10_TEMP6;
		final Region3RefArray2 RX10_TEMP19 = new Region3RefArray2(d,
				RX10_TEMP16);
		final Region3RefArray2 X10_TEMP1 = RX10_TEMP19;
		return X10_TEMP1;
	}

	public WrapperRefArray1 LevelData_getWrapperArray(final Dist1 d) {
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final WrapperStub[] RX10_TEMP6 = new WrapperStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4;
					final Wrapper[] RX10_TEMP14 = new Wrapper[RX10_TEMP13];
					final WrapperStub RX10_TEMP15 = new WrapperStub(RX10_TEMP14); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP15;
					}
				}
			}
		}
		final WrapperStub[] SX10_TEMP6 = new WrapperStub[RX10_TEMP4];
		final int SX10_TEMP8 = SX10_TEMP6.length;
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < SX10_TEMP8; SX10_TEMP7++) {
			final int RX10_TEMP18 = SX10_TEMP7;
			final WrapperStub RX10_TEMP17 = RX10_TEMP6[RX10_TEMP18];
			SX10_TEMP6[RX10_TEMP18] = RX10_TEMP17;
		}
		final WrapperStub[] RX10_TEMP16 = SX10_TEMP6;
		final WrapperRefArray1 RX10_TEMP19 = new WrapperRefArray1(d,
				RX10_TEMP16);
		final WrapperRefArray1 X10_TEMP2 = RX10_TEMP19;
		return X10_TEMP2;
	}

	public doubleRefArray3 LevelData_getDoubleArray(final Dist3 d) {
		final Region3 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount3(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP4;
					final double[] SX10_TEMP5 = new double[RX10_TEMP14];
					final int SX10_TEMP7 = SX10_TEMP5.length;
					for (int SX10_TEMP6 = 0; SX10_TEMP6 < SX10_TEMP7; SX10_TEMP6++) {
						final int RX10_TEMP13 = SX10_TEMP6;
						final double X10_TEMP2 = 0;
						SX10_TEMP5[RX10_TEMP13] = X10_TEMP2;
					}
					final double[] RX10_TEMP15 = SX10_TEMP5;
					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP8 = new doubleStub[RX10_TEMP4];
		final int SX10_TEMP10 = SX10_TEMP8.length;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < SX10_TEMP10; SX10_TEMP9++) {
			final int RX10_TEMP19 = SX10_TEMP9;
			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			SX10_TEMP8[RX10_TEMP19] = RX10_TEMP18;
		}
		final doubleStub[] RX10_TEMP17 = SX10_TEMP8;
		final doubleRefArray3 RX10_TEMP20 = new doubleRefArray3(d, RX10_TEMP17);
		final doubleRefArray3 X10_TEMP4 = RX10_TEMP20;
		return X10_TEMP4;
	}
}

class MGDriver {
}

class MGOP {
	public final boolean EXCHANGE_After;
	public final int m_size;
	public final Region3 m_problemDomain;
	public final int m_levels;
	public LevelDataRefArray1 m_r;
	public LevelDataRefArray1 m_z;
	public LevelData m_tempLD;

	public MGOP(final int a_size) {
		boolean temp_EXCHANGE_After = false;
		final boolean X10_TEMP3 = Program._Util_OVERLAP_COMMANDCOMP;
		if (X10_TEMP3) {
			final boolean X10_TEMP5 = false;
			temp_EXCHANGE_After = X10_TEMP5;
		} else {
			final boolean X10_TEMP7 = Program._Util_EXCHANGE_AFTER;
			temp_EXCHANGE_After = X10_TEMP7;
		}
		EXCHANGE_After = temp_EXCHANGE_After;
		int i = 0;
		int j = 0;
		int k = 0;
		m_size = a_size;
		final int X10_TEMP16 = 0;
		final int X10_TEMP14 = 1;
		final int X10_TEMP17 = a_size - X10_TEMP14;
		final int X10_TEMP21 = 0;
		final int X10_TEMP19 = 1;
		final int X10_TEMP22 = a_size - X10_TEMP19;
		final int X10_TEMP26 = 0;
		final int X10_TEMP24 = 1;
		final int X10_TEMP27 = a_size - X10_TEMP24;
		final Region3 X10_TEMP29 = Program.createNewRegion3RRR(X10_TEMP16,
				X10_TEMP17, X10_TEMP21, X10_TEMP22, X10_TEMP26, X10_TEMP27);
		m_problemDomain = X10_TEMP29;
		final int log_a_size = Program.Util_log2(a_size);
		m_levels = log_a_size;
		final int X10_TEMP33 = Program._MGOP_P2SLEVEL;
		final int X10_TEMP34 = 0;
		final boolean X10_TEMP36 = X10_TEMP33 > X10_TEMP34;
		if (X10_TEMP36) {
			final int X10_TEMP38 = Program._MGOP_P2SLEVEL;
			final int X10_TEMP40 = Program.Util_pow2(X10_TEMP38);
			i = X10_TEMP40;
			final int X10_TEMP41 = i * i;
			final int X10_TEMP43 = X10_TEMP41 * i;
			j = X10_TEMP43;
		} else {
		}
		final int X10_TEMP46 = 0;
		final Region1 X10_TEMP47 = Program.createNewRegion1R(X10_TEMP46,
				log_a_size);
		final int X10_TEMP48 = /* here */0;
		final Dist1 d = Program.getPlaceDist1(X10_TEMP47, X10_TEMP48);
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final LevelDataStub[] RX10_TEMP6 = new LevelDataStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2;
				final Point1[] RX10_TEMP13 = Program.getDistLocalArray1(d,
						RX10_TEMP9); /* async ( RX10_TEMP10 ) */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP15 = RX10_TEMP12 + SX10_TEMP4;
					final LevelData[] SX10_TEMP5 = new LevelData[RX10_TEMP15];
					final int SX10_TEMP7 = SX10_TEMP5.length;
					for (int SX10_TEMP6 = 0; SX10_TEMP6 < SX10_TEMP7; SX10_TEMP6++) {
						final int RX10_TEMP14 = SX10_TEMP6;
						final Point1 p = RX10_TEMP13[RX10_TEMP14];
						final int X10_TEMP51 = p.f0;
						final int X10_TEMP52 = 1;
						final int X10_TEMP54 = X10_TEMP51 + X10_TEMP52;
						int X10_TEMP60 = Program.Util_pow2(X10_TEMP54);
						final int X10_TEMP57 = p.f0;
						final int X10_TEMP58 = Program._MGOP_P2SLEVEL;
						boolean X10_TEMP61 = X10_TEMP57 >= X10_TEMP58;
						final LevelData X10_TEMP63 = new LevelData(X10_TEMP60,
								X10_TEMP61);
						SX10_TEMP5[RX10_TEMP14] = X10_TEMP63;
					}
					final LevelData[] RX10_TEMP16 = SX10_TEMP5;
					final LevelDataStub RX10_TEMP17 = new LevelDataStub(
							RX10_TEMP16); /* async ( RX10_TEMP8 ) */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP17;
					}
				}
			}
		}
		final LevelDataStub[] SX10_TEMP8 = new LevelDataStub[RX10_TEMP4];
		final int SX10_TEMP10 = SX10_TEMP8.length;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < SX10_TEMP10; SX10_TEMP9++) {
			final int RX10_TEMP20 = SX10_TEMP9;
			final LevelDataStub RX10_TEMP19 = RX10_TEMP6[RX10_TEMP20];
			SX10_TEMP8[RX10_TEMP20] = RX10_TEMP19;
		}
		final LevelDataStub[] RX10_TEMP18 = SX10_TEMP8;
		final LevelDataRefArray1 RX10_TEMP21 = new LevelDataRefArray1(d,
				RX10_TEMP18);
		final LevelDataRefArray1 X10_TEMP65 = RX10_TEMP21;
		m_r = X10_TEMP65;
		final Region1 RX10_TEMP22 = d.dReg;
		final int RX10_TEMP23 = 0;
		final int RX10_TEMP24 = 1;
		int RX10_TEMP25 = /* place.MAX_PLACES */1;
		RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP24;
		final int SX10_TEMP11 = 1;
		final int RX10_TEMP26 = RX10_TEMP25 + SX10_TEMP11;
		final int SX10_TEMP12 = 1;
		final int RX10_TEMP27 = RX10_TEMP25 + SX10_TEMP12;
		final LevelDataStub[] RX10_TEMP28 = new LevelDataStub[RX10_TEMP27]; /* finish */
		{
			for (int SX10_TEMP14 = 0; SX10_TEMP14 < RX10_TEMP26; SX10_TEMP14++) {
				final int RX10_TEMP29 = SX10_TEMP14;
				final int RX10_TEMP30 = /* here */0;
				final int RX10_TEMP31 = RX10_TEMP29;
				final int RX10_TEMP32 = /* place.places ( RX10_TEMP31 ) */0;
				final int RX10_TEMP33 = Program.getDistLocalCount1(d,
						RX10_TEMP31);
				final int RX10_TEMP34 = RX10_TEMP33 - RX10_TEMP24;
				final Point1[] RX10_TEMP35 = Program.getDistLocalArray1(d,
						RX10_TEMP31); /* async ( RX10_TEMP32 ) */
				{
					final int SX10_TEMP15 = 1;
					final int RX10_TEMP37 = RX10_TEMP34 + SX10_TEMP15;
					final LevelData[] SX10_TEMP16 = new LevelData[RX10_TEMP37];
					final int SX10_TEMP18 = SX10_TEMP16.length;
					for (int SX10_TEMP17 = 0; SX10_TEMP17 < SX10_TEMP18; SX10_TEMP17++) {
						final int RX10_TEMP36 = SX10_TEMP17;
						final Point1 p = RX10_TEMP35[RX10_TEMP36];
						final int X10_TEMP67 = p.f0;
						final int X10_TEMP68 = 1;
						final int X10_TEMP70 = X10_TEMP67 + X10_TEMP68;
						int X10_TEMP76 = Program.Util_pow2(X10_TEMP70);
						final int X10_TEMP73 = p.f0;
						final int X10_TEMP74 = Program._MGOP_P2SLEVEL;
						boolean X10_TEMP77 = X10_TEMP73 >= X10_TEMP74;
						final LevelData X10_TEMP79 = new LevelData(X10_TEMP76,
								X10_TEMP77);
						SX10_TEMP16[RX10_TEMP36] = X10_TEMP79;
					}
					final LevelData[] RX10_TEMP38 = SX10_TEMP16;
					final LevelDataStub RX10_TEMP39 = new LevelDataStub(
							RX10_TEMP38); /* async ( RX10_TEMP30 ) */
					{
						RX10_TEMP28[RX10_TEMP29] = RX10_TEMP39;
					}
				}
			}
		}
		final LevelDataStub[] SX10_TEMP19 = new LevelDataStub[RX10_TEMP26];
		final int SX10_TEMP21 = SX10_TEMP19.length;
		for (int SX10_TEMP20 = 0; SX10_TEMP20 < SX10_TEMP21; SX10_TEMP20++) {
			final int RX10_TEMP42 = SX10_TEMP20;
			final LevelDataStub RX10_TEMP41 = RX10_TEMP28[RX10_TEMP42];
			SX10_TEMP19[RX10_TEMP42] = RX10_TEMP41;
		}
		final LevelDataStub[] RX10_TEMP40 = SX10_TEMP19;
		final LevelDataRefArray1 RX10_TEMP43 = new LevelDataRefArray1(d,
				RX10_TEMP40);
		final LevelDataRefArray1 X10_TEMP81 = RX10_TEMP43;
		m_z = X10_TEMP81;
		final int X10_TEMP82 = Program._MGOP_P2SLEVEL;
		final int X10_TEMP83 = 0;
		final boolean X10_TEMP85 = X10_TEMP82 > X10_TEMP83;
		if (X10_TEMP85) {
			final int X10_TEMP87 = Program._MGOP_P2SLEVEL;
			int X10_TEMP90 = Program.Util_pow2(X10_TEMP87);
			boolean X10_TEMP91 = true;
			final LevelData X10_TEMP93 = new LevelData(X10_TEMP90, X10_TEMP91);
			m_tempLD = X10_TEMP93;
		}
		final String X10_TEMP94 = "Overlapping communication and computation? ";
		final boolean X10_TEMP95 = Program._MGOP_OVERLAPPED;
		final String X10_TEMP96 = X10_TEMP94 + X10_TEMP95;
		final String X10_TEMP97 = ". If not, doing exchange after computation? ";
		final String X10_TEMP98 = X10_TEMP96 + X10_TEMP97;
		final String X10_TEMP100 = X10_TEMP98 + temp_EXCHANGE_After;
		System.out.println(X10_TEMP100);
	}
}

class Timer {
	public doubleRefArray1 start_time;
	public doubleRefArray1 elapsed_time;
	public doubleRefArray1 total_time;

	public Timer() {
		final int X10_TEMP3 = 0;
		final int X10_TEMP4 = Program._Timer_max_counters;
		final Region1 X10_TEMP5 = Program.createNewRegion1R(X10_TEMP3,
				X10_TEMP4);
		final int X10_TEMP6 = /* place.FIRST_PLACE */0;
		final Dist1 d = Program.getPlaceDist1(X10_TEMP5, X10_TEMP6);
		final Region1 RX10_TEMP0 = d.dReg;
		final int RX10_TEMP1 = 0;
		final int RX10_TEMP2 = 1;
		int RX10_TEMP3 = /* place.MAX_PLACES */1;
		RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2;
		final int SX10_TEMP0 = 1;
		final int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1;
		final doubleStub[] RX10_TEMP6 = new doubleStub[RX10_TEMP5]; /* finish */
		{
			for (int SX10_TEMP3 = 0; SX10_TEMP3 < RX10_TEMP4; SX10_TEMP3++) {
				final int RX10_TEMP7 = SX10_TEMP3;
				final int RX10_TEMP8 = /* here */0;
				final int RX10_TEMP9 = RX10_TEMP7;
				final int RX10_TEMP10 = /* place.places ( RX10_TEMP9 ) */0;
				final int RX10_TEMP11 = Program.getDistLocalCount1(d,
						RX10_TEMP9);
				final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2; /*
																 * async (
																 * RX10_TEMP10 )
																 */
				{
					final int SX10_TEMP4 = 1;
					final int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP4;
					final double[] SX10_TEMP5 = new double[RX10_TEMP14];
					final int SX10_TEMP7 = SX10_TEMP5.length;
					for (int SX10_TEMP6 = 0; SX10_TEMP6 < SX10_TEMP7; SX10_TEMP6++) {
						final int RX10_TEMP13 = SX10_TEMP6;
						final double X10_TEMP9 = 0;
						SX10_TEMP5[RX10_TEMP13] = X10_TEMP9;
					}
					final double[] RX10_TEMP15 = SX10_TEMP5;
					final doubleStub RX10_TEMP16 = new doubleStub(RX10_TEMP15); /*
																				 * async
																				 * (
																				 * RX10_TEMP8
																				 * )
																				 */
					{
						RX10_TEMP6[RX10_TEMP7] = RX10_TEMP16;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP8 = new doubleStub[RX10_TEMP4];
		final int SX10_TEMP10 = SX10_TEMP8.length;
		for (int SX10_TEMP9 = 0; SX10_TEMP9 < SX10_TEMP10; SX10_TEMP9++) {
			final int RX10_TEMP19 = SX10_TEMP9;
			final doubleStub RX10_TEMP18 = RX10_TEMP6[RX10_TEMP19];
			SX10_TEMP8[RX10_TEMP19] = RX10_TEMP18;
		}
		final doubleStub[] RX10_TEMP17 = SX10_TEMP8;
		final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1(d, RX10_TEMP17);
		final doubleRefArray1 X10_TEMP11 = RX10_TEMP20;
		start_time = X10_TEMP11;
		final Region1 RX10_TEMP21 = d.dReg;
		final int RX10_TEMP22 = 0;
		final int RX10_TEMP23 = 1;
		int RX10_TEMP24 = /* place.MAX_PLACES */1;
		RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23;
		final int SX10_TEMP11 = 1;
		final int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP11;
		final int SX10_TEMP12 = 1;
		final int RX10_TEMP26 = RX10_TEMP24 + SX10_TEMP12;
		final doubleStub[] RX10_TEMP27 = new doubleStub[RX10_TEMP26]; /* finish */
		{
			for (int SX10_TEMP14 = 0; SX10_TEMP14 < RX10_TEMP25; SX10_TEMP14++) {
				final int RX10_TEMP28 = SX10_TEMP14;
				final int RX10_TEMP29 = /* here */0;
				final int RX10_TEMP30 = RX10_TEMP28;
				final int RX10_TEMP31 = /* place.places ( RX10_TEMP30 ) */0;
				final int RX10_TEMP32 = Program.getDistLocalCount1(d,
						RX10_TEMP30);
				final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23; /*
																	 * async (
																	 * RX10_TEMP31
																	 * )
																	 */
				{
					final int SX10_TEMP15 = 1;
					final int RX10_TEMP35 = RX10_TEMP33 + SX10_TEMP15;
					final double[] SX10_TEMP16 = new double[RX10_TEMP35];
					final int SX10_TEMP18 = SX10_TEMP16.length;
					for (int SX10_TEMP17 = 0; SX10_TEMP17 < SX10_TEMP18; SX10_TEMP17++) {
						final int RX10_TEMP34 = SX10_TEMP17;
						final double X10_TEMP13 = 0;
						SX10_TEMP16[RX10_TEMP34] = X10_TEMP13;
					}
					final double[] RX10_TEMP36 = SX10_TEMP16;
					final doubleStub RX10_TEMP37 = new doubleStub(RX10_TEMP36); /*
																				 * async
																				 * (
																				 * RX10_TEMP29
																				 * )
																				 */
					{
						RX10_TEMP27[RX10_TEMP28] = RX10_TEMP37;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP19 = new doubleStub[RX10_TEMP25];
		final int SX10_TEMP21 = SX10_TEMP19.length;
		for (int SX10_TEMP20 = 0; SX10_TEMP20 < SX10_TEMP21; SX10_TEMP20++) {
			final int RX10_TEMP40 = SX10_TEMP20;
			final doubleStub RX10_TEMP39 = RX10_TEMP27[RX10_TEMP40];
			SX10_TEMP19[RX10_TEMP40] = RX10_TEMP39;
		}
		final doubleStub[] RX10_TEMP38 = SX10_TEMP19;
		final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1(d, RX10_TEMP38);
		final doubleRefArray1 X10_TEMP15 = RX10_TEMP41;
		elapsed_time = X10_TEMP15;
		final Region1 RX10_TEMP42 = d.dReg;
		final int RX10_TEMP43 = 0;
		final int RX10_TEMP44 = 1;
		int RX10_TEMP45 = /* place.MAX_PLACES */1;
		RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44;
		final int SX10_TEMP22 = 1;
		final int RX10_TEMP46 = RX10_TEMP45 + SX10_TEMP22;
		final int SX10_TEMP23 = 1;
		final int RX10_TEMP47 = RX10_TEMP45 + SX10_TEMP23;
		final doubleStub[] RX10_TEMP48 = new doubleStub[RX10_TEMP47]; /* finish */
		{
			for (int SX10_TEMP25 = 0; SX10_TEMP25 < RX10_TEMP46; SX10_TEMP25++) {
				final int RX10_TEMP49 = SX10_TEMP25;
				final int RX10_TEMP50 = /* here */0;
				final int RX10_TEMP51 = RX10_TEMP49;
				final int RX10_TEMP52 = /* place.places ( RX10_TEMP51 ) */0;
				final int RX10_TEMP53 = Program.getDistLocalCount1(d,
						RX10_TEMP51);
				final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44; /*
																	 * async (
																	 * RX10_TEMP52
																	 * )
																	 */
				{
					final int SX10_TEMP26 = 1;
					final int RX10_TEMP56 = RX10_TEMP54 + SX10_TEMP26;
					final double[] SX10_TEMP27 = new double[RX10_TEMP56];
					final int SX10_TEMP29 = SX10_TEMP27.length;
					for (int SX10_TEMP28 = 0; SX10_TEMP28 < SX10_TEMP29; SX10_TEMP28++) {
						final int RX10_TEMP55 = SX10_TEMP28;
						final double X10_TEMP17 = 0;
						SX10_TEMP27[RX10_TEMP55] = X10_TEMP17;
					}
					final double[] RX10_TEMP57 = SX10_TEMP27;
					final doubleStub RX10_TEMP58 = new doubleStub(RX10_TEMP57); /*
																				 * async
																				 * (
																				 * RX10_TEMP50
																				 * )
																				 */
					{
						RX10_TEMP48[RX10_TEMP49] = RX10_TEMP58;
					}
				}
			}
		}
		final doubleStub[] SX10_TEMP30 = new doubleStub[RX10_TEMP46];
		final int SX10_TEMP32 = SX10_TEMP30.length;
		for (int SX10_TEMP31 = 0; SX10_TEMP31 < SX10_TEMP32; SX10_TEMP31++) {
			final int RX10_TEMP61 = SX10_TEMP31;
			final doubleStub RX10_TEMP60 = RX10_TEMP48[RX10_TEMP61];
			SX10_TEMP30[RX10_TEMP61] = RX10_TEMP60;
		}
		final doubleStub[] RX10_TEMP59 = SX10_TEMP30;
		final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1(d, RX10_TEMP59);
		final doubleRefArray1 X10_TEMP19 = RX10_TEMP62;
		total_time = X10_TEMP19;
	}
}

class Util {
	public Util() {
	}
}

class Wrapper {
	public final doubleRefArray3 m_array;

	public Wrapper(final doubleRefArray3 a_array) {
		m_array = a_array;
	}
}

class Dist3Stub {
	public final Dist3[] localArray;

	public Dist3Stub(final Dist3[] localArray_) {
		localArray = localArray_;
	}
}

class Point3 {
	public final int f0;
	public final int f1;
	public final int f2;

	public Point3(final int f0_, final int f1_, final int f2_) {
		f0 = f0_;
		f1 = f1_;
		f2 = f2_;
	}
}

class doubleRefArray1 {
	public final Dist1 distValue;
	public final doubleStub[] contents;

	public doubleRefArray1(final Dist1 distValue_, final doubleStub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Dist {
	public final int[] placeArray;
	public final int[] counts;
	public final int[] runningSum;

	public Dist(final int[] vPlaceArray, final int arraySize) {
		final int one = 1;
		final int zero = 0;
		final int maxPlaces = /* place.MAX_PLACES */1;
		final int ub = maxPlaces - one;
		final int SX10_TEMP0 = 1;
		final int countReg = ub + SX10_TEMP0;
		final int SX10_TEMP1 = 1;
		final int countDist = ub + SX10_TEMP1;
		final int rSize = arraySize - one;
		final int SX10_TEMP2 = 1;
		final int arrayReg = rSize + SX10_TEMP2;
		final int SX10_TEMP3 = 1;
		final int runSumDist = rSize + SX10_TEMP3;
		final int[] tempCounts = new int[countDist];
		final int[] tempRunSum = new int[runSumDist];
		for (int SX10_TEMP6 = 0; SX10_TEMP6 < countReg; SX10_TEMP6++) {
			final int p = SX10_TEMP6;
			tempCounts[p] = zero;
		}
		for (int SX10_TEMP7 = 0; SX10_TEMP7 < arrayReg; SX10_TEMP7++) {
			final int p = SX10_TEMP7;
			final int pl = vPlaceArray[p];
			final int index = /* pl . id */0;
			final int oldVal = tempCounts[index];
			tempRunSum[p] = oldVal;
			final int oldValPlusOne = oldVal + one;
			tempCounts[index] = oldValPlusOne;
		}
		placeArray = vPlaceArray;
		counts = Program.initDist(tempCounts, countReg);
		runningSum = Program.initDist(tempRunSum, arrayReg);
	}
}

class doubleStub {
	public final double[] localArray;

	public doubleStub(final double[] localArray_) {
		localArray = localArray_;
	}
}

class Region1 {
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final Point1[] pointArray;

	public Region1(final Point1[] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 1;
		regSize = pointArray_.length;
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
	}

	public Region1(final Point1[] pointArray_, final int low0_, final int dim0_) {
		regRank = 1;
		regSize = pointArray_.length;
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
	}
}

class Region3 {
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final int low2;
	public final int dim2;
	public final Point3[] pointArray;

	public Region3(final Point3[] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 3;
		regSize = pointArray_.length;
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
		low1 = minusOne;
		dim1 = zero;
		low2 = minusOne;
		dim2 = zero;
	}

	public Region3(final Point3[] pointArray_, final int low0_,
			final int dim0_, final int low1_, final int dim1_, final int low2_,
			final int dim2_) {
		regRank = 3;
		regSize = pointArray_.length;
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

class Dist1 {
	public final Region1 dReg;
	public final Dist dDist;

	public Dist1(final Region1 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}
}

class WrapperStub {
	public final Wrapper[] localArray;

	public WrapperStub(final Wrapper[] localArray_) {
		localArray = localArray_;
	}
}

class doubleRefArray3 {
	public final Dist3 distValue;
	public final doubleStub[] contents;

	public doubleRefArray3(final Dist3 distValue_, final doubleStub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Point1 {
	public final int f0;

	public Point1(final int f0_) {
		f0 = f0_;
	}
}

class Point2 {
	public final int f0;
	public final int f1;

	public Point2(final int f0_, final int f1_) {
		f0 = f0_;
		f1 = f1_;
	}
}

class WrapperRefArray1 {
	public final Dist1 distValue;
	public final WrapperStub[] contents;

	public WrapperRefArray1(final Dist1 distValue_,
			final WrapperStub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Dist3 {
	public final Region3 dReg;
	public final Dist dDist;

	public Dist3(final Region3 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}
}

class Dist2 {
	public final Region2 dReg;
	public final Dist dDist;

	public Dist2(final Region2 dReg_, final Dist dDist_) {
		dReg = dReg_;
		dDist = dDist_;
	}
}

class LevelDataRefArray1 {
	public final Dist1 distValue;
	public final LevelDataStub[] contents;

	public LevelDataRefArray1(final Dist1 distValue_,
			final LevelDataStub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Region3Stub {
	public final Region3[] localArray;

	public Region3Stub(final Region3[] localArray_) {
		localArray = localArray_;
	}
}

class Region3RefArray2 {
	public final Dist2 distValue;
	public final Region3Stub[] contents;

	public Region3RefArray2(final Dist2 distValue_,
			final Region3Stub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class LevelDataStub {
	public final LevelData[] localArray;

	public LevelDataStub(final LevelData[] localArray_) {
		localArray = localArray_;
	}
}

class Region3RefArray1 {
	public final Dist1 distValue;
	public final Region3Stub[] contents;

	public Region3RefArray1(final Dist1 distValue_,
			final Region3Stub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Dist3RefArray1 {
	public final Dist1 distValue;
	public final Dist3Stub[] contents;

	public Dist3RefArray1(final Dist1 distValue_, final Dist3Stub[] contents_) {
		distValue = distValue_;
		contents = contents_;
	}
}

class Region2 {
	public final int regRank;
	public final int regSize;
	public final boolean regType;
	public final int low0;
	public final int dim0;
	public final int low1;
	public final int dim1;
	public final Point2[] pointArray;

	public Region2(final Point2[] pointArray_) {
		final int zero = 0;
		final int one = 1;
		final int minusOne = zero - one;
		regRank = 2;
		regSize = pointArray_.length;
		pointArray = pointArray_;
		regType = false;
		low0 = minusOne;
		dim0 = zero;
		low1 = minusOne;
		dim1 = zero;
	}

	public Region2(final Point2[] pointArray_, final int low0_,
			final int dim0_, final int low1_, final int dim1_) {
		regRank = 2;
		regSize = pointArray_.length;
		pointArray = pointArray_;
		regType = true;
		low0 = low0_;
		dim0 = dim0_;
		low1 = low1_;
		dim1 = dim1_;
	}
}

class Region3ValArray3 {
	public final Region3 regionValue;
	public final Region3[] contents;

	public Region3ValArray3(final Region3 regionValue_,
			final Region3[] contents_) {
		regionValue = regionValue_;
		contents = contents_;
	}
}