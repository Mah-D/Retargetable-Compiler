 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final Region1 _MGOP_reg = Program . _MGOP_reg_init ( ) ; public static final double _MGOP_Ac0 = Program . _MGOP_Ac0_init ( ) ; public static final double _MGOP_Ac1 = Program . _MGOP_Ac1_init ( ) ; public static final double _MGOP_Ac2 = Program . _MGOP_Ac2_init ( ) ; public static final double _MGOP_Ac3 = Program . _MGOP_Ac3_init ( ) ; public static final double _MGOP_Sac0 = Program . _MGOP_Sac0_init ( ) ; public static final double _MGOP_Sac1 = Program . _MGOP_Sac1_init ( ) ; public static final double _MGOP_Sac2 = Program . _MGOP_Sac2_init ( ) ; public static final double _MGOP_Sac3 = Program . _MGOP_Sac3_init ( ) ; public static final double _MGOP_Pc0 = Program . _MGOP_Pc0_init ( ) ; public static final double _MGOP_Pc1 = Program . _MGOP_Pc1_init ( ) ; public static final double _MGOP_Pc2 = Program . _MGOP_Pc2_init ( ) ; public static final double _MGOP_Pc3 = Program . _MGOP_Pc3_init ( ) ; public static final boolean _Util_PERF_OUTPUT = Program . _Util_PERF_OUTPUT_init ( ) ; public static final double _Util_CLOCK_SPEED = Program . _Util_CLOCK_SPEED_init ( ) ; public static final double _Util_FP_PERCLOCK = Program . _Util_FP_PERCLOCK_init ( ) ; public static final double _Util_COMM_LATENCY = Program . _Util_COMM_LATENCY_init ( ) ; public static final double _Util_COMM_BANDWIDTH = Program . _Util_COMM_BANDWIDTH_init ( ) ; public static final boolean _Util_IN_LOOP = Program . _Util_IN_LOOP_init ( ) ; public static final boolean _Util_COMP_ONLY = Program . _Util_COMP_ONLY_init ( ) ; public static final boolean _Util_COMM_ONLY = Program . _Util_COMM_ONLY_init ( ) ; public static final int _Util_THREADS_PERFOREACH = Program . _Util_THREADS_PERFOREACH_init ( ) ; public static final boolean _Util_OVERLAP_COMMANDCOMP = Program . _Util_OVERLAP_COMMANDCOMP_init ( ) ; public static final boolean _Util_EXCHANGE_AFTER = Program . _Util_EXCHANGE_AFTER_init ( ) ; public static final int _Util_P2SLEVEL = Program . _Util_P2SLEVEL_init ( ) ; public static final int _Util_N_PLACES = Program . _Util_N_PLACES_init ( ) ; public static final Region3 _Util_UNIT_CUBE = Program . _Util_UNIT_CUBE_init ( ) ; public static final int _Util_LOW = Program . _Util_LOW_init ( ) ; public static final int _Util_HIGH = Program . _Util_HIGH_init ( ) ; public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static final boolean _MGOP_PERF_On = Program . _MGOP_PERF_On_init ( ) ; public static final boolean _LevelData_PERF_On = Program . _LevelData_PERF_On_init ( ) ; public static final double _MGOP_PERF_Comp = Program . _MGOP_PERF_Comp_init ( ) ; public static final double _LevelData_PERF_Comp = Program . _LevelData_PERF_Comp_init ( ) ; public static final double _MGOP_PERF_CommL = Program . _MGOP_PERF_CommL_init ( ) ; public static final double _LevelData_PERF_CommL = Program . _LevelData_PERF_CommL_init ( ) ; public static final double _MGOP_PERF_CommB = Program . _MGOP_PERF_CommB_init ( ) ; public static final double _LevelData_PERF_CommB = Program . _LevelData_PERF_CommB_init ( ) ; public static final boolean _MGOP_PERF_InLoop = Program . _MGOP_PERF_InLoop_init ( ) ; public static final boolean _LevelData_PERF_InLoop = Program . _LevelData_PERF_InLoop_init ( ) ; public static final boolean _MGOP_PERF_CompOnly = Program . _MGOP_PERF_CompOnly_init ( ) ; public static final boolean _LevelData_PERF_CompOnly = Program . _LevelData_PERF_CompOnly_init ( ) ; public static final boolean _MGOP_PERF_CommOnly = Program . _MGOP_PERF_CommOnly_init ( ) ; public static final boolean _LevelData_PERF_CommOnly = Program . _LevelData_PERF_CommOnly_init ( ) ; public static final boolean _MGOP_OVERLAPPED = Program . _MGOP_OVERLAPPED_init ( ) ; public static final int _MGOP_P2SLEVEL = Program . _MGOP_P2SLEVEL_init ( ) ; public static final int _LevelData_N_PLACES = Program . _LevelData_N_PLACES_init ( ) ; public static final Region3ValArray3 _Util_QREGIONS = Program . _Util_QREGIONS_init ( ) ; public static final int _LevelData_LOW = Program . _LevelData_LOW_init ( ) ; public static final int _LevelData_HIGH = Program . _LevelData_HIGH_init ( ) ; public static boolean _MGOP_PERF_On_init ( ) { return _Util_PERF_OUTPUT ; }
 public static double _MGOP_PERF_Comp_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP3 = ( X10_TEMP1 / _Util_FP_PERCLOCK ) ; return X10_TEMP3 ; }
 public static double _MGOP_PERF_CommL_init ( ) { final double X10_TEMP2 = ( _Util_COMM_LATENCY * _Util_CLOCK_SPEED ) ; return X10_TEMP2 ; }
 public static double _MGOP_PERF_CommB_init ( ) { final double X10_TEMP1 = ( ( double ) _Util_CLOCK_SPEED ) ; final double X10_TEMP2 = ( ( double ) _Util_COMM_BANDWIDTH ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; final double X10_TEMP5 = ( 8.0 ) ; final double X10_TEMP7 = ( X10_TEMP4 * X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static boolean _MGOP_PERF_InLoop_init ( ) { return _Util_IN_LOOP ; }
 public static boolean _MGOP_PERF_CompOnly_init ( ) { return _Util_COMP_ONLY ; }
 public static boolean _MGOP_PERF_CommOnly_init ( ) { return _Util_COMM_ONLY ; }
 public static boolean _MGOP_OVERLAPPED_init ( ) { return _Util_OVERLAP_COMMANDCOMP ; }
 public static Region1 _MGOP_reg_init ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 3 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double _MGOP_Ac0_init ( ) { final double X10_TEMP1 = ( 8.0 ) ; final int X10_TEMP2 = 0 ; final double X10_TEMP3 = ( X10_TEMP2 - X10_TEMP1 ) ; final double X10_TEMP4 = ( 3.0 ) ; final double X10_TEMP6 = ( X10_TEMP3 / X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double _MGOP_Ac1_init ( ) { final double X10_TEMP2 = ( 0.0 ) ; return X10_TEMP2 ; }
 public static double _MGOP_Ac2_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 6.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Ac3_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 12.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Sac0_init ( ) { final double X10_TEMP1 = ( 3.0 ) ; final int X10_TEMP2 = 0 ; final double X10_TEMP3 = ( X10_TEMP2 - X10_TEMP1 ) ; final double X10_TEMP4 = ( 8.0 ) ; final double X10_TEMP6 = ( X10_TEMP3 / X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double _MGOP_Sac1_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 32.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Sac2_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final int X10_TEMP2 = 0 ; final double X10_TEMP3 = ( X10_TEMP2 - X10_TEMP1 ) ; final double X10_TEMP4 = ( 64.0 ) ; final double X10_TEMP6 = ( X10_TEMP3 / X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double _MGOP_Sac3_init ( ) { final double X10_TEMP2 = ( 0.0 ) ; return X10_TEMP2 ; }
 public static double _MGOP_Pc0_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 2.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Pc1_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 4.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Pc2_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 8.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _MGOP_Pc3_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP2 = ( 16.0 ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static int _MGOP_P2SLEVEL_init ( ) { final int X10_TEMP1 = ( 1 ) ; final int X10_TEMP3 = ( _Util_P2SLEVEL - X10_TEMP1 ) ; return X10_TEMP3 ; }
 public static void MGOP_computeResidual2 ( final MGOP X10_TEMP0 , final LevelData RES , final LevelData a_arg ) { finish { final Dist1 X10_TEMP2 = Program . LevelData_getPlaces ( RES ) ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T1 utmp1 = new T1(i, a_arg, RES);
 async (X10_TEMP4) {Program.thread1(utmp1); }
 }
 }
 final boolean X10_TEMP34 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP34 ) { finish { Program . LevelData_exchange ( RES ) ; }
 }
 }
 public static void MGOP_computeResidual3 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg1 , final LevelData a_arg2 ) { if ( _MGOP_OVERLAPPED ) { Program . MGOP_ComputeResidual_Overlapped ( X10_TEMP0 , a_res , a_arg1 , a_arg2 ) ; }
 else { Program . MGOP_ComputeResidual ( X10_TEMP0 , a_res , a_arg1 , a_arg2 ) ; }
 }
 public static void MGOP_ComputeResidual ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg1 , final LevelData a_arg2 ) { final boolean X10_TEMP1 = ( X10_TEMP0 . EXCHANGE_After ) ; final boolean X10_TEMP3 = ! X10_TEMP1 ; if ( X10_TEMP3 ) { finish { Program . LevelData_exchange ( a_arg2 ) ; }
 }
 finish { final Dist1 X10_TEMP5 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP5 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP6 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP6 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP5 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP6 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP5 , RX10_TEMP7 ) ; final place X10_TEMP7 = RX10_TEMP11 ; 
 final T2 utmp2 = new T2(i, a_arg2, a_arg1, a_res);
 async (X10_TEMP7) {Program.thread2(utmp2); }
 }
 }
 final boolean X10_TEMP37 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP37 ) { finish { Program . LevelData_exchange ( a_res ) ; }
 }
 }
 public static void MGOP_ComputeResidual_Overlapped1 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg1 , final LevelData a_arg2 ) { finish { Program . LevelData_exchange ( a_arg2 ) ; final Dist1 X10_TEMP2 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T3 utmp3 = new T3(i, a_arg2, a_arg1, a_res);
 async (X10_TEMP4) {Program.thread3(utmp3); }
 }
 }
 finish { final Dist1 X10_TEMP34 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP50 = X10_TEMP34 . dReg ; final int RX10_TEMP53 = 1 ; int RX10_TEMP51 = RX10_TEMP50 . regSize ; RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53 ; final region ( : rank==1 ) RX10_TEMP52 = [ 0 : RX10_TEMP51 ] ; for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP52 ) { final int RX10_TEMP54 = RX10_TEMP49 [0] ; final Point1 X10_TEMP35 = Program . regionOrdinalPoint1 ( RX10_TEMP50 , RX10_TEMP54 ) ; final int i = X10_TEMP35 . f0 ; final Region1 RX10_TEMP55 = X10_TEMP34 . dReg ; final int RX10_TEMP56 = Program . searchPointInRegion1 ( RX10_TEMP55 , X10_TEMP35 ) ; final int RX10_TEMP57 = 0 ; final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57 ; if ( RX10_TEMP58 ) { final String RX10_TEMP59 = "Point X10_TEMP35 not found in the distribution X10_TEMP34." ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final place RX10_TEMP60 = Program . getPlaceFromDist1 ( X10_TEMP34 , RX10_TEMP56 ) ; final place X10_TEMP36 = RX10_TEMP60 ; 
 final T4 utmp4 = new T4(i, a_arg2, a_arg1, a_res);
 async (X10_TEMP36) {Program.thread4(utmp4); }
 }
 }
 }
 public static void MGOP_ComputeResidual_Overlapped ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg1 , final LevelData a_arg2 ) { finish { final place X10_TEMP2 = here ; 
 final T5 utmp5 = new T5(a_arg2, a_arg1, a_res);
 async (X10_TEMP2) {Program.thread5(utmp5); }
 }
 }
 public static void MGOP_smooth ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final boolean a_isBottom ) { if ( _MGOP_OVERLAPPED ) { Program . MGOP_Smooth_Overlapped ( X10_TEMP0 , a_res , a_arg , a_isBottom ) ; }
 else { Program . MGOP_Smooth ( X10_TEMP0 , a_res , a_arg , a_isBottom ) ; }
 }
 public static void MGOP_Smooth ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final boolean a_isBottom ) { final boolean X10_TEMP1 = ( X10_TEMP0 . EXCHANGE_After ) ; final boolean X10_TEMP3 = ! X10_TEMP1 ; if ( X10_TEMP3 ) { finish { Program . LevelData_exchange ( a_arg ) ; }
 }
 finish { final Dist1 X10_TEMP5 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP5 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP6 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP6 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP5 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP6 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP5 , RX10_TEMP7 ) ; final place X10_TEMP7 = RX10_TEMP11 ; 
 final T6 utmp6 = new T6(i, a_arg, a_res);
 async (X10_TEMP7) {Program.thread6(utmp6); }
 }
 }
 final boolean X10_TEMP35 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP35 ) { finish { Program . LevelData_exchange ( a_res ) ; }
 }
 }
 public static void MGOP_Smooth_Overlapped1 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final boolean a_isBottom ) { finish { Program . LevelData_exchange ( a_arg ) ; final Dist1 X10_TEMP2 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T7 utmp7 = new T7(i, a_arg, a_res);
 async (X10_TEMP4) {Program.thread7(utmp7); }
 }
 }
 finish { final Dist1 X10_TEMP32 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP50 = X10_TEMP32 . dReg ; final int RX10_TEMP53 = 1 ; int RX10_TEMP51 = RX10_TEMP50 . regSize ; RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53 ; final region ( : rank==1 ) RX10_TEMP52 = [ 0 : RX10_TEMP51 ] ; for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP52 ) { final int RX10_TEMP54 = RX10_TEMP49 [0] ; final Point1 X10_TEMP33 = Program . regionOrdinalPoint1 ( RX10_TEMP50 , RX10_TEMP54 ) ; final int i = X10_TEMP33 . f0 ; final Region1 RX10_TEMP55 = X10_TEMP32 . dReg ; final int RX10_TEMP56 = Program . searchPointInRegion1 ( RX10_TEMP55 , X10_TEMP33 ) ; final int RX10_TEMP57 = 0 ; final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57 ; if ( RX10_TEMP58 ) { final String RX10_TEMP59 = "Point X10_TEMP33 not found in the distribution X10_TEMP32." ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final place RX10_TEMP60 = Program . getPlaceFromDist1 ( X10_TEMP32 , RX10_TEMP56 ) ; final place X10_TEMP34 = RX10_TEMP60 ; 
 final T8 utmp8 = new T8(i, a_arg, a_res);
 async (X10_TEMP34) {Program.thread8(utmp8); }
 }
 }
 }
 public static void MGOP_Smooth_Overlapped ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final boolean a_isBottom ) { finish { final place X10_TEMP2 = here ; 
 final T9 utmp9 = new T9(a_arg, a_res);
 async (X10_TEMP2) {Program.thread9(utmp9); }
 }
 }
 public static void MGOP_applyOpP3 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final int a_level ) { final boolean X10_TEMP2 = a_level == _MGOP_P2SLEVEL ; if ( X10_TEMP2 ) { final LevelData X10_TEMP5 = ( X10_TEMP0 . m_tempLD ) ; Program . MGOP_applyOpP2 ( X10_TEMP0 , X10_TEMP5 , a_arg ) ; final int X10_TEMP7 = ( 0 ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , X10_TEMP7 ) ; finish { final LevelData X10_TEMP9 = ( X10_TEMP0 . m_tempLD ) ; final Dist1 X10_TEMP11 = Program . LevelData_getPlaces ( X10_TEMP9 ) ; final Region1 RX10_TEMP1 = X10_TEMP11 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP12 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP12 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP11 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP12 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP12 not found in the distribution X10_TEMP11." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP7 ) ; final place X10_TEMP13 = RX10_TEMP11 ; 
 final T10 utmp10 = new T10(i, res, X10_TEMP0);
 async (X10_TEMP13) {Program.thread10(utmp10); }
 }
 }
 }
 else { Program . MGOP_applyOpP2 ( X10_TEMP0 , a_res , a_arg ) ; }
 final boolean X10_TEMP26 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP26 ) { finish { Program . LevelData_exchange ( a_res ) ; }
 }
 }
 public static void MGOP_applyOpP2 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { if ( _MGOP_OVERLAPPED ) { Program . MGOP_ApplyOpP_Overlapped ( X10_TEMP0 , a_res , a_arg ) ; }
 else { Program . MGOP_ApplyOpP ( X10_TEMP0 , a_res , a_arg ) ; }
 }
 public static void MGOP_ApplyOpP ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { final boolean X10_TEMP1 = ( X10_TEMP0 . EXCHANGE_After ) ; final boolean X10_TEMP3 = ! X10_TEMP1 ; if ( X10_TEMP3 ) { finish { Program . LevelData_exchange ( a_arg ) ; }
 }
 finish { final Dist1 X10_TEMP5 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP5 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP6 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP6 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP5 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP6 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP5 , RX10_TEMP7 ) ; final place X10_TEMP7 = RX10_TEMP11 ; 
 final T11 utmp11 = new T11(i, a_arg, a_res);
 async (X10_TEMP7) {Program.thread11(utmp11); }
 }
 }
 }
 public static void MGOP_ApplyOpP_Overlapped1 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { finish { Program . LevelData_exchange ( a_arg ) ; final Dist1 X10_TEMP2 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T12 utmp12 = new T12(i, a_arg, a_res);
 async (X10_TEMP4) {Program.thread12(utmp12); }
 }
 }
 finish { final Dist1 X10_TEMP43 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP45 = X10_TEMP43 . dReg ; final int RX10_TEMP48 = 1 ; int RX10_TEMP46 = RX10_TEMP45 . regSize ; RX10_TEMP46 = RX10_TEMP46 - RX10_TEMP48 ; final region ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP46 ] ; for ( point ( : rank==1 ) RX10_TEMP44 : RX10_TEMP47 ) { final int RX10_TEMP49 = RX10_TEMP44 [0] ; final Point1 X10_TEMP44 = Program . regionOrdinalPoint1 ( RX10_TEMP45 , RX10_TEMP49 ) ; final int i = X10_TEMP44 . f0 ; final Region1 RX10_TEMP50 = X10_TEMP43 . dReg ; final int RX10_TEMP51 = Program . searchPointInRegion1 ( RX10_TEMP50 , X10_TEMP44 ) ; final int RX10_TEMP52 = 0 ; final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; if ( RX10_TEMP53 ) { final String RX10_TEMP54 = "Point X10_TEMP44 not found in the distribution X10_TEMP43." ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final place RX10_TEMP55 = Program . getPlaceFromDist1 ( X10_TEMP43 , RX10_TEMP51 ) ; final place X10_TEMP45 = RX10_TEMP55 ; 
 final T13 utmp13 = new T13(i, a_arg, a_res);
 async (X10_TEMP45) {Program.thread13(utmp13); }
 }
 }
 }
 public static void MGOP_ApplyOpP_Overlapped ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { finish { final place X10_TEMP2 = here ; 
 final T14 utmp14 = new T14(a_arg, a_res);
 async (X10_TEMP2) {Program.thread14(utmp14); }
 }
 }
 public static void MGOP_applyOpQ3 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg , final int a_level ) { final int X10_TEMP1 = ( 1 ) ; final int X10_TEMP2 = ( _MGOP_P2SLEVEL - X10_TEMP1 ) ; final boolean X10_TEMP4 = a_level == X10_TEMP2 ; if ( X10_TEMP4 ) { final int X10_TEMP6 = ( 0 ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , X10_TEMP6 ) ; finish { final LevelData X10_TEMP8 = ( X10_TEMP0 . m_tempLD ) ; final Dist1 X10_TEMP10 = Program . LevelData_getPlaces ( X10_TEMP8 ) ; final Region1 RX10_TEMP1 = X10_TEMP10 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP11 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP11 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP10 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP11 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP11 not found in the distribution X10_TEMP10." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP10 , RX10_TEMP7 ) ; final place X10_TEMP12 = RX10_TEMP11 ; 
 final T15 utmp15 = new T15(i, arg, X10_TEMP0);
 async (X10_TEMP12) {Program.thread15(utmp15); }
 }
 }
 final LevelData X10_TEMP22 = ( X10_TEMP0 . m_tempLD ) ; Program . MGOP_applyOpQ2 ( X10_TEMP0 , a_res , X10_TEMP22 ) ; }
 else { Program . MGOP_applyOpQ2 ( X10_TEMP0 , a_res , a_arg ) ; }
 }
 public static void MGOP_applyOpQ2 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { if ( _MGOP_OVERLAPPED ) { Program . MGOP_ApplyOpQ_Overlapped ( X10_TEMP0 , a_res , a_arg ) ; }
 else { Program . MGOP_ApplyOpQ ( X10_TEMP0 , a_res , a_arg ) ; }
 }
 public static void MGOP_ApplyOpQ ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { final boolean X10_TEMP1 = ( X10_TEMP0 . EXCHANGE_After ) ; final boolean X10_TEMP3 = ! X10_TEMP1 ; if ( X10_TEMP3 ) { finish { Program . LevelData_exchange ( a_arg ) ; }
 }
 finish { final Dist1 X10_TEMP5 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP5 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP6 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP6 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP5 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP6 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP6 not found in the distribution X10_TEMP5." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP5 , RX10_TEMP7 ) ; final place X10_TEMP7 = RX10_TEMP11 ; 
 final T16 utmp16 = new T16(i, a_arg, a_res);
 async (X10_TEMP7) {Program.thread16(utmp16); }
 }
 }
 }
 public static void MGOP_ApplyOpQ_Overlapped1 ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { finish { Program . LevelData_exchange ( a_arg ) ; final Dist1 X10_TEMP2 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T17 utmp17 = new T17(i, a_arg, a_res);
 async (X10_TEMP4) {Program.thread17(utmp17); }
 }
 }
 finish { final Dist1 X10_TEMP48 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP74 = X10_TEMP48 . dReg ; final int RX10_TEMP77 = 1 ; int RX10_TEMP75 = RX10_TEMP74 . regSize ; RX10_TEMP75 = RX10_TEMP75 - RX10_TEMP77 ; final region ( : rank==1 ) RX10_TEMP76 = [ 0 : RX10_TEMP75 ] ; for ( point ( : rank==1 ) RX10_TEMP73 : RX10_TEMP76 ) { final int RX10_TEMP78 = RX10_TEMP73 [0] ; final Point1 X10_TEMP49 = Program . regionOrdinalPoint1 ( RX10_TEMP74 , RX10_TEMP78 ) ; final int i = X10_TEMP49 . f0 ; final Region1 RX10_TEMP79 = X10_TEMP48 . dReg ; final int RX10_TEMP80 = Program . searchPointInRegion1 ( RX10_TEMP79 , X10_TEMP49 ) ; final int RX10_TEMP81 = 0 ; final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81 ; if ( RX10_TEMP82 ) { final String RX10_TEMP83 = "Point X10_TEMP49 not found in the distribution X10_TEMP48." ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 final place RX10_TEMP84 = Program . getPlaceFromDist1 ( X10_TEMP48 , RX10_TEMP80 ) ; final place X10_TEMP50 = RX10_TEMP84 ; 
 final T18 utmp18 = new T18(i, a_arg, a_res);
 async (X10_TEMP50) {Program.thread18(utmp18); }
 }
 }
 }
 public static void MGOP_ApplyOpQ_Overlapped ( final MGOP X10_TEMP0 , final LevelData a_res , final LevelData a_arg ) { finish { final place X10_TEMP2 = here ; 
 final T19 utmp19 = new T19(a_arg, a_res);
 async (X10_TEMP2) {Program.thread19(utmp19); }
 }
 }
 public static double MGOP_MGSolve ( final MGOP X10_TEMP0 , final LevelData a_u , final LevelData a_v , final int a_its ) { final int X10_TEMP1 = ( X10_TEMP0 . m_levels ) ; final int X10_TEMP2 = ( 1 ) ; int l = ( X10_TEMP1 - X10_TEMP2 ) ; final LevelDataRefArray1 X10_TEMP4 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP0 = new Point1 ( l ) ; final Dist1 RX10_TEMP1 = X10_TEMP4 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP4" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final LevelData RX10_TEMP11 = Program . getRefArrayValue1LevelData ( X10_TEMP4 , RX10_TEMP3 ) ; final LevelData X10_TEMP6 = ( RX10_TEMP11 ) ; Program . LevelData_setLevelData ( X10_TEMP6 , a_v ) ; final String X10_TEMP11 = ( "The init residual norm is " ) ; final LevelDataRefArray1 X10_TEMP8 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP12 = new Point1 ( l ) ; final Dist1 RX10_TEMP13 = X10_TEMP8 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP8" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final LevelData RX10_TEMP23 = Program . getRefArrayValue1LevelData ( X10_TEMP8 , RX10_TEMP15 ) ; final LevelData X10_TEMP10 = ( RX10_TEMP23 ) ; final double X10_TEMP12 = ( Program . LevelData_norm2 ( X10_TEMP10 ) ) ; final String X10_TEMP14 = ( X10_TEMP11 + X10_TEMP12 ) ; System.out.println ( X10_TEMP14 ) ; double res = ( 0.0 ) ; int i = ( 0 ) ; boolean X10_TEMP19 = i < a_its ; while ( X10_TEMP19 ) { final String X10_TEMP20 = ( "Iteration " ) ; final String X10_TEMP22 = ( X10_TEMP20 + i ) ; System.out.println ( X10_TEMP22 ) ; Program . MGOP_MG ( X10_TEMP0 ) ; final LevelDataRefArray1 X10_TEMP23 = X10_TEMP0 . m_z ; final Point1 RX10_TEMP24 = new Point1 ( l ) ; final Dist1 RX10_TEMP25 = X10_TEMP23 . distValue ; final Region1 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , RX10_TEMP24 ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { String RX10_TEMP30 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; final place RX10_TEMP33 = here ; final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; if ( RX10_TEMP34 ) { String RX10_TEMP32 = "Bad place access for array X10_TEMP23" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final LevelData RX10_TEMP35 = Program . getRefArrayValue1LevelData ( X10_TEMP23 , RX10_TEMP27 ) ; final LevelData X10_TEMP26 = ( RX10_TEMP35 ) ; Program . LevelData_add ( a_u , X10_TEMP26 ) ; final LevelDataRefArray1 X10_TEMP27 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP36 = new Point1 ( l ) ; final Dist1 RX10_TEMP37 = X10_TEMP27 . distValue ; final Region1 RX10_TEMP38 = RX10_TEMP37 . dReg ; final int RX10_TEMP39 = Program . searchPointInRegion1 ( RX10_TEMP38 , RX10_TEMP36 ) ; final int RX10_TEMP40 = 0 ; final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP42 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP42 ) ; }
 final place RX10_TEMP43 = Program . getPlaceFromDist1 ( RX10_TEMP37 , RX10_TEMP39 ) ; final place RX10_TEMP45 = here ; final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45 ; if ( RX10_TEMP46 ) { String RX10_TEMP44 = "Bad place access for array X10_TEMP27" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final LevelData RX10_TEMP47 = Program . getRefArrayValue1LevelData ( X10_TEMP27 , RX10_TEMP39 ) ; final LevelData X10_TEMP32 = ( RX10_TEMP47 ) ; Program . MGOP_computeResidual3 ( X10_TEMP0 , X10_TEMP32 , a_v , a_u ) ; final LevelDataRefArray1 X10_TEMP33 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP48 = new Point1 ( l ) ; final Dist1 RX10_TEMP49 = X10_TEMP33 . distValue ; final Region1 RX10_TEMP50 = RX10_TEMP49 . dReg ; final int RX10_TEMP51 = Program . searchPointInRegion1 ( RX10_TEMP50 , RX10_TEMP48 ) ; final int RX10_TEMP52 = 0 ; final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; if ( RX10_TEMP53 ) { String RX10_TEMP54 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final place RX10_TEMP55 = Program . getPlaceFromDist1 ( RX10_TEMP49 , RX10_TEMP51 ) ; final place RX10_TEMP57 = here ; final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57 ; if ( RX10_TEMP58 ) { String RX10_TEMP56 = "Bad place access for array X10_TEMP33" ; throw new RuntimeException ( RX10_TEMP56 ) ; }
 final LevelData RX10_TEMP59 = Program . getRefArrayValue1LevelData ( X10_TEMP33 , RX10_TEMP51 ) ; final LevelData X10_TEMP35 = ( RX10_TEMP59 ) ; final double X10_TEMP37 = ( Program . LevelData_norm2 ( X10_TEMP35 ) ) ; res = ( X10_TEMP37 ) ; final String X10_TEMP38 = ( "The residual norm is " ) ; final String X10_TEMP40 = ( X10_TEMP38 + res ) ; System.out.println ( X10_TEMP40 ) ; final int X10_TEMP41 = ( i ) ; final int X10_TEMP42 = 1 ; i = i + X10_TEMP42 ; X10_TEMP19 = i < a_its ; }
 return res ; }
 public static void MGOP_MG ( final MGOP X10_TEMP0 ) { final int X10_TEMP1 = ( X10_TEMP0 . m_levels ) ; final int X10_TEMP2 = ( 1 ) ; int i2 = ( X10_TEMP1 - X10_TEMP2 ) ; final int X10_TEMP4 = ( 0 ) ; boolean X10_TEMP8 = i2 > X10_TEMP4 ; while ( X10_TEMP8 ) { final LevelDataRefArray1 X10_TEMP9 = X10_TEMP0 . m_r ; final int X10_TEMP10 = ( 1 ) ; final int X10_TEMP12 = ( i2 - X10_TEMP10 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP12 ) ; final Dist1 RX10_TEMP1 = X10_TEMP9 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP9" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final LevelData RX10_TEMP11 = Program . getRefArrayValue1LevelData ( X10_TEMP9 , RX10_TEMP3 ) ; final LevelData X10_TEMP18 = ( RX10_TEMP11 ) ; final LevelDataRefArray1 X10_TEMP14 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP12 = new Point1 ( i2 ) ; final Dist1 RX10_TEMP13 = X10_TEMP14 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP14" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final LevelData RX10_TEMP23 = Program . getRefArrayValue1LevelData ( X10_TEMP14 , RX10_TEMP15 ) ; final LevelData X10_TEMP19 = ( RX10_TEMP23 ) ; Program . MGOP_applyOpP3 ( X10_TEMP0 , X10_TEMP18 , X10_TEMP19 , i2 ) ; final int X10_TEMP20 = ( i2 ) ; final int X10_TEMP21 = 1 ; i2 = i2 - X10_TEMP21 ; final int X10_TEMP6 = ( 0 ) ; X10_TEMP8 = i2 > X10_TEMP6 ; }
 final LevelDataRefArray1 X10_TEMP22 = X10_TEMP0 . m_z ; final int X10_TEMP24 = ( 0 ) ; final Point1 RX10_TEMP24 = new Point1 ( X10_TEMP24 ) ; final Dist1 RX10_TEMP25 = X10_TEMP22 . distValue ; final Region1 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , RX10_TEMP24 ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { String RX10_TEMP30 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; final place RX10_TEMP33 = here ; final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; if ( RX10_TEMP34 ) { String RX10_TEMP32 = "Bad place access for array X10_TEMP22" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final LevelData RX10_TEMP35 = Program . getRefArrayValue1LevelData ( X10_TEMP22 , RX10_TEMP27 ) ; final LevelData X10_TEMP25 = ( RX10_TEMP35 ) ; final int X10_TEMP27 = ( 0 ) ; Program . LevelData_set ( X10_TEMP25 , X10_TEMP27 ) ; final LevelDataRefArray1 X10_TEMP28 = X10_TEMP0 . m_z ; final int X10_TEMP30 = ( 0 ) ; final Point1 RX10_TEMP36 = new Point1 ( X10_TEMP30 ) ; final Dist1 RX10_TEMP37 = X10_TEMP28 . distValue ; final Region1 RX10_TEMP38 = RX10_TEMP37 . dReg ; final int RX10_TEMP39 = Program . searchPointInRegion1 ( RX10_TEMP38 , RX10_TEMP36 ) ; final int RX10_TEMP40 = 0 ; final boolean RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP42 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP42 ) ; }
 final place RX10_TEMP43 = Program . getPlaceFromDist1 ( RX10_TEMP37 , RX10_TEMP39 ) ; final place RX10_TEMP45 = here ; final boolean RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45 ; if ( RX10_TEMP46 ) { String RX10_TEMP44 = "Bad place access for array X10_TEMP28" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final LevelData RX10_TEMP47 = Program . getRefArrayValue1LevelData ( X10_TEMP28 , RX10_TEMP39 ) ; final LevelData X10_TEMP37 = ( RX10_TEMP47 ) ; final LevelDataRefArray1 X10_TEMP32 = X10_TEMP0 . m_r ; final int X10_TEMP34 = ( 0 ) ; final Point1 RX10_TEMP48 = new Point1 ( X10_TEMP34 ) ; final Dist1 RX10_TEMP49 = X10_TEMP32 . distValue ; final Region1 RX10_TEMP50 = RX10_TEMP49 . dReg ; final int RX10_TEMP51 = Program . searchPointInRegion1 ( RX10_TEMP50 , RX10_TEMP48 ) ; final int RX10_TEMP52 = 0 ; final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; if ( RX10_TEMP53 ) { String RX10_TEMP54 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final place RX10_TEMP55 = Program . getPlaceFromDist1 ( RX10_TEMP49 , RX10_TEMP51 ) ; final place RX10_TEMP57 = here ; final boolean RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57 ; if ( RX10_TEMP58 ) { String RX10_TEMP56 = "Bad place access for array X10_TEMP32" ; throw new RuntimeException ( RX10_TEMP56 ) ; }
 final LevelData RX10_TEMP59 = Program . getRefArrayValue1LevelData ( X10_TEMP32 , RX10_TEMP51 ) ; final LevelData X10_TEMP38 = ( RX10_TEMP59 ) ; final boolean X10_TEMP39 = ( true ) ; Program . MGOP_smooth ( X10_TEMP0 , X10_TEMP37 , X10_TEMP38 , X10_TEMP39 ) ; int i3 = ( 1 ) ; final int X10_TEMP41 = ( X10_TEMP0 . m_levels ) ; boolean X10_TEMP45 = i3 < X10_TEMP41 ; while ( X10_TEMP45 ) { final LevelDataRefArray1 X10_TEMP46 = X10_TEMP0 . m_z ; final Point1 RX10_TEMP60 = new Point1 ( i3 ) ; final Dist1 RX10_TEMP61 = X10_TEMP46 . distValue ; final Region1 RX10_TEMP62 = RX10_TEMP61 . dReg ; final int RX10_TEMP63 = Program . searchPointInRegion1 ( RX10_TEMP62 , RX10_TEMP60 ) ; final int RX10_TEMP64 = 0 ; final boolean RX10_TEMP65 = RX10_TEMP63 < RX10_TEMP64 ; if ( RX10_TEMP65 ) { String RX10_TEMP66 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final place RX10_TEMP67 = Program . getPlaceFromDist1 ( RX10_TEMP61 , RX10_TEMP63 ) ; final place RX10_TEMP69 = here ; final boolean RX10_TEMP70 = RX10_TEMP67 != RX10_TEMP69 ; if ( RX10_TEMP70 ) { String RX10_TEMP68 = "Bad place access for array X10_TEMP46" ; throw new RuntimeException ( RX10_TEMP68 ) ; }
 final LevelData RX10_TEMP71 = Program . getRefArrayValue1LevelData ( X10_TEMP46 , RX10_TEMP63 ) ; final LevelData X10_TEMP56 = ( RX10_TEMP71 ) ; final LevelDataRefArray1 X10_TEMP49 = X10_TEMP0 . m_z ; final int X10_TEMP50 = ( 1 ) ; final int X10_TEMP52 = ( i3 - X10_TEMP50 ) ; final Point1 RX10_TEMP72 = new Point1 ( X10_TEMP52 ) ; final Dist1 RX10_TEMP73 = X10_TEMP49 . distValue ; final Region1 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion1 ( RX10_TEMP74 , RX10_TEMP72 ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist1 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array X10_TEMP49" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final LevelData RX10_TEMP83 = Program . getRefArrayValue1LevelData ( X10_TEMP49 , RX10_TEMP75 ) ; final LevelData X10_TEMP57 = ( RX10_TEMP83 ) ; final int X10_TEMP54 = ( 1 ) ; final int X10_TEMP58 = ( i3 - X10_TEMP54 ) ; Program . MGOP_applyOpQ3 ( X10_TEMP0 , X10_TEMP56 , X10_TEMP57 , X10_TEMP58 ) ; final LevelDataRefArray1 X10_TEMP59 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP84 = new Point1 ( i3 ) ; final Dist1 RX10_TEMP85 = X10_TEMP59 . distValue ; final Region1 RX10_TEMP86 = RX10_TEMP85 . dReg ; final int RX10_TEMP87 = Program . searchPointInRegion1 ( RX10_TEMP86 , RX10_TEMP84 ) ; final int RX10_TEMP88 = 0 ; final boolean RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88 ; if ( RX10_TEMP89 ) { String RX10_TEMP90 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP90 ) ; }
 final place RX10_TEMP91 = Program . getPlaceFromDist1 ( RX10_TEMP85 , RX10_TEMP87 ) ; final place RX10_TEMP93 = here ; final boolean RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93 ; if ( RX10_TEMP94 ) { String RX10_TEMP92 = "Bad place access for array X10_TEMP59" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final LevelData RX10_TEMP95 = Program . getRefArrayValue1LevelData ( X10_TEMP59 , RX10_TEMP87 ) ; final LevelData X10_TEMP65 = ( RX10_TEMP95 ) ; final LevelDataRefArray1 X10_TEMP62 = X10_TEMP0 . m_z ; final Point1 RX10_TEMP96 = new Point1 ( i3 ) ; final Dist1 RX10_TEMP97 = X10_TEMP62 . distValue ; final Region1 RX10_TEMP98 = RX10_TEMP97 . dReg ; final int RX10_TEMP99 = Program . searchPointInRegion1 ( RX10_TEMP98 , RX10_TEMP96 ) ; final int RX10_TEMP100 = 0 ; final boolean RX10_TEMP101 = RX10_TEMP99 < RX10_TEMP100 ; if ( RX10_TEMP101 ) { String RX10_TEMP102 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP102 ) ; }
 final place RX10_TEMP103 = Program . getPlaceFromDist1 ( RX10_TEMP97 , RX10_TEMP99 ) ; final place RX10_TEMP105 = here ; final boolean RX10_TEMP106 = RX10_TEMP103 != RX10_TEMP105 ; if ( RX10_TEMP106 ) { String RX10_TEMP104 = "Bad place access for array X10_TEMP62" ; throw new RuntimeException ( RX10_TEMP104 ) ; }
 final LevelData RX10_TEMP107 = Program . getRefArrayValue1LevelData ( X10_TEMP62 , RX10_TEMP99 ) ; final LevelData X10_TEMP66 = ( RX10_TEMP107 ) ; Program . MGOP_computeResidual2 ( X10_TEMP0 , X10_TEMP65 , X10_TEMP66 ) ; final LevelDataRefArray1 X10_TEMP67 = X10_TEMP0 . m_z ; final Point1 RX10_TEMP108 = new Point1 ( i3 ) ; final Dist1 RX10_TEMP109 = X10_TEMP67 . distValue ; final Region1 RX10_TEMP110 = RX10_TEMP109 . dReg ; final int RX10_TEMP111 = Program . searchPointInRegion1 ( RX10_TEMP110 , RX10_TEMP108 ) ; final int RX10_TEMP112 = 0 ; final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112 ; if ( RX10_TEMP113 ) { String RX10_TEMP114 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP114 ) ; }
 final place RX10_TEMP115 = Program . getPlaceFromDist1 ( RX10_TEMP109 , RX10_TEMP111 ) ; final place RX10_TEMP117 = here ; final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117 ; if ( RX10_TEMP118 ) { String RX10_TEMP116 = "Bad place access for array X10_TEMP67" ; throw new RuntimeException ( RX10_TEMP116 ) ; }
 final LevelData RX10_TEMP119 = Program . getRefArrayValue1LevelData ( X10_TEMP67 , RX10_TEMP111 ) ; final LevelData X10_TEMP74 = ( RX10_TEMP119 ) ; final LevelDataRefArray1 X10_TEMP70 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP120 = new Point1 ( i3 ) ; final Dist1 RX10_TEMP121 = X10_TEMP70 . distValue ; final Region1 RX10_TEMP122 = RX10_TEMP121 . dReg ; final int RX10_TEMP123 = Program . searchPointInRegion1 ( RX10_TEMP122 , RX10_TEMP120 ) ; final int RX10_TEMP124 = 0 ; final boolean RX10_TEMP125 = RX10_TEMP123 < RX10_TEMP124 ; if ( RX10_TEMP125 ) { String RX10_TEMP126 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP126 ) ; }
 final place RX10_TEMP127 = Program . getPlaceFromDist1 ( RX10_TEMP121 , RX10_TEMP123 ) ; final place RX10_TEMP129 = here ; final boolean RX10_TEMP130 = RX10_TEMP127 != RX10_TEMP129 ; if ( RX10_TEMP130 ) { String RX10_TEMP128 = "Bad place access for array X10_TEMP70" ; throw new RuntimeException ( RX10_TEMP128 ) ; }
 final LevelData RX10_TEMP131 = Program . getRefArrayValue1LevelData ( X10_TEMP70 , RX10_TEMP123 ) ; final LevelData X10_TEMP75 = ( RX10_TEMP131 ) ; final boolean X10_TEMP76 = ( false ) ; Program . MGOP_smooth ( X10_TEMP0 , X10_TEMP74 , X10_TEMP75 , X10_TEMP76 ) ; final int X10_TEMP77 = ( i3 ) ; final int X10_TEMP78 = 1 ; i3 = i3 + X10_TEMP78 ; final int X10_TEMP43 = ( X10_TEMP0 . m_levels ) ; X10_TEMP45 = i3 < X10_TEMP43 ; }
 }
 public static double MGOP_residualNorm ( final MGOP X10_TEMP0 ) { final int X10_TEMP1 = ( X10_TEMP0 . m_levels ) ; final int X10_TEMP2 = ( 1 ) ; int l = ( X10_TEMP1 - X10_TEMP2 ) ; final LevelDataRefArray1 X10_TEMP4 = X10_TEMP0 . m_r ; final Point1 RX10_TEMP0 = new Point1 ( l ) ; final Dist1 RX10_TEMP1 = X10_TEMP4 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP4" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final LevelData RX10_TEMP11 = Program . getRefArrayValue1LevelData ( X10_TEMP4 , RX10_TEMP3 ) ; final LevelData X10_TEMP6 = ( RX10_TEMP11 ) ; final double X10_TEMP8 = ( Program . LevelData_norm2 ( X10_TEMP6 ) ) ; return X10_TEMP8 ; }
 public static void runMain ( ) { final MGDriver X10_TEMP1 = ( new MGDriver ( ) ) ; Program . MGDriver_driver ( ) ; }
 public static boolean _Util_PERF_OUTPUT_init ( ) { final boolean X10_TEMP2 = ( true ) ; return X10_TEMP2 ; }
 public static double _Util_CLOCK_SPEED_init ( ) { final double X10_TEMP2 = ( 375 ) ; return X10_TEMP2 ; }
 public static double _Util_FP_PERCLOCK_init ( ) { final double X10_TEMP2 = ( 4 ) ; return X10_TEMP2 ; }
 public static double _Util_COMM_LATENCY_init ( ) { final double X10_TEMP2 = ( 1 ) ; return X10_TEMP2 ; }
 public static double _Util_COMM_BANDWIDTH_init ( ) { final double X10_TEMP2 = ( 2000 ) ; return X10_TEMP2 ; }
 public static boolean _Util_IN_LOOP_init ( ) { final boolean X10_TEMP2 = ( false ) ; return X10_TEMP2 ; }
 public static boolean _Util_COMP_ONLY_init ( ) { final boolean X10_TEMP2 = ( false ) ; return X10_TEMP2 ; }
 public static boolean _Util_COMM_ONLY_init ( ) { final boolean X10_TEMP2 = ( false ) ; return X10_TEMP2 ; }
 public static int _Util_THREADS_PERFOREACH_init ( ) { final int X10_TEMP2 = ( 1 ) ; return X10_TEMP2 ; }
 public static boolean _Util_OVERLAP_COMMANDCOMP_init ( ) { final boolean X10_TEMP2 = ( false ) ; return X10_TEMP2 ; }
 public static boolean _Util_EXCHANGE_AFTER_init ( ) { final boolean X10_TEMP2 = ( false ) ; return X10_TEMP2 ; }
 public static int _Util_P2SLEVEL_init ( ) { final int X10_TEMP2 = ( 1 ) ; return X10_TEMP2 ; }
 public static int _Util_N_PLACES_init ( ) { final int X10_TEMP2 = ( place.MAX_PLACES ) ; return X10_TEMP2 ; }
 public static double Util_sumDIFF1 ( final Point3 p , final doubleRefArray3 arg ) { double d1 = ( 0 ) ; int X10_TEMP5 = ( 1 ) ; int X10_TEMP6 = ( 0 ) ; int X10_TEMP7 = ( 0 ) ; int RX10_TEMP0 = p . f0 ; int RX10_TEMP1 = p . f1 ; int RX10_TEMP2 = p . f2 ; RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5 ; RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6 ; RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7 ; final Point3 X10_TEMP9 = ( new Point3 ( RX10_TEMP0 , RX10_TEMP1 , RX10_TEMP2 ) ) ; final Dist3 RX10_TEMP3 = arg . distValue ; final Region3 RX10_TEMP4 = RX10_TEMP3 . dReg ; final int RX10_TEMP5 = Program . searchPointInRegion3 ( RX10_TEMP4 , X10_TEMP9 ) ; final int RX10_TEMP6 = 0 ; final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6 ; if ( RX10_TEMP7 ) { String RX10_TEMP8 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final place RX10_TEMP9 = Program . getPlaceFromDist3 ( RX10_TEMP3 , RX10_TEMP5 ) ; final place RX10_TEMP11 = here ; final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11 ; if ( RX10_TEMP12 ) { String RX10_TEMP10 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final double RX10_TEMP13 = Program . getRefArrayValue3double ( arg , RX10_TEMP5 ) ; final double X10_TEMP10 = ( RX10_TEMP13 ) ; final double X10_TEMP12 = ( d1 + X10_TEMP10 ) ; d1 = ( X10_TEMP12 ) ; final int X10_TEMP13 = ( 1 ) ; final int X10_TEMP14 = 0 ; int X10_TEMP18 = ( X10_TEMP14 - X10_TEMP13 ) ; int X10_TEMP19 = ( 0 ) ; int X10_TEMP20 = ( 0 ) ; int RX10_TEMP14 = p . f0 ; int RX10_TEMP15 = p . f1 ; int RX10_TEMP16 = p . f2 ; RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18 ; RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19 ; RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20 ; final Point3 X10_TEMP22 = ( new Point3 ( RX10_TEMP14 , RX10_TEMP15 , RX10_TEMP16 ) ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , X10_TEMP22 ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; final double X10_TEMP23 = ( RX10_TEMP27 ) ; final double X10_TEMP25 = ( d1 + X10_TEMP23 ) ; d1 = ( X10_TEMP25 ) ; int X10_TEMP29 = ( 0 ) ; int X10_TEMP30 = ( 1 ) ; int X10_TEMP31 = ( 0 ) ; int RX10_TEMP28 = p . f0 ; int RX10_TEMP29 = p . f1 ; int RX10_TEMP30 = p . f2 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP29 ; RX10_TEMP29 = RX10_TEMP29 + X10_TEMP30 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP31 ; final Point3 X10_TEMP33 = ( new Point3 ( RX10_TEMP28 , RX10_TEMP29 , RX10_TEMP30 ) ) ; final Dist3 RX10_TEMP31 = arg . distValue ; final Region3 RX10_TEMP32 = RX10_TEMP31 . dReg ; final int RX10_TEMP33 = Program . searchPointInRegion3 ( RX10_TEMP32 , X10_TEMP33 ) ; final int RX10_TEMP34 = 0 ; final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; if ( RX10_TEMP35 ) { String RX10_TEMP36 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final place RX10_TEMP37 = Program . getPlaceFromDist3 ( RX10_TEMP31 , RX10_TEMP33 ) ; final place RX10_TEMP39 = here ; final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP38 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP38 ) ; }
 final double RX10_TEMP41 = Program . getRefArrayValue3double ( arg , RX10_TEMP33 ) ; final double X10_TEMP34 = ( RX10_TEMP41 ) ; final double X10_TEMP36 = ( d1 + X10_TEMP34 ) ; d1 = ( X10_TEMP36 ) ; int X10_TEMP42 = ( 0 ) ; final int X10_TEMP38 = ( 1 ) ; final int X10_TEMP39 = 0 ; int X10_TEMP43 = ( X10_TEMP39 - X10_TEMP38 ) ; int X10_TEMP44 = ( 0 ) ; int RX10_TEMP42 = p . f0 ; int RX10_TEMP43 = p . f1 ; int RX10_TEMP44 = p . f2 ; RX10_TEMP42 = RX10_TEMP42 + X10_TEMP42 ; RX10_TEMP43 = RX10_TEMP43 + X10_TEMP43 ; RX10_TEMP44 = RX10_TEMP44 + X10_TEMP44 ; final Point3 X10_TEMP46 = ( new Point3 ( RX10_TEMP42 , RX10_TEMP43 , RX10_TEMP44 ) ) ; final Dist3 RX10_TEMP45 = arg . distValue ; final Region3 RX10_TEMP46 = RX10_TEMP45 . dReg ; final int RX10_TEMP47 = Program . searchPointInRegion3 ( RX10_TEMP46 , X10_TEMP46 ) ; final int RX10_TEMP48 = 0 ; final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP50 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final place RX10_TEMP51 = Program . getPlaceFromDist3 ( RX10_TEMP45 , RX10_TEMP47 ) ; final place RX10_TEMP53 = here ; final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; if ( RX10_TEMP54 ) { String RX10_TEMP52 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final double RX10_TEMP55 = Program . getRefArrayValue3double ( arg , RX10_TEMP47 ) ; final double X10_TEMP47 = ( RX10_TEMP55 ) ; final double X10_TEMP49 = ( d1 + X10_TEMP47 ) ; d1 = ( X10_TEMP49 ) ; int X10_TEMP53 = ( 0 ) ; int X10_TEMP54 = ( 0 ) ; int X10_TEMP55 = ( 1 ) ; int RX10_TEMP56 = p . f0 ; int RX10_TEMP57 = p . f1 ; int RX10_TEMP58 = p . f2 ; RX10_TEMP56 = RX10_TEMP56 + X10_TEMP53 ; RX10_TEMP57 = RX10_TEMP57 + X10_TEMP54 ; RX10_TEMP58 = RX10_TEMP58 + X10_TEMP55 ; final Point3 X10_TEMP57 = ( new Point3 ( RX10_TEMP56 , RX10_TEMP57 , RX10_TEMP58 ) ) ; final Dist3 RX10_TEMP59 = arg . distValue ; final Region3 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion3 ( RX10_TEMP60 , X10_TEMP57 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist3 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final double RX10_TEMP69 = Program . getRefArrayValue3double ( arg , RX10_TEMP61 ) ; final double X10_TEMP58 = ( RX10_TEMP69 ) ; final double X10_TEMP60 = ( d1 + X10_TEMP58 ) ; d1 = ( X10_TEMP60 ) ; int X10_TEMP66 = ( 0 ) ; int X10_TEMP67 = ( 0 ) ; final int X10_TEMP63 = ( 1 ) ; final int X10_TEMP64 = 0 ; int X10_TEMP68 = ( X10_TEMP64 - X10_TEMP63 ) ; int RX10_TEMP70 = p . f0 ; int RX10_TEMP71 = p . f1 ; int RX10_TEMP72 = p . f2 ; RX10_TEMP70 = RX10_TEMP70 + X10_TEMP66 ; RX10_TEMP71 = RX10_TEMP71 + X10_TEMP67 ; RX10_TEMP72 = RX10_TEMP72 + X10_TEMP68 ; final Point3 X10_TEMP70 = ( new Point3 ( RX10_TEMP70 , RX10_TEMP71 , RX10_TEMP72 ) ) ; final Dist3 RX10_TEMP73 = arg . distValue ; final Region3 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion3 ( RX10_TEMP74 , X10_TEMP70 ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist3 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final double RX10_TEMP83 = Program . getRefArrayValue3double ( arg , RX10_TEMP75 ) ; final double X10_TEMP71 = ( RX10_TEMP83 ) ; final double X10_TEMP73 = ( d1 + X10_TEMP71 ) ; d1 = ( X10_TEMP73 ) ; return d1 ; }
 public static double Util_sumDIFF2 ( final Point3 p , final doubleRefArray3 arg ) { double d1 = ( 0 ) ; int X10_TEMP5 = ( 1 ) ; int X10_TEMP6 = ( 1 ) ; int X10_TEMP7 = ( 0 ) ; int RX10_TEMP0 = p . f0 ; int RX10_TEMP1 = p . f1 ; int RX10_TEMP2 = p . f2 ; RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5 ; RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6 ; RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7 ; final Point3 X10_TEMP9 = ( new Point3 ( RX10_TEMP0 , RX10_TEMP1 , RX10_TEMP2 ) ) ; final Dist3 RX10_TEMP3 = arg . distValue ; final Region3 RX10_TEMP4 = RX10_TEMP3 . dReg ; final int RX10_TEMP5 = Program . searchPointInRegion3 ( RX10_TEMP4 , X10_TEMP9 ) ; final int RX10_TEMP6 = 0 ; final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6 ; if ( RX10_TEMP7 ) { String RX10_TEMP8 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final place RX10_TEMP9 = Program . getPlaceFromDist3 ( RX10_TEMP3 , RX10_TEMP5 ) ; final place RX10_TEMP11 = here ; final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11 ; if ( RX10_TEMP12 ) { String RX10_TEMP10 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final double RX10_TEMP13 = Program . getRefArrayValue3double ( arg , RX10_TEMP5 ) ; final double X10_TEMP10 = ( RX10_TEMP13 ) ; final double X10_TEMP12 = ( d1 + X10_TEMP10 ) ; d1 = ( X10_TEMP12 ) ; int X10_TEMP18 = ( 1 ) ; final int X10_TEMP14 = ( 1 ) ; final int X10_TEMP15 = 0 ; int X10_TEMP19 = ( X10_TEMP15 - X10_TEMP14 ) ; int X10_TEMP20 = ( 0 ) ; int RX10_TEMP14 = p . f0 ; int RX10_TEMP15 = p . f1 ; int RX10_TEMP16 = p . f2 ; RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18 ; RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19 ; RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20 ; final Point3 X10_TEMP22 = ( new Point3 ( RX10_TEMP14 , RX10_TEMP15 , RX10_TEMP16 ) ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , X10_TEMP22 ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; final double X10_TEMP23 = ( RX10_TEMP27 ) ; final double X10_TEMP25 = ( d1 + X10_TEMP23 ) ; d1 = ( X10_TEMP25 ) ; final int X10_TEMP26 = ( 1 ) ; final int X10_TEMP27 = 0 ; int X10_TEMP31 = ( X10_TEMP27 - X10_TEMP26 ) ; int X10_TEMP32 = ( 1 ) ; int X10_TEMP33 = ( 0 ) ; int RX10_TEMP28 = p . f0 ; int RX10_TEMP29 = p . f1 ; int RX10_TEMP30 = p . f2 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP31 ; RX10_TEMP29 = RX10_TEMP29 + X10_TEMP32 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP33 ; final Point3 X10_TEMP35 = ( new Point3 ( RX10_TEMP28 , RX10_TEMP29 , RX10_TEMP30 ) ) ; final Dist3 RX10_TEMP31 = arg . distValue ; final Region3 RX10_TEMP32 = RX10_TEMP31 . dReg ; final int RX10_TEMP33 = Program . searchPointInRegion3 ( RX10_TEMP32 , X10_TEMP35 ) ; final int RX10_TEMP34 = 0 ; final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; if ( RX10_TEMP35 ) { String RX10_TEMP36 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final place RX10_TEMP37 = Program . getPlaceFromDist3 ( RX10_TEMP31 , RX10_TEMP33 ) ; final place RX10_TEMP39 = here ; final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP38 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP38 ) ; }
 final double RX10_TEMP41 = Program . getRefArrayValue3double ( arg , RX10_TEMP33 ) ; final double X10_TEMP36 = ( RX10_TEMP41 ) ; final double X10_TEMP38 = ( d1 + X10_TEMP36 ) ; d1 = ( X10_TEMP38 ) ; final int X10_TEMP39 = ( 1 ) ; final int X10_TEMP40 = 0 ; int X10_TEMP46 = ( X10_TEMP40 - X10_TEMP39 ) ; final int X10_TEMP42 = ( 1 ) ; final int X10_TEMP43 = 0 ; int X10_TEMP47 = ( X10_TEMP43 - X10_TEMP42 ) ; int X10_TEMP48 = ( 0 ) ; int RX10_TEMP42 = p . f0 ; int RX10_TEMP43 = p . f1 ; int RX10_TEMP44 = p . f2 ; RX10_TEMP42 = RX10_TEMP42 + X10_TEMP46 ; RX10_TEMP43 = RX10_TEMP43 + X10_TEMP47 ; RX10_TEMP44 = RX10_TEMP44 + X10_TEMP48 ; final Point3 X10_TEMP50 = ( new Point3 ( RX10_TEMP42 , RX10_TEMP43 , RX10_TEMP44 ) ) ; final Dist3 RX10_TEMP45 = arg . distValue ; final Region3 RX10_TEMP46 = RX10_TEMP45 . dReg ; final int RX10_TEMP47 = Program . searchPointInRegion3 ( RX10_TEMP46 , X10_TEMP50 ) ; final int RX10_TEMP48 = 0 ; final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP50 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final place RX10_TEMP51 = Program . getPlaceFromDist3 ( RX10_TEMP45 , RX10_TEMP47 ) ; final place RX10_TEMP53 = here ; final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; if ( RX10_TEMP54 ) { String RX10_TEMP52 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final double RX10_TEMP55 = Program . getRefArrayValue3double ( arg , RX10_TEMP47 ) ; final double X10_TEMP51 = ( RX10_TEMP55 ) ; final double X10_TEMP53 = ( d1 + X10_TEMP51 ) ; d1 = ( X10_TEMP53 ) ; int X10_TEMP57 = ( 1 ) ; int X10_TEMP58 = ( 0 ) ; int X10_TEMP59 = ( 1 ) ; int RX10_TEMP56 = p . f0 ; int RX10_TEMP57 = p . f1 ; int RX10_TEMP58 = p . f2 ; RX10_TEMP56 = RX10_TEMP56 + X10_TEMP57 ; RX10_TEMP57 = RX10_TEMP57 + X10_TEMP58 ; RX10_TEMP58 = RX10_TEMP58 + X10_TEMP59 ; final Point3 X10_TEMP61 = ( new Point3 ( RX10_TEMP56 , RX10_TEMP57 , RX10_TEMP58 ) ) ; final Dist3 RX10_TEMP59 = arg . distValue ; final Region3 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion3 ( RX10_TEMP60 , X10_TEMP61 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist3 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final double RX10_TEMP69 = Program . getRefArrayValue3double ( arg , RX10_TEMP61 ) ; final double X10_TEMP62 = ( RX10_TEMP69 ) ; final double X10_TEMP64 = ( d1 + X10_TEMP62 ) ; d1 = ( X10_TEMP64 ) ; int X10_TEMP70 = ( 1 ) ; int X10_TEMP71 = ( 0 ) ; final int X10_TEMP67 = ( 1 ) ; final int X10_TEMP68 = 0 ; int X10_TEMP72 = ( X10_TEMP68 - X10_TEMP67 ) ; int RX10_TEMP70 = p . f0 ; int RX10_TEMP71 = p . f1 ; int RX10_TEMP72 = p . f2 ; RX10_TEMP70 = RX10_TEMP70 + X10_TEMP70 ; RX10_TEMP71 = RX10_TEMP71 + X10_TEMP71 ; RX10_TEMP72 = RX10_TEMP72 + X10_TEMP72 ; final Point3 X10_TEMP74 = ( new Point3 ( RX10_TEMP70 , RX10_TEMP71 , RX10_TEMP72 ) ) ; final Dist3 RX10_TEMP73 = arg . distValue ; final Region3 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion3 ( RX10_TEMP74 , X10_TEMP74 ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist3 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final double RX10_TEMP83 = Program . getRefArrayValue3double ( arg , RX10_TEMP75 ) ; final double X10_TEMP75 = ( RX10_TEMP83 ) ; final double X10_TEMP77 = ( d1 + X10_TEMP75 ) ; d1 = ( X10_TEMP77 ) ; final int X10_TEMP78 = ( 1 ) ; final int X10_TEMP79 = 0 ; int X10_TEMP83 = ( X10_TEMP79 - X10_TEMP78 ) ; int X10_TEMP84 = ( 0 ) ; int X10_TEMP85 = ( 1 ) ; int RX10_TEMP84 = p . f0 ; int RX10_TEMP85 = p . f1 ; int RX10_TEMP86 = p . f2 ; RX10_TEMP84 = RX10_TEMP84 + X10_TEMP83 ; RX10_TEMP85 = RX10_TEMP85 + X10_TEMP84 ; RX10_TEMP86 = RX10_TEMP86 + X10_TEMP85 ; final Point3 X10_TEMP87 = ( new Point3 ( RX10_TEMP84 , RX10_TEMP85 , RX10_TEMP86 ) ) ; final Dist3 RX10_TEMP87 = arg . distValue ; final Region3 RX10_TEMP88 = RX10_TEMP87 . dReg ; final int RX10_TEMP89 = Program . searchPointInRegion3 ( RX10_TEMP88 , X10_TEMP87 ) ; final int RX10_TEMP90 = 0 ; final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP92 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final place RX10_TEMP93 = Program . getPlaceFromDist3 ( RX10_TEMP87 , RX10_TEMP89 ) ; final place RX10_TEMP95 = here ; final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; if ( RX10_TEMP96 ) { String RX10_TEMP94 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP94 ) ; }
 final double RX10_TEMP97 = Program . getRefArrayValue3double ( arg , RX10_TEMP89 ) ; final double X10_TEMP88 = ( RX10_TEMP97 ) ; final double X10_TEMP90 = ( d1 + X10_TEMP88 ) ; d1 = ( X10_TEMP90 ) ; final int X10_TEMP91 = ( 1 ) ; final int X10_TEMP92 = 0 ; int X10_TEMP98 = ( X10_TEMP92 - X10_TEMP91 ) ; int X10_TEMP99 = ( 0 ) ; final int X10_TEMP95 = ( 1 ) ; final int X10_TEMP96 = 0 ; int X10_TEMP100 = ( X10_TEMP96 - X10_TEMP95 ) ; int RX10_TEMP98 = p . f0 ; int RX10_TEMP99 = p . f1 ; int RX10_TEMP100 = p . f2 ; RX10_TEMP98 = RX10_TEMP98 + X10_TEMP98 ; RX10_TEMP99 = RX10_TEMP99 + X10_TEMP99 ; RX10_TEMP100 = RX10_TEMP100 + X10_TEMP100 ; final Point3 X10_TEMP102 = ( new Point3 ( RX10_TEMP98 , RX10_TEMP99 , RX10_TEMP100 ) ) ; final Dist3 RX10_TEMP101 = arg . distValue ; final Region3 RX10_TEMP102 = RX10_TEMP101 . dReg ; final int RX10_TEMP103 = Program . searchPointInRegion3 ( RX10_TEMP102 , X10_TEMP102 ) ; final int RX10_TEMP104 = 0 ; final boolean RX10_TEMP105 = RX10_TEMP103 < RX10_TEMP104 ; if ( RX10_TEMP105 ) { String RX10_TEMP106 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP106 ) ; }
 final place RX10_TEMP107 = Program . getPlaceFromDist3 ( RX10_TEMP101 , RX10_TEMP103 ) ; final place RX10_TEMP109 = here ; final boolean RX10_TEMP110 = RX10_TEMP107 != RX10_TEMP109 ; if ( RX10_TEMP110 ) { String RX10_TEMP108 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP108 ) ; }
 final double RX10_TEMP111 = Program . getRefArrayValue3double ( arg , RX10_TEMP103 ) ; final double X10_TEMP103 = ( RX10_TEMP111 ) ; final double X10_TEMP105 = ( d1 + X10_TEMP103 ) ; d1 = ( X10_TEMP105 ) ; int X10_TEMP109 = ( 0 ) ; int X10_TEMP110 = ( 1 ) ; int X10_TEMP111 = ( 1 ) ; int RX10_TEMP112 = p . f0 ; int RX10_TEMP113 = p . f1 ; int RX10_TEMP114 = p . f2 ; RX10_TEMP112 = RX10_TEMP112 + X10_TEMP109 ; RX10_TEMP113 = RX10_TEMP113 + X10_TEMP110 ; RX10_TEMP114 = RX10_TEMP114 + X10_TEMP111 ; final Point3 X10_TEMP113 = ( new Point3 ( RX10_TEMP112 , RX10_TEMP113 , RX10_TEMP114 ) ) ; final Dist3 RX10_TEMP115 = arg . distValue ; final Region3 RX10_TEMP116 = RX10_TEMP115 . dReg ; final int RX10_TEMP117 = Program . searchPointInRegion3 ( RX10_TEMP116 , X10_TEMP113 ) ; final int RX10_TEMP118 = 0 ; final boolean RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118 ; if ( RX10_TEMP119 ) { String RX10_TEMP120 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP120 ) ; }
 final place RX10_TEMP121 = Program . getPlaceFromDist3 ( RX10_TEMP115 , RX10_TEMP117 ) ; final place RX10_TEMP123 = here ; final boolean RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123 ; if ( RX10_TEMP124 ) { String RX10_TEMP122 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP122 ) ; }
 final double RX10_TEMP125 = Program . getRefArrayValue3double ( arg , RX10_TEMP117 ) ; final double X10_TEMP114 = ( RX10_TEMP125 ) ; final double X10_TEMP116 = ( d1 + X10_TEMP114 ) ; d1 = ( X10_TEMP116 ) ; int X10_TEMP122 = ( 0 ) ; int X10_TEMP123 = ( 1 ) ; final int X10_TEMP119 = ( 1 ) ; final int X10_TEMP120 = 0 ; int X10_TEMP124 = ( X10_TEMP120 - X10_TEMP119 ) ; int RX10_TEMP126 = p . f0 ; int RX10_TEMP127 = p . f1 ; int RX10_TEMP128 = p . f2 ; RX10_TEMP126 = RX10_TEMP126 + X10_TEMP122 ; RX10_TEMP127 = RX10_TEMP127 + X10_TEMP123 ; RX10_TEMP128 = RX10_TEMP128 + X10_TEMP124 ; final Point3 X10_TEMP126 = ( new Point3 ( RX10_TEMP126 , RX10_TEMP127 , RX10_TEMP128 ) ) ; final Dist3 RX10_TEMP129 = arg . distValue ; final Region3 RX10_TEMP130 = RX10_TEMP129 . dReg ; final int RX10_TEMP131 = Program . searchPointInRegion3 ( RX10_TEMP130 , X10_TEMP126 ) ; final int RX10_TEMP132 = 0 ; final boolean RX10_TEMP133 = RX10_TEMP131 < RX10_TEMP132 ; if ( RX10_TEMP133 ) { String RX10_TEMP134 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP134 ) ; }
 final place RX10_TEMP135 = Program . getPlaceFromDist3 ( RX10_TEMP129 , RX10_TEMP131 ) ; final place RX10_TEMP137 = here ; final boolean RX10_TEMP138 = RX10_TEMP135 != RX10_TEMP137 ; if ( RX10_TEMP138 ) { String RX10_TEMP136 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP136 ) ; }
 final double RX10_TEMP139 = Program . getRefArrayValue3double ( arg , RX10_TEMP131 ) ; final double X10_TEMP127 = ( RX10_TEMP139 ) ; final double X10_TEMP129 = ( d1 + X10_TEMP127 ) ; d1 = ( X10_TEMP129 ) ; int X10_TEMP135 = ( 0 ) ; final int X10_TEMP131 = ( 1 ) ; final int X10_TEMP132 = 0 ; int X10_TEMP136 = ( X10_TEMP132 - X10_TEMP131 ) ; int X10_TEMP137 = ( 1 ) ; int RX10_TEMP140 = p . f0 ; int RX10_TEMP141 = p . f1 ; int RX10_TEMP142 = p . f2 ; RX10_TEMP140 = RX10_TEMP140 + X10_TEMP135 ; RX10_TEMP141 = RX10_TEMP141 + X10_TEMP136 ; RX10_TEMP142 = RX10_TEMP142 + X10_TEMP137 ; final Point3 X10_TEMP139 = ( new Point3 ( RX10_TEMP140 , RX10_TEMP141 , RX10_TEMP142 ) ) ; final Dist3 RX10_TEMP143 = arg . distValue ; final Region3 RX10_TEMP144 = RX10_TEMP143 . dReg ; final int RX10_TEMP145 = Program . searchPointInRegion3 ( RX10_TEMP144 , X10_TEMP139 ) ; final int RX10_TEMP146 = 0 ; final boolean RX10_TEMP147 = RX10_TEMP145 < RX10_TEMP146 ; if ( RX10_TEMP147 ) { String RX10_TEMP148 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP148 ) ; }
 final place RX10_TEMP149 = Program . getPlaceFromDist3 ( RX10_TEMP143 , RX10_TEMP145 ) ; final place RX10_TEMP151 = here ; final boolean RX10_TEMP152 = RX10_TEMP149 != RX10_TEMP151 ; if ( RX10_TEMP152 ) { String RX10_TEMP150 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP150 ) ; }
 final double RX10_TEMP153 = Program . getRefArrayValue3double ( arg , RX10_TEMP145 ) ; final double X10_TEMP140 = ( RX10_TEMP153 ) ; final double X10_TEMP142 = ( d1 + X10_TEMP140 ) ; d1 = ( X10_TEMP142 ) ; int X10_TEMP150 = ( 0 ) ; final int X10_TEMP144 = ( 1 ) ; final int X10_TEMP145 = 0 ; int X10_TEMP151 = ( X10_TEMP145 - X10_TEMP144 ) ; final int X10_TEMP147 = ( 1 ) ; final int X10_TEMP148 = 0 ; int X10_TEMP152 = ( X10_TEMP148 - X10_TEMP147 ) ; int RX10_TEMP154 = p . f0 ; int RX10_TEMP155 = p . f1 ; int RX10_TEMP156 = p . f2 ; RX10_TEMP154 = RX10_TEMP154 + X10_TEMP150 ; RX10_TEMP155 = RX10_TEMP155 + X10_TEMP151 ; RX10_TEMP156 = RX10_TEMP156 + X10_TEMP152 ; final Point3 X10_TEMP154 = ( new Point3 ( RX10_TEMP154 , RX10_TEMP155 , RX10_TEMP156 ) ) ; final Dist3 RX10_TEMP157 = arg . distValue ; final Region3 RX10_TEMP158 = RX10_TEMP157 . dReg ; final int RX10_TEMP159 = Program . searchPointInRegion3 ( RX10_TEMP158 , X10_TEMP154 ) ; final int RX10_TEMP160 = 0 ; final boolean RX10_TEMP161 = RX10_TEMP159 < RX10_TEMP160 ; if ( RX10_TEMP161 ) { String RX10_TEMP162 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP162 ) ; }
 final place RX10_TEMP163 = Program . getPlaceFromDist3 ( RX10_TEMP157 , RX10_TEMP159 ) ; final place RX10_TEMP165 = here ; final boolean RX10_TEMP166 = RX10_TEMP163 != RX10_TEMP165 ; if ( RX10_TEMP166 ) { String RX10_TEMP164 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP164 ) ; }
 final double RX10_TEMP167 = Program . getRefArrayValue3double ( arg , RX10_TEMP159 ) ; final double X10_TEMP155 = ( RX10_TEMP167 ) ; final double X10_TEMP157 = ( d1 + X10_TEMP155 ) ; d1 = ( X10_TEMP157 ) ; return d1 ; }
 public static double Util_sumDIFF3 ( final Point3 p , final doubleRefArray3 arg ) { double d1 = ( 0 ) ; int X10_TEMP5 = ( 1 ) ; int X10_TEMP6 = ( 1 ) ; int X10_TEMP7 = ( 1 ) ; int RX10_TEMP0 = p . f0 ; int RX10_TEMP1 = p . f1 ; int RX10_TEMP2 = p . f2 ; RX10_TEMP0 = RX10_TEMP0 + X10_TEMP5 ; RX10_TEMP1 = RX10_TEMP1 + X10_TEMP6 ; RX10_TEMP2 = RX10_TEMP2 + X10_TEMP7 ; final Point3 X10_TEMP9 = ( new Point3 ( RX10_TEMP0 , RX10_TEMP1 , RX10_TEMP2 ) ) ; final Dist3 RX10_TEMP3 = arg . distValue ; final Region3 RX10_TEMP4 = RX10_TEMP3 . dReg ; final int RX10_TEMP5 = Program . searchPointInRegion3 ( RX10_TEMP4 , X10_TEMP9 ) ; final int RX10_TEMP6 = 0 ; final boolean RX10_TEMP7 = RX10_TEMP5 < RX10_TEMP6 ; if ( RX10_TEMP7 ) { String RX10_TEMP8 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final place RX10_TEMP9 = Program . getPlaceFromDist3 ( RX10_TEMP3 , RX10_TEMP5 ) ; final place RX10_TEMP11 = here ; final boolean RX10_TEMP12 = RX10_TEMP9 != RX10_TEMP11 ; if ( RX10_TEMP12 ) { String RX10_TEMP10 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final double RX10_TEMP13 = Program . getRefArrayValue3double ( arg , RX10_TEMP5 ) ; final double X10_TEMP10 = ( RX10_TEMP13 ) ; final double X10_TEMP12 = ( d1 + X10_TEMP10 ) ; d1 = ( X10_TEMP12 ) ; int X10_TEMP18 = ( 1 ) ; int X10_TEMP19 = ( 1 ) ; final int X10_TEMP15 = ( 1 ) ; final int X10_TEMP16 = 0 ; int X10_TEMP20 = ( X10_TEMP16 - X10_TEMP15 ) ; int RX10_TEMP14 = p . f0 ; int RX10_TEMP15 = p . f1 ; int RX10_TEMP16 = p . f2 ; RX10_TEMP14 = RX10_TEMP14 + X10_TEMP18 ; RX10_TEMP15 = RX10_TEMP15 + X10_TEMP19 ; RX10_TEMP16 = RX10_TEMP16 + X10_TEMP20 ; final Point3 X10_TEMP22 = ( new Point3 ( RX10_TEMP14 , RX10_TEMP15 , RX10_TEMP16 ) ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , X10_TEMP22 ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; final double X10_TEMP23 = ( RX10_TEMP27 ) ; final double X10_TEMP25 = ( d1 + X10_TEMP23 ) ; d1 = ( X10_TEMP25 ) ; int X10_TEMP31 = ( 1 ) ; final int X10_TEMP27 = ( 1 ) ; final int X10_TEMP28 = 0 ; int X10_TEMP32 = ( X10_TEMP28 - X10_TEMP27 ) ; int X10_TEMP33 = ( 1 ) ; int RX10_TEMP28 = p . f0 ; int RX10_TEMP29 = p . f1 ; int RX10_TEMP30 = p . f2 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP31 ; RX10_TEMP29 = RX10_TEMP29 + X10_TEMP32 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP33 ; final Point3 X10_TEMP35 = ( new Point3 ( RX10_TEMP28 , RX10_TEMP29 , RX10_TEMP30 ) ) ; final Dist3 RX10_TEMP31 = arg . distValue ; final Region3 RX10_TEMP32 = RX10_TEMP31 . dReg ; final int RX10_TEMP33 = Program . searchPointInRegion3 ( RX10_TEMP32 , X10_TEMP35 ) ; final int RX10_TEMP34 = 0 ; final boolean RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; if ( RX10_TEMP35 ) { String RX10_TEMP36 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final place RX10_TEMP37 = Program . getPlaceFromDist3 ( RX10_TEMP31 , RX10_TEMP33 ) ; final place RX10_TEMP39 = here ; final boolean RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP38 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP38 ) ; }
 final double RX10_TEMP41 = Program . getRefArrayValue3double ( arg , RX10_TEMP33 ) ; final double X10_TEMP36 = ( RX10_TEMP41 ) ; final double X10_TEMP38 = ( d1 + X10_TEMP36 ) ; d1 = ( X10_TEMP38 ) ; int X10_TEMP46 = ( 1 ) ; final int X10_TEMP40 = ( 1 ) ; final int X10_TEMP41 = 0 ; int X10_TEMP47 = ( X10_TEMP41 - X10_TEMP40 ) ; final int X10_TEMP43 = ( 1 ) ; final int X10_TEMP44 = 0 ; int X10_TEMP48 = ( X10_TEMP44 - X10_TEMP43 ) ; int RX10_TEMP42 = p . f0 ; int RX10_TEMP43 = p . f1 ; int RX10_TEMP44 = p . f2 ; RX10_TEMP42 = RX10_TEMP42 + X10_TEMP46 ; RX10_TEMP43 = RX10_TEMP43 + X10_TEMP47 ; RX10_TEMP44 = RX10_TEMP44 + X10_TEMP48 ; final Point3 X10_TEMP50 = ( new Point3 ( RX10_TEMP42 , RX10_TEMP43 , RX10_TEMP44 ) ) ; final Dist3 RX10_TEMP45 = arg . distValue ; final Region3 RX10_TEMP46 = RX10_TEMP45 . dReg ; final int RX10_TEMP47 = Program . searchPointInRegion3 ( RX10_TEMP46 , X10_TEMP50 ) ; final int RX10_TEMP48 = 0 ; final boolean RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP50 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final place RX10_TEMP51 = Program . getPlaceFromDist3 ( RX10_TEMP45 , RX10_TEMP47 ) ; final place RX10_TEMP53 = here ; final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; if ( RX10_TEMP54 ) { String RX10_TEMP52 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final double RX10_TEMP55 = Program . getRefArrayValue3double ( arg , RX10_TEMP47 ) ; final double X10_TEMP51 = ( RX10_TEMP55 ) ; final double X10_TEMP53 = ( d1 + X10_TEMP51 ) ; d1 = ( X10_TEMP53 ) ; final int X10_TEMP54 = ( 1 ) ; final int X10_TEMP55 = 0 ; int X10_TEMP59 = ( X10_TEMP55 - X10_TEMP54 ) ; int X10_TEMP60 = ( 1 ) ; int X10_TEMP61 = ( 1 ) ; int RX10_TEMP56 = p . f0 ; int RX10_TEMP57 = p . f1 ; int RX10_TEMP58 = p . f2 ; RX10_TEMP56 = RX10_TEMP56 + X10_TEMP59 ; RX10_TEMP57 = RX10_TEMP57 + X10_TEMP60 ; RX10_TEMP58 = RX10_TEMP58 + X10_TEMP61 ; final Point3 X10_TEMP63 = ( new Point3 ( RX10_TEMP56 , RX10_TEMP57 , RX10_TEMP58 ) ) ; final Dist3 RX10_TEMP59 = arg . distValue ; final Region3 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion3 ( RX10_TEMP60 , X10_TEMP63 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist3 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final double RX10_TEMP69 = Program . getRefArrayValue3double ( arg , RX10_TEMP61 ) ; final double X10_TEMP64 = ( RX10_TEMP69 ) ; final double X10_TEMP66 = ( d1 + X10_TEMP64 ) ; d1 = ( X10_TEMP66 ) ; final int X10_TEMP67 = ( 1 ) ; final int X10_TEMP68 = 0 ; int X10_TEMP74 = ( X10_TEMP68 - X10_TEMP67 ) ; int X10_TEMP75 = ( 1 ) ; final int X10_TEMP71 = ( 1 ) ; final int X10_TEMP72 = 0 ; int X10_TEMP76 = ( X10_TEMP72 - X10_TEMP71 ) ; int RX10_TEMP70 = p . f0 ; int RX10_TEMP71 = p . f1 ; int RX10_TEMP72 = p . f2 ; RX10_TEMP70 = RX10_TEMP70 + X10_TEMP74 ; RX10_TEMP71 = RX10_TEMP71 + X10_TEMP75 ; RX10_TEMP72 = RX10_TEMP72 + X10_TEMP76 ; final Point3 X10_TEMP78 = ( new Point3 ( RX10_TEMP70 , RX10_TEMP71 , RX10_TEMP72 ) ) ; final Dist3 RX10_TEMP73 = arg . distValue ; final Region3 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion3 ( RX10_TEMP74 , X10_TEMP78 ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist3 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final double RX10_TEMP83 = Program . getRefArrayValue3double ( arg , RX10_TEMP75 ) ; final double X10_TEMP79 = ( RX10_TEMP83 ) ; final double X10_TEMP81 = ( d1 + X10_TEMP79 ) ; d1 = ( X10_TEMP81 ) ; final int X10_TEMP82 = ( 1 ) ; final int X10_TEMP83 = 0 ; int X10_TEMP89 = ( X10_TEMP83 - X10_TEMP82 ) ; final int X10_TEMP85 = ( 1 ) ; final int X10_TEMP86 = 0 ; int X10_TEMP90 = ( X10_TEMP86 - X10_TEMP85 ) ; int X10_TEMP91 = ( 1 ) ; int RX10_TEMP84 = p . f0 ; int RX10_TEMP85 = p . f1 ; int RX10_TEMP86 = p . f2 ; RX10_TEMP84 = RX10_TEMP84 + X10_TEMP89 ; RX10_TEMP85 = RX10_TEMP85 + X10_TEMP90 ; RX10_TEMP86 = RX10_TEMP86 + X10_TEMP91 ; final Point3 X10_TEMP93 = ( new Point3 ( RX10_TEMP84 , RX10_TEMP85 , RX10_TEMP86 ) ) ; final Dist3 RX10_TEMP87 = arg . distValue ; final Region3 RX10_TEMP88 = RX10_TEMP87 . dReg ; final int RX10_TEMP89 = Program . searchPointInRegion3 ( RX10_TEMP88 , X10_TEMP93 ) ; final int RX10_TEMP90 = 0 ; final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP92 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final place RX10_TEMP93 = Program . getPlaceFromDist3 ( RX10_TEMP87 , RX10_TEMP89 ) ; final place RX10_TEMP95 = here ; final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; if ( RX10_TEMP96 ) { String RX10_TEMP94 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP94 ) ; }
 final double RX10_TEMP97 = Program . getRefArrayValue3double ( arg , RX10_TEMP89 ) ; final double X10_TEMP94 = ( RX10_TEMP97 ) ; final double X10_TEMP96 = ( d1 + X10_TEMP94 ) ; d1 = ( X10_TEMP96 ) ; final int X10_TEMP97 = ( 1 ) ; final int X10_TEMP98 = 0 ; int X10_TEMP106 = ( X10_TEMP98 - X10_TEMP97 ) ; final int X10_TEMP100 = ( 1 ) ; final int X10_TEMP101 = 0 ; int X10_TEMP107 = ( X10_TEMP101 - X10_TEMP100 ) ; final int X10_TEMP103 = ( 1 ) ; final int X10_TEMP104 = 0 ; int X10_TEMP108 = ( X10_TEMP104 - X10_TEMP103 ) ; int RX10_TEMP98 = p . f0 ; int RX10_TEMP99 = p . f1 ; int RX10_TEMP100 = p . f2 ; RX10_TEMP98 = RX10_TEMP98 + X10_TEMP106 ; RX10_TEMP99 = RX10_TEMP99 + X10_TEMP107 ; RX10_TEMP100 = RX10_TEMP100 + X10_TEMP108 ; final Point3 X10_TEMP110 = ( new Point3 ( RX10_TEMP98 , RX10_TEMP99 , RX10_TEMP100 ) ) ; final Dist3 RX10_TEMP101 = arg . distValue ; final Region3 RX10_TEMP102 = RX10_TEMP101 . dReg ; final int RX10_TEMP103 = Program . searchPointInRegion3 ( RX10_TEMP102 , X10_TEMP110 ) ; final int RX10_TEMP104 = 0 ; final boolean RX10_TEMP105 = RX10_TEMP103 < RX10_TEMP104 ; if ( RX10_TEMP105 ) { String RX10_TEMP106 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP106 ) ; }
 final place RX10_TEMP107 = Program . getPlaceFromDist3 ( RX10_TEMP101 , RX10_TEMP103 ) ; final place RX10_TEMP109 = here ; final boolean RX10_TEMP110 = RX10_TEMP107 != RX10_TEMP109 ; if ( RX10_TEMP110 ) { String RX10_TEMP108 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP108 ) ; }
 final double RX10_TEMP111 = Program . getRefArrayValue3double ( arg , RX10_TEMP103 ) ; final double X10_TEMP111 = ( RX10_TEMP111 ) ; final double X10_TEMP113 = ( d1 + X10_TEMP111 ) ; d1 = ( X10_TEMP113 ) ; return d1 ; }
 public static Region3 _Util_UNIT_CUBE_init ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 1 ) ; final int X10_TEMP7 = ( 0 ) ; final int X10_TEMP8 = ( 1 ) ; final int X10_TEMP11 = ( 0 ) ; final int X10_TEMP12 = ( 1 ) ; final Region3 X10_TEMP14 = Program . createNewRegion3RRR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP7 , X10_TEMP8 , X10_TEMP11 , X10_TEMP12 ) ; return X10_TEMP14 ; }
 public static Region3ValArray3 _Util_QREGIONS_init ( ) { final Region3 RX10_TEMP0 = _Util_UNIT_CUBE ; final int RX10_TEMP4 = _Util_UNIT_CUBE . regSize ; final int RX10_TEMP5 = 1 ; final int RX10_TEMP6 = RX10_TEMP4 - RX10_TEMP5 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP6 ] ; final Region3 value [ : rank==1 ] RX10_TEMP7 = ( Region3 value [ : rank==1 ] ) ( new Region3 value [ RX10_TEMP3 ] ( point ( : rank==1 ) RX10_TEMP1 ) { final int RX10_TEMP2 = RX10_TEMP1 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( RX10_TEMP0 , RX10_TEMP2 ) ; final int a = p . f0 ; final int b = p . f1 ; final int c = p . f2 ; final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP6 = ( 0 ) ; final int X10_TEMP9 = ( 0 ) ; final Region3 X10_TEMP11 = Program . createNewRegion3RRR ( X10_TEMP3 , a , X10_TEMP6 , b , X10_TEMP9 , c ) ; return X10_TEMP11 ; }
 ) ; final Region3ValArray3 RX10_TEMP8 = new Region3ValArray3 ( _Util_UNIT_CUBE , RX10_TEMP7 ) ; final Region3ValArray3 X10_TEMP12 = RX10_TEMP8 ; return X10_TEMP12 ; }
 public static int _Util_LOW_init ( ) { final int X10_TEMP2 = ( 0 ) ; return X10_TEMP2 ; }
 public static int _Util_HIGH_init ( ) { final int X10_TEMP2 = ( 1 ) ; return X10_TEMP2 ; }
 public static boolean Util_powerOf2 ( final int a_int ) { final int X10_TEMP2 = ( Math . abs ( a_int ) ) ; int i = ( ( int ) X10_TEMP2 ) ; final int X10_TEMP4 = ( 0 ) ; final boolean X10_TEMP6 = i == X10_TEMP4 ; if ( X10_TEMP6 ) { final boolean X10_TEMP8 = ( false ) ; return X10_TEMP8 ; }
 else { final int X10_TEMP11 = ( Program . Util_log2 ( i ) ) ; final int X10_TEMP13 = ( Program . Util_pow2 ( X10_TEMP11 ) ) ; final boolean X10_TEMP15 = i != X10_TEMP13 ; if ( X10_TEMP15 ) { final boolean X10_TEMP17 = ( false ) ; return X10_TEMP17 ; }
 }
 final boolean X10_TEMP19 = ( true ) ; return X10_TEMP19 ; }
 public static int Util_log2 ( final int a_int ) { final double X10_TEMP4 = ( Math . log ( a_int ) ) ; final int X10_TEMP3 = ( 2 ) ; final double X10_TEMP5 = ( Math . log ( X10_TEMP3 ) ) ; final double X10_TEMP7 = ( X10_TEMP4 / X10_TEMP5 ) ; final int X10_TEMP9 = ( ( int ) X10_TEMP7 ) ; return X10_TEMP9 ; }
 public static int Util_pow2 ( final int a_int ) { final int X10_TEMP3 = ( 2 ) ; final double X10_TEMP4 = ( Math . pow ( X10_TEMP3 , a_int ) ) ; final int X10_TEMP6 = ( ( int ) X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static Region3 Util_boundary ( final Region3 a_R , final int a_direction , final int a_padSize0 , final int a_padSize1 , final int a_padSize2 ) { final int X10_TEMP2 = ( Math . abs ( a_direction ) ) ; int i = ( ( int ) X10_TEMP2 ) ; final int X10_TEMP4 = ( 0 ) ; final boolean X10_TEMP6 = ( a_direction > X10_TEMP4 ) ; boolean IsHigh = ( X10_TEMP6 ) ; final int X10_TEMP9 = ( 0 ) ; final Region1 RX10_TEMP0 = Program . getRank3 ( a_R , X10_TEMP9 ) ; final Region1 X10_TEMP10 = RX10_TEMP0 ; final int RX10_TEMP1 = X10_TEMP10 . regSize ; final int RX10_TEMP2 = 0 ; final boolean RX10_TEMP3 = RX10_TEMP1 <= RX10_TEMP2 ; if ( RX10_TEMP3 ) { final String RX10_TEMP4 = "Operation low() not defined on empty region X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP4 ) ; }
 int low0 = ( Program . regionLow ( X10_TEMP10 ) ) ; final int X10_TEMP13 = ( 1 ) ; final Region1 RX10_TEMP5 = Program . getRank3 ( a_R , X10_TEMP13 ) ; final Region1 X10_TEMP14 = RX10_TEMP5 ; final int RX10_TEMP6 = X10_TEMP14 . regSize ; final int RX10_TEMP7 = 0 ; final boolean RX10_TEMP8 = RX10_TEMP6 <= RX10_TEMP7 ; if ( RX10_TEMP8 ) { final String RX10_TEMP9 = "Operation low() not defined on empty region X10_TEMP14" ; throw new RuntimeException ( RX10_TEMP9 ) ; }
 int low1 = ( Program . regionLow ( X10_TEMP14 ) ) ; final int X10_TEMP17 = ( 2 ) ; final Region1 RX10_TEMP10 = Program . getRank3 ( a_R , X10_TEMP17 ) ; final Region1 X10_TEMP18 = RX10_TEMP10 ; final int RX10_TEMP11 = X10_TEMP18 . regSize ; final int RX10_TEMP12 = 0 ; final boolean RX10_TEMP13 = RX10_TEMP11 <= RX10_TEMP12 ; if ( RX10_TEMP13 ) { final String RX10_TEMP14 = "Operation low() not defined on empty region X10_TEMP18" ; throw new RuntimeException ( RX10_TEMP14 ) ; }
 int low2 = ( Program . regionLow ( X10_TEMP18 ) ) ; final int X10_TEMP21 = ( 0 ) ; final Region1 RX10_TEMP15 = Program . getRank3 ( a_R , X10_TEMP21 ) ; final Region1 X10_TEMP22 = RX10_TEMP15 ; final int RX10_TEMP16 = X10_TEMP22 . regSize ; final int RX10_TEMP17 = 0 ; final boolean RX10_TEMP18 = RX10_TEMP16 <= RX10_TEMP17 ; if ( RX10_TEMP18 ) { final String RX10_TEMP19 = "Operation high() not defined on empty region X10_TEMP22" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 int high0 = ( Program . regionHigh ( X10_TEMP22 ) ) ; final int X10_TEMP25 = ( 1 ) ; final Region1 RX10_TEMP20 = Program . getRank3 ( a_R , X10_TEMP25 ) ; final Region1 X10_TEMP26 = RX10_TEMP20 ; final int RX10_TEMP21 = X10_TEMP26 . regSize ; final int RX10_TEMP22 = 0 ; final boolean RX10_TEMP23 = RX10_TEMP21 <= RX10_TEMP22 ; if ( RX10_TEMP23 ) { final String RX10_TEMP24 = "Operation high() not defined on empty region X10_TEMP26" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 int high1 = ( Program . regionHigh ( X10_TEMP26 ) ) ; final int X10_TEMP29 = ( 2 ) ; final Region1 RX10_TEMP25 = Program . getRank3 ( a_R , X10_TEMP29 ) ; final Region1 X10_TEMP30 = RX10_TEMP25 ; final int RX10_TEMP26 = X10_TEMP30 . regSize ; final int RX10_TEMP27 = 0 ; final boolean RX10_TEMP28 = RX10_TEMP26 <= RX10_TEMP27 ; if ( RX10_TEMP28 ) { final String RX10_TEMP29 = "Operation high() not defined on empty region X10_TEMP30" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 int high2 = ( Program . regionHigh ( X10_TEMP30 ) ) ; int r = ( 3 ) ; final boolean X10_TEMP34 = ( i <= r ) ; final int X10_TEMP33 = ( 3 ) ; final boolean X10_TEMP35 = ( r == X10_TEMP33 ) ; final boolean X10_TEMP37 = X10_TEMP34 && X10_TEMP35 ; if ( X10_TEMP37 ) { if ( IsHigh ) { final int X10_TEMP39 = ( 1 ) ; final boolean X10_TEMP40 = i == X10_TEMP39 ; final int X10_TEMP41 = ( 1 ) ; int X10_TEMP44 = low0 ; if ( X10_TEMP40 ) { X10_TEMP44 = high0 + X10_TEMP41 ; }
 final int X10_TEMP45 = X10_TEMP44 ; final int X10_TEMP46 = ( X10_TEMP45 ) ; final int X10_TEMP57 = ( X10_TEMP46 - a_padSize0 ) ; final int X10_TEMP48 = ( 1 ) ; final boolean X10_TEMP49 = i == X10_TEMP48 ; final int X10_TEMP50 = ( 1 ) ; int X10_TEMP53 = high0 ; if ( X10_TEMP49 ) { X10_TEMP53 = high0 + X10_TEMP50 ; }
 final int X10_TEMP54 = X10_TEMP53 ; final int X10_TEMP55 = ( X10_TEMP54 ) ; final int X10_TEMP58 = ( X10_TEMP55 + a_padSize0 ) ; final int X10_TEMP59 = ( 2 ) ; final boolean X10_TEMP60 = i == X10_TEMP59 ; final int X10_TEMP61 = ( 1 ) ; int X10_TEMP64 = low1 ; if ( X10_TEMP60 ) { X10_TEMP64 = high1 + X10_TEMP61 ; }
 final int X10_TEMP65 = X10_TEMP64 ; final int X10_TEMP66 = ( X10_TEMP65 ) ; final int X10_TEMP77 = ( X10_TEMP66 - a_padSize1 ) ; final int X10_TEMP68 = ( 2 ) ; final boolean X10_TEMP69 = i == X10_TEMP68 ; final int X10_TEMP70 = ( 1 ) ; int X10_TEMP73 = high1 ; if ( X10_TEMP69 ) { X10_TEMP73 = high1 + X10_TEMP70 ; }
 final int X10_TEMP74 = X10_TEMP73 ; final int X10_TEMP75 = ( X10_TEMP74 ) ; final int X10_TEMP78 = ( X10_TEMP75 + a_padSize1 ) ; final int X10_TEMP79 = ( 3 ) ; final boolean X10_TEMP80 = i == X10_TEMP79 ; final int X10_TEMP81 = ( 1 ) ; int X10_TEMP84 = low2 ; if ( X10_TEMP80 ) { X10_TEMP84 = high2 + X10_TEMP81 ; }
 final int X10_TEMP85 = X10_TEMP84 ; final int X10_TEMP86 = ( X10_TEMP85 ) ; final int X10_TEMP97 = ( X10_TEMP86 - a_padSize2 ) ; final int X10_TEMP88 = ( 3 ) ; final boolean X10_TEMP89 = i == X10_TEMP88 ; final int X10_TEMP90 = ( 1 ) ; int X10_TEMP93 = high2 ; if ( X10_TEMP89 ) { X10_TEMP93 = high2 + X10_TEMP90 ; }
 final int X10_TEMP94 = X10_TEMP93 ; final int X10_TEMP95 = ( X10_TEMP94 ) ; final int X10_TEMP98 = ( X10_TEMP95 + a_padSize2 ) ; final Region3 X10_TEMP100 = Program . createNewRegion3RRR ( X10_TEMP57 , X10_TEMP58 , X10_TEMP77 , X10_TEMP78 , X10_TEMP97 , X10_TEMP98 ) ; return X10_TEMP100 ; }
 else { final int X10_TEMP101 = ( 1 ) ; final boolean X10_TEMP102 = i == X10_TEMP101 ; final int X10_TEMP103 = ( 1 ) ; int X10_TEMP106 = low0 ; if ( X10_TEMP102 ) { X10_TEMP106 = low0 - X10_TEMP103 ; }
 final int X10_TEMP107 = X10_TEMP106 ; final int X10_TEMP108 = ( X10_TEMP107 ) ; final int X10_TEMP119 = ( X10_TEMP108 - a_padSize0 ) ; final int X10_TEMP110 = ( 1 ) ; final boolean X10_TEMP111 = i == X10_TEMP110 ; final int X10_TEMP112 = ( 1 ) ; int X10_TEMP115 = high0 ; if ( X10_TEMP111 ) { X10_TEMP115 = low0 - X10_TEMP112 ; }
 final int X10_TEMP116 = X10_TEMP115 ; final int X10_TEMP117 = ( X10_TEMP116 ) ; final int X10_TEMP120 = ( X10_TEMP117 + a_padSize0 ) ; final int X10_TEMP121 = ( 2 ) ; final boolean X10_TEMP122 = i == X10_TEMP121 ; final int X10_TEMP123 = ( 1 ) ; int X10_TEMP126 = low1 ; if ( X10_TEMP122 ) { X10_TEMP126 = low1 - X10_TEMP123 ; }
 final int X10_TEMP127 = X10_TEMP126 ; final int X10_TEMP128 = ( X10_TEMP127 ) ; final int X10_TEMP139 = ( X10_TEMP128 - a_padSize1 ) ; final int X10_TEMP130 = ( 2 ) ; final boolean X10_TEMP131 = i == X10_TEMP130 ; final int X10_TEMP132 = ( 1 ) ; int X10_TEMP135 = high1 ; if ( X10_TEMP131 ) { X10_TEMP135 = low1 - X10_TEMP132 ; }
 final int X10_TEMP136 = X10_TEMP135 ; final int X10_TEMP137 = ( X10_TEMP136 ) ; final int X10_TEMP140 = ( X10_TEMP137 + a_padSize1 ) ; final int X10_TEMP141 = ( 3 ) ; final boolean X10_TEMP142 = i == X10_TEMP141 ; final int X10_TEMP143 = ( 1 ) ; int X10_TEMP146 = low2 ; if ( X10_TEMP142 ) { X10_TEMP146 = low2 - X10_TEMP143 ; }
 final int X10_TEMP147 = X10_TEMP146 ; final int X10_TEMP148 = ( X10_TEMP147 ) ; final int X10_TEMP159 = ( X10_TEMP148 - a_padSize2 ) ; final int X10_TEMP150 = ( 3 ) ; final boolean X10_TEMP151 = i == X10_TEMP150 ; final int X10_TEMP152 = ( 1 ) ; int X10_TEMP155 = high2 ; if ( X10_TEMP151 ) { X10_TEMP155 = low2 - X10_TEMP152 ; }
 final int X10_TEMP156 = X10_TEMP155 ; final int X10_TEMP157 = ( X10_TEMP156 ) ; final int X10_TEMP160 = ( X10_TEMP157 + a_padSize2 ) ; final Region3 X10_TEMP162 = Program . createNewRegion3RRR ( X10_TEMP119 , X10_TEMP120 , X10_TEMP139 , X10_TEMP140 , X10_TEMP159 , X10_TEMP160 ) ; return X10_TEMP162 ; }
 }
 else { final String X10_TEMP164 = ( "MG3TongValue1.boundary():Warning! invalid inputs!" ) ; System.out.println ( X10_TEMP164 ) ; final int X10_TEMP169 = ( 0 ) ; final int X10_TEMP166 = ( 1 ) ; final int X10_TEMP167 = 0 ; final int X10_TEMP170 = ( X10_TEMP167 - X10_TEMP166 ) ; final int X10_TEMP175 = ( 0 ) ; final int X10_TEMP172 = ( 1 ) ; final int X10_TEMP173 = 0 ; final int X10_TEMP176 = ( X10_TEMP173 - X10_TEMP172 ) ; final int X10_TEMP181 = ( 0 ) ; final int X10_TEMP178 = ( 1 ) ; final int X10_TEMP179 = 0 ; final int X10_TEMP182 = ( X10_TEMP179 - X10_TEMP178 ) ; final Region3 X10_TEMP184 = Program . createNewRegion3RRR ( X10_TEMP169 , X10_TEMP170 , X10_TEMP175 , X10_TEMP176 , X10_TEMP181 , X10_TEMP182 ) ; return X10_TEMP184 ; }
 }
 public static void Util_arraycopy3 ( final doubleRefArray3 a_dest , final Region3 a_destR , final doubleRefArray3 a_src ) { final int RX10_TEMP3 = 1 ; int RX10_TEMP1 = a_destR . regSize ; RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; final region ( : rank==1 ) RX10_TEMP2 = [ 0 : RX10_TEMP1 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP2 ) { final int RX10_TEMP4 = RX10_TEMP0 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( a_destR , RX10_TEMP4 ) ; final place h = ( here ) ; final Dist3 RX10_TEMP5 = a_src . distValue ; final Dist3 X10_TEMP3 = RX10_TEMP5 ; final Region3 RX10_TEMP6 = X10_TEMP3 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion3 ( RX10_TEMP6 , p ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point p not found in the distribution X10_TEMP3." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist3 ( X10_TEMP3 , RX10_TEMP7 ) ; final place X10_TEMP6 = RX10_TEMP11 ; 
 final T20 utmp20 = new T20(h, p, a_src, a_dest);
 async (X10_TEMP6) {Program.thread20(utmp20); }
 }
 }
 public static void Util_arraycopy4 ( final doubleRefArray3 a_dest , final Region3 a_destR , final doubleRefArray3 a_src , final int a_trans0 , final int a_trans1 , final int a_trans2 ) { final int RX10_TEMP3 = 1 ; int RX10_TEMP1 = a_destR . regSize ; RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; final region ( : rank==1 ) RX10_TEMP2 = [ 0 : RX10_TEMP1 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP2 ) { final int RX10_TEMP4 = RX10_TEMP0 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( a_destR , RX10_TEMP4 ) ; final place h = ( here ) ; final Dist3 RX10_TEMP5 = a_src . distValue ; final Dist3 X10_TEMP3 = RX10_TEMP5 ; int RX10_TEMP6 = p . f0 ; int RX10_TEMP7 = p . f1 ; int RX10_TEMP8 = p . f2 ; RX10_TEMP6 = RX10_TEMP6 + a_trans0 ; RX10_TEMP7 = RX10_TEMP7 + a_trans1 ; RX10_TEMP8 = RX10_TEMP8 + a_trans2 ; Point3 X10_TEMP8 = ( new Point3 ( RX10_TEMP6 , RX10_TEMP7 , RX10_TEMP8 ) ) ; final Region3 RX10_TEMP9 = X10_TEMP3 . dReg ; final int RX10_TEMP10 = Program . searchPointInRegion3 ( RX10_TEMP9 , X10_TEMP8 ) ; final int RX10_TEMP11 = 0 ; final boolean RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11 ; if ( RX10_TEMP12 ) { final String RX10_TEMP13 = "Point X10_TEMP8 not found in the distribution X10_TEMP3." ; throw new RuntimeException ( RX10_TEMP13 ) ; }
 final place RX10_TEMP14 = Program . getPlaceFromDist3 ( X10_TEMP3 , RX10_TEMP10 ) ; final place X10_TEMP10 = RX10_TEMP14 ; 
 final T21 utmp21 = new T21(h, p, a_trans2, a_trans1, a_trans0, a_src, a_dest);
 async (X10_TEMP10) {Program.thread21(utmp21); }
 }
 }
 public static void MGDriver_driver ( ) { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; }
 finish { int CLASS = ( 1 ) ; final boolean isDistributed = ( true ) ; int problemSize = ( 0 ) ; int numberIterations = ( 0 ) ; double reference2Norm = ( 0 ) ; final int X10_TEMP11 = 1 ; final int X10_TEMP19 = 2 ; final int X10_TEMP27 = 3 ; final int X10_TEMP35 = 4 ; final int X10_TEMP43 = 5 ; final int X10_TEMP51 = 6 ; switch ( CLASS ) { case X10_TEMP11 : { final int X10_TEMP13 = ( 32 ) ; problemSize = ( X10_TEMP13 ) ; final int X10_TEMP15 = ( 4 ) ; numberIterations = ( X10_TEMP15 ) ; final double X10_TEMP17 = ( 5.30770700573E-5 ) ; reference2Norm = ( X10_TEMP17 ) ; break ; }
 case X10_TEMP19 : { final int X10_TEMP21 = ( 64 ) ; problemSize = ( X10_TEMP21 ) ; final int X10_TEMP23 = ( 40 ) ; numberIterations = ( X10_TEMP23 ) ; final double X10_TEMP25 = ( 2.50391406439E-18 ) ; reference2Norm = ( X10_TEMP25 ) ; break ; }
 case X10_TEMP27 : { final int X10_TEMP29 = ( 256 ) ; problemSize = ( X10_TEMP29 ) ; final int X10_TEMP31 = ( 4 ) ; numberIterations = ( X10_TEMP31 ) ; final double X10_TEMP33 = ( 2.433365309e-6 ) ; reference2Norm = ( X10_TEMP33 ) ; break ; }
 case X10_TEMP35 : { final int X10_TEMP37 = ( 256 ) ; problemSize = ( X10_TEMP37 ) ; final int X10_TEMP39 = ( 20 ) ; numberIterations = ( X10_TEMP39 ) ; final double X10_TEMP41 = ( 1.80056440132e-6 ) ; reference2Norm = ( X10_TEMP41 ) ; break ; }
 case X10_TEMP43 : { final int X10_TEMP45 = ( 512 ) ; problemSize = ( X10_TEMP45 ) ; final int X10_TEMP47 = ( 20 ) ; numberIterations = ( X10_TEMP47 ) ; final double X10_TEMP49 = ( 5.70674826298e-7 ) ; reference2Norm = ( X10_TEMP49 ) ; break ; }
 case X10_TEMP51 : { final int X10_TEMP53 = ( 1024 ) ; problemSize = ( X10_TEMP53 ) ; final int X10_TEMP55 = ( 50 ) ; numberIterations = ( X10_TEMP55 ) ; final double X10_TEMP57 = ( 1.58327506043e-10 ) ; reference2Norm = ( X10_TEMP57 ) ; break ; }
 default : { final String X10_TEMP59 = ( "Class must be one of {S,W,A,B,C,D}!" ) ; System.err.println ( X10_TEMP59 ) ; }
 } LevelData u = ( new LevelData ( problemSize , isDistributed ) ) ; LevelData v = ( new LevelData ( problemSize , isDistributed ) ) ; Program . LevelData_initialize ( v , CLASS ) ; MGOP MG = ( new MGOP ( problemSize ) ) ; final String X10_TEMP69 = ( "There are " ) ; final String X10_TEMP70 = ( X10_TEMP69 + _Util_N_PLACES ) ; final String X10_TEMP71 = ( " places. Running problem of class " ) ; final String X10_TEMP72 = ( X10_TEMP70 + X10_TEMP71 ) ; final String X10_TEMP74 = ( X10_TEMP72 + CLASS ) ; System.out.println ( X10_TEMP74 ) ; double res = ( 0 ) ; final double X10_TEMP80 = ( Program . MGOP_MGSolve ( MG , u , v , numberIterations ) ) ; res = ( X10_TEMP80 ) ; final String X10_TEMP81 = ( "The reference 2norm is " ) ; final String X10_TEMP82 = ( X10_TEMP81 + reference2Norm ) ; final String X10_TEMP83 = ( ". The difference is " ) ; final String X10_TEMP86 = ( X10_TEMP82 + X10_TEMP83 ) ; final double X10_TEMP85 = ( res - reference2Norm ) ; final String X10_TEMP88 = ( X10_TEMP86 + X10_TEMP85 ) ; System.out.println ( X10_TEMP88 ) ; }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP91 = ( "Wall-clock time for MGSolve: " ) ; final double X10_TEMP92 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP93 = ( X10_TEMP91 + X10_TEMP92 ) ; final String X10_TEMP94 = ( "secs" ) ; final String X10_TEMP96 = ( X10_TEMP93 + X10_TEMP94 ) ; System.out.println ( X10_TEMP96 ) ; }
 public static String Wrapper_toString ( final Wrapper X10_TEMP0 ) { final String X10_TEMP2 = ( "" ) ; return X10_TEMP2 ; }
 public static String LevelData_toString ( final LevelData X10_TEMP0 ) { final String X10_TEMP2 = ( "" ) ; return X10_TEMP2 ; }
 public static boolean _LevelData_PERF_On_init ( ) { return _Util_PERF_OUTPUT ; }
 public static double _LevelData_PERF_Comp_init ( ) { final double X10_TEMP1 = ( 1.0 ) ; final double X10_TEMP3 = ( X10_TEMP1 / _Util_FP_PERCLOCK ) ; return X10_TEMP3 ; }
 public static double _LevelData_PERF_CommL_init ( ) { final double X10_TEMP2 = ( _Util_COMM_LATENCY * _Util_CLOCK_SPEED ) ; return X10_TEMP2 ; }
 public static double _LevelData_PERF_CommB_init ( ) { final double X10_TEMP1 = ( ( double ) _Util_CLOCK_SPEED ) ; final double X10_TEMP2 = ( ( double ) _Util_COMM_BANDWIDTH ) ; final double X10_TEMP4 = ( X10_TEMP1 / X10_TEMP2 ) ; final double X10_TEMP5 = ( 8.0 ) ; final double X10_TEMP7 = ( X10_TEMP4 * X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static boolean _LevelData_PERF_InLoop_init ( ) { return _Util_IN_LOOP ; }
 public static boolean _LevelData_PERF_CompOnly_init ( ) { return _Util_COMP_ONLY ; }
 public static boolean _LevelData_PERF_CommOnly_init ( ) { return _Util_COMM_ONLY ; }
 public static int _LevelData_N_PLACES_init ( ) { return _Util_N_PLACES ; }
 public static int _LevelData_HIGH_init ( ) { return _Util_HIGH ; }
 public static int _LevelData_LOW_init ( ) { return _Util_LOW ; }
 public static Dist1 LevelData_getPlaces ( final LevelData X10_TEMP0 ) { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; return X10_TEMP2 ; }
 public static doubleRefArray3 LevelData_getArray ( final LevelData X10_TEMP0 , final int a_idx ) { final WrapperRefArray1 X10_TEMP1 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP0 = new Point1 ( a_idx ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final Wrapper RX10_TEMP11 = Program . getRefArrayValue1Wrapper ( X10_TEMP1 , RX10_TEMP3 ) ; final Wrapper X10_TEMP3 = ( RX10_TEMP11 ) ; final doubleRefArray3 X10_TEMP5 = X10_TEMP3 . m_array ; return X10_TEMP5 ; }
 public static Region3 LevelData_getInnerRegion ( final LevelData X10_TEMP0 , final int a_idx ) { final Region3 X10_TEMP2 = Program . LevelData_get_m_regions ( X10_TEMP0 , a_idx ) ; return X10_TEMP2 ; }
 public static Region3 LevelData_getINNERRegion ( final LevelData X10_TEMP0 , final int a_idx ) { final Region3RefArray1 X10_TEMP1 = X10_TEMP0 . m_regions ; final Point1 RX10_TEMP0 = new Point1 ( a_idx ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final Region3 RX10_TEMP11 = Program . getRefArrayValue1Region3 ( X10_TEMP1 , RX10_TEMP3 ) ; final Region3 X10_TEMP3 = RX10_TEMP11 ; Region3 R = X10_TEMP3 ; final int X10_TEMP6 = ( 0 ) ; final Region1 RX10_TEMP12 = Program . getRank3 ( R , X10_TEMP6 ) ; final Region1 X10_TEMP7 = RX10_TEMP12 ; final int RX10_TEMP13 = X10_TEMP7 . regSize ; final int RX10_TEMP14 = 0 ; final boolean RX10_TEMP15 = RX10_TEMP13 <= RX10_TEMP14 ; if ( RX10_TEMP15 ) { final String RX10_TEMP16 = "Operation low() not defined on empty region X10_TEMP7" ; throw new RuntimeException ( RX10_TEMP16 ) ; }
 final int X10_TEMP8 = ( Program . regionLow ( X10_TEMP7 ) ) ; final int X10_TEMP9 = ( 1 ) ; final int X10_TEMP17 = ( X10_TEMP8 + X10_TEMP9 ) ; final int X10_TEMP12 = ( 0 ) ; final Region1 RX10_TEMP17 = Program . getRank3 ( R , X10_TEMP12 ) ; final Region1 X10_TEMP13 = RX10_TEMP17 ; final int RX10_TEMP18 = X10_TEMP13 . regSize ; final int RX10_TEMP19 = 0 ; final boolean RX10_TEMP20 = RX10_TEMP18 <= RX10_TEMP19 ; if ( RX10_TEMP20 ) { final String RX10_TEMP21 = "Operation high() not defined on empty region X10_TEMP13" ; throw new RuntimeException ( RX10_TEMP21 ) ; }
 final int X10_TEMP14 = ( Program . regionHigh ( X10_TEMP13 ) ) ; final int X10_TEMP15 = ( 1 ) ; final int X10_TEMP18 = ( X10_TEMP14 - X10_TEMP15 ) ; final int X10_TEMP20 = ( 1 ) ; final Region1 RX10_TEMP22 = Program . getRank3 ( R , X10_TEMP20 ) ; final Region1 X10_TEMP21 = RX10_TEMP22 ; final int RX10_TEMP23 = X10_TEMP21 . regSize ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 <= RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Operation low() not defined on empty region X10_TEMP21" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final int X10_TEMP22 = ( Program . regionLow ( X10_TEMP21 ) ) ; final int X10_TEMP23 = ( 1 ) ; final int X10_TEMP31 = ( X10_TEMP22 + X10_TEMP23 ) ; final int X10_TEMP26 = ( 1 ) ; final Region1 RX10_TEMP27 = Program . getRank3 ( R , X10_TEMP26 ) ; final Region1 X10_TEMP27 = RX10_TEMP27 ; final int RX10_TEMP28 = X10_TEMP27 . regSize ; final int RX10_TEMP29 = 0 ; final boolean RX10_TEMP30 = RX10_TEMP28 <= RX10_TEMP29 ; if ( RX10_TEMP30 ) { final String RX10_TEMP31 = "Operation high() not defined on empty region X10_TEMP27" ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final int X10_TEMP28 = ( Program . regionHigh ( X10_TEMP27 ) ) ; final int X10_TEMP29 = ( 1 ) ; final int X10_TEMP32 = ( X10_TEMP28 - X10_TEMP29 ) ; final int X10_TEMP34 = ( 2 ) ; final Region1 RX10_TEMP32 = Program . getRank3 ( R , X10_TEMP34 ) ; final Region1 X10_TEMP35 = RX10_TEMP32 ; final int RX10_TEMP33 = X10_TEMP35 . regSize ; final int RX10_TEMP34 = 0 ; final boolean RX10_TEMP35 = RX10_TEMP33 <= RX10_TEMP34 ; if ( RX10_TEMP35 ) { final String RX10_TEMP36 = "Operation low() not defined on empty region X10_TEMP35" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final int X10_TEMP36 = ( Program . regionLow ( X10_TEMP35 ) ) ; final int X10_TEMP37 = ( 1 ) ; final int X10_TEMP45 = ( X10_TEMP36 + X10_TEMP37 ) ; final int X10_TEMP40 = ( 2 ) ; final Region1 RX10_TEMP37 = Program . getRank3 ( R , X10_TEMP40 ) ; final Region1 X10_TEMP41 = RX10_TEMP37 ; final int RX10_TEMP38 = X10_TEMP41 . regSize ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 <= RX10_TEMP39 ; if ( RX10_TEMP40 ) { final String RX10_TEMP41 = "Operation high() not defined on empty region X10_TEMP41" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final int X10_TEMP42 = ( Program . regionHigh ( X10_TEMP41 ) ) ; final int X10_TEMP43 = ( 1 ) ; final int X10_TEMP46 = ( X10_TEMP42 - X10_TEMP43 ) ; final Region3 X10_TEMP48 = Program . createNewRegion3RRR ( X10_TEMP17 , X10_TEMP18 , X10_TEMP31 , X10_TEMP32 , X10_TEMP45 , X10_TEMP46 ) ; return X10_TEMP48 ; }
 public static Region3 LevelData_getShrinkedRegion ( final LevelData X10_TEMP0 , final int a_idx ) { final Region3 X10_TEMP2 = Program . LevelData_get_m_REGIONs ( X10_TEMP0 , a_idx ) ; Region3 R = X10_TEMP2 ; final int X10_TEMP5 = ( 0 ) ; final Region1 RX10_TEMP0 = Program . getRank3 ( R , X10_TEMP5 ) ; final Region1 X10_TEMP6 = RX10_TEMP0 ; final int RX10_TEMP1 = X10_TEMP6 . regSize ; final int RX10_TEMP2 = 0 ; final boolean RX10_TEMP3 = RX10_TEMP1 <= RX10_TEMP2 ; if ( RX10_TEMP3 ) { final String RX10_TEMP4 = "Operation low() not defined on empty region X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP4 ) ; }
 final int X10_TEMP14 = ( Program . regionLow ( X10_TEMP6 ) ) ; final int X10_TEMP9 = ( 0 ) ; final Region1 RX10_TEMP5 = Program . getRank3 ( R , X10_TEMP9 ) ; final Region1 X10_TEMP10 = RX10_TEMP5 ; final int RX10_TEMP6 = X10_TEMP10 . regSize ; final int RX10_TEMP7 = 0 ; final boolean RX10_TEMP8 = RX10_TEMP6 <= RX10_TEMP7 ; if ( RX10_TEMP8 ) { final String RX10_TEMP9 = "Operation high() not defined on empty region X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP9 ) ; }
 final int X10_TEMP11 = ( Program . regionHigh ( X10_TEMP10 ) ) ; final int X10_TEMP12 = ( 1 ) ; final int X10_TEMP15 = ( X10_TEMP11 - X10_TEMP12 ) ; final int X10_TEMP17 = ( 1 ) ; final Region1 RX10_TEMP10 = Program . getRank3 ( R , X10_TEMP17 ) ; final Region1 X10_TEMP18 = RX10_TEMP10 ; final int RX10_TEMP11 = X10_TEMP18 . regSize ; final int RX10_TEMP12 = 0 ; final boolean RX10_TEMP13 = RX10_TEMP11 <= RX10_TEMP12 ; if ( RX10_TEMP13 ) { final String RX10_TEMP14 = "Operation low() not defined on empty region X10_TEMP18" ; throw new RuntimeException ( RX10_TEMP14 ) ; }
 final int X10_TEMP26 = ( Program . regionLow ( X10_TEMP18 ) ) ; final int X10_TEMP21 = ( 1 ) ; final Region1 RX10_TEMP15 = Program . getRank3 ( R , X10_TEMP21 ) ; final Region1 X10_TEMP22 = RX10_TEMP15 ; final int RX10_TEMP16 = X10_TEMP22 . regSize ; final int RX10_TEMP17 = 0 ; final boolean RX10_TEMP18 = RX10_TEMP16 <= RX10_TEMP17 ; if ( RX10_TEMP18 ) { final String RX10_TEMP19 = "Operation high() not defined on empty region X10_TEMP22" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 final int X10_TEMP23 = ( Program . regionHigh ( X10_TEMP22 ) ) ; final int X10_TEMP24 = ( 1 ) ; final int X10_TEMP27 = ( X10_TEMP23 - X10_TEMP24 ) ; final int X10_TEMP29 = ( 2 ) ; final Region1 RX10_TEMP20 = Program . getRank3 ( R , X10_TEMP29 ) ; final Region1 X10_TEMP30 = RX10_TEMP20 ; final int RX10_TEMP21 = X10_TEMP30 . regSize ; final int RX10_TEMP22 = 0 ; final boolean RX10_TEMP23 = RX10_TEMP21 <= RX10_TEMP22 ; if ( RX10_TEMP23 ) { final String RX10_TEMP24 = "Operation low() not defined on empty region X10_TEMP30" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final int X10_TEMP38 = ( Program . regionLow ( X10_TEMP30 ) ) ; final int X10_TEMP33 = ( 2 ) ; final Region1 RX10_TEMP25 = Program . getRank3 ( R , X10_TEMP33 ) ; final Region1 X10_TEMP34 = RX10_TEMP25 ; final int RX10_TEMP26 = X10_TEMP34 . regSize ; final int RX10_TEMP27 = 0 ; final boolean RX10_TEMP28 = RX10_TEMP26 <= RX10_TEMP27 ; if ( RX10_TEMP28 ) { final String RX10_TEMP29 = "Operation high() not defined on empty region X10_TEMP34" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 final int X10_TEMP35 = ( Program . regionHigh ( X10_TEMP34 ) ) ; final int X10_TEMP36 = ( 1 ) ; final int X10_TEMP39 = ( X10_TEMP35 - X10_TEMP36 ) ; final Region3 X10_TEMP41 = Program . createNewRegion3RRR ( X10_TEMP14 , X10_TEMP15 , X10_TEMP26 , X10_TEMP27 , X10_TEMP38 , X10_TEMP39 ) ; return X10_TEMP41 ; }
 public static Region3 LevelData_getRegion ( final LevelData X10_TEMP0 , final int a_idx ) { final Region3RefArray1 X10_TEMP1 = X10_TEMP0 . m_REGIONs ; final Point1 RX10_TEMP0 = new Point1 ( a_idx ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final Region3 RX10_TEMP11 = Program . getRefArrayValue1Region3 ( X10_TEMP1 , RX10_TEMP3 ) ; final Region3 X10_TEMP3 = RX10_TEMP11 ; return X10_TEMP3 ; }
 public static void LevelData_print ( final LevelData X10_TEMP0 ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T22 utmp22 = new T22(i, X10_TEMP0);
 async (X10_TEMP4) {Program.thread22(utmp22); }
 }
 }
 }
 public static void LevelData_PRINT ( final LevelData X10_TEMP0 ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T23 utmp23 = new T23(i, X10_TEMP0);
 async (X10_TEMP4) {Program.thread23(utmp23); }
 }
 }
 }
 public static double LevelData_norm2 ( final LevelData X10_TEMP0 ) { final Dist1 X10_TEMP1 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP0 = X10_TEMP1 . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( X10_TEMP1 , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T24 utmp24 = new T24(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread24(utmp24); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1 ( X10_TEMP1 , RX10_TEMP16 ) ; final doubleRefArray1 results = RX10_TEMP19 ; finish { final Dist1 X10_TEMP4 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP21 = X10_TEMP4 . dReg ; final int RX10_TEMP24 = 1 ; int RX10_TEMP22 = RX10_TEMP21 . regSize ; RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24 ; final region ( : rank==1 ) RX10_TEMP23 = [ 0 : RX10_TEMP22 ] ; for ( point ( : rank==1 ) RX10_TEMP20 : RX10_TEMP23 ) { final int RX10_TEMP25 = RX10_TEMP20 [0] ; final Point1 X10_TEMP5 = Program . regionOrdinalPoint1 ( RX10_TEMP21 , RX10_TEMP25 ) ; final int i = X10_TEMP5 . f0 ; final Region1 RX10_TEMP26 = X10_TEMP4 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , X10_TEMP5 ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { final String RX10_TEMP30 = "Point X10_TEMP5 not found in the distribution X10_TEMP4." ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( X10_TEMP4 , RX10_TEMP27 ) ; final place X10_TEMP6 = RX10_TEMP31 ; 
 final T25 utmp25 = new T25(i, results, X10_TEMP0);
 async (X10_TEMP6) {Program.thread25(utmp25); }
 }
 }
 final double X10_TEMP55 = ( Program . doublerefArraySum1 ( results ) ) ; final int X10_TEMP49 = ( X10_TEMP0 . SIZE ) ; final int X10_TEMP50 = ( X10_TEMP0 . SIZE ) ; final int X10_TEMP51 = ( X10_TEMP49 * X10_TEMP50 ) ; final int X10_TEMP52 = ( X10_TEMP0 . SIZE ) ; final int X10_TEMP54 = ( X10_TEMP51 * X10_TEMP52 ) ; double temp = ( X10_TEMP55 / X10_TEMP54 ) ; final double X10_TEMP59 = ( Math . sqrt ( temp ) ) ; return X10_TEMP59 ; }
 public static void LevelData_initialize ( final LevelData X10_TEMP0 , final int a_CLASS ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T26 utmp26 = new T26(i, a_CLASS, X10_TEMP0);
 async (X10_TEMP4) {Program.thread26(utmp26); }
 }
 }
 final boolean X10_TEMP1418 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP1418 ) { finish { Program . LevelData_exchange ( X10_TEMP0 ) ; }
 }
 }
 public static void LevelData_set ( final LevelData X10_TEMP0 , final double a_db ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T27 utmp27 = new T27(i, a_db, X10_TEMP0);
 async (X10_TEMP4) {Program.thread27(utmp27); }
 }
 }
 final boolean X10_TEMP16 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP16 ) { finish { Program . LevelData_exchange ( X10_TEMP0 ) ; }
 }
 }
 public static void LevelData_setLevelData ( final LevelData X10_TEMP0 , final LevelData a_LD ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T28 utmp28 = new T28(i, a_LD, X10_TEMP0);
 async (X10_TEMP4) {Program.thread28(utmp28); }
 }
 }
 final boolean X10_TEMP25 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP25 ) { finish { Program . LevelData_exchange ( X10_TEMP0 ) ; }
 }
 }
 public static void LevelData_add ( final LevelData X10_TEMP0 , final LevelData a_LD ) { finish { final Dist1 X10_TEMP2 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP3 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP3 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP2 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP3 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP3 not found in the distribution X10_TEMP2." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP2 , RX10_TEMP7 ) ; final place X10_TEMP4 = RX10_TEMP11 ; 
 final T29 utmp29 = new T29(i, a_LD, X10_TEMP0);
 async (X10_TEMP4) {Program.thread29(utmp29); }
 }
 }
 final boolean X10_TEMP23 = X10_TEMP0 . EXCHANGE_After ; if ( X10_TEMP23 ) { finish { Program . LevelData_exchange ( X10_TEMP0 ) ; }
 }
 }
 public static void LevelData_Exchange ( final LevelData X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 2 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = X10_TEMP6 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 RX10_TEMP1 = Program . regionOrdinalPoint1 ( X10_TEMP6 , RX10_TEMP5 ) ; final int j = RX10_TEMP1 . f0 ; final int jj = ( j ) ; finish { final Dist1 X10_TEMP9 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP7 = X10_TEMP9 . dReg ; final int RX10_TEMP10 = 1 ; int RX10_TEMP8 = RX10_TEMP7 . regSize ; RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10 ; final region ( : rank==1 ) RX10_TEMP9 = [ 0 : RX10_TEMP8 ] ; for ( point ( : rank==1 ) RX10_TEMP6 : RX10_TEMP9 ) { final int RX10_TEMP11 = RX10_TEMP6 [0] ; final Point1 X10_TEMP10 = Program . regionOrdinalPoint1 ( RX10_TEMP7 , RX10_TEMP11 ) ; final int i = X10_TEMP10 . f0 ; final Region1 RX10_TEMP12 = X10_TEMP9 . dReg ; final int RX10_TEMP13 = Program . searchPointInRegion1 ( RX10_TEMP12 , X10_TEMP10 ) ; final int RX10_TEMP14 = 0 ; final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14 ; if ( RX10_TEMP15 ) { final String RX10_TEMP16 = "Point X10_TEMP10 not found in the distribution X10_TEMP9." ; throw new RuntimeException ( RX10_TEMP16 ) ; }
 final place RX10_TEMP17 = Program . getPlaceFromDist1 ( X10_TEMP9 , RX10_TEMP13 ) ; final place X10_TEMP11 = RX10_TEMP17 ; 
 final T30 utmp30 = new T30(i, jj, X10_TEMP0);
 async (X10_TEMP11) {Program.thread30(utmp30); }
 }
 }
 }
 }
 public static void LevelData_exchange ( final LevelData X10_TEMP0 ) { final place X10_TEMP2 = here ; 
 final T31 utmp31 = new T31(X10_TEMP0);
 async (X10_TEMP2) {Program.thread31(utmp31); }
 }
 public static Region3 LevelData_get_m_regions ( final LevelData X10_TEMP0 , final int i ) { final place h = ( here ) ; final int X10_TEMP4 = ( 0 ) ; final int X10_TEMP5 = ( 0 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; final place X10_TEMP7 = ( here ) ; final Dist1 X10_TEMP9 = Program . getPlaceDist1 ( X10_TEMP6 , X10_TEMP7 ) ; final Dist1 dRecv = X10_TEMP9 ; final Region1 RX10_TEMP0 = dRecv . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region3Stub [ : rank==1 ] RX10_TEMP6 = ( Region3Stub [ : rank==1 ] ) ( new Region3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dRecv , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T32 utmp32 = new T32(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread32(utmp32); }
 }
 }
 final Region3Stub value [ : rank==1 ] RX10_TEMP16 = ( Region3Stub value [ : rank==1 ] ) ( new Region3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Region3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1 ( dRecv , RX10_TEMP16 ) ; final Region3RefArray1 X10_TEMP11 = RX10_TEMP19 ; final Region3RefArray1 aRecv = X10_TEMP11 ; finish { final Region3RefArray1 X10_TEMP13 = X10_TEMP0 . m_regions ; final Dist1 RX10_TEMP20 = X10_TEMP13 . distValue ; final Dist1 X10_TEMP14 = RX10_TEMP20 ; final Point1 RX10_TEMP21 = new Point1 ( i ) ; final Region1 RX10_TEMP22 = X10_TEMP14 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP21 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14." ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( X10_TEMP14 , RX10_TEMP23 ) ; final place X10_TEMP17 = RX10_TEMP27 ; 
 final T33 utmp33 = new T33(aRecv, h, i, X10_TEMP0);
 async (X10_TEMP17) {Program.thread33(utmp33); }
 }
 final int X10_TEMP28 = ( 0 ) ; final Point1 RX10_TEMP51 = new Point1 ( X10_TEMP28 ) ; final Dist1 RX10_TEMP52 = aRecv . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final Region3 RX10_TEMP62 = Program . getRefArrayValue1Region3 ( aRecv , RX10_TEMP54 ) ; final Region3 X10_TEMP29 = RX10_TEMP62 ; final Region3 mri = X10_TEMP29 ; return mri ; }
 public static Region3 LevelData_get_m_REGIONs ( final LevelData X10_TEMP0 , final int i ) { final place h = ( here ) ; final int X10_TEMP4 = ( 0 ) ; final int X10_TEMP5 = ( 0 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; final place X10_TEMP7 = ( here ) ; final Dist1 X10_TEMP9 = Program . getPlaceDist1 ( X10_TEMP6 , X10_TEMP7 ) ; final Dist1 dRecv = X10_TEMP9 ; final Region1 RX10_TEMP0 = dRecv . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region3Stub [ : rank==1 ] RX10_TEMP6 = ( Region3Stub [ : rank==1 ] ) ( new Region3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dRecv , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T34 utmp34 = new T34(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread34(utmp34); }
 }
 }
 final Region3Stub value [ : rank==1 ] RX10_TEMP16 = ( Region3Stub value [ : rank==1 ] ) ( new Region3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Region3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1 ( dRecv , RX10_TEMP16 ) ; final Region3RefArray1 X10_TEMP11 = RX10_TEMP19 ; final Region3RefArray1 aRecv = X10_TEMP11 ; finish { final Region3RefArray1 X10_TEMP13 = X10_TEMP0 . m_REGIONs ; final Dist1 RX10_TEMP20 = X10_TEMP13 . distValue ; final Dist1 X10_TEMP14 = RX10_TEMP20 ; final Point1 RX10_TEMP21 = new Point1 ( i ) ; final Region1 RX10_TEMP22 = X10_TEMP14 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP21 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14." ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( X10_TEMP14 , RX10_TEMP23 ) ; final place X10_TEMP17 = RX10_TEMP27 ; 
 final T35 utmp35 = new T35(aRecv, h, i, X10_TEMP0);
 async (X10_TEMP17) {Program.thread35(utmp35); }
 }
 final int X10_TEMP28 = ( 0 ) ; final Point1 RX10_TEMP51 = new Point1 ( X10_TEMP28 ) ; final Dist1 RX10_TEMP52 = aRecv . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final Region3 RX10_TEMP62 = Program . getRefArrayValue1Region3 ( aRecv , RX10_TEMP54 ) ; final Region3 X10_TEMP29 = RX10_TEMP62 ; final Region3 mri = X10_TEMP29 ; return mri ; }
 public static Region3 LevelData_get_m_boundaries ( final LevelData X10_TEMP0 , final int i , final int j ) { final place h = ( here ) ; final int X10_TEMP4 = ( 0 ) ; final int X10_TEMP5 = ( 0 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; final place X10_TEMP7 = ( here ) ; final Dist1 X10_TEMP9 = Program . getPlaceDist1 ( X10_TEMP6 , X10_TEMP7 ) ; final Dist1 dRecv = X10_TEMP9 ; final Region1 RX10_TEMP0 = dRecv . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region3Stub [ : rank==1 ] RX10_TEMP6 = ( Region3Stub [ : rank==1 ] ) ( new Region3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dRecv , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T36 utmp36 = new T36(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread36(utmp36); }
 }
 }
 final Region3Stub value [ : rank==1 ] RX10_TEMP16 = ( Region3Stub value [ : rank==1 ] ) ( new Region3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Region3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1 ( dRecv , RX10_TEMP16 ) ; final Region3RefArray1 X10_TEMP11 = RX10_TEMP19 ; final Region3RefArray1 aRecv = X10_TEMP11 ; finish { final Region3RefArray2 X10_TEMP13 = X10_TEMP0 . m_boundaries ; final Dist2 RX10_TEMP20 = X10_TEMP13 . distValue ; final Dist2 X10_TEMP14 = RX10_TEMP20 ; final Point2 RX10_TEMP21 = new Point2 ( i , j ) ; final Region2 RX10_TEMP22 = X10_TEMP14 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion2 ( RX10_TEMP22 , RX10_TEMP21 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14." ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist2 ( X10_TEMP14 , RX10_TEMP23 ) ; final place X10_TEMP18 = RX10_TEMP27 ; 
 final T37 utmp37 = new T37(aRecv, h, j, i, X10_TEMP0);
 async (X10_TEMP18) {Program.thread37(utmp37); }
 }
 final int X10_TEMP30 = ( 0 ) ; final Point1 RX10_TEMP51 = new Point1 ( X10_TEMP30 ) ; final Dist1 RX10_TEMP52 = aRecv . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final Region3 RX10_TEMP62 = Program . getRefArrayValue1Region3 ( aRecv , RX10_TEMP54 ) ; final Region3 X10_TEMP31 = RX10_TEMP62 ; final Region3 mri = X10_TEMP31 ; return mri ; }
 public static Wrapper LevelData_get_m_u ( final LevelData X10_TEMP0 , final int i ) { final place h = ( here ) ; final int X10_TEMP4 = ( 0 ) ; final int X10_TEMP5 = ( 0 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; final place X10_TEMP7 = ( here ) ; final Dist1 X10_TEMP9 = Program . getPlaceDist1 ( X10_TEMP6 , X10_TEMP7 ) ; final Dist1 dRecv = X10_TEMP9 ; final Region1 RX10_TEMP0 = dRecv . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final WrapperStub [ : rank==1 ] RX10_TEMP6 = ( WrapperStub [ : rank==1 ] ) ( new WrapperStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dRecv , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T38 utmp38 = new T38(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread38(utmp38); }
 }
 }
 final WrapperStub value [ : rank==1 ] RX10_TEMP16 = ( WrapperStub value [ : rank==1 ] ) ( new WrapperStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final WrapperStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final WrapperRefArray1 RX10_TEMP19 = new WrapperRefArray1 ( dRecv , RX10_TEMP16 ) ; final WrapperRefArray1 X10_TEMP11 = RX10_TEMP19 ; final WrapperRefArray1 aRecv = X10_TEMP11 ; finish { final WrapperRefArray1 X10_TEMP13 = X10_TEMP0 . m_u ; final Dist1 RX10_TEMP20 = X10_TEMP13 . distValue ; final Dist1 X10_TEMP14 = RX10_TEMP20 ; final Point1 RX10_TEMP21 = new Point1 ( i ) ; final Region1 RX10_TEMP22 = X10_TEMP14 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP21 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Point RX10_TEMP21 not found in the distribution X10_TEMP14." ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( X10_TEMP14 , RX10_TEMP23 ) ; final place X10_TEMP17 = RX10_TEMP27 ; 
 final T39 utmp39 = new T39(aRecv, h, i, X10_TEMP0);
 async (X10_TEMP17) {Program.thread39(utmp39); }
 }
 final int X10_TEMP27 = ( 0 ) ; final Point1 RX10_TEMP51 = new Point1 ( X10_TEMP27 ) ; final Dist1 RX10_TEMP52 = aRecv . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final Wrapper RX10_TEMP62 = Program . getRefArrayValue1Wrapper ( aRecv , RX10_TEMP54 ) ; final Wrapper mri = ( RX10_TEMP62 ) ; return mri ; }
 public static int _Timer_max_counters_init ( ) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; }
 public static void Timer_start ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . start_time ; final double X10_TEMP4 = ( System.currentTimeMillis ( ) ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; }
 public static void Timer_stop ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . elapsed_time ; final double X10_TEMP5 = ( System.currentTimeMillis ( ) ) ; final doubleRefArray1 X10_TEMP3 = X10_TEMP0 . start_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP3 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP3 , RX10_TEMP3 ) ; final double X10_TEMP6 = ( RX10_TEMP11 ) ; final double X10_TEMP8 = ( X10_TEMP5 - X10_TEMP6 ) ; final double X10_TEMP9 = ( X10_TEMP8 ) ; final Point1 RX10_TEMP12 = new Point1 ( n ) ; final Dist1 RX10_TEMP13 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; final doubleRefArray1 X10_TEMP10 = X10_TEMP0 . elapsed_time ; final doubleRefArray1 X10_TEMP12 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP23 = new Point1 ( n ) ; final Dist1 RX10_TEMP24 = X10_TEMP12 . distValue ; final Region1 RX10_TEMP25 = RX10_TEMP24 . dReg ; final int RX10_TEMP26 = Program . searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; final int RX10_TEMP27 = 0 ; final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; if ( RX10_TEMP28 ) { String RX10_TEMP29 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 final place RX10_TEMP30 = Program . getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; final place RX10_TEMP32 = here ; final boolean RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final double RX10_TEMP34 = Program . getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; final double X10_TEMP14 = ( RX10_TEMP34 ) ; final int X10_TEMP15 = ( 1000 ) ; final double X10_TEMP17 = ( X10_TEMP14 / X10_TEMP15 ) ; final double X10_TEMP18 = ( X10_TEMP17 ) ; final Point1 RX10_TEMP35 = new Point1 ( n ) ; final Dist1 RX10_TEMP36 = X10_TEMP10 . distValue ; final Region1 RX10_TEMP37 = RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP41 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final place RX10_TEMP42 = Program . getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access for array X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP43 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 , X10_TEMP18 ) ; final doubleRefArray1 X10_TEMP19 = X10_TEMP0 . total_time ; final doubleRefArray1 X10_TEMP21 = X10_TEMP0 . total_time ; final Point1 RX10_TEMP46 = new Point1 ( n ) ; final Dist1 RX10_TEMP47 = X10_TEMP21 . distValue ; final Region1 RX10_TEMP48 = RX10_TEMP47 . dReg ; final int RX10_TEMP49 = Program . searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final place RX10_TEMP53 = Program . getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ; final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array X10_TEMP21" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final double RX10_TEMP57 = Program . getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ; final double X10_TEMP25 = ( RX10_TEMP57 ) ; final doubleRefArray1 X10_TEMP23 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP58 = new Point1 ( n ) ; final Dist1 RX10_TEMP59 = X10_TEMP23 . distValue ; final Region1 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final double RX10_TEMP69 = Program . getRefArrayValue1double ( X10_TEMP23 , RX10_TEMP61 ) ; final double X10_TEMP26 = ( RX10_TEMP69 ) ; final double X10_TEMP28 = ( X10_TEMP25 + X10_TEMP26 ) ; final double X10_TEMP29 = ( X10_TEMP28 ) ; final Point1 RX10_TEMP70 = new Point1 ( n ) ; final Dist1 RX10_TEMP71 = X10_TEMP19 . distValue ; final Region1 RX10_TEMP72 = RX10_TEMP71 . dReg ; final int RX10_TEMP73 = Program . searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; final int RX10_TEMP74 = 0 ; final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; if ( RX10_TEMP75 ) { String RX10_TEMP76 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP76 ) ; }
 final place RX10_TEMP77 = Program . getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; final place RX10_TEMP79 = here ; final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP78 = "Bad place access for array X10_TEMP19" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; }
 public static double Timer_readTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; final double X10_TEMP4 = ( RX10_TEMP11 ) ; return X10_TEMP4 ; }
 public static void Timer_resetTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final double X10_TEMP4 = ( 0 ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; final doubleRefArray1 X10_TEMP6 = X10_TEMP0 . start_time ; final double X10_TEMP9 = ( 0 ) ; final double X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( n ) ; final Dist1 RX10_TEMP12 = X10_TEMP6 . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; final doubleRefArray1 X10_TEMP11 = X10_TEMP0 . elapsed_time ; final double X10_TEMP14 = ( 0 ) ; final double X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( n ) ; final Dist1 RX10_TEMP23 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static void Timer_resetAllTimers ( final Timer X10_TEMP0 ) { int i = ( 0 ) ; boolean X10_TEMP4 = i < _Timer_max_counters ; while ( X10_TEMP4 ) { Program . Timer_resetTimer ( X10_TEMP0 , i ) ; final int X10_TEMP6 = ( i ) ; final int X10_TEMP7 = 1 ; i = i + X10_TEMP7 ; X10_TEMP4 = i < _Timer_max_counters ; }
 }
 public static double doublerefArraySum1 ( final doubleRefArray1 sumArray ) { final int maxPlaces = place.MAX_PLACES ; final int one = 1 ; final int zero = 0 ; final int maxPlacesMinusOne = maxPlaces - one ; final Region1 dReg = Program . createNewRegion1R ( zero , maxPlacesMinusOne ) ; final place source = here ; final Dist1 dSum = Program . getPlaceDist1 ( dReg , source ) ; final double initVal = 0 ; final Region1 RX10_TEMP0 = dSum . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dSum , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T40 utmp40 = new T40(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6, initVal);
 async (RX10_TEMP10) {Program.thread40(utmp40); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( dSum , RX10_TEMP17 ) ; final doubleRefArray1 localSumArray = RX10_TEMP20 ; final Dist1 dUnique = Program . getUniqueDist ( ) ; finish { final Region1 RX10_TEMP22 = dUnique . dReg ; final int RX10_TEMP25 = 1 ; int RX10_TEMP23 = RX10_TEMP22 . regSize ; RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; final region ( : rank==1 ) RX10_TEMP24 = [ 0 : RX10_TEMP23 ] ; for ( point ( : rank==1 ) RX10_TEMP21 : RX10_TEMP24 ) { final int RX10_TEMP26 = RX10_TEMP21 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP22 , RX10_TEMP26 ) ; final Region1 RX10_TEMP27 = dUnique . dReg ; final int RX10_TEMP28 = Program . searchPointInRegion1 ( RX10_TEMP27 , p ) ; final int RX10_TEMP29 = 0 ; final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29 ; if ( RX10_TEMP30 ) { final String RX10_TEMP31 = "Point p not found in the distribution dUnique." ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final place RX10_TEMP32 = Program . getPlaceFromDist1 ( dUnique , RX10_TEMP28 ) ; final place nthPlace = RX10_TEMP32 ; 
 final T41 utmp41 = new T41(localSumArray, source, zero, sumArray);
 async (nthPlace) {Program.thread41(utmp41); }
 }
 }
 double globalSum = 0 ; final Dist1 RX10_TEMP63 = localSumArray . distValue ; final Region1 RX10_TEMP64 = RX10_TEMP63 . dReg ; final int RX10_TEMP67 = 1 ; int RX10_TEMP65 = RX10_TEMP64 . regSize ; RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67 ; final region ( : rank==1 ) RX10_TEMP66 = [ 0 : RX10_TEMP65 ] ; for ( point ( : rank==1 ) RX10_TEMP62 : RX10_TEMP66 ) { final int RX10_TEMP68 = RX10_TEMP62 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP68 ) ; final Dist1 RX10_TEMP69 = localSumArray . distValue ; final Region1 RX10_TEMP70 = RX10_TEMP69 . dReg ; final int RX10_TEMP71 = Program . searchPointInRegion1 ( RX10_TEMP70 , p ) ; final int RX10_TEMP72 = 0 ; final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72 ; if ( RX10_TEMP73 ) { String RX10_TEMP74 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP74 ) ; }
 final place RX10_TEMP75 = Program . getPlaceFromDist1 ( RX10_TEMP69 , RX10_TEMP71 ) ; final place RX10_TEMP77 = here ; final boolean RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77 ; if ( RX10_TEMP78 ) { String RX10_TEMP76 = "Bad place access for array localSumArray" ; throw new RuntimeException ( RX10_TEMP76 ) ; }
 final double RX10_TEMP79 = Program . getRefArrayValue1double ( localSumArray , RX10_TEMP71 ) ; final double localSumCurr = RX10_TEMP79 ; globalSum = globalSum + localSumCurr ; }
 return globalSum ; }
 public static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; }
 public static int constantSearchRegion3 ( final Region3 r , final Point3 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = r . dim1 ; final int low1 = r . low1 ; final int high1 = low1 + dim1 ; int pt1 = target . f1 ; final boolean lbound1 = pt1 < low1 ; final boolean hbound1 = pt1 >= high1 ; final int dim2 = r . dim2 ; final int low2 = r . low2 ; final int high2 = low2 + dim2 ; int pt2 = target . f2 ; final boolean lbound2 = pt2 < low2 ; final boolean hbound2 = pt2 >= high2 ; final int dim3 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion || hbound1 ; outRegion = outRegion || lbound2 ; outRegion = outRegion || hbound2 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride3 = 1 ; final int stride2 = stride3 * dim3 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; pt1 = pt1 - low1 ; final int offset1 = stride1 * pt1 ; pt2 = pt2 - low2 ; final int offset2 = stride2 * pt2 ; int found = 0 ; found = found + offset0 ; found = found + offset1 ; found = found + offset2 ; return found ; }
 public static int constantSearchRegion2 ( final Region2 r , final Point2 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = r . dim1 ; final int low1 = r . low1 ; final int high1 = low1 + dim1 ; int pt1 = target . f1 ; final boolean lbound1 = pt1 < low1 ; final boolean hbound1 = pt1 >= high1 ; final int dim2 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion || hbound1 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride2 = 1 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; pt1 = pt1 - low1 ; final int offset1 = stride1 * pt1 ; int found = 0 ; found = found + offset0 ; found = found + offset1 ; return found ; }
 public static int binarySearchRegion2 ( final Region2 r , final Point2 target ) { final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point2 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint2 ( target , temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; }
 else { if ( lt ) { end = mid - one ; }
 else { start = mid + one ; }
 }
 notDone = start <= end ; }
 return result ; }
 public static int binarySearchRegion1 ( final Region1 r , final Point1 target ) { final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point1 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint1 ( target , temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; }
 else { if ( lt ) { end = mid - one ; }
 else { start = mid + one ; }
 }
 notDone = start <= end ; }
 return result ; }
 public static LevelData getRefArrayValue1LevelData ( final LevelDataRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final LevelDataStub value [ : rank==1 ] contents = array . contents ; final LevelDataStub indexStub = contents [ placeIndex ] ; final LevelData [ : rank==1 ] localArray = indexStub . localArray ; final LevelData returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static String toStringPoint3 ( final Point3 p ) { String str = "" ; final int f0 = p . f0 ; final int f1 = p . f1 ; final int f2 = p . f2 ; String lSq = "[" ; String comma = "," ; String rSq = "]" ; str = str + lSq ; str = str + f0 ; str = str + comma ; str = str + f1 ; str = str + comma ; str = str + f2 ; str = str + rSq ; return str ; }
 public static void setRefArrayValue1double ( final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static int binarySearchRegion3 ( final Region3 r , final Point3 target ) { final Point3 value [ : rank==1 ] pointArray = ( Point3 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point3 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint3 ( target , temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; }
 else { if ( lt ) { end = mid - one ; }
 else { start = mid + one ; }
 }
 notDone = start <= end ; }
 return result ; }
 public static void setRefArrayValue2Region3 ( final Region3RefArray2 array , final int index , final Region3 val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Region3Stub value [ : rank==1 ] contents = array . contents ; final Region3Stub indexStub = contents [ placeIndex ] ; final Region3 [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 getUniqueDist ( ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int rSize = maxPlaces - one ; final region ( : rank==1 ) placeRegion = [ 0 : rSize ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ placeRegion ] ( point ( : rank==1 ) p ) { final int i = p [0] ; final place pl1 = place.places ( i ) ; return pl1 ; }
 ) ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final Region1 reg = new Region1 ( pointArray , maxPlaces , zero , maxPlaces ) ; final Dist pointDist1 = new Dist ( vPlaceArray , maxPlaces ) ; final Dist1 retDist = new Dist1 ( reg , pointDist1 ) ; return retDist ; }
 public static place getPlaceFromDist3 ( final Dist3 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static place getPlaceFromDist1 ( final Dist1 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static void setRefArrayValue3double ( final doubleRefArray3 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist3 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static void setRefArrayValue1Region3 ( final Region3RefArray1 array , final int index , final Region3 val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Region3Stub value [ : rank==1 ] contents = array . contents ; final Region3Stub indexStub = contents [ placeIndex ] ; final Region3 [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Region3 getRefArrayValue2Region3 ( final Region3RefArray2 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Region3Stub value [ : rank==1 ] contents = array . contents ; final Region3Stub indexStub = contents [ placeIndex ] ; final Region3 [ : rank==1 ] localArray = indexStub . localArray ; final Region3 returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static place getPlaceFromDist2 ( final Dist2 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static int regionHigh ( final Region1 r ) { final boolean regType = r . regType ; if ( regType ) { final int hgh = Program . regionHighRegular ( r ) ; return hgh ; }
 final int hgh = Program . regionHighArbitrary ( r ) ; return hgh ; }
 public static int regionHighRegular ( final Region1 r ) { final int one = 1 ; final int index = r . dim0 ; final int offset = r . low0 ; final int hgh = index - one ; final int hghOff = hgh + offset ; return hghOff ; }
 public static int regionHighArbitrary ( final Region1 r ) { final int one = 1 ; final Point1 value [ : rank==1 ] array = r . pointArray ; int index = r . regSize ; index = index - one ; final Point1 highPoint = array [ index ] ; final int hgh = highPoint . f0 ; return hgh ; }
 public static int comparePoint1 ( final Point1 pt1 , final Point1 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static int comparePoint2 ( final Point2 pt1 , final Point2 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 point1 = pt1 . f1 ; point2 = pt2 . f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static Point2 regionOrdinalPoint2 ( final Region2 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point2 pt = Program . regionOrdinalPointRegular2 ( reg , ordl ) ; return pt ; }
 final Point2 pt = Program . regionOrdinalPointArbitrary2 ( reg , ordl ) ; return pt ; }
 public static Point2 regionOrdinalPointRegular2 ( final Region2 reg , final int ordl ) { final int stride2 = 1 ; final int dim2 = reg . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg . low1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f2 = ordl / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 pt = new Point2 ( f1 , f2 ) ; return pt ; }
 public static Point2 regionOrdinalPointArbitrary2 ( final Region2 reg , final int ordl ) { final Point2 value [ : rank==1 ] pointArray = reg . pointArray ; final Point2 pt = pointArray [ ordl ] ; return pt ; }
 public static Point1 regionOrdinalPoint1 ( final Region1 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point1 pt = Program . regionOrdinalPointRegular1 ( reg , ordl ) ; return pt ; }
 final Point1 pt = Program . regionOrdinalPointArbitrary1 ( reg , ordl ) ; return pt ; }
 public static Point1 regionOrdinalPointRegular1 ( final Region1 reg , final int ordl ) { final int stride1 = 1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 pt = new Point1 ( f1 ) ; return pt ; }
 public static Point1 regionOrdinalPointArbitrary1 ( final Region1 reg , final int ordl ) { final Point1 value [ : rank==1 ] pointArray = reg . pointArray ; final Point1 pt = pointArray [ ordl ] ; return pt ; }
 public static Region1 getRank3 ( final Region3 r , final int dim ) { final int zero = 0 ; final int regRank = 3 ; final boolean cond1 = dim >= regRank ; final boolean cond2 = dim < zero ; final boolean invalidRank = cond1 || cond2 ; if ( invalidRank ) { final String errorMsgHeader = "Invalid dimension for rank projection. Got " ; final String errorMsgTrailer = ", expected value between 0 and 3" ; String errorMsg = errorMsgHeader + dim ; errorMsg = errorMsg + errorMsgTrailer ; throw new RuntimeException ( errorMsg ) ; }
 final boolean regType = r . regType ; if ( regType ) { final Region1 regularRank = Program . getRankRegular3 ( r , dim ) ; return regularRank ; }
 final Region1 arbitraryRank = Program . getRankArbitrary3 ( r , dim ) ; return arbitraryRank ; }
 public static Region1 getRankArbitrary3 ( final Region3 r , final int dim ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; final int minusOne = zero - one ; final int proj0 = 0 ; final int proj1 = 1 ; final int proj2 = 2 ; Point3 value [ : rank==1 ] regArr = r . pointArray ; final int regSize = r . regSize ; final int regSizeMinusOne = regSize - one ; final region ( : rank==1 ) regArrRegion = [ 0 : regSizeMinusOne ] ; final dist ( : rank==1 ) distArrRegion = [ 0 : regSizeMinusOne ] -> here ; int maxIndex = minusOne ; int minIndex = zero ; boolean isFirstMinIndex = true ; for ( point ( : rank==1 ) p : regArrRegion ) { final int idx = p [0] ; switch ( dim ) { case proj0 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f0 ; final boolean isMax = crd >= maxIndex ; if ( isMax ) { maxIndex = crd ; }
 final boolean lt = crd <= minIndex ; final boolean isMin = lt || isFirstMinIndex ; if ( isMin ) { isFirstMinIndex = false ; minIndex = crd ; }
 break ; }
 case proj1 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f1 ; final boolean isMax = crd >= maxIndex ; if ( isMax ) { maxIndex = crd ; }
 final boolean lt = crd <= minIndex ; final boolean isMin = lt || isFirstMinIndex ; if ( isMin ) { isFirstMinIndex = false ; minIndex = crd ; }
 break ; }
 case proj2 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f2 ; final boolean isMax = crd >= maxIndex ; if ( isMax ) { maxIndex = crd ; }
 final boolean lt = crd <= minIndex ; final boolean isMin = lt || isFirstMinIndex ; if ( isMin ) { isFirstMinIndex = false ; minIndex = crd ; }
 break ; }
 } }
 final int regIndexSizeMinusOne = maxIndex - minIndex ; final int regIndexSize = regIndexSizeMinusOne + one ; final region ( : rank==1 ) regIndexRegion = [ 0 : regIndexSizeMinusOne ] ; final dist ( : rank==1 ) regIndexDist = [ 0 : regIndexSizeMinusOne ] -> here ; final int [ : rank==1 ] indexArr = ( int [ : rank==1 ] ) ( new int [ regIndexDist ] ( point ( : rank==1 ) p ) { return zero ; }
 ) ; for ( point ( : rank==1 ) p : regArrRegion ) { final int idx = p [0] ; switch ( dim ) { case proj0 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f0 ; final int newRegIndex = crd - minIndex ; indexArr [ newRegIndex ] = ( one ) ; break ; }
 case proj1 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f1 ; final int newRegIndex = crd - minIndex ; indexArr [ newRegIndex ] = ( one ) ; break ; }
 case proj2 : { final Point3 tempPt = regArr [ idx ] ; final int crd = tempPt . f2 ; final int newRegIndex = crd - minIndex ; indexArr [ newRegIndex ] = ( one ) ; break ; }
 } }
 int newRegSize = 0 ; for ( point ( : rank==1 ) p : regIndexRegion ) { final int hit = indexArr [ p ] ; newRegSize = newRegSize + hit ; }
 final boolean isRegular = newRegSize == regIndexSize ; if ( isRegular ) { final region ( : rank==1 ) regRegularRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regRegularRegion ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , regIndexSize , minIndex , regIndexSize ) ; return retRegRegular ; }
 final int newRegSizeMinusOne = newRegSize - one ; final region ( : rank==1 ) newRegRegion = [ 0 : newRegSizeMinusOne ] ; final dist ( : rank==1 ) newRegDist = [ 0 : newRegSizeMinusOne ] -> here ; final Point1 [ : rank==1 ] indexPointArr = ( Point1 [ : rank==1 ] ) ( new Point1 [ newRegDist ] ) ; int newArrIndex = 0 ; for ( point ( : rank==1 ) p : regIndexRegion ) { final int indx = indexArr [ p ] ; final boolean isOne = indx == one ; if ( isOne ) { final int idx = p [0] ; final int pointValue = idx + minIndex ; final Point1 tempPoint = new Point1 ( pointValue ) ; indexPointArr [ newArrIndex ] = ( tempPoint ) ; newArrIndex = newArrIndex + one ; }
 }
 final Point1 value [ : rank==1 ] indexPointValueArr = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ newRegRegion ] ( point ( : rank==1 ) p ) { final Point1 pt = indexPointArr [ p ] ; return pt ; }
 ) ; final Region1 retRegArbitrary = new Region1 ( indexPointValueArr , regIndexSize ) ; return retRegArbitrary ; }
 public static Region1 getRankRegular3 ( final Region3 r , final int dim ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final int proj0 = 0 ; final int proj1 = 1 ; final int proj2 = 2 ; int low0 = 0 ; int dim0 = 0 ; switch ( dim ) { case proj0 : { low0 = r . low0 ; dim0 = r . dim0 ; break ; }
 case proj1 : { low0 = r . low1 ; dim0 = r . dim1 ; break ; }
 case proj2 : { low0 = r . low2 ; dim0 = r . dim2 ; break ; }
 } final Region1 retRegRegular = new Region1 ( pointArray , dim0 , low0 , dim0 ) ; return retRegRegular ; }
 public static int comparePoint3 ( final Point3 pt1 , final Point3 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 point1 = pt1 . f1 ; point2 = pt2 . f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 point1 = pt1 . f2 ; point2 = pt2 . f2 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static double getRefArrayValue3double ( final doubleRefArray3 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist3 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static double getRefArrayValue1double ( final doubleRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int regionLow ( final Region1 r ) { final boolean regType = r . regType ; if ( regType ) { final int lw = Program . regionLowRegular ( r ) ; return lw ; }
 final int lw = Program . regionLowArbitrary ( r ) ; return lw ; }
 public static int regionLowRegular ( final Region1 r ) { final int lw = r . low0 ; return lw ; }
 public static int regionLowArbitrary ( final Region1 r ) { final int index = 0 ; final Point1 value [ : rank==1 ] array = r . pointArray ; final Point1 lowPoint = array [ index ] ; final int lw = lowPoint . f0 ; return lw ; }
 public static Dist1 restrictDist1 ( final Dist1 dn , final place p ) { final Region1 r = dn . dReg ; final boolean regType = r . regType ; if ( regType ) { final Dist1 regDist = Program . restrictDistRegular1 ( dn , p ) ; return regDist ; }
 final Dist1 arbDist = Program . restrictDistArbitrary1 ( dn , p ) ; return arbDist ; }
 public static Dist1 restrictDistRegular1 ( final Dist1 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region1 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final int stride1 = 1 ; final int dim1 = dReg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = dReg . low0 ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; int f1 = idx / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 dpt = new Point1 ( f1 ) ; return dpt ; }
 ) ; final Region1 dpReg = new Region1 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist1 dpDistn = new Dist1 ( dpReg , dpDist ) ; return dpDistn ; }
 public static Dist1 restrictDistArbitrary1 ( final Dist1 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region1 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final Point1 value [ : rank==1 ] dArray = ( Point1 value [ : rank==1 ] ) ( dReg . pointArray ) ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; final Point1 dpt = dArray [ idx ] ; return dpt ; }
 ) ; final Region1 dpReg = new Region1 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist1 dpDistn = new Dist1 ( dpReg , dpDist ) ; return dpDistn ; }
 public static Wrapper getRefArrayValue1Wrapper ( final WrapperRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final WrapperStub value [ : rank==1 ] contents = array . contents ; final WrapperStub indexStub = contents [ placeIndex ] ; final Wrapper [ : rank==1 ] localArray = indexStub . localArray ; final Wrapper returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static Point3 regionOrdinalPoint3 ( final Region3 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point3 pt = Program . regionOrdinalPointRegular3 ( reg , ordl ) ; return pt ; }
 final Point3 pt = Program . regionOrdinalPointArbitrary3 ( reg , ordl ) ; return pt ; }
 public static Point3 regionOrdinalPointRegular3 ( final Region3 reg , final int ordl ) { final int stride3 = 1 ; final int dim3 = reg . dim2 ; final int stride2 = stride3 * dim3 ; final int regLow3 = reg . low2 ; final int dim2 = reg . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg . low1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f3 = ordl / stride3 ; f3 = f3 % dim3 ; f3 = f3 + regLow3 ; int f2 = ordl / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point3 pt = new Point3 ( f1 , f2 , f3 ) ; return pt ; }
 public static Point3 regionOrdinalPointArbitrary3 ( final Region3 reg , final int ordl ) { final Point3 value [ : rank==1 ] pointArray = reg . pointArray ; final Point3 pt = pointArray [ ordl ] ; return pt ; }
 public static Dist3 getRefArrayValue1Dist3 ( final Dist3RefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Dist3Stub value [ : rank==1 ] contents = array . contents ; final Dist3Stub indexStub = contents [ placeIndex ] ; final Dist3 [ : rank==1 ] localArray = indexStub . localArray ; final Dist3 returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static boolean regionContainsPoint3 ( final Region3 r , final Point3 target ) { final int temp = Program . searchPointInRegion3 ( r , target ) ; final int zero = 0 ; final boolean containsPt = temp >= zero ; return containsPt ; }
 public static void getCyclic ( final place [ : rank==1 ] placeArray , final int arraySize , final place initPlace , final int blockSize ) { final int zero = 0 ; final int one = 1 ; int N = arraySize ; int chunk = blockSize ; final boolean ifCond = blockSize > N ; if ( ifCond ) { chunk = N ; }
 int index = 0 ; int dSize = index + chunk ; dSize = dSize - one ; final region ( : rank==1 ) pointReg = [ 0 : dSize ] ; for ( point ( : rank==1 ) p : pointReg ) { placeArray [ p ] = ( initPlace ) ; }
 index = index + chunk ; N = N - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = N != zero ; while ( whileCond ) { final boolean tailCond = chunk > N ; if ( tailCond ) { dSize = index + N ; dSize = dSize - one ; final int ub = N - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 N = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; N = N - chunk ; }
 pl = pl . next ( ) ; whileCond = N != zero ; }
 }
 public static String toStringRegion3 ( final Region3 r ) { String str = "" ; final int dim = r . regSize ; final int one = 1 ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) rReg = [ 0 : dimMinusOne ] ; final boolean regType = r . regType ; if ( regType ) { final int stride3 = 1 ; final int dim3 = r . dim2 ; final int stride2 = stride3 * dim3 ; final int regLow3 = r . low2 ; final int dim2 = r . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = r . low1 ; final int dim1 = r . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = r . low0 ; for ( point ( : rank==1 ) pt1 : rReg ) { final int ordl = pt1 [0] ; int f3 = ordl / stride3 ; f3 = f3 % dim3 ; f3 = f3 + regLow3 ; int f2 = ordl / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; Point3 pt = new Point3 ( f1 , f2 , f3 ) ; String ptStr = Program . toStringPoint3 ( pt ) ; String lBrace = "{" ; String rBrace = "}" ; String endLine = "\n" ; String colon = ":" ; str = str + lBrace ; str = str + pt1 ; str = str + colon ; str = str + ptStr ; str = str + rBrace ; str = str + endLine ; }
 return str ; }
 else { final Point3 value [ : rank==1 ] regArray = ( Point3 value [ : rank==1 ] ) ( r . pointArray ) ; for ( point ( : rank==1 ) pt1 : rReg ) { Point3 pt = regArray [ pt1 ] ; String ptStr = Program . toStringPoint3 ( pt ) ; String lBrace = "{" ; String rBrace = "}" ; String endLine = "\n" ; String colon = ":" ; str = str + lBrace ; str = str + pt1 ; str = str + colon ; str = str + ptStr ; str = str + rBrace ; str = str + endLine ; }
 return str ; }
 }
 public static int getDistLocalCount2 ( final Dist2 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static Region3 getRefArrayValue1Region3 ( final Region3RefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Region3Stub value [ : rank==1 ] contents = array . contents ; final Region3Stub indexStub = contents [ placeIndex ] ; final Region3 [ : rank==1 ] localArray = indexStub . localArray ; final Region3 returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int getDistLocalCount3 ( final Dist3 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static void setRefArrayValue1Dist3 ( final Dist3RefArray1 array , final int index , final Dist3 val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Dist3Stub value [ : rank==1 ] contents = array . contents ; final Dist3Stub indexStub = contents [ placeIndex ] ; final Dist3 [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static int getDistLocalCount1 ( final Dist1 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static int searchPointInRegion2 ( final Region2 r , final Point2 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion2 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion2 ( r , target ) ; return binarySearch ; }
 public static int searchPointInRegion1 ( final Region1 r , final Point1 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion1 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion1 ( r , target ) ; return binarySearch ; }
 public static void setRefArrayValue1Wrapper ( final WrapperRefArray1 array , final int index , final Wrapper val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final WrapperStub value [ : rank==1 ] contents = array . contents ; final WrapperStub indexStub = contents [ placeIndex ] ; final Wrapper [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static int searchPointInRegion3 ( final Region3 r , final Point3 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion3 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion3 ( r , target ) ; return binarySearch ; }
 public static Dist2 getPlaceDist2 ( final Region2 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist2 retDist = new Dist2 ( r , pointDist ) ; return retDist ; }
 public static Region3 unionRegion3 ( final Region3 reg1 , final Region3 reg2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int index1 = 0 ; int index2 = 0 ; int index = 0 ; final boolean regType1 = reg1 . regType ; final boolean regType2 = reg2 . regType ; Point3 value [ : rank==1 ] tempArr1 = reg1 . pointArray ; Point3 value [ : rank==1 ] tempArr2 = reg2 . pointArray ; if ( regType1 ) { final int stride3 = 1 ; final int dim3 = reg1 . dim2 ; final int stride2 = stride3 * dim3 ; final int regLow3 = reg1 . low2 ; final int dim2 = reg1 . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg1 . low1 ; final int dim1 = reg1 . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg1 . low0 ; final int regSize1 = reg1 . regSize ; final int sizeMinusOne = regSize1 - one ; final region ( : rank==1 ) regArr = [ 0 : sizeMinusOne ] ; tempArr1 = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f3 = p / stride3 ; f3 = f3 % dim3 ; f3 = f3 + regLow3 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point3 retPoint = new Point3 ( f1 , f2 , f3 ) ; return retPoint ; }
 ) ; }
 if ( regType2 ) { final int stride3 = 1 ; final int dim3 = reg2 . dim2 ; final int stride2 = stride3 * dim3 ; final int regLow3 = reg2 . low2 ; final int dim2 = reg2 . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg2 . low1 ; final int dim1 = reg2 . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg2 . low0 ; final int regSize2 = reg2 . regSize ; final int sizeMinusOne = regSize2 - one ; final region ( : rank==1 ) regArr = [ 0 : sizeMinusOne ] ; tempArr2 = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f3 = p / stride3 ; f3 = f3 % dim3 ; f3 = f3 + regLow3 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point3 retPoint = new Point3 ( f1 , f2 , f3 ) ; return retPoint ; }
 ) ; }
 final Point3 value [ : rank==1 ] arr1 = tempArr1 ; final Point3 value [ : rank==1 ] arr2 = tempArr2 ; final int size1 = reg1 . regSize ; final int size2 = reg2 . regSize ; boolean cond1 = index1 < size1 ; boolean cond2 = index2 < size2 ; boolean cond = cond1 && cond2 ; while ( cond ) { final Point3 p1 = arr1 [ index1 ] ; final Point3 p2 = arr2 [ index2 ] ; final int pointCompare = Program . comparePoint3 ( p1 , p2 ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; final boolean gt = pointCompare == two ; if ( eq ) { index1 = index1 + one ; index2 = index2 + one ; }
 if ( lt ) { index1 = index1 + one ; }
 if ( gt ) { index2 = index2 + one ; }
 index = index + one ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; }
 cond1 = index1 < size1 ; while ( cond1 ) { index1 = index1 + one ; index = index + one ; cond1 = index1 < size1 ; }
 cond2 = index2 < size2 ; while ( cond2 ) { index2 = index2 + one ; index = index + one ; cond2 = index2 < size2 ; }
 final int rSize = index ; final int sizeMinusOne = rSize - one ; final region ( : rank==1 ) tempReg = [ 0 : sizeMinusOne ] ; final dist ( : rank==1 ) tempDist = [ 0 : sizeMinusOne ] -> here ; final Point3 [ : rank==1 ] tempArr = new Point3 [ tempDist ] ; index1 = 0 ; index2 = 0 ; index = 0 ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; while ( cond ) { final Point3 p1 = arr1 [ index1 ] ; final Point3 p2 = arr2 [ index2 ] ; final int pointCompare = Program . comparePoint3 ( p1 , p2 ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; final boolean gt = pointCompare == two ; if ( eq ) { tempArr [ index ] = ( p1 ) ; index1 = index1 + one ; index2 = index2 + one ; }
 if ( lt ) { tempArr [ index ] = ( p1 ) ; index1 = index1 + one ; }
 if ( gt ) { tempArr [ index ] = ( p2 ) ; index2 = index2 + one ; }
 index = index + one ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; }
 cond1 = index1 < size1 ; while ( cond1 ) { final Point3 tempArrPt = arr1 [ index1 ] ; tempArr [ index ] = ( tempArrPt ) ; index1 = index1 + one ; index = index + one ; cond1 = index1 < size1 ; }
 cond2 = index2 < size2 ; while ( cond2 ) { final Point3 tempArrPt = arr2 [ index2 ] ; tempArr [ index ] = ( tempArrPt ) ; index2 = index2 + one ; index = index + one ; cond2 = index2 < size2 ; }
 final Point3 value [ : rank==1 ] arr = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ tempReg ] ( point ( : rank==1 ) pt ) { final Point3 retPoint = tempArr [ pt ] ; return retPoint ; }
 ) ; final Region3 unionReg = new Region3 ( arr , rSize ) ; return unionReg ; }
 public static Dist1 getPlaceDist1 ( final Region1 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist ) ; return retDist ; }
 public static Dist3 getPlaceDist3 ( final Region3 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist3 retDist = new Dist3 ( r , pointDist ) ; return retDist ; }
 public static int value [ : rank==1 ] initDist ( final int [ : rank==1 ] tempArr , final region ( : rank==1 ) tempReg ) { final int value [ : rank==1 ] vTemp = ( int value [ : rank==1 ] ) ( new int value [ tempReg ] ( point ( : rank==1 ) p ) { final int tempInt = tempArr [ p ] ; return tempInt ; }
 ) ; return vTemp ; }
 public static Region2 createNewRegion2RR ( final int v1_0 , final int v1_1 , final int v2_0 , final int v2_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; final boolean tempBool2 = true ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int l2 = v2_1 - v2_0 ; final int dim2 = l2 + one ; final int stride2 = 1 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegEmpty = new Region2 ( ptArray , stride0 , zero , zero , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegRegular = new Region2 ( ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + v2_0 ; final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; }
 ) ; final Region2 retReg = new Region2 ( ptArray , stride0 ) ; return retReg ; }
 }
 public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint = new Point1 ( f1 ) ; return retPoint ; }
 ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; }
 }
 public static Region3 createNewRegion3RRR ( final int v1_0 , final int v1_1 , final int v2_0 , final int v2_1 , final int v3_0 , final int v3_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; final boolean tempBool2 = true ; final boolean tempBool3 = true ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; regType = regType && tempBool3 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int l2 = v2_1 - v2_0 ; final int dim2 = l2 + one ; final int l3 = v3_1 - v3_0 ; final int dim3 = l3 + one ; final int stride3 = 1 ; final int stride2 = stride3 * dim3 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) p ) { final Point3 pt = new Point3 ( zero , zero , zero ) ; return pt ; }
 ) ; final Region3 retRegEmpty = new Region3 ( ptArray , stride0 , zero , zero , zero , zero , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) p ) { final Point3 pt = new Point3 ( zero , zero , zero ) ; return pt ; }
 ) ; final Region3 retRegRegular = new Region3 ( ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 , v3_0 , dim3 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + v2_0 ; int f3 = p / stride3 ; f3 = f3 % dim3 ; f3 = f3 + v3_0 ; final Point3 retPoint = new Point3 ( f1 , f2 , f3 ) ; return retPoint ; }
 ) ; final Region3 retReg = new Region3 ( ptArray , stride0 ) ; return retReg ; }
 }

 public static void thread1(final T1 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData RES = utmpz.RES;
 { final doubleRefArray3 res = Program . LevelData_getArray ( RES , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; Region3 R = Program . LevelData_getInnerRegion ( RES , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d1 = ( 0 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final Dist3 RX10_TEMP28 = res . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( res , RX10_TEMP30 ) ; final double X10_TEMP29 = ( RX10_TEMP38 ) ; final double X10_TEMP23 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP24 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP25 = ( X10_TEMP23 + X10_TEMP24 ) ; final double X10_TEMP26 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP28 = ( X10_TEMP25 + X10_TEMP26 ) ; final double X10_TEMP31 = ( X10_TEMP29 - X10_TEMP28 ) ; final double X10_TEMP32 = ( X10_TEMP31 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP32 ) ; }
 }
 }
 public static void thread2(final T2 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg1 = Program . LevelData_getArray ( a_arg1 , i ) ; final doubleRefArray3 arg2 = Program . LevelData_getArray ( a_arg2 , i ) ; Region3 R = Program . LevelData_getInnerRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg2 . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg2" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg2 , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg2 ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg2 ) ) ; final Dist3 RX10_TEMP28 = arg1 . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array arg1" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( arg1 , RX10_TEMP30 ) ; final double X10_TEMP27 = ( RX10_TEMP38 ) ; final double X10_TEMP28 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP29 = ( X10_TEMP27 - X10_TEMP28 ) ; final double X10_TEMP30 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP31 = ( X10_TEMP29 - X10_TEMP30 ) ; final double X10_TEMP32 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP34 = ( X10_TEMP31 - X10_TEMP32 ) ; final double X10_TEMP35 = ( X10_TEMP34 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP35 ) ; }
 }
 }
 public static void thread3(final T3 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg1 = Program . LevelData_getArray ( a_arg1 , i ) ; final doubleRefArray3 arg2 = Program . LevelData_getArray ( a_arg2 , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg2 . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg2" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg2 , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg2 ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg2 ) ) ; final Dist3 RX10_TEMP28 = arg1 . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array arg1" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( arg1 , RX10_TEMP30 ) ; final double X10_TEMP24 = ( RX10_TEMP38 ) ; final double X10_TEMP25 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP26 = ( X10_TEMP24 - X10_TEMP25 ) ; final double X10_TEMP27 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP28 = ( X10_TEMP26 - X10_TEMP27 ) ; final double X10_TEMP29 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP31 = ( X10_TEMP28 - X10_TEMP29 ) ; final double X10_TEMP32 = ( X10_TEMP31 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP32 ) ; }
 }
 }
 public static void thread4(final T4 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg1 = Program . LevelData_getArray ( a_arg1 , i ) ; final doubleRefArray3 arg2 = Program . LevelData_getArray ( a_arg2 , i ) ; final Region3 X10_TEMP45 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP46 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP47 = 0 ; final int X10_TEMP48 = 1 ; final int X10_TEMP49 = X10_TEMP47 - X10_TEMP48 ; final place X10_TEMP50 = here ; Region3 X10_TEMP51 = Program . createNewRegion3RRR ( X10_TEMP47 , X10_TEMP49 , X10_TEMP47 , X10_TEMP49 , X10_TEMP47 , X10_TEMP49 ) ; final int RX10_TEMP64 = 1 ; int RX10_TEMP62 = X10_TEMP45 . regSize ; RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64 ; final region ( : rank==1 ) RX10_TEMP63 = [ 0 : RX10_TEMP62 ] ; for ( point ( : rank==1 ) RX10_TEMP61 : RX10_TEMP63 ) { final int RX10_TEMP65 = RX10_TEMP61 [0] ; final Point3 X10_TEMP52 = Program . regionOrdinalPoint3 ( X10_TEMP45 , RX10_TEMP65 ) ; final int X10_TEMP53 = X10_TEMP52 . f0 ; final int X10_TEMP54 = X10_TEMP52 . f1 ; final int X10_TEMP55 = X10_TEMP52 . f2 ; final boolean RX10_TEMP66 = Program . regionContainsPoint3 ( X10_TEMP46 , X10_TEMP52 ) ; boolean X10_TEMP56 = RX10_TEMP66 ; X10_TEMP56 = ! X10_TEMP56 ; if ( X10_TEMP56 ) { final Region3 X10_TEMP57 = Program . createNewRegion3RRR ( X10_TEMP53 , X10_TEMP53 , X10_TEMP54 , X10_TEMP54 , X10_TEMP55 , X10_TEMP55 ) ; X10_TEMP51 = Program . unionRegion3 ( X10_TEMP51 , X10_TEMP57 ) ; }
 }
 final Region3 X10_TEMP58 = X10_TEMP51 ; Region3 R = X10_TEMP58 ; final int RX10_TEMP70 = 1 ; int RX10_TEMP68 = R . regSize ; RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70 ; final region ( : rank==1 ) RX10_TEMP69 = [ 0 : RX10_TEMP68 ] ; for ( point ( : rank==1 ) RX10_TEMP67 : RX10_TEMP69 ) { final int RX10_TEMP71 = RX10_TEMP67 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP71 ) ; final Dist3 RX10_TEMP72 = arg2 . distValue ; final Region3 RX10_TEMP73 = RX10_TEMP72 . dReg ; final int RX10_TEMP74 = Program . searchPointInRegion3 ( RX10_TEMP73 , p ) ; final int RX10_TEMP75 = 0 ; final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75 ; if ( RX10_TEMP76 ) { String RX10_TEMP77 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP77 ) ; }
 final place RX10_TEMP78 = Program . getPlaceFromDist3 ( RX10_TEMP72 , RX10_TEMP74 ) ; final place RX10_TEMP80 = here ; final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80 ; if ( RX10_TEMP81 ) { String RX10_TEMP79 = "Bad place access for array arg2" ; throw new RuntimeException ( RX10_TEMP79 ) ; }
 final double RX10_TEMP82 = Program . getRefArrayValue3double ( arg2 , RX10_TEMP74 ) ; double d0 = ( RX10_TEMP82 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg2 ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg2 ) ) ; final Dist3 RX10_TEMP83 = arg1 . distValue ; final Region3 RX10_TEMP84 = RX10_TEMP83 . dReg ; final int RX10_TEMP85 = Program . searchPointInRegion3 ( RX10_TEMP84 , p ) ; final int RX10_TEMP86 = 0 ; final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86 ; if ( RX10_TEMP87 ) { String RX10_TEMP88 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP88 ) ; }
 final place RX10_TEMP89 = Program . getPlaceFromDist3 ( RX10_TEMP83 , RX10_TEMP85 ) ; final place RX10_TEMP91 = here ; final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP90 = "Bad place access for array arg1" ; throw new RuntimeException ( RX10_TEMP90 ) ; }
 final double RX10_TEMP93 = Program . getRefArrayValue3double ( arg1 , RX10_TEMP85 ) ; final double X10_TEMP71 = ( RX10_TEMP93 ) ; final double X10_TEMP72 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP73 = ( X10_TEMP71 - X10_TEMP72 ) ; final double X10_TEMP74 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP75 = ( X10_TEMP73 - X10_TEMP74 ) ; final double X10_TEMP76 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP78 = ( X10_TEMP75 - X10_TEMP76 ) ; final double X10_TEMP79 = ( X10_TEMP78 ) ; final Dist3 RX10_TEMP94 = res . distValue ; final Region3 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion3 ( RX10_TEMP95 , p ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist3 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP96 , X10_TEMP79 ) ; }
 }
 }
 public static void thread5(final T5 utmpz) {final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final Dist1 X10_TEMP4 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP4 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP5 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP5 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP4 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP5 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP4 , RX10_TEMP7 ) ; final place X10_TEMP6 = RX10_TEMP11 ; 
 final T53 utmp53 = new T53(i, a_arg2, a_arg1, a_res);
 async (X10_TEMP6) {Program.thread53(utmp53); }
 }
 finish { Program . LevelData_exchange ( a_arg2 ) ; }
 final Dist1 X10_TEMP36 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP50 = X10_TEMP36 . dReg ; final int RX10_TEMP53 = 1 ; int RX10_TEMP51 = RX10_TEMP50 . regSize ; RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53 ; final region ( : rank==1 ) RX10_TEMP52 = [ 0 : RX10_TEMP51 ] ; for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP52 ) { final int RX10_TEMP54 = RX10_TEMP49 [0] ; final Point1 X10_TEMP37 = Program . regionOrdinalPoint1 ( RX10_TEMP50 , RX10_TEMP54 ) ; final int i = X10_TEMP37 . f0 ; final Region1 RX10_TEMP55 = X10_TEMP36 . dReg ; final int RX10_TEMP56 = Program . searchPointInRegion1 ( RX10_TEMP55 , X10_TEMP37 ) ; final int RX10_TEMP57 = 0 ; final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57 ; if ( RX10_TEMP58 ) { final String RX10_TEMP59 = "Point X10_TEMP37 not found in the distribution X10_TEMP36." ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final place RX10_TEMP60 = Program . getPlaceFromDist1 ( X10_TEMP36 , RX10_TEMP56 ) ; final place X10_TEMP38 = RX10_TEMP60 ; 
 final T54 utmp54 = new T54(i, a_arg2, a_arg1, a_res);
 async (X10_TEMP38) {Program.thread54(utmp54); }
 }
 }
 }
 public static void thread6(final T6 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; Region3 R = Program . LevelData_getInnerRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; final Dist3 RX10_TEMP28 = res . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( res , RX10_TEMP30 ) ; final double X10_TEMP25 = ( RX10_TEMP38 ) ; final double X10_TEMP26 = ( _MGOP_Sac0 * d0 ) ; final double X10_TEMP27 = ( X10_TEMP25 + X10_TEMP26 ) ; final double X10_TEMP28 = ( _MGOP_Sac1 * d1 ) ; final double X10_TEMP29 = ( X10_TEMP27 + X10_TEMP28 ) ; final double X10_TEMP30 = ( _MGOP_Sac2 * d2 ) ; final double X10_TEMP32 = ( X10_TEMP29 + X10_TEMP30 ) ; final double X10_TEMP33 = ( X10_TEMP32 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP33 ) ; }
 }
 }
 public static void thread7(final T7 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; final Dist3 RX10_TEMP28 = res . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( res , RX10_TEMP30 ) ; final double X10_TEMP22 = ( RX10_TEMP38 ) ; final double X10_TEMP23 = ( _MGOP_Sac0 * d0 ) ; final double X10_TEMP24 = ( X10_TEMP22 + X10_TEMP23 ) ; final double X10_TEMP25 = ( _MGOP_Sac1 * d1 ) ; final double X10_TEMP26 = ( X10_TEMP24 + X10_TEMP25 ) ; final double X10_TEMP27 = ( _MGOP_Sac2 * d2 ) ; final double X10_TEMP29 = ( X10_TEMP26 + X10_TEMP27 ) ; final double X10_TEMP30 = ( X10_TEMP29 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP30 ) ; }
 }
 }
 public static void thread8(final T8 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final Region3 X10_TEMP41 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP42 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP43 = 0 ; final int X10_TEMP44 = 1 ; final int X10_TEMP45 = X10_TEMP43 - X10_TEMP44 ; final place X10_TEMP46 = here ; Region3 X10_TEMP47 = Program . createNewRegion3RRR ( X10_TEMP43 , X10_TEMP45 , X10_TEMP43 , X10_TEMP45 , X10_TEMP43 , X10_TEMP45 ) ; final int RX10_TEMP64 = 1 ; int RX10_TEMP62 = X10_TEMP41 . regSize ; RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64 ; final region ( : rank==1 ) RX10_TEMP63 = [ 0 : RX10_TEMP62 ] ; for ( point ( : rank==1 ) RX10_TEMP61 : RX10_TEMP63 ) { final int RX10_TEMP65 = RX10_TEMP61 [0] ; final Point3 X10_TEMP48 = Program . regionOrdinalPoint3 ( X10_TEMP41 , RX10_TEMP65 ) ; final int X10_TEMP49 = X10_TEMP48 . f0 ; final int X10_TEMP50 = X10_TEMP48 . f1 ; final int X10_TEMP51 = X10_TEMP48 . f2 ; final boolean RX10_TEMP66 = Program . regionContainsPoint3 ( X10_TEMP42 , X10_TEMP48 ) ; boolean X10_TEMP52 = RX10_TEMP66 ; X10_TEMP52 = ! X10_TEMP52 ; if ( X10_TEMP52 ) { final Region3 X10_TEMP53 = Program . createNewRegion3RRR ( X10_TEMP49 , X10_TEMP49 , X10_TEMP50 , X10_TEMP50 , X10_TEMP51 , X10_TEMP51 ) ; X10_TEMP47 = Program . unionRegion3 ( X10_TEMP47 , X10_TEMP53 ) ; }
 }
 final Region3 X10_TEMP54 = X10_TEMP47 ; Region3 R = X10_TEMP54 ; final int RX10_TEMP70 = 1 ; int RX10_TEMP68 = R . regSize ; RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70 ; final region ( : rank==1 ) RX10_TEMP69 = [ 0 : RX10_TEMP68 ] ; for ( point ( : rank==1 ) RX10_TEMP67 : RX10_TEMP69 ) { final int RX10_TEMP71 = RX10_TEMP67 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP71 ) ; final Dist3 RX10_TEMP72 = arg . distValue ; final Region3 RX10_TEMP73 = RX10_TEMP72 . dReg ; final int RX10_TEMP74 = Program . searchPointInRegion3 ( RX10_TEMP73 , p ) ; final int RX10_TEMP75 = 0 ; final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75 ; if ( RX10_TEMP76 ) { String RX10_TEMP77 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP77 ) ; }
 final place RX10_TEMP78 = Program . getPlaceFromDist3 ( RX10_TEMP72 , RX10_TEMP74 ) ; final place RX10_TEMP80 = here ; final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80 ; if ( RX10_TEMP81 ) { String RX10_TEMP79 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP79 ) ; }
 final double RX10_TEMP82 = Program . getRefArrayValue3double ( arg , RX10_TEMP74 ) ; double d0 = ( RX10_TEMP82 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; final Dist3 RX10_TEMP83 = res . distValue ; final Region3 RX10_TEMP84 = RX10_TEMP83 . dReg ; final int RX10_TEMP85 = Program . searchPointInRegion3 ( RX10_TEMP84 , p ) ; final int RX10_TEMP86 = 0 ; final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86 ; if ( RX10_TEMP87 ) { String RX10_TEMP88 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP88 ) ; }
 final place RX10_TEMP89 = Program . getPlaceFromDist3 ( RX10_TEMP83 , RX10_TEMP85 ) ; final place RX10_TEMP91 = here ; final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP90 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP90 ) ; }
 final double RX10_TEMP93 = Program . getRefArrayValue3double ( res , RX10_TEMP85 ) ; final double X10_TEMP67 = ( RX10_TEMP93 ) ; final double X10_TEMP68 = ( _MGOP_Sac0 * d0 ) ; final double X10_TEMP69 = ( X10_TEMP67 + X10_TEMP68 ) ; final double X10_TEMP70 = ( _MGOP_Sac1 * d1 ) ; final double X10_TEMP71 = ( X10_TEMP69 + X10_TEMP70 ) ; final double X10_TEMP72 = ( _MGOP_Sac2 * d2 ) ; final double X10_TEMP74 = ( X10_TEMP71 + X10_TEMP72 ) ; final double X10_TEMP75 = ( X10_TEMP74 ) ; final Dist3 RX10_TEMP94 = res . distValue ; final Region3 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion3 ( RX10_TEMP95 , p ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist3 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP96 , X10_TEMP75 ) ; }
 }
 }
 public static void thread9(final T9 utmpz) {final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final Dist1 X10_TEMP4 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP4 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP5 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP5 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP4 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP5 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP4 , RX10_TEMP7 ) ; final place X10_TEMP6 = RX10_TEMP11 ; 
 final T55 utmp55 = new T55(i, a_arg, a_res);
 async (X10_TEMP6) {Program.thread55(utmp55); }
 }
 finish { Program . LevelData_exchange ( a_arg ) ; }
 final Dist1 X10_TEMP34 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP50 = X10_TEMP34 . dReg ; final int RX10_TEMP53 = 1 ; int RX10_TEMP51 = RX10_TEMP50 . regSize ; RX10_TEMP51 = RX10_TEMP51 - RX10_TEMP53 ; final region ( : rank==1 ) RX10_TEMP52 = [ 0 : RX10_TEMP51 ] ; for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP52 ) { final int RX10_TEMP54 = RX10_TEMP49 [0] ; final Point1 X10_TEMP35 = Program . regionOrdinalPoint1 ( RX10_TEMP50 , RX10_TEMP54 ) ; final int i = X10_TEMP35 . f0 ; final Region1 RX10_TEMP55 = X10_TEMP34 . dReg ; final int RX10_TEMP56 = Program . searchPointInRegion1 ( RX10_TEMP55 , X10_TEMP35 ) ; final int RX10_TEMP57 = 0 ; final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57 ; if ( RX10_TEMP58 ) { final String RX10_TEMP59 = "Point X10_TEMP35 not found in the distribution X10_TEMP34." ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final place RX10_TEMP60 = Program . getPlaceFromDist1 ( X10_TEMP34 , RX10_TEMP56 ) ; final place X10_TEMP36 = RX10_TEMP60 ; 
 final T56 utmp56 = new T56(i, a_arg, a_res);
 async (X10_TEMP36) {Program.thread56(utmp56); }
 }
 }
 }
 public static void thread10(final T10 utmpz) {final  int i = utmpz.i;
final  doubleRefArray3 res = utmpz.res;
final  MGOP X10_TEMP0 = utmpz.X10_TEMP0;
 { final LevelData X10_TEMP14 = ( X10_TEMP0 . m_tempLD ) ; doubleRefArray3 temp = Program . LevelData_getArray ( X10_TEMP14 , i ) ; final LevelData X10_TEMP18 = ( X10_TEMP0 . m_tempLD ) ; final Region3 X10_TEMP20 = Program . LevelData_getInnerRegion ( X10_TEMP18 , i ) ; Program . Util_arraycopy3 ( res , X10_TEMP20 , temp ) ; }
 }
 public static void thread11(final T11 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getInnerRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final int X10_TEMP15 = ( 2 ) ; int RX10_TEMP17 = pp . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP15 ; int RX10_TEMP18 = pp . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP15 ; int RX10_TEMP19 = pp . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP15 ; final Point3 X10_TEMP19 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP20 = ( 1 ) ; int X10_TEMP21 = ( 1 ) ; int X10_TEMP22 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP19 . f0 ; int RX10_TEMP21 = X10_TEMP19 . f1 ; int RX10_TEMP22 = X10_TEMP19 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP20 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP21 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP22 ; Point3 p = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final Dist3 RX10_TEMP23 = arg . distValue ; final Region3 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion3 ( RX10_TEMP24 , p ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist3 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final double RX10_TEMP33 = Program . getRefArrayValue3double ( arg , RX10_TEMP25 ) ; double d0 = ( RX10_TEMP33 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final double X10_TEMP36 = ( _MGOP_Pc0 * d0 ) ; final double X10_TEMP37 = ( _MGOP_Pc1 * d1 ) ; final double X10_TEMP38 = ( X10_TEMP36 + X10_TEMP37 ) ; final double X10_TEMP39 = ( _MGOP_Pc2 * d2 ) ; final double X10_TEMP40 = ( X10_TEMP38 + X10_TEMP39 ) ; final double X10_TEMP41 = ( _MGOP_Pc3 * d3 ) ; final double X10_TEMP43 = ( X10_TEMP40 + X10_TEMP41 ) ; final double X10_TEMP44 = ( X10_TEMP43 ) ; final Dist3 RX10_TEMP34 = res . distValue ; final Region3 RX10_TEMP35 = RX10_TEMP34 . dReg ; final int RX10_TEMP36 = Program . searchPointInRegion3 ( RX10_TEMP35 , pp ) ; final int RX10_TEMP37 = 0 ; final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP39 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 final place RX10_TEMP40 = Program . getPlaceFromDist3 ( RX10_TEMP34 , RX10_TEMP36 ) ; final place RX10_TEMP42 = here ; final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP41 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP36 , X10_TEMP44 ) ; }
 }
 }
 public static void thread12(final T12 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final int X10_TEMP12 = ( 2 ) ; int RX10_TEMP17 = pp . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP12 ; int RX10_TEMP18 = pp . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP12 ; int RX10_TEMP19 = pp . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP12 ; final Point3 X10_TEMP16 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP17 = ( 1 ) ; int X10_TEMP18 = ( 1 ) ; int X10_TEMP19 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP16 . f0 ; int RX10_TEMP21 = X10_TEMP16 . f1 ; int RX10_TEMP22 = X10_TEMP16 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP17 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP18 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP19 ; Point3 p = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final Dist3 RX10_TEMP23 = arg . distValue ; final Region3 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion3 ( RX10_TEMP24 , p ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist3 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final double RX10_TEMP33 = Program . getRefArrayValue3double ( arg , RX10_TEMP25 ) ; double d0 = ( RX10_TEMP33 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final double X10_TEMP33 = ( _MGOP_Pc0 * d0 ) ; final double X10_TEMP34 = ( _MGOP_Pc1 * d1 ) ; final double X10_TEMP35 = ( X10_TEMP33 + X10_TEMP34 ) ; final double X10_TEMP36 = ( _MGOP_Pc2 * d2 ) ; final double X10_TEMP37 = ( X10_TEMP35 + X10_TEMP36 ) ; final double X10_TEMP38 = ( _MGOP_Pc3 * d3 ) ; final double X10_TEMP40 = ( X10_TEMP37 + X10_TEMP38 ) ; final double X10_TEMP41 = ( X10_TEMP40 ) ; final Dist3 RX10_TEMP34 = res . distValue ; final Region3 RX10_TEMP35 = RX10_TEMP34 . dReg ; final int RX10_TEMP36 = Program . searchPointInRegion3 ( RX10_TEMP35 , pp ) ; final int RX10_TEMP37 = 0 ; final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP39 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 final place RX10_TEMP40 = Program . getPlaceFromDist3 ( RX10_TEMP34 , RX10_TEMP36 ) ; final place RX10_TEMP42 = here ; final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP41 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP36 , X10_TEMP41 ) ; }
 }
 }
 public static void thread13(final T13 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final Region3 X10_TEMP52 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP53 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP54 = 0 ; final int X10_TEMP55 = 1 ; final int X10_TEMP56 = X10_TEMP54 - X10_TEMP55 ; final place X10_TEMP57 = here ; Region3 X10_TEMP58 = Program . createNewRegion3RRR ( X10_TEMP54 , X10_TEMP56 , X10_TEMP54 , X10_TEMP56 , X10_TEMP54 , X10_TEMP56 ) ; final int RX10_TEMP59 = 1 ; int RX10_TEMP57 = X10_TEMP52 . regSize ; RX10_TEMP57 = RX10_TEMP57 - RX10_TEMP59 ; final region ( : rank==1 ) RX10_TEMP58 = [ 0 : RX10_TEMP57 ] ; for ( point ( : rank==1 ) RX10_TEMP56 : RX10_TEMP58 ) { final int RX10_TEMP60 = RX10_TEMP56 [0] ; final Point3 X10_TEMP59 = Program . regionOrdinalPoint3 ( X10_TEMP52 , RX10_TEMP60 ) ; final int X10_TEMP60 = X10_TEMP59 . f0 ; final int X10_TEMP61 = X10_TEMP59 . f1 ; final int X10_TEMP62 = X10_TEMP59 . f2 ; final boolean RX10_TEMP61 = Program . regionContainsPoint3 ( X10_TEMP53 , X10_TEMP59 ) ; boolean X10_TEMP63 = RX10_TEMP61 ; X10_TEMP63 = ! X10_TEMP63 ; if ( X10_TEMP63 ) { final Region3 X10_TEMP64 = Program . createNewRegion3RRR ( X10_TEMP60 , X10_TEMP60 , X10_TEMP61 , X10_TEMP61 , X10_TEMP62 , X10_TEMP62 ) ; X10_TEMP58 = Program . unionRegion3 ( X10_TEMP58 , X10_TEMP64 ) ; }
 }
 final Region3 X10_TEMP65 = X10_TEMP58 ; Region3 R = X10_TEMP65 ; final int RX10_TEMP65 = 1 ; int RX10_TEMP63 = R . regSize ; RX10_TEMP63 = RX10_TEMP63 - RX10_TEMP65 ; final region ( : rank==1 ) RX10_TEMP64 = [ 0 : RX10_TEMP63 ] ; for ( point ( : rank==1 ) RX10_TEMP62 : RX10_TEMP64 ) { final int RX10_TEMP66 = RX10_TEMP62 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( R , RX10_TEMP66 ) ; final int X10_TEMP68 = ( 2 ) ; int RX10_TEMP67 = pp . f0 ; RX10_TEMP67 = RX10_TEMP67 * X10_TEMP68 ; int RX10_TEMP68 = pp . f1 ; RX10_TEMP68 = RX10_TEMP68 * X10_TEMP68 ; int RX10_TEMP69 = pp . f2 ; RX10_TEMP69 = RX10_TEMP69 * X10_TEMP68 ; final Point3 X10_TEMP72 = ( new Point3 ( RX10_TEMP67 , RX10_TEMP68 , RX10_TEMP69 ) ) ; int X10_TEMP73 = ( 1 ) ; int X10_TEMP74 = ( 1 ) ; int X10_TEMP75 = ( 1 ) ; int RX10_TEMP70 = X10_TEMP72 . f0 ; int RX10_TEMP71 = X10_TEMP72 . f1 ; int RX10_TEMP72 = X10_TEMP72 . f2 ; RX10_TEMP70 = RX10_TEMP70 + X10_TEMP73 ; RX10_TEMP71 = RX10_TEMP71 + X10_TEMP74 ; RX10_TEMP72 = RX10_TEMP72 + X10_TEMP75 ; Point3 p = ( new Point3 ( RX10_TEMP70 , RX10_TEMP71 , RX10_TEMP72 ) ) ; final Dist3 RX10_TEMP73 = arg . distValue ; final Region3 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion3 ( RX10_TEMP74 , p ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist3 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final double RX10_TEMP83 = Program . getRefArrayValue3double ( arg , RX10_TEMP75 ) ; double d0 = ( RX10_TEMP83 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final double X10_TEMP89 = ( _MGOP_Pc0 * d0 ) ; final double X10_TEMP90 = ( _MGOP_Pc1 * d1 ) ; final double X10_TEMP91 = ( X10_TEMP89 + X10_TEMP90 ) ; final double X10_TEMP92 = ( _MGOP_Pc2 * d2 ) ; final double X10_TEMP93 = ( X10_TEMP91 + X10_TEMP92 ) ; final double X10_TEMP94 = ( _MGOP_Pc3 * d3 ) ; final double X10_TEMP96 = ( X10_TEMP93 + X10_TEMP94 ) ; final double X10_TEMP97 = ( X10_TEMP96 ) ; final Dist3 RX10_TEMP84 = res . distValue ; final Region3 RX10_TEMP85 = RX10_TEMP84 . dReg ; final int RX10_TEMP86 = Program . searchPointInRegion3 ( RX10_TEMP85 , pp ) ; final int RX10_TEMP87 = 0 ; final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87 ; if ( RX10_TEMP88 ) { String RX10_TEMP89 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP89 ) ; }
 final place RX10_TEMP90 = Program . getPlaceFromDist3 ( RX10_TEMP84 , RX10_TEMP86 ) ; final place RX10_TEMP92 = here ; final boolean RX10_TEMP93 = RX10_TEMP90 != RX10_TEMP92 ; if ( RX10_TEMP93 ) { String RX10_TEMP91 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP91 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP86 , X10_TEMP97 ) ; }
 }
 }
 public static void thread14(final T14 utmpz) {final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final Dist1 X10_TEMP4 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP4 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP5 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP5 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP4 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP5 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP4 , RX10_TEMP7 ) ; final place X10_TEMP6 = RX10_TEMP11 ; 
 final T57 utmp57 = new T57(i, a_arg, a_res);
 async (X10_TEMP6) {Program.thread57(utmp57); }
 }
 finish { Program . LevelData_exchange ( a_arg ) ; }
 final Dist1 X10_TEMP45 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP45 = X10_TEMP45 . dReg ; final int RX10_TEMP48 = 1 ; int RX10_TEMP46 = RX10_TEMP45 . regSize ; RX10_TEMP46 = RX10_TEMP46 - RX10_TEMP48 ; final region ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP46 ] ; for ( point ( : rank==1 ) RX10_TEMP44 : RX10_TEMP47 ) { final int RX10_TEMP49 = RX10_TEMP44 [0] ; final Point1 X10_TEMP46 = Program . regionOrdinalPoint1 ( RX10_TEMP45 , RX10_TEMP49 ) ; final int i = X10_TEMP46 . f0 ; final Region1 RX10_TEMP50 = X10_TEMP45 . dReg ; final int RX10_TEMP51 = Program . searchPointInRegion1 ( RX10_TEMP50 , X10_TEMP46 ) ; final int RX10_TEMP52 = 0 ; final boolean RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; if ( RX10_TEMP53 ) { final String RX10_TEMP54 = "Point X10_TEMP46 not found in the distribution X10_TEMP45." ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final place RX10_TEMP55 = Program . getPlaceFromDist1 ( X10_TEMP45 , RX10_TEMP51 ) ; final place X10_TEMP47 = RX10_TEMP55 ; 
 final T58 utmp58 = new T58(i, a_arg, a_res);
 async (X10_TEMP47) {Program.thread58(utmp58); }
 }
 }
 }
 public static void thread15(final T15 utmpz) {final  int i = utmpz.i;
final  doubleRefArray3 arg = utmpz.arg;
final  MGOP X10_TEMP0 = utmpz.X10_TEMP0;
 { final LevelData X10_TEMP13 = ( X10_TEMP0 . m_tempLD ) ; doubleRefArray3 temp = Program . LevelData_getArray ( X10_TEMP13 , i ) ; final Dist3 RX10_TEMP12 = temp . distValue ; final Region3 RX10_TEMP13 = RX10_TEMP12 . dReg ; final Region3 X10_TEMP17 = RX10_TEMP13 ; Program . Util_arraycopy3 ( temp , X10_TEMP17 , arg ) ; }
 }
 public static void thread16(final T16 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getShrinkedRegion ( a_arg , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; double d = ( 0 ) ; final int X10_TEMP16 = ( 2 ) ; int RX10_TEMP17 = p . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP16 ; int RX10_TEMP18 = p . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP16 ; int RX10_TEMP19 = p . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP16 ; final Point3 X10_TEMP20 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP21 = ( 1 ) ; int X10_TEMP22 = ( 1 ) ; int X10_TEMP23 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP20 . f0 ; int RX10_TEMP21 = X10_TEMP20 . f1 ; int RX10_TEMP22 = X10_TEMP20 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP21 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP22 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP23 ; Point3 pp = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final int RX10_TEMP26 = 1 ; int RX10_TEMP24 = _Util_UNIT_CUBE . regSize ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; for ( point ( : rank==1 ) RX10_TEMP23 : RX10_TEMP25 ) { final int RX10_TEMP27 = RX10_TEMP23 [0] ; final Point3 o = Program . regionOrdinalPoint3 ( _Util_UNIT_CUBE , RX10_TEMP27 ) ; final int i2 = o . f0 ; final int j2 = o . f1 ; final int k2 = o . f2 ; final double X10_TEMP27 = ( 0 ) ; d = ( X10_TEMP27 ) ; final Region3 RX10_TEMP28 = _Util_QREGIONS . regionValue ; final int RX10_TEMP29 = Program . searchPointInRegion3 ( RX10_TEMP28 , o ) ; final int RX10_TEMP30 = 0 ; final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; if ( RX10_TEMP31 ) { String RX10_TEMP32 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP33 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP30 = RX10_TEMP33 [ RX10_TEMP29 ] ; final int RX10_TEMP38 = 1 ; int RX10_TEMP36 = X10_TEMP30 . regSize ; RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; final region ( : rank==1 ) RX10_TEMP37 = [ 0 : RX10_TEMP36 ] ; for ( point ( : rank==1 ) RX10_TEMP34 : RX10_TEMP37 ) { final int RX10_TEMP39 = RX10_TEMP34 [0] ; final Point3 RX10_TEMP35 = Program . regionOrdinalPoint3 ( X10_TEMP30 , RX10_TEMP39 ) ; final int i1 = RX10_TEMP35 . f0 ; final int j1 = RX10_TEMP35 . f1 ; final int k1 = RX10_TEMP35 . f2 ; int RX10_TEMP40 = p . f0 ; int RX10_TEMP41 = p . f1 ; int RX10_TEMP42 = p . f2 ; RX10_TEMP40 = RX10_TEMP40 + i1 ; RX10_TEMP41 = RX10_TEMP41 + j1 ; RX10_TEMP42 = RX10_TEMP42 + k1 ; final Point3 temp = ( new Point3 ( RX10_TEMP40 , RX10_TEMP41 , RX10_TEMP42 ) ) ; final Dist3 RX10_TEMP43 = arg . distValue ; final Region3 RX10_TEMP44 = RX10_TEMP43 . dReg ; final int RX10_TEMP45 = Program . searchPointInRegion3 ( RX10_TEMP44 , temp ) ; final int RX10_TEMP46 = 0 ; final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; if ( RX10_TEMP47 ) { String RX10_TEMP48 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final place RX10_TEMP49 = Program . getPlaceFromDist3 ( RX10_TEMP43 , RX10_TEMP45 ) ; final place RX10_TEMP51 = here ; final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP50 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final double RX10_TEMP53 = Program . getRefArrayValue3double ( arg , RX10_TEMP45 ) ; final double X10_TEMP36 = ( RX10_TEMP53 ) ; final double X10_TEMP38 = ( d + X10_TEMP36 ) ; d = ( X10_TEMP38 ) ; }
 int RX10_TEMP54 = pp . f0 ; int RX10_TEMP55 = pp . f1 ; int RX10_TEMP56 = pp . f2 ; RX10_TEMP54 = RX10_TEMP54 + i2 ; RX10_TEMP55 = RX10_TEMP55 + j2 ; RX10_TEMP56 = RX10_TEMP56 + k2 ; final Point3 X10_TEMP43 = ( new Point3 ( RX10_TEMP54 , RX10_TEMP55 , RX10_TEMP56 ) ) ; final Region3 RX10_TEMP57 = _Util_QREGIONS . regionValue ; final int RX10_TEMP58 = Program . searchPointInRegion3 ( RX10_TEMP57 , o ) ; final int RX10_TEMP59 = 0 ; final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; if ( RX10_TEMP60 ) { String RX10_TEMP61 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP61 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP62 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP45 = RX10_TEMP62 [ RX10_TEMP58 ] ; final int X10_TEMP46 = ( X10_TEMP45 . regSize ) ; final double X10_TEMP48 = ( d / X10_TEMP46 ) ; final double X10_TEMP49 = ( X10_TEMP48 ) ; final Dist3 RX10_TEMP63 = res . distValue ; final Region3 RX10_TEMP64 = RX10_TEMP63 . dReg ; final int RX10_TEMP65 = Program . searchPointInRegion3 ( RX10_TEMP64 , X10_TEMP43 ) ; final int RX10_TEMP66 = 0 ; final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66 ; if ( RX10_TEMP67 ) { String RX10_TEMP68 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP68 ) ; }
 final place RX10_TEMP69 = Program . getPlaceFromDist3 ( RX10_TEMP63 , RX10_TEMP65 ) ; final place RX10_TEMP71 = here ; final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71 ; if ( RX10_TEMP72 ) { String RX10_TEMP70 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP65 , X10_TEMP49 ) ; }
 }
 }
 }
 public static void thread17(final T17 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_arg , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; double d = ( 0 ) ; final int X10_TEMP13 = ( 2 ) ; int RX10_TEMP17 = p . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP13 ; int RX10_TEMP18 = p . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP13 ; int RX10_TEMP19 = p . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP13 ; final Point3 X10_TEMP17 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP18 = ( 1 ) ; int X10_TEMP19 = ( 1 ) ; int X10_TEMP20 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP17 . f0 ; int RX10_TEMP21 = X10_TEMP17 . f1 ; int RX10_TEMP22 = X10_TEMP17 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP18 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP19 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP20 ; Point3 pp = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final int RX10_TEMP26 = 1 ; int RX10_TEMP24 = _Util_UNIT_CUBE . regSize ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; for ( point ( : rank==1 ) RX10_TEMP23 : RX10_TEMP25 ) { final int RX10_TEMP27 = RX10_TEMP23 [0] ; final Point3 o = Program . regionOrdinalPoint3 ( _Util_UNIT_CUBE , RX10_TEMP27 ) ; final int i2 = o . f0 ; final int j2 = o . f1 ; final int k2 = o . f2 ; final double X10_TEMP24 = ( 0 ) ; d = ( X10_TEMP24 ) ; final Region3 RX10_TEMP28 = _Util_QREGIONS . regionValue ; final int RX10_TEMP29 = Program . searchPointInRegion3 ( RX10_TEMP28 , o ) ; final int RX10_TEMP30 = 0 ; final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; if ( RX10_TEMP31 ) { String RX10_TEMP32 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP33 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP27 = RX10_TEMP33 [ RX10_TEMP29 ] ; final int RX10_TEMP38 = 1 ; int RX10_TEMP36 = X10_TEMP27 . regSize ; RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; final region ( : rank==1 ) RX10_TEMP37 = [ 0 : RX10_TEMP36 ] ; for ( point ( : rank==1 ) RX10_TEMP34 : RX10_TEMP37 ) { final int RX10_TEMP39 = RX10_TEMP34 [0] ; final Point3 RX10_TEMP35 = Program . regionOrdinalPoint3 ( X10_TEMP27 , RX10_TEMP39 ) ; final int i1 = RX10_TEMP35 . f0 ; final int j1 = RX10_TEMP35 . f1 ; final int k1 = RX10_TEMP35 . f2 ; int RX10_TEMP40 = p . f0 ; int RX10_TEMP41 = p . f1 ; int RX10_TEMP42 = p . f2 ; RX10_TEMP40 = RX10_TEMP40 + i1 ; RX10_TEMP41 = RX10_TEMP41 + j1 ; RX10_TEMP42 = RX10_TEMP42 + k1 ; final Point3 temp = ( new Point3 ( RX10_TEMP40 , RX10_TEMP41 , RX10_TEMP42 ) ) ; final Dist3 RX10_TEMP43 = arg . distValue ; final Region3 RX10_TEMP44 = RX10_TEMP43 . dReg ; final int RX10_TEMP45 = Program . searchPointInRegion3 ( RX10_TEMP44 , temp ) ; final int RX10_TEMP46 = 0 ; final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; if ( RX10_TEMP47 ) { String RX10_TEMP48 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final place RX10_TEMP49 = Program . getPlaceFromDist3 ( RX10_TEMP43 , RX10_TEMP45 ) ; final place RX10_TEMP51 = here ; final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP50 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final double RX10_TEMP53 = Program . getRefArrayValue3double ( arg , RX10_TEMP45 ) ; final double X10_TEMP33 = ( RX10_TEMP53 ) ; final double X10_TEMP35 = ( d + X10_TEMP33 ) ; d = ( X10_TEMP35 ) ; }
 int RX10_TEMP54 = pp . f0 ; int RX10_TEMP55 = pp . f1 ; int RX10_TEMP56 = pp . f2 ; RX10_TEMP54 = RX10_TEMP54 + i2 ; RX10_TEMP55 = RX10_TEMP55 + j2 ; RX10_TEMP56 = RX10_TEMP56 + k2 ; final Point3 X10_TEMP40 = ( new Point3 ( RX10_TEMP54 , RX10_TEMP55 , RX10_TEMP56 ) ) ; final Region3 RX10_TEMP57 = _Util_QREGIONS . regionValue ; final int RX10_TEMP58 = Program . searchPointInRegion3 ( RX10_TEMP57 , o ) ; final int RX10_TEMP59 = 0 ; final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; if ( RX10_TEMP60 ) { String RX10_TEMP61 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP61 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP62 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP42 = RX10_TEMP62 [ RX10_TEMP58 ] ; final int X10_TEMP43 = ( X10_TEMP42 . regSize ) ; final double X10_TEMP45 = ( d / X10_TEMP43 ) ; final double X10_TEMP46 = ( X10_TEMP45 ) ; final Dist3 RX10_TEMP63 = res . distValue ; final Region3 RX10_TEMP64 = RX10_TEMP63 . dReg ; final int RX10_TEMP65 = Program . searchPointInRegion3 ( RX10_TEMP64 , X10_TEMP40 ) ; final int RX10_TEMP66 = 0 ; final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66 ; if ( RX10_TEMP67 ) { String RX10_TEMP68 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP68 ) ; }
 final place RX10_TEMP69 = Program . getPlaceFromDist3 ( RX10_TEMP63 , RX10_TEMP65 ) ; final place RX10_TEMP71 = here ; final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71 ; if ( RX10_TEMP72 ) { String RX10_TEMP70 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP65 , X10_TEMP46 ) ; }
 }
 }
 }
 public static void thread18(final T18 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final Region3 X10_TEMP57 = Program . LevelData_getShrinkedRegion ( a_arg , i ) ; final Region3 X10_TEMP58 = Program . LevelData_getINNERRegion ( a_arg , i ) ; final int X10_TEMP59 = 0 ; final int X10_TEMP60 = 1 ; final int X10_TEMP61 = X10_TEMP59 - X10_TEMP60 ; final place X10_TEMP62 = here ; Region3 X10_TEMP63 = Program . createNewRegion3RRR ( X10_TEMP59 , X10_TEMP61 , X10_TEMP59 , X10_TEMP61 , X10_TEMP59 , X10_TEMP61 ) ; final int RX10_TEMP88 = 1 ; int RX10_TEMP86 = X10_TEMP57 . regSize ; RX10_TEMP86 = RX10_TEMP86 - RX10_TEMP88 ; final region ( : rank==1 ) RX10_TEMP87 = [ 0 : RX10_TEMP86 ] ; for ( point ( : rank==1 ) RX10_TEMP85 : RX10_TEMP87 ) { final int RX10_TEMP89 = RX10_TEMP85 [0] ; final Point3 X10_TEMP64 = Program . regionOrdinalPoint3 ( X10_TEMP57 , RX10_TEMP89 ) ; final int X10_TEMP65 = X10_TEMP64 . f0 ; final int X10_TEMP66 = X10_TEMP64 . f1 ; final int X10_TEMP67 = X10_TEMP64 . f2 ; final boolean RX10_TEMP90 = Program . regionContainsPoint3 ( X10_TEMP58 , X10_TEMP64 ) ; boolean X10_TEMP68 = RX10_TEMP90 ; X10_TEMP68 = ! X10_TEMP68 ; if ( X10_TEMP68 ) { final Region3 X10_TEMP69 = Program . createNewRegion3RRR ( X10_TEMP65 , X10_TEMP65 , X10_TEMP66 , X10_TEMP66 , X10_TEMP67 , X10_TEMP67 ) ; X10_TEMP63 = Program . unionRegion3 ( X10_TEMP63 , X10_TEMP69 ) ; }
 }
 final Region3 X10_TEMP70 = X10_TEMP63 ; Region3 R = X10_TEMP70 ; final int RX10_TEMP94 = 1 ; int RX10_TEMP92 = R . regSize ; RX10_TEMP92 = RX10_TEMP92 - RX10_TEMP94 ; final region ( : rank==1 ) RX10_TEMP93 = [ 0 : RX10_TEMP92 ] ; for ( point ( : rank==1 ) RX10_TEMP91 : RX10_TEMP93 ) { final int RX10_TEMP95 = RX10_TEMP91 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP95 ) ; double d = ( 0 ) ; final int X10_TEMP74 = ( 2 ) ; int RX10_TEMP96 = p . f0 ; RX10_TEMP96 = RX10_TEMP96 * X10_TEMP74 ; int RX10_TEMP97 = p . f1 ; RX10_TEMP97 = RX10_TEMP97 * X10_TEMP74 ; int RX10_TEMP98 = p . f2 ; RX10_TEMP98 = RX10_TEMP98 * X10_TEMP74 ; final Point3 X10_TEMP78 = ( new Point3 ( RX10_TEMP96 , RX10_TEMP97 , RX10_TEMP98 ) ) ; int X10_TEMP79 = ( 1 ) ; int X10_TEMP80 = ( 1 ) ; int X10_TEMP81 = ( 1 ) ; int RX10_TEMP99 = X10_TEMP78 . f0 ; int RX10_TEMP100 = X10_TEMP78 . f1 ; int RX10_TEMP101 = X10_TEMP78 . f2 ; RX10_TEMP99 = RX10_TEMP99 + X10_TEMP79 ; RX10_TEMP100 = RX10_TEMP100 + X10_TEMP80 ; RX10_TEMP101 = RX10_TEMP101 + X10_TEMP81 ; Point3 pp = ( new Point3 ( RX10_TEMP99 , RX10_TEMP100 , RX10_TEMP101 ) ) ; final int RX10_TEMP105 = 1 ; int RX10_TEMP103 = _Util_UNIT_CUBE . regSize ; RX10_TEMP103 = RX10_TEMP103 - RX10_TEMP105 ; final region ( : rank==1 ) RX10_TEMP104 = [ 0 : RX10_TEMP103 ] ; for ( point ( : rank==1 ) RX10_TEMP102 : RX10_TEMP104 ) { final int RX10_TEMP106 = RX10_TEMP102 [0] ; final Point3 o = Program . regionOrdinalPoint3 ( _Util_UNIT_CUBE , RX10_TEMP106 ) ; final int i2 = o . f0 ; final int j2 = o . f1 ; final int k2 = o . f2 ; final double X10_TEMP85 = ( 0 ) ; d = ( X10_TEMP85 ) ; final Region3 RX10_TEMP107 = _Util_QREGIONS . regionValue ; final int RX10_TEMP108 = Program . searchPointInRegion3 ( RX10_TEMP107 , o ) ; final int RX10_TEMP109 = 0 ; final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109 ; if ( RX10_TEMP110 ) { String RX10_TEMP111 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP111 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP112 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP88 = RX10_TEMP112 [ RX10_TEMP108 ] ; final int RX10_TEMP117 = 1 ; int RX10_TEMP115 = X10_TEMP88 . regSize ; RX10_TEMP115 = RX10_TEMP115 - RX10_TEMP117 ; final region ( : rank==1 ) RX10_TEMP116 = [ 0 : RX10_TEMP115 ] ; for ( point ( : rank==1 ) RX10_TEMP113 : RX10_TEMP116 ) { final int RX10_TEMP118 = RX10_TEMP113 [0] ; final Point3 RX10_TEMP114 = Program . regionOrdinalPoint3 ( X10_TEMP88 , RX10_TEMP118 ) ; final int i1 = RX10_TEMP114 . f0 ; final int j1 = RX10_TEMP114 . f1 ; final int k1 = RX10_TEMP114 . f2 ; int RX10_TEMP119 = p . f0 ; int RX10_TEMP120 = p . f1 ; int RX10_TEMP121 = p . f2 ; RX10_TEMP119 = RX10_TEMP119 + i1 ; RX10_TEMP120 = RX10_TEMP120 + j1 ; RX10_TEMP121 = RX10_TEMP121 + k1 ; final Point3 temp = ( new Point3 ( RX10_TEMP119 , RX10_TEMP120 , RX10_TEMP121 ) ) ; final Dist3 RX10_TEMP122 = arg . distValue ; final Region3 RX10_TEMP123 = RX10_TEMP122 . dReg ; final int RX10_TEMP124 = Program . searchPointInRegion3 ( RX10_TEMP123 , temp ) ; final int RX10_TEMP125 = 0 ; final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125 ; if ( RX10_TEMP126 ) { String RX10_TEMP127 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP127 ) ; }
 final place RX10_TEMP128 = Program . getPlaceFromDist3 ( RX10_TEMP122 , RX10_TEMP124 ) ; final place RX10_TEMP130 = here ; final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130 ; if ( RX10_TEMP131 ) { String RX10_TEMP129 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP129 ) ; }
 final double RX10_TEMP132 = Program . getRefArrayValue3double ( arg , RX10_TEMP124 ) ; final double X10_TEMP94 = ( RX10_TEMP132 ) ; final double X10_TEMP96 = ( d + X10_TEMP94 ) ; d = ( X10_TEMP96 ) ; }
 int RX10_TEMP133 = pp . f0 ; int RX10_TEMP134 = pp . f1 ; int RX10_TEMP135 = pp . f2 ; RX10_TEMP133 = RX10_TEMP133 + i2 ; RX10_TEMP134 = RX10_TEMP134 + j2 ; RX10_TEMP135 = RX10_TEMP135 + k2 ; final Point3 X10_TEMP101 = ( new Point3 ( RX10_TEMP133 , RX10_TEMP134 , RX10_TEMP135 ) ) ; final Region3 RX10_TEMP136 = _Util_QREGIONS . regionValue ; final int RX10_TEMP137 = Program . searchPointInRegion3 ( RX10_TEMP136 , o ) ; final int RX10_TEMP138 = 0 ; final boolean RX10_TEMP139 = RX10_TEMP137 < RX10_TEMP138 ; if ( RX10_TEMP139 ) { String RX10_TEMP140 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP140 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP141 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP103 = RX10_TEMP141 [ RX10_TEMP137 ] ; final int X10_TEMP104 = ( X10_TEMP103 . regSize ) ; final double X10_TEMP106 = ( d / X10_TEMP104 ) ; final double X10_TEMP107 = ( X10_TEMP106 ) ; final Dist3 RX10_TEMP142 = res . distValue ; final Region3 RX10_TEMP143 = RX10_TEMP142 . dReg ; final int RX10_TEMP144 = Program . searchPointInRegion3 ( RX10_TEMP143 , X10_TEMP101 ) ; final int RX10_TEMP145 = 0 ; final boolean RX10_TEMP146 = RX10_TEMP144 < RX10_TEMP145 ; if ( RX10_TEMP146 ) { String RX10_TEMP147 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP147 ) ; }
 final place RX10_TEMP148 = Program . getPlaceFromDist3 ( RX10_TEMP142 , RX10_TEMP144 ) ; final place RX10_TEMP150 = here ; final boolean RX10_TEMP151 = RX10_TEMP148 != RX10_TEMP150 ; if ( RX10_TEMP151 ) { String RX10_TEMP149 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP149 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP144 , X10_TEMP107 ) ; }
 }
 }
 }
 public static void thread19(final T19 utmpz) {final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final Dist1 X10_TEMP4 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP1 = X10_TEMP4 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 X10_TEMP5 = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final int i = X10_TEMP5 . f0 ; final Region1 RX10_TEMP6 = X10_TEMP4 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , X10_TEMP5 ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point X10_TEMP5 not found in the distribution X10_TEMP4." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP4 , RX10_TEMP7 ) ; final place X10_TEMP6 = RX10_TEMP11 ; 
 final T59 utmp59 = new T59(i, a_arg, a_res);
 async (X10_TEMP6) {Program.thread59(utmp59); }
 }
 finish { Program . LevelData_exchange ( a_arg ) ; }
 final Dist1 X10_TEMP50 = Program . LevelData_getPlaces ( a_res ) ; final Region1 RX10_TEMP74 = X10_TEMP50 . dReg ; final int RX10_TEMP77 = 1 ; int RX10_TEMP75 = RX10_TEMP74 . regSize ; RX10_TEMP75 = RX10_TEMP75 - RX10_TEMP77 ; final region ( : rank==1 ) RX10_TEMP76 = [ 0 : RX10_TEMP75 ] ; for ( point ( : rank==1 ) RX10_TEMP73 : RX10_TEMP76 ) { final int RX10_TEMP78 = RX10_TEMP73 [0] ; final Point1 X10_TEMP51 = Program . regionOrdinalPoint1 ( RX10_TEMP74 , RX10_TEMP78 ) ; final int i = X10_TEMP51 . f0 ; final Region1 RX10_TEMP79 = X10_TEMP50 . dReg ; final int RX10_TEMP80 = Program . searchPointInRegion1 ( RX10_TEMP79 , X10_TEMP51 ) ; final int RX10_TEMP81 = 0 ; final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81 ; if ( RX10_TEMP82 ) { final String RX10_TEMP83 = "Point X10_TEMP51 not found in the distribution X10_TEMP50." ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 final place RX10_TEMP84 = Program . getPlaceFromDist1 ( X10_TEMP50 , RX10_TEMP80 ) ; final place X10_TEMP52 = RX10_TEMP84 ; 
 final T60 utmp60 = new T60(i, a_arg, a_res);
 async (X10_TEMP52) {Program.thread60(utmp60); }
 }
 }
 }
 public static void thread20(final T20 utmpz) {final  place h = utmpz.h;
final  Point3 p = utmpz.p;
final  doubleRefArray3 a_src = utmpz.a_src;
final  doubleRefArray3 a_dest = utmpz.a_dest;
 { final Dist3 RX10_TEMP12 = a_src . distValue ; final Region3 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion3 ( RX10_TEMP13 , p ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist3 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array a_src" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 final double RX10_TEMP22 = Program . getRefArrayValue3double ( a_src , RX10_TEMP14 ) ; final double d = ( RX10_TEMP22 ) ; 
 final T61 utmp61 = new T61(d, p, a_dest);
 async (h) {Program.thread61(utmp61); }
 }
 }
 public static void thread21(final T21 utmpz) {final  place h = utmpz.h;
final  Point3 p = utmpz.p;
final  int a_trans2 = utmpz.a_trans2;
final  int a_trans1 = utmpz.a_trans1;
final  int a_trans0 = utmpz.a_trans0;
final  doubleRefArray3 a_src = utmpz.a_src;
final  doubleRefArray3 a_dest = utmpz.a_dest;
 { int RX10_TEMP15 = p . f0 ; int RX10_TEMP16 = p . f1 ; int RX10_TEMP17 = p . f2 ; RX10_TEMP15 = RX10_TEMP15 + a_trans0 ; RX10_TEMP16 = RX10_TEMP16 + a_trans1 ; RX10_TEMP17 = RX10_TEMP17 + a_trans2 ; final Point3 X10_TEMP15 = ( new Point3 ( RX10_TEMP15 , RX10_TEMP16 , RX10_TEMP17 ) ) ; final Dist3 RX10_TEMP18 = a_src . distValue ; final Region3 RX10_TEMP19 = RX10_TEMP18 . dReg ; final int RX10_TEMP20 = Program . searchPointInRegion3 ( RX10_TEMP19 , X10_TEMP15 ) ; final int RX10_TEMP21 = 0 ; final boolean RX10_TEMP22 = RX10_TEMP20 < RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP23 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP23 ) ; }
 final place RX10_TEMP24 = Program . getPlaceFromDist3 ( RX10_TEMP18 , RX10_TEMP20 ) ; final place RX10_TEMP26 = here ; final boolean RX10_TEMP27 = RX10_TEMP24 != RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP25 = "Bad place access for array a_src" ; throw new RuntimeException ( RX10_TEMP25 ) ; }
 final double RX10_TEMP28 = Program . getRefArrayValue3double ( a_src , RX10_TEMP20 ) ; final double d = ( RX10_TEMP28 ) ; 
 final T62 utmp62 = new T62(d, p, a_dest);
 async (h) {Program.thread62(utmp62); }
 }
 }
 public static void thread22(final T22 utmpz) {final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { double res = ( 0 ) ; final WrapperRefArray1 X10_TEMP6 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP12 = new Point1 ( i ) ; final Dist1 RX10_TEMP13 = X10_TEMP6 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final Wrapper RX10_TEMP23 = Program . getRefArrayValue1Wrapper ( X10_TEMP6 , RX10_TEMP15 ) ; final Wrapper X10_TEMP8 = ( RX10_TEMP23 ) ; final doubleRefArray3 X10_TEMP9 = X10_TEMP8 . m_array ; doubleRefArray3 temp = X10_TEMP9 ; final Region3RefArray1 X10_TEMP11 = X10_TEMP0 . m_REGIONs ; final Point1 RX10_TEMP24 = new Point1 ( i ) ; final Dist1 RX10_TEMP25 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , RX10_TEMP24 ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { String RX10_TEMP30 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; final place RX10_TEMP33 = here ; final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; if ( RX10_TEMP34 ) { String RX10_TEMP32 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final Region3 RX10_TEMP35 = Program . getRefArrayValue1Region3 ( X10_TEMP11 , RX10_TEMP27 ) ; final Region3 X10_TEMP14 = RX10_TEMP35 ; final int RX10_TEMP39 = 1 ; int RX10_TEMP37 = X10_TEMP14 . regSize ; RX10_TEMP37 = RX10_TEMP37 - RX10_TEMP39 ; final region ( : rank==1 ) RX10_TEMP38 = [ 0 : RX10_TEMP37 ] ; for ( point ( : rank==1 ) RX10_TEMP36 : RX10_TEMP38 ) { final int RX10_TEMP40 = RX10_TEMP36 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( X10_TEMP14 , RX10_TEMP40 ) ; final Dist3 RX10_TEMP41 = temp . distValue ; final Region3 RX10_TEMP42 = RX10_TEMP41 . dReg ; final int RX10_TEMP43 = Program . searchPointInRegion3 ( RX10_TEMP42 , p ) ; final int RX10_TEMP44 = 0 ; final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP46 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 final place RX10_TEMP47 = Program . getPlaceFromDist3 ( RX10_TEMP41 , RX10_TEMP43 ) ; final place RX10_TEMP49 = here ; final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP48 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final double RX10_TEMP51 = Program . getRefArrayValue3double ( temp , RX10_TEMP43 ) ; final double X10_TEMP17 = ( RX10_TEMP51 ) ; final double X10_TEMP18 = ( Math . abs ( X10_TEMP17 ) ) ; final double X10_TEMP20 = ( res + X10_TEMP18 ) ; res = ( X10_TEMP20 ) ; }
 final String X10_TEMP21 = ( "block at place " ) ; final String X10_TEMP22 = ( X10_TEMP21 + i ) ; final String X10_TEMP23 = ( " : " ) ; final String X10_TEMP24 = ( X10_TEMP22 + X10_TEMP23 ) ; final Dist3 RX10_TEMP52 = temp . distValue ; final Region3 RX10_TEMP53 = RX10_TEMP52 . dReg ; final Region3 X10_TEMP25 = RX10_TEMP53 ; final String RX10_TEMP54 = Program . toStringRegion3 ( X10_TEMP25 ) ; final String X10_TEMP26 = ( X10_TEMP24 + RX10_TEMP54 ) ; final String X10_TEMP27 = ( " sum of m_u=" ) ; final String X10_TEMP28 = ( X10_TEMP26 + X10_TEMP27 ) ; final String X10_TEMP30 = ( X10_TEMP28 + res ) ; System.out.println ( X10_TEMP30 ) ; }
 }
 public static void thread23(final T23 utmpz) {final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final String X10_TEMP5 = ( "block at place " ) ; final String X10_TEMP6 = ( X10_TEMP5 + i ) ; final String X10_TEMP7 = ( " : " ) ; final String X10_TEMP9 = ( X10_TEMP6 + X10_TEMP7 ) ; System.out.println ( X10_TEMP9 ) ; final WrapperRefArray1 X10_TEMP10 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP12 = new Point1 ( i ) ; final Dist1 RX10_TEMP13 = X10_TEMP10 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final Wrapper RX10_TEMP23 = Program . getRefArrayValue1Wrapper ( X10_TEMP10 , RX10_TEMP15 ) ; final Wrapper X10_TEMP12 = ( RX10_TEMP23 ) ; final doubleRefArray3 X10_TEMP13 = X10_TEMP12 . m_array ; doubleRefArray3 temp = X10_TEMP13 ; int counter = ( 0 ) ; final Region3RefArray1 X10_TEMP16 = X10_TEMP0 . m_regions ; final Point1 RX10_TEMP24 = new Point1 ( i ) ; final Dist1 RX10_TEMP25 = X10_TEMP16 . distValue ; final Region1 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , RX10_TEMP24 ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { String RX10_TEMP30 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; final place RX10_TEMP33 = here ; final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; if ( RX10_TEMP34 ) { String RX10_TEMP32 = "Bad place access for array X10_TEMP16" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final Region3 RX10_TEMP35 = Program . getRefArrayValue1Region3 ( X10_TEMP16 , RX10_TEMP27 ) ; final Region3 X10_TEMP19 = RX10_TEMP35 ; final int RX10_TEMP39 = 1 ; int RX10_TEMP37 = X10_TEMP19 . regSize ; RX10_TEMP37 = RX10_TEMP37 - RX10_TEMP39 ; final region ( : rank==1 ) RX10_TEMP38 = [ 0 : RX10_TEMP37 ] ; for ( point ( : rank==1 ) RX10_TEMP36 : RX10_TEMP38 ) { final int RX10_TEMP40 = RX10_TEMP36 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( X10_TEMP19 , RX10_TEMP40 ) ; final String X10_TEMP20 = ( " [" ) ; final String RX10_TEMP41 = Program . toStringPoint3 ( p ) ; final String X10_TEMP21 = ( X10_TEMP20 + RX10_TEMP41 ) ; final String X10_TEMP22 = ( "]= " ) ; final String X10_TEMP24 = ( X10_TEMP21 + X10_TEMP22 ) ; final Dist3 RX10_TEMP42 = temp . distValue ; final Region3 RX10_TEMP43 = RX10_TEMP42 . dReg ; final int RX10_TEMP44 = Program . searchPointInRegion3 ( RX10_TEMP43 , p ) ; final int RX10_TEMP45 = 0 ; final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; if ( RX10_TEMP46 ) { String RX10_TEMP47 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP47 ) ; }
 final place RX10_TEMP48 = Program . getPlaceFromDist3 ( RX10_TEMP42 , RX10_TEMP44 ) ; final place RX10_TEMP50 = here ; final boolean RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP49 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP49 ) ; }
 final double RX10_TEMP52 = Program . getRefArrayValue3double ( temp , RX10_TEMP44 ) ; final double X10_TEMP25 = ( RX10_TEMP52 ) ; final String X10_TEMP27 = ( X10_TEMP24 + X10_TEMP25 ) ; System.out.print ( X10_TEMP27 ) ; final int X10_TEMP28 = ( counter ) ; final int X10_TEMP29 = 1 ; counter = counter + X10_TEMP29 ; final int X10_TEMP30 = ( 4 ) ; final boolean X10_TEMP32 = counter == X10_TEMP30 ; if ( X10_TEMP32 ) { final String X10_TEMP34 = ( "\n" ) ; System.out.print ( X10_TEMP34 ) ; final int X10_TEMP36 = ( 0 ) ; counter = ( X10_TEMP36 ) ; }
 }
 final String X10_TEMP38 = ( "" ) ; System.out.println ( X10_TEMP38 ) ; }
 }
 public static void thread24(final T24 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; 
 final T63 utmp63 = new T63(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread63(utmp63); }
 }
 }
 public static void thread25(final T25 utmpz) {final  int i = utmpz.i;
final  doubleRefArray1 results = utmpz.results;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { double res = ( 0 ) ; final WrapperRefArray1 X10_TEMP8 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP32 = new Point1 ( i ) ; final Dist1 RX10_TEMP33 = X10_TEMP8 . distValue ; final Region1 RX10_TEMP34 = RX10_TEMP33 . dReg ; final int RX10_TEMP35 = Program . searchPointInRegion1 ( RX10_TEMP34 , RX10_TEMP32 ) ; final int RX10_TEMP36 = 0 ; final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP38 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP38 ) ; }
 final place RX10_TEMP39 = Program . getPlaceFromDist1 ( RX10_TEMP33 , RX10_TEMP35 ) ; final place RX10_TEMP41 = here ; final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; if ( RX10_TEMP42 ) { String RX10_TEMP40 = "Bad place access for array X10_TEMP8" ; throw new RuntimeException ( RX10_TEMP40 ) ; }
 final Wrapper RX10_TEMP43 = Program . getRefArrayValue1Wrapper ( X10_TEMP8 , RX10_TEMP35 ) ; final Wrapper X10_TEMP10 = ( RX10_TEMP43 ) ; final doubleRefArray3 X10_TEMP11 = X10_TEMP10 . m_array ; final doubleRefArray3 temp = X10_TEMP11 ; final Region3 X10_TEMP15 = Program . LevelData_get_m_regions ( X10_TEMP0 , i ) ; final int RX10_TEMP47 = 1 ; int RX10_TEMP45 = X10_TEMP15 . regSize ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP47 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; for ( point ( : rank==1 ) RX10_TEMP44 : RX10_TEMP46 ) { final int RX10_TEMP48 = RX10_TEMP44 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( X10_TEMP15 , RX10_TEMP48 ) ; final place h = ( here ) ; final int X10_TEMP19 = ( 0 ) ; final int X10_TEMP20 = ( 0 ) ; final Region1 X10_TEMP21 = Program . createNewRegion1R ( X10_TEMP19 , X10_TEMP20 ) ; final place X10_TEMP22 = ( here ) ; final Dist1 X10_TEMP24 = Program . getPlaceDist1 ( X10_TEMP21 , X10_TEMP22 ) ; final Dist1 dRecv = X10_TEMP24 ; final Region1 RX10_TEMP49 = dRecv . dReg ; final int RX10_TEMP50 = 0 ; final int RX10_TEMP51 = 1 ; int RX10_TEMP52 = place.MAX_PLACES ; RX10_TEMP52 = RX10_TEMP52 - RX10_TEMP51 ; final region ( : rank==1 ) RX10_TEMP53 = [ 0 : RX10_TEMP52 ] ; final dist ( : rank==1 ) RX10_TEMP54 = [ 0 : RX10_TEMP52 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP55 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP54 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP56 : RX10_TEMP53 ) { final place RX10_TEMP57 = here ; final int RX10_TEMP58 = RX10_TEMP56 [0] ; final place RX10_TEMP59 = place.places ( RX10_TEMP58 ) ; final int RX10_TEMP60 = Program . getDistLocalCount1 ( dRecv , RX10_TEMP58 ) ; final int RX10_TEMP61 = RX10_TEMP60 - RX10_TEMP51 ; 
 final T64 utmp64 = new T64(RX10_TEMP61, RX10_TEMP57, RX10_TEMP56, RX10_TEMP55);
 async (RX10_TEMP59) {Program.thread64(utmp64); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP65 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP53 ] ( point ( : rank==1 ) RX10_TEMP67 ) { final doubleStub RX10_TEMP66 = RX10_TEMP55 [ RX10_TEMP67 ] ; return RX10_TEMP66 ; }
 ) ; final doubleRefArray1 RX10_TEMP68 = new doubleRefArray1 ( dRecv , RX10_TEMP65 ) ; final doubleRefArray1 aRecv = RX10_TEMP68 ; finish { final Dist3 RX10_TEMP69 = temp . distValue ; final Dist3 X10_TEMP27 = RX10_TEMP69 ; final Region3 RX10_TEMP70 = X10_TEMP27 . dReg ; final int RX10_TEMP71 = Program . searchPointInRegion3 ( RX10_TEMP70 , p ) ; final int RX10_TEMP72 = 0 ; final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72 ; if ( RX10_TEMP73 ) { final String RX10_TEMP74 = "Point p not found in the distribution X10_TEMP27." ; throw new RuntimeException ( RX10_TEMP74 ) ; }
 final place RX10_TEMP75 = Program . getPlaceFromDist3 ( X10_TEMP27 , RX10_TEMP71 ) ; final place X10_TEMP30 = RX10_TEMP75 ; 
 final T65 utmp65 = new T65(aRecv, h, p, temp);
 async (X10_TEMP30) {Program.thread65(utmp65); }
 }
 final int X10_TEMP42 = ( 0 ) ; final Point1 RX10_TEMP109 = new Point1 ( X10_TEMP42 ) ; final Dist1 RX10_TEMP110 = aRecv . distValue ; final Region1 RX10_TEMP111 = RX10_TEMP110 . dReg ; final int RX10_TEMP112 = Program . searchPointInRegion1 ( RX10_TEMP111 , RX10_TEMP109 ) ; final int RX10_TEMP113 = 0 ; final boolean RX10_TEMP114 = RX10_TEMP112 < RX10_TEMP113 ; if ( RX10_TEMP114 ) { String RX10_TEMP115 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP115 ) ; }
 final place RX10_TEMP116 = Program . getPlaceFromDist1 ( RX10_TEMP110 , RX10_TEMP112 ) ; final place RX10_TEMP118 = here ; final boolean RX10_TEMP119 = RX10_TEMP116 != RX10_TEMP118 ; if ( RX10_TEMP119 ) { String RX10_TEMP117 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP117 ) ; }
 final double RX10_TEMP120 = Program . getRefArrayValue1double ( aRecv , RX10_TEMP112 ) ; final double X10_TEMP43 = ( RX10_TEMP120 ) ; final double X10_TEMP45 = ( res + X10_TEMP43 ) ; res = ( X10_TEMP45 ) ; }
 final double X10_TEMP48 = ( res ) ; final Point1 RX10_TEMP121 = new Point1 ( i ) ; final Dist1 RX10_TEMP122 = results . distValue ; final Region1 RX10_TEMP123 = RX10_TEMP122 . dReg ; final int RX10_TEMP124 = Program . searchPointInRegion1 ( RX10_TEMP123 , RX10_TEMP121 ) ; final int RX10_TEMP125 = 0 ; final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125 ; if ( RX10_TEMP126 ) { String RX10_TEMP127 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP127 ) ; }
 final place RX10_TEMP128 = Program . getPlaceFromDist1 ( RX10_TEMP122 , RX10_TEMP124 ) ; final place RX10_TEMP130 = here ; final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130 ; if ( RX10_TEMP131 ) { String RX10_TEMP129 = "Bad place access for array results" ; throw new RuntimeException ( RX10_TEMP129 ) ; }
 Program . setRefArrayValue1double ( results , RX10_TEMP124 , X10_TEMP48 ) ; }
 }
 public static void thread26(final T26 utmpz) {final  int i = utmpz.i;
final  int a_CLASS = utmpz.a_CLASS;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final WrapperRefArray1 X10_TEMP5 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP12 = new Point1 ( i ) ; final Dist1 RX10_TEMP13 = X10_TEMP5 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP5" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final Wrapper RX10_TEMP23 = Program . getRefArrayValue1Wrapper ( X10_TEMP5 , RX10_TEMP15 ) ; final Wrapper X10_TEMP7 = ( RX10_TEMP23 ) ; final doubleRefArray3 X10_TEMP8 = X10_TEMP7 . m_array ; final doubleRefArray3 temp = X10_TEMP8 ; final Region3 R = Program . LevelData_get_m_regions ( X10_TEMP0 , i ) ; final place X10_TEMP13 = here ; final Dist3 RX10_TEMP25 = temp . distValue ; final Region3 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP29 = 1 ; int RX10_TEMP27 = RX10_TEMP26 . regSize ; RX10_TEMP27 = RX10_TEMP27 - RX10_TEMP29 ; final region ( : rank==1 ) RX10_TEMP28 = [ 0 : RX10_TEMP27 ] ; for ( point ( : rank==1 ) RX10_TEMP24 : RX10_TEMP28 ) { final int RX10_TEMP30 = RX10_TEMP24 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( RX10_TEMP26 , RX10_TEMP30 ) ; final int x = p . f0 ; final int y = p . f1 ; final int z = p . f2 ; 
 final T66 utmp66 = new T66(z, y, x, p, R, temp, a_CLASS);
 async (X10_TEMP13) {Program.thread66(utmp66); }
 }
 }
 }
 public static void thread27(final T27 utmpz) {final  int i = utmpz.i;
final  double a_db = utmpz.a_db;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Wrapper X10_TEMP6 = ( Program . LevelData_get_m_u ( X10_TEMP0 , i ) ) ; final doubleRefArray3 X10_TEMP7 = X10_TEMP6 . m_array ; final doubleRefArray3 temp = X10_TEMP7 ; final Region3 X10_TEMP11 = Program . LevelData_get_m_regions ( X10_TEMP0 , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = X10_TEMP11 . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( X10_TEMP11 , RX10_TEMP16 ) ; final double X10_TEMP14 = ( a_db ) ; final Dist3 RX10_TEMP17 = temp . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP19 , X10_TEMP14 ) ; }
 }
 }
 public static void thread28(final T28 utmpz) {final  int i = utmpz.i;
final  LevelData a_LD = utmpz.a_LD;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final WrapperRefArray1 X10_TEMP5 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP12 = new Point1 ( i ) ; final Dist1 RX10_TEMP13 = X10_TEMP5 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP5" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final Wrapper RX10_TEMP23 = Program . getRefArrayValue1Wrapper ( X10_TEMP5 , RX10_TEMP15 ) ; final Wrapper X10_TEMP7 = ( RX10_TEMP23 ) ; final doubleRefArray3 X10_TEMP8 = X10_TEMP7 . m_array ; final doubleRefArray3 u = X10_TEMP8 ; final doubleRefArray3 temp = Program . LevelData_getArray ( a_LD , i ) ; final Region3 mri = Program . LevelData_get_m_regions ( X10_TEMP0 , i ) ; final int RX10_TEMP27 = 1 ; int RX10_TEMP25 = mri . regSize ; RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27 ; final region ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP25 ] ; for ( point ( : rank==1 ) RX10_TEMP24 : RX10_TEMP26 ) { final int RX10_TEMP28 = RX10_TEMP24 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( mri , RX10_TEMP28 ) ; final Dist3 RX10_TEMP29 = temp . distValue ; final Region3 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion3 ( RX10_TEMP30 , p ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist3 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final double RX10_TEMP39 = Program . getRefArrayValue3double ( temp , RX10_TEMP31 ) ; final double tp = ( RX10_TEMP39 ) ; final Dist3 RX10_TEMP40 = u . distValue ; final Dist3 X10_TEMP17 = RX10_TEMP40 ; final Region3 RX10_TEMP41 = X10_TEMP17 . dReg ; final int RX10_TEMP42 = Program . searchPointInRegion3 ( RX10_TEMP41 , p ) ; final int RX10_TEMP43 = 0 ; final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43 ; if ( RX10_TEMP44 ) { final String RX10_TEMP45 = "Point p not found in the distribution X10_TEMP17." ; throw new RuntimeException ( RX10_TEMP45 ) ; }
 final place RX10_TEMP46 = Program . getPlaceFromDist3 ( X10_TEMP17 , RX10_TEMP42 ) ; final place X10_TEMP20 = RX10_TEMP46 ; 
 final T67 utmp67 = new T67(tp, p, u);
 async (X10_TEMP20) {Program.thread67(utmp67); }
 }
 }
 }
 public static void thread29(final T29 utmpz) {final  int i = utmpz.i;
final  LevelData a_LD = utmpz.a_LD;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Wrapper X10_TEMP6 = ( Program . LevelData_get_m_u ( X10_TEMP0 , i ) ) ; final doubleRefArray3 X10_TEMP7 = X10_TEMP6 . m_array ; final doubleRefArray3 u = X10_TEMP7 ; final doubleRefArray3 temp = Program . LevelData_getArray ( a_LD , i ) ; final Region3 X10_TEMP13 = Program . LevelData_get_m_regions ( X10_TEMP0 , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = X10_TEMP13 . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( X10_TEMP13 , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = u . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array u" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( u , RX10_TEMP19 ) ; final double X10_TEMP17 = ( RX10_TEMP27 ) ; final Dist3 RX10_TEMP28 = temp . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( temp , RX10_TEMP30 ) ; final double X10_TEMP18 = ( RX10_TEMP38 ) ; final double X10_TEMP20 = ( X10_TEMP17 + X10_TEMP18 ) ; final double X10_TEMP21 = ( X10_TEMP20 ) ; final Dist3 RX10_TEMP39 = u . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array u" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( u , RX10_TEMP41 , X10_TEMP21 ) ; }
 }
 }
 public static void thread30(final T30 utmpz) {final  int i = utmpz.i;
final  int jj = utmpz.jj;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Region3 X10_TEMP12 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP18 = X10_TEMP12 . regSize ; final int RX10_TEMP19 = 0 ; boolean RX10_TEMP20 = i < RX10_TEMP19 ; boolean RX10_TEMP21 = i >= RX10_TEMP18 ; RX10_TEMP20 = RX10_TEMP20 || RX10_TEMP21 ; if ( RX10_TEMP20 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final Point3 RX10_TEMP23 = Program . regionOrdinalPoint3 ( X10_TEMP12 , i ) ; final int RX10_TEMP24 = RX10_TEMP23 . f0 ; final int dest0 = ( RX10_TEMP24 ) ; final Region3 X10_TEMP15 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP25 = X10_TEMP15 . regSize ; final int RX10_TEMP26 = 0 ; boolean RX10_TEMP27 = i < RX10_TEMP26 ; boolean RX10_TEMP28 = i >= RX10_TEMP25 ; RX10_TEMP27 = RX10_TEMP27 || RX10_TEMP28 ; if ( RX10_TEMP27 ) { String RX10_TEMP29 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 final Point3 RX10_TEMP30 = Program . regionOrdinalPoint3 ( X10_TEMP15 , i ) ; final int RX10_TEMP31 = RX10_TEMP30 . f1 ; final int dest1 = ( RX10_TEMP31 ) ; final Region3 X10_TEMP18 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP32 = X10_TEMP18 . regSize ; final int RX10_TEMP33 = 0 ; boolean RX10_TEMP34 = i < RX10_TEMP33 ; boolean RX10_TEMP35 = i >= RX10_TEMP32 ; RX10_TEMP34 = RX10_TEMP34 || RX10_TEMP35 ; if ( RX10_TEMP34 ) { String RX10_TEMP36 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Point3 RX10_TEMP37 = Program . regionOrdinalPoint3 ( X10_TEMP18 , i ) ; final int RX10_TEMP38 = RX10_TEMP37 . f2 ; final int dest2 = ( RX10_TEMP38 ) ; final int ii = ( i ) ; final Region1 X10_TEMP25 = Program . createNewRegion1R ( _LevelData_LOW , _LevelData_HIGH ) ; final int RX10_TEMP43 = 1 ; int RX10_TEMP41 = X10_TEMP25 . regSize ; RX10_TEMP41 = RX10_TEMP41 - RX10_TEMP43 ; final region ( : rank==1 ) RX10_TEMP42 = [ 0 : RX10_TEMP41 ] ; for ( point ( : rank==1 ) RX10_TEMP39 : RX10_TEMP42 ) { final int RX10_TEMP44 = RX10_TEMP39 [0] ; final Point1 RX10_TEMP40 = Program . regionOrdinalPoint1 ( X10_TEMP25 , RX10_TEMP44 ) ; final int p = RX10_TEMP40 . f0 ; int disp0 = ( 0 ) ; int disp1 = ( 0 ) ; int disp2 = ( 0 ) ; int source0 = ( 0 ) ; int source1 = ( 0 ) ; int source2 = ( 0 ) ; int trans0 = ( 0 ) ; int trans1 = ( 0 ) ; int trans2 = ( 0 ) ; int sourceID = ( 0 ) ; int k = ( 0 ) ; final boolean X10_TEMP38 = p == _LevelData_LOW ; if ( X10_TEMP38 ) { final int X10_TEMP39 = ( 2 ) ; final int X10_TEMP41 = ( jj * X10_TEMP39 ) ; k = ( X10_TEMP41 ) ; final int X10_TEMP42 = ( 0 ) ; final boolean X10_TEMP43 = jj == X10_TEMP42 ; int X10_TEMP46 = 0 ; if ( X10_TEMP43 ) { X10_TEMP46 = 1 ; }
 final int X10_TEMP47 = X10_TEMP46 ; final int X10_TEMP48 = ( X10_TEMP47 ) ; disp0 = ( X10_TEMP48 ) ; final int X10_TEMP50 = ( 1 ) ; final boolean X10_TEMP51 = jj == X10_TEMP50 ; int X10_TEMP54 = 0 ; if ( X10_TEMP51 ) { X10_TEMP54 = 1 ; }
 final int X10_TEMP55 = X10_TEMP54 ; final int X10_TEMP56 = ( X10_TEMP55 ) ; disp1 = ( X10_TEMP56 ) ; final int X10_TEMP58 = ( 2 ) ; final boolean X10_TEMP59 = jj == X10_TEMP58 ; int X10_TEMP62 = 0 ; if ( X10_TEMP59 ) { X10_TEMP62 = 1 ; }
 final int X10_TEMP63 = X10_TEMP62 ; final int X10_TEMP64 = ( X10_TEMP63 ) ; disp2 = ( X10_TEMP64 ) ; }
 else { final int X10_TEMP66 = ( 2 ) ; final int X10_TEMP67 = ( jj * X10_TEMP66 ) ; final int X10_TEMP68 = ( 1 ) ; final int X10_TEMP70 = ( X10_TEMP67 + X10_TEMP68 ) ; k = ( X10_TEMP70 ) ; final int X10_TEMP71 = ( 0 ) ; final boolean X10_TEMP72 = jj == X10_TEMP71 ; final int X10_TEMP73 = ( 1 ) ; final int X10_TEMP74 = 0 ; int X10_TEMP77 = 0 ; if ( X10_TEMP72 ) { X10_TEMP77 = X10_TEMP74 - X10_TEMP73 ; }
 final int X10_TEMP78 = X10_TEMP77 ; final int X10_TEMP79 = ( X10_TEMP78 ) ; disp0 = ( X10_TEMP79 ) ; final int X10_TEMP81 = ( 1 ) ; final boolean X10_TEMP82 = jj == X10_TEMP81 ; final int X10_TEMP83 = ( 1 ) ; final int X10_TEMP84 = 0 ; int X10_TEMP87 = 0 ; if ( X10_TEMP82 ) { X10_TEMP87 = X10_TEMP84 - X10_TEMP83 ; }
 final int X10_TEMP88 = X10_TEMP87 ; final int X10_TEMP89 = ( X10_TEMP88 ) ; disp1 = ( X10_TEMP89 ) ; final int X10_TEMP91 = ( 2 ) ; final boolean X10_TEMP92 = jj == X10_TEMP91 ; final int X10_TEMP93 = ( 1 ) ; final int X10_TEMP94 = 0 ; int X10_TEMP97 = 0 ; if ( X10_TEMP92 ) { X10_TEMP97 = X10_TEMP94 - X10_TEMP93 ; }
 final int X10_TEMP98 = X10_TEMP97 ; final int X10_TEMP99 = ( X10_TEMP98 ) ; disp2 = ( X10_TEMP99 ) ; }
 final int X10_TEMP102 = ( dest0 - disp0 ) ; source0 = ( X10_TEMP102 ) ; final int X10_TEMP104 = ( dest1 - disp1 ) ; source1 = ( X10_TEMP104 ) ; final int X10_TEMP106 = ( dest2 - disp2 ) ; source2 = ( X10_TEMP106 ) ; final Region3 X10_TEMP107 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP45 = new Point3 ( source0 , source1 , source2 ) ; final boolean RX10_TEMP46 = Program . regionContainsPoint3 ( X10_TEMP107 , RX10_TEMP45 ) ; final boolean X10_TEMP112 = RX10_TEMP46 ; if ( X10_TEMP112 ) { final Region3 X10_TEMP113 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP47 = new Point3 ( source0 , source1 , source2 ) ; final int RX10_TEMP48 = Program . searchPointInRegion3 ( X10_TEMP113 , RX10_TEMP47 ) ; final int RX10_TEMP49 = 0 ; final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP51 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final int X10_TEMP118 = ( RX10_TEMP48 ) ; sourceID = ( X10_TEMP118 ) ; final WrapperRefArray1 X10_TEMP119 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP52 = new Point1 ( ii ) ; final Dist1 RX10_TEMP53 = X10_TEMP119 . distValue ; final Region1 RX10_TEMP54 = RX10_TEMP53 . dReg ; final int RX10_TEMP55 = Program . searchPointInRegion1 ( RX10_TEMP54 , RX10_TEMP52 ) ; final int RX10_TEMP56 = 0 ; final boolean RX10_TEMP57 = RX10_TEMP55 < RX10_TEMP56 ; if ( RX10_TEMP57 ) { String RX10_TEMP58 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP58 ) ; }
 final place RX10_TEMP59 = Program . getPlaceFromDist1 ( RX10_TEMP53 , RX10_TEMP55 ) ; final place RX10_TEMP61 = here ; final boolean RX10_TEMP62 = RX10_TEMP59 != RX10_TEMP61 ; if ( RX10_TEMP62 ) { String RX10_TEMP60 = "Bad place access for array X10_TEMP119" ; throw new RuntimeException ( RX10_TEMP60 ) ; }
 final Wrapper RX10_TEMP63 = Program . getRefArrayValue1Wrapper ( X10_TEMP119 , RX10_TEMP55 ) ; final Wrapper X10_TEMP121 = ( RX10_TEMP63 ) ; final doubleRefArray3 X10_TEMP122 = X10_TEMP121 . m_array ; final Region3 X10_TEMP126 = Program . LevelData_get_m_boundaries ( X10_TEMP0 , k , ii ) ; final WrapperRefArray1 X10_TEMP128 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP64 = new Point1 ( sourceID ) ; final Dist1 RX10_TEMP65 = X10_TEMP128 . distValue ; final Region1 RX10_TEMP66 = RX10_TEMP65 . dReg ; final int RX10_TEMP67 = Program . searchPointInRegion1 ( RX10_TEMP66 , RX10_TEMP64 ) ; final int RX10_TEMP68 = 0 ; final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68 ; if ( RX10_TEMP69 ) { String RX10_TEMP70 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 final place RX10_TEMP71 = Program . getPlaceFromDist1 ( RX10_TEMP65 , RX10_TEMP67 ) ; final place RX10_TEMP73 = here ; final boolean RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73 ; if ( RX10_TEMP74 ) { String RX10_TEMP72 = "Bad place access for array X10_TEMP128" ; throw new RuntimeException ( RX10_TEMP72 ) ; }
 final Wrapper RX10_TEMP75 = Program . getRefArrayValue1Wrapper ( X10_TEMP128 , RX10_TEMP67 ) ; final Wrapper X10_TEMP130 = ( RX10_TEMP75 ) ; final doubleRefArray3 X10_TEMP131 = X10_TEMP130 . m_array ; Program . Util_arraycopy3 ( X10_TEMP122 , X10_TEMP126 , X10_TEMP131 ) ; }
 else { final int X10_TEMP133 = ( 0 ) ; final boolean X10_TEMP135 = jj == X10_TEMP133 ; if ( X10_TEMP135 ) { final int X10_TEMP136 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP137 = ( 1 ) ; final int X10_TEMP139 = ( X10_TEMP136 - X10_TEMP137 ) ; final int X10_TEMP140 = ( disp0 * X10_TEMP139 ) ; final int X10_TEMP142 = ( dest0 + X10_TEMP140 ) ; source0 = ( X10_TEMP142 ) ; final int X10_TEMP143 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP144 = ( 1 ) ; final int X10_TEMP146 = ( X10_TEMP143 - X10_TEMP144 ) ; final int X10_TEMP147 = ( disp1 * X10_TEMP146 ) ; final int X10_TEMP149 = ( dest1 + X10_TEMP147 ) ; source1 = ( X10_TEMP149 ) ; final int X10_TEMP150 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP151 = ( 1 ) ; final int X10_TEMP153 = ( X10_TEMP150 - X10_TEMP151 ) ; final int X10_TEMP154 = ( disp2 * X10_TEMP153 ) ; final int X10_TEMP156 = ( dest2 + X10_TEMP154 ) ; source2 = ( X10_TEMP156 ) ; }
 else { final int X10_TEMP157 = ( 1 ) ; final boolean X10_TEMP159 = jj == X10_TEMP157 ; if ( X10_TEMP159 ) { final int X10_TEMP160 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP161 = ( 1 ) ; final int X10_TEMP163 = ( X10_TEMP160 - X10_TEMP161 ) ; final int X10_TEMP164 = ( disp0 * X10_TEMP163 ) ; final int X10_TEMP166 = ( dest0 + X10_TEMP164 ) ; source0 = ( X10_TEMP166 ) ; final int X10_TEMP167 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP168 = ( 1 ) ; final int X10_TEMP170 = ( X10_TEMP167 - X10_TEMP168 ) ; final int X10_TEMP171 = ( disp1 * X10_TEMP170 ) ; final int X10_TEMP173 = ( dest1 + X10_TEMP171 ) ; source1 = ( X10_TEMP173 ) ; final int X10_TEMP174 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP175 = ( 1 ) ; final int X10_TEMP177 = ( X10_TEMP174 - X10_TEMP175 ) ; final int X10_TEMP178 = ( disp2 * X10_TEMP177 ) ; final int X10_TEMP180 = ( dest2 + X10_TEMP178 ) ; source2 = ( X10_TEMP180 ) ; }
 else { final int X10_TEMP181 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP182 = ( 1 ) ; final int X10_TEMP184 = ( X10_TEMP181 - X10_TEMP182 ) ; final int X10_TEMP185 = ( disp0 * X10_TEMP184 ) ; final int X10_TEMP187 = ( dest0 + X10_TEMP185 ) ; source0 = ( X10_TEMP187 ) ; final int X10_TEMP188 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP189 = ( 1 ) ; final int X10_TEMP191 = ( X10_TEMP188 - X10_TEMP189 ) ; final int X10_TEMP192 = ( disp1 * X10_TEMP191 ) ; final int X10_TEMP194 = ( dest1 + X10_TEMP192 ) ; source1 = ( X10_TEMP194 ) ; final int X10_TEMP195 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP196 = ( 1 ) ; final int X10_TEMP198 = ( X10_TEMP195 - X10_TEMP196 ) ; final int X10_TEMP199 = ( disp2 * X10_TEMP198 ) ; final int X10_TEMP201 = ( dest2 + X10_TEMP199 ) ; source2 = ( X10_TEMP201 ) ; }
 }
 final Region3 X10_TEMP202 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP76 = new Point3 ( source0 , source1 , source2 ) ; final int RX10_TEMP77 = Program . searchPointInRegion3 ( X10_TEMP202 , RX10_TEMP76 ) ; final int RX10_TEMP78 = 0 ; final boolean RX10_TEMP79 = RX10_TEMP77 < RX10_TEMP78 ; if ( RX10_TEMP79 ) { String RX10_TEMP80 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final int X10_TEMP207 = ( RX10_TEMP77 ) ; sourceID = ( X10_TEMP207 ) ; final int X10_TEMP208 = ( 0 ) ; final boolean X10_TEMP210 = jj == X10_TEMP208 ; if ( X10_TEMP210 ) { final int X10_TEMP211 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP213 = ( disp0 * X10_TEMP211 ) ; trans0 = ( X10_TEMP213 ) ; final int X10_TEMP214 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP216 = ( disp1 * X10_TEMP214 ) ; trans1 = ( X10_TEMP216 ) ; final int X10_TEMP217 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP219 = ( disp2 * X10_TEMP217 ) ; trans2 = ( X10_TEMP219 ) ; }
 else { final int X10_TEMP220 = ( 1 ) ; final boolean X10_TEMP222 = jj == X10_TEMP220 ; if ( X10_TEMP222 ) { final int X10_TEMP223 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP225 = ( disp0 * X10_TEMP223 ) ; trans0 = ( X10_TEMP225 ) ; final int X10_TEMP226 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP228 = ( disp1 * X10_TEMP226 ) ; trans1 = ( X10_TEMP228 ) ; final int X10_TEMP229 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP231 = ( disp2 * X10_TEMP229 ) ; trans2 = ( X10_TEMP231 ) ; }
 else { final int X10_TEMP232 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP234 = ( disp0 * X10_TEMP232 ) ; trans0 = ( X10_TEMP234 ) ; final int X10_TEMP235 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP237 = ( disp1 * X10_TEMP235 ) ; trans1 = ( X10_TEMP237 ) ; final int X10_TEMP238 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP240 = ( disp2 * X10_TEMP238 ) ; trans2 = ( X10_TEMP240 ) ; }
 }
 final WrapperRefArray1 X10_TEMP241 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP81 = new Point1 ( ii ) ; final Dist1 RX10_TEMP82 = X10_TEMP241 . distValue ; final Region1 RX10_TEMP83 = RX10_TEMP82 . dReg ; final int RX10_TEMP84 = Program . searchPointInRegion1 ( RX10_TEMP83 , RX10_TEMP81 ) ; final int RX10_TEMP85 = 0 ; final boolean RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85 ; if ( RX10_TEMP86 ) { String RX10_TEMP87 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP87 ) ; }
 final place RX10_TEMP88 = Program . getPlaceFromDist1 ( RX10_TEMP82 , RX10_TEMP84 ) ; final place RX10_TEMP90 = here ; final boolean RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP89 = "Bad place access for array X10_TEMP241" ; throw new RuntimeException ( RX10_TEMP89 ) ; }
 final Wrapper RX10_TEMP92 = Program . getRefArrayValue1Wrapper ( X10_TEMP241 , RX10_TEMP84 ) ; final Wrapper X10_TEMP243 = ( RX10_TEMP92 ) ; final doubleRefArray3 X10_TEMP244 = X10_TEMP243 . m_array ; final Region3RefArray2 X10_TEMP246 = X10_TEMP0 . m_boundaries ; final Point2 RX10_TEMP93 = new Point2 ( k , ii ) ; final Dist2 RX10_TEMP94 = X10_TEMP246 . distValue ; final Region2 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion2 ( RX10_TEMP95 , RX10_TEMP93 ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist2 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array X10_TEMP246" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 final Region3 RX10_TEMP104 = Program . getRefArrayValue2Region3 ( X10_TEMP246 , RX10_TEMP96 ) ; final Region3 X10_TEMP249 = RX10_TEMP104 ; final WrapperRefArray1 X10_TEMP251 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP105 = new Point1 ( sourceID ) ; final Dist1 RX10_TEMP106 = X10_TEMP251 . distValue ; final Region1 RX10_TEMP107 = RX10_TEMP106 . dReg ; final int RX10_TEMP108 = Program . searchPointInRegion1 ( RX10_TEMP107 , RX10_TEMP105 ) ; final int RX10_TEMP109 = 0 ; final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109 ; if ( RX10_TEMP110 ) { String RX10_TEMP111 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP111 ) ; }
 final place RX10_TEMP112 = Program . getPlaceFromDist1 ( RX10_TEMP106 , RX10_TEMP108 ) ; final place RX10_TEMP114 = here ; final boolean RX10_TEMP115 = RX10_TEMP112 != RX10_TEMP114 ; if ( RX10_TEMP115 ) { String RX10_TEMP113 = "Bad place access for array X10_TEMP251" ; throw new RuntimeException ( RX10_TEMP113 ) ; }
 final Wrapper RX10_TEMP116 = Program . getRefArrayValue1Wrapper ( X10_TEMP251 , RX10_TEMP108 ) ; final Wrapper X10_TEMP253 = ( RX10_TEMP116 ) ; final doubleRefArray3 X10_TEMP254 = X10_TEMP253 . m_array ; Program . Util_arraycopy4 ( X10_TEMP244 , X10_TEMP249 , X10_TEMP254 , trans0 , trans1 , trans2 ) ; }
 }
 }
 }
 public static void thread31(final T31 utmpz) {final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final int X10_TEMP5 = ( 0 ) ; final int X10_TEMP6 = ( 2 ) ; final Region1 X10_TEMP8 = Program . createNewRegion1R ( X10_TEMP5 , X10_TEMP6 ) ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = X10_TEMP8 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 RX10_TEMP1 = Program . regionOrdinalPoint1 ( X10_TEMP8 , RX10_TEMP5 ) ; final int j = RX10_TEMP1 . f0 ; finish { final Dist1 X10_TEMP10 = X10_TEMP0 . m_places ; final Region1 RX10_TEMP7 = X10_TEMP10 . dReg ; final int RX10_TEMP10 = 1 ; int RX10_TEMP8 = RX10_TEMP7 . regSize ; RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10 ; final region ( : rank==1 ) RX10_TEMP9 = [ 0 : RX10_TEMP8 ] ; for ( point ( : rank==1 ) RX10_TEMP6 : RX10_TEMP9 ) { final int RX10_TEMP11 = RX10_TEMP6 [0] ; final Point1 X10_TEMP11 = Program . regionOrdinalPoint1 ( RX10_TEMP7 , RX10_TEMP11 ) ; final int i = X10_TEMP11 . f0 ; final Region1 RX10_TEMP12 = X10_TEMP10 . dReg ; final int RX10_TEMP13 = Program . searchPointInRegion1 ( RX10_TEMP12 , X10_TEMP11 ) ; final int RX10_TEMP14 = 0 ; final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14 ; if ( RX10_TEMP15 ) { final String RX10_TEMP16 = "Point X10_TEMP11 not found in the distribution X10_TEMP10." ; throw new RuntimeException ( RX10_TEMP16 ) ; }
 final place RX10_TEMP17 = Program . getPlaceFromDist1 ( X10_TEMP10 , RX10_TEMP13 ) ; final place X10_TEMP12 = RX10_TEMP17 ; 
 final T68 utmp68 = new T68(i, j, X10_TEMP0);
 async (X10_TEMP12) {Program.thread68(utmp68); }
 }
 }
 }
 }
 }
 public static void thread32(final T32 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Region3 [ : rank==1 ] RX10_TEMP14 = ( Region3 [ : rank==1 ] ) ( new Region3 [ RX10_TEMP13 ] ) ; final Region3Stub RX10_TEMP15 = new Region3Stub ( RX10_TEMP14 ) ; 
 final T69 utmp69 = new T69(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread69(utmp69); }
 }
 }
 public static void thread33(final T33 utmpz) {final  Region3RefArray1 aRecv = utmpz.aRecv;
final  place h = utmpz.h;
final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Region3RefArray1 X10_TEMP18 = X10_TEMP0 . m_regions ; final Point1 RX10_TEMP28 = new Point1 ( i ) ; final Dist1 RX10_TEMP29 = X10_TEMP18 . distValue ; final Region1 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion1 ( RX10_TEMP30 , RX10_TEMP28 ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist1 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array X10_TEMP18" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Region3 RX10_TEMP39 = Program . getRefArrayValue1Region3 ( X10_TEMP18 , RX10_TEMP31 ) ; final Region3 X10_TEMP20 = RX10_TEMP39 ; final Region3 temp3 = X10_TEMP20 ; 
 final T70 utmp70 = new T70(temp3, aRecv);
 async (h) {Program.thread70(utmp70); }
 }
 }
 public static void thread34(final T34 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Region3 [ : rank==1 ] RX10_TEMP14 = ( Region3 [ : rank==1 ] ) ( new Region3 [ RX10_TEMP13 ] ) ; final Region3Stub RX10_TEMP15 = new Region3Stub ( RX10_TEMP14 ) ; 
 final T71 utmp71 = new T71(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread71(utmp71); }
 }
 }
 public static void thread35(final T35 utmpz) {final  Region3RefArray1 aRecv = utmpz.aRecv;
final  place h = utmpz.h;
final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Region3RefArray1 X10_TEMP18 = X10_TEMP0 . m_REGIONs ; final Point1 RX10_TEMP28 = new Point1 ( i ) ; final Dist1 RX10_TEMP29 = X10_TEMP18 . distValue ; final Region1 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion1 ( RX10_TEMP30 , RX10_TEMP28 ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist1 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array X10_TEMP18" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Region3 RX10_TEMP39 = Program . getRefArrayValue1Region3 ( X10_TEMP18 , RX10_TEMP31 ) ; final Region3 X10_TEMP20 = RX10_TEMP39 ; final Region3 temp3 = X10_TEMP20 ; 
 final T72 utmp72 = new T72(temp3, aRecv);
 async (h) {Program.thread72(utmp72); }
 }
 }
 public static void thread36(final T36 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Region3 [ : rank==1 ] RX10_TEMP14 = ( Region3 [ : rank==1 ] ) ( new Region3 [ RX10_TEMP13 ] ) ; final Region3Stub RX10_TEMP15 = new Region3Stub ( RX10_TEMP14 ) ; 
 final T73 utmp73 = new T73(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread73(utmp73); }
 }
 }
 public static void thread37(final T37 utmpz) {final  Region3RefArray1 aRecv = utmpz.aRecv;
final  place h = utmpz.h;
final  int j = utmpz.j;
final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final Region3RefArray2 X10_TEMP19 = X10_TEMP0 . m_boundaries ; final Point2 RX10_TEMP28 = new Point2 ( i , j ) ; final Dist2 RX10_TEMP29 = X10_TEMP19 . distValue ; final Region2 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion2 ( RX10_TEMP30 , RX10_TEMP28 ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist2 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array X10_TEMP19" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Region3 RX10_TEMP39 = Program . getRefArrayValue2Region3 ( X10_TEMP19 , RX10_TEMP31 ) ; final Region3 X10_TEMP22 = RX10_TEMP39 ; final Region3 temp4 = X10_TEMP22 ; 
 final T74 utmp74 = new T74(temp4, aRecv);
 async (h) {Program.thread74(utmp74); }
 }
 }
 public static void thread38(final T38 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  WrapperStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Wrapper [ : rank==1 ] RX10_TEMP14 = ( Wrapper [ : rank==1 ] ) ( new Wrapper [ RX10_TEMP13 ] ) ; final WrapperStub RX10_TEMP15 = new WrapperStub ( RX10_TEMP14 ) ; 
 final T75 utmp75 = new T75(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread75(utmp75); }
 }
 }
 public static void thread39(final T39 utmpz) {final  WrapperRefArray1 aRecv = utmpz.aRecv;
final  place h = utmpz.h;
final  int i = utmpz.i;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final WrapperRefArray1 X10_TEMP18 = X10_TEMP0 . m_u ; final Point1 RX10_TEMP28 = new Point1 ( i ) ; final Dist1 RX10_TEMP29 = X10_TEMP18 . distValue ; final Region1 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion1 ( RX10_TEMP30 , RX10_TEMP28 ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist1 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array X10_TEMP18" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Wrapper RX10_TEMP39 = Program . getRefArrayValue1Wrapper ( X10_TEMP18 , RX10_TEMP31 ) ; final Wrapper temp4 = ( RX10_TEMP39 ) ; 
 final T76 utmp76 = new T76(temp4, aRecv);
 async (h) {Program.thread76(utmp76); }
 }
 }
 public static void thread40(final T40 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
final  double initVal = utmpz.initVal;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { return initVal ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T77 utmp77 = new T77(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread77(utmp77); }
 }
 }
 public static void thread41(final T41 utmpz) {final  doubleRefArray1 localSumArray = utmpz.localSumArray;
final  place source = utmpz.source;
final  int zero = utmpz.zero;
final  doubleRefArray1 sumArray = utmpz.sumArray;
 { double localSumTemp = 0 ; final place thisPlace = here ; final Dist1 RX10_TEMP33 = sumArray . distValue ; final Dist1 sumArrayDist = RX10_TEMP33 ; final Dist1 sumArrayDistHere = Program . restrictDist1 ( sumArrayDist , thisPlace ) ; final Region1 RX10_TEMP35 = sumArrayDistHere . dReg ; final int RX10_TEMP38 = 1 ; int RX10_TEMP36 = RX10_TEMP35 . regSize ; RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; final region ( : rank==1 ) RX10_TEMP37 = [ 0 : RX10_TEMP36 ] ; for ( point ( : rank==1 ) RX10_TEMP34 : RX10_TEMP37 ) { final int RX10_TEMP39 = RX10_TEMP34 [0] ; final Point1 pt = Program . regionOrdinalPoint1 ( RX10_TEMP35 , RX10_TEMP39 ) ; final Dist1 RX10_TEMP40 = sumArray . distValue ; final Region1 RX10_TEMP41 = RX10_TEMP40 . dReg ; final int RX10_TEMP42 = Program . searchPointInRegion1 ( RX10_TEMP41 , pt ) ; final int RX10_TEMP43 = 0 ; final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43 ; if ( RX10_TEMP44 ) { String RX10_TEMP45 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP45 ) ; }
 final place RX10_TEMP46 = Program . getPlaceFromDist1 ( RX10_TEMP40 , RX10_TEMP42 ) ; final place RX10_TEMP48 = here ; final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP47 = "Bad place access for array sumArray" ; throw new RuntimeException ( RX10_TEMP47 ) ; }
 final double RX10_TEMP50 = Program . getRefArrayValue1double ( sumArray , RX10_TEMP42 ) ; final double localSumCurr = RX10_TEMP50 ; localSumTemp = localSumTemp + localSumCurr ; }
 final boolean isNotEqual = localSumTemp != zero ; if ( isNotEqual ) { final int index = thisPlace . id ; final double localSum = localSumTemp ; 
 final T78 utmp78 = new T78(localSum, index, localSumArray);
 async (source) {Program.thread78(utmp78); }
 }
 }
 }
 public static void thread53(final T53 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg1 = Program . LevelData_getArray ( a_arg1 , i ) ; final doubleRefArray3 arg2 = Program . LevelData_getArray ( a_arg2 , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg2 . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg2" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg2 , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg2 ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg2 ) ) ; final Dist3 RX10_TEMP28 = arg1 . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array arg1" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( arg1 , RX10_TEMP30 ) ; final double X10_TEMP26 = ( RX10_TEMP38 ) ; final double X10_TEMP27 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP28 = ( X10_TEMP26 - X10_TEMP27 ) ; final double X10_TEMP29 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP30 = ( X10_TEMP28 - X10_TEMP29 ) ; final double X10_TEMP31 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP33 = ( X10_TEMP30 - X10_TEMP31 ) ; final double X10_TEMP34 = ( X10_TEMP33 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP34 ) ; }
 }
 }
 public static void thread54(final T54 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg2 = utmpz.a_arg2;
final  LevelData a_arg1 = utmpz.a_arg1;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg1 = Program . LevelData_getArray ( a_arg1 , i ) ; final doubleRefArray3 arg2 = Program . LevelData_getArray ( a_arg2 , i ) ; final Region3 X10_TEMP47 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP48 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP49 = 0 ; final int X10_TEMP50 = 1 ; final int X10_TEMP51 = X10_TEMP49 - X10_TEMP50 ; final place X10_TEMP52 = here ; Region3 X10_TEMP53 = Program . createNewRegion3RRR ( X10_TEMP49 , X10_TEMP51 , X10_TEMP49 , X10_TEMP51 , X10_TEMP49 , X10_TEMP51 ) ; final int RX10_TEMP64 = 1 ; int RX10_TEMP62 = X10_TEMP47 . regSize ; RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64 ; final region ( : rank==1 ) RX10_TEMP63 = [ 0 : RX10_TEMP62 ] ; for ( point ( : rank==1 ) RX10_TEMP61 : RX10_TEMP63 ) { final int RX10_TEMP65 = RX10_TEMP61 [0] ; final Point3 X10_TEMP54 = Program . regionOrdinalPoint3 ( X10_TEMP47 , RX10_TEMP65 ) ; final int X10_TEMP55 = X10_TEMP54 . f0 ; final int X10_TEMP56 = X10_TEMP54 . f1 ; final int X10_TEMP57 = X10_TEMP54 . f2 ; final boolean RX10_TEMP66 = Program . regionContainsPoint3 ( X10_TEMP48 , X10_TEMP54 ) ; boolean X10_TEMP58 = RX10_TEMP66 ; X10_TEMP58 = ! X10_TEMP58 ; if ( X10_TEMP58 ) { final Region3 X10_TEMP59 = Program . createNewRegion3RRR ( X10_TEMP55 , X10_TEMP55 , X10_TEMP56 , X10_TEMP56 , X10_TEMP57 , X10_TEMP57 ) ; X10_TEMP53 = Program . unionRegion3 ( X10_TEMP53 , X10_TEMP59 ) ; }
 }
 final Region3 X10_TEMP60 = X10_TEMP53 ; Region3 R = X10_TEMP60 ; final int RX10_TEMP70 = 1 ; int RX10_TEMP68 = R . regSize ; RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70 ; final region ( : rank==1 ) RX10_TEMP69 = [ 0 : RX10_TEMP68 ] ; for ( point ( : rank==1 ) RX10_TEMP67 : RX10_TEMP69 ) { final int RX10_TEMP71 = RX10_TEMP67 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP71 ) ; final Dist3 RX10_TEMP72 = arg2 . distValue ; final Region3 RX10_TEMP73 = RX10_TEMP72 . dReg ; final int RX10_TEMP74 = Program . searchPointInRegion3 ( RX10_TEMP73 , p ) ; final int RX10_TEMP75 = 0 ; final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75 ; if ( RX10_TEMP76 ) { String RX10_TEMP77 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP77 ) ; }
 final place RX10_TEMP78 = Program . getPlaceFromDist3 ( RX10_TEMP72 , RX10_TEMP74 ) ; final place RX10_TEMP80 = here ; final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80 ; if ( RX10_TEMP81 ) { String RX10_TEMP79 = "Bad place access for array arg2" ; throw new RuntimeException ( RX10_TEMP79 ) ; }
 final double RX10_TEMP82 = Program . getRefArrayValue3double ( arg2 , RX10_TEMP74 ) ; double d0 = ( RX10_TEMP82 ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg2 ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg2 ) ) ; final Dist3 RX10_TEMP83 = arg1 . distValue ; final Region3 RX10_TEMP84 = RX10_TEMP83 . dReg ; final int RX10_TEMP85 = Program . searchPointInRegion3 ( RX10_TEMP84 , p ) ; final int RX10_TEMP86 = 0 ; final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86 ; if ( RX10_TEMP87 ) { String RX10_TEMP88 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP88 ) ; }
 final place RX10_TEMP89 = Program . getPlaceFromDist3 ( RX10_TEMP83 , RX10_TEMP85 ) ; final place RX10_TEMP91 = here ; final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP90 = "Bad place access for array arg1" ; throw new RuntimeException ( RX10_TEMP90 ) ; }
 final double RX10_TEMP93 = Program . getRefArrayValue3double ( arg1 , RX10_TEMP85 ) ; final double X10_TEMP73 = ( RX10_TEMP93 ) ; final double X10_TEMP74 = ( _MGOP_Ac0 * d0 ) ; final double X10_TEMP75 = ( X10_TEMP73 - X10_TEMP74 ) ; final double X10_TEMP76 = ( _MGOP_Ac2 * d2 ) ; final double X10_TEMP77 = ( X10_TEMP75 - X10_TEMP76 ) ; final double X10_TEMP78 = ( _MGOP_Ac3 * d3 ) ; final double X10_TEMP80 = ( X10_TEMP77 - X10_TEMP78 ) ; final double X10_TEMP81 = ( X10_TEMP80 ) ; final Dist3 RX10_TEMP94 = res . distValue ; final Region3 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion3 ( RX10_TEMP95 , p ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist3 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP96 , X10_TEMP81 ) ; }
 }
 }
 public static void thread55(final T55 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final Dist3 RX10_TEMP17 = arg . distValue ; final Region3 RX10_TEMP18 = RX10_TEMP17 . dReg ; final int RX10_TEMP19 = Program . searchPointInRegion3 ( RX10_TEMP18 , p ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final place RX10_TEMP23 = Program . getPlaceFromDist3 ( RX10_TEMP17 , RX10_TEMP19 ) ; final place RX10_TEMP25 = here ; final boolean RX10_TEMP26 = RX10_TEMP23 != RX10_TEMP25 ; if ( RX10_TEMP26 ) { String RX10_TEMP24 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP24 ) ; }
 final double RX10_TEMP27 = Program . getRefArrayValue3double ( arg , RX10_TEMP19 ) ; double d0 = ( RX10_TEMP27 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; final Dist3 RX10_TEMP28 = res . distValue ; final Region3 RX10_TEMP29 = RX10_TEMP28 . dReg ; final int RX10_TEMP30 = Program . searchPointInRegion3 ( RX10_TEMP29 , p ) ; final int RX10_TEMP31 = 0 ; final boolean RX10_TEMP32 = RX10_TEMP30 < RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP33 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP33 ) ; }
 final place RX10_TEMP34 = Program . getPlaceFromDist3 ( RX10_TEMP28 , RX10_TEMP30 ) ; final place RX10_TEMP36 = here ; final boolean RX10_TEMP37 = RX10_TEMP34 != RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP35 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP35 ) ; }
 final double RX10_TEMP38 = Program . getRefArrayValue3double ( res , RX10_TEMP30 ) ; final double X10_TEMP24 = ( RX10_TEMP38 ) ; final double X10_TEMP25 = ( _MGOP_Sac0 * d0 ) ; final double X10_TEMP26 = ( X10_TEMP24 + X10_TEMP25 ) ; final double X10_TEMP27 = ( _MGOP_Sac1 * d1 ) ; final double X10_TEMP28 = ( X10_TEMP26 + X10_TEMP27 ) ; final double X10_TEMP29 = ( _MGOP_Sac2 * d2 ) ; final double X10_TEMP31 = ( X10_TEMP28 + X10_TEMP29 ) ; final double X10_TEMP32 = ( X10_TEMP31 ) ; final Dist3 RX10_TEMP39 = res . distValue ; final Region3 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion3 ( RX10_TEMP40 , p ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist3 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP41 , X10_TEMP32 ) ; }
 }
 }
 public static void thread56(final T56 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final Region3 X10_TEMP43 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP44 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP45 = 0 ; final int X10_TEMP46 = 1 ; final int X10_TEMP47 = X10_TEMP45 - X10_TEMP46 ; final place X10_TEMP48 = here ; Region3 X10_TEMP49 = Program . createNewRegion3RRR ( X10_TEMP45 , X10_TEMP47 , X10_TEMP45 , X10_TEMP47 , X10_TEMP45 , X10_TEMP47 ) ; final int RX10_TEMP64 = 1 ; int RX10_TEMP62 = X10_TEMP43 . regSize ; RX10_TEMP62 = RX10_TEMP62 - RX10_TEMP64 ; final region ( : rank==1 ) RX10_TEMP63 = [ 0 : RX10_TEMP62 ] ; for ( point ( : rank==1 ) RX10_TEMP61 : RX10_TEMP63 ) { final int RX10_TEMP65 = RX10_TEMP61 [0] ; final Point3 X10_TEMP50 = Program . regionOrdinalPoint3 ( X10_TEMP43 , RX10_TEMP65 ) ; final int X10_TEMP51 = X10_TEMP50 . f0 ; final int X10_TEMP52 = X10_TEMP50 . f1 ; final int X10_TEMP53 = X10_TEMP50 . f2 ; final boolean RX10_TEMP66 = Program . regionContainsPoint3 ( X10_TEMP44 , X10_TEMP50 ) ; boolean X10_TEMP54 = RX10_TEMP66 ; X10_TEMP54 = ! X10_TEMP54 ; if ( X10_TEMP54 ) { final Region3 X10_TEMP55 = Program . createNewRegion3RRR ( X10_TEMP51 , X10_TEMP51 , X10_TEMP52 , X10_TEMP52 , X10_TEMP53 , X10_TEMP53 ) ; X10_TEMP49 = Program . unionRegion3 ( X10_TEMP49 , X10_TEMP55 ) ; }
 }
 final Region3 X10_TEMP56 = X10_TEMP49 ; Region3 R = X10_TEMP56 ; final int RX10_TEMP70 = 1 ; int RX10_TEMP68 = R . regSize ; RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70 ; final region ( : rank==1 ) RX10_TEMP69 = [ 0 : RX10_TEMP68 ] ; for ( point ( : rank==1 ) RX10_TEMP67 : RX10_TEMP69 ) { final int RX10_TEMP71 = RX10_TEMP67 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP71 ) ; final Dist3 RX10_TEMP72 = arg . distValue ; final Region3 RX10_TEMP73 = RX10_TEMP72 . dReg ; final int RX10_TEMP74 = Program . searchPointInRegion3 ( RX10_TEMP73 , p ) ; final int RX10_TEMP75 = 0 ; final boolean RX10_TEMP76 = RX10_TEMP74 < RX10_TEMP75 ; if ( RX10_TEMP76 ) { String RX10_TEMP77 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP77 ) ; }
 final place RX10_TEMP78 = Program . getPlaceFromDist3 ( RX10_TEMP72 , RX10_TEMP74 ) ; final place RX10_TEMP80 = here ; final boolean RX10_TEMP81 = RX10_TEMP78 != RX10_TEMP80 ; if ( RX10_TEMP81 ) { String RX10_TEMP79 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP79 ) ; }
 final double RX10_TEMP82 = Program . getRefArrayValue3double ( arg , RX10_TEMP74 ) ; double d0 = ( RX10_TEMP82 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; final Dist3 RX10_TEMP83 = res . distValue ; final Region3 RX10_TEMP84 = RX10_TEMP83 . dReg ; final int RX10_TEMP85 = Program . searchPointInRegion3 ( RX10_TEMP84 , p ) ; final int RX10_TEMP86 = 0 ; final boolean RX10_TEMP87 = RX10_TEMP85 < RX10_TEMP86 ; if ( RX10_TEMP87 ) { String RX10_TEMP88 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP88 ) ; }
 final place RX10_TEMP89 = Program . getPlaceFromDist3 ( RX10_TEMP83 , RX10_TEMP85 ) ; final place RX10_TEMP91 = here ; final boolean RX10_TEMP92 = RX10_TEMP89 != RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP90 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP90 ) ; }
 final double RX10_TEMP93 = Program . getRefArrayValue3double ( res , RX10_TEMP85 ) ; final double X10_TEMP69 = ( RX10_TEMP93 ) ; final double X10_TEMP70 = ( _MGOP_Sac0 * d0 ) ; final double X10_TEMP71 = ( X10_TEMP69 + X10_TEMP70 ) ; final double X10_TEMP72 = ( _MGOP_Sac1 * d1 ) ; final double X10_TEMP73 = ( X10_TEMP71 + X10_TEMP72 ) ; final double X10_TEMP74 = ( _MGOP_Sac2 * d2 ) ; final double X10_TEMP76 = ( X10_TEMP73 + X10_TEMP74 ) ; final double X10_TEMP77 = ( X10_TEMP76 ) ; final Dist3 RX10_TEMP94 = res . distValue ; final Region3 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion3 ( RX10_TEMP95 , p ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist3 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP96 , X10_TEMP77 ) ; }
 }
 }
 public static void thread57(final T57 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_res , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; final int X10_TEMP14 = ( 2 ) ; int RX10_TEMP17 = pp . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP14 ; int RX10_TEMP18 = pp . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP14 ; int RX10_TEMP19 = pp . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP14 ; final Point3 X10_TEMP18 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP19 = ( 1 ) ; int X10_TEMP20 = ( 1 ) ; int X10_TEMP21 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP18 . f0 ; int RX10_TEMP21 = X10_TEMP18 . f1 ; int RX10_TEMP22 = X10_TEMP18 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP19 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP20 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP21 ; Point3 p = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final Dist3 RX10_TEMP23 = arg . distValue ; final Region3 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion3 ( RX10_TEMP24 , p ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist3 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final double RX10_TEMP33 = Program . getRefArrayValue3double ( arg , RX10_TEMP25 ) ; double d0 = ( RX10_TEMP33 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final double X10_TEMP35 = ( _MGOP_Pc0 * d0 ) ; final double X10_TEMP36 = ( _MGOP_Pc1 * d1 ) ; final double X10_TEMP37 = ( X10_TEMP35 + X10_TEMP36 ) ; final double X10_TEMP38 = ( _MGOP_Pc2 * d2 ) ; final double X10_TEMP39 = ( X10_TEMP37 + X10_TEMP38 ) ; final double X10_TEMP40 = ( _MGOP_Pc3 * d3 ) ; final double X10_TEMP42 = ( X10_TEMP39 + X10_TEMP40 ) ; final double X10_TEMP43 = ( X10_TEMP42 ) ; final Dist3 RX10_TEMP34 = res . distValue ; final Region3 RX10_TEMP35 = RX10_TEMP34 . dReg ; final int RX10_TEMP36 = Program . searchPointInRegion3 ( RX10_TEMP35 , pp ) ; final int RX10_TEMP37 = 0 ; final boolean RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP39 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 final place RX10_TEMP40 = Program . getPlaceFromDist3 ( RX10_TEMP34 , RX10_TEMP36 ) ; final place RX10_TEMP42 = here ; final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP41 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP36 , X10_TEMP43 ) ; }
 }
 }
 public static void thread58(final T58 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final Region3 X10_TEMP54 = Program . LevelData_getInnerRegion ( a_res , i ) ; final Region3 X10_TEMP55 = Program . LevelData_getINNERRegion ( a_res , i ) ; final int X10_TEMP56 = 0 ; final int X10_TEMP57 = 1 ; final int X10_TEMP58 = X10_TEMP56 - X10_TEMP57 ; final place X10_TEMP59 = here ; Region3 X10_TEMP60 = Program . createNewRegion3RRR ( X10_TEMP56 , X10_TEMP58 , X10_TEMP56 , X10_TEMP58 , X10_TEMP56 , X10_TEMP58 ) ; final int RX10_TEMP59 = 1 ; int RX10_TEMP57 = X10_TEMP54 . regSize ; RX10_TEMP57 = RX10_TEMP57 - RX10_TEMP59 ; final region ( : rank==1 ) RX10_TEMP58 = [ 0 : RX10_TEMP57 ] ; for ( point ( : rank==1 ) RX10_TEMP56 : RX10_TEMP58 ) { final int RX10_TEMP60 = RX10_TEMP56 [0] ; final Point3 X10_TEMP61 = Program . regionOrdinalPoint3 ( X10_TEMP54 , RX10_TEMP60 ) ; final int X10_TEMP62 = X10_TEMP61 . f0 ; final int X10_TEMP63 = X10_TEMP61 . f1 ; final int X10_TEMP64 = X10_TEMP61 . f2 ; final boolean RX10_TEMP61 = Program . regionContainsPoint3 ( X10_TEMP55 , X10_TEMP61 ) ; boolean X10_TEMP65 = RX10_TEMP61 ; X10_TEMP65 = ! X10_TEMP65 ; if ( X10_TEMP65 ) { final Region3 X10_TEMP66 = Program . createNewRegion3RRR ( X10_TEMP62 , X10_TEMP62 , X10_TEMP63 , X10_TEMP63 , X10_TEMP64 , X10_TEMP64 ) ; X10_TEMP60 = Program . unionRegion3 ( X10_TEMP60 , X10_TEMP66 ) ; }
 }
 final Region3 X10_TEMP67 = X10_TEMP60 ; Region3 R = X10_TEMP67 ; final int RX10_TEMP65 = 1 ; int RX10_TEMP63 = R . regSize ; RX10_TEMP63 = RX10_TEMP63 - RX10_TEMP65 ; final region ( : rank==1 ) RX10_TEMP64 = [ 0 : RX10_TEMP63 ] ; for ( point ( : rank==1 ) RX10_TEMP62 : RX10_TEMP64 ) { final int RX10_TEMP66 = RX10_TEMP62 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( R , RX10_TEMP66 ) ; final int X10_TEMP70 = ( 2 ) ; int RX10_TEMP67 = pp . f0 ; RX10_TEMP67 = RX10_TEMP67 * X10_TEMP70 ; int RX10_TEMP68 = pp . f1 ; RX10_TEMP68 = RX10_TEMP68 * X10_TEMP70 ; int RX10_TEMP69 = pp . f2 ; RX10_TEMP69 = RX10_TEMP69 * X10_TEMP70 ; final Point3 X10_TEMP74 = ( new Point3 ( RX10_TEMP67 , RX10_TEMP68 , RX10_TEMP69 ) ) ; int X10_TEMP75 = ( 1 ) ; int X10_TEMP76 = ( 1 ) ; int X10_TEMP77 = ( 1 ) ; int RX10_TEMP70 = X10_TEMP74 . f0 ; int RX10_TEMP71 = X10_TEMP74 . f1 ; int RX10_TEMP72 = X10_TEMP74 . f2 ; RX10_TEMP70 = RX10_TEMP70 + X10_TEMP75 ; RX10_TEMP71 = RX10_TEMP71 + X10_TEMP76 ; RX10_TEMP72 = RX10_TEMP72 + X10_TEMP77 ; Point3 p = ( new Point3 ( RX10_TEMP70 , RX10_TEMP71 , RX10_TEMP72 ) ) ; final Dist3 RX10_TEMP73 = arg . distValue ; final Region3 RX10_TEMP74 = RX10_TEMP73 . dReg ; final int RX10_TEMP75 = Program . searchPointInRegion3 ( RX10_TEMP74 , p ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final place RX10_TEMP79 = Program . getPlaceFromDist3 ( RX10_TEMP73 , RX10_TEMP75 ) ; final place RX10_TEMP81 = here ; final boolean RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP80 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP80 ) ; }
 final double RX10_TEMP83 = Program . getRefArrayValue3double ( arg , RX10_TEMP75 ) ; double d0 = ( RX10_TEMP83 ) ; double d1 = ( Program . Util_sumDIFF1 ( p , arg ) ) ; double d2 = ( Program . Util_sumDIFF2 ( p , arg ) ) ; double d3 = ( Program . Util_sumDIFF3 ( p , arg ) ) ; final double X10_TEMP91 = ( _MGOP_Pc0 * d0 ) ; final double X10_TEMP92 = ( _MGOP_Pc1 * d1 ) ; final double X10_TEMP93 = ( X10_TEMP91 + X10_TEMP92 ) ; final double X10_TEMP94 = ( _MGOP_Pc2 * d2 ) ; final double X10_TEMP95 = ( X10_TEMP93 + X10_TEMP94 ) ; final double X10_TEMP96 = ( _MGOP_Pc3 * d3 ) ; final double X10_TEMP98 = ( X10_TEMP95 + X10_TEMP96 ) ; final double X10_TEMP99 = ( X10_TEMP98 ) ; final Dist3 RX10_TEMP84 = res . distValue ; final Region3 RX10_TEMP85 = RX10_TEMP84 . dReg ; final int RX10_TEMP86 = Program . searchPointInRegion3 ( RX10_TEMP85 , pp ) ; final int RX10_TEMP87 = 0 ; final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87 ; if ( RX10_TEMP88 ) { String RX10_TEMP89 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP89 ) ; }
 final place RX10_TEMP90 = Program . getPlaceFromDist3 ( RX10_TEMP84 , RX10_TEMP86 ) ; final place RX10_TEMP92 = here ; final boolean RX10_TEMP93 = RX10_TEMP90 != RX10_TEMP92 ; if ( RX10_TEMP93 ) { String RX10_TEMP91 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP91 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP86 , X10_TEMP99 ) ; }
 }
 }
 public static void thread59(final T59 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; Region3 R = Program . LevelData_getINNERRegion ( a_arg , i ) ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = R . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP12 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP12 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP16 ) ; double d = ( 0 ) ; final int X10_TEMP15 = ( 2 ) ; int RX10_TEMP17 = p . f0 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP15 ; int RX10_TEMP18 = p . f1 ; RX10_TEMP18 = RX10_TEMP18 * X10_TEMP15 ; int RX10_TEMP19 = p . f2 ; RX10_TEMP19 = RX10_TEMP19 * X10_TEMP15 ; final Point3 X10_TEMP19 = ( new Point3 ( RX10_TEMP17 , RX10_TEMP18 , RX10_TEMP19 ) ) ; int X10_TEMP20 = ( 1 ) ; int X10_TEMP21 = ( 1 ) ; int X10_TEMP22 = ( 1 ) ; int RX10_TEMP20 = X10_TEMP19 . f0 ; int RX10_TEMP21 = X10_TEMP19 . f1 ; int RX10_TEMP22 = X10_TEMP19 . f2 ; RX10_TEMP20 = RX10_TEMP20 + X10_TEMP20 ; RX10_TEMP21 = RX10_TEMP21 + X10_TEMP21 ; RX10_TEMP22 = RX10_TEMP22 + X10_TEMP22 ; Point3 pp = ( new Point3 ( RX10_TEMP20 , RX10_TEMP21 , RX10_TEMP22 ) ) ; final int RX10_TEMP26 = 1 ; int RX10_TEMP24 = _Util_UNIT_CUBE . regSize ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; for ( point ( : rank==1 ) RX10_TEMP23 : RX10_TEMP25 ) { final int RX10_TEMP27 = RX10_TEMP23 [0] ; final Point3 o = Program . regionOrdinalPoint3 ( _Util_UNIT_CUBE , RX10_TEMP27 ) ; final int i2 = o . f0 ; final int j2 = o . f1 ; final int k2 = o . f2 ; final double X10_TEMP26 = ( 0 ) ; d = ( X10_TEMP26 ) ; final Region3 RX10_TEMP28 = _Util_QREGIONS . regionValue ; final int RX10_TEMP29 = Program . searchPointInRegion3 ( RX10_TEMP28 , o ) ; final int RX10_TEMP30 = 0 ; final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; if ( RX10_TEMP31 ) { String RX10_TEMP32 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP33 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP29 = RX10_TEMP33 [ RX10_TEMP29 ] ; final int RX10_TEMP38 = 1 ; int RX10_TEMP36 = X10_TEMP29 . regSize ; RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; final region ( : rank==1 ) RX10_TEMP37 = [ 0 : RX10_TEMP36 ] ; for ( point ( : rank==1 ) RX10_TEMP34 : RX10_TEMP37 ) { final int RX10_TEMP39 = RX10_TEMP34 [0] ; final Point3 RX10_TEMP35 = Program . regionOrdinalPoint3 ( X10_TEMP29 , RX10_TEMP39 ) ; final int i1 = RX10_TEMP35 . f0 ; final int j1 = RX10_TEMP35 . f1 ; final int k1 = RX10_TEMP35 . f2 ; int RX10_TEMP40 = p . f0 ; int RX10_TEMP41 = p . f1 ; int RX10_TEMP42 = p . f2 ; RX10_TEMP40 = RX10_TEMP40 + i1 ; RX10_TEMP41 = RX10_TEMP41 + j1 ; RX10_TEMP42 = RX10_TEMP42 + k1 ; final Point3 temp = ( new Point3 ( RX10_TEMP40 , RX10_TEMP41 , RX10_TEMP42 ) ) ; final Dist3 RX10_TEMP43 = arg . distValue ; final Region3 RX10_TEMP44 = RX10_TEMP43 . dReg ; final int RX10_TEMP45 = Program . searchPointInRegion3 ( RX10_TEMP44 , temp ) ; final int RX10_TEMP46 = 0 ; final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; if ( RX10_TEMP47 ) { String RX10_TEMP48 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final place RX10_TEMP49 = Program . getPlaceFromDist3 ( RX10_TEMP43 , RX10_TEMP45 ) ; final place RX10_TEMP51 = here ; final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP50 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final double RX10_TEMP53 = Program . getRefArrayValue3double ( arg , RX10_TEMP45 ) ; final double X10_TEMP35 = ( RX10_TEMP53 ) ; final double X10_TEMP37 = ( d + X10_TEMP35 ) ; d = ( X10_TEMP37 ) ; }
 int RX10_TEMP54 = pp . f0 ; int RX10_TEMP55 = pp . f1 ; int RX10_TEMP56 = pp . f2 ; RX10_TEMP54 = RX10_TEMP54 + i2 ; RX10_TEMP55 = RX10_TEMP55 + j2 ; RX10_TEMP56 = RX10_TEMP56 + k2 ; final Point3 X10_TEMP42 = ( new Point3 ( RX10_TEMP54 , RX10_TEMP55 , RX10_TEMP56 ) ) ; final Region3 RX10_TEMP57 = _Util_QREGIONS . regionValue ; final int RX10_TEMP58 = Program . searchPointInRegion3 ( RX10_TEMP57 , o ) ; final int RX10_TEMP59 = 0 ; final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; if ( RX10_TEMP60 ) { String RX10_TEMP61 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP61 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP62 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP44 = RX10_TEMP62 [ RX10_TEMP58 ] ; final int X10_TEMP45 = ( X10_TEMP44 . regSize ) ; final double X10_TEMP47 = ( d / X10_TEMP45 ) ; final double X10_TEMP48 = ( X10_TEMP47 ) ; final Dist3 RX10_TEMP63 = res . distValue ; final Region3 RX10_TEMP64 = RX10_TEMP63 . dReg ; final int RX10_TEMP65 = Program . searchPointInRegion3 ( RX10_TEMP64 , X10_TEMP42 ) ; final int RX10_TEMP66 = 0 ; final boolean RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66 ; if ( RX10_TEMP67 ) { String RX10_TEMP68 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP68 ) ; }
 final place RX10_TEMP69 = Program . getPlaceFromDist3 ( RX10_TEMP63 , RX10_TEMP65 ) ; final place RX10_TEMP71 = here ; final boolean RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71 ; if ( RX10_TEMP72 ) { String RX10_TEMP70 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP65 , X10_TEMP48 ) ; }
 }
 }
 }
 public static void thread60(final T60 utmpz) {final  int i = utmpz.i;
final  LevelData a_arg = utmpz.a_arg;
final  LevelData a_res = utmpz.a_res;
 { final doubleRefArray3 arg = Program . LevelData_getArray ( a_arg , i ) ; final doubleRefArray3 res = Program . LevelData_getArray ( a_res , i ) ; final Region3 X10_TEMP59 = Program . LevelData_getShrinkedRegion ( a_arg , i ) ; final Region3 X10_TEMP60 = Program . LevelData_getINNERRegion ( a_arg , i ) ; final int X10_TEMP61 = 0 ; final int X10_TEMP62 = 1 ; final int X10_TEMP63 = X10_TEMP61 - X10_TEMP62 ; final place X10_TEMP64 = here ; Region3 X10_TEMP65 = Program . createNewRegion3RRR ( X10_TEMP61 , X10_TEMP63 , X10_TEMP61 , X10_TEMP63 , X10_TEMP61 , X10_TEMP63 ) ; final int RX10_TEMP88 = 1 ; int RX10_TEMP86 = X10_TEMP59 . regSize ; RX10_TEMP86 = RX10_TEMP86 - RX10_TEMP88 ; final region ( : rank==1 ) RX10_TEMP87 = [ 0 : RX10_TEMP86 ] ; for ( point ( : rank==1 ) RX10_TEMP85 : RX10_TEMP87 ) { final int RX10_TEMP89 = RX10_TEMP85 [0] ; final Point3 X10_TEMP66 = Program . regionOrdinalPoint3 ( X10_TEMP59 , RX10_TEMP89 ) ; final int X10_TEMP67 = X10_TEMP66 . f0 ; final int X10_TEMP68 = X10_TEMP66 . f1 ; final int X10_TEMP69 = X10_TEMP66 . f2 ; final boolean RX10_TEMP90 = Program . regionContainsPoint3 ( X10_TEMP60 , X10_TEMP66 ) ; boolean X10_TEMP70 = RX10_TEMP90 ; X10_TEMP70 = ! X10_TEMP70 ; if ( X10_TEMP70 ) { final Region3 X10_TEMP71 = Program . createNewRegion3RRR ( X10_TEMP67 , X10_TEMP67 , X10_TEMP68 , X10_TEMP68 , X10_TEMP69 , X10_TEMP69 ) ; X10_TEMP65 = Program . unionRegion3 ( X10_TEMP65 , X10_TEMP71 ) ; }
 }
 final Region3 X10_TEMP72 = X10_TEMP65 ; Region3 R = X10_TEMP72 ; final int RX10_TEMP94 = 1 ; int RX10_TEMP92 = R . regSize ; RX10_TEMP92 = RX10_TEMP92 - RX10_TEMP94 ; final region ( : rank==1 ) RX10_TEMP93 = [ 0 : RX10_TEMP92 ] ; for ( point ( : rank==1 ) RX10_TEMP91 : RX10_TEMP93 ) { final int RX10_TEMP95 = RX10_TEMP91 [0] ; final Point3 p = Program . regionOrdinalPoint3 ( R , RX10_TEMP95 ) ; double d = ( 0 ) ; final int X10_TEMP76 = ( 2 ) ; int RX10_TEMP96 = p . f0 ; RX10_TEMP96 = RX10_TEMP96 * X10_TEMP76 ; int RX10_TEMP97 = p . f1 ; RX10_TEMP97 = RX10_TEMP97 * X10_TEMP76 ; int RX10_TEMP98 = p . f2 ; RX10_TEMP98 = RX10_TEMP98 * X10_TEMP76 ; final Point3 X10_TEMP80 = ( new Point3 ( RX10_TEMP96 , RX10_TEMP97 , RX10_TEMP98 ) ) ; int X10_TEMP81 = ( 1 ) ; int X10_TEMP82 = ( 1 ) ; int X10_TEMP83 = ( 1 ) ; int RX10_TEMP99 = X10_TEMP80 . f0 ; int RX10_TEMP100 = X10_TEMP80 . f1 ; int RX10_TEMP101 = X10_TEMP80 . f2 ; RX10_TEMP99 = RX10_TEMP99 + X10_TEMP81 ; RX10_TEMP100 = RX10_TEMP100 + X10_TEMP82 ; RX10_TEMP101 = RX10_TEMP101 + X10_TEMP83 ; Point3 pp = ( new Point3 ( RX10_TEMP99 , RX10_TEMP100 , RX10_TEMP101 ) ) ; final int RX10_TEMP105 = 1 ; int RX10_TEMP103 = _Util_UNIT_CUBE . regSize ; RX10_TEMP103 = RX10_TEMP103 - RX10_TEMP105 ; final region ( : rank==1 ) RX10_TEMP104 = [ 0 : RX10_TEMP103 ] ; for ( point ( : rank==1 ) RX10_TEMP102 : RX10_TEMP104 ) { final int RX10_TEMP106 = RX10_TEMP102 [0] ; final Point3 o = Program . regionOrdinalPoint3 ( _Util_UNIT_CUBE , RX10_TEMP106 ) ; final int i2 = o . f0 ; final int j2 = o . f1 ; final int k2 = o . f2 ; final double X10_TEMP87 = ( 0 ) ; d = ( X10_TEMP87 ) ; final Region3 RX10_TEMP107 = _Util_QREGIONS . regionValue ; final int RX10_TEMP108 = Program . searchPointInRegion3 ( RX10_TEMP107 , o ) ; final int RX10_TEMP109 = 0 ; final boolean RX10_TEMP110 = RX10_TEMP108 < RX10_TEMP109 ; if ( RX10_TEMP110 ) { String RX10_TEMP111 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP111 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP112 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP90 = RX10_TEMP112 [ RX10_TEMP108 ] ; final int RX10_TEMP117 = 1 ; int RX10_TEMP115 = X10_TEMP90 . regSize ; RX10_TEMP115 = RX10_TEMP115 - RX10_TEMP117 ; final region ( : rank==1 ) RX10_TEMP116 = [ 0 : RX10_TEMP115 ] ; for ( point ( : rank==1 ) RX10_TEMP113 : RX10_TEMP116 ) { final int RX10_TEMP118 = RX10_TEMP113 [0] ; final Point3 RX10_TEMP114 = Program . regionOrdinalPoint3 ( X10_TEMP90 , RX10_TEMP118 ) ; final int i1 = RX10_TEMP114 . f0 ; final int j1 = RX10_TEMP114 . f1 ; final int k1 = RX10_TEMP114 . f2 ; int RX10_TEMP119 = p . f0 ; int RX10_TEMP120 = p . f1 ; int RX10_TEMP121 = p . f2 ; RX10_TEMP119 = RX10_TEMP119 + i1 ; RX10_TEMP120 = RX10_TEMP120 + j1 ; RX10_TEMP121 = RX10_TEMP121 + k1 ; final Point3 temp = ( new Point3 ( RX10_TEMP119 , RX10_TEMP120 , RX10_TEMP121 ) ) ; final Dist3 RX10_TEMP122 = arg . distValue ; final Region3 RX10_TEMP123 = RX10_TEMP122 . dReg ; final int RX10_TEMP124 = Program . searchPointInRegion3 ( RX10_TEMP123 , temp ) ; final int RX10_TEMP125 = 0 ; final boolean RX10_TEMP126 = RX10_TEMP124 < RX10_TEMP125 ; if ( RX10_TEMP126 ) { String RX10_TEMP127 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP127 ) ; }
 final place RX10_TEMP128 = Program . getPlaceFromDist3 ( RX10_TEMP122 , RX10_TEMP124 ) ; final place RX10_TEMP130 = here ; final boolean RX10_TEMP131 = RX10_TEMP128 != RX10_TEMP130 ; if ( RX10_TEMP131 ) { String RX10_TEMP129 = "Bad place access for array arg" ; throw new RuntimeException ( RX10_TEMP129 ) ; }
 final double RX10_TEMP132 = Program . getRefArrayValue3double ( arg , RX10_TEMP124 ) ; final double X10_TEMP96 = ( RX10_TEMP132 ) ; final double X10_TEMP98 = ( d + X10_TEMP96 ) ; d = ( X10_TEMP98 ) ; }
 int RX10_TEMP133 = pp . f0 ; int RX10_TEMP134 = pp . f1 ; int RX10_TEMP135 = pp . f2 ; RX10_TEMP133 = RX10_TEMP133 + i2 ; RX10_TEMP134 = RX10_TEMP134 + j2 ; RX10_TEMP135 = RX10_TEMP135 + k2 ; final Point3 X10_TEMP103 = ( new Point3 ( RX10_TEMP133 , RX10_TEMP134 , RX10_TEMP135 ) ) ; final Region3 RX10_TEMP136 = _Util_QREGIONS . regionValue ; final int RX10_TEMP137 = Program . searchPointInRegion3 ( RX10_TEMP136 , o ) ; final int RX10_TEMP138 = 0 ; final boolean RX10_TEMP139 = RX10_TEMP137 < RX10_TEMP138 ; if ( RX10_TEMP139 ) { String RX10_TEMP140 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP140 ) ; }
 final Region3 value [ : rank==1 ] RX10_TEMP141 = ( Region3 value [ : rank==1 ] ) ( _Util_QREGIONS . contents ) ; final Region3 X10_TEMP105 = RX10_TEMP141 [ RX10_TEMP137 ] ; final int X10_TEMP106 = ( X10_TEMP105 . regSize ) ; final double X10_TEMP108 = ( d / X10_TEMP106 ) ; final double X10_TEMP109 = ( X10_TEMP108 ) ; final Dist3 RX10_TEMP142 = res . distValue ; final Region3 RX10_TEMP143 = RX10_TEMP142 . dReg ; final int RX10_TEMP144 = Program . searchPointInRegion3 ( RX10_TEMP143 , X10_TEMP103 ) ; final int RX10_TEMP145 = 0 ; final boolean RX10_TEMP146 = RX10_TEMP144 < RX10_TEMP145 ; if ( RX10_TEMP146 ) { String RX10_TEMP147 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP147 ) ; }
 final place RX10_TEMP148 = Program . getPlaceFromDist3 ( RX10_TEMP142 , RX10_TEMP144 ) ; final place RX10_TEMP150 = here ; final boolean RX10_TEMP151 = RX10_TEMP148 != RX10_TEMP150 ; if ( RX10_TEMP151 ) { String RX10_TEMP149 = "Bad place access for array res" ; throw new RuntimeException ( RX10_TEMP149 ) ; }
 Program . setRefArrayValue3double ( res , RX10_TEMP144 , X10_TEMP109 ) ; }
 }
 }
 }
 public static void thread61(final T61 utmpz) {final  double d = utmpz.d;
final  Point3 p = utmpz.p;
final  doubleRefArray3 a_dest = utmpz.a_dest;
 { final double X10_TEMP12 = ( d ) ; final Dist3 RX10_TEMP23 = a_dest . distValue ; final Region3 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion3 ( RX10_TEMP24 , p ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist3 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array a_dest" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue3double ( a_dest , RX10_TEMP25 , X10_TEMP12 ) ; }
 }
 public static void thread62(final T62 utmpz) {final  double d = utmpz.d;
final  Point3 p = utmpz.p;
final  doubleRefArray3 a_dest = utmpz.a_dest;
 { final double X10_TEMP20 = ( d ) ; final Dist3 RX10_TEMP29 = a_dest . distValue ; final Region3 RX10_TEMP30 = RX10_TEMP29 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion3 ( RX10_TEMP30 , p ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist3 ( RX10_TEMP29 , RX10_TEMP31 ) ; final place RX10_TEMP37 = here ; final boolean RX10_TEMP38 = RX10_TEMP35 != RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP36 = "Bad place access for array a_dest" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 Program . setRefArrayValue3double ( a_dest , RX10_TEMP31 , X10_TEMP20 ) ; }
 }
 public static void thread63(final T63 utmpz) {final  doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread64(final T64 utmpz) {final  int RX10_TEMP61 = utmpz.RX10_TEMP61;
final  place RX10_TEMP57 = utmpz.RX10_TEMP57;
final  point ( : rank==1 ) RX10_TEMP56 = utmpz.RX10_TEMP56;
final  doubleStub [ : rank==1 ] RX10_TEMP55 = utmpz.RX10_TEMP55;
 { final dist ( : rank==1 ) RX10_TEMP62 = [ 0 : RX10_TEMP61 ] -> here ; final double [ : rank==1 ] RX10_TEMP63 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP62 ] ) ; final doubleStub RX10_TEMP64 = new doubleStub ( RX10_TEMP63 ) ; 
 final T89 utmp89 = new T89(RX10_TEMP64, RX10_TEMP56, RX10_TEMP55);
 async (RX10_TEMP57) {Program.thread89(utmp89); }
 }
 }
 public static void thread65(final T65 utmpz) {final  doubleRefArray1 aRecv = utmpz.aRecv;
final  place h = utmpz.h;
final  Point3 p = utmpz.p;
final  doubleRefArray3 temp = utmpz.temp;
 { final Dist3 RX10_TEMP76 = temp . distValue ; final Region3 RX10_TEMP77 = RX10_TEMP76 . dReg ; final int RX10_TEMP78 = Program . searchPointInRegion3 ( RX10_TEMP77 , p ) ; final int RX10_TEMP79 = 0 ; final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP81 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP81 ) ; }
 final place RX10_TEMP82 = Program . getPlaceFromDist3 ( RX10_TEMP76 , RX10_TEMP78 ) ; final place RX10_TEMP84 = here ; final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84 ; if ( RX10_TEMP85 ) { String RX10_TEMP83 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 final double RX10_TEMP86 = Program . getRefArrayValue3double ( temp , RX10_TEMP78 ) ; final double X10_TEMP33 = ( RX10_TEMP86 ) ; final Dist3 RX10_TEMP87 = temp . distValue ; final Region3 RX10_TEMP88 = RX10_TEMP87 . dReg ; final int RX10_TEMP89 = Program . searchPointInRegion3 ( RX10_TEMP88 , p ) ; final int RX10_TEMP90 = 0 ; final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP92 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final place RX10_TEMP93 = Program . getPlaceFromDist3 ( RX10_TEMP87 , RX10_TEMP89 ) ; final place RX10_TEMP95 = here ; final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; if ( RX10_TEMP96 ) { String RX10_TEMP94 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP94 ) ; }
 final double RX10_TEMP97 = Program . getRefArrayValue3double ( temp , RX10_TEMP89 ) ; final double X10_TEMP34 = ( RX10_TEMP97 ) ; final double temp3 = ( X10_TEMP33 * X10_TEMP34 ) ; 
 final T90 utmp90 = new T90(temp3, aRecv);
 async (h) {Program.thread90(utmp90); }
 }
 }
 public static void thread66(final T66 utmpz) {final  int z = utmpz.z;
final  int y = utmpz.y;
final  int x = utmpz.x;
final  Point3 p = utmpz.p;
final  Region3 R = utmpz.R;
final  doubleRefArray3 temp = utmpz.temp;
final  int a_CLASS = utmpz.a_CLASS;
 { final int X10_TEMP16 = 1 ; final int X10_TEMP296 = 2 ; final int X10_TEMP576 = 3 ; final int X10_TEMP578 = 4 ; final int X10_TEMP858 = 5 ; final int X10_TEMP1138 = 6 ; switch ( a_CLASS ) { case X10_TEMP16 : { final int X10_TEMP17 = ( 0 ) ; final boolean X10_TEMP19 = ( x == X10_TEMP17 ) ; final int X10_TEMP20 = ( 11 ) ; final boolean X10_TEMP22 = ( y == X10_TEMP20 ) ; final boolean X10_TEMP26 = ( X10_TEMP19 && X10_TEMP22 ) ; final int X10_TEMP23 = ( 2 ) ; final boolean X10_TEMP25 = ( z == X10_TEMP23 ) ; final boolean X10_TEMP28 = ( X10_TEMP26 && X10_TEMP25 ) ; final int X10_TEMP29 = ( 13 ) ; final boolean X10_TEMP31 = ( x == X10_TEMP29 ) ; final int X10_TEMP32 = ( 8 ) ; final boolean X10_TEMP34 = ( y == X10_TEMP32 ) ; final boolean X10_TEMP38 = ( X10_TEMP31 && X10_TEMP34 ) ; final int X10_TEMP35 = ( 17 ) ; final boolean X10_TEMP37 = ( z == X10_TEMP35 ) ; final boolean X10_TEMP40 = ( X10_TEMP38 && X10_TEMP37 ) ; final boolean X10_TEMP53 = ( X10_TEMP28 || X10_TEMP40 ) ; final int X10_TEMP41 = ( 5 ) ; final boolean X10_TEMP43 = ( x == X10_TEMP41 ) ; final int X10_TEMP44 = ( 14 ) ; final boolean X10_TEMP46 = ( y == X10_TEMP44 ) ; final boolean X10_TEMP50 = ( X10_TEMP43 && X10_TEMP46 ) ; final int X10_TEMP47 = ( 0 ) ; final boolean X10_TEMP49 = ( z == X10_TEMP47 ) ; final boolean X10_TEMP52 = ( X10_TEMP50 && X10_TEMP49 ) ; final boolean X10_TEMP66 = ( X10_TEMP53 || X10_TEMP52 ) ; final int X10_TEMP54 = ( 4 ) ; final boolean X10_TEMP56 = ( x == X10_TEMP54 ) ; final int X10_TEMP57 = ( 28 ) ; final boolean X10_TEMP59 = ( y == X10_TEMP57 ) ; final boolean X10_TEMP63 = ( X10_TEMP56 && X10_TEMP59 ) ; final int X10_TEMP60 = ( 15 ) ; final boolean X10_TEMP62 = ( z == X10_TEMP60 ) ; final boolean X10_TEMP65 = ( X10_TEMP63 && X10_TEMP62 ) ; final boolean X10_TEMP79 = ( X10_TEMP66 || X10_TEMP65 ) ; final int X10_TEMP67 = ( 12 ) ; final boolean X10_TEMP69 = ( x == X10_TEMP67 ) ; final int X10_TEMP70 = ( 2 ) ; final boolean X10_TEMP72 = ( y == X10_TEMP70 ) ; final boolean X10_TEMP76 = ( X10_TEMP69 && X10_TEMP72 ) ; final int X10_TEMP73 = ( 1 ) ; final boolean X10_TEMP75 = ( z == X10_TEMP73 ) ; final boolean X10_TEMP78 = ( X10_TEMP76 && X10_TEMP75 ) ; final boolean X10_TEMP92 = ( X10_TEMP79 || X10_TEMP78 ) ; final int X10_TEMP80 = ( 5 ) ; final boolean X10_TEMP82 = ( x == X10_TEMP80 ) ; final int X10_TEMP83 = ( 17 ) ; final boolean X10_TEMP85 = ( y == X10_TEMP83 ) ; final boolean X10_TEMP89 = ( X10_TEMP82 && X10_TEMP85 ) ; final int X10_TEMP86 = ( 8 ) ; final boolean X10_TEMP88 = ( z == X10_TEMP86 ) ; final boolean X10_TEMP91 = ( X10_TEMP89 && X10_TEMP88 ) ; final boolean X10_TEMP105 = ( X10_TEMP92 || X10_TEMP91 ) ; final int X10_TEMP93 = ( 20 ) ; final boolean X10_TEMP95 = ( x == X10_TEMP93 ) ; final int X10_TEMP96 = ( 19 ) ; final boolean X10_TEMP98 = ( y == X10_TEMP96 ) ; final boolean X10_TEMP102 = ( X10_TEMP95 && X10_TEMP98 ) ; final int X10_TEMP99 = ( 11 ) ; final boolean X10_TEMP101 = ( z == X10_TEMP99 ) ; final boolean X10_TEMP104 = ( X10_TEMP102 && X10_TEMP101 ) ; final boolean X10_TEMP118 = ( X10_TEMP105 || X10_TEMP104 ) ; final int X10_TEMP106 = ( 26 ) ; final boolean X10_TEMP108 = ( x == X10_TEMP106 ) ; final int X10_TEMP109 = ( 15 ) ; final boolean X10_TEMP111 = ( y == X10_TEMP109 ) ; final boolean X10_TEMP115 = ( X10_TEMP108 && X10_TEMP111 ) ; final int X10_TEMP112 = ( 31 ) ; final boolean X10_TEMP114 = ( z == X10_TEMP112 ) ; final boolean X10_TEMP117 = ( X10_TEMP115 && X10_TEMP114 ) ; final boolean X10_TEMP131 = ( X10_TEMP118 || X10_TEMP117 ) ; final int X10_TEMP119 = ( 8 ) ; final boolean X10_TEMP121 = ( x == X10_TEMP119 ) ; final int X10_TEMP122 = ( 25 ) ; final boolean X10_TEMP124 = ( y == X10_TEMP122 ) ; final boolean X10_TEMP128 = ( X10_TEMP121 && X10_TEMP124 ) ; final int X10_TEMP125 = ( 22 ) ; final boolean X10_TEMP127 = ( z == X10_TEMP125 ) ; final boolean X10_TEMP130 = ( X10_TEMP128 && X10_TEMP127 ) ; final boolean X10_TEMP144 = ( X10_TEMP131 || X10_TEMP130 ) ; final int X10_TEMP132 = ( 7 ) ; final boolean X10_TEMP134 = ( x == X10_TEMP132 ) ; final int X10_TEMP135 = ( 14 ) ; final boolean X10_TEMP137 = ( y == X10_TEMP135 ) ; final boolean X10_TEMP141 = ( X10_TEMP134 && X10_TEMP137 ) ; final int X10_TEMP138 = ( 26 ) ; final boolean X10_TEMP140 = ( z == X10_TEMP138 ) ; final boolean X10_TEMP143 = ( X10_TEMP141 && X10_TEMP140 ) ; final boolean X10_TEMP146 = ( X10_TEMP144 || X10_TEMP143 ) ; final boolean RX10_TEMP31 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP148 = ( RX10_TEMP31 ) ; final boolean X10_TEMP150 = X10_TEMP146 && X10_TEMP148 ; if ( X10_TEMP150 ) { final int X10_TEMP152 = ( 1 ) ; final int X10_TEMP153 = 0 ; final double X10_TEMP155 = ( X10_TEMP153 - X10_TEMP152 ) ; final double X10_TEMP156 = ( X10_TEMP155 ) ; final Dist3 RX10_TEMP32 = temp . distValue ; final Region3 RX10_TEMP33 = RX10_TEMP32 . dReg ; final int RX10_TEMP34 = Program . searchPointInRegion3 ( RX10_TEMP33 , p ) ; final int RX10_TEMP35 = 0 ; final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP37 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP37 ) ; }
 final place RX10_TEMP38 = Program . getPlaceFromDist3 ( RX10_TEMP32 , RX10_TEMP34 ) ; final place RX10_TEMP40 = here ; final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP39 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP34 , X10_TEMP156 ) ; }
 final int X10_TEMP157 = ( 7 ) ; final boolean X10_TEMP159 = ( x == X10_TEMP157 ) ; final int X10_TEMP160 = ( 1 ) ; final boolean X10_TEMP162 = ( y == X10_TEMP160 ) ; final boolean X10_TEMP166 = ( X10_TEMP159 && X10_TEMP162 ) ; final int X10_TEMP163 = ( 20 ) ; final boolean X10_TEMP165 = ( z == X10_TEMP163 ) ; final boolean X10_TEMP168 = ( X10_TEMP166 && X10_TEMP165 ) ; final int X10_TEMP169 = ( 19 ) ; final boolean X10_TEMP171 = ( x == X10_TEMP169 ) ; final int X10_TEMP172 = ( 29 ) ; final boolean X10_TEMP174 = ( y == X10_TEMP172 ) ; final boolean X10_TEMP178 = ( X10_TEMP171 && X10_TEMP174 ) ; final int X10_TEMP175 = ( 31 ) ; final boolean X10_TEMP177 = ( z == X10_TEMP175 ) ; final boolean X10_TEMP180 = ( X10_TEMP178 && X10_TEMP177 ) ; final boolean X10_TEMP193 = ( X10_TEMP168 || X10_TEMP180 ) ; final int X10_TEMP181 = ( 2 ) ; final boolean X10_TEMP183 = ( x == X10_TEMP181 ) ; final int X10_TEMP184 = ( 0 ) ; final boolean X10_TEMP186 = ( y == X10_TEMP184 ) ; final boolean X10_TEMP190 = ( X10_TEMP183 && X10_TEMP186 ) ; final int X10_TEMP187 = ( 3 ) ; final boolean X10_TEMP189 = ( z == X10_TEMP187 ) ; final boolean X10_TEMP192 = ( X10_TEMP190 && X10_TEMP189 ) ; final boolean X10_TEMP206 = ( X10_TEMP193 || X10_TEMP192 ) ; final int X10_TEMP194 = ( 4 ) ; final boolean X10_TEMP196 = ( x == X10_TEMP194 ) ; final int X10_TEMP197 = ( 22 ) ; final boolean X10_TEMP199 = ( y == X10_TEMP197 ) ; final boolean X10_TEMP203 = ( X10_TEMP196 && X10_TEMP199 ) ; final int X10_TEMP200 = ( 3 ) ; final boolean X10_TEMP202 = ( z == X10_TEMP200 ) ; final boolean X10_TEMP205 = ( X10_TEMP203 && X10_TEMP202 ) ; final boolean X10_TEMP219 = ( X10_TEMP206 || X10_TEMP205 ) ; final int X10_TEMP207 = ( 1 ) ; final boolean X10_TEMP209 = ( x == X10_TEMP207 ) ; final int X10_TEMP210 = ( 16 ) ; final boolean X10_TEMP212 = ( y == X10_TEMP210 ) ; final boolean X10_TEMP216 = ( X10_TEMP209 && X10_TEMP212 ) ; final int X10_TEMP213 = ( 21 ) ; final boolean X10_TEMP215 = ( z == X10_TEMP213 ) ; final boolean X10_TEMP218 = ( X10_TEMP216 && X10_TEMP215 ) ; final boolean X10_TEMP232 = ( X10_TEMP219 || X10_TEMP218 ) ; final int X10_TEMP220 = ( 21 ) ; final boolean X10_TEMP222 = ( x == X10_TEMP220 ) ; final int X10_TEMP223 = ( 31 ) ; final boolean X10_TEMP225 = ( y == X10_TEMP223 ) ; final boolean X10_TEMP229 = ( X10_TEMP222 && X10_TEMP225 ) ; final int X10_TEMP226 = ( 6 ) ; final boolean X10_TEMP228 = ( z == X10_TEMP226 ) ; final boolean X10_TEMP231 = ( X10_TEMP229 && X10_TEMP228 ) ; final boolean X10_TEMP245 = ( X10_TEMP232 || X10_TEMP231 ) ; final int X10_TEMP233 = ( 12 ) ; final boolean X10_TEMP235 = ( x == X10_TEMP233 ) ; final int X10_TEMP236 = ( 15 ) ; final boolean X10_TEMP238 = ( y == X10_TEMP236 ) ; final boolean X10_TEMP242 = ( X10_TEMP235 && X10_TEMP238 ) ; final int X10_TEMP239 = ( 12 ) ; final boolean X10_TEMP241 = ( z == X10_TEMP239 ) ; final boolean X10_TEMP244 = ( X10_TEMP242 && X10_TEMP241 ) ; final boolean X10_TEMP258 = ( X10_TEMP245 || X10_TEMP244 ) ; final int X10_TEMP246 = ( 30 ) ; final boolean X10_TEMP248 = ( x == X10_TEMP246 ) ; final int X10_TEMP249 = ( 4 ) ; final boolean X10_TEMP251 = ( y == X10_TEMP249 ) ; final boolean X10_TEMP255 = ( X10_TEMP248 && X10_TEMP251 ) ; final int X10_TEMP252 = ( 25 ) ; final boolean X10_TEMP254 = ( z == X10_TEMP252 ) ; final boolean X10_TEMP257 = ( X10_TEMP255 && X10_TEMP254 ) ; final boolean X10_TEMP271 = ( X10_TEMP258 || X10_TEMP257 ) ; final int X10_TEMP259 = ( 28 ) ; final boolean X10_TEMP261 = ( x == X10_TEMP259 ) ; final int X10_TEMP262 = ( 0 ) ; final boolean X10_TEMP264 = ( y == X10_TEMP262 ) ; final boolean X10_TEMP268 = ( X10_TEMP261 && X10_TEMP264 ) ; final int X10_TEMP265 = ( 28 ) ; final boolean X10_TEMP267 = ( z == X10_TEMP265 ) ; final boolean X10_TEMP270 = ( X10_TEMP268 && X10_TEMP267 ) ; final boolean X10_TEMP284 = ( X10_TEMP271 || X10_TEMP270 ) ; final int X10_TEMP272 = ( 17 ) ; final boolean X10_TEMP274 = ( x == X10_TEMP272 ) ; final int X10_TEMP275 = ( 26 ) ; final boolean X10_TEMP277 = ( y == X10_TEMP275 ) ; final boolean X10_TEMP281 = ( X10_TEMP274 && X10_TEMP277 ) ; final int X10_TEMP278 = ( 17 ) ; final boolean X10_TEMP280 = ( z == X10_TEMP278 ) ; final boolean X10_TEMP283 = ( X10_TEMP281 && X10_TEMP280 ) ; final boolean X10_TEMP286 = ( X10_TEMP284 || X10_TEMP283 ) ; final boolean RX10_TEMP42 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP288 = ( RX10_TEMP42 ) ; final boolean X10_TEMP290 = X10_TEMP286 && X10_TEMP288 ; if ( X10_TEMP290 ) { final double X10_TEMP293 = ( 1 ) ; final double X10_TEMP294 = ( X10_TEMP293 ) ; final Dist3 RX10_TEMP43 = temp . distValue ; final Region3 RX10_TEMP44 = RX10_TEMP43 . dReg ; final int RX10_TEMP45 = Program . searchPointInRegion3 ( RX10_TEMP44 , p ) ; final int RX10_TEMP46 = 0 ; final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; if ( RX10_TEMP47 ) { String RX10_TEMP48 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final place RX10_TEMP49 = Program . getPlaceFromDist3 ( RX10_TEMP43 , RX10_TEMP45 ) ; final place RX10_TEMP51 = here ; final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP50 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP45 , X10_TEMP294 ) ; }
 break ; }
 case X10_TEMP296 : { final int X10_TEMP297 = ( 38 ) ; final boolean X10_TEMP299 = ( x == X10_TEMP297 ) ; final int X10_TEMP300 = ( 60 ) ; final boolean X10_TEMP302 = ( y == X10_TEMP300 ) ; final boolean X10_TEMP306 = ( X10_TEMP299 && X10_TEMP302 ) ; final int X10_TEMP303 = ( 51 ) ; final boolean X10_TEMP305 = ( z == X10_TEMP303 ) ; final boolean X10_TEMP308 = ( X10_TEMP306 && X10_TEMP305 ) ; final int X10_TEMP309 = ( 50 ) ; final boolean X10_TEMP311 = ( x == X10_TEMP309 ) ; final int X10_TEMP312 = ( 15 ) ; final boolean X10_TEMP314 = ( y == X10_TEMP312 ) ; final boolean X10_TEMP318 = ( X10_TEMP311 && X10_TEMP314 ) ; final int X10_TEMP315 = ( 23 ) ; final boolean X10_TEMP317 = ( z == X10_TEMP315 ) ; final boolean X10_TEMP320 = ( X10_TEMP318 && X10_TEMP317 ) ; final boolean X10_TEMP333 = ( X10_TEMP308 || X10_TEMP320 ) ; final int X10_TEMP321 = ( 18 ) ; final boolean X10_TEMP323 = ( x == X10_TEMP321 ) ; final int X10_TEMP324 = ( 45 ) ; final boolean X10_TEMP326 = ( y == X10_TEMP324 ) ; final boolean X10_TEMP330 = ( X10_TEMP323 && X10_TEMP326 ) ; final int X10_TEMP327 = ( 36 ) ; final boolean X10_TEMP329 = ( z == X10_TEMP327 ) ; final boolean X10_TEMP332 = ( X10_TEMP330 && X10_TEMP329 ) ; final boolean X10_TEMP346 = ( X10_TEMP333 || X10_TEMP332 ) ; final int X10_TEMP334 = ( 25 ) ; final boolean X10_TEMP336 = ( x == X10_TEMP334 ) ; final int X10_TEMP337 = ( 14 ) ; final boolean X10_TEMP339 = ( y == X10_TEMP337 ) ; final boolean X10_TEMP343 = ( X10_TEMP336 && X10_TEMP339 ) ; final int X10_TEMP340 = ( 36 ) ; final boolean X10_TEMP342 = ( z == X10_TEMP340 ) ; final boolean X10_TEMP345 = ( X10_TEMP343 && X10_TEMP342 ) ; final boolean X10_TEMP359 = ( X10_TEMP346 || X10_TEMP345 ) ; final int X10_TEMP347 = ( 26 ) ; final boolean X10_TEMP349 = ( x == X10_TEMP347 ) ; final int X10_TEMP350 = ( 25 ) ; final boolean X10_TEMP352 = ( y == X10_TEMP350 ) ; final boolean X10_TEMP356 = ( X10_TEMP349 && X10_TEMP352 ) ; final int X10_TEMP353 = ( 25 ) ; final boolean X10_TEMP355 = ( z == X10_TEMP353 ) ; final boolean X10_TEMP358 = ( X10_TEMP356 && X10_TEMP355 ) ; final boolean X10_TEMP372 = ( X10_TEMP359 || X10_TEMP358 ) ; final int X10_TEMP360 = ( 32 ) ; final boolean X10_TEMP362 = ( x == X10_TEMP360 ) ; final int X10_TEMP363 = ( 37 ) ; final boolean X10_TEMP365 = ( y == X10_TEMP363 ) ; final boolean X10_TEMP369 = ( X10_TEMP362 && X10_TEMP365 ) ; final int X10_TEMP366 = ( 0 ) ; final boolean X10_TEMP368 = ( z == X10_TEMP366 ) ; final boolean X10_TEMP371 = ( X10_TEMP369 && X10_TEMP368 ) ; final boolean X10_TEMP385 = ( X10_TEMP372 || X10_TEMP371 ) ; final int X10_TEMP373 = ( 29 ) ; final boolean X10_TEMP375 = ( x == X10_TEMP373 ) ; final int X10_TEMP376 = ( 62 ) ; final boolean X10_TEMP378 = ( y == X10_TEMP376 ) ; final boolean X10_TEMP382 = ( X10_TEMP375 && X10_TEMP378 ) ; final int X10_TEMP379 = ( 54 ) ; final boolean X10_TEMP381 = ( z == X10_TEMP379 ) ; final boolean X10_TEMP384 = ( X10_TEMP382 && X10_TEMP381 ) ; final boolean X10_TEMP398 = ( X10_TEMP385 || X10_TEMP384 ) ; final int X10_TEMP386 = ( 39 ) ; final boolean X10_TEMP388 = ( x == X10_TEMP386 ) ; final int X10_TEMP389 = ( 49 ) ; final boolean X10_TEMP391 = ( y == X10_TEMP389 ) ; final boolean X10_TEMP395 = ( X10_TEMP388 && X10_TEMP391 ) ; final int X10_TEMP392 = ( 57 ) ; final boolean X10_TEMP394 = ( z == X10_TEMP392 ) ; final boolean X10_TEMP397 = ( X10_TEMP395 && X10_TEMP394 ) ; final boolean X10_TEMP411 = ( X10_TEMP398 || X10_TEMP397 ) ; final int X10_TEMP399 = ( 12 ) ; final boolean X10_TEMP401 = ( x == X10_TEMP399 ) ; final int X10_TEMP402 = ( 29 ) ; final boolean X10_TEMP404 = ( y == X10_TEMP402 ) ; final boolean X10_TEMP408 = ( X10_TEMP401 && X10_TEMP404 ) ; final int X10_TEMP405 = ( 28 ) ; final boolean X10_TEMP407 = ( z == X10_TEMP405 ) ; final boolean X10_TEMP410 = ( X10_TEMP408 && X10_TEMP407 ) ; final boolean X10_TEMP424 = ( X10_TEMP411 || X10_TEMP410 ) ; final int X10_TEMP412 = ( 63 ) ; final boolean X10_TEMP414 = ( x == X10_TEMP412 ) ; final int X10_TEMP415 = ( 46 ) ; final boolean X10_TEMP417 = ( y == X10_TEMP415 ) ; final boolean X10_TEMP421 = ( X10_TEMP414 && X10_TEMP417 ) ; final int X10_TEMP418 = ( 25 ) ; final boolean X10_TEMP420 = ( z == X10_TEMP418 ) ; final boolean X10_TEMP423 = ( X10_TEMP421 && X10_TEMP420 ) ; final boolean X10_TEMP426 = ( X10_TEMP424 || X10_TEMP423 ) ; final boolean RX10_TEMP53 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP428 = ( RX10_TEMP53 ) ; final boolean X10_TEMP430 = X10_TEMP426 && X10_TEMP428 ; if ( X10_TEMP430 ) { final int X10_TEMP432 = ( 1 ) ; final int X10_TEMP433 = 0 ; final double X10_TEMP435 = ( X10_TEMP433 - X10_TEMP432 ) ; final double X10_TEMP436 = ( X10_TEMP435 ) ; final Dist3 RX10_TEMP54 = temp . distValue ; final Region3 RX10_TEMP55 = RX10_TEMP54 . dReg ; final int RX10_TEMP56 = Program . searchPointInRegion3 ( RX10_TEMP55 , p ) ; final int RX10_TEMP57 = 0 ; final boolean RX10_TEMP58 = RX10_TEMP56 < RX10_TEMP57 ; if ( RX10_TEMP58 ) { String RX10_TEMP59 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 final place RX10_TEMP60 = Program . getPlaceFromDist3 ( RX10_TEMP54 , RX10_TEMP56 ) ; final place RX10_TEMP62 = here ; final boolean RX10_TEMP63 = RX10_TEMP60 != RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP61 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP61 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP56 , X10_TEMP436 ) ; }
 final int X10_TEMP437 = ( 27 ) ; final boolean X10_TEMP439 = ( x == X10_TEMP437 ) ; final int X10_TEMP440 = ( 32 ) ; final boolean X10_TEMP442 = ( y == X10_TEMP440 ) ; final boolean X10_TEMP446 = ( X10_TEMP439 && X10_TEMP442 ) ; final int X10_TEMP443 = ( 45 ) ; final boolean X10_TEMP445 = ( z == X10_TEMP443 ) ; final boolean X10_TEMP448 = ( X10_TEMP446 && X10_TEMP445 ) ; final int X10_TEMP449 = ( 39 ) ; final boolean X10_TEMP451 = ( x == X10_TEMP449 ) ; final int X10_TEMP452 = ( 0 ) ; final boolean X10_TEMP454 = ( y == X10_TEMP452 ) ; final boolean X10_TEMP458 = ( X10_TEMP451 && X10_TEMP454 ) ; final int X10_TEMP455 = ( 5 ) ; final boolean X10_TEMP457 = ( z == X10_TEMP455 ) ; final boolean X10_TEMP460 = ( X10_TEMP458 && X10_TEMP457 ) ; final boolean X10_TEMP473 = ( X10_TEMP448 || X10_TEMP460 ) ; final int X10_TEMP461 = ( 45 ) ; final boolean X10_TEMP463 = ( x == X10_TEMP461 ) ; final int X10_TEMP464 = ( 23 ) ; final boolean X10_TEMP466 = ( y == X10_TEMP464 ) ; final boolean X10_TEMP470 = ( X10_TEMP463 && X10_TEMP466 ) ; final int X10_TEMP467 = ( 49 ) ; final boolean X10_TEMP469 = ( z == X10_TEMP467 ) ; final boolean X10_TEMP472 = ( X10_TEMP470 && X10_TEMP469 ) ; final boolean X10_TEMP486 = ( X10_TEMP473 || X10_TEMP472 ) ; final int X10_TEMP474 = ( 20 ) ; final boolean X10_TEMP476 = ( x == X10_TEMP474 ) ; final int X10_TEMP477 = ( 32 ) ; final boolean X10_TEMP479 = ( y == X10_TEMP477 ) ; final boolean X10_TEMP483 = ( X10_TEMP476 && X10_TEMP479 ) ; final int X10_TEMP480 = ( 58 ) ; final boolean X10_TEMP482 = ( z == X10_TEMP480 ) ; final boolean X10_TEMP485 = ( X10_TEMP483 && X10_TEMP482 ) ; final boolean X10_TEMP499 = ( X10_TEMP486 || X10_TEMP485 ) ; final int X10_TEMP487 = ( 23 ) ; final boolean X10_TEMP489 = ( x == X10_TEMP487 ) ; final int X10_TEMP490 = ( 47 ) ; final boolean X10_TEMP492 = ( y == X10_TEMP490 ) ; final boolean X10_TEMP496 = ( X10_TEMP489 && X10_TEMP492 ) ; final int X10_TEMP493 = ( 57 ) ; final boolean X10_TEMP495 = ( z == X10_TEMP493 ) ; final boolean X10_TEMP498 = ( X10_TEMP496 && X10_TEMP495 ) ; final boolean X10_TEMP512 = ( X10_TEMP499 || X10_TEMP498 ) ; final int X10_TEMP500 = ( 17 ) ; final boolean X10_TEMP502 = ( x == X10_TEMP500 ) ; final int X10_TEMP503 = ( 43 ) ; final boolean X10_TEMP505 = ( y == X10_TEMP503 ) ; final boolean X10_TEMP509 = ( X10_TEMP502 && X10_TEMP505 ) ; final int X10_TEMP506 = ( 53 ) ; final boolean X10_TEMP508 = ( z == X10_TEMP506 ) ; final boolean X10_TEMP511 = ( X10_TEMP509 && X10_TEMP508 ) ; final boolean X10_TEMP525 = ( X10_TEMP512 || X10_TEMP511 ) ; final int X10_TEMP513 = ( 8 ) ; final boolean X10_TEMP515 = ( x == X10_TEMP513 ) ; final int X10_TEMP516 = ( 16 ) ; final boolean X10_TEMP518 = ( y == X10_TEMP516 ) ; final boolean X10_TEMP522 = ( X10_TEMP515 && X10_TEMP518 ) ; final int X10_TEMP519 = ( 48 ) ; final boolean X10_TEMP521 = ( z == X10_TEMP519 ) ; final boolean X10_TEMP524 = ( X10_TEMP522 && X10_TEMP521 ) ; final boolean X10_TEMP538 = ( X10_TEMP525 || X10_TEMP524 ) ; final int X10_TEMP526 = ( 51 ) ; final boolean X10_TEMP528 = ( x == X10_TEMP526 ) ; final int X10_TEMP529 = ( 46 ) ; final boolean X10_TEMP531 = ( y == X10_TEMP529 ) ; final boolean X10_TEMP535 = ( X10_TEMP528 && X10_TEMP531 ) ; final int X10_TEMP532 = ( 26 ) ; final boolean X10_TEMP534 = ( z == X10_TEMP532 ) ; final boolean X10_TEMP537 = ( X10_TEMP535 && X10_TEMP534 ) ; final boolean X10_TEMP551 = ( X10_TEMP538 || X10_TEMP537 ) ; final int X10_TEMP539 = ( 58 ) ; final boolean X10_TEMP541 = ( x == X10_TEMP539 ) ; final int X10_TEMP542 = ( 19 ) ; final boolean X10_TEMP544 = ( y == X10_TEMP542 ) ; final boolean X10_TEMP548 = ( X10_TEMP541 && X10_TEMP544 ) ; final int X10_TEMP545 = ( 62 ) ; final boolean X10_TEMP547 = ( z == X10_TEMP545 ) ; final boolean X10_TEMP550 = ( X10_TEMP548 && X10_TEMP547 ) ; final boolean X10_TEMP564 = ( X10_TEMP551 || X10_TEMP550 ) ; final int X10_TEMP552 = ( 58 ) ; final boolean X10_TEMP554 = ( x == X10_TEMP552 ) ; final int X10_TEMP555 = ( 15 ) ; final boolean X10_TEMP557 = ( y == X10_TEMP555 ) ; final boolean X10_TEMP561 = ( X10_TEMP554 && X10_TEMP557 ) ; final int X10_TEMP558 = ( 54 ) ; final boolean X10_TEMP560 = ( z == X10_TEMP558 ) ; final boolean X10_TEMP563 = ( X10_TEMP561 && X10_TEMP560 ) ; final boolean X10_TEMP566 = ( X10_TEMP564 || X10_TEMP563 ) ; final boolean RX10_TEMP64 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP568 = ( RX10_TEMP64 ) ; final boolean X10_TEMP570 = X10_TEMP566 && X10_TEMP568 ; if ( X10_TEMP570 ) { final double X10_TEMP573 = ( 1 ) ; final double X10_TEMP574 = ( X10_TEMP573 ) ; final Dist3 RX10_TEMP65 = temp . distValue ; final Region3 RX10_TEMP66 = RX10_TEMP65 . dReg ; final int RX10_TEMP67 = Program . searchPointInRegion3 ( RX10_TEMP66 , p ) ; final int RX10_TEMP68 = 0 ; final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68 ; if ( RX10_TEMP69 ) { String RX10_TEMP70 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 final place RX10_TEMP71 = Program . getPlaceFromDist3 ( RX10_TEMP65 , RX10_TEMP67 ) ; final place RX10_TEMP73 = here ; final boolean RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73 ; if ( RX10_TEMP74 ) { String RX10_TEMP72 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP72 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP67 , X10_TEMP574 ) ; }
 break ; }
 case X10_TEMP576 : { }
 case X10_TEMP578 : { final int X10_TEMP579 = ( 221 ) ; final boolean X10_TEMP581 = ( x == X10_TEMP579 ) ; final int X10_TEMP582 = ( 40 ) ; final boolean X10_TEMP584 = ( y == X10_TEMP582 ) ; final boolean X10_TEMP588 = ( X10_TEMP581 && X10_TEMP584 ) ; final int X10_TEMP585 = ( 238 ) ; final boolean X10_TEMP587 = ( z == X10_TEMP585 ) ; final boolean X10_TEMP590 = ( X10_TEMP588 && X10_TEMP587 ) ; final int X10_TEMP591 = ( 152 ) ; final boolean X10_TEMP593 = ( x == X10_TEMP591 ) ; final int X10_TEMP594 = ( 160 ) ; final boolean X10_TEMP596 = ( y == X10_TEMP594 ) ; final boolean X10_TEMP600 = ( X10_TEMP593 && X10_TEMP596 ) ; final int X10_TEMP597 = ( 34 ) ; final boolean X10_TEMP599 = ( z == X10_TEMP597 ) ; final boolean X10_TEMP602 = ( X10_TEMP600 && X10_TEMP599 ) ; final boolean X10_TEMP615 = ( X10_TEMP590 || X10_TEMP602 ) ; final int X10_TEMP603 = ( 80 ) ; final boolean X10_TEMP605 = ( x == X10_TEMP603 ) ; final int X10_TEMP606 = ( 182 ) ; final boolean X10_TEMP608 = ( y == X10_TEMP606 ) ; final boolean X10_TEMP612 = ( X10_TEMP605 && X10_TEMP608 ) ; final int X10_TEMP609 = ( 253 ) ; final boolean X10_TEMP611 = ( z == X10_TEMP609 ) ; final boolean X10_TEMP614 = ( X10_TEMP612 && X10_TEMP611 ) ; final boolean X10_TEMP628 = ( X10_TEMP615 || X10_TEMP614 ) ; final int X10_TEMP616 = ( 248 ) ; final boolean X10_TEMP618 = ( x == X10_TEMP616 ) ; final int X10_TEMP619 = ( 168 ) ; final boolean X10_TEMP621 = ( y == X10_TEMP619 ) ; final boolean X10_TEMP625 = ( X10_TEMP618 && X10_TEMP621 ) ; final int X10_TEMP622 = ( 155 ) ; final boolean X10_TEMP624 = ( z == X10_TEMP622 ) ; final boolean X10_TEMP627 = ( X10_TEMP625 && X10_TEMP624 ) ; final boolean X10_TEMP641 = ( X10_TEMP628 || X10_TEMP627 ) ; final int X10_TEMP629 = ( 197 ) ; final boolean X10_TEMP631 = ( x == X10_TEMP629 ) ; final int X10_TEMP632 = ( 5 ) ; final boolean X10_TEMP634 = ( y == X10_TEMP632 ) ; final boolean X10_TEMP638 = ( X10_TEMP631 && X10_TEMP634 ) ; final int X10_TEMP635 = ( 201 ) ; final boolean X10_TEMP637 = ( z == X10_TEMP635 ) ; final boolean X10_TEMP640 = ( X10_TEMP638 && X10_TEMP637 ) ; final boolean X10_TEMP654 = ( X10_TEMP641 || X10_TEMP640 ) ; final int X10_TEMP642 = ( 90 ) ; final boolean X10_TEMP644 = ( x == X10_TEMP642 ) ; final int X10_TEMP645 = ( 61 ) ; final boolean X10_TEMP647 = ( y == X10_TEMP645 ) ; final boolean X10_TEMP651 = ( X10_TEMP644 && X10_TEMP647 ) ; final int X10_TEMP648 = ( 203 ) ; final boolean X10_TEMP650 = ( z == X10_TEMP648 ) ; final boolean X10_TEMP653 = ( X10_TEMP651 && X10_TEMP650 ) ; final boolean X10_TEMP667 = ( X10_TEMP654 || X10_TEMP653 ) ; final int X10_TEMP655 = ( 15 ) ; final boolean X10_TEMP657 = ( x == X10_TEMP655 ) ; final int X10_TEMP658 = ( 203 ) ; final boolean X10_TEMP660 = ( y == X10_TEMP658 ) ; final boolean X10_TEMP664 = ( X10_TEMP657 && X10_TEMP660 ) ; final int X10_TEMP661 = ( 30 ) ; final boolean X10_TEMP663 = ( z == X10_TEMP661 ) ; final boolean X10_TEMP666 = ( X10_TEMP664 && X10_TEMP663 ) ; final boolean X10_TEMP680 = ( X10_TEMP667 || X10_TEMP666 ) ; final int X10_TEMP668 = ( 99 ) ; final boolean X10_TEMP670 = ( x == X10_TEMP668 ) ; final int X10_TEMP671 = ( 154 ) ; final boolean X10_TEMP673 = ( y == X10_TEMP671 ) ; final boolean X10_TEMP677 = ( X10_TEMP670 && X10_TEMP673 ) ; final int X10_TEMP674 = ( 57 ) ; final boolean X10_TEMP676 = ( z == X10_TEMP674 ) ; final boolean X10_TEMP679 = ( X10_TEMP677 && X10_TEMP676 ) ; final boolean X10_TEMP693 = ( X10_TEMP680 || X10_TEMP679 ) ; final int X10_TEMP681 = ( 100 ) ; final boolean X10_TEMP683 = ( x == X10_TEMP681 ) ; final int X10_TEMP684 = ( 136 ) ; final boolean X10_TEMP686 = ( y == X10_TEMP684 ) ; final boolean X10_TEMP690 = ( X10_TEMP683 && X10_TEMP686 ) ; final int X10_TEMP687 = ( 110 ) ; final boolean X10_TEMP689 = ( z == X10_TEMP687 ) ; final boolean X10_TEMP692 = ( X10_TEMP690 && X10_TEMP689 ) ; final boolean X10_TEMP706 = ( X10_TEMP693 || X10_TEMP692 ) ; final int X10_TEMP694 = ( 209 ) ; final boolean X10_TEMP696 = ( x == X10_TEMP694 ) ; final int X10_TEMP697 = ( 152 ) ; final boolean X10_TEMP699 = ( y == X10_TEMP697 ) ; final boolean X10_TEMP703 = ( X10_TEMP696 && X10_TEMP699 ) ; final int X10_TEMP700 = ( 96 ) ; final boolean X10_TEMP702 = ( z == X10_TEMP700 ) ; final boolean X10_TEMP705 = ( X10_TEMP703 && X10_TEMP702 ) ; final boolean X10_TEMP708 = ( X10_TEMP706 || X10_TEMP705 ) ; final boolean RX10_TEMP75 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP710 = ( RX10_TEMP75 ) ; final boolean X10_TEMP712 = X10_TEMP708 && X10_TEMP710 ; if ( X10_TEMP712 ) { final int X10_TEMP714 = ( 1 ) ; final int X10_TEMP715 = 0 ; final double X10_TEMP717 = ( X10_TEMP715 - X10_TEMP714 ) ; final double X10_TEMP718 = ( X10_TEMP717 ) ; final Dist3 RX10_TEMP76 = temp . distValue ; final Region3 RX10_TEMP77 = RX10_TEMP76 . dReg ; final int RX10_TEMP78 = Program . searchPointInRegion3 ( RX10_TEMP77 , p ) ; final int RX10_TEMP79 = 0 ; final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP81 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP81 ) ; }
 final place RX10_TEMP82 = Program . getPlaceFromDist3 ( RX10_TEMP76 , RX10_TEMP78 ) ; final place RX10_TEMP84 = here ; final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84 ; if ( RX10_TEMP85 ) { String RX10_TEMP83 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP78 , X10_TEMP718 ) ; }
 final int X10_TEMP719 = ( 52 ) ; final boolean X10_TEMP721 = ( x == X10_TEMP719 ) ; final int X10_TEMP722 = ( 207 ) ; final boolean X10_TEMP724 = ( y == X10_TEMP722 ) ; final boolean X10_TEMP728 = ( X10_TEMP721 && X10_TEMP724 ) ; final int X10_TEMP725 = ( 38 ) ; final boolean X10_TEMP727 = ( z == X10_TEMP725 ) ; final boolean X10_TEMP730 = ( X10_TEMP728 && X10_TEMP727 ) ; final int X10_TEMP731 = ( 241 ) ; final boolean X10_TEMP733 = ( x == X10_TEMP731 ) ; final int X10_TEMP734 = ( 170 ) ; final boolean X10_TEMP736 = ( y == X10_TEMP734 ) ; final boolean X10_TEMP740 = ( X10_TEMP733 && X10_TEMP736 ) ; final int X10_TEMP737 = ( 12 ) ; final boolean X10_TEMP739 = ( z == X10_TEMP737 ) ; final boolean X10_TEMP742 = ( X10_TEMP740 && X10_TEMP739 ) ; final boolean X10_TEMP755 = ( X10_TEMP730 || X10_TEMP742 ) ; final int X10_TEMP743 = ( 201 ) ; final boolean X10_TEMP745 = ( x == X10_TEMP743 ) ; final int X10_TEMP746 = ( 16 ) ; final boolean X10_TEMP748 = ( y == X10_TEMP746 ) ; final boolean X10_TEMP752 = ( X10_TEMP745 && X10_TEMP748 ) ; final int X10_TEMP749 = ( 196 ) ; final boolean X10_TEMP751 = ( z == X10_TEMP749 ) ; final boolean X10_TEMP754 = ( X10_TEMP752 && X10_TEMP751 ) ; final boolean X10_TEMP768 = ( X10_TEMP755 || X10_TEMP754 ) ; final int X10_TEMP756 = ( 200 ) ; final boolean X10_TEMP758 = ( x == X10_TEMP756 ) ; final int X10_TEMP759 = ( 81 ) ; final boolean X10_TEMP761 = ( y == X10_TEMP759 ) ; final boolean X10_TEMP765 = ( X10_TEMP758 && X10_TEMP761 ) ; final int X10_TEMP762 = ( 207 ) ; final boolean X10_TEMP764 = ( z == X10_TEMP762 ) ; final boolean X10_TEMP767 = ( X10_TEMP765 && X10_TEMP764 ) ; final boolean X10_TEMP781 = ( X10_TEMP768 || X10_TEMP767 ) ; final int X10_TEMP769 = ( 113 ) ; final boolean X10_TEMP771 = ( x == X10_TEMP769 ) ; final int X10_TEMP772 = ( 121 ) ; final boolean X10_TEMP774 = ( y == X10_TEMP772 ) ; final boolean X10_TEMP778 = ( X10_TEMP771 && X10_TEMP774 ) ; final int X10_TEMP775 = ( 205 ) ; final boolean X10_TEMP777 = ( z == X10_TEMP775 ) ; final boolean X10_TEMP780 = ( X10_TEMP778 && X10_TEMP777 ) ; final boolean X10_TEMP794 = ( X10_TEMP781 || X10_TEMP780 ) ; final int X10_TEMP782 = ( 210 ) ; final boolean X10_TEMP784 = ( x == X10_TEMP782 ) ; final int X10_TEMP785 = ( 5 ) ; final boolean X10_TEMP787 = ( y == X10_TEMP785 ) ; final boolean X10_TEMP791 = ( X10_TEMP784 && X10_TEMP787 ) ; final int X10_TEMP788 = ( 246 ) ; final boolean X10_TEMP790 = ( z == X10_TEMP788 ) ; final boolean X10_TEMP793 = ( X10_TEMP791 && X10_TEMP790 ) ; final boolean X10_TEMP807 = ( X10_TEMP794 || X10_TEMP793 ) ; final int X10_TEMP795 = ( 43 ) ; final boolean X10_TEMP797 = ( x == X10_TEMP795 ) ; final int X10_TEMP798 = ( 192 ) ; final boolean X10_TEMP800 = ( y == X10_TEMP798 ) ; final boolean X10_TEMP804 = ( X10_TEMP797 && X10_TEMP800 ) ; final int X10_TEMP801 = ( 232 ) ; final boolean X10_TEMP803 = ( z == X10_TEMP801 ) ; final boolean X10_TEMP806 = ( X10_TEMP804 && X10_TEMP803 ) ; final boolean X10_TEMP820 = ( X10_TEMP807 || X10_TEMP806 ) ; final int X10_TEMP808 = ( 174 ) ; final boolean X10_TEMP810 = ( x == X10_TEMP808 ) ; final int X10_TEMP811 = ( 244 ) ; final boolean X10_TEMP813 = ( y == X10_TEMP811 ) ; final boolean X10_TEMP817 = ( X10_TEMP810 && X10_TEMP813 ) ; final int X10_TEMP814 = ( 162 ) ; final boolean X10_TEMP816 = ( z == X10_TEMP814 ) ; final boolean X10_TEMP819 = ( X10_TEMP817 && X10_TEMP816 ) ; final boolean X10_TEMP833 = ( X10_TEMP820 || X10_TEMP819 ) ; final int X10_TEMP821 = ( 3 ) ; final boolean X10_TEMP823 = ( x == X10_TEMP821 ) ; final int X10_TEMP824 = ( 116 ) ; final boolean X10_TEMP826 = ( y == X10_TEMP824 ) ; final boolean X10_TEMP830 = ( X10_TEMP823 && X10_TEMP826 ) ; final int X10_TEMP827 = ( 173 ) ; final boolean X10_TEMP829 = ( z == X10_TEMP827 ) ; final boolean X10_TEMP832 = ( X10_TEMP830 && X10_TEMP829 ) ; final boolean X10_TEMP846 = ( X10_TEMP833 || X10_TEMP832 ) ; final int X10_TEMP834 = ( 55 ) ; final boolean X10_TEMP836 = ( x == X10_TEMP834 ) ; final int X10_TEMP837 = ( 118 ) ; final boolean X10_TEMP839 = ( y == X10_TEMP837 ) ; final boolean X10_TEMP843 = ( X10_TEMP836 && X10_TEMP839 ) ; final int X10_TEMP840 = ( 165 ) ; final boolean X10_TEMP842 = ( z == X10_TEMP840 ) ; final boolean X10_TEMP845 = ( X10_TEMP843 && X10_TEMP842 ) ; final boolean X10_TEMP848 = ( X10_TEMP846 || X10_TEMP845 ) ; final boolean RX10_TEMP86 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP850 = ( RX10_TEMP86 ) ; final boolean X10_TEMP852 = X10_TEMP848 && X10_TEMP850 ; if ( X10_TEMP852 ) { final double X10_TEMP855 = ( 1 ) ; final double X10_TEMP856 = ( X10_TEMP855 ) ; final Dist3 RX10_TEMP87 = temp . distValue ; final Region3 RX10_TEMP88 = RX10_TEMP87 . dReg ; final int RX10_TEMP89 = Program . searchPointInRegion3 ( RX10_TEMP88 , p ) ; final int RX10_TEMP90 = 0 ; final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP92 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final place RX10_TEMP93 = Program . getPlaceFromDist3 ( RX10_TEMP87 , RX10_TEMP89 ) ; final place RX10_TEMP95 = here ; final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; if ( RX10_TEMP96 ) { String RX10_TEMP94 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP94 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP89 , X10_TEMP856 ) ; }
 break ; }
 case X10_TEMP858 : { final int X10_TEMP859 = ( 397 ) ; final boolean X10_TEMP861 = ( x == X10_TEMP859 ) ; final int X10_TEMP862 = ( 310 ) ; final boolean X10_TEMP864 = ( y == X10_TEMP862 ) ; final boolean X10_TEMP868 = ( X10_TEMP861 && X10_TEMP864 ) ; final int X10_TEMP865 = ( 198 ) ; final boolean X10_TEMP867 = ( z == X10_TEMP865 ) ; final boolean X10_TEMP870 = ( X10_TEMP868 && X10_TEMP867 ) ; final int X10_TEMP871 = ( 94 ) ; final boolean X10_TEMP873 = ( x == X10_TEMP871 ) ; final int X10_TEMP874 = ( 399 ) ; final boolean X10_TEMP876 = ( y == X10_TEMP874 ) ; final boolean X10_TEMP880 = ( X10_TEMP873 && X10_TEMP876 ) ; final int X10_TEMP877 = ( 236 ) ; final boolean X10_TEMP879 = ( z == X10_TEMP877 ) ; final boolean X10_TEMP882 = ( X10_TEMP880 && X10_TEMP879 ) ; final boolean X10_TEMP895 = ( X10_TEMP870 || X10_TEMP882 ) ; final int X10_TEMP883 = ( 221 ) ; final boolean X10_TEMP885 = ( x == X10_TEMP883 ) ; final int X10_TEMP886 = ( 276 ) ; final boolean X10_TEMP888 = ( y == X10_TEMP886 ) ; final boolean X10_TEMP892 = ( X10_TEMP885 && X10_TEMP888 ) ; final int X10_TEMP889 = ( 59 ) ; final boolean X10_TEMP891 = ( z == X10_TEMP889 ) ; final boolean X10_TEMP894 = ( X10_TEMP892 && X10_TEMP891 ) ; final boolean X10_TEMP908 = ( X10_TEMP895 || X10_TEMP894 ) ; final int X10_TEMP896 = ( 342 ) ; final boolean X10_TEMP898 = ( x == X10_TEMP896 ) ; final int X10_TEMP899 = ( 137 ) ; final boolean X10_TEMP901 = ( y == X10_TEMP899 ) ; final boolean X10_TEMP905 = ( X10_TEMP898 && X10_TEMP901 ) ; final int X10_TEMP902 = ( 166 ) ; final boolean X10_TEMP904 = ( z == X10_TEMP902 ) ; final boolean X10_TEMP907 = ( X10_TEMP905 && X10_TEMP904 ) ; final boolean X10_TEMP921 = ( X10_TEMP908 || X10_TEMP907 ) ; final int X10_TEMP909 = ( 381 ) ; final boolean X10_TEMP911 = ( x == X10_TEMP909 ) ; final int X10_TEMP912 = ( 72 ) ; final boolean X10_TEMP914 = ( y == X10_TEMP912 ) ; final boolean X10_TEMP918 = ( X10_TEMP911 && X10_TEMP914 ) ; final int X10_TEMP915 = ( 281 ) ; final boolean X10_TEMP917 = ( z == X10_TEMP915 ) ; final boolean X10_TEMP920 = ( X10_TEMP918 && X10_TEMP917 ) ; final boolean X10_TEMP934 = ( X10_TEMP921 || X10_TEMP920 ) ; final int X10_TEMP922 = ( 350 ) ; final boolean X10_TEMP924 = ( x == X10_TEMP922 ) ; final int X10_TEMP925 = ( 192 ) ; final boolean X10_TEMP927 = ( y == X10_TEMP925 ) ; final boolean X10_TEMP931 = ( X10_TEMP924 && X10_TEMP927 ) ; final int X10_TEMP928 = ( 416 ) ; final boolean X10_TEMP930 = ( z == X10_TEMP928 ) ; final boolean X10_TEMP933 = ( X10_TEMP931 && X10_TEMP930 ) ; final boolean X10_TEMP947 = ( X10_TEMP934 || X10_TEMP933 ) ; final int X10_TEMP935 = ( 16 ) ; final boolean X10_TEMP937 = ( x == X10_TEMP935 ) ; final int X10_TEMP938 = ( 19 ) ; final boolean X10_TEMP940 = ( y == X10_TEMP938 ) ; final boolean X10_TEMP944 = ( X10_TEMP937 && X10_TEMP940 ) ; final int X10_TEMP941 = ( 455 ) ; final boolean X10_TEMP943 = ( z == X10_TEMP941 ) ; final boolean X10_TEMP946 = ( X10_TEMP944 && X10_TEMP943 ) ; final boolean X10_TEMP960 = ( X10_TEMP947 || X10_TEMP946 ) ; final int X10_TEMP948 = ( 152 ) ; final boolean X10_TEMP950 = ( x == X10_TEMP948 ) ; final int X10_TEMP951 = ( 336 ) ; final boolean X10_TEMP953 = ( y == X10_TEMP951 ) ; final boolean X10_TEMP957 = ( X10_TEMP950 && X10_TEMP953 ) ; final int X10_TEMP954 = ( 8 ) ; final boolean X10_TEMP956 = ( z == X10_TEMP954 ) ; final boolean X10_TEMP959 = ( X10_TEMP957 && X10_TEMP956 ) ; final boolean X10_TEMP973 = ( X10_TEMP960 || X10_TEMP959 ) ; final int X10_TEMP961 = ( 400 ) ; final boolean X10_TEMP963 = ( x == X10_TEMP961 ) ; final int X10_TEMP964 = ( 502 ) ; final boolean X10_TEMP966 = ( y == X10_TEMP964 ) ; final boolean X10_TEMP970 = ( X10_TEMP963 && X10_TEMP966 ) ; final int X10_TEMP967 = ( 447 ) ; final boolean X10_TEMP969 = ( z == X10_TEMP967 ) ; final boolean X10_TEMP972 = ( X10_TEMP970 && X10_TEMP969 ) ; final boolean X10_TEMP986 = ( X10_TEMP973 || X10_TEMP972 ) ; final int X10_TEMP974 = ( 72 ) ; final boolean X10_TEMP976 = ( x == X10_TEMP974 ) ; final int X10_TEMP977 = ( 0 ) ; final boolean X10_TEMP979 = ( y == X10_TEMP977 ) ; final boolean X10_TEMP983 = ( X10_TEMP976 && X10_TEMP979 ) ; final int X10_TEMP980 = ( 105 ) ; final boolean X10_TEMP982 = ( z == X10_TEMP980 ) ; final boolean X10_TEMP985 = ( X10_TEMP983 && X10_TEMP982 ) ; final boolean X10_TEMP988 = ( X10_TEMP986 || X10_TEMP985 ) ; final boolean RX10_TEMP97 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP990 = ( RX10_TEMP97 ) ; final boolean X10_TEMP992 = X10_TEMP988 && X10_TEMP990 ; if ( X10_TEMP992 ) { final int X10_TEMP994 = ( 1 ) ; final int X10_TEMP995 = 0 ; final double X10_TEMP997 = ( X10_TEMP995 - X10_TEMP994 ) ; final double X10_TEMP998 = ( X10_TEMP997 ) ; final Dist3 RX10_TEMP98 = temp . distValue ; final Region3 RX10_TEMP99 = RX10_TEMP98 . dReg ; final int RX10_TEMP100 = Program . searchPointInRegion3 ( RX10_TEMP99 , p ) ; final int RX10_TEMP101 = 0 ; final boolean RX10_TEMP102 = RX10_TEMP100 < RX10_TEMP101 ; if ( RX10_TEMP102 ) { String RX10_TEMP103 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP103 ) ; }
 final place RX10_TEMP104 = Program . getPlaceFromDist3 ( RX10_TEMP98 , RX10_TEMP100 ) ; final place RX10_TEMP106 = here ; final boolean RX10_TEMP107 = RX10_TEMP104 != RX10_TEMP106 ; if ( RX10_TEMP107 ) { String RX10_TEMP105 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP105 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP100 , X10_TEMP998 ) ; }
 final int X10_TEMP999 = ( 308 ) ; final boolean X10_TEMP1001 = ( x == X10_TEMP999 ) ; final int X10_TEMP1002 = ( 359 ) ; final boolean X10_TEMP1004 = ( y == X10_TEMP1002 ) ; final boolean X10_TEMP1008 = ( X10_TEMP1001 && X10_TEMP1004 ) ; final int X10_TEMP1005 = ( 9 ) ; final boolean X10_TEMP1007 = ( z == X10_TEMP1005 ) ; final boolean X10_TEMP1010 = ( X10_TEMP1008 && X10_TEMP1007 ) ; final int X10_TEMP1011 = ( 9 ) ; final boolean X10_TEMP1013 = ( x == X10_TEMP1011 ) ; final int X10_TEMP1014 = ( 491 ) ; final boolean X10_TEMP1016 = ( y == X10_TEMP1014 ) ; final boolean X10_TEMP1020 = ( X10_TEMP1013 && X10_TEMP1016 ) ; final int X10_TEMP1017 = ( 116 ) ; final boolean X10_TEMP1019 = ( z == X10_TEMP1017 ) ; final boolean X10_TEMP1022 = ( X10_TEMP1020 && X10_TEMP1019 ) ; final boolean X10_TEMP1035 = ( X10_TEMP1010 || X10_TEMP1022 ) ; final int X10_TEMP1023 = ( 449 ) ; final boolean X10_TEMP1025 = ( x == X10_TEMP1023 ) ; final int X10_TEMP1026 = ( 268 ) ; final boolean X10_TEMP1028 = ( y == X10_TEMP1026 ) ; final boolean X10_TEMP1032 = ( X10_TEMP1025 && X10_TEMP1028 ) ; final int X10_TEMP1029 = ( 441 ) ; final boolean X10_TEMP1031 = ( z == X10_TEMP1029 ) ; final boolean X10_TEMP1034 = ( X10_TEMP1032 && X10_TEMP1031 ) ; final boolean X10_TEMP1048 = ( X10_TEMP1035 || X10_TEMP1034 ) ; final int X10_TEMP1036 = ( 147 ) ; final boolean X10_TEMP1038 = ( x == X10_TEMP1036 ) ; final int X10_TEMP1039 = ( 115 ) ; final boolean X10_TEMP1041 = ( y == X10_TEMP1039 ) ; final boolean X10_TEMP1045 = ( X10_TEMP1038 && X10_TEMP1041 ) ; final int X10_TEMP1042 = ( 197 ) ; final boolean X10_TEMP1044 = ( z == X10_TEMP1042 ) ; final boolean X10_TEMP1047 = ( X10_TEMP1045 && X10_TEMP1044 ) ; final boolean X10_TEMP1061 = ( X10_TEMP1048 || X10_TEMP1047 ) ; final int X10_TEMP1049 = ( 241 ) ; final boolean X10_TEMP1051 = ( x == X10_TEMP1049 ) ; final int X10_TEMP1052 = ( 85 ) ; final boolean X10_TEMP1054 = ( y == X10_TEMP1052 ) ; final boolean X10_TEMP1058 = ( X10_TEMP1051 && X10_TEMP1054 ) ; final int X10_TEMP1055 = ( 3 ) ; final boolean X10_TEMP1057 = ( z == X10_TEMP1055 ) ; final boolean X10_TEMP1060 = ( X10_TEMP1058 && X10_TEMP1057 ) ; final boolean X10_TEMP1074 = ( X10_TEMP1061 || X10_TEMP1060 ) ; final int X10_TEMP1062 = ( 507 ) ; final boolean X10_TEMP1064 = ( x == X10_TEMP1062 ) ; final int X10_TEMP1065 = ( 41 ) ; final boolean X10_TEMP1067 = ( y == X10_TEMP1065 ) ; final boolean X10_TEMP1071 = ( X10_TEMP1064 && X10_TEMP1067 ) ; final int X10_TEMP1068 = ( 125 ) ; final boolean X10_TEMP1070 = ( z == X10_TEMP1068 ) ; final boolean X10_TEMP1073 = ( X10_TEMP1071 && X10_TEMP1070 ) ; final boolean X10_TEMP1087 = ( X10_TEMP1074 || X10_TEMP1073 ) ; final int X10_TEMP1075 = ( 161 ) ; final boolean X10_TEMP1077 = ( x == X10_TEMP1075 ) ; final int X10_TEMP1078 = ( 278 ) ; final boolean X10_TEMP1080 = ( y == X10_TEMP1078 ) ; final boolean X10_TEMP1084 = ( X10_TEMP1077 && X10_TEMP1080 ) ; final int X10_TEMP1081 = ( 73 ) ; final boolean X10_TEMP1083 = ( z == X10_TEMP1081 ) ; final boolean X10_TEMP1086 = ( X10_TEMP1084 && X10_TEMP1083 ) ; final boolean X10_TEMP1100 = ( X10_TEMP1087 || X10_TEMP1086 ) ; final int X10_TEMP1088 = ( 144 ) ; final boolean X10_TEMP1090 = ( x == X10_TEMP1088 ) ; final int X10_TEMP1091 = ( 91 ) ; final boolean X10_TEMP1093 = ( y == X10_TEMP1091 ) ; final boolean X10_TEMP1097 = ( X10_TEMP1090 && X10_TEMP1093 ) ; final int X10_TEMP1094 = ( 310 ) ; final boolean X10_TEMP1096 = ( z == X10_TEMP1094 ) ; final boolean X10_TEMP1099 = ( X10_TEMP1097 && X10_TEMP1096 ) ; final boolean X10_TEMP1113 = ( X10_TEMP1100 || X10_TEMP1099 ) ; final int X10_TEMP1101 = ( 201 ) ; final boolean X10_TEMP1103 = ( x == X10_TEMP1101 ) ; final int X10_TEMP1104 = ( 8 ) ; final boolean X10_TEMP1106 = ( y == X10_TEMP1104 ) ; final boolean X10_TEMP1110 = ( X10_TEMP1103 && X10_TEMP1106 ) ; final int X10_TEMP1107 = ( 49 ) ; final boolean X10_TEMP1109 = ( z == X10_TEMP1107 ) ; final boolean X10_TEMP1112 = ( X10_TEMP1110 && X10_TEMP1109 ) ; final boolean X10_TEMP1126 = ( X10_TEMP1113 || X10_TEMP1112 ) ; final int X10_TEMP1114 = ( 149 ) ; final boolean X10_TEMP1116 = ( x == X10_TEMP1114 ) ; final int X10_TEMP1117 = ( 399 ) ; final boolean X10_TEMP1119 = ( y == X10_TEMP1117 ) ; final boolean X10_TEMP1123 = ( X10_TEMP1116 && X10_TEMP1119 ) ; final int X10_TEMP1120 = ( 329 ) ; final boolean X10_TEMP1122 = ( z == X10_TEMP1120 ) ; final boolean X10_TEMP1125 = ( X10_TEMP1123 && X10_TEMP1122 ) ; final boolean X10_TEMP1128 = ( X10_TEMP1126 || X10_TEMP1125 ) ; final boolean RX10_TEMP108 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP1130 = ( RX10_TEMP108 ) ; final boolean X10_TEMP1132 = X10_TEMP1128 && X10_TEMP1130 ; if ( X10_TEMP1132 ) { final double X10_TEMP1135 = ( 1 ) ; final double X10_TEMP1136 = ( X10_TEMP1135 ) ; final Dist3 RX10_TEMP109 = temp . distValue ; final Region3 RX10_TEMP110 = RX10_TEMP109 . dReg ; final int RX10_TEMP111 = Program . searchPointInRegion3 ( RX10_TEMP110 , p ) ; final int RX10_TEMP112 = 0 ; final boolean RX10_TEMP113 = RX10_TEMP111 < RX10_TEMP112 ; if ( RX10_TEMP113 ) { String RX10_TEMP114 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP114 ) ; }
 final place RX10_TEMP115 = Program . getPlaceFromDist3 ( RX10_TEMP109 , RX10_TEMP111 ) ; final place RX10_TEMP117 = here ; final boolean RX10_TEMP118 = RX10_TEMP115 != RX10_TEMP117 ; if ( RX10_TEMP118 ) { String RX10_TEMP116 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP116 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP111 , X10_TEMP1136 ) ; }
 break ; }
 case X10_TEMP1138 : { final int X10_TEMP1139 = ( 186 ) ; final boolean X10_TEMP1141 = ( x == X10_TEMP1139 ) ; final int X10_TEMP1142 = ( 374 ) ; final boolean X10_TEMP1144 = ( y == X10_TEMP1142 ) ; final boolean X10_TEMP1148 = ( X10_TEMP1141 && X10_TEMP1144 ) ; final int X10_TEMP1145 = ( 694 ) ; final boolean X10_TEMP1147 = ( z == X10_TEMP1145 ) ; final boolean X10_TEMP1150 = ( X10_TEMP1148 && X10_TEMP1147 ) ; final int X10_TEMP1151 = ( 773 ) ; final boolean X10_TEMP1153 = ( x == X10_TEMP1151 ) ; final int X10_TEMP1154 = ( 345 ) ; final boolean X10_TEMP1156 = ( y == X10_TEMP1154 ) ; final boolean X10_TEMP1160 = ( X10_TEMP1153 && X10_TEMP1156 ) ; final int X10_TEMP1157 = ( 474 ) ; final boolean X10_TEMP1159 = ( z == X10_TEMP1157 ) ; final boolean X10_TEMP1162 = ( X10_TEMP1160 && X10_TEMP1159 ) ; final boolean X10_TEMP1175 = ( X10_TEMP1150 || X10_TEMP1162 ) ; final int X10_TEMP1163 = ( 478 ) ; final boolean X10_TEMP1165 = ( x == X10_TEMP1163 ) ; final int X10_TEMP1166 = ( 874 ) ; final boolean X10_TEMP1168 = ( y == X10_TEMP1166 ) ; final boolean X10_TEMP1172 = ( X10_TEMP1165 && X10_TEMP1168 ) ; final int X10_TEMP1169 = ( 804 ) ; final boolean X10_TEMP1171 = ( z == X10_TEMP1169 ) ; final boolean X10_TEMP1174 = ( X10_TEMP1172 && X10_TEMP1171 ) ; final boolean X10_TEMP1188 = ( X10_TEMP1175 || X10_TEMP1174 ) ; final int X10_TEMP1176 = ( 306 ) ; final boolean X10_TEMP1178 = ( x == X10_TEMP1176 ) ; final int X10_TEMP1179 = ( 75 ) ; final boolean X10_TEMP1181 = ( y == X10_TEMP1179 ) ; final boolean X10_TEMP1185 = ( X10_TEMP1178 && X10_TEMP1181 ) ; final int X10_TEMP1182 = ( 624 ) ; final boolean X10_TEMP1184 = ( z == X10_TEMP1182 ) ; final boolean X10_TEMP1187 = ( X10_TEMP1185 && X10_TEMP1184 ) ; final boolean X10_TEMP1201 = ( X10_TEMP1188 || X10_TEMP1187 ) ; final int X10_TEMP1189 = ( 397 ) ; final boolean X10_TEMP1191 = ( x == X10_TEMP1189 ) ; final int X10_TEMP1192 = ( 667 ) ; final boolean X10_TEMP1194 = ( y == X10_TEMP1192 ) ; final boolean X10_TEMP1198 = ( X10_TEMP1191 && X10_TEMP1194 ) ; final int X10_TEMP1195 = ( 49 ) ; final boolean X10_TEMP1197 = ( z == X10_TEMP1195 ) ; final boolean X10_TEMP1200 = ( X10_TEMP1198 && X10_TEMP1197 ) ; final boolean X10_TEMP1214 = ( X10_TEMP1201 || X10_TEMP1200 ) ; final int X10_TEMP1202 = ( 606 ) ; final boolean X10_TEMP1204 = ( x == X10_TEMP1202 ) ; final int X10_TEMP1205 = ( 199 ) ; final boolean X10_TEMP1207 = ( y == X10_TEMP1205 ) ; final boolean X10_TEMP1211 = ( X10_TEMP1204 && X10_TEMP1207 ) ; final int X10_TEMP1208 = ( 59 ) ; final boolean X10_TEMP1210 = ( z == X10_TEMP1208 ) ; final boolean X10_TEMP1213 = ( X10_TEMP1211 && X10_TEMP1210 ) ; final boolean X10_TEMP1227 = ( X10_TEMP1214 || X10_TEMP1213 ) ; final int X10_TEMP1215 = ( 892 ) ; final boolean X10_TEMP1217 = ( x == X10_TEMP1215 ) ; final int X10_TEMP1218 = ( 70 ) ; final boolean X10_TEMP1220 = ( y == X10_TEMP1218 ) ; final boolean X10_TEMP1224 = ( X10_TEMP1217 && X10_TEMP1220 ) ; final int X10_TEMP1221 = ( 361 ) ; final boolean X10_TEMP1223 = ( z == X10_TEMP1221 ) ; final boolean X10_TEMP1226 = ( X10_TEMP1224 && X10_TEMP1223 ) ; final boolean X10_TEMP1240 = ( X10_TEMP1227 || X10_TEMP1226 ) ; final int X10_TEMP1228 = ( 844 ) ; final boolean X10_TEMP1230 = ( x == X10_TEMP1228 ) ; final int X10_TEMP1231 = ( 261 ) ; final boolean X10_TEMP1233 = ( y == X10_TEMP1231 ) ; final boolean X10_TEMP1237 = ( X10_TEMP1230 && X10_TEMP1233 ) ; final int X10_TEMP1234 = ( 252 ) ; final boolean X10_TEMP1236 = ( z == X10_TEMP1234 ) ; final boolean X10_TEMP1239 = ( X10_TEMP1237 && X10_TEMP1236 ) ; final boolean X10_TEMP1253 = ( X10_TEMP1240 || X10_TEMP1239 ) ; final int X10_TEMP1241 = ( 221 ) ; final boolean X10_TEMP1243 = ( x == X10_TEMP1241 ) ; final int X10_TEMP1244 = ( 906 ) ; final boolean X10_TEMP1246 = ( y == X10_TEMP1244 ) ; final boolean X10_TEMP1250 = ( X10_TEMP1243 && X10_TEMP1246 ) ; final int X10_TEMP1247 = ( 14 ) ; final boolean X10_TEMP1249 = ( z == X10_TEMP1247 ) ; final boolean X10_TEMP1252 = ( X10_TEMP1250 && X10_TEMP1249 ) ; final boolean X10_TEMP1266 = ( X10_TEMP1253 || X10_TEMP1252 ) ; final int X10_TEMP1254 = ( 85 ) ; final boolean X10_TEMP1256 = ( x == X10_TEMP1254 ) ; final int X10_TEMP1257 = ( 327 ) ; final boolean X10_TEMP1259 = ( y == X10_TEMP1257 ) ; final boolean X10_TEMP1263 = ( X10_TEMP1256 && X10_TEMP1259 ) ; final int X10_TEMP1260 = ( 232 ) ; final boolean X10_TEMP1262 = ( z == X10_TEMP1260 ) ; final boolean X10_TEMP1265 = ( X10_TEMP1263 && X10_TEMP1262 ) ; final boolean X10_TEMP1268 = ( X10_TEMP1266 || X10_TEMP1265 ) ; final boolean RX10_TEMP119 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP1270 = ( RX10_TEMP119 ) ; final boolean X10_TEMP1272 = X10_TEMP1268 && X10_TEMP1270 ; if ( X10_TEMP1272 ) { final int X10_TEMP1274 = ( 1 ) ; final int X10_TEMP1275 = 0 ; final double X10_TEMP1277 = ( X10_TEMP1275 - X10_TEMP1274 ) ; final double X10_TEMP1278 = ( X10_TEMP1277 ) ; final Dist3 RX10_TEMP120 = temp . distValue ; final Region3 RX10_TEMP121 = RX10_TEMP120 . dReg ; final int RX10_TEMP122 = Program . searchPointInRegion3 ( RX10_TEMP121 , p ) ; final int RX10_TEMP123 = 0 ; final boolean RX10_TEMP124 = RX10_TEMP122 < RX10_TEMP123 ; if ( RX10_TEMP124 ) { String RX10_TEMP125 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP125 ) ; }
 final place RX10_TEMP126 = Program . getPlaceFromDist3 ( RX10_TEMP120 , RX10_TEMP122 ) ; final place RX10_TEMP128 = here ; final boolean RX10_TEMP129 = RX10_TEMP126 != RX10_TEMP128 ; if ( RX10_TEMP129 ) { String RX10_TEMP127 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP127 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP122 , X10_TEMP1278 ) ; }
 final int X10_TEMP1279 = ( 739 ) ; final boolean X10_TEMP1281 = ( x == X10_TEMP1279 ) ; final int X10_TEMP1282 = ( 879 ) ; final boolean X10_TEMP1284 = ( y == X10_TEMP1282 ) ; final boolean X10_TEMP1288 = ( X10_TEMP1281 && X10_TEMP1284 ) ; final int X10_TEMP1285 = ( 781 ) ; final boolean X10_TEMP1287 = ( z == X10_TEMP1285 ) ; final boolean X10_TEMP1290 = ( X10_TEMP1288 && X10_TEMP1287 ) ; final int X10_TEMP1291 = ( 742 ) ; final boolean X10_TEMP1293 = ( x == X10_TEMP1291 ) ; final int X10_TEMP1294 = ( 641 ) ; final boolean X10_TEMP1296 = ( y == X10_TEMP1294 ) ; final boolean X10_TEMP1300 = ( X10_TEMP1293 && X10_TEMP1296 ) ; final int X10_TEMP1297 = ( 147 ) ; final boolean X10_TEMP1299 = ( z == X10_TEMP1297 ) ; final boolean X10_TEMP1302 = ( X10_TEMP1300 && X10_TEMP1299 ) ; final boolean X10_TEMP1315 = ( X10_TEMP1290 || X10_TEMP1302 ) ; final int X10_TEMP1303 = ( 335 ) ; final boolean X10_TEMP1305 = ( x == X10_TEMP1303 ) ; final int X10_TEMP1306 = ( 295 ) ; final boolean X10_TEMP1308 = ( y == X10_TEMP1306 ) ; final boolean X10_TEMP1312 = ( X10_TEMP1305 && X10_TEMP1308 ) ; final int X10_TEMP1309 = ( 600 ) ; final boolean X10_TEMP1311 = ( z == X10_TEMP1309 ) ; final boolean X10_TEMP1314 = ( X10_TEMP1312 && X10_TEMP1311 ) ; final boolean X10_TEMP1328 = ( X10_TEMP1315 || X10_TEMP1314 ) ; final int X10_TEMP1316 = ( 982 ) ; final boolean X10_TEMP1318 = ( x == X10_TEMP1316 ) ; final int X10_TEMP1319 = ( 944 ) ; final boolean X10_TEMP1321 = ( y == X10_TEMP1319 ) ; final boolean X10_TEMP1325 = ( X10_TEMP1318 && X10_TEMP1321 ) ; final int X10_TEMP1322 = ( 696 ) ; final boolean X10_TEMP1324 = ( z == X10_TEMP1322 ) ; final boolean X10_TEMP1327 = ( X10_TEMP1325 && X10_TEMP1324 ) ; final boolean X10_TEMP1341 = ( X10_TEMP1328 || X10_TEMP1327 ) ; final int X10_TEMP1329 = ( 622 ) ; final boolean X10_TEMP1331 = ( x == X10_TEMP1329 ) ; final int X10_TEMP1332 = ( 881 ) ; final boolean X10_TEMP1334 = ( y == X10_TEMP1332 ) ; final boolean X10_TEMP1338 = ( X10_TEMP1331 && X10_TEMP1334 ) ; final int X10_TEMP1335 = ( 180 ) ; final boolean X10_TEMP1337 = ( z == X10_TEMP1335 ) ; final boolean X10_TEMP1340 = ( X10_TEMP1338 && X10_TEMP1337 ) ; final boolean X10_TEMP1354 = ( X10_TEMP1341 || X10_TEMP1340 ) ; final int X10_TEMP1342 = ( 956 ) ; final boolean X10_TEMP1344 = ( x == X10_TEMP1342 ) ; final int X10_TEMP1345 = ( 217 ) ; final boolean X10_TEMP1347 = ( y == X10_TEMP1345 ) ; final boolean X10_TEMP1351 = ( X10_TEMP1344 && X10_TEMP1347 ) ; final int X10_TEMP1348 = ( 952 ) ; final boolean X10_TEMP1350 = ( z == X10_TEMP1348 ) ; final boolean X10_TEMP1353 = ( X10_TEMP1351 && X10_TEMP1350 ) ; final boolean X10_TEMP1367 = ( X10_TEMP1354 || X10_TEMP1353 ) ; final int X10_TEMP1355 = ( 777 ) ; final boolean X10_TEMP1357 = ( x == X10_TEMP1355 ) ; final int X10_TEMP1358 = ( 453 ) ; final boolean X10_TEMP1360 = ( y == X10_TEMP1358 ) ; final boolean X10_TEMP1364 = ( X10_TEMP1357 && X10_TEMP1360 ) ; final int X10_TEMP1361 = ( 706 ) ; final boolean X10_TEMP1363 = ( z == X10_TEMP1361 ) ; final boolean X10_TEMP1366 = ( X10_TEMP1364 && X10_TEMP1363 ) ; final boolean X10_TEMP1380 = ( X10_TEMP1367 || X10_TEMP1366 ) ; final int X10_TEMP1368 = ( 258 ) ; final boolean X10_TEMP1370 = ( x == X10_TEMP1368 ) ; final int X10_TEMP1371 = ( 730 ) ; final boolean X10_TEMP1373 = ( y == X10_TEMP1371 ) ; final boolean X10_TEMP1377 = ( X10_TEMP1370 && X10_TEMP1373 ) ; final int X10_TEMP1374 = ( 482 ) ; final boolean X10_TEMP1376 = ( z == X10_TEMP1374 ) ; final boolean X10_TEMP1379 = ( X10_TEMP1377 && X10_TEMP1376 ) ; final boolean X10_TEMP1393 = ( X10_TEMP1380 || X10_TEMP1379 ) ; final int X10_TEMP1381 = ( 271 ) ; final boolean X10_TEMP1383 = ( x == X10_TEMP1381 ) ; final int X10_TEMP1384 = ( 75 ) ; final boolean X10_TEMP1386 = ( y == X10_TEMP1384 ) ; final boolean X10_TEMP1390 = ( X10_TEMP1383 && X10_TEMP1386 ) ; final int X10_TEMP1387 = ( 815 ) ; final boolean X10_TEMP1389 = ( z == X10_TEMP1387 ) ; final boolean X10_TEMP1392 = ( X10_TEMP1390 && X10_TEMP1389 ) ; final boolean X10_TEMP1406 = ( X10_TEMP1393 || X10_TEMP1392 ) ; final int X10_TEMP1394 = ( 78 ) ; final boolean X10_TEMP1396 = ( x == X10_TEMP1394 ) ; final int X10_TEMP1397 = ( 276 ) ; final boolean X10_TEMP1399 = ( y == X10_TEMP1397 ) ; final boolean X10_TEMP1403 = ( X10_TEMP1396 && X10_TEMP1399 ) ; final int X10_TEMP1400 = ( 250 ) ; final boolean X10_TEMP1402 = ( z == X10_TEMP1400 ) ; final boolean X10_TEMP1405 = ( X10_TEMP1403 && X10_TEMP1402 ) ; final boolean X10_TEMP1408 = ( X10_TEMP1406 || X10_TEMP1405 ) ; final boolean RX10_TEMP130 = Program . regionContainsPoint3 ( R , p ) ; final boolean X10_TEMP1410 = ( RX10_TEMP130 ) ; final boolean X10_TEMP1412 = X10_TEMP1408 && X10_TEMP1410 ; if ( X10_TEMP1412 ) { final double X10_TEMP1415 = ( 1 ) ; final double X10_TEMP1416 = ( X10_TEMP1415 ) ; final Dist3 RX10_TEMP131 = temp . distValue ; final Region3 RX10_TEMP132 = RX10_TEMP131 . dReg ; final int RX10_TEMP133 = Program . searchPointInRegion3 ( RX10_TEMP132 , p ) ; final int RX10_TEMP134 = 0 ; final boolean RX10_TEMP135 = RX10_TEMP133 < RX10_TEMP134 ; if ( RX10_TEMP135 ) { String RX10_TEMP136 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP136 ) ; }
 final place RX10_TEMP137 = Program . getPlaceFromDist3 ( RX10_TEMP131 , RX10_TEMP133 ) ; final place RX10_TEMP139 = here ; final boolean RX10_TEMP140 = RX10_TEMP137 != RX10_TEMP139 ; if ( RX10_TEMP140 ) { String RX10_TEMP138 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP138 ) ; }
 Program . setRefArrayValue3double ( temp , RX10_TEMP133 , X10_TEMP1416 ) ; }
 break ; }
 } }
 }
 public static void thread67(final T67 utmpz) {final  double tp = utmpz.tp;
final  Point3 p = utmpz.p;
final  doubleRefArray3 u = utmpz.u;
 { final double X10_TEMP23 = ( tp ) ; final Dist3 RX10_TEMP47 = u . distValue ; final Region3 RX10_TEMP48 = RX10_TEMP47 . dReg ; final int RX10_TEMP49 = Program . searchPointInRegion3 ( RX10_TEMP48 , p ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final place RX10_TEMP53 = Program . getPlaceFromDist3 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ; final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array u" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 Program . setRefArrayValue3double ( u , RX10_TEMP49 , X10_TEMP23 ) ; }
 }
 public static void thread68(final T68 utmpz) {final  int i = utmpz.i;
final  int j = utmpz.j;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { final int jj = ( j ) ; final Region3 X10_TEMP14 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP18 = X10_TEMP14 . regSize ; final int RX10_TEMP19 = 0 ; boolean RX10_TEMP20 = i < RX10_TEMP19 ; boolean RX10_TEMP21 = i >= RX10_TEMP18 ; RX10_TEMP20 = RX10_TEMP20 || RX10_TEMP21 ; if ( RX10_TEMP20 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final Point3 RX10_TEMP23 = Program . regionOrdinalPoint3 ( X10_TEMP14 , i ) ; final int RX10_TEMP24 = RX10_TEMP23 . f0 ; final int dest0 = ( RX10_TEMP24 ) ; final Region3 X10_TEMP17 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP25 = X10_TEMP17 . regSize ; final int RX10_TEMP26 = 0 ; boolean RX10_TEMP27 = i < RX10_TEMP26 ; boolean RX10_TEMP28 = i >= RX10_TEMP25 ; RX10_TEMP27 = RX10_TEMP27 || RX10_TEMP28 ; if ( RX10_TEMP27 ) { String RX10_TEMP29 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 final Point3 RX10_TEMP30 = Program . regionOrdinalPoint3 ( X10_TEMP17 , i ) ; final int RX10_TEMP31 = RX10_TEMP30 . f1 ; final int dest1 = ( RX10_TEMP31 ) ; final Region3 X10_TEMP20 = X10_TEMP0 . m_placeGrid ; final int RX10_TEMP32 = X10_TEMP20 . regSize ; final int RX10_TEMP33 = 0 ; boolean RX10_TEMP34 = i < RX10_TEMP33 ; boolean RX10_TEMP35 = i >= RX10_TEMP32 ; RX10_TEMP34 = RX10_TEMP34 || RX10_TEMP35 ; if ( RX10_TEMP34 ) { String RX10_TEMP36 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final Point3 RX10_TEMP37 = Program . regionOrdinalPoint3 ( X10_TEMP20 , i ) ; final int RX10_TEMP38 = RX10_TEMP37 . f2 ; final int dest2 = ( RX10_TEMP38 ) ; final int ii = ( i ) ; finish { final Region1 X10_TEMP27 = Program . createNewRegion1R ( _LevelData_LOW , _LevelData_HIGH ) ; final place X10_TEMP28 = here ; final int RX10_TEMP43 = 1 ; int RX10_TEMP41 = X10_TEMP27 . regSize ; RX10_TEMP41 = RX10_TEMP41 - RX10_TEMP43 ; final region ( : rank==1 ) RX10_TEMP42 = [ 0 : RX10_TEMP41 ] ; for ( point ( : rank==1 ) RX10_TEMP39 : RX10_TEMP42 ) { final int RX10_TEMP44 = RX10_TEMP39 [0] ; final Point1 RX10_TEMP40 = Program . regionOrdinalPoint1 ( X10_TEMP27 , RX10_TEMP44 ) ; final int p = RX10_TEMP40 . f0 ; 
 final T91 utmp91 = new T91(p, ii, dest2, dest1, dest0, jj, X10_TEMP0);
 async (X10_TEMP28) {Program.thread91(utmp91); }
 }
 }
 }
 }
 public static void thread69(final T69 utmpz) {final  Region3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread70(final T70 utmpz) {final  Region3 temp3 = utmpz.temp3;
final  Region3RefArray1 aRecv = utmpz.aRecv;
 { final int X10_TEMP24 = ( 0 ) ; final Region3 X10_TEMP26 = temp3 ; final Point1 RX10_TEMP40 = new Point1 ( X10_TEMP24 ) ; final Dist1 RX10_TEMP41 = aRecv . distValue ; final Region1 RX10_TEMP42 = RX10_TEMP41 . dReg ; final int RX10_TEMP43 = Program . searchPointInRegion1 ( RX10_TEMP42 , RX10_TEMP40 ) ; final int RX10_TEMP44 = 0 ; final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP46 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 final place RX10_TEMP47 = Program . getPlaceFromDist1 ( RX10_TEMP41 , RX10_TEMP43 ) ; final place RX10_TEMP49 = here ; final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP48 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 Program . setRefArrayValue1Region3 ( aRecv , RX10_TEMP43 , X10_TEMP26 ) ; }
 }
 public static void thread71(final T71 utmpz) {final  Region3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread72(final T72 utmpz) {final  Region3 temp3 = utmpz.temp3;
final  Region3RefArray1 aRecv = utmpz.aRecv;
 { final int X10_TEMP24 = ( 0 ) ; final Region3 X10_TEMP26 = temp3 ; final Point1 RX10_TEMP40 = new Point1 ( X10_TEMP24 ) ; final Dist1 RX10_TEMP41 = aRecv . distValue ; final Region1 RX10_TEMP42 = RX10_TEMP41 . dReg ; final int RX10_TEMP43 = Program . searchPointInRegion1 ( RX10_TEMP42 , RX10_TEMP40 ) ; final int RX10_TEMP44 = 0 ; final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP46 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 final place RX10_TEMP47 = Program . getPlaceFromDist1 ( RX10_TEMP41 , RX10_TEMP43 ) ; final place RX10_TEMP49 = here ; final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP48 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 Program . setRefArrayValue1Region3 ( aRecv , RX10_TEMP43 , X10_TEMP26 ) ; }
 }
 public static void thread73(final T73 utmpz) {final  Region3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread74(final T74 utmpz) {final  Region3 temp4 = utmpz.temp4;
final  Region3RefArray1 aRecv = utmpz.aRecv;
 { final int X10_TEMP26 = ( 0 ) ; final Region3 X10_TEMP28 = temp4 ; final Point1 RX10_TEMP40 = new Point1 ( X10_TEMP26 ) ; final Dist1 RX10_TEMP41 = aRecv . distValue ; final Region1 RX10_TEMP42 = RX10_TEMP41 . dReg ; final int RX10_TEMP43 = Program . searchPointInRegion1 ( RX10_TEMP42 , RX10_TEMP40 ) ; final int RX10_TEMP44 = 0 ; final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP46 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 final place RX10_TEMP47 = Program . getPlaceFromDist1 ( RX10_TEMP41 , RX10_TEMP43 ) ; final place RX10_TEMP49 = here ; final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP48 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 Program . setRefArrayValue1Region3 ( aRecv , RX10_TEMP43 , X10_TEMP28 ) ; }
 }
 public static void thread75(final T75 utmpz) {final  WrapperStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  WrapperStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread76(final T76 utmpz) {final  Wrapper temp4 = utmpz.temp4;
final  WrapperRefArray1 aRecv = utmpz.aRecv;
 { final int X10_TEMP23 = ( 0 ) ; final Wrapper X10_TEMP25 = ( temp4 ) ; final Point1 RX10_TEMP40 = new Point1 ( X10_TEMP23 ) ; final Dist1 RX10_TEMP41 = aRecv . distValue ; final Region1 RX10_TEMP42 = RX10_TEMP41 . dReg ; final int RX10_TEMP43 = Program . searchPointInRegion1 ( RX10_TEMP42 , RX10_TEMP40 ) ; final int RX10_TEMP44 = 0 ; final boolean RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP46 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 final place RX10_TEMP47 = Program . getPlaceFromDist1 ( RX10_TEMP41 , RX10_TEMP43 ) ; final place RX10_TEMP49 = here ; final boolean RX10_TEMP50 = RX10_TEMP47 != RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP48 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 Program . setRefArrayValue1Wrapper ( aRecv , RX10_TEMP43 , X10_TEMP25 ) ; }
 }
 public static void thread77(final T77 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public static void thread78(final T78 utmpz) {final  double localSum = utmpz.localSum;
final  int index = utmpz.index;
final  doubleRefArray1 localSumArray = utmpz.localSumArray;
 { final Point1 RX10_TEMP51 = new Point1 ( index ) ; final Dist1 RX10_TEMP52 = localSumArray . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array localSumArray" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 Program . setRefArrayValue1double ( localSumArray , RX10_TEMP54 , localSum ) ; }
 }
 public static void thread89(final T89 utmpz) {final  doubleStub RX10_TEMP64 = utmpz.RX10_TEMP64;
final  point ( : rank==1 ) RX10_TEMP56 = utmpz.RX10_TEMP56;
final  doubleStub [ : rank==1 ] RX10_TEMP55 = utmpz.RX10_TEMP55;
 { RX10_TEMP55 [ RX10_TEMP56 ] = ( RX10_TEMP64 ) ; }
 }
 public static void thread90(final T90 utmpz) {final  double temp3 = utmpz.temp3;
final  doubleRefArray1 aRecv = utmpz.aRecv;
 { final int X10_TEMP38 = ( 0 ) ; final double X10_TEMP40 = ( temp3 ) ; final Point1 RX10_TEMP98 = new Point1 ( X10_TEMP38 ) ; final Dist1 RX10_TEMP99 = aRecv . distValue ; final Region1 RX10_TEMP100 = RX10_TEMP99 . dReg ; final int RX10_TEMP101 = Program . searchPointInRegion1 ( RX10_TEMP100 , RX10_TEMP98 ) ; final int RX10_TEMP102 = 0 ; final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP104 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP104 ) ; }
 final place RX10_TEMP105 = Program . getPlaceFromDist1 ( RX10_TEMP99 , RX10_TEMP101 ) ; final place RX10_TEMP107 = here ; final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107 ; if ( RX10_TEMP108 ) { String RX10_TEMP106 = "Bad place access for array aRecv" ; throw new RuntimeException ( RX10_TEMP106 ) ; }
 Program . setRefArrayValue1double ( aRecv , RX10_TEMP101 , X10_TEMP40 ) ; }
 }
 public static void thread91(final T91 utmpz) {final  int p = utmpz.p;
final  int ii = utmpz.ii;
final  int dest2 = utmpz.dest2;
final  int dest1 = utmpz.dest1;
final  int dest0 = utmpz.dest0;
final  int jj = utmpz.jj;
final  LevelData X10_TEMP0 = utmpz.X10_TEMP0;
 { int disp0 = ( 0 ) ; int disp1 = ( 0 ) ; int disp2 = ( 0 ) ; int trans0 = ( 0 ) ; int trans1 = ( 0 ) ; int trans2 = ( 0 ) ; int sourceID = ( 0 ) ; int k = ( 0 ) ; final boolean X10_TEMP38 = p == _LevelData_LOW ; if ( X10_TEMP38 ) { final int X10_TEMP39 = ( 2 ) ; final int X10_TEMP41 = ( jj * X10_TEMP39 ) ; k = ( X10_TEMP41 ) ; final int X10_TEMP42 = ( 0 ) ; final boolean X10_TEMP43 = jj == X10_TEMP42 ; int X10_TEMP46 = 0 ; if ( X10_TEMP43 ) { X10_TEMP46 = 1 ; }
 final int X10_TEMP47 = X10_TEMP46 ; final int X10_TEMP48 = ( X10_TEMP47 ) ; disp0 = ( X10_TEMP48 ) ; final int X10_TEMP50 = ( 1 ) ; final boolean X10_TEMP51 = jj == X10_TEMP50 ; int X10_TEMP54 = 0 ; if ( X10_TEMP51 ) { X10_TEMP54 = 1 ; }
 final int X10_TEMP55 = X10_TEMP54 ; final int X10_TEMP56 = ( X10_TEMP55 ) ; disp1 = ( X10_TEMP56 ) ; final int X10_TEMP58 = ( 2 ) ; final boolean X10_TEMP59 = jj == X10_TEMP58 ; int X10_TEMP62 = 0 ; if ( X10_TEMP59 ) { X10_TEMP62 = 1 ; }
 final int X10_TEMP63 = X10_TEMP62 ; final int X10_TEMP64 = ( X10_TEMP63 ) ; disp2 = ( X10_TEMP64 ) ; }
 else { final int X10_TEMP66 = ( 2 ) ; final int X10_TEMP67 = ( jj * X10_TEMP66 ) ; final int X10_TEMP68 = ( 1 ) ; final int X10_TEMP70 = ( X10_TEMP67 + X10_TEMP68 ) ; k = ( X10_TEMP70 ) ; final int X10_TEMP71 = ( 0 ) ; final boolean X10_TEMP72 = jj == X10_TEMP71 ; final int X10_TEMP73 = ( 1 ) ; final int X10_TEMP74 = 0 ; int X10_TEMP77 = 0 ; if ( X10_TEMP72 ) { X10_TEMP77 = X10_TEMP74 - X10_TEMP73 ; }
 final int X10_TEMP78 = X10_TEMP77 ; final int X10_TEMP79 = ( X10_TEMP78 ) ; disp0 = ( X10_TEMP79 ) ; final int X10_TEMP81 = ( 1 ) ; final boolean X10_TEMP82 = jj == X10_TEMP81 ; final int X10_TEMP83 = ( 1 ) ; final int X10_TEMP84 = 0 ; int X10_TEMP87 = 0 ; if ( X10_TEMP82 ) { X10_TEMP87 = X10_TEMP84 - X10_TEMP83 ; }
 final int X10_TEMP88 = X10_TEMP87 ; final int X10_TEMP89 = ( X10_TEMP88 ) ; disp1 = ( X10_TEMP89 ) ; final int X10_TEMP91 = ( 2 ) ; final boolean X10_TEMP92 = jj == X10_TEMP91 ; final int X10_TEMP93 = ( 1 ) ; final int X10_TEMP94 = 0 ; int X10_TEMP97 = 0 ; if ( X10_TEMP92 ) { X10_TEMP97 = X10_TEMP94 - X10_TEMP93 ; }
 final int X10_TEMP98 = X10_TEMP97 ; final int X10_TEMP99 = ( X10_TEMP98 ) ; disp2 = ( X10_TEMP99 ) ; }
 int source0 = ( dest0 - disp0 ) ; int source1 = ( dest1 - disp1 ) ; int source2 = ( dest2 - disp2 ) ; final Region3 X10_TEMP104 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP45 = new Point3 ( source0 , source1 , source2 ) ; final boolean RX10_TEMP46 = Program . regionContainsPoint3 ( X10_TEMP104 , RX10_TEMP45 ) ; final boolean X10_TEMP109 = RX10_TEMP46 ; if ( X10_TEMP109 ) { final Region3 X10_TEMP110 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP47 = new Point3 ( source0 , source1 , source2 ) ; final int RX10_TEMP48 = Program . searchPointInRegion3 ( X10_TEMP110 , RX10_TEMP47 ) ; final int RX10_TEMP49 = 0 ; final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP51 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final int X10_TEMP115 = ( RX10_TEMP48 ) ; sourceID = ( X10_TEMP115 ) ; final Wrapper X10_TEMP117 = ( Program . LevelData_get_m_u ( X10_TEMP0 , ii ) ) ; final doubleRefArray3 X10_TEMP118 = X10_TEMP117 . m_array ; doubleRefArray3 ma = X10_TEMP118 ; final Wrapper X10_TEMP121 = ( Program . LevelData_get_m_u ( X10_TEMP0 , ii ) ) ; final doubleRefArray3 X10_TEMP122 = X10_TEMP121 . m_array ; final Region3 X10_TEMP126 = Program . LevelData_get_m_boundaries ( X10_TEMP0 , k , ii ) ; final Wrapper X10_TEMP129 = ( Program . LevelData_get_m_u ( X10_TEMP0 , sourceID ) ) ; final doubleRefArray3 X10_TEMP130 = X10_TEMP129 . m_array ; Program . Util_arraycopy3 ( X10_TEMP122 , X10_TEMP126 , X10_TEMP130 ) ; }
 else { final int X10_TEMP132 = ( 0 ) ; final boolean X10_TEMP134 = jj == X10_TEMP132 ; if ( X10_TEMP134 ) { final int X10_TEMP135 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP136 = ( 1 ) ; final int X10_TEMP138 = ( X10_TEMP135 - X10_TEMP136 ) ; final int X10_TEMP139 = ( disp0 * X10_TEMP138 ) ; final int X10_TEMP141 = ( dest0 + X10_TEMP139 ) ; source0 = ( X10_TEMP141 ) ; final int X10_TEMP142 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP143 = ( 1 ) ; final int X10_TEMP145 = ( X10_TEMP142 - X10_TEMP143 ) ; final int X10_TEMP146 = ( disp1 * X10_TEMP145 ) ; final int X10_TEMP148 = ( dest1 + X10_TEMP146 ) ; source1 = ( X10_TEMP148 ) ; final int X10_TEMP149 = ( X10_TEMP0 . m_block0 ) ; final int X10_TEMP150 = ( 1 ) ; final int X10_TEMP152 = ( X10_TEMP149 - X10_TEMP150 ) ; final int X10_TEMP153 = ( disp2 * X10_TEMP152 ) ; final int X10_TEMP155 = ( dest2 + X10_TEMP153 ) ; source2 = ( X10_TEMP155 ) ; }
 else { final int X10_TEMP156 = ( 1 ) ; final boolean X10_TEMP158 = jj == X10_TEMP156 ; if ( X10_TEMP158 ) { final int X10_TEMP159 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP160 = ( 1 ) ; final int X10_TEMP162 = ( X10_TEMP159 - X10_TEMP160 ) ; final int X10_TEMP163 = ( disp0 * X10_TEMP162 ) ; final int X10_TEMP165 = ( dest0 + X10_TEMP163 ) ; source0 = ( X10_TEMP165 ) ; final int X10_TEMP166 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP167 = ( 1 ) ; final int X10_TEMP169 = ( X10_TEMP166 - X10_TEMP167 ) ; final int X10_TEMP170 = ( disp1 * X10_TEMP169 ) ; final int X10_TEMP172 = ( dest1 + X10_TEMP170 ) ; source1 = ( X10_TEMP172 ) ; final int X10_TEMP173 = ( X10_TEMP0 . m_block1 ) ; final int X10_TEMP174 = ( 1 ) ; final int X10_TEMP176 = ( X10_TEMP173 - X10_TEMP174 ) ; final int X10_TEMP177 = ( disp2 * X10_TEMP176 ) ; final int X10_TEMP179 = ( dest2 + X10_TEMP177 ) ; source2 = ( X10_TEMP179 ) ; }
 else { final int X10_TEMP180 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP181 = ( 1 ) ; final int X10_TEMP183 = ( X10_TEMP180 - X10_TEMP181 ) ; final int X10_TEMP184 = ( disp0 * X10_TEMP183 ) ; final int X10_TEMP186 = ( dest0 + X10_TEMP184 ) ; source0 = ( X10_TEMP186 ) ; final int X10_TEMP187 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP188 = ( 1 ) ; final int X10_TEMP190 = ( X10_TEMP187 - X10_TEMP188 ) ; final int X10_TEMP191 = ( disp1 * X10_TEMP190 ) ; final int X10_TEMP193 = ( dest1 + X10_TEMP191 ) ; source1 = ( X10_TEMP193 ) ; final int X10_TEMP194 = ( X10_TEMP0 . m_block2 ) ; final int X10_TEMP195 = ( 1 ) ; final int X10_TEMP197 = ( X10_TEMP194 - X10_TEMP195 ) ; final int X10_TEMP198 = ( disp2 * X10_TEMP197 ) ; final int X10_TEMP200 = ( dest2 + X10_TEMP198 ) ; source2 = ( X10_TEMP200 ) ; }
 }
 final Region3 X10_TEMP201 = X10_TEMP0 . m_placeGrid ; final Point3 RX10_TEMP52 = new Point3 ( source0 , source1 , source2 ) ; final int RX10_TEMP53 = Program . searchPointInRegion3 ( X10_TEMP201 , RX10_TEMP52 ) ; final int RX10_TEMP54 = 0 ; final boolean RX10_TEMP55 = RX10_TEMP53 < RX10_TEMP54 ; if ( RX10_TEMP55 ) { String RX10_TEMP56 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP56 ) ; }
 final int X10_TEMP206 = ( RX10_TEMP53 ) ; sourceID = ( X10_TEMP206 ) ; final int X10_TEMP207 = ( 0 ) ; final boolean X10_TEMP209 = jj == X10_TEMP207 ; if ( X10_TEMP209 ) { final int X10_TEMP210 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP212 = ( disp0 * X10_TEMP210 ) ; trans0 = ( X10_TEMP212 ) ; final int X10_TEMP213 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP215 = ( disp1 * X10_TEMP213 ) ; trans1 = ( X10_TEMP215 ) ; final int X10_TEMP216 = ( X10_TEMP0 . m_size0 ) ; final int X10_TEMP218 = ( disp2 * X10_TEMP216 ) ; trans2 = ( X10_TEMP218 ) ; }
 else { final int X10_TEMP219 = ( 1 ) ; final boolean X10_TEMP221 = jj == X10_TEMP219 ; if ( X10_TEMP221 ) { final int X10_TEMP222 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP224 = ( disp0 * X10_TEMP222 ) ; trans0 = ( X10_TEMP224 ) ; final int X10_TEMP225 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP227 = ( disp1 * X10_TEMP225 ) ; trans1 = ( X10_TEMP227 ) ; final int X10_TEMP228 = ( X10_TEMP0 . m_size1 ) ; final int X10_TEMP230 = ( disp2 * X10_TEMP228 ) ; trans2 = ( X10_TEMP230 ) ; }
 else { final int X10_TEMP231 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP233 = ( disp0 * X10_TEMP231 ) ; trans0 = ( X10_TEMP233 ) ; final int X10_TEMP234 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP236 = ( disp1 * X10_TEMP234 ) ; trans1 = ( X10_TEMP236 ) ; final int X10_TEMP237 = ( X10_TEMP0 . m_size2 ) ; final int X10_TEMP239 = ( disp2 * X10_TEMP237 ) ; trans2 = ( X10_TEMP239 ) ; }
 }
 final Wrapper X10_TEMP241 = ( Program . LevelData_get_m_u ( X10_TEMP0 , ii ) ) ; final doubleRefArray3 X10_TEMP242 = X10_TEMP241 . m_array ; final Region3 X10_TEMP246 = Program . LevelData_get_m_boundaries ( X10_TEMP0 , k , ii ) ; final Wrapper X10_TEMP249 = ( Program . LevelData_get_m_u ( X10_TEMP0 , sourceID ) ) ; final doubleRefArray3 X10_TEMP250 = X10_TEMP249 . m_array ; Program . Util_arraycopy4 ( X10_TEMP242 , X10_TEMP246 , X10_TEMP250 , trans0 , trans1 , trans2 ) ; }
 }
 }

}

 
 value T1 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData RES;
public T1( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_RES) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.RES = (a_RES);
}
}
 
 value T2 {

 public final  int i;

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T2( final  int a_i,  final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T3 {

 public final  int i;

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T3( final  int a_i,  final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T4 {

 public final  int i;

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T4( final  int a_i,  final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T5 {

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T5( final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T6 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T6( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T7 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T7( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T8 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T8( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T9 {

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T9( final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T10 {

 public final  int i;

 public final  doubleRefArray3 res;

 public final  MGOP X10_TEMP0;
public T10( final  int a_i,  final  doubleRefArray3 a_res,  final  MGOP a_X10_TEMP0) { 
 this.i = (a_i);
 this.res = (a_res);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T11 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T11( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T12 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T12( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T13 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T13( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T14 {

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T14( final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T15 {

 public final  int i;

 public final  doubleRefArray3 arg;

 public final  MGOP X10_TEMP0;
public T15( final  int a_i,  final  doubleRefArray3 a_arg,  final  MGOP a_X10_TEMP0) { 
 this.i = (a_i);
 this.arg = (a_arg);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T16 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T16( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T17 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T17( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T18 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T18( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T19 {

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T19( final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T20 {

 public final  place h;

 public final  Point3 p;

 public final  doubleRefArray3 a_src;

 public final  doubleRefArray3 a_dest;
public T20( final  place a_h,  final  Point3 a_p,  final  doubleRefArray3 a_a_src,  final  doubleRefArray3 a_a_dest) { 
 this.h = (a_h);
 this.p = (a_p);
 this.a_src = (a_a_src);
 this.a_dest = (a_a_dest);
}
}
 
 value T21 {

 public final  place h;

 public final  Point3 p;

 public final  int a_trans2;

 public final  int a_trans1;

 public final  int a_trans0;

 public final  doubleRefArray3 a_src;

 public final  doubleRefArray3 a_dest;
public T21( final  place a_h,  final  Point3 a_p,  final  int a_a_trans2,  final  int a_a_trans1,  final  int a_a_trans0,  final  doubleRefArray3 a_a_src,  final  doubleRefArray3 a_a_dest) { 
 this.h = (a_h);
 this.p = (a_p);
 this.a_trans2 = (a_a_trans2);
 this.a_trans1 = (a_a_trans1);
 this.a_trans0 = (a_a_trans0);
 this.a_src = (a_a_src);
 this.a_dest = (a_a_dest);
}
}
 
 value T22 {

 public final  int i;

 public final  LevelData X10_TEMP0;
public T22( final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T23 {

 public final  int i;

 public final  LevelData X10_TEMP0;
public T23( final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T24 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T24( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T25 {

 public final  int i;

 public final  doubleRefArray1 results;

 public final  LevelData X10_TEMP0;
public T25( final  int a_i,  final  doubleRefArray1 a_results,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.results = (a_results);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T26 {

 public final  int i;

 public final  int a_CLASS;

 public final  LevelData X10_TEMP0;
public T26( final  int a_i,  final  int a_a_CLASS,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.a_CLASS = (a_a_CLASS);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T27 {

 public final  int i;

 public final  double a_db;

 public final  LevelData X10_TEMP0;
public T27( final  int a_i,  final  double a_a_db,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.a_db = (a_a_db);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T28 {

 public final  int i;

 public final  LevelData a_LD;

 public final  LevelData X10_TEMP0;
public T28( final  int a_i,  final  LevelData a_a_LD,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.a_LD = (a_a_LD);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T29 {

 public final  int i;

 public final  LevelData a_LD;

 public final  LevelData X10_TEMP0;
public T29( final  int a_i,  final  LevelData a_a_LD,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.a_LD = (a_a_LD);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T30 {

 public final  int i;

 public final  int jj;

 public final  LevelData X10_TEMP0;
public T30( final  int a_i,  final  int a_jj,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.jj = (a_jj);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T31 {

 public final  LevelData X10_TEMP0;
public T31( final  LevelData a_X10_TEMP0) { 
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T32 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T32( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T33 {

 public final  Region3RefArray1 aRecv;

 public final  place h;

 public final  int i;

 public final  LevelData X10_TEMP0;
public T33( final  Region3RefArray1 a_aRecv,  final  place a_h,  final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.aRecv = (a_aRecv);
 this.h = (a_h);
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T34 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T34( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T35 {

 public final  Region3RefArray1 aRecv;

 public final  place h;

 public final  int i;

 public final  LevelData X10_TEMP0;
public T35( final  Region3RefArray1 a_aRecv,  final  place a_h,  final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.aRecv = (a_aRecv);
 this.h = (a_h);
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T36 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T36( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T37 {

 public final  Region3RefArray1 aRecv;

 public final  place h;

 public final  int j;

 public final  int i;

 public final  LevelData X10_TEMP0;
public T37( final  Region3RefArray1 a_aRecv,  final  place a_h,  final  int a_j,  final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.aRecv = (a_aRecv);
 this.h = (a_h);
 this.j = (a_j);
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T38 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  WrapperStub [ : rank==1 ] RX10_TEMP6;
public T38( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  WrapperStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T39 {

 public final  WrapperRefArray1 aRecv;

 public final  place h;

 public final  int i;

 public final  LevelData X10_TEMP0;
public T39( final  WrapperRefArray1 a_aRecv,  final  place a_h,  final  int a_i,  final  LevelData a_X10_TEMP0) { 
 this.aRecv = (a_aRecv);
 this.h = (a_h);
 this.i = (a_i);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T40 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;

 public final  double initVal;
public T40( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6,  final  double a_initVal) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
 this.initVal = (a_initVal);
}
}
 
 value T41 {

 public final  doubleRefArray1 localSumArray;

 public final  place source;

 public final  int zero;

 public final  doubleRefArray1 sumArray;
public T41( final  doubleRefArray1 a_localSumArray,  final  place a_source,  final  int a_zero,  final  doubleRefArray1 a_sumArray) { 
 this.localSumArray = (a_localSumArray);
 this.source = (a_source);
 this.zero = (a_zero);
 this.sumArray = (a_sumArray);
}
}
 
 value T42 {

 public final  Region1 RX10_TEMP14;

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  LevelDataStub [ : rank==1 ] RX10_TEMP6;
public T42( final  Region1 a_RX10_TEMP14,  final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  LevelDataStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP14 = (a_RX10_TEMP14);
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T43 {

 public final  Region1 RX10_TEMP38;

 public final  int RX10_TEMP36;

 public final  place RX10_TEMP32;

 public final  point ( : rank==1 ) RX10_TEMP31;

 public final  LevelDataStub [ : rank==1 ] RX10_TEMP30;
public T43( final  Region1 a_RX10_TEMP38,  final  int a_RX10_TEMP36,  final  place a_RX10_TEMP32,  final  point ( : rank==1 ) a_RX10_TEMP31,  final  LevelDataStub [ : rank==1 ] a_RX10_TEMP30) { 
 this.RX10_TEMP38 = (a_RX10_TEMP38);
 this.RX10_TEMP36 = (a_RX10_TEMP36);
 this.RX10_TEMP32 = (a_RX10_TEMP32);
 this.RX10_TEMP31 = (a_RX10_TEMP31);
 this.RX10_TEMP30 = (a_RX10_TEMP30);
}
}
 
 value T44 {

 public final  Dist3 disi;

 public final  int k;

 public final  WrapperRefArray1 temp_m_u;
public T44( final  Dist3 a_disi,  final  int a_k,  final  WrapperRefArray1 a_temp_m_u) { 
 this.disi = (a_disi);
 this.k = (a_k);
 this.temp_m_u = (a_temp_m_u);
}
}
 
 value T45 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Dist3Stub [ : rank==1 ] RX10_TEMP6;
public T45( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Dist3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T46 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T46( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T47 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T47( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T48 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  WrapperStub [ : rank==1 ] RX10_TEMP6;
public T48( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  WrapperStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T49 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T49( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T50 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T50( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T51 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T51( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T52 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T52( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T53 {

 public final  int i;

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T53( final  int a_i,  final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T54 {

 public final  int i;

 public final  LevelData a_arg2;

 public final  LevelData a_arg1;

 public final  LevelData a_res;
public T54( final  int a_i,  final  LevelData a_a_arg2,  final  LevelData a_a_arg1,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg2 = (a_a_arg2);
 this.a_arg1 = (a_a_arg1);
 this.a_res = (a_a_res);
}
}
 
 value T55 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T55( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T56 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T56( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T57 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T57( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T58 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T58( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T59 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T59( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T60 {

 public final  int i;

 public final  LevelData a_arg;

 public final  LevelData a_res;
public T60( final  int a_i,  final  LevelData a_a_arg,  final  LevelData a_a_res) { 
 this.i = (a_i);
 this.a_arg = (a_a_arg);
 this.a_res = (a_a_res);
}
}
 
 value T61 {

 public final  double d;

 public final  Point3 p;

 public final  doubleRefArray3 a_dest;
public T61( final  double a_d,  final  Point3 a_p,  final  doubleRefArray3 a_a_dest) { 
 this.d = (a_d);
 this.p = (a_p);
 this.a_dest = (a_a_dest);
}
}
 
 value T62 {

 public final  double d;

 public final  Point3 p;

 public final  doubleRefArray3 a_dest;
public T62( final  double a_d,  final  Point3 a_p,  final  doubleRefArray3 a_a_dest) { 
 this.d = (a_d);
 this.p = (a_p);
 this.a_dest = (a_a_dest);
}
}
 
 value T63 {

 public final  doubleStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T63( final  doubleStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T64 {

 public final  int RX10_TEMP61;

 public final  place RX10_TEMP57;

 public final  point ( : rank==1 ) RX10_TEMP56;

 public final  doubleStub [ : rank==1 ] RX10_TEMP55;
public T64( final  int a_RX10_TEMP61,  final  place a_RX10_TEMP57,  final  point ( : rank==1 ) a_RX10_TEMP56,  final  doubleStub [ : rank==1 ] a_RX10_TEMP55) { 
 this.RX10_TEMP61 = (a_RX10_TEMP61);
 this.RX10_TEMP57 = (a_RX10_TEMP57);
 this.RX10_TEMP56 = (a_RX10_TEMP56);
 this.RX10_TEMP55 = (a_RX10_TEMP55);
}
}
 
 value T65 {

 public final  doubleRefArray1 aRecv;

 public final  place h;

 public final  Point3 p;

 public final  doubleRefArray3 temp;
public T65( final  doubleRefArray1 a_aRecv,  final  place a_h,  final  Point3 a_p,  final  doubleRefArray3 a_temp) { 
 this.aRecv = (a_aRecv);
 this.h = (a_h);
 this.p = (a_p);
 this.temp = (a_temp);
}
}
 
 value T66 {

 public final  int z;

 public final  int y;

 public final  int x;

 public final  Point3 p;

 public final  Region3 R;

 public final  doubleRefArray3 temp;

 public final  int a_CLASS;
public T66( final  int a_z,  final  int a_y,  final  int a_x,  final  Point3 a_p,  final  Region3 a_R,  final  doubleRefArray3 a_temp,  final  int a_a_CLASS) { 
 this.z = (a_z);
 this.y = (a_y);
 this.x = (a_x);
 this.p = (a_p);
 this.R = (a_R);
 this.temp = (a_temp);
 this.a_CLASS = (a_a_CLASS);
}
}
 
 value T67 {

 public final  double tp;

 public final  Point3 p;

 public final  doubleRefArray3 u;
public T67( final  double a_tp,  final  Point3 a_p,  final  doubleRefArray3 a_u) { 
 this.tp = (a_tp);
 this.p = (a_p);
 this.u = (a_u);
}
}
 
 value T68 {

 public final  int i;

 public final  int j;

 public final  LevelData X10_TEMP0;
public T68( final  int a_i,  final  int a_j,  final  LevelData a_X10_TEMP0) { 
 this.i = (a_i);
 this.j = (a_j);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T69 {

 public final  Region3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T69( final  Region3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T70 {

 public final  Region3 temp3;

 public final  Region3RefArray1 aRecv;
public T70( final  Region3 a_temp3,  final  Region3RefArray1 a_aRecv) { 
 this.temp3 = (a_temp3);
 this.aRecv = (a_aRecv);
}
}
 
 value T71 {

 public final  Region3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T71( final  Region3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T72 {

 public final  Region3 temp3;

 public final  Region3RefArray1 aRecv;
public T72( final  Region3 a_temp3,  final  Region3RefArray1 a_aRecv) { 
 this.temp3 = (a_temp3);
 this.aRecv = (a_aRecv);
}
}
 
 value T73 {

 public final  Region3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T73( final  Region3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T74 {

 public final  Region3 temp4;

 public final  Region3RefArray1 aRecv;
public T74( final  Region3 a_temp4,  final  Region3RefArray1 a_aRecv) { 
 this.temp4 = (a_temp4);
 this.aRecv = (a_aRecv);
}
}
 
 value T75 {

 public final  WrapperStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  WrapperStub [ : rank==1 ] RX10_TEMP6;
public T75( final  WrapperStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  WrapperStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T76 {

 public final  Wrapper temp4;

 public final  WrapperRefArray1 aRecv;
public T76( final  Wrapper a_temp4,  final  WrapperRefArray1 a_aRecv) { 
 this.temp4 = (a_temp4);
 this.aRecv = (a_aRecv);
}
}
 
 value T77 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T77( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T78 {

 public final  double localSum;

 public final  int index;

 public final  doubleRefArray1 localSumArray;
public T78( final  double a_localSum,  final  int a_index,  final  doubleRefArray1 a_localSumArray) { 
 this.localSum = (a_localSum);
 this.index = (a_index);
 this.localSumArray = (a_localSumArray);
}
}
 
 value T79 {

 public final  LevelDataStub RX10_TEMP19;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  LevelDataStub [ : rank==1 ] RX10_TEMP6;
public T79( final  LevelDataStub a_RX10_TEMP19,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  LevelDataStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP19 = (a_RX10_TEMP19);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T80 {

 public final  LevelDataStub RX10_TEMP43;

 public final  point ( : rank==1 ) RX10_TEMP31;

 public final  LevelDataStub [ : rank==1 ] RX10_TEMP30;
public T80( final  LevelDataStub a_RX10_TEMP43,  final  point ( : rank==1 ) a_RX10_TEMP31,  final  LevelDataStub [ : rank==1 ] a_RX10_TEMP30) { 
 this.RX10_TEMP43 = (a_RX10_TEMP43);
 this.RX10_TEMP31 = (a_RX10_TEMP31);
 this.RX10_TEMP30 = (a_RX10_TEMP30);
}
}
 
 value T81 {

 public final  Dist3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Dist3Stub [ : rank==1 ] RX10_TEMP6;
public T81( final  Dist3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Dist3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T82 {

 public final  Region3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T82( final  Region3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T83 {

 public final  Region3Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region3Stub [ : rank==1 ] RX10_TEMP6;
public T83( final  Region3Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region3Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T84 {

 public final  WrapperStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  WrapperStub [ : rank==1 ] RX10_TEMP6;
public T84( final  WrapperStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  WrapperStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T85 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T85( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T86 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T86( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T87 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T87( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T88 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T88( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T89 {

 public final  doubleStub RX10_TEMP64;

 public final  point ( : rank==1 ) RX10_TEMP56;

 public final  doubleStub [ : rank==1 ] RX10_TEMP55;
public T89( final  doubleStub a_RX10_TEMP64,  final  point ( : rank==1 ) a_RX10_TEMP56,  final  doubleStub [ : rank==1 ] a_RX10_TEMP55) { 
 this.RX10_TEMP64 = (a_RX10_TEMP64);
 this.RX10_TEMP56 = (a_RX10_TEMP56);
 this.RX10_TEMP55 = (a_RX10_TEMP55);
}
}
 
 value T90 {

 public final  double temp3;

 public final  doubleRefArray1 aRecv;
public T90( final  double a_temp3,  final  doubleRefArray1 a_aRecv) { 
 this.temp3 = (a_temp3);
 this.aRecv = (a_aRecv);
}
}
 
 value T91 {

 public final  int p;

 public final  int ii;

 public final  int dest2;

 public final  int dest1;

 public final  int dest0;

 public final  int jj;

 public final  LevelData X10_TEMP0;
public T91( final  int a_p,  final  int a_ii,  final  int a_dest2,  final  int a_dest1,  final  int a_dest0,  final  int a_jj,  final  LevelData a_X10_TEMP0) { 
 this.p = (a_p);
 this.ii = (a_ii);
 this.dest2 = (a_dest2);
 this.dest1 = (a_dest1);
 this.dest0 = (a_dest0);
 this.jj = (a_jj);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}

 class Util { public Util ( ) { }

} 

 value Region3RefArray1 { public final Dist1 distValue ; public final Region3Stub value [ : rank==1 ] contents ; public Region3RefArray1 ( final Dist1 distValue_ , final Region3Stub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Region3RefArray2 { public final Dist2 distValue ; public final Region3Stub value [ : rank==1 ] contents ; public Region3RefArray2 ( final Dist2 distValue_ , final Region3Stub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Wrapper { public final doubleRefArray3 m_array ; public Wrapper ( final doubleRefArray3 a_array ) { this . m_array = ( a_array ) ; }

} 

 class MGDriver {
} 

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value LevelDataStub { public final LevelData [ : rank==1 ] localArray ; public LevelDataStub ( final LevelData [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Dist3RefArray1 { public final Dist1 distValue ; public final Dist3Stub value [ : rank==1 ] contents ; public Dist3RefArray1 ( final Dist1 distValue_ , final Dist3Stub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value LevelData { public final boolean EXCHANGE_After ; public final int SIZE ; public final Region3 P_DOMAIN ; public final boolean ISPARALLEL ; public final Region3RefArray1 m_regions ; public final Region3RefArray1 m_REGIONs ; public final Region3RefArray2 m_boundaries ; public final Dist1 m_places ; public final int m_numPlaces ; public final Region3 m_placeGrid ; public final int m_size0 ; public final int m_size1 ; public final int m_size2 ; public final int m_block0 ; public final int m_block1 ; public final int m_block2 ; public final Dist3RefArray1 m_dist ; public final Dist3RefArray1 m_DIST ; public final WrapperRefArray1 m_u ; public LevelData ( final int a_problemDomainSize , final boolean a_isParallel ) { final Dist1 X10_TEMP1 = Program . getUniqueDist ( ) ; final Dist1 ALLPLACES = X10_TEMP1 ; final boolean X10_TEMP4 = Program . _Util_OVERLAP_COMMANDCOMP ; if ( X10_TEMP4 ) { final boolean X10_TEMP6 = ( false ) ; this . EXCHANGE_After = ( X10_TEMP6 ) ; }
 else { final boolean X10_TEMP8 = ( Program . _Util_EXCHANGE_AFTER ) ; this . EXCHANGE_After = ( X10_TEMP8 ) ; }
 this . SIZE = ( a_problemDomainSize ) ; this . ISPARALLEL = ( a_isParallel ) ; final int X10_TEMP14 = ( 0 ) ; final int X10_TEMP12 = ( 1 ) ; final int X10_TEMP15 = ( a_problemDomainSize - X10_TEMP12 ) ; final int X10_TEMP19 = ( 0 ) ; final int X10_TEMP17 = ( 1 ) ; final int X10_TEMP20 = ( a_problemDomainSize - X10_TEMP17 ) ; final int X10_TEMP24 = ( 0 ) ; final int X10_TEMP22 = ( 1 ) ; final int X10_TEMP25 = ( a_problemDomainSize - X10_TEMP22 ) ; final Region3 temp_P_DOMAIN = Program . createNewRegion3RRR ( X10_TEMP14 , X10_TEMP15 , X10_TEMP19 , X10_TEMP20 , X10_TEMP24 , X10_TEMP25 ) ; this . P_DOMAIN = ( temp_P_DOMAIN ) ; int numCuts = ( 0 ) ; int temp_m_numPlaces = ( 0 ) ; if ( a_isParallel ) { this . m_places = ( ALLPLACES ) ; final int X10_TEMP33 = ( Program . _LevelData_N_PLACES ) ; temp_m_numPlaces = ( X10_TEMP33 ) ; final int X10_TEMP35 = ( Program . _LevelData_N_PLACES ) ; final int X10_TEMP37 = ( Program . Util_log2 ( X10_TEMP35 ) ) ; numCuts = ( X10_TEMP37 ) ; }
 else { final int X10_TEMP40 = ( 0 ) ; final int X10_TEMP41 = ( 0 ) ; final Region1 X10_TEMP44 = Program . createNewRegion1R ( X10_TEMP40 , X10_TEMP41 ) ; int X10_TEMP43 = ( 0 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP43 ) ; final Region1 RX10_TEMP1 = ALLPLACES . dReg ; final int RX10_TEMP2 = Program . searchPointInRegion1 ( RX10_TEMP1 , RX10_TEMP0 ) ; final int RX10_TEMP3 = 0 ; final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; if ( RX10_TEMP4 ) { final String RX10_TEMP5 = "Point RX10_TEMP0 not found in the distribution ALLPLACES." ; throw new RuntimeException ( RX10_TEMP5 ) ; }
 final place RX10_TEMP6 = Program . getPlaceFromDist1 ( ALLPLACES , RX10_TEMP2 ) ; final place X10_TEMP45 = ( RX10_TEMP6 ) ; final Dist1 X10_TEMP47 = Program . getPlaceDist1 ( X10_TEMP44 , X10_TEMP45 ) ; this . m_places = ( X10_TEMP47 ) ; final int X10_TEMP49 = ( 1 ) ; temp_m_numPlaces = ( X10_TEMP49 ) ; final int X10_TEMP51 = ( 0 ) ; numCuts = ( X10_TEMP51 ) ; }
 this . m_numPlaces = ( temp_m_numPlaces ) ; final int X10_TEMP55 = ( 0 ) ; final Region1 X10_TEMP56 = Program . createNewRegion1R ( X10_TEMP55 , temp_m_numPlaces ) ; final place X10_TEMP57 = ( here ) ; Dist1 d = Program . getPlaceDist1 ( X10_TEMP56 , X10_TEMP57 ) ; final int X10_TEMP61 = ( 0 ) ; final int X10_TEMP62 = ( 5 ) ; final int X10_TEMP66 = ( 0 ) ; final int X10_TEMP64 = ( 1 ) ; final int X10_TEMP67 = ( temp_m_numPlaces - X10_TEMP64 ) ; final Region2 X10_TEMP68 = Program . createNewRegion2RR ( X10_TEMP61 , X10_TEMP62 , X10_TEMP66 , X10_TEMP67 ) ; final place X10_TEMP69 = ( here ) ; Dist2 di = Program . getPlaceDist2 ( X10_TEMP68 , X10_TEMP69 ) ; final Dist3RefArray1 X10_TEMP73 = this . LevelData_getDist3Array ( d ) ; final Dist3RefArray1 temp_m_dist = X10_TEMP73 ; this . m_dist = ( temp_m_dist ) ; final Dist3RefArray1 X10_TEMP78 = this . LevelData_getDist3Array ( d ) ; final Dist3RefArray1 temp_m_DIST = X10_TEMP78 ; this . m_DIST = ( temp_m_DIST ) ; final int X10_TEMP82 = ( 0 ) ; final Region1 RX10_TEMP7 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP82 ) ; final Region1 X10_TEMP83 = RX10_TEMP7 ; final int RX10_TEMP8 = X10_TEMP83 . regSize ; final int RX10_TEMP9 = 0 ; final boolean RX10_TEMP10 = RX10_TEMP8 <= RX10_TEMP9 ; if ( RX10_TEMP10 ) { final String RX10_TEMP11 = "Operation low() not defined on empty region X10_TEMP83" ; throw new RuntimeException ( RX10_TEMP11 ) ; }
 final int m_low0 = ( Program . regionLow ( X10_TEMP83 ) ) ; final int X10_TEMP86 = ( 1 ) ; final Region1 RX10_TEMP12 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP86 ) ; final Region1 X10_TEMP87 = RX10_TEMP12 ; final int RX10_TEMP13 = X10_TEMP87 . regSize ; final int RX10_TEMP14 = 0 ; final boolean RX10_TEMP15 = RX10_TEMP13 <= RX10_TEMP14 ; if ( RX10_TEMP15 ) { final String RX10_TEMP16 = "Operation low() not defined on empty region X10_TEMP87" ; throw new RuntimeException ( RX10_TEMP16 ) ; }
 final int m_low1 = ( Program . regionLow ( X10_TEMP87 ) ) ; final int X10_TEMP90 = ( 2 ) ; final Region1 RX10_TEMP17 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP90 ) ; final Region1 X10_TEMP91 = RX10_TEMP17 ; final int RX10_TEMP18 = X10_TEMP91 . regSize ; final int RX10_TEMP19 = 0 ; final boolean RX10_TEMP20 = RX10_TEMP18 <= RX10_TEMP19 ; if ( RX10_TEMP20 ) { final String RX10_TEMP21 = "Operation low() not defined on empty region X10_TEMP91" ; throw new RuntimeException ( RX10_TEMP21 ) ; }
 final int m_low2 = ( Program . regionLow ( X10_TEMP91 ) ) ; final int X10_TEMP94 = ( 0 ) ; final Region1 RX10_TEMP22 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP94 ) ; final Region1 X10_TEMP95 = RX10_TEMP22 ; final int RX10_TEMP23 = X10_TEMP95 . regSize ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 <= RX10_TEMP24 ; if ( RX10_TEMP25 ) { final String RX10_TEMP26 = "Operation high() not defined on empty region X10_TEMP95" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final int m_hi0 = ( Program . regionHigh ( X10_TEMP95 ) ) ; final int X10_TEMP98 = ( 1 ) ; final Region1 RX10_TEMP27 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP98 ) ; final Region1 X10_TEMP99 = RX10_TEMP27 ; final int RX10_TEMP28 = X10_TEMP99 . regSize ; final int RX10_TEMP29 = 0 ; final boolean RX10_TEMP30 = RX10_TEMP28 <= RX10_TEMP29 ; if ( RX10_TEMP30 ) { final String RX10_TEMP31 = "Operation high() not defined on empty region X10_TEMP99" ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final int m_hi1 = ( Program . regionHigh ( X10_TEMP99 ) ) ; final int X10_TEMP102 = ( 2 ) ; final Region1 RX10_TEMP32 = Program . getRank3 ( temp_P_DOMAIN , X10_TEMP102 ) ; final Region1 X10_TEMP103 = RX10_TEMP32 ; final int RX10_TEMP33 = X10_TEMP103 . regSize ; final int RX10_TEMP34 = 0 ; final boolean RX10_TEMP35 = RX10_TEMP33 <= RX10_TEMP34 ; if ( RX10_TEMP35 ) { final String RX10_TEMP36 = "Operation high() not defined on empty region X10_TEMP103" ; throw new RuntimeException ( RX10_TEMP36 ) ; }
 final int m_hi2 = ( Program . regionHigh ( X10_TEMP103 ) ) ; final int X10_TEMP105 = ( m_hi0 - m_low0 ) ; final int X10_TEMP106 = ( 1 ) ; final int temp_m_size0 = ( X10_TEMP105 + X10_TEMP106 ) ; final int X10_TEMP108 = ( m_hi1 - m_low1 ) ; final int X10_TEMP109 = ( 1 ) ; final int temp_m_size1 = ( X10_TEMP108 + X10_TEMP109 ) ; final int X10_TEMP111 = ( m_hi2 - m_low2 ) ; final int X10_TEMP112 = ( 1 ) ; final int temp_m_size2 = ( X10_TEMP111 + X10_TEMP112 ) ; this . m_size0 = ( temp_m_size0 ) ; this . m_size1 = ( temp_m_size1 ) ; this . m_size2 = ( temp_m_size2 ) ; final int X10_TEMP117 = ( 3 ) ; int a = ( numCuts / X10_TEMP117 ) ; final int X10_TEMP119 = ( 3 ) ; int b = ( numCuts % X10_TEMP119 ) ; final int X10_TEMP121 = ( 0 ) ; final boolean X10_TEMP122 = b > X10_TEMP121 ; int X10_TEMP125 = 0 ; if ( X10_TEMP122 ) { X10_TEMP125 = 1 ; }
 final int X10_TEMP126 = X10_TEMP125 ; final int X10_TEMP127 = ( X10_TEMP126 ) ; final int m_cut0 = ( a + X10_TEMP127 ) ; final int X10_TEMP129 = ( 1 ) ; final boolean X10_TEMP130 = b > X10_TEMP129 ; int X10_TEMP133 = 0 ; if ( X10_TEMP130 ) { X10_TEMP133 = 1 ; }
 final int X10_TEMP134 = X10_TEMP133 ; final int X10_TEMP135 = ( X10_TEMP134 ) ; final int m_cut1 = ( a + X10_TEMP135 ) ; final int m_cut2 = ( a ) ; final int pow2_m_cut0 = ( Program . Util_pow2 ( m_cut0 ) ) ; final int pow2_m_cut1 = ( Program . Util_pow2 ( m_cut1 ) ) ; final int pow2_m_cut2 = ( Program . Util_pow2 ( m_cut2 ) ) ; this . m_block0 = ( pow2_m_cut0 ) ; this . m_block1 = ( pow2_m_cut1 ) ; this . m_block2 = ( pow2_m_cut2 ) ; final int m_blockSize0 = ( temp_m_size0 / pow2_m_cut0 ) ; final int m_blockSize1 = ( temp_m_size1 / pow2_m_cut1 ) ; final int m_blockSize2 = ( temp_m_size2 / pow2_m_cut2 ) ; final int X10_TEMP153 = ( 0 ) ; final int X10_TEMP151 = ( 1 ) ; final int X10_TEMP154 = ( pow2_m_cut0 - X10_TEMP151 ) ; final int X10_TEMP158 = ( 0 ) ; final int X10_TEMP156 = ( 1 ) ; final int X10_TEMP159 = ( pow2_m_cut1 - X10_TEMP156 ) ; final int X10_TEMP163 = ( 0 ) ; final int X10_TEMP161 = ( 1 ) ; final int X10_TEMP164 = ( pow2_m_cut2 - X10_TEMP161 ) ; final Region3 temp_m_placeGrid = Program . createNewRegion3RRR ( X10_TEMP153 , X10_TEMP154 , X10_TEMP158 , X10_TEMP159 , X10_TEMP163 , X10_TEMP164 ) ; this . m_placeGrid = ( temp_m_placeGrid ) ; int i = ( 0 ) ; final Region3RefArray1 X10_TEMP170 = this . LevelData_getRegion3Array1 ( d ) ; Region3RefArray1 m_reg = X10_TEMP170 ; final Region3RefArray1 X10_TEMP174 = this . LevelData_getRegion3Array1 ( d ) ; Region3RefArray1 m_REG = X10_TEMP174 ; final int RX10_TEMP41 = 1 ; int RX10_TEMP39 = temp_m_placeGrid . regSize ; RX10_TEMP39 = RX10_TEMP39 - RX10_TEMP41 ; final region ( : rank==1 ) RX10_TEMP40 = [ 0 : RX10_TEMP39 ] ; for ( point ( : rank==1 ) RX10_TEMP37 : RX10_TEMP40 ) { final int RX10_TEMP42 = RX10_TEMP37 [0] ; final Point3 RX10_TEMP38 = Program . regionOrdinalPoint3 ( temp_m_placeGrid , RX10_TEMP42 ) ; final int x = RX10_TEMP38 . f0 ; final int y = RX10_TEMP38 . f1 ; final int z = RX10_TEMP38 . f2 ; final int X10_TEMP177 = ( m_blockSize0 * x ) ; final int mrl0 = ( X10_TEMP177 + m_low0 ) ; final int X10_TEMP179 = ( m_blockSize1 * y ) ; final int mrl1 = ( X10_TEMP179 + m_low1 ) ; final int X10_TEMP181 = ( m_blockSize2 * z ) ; final int mrl2 = ( X10_TEMP181 + m_low2 ) ; final int X10_TEMP183 = ( 1 ) ; final int X10_TEMP185 = ( x + X10_TEMP183 ) ; final int X10_TEMP186 = ( m_blockSize0 * X10_TEMP185 ) ; final int mrh0 = ( X10_TEMP186 + m_low0 ) ; final int X10_TEMP188 = ( 1 ) ; final int X10_TEMP190 = ( y + X10_TEMP188 ) ; final int X10_TEMP191 = ( m_blockSize1 * X10_TEMP190 ) ; final int mrh1 = ( X10_TEMP191 + m_low1 ) ; final int X10_TEMP193 = ( 1 ) ; final int X10_TEMP195 = ( z + X10_TEMP193 ) ; final int X10_TEMP196 = ( m_blockSize2 * X10_TEMP195 ) ; final int mrh2 = ( X10_TEMP196 + m_low2 ) ; final int X10_TEMP200 = ( 1 ) ; final int X10_TEMP202 = ( mrh0 - X10_TEMP200 ) ; final int X10_TEMP204 = ( 1 ) ; final int X10_TEMP206 = ( mrh1 - X10_TEMP204 ) ; final int X10_TEMP208 = ( 1 ) ; final int X10_TEMP210 = ( mrh2 - X10_TEMP208 ) ; final Region3 X10_TEMP212 = Program . createNewRegion3RRR ( mrl0 , X10_TEMP202 , mrl1 , X10_TEMP206 , mrl2 , X10_TEMP210 ) ; final Region3 X10_TEMP213 = X10_TEMP212 ; final Point1 RX10_TEMP43 = new Point1 ( i ) ; final Dist1 RX10_TEMP44 = m_reg . distValue ; final Region1 RX10_TEMP45 = RX10_TEMP44 . dReg ; final int RX10_TEMP46 = Program . searchPointInRegion1 ( RX10_TEMP45 , RX10_TEMP43 ) ; final int RX10_TEMP47 = 0 ; final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP49 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP49 ) ; }
 final place RX10_TEMP50 = Program . getPlaceFromDist1 ( RX10_TEMP44 , RX10_TEMP46 ) ; final place RX10_TEMP52 = here ; final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52 ; if ( RX10_TEMP53 ) { String RX10_TEMP51 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 Program . setRefArrayValue1Region3 ( m_reg , RX10_TEMP46 , X10_TEMP213 ) ; final int X10_TEMP215 = ( 1 ) ; final int X10_TEMP218 = ( mrl0 - X10_TEMP215 ) ; final int X10_TEMP219 = ( 1 ) ; final int X10_TEMP222 = ( mrl1 - X10_TEMP219 ) ; final int X10_TEMP223 = ( 1 ) ; final int X10_TEMP226 = ( mrl2 - X10_TEMP223 ) ; final Region3 X10_TEMP228 = Program . createNewRegion3RRR ( X10_TEMP218 , mrh0 , X10_TEMP222 , mrh1 , X10_TEMP226 , mrh2 ) ; final Region3 X10_TEMP229 = X10_TEMP228 ; final Point1 RX10_TEMP54 = new Point1 ( i ) ; final Dist1 RX10_TEMP55 = m_REG . distValue ; final Region1 RX10_TEMP56 = RX10_TEMP55 . dReg ; final int RX10_TEMP57 = Program . searchPointInRegion1 ( RX10_TEMP56 , RX10_TEMP54 ) ; final int RX10_TEMP58 = 0 ; final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58 ; if ( RX10_TEMP59 ) { String RX10_TEMP60 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP60 ) ; }
 final place RX10_TEMP61 = Program . getPlaceFromDist1 ( RX10_TEMP55 , RX10_TEMP57 ) ; final place RX10_TEMP63 = here ; final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63 ; if ( RX10_TEMP64 ) { String RX10_TEMP62 = "Bad place access for array m_REG" ; throw new RuntimeException ( RX10_TEMP62 ) ; }
 Program . setRefArrayValue1Region3 ( m_REG , RX10_TEMP57 , X10_TEMP229 ) ; final int X10_TEMP232 = ( 1 ) ; final int X10_TEMP234 = ( mrh0 - X10_TEMP232 ) ; final int X10_TEMP236 = ( 1 ) ; final int X10_TEMP238 = ( mrh1 - X10_TEMP236 ) ; final int X10_TEMP240 = ( 1 ) ; final int X10_TEMP242 = ( mrh2 - X10_TEMP240 ) ; final Region3 X10_TEMP244 = Program . createNewRegion3RRR ( mrl0 , X10_TEMP234 , mrl1 , X10_TEMP238 , mrl2 , X10_TEMP242 ) ; final place X10_TEMP245 = ( place.places ( i ) ) ; final Dist3 X10_TEMP247 = Program . getPlaceDist3 ( X10_TEMP244 , X10_TEMP245 ) ; final Dist3 X10_TEMP248 = X10_TEMP247 ; final Point1 RX10_TEMP65 = new Point1 ( i ) ; final Dist1 RX10_TEMP66 = temp_m_dist . distValue ; final Region1 RX10_TEMP67 = RX10_TEMP66 . dReg ; final int RX10_TEMP68 = Program . searchPointInRegion1 ( RX10_TEMP67 , RX10_TEMP65 ) ; final int RX10_TEMP69 = 0 ; final boolean RX10_TEMP70 = RX10_TEMP68 < RX10_TEMP69 ; if ( RX10_TEMP70 ) { String RX10_TEMP71 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP71 ) ; }
 final place RX10_TEMP72 = Program . getPlaceFromDist1 ( RX10_TEMP66 , RX10_TEMP68 ) ; final place RX10_TEMP74 = here ; final boolean RX10_TEMP75 = RX10_TEMP72 != RX10_TEMP74 ; if ( RX10_TEMP75 ) { String RX10_TEMP73 = "Bad place access for array temp_m_dist" ; throw new RuntimeException ( RX10_TEMP73 ) ; }
 Program . setRefArrayValue1Dist3 ( temp_m_dist , RX10_TEMP68 , X10_TEMP248 ) ; final int X10_TEMP250 = ( 1 ) ; final int X10_TEMP253 = ( mrl0 - X10_TEMP250 ) ; final int X10_TEMP254 = ( 1 ) ; final int X10_TEMP257 = ( mrl1 - X10_TEMP254 ) ; final int X10_TEMP258 = ( 1 ) ; final int X10_TEMP261 = ( mrl2 - X10_TEMP258 ) ; final Region3 X10_TEMP263 = Program . createNewRegion3RRR ( X10_TEMP253 , mrh0 , X10_TEMP257 , mrh1 , X10_TEMP261 , mrh2 ) ; final place X10_TEMP264 = ( place.places ( i ) ) ; final Dist3 X10_TEMP266 = Program . getPlaceDist3 ( X10_TEMP263 , X10_TEMP264 ) ; final Dist3 X10_TEMP267 = X10_TEMP266 ; final Point1 RX10_TEMP76 = new Point1 ( i ) ; final Dist1 RX10_TEMP77 = temp_m_DIST . distValue ; final Region1 RX10_TEMP78 = RX10_TEMP77 . dReg ; final int RX10_TEMP79 = Program . searchPointInRegion1 ( RX10_TEMP78 , RX10_TEMP76 ) ; final int RX10_TEMP80 = 0 ; final boolean RX10_TEMP81 = RX10_TEMP79 < RX10_TEMP80 ; if ( RX10_TEMP81 ) { String RX10_TEMP82 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP82 ) ; }
 final place RX10_TEMP83 = Program . getPlaceFromDist1 ( RX10_TEMP77 , RX10_TEMP79 ) ; final place RX10_TEMP85 = here ; final boolean RX10_TEMP86 = RX10_TEMP83 != RX10_TEMP85 ; if ( RX10_TEMP86 ) { String RX10_TEMP84 = "Bad place access for array temp_m_DIST" ; throw new RuntimeException ( RX10_TEMP84 ) ; }
 Program . setRefArrayValue1Dist3 ( temp_m_DIST , RX10_TEMP79 , X10_TEMP267 ) ; final int X10_TEMP268 = ( i ) ; final int X10_TEMP269 = 1 ; i = i + X10_TEMP269 ; }
 this . m_regions = ( m_reg ) ; this . m_REGIONs = ( m_REG ) ; final Region3RefArray2 X10_TEMP274 = this . LevelData_getRegion3Array2 ( di ) ; Region3RefArray2 temp_m_boundaries = X10_TEMP274 ; final Region2 RX10_TEMP89 = di . dReg ; final int RX10_TEMP92 = 1 ; int RX10_TEMP90 = RX10_TEMP89 . regSize ; RX10_TEMP90 = RX10_TEMP90 - RX10_TEMP92 ; final region ( : rank==1 ) RX10_TEMP91 = [ 0 : RX10_TEMP90 ] ; for ( point ( : rank==1 ) RX10_TEMP87 : RX10_TEMP91 ) { final int RX10_TEMP93 = RX10_TEMP87 [0] ; final Point2 RX10_TEMP88 = Program . regionOrdinalPoint2 ( RX10_TEMP89 , RX10_TEMP93 ) ; final int j = RX10_TEMP88 . f0 ; final int ii = RX10_TEMP88 . f1 ; final int X10_TEMP277 = ( 0 ) ; final boolean X10_TEMP279 = j == X10_TEMP277 ; if ( X10_TEMP279 ) { final Point1 RX10_TEMP94 = new Point1 ( ii ) ; final Dist1 RX10_TEMP95 = m_reg . distValue ; final Region1 RX10_TEMP96 = RX10_TEMP95 . dReg ; final int RX10_TEMP97 = Program . searchPointInRegion1 ( RX10_TEMP96 , RX10_TEMP94 ) ; final int RX10_TEMP98 = 0 ; final boolean RX10_TEMP99 = RX10_TEMP97 < RX10_TEMP98 ; if ( RX10_TEMP99 ) { String RX10_TEMP100 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP100 ) ; }
 final place RX10_TEMP101 = Program . getPlaceFromDist1 ( RX10_TEMP95 , RX10_TEMP97 ) ; final place RX10_TEMP103 = here ; final boolean RX10_TEMP104 = RX10_TEMP101 != RX10_TEMP103 ; if ( RX10_TEMP104 ) { String RX10_TEMP102 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP102 ) ; }
 final Region3 RX10_TEMP105 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP97 ) ; final Region3 X10_TEMP283 = RX10_TEMP105 ; final int X10_TEMP285 = ( 0 ) ; final int X10_TEMP286 = ( 1 ) ; final int X10_TEMP288 = ( X10_TEMP285 + X10_TEMP286 ) ; final int X10_TEMP289 = 0 ; final int X10_TEMP310 = ( X10_TEMP289 - X10_TEMP288 ) ; final int X10_TEMP291 = ( 0 ) ; final int X10_TEMP292 = ( 0 ) ; final boolean X10_TEMP293 = X10_TEMP291 > X10_TEMP292 ; int X10_TEMP296 = 0 ; if ( X10_TEMP293 ) { X10_TEMP296 = 1 ; }
 final int X10_TEMP297 = X10_TEMP296 ; final int X10_TEMP298 = ( X10_TEMP297 ) ; final int X10_TEMP300 = ( 0 ) ; final int X10_TEMP301 = ( 1 ) ; final boolean X10_TEMP302 = X10_TEMP300 > X10_TEMP301 ; int X10_TEMP305 = 0 ; if ( X10_TEMP302 ) { X10_TEMP305 = 1 ; }
 final int X10_TEMP306 = X10_TEMP305 ; final int X10_TEMP307 = ( X10_TEMP306 ) ; final int X10_TEMP311 = ( 0 ) ; final Region3 X10_TEMP313 = Program . Util_boundary ( X10_TEMP283 , X10_TEMP310 , X10_TEMP298 , X10_TEMP307 , X10_TEMP311 ) ; final Region3 X10_TEMP314 = X10_TEMP313 ; final Point2 RX10_TEMP106 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP107 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP108 = RX10_TEMP107 . dReg ; final int RX10_TEMP109 = Program . searchPointInRegion2 ( RX10_TEMP108 , RX10_TEMP106 ) ; final int RX10_TEMP110 = 0 ; final boolean RX10_TEMP111 = RX10_TEMP109 < RX10_TEMP110 ; if ( RX10_TEMP111 ) { String RX10_TEMP112 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP112 ) ; }
 final place RX10_TEMP113 = Program . getPlaceFromDist2 ( RX10_TEMP107 , RX10_TEMP109 ) ; final place RX10_TEMP115 = here ; final boolean RX10_TEMP116 = RX10_TEMP113 != RX10_TEMP115 ; if ( RX10_TEMP116 ) { String RX10_TEMP114 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP114 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP109 , X10_TEMP314 ) ; }
 final int X10_TEMP315 = ( 2 ) ; final boolean X10_TEMP317 = j == X10_TEMP315 ; if ( X10_TEMP317 ) { final Point1 RX10_TEMP117 = new Point1 ( ii ) ; final Dist1 RX10_TEMP118 = m_reg . distValue ; final Region1 RX10_TEMP119 = RX10_TEMP118 . dReg ; final int RX10_TEMP120 = Program . searchPointInRegion1 ( RX10_TEMP119 , RX10_TEMP117 ) ; final int RX10_TEMP121 = 0 ; final boolean RX10_TEMP122 = RX10_TEMP120 < RX10_TEMP121 ; if ( RX10_TEMP122 ) { String RX10_TEMP123 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP123 ) ; }
 final place RX10_TEMP124 = Program . getPlaceFromDist1 ( RX10_TEMP118 , RX10_TEMP120 ) ; final place RX10_TEMP126 = here ; final boolean RX10_TEMP127 = RX10_TEMP124 != RX10_TEMP126 ; if ( RX10_TEMP127 ) { String RX10_TEMP125 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP125 ) ; }
 final Region3 RX10_TEMP128 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP120 ) ; final Region3 X10_TEMP321 = RX10_TEMP128 ; final int X10_TEMP323 = ( 1 ) ; final int X10_TEMP324 = ( 1 ) ; final int X10_TEMP326 = ( X10_TEMP323 + X10_TEMP324 ) ; final int X10_TEMP327 = 0 ; final int X10_TEMP348 = ( X10_TEMP327 - X10_TEMP326 ) ; final int X10_TEMP329 = ( 1 ) ; final int X10_TEMP330 = ( 0 ) ; final boolean X10_TEMP331 = X10_TEMP329 > X10_TEMP330 ; int X10_TEMP334 = 0 ; if ( X10_TEMP331 ) { X10_TEMP334 = 1 ; }
 final int X10_TEMP335 = X10_TEMP334 ; final int X10_TEMP336 = ( X10_TEMP335 ) ; final int X10_TEMP338 = ( 1 ) ; final int X10_TEMP339 = ( 1 ) ; final boolean X10_TEMP340 = X10_TEMP338 > X10_TEMP339 ; int X10_TEMP343 = 0 ; if ( X10_TEMP340 ) { X10_TEMP343 = 1 ; }
 final int X10_TEMP344 = X10_TEMP343 ; final int X10_TEMP345 = ( X10_TEMP344 ) ; final int X10_TEMP349 = ( 0 ) ; final Region3 X10_TEMP351 = Program . Util_boundary ( X10_TEMP321 , X10_TEMP348 , X10_TEMP336 , X10_TEMP345 , X10_TEMP349 ) ; final Region3 X10_TEMP352 = X10_TEMP351 ; final Point2 RX10_TEMP129 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP130 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP131 = RX10_TEMP130 . dReg ; final int RX10_TEMP132 = Program . searchPointInRegion2 ( RX10_TEMP131 , RX10_TEMP129 ) ; final int RX10_TEMP133 = 0 ; final boolean RX10_TEMP134 = RX10_TEMP132 < RX10_TEMP133 ; if ( RX10_TEMP134 ) { String RX10_TEMP135 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP135 ) ; }
 final place RX10_TEMP136 = Program . getPlaceFromDist2 ( RX10_TEMP130 , RX10_TEMP132 ) ; final place RX10_TEMP138 = here ; final boolean RX10_TEMP139 = RX10_TEMP136 != RX10_TEMP138 ; if ( RX10_TEMP139 ) { String RX10_TEMP137 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP137 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP132 , X10_TEMP352 ) ; }
 final int X10_TEMP353 = ( 4 ) ; final boolean X10_TEMP355 = j == X10_TEMP353 ; if ( X10_TEMP355 ) { final Point1 RX10_TEMP140 = new Point1 ( ii ) ; final Dist1 RX10_TEMP141 = m_reg . distValue ; final Region1 RX10_TEMP142 = RX10_TEMP141 . dReg ; final int RX10_TEMP143 = Program . searchPointInRegion1 ( RX10_TEMP142 , RX10_TEMP140 ) ; final int RX10_TEMP144 = 0 ; final boolean RX10_TEMP145 = RX10_TEMP143 < RX10_TEMP144 ; if ( RX10_TEMP145 ) { String RX10_TEMP146 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP146 ) ; }
 final place RX10_TEMP147 = Program . getPlaceFromDist1 ( RX10_TEMP141 , RX10_TEMP143 ) ; final place RX10_TEMP149 = here ; final boolean RX10_TEMP150 = RX10_TEMP147 != RX10_TEMP149 ; if ( RX10_TEMP150 ) { String RX10_TEMP148 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP148 ) ; }
 final Region3 RX10_TEMP151 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP143 ) ; final Region3 X10_TEMP359 = RX10_TEMP151 ; final int X10_TEMP361 = ( 2 ) ; final int X10_TEMP362 = ( 1 ) ; final int X10_TEMP364 = ( X10_TEMP361 + X10_TEMP362 ) ; final int X10_TEMP365 = 0 ; final int X10_TEMP386 = ( X10_TEMP365 - X10_TEMP364 ) ; final int X10_TEMP367 = ( 2 ) ; final int X10_TEMP368 = ( 0 ) ; final boolean X10_TEMP369 = X10_TEMP367 > X10_TEMP368 ; int X10_TEMP372 = 0 ; if ( X10_TEMP369 ) { X10_TEMP372 = 1 ; }
 final int X10_TEMP373 = X10_TEMP372 ; final int X10_TEMP374 = ( X10_TEMP373 ) ; final int X10_TEMP376 = ( 2 ) ; final int X10_TEMP377 = ( 1 ) ; final boolean X10_TEMP378 = X10_TEMP376 > X10_TEMP377 ; int X10_TEMP381 = 0 ; if ( X10_TEMP378 ) { X10_TEMP381 = 1 ; }
 final int X10_TEMP382 = X10_TEMP381 ; final int X10_TEMP383 = ( X10_TEMP382 ) ; final int X10_TEMP387 = ( 0 ) ; final Region3 X10_TEMP389 = Program . Util_boundary ( X10_TEMP359 , X10_TEMP386 , X10_TEMP374 , X10_TEMP383 , X10_TEMP387 ) ; final Region3 X10_TEMP390 = X10_TEMP389 ; final Point2 RX10_TEMP152 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP153 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP154 = RX10_TEMP153 . dReg ; final int RX10_TEMP155 = Program . searchPointInRegion2 ( RX10_TEMP154 , RX10_TEMP152 ) ; final int RX10_TEMP156 = 0 ; final boolean RX10_TEMP157 = RX10_TEMP155 < RX10_TEMP156 ; if ( RX10_TEMP157 ) { String RX10_TEMP158 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP158 ) ; }
 final place RX10_TEMP159 = Program . getPlaceFromDist2 ( RX10_TEMP153 , RX10_TEMP155 ) ; final place RX10_TEMP161 = here ; final boolean RX10_TEMP162 = RX10_TEMP159 != RX10_TEMP161 ; if ( RX10_TEMP162 ) { String RX10_TEMP160 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP160 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP155 , X10_TEMP390 ) ; }
 final int X10_TEMP391 = ( 1 ) ; final boolean X10_TEMP393 = j == X10_TEMP391 ; if ( X10_TEMP393 ) { final Point1 RX10_TEMP163 = new Point1 ( ii ) ; final Dist1 RX10_TEMP164 = m_reg . distValue ; final Region1 RX10_TEMP165 = RX10_TEMP164 . dReg ; final int RX10_TEMP166 = Program . searchPointInRegion1 ( RX10_TEMP165 , RX10_TEMP163 ) ; final int RX10_TEMP167 = 0 ; final boolean RX10_TEMP168 = RX10_TEMP166 < RX10_TEMP167 ; if ( RX10_TEMP168 ) { String RX10_TEMP169 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP169 ) ; }
 final place RX10_TEMP170 = Program . getPlaceFromDist1 ( RX10_TEMP164 , RX10_TEMP166 ) ; final place RX10_TEMP172 = here ; final boolean RX10_TEMP173 = RX10_TEMP170 != RX10_TEMP172 ; if ( RX10_TEMP173 ) { String RX10_TEMP171 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP171 ) ; }
 final Region3 RX10_TEMP174 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP166 ) ; final Region3 X10_TEMP397 = RX10_TEMP174 ; final int X10_TEMP399 = ( 0 ) ; final int X10_TEMP400 = ( 1 ) ; final int X10_TEMP402 = ( X10_TEMP399 + X10_TEMP400 ) ; final int X10_TEMP404 = ( 0 ) ; final int X10_TEMP405 = ( 0 ) ; final boolean X10_TEMP406 = X10_TEMP404 > X10_TEMP405 ; int X10_TEMP409 = 0 ; if ( X10_TEMP406 ) { X10_TEMP409 = 1 ; }
 final int X10_TEMP410 = X10_TEMP409 ; final int X10_TEMP411 = ( X10_TEMP410 ) ; final int X10_TEMP413 = ( 0 ) ; final int X10_TEMP414 = ( 1 ) ; final boolean X10_TEMP415 = X10_TEMP413 > X10_TEMP414 ; int X10_TEMP418 = 0 ; if ( X10_TEMP415 ) { X10_TEMP418 = 1 ; }
 final int X10_TEMP419 = X10_TEMP418 ; final int X10_TEMP420 = ( X10_TEMP419 ) ; final int X10_TEMP423 = ( 0 ) ; final Region3 X10_TEMP425 = Program . Util_boundary ( X10_TEMP397 , X10_TEMP402 , X10_TEMP411 , X10_TEMP420 , X10_TEMP423 ) ; final Region3 X10_TEMP426 = X10_TEMP425 ; final Point2 RX10_TEMP175 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP176 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP177 = RX10_TEMP176 . dReg ; final int RX10_TEMP178 = Program . searchPointInRegion2 ( RX10_TEMP177 , RX10_TEMP175 ) ; final int RX10_TEMP179 = 0 ; final boolean RX10_TEMP180 = RX10_TEMP178 < RX10_TEMP179 ; if ( RX10_TEMP180 ) { String RX10_TEMP181 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP181 ) ; }
 final place RX10_TEMP182 = Program . getPlaceFromDist2 ( RX10_TEMP176 , RX10_TEMP178 ) ; final place RX10_TEMP184 = here ; final boolean RX10_TEMP185 = RX10_TEMP182 != RX10_TEMP184 ; if ( RX10_TEMP185 ) { String RX10_TEMP183 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP183 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP178 , X10_TEMP426 ) ; }
 final int X10_TEMP427 = ( 3 ) ; final boolean X10_TEMP429 = j == X10_TEMP427 ; if ( X10_TEMP429 ) { final Point1 RX10_TEMP186 = new Point1 ( ii ) ; final Dist1 RX10_TEMP187 = m_reg . distValue ; final Region1 RX10_TEMP188 = RX10_TEMP187 . dReg ; final int RX10_TEMP189 = Program . searchPointInRegion1 ( RX10_TEMP188 , RX10_TEMP186 ) ; final int RX10_TEMP190 = 0 ; final boolean RX10_TEMP191 = RX10_TEMP189 < RX10_TEMP190 ; if ( RX10_TEMP191 ) { String RX10_TEMP192 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP192 ) ; }
 final place RX10_TEMP193 = Program . getPlaceFromDist1 ( RX10_TEMP187 , RX10_TEMP189 ) ; final place RX10_TEMP195 = here ; final boolean RX10_TEMP196 = RX10_TEMP193 != RX10_TEMP195 ; if ( RX10_TEMP196 ) { String RX10_TEMP194 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP194 ) ; }
 final Region3 RX10_TEMP197 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP189 ) ; final Region3 X10_TEMP433 = RX10_TEMP197 ; final int X10_TEMP435 = ( 1 ) ; final int X10_TEMP436 = ( 1 ) ; final int X10_TEMP438 = ( X10_TEMP435 + X10_TEMP436 ) ; final int X10_TEMP440 = ( 1 ) ; final int X10_TEMP441 = ( 0 ) ; final boolean X10_TEMP442 = X10_TEMP440 > X10_TEMP441 ; int X10_TEMP445 = 0 ; if ( X10_TEMP442 ) { X10_TEMP445 = 1 ; }
 final int X10_TEMP446 = X10_TEMP445 ; final int X10_TEMP447 = ( X10_TEMP446 ) ; final int X10_TEMP449 = ( 1 ) ; final int X10_TEMP450 = ( 1 ) ; final boolean X10_TEMP451 = X10_TEMP449 > X10_TEMP450 ; int X10_TEMP454 = 0 ; if ( X10_TEMP451 ) { X10_TEMP454 = 1 ; }
 final int X10_TEMP455 = X10_TEMP454 ; final int X10_TEMP456 = ( X10_TEMP455 ) ; final int X10_TEMP459 = ( 0 ) ; final Region3 X10_TEMP461 = Program . Util_boundary ( X10_TEMP433 , X10_TEMP438 , X10_TEMP447 , X10_TEMP456 , X10_TEMP459 ) ; final Region3 X10_TEMP462 = X10_TEMP461 ; final Point2 RX10_TEMP198 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP199 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP200 = RX10_TEMP199 . dReg ; final int RX10_TEMP201 = Program . searchPointInRegion2 ( RX10_TEMP200 , RX10_TEMP198 ) ; final int RX10_TEMP202 = 0 ; final boolean RX10_TEMP203 = RX10_TEMP201 < RX10_TEMP202 ; if ( RX10_TEMP203 ) { String RX10_TEMP204 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP204 ) ; }
 final place RX10_TEMP205 = Program . getPlaceFromDist2 ( RX10_TEMP199 , RX10_TEMP201 ) ; final place RX10_TEMP207 = here ; final boolean RX10_TEMP208 = RX10_TEMP205 != RX10_TEMP207 ; if ( RX10_TEMP208 ) { String RX10_TEMP206 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP206 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP201 , X10_TEMP462 ) ; }
 final int X10_TEMP463 = ( 5 ) ; final boolean X10_TEMP465 = j == X10_TEMP463 ; if ( X10_TEMP465 ) { final Point1 RX10_TEMP209 = new Point1 ( ii ) ; final Dist1 RX10_TEMP210 = m_reg . distValue ; final Region1 RX10_TEMP211 = RX10_TEMP210 . dReg ; final int RX10_TEMP212 = Program . searchPointInRegion1 ( RX10_TEMP211 , RX10_TEMP209 ) ; final int RX10_TEMP213 = 0 ; final boolean RX10_TEMP214 = RX10_TEMP212 < RX10_TEMP213 ; if ( RX10_TEMP214 ) { String RX10_TEMP215 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP215 ) ; }
 final place RX10_TEMP216 = Program . getPlaceFromDist1 ( RX10_TEMP210 , RX10_TEMP212 ) ; final place RX10_TEMP218 = here ; final boolean RX10_TEMP219 = RX10_TEMP216 != RX10_TEMP218 ; if ( RX10_TEMP219 ) { String RX10_TEMP217 = "Bad place access for array m_reg" ; throw new RuntimeException ( RX10_TEMP217 ) ; }
 final Region3 RX10_TEMP220 = Program . getRefArrayValue1Region3 ( m_reg , RX10_TEMP212 ) ; final Region3 X10_TEMP469 = RX10_TEMP220 ; final int X10_TEMP471 = ( 2 ) ; final int X10_TEMP472 = ( 1 ) ; final int X10_TEMP474 = ( X10_TEMP471 + X10_TEMP472 ) ; final int X10_TEMP476 = ( 2 ) ; final int X10_TEMP477 = ( 0 ) ; final boolean X10_TEMP478 = X10_TEMP476 > X10_TEMP477 ; int X10_TEMP481 = 0 ; if ( X10_TEMP478 ) { X10_TEMP481 = 1 ; }
 final int X10_TEMP482 = X10_TEMP481 ; final int X10_TEMP483 = ( X10_TEMP482 ) ; final int X10_TEMP485 = ( 2 ) ; final int X10_TEMP486 = ( 1 ) ; final boolean X10_TEMP487 = X10_TEMP485 > X10_TEMP486 ; int X10_TEMP490 = 0 ; if ( X10_TEMP487 ) { X10_TEMP490 = 1 ; }
 final int X10_TEMP491 = X10_TEMP490 ; final int X10_TEMP492 = ( X10_TEMP491 ) ; final int X10_TEMP495 = ( 0 ) ; final Region3 X10_TEMP497 = Program . Util_boundary ( X10_TEMP469 , X10_TEMP474 , X10_TEMP483 , X10_TEMP492 , X10_TEMP495 ) ; final Region3 X10_TEMP498 = X10_TEMP497 ; final Point2 RX10_TEMP221 = new Point2 ( j , ii ) ; final Dist2 RX10_TEMP222 = temp_m_boundaries . distValue ; final Region2 RX10_TEMP223 = RX10_TEMP222 . dReg ; final int RX10_TEMP224 = Program . searchPointInRegion2 ( RX10_TEMP223 , RX10_TEMP221 ) ; final int RX10_TEMP225 = 0 ; final boolean RX10_TEMP226 = RX10_TEMP224 < RX10_TEMP225 ; if ( RX10_TEMP226 ) { String RX10_TEMP227 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP227 ) ; }
 final place RX10_TEMP228 = Program . getPlaceFromDist2 ( RX10_TEMP222 , RX10_TEMP224 ) ; final place RX10_TEMP230 = here ; final boolean RX10_TEMP231 = RX10_TEMP228 != RX10_TEMP230 ; if ( RX10_TEMP231 ) { String RX10_TEMP229 = "Bad place access for array temp_m_boundaries" ; throw new RuntimeException ( RX10_TEMP229 ) ; }
 Program . setRefArrayValue2Region3 ( temp_m_boundaries , RX10_TEMP224 , X10_TEMP498 ) ; }
 }
 this . m_boundaries = ( temp_m_boundaries ) ; final WrapperRefArray1 temp_m_u = this . LevelData_getWrapperArray ( ALLPLACES ) ; this . m_u = ( temp_m_u ) ; final int X10_TEMP508 = ( 0 ) ; final int X10_TEMP505 = ( Program . _LevelData_N_PLACES ) ; final int X10_TEMP506 = ( 1 ) ; final int X10_TEMP509 = ( X10_TEMP505 - X10_TEMP506 ) ; final Region1 X10_TEMP511 = Program . createNewRegion1R ( X10_TEMP508 , X10_TEMP509 ) ; final int RX10_TEMP236 = 1 ; int RX10_TEMP234 = X10_TEMP511 . regSize ; RX10_TEMP234 = RX10_TEMP234 - RX10_TEMP236 ; final region ( : rank==1 ) RX10_TEMP235 = [ 0 : RX10_TEMP234 ] ; for ( point ( : rank==1 ) RX10_TEMP232 : RX10_TEMP235 ) { final int RX10_TEMP237 = RX10_TEMP232 [0] ; final Point1 RX10_TEMP233 = Program . regionOrdinalPoint1 ( X10_TEMP511 , RX10_TEMP237 ) ; final int k = RX10_TEMP233 . f0 ; final Point1 RX10_TEMP238 = new Point1 ( k ) ; final Dist1 RX10_TEMP239 = temp_m_DIST . distValue ; final Region1 RX10_TEMP240 = RX10_TEMP239 . dReg ; final int RX10_TEMP241 = Program . searchPointInRegion1 ( RX10_TEMP240 , RX10_TEMP238 ) ; final int RX10_TEMP242 = 0 ; final boolean RX10_TEMP243 = RX10_TEMP241 < RX10_TEMP242 ; if ( RX10_TEMP243 ) { String RX10_TEMP244 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP244 ) ; }
 final place RX10_TEMP245 = Program . getPlaceFromDist1 ( RX10_TEMP239 , RX10_TEMP241 ) ; final place RX10_TEMP247 = here ; final boolean RX10_TEMP248 = RX10_TEMP245 != RX10_TEMP247 ; if ( RX10_TEMP248 ) { String RX10_TEMP246 = "Bad place access for array temp_m_DIST" ; throw new RuntimeException ( RX10_TEMP246 ) ; }
 final Dist3 RX10_TEMP249 = Program . getRefArrayValue1Dist3 ( temp_m_DIST , RX10_TEMP241 ) ; final Dist3 X10_TEMP513 = RX10_TEMP249 ; final Dist3 disi = X10_TEMP513 ; finish { final Dist1 RX10_TEMP250 = temp_m_u . distValue ; final Dist1 X10_TEMP515 = RX10_TEMP250 ; final Point1 RX10_TEMP251 = new Point1 ( k ) ; final Region1 RX10_TEMP252 = X10_TEMP515 . dReg ; final int RX10_TEMP253 = Program . searchPointInRegion1 ( RX10_TEMP252 , RX10_TEMP251 ) ; final int RX10_TEMP254 = 0 ; final boolean RX10_TEMP255 = RX10_TEMP253 < RX10_TEMP254 ; if ( RX10_TEMP255 ) { final String RX10_TEMP256 = "Point RX10_TEMP251 not found in the distribution X10_TEMP515." ; throw new RuntimeException ( RX10_TEMP256 ) ; }
 final place RX10_TEMP257 = Program . getPlaceFromDist1 ( X10_TEMP515 , RX10_TEMP253 ) ; final place X10_TEMP518 = RX10_TEMP257 ; 
 final T44 utmp44 = new T44(disi, k, temp_m_u);
 async (X10_TEMP518) {this.thread44(utmp44); }
 }
 }
 }
 public Dist3RefArray1 LevelData_getDist3Array ( final Dist1 d ) { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Dist3Stub [ : rank==1 ] RX10_TEMP6 = ( Dist3Stub [ : rank==1 ] ) ( new Dist3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T45 utmp45 = new T45(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread45(utmp45); }
 }
 }
 final Dist3Stub value [ : rank==1 ] RX10_TEMP16 = ( Dist3Stub value [ : rank==1 ] ) ( new Dist3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Dist3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Dist3RefArray1 RX10_TEMP19 = new Dist3RefArray1 ( d , RX10_TEMP16 ) ; final Dist3RefArray1 X10_TEMP1 = RX10_TEMP19 ; return X10_TEMP1 ; }
 public Region3RefArray1 LevelData_getRegion3Array1 ( final Dist1 d ) { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region3Stub [ : rank==1 ] RX10_TEMP6 = ( Region3Stub [ : rank==1 ] ) ( new Region3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T46 utmp46 = new T46(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread46(utmp46); }
 }
 }
 final Region3Stub value [ : rank==1 ] RX10_TEMP16 = ( Region3Stub value [ : rank==1 ] ) ( new Region3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Region3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Region3RefArray1 RX10_TEMP19 = new Region3RefArray1 ( d , RX10_TEMP16 ) ; final Region3RefArray1 X10_TEMP1 = RX10_TEMP19 ; return X10_TEMP1 ; }
 public Region3RefArray2 LevelData_getRegion3Array2 ( final Dist2 d ) { final Region2 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region3Stub [ : rank==1 ] RX10_TEMP6 = ( Region3Stub [ : rank==1 ] ) ( new Region3Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount2 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T47 utmp47 = new T47(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread47(utmp47); }
 }
 }
 final Region3Stub value [ : rank==1 ] RX10_TEMP16 = ( Region3Stub value [ : rank==1 ] ) ( new Region3Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Region3Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Region3RefArray2 RX10_TEMP19 = new Region3RefArray2 ( d , RX10_TEMP16 ) ; final Region3RefArray2 X10_TEMP1 = RX10_TEMP19 ; return X10_TEMP1 ; }
 public WrapperRefArray1 LevelData_getWrapperArray ( final Dist1 d ) { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final WrapperStub [ : rank==1 ] RX10_TEMP6 = ( WrapperStub [ : rank==1 ] ) ( new WrapperStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T48 utmp48 = new T48(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread48(utmp48); }
 }
 }
 final WrapperStub value [ : rank==1 ] RX10_TEMP16 = ( WrapperStub value [ : rank==1 ] ) ( new WrapperStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final WrapperStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final WrapperRefArray1 RX10_TEMP19 = new WrapperRefArray1 ( d , RX10_TEMP16 ) ; final WrapperRefArray1 X10_TEMP2 = RX10_TEMP19 ; return X10_TEMP2 ; }
 public doubleRefArray3 LevelData_getDoubleArray ( final Dist3 d ) { final Region3 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount3 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T49 utmp49 = new T49(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread49(utmp49); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray3 RX10_TEMP20 = new doubleRefArray3 ( d , RX10_TEMP17 ) ; final doubleRefArray3 X10_TEMP4 = RX10_TEMP20 ; return X10_TEMP4 ; }
 public void thread44(final T44 utmpz) {final  Dist3 disi = utmpz.disi;
final  int k = utmpz.k;
final  WrapperRefArray1 temp_m_u = utmpz.temp_m_u;
 { doubleRefArray3 X10_TEMP523 = this . LevelData_getDoubleArray ( disi ) ; final Wrapper X10_TEMP525 = ( new Wrapper ( X10_TEMP523 ) ) ; final Wrapper X10_TEMP526 = ( X10_TEMP525 ) ; final Point1 RX10_TEMP258 = new Point1 ( k ) ; final Dist1 RX10_TEMP259 = temp_m_u . distValue ; final Region1 RX10_TEMP260 = RX10_TEMP259 . dReg ; final int RX10_TEMP261 = Program . searchPointInRegion1 ( RX10_TEMP260 , RX10_TEMP258 ) ; final int RX10_TEMP262 = 0 ; final boolean RX10_TEMP263 = RX10_TEMP261 < RX10_TEMP262 ; if ( RX10_TEMP263 ) { String RX10_TEMP264 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP264 ) ; }
 final place RX10_TEMP265 = Program . getPlaceFromDist1 ( RX10_TEMP259 , RX10_TEMP261 ) ; final place RX10_TEMP267 = here ; final boolean RX10_TEMP268 = RX10_TEMP265 != RX10_TEMP267 ; if ( RX10_TEMP268 ) { String RX10_TEMP266 = "Bad place access for array temp_m_u" ; throw new RuntimeException ( RX10_TEMP266 ) ; }
 Program . setRefArrayValue1Wrapper ( temp_m_u , RX10_TEMP261 , X10_TEMP526 ) ; }
 }
 public void thread45(final T45 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Dist3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Dist3 [ : rank==1 ] RX10_TEMP14 = ( Dist3 [ : rank==1 ] ) ( new Dist3 [ RX10_TEMP13 ] ) ; final Dist3Stub RX10_TEMP15 = new Dist3Stub ( RX10_TEMP14 ) ; 
 final T81 utmp81 = new T81(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread81(utmp81); }
 }
 }
 public void thread46(final T46 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Region3 [ : rank==1 ] RX10_TEMP14 = ( Region3 [ : rank==1 ] ) ( new Region3 [ RX10_TEMP13 ] ) ; final Region3Stub RX10_TEMP15 = new Region3Stub ( RX10_TEMP14 ) ; 
 final T82 utmp82 = new T82(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread82(utmp82); }
 }
 }
 public void thread47(final T47 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Region3 [ : rank==1 ] RX10_TEMP14 = ( Region3 [ : rank==1 ] ) ( new Region3 [ RX10_TEMP13 ] ) ; final Region3Stub RX10_TEMP15 = new Region3Stub ( RX10_TEMP14 ) ; 
 final T83 utmp83 = new T83(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread83(utmp83); }
 }
 }
 public void thread48(final T48 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  WrapperStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Wrapper [ : rank==1 ] RX10_TEMP14 = ( Wrapper [ : rank==1 ] ) ( new Wrapper [ RX10_TEMP13 ] ) ; final WrapperStub RX10_TEMP15 = new WrapperStub ( RX10_TEMP14 ) ; 
 final T84 utmp84 = new T84(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread84(utmp84); }
 }
 }
 public void thread49(final T49 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP2 = ( 0 ) ; return X10_TEMP2 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T85 utmp85 = new T85(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread85(utmp85); }
 }
 }
 public void thread81(final T81 utmpz) {final  Dist3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Dist3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public void thread82(final T82 utmpz) {final  Region3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public void thread83(final T83 utmpz) {final  Region3Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region3Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public void thread84(final T84 utmpz) {final  WrapperStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  WrapperStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public void thread85(final T85 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }

} 

 value Region3Stub { public final Region3 [ : rank==1 ] localArray ; public Region3Stub ( final Region3 [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value LevelDataRefArray1 { public final Dist1 distValue ; public final LevelDataStub value [ : rank==1 ] contents ; public LevelDataRefArray1 ( final Dist1 distValue_ , final LevelDataStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist2 { public final Region2 dReg ; public final Dist dDist ; public Dist2 ( final Region2 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value Dist3 { public final Region3 dReg ; public final Dist dDist ; public Dist3 ( final Region3 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value Region3ValArray3 { public final Region3 regionValue ; public final Region3 value [ : rank==1 ] contents ; public Region3ValArray3 ( final Region3 regionValue_ , final Region3 value [ : rank==1 ] contents_ ) { this . regionValue = ( regionValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value doubleRefArray3 { public final Dist3 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray3 ( final Dist3 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T50 utmp50 = new T50(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread50(utmp50); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T51 utmp51 = new T51(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread51(utmp51); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T52 utmp52 = new T52(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread52(utmp52); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 public void thread50(final T50 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T86 utmp86 = new T86(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread86(utmp86); }
 }
 }
 public void thread51(final T51 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T87 utmp87 = new T87(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread87(utmp87); }
 }
 }
 public void thread52(final T52 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T88 utmp88 = new T88(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread88(utmp88); }
 }
 }
 public void thread86(final T86 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread87(final T87 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread88(final T88 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }

} 

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; }
 public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

} 

 value WrapperRefArray1 { public final Dist1 distValue ; public final WrapperStub value [ : rank==1 ] contents ; public WrapperRefArray1 ( final Dist1 distValue_ , final WrapperStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Region3 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final int low1 ; public final int dim1 ; public final int low2 ; public final int dim2 ; public final Point3 value [ : rank==1 ] pointArray ; public Region3 ( final Point3 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 3 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; this . low1 = ( minusOne ) ; this . dim1 = ( zero ) ; this . low2 = ( minusOne ) ; this . dim2 = ( zero ) ; }
 public Region3 ( final Point3 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ , final int low1_ , final int dim1_ , final int low2_ , final int dim2_ ) { final boolean t = true ; final int regR = 3 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; this . low1 = ( low1_ ) ; this . dim1 = ( dim1_ ) ; this . low2 = ( low2_ ) ; this . dim2 = ( dim2_ ) ; }

} 

 value Region2 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final int low1 ; public final int dim1 ; public final Point2 value [ : rank==1 ] pointArray ; public Region2 ( final Point2 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; this . low1 = ( minusOne ) ; this . dim1 = ( zero ) ; }
 public Region2 ( final Point2 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ , final int low1_ , final int dim1_ ) { final boolean t = true ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; this . low1 = ( low1_ ) ; this . dim1 = ( dim1_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value Point2 { public final int f0 ; public final int f1 ; public Point2 ( final int f0_ , final int f1_ ) { this . f0 = ( f0_ ) ; this . f1 = ( f1_ ) ; }

} 

 value Point3 { public final int f0 ; public final int f1 ; public final int f2 ; public Point3 ( final int f0_ , final int f1_ , final int f2_ ) { this . f0 = ( f0_ ) ; this . f1 = ( f1_ ) ; this . f2 = ( f2_ ) ; }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

 value Dist3Stub { public final Dist3 [ : rank==1 ] localArray ; public Dist3Stub ( final Dist3 [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value WrapperStub { public final Wrapper [ : rank==1 ] localArray ; public WrapperStub ( final Wrapper [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 class MGOP { public final boolean EXCHANGE_After ; public final int m_size ; public final Region3 m_problemDomain ; public final int m_levels ; public LevelDataRefArray1 m_r ; public LevelDataRefArray1 m_z ; public LevelData m_tempLD ; public MGOP ( final int a_size ) { boolean temp_EXCHANGE_After = ( false ) ; final boolean X10_TEMP3 = Program . _Util_OVERLAP_COMMANDCOMP ; if ( X10_TEMP3 ) { final boolean X10_TEMP5 = ( false ) ; temp_EXCHANGE_After = ( X10_TEMP5 ) ; }
 else { final boolean X10_TEMP7 = ( Program . _Util_EXCHANGE_AFTER ) ; temp_EXCHANGE_After = ( X10_TEMP7 ) ; }
 this . EXCHANGE_After = ( temp_EXCHANGE_After ) ; int i = ( 0 ) ; int j = ( 0 ) ; int k = ( 0 ) ; this . m_size = ( a_size ) ; final int X10_TEMP16 = ( 0 ) ; final int X10_TEMP14 = ( 1 ) ; final int X10_TEMP17 = ( a_size - X10_TEMP14 ) ; final int X10_TEMP21 = ( 0 ) ; final int X10_TEMP19 = ( 1 ) ; final int X10_TEMP22 = ( a_size - X10_TEMP19 ) ; final int X10_TEMP26 = ( 0 ) ; final int X10_TEMP24 = ( 1 ) ; final int X10_TEMP27 = ( a_size - X10_TEMP24 ) ; final Region3 X10_TEMP29 = Program . createNewRegion3RRR ( X10_TEMP16 , X10_TEMP17 , X10_TEMP21 , X10_TEMP22 , X10_TEMP26 , X10_TEMP27 ) ; this . m_problemDomain = ( X10_TEMP29 ) ; final int log_a_size = ( Program . Util_log2 ( a_size ) ) ; this . m_levels = ( log_a_size ) ; final int X10_TEMP33 = ( Program . _MGOP_P2SLEVEL ) ; final int X10_TEMP34 = ( 0 ) ; final boolean X10_TEMP36 = X10_TEMP33 > X10_TEMP34 ; if ( X10_TEMP36 ) { final int X10_TEMP38 = ( Program . _MGOP_P2SLEVEL ) ; final int X10_TEMP40 = ( Program . Util_pow2 ( X10_TEMP38 ) ) ; i = ( X10_TEMP40 ) ; final int X10_TEMP41 = ( i * i ) ; final int X10_TEMP43 = ( X10_TEMP41 * i ) ; j = ( X10_TEMP43 ) ; }
 else { }
 final int X10_TEMP46 = ( 0 ) ; final Region1 X10_TEMP47 = Program . createNewRegion1R ( X10_TEMP46 , log_a_size ) ; final place X10_TEMP48 = ( here ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP47 , X10_TEMP48 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final LevelDataStub [ : rank==1 ] RX10_TEMP6 = ( LevelDataStub [ : rank==1 ] ) ( new LevelDataStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; final Dist1 RX10_TEMP13 = Program . restrictDist1 ( d , RX10_TEMP10 ) ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; 
 final T42 utmp42 = new T42(RX10_TEMP14, RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread42(utmp42); }
 }
 }
 final LevelDataStub value [ : rank==1 ] RX10_TEMP20 = ( LevelDataStub value [ : rank==1 ] ) ( new LevelDataStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP22 ) { final LevelDataStub RX10_TEMP21 = RX10_TEMP6 [ RX10_TEMP22 ] ; return RX10_TEMP21 ; }
 ) ; final LevelDataRefArray1 RX10_TEMP23 = new LevelDataRefArray1 ( d , RX10_TEMP20 ) ; final LevelDataRefArray1 X10_TEMP65 = RX10_TEMP23 ; this . m_r = ( X10_TEMP65 ) ; final Region1 RX10_TEMP24 = d . dReg ; final int RX10_TEMP25 = 0 ; final int RX10_TEMP26 = 1 ; int RX10_TEMP27 = place.MAX_PLACES ; RX10_TEMP27 = RX10_TEMP27 - RX10_TEMP26 ; final region ( : rank==1 ) RX10_TEMP28 = [ 0 : RX10_TEMP27 ] ; final dist ( : rank==1 ) RX10_TEMP29 = [ 0 : RX10_TEMP27 ] -> here ; final LevelDataStub [ : rank==1 ] RX10_TEMP30 = ( LevelDataStub [ : rank==1 ] ) ( new LevelDataStub [ RX10_TEMP29 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP31 : RX10_TEMP28 ) { final place RX10_TEMP32 = here ; final int RX10_TEMP33 = RX10_TEMP31 [0] ; final place RX10_TEMP34 = place.places ( RX10_TEMP33 ) ; final int RX10_TEMP35 = Program . getDistLocalCount1 ( d , RX10_TEMP33 ) ; final int RX10_TEMP36 = RX10_TEMP35 - RX10_TEMP26 ; final Dist1 RX10_TEMP37 = Program . restrictDist1 ( d , RX10_TEMP34 ) ; final Region1 RX10_TEMP38 = RX10_TEMP37 . dReg ; 
 final T43 utmp43 = new T43(RX10_TEMP38, RX10_TEMP36, RX10_TEMP32, RX10_TEMP31, RX10_TEMP30);
 async (RX10_TEMP34) {this.thread43(utmp43); }
 }
 }
 final LevelDataStub value [ : rank==1 ] RX10_TEMP44 = ( LevelDataStub value [ : rank==1 ] ) ( new LevelDataStub value [ RX10_TEMP28 ] ( point ( : rank==1 ) RX10_TEMP46 ) { final LevelDataStub RX10_TEMP45 = RX10_TEMP30 [ RX10_TEMP46 ] ; return RX10_TEMP45 ; }
 ) ; final LevelDataRefArray1 RX10_TEMP47 = new LevelDataRefArray1 ( d , RX10_TEMP44 ) ; final LevelDataRefArray1 X10_TEMP81 = RX10_TEMP47 ; this . m_z = ( X10_TEMP81 ) ; final int X10_TEMP82 = ( Program . _MGOP_P2SLEVEL ) ; final int X10_TEMP83 = ( 0 ) ; final boolean X10_TEMP85 = X10_TEMP82 > X10_TEMP83 ; if ( X10_TEMP85 ) { final int X10_TEMP87 = ( Program . _MGOP_P2SLEVEL ) ; int X10_TEMP90 = ( Program . Util_pow2 ( X10_TEMP87 ) ) ; boolean X10_TEMP91 = ( true ) ; final LevelData X10_TEMP93 = ( new LevelData ( X10_TEMP90 , X10_TEMP91 ) ) ; this . m_tempLD = ( X10_TEMP93 ) ; }
 final String X10_TEMP94 = ( "Overlapping communication and computation? " ) ; final boolean X10_TEMP95 = ( Program . _MGOP_OVERLAPPED ) ; final String X10_TEMP96 = ( X10_TEMP94 + X10_TEMP95 ) ; final String X10_TEMP97 = ( ". If not, doing exchange after computation? " ) ; final String X10_TEMP98 = ( X10_TEMP96 + X10_TEMP97 ) ; final String X10_TEMP100 = ( X10_TEMP98 + temp_EXCHANGE_After ) ; System.out.println ( X10_TEMP100 ) ; }
 public void thread42(final T42 utmpz) {final  Region1 RX10_TEMP14 = utmpz.RX10_TEMP14;
final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  LevelDataStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP17 = [ 0 : RX10_TEMP12 ] -> here ; final LevelData [ : rank==1 ] RX10_TEMP18 = ( LevelData [ : rank==1 ] ) ( new LevelData [ RX10_TEMP17 ] ( point ( : rank==1 ) RX10_TEMP15 ) { final int RX10_TEMP16 = RX10_TEMP15 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; final int X10_TEMP51 = ( p . f0 ) ; final int X10_TEMP52 = ( 1 ) ; final int X10_TEMP54 = ( X10_TEMP51 + X10_TEMP52 ) ; int X10_TEMP60 = ( Program . Util_pow2 ( X10_TEMP54 ) ) ; final int X10_TEMP57 = ( p . f0 ) ; final int X10_TEMP58 = ( Program . _MGOP_P2SLEVEL ) ; boolean X10_TEMP61 = ( X10_TEMP57 >= X10_TEMP58 ) ; final LevelData X10_TEMP63 = ( new LevelData ( X10_TEMP60 , X10_TEMP61 ) ) ; return X10_TEMP63 ; }
 ) ; final LevelDataStub RX10_TEMP19 = new LevelDataStub ( RX10_TEMP18 ) ; 
 final T79 utmp79 = new T79(RX10_TEMP19, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread79(utmp79); }
 }
 }
 public void thread43(final T43 utmpz) {final  Region1 RX10_TEMP38 = utmpz.RX10_TEMP38;
final  int RX10_TEMP36 = utmpz.RX10_TEMP36;
final  place RX10_TEMP32 = utmpz.RX10_TEMP32;
final  point ( : rank==1 ) RX10_TEMP31 = utmpz.RX10_TEMP31;
final  LevelDataStub [ : rank==1 ] RX10_TEMP30 = utmpz.RX10_TEMP30;
 { final dist ( : rank==1 ) RX10_TEMP41 = [ 0 : RX10_TEMP36 ] -> here ; final LevelData [ : rank==1 ] RX10_TEMP42 = ( LevelData [ : rank==1 ] ) ( new LevelData [ RX10_TEMP41 ] ( point ( : rank==1 ) RX10_TEMP39 ) { final int RX10_TEMP40 = RX10_TEMP39 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP38 , RX10_TEMP40 ) ; final int X10_TEMP67 = ( p . f0 ) ; final int X10_TEMP68 = ( 1 ) ; final int X10_TEMP70 = ( X10_TEMP67 + X10_TEMP68 ) ; int X10_TEMP76 = ( Program . Util_pow2 ( X10_TEMP70 ) ) ; final int X10_TEMP73 = ( p . f0 ) ; final int X10_TEMP74 = ( Program . _MGOP_P2SLEVEL ) ; boolean X10_TEMP77 = ( X10_TEMP73 >= X10_TEMP74 ) ; final LevelData X10_TEMP79 = ( new LevelData ( X10_TEMP76 , X10_TEMP77 ) ) ; return X10_TEMP79 ; }
 ) ; final LevelDataStub RX10_TEMP43 = new LevelDataStub ( RX10_TEMP42 ) ; 
 final T80 utmp80 = new T80(RX10_TEMP43, RX10_TEMP31, RX10_TEMP30);
 async (RX10_TEMP32) {this.thread80(utmp80); }
 }
 }
 public void thread79(final T79 utmpz) {final  LevelDataStub RX10_TEMP19 = utmpz.RX10_TEMP19;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  LevelDataStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP19 ) ; }
 }
 public void thread80(final T80 utmpz) {final  LevelDataStub RX10_TEMP43 = utmpz.RX10_TEMP43;
final  point ( : rank==1 ) RX10_TEMP31 = utmpz.RX10_TEMP31;
final  LevelDataStub [ : rank==1 ] RX10_TEMP30 = utmpz.RX10_TEMP30;
 { RX10_TEMP30 [ RX10_TEMP31 ] = ( RX10_TEMP43 ) ; }
 }

} 

