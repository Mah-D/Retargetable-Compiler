 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static final Region1 _MR_r = Program . _MR_r_init ( ) ; public static int _Timer_max_counters_init ( ) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; }
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
 public static void runMain ( ) { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; }
 finish { final MR X10_TEMP4 = ( new MR ( ) ) ; Program . MR_run ( X10_TEMP4 ) ; }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP7 = ( "Wall-clock time for mapreduce: " ) ; final double X10_TEMP8 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " secs" ) ; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; System.out.println ( X10_TEMP12 ) ; }
 public static Region1 _MR_r_init ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 300000 ) ; final Region1 X10_TEMP6 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; return X10_TEMP6 ; }
 public static void MR_run ( final MR X10_TEMP0 ) { Program . MR_map ( X10_TEMP0 ) ; Program . MR_reduce ( X10_TEMP0 ) ; final int X10_TEMP2 = ( X10_TEMP0 . total ) ; final String X10_TEMP4 = "" ; final String X10_TEMP3 = X10_TEMP4 + X10_TEMP2 ; System.out.println ( X10_TEMP3 ) ; }
 public static void MR_map ( final MR X10_TEMP0 ) { final intRefArray1 b = X10_TEMP0 . a ; finish { final Dist1 RX10_TEMP1 = b . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP5 = 1 ; int RX10_TEMP3 = RX10_TEMP2 . regSize ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP4 ) { final int RX10_TEMP6 = RX10_TEMP0 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; final Dist1 RX10_TEMP7 = b . distValue ; final Dist1 X10_TEMP3 = RX10_TEMP7 ; final Region1 RX10_TEMP8 = X10_TEMP3 . dReg ; final int RX10_TEMP9 = Program . searchPointInRegion1 ( RX10_TEMP8 , p ) ; final int RX10_TEMP10 = 0 ; final boolean RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; if ( RX10_TEMP11 ) { final String RX10_TEMP12 = "Point p not found in the distribution X10_TEMP3." ; throw new RuntimeException ( RX10_TEMP12 ) ; }
 final place RX10_TEMP13 = Program . getPlaceFromDist1 ( X10_TEMP3 , RX10_TEMP9 ) ; final place X10_TEMP4 = RX10_TEMP13 ; 
 final T1 utmp1 = new T1(p, b, X10_TEMP0);
 async (X10_TEMP4) {Program.thread1(utmp1); }
 }
 }
 }
 public static int MR_f ( final MR X10_TEMP0 , final int x ) { final int X10_TEMP2 = ( x * x ) ; return X10_TEMP2 ; }
 public static void MR_reduce ( final MR X10_TEMP0 ) { final place h = ( here ) ; final intRefArray1 X10_TEMP2 = X10_TEMP0 . a ; final Dist1 RX10_TEMP0 = X10_TEMP2 . distValue ; final Region1 RX10_TEMP1 = RX10_TEMP0 . dReg ; final Region1 reg = RX10_TEMP1 ; final place X10_TEMP4 = ( here ) ; final Dist1 dis = Program . getPlaceDist1 ( reg , X10_TEMP4 ) ; final Region1 RX10_TEMP2 = dis . dReg ; final int RX10_TEMP3 = 0 ; final int RX10_TEMP4 = 1 ; int RX10_TEMP5 = place.MAX_PLACES ; RX10_TEMP5 = RX10_TEMP5 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP6 = [ 0 : RX10_TEMP5 ] ; final dist ( : rank==1 ) RX10_TEMP7 = [ 0 : RX10_TEMP5 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP8 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP7 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP9 : RX10_TEMP6 ) { final place RX10_TEMP10 = here ; final int RX10_TEMP11 = RX10_TEMP9 [0] ; final place RX10_TEMP12 = place.places ( RX10_TEMP11 ) ; final int RX10_TEMP13 = Program . getDistLocalCount1 ( dis , RX10_TEMP11 ) ; final int RX10_TEMP14 = RX10_TEMP13 - RX10_TEMP4 ; 
 final T2 utmp2 = new T2(RX10_TEMP14, RX10_TEMP10, RX10_TEMP9, RX10_TEMP8);
 async (RX10_TEMP12) {Program.thread2(utmp2); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP18 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP6 ] ( point ( : rank==1 ) RX10_TEMP20 ) { final intStub RX10_TEMP19 = RX10_TEMP8 [ RX10_TEMP20 ] ; return RX10_TEMP19 ; }
 ) ; final intRefArray1 RX10_TEMP21 = new intRefArray1 ( dis , RX10_TEMP18 ) ; final intRefArray1 result = RX10_TEMP21 ; final intRefArray1 X10_TEMP8 = X10_TEMP0 . a ; final Dist1 RX10_TEMP23 = X10_TEMP8 . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP27 = 1 ; int RX10_TEMP25 = RX10_TEMP24 . regSize ; RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27 ; final region ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP25 ] ; for ( point ( : rank==1 ) RX10_TEMP22 : RX10_TEMP26 ) { final int RX10_TEMP28 = RX10_TEMP22 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP24 , RX10_TEMP28 ) ; finish { final intRefArray1 c = X10_TEMP0 . a ; final intRefArray1 X10_TEMP10 = X10_TEMP0 . a ; final Dist1 RX10_TEMP29 = X10_TEMP10 . distValue ; final Dist1 X10_TEMP11 = RX10_TEMP29 ; final Region1 RX10_TEMP30 = X10_TEMP11 . dReg ; final int RX10_TEMP31 = Program . searchPointInRegion1 ( RX10_TEMP30 , p ) ; final int RX10_TEMP32 = 0 ; final boolean RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; if ( RX10_TEMP33 ) { final String RX10_TEMP34 = "Point p not found in the distribution X10_TEMP11." ; throw new RuntimeException ( RX10_TEMP34 ) ; }
 final place RX10_TEMP35 = Program . getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP31 ) ; final place X10_TEMP14 = RX10_TEMP35 ; 
 final T3 utmp3 = new T3(c, p, result, h);
 async (X10_TEMP14) {Program.thread3(utmp3); }
 }
 }
 final Dist1 RX10_TEMP58 = result . distValue ; final Region1 RX10_TEMP59 = RX10_TEMP58 . dReg ; final int RX10_TEMP62 = 1 ; int RX10_TEMP60 = RX10_TEMP59 . regSize ; RX10_TEMP60 = RX10_TEMP60 - RX10_TEMP62 ; final region ( : rank==1 ) RX10_TEMP61 = [ 0 : RX10_TEMP60 ] ; for ( point ( : rank==1 ) RX10_TEMP57 : RX10_TEMP61 ) { final int RX10_TEMP63 = RX10_TEMP57 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP59 , RX10_TEMP63 ) ; final int X10_TEMP23 = ( X10_TEMP0 . total ) ; final Dist1 RX10_TEMP64 = result . distValue ; final Region1 RX10_TEMP65 = RX10_TEMP64 . dReg ; final int RX10_TEMP66 = Program . searchPointInRegion1 ( RX10_TEMP65 , p ) ; final int RX10_TEMP67 = 0 ; final boolean RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP69 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP69 ) ; }
 final place RX10_TEMP70 = Program . getPlaceFromDist1 ( RX10_TEMP64 , RX10_TEMP66 ) ; final place RX10_TEMP72 = here ; final boolean RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72 ; if ( RX10_TEMP73 ) { String RX10_TEMP71 = "Bad place access for array result" ; throw new RuntimeException ( RX10_TEMP71 ) ; }
 final int RX10_TEMP74 = Program . getRefArrayValue1int ( result , RX10_TEMP66 ) ; final int X10_TEMP24 = ( RX10_TEMP74 ) ; final int X10_TEMP26 = ( X10_TEMP23 + X10_TEMP24 ) ; final int X10_TEMP27 = ( X10_TEMP26 ) ; X10_TEMP0 . total = ( X10_TEMP27 ) ; }
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
 public static void setRefArrayValue1double ( final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
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

 public static void thread1(final T1 utmpz) {final  Point1 p = utmpz.p;
final  intRefArray1 b = utmpz.b;
final  MR X10_TEMP0 = utmpz.X10_TEMP0;
 { final Dist1 RX10_TEMP14 = b . distValue ; final Region1 RX10_TEMP15 = RX10_TEMP14 . dReg ; final int RX10_TEMP16 = Program . searchPointInRegion1 ( RX10_TEMP15 , p ) ; final int RX10_TEMP17 = 0 ; final boolean RX10_TEMP18 = RX10_TEMP16 < RX10_TEMP17 ; if ( RX10_TEMP18 ) { String RX10_TEMP19 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 final place RX10_TEMP20 = Program . getPlaceFromDist1 ( RX10_TEMP14 , RX10_TEMP16 ) ; final place RX10_TEMP22 = here ; final boolean RX10_TEMP23 = RX10_TEMP20 != RX10_TEMP22 ; if ( RX10_TEMP23 ) { String RX10_TEMP21 = "Bad place access for array b" ; throw new RuntimeException ( RX10_TEMP21 ) ; }
 final int RX10_TEMP24 = Program . getRefArrayValue1int ( b , RX10_TEMP16 ) ; final int X10_TEMP8 = ( RX10_TEMP24 ) ; final int X10_TEMP10 = ( Program . MR_f ( X10_TEMP0 , X10_TEMP8 ) ) ; final int X10_TEMP11 = ( X10_TEMP10 ) ; final Dist1 RX10_TEMP25 = b . distValue ; final Region1 RX10_TEMP26 = RX10_TEMP25 . dReg ; final int RX10_TEMP27 = Program . searchPointInRegion1 ( RX10_TEMP26 , p ) ; final int RX10_TEMP28 = 0 ; final boolean RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; if ( RX10_TEMP29 ) { String RX10_TEMP30 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 final place RX10_TEMP31 = Program . getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; final place RX10_TEMP33 = here ; final boolean RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; if ( RX10_TEMP34 ) { String RX10_TEMP32 = "Bad place access for array b" ; throw new RuntimeException ( RX10_TEMP32 ) ; }
 Program . setRefArrayValue1int ( b , RX10_TEMP27 , X10_TEMP11 ) ; }
 }
 public static void thread2(final T2 utmpz) {final  int RX10_TEMP14 = utmpz.RX10_TEMP14;
final  place RX10_TEMP10 = utmpz.RX10_TEMP10;
final  point ( : rank==1 ) RX10_TEMP9 = utmpz.RX10_TEMP9;
final  intStub [ : rank==1 ] RX10_TEMP8 = utmpz.RX10_TEMP8;
 { final dist ( : rank==1 ) RX10_TEMP15 = [ 0 : RX10_TEMP14 ] -> here ; final int [ : rank==1 ] RX10_TEMP16 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP15 ] ) ; final intStub RX10_TEMP17 = new intStub ( RX10_TEMP16 ) ; 
 final T8 utmp8 = new T8(RX10_TEMP17, RX10_TEMP9, RX10_TEMP8);
 async (RX10_TEMP10) {Program.thread8(utmp8); }
 }
 }
 public static void thread3(final T3 utmpz) {final  intRefArray1 c = utmpz.c;
final  Point1 p = utmpz.p;
final  intRefArray1 result = utmpz.result;
final  place h = utmpz.h;
 { final Dist1 RX10_TEMP36 = c . distValue ; final Region1 RX10_TEMP37 = RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , p ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP41 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final place RX10_TEMP42 = Program . getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access for array c" ; throw new RuntimeException ( RX10_TEMP43 ) ; }
 final int RX10_TEMP46 = Program . getRefArrayValue1int ( c , RX10_TEMP38 ) ; final int v = ( RX10_TEMP46 ) ; 
 final T9 utmp9 = new T9(v, p, result);
 async (h) {Program.thread9(utmp9); }
 }
 }
 public static void thread8(final T8 utmpz) {final  intStub RX10_TEMP17 = utmpz.RX10_TEMP17;
final  point ( : rank==1 ) RX10_TEMP9 = utmpz.RX10_TEMP9;
final  intStub [ : rank==1 ] RX10_TEMP8 = utmpz.RX10_TEMP8;
 { RX10_TEMP8 [ RX10_TEMP9 ] = ( RX10_TEMP17 ) ; }
 }
 public static void thread9(final T9 utmpz) {final  int v = utmpz.v;
final  Point1 p = utmpz.p;
final  intRefArray1 result = utmpz.result;
 { final int X10_TEMP20 = ( v ) ; final Dist1 RX10_TEMP47 = result . distValue ; final Region1 RX10_TEMP48 = RX10_TEMP47 . dReg ; final int RX10_TEMP49 = Program . searchPointInRegion1 ( RX10_TEMP48 , p ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final place RX10_TEMP53 = Program . getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ; final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array result" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 Program . setRefArrayValue1int ( result , RX10_TEMP49 , X10_TEMP20 ) ; }
 }

}

 
 value T1 {

 public final  Point1 p;

 public final  intRefArray1 b;

 public final  MR X10_TEMP0;
public T1( final  Point1 a_p,  final  intRefArray1 a_b,  final  MR a_X10_TEMP0) { 
 this.p = (a_p);
 this.b = (a_b);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T2 {

 public final  int RX10_TEMP14;

 public final  place RX10_TEMP10;

 public final  point ( : rank==1 ) RX10_TEMP9;

 public final  intStub [ : rank==1 ] RX10_TEMP8;
public T2( final  int a_RX10_TEMP14,  final  place a_RX10_TEMP10,  final  point ( : rank==1 ) a_RX10_TEMP9,  final  intStub [ : rank==1 ] a_RX10_TEMP8) { 
 this.RX10_TEMP14 = (a_RX10_TEMP14);
 this.RX10_TEMP10 = (a_RX10_TEMP10);
 this.RX10_TEMP9 = (a_RX10_TEMP9);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
}
}
 
 value T3 {

 public final  intRefArray1 c;

 public final  Point1 p;

 public final  intRefArray1 result;

 public final  place h;
public T3( final  intRefArray1 a_c,  final  Point1 a_p,  final  intRefArray1 a_result,  final  place a_h) { 
 this.c = (a_c);
 this.p = (a_p);
 this.result = (a_result);
 this.h = (a_h);
}
}
 
 value T4 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T4( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T5 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T5( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T6 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T6( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T7 {

 public final  Region1 RX10_TEMP14;

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T7( final  Region1 a_RX10_TEMP14,  final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP14 = (a_RX10_TEMP14);
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T8 {

 public final  intStub RX10_TEMP17;

 public final  point ( : rank==1 ) RX10_TEMP9;

 public final  intStub [ : rank==1 ] RX10_TEMP8;
public T8( final  intStub a_RX10_TEMP17,  final  point ( : rank==1 ) a_RX10_TEMP9,  final  intStub [ : rank==1 ] a_RX10_TEMP8) { 
 this.RX10_TEMP17 = (a_RX10_TEMP17);
 this.RX10_TEMP9 = (a_RX10_TEMP9);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
}
}
 
 value T9 {

 public final  int v;

 public final  Point1 p;

 public final  intRefArray1 result;
public T9( final  int a_v,  final  Point1 a_p,  final  intRefArray1 a_result) { 
 this.v = (a_v);
 this.p = (a_p);
 this.result = (a_result);
}
}
 
 value T10 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T10( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T11 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T11( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T12 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T12( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T13 {

 public final  intStub RX10_TEMP19;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T13( final  intStub a_RX10_TEMP19,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP19 = (a_RX10_TEMP19);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value intStub { public final int [ : rank==1 ] localArray ; public intStub ( final int [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T4 utmp4 = new T4(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread4(utmp4); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T5 utmp5 = new T5(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread5(utmp5); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T6 utmp6 = new T6(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread6(utmp6); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 public void thread4(final T4 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T10 utmp10 = new T10(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread10(utmp10); }
 }
 }
 public void thread5(final T5 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T11 utmp11 = new T11(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread11(utmp11); }
 }
 }
 public void thread6(final T6 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T12 utmp12 = new T12(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread12(utmp12); }
 }
 }
 public void thread10(final T10 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread11(final T11 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread12(final T12 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }

} 

 value intRefArray1 { public final Dist1 distValue ; public final intStub value [ : rank==1 ] contents ; public intRefArray1 ( final Dist1 distValue_ , final intStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; }
 public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

} 

 class MR { public intRefArray1 a ; public int total ; public MR ( ) { final Region1 X10_TEMP2 = Program . _MR_r ; final Dist1 X10_TEMP3 = Program . getBlockDist1 ( X10_TEMP2 ) ; final Dist1 d = X10_TEMP3 ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP6 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; final Dist1 RX10_TEMP13 = Program . restrictDist1 ( d , RX10_TEMP10 ) ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; 
 final T7 utmp7 = new T7(RX10_TEMP14, RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread7(utmp7); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP20 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP22 ) { final intStub RX10_TEMP21 = RX10_TEMP6 [ RX10_TEMP22 ] ; return RX10_TEMP21 ; }
 ) ; final intRefArray1 RX10_TEMP23 = new intRefArray1 ( d , RX10_TEMP20 ) ; final intRefArray1 X10_TEMP9 = RX10_TEMP23 ; this . a = ( X10_TEMP9 ) ; final int X10_TEMP11 = ( 0 ) ; this . total = ( X10_TEMP11 ) ; }
 public void thread7(final T7 utmpz) {final  Region1 RX10_TEMP14 = utmpz.RX10_TEMP14;
final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP17 = [ 0 : RX10_TEMP12 ] -> here ; final int [ : rank==1 ] RX10_TEMP18 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP17 ] ( point ( : rank==1 ) RX10_TEMP15 ) { final int RX10_TEMP16 = RX10_TEMP15 [0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; final int X10_TEMP7 = ( p . f0 ) ; return X10_TEMP7 ; }
 ) ; final intStub RX10_TEMP19 = new intStub ( RX10_TEMP18 ) ; 
 final T13 utmp13 = new T13(RX10_TEMP19, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread13(utmp13); }
 }
 }
 public void thread13(final T13 utmpz) {final  intStub RX10_TEMP19 = utmpz.RX10_TEMP19;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP19 ) ; }
 }

} 

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

