#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int32_t _Timer_max_counters ;
struct Region1 /*VALUE*/ _Linpack_r ;
int32_t /*static*/_Timer_max_counters_init ( ) 
{ 
const int32_t X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->start_time ; 
const double X10_TEMP4 = getTIME( ) 
; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; 
} 

void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP5 = getTIME( ) 
; 
struct doubleRefArray1 X10_TEMP3 = X10_TEMP0 ->start_time ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP3 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP11 = getRefArrayValue1double ( X10_TEMP3 , RX10_TEMP3 ) ; 
const double X10_TEMP6 = RX10_TEMP11 ; 
const double X10_TEMP8 = X10_TEMP5 - X10_TEMP6 ; 
const double X10_TEMP9 = X10_TEMP8 ; 
struct Point1 RX10_TEMP12  ; 
Point1_Point1( &RX10_TEMP12/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP13 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
const int32_t RX10_TEMP15 = searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; 
const int32_t RX10_TEMP16 = 0 ; 
const uint32_t RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP18 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP18 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP19 = getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; 
const place_t RX10_TEMP21 = /* here  */ _here(); 
const uint32_t RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; 
if ( RX10_TEMP22 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; 
struct doubleRefArray1 X10_TEMP10 = X10_TEMP0 ->elapsed_time ; 
struct doubleRefArray1 X10_TEMP12 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP23  ; 
Point1_Point1( &RX10_TEMP23/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP24 = X10_TEMP12 .distValue ; 
struct Region1 RX10_TEMP25 = RX10_TEMP24 .dReg ; 
const int32_t RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; 
const int32_t RX10_TEMP27 = 0 ; 
const uint32_t RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP29 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP30 = getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; 
const place_t RX10_TEMP32 = /* here  */ _here(); 
const uint32_t RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32 ; 
if ( RX10_TEMP33 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; 
fprintf(stderr, "%s",RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP34 = getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; 
const double X10_TEMP14 = RX10_TEMP34 ; 
const int32_t X10_TEMP15 = 1000 ; 
const double X10_TEMP17 = X10_TEMP14 / X10_TEMP15 ; 
const double X10_TEMP18 = X10_TEMP17 ; 
struct Point1 RX10_TEMP35  ; 
Point1_Point1( &RX10_TEMP35/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP36 = X10_TEMP10 .distValue ; 
struct Region1 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int32_t RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; 
const int32_t RX10_TEMP39 = 0 ; 
const uint32_t RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP41 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP42 = getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const place_t RX10_TEMP44 = /* here  */ _here(); 
const uint32_t RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Bad place access for array X10_TEMP10" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 , X10_TEMP18 ) ; 
struct doubleRefArray1 X10_TEMP19 = X10_TEMP0 ->total_time ; 
struct doubleRefArray1 X10_TEMP21 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP46  ; 
Point1_Point1( &RX10_TEMP46/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP47 = X10_TEMP21 .distValue ; 
struct Region1 RX10_TEMP48 = RX10_TEMP47 .dReg ; 
const int32_t RX10_TEMP49 = searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; 
const int32_t RX10_TEMP50 = 0 ; 
const uint32_t RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP52 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP53 = getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; 
const place_t RX10_TEMP55 = /* here  */ _here(); 
const uint32_t RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP54 = "Bad place access for array X10_TEMP21" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP57 = getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ; 
const double X10_TEMP25 = RX10_TEMP57 ; 
struct doubleRefArray1 X10_TEMP23 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP58  ; 
Point1_Point1( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP59 = X10_TEMP23 .distValue ; 
struct Region1 RX10_TEMP60 = RX10_TEMP59 .dReg ; 
const int32_t RX10_TEMP61 = searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; 
const int32_t RX10_TEMP62 = 0 ; 
const uint32_t RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; 
if ( RX10_TEMP63 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP64 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP65 = getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; 
const place_t RX10_TEMP67 = /* here  */ _here(); 
const uint32_t RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; 
fprintf(stderr, "%s",RX10_TEMP66 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP69 = getRefArrayValue1double ( X10_TEMP23 , RX10_TEMP61 ) ; 
const double X10_TEMP26 = RX10_TEMP69 ; 
const double X10_TEMP28 = X10_TEMP25 + X10_TEMP26 ; 
const double X10_TEMP29 = X10_TEMP28 ; 
struct Point1 RX10_TEMP70  ; 
Point1_Point1( &RX10_TEMP70/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP71 = X10_TEMP19 .distValue ; 
struct Region1 RX10_TEMP72 = RX10_TEMP71 .dReg ; 
const int32_t RX10_TEMP73 = searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; 
const int32_t RX10_TEMP74 = 0 ; 
const uint32_t RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; 
if ( RX10_TEMP75 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP76 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP77 = getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; 
const place_t RX10_TEMP79 = /* here  */ _here(); 
const uint32_t RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; 
if ( RX10_TEMP80 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP78 = "Bad place access for array X10_TEMP19" ; 
fprintf(stderr, "%s",RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; 
} 

double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP11 = getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; 
const double X10_TEMP4 = RX10_TEMP11 ; 
return X10_TEMP4 ; 
} 

void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
const double X10_TEMP4 = 0 ; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; 
struct doubleRefArray1 X10_TEMP6 = X10_TEMP0 ->start_time ; 
const double X10_TEMP9 = 0 ; 
const double X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP12 = X10_TEMP6 .distValue ; 
struct Region1 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int32_t RX10_TEMP14 = searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int32_t RX10_TEMP15 = 0 ; 
const uint32_t RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP18 = getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const place_t RX10_TEMP20 = /* here  */ _here(); 
const uint32_t RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; 
struct doubleRefArray1 X10_TEMP11 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP14 = 0 ; 
const double X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP23 = X10_TEMP11 .distValue ; 
struct Region1 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int32_t RX10_TEMP25 = searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int32_t RX10_TEMP26 = 0 ; 
const uint32_t RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP29 = getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const place_t RX10_TEMP31 = /* here  */ _here(); 
const uint32_t RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t i = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP4 = i < _Timer_max_counters ; 

while ( X10_TEMP4 ) 
{ 
Timer_resetTimer ( X10_TEMP0 , i ) ; 
const int32_t X10_TEMP6 = i ; 
const int32_t X10_TEMP7 = 1 ; 
i = i + X10_TEMP7 ; X10_TEMP4 = i < _Timer_max_counters ; } 

} 

Region1 /*static*/_Linpack_r_init ( ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 2 ; 
struct Region1 X10_TEMP6 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
return X10_TEMP6 ; 
} 

void /*static*/Linpack_initdataSizesArray (  struct Linpack  * const X10_TEMP0 ,  struct intRefArray1 const datasizes ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const int32_t X10_TEMP4 = 150 ; 
const int32_t X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
struct Dist1 RX10_TEMP1 = datasizes .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array datasizes" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizes , RX10_TEMP3 , X10_TEMP5 ) ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP9 = 1000 ; 
const int32_t X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP12 = datasizes .distValue ; 
struct Region1 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int32_t RX10_TEMP14 = searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int32_t RX10_TEMP15 = 0 ; 
const uint32_t RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP18 = getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const place_t RX10_TEMP20 = /* here  */ _here(); 
const uint32_t RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP19 = "Bad place access for array datasizes" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizes , RX10_TEMP14 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 2 ; 
const int32_t X10_TEMP14 = 2000 ; 
const int32_t X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP23 = datasizes .distValue ; 
struct Region1 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int32_t RX10_TEMP25 = searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int32_t RX10_TEMP26 = 0 ; 
const uint32_t RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP29 = getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const place_t RX10_TEMP31 = /* here  */ _here(); 
const uint32_t RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP30 = "Bad place access for array datasizes" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizes , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

void /*static*/Linpack_JGFsetsize (  struct Linpack  * const X10_TEMP0 , const int32_t setSize ) 
{ 
const int32_t X10_TEMP2 = setSize ; 
X10_TEMP0 ->setSize = ( X10_TEMP2 ) ; 
} 

void /*static*/Linpack_JGFinitialise (  struct Linpack  * const X10_TEMP0 ,  struct Dist1 const vd ) 
{ 
struct Region1 RX10_TEMP0 = vd .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER1;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER1 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER1)[0] = RX10_TEMP5, TEMPCALLOCPOINTER1 = ((int32_t * )TEMPCALLOCPOINTER1)+1, memset(TEMPCALLOCPOINTER1,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( vd , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T1 utmp1  ; 
T1_T1( &utmp1/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC0) ;
a.size = sizeof(utmp1 );
a.params = (void *)(&utmp1 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER2;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER2 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER2)[0] = RX10_TEMP4, TEMPCALLOCPOINTER2 = ((int32_t * )TEMPCALLOCPOINTER2)+1, memset(TEMPCALLOCPOINTER2,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct intStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP20  ; 
intRefArray1_intRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, vd , RX10_TEMP17 ) ; 
struct intRefArray1 datasizes = RX10_TEMP20 ; 
Linpack_initdataSizesArray ( X10_TEMP0 , datasizes ) ; 
const int32_t X10_TEMP6 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP21  ; 
Point1_Point1( &RX10_TEMP21/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP6 ) ; 
struct Dist1 RX10_TEMP22 = datasizes .distValue ; 
struct Region1 RX10_TEMP23 = RX10_TEMP22 .dReg ; 
const int32_t RX10_TEMP24 = searchPointInRegion1 ( RX10_TEMP23 , RX10_TEMP21 ) ; 
const int32_t RX10_TEMP25 = 0 ; 
const uint32_t RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; 
if ( RX10_TEMP26 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP27 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP28 = getPlaceFromDist1 ( RX10_TEMP22 , RX10_TEMP24 ) ; 
const place_t RX10_TEMP30 = /* here  */ _here(); 
const uint32_t RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30 ; 
if ( RX10_TEMP31 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP29 = "Bad place access for array datasizes" ; 
fprintf(stderr, "%s",RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP32 = getRefArrayValue1int ( datasizes , RX10_TEMP24 ) ; 
const int32_t X10_TEMP8 = RX10_TEMP32 ; 
const int32_t X10_TEMP9 = X10_TEMP8 ; 
X10_TEMP0 ->n = ( X10_TEMP9 ) ; 
const char * X10_TEMP10 = "ATTENTION: Running with smaller size (" ; 
const int32_t X10_TEMP11 = X10_TEMP0 ->n ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC1, "%s%d",X10_TEMP10,X10_TEMP11);
const char * X10_TEMP12 = tempC1;; 
const char * X10_TEMP13 = " instead of 500)" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC2, "%s%s",X10_TEMP12,X10_TEMP13);
const char * X10_TEMP15 = tempC2;; 
fprintf(  stdout, "%s\n",X10_TEMP15 ) ; 
const int32_t X10_TEMP17 = X10_TEMP0 ->n ; 
const int32_t X10_TEMP18 = X10_TEMP17 ; 
X10_TEMP0 ->ldaa = ( X10_TEMP18 ) ; 
const int32_t X10_TEMP19 = X10_TEMP0 ->ldaa ; 
const int32_t X10_TEMP20 = 1 ; 
const int32_t X10_TEMP22 = X10_TEMP19 + X10_TEMP20 ; 
const int32_t X10_TEMP23 = X10_TEMP22 ; 
X10_TEMP0 ->lda = ( X10_TEMP23 ) ; 
const int32_t X10_TEMP26 = 0 ; 
const int32_t X10_TEMP27 = X10_TEMP0 ->ldaa ; 
/*UpdatableVariableDeclaration*/
 struct Region1 vectorRegion = createNewRegion1R ( X10_TEMP26 , X10_TEMP27 ) ; 
const int32_t X10_TEMP33 = 0 ; 
const int32_t X10_TEMP30 = X10_TEMP0 ->ldaa ; 
const int32_t X10_TEMP31 = 1 ; 
const int32_t X10_TEMP34 = X10_TEMP30 - X10_TEMP31 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 vectorRegionMinus1 = createNewRegion1R ( X10_TEMP33 , X10_TEMP34 ) ; 
const place_t X10_TEMP36 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 vectorRegionMinus1Dist = getPlaceDist1 ( vectorRegionMinus1 , X10_TEMP36 ) ; 
const int32_t X10_TEMP40 = 0 ; 
const int32_t X10_TEMP41 = X10_TEMP0 ->ldaa ; 
const int32_t X10_TEMP44 = 0 ; 
const int32_t X10_TEMP45 = X10_TEMP0 ->lda ; 
/*UpdatableVariableDeclaration*/
 struct Region2 rectangularRegion = createNewRegion2RR ( X10_TEMP40 , X10_TEMP41 , X10_TEMP44 , X10_TEMP45 ) ; 
const int32_t X10_TEMP49 = 0 ; 
const int32_t X10_TEMP50 = 0 ; 
const int32_t X10_TEMP53 = 0 ; 
const int32_t X10_TEMP54 = X10_TEMP0 ->lda ; 
/*UpdatableVariableDeclaration*/
 struct Region2 slimRegion = createNewRegion2RR ( X10_TEMP49 , X10_TEMP50 , X10_TEMP53 , X10_TEMP54 ) ; 
const place_t X10_TEMP56 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist2 slimRegionDist = getPlaceDist2 ( slimRegion , X10_TEMP56 ) ; 
const int32_t X10_TEMP59 = X10_TEMP0 ->lda ; 
const int32_t X10_TEMP60 = 1 ; 
const int32_t X10_TEMP62 = X10_TEMP59 + X10_TEMP60 ; 
struct Dist2 X10_TEMP63 = getBlockCyclicDist2 ( rectangularRegion , X10_TEMP62 ) ; 
/*UpdatableVariableDeclaration*/
 struct Dist2 rectangular_distribution = X10_TEMP63 ; 
struct Region2 RX10_TEMP33 = rectangular_distribution .dReg ; 
const int32_t RX10_TEMP34 = 0 ; 
const int32_t RX10_TEMP35 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP36 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP35 ; const int32_t RX10_TEMP37 = RX10_TEMP36 + 1; 
const int32_t RX10_TEMP38 = /*SimpleDistributionExpression*/ RX10_TEMP36 +1; 
void * TEMPCALLOCPOINTER3;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP39 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER3 = malloc(sizeof(int32_t)+(RX10_TEMP38*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP38*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER3)[0] = RX10_TEMP38, TEMPCALLOCPOINTER3 = ((int32_t * )TEMPCALLOCPOINTER3)+1, memset(TEMPCALLOCPOINTER3,0,RX10_TEMP38*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP40= 0; RX10_TEMP40<  RX10_TEMP37; RX10_TEMP40++ )
 
{ 
const place_t RX10_TEMP41 = /* here  */ _here(); 
const int32_t RX10_TEMP42 = /*PointAccess*/RX10_TEMP40 ; 
const place_t RX10_TEMP43 = /* place.places ( RX10_TEMP42 )  */ _toplace(RX10_TEMP42 ); 
const int32_t RX10_TEMP44 = getDistLocalCount2 ( rectangular_distribution , RX10_TEMP42 ) ; 
const int32_t RX10_TEMP45 = RX10_TEMP44 - RX10_TEMP35 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP45 , RX10_TEMP41 , RX10_TEMP40 , RX10_TEMP39 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, RX10_TEMP43 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER4;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP49 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER4 = malloc(sizeof(int32_t)+(RX10_TEMP37*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP37*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER4)[0] = RX10_TEMP37, TEMPCALLOCPOINTER4 = ((int32_t * )TEMPCALLOCPOINTER4)+1, memset(TEMPCALLOCPOINTER4,0,RX10_TEMP37*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP51 = 0;RX10_TEMP51 < RX10_TEMP37; RX10_TEMP51++) 

{ 
struct doubleStub RX10_TEMP50 = RX10_TEMP39 [ RX10_TEMP51 ] 
; 
RX10_TEMP49[RX10_TEMP51] = RX10_TEMP50 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP52  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP52/*OBJECT INIT IN ASSIGNMENT*/, rectangular_distribution , RX10_TEMP49 ) ; 
struct doubleRefArray2 X10_TEMP66 = RX10_TEMP52 ; 
struct doubleRefArray2 X10_TEMP67 = X10_TEMP66 ; 
X10_TEMP0 ->a = ( X10_TEMP67 ) ; 
struct Region2 RX10_TEMP53 = slimRegionDist .dReg ; 
const int32_t RX10_TEMP54 = 0 ; 
const int32_t RX10_TEMP55 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP56 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP55 ; const int32_t RX10_TEMP57 = RX10_TEMP56 + 1; 
const int32_t RX10_TEMP58 = /*SimpleDistributionExpression*/ RX10_TEMP56 +1; 
void * TEMPCALLOCPOINTER5;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER5 = malloc(sizeof(int32_t)+(RX10_TEMP58*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP58*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER5)[0] = RX10_TEMP58, TEMPCALLOCPOINTER5 = ((int32_t * )TEMPCALLOCPOINTER5)+1, memset(TEMPCALLOCPOINTER5,0,RX10_TEMP58*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP60= 0; RX10_TEMP60<  RX10_TEMP57; RX10_TEMP60++ )
 
{ 
const place_t RX10_TEMP61 = /* here  */ _here(); 
const int32_t RX10_TEMP62 = /*PointAccess*/RX10_TEMP60 ; 
const place_t RX10_TEMP63 = /* place.places ( RX10_TEMP62 )  */ _toplace(RX10_TEMP62 ); 
const int32_t RX10_TEMP64 = getDistLocalCount2 ( slimRegionDist , RX10_TEMP62 ) ; 
const int32_t RX10_TEMP65 = RX10_TEMP64 - RX10_TEMP55 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP65 , RX10_TEMP61 , RX10_TEMP60 , RX10_TEMP59 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, RX10_TEMP63 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER6;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP69 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(RX10_TEMP57*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP57*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER6)[0] = RX10_TEMP57, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,RX10_TEMP57*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP71 = 0;RX10_TEMP71 < RX10_TEMP57; RX10_TEMP71++) 

{ 
struct doubleStub RX10_TEMP70 = RX10_TEMP59 [ RX10_TEMP71 ] 
; 
RX10_TEMP69[RX10_TEMP71] = RX10_TEMP70 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP72  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP72/*OBJECT INIT IN ASSIGNMENT*/, slimRegionDist , RX10_TEMP69 ) ; 
struct doubleRefArray2 X10_TEMP69 = RX10_TEMP72 ; 
struct doubleRefArray2 X10_TEMP70 = X10_TEMP69 ; 
X10_TEMP0 ->b = ( X10_TEMP70 ) ; 
struct Region2 RX10_TEMP73 = slimRegionDist .dReg ; 
const int32_t RX10_TEMP74 = 0 ; 
const int32_t RX10_TEMP75 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP76 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP76 = RX10_TEMP76 - RX10_TEMP75 ; const int32_t RX10_TEMP77 = RX10_TEMP76 + 1; 
const int32_t RX10_TEMP78 = /*SimpleDistributionExpression*/ RX10_TEMP76 +1; 
void * TEMPCALLOCPOINTER7;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP79 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER7 = malloc(sizeof(int32_t)+(RX10_TEMP78*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP78*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER7)[0] = RX10_TEMP78, TEMPCALLOCPOINTER7 = ((int32_t * )TEMPCALLOCPOINTER7)+1, memset(TEMPCALLOCPOINTER7,0,RX10_TEMP78*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP80= 0; RX10_TEMP80<  RX10_TEMP77; RX10_TEMP80++ )
 
{ 
const place_t RX10_TEMP81 = /* here  */ _here(); 
const int32_t RX10_TEMP82 = /*PointAccess*/RX10_TEMP80 ; 
const place_t RX10_TEMP83 = /* place.places ( RX10_TEMP82 )  */ _toplace(RX10_TEMP82 ); 
const int32_t RX10_TEMP84 = getDistLocalCount2 ( slimRegionDist , RX10_TEMP82 ) ; 
const int32_t RX10_TEMP85 = RX10_TEMP84 - RX10_TEMP75 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP85 , RX10_TEMP81 , RX10_TEMP80 , RX10_TEMP79 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP83 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER8;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP89 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER8 = malloc(sizeof(int32_t)+(RX10_TEMP77*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP77*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER8)[0] = RX10_TEMP77, TEMPCALLOCPOINTER8 = ((int32_t * )TEMPCALLOCPOINTER8)+1, memset(TEMPCALLOCPOINTER8,0,RX10_TEMP77*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP91 = 0;RX10_TEMP91 < RX10_TEMP77; RX10_TEMP91++) 

{ 
struct doubleStub RX10_TEMP90 = RX10_TEMP79 [ RX10_TEMP91 ] 
; 
RX10_TEMP89[RX10_TEMP91] = RX10_TEMP90 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP92  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP92/*OBJECT INIT IN ASSIGNMENT*/, slimRegionDist , RX10_TEMP89 ) ; 
struct doubleRefArray2 X10_TEMP72 = RX10_TEMP92 ; 
struct doubleRefArray2 X10_TEMP73 = X10_TEMP72 ; 
X10_TEMP0 ->x = ( X10_TEMP73 ) ; 
struct Region1 RX10_TEMP93 = vectorRegionMinus1Dist .dReg ; 
const int32_t RX10_TEMP94 = 0 ; 
const int32_t RX10_TEMP95 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP96 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP96 = RX10_TEMP96 - RX10_TEMP95 ; const int32_t RX10_TEMP97 = RX10_TEMP96 + 1; 
const int32_t RX10_TEMP98 = /*SimpleDistributionExpression*/ RX10_TEMP96 +1; 
void * TEMPCALLOCPOINTER9;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP99 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER9 = malloc(sizeof(int32_t)+(RX10_TEMP98*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP98*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER9)[0] = RX10_TEMP98, TEMPCALLOCPOINTER9 = ((int32_t * )TEMPCALLOCPOINTER9)+1, memset(TEMPCALLOCPOINTER9,0,RX10_TEMP98*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP100= 0; RX10_TEMP100<  RX10_TEMP97; RX10_TEMP100++ )
 
{ 
const place_t RX10_TEMP101 = /* here  */ _here(); 
const int32_t RX10_TEMP102 = /*PointAccess*/RX10_TEMP100 ; 
const place_t RX10_TEMP103 = /* place.places ( RX10_TEMP102 )  */ _toplace(RX10_TEMP102 ); 
const int32_t RX10_TEMP104 = getDistLocalCount1 ( vectorRegionMinus1Dist , RX10_TEMP102 ) ; 
const int32_t RX10_TEMP105 = RX10_TEMP104 - RX10_TEMP95 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP105 , RX10_TEMP101 , RX10_TEMP100 , RX10_TEMP99 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP103 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER10;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP109 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER10 = malloc(sizeof(int32_t)+(RX10_TEMP97*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP97*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER10)[0] = RX10_TEMP97, TEMPCALLOCPOINTER10 = ((int32_t * )TEMPCALLOCPOINTER10)+1, memset(TEMPCALLOCPOINTER10,0,RX10_TEMP97*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP111 = 0;RX10_TEMP111 < RX10_TEMP97; RX10_TEMP111++) 

{ 
struct intStub RX10_TEMP110 = RX10_TEMP99 [ RX10_TEMP111 ] 
; 
RX10_TEMP109[RX10_TEMP111] = RX10_TEMP110 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP112  ; 
intRefArray1_intRefArray1( &RX10_TEMP112/*OBJECT INIT IN ASSIGNMENT*/, vectorRegionMinus1Dist , RX10_TEMP109 ) ; 
struct intRefArray1 X10_TEMP75 = RX10_TEMP112 ; 
struct intRefArray1 X10_TEMP76 = X10_TEMP75 ; 
X10_TEMP0 ->ipvt = ( X10_TEMP76 ) ; 
const int32_t X10_TEMP77 = X10_TEMP0 ->n ; 
/*UpdatableVariableDeclaration*/
int64_t nl = /*casting*/( int64_t ) X10_TEMP77 ; 
const double X10_TEMP82 = 2.0; 
const int64_t X10_TEMP79 = nl * nl ; 
const int64_t X10_TEMP81 = X10_TEMP79 * nl ; 
const double X10_TEMP84 = X10_TEMP82 * X10_TEMP81 ; 
const double X10_TEMP85 = 3.0; 
const double X10_TEMP89 = X10_TEMP84 / X10_TEMP85 ; 
const double X10_TEMP88 = 2.0; 
const int64_t X10_TEMP87 = nl * nl ; 
const double X10_TEMP90 = X10_TEMP88 * X10_TEMP87 ; 
const double X10_TEMP92 = X10_TEMP89 + X10_TEMP90 ; 
const double X10_TEMP93 = X10_TEMP92 ; 
X10_TEMP0 ->ops = ( X10_TEMP93 ) ; 
struct doubleRefArray2 X10_TEMP98 = X10_TEMP0 ->a ; 
const int32_t X10_TEMP99 = X10_TEMP0 ->lda ; 
const int32_t X10_TEMP100 = X10_TEMP0 ->n ; 
struct doubleRefArray2 X10_TEMP101 = X10_TEMP0 ->b ; 
const double X10_TEMP103 = Linpack_matgen ( X10_TEMP0 , X10_TEMP98 , X10_TEMP99 , X10_TEMP100 , X10_TEMP101 ) ; 
const double X10_TEMP104 = X10_TEMP103 ; 
X10_TEMP0 ->norma = ( X10_TEMP104 ) ; 
} 

void /*static*/Linpack_JGFkernel (  struct Linpack  * const X10_TEMP0 ) 
{ 
struct doubleRefArray2 X10_TEMP5 = X10_TEMP0 ->a ; 
const int32_t X10_TEMP6 = X10_TEMP0 ->lda ; 
const int32_t X10_TEMP7 = X10_TEMP0 ->n ; 
struct intRefArray1 X10_TEMP8 = X10_TEMP0 ->ipvt ; 
const int32_t X10_TEMP10 = Linpack_dgefa ( X10_TEMP0 , X10_TEMP5 , X10_TEMP6 , X10_TEMP7 , X10_TEMP8 ) ; 
const int32_t X10_TEMP11 = X10_TEMP10 ; 
X10_TEMP0 ->info = ( X10_TEMP11 ) ; 
struct doubleRefArray2 X10_TEMP18 = X10_TEMP0 ->a ; 
const int32_t X10_TEMP19 = X10_TEMP0 ->lda ; 
const int32_t X10_TEMP20 = X10_TEMP0 ->n ; 
struct intRefArray1 X10_TEMP21 = X10_TEMP0 ->ipvt ; 
struct doubleRefArray2 X10_TEMP22 = X10_TEMP0 ->b ; 
const int32_t X10_TEMP23 = 0 ; 
Linpack_dgesl ( X10_TEMP0 , X10_TEMP18 , X10_TEMP19 , X10_TEMP20 , X10_TEMP21 , X10_TEMP22 , X10_TEMP23 ) ; 
} 

void /*static*/Linpack_JGFvalidate (  struct Linpack  * const X10_TEMP0 ,  struct Dist1 const vd ) 
{ 
/*UpdatableVariableDeclaration*/
double eps = 0.0; 
/*UpdatableVariableDeclaration*/
double residn = 0.0; 
struct Region1 RX10_TEMP0 = vd .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER11;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER11 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER11)[0] = RX10_TEMP5, TEMPCALLOCPOINTER11 = ((int32_t * )TEMPCALLOCPOINTER11)+1, memset(TEMPCALLOCPOINTER11,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( vd , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC5) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER12;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER12 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER12)[0] = RX10_TEMP4, TEMPCALLOCPOINTER12 = ((int32_t * )TEMPCALLOCPOINTER12)+1, memset(TEMPCALLOCPOINTER12,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, vd , RX10_TEMP17 ) ; 
struct doubleRefArray1 ref = RX10_TEMP20 ; 
const int32_t X10_TEMP7 = 0 ; 
const double X10_TEMP9 = 6.0; 
const double X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP21  ; 
Point1_Point1( &RX10_TEMP21/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP22 = ref .distValue ; 
struct Region1 RX10_TEMP23 = RX10_TEMP22 .dReg ; 
const int32_t RX10_TEMP24 = searchPointInRegion1 ( RX10_TEMP23 , RX10_TEMP21 ) ; 
const int32_t RX10_TEMP25 = 0 ; 
const uint32_t RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; 
if ( RX10_TEMP26 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP27 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP28 = getPlaceFromDist1 ( RX10_TEMP22 , RX10_TEMP24 ) ; 
const place_t RX10_TEMP30 = /* here  */ _here(); 
const uint32_t RX10_TEMP31 = RX10_TEMP28 != RX10_TEMP30 ; 
if ( RX10_TEMP31 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP29 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( ref , RX10_TEMP24 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 1 ; 
const double X10_TEMP14 = 12.0; 
const double X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP32  ; 
Point1_Point1( &RX10_TEMP32/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP33 = ref .distValue ; 
struct Region1 RX10_TEMP34 = RX10_TEMP33 .dReg ; 
const int32_t RX10_TEMP35 = searchPointInRegion1 ( RX10_TEMP34 , RX10_TEMP32 ) ; 
const int32_t RX10_TEMP36 = 0 ; 
const uint32_t RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; 
if ( RX10_TEMP37 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP39 = getPlaceFromDist1 ( RX10_TEMP33 , RX10_TEMP35 ) ; 
const place_t RX10_TEMP41 = /* here  */ _here(); 
const uint32_t RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP40 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( ref , RX10_TEMP35 , X10_TEMP15 ) ; 
const int32_t X10_TEMP17 = 2 ; 
const double X10_TEMP19 = 20.0; 
const double X10_TEMP20 = X10_TEMP19 ; 
struct Point1 RX10_TEMP43  ; 
Point1_Point1( &RX10_TEMP43/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP17 ) ; 
struct Dist1 RX10_TEMP44 = ref .distValue ; 
struct Region1 RX10_TEMP45 = RX10_TEMP44 .dReg ; 
const int32_t RX10_TEMP46 = searchPointInRegion1 ( RX10_TEMP45 , RX10_TEMP43 ) ; 
const int32_t RX10_TEMP47 = 0 ; 
const uint32_t RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47 ; 
if ( RX10_TEMP48 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP49 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP49 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP50 = getPlaceFromDist1 ( RX10_TEMP44 , RX10_TEMP46 ) ; 
const place_t RX10_TEMP52 = /* here  */ _here(); 
const uint32_t RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52 ; 
if ( RX10_TEMP53 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP51 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( ref , RX10_TEMP46 , X10_TEMP20 ) ; 
const int32_t X10_TEMP23 = 0 ; 
const int32_t X10_TEMP24 = 0 ; 
const int32_t X10_TEMP27 = 0 ; 
const int32_t X10_TEMP28 = X10_TEMP0 ->n ; 
struct Region2 tempR = createNewRegion2RR ( X10_TEMP23 , X10_TEMP24 , X10_TEMP27 , X10_TEMP28 ) ; 
const place_t X10_TEMP30 = /* here  */ _here(); 
struct Dist2 tempdist = getPlaceDist2 ( tempR , X10_TEMP30 ) ; 
struct Region2 RX10_TEMP55 = tempdist .dReg ; 
const int32_t RX10_TEMP58 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP56 = RX10_TEMP55 .regSize ; 
RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58 ; const int32_t RX10_TEMP57 = RX10_TEMP56 + 1; 
for ( int32_t RX10_TEMP54= 0; RX10_TEMP54<  RX10_TEMP57; RX10_TEMP54++ )
 
{ 
const int32_t RX10_TEMP59 = /*PointAccess*/RX10_TEMP54 ; 
struct Point2 pt = regionOrdinalPoint2 ( RX10_TEMP55 , RX10_TEMP59 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP35 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP36 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP60 = pt .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP61 = pt .f1 ; 
RX10_TEMP60 = RX10_TEMP60 * X10_TEMP35 ; RX10_TEMP61 = RX10_TEMP61 * X10_TEMP36 ; struct Point2 pt0  ; 
Point2_Point2( &pt0/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP60 , RX10_TEMP61 ) ; 
struct doubleRefArray2 X10_TEMP38 = X10_TEMP0 ->x ; 
struct doubleRefArray2 X10_TEMP40 = X10_TEMP0 ->b ; 
struct Dist2 RX10_TEMP62 = X10_TEMP40 .distValue ; 
struct Region2 RX10_TEMP63 = RX10_TEMP62 .dReg ; 
const int32_t RX10_TEMP64 = searchPointInRegion2 ( RX10_TEMP63 , pt0 ) ; 
const int32_t RX10_TEMP65 = 0 ; 
const uint32_t RX10_TEMP66 = RX10_TEMP64 < RX10_TEMP65 ; 
if ( RX10_TEMP66 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP67 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP67 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP68 = getPlaceFromDist2 ( RX10_TEMP62 , RX10_TEMP64 ) ; 
const place_t RX10_TEMP70 = /* here  */ _here(); 
const uint32_t RX10_TEMP71 = RX10_TEMP68 != RX10_TEMP70 ; 
if ( RX10_TEMP71 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP69 = "Bad place access for array X10_TEMP40" ; 
fprintf(stderr, "%s",RX10_TEMP69 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP72 = getRefArrayValue2double ( X10_TEMP40 , RX10_TEMP64 ) ; 
const double X10_TEMP43 = RX10_TEMP72 ; 
const double X10_TEMP44 = X10_TEMP43 ; 
struct Dist2 RX10_TEMP73 = X10_TEMP38 .distValue ; 
struct Region2 RX10_TEMP74 = RX10_TEMP73 .dReg ; 
const int32_t RX10_TEMP75 = searchPointInRegion2 ( RX10_TEMP74 , pt0 ) ; 
const int32_t RX10_TEMP76 = 0 ; 
const uint32_t RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; 
if ( RX10_TEMP77 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP78 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP79 = getPlaceFromDist2 ( RX10_TEMP73 , RX10_TEMP75 ) ; 
const place_t RX10_TEMP81 = /* here  */ _here(); 
const uint32_t RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; 
if ( RX10_TEMP82 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP80 = "Bad place access for array X10_TEMP38" ; 
fprintf(stderr, "%s",RX10_TEMP80 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( X10_TEMP38 , RX10_TEMP75 , X10_TEMP44 ) ; 
} 

struct doubleRefArray2 X10_TEMP49 = X10_TEMP0 ->a ; 
const int32_t X10_TEMP50 = X10_TEMP0 ->lda ; 
const int32_t X10_TEMP51 = X10_TEMP0 ->n ; 
struct doubleRefArray2 X10_TEMP52 = X10_TEMP0 ->b ; 
const double X10_TEMP54 = Linpack_matgen ( X10_TEMP0 , X10_TEMP49 , X10_TEMP50 , X10_TEMP51 , X10_TEMP52 ) ; 
const double X10_TEMP55 = X10_TEMP54 ; 
X10_TEMP0 ->norma = ( X10_TEMP55 ) ; 
struct Region2 RX10_TEMP84 = tempdist .dReg ; 
const int32_t RX10_TEMP87 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP85 = RX10_TEMP84 .regSize ; 
RX10_TEMP85 = RX10_TEMP85 - RX10_TEMP87 ; const int32_t RX10_TEMP86 = RX10_TEMP85 + 1; 
for ( int32_t RX10_TEMP83= 0; RX10_TEMP83<  RX10_TEMP86; RX10_TEMP83++ )
 
{ 
const int32_t RX10_TEMP88 = /*PointAccess*/RX10_TEMP83 ; 
struct Point2 pt = regionOrdinalPoint2 ( RX10_TEMP84 , RX10_TEMP88 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP59 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP60 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP89 = pt .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP90 = pt .f1 ; 
RX10_TEMP89 = RX10_TEMP89 * X10_TEMP59 ; RX10_TEMP90 = RX10_TEMP90 * X10_TEMP60 ; struct Point2 pt0  ; 
Point2_Point2( &pt0/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP89 , RX10_TEMP90 ) ; 
struct doubleRefArray2 X10_TEMP62 = X10_TEMP0 ->b ; 
struct doubleRefArray2 X10_TEMP64 = X10_TEMP0 ->b ; 
struct Dist2 RX10_TEMP91 = X10_TEMP64 .distValue ; 
struct Region2 RX10_TEMP92 = RX10_TEMP91 .dReg ; 
const int32_t RX10_TEMP93 = searchPointInRegion2 ( RX10_TEMP92 , pt0 ) ; 
const int32_t RX10_TEMP94 = 0 ; 
const uint32_t RX10_TEMP95 = RX10_TEMP93 < RX10_TEMP94 ; 
if ( RX10_TEMP95 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP96 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP96 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP97 = getPlaceFromDist2 ( RX10_TEMP91 , RX10_TEMP93 ) ; 
const place_t RX10_TEMP99 = /* here  */ _here(); 
const uint32_t RX10_TEMP100 = RX10_TEMP97 != RX10_TEMP99 ; 
if ( RX10_TEMP100 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP98 = "Bad place access for array X10_TEMP64" ; 
fprintf(stderr, "%s",RX10_TEMP98 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP101 = getRefArrayValue2double ( X10_TEMP64 , RX10_TEMP93 ) ; 
const double X10_TEMP66 = RX10_TEMP101 ; 
const int32_t X10_TEMP67 = 0 ; 
const double X10_TEMP69 = X10_TEMP67 - X10_TEMP66 ; 
const double X10_TEMP70 = X10_TEMP69 ; 
struct Dist2 RX10_TEMP102 = X10_TEMP62 .distValue ; 
struct Region2 RX10_TEMP103 = RX10_TEMP102 .dReg ; 
const int32_t RX10_TEMP104 = searchPointInRegion2 ( RX10_TEMP103 , pt0 ) ; 
const int32_t RX10_TEMP105 = 0 ; 
const uint32_t RX10_TEMP106 = RX10_TEMP104 < RX10_TEMP105 ; 
if ( RX10_TEMP106 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP107 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP107 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP108 = getPlaceFromDist2 ( RX10_TEMP102 , RX10_TEMP104 ) ; 
const place_t RX10_TEMP110 = /* here  */ _here(); 
const uint32_t RX10_TEMP111 = RX10_TEMP108 != RX10_TEMP110 ; 
if ( RX10_TEMP111 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP109 = "Bad place access for array X10_TEMP62" ; 
fprintf(stderr, "%s",RX10_TEMP109 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( X10_TEMP62 , RX10_TEMP104 , X10_TEMP70 ) ; 
} 

const int32_t X10_TEMP77 = X10_TEMP0 ->n ; 
struct doubleRefArray2 X10_TEMP78 = X10_TEMP0 ->b ; 
const int32_t X10_TEMP79 = X10_TEMP0 ->n ; 
const int32_t X10_TEMP80 = X10_TEMP0 ->lda ; 
struct doubleRefArray2 X10_TEMP81 = X10_TEMP0 ->x ; 
struct doubleRefArray2 X10_TEMP82 = X10_TEMP0 ->a ; 
Linpack_dmxpy ( X10_TEMP0 , X10_TEMP77 , X10_TEMP78 , X10_TEMP79 , X10_TEMP80 , X10_TEMP81 , X10_TEMP82 ) ; 
const double X10_TEMP84 = 0.0; 
const double X10_TEMP85 = X10_TEMP84 ; 
X10_TEMP0 ->resid = ( X10_TEMP85 ) ; 
const double X10_TEMP87 = 0.0; 
const double X10_TEMP88 = X10_TEMP87 ; 
X10_TEMP0 ->normx = ( X10_TEMP88 ) ; 
struct Region2 RX10_TEMP113 = tempdist .dReg ; 
const int32_t RX10_TEMP116 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP114 = RX10_TEMP113 .regSize ; 
RX10_TEMP114 = RX10_TEMP114 - RX10_TEMP116 ; const int32_t RX10_TEMP115 = RX10_TEMP114 + 1; 
for ( int32_t RX10_TEMP112= 0; RX10_TEMP112<  RX10_TEMP115; RX10_TEMP112++ )
 
{ 
const int32_t RX10_TEMP117 = /*PointAccess*/RX10_TEMP112 ; 
struct Point2 pt = regionOrdinalPoint2 ( RX10_TEMP113 , RX10_TEMP117 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP92 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP93 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP118 = pt .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP119 = pt .f1 ; 
RX10_TEMP118 = RX10_TEMP118 * X10_TEMP92 ; RX10_TEMP119 = RX10_TEMP119 * X10_TEMP93 ; struct Point2 pt0  ; 
Point2_Point2( &pt0/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP118 , RX10_TEMP119 ) ; 
const double X10_TEMP99 = X10_TEMP0 ->resid ; 
struct doubleRefArray2 X10_TEMP95 = X10_TEMP0 ->b ; 
struct Dist2 RX10_TEMP120 = X10_TEMP95 .distValue ; 
struct Region2 RX10_TEMP121 = RX10_TEMP120 .dReg ; 
const int32_t RX10_TEMP122 = searchPointInRegion2 ( RX10_TEMP121 , pt0 ) ; 
const int32_t RX10_TEMP123 = 0 ; 
const uint32_t RX10_TEMP124 = RX10_TEMP122 < RX10_TEMP123 ; 
if ( RX10_TEMP124 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP125 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP125 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP126 = getPlaceFromDist2 ( RX10_TEMP120 , RX10_TEMP122 ) ; 
const place_t RX10_TEMP128 = /* here  */ _here(); 
const uint32_t RX10_TEMP129 = RX10_TEMP126 != RX10_TEMP128 ; 
if ( RX10_TEMP129 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP127 = "Bad place access for array X10_TEMP95" ; 
fprintf(stderr, "%s",RX10_TEMP127 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP130 = getRefArrayValue2double ( X10_TEMP95 , RX10_TEMP122 ) ; 
const double X10_TEMP98 = RX10_TEMP130 ; 
const double X10_TEMP100 = Linpack_myabs ( X10_TEMP0 , X10_TEMP98 ) ; 
const uint32_t X10_TEMP102 = X10_TEMP99 > X10_TEMP100 ; 
const uint32_t X10_TEMP103 = X10_TEMP102 ; 
struct doubleRefArray2 X10_TEMP105 = X10_TEMP0 ->b ; 
struct Dist2 RX10_TEMP131 = X10_TEMP105 .distValue ; 
struct Region2 RX10_TEMP132 = RX10_TEMP131 .dReg ; 
const int32_t RX10_TEMP133 = searchPointInRegion2 ( RX10_TEMP132 , pt0 ) ; 
const int32_t RX10_TEMP134 = 0 ; 
const uint32_t RX10_TEMP135 = RX10_TEMP133 < RX10_TEMP134 ; 
if ( RX10_TEMP135 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP136 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP136 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP137 = getPlaceFromDist2 ( RX10_TEMP131 , RX10_TEMP133 ) ; 
const place_t RX10_TEMP139 = /* here  */ _here(); 
const uint32_t RX10_TEMP140 = RX10_TEMP137 != RX10_TEMP139 ; 
if ( RX10_TEMP140 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP138 = "Bad place access for array X10_TEMP105" ; 
fprintf(stderr, "%s",RX10_TEMP138 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP141 = getRefArrayValue2double ( X10_TEMP105 , RX10_TEMP133 ) ; 
const double X10_TEMP108 = RX10_TEMP141 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP110 = Linpack_myabs ( X10_TEMP0 , X10_TEMP108 ) ; 
if ( X10_TEMP103 ) 
{ 
X10_TEMP110 = X10_TEMP0 ->resid ; } 

const double X10_TEMP111 = X10_TEMP110 ; 
const double X10_TEMP112 = X10_TEMP111 ; 
X10_TEMP0 ->resid = ( X10_TEMP112 ) ; 
const double X10_TEMP117 = X10_TEMP0 ->normx ; 
struct doubleRefArray2 X10_TEMP113 = X10_TEMP0 ->x ; 
struct Dist2 RX10_TEMP142 = X10_TEMP113 .distValue ; 
struct Region2 RX10_TEMP143 = RX10_TEMP142 .dReg ; 
const int32_t RX10_TEMP144 = searchPointInRegion2 ( RX10_TEMP143 , pt0 ) ; 
const int32_t RX10_TEMP145 = 0 ; 
const uint32_t RX10_TEMP146 = RX10_TEMP144 < RX10_TEMP145 ; 
if ( RX10_TEMP146 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP147 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP147 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP148 = getPlaceFromDist2 ( RX10_TEMP142 , RX10_TEMP144 ) ; 
const place_t RX10_TEMP150 = /* here  */ _here(); 
const uint32_t RX10_TEMP151 = RX10_TEMP148 != RX10_TEMP150 ; 
if ( RX10_TEMP151 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP149 = "Bad place access for array X10_TEMP113" ; 
fprintf(stderr, "%s",RX10_TEMP149 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP152 = getRefArrayValue2double ( X10_TEMP113 , RX10_TEMP144 ) ; 
const double X10_TEMP116 = RX10_TEMP152 ; 
const double X10_TEMP118 = Linpack_myabs ( X10_TEMP0 , X10_TEMP116 ) ; 
const uint32_t X10_TEMP120 = X10_TEMP117 > X10_TEMP118 ; 
const uint32_t X10_TEMP121 = X10_TEMP120 ; 
struct doubleRefArray2 X10_TEMP123 = X10_TEMP0 ->x ; 
struct Dist2 RX10_TEMP153 = X10_TEMP123 .distValue ; 
struct Region2 RX10_TEMP154 = RX10_TEMP153 .dReg ; 
const int32_t RX10_TEMP155 = searchPointInRegion2 ( RX10_TEMP154 , pt0 ) ; 
const int32_t RX10_TEMP156 = 0 ; 
const uint32_t RX10_TEMP157 = RX10_TEMP155 < RX10_TEMP156 ; 
if ( RX10_TEMP157 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP158 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP158 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP159 = getPlaceFromDist2 ( RX10_TEMP153 , RX10_TEMP155 ) ; 
const place_t RX10_TEMP161 = /* here  */ _here(); 
const uint32_t RX10_TEMP162 = RX10_TEMP159 != RX10_TEMP161 ; 
if ( RX10_TEMP162 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP160 = "Bad place access for array X10_TEMP123" ; 
fprintf(stderr, "%s",RX10_TEMP160 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP163 = getRefArrayValue2double ( X10_TEMP123 , RX10_TEMP155 ) ; 
const double X10_TEMP126 = RX10_TEMP163 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP128 = Linpack_myabs ( X10_TEMP0 , X10_TEMP126 ) ; 
if ( X10_TEMP121 ) 
{ 
X10_TEMP128 = X10_TEMP0 ->normx ; } 

const double X10_TEMP129 = X10_TEMP128 ; 
const double X10_TEMP130 = X10_TEMP129 ; 
X10_TEMP0 ->normx = ( X10_TEMP130 ) ; 
} 

const double X10_TEMP131 = 1.0; 
const double X10_TEMP133 = /*casting*/( double ) X10_TEMP131 ; 
const double X10_TEMP135 = Linpack_epslon ( X10_TEMP0 , X10_TEMP133 ) ; 
eps = X10_TEMP135 ; const double X10_TEMP143 = X10_TEMP0 ->resid ; 
const double X10_TEMP136 = X10_TEMP0 ->n ; 
const double X10_TEMP137 = X10_TEMP0 ->norma ; 
const double X10_TEMP138 = X10_TEMP136 * X10_TEMP137 ; 
const double X10_TEMP139 = X10_TEMP0 ->normx ; 
const double X10_TEMP140 = X10_TEMP138 * X10_TEMP139 ; 
const double X10_TEMP142 = X10_TEMP140 * eps ; 
const double X10_TEMP145 = X10_TEMP143 / X10_TEMP142 ; 
residn = X10_TEMP145 ; const int32_t X10_TEMP147 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP164  ; 
Point1_Point1( &RX10_TEMP164/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP147 ) ; 
struct Dist1 RX10_TEMP165 = ref .distValue ; 
struct Region1 RX10_TEMP166 = RX10_TEMP165 .dReg ; 
const int32_t RX10_TEMP167 = searchPointInRegion1 ( RX10_TEMP166 , RX10_TEMP164 ) ; 
const int32_t RX10_TEMP168 = 0 ; 
const uint32_t RX10_TEMP169 = RX10_TEMP167 < RX10_TEMP168 ; 
if ( RX10_TEMP169 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP170 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP170 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP171 = getPlaceFromDist1 ( RX10_TEMP165 , RX10_TEMP167 ) ; 
const place_t RX10_TEMP173 = /* here  */ _here(); 
const uint32_t RX10_TEMP174 = RX10_TEMP171 != RX10_TEMP173 ; 
if ( RX10_TEMP174 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP172 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP172 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP175 = getRefArrayValue1double ( ref , RX10_TEMP167 ) ; 
const double X10_TEMP148 = RX10_TEMP175 ; 
const uint32_t X10_TEMP150 = residn > X10_TEMP148 ; 
if ( X10_TEMP150 ) 
{ 
const char * X10_TEMP152 = "Validation failed" ; 
fprintf(  stdout, "%s\n",X10_TEMP152 ) ; 
const char * X10_TEMP153 = "Computed Norm Res = " ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC3, "%s%f",X10_TEMP153,residn);
const char * X10_TEMP155 = tempC3;; 
fprintf(  stdout, "%s\n",X10_TEMP155 ) ; 
const char * X10_TEMP158 = "Reference Norm Res = " ; 
const int32_t X10_TEMP157 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP176  ; 
Point1_Point1( &RX10_TEMP176/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP157 ) ; 
struct Dist1 RX10_TEMP177 = ref .distValue ; 
struct Region1 RX10_TEMP178 = RX10_TEMP177 .dReg ; 
const int32_t RX10_TEMP179 = searchPointInRegion1 ( RX10_TEMP178 , RX10_TEMP176 ) ; 
const int32_t RX10_TEMP180 = 0 ; 
const uint32_t RX10_TEMP181 = RX10_TEMP179 < RX10_TEMP180 ; 
if ( RX10_TEMP181 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP182 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP182 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP183 = getPlaceFromDist1 ( RX10_TEMP177 , RX10_TEMP179 ) ; 
const place_t RX10_TEMP185 = /* here  */ _here(); 
const uint32_t RX10_TEMP186 = RX10_TEMP183 != RX10_TEMP185 ; 
if ( RX10_TEMP186 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP184 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP184 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP187 = getRefArrayValue1double ( ref , RX10_TEMP179 ) ; 
const double X10_TEMP159 = RX10_TEMP187 ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC4, "%s%f",X10_TEMP158,X10_TEMP159);
const char * X10_TEMP161 = tempC4;; 
fprintf(  stdout, "%s\n",X10_TEMP161 ) ; 
const char * X10_TEMP163 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP163 ) ; 
exit(EXIT_FAILURE);
} 

} 

void /*static*/Linpack_JGFtidyup (  struct Linpack  * const X10_TEMP0 ) 
{ 
} 

void /*static*/Linpack_run (  struct Linpack  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
Linpack_JGFsetsize ( X10_TEMP0 , X10_TEMP2 ) ; 
const place_t X10_TEMP3 = /* here  */ _here(); 
struct Dist1 vd = getPlaceDist1 ( _Linpack_r , X10_TEMP3 ) ; 
Linpack_JGFinitialise ( X10_TEMP0 , vd ) ; 
Linpack_JGFkernel ( X10_TEMP0 ) ; 
Linpack_JGFvalidate ( X10_TEMP0 , vd ) ; 
Linpack_JGFtidyup ( X10_TEMP0 ) ; 
} 

double /*static*/Linpack_read (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t i , const int32_t j ) 
{ 
const place_t curr_place = /* here  */ _here(); 
const int32_t X10_TEMP4 = 0 ; 
const int32_t X10_TEMP5 = 0 ; 
struct Region1 tempr = createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; 
const place_t X10_TEMP7 = /* here  */ _here(); 
struct Dist1 tempvd = getPlaceDist1 ( tempr , X10_TEMP7 ) ; 
struct Region1 RX10_TEMP0 = tempvd .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER13;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER13 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER13)[0] = RX10_TEMP5, TEMPCALLOCPOINTER13 = ((int32_t * )TEMPCALLOCPOINTER13)+1, memset(TEMPCALLOCPOINTER13,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( tempvd , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC6) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER14;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER14 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER14)[0] = RX10_TEMP4, TEMPCALLOCPOINTER14 = ((int32_t * )TEMPCALLOCPOINTER14)+1, memset(TEMPCALLOCPOINTER14,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, tempvd , RX10_TEMP17 ) ; 
struct doubleRefArray1 tempref = RX10_TEMP20 ; 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP21 = a .distValue ; 
struct Dist2 X10_TEMP12 = RX10_TEMP21 ; 
struct Point2 RX10_TEMP22  ; 
Point2_Point2( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Region2 RX10_TEMP23 = X10_TEMP12 .dReg ; 
const int32_t RX10_TEMP24 = searchPointInRegion2 ( RX10_TEMP23 , RX10_TEMP22 ) ; 
const int32_t RX10_TEMP25 = 0 ; 
const uint32_t RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; 
if ( RX10_TEMP26 ) 
{ 
const char * RX10_TEMP27 = "Point RX10_TEMP22 not found in the distribution X10_TEMP12." ; 
fprintf(stderr, "%s",RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP28 = getPlaceFromDist2 ( X10_TEMP12 , RX10_TEMP24 ) ; 
const place_t X10_TEMP16 = RX10_TEMP28 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, tempref , curr_place , j , i , a ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC7) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, X10_TEMP16 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP26 = 0 ; 
struct Point1 RX10_TEMP52  ; 
Point1_Point1( &RX10_TEMP52/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP26 ) ; 
struct Dist1 RX10_TEMP53 = tempref .distValue ; 
struct Region1 RX10_TEMP54 = RX10_TEMP53 .dReg ; 
const int32_t RX10_TEMP55 = searchPointInRegion1 ( RX10_TEMP54 , RX10_TEMP52 ) ; 
const int32_t RX10_TEMP56 = 0 ; 
const uint32_t RX10_TEMP57 = RX10_TEMP55 < RX10_TEMP56 ; 
if ( RX10_TEMP57 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP58 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP58 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP59 = getPlaceFromDist1 ( RX10_TEMP53 , RX10_TEMP55 ) ; 
const place_t RX10_TEMP61 = /* here  */ _here(); 
const uint32_t RX10_TEMP62 = RX10_TEMP59 != RX10_TEMP61 ; 
if ( RX10_TEMP62 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP60 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP60 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP63 = getRefArrayValue1double ( tempref , RX10_TEMP55 ) ; 
const double X10_TEMP28 = RX10_TEMP63 ; 
return X10_TEMP28 ; 
} 

void /*static*/Linpack_write (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a ,  struct Point2 const p , const double val ) 
{ 
struct Dist2 RX10_TEMP0 = a .distValue ; 
struct Dist2 X10_TEMP1 = RX10_TEMP0 ; 
struct Region2 RX10_TEMP1 = X10_TEMP1 .dReg ; 
const int32_t RX10_TEMP2 = searchPointInRegion2 ( RX10_TEMP1 , p ) ; 
const int32_t RX10_TEMP3 = 0 ; 
const uint32_t RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; 
if ( RX10_TEMP4 ) 
{ 
const char * RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1." ; 
fprintf(stderr, "%s",RX10_TEMP5 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP6 = getPlaceFromDist2 ( X10_TEMP1 , RX10_TEMP2 ) ; 
const place_t X10_TEMP4 = RX10_TEMP6 ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, val , p , a ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC8) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, X10_TEMP4 );


}/*END OF ASYNC*/
} 

void /*static*/Linpack_plusWrite (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t i , const int32_t j , const double val ) 
{ 
struct Dist2 RX10_TEMP0 = a .distValue ; 
struct Dist2 X10_TEMP1 = RX10_TEMP0 ; 
struct Point2 RX10_TEMP1  ; 
Point2_Point2( &RX10_TEMP1/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Region2 RX10_TEMP2 = X10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP1 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
const char * RX10_TEMP6 = "Point RX10_TEMP1 not found in the distribution X10_TEMP1." ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist2 ( X10_TEMP1 , RX10_TEMP3 ) ; 
const place_t X10_TEMP5 = RX10_TEMP7 ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, val , j , i , a ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC9) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, X10_TEMP5 );


}/*END OF ASYNC*/
} 

double /*static*/Linpack_myabs (  struct Linpack  * const X10_TEMP0 , const double d ) 
{ 
const int32_t X10_TEMP1 = 0 ; 
const uint32_t X10_TEMP3 = d >= X10_TEMP1 ; 
const uint32_t X10_TEMP4 = X10_TEMP3 ; 
const int32_t X10_TEMP6 = 0 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP8 = X10_TEMP6 - d ; 
if ( X10_TEMP4 ) 
{ 
X10_TEMP8 = d ; } 

const double X10_TEMP9 = X10_TEMP8 ; 
return X10_TEMP9 ; 
} 

double /*static*/Linpack_matgen (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct doubleRefArray2 const b ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t init = 1325 ; 
/*UpdatableVariableDeclaration*/
double norma = 0.0; 
struct Dist2 RX10_TEMP1 = a .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP4; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP0 ; 
struct Point2 p = regionOrdinalPoint2 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
const int32_t X10_TEMP4 = 3125 ; 
const int32_t X10_TEMP5 = X10_TEMP4 * init ; 
const int32_t X10_TEMP6 = 65536 ; 
const int32_t X10_TEMP8 = X10_TEMP5 % X10_TEMP6 ; 
init = X10_TEMP8 ; const double X10_TEMP9 = 32768.0; 
const double X10_TEMP11 = init - X10_TEMP9 ; 
const double X10_TEMP12 = 16384.0; 
/*UpdatableVariableDeclaration*/
double val = X10_TEMP11 / X10_TEMP12 ; 
/* finish  */ task_start_finish();

{ 
Linpack_write ( X10_TEMP0 , a , p , val ) ; 
} 
task_end_finish();
/*END OF FINISH*/
const uint32_t X10_TEMP17 = val > norma ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP20 = norma ; 
if ( X10_TEMP17 ) 
{ 
X10_TEMP20 = val ; } 

const double X10_TEMP21 = X10_TEMP20 ; 
norma = X10_TEMP21 ; } 

/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP8 = b .distValue ; 
struct Region2 RX10_TEMP9 = RX10_TEMP8 .dReg ; 
const int32_t RX10_TEMP12 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP10 = RX10_TEMP9 .regSize ; 
RX10_TEMP10 = RX10_TEMP10 - RX10_TEMP12 ; const int32_t RX10_TEMP11 = RX10_TEMP10 + 1; 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP11; RX10_TEMP7++ )
 
{ 
const int32_t RX10_TEMP13 = /*PointAccess*/RX10_TEMP7 ; 
struct Point2 p = regionOrdinalPoint2 ( RX10_TEMP9 , RX10_TEMP13 ) ; 
struct Dist2 RX10_TEMP14 = b .distValue ; 
struct Dist2 X10_TEMP23 = RX10_TEMP14 ; 
struct Region2 RX10_TEMP15 = X10_TEMP23 .dReg ; 
const int32_t RX10_TEMP16 = searchPointInRegion2 ( RX10_TEMP15 , p ) ; 
const int32_t RX10_TEMP17 = 0 ; 
const uint32_t RX10_TEMP18 = RX10_TEMP16 < RX10_TEMP17 ; 
if ( RX10_TEMP18 ) 
{ 
const char * RX10_TEMP19 = "Point p not found in the distribution X10_TEMP23." ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP20 = getPlaceFromDist2 ( X10_TEMP23 , RX10_TEMP16 ) ; 
const place_t X10_TEMP24 = RX10_TEMP20 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, p , b ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC10) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, X10_TEMP24 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/* finish  */ task_start_finish();

{ 
const int32_t X10_TEMP32 = 0 ; 
const int32_t X10_TEMP30 = 1 ; 
const int32_t X10_TEMP33 = n - X10_TEMP30 ; 
const int32_t X10_TEMP37 = 0 ; 
const int32_t X10_TEMP35 = 1 ; 
const int32_t X10_TEMP38 = n - X10_TEMP35 ; 
struct Region2 X10_TEMP40 = createNewRegion2RR ( X10_TEMP32 , X10_TEMP33 , X10_TEMP37 , X10_TEMP38 ) ; 
const int32_t RX10_TEMP35 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP33 = X10_TEMP40 .regSize ; 
RX10_TEMP33 = RX10_TEMP33 - RX10_TEMP35 ; const int32_t RX10_TEMP34 = RX10_TEMP33 + 1; 
for ( int32_t RX10_TEMP31= 0; RX10_TEMP31<  RX10_TEMP34; RX10_TEMP31++ )
 
{ 
const int32_t RX10_TEMP36 = /*PointAccess*/RX10_TEMP31 ; 
struct Point2 RX10_TEMP32 = regionOrdinalPoint2 ( X10_TEMP40 , RX10_TEMP36 ) ; 
const int32_t i = RX10_TEMP32 .f0 ; 
const int32_t j = RX10_TEMP32 .f1 ; 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP37 = a .distValue ; 
struct Dist2 X10_TEMP41 = RX10_TEMP37 ; 
struct Point2 RX10_TEMP38  ; 
Point2_Point2( &RX10_TEMP38/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Region2 RX10_TEMP39 = X10_TEMP41 .dReg ; 
const int32_t RX10_TEMP40 = searchPointInRegion2 ( RX10_TEMP39 , RX10_TEMP38 ) ; 
const int32_t RX10_TEMP41 = 0 ; 
const uint32_t RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
const char * RX10_TEMP43 = "Point RX10_TEMP38 not found in the distribution X10_TEMP41." ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP44 = getPlaceFromDist2 ( X10_TEMP41 , RX10_TEMP40 ) ; 
const place_t X10_TEMP45 = RX10_TEMP44 ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, j , i , b , a , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC11) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, X10_TEMP45 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 

} 
task_end_finish();
/*END OF FINISH*/
return norma ; 
} 

int32_t /*static*/Linpack_dgefa (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct intRefArray1 const ipvt ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const int32_t X10_TEMP3 = X10_TEMP2 ; 
X10_TEMP0 ->infodgefa = ( X10_TEMP3 ) ; 
const int32_t X10_TEMP4 = 1 ; 
const int32_t nm1 = n - X10_TEMP4 ; 
const int32_t X10_TEMP6 = 0 ; 
const uint32_t X10_TEMP8 = nm1 >= X10_TEMP6 ; 
if ( X10_TEMP8 ) 
{ 
const int32_t X10_TEMP12 = 0 ; 
const int32_t X10_TEMP10 = 1 ; 
const int32_t X10_TEMP13 = nm1 - X10_TEMP10 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP12 , X10_TEMP13 ) ; 
const place_t X10_TEMP15 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP15 ) ; 
struct Region1 RX10_TEMP2 = temprDist .dReg ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP4; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 RX10_TEMP1 = regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
const int32_t k = RX10_TEMP1 .f0 ; 
const int32_t X10_TEMP23 = n - k ; 
const int32_t X10_TEMP24 = 1 ; 
const int32_t X10_TEMP25 = Linpack_idamax ( X10_TEMP0 , X10_TEMP23 , a , k , k , X10_TEMP24 ) ; 
const int32_t l = X10_TEMP25 + k ; 
const int32_t X10_TEMP29 = l ; 
struct Point1 RX10_TEMP7  ; 
Point1_Point1( &RX10_TEMP7/*OBJECT INIT IN ASSIGNMENT*/, k ) ; 
struct Dist1 RX10_TEMP8 = ipvt .distValue ; 
struct Region1 RX10_TEMP9 = RX10_TEMP8 .dReg ; 
const int32_t RX10_TEMP10 = searchPointInRegion1 ( RX10_TEMP9 , RX10_TEMP7 ) ; 
const int32_t RX10_TEMP11 = 0 ; 
const uint32_t RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11 ; 
if ( RX10_TEMP12 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP13 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP13 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP14 = getPlaceFromDist1 ( RX10_TEMP8 , RX10_TEMP10 ) ; 
const place_t RX10_TEMP16 = /* here  */ _here(); 
const uint32_t RX10_TEMP17 = RX10_TEMP14 != RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP15 = "Bad place access for array ipvt" ; 
fprintf(stderr, "%s",RX10_TEMP15 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( ipvt , RX10_TEMP10 , X10_TEMP29 ) ; 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP18 = a .distValue ; 
struct Dist2 X10_TEMP30 = RX10_TEMP18 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP33 = 1 ; 
struct Point2 RX10_TEMP19  ; 
Point2_Point2( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, k , X10_TEMP33 ) ; 
struct Region2 RX10_TEMP20 = X10_TEMP30 .dReg ; 
const int32_t RX10_TEMP21 = searchPointInRegion2 ( RX10_TEMP20 , RX10_TEMP19 ) ; 
const int32_t RX10_TEMP22 = 0 ; 
const uint32_t RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22 ; 
if ( RX10_TEMP23 ) 
{ 
const char * RX10_TEMP24 = "Point RX10_TEMP19 not found in the distribution X10_TEMP30." ; 
fprintf(stderr, "%s",RX10_TEMP24 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP25 = getPlaceFromDist2 ( X10_TEMP30 , RX10_TEMP21 ) ; 
const place_t X10_TEMP35 = RX10_TEMP25 ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, l , k , n , a , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC12) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, X10_TEMP35 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 

} 

const int32_t X10_TEMP125 = 1 ; 
const int32_t X10_TEMP127 = n - X10_TEMP125 ; 
const int32_t X10_TEMP128 = 1 ; 
const int32_t X10_TEMP130 = n - X10_TEMP128 ; 
const int32_t X10_TEMP131 = X10_TEMP130 ; 
struct Point1 RX10_TEMP157  ; 
Point1_Point1( &RX10_TEMP157/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP127 ) ; 
struct Dist1 RX10_TEMP158 = ipvt .distValue ; 
struct Region1 RX10_TEMP159 = RX10_TEMP158 .dReg ; 
const int32_t RX10_TEMP160 = searchPointInRegion1 ( RX10_TEMP159 , RX10_TEMP157 ) ; 
const int32_t RX10_TEMP161 = 0 ; 
const uint32_t RX10_TEMP162 = RX10_TEMP160 < RX10_TEMP161 ; 
if ( RX10_TEMP162 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP163 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP163 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP164 = getPlaceFromDist1 ( RX10_TEMP158 , RX10_TEMP160 ) ; 
const place_t RX10_TEMP166 = /* here  */ _here(); 
const uint32_t RX10_TEMP167 = RX10_TEMP164 != RX10_TEMP166 ; 
if ( RX10_TEMP167 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP165 = "Bad place access for array ipvt" ; 
fprintf(stderr, "%s",RX10_TEMP165 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( ipvt , RX10_TEMP160 , X10_TEMP131 ) ; 
const int32_t X10_TEMP133 = 1 ; 
const int32_t X10_TEMP137 = n - X10_TEMP133 ; 
const int32_t X10_TEMP135 = 1 ; 
const int32_t X10_TEMP138 = n - X10_TEMP135 ; 
/*UpdatableVariableDeclaration*/
double val = Linpack_read ( X10_TEMP0 , a , X10_TEMP137 , X10_TEMP138 ) ; 
const int32_t X10_TEMP140 = 0 ; 
const uint32_t X10_TEMP142 = val == X10_TEMP140 ; 
if ( X10_TEMP142 ) 
{ 
const int32_t X10_TEMP143 = 1 ; 
const int32_t X10_TEMP145 = n - X10_TEMP143 ; 
const int32_t X10_TEMP146 = X10_TEMP145 ; 
X10_TEMP0 ->info = ( X10_TEMP146 ) ; 
} 

const int32_t X10_TEMP148 = X10_TEMP0 ->infodgefa ; 
return X10_TEMP148 ; 
} 

void /*static*/Linpack_dgesl (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct intRefArray1 const ipvt ,  struct doubleRefArray2 const b , const int32_t job ) 
{ 
const int32_t X10_TEMP1 = 1 ; 
const int32_t nm1 = n - X10_TEMP1 ; 
const int32_t X10_TEMP3 = 0 ; 
const uint32_t X10_TEMP5 = job == X10_TEMP3 ; 
if ( X10_TEMP5 ) 
{ 
const int32_t X10_TEMP6 = 1 ; 
const uint32_t X10_TEMP8 = nm1 >= X10_TEMP6 ; 
if ( X10_TEMP8 ) 
{ 
const int32_t X10_TEMP12 = 0 ; 
const int32_t X10_TEMP10 = 1 ; 
const int32_t X10_TEMP13 = nm1 - X10_TEMP10 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP12 , X10_TEMP13 ) ; 
const place_t X10_TEMP15 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP15 ) ; 
struct Region1 RX10_TEMP2 = temprDist .dReg ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP4; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 RX10_TEMP1 = regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
const int32_t k = RX10_TEMP1 .f0 ; 
struct Point1 RX10_TEMP7  ; 
Point1_Point1( &RX10_TEMP7/*OBJECT INIT IN ASSIGNMENT*/, k ) ; 
struct Dist1 RX10_TEMP8 = ipvt .distValue ; 
struct Region1 RX10_TEMP9 = RX10_TEMP8 .dReg ; 
const int32_t RX10_TEMP10 = searchPointInRegion1 ( RX10_TEMP9 , RX10_TEMP7 ) ; 
const int32_t RX10_TEMP11 = 0 ; 
const uint32_t RX10_TEMP12 = RX10_TEMP10 < RX10_TEMP11 ; 
if ( RX10_TEMP12 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP13 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP13 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP14 = getPlaceFromDist1 ( RX10_TEMP8 , RX10_TEMP10 ) ; 
const place_t RX10_TEMP16 = /* here  */ _here(); 
const uint32_t RX10_TEMP17 = RX10_TEMP14 != RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP15 = "Bad place access for array ipvt" ; 
fprintf(stderr, "%s",RX10_TEMP15 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP18 = getRefArrayValue1int ( ipvt , RX10_TEMP10 ) ; 
const int32_t l = RX10_TEMP18 ; 
const int32_t X10_TEMP22 = 0 ; 
struct Point2 RX10_TEMP19  ; 
Point2_Point2( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP22 , l ) ; 
struct Dist2 RX10_TEMP20 = b .distValue ; 
struct Region2 RX10_TEMP21 = RX10_TEMP20 .dReg ; 
const int32_t RX10_TEMP22 = searchPointInRegion2 ( RX10_TEMP21 , RX10_TEMP19 ) ; 
const int32_t RX10_TEMP23 = 0 ; 
const uint32_t RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP25 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP26 = getPlaceFromDist2 ( RX10_TEMP20 , RX10_TEMP22 ) ; 
const place_t RX10_TEMP28 = /* here  */ _here(); 
const uint32_t RX10_TEMP29 = RX10_TEMP26 != RX10_TEMP28 ; 
if ( RX10_TEMP29 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP27 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP30 = getRefArrayValue2double ( b , RX10_TEMP22 ) ; 
/*UpdatableVariableDeclaration*/
double t = RX10_TEMP30 ; 
const uint32_t X10_TEMP25 = l != k ; 
if ( X10_TEMP25 ) 
{ 
const int32_t X10_TEMP28 = 0 ; 
const int32_t X10_TEMP31 = 0 ; 
struct Point2 RX10_TEMP31  ; 
Point2_Point2( &RX10_TEMP31/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP31 , k ) ; 
struct Dist2 RX10_TEMP32 = b .distValue ; 
struct Region2 RX10_TEMP33 = RX10_TEMP32 .dReg ; 
const int32_t RX10_TEMP34 = searchPointInRegion2 ( RX10_TEMP33 , RX10_TEMP31 ) ; 
const int32_t RX10_TEMP35 = 0 ; 
const uint32_t RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP38 = getPlaceFromDist2 ( RX10_TEMP32 , RX10_TEMP34 ) ; 
const place_t RX10_TEMP40 = /* here  */ _here(); 
const uint32_t RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; 
if ( RX10_TEMP41 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP42 = getRefArrayValue2double ( b , RX10_TEMP34 ) ; 
const double X10_TEMP33 = RX10_TEMP42 ; 
const double X10_TEMP34 = X10_TEMP33 ; 
struct Point2 RX10_TEMP43  ; 
Point2_Point2( &RX10_TEMP43/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP28 , l ) ; 
struct Dist2 RX10_TEMP44 = b .distValue ; 
struct Region2 RX10_TEMP45 = RX10_TEMP44 .dReg ; 
const int32_t RX10_TEMP46 = searchPointInRegion2 ( RX10_TEMP45 , RX10_TEMP43 ) ; 
const int32_t RX10_TEMP47 = 0 ; 
const uint32_t RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47 ; 
if ( RX10_TEMP48 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP49 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP49 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP50 = getPlaceFromDist2 ( RX10_TEMP44 , RX10_TEMP46 ) ; 
const place_t RX10_TEMP52 = /* here  */ _here(); 
const uint32_t RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52 ; 
if ( RX10_TEMP53 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP51 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP46 , X10_TEMP34 ) ; 
const int32_t X10_TEMP37 = 0 ; 
const double X10_TEMP39 = t ; 
struct Point2 RX10_TEMP54  ; 
Point2_Point2( &RX10_TEMP54/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP37 , k ) ; 
struct Dist2 RX10_TEMP55 = b .distValue ; 
struct Region2 RX10_TEMP56 = RX10_TEMP55 .dReg ; 
const int32_t RX10_TEMP57 = searchPointInRegion2 ( RX10_TEMP56 , RX10_TEMP54 ) ; 
const int32_t RX10_TEMP58 = 0 ; 
const uint32_t RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58 ; 
if ( RX10_TEMP59 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP60 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP60 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP61 = getPlaceFromDist2 ( RX10_TEMP55 , RX10_TEMP57 ) ; 
const place_t RX10_TEMP63 = /* here  */ _here(); 
const uint32_t RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63 ; 
if ( RX10_TEMP64 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP62 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP62 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP57 , X10_TEMP39 ) ; 
} 

const int32_t X10_TEMP40 = 1 ; 
const int32_t kp1 = k + X10_TEMP40 ; 
const int32_t X10_TEMP43 = kp1 ; 
const int32_t X10_TEMP54 = n - X10_TEMP43 ; 
const int32_t X10_TEMP55 = 1 ; 
const int32_t X10_TEMP56 = 0 ; 
const int32_t X10_TEMP57 = 1 ; 
Linpack_daxpy ( X10_TEMP0 , X10_TEMP54 , t , a , k , kp1 , X10_TEMP55 , b , X10_TEMP56 , kp1 , X10_TEMP57 ) ; 
} 

} 

const int32_t X10_TEMP61 = 0 ; 
const int32_t X10_TEMP59 = 1 ; 
const int32_t X10_TEMP62 = n - X10_TEMP59 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP61 , X10_TEMP62 ) ; 
const place_t X10_TEMP64 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP64 ) ; 
struct Region1 RX10_TEMP67 = temprDist .dReg ; 
const int32_t RX10_TEMP70 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP68 = RX10_TEMP67 .regSize ; 
RX10_TEMP68 = RX10_TEMP68 - RX10_TEMP70 ; const int32_t RX10_TEMP69 = RX10_TEMP68 + 1; 
for ( int32_t RX10_TEMP65= 0; RX10_TEMP65<  RX10_TEMP69; RX10_TEMP65++ )
 
{ 
const int32_t RX10_TEMP71 = /*PointAccess*/RX10_TEMP65 ; 
struct Point1 RX10_TEMP66 = regionOrdinalPoint1 ( RX10_TEMP67 , RX10_TEMP71 ) ; 
const int32_t kb = RX10_TEMP66 .f0 ; 
const int32_t X10_TEMP67 = 1 ; 
const int32_t X10_TEMP69 = kb + X10_TEMP67 ; 
const int32_t k = n - X10_TEMP69 ; 
const int32_t X10_TEMP73 = 0 ; 
const int32_t X10_TEMP76 = 0 ; 
struct Point2 RX10_TEMP72  ; 
Point2_Point2( &RX10_TEMP72/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP76 , k ) ; 
struct Dist2 RX10_TEMP73 = b .distValue ; 
struct Region2 RX10_TEMP74 = RX10_TEMP73 .dReg ; 
const int32_t RX10_TEMP75 = searchPointInRegion2 ( RX10_TEMP74 , RX10_TEMP72 ) ; 
const int32_t RX10_TEMP76 = 0 ; 
const uint32_t RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; 
if ( RX10_TEMP77 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP78 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP79 = getPlaceFromDist2 ( RX10_TEMP73 , RX10_TEMP75 ) ; 
const place_t RX10_TEMP81 = /* here  */ _here(); 
const uint32_t RX10_TEMP82 = RX10_TEMP79 != RX10_TEMP81 ; 
if ( RX10_TEMP82 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP80 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP80 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP83 = getRefArrayValue2double ( b , RX10_TEMP75 ) ; 
const double X10_TEMP80 = RX10_TEMP83 ; 
const double X10_TEMP81 = Linpack_read ( X10_TEMP0 , a , k , k ) ; 
const double X10_TEMP83 = X10_TEMP80 / X10_TEMP81 ; 
const double X10_TEMP84 = X10_TEMP83 ; 
struct Point2 RX10_TEMP84  ; 
Point2_Point2( &RX10_TEMP84/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP73 , k ) ; 
struct Dist2 RX10_TEMP85 = b .distValue ; 
struct Region2 RX10_TEMP86 = RX10_TEMP85 .dReg ; 
const int32_t RX10_TEMP87 = searchPointInRegion2 ( RX10_TEMP86 , RX10_TEMP84 ) ; 
const int32_t RX10_TEMP88 = 0 ; 
const uint32_t RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88 ; 
if ( RX10_TEMP89 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP90 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP90 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP91 = getPlaceFromDist2 ( RX10_TEMP85 , RX10_TEMP87 ) ; 
const place_t RX10_TEMP93 = /* here  */ _here(); 
const uint32_t RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93 ; 
if ( RX10_TEMP94 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP92 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP92 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP87 , X10_TEMP84 ) ; 
const int32_t X10_TEMP87 = 0 ; 
struct Point2 RX10_TEMP95  ; 
Point2_Point2( &RX10_TEMP95/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP87 , k ) ; 
struct Dist2 RX10_TEMP96 = b .distValue ; 
struct Region2 RX10_TEMP97 = RX10_TEMP96 .dReg ; 
const int32_t RX10_TEMP98 = searchPointInRegion2 ( RX10_TEMP97 , RX10_TEMP95 ) ; 
const int32_t RX10_TEMP99 = 0 ; 
const uint32_t RX10_TEMP100 = RX10_TEMP98 < RX10_TEMP99 ; 
if ( RX10_TEMP100 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP101 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP101 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP102 = getPlaceFromDist2 ( RX10_TEMP96 , RX10_TEMP98 ) ; 
const place_t RX10_TEMP104 = /* here  */ _here(); 
const uint32_t RX10_TEMP105 = RX10_TEMP102 != RX10_TEMP104 ; 
if ( RX10_TEMP105 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP103 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP103 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP106 = getRefArrayValue2double ( b , RX10_TEMP98 ) ; 
const double X10_TEMP88 = RX10_TEMP106 ; 
const int32_t X10_TEMP89 = 0 ; 
/*UpdatableVariableDeclaration*/
double t = X10_TEMP89 - X10_TEMP88 ; 
const int32_t X10_TEMP101 = 0 ; 
const int32_t X10_TEMP102 = 1 ; 
const int32_t X10_TEMP103 = 0 ; 
const int32_t X10_TEMP104 = 0 ; 
const int32_t X10_TEMP105 = 1 ; 
Linpack_daxpy ( X10_TEMP0 , k , t , a , k , X10_TEMP101 , X10_TEMP102 , b , X10_TEMP103 , X10_TEMP104 , X10_TEMP105 ) ; 
} 

} 
else 
{ 
const int32_t X10_TEMP109 = 0 ; 
const int32_t X10_TEMP107 = 1 ; 
const int32_t X10_TEMP110 = n - X10_TEMP107 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP109 , X10_TEMP110 ) ; 
const place_t X10_TEMP112 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP112 ) ; 
struct Region1 RX10_TEMP109 = temprDist .dReg ; 
const int32_t RX10_TEMP112 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP110 = RX10_TEMP109 .regSize ; 
RX10_TEMP110 = RX10_TEMP110 - RX10_TEMP112 ; const int32_t RX10_TEMP111 = RX10_TEMP110 + 1; 
for ( int32_t RX10_TEMP107= 0; RX10_TEMP107<  RX10_TEMP111; RX10_TEMP107++ )
 
{ 
const int32_t RX10_TEMP113 = /*PointAccess*/RX10_TEMP107 ; 
struct Point1 RX10_TEMP108 = regionOrdinalPoint1 ( RX10_TEMP109 , RX10_TEMP113 ) ; 
const int32_t k = RX10_TEMP108 .f0 ; 
const int32_t X10_TEMP124 = 0 ; 
const int32_t X10_TEMP125 = 1 ; 
const int32_t X10_TEMP126 = 0 ; 
const int32_t X10_TEMP127 = 0 ; 
const int32_t X10_TEMP128 = 1 ; 
/*UpdatableVariableDeclaration*/
double t = Linpack_ddot ( X10_TEMP0 , k , a , k , X10_TEMP124 , X10_TEMP125 , b , X10_TEMP126 , X10_TEMP127 , X10_TEMP128 ) ; 
const int32_t X10_TEMP132 = 0 ; 
const int32_t X10_TEMP135 = 0 ; 
struct Point2 RX10_TEMP114  ; 
Point2_Point2( &RX10_TEMP114/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP135 , k ) ; 
struct Dist2 RX10_TEMP115 = b .distValue ; 
struct Region2 RX10_TEMP116 = RX10_TEMP115 .dReg ; 
const int32_t RX10_TEMP117 = searchPointInRegion2 ( RX10_TEMP116 , RX10_TEMP114 ) ; 
const int32_t RX10_TEMP118 = 0 ; 
const uint32_t RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118 ; 
if ( RX10_TEMP119 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP120 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP120 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP121 = getPlaceFromDist2 ( RX10_TEMP115 , RX10_TEMP117 ) ; 
const place_t RX10_TEMP123 = /* here  */ _here(); 
const uint32_t RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123 ; 
if ( RX10_TEMP124 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP122 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP122 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP125 = getRefArrayValue2double ( b , RX10_TEMP117 ) ; 
const double X10_TEMP136 = RX10_TEMP125 ; 
const double X10_TEMP138 = X10_TEMP136 - t ; 
struct Point2 RX10_TEMP126  ; 
Point2_Point2( &RX10_TEMP126/*OBJECT INIT IN ASSIGNMENT*/, k , k ) ; 
struct Dist2 RX10_TEMP127 = a .distValue ; 
struct Region2 RX10_TEMP128 = RX10_TEMP127 .dReg ; 
const int32_t RX10_TEMP129 = searchPointInRegion2 ( RX10_TEMP128 , RX10_TEMP126 ) ; 
const int32_t RX10_TEMP130 = 0 ; 
const uint32_t RX10_TEMP131 = RX10_TEMP129 < RX10_TEMP130 ; 
if ( RX10_TEMP131 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP132 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP132 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP133 = getPlaceFromDist2 ( RX10_TEMP127 , RX10_TEMP129 ) ; 
const place_t RX10_TEMP135 = /* here  */ _here(); 
const uint32_t RX10_TEMP136 = RX10_TEMP133 != RX10_TEMP135 ; 
if ( RX10_TEMP136 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP134 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP134 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP137 = getRefArrayValue2double ( a , RX10_TEMP129 ) ; 
const double X10_TEMP141 = RX10_TEMP137 ; 
const double X10_TEMP143 = X10_TEMP138 / X10_TEMP141 ; 
const double X10_TEMP144 = X10_TEMP143 ; 
struct Point2 RX10_TEMP138  ; 
Point2_Point2( &RX10_TEMP138/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP132 , k ) ; 
struct Dist2 RX10_TEMP139 = b .distValue ; 
struct Region2 RX10_TEMP140 = RX10_TEMP139 .dReg ; 
const int32_t RX10_TEMP141 = searchPointInRegion2 ( RX10_TEMP140 , RX10_TEMP138 ) ; 
const int32_t RX10_TEMP142 = 0 ; 
const uint32_t RX10_TEMP143 = RX10_TEMP141 < RX10_TEMP142 ; 
if ( RX10_TEMP143 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP144 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP144 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP145 = getPlaceFromDist2 ( RX10_TEMP139 , RX10_TEMP141 ) ; 
const place_t RX10_TEMP147 = /* here  */ _here(); 
const uint32_t RX10_TEMP148 = RX10_TEMP145 != RX10_TEMP147 ; 
if ( RX10_TEMP148 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP146 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP146 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP141 , X10_TEMP144 ) ; 
} 

const int32_t X10_TEMP145 = 1 ; 
const uint32_t X10_TEMP147 = nm1 >= X10_TEMP145 ; 
if ( X10_TEMP147 ) 
{ 
const int32_t X10_TEMP151 = 1 ; 
const int32_t X10_TEMP149 = 1 ; 
const int32_t X10_TEMP152 = nm1 - X10_TEMP149 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 temprnm1 = createNewRegion1R ( X10_TEMP151 , X10_TEMP152 ) ; 
const place_t X10_TEMP154 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprnm1Dist = getPlaceDist1 ( temprnm1 , X10_TEMP154 ) ; 
struct Region1 RX10_TEMP151 = temprnm1Dist .dReg ; 
const int32_t RX10_TEMP154 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP152 = RX10_TEMP151 .regSize ; 
RX10_TEMP152 = RX10_TEMP152 - RX10_TEMP154 ; const int32_t RX10_TEMP153 = RX10_TEMP152 + 1; 
for ( int32_t RX10_TEMP149= 0; RX10_TEMP149<  RX10_TEMP153; RX10_TEMP149++ )
 
{ 
const int32_t RX10_TEMP155 = /*PointAccess*/RX10_TEMP149 ; 
struct Point1 RX10_TEMP150 = regionOrdinalPoint1 ( RX10_TEMP151 , RX10_TEMP155 ) ; 
const int32_t kb = RX10_TEMP150 .f0 ; 
const int32_t X10_TEMP157 = 1 ; 
const int32_t X10_TEMP159 = kb + X10_TEMP157 ; 
const int32_t k = n - X10_TEMP159 ; 
const int32_t X10_TEMP161 = 1 ; 
const int32_t kp1 = k + X10_TEMP161 ; 
const int32_t X10_TEMP165 = 0 ; 
const int32_t X10_TEMP168 = 0 ; 
struct Point2 RX10_TEMP156  ; 
Point2_Point2( &RX10_TEMP156/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP168 , k ) ; 
struct Dist2 RX10_TEMP157 = b .distValue ; 
struct Region2 RX10_TEMP158 = RX10_TEMP157 .dReg ; 
const int32_t RX10_TEMP159 = searchPointInRegion2 ( RX10_TEMP158 , RX10_TEMP156 ) ; 
const int32_t RX10_TEMP160 = 0 ; 
const uint32_t RX10_TEMP161 = RX10_TEMP159 < RX10_TEMP160 ; 
if ( RX10_TEMP161 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP162 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP162 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP163 = getPlaceFromDist2 ( RX10_TEMP157 , RX10_TEMP159 ) ; 
const place_t RX10_TEMP165 = /* here  */ _here(); 
const uint32_t RX10_TEMP166 = RX10_TEMP163 != RX10_TEMP165 ; 
if ( RX10_TEMP166 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP164 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP164 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP167 = getRefArrayValue2double ( b , RX10_TEMP159 ) ; 
const double X10_TEMP184 = RX10_TEMP167 ; 
const int32_t X10_TEMP170 = kp1 ; 
const int32_t X10_TEMP180 = n - X10_TEMP170 ; 
const int32_t X10_TEMP181 = 1 ; 
const int32_t X10_TEMP182 = 0 ; 
const int32_t X10_TEMP183 = 1 ; 
const double X10_TEMP185 = Linpack_ddot ( X10_TEMP0 , X10_TEMP180 , a , k , kp1 , X10_TEMP181 , b , X10_TEMP182 , kp1 , X10_TEMP183 ) ; 
const double X10_TEMP187 = X10_TEMP184 + X10_TEMP185 ; 
const double X10_TEMP188 = X10_TEMP187 ; 
struct Point2 RX10_TEMP168  ; 
Point2_Point2( &RX10_TEMP168/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP165 , k ) ; 
struct Dist2 RX10_TEMP169 = b .distValue ; 
struct Region2 RX10_TEMP170 = RX10_TEMP169 .dReg ; 
const int32_t RX10_TEMP171 = searchPointInRegion2 ( RX10_TEMP170 , RX10_TEMP168 ) ; 
const int32_t RX10_TEMP172 = 0 ; 
const uint32_t RX10_TEMP173 = RX10_TEMP171 < RX10_TEMP172 ; 
if ( RX10_TEMP173 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP174 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP174 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP175 = getPlaceFromDist2 ( RX10_TEMP169 , RX10_TEMP171 ) ; 
const place_t RX10_TEMP177 = /* here  */ _here(); 
const uint32_t RX10_TEMP178 = RX10_TEMP175 != RX10_TEMP177 ; 
if ( RX10_TEMP178 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP176 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP176 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP171 , X10_TEMP188 ) ; 
struct Point1 RX10_TEMP179  ; 
Point1_Point1( &RX10_TEMP179/*OBJECT INIT IN ASSIGNMENT*/, k ) ; 
struct Dist1 RX10_TEMP180 = ipvt .distValue ; 
struct Region1 RX10_TEMP181 = RX10_TEMP180 .dReg ; 
const int32_t RX10_TEMP182 = searchPointInRegion1 ( RX10_TEMP181 , RX10_TEMP179 ) ; 
const int32_t RX10_TEMP183 = 0 ; 
const uint32_t RX10_TEMP184 = RX10_TEMP182 < RX10_TEMP183 ; 
if ( RX10_TEMP184 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP185 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP185 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP186 = getPlaceFromDist1 ( RX10_TEMP180 , RX10_TEMP182 ) ; 
const place_t RX10_TEMP188 = /* here  */ _here(); 
const uint32_t RX10_TEMP189 = RX10_TEMP186 != RX10_TEMP188 ; 
if ( RX10_TEMP189 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP187 = "Bad place access for array ipvt" ; 
fprintf(stderr, "%s",RX10_TEMP187 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP190 = getRefArrayValue1int ( ipvt , RX10_TEMP182 ) ; 
const int32_t l = RX10_TEMP190 ; 
const uint32_t X10_TEMP192 = l != k ; 
if ( X10_TEMP192 ) 
{ 
const int32_t X10_TEMP195 = 0 ; 
struct Point2 RX10_TEMP191  ; 
Point2_Point2( &RX10_TEMP191/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP195 , l ) ; 
struct Dist2 RX10_TEMP192 = b .distValue ; 
struct Region2 RX10_TEMP193 = RX10_TEMP192 .dReg ; 
const int32_t RX10_TEMP194 = searchPointInRegion2 ( RX10_TEMP193 , RX10_TEMP191 ) ; 
const int32_t RX10_TEMP195 = 0 ; 
const uint32_t RX10_TEMP196 = RX10_TEMP194 < RX10_TEMP195 ; 
if ( RX10_TEMP196 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP197 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP197 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP198 = getPlaceFromDist2 ( RX10_TEMP192 , RX10_TEMP194 ) ; 
const place_t RX10_TEMP200 = /* here  */ _here(); 
const uint32_t RX10_TEMP201 = RX10_TEMP198 != RX10_TEMP200 ; 
if ( RX10_TEMP201 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP199 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP199 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP202 = getRefArrayValue2double ( b , RX10_TEMP194 ) ; 
/*UpdatableVariableDeclaration*/
double t = RX10_TEMP202 ; 
const int32_t X10_TEMP199 = 0 ; 
const int32_t X10_TEMP202 = 0 ; 
struct Point2 RX10_TEMP203  ; 
Point2_Point2( &RX10_TEMP203/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP202 , k ) ; 
struct Dist2 RX10_TEMP204 = b .distValue ; 
struct Region2 RX10_TEMP205 = RX10_TEMP204 .dReg ; 
const int32_t RX10_TEMP206 = searchPointInRegion2 ( RX10_TEMP205 , RX10_TEMP203 ) ; 
const int32_t RX10_TEMP207 = 0 ; 
const uint32_t RX10_TEMP208 = RX10_TEMP206 < RX10_TEMP207 ; 
if ( RX10_TEMP208 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP209 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP209 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP210 = getPlaceFromDist2 ( RX10_TEMP204 , RX10_TEMP206 ) ; 
const place_t RX10_TEMP212 = /* here  */ _here(); 
const uint32_t RX10_TEMP213 = RX10_TEMP210 != RX10_TEMP212 ; 
if ( RX10_TEMP213 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP211 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP211 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP214 = getRefArrayValue2double ( b , RX10_TEMP206 ) ; 
const double X10_TEMP204 = RX10_TEMP214 ; 
const double X10_TEMP205 = X10_TEMP204 ; 
struct Point2 RX10_TEMP215  ; 
Point2_Point2( &RX10_TEMP215/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP199 , l ) ; 
struct Dist2 RX10_TEMP216 = b .distValue ; 
struct Region2 RX10_TEMP217 = RX10_TEMP216 .dReg ; 
const int32_t RX10_TEMP218 = searchPointInRegion2 ( RX10_TEMP217 , RX10_TEMP215 ) ; 
const int32_t RX10_TEMP219 = 0 ; 
const uint32_t RX10_TEMP220 = RX10_TEMP218 < RX10_TEMP219 ; 
if ( RX10_TEMP220 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP221 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP221 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP222 = getPlaceFromDist2 ( RX10_TEMP216 , RX10_TEMP218 ) ; 
const place_t RX10_TEMP224 = /* here  */ _here(); 
const uint32_t RX10_TEMP225 = RX10_TEMP222 != RX10_TEMP224 ; 
if ( RX10_TEMP225 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP223 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP223 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP218 , X10_TEMP205 ) ; 
const int32_t X10_TEMP208 = 0 ; 
const double X10_TEMP210 = t ; 
struct Point2 RX10_TEMP226  ; 
Point2_Point2( &RX10_TEMP226/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP208 , k ) ; 
struct Dist2 RX10_TEMP227 = b .distValue ; 
struct Region2 RX10_TEMP228 = RX10_TEMP227 .dReg ; 
const int32_t RX10_TEMP229 = searchPointInRegion2 ( RX10_TEMP228 , RX10_TEMP226 ) ; 
const int32_t RX10_TEMP230 = 0 ; 
const uint32_t RX10_TEMP231 = RX10_TEMP229 < RX10_TEMP230 ; 
if ( RX10_TEMP231 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP232 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP232 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP233 = getPlaceFromDist2 ( RX10_TEMP227 , RX10_TEMP229 ) ; 
const place_t RX10_TEMP235 = /* here  */ _here(); 
const uint32_t RX10_TEMP236 = RX10_TEMP233 != RX10_TEMP235 ; 
if ( RX10_TEMP236 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP234 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP234 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP229 , X10_TEMP210 ) ; 
} 

} 

} 

} 


} 

void /*static*/Linpack_daxpy (  struct Linpack  * const X10_TEMP0 , const int32_t n , const double da ,  struct doubleRefArray2 const dx , const int32_t dxCol , const int32_t dx_off , const int32_t incx ,  struct doubleRefArray2 const dy , const int32_t dyCol , const int32_t dy_off , const int32_t incy ) 
{ 
const int32_t X10_TEMP1 = 0 ; 
const uint32_t X10_TEMP3 = n > X10_TEMP1 ; 
const int32_t X10_TEMP4 = 0 ; 
const uint32_t X10_TEMP6 = da != X10_TEMP4 ; 
const uint32_t X10_TEMP8 = X10_TEMP3 && X10_TEMP6 ; 
if ( X10_TEMP8 ) 
{ 
const int32_t X10_TEMP9 = 1 ; 
const uint32_t X10_TEMP11 = incx != X10_TEMP9 ; 
const int32_t X10_TEMP10 = 1 ; 
const uint32_t X10_TEMP12 = incy != X10_TEMP10 ; 
const uint32_t X10_TEMP14 = X10_TEMP11 || X10_TEMP12 ; 
if ( X10_TEMP14 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t ix = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t iy = 0 ; 
const int32_t X10_TEMP17 = 0 ; 
const uint32_t X10_TEMP19 = incx < X10_TEMP17 ; 
if ( X10_TEMP19 ) 
{ 
const int32_t X10_TEMP20 = 0 ; 
const int32_t X10_TEMP21 = X10_TEMP20 - n ; 
const int32_t X10_TEMP22 = 1 ; 
const int32_t X10_TEMP24 = X10_TEMP21 + X10_TEMP22 ; 
const int32_t X10_TEMP26 = X10_TEMP24 * incx ; 
ix = X10_TEMP26 ; } 

const int32_t X10_TEMP27 = 0 ; 
const uint32_t X10_TEMP29 = incy < X10_TEMP27 ; 
if ( X10_TEMP29 ) 
{ 
const int32_t X10_TEMP30 = 0 ; 
const int32_t X10_TEMP31 = X10_TEMP30 - n ; 
const int32_t X10_TEMP32 = 1 ; 
const int32_t X10_TEMP34 = X10_TEMP31 + X10_TEMP32 ; 
const int32_t X10_TEMP36 = X10_TEMP34 * incy ; 
iy = X10_TEMP36 ; } 

const int32_t X10_TEMP40 = 0 ; 
const int32_t X10_TEMP38 = 1 ; 
const int32_t X10_TEMP41 = n - X10_TEMP38 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP40 , X10_TEMP41 ) ; 
const place_t X10_TEMP43 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP43 ) ; 
struct Region1 RX10_TEMP1 = temprDist .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
const int32_t X10_TEMP48 = iy + dy_off ; 
const int32_t X10_TEMP51 = iy + dy_off ; 
struct Point2 RX10_TEMP6  ; 
Point2_Point2( &RX10_TEMP6/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP51 ) ; 
struct Dist2 RX10_TEMP7 = dy .distValue ; 
struct Region2 RX10_TEMP8 = RX10_TEMP7 .dReg ; 
const int32_t RX10_TEMP9 = searchPointInRegion2 ( RX10_TEMP8 , RX10_TEMP6 ) ; 
const int32_t RX10_TEMP10 = 0 ; 
const uint32_t RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP12 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP13 = getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const place_t RX10_TEMP15 = /* here  */ _here(); 
const uint32_t RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP17 = getRefArrayValue2double ( dy , RX10_TEMP9 ) ; 
const double X10_TEMP59 = RX10_TEMP17 ; 
const int32_t X10_TEMP55 = ix + dx_off ; 
const double X10_TEMP56 = Linpack_read ( X10_TEMP0 , dx , dxCol , X10_TEMP55 ) ; 
const double X10_TEMP58 = da * X10_TEMP56 ; 
const double X10_TEMP61 = X10_TEMP59 + X10_TEMP58 ; 
const double X10_TEMP62 = X10_TEMP61 ; 
struct Point2 RX10_TEMP18  ; 
Point2_Point2( &RX10_TEMP18/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP48 ) ; 
struct Dist2 RX10_TEMP19 = dy .distValue ; 
struct Region2 RX10_TEMP20 = RX10_TEMP19 .dReg ; 
const int32_t RX10_TEMP21 = searchPointInRegion2 ( RX10_TEMP20 , RX10_TEMP18 ) ; 
const int32_t RX10_TEMP22 = 0 ; 
const uint32_t RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22 ; 
if ( RX10_TEMP23 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP24 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP24 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP25 = getPlaceFromDist2 ( RX10_TEMP19 , RX10_TEMP21 ) ; 
const place_t RX10_TEMP27 = /* here  */ _here(); 
const uint32_t RX10_TEMP28 = RX10_TEMP25 != RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( dy , RX10_TEMP21 , X10_TEMP62 ) ; 
const int32_t X10_TEMP64 = ix + incx ; 
ix = X10_TEMP64 ; const int32_t X10_TEMP66 = iy + incy ; 
iy = X10_TEMP66 ; } 

return ; 
} 

const int32_t X10_TEMP70 = 0 ; 
const int32_t X10_TEMP68 = 1 ; 
const int32_t X10_TEMP71 = n - X10_TEMP68 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP70 , X10_TEMP71 ) ; 
const place_t X10_TEMP73 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP73 ) ; 
struct Region1 RX10_TEMP31 = temprDist .dReg ; 
const int32_t RX10_TEMP34 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP32 = RX10_TEMP31 .regSize ; 
RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34 ; const int32_t RX10_TEMP33 = RX10_TEMP32 + 1; 
for ( int32_t RX10_TEMP29= 0; RX10_TEMP29<  RX10_TEMP33; RX10_TEMP29++ )
 
{ 
const int32_t RX10_TEMP35 = /*PointAccess*/RX10_TEMP29 ; 
struct Point1 RX10_TEMP30 = regionOrdinalPoint1 ( RX10_TEMP31 , RX10_TEMP35 ) ; 
const int32_t i = RX10_TEMP30 .f0 ; 
const int32_t X10_TEMP78 = i + dy_off ; 
const int32_t X10_TEMP81 = i + dy_off ; 
struct Point2 RX10_TEMP36  ; 
Point2_Point2( &RX10_TEMP36/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP81 ) ; 
struct Dist2 RX10_TEMP37 = dy .distValue ; 
struct Region2 RX10_TEMP38 = RX10_TEMP37 .dReg ; 
const int32_t RX10_TEMP39 = searchPointInRegion2 ( RX10_TEMP38 , RX10_TEMP36 ) ; 
const int32_t RX10_TEMP40 = 0 ; 
const uint32_t RX10_TEMP41 = RX10_TEMP39 < RX10_TEMP40 ; 
if ( RX10_TEMP41 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP42 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP42 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP43 = getPlaceFromDist2 ( RX10_TEMP37 , RX10_TEMP39 ) ; 
const place_t RX10_TEMP45 = /* here  */ _here(); 
const uint32_t RX10_TEMP46 = RX10_TEMP43 != RX10_TEMP45 ; 
if ( RX10_TEMP46 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP44 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP44 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP47 = getRefArrayValue2double ( dy , RX10_TEMP39 ) ; 
const double X10_TEMP89 = RX10_TEMP47 ; 
const int32_t X10_TEMP85 = i + dx_off ; 
const double X10_TEMP86 = Linpack_read ( X10_TEMP0 , dx , dxCol , X10_TEMP85 ) ; 
const double X10_TEMP88 = da * X10_TEMP86 ; 
const double X10_TEMP91 = X10_TEMP89 + X10_TEMP88 ; 
const double X10_TEMP92 = X10_TEMP91 ; 
struct Point2 RX10_TEMP48  ; 
Point2_Point2( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP78 ) ; 
struct Dist2 RX10_TEMP49 = dy .distValue ; 
struct Region2 RX10_TEMP50 = RX10_TEMP49 .dReg ; 
const int32_t RX10_TEMP51 = searchPointInRegion2 ( RX10_TEMP50 , RX10_TEMP48 ) ; 
const int32_t RX10_TEMP52 = 0 ; 
const uint32_t RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; 
if ( RX10_TEMP53 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP54 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP55 = getPlaceFromDist2 ( RX10_TEMP49 , RX10_TEMP51 ) ; 
const place_t RX10_TEMP57 = /* here  */ _here(); 
const uint32_t RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57 ; 
if ( RX10_TEMP58 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP56 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP56 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( dy , RX10_TEMP51 , X10_TEMP92 ) ; 
} 

} 

} 

double /*static*/Linpack_ddot (  struct Linpack  * const X10_TEMP0 , const int32_t n ,  struct doubleRefArray2 const dx , const int32_t dxCol , const int32_t dx_off , const int32_t incx ,  struct doubleRefArray2 const dy , const int32_t dyCol , const int32_t dy_off , const int32_t incy ) 
{ 
/*UpdatableVariableDeclaration*/
double dtemp = 0 ; 
const int32_t X10_TEMP2 = 0 ; 
const uint32_t X10_TEMP4 = n > X10_TEMP2 ; 
if ( X10_TEMP4 ) 
{ 
const int32_t X10_TEMP5 = 1 ; 
const uint32_t X10_TEMP7 = incx != X10_TEMP5 ; 
const int32_t X10_TEMP6 = 1 ; 
const uint32_t X10_TEMP8 = incy != X10_TEMP6 ; 
const uint32_t X10_TEMP10 = X10_TEMP7 || X10_TEMP8 ; 
if ( X10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t ix = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t iy = 0 ; 
const int32_t X10_TEMP13 = 0 ; 
const uint32_t X10_TEMP15 = incx < X10_TEMP13 ; 
if ( X10_TEMP15 ) 
{ 
const int32_t X10_TEMP16 = 0 ; 
const int32_t X10_TEMP17 = X10_TEMP16 - n ; 
const int32_t X10_TEMP18 = 1 ; 
const int32_t X10_TEMP20 = X10_TEMP17 + X10_TEMP18 ; 
const int32_t X10_TEMP22 = X10_TEMP20 * incx ; 
ix = X10_TEMP22 ; } 

const int32_t X10_TEMP23 = 0 ; 
const uint32_t X10_TEMP25 = incy < X10_TEMP23 ; 
if ( X10_TEMP25 ) 
{ 
const int32_t X10_TEMP26 = 0 ; 
const int32_t X10_TEMP27 = X10_TEMP26 - n ; 
const int32_t X10_TEMP28 = 1 ; 
const int32_t X10_TEMP30 = X10_TEMP27 + X10_TEMP28 ; 
const int32_t X10_TEMP32 = X10_TEMP30 * incy ; 
iy = X10_TEMP32 ; } 

const int32_t X10_TEMP36 = 0 ; 
const int32_t X10_TEMP34 = 1 ; 
const int32_t X10_TEMP37 = n - X10_TEMP34 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP36 , X10_TEMP37 ) ; 
const place_t X10_TEMP39 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP39 ) ; 
struct Region1 RX10_TEMP1 = temprDist .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
const int32_t X10_TEMP44 = ix + dx_off ; 
struct Point2 RX10_TEMP6  ; 
Point2_Point2( &RX10_TEMP6/*OBJECT INIT IN ASSIGNMENT*/, dxCol , X10_TEMP44 ) ; 
struct Dist2 RX10_TEMP7 = dx .distValue ; 
struct Region2 RX10_TEMP8 = RX10_TEMP7 .dReg ; 
const int32_t RX10_TEMP9 = searchPointInRegion2 ( RX10_TEMP8 , RX10_TEMP6 ) ; 
const int32_t RX10_TEMP10 = 0 ; 
const uint32_t RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP12 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP13 = getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const place_t RX10_TEMP15 = /* here  */ _here(); 
const uint32_t RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP17 = getRefArrayValue2double ( dx , RX10_TEMP9 ) ; 
const double X10_TEMP48 = RX10_TEMP17 ; 
const int32_t X10_TEMP47 = iy + dy_off ; 
struct Point2 RX10_TEMP18  ; 
Point2_Point2( &RX10_TEMP18/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP47 ) ; 
struct Dist2 RX10_TEMP19 = dy .distValue ; 
struct Region2 RX10_TEMP20 = RX10_TEMP19 .dReg ; 
const int32_t RX10_TEMP21 = searchPointInRegion2 ( RX10_TEMP20 , RX10_TEMP18 ) ; 
const int32_t RX10_TEMP22 = 0 ; 
const uint32_t RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22 ; 
if ( RX10_TEMP23 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP24 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP24 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP25 = getPlaceFromDist2 ( RX10_TEMP19 , RX10_TEMP21 ) ; 
const place_t RX10_TEMP27 = /* here  */ _here(); 
const uint32_t RX10_TEMP28 = RX10_TEMP25 != RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP29 = getRefArrayValue2double ( dy , RX10_TEMP21 ) ; 
const double X10_TEMP49 = RX10_TEMP29 ; 
const double X10_TEMP51 = X10_TEMP48 * X10_TEMP49 ; 
const double X10_TEMP53 = dtemp + X10_TEMP51 ; 
dtemp = X10_TEMP53 ; const int32_t X10_TEMP55 = ix + incx ; 
ix = X10_TEMP55 ; const int32_t X10_TEMP57 = iy + incy ; 
iy = X10_TEMP57 ; } 

} 
else 
{ 
const int32_t X10_TEMP61 = 0 ; 
const int32_t X10_TEMP59 = 1 ; 
const int32_t X10_TEMP62 = n - X10_TEMP59 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP61 , X10_TEMP62 ) ; 
const place_t X10_TEMP64 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP64 ) ; 
struct Region1 RX10_TEMP32 = temprDist .dReg ; 
const int32_t RX10_TEMP35 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP33 = RX10_TEMP32 .regSize ; 
RX10_TEMP33 = RX10_TEMP33 - RX10_TEMP35 ; const int32_t RX10_TEMP34 = RX10_TEMP33 + 1; 
for ( int32_t RX10_TEMP30= 0; RX10_TEMP30<  RX10_TEMP34; RX10_TEMP30++ )
 
{ 
const int32_t RX10_TEMP36 = /*PointAccess*/RX10_TEMP30 ; 
struct Point1 RX10_TEMP31 = regionOrdinalPoint1 ( RX10_TEMP32 , RX10_TEMP36 ) ; 
const int32_t i = RX10_TEMP31 .f0 ; 
const int32_t X10_TEMP69 = i + dx_off ; 
struct Point2 RX10_TEMP37  ; 
Point2_Point2( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, dxCol , X10_TEMP69 ) ; 
struct Dist2 RX10_TEMP38 = dx .distValue ; 
struct Region2 RX10_TEMP39 = RX10_TEMP38 .dReg ; 
const int32_t RX10_TEMP40 = searchPointInRegion2 ( RX10_TEMP39 , RX10_TEMP37 ) ; 
const int32_t RX10_TEMP41 = 0 ; 
const uint32_t RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP44 = getPlaceFromDist2 ( RX10_TEMP38 , RX10_TEMP40 ) ; 
const place_t RX10_TEMP46 = /* here  */ _here(); 
const uint32_t RX10_TEMP47 = RX10_TEMP44 != RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP45 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP45 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP48 = getRefArrayValue2double ( dx , RX10_TEMP40 ) ; 
const double X10_TEMP73 = RX10_TEMP48 ; 
const int32_t X10_TEMP72 = i + dy_off ; 
struct Point2 RX10_TEMP49  ; 
Point2_Point2( &RX10_TEMP49/*OBJECT INIT IN ASSIGNMENT*/, dyCol , X10_TEMP72 ) ; 
struct Dist2 RX10_TEMP50 = dy .distValue ; 
struct Region2 RX10_TEMP51 = RX10_TEMP50 .dReg ; 
const int32_t RX10_TEMP52 = searchPointInRegion2 ( RX10_TEMP51 , RX10_TEMP49 ) ; 
const int32_t RX10_TEMP53 = 0 ; 
const uint32_t RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP55 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP56 = getPlaceFromDist2 ( RX10_TEMP50 , RX10_TEMP52 ) ; 
const place_t RX10_TEMP58 = /* here  */ _here(); 
const uint32_t RX10_TEMP59 = RX10_TEMP56 != RX10_TEMP58 ; 
if ( RX10_TEMP59 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP57 = "Bad place access for array dy" ; 
fprintf(stderr, "%s",RX10_TEMP57 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP60 = getRefArrayValue2double ( dy , RX10_TEMP52 ) ; 
const double X10_TEMP74 = RX10_TEMP60 ; 
const double X10_TEMP75 = X10_TEMP73 * X10_TEMP74 ; 
const double X10_TEMP77 = dtemp + X10_TEMP75 ; 
dtemp = X10_TEMP77 ; } 

} 


} 

return dtemp ; 
} 

void /*static*/Linpack_dscal (  struct Linpack  * const X10_TEMP0 , const int32_t n , const double da ,  struct doubleRefArray2 const dx , const int32_t currentCol , const int32_t dx_off , const int32_t incx ) 
{ 
const int32_t X10_TEMP1 = 0 ; 
const uint32_t X10_TEMP3 = n > X10_TEMP1 ; 
if ( X10_TEMP3 ) 
{ 
const int32_t X10_TEMP4 = 1 ; 
const uint32_t X10_TEMP6 = incx != X10_TEMP4 ; 
if ( X10_TEMP6 ) 
{ 
const int32_t nincx = n * incx ; 
/*UpdatableVariableDeclaration*/
int32_t i = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP11 = i < nincx ; 

while ( X10_TEMP11 ) 
{ 
const int32_t X10_TEMP14 = i + dx_off ; 
const int32_t X10_TEMP17 = i + dx_off ; 
struct Point2 RX10_TEMP0  ; 
Point2_Point2( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, currentCol , X10_TEMP17 ) ; 
struct Dist2 RX10_TEMP1 = dx .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP11 = getRefArrayValue2double ( dx , RX10_TEMP3 ) ; 
const double X10_TEMP18 = RX10_TEMP11 ; 
const double X10_TEMP20 = X10_TEMP18 * da ; 
const double X10_TEMP21 = X10_TEMP20 ; 
struct Point2 RX10_TEMP12  ; 
Point2_Point2( &RX10_TEMP12/*OBJECT INIT IN ASSIGNMENT*/, currentCol , X10_TEMP14 ) ; 
struct Dist2 RX10_TEMP13 = dx .distValue ; 
struct Region2 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
const int32_t RX10_TEMP15 = searchPointInRegion2 ( RX10_TEMP14 , RX10_TEMP12 ) ; 
const int32_t RX10_TEMP16 = 0 ; 
const uint32_t RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP18 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP18 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP19 = getPlaceFromDist2 ( RX10_TEMP13 , RX10_TEMP15 ) ; 
const place_t RX10_TEMP21 = /* here  */ _here(); 
const uint32_t RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; 
if ( RX10_TEMP22 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP20 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( dx , RX10_TEMP15 , X10_TEMP21 ) ; 
const int32_t X10_TEMP23 = i + incx ; 
i = X10_TEMP23 ; X10_TEMP11 = i < nincx ; } 

} 
else 
{ 
const int32_t X10_TEMP27 = 0 ; 
const int32_t X10_TEMP25 = 1 ; 
const int32_t X10_TEMP28 = n - X10_TEMP25 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 tempr = createNewRegion1R ( X10_TEMP27 , X10_TEMP28 ) ; 
const place_t X10_TEMP30 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprDist = getPlaceDist1 ( tempr , X10_TEMP30 ) ; 
struct Region1 RX10_TEMP25 = temprDist .dReg ; 
const int32_t RX10_TEMP28 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP26 = RX10_TEMP25 .regSize ; 
RX10_TEMP26 = RX10_TEMP26 - RX10_TEMP28 ; const int32_t RX10_TEMP27 = RX10_TEMP26 + 1; 
for ( int32_t RX10_TEMP23= 0; RX10_TEMP23<  RX10_TEMP27; RX10_TEMP23++ )
 
{ 
const int32_t RX10_TEMP29 = /*PointAccess*/RX10_TEMP23 ; 
struct Point1 RX10_TEMP24 = regionOrdinalPoint1 ( RX10_TEMP25 , RX10_TEMP29 ) ; 
const int32_t i = RX10_TEMP24 .f0 ; 
const int32_t X10_TEMP35 = i + dx_off ; 
const int32_t X10_TEMP38 = i + dx_off ; 
struct Point2 RX10_TEMP30  ; 
Point2_Point2( &RX10_TEMP30/*OBJECT INIT IN ASSIGNMENT*/, currentCol , X10_TEMP38 ) ; 
struct Dist2 RX10_TEMP31 = dx .distValue ; 
struct Region2 RX10_TEMP32 = RX10_TEMP31 .dReg ; 
const int32_t RX10_TEMP33 = searchPointInRegion2 ( RX10_TEMP32 , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP34 = 0 ; 
const uint32_t RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; 
if ( RX10_TEMP35 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP36 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP36 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP37 = getPlaceFromDist2 ( RX10_TEMP31 , RX10_TEMP33 ) ; 
const place_t RX10_TEMP39 = /* here  */ _here(); 
const uint32_t RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP41 = getRefArrayValue2double ( dx , RX10_TEMP33 ) ; 
const double X10_TEMP39 = RX10_TEMP41 ; 
const double X10_TEMP41 = X10_TEMP39 * da ; 
const double X10_TEMP42 = X10_TEMP41 ; 
struct Point2 RX10_TEMP42  ; 
Point2_Point2( &RX10_TEMP42/*OBJECT INIT IN ASSIGNMENT*/, currentCol , X10_TEMP35 ) ; 
struct Dist2 RX10_TEMP43 = dx .distValue ; 
struct Region2 RX10_TEMP44 = RX10_TEMP43 .dReg ; 
const int32_t RX10_TEMP45 = searchPointInRegion2 ( RX10_TEMP44 , RX10_TEMP42 ) ; 
const int32_t RX10_TEMP46 = 0 ; 
const uint32_t RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP48 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP48 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP49 = getPlaceFromDist2 ( RX10_TEMP43 , RX10_TEMP45 ) ; 
const place_t RX10_TEMP51 = /* here  */ _here(); 
const uint32_t RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; 
if ( RX10_TEMP52 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP50 = "Bad place access for array dx" ; 
fprintf(stderr, "%s",RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( dx , RX10_TEMP45 , X10_TEMP42 ) ; 
} 

} 


} 

} 

int32_t /*static*/Linpack_idamax (  struct Linpack  * const X10_TEMP0 , const int32_t n ,  struct doubleRefArray2 const dx , const int32_t dxk , const int32_t dx_off , const int32_t incx ) 
{ 
const int32_t X10_TEMP1 = 1 ; 
const uint32_t X10_TEMP3 = n < X10_TEMP1 ; 
if ( X10_TEMP3 ) 
{ 
const int32_t X10_TEMP4 = 1 ; 
const int32_t X10_TEMP5 = 0 ; 
const int32_t X10_TEMP7 = X10_TEMP5 - X10_TEMP4 ; 
return X10_TEMP7 ; 
} 

const int32_t X10_TEMP8 = 1 ; 
const uint32_t X10_TEMP10 = n == X10_TEMP8 ; 
if ( X10_TEMP10 ) 
{ 
const int32_t X10_TEMP12 = 0 ; 
return X10_TEMP12 ; 
} 

const int32_t X10_TEMP13 = 1 ; 
const uint32_t X10_TEMP15 = incx != X10_TEMP13 ; 
if ( X10_TEMP15 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t itemp = 0 ; 
const int32_t X10_TEMP19 = 0 ; 
const int32_t X10_TEMP21 = X10_TEMP19 + dx_off ; 
const double X10_TEMP23 = Linpack_read ( X10_TEMP0 , dx , dxk , X10_TEMP21 ) ; 
/*UpdatableVariableDeclaration*/
double dmax = Linpack_myabs ( X10_TEMP0 , X10_TEMP23 ) ; 
const int32_t X10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t ix = X10_TEMP25 + incx ; 
const int32_t X10_TEMP30 = 1 ; 
const int32_t X10_TEMP28 = 1 ; 
const int32_t X10_TEMP31 = n - X10_TEMP28 ; 
struct Region1 X10_TEMP33 = createNewRegion1R ( X10_TEMP30 , X10_TEMP31 ) ; 
const int32_t RX10_TEMP3 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP1 = X10_TEMP33 .regSize ; 
RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; const int32_t RX10_TEMP2 = RX10_TEMP1 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP2; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP4 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP33 , RX10_TEMP4 ) ; 
const int32_t X10_TEMP37 = ix + dx_off ; 
const double X10_TEMP39 = Linpack_read ( X10_TEMP0 , dx , dxk , X10_TEMP37 ) ; 
/*UpdatableVariableDeclaration*/
double dtemp = Linpack_myabs ( X10_TEMP0 , X10_TEMP39 ) ; 
const uint32_t X10_TEMP42 = dtemp > dmax ; 
if ( X10_TEMP42 ) 
{ 
const int32_t X10_TEMP45 = i .f0 ; 
itemp = X10_TEMP45 ; dmax = dtemp ; } 

const int32_t X10_TEMP48 = i .f0 ; 
const int32_t X10_TEMP50 = X10_TEMP48 + incx ; 
ix = X10_TEMP50 ; } 

return itemp ; 
} 

/*UpdatableVariableDeclaration*/
int32_t itemp = 0 ; 
const int32_t X10_TEMP55 = 0 ; 
const int32_t X10_TEMP57 = X10_TEMP55 + dx_off ; 
const double X10_TEMP59 = Linpack_read ( X10_TEMP0 , dx , dxk , X10_TEMP57 ) ; 
/*UpdatableVariableDeclaration*/
double dmax = Linpack_myabs ( X10_TEMP0 , X10_TEMP59 ) ; 
const int32_t X10_TEMP64 = 1 ; 
const int32_t X10_TEMP62 = 1 ; 
const int32_t X10_TEMP65 = n - X10_TEMP62 ; 
struct Region1 X10_TEMP67 = createNewRegion1R ( X10_TEMP64 , X10_TEMP65 ) ; 
const int32_t RX10_TEMP8 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP6 = X10_TEMP67 .regSize ; 
RX10_TEMP6 = RX10_TEMP6 - RX10_TEMP8 ; const int32_t RX10_TEMP7 = RX10_TEMP6 + 1; 
for ( int32_t RX10_TEMP5= 0; RX10_TEMP5<  RX10_TEMP7; RX10_TEMP5++ )
 
{ 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP5 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP67 , RX10_TEMP9 ) ; 
const int32_t X10_TEMP71 = i .f0 ; 
const int32_t X10_TEMP73 = X10_TEMP71 + dx_off ; 
const double X10_TEMP75 = Linpack_read ( X10_TEMP0 , dx , dxk , X10_TEMP73 ) ; 
/*UpdatableVariableDeclaration*/
double dtemp = Linpack_myabs ( X10_TEMP0 , X10_TEMP75 ) ; 
const uint32_t X10_TEMP78 = dtemp > dmax ; 
if ( X10_TEMP78 ) 
{ 
const int32_t X10_TEMP81 = i .f0 ; 
itemp = X10_TEMP81 ; dmax = dtemp ; } 

} 

return itemp ; 
} 

double /*static*/Linpack_epslon (  struct Linpack  * const X10_TEMP0 , const double x ) 
{ 
const double X10_TEMP1 = 4.0e0; 
const double X10_TEMP2 = 3.0e0; 
const double a = X10_TEMP1 / X10_TEMP2 ; 
/*UpdatableVariableDeclaration*/
double eps = 0 ; 
const int32_t X10_TEMP5 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP9 = eps == X10_TEMP5 ; 

while ( X10_TEMP9 ) 
{ 
const double X10_TEMP10 = 1.0; 
/*UpdatableVariableDeclaration*/
double b = a - X10_TEMP10 ; 
const double X10_TEMP12 = b + b ; 
/*UpdatableVariableDeclaration*/
double c = X10_TEMP12 + b ; 
const double X10_TEMP14 = 1.0; 
const double X10_TEMP16 = c - X10_TEMP14 ; 
const double X10_TEMP18 = Linpack_myabs ( X10_TEMP0 , X10_TEMP16 ) ; 
eps = X10_TEMP18 ; const int32_t X10_TEMP7 = 0 ; 
X10_TEMP9 = eps == X10_TEMP7 ; } 

const double X10_TEMP20 = Linpack_myabs ( X10_TEMP0 , x ) ; 
const double X10_TEMP22 = eps * X10_TEMP20 ; 
return X10_TEMP22 ; 
} 

void /*static*/Linpack_dmxpy (  struct Linpack  * const X10_TEMP0 , const int32_t n1 ,  struct doubleRefArray2 const y , const int32_t n2 , const int32_t ldm ,  struct doubleRefArray2 const x ,  struct doubleRefArray2 const m ) 
{ 
const int32_t X10_TEMP4 = 0 ; 
const int32_t X10_TEMP2 = 1 ; 
const int32_t X10_TEMP5 = n2 - X10_TEMP2 ; 
const int32_t X10_TEMP9 = 0 ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP10 = n1 - X10_TEMP7 ; 
struct Region2 X10_TEMP12 = createNewRegion2RR ( X10_TEMP4 , X10_TEMP5 , X10_TEMP9 , X10_TEMP10 ) ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = X10_TEMP12 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point2 RX10_TEMP1 = regionOrdinalPoint2 ( X10_TEMP12 , RX10_TEMP5 ) ; 
const int32_t j = RX10_TEMP1 .f0 ; 
const int32_t i = RX10_TEMP1 .f1 ; 
const int32_t X10_TEMP15 = 0 ; 
const int32_t X10_TEMP18 = 0 ; 
struct Point2 RX10_TEMP6  ; 
Point2_Point2( &RX10_TEMP6/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP18 , i ) ; 
struct Dist2 RX10_TEMP7 = y .distValue ; 
struct Region2 RX10_TEMP8 = RX10_TEMP7 .dReg ; 
const int32_t RX10_TEMP9 = searchPointInRegion2 ( RX10_TEMP8 , RX10_TEMP6 ) ; 
const int32_t RX10_TEMP10 = 0 ; 
const uint32_t RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP12 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP13 = getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const place_t RX10_TEMP15 = /* here  */ _here(); 
const uint32_t RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Bad place access for array y" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP17 = getRefArrayValue2double ( y , RX10_TEMP9 ) ; 
const double X10_TEMP29 = RX10_TEMP17 ; 
const int32_t X10_TEMP21 = 0 ; 
struct Point2 RX10_TEMP18  ; 
Point2_Point2( &RX10_TEMP18/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP21 , j ) ; 
struct Dist2 RX10_TEMP19 = x .distValue ; 
struct Region2 RX10_TEMP20 = RX10_TEMP19 .dReg ; 
const int32_t RX10_TEMP21 = searchPointInRegion2 ( RX10_TEMP20 , RX10_TEMP18 ) ; 
const int32_t RX10_TEMP22 = 0 ; 
const uint32_t RX10_TEMP23 = RX10_TEMP21 < RX10_TEMP22 ; 
if ( RX10_TEMP23 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP24 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP24 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP25 = getPlaceFromDist2 ( RX10_TEMP19 , RX10_TEMP21 ) ; 
const place_t RX10_TEMP27 = /* here  */ _here(); 
const uint32_t RX10_TEMP28 = RX10_TEMP25 != RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Bad place access for array x" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP29 = getRefArrayValue2double ( x , RX10_TEMP21 ) ; 
const double X10_TEMP25 = RX10_TEMP29 ; 
const double X10_TEMP26 = Linpack_read ( X10_TEMP0 , m , j , i ) ; 
const double X10_TEMP28 = X10_TEMP25 * X10_TEMP26 ; 
const double X10_TEMP31 = X10_TEMP29 + X10_TEMP28 ; 
const double X10_TEMP32 = X10_TEMP31 ; 
struct Point2 RX10_TEMP30  ; 
Point2_Point2( &RX10_TEMP30/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP15 , i ) ; 
struct Dist2 RX10_TEMP31 = y .distValue ; 
struct Region2 RX10_TEMP32 = RX10_TEMP31 .dReg ; 
const int32_t RX10_TEMP33 = searchPointInRegion2 ( RX10_TEMP32 , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP34 = 0 ; 
const uint32_t RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; 
if ( RX10_TEMP35 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP36 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP36 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP37 = getPlaceFromDist2 ( RX10_TEMP31 , RX10_TEMP33 ) ; 
const place_t RX10_TEMP39 = /* here  */ _here(); 
const uint32_t RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Bad place access for array y" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( y , RX10_TEMP33 , X10_TEMP32 ) ; 
} 

} 

void /*static*/runMain ( ) 
{ 
/*UpdatableVariableDeclaration*/
 struct Timer  * tmr = (struct Timer  *) ((((_task*)_thread_getspecific()) -> total_memory_class) += 4*ceil(0.25 *(  sizeof(struct Timer ))),malloc(sizeof(struct Timer )));  
memset(tmr,0,sizeof(struct Timer )); 
Timer_Timer( tmr/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/
int32_t count = 0 ; 
/* finish  */ task_start_finish();

{ 
Timer_start ( tmr , count ) ; 
} 
task_end_finish();
/*END OF FINISH*/
/* finish  */ task_start_finish();

{ 
struct Linpack * X10_TEMP4 = (struct Linpack  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Linpack ))),malloc(sizeof(struct Linpack )));  
memset(X10_TEMP4,0,sizeof(struct Linpack )); 
Linpack_Linpack( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
Linpack_run ( X10_TEMP4 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for linpack: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC5, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC5;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC6, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC6;; 
fprintf(  stdout, "%s\n",X10_TEMP12 ) ; 
} 

int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t dim0 = r .dim0 ; 
const int32_t low0 = r .low0 ; 
const int32_t high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/
int32_t pt0 = target .f0 ; 
const uint32_t lbound0 = pt0 < low0 ; 
const uint32_t hbound0 = pt0 >= high0 ; 
const int32_t dim1 = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t outRegion = 0 ; 
outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t notFound = 0 ; 
notFound = notFound - one ; return notFound ; 
} 

const int32_t stride1 = 1 ; 
const int32_t stride0 = stride1 * dim1 ; 
pt0 = pt0 - low0 ; const int32_t offset0 = stride0 * pt0 ; 
/*UpdatableVariableDeclaration*/
int32_t found = 0 ; 
found = found + offset0 ; return found ; 
} 

void /*static*/setRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index , const double val ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist2 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
} 

int32_t /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t dim0 = r .dim0 ; 
const int32_t low0 = r .low0 ; 
const int32_t high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/
int32_t pt0 = target .f0 ; 
const uint32_t lbound0 = pt0 < low0 ; 
const uint32_t hbound0 = pt0 >= high0 ; 
const int32_t dim1 = r .dim1 ; 
const int32_t low1 = r .low1 ; 
const int32_t high1 = low1 + dim1 ; 
/*UpdatableVariableDeclaration*/
int32_t pt1 = target .f1 ; 
const uint32_t lbound1 = pt1 < low1 ; 
const uint32_t hbound1 = pt1 >= high1 ; 
const int32_t dim2 = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t outRegion = 0 ; 
outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion || hbound1 ; if ( outRegion ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t notFound = 0 ; 
notFound = notFound - one ; return notFound ; 
} 

const int32_t stride2 = 1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t stride0 = stride1 * dim1 ; 
pt0 = pt0 - low0 ; const int32_t offset0 = stride0 * pt0 ; 
pt1 = pt1 - low1 ; const int32_t offset1 = stride1 * pt1 ; 
/*UpdatableVariableDeclaration*/
int32_t found = 0 ; 
found = found + offset0 ; found = found + offset1 ; return found ; 
} 

int32_t /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point2 * const pointArray = (/*VALUE ARRAY*/ struct Point2 * ) r .pointArray ; 
/*UpdatableVariableDeclaration*/
int32_t start = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t end = r .regSize ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/
int32_t result = zero - one ; 
/*UpdatableVariableDeclaration*/
uint32_t notDone = start <= end ; 

while ( notDone ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t mid = start + end ; 
mid = mid / two ; struct Point2 temp = pointArray [ mid ] 
; 
const int32_t pointCompare = comparePoint2 ( target , temp ) ; 
const uint32_t eq = pointCompare == zero ; 
const uint32_t lt = pointCompare == one ; 
if ( eq ) 
{ 
return mid ; 
} 
else 
{ 
if ( lt ) 
{ 
end = mid - one ; } 
else 
{ 
start = mid + one ; } 


} 


notDone = start <= end ; } 

return result ; 
} 

int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) r .pointArray ; 
/*UpdatableVariableDeclaration*/
int32_t start = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t end = r .regSize ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/
int32_t result = zero - one ; 
/*UpdatableVariableDeclaration*/
uint32_t notDone = start <= end ; 

while ( notDone ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t mid = start + end ; 
mid = mid / two ; struct Point1 temp = pointArray [ mid ] 
; 
const int32_t pointCompare = comparePoint1 ( target , temp ) ; 
const uint32_t eq = pointCompare == zero ; 
const uint32_t lt = pointCompare == one ; 
if ( eq ) 
{ 
return mid ; 
} 
else 
{ 
if ( lt ) 
{ 
end = mid - one ; } 
else 
{ 
start = mid + one ; } 


} 


notDone = start <= end ; } 

return result ; 
} 

void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
} 

place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const placeArray = d .placeArray ; 
const place_t retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

place_t /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int32_t index ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const placeArray = d .placeArray ; 
const place_t retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

int32_t /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int32_t index ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct intStub * const contents = array .contents ; 
struct intStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int32_t * const localArray = indexStub .localArray ; 
const int32_t returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t two = 2 ; 
/*UpdatableVariableDeclaration*/
int32_t point1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t point2 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t lt = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t gt = 0 ; 
point1 = pt1 .f0 ; point2 = pt2 .f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ 
return one ; 
} 

if ( gt ) 
{ 
return two ; 
} 

return zero ; 
} 

int32_t /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t two = 2 ; 
/*UpdatableVariableDeclaration*/
int32_t point1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t point2 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t lt = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t gt = 0 ; 
point1 = pt1 .f0 ; point2 = pt2 .f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ 
return one ; 
} 

if ( gt ) 
{ 
return two ; 
} 

point1 = pt1 .f1 ; point2 = pt2 .f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ 
return one ; 
} 

if ( gt ) 
{ 
return two ; 
} 

return zero ; 
} 

Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int32_t ordl ) 
{ 
const uint32_t regType = reg .regType ; 
if ( regType ) 
{ 
struct Point2 pt = regionOrdinalPointRegular2 ( reg , ordl ) ; 
return pt ; 
} 

struct Point2 pt = regionOrdinalPointArbitrary2 ( reg , ordl ) ; 
return pt ; 
} 

Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int32_t ordl ) 
{ 
const int32_t stride2 = 1 ; 
const int32_t dim2 = reg .dim1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t regLow2 = reg .low1 ; 
const int32_t dim1 = reg .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/
int32_t f2 = ordl / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/
int32_t f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
return pt ; 
} 

Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int32_t ordl ) 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point2 * const pointArray = reg .pointArray ; 
struct Point2 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) 
{ 
const uint32_t regType = reg .regType ; 
if ( regType ) 
{ 
struct Point1 pt = regionOrdinalPointRegular1 ( reg , ordl ) ; 
return pt ; 
} 

struct Point1 pt = regionOrdinalPointArbitrary1 ( reg , ordl ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) 
{ 
const int32_t stride1 = 1 ; 
const int32_t dim1 = reg .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/
int32_t f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, f1 ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point1 * const pointArray = reg .pointArray ; 
struct Point1 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int32_t index , const int32_t val ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct intStub * const contents = array .contents ; 
struct intStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int32_t * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
} 

double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist1 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
const double returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist2 /*static*/getBlockCyclicDist2 (  struct Region2 const r , const int32_t blockSize ) 
{ 
const int32_t N = r .regSize ; 
const int32_t one = 1 ; 
const place_t fPlace = /* place.FIRST_PLACE  */ _place_first(); 
const int32_t rSize = N - one ; 
const int32_t dReg = rSize + 1; 
const int32_t dDist = /*SimpleDistributionExpression*/ rSize +1; 
void * TEMPCALLOCPOINTER36;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER36 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER36)[0] = dDist, TEMPCALLOCPOINTER36 = ((int32_t * )TEMPCALLOCPOINTER36)+1, memset(TEMPCALLOCPOINTER36,0,dDist*sizeof(place_t ) ) ); 
getCyclic ( placeArray , N , fPlace , blockSize ) ; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER37;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER37)[0] = dReg, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < dReg; p++) 

{ 
const place_t tempPl = placeArray [ p ] 
; 
vPlaceArray[p] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , N ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist ) ; 
return retDist ; 
} 

void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t N = arraySize ; 
/*UpdatableVariableDeclaration*/
int32_t chunk = blockSize ; 
const uint32_t ifCond = blockSize > N ; 
if ( ifCond ) 
{ 
chunk = N ; } 

/*UpdatableVariableDeclaration*/
int32_t index = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t dSize = index + chunk ; 
dSize = dSize - one ; const int32_t pointReg = dSize + 1; 
for ( int32_t p= 0; p<  pointReg; p++ )
 
{ 
placeArray [ p ] = ( initPlace ) ; 
} 

index = index + chunk ; N = N - chunk ; /*UpdatableVariableDeclaration*/
place_t pl = /* initPlace . next ( )  */ _place_next(initPlace); 
/*UpdatableVariableDeclaration*/
uint32_t whileCond = N != zero ; 

while ( whileCond ) 
{ 
const uint32_t tailCond = chunk > N ; 
if ( tailCond ) 
{ 
dSize = index + N ; dSize = dSize - one ; const int32_t ub = N - one ; 
const int32_t pointReg1 = ub + 1; 
for ( int32_t p= 0; p<  pointReg1; p++ )
 
{ 
const int32_t tempPt = p+index ; 
placeArray [ tempPt ] = ( pl ) ; 
} 

N = 0 ; } 
else 
{ 
dSize = index + chunk ; dSize = dSize - one ; const int32_t ub = chunk - one ; 
const int32_t pointReg1 = ub + 1; 
for ( int32_t p= 0; p<  pointReg1; p++ )
 
{ 
const int32_t tempPt = p+index ; 
placeArray [ tempPt ] = ( pl ) ; 
} 

index = index + chunk ; N = N - chunk ; } 


pl = /* pl . next ( )  */ _place_next(pl); whileCond = N != zero ; } 

} 

int32_t /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int32_t placeIndex ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const counts = d .counts ; 
const int32_t localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const counts = d .counts ; 
const int32_t localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int32_t /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
const uint32_t regType = r .regType ; 
if ( regType ) 
{ 
const int32_t constantSearch = constantSearchRegion2 ( r , target ) ; 
return constantSearch ; 
} 

const int32_t binarySearch = binarySearchRegion2 ( r , target ) ; 
return binarySearch ; 
} 

int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
const uint32_t regType = r .regType ; 
if ( regType ) 
{ 
const int32_t constantSearch = constantSearchRegion1 ( r , target ) ; 
return constantSearch ; 
} 

const int32_t binarySearch = binarySearchRegion1 ( r , target ) ; 
return binarySearch ; 
} 

double /*static*/getRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index ) 
{ 
const place_t pl = /* here  */ _here(); 
const int32_t placeIndex = /* pl . id  */ pl; 
struct Dist2 dArray = array .distValue ; 
struct Dist dDist = dArray .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const runSum = dDist .runningSum ; 
const int32_t localIndex = runSum [ index ] 
; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct doubleStub * const contents = array .contents ; 
struct doubleStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub .localArray ; 
const double returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const place_t p ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER43;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER43 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER43)[0] = dReg, TEMPCALLOCPOINTER43 = ((int32_t * )TEMPCALLOCPOINTER43)+1, memset(TEMPCALLOCPOINTER43,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
vPlaceArray[pt] = p ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist ) ; 
return retDist ; 
} 

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER44;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER44 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER44)[0] = dReg, TEMPCALLOCPOINTER44 = ((int32_t * )TEMPCALLOCPOINTER44)+1, memset(TEMPCALLOCPOINTER44,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
vPlaceArray[pt] = p ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist ) ; 
return retDist ; 
} 

/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) 
{ 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER45;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER45 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER45)[0] = tempReg, TEMPCALLOCPOINTER45 = ((int32_t * )TEMPCALLOCPOINTER45)+1, memset(TEMPCALLOCPOINTER45,0,tempReg*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < tempReg; p++) 

{ 
const int32_t tempInt = tempArr [ p ] 
; 
vTemp[p] = tempInt ; 
} 
/*END OF ARRAY INIT*/return vTemp ; 
} 

Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t regType = 1 ; 
const uint32_t tempBool1 = 1 ; 
regType = regType && tempBool1 ; const int32_t l1 = v1_1 - v1_0 ; 
const int32_t dim1 = l1 + one ; 
const int32_t stride1 = 1 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t rSize = stride0 - one ; 
const uint32_t cond = stride0 <= zero ; 
if ( cond ) 
{ 
const int32_t minusOne = zero - one ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER46;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER46 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER46)[0] = regArr, TEMPCALLOCPOINTER46 = ((int32_t * )TEMPCALLOCPOINTER46)+1, memset(TEMPCALLOCPOINTER46,0,regArr*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region1 retRegEmpty  ; 
Region1_Region1_4( &retRegEmpty/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ 
const int32_t minusOne = zero - one ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER47;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER47 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER47)[0] = regArr, TEMPCALLOCPOINTER47 = ((int32_t * )TEMPCALLOCPOINTER47)+1, memset(TEMPCALLOCPOINTER47,0,regArr*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region1 retRegRegular  ; 
Region1_Region1_4( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , v1_0 , dim1 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int32_t regArr = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER48;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER48 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER48)[0] = regArr, TEMPCALLOCPOINTER48 = ((int32_t * )TEMPCALLOCPOINTER48)+1, memset(TEMPCALLOCPOINTER48,0,regArr*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; struct Point1 retPoint  ; 
Point1_Point1( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 ) ; 
ptArray[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/struct Region1 retReg  ; 
Region1_Region1_2( &retReg/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

Region2 /*static*/createNewRegion2RR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t regType = 1 ; 
const uint32_t tempBool1 = 1 ; 
const uint32_t tempBool2 = 1 ; 
regType = regType && tempBool1 ; regType = regType && tempBool2 ; const int32_t l1 = v1_1 - v1_0 ; 
const int32_t dim1 = l1 + one ; 
const int32_t l2 = v2_1 - v2_0 ; 
const int32_t dim2 = l2 + one ; 
const int32_t stride2 = 1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t rSize = stride0 - one ; 
const uint32_t cond = stride0 <= zero ; 
if ( cond ) 
{ 
const int32_t minusOne = zero - one ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER49;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER49)[0] = regArr, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,regArr*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region2 retRegEmpty  ; 
Region2_Region2_6( &retRegEmpty/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , zero , zero , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ 
const int32_t minusOne = zero - one ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER50;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER50)[0] = regArr, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,regArr*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region2 retRegRegular  ; 
Region2_Region2_6( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int32_t regArr = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER51;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER51)[0] = regArr, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,regArr*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; /*UpdatableVariableDeclaration*/
int32_t f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + v2_0 ; struct Point2 retPoint  ; 
Point2_Point2( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
ptArray[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/struct Region2 retReg  ; 
Region2_Region2_2( &retReg/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

void /*static*/thread1 (  struct T1 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER53;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP15 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER53 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER53)[0] = RX10_TEMP14, TEMPCALLOCPOINTER53 = ((int32_t * )TEMPCALLOCPOINTER53)+1, memset(TEMPCALLOCPOINTER53,0,RX10_TEMP14*sizeof(int32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const int32_t X10_TEMP2 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP2 ; 
} 
/*END OF ARRAY INIT*/struct intStub RX10_TEMP16  ; 
intStub_intStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T17 utmp17  ; 
T17_T17( &utmp17/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC13) ;
a.size = sizeof(utmp17 );
a.params = (void *)(&utmp17 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int32_t RX10_TEMP45 = utmpz .RX10_TEMP45 ; 
const place_t RX10_TEMP41 = utmpz .RX10_TEMP41 ; 
const int32_t RX10_TEMP40 = utmpz .RX10_TEMP40 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP39 = utmpz .RX10_TEMP39 ; 

{ 
const int32_t RX10_TEMP46 = /*SimpleDistributionExpression*/ RX10_TEMP45 +1; 
void * TEMPCALLOCPOINTER55;
/*Updatable ARRAY*/ double * const RX10_TEMP47 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER55 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER55)[0] = RX10_TEMP46, TEMPCALLOCPOINTER55 = ((int32_t * )TEMPCALLOCPOINTER55)+1, memset(TEMPCALLOCPOINTER55,0,RX10_TEMP46*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP48  ; 
doubleStub_doubleStub( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP47 ) ; 
struct T18 utmp18  ; 
T18_T18( &utmp18/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP48 , RX10_TEMP40 , RX10_TEMP39 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC14) ;
a.size = sizeof(utmp18 );
a.params = (void *)(&utmp18 );
task_dispatch(a, RX10_TEMP41 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
const int32_t RX10_TEMP65 = utmpz .RX10_TEMP65 ; 
const place_t RX10_TEMP61 = utmpz .RX10_TEMP61 ; 
const int32_t RX10_TEMP60 = utmpz .RX10_TEMP60 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP59 = utmpz .RX10_TEMP59 ; 

{ 
const int32_t RX10_TEMP66 = /*SimpleDistributionExpression*/ RX10_TEMP65 +1; 
void * TEMPCALLOCPOINTER57;
/*Updatable ARRAY*/ double * const RX10_TEMP67 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER57 = malloc(sizeof(int32_t)+(RX10_TEMP66*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP66*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER57)[0] = RX10_TEMP66, TEMPCALLOCPOINTER57 = ((int32_t * )TEMPCALLOCPOINTER57)+1, memset(TEMPCALLOCPOINTER57,0,RX10_TEMP66*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP68  ; 
doubleStub_doubleStub( &RX10_TEMP68/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP67 ) ; 
struct T19 utmp19  ; 
T19_T19( &utmp19/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP68 , RX10_TEMP60 , RX10_TEMP59 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC15) ;
a.size = sizeof(utmp19 );
a.params = (void *)(&utmp19 );
task_dispatch(a, RX10_TEMP61 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP85 = utmpz .RX10_TEMP85 ; 
const place_t RX10_TEMP81 = utmpz .RX10_TEMP81 ; 
const int32_t RX10_TEMP80 = utmpz .RX10_TEMP80 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP79 = utmpz .RX10_TEMP79 ; 

{ 
const int32_t RX10_TEMP86 = /*SimpleDistributionExpression*/ RX10_TEMP85 +1; 
void * TEMPCALLOCPOINTER59;
/*Updatable ARRAY*/ double * const RX10_TEMP87 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER59 = malloc(sizeof(int32_t)+(RX10_TEMP86*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP86*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER59)[0] = RX10_TEMP86, TEMPCALLOCPOINTER59 = ((int32_t * )TEMPCALLOCPOINTER59)+1, memset(TEMPCALLOCPOINTER59,0,RX10_TEMP86*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP88  ; 
doubleStub_doubleStub( &RX10_TEMP88/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP87 ) ; 
struct T20 utmp20  ; 
T20_T20( &utmp20/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP88 , RX10_TEMP80 , RX10_TEMP79 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC16) ;
a.size = sizeof(utmp20 );
a.params = (void *)(&utmp20 );
task_dispatch(a, RX10_TEMP81 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread5 (  struct T5 const utmpz ) 
{ 
const int32_t RX10_TEMP105 = utmpz .RX10_TEMP105 ; 
const place_t RX10_TEMP101 = utmpz .RX10_TEMP101 ; 
const int32_t RX10_TEMP100 = utmpz .RX10_TEMP100 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP99 = utmpz .RX10_TEMP99 ; 

{ 
const int32_t RX10_TEMP106 = /*SimpleDistributionExpression*/ RX10_TEMP105 +1; 
void * TEMPCALLOCPOINTER61;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP107 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER61 = malloc(sizeof(int32_t)+(RX10_TEMP106*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP106*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER61)[0] = RX10_TEMP106, TEMPCALLOCPOINTER61 = ((int32_t * )TEMPCALLOCPOINTER61)+1, memset(TEMPCALLOCPOINTER61,0,RX10_TEMP106*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP108  ; 
intStub_intStub( &RX10_TEMP108/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP107 ) ; 
struct T21 utmp21  ; 
T21_T21( &utmp21/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP108 , RX10_TEMP100 , RX10_TEMP99 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC17) ;
a.size = sizeof(utmp21 );
a.params = (void *)(&utmp21 );
task_dispatch(a, RX10_TEMP101 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread6 (  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER63;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER63 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER63)[0] = RX10_TEMP14, TEMPCALLOCPOINTER63 = ((int32_t * )TEMPCALLOCPOINTER63)+1, memset(TEMPCALLOCPOINTER63,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP4 = 0.0; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP4 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T22 utmp22  ; 
T22_T22( &utmp22/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC18) ;
a.size = sizeof(utmp22 );
a.params = (void *)(&utmp22 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread7 (  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER65;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER65 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER65)[0] = RX10_TEMP14, TEMPCALLOCPOINTER65 = ((int32_t * )TEMPCALLOCPOINTER65)+1, memset(TEMPCALLOCPOINTER65,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP10 = 0.0; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP10 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T23 utmp23  ; 
T23_T23( &utmp23/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC19) ;
a.size = sizeof(utmp23 );
a.params = (void *)(&utmp23 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread8 (  struct T8 const utmpz ) 
{ 
struct doubleRefArray1 tempref = utmpz .tempref ; 
const place_t curr_place = utmpz .curr_place ; 
const int32_t j = utmpz .j ; 
const int32_t i = utmpz .i ; 
struct doubleRefArray2 a = utmpz .a ; 

{ 
struct Point2 RX10_TEMP29  ; 
Point2_Point2( &RX10_TEMP29/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP30 = a .distValue ; 
struct Region2 RX10_TEMP31 = RX10_TEMP30 .dReg ; 
const int32_t RX10_TEMP32 = searchPointInRegion2 ( RX10_TEMP31 , RX10_TEMP29 ) ; 
const int32_t RX10_TEMP33 = 0 ; 
const uint32_t RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33 ; 
if ( RX10_TEMP34 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP35 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP35 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP36 = getPlaceFromDist2 ( RX10_TEMP30 , RX10_TEMP32 ) ; 
const place_t RX10_TEMP38 = /* here  */ _here(); 
const uint32_t RX10_TEMP39 = RX10_TEMP36 != RX10_TEMP38 ; 
if ( RX10_TEMP39 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP40 = getRefArrayValue2double ( a , RX10_TEMP32 ) ; 
const double temp = RX10_TEMP40 ; 
struct T24 utmp24  ; 
T24_T24( &utmp24/*OBJECT INIT IN ASSIGNMENT*/, temp , tempref ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC20) ;
a.size = sizeof(utmp24 );
a.params = (void *)(&utmp24 );
task_dispatch(a, curr_place );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
const double val = utmpz .val ; 
struct Point2 p = utmpz .p ; 
struct doubleRefArray2 a = utmpz .a ; 

{ 
const double X10_TEMP7 = val ; 
struct Dist2 RX10_TEMP7 = a .distValue ; 
struct Region2 RX10_TEMP8 = RX10_TEMP7 .dReg ; 
const int32_t RX10_TEMP9 = searchPointInRegion2 ( RX10_TEMP8 , p ) ; 
const int32_t RX10_TEMP10 = 0 ; 
const uint32_t RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP12 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP13 = getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const place_t RX10_TEMP15 = /* here  */ _here(); 
const uint32_t RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP9 , X10_TEMP7 ) ; 
} 
} 

void /*static*/thread10 (  struct T10 const utmpz ) 
{ 
const double val = utmpz .val ; 
const int32_t j = utmpz .j ; 
const int32_t i = utmpz .i ; 
struct doubleRefArray2 a = utmpz .a ; 

{ 
struct Point2 RX10_TEMP8  ; 
Point2_Point2( &RX10_TEMP8/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP9 = a .distValue ; 
struct Region2 RX10_TEMP10 = RX10_TEMP9 .dReg ; 
const int32_t RX10_TEMP11 = searchPointInRegion2 ( RX10_TEMP10 , RX10_TEMP8 ) ; 
const int32_t RX10_TEMP12 = 0 ; 
const uint32_t RX10_TEMP13 = RX10_TEMP11 < RX10_TEMP12 ; 
if ( RX10_TEMP13 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP15 = getPlaceFromDist2 ( RX10_TEMP9 , RX10_TEMP11 ) ; 
const place_t RX10_TEMP17 = /* here  */ _here(); 
const uint32_t RX10_TEMP18 = RX10_TEMP15 != RX10_TEMP17 ; 
if ( RX10_TEMP18 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP16 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP16 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP19 = getRefArrayValue2double ( a , RX10_TEMP11 ) ; 
const double X10_TEMP10 = RX10_TEMP19 ; 
const double X10_TEMP12 = X10_TEMP10 + val ; 
const double X10_TEMP13 = X10_TEMP12 ; 
struct Point2 RX10_TEMP20  ; 
Point2_Point2( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP21 = a .distValue ; 
struct Region2 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion2 ( RX10_TEMP22 , RX10_TEMP20 ) ; 
const int32_t RX10_TEMP24 = 0 ; 
const uint32_t RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; 
if ( RX10_TEMP25 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP27 = getPlaceFromDist2 ( RX10_TEMP21 , RX10_TEMP23 ) ; 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const uint32_t RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP23 , X10_TEMP13 ) ; 
} 
} 

void /*static*/thread11 (  struct T11 const utmpz ) 
{ 
struct Point2 p = utmpz .p ; 
struct doubleRefArray2 b = utmpz .b ; 

{ 
const double X10_TEMP27 = 0.0; 
const double X10_TEMP28 = X10_TEMP27 ; 
struct Dist2 RX10_TEMP21 = b .distValue ; 
struct Region2 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion2 ( RX10_TEMP22 , p ) ; 
const int32_t RX10_TEMP24 = 0 ; 
const uint32_t RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; 
if ( RX10_TEMP25 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP27 = getPlaceFromDist2 ( RX10_TEMP21 , RX10_TEMP23 ) ; 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const uint32_t RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Bad place access for array b" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( b , RX10_TEMP23 , X10_TEMP28 ) ; 
} 
} 

void /*static*/thread12 (  struct T12 const utmpz ) 
{ 
const int32_t j = utmpz .j ; 
const int32_t i = utmpz .i ; 
struct doubleRefArray2 b = utmpz .b ; 
struct doubleRefArray2 a = utmpz .a ; 
struct Linpack * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
const int32_t X10_TEMP52 = 0 ; 
struct Point2 RX10_TEMP45  ; 
Point2_Point2( &RX10_TEMP45/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP46 = a .distValue ; 
struct Region2 RX10_TEMP47 = RX10_TEMP46 .dReg ; 
const int32_t RX10_TEMP48 = searchPointInRegion2 ( RX10_TEMP47 , RX10_TEMP45 ) ; 
const int32_t RX10_TEMP49 = 0 ; 
const uint32_t RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; 
if ( RX10_TEMP50 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP51 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP52 = getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 ) ; 
const place_t RX10_TEMP54 = /* here  */ _here(); 
const uint32_t RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; 
if ( RX10_TEMP55 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP53 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP56 = getRefArrayValue2double ( a , RX10_TEMP48 ) ; 
const double X10_TEMP53 = RX10_TEMP56 ; 
Linpack_plusWrite ( X10_TEMP0 , b , X10_TEMP52 , j , X10_TEMP53 ) ; 
} 
} 

void /*static*/thread13 (  struct T13 const utmpz ) 
{ 
const int32_t l = utmpz .l ; 
const int32_t k = utmpz .k ; 
const int32_t n = utmpz .n ; 
struct doubleRefArray2 a = utmpz .a ; 
struct Linpack * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
const int32_t X10_TEMP36 = 1 ; 
const int32_t kp1 = k + X10_TEMP36 ; 
struct Point2 RX10_TEMP26  ; 
Point2_Point2( &RX10_TEMP26/*OBJECT INIT IN ASSIGNMENT*/, k , l ) ; 
struct Dist2 RX10_TEMP27 = a .distValue ; 
struct Region2 RX10_TEMP28 = RX10_TEMP27 .dReg ; 
const int32_t RX10_TEMP29 = searchPointInRegion2 ( RX10_TEMP28 , RX10_TEMP26 ) ; 
const int32_t RX10_TEMP30 = 0 ; 
const uint32_t RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; 
if ( RX10_TEMP31 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP32 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP32 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP33 = getPlaceFromDist2 ( RX10_TEMP27 , RX10_TEMP29 ) ; 
const place_t RX10_TEMP35 = /* here  */ _here(); 
const uint32_t RX10_TEMP36 = RX10_TEMP33 != RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP34 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP37 = getRefArrayValue2double ( a , RX10_TEMP29 ) ; 
const double X10_TEMP40 = RX10_TEMP37 ; 
const int32_t X10_TEMP41 = 0 ; 
const uint32_t X10_TEMP43 = X10_TEMP40 != X10_TEMP41 ; 
if ( X10_TEMP43 ) 
{ 
const uint32_t X10_TEMP45 = l != k ; 
if ( X10_TEMP45 ) 
{ 
const uint32_t X10_TEMP47 = l != k ; 
if ( X10_TEMP47 ) 
{ 
struct Point2 RX10_TEMP38  ; 
Point2_Point2( &RX10_TEMP38/*OBJECT INIT IN ASSIGNMENT*/, k , l ) ; 
struct Dist2 RX10_TEMP39 = a .distValue ; 
struct Region2 RX10_TEMP40 = RX10_TEMP39 .dReg ; 
const int32_t RX10_TEMP41 = searchPointInRegion2 ( RX10_TEMP40 , RX10_TEMP38 ) ; 
const int32_t RX10_TEMP42 = 0 ; 
const uint32_t RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; 
if ( RX10_TEMP43 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP44 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP44 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP45 = getPlaceFromDist2 ( RX10_TEMP39 , RX10_TEMP41 ) ; 
const place_t RX10_TEMP47 = /* here  */ _here(); 
const uint32_t RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; 
if ( RX10_TEMP48 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP46 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP46 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP49 = getRefArrayValue2double ( a , RX10_TEMP41 ) ; 
/*UpdatableVariableDeclaration*/
double t = RX10_TEMP49 ; 
struct Point2 RX10_TEMP50  ; 
Point2_Point2( &RX10_TEMP50/*OBJECT INIT IN ASSIGNMENT*/, k , k ) ; 
struct Dist2 RX10_TEMP51 = a .distValue ; 
struct Region2 RX10_TEMP52 = RX10_TEMP51 .dReg ; 
const int32_t RX10_TEMP53 = searchPointInRegion2 ( RX10_TEMP52 , RX10_TEMP50 ) ; 
const int32_t RX10_TEMP54 = 0 ; 
const uint32_t RX10_TEMP55 = RX10_TEMP53 < RX10_TEMP54 ; 
if ( RX10_TEMP55 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP56 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP56 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP57 = getPlaceFromDist2 ( RX10_TEMP51 , RX10_TEMP53 ) ; 
const place_t RX10_TEMP59 = /* here  */ _here(); 
const uint32_t RX10_TEMP60 = RX10_TEMP57 != RX10_TEMP59 ; 
if ( RX10_TEMP60 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP58 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP58 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP61 = getRefArrayValue2double ( a , RX10_TEMP53 ) ; 
const double X10_TEMP56 = RX10_TEMP61 ; 
const double X10_TEMP57 = X10_TEMP56 ; 
struct Point2 RX10_TEMP62  ; 
Point2_Point2( &RX10_TEMP62/*OBJECT INIT IN ASSIGNMENT*/, k , l ) ; 
struct Dist2 RX10_TEMP63 = a .distValue ; 
struct Region2 RX10_TEMP64 = RX10_TEMP63 .dReg ; 
const int32_t RX10_TEMP65 = searchPointInRegion2 ( RX10_TEMP64 , RX10_TEMP62 ) ; 
const int32_t RX10_TEMP66 = 0 ; 
const uint32_t RX10_TEMP67 = RX10_TEMP65 < RX10_TEMP66 ; 
if ( RX10_TEMP67 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP68 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP68 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP69 = getPlaceFromDist2 ( RX10_TEMP63 , RX10_TEMP65 ) ; 
const place_t RX10_TEMP71 = /* here  */ _here(); 
const uint32_t RX10_TEMP72 = RX10_TEMP69 != RX10_TEMP71 ; 
if ( RX10_TEMP72 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP70 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP70 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP65 , X10_TEMP57 ) ; 
const double X10_TEMP61 = t ; 
struct Point2 RX10_TEMP73  ; 
Point2_Point2( &RX10_TEMP73/*OBJECT INIT IN ASSIGNMENT*/, k , k ) ; 
struct Dist2 RX10_TEMP74 = a .distValue ; 
struct Region2 RX10_TEMP75 = RX10_TEMP74 .dReg ; 
const int32_t RX10_TEMP76 = searchPointInRegion2 ( RX10_TEMP75 , RX10_TEMP73 ) ; 
const int32_t RX10_TEMP77 = 0 ; 
const uint32_t RX10_TEMP78 = RX10_TEMP76 < RX10_TEMP77 ; 
if ( RX10_TEMP78 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP79 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP79 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP80 = getPlaceFromDist2 ( RX10_TEMP74 , RX10_TEMP76 ) ; 
const place_t RX10_TEMP82 = /* here  */ _here(); 
const uint32_t RX10_TEMP83 = RX10_TEMP80 != RX10_TEMP82 ; 
if ( RX10_TEMP83 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP81 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP81 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP76 , X10_TEMP61 ) ; 
} 

} 

const double X10_TEMP62 = 1.0; 
const int32_t X10_TEMP63 = 0 ; 
const double X10_TEMP66 = X10_TEMP63 - X10_TEMP62 ; 
struct Point2 RX10_TEMP84  ; 
Point2_Point2( &RX10_TEMP84/*OBJECT INIT IN ASSIGNMENT*/, k , k ) ; 
struct Dist2 RX10_TEMP85 = a .distValue ; 
struct Region2 RX10_TEMP86 = RX10_TEMP85 .dReg ; 
const int32_t RX10_TEMP87 = searchPointInRegion2 ( RX10_TEMP86 , RX10_TEMP84 ) ; 
const int32_t RX10_TEMP88 = 0 ; 
const uint32_t RX10_TEMP89 = RX10_TEMP87 < RX10_TEMP88 ; 
if ( RX10_TEMP89 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP90 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP90 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP91 = getPlaceFromDist2 ( RX10_TEMP85 , RX10_TEMP87 ) ; 
const place_t RX10_TEMP93 = /* here  */ _here(); 
const uint32_t RX10_TEMP94 = RX10_TEMP91 != RX10_TEMP93 ; 
if ( RX10_TEMP94 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP92 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP92 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP95 = getRefArrayValue2double ( a , RX10_TEMP87 ) ; 
const double X10_TEMP67 = RX10_TEMP95 ; 
const double tx = X10_TEMP66 / X10_TEMP67 ; 
const int32_t X10_TEMP70 = kp1 ; 
const int32_t X10_TEMP77 = n - X10_TEMP70 ; 
const int32_t X10_TEMP78 = 1 ; 
Linpack_dscal ( X10_TEMP0 , X10_TEMP77 , tx , a , k , kp1 , X10_TEMP78 ) ; 
/* finish  */ task_start_finish();

{ 
const int32_t X10_TEMP80 = 1 ; 
const int32_t X10_TEMP82 = n - X10_TEMP80 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 temprkp1 = createNewRegion1R ( kp1 , X10_TEMP82 ) ; 
const place_t X10_TEMP84 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 temprkp1Dist = getPlaceDist1 ( temprkp1 , X10_TEMP84 ) ; 
struct Region1 RX10_TEMP98 = temprkp1Dist .dReg ; 
const int32_t RX10_TEMP101 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP99 = RX10_TEMP98 .regSize ; 
RX10_TEMP99 = RX10_TEMP99 - RX10_TEMP101 ;; const int32_t RX10_TEMP100 = RX10_TEMP99 + 1; 
for ( int32_t RX10_TEMP96= 0; RX10_TEMP96<  RX10_TEMP100; RX10_TEMP96++ )
 
{ 
const int32_t RX10_TEMP102 = /*PointAccess*/RX10_TEMP96 ; 
struct Point1 RX10_TEMP97 = regionOrdinalPoint1 ( RX10_TEMP98 , RX10_TEMP102 ) ; 
const int32_t j = RX10_TEMP97 .f0 ; 
struct Dist2 RX10_TEMP103 = a .distValue ; 
struct Dist2 X10_TEMP87 = RX10_TEMP103 ; 
struct Point2 RX10_TEMP104  ; 
Point2_Point2( &RX10_TEMP104/*OBJECT INIT IN ASSIGNMENT*/, j , l ) ; 
struct Region2 RX10_TEMP105 = X10_TEMP87 .dReg ; 
const int32_t RX10_TEMP106 = searchPointInRegion2 ( RX10_TEMP105 , RX10_TEMP104 ) ; 
const int32_t RX10_TEMP107 = 0 ; 
const uint32_t RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107 ; 
if ( RX10_TEMP108 ) 
{ 
const char * RX10_TEMP109 = "Point RX10_TEMP104 not found in the distribution X10_TEMP87." ; 
fprintf(stderr, "%s",RX10_TEMP109 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP110 = getPlaceFromDist2 ( X10_TEMP87 , RX10_TEMP106 ) ; 
const place_t X10_TEMP91 = RX10_TEMP110 ; 
struct T25 utmp25  ; 
T25_T25( &utmp25/*OBJECT INIT IN ASSIGNMENT*/, j , kp1 , l , k , n , a , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC21) ;
a.size = sizeof(utmp25 );
a.params = (void *)(&utmp25 );
task_dispatch(a, X10_TEMP91 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 
else 
{ 
const int32_t X10_TEMP124 = k ; 
X10_TEMP0 ->infodgefa = ( X10_TEMP124 ) ; 
} 


} 
} 

void /*static*/thread17 (  struct T17 const utmpz ) 
{ 
struct intStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread18 (  struct T18 const utmpz ) 
{ 
struct doubleStub RX10_TEMP48 = utmpz .RX10_TEMP48 ; 
const int32_t RX10_TEMP40 = utmpz .RX10_TEMP40 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP39 = utmpz .RX10_TEMP39 ; 

{ 
RX10_TEMP39 [ RX10_TEMP40 ] = ( RX10_TEMP48 ) ; 
} 
} 

void /*static*/thread19 (  struct T19 const utmpz ) 
{ 
struct doubleStub RX10_TEMP68 = utmpz .RX10_TEMP68 ; 
const int32_t RX10_TEMP60 = utmpz .RX10_TEMP60 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP59 = utmpz .RX10_TEMP59 ; 

{ 
RX10_TEMP59 [ RX10_TEMP60 ] = ( RX10_TEMP68 ) ; 
} 
} 

void /*static*/thread20 (  struct T20 const utmpz ) 
{ 
struct doubleStub RX10_TEMP88 = utmpz .RX10_TEMP88 ; 
const int32_t RX10_TEMP80 = utmpz .RX10_TEMP80 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP79 = utmpz .RX10_TEMP79 ; 

{ 
RX10_TEMP79 [ RX10_TEMP80 ] = ( RX10_TEMP88 ) ; 
} 
} 

void /*static*/thread21 (  struct T21 const utmpz ) 
{ 
struct intStub RX10_TEMP108 = utmpz .RX10_TEMP108 ; 
const int32_t RX10_TEMP100 = utmpz .RX10_TEMP100 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP99 = utmpz .RX10_TEMP99 ; 

{ 
RX10_TEMP99 [ RX10_TEMP100 ] = ( RX10_TEMP108 ) ; 
} 
} 

void /*static*/thread22 (  struct T22 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread23 (  struct T23 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread24 (  struct T24 const utmpz ) 
{ 
const double temp = utmpz .temp ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 

{ 
const int32_t X10_TEMP22 = 0 ; 
const double X10_TEMP24 = temp ; 
struct Point1 RX10_TEMP41  ; 
Point1_Point1( &RX10_TEMP41/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP22 ) ; 
struct Dist1 RX10_TEMP42 = tempref .distValue ; 
struct Region1 RX10_TEMP43 = RX10_TEMP42 .dReg ; 
const int32_t RX10_TEMP44 = searchPointInRegion1 ( RX10_TEMP43 , RX10_TEMP41 ) ; 
const int32_t RX10_TEMP45 = 0 ; 
const uint32_t RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; 
if ( RX10_TEMP46 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP47 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP48 = getPlaceFromDist1 ( RX10_TEMP42 , RX10_TEMP44 ) ; 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const uint32_t RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP49 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP49 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( tempref , RX10_TEMP44 , X10_TEMP24 ) ; 
} 
} 

void /*static*/thread25 (  struct T25 const utmpz ) 
{ 
const int32_t j = utmpz .j ; 
const int32_t kp1 = utmpz .kp1 ; 
const int32_t l = utmpz .l ; 
const int32_t k = utmpz .k ; 
const int32_t n = utmpz .n ; 
struct doubleRefArray2 a = utmpz .a ; 
struct Linpack * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
struct Point2 RX10_TEMP111  ; 
Point2_Point2( &RX10_TEMP111/*OBJECT INIT IN ASSIGNMENT*/, j , l ) ; 
struct Dist2 RX10_TEMP112 = a .distValue ; 
struct Region2 RX10_TEMP113 = RX10_TEMP112 .dReg ; 
const int32_t RX10_TEMP114 = searchPointInRegion2 ( RX10_TEMP113 , RX10_TEMP111 ) ; 
const int32_t RX10_TEMP115 = 0 ; 
const uint32_t RX10_TEMP116 = RX10_TEMP114 < RX10_TEMP115 ; 
if ( RX10_TEMP116 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP117 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP117 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP118 = getPlaceFromDist2 ( RX10_TEMP112 , RX10_TEMP114 ) ; 
const place_t RX10_TEMP120 = /* here  */ _here(); 
const uint32_t RX10_TEMP121 = RX10_TEMP118 != RX10_TEMP120 ; 
if ( RX10_TEMP121 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP119 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP119 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP122 = getRefArrayValue2double ( a , RX10_TEMP114 ) ; 
/*UpdatableVariableDeclaration*/
double t = RX10_TEMP122 ; 
const uint32_t X10_TEMP96 = l != k ; 
if ( X10_TEMP96 ) 
{ 
struct Point2 RX10_TEMP123  ; 
Point2_Point2( &RX10_TEMP123/*OBJECT INIT IN ASSIGNMENT*/, j , k ) ; 
struct Dist2 RX10_TEMP124 = a .distValue ; 
struct Region2 RX10_TEMP125 = RX10_TEMP124 .dReg ; 
const int32_t RX10_TEMP126 = searchPointInRegion2 ( RX10_TEMP125 , RX10_TEMP123 ) ; 
const int32_t RX10_TEMP127 = 0 ; 
const uint32_t RX10_TEMP128 = RX10_TEMP126 < RX10_TEMP127 ; 
if ( RX10_TEMP128 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP129 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP129 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP130 = getPlaceFromDist2 ( RX10_TEMP124 , RX10_TEMP126 ) ; 
const place_t RX10_TEMP132 = /* here  */ _here(); 
const uint32_t RX10_TEMP133 = RX10_TEMP130 != RX10_TEMP132 ; 
if ( RX10_TEMP133 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP131 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP131 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP134 = getRefArrayValue2double ( a , RX10_TEMP126 ) ; 
const double X10_TEMP102 = RX10_TEMP134 ; 
const double X10_TEMP103 = X10_TEMP102 ; 
struct Point2 RX10_TEMP135  ; 
Point2_Point2( &RX10_TEMP135/*OBJECT INIT IN ASSIGNMENT*/, j , l ) ; 
struct Dist2 RX10_TEMP136 = a .distValue ; 
struct Region2 RX10_TEMP137 = RX10_TEMP136 .dReg ; 
const int32_t RX10_TEMP138 = searchPointInRegion2 ( RX10_TEMP137 , RX10_TEMP135 ) ; 
const int32_t RX10_TEMP139 = 0 ; 
const uint32_t RX10_TEMP140 = RX10_TEMP138 < RX10_TEMP139 ; 
if ( RX10_TEMP140 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP141 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP141 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP142 = getPlaceFromDist2 ( RX10_TEMP136 , RX10_TEMP138 ) ; 
const place_t RX10_TEMP144 = /* here  */ _here(); 
const uint32_t RX10_TEMP145 = RX10_TEMP142 != RX10_TEMP144 ; 
if ( RX10_TEMP145 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP143 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP143 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP138 , X10_TEMP103 ) ; 
const double X10_TEMP107 = t ; 
struct Point2 RX10_TEMP146  ; 
Point2_Point2( &RX10_TEMP146/*OBJECT INIT IN ASSIGNMENT*/, j , k ) ; 
struct Dist2 RX10_TEMP147 = a .distValue ; 
struct Region2 RX10_TEMP148 = RX10_TEMP147 .dReg ; 
const int32_t RX10_TEMP149 = searchPointInRegion2 ( RX10_TEMP148 , RX10_TEMP146 ) ; 
const int32_t RX10_TEMP150 = 0 ; 
const uint32_t RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150 ; 
if ( RX10_TEMP151 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP152 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP152 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP153 = getPlaceFromDist2 ( RX10_TEMP147 , RX10_TEMP149 ) ; 
const place_t RX10_TEMP155 = /* here  */ _here(); 
const uint32_t RX10_TEMP156 = RX10_TEMP153 != RX10_TEMP155 ; 
if ( RX10_TEMP156 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP154 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP154 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( a , RX10_TEMP149 , X10_TEMP107 ) ; 
} 

const int32_t X10_TEMP109 = kp1 ; 
const int32_t X10_TEMP120 = n - X10_TEMP109 ; 
const int32_t X10_TEMP121 = 1 ; 
const int32_t X10_TEMP122 = 1 ; 
Linpack_daxpy ( X10_TEMP0 , X10_TEMP120 , t , a , k , kp1 , X10_TEMP121 , a , j , kp1 , X10_TEMP122 ) ; 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T1THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T1THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T1THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T1THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP45 , const place_t a_RX10_TEMP41 , const int32_t a_RX10_TEMP40 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP39 ) 
{ 
T2THIS->RX10_TEMP45 = ( a_RX10_TEMP45 ) ; 
T2THIS->RX10_TEMP41 = ( a_RX10_TEMP41 ) ; 
T2THIS->RX10_TEMP40 = ( a_RX10_TEMP40 ) ; 
T2THIS->RX10_TEMP39 = ( a_RX10_TEMP39 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP65 , const place_t a_RX10_TEMP61 , const int32_t a_RX10_TEMP60 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP59 ) 
{ 
T3THIS->RX10_TEMP65 = ( a_RX10_TEMP65 ) ; 
T3THIS->RX10_TEMP61 = ( a_RX10_TEMP61 ) ; 
T3THIS->RX10_TEMP60 = ( a_RX10_TEMP60 ) ; 
T3THIS->RX10_TEMP59 = ( a_RX10_TEMP59 ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP85 , const place_t a_RX10_TEMP81 , const int32_t a_RX10_TEMP80 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP79 ) 
{ 
T4THIS->RX10_TEMP85 = ( a_RX10_TEMP85 ) ; 
T4THIS->RX10_TEMP81 = ( a_RX10_TEMP81 ) ; 
T4THIS->RX10_TEMP80 = ( a_RX10_TEMP80 ) ; 
T4THIS->RX10_TEMP79 = ( a_RX10_TEMP79 ) ; 

 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP105 , const place_t a_RX10_TEMP101 , const int32_t a_RX10_TEMP100 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP99 ) 
{ 
T5THIS->RX10_TEMP105 = ( a_RX10_TEMP105 ) ; 
T5THIS->RX10_TEMP101 = ( a_RX10_TEMP101 ) ; 
T5THIS->RX10_TEMP100 = ( a_RX10_TEMP100 ) ; 
T5THIS->RX10_TEMP99 = ( a_RX10_TEMP99 ) ; 

 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T6THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T6THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T7THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T7THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T7THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T7THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS,  struct doubleRefArray1 const a_tempref , const place_t a_curr_place , const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_a ) 
{ 
T8THIS->tempref = ( a_tempref ) ; 
T8THIS->curr_place = ( a_curr_place ) ; 
T8THIS->j = ( a_j ) ; 
T8THIS->i = ( a_i ) ; 
T8THIS->a = ( a_a ) ; 

 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, const double a_val ,  struct Point2 const a_p ,  struct doubleRefArray2 const a_a ) 
{ 
T9THIS->val = ( a_val ) ; 
T9THIS->p = ( a_p ) ; 
T9THIS->a = ( a_a ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS, const double a_val , const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_a ) 
{ 
T10THIS->val = ( a_val ) ; 
T10THIS->j = ( a_j ) ; 
T10THIS->i = ( a_i ) ; 
T10THIS->a = ( a_a ) ; 

 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS,  struct Point2 const a_p ,  struct doubleRefArray2 const a_b ) 
{ 
T11THIS->p = ( a_p ) ; 
T11THIS->b = ( a_b ) ; 

 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS, const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_b ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) 
{ 
T12THIS->j = ( a_j ) ; 
T12THIS->i = ( a_i ) ; 
T12THIS->b = ( a_b ) ; 
T12THIS->a = ( a_a ) ; 
T12THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, const int32_t a_l , const int32_t a_k , const int32_t a_n ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) 
{ 
T13THIS->l = ( a_l ) ; 
T13THIS->k = ( a_k ) ; 
T13THIS->n = ( a_n ) ; 
T13THIS->a = ( a_a ) ; 
T13THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T14THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T14THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T14THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T14THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T14THIS->THIS = *TimerTHIS;
 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T15THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T15THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T15THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T15THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T15THIS->THIS = *TimerTHIS;
 return  *T15THIS; 

} 

T16 T16_T16 ( struct T16 *T16THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T16THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T16THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T16THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T16THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T16THIS->THIS = *TimerTHIS;
 return  *T16THIS; 

} 

T17 T17_T17 ( struct T17 *T17THIS,  struct intStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T17THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T17THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T17THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T17THIS; 

} 

T18 T18_T18 ( struct T18 *T18THIS,  struct doubleStub const a_RX10_TEMP48 , const int32_t a_RX10_TEMP40 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP39 ) 
{ 
T18THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T18THIS->RX10_TEMP40 = ( a_RX10_TEMP40 ) ; 
T18THIS->RX10_TEMP39 = ( a_RX10_TEMP39 ) ; 

 return  *T18THIS; 

} 

T19 T19_T19 ( struct T19 *T19THIS,  struct doubleStub const a_RX10_TEMP68 , const int32_t a_RX10_TEMP60 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP59 ) 
{ 
T19THIS->RX10_TEMP68 = ( a_RX10_TEMP68 ) ; 
T19THIS->RX10_TEMP60 = ( a_RX10_TEMP60 ) ; 
T19THIS->RX10_TEMP59 = ( a_RX10_TEMP59 ) ; 

 return  *T19THIS; 

} 

T20 T20_T20 ( struct T20 *T20THIS,  struct doubleStub const a_RX10_TEMP88 , const int32_t a_RX10_TEMP80 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP79 ) 
{ 
T20THIS->RX10_TEMP88 = ( a_RX10_TEMP88 ) ; 
T20THIS->RX10_TEMP80 = ( a_RX10_TEMP80 ) ; 
T20THIS->RX10_TEMP79 = ( a_RX10_TEMP79 ) ; 

 return  *T20THIS; 

} 

T21 T21_T21 ( struct T21 *T21THIS,  struct intStub const a_RX10_TEMP108 , const int32_t a_RX10_TEMP100 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP99 ) 
{ 
T21THIS->RX10_TEMP108 = ( a_RX10_TEMP108 ) ; 
T21THIS->RX10_TEMP100 = ( a_RX10_TEMP100 ) ; 
T21THIS->RX10_TEMP99 = ( a_RX10_TEMP99 ) ; 

 return  *T21THIS; 

} 

T22 T22_T22 ( struct T22 *T22THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T22THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T22THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T22THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T22THIS; 

} 

T23 T23_T23 ( struct T23 *T23THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T23THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T23THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T23THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T23THIS; 

} 

T24 T24_T24 ( struct T24 *T24THIS, const double a_temp ,  struct doubleRefArray1 const a_tempref ) 
{ 
T24THIS->temp = ( a_temp ) ; 
T24THIS->tempref = ( a_tempref ) ; 

 return  *T24THIS; 

} 

T25 T25_T25 ( struct T25 *T25THIS, const int32_t a_j , const int32_t a_kp1 , const int32_t a_l , const int32_t a_k , const int32_t a_n ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) 
{ 
T25THIS->j = ( a_j ) ; 
T25THIS->kp1 = ( a_kp1 ) ; 
T25THIS->l = ( a_l ) ; 
T25THIS->k = ( a_k ) ; 
T25THIS->n = ( a_n ) ; 
T25THIS->a = ( a_a ) ; 
T25THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T25THIS; 

} 

T26 T26_T26 ( struct T26 *T26THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T26THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T26THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T26THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T26THIS->THIS = *TimerTHIS;
 return  *T26THIS; 

} 

T27 T27_T27 ( struct T27 *T27THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T27THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T27THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T27THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T27THIS->THIS = *TimerTHIS;
 return  *T27THIS; 

} 

T28 T28_T28 ( struct T28 *T28THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T28THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T28THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T28THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T28THIS->THIS = *TimerTHIS;
 return  *T28THIS; 

} 

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray2THIS->distValue = ( distValue_ ) ; 
doubleRefArray2THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray2THIS; 

} 

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray1THIS->distValue = ( distValue_ ) ; 
doubleRefArray1THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray1THIS; 

} 

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist1THIS->dReg = ( dReg_ ) ; 
Dist1THIS->dDist = ( dDist_ ) ; 

 return  *Dist1THIS; 

} 

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist2THIS->dReg = ( dReg_ ) ; 
Dist2THIS->dDist = ( dDist_ ) ; 

 return  *Dist2THIS; 

} 

Timer *Timer_Timer ( struct Timer *TimerTHIS) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = /*program*/_Timer_max_counters ; 
struct Region1 X10_TEMP5 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* place.FIRST_PLACE  */ _place_first(); 
struct Dist1 d = getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER73;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER73 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER73)[0] = RX10_TEMP5, TEMPCALLOCPOINTER73 = ((int32_t * )TEMPCALLOCPOINTER73)+1, memset(TEMPCALLOCPOINTER73,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC22) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER74;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER74 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER74)[0] = RX10_TEMP4, TEMPCALLOCPOINTER74 = ((int32_t * )TEMPCALLOCPOINTER74)+1, memset(TEMPCALLOCPOINTER74,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP17 ) ; 
struct doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; 
TimerTHIS->start_time = ( X10_TEMP11 ) ; 
struct Region1 RX10_TEMP21 = d .dReg ; 
const int32_t RX10_TEMP22 = 0 ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP24 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int32_t RX10_TEMP25 = RX10_TEMP24 + 1; 
const int32_t RX10_TEMP26 = /*SimpleDistributionExpression*/ RX10_TEMP24 +1; 
void * TEMPCALLOCPOINTER75;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER75 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER75)[0] = RX10_TEMP26, TEMPCALLOCPOINTER75 = ((int32_t * )TEMPCALLOCPOINTER75)+1, memset(TEMPCALLOCPOINTER75,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC23) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER76;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER76 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER76)[0] = RX10_TEMP25, TEMPCALLOCPOINTER76 = ((int32_t * )TEMPCALLOCPOINTER76)+1, memset(TEMPCALLOCPOINTER76,0,RX10_TEMP25*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP40 = 0;RX10_TEMP40 < RX10_TEMP25; RX10_TEMP40++) 

{ 
struct doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] 
; 
RX10_TEMP38[RX10_TEMP40] = RX10_TEMP39 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP41  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP41/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP38 ) ; 
struct doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; 
TimerTHIS->elapsed_time = ( X10_TEMP15 ) ; 
struct Region1 RX10_TEMP42 = d .dReg ; 
const int32_t RX10_TEMP43 = 0 ; 
const int32_t RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP45 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; const int32_t RX10_TEMP46 = RX10_TEMP45 + 1; 
const int32_t RX10_TEMP47 = /*SimpleDistributionExpression*/ RX10_TEMP45 +1; 
void * TEMPCALLOCPOINTER77;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER77 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER77)[0] = RX10_TEMP47, TEMPCALLOCPOINTER77 = ((int32_t * )TEMPCALLOCPOINTER77)+1, memset(TEMPCALLOCPOINTER77,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T16 utmp16  ; 
T16_T16( &utmp16/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC24) ;
a.size = sizeof(utmp16 );
a.params = (void *)(&utmp16 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER78;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER78 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER78)[0] = RX10_TEMP46, TEMPCALLOCPOINTER78 = ((int32_t * )TEMPCALLOCPOINTER78)+1, memset(TEMPCALLOCPOINTER78,0,RX10_TEMP46*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP61 = 0;RX10_TEMP61 < RX10_TEMP46; RX10_TEMP61++) 

{ 
struct doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] 
; 
RX10_TEMP59[RX10_TEMP61] = RX10_TEMP60 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP62  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP62/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP59 ) ; 
struct doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; 
TimerTHIS->total_time = ( X10_TEMP19 ) ; 

 return  TimerTHIS; 

} 

void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER80;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER80 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER80)[0] = RX10_TEMP14, TEMPCALLOCPOINTER80 = ((int32_t * )TEMPCALLOCPOINTER80)+1, memset(TEMPCALLOCPOINTER80,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T26 utmp26  ; 
T26_T26( &utmp26/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC25) ;
a.size = sizeof(utmp26 );
a.params = (void *)(&utmp26 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER82;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER82 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER82)[0] = RX10_TEMP35, TEMPCALLOCPOINTER82 = ((int32_t * )TEMPCALLOCPOINTER82)+1, memset(TEMPCALLOCPOINTER82,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T27 utmp27  ; 
T27_T27( &utmp27/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC26) ;
a.size = sizeof(utmp27 );
a.params = (void *)(&utmp27 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread16 ( struct Timer *TimerTHIS,  struct T16 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER84;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER84 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER84)[0] = RX10_TEMP56, TEMPCALLOCPOINTER84 = ((int32_t * )TEMPCALLOCPOINTER84)+1, memset(TEMPCALLOCPOINTER84,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T28 utmp28  ; 
T28_T28( &utmp28/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC27) ;
a.size = sizeof(utmp28 );
a.params = (void *)(&utmp28 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread26 ( struct Timer *TimerTHIS,  struct T26 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread27 ( struct Timer *TimerTHIS,  struct T27 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread28 ( struct Timer *TimerTHIS,  struct T28 const utmpz ) 
{ 
struct doubleStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; 
} 
} 


Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t minusOne = zero - one ; 
const uint32_t f = 0 ; 
const int32_t regR = 1 ; 
Region1THIS->regRank = ( regR ) ; 
Region1THIS->regSize = ( regSize_ ) ; 
Region1THIS->pointArray = ( pointArray_ ) ; 
Region1THIS->regType = ( f ) ; 
Region1THIS->low0 = ( minusOne ) ; 
Region1THIS->dim0 = ( zero ) ; 

 return  *Region1THIS; 

} 

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) 
{ 
const uint32_t t = 1 ; 
const int32_t regR = 1 ; 
Region1THIS->regRank = ( regR ) ; 
Region1THIS->regSize = ( regSize_ ) ; 
Region1THIS->pointArray = ( pointArray_ ) ; 
Region1THIS->regType = ( t ) ; 
Region1THIS->low0 = ( low0_ ) ; 
Region1THIS->dim0 = ( dim0_ ) ; 

 return  *Region1THIS; 

} 

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) 
{ 
doubleStubTHIS->localArray = ( localArray_ ) ; 

 return  *doubleStubTHIS; 

} 

Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t minusOne = zero - one ; 
const uint32_t f = 0 ; 
const int32_t regR = 2 ; 
Region2THIS->regRank = ( regR ) ; 
Region2THIS->regSize = ( regSize_ ) ; 
Region2THIS->pointArray = ( pointArray_ ) ; 
Region2THIS->regType = ( f ) ; 
Region2THIS->low0 = ( minusOne ) ; 
Region2THIS->dim0 = ( zero ) ; 
Region2THIS->low1 = ( minusOne ) ; 
Region2THIS->dim1 = ( zero ) ; 

 return  *Region2THIS; 

} 

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ ) 
{ 
const uint32_t t = 1 ; 
const int32_t regR = 2 ; 
Region2THIS->regRank = ( regR ) ; 
Region2THIS->regSize = ( regSize_ ) ; 
Region2THIS->pointArray = ( pointArray_ ) ; 
Region2THIS->regType = ( t ) ; 
Region2THIS->low0 = ( low0_ ) ; 
Region2THIS->dim0 = ( dim0_ ) ; 
Region2THIS->low1 = ( low1_ ) ; 
Region2THIS->dim1 = ( dim1_ ) ; 

 return  *Region2THIS; 

} 
Linpack * Linpack_Linpack(struct Linpack * LinpackTHIS){return LinpackTHIS;}


Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

} 

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int32_t f0_ , const int32_t f1_ ) 
{ 
Point2THIS->f0 = ( f0_ ) ; 
Point2THIS->f1 = ( f1_ ) ; 

 return  *Point2THIS; 

} 

intStub intStub_intStub ( struct intStub *intStubTHIS, /*Updatable ARRAY*/ int32_t * const localArray_ ) 
{ 
intStubTHIS->localArray = ( localArray_ ) ; 

 return  *intStubTHIS; 

} 

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) 
{ 
const int32_t one = 1 ; 
const int32_t zero = 0 ; 
const int32_t maxPlaces = /* place.MAX_PLACES  */ _max_places(); 
const int32_t ub = maxPlaces - one ; 
const int32_t countReg = ub + 1; 
const int32_t countDist = /*SimpleDistributionExpression*/ ub +1; 
const int32_t rSize = arraySize - one ; 
const int32_t arrayReg = rSize + 1; 
const int32_t runSumDist = /*SimpleDistributionExpression*/ rSize +1; 
void * TEMPCALLOCPOINTER88;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER88 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(countDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER88)[0] = countDist, TEMPCALLOCPOINTER88 = ((int32_t * )TEMPCALLOCPOINTER88)+1, memset(TEMPCALLOCPOINTER88,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER89;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER89 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(runSumDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER89)[0] = runSumDist, TEMPCALLOCPOINTER89 = ((int32_t * )TEMPCALLOCPOINTER89)+1, memset(TEMPCALLOCPOINTER89,0,runSumDist*sizeof(int32_t ) ) ); 
for ( int32_t p= 0; p<  countReg; p++ )
 
{ 
tempCounts [ p ] = ( zero ) ; 
} 

for ( int32_t p= 0; p<  arrayReg; p++ )
 
{ 
const place_t pl = vPlaceArray [ p ] 
; 
const int32_t index = /* pl . id  */ pl; 
const int32_t oldVal = tempCounts [ index ] 
; 
tempRunSum [ p ] = ( oldVal ) ; 
const int32_t oldValPlusOne = oldVal + one ; 
tempCounts [ index ] = ( oldValPlusOne ) ; 
} 

DistTHIS->placeArray = ( vPlaceArray ) ; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER90;
/*VALUE ARRAY*/ int32_t * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

} 

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) 
{ 
intRefArray1THIS->distValue = ( distValue_ ) ; 
intRefArray1THIS->contents = ( contents_ ) ; 

 return  *intRefArray1THIS; 

} 
/* class RunMain */ int32_t  runmain( ) 
{ 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_Linpack_r = _Linpack_r_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_Linpack_r = _Linpack_r_init ( ) ; 

}
 const double getTIME(){
uint64_t microsecs;
struct timeval tv; 
gettimeofday(&tv, NULL);
microsecs = ((uint64_t)tv.tv_sec * 1000000);
microsecs += tv.tv_usec;
const double temp = (const double)microsecs;
const double temp2 = temp/1000;
return temp2; 
}
void _thread_run(uint32_t method, void * params){
switch(method) {
	 case ASYNC0 :
		 fixPointerT1(((struct T1 * const )params), (params+sizeof(struct T1)));
		thread1(*(struct T1 * const )params);
		break;
	 case ASYNC1 :
		 fixPointerT2(((struct T2 * const )params), (params+sizeof(struct T2)));
		thread2(*(struct T2 * const )params);
		break;
	 case ASYNC2 :
		 fixPointerT3(((struct T3 * const )params), (params+sizeof(struct T3)));
		thread3(*(struct T3 * const )params);
		break;
	 case ASYNC3 :
		 fixPointerT4(((struct T4 * const )params), (params+sizeof(struct T4)));
		thread4(*(struct T4 * const )params);
		break;
	 case ASYNC4 :
		 fixPointerT5(((struct T5 * const )params), (params+sizeof(struct T5)));
		thread5(*(struct T5 * const )params);
		break;
	 case ASYNC5 :
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(*(struct T6 * const )params);
		break;
	 case ASYNC6 :
		 fixPointerT7(((struct T7 * const )params), (params+sizeof(struct T7)));
		thread7(*(struct T7 * const )params);
		break;
	 case ASYNC7 :
		 fixPointerT8(((struct T8 * const )params), (params+sizeof(struct T8)));
		thread8(*(struct T8 * const )params);
		break;
	 case ASYNC8 :
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC9 :
		 fixPointerT10(((struct T10 * const )params), (params+sizeof(struct T10)));
		thread10(*(struct T10 * const )params);
		break;
	 case ASYNC10 :
		 fixPointerT11(((struct T11 * const )params), (params+sizeof(struct T11)));
		thread11(*(struct T11 * const )params);
		break;
	 case ASYNC11 :
		 fixPointerT12(((struct T12 * const )params), (params+sizeof(struct T12)));
		thread12(*(struct T12 * const )params);
		break;
	 case ASYNC12 :
		 fixPointerT13(((struct T13 * const )params), (params+sizeof(struct T13)));
		thread13(*(struct T13 * const )params);
		break;
	 case ASYNC13 :
		 fixPointerT17(((struct T17 * const )params), (params+sizeof(struct T17)));
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC14 :
		 fixPointerT18(((struct T18 * const )params), (params+sizeof(struct T18)));
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC15 :
		 fixPointerT19(((struct T19 * const )params), (params+sizeof(struct T19)));
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC16 :
		 fixPointerT20(((struct T20 * const )params), (params+sizeof(struct T20)));
		thread20(*(struct T20 * const )params);
		break;
	 case ASYNC17 :
		 fixPointerT21(((struct T21 * const )params), (params+sizeof(struct T21)));
		thread21(*(struct T21 * const )params);
		break;
	 case ASYNC18 :
		 fixPointerT22(((struct T22 * const )params), (params+sizeof(struct T22)));
		thread22(*(struct T22 * const )params);
		break;
	 case ASYNC19 :
		 fixPointerT23(((struct T23 * const )params), (params+sizeof(struct T23)));
		thread23(*(struct T23 * const )params);
		break;
	 case ASYNC20 :
		 fixPointerT24(((struct T24 * const )params), (params+sizeof(struct T24)));
		thread24(*(struct T24 * const )params);
		break;
	 case ASYNC21 :
		 fixPointerT25(((struct T25 * const )params), (params+sizeof(struct T25)));
		thread25(*(struct T25 * const )params);
		break;
	 case ASYNC22 :
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC23 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC24 :
		 fixPointerT16(((struct T16 * const )params), (params+sizeof(struct T16)));
		thread16(&(*((struct T16 * const )params)).THIS, *((struct T16 * const )params));
		break;
	 case ASYNC25 :
		 fixPointerT26(((struct T26 * const )params), (params+sizeof(struct T26)));
		thread26(&(*((struct T26 * const )params)).THIS, *((struct T26 * const )params));
		break;
	 case ASYNC26 :
		 fixPointerT27(((struct T27 * const )params), (params+sizeof(struct T27)));
		thread27(&(*((struct T27 * const )params)).THIS, *((struct T27 * const )params));
		break;
	 case ASYNC27 :
		 fixPointerT28(((struct T28 * const )params), (params+sizeof(struct T28)));
		thread28(&(*((struct T28 * const )params)).THIS, *((struct T28 * const )params));
		break;
	 default:
 
	fprintf(stderr, "%d:ERROR THREAD RUN ====== not the right case", _here());
	break;
}
}
void _thread_run_local(uint32_t method, void * params){
switch(method) {
	 case ASYNC0 :
		thread1(*(struct T1 * const )params);
		break;
	 case ASYNC1 :
		thread2(*(struct T2 * const )params);
		break;
	 case ASYNC2 :
		thread3(*(struct T3 * const )params);
		break;
	 case ASYNC3 :
		thread4(*(struct T4 * const )params);
		break;
	 case ASYNC4 :
		thread5(*(struct T5 * const )params);
		break;
	 case ASYNC5 :
		thread6(*(struct T6 * const )params);
		break;
	 case ASYNC6 :
		thread7(*(struct T7 * const )params);
		break;
	 case ASYNC7 :
		thread8(*(struct T8 * const )params);
		break;
	 case ASYNC8 :
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC9 :
		thread10(*(struct T10 * const )params);
		break;
	 case ASYNC10 :
		thread11(*(struct T11 * const )params);
		break;
	 case ASYNC11 :
		thread12(*(struct T12 * const )params);
		break;
	 case ASYNC12 :
		thread13(*(struct T13 * const )params);
		break;
	 case ASYNC13 :
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC14 :
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC15 :
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC16 :
		thread20(*(struct T20 * const )params);
		break;
	 case ASYNC17 :
		thread21(*(struct T21 * const )params);
		break;
	 case ASYNC18 :
		thread22(*(struct T22 * const )params);
		break;
	 case ASYNC19 :
		thread23(*(struct T23 * const )params);
		break;
	 case ASYNC20 :
		thread24(*(struct T24 * const )params);
		break;
	 case ASYNC21 :
		thread25(*(struct T25 * const )params);
		break;
	 case ASYNC22 :
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC23 :
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC24 :
		thread16(&(*((struct T16 * const )params)).THIS, *((struct T16 * const )params));
		break;
	 case ASYNC25 :
		thread26(&(*((struct T26 * const )params)).THIS, *((struct T26 * const )params));
		break;
	 case ASYNC26 :
		thread27(&(*((struct T27 * const )params)).THIS, *((struct T27 * const )params));
		break;
	 case ASYNC27 :
		thread28(&(*((struct T28 * const )params)).THIS, *((struct T28 * const )params));
		break;
	 default:
 
	fprintf(stderr, "%d:ERROR THREAD RUN LOCAL ====== not the right case", _here());
	break;
}
}
void * _pack_ASYNC(uint64_t * bufSize, uint32_t headerSize,_async child){
void * buf;
 uint64_t sizeToMalloc;
switch(child.method) {
	 case ASYNC0 :
		 sizeToMalloc = child.size+ getSizeOfT1((struct T1 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT1((struct T1 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC1 :
		 sizeToMalloc = child.size+ getSizeOfT2((struct T2 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT2((struct T2 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC2 :
		 sizeToMalloc = child.size+ getSizeOfT3((struct T3 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT3((struct T3 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC3 :
		 sizeToMalloc = child.size+ getSizeOfT4((struct T4 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT4((struct T4 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC4 :
		 sizeToMalloc = child.size+ getSizeOfT5((struct T5 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT5((struct T5 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC5 :
		 sizeToMalloc = child.size+ getSizeOfT6((struct T6 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT6((struct T6 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC6 :
		 sizeToMalloc = child.size+ getSizeOfT7((struct T7 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT7((struct T7 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC7 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC8 :
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC9 :
		 sizeToMalloc = child.size+ getSizeOfT10((struct T10 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT10((struct T10 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC10 :
		 sizeToMalloc = child.size+ getSizeOfT11((struct T11 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT11((struct T11 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT12((struct T12 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT12((struct T12 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT17((struct T17 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT17((struct T17 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC14 :
		 sizeToMalloc = child.size+ getSizeOfT18((struct T18 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT18((struct T18 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC15 :
		 sizeToMalloc = child.size+ getSizeOfT19((struct T19 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT19((struct T19 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC16 :
		 sizeToMalloc = child.size+ getSizeOfT20((struct T20 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT20((struct T20 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC17 :
		 sizeToMalloc = child.size+ getSizeOfT21((struct T21 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT21((struct T21 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC18 :
		 sizeToMalloc = child.size+ getSizeOfT22((struct T22 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT22((struct T22 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC19 :
		 sizeToMalloc = child.size+ getSizeOfT23((struct T23 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT23((struct T23 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC20 :
		 sizeToMalloc = child.size+ getSizeOfT24((struct T24 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT24((struct T24 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC21 :
		 sizeToMalloc = child.size+ getSizeOfT25((struct T25 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT25((struct T25 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC22 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC23 :
		 sizeToMalloc = child.size+ getSizeOfT15((struct T15 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT15((struct T15 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC24 :
		 sizeToMalloc = child.size+ getSizeOfT16((struct T16 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT16((struct T16 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC25 :
		 sizeToMalloc = child.size+ getSizeOfT26((struct T26 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT26((struct T26 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC26 :
		 sizeToMalloc = child.size+ getSizeOfT27((struct T27 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT27((struct T27 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC27 :
		 sizeToMalloc = child.size+ getSizeOfT28((struct T28 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT28((struct T28 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 default:
 
	fprintf(stderr, "%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\n", _here());
	break;
}
}
int32_t getSizeOfdoubleStub( struct doubleStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT6( struct T6 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT7( struct T7 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT4( struct T4 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT5( struct T5 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT28( struct T28 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfT27( struct T27 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT8( struct T8 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfT26( struct T26 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT9( struct T9 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint2(&(className -> p));
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfT25( struct T25 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfT24( struct T24 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
return temp;
 }
int32_t getSizeOfT23( struct T23 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfintRefArray1( struct intRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(intStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfintStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfT22( struct T22 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT21( struct T21 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP108));
return temp;
 }
int32_t getSizeOfT20( struct T20 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP88));
return temp;
 }
int32_t getSizeOfdoubleRefArray2( struct doubleRefArray2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist2(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(doubleStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfdoubleStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(doubleStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfdoubleStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfDist1( struct Dist1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> dReg));
    temp += getSizeOfDist(&(className -> dDist));
return temp;
 }
int32_t getSizeOfDist2( struct Dist2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion2(&(className -> dReg));
    temp += getSizeOfDist(&(className -> dDist));
return temp;
 }
int32_t getSizeOfRegion1( struct Region1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
		temp += sizeof(int);
		size = *(((int32_t *)className -> pointArray)-1);
		temp += size*sizeof(Point1);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfPoint1(&(className -> pointArray[i]));
	}
return temp;
 }
int32_t getSizeOfT1( struct T1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT3( struct T3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfRegion2( struct Region2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
		temp += sizeof(int);
		size = *(((int32_t *)className -> pointArray)-1);
		temp += size*sizeof(Point2);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfPoint2(&(className -> pointArray[i]));
	}
return temp;
 }
int32_t getSizeOfT2( struct T2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfPoint1( struct Point1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfPoint2( struct Point2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT10( struct T10 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfintStub( struct intStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT11( struct T11 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint2(&(className -> p));
    temp += getSizeOfdoubleRefArray2(&(className -> b));
return temp;
 }
int32_t getSizeOfT12( struct T12 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray2(&(className -> b));
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfT13( struct T13 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray2(&(className -> a));
return temp;
 }
int32_t getSizeOfDist( struct Dist * className) {
    int32_t temp = 0;
    int32_t size = 0;
		temp += sizeof(int);
		size = *(((int32_t *)className -> placeArray)-1);
		temp += size*sizeof(int);
		temp += sizeof(int);
		size = *(((int32_t *)className -> counts)-1);
		temp += size*sizeof(int32_t);
		temp += sizeof(int);
		size = *(((int32_t *)className -> runningSum)-1);
		temp += size*sizeof(int32_t);
return temp;
 }
int32_t getSizeOfT14( struct T14 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT15( struct T15 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT16( struct T16 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT17( struct T17 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT18( struct T18 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP48));
return temp;
 }
int32_t getSizeOfT19( struct T19 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP68));
return temp;
 }
void* deepCopydoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT4( struct T4 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT5( struct T5 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopyT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint2(&(className -> p), offset);
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void* deepCopyT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyintRefArray1( struct intRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(intStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyintStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP108), offset);
return offset;
 }
void* deepCopyT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP88), offset);
return offset;
 }
void* deepCopydoubleRefArray2( struct doubleRefArray2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist2(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(doubleStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopydoubleStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(doubleStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopydoubleStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyDist1( struct Dist1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> dReg), offset);
offset = deepCopyDist(&(className -> dDist), offset);
return offset;
 }
void* deepCopyDist2( struct Dist2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion2(&(className -> dReg), offset);
offset = deepCopyDist(&(className -> dDist), offset);
return offset;
 }
void* deepCopyRegion1( struct Region1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
size = *(((int32_t *)className -> pointArray)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(Point1);
memcpy(offset, (void *) className -> pointArray, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyPoint1(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void* deepCopyT1( struct T1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyRegion2( struct Region2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
size = *(((int32_t *)className -> pointArray)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(Point2);
memcpy(offset, (void *) className -> pointArray, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyPoint2(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void* deepCopyT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyPoint2( struct Point2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyintStub( struct intStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint2(&(className -> p), offset);
offset = deepCopydoubleRefArray2(&(className -> b), offset);
return offset;
 }
void* deepCopyT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray2(&(className -> b), offset);
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray2(&(className -> a), offset);
return offset;
 }
void* deepCopyDist( struct Dist * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
size = *(((int32_t *)className -> placeArray)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(int);
memcpy(offset, (void *) className -> placeArray, temp);
offset += temp;
size = *(((int32_t *)className -> counts)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(int32_t);
memcpy(offset, (void *) className -> counts, temp);
offset += temp;
size = *(((int32_t *)className -> runningSum)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(int32_t);
memcpy(offset, (void *) className -> runningSum, temp);
offset += temp;
return offset;
 }
void* deepCopyT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT16( struct T16 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP48), offset);
return offset;
 }
void* deepCopyT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP68), offset);
return offset;
 }
void * fixPointerdoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT4( struct T4 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT5( struct T5 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint2(&(className -> p), offset);
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void * fixPointerT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerintRefArray1( struct intRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(intStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerintStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP108), offset);
return offset;
 }
void * fixPointerT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP88), offset);
return offset;
 }
void * fixPointerdoubleRefArray2( struct doubleRefArray2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist2(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(doubleStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerdoubleStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(doubleStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerdoubleStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerDist1( struct Dist1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> dReg), offset);
offset  = fixPointerDist(&(className -> dDist), offset);
return offset;
 }
void * fixPointerDist2( struct Dist2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion2(&(className -> dReg), offset);
offset  = fixPointerDist(&(className -> dDist), offset);
return offset;
 }
void * fixPointerRegion1( struct Region1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
className -> pointArray = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> pointArray)-1);
offset += size*sizeof(Point1);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerPoint1(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void * fixPointerT1( struct T1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerRegion2( struct Region2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
className -> pointArray = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> pointArray)-1);
offset += size*sizeof(Point2);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerPoint2(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void * fixPointerT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerPoint2( struct Point2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerintStub( struct intStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint2(&(className -> p), offset);
offset  = fixPointerdoubleRefArray2(&(className -> b), offset);
return offset;
 }
void * fixPointerT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray2(&(className -> b), offset);
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray2(&(className -> a), offset);
return offset;
 }
void * fixPointerDist( struct Dist * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
className -> placeArray = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> placeArray)-1);
offset += size*sizeof(int);
className -> counts = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> counts)-1);
offset += size*sizeof(int32_t);
className -> runningSum = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> runningSum)-1);
offset += size*sizeof(int32_t);
return offset;
 }
void * fixPointerT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT16( struct T16 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP48), offset);
return offset;
 }
void * fixPointerT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP68), offset);
return offset;
 }
