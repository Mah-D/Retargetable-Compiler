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
int32_t _Stream_MEG ;
double _Stream_alpha ;
int32_t _Stream_NUM_TIMES ;
int64_t _Stream_N0 ;
int64_t _Stream_N ;
int32_t _Stream_LocalSize ;
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

void /*static*/runMain ( ) 
{ 
/*UpdatableVariableDeclaration*/
 struct Timer  * tmr = (struct Timer  *) ((((_task*)_thread_getspecific()) -> total_memory) +=  sizeof(struct Timer ),malloc(sizeof(struct Timer )));  
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
struct Stream * X10_TEMP4 = (struct Stream  *)  ((((_task*)_thread_getspecific()) -> total_memory) +=  sizeof(struct Stream ),malloc(sizeof(struct Stream )));  
Stream_Stream( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
Stream_run ( X10_TEMP4 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for stream: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC1, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC1;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC2, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC2;; 
fprintf(  stdout, "%s\n",X10_TEMP12 ) ; 
} 

int32_t /*static*/_Stream_MEG_init ( ) 
{ 
const int32_t X10_TEMP1 = 50 ; 
const int32_t X10_TEMP2 = 50 ; 
const int32_t X10_TEMP4 = X10_TEMP1 * X10_TEMP2 ; 
return X10_TEMP4 ; 
} 

double /*static*/_Stream_alpha_init ( ) 
{ 
const double X10_TEMP2 = 3.0f; 
return X10_TEMP2 ; 
} 

int32_t /*static*/_Stream_NUM_TIMES_init ( ) 
{ 
const int32_t X10_TEMP2 = 10 ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/_Stream_N0_init ( ) 
{ 
const int32_t X10_TEMP1 = 2 ; 
const int64_t X10_TEMP3 = X10_TEMP1 * _Stream_MEG ; 
return X10_TEMP3 ; 
} 

int64_t /*static*/_Stream_N_init ( ) 
{ 
const int32_t X10_TEMP1 = /* place.MAX_PLACES  */ _max_places(); 
const int64_t X10_TEMP3 = _Stream_N0 * X10_TEMP1 ; 
return X10_TEMP3 ; 
} 

int32_t /*static*/_Stream_LocalSize_init ( ) 
{ 
const int32_t X10_TEMP2 = /*casting*/( int32_t ) _Stream_N0 ; 
return X10_TEMP2 ; 
} 

void /*static*/Stream_run (  struct Stream  * const X10_TEMP0 ) 
{ 
const char * X10_TEMP1 = "LocalSize=" ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC3, "%s%d",X10_TEMP1,_Stream_LocalSize);
const char * X10_TEMP3 = tempC3;; 
fprintf(  stdout, "%s\n",X10_TEMP3 ) ; 
struct StreamData tempSd = X10_TEMP0 ->sd ; 
/* finish  */ task_start_finish();

{ 
const int32_t X10_TEMP10 = 0 ; 
const int32_t X10_TEMP6 = 1 ; 
const int32_t X10_TEMP8 = _Stream_NUM_TIMES - X10_TEMP6 ; 
const int32_t X10_TEMP11 = /*casting*/( int32_t ) X10_TEMP8 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 r = createNewRegion1R ( X10_TEMP10 , X10_TEMP11 ) ; 
const int32_t RX10_TEMP3 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP1 = r .regSize ; 
RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; const int32_t RX10_TEMP2 = RX10_TEMP1 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP2; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP4 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 p1 = regionOrdinalPoint1 ( r , RX10_TEMP4 ) ; 
/* finish  */ task_start_finish();

{ 
struct Dist1 X10_TEMP15 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP6 = X10_TEMP15 .dReg ; 
const int32_t RX10_TEMP9 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP7 = RX10_TEMP6 .regSize ; 
RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9 ; const int32_t RX10_TEMP8 = RX10_TEMP7 + 1; 
for ( int32_t RX10_TEMP5= 0; RX10_TEMP5<  RX10_TEMP8; RX10_TEMP5++ )
 
{ 
const int32_t RX10_TEMP10 = /*PointAccess*/RX10_TEMP5 ; 
struct Point1 p6 = regionOrdinalPoint1 ( RX10_TEMP6 , RX10_TEMP10 ) ; 
struct Region1 RX10_TEMP11 = X10_TEMP15 .dReg ; 
const int32_t RX10_TEMP12 = searchPointInRegion1 ( RX10_TEMP11 , p6 ) ; 
const int32_t RX10_TEMP13 = 0 ; 
const uint32_t RX10_TEMP14 = RX10_TEMP12 < RX10_TEMP13 ; 
if ( RX10_TEMP14 ) 
{ 
const char * RX10_TEMP15 = "Point p6 not found in the distribution X10_TEMP15." ; 
fprintf(stderr, "%s",RX10_TEMP15 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP16 = getPlaceFromDist1 ( X10_TEMP15 , RX10_TEMP12 ) ; 
const place_t X10_TEMP16 = RX10_TEMP16 ; 
struct T1 utmp1  ; 
T1_T1( &utmp1/*OBJECT INIT IN ASSIGNMENT*/, p6 , p1 , tempSd ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC0) ;
a.size = sizeof(utmp1 );
a.params = (void *)(&utmp1 );
task_dispatch(a, X10_TEMP16 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/* finish  */ task_start_finish();

{ 
struct Dist1 X10_TEMP79 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP98 = X10_TEMP79 .dReg ; 
const int32_t RX10_TEMP101 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP99 = RX10_TEMP98 .regSize ; 
RX10_TEMP99 = RX10_TEMP99 - RX10_TEMP101 ; const int32_t RX10_TEMP100 = RX10_TEMP99 + 1; 
for ( int32_t RX10_TEMP97= 0; RX10_TEMP97<  RX10_TEMP100; RX10_TEMP97++ )
 
{ 
const int32_t RX10_TEMP102 = /*PointAccess*/RX10_TEMP97 ; 
struct Point1 p5 = regionOrdinalPoint1 ( RX10_TEMP98 , RX10_TEMP102 ) ; 
struct Region1 RX10_TEMP103 = X10_TEMP79 .dReg ; 
const int32_t RX10_TEMP104 = searchPointInRegion1 ( RX10_TEMP103 , p5 ) ; 
const int32_t RX10_TEMP105 = 0 ; 
const uint32_t RX10_TEMP106 = RX10_TEMP104 < RX10_TEMP105 ; 
if ( RX10_TEMP106 ) 
{ 
const char * RX10_TEMP107 = "Point p5 not found in the distribution X10_TEMP79." ; 
fprintf(stderr, "%s",RX10_TEMP107 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP108 = getPlaceFromDist1 ( X10_TEMP79 , RX10_TEMP104 ) ; 
const place_t X10_TEMP80 = RX10_TEMP108 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, p5 , p1 , tempSd ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, X10_TEMP80 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 

/* finish  */ task_start_finish();

{ 
struct Dist1 X10_TEMP97 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP137 = X10_TEMP97 .dReg ; 
const int32_t RX10_TEMP140 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP138 = RX10_TEMP137 .regSize ; 
RX10_TEMP138 = RX10_TEMP138 - RX10_TEMP140 ; const int32_t RX10_TEMP139 = RX10_TEMP138 + 1; 
for ( int32_t RX10_TEMP136= 0; RX10_TEMP136<  RX10_TEMP139; RX10_TEMP136++ )
 
{ 
const int32_t RX10_TEMP141 = /*PointAccess*/RX10_TEMP136 ; 
struct Point1 p2 = regionOrdinalPoint1 ( RX10_TEMP137 , RX10_TEMP141 ) ; 
struct Region1 RX10_TEMP142 = X10_TEMP97 .dReg ; 
const int32_t RX10_TEMP143 = searchPointInRegion1 ( RX10_TEMP142 , p2 ) ; 
const int32_t RX10_TEMP144 = 0 ; 
const uint32_t RX10_TEMP145 = RX10_TEMP143 < RX10_TEMP144 ; 
if ( RX10_TEMP145 ) 
{ 
const char * RX10_TEMP146 = "Point p2 not found in the distribution X10_TEMP97." ; 
fprintf(stderr, "%s",RX10_TEMP146 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP147 = getPlaceFromDist1 ( X10_TEMP97 , RX10_TEMP143 ) ; 
const place_t X10_TEMP98 = RX10_TEMP147 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, tempSd ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, X10_TEMP98 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 
task_end_finish();
/*END OF FINISH*/
/*UpdatableVariableDeclaration*/
double mini = 10000000L ; 
const int32_t X10_TEMP131 = 0 ; 
const int32_t X10_TEMP127 = 1 ; 
const int32_t X10_TEMP129 = _Stream_NUM_TIMES - X10_TEMP127 ; 
const int32_t X10_TEMP132 = /*casting*/( int32_t ) X10_TEMP129 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 r = createNewRegion1R ( X10_TEMP131 , X10_TEMP132 ) ; 
const int32_t RX10_TEMP201 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP199 = r .regSize ; 
RX10_TEMP199 = RX10_TEMP199 - RX10_TEMP201 ; const int32_t RX10_TEMP200 = RX10_TEMP199 + 1; 
for ( int32_t RX10_TEMP198= 0; RX10_TEMP198<  RX10_TEMP200; RX10_TEMP198++ )
 
{ 
const int32_t RX10_TEMP202 = /*PointAccess*/RX10_TEMP198 ; 
struct Point1 p1 = regionOrdinalPoint1 ( r , RX10_TEMP202 ) ; 
struct doubleRefArray1 X10_TEMP135 = tempSd .times ; 
struct Dist1 RX10_TEMP203 = X10_TEMP135 .distValue ; 
struct Region1 RX10_TEMP204 = RX10_TEMP203 .dReg ; 
const int32_t RX10_TEMP205 = searchPointInRegion1 ( RX10_TEMP204 , p1 ) ; 
const int32_t RX10_TEMP206 = 0 ; 
const uint32_t RX10_TEMP207 = RX10_TEMP205 < RX10_TEMP206 ; 
if ( RX10_TEMP207 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP208 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP208 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP209 = getPlaceFromDist1 ( RX10_TEMP203 , RX10_TEMP205 ) ; 
const place_t RX10_TEMP211 = /* here  */ _here(); 
const uint32_t RX10_TEMP212 = RX10_TEMP209 != RX10_TEMP211 ; 
if ( RX10_TEMP212 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP210 = "Bad place access for array X10_TEMP135" ; 
fprintf(stderr, "%s",RX10_TEMP210 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP213 = getRefArrayValue1double ( X10_TEMP135 , RX10_TEMP205 ) ; 
const double X10_TEMP137 = RX10_TEMP213 ; 
const uint32_t X10_TEMP139 = X10_TEMP137 < mini ; 
if ( X10_TEMP139 ) 
{ 
struct doubleRefArray1 X10_TEMP140 = tempSd .times ; 
struct Dist1 RX10_TEMP214 = X10_TEMP140 .distValue ; 
struct Region1 RX10_TEMP215 = RX10_TEMP214 .dReg ; 
const int32_t RX10_TEMP216 = searchPointInRegion1 ( RX10_TEMP215 , p1 ) ; 
const int32_t RX10_TEMP217 = 0 ; 
const uint32_t RX10_TEMP218 = RX10_TEMP216 < RX10_TEMP217 ; 
if ( RX10_TEMP218 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP219 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP219 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP220 = getPlaceFromDist1 ( RX10_TEMP214 , RX10_TEMP216 ) ; 
const place_t RX10_TEMP222 = /* here  */ _here(); 
const uint32_t RX10_TEMP223 = RX10_TEMP220 != RX10_TEMP222 ; 
if ( RX10_TEMP223 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP221 = "Bad place access for array X10_TEMP140" ; 
fprintf(stderr, "%s",RX10_TEMP221 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP224 = getRefArrayValue1double ( X10_TEMP140 , RX10_TEMP216 ) ; 
const double X10_TEMP143 = RX10_TEMP224 ; 
mini = X10_TEMP143 ; } 

} 

struct booleanRefArray1 X10_TEMP146 = tempSd .verified ; 
const int32_t X10_TEMP148 = 0 ; 
struct Point1 RX10_TEMP225  ; 
Point1_Point1( &RX10_TEMP225/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP148 ) ; 
struct Dist1 RX10_TEMP226 = X10_TEMP146 .distValue ; 
struct Region1 RX10_TEMP227 = RX10_TEMP226 .dReg ; 
const int32_t RX10_TEMP228 = searchPointInRegion1 ( RX10_TEMP227 , RX10_TEMP225 ) ; 
const int32_t RX10_TEMP229 = 0 ; 
const uint32_t RX10_TEMP230 = RX10_TEMP228 < RX10_TEMP229 ; 
if ( RX10_TEMP230 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP231 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP231 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP232 = getPlaceFromDist1 ( RX10_TEMP226 , RX10_TEMP228 ) ; 
const place_t RX10_TEMP234 = /* here  */ _here(); 
const uint32_t RX10_TEMP235 = RX10_TEMP232 != RX10_TEMP234 ; 
if ( RX10_TEMP235 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP233 = "Bad place access for array X10_TEMP146" ; 
fprintf(stderr, "%s",RX10_TEMP233 ) ; 
exit(EXIT_FAILURE);
} 

const uint32_t RX10_TEMP236 = getRefArrayValue1boolean ( X10_TEMP146 , RX10_TEMP228 ) ; 
const uint32_t X10_TEMP150 = RX10_TEMP236 ; 
Stream_printStats ( _Stream_N , mini , X10_TEMP150 ) ; 
} 

double /*static*/Stream_mySecond ( ) 
{ 
const double X10_TEMP1 = getTIME( ) 
; 
const double X10_TEMP2 = 1.e6; 
const double X10_TEMP3 = X10_TEMP1 * X10_TEMP2 ; 
const int32_t X10_TEMP4 = 1000 ; 
const double X10_TEMP6 = X10_TEMP3 / X10_TEMP4 ; 
const double X10_TEMP7 = /*casting*/( double ) X10_TEMP6 ; 
const double X10_TEMP8 = 1.e-6; 
const double X10_TEMP10 = X10_TEMP7 * X10_TEMP8 ; 
const double X10_TEMP12 = /*casting*/( double ) X10_TEMP10 ; 
return X10_TEMP12 ; 
} 

void /*static*/Stream_printStats ( const int64_t N , const double time , const uint32_t verified ) 
{ 
const char * X10_TEMP1 = "Number of places=" ; 
const int32_t X10_TEMP2 = /* place.MAX_PLACES  */ _max_places(); 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC4, "%s%d",X10_TEMP1,X10_TEMP2);
const char * X10_TEMP4 = tempC4;; 
fprintf(  stdout, "%s\n",X10_TEMP4 ) ; 
const int32_t X10_TEMP5 = 3 ; 
const int32_t X10_TEMP6 = 8 ; 
const int64_t X10_TEMP7 = X10_TEMP5 * X10_TEMP6 ; 
const int64_t X10_TEMP8 = X10_TEMP7 * N ; 
const int64_t X10_TEMP10 = X10_TEMP8 / _Stream_MEG ; 
/*UpdatableVariableDeclaration*/
int64_t size1 = X10_TEMP10 ; 
const int32_t X10_TEMP12 = 3 ; 
const int32_t X10_TEMP13 = 8 ; 
const int64_t X10_TEMP14 = X10_TEMP12 * X10_TEMP13 ; 
const int64_t X10_TEMP16 = X10_TEMP14 * N ; 
const double X10_TEMP17 = 1.0E9; 
const double X10_TEMP19 = X10_TEMP17 * time ; 
/*UpdatableVariableDeclaration*/
double rate = X10_TEMP16 / X10_TEMP19 ; 
const char * X10_TEMP21 = "Size of arrays: " ; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC5, "%s%lld",X10_TEMP21,size1);
const char * X10_TEMP22 = tempC5;; 
const char * X10_TEMP23 = " MB (total)" ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC6, "%s%s",X10_TEMP22,X10_TEMP23);
const char * X10_TEMP25 = tempC6;; 
const int32_t X10_TEMP24 = /* place.MAX_PLACES  */ _max_places(); 
const int64_t X10_TEMP26 = size1 / X10_TEMP24 ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC7, "%s%lld",X10_TEMP25,X10_TEMP26);
const char * X10_TEMP27 = tempC7;; 
const char * X10_TEMP28 = " MB (per place)" ; 
/*ASSIGNMENT STRING*/
 char * tempC8 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC8, "%s%s",X10_TEMP27,X10_TEMP28);
const char * X10_TEMP30 = tempC8;; 
fprintf(  stdout, "%s\n",X10_TEMP30 ) ; 
const char * X10_TEMP31 = "Min time: " ; 
/*ASSIGNMENT STRING*/
 char * tempC9 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC9, "%s%f",X10_TEMP31,time);
const char * X10_TEMP32 = tempC9;; 
const char * X10_TEMP33 = " rate=" ; 
/*ASSIGNMENT STRING*/
 char * tempC10 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC10, "%s%s",X10_TEMP32,X10_TEMP33);
const char * X10_TEMP34 = tempC10;; 
/*ASSIGNMENT STRING*/
 char * tempC11 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC11, "%s%f",X10_TEMP34,rate);
const char * X10_TEMP35 = tempC11;; 
const char * X10_TEMP36 = " GB/s" ; 
/*ASSIGNMENT STRING*/
 char * tempC12 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC12, "%s%s",X10_TEMP35,X10_TEMP36);
const char * X10_TEMP38 = tempC12;; 
fprintf(  stdout, "%s\n",X10_TEMP38 ) ; 
const char * X10_TEMP45 = "Result is " ; 
const uint32_t X10_TEMP39 = verified ; 
/*UpdatableVariableDeclaration*/
char * X10_TEMP42 = "NOT verified." ; 
if ( X10_TEMP39 ) 
{ 
X10_TEMP42 = "verified." ; } 

const char * X10_TEMP43 = X10_TEMP42 ; 
const char * X10_TEMP44 = X10_TEMP43 ; 
/*ASSIGNMENT STRING*/
 char * tempC13 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC13, "%s%s",X10_TEMP45,X10_TEMP44);
const char * X10_TEMP47 = tempC13;; 
fprintf(  stdout, "%s\n",X10_TEMP47 ) ; 
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

Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) 
{ 
struct Region1 r = dn .dReg ; 
const uint32_t regType = r .regType ; 
if ( regType ) 
{ 
struct Dist1 regDist = restrictDistRegular1 ( dn , p ) ; 
return regDist ; 
} 

struct Dist1 arbDist = restrictDistArbitrary1 ( dn , p ) ; 
return arbDist ; 
} 

Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const place_t h = /* here  */ _here(); 
struct Region1 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int32_t dim = dReg .regSize ; 
const int32_t dimMinusOne = dim - one ; 
const int32_t dRegReg = dimMinusOne + 1; 
const int32_t stride1 = 1 ; 
const int32_t dim1 = dReg .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = dReg .low0 ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const dPlace = (/*VALUE ARRAY*/ place_t * ) dDist .placeArray ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const dCounts = (/*VALUE ARRAY*/ int32_t * ) dDist .counts ; 
const int32_t index = /* p . id  */ p; 
/*UpdatableVariableDeclaration*/
int32_t numPoints = dCounts [ index ] 
; 
const int32_t rSizeNumPoints = numPoints ; 
const int32_t rSize = numPoints - one ; 
const int32_t tempReg = rSize + 1; 
const int32_t tempDist = /*SimpleDistributionExpression*/ rSize +1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER6;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER6)[0] = tempReg, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER7;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER7 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER7)[0] = tempDist, TEMPCALLOCPOINTER7 = ((int32_t * )TEMPCALLOCPOINTER7)+1, memset(TEMPCALLOCPOINTER7,0,tempDist*sizeof(int32_t ) ) ); 
const uint32_t cond1 = numPoints > zero ; 
if ( cond1 ) 
{ 
numPoints = 0 ; for ( int32_t pt= 0; pt<  dRegReg; pt++ )
 
{ 
const place_t dP = dPlace [ pt ] 
; 
const uint32_t cond2 = p == dP ; 
if ( cond2 ) 
{ 
const int32_t i = /*PointAccess*/pt ; 
tempArray [ numPoints ] = ( i ) ; 
numPoints = numPoints + one ; } 

} 

} 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER8;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER8 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER8)[0] = tempReg, TEMPCALLOCPOINTER8 = ((int32_t * )TEMPCALLOCPOINTER8)+1, memset(TEMPCALLOCPOINTER8,0,tempReg*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
const int32_t idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/
int32_t f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 dpt  ; 
Point1_Point1( &dpt/*OBJECT INIT IN ASSIGNMENT*/, f1 ) ; 
pointArray[pt] = dpt ; 
} 
/*END OF ARRAY INIT*/struct Region1 dpReg  ; 
Region1_Region1_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist1 dpDistn  ; 
Dist1_Dist1( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const place_t h = /* here  */ _here(); 
struct Region1 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int32_t dim = dReg .regSize ; 
const int32_t dimMinusOne = dim - one ; 
const int32_t dRegReg = dimMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point1 * const dArray = (/*VALUE ARRAY*/ struct Point1 * ) dReg .pointArray ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const dPlace = (/*VALUE ARRAY*/ place_t * ) dDist .placeArray ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const dCounts = (/*VALUE ARRAY*/ int32_t * ) dDist .counts ; 
const int32_t index = /* p . id  */ p; 
/*UpdatableVariableDeclaration*/
int32_t numPoints = dCounts [ index ] 
; 
const int32_t rSizeNumPoints = numPoints ; 
const int32_t rSize = numPoints - one ; 
const int32_t tempReg = rSize + 1; 
const int32_t tempDist = /*SimpleDistributionExpression*/ rSize +1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER12;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER12 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER12)[0] = tempReg, TEMPCALLOCPOINTER12 = ((int32_t * )TEMPCALLOCPOINTER12)+1, memset(TEMPCALLOCPOINTER12,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER13;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER13 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER13)[0] = tempDist, TEMPCALLOCPOINTER13 = ((int32_t * )TEMPCALLOCPOINTER13)+1, memset(TEMPCALLOCPOINTER13,0,tempDist*sizeof(int32_t ) ) ); 
const uint32_t cond1 = numPoints > zero ; 
if ( cond1 ) 
{ 
numPoints = 0 ; for ( int32_t pt= 0; pt<  dRegReg; pt++ )
 
{ 
const place_t dP = dPlace [ pt ] 
; 
const uint32_t cond2 = p == dP ; 
if ( cond2 ) 
{ 
const int32_t i = /*PointAccess*/pt ; 
tempArray [ numPoints ] = ( i ) ; 
numPoints = numPoints + one ; } 

} 

} 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER14;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER14 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER14)[0] = tempReg, TEMPCALLOCPOINTER14 = ((int32_t * )TEMPCALLOCPOINTER14)+1, memset(TEMPCALLOCPOINTER14,0,tempReg*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
const int32_t idx = tempArray [ pt ] 
; 
struct Point1 dpt = dArray [ idx ] 
; 
pointArray[pt] = dpt ; 
} 
/*END OF ARRAY INIT*/struct Region1 dpReg  ; 
Region1_Region1_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist1 dpDistn  ; 
Dist1_Dist1( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
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

Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
const int32_t dDist = /*SimpleDistributionExpression*/ rSizeMinusOne +1; 
void * TEMPCALLOCPOINTER16;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER16 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dDist*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER16)[0] = dDist, TEMPCALLOCPOINTER16 = ((int32_t * )TEMPCALLOCPOINTER16)+1, memset(TEMPCALLOCPOINTER16,0,dDist*sizeof(place_t ) ) ); 
const int32_t N = /* place.MAX_PLACES  */ _max_places(); 
const int32_t q = rSize % N ; 
const int32_t p = rSize / N ; 
/*UpdatableVariableDeclaration*/
int32_t blockSize = p + one ; 
/*UpdatableVariableDeclaration*/
int32_t arraySize = q * blockSize ; 
/*UpdatableVariableDeclaration*/
int32_t offset = 0 ; 
/*UpdatableVariableDeclaration*/
place_t initPlace = /* place.FIRST_PLACE  */ _place_first(); 
getCyclic ( placeArray , arraySize , initPlace , blockSize ) ; 
/*UpdatableVariableDeclaration*/
int32_t remainingPlaces = N - q ; 
const uint32_t cond = remainingPlaces == zero ; 
if ( cond ) 
{ 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER17;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER17 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER17)[0] = dReg, TEMPCALLOCPOINTER17 = ((int32_t * )TEMPCALLOCPOINTER17)+1, memset(TEMPCALLOCPOINTER17,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
const place_t tempPl = placeArray [ pt ] 
; 
vPlaceArray[pt] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
return retDist ; 
} 

offset = arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = /* place.places ( q )  */ _toplace(q ); /*UpdatableVariableDeclaration*/
int32_t chunk = blockSize ; 
const uint32_t ifCond = blockSize > arraySize ; 
if ( ifCond ) 
{ 
chunk = arraySize ; } 

/*UpdatableVariableDeclaration*/
int32_t index = offset ; 
/*UpdatableVariableDeclaration*/
int32_t dSize = index + chunk ; 
dSize = dSize - one ; const int32_t ub0 = chunk - one ; 
const int32_t pointReg0 = ub0 + 1; 
for ( int32_t pt= 0; pt<  pointReg0; pt++ )
 
{ 
const int32_t tempPt = pt+index ; 
placeArray [ tempPt ] = ( initPlace ) ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; /*UpdatableVariableDeclaration*/
place_t pl = /* initPlace . next ( )  */ _place_next(initPlace); 
/*UpdatableVariableDeclaration*/
uint32_t whileCond = arraySize != zero ; 

while ( whileCond ) 
{ 
const uint32_t tailCond = chunk > arraySize ; 
if ( tailCond ) 
{ 
dSize = index + arraySize ; dSize = dSize - one ; const int32_t ub = arraySize - one ; 
const int32_t pointReg1 = ub + 1; 
for ( int32_t pt= 0; pt<  pointReg1; pt++ )
 
{ 
const int32_t tempPt = pt+index ; 
placeArray [ tempPt ] = ( pl ) ; 
} 

arraySize = 0 ; } 
else 
{ 
dSize = index + chunk ; dSize = dSize - one ; const int32_t ub = chunk - one ; 
const int32_t pointReg1 = ub + 1; 
for ( int32_t pt= 0; pt<  pointReg1; pt++ )
 
{ 
const int32_t tempPt = pt+index ; 
placeArray [ tempPt ] = ( pl ) ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; } 


pl = /* pl . next ( )  */ _place_next(pl); whileCond = arraySize != zero ; } 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER18;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER18 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER18)[0] = dReg, TEMPCALLOCPOINTER18 = ((int32_t * )TEMPCALLOCPOINTER18)+1, memset(TEMPCALLOCPOINTER18,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
const place_t tempPl = placeArray [ pt ] 
; 
vPlaceArray[pt] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
return retDist ; 
} 

uint32_t /*static*/getRefArrayValue1boolean (  struct booleanRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct booleanStub * const contents = array .contents ; 
struct booleanStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ uint32_t * const localArray = indexStub .localArray ; 
const uint32_t returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
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

Dist1 /*static*/getUniqueDist ( ) 
{ 
const int32_t one = 1 ; 
const int32_t zero = 0 ; 
const int32_t maxPlaces = /* place.MAX_PLACES  */ _max_places(); 
const int32_t rSize = maxPlaces - one ; 
const int32_t placeRegion = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER25;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER25 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(placeRegion*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER25)[0] = placeRegion, TEMPCALLOCPOINTER25 = ((int32_t * )TEMPCALLOCPOINTER25)+1, memset(TEMPCALLOCPOINTER25,0,placeRegion*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < placeRegion; p++) 

{ 
const int32_t i = /*PointAccess*/p ; 
const place_t pl1 = /* place.places ( i )  */ _toplace(i ); 
vPlaceArray[p] = pl1 ; 
} 
/*END OF ARRAY INIT*/const int32_t minusOne = zero - one ; 
const int32_t pointRegion = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER26;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER26 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(pointRegion*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER26)[0] = pointRegion, TEMPCALLOCPOINTER26 = ((int32_t * )TEMPCALLOCPOINTER26)+1, memset(TEMPCALLOCPOINTER26,0,pointRegion*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < pointRegion; p++) 

{ 
struct Point1 pt1  ; 
Point1_Point1( &pt1/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
pointArray[p] = pt1 ; 
} 
/*END OF ARRAY INIT*/struct Region1 reg  ; 
Region1_Region1_4( &reg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , maxPlaces , zero , maxPlaces ) ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , maxPlaces ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, reg , pointDist1 ) ; 
return retDist ; 
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

void /*static*/setRefArrayValue1boolean (  struct booleanRefArray1 const array , const int32_t index , const uint32_t val ) 
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
/*VALUE ARRAY*/ struct booleanStub * const contents = array .contents ; 
struct booleanStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ uint32_t * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
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

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER33)[0] = dReg, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER34;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER34 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER34)[0] = tempReg, TEMPCALLOCPOINTER34 = ((int32_t * )TEMPCALLOCPOINTER34)+1, memset(TEMPCALLOCPOINTER34,0,tempReg*sizeof(int32_t )) ); 

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
void * TEMPCALLOCPOINTER35;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER35 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER35)[0] = regArr, TEMPCALLOCPOINTER35 = ((int32_t * )TEMPCALLOCPOINTER35)+1, memset(TEMPCALLOCPOINTER35,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER36;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER36 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER36)[0] = regArr, TEMPCALLOCPOINTER36 = ((int32_t * )TEMPCALLOCPOINTER36)+1, memset(TEMPCALLOCPOINTER36,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER37;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER37)[0] = regArr, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,regArr*sizeof(Point1 )) ); 

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

void /*static*/thread1 (  struct T1 const utmpz ) 
{ 
struct Point1 p6 = utmpz .p6 ; 
struct Point1 p1 = utmpz .p1 ; 
struct StreamData tempSd = utmpz .tempSd ; 

{ 
struct Dist1 X10_TEMP18 = tempSd .D ; 
const place_t X10_TEMP19 = /* here  */ _here(); 
struct Dist1 X10_TEMP21 = restrictDist1 ( X10_TEMP18 , X10_TEMP19 ) ; 
struct Region1 RX10_TEMP18 = X10_TEMP21 .dReg ; 
const int32_t RX10_TEMP21 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP19 = RX10_TEMP18 .regSize ; 
RX10_TEMP19 = RX10_TEMP19 - RX10_TEMP21 ; const int32_t RX10_TEMP20 = RX10_TEMP19 + 1; 
for ( int32_t RX10_TEMP17= 0; RX10_TEMP17<  RX10_TEMP20; RX10_TEMP17++ )
 
{ 
const int32_t RX10_TEMP22 = /*PointAccess*/RX10_TEMP17 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP18 , RX10_TEMP22 ) ; 
struct doubleRefArray1 X10_TEMP22 = tempSd .b ; 
const double X10_TEMP31 = 1.5; 
const place_t X10_TEMP24 = /* here  */ _here(); 
const int32_t X10_TEMP25 = /* X10_TEMP24 . id  */ X10_TEMP24; 
const int32_t X10_TEMP27 = X10_TEMP25 * _Stream_LocalSize ; 
const int32_t X10_TEMP28 = i .f0 ; 
const int32_t X10_TEMP30 = X10_TEMP27 + X10_TEMP28 ; 
const double X10_TEMP33 = X10_TEMP31 * X10_TEMP30 ; 
const double X10_TEMP34 = X10_TEMP33 ; 
struct Dist1 RX10_TEMP23 = X10_TEMP22 .distValue ; 
struct Region1 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int32_t RX10_TEMP25 = searchPointInRegion1 ( RX10_TEMP24 , i ) ; 
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
char * RX10_TEMP30 = "Bad place access for array X10_TEMP22" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP22 , RX10_TEMP25 , X10_TEMP34 ) ; 
struct doubleRefArray1 X10_TEMP35 = tempSd .c ; 
const double X10_TEMP44 = 2.5; 
const place_t X10_TEMP37 = /* here  */ _here(); 
const int32_t X10_TEMP38 = /* X10_TEMP37 . id  */ X10_TEMP37; 
const int32_t X10_TEMP40 = X10_TEMP38 * _Stream_LocalSize ; 
const int32_t X10_TEMP41 = i .f0 ; 
const int32_t X10_TEMP43 = X10_TEMP40 + X10_TEMP41 ; 
const double X10_TEMP46 = X10_TEMP44 * X10_TEMP43 ; 
const double X10_TEMP47 = X10_TEMP46 ; 
struct Dist1 RX10_TEMP33 = X10_TEMP35 .distValue ; 
struct Region1 RX10_TEMP34 = RX10_TEMP33 .dReg ; 
const int32_t RX10_TEMP35 = searchPointInRegion1 ( RX10_TEMP34 , i ) ; 
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
char * RX10_TEMP40 = "Bad place access for array X10_TEMP35" ; 
fprintf(stderr, "%s",RX10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP35 , RX10_TEMP35 , X10_TEMP47 ) ; 
} 

struct Dist1 X10_TEMP48 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP43 = X10_TEMP48 .dReg ; 
const int32_t RX10_TEMP44 = searchPointInRegion1 ( RX10_TEMP43 , p6 ) ; 
const int32_t RX10_TEMP45 = 0 ; 
const uint32_t RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; 
if ( RX10_TEMP46 ) 
{ 
const char * RX10_TEMP47 = "Point p6 not found in the distribution X10_TEMP48." ; 
fprintf(stderr, "%s",RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP48 = getPlaceFromDist1 ( X10_TEMP48 , RX10_TEMP44 ) ; 
const place_t X10_TEMP50 = RX10_TEMP48 ; 
const place_t X10_TEMP51 = /* place.FIRST_PLACE  */ _place_first(); 
const uint32_t X10_TEMP53 = X10_TEMP50 == X10_TEMP51 ; 
if ( X10_TEMP53 ) 
{ 
struct doubleRefArray1 X10_TEMP54 = tempSd .times ; 
const double X10_TEMP56 = Stream_mySecond ( ) ; 
const int32_t X10_TEMP57 = 0 ; 
const double X10_TEMP59 = X10_TEMP57 - X10_TEMP56 ; 
const double X10_TEMP60 = X10_TEMP59 ; 
struct Dist1 RX10_TEMP49 = X10_TEMP54 .distValue ; 
struct Region1 RX10_TEMP50 = RX10_TEMP49 .dReg ; 
const int32_t RX10_TEMP51 = searchPointInRegion1 ( RX10_TEMP50 , p1 ) ; 
const int32_t RX10_TEMP52 = 0 ; 
const uint32_t RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; 
if ( RX10_TEMP53 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP54 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP55 = getPlaceFromDist1 ( RX10_TEMP49 , RX10_TEMP51 ) ; 
const place_t RX10_TEMP57 = /* here  */ _here(); 
const uint32_t RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57 ; 
if ( RX10_TEMP58 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP56 = "Bad place access for array X10_TEMP54" ; 
fprintf(stderr, "%s",RX10_TEMP56 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP54 , RX10_TEMP51 , X10_TEMP60 ) ; 
} 

struct Dist1 X10_TEMP62 = tempSd .D ; 
const place_t X10_TEMP63 = /* here  */ _here(); 
struct Dist1 X10_TEMP65 = restrictDist1 ( X10_TEMP62 , X10_TEMP63 ) ; 
struct Region1 RX10_TEMP60 = X10_TEMP65 .dReg ; 
const int32_t RX10_TEMP63 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP61 = RX10_TEMP60 .regSize ; 
RX10_TEMP61 = RX10_TEMP61 - RX10_TEMP63 ; const int32_t RX10_TEMP62 = RX10_TEMP61 + 1; 
for ( int32_t RX10_TEMP59= 0; RX10_TEMP59<  RX10_TEMP62; RX10_TEMP59++ )
 
{ 
const int32_t RX10_TEMP64 = /*PointAccess*/RX10_TEMP59 ; 
struct Point1 p4 = regionOrdinalPoint1 ( RX10_TEMP60 , RX10_TEMP64 ) ; 
struct doubleRefArray1 X10_TEMP66 = tempSd .a ; 
struct doubleRefArray1 X10_TEMP68 = tempSd .b ; 
struct Dist1 RX10_TEMP65 = X10_TEMP68 .distValue ; 
struct Region1 RX10_TEMP66 = RX10_TEMP65 .dReg ; 
const int32_t RX10_TEMP67 = searchPointInRegion1 ( RX10_TEMP66 , p4 ) ; 
const int32_t RX10_TEMP68 = 0 ; 
const uint32_t RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68 ; 
if ( RX10_TEMP69 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP70 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP70 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP71 = getPlaceFromDist1 ( RX10_TEMP65 , RX10_TEMP67 ) ; 
const place_t RX10_TEMP73 = /* here  */ _here(); 
const uint32_t RX10_TEMP74 = RX10_TEMP71 != RX10_TEMP73 ; 
if ( RX10_TEMP74 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP72 = "Bad place access for array X10_TEMP68" ; 
fprintf(stderr, "%s",RX10_TEMP72 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP75 = getRefArrayValue1double ( X10_TEMP68 , RX10_TEMP67 ) ; 
const double X10_TEMP73 = RX10_TEMP75 ; 
struct doubleRefArray1 X10_TEMP70 = tempSd .c ; 
struct Dist1 RX10_TEMP76 = X10_TEMP70 .distValue ; 
struct Region1 RX10_TEMP77 = RX10_TEMP76 .dReg ; 
const int32_t RX10_TEMP78 = searchPointInRegion1 ( RX10_TEMP77 , p4 ) ; 
const int32_t RX10_TEMP79 = 0 ; 
const uint32_t RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79 ; 
if ( RX10_TEMP80 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP81 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP81 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP82 = getPlaceFromDist1 ( RX10_TEMP76 , RX10_TEMP78 ) ; 
const place_t RX10_TEMP84 = /* here  */ _here(); 
const uint32_t RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84 ; 
if ( RX10_TEMP85 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP83 = "Bad place access for array X10_TEMP70" ; 
fprintf(stderr, "%s",RX10_TEMP83 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP86 = getRefArrayValue1double ( X10_TEMP70 , RX10_TEMP78 ) ; 
const double X10_TEMP72 = RX10_TEMP86 ; 
const double X10_TEMP74 = _Stream_alpha * X10_TEMP72 ; 
const double X10_TEMP76 = X10_TEMP73 + X10_TEMP74 ; 
const double X10_TEMP77 = X10_TEMP76 ; 
struct Dist1 RX10_TEMP87 = X10_TEMP66 .distValue ; 
struct Region1 RX10_TEMP88 = RX10_TEMP87 .dReg ; 
const int32_t RX10_TEMP89 = searchPointInRegion1 ( RX10_TEMP88 , p4 ) ; 
const int32_t RX10_TEMP90 = 0 ; 
const uint32_t RX10_TEMP91 = RX10_TEMP89 < RX10_TEMP90 ; 
if ( RX10_TEMP91 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP92 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP92 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP93 = getPlaceFromDist1 ( RX10_TEMP87 , RX10_TEMP89 ) ; 
const place_t RX10_TEMP95 = /* here  */ _here(); 
const uint32_t RX10_TEMP96 = RX10_TEMP93 != RX10_TEMP95 ; 
if ( RX10_TEMP96 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP94 = "Bad place access for array X10_TEMP66" ; 
fprintf(stderr, "%s",RX10_TEMP94 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP66 , RX10_TEMP89 , X10_TEMP77 ) ; 
} 

} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
struct Point1 p5 = utmpz .p5 ; 
struct Point1 p1 = utmpz .p1 ; 
struct StreamData tempSd = utmpz .tempSd ; 

{ 
struct Dist1 X10_TEMP81 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP109 = X10_TEMP81 .dReg ; 
const int32_t RX10_TEMP110 = searchPointInRegion1 ( RX10_TEMP109 , p5 ) ; 
const int32_t RX10_TEMP111 = 0 ; 
const uint32_t RX10_TEMP112 = RX10_TEMP110 < RX10_TEMP111 ; 
if ( RX10_TEMP112 ) 
{ 
const char * RX10_TEMP113 = "Point p5 not found in the distribution X10_TEMP81." ; 
fprintf(stderr, "%s",RX10_TEMP113 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP114 = getPlaceFromDist1 ( X10_TEMP81 , RX10_TEMP110 ) ; 
const place_t X10_TEMP83 = RX10_TEMP114 ; 
const place_t X10_TEMP84 = /* place.FIRST_PLACE  */ _place_first(); 
const uint32_t X10_TEMP86 = X10_TEMP83 == X10_TEMP84 ; 
if ( X10_TEMP86 ) 
{ 
struct doubleRefArray1 X10_TEMP87 = tempSd .times ; 
struct doubleRefArray1 X10_TEMP89 = tempSd .times ; 
struct Dist1 RX10_TEMP115 = X10_TEMP89 .distValue ; 
struct Region1 RX10_TEMP116 = RX10_TEMP115 .dReg ; 
const int32_t RX10_TEMP117 = searchPointInRegion1 ( RX10_TEMP116 , p1 ) ; 
const int32_t RX10_TEMP118 = 0 ; 
const uint32_t RX10_TEMP119 = RX10_TEMP117 < RX10_TEMP118 ; 
if ( RX10_TEMP119 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP120 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP120 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP121 = getPlaceFromDist1 ( RX10_TEMP115 , RX10_TEMP117 ) ; 
const place_t RX10_TEMP123 = /* here  */ _here(); 
const uint32_t RX10_TEMP124 = RX10_TEMP121 != RX10_TEMP123 ; 
if ( RX10_TEMP124 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP122 = "Bad place access for array X10_TEMP89" ; 
fprintf(stderr, "%s",RX10_TEMP122 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP125 = getRefArrayValue1double ( X10_TEMP89 , RX10_TEMP117 ) ; 
const double X10_TEMP91 = RX10_TEMP125 ; 
const double X10_TEMP92 = Stream_mySecond ( ) ; 
const double X10_TEMP94 = X10_TEMP91 + X10_TEMP92 ; 
const double X10_TEMP95 = X10_TEMP94 ; 
struct Dist1 RX10_TEMP126 = X10_TEMP87 .distValue ; 
struct Region1 RX10_TEMP127 = RX10_TEMP126 .dReg ; 
const int32_t RX10_TEMP128 = searchPointInRegion1 ( RX10_TEMP127 , p1 ) ; 
const int32_t RX10_TEMP129 = 0 ; 
const uint32_t RX10_TEMP130 = RX10_TEMP128 < RX10_TEMP129 ; 
if ( RX10_TEMP130 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP131 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP131 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP132 = getPlaceFromDist1 ( RX10_TEMP126 , RX10_TEMP128 ) ; 
const place_t RX10_TEMP134 = /* here  */ _here(); 
const uint32_t RX10_TEMP135 = RX10_TEMP132 != RX10_TEMP134 ; 
if ( RX10_TEMP135 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP133 = "Bad place access for array X10_TEMP87" ; 
fprintf(stderr, "%s",RX10_TEMP133 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP87 , RX10_TEMP128 , X10_TEMP95 ) ; 
} 

} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
struct StreamData tempSd = utmpz .tempSd ; 

{ 
struct Dist1 X10_TEMP100 = tempSd .D ; 
const place_t X10_TEMP101 = /* here  */ _here(); 
struct Dist1 X10_TEMP103 = restrictDist1 ( X10_TEMP100 , X10_TEMP101 ) ; 
struct Region1 RX10_TEMP149 = X10_TEMP103 .dReg ; 
const int32_t RX10_TEMP152 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP150 = RX10_TEMP149 .regSize ; 
RX10_TEMP150 = RX10_TEMP150 - RX10_TEMP152 ; const int32_t RX10_TEMP151 = RX10_TEMP150 + 1; 
for ( int32_t RX10_TEMP148= 0; RX10_TEMP148<  RX10_TEMP151; RX10_TEMP148++ )
 
{ 
const int32_t RX10_TEMP153 = /*PointAccess*/RX10_TEMP148 ; 
struct Point1 p3 = regionOrdinalPoint1 ( RX10_TEMP149 , RX10_TEMP153 ) ; 
struct doubleRefArray1 X10_TEMP104 = tempSd .a ; 
struct Dist1 RX10_TEMP154 = X10_TEMP104 .distValue ; 
struct Region1 RX10_TEMP155 = RX10_TEMP154 .dReg ; 
const int32_t RX10_TEMP156 = searchPointInRegion1 ( RX10_TEMP155 , p3 ) ; 
const int32_t RX10_TEMP157 = 0 ; 
const uint32_t RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157 ; 
if ( RX10_TEMP158 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP159 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP159 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP160 = getPlaceFromDist1 ( RX10_TEMP154 , RX10_TEMP156 ) ; 
const place_t RX10_TEMP162 = /* here  */ _here(); 
const uint32_t RX10_TEMP163 = RX10_TEMP160 != RX10_TEMP162 ; 
if ( RX10_TEMP163 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP161 = "Bad place access for array X10_TEMP104" ; 
fprintf(stderr, "%s",RX10_TEMP161 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP164 = getRefArrayValue1double ( X10_TEMP104 , RX10_TEMP156 ) ; 
const double X10_TEMP113 = RX10_TEMP164 ; 
struct doubleRefArray1 X10_TEMP106 = tempSd .b ; 
struct Dist1 RX10_TEMP165 = X10_TEMP106 .distValue ; 
struct Region1 RX10_TEMP166 = RX10_TEMP165 .dReg ; 
const int32_t RX10_TEMP167 = searchPointInRegion1 ( RX10_TEMP166 , p3 ) ; 
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
char * RX10_TEMP172 = "Bad place access for array X10_TEMP106" ; 
fprintf(stderr, "%s",RX10_TEMP172 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP175 = getRefArrayValue1double ( X10_TEMP106 , RX10_TEMP167 ) ; 
const double X10_TEMP111 = RX10_TEMP175 ; 
struct doubleRefArray1 X10_TEMP108 = tempSd .c ; 
struct Dist1 RX10_TEMP176 = X10_TEMP108 .distValue ; 
struct Region1 RX10_TEMP177 = RX10_TEMP176 .dReg ; 
const int32_t RX10_TEMP178 = searchPointInRegion1 ( RX10_TEMP177 , p3 ) ; 
const int32_t RX10_TEMP179 = 0 ; 
const uint32_t RX10_TEMP180 = RX10_TEMP178 < RX10_TEMP179 ; 
if ( RX10_TEMP180 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP181 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP181 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP182 = getPlaceFromDist1 ( RX10_TEMP176 , RX10_TEMP178 ) ; 
const place_t RX10_TEMP184 = /* here  */ _here(); 
const uint32_t RX10_TEMP185 = RX10_TEMP182 != RX10_TEMP184 ; 
if ( RX10_TEMP185 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP183 = "Bad place access for array X10_TEMP108" ; 
fprintf(stderr, "%s",RX10_TEMP183 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP186 = getRefArrayValue1double ( X10_TEMP108 , RX10_TEMP178 ) ; 
const double X10_TEMP110 = RX10_TEMP186 ; 
const double X10_TEMP112 = _Stream_alpha * X10_TEMP110 ; 
const double X10_TEMP114 = X10_TEMP111 + X10_TEMP112 ; 
const uint32_t X10_TEMP116 = X10_TEMP113 != X10_TEMP114 ; 
if ( X10_TEMP116 ) 
{ 
const place_t X10_TEMP118 = /* place.FIRST_PLACE  */ _place_first(); 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, tempSd ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, X10_TEMP118 );


}/*END OF ASYNC*/
} 

} 

} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
struct StreamData tempSd = utmpz .tempSd ; 

{ 
struct booleanRefArray1 X10_TEMP119 = tempSd .verified ; 
const int32_t X10_TEMP121 = 0 ; 
const uint32_t X10_TEMP123 = 0 ; 
const uint32_t X10_TEMP124 = X10_TEMP123 ; 
struct Point1 RX10_TEMP187  ; 
Point1_Point1( &RX10_TEMP187/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP121 ) ; 
struct Dist1 RX10_TEMP188 = X10_TEMP119 .distValue ; 
struct Region1 RX10_TEMP189 = RX10_TEMP188 .dReg ; 
const int32_t RX10_TEMP190 = searchPointInRegion1 ( RX10_TEMP189 , RX10_TEMP187 ) ; 
const int32_t RX10_TEMP191 = 0 ; 
const uint32_t RX10_TEMP192 = RX10_TEMP190 < RX10_TEMP191 ; 
if ( RX10_TEMP192 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP193 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP193 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP194 = getPlaceFromDist1 ( RX10_TEMP188 , RX10_TEMP190 ) ; 
const place_t RX10_TEMP196 = /* here  */ _here(); 
const uint32_t RX10_TEMP197 = RX10_TEMP194 != RX10_TEMP196 ; 
if ( RX10_TEMP197 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP195 = "Bad place access for array X10_TEMP119" ; 
fprintf(stderr, "%s",RX10_TEMP195 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1boolean ( X10_TEMP119 , RX10_TEMP190 , X10_TEMP124 ) ; 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS,  struct Point1 const a_p6 ,  struct Point1 const a_p1 ,  struct StreamData const a_tempSd ) 
{ 
T1THIS->p6 = ( a_p6 ) ; 
T1THIS->p1 = ( a_p1 ) ; 
T1THIS->tempSd = ( a_tempSd ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS,  struct Point1 const a_p5 ,  struct Point1 const a_p1 ,  struct StreamData const a_tempSd ) 
{ 
T2THIS->p5 = ( a_p5 ) ; 
T2THIS->p1 = ( a_p1 ) ; 
T2THIS->tempSd = ( a_tempSd ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS,  struct StreamData const a_tempSd ) 
{ 
T3THIS->tempSd = ( a_tempSd ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T4THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T4THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T4THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T4THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T4THIS->THIS = *TimerTHIS;
 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T5THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T5THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T5THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T5THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T5THIS->THIS = *TimerTHIS;
 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T6THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T6THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T6THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T6THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T6THIS->THIS = *TimerTHIS;
 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, struct StreamData * StreamDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct booleanStub * const a_RX10_TEMP6 ) 
{ 
T7THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T7THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T7THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T7THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T7THIS->THIS = *StreamDataTHIS;
 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct StreamData * StreamDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T8THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T8THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T8THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T8THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T8THIS->THIS = *StreamDataTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS,  struct StreamData const a_tempSd ) 
{ 
T9THIS->tempSd = ( a_tempSd ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T10THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T10THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T10THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T10THIS->THIS = *TimerTHIS;
 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T11THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T11THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T11THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T11THIS->THIS = *TimerTHIS;
 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T12THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T12THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T12THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T12THIS->THIS = *TimerTHIS;
 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, struct StreamData * StreamDataTHIS /*this*/ ,  struct booleanStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct booleanStub * const a_RX10_TEMP6 ) 
{ 
T13THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T13THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T13THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T13THIS->THIS = *StreamDataTHIS;
 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct StreamData * StreamDataTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T14THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T14THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T14THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T14THIS->THIS = *StreamDataTHIS;
 return  *T14THIS; 

} 

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

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

Stream *Stream_Stream ( struct Stream *StreamTHIS) 
{ 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP3 = /*program*/_Stream_N ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP4 = /*program*/_Stream_NUM_TIMES ; 
struct StreamData X10_TEMP6  ; 
StreamData_StreamData( &X10_TEMP6/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP3 , X10_TEMP4 ) ; 
StreamTHIS->sd = ( X10_TEMP6 ) ; 

 return  StreamTHIS; 

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
void * TEMPCALLOCPOINTER38;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER38 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(countDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER38)[0] = countDist, TEMPCALLOCPOINTER38 = ((int32_t * )TEMPCALLOCPOINTER38)+1, memset(TEMPCALLOCPOINTER38,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER39;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER39 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(runSumDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER39)[0] = runSumDist, TEMPCALLOCPOINTER39 = ((int32_t * )TEMPCALLOCPOINTER39)+1, memset(TEMPCALLOCPOINTER39,0,runSumDist*sizeof(int32_t ) ) ); 
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
/*VALUE ARRAY*/ int32_t * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

} 

booleanStub booleanStub_booleanStub ( struct booleanStub *booleanStubTHIS, /*Updatable ARRAY*/ uint32_t * const localArray_ ) 
{ 
booleanStubTHIS->localArray = ( localArray_ ) ; 

 return  *booleanStubTHIS; 

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
void * TEMPCALLOCPOINTER42;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER42 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER42)[0] = RX10_TEMP5, TEMPCALLOCPOINTER42 = ((int32_t * )TEMPCALLOCPOINTER42)+1, memset(TEMPCALLOCPOINTER42,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC4) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER43;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER43 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER43)[0] = RX10_TEMP4, TEMPCALLOCPOINTER43 = ((int32_t * )TEMPCALLOCPOINTER43)+1, memset(TEMPCALLOCPOINTER43,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER44;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER44 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER44)[0] = RX10_TEMP26, TEMPCALLOCPOINTER44 = ((int32_t * )TEMPCALLOCPOINTER44)+1, memset(TEMPCALLOCPOINTER44,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC5) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER45;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER45 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER45)[0] = RX10_TEMP25, TEMPCALLOCPOINTER45 = ((int32_t * )TEMPCALLOCPOINTER45)+1, memset(TEMPCALLOCPOINTER45,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER46;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER46 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER46)[0] = RX10_TEMP47, TEMPCALLOCPOINTER46 = ((int32_t * )TEMPCALLOCPOINTER46)+1, memset(TEMPCALLOCPOINTER46,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC6) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER47;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER47 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER47)[0] = RX10_TEMP46, TEMPCALLOCPOINTER47 = ((int32_t * )TEMPCALLOCPOINTER47)+1, memset(TEMPCALLOCPOINTER47,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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

void thread4 ( struct Timer *TimerTHIS,  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER49;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP14*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER49)[0] = RX10_TEMP14, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC7) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread5 ( struct Timer *TimerTHIS,  struct T5 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER51;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP35*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER51)[0] = RX10_TEMP35, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC8) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread6 ( struct Timer *TimerTHIS,  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER53;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER53 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP56*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER53)[0] = RX10_TEMP56, TEMPCALLOCPOINTER53 = ((int32_t * )TEMPCALLOCPOINTER53)+1, memset(TEMPCALLOCPOINTER53,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC9) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread11 ( struct Timer *TimerTHIS,  struct T11 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread12 ( struct Timer *TimerTHIS,  struct T12 const utmpz ) 
{ 
struct doubleStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; 
} 
} 


booleanRefArray1 booleanRefArray1_booleanRefArray1 ( struct booleanRefArray1 *booleanRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct booleanStub * const contents_ ) 
{ 
booleanRefArray1THIS->distValue = ( distValue_ ) ; 
booleanRefArray1THIS->contents = ( contents_ ) ; 

 return  *booleanRefArray1THIS; 

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

StreamData StreamData_StreamData ( struct StreamData *StreamDataTHIS, const int64_t N , const int32_t NUM_TIMES ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 0 ; 
struct Region1 X10_TEMP5 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
struct Dist1 dverified = getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; 
struct booleanRefArray1 X10_TEMP11 = StreamData_initVerified ( StreamDataTHIS, dverified ) ; 
StreamDataTHIS->verified = ( X10_TEMP11 ) ; 
const int32_t X10_TEMP17 = 0 ; 
const int32_t X10_TEMP13 = 1 ; 
const int64_t X10_TEMP15 = N - X10_TEMP13 ; 
const int32_t X10_TEMP18 = /*casting*/( int32_t ) X10_TEMP15 ; 
struct Region1 X10_TEMP20 = createNewRegion1R ( X10_TEMP17 , X10_TEMP18 ) ; 
struct Dist1 X10_TEMP21 = getBlockDist1 ( X10_TEMP20 ) ; 
struct Dist1 temp_D = X10_TEMP21 ; 
StreamDataTHIS->D = ( temp_D ) ; 
const int32_t X10_TEMP30 = 0 ; 
const int32_t X10_TEMP26 = 1 ; 
const int32_t X10_TEMP28 = NUM_TIMES - X10_TEMP26 ; 
const int32_t X10_TEMP31 = /*casting*/( int32_t ) X10_TEMP28 ; 
struct Region1 X10_TEMP32 = createNewRegion1R ( X10_TEMP30 , X10_TEMP31 ) ; 
const place_t X10_TEMP33 = /* here  */ _here(); 
struct Dist1 X10_TEMP35 = getPlaceDist1 ( X10_TEMP32 , X10_TEMP33 ) ; 
struct doubleRefArray1 X10_TEMP37 = StreamData_initArray ( StreamDataTHIS, X10_TEMP35 ) ; 
StreamDataTHIS->times = ( X10_TEMP37 ) ; 
struct doubleRefArray1 X10_TEMP41 = StreamData_initArray ( StreamDataTHIS, temp_D ) ; 
StreamDataTHIS->a = ( X10_TEMP41 ) ; 
struct doubleRefArray1 X10_TEMP45 = StreamData_initArray ( StreamDataTHIS, temp_D ) ; 
StreamDataTHIS->b = ( X10_TEMP45 ) ; 
struct doubleRefArray1 X10_TEMP49 = StreamData_initArray ( StreamDataTHIS, temp_D ) ; 
StreamDataTHIS->c = ( X10_TEMP49 ) ; 

 return  *StreamDataTHIS; 

} 
booleanRefArray1 StreamData_initVerified ( struct StreamData *StreamDataTHIS,  struct Dist1 const d ) 
{ 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ;; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER57;
/*Updatable ARRAY*/ struct booleanStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct booleanStub * ) ( TEMPCALLOCPOINTER57 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( booleanStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( booleanStub )),((int32_t * )TEMPCALLOCPOINTER57)[0] = RX10_TEMP5, TEMPCALLOCPOINTER57 = ((int32_t * )TEMPCALLOCPOINTER57)+1, memset(TEMPCALLOCPOINTER57,0,RX10_TEMP5*sizeof(booleanStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, StreamDataTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC10) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER58;
/*VALUE ARRAY*/ struct booleanStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct booleanStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER58 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( booleanStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( booleanStub )),((int32_t * )TEMPCALLOCPOINTER58)[0] = RX10_TEMP4, TEMPCALLOCPOINTER58 = ((int32_t * )TEMPCALLOCPOINTER58)+1, memset(TEMPCALLOCPOINTER58,0,RX10_TEMP4*sizeof(booleanStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct booleanStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct booleanRefArray1 RX10_TEMP20  ; 
booleanRefArray1_booleanRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP17 ) ; 
struct booleanRefArray1 X10_TEMP3 = RX10_TEMP20 ; 
return X10_TEMP3 ; 
} 

doubleRefArray1 StreamData_initArray ( struct StreamData *StreamDataTHIS,  struct Dist1 const d ) 
{ 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER59;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER59 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER59)[0] = RX10_TEMP5, TEMPCALLOCPOINTER59 = ((int32_t * )TEMPCALLOCPOINTER59)+1, memset(TEMPCALLOCPOINTER59,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, StreamDataTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC11) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER60;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER60 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER60)[0] = RX10_TEMP4, TEMPCALLOCPOINTER60 = ((int32_t * )TEMPCALLOCPOINTER60)+1, memset(TEMPCALLOCPOINTER60,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP17 ) ; 
struct doubleRefArray1 X10_TEMP3 = RX10_TEMP20 ; 
return X10_TEMP3 ; 
} 

void thread7 ( struct StreamData *StreamDataTHIS,  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct booleanStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER62;
/*Updatable ARRAY*/ uint32_t * const RX10_TEMP15 = (/*Updatable ARRAY*/ uint32_t * ) ( TEMPCALLOCPOINTER62 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( uint32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP14*sizeof( uint32_t )),((int32_t * )TEMPCALLOCPOINTER62)[0] = RX10_TEMP14, TEMPCALLOCPOINTER62 = ((int32_t * )TEMPCALLOCPOINTER62)+1, memset(TEMPCALLOCPOINTER62,0,RX10_TEMP14*sizeof(uint32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const uint32_t X10_TEMP2 = 1 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP2 ; 
} 
/*END OF ARRAY INIT*/struct booleanStub RX10_TEMP16  ; 
booleanStub_booleanStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, StreamDataTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC12) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread8 ( struct StreamData *StreamDataTHIS,  struct T8 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER64;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER64 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP14*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER64)[0] = RX10_TEMP14, TEMPCALLOCPOINTER64 = ((int32_t * )TEMPCALLOCPOINTER64)+1, memset(TEMPCALLOCPOINTER64,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP2 = 0.0f; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP2 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, StreamDataTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC13) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread13 ( struct StreamData *StreamDataTHIS,  struct T13 const utmpz ) 
{ 
struct booleanStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct booleanStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread14 ( struct StreamData *StreamDataTHIS,  struct T14 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 


doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) 
{ 
doubleStubTHIS->localArray = ( localArray_ ) ; 

 return  *doubleStubTHIS; 

} 
/* class RunMain */ int32_t  runmain( ) 
{ 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_Stream_MEG = _Stream_MEG_init ( ) ; 
_Stream_alpha = _Stream_alpha_init ( ) ; 
_Stream_NUM_TIMES = _Stream_NUM_TIMES_init ( ) ; 
_Stream_N0 = _Stream_N0_init ( ) ; 
_Stream_N = _Stream_N_init ( ) ; 
_Stream_LocalSize = _Stream_LocalSize_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_Stream_MEG = _Stream_MEG_init ( ) ; 
_Stream_alpha = _Stream_alpha_init ( ) ; 
_Stream_NUM_TIMES = _Stream_NUM_TIMES_init ( ) ; 
_Stream_N0 = _Stream_N0_init ( ) ; 
_Stream_N = _Stream_N_init ( ) ; 
_Stream_LocalSize = _Stream_LocalSize_init ( ) ; 

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
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC4 :
		 fixPointerT4(((struct T4 * const )params), (params+sizeof(struct T4)));
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC5 :
		 fixPointerT5(((struct T5 * const )params), (params+sizeof(struct T5)));
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC6 :
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
		break;
	 case ASYNC7 :
		 fixPointerT10(((struct T10 * const )params), (params+sizeof(struct T10)));
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC8 :
		 fixPointerT11(((struct T11 * const )params), (params+sizeof(struct T11)));
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC9 :
		 fixPointerT12(((struct T12 * const )params), (params+sizeof(struct T12)));
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC10 :
		 fixPointerT7(((struct T7 * const )params), (params+sizeof(struct T7)));
		thread7(&(*((struct T7 * const )params)).THIS, *((struct T7 * const )params));
		break;
	 case ASYNC11 :
		 fixPointerT8(((struct T8 * const )params), (params+sizeof(struct T8)));
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC12 :
		 fixPointerT13(((struct T13 * const )params), (params+sizeof(struct T13)));
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC13 :
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
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
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC4 :
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC5 :
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC6 :
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
		break;
	 case ASYNC7 :
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC8 :
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC9 :
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC10 :
		thread7(&(*((struct T7 * const )params)).THIS, *((struct T7 * const )params));
		break;
	 case ASYNC11 :
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC12 :
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC13 :
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
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
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT1((struct T1 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC1 :
		 sizeToMalloc = child.size+ getSizeOfT2((struct T2 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT2((struct T2 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC2 :
		 sizeToMalloc = child.size+ getSizeOfT3((struct T3 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT3((struct T3 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC3 :
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC4 :
		 sizeToMalloc = child.size+ getSizeOfT4((struct T4 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT4((struct T4 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC5 :
		 sizeToMalloc = child.size+ getSizeOfT5((struct T5 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT5((struct T5 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC6 :
		 sizeToMalloc = child.size+ getSizeOfT6((struct T6 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT6((struct T6 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC7 :
		 sizeToMalloc = child.size+ getSizeOfT10((struct T10 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT10((struct T10 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC8 :
		 sizeToMalloc = child.size+ getSizeOfT11((struct T11 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT11((struct T11 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC9 :
		 sizeToMalloc = child.size+ getSizeOfT12((struct T12 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT12((struct T12 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC10 :
		 sizeToMalloc = child.size+ getSizeOfT7((struct T7 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT7((struct T7 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += (sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 default:
 
	fprintf(stderr, "%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\n", _here());
	break;
}
}
int32_t getSizeOfbooleanStub( struct booleanStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfStreamData( struct StreamData * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfbooleanRefArray1(&(className -> verified));
    temp += getSizeOfDist1(&(className -> D));
    temp += getSizeOfdoubleRefArray1(&(className -> times));
    temp += getSizeOfdoubleRefArray1(&(className -> a));
    temp += getSizeOfdoubleRefArray1(&(className -> b));
    temp += getSizeOfdoubleRefArray1(&(className -> c));
return temp;
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
int32_t getSizeOfT8( struct T8 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT9( struct T9 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfStreamData(&(className -> tempSd));
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
int32_t getSizeOfT1( struct T1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> p6));
    temp += getSizeOfPoint1(&(className -> p1));
    temp += getSizeOfStreamData(&(className -> tempSd));
return temp;
 }
int32_t getSizeOfbooleanRefArray1( struct booleanRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(booleanStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfbooleanStub(&(className -> contents[i]));
	}
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
int32_t getSizeOfT3( struct T3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfStreamData(&(className -> tempSd));
return temp;
 }
int32_t getSizeOfT2( struct T2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> p5));
    temp += getSizeOfPoint1(&(className -> p1));
    temp += getSizeOfStreamData(&(className -> tempSd));
return temp;
 }
int32_t getSizeOfPoint1( struct Point1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT10( struct T10 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT11( struct T11 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT12( struct T12 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfT13( struct T13 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfbooleanStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT14( struct T14 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
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
void* deepCopybooleanStub( struct booleanStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyStreamData( struct StreamData * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopybooleanRefArray1(&(className -> verified), offset);
offset = deepCopyDist1(&(className -> D), offset);
offset = deepCopydoubleRefArray1(&(className -> times), offset);
offset = deepCopydoubleRefArray1(&(className -> a), offset);
offset = deepCopydoubleRefArray1(&(className -> b), offset);
offset = deepCopydoubleRefArray1(&(className -> c), offset);
return offset;
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
void* deepCopyT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyStreamData(&(className -> tempSd), offset);
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
void* deepCopyT1( struct T1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> p6), offset);
offset = deepCopyPoint1(&(className -> p1), offset);
offset = deepCopyStreamData(&(className -> tempSd), offset);
return offset;
 }
void* deepCopybooleanRefArray1( struct booleanRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(booleanStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopybooleanStub(&(className -> contents[i]), offset);
    }
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
void* deepCopyT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyStreamData(&(className -> tempSd), offset);
return offset;
 }
void* deepCopyT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> p5), offset);
offset = deepCopyPoint1(&(className -> p1), offset);
offset = deepCopyStreamData(&(className -> tempSd), offset);
return offset;
 }
void* deepCopyPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopyT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopybooleanStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
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
void * fixPointerbooleanStub( struct booleanStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerStreamData( struct StreamData * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerbooleanRefArray1(&(className -> verified), offset);
offset  = fixPointerDist1(&(className -> D), offset);
offset  = fixPointerdoubleRefArray1(&(className -> times), offset);
offset  = fixPointerdoubleRefArray1(&(className -> a), offset);
offset  = fixPointerdoubleRefArray1(&(className -> b), offset);
offset  = fixPointerdoubleRefArray1(&(className -> c), offset);
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
void * fixPointerT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerStreamData(&(className -> tempSd), offset);
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
void * fixPointerT1( struct T1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> p6), offset);
offset  = fixPointerPoint1(&(className -> p1), offset);
offset  = fixPointerStreamData(&(className -> tempSd), offset);
return offset;
 }
void * fixPointerbooleanRefArray1( struct booleanRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(booleanStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerbooleanStub(&(className -> contents[i]), offset);
    }
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
void * fixPointerT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerStreamData(&(className -> tempSd), offset);
return offset;
 }
void * fixPointerT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> p5), offset);
offset  = fixPointerPoint1(&(className -> p1), offset);
offset  = fixPointerStreamData(&(className -> tempSd), offset);
return offset;
 }
void * fixPointerPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerbooleanStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
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
