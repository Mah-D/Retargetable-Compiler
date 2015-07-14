 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } } class Program { public static final int
_Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static void runMain ( ) { Timer tmr = ( new Timer ( ) ) ; int count =
( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; } finish { final Series X10_TEMP4 = ( new Series ( ) ) ; Program . Series_run (
X10_TEMP4 ) ; } Program . Timer_stop ( tmr , count ) ; final String X10_TEMP7 = ( "Wall-clock time for series: " ) ; final double X10_TEMP8
= ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " secs" )
; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; System.out.println ( X10_TEMP12 ) ; } public static int _Timer_max_counters_init (
) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; } public static void Timer_start ( final Timer X10_TEMP0 , final int n ) { final
doubleRefArray1 X10_TEMP1 = X10_TEMP0 . start_time ; final double X10_TEMP4 = ( System.currentTimeMillis ( ) ) ; final double X10_TEMP5 = (
X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 =
RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final
boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new
RuntimeException ( RX10_TEMP6 ) ; } final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place
RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for
array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; } Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ;
} public static void Timer_stop ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . elapsed_time ; final
double X10_TEMP5 = ( System.currentTimeMillis ( ) ) ; final doubleRefArray1 X10_TEMP3 = X10_TEMP0 . start_time ; final Point1 RX10_TEMP0 =
new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP3 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 =
Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ;
if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; } final place
RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 =
RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; throw new RuntimeException (
RX10_TEMP8 ) ; } final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP3 , RX10_TEMP3 ) ; final double X10_TEMP6 = (
RX10_TEMP11 ) ; final double X10_TEMP8 = ( X10_TEMP5 - X10_TEMP6 ) ; final double X10_TEMP9 = ( X10_TEMP8 ) ; final Point1 RX10_TEMP12 = new
Point1 ( n ) ; final Dist1 RX10_TEMP13 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 =
Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 <
RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; } final
place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 =
RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException (
RX10_TEMP20 ) ; } Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; final doubleRefArray1 X10_TEMP10 = X10_TEMP0 .
elapsed_time ; final doubleRefArray1 X10_TEMP12 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP23 = new Point1 ( n ) ; final Dist1
RX10_TEMP24 = X10_TEMP12 . distValue ; final Region1 RX10_TEMP25 = RX10_TEMP24 . dReg ; final int RX10_TEMP26 = Program .
searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; final int RX10_TEMP27 = 0 ; final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; if
( RX10_TEMP28 ) { String RX10_TEMP29 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP29 ) ; } final place
RX10_TEMP30 = Program . getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; final place RX10_TEMP32 = here ; final boolean RX10_TEMP33 =
RX10_TEMP30 != RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; throw new RuntimeException
( RX10_TEMP31 ) ; } final double RX10_TEMP34 = Program . getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; final double X10_TEMP14 = (
RX10_TEMP34 ) ; final int X10_TEMP15 = ( 1000 ) ; final double X10_TEMP17 = ( X10_TEMP14 / X10_TEMP15 ) ; final double X10_TEMP18 = (
X10_TEMP17 ) ; final Point1 RX10_TEMP35 = new Point1 ( n ) ; final Dist1 RX10_TEMP36 = X10_TEMP10 . distValue ; final Region1 RX10_TEMP37 =
RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; final int RX10_TEMP39 = 0 ;
final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP41 = "Array index out of bounds" ; throw new
RuntimeException ( RX10_TEMP41 ) ; } final place RX10_TEMP42 = Program . getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place
RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access
for array X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP43 ) ; } Program . setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 ,
X10_TEMP18 ) ; final doubleRefArray1 X10_TEMP19 = X10_TEMP0 . total_time ; final doubleRefArray1 X10_TEMP21 = X10_TEMP0 . total_time ; final
Point1 RX10_TEMP46 = new Point1 ( n ) ; final Dist1 RX10_TEMP47 = X10_TEMP21 . distValue ; final Region1 RX10_TEMP48 = RX10_TEMP47 . dReg ;
final int RX10_TEMP49 = Program . searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51
= RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array access index out of bounds" ; throw new RuntimeException (
RX10_TEMP52 ) ; } final place RX10_TEMP53 = Program . getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ;
final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array X10_TEMP21" ;
throw new RuntimeException ( RX10_TEMP54 ) ; } final double RX10_TEMP57 = Program . getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ;
final double X10_TEMP25 = ( RX10_TEMP57 ) ; final doubleRefArray1 X10_TEMP23 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP58 = new
Point1 ( n ) ; final Dist1 RX10_TEMP59 = X10_TEMP23 . distValue ; final Region1 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 =
Program . searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 <
RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
final place RX10_TEMP65 = Program . getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean
RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; throw new
RuntimeException ( RX10_TEMP66 ) ; } final double RX10_TEMP69 = Program . getRefArrayValue1double ( X10_TEMP23 , RX10_TEMP61 ) ; final
double X10_TEMP26 = ( RX10_TEMP69 ) ; final double X10_TEMP28 = ( X10_TEMP25 + X10_TEMP26 ) ; final double X10_TEMP29 = ( X10_TEMP28 ) ;
final Point1 RX10_TEMP70 = new Point1 ( n ) ; final Dist1 RX10_TEMP71 = X10_TEMP19 . distValue ; final Region1 RX10_TEMP72 = RX10_TEMP71 .
dReg ; final int RX10_TEMP73 = Program . searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; final int RX10_TEMP74 = 0 ; final boolean
RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; if ( RX10_TEMP75 ) { String RX10_TEMP76 = "Array index out of bounds" ; throw new RuntimeException
( RX10_TEMP76 ) ; } final place RX10_TEMP77 = Program . getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; final place RX10_TEMP79 = here ;
final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP78 = "Bad place access for array X10_TEMP19" ;
throw new RuntimeException ( RX10_TEMP78 ) ; } Program . setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; } public static
double Timer_readTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final Point1
RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int
RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 <
RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10
= RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException (
RX10_TEMP8 ) ; } final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; final double X10_TEMP4 = (
RX10_TEMP11 ) ; return X10_TEMP4 ; } public static void Timer_resetTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1
X10_TEMP1 = X10_TEMP0 . total_time ; final double X10_TEMP4 = ( 0 ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new
Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 =
Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ;
if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; } final place RX10_TEMP7 =
Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 !=
RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; final doubleRefArray1 X10_TEMP6 = X10_TEMP0 . start_time ; final
double X10_TEMP9 = ( 0 ) ; final double X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( n ) ; final Dist1 RX10_TEMP12 =
X10_TEMP6 . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 (
RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) {
String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; } final place RX10_TEMP18 = Program .
getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ;
if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP19 ) ; } Program .
setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; final doubleRefArray1 X10_TEMP11 = X10_TEMP0 . elapsed_time ; final
double X10_TEMP14 = ( 0 ) ; final double X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( n ) ; final Dist1 RX10_TEMP23
= X10_TEMP11 . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 (
RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) {
String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; } final place RX10_TEMP29 = Program .
getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ;
if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP30 ) ; } Program .
setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; } public static void Timer_resetAllTimers ( final Timer X10_TEMP0 ) {
int i = ( 0 ) ; boolean X10_TEMP4 = i < _Timer_max_counters ; while ( X10_TEMP4 ) { Program . Timer_resetTimer ( X10_TEMP0 , i ) ; final int
X10_TEMP6 = ( i ) ; final int X10_TEMP7 = 1 ; i = i + X10_TEMP7 ; X10_TEMP4 = i < _Timer_max_counters ; } } public static void
Series_setSize ( final Series X10_TEMP0 , final int setsize ) { final int X10_TEMP2 = ( setsize ) ; X10_TEMP0 . setsize = ( X10_TEMP2 ) ; }
public static void Series_initialise ( final Series X10_TEMP0 , final int n ) { final int X10_TEMP2 = ( n ) ; X10_TEMP0 . array_rows = (
X10_TEMP2 ) ; Program . Series_buildTestData ( X10_TEMP0 ) ; } public static void Series_kernel ( final Series X10_TEMP0 ) { Program .
Series_Do ( X10_TEMP0 ) ; } public static void Series_initRefArray ( final Series X10_TEMP0 , final doubleRefArray2 ref ) { final int
X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 0 ) ; final double X10_TEMP6 = ( 2.8729524964837996 ) ; final double X10_TEMP7 = ( X10_TEMP6 ) ;
final Point2 RX10_TEMP0 = new Point2 ( X10_TEMP3 , X10_TEMP4 ) ; final Dist2 RX10_TEMP1 = ref . distValue ; final Region2 RX10_TEMP2 =
RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final
boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new
RuntimeException ( RX10_TEMP6 ) ; } final place RX10_TEMP7 = Program . getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place
RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for
array ref" ; throw new RuntimeException ( RX10_TEMP8 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP3 , X10_TEMP7 ) ; final int
X10_TEMP10 = ( 0 ) ; final int X10_TEMP11 = ( 1 ) ; final double X10_TEMP13 = ( 0.0 ) ; final double X10_TEMP14 = ( X10_TEMP13 ) ; final
Point2 RX10_TEMP11 = new Point2 ( X10_TEMP10 , X10_TEMP11 ) ; final Dist2 RX10_TEMP12 = ref . distValue ; final Region2 RX10_TEMP13 =
RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion2 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ;
final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new
RuntimeException ( RX10_TEMP17 ) ; } final place RX10_TEMP18 = Program . getPlaceFromDist2 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place
RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access
for array ref" ; throw new RuntimeException ( RX10_TEMP19 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP14 , X10_TEMP14 ) ; final
int X10_TEMP17 = ( 1 ) ; final int X10_TEMP18 = ( 0 ) ; final double X10_TEMP20 = ( 1.1161046676147888 ) ; final double X10_TEMP21 = (
X10_TEMP20 ) ; final Point2 RX10_TEMP22 = new Point2 ( X10_TEMP17 , X10_TEMP18 ) ; final Dist2 RX10_TEMP23 = ref . distValue ; final Region2
RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion2 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int
RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of
bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; } final place RX10_TEMP29 = Program . getPlaceFromDist2 ( RX10_TEMP23 , RX10_TEMP25 )
; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad
place access for array ref" ; throw new RuntimeException ( RX10_TEMP30 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP25 ,
X10_TEMP21 ) ; final int X10_TEMP24 = ( 1 ) ; final int X10_TEMP25 = ( 1 ) ; final double X10_TEMP26 = ( 1.8819691893398025 ) ; final int
X10_TEMP27 = 0 ; final double X10_TEMP29 = ( X10_TEMP27 - X10_TEMP26 ) ; final double X10_TEMP30 = ( X10_TEMP29 ) ; final Point2 RX10_TEMP33
= new Point2 ( X10_TEMP24 , X10_TEMP25 ) ; final Dist2 RX10_TEMP34 = ref . distValue ; final Region2 RX10_TEMP35 = RX10_TEMP34 . dReg ;
final int RX10_TEMP36 = Program . searchPointInRegion2 ( RX10_TEMP35 , RX10_TEMP33 ) ; final int RX10_TEMP37 = 0 ; final boolean RX10_TEMP38
= RX10_TEMP36 < RX10_TEMP37 ; if ( RX10_TEMP38 ) { String RX10_TEMP39 = "Array index out of bounds" ; throw new RuntimeException (
RX10_TEMP39 ) ; } final place RX10_TEMP40 = Program . getPlaceFromDist2 ( RX10_TEMP34 , RX10_TEMP36 ) ; final place RX10_TEMP42 = here ;
final boolean RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; if ( RX10_TEMP43 ) { String RX10_TEMP41 = "Bad place access for array ref" ; throw
new RuntimeException ( RX10_TEMP41 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP36 , X10_TEMP30 ) ; final int X10_TEMP33 = ( 2 )
; final int X10_TEMP34 = ( 0 ) ; final double X10_TEMP36 = ( 0.34429060398168704 ) ; final double X10_TEMP37 = ( X10_TEMP36 ) ; final Point2
RX10_TEMP44 = new Point2 ( X10_TEMP33 , X10_TEMP34 ) ; final Dist2 RX10_TEMP45 = ref . distValue ; final Region2 RX10_TEMP46 = RX10_TEMP45 .
dReg ; final int RX10_TEMP47 = Program . searchPointInRegion2 ( RX10_TEMP46 , RX10_TEMP44 ) ; final int RX10_TEMP48 = 0 ; final boolean
RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; if ( RX10_TEMP49 ) { String RX10_TEMP50 = "Array index out of bounds" ; throw new RuntimeException
( RX10_TEMP50 ) ; } final place RX10_TEMP51 = Program . getPlaceFromDist2 ( RX10_TEMP45 , RX10_TEMP47 ) ; final place RX10_TEMP53 = here ;
final boolean RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; if ( RX10_TEMP54 ) { String RX10_TEMP52 = "Bad place access for array ref" ; throw
new RuntimeException ( RX10_TEMP52 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP47 , X10_TEMP37 ) ; final int X10_TEMP40 = ( 2 )
; final int X10_TEMP41 = ( 1 ) ; final double X10_TEMP42 = ( 1.1645642623320958 ) ; final int X10_TEMP43 = 0 ; final double X10_TEMP45 = (
X10_TEMP43 - X10_TEMP42 ) ; final double X10_TEMP46 = ( X10_TEMP45 ) ; final Point2 RX10_TEMP55 = new Point2 ( X10_TEMP40 , X10_TEMP41 ) ;
final Dist2 RX10_TEMP56 = ref . distValue ; final Region2 RX10_TEMP57 = RX10_TEMP56 . dReg ; final int RX10_TEMP58 = Program .
searchPointInRegion2 ( RX10_TEMP57 , RX10_TEMP55 ) ; final int RX10_TEMP59 = 0 ; final boolean RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; if
( RX10_TEMP60 ) { String RX10_TEMP61 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP61 ) ; } final place RX10_TEMP62
= Program . getPlaceFromDist2 ( RX10_TEMP56 , RX10_TEMP58 ) ; final place RX10_TEMP64 = here ; final boolean RX10_TEMP65 = RX10_TEMP62 !=
RX10_TEMP64 ; if ( RX10_TEMP65 ) { String RX10_TEMP63 = "Bad place access for array ref" ; throw new RuntimeException ( RX10_TEMP63 ) ; }
Program . setRefArrayValue2double ( ref , RX10_TEMP58 , X10_TEMP46 ) ; final int X10_TEMP49 = ( 3 ) ; final int X10_TEMP50 = ( 0 ) ; final
double X10_TEMP52 = ( 0.15238898702519288 ) ; final double X10_TEMP53 = ( X10_TEMP52 ) ; final Point2 RX10_TEMP66 = new Point2 ( X10_TEMP49
, X10_TEMP50 ) ; final Dist2 RX10_TEMP67 = ref . distValue ; final Region2 RX10_TEMP68 = RX10_TEMP67 . dReg ; final int RX10_TEMP69 =
Program . searchPointInRegion2 ( RX10_TEMP68 , RX10_TEMP66 ) ; final int RX10_TEMP70 = 0 ; final boolean RX10_TEMP71 = RX10_TEMP69 <
RX10_TEMP70 ; if ( RX10_TEMP71 ) { String RX10_TEMP72 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP72 ) ; } final
place RX10_TEMP73 = Program . getPlaceFromDist2 ( RX10_TEMP67 , RX10_TEMP69 ) ; final place RX10_TEMP75 = here ; final boolean RX10_TEMP76 =
RX10_TEMP73 != RX10_TEMP75 ; if ( RX10_TEMP76 ) { String RX10_TEMP74 = "Bad place access for array ref" ; throw new RuntimeException (
RX10_TEMP74 ) ; } Program . setRefArrayValue2double ( ref , RX10_TEMP69 , X10_TEMP53 ) ; final int X10_TEMP56 = ( 3 ) ; final int X10_TEMP57
= ( 1 ) ; final double X10_TEMP58 = ( 0.8143461113044298 ) ; final int X10_TEMP59 = 0 ; final double X10_TEMP61 = ( X10_TEMP59 - X10_TEMP58
) ; final double X10_TEMP62 = ( X10_TEMP61 ) ; final Point2 RX10_TEMP77 = new Point2 ( X10_TEMP56 , X10_TEMP57 ) ; final Dist2 RX10_TEMP78 =
ref . distValue ; final Region2 RX10_TEMP79 = RX10_TEMP78 . dReg ; final int RX10_TEMP80 = Program . searchPointInRegion2 ( RX10_TEMP79 ,
RX10_TEMP77 ) ; final int RX10_TEMP81 = 0 ; final boolean RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81 ; if ( RX10_TEMP82 ) { String RX10_TEMP83
= "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP83 ) ; } final place RX10_TEMP84 = Program . getPlaceFromDist2 (
RX10_TEMP78 , RX10_TEMP80 ) ; final place RX10_TEMP86 = here ; final boolean RX10_TEMP87 = RX10_TEMP84 != RX10_TEMP86 ; if ( RX10_TEMP87 ) {
String RX10_TEMP85 = "Bad place access for array ref" ; throw new RuntimeException ( RX10_TEMP85 ) ; } Program . setRefArrayValue2double (
ref , RX10_TEMP80 , X10_TEMP62 ) ; } public static void Series_validate ( final Series X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int
X10_TEMP4 = ( 3 ) ; final int X10_TEMP7 = ( 0 ) ; final int X10_TEMP8 = ( 1 ) ; final Region2 r = Program . createNewRegion2RR ( X10_TEMP3 ,
X10_TEMP4 , X10_TEMP7 , X10_TEMP8 ) ; final place X10_TEMP10 = ( here ) ; final Dist2 vd = Program . getPlaceDist2 ( r , X10_TEMP10 ) ;
final Region2 RX10_TEMP0 = vd . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3
= RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 :
RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish {
for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place
RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount2 ( vd , RX10_TEMP9 ) ; final int RX10_TEMP12
= RX10_TEMP11 - RX10_TEMP2 ; final T1 utmp1 = new T1(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6); async (RX10_TEMP10)
{Program.thread1(utmp1); } } } final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value
[ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; } ) ;
final doubleRefArray2 RX10_TEMP20 = new doubleRefArray2 ( vd , RX10_TEMP17 ) ; final doubleRefArray2 ref = RX10_TEMP20 ; Program .
Series_initRefArray ( X10_TEMP0 , ref ) ; final Region2 RX10_TEMP23 = vd . dReg ; final int RX10_TEMP26 = 1 ; int RX10_TEMP24 = RX10_TEMP23
. regSize ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; for ( point ( : rank==1
) RX10_TEMP21 : RX10_TEMP25 ) { final int RX10_TEMP27 = RX10_TEMP21 [0] ; final Point2 RX10_TEMP22 = Program . regionOrdinalPoint2 (
RX10_TEMP23 , RX10_TEMP27 ) ; final int i = RX10_TEMP22 . f0 ; final int j = RX10_TEMP22 . f1 ; final int ii = ( i ) ; final int jj = ( j )
; double cval = ( 0 ) ; final place curr_place = ( here ) ; final int X10_TEMP23 = ( 0 ) ; final int X10_TEMP24 = ( 0 ) ; final Region1
tempr = Program . createNewRegion1R ( X10_TEMP23 , X10_TEMP24 ) ; final place X10_TEMP26 = ( here ) ; final Dist1 tempvd = Program .
getPlaceDist1 ( tempr , X10_TEMP26 ) ; final Region1 RX10_TEMP28 = tempvd . dReg ; final int RX10_TEMP29 = 0 ; final int RX10_TEMP30 = 1 ;
int RX10_TEMP31 = place.MAX_PLACES ; RX10_TEMP31 = RX10_TEMP31 - RX10_TEMP30 ; final region ( : rank==1 ) RX10_TEMP32 = [ 0 : RX10_TEMP31 ]
; final dist ( : rank==1 ) RX10_TEMP33 = [ 0 : RX10_TEMP31 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP34 = ( doubleStub [ : rank==1
] ) ( new doubleStub [ RX10_TEMP33 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP35 : RX10_TEMP32 ) { final place RX10_TEMP36 = here ;
final int RX10_TEMP37 = RX10_TEMP35 [0] ; final place RX10_TEMP38 = place.places ( RX10_TEMP37 ) ; final int RX10_TEMP39 = Program .
getDistLocalCount1 ( tempvd , RX10_TEMP37 ) ; final int RX10_TEMP40 = RX10_TEMP39 - RX10_TEMP30 ; final T2 utmp2 = new T2(RX10_TEMP40,
RX10_TEMP36, RX10_TEMP35, RX10_TEMP34); async (RX10_TEMP38) {Program.thread2(utmp2); } } } final doubleStub value [ : rank==1 ] RX10_TEMP45
= ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP32 ] ( point ( : rank==1 ) RX10_TEMP47 ) { final doubleStub
RX10_TEMP46 = RX10_TEMP34 [ RX10_TEMP47 ] ; return RX10_TEMP46 ; } ) ; final doubleRefArray1 RX10_TEMP48 = new doubleRefArray1 ( tempvd ,
RX10_TEMP45 ) ; final doubleRefArray1 tempref = RX10_TEMP48 ; final doubleRefArray2 tA = X10_TEMP0 . testArray ; finish { final
doubleRefArray2 X10_TEMP32 = X10_TEMP0 . testArray ; final Dist2 RX10_TEMP49 = X10_TEMP32 . distValue ; final Dist2 X10_TEMP33 = RX10_TEMP49
; final Point2 RX10_TEMP50 = new Point2 ( j , i ) ; final Region2 RX10_TEMP51 = X10_TEMP33 . dReg ; final int RX10_TEMP52 = Program .
searchPointInRegion2 ( RX10_TEMP51 , RX10_TEMP50 ) ; final int RX10_TEMP53 = 0 ; final boolean RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; if
( RX10_TEMP54 ) { final String RX10_TEMP55 = "Point RX10_TEMP50 not found in the distribution X10_TEMP33." ; throw new RuntimeException (
RX10_TEMP55 ) ; } final place RX10_TEMP56 = Program . getPlaceFromDist2 ( X10_TEMP33 , RX10_TEMP52 ) ; final place X10_TEMP37 = RX10_TEMP56
; final T3 utmp3 = new T3(tA, tempref, curr_place, jj, ii); async (X10_TEMP37) {Program.thread3(utmp3); } } final int X10_TEMP47 = ( 0 ) ;
final Point1 RX10_TEMP80 = new Point1 ( X10_TEMP47 ) ; final Dist1 RX10_TEMP81 = tempref . distValue ; final Region1 RX10_TEMP82 =
RX10_TEMP81 . dReg ; final int RX10_TEMP83 = Program . searchPointInRegion1 ( RX10_TEMP82 , RX10_TEMP80 ) ; final int RX10_TEMP84 = 0 ;
final boolean RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84 ; if ( RX10_TEMP85 ) { String RX10_TEMP86 = "Array access index out of bounds" ; throw
new RuntimeException ( RX10_TEMP86 ) ; } final place RX10_TEMP87 = Program . getPlaceFromDist1 ( RX10_TEMP81 , RX10_TEMP83 ) ; final place
RX10_TEMP89 = here ; final boolean RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89 ; if ( RX10_TEMP90 ) { String RX10_TEMP88 = "Bad place access
for array tempref" ; throw new RuntimeException ( RX10_TEMP88 ) ; } final double RX10_TEMP91 = Program . getRefArrayValue1double ( tempref ,
RX10_TEMP83 ) ; final double X10_TEMP49 = ( RX10_TEMP91 ) ; cval = ( X10_TEMP49 ) ; final Point2 RX10_TEMP92 = new Point2 ( i , j ) ; final
Dist2 RX10_TEMP93 = ref . distValue ; final Region2 RX10_TEMP94 = RX10_TEMP93 . dReg ; final int RX10_TEMP95 = Program .
searchPointInRegion2 ( RX10_TEMP94 , RX10_TEMP92 ) ; final int RX10_TEMP96 = 0 ; final boolean RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96 ; if
( RX10_TEMP97 ) { String RX10_TEMP98 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP98 ) ; } final place
RX10_TEMP99 = Program . getPlaceFromDist2 ( RX10_TEMP93 , RX10_TEMP95 ) ; final place RX10_TEMP101 = here ; final boolean RX10_TEMP102 =
RX10_TEMP99 != RX10_TEMP101 ; if ( RX10_TEMP102 ) { String RX10_TEMP100 = "Bad place access for array ref" ; throw new RuntimeException (
RX10_TEMP100 ) ; } final double RX10_TEMP103 = Program . getRefArrayValue2double ( ref , RX10_TEMP95 ) ; final double X10_TEMP52 = (
RX10_TEMP103 ) ; final double X10_TEMP54 = ( cval - X10_TEMP52 ) ; double error = ( Math . abs ( X10_TEMP54 ) ) ; final double X10_TEMP56 =
( 1.0e-12 ) ; final boolean X10_TEMP58 = error > X10_TEMP56 ; if ( X10_TEMP58 ) { final String X10_TEMP59 = ( "Validation failed for
coefficient " ) ; final String X10_TEMP60 = ( X10_TEMP59 + j ) ; final String X10_TEMP61 = ( "," ) ; final String X10_TEMP62 = ( X10_TEMP60
+ X10_TEMP61 ) ; final String X10_TEMP64 = ( X10_TEMP62 + i ) ; System.out.println ( X10_TEMP64 ) ; final String X10_TEMP65 = ( "Computed
value = " ) ; final String X10_TEMP67 = ( X10_TEMP65 + cval ) ; System.out.println ( X10_TEMP67 ) ; final String X10_TEMP70 = ( "Reference
value = " ) ; final Point2 RX10_TEMP104 = new Point2 ( i , j ) ; final Dist2 RX10_TEMP105 = ref . distValue ; final Region2 RX10_TEMP106 =
RX10_TEMP105 . dReg ; final int RX10_TEMP107 = Program . searchPointInRegion2 ( RX10_TEMP106 , RX10_TEMP104 ) ; final int RX10_TEMP108 = 0 ;
final boolean RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108 ; if ( RX10_TEMP109 ) { String RX10_TEMP110 = "Array access index out of bounds" ;
throw new RuntimeException ( RX10_TEMP110 ) ; } final place RX10_TEMP111 = Program . getPlaceFromDist2 ( RX10_TEMP105 , RX10_TEMP107 ) ;
final place RX10_TEMP113 = here ; final boolean RX10_TEMP114 = RX10_TEMP111 != RX10_TEMP113 ; if ( RX10_TEMP114 ) { String RX10_TEMP112 =
"Bad place access for array ref" ; throw new RuntimeException ( RX10_TEMP112 ) ; } final double RX10_TEMP115 = Program .
getRefArrayValue2double ( ref , RX10_TEMP107 ) ; final double X10_TEMP71 = ( RX10_TEMP115 ) ; final String X10_TEMP73 = ( X10_TEMP70 +
X10_TEMP71 ) ; System.out.println ( X10_TEMP73 ) ; final String X10_TEMP75 = ( "Validation failed" ) ; throw new RuntimeException (
X10_TEMP75 ) ; } } } public static void Series_tidyup ( final Series X10_TEMP0 ) { Program . Series_freeTestData ( X10_TEMP0 ) ; } public
static void Series_run ( final Series X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 0 ) ; final Region1 tempregion =
Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; final Dist1 tempdist = Program . getPlaceDist1 (
tempregion , X10_TEMP6 ) ; int j = ( 10000 ) ; final Region1 RX10_TEMP1 = tempdist . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 =
RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( :
rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( RX10_TEMP1 ,
RX10_TEMP5 ) ; final int X10_TEMP11 = ( 0 ) ; Program . Series_setSize ( X10_TEMP0 , X10_TEMP11 ) ; final int X10_TEMP14 = ( 100 ) ; final
int X10_TEMP15 = ( 0 ) ; final double X10_TEMP16 = ( Math . pow ( X10_TEMP14 , X10_TEMP15 ) ) ; final double X10_TEMP18 = ( j * X10_TEMP16 )
; final int X10_TEMP20 = ( ( int ) X10_TEMP18 ) ; Program . Series_initialise ( X10_TEMP0 , X10_TEMP20 ) ; Program . Series_kernel (
X10_TEMP0 ) ; Program . Series_validate ( X10_TEMP0 ) ; } Program . Series_tidyup ( X10_TEMP0 ) ; } public static void Series_buildTestData
( final Series X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 1 ) ; final int X10_TEMP9 = ( 0 ) ; final int X10_TEMP6 =
( X10_TEMP0 . array_rows ) ; final int X10_TEMP7 = ( 1 ) ; final int X10_TEMP10 = ( X10_TEMP6 - X10_TEMP7 ) ; final Region2 R = Program .
createNewRegion2RR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP9 , X10_TEMP10 ) ; final Dist2 X10_TEMP13 = Program . getBlockDist2 ( R ) ; final Dist2
d = X10_TEMP13 ; final Region2 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 =
place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( :
rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new
doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int
RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount2 (
d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; final T4 utmp4 = new T4(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7,
RX10_TEMP6); async (RX10_TEMP10) {Program.thread4(utmp4); } } } final doubleStub value [ : rank==1 ] RX10_TEMP16 = ( doubleStub value [ :
rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final doubleStub RX10_TEMP17 = RX10_TEMP6 [
RX10_TEMP18 ] ; return RX10_TEMP17 ; } ) ; final doubleRefArray2 RX10_TEMP19 = new doubleRefArray2 ( d , RX10_TEMP16 ) ; final
doubleRefArray2 X10_TEMP15 = RX10_TEMP19 ; final doubleRefArray2 X10_TEMP17 = X10_TEMP15 ; X10_TEMP0 . testArray = ( X10_TEMP17 ) ; } public
static void Series_Do ( final Series X10_TEMP0 ) { final doubleRefArray2 X10_TEMP1 = X10_TEMP0 . testArray ; final int X10_TEMP4 = ( 0 ) ;
final int X10_TEMP5 = ( 0 ) ; final double X10_TEMP6 = ( 0.0 ) ; final double X10_TEMP14 = ( ( double ) X10_TEMP6 ) ; final double X10_TEMP8
= ( 2.0 ) ; final double X10_TEMP15 = ( ( double ) X10_TEMP8 ) ; final int X10_TEMP16 = ( 1000 ) ; final double X10_TEMP11 = ( 0.0 ) ; final
double X10_TEMP17 = ( ( double ) X10_TEMP11 ) ; final int X10_TEMP18 = ( 0 ) ; final double X10_TEMP20 = ( Program .
Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 , X10_TEMP18 ) ) ; final double X10_TEMP19 = ( 2.0
) ; final double X10_TEMP21 = ( ( double ) X10_TEMP19 ) ; final double X10_TEMP23 = ( X10_TEMP20 / X10_TEMP21 ) ; final double X10_TEMP24 =
( X10_TEMP23 ) ; final Point2 RX10_TEMP0 = new Point2 ( X10_TEMP4 , X10_TEMP5 ) ; final Dist2 RX10_TEMP1 = X10_TEMP1 . distValue ; final
Region2 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int
RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ;
throw new RuntimeException ( RX10_TEMP6 ) ; } final place RX10_TEMP7 = Program . getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place
RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for
array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; } Program . setRefArrayValue2double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP24 ) ;
final double X10_TEMP25 = ( 3.1415926535897932 ) ; final double omega = ( ( double ) X10_TEMP25 ) ; final Dist1 X10_TEMP27 = Program .
getUniqueDist ( ) ; final Dist1 U = X10_TEMP27 ; final doubleRefArray2 tA = X10_TEMP0 . testArray ; finish { final Region1 RX10_TEMP12 = U .
dReg ; final int RX10_TEMP15 = 1 ; int RX10_TEMP13 = RX10_TEMP12 . regSize ; RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; final region ( :
rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP13 ] ; for ( point ( : rank==1 ) RX10_TEMP11 : RX10_TEMP14 ) { final int RX10_TEMP16 = RX10_TEMP11
[0] ; final Point1 p = Program . regionOrdinalPoint1 ( RX10_TEMP12 , RX10_TEMP16 ) ; final Region1 RX10_TEMP17 = U . dReg ; final int
RX10_TEMP18 = Program . searchPointInRegion1 ( RX10_TEMP17 , p ) ; final int RX10_TEMP19 = 0 ; final boolean RX10_TEMP20 = RX10_TEMP18 <
RX10_TEMP19 ; if ( RX10_TEMP20 ) { final String RX10_TEMP21 = "Point p not found in the distribution U." ; throw new RuntimeException (
RX10_TEMP21 ) ; } final place RX10_TEMP22 = Program . getPlaceFromDist1 ( U , RX10_TEMP18 ) ; final place X10_TEMP31 = RX10_TEMP22 ; final
T5 utmp5 = new T5(p, tA, U, omega, X10_TEMP0); async (X10_TEMP31) {Program.thread5(utmp5); } } } } public static double
Series_TrapezoidIntegrate ( final Series X10_TEMP0 , final double x0 , final double x1 , final int a_nsteps , final double omegan , final
int select ) { double x = ( 0.0 ) ; double dx = ( 0.0 ) ; double rvalue = ( 0.0 ) ; int nsteps = ( a_nsteps ) ; x = ( x0 ) ; final double
X10_TEMP7 = ( x1 - x0 ) ; final double X10_TEMP8 = ( ( double ) nsteps ) ; final double X10_TEMP10 = ( X10_TEMP7 / X10_TEMP8 ) ; dx = (
X10_TEMP10 ) ; final double X10_TEMP15 = ( Program . Series_thefunction ( X10_TEMP0 , x0 , omegan , select ) ) ; final double X10_TEMP14 = (
2.0 ) ; final double X10_TEMP16 = ( ( double ) X10_TEMP14 ) ; final double X10_TEMP18 = ( X10_TEMP15 / X10_TEMP16 ) ; rvalue = ( X10_TEMP18
) ; final int X10_TEMP19 = ( 1 ) ; final boolean X10_TEMP21 = nsteps != X10_TEMP19 ; if ( X10_TEMP21 ) { final int X10_TEMP22 = ( nsteps ) ;
final int X10_TEMP23 = 1 ; nsteps = nsteps - X10_TEMP23 ; final int X10_TEMP24 = ( nsteps ) ; final int X10_TEMP25 = 1 ; nsteps = nsteps -
X10_TEMP25 ; final int X10_TEMP26 = ( 0 ) ; boolean X10_TEMP30 = nsteps > X10_TEMP26 ; while ( X10_TEMP30 ) { final double X10_TEMP32 = ( x
+ dx ) ; x = ( X10_TEMP32 ) ; final double X10_TEMP36 = ( Program . Series_thefunction ( X10_TEMP0 , x , omegan , select ) ) ; final double
X10_TEMP38 = ( rvalue + X10_TEMP36 ) ; rvalue = ( X10_TEMP38 ) ; final int X10_TEMP39 = ( nsteps ) ; final int X10_TEMP40 = 1 ; nsteps =
nsteps - X10_TEMP40 ; final int X10_TEMP28 = ( 0 ) ; X10_TEMP30 = nsteps > X10_TEMP28 ; } } final double X10_TEMP45 = ( Program .
Series_thefunction ( X10_TEMP0 , x1 , omegan , select ) ) ; final double X10_TEMP44 = ( 2.0 ) ; final double X10_TEMP46 = ( ( double )
X10_TEMP44 ) ; final double X10_TEMP47 = ( X10_TEMP45 / X10_TEMP46 ) ; final double X10_TEMP49 = ( rvalue + X10_TEMP47 ) ; final double
X10_TEMP51 = ( X10_TEMP49 * dx ) ; rvalue = ( X10_TEMP51 ) ; final double X10_TEMP53 = ( rvalue ) ; return X10_TEMP53 ; } public static
double Series_thefunction ( final Series X10_TEMP0 , final double x , final double omegan , final int select ) { final int X10_TEMP3 = 0 ;
final int X10_TEMP13 = 1 ; final int X10_TEMP27 = 2 ; switch ( select ) { case X10_TEMP3 : { final double X10_TEMP4 = ( 1.0 ) ; final double
X10_TEMP5 = ( ( double ) X10_TEMP4 ) ; final double X10_TEMP8 = ( x + X10_TEMP5 ) ; final double X10_TEMP10 = ( Math . pow ( X10_TEMP8 , x )
) ; return X10_TEMP10 ; } case X10_TEMP13 : { final double X10_TEMP14 = ( 1.0 ) ; final double X10_TEMP15 = ( ( double ) X10_TEMP14 ) ;
final double X10_TEMP18 = ( x + X10_TEMP15 ) ; final double X10_TEMP21 = ( Math . pow ( X10_TEMP18 , x ) ) ; final double X10_TEMP20 = (
omegan * x ) ; final double X10_TEMP22 = ( Math . cos ( X10_TEMP20 ) ) ; final double X10_TEMP24 = ( X10_TEMP21 * X10_TEMP22 ) ; return
X10_TEMP24 ; } case X10_TEMP27 : { final double X10_TEMP28 = ( 1.0 ) ; final double X10_TEMP29 = ( ( double ) X10_TEMP28 ) ; final double
X10_TEMP32 = ( x + X10_TEMP29 ) ; final double X10_TEMP35 = ( Math . pow ( X10_TEMP32 , x ) ) ; final double X10_TEMP34 = ( omegan * x ) ;
final double X10_TEMP36 = ( Math . sin ( X10_TEMP34 ) ) ; final double X10_TEMP38 = ( X10_TEMP35 * X10_TEMP36 ) ; return X10_TEMP38 ; } }
final double X10_TEMP41 = ( 0.0 ) ; return X10_TEMP41 ; } public static void Series_freeTestData ( final Series X10_TEMP0 ) { } public
static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r .
dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final
boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion
|| hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; } final int stride1 = 1 ; final int stride0
= stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; } public
static void setRefArrayValue2double ( final doubleRefArray2 array , final int index , final double val ) { final place pl = here ; final int
placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum =
dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final
doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ]
= ( val ) ; } public static int constantSearchRegion2 ( final Region2 r , final Point2 target ) { final int zero = 0 ; final int one = 1 ;
final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0
< low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = r . dim1 ; final int low1 = r . low1 ; final int high1 = low1 + dim1 ; int
pt1 = target . f1 ; final boolean lbound1 = pt1 < low1 ; final boolean hbound1 = pt1 >= high1 ; final int dim2 = 1 ; boolean outRegion =
false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion ||
hbound1 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; } final int stride2 = 1 ; final int stride1 =
stride2 * dim2 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; pt1 = pt1 - low1 ; final int
offset1 = stride1 * pt1 ; int found = 0 ; found = found + offset0 ; found = found + offset1 ; return found ; } public static int
binarySearchRegion2 ( final Region2 r , final Point2 target ) { final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] )
( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ;
int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point2 temp =
pointArray [ mid ] ; final int pointCompare = Program . comparePoint2 ( target , temp ) ; final boolean eq = pointCompare == zero ; final
boolean lt = pointCompare == one ; if ( eq ) { return mid ; } else { if ( lt ) { end = mid - one ; } else { start = mid + one ; } } notDone
= start <= end ; } return result ; } public static int binarySearchRegion1 ( final Region1 r , final Point1 target ) { final Point1 value [
: rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ;
final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int
mid = start + end ; mid = mid / two ; final Point1 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint1 ( target ,
temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; } else { if ( lt ) {
end = mid - one ; } else { start = mid + one ; } } notDone = start <= end ; } return result ; } public static void setRefArrayValue1double (
final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1
dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int
localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [
placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; } public static Dist1
getUniqueDist ( ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int rSize = maxPlaces - one ;
final region ( : rank==1 ) placeRegion = [ 0 : rSize ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new
place value [ placeRegion ] ( point ( : rank==1 ) p ) { final int i = p [0] ; final place pl1 = place.places ( i ) ; return pl1 ; } ) ;
final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray =
( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ;
return pt1 ; } ) ; final Region1 reg = new Region1 ( pointArray , maxPlaces , zero , maxPlaces ) ; final Dist pointDist1 = new Dist (
vPlaceArray , maxPlaces ) ; final Dist1 retDist = new Dist1 ( reg , pointDist1 ) ; return retDist ; } public static place getPlaceFromDist1
( final Dist1 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place
retPlace = placeArray [ index ] ; return retPlace ; } public static place getPlaceFromDist2 ( final Dist2 dn , final int index ) { final
Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return
retPlace ; } public static int comparePoint1 ( final Point1 pt1 , final Point1 pt2 ) { final int zero = 0 ; final int one = 1 ; final int
two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 <
point2 ; gt = point1 > point2 ; if ( lt ) { return one ; } if ( gt ) { return two ; } return zero ; } public static int comparePoint2 (
final Point2 pt1 , final Point2 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ;
boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) {
return one ; } if ( gt ) { return two ; } point1 = pt1 . f1 ; point2 = pt2 . f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) {
return one ; } if ( gt ) { return two ; } return zero ; } public static Point2 regionOrdinalPoint2 ( final Region2 reg , final int ordl ) {
final boolean regType = reg . regType ; if ( regType ) { final Point2 pt = Program . regionOrdinalPointRegular2 ( reg , ordl ) ; return pt ;
} final Point2 pt = Program . regionOrdinalPointArbitrary2 ( reg , ordl ) ; return pt ; } public static Point2 regionOrdinalPointRegular2 (
final Region2 reg , final int ordl ) { final int stride2 = 1 ; final int dim2 = reg . dim1 ; final int stride1 = stride2 * dim2 ; final int
regLow2 = reg . low1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f2 = ordl /
stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point2 pt = new Point2 (
f1 , f2 ) ; return pt ; } public static Point2 regionOrdinalPointArbitrary2 ( final Region2 reg , final int ordl ) { final Point2 value [ :
rank==1 ] pointArray = reg . pointArray ; final Point2 pt = pointArray [ ordl ] ; return pt ; } public static Point1 regionOrdinalPoint1 (
final Region1 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point1 pt = Program .
regionOrdinalPointRegular1 ( reg , ordl ) ; return pt ; } final Point1 pt = Program . regionOrdinalPointArbitrary1 ( reg , ordl ) ; return
pt ; } public static Point1 regionOrdinalPointRegular1 ( final Region1 reg , final int ordl ) { final int stride1 = 1 ; final int dim1 = reg
. dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1
; final Point1 pt = new Point1 ( f1 ) ; return pt ; } public static Point1 regionOrdinalPointArbitrary1 ( final Region1 reg , final int ordl
) { final Point1 value [ : rank==1 ] pointArray = reg . pointArray ; final Point1 pt = pointArray [ ordl ] ; return pt ; } public static
double getRefArrayValue1double ( final doubleRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ;
final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ;
final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub =
contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [
localIndex ] ; return returnValue ; } public static Dist2 getBlockDist2 ( final Region2 r ) { final int rSize = r . regSize ; final int zero
= 0 ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final dist ( :
rank==1 ) dDist = [ 0 : rSizeMinusOne ] -> here ; final place [ : rank==1 ] placeArray = ( place [ : rank==1 ] ) ( new place [ dDist ] ) ;
final int N = place.MAX_PLACES ; final int q = rSize % N ; final int p = rSize / N ; int blockSize = p + one ; int arraySize = q * blockSize
; int offset = 0 ; place initPlace = place.FIRST_PLACE ; Program . getCyclic ( placeArray , arraySize , initPlace , blockSize ) ; int
remainingPlaces = N - q ; final boolean cond = remainingPlaces == zero ; if ( cond ) { final place value [ : rank==1 ] vPlaceArray = ( place
value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; } ) ;
final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist2 retDist = new Dist2 ( r , pointDist1 ) ; return retDist ; } offset =
arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = place.places ( q ) ; int chunk = blockSize ; final boolean
ifCond = blockSize > arraySize ; if ( ifCond ) { chunk = arraySize ; } int index = offset ; int dSize = index + chunk ; dSize = dSize - one
; final int ub0 = chunk - one ; final region ( : rank==1 ) pointReg0 = [ 0 : ub0 ] ; for ( point ( : rank==1 ) pt : pointReg0 ) { final
point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( initPlace ) ; } index = index + chunk ; arraySize = arraySize -
chunk ; place pl = initPlace . next ( ) ; boolean whileCond = arraySize != zero ; while ( whileCond ) { final boolean tailCond = chunk >
arraySize ; if ( tailCond ) { dSize = index + arraySize ; dSize = dSize - one ; final int ub = arraySize - one ; final region ( : rank==1 )
pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [
tempPt ] = ( pl ) ; } arraySize = 0 ; } else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( :
rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ;
placeArray [ tempPt ] = ( pl ) ; } index = index + chunk ; arraySize = arraySize - chunk ; } pl = pl . next ( ) ; whileCond = arraySize !=
zero ; } final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) {
final place tempPl = placeArray [ pt ] ; return tempPl ; } ) ; final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist2
retDist = new Dist2 ( r , pointDist1 ) ; return retDist ; } public static void getCyclic ( final place [ : rank==1 ] placeArray , final int
arraySize , final place initPlace , final int blockSize ) { final int zero = 0 ; final int one = 1 ; int N = arraySize ; int chunk =
blockSize ; final boolean ifCond = blockSize > N ; if ( ifCond ) { chunk = N ; } int index = 0 ; int dSize = index + chunk ; dSize = dSize -
one ; final region ( : rank==1 ) pointReg = [ 0 : dSize ] ; for ( point ( : rank==1 ) p : pointReg ) { placeArray [ p ] = ( initPlace ) ; }
index = index + chunk ; N = N - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = N != zero ; while ( whileCond ) { final
boolean tailCond = chunk > N ; if ( tailCond ) { dSize = index + N ; dSize = dSize - one ; final int ub = N - one ; final region ( : rank==1
) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [
tempPt ] = ( pl ) ; } N = 0 ; } else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 )
pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt
] = ( pl ) ; } index = index + chunk ; N = N - chunk ; } pl = pl . next ( ) ; whileCond = N != zero ; } } public static int
getDistLocalCount2 ( final Dist2 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts
; final int localCount = counts [ placeIndex ] ; return localCount ; } public static int getDistLocalCount1 ( final Dist1 dn , final int
placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ]
; return localCount ; } public static int searchPointInRegion2 ( final Region2 r , final Point2 target ) { final boolean regType = r .
regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion2 ( r , target ) ; return constantSearch ; } final int
binarySearch = Program . binarySearchRegion2 ( r , target ) ; return binarySearch ; } public static int searchPointInRegion1 ( final Region1
r , final Point1 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program .
constantSearchRegion1 ( r , target ) ; return constantSearch ; } final int binarySearch = Program . binarySearchRegion1 ( r , target ) ;
return binarySearch ; } public static double getRefArrayValue2double ( final doubleRefArray2 array , final int index ) { final place pl =
here ; final int placeIndex = pl . id ; final Dist2 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ :
rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array .
contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final
double returnValue = localArray [ localIndex ] ; return returnValue ; } public static Dist2 getPlaceDist2 ( final Region2 r , final place p
) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 :
rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1
) pt ) { return p ; } ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist2 retDist = new Dist2 ( r , pointDist ) ;
return retDist ; } public static Dist1 getPlaceDist1 ( final Region1 r , final place p ) { final int rSize = r . regSize ; final int one = 1
; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ]
vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; } ) ; final Dist pointDist =
new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist ) ; return retDist ; } public static Dist2 restrictDist2
( final Dist2 dn , final place p ) { final Region2 r = dn . dReg ; final boolean regType = r . regType ; if ( regType ) { final Dist2
regDist = Program . restrictDistRegular2 ( dn , p ) ; return regDist ; } final Dist2 arbDist = Program . restrictDistArbitrary2 ( dn , p ) ;
return arbDist ; } public static Dist2 restrictDistRegular2 ( final Dist2 d , final place p ) { final int zero = 0 ; final int one = 1 ;
final place h = here ; final Region2 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne
= dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final int stride2 = 1 ; final int dim2 = dReg . dim1 ; final int
stride1 = stride2 * dim2 ; final int regLow2 = dReg . low1 ; final int dim1 = dReg . dim0 ; final int stride0 = stride1 * dim1 ; final int
regLow1 = dReg . low0 ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ :
rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final
int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( :
rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [
tempReg ] ( point ( : rank==1 ) pt ) { return p ; } ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ;
final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [
pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ;
} } } final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ tempReg ] ( point ( : rank==1 ) pt )
{ final int idx = tempArray [ pt ] ; int f2 = idx / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = idx / stride1 ; f1 = f1 % dim1 ;
f1 = f1 + regLow1 ; final Point2 dpt = new Point2 ( f1 , f2 ) ; return dpt ; } ) ; final Region2 dpReg = new Region2 ( pointArray ,
rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist2 dpDistn = new Dist2 ( dpReg , dpDist ) ; return
dpDistn ; } public static Dist2 restrictDistArbitrary2 ( final Dist2 d , final place p ) { final int zero = 0 ; final int one = 1 ; final
place h = here ; final Region2 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim
- one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final Point2 value [ : rank==1 ] dArray = ( Point2 value [ : rank==1 ] )
( dReg . pointArray ) ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ :
rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final
int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( :
rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [
tempReg ] ( point ( : rank==1 ) pt ) { return p ; } ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ;
final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [
pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ;
} } } final Point2 value [ : rank==1 ] pointArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ tempReg ] ( point ( : rank==1 ) pt )
{ final int idx = tempArray [ pt ] ; final Point2 dpt = dArray [ idx ] ; return dpt ; } ) ; final Region2 dpReg = new Region2 ( pointArray ,
rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist2 dpDistn = new Dist2 ( dpReg , dpDist ) ; return
dpDistn ; } public static int value [ : rank==1 ] initDist ( final int [ : rank==1 ] tempArr , final region ( : rank==1 ) tempReg ) { final
int value [ : rank==1 ] vTemp = ( int value [ : rank==1 ] ) ( new int value [ tempReg ] ( point ( : rank==1 ) p ) { final int tempInt =
tempArr [ p ] ; return tempInt ; } ) ; return vTemp ; } public static Region2 createNewRegion2RR ( final int v1_0 , final int v1_1 , final
int v2_0 , final int v2_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; final
boolean tempBool2 = true ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; final int l1 = v1_1 - v1_0 ; final int dim1 =
l1 + one ; final int l2 = v2_1 - v2_0 ; final int dim2 = l2 + one ; final int stride2 = 1 ; final int stride1 = stride2 * dim2 ; final int
stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero
- one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) (
new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; } ) ; final Region2
retRegEmpty = new Region2 ( ptArray , stride0 , zero , zero , zero , zero ) ; return retRegEmpty ; } if ( regType ) { final int minusOne =
zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ]
) ( new Point2 value [ regArr ] ( point ( : rank==1 ) p ) { final Point2 pt = new Point2 ( zero , zero ) ; return pt ; } ) ; final Region2
retRegRegular = new Region2 ( ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; return retRegRegular ; } else { final region ( : rank==1 )
regArr = [ 0 : rSize ] ; final Point2 value [ : rank==1 ] ptArray = ( Point2 value [ : rank==1 ] ) ( new Point2 value [ regArr ] ( point ( :
rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2
= f2 + v2_0 ; final Point2 retPoint = new Point2 ( f1 , f2 ) ; return retPoint ; } ) ; final Region2 retReg = new Region2 ( ptArray ,
stride0 ) ; return retReg ; } } public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int
one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int
dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond =
stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value
[ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new
Point1 ( zero ) ; return pt ; } ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; } if
( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ]
ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ;
return pt ; } ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; } else { final
region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [
regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint
= new Point1 ( f1 ) ; return retPoint ; } ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; } }

 public static void thread1(final T1 utmpz) {final int RX10_TEMP12 = utmpz.RX10_TEMP12; final place RX10_TEMP8 = utmpz.RX10_TEMP8; final
point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6; { final dist ( : rank==1 )
RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] (
point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP13 = ( 0.0 ) ; return X10_TEMP13 ; } ) ; final doubleStub RX10_TEMP16 = new
doubleStub ( RX10_TEMP15 ) ; final T9 utmp9 = new T9(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6); async (RX10_TEMP8) {Program.thread9(utmp9); } } }
public static void thread2(final T2 utmpz) {final int RX10_TEMP40 = utmpz.RX10_TEMP40; final place RX10_TEMP36 = utmpz.RX10_TEMP36; final
point ( : rank==1 ) RX10_TEMP35 = utmpz.RX10_TEMP35; final doubleStub [ : rank==1 ] RX10_TEMP34 = utmpz.RX10_TEMP34; { final dist ( :
rank==1 ) RX10_TEMP42 = [ 0 : RX10_TEMP40 ] -> here ; final double [ : rank==1 ] RX10_TEMP43 = ( double [ : rank==1 ] ) ( new double [
RX10_TEMP42 ] ( point ( : rank==1 ) RX10_TEMP41 ) { final double X10_TEMP29 = ( 0.0 ) ; return X10_TEMP29 ; } ) ; final doubleStub
RX10_TEMP44 = new doubleStub ( RX10_TEMP43 ) ; final T10 utmp10 = new T10(RX10_TEMP44, RX10_TEMP35, RX10_TEMP34); async (RX10_TEMP36)
{Program.thread10(utmp10); } } } public static void thread3(final T3 utmpz) {final doubleRefArray2 tA = utmpz.tA; final doubleRefArray1
tempref = utmpz.tempref; final place curr_place = utmpz.curr_place; final int jj = utmpz.jj; final int ii = utmpz.ii; { final Point2
RX10_TEMP57 = new Point2 ( jj , ii ) ; final Dist2 RX10_TEMP58 = tA . distValue ; final Region2 RX10_TEMP59 = RX10_TEMP58 . dReg ; final int
RX10_TEMP60 = Program . searchPointInRegion2 ( RX10_TEMP59 , RX10_TEMP57 ) ; final int RX10_TEMP61 = 0 ; final boolean RX10_TEMP62 =
RX10_TEMP60 < RX10_TEMP61 ; if ( RX10_TEMP62 ) { String RX10_TEMP63 = "Array access index out of bounds" ; throw new RuntimeException (
RX10_TEMP63 ) ; } final place RX10_TEMP64 = Program . getPlaceFromDist2 ( RX10_TEMP58 , RX10_TEMP60 ) ; final place RX10_TEMP66 = here ;
final boolean RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66 ; if ( RX10_TEMP67 ) { String RX10_TEMP65 = "Bad place access for array tA" ; throw
new RuntimeException ( RX10_TEMP65 ) ; } final double RX10_TEMP68 = Program . getRefArrayValue2double ( tA , RX10_TEMP60 ) ; final double
temp = ( RX10_TEMP68 ) ; final T11 utmp11 = new T11(temp, tempref); async (curr_place) {Program.thread11(utmp11); } } } public static void
thread4(final T4 utmpz) {final int RX10_TEMP12 = utmpz.RX10_TEMP12; final place RX10_TEMP8 = utmpz.RX10_TEMP8; final point ( : rank==1 )
RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6; { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 :
RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP14 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP13 ] ) ; final doubleStub
RX10_TEMP15 = new doubleStub ( RX10_TEMP14 ) ; final T12 utmp12 = new T12(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6); async (RX10_TEMP8)
{Program.thread12(utmp12); } } } public static void thread5(final T5 utmpz) {final Point1 p = utmpz.p; final doubleRefArray2 tA = utmpz.tA;
final Dist1 U = utmpz.U; final double omega = utmpz.omega; final Series X10_TEMP0 = utmpz.X10_TEMP0; { int ilow = ( 0 ) ; final Region1
RX10_TEMP23 = U . dReg ; final int RX10_TEMP24 = Program . searchPointInRegion1 ( RX10_TEMP23 , p ) ; final int RX10_TEMP25 = 0 ; final
boolean RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; if ( RX10_TEMP26 ) { final String RX10_TEMP27 = "Point p not found in the distribution U."
; throw new RuntimeException ( RX10_TEMP27 ) ; } final place RX10_TEMP28 = Program . getPlaceFromDist1 ( U , RX10_TEMP24 ) ; final place
X10_TEMP34 = ( RX10_TEMP28 ) ; final boolean X10_TEMP36 = X10_TEMP34 . isFirst ( ) ; if ( X10_TEMP36 ) { final int X10_TEMP38 = ( 1 ) ; ilow
= ( X10_TEMP38 ) ; } else { final int X10_TEMP40 = ( 0 ) ; ilow = ( X10_TEMP40 ) ; } final Dist2 RX10_TEMP29 = tA . distValue ; final Dist2
X10_TEMP41 = RX10_TEMP29 ; final place X10_TEMP42 = ( here ) ; final Dist2 X10_TEMP44 = Program . restrictDist2 ( X10_TEMP41 , X10_TEMP42 )
; final Region2 RX10_TEMP31 = X10_TEMP44 . dReg ; final int RX10_TEMP34 = 1 ; int RX10_TEMP32 = RX10_TEMP31 . regSize ; RX10_TEMP32 =
RX10_TEMP32 - RX10_TEMP34 ; final region ( : rank==1 ) RX10_TEMP33 = [ 0 : RX10_TEMP32 ] ; for ( point ( : rank==1 ) RX10_TEMP30 :
RX10_TEMP33 ) { final int RX10_TEMP35 = RX10_TEMP30 [0] ; final Point2 pp = Program . regionOrdinalPoint2 ( RX10_TEMP31 , RX10_TEMP35 ) ;
final int X10_TEMP46 = ( pp . f1 ) ; final boolean X10_TEMP48 = X10_TEMP46 >= ilow ; if ( X10_TEMP48 ) { final int X10_TEMP50 = ( pp . f0 )
; final int X10_TEMP51 = ( 0 ) ; final boolean X10_TEMP53 = X10_TEMP50 == X10_TEMP51 ; if ( X10_TEMP53 ) { final double X10_TEMP55 = ( 0.0 )
; final double X10_TEMP65 = ( ( double ) X10_TEMP55 ) ; final double X10_TEMP57 = ( 2.0 ) ; final double X10_TEMP66 = ( ( double )
X10_TEMP57 ) ; final int X10_TEMP67 = ( 1000 ) ; final int X10_TEMP61 = ( pp . f1 ) ; final double X10_TEMP62 = ( ( double ) X10_TEMP61 ) ;
final double X10_TEMP68 = ( omega * X10_TEMP62 ) ; final int X10_TEMP69 = ( 1 ) ; final double X10_TEMP71 = ( Program .
Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP65 , X10_TEMP66 , X10_TEMP67 , X10_TEMP68 , X10_TEMP69 ) ) ; final double X10_TEMP72 = (
X10_TEMP71 ) ; final Dist2 RX10_TEMP36 = tA . distValue ; final Region2 RX10_TEMP37 = RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program .
searchPointInRegion2 ( RX10_TEMP37 , pp ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if (
RX10_TEMP40 ) { String RX10_TEMP41 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP41 ) ; } final place RX10_TEMP42 =
Program . getPlaceFromDist2 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 !=
RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access for array tA" ; throw new RuntimeException ( RX10_TEMP43 ) ; }
Program . setRefArrayValue2double ( tA , RX10_TEMP38 , X10_TEMP72 ) ; } else { final double X10_TEMP74 = ( 0.0 ) ; final double X10_TEMP84 =
( ( double ) X10_TEMP74 ) ; final double X10_TEMP76 = ( 2.0 ) ; final double X10_TEMP85 = ( ( double ) X10_TEMP76 ) ; final int X10_TEMP86 =
( 1000 ) ; final int X10_TEMP80 = ( pp . f1 ) ; final double X10_TEMP81 = ( ( double ) X10_TEMP80 ) ; final double X10_TEMP87 = ( omega *
X10_TEMP81 ) ; final int X10_TEMP88 = ( 2 ) ; final double X10_TEMP90 = ( Program . Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP84 ,
X10_TEMP85 , X10_TEMP86 , X10_TEMP87 , X10_TEMP88 ) ) ; final double X10_TEMP91 = ( X10_TEMP90 ) ; final Dist2 RX10_TEMP46 = tA . distValue
; final Region2 RX10_TEMP47 = RX10_TEMP46 . dReg ; final int RX10_TEMP48 = Program . searchPointInRegion2 ( RX10_TEMP47 , pp ) ; final int
RX10_TEMP49 = 0 ; final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; if ( RX10_TEMP50 ) { String RX10_TEMP51 = "Array index out of
bounds" ; throw new RuntimeException ( RX10_TEMP51 ) ; } final place RX10_TEMP52 = Program . getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 )
; final place RX10_TEMP54 = here ; final boolean RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; if ( RX10_TEMP55 ) { String RX10_TEMP53 = "Bad
place access for array tA" ; throw new RuntimeException ( RX10_TEMP53 ) ; } Program . setRefArrayValue2double ( tA , RX10_TEMP48 ,
X10_TEMP91 ) ; } } } } } public static void thread9(final T9 utmpz) {final doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16; final point ( :
rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6; { RX10_TEMP6 [ RX10_TEMP7 ] = (
RX10_TEMP16 ) ; } } public static void thread10(final T10 utmpz) {final doubleStub RX10_TEMP44 = utmpz.RX10_TEMP44; final point ( : rank==1
) RX10_TEMP35 = utmpz.RX10_TEMP35; final doubleStub [ : rank==1 ] RX10_TEMP34 = utmpz.RX10_TEMP34; { RX10_TEMP34 [ RX10_TEMP35 ] = (
RX10_TEMP44 ) ; } } public static void thread11(final T11 utmpz) {final double temp = utmpz.temp; final doubleRefArray1 tempref =
utmpz.tempref; { final int X10_TEMP43 = ( 0 ) ; final double X10_TEMP45 = ( temp ) ; final Point1 RX10_TEMP69 = new Point1 ( X10_TEMP43 ) ;
final Dist1 RX10_TEMP70 = tempref . distValue ; final Region1 RX10_TEMP71 = RX10_TEMP70 . dReg ; final int RX10_TEMP72 = Program .
searchPointInRegion1 ( RX10_TEMP71 , RX10_TEMP69 ) ; final int RX10_TEMP73 = 0 ; final boolean RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73 ; if
( RX10_TEMP74 ) { String RX10_TEMP75 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP75 ) ; } final place RX10_TEMP76
= Program . getPlaceFromDist1 ( RX10_TEMP70 , RX10_TEMP72 ) ; final place RX10_TEMP78 = here ; final boolean RX10_TEMP79 = RX10_TEMP76 !=
RX10_TEMP78 ; if ( RX10_TEMP79 ) { String RX10_TEMP77 = "Bad place access for array tempref" ; throw new RuntimeException ( RX10_TEMP77 ) ;
} Program . setRefArrayValue1double ( tempref , RX10_TEMP72 , X10_TEMP45 ) ; } } public static void thread12(final T12 utmpz) {final
doubleStub RX10_TEMP15 = utmpz.RX10_TEMP15; final point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ]
RX10_TEMP6 = utmpz.RX10_TEMP6; { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; } }

}

 value T1 {

 public final int RX10_TEMP12;

 public final place RX10_TEMP8;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T1( final int a_RX10_TEMP12, final place a_RX10_TEMP8, final point ( : rank==1 )
a_RX10_TEMP7, final doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP12 = (a_RX10_TEMP12); this.RX10_TEMP8 = (a_RX10_TEMP8);
this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 = (a_RX10_TEMP6); } }

 value T2 {

 public final int RX10_TEMP40;

 public final place RX10_TEMP36;

 public final point ( : rank==1 ) RX10_TEMP35;

 public final doubleStub [ : rank==1 ] RX10_TEMP34; public T2( final int a_RX10_TEMP40, final place a_RX10_TEMP36, final point ( : rank==1 )
a_RX10_TEMP35, final doubleStub [ : rank==1 ] a_RX10_TEMP34) { this.RX10_TEMP40 = (a_RX10_TEMP40); this.RX10_TEMP36 = (a_RX10_TEMP36);
this.RX10_TEMP35 = (a_RX10_TEMP35); this.RX10_TEMP34 = (a_RX10_TEMP34); } }

 value T3 {

 public final doubleRefArray2 tA;

 public final doubleRefArray1 tempref;

 public final place curr_place;

 public final int jj;

 public final int ii; public T3( final doubleRefArray2 a_tA, final doubleRefArray1 a_tempref, final place a_curr_place, final int a_jj,
final int a_ii) { this.tA = (a_tA); this.tempref = (a_tempref); this.curr_place = (a_curr_place); this.jj = (a_jj); this.ii = (a_ii); } }

 value T4 {

 public final int RX10_TEMP12;

 public final place RX10_TEMP8;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T4( final int a_RX10_TEMP12, final place a_RX10_TEMP8, final point ( : rank==1 )
a_RX10_TEMP7, final doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP12 = (a_RX10_TEMP12); this.RX10_TEMP8 = (a_RX10_TEMP8);
this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 = (a_RX10_TEMP6); } }

 value T5 {

 public final Point1 p;

 public final doubleRefArray2 tA;

 public final Dist1 U;

 public final double omega;

 public final Series X10_TEMP0; public T5( final Point1 a_p, final doubleRefArray2 a_tA, final Dist1 a_U, final double a_omega, final Series
a_X10_TEMP0) { this.p = (a_p); this.tA = (a_tA); this.U = (a_U); this.omega = (a_omega); this.X10_TEMP0 = (a_X10_TEMP0); } }

 value T6 {

 public final int RX10_TEMP12;

 public final place RX10_TEMP8;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T6( final int a_RX10_TEMP12, final place a_RX10_TEMP8, final point ( : rank==1 )
a_RX10_TEMP7, final doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP12 = (a_RX10_TEMP12); this.RX10_TEMP8 = (a_RX10_TEMP8);
this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 = (a_RX10_TEMP6); } }

 value T7 {

 public final int RX10_TEMP33;

 public final place RX10_TEMP29;

 public final point ( : rank==1 ) RX10_TEMP28;

 public final doubleStub [ : rank==1 ] RX10_TEMP27; public T7( final int a_RX10_TEMP33, final place a_RX10_TEMP29, final point ( : rank==1 )
a_RX10_TEMP28, final doubleStub [ : rank==1 ] a_RX10_TEMP27) { this.RX10_TEMP33 = (a_RX10_TEMP33); this.RX10_TEMP29 = (a_RX10_TEMP29);
this.RX10_TEMP28 = (a_RX10_TEMP28); this.RX10_TEMP27 = (a_RX10_TEMP27); } }

 value T8 {

 public final int RX10_TEMP54;

 public final place RX10_TEMP50;

 public final point ( : rank==1 ) RX10_TEMP49;

 public final doubleStub [ : rank==1 ] RX10_TEMP48; public T8( final int a_RX10_TEMP54, final place a_RX10_TEMP50, final point ( : rank==1 )
a_RX10_TEMP49, final doubleStub [ : rank==1 ] a_RX10_TEMP48) { this.RX10_TEMP54 = (a_RX10_TEMP54); this.RX10_TEMP50 = (a_RX10_TEMP50);
this.RX10_TEMP49 = (a_RX10_TEMP49); this.RX10_TEMP48 = (a_RX10_TEMP48); } }

 value T9 {

 public final doubleStub RX10_TEMP16;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T9( final doubleStub a_RX10_TEMP16, final point ( : rank==1 ) a_RX10_TEMP7, final
doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP16 = (a_RX10_TEMP16); this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 =
(a_RX10_TEMP6); } }

 value T10 {

 public final doubleStub RX10_TEMP44;

 public final point ( : rank==1 ) RX10_TEMP35;

 public final doubleStub [ : rank==1 ] RX10_TEMP34; public T10( final doubleStub a_RX10_TEMP44, final point ( : rank==1 ) a_RX10_TEMP35,
final doubleStub [ : rank==1 ] a_RX10_TEMP34) { this.RX10_TEMP44 = (a_RX10_TEMP44); this.RX10_TEMP35 = (a_RX10_TEMP35); this.RX10_TEMP34 =
(a_RX10_TEMP34); } }

 value T11 {

 public final double temp;

 public final doubleRefArray1 tempref; public T11( final double a_temp, final doubleRefArray1 a_tempref) { this.temp = (a_temp);
this.tempref = (a_tempref); } }

 value T12 {

 public final doubleStub RX10_TEMP15;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T12( final doubleStub a_RX10_TEMP15, final point ( : rank==1 ) a_RX10_TEMP7, final
doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP15 = (a_RX10_TEMP15); this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 =
(a_RX10_TEMP6); } }

 value T13 {

 public final doubleStub RX10_TEMP16;

 public final point ( : rank==1 ) RX10_TEMP7;

 public final doubleStub [ : rank==1 ] RX10_TEMP6; public T13( final doubleStub a_RX10_TEMP16, final point ( : rank==1 ) a_RX10_TEMP7, final
doubleStub [ : rank==1 ] a_RX10_TEMP6) { this.RX10_TEMP16 = (a_RX10_TEMP16); this.RX10_TEMP7 = (a_RX10_TEMP7); this.RX10_TEMP6 =
(a_RX10_TEMP6); } }

 value T14 {

 public final doubleStub RX10_TEMP37;

 public final point ( : rank==1 ) RX10_TEMP28;

 public final doubleStub [ : rank==1 ] RX10_TEMP27; public T14( final doubleStub a_RX10_TEMP37, final point ( : rank==1 ) a_RX10_TEMP28,
final doubleStub [ : rank==1 ] a_RX10_TEMP27) { this.RX10_TEMP37 = (a_RX10_TEMP37); this.RX10_TEMP28 = (a_RX10_TEMP28); this.RX10_TEMP27 =
(a_RX10_TEMP27); } }

 value T15 {

 public final doubleStub RX10_TEMP58;

 public final point ( : rank==1 ) RX10_TEMP49;

 public final doubleStub [ : rank==1 ] RX10_TEMP48; public T15( final doubleStub a_RX10_TEMP58, final point ( : rank==1 ) a_RX10_TEMP49,
final doubleStub [ : rank==1 ] a_RX10_TEMP48) { this.RX10_TEMP58 = (a_RX10_TEMP58); this.RX10_TEMP49 = (a_RX10_TEMP49); this.RX10_TEMP48 =
(a_RX10_TEMP48); } }

 value doubleRefArray2 { public final Dist2 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray2 (
final Dist2 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = (
contents_ ) ; }

}

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

}

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 (
final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = (
contents_ ) ; }

}

 value Point2 { public final int f0 ; public final int f1 ; public Point2 ( final int f0_ , final int f1_ ) { this . f0 = ( f0_ ) ; this .
f1 = ( f1_ ) ; }

}

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg
= ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

}

 value Dist2 { public final Region2 dReg ; public final Dist dDist ; public Dist2 ( final Region2 dReg_ , final Dist dDist_ ) { this . dReg
= ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

}

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ :
rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int
zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ;
final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 :
rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int
[ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p :
countReg ) { tempCounts [ p ] = ( zero ) ; } for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index
= pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [
index ] = ( oldValPlusOne ) ; } this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist (
tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum ,
arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

}

 class Series { public int setsize ; public int array_rows ; public doubleRefArray2 testArray ; public Series ( ) { }

}

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer (
) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program .
createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 (
X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 =
place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( :
rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new
doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int
RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 (
d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; final T6 utmp6 = new T6(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7,
RX10_TEMP6); async (RX10_TEMP10) {this.thread6(utmp6); } } } final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ :
rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [
RX10_TEMP19 ] ; return RX10_TEMP18 ; } ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final
doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22
= 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 )
RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ]
RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25
) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ;
final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; final T7
utmp7 = new T7(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27); async (RX10_TEMP31) {this.thread7(utmp7); } } } final doubleStub value [
: rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) {
final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; } ) ; final doubleRefArray1 RX10_TEMP41 = new
doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1
RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 =
RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 :
RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ;
finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ;
final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final
int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; final T8 utmp8 = new T8(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48); async
(RX10_TEMP52) {this.thread8(utmp8); } } } final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new
doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return
RX10_TEMP60 ; } ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 =
RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; } public void thread6(final T6 utmpz) {final int RX10_TEMP12 = utmpz.RX10_TEMP12; final
place RX10_TEMP8 = utmpz.RX10_TEMP8; final point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ] RX10_TEMP6 =
utmpz.RX10_TEMP6; { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [
: rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; } ) ;
final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; final T13 utmp13 = new T13(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6); async
(RX10_TEMP8) {this.thread13(utmp13); } } } public void thread7(final T7 utmpz) {final int RX10_TEMP33 = utmpz.RX10_TEMP33; final place
RX10_TEMP29 = utmpz.RX10_TEMP29; final point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28; final doubleStub [ : rank==1 ] RX10_TEMP27 =
utmpz.RX10_TEMP27; { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double
[ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; } )
; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; final T14 utmp14 = new T14(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27); async
(RX10_TEMP29) {this.thread14(utmp14); } } } public void thread8(final T8 utmpz) {final int RX10_TEMP54 = utmpz.RX10_TEMP54; final place
RX10_TEMP50 = utmpz.RX10_TEMP50; final point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49; final doubleStub [ : rank==1 ] RX10_TEMP48 =
utmpz.RX10_TEMP48; { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double
[ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; } )
; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; final T15 utmp15 = new T15(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48); async
(RX10_TEMP50) {this.thread15(utmp15); } } } public void thread13(final T13 utmpz) {final doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16; final
point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7; final doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6; { RX10_TEMP6 [ RX10_TEMP7 ]
= ( RX10_TEMP16 ) ; } } public void thread14(final T14 utmpz) {final doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37; final point ( : rank==1 )
RX10_TEMP28 = utmpz.RX10_TEMP28; final doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27; { RX10_TEMP27 [ RX10_TEMP28 ] = (
RX10_TEMP37 ) ; } } public void thread15(final T15 utmpz) {final doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58; final point ( : rank==1 )
RX10_TEMP49 = utmpz.RX10_TEMP49; final doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48; { RX10_TEMP48 [ RX10_TEMP49 ] = (
RX10_TEMP58 ) ; } }

}

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final
int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int
regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this
. regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = (
minusOne ) ; this . dim0 = ( zero ) ; } public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_
, final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this .
pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

}

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this .
localArray = ( localArray_ ) ; }

}

 value Region2 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final
int dim0 ; public final int low1 ; public final int dim1 ; public final Point2 value [ : rank==1 ] pointArray ; public Region2 ( final
Point2 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ;
final boolean f = false ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_
) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; this . low1 = ( minusOne ) ; this . dim1 = ( zero ) ; }
public Region2 ( final Point2 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ , final int low1_ ,
final int dim1_ ) { final boolean t = true ; final int regR = 2 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this .
pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; this . low1 = ( low1_ ) ; this .
dim1 = ( dim1_ ) ; }

}
