 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static final int _Stream_MEG = Program . _Stream_MEG_init ( ) ; public static final double _Stream_alpha = Program . _Stream_alpha_init ( ) ; public static final int _Stream_NUM_TIMES = Program . _Stream_NUM_TIMES_init ( ) ; public static final long _Stream_N0 = Program . _Stream_N0_init ( ) ; public static final long _Stream_N = Program . _Stream_N_init ( ) ; public static final int _Stream_LocalSize = Program . _Stream_LocalSize_init ( ) ; public static int _Timer_max_counters_init ( ) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; }
 public static void Timer_start ( final Timer X10_TEMP0 , final int n ) { { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . start_time ; final double X10_TEMP4 = ( System.currentTimeMillis ( ) ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; }
 }
 public static void Timer_stop ( final Timer X10_TEMP0 , final int n ) { { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . elapsed_time ; final double X10_TEMP5 = ( System.currentTimeMillis ( ) ) ; final doubleRefArray1 X10_TEMP3 = X10_TEMP0 . start_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP3 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
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
 }
 public static double Timer_readTimer ( final Timer X10_TEMP0 , final int n ) { { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; final double X10_TEMP4 = ( RX10_TEMP11 ) ; return X10_TEMP4 ; }
 }
 public static void Timer_resetTimer ( final Timer X10_TEMP0 , final int n ) { { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final double X10_TEMP4 = ( 0 ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; final doubleRefArray1 X10_TEMP6 = X10_TEMP0 . start_time ; final double X10_TEMP9 = ( 0 ) ; final double X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( n ) ; final Dist1 RX10_TEMP12 = X10_TEMP6 . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; final doubleRefArray1 X10_TEMP11 = X10_TEMP0 . elapsed_time ; final double X10_TEMP14 = ( 0 ) ; final double X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( n ) ; final Dist1 RX10_TEMP23 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; }
 }
 public static void Timer_resetAllTimers ( final Timer X10_TEMP0 ) { { int i = ( 0 ) ; boolean X10_TEMP4 = i < _Timer_max_counters ; while ( X10_TEMP4 ) { { Program . Timer_resetTimer ( X10_TEMP0 , i ) ; final int X10_TEMP6 = ( i ) ; final int X10_TEMP7 = 1 ; i = i + X10_TEMP7 ; }
 X10_TEMP4 = i < _Timer_max_counters ; }
 }
 }
 public static void runMain ( ) { { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { { Program . Timer_start ( tmr , count ) ; }
 }
 finish { { final Stream X10_TEMP4 = ( new Stream ( ) ) ; Program . Stream_run ( X10_TEMP4 ) ; }
 }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP7 = ( "Wall-clock time for stream: " ) ; final double X10_TEMP8 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " secs" ) ; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; System.out.println ( X10_TEMP12 ) ; }
 }
 public static int _Stream_MEG_init ( ) { final int X10_TEMP1 = ( 50 ) ; final int X10_TEMP2 = ( 50 ) ; final int X10_TEMP4 = ( X10_TEMP1 * X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static double _Stream_alpha_init ( ) { final double X10_TEMP2 = ( 3.0D ) ; return X10_TEMP2 ; }
 public static int _Stream_NUM_TIMES_init ( ) { final int X10_TEMP2 = ( 10 ) ; return X10_TEMP2 ; }
 public static long _Stream_N0_init ( ) { final int X10_TEMP1 = ( 2 ) ; final long X10_TEMP3 = ( X10_TEMP1 * _Stream_MEG ) ; return X10_TEMP3 ; }
 public static long _Stream_N_init ( ) { final int X10_TEMP1 = ( place.MAX_PLACES ) ; final long X10_TEMP3 = ( _Stream_N0 * X10_TEMP1 ) ; return X10_TEMP3 ; }
 public static int _Stream_LocalSize_init ( ) { final int X10_TEMP2 = ( ( int ) _Stream_N0 ) ; return X10_TEMP2 ; }
 public static void Stream_run ( final Stream X10_TEMP0 ) { { final String X10_TEMP1 = ( "LocalSize=" ) ; final String X10_TEMP3 = ( X10_TEMP1 + _Stream_LocalSize ) ; System.out.println ( X10_TEMP3 ) ; final StreamData tempSd = ( X10_TEMP0 . sd ) ; final Dist1 X10_TEMP5 = Program . getUniqueDist ( ) ; final Dist1 dDist = X10_TEMP5 ; final Region1 RX10_TEMP0 = dDist . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Region1Stub [ : rank==1 ] RX10_TEMP6 = ( Region1Stub [ : rank==1 ] ) ( new Region1Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dDist , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; final Dist1 RX10_TEMP13 = Program . restrictDist1 ( dDist , RX10_TEMP10 ) ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; 
 final T1 utmp1 = new T1(RX10_TEMP14, RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6, tempSd);
 async (RX10_TEMP10) {Program.thread1(utmp1); }
 }
 }
 final Region1Stub value [ : rank==1 ] RX10_TEMP21 = ( Region1Stub value [ : rank==1 ] ) ( new Region1Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP23 ) { final Region1Stub RX10_TEMP22 = RX10_TEMP6 [ RX10_TEMP23 ] ; return RX10_TEMP22 ; }
 ) ; final Region1RefArray1 RX10_TEMP24 = new Region1RefArray1 ( dDist , RX10_TEMP21 ) ; final Region1RefArray1 X10_TEMP17 = RX10_TEMP24 ; final Region1RefArray1 dReg = X10_TEMP17 ; finish { { final int X10_TEMP24 = ( 0 ) ; final int X10_TEMP20 = ( 1 ) ; final int X10_TEMP22 = ( _Stream_NUM_TIMES - X10_TEMP20 ) ; final int X10_TEMP25 = ( ( int ) X10_TEMP22 ) ; Region1 r = Program . createNewRegion1R ( X10_TEMP24 , X10_TEMP25 ) ; final int RX10_TEMP28 = 1 ; int RX10_TEMP26 = r . regSize ; RX10_TEMP26 = RX10_TEMP26 - RX10_TEMP28 ; final region ( : rank==1 ) RX10_TEMP27 = [ 0 : RX10_TEMP26 ] ; for ( point ( : rank==1 ) RX10_TEMP25 : RX10_TEMP27 ) { final int RX10_TEMP29 = RX10_TEMP25 [0] ; final Point1 p1 = Program . regionOrdinalPoint1 ( r , RX10_TEMP29 ) ; { finish { final Region1 RX10_TEMP31 = dDist . dReg ; final int RX10_TEMP34 = 1 ; int RX10_TEMP32 = RX10_TEMP31 . regSize ; RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34 ; final region ( : rank==1 ) RX10_TEMP33 = [ 0 : RX10_TEMP32 ] ; for ( point ( : rank==1 ) RX10_TEMP30 : RX10_TEMP33 ) { final int RX10_TEMP35 = RX10_TEMP30 [0] ; final Point1 p6 = Program . regionOrdinalPoint1 ( RX10_TEMP31 , RX10_TEMP35 ) ; final Region1 RX10_TEMP36 = dDist . dReg ; final int RX10_TEMP37 = Program . searchPointInRegion1 ( RX10_TEMP36 , p6 ) ; final int RX10_TEMP38 = 0 ; final boolean RX10_TEMP39 = RX10_TEMP37 < RX10_TEMP38 ; if ( RX10_TEMP39 ) { final String RX10_TEMP40 = "Point p6 not found in the distribution dDist." ; throw new RuntimeException ( RX10_TEMP40 ) ; }
 final place RX10_TEMP41 = Program . getPlaceFromDist1 ( dDist , RX10_TEMP37 ) ; final place X10_TEMP29 = RX10_TEMP41 ; 
 final T2 utmp2 = new T2(p6, p1, dReg, tempSd);
 async (X10_TEMP29) {Program.thread2(utmp2); }
 }
 }
 finish { final Region1 RX10_TEMP143 = dDist . dReg ; final int RX10_TEMP146 = 1 ; int RX10_TEMP144 = RX10_TEMP143 . regSize ; RX10_TEMP144 = RX10_TEMP144 - RX10_TEMP146 ; final region ( : rank==1 ) RX10_TEMP145 = [ 0 : RX10_TEMP144 ] ; for ( point ( : rank==1 ) RX10_TEMP142 : RX10_TEMP145 ) { final int RX10_TEMP147 = RX10_TEMP142 [0] ; final Point1 p5 = Program . regionOrdinalPoint1 ( RX10_TEMP143 , RX10_TEMP147 ) ; final Region1 RX10_TEMP148 = dDist . dReg ; final int RX10_TEMP149 = Program . searchPointInRegion1 ( RX10_TEMP148 , p5 ) ; final int RX10_TEMP150 = 0 ; final boolean RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150 ; if ( RX10_TEMP151 ) { final String RX10_TEMP152 = "Point p5 not found in the distribution dDist." ; throw new RuntimeException ( RX10_TEMP152 ) ; }
 final place RX10_TEMP153 = Program . getPlaceFromDist1 ( dDist , RX10_TEMP149 ) ; final place X10_TEMP88 = RX10_TEMP153 ; 
 final T3 utmp3 = new T3(p5, p1, tempSd);
 async (X10_TEMP88) {Program.thread3(utmp3); }
 }
 }
 }
 }
 finish { final Region1 RX10_TEMP182 = dDist . dReg ; final int RX10_TEMP185 = 1 ; int RX10_TEMP183 = RX10_TEMP182 . regSize ; RX10_TEMP183 = RX10_TEMP183 - RX10_TEMP185 ; final region ( : rank==1 ) RX10_TEMP184 = [ 0 : RX10_TEMP183 ] ; for ( point ( : rank==1 ) RX10_TEMP181 : RX10_TEMP184 ) { final int RX10_TEMP186 = RX10_TEMP181 [0] ; final Point1 p2 = Program . regionOrdinalPoint1 ( RX10_TEMP182 , RX10_TEMP186 ) ; final Region1 RX10_TEMP187 = dDist . dReg ; final int RX10_TEMP188 = Program . searchPointInRegion1 ( RX10_TEMP187 , p2 ) ; final int RX10_TEMP189 = 0 ; final boolean RX10_TEMP190 = RX10_TEMP188 < RX10_TEMP189 ; if ( RX10_TEMP190 ) { final String RX10_TEMP191 = "Point p2 not found in the distribution dDist." ; throw new RuntimeException ( RX10_TEMP191 ) ; }
 final place RX10_TEMP192 = Program . getPlaceFromDist1 ( dDist , RX10_TEMP188 ) ; final place X10_TEMP105 = RX10_TEMP192 ; 
 final T4 utmp4 = new T4(p2, dReg, tempSd);
 async (X10_TEMP105) {Program.thread4(utmp4); }
 }
 }
 }
 }
 double mini = ( 10000000L ) ; final int X10_TEMP136 = ( 0 ) ; final int X10_TEMP132 = ( 1 ) ; final int X10_TEMP134 = ( _Stream_NUM_TIMES - X10_TEMP132 ) ; final int X10_TEMP137 = ( ( int ) X10_TEMP134 ) ; Region1 r = Program . createNewRegion1R ( X10_TEMP136 , X10_TEMP137 ) ; final int RX10_TEMP256 = 1 ; int RX10_TEMP254 = r . regSize ; RX10_TEMP254 = RX10_TEMP254 - RX10_TEMP256 ; final region ( : rank==1 ) RX10_TEMP255 = [ 0 : RX10_TEMP254 ] ; for ( point ( : rank==1 ) RX10_TEMP253 : RX10_TEMP255 ) { final int RX10_TEMP257 = RX10_TEMP253 [0] ; final Point1 p1 = Program . regionOrdinalPoint1 ( r , RX10_TEMP257 ) ; final doubleRefArray1 X10_TEMP140 = tempSd . times ; final Dist1 RX10_TEMP258 = X10_TEMP140 . distValue ; final Region1 RX10_TEMP259 = RX10_TEMP258 . dReg ; final int RX10_TEMP260 = Program . searchPointInRegion1 ( RX10_TEMP259 , p1 ) ; final int RX10_TEMP261 = 0 ; final boolean RX10_TEMP262 = RX10_TEMP260 < RX10_TEMP261 ; if ( RX10_TEMP262 ) { String RX10_TEMP263 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP263 ) ; }
 final place RX10_TEMP264 = Program . getPlaceFromDist1 ( RX10_TEMP258 , RX10_TEMP260 ) ; final place RX10_TEMP266 = here ; final boolean RX10_TEMP267 = RX10_TEMP264 != RX10_TEMP266 ; if ( RX10_TEMP267 ) { String RX10_TEMP265 = "Bad place access for array X10_TEMP140" ; throw new RuntimeException ( RX10_TEMP265 ) ; }
 final double RX10_TEMP268 = Program . getRefArrayValue1double ( X10_TEMP140 , RX10_TEMP260 ) ; final double X10_TEMP142 = ( RX10_TEMP268 ) ; final boolean X10_TEMP144 = X10_TEMP142 < mini ; if ( X10_TEMP144 ) { final doubleRefArray1 X10_TEMP145 = tempSd . times ; final Dist1 RX10_TEMP269 = X10_TEMP145 . distValue ; final Region1 RX10_TEMP270 = RX10_TEMP269 . dReg ; final int RX10_TEMP271 = Program . searchPointInRegion1 ( RX10_TEMP270 , p1 ) ; final int RX10_TEMP272 = 0 ; final boolean RX10_TEMP273 = RX10_TEMP271 < RX10_TEMP272 ; if ( RX10_TEMP273 ) { String RX10_TEMP274 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP274 ) ; }
 final place RX10_TEMP275 = Program . getPlaceFromDist1 ( RX10_TEMP269 , RX10_TEMP271 ) ; final place RX10_TEMP277 = here ; final boolean RX10_TEMP278 = RX10_TEMP275 != RX10_TEMP277 ; if ( RX10_TEMP278 ) { String RX10_TEMP276 = "Bad place access for array X10_TEMP145" ; throw new RuntimeException ( RX10_TEMP276 ) ; }
 final double RX10_TEMP279 = Program . getRefArrayValue1double ( X10_TEMP145 , RX10_TEMP271 ) ; final double X10_TEMP148 = ( RX10_TEMP279 ) ; mini = ( X10_TEMP148 ) ; }
 }
 final booleanRefArray1 X10_TEMP151 = tempSd . verified ; final int X10_TEMP153 = ( 0 ) ; final Point1 RX10_TEMP280 = new Point1 ( X10_TEMP153 ) ; final Dist1 RX10_TEMP281 = X10_TEMP151 . distValue ; final Region1 RX10_TEMP282 = RX10_TEMP281 . dReg ; final int RX10_TEMP283 = Program . searchPointInRegion1 ( RX10_TEMP282 , RX10_TEMP280 ) ; final int RX10_TEMP284 = 0 ; final boolean RX10_TEMP285 = RX10_TEMP283 < RX10_TEMP284 ; if ( RX10_TEMP285 ) { String RX10_TEMP286 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP286 ) ; }
 final place RX10_TEMP287 = Program . getPlaceFromDist1 ( RX10_TEMP281 , RX10_TEMP283 ) ; final place RX10_TEMP289 = here ; final boolean RX10_TEMP290 = RX10_TEMP287 != RX10_TEMP289 ; if ( RX10_TEMP290 ) { String RX10_TEMP288 = "Bad place access for array X10_TEMP151" ; throw new RuntimeException ( RX10_TEMP288 ) ; }
 final boolean RX10_TEMP291 = Program . getRefArrayValue1boolean ( X10_TEMP151 , RX10_TEMP283 ) ; final boolean X10_TEMP155 = ( RX10_TEMP291 ) ; Program . Stream_printStats ( _Stream_N , mini , X10_TEMP155 ) ; }
 }
 public static double Stream_mySecond ( ) { { final double X10_TEMP1 = ( System.currentTimeMillis ( ) ) ; final double X10_TEMP2 = ( 1.e6 ) ; final double X10_TEMP3 = ( X10_TEMP1 * X10_TEMP2 ) ; final int X10_TEMP4 = ( 1000 ) ; final double X10_TEMP6 = ( X10_TEMP3 / X10_TEMP4 ) ; final double X10_TEMP7 = ( ( double ) X10_TEMP6 ) ; final double X10_TEMP8 = ( 1.e-6 ) ; final double X10_TEMP10 = ( X10_TEMP7 * X10_TEMP8 ) ; final double X10_TEMP12 = ( ( double ) X10_TEMP10 ) ; return X10_TEMP12 ; }
 }
 public static void Stream_printStats ( final long N , final double time , final boolean verified ) { { final String X10_TEMP1 = ( "Number of places=" ) ; final int X10_TEMP2 = ( place.MAX_PLACES ) ; final String X10_TEMP4 = ( X10_TEMP1 + X10_TEMP2 ) ; System.out.println ( X10_TEMP4 ) ; final int X10_TEMP5 = ( 3 ) ; final int X10_TEMP6 = ( 8 ) ; final long X10_TEMP7 = ( X10_TEMP5 * X10_TEMP6 ) ; final long X10_TEMP8 = ( X10_TEMP7 * N ) ; final long X10_TEMP10 = ( X10_TEMP8 / _Stream_MEG ) ; long size1 = ( X10_TEMP10 ) ; final int X10_TEMP12 = ( 3 ) ; final int X10_TEMP13 = ( 8 ) ; final long X10_TEMP14 = ( X10_TEMP12 * X10_TEMP13 ) ; final long X10_TEMP16 = ( X10_TEMP14 * N ) ; final double X10_TEMP17 = ( 1.0E9 ) ; final double X10_TEMP19 = ( X10_TEMP17 * time ) ; double rate = ( X10_TEMP16 / X10_TEMP19 ) ; final String X10_TEMP21 = ( "Size of arrays: " ) ; final String X10_TEMP22 = ( X10_TEMP21 + size1 ) ; final String X10_TEMP23 = ( " MB (total)" ) ; final String X10_TEMP25 = ( X10_TEMP22 + X10_TEMP23 ) ; final int X10_TEMP24 = ( place.MAX_PLACES ) ; final long X10_TEMP26 = ( size1 / X10_TEMP24 ) ; final String X10_TEMP27 = ( X10_TEMP25 + X10_TEMP26 ) ; final String X10_TEMP28 = ( " MB (per place)" ) ; final String X10_TEMP30 = ( X10_TEMP27 + X10_TEMP28 ) ; System.out.println ( X10_TEMP30 ) ; final String X10_TEMP31 = ( "Min time: " ) ; final String X10_TEMP32 = ( X10_TEMP31 + time ) ; final String X10_TEMP33 = ( " rate=" ) ; final String X10_TEMP34 = ( X10_TEMP32 + X10_TEMP33 ) ; final String X10_TEMP35 = ( X10_TEMP34 + rate ) ; final String X10_TEMP36 = ( " GB/s" ) ; final String X10_TEMP38 = ( X10_TEMP35 + X10_TEMP36 ) ; System.out.println ( X10_TEMP38 ) ; final String X10_TEMP45 = ( "Result is " ) ; final boolean X10_TEMP39 = verified ; String X10_TEMP42 = "NOT verified." ; if ( X10_TEMP39 ) { X10_TEMP42 = "verified." ; }
 final String X10_TEMP43 = X10_TEMP42 ; final String X10_TEMP44 = ( X10_TEMP43 ) ; final String X10_TEMP47 = ( X10_TEMP45 + X10_TEMP44 ) ; System.out.println ( X10_TEMP47 ) ; }
 }
 public static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; }
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
 public static boolean getRefArrayValue1boolean ( final booleanRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final booleanStub value [ : rank==1 ] contents = array . contents ; final booleanStub indexStub = contents [ placeIndex ] ; final boolean [ : rank==1 ] localArray = indexStub . localArray ; final boolean returnValue = localArray [ localIndex ] ; return returnValue ; }
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
 public static void setRefArrayValue1boolean ( final booleanRefArray1 array , final int index , final boolean val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final booleanStub value [ : rank==1 ] contents = array . contents ; final booleanStub indexStub = contents [ placeIndex ] ; final boolean [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Region1 getRefArrayValue1Region1 ( final Region1RefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Region1Stub value [ : rank==1 ] contents = array . contents ; final Region1Stub indexStub = contents [ placeIndex ] ; final Region1 [ : rank==1 ] localArray = indexStub . localArray ; final Region1 returnValue = localArray [ localIndex ] ; return returnValue ; }
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
 public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint = new Point1 ( f1 ) ; return retPoint ; }
 ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; }
 }

 public static void thread1(final T1 utmpz) {final  Region1 RX10_TEMP14 = utmpz.RX10_TEMP14;
final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region1Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
final  StreamData tempSd = utmpz.tempSd;
 { final dist ( : rank==1 ) RX10_TEMP18 = [ 0 : RX10_TEMP12 ] -> here ; final Region1 [ : rank==1 ] RX10_TEMP19 = ( Region1 [ : rank==1 ] ) ( new Region1 [ RX10_TEMP18 ] ( point ( : rank==1 ) RX10_TEMP15 ) { final int RX10_TEMP16 = RX10_TEMP15 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; { final Dist1 X10_TEMP12 = tempSd . D ; final int X10_TEMP9 = ( p . f0 ) ; final place X10_TEMP11 = ( place.places ( X10_TEMP9 ) ) ; final Dist1 X10_TEMP14 = Program . restrictDist1 ( X10_TEMP12 , X10_TEMP11 ) ; final Region1 RX10_TEMP17 = X10_TEMP14 . dReg ; final Region1 X10_TEMP16 = RX10_TEMP17 ; return X10_TEMP16 ; }
 }
 ) ; final Region1Stub RX10_TEMP20 = new Region1Stub ( RX10_TEMP19 ) ; 
 final T10 utmp10 = new T10(RX10_TEMP20, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread10(utmp10); }
 }
 }
 public static void thread2(final T2 utmpz) {final  Point1 p6 = utmpz.p6;
final  Point1 p1 = utmpz.p1;
final  Region1RefArray1 dReg = utmpz.dReg;
final  StreamData tempSd = utmpz.tempSd;
 { { final Dist1 RX10_TEMP42 = dReg . distValue ; final Region1 RX10_TEMP43 = RX10_TEMP42 . dReg ; final int RX10_TEMP44 = Program . searchPointInRegion1 ( RX10_TEMP43 , p6 ) ; final int RX10_TEMP45 = 0 ; final boolean RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; if ( RX10_TEMP46 ) { String RX10_TEMP47 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP47 ) ; }
 final place RX10_TEMP48 = Program . getPlaceFromDist1 ( RX10_TEMP42 , RX10_TEMP44 ) ; final place RX10_TEMP50 = here ; final boolean RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP49 = "Bad place access for array dReg" ; throw new RuntimeException ( RX10_TEMP49 ) ; }
 final Region1 RX10_TEMP52 = Program . getRefArrayValue1Region1 ( dReg , RX10_TEMP44 ) ; final Region1 X10_TEMP32 = RX10_TEMP52 ; final int RX10_TEMP56 = 1 ; int RX10_TEMP54 = X10_TEMP32 . regSize ; RX10_TEMP54 = RX10_TEMP54 - RX10_TEMP56 ; final region ( : rank==1 ) RX10_TEMP55 = [ 0 : RX10_TEMP54 ] ; for ( point ( : rank==1 ) RX10_TEMP53 : RX10_TEMP55 ) { final int RX10_TEMP57 = RX10_TEMP53 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( X10_TEMP32 , RX10_TEMP57 ) ; { final doubleRefArray1 X10_TEMP33 = tempSd . b ; final double X10_TEMP42 = ( 1.5 ) ; final place X10_TEMP35 = ( here ) ; final int X10_TEMP36 = ( X10_TEMP35 . id ) ; final int X10_TEMP38 = ( X10_TEMP36 * _Stream_LocalSize ) ; final int X10_TEMP39 = ( i . f0 ) ; final int X10_TEMP41 = ( X10_TEMP38 + X10_TEMP39 ) ; final double X10_TEMP44 = ( X10_TEMP42 * X10_TEMP41 ) ; final double X10_TEMP45 = ( X10_TEMP44 ) ; final Dist1 RX10_TEMP58 = X10_TEMP33 . distValue ; final Region1 RX10_TEMP59 = RX10_TEMP58 . dReg ; final int RX10_TEMP60 = Program . searchPointInRegion1 ( RX10_TEMP59 , i ) ; final int RX10_TEMP61 = 0 ; final boolean RX10_TEMP62 = RX10_TEMP60 < RX10_TEMP61 ; if ( RX10_TEMP62 ) { String RX10_TEMP63 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP63 ) ; }
 final place RX10_TEMP64 = Program . getPlaceFromDist1 ( RX10_TEMP58 , RX10_TEMP60 ) ; final place RX10_TEMP66 = here ; final boolean RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66 ; if ( RX10_TEMP67 ) { String RX10_TEMP65 = "Bad place access for array X10_TEMP33" ; throw new RuntimeException ( RX10_TEMP65 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP33 , RX10_TEMP60 , X10_TEMP45 ) ; final doubleRefArray1 X10_TEMP46 = tempSd . c ; final double X10_TEMP55 = ( 2.5 ) ; final place X10_TEMP48 = ( here ) ; final int X10_TEMP49 = ( X10_TEMP48 . id ) ; final int X10_TEMP51 = ( X10_TEMP49 * _Stream_LocalSize ) ; final int X10_TEMP52 = ( i . f0 ) ; final int X10_TEMP54 = ( X10_TEMP51 + X10_TEMP52 ) ; final double X10_TEMP57 = ( X10_TEMP55 * X10_TEMP54 ) ; final double X10_TEMP58 = ( X10_TEMP57 ) ; final Dist1 RX10_TEMP68 = X10_TEMP46 . distValue ; final Region1 RX10_TEMP69 = RX10_TEMP68 . dReg ; final int RX10_TEMP70 = Program . searchPointInRegion1 ( RX10_TEMP69 , i ) ; final int RX10_TEMP71 = 0 ; final boolean RX10_TEMP72 = RX10_TEMP70 < RX10_TEMP71 ; if ( RX10_TEMP72 ) { String RX10_TEMP73 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP73 ) ; }
 final place RX10_TEMP74 = Program . getPlaceFromDist1 ( RX10_TEMP68 , RX10_TEMP70 ) ; final place RX10_TEMP76 = here ; final boolean RX10_TEMP77 = RX10_TEMP74 != RX10_TEMP76 ; if ( RX10_TEMP77 ) { String RX10_TEMP75 = "Bad place access for array X10_TEMP46" ; throw new RuntimeException ( RX10_TEMP75 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP46 , RX10_TEMP70 , X10_TEMP58 ) ; }
 }
 final Dist1 X10_TEMP59 = Program . getUniqueDist ( ) ; final Region1 RX10_TEMP78 = X10_TEMP59 . dReg ; final int RX10_TEMP79 = Program . searchPointInRegion1 ( RX10_TEMP78 , p6 ) ; final int RX10_TEMP80 = 0 ; final boolean RX10_TEMP81 = RX10_TEMP79 < RX10_TEMP80 ; if ( RX10_TEMP81 ) { final String RX10_TEMP82 = "Point p6 not found in the distribution X10_TEMP59." ; throw new RuntimeException ( RX10_TEMP82 ) ; }
 final place RX10_TEMP83 = Program . getPlaceFromDist1 ( X10_TEMP59 , RX10_TEMP79 ) ; final place X10_TEMP61 = ( RX10_TEMP83 ) ; final place X10_TEMP62 = ( place.FIRST_PLACE ) ; final boolean X10_TEMP64 = X10_TEMP61 == X10_TEMP62 ; if ( X10_TEMP64 ) { final doubleRefArray1 X10_TEMP65 = tempSd . times ; final double X10_TEMP67 = ( Program . Stream_mySecond ( ) ) ; final int X10_TEMP68 = 0 ; final double X10_TEMP70 = ( X10_TEMP68 - X10_TEMP67 ) ; final double X10_TEMP71 = ( X10_TEMP70 ) ; final Dist1 RX10_TEMP84 = X10_TEMP65 . distValue ; final Region1 RX10_TEMP85 = RX10_TEMP84 . dReg ; final int RX10_TEMP86 = Program . searchPointInRegion1 ( RX10_TEMP85 , p1 ) ; final int RX10_TEMP87 = 0 ; final boolean RX10_TEMP88 = RX10_TEMP86 < RX10_TEMP87 ; if ( RX10_TEMP88 ) { String RX10_TEMP89 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP89 ) ; }
 final place RX10_TEMP90 = Program . getPlaceFromDist1 ( RX10_TEMP84 , RX10_TEMP86 ) ; final place RX10_TEMP92 = here ; final boolean RX10_TEMP93 = RX10_TEMP90 != RX10_TEMP92 ; if ( RX10_TEMP93 ) { String RX10_TEMP91 = "Bad place access for array X10_TEMP65" ; throw new RuntimeException ( RX10_TEMP91 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP65 , RX10_TEMP86 , X10_TEMP71 ) ; }
 final Dist1 RX10_TEMP94 = dReg . distValue ; final Region1 RX10_TEMP95 = RX10_TEMP94 . dReg ; final int RX10_TEMP96 = Program . searchPointInRegion1 ( RX10_TEMP95 , p6 ) ; final int RX10_TEMP97 = 0 ; final boolean RX10_TEMP98 = RX10_TEMP96 < RX10_TEMP97 ; if ( RX10_TEMP98 ) { String RX10_TEMP99 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP99 ) ; }
 final place RX10_TEMP100 = Program . getPlaceFromDist1 ( RX10_TEMP94 , RX10_TEMP96 ) ; final place RX10_TEMP102 = here ; final boolean RX10_TEMP103 = RX10_TEMP100 != RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP101 = "Bad place access for array dReg" ; throw new RuntimeException ( RX10_TEMP101 ) ; }
 final Region1 RX10_TEMP104 = Program . getRefArrayValue1Region1 ( dReg , RX10_TEMP96 ) ; final Region1 X10_TEMP74 = RX10_TEMP104 ; final int RX10_TEMP108 = 1 ; int RX10_TEMP106 = X10_TEMP74 . regSize ; RX10_TEMP106 = RX10_TEMP106 - RX10_TEMP108 ; final region ( : rank==1 ) RX10_TEMP107 = [ 0 : RX10_TEMP106 ] ; for ( point ( : rank==1 ) RX10_TEMP105 : RX10_TEMP107 ) { final int RX10_TEMP109 = RX10_TEMP105 [0] ; final Point1 p4 = Program . regionOrdinalPoint1 ( X10_TEMP74 , RX10_TEMP109 ) ; final doubleRefArray1 X10_TEMP75 = tempSd . a ; final doubleRefArray1 X10_TEMP77 = tempSd . b ; final Dist1 RX10_TEMP110 = X10_TEMP77 . distValue ; final Region1 RX10_TEMP111 = RX10_TEMP110 . dReg ; final int RX10_TEMP112 = Program . searchPointInRegion1 ( RX10_TEMP111 , p4 ) ; final int RX10_TEMP113 = 0 ; final boolean RX10_TEMP114 = RX10_TEMP112 < RX10_TEMP113 ; if ( RX10_TEMP114 ) { String RX10_TEMP115 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP115 ) ; }
 final place RX10_TEMP116 = Program . getPlaceFromDist1 ( RX10_TEMP110 , RX10_TEMP112 ) ; final place RX10_TEMP118 = here ; final boolean RX10_TEMP119 = RX10_TEMP116 != RX10_TEMP118 ; if ( RX10_TEMP119 ) { String RX10_TEMP117 = "Bad place access for array X10_TEMP77" ; throw new RuntimeException ( RX10_TEMP117 ) ; }
 final double RX10_TEMP120 = Program . getRefArrayValue1double ( X10_TEMP77 , RX10_TEMP112 ) ; final double X10_TEMP82 = ( RX10_TEMP120 ) ; final doubleRefArray1 X10_TEMP79 = tempSd . c ; final Dist1 RX10_TEMP121 = X10_TEMP79 . distValue ; final Region1 RX10_TEMP122 = RX10_TEMP121 . dReg ; final int RX10_TEMP123 = Program . searchPointInRegion1 ( RX10_TEMP122 , p4 ) ; final int RX10_TEMP124 = 0 ; final boolean RX10_TEMP125 = RX10_TEMP123 < RX10_TEMP124 ; if ( RX10_TEMP125 ) { String RX10_TEMP126 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP126 ) ; }
 final place RX10_TEMP127 = Program . getPlaceFromDist1 ( RX10_TEMP121 , RX10_TEMP123 ) ; final place RX10_TEMP129 = here ; final boolean RX10_TEMP130 = RX10_TEMP127 != RX10_TEMP129 ; if ( RX10_TEMP130 ) { String RX10_TEMP128 = "Bad place access for array X10_TEMP79" ; throw new RuntimeException ( RX10_TEMP128 ) ; }
 final double RX10_TEMP131 = Program . getRefArrayValue1double ( X10_TEMP79 , RX10_TEMP123 ) ; final double X10_TEMP81 = ( RX10_TEMP131 ) ; final double X10_TEMP83 = ( _Stream_alpha * X10_TEMP81 ) ; final double X10_TEMP85 = ( X10_TEMP82 + X10_TEMP83 ) ; final double X10_TEMP86 = ( X10_TEMP85 ) ; final Dist1 RX10_TEMP132 = X10_TEMP75 . distValue ; final Region1 RX10_TEMP133 = RX10_TEMP132 . dReg ; final int RX10_TEMP134 = Program . searchPointInRegion1 ( RX10_TEMP133 , p4 ) ; final int RX10_TEMP135 = 0 ; final boolean RX10_TEMP136 = RX10_TEMP134 < RX10_TEMP135 ; if ( RX10_TEMP136 ) { String RX10_TEMP137 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP137 ) ; }
 final place RX10_TEMP138 = Program . getPlaceFromDist1 ( RX10_TEMP132 , RX10_TEMP134 ) ; final place RX10_TEMP140 = here ; final boolean RX10_TEMP141 = RX10_TEMP138 != RX10_TEMP140 ; if ( RX10_TEMP141 ) { String RX10_TEMP139 = "Bad place access for array X10_TEMP75" ; throw new RuntimeException ( RX10_TEMP139 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP75 , RX10_TEMP134 , X10_TEMP86 ) ; }
 }
 }
 }
 public static void thread3(final T3 utmpz) {final  Point1 p5 = utmpz.p5;
final  Point1 p1 = utmpz.p1;
final  StreamData tempSd = utmpz.tempSd;
 { { final Dist1 X10_TEMP89 = Program . getUniqueDist ( ) ; final Region1 RX10_TEMP154 = X10_TEMP89 . dReg ; final int RX10_TEMP155 = Program . searchPointInRegion1 ( RX10_TEMP154 , p5 ) ; final int RX10_TEMP156 = 0 ; final boolean RX10_TEMP157 = RX10_TEMP155 < RX10_TEMP156 ; if ( RX10_TEMP157 ) { final String RX10_TEMP158 = "Point p5 not found in the distribution X10_TEMP89." ; throw new RuntimeException ( RX10_TEMP158 ) ; }
 final place RX10_TEMP159 = Program . getPlaceFromDist1 ( X10_TEMP89 , RX10_TEMP155 ) ; final place X10_TEMP91 = ( RX10_TEMP159 ) ; final place X10_TEMP92 = ( place.FIRST_PLACE ) ; final boolean X10_TEMP94 = X10_TEMP91 == X10_TEMP92 ; if ( X10_TEMP94 ) { final doubleRefArray1 X10_TEMP95 = tempSd . times ; final doubleRefArray1 X10_TEMP97 = tempSd . times ; final Dist1 RX10_TEMP160 = X10_TEMP97 . distValue ; final Region1 RX10_TEMP161 = RX10_TEMP160 . dReg ; final int RX10_TEMP162 = Program . searchPointInRegion1 ( RX10_TEMP161 , p1 ) ; final int RX10_TEMP163 = 0 ; final boolean RX10_TEMP164 = RX10_TEMP162 < RX10_TEMP163 ; if ( RX10_TEMP164 ) { String RX10_TEMP165 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP165 ) ; }
 final place RX10_TEMP166 = Program . getPlaceFromDist1 ( RX10_TEMP160 , RX10_TEMP162 ) ; final place RX10_TEMP168 = here ; final boolean RX10_TEMP169 = RX10_TEMP166 != RX10_TEMP168 ; if ( RX10_TEMP169 ) { String RX10_TEMP167 = "Bad place access for array X10_TEMP97" ; throw new RuntimeException ( RX10_TEMP167 ) ; }
 final double RX10_TEMP170 = Program . getRefArrayValue1double ( X10_TEMP97 , RX10_TEMP162 ) ; final double X10_TEMP99 = ( RX10_TEMP170 ) ; final double X10_TEMP100 = ( Program . Stream_mySecond ( ) ) ; final double X10_TEMP102 = ( X10_TEMP99 + X10_TEMP100 ) ; final double X10_TEMP103 = ( X10_TEMP102 ) ; final Dist1 RX10_TEMP171 = X10_TEMP95 . distValue ; final Region1 RX10_TEMP172 = RX10_TEMP171 . dReg ; final int RX10_TEMP173 = Program . searchPointInRegion1 ( RX10_TEMP172 , p1 ) ; final int RX10_TEMP174 = 0 ; final boolean RX10_TEMP175 = RX10_TEMP173 < RX10_TEMP174 ; if ( RX10_TEMP175 ) { String RX10_TEMP176 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP176 ) ; }
 final place RX10_TEMP177 = Program . getPlaceFromDist1 ( RX10_TEMP171 , RX10_TEMP173 ) ; final place RX10_TEMP179 = here ; final boolean RX10_TEMP180 = RX10_TEMP177 != RX10_TEMP179 ; if ( RX10_TEMP180 ) { String RX10_TEMP178 = "Bad place access for array X10_TEMP95" ; throw new RuntimeException ( RX10_TEMP178 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP95 , RX10_TEMP173 , X10_TEMP103 ) ; }
 }
 }
 }
 public static void thread4(final T4 utmpz) {final  Point1 p2 = utmpz.p2;
final  Region1RefArray1 dReg = utmpz.dReg;
final  StreamData tempSd = utmpz.tempSd;
 { { final Dist1 RX10_TEMP193 = dReg . distValue ; final Region1 RX10_TEMP194 = RX10_TEMP193 . dReg ; final int RX10_TEMP195 = Program . searchPointInRegion1 ( RX10_TEMP194 , p2 ) ; final int RX10_TEMP196 = 0 ; final boolean RX10_TEMP197 = RX10_TEMP195 < RX10_TEMP196 ; if ( RX10_TEMP197 ) { String RX10_TEMP198 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP198 ) ; }
 final place RX10_TEMP199 = Program . getPlaceFromDist1 ( RX10_TEMP193 , RX10_TEMP195 ) ; final place RX10_TEMP201 = here ; final boolean RX10_TEMP202 = RX10_TEMP199 != RX10_TEMP201 ; if ( RX10_TEMP202 ) { String RX10_TEMP200 = "Bad place access for array dReg" ; throw new RuntimeException ( RX10_TEMP200 ) ; }
 final Region1 RX10_TEMP203 = Program . getRefArrayValue1Region1 ( dReg , RX10_TEMP195 ) ; final Region1 X10_TEMP108 = RX10_TEMP203 ; final int RX10_TEMP207 = 1 ; int RX10_TEMP205 = X10_TEMP108 . regSize ; RX10_TEMP205 = RX10_TEMP205 - RX10_TEMP207 ; final region ( : rank==1 ) RX10_TEMP206 = [ 0 : RX10_TEMP205 ] ; for ( point ( : rank==1 ) RX10_TEMP204 : RX10_TEMP206 ) { final int RX10_TEMP208 = RX10_TEMP204 [0] ; final Point1 p3 = Program . regionOrdinalPoint1 ( X10_TEMP108 , RX10_TEMP208 ) ; final doubleRefArray1 X10_TEMP109 = tempSd . a ; final Dist1 RX10_TEMP209 = X10_TEMP109 . distValue ; final Region1 RX10_TEMP210 = RX10_TEMP209 . dReg ; final int RX10_TEMP211 = Program . searchPointInRegion1 ( RX10_TEMP210 , p3 ) ; final int RX10_TEMP212 = 0 ; final boolean RX10_TEMP213 = RX10_TEMP211 < RX10_TEMP212 ; if ( RX10_TEMP213 ) { String RX10_TEMP214 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP214 ) ; }
 final place RX10_TEMP215 = Program . getPlaceFromDist1 ( RX10_TEMP209 , RX10_TEMP211 ) ; final place RX10_TEMP217 = here ; final boolean RX10_TEMP218 = RX10_TEMP215 != RX10_TEMP217 ; if ( RX10_TEMP218 ) { String RX10_TEMP216 = "Bad place access for array X10_TEMP109" ; throw new RuntimeException ( RX10_TEMP216 ) ; }
 final double RX10_TEMP219 = Program . getRefArrayValue1double ( X10_TEMP109 , RX10_TEMP211 ) ; final double X10_TEMP118 = ( RX10_TEMP219 ) ; final doubleRefArray1 X10_TEMP111 = tempSd . b ; final Dist1 RX10_TEMP220 = X10_TEMP111 . distValue ; final Region1 RX10_TEMP221 = RX10_TEMP220 . dReg ; final int RX10_TEMP222 = Program . searchPointInRegion1 ( RX10_TEMP221 , p3 ) ; final int RX10_TEMP223 = 0 ; final boolean RX10_TEMP224 = RX10_TEMP222 < RX10_TEMP223 ; if ( RX10_TEMP224 ) { String RX10_TEMP225 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP225 ) ; }
 final place RX10_TEMP226 = Program . getPlaceFromDist1 ( RX10_TEMP220 , RX10_TEMP222 ) ; final place RX10_TEMP228 = here ; final boolean RX10_TEMP229 = RX10_TEMP226 != RX10_TEMP228 ; if ( RX10_TEMP229 ) { String RX10_TEMP227 = "Bad place access for array X10_TEMP111" ; throw new RuntimeException ( RX10_TEMP227 ) ; }
 final double RX10_TEMP230 = Program . getRefArrayValue1double ( X10_TEMP111 , RX10_TEMP222 ) ; final double X10_TEMP116 = ( RX10_TEMP230 ) ; final doubleRefArray1 X10_TEMP113 = tempSd . c ; final Dist1 RX10_TEMP231 = X10_TEMP113 . distValue ; final Region1 RX10_TEMP232 = RX10_TEMP231 . dReg ; final int RX10_TEMP233 = Program . searchPointInRegion1 ( RX10_TEMP232 , p3 ) ; final int RX10_TEMP234 = 0 ; final boolean RX10_TEMP235 = RX10_TEMP233 < RX10_TEMP234 ; if ( RX10_TEMP235 ) { String RX10_TEMP236 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP236 ) ; }
 final place RX10_TEMP237 = Program . getPlaceFromDist1 ( RX10_TEMP231 , RX10_TEMP233 ) ; final place RX10_TEMP239 = here ; final boolean RX10_TEMP240 = RX10_TEMP237 != RX10_TEMP239 ; if ( RX10_TEMP240 ) { String RX10_TEMP238 = "Bad place access for array X10_TEMP113" ; throw new RuntimeException ( RX10_TEMP238 ) ; }
 final double RX10_TEMP241 = Program . getRefArrayValue1double ( X10_TEMP113 , RX10_TEMP233 ) ; final double X10_TEMP115 = ( RX10_TEMP241 ) ; final double X10_TEMP117 = ( _Stream_alpha * X10_TEMP115 ) ; final double X10_TEMP119 = ( X10_TEMP116 + X10_TEMP117 ) ; final boolean X10_TEMP121 = X10_TEMP118 != X10_TEMP119 ; if ( X10_TEMP121 ) { final place X10_TEMP123 = place.FIRST_PLACE ; 
 final T11 utmp11 = new T11(tempSd);
 async (X10_TEMP123) {Program.thread11(utmp11); }
 }
 }
 }
 }
 }
 public static void thread10(final T10 utmpz) {final  Region1Stub RX10_TEMP20 = utmpz.RX10_TEMP20;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Region1Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP20 ) ; }
 }
 public static void thread11(final T11 utmpz) {final  StreamData tempSd = utmpz.tempSd;
 { { final booleanRefArray1 X10_TEMP124 = tempSd . verified ; final int X10_TEMP126 = ( 0 ) ; final boolean X10_TEMP128 = ( false ) ; final boolean X10_TEMP129 = ( X10_TEMP128 ) ; final Point1 RX10_TEMP242 = new Point1 ( X10_TEMP126 ) ; final Dist1 RX10_TEMP243 = X10_TEMP124 . distValue ; final Region1 RX10_TEMP244 = RX10_TEMP243 . dReg ; final int RX10_TEMP245 = Program . searchPointInRegion1 ( RX10_TEMP244 , RX10_TEMP242 ) ; final int RX10_TEMP246 = 0 ; final boolean RX10_TEMP247 = RX10_TEMP245 < RX10_TEMP246 ; if ( RX10_TEMP247 ) { String RX10_TEMP248 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP248 ) ; }
 final place RX10_TEMP249 = Program . getPlaceFromDist1 ( RX10_TEMP243 , RX10_TEMP245 ) ; final place RX10_TEMP251 = here ; final boolean RX10_TEMP252 = RX10_TEMP249 != RX10_TEMP251 ; if ( RX10_TEMP252 ) { String RX10_TEMP250 = "Bad place access for array X10_TEMP124" ; throw new RuntimeException ( RX10_TEMP250 ) ; }
 Program . setRefArrayValue1boolean ( X10_TEMP124 , RX10_TEMP245 , X10_TEMP129 ) ; }
 }
 }

}

 
 value T1 {

 public final  Region1 RX10_TEMP14;

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region1Stub [ : rank==1 ] RX10_TEMP6;

 public final  StreamData tempSd;
public T1( final  Region1 a_RX10_TEMP14,  final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region1Stub [ : rank==1 ] a_RX10_TEMP6,  final  StreamData a_tempSd) { 
 this.RX10_TEMP14 = (a_RX10_TEMP14);
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
 this.tempSd = (a_tempSd);
}
}
 
 value T2 {

 public final  Point1 p6;

 public final  Point1 p1;

 public final  Region1RefArray1 dReg;

 public final  StreamData tempSd;
public T2( final  Point1 a_p6,  final  Point1 a_p1,  final  Region1RefArray1 a_dReg,  final  StreamData a_tempSd) { 
 this.p6 = (a_p6);
 this.p1 = (a_p1);
 this.dReg = (a_dReg);
 this.tempSd = (a_tempSd);
}
}
 
 value T3 {

 public final  Point1 p5;

 public final  Point1 p1;

 public final  StreamData tempSd;
public T3( final  Point1 a_p5,  final  Point1 a_p1,  final  StreamData a_tempSd) { 
 this.p5 = (a_p5);
 this.p1 = (a_p1);
 this.tempSd = (a_tempSd);
}
}
 
 value T4 {

 public final  Point1 p2;

 public final  Region1RefArray1 dReg;

 public final  StreamData tempSd;
public T4( final  Point1 a_p2,  final  Region1RefArray1 a_dReg,  final  StreamData a_tempSd) { 
 this.p2 = (a_p2);
 this.dReg = (a_dReg);
 this.tempSd = (a_tempSd);
}
}
 
 value T5 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T5( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T6 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T6( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T7 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T7( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T8 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  booleanStub [ : rank==1 ] RX10_TEMP6;
public T8( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  booleanStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T9 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T9( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T10 {

 public final  Region1Stub RX10_TEMP20;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Region1Stub [ : rank==1 ] RX10_TEMP6;
public T10( final  Region1Stub a_RX10_TEMP20,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Region1Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP20 = (a_RX10_TEMP20);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T11 {

 public final  StreamData tempSd;
public T11( final  StreamData a_tempSd) { 
 this.tempSd = (a_tempSd);
}
}
 
 value T12 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T12( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T13 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T13( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T14 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T14( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T15 {

 public final  booleanStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  booleanStub [ : rank==1 ] RX10_TEMP6;
public T15( final  booleanStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  booleanStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T16 {

 public final  doubleStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T16( final  doubleStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value booleanStub { public final boolean [ : rank==1 ] localArray ; public booleanStub ( final boolean [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T5 utmp5 = new T5(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread5(utmp5); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T6 utmp6 = new T6(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread6(utmp6); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T7 utmp7 = new T7(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread7(utmp7); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 }
 public void thread5(final T5 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T12 utmp12 = new T12(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread12(utmp12); }
 }
 }
 public void thread6(final T6 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T13 utmp13 = new T13(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread13(utmp13); }
 }
 }
 public void thread7(final T7 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T14 utmp14 = new T14(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread14(utmp14); }
 }
 }
 public void thread12(final T12 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread13(final T13 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread14(final T14 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }

} 

 value StreamData { public final booleanRefArray1 verified ; public final Dist1 D ; public final doubleRefArray1 times ; public final doubleRefArray1 a ; public final doubleRefArray1 b ; public final doubleRefArray1 c ; public StreamData ( final long N , final int NUM_TIMES ) { { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 0 ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; final Dist1 dverified = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final booleanRefArray1 X10_TEMP11 = this . StreamData_initVerified ( dverified ) ; this . verified = ( X10_TEMP11 ) ; final int X10_TEMP17 = ( 0 ) ; final int X10_TEMP13 = ( 1 ) ; final long X10_TEMP15 = ( N - X10_TEMP13 ) ; final int X10_TEMP18 = ( ( int ) X10_TEMP15 ) ; final Region1 X10_TEMP20 = Program . createNewRegion1R ( X10_TEMP17 , X10_TEMP18 ) ; final Dist1 X10_TEMP21 = Program . getBlockDist1 ( X10_TEMP20 ) ; final Dist1 temp_D = X10_TEMP21 ; this . D = ( temp_D ) ; final int X10_TEMP30 = ( 0 ) ; final int X10_TEMP26 = ( 1 ) ; final int X10_TEMP28 = ( NUM_TIMES - X10_TEMP26 ) ; final int X10_TEMP31 = ( ( int ) X10_TEMP28 ) ; final Region1 X10_TEMP32 = Program . createNewRegion1R ( X10_TEMP30 , X10_TEMP31 ) ; final place X10_TEMP33 = ( here ) ; final Dist1 X10_TEMP35 = Program . getPlaceDist1 ( X10_TEMP32 , X10_TEMP33 ) ; final doubleRefArray1 X10_TEMP37 = this . StreamData_initArray ( X10_TEMP35 ) ; this . times = ( X10_TEMP37 ) ; final doubleRefArray1 X10_TEMP41 = this . StreamData_initArray ( temp_D ) ; this . a = ( X10_TEMP41 ) ; final doubleRefArray1 X10_TEMP45 = this . StreamData_initArray ( temp_D ) ; this . b = ( X10_TEMP45 ) ; final doubleRefArray1 X10_TEMP49 = this . StreamData_initArray ( temp_D ) ; this . c = ( X10_TEMP49 ) ; }
 }
 public booleanRefArray1 StreamData_initVerified ( final Dist1 d ) { { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final booleanStub [ : rank==1 ] RX10_TEMP6 = ( booleanStub [ : rank==1 ] ) ( new booleanStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T8 utmp8 = new T8(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread8(utmp8); }
 }
 }
 final booleanStub value [ : rank==1 ] RX10_TEMP17 = ( booleanStub value [ : rank==1 ] ) ( new booleanStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final booleanStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final booleanRefArray1 RX10_TEMP20 = new booleanRefArray1 ( d , RX10_TEMP17 ) ; final booleanRefArray1 X10_TEMP3 = RX10_TEMP20 ; return X10_TEMP3 ; }
 }
 public doubleRefArray1 StreamData_initArray ( final Dist1 d ) { { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T9 utmp9 = new T9(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread9(utmp9); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final doubleRefArray1 RX10_TEMP19 = new doubleRefArray1 ( d , RX10_TEMP16 ) ; final doubleRefArray1 X10_TEMP1 = RX10_TEMP19 ; return X10_TEMP1 ; }
 }
 public void thread8(final T8 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  booleanStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final boolean [ : rank==1 ] RX10_TEMP15 = ( boolean [ : rank==1 ] ) ( new boolean [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { { final boolean X10_TEMP2 = ( true ) ; return X10_TEMP2 ; }
 }
 ) ; final booleanStub RX10_TEMP16 = new booleanStub ( RX10_TEMP15 ) ; 
 final T15 utmp15 = new T15(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread15(utmp15); }
 }
 }
 public void thread9(final T9 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; 
 final T16 utmp16 = new T16(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread16(utmp16); }
 }
 }
 public void thread15(final T15 utmpz) {final  booleanStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  booleanStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread16(final T16 utmpz) {final  doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }

} 

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; }
 public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

} 

 value booleanRefArray1 { public final Dist1 distValue ; public final booleanStub value [ : rank==1 ] contents ; public booleanRefArray1 ( final Dist1 distValue_ , final booleanStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Region1Stub { public final Region1 [ : rank==1 ] localArray ; public Region1Stub ( final Region1 [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value Region1RefArray1 { public final Dist1 distValue ; public final Region1Stub value [ : rank==1 ] contents ; public Region1RefArray1 ( final Dist1 distValue_ , final Region1Stub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 class Stream { public final StreamData sd ; public Stream ( ) { { long X10_TEMP3 = ( Program . _Stream_N ) ; int X10_TEMP4 = ( Program . _Stream_NUM_TIMES ) ; final StreamData X10_TEMP6 = ( new StreamData ( X10_TEMP3 , X10_TEMP4 ) ) ; this . sd = ( X10_TEMP6 ) ; }
 }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

