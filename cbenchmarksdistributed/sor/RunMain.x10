 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final int _SOR_JACOBI_NUM_ITER = Program . _SOR_JACOBI_NUM_ITER_init ( ) ; public static final long _SOR_RANDOM_SEED = Program . _SOR_RANDOM_SEED_init ( ) ; public static final long _Random_multiplier = Program . _Random_multiplier_init ( ) ; public static final long _Random_addend = Program . _Random_addend_init ( ) ; public static final long _Random_mask = Program . _Random_mask_init ( ) ; public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static void runMain ( ) { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; }
 finish { final SOR X10_TEMP4 = ( new SOR ( ) ) ; Program . SOR_run ( X10_TEMP4 ) ; }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP7 = ( "Wall-clock time for sor: " ) ; final double X10_TEMP8 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " secs" ) ; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; System.out.println ( X10_TEMP12 ) ; }
 public static int _SOR_JACOBI_NUM_ITER_init ( ) { final int X10_TEMP2 = ( 100 ) ; return X10_TEMP2 ; }
 public static long _SOR_RANDOM_SEED_init ( ) { final long X10_TEMP2 = ( 10101010 ) ; return X10_TEMP2 ; }
 public static void SOR_run ( final SOR X10_TEMP0 ) { final double X10_TEMP2 = ( Program . SOR_kernel ( X10_TEMP0 ) ) ; Program . SOR_validate ( X10_TEMP0 , X10_TEMP2 ) ; }
 public static double SOR_kernel ( final SOR X10_TEMP0 ) { final int X10_TEMP4 = ( 10 ) ; final int X10_TEMP5 = ( 10 ) ; final Random X10_TEMP6 = ( X10_TEMP0 . R ) ; doubleRefArray2 G = Program . SOR_RandomMatrix ( X10_TEMP0 , X10_TEMP4 , X10_TEMP5 , X10_TEMP6 ) ; final double X10_TEMP11 = ( 1.25 ) ; final double X10_TEMP13 = ( Program . SOR_SORrun ( X10_TEMP0 , X10_TEMP11 , G , _SOR_JACOBI_NUM_ITER ) ) ; return X10_TEMP13 ; }
 public static doubleRefArray2 SOR_RandomMatrix ( final SOR X10_TEMP0 , final int M , final int N , final Random R ) { final int X10_TEMP4 = ( 0 ) ; final int X10_TEMP2 = ( 1 ) ; final int X10_TEMP5 = ( M - X10_TEMP2 ) ; final Region1 X10_TEMP13 = Program . createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; final int X10_TEMP10 = ( 0 ) ; final int X10_TEMP8 = ( 1 ) ; final int X10_TEMP11 = ( N - X10_TEMP8 ) ; final Region1 X10_TEMP14 = Program . createNewRegion1R ( X10_TEMP10 , X10_TEMP11 ) ; final Dist2 d = Program . SOR_blockStar ( X10_TEMP0 , X10_TEMP13 , X10_TEMP14 ) ; final Region2 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount2 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T1 utmp1 = new T1(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread1(utmp1); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final doubleRefArray2 RX10_TEMP19 = new doubleRefArray2 ( d , RX10_TEMP16 ) ; final doubleRefArray2 t = RX10_TEMP19 ; final Dist2 RX10_TEMP20 = t . distValue ; final Region2 RX10_TEMP21 = RX10_TEMP20 . dReg ; final Region2 X10_TEMP18 = RX10_TEMP21 ; final int RX10_TEMP25 = 1 ; int RX10_TEMP23 = X10_TEMP18 . regSize ; RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; final region ( : rank==1 ) RX10_TEMP24 = [ 0 : RX10_TEMP23 ] ; for ( point ( : rank==1 ) RX10_TEMP22 : RX10_TEMP24 ) { final int RX10_TEMP26 = RX10_TEMP22 [0] ; final Point2 p = Program . regionOrdinalPoint2 ( X10_TEMP18 , RX10_TEMP26 ) ; final double X10_TEMP21 = ( Program . Random_nextDouble ( R ) ) ; final double X10_TEMP22 = ( 1e-6 ) ; final double X10_TEMP24 = ( X10_TEMP21 * X10_TEMP22 ) ; Program . SOR_write ( X10_TEMP0 , t , p , X10_TEMP24 ) ; }
 return t ; }
 public static void SOR_write ( final SOR X10_TEMP0 , final doubleRefArray2 t , final Point2 p , final double v ) { finish { final Dist2 RX10_TEMP0 = t . distValue ; final Dist2 X10_TEMP1 = RX10_TEMP0 ; final Region2 RX10_TEMP1 = X10_TEMP1 . dReg ; final int RX10_TEMP2 = Program . searchPointInRegion2 ( RX10_TEMP1 , p ) ; final int RX10_TEMP3 = 0 ; final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; if ( RX10_TEMP4 ) { final String RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1." ; throw new RuntimeException ( RX10_TEMP5 ) ; }
 final place RX10_TEMP6 = Program . getPlaceFromDist2 ( X10_TEMP1 , RX10_TEMP2 ) ; final place X10_TEMP4 = RX10_TEMP6 ; 
 final T2 utmp2 = new T2(v, p, t);
 async (X10_TEMP4) {Program.thread2(utmp2); }
 }
 }
 public static Dist2 SOR_blockStar ( final SOR X10_TEMP0 , final Region1 r1 , final Region1 r2 ) { final Dist1 X10_TEMP2 = Program . getBlockDist1 ( r1 ) ; final Dist1 d1 = X10_TEMP2 ; final Dist2 X10_TEMP7 = Program . SOR_distTimesRegion ( X10_TEMP0 , d1 , r2 ) ; return X10_TEMP7 ; }
 public static Dist2 SOR_distTimesRegion ( final SOR X10_TEMP0 , final Dist1 d , final Region1 r ) { final int X10_TEMP1 = 0 ; final int X10_TEMP2 = 1 ; final int X10_TEMP3 = X10_TEMP1 - X10_TEMP2 ; final Region2 X10_TEMP4 = Program . createNewRegion2RR ( X10_TEMP1 , X10_TEMP3 , X10_TEMP1 , X10_TEMP3 ) ; final Region2 X10_TEMP6 = X10_TEMP4 ; final place X10_TEMP7 = ( here ) ; Dist2 d0 = Program . getPlaceDist2 ( X10_TEMP6 , X10_TEMP7 ) ; final Dist1 X10_TEMP10 = Program . getUniqueDist ( ) ; final Region1 RX10_TEMP1 = X10_TEMP10 . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 pl = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final Dist1 X10_TEMP11 = Program . getUniqueDist ( ) ; final Region1 RX10_TEMP6 = X10_TEMP11 . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , pl ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point pl not found in the distribution X10_TEMP11." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP7 ) ; place p = ( RX10_TEMP11 ) ; final Dist1 X10_TEMP15 = Program . restrictDist1 ( d , p ) ; final Region1 RX10_TEMP12 = X10_TEMP15 . dReg ; final Region1 X10_TEMP16 = RX10_TEMP12 ; final Region2 X10_TEMP19 = Program . createNewRegion2AA ( X10_TEMP16 , r ) ; final Dist2 X10_TEMP21 = Program . getPlaceDist2 ( X10_TEMP19 , p ) ; final Dist2 X10_TEMP23 = Program . unionDist2 ( d0 , X10_TEMP21 ) ; d0 = ( X10_TEMP23 ) ; }
 return d0 ; }
 public static void SOR_validate ( final SOR X10_TEMP0 , final double gtotal ) { final double X10_TEMP1 = ( 4.5185971433257635E-5 ) ; final double X10_TEMP3 = ( gtotal - X10_TEMP1 ) ; double dev = ( Math . abs ( X10_TEMP3 ) ) ; final double X10_TEMP5 = ( 1.0e-12 ) ; final boolean X10_TEMP7 = dev > X10_TEMP5 ; if ( X10_TEMP7 ) { final String X10_TEMP9 = ( "Validation failed" ) ; System.out.println ( X10_TEMP9 ) ; final String X10_TEMP10 = ( "gtotal = " ) ; final String X10_TEMP11 = ( X10_TEMP10 + gtotal ) ; final String X10_TEMP12 = ( "  " ) ; final String X10_TEMP13 = ( X10_TEMP11 + X10_TEMP12 ) ; final String X10_TEMP15 = ( X10_TEMP13 + dev ) ; System.out.println ( X10_TEMP15 ) ; final String X10_TEMP17 = ( "Validation failed" ) ; throw new RuntimeException ( X10_TEMP17 ) ; }
 }
 public static double SOR_read ( final SOR X10_TEMP0 , final doubleRefArray2 G , final Point2 pt ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 0 ) ; final Region1 r = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; final Dist1 d = Program . getPlaceDist1 ( r , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T3 utmp3 = new T3(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread3(utmp3); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1 ( d , RX10_TEMP16 ) ; final doubleRefArray1 result = RX10_TEMP19 ; final place phere = ( here ) ; finish { final Dist2 RX10_TEMP20 = G . distValue ; final Dist2 X10_TEMP10 = RX10_TEMP20 ; final Region2 RX10_TEMP21 = X10_TEMP10 . dReg ; final int RX10_TEMP22 = Program . searchPointInRegion2 ( RX10_TEMP21 , pt ) ; final int RX10_TEMP23 = 0 ; final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; if ( RX10_TEMP24 ) { final String RX10_TEMP25 = "Point pt not found in the distribution X10_TEMP10." ; throw new RuntimeException ( RX10_TEMP25 ) ; }
 final place RX10_TEMP26 = Program . getPlaceFromDist2 ( X10_TEMP10 , RX10_TEMP22 ) ; final place X10_TEMP13 = RX10_TEMP26 ; 
 final T4 utmp4 = new T4(phere, result, pt, G);
 async (X10_TEMP13) {Program.thread4(utmp4); }
 }
 final int X10_TEMP22 = ( 0 ) ; final Point1 RX10_TEMP49 = new Point1 ( X10_TEMP22 ) ; final Dist1 RX10_TEMP50 = result . distValue ; final Region1 RX10_TEMP51 = RX10_TEMP50 . dReg ; final int RX10_TEMP52 = Program . searchPointInRegion1 ( RX10_TEMP51 , RX10_TEMP49 ) ; final int RX10_TEMP53 = 0 ; final boolean RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; if ( RX10_TEMP54 ) { String RX10_TEMP55 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP55 ) ; }
 final place RX10_TEMP56 = Program . getPlaceFromDist1 ( RX10_TEMP50 , RX10_TEMP52 ) ; final place RX10_TEMP58 = here ; final boolean RX10_TEMP59 = RX10_TEMP56 != RX10_TEMP58 ; if ( RX10_TEMP59 ) { String RX10_TEMP57 = "Bad place access for array result" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final double RX10_TEMP60 = Program . getRefArrayValue1double ( result , RX10_TEMP52 ) ; final double X10_TEMP24 = ( RX10_TEMP60 ) ; return X10_TEMP24 ; }
 public static double SOR_SORrun ( final SOR X10_TEMP0 , final double omega , final doubleRefArray2 G , final int num_iterations ) { final Dist2 RX10_TEMP0 = G . distValue ; final Dist2 X10_TEMP1 = RX10_TEMP0 ; final Region2 RX10_TEMP1 = X10_TEMP1 . dReg ; final Region2 X10_TEMP2 = RX10_TEMP1 ; final int X10_TEMP4 = ( 0 ) ; final Region1 RX10_TEMP2 = Program . getRank2 ( X10_TEMP2 , X10_TEMP4 ) ; final Region1 X10_TEMP5 = RX10_TEMP2 ; final int M = ( X10_TEMP5 . regSize ) ; final Dist2 RX10_TEMP3 = G . distValue ; final Dist2 X10_TEMP7 = RX10_TEMP3 ; final Region2 RX10_TEMP4 = X10_TEMP7 . dReg ; final Region2 X10_TEMP8 = RX10_TEMP4 ; final int X10_TEMP10 = ( 1 ) ; final Region1 RX10_TEMP5 = Program . getRank2 ( X10_TEMP8 , X10_TEMP10 ) ; final Region1 X10_TEMP11 = RX10_TEMP5 ; final int N = ( X10_TEMP11 . regSize ) ; final double X10_TEMP13 = ( 0.25 ) ; final double omega_over_four = ( omega * X10_TEMP13 ) ; final double X10_TEMP15 = ( 1.0 ) ; final double one_minus_omega = ( X10_TEMP15 - omega ) ; final int X10_TEMP17 = ( 1 ) ; final int Mm1 = ( M - X10_TEMP17 ) ; final int X10_TEMP19 = ( 1 ) ; final int Nm1 = ( N - X10_TEMP19 ) ; final int X10_TEMP24 = ( 0 ) ; final int X10_TEMP22 = ( 1 ) ; final int X10_TEMP25 = ( num_iterations - X10_TEMP22 ) ; final int X10_TEMP28 = ( 0 ) ; final int X10_TEMP29 = ( 1 ) ; final Region2 X10_TEMP31 = Program . createNewRegion2RR ( X10_TEMP24 , X10_TEMP25 , X10_TEMP28 , X10_TEMP29 ) ; final int RX10_TEMP9 = 1 ; int RX10_TEMP7 = X10_TEMP31 . regSize ; RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9 ; final region ( : rank==1 ) RX10_TEMP8 = [ 0 : RX10_TEMP7 ] ; for ( point ( : rank==1 ) RX10_TEMP6 : RX10_TEMP8 ) { final int RX10_TEMP10 = RX10_TEMP6 [0] ; final Point2 po = Program . regionOrdinalPoint2 ( X10_TEMP31 , RX10_TEMP10 ) ; finish { final int X10_TEMP47 = ( 0 ) ; final int X10_TEMP33 = ( 1 ) ; final int X10_TEMP35 = ( Mm1 - X10_TEMP33 ) ; final int X10_TEMP37 = ( 1 ) ; final int X10_TEMP38 = ( po . f1 ) ; final int X10_TEMP40 = ( X10_TEMP37 + X10_TEMP38 ) ; final int X10_TEMP42 = ( X10_TEMP35 - X10_TEMP40 ) ; final int X10_TEMP43 = ( 2 ) ; final int X10_TEMP45 = ( X10_TEMP42 / X10_TEMP43 ) ; final int X10_TEMP51 = ( 1 ) ; final int X10_TEMP49 = ( 1 ) ; final int X10_TEMP52 = ( Nm1 - X10_TEMP49 ) ; final Region2 X10_TEMP54 = Program . createNewRegion2RR ( X10_TEMP47 , X10_TEMP45 , X10_TEMP51 , X10_TEMP52 ) ; final place X10_TEMP55 = here ; final int RX10_TEMP14 = 1 ; int RX10_TEMP12 = X10_TEMP54 . regSize ; RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14 ; final region ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] ; for ( point ( : rank==1 ) RX10_TEMP11 : RX10_TEMP13 ) { final int RX10_TEMP15 = RX10_TEMP11 [0] ; final Point2 pt = Program . regionOrdinalPoint2 ( X10_TEMP54 , RX10_TEMP15 ) ; 
 final T5 utmp5 = new T5(pt, po, one_minus_omega, omega_over_four, G, X10_TEMP0);
 async (X10_TEMP55) {Program.thread5(utmp5); }
 }
 }
 }
 final double X10_TEMP120 = ( Program . doublerefArraySum2 ( G ) ) ; return X10_TEMP120 ; }
 public static long _Random_multiplier_init ( ) { final long X10_TEMP2 = ( 0x5DEECE66DL ) ; return X10_TEMP2 ; }
 public static long _Random_addend_init ( ) { final long X10_TEMP2 = ( 0xBL ) ; return X10_TEMP2 ; }
 public static long _Random_mask_init ( ) { final long X10_TEMP1 = ( 1L ) ; final int X10_TEMP2 = ( 48 ) ; final long X10_TEMP4 = ( X10_TEMP1 << X10_TEMP2 ) ; final int X10_TEMP5 = ( 1 ) ; final long X10_TEMP7 = ( X10_TEMP4 - X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static int Random_nextbits ( final Random X10_TEMP0 , final int bits ) { long oldseed = ( X10_TEMP0 . seed ) ; final long X10_TEMP2 = ( oldseed * _Random_multiplier ) ; final long X10_TEMP4 = ( X10_TEMP2 + _Random_addend ) ; long nextseed = ( X10_TEMP4 & _Random_mask ) ; final long X10_TEMP7 = ( nextseed ) ; X10_TEMP0 . seed = ( X10_TEMP7 ) ; final int X10_TEMP8 = ( 48 ) ; final int X10_TEMP10 = ( X10_TEMP8 - bits ) ; final long X10_TEMP12 = ( nextseed >>> X10_TEMP10 ) ; final int X10_TEMP14 = ( ( int ) X10_TEMP12 ) ; return X10_TEMP14 ; }
 public static int Random_nextInt ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 32 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; return X10_TEMP4 ; }
 public static long Random_nextLong ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 32 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final long X10_TEMP5 = ( ( long ) X10_TEMP4 ) ; final int X10_TEMP6 = ( 32 ) ; final long X10_TEMP8 = ( X10_TEMP5 << X10_TEMP6 ) ; final int X10_TEMP10 = ( 32 ) ; final int X10_TEMP11 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ) ; final long X10_TEMP13 = ( X10_TEMP8 + X10_TEMP11 ) ; return X10_TEMP13 ; }
 public static boolean Random_nextBoolean ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 1 ) ; final int X10_TEMP3 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final int X10_TEMP4 = ( 0 ) ; final boolean X10_TEMP6 = ( X10_TEMP3 != X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static double Random_nextDouble ( final Random X10_TEMP0 ) { final int X10_TEMP2 = ( 26 ) ; final int X10_TEMP4 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ) ; final long X10_TEMP5 = ( ( long ) X10_TEMP4 ) ; final int X10_TEMP6 = ( 27 ) ; final long X10_TEMP8 = ( X10_TEMP5 << X10_TEMP6 ) ; final int X10_TEMP10 = ( 27 ) ; final int X10_TEMP11 = ( Program . Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ) ; final long X10_TEMP13 = ( X10_TEMP8 + X10_TEMP11 ) ; final long X10_TEMP14 = ( 1L ) ; final int X10_TEMP15 = ( 53 ) ; final long X10_TEMP17 = ( X10_TEMP14 << X10_TEMP15 ) ; final double X10_TEMP18 = ( ( double ) X10_TEMP17 ) ; final double X10_TEMP20 = ( X10_TEMP13 / X10_TEMP18 ) ; return X10_TEMP20 ; }
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
 public static double doublerefArraySum2 ( final doubleRefArray2 sumArray ) { final int maxPlaces = place.MAX_PLACES ; final int one = 1 ; final int zero = 0 ; final int maxPlacesMinusOne = maxPlaces - one ; final Region1 dReg = Program . createNewRegion1R ( zero , maxPlacesMinusOne ) ; final place source = here ; final Dist1 dSum = Program . getPlaceDist1 ( dReg , source ) ; final double initVal = 0 ; final Region1 RX10_TEMP0 = dSum . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dSum , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T6 utmp6 = new T6(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6, initVal);
 async (RX10_TEMP10) {Program.thread6(utmp6); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( dSum , RX10_TEMP17 ) ; final doubleRefArray1 localSumArray = RX10_TEMP20 ; final Dist1 dUnique = Program . getUniqueDist ( ) ; finish { final Region1 RX10_TEMP22 = dUnique . dReg ; final int RX10_TEMP25 = 1 ; int RX10_TEMP23 = RX10_TEMP22 . regSize ; RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; final region ( : rank==1 ) RX10_TEMP24 = [ 0 : RX10_TEMP23 ] ; for ( point ( : rank==1 ) RX10_TEMP21 : RX10_TEMP24 ) { final int RX10_TEMP26 = RX10_TEMP21 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP22 , RX10_TEMP26 ) ; final Region1 RX10_TEMP27 = dUnique . dReg ; final int RX10_TEMP28 = Program . searchPointInRegion1 ( RX10_TEMP27 , p ) ; final int RX10_TEMP29 = 0 ; final boolean RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29 ; if ( RX10_TEMP30 ) { final String RX10_TEMP31 = "Point p not found in the distribution dUnique." ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final place RX10_TEMP32 = Program . getPlaceFromDist1 ( dUnique , RX10_TEMP28 ) ; final place nthPlace = RX10_TEMP32 ; 
 final T7 utmp7 = new T7(localSumArray, source, zero, sumArray);
 async (nthPlace) {Program.thread7(utmp7); }
 }
 }
 double globalSum = 0 ; final Dist1 RX10_TEMP63 = localSumArray . distValue ; final Region1 RX10_TEMP64 = RX10_TEMP63 . dReg ; final int RX10_TEMP67 = 1 ; int RX10_TEMP65 = RX10_TEMP64 . regSize ; RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67 ; final region ( : rank==1 ) RX10_TEMP66 = [ 0 : RX10_TEMP65 ] ; for ( point ( : rank==1 ) RX10_TEMP62 : RX10_TEMP66 ) { final int RX10_TEMP68 = RX10_TEMP62 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP68 ) ; final Dist1 RX10_TEMP69 = localSumArray . distValue ; final Region1 RX10_TEMP70 = RX10_TEMP69 . dReg ; final int RX10_TEMP71 = Program . searchPointInRegion1 ( RX10_TEMP70 , p ) ; final int RX10_TEMP72 = 0 ; final boolean RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72 ; if ( RX10_TEMP73 ) { String RX10_TEMP74 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP74 ) ; }
 final place RX10_TEMP75 = Program . getPlaceFromDist1 ( RX10_TEMP69 , RX10_TEMP71 ) ; final place RX10_TEMP77 = here ; final boolean RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77 ; if ( RX10_TEMP78 ) { String RX10_TEMP76 = "Bad place access for array localSumArray" ; throw new RuntimeException ( RX10_TEMP76 ) ; }
 final double RX10_TEMP79 = Program . getRefArrayValue1double ( localSumArray , RX10_TEMP71 ) ; final double localSumCurr = RX10_TEMP79 ; globalSum = globalSum + localSumCurr ; }
 return globalSum ; }
 public static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; }
 public static void setRefArrayValue2double ( final doubleRefArray2 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
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
 public static void setRefArrayValue1double ( final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 getUniqueDist ( ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int rSize = maxPlaces - one ; final region ( : rank==1 ) placeRegion = [ 0 : rSize ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ placeRegion ] ( point ( : rank==1 ) p ) { final int i = p [0] ; final place pl1 = place.places ( i ) ; return pl1 ; }
 ) ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final Region1 reg = new Region1 ( pointArray , maxPlaces , zero , maxPlaces ) ; final Dist pointDist1 = new Dist ( vPlaceArray , maxPlaces ) ; final Dist1 retDist = new Dist1 ( reg , pointDist1 ) ; return retDist ; }
 public static place getPlaceFromDist1 ( final Dist1 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static place getPlaceFromDist2 ( final Dist2 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static int comparePoint1 ( final Point1 pt1 , final Point1 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static int comparePoint2 ( final Point2 pt1 , final Point2 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 point1 = pt1 . f1 ; point2 = pt2 . f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static Region1 getRank2 ( final Region2 r , final int dim ) { final int zero = 0 ; final int regRank = 2 ; final boolean cond1 = dim >= regRank ; final boolean cond2 = dim < zero ; final boolean invalidRank = cond1 || cond2 ; if ( invalidRank ) { final String errorMsgHeader = "Invalid dimension for rank projection. Got " ; final String errorMsgTrailer = ", expected value between 0 and 2" ; String errorMsg = errorMsgHeader + dim ; errorMsg = errorMsg + errorMsgTrailer ; throw new RuntimeException ( errorMsg ) ; }
 final boolean regType = r . regType ; if ( regType ) { final Region1 regularRank = Program . getRankRegular2 ( r , dim ) ; return regularRank ; }
 final Region1 arbitraryRank = Program . getRankArbitrary2 ( r , dim ) ; return arbitraryRank ; }
 public static Region1 getRankArbitrary2 ( final Region2 r , final int dim ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; final int minusOne = zero - one ; final int proj0 = 0 ; final int proj1 = 1 ; Point2 value [ : rank==1 ] regArr = r . pointArray ; final int regSize = r . regSize ; final int regSizeMinusOne = regSize - one ; final region ( : rank==1 ) regArrRegion = [ 0 : regSizeMinusOne ] ; final dist ( : rank==1 ) distArrRegion = [ 0 : regSizeMinusOne ] -> here ; int maxIndex = minusOne ; int minIndex = zero ; boolean isFirstMinIndex = true ; for ( point ( : rank==1 ) p : regArrRegion ) { final int idx = p [0] ; switch ( dim ) { case proj0 : { final Point2 tempPt = regArr [ idx ] ; final int crd = tempPt . f0 ; final boolean isMax = crd >= maxIndex ; if ( isMax ) { maxIndex = crd ; }
 final boolean lt = crd <= minIndex ; final boolean isMin = lt || isFirstMinIndex ; if ( isMin ) { isFirstMinIndex = false ; minIndex = crd ; }
 break ; }
 case proj1 : { final Point2 tempPt = regArr [ idx ] ; final int crd = tempPt . f1 ; final boolean isMax = crd >= maxIndex ; if ( isMax ) { maxIndex = crd ; }
 final boolean lt = crd <= minIndex ; final boolean isMin = lt || isFirstMinIndex ; if ( isMin ) { isFirstMinIndex = false ; minIndex = crd ; }
 break ; }
 } }
 final int regIndexSizeMinusOne = maxIndex - minIndex ; final int regIndexSize = regIndexSizeMinusOne + one ; final region ( : rank==1 ) regIndexRegion = [ 0 : regIndexSizeMinusOne ] ; final dist ( : rank==1 ) regIndexDist = [ 0 : regIndexSizeMinusOne ] -> here ; final int [ : rank==1 ] indexArr = ( int [ : rank==1 ] ) ( new int [ regIndexDist ] ( point ( : rank==1 ) p ) { return zero ; }
 ) ; for ( point ( : rank==1 ) p : regArrRegion ) { final int idx = p [0] ; switch ( dim ) { case proj0 : { final Point2 tempPt = regArr [ idx ] ; final int crd = tempPt . f0 ; final int newRegIndex = crd - minIndex ; indexArr [ newRegIndex ] = ( one ) ; break ; }
 case proj1 : { final Point2 tempPt = regArr [ idx ] ; final int crd = tempPt . f1 ; final int newRegIndex = crd - minIndex ; indexArr [ newRegIndex ] = ( one ) ; break ; }
 } }
 int newRegSize = 0 ; for ( point ( : rank==1 ) p : regIndexRegion ) { final int hit = indexArr [ p ] ; newRegSize = newRegSize + hit ; }
 final boolean isRegular = newRegSize == regIndexSize ; if ( isRegular ) { final region ( : rank==1 ) regRegularRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regRegularRegion ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , regIndexSize , minIndex , regIndexSize ) ; return retRegRegular ; }
 final int newRegSizeMinusOne = newRegSize - one ; final region ( : rank==1 ) newRegRegion = [ 0 : newRegSizeMinusOne ] ; final dist ( : rank==1 ) newRegDist = [ 0 : newRegSizeMinusOne ] -> here ; final Point1 [ : rank==1 ] indexPointArr = ( Point1 [ : rank==1 ] ) ( new Point1 [ newRegDist ] ) ; int newArrIndex = 0 ; for ( point ( : rank==1 ) p : regIndexRegion ) { final int indx = indexArr [ p ] ; final boolean isOne = indx == one ; if ( isOne ) { final int idx = p [0] ; final int pointValue = idx + minIndex ; final Point1 tempPoint = new Point1 ( pointValue ) ; indexPointArr [ newArrIndex ] = ( tempPoint ) ; newArrIndex = newArrIndex + one ; }
 }
 final Point1 value [ : rank==1 ] indexPointValueArr = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ newRegRegion ] ( point ( : rank==1 ) p ) { final Point1 pt = indexPointArr [ p ] ; return pt ; }
 ) ; final Region1 retRegArbitrary = new Region1 ( indexPointValueArr , regIndexSize ) ; return retRegArbitrary ; }
 public static Region1 getRankRegular2 ( final Region2 r , final int dim ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final int proj0 = 0 ; final int proj1 = 1 ; int low0 = 0 ; int dim0 = 0 ; switch ( dim ) { case proj0 : { low0 = r . low0 ; dim0 = r . dim0 ; break ; }
 case proj1 : { low0 = r . low1 ; dim0 = r . dim1 ; break ; }
 } final Region1 retRegRegular = new Region1 ( pointArray , dim0 , low0 , dim0 ) ; return retRegRegular ; }
 public static Point2 regionOrdinalPoint2 ( final Region2 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point2 pt = Program . regionOrdinalPointRegular2 ( reg , ordl ) ; return pt ; }
 final Point2 pt = Program . regionOrdinalPointArbitrary2 ( reg , ordl ) ; return pt ; }
 public static Point2 regionOrdinalPointRegular2 ( final Region2 reg , final int ordl ) { final int stride2 = 1 ; final int dim2 = reg . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg . low1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f2 = ordl / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 pt = new Point2 ( f1 , f2 ) ; return pt ; }
 public static Point2 regionOrdinalPointArbitrary2 ( final Region2 reg , final int ordl ) { final Point2 value [ : rank==1 ] pointArray = reg . pointArray ; final Point2 pt = pointArray [ ordl ] ; return pt ; }
 public static Point1 regionOrdinalPoint1 ( final Region1 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point1 pt = Program . regionOrdinalPointRegular1 ( reg , ordl ) ; return pt ; }
 final Point1 pt = Program . regionOrdinalPointArbitrary1 ( reg , ordl ) ; return pt ; }
 public static Point1 regionOrdinalPointRegular1 ( final Region1 reg , final int ordl ) { final int stride1 = 1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 pt = new Point1 ( f1 ) ; return pt ; }
 public static Point1 regionOrdinalPointArbitrary1 ( final Region1 reg , final int ordl ) { final Point1 value [ : rank==1 ] pointArray = reg . pointArray ; final Point1 pt = pointArray [ ordl ] ; return pt ; }
 public static double getRefArrayValue1double ( final doubleRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
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
 public static Dist2 unionDist2 ( final Dist2 d1 , final Dist2 d2 ) { int index1 = 0 ; int index2 = 0 ; int index = 0 ; final int zero = 0 ; final int one = 1 ; final Region2 reg1 = d1 . dReg ; final Region2 reg2 = d2 . dReg ; final boolean regType1 = reg1 . regType ; final boolean regType2 = reg2 . regType ; Point2 value [ : rank==1 ] tempArr1 = reg1 . pointArray ; Point2 value [ : rank==1 ] tempArr2 = reg2 . pointArray ; if ( regType1 ) { final int stride2 = 1 ; final int dim2 = reg1 . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg1 . low1 ; final int dim1 = reg1 . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg1 . low0 ; final int regSize1 = reg1 . regSize ; final int sizeMinusOne = regSize1 - one ; final region ( : rank==1 ) regArr = [ 0 : sizeMinusOne ] ; tempArr1 = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; }
 ) ; }
 if ( regType2 ) { final int stride2 = 1 ; final int dim2 = reg2 . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg2 . low1 ; final int dim1 = reg2 . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg2 . low0 ; final int regSize2 = reg2 . regSize ; final int sizeMinusOne = regSize2 - one ; final region ( : rank==1 ) regArr = [ 0 : sizeMinusOne ] ; tempArr2 = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; }
 ) ; }
 final Point2 value [ : rank==1 ] arr1 = tempArr1 ; final Point2 value [ : rank==1 ] arr2 = tempArr2 ; final Dist dDist1 = d1 . dDist ; final place value [ : rank==1 ] dPlaceArray1 = dDist1 . placeArray ; final Dist dDist2 = d2 . dDist ; final place value [ : rank==1 ] dPlaceArray2 = dDist2 . placeArray ; final int size1 = reg1 . regSize ; final int size2 = reg2 . regSize ; final int rSize = size1 + size2 ; final int sizeMinusOne = rSize - one ; final region ( : rank==1 ) tempReg = [ 0 : sizeMinusOne ] ; final dist ( : rank==1 ) tempDist = [ 0 : sizeMinusOne ] -> here ; final Point2 [ : rank==1 ] tempArr = new Point2 [ tempDist ] ; final place [ : rank==1 ] placeArray = ( place [ : rank==1 ] ) ( new place [ tempDist ] ) ; boolean cond1 = index1 < size1 ; boolean cond2 = index2 < size2 ; boolean cond = cond1 && cond2 ; while ( cond ) { final Point2 p1 = arr1 [ index1 ] ; final Point2 p2 = arr2 [ index2 ] ; final int pointCompare = Program . comparePoint2 ( p1 , p2 ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { final String errMsg = "Non-disjoint region in a disjoint union" ; throw new RuntimeException ( errMsg ) ; }
 if ( lt ) { tempArr [ index ] = ( p1 ) ; final place pPlace = dPlaceArray1 [ index1 ] ; placeArray [ index ] = ( pPlace ) ; index1 = index1 + one ; }
 else { tempArr [ index ] = ( p2 ) ; final place pPlace = dPlaceArray2 [ index2 ] ; placeArray [ index ] = ( pPlace ) ; index2 = index2 + one ; }
 index = index + one ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; }
 cond1 = index1 < size1 ; while ( cond1 ) { final Point2 tempArrPt = arr1 [ index1 ] ; tempArr [ index ] = ( tempArrPt ) ; final place pPlace = dPlaceArray1 [ index1 ] ; placeArray [ index ] = ( pPlace ) ; index1 = index1 + one ; index = index + one ; cond1 = index1 < size1 ; }
 cond2 = index2 < size2 ; while ( cond2 ) { final Point2 tempArrPt = arr2 [ index2 ] ; tempArr [ index ] = ( tempArrPt ) ; final place pPlace = dPlaceArray2 [ index2 ] ; placeArray [ index ] = ( pPlace ) ; index2 = index2 + one ; index = index + one ; cond2 = index2 < size2 ; }
 final Point2 value [ : rank==1 ] arr = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ tempReg ] ( point ( : rank==1 ) pt ) { final Point2 retPoint = tempArr [ pt ] ; return retPoint ; }
 ) ; final Region2 unionReg = new Region2 ( arr , rSize ) ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist2 unionDist = new Dist2 ( unionReg , pointDist ) ; return unionDist ; }
 public static void getCyclic ( final place [ : rank==1 ] placeArray , final int arraySize , final place initPlace , final int blockSize ) { final int zero = 0 ; final int one = 1 ; int N = arraySize ; int chunk = blockSize ; final boolean ifCond = blockSize > N ; if ( ifCond ) { chunk = N ; }
 int index = 0 ; int dSize = index + chunk ; dSize = dSize - one ; final region ( : rank==1 ) pointReg = [ 0 : dSize ] ; for ( point ( : rank==1 ) p : pointReg ) { placeArray [ p ] = ( initPlace ) ; }
 index = index + chunk ; N = N - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = N != zero ; while ( whileCond ) { final boolean tailCond = chunk > N ; if ( tailCond ) { dSize = index + N ; dSize = dSize - one ; final int ub = N - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 N = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; N = N - chunk ; }
 pl = pl . next ( ) ; whileCond = N != zero ; }
 }
 public static int getDistLocalCount2 ( final Dist2 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static int getDistLocalCount1 ( final Dist1 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static int searchPointInRegion2 ( final Region2 r , final Point2 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion2 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion2 ( r , target ) ; return binarySearch ; }
 public static int searchPointInRegion1 ( final Region1 r , final Point1 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion1 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion1 ( r , target ) ; return binarySearch ; }
 public static double getRefArrayValue2double ( final doubleRefArray2 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static Dist2 getPlaceDist2 ( final Region2 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist2 retDist = new Dist2 ( r , pointDist ) ; return retDist ; }
 public static Dist1 getPlaceDist1 ( final Region1 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist ) ; return retDist ; }
 public static Dist2 restrictDist2 ( final Dist2 dn , final place p ) { final Region2 r = dn . dReg ; final boolean regType = r . regType ; if ( regType ) { final Dist2 regDist = Program . restrictDistRegular2 ( dn , p ) ; return regDist ; }
 final Dist2 arbDist = Program . restrictDistArbitrary2 ( dn , p ) ; return arbDist ; }
 public static Dist2 restrictDistRegular2 ( final Dist2 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region2 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final int stride2 = 1 ; final int dim2 = dReg . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = dReg . low1 ; final int dim1 = dReg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = dReg . low0 ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; int f2 = idx / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = idx / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 dpt = new Point2 ( f1 , f2 ) ; return dpt ; }
 ) ; final Region2 dpReg = new Region2 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist2 dpDistn = new Dist2 ( dpReg , dpDist ) ; return dpDistn ; }
 public static Dist2 restrictDistArbitrary2 ( final Dist2 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region2 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final Point2 value [ : rank==1 ] dArray = ( Point2 value [ : rank==1 ] ) ( dReg . pointArray ) ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; final Point2 dpt = dArray [ idx ] ; return dpt ; }
 ) ; final Region2 dpReg = new Region2 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist2 dpDistn = new Dist2 ( dpReg , dpDist ) ; return dpDistn ; }
 public static int value [ : rank==1 ] initDist ( final int [ : rank==1 ] tempArr , final region ( : rank==1 ) tempReg ) { final int value [ : rank==1 ] vTemp = ( int value [ : rank==1 ] ) ( new int value [ tempReg ] ( point ( : rank==1 ) p ) { final int tempInt = tempArr [ p ] ; return tempInt ; }
 ) ; return vTemp ; }
 public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint = new Point1 ( f1 ) ; return retPoint ; }
 ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; }
 }
 public static Region2 createNewRegion2RR ( final int v1_0 , final int v1_1 , final int v2_0 , final int v2_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; final boolean tempBool2 = true ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int l2 = v2_1 - v2_0 ; final int dim2 = l2 + one ; final int stride2 = 1 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegEmpty = new Region2 ( ptArray , stride0 , zero , zero , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegRegular = new Region2 ( ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + v2_0 ; final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; }
 ) ; final Region2 retReg = new Region2 ( ptArray , stride0 ) ; return retReg ; }
 }
 public static Region2 createNewRegion2AA ( final Region1 v1_0 , final Region1 v2_0 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = v1_0 . regType ; final boolean tempBool2 = v2_0 . regType ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; final int l1 = v1_0 . regSize ; final int dim1 = l1 ; final int l2 = v2_0 . regSize ; final int dim2 = l2 ; final int stride2 = 1 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegEmpty = new Region2 ( ptArray , stride0 , zero , zero , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final int low1 = v1_0 . low0 ; final int low2 = v2_0 . low0 ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; }
 ) ; final Region2 retRegRegular = new Region2 ( ptArray , stride0 , low1 , dim1 , low2 , dim2 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; if ( tempBool1 ) { final int low1 = v1_0 . low0 ; f1 = f1 + low1 ; }
 else { final Point1 value [ : rank==1 ] rArray1 = v1_0 . pointArray ; final Point1 rArrayPt1 = rArray1 [ f1 ] ; f1 = rArrayPt1 . f0 ; }
 int f2 = p / stride2 ; f2 = f2 % dim2 ; if ( tempBool2 ) { final int low2 = v2_0 . low0 ; f2 = f2 + low2 ; }
 else { final Point1 value [ : rank==1 ] rArray2 = v2_0 . pointArray ; final Point1 rArrayPt2 = rArray2 [ f2 ] ; f2 = rArrayPt2 . f0 ; }
 final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; }
 ) ; final Region2 retReg = new Region2 ( ptArray , stride0 ) ; return retReg ; }
 }

 public static void thread1(final T1 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; 
 final T11 utmp11 = new T11(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread11(utmp11); }
 }
 }
 public static void thread2(final T2 utmpz) {final  double v = utmpz.v;
final  Point2 p = utmpz.p;
final  doubleRefArray2 t = utmpz.t;
 { final double X10_TEMP7 = ( v ) ; final Dist2 RX10_TEMP7 = t . distValue ; final Region2 RX10_TEMP8 = RX10_TEMP7 . dReg ; final int RX10_TEMP9 = Program . searchPointInRegion2 ( RX10_TEMP8 , p ) ; final int RX10_TEMP10 = 0 ; final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; if ( RX10_TEMP11 ) { String RX10_TEMP12 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP12 ) ; }
 final place RX10_TEMP13 = Program . getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; final place RX10_TEMP15 = here ; final boolean RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP14 = "Bad place access for array t" ; throw new RuntimeException ( RX10_TEMP14 ) ; }
 Program . setRefArrayValue2double ( t , RX10_TEMP9 , X10_TEMP7 ) ; }
 }
 public static void thread3(final T3 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; 
 final T12 utmp12 = new T12(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread12(utmp12); }
 }
 }
 public static void thread4(final T4 utmpz) {final  place phere = utmpz.phere;
final  doubleRefArray1 result = utmpz.result;
final  Point2 pt = utmpz.pt;
final  doubleRefArray2 G = utmpz.G;
 { final Dist2 RX10_TEMP27 = G . distValue ; final Region2 RX10_TEMP28 = RX10_TEMP27 . dReg ; final int RX10_TEMP29 = Program . searchPointInRegion2 ( RX10_TEMP28 , pt ) ; final int RX10_TEMP30 = 0 ; final boolean RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; if ( RX10_TEMP31 ) { String RX10_TEMP32 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 final place RX10_TEMP33 = Program . getPlaceFromDist2 ( RX10_TEMP27 , RX10_TEMP29 ) ; final place RX10_TEMP35 = here ; final boolean RX10_TEMP36 = RX10_TEMP33 != RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP34 = "Bad place access for array G" ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final double RX10_TEMP37 = Program . getRefArrayValue2double ( G , RX10_TEMP29 ) ; final double val = ( RX10_TEMP37 ) ; 
 final T13 utmp13 = new T13(val, result);
 async (phere) {Program.thread13(utmp13); }
 }
 }
 public static void thread5(final T5 utmpz) {final  Point2 pt = utmpz.pt;
final  Point2 po = utmpz.po;
final  double one_minus_omega = utmpz.one_minus_omega;
final  double omega_over_four = utmpz.omega_over_four;
final  doubleRefArray2 G = utmpz.G;
final  SOR X10_TEMP0 = utmpz.X10_TEMP0;
 { int X10_TEMP58 = ( 2 ) ; int X10_TEMP59 = ( 1 ) ; int RX10_TEMP16 = pt . f0 ; int RX10_TEMP17 = pt . f1 ; RX10_TEMP16 = RX10_TEMP16 * X10_TEMP58 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP59 ; final Point2 X10_TEMP65 = ( new Point2 ( RX10_TEMP16 , RX10_TEMP17 ) ) ; final int X10_TEMP61 = ( 1 ) ; final int X10_TEMP62 = ( po . f1 ) ; int X10_TEMP66 = ( X10_TEMP61 + X10_TEMP62 ) ; int X10_TEMP67 = ( 0 ) ; int RX10_TEMP18 = X10_TEMP65 . f0 ; int RX10_TEMP19 = X10_TEMP65 . f1 ; RX10_TEMP18 = RX10_TEMP18 + X10_TEMP66 ; RX10_TEMP19 = RX10_TEMP19 + X10_TEMP67 ; final Point2 ij = ( new Point2 ( RX10_TEMP18 , RX10_TEMP19 ) ) ; finish { final Dist2 RX10_TEMP20 = G . distValue ; final Dist2 X10_TEMP69 = RX10_TEMP20 ; final Region2 RX10_TEMP21 = X10_TEMP69 . dReg ; final int RX10_TEMP22 = Program . searchPointInRegion2 ( RX10_TEMP21 , ij ) ; final int RX10_TEMP23 = 0 ; final boolean RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; if ( RX10_TEMP24 ) { final String RX10_TEMP25 = "Point ij not found in the distribution X10_TEMP69." ; throw new RuntimeException ( RX10_TEMP25 ) ; }
 final place RX10_TEMP26 = Program . getPlaceFromDist2 ( X10_TEMP69 , RX10_TEMP22 ) ; final place X10_TEMP72 = RX10_TEMP26 ; 
 final T14 utmp14 = new T14(ij, one_minus_omega, omega_over_four, G, X10_TEMP0);
 async (X10_TEMP72) {Program.thread14(utmp14); }
 }
 }
 }
 public static void thread6(final T6 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
final  double initVal = utmpz.initVal;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { return initVal ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T15 utmp15 = new T15(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread15(utmp15); }
 }
 }
 public static void thread7(final T7 utmpz) {final  doubleRefArray1 localSumArray = utmpz.localSumArray;
final  place source = utmpz.source;
final  int zero = utmpz.zero;
final  doubleRefArray2 sumArray = utmpz.sumArray;
 { double localSumTemp = 0 ; final place thisPlace = here ; final Dist2 RX10_TEMP33 = sumArray . distValue ; final Dist2 sumArrayDist = RX10_TEMP33 ; final Dist2 sumArrayDistHere = Program . restrictDist2 ( sumArrayDist , thisPlace ) ; final Region2 RX10_TEMP35 = sumArrayDistHere . dReg ; final int RX10_TEMP38 = 1 ; int RX10_TEMP36 = RX10_TEMP35 . regSize ; RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; final region ( : rank==1 ) RX10_TEMP37 = [ 0 : RX10_TEMP36 ] ; for ( point ( : rank==1 ) RX10_TEMP34 : RX10_TEMP37 ) { final int RX10_TEMP39 = RX10_TEMP34 [0] ; final Point2 pt = Program . regionOrdinalPoint2 ( RX10_TEMP35 , RX10_TEMP39 ) ; final Dist2 RX10_TEMP40 = sumArray . distValue ; final Region2 RX10_TEMP41 = RX10_TEMP40 . dReg ; final int RX10_TEMP42 = Program . searchPointInRegion2 ( RX10_TEMP41 , pt ) ; final int RX10_TEMP43 = 0 ; final boolean RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43 ; if ( RX10_TEMP44 ) { String RX10_TEMP45 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP45 ) ; }
 final place RX10_TEMP46 = Program . getPlaceFromDist2 ( RX10_TEMP40 , RX10_TEMP42 ) ; final place RX10_TEMP48 = here ; final boolean RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP47 = "Bad place access for array sumArray" ; throw new RuntimeException ( RX10_TEMP47 ) ; }
 final double RX10_TEMP50 = Program . getRefArrayValue2double ( sumArray , RX10_TEMP42 ) ; final double localSumCurr = RX10_TEMP50 ; localSumTemp = localSumTemp + localSumCurr ; }
 final boolean isNotEqual = localSumTemp != zero ; if ( isNotEqual ) { final int index = thisPlace . id ; final double localSum = localSumTemp ; 
 final T16 utmp16 = new T16(localSum, index, localSumArray);
 async (source) {Program.thread16(utmp16); }
 }
 }
 }
 public static void thread11(final T11 utmpz) {final  doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread12(final T12 utmpz) {final  doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread13(final T13 utmpz) {final  double val = utmpz.val;
final  doubleRefArray1 result = utmpz.result;
 { final int X10_TEMP18 = ( 0 ) ; final double X10_TEMP20 = ( val ) ; final Point1 RX10_TEMP38 = new Point1 ( X10_TEMP18 ) ; final Dist1 RX10_TEMP39 = result . distValue ; final Region1 RX10_TEMP40 = RX10_TEMP39 . dReg ; final int RX10_TEMP41 = Program . searchPointInRegion1 ( RX10_TEMP40 , RX10_TEMP38 ) ; final int RX10_TEMP42 = 0 ; final boolean RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP44 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP44 ) ; }
 final place RX10_TEMP45 = Program . getPlaceFromDist1 ( RX10_TEMP39 , RX10_TEMP41 ) ; final place RX10_TEMP47 = here ; final boolean RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP46 = "Bad place access for array result" ; throw new RuntimeException ( RX10_TEMP46 ) ; }
 Program . setRefArrayValue1double ( result , RX10_TEMP41 , X10_TEMP20 ) ; }
 }
 public static void thread14(final T14 utmpz) {final  Point2 ij = utmpz.ij;
final  double one_minus_omega = utmpz.one_minus_omega;
final  double omega_over_four = utmpz.omega_over_four;
final  doubleRefArray2 G = utmpz.G;
final  SOR X10_TEMP0 = utmpz.X10_TEMP0;
 { final int X10_TEMP75 = ( 1 ) ; final int X10_TEMP76 = 0 ; int X10_TEMP79 = ( X10_TEMP76 - X10_TEMP75 ) ; int X10_TEMP80 = ( 0 ) ; int RX10_TEMP27 = ij . f0 ; int RX10_TEMP28 = ij . f1 ; RX10_TEMP27 = RX10_TEMP27 + X10_TEMP79 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP80 ; final Point2 X10_TEMP82 = ( new Point2 ( RX10_TEMP27 , RX10_TEMP28 ) ) ; final double X10_TEMP90 = ( Program . SOR_read ( X10_TEMP0 , G , X10_TEMP82 ) ) ; int X10_TEMP86 = ( 1 ) ; int X10_TEMP87 = ( 0 ) ; int RX10_TEMP29 = ij . f0 ; int RX10_TEMP30 = ij . f1 ; RX10_TEMP29 = RX10_TEMP29 + X10_TEMP86 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP87 ; final Point2 X10_TEMP89 = ( new Point2 ( RX10_TEMP29 , RX10_TEMP30 ) ) ; final double X10_TEMP91 = ( Program . SOR_read ( X10_TEMP0 , G , X10_TEMP89 ) ) ; final double X10_TEMP100 = ( X10_TEMP90 + X10_TEMP91 ) ; int X10_TEMP96 = ( 0 ) ; final int X10_TEMP93 = ( 1 ) ; final int X10_TEMP94 = 0 ; int X10_TEMP97 = ( X10_TEMP94 - X10_TEMP93 ) ; int RX10_TEMP31 = ij . f0 ; int RX10_TEMP32 = ij . f1 ; RX10_TEMP31 = RX10_TEMP31 + X10_TEMP96 ; RX10_TEMP32 = RX10_TEMP32 + X10_TEMP97 ; final Point2 X10_TEMP99 = ( new Point2 ( RX10_TEMP31 , RX10_TEMP32 ) ) ; final Dist2 RX10_TEMP33 = G . distValue ; final Region2 RX10_TEMP34 = RX10_TEMP33 . dReg ; final int RX10_TEMP35 = Program . searchPointInRegion2 ( RX10_TEMP34 , X10_TEMP99 ) ; final int RX10_TEMP36 = 0 ; final boolean RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; if ( RX10_TEMP37 ) { String RX10_TEMP38 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP38 ) ; }
 final place RX10_TEMP39 = Program . getPlaceFromDist2 ( RX10_TEMP33 , RX10_TEMP35 ) ; final place RX10_TEMP41 = here ; final boolean RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; if ( RX10_TEMP42 ) { String RX10_TEMP40 = "Bad place access for array G" ; throw new RuntimeException ( RX10_TEMP40 ) ; }
 final double RX10_TEMP43 = Program . getRefArrayValue2double ( G , RX10_TEMP35 ) ; final double X10_TEMP101 = ( RX10_TEMP43 ) ; final double X10_TEMP108 = ( X10_TEMP100 + X10_TEMP101 ) ; int X10_TEMP104 = ( 0 ) ; int X10_TEMP105 = ( 1 ) ; int RX10_TEMP44 = ij . f0 ; int RX10_TEMP45 = ij . f1 ; RX10_TEMP44 = RX10_TEMP44 + X10_TEMP104 ; RX10_TEMP45 = RX10_TEMP45 + X10_TEMP105 ; final Point2 X10_TEMP107 = ( new Point2 ( RX10_TEMP44 , RX10_TEMP45 ) ) ; final Dist2 RX10_TEMP46 = G . distValue ; final Region2 RX10_TEMP47 = RX10_TEMP46 . dReg ; final int RX10_TEMP48 = Program . searchPointInRegion2 ( RX10_TEMP47 , X10_TEMP107 ) ; final int RX10_TEMP49 = 0 ; final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP51 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final place RX10_TEMP52 = Program . getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 ) ; final place RX10_TEMP54 = here ; final boolean RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; if ( RX10_TEMP55 ) { String RX10_TEMP53 = "Bad place access for array G" ; throw new RuntimeException ( RX10_TEMP53 ) ; }
 final double RX10_TEMP56 = Program . getRefArrayValue2double ( G , RX10_TEMP48 ) ; final double X10_TEMP109 = ( RX10_TEMP56 ) ; final double X10_TEMP111 = ( X10_TEMP108 + X10_TEMP109 ) ; final double X10_TEMP114 = ( omega_over_four * X10_TEMP111 ) ; final Dist2 RX10_TEMP57 = G . distValue ; final Region2 RX10_TEMP58 = RX10_TEMP57 . dReg ; final int RX10_TEMP59 = Program . searchPointInRegion2 ( RX10_TEMP58 , ij ) ; final int RX10_TEMP60 = 0 ; final boolean RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP62 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP62 ) ; }
 final place RX10_TEMP63 = Program . getPlaceFromDist2 ( RX10_TEMP57 , RX10_TEMP59 ) ; final place RX10_TEMP65 = here ; final boolean RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65 ; if ( RX10_TEMP66 ) { String RX10_TEMP64 = "Bad place access for array G" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final double RX10_TEMP67 = Program . getRefArrayValue2double ( G , RX10_TEMP59 ) ; final double X10_TEMP113 = ( RX10_TEMP67 ) ; final double X10_TEMP115 = ( one_minus_omega * X10_TEMP113 ) ; final double X10_TEMP117 = ( X10_TEMP114 + X10_TEMP115 ) ; final double X10_TEMP118 = ( X10_TEMP117 ) ; final Dist2 RX10_TEMP68 = G . distValue ; final Region2 RX10_TEMP69 = RX10_TEMP68 . dReg ; final int RX10_TEMP70 = Program . searchPointInRegion2 ( RX10_TEMP69 , ij ) ; final int RX10_TEMP71 = 0 ; final boolean RX10_TEMP72 = RX10_TEMP70 < RX10_TEMP71 ; if ( RX10_TEMP72 ) { String RX10_TEMP73 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP73 ) ; }
 final place RX10_TEMP74 = Program . getPlaceFromDist2 ( RX10_TEMP68 , RX10_TEMP70 ) ; final place RX10_TEMP76 = here ; final boolean RX10_TEMP77 = RX10_TEMP74 != RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP75 = "Bad place access for array G" ; throw new RuntimeException ( RX10_TEMP75 ) ; }
 Program . setRefArrayValue2double ( G , RX10_TEMP70 , X10_TEMP118 ) ; }
 }
 public static void thread15(final T15 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public static void thread16(final T16 utmpz) {final  double localSum = utmpz.localSum;
final  int index = utmpz.index;
final  doubleRefArray1 localSumArray = utmpz.localSumArray;
 { final Point1 RX10_TEMP51 = new Point1 ( index ) ; final Dist1 RX10_TEMP52 = localSumArray . distValue ; final Region1 RX10_TEMP53 = RX10_TEMP52 . dReg ; final int RX10_TEMP54 = Program . searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; final int RX10_TEMP55 = 0 ; final boolean RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP57 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP57 ) ; }
 final place RX10_TEMP58 = Program . getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; final place RX10_TEMP60 = here ; final boolean RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; if ( RX10_TEMP61 ) { String RX10_TEMP59 = "Bad place access for array localSumArray" ; throw new RuntimeException ( RX10_TEMP59 ) ; }
 Program . setRefArrayValue1double ( localSumArray , RX10_TEMP54 , localSum ) ; }
 }

}

 
 value T1 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T1( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T2 {

 public final  double v;

 public final  Point2 p;

 public final  doubleRefArray2 t;
public T2( final  double a_v,  final  Point2 a_p,  final  doubleRefArray2 a_t) { 
 this.v = (a_v);
 this.p = (a_p);
 this.t = (a_t);
}
}
 
 value T3 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T3( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T4 {

 public final  place phere;

 public final  doubleRefArray1 result;

 public final  Point2 pt;

 public final  doubleRefArray2 G;
public T4( final  place a_phere,  final  doubleRefArray1 a_result,  final  Point2 a_pt,  final  doubleRefArray2 a_G) { 
 this.phere = (a_phere);
 this.result = (a_result);
 this.pt = (a_pt);
 this.G = (a_G);
}
}
 
 value T5 {

 public final  Point2 pt;

 public final  Point2 po;

 public final  double one_minus_omega;

 public final  double omega_over_four;

 public final  doubleRefArray2 G;

 public final  SOR X10_TEMP0;
public T5( final  Point2 a_pt,  final  Point2 a_po,  final  double a_one_minus_omega,  final  double a_omega_over_four,  final  doubleRefArray2 a_G,  final  SOR a_X10_TEMP0) { 
 this.pt = (a_pt);
 this.po = (a_po);
 this.one_minus_omega = (a_one_minus_omega);
 this.omega_over_four = (a_omega_over_four);
 this.G = (a_G);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T6 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;

 public final  double initVal;
public T6( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6,  final  double a_initVal) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
 this.initVal = (a_initVal);
}
}
 
 value T7 {

 public final  doubleRefArray1 localSumArray;

 public final  place source;

 public final  int zero;

 public final  doubleRefArray2 sumArray;
public T7( final  doubleRefArray1 a_localSumArray,  final  place a_source,  final  int a_zero,  final  doubleRefArray2 a_sumArray) { 
 this.localSumArray = (a_localSumArray);
 this.source = (a_source);
 this.zero = (a_zero);
 this.sumArray = (a_sumArray);
}
}
 
 value T8 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T8( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T9 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T9( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T10 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T10( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T11 {

 public final  doubleStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T11( final  doubleStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T12 {

 public final  doubleStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T12( final  doubleStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T13 {

 public final  double val;

 public final  doubleRefArray1 result;
public T13( final  double a_val,  final  doubleRefArray1 a_result) { 
 this.val = (a_val);
 this.result = (a_result);
}
}
 
 value T14 {

 public final  Point2 ij;

 public final  double one_minus_omega;

 public final  double omega_over_four;

 public final  doubleRefArray2 G;

 public final  SOR X10_TEMP0;
public T14( final  Point2 a_ij,  final  double a_one_minus_omega,  final  double a_omega_over_four,  final  doubleRefArray2 a_G,  final  SOR a_X10_TEMP0) { 
 this.ij = (a_ij);
 this.one_minus_omega = (a_one_minus_omega);
 this.omega_over_four = (a_omega_over_four);
 this.G = (a_G);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T15 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T15( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T16 {

 public final  double localSum;

 public final  int index;

 public final  doubleRefArray1 localSumArray;
public T16( final  double a_localSum,  final  int a_index,  final  doubleRefArray1 a_localSumArray) { 
 this.localSum = (a_localSum);
 this.index = (a_index);
 this.localSumArray = (a_localSumArray);
}
}
 
 value T17 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T17( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T18 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T18( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T19 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T19( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}

 value doubleRefArray2 { public final Dist2 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray2 ( final Dist2 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value Dist2 { public final Region2 dReg ; public final Dist dDist ; public Dist2 ( final Region2 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T8 utmp8 = new T8(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread8(utmp8); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T9 utmp9 = new T9(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread9(utmp9); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T10 utmp10 = new T10(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread10(utmp10); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 public void thread8(final T8 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T17 utmp17 = new T17(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread17(utmp17); }
 }
 }
 public void thread9(final T9 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T18 utmp18 = new T18(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread18(utmp18); }
 }
 }
 public void thread10(final T10 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T19 utmp19 = new T19(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread19(utmp19); }
 }
 }
 public void thread17(final T17 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread18(final T18 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread19(final T19 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
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

 value Region2 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final int low1 ; public final int dim1 ; public final Point2 value [ : rank==1 ] pointArray ; public Region2 ( final Point2 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; this . low1 = ( minusOne ) ; this . dim1 = ( zero ) ; }
 public Region2 ( final Point2 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ , final int low1_ , final int dim1_ ) { final boolean t = true ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; this . low1 = ( low1_ ) ; this . dim1 = ( dim1_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value Point2 { public final int f0 ; public final int f1 ; public Point2 ( final int f0_ , final int f1_ ) { this . f0 = ( f0_ ) ; this . f1 = ( f1_ ) ; }

} 

 class SOR { public Random R ; public SOR ( ) { long X10_TEMP2 = ( Program . _SOR_RANDOM_SEED ) ; final Random X10_TEMP4 = ( new Random ( X10_TEMP2 ) ) ; this . R = ( X10_TEMP4 ) ; }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

 class Random { public long seed ; public Random ( final long rseed ) { this . Random_setSeed ( rseed ) ; }
 public void Random_setSeed ( final long rseed ) { final long X10_TEMP1 = ( Program . _Random_multiplier ) ; final long X10_TEMP3 = ( rseed ^ X10_TEMP1 ) ; final long X10_TEMP4 = ( Program . _Random_mask ) ; final long X10_TEMP6 = ( X10_TEMP3 & X10_TEMP4 ) ; this . seed = ( X10_TEMP6 ) ; }

} 

