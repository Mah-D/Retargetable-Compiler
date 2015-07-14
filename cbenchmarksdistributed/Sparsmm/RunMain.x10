 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final long _Random_multiplier = Program . _Random_multiplier_init ( ) ; public static final long _Random_addend = Program . _Random_addend_init ( ) ; public static final long _Random_mask = Program . _Random_mask_init ( ) ; public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static final long _SparseMatmult_RANDOM_SEED = Program . _SparseMatmult_RANDOM_SEED_init ( ) ; public static final int _SparseMatmult_SPARSE_NUM_ITER = Program . _SparseMatmult_SPARSE_NUM_ITER_init ( ) ; public static final Random _SparseMatmult_R = Program . _SparseMatmult_R_init ( ) ; public static long _Random_multiplier_init ( ) { final long X10_TEMP2 = ( 0x5DEECE66DL ) ; return X10_TEMP2 ; }
 public static long _Random_addend_init ( ) { final long X10_TEMP2 = ( 0xBL ) ; return X10_TEMP2 ; }
 public static long _Random_mask_init ( ) { final long X10_TEMP1 = ( 1L ) ; final int X10_TEMP2 = ( 48 ) ; final long X10_TEMP4 = ( X10_TEMP1 << X10_TEMP2 ) ; final int X10_TEMP5 = ( 1 ) ; final long X10_TEMP7 = ( X10_TEMP4 - X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static int Random_nextbits ( final Random X10_TEMP0 , final int bits ) { long oldseed = ( X10_TEMP0 . seed ) ; final long X10_TEMP2 = ( oldseed * _Random_multiplier ) ; final long X10_TEMP4 = ( X10_TEMP2 + _Random_addend ) ; long nextseed = ( X10_TEMP4 & _Random_mask ) ; final long X10_TEMP7 = ( nextseed ) ; X10_TEMP0 . seed = ( X10_TEMP7 ) ; final int X10_TEMP8 = ( 48 ) ; final int X10_TEMP10 = ( X10_TEMP8 - bits ) ; final long X10_TEMP12 = ( nextseed >>> X10_TEMP10 ) ; final int X10_TEMP14 = ( ( int ) X10_TEMP12 ) ; return X10_TEMP14 ; }
 public static int Random_nextInt ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 32 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; return X10_TEMP4 ; }
 public static long Random_nextLong ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 32 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final long X10_TEMP5 = ( ( long ) X10_TEMP4 ) ; final int X10_TEMP6 = ( 32 ) ; final long X10_TEMP8 = ( X10_TEMP5 << X10_TEMP6 ) ; final int X10_TEMP10 = ( 32 ) ; final int X10_TEMP11 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ) ; final long X10_TEMP13 = ( X10_TEMP8 + X10_TEMP11 ) ; return X10_TEMP13 ; }
 public static boolean Random_nextBoolean ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 1 ) ; final int X10_TEMP3 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final int X10_TEMP4 = ( 0 ) ; final boolean X10_TEMP6 = ( X10_TEMP3 != X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double Random_nextDouble ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 26 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final long X10_TEMP5 = ( ( long ) X10_TEMP4 ) ; final int X10_TEMP6 = ( 27 ) ; final long X10_TEMP8 = ( X10_TEMP5 << X10_TEMP6 ) ; final int X10_TEMP10 = ( 27 ) ; final int X10_TEMP11 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ) ; final long X10_TEMP13 = ( X10_TEMP8 + X10_TEMP11 ) ; final long X10_TEMP14 = ( 1L ) ; final int X10_TEMP15 = ( 53 ) ; final long X10_TEMP17 = ( X10_TEMP14 << X10_TEMP15 ) ; final double X10_TEMP18 = ( ( double ) X10_TEMP17 ) ; final double X10_TEMP20 = ( X10_TEMP13 / X10_TEMP18 ) ; return X10_TEMP20 ; }
 public static void runMain ( ) { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; }
 finish { final SparseMatmult X10_TEMP4 = ( new SparseMatmult ( ) ) ; final int X10_TEMP6 = ( 0 ) ; Program . SparseMatmult_run ( X10_TEMP4 , X10_TEMP6 ) ; }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP9 = ( "Wall-clock time for sparsemm: " ) ; final double X10_TEMP10 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP11 = ( X10_TEMP9 + X10_TEMP10 ) ; final String X10_TEMP12 = ( " secs" ) ; final String X10_TEMP14 = ( X10_TEMP11 + X10_TEMP12 ) ; System.out.println ( X10_TEMP14 ) ; }
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
 public static long _SparseMatmult_RANDOM_SEED_init ( ) { final long X10_TEMP2 = ( 10101010 ) ; return X10_TEMP2 ; }
 public static int _SparseMatmult_SPARSE_NUM_ITER_init ( ) { final int X10_TEMP2 = ( 200 ) ; return X10_TEMP2 ; }
 public static void SparseMatmult_initDataSizes_M ( final SparseMatmult X10_TEMP0 , final intRefArray1 datasizesM ) { final int X10_TEMP2 = ( 0 ) ; final int X10_TEMP4 = ( 100 ) ; final int X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP2 ) ; final Dist1 RX10_TEMP1 = datasizesM . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array datasizesM" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1int ( datasizesM , RX10_TEMP3 , X10_TEMP5 ) ; final int X10_TEMP7 = ( 1 ) ; final int X10_TEMP9 = ( 100000 ) ; final int X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( X10_TEMP7 ) ; final Dist1 RX10_TEMP12 = datasizesM . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array datasizesM" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1int ( datasizesM , RX10_TEMP14 , X10_TEMP10 ) ; final int X10_TEMP12 = ( 2 ) ; final int X10_TEMP14 = ( 500000 ) ; final int X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( X10_TEMP12 ) ; final Dist1 RX10_TEMP23 = datasizesM . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array datasizesM" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1int ( datasizesM , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static void SparseMatmult_initDataSizes_N ( final SparseMatmult X10_TEMP0 , final intRefArray1 datasizesN ) { final int X10_TEMP2 = ( 0 ) ; final int X10_TEMP4 = ( 100 ) ; final int X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP2 ) ; final Dist1 RX10_TEMP1 = datasizesN . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array datasizesN" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1int ( datasizesN , RX10_TEMP3 , X10_TEMP5 ) ; final int X10_TEMP7 = ( 1 ) ; final int X10_TEMP9 = ( 100000 ) ; final int X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( X10_TEMP7 ) ; final Dist1 RX10_TEMP12 = datasizesN . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array datasizesN" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1int ( datasizesN , RX10_TEMP14 , X10_TEMP10 ) ; final int X10_TEMP12 = ( 2 ) ; final int X10_TEMP14 = ( 500000 ) ; final int X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( X10_TEMP12 ) ; final Dist1 RX10_TEMP23 = datasizesN . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array datasizesN" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1int ( datasizesN , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static void SparseMatmult_initDataSizes_NZ ( final SparseMatmult X10_TEMP0 , final intRefArray1 datasizesNZ ) { final int X10_TEMP2 = ( 0 ) ; final int X10_TEMP4 = ( 500 ) ; final int X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP2 ) ; final Dist1 RX10_TEMP1 = datasizesNZ . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array datasizesNZ" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1int ( datasizesNZ , RX10_TEMP3 , X10_TEMP5 ) ; final int X10_TEMP7 = ( 1 ) ; final int X10_TEMP9 = ( 500000 ) ; final int X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( X10_TEMP7 ) ; final Dist1 RX10_TEMP12 = datasizesNZ . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array datasizesNZ" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1int ( datasizesNZ , RX10_TEMP14 , X10_TEMP10 ) ; final int X10_TEMP12 = ( 2 ) ; final int X10_TEMP14 = ( 2500000 ) ; final int X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( X10_TEMP12 ) ; final Dist1 RX10_TEMP23 = datasizesNZ . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array datasizesNZ" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1int ( datasizesNZ , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static Random _SparseMatmult_R_init ( ) { final Random X10_TEMP3 = ( new Random ( _SparseMatmult_RANDOM_SEED ) ) ; return X10_TEMP3 ; }
 public static void SparseMatmult_JGFsetsize ( final SparseMatmult X10_TEMP0 , final int setSize ) { final int X10_TEMP2 = ( setSize ) ; X10_TEMP0 . setSize = ( X10_TEMP2 ) ; }
 public static void SparseMatmult_JGFinitialise ( final SparseMatmult X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 2 ) ; final Region1 ar = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; final Dist1 dr = Program . getPlaceDist1 ( ar , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = dr . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP6 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dr , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T1 utmp1 = new T1(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread1(utmp1); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP17 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final intStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final intRefArray1 RX10_TEMP20 = new intRefArray1 ( dr , RX10_TEMP17 ) ; final intRefArray1 datasizes_M = RX10_TEMP20 ; final Region1 RX10_TEMP21 = dr . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP27 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( dr , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T2 utmp2 = new T2(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {Program.thread2(utmp2); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP38 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final intStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final intRefArray1 RX10_TEMP41 = new intRefArray1 ( dr , RX10_TEMP38 ) ; final intRefArray1 datasizes_N = RX10_TEMP41 ; final Region1 RX10_TEMP42 = dr . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP48 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( dr , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T3 utmp3 = new T3(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {Program.thread3(utmp3); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP59 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final intStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final intRefArray1 RX10_TEMP62 = new intRefArray1 ( dr , RX10_TEMP59 ) ; final intRefArray1 datasizes_nz = RX10_TEMP62 ; Program . SparseMatmult_initDataSizes_M ( X10_TEMP0 , datasizes_M ) ; Program . SparseMatmult_initDataSizes_N ( X10_TEMP0 , datasizes_N ) ; Program . SparseMatmult_initDataSizes_NZ ( X10_TEMP0 , datasizes_nz ) ; final int X10_TEMP21 = ( X10_TEMP0 . setSize ) ; final Point1 RX10_TEMP63 = new Point1 ( X10_TEMP21 ) ; final Dist1 RX10_TEMP64 = datasizes_N . distValue ; final Region1 RX10_TEMP65 = RX10_TEMP64 . dReg ; final int RX10_TEMP66 = Program . searchPointInRegion1 ( RX10_TEMP65 , RX10_TEMP63 ) ; final int RX10_TEMP67 = 0 ; final boolean RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP69 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP69 ) ; }
 final place RX10_TEMP70 = Program . getPlaceFromDist1 ( RX10_TEMP64 , RX10_TEMP66 ) ; final place RX10_TEMP72 = here ; final boolean RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72 ; if ( RX10_TEMP73 ) { String RX10_TEMP71 = "Bad place access for array datasizes_N" ; throw new RuntimeException ( RX10_TEMP71 ) ; }
 final int RX10_TEMP74 = Program . getRefArrayValue1int ( datasizes_N , RX10_TEMP66 ) ; final int ds_N = ( RX10_TEMP74 ) ; final int X10_TEMP24 = ( X10_TEMP0 . setSize ) ; final Point1 RX10_TEMP75 = new Point1 ( X10_TEMP24 ) ; final Dist1 RX10_TEMP76 = datasizes_M . distValue ; final Region1 RX10_TEMP77 = RX10_TEMP76 . dReg ; final int RX10_TEMP78 = Program . searchPointInRegion1 ( RX10_TEMP77 , RX10_TEMP75 ) ; final int RX10_TEMP79 = 0 ; final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP81 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP81 ) ; }
 final place RX10_TEMP82 = Program . getPlaceFromDist1 ( RX10_TEMP76 , RX10_TEMP78 ) ; final place RX10_TEMP84 = here ; final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84 ; if ( RX10_TEMP85 ) { String RX10_TEMP83 = "Bad place access for array datasizes_M" ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 final int RX10_TEMP86 = Program . getRefArrayValue1int ( datasizes_M , RX10_TEMP78 ) ; final int ds_M = ( RX10_TEMP86 ) ; final int X10_TEMP27 = ( X10_TEMP0 . setSize ) ; final Point1 RX10_TEMP87 = new Point1 ( X10_TEMP27 ) ; final Dist1 RX10_TEMP88 = datasizes_nz . distValue ; final Region1 RX10_TEMP89 = RX10_TEMP88 . dReg ; final int RX10_TEMP90 = Program . searchPointInRegion1 ( RX10_TEMP89 , RX10_TEMP87 ) ; final int RX10_TEMP91 = 0 ; final boolean RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP93 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP93 ) ; }
 final place RX10_TEMP94 = Program . getPlaceFromDist1 ( RX10_TEMP88 , RX10_TEMP90 ) ; final place RX10_TEMP96 = here ; final boolean RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96 ; if ( RX10_TEMP97 ) { String RX10_TEMP95 = "Bad place access for array datasizes_nz" ; throw new RuntimeException ( RX10_TEMP95 ) ; }
 final int RX10_TEMP98 = Program . getRefArrayValue1int ( datasizes_nz , RX10_TEMP90 ) ; final int ds_nz = ( RX10_TEMP98 ) ; final int X10_TEMP32 = ( 0 ) ; final int X10_TEMP30 = ( 1 ) ; final int X10_TEMP33 = ( ds_nz - X10_TEMP30 ) ; final Region1 r_nz = Program . createNewRegion1R ( X10_TEMP32 , X10_TEMP33 ) ; final int X10_TEMP39 = ( 0 ) ; final int X10_TEMP36 = ( X10_TEMP0 . nthreads ) ; final int X10_TEMP37 = ( 1 ) ; final int X10_TEMP40 = ( X10_TEMP36 - X10_TEMP37 ) ; final Region1 r_nthreads = Program . createNewRegion1R ( X10_TEMP39 , X10_TEMP40 ) ; final int X10_TEMP45 = ( 0 ) ; final int X10_TEMP43 = ( 1 ) ; final int X10_TEMP46 = ( ds_M - X10_TEMP43 ) ; final Region1 X10_TEMP48 = Program . createNewRegion1R ( X10_TEMP45 , X10_TEMP46 ) ; final Dist1 X10_TEMP49 = Program . getBlockDist1 ( X10_TEMP48 ) ; final Dist1 d_M = X10_TEMP49 ; final int X10_TEMP53 = ( 0 ) ; final int X10_TEMP54 = ( X10_TEMP0 . nthreads ) ; final Region1 r_nthreadsPlus1 = Program . createNewRegion1R ( X10_TEMP53 , X10_TEMP54 ) ; final int X10_TEMP59 = ( 0 ) ; final int X10_TEMP57 = ( 1 ) ; final int X10_TEMP60 = ( ds_N - X10_TEMP57 ) ; final Region1 ds_NReg = Program . createNewRegion1R ( X10_TEMP59 , X10_TEMP60 ) ; final place X10_TEMP62 = ( here ) ; final Dist1 ds_NRegDist = Program . getPlaceDist1 ( ds_NReg , X10_TEMP62 ) ; final Region1 RX10_TEMP99 = ds_NRegDist . dReg ; final int RX10_TEMP100 = 0 ; final int RX10_TEMP101 = 1 ; int RX10_TEMP102 = place.MAX_PLACES ; RX10_TEMP102 = RX10_TEMP102 - RX10_TEMP101 ; final region ( : rank==1 ) RX10_TEMP103 = [ 0 : RX10_TEMP102 ] ; final dist ( : rank==1 ) RX10_TEMP104 = [ 0 : RX10_TEMP102 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP105 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP104 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP106 : RX10_TEMP103 ) { final place RX10_TEMP107 = here ; final int RX10_TEMP108 = RX10_TEMP106 [0] ; final place RX10_TEMP109 = place.places ( RX10_TEMP108 ) ; final int RX10_TEMP110 = Program . getDistLocalCount1 ( ds_NRegDist , RX10_TEMP108 ) ; final int RX10_TEMP111 = RX10_TEMP110 - RX10_TEMP101 ; 
 final T4 utmp4 = new T4(RX10_TEMP111, RX10_TEMP107, RX10_TEMP106, RX10_TEMP105);
 async (RX10_TEMP109) {Program.thread4(utmp4); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP115 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP103 ] ( point ( : rank==1 ) RX10_TEMP117 ) { final doubleStub RX10_TEMP116 = RX10_TEMP105 [ RX10_TEMP117 ] ; return RX10_TEMP116 ; }
 ) ; final doubleRefArray1 RX10_TEMP118 = new doubleRefArray1 ( ds_NRegDist , RX10_TEMP115 ) ; final doubleRefArray1 X10_TEMP64 = RX10_TEMP118 ; final doubleRefArray1 X10_TEMP67 = Program . SparseMatmult_init ( X10_TEMP64 , _SparseMatmult_R ) ; final doubleRefArray1 xin = X10_TEMP67 ; final int X10_TEMP75 = ( 0 ) ; final Dist1 RX10_TEMP119 = xin . distValue ; final Dist1 X10_TEMP70 = RX10_TEMP119 ; final Region1 RX10_TEMP120 = X10_TEMP70 . dReg ; final Region1 X10_TEMP71 = RX10_TEMP120 ; final int X10_TEMP72 = ( X10_TEMP71 . regSize ) ; final int X10_TEMP73 = ( 1 ) ; final int X10_TEMP76 = ( X10_TEMP72 - X10_TEMP73 ) ; final Region1 xinreg = Program . createNewRegion1R ( X10_TEMP75 , X10_TEMP76 ) ; final place X10_TEMP78 = ( here ) ; final Dist1 xinregDist = Program . getPlaceDist1 ( xinreg , X10_TEMP78 ) ; final Region1 RX10_TEMP121 = xinreg ; final int RX10_TEMP136 = xinreg . regSize ; final int RX10_TEMP137 = 1 ; final int RX10_TEMP138 = RX10_TEMP136 - RX10_TEMP137 ; final region ( : rank==1 ) RX10_TEMP135 = [ 0 : RX10_TEMP138 ] ; final double value [ : rank==1 ] RX10_TEMP139 = ( double value [ : rank==1 ] ) ( new double value [ RX10_TEMP135 ] ( point ( : rank==1 ) RX10_TEMP122 ) { final int RX10_TEMP123 = RX10_TEMP122 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP121 , RX10_TEMP123 ) ; final Dist1 RX10_TEMP124 = xin . distValue ; final Region1 RX10_TEMP125 = RX10_TEMP124 . dReg ; final int RX10_TEMP126 = Program . searchPointInRegion1 ( RX10_TEMP125 , p ) ; final int RX10_TEMP127 = 0 ; final boolean RX10_TEMP128 = RX10_TEMP126 < RX10_TEMP127 ; if ( RX10_TEMP128 ) { String RX10_TEMP129 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP129 ) ; }
 final place RX10_TEMP130 = Program . getPlaceFromDist1 ( RX10_TEMP124 , RX10_TEMP126 ) ; final place RX10_TEMP132 = here ; final boolean RX10_TEMP133 = RX10_TEMP130 != RX10_TEMP132 ; if ( RX10_TEMP133 ) { String RX10_TEMP131 = "Bad place access for array xin" ; throw new RuntimeException ( RX10_TEMP131 ) ; }
 final double RX10_TEMP134 = Program . getRefArrayValue1double ( xin , RX10_TEMP126 ) ; final double X10_TEMP82 = ( RX10_TEMP134 ) ; return X10_TEMP82 ; }
 ) ; final doubleValArray1 RX10_TEMP140 = new doubleValArray1 ( xinreg , RX10_TEMP139 ) ; final doubleValArray1 X10_TEMP83 = RX10_TEMP140 ; final doubleValArray1 X10_TEMP85 = X10_TEMP83 ; X10_TEMP0 . x = ( X10_TEMP85 ) ; final Region1 RX10_TEMP141 = d_M . dReg ; final int RX10_TEMP142 = 0 ; final int RX10_TEMP143 = 1 ; int RX10_TEMP144 = place.MAX_PLACES ; RX10_TEMP144 = RX10_TEMP144 - RX10_TEMP143 ; final region ( : rank==1 ) RX10_TEMP145 = [ 0 : RX10_TEMP144 ] ; final dist ( : rank==1 ) RX10_TEMP146 = [ 0 : RX10_TEMP144 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP147 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP146 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP148 : RX10_TEMP145 ) { final place RX10_TEMP149 = here ; final int RX10_TEMP150 = RX10_TEMP148 [0] ; final place RX10_TEMP151 = place.places ( RX10_TEMP150 ) ; final int RX10_TEMP152 = Program . getDistLocalCount1 ( d_M , RX10_TEMP150 ) ; final int RX10_TEMP153 = RX10_TEMP152 - RX10_TEMP143 ; 
 final T5 utmp5 = new T5(RX10_TEMP153, RX10_TEMP149, RX10_TEMP148, RX10_TEMP147);
 async (RX10_TEMP151) {Program.thread5(utmp5); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP157 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP145 ] ( point ( : rank==1 ) RX10_TEMP159 ) { final doubleStub RX10_TEMP158 = RX10_TEMP147 [ RX10_TEMP159 ] ; return RX10_TEMP158 ; }
 ) ; final doubleRefArray1 RX10_TEMP160 = new doubleRefArray1 ( d_M , RX10_TEMP157 ) ; final doubleRefArray1 X10_TEMP87 = RX10_TEMP160 ; final doubleRefArray1 X10_TEMP88 = X10_TEMP87 ; X10_TEMP0 . y = ( X10_TEMP88 ) ; final place X10_TEMP89 = ( here ) ; final Dist1 r_nthreadsregDist = Program . getPlaceDist1 ( r_nthreads , X10_TEMP89 ) ; final Region1 RX10_TEMP161 = r_nthreadsregDist . dReg ; final int RX10_TEMP162 = 0 ; final int RX10_TEMP163 = 1 ; int RX10_TEMP164 = place.MAX_PLACES ; RX10_TEMP164 = RX10_TEMP164 - RX10_TEMP163 ; final region ( : rank==1 ) RX10_TEMP165 = [ 0 : RX10_TEMP164 ] ; final dist ( : rank==1 ) RX10_TEMP166 = [ 0 : RX10_TEMP164 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP167 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP166 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP168 : RX10_TEMP165 ) { final place RX10_TEMP169 = here ; final int RX10_TEMP170 = RX10_TEMP168 [0] ; final place RX10_TEMP171 = place.places ( RX10_TEMP170 ) ; final int RX10_TEMP172 = Program . getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP170 ) ; final int RX10_TEMP173 = RX10_TEMP172 - RX10_TEMP163 ; 
 final T6 utmp6 = new T6(RX10_TEMP173, RX10_TEMP169, RX10_TEMP168, RX10_TEMP167);
 async (RX10_TEMP171) {Program.thread6(utmp6); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP177 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP165 ] ( point ( : rank==1 ) RX10_TEMP179 ) { final intStub RX10_TEMP178 = RX10_TEMP167 [ RX10_TEMP179 ] ; return RX10_TEMP178 ; }
 ) ; final intRefArray1 RX10_TEMP180 = new intRefArray1 ( r_nthreadsregDist , RX10_TEMP177 ) ; final intRefArray1 X10_TEMP91 = RX10_TEMP180 ; intRefArray1 ilow = X10_TEMP91 ; final Region1 RX10_TEMP181 = r_nthreadsregDist . dReg ; final int RX10_TEMP182 = 0 ; final int RX10_TEMP183 = 1 ; int RX10_TEMP184 = place.MAX_PLACES ; RX10_TEMP184 = RX10_TEMP184 - RX10_TEMP183 ; final region ( : rank==1 ) RX10_TEMP185 = [ 0 : RX10_TEMP184 ] ; final dist ( : rank==1 ) RX10_TEMP186 = [ 0 : RX10_TEMP184 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP187 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP186 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP188 : RX10_TEMP185 ) { final place RX10_TEMP189 = here ; final int RX10_TEMP190 = RX10_TEMP188 [0] ; final place RX10_TEMP191 = place.places ( RX10_TEMP190 ) ; final int RX10_TEMP192 = Program . getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP190 ) ; final int RX10_TEMP193 = RX10_TEMP192 - RX10_TEMP183 ; 
 final T7 utmp7 = new T7(RX10_TEMP193, RX10_TEMP189, RX10_TEMP188, RX10_TEMP187);
 async (RX10_TEMP191) {Program.thread7(utmp7); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP197 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP185 ] ( point ( : rank==1 ) RX10_TEMP199 ) { final intStub RX10_TEMP198 = RX10_TEMP187 [ RX10_TEMP199 ] ; return RX10_TEMP198 ; }
 ) ; final intRefArray1 RX10_TEMP200 = new intRefArray1 ( r_nthreadsregDist , RX10_TEMP197 ) ; final intRefArray1 X10_TEMP93 = RX10_TEMP200 ; intRefArray1 iup = X10_TEMP93 ; final place X10_TEMP95 = ( here ) ; final Dist1 r_nthreadsplus1regDist = Program . getPlaceDist1 ( r_nthreadsPlus1 , X10_TEMP95 ) ; final place X10_TEMP97 = ( here ) ; final Dist1 dsnzDist = Program . getPlaceDist1 ( r_nz , X10_TEMP97 ) ; final Region1 RX10_TEMP201 = dsnzDist . dReg ; final int RX10_TEMP202 = 0 ; final int RX10_TEMP203 = 1 ; int RX10_TEMP204 = place.MAX_PLACES ; RX10_TEMP204 = RX10_TEMP204 - RX10_TEMP203 ; final region ( : rank==1 ) RX10_TEMP205 = [ 0 : RX10_TEMP204 ] ; final dist ( : rank==1 ) RX10_TEMP206 = [ 0 : RX10_TEMP204 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP207 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP206 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP208 : RX10_TEMP205 ) { final place RX10_TEMP209 = here ; final int RX10_TEMP210 = RX10_TEMP208 [0] ; final place RX10_TEMP211 = place.places ( RX10_TEMP210 ) ; final int RX10_TEMP212 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP210 ) ; final int RX10_TEMP213 = RX10_TEMP212 - RX10_TEMP203 ; 
 final T8 utmp8 = new T8(RX10_TEMP213, RX10_TEMP209, RX10_TEMP208, RX10_TEMP207);
 async (RX10_TEMP211) {Program.thread8(utmp8); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP217 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP205 ] ( point ( : rank==1 ) RX10_TEMP219 ) { final intStub RX10_TEMP218 = RX10_TEMP207 [ RX10_TEMP219 ] ; return RX10_TEMP218 ; }
 ) ; final intRefArray1 RX10_TEMP220 = new intRefArray1 ( dsnzDist , RX10_TEMP217 ) ; final intRefArray1 rowt = RX10_TEMP220 ; final Region1 RX10_TEMP221 = dsnzDist . dReg ; final int RX10_TEMP222 = 0 ; final int RX10_TEMP223 = 1 ; int RX10_TEMP224 = place.MAX_PLACES ; RX10_TEMP224 = RX10_TEMP224 - RX10_TEMP223 ; final region ( : rank==1 ) RX10_TEMP225 = [ 0 : RX10_TEMP224 ] ; final dist ( : rank==1 ) RX10_TEMP226 = [ 0 : RX10_TEMP224 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP227 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP226 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP228 : RX10_TEMP225 ) { final place RX10_TEMP229 = here ; final int RX10_TEMP230 = RX10_TEMP228 [0] ; final place RX10_TEMP231 = place.places ( RX10_TEMP230 ) ; final int RX10_TEMP232 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP230 ) ; final int RX10_TEMP233 = RX10_TEMP232 - RX10_TEMP223 ; 
 final T9 utmp9 = new T9(RX10_TEMP233, RX10_TEMP229, RX10_TEMP228, RX10_TEMP227);
 async (RX10_TEMP231) {Program.thread9(utmp9); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP237 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP225 ] ( point ( : rank==1 ) RX10_TEMP239 ) { final intStub RX10_TEMP238 = RX10_TEMP227 [ RX10_TEMP239 ] ; return RX10_TEMP238 ; }
 ) ; final intRefArray1 RX10_TEMP240 = new intRefArray1 ( dsnzDist , RX10_TEMP237 ) ; final intRefArray1 colt = RX10_TEMP240 ; final Region1 RX10_TEMP241 = dsnzDist . dReg ; final int RX10_TEMP242 = 0 ; final int RX10_TEMP243 = 1 ; int RX10_TEMP244 = place.MAX_PLACES ; RX10_TEMP244 = RX10_TEMP244 - RX10_TEMP243 ; final region ( : rank==1 ) RX10_TEMP245 = [ 0 : RX10_TEMP244 ] ; final dist ( : rank==1 ) RX10_TEMP246 = [ 0 : RX10_TEMP244 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP247 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP246 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP248 : RX10_TEMP245 ) { final place RX10_TEMP249 = here ; final int RX10_TEMP250 = RX10_TEMP248 [0] ; final place RX10_TEMP251 = place.places ( RX10_TEMP250 ) ; final int RX10_TEMP252 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP250 ) ; final int RX10_TEMP253 = RX10_TEMP252 - RX10_TEMP243 ; 
 final T10 utmp10 = new T10(RX10_TEMP253, RX10_TEMP249, RX10_TEMP248, RX10_TEMP247);
 async (RX10_TEMP251) {Program.thread10(utmp10); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP257 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP245 ] ( point ( : rank==1 ) RX10_TEMP259 ) { final doubleStub RX10_TEMP258 = RX10_TEMP247 [ RX10_TEMP259 ] ; return RX10_TEMP258 ; }
 ) ; final doubleRefArray1 RX10_TEMP260 = new doubleRefArray1 ( dsnzDist , RX10_TEMP257 ) ; final doubleRefArray1 valt = RX10_TEMP260 ; final Region1 RX10_TEMP261 = r_nthreadsplus1regDist . dReg ; final int RX10_TEMP262 = 0 ; final int RX10_TEMP263 = 1 ; int RX10_TEMP264 = place.MAX_PLACES ; RX10_TEMP264 = RX10_TEMP264 - RX10_TEMP263 ; final region ( : rank==1 ) RX10_TEMP265 = [ 0 : RX10_TEMP264 ] ; final dist ( : rank==1 ) RX10_TEMP266 = [ 0 : RX10_TEMP264 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP267 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP266 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP268 : RX10_TEMP265 ) { final place RX10_TEMP269 = here ; final int RX10_TEMP270 = RX10_TEMP268 [0] ; final place RX10_TEMP271 = place.places ( RX10_TEMP270 ) ; final int RX10_TEMP272 = Program . getDistLocalCount1 ( r_nthreadsplus1regDist , RX10_TEMP270 ) ; final int RX10_TEMP273 = RX10_TEMP272 - RX10_TEMP263 ; 
 final T11 utmp11 = new T11(RX10_TEMP273, RX10_TEMP269, RX10_TEMP268, RX10_TEMP267);
 async (RX10_TEMP271) {Program.thread11(utmp11); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP277 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP265 ] ( point ( : rank==1 ) RX10_TEMP279 ) { final intStub RX10_TEMP278 = RX10_TEMP267 [ RX10_TEMP279 ] ; return RX10_TEMP278 ; }
 ) ; final intRefArray1 RX10_TEMP280 = new intRefArray1 ( r_nthreadsplus1regDist , RX10_TEMP277 ) ; intRefArray1 sumT = RX10_TEMP280 ; final int X10_TEMP103 = ( X10_TEMP0 . nthreads ) ; final int X10_TEMP104 = ( ds_M + X10_TEMP103 ) ; final int X10_TEMP105 = ( 1 ) ; final int X10_TEMP107 = ( X10_TEMP104 - X10_TEMP105 ) ; final int X10_TEMP108 = ( X10_TEMP0 . nthreads ) ; int sect = ( X10_TEMP107 / X10_TEMP108 ) ; final Region1 RX10_TEMP281 = dsnzDist . dReg ; final int RX10_TEMP282 = 0 ; final int RX10_TEMP283 = 1 ; int RX10_TEMP284 = place.MAX_PLACES ; RX10_TEMP284 = RX10_TEMP284 - RX10_TEMP283 ; final region ( : rank==1 ) RX10_TEMP285 = [ 0 : RX10_TEMP284 ] ; final dist ( : rank==1 ) RX10_TEMP286 = [ 0 : RX10_TEMP284 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP287 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP286 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP288 : RX10_TEMP285 ) { final place RX10_TEMP289 = here ; final int RX10_TEMP290 = RX10_TEMP288 [0] ; final place RX10_TEMP291 = place.places ( RX10_TEMP290 ) ; final int RX10_TEMP292 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP290 ) ; final int RX10_TEMP293 = RX10_TEMP292 - RX10_TEMP283 ; 
 final T12 utmp12 = new T12(RX10_TEMP293, RX10_TEMP289, RX10_TEMP288, RX10_TEMP287);
 async (RX10_TEMP291) {Program.thread12(utmp12); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP297 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP285 ] ( point ( : rank==1 ) RX10_TEMP299 ) { final intStub RX10_TEMP298 = RX10_TEMP287 [ RX10_TEMP299 ] ; return RX10_TEMP298 ; }
 ) ; final intRefArray1 RX10_TEMP300 = new intRefArray1 ( dsnzDist , RX10_TEMP297 ) ; intRefArray1 rowin = RX10_TEMP300 ; final Region1 RX10_TEMP301 = dsnzDist . dReg ; final int RX10_TEMP302 = 0 ; final int RX10_TEMP303 = 1 ; int RX10_TEMP304 = place.MAX_PLACES ; RX10_TEMP304 = RX10_TEMP304 - RX10_TEMP303 ; final region ( : rank==1 ) RX10_TEMP305 = [ 0 : RX10_TEMP304 ] ; final dist ( : rank==1 ) RX10_TEMP306 = [ 0 : RX10_TEMP304 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP307 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP306 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP308 : RX10_TEMP305 ) { final place RX10_TEMP309 = here ; final int RX10_TEMP310 = RX10_TEMP308 [0] ; final place RX10_TEMP311 = place.places ( RX10_TEMP310 ) ; final int RX10_TEMP312 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP310 ) ; final int RX10_TEMP313 = RX10_TEMP312 - RX10_TEMP303 ; 
 final T13 utmp13 = new T13(RX10_TEMP313, RX10_TEMP309, RX10_TEMP308, RX10_TEMP307);
 async (RX10_TEMP311) {Program.thread13(utmp13); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP317 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP305 ] ( point ( : rank==1 ) RX10_TEMP319 ) { final intStub RX10_TEMP318 = RX10_TEMP307 [ RX10_TEMP319 ] ; return RX10_TEMP318 ; }
 ) ; final intRefArray1 RX10_TEMP320 = new intRefArray1 ( dsnzDist , RX10_TEMP317 ) ; intRefArray1 colin = RX10_TEMP320 ; final Region1 RX10_TEMP321 = dsnzDist . dReg ; final int RX10_TEMP322 = 0 ; final int RX10_TEMP323 = 1 ; int RX10_TEMP324 = place.MAX_PLACES ; RX10_TEMP324 = RX10_TEMP324 - RX10_TEMP323 ; final region ( : rank==1 ) RX10_TEMP325 = [ 0 : RX10_TEMP324 ] ; final dist ( : rank==1 ) RX10_TEMP326 = [ 0 : RX10_TEMP324 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP327 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP326 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP328 : RX10_TEMP325 ) { final place RX10_TEMP329 = here ; final int RX10_TEMP330 = RX10_TEMP328 [0] ; final place RX10_TEMP331 = place.places ( RX10_TEMP330 ) ; final int RX10_TEMP332 = Program . getDistLocalCount1 ( dsnzDist , RX10_TEMP330 ) ; final int RX10_TEMP333 = RX10_TEMP332 - RX10_TEMP323 ; 
 final T14 utmp14 = new T14(RX10_TEMP333, RX10_TEMP329, RX10_TEMP328, RX10_TEMP327);
 async (RX10_TEMP331) {Program.thread14(utmp14); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP337 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP325 ] ( point ( : rank==1 ) RX10_TEMP339 ) { final doubleStub RX10_TEMP338 = RX10_TEMP327 [ RX10_TEMP339 ] ; return RX10_TEMP338 ; }
 ) ; final doubleRefArray1 RX10_TEMP340 = new doubleRefArray1 ( dsnzDist , RX10_TEMP337 ) ; doubleRefArray1 valin = RX10_TEMP340 ; final Region1 RX10_TEMP341 = r_nthreadsregDist . dReg ; final int RX10_TEMP342 = 0 ; final int RX10_TEMP343 = 1 ; int RX10_TEMP344 = place.MAX_PLACES ; RX10_TEMP344 = RX10_TEMP344 - RX10_TEMP343 ; final region ( : rank==1 ) RX10_TEMP345 = [ 0 : RX10_TEMP344 ] ; final dist ( : rank==1 ) RX10_TEMP346 = [ 0 : RX10_TEMP344 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP347 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP346 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP348 : RX10_TEMP345 ) { final place RX10_TEMP349 = here ; final int RX10_TEMP350 = RX10_TEMP348 [0] ; final place RX10_TEMP351 = place.places ( RX10_TEMP350 ) ; final int RX10_TEMP352 = Program . getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP350 ) ; final int RX10_TEMP353 = RX10_TEMP352 - RX10_TEMP343 ; 
 final T15 utmp15 = new T15(RX10_TEMP353, RX10_TEMP349, RX10_TEMP348, RX10_TEMP347);
 async (RX10_TEMP351) {Program.thread15(utmp15); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP357 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP345 ] ( point ( : rank==1 ) RX10_TEMP359 ) { final intStub RX10_TEMP358 = RX10_TEMP347 [ RX10_TEMP359 ] ; return RX10_TEMP358 ; }
 ) ; final intRefArray1 RX10_TEMP360 = new intRefArray1 ( r_nthreadsregDist , RX10_TEMP357 ) ; final intRefArray1 X10_TEMP113 = RX10_TEMP360 ; final intRefArray1 lowsumin = X10_TEMP113 ; final Region1 RX10_TEMP361 = r_nthreadsregDist . dReg ; final int RX10_TEMP362 = 0 ; final int RX10_TEMP363 = 1 ; int RX10_TEMP364 = place.MAX_PLACES ; RX10_TEMP364 = RX10_TEMP364 - RX10_TEMP363 ; final region ( : rank==1 ) RX10_TEMP365 = [ 0 : RX10_TEMP364 ] ; final dist ( : rank==1 ) RX10_TEMP366 = [ 0 : RX10_TEMP364 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP367 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP366 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP368 : RX10_TEMP365 ) { final place RX10_TEMP369 = here ; final int RX10_TEMP370 = RX10_TEMP368 [0] ; final place RX10_TEMP371 = place.places ( RX10_TEMP370 ) ; final int RX10_TEMP372 = Program . getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP370 ) ; final int RX10_TEMP373 = RX10_TEMP372 - RX10_TEMP363 ; 
 final T16 utmp16 = new T16(RX10_TEMP373, RX10_TEMP369, RX10_TEMP368, RX10_TEMP367);
 async (RX10_TEMP371) {Program.thread16(utmp16); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP377 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP365 ] ( point ( : rank==1 ) RX10_TEMP379 ) { final intStub RX10_TEMP378 = RX10_TEMP367 [ RX10_TEMP379 ] ; return RX10_TEMP378 ; }
 ) ; final intRefArray1 RX10_TEMP380 = new intRefArray1 ( r_nthreadsregDist , RX10_TEMP377 ) ; final intRefArray1 X10_TEMP115 = RX10_TEMP380 ; final intRefArray1 highsumin = X10_TEMP115 ; final int X10_TEMP120 = ( 0 ) ; final int X10_TEMP118 = ( 1 ) ; final int X10_TEMP121 = ( ds_nz - X10_TEMP118 ) ; final Region1 X10_TEMP123 = Program . createNewRegion1R ( X10_TEMP120 , X10_TEMP121 ) ; final int RX10_TEMP384 = 1 ; int RX10_TEMP382 = X10_TEMP123 . regSize ; RX10_TEMP382 = RX10_TEMP382 - RX10_TEMP384 ; final region ( : rank==1 ) RX10_TEMP383 = [ 0 : RX10_TEMP382 ] ; for ( point ( : rank==1 ) RX10_TEMP381 : RX10_TEMP383 ) { final int RX10_TEMP385 = RX10_TEMP381 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( X10_TEMP123 , RX10_TEMP385 ) ; final int X10_TEMP126 = ( Program . Random_nextInt ( _SparseMatmult_R ) ) ; final int X10_TEMP127 = ( Math . abs ( X10_TEMP126 ) ) ; final int X10_TEMP129 = ( X10_TEMP127 % ds_M ) ; final int X10_TEMP130 = ( X10_TEMP129 ) ; final Dist1 RX10_TEMP386 = rowin . distValue ; final Region1 RX10_TEMP387 = RX10_TEMP386 . dReg ; final int RX10_TEMP388 = Program . searchPointInRegion1 ( RX10_TEMP387 , p ) ; final int RX10_TEMP389 = 0 ; final boolean RX10_TEMP390 = RX10_TEMP388 < RX10_TEMP389 ; if ( RX10_TEMP390 ) { String RX10_TEMP391 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP391 ) ; }
 final place RX10_TEMP392 = Program . getPlaceFromDist1 ( RX10_TEMP386 , RX10_TEMP388 ) ; final place RX10_TEMP394 = here ; final boolean RX10_TEMP395 = RX10_TEMP392 != RX10_TEMP394 ; if ( RX10_TEMP395 ) { String RX10_TEMP393 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP393 ) ; }
 Program . setRefArrayValue1int ( rowin , RX10_TEMP388 , X10_TEMP130 ) ; final int X10_TEMP133 = ( Program . Random_nextInt ( _SparseMatmult_R ) ) ; final int X10_TEMP134 = ( Math . abs ( X10_TEMP133 ) ) ; final int X10_TEMP136 = ( X10_TEMP134 % ds_N ) ; final int X10_TEMP137 = ( X10_TEMP136 ) ; final Dist1 RX10_TEMP396 = colin . distValue ; final Region1 RX10_TEMP397 = RX10_TEMP396 . dReg ; final int RX10_TEMP398 = Program . searchPointInRegion1 ( RX10_TEMP397 , p ) ; final int RX10_TEMP399 = 0 ; final boolean RX10_TEMP400 = RX10_TEMP398 < RX10_TEMP399 ; if ( RX10_TEMP400 ) { String RX10_TEMP401 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP401 ) ; }
 final place RX10_TEMP402 = Program . getPlaceFromDist1 ( RX10_TEMP396 , RX10_TEMP398 ) ; final place RX10_TEMP404 = here ; final boolean RX10_TEMP405 = RX10_TEMP402 != RX10_TEMP404 ; if ( RX10_TEMP405 ) { String RX10_TEMP403 = "Bad place access for array colin" ; throw new RuntimeException ( RX10_TEMP403 ) ; }
 Program . setRefArrayValue1int ( colin , RX10_TEMP398 , X10_TEMP137 ) ; final double X10_TEMP140 = ( Program . Random_nextDouble ( _SparseMatmult_R ) ) ; final double X10_TEMP141 = ( X10_TEMP140 ) ; final Dist1 RX10_TEMP406 = valin . distValue ; final Region1 RX10_TEMP407 = RX10_TEMP406 . dReg ; final int RX10_TEMP408 = Program . searchPointInRegion1 ( RX10_TEMP407 , p ) ; final int RX10_TEMP409 = 0 ; final boolean RX10_TEMP410 = RX10_TEMP408 < RX10_TEMP409 ; if ( RX10_TEMP410 ) { String RX10_TEMP411 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP411 ) ; }
 final place RX10_TEMP412 = Program . getPlaceFromDist1 ( RX10_TEMP406 , RX10_TEMP408 ) ; final place RX10_TEMP414 = here ; final boolean RX10_TEMP415 = RX10_TEMP412 != RX10_TEMP414 ; if ( RX10_TEMP415 ) { String RX10_TEMP413 = "Bad place access for array valin" ; throw new RuntimeException ( RX10_TEMP413 ) ; }
 Program . setRefArrayValue1double ( valin , RX10_TEMP408 , X10_TEMP141 ) ; }
 final int RX10_TEMP419 = 1 ; int RX10_TEMP417 = r_nthreads . regSize ; RX10_TEMP417 = RX10_TEMP417 - RX10_TEMP419 ; final region ( : rank==1 ) RX10_TEMP418 = [ 0 : RX10_TEMP417 ] ; for ( point ( : rank==1 ) RX10_TEMP416 : RX10_TEMP418 ) { final int RX10_TEMP420 = RX10_TEMP416 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( r_nthreads , RX10_TEMP420 ) ; final int X10_TEMP145 = ( i . f0 ) ; final int X10_TEMP147 = ( X10_TEMP145 * sect ) ; final int X10_TEMP148 = ( X10_TEMP147 ) ; final Dist1 RX10_TEMP421 = ilow . distValue ; final Region1 RX10_TEMP422 = RX10_TEMP421 . dReg ; final int RX10_TEMP423 = Program . searchPointInRegion1 ( RX10_TEMP422 , i ) ; final int RX10_TEMP424 = 0 ; final boolean RX10_TEMP425 = RX10_TEMP423 < RX10_TEMP424 ; if ( RX10_TEMP425 ) { String RX10_TEMP426 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP426 ) ; }
 final place RX10_TEMP427 = Program . getPlaceFromDist1 ( RX10_TEMP421 , RX10_TEMP423 ) ; final place RX10_TEMP429 = here ; final boolean RX10_TEMP430 = RX10_TEMP427 != RX10_TEMP429 ; if ( RX10_TEMP430 ) { String RX10_TEMP428 = "Bad place access for array ilow" ; throw new RuntimeException ( RX10_TEMP428 ) ; }
 Program . setRefArrayValue1int ( ilow , RX10_TEMP423 , X10_TEMP148 ) ; final int X10_TEMP151 = ( i . f0 ) ; final int X10_TEMP152 = ( 1 ) ; final int X10_TEMP154 = ( X10_TEMP151 + X10_TEMP152 ) ; final int X10_TEMP156 = ( X10_TEMP154 * sect ) ; final int X10_TEMP157 = ( 1 ) ; final int X10_TEMP159 = ( X10_TEMP156 - X10_TEMP157 ) ; final int X10_TEMP160 = ( X10_TEMP159 ) ; final Dist1 RX10_TEMP431 = iup . distValue ; final Region1 RX10_TEMP432 = RX10_TEMP431 . dReg ; final int RX10_TEMP433 = Program . searchPointInRegion1 ( RX10_TEMP432 , i ) ; final int RX10_TEMP434 = 0 ; final boolean RX10_TEMP435 = RX10_TEMP433 < RX10_TEMP434 ; if ( RX10_TEMP435 ) { String RX10_TEMP436 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP436 ) ; }
 final place RX10_TEMP437 = Program . getPlaceFromDist1 ( RX10_TEMP431 , RX10_TEMP433 ) ; final place RX10_TEMP439 = here ; final boolean RX10_TEMP440 = RX10_TEMP437 != RX10_TEMP439 ; if ( RX10_TEMP440 ) { String RX10_TEMP438 = "Bad place access for array iup" ; throw new RuntimeException ( RX10_TEMP438 ) ; }
 Program . setRefArrayValue1int ( iup , RX10_TEMP433 , X10_TEMP160 ) ; final Dist1 RX10_TEMP441 = iup . distValue ; final Region1 RX10_TEMP442 = RX10_TEMP441 . dReg ; final int RX10_TEMP443 = Program . searchPointInRegion1 ( RX10_TEMP442 , i ) ; final int RX10_TEMP444 = 0 ; final boolean RX10_TEMP445 = RX10_TEMP443 < RX10_TEMP444 ; if ( RX10_TEMP445 ) { String RX10_TEMP446 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP446 ) ; }
 final place RX10_TEMP447 = Program . getPlaceFromDist1 ( RX10_TEMP441 , RX10_TEMP443 ) ; final place RX10_TEMP449 = here ; final boolean RX10_TEMP450 = RX10_TEMP447 != RX10_TEMP449 ; if ( RX10_TEMP450 ) { String RX10_TEMP448 = "Bad place access for array iup" ; throw new RuntimeException ( RX10_TEMP448 ) ; }
 final int RX10_TEMP451 = Program . getRefArrayValue1int ( iup , RX10_TEMP443 ) ; final int X10_TEMP162 = ( RX10_TEMP451 ) ; final boolean X10_TEMP164 = X10_TEMP162 > ds_M ; if ( X10_TEMP164 ) { final int X10_TEMP167 = ( ds_M ) ; final Dist1 RX10_TEMP452 = iup . distValue ; final Region1 RX10_TEMP453 = RX10_TEMP452 . dReg ; final int RX10_TEMP454 = Program . searchPointInRegion1 ( RX10_TEMP453 , i ) ; final int RX10_TEMP455 = 0 ; final boolean RX10_TEMP456 = RX10_TEMP454 < RX10_TEMP455 ; if ( RX10_TEMP456 ) { String RX10_TEMP457 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP457 ) ; }
 final place RX10_TEMP458 = Program . getPlaceFromDist1 ( RX10_TEMP452 , RX10_TEMP454 ) ; final place RX10_TEMP460 = here ; final boolean RX10_TEMP461 = RX10_TEMP458 != RX10_TEMP460 ; if ( RX10_TEMP461 ) { String RX10_TEMP459 = "Bad place access for array iup" ; throw new RuntimeException ( RX10_TEMP459 ) ; }
 Program . setRefArrayValue1int ( iup , RX10_TEMP454 , X10_TEMP167 ) ; }
 }
 final int RX10_TEMP465 = 1 ; int RX10_TEMP463 = r_nz . regSize ; RX10_TEMP463 = RX10_TEMP463 - RX10_TEMP465 ; final region ( : rank==1 ) RX10_TEMP464 = [ 0 : RX10_TEMP463 ] ; for ( point ( : rank==1 ) RX10_TEMP462 : RX10_TEMP464 ) { final int RX10_TEMP466 = RX10_TEMP462 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( r_nz , RX10_TEMP466 ) ; final int RX10_TEMP470 = 1 ; int RX10_TEMP468 = r_nthreads . regSize ; RX10_TEMP468 = RX10_TEMP468 - RX10_TEMP470 ; final region ( : rank==1 ) RX10_TEMP469 = [ 0 : RX10_TEMP468 ] ; for ( point ( : rank==1 ) RX10_TEMP467 : RX10_TEMP469 ) { final int RX10_TEMP471 = RX10_TEMP467 [0] ; final Point1 j = Program . regionOrdinalPoint1 ( r_nthreads , RX10_TEMP471 ) ; final Dist1 RX10_TEMP472 = rowin . distValue ; final Region1 RX10_TEMP473 = RX10_TEMP472 . dReg ; final int RX10_TEMP474 = Program . searchPointInRegion1 ( RX10_TEMP473 , i ) ; final int RX10_TEMP475 = 0 ; final boolean RX10_TEMP476 = RX10_TEMP474 < RX10_TEMP475 ; if ( RX10_TEMP476 ) { String RX10_TEMP477 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP477 ) ; }
 final place RX10_TEMP478 = Program . getPlaceFromDist1 ( RX10_TEMP472 , RX10_TEMP474 ) ; final place RX10_TEMP480 = here ; final boolean RX10_TEMP481 = RX10_TEMP478 != RX10_TEMP480 ; if ( RX10_TEMP481 ) { String RX10_TEMP479 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP479 ) ; }
 final int RX10_TEMP482 = Program . getRefArrayValue1int ( rowin , RX10_TEMP474 ) ; final int X10_TEMP172 = ( RX10_TEMP482 ) ; final Dist1 RX10_TEMP483 = ilow . distValue ; final Region1 RX10_TEMP484 = RX10_TEMP483 . dReg ; final int RX10_TEMP485 = Program . searchPointInRegion1 ( RX10_TEMP484 , j ) ; final int RX10_TEMP486 = 0 ; final boolean RX10_TEMP487 = RX10_TEMP485 < RX10_TEMP486 ; if ( RX10_TEMP487 ) { String RX10_TEMP488 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP488 ) ; }
 final place RX10_TEMP489 = Program . getPlaceFromDist1 ( RX10_TEMP483 , RX10_TEMP485 ) ; final place RX10_TEMP491 = here ; final boolean RX10_TEMP492 = RX10_TEMP489 != RX10_TEMP491 ; if ( RX10_TEMP492 ) { String RX10_TEMP490 = "Bad place access for array ilow" ; throw new RuntimeException ( RX10_TEMP490 ) ; }
 final int RX10_TEMP493 = Program . getRefArrayValue1int ( ilow , RX10_TEMP485 ) ; final int X10_TEMP173 = ( RX10_TEMP493 ) ; final boolean X10_TEMP175 = ( X10_TEMP172 >= X10_TEMP173 ) ; final Dist1 RX10_TEMP494 = rowin . distValue ; final Region1 RX10_TEMP495 = RX10_TEMP494 . dReg ; final int RX10_TEMP496 = Program . searchPointInRegion1 ( RX10_TEMP495 , i ) ; final int RX10_TEMP497 = 0 ; final boolean RX10_TEMP498 = RX10_TEMP496 < RX10_TEMP497 ; if ( RX10_TEMP498 ) { String RX10_TEMP499 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP499 ) ; }
 final place RX10_TEMP500 = Program . getPlaceFromDist1 ( RX10_TEMP494 , RX10_TEMP496 ) ; final place RX10_TEMP502 = here ; final boolean RX10_TEMP503 = RX10_TEMP500 != RX10_TEMP502 ; if ( RX10_TEMP503 ) { String RX10_TEMP501 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP501 ) ; }
 final int RX10_TEMP504 = Program . getRefArrayValue1int ( rowin , RX10_TEMP496 ) ; final int X10_TEMP178 = ( RX10_TEMP504 ) ; final Dist1 RX10_TEMP505 = iup . distValue ; final Region1 RX10_TEMP506 = RX10_TEMP505 . dReg ; final int RX10_TEMP507 = Program . searchPointInRegion1 ( RX10_TEMP506 , j ) ; final int RX10_TEMP508 = 0 ; final boolean RX10_TEMP509 = RX10_TEMP507 < RX10_TEMP508 ; if ( RX10_TEMP509 ) { String RX10_TEMP510 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP510 ) ; }
 final place RX10_TEMP511 = Program . getPlaceFromDist1 ( RX10_TEMP505 , RX10_TEMP507 ) ; final place RX10_TEMP513 = here ; final boolean RX10_TEMP514 = RX10_TEMP511 != RX10_TEMP513 ; if ( RX10_TEMP514 ) { String RX10_TEMP512 = "Bad place access for array iup" ; throw new RuntimeException ( RX10_TEMP512 ) ; }
 final int RX10_TEMP515 = Program . getRefArrayValue1int ( iup , RX10_TEMP507 ) ; final int X10_TEMP179 = ( RX10_TEMP515 ) ; final boolean X10_TEMP181 = ( X10_TEMP178 <= X10_TEMP179 ) ; final boolean X10_TEMP183 = X10_TEMP175 && X10_TEMP181 ; if ( X10_TEMP183 ) { int X10_TEMP185 = ( 1 ) ; int RX10_TEMP516 = j . f0 ; RX10_TEMP516 = RX10_TEMP516 + X10_TEMP185 ; final Point1 X10_TEMP187 = ( new Point1 ( RX10_TEMP516 ) ) ; int X10_TEMP189 = ( 1 ) ; int RX10_TEMP517 = j . f0 ; RX10_TEMP517 = RX10_TEMP517 + X10_TEMP189 ; final Point1 X10_TEMP191 = ( new Point1 ( RX10_TEMP517 ) ) ; final Dist1 RX10_TEMP518 = sumT . distValue ; final Region1 RX10_TEMP519 = RX10_TEMP518 . dReg ; final int RX10_TEMP520 = Program . searchPointInRegion1 ( RX10_TEMP519 , X10_TEMP191 ) ; final int RX10_TEMP521 = 0 ; final boolean RX10_TEMP522 = RX10_TEMP520 < RX10_TEMP521 ; if ( RX10_TEMP522 ) { String RX10_TEMP523 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP523 ) ; }
 final place RX10_TEMP524 = Program . getPlaceFromDist1 ( RX10_TEMP518 , RX10_TEMP520 ) ; final place RX10_TEMP526 = here ; final boolean RX10_TEMP527 = RX10_TEMP524 != RX10_TEMP526 ; if ( RX10_TEMP527 ) { String RX10_TEMP525 = "Bad place access for array sumT" ; throw new RuntimeException ( RX10_TEMP525 ) ; }
 final int RX10_TEMP528 = Program . getRefArrayValue1int ( sumT , RX10_TEMP520 ) ; final int X10_TEMP192 = ( RX10_TEMP528 ) ; final int X10_TEMP193 = ( 1 ) ; final int X10_TEMP195 = ( X10_TEMP192 + X10_TEMP193 ) ; final int X10_TEMP196 = ( X10_TEMP195 ) ; final Dist1 RX10_TEMP529 = sumT . distValue ; final Region1 RX10_TEMP530 = RX10_TEMP529 . dReg ; final int RX10_TEMP531 = Program . searchPointInRegion1 ( RX10_TEMP530 , X10_TEMP187 ) ; final int RX10_TEMP532 = 0 ; final boolean RX10_TEMP533 = RX10_TEMP531 < RX10_TEMP532 ; if ( RX10_TEMP533 ) { String RX10_TEMP534 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP534 ) ; }
 final place RX10_TEMP535 = Program . getPlaceFromDist1 ( RX10_TEMP529 , RX10_TEMP531 ) ; final place RX10_TEMP537 = here ; final boolean RX10_TEMP538 = RX10_TEMP535 != RX10_TEMP537 ; if ( RX10_TEMP538 ) { String RX10_TEMP536 = "Bad place access for array sumT" ; throw new RuntimeException ( RX10_TEMP536 ) ; }
 Program . setRefArrayValue1int ( sumT , RX10_TEMP531 , X10_TEMP196 ) ; }
 }
 }
 final int RX10_TEMP543 = 1 ; int RX10_TEMP541 = r_nthreads . regSize ; RX10_TEMP541 = RX10_TEMP541 - RX10_TEMP543 ; final region ( : rank==1 ) RX10_TEMP542 = [ 0 : RX10_TEMP541 ] ; for ( point ( : rank==1 ) RX10_TEMP539 : RX10_TEMP542 ) { final int RX10_TEMP544 = RX10_TEMP539 [0] ; final Point1 RX10_TEMP540 = Program . regionOrdinalPoint1 ( r_nthreads , RX10_TEMP544 ) ; final int j = RX10_TEMP540 . f0 ; final int X10_TEMP200 = ( 0 ) ; final Region1 X10_TEMP202 = Program . createNewRegion1R ( X10_TEMP200 , j ) ; final int RX10_TEMP549 = 1 ; int RX10_TEMP547 = X10_TEMP202 . regSize ; RX10_TEMP547 = RX10_TEMP547 - RX10_TEMP549 ; final region ( : rank==1 ) RX10_TEMP548 = [ 0 : RX10_TEMP547 ] ; for ( point ( : rank==1 ) RX10_TEMP545 : RX10_TEMP548 ) { final int RX10_TEMP550 = RX10_TEMP545 [0] ; final Point1 RX10_TEMP546 = Program . regionOrdinalPoint1 ( X10_TEMP202 , RX10_TEMP550 ) ; final int i = RX10_TEMP546 . f0 ; final Point1 RX10_TEMP551 = new Point1 ( j ) ; final Dist1 RX10_TEMP552 = lowsumin . distValue ; final Region1 RX10_TEMP553 = RX10_TEMP552 . dReg ; final int RX10_TEMP554 = Program . searchPointInRegion1 ( RX10_TEMP553 , RX10_TEMP551 ) ; final int RX10_TEMP555 = 0 ; final boolean RX10_TEMP556 = RX10_TEMP554 < RX10_TEMP555 ; if ( RX10_TEMP556 ) { String RX10_TEMP557 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP557 ) ; }
 final place RX10_TEMP558 = Program . getPlaceFromDist1 ( RX10_TEMP552 , RX10_TEMP554 ) ; final place RX10_TEMP560 = here ; final boolean RX10_TEMP561 = RX10_TEMP558 != RX10_TEMP560 ; if ( RX10_TEMP561 ) { String RX10_TEMP559 = "Bad place access for array lowsumin" ; throw new RuntimeException ( RX10_TEMP559 ) ; }
 final int RX10_TEMP562 = Program . getRefArrayValue1int ( lowsumin , RX10_TEMP554 ) ; final int X10_TEMP207 = ( RX10_TEMP562 ) ; final int X10_TEMP206 = ( j - i ) ; final Point1 RX10_TEMP563 = new Point1 ( X10_TEMP206 ) ; final Dist1 RX10_TEMP564 = sumT . distValue ; final Region1 RX10_TEMP565 = RX10_TEMP564 . dReg ; final int RX10_TEMP566 = Program . searchPointInRegion1 ( RX10_TEMP565 , RX10_TEMP563 ) ; final int RX10_TEMP567 = 0 ; final boolean RX10_TEMP568 = RX10_TEMP566 < RX10_TEMP567 ; if ( RX10_TEMP568 ) { String RX10_TEMP569 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP569 ) ; }
 final place RX10_TEMP570 = Program . getPlaceFromDist1 ( RX10_TEMP564 , RX10_TEMP566 ) ; final place RX10_TEMP572 = here ; final boolean RX10_TEMP573 = RX10_TEMP570 != RX10_TEMP572 ; if ( RX10_TEMP573 ) { String RX10_TEMP571 = "Bad place access for array sumT" ; throw new RuntimeException ( RX10_TEMP571 ) ; }
 final int RX10_TEMP574 = Program . getRefArrayValue1int ( sumT , RX10_TEMP566 ) ; final int X10_TEMP208 = ( RX10_TEMP574 ) ; final int X10_TEMP210 = ( X10_TEMP207 + X10_TEMP208 ) ; final int X10_TEMP211 = ( X10_TEMP210 ) ; final Point1 RX10_TEMP575 = new Point1 ( j ) ; final Dist1 RX10_TEMP576 = lowsumin . distValue ; final Region1 RX10_TEMP577 = RX10_TEMP576 . dReg ; final int RX10_TEMP578 = Program . searchPointInRegion1 ( RX10_TEMP577 , RX10_TEMP575 ) ; final int RX10_TEMP579 = 0 ; final boolean RX10_TEMP580 = RX10_TEMP578 < RX10_TEMP579 ; if ( RX10_TEMP580 ) { String RX10_TEMP581 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP581 ) ; }
 final place RX10_TEMP582 = Program . getPlaceFromDist1 ( RX10_TEMP576 , RX10_TEMP578 ) ; final place RX10_TEMP584 = here ; final boolean RX10_TEMP585 = RX10_TEMP582 != RX10_TEMP584 ; if ( RX10_TEMP585 ) { String RX10_TEMP583 = "Bad place access for array lowsumin" ; throw new RuntimeException ( RX10_TEMP583 ) ; }
 Program . setRefArrayValue1int ( lowsumin , RX10_TEMP578 , X10_TEMP211 ) ; final Point1 RX10_TEMP586 = new Point1 ( j ) ; final Dist1 RX10_TEMP587 = highsumin . distValue ; final Region1 RX10_TEMP588 = RX10_TEMP587 . dReg ; final int RX10_TEMP589 = Program . searchPointInRegion1 ( RX10_TEMP588 , RX10_TEMP586 ) ; final int RX10_TEMP590 = 0 ; final boolean RX10_TEMP591 = RX10_TEMP589 < RX10_TEMP590 ; if ( RX10_TEMP591 ) { String RX10_TEMP592 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP592 ) ; }
 final place RX10_TEMP593 = Program . getPlaceFromDist1 ( RX10_TEMP587 , RX10_TEMP589 ) ; final place RX10_TEMP595 = here ; final boolean RX10_TEMP596 = RX10_TEMP593 != RX10_TEMP595 ; if ( RX10_TEMP596 ) { String RX10_TEMP594 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP594 ) ; }
 final int RX10_TEMP597 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP589 ) ; final int X10_TEMP216 = ( RX10_TEMP597 ) ; final int X10_TEMP215 = ( j - i ) ; final Point1 RX10_TEMP598 = new Point1 ( X10_TEMP215 ) ; final Dist1 RX10_TEMP599 = sumT . distValue ; final Region1 RX10_TEMP600 = RX10_TEMP599 . dReg ; final int RX10_TEMP601 = Program . searchPointInRegion1 ( RX10_TEMP600 , RX10_TEMP598 ) ; final int RX10_TEMP602 = 0 ; final boolean RX10_TEMP603 = RX10_TEMP601 < RX10_TEMP602 ; if ( RX10_TEMP603 ) { String RX10_TEMP604 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP604 ) ; }
 final place RX10_TEMP605 = Program . getPlaceFromDist1 ( RX10_TEMP599 , RX10_TEMP601 ) ; final place RX10_TEMP607 = here ; final boolean RX10_TEMP608 = RX10_TEMP605 != RX10_TEMP607 ; if ( RX10_TEMP608 ) { String RX10_TEMP606 = "Bad place access for array sumT" ; throw new RuntimeException ( RX10_TEMP606 ) ; }
 final int RX10_TEMP609 = Program . getRefArrayValue1int ( sumT , RX10_TEMP601 ) ; final int X10_TEMP217 = ( RX10_TEMP609 ) ; final int X10_TEMP219 = ( X10_TEMP216 + X10_TEMP217 ) ; final int X10_TEMP220 = ( X10_TEMP219 ) ; final Point1 RX10_TEMP610 = new Point1 ( j ) ; final Dist1 RX10_TEMP611 = highsumin . distValue ; final Region1 RX10_TEMP612 = RX10_TEMP611 . dReg ; final int RX10_TEMP613 = Program . searchPointInRegion1 ( RX10_TEMP612 , RX10_TEMP610 ) ; final int RX10_TEMP614 = 0 ; final boolean RX10_TEMP615 = RX10_TEMP613 < RX10_TEMP614 ; if ( RX10_TEMP615 ) { String RX10_TEMP616 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP616 ) ; }
 final place RX10_TEMP617 = Program . getPlaceFromDist1 ( RX10_TEMP611 , RX10_TEMP613 ) ; final place RX10_TEMP619 = here ; final boolean RX10_TEMP620 = RX10_TEMP617 != RX10_TEMP619 ; if ( RX10_TEMP620 ) { String RX10_TEMP618 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP618 ) ; }
 Program . setRefArrayValue1int ( highsumin , RX10_TEMP613 , X10_TEMP220 ) ; }
 }
 final int RX10_TEMP624 = 1 ; int RX10_TEMP622 = r_nz . regSize ; RX10_TEMP622 = RX10_TEMP622 - RX10_TEMP624 ; final region ( : rank==1 ) RX10_TEMP623 = [ 0 : RX10_TEMP622 ] ; for ( point ( : rank==1 ) RX10_TEMP621 : RX10_TEMP623 ) { final int RX10_TEMP625 = RX10_TEMP621 [0] ; final Point1 i1 = Program . regionOrdinalPoint1 ( r_nz , RX10_TEMP625 ) ; final int RX10_TEMP629 = 1 ; int RX10_TEMP627 = r_nthreads . regSize ; RX10_TEMP627 = RX10_TEMP627 - RX10_TEMP629 ; final region ( : rank==1 ) RX10_TEMP628 = [ 0 : RX10_TEMP627 ] ; for ( point ( : rank==1 ) RX10_TEMP626 : RX10_TEMP628 ) { final int RX10_TEMP630 = RX10_TEMP626 [0] ; final Point1 j1 = Program . regionOrdinalPoint1 ( r_nthreads , RX10_TEMP630 ) ; final Dist1 RX10_TEMP631 = rowin . distValue ; final Region1 RX10_TEMP632 = RX10_TEMP631 . dReg ; final int RX10_TEMP633 = Program . searchPointInRegion1 ( RX10_TEMP632 , i1 ) ; final int RX10_TEMP634 = 0 ; final boolean RX10_TEMP635 = RX10_TEMP633 < RX10_TEMP634 ; if ( RX10_TEMP635 ) { String RX10_TEMP636 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP636 ) ; }
 final place RX10_TEMP637 = Program . getPlaceFromDist1 ( RX10_TEMP631 , RX10_TEMP633 ) ; final place RX10_TEMP639 = here ; final boolean RX10_TEMP640 = RX10_TEMP637 != RX10_TEMP639 ; if ( RX10_TEMP640 ) { String RX10_TEMP638 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP638 ) ; }
 final int RX10_TEMP641 = Program . getRefArrayValue1int ( rowin , RX10_TEMP633 ) ; final int X10_TEMP225 = ( RX10_TEMP641 ) ; final Dist1 RX10_TEMP642 = ilow . distValue ; final Region1 RX10_TEMP643 = RX10_TEMP642 . dReg ; final int RX10_TEMP644 = Program . searchPointInRegion1 ( RX10_TEMP643 , j1 ) ; final int RX10_TEMP645 = 0 ; final boolean RX10_TEMP646 = RX10_TEMP644 < RX10_TEMP645 ; if ( RX10_TEMP646 ) { String RX10_TEMP647 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP647 ) ; }
 final place RX10_TEMP648 = Program . getPlaceFromDist1 ( RX10_TEMP642 , RX10_TEMP644 ) ; final place RX10_TEMP650 = here ; final boolean RX10_TEMP651 = RX10_TEMP648 != RX10_TEMP650 ; if ( RX10_TEMP651 ) { String RX10_TEMP649 = "Bad place access for array ilow" ; throw new RuntimeException ( RX10_TEMP649 ) ; }
 final int RX10_TEMP652 = Program . getRefArrayValue1int ( ilow , RX10_TEMP644 ) ; final int X10_TEMP226 = ( RX10_TEMP652 ) ; final boolean X10_TEMP228 = ( X10_TEMP225 >= X10_TEMP226 ) ; final Dist1 RX10_TEMP653 = rowin . distValue ; final Region1 RX10_TEMP654 = RX10_TEMP653 . dReg ; final int RX10_TEMP655 = Program . searchPointInRegion1 ( RX10_TEMP654 , i1 ) ; final int RX10_TEMP656 = 0 ; final boolean RX10_TEMP657 = RX10_TEMP655 < RX10_TEMP656 ; if ( RX10_TEMP657 ) { String RX10_TEMP658 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP658 ) ; }
 final place RX10_TEMP659 = Program . getPlaceFromDist1 ( RX10_TEMP653 , RX10_TEMP655 ) ; final place RX10_TEMP661 = here ; final boolean RX10_TEMP662 = RX10_TEMP659 != RX10_TEMP661 ; if ( RX10_TEMP662 ) { String RX10_TEMP660 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP660 ) ; }
 final int RX10_TEMP663 = Program . getRefArrayValue1int ( rowin , RX10_TEMP655 ) ; final int X10_TEMP231 = ( RX10_TEMP663 ) ; final Dist1 RX10_TEMP664 = iup . distValue ; final Region1 RX10_TEMP665 = RX10_TEMP664 . dReg ; final int RX10_TEMP666 = Program . searchPointInRegion1 ( RX10_TEMP665 , j1 ) ; final int RX10_TEMP667 = 0 ; final boolean RX10_TEMP668 = RX10_TEMP666 < RX10_TEMP667 ; if ( RX10_TEMP668 ) { String RX10_TEMP669 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP669 ) ; }
 final place RX10_TEMP670 = Program . getPlaceFromDist1 ( RX10_TEMP664 , RX10_TEMP666 ) ; final place RX10_TEMP672 = here ; final boolean RX10_TEMP673 = RX10_TEMP670 != RX10_TEMP672 ; if ( RX10_TEMP673 ) { String RX10_TEMP671 = "Bad place access for array iup" ; throw new RuntimeException ( RX10_TEMP671 ) ; }
 final int RX10_TEMP674 = Program . getRefArrayValue1int ( iup , RX10_TEMP666 ) ; final int X10_TEMP232 = ( RX10_TEMP674 ) ; final boolean X10_TEMP234 = ( X10_TEMP231 <= X10_TEMP232 ) ; final boolean X10_TEMP236 = X10_TEMP228 && X10_TEMP234 ; if ( X10_TEMP236 ) { final Dist1 RX10_TEMP675 = highsumin . distValue ; final Region1 RX10_TEMP676 = RX10_TEMP675 . dReg ; final int RX10_TEMP677 = Program . searchPointInRegion1 ( RX10_TEMP676 , j1 ) ; final int RX10_TEMP678 = 0 ; final boolean RX10_TEMP679 = RX10_TEMP677 < RX10_TEMP678 ; if ( RX10_TEMP679 ) { String RX10_TEMP680 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP680 ) ; }
 final place RX10_TEMP681 = Program . getPlaceFromDist1 ( RX10_TEMP675 , RX10_TEMP677 ) ; final place RX10_TEMP683 = here ; final boolean RX10_TEMP684 = RX10_TEMP681 != RX10_TEMP683 ; if ( RX10_TEMP684 ) { String RX10_TEMP682 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP682 ) ; }
 final int RX10_TEMP685 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP677 ) ; final int X10_TEMP239 = ( RX10_TEMP685 ) ; final Dist1 RX10_TEMP686 = rowin . distValue ; final Region1 RX10_TEMP687 = RX10_TEMP686 . dReg ; final int RX10_TEMP688 = Program . searchPointInRegion1 ( RX10_TEMP687 , i1 ) ; final int RX10_TEMP689 = 0 ; final boolean RX10_TEMP690 = RX10_TEMP688 < RX10_TEMP689 ; if ( RX10_TEMP690 ) { String RX10_TEMP691 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP691 ) ; }
 final place RX10_TEMP692 = Program . getPlaceFromDist1 ( RX10_TEMP686 , RX10_TEMP688 ) ; final place RX10_TEMP694 = here ; final boolean RX10_TEMP695 = RX10_TEMP692 != RX10_TEMP694 ; if ( RX10_TEMP695 ) { String RX10_TEMP693 = "Bad place access for array rowin" ; throw new RuntimeException ( RX10_TEMP693 ) ; }
 final int RX10_TEMP696 = Program . getRefArrayValue1int ( rowin , RX10_TEMP688 ) ; final int X10_TEMP242 = ( RX10_TEMP696 ) ; final int X10_TEMP243 = ( X10_TEMP242 ) ; final Point1 RX10_TEMP697 = new Point1 ( X10_TEMP239 ) ; final Dist1 RX10_TEMP698 = rowt . distValue ; final Region1 RX10_TEMP699 = RX10_TEMP698 . dReg ; final int RX10_TEMP700 = Program . searchPointInRegion1 ( RX10_TEMP699 , RX10_TEMP697 ) ; final int RX10_TEMP701 = 0 ; final boolean RX10_TEMP702 = RX10_TEMP700 < RX10_TEMP701 ; if ( RX10_TEMP702 ) { String RX10_TEMP703 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP703 ) ; }
 final place RX10_TEMP704 = Program . getPlaceFromDist1 ( RX10_TEMP698 , RX10_TEMP700 ) ; final place RX10_TEMP706 = here ; final boolean RX10_TEMP707 = RX10_TEMP704 != RX10_TEMP706 ; if ( RX10_TEMP707 ) { String RX10_TEMP705 = "Bad place access for array rowt" ; throw new RuntimeException ( RX10_TEMP705 ) ; }
 Program . setRefArrayValue1int ( rowt , RX10_TEMP700 , X10_TEMP243 ) ; final Dist1 RX10_TEMP708 = highsumin . distValue ; final Region1 RX10_TEMP709 = RX10_TEMP708 . dReg ; final int RX10_TEMP710 = Program . searchPointInRegion1 ( RX10_TEMP709 , j1 ) ; final int RX10_TEMP711 = 0 ; final boolean RX10_TEMP712 = RX10_TEMP710 < RX10_TEMP711 ; if ( RX10_TEMP712 ) { String RX10_TEMP713 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP713 ) ; }
 final place RX10_TEMP714 = Program . getPlaceFromDist1 ( RX10_TEMP708 , RX10_TEMP710 ) ; final place RX10_TEMP716 = here ; final boolean RX10_TEMP717 = RX10_TEMP714 != RX10_TEMP716 ; if ( RX10_TEMP717 ) { String RX10_TEMP715 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP715 ) ; }
 final int RX10_TEMP718 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP710 ) ; final int X10_TEMP246 = ( RX10_TEMP718 ) ; final Dist1 RX10_TEMP719 = colin . distValue ; final Region1 RX10_TEMP720 = RX10_TEMP719 . dReg ; final int RX10_TEMP721 = Program . searchPointInRegion1 ( RX10_TEMP720 , i1 ) ; final int RX10_TEMP722 = 0 ; final boolean RX10_TEMP723 = RX10_TEMP721 < RX10_TEMP722 ; if ( RX10_TEMP723 ) { String RX10_TEMP724 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP724 ) ; }
 final place RX10_TEMP725 = Program . getPlaceFromDist1 ( RX10_TEMP719 , RX10_TEMP721 ) ; final place RX10_TEMP727 = here ; final boolean RX10_TEMP728 = RX10_TEMP725 != RX10_TEMP727 ; if ( RX10_TEMP728 ) { String RX10_TEMP726 = "Bad place access for array colin" ; throw new RuntimeException ( RX10_TEMP726 ) ; }
 final int RX10_TEMP729 = Program . getRefArrayValue1int ( colin , RX10_TEMP721 ) ; final int X10_TEMP249 = ( RX10_TEMP729 ) ; final int X10_TEMP250 = ( X10_TEMP249 ) ; final Point1 RX10_TEMP730 = new Point1 ( X10_TEMP246 ) ; final Dist1 RX10_TEMP731 = colt . distValue ; final Region1 RX10_TEMP732 = RX10_TEMP731 . dReg ; final int RX10_TEMP733 = Program . searchPointInRegion1 ( RX10_TEMP732 , RX10_TEMP730 ) ; final int RX10_TEMP734 = 0 ; final boolean RX10_TEMP735 = RX10_TEMP733 < RX10_TEMP734 ; if ( RX10_TEMP735 ) { String RX10_TEMP736 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP736 ) ; }
 final place RX10_TEMP737 = Program . getPlaceFromDist1 ( RX10_TEMP731 , RX10_TEMP733 ) ; final place RX10_TEMP739 = here ; final boolean RX10_TEMP740 = RX10_TEMP737 != RX10_TEMP739 ; if ( RX10_TEMP740 ) { String RX10_TEMP738 = "Bad place access for array colt" ; throw new RuntimeException ( RX10_TEMP738 ) ; }
 Program . setRefArrayValue1int ( colt , RX10_TEMP733 , X10_TEMP250 ) ; final Dist1 RX10_TEMP741 = highsumin . distValue ; final Region1 RX10_TEMP742 = RX10_TEMP741 . dReg ; final int RX10_TEMP743 = Program . searchPointInRegion1 ( RX10_TEMP742 , j1 ) ; final int RX10_TEMP744 = 0 ; final boolean RX10_TEMP745 = RX10_TEMP743 < RX10_TEMP744 ; if ( RX10_TEMP745 ) { String RX10_TEMP746 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP746 ) ; }
 final place RX10_TEMP747 = Program . getPlaceFromDist1 ( RX10_TEMP741 , RX10_TEMP743 ) ; final place RX10_TEMP749 = here ; final boolean RX10_TEMP750 = RX10_TEMP747 != RX10_TEMP749 ; if ( RX10_TEMP750 ) { String RX10_TEMP748 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP748 ) ; }
 final int RX10_TEMP751 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP743 ) ; final int X10_TEMP253 = ( RX10_TEMP751 ) ; final Dist1 RX10_TEMP752 = valin . distValue ; final Region1 RX10_TEMP753 = RX10_TEMP752 . dReg ; final int RX10_TEMP754 = Program . searchPointInRegion1 ( RX10_TEMP753 , i1 ) ; final int RX10_TEMP755 = 0 ; final boolean RX10_TEMP756 = RX10_TEMP754 < RX10_TEMP755 ; if ( RX10_TEMP756 ) { String RX10_TEMP757 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP757 ) ; }
 final place RX10_TEMP758 = Program . getPlaceFromDist1 ( RX10_TEMP752 , RX10_TEMP754 ) ; final place RX10_TEMP760 = here ; final boolean RX10_TEMP761 = RX10_TEMP758 != RX10_TEMP760 ; if ( RX10_TEMP761 ) { String RX10_TEMP759 = "Bad place access for array valin" ; throw new RuntimeException ( RX10_TEMP759 ) ; }
 final double RX10_TEMP762 = Program . getRefArrayValue1double ( valin , RX10_TEMP754 ) ; final double X10_TEMP256 = ( RX10_TEMP762 ) ; final double X10_TEMP257 = ( X10_TEMP256 ) ; final Point1 RX10_TEMP763 = new Point1 ( X10_TEMP253 ) ; final Dist1 RX10_TEMP764 = valt . distValue ; final Region1 RX10_TEMP765 = RX10_TEMP764 . dReg ; final int RX10_TEMP766 = Program . searchPointInRegion1 ( RX10_TEMP765 , RX10_TEMP763 ) ; final int RX10_TEMP767 = 0 ; final boolean RX10_TEMP768 = RX10_TEMP766 < RX10_TEMP767 ; if ( RX10_TEMP768 ) { String RX10_TEMP769 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP769 ) ; }
 final place RX10_TEMP770 = Program . getPlaceFromDist1 ( RX10_TEMP764 , RX10_TEMP766 ) ; final place RX10_TEMP772 = here ; final boolean RX10_TEMP773 = RX10_TEMP770 != RX10_TEMP772 ; if ( RX10_TEMP773 ) { String RX10_TEMP771 = "Bad place access for array valt" ; throw new RuntimeException ( RX10_TEMP771 ) ; }
 Program . setRefArrayValue1double ( valt , RX10_TEMP766 , X10_TEMP257 ) ; final Dist1 RX10_TEMP774 = highsumin . distValue ; final Region1 RX10_TEMP775 = RX10_TEMP774 . dReg ; final int RX10_TEMP776 = Program . searchPointInRegion1 ( RX10_TEMP775 , j1 ) ; final int RX10_TEMP777 = 0 ; final boolean RX10_TEMP778 = RX10_TEMP776 < RX10_TEMP777 ; if ( RX10_TEMP778 ) { String RX10_TEMP779 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP779 ) ; }
 final place RX10_TEMP780 = Program . getPlaceFromDist1 ( RX10_TEMP774 , RX10_TEMP776 ) ; final place RX10_TEMP782 = here ; final boolean RX10_TEMP783 = RX10_TEMP780 != RX10_TEMP782 ; if ( RX10_TEMP783 ) { String RX10_TEMP781 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP781 ) ; }
 final int RX10_TEMP784 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP776 ) ; final int X10_TEMP260 = ( RX10_TEMP784 ) ; final int X10_TEMP261 = ( 1 ) ; final int X10_TEMP263 = ( X10_TEMP260 + X10_TEMP261 ) ; final int X10_TEMP264 = ( X10_TEMP263 ) ; final Dist1 RX10_TEMP785 = highsumin . distValue ; final Region1 RX10_TEMP786 = RX10_TEMP785 . dReg ; final int RX10_TEMP787 = Program . searchPointInRegion1 ( RX10_TEMP786 , j1 ) ; final int RX10_TEMP788 = 0 ; final boolean RX10_TEMP789 = RX10_TEMP787 < RX10_TEMP788 ; if ( RX10_TEMP789 ) { String RX10_TEMP790 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP790 ) ; }
 final place RX10_TEMP791 = Program . getPlaceFromDist1 ( RX10_TEMP785 , RX10_TEMP787 ) ; final place RX10_TEMP793 = here ; final boolean RX10_TEMP794 = RX10_TEMP791 != RX10_TEMP793 ; if ( RX10_TEMP794 ) { String RX10_TEMP792 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP792 ) ; }
 Program . setRefArrayValue1int ( highsumin , RX10_TEMP787 , X10_TEMP264 ) ; }
 }
 }
 final int X10_TEMP271 = ( 0 ) ; final Dist1 RX10_TEMP795 = rowt . distValue ; final Dist1 X10_TEMP266 = RX10_TEMP795 ; final Region1 RX10_TEMP796 = X10_TEMP266 . dReg ; final Region1 X10_TEMP267 = RX10_TEMP796 ; final int X10_TEMP268 = ( X10_TEMP267 . regSize ) ; final int X10_TEMP269 = ( 1 ) ; final int X10_TEMP272 = ( X10_TEMP268 - X10_TEMP269 ) ; final Region1 rowtregion = Program . createNewRegion1R ( X10_TEMP271 , X10_TEMP272 ) ; final place X10_TEMP274 = ( here ) ; final Dist1 rowtdist = Program . getPlaceDist1 ( rowtregion , X10_TEMP274 ) ; final Region1 RX10_TEMP797 = rowtregion ; final int RX10_TEMP812 = rowtregion . regSize ; final int RX10_TEMP813 = 1 ; final int RX10_TEMP814 = RX10_TEMP812 - RX10_TEMP813 ; final region ( : rank==1 ) RX10_TEMP811 = [ 0 : RX10_TEMP814 ] ; final int value [ : rank==1 ] RX10_TEMP815 = ( int value [ : rank==1 ] ) ( new int value [ RX10_TEMP811 ] ( point ( : rank==1 ) RX10_TEMP798 ) { final int RX10_TEMP799 = RX10_TEMP798 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP797 , RX10_TEMP799 ) ; final Dist1 RX10_TEMP800 = rowt . distValue ; final Region1 RX10_TEMP801 = RX10_TEMP800 . dReg ; final int RX10_TEMP802 = Program . searchPointInRegion1 ( RX10_TEMP801 , i ) ; final int RX10_TEMP803 = 0 ; final boolean RX10_TEMP804 = RX10_TEMP802 < RX10_TEMP803 ; if ( RX10_TEMP804 ) { String RX10_TEMP805 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP805 ) ; }
 final place RX10_TEMP806 = Program . getPlaceFromDist1 ( RX10_TEMP800 , RX10_TEMP802 ) ; final place RX10_TEMP808 = here ; final boolean RX10_TEMP809 = RX10_TEMP806 != RX10_TEMP808 ; if ( RX10_TEMP809 ) { String RX10_TEMP807 = "Bad place access for array rowt" ; throw new RuntimeException ( RX10_TEMP807 ) ; }
 final int RX10_TEMP810 = Program . getRefArrayValue1int ( rowt , RX10_TEMP802 ) ; final int X10_TEMP278 = ( RX10_TEMP810 ) ; return X10_TEMP278 ; }
 ) ; final intValArray1 RX10_TEMP816 = new intValArray1 ( rowtregion , RX10_TEMP815 ) ; final intValArray1 X10_TEMP279 = RX10_TEMP816 ; final intValArray1 X10_TEMP281 = X10_TEMP279 ; X10_TEMP0 . row = ( X10_TEMP281 ) ; final int X10_TEMP288 = ( 0 ) ; final Dist1 RX10_TEMP817 = colt . distValue ; final Dist1 X10_TEMP283 = RX10_TEMP817 ; final Region1 RX10_TEMP818 = X10_TEMP283 . dReg ; final Region1 X10_TEMP284 = RX10_TEMP818 ; final int X10_TEMP285 = ( X10_TEMP284 . regSize ) ; final int X10_TEMP286 = ( 1 ) ; final int X10_TEMP289 = ( X10_TEMP285 - X10_TEMP286 ) ; final Region1 coltregion = Program . createNewRegion1R ( X10_TEMP288 , X10_TEMP289 ) ; final place X10_TEMP291 = ( here ) ; final Dist1 coltdist = Program . getPlaceDist1 ( coltregion , X10_TEMP291 ) ; final Region1 RX10_TEMP819 = coltregion ; final int RX10_TEMP834 = coltregion . regSize ; final int RX10_TEMP835 = 1 ; final int RX10_TEMP836 = RX10_TEMP834 - RX10_TEMP835 ; final region ( : rank==1 ) RX10_TEMP833 = [ 0 : RX10_TEMP836 ] ; final int value [ : rank==1 ] RX10_TEMP837 = ( int value [ : rank==1 ] ) ( new int value [ RX10_TEMP833 ] ( point ( : rank==1 ) RX10_TEMP820 ) { final int RX10_TEMP821 = RX10_TEMP820 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP819 , RX10_TEMP821 ) ; final Dist1 RX10_TEMP822 = colt . distValue ; final Region1 RX10_TEMP823 = RX10_TEMP822 . dReg ; final int RX10_TEMP824 = Program . searchPointInRegion1 ( RX10_TEMP823 , i ) ; final int RX10_TEMP825 = 0 ; final boolean RX10_TEMP826 = RX10_TEMP824 < RX10_TEMP825 ; if ( RX10_TEMP826 ) { String RX10_TEMP827 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP827 ) ; }
 final place RX10_TEMP828 = Program . getPlaceFromDist1 ( RX10_TEMP822 , RX10_TEMP824 ) ; final place RX10_TEMP830 = here ; final boolean RX10_TEMP831 = RX10_TEMP828 != RX10_TEMP830 ; if ( RX10_TEMP831 ) { String RX10_TEMP829 = "Bad place access for array colt" ; throw new RuntimeException ( RX10_TEMP829 ) ; }
 final int RX10_TEMP832 = Program . getRefArrayValue1int ( colt , RX10_TEMP824 ) ; final int X10_TEMP295 = ( RX10_TEMP832 ) ; return X10_TEMP295 ; }
 ) ; final intValArray1 RX10_TEMP838 = new intValArray1 ( coltregion , RX10_TEMP837 ) ; final intValArray1 X10_TEMP296 = RX10_TEMP838 ; final intValArray1 X10_TEMP298 = X10_TEMP296 ; X10_TEMP0 . col = ( X10_TEMP298 ) ; final int X10_TEMP305 = ( 0 ) ; final Dist1 RX10_TEMP839 = valt . distValue ; final Dist1 X10_TEMP300 = RX10_TEMP839 ; final Region1 RX10_TEMP840 = X10_TEMP300 . dReg ; final Region1 X10_TEMP301 = RX10_TEMP840 ; final int X10_TEMP302 = ( X10_TEMP301 . regSize ) ; final int X10_TEMP303 = ( 1 ) ; final int X10_TEMP306 = ( X10_TEMP302 - X10_TEMP303 ) ; final Region1 valtregion = Program . createNewRegion1R ( X10_TEMP305 , X10_TEMP306 ) ; final place X10_TEMP308 = ( here ) ; final Dist1 valtdist = Program . getPlaceDist1 ( valtregion , X10_TEMP308 ) ; final Region1 RX10_TEMP841 = valtregion ; final int RX10_TEMP856 = valtregion . regSize ; final int RX10_TEMP857 = 1 ; final int RX10_TEMP858 = RX10_TEMP856 - RX10_TEMP857 ; final region ( : rank==1 ) RX10_TEMP855 = [ 0 : RX10_TEMP858 ] ; final double value [ : rank==1 ] RX10_TEMP859 = ( double value [ : rank==1 ] ) ( new double value [ RX10_TEMP855 ] ( point ( : rank==1 ) RX10_TEMP842 ) { final int RX10_TEMP843 = RX10_TEMP842 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP841 , RX10_TEMP843 ) ; final Dist1 RX10_TEMP844 = valt . distValue ; final Region1 RX10_TEMP845 = RX10_TEMP844 . dReg ; final int RX10_TEMP846 = Program . searchPointInRegion1 ( RX10_TEMP845 , i ) ; final int RX10_TEMP847 = 0 ; final boolean RX10_TEMP848 = RX10_TEMP846 < RX10_TEMP847 ; if ( RX10_TEMP848 ) { String RX10_TEMP849 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP849 ) ; }
 final place RX10_TEMP850 = Program . getPlaceFromDist1 ( RX10_TEMP844 , RX10_TEMP846 ) ; final place RX10_TEMP852 = here ; final boolean RX10_TEMP853 = RX10_TEMP850 != RX10_TEMP852 ; if ( RX10_TEMP853 ) { String RX10_TEMP851 = "Bad place access for array valt" ; throw new RuntimeException ( RX10_TEMP851 ) ; }
 final double RX10_TEMP854 = Program . getRefArrayValue1double ( valt , RX10_TEMP846 ) ; final double X10_TEMP312 = ( RX10_TEMP854 ) ; return X10_TEMP312 ; }
 ) ; final doubleValArray1 RX10_TEMP860 = new doubleValArray1 ( valtregion , RX10_TEMP859 ) ; final doubleValArray1 X10_TEMP313 = RX10_TEMP860 ; final doubleValArray1 X10_TEMP315 = X10_TEMP313 ; X10_TEMP0 . val = ( X10_TEMP315 ) ; final int X10_TEMP322 = ( 0 ) ; final Dist1 RX10_TEMP861 = lowsumin . distValue ; final Dist1 X10_TEMP317 = RX10_TEMP861 ; final Region1 RX10_TEMP862 = X10_TEMP317 . dReg ; final Region1 X10_TEMP318 = RX10_TEMP862 ; final int X10_TEMP319 = ( X10_TEMP318 . regSize ) ; final int X10_TEMP320 = ( 1 ) ; final int X10_TEMP323 = ( X10_TEMP319 - X10_TEMP320 ) ; final Region1 lowsuminregion = Program . createNewRegion1R ( X10_TEMP322 , X10_TEMP323 ) ; final place X10_TEMP325 = ( here ) ; final Dist1 lowsumindist = Program . getPlaceDist1 ( lowsuminregion , X10_TEMP325 ) ; final Region1 RX10_TEMP863 = lowsuminregion ; final int RX10_TEMP878 = lowsuminregion . regSize ; final int RX10_TEMP879 = 1 ; final int RX10_TEMP880 = RX10_TEMP878 - RX10_TEMP879 ; final region ( : rank==1 ) RX10_TEMP877 = [ 0 : RX10_TEMP880 ] ; final int value [ : rank==1 ] RX10_TEMP881 = ( int value [ : rank==1 ] ) ( new int value [ RX10_TEMP877 ] ( point ( : rank==1 ) RX10_TEMP864 ) { final int RX10_TEMP865 = RX10_TEMP864 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP863 , RX10_TEMP865 ) ; final Dist1 RX10_TEMP866 = lowsumin . distValue ; final Region1 RX10_TEMP867 = RX10_TEMP866 . dReg ; final int RX10_TEMP868 = Program . searchPointInRegion1 ( RX10_TEMP867 , i ) ; final int RX10_TEMP869 = 0 ; final boolean RX10_TEMP870 = RX10_TEMP868 < RX10_TEMP869 ; if ( RX10_TEMP870 ) { String RX10_TEMP871 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP871 ) ; }
 final place RX10_TEMP872 = Program . getPlaceFromDist1 ( RX10_TEMP866 , RX10_TEMP868 ) ; final place RX10_TEMP874 = here ; final boolean RX10_TEMP875 = RX10_TEMP872 != RX10_TEMP874 ; if ( RX10_TEMP875 ) { String RX10_TEMP873 = "Bad place access for array lowsumin" ; throw new RuntimeException ( RX10_TEMP873 ) ; }
 final int RX10_TEMP876 = Program . getRefArrayValue1int ( lowsumin , RX10_TEMP868 ) ; final int X10_TEMP329 = ( RX10_TEMP876 ) ; return X10_TEMP329 ; }
 ) ; final intValArray1 RX10_TEMP882 = new intValArray1 ( lowsuminregion , RX10_TEMP881 ) ; final intValArray1 X10_TEMP330 = RX10_TEMP882 ; final intValArray1 X10_TEMP332 = X10_TEMP330 ; X10_TEMP0 . lowsum = ( X10_TEMP332 ) ; final int X10_TEMP339 = ( 0 ) ; final Dist1 RX10_TEMP883 = highsumin . distValue ; final Dist1 X10_TEMP334 = RX10_TEMP883 ; final Region1 RX10_TEMP884 = X10_TEMP334 . dReg ; final Region1 X10_TEMP335 = RX10_TEMP884 ; final int X10_TEMP336 = ( X10_TEMP335 . regSize ) ; final int X10_TEMP337 = ( 1 ) ; final int X10_TEMP340 = ( X10_TEMP336 - X10_TEMP337 ) ; final Region1 highsuminregion = Program . createNewRegion1R ( X10_TEMP339 , X10_TEMP340 ) ; final place X10_TEMP342 = ( here ) ; final Dist1 highsumindist = Program . getPlaceDist1 ( highsuminregion , X10_TEMP342 ) ; final Region1 RX10_TEMP885 = highsuminregion ; final int RX10_TEMP900 = highsuminregion . regSize ; final int RX10_TEMP901 = 1 ; final int RX10_TEMP902 = RX10_TEMP900 - RX10_TEMP901 ; final region ( : rank==1 ) RX10_TEMP899 = [ 0 : RX10_TEMP902 ] ; final int value [ : rank==1 ] RX10_TEMP903 = ( int value [ : rank==1 ] ) ( new int value [ RX10_TEMP899 ] ( point ( : rank==1 ) RX10_TEMP886 ) { final int RX10_TEMP887 = RX10_TEMP886 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP885 , RX10_TEMP887 ) ; final Dist1 RX10_TEMP888 = highsumin . distValue ; final Region1 RX10_TEMP889 = RX10_TEMP888 . dReg ; final int RX10_TEMP890 = Program . searchPointInRegion1 ( RX10_TEMP889 , i ) ; final int RX10_TEMP891 = 0 ; final boolean RX10_TEMP892 = RX10_TEMP890 < RX10_TEMP891 ; if ( RX10_TEMP892 ) { String RX10_TEMP893 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP893 ) ; }
 final place RX10_TEMP894 = Program . getPlaceFromDist1 ( RX10_TEMP888 , RX10_TEMP890 ) ; final place RX10_TEMP896 = here ; final boolean RX10_TEMP897 = RX10_TEMP894 != RX10_TEMP896 ; if ( RX10_TEMP897 ) { String RX10_TEMP895 = "Bad place access for array highsumin" ; throw new RuntimeException ( RX10_TEMP895 ) ; }
 final int RX10_TEMP898 = Program . getRefArrayValue1int ( highsumin , RX10_TEMP890 ) ; final int X10_TEMP346 = ( RX10_TEMP898 ) ; return X10_TEMP346 ; }
 ) ; final intValArray1 RX10_TEMP904 = new intValArray1 ( highsuminregion , RX10_TEMP903 ) ; final intValArray1 X10_TEMP347 = RX10_TEMP904 ; final intValArray1 X10_TEMP349 = X10_TEMP347 ; X10_TEMP0 . highsum = ( X10_TEMP349 ) ; }
 public static void SparseMatmult_JGFkernel ( final SparseMatmult X10_TEMP0 ) { final doubleRefArray1 X10_TEMP9 = X10_TEMP0 . y ; final doubleValArray1 X10_TEMP10 = X10_TEMP0 . val ; final intValArray1 X10_TEMP11 = X10_TEMP0 . row ; final intValArray1 X10_TEMP12 = X10_TEMP0 . col ; final doubleValArray1 X10_TEMP13 = X10_TEMP0 . x ; final intValArray1 X10_TEMP14 = X10_TEMP0 . lowsum ; final intValArray1 X10_TEMP15 = X10_TEMP0 . highsum ; Program . SparseMatmult_test ( X10_TEMP0 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , _SparseMatmult_SPARSE_NUM_ITER , X10_TEMP14 , X10_TEMP15 ) ; }
 public static void SparseMatmult_initRefVal ( final SparseMatmult X10_TEMP0 , final doubleRefArray1 refval ) { final int X10_TEMP2 = ( 0 ) ; final double X10_TEMP4 = ( 0.1436496372119012 ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP2 ) ; final Dist1 RX10_TEMP1 = refval . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( refval , RX10_TEMP3 , X10_TEMP5 ) ; final int X10_TEMP7 = ( 1 ) ; final double X10_TEMP9 = ( 150.0130719633895 ) ; final double X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( X10_TEMP7 ) ; final Dist1 RX10_TEMP12 = refval . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1double ( refval , RX10_TEMP14 , X10_TEMP10 ) ; final int X10_TEMP12 = ( 2 ) ; final double X10_TEMP14 = ( 749.5245870753752 ) ; final double X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( X10_TEMP12 ) ; final Dist1 RX10_TEMP23 = refval . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1double ( refval , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static void SparseMatmult_JGFvalidate ( final SparseMatmult X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 2 ) ; Region1 rtemp = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; Dist1 dtemp = Program . getPlaceDist1 ( rtemp , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = dtemp . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dtemp , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T17 utmp17 = new T17(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread17(utmp17); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1 ( dtemp , RX10_TEMP16 ) ; doubleRefArray1 refval = RX10_TEMP19 ; Program . SparseMatmult_initRefVal ( X10_TEMP0 , refval ) ; final double X10_TEMP12 = ( X10_TEMP0 . ytotal ) ; final int X10_TEMP11 = ( X10_TEMP0 . setSize ) ; final Point1 RX10_TEMP20 = new Point1 ( X10_TEMP11 ) ; final Dist1 RX10_TEMP21 = refval . distValue ; final Region1 RX10_TEMP22 = RX10_TEMP21 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { String RX10_TEMP26 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; final place RX10_TEMP29 = here ; final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; if ( RX10_TEMP30 ) { String RX10_TEMP28 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final double RX10_TEMP31 = Program . getRefArrayValue1double ( refval , RX10_TEMP23 ) ; final double X10_TEMP13 = ( RX10_TEMP31 ) ; final double X10_TEMP15 = ( X10_TEMP12 - X10_TEMP13 ) ; double dev = ( Math . abs ( X10_TEMP15 ) ) ; final double X10_TEMP17 = ( 1.0e-10 ) ; final boolean X10_TEMP19 = dev > X10_TEMP17 ; if ( X10_TEMP19 ) { final String X10_TEMP21 = ( "Validation failed" ) ; System.out.println ( X10_TEMP21 ) ; final String X10_TEMP22 = ( "ytotal = " ) ; final double X10_TEMP23 = ( X10_TEMP0 . ytotal ) ; final String X10_TEMP24 = ( X10_TEMP22 + X10_TEMP23 ) ; final String X10_TEMP25 = ( "  " ) ; final String X10_TEMP26 = ( X10_TEMP24 + X10_TEMP25 ) ; final String X10_TEMP27 = ( X10_TEMP26 + dev ) ; final String X10_TEMP28 = ( "  " ) ; final String X10_TEMP29 = ( X10_TEMP27 + X10_TEMP28 ) ; final int X10_TEMP30 = ( X10_TEMP0 . setSize ) ; final String X10_TEMP32 = ( X10_TEMP29 + X10_TEMP30 ) ; System.out.println ( X10_TEMP32 ) ; final String X10_TEMP34 = ( "Validation failed" ) ; throw new RuntimeException ( X10_TEMP34 ) ; }
 }
 public static void SparseMatmult_JGFtidyup ( final SparseMatmult X10_TEMP0 ) { }
 public static void SparseMatmult_run ( final SparseMatmult X10_TEMP0 , final int setSize ) { Program . SparseMatmult_JGFsetsize ( X10_TEMP0 , setSize ) ; Program . SparseMatmult_JGFinitialise ( X10_TEMP0 ) ; Program . SparseMatmult_JGFkernel ( X10_TEMP0 ) ; Program . SparseMatmult_JGFvalidate ( X10_TEMP0 ) ; Program . SparseMatmult_JGFtidyup ( X10_TEMP0 ) ; }
 public static doubleRefArray1 SparseMatmult_init ( final doubleRefArray1 a , final Random R ) { final int X10_TEMP7 = ( 0 ) ; final Dist1 RX10_TEMP0 = a . distValue ; final Dist1 X10_TEMP2 = RX10_TEMP0 ; final Region1 RX10_TEMP1 = X10_TEMP2 . dReg ; final Region1 X10_TEMP3 = RX10_TEMP1 ; final int X10_TEMP4 = ( X10_TEMP3 . regSize ) ; final int X10_TEMP5 = ( 1 ) ; final int X10_TEMP8 = ( X10_TEMP4 - X10_TEMP5 ) ; final Region1 areg = Program . createNewRegion1R ( X10_TEMP7 , X10_TEMP8 ) ; final place X10_TEMP10 = ( here ) ; final Dist1 adist = Program . getPlaceDist1 ( areg , X10_TEMP10 ) ; final int RX10_TEMP5 = 1 ; int RX10_TEMP3 = areg . regSize ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; for ( point ( : rank==1 ) RX10_TEMP2 : RX10_TEMP4 ) { final int RX10_TEMP6 = RX10_TEMP2 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( areg , RX10_TEMP6 ) ; final double X10_TEMP14 = ( Program . Random_nextDouble ( R ) ) ; final double X10_TEMP15 = ( 1e-6 ) ; final double X10_TEMP17 = ( X10_TEMP14 * X10_TEMP15 ) ; final double X10_TEMP18 = ( X10_TEMP17 ) ; final Dist1 RX10_TEMP7 = a . distValue ; final Region1 RX10_TEMP8 = RX10_TEMP7 . dReg ; final int RX10_TEMP9 = Program . searchPointInRegion1 ( RX10_TEMP8 , i ) ; final int RX10_TEMP10 = 0 ; final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; if ( RX10_TEMP11 ) { String RX10_TEMP12 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP12 ) ; }
 final place RX10_TEMP13 = Program . getPlaceFromDist1 ( RX10_TEMP7 , RX10_TEMP9 ) ; final place RX10_TEMP15 = here ; final boolean RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP14 = "Bad place access for array a" ; throw new RuntimeException ( RX10_TEMP14 ) ; }
 Program . setRefArrayValue1double ( a , RX10_TEMP9 , X10_TEMP18 ) ; }
 return a ; }
 public static void SparseMatmult_test ( final SparseMatmult X10_TEMP0 , final doubleRefArray1 y , final doubleValArray1 val , final intValArray1 row , final intValArray1 col , final doubleValArray1 x , final int NUM_ITERATIONS , final intValArray1 lowsum , final intValArray1 highsum ) { final Region1 RX10_TEMP0 = val . regionValue ; final Region1 X10_TEMP1 = RX10_TEMP0 ; final int nz = ( X10_TEMP1 . regSize ) ; final Dist1 X10_TEMP3 = Program . getUniqueDist ( ) ; final Dist1 dDistU = X10_TEMP3 ; final double X10_TEMP6 = ( 0.0 ) ; final double X10_TEMP7 = ( X10_TEMP6 ) ; X10_TEMP0 . ytotal = ( X10_TEMP7 ) ; finish { final place X10_TEMP9 = here ; final Region1 RX10_TEMP2 = dDistU . dReg ; final int RX10_TEMP5 = 1 ; int RX10_TEMP3 = RX10_TEMP2 . regSize ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; for ( point ( : rank==1 ) RX10_TEMP1 : RX10_TEMP4 ) { final int RX10_TEMP6 = RX10_TEMP1 [0] ; final Point1 id1 = Program . regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
 final T18 utmp18 = new T18(id1, highsum, lowsum, NUM_ITERATIONS, x, col, row, val, y);
 async (X10_TEMP9) {Program.thread18(utmp18); }
 }
 }
 final place curr_place = ( here ) ; final int X10_TEMP53 = ( 0 ) ; final int X10_TEMP54 = ( 0 ) ; final Region1 tempr = Program . createNewRegion1R ( X10_TEMP53 , X10_TEMP54 ) ; final place X10_TEMP56 = ( here ) ; final Dist1 tempvd = Program . getPlaceDist1 ( tempr , X10_TEMP56 ) ; final Region1 RX10_TEMP97 = tempvd . dReg ; final int RX10_TEMP98 = 0 ; final int RX10_TEMP99 = 1 ; int RX10_TEMP100 = place.MAX_PLACES ; RX10_TEMP100 = RX10_TEMP100 - RX10_TEMP99 ; final region ( : rank==1 ) RX10_TEMP101 = [ 0 : RX10_TEMP100 ] ; final dist ( : rank==1 ) RX10_TEMP102 = [ 0 : RX10_TEMP100 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP103 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP102 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP104 : RX10_TEMP101 ) { final place RX10_TEMP105 = here ; final int RX10_TEMP106 = RX10_TEMP104 [0] ; final place RX10_TEMP107 = place.places ( RX10_TEMP106 ) ; final int RX10_TEMP108 = Program . getDistLocalCount1 ( tempvd , RX10_TEMP106 ) ; final int RX10_TEMP109 = RX10_TEMP108 - RX10_TEMP99 ; 
 final T19 utmp19 = new T19(RX10_TEMP109, RX10_TEMP105, RX10_TEMP104, RX10_TEMP103);
 async (RX10_TEMP107) {Program.thread19(utmp19); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP114 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP101 ] ( point ( : rank==1 ) RX10_TEMP116 ) { final doubleStub RX10_TEMP115 = RX10_TEMP103 [ RX10_TEMP116 ] ; return RX10_TEMP115 ; }
 ) ; final doubleRefArray1 RX10_TEMP117 = new doubleRefArray1 ( tempvd , RX10_TEMP114 ) ; final doubleRefArray1 tempref = RX10_TEMP117 ; final int X10_TEMP64 = ( 0 ) ; final int X10_TEMP62 = ( 1 ) ; final int X10_TEMP65 = ( nz - X10_TEMP62 ) ; final Region1 X10_TEMP67 = Program . createNewRegion1R ( X10_TEMP64 , X10_TEMP65 ) ; final int RX10_TEMP121 = 1 ; int RX10_TEMP119 = X10_TEMP67 . regSize ; RX10_TEMP119 = RX10_TEMP119 - RX10_TEMP121 ; final region ( : rank==1 ) RX10_TEMP120 = [ 0 : RX10_TEMP119 ] ; for ( point ( : rank==1 ) RX10_TEMP118 : RX10_TEMP120 ) { final int RX10_TEMP122 = RX10_TEMP118 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( X10_TEMP67 , RX10_TEMP122 ) ; finish { final Dist1 RX10_TEMP123 = y . distValue ; final Dist1 X10_TEMP68 = RX10_TEMP123 ; final Region1 RX10_TEMP124 = row . regionValue ; final int RX10_TEMP125 = Program . searchPointInRegion1 ( RX10_TEMP124 , i ) ; final int RX10_TEMP126 = 0 ; final boolean RX10_TEMP127 = RX10_TEMP125 < RX10_TEMP126 ; if ( RX10_TEMP127 ) { String RX10_TEMP128 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP128 ) ; }
 final int value [ : rank==1 ] RX10_TEMP129 = ( int value [ : rank==1 ] ) ( row . contents ) ; int X10_TEMP71 = ( RX10_TEMP129 [ RX10_TEMP125 ] ) ; final Point1 RX10_TEMP130 = new Point1 ( X10_TEMP71 ) ; final Region1 RX10_TEMP131 = X10_TEMP68 . dReg ; final int RX10_TEMP132 = Program . searchPointInRegion1 ( RX10_TEMP131 , RX10_TEMP130 ) ; final int RX10_TEMP133 = 0 ; final boolean RX10_TEMP134 = RX10_TEMP132 < RX10_TEMP133 ; if ( RX10_TEMP134 ) { final String RX10_TEMP135 = "Point RX10_TEMP130 not found in the distribution X10_TEMP68." ; throw new RuntimeException ( RX10_TEMP135 ) ; }
 final place RX10_TEMP136 = Program . getPlaceFromDist1 ( X10_TEMP68 , RX10_TEMP132 ) ; final place X10_TEMP73 = RX10_TEMP136 ; 
 final T20 utmp20 = new T20(i, tempref, curr_place, row, y);
 async (X10_TEMP73) {Program.thread20(utmp20); }
 }
 final double X10_TEMP85 = ( X10_TEMP0 . ytotal ) ; final int X10_TEMP84 = ( 0 ) ; final Point1 RX10_TEMP166 = new Point1 ( X10_TEMP84 ) ; final Dist1 RX10_TEMP167 = tempref . distValue ; final Region1 RX10_TEMP168 = RX10_TEMP167 . dReg ; final int RX10_TEMP169 = Program . searchPointInRegion1 ( RX10_TEMP168 , RX10_TEMP166 ) ; final int RX10_TEMP170 = 0 ; final boolean RX10_TEMP171 = RX10_TEMP169 < RX10_TEMP170 ; if ( RX10_TEMP171 ) { String RX10_TEMP172 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP172 ) ; }
 final place RX10_TEMP173 = Program . getPlaceFromDist1 ( RX10_TEMP167 , RX10_TEMP169 ) ; final place RX10_TEMP175 = here ; final boolean RX10_TEMP176 = RX10_TEMP173 != RX10_TEMP175 ; if ( RX10_TEMP176 ) { String RX10_TEMP174 = "Bad place access for array tempref" ; throw new RuntimeException ( RX10_TEMP174 ) ; }
 final double RX10_TEMP177 = Program . getRefArrayValue1double ( tempref , RX10_TEMP169 ) ; final double X10_TEMP86 = ( RX10_TEMP177 ) ; final double X10_TEMP88 = ( X10_TEMP85 + X10_TEMP86 ) ; final double X10_TEMP89 = ( X10_TEMP88 ) ; X10_TEMP0 . ytotal = ( X10_TEMP89 ) ; }
 }
 public static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; }
 public static double getRefArrayValue1double ( final doubleRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int binarySearchRegion1 ( final Region1 r , final Point1 target ) { final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point1 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint1 ( target , temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; }
 else { if ( lt ) { end = mid - one ; }
 else { start = mid + one ; }
 }
 notDone = start <= end ; }
 return result ; }
 public static Dist1 getBlockDist1 ( final Region1 r ) { final int rSize = r . regSize ; final int zero = 0 ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final dist ( : rank==1 ) dDist = [ 0 : rSizeMinusOne ] -> here ; final place [ : rank==1 ] placeArray = ( place [ : rank==1 ] ) ( new place [ dDist ] ) ; final int N = place.MAX_PLACES ; final int q = rSize % N ; final int p = rSize / N ; int blockSize = p + one ; int arraySize = q * blockSize ; int offset = 0 ; place initPlace = place.FIRST_PLACE ; Program . getCyclic ( placeArray , arraySize , initPlace , blockSize ) ; int remainingPlaces = N - q ; final boolean cond = remainingPlaces == zero ; if ( cond ) { final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; }
 ) ; final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist1 ) ; return retDist ; }
 offset = arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = place.places ( q ) ; int chunk = blockSize ; final boolean ifCond = blockSize > arraySize ; if ( ifCond ) { chunk = arraySize ; }
 int index = offset ; int dSize = index + chunk ; dSize = dSize - one ; final int ub0 = chunk - one ; final region ( : rank==1 ) pointReg0 = [ 0 : ub0 ] ; for ( point ( : rank==1 ) pt : pointReg0 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( initPlace ) ; }
 index = index + chunk ; arraySize = arraySize - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = arraySize != zero ; while ( whileCond ) { final boolean tailCond = chunk > arraySize ; if ( tailCond ) { dSize = index + arraySize ; dSize = dSize - one ; final int ub = arraySize - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 arraySize = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; arraySize = arraySize - chunk ; }
 pl = pl . next ( ) ; whileCond = arraySize != zero ; }
 final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; }
 ) ; final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist1 ) ; return retDist ; }
 public static void setRefArrayValue1double ( final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 getUniqueDist ( ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int rSize = maxPlaces - one ; final region ( : rank==1 ) placeRegion = [ 0 : rSize ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ placeRegion ] ( point ( : rank==1 ) p ) { final int i = p [0] ; final place pl1 = place.places ( i ) ; return pl1 ; }
 ) ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final Region1 reg = new Region1 ( pointArray , maxPlaces , zero , maxPlaces ) ; final Dist pointDist1 = new Dist ( vPlaceArray , maxPlaces ) ; final Dist1 retDist = new Dist1 ( reg , pointDist1 ) ; return retDist ; }
 public static place getPlaceFromDist1 ( final Dist1 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static void getCyclic ( final place [ : rank==1 ] placeArray , final int arraySize , final place initPlace , final int blockSize ) { final int zero = 0 ; final int one = 1 ; int N = arraySize ; int chunk = blockSize ; final boolean ifCond = blockSize > N ; if ( ifCond ) { chunk = N ; }
 int index = 0 ; int dSize = index + chunk ; dSize = dSize - one ; final region ( : rank==1 ) pointReg = [ 0 : dSize ] ; for ( point ( : rank==1 ) p : pointReg ) { placeArray [ p ] = ( initPlace ) ; }
 index = index + chunk ; N = N - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = N != zero ; while ( whileCond ) { final boolean tailCond = chunk > N ; if ( tailCond ) { dSize = index + N ; dSize = dSize - one ; final int ub = N - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 N = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; N = N - chunk ; }
 pl = pl . next ( ) ; whileCond = N != zero ; }
 }
 public static int getRefArrayValue1int ( final intRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final intStub value [ : rank==1 ] contents = array . contents ; final intStub indexStub = contents [ placeIndex ] ; final int [ : rank==1 ] localArray = indexStub . localArray ; final int returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int getDistLocalCount1 ( final Dist1 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static int comparePoint1 ( final Point1 pt1 , final Point1 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static int searchPointInRegion1 ( final Region1 r , final Point1 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion1 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion1 ( r , target ) ; return binarySearch ; }
 public static Point1 regionOrdinalPoint1 ( final Region1 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point1 pt = Program . regionOrdinalPointRegular1 ( reg , ordl ) ; return pt ; }
 final Point1 pt = Program . regionOrdinalPointArbitrary1 ( reg , ordl ) ; return pt ; }
 public static Point1 regionOrdinalPointRegular1 ( final Region1 reg , final int ordl ) { final int stride1 = 1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 pt = new Point1 ( f1 ) ; return pt ; }
 public static Point1 regionOrdinalPointArbitrary1 ( final Region1 reg , final int ordl ) { final Point1 value [ : rank==1 ] pointArray = reg . pointArray ; final Point1 pt = pointArray [ ordl ] ; return pt ; }
 public static Dist1 getPlaceDist1 ( final Region1 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist ) ; return retDist ; }
 public static int value [ : rank==1 ] initDist ( final int [ : rank==1 ] tempArr , final region ( : rank==1 ) tempReg ) { final int value [ : rank==1 ] vTemp = ( int value [ : rank==1 ] ) ( new int value [ tempReg ] ( point ( : rank==1 ) p ) { final int tempInt = tempArr [ p ] ; return tempInt ; }
 ) ; return vTemp ; }
 public static void setRefArrayValue1int ( final intRefArray1 array , final int index , final int val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final intStub value [ : rank==1 ] contents = array . contents ; final intStub indexStub = contents [ placeIndex ] ; final int [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint = new Point1 ( f1 ) ; return retPoint ; }
 ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; }
 }

 public static void thread1(final T1 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final int [ : rank==1 ] RX10_TEMP15 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final int X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final intStub RX10_TEMP16 = new intStub ( RX10_TEMP15 ) ; 
 final T24 utmp24 = new T24(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread24(utmp24); }
 }
 }
 public static void thread2(final T2 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  intStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final int [ : rank==1 ] RX10_TEMP36 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final int X10_TEMP12 = ( 0 ) ; return X10_TEMP12 ; }
 ) ; final intStub RX10_TEMP37 = new intStub ( RX10_TEMP36 ) ; 
 final T25 utmp25 = new T25(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {Program.thread25(utmp25); }
 }
 }
 public static void thread3(final T3 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  intStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final int [ : rank==1 ] RX10_TEMP57 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final int X10_TEMP15 = ( 0 ) ; return X10_TEMP15 ; }
 ) ; final intStub RX10_TEMP58 = new intStub ( RX10_TEMP57 ) ; 
 final T26 utmp26 = new T26(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {Program.thread26(utmp26); }
 }
 }
 public static void thread4(final T4 utmpz) {final  int RX10_TEMP111 = utmpz.RX10_TEMP111;
final  place RX10_TEMP107 = utmpz.RX10_TEMP107;
final  point ( : rank==1 ) RX10_TEMP106 = utmpz.RX10_TEMP106;
final  doubleStub [ : rank==1 ] RX10_TEMP105 = utmpz.RX10_TEMP105;
 { final dist ( : rank==1 ) RX10_TEMP112 = [ 0 : RX10_TEMP111 ] -> here ; final double [ : rank==1 ] RX10_TEMP113 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP112 ] ) ; final doubleStub RX10_TEMP114 = new doubleStub ( RX10_TEMP113 ) ; 
 final T27 utmp27 = new T27(RX10_TEMP114, RX10_TEMP106, RX10_TEMP105);
 async (RX10_TEMP107) {Program.thread27(utmp27); }
 }
 }
 public static void thread5(final T5 utmpz) {final  int RX10_TEMP153 = utmpz.RX10_TEMP153;
final  place RX10_TEMP149 = utmpz.RX10_TEMP149;
final  point ( : rank==1 ) RX10_TEMP148 = utmpz.RX10_TEMP148;
final  doubleStub [ : rank==1 ] RX10_TEMP147 = utmpz.RX10_TEMP147;
 { final dist ( : rank==1 ) RX10_TEMP154 = [ 0 : RX10_TEMP153 ] -> here ; final double [ : rank==1 ] RX10_TEMP155 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP154 ] ) ; final doubleStub RX10_TEMP156 = new doubleStub ( RX10_TEMP155 ) ; 
 final T28 utmp28 = new T28(RX10_TEMP156, RX10_TEMP148, RX10_TEMP147);
 async (RX10_TEMP149) {Program.thread28(utmp28); }
 }
 }
 public static void thread6(final T6 utmpz) {final  int RX10_TEMP173 = utmpz.RX10_TEMP173;
final  place RX10_TEMP169 = utmpz.RX10_TEMP169;
final  point ( : rank==1 ) RX10_TEMP168 = utmpz.RX10_TEMP168;
final  intStub [ : rank==1 ] RX10_TEMP167 = utmpz.RX10_TEMP167;
 { final dist ( : rank==1 ) RX10_TEMP174 = [ 0 : RX10_TEMP173 ] -> here ; final int [ : rank==1 ] RX10_TEMP175 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP174 ] ) ; final intStub RX10_TEMP176 = new intStub ( RX10_TEMP175 ) ; 
 final T29 utmp29 = new T29(RX10_TEMP176, RX10_TEMP168, RX10_TEMP167);
 async (RX10_TEMP169) {Program.thread29(utmp29); }
 }
 }
 public static void thread7(final T7 utmpz) {final  int RX10_TEMP193 = utmpz.RX10_TEMP193;
final  place RX10_TEMP189 = utmpz.RX10_TEMP189;
final  point ( : rank==1 ) RX10_TEMP188 = utmpz.RX10_TEMP188;
final  intStub [ : rank==1 ] RX10_TEMP187 = utmpz.RX10_TEMP187;
 { final dist ( : rank==1 ) RX10_TEMP194 = [ 0 : RX10_TEMP193 ] -> here ; final int [ : rank==1 ] RX10_TEMP195 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP194 ] ) ; final intStub RX10_TEMP196 = new intStub ( RX10_TEMP195 ) ; 
 final T30 utmp30 = new T30(RX10_TEMP196, RX10_TEMP188, RX10_TEMP187);
 async (RX10_TEMP189) {Program.thread30(utmp30); }
 }
 }
 public static void thread8(final T8 utmpz) {final  int RX10_TEMP213 = utmpz.RX10_TEMP213;
final  place RX10_TEMP209 = utmpz.RX10_TEMP209;
final  point ( : rank==1 ) RX10_TEMP208 = utmpz.RX10_TEMP208;
final  intStub [ : rank==1 ] RX10_TEMP207 = utmpz.RX10_TEMP207;
 { final dist ( : rank==1 ) RX10_TEMP214 = [ 0 : RX10_TEMP213 ] -> here ; final int [ : rank==1 ] RX10_TEMP215 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP214 ] ) ; final intStub RX10_TEMP216 = new intStub ( RX10_TEMP215 ) ; 
 final T31 utmp31 = new T31(RX10_TEMP216, RX10_TEMP208, RX10_TEMP207);
 async (RX10_TEMP209) {Program.thread31(utmp31); }
 }
 }
 public static void thread9(final T9 utmpz) {final  int RX10_TEMP233 = utmpz.RX10_TEMP233;
final  place RX10_TEMP229 = utmpz.RX10_TEMP229;
final  point ( : rank==1 ) RX10_TEMP228 = utmpz.RX10_TEMP228;
final  intStub [ : rank==1 ] RX10_TEMP227 = utmpz.RX10_TEMP227;
 { final dist ( : rank==1 ) RX10_TEMP234 = [ 0 : RX10_TEMP233 ] -> here ; final int [ : rank==1 ] RX10_TEMP235 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP234 ] ) ; final intStub RX10_TEMP236 = new intStub ( RX10_TEMP235 ) ; 
 final T32 utmp32 = new T32(RX10_TEMP236, RX10_TEMP228, RX10_TEMP227);
 async (RX10_TEMP229) {Program.thread32(utmp32); }
 }
 }
 public static void thread10(final T10 utmpz) {final  int RX10_TEMP253 = utmpz.RX10_TEMP253;
final  place RX10_TEMP249 = utmpz.RX10_TEMP249;
final  point ( : rank==1 ) RX10_TEMP248 = utmpz.RX10_TEMP248;
final  doubleStub [ : rank==1 ] RX10_TEMP247 = utmpz.RX10_TEMP247;
 { final dist ( : rank==1 ) RX10_TEMP254 = [ 0 : RX10_TEMP253 ] -> here ; final double [ : rank==1 ] RX10_TEMP255 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP254 ] ) ; final doubleStub RX10_TEMP256 = new doubleStub ( RX10_TEMP255 ) ; 
 final T33 utmp33 = new T33(RX10_TEMP256, RX10_TEMP248, RX10_TEMP247);
 async (RX10_TEMP249) {Program.thread33(utmp33); }
 }
 }
 public static void thread11(final T11 utmpz) {final  int RX10_TEMP273 = utmpz.RX10_TEMP273;
final  place RX10_TEMP269 = utmpz.RX10_TEMP269;
final  point ( : rank==1 ) RX10_TEMP268 = utmpz.RX10_TEMP268;
final  intStub [ : rank==1 ] RX10_TEMP267 = utmpz.RX10_TEMP267;
 { final dist ( : rank==1 ) RX10_TEMP274 = [ 0 : RX10_TEMP273 ] -> here ; final int [ : rank==1 ] RX10_TEMP275 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP274 ] ) ; final intStub RX10_TEMP276 = new intStub ( RX10_TEMP275 ) ; 
 final T34 utmp34 = new T34(RX10_TEMP276, RX10_TEMP268, RX10_TEMP267);
 async (RX10_TEMP269) {Program.thread34(utmp34); }
 }
 }
 public static void thread12(final T12 utmpz) {final  int RX10_TEMP293 = utmpz.RX10_TEMP293;
final  place RX10_TEMP289 = utmpz.RX10_TEMP289;
final  point ( : rank==1 ) RX10_TEMP288 = utmpz.RX10_TEMP288;
final  intStub [ : rank==1 ] RX10_TEMP287 = utmpz.RX10_TEMP287;
 { final dist ( : rank==1 ) RX10_TEMP294 = [ 0 : RX10_TEMP293 ] -> here ; final int [ : rank==1 ] RX10_TEMP295 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP294 ] ) ; final intStub RX10_TEMP296 = new intStub ( RX10_TEMP295 ) ; 
 final T35 utmp35 = new T35(RX10_TEMP296, RX10_TEMP288, RX10_TEMP287);
 async (RX10_TEMP289) {Program.thread35(utmp35); }
 }
 }
 public static void thread13(final T13 utmpz) {final  int RX10_TEMP313 = utmpz.RX10_TEMP313;
final  place RX10_TEMP309 = utmpz.RX10_TEMP309;
final  point ( : rank==1 ) RX10_TEMP308 = utmpz.RX10_TEMP308;
final  intStub [ : rank==1 ] RX10_TEMP307 = utmpz.RX10_TEMP307;
 { final dist ( : rank==1 ) RX10_TEMP314 = [ 0 : RX10_TEMP313 ] -> here ; final int [ : rank==1 ] RX10_TEMP315 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP314 ] ) ; final intStub RX10_TEMP316 = new intStub ( RX10_TEMP315 ) ; 
 final T36 utmp36 = new T36(RX10_TEMP316, RX10_TEMP308, RX10_TEMP307);
 async (RX10_TEMP309) {Program.thread36(utmp36); }
 }
 }
 public static void thread14(final T14 utmpz) {final  int RX10_TEMP333 = utmpz.RX10_TEMP333;
final  place RX10_TEMP329 = utmpz.RX10_TEMP329;
final  point ( : rank==1 ) RX10_TEMP328 = utmpz.RX10_TEMP328;
final  doubleStub [ : rank==1 ] RX10_TEMP327 = utmpz.RX10_TEMP327;
 { final dist ( : rank==1 ) RX10_TEMP334 = [ 0 : RX10_TEMP333 ] -> here ; final double [ : rank==1 ] RX10_TEMP335 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP334 ] ) ; final doubleStub RX10_TEMP336 = new doubleStub ( RX10_TEMP335 ) ; 
 final T37 utmp37 = new T37(RX10_TEMP336, RX10_TEMP328, RX10_TEMP327);
 async (RX10_TEMP329) {Program.thread37(utmp37); }
 }
 }
 public static void thread15(final T15 utmpz) {final  int RX10_TEMP353 = utmpz.RX10_TEMP353;
final  place RX10_TEMP349 = utmpz.RX10_TEMP349;
final  point ( : rank==1 ) RX10_TEMP348 = utmpz.RX10_TEMP348;
final  intStub [ : rank==1 ] RX10_TEMP347 = utmpz.RX10_TEMP347;
 { final dist ( : rank==1 ) RX10_TEMP354 = [ 0 : RX10_TEMP353 ] -> here ; final int [ : rank==1 ] RX10_TEMP355 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP354 ] ) ; final intStub RX10_TEMP356 = new intStub ( RX10_TEMP355 ) ; 
 final T38 utmp38 = new T38(RX10_TEMP356, RX10_TEMP348, RX10_TEMP347);
 async (RX10_TEMP349) {Program.thread38(utmp38); }
 }
 }
 public static void thread16(final T16 utmpz) {final  int RX10_TEMP373 = utmpz.RX10_TEMP373;
final  place RX10_TEMP369 = utmpz.RX10_TEMP369;
final  point ( : rank==1 ) RX10_TEMP368 = utmpz.RX10_TEMP368;
final  intStub [ : rank==1 ] RX10_TEMP367 = utmpz.RX10_TEMP367;
 { final dist ( : rank==1 ) RX10_TEMP374 = [ 0 : RX10_TEMP373 ] -> here ; final int [ : rank==1 ] RX10_TEMP375 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP374 ] ) ; final intStub RX10_TEMP376 = new intStub ( RX10_TEMP375 ) ; 
 final T39 utmp39 = new T39(RX10_TEMP376, RX10_TEMP368, RX10_TEMP367);
 async (RX10_TEMP369) {Program.thread39(utmp39); }
 }
 }
 public static void thread17(final T17 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; 
 final T40 utmp40 = new T40(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread40(utmp40); }
 }
 }
 public static void thread18(final T18 utmpz) {final  Point1 id1 = utmpz.id1;
final  intValArray1 highsum = utmpz.highsum;
final  intValArray1 lowsum = utmpz.lowsum;
final  int NUM_ITERATIONS = utmpz.NUM_ITERATIONS;
final  doubleValArray1 x = utmpz.x;
final  intValArray1 col = utmpz.col;
final  intValArray1 row = utmpz.row;
final  doubleValArray1 val = utmpz.val;
final  doubleRefArray1 y = utmpz.y;
 { final int X10_TEMP13 = ( 0 ) ; final int X10_TEMP11 = ( 1 ) ; final int X10_TEMP14 = ( NUM_ITERATIONS - X10_TEMP11 ) ; final Region1 X10_TEMP16 = Program . createNewRegion1R ( X10_TEMP13 , X10_TEMP14 ) ; final int RX10_TEMP10 = 1 ; int RX10_TEMP8 = X10_TEMP16 . regSize ; RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10 ; final region ( : rank==1 ) RX10_TEMP9 = [ 0 : RX10_TEMP8 ] ; for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP9 ) { final int RX10_TEMP11 = RX10_TEMP7 [0] ; final Point1 reps = Program . regionOrdinalPoint1 ( X10_TEMP16 , RX10_TEMP11 ) ; final Region1 RX10_TEMP12 = lowsum . regionValue ; final int RX10_TEMP13 = Program . searchPointInRegion1 ( RX10_TEMP12 , id1 ) ; final int RX10_TEMP14 = 0 ; final boolean RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14 ; if ( RX10_TEMP15 ) { String RX10_TEMP16 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP16 ) ; }
 final int value [ : rank==1 ] RX10_TEMP17 = ( int value [ : rank==1 ] ) ( lowsum . contents ) ; final int X10_TEMP23 = ( RX10_TEMP17 [ RX10_TEMP13 ] ) ; final Region1 RX10_TEMP18 = highsum . regionValue ; final int RX10_TEMP19 = Program . searchPointInRegion1 ( RX10_TEMP18 , id1 ) ; final int RX10_TEMP20 = 0 ; final boolean RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP22 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP22 ) ; }
 final int value [ : rank==1 ] RX10_TEMP23 = ( int value [ : rank==1 ] ) ( highsum . contents ) ; final int X10_TEMP20 = ( RX10_TEMP23 [ RX10_TEMP19 ] ) ; final int X10_TEMP21 = ( 1 ) ; final int X10_TEMP24 = ( X10_TEMP20 - X10_TEMP21 ) ; final Region1 X10_TEMP26 = Program . createNewRegion1R ( X10_TEMP23 , X10_TEMP24 ) ; final int RX10_TEMP27 = 1 ; int RX10_TEMP25 = X10_TEMP26 . regSize ; RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27 ; final region ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP25 ] ; for ( point ( : rank==1 ) RX10_TEMP24 : RX10_TEMP26 ) { final int RX10_TEMP28 = RX10_TEMP24 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( X10_TEMP26 , RX10_TEMP28 ) ; finish { final Dist1 RX10_TEMP29 = y . distValue ; final Dist1 X10_TEMP27 = RX10_TEMP29 ; final Region1 RX10_TEMP30 = row . regionValue ; final int RX10_TEMP31 = Program . searchPointInRegion1 ( RX10_TEMP30 , i ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP34 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final int value [ : rank==1 ] RX10_TEMP35 = ( int value [ : rank==1 ] ) ( row . contents ) ; int X10_TEMP30 = ( RX10_TEMP35 [ RX10_TEMP31 ] ) ; final Point1 RX10_TEMP36 = new Point1 ( X10_TEMP30 ) ; final Region1 RX10_TEMP37 = X10_TEMP27 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP36 ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { final String RX10_TEMP41 = "Point RX10_TEMP36 not found in the distribution X10_TEMP27." ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final place RX10_TEMP42 = Program . getPlaceFromDist1 ( X10_TEMP27 , RX10_TEMP38 ) ; final place X10_TEMP32 = RX10_TEMP42 ; 
 final T41 utmp41 = new T41(i, x, col, row, val, y);
 async (X10_TEMP32) {Program.thread41(utmp41); }
 }
 }
 }
 }
 }
 public static void thread19(final T19 utmpz) {final  int RX10_TEMP109 = utmpz.RX10_TEMP109;
final  place RX10_TEMP105 = utmpz.RX10_TEMP105;
final  point ( : rank==1 ) RX10_TEMP104 = utmpz.RX10_TEMP104;
final  doubleStub [ : rank==1 ] RX10_TEMP103 = utmpz.RX10_TEMP103;
 { final dist ( : rank==1 ) RX10_TEMP111 = [ 0 : RX10_TEMP109 ] -> here ; final double [ : rank==1 ] RX10_TEMP112 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP111 ] ( point ( : rank==1 ) RX10_TEMP110 ) { final double X10_TEMP59 = ( 0.0 ) ; return X10_TEMP59 ; }
 ) ; final doubleStub RX10_TEMP113 = new doubleStub ( RX10_TEMP112 ) ; 
 final T42 utmp42 = new T42(RX10_TEMP113, RX10_TEMP104, RX10_TEMP103);
 async (RX10_TEMP105) {Program.thread42(utmp42); }
 }
 }
 public static void thread20(final T20 utmpz) {final  Point1 i = utmpz.i;
final  doubleRefArray1 tempref = utmpz.tempref;
final  place curr_place = utmpz.curr_place;
final  intValArray1 row = utmpz.row;
final  doubleRefArray1 y = utmpz.y;
 { final Region1 RX10_TEMP137 = row . regionValue ; final int RX10_TEMP138 = Program . searchPointInRegion1 ( RX10_TEMP137 , i ) ; final int RX10_TEMP139 = 0 ; final boolean RX10_TEMP140 = RX10_TEMP138 < RX10_TEMP139 ; if ( RX10_TEMP140 ) { String RX10_TEMP141 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP141 ) ; }
 final int value [ : rank==1 ] RX10_TEMP142 = ( int value [ : rank==1 ] ) ( row . contents ) ; final int X10_TEMP76 = ( RX10_TEMP142 [ RX10_TEMP138 ] ) ; final Point1 RX10_TEMP143 = new Point1 ( X10_TEMP76 ) ; final Dist1 RX10_TEMP144 = y . distValue ; final Region1 RX10_TEMP145 = RX10_TEMP144 . dReg ; final int RX10_TEMP146 = Program . searchPointInRegion1 ( RX10_TEMP145 , RX10_TEMP143 ) ; final int RX10_TEMP147 = 0 ; final boolean RX10_TEMP148 = RX10_TEMP146 < RX10_TEMP147 ; if ( RX10_TEMP148 ) { String RX10_TEMP149 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP149 ) ; }
 final place RX10_TEMP150 = Program . getPlaceFromDist1 ( RX10_TEMP144 , RX10_TEMP146 ) ; final place RX10_TEMP152 = here ; final boolean RX10_TEMP153 = RX10_TEMP150 != RX10_TEMP152 ; if ( RX10_TEMP153 ) { String RX10_TEMP151 = "Bad place access for array y" ; throw new RuntimeException ( RX10_TEMP151 ) ; }
 final double RX10_TEMP154 = Program . getRefArrayValue1double ( y , RX10_TEMP146 ) ; final double temp = ( RX10_TEMP154 ) ; 
 final T43 utmp43 = new T43(temp, tempref);
 async (curr_place) {Program.thread43(utmp43); }
 }
 }
 public static void thread24(final T24 utmpz) {final  intStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public static void thread25(final T25 utmpz) {final  intStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  intStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public static void thread26(final T26 utmpz) {final  intStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  intStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }
 public static void thread27(final T27 utmpz) {final  doubleStub RX10_TEMP114 = utmpz.RX10_TEMP114;
final  point ( : rank==1 ) RX10_TEMP106 = utmpz.RX10_TEMP106;
final  doubleStub [ : rank==1 ] RX10_TEMP105 = utmpz.RX10_TEMP105;
 { RX10_TEMP105 [ RX10_TEMP106 ] = ( RX10_TEMP114 ) ; }
 }
 public static void thread28(final T28 utmpz) {final  doubleStub RX10_TEMP156 = utmpz.RX10_TEMP156;
final  point ( : rank==1 ) RX10_TEMP148 = utmpz.RX10_TEMP148;
final  doubleStub [ : rank==1 ] RX10_TEMP147 = utmpz.RX10_TEMP147;
 { RX10_TEMP147 [ RX10_TEMP148 ] = ( RX10_TEMP156 ) ; }
 }
 public static void thread29(final T29 utmpz) {final  intStub RX10_TEMP176 = utmpz.RX10_TEMP176;
final  point ( : rank==1 ) RX10_TEMP168 = utmpz.RX10_TEMP168;
final  intStub [ : rank==1 ] RX10_TEMP167 = utmpz.RX10_TEMP167;
 { RX10_TEMP167 [ RX10_TEMP168 ] = ( RX10_TEMP176 ) ; }
 }
 public static void thread30(final T30 utmpz) {final  intStub RX10_TEMP196 = utmpz.RX10_TEMP196;
final  point ( : rank==1 ) RX10_TEMP188 = utmpz.RX10_TEMP188;
final  intStub [ : rank==1 ] RX10_TEMP187 = utmpz.RX10_TEMP187;
 { RX10_TEMP187 [ RX10_TEMP188 ] = ( RX10_TEMP196 ) ; }
 }
 public static void thread31(final T31 utmpz) {final  intStub RX10_TEMP216 = utmpz.RX10_TEMP216;
final  point ( : rank==1 ) RX10_TEMP208 = utmpz.RX10_TEMP208;
final  intStub [ : rank==1 ] RX10_TEMP207 = utmpz.RX10_TEMP207;
 { RX10_TEMP207 [ RX10_TEMP208 ] = ( RX10_TEMP216 ) ; }
 }
 public static void thread32(final T32 utmpz) {final  intStub RX10_TEMP236 = utmpz.RX10_TEMP236;
final  point ( : rank==1 ) RX10_TEMP228 = utmpz.RX10_TEMP228;
final  intStub [ : rank==1 ] RX10_TEMP227 = utmpz.RX10_TEMP227;
 { RX10_TEMP227 [ RX10_TEMP228 ] = ( RX10_TEMP236 ) ; }
 }
 public static void thread33(final T33 utmpz) {final  doubleStub RX10_TEMP256 = utmpz.RX10_TEMP256;
final  point ( : rank==1 ) RX10_TEMP248 = utmpz.RX10_TEMP248;
final  doubleStub [ : rank==1 ] RX10_TEMP247 = utmpz.RX10_TEMP247;
 { RX10_TEMP247 [ RX10_TEMP248 ] = ( RX10_TEMP256 ) ; }
 }
 public static void thread34(final T34 utmpz) {final  intStub RX10_TEMP276 = utmpz.RX10_TEMP276;
final  point ( : rank==1 ) RX10_TEMP268 = utmpz.RX10_TEMP268;
final  intStub [ : rank==1 ] RX10_TEMP267 = utmpz.RX10_TEMP267;
 { RX10_TEMP267 [ RX10_TEMP268 ] = ( RX10_TEMP276 ) ; }
 }
 public static void thread35(final T35 utmpz) {final  intStub RX10_TEMP296 = utmpz.RX10_TEMP296;
final  point ( : rank==1 ) RX10_TEMP288 = utmpz.RX10_TEMP288;
final  intStub [ : rank==1 ] RX10_TEMP287 = utmpz.RX10_TEMP287;
 { RX10_TEMP287 [ RX10_TEMP288 ] = ( RX10_TEMP296 ) ; }
 }
 public static void thread36(final T36 utmpz) {final  intStub RX10_TEMP316 = utmpz.RX10_TEMP316;
final  point ( : rank==1 ) RX10_TEMP308 = utmpz.RX10_TEMP308;
final  intStub [ : rank==1 ] RX10_TEMP307 = utmpz.RX10_TEMP307;
 { RX10_TEMP307 [ RX10_TEMP308 ] = ( RX10_TEMP316 ) ; }
 }
 public static void thread37(final T37 utmpz) {final  doubleStub RX10_TEMP336 = utmpz.RX10_TEMP336;
final  point ( : rank==1 ) RX10_TEMP328 = utmpz.RX10_TEMP328;
final  doubleStub [ : rank==1 ] RX10_TEMP327 = utmpz.RX10_TEMP327;
 { RX10_TEMP327 [ RX10_TEMP328 ] = ( RX10_TEMP336 ) ; }
 }
 public static void thread38(final T38 utmpz) {final  intStub RX10_TEMP356 = utmpz.RX10_TEMP356;
final  point ( : rank==1 ) RX10_TEMP348 = utmpz.RX10_TEMP348;
final  intStub [ : rank==1 ] RX10_TEMP347 = utmpz.RX10_TEMP347;
 { RX10_TEMP347 [ RX10_TEMP348 ] = ( RX10_TEMP356 ) ; }
 }
 public static void thread39(final T39 utmpz) {final  intStub RX10_TEMP376 = utmpz.RX10_TEMP376;
final  point ( : rank==1 ) RX10_TEMP368 = utmpz.RX10_TEMP368;
final  intStub [ : rank==1 ] RX10_TEMP367 = utmpz.RX10_TEMP367;
 { RX10_TEMP367 [ RX10_TEMP368 ] = ( RX10_TEMP376 ) ; }
 }
 public static void thread40(final T40 utmpz) {final  doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread41(final T41 utmpz) {final  Point1 i = utmpz.i;
final  doubleValArray1 x = utmpz.x;
final  intValArray1 col = utmpz.col;
final  intValArray1 row = utmpz.row;
final  doubleValArray1 val = utmpz.val;
final  doubleRefArray1 y = utmpz.y;
 { final Region1 RX10_TEMP43 = row . regionValue ; final int RX10_TEMP44 = Program . searchPointInRegion1 ( RX10_TEMP43 , i ) ; final int RX10_TEMP45 = 0 ; final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; if ( RX10_TEMP46 ) { String RX10_TEMP47 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP47 ) ; }
 final int value [ : rank==1 ] RX10_TEMP48 = ( int value [ : rank==1 ] ) ( row . contents ) ; final int X10_TEMP35 = ( RX10_TEMP48 [ RX10_TEMP44 ] ) ; final Region1 RX10_TEMP49 = row . regionValue ; final int RX10_TEMP50 = Program . searchPointInRegion1 ( RX10_TEMP49 , i ) ; final int RX10_TEMP51 = 0 ; final boolean RX10_TEMP52 = RX10_TEMP50 < RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP53 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP53 ) ; }
 final int value [ : rank==1 ] RX10_TEMP54 = ( int value [ : rank==1 ] ) ( row . contents ) ; final int X10_TEMP38 = ( RX10_TEMP54 [ RX10_TEMP50 ] ) ; final Point1 RX10_TEMP55 = new Point1 ( X10_TEMP38 ) ; final Dist1 RX10_TEMP56 = y . distValue ; final Region1 RX10_TEMP57 = RX10_TEMP56 . dReg ; final int RX10_TEMP58 = Program . searchPointInRegion1 ( RX10_TEMP57 , RX10_TEMP55 ) ; final int RX10_TEMP59 = 0 ; final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; if ( RX10_TEMP60 ) { String RX10_TEMP61 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP61 ) ; }
 final place RX10_TEMP62 = Program . getPlaceFromDist1 ( RX10_TEMP56 , RX10_TEMP58 ) ; final place RX10_TEMP64 = here ; final boolean RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64 ; if ( RX10_TEMP65 ) { String RX10_TEMP63 = "Bad place access for array y" ; throw new RuntimeException ( RX10_TEMP63 ) ; }
 final double RX10_TEMP66 = Program . getRefArrayValue1double ( y , RX10_TEMP58 ) ; final double X10_TEMP45 = ( RX10_TEMP66 ) ; final Region1 RX10_TEMP67 = col . regionValue ; final int RX10_TEMP68 = Program . searchPointInRegion1 ( RX10_TEMP67 , i ) ; final int RX10_TEMP69 = 0 ; final boolean RX10_TEMP70 = RX10_TEMP68 < RX10_TEMP69 ; if ( RX10_TEMP70 ) { String RX10_TEMP71 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP71 ) ; }
 final int value [ : rank==1 ] RX10_TEMP72 = ( int value [ : rank==1 ] ) ( col . contents ) ; final int X10_TEMP41 = ( RX10_TEMP72 [ RX10_TEMP68 ] ) ; final Point1 RX10_TEMP73 = new Point1 ( X10_TEMP41 ) ; final Region1 RX10_TEMP74 = x . regionValue ; final int RX10_TEMP75 = Program . searchPointInRegion1 ( RX10_TEMP74 , RX10_TEMP73 ) ; final int RX10_TEMP76 = 0 ; final boolean RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP78 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 final double value [ : rank==1 ] RX10_TEMP79 = ( double value [ : rank==1 ] ) ( x . contents ) ; final double X10_TEMP43 = ( RX10_TEMP79 [ RX10_TEMP75 ] ) ; final Region1 RX10_TEMP80 = val . regionValue ; final int RX10_TEMP81 = Program . searchPointInRegion1 ( RX10_TEMP80 , i ) ; final int RX10_TEMP82 = 0 ; final boolean RX10_TEMP83 = RX10_TEMP81 < RX10_TEMP82 ; if ( RX10_TEMP83 ) { String RX10_TEMP84 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP84 ) ; }
 final double value [ : rank==1 ] RX10_TEMP85 = ( double value [ : rank==1 ] ) ( val . contents ) ; final double X10_TEMP44 = ( RX10_TEMP85 [ RX10_TEMP81 ] ) ; final double X10_TEMP46 = ( X10_TEMP43 * X10_TEMP44 ) ; final double X10_TEMP48 = ( X10_TEMP45 + X10_TEMP46 ) ; final double X10_TEMP49 = ( X10_TEMP48 ) ; final Point1 RX10_TEMP86 = new Point1 ( X10_TEMP35 ) ; final Dist1 RX10_TEMP87 = y . distValue ; final Region1 RX10_TEMP88 = RX10_TEMP87 . dReg ; final int RX10_TEMP89 = Program . searchPointInRegion1 ( RX10_TEMP88 , RX10_TEMP86 ) ; final int RX10_TEMP90 = 0 ; final boolean RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; if ( RX10_TEMP91 ) { String RX10_TEMP92 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP92 ) ; }
 final place RX10_TEMP93 = Program . getPlaceFromDist1 ( RX10_TEMP87 , RX10_TEMP89 ) ; final place RX10_TEMP95 = here ; final boolean RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; if ( RX10_TEMP96 ) { String RX10_TEMP94 = "Bad place access for array y" ; throw new RuntimeException ( RX10_TEMP94 ) ; }
 Program . setRefArrayValue1double ( y , RX10_TEMP89 , X10_TEMP49 ) ; }
 }
 public static void thread42(final T42 utmpz) {final  doubleStub RX10_TEMP113 = utmpz.RX10_TEMP113;
final  point ( : rank==1 ) RX10_TEMP104 = utmpz.RX10_TEMP104;
final  doubleStub [ : rank==1 ] RX10_TEMP103 = utmpz.RX10_TEMP103;
 { RX10_TEMP103 [ RX10_TEMP104 ] = ( RX10_TEMP113 ) ; }
 }
 public static void thread43(final T43 utmpz) {final  double temp = utmpz.temp;
final  doubleRefArray1 tempref = utmpz.tempref;
 { final int X10_TEMP80 = ( 0 ) ; final double X10_TEMP82 = ( temp ) ; final Point1 RX10_TEMP155 = new Point1 ( X10_TEMP80 ) ; final Dist1 RX10_TEMP156 = tempref . distValue ; final Region1 RX10_TEMP157 = RX10_TEMP156 . dReg ; final int RX10_TEMP158 = Program . searchPointInRegion1 ( RX10_TEMP157 , RX10_TEMP155 ) ; final int RX10_TEMP159 = 0 ; final boolean RX10_TEMP160 = RX10_TEMP158 < RX10_TEMP159 ; if ( RX10_TEMP160 ) { String RX10_TEMP161 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP161 ) ; }
 final place RX10_TEMP162 = Program . getPlaceFromDist1 ( RX10_TEMP156 , RX10_TEMP158 ) ; final place RX10_TEMP164 = here ; final boolean RX10_TEMP165 = RX10_TEMP162 != RX10_TEMP164 ; if ( RX10_TEMP165 ) { String RX10_TEMP163 = "Bad place access for array tempref" ; throw new RuntimeException ( RX10_TEMP163 ) ; }
 Program . setRefArrayValue1double ( tempref , RX10_TEMP158 , X10_TEMP82 ) ; }
 }

}

 
 value T1 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T1( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T2 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  intStub [ : rank==1 ] RX10_TEMP27;
public T2( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  intStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T3 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  intStub [ : rank==1 ] RX10_TEMP48;
public T3( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  intStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T4 {

 public final  int RX10_TEMP111;

 public final  place RX10_TEMP107;

 public final  point ( : rank==1 ) RX10_TEMP106;

 public final  doubleStub [ : rank==1 ] RX10_TEMP105;
public T4( final  int a_RX10_TEMP111,  final  place a_RX10_TEMP107,  final  point ( : rank==1 ) a_RX10_TEMP106,  final  doubleStub [ : rank==1 ] a_RX10_TEMP105) { 
 this.RX10_TEMP111 = (a_RX10_TEMP111);
 this.RX10_TEMP107 = (a_RX10_TEMP107);
 this.RX10_TEMP106 = (a_RX10_TEMP106);
 this.RX10_TEMP105 = (a_RX10_TEMP105);
}
}
 
 value T5 {

 public final  int RX10_TEMP153;

 public final  place RX10_TEMP149;

 public final  point ( : rank==1 ) RX10_TEMP148;

 public final  doubleStub [ : rank==1 ] RX10_TEMP147;
public T5( final  int a_RX10_TEMP153,  final  place a_RX10_TEMP149,  final  point ( : rank==1 ) a_RX10_TEMP148,  final  doubleStub [ : rank==1 ] a_RX10_TEMP147) { 
 this.RX10_TEMP153 = (a_RX10_TEMP153);
 this.RX10_TEMP149 = (a_RX10_TEMP149);
 this.RX10_TEMP148 = (a_RX10_TEMP148);
 this.RX10_TEMP147 = (a_RX10_TEMP147);
}
}
 
 value T6 {

 public final  int RX10_TEMP173;

 public final  place RX10_TEMP169;

 public final  point ( : rank==1 ) RX10_TEMP168;

 public final  intStub [ : rank==1 ] RX10_TEMP167;
public T6( final  int a_RX10_TEMP173,  final  place a_RX10_TEMP169,  final  point ( : rank==1 ) a_RX10_TEMP168,  final  intStub [ : rank==1 ] a_RX10_TEMP167) { 
 this.RX10_TEMP173 = (a_RX10_TEMP173);
 this.RX10_TEMP169 = (a_RX10_TEMP169);
 this.RX10_TEMP168 = (a_RX10_TEMP168);
 this.RX10_TEMP167 = (a_RX10_TEMP167);
}
}
 
 value T7 {

 public final  int RX10_TEMP193;

 public final  place RX10_TEMP189;

 public final  point ( : rank==1 ) RX10_TEMP188;

 public final  intStub [ : rank==1 ] RX10_TEMP187;
public T7( final  int a_RX10_TEMP193,  final  place a_RX10_TEMP189,  final  point ( : rank==1 ) a_RX10_TEMP188,  final  intStub [ : rank==1 ] a_RX10_TEMP187) { 
 this.RX10_TEMP193 = (a_RX10_TEMP193);
 this.RX10_TEMP189 = (a_RX10_TEMP189);
 this.RX10_TEMP188 = (a_RX10_TEMP188);
 this.RX10_TEMP187 = (a_RX10_TEMP187);
}
}
 
 value T8 {

 public final  int RX10_TEMP213;

 public final  place RX10_TEMP209;

 public final  point ( : rank==1 ) RX10_TEMP208;

 public final  intStub [ : rank==1 ] RX10_TEMP207;
public T8( final  int a_RX10_TEMP213,  final  place a_RX10_TEMP209,  final  point ( : rank==1 ) a_RX10_TEMP208,  final  intStub [ : rank==1 ] a_RX10_TEMP207) { 
 this.RX10_TEMP213 = (a_RX10_TEMP213);
 this.RX10_TEMP209 = (a_RX10_TEMP209);
 this.RX10_TEMP208 = (a_RX10_TEMP208);
 this.RX10_TEMP207 = (a_RX10_TEMP207);
}
}
 
 value T9 {

 public final  int RX10_TEMP233;

 public final  place RX10_TEMP229;

 public final  point ( : rank==1 ) RX10_TEMP228;

 public final  intStub [ : rank==1 ] RX10_TEMP227;
public T9( final  int a_RX10_TEMP233,  final  place a_RX10_TEMP229,  final  point ( : rank==1 ) a_RX10_TEMP228,  final  intStub [ : rank==1 ] a_RX10_TEMP227) { 
 this.RX10_TEMP233 = (a_RX10_TEMP233);
 this.RX10_TEMP229 = (a_RX10_TEMP229);
 this.RX10_TEMP228 = (a_RX10_TEMP228);
 this.RX10_TEMP227 = (a_RX10_TEMP227);
}
}
 
 value T10 {

 public final  int RX10_TEMP253;

 public final  place RX10_TEMP249;

 public final  point ( : rank==1 ) RX10_TEMP248;

 public final  doubleStub [ : rank==1 ] RX10_TEMP247;
public T10( final  int a_RX10_TEMP253,  final  place a_RX10_TEMP249,  final  point ( : rank==1 ) a_RX10_TEMP248,  final  doubleStub [ : rank==1 ] a_RX10_TEMP247) { 
 this.RX10_TEMP253 = (a_RX10_TEMP253);
 this.RX10_TEMP249 = (a_RX10_TEMP249);
 this.RX10_TEMP248 = (a_RX10_TEMP248);
 this.RX10_TEMP247 = (a_RX10_TEMP247);
}
}
 
 value T11 {

 public final  int RX10_TEMP273;

 public final  place RX10_TEMP269;

 public final  point ( : rank==1 ) RX10_TEMP268;

 public final  intStub [ : rank==1 ] RX10_TEMP267;
public T11( final  int a_RX10_TEMP273,  final  place a_RX10_TEMP269,  final  point ( : rank==1 ) a_RX10_TEMP268,  final  intStub [ : rank==1 ] a_RX10_TEMP267) { 
 this.RX10_TEMP273 = (a_RX10_TEMP273);
 this.RX10_TEMP269 = (a_RX10_TEMP269);
 this.RX10_TEMP268 = (a_RX10_TEMP268);
 this.RX10_TEMP267 = (a_RX10_TEMP267);
}
}
 
 value T12 {

 public final  int RX10_TEMP293;

 public final  place RX10_TEMP289;

 public final  point ( : rank==1 ) RX10_TEMP288;

 public final  intStub [ : rank==1 ] RX10_TEMP287;
public T12( final  int a_RX10_TEMP293,  final  place a_RX10_TEMP289,  final  point ( : rank==1 ) a_RX10_TEMP288,  final  intStub [ : rank==1 ] a_RX10_TEMP287) { 
 this.RX10_TEMP293 = (a_RX10_TEMP293);
 this.RX10_TEMP289 = (a_RX10_TEMP289);
 this.RX10_TEMP288 = (a_RX10_TEMP288);
 this.RX10_TEMP287 = (a_RX10_TEMP287);
}
}
 
 value T13 {

 public final  int RX10_TEMP313;

 public final  place RX10_TEMP309;

 public final  point ( : rank==1 ) RX10_TEMP308;

 public final  intStub [ : rank==1 ] RX10_TEMP307;
public T13( final  int a_RX10_TEMP313,  final  place a_RX10_TEMP309,  final  point ( : rank==1 ) a_RX10_TEMP308,  final  intStub [ : rank==1 ] a_RX10_TEMP307) { 
 this.RX10_TEMP313 = (a_RX10_TEMP313);
 this.RX10_TEMP309 = (a_RX10_TEMP309);
 this.RX10_TEMP308 = (a_RX10_TEMP308);
 this.RX10_TEMP307 = (a_RX10_TEMP307);
}
}
 
 value T14 {

 public final  int RX10_TEMP333;

 public final  place RX10_TEMP329;

 public final  point ( : rank==1 ) RX10_TEMP328;

 public final  doubleStub [ : rank==1 ] RX10_TEMP327;
public T14( final  int a_RX10_TEMP333,  final  place a_RX10_TEMP329,  final  point ( : rank==1 ) a_RX10_TEMP328,  final  doubleStub [ : rank==1 ] a_RX10_TEMP327) { 
 this.RX10_TEMP333 = (a_RX10_TEMP333);
 this.RX10_TEMP329 = (a_RX10_TEMP329);
 this.RX10_TEMP328 = (a_RX10_TEMP328);
 this.RX10_TEMP327 = (a_RX10_TEMP327);
}
}
 
 value T15 {

 public final  int RX10_TEMP353;

 public final  place RX10_TEMP349;

 public final  point ( : rank==1 ) RX10_TEMP348;

 public final  intStub [ : rank==1 ] RX10_TEMP347;
public T15( final  int a_RX10_TEMP353,  final  place a_RX10_TEMP349,  final  point ( : rank==1 ) a_RX10_TEMP348,  final  intStub [ : rank==1 ] a_RX10_TEMP347) { 
 this.RX10_TEMP353 = (a_RX10_TEMP353);
 this.RX10_TEMP349 = (a_RX10_TEMP349);
 this.RX10_TEMP348 = (a_RX10_TEMP348);
 this.RX10_TEMP347 = (a_RX10_TEMP347);
}
}
 
 value T16 {

 public final  int RX10_TEMP373;

 public final  place RX10_TEMP369;

 public final  point ( : rank==1 ) RX10_TEMP368;

 public final  intStub [ : rank==1 ] RX10_TEMP367;
public T16( final  int a_RX10_TEMP373,  final  place a_RX10_TEMP369,  final  point ( : rank==1 ) a_RX10_TEMP368,  final  intStub [ : rank==1 ] a_RX10_TEMP367) { 
 this.RX10_TEMP373 = (a_RX10_TEMP373);
 this.RX10_TEMP369 = (a_RX10_TEMP369);
 this.RX10_TEMP368 = (a_RX10_TEMP368);
 this.RX10_TEMP367 = (a_RX10_TEMP367);
}
}
 
 value T17 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T17( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T18 {

 public final  Point1 id1;

 public final  intValArray1 highsum;

 public final  intValArray1 lowsum;

 public final  int NUM_ITERATIONS;

 public final  doubleValArray1 x;

 public final  intValArray1 col;

 public final  intValArray1 row;

 public final  doubleValArray1 val;

 public final  doubleRefArray1 y;
public T18( final  Point1 a_id1,  final  intValArray1 a_highsum,  final  intValArray1 a_lowsum,  final  int a_NUM_ITERATIONS,  final  doubleValArray1 a_x,  final  intValArray1 a_col,  final  intValArray1 a_row,  final  doubleValArray1 a_val,  final  doubleRefArray1 a_y) { 
 this.id1 = (a_id1);
 this.highsum = (a_highsum);
 this.lowsum = (a_lowsum);
 this.NUM_ITERATIONS = (a_NUM_ITERATIONS);
 this.x = (a_x);
 this.col = (a_col);
 this.row = (a_row);
 this.val = (a_val);
 this.y = (a_y);
}
}
 
 value T19 {

 public final  int RX10_TEMP109;

 public final  place RX10_TEMP105;

 public final  point ( : rank==1 ) RX10_TEMP104;

 public final  doubleStub [ : rank==1 ] RX10_TEMP103;
public T19( final  int a_RX10_TEMP109,  final  place a_RX10_TEMP105,  final  point ( : rank==1 ) a_RX10_TEMP104,  final  doubleStub [ : rank==1 ] a_RX10_TEMP103) { 
 this.RX10_TEMP109 = (a_RX10_TEMP109);
 this.RX10_TEMP105 = (a_RX10_TEMP105);
 this.RX10_TEMP104 = (a_RX10_TEMP104);
 this.RX10_TEMP103 = (a_RX10_TEMP103);
}
}
 
 value T20 {

 public final  Point1 i;

 public final  doubleRefArray1 tempref;

 public final  place curr_place;

 public final  intValArray1 row;

 public final  doubleRefArray1 y;
public T20( final  Point1 a_i,  final  doubleRefArray1 a_tempref,  final  place a_curr_place,  final  intValArray1 a_row,  final  doubleRefArray1 a_y) { 
 this.i = (a_i);
 this.tempref = (a_tempref);
 this.curr_place = (a_curr_place);
 this.row = (a_row);
 this.y = (a_y);
}
}
 
 value T21 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T21( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T22 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T22( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T23 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T23( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T24 {

 public final  intStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T24( final  intStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T25 {

 public final  intStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  intStub [ : rank==1 ] RX10_TEMP27;
public T25( final  intStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  intStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T26 {

 public final  intStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  intStub [ : rank==1 ] RX10_TEMP48;
public T26( final  intStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  intStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T27 {

 public final  doubleStub RX10_TEMP114;

 public final  point ( : rank==1 ) RX10_TEMP106;

 public final  doubleStub [ : rank==1 ] RX10_TEMP105;
public T27( final  doubleStub a_RX10_TEMP114,  final  point ( : rank==1 ) a_RX10_TEMP106,  final  doubleStub [ : rank==1 ] a_RX10_TEMP105) { 
 this.RX10_TEMP114 = (a_RX10_TEMP114);
 this.RX10_TEMP106 = (a_RX10_TEMP106);
 this.RX10_TEMP105 = (a_RX10_TEMP105);
}
}
 
 value T28 {

 public final  doubleStub RX10_TEMP156;

 public final  point ( : rank==1 ) RX10_TEMP148;

 public final  doubleStub [ : rank==1 ] RX10_TEMP147;
public T28( final  doubleStub a_RX10_TEMP156,  final  point ( : rank==1 ) a_RX10_TEMP148,  final  doubleStub [ : rank==1 ] a_RX10_TEMP147) { 
 this.RX10_TEMP156 = (a_RX10_TEMP156);
 this.RX10_TEMP148 = (a_RX10_TEMP148);
 this.RX10_TEMP147 = (a_RX10_TEMP147);
}
}
 
 value T29 {

 public final  intStub RX10_TEMP176;

 public final  point ( : rank==1 ) RX10_TEMP168;

 public final  intStub [ : rank==1 ] RX10_TEMP167;
public T29( final  intStub a_RX10_TEMP176,  final  point ( : rank==1 ) a_RX10_TEMP168,  final  intStub [ : rank==1 ] a_RX10_TEMP167) { 
 this.RX10_TEMP176 = (a_RX10_TEMP176);
 this.RX10_TEMP168 = (a_RX10_TEMP168);
 this.RX10_TEMP167 = (a_RX10_TEMP167);
}
}
 
 value T30 {

 public final  intStub RX10_TEMP196;

 public final  point ( : rank==1 ) RX10_TEMP188;

 public final  intStub [ : rank==1 ] RX10_TEMP187;
public T30( final  intStub a_RX10_TEMP196,  final  point ( : rank==1 ) a_RX10_TEMP188,  final  intStub [ : rank==1 ] a_RX10_TEMP187) { 
 this.RX10_TEMP196 = (a_RX10_TEMP196);
 this.RX10_TEMP188 = (a_RX10_TEMP188);
 this.RX10_TEMP187 = (a_RX10_TEMP187);
}
}
 
 value T31 {

 public final  intStub RX10_TEMP216;

 public final  point ( : rank==1 ) RX10_TEMP208;

 public final  intStub [ : rank==1 ] RX10_TEMP207;
public T31( final  intStub a_RX10_TEMP216,  final  point ( : rank==1 ) a_RX10_TEMP208,  final  intStub [ : rank==1 ] a_RX10_TEMP207) { 
 this.RX10_TEMP216 = (a_RX10_TEMP216);
 this.RX10_TEMP208 = (a_RX10_TEMP208);
 this.RX10_TEMP207 = (a_RX10_TEMP207);
}
}
 
 value T32 {

 public final  intStub RX10_TEMP236;

 public final  point ( : rank==1 ) RX10_TEMP228;

 public final  intStub [ : rank==1 ] RX10_TEMP227;
public T32( final  intStub a_RX10_TEMP236,  final  point ( : rank==1 ) a_RX10_TEMP228,  final  intStub [ : rank==1 ] a_RX10_TEMP227) { 
 this.RX10_TEMP236 = (a_RX10_TEMP236);
 this.RX10_TEMP228 = (a_RX10_TEMP228);
 this.RX10_TEMP227 = (a_RX10_TEMP227);
}
}
 
 value T33 {

 public final  doubleStub RX10_TEMP256;

 public final  point ( : rank==1 ) RX10_TEMP248;

 public final  doubleStub [ : rank==1 ] RX10_TEMP247;
public T33( final  doubleStub a_RX10_TEMP256,  final  point ( : rank==1 ) a_RX10_TEMP248,  final  doubleStub [ : rank==1 ] a_RX10_TEMP247) { 
 this.RX10_TEMP256 = (a_RX10_TEMP256);
 this.RX10_TEMP248 = (a_RX10_TEMP248);
 this.RX10_TEMP247 = (a_RX10_TEMP247);
}
}
 
 value T34 {

 public final  intStub RX10_TEMP276;

 public final  point ( : rank==1 ) RX10_TEMP268;

 public final  intStub [ : rank==1 ] RX10_TEMP267;
public T34( final  intStub a_RX10_TEMP276,  final  point ( : rank==1 ) a_RX10_TEMP268,  final  intStub [ : rank==1 ] a_RX10_TEMP267) { 
 this.RX10_TEMP276 = (a_RX10_TEMP276);
 this.RX10_TEMP268 = (a_RX10_TEMP268);
 this.RX10_TEMP267 = (a_RX10_TEMP267);
}
}
 
 value T35 {

 public final  intStub RX10_TEMP296;

 public final  point ( : rank==1 ) RX10_TEMP288;

 public final  intStub [ : rank==1 ] RX10_TEMP287;
public T35( final  intStub a_RX10_TEMP296,  final  point ( : rank==1 ) a_RX10_TEMP288,  final  intStub [ : rank==1 ] a_RX10_TEMP287) { 
 this.RX10_TEMP296 = (a_RX10_TEMP296);
 this.RX10_TEMP288 = (a_RX10_TEMP288);
 this.RX10_TEMP287 = (a_RX10_TEMP287);
}
}
 
 value T36 {

 public final  intStub RX10_TEMP316;

 public final  point ( : rank==1 ) RX10_TEMP308;

 public final  intStub [ : rank==1 ] RX10_TEMP307;
public T36( final  intStub a_RX10_TEMP316,  final  point ( : rank==1 ) a_RX10_TEMP308,  final  intStub [ : rank==1 ] a_RX10_TEMP307) { 
 this.RX10_TEMP316 = (a_RX10_TEMP316);
 this.RX10_TEMP308 = (a_RX10_TEMP308);
 this.RX10_TEMP307 = (a_RX10_TEMP307);
}
}
 
 value T37 {

 public final  doubleStub RX10_TEMP336;

 public final  point ( : rank==1 ) RX10_TEMP328;

 public final  doubleStub [ : rank==1 ] RX10_TEMP327;
public T37( final  doubleStub a_RX10_TEMP336,  final  point ( : rank==1 ) a_RX10_TEMP328,  final  doubleStub [ : rank==1 ] a_RX10_TEMP327) { 
 this.RX10_TEMP336 = (a_RX10_TEMP336);
 this.RX10_TEMP328 = (a_RX10_TEMP328);
 this.RX10_TEMP327 = (a_RX10_TEMP327);
}
}
 
 value T38 {

 public final  intStub RX10_TEMP356;

 public final  point ( : rank==1 ) RX10_TEMP348;

 public final  intStub [ : rank==1 ] RX10_TEMP347;
public T38( final  intStub a_RX10_TEMP356,  final  point ( : rank==1 ) a_RX10_TEMP348,  final  intStub [ : rank==1 ] a_RX10_TEMP347) { 
 this.RX10_TEMP356 = (a_RX10_TEMP356);
 this.RX10_TEMP348 = (a_RX10_TEMP348);
 this.RX10_TEMP347 = (a_RX10_TEMP347);
}
}
 
 value T39 {

 public final  intStub RX10_TEMP376;

 public final  point ( : rank==1 ) RX10_TEMP368;

 public final  intStub [ : rank==1 ] RX10_TEMP367;
public T39( final  intStub a_RX10_TEMP376,  final  point ( : rank==1 ) a_RX10_TEMP368,  final  intStub [ : rank==1 ] a_RX10_TEMP367) { 
 this.RX10_TEMP376 = (a_RX10_TEMP376);
 this.RX10_TEMP368 = (a_RX10_TEMP368);
 this.RX10_TEMP367 = (a_RX10_TEMP367);
}
}
 
 value T40 {

 public final  doubleStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T40( final  doubleStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T41 {

 public final  Point1 i;

 public final  doubleValArray1 x;

 public final  intValArray1 col;

 public final  intValArray1 row;

 public final  doubleValArray1 val;

 public final  doubleRefArray1 y;
public T41( final  Point1 a_i,  final  doubleValArray1 a_x,  final  intValArray1 a_col,  final  intValArray1 a_row,  final  doubleValArray1 a_val,  final  doubleRefArray1 a_y) { 
 this.i = (a_i);
 this.x = (a_x);
 this.col = (a_col);
 this.row = (a_row);
 this.val = (a_val);
 this.y = (a_y);
}
}
 
 value T42 {

 public final  doubleStub RX10_TEMP113;

 public final  point ( : rank==1 ) RX10_TEMP104;

 public final  doubleStub [ : rank==1 ] RX10_TEMP103;
public T42( final  doubleStub a_RX10_TEMP113,  final  point ( : rank==1 ) a_RX10_TEMP104,  final  doubleStub [ : rank==1 ] a_RX10_TEMP103) { 
 this.RX10_TEMP113 = (a_RX10_TEMP113);
 this.RX10_TEMP104 = (a_RX10_TEMP104);
 this.RX10_TEMP103 = (a_RX10_TEMP103);
}
}
 
 value T43 {

 public final  double temp;

 public final  doubleRefArray1 tempref;
public T43( final  double a_temp,  final  doubleRefArray1 a_tempref) { 
 this.temp = (a_temp);
 this.tempref = (a_tempref);
}
}
 
 value T44 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T44( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T45 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T45( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T46 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T46( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value doubleValArray1 { public final Region1 regionValue ; public final double value [ : rank==1 ] contents ; public doubleValArray1 ( final Region1 regionValue_ , final double value [ : rank==1 ] contents_ ) { this . regionValue = ( regionValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 class SparseMatmult { public int nthreads ; public int setSize ; public doubleValArray1 x ; public doubleValArray1 val ; public intValArray1 col ; public intValArray1 row ; public intValArray1 lowsum ; public intValArray1 highsum ; public doubleRefArray1 y ; public double ytotal ; public SparseMatmult ( ) { final int X10_TEMP2 = ( place.MAX_PLACES ) ; final int X10_TEMP3 = ( X10_TEMP2 ) ; this . nthreads = ( X10_TEMP3 ) ; }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T21 utmp21 = new T21(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread21(utmp21); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T22 utmp22 = new T22(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread22(utmp22); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T23 utmp23 = new T23(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread23(utmp23); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 public void thread21(final T21 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T44 utmp44 = new T44(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread44(utmp44); }
 }
 }
 public void thread22(final T22 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T45 utmp45 = new T45(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread45(utmp45); }
 }
 }
 public void thread23(final T23 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T46 utmp46 = new T46(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread46(utmp46); }
 }
 }
 public void thread44(final T44 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread45(final T45 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread46(final T46 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }

} 

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; }
 public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

} 

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value intValArray1 { public final Region1 regionValue ; public final int value [ : rank==1 ] contents ; public intValArray1 ( final Region1 regionValue_ , final int value [ : rank==1 ] contents_ ) { this . regionValue = ( regionValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value intStub { public final int [ : rank==1 ] localArray ; public intStub ( final int [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

 value intRefArray1 { public final Dist1 distValue ; public final intStub value [ : rank==1 ] contents ; public intRefArray1 ( final Dist1 distValue_ , final intStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 class Random { public long seed ; public Random ( final long rseed ) { this . Random_setSeed ( rseed ) ; }
 public void Random_setSeed ( final long rseed ) { final long X10_TEMP1 = ( Program . _Random_multiplier ) ; final long X10_TEMP3 = ( rseed ^ X10_TEMP1 ) ; final long X10_TEMP4 = ( Program . _Random_mask ) ; final long X10_TEMP6 = ( X10_TEMP3 & X10_TEMP4 ) ; this . seed = ( X10_TEMP6 ) ; }

} 
