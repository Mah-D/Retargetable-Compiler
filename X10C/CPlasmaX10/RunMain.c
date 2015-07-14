#include "gc.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
#include "RunMain.h"
/* class Program */ 
int _Timer_max_counters ;
struct Region1 /*VALUE*/ _MR_r ;
int /*static*/_Timer_max_counters_init ( ) 
{ const int X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) 
{ 
{ struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->start_time ; 
const double X10_TEMP4 = getTIME( ) 
; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; 
} 
} 

void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) 
{ 
{ struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP5 = getTIME( ) 
; 
struct doubleRefArray1 X10_TEMP3 = X10_TEMP0 ->start_time ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP3 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP11 = getRefArrayValue1double ( X10_TEMP3 , RX10_TEMP3 ) ; 
const double X10_TEMP6 = RX10_TEMP11 ; 
const double X10_TEMP8 = X10_TEMP5 - X10_TEMP6 ; 
const double X10_TEMP9 = X10_TEMP8 ; 
struct Point1 RX10_TEMP12  ; 
Point1_Point1( &RX10_TEMP12/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP13 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
const int RX10_TEMP15 = searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; 
const int RX10_TEMP16 = 0 ; 
const int RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP18 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP18 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP19 = getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; 
const int RX10_TEMP21 = /* here  */ 0 ; 
const int RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; 
if ( RX10_TEMP22 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; 
struct doubleRefArray1 X10_TEMP10 = X10_TEMP0 ->elapsed_time ; 
struct doubleRefArray1 X10_TEMP12 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP23  ; 
Point1_Point1( &RX10_TEMP23/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP24 = X10_TEMP12 .distValue ; 
struct Region1 RX10_TEMP25 = RX10_TEMP24 .dReg ; 
const int RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; 
const int RX10_TEMP27 = 0 ; 
const int RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP29 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP30 = getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; 
const int RX10_TEMP32 = /* here  */ 0 ; 
const int RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32 ; 
if ( RX10_TEMP33 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; 
fprintf(stderr, RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP34 = getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; 
const double X10_TEMP14 = RX10_TEMP34 ; 
const int X10_TEMP15 = 1000 ; 
const double X10_TEMP17 = X10_TEMP14 / X10_TEMP15 ; 
const double X10_TEMP18 = X10_TEMP17 ; 
struct Point1 RX10_TEMP35  ; 
Point1_Point1( &RX10_TEMP35/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP36 = X10_TEMP10 .distValue ; 
struct Region1 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; 
const int RX10_TEMP39 = 0 ; 
const int RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP41 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP42 = getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const int RX10_TEMP44 = /* here  */ 0 ; 
const int RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP43 = "Bad place access for array X10_TEMP10" ; 
fprintf(stderr, RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 , X10_TEMP18 ) ; 
struct doubleRefArray1 X10_TEMP19 = X10_TEMP0 ->total_time ; 
struct doubleRefArray1 X10_TEMP21 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP46  ; 
Point1_Point1( &RX10_TEMP46/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP47 = X10_TEMP21 .distValue ; 
struct Region1 RX10_TEMP48 = RX10_TEMP47 .dReg ; 
const int RX10_TEMP49 = searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; 
const int RX10_TEMP50 = 0 ; 
const int RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP52 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP53 = getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; 
const int RX10_TEMP55 = /* here  */ 0 ; 
const int RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP54 = "Bad place access for array X10_TEMP21" ; 
fprintf(stderr, RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP57 = getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ; 
const double X10_TEMP25 = RX10_TEMP57 ; 
struct doubleRefArray1 X10_TEMP23 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP58  ; 
Point1_Point1( &RX10_TEMP58/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP59 = X10_TEMP23 .distValue ; 
struct Region1 RX10_TEMP60 = RX10_TEMP59 .dReg ; 
const int RX10_TEMP61 = searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; 
const int RX10_TEMP62 = 0 ; 
const int RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; 
if ( RX10_TEMP63 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP64 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP65 = getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; 
const int RX10_TEMP67 = /* here  */ 0 ; 
const int RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; 
fprintf(stderr, RX10_TEMP66 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP69 = getRefArrayValue1double ( X10_TEMP23 , RX10_TEMP61 ) ; 
const double X10_TEMP26 = RX10_TEMP69 ; 
const double X10_TEMP28 = X10_TEMP25 + X10_TEMP26 ; 
const double X10_TEMP29 = X10_TEMP28 ; 
struct Point1 RX10_TEMP70  ; 
Point1_Point1( &RX10_TEMP70/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP71 = X10_TEMP19 .distValue ; 
struct Region1 RX10_TEMP72 = RX10_TEMP71 .dReg ; 
const int RX10_TEMP73 = searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; 
const int RX10_TEMP74 = 0 ; 
const int RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; 
if ( RX10_TEMP75 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP76 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP77 = getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; 
const int RX10_TEMP79 = /* here  */ 0 ; 
const int RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; 
if ( RX10_TEMP80 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP78 = "Bad place access for array X10_TEMP19" ; 
fprintf(stderr, RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; 
} 
} 

double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) 
{ 
{ struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP11 = getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; 
const double X10_TEMP4 = RX10_TEMP11 ; 
return X10_TEMP4 ; 
} 
} 

void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int n ) 
{ 
{ struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
const double X10_TEMP4 = 0 ; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; 
struct doubleRefArray1 X10_TEMP6 = X10_TEMP0 ->start_time ; 
const double X10_TEMP9 = 0 ; 
const double X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP12 = X10_TEMP6 .distValue ; 
struct Region1 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int RX10_TEMP14 = searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int RX10_TEMP15 = 0 ; 
const int RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP18 = getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const int RX10_TEMP20 = /* here  */ 0 ; 
const int RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; 
fprintf(stderr, RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; 
struct doubleRefArray1 X10_TEMP11 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP14 = 0 ; 
const double X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*Assignment*/, n ) ; 
struct Dist1 RX10_TEMP23 = X10_TEMP11 .distValue ; 
struct Region1 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int RX10_TEMP25 = searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int RX10_TEMP26 = 0 ; 
const int RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP29 = getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const int RX10_TEMP31 = /* here  */ 0 ; 
const int RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; 
fprintf(stderr, RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; 
} 
} 

void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) 
{ 
{ /*UpdatableVariableDeclaration*/int i = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP4 = i < _Timer_max_counters ; 

while ( X10_TEMP4 ) 
{ 
{ Timer_resetTimer ( X10_TEMP0 , i ) ; 
const int X10_TEMP6 = i ; 
const int X10_TEMP7 = 1 ; 
i = i + X10_TEMP7 ; } 
X10_TEMP4 = i < _Timer_max_counters ; } 

} 
} 

void /*static*/runMain ( ) 
{ 
{ /*UpdatableVariableDeclaration*/ struct Timer  * tmr = (struct Timer  *) GC_MALLOC(sizeof(struct Timer ));  
Timer_Timer( tmr/*Assignment*/) ; 
/*UpdatableVariableDeclaration*/int count = 0 ; 
/* finish  */ 
{ 
{ Timer_start ( tmr , count ) ; 
} 
} 

/* finish  */ 
{ 
{ struct MR * X10_TEMP4 = (struct MR  *)  GC_MALLOC(sizeof(struct MR ));  
MR_MR( X10_TEMP4/*Assignment*/) ; 
MR_run ( X10_TEMP4 ) ; 
} 
} 

Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for mapreduce: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)GC_MALLOC(1000 * sizeof(char));
sprintf(tempC1, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC1;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)GC_MALLOC(1000 * sizeof(char));
sprintf(tempC2, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC2;; 
printf( "%s\n",X10_TEMP12 ) ; 
} 
} 

Region1 /*static*/_MR_r_init ( ) 
{ const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 300000 ; 
struct Region1 X10_TEMP6 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
return X10_TEMP6 ; 
} 

void /*static*/MR_run (  struct MR  * const X10_TEMP0 ) 
{ 
{ MR_map ( X10_TEMP0 ) ; 
MR_reduce ( X10_TEMP0 ) ; 
const int X10_TEMP2 = X10_TEMP0 ->total ; 
const char * X10_TEMP4 = "" ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)GC_MALLOC(1000 * sizeof(char));
sprintf(tempC3, "%s%d",X10_TEMP4,X10_TEMP2);
const char * X10_TEMP3 = tempC3;; 
printf( "%s\n",X10_TEMP3 ) ; 
} 
} 

void /*static*/MR_map (  struct MR  * const X10_TEMP0 ) 
{ 
{ struct intRefArray1 b = X10_TEMP0 ->a ; 
/* finish  */ 
{ struct Dist1 RX10_TEMP1 = b .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP4 ; SX10_TEMP1 ++ ) 
{ const int RX10_TEMP0 = SX10_TEMP1 ; 
const int RX10_TEMP6 = RX10_TEMP0 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
struct Dist1 RX10_TEMP7 = b .distValue ; 
struct Dist1 X10_TEMP3 = RX10_TEMP7 ; 
struct Region1 RX10_TEMP8 = X10_TEMP3 .dReg ; 
const int RX10_TEMP9 = searchPointInRegion1 ( RX10_TEMP8 , p ) ; 
const int RX10_TEMP10 = 0 ; 
const int RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ const char * RX10_TEMP12 = "Point p not found in the distribution X10_TEMP3." ; 
fprintf(stderr, RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP13 = getPlaceFromDist1 ( X10_TEMP3 , RX10_TEMP9 ) ; 
const int X10_TEMP4 = RX10_TEMP13 ; 
/* async ( X10_TEMP4 )  */ 
{ 
{ struct Dist1 RX10_TEMP14 = b .distValue ; 
struct Region1 RX10_TEMP15 = RX10_TEMP14 .dReg ; 
const int RX10_TEMP16 = searchPointInRegion1 ( RX10_TEMP15 , p ) ; 
const int RX10_TEMP17 = 0 ; 
const int RX10_TEMP18 = RX10_TEMP16 < RX10_TEMP17 ; 
if ( RX10_TEMP18 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP19 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP20 = getPlaceFromDist1 ( RX10_TEMP14 , RX10_TEMP16 ) ; 
const int RX10_TEMP22 = /* here  */ 0 ; 
const int RX10_TEMP23 = RX10_TEMP20 != RX10_TEMP22 ; 
if ( RX10_TEMP23 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP21 = "Bad place access for array b" ; 
fprintf(stderr, RX10_TEMP21 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP24 = getRefArrayValue1int ( b , RX10_TEMP16 ) ; 
const int X10_TEMP8 = RX10_TEMP24 ; 
const int X10_TEMP10 = MR_f ( X10_TEMP0 , X10_TEMP8 ) ; 
const int X10_TEMP11 = X10_TEMP10 ; 
struct Dist1 RX10_TEMP25 = b .distValue ; 
struct Region1 RX10_TEMP26 = RX10_TEMP25 .dReg ; 
const int RX10_TEMP27 = searchPointInRegion1 ( RX10_TEMP26 , p ) ; 
const int RX10_TEMP28 = 0 ; 
const int RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; 
if ( RX10_TEMP29 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP30 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP31 = getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; 
const int RX10_TEMP33 = /* here  */ 0 ; 
const int RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; 
if ( RX10_TEMP34 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP32 = "Bad place access for array b" ; 
fprintf(stderr, RX10_TEMP32 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( b , RX10_TEMP27 , X10_TEMP11 ) ; 
} 
} 

} 

} 

} 
} 

int /*static*/MR_f (  struct MR  * const X10_TEMP0 , const int x ) 
{ 
{ const int X10_TEMP2 = x * x ; 
return X10_TEMP2 ; 
} 
} 

void /*static*/MR_reduce (  struct MR  * const X10_TEMP0 ) 
{ 
{ const int h = /* here  */ 0 ; 
struct intRefArray1 X10_TEMP2 = X10_TEMP0 ->a ; 
struct Dist1 RX10_TEMP0 = X10_TEMP2 .distValue ; 
struct Region1 RX10_TEMP1 = RX10_TEMP0 .dReg ; 
struct Region1 reg = RX10_TEMP1 ; 
const int X10_TEMP4 = /* here  */ 0 ; 
struct Dist1 dis = getPlaceDist1 ( reg , X10_TEMP4 ) ; 
struct Region1 RX10_TEMP2 = dis .dReg ; 
const int RX10_TEMP3 = 0 ; 
const int RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP5 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP5 = RX10_TEMP5 - RX10_TEMP4 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP6 = RX10_TEMP5 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP7 = RX10_TEMP5 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP8 = (intStub *)calloc(RX10_TEMP7,sizeof( intStub )); 
/* finish  */ 
{ for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP6 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP9 = SX10_TEMP3 ; 
const int RX10_TEMP10 = /* here  */ 0 ; 
const int RX10_TEMP11 = RX10_TEMP9 ; 
const int RX10_TEMP12 = /* place.places ( RX10_TEMP11 )  */ 0 
; 
const int RX10_TEMP13 = getDistLocalCount1 ( dis , RX10_TEMP11 ) ; 
const int RX10_TEMP14 = RX10_TEMP13 - RX10_TEMP4 ; 
/* async ( RX10_TEMP12 )  */ 
{ const int SX10_TEMP4 = 1 ; 
const int RX10_TEMP15 = RX10_TEMP14 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ int * const RX10_TEMP16 = (int *)calloc(RX10_TEMP15,sizeof( int )); 
struct intStub RX10_TEMP17  ; 
intStub_intStub( &RX10_TEMP17/*Assignment*/, RX10_TEMP16 ) ; 
/* async ( RX10_TEMP10 )  */ 
{ RX10_TEMP8 [ RX10_TEMP9 ] = RX10_TEMP17 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct intStub * const SX10_TEMP6 = (intStub *)calloc(RX10_TEMP6,sizeof( intStub )); 
for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < RX10_TEMP6 ; SX10_TEMP7 ++ ) 
{ const int RX10_TEMP20 = SX10_TEMP7 ; 
struct intStub RX10_TEMP19 = RX10_TEMP8 [ RX10_TEMP20 ] 
; 
SX10_TEMP6 [ RX10_TEMP20 ] = RX10_TEMP19 ; 
} 

/*Updatable ARRAY*/ struct intStub * const RX10_TEMP18 = SX10_TEMP6 ; 
struct intRefArray1 RX10_TEMP21  ; 
intRefArray1_intRefArray1( &RX10_TEMP21/*Assignment*/, dis , RX10_TEMP18 ) ; 
struct intRefArray1 result = RX10_TEMP21 ; 
struct intRefArray1 X10_TEMP8 = X10_TEMP0 ->a ; 
struct Dist1 RX10_TEMP23 = X10_TEMP8 .distValue ; 
struct Region1 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int RX10_TEMP27 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP25 = RX10_TEMP24 .regSize ; 
RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27 ; const int SX10_TEMP8 = 1 ; 
const int RX10_TEMP26 = RX10_TEMP25 + SX10_TEMP8 ; 
for ( int SX10_TEMP9 = 0 ; SX10_TEMP9 < RX10_TEMP26 ; SX10_TEMP9 ++ ) 
{ const int RX10_TEMP22 = SX10_TEMP9 ; 
const int RX10_TEMP28 = RX10_TEMP22 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP24 , RX10_TEMP28 ) ; 

{ /* finish  */ 
{ 
{ struct intRefArray1 c = X10_TEMP0 ->a ; 
struct intRefArray1 X10_TEMP10 = X10_TEMP0 ->a ; 
struct Dist1 RX10_TEMP29 = X10_TEMP10 .distValue ; 
struct Dist1 X10_TEMP11 = RX10_TEMP29 ; 
struct Region1 RX10_TEMP30 = X10_TEMP11 .dReg ; 
const int RX10_TEMP31 = searchPointInRegion1 ( RX10_TEMP30 , p ) ; 
const int RX10_TEMP32 = 0 ; 
const int RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; 
if ( RX10_TEMP33 ) 
{ const char * RX10_TEMP34 = "Point p not found in the distribution X10_TEMP11." ; 
fprintf(stderr, RX10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP35 = getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP31 ) ; 
const int X10_TEMP14 = RX10_TEMP35 ; 
/* async ( X10_TEMP14 )  */ 
{ 
{ struct Dist1 RX10_TEMP36 = c .distValue ; 
struct Region1 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , p ) ; 
const int RX10_TEMP39 = 0 ; 
const int RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP41 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP42 = getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const int RX10_TEMP44 = /* here  */ 0 ; 
const int RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP43 = "Bad place access for array c" ; 
fprintf(stderr, RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP46 = getRefArrayValue1int ( c , RX10_TEMP38 ) ; 
const int v = RX10_TEMP46 ; 
/* async ( h )  */ 
{ 
{ const int X10_TEMP20 = v ; 
struct Dist1 RX10_TEMP47 = result .distValue ; 
struct Region1 RX10_TEMP48 = RX10_TEMP47 .dReg ; 
const int RX10_TEMP49 = searchPointInRegion1 ( RX10_TEMP48 , p ) ; 
const int RX10_TEMP50 = 0 ; 
const int RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP52 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP53 = getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; 
const int RX10_TEMP55 = /* here  */ 0 ; 
const int RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP54 = "Bad place access for array result" ; 
fprintf(stderr, RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( result , RX10_TEMP49 , X10_TEMP20 ) ; 
} 
} 

} 
} 

} 
} 

} 
} 

struct Dist1 RX10_TEMP58 = result .distValue ; 
struct Region1 RX10_TEMP59 = RX10_TEMP58 .dReg ; 
const int RX10_TEMP62 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP60 = RX10_TEMP59 .regSize ; 
RX10_TEMP60 = RX10_TEMP60 - RX10_TEMP62 ; const int SX10_TEMP10 = 1 ; 
const int RX10_TEMP61 = RX10_TEMP60 + SX10_TEMP10 ; 
for ( int SX10_TEMP11 = 0 ; SX10_TEMP11 < RX10_TEMP61 ; SX10_TEMP11 ++ ) 
{ const int RX10_TEMP57 = SX10_TEMP11 ; 
const int RX10_TEMP63 = RX10_TEMP57 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP59 , RX10_TEMP63 ) ; 

{ const int X10_TEMP23 = X10_TEMP0 ->total ; 
struct Dist1 RX10_TEMP64 = result .distValue ; 
struct Region1 RX10_TEMP65 = RX10_TEMP64 .dReg ; 
const int RX10_TEMP66 = searchPointInRegion1 ( RX10_TEMP65 , p ) ; 
const int RX10_TEMP67 = 0 ; 
const int RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP69 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP69 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP70 = getPlaceFromDist1 ( RX10_TEMP64 , RX10_TEMP66 ) ; 
const int RX10_TEMP72 = /* here  */ 0 ; 
const int RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72 ; 
if ( RX10_TEMP73 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP71 = "Bad place access for array result" ; 
fprintf(stderr, RX10_TEMP71 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP74 = getRefArrayValue1int ( result , RX10_TEMP66 ) ; 
const int X10_TEMP24 = RX10_TEMP74 ; 
const int X10_TEMP26 = X10_TEMP23 + X10_TEMP24 ; 
const int X10_TEMP27 = X10_TEMP26 ; 
X10_TEMP0 ->total = ( X10_TEMP27 ) ; 
} 
} 

} 
} 

int /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int dim0 = r .dim0 ; 
const int low0 = r .low0 ; 
const int high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/int pt0 = target .f0 ; 
const int lbound0 = pt0 < low0 ; 
const int hbound0 = pt0 >= high0 ; 
const int dim1 = 1 ; 
/*UpdatableVariableDeclaration*/int outRegion = 0 ; 
outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) 
{ /*UpdatableVariableDeclaration*/int notFound = 0 ; 
notFound = notFound - one ; return notFound ; 
} 

const int stride1 = 1 ; 
const int stride0 = stride1 * dim1 ; 
pt0 = pt0 - low0 ; const int offset0 = stride0 * pt0 ; 
/*UpdatableVariableDeclaration*/int found = 0 ; 
found = found + offset0 ; return found ; 
} 

double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int index ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist .runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
const double returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const int p ) 
{ struct Region1 r = dn .dReg ; 
const int regType = r .regType ; 
if ( regType ) 
{ struct Dist1 regDist = restrictDistRegular1 ( dn , p ) ; 
return regDist ; 
} 

struct Dist1 arbDist = restrictDistArbitrary1 ( dn , p ) ; 
return arbDist ; 
} 

Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region1 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int dim = dReg .regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
const int stride1 = 1 ; 
const int dim1 = dReg .dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = dReg .low0 ; 
/*Updatable ARRAY*/ int * const dPlace = dDist .placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist .counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int )); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int )); 
const int cond1 = numPoints > zero ; 
if ( cond1 ) 
{ numPoints = 0 ; for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < dRegReg ; SX10_TEMP6 ++ ) 
{ const int pt = SX10_TEMP6 ; 
const int dP = dPlace [ pt ] 
; 
const int cond2 = p == dP ; 
if ( cond2 ) 
{ const int i = pt ; 
tempArray [ numPoints ] = i ; 
numPoints = numPoints + one ; } 

} 

} 

/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP7 = (Point1 *)calloc(tempReg,sizeof( Point1 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/int f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 dpt  ; 
Point1_Point1( &dpt/*Assignment*/, f1 ) ; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const pointArray = SX10_TEMP7 ; 
struct Region1 dpReg  ; 
Region1_Region1_2( &dpReg/*Assignment*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*Assignment*/, rPlace , rSizeNumPoints ) ; 
struct Dist1 dpDistn  ; 
Dist1_Dist1( &dpDistn/*Assignment*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region1 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int dim = dReg .regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point1 * const dArray = dReg .pointArray ; 
/*Updatable ARRAY*/ int * const dPlace = dDist .placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist .counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int )); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int )); 
const int cond1 = numPoints > zero ; 
if ( cond1 ) 
{ numPoints = 0 ; for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < dRegReg ; SX10_TEMP6 ++ ) 
{ const int pt = SX10_TEMP6 ; 
const int dP = dPlace [ pt ] 
; 
const int cond2 = p == dP ; 
if ( cond2 ) 
{ const int i = pt ; 
tempArray [ numPoints ] = i ; 
numPoints = numPoints + one ; } 

} 

} 

/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP7 = (Point1 *)calloc(tempReg,sizeof( Point1 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
struct Point1 dpt = dArray [ idx ] 
; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const pointArray = SX10_TEMP7 ; 
struct Region1 dpReg  ; 
Region1_Region1_2( &dpReg/*Assignment*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*Assignment*/, rPlace , rSizeNumPoints ) ; 
struct Dist1 dpDistn  ; 
Dist1_Dist1( &dpDistn/*Assignment*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

int /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ /*Updatable ARRAY*/ struct Point1 * const pointArray = r .pointArray ; 
/*UpdatableVariableDeclaration*/int start = 0 ; 
/*UpdatableVariableDeclaration*/int end = r .regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/int result = zero - one ; 
/*UpdatableVariableDeclaration*/int notDone = start <= end ; 

while ( notDone ) 
{ /*UpdatableVariableDeclaration*/int mid = start + end ; 
mid = mid / two ; struct Point1 temp = pointArray [ mid ] 
; 
const int pointCompare = comparePoint1 ( target , temp ) ; 
const int eq = pointCompare == zero ; 
const int lt = pointCompare == one ; 
if ( eq ) 
{ return mid ; 
} 
else 
{ if ( lt ) 
{ end = mid - one ; } 
else 
{ start = mid + one ; } 


} 


notDone = start <= end ; } 

return result ; 
} 

Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) 
{ const int rSize = r .regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int dDist = rSizeMinusOne + SX10_TEMP1 ; 
/*Updatable ARRAY*/ int * const placeArray = (int *)calloc(dDist,sizeof( int )); 
const int N = /* place.MAX_PLACES  */ 1 ; 
const int q = rSize % N ; 
const int p = rSize / N ; 
/*UpdatableVariableDeclaration*/int blockSize = p + one ; 
/*UpdatableVariableDeclaration*/int arraySize = q * blockSize ; 
/*UpdatableVariableDeclaration*/int offset = 0 ; 
/*UpdatableVariableDeclaration*/int initPlace = /* place.FIRST_PLACE  */ 0 ; 
getCyclic ( placeArray , arraySize , initPlace , blockSize ) ; 
/*UpdatableVariableDeclaration*/int remainingPlaces = N - q ; 
const int cond = remainingPlaces == zero ; 
if ( cond ) 
{ /*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < dReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP3 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP3 ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*Assignment*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*Assignment*/, r , pointDist1 ) ; 
return retDist ; 
} 

offset = arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = /* place.places ( q )  */ 0 
; /*UpdatableVariableDeclaration*/int chunk = blockSize ; 
const int ifCond = blockSize > arraySize ; 
if ( ifCond ) 
{ chunk = arraySize ; } 

/*UpdatableVariableDeclaration*/int index = offset ; 
/*UpdatableVariableDeclaration*/int dSize = index + chunk ; 
dSize = dSize - one ; const int ub0 = chunk - one ; 
const int SX10_TEMP5 = 1 ; 
const int pointReg0 = ub0 + SX10_TEMP5 ; 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < pointReg0 ; SX10_TEMP6 ++ ) 
{ const int pt = SX10_TEMP6 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = initPlace ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; /*UpdatableVariableDeclaration*/int pl = /* initPlace . next ( )  */ 0 ; 
/*UpdatableVariableDeclaration*/int whileCond = arraySize != zero ; 

while ( whileCond ) 
{ const int tailCond = chunk > arraySize ; 
if ( tailCond ) 
{ dSize = index + arraySize ; dSize = dSize - one ; const int ub = arraySize - one ; 
const int SX10_TEMP7 = 1 ; 
const int pointReg1 = ub + SX10_TEMP7 ; 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < pointReg1 ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = pl ; 
} 

arraySize = 0 ; } 
else 
{ dSize = index + chunk ; dSize = dSize - one ; const int ub = chunk - one ; 
const int SX10_TEMP9 = 1 ; 
const int pointReg1 = ub + SX10_TEMP9 ; 
for ( int SX10_TEMP10 = 0 ; SX10_TEMP10 < pointReg1 ; SX10_TEMP10 ++ ) 
{ const int pt = SX10_TEMP10 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = pl ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; } 


pl = /* pl . next ( )  */ 0 ; whileCond = arraySize != zero ; } 

/*Updatable ARRAY*/ int * const SX10_TEMP11 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP12 = 0 ; SX10_TEMP12 < dReg ; SX10_TEMP12 ++ ) 
{ const int pt = SX10_TEMP12 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP11 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP11 ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*Assignment*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*Assignment*/, r , pointDist1 ) ; 
return retDist ; 
} 

void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int index , const double val ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist .runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = val ; 
} 

int /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int index ) 
{ struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const placeArray = d .placeArray ; 
const int retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

void /*static*/getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) 
{ const int zero = 0 ; 
const int one = 1 ; 
/*UpdatableVariableDeclaration*/int N = arraySize ; 
/*UpdatableVariableDeclaration*/int chunk = blockSize ; 
const int ifCond = blockSize > N ; 
if ( ifCond ) 
{ chunk = N ; } 

/*UpdatableVariableDeclaration*/int index = 0 ; 
/*UpdatableVariableDeclaration*/int dSize = index + chunk ; 
dSize = dSize - one ; const int SX10_TEMP0 = 1 ; 
const int pointReg = dSize + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < pointReg ; SX10_TEMP1 ++ ) 
{ const int p = SX10_TEMP1 ; 
placeArray [ p ] = initPlace ; 
} 

index = index + chunk ; N = N - chunk ; /*UpdatableVariableDeclaration*/int pl = /* initPlace . next ( )  */ 0 ; 
/*UpdatableVariableDeclaration*/int whileCond = N != zero ; 

while ( whileCond ) 
{ const int tailCond = chunk > N ; 
if ( tailCond ) 
{ dSize = index + N ; dSize = dSize - one ; const int ub = N - one ; 
const int SX10_TEMP2 = 1 ; 
const int pointReg1 = ub + SX10_TEMP2 ; 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < pointReg1 ; SX10_TEMP3 ++ ) 
{ const int p = SX10_TEMP3 ; 
const int tempPt = p + index ; 
placeArray [ tempPt ] = pl ; 
} 

N = 0 ; } 
else 
{ dSize = index + chunk ; dSize = dSize - one ; const int ub = chunk - one ; 
const int SX10_TEMP4 = 1 ; 
const int pointReg1 = ub + SX10_TEMP4 ; 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < pointReg1 ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
const int tempPt = p + index ; 
placeArray [ tempPt ] = pl ; 
} 

index = index + chunk ; N = N - chunk ; } 


pl = /* pl . next ( )  */ 0 ; whileCond = N != zero ; } 

} 

int /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int index ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist .runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct intStub * const contents = array .contents ; 
struct intStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int * const localArray = indexStub .localArray ; 
const int returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

int /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int placeIndex ) 
{ struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const counts = d .counts ; 
const int localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
/*UpdatableVariableDeclaration*/int point1 = 0 ; 
/*UpdatableVariableDeclaration*/int point2 = 0 ; 
/*UpdatableVariableDeclaration*/int lt = 0 ; 
/*UpdatableVariableDeclaration*/int gt = 0 ; 
point1 = pt1 .f0 ; point2 = pt2 .f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ return one ; 
} 

if ( gt ) 
{ return two ; 
} 

return zero ; 
} 

int /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ const int regType = r .regType ; 
if ( regType ) 
{ const int constantSearch = constantSearchRegion1 ( r , target ) ; 
return constantSearch ; 
} 

const int binarySearch = binarySearchRegion1 ( r , target ) ; 
return binarySearch ; 
} 

Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int ordl ) 
{ const int regType = reg .regType ; 
if ( regType ) 
{ struct Point1 pt = regionOrdinalPointRegular1 ( reg , ordl ) ; 
return pt ; 
} 

struct Point1 pt = regionOrdinalPointArbitrary1 ( reg , ordl ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int ordl ) 
{ const int stride1 = 1 ; 
const int dim1 = reg .dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/int f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 pt  ; 
Point1_Point1( &pt/*Assignment*/, f1 ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int ordl ) 
{ /*Updatable ARRAY*/ struct Point1 * const pointArray = reg .pointArray ; 
struct Point1 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const int p ) 
{ const int rSize = r .regSize ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < dReg ; SX10_TEMP2 ++ ) 
{ const int pt = SX10_TEMP2 ; 
SX10_TEMP1 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
struct Dist pointDist  ; 
Dist_Dist( &pointDist/*Assignment*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*Assignment*/, r , pointDist ) ; 
return retDist ; 
} 

/*Updatable ARRAY*/ int * /*static*/initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) 
{ /*Updatable ARRAY*/ int * const SX10_TEMP0 = (int *)calloc(tempReg,sizeof( int )); 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < tempReg ; SX10_TEMP1 ++ ) 
{ const int p = SX10_TEMP1 ; 
const int tempInt = tempArr [ p ] 
; 
SX10_TEMP0 [ p ] = tempInt ; 
} 

/*Updatable ARRAY*/ int * const vTemp = SX10_TEMP0 ; 
return vTemp ; 
} 

void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int index , const int val ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist .runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct intStub * const contents = array .contents ; 
struct intStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = val ; 
} 

Region1 /*static*/createNewRegion1R ( const int v1_0 , const int v1_1 ) 
{ const int zero = 0 ; 
const int one = 1 ; 
/*UpdatableVariableDeclaration*/int regType = 1 ; 
const int tempBool1 = 1 ; 
regType = regType && tempBool1 ; const int l1 = v1_1 - v1_0 ; 
const int dim1 = l1 + one ; 
const int stride1 = 1 ; 
const int stride0 = stride1 * dim1 ; 
const int rSize = stride0 - one ; 
const int cond = stride0 <= zero ; 
if ( cond ) 
{ const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP1 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
struct Point1 pt  ; 
Point1_Point1( &pt/*Assignment*/, zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP1 ; 
struct Region1 retRegEmpty  ; 
Region1_Region1_4( &retRegEmpty/*Assignment*/, ptArray , stride0 , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP4 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
struct Point1 pt  ; 
Point1_Point1( &pt/*Assignment*/, zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP4 ; 
struct Region1 retRegRegular  ; 
Region1_Region1_4( &retRegRegular/*Assignment*/, ptArray , stride0 , v1_0 , dim1 ) ; 
return retRegRegular ; 
} 
else 
{ const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP7 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; struct Point1 retPoint  ; 
Point1_Point1( &retPoint/*Assignment*/, f1 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP7 ; 
struct Region1 retReg  ; 
Region1_Region1_2( &retReg/*Assignment*/, ptArray , stride0 ) ; 
return retReg ; 
} 


} 



Timer *Timer_Timer ( struct Timer *TimerTEMP) 
{ 
{ const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = /*program*/_Timer_max_counters ; 
struct Region1 X10_TEMP5 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const int X10_TEMP6 = /* place.FIRST_PLACE  */ 0 ; 
struct Dist1 d = getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (doubleStub *)calloc(RX10_TEMP5,sizeof( doubleStub )); 
/* finish  */ 
{ for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
/* async ( RX10_TEMP10 )  */ 
{ const int SX10_TEMP4 = 1 ; 
const int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP5 = (double *)calloc(RX10_TEMP14,sizeof( double )); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < RX10_TEMP14 ; SX10_TEMP6 ++ ) 
{ const int RX10_TEMP13 = SX10_TEMP6 ; 

{ const double X10_TEMP9 = 0 ; 
SX10_TEMP5 [ RX10_TEMP13 ] = X10_TEMP9 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP15 = SX10_TEMP5 ; 
struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*Assignment*/, RX10_TEMP15 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP16 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP7 = (doubleStub *)calloc(RX10_TEMP4,sizeof( doubleStub )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < RX10_TEMP4 ; SX10_TEMP8 ++ ) 
{ const int RX10_TEMP19 = SX10_TEMP8 ; 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
SX10_TEMP7 [ RX10_TEMP19 ] = RX10_TEMP18 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP17 = SX10_TEMP7 ; 
struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*Assignment*/, d , RX10_TEMP17 ) ; 
struct doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; 
TimerTEMP->start_time = ( X10_TEMP11 ) ; 
struct Region1 RX10_TEMP21 = d .dReg ; 
const int RX10_TEMP22 = 0 ; 
const int RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP24 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int SX10_TEMP9 = 1 ; 
const int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP9 ; 
const int SX10_TEMP10 = 1 ; 
const int RX10_TEMP26 = RX10_TEMP24 + SX10_TEMP10 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (doubleStub *)calloc(RX10_TEMP26,sizeof( doubleStub )); 
/* finish  */ 
{ for ( int SX10_TEMP12 = 0 ; SX10_TEMP12 < RX10_TEMP25 ; SX10_TEMP12 ++ ) 
{ const int RX10_TEMP28 = SX10_TEMP12 ; 
const int RX10_TEMP29 = /* here  */ 0 ; 
const int RX10_TEMP30 = RX10_TEMP28 ; 
const int RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ 0 
; 
const int RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
/* async ( RX10_TEMP31 )  */ 
{ const int SX10_TEMP13 = 1 ; 
const int RX10_TEMP35 = RX10_TEMP33 + SX10_TEMP13 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP14 = (double *)calloc(RX10_TEMP35,sizeof( double )); 
for ( int SX10_TEMP15 = 0 ; SX10_TEMP15 < RX10_TEMP35 ; SX10_TEMP15 ++ ) 
{ const int RX10_TEMP34 = SX10_TEMP15 ; 

{ const double X10_TEMP13 = 0 ; 
SX10_TEMP14 [ RX10_TEMP34 ] = X10_TEMP13 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP36 = SX10_TEMP14 ; 
struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*Assignment*/, RX10_TEMP36 ) ; 
/* async ( RX10_TEMP29 )  */ 
{ RX10_TEMP27 [ RX10_TEMP28 ] = RX10_TEMP37 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP16 = (doubleStub *)calloc(RX10_TEMP25,sizeof( doubleStub )); 
for ( int SX10_TEMP17 = 0 ; SX10_TEMP17 < RX10_TEMP25 ; SX10_TEMP17 ++ ) 
{ const int RX10_TEMP40 = SX10_TEMP17 ; 
struct doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] 
; 
SX10_TEMP16 [ RX10_TEMP40 ] = RX10_TEMP39 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP38 = SX10_TEMP16 ; 
struct doubleRefArray1 RX10_TEMP41  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP41/*Assignment*/, d , RX10_TEMP38 ) ; 
struct doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; 
TimerTEMP->elapsed_time = ( X10_TEMP15 ) ; 
struct Region1 RX10_TEMP42 = d .dReg ; 
const int RX10_TEMP43 = 0 ; 
const int RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP45 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; const int SX10_TEMP18 = 1 ; 
const int RX10_TEMP46 = RX10_TEMP45 + SX10_TEMP18 ; 
const int SX10_TEMP19 = 1 ; 
const int RX10_TEMP47 = RX10_TEMP45 + SX10_TEMP19 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (doubleStub *)calloc(RX10_TEMP47,sizeof( doubleStub )); 
/* finish  */ 
{ for ( int SX10_TEMP21 = 0 ; SX10_TEMP21 < RX10_TEMP46 ; SX10_TEMP21 ++ ) 
{ const int RX10_TEMP49 = SX10_TEMP21 ; 
const int RX10_TEMP50 = /* here  */ 0 ; 
const int RX10_TEMP51 = RX10_TEMP49 ; 
const int RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ 0 
; 
const int RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
/* async ( RX10_TEMP52 )  */ 
{ const int SX10_TEMP22 = 1 ; 
const int RX10_TEMP56 = RX10_TEMP54 + SX10_TEMP22 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP23 = (double *)calloc(RX10_TEMP56,sizeof( double )); 
for ( int SX10_TEMP24 = 0 ; SX10_TEMP24 < RX10_TEMP56 ; SX10_TEMP24 ++ ) 
{ const int RX10_TEMP55 = SX10_TEMP24 ; 

{ const double X10_TEMP17 = 0 ; 
SX10_TEMP23 [ RX10_TEMP55 ] = X10_TEMP17 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP57 = SX10_TEMP23 ; 
struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*Assignment*/, RX10_TEMP57 ) ; 
/* async ( RX10_TEMP50 )  */ 
{ RX10_TEMP48 [ RX10_TEMP49 ] = RX10_TEMP58 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP25 = (doubleStub *)calloc(RX10_TEMP46,sizeof( doubleStub )); 
for ( int SX10_TEMP26 = 0 ; SX10_TEMP26 < RX10_TEMP46 ; SX10_TEMP26 ++ ) 
{ const int RX10_TEMP61 = SX10_TEMP26 ; 
struct doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] 
; 
SX10_TEMP25 [ RX10_TEMP61 ] = RX10_TEMP60 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP59 = SX10_TEMP25 ; 
struct doubleRefArray1 RX10_TEMP62  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP62/*Assignment*/, d , RX10_TEMP59 ) ; 
struct doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; 
TimerTEMP->total_time = ( X10_TEMP19 ) ; 
} 

 return  TimerTEMP; 

} 


MR *MR_MR ( struct MR *MRTEMP) 
{ 
{ struct Region1 X10_TEMP2 = /*program*/_MR_r ; 
struct Dist1 X10_TEMP3 = getBlockDist1 ( X10_TEMP2 ) ; 
struct Dist1 d = X10_TEMP3 ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (intStub *)calloc(RX10_TEMP5,sizeof( intStub )); 
/* finish  */ 
{ for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct Dist1 RX10_TEMP13 = restrictDist1 ( d , RX10_TEMP10 ) ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
/* async ( RX10_TEMP10 )  */ 
{ const int SX10_TEMP4 = 1 ; 
const int RX10_TEMP17 = RX10_TEMP12 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP5 = (int *)calloc(RX10_TEMP17,sizeof( int )); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < RX10_TEMP17 ; SX10_TEMP6 ++ ) 
{ const int RX10_TEMP15 = SX10_TEMP6 ; 
const int RX10_TEMP16 = RX10_TEMP15 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; 

{ const int X10_TEMP7 = p .f0 ; 
SX10_TEMP5 [ RX10_TEMP15 ] = X10_TEMP7 ; 
} 
} 

/*Updatable ARRAY*/ int * const RX10_TEMP18 = SX10_TEMP5 ; 
struct intStub RX10_TEMP19  ; 
intStub_intStub( &RX10_TEMP19/*Assignment*/, RX10_TEMP18 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP19 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct intStub * const SX10_TEMP7 = (intStub *)calloc(RX10_TEMP4,sizeof( intStub )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < RX10_TEMP4 ; SX10_TEMP8 ++ ) 
{ const int RX10_TEMP22 = SX10_TEMP8 ; 
struct intStub RX10_TEMP21 = RX10_TEMP6 [ RX10_TEMP22 ] 
; 
SX10_TEMP7 [ RX10_TEMP22 ] = RX10_TEMP21 ; 
} 

/*Updatable ARRAY*/ struct intStub * const RX10_TEMP20 = SX10_TEMP7 ; 
struct intRefArray1 RX10_TEMP23  ; 
intRefArray1_intRefArray1( &RX10_TEMP23/*Assignment*/, d , RX10_TEMP20 ) ; 
struct intRefArray1 X10_TEMP9 = RX10_TEMP23 ; 
MRTEMP->a = ( X10_TEMP9 ) ; 
const int X10_TEMP11 = 0 ; 
MRTEMP->total = ( X10_TEMP11 ) ; 
} 

 return  MRTEMP; 

} 


Region1 Region1_Region1_2( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int minusOne = zero - one ; 
const int f = 0 ; 
const int regR = 1 ; 
Region1TEMP->regRank = ( regR ) ; 
Region1TEMP->regSize = ( regSize_ ) ; 
Region1TEMP->pointArray = ( pointArray_ ) ; 
Region1TEMP->regType = ( f ) ; 
Region1TEMP->low0 = ( minusOne ) ; 
Region1TEMP->dim0 = ( zero ) ; 

 return  *Region1TEMP; 

} 

Region1 Region1_Region1_4( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) 
{ const int t = 1 ; 
const int regR = 1 ; 
Region1TEMP->regRank = ( regR ) ; 
Region1TEMP->regSize = ( regSize_ ) ; 
Region1TEMP->pointArray = ( pointArray_ ) ; 
Region1TEMP->regType = ( t ) ; 
Region1TEMP->low0 = ( low0_ ) ; 
Region1TEMP->dim0 = ( dim0_ ) ; 

 return  *Region1TEMP; 

} 

Dist Dist_Dist ( struct Dist *DistTEMP, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) 
{ const int one = 1 ; 
const int zero = 0 ; 
const int maxPlaces = /* place.MAX_PLACES  */ 1 ; 
const int ub = maxPlaces - one ; 
const int SX10_TEMP0 = 1 ; 
const int countReg = ub + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int countDist = ub + SX10_TEMP1 ; 
const int rSize = arraySize - one ; 
const int SX10_TEMP2 = 1 ; 
const int arrayReg = rSize + SX10_TEMP2 ; 
const int SX10_TEMP3 = 1 ; 
const int runSumDist = rSize + SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempCounts = (int *)calloc(countDist,sizeof( int )); 
/*Updatable ARRAY*/ int * const tempRunSum = (int *)calloc(runSumDist,sizeof( int )); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < countReg ; SX10_TEMP6 ++ ) 
{ const int p = SX10_TEMP6 ; 
tempCounts [ p ] = zero ; 
} 

for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < arrayReg ; SX10_TEMP7 ++ ) 
{ const int p = SX10_TEMP7 ; 
const int pl = vPlaceArray [ p ] 
; 
const int index = /* pl . id  */ 0 ; 
const int oldVal = tempCounts [ index ] 
; 
tempRunSum [ p ] = oldVal ; 
const int oldValPlusOne = oldVal + one ; 
tempCounts [ index ] = oldValPlusOne ; 
} 

DistTEMP->placeArray = ( vPlaceArray ) ; 
/*Updatable ARRAY*/ int * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTEMP->counts = ( tempCountsV ) ; 
/*Updatable ARRAY*/ int * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTEMP->runningSum = ( tempRunSumV ) ; 

 return  *DistTEMP; 

} 

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTEMP, /*Updatable ARRAY*/ double * const localArray_ ) 
{ doubleStubTEMP->localArray = ( localArray_ ) ; 

 return  *doubleStubTEMP; 

} 

intStub intStub_intStub ( struct intStub *intStubTEMP, /*Updatable ARRAY*/ int * const localArray_ ) 
{ intStubTEMP->localArray = ( localArray_ ) ; 

 return  *intStubTEMP; 

} 

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1TEMP,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) 
{ Dist1TEMP->dReg = ( dReg_ ) ; 
Dist1TEMP->dDist = ( dDist_ ) ; 

 return  *Dist1TEMP; 

} 

Point1 Point1_Point1 ( struct Point1 *Point1TEMP, const int f0_ ) 
{ Point1TEMP->f0 = ( f0_ ) ; 

 return  *Point1TEMP; 

} 

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1TEMP,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) 
{ doubleRefArray1TEMP->distValue = ( distValue_ ) ; 
doubleRefArray1TEMP->contents = ( contents_ ) ; 

 return  *doubleRefArray1TEMP; 

} 

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1TEMP,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct intStub * const contents_ ) 
{ intRefArray1TEMP->distValue = ( distValue_ ) ; 
intRefArray1TEMP->contents = ( contents_ ) ; 

 return  *intRefArray1TEMP; 

} 
/* class RunMain */ int  main ( /*TODO*/) { GC_INIT();
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_MR_r = _MR_r_init ( ) ; 
runMain ( ) ; 
return 0;
} 
 const double getTIME(){
unsigned long long microsecs;
struct timeval tv; 
gettimeofday(&tv, NULL);
microsecs = ((unsigned long long)tv.tv_sec * 1000000);
microsecs += tv.tv_usec;
const double temp = (const double)microsecs;
const double temp2 = temp/1000;
return temp2; 
}
