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
struct Series * X10_TEMP4 = (struct Series  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Series ))),malloc(sizeof(struct Series )));  
memset(X10_TEMP4,0,sizeof(struct Series )); 
Series_Series( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
Series_run ( X10_TEMP4 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for series: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC1, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC1;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC2, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC2;; 
fprintf(  stdout, "%s\n",X10_TEMP12 ) ; 
} 

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

void /*static*/Series_setSize (  struct Series  * const X10_TEMP0 , const int32_t setsize ) 
{ 
const int32_t X10_TEMP2 = setsize ; 
X10_TEMP0 ->setsize = ( X10_TEMP2 ) ; 
} 

void /*static*/Series_initialise (  struct Series  * const X10_TEMP0 , const int32_t n ) 
{ 
const int32_t X10_TEMP2 = n ; 
X10_TEMP0 ->array_rows = ( X10_TEMP2 ) ; 
Series_buildTestData ( X10_TEMP0 ) ; 
} 

void /*static*/Series_kernel (  struct Series  * const X10_TEMP0 ) 
{ 
Series_Do ( X10_TEMP0 ) ; 
} 

void /*static*/Series_initRefArray (  struct Series  * const X10_TEMP0 ,  struct doubleRefArray2 const ref ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 0 ; 
const double X10_TEMP6 = 2.8729524964837996; 
const double X10_TEMP7 = X10_TEMP6 ; 
struct Point2 RX10_TEMP0  ; 
Point2_Point2( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP3 , X10_TEMP4 ) ; 
struct Dist2 RX10_TEMP1 = ref .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP3 , X10_TEMP7 ) ; 
const int32_t X10_TEMP10 = 0 ; 
const int32_t X10_TEMP11 = 1 ; 
const double X10_TEMP13 = 0.0; 
const double X10_TEMP14 = X10_TEMP13 ; 
struct Point2 RX10_TEMP11  ; 
Point2_Point2( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP10 , X10_TEMP11 ) ; 
struct Dist2 RX10_TEMP12 = ref .distValue ; 
struct Region2 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int32_t RX10_TEMP14 = searchPointInRegion2 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int32_t RX10_TEMP15 = 0 ; 
const uint32_t RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP18 = getPlaceFromDist2 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const place_t RX10_TEMP20 = /* here  */ _here(); 
const uint32_t RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP19 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP14 , X10_TEMP14 ) ; 
const int32_t X10_TEMP17 = 1 ; 
const int32_t X10_TEMP18 = 0 ; 
const double X10_TEMP20 = 1.1161046676147888; 
const double X10_TEMP21 = X10_TEMP20 ; 
struct Point2 RX10_TEMP22  ; 
Point2_Point2( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP17 , X10_TEMP18 ) ; 
struct Dist2 RX10_TEMP23 = ref .distValue ; 
struct Region2 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int32_t RX10_TEMP25 = searchPointInRegion2 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int32_t RX10_TEMP26 = 0 ; 
const uint32_t RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP29 = getPlaceFromDist2 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const place_t RX10_TEMP31 = /* here  */ _here(); 
const uint32_t RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP30 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP25 , X10_TEMP21 ) ; 
const int32_t X10_TEMP24 = 1 ; 
const int32_t X10_TEMP25 = 1 ; 
const double X10_TEMP26 = 1.8819691893398025; 
const int32_t X10_TEMP27 = 0 ; 
const double X10_TEMP29 = X10_TEMP27 - X10_TEMP26 ; 
const double X10_TEMP30 = X10_TEMP29 ; 
struct Point2 RX10_TEMP33  ; 
Point2_Point2( &RX10_TEMP33/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP24 , X10_TEMP25 ) ; 
struct Dist2 RX10_TEMP34 = ref .distValue ; 
struct Region2 RX10_TEMP35 = RX10_TEMP34 .dReg ; 
const int32_t RX10_TEMP36 = searchPointInRegion2 ( RX10_TEMP35 , RX10_TEMP33 ) ; 
const int32_t RX10_TEMP37 = 0 ; 
const uint32_t RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; 
if ( RX10_TEMP38 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP40 = getPlaceFromDist2 ( RX10_TEMP34 , RX10_TEMP36 ) ; 
const place_t RX10_TEMP42 = /* here  */ _here(); 
const uint32_t RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; 
if ( RX10_TEMP43 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP41 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP36 , X10_TEMP30 ) ; 
const int32_t X10_TEMP33 = 2 ; 
const int32_t X10_TEMP34 = 0 ; 
const double X10_TEMP36 = 0.34429060398168704; 
const double X10_TEMP37 = X10_TEMP36 ; 
struct Point2 RX10_TEMP44  ; 
Point2_Point2( &RX10_TEMP44/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP33 , X10_TEMP34 ) ; 
struct Dist2 RX10_TEMP45 = ref .distValue ; 
struct Region2 RX10_TEMP46 = RX10_TEMP45 .dReg ; 
const int32_t RX10_TEMP47 = searchPointInRegion2 ( RX10_TEMP46 , RX10_TEMP44 ) ; 
const int32_t RX10_TEMP48 = 0 ; 
const uint32_t RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; 
if ( RX10_TEMP49 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP50 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP51 = getPlaceFromDist2 ( RX10_TEMP45 , RX10_TEMP47 ) ; 
const place_t RX10_TEMP53 = /* here  */ _here(); 
const uint32_t RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP52 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP47 , X10_TEMP37 ) ; 
const int32_t X10_TEMP40 = 2 ; 
const int32_t X10_TEMP41 = 1 ; 
const double X10_TEMP42 = 1.1645642623320958; 
const int32_t X10_TEMP43 = 0 ; 
const double X10_TEMP45 = X10_TEMP43 - X10_TEMP42 ; 
const double X10_TEMP46 = X10_TEMP45 ; 
struct Point2 RX10_TEMP55  ; 
Point2_Point2( &RX10_TEMP55/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP40 , X10_TEMP41 ) ; 
struct Dist2 RX10_TEMP56 = ref .distValue ; 
struct Region2 RX10_TEMP57 = RX10_TEMP56 .dReg ; 
const int32_t RX10_TEMP58 = searchPointInRegion2 ( RX10_TEMP57 , RX10_TEMP55 ) ; 
const int32_t RX10_TEMP59 = 0 ; 
const uint32_t RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; 
if ( RX10_TEMP60 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP61 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP61 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP62 = getPlaceFromDist2 ( RX10_TEMP56 , RX10_TEMP58 ) ; 
const place_t RX10_TEMP64 = /* here  */ _here(); 
const uint32_t RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64 ; 
if ( RX10_TEMP65 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP63 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP63 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP58 , X10_TEMP46 ) ; 
const int32_t X10_TEMP49 = 3 ; 
const int32_t X10_TEMP50 = 0 ; 
const double X10_TEMP52 = 0.15238898702519288; 
const double X10_TEMP53 = X10_TEMP52 ; 
struct Point2 RX10_TEMP66  ; 
Point2_Point2( &RX10_TEMP66/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP49 , X10_TEMP50 ) ; 
struct Dist2 RX10_TEMP67 = ref .distValue ; 
struct Region2 RX10_TEMP68 = RX10_TEMP67 .dReg ; 
const int32_t RX10_TEMP69 = searchPointInRegion2 ( RX10_TEMP68 , RX10_TEMP66 ) ; 
const int32_t RX10_TEMP70 = 0 ; 
const uint32_t RX10_TEMP71 = RX10_TEMP69 < RX10_TEMP70 ; 
if ( RX10_TEMP71 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP72 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP72 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP73 = getPlaceFromDist2 ( RX10_TEMP67 , RX10_TEMP69 ) ; 
const place_t RX10_TEMP75 = /* here  */ _here(); 
const uint32_t RX10_TEMP76 = RX10_TEMP73 != RX10_TEMP75 ; 
if ( RX10_TEMP76 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP74 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP74 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP69 , X10_TEMP53 ) ; 
const int32_t X10_TEMP56 = 3 ; 
const int32_t X10_TEMP57 = 1 ; 
const double X10_TEMP58 = 0.8143461113044298; 
const int32_t X10_TEMP59 = 0 ; 
const double X10_TEMP61 = X10_TEMP59 - X10_TEMP58 ; 
const double X10_TEMP62 = X10_TEMP61 ; 
struct Point2 RX10_TEMP77  ; 
Point2_Point2( &RX10_TEMP77/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP56 , X10_TEMP57 ) ; 
struct Dist2 RX10_TEMP78 = ref .distValue ; 
struct Region2 RX10_TEMP79 = RX10_TEMP78 .dReg ; 
const int32_t RX10_TEMP80 = searchPointInRegion2 ( RX10_TEMP79 , RX10_TEMP77 ) ; 
const int32_t RX10_TEMP81 = 0 ; 
const uint32_t RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81 ; 
if ( RX10_TEMP82 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP83 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP83 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP84 = getPlaceFromDist2 ( RX10_TEMP78 , RX10_TEMP80 ) ; 
const place_t RX10_TEMP86 = /* here  */ _here(); 
const uint32_t RX10_TEMP87 = RX10_TEMP84 != RX10_TEMP86 ; 
if ( RX10_TEMP87 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP85 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP85 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP80 , X10_TEMP62 ) ; 
} 

void /*static*/Series_validate (  struct Series  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 3 ; 
const int32_t X10_TEMP7 = 0 ; 
const int32_t X10_TEMP8 = 1 ; 
struct Region2 r = createNewRegion2RR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP7 , X10_TEMP8 ) ; 
const place_t X10_TEMP10 = /* here  */ _here(); 
struct Dist2 vd = getPlaceDist2 ( r , X10_TEMP10 ) ; 
struct Region2 RX10_TEMP0 = vd .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER1;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER1 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER1)[0] = RX10_TEMP5, TEMPCALLOCPOINTER1 = ((int32_t * )TEMPCALLOCPOINTER1)+1, memset(TEMPCALLOCPOINTER1,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount2 ( vd , RX10_TEMP9 ) ; 
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
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER2 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER2)[0] = RX10_TEMP4, TEMPCALLOCPOINTER2 = ((int32_t * )TEMPCALLOCPOINTER2)+1, memset(TEMPCALLOCPOINTER2,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP20  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, vd , RX10_TEMP17 ) ; 
struct doubleRefArray2 ref = RX10_TEMP20 ; 
Series_initRefArray ( X10_TEMP0 , ref ) ; 
struct Region2 RX10_TEMP23 = vd .dReg ; 
const int32_t RX10_TEMP26 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP24 = RX10_TEMP23 .regSize ; 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; const int32_t RX10_TEMP25 = RX10_TEMP24 + 1; 
for ( int32_t RX10_TEMP21= 0; RX10_TEMP21<  RX10_TEMP25; RX10_TEMP21++ )
 
{ 
const int32_t RX10_TEMP27 = /*PointAccess*/RX10_TEMP21 ; 
struct Point2 RX10_TEMP22 = regionOrdinalPoint2 ( RX10_TEMP23 , RX10_TEMP27 ) ; 
const int32_t i = RX10_TEMP22 .f0 ; 
const int32_t j = RX10_TEMP22 .f1 ; 
const int32_t ii = i ; 
const int32_t jj = j ; 
/*UpdatableVariableDeclaration*/
double cval = 0 ; 
const place_t curr_place = /* here  */ _here(); 
const int32_t X10_TEMP23 = 0 ; 
const int32_t X10_TEMP24 = 0 ; 
struct Region1 tempr = createNewRegion1R ( X10_TEMP23 , X10_TEMP24 ) ; 
const place_t X10_TEMP26 = /* here  */ _here(); 
struct Dist1 tempvd = getPlaceDist1 ( tempr , X10_TEMP26 ) ; 
struct Region1 RX10_TEMP28 = tempvd .dReg ; 
const int32_t RX10_TEMP29 = 0 ; 
const int32_t RX10_TEMP30 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP31 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP31 = RX10_TEMP31 - RX10_TEMP30 ; const int32_t RX10_TEMP32 = RX10_TEMP31 + 1; 
const int32_t RX10_TEMP33 = /*SimpleDistributionExpression*/ RX10_TEMP31 +1; 
void * TEMPCALLOCPOINTER3;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER3 = malloc(sizeof(int32_t)+(RX10_TEMP33*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP33*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER3)[0] = RX10_TEMP33, TEMPCALLOCPOINTER3 = ((int32_t * )TEMPCALLOCPOINTER3)+1, memset(TEMPCALLOCPOINTER3,0,RX10_TEMP33*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP35= 0; RX10_TEMP35<  RX10_TEMP32; RX10_TEMP35++ )
 
{ 
const place_t RX10_TEMP36 = /* here  */ _here(); 
const int32_t RX10_TEMP37 = /*PointAccess*/RX10_TEMP35 ; 
const place_t RX10_TEMP38 = /* place.places ( RX10_TEMP37 )  */ _toplace(RX10_TEMP37 ); 
const int32_t RX10_TEMP39 = getDistLocalCount1 ( tempvd , RX10_TEMP37 ) ; 
const int32_t RX10_TEMP40 = RX10_TEMP39 - RX10_TEMP30 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP40 , RX10_TEMP36 , RX10_TEMP35 , RX10_TEMP34 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, RX10_TEMP38 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER4;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP45 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER4 = malloc(sizeof(int32_t)+(RX10_TEMP32*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP32*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER4)[0] = RX10_TEMP32, TEMPCALLOCPOINTER4 = ((int32_t * )TEMPCALLOCPOINTER4)+1, memset(TEMPCALLOCPOINTER4,0,RX10_TEMP32*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP47 = 0;RX10_TEMP47 < RX10_TEMP32; RX10_TEMP47++) 

{ 
struct doubleStub RX10_TEMP46 = RX10_TEMP34 [ RX10_TEMP47 ] 
; 
RX10_TEMP45[RX10_TEMP47] = RX10_TEMP46 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP48  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, tempvd , RX10_TEMP45 ) ; 
struct doubleRefArray1 tempref = RX10_TEMP48 ; 
struct doubleRefArray2 tA = X10_TEMP0 ->testArray ; 
/* finish  */ task_start_finish();

{ 
struct doubleRefArray2 X10_TEMP32 = X10_TEMP0 ->testArray ; 
struct Dist2 RX10_TEMP49 = X10_TEMP32 .distValue ; 
struct Dist2 X10_TEMP33 = RX10_TEMP49 ; 
struct Point2 RX10_TEMP50  ; 
Point2_Point2( &RX10_TEMP50/*OBJECT INIT IN ASSIGNMENT*/, j , i ) ; 
struct Region2 RX10_TEMP51 = X10_TEMP33 .dReg ; 
const int32_t RX10_TEMP52 = searchPointInRegion2 ( RX10_TEMP51 , RX10_TEMP50 ) ; 
const int32_t RX10_TEMP53 = 0 ; 
const uint32_t RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
const char * RX10_TEMP55 = "Point RX10_TEMP50 not found in the distribution X10_TEMP33." ; 
fprintf(stderr, "%s",RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP56 = getPlaceFromDist2 ( X10_TEMP33 , RX10_TEMP52 ) ; 
const place_t X10_TEMP37 = RX10_TEMP56 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, tA , tempref , curr_place , jj , ii ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, X10_TEMP37 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP47 = 0 ; 
struct Point1 RX10_TEMP80  ; 
Point1_Point1( &RX10_TEMP80/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP47 ) ; 
struct Dist1 RX10_TEMP81 = tempref .distValue ; 
struct Region1 RX10_TEMP82 = RX10_TEMP81 .dReg ; 
const int32_t RX10_TEMP83 = searchPointInRegion1 ( RX10_TEMP82 , RX10_TEMP80 ) ; 
const int32_t RX10_TEMP84 = 0 ; 
const uint32_t RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84 ; 
if ( RX10_TEMP85 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP86 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP86 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP87 = getPlaceFromDist1 ( RX10_TEMP81 , RX10_TEMP83 ) ; 
const place_t RX10_TEMP89 = /* here  */ _here(); 
const uint32_t RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89 ; 
if ( RX10_TEMP90 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP88 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP88 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP91 = getRefArrayValue1double ( tempref , RX10_TEMP83 ) ; 
const double X10_TEMP49 = RX10_TEMP91 ; 
cval = X10_TEMP49 ; struct Point2 RX10_TEMP92  ; 
Point2_Point2( &RX10_TEMP92/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP93 = ref .distValue ; 
struct Region2 RX10_TEMP94 = RX10_TEMP93 .dReg ; 
const int32_t RX10_TEMP95 = searchPointInRegion2 ( RX10_TEMP94 , RX10_TEMP92 ) ; 
const int32_t RX10_TEMP96 = 0 ; 
const uint32_t RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP98 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP98 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP99 = getPlaceFromDist2 ( RX10_TEMP93 , RX10_TEMP95 ) ; 
const place_t RX10_TEMP101 = /* here  */ _here(); 
const uint32_t RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101 ; 
if ( RX10_TEMP102 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP100 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP100 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP103 = getRefArrayValue2double ( ref , RX10_TEMP95 ) ; 
const double X10_TEMP52 = RX10_TEMP103 ; 
const double X10_TEMP54 = cval - X10_TEMP52 ; 
/*UpdatableVariableDeclaration*/
double error = fabs ( X10_TEMP54 ) ; 
const double X10_TEMP56 = 1.0e-12; 
const uint32_t X10_TEMP58 = error > X10_TEMP56 ; 
if ( X10_TEMP58 ) 
{ 
const char * X10_TEMP59 = "Validation failed for coefficient " ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC3, "%s%d",X10_TEMP59,j);
const char * X10_TEMP60 = tempC3;; 
const char * X10_TEMP61 = "," ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC4, "%s%s",X10_TEMP60,X10_TEMP61);
const char * X10_TEMP62 = tempC4;; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC5, "%s%d",X10_TEMP62,i);
const char * X10_TEMP64 = tempC5;; 
fprintf(  stdout, "%s\n",X10_TEMP64 ) ; 
const char * X10_TEMP65 = "Computed value = " ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC6, "%s%f",X10_TEMP65,cval);
const char * X10_TEMP67 = tempC6;; 
fprintf(  stdout, "%s\n",X10_TEMP67 ) ; 
const char * X10_TEMP70 = "Reference value = " ; 
struct Point2 RX10_TEMP104  ; 
Point2_Point2( &RX10_TEMP104/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP105 = ref .distValue ; 
struct Region2 RX10_TEMP106 = RX10_TEMP105 .dReg ; 
const int32_t RX10_TEMP107 = searchPointInRegion2 ( RX10_TEMP106 , RX10_TEMP104 ) ; 
const int32_t RX10_TEMP108 = 0 ; 
const uint32_t RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108 ; 
if ( RX10_TEMP109 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP110 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP110 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP111 = getPlaceFromDist2 ( RX10_TEMP105 , RX10_TEMP107 ) ; 
const place_t RX10_TEMP113 = /* here  */ _here(); 
const uint32_t RX10_TEMP114 = RX10_TEMP111 != RX10_TEMP113 ; 
if ( RX10_TEMP114 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP112 = "Bad place access for array ref" ; 
fprintf(stderr, "%s",RX10_TEMP112 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP115 = getRefArrayValue2double ( ref , RX10_TEMP107 ) ; 
const double X10_TEMP71 = RX10_TEMP115 ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC7, "%s%f",X10_TEMP70,X10_TEMP71);
const char * X10_TEMP73 = tempC7;; 
fprintf(  stdout, "%s\n",X10_TEMP73 ) ; 
const char * X10_TEMP75 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 

} 

} 

void /*static*/Series_tidyup (  struct Series  * const X10_TEMP0 ) 
{ 
Series_freeTestData ( X10_TEMP0 ) ; 
} 

void /*static*/Series_run (  struct Series  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 0 ; 
struct Region1 tempregion = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
struct Dist1 tempdist = getPlaceDist1 ( tempregion , X10_TEMP6 ) ; 
/*UpdatableVariableDeclaration*/
int32_t j = 10000 ; 
struct Region1 RX10_TEMP1 = tempdist .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
const int32_t X10_TEMP11 = 0 ; 
Series_setSize ( X10_TEMP0 , X10_TEMP11 ) ; 
const int32_t X10_TEMP14 = 100 ; 
const int32_t X10_TEMP15 = 0 ; 
const double X10_TEMP16 = pow ( X10_TEMP14 , X10_TEMP15 ) ; 
const double X10_TEMP18 = j * X10_TEMP16 ; 
const int32_t X10_TEMP20 = /*casting*/( int32_t ) X10_TEMP18 ; 
Series_initialise ( X10_TEMP0 , X10_TEMP20 ) ; 
Series_kernel ( X10_TEMP0 ) ; 
Series_validate ( X10_TEMP0 ) ; 
} 

Series_tidyup ( X10_TEMP0 ) ; 
} 

void /*static*/Series_buildTestData (  struct Series  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 1 ; 
const int32_t X10_TEMP9 = 0 ; 
const int32_t X10_TEMP6 = X10_TEMP0 ->array_rows ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP10 = X10_TEMP6 - X10_TEMP7 ; 
struct Region2 R = createNewRegion2RR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP9 , X10_TEMP10 ) ; 
struct Dist2 X10_TEMP13 = getBlockDist2 ( R ) ; 
struct Dist2 d = X10_TEMP13 ; 
struct Region2 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER5;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER5 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER5)[0] = RX10_TEMP5, TEMPCALLOCPOINTER5 = ((int32_t * )TEMPCALLOCPOINTER5)+1, memset(TEMPCALLOCPOINTER5,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount2 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER6;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER6)[0] = RX10_TEMP4, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP19  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct doubleRefArray2 X10_TEMP15 = RX10_TEMP19 ; 
struct doubleRefArray2 X10_TEMP17 = X10_TEMP15 ; 
X10_TEMP0 ->testArray = ( X10_TEMP17 ) ; 
} 

void /*static*/Series_Do (  struct Series  * const X10_TEMP0 ) 
{ 
struct doubleRefArray2 X10_TEMP1 = X10_TEMP0 ->testArray ; 
const int32_t X10_TEMP4 = 0 ; 
const int32_t X10_TEMP5 = 0 ; 
const double X10_TEMP6 = 0.0; 
const double X10_TEMP14 = /*casting*/( double ) X10_TEMP6 ; 
const double X10_TEMP8 = 2.0; 
const double X10_TEMP15 = /*casting*/( double ) X10_TEMP8 ; 
const int32_t X10_TEMP16 = 1000 ; 
const double X10_TEMP11 = 0.0; 
const double X10_TEMP17 = /*casting*/( double ) X10_TEMP11 ; 
const int32_t X10_TEMP18 = 0 ; 
const double X10_TEMP20 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 , X10_TEMP18 ) ; 
const double X10_TEMP19 = 2.0; 
const double X10_TEMP21 = /*casting*/( double ) X10_TEMP19 ; 
const double X10_TEMP23 = X10_TEMP20 / X10_TEMP21 ; 
const double X10_TEMP24 = X10_TEMP23 ; 
struct Point2 RX10_TEMP0  ; 
Point2_Point2( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP4 , X10_TEMP5 ) ; 
struct Dist2 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int32_t RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int32_t RX10_TEMP4 = 0 ; 
const uint32_t RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP7 = getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const place_t RX10_TEMP9 = /* here  */ _here(); 
const uint32_t RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP24 ) ; 
const double X10_TEMP25 = 3.1415926535897932; 
const double omega = /*casting*/( double ) X10_TEMP25 ; 
struct Dist1 X10_TEMP27 = getUniqueDist ( ) ; 
struct Dist1 U = X10_TEMP27 ; 
struct doubleRefArray2 tA = X10_TEMP0 ->testArray ; 
/* finish  */ task_start_finish();

{ 
struct Region1 RX10_TEMP12 = U .dReg ; 
const int32_t RX10_TEMP15 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP13 = RX10_TEMP12 .regSize ; 
RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; const int32_t RX10_TEMP14 = RX10_TEMP13 + 1; 
for ( int32_t RX10_TEMP11= 0; RX10_TEMP11<  RX10_TEMP14; RX10_TEMP11++ )
 
{ 
const int32_t RX10_TEMP16 = /*PointAccess*/RX10_TEMP11 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP12 , RX10_TEMP16 ) ; 
struct Region1 RX10_TEMP17 = U .dReg ; 
const int32_t RX10_TEMP18 = searchPointInRegion1 ( RX10_TEMP17 , p ) ; 
const int32_t RX10_TEMP19 = 0 ; 
const uint32_t RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19 ; 
if ( RX10_TEMP20 ) 
{ 
const char * RX10_TEMP21 = "Point p not found in the distribution U." ; 
fprintf(stderr, "%s",RX10_TEMP21 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP22 = getPlaceFromDist1 ( U , RX10_TEMP18 ) ; 
const place_t X10_TEMP31 = RX10_TEMP22 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, p , tA , U , omega , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, X10_TEMP31 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 

double /*static*/Series_TrapezoidIntegrate (  struct Series  * const X10_TEMP0 , const double x0 , const double x1 , const int32_t a_nsteps , const double omegan , const int32_t select ) 
{ 
/*UpdatableVariableDeclaration*/
double x = 0.0; 
/*UpdatableVariableDeclaration*/
double dx = 0.0; 
/*UpdatableVariableDeclaration*/
double rvalue = 0.0; 
/*UpdatableVariableDeclaration*/
int32_t nsteps = a_nsteps ; 
x = x0 ; const double X10_TEMP7 = x1 - x0 ; 
const double X10_TEMP8 = /*casting*/( double ) nsteps ; 
const double X10_TEMP10 = X10_TEMP7 / X10_TEMP8 ; 
dx = X10_TEMP10 ; const double X10_TEMP15 = Series_thefunction ( X10_TEMP0 , x0 , omegan , select ) ; 
const double X10_TEMP14 = 2.0; 
const double X10_TEMP16 = /*casting*/( double ) X10_TEMP14 ; 
const double X10_TEMP18 = X10_TEMP15 / X10_TEMP16 ; 
rvalue = X10_TEMP18 ; const int32_t X10_TEMP19 = 1 ; 
const uint32_t X10_TEMP21 = nsteps != X10_TEMP19 ; 
if ( X10_TEMP21 ) 
{ 
const int32_t X10_TEMP22 = nsteps ; 
const int32_t X10_TEMP23 = 1 ; 
nsteps = nsteps - X10_TEMP23 ; const int32_t X10_TEMP24 = nsteps ; 
const int32_t X10_TEMP25 = 1 ; 
nsteps = nsteps - X10_TEMP25 ; const int32_t X10_TEMP26 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP30 = nsteps > X10_TEMP26 ; 

while ( X10_TEMP30 ) 
{ 
const double X10_TEMP32 = x + dx ; 
x = X10_TEMP32 ; const double X10_TEMP36 = Series_thefunction ( X10_TEMP0 , x , omegan , select ) ; 
const double X10_TEMP38 = rvalue + X10_TEMP36 ; 
rvalue = X10_TEMP38 ; const int32_t X10_TEMP39 = nsteps ; 
const int32_t X10_TEMP40 = 1 ; 
nsteps = nsteps - X10_TEMP40 ; const int32_t X10_TEMP28 = 0 ; 
X10_TEMP30 = nsteps > X10_TEMP28 ; } 

} 

const double X10_TEMP45 = Series_thefunction ( X10_TEMP0 , x1 , omegan , select ) ; 
const double X10_TEMP44 = 2.0; 
const double X10_TEMP46 = /*casting*/( double ) X10_TEMP44 ; 
const double X10_TEMP47 = X10_TEMP45 / X10_TEMP46 ; 
const double X10_TEMP49 = rvalue + X10_TEMP47 ; 
const double X10_TEMP51 = X10_TEMP49 * dx ; 
rvalue = X10_TEMP51 ; const double X10_TEMP53 = rvalue ; 
return X10_TEMP53 ; 
} 

double /*static*/Series_thefunction (  struct Series  * const X10_TEMP0 , const double x , const double omegan , const int32_t select ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP13 = 1 ; 
const int32_t X10_TEMP27 = 2 ; 
/*SWITCH CASE*/while(1)
{ 
 if(X10_TEMP3== select)
goto cs0;
else if(X10_TEMP13== select)
goto cs1;
else if(X10_TEMP27== select)
goto cs2;
goto cs3;

cs0:
{ 
const double X10_TEMP4 = 1.0; 
const double X10_TEMP5 = /*casting*/( double ) X10_TEMP4 ; 
const double X10_TEMP8 = x + X10_TEMP5 ; 
const double X10_TEMP10 = pow ( X10_TEMP8 , x ) ; 
return X10_TEMP10 ; 
goto cs1;
} 


cs1:
{ 
const double X10_TEMP14 = 1.0; 
const double X10_TEMP15 = /*casting*/( double ) X10_TEMP14 ; 
const double X10_TEMP18 = x + X10_TEMP15 ; 
const double X10_TEMP21 = pow ( X10_TEMP18 , x ) ; 
const double X10_TEMP20 = omegan * x ; 
const double X10_TEMP22 = cos ( X10_TEMP20 ) ; 
const double X10_TEMP24 = X10_TEMP21 * X10_TEMP22 ; 
return X10_TEMP24 ; 
goto cs2;
} 


cs2:
{ 
const double X10_TEMP28 = 1.0; 
const double X10_TEMP29 = /*casting*/( double ) X10_TEMP28 ; 
const double X10_TEMP32 = x + X10_TEMP29 ; 
const double X10_TEMP35 = pow ( X10_TEMP32 , x ) ; 
const double X10_TEMP34 = omegan * x ; 
const double X10_TEMP36 = sin ( X10_TEMP34 ) ; 
const double X10_TEMP38 = X10_TEMP35 * X10_TEMP36 ; 
return X10_TEMP38 ; 
} 

cs3: {break;}} /*END OF SWITCH*/
const double X10_TEMP41 = 0.0; 
return X10_TEMP41 ; 
} 

void /*static*/Series_freeTestData (  struct Series  * const X10_TEMP0 ) 
{ 
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

Dist1 /*static*/getUniqueDist ( ) 
{ 
const int32_t one = 1 ; 
const int32_t zero = 0 ; 
const int32_t maxPlaces = /* place.MAX_PLACES  */ _max_places(); 
const int32_t rSize = maxPlaces - one ; 
const int32_t placeRegion = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER15;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER15 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(placeRegion*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER15)[0] = placeRegion, TEMPCALLOCPOINTER15 = ((int32_t * )TEMPCALLOCPOINTER15)+1, memset(TEMPCALLOCPOINTER15,0,placeRegion*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER16;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER16 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(pointRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER16)[0] = pointRegion, TEMPCALLOCPOINTER16 = ((int32_t * )TEMPCALLOCPOINTER16)+1, memset(TEMPCALLOCPOINTER16,0,pointRegion*sizeof(Point1 )) ); 

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

place_t /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int32_t index ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const placeArray = d .placeArray ; 
const place_t retPlace = placeArray [ index ] 
; 
return retPlace ; 
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

Dist2 /*static*/getBlockDist2 (  struct Region2 const r ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
const int32_t dDist = /*SimpleDistributionExpression*/ rSizeMinusOne +1; 
void * TEMPCALLOCPOINTER24;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER24 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER24)[0] = dDist, TEMPCALLOCPOINTER24 = ((int32_t * )TEMPCALLOCPOINTER24)+1, memset(TEMPCALLOCPOINTER24,0,dDist*sizeof(place_t ) ) ); 
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
void * TEMPCALLOCPOINTER25;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER25 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER25)[0] = dReg, TEMPCALLOCPOINTER25 = ((int32_t * )TEMPCALLOCPOINTER25)+1, memset(TEMPCALLOCPOINTER25,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
const place_t tempPl = placeArray [ pt ] 
; 
vPlaceArray[pt] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
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
void * TEMPCALLOCPOINTER26;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER26 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER26)[0] = dReg, TEMPCALLOCPOINTER26 = ((int32_t * )TEMPCALLOCPOINTER26)+1, memset(TEMPCALLOCPOINTER26,0,dReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < dReg; pt++) 

{ 
const place_t tempPl = placeArray [ pt ] 
; 
vPlaceArray[pt] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
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
void * TEMPCALLOCPOINTER32;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER32 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER32)[0] = dReg, TEMPCALLOCPOINTER32 = ((int32_t * )TEMPCALLOCPOINTER32)+1, memset(TEMPCALLOCPOINTER32,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER33)[0] = dReg, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,dReg*sizeof(place_t )) ); 

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

Dist2 /*static*/restrictDist2 (  struct Dist2 const dn , const place_t p ) 
{ 
struct Region2 r = dn .dReg ; 
const uint32_t regType = r .regType ; 
if ( regType ) 
{ 
struct Dist2 regDist = restrictDistRegular2 ( dn , p ) ; 
return regDist ; 
} 

struct Dist2 arbDist = restrictDistArbitrary2 ( dn , p ) ; 
return arbDist ; 
} 

Dist2 /*static*/restrictDistRegular2 (  struct Dist2 const d , const place_t p ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const place_t h = /* here  */ _here(); 
struct Region2 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int32_t dim = dReg .regSize ; 
const int32_t dimMinusOne = dim - one ; 
const int32_t dRegReg = dimMinusOne + 1; 
const int32_t stride2 = 1 ; 
const int32_t dim2 = dReg .dim1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t regLow2 = dReg .low1 ; 
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
void * TEMPCALLOCPOINTER36;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER36 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER36)[0] = tempReg, TEMPCALLOCPOINTER36 = ((int32_t * )TEMPCALLOCPOINTER36)+1, memset(TEMPCALLOCPOINTER36,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER37;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER37)[0] = tempDist, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER38;
/*VALUE ARRAY*/ struct Point2 * const pointArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER38 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER38)[0] = tempReg, TEMPCALLOCPOINTER38 = ((int32_t * )TEMPCALLOCPOINTER38)+1, memset(TEMPCALLOCPOINTER38,0,tempReg*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
const int32_t idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/
int32_t f2 = idx / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/
int32_t f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 dpt  ; 
Point2_Point2( &dpt/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
pointArray[pt] = dpt ; 
} 
/*END OF ARRAY INIT*/struct Region2 dpReg  ; 
Region2_Region2_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist2 dpDistn  ; 
Dist2_Dist2( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist2 /*static*/restrictDistArbitrary2 (  struct Dist2 const d , const place_t p ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const place_t h = /* here  */ _here(); 
struct Region2 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int32_t dim = dReg .regSize ; 
const int32_t dimMinusOne = dim - one ; 
const int32_t dRegReg = dimMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point2 * const dArray = (/*VALUE ARRAY*/ struct Point2 * ) dReg .pointArray ; 
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
void * TEMPCALLOCPOINTER42;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER42 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER42)[0] = tempReg, TEMPCALLOCPOINTER42 = ((int32_t * )TEMPCALLOCPOINTER42)+1, memset(TEMPCALLOCPOINTER42,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER43;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER43 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER43)[0] = tempDist, TEMPCALLOCPOINTER43 = ((int32_t * )TEMPCALLOCPOINTER43)+1, memset(TEMPCALLOCPOINTER43,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER44;
/*VALUE ARRAY*/ struct Point2 * const pointArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER44 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER44)[0] = tempReg, TEMPCALLOCPOINTER44 = ((int32_t * )TEMPCALLOCPOINTER44)+1, memset(TEMPCALLOCPOINTER44,0,tempReg*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
const int32_t idx = tempArray [ pt ] 
; 
struct Point2 dpt = dArray [ idx ] 
; 
pointArray[pt] = dpt ; 
} 
/*END OF ARRAY INIT*/struct Region2 dpReg  ; 
Region2_Region2_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist2 dpDistn  ; 
Dist2_Dist2( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
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
void * TEMPCALLOCPOINTER46;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER46 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER46)[0] = regArr, TEMPCALLOCPOINTER46 = ((int32_t * )TEMPCALLOCPOINTER46)+1, memset(TEMPCALLOCPOINTER46,0,regArr*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER47;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER47 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER47)[0] = regArr, TEMPCALLOCPOINTER47 = ((int32_t * )TEMPCALLOCPOINTER47)+1, memset(TEMPCALLOCPOINTER47,0,regArr*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER48;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER48 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER48)[0] = regArr, TEMPCALLOCPOINTER48 = ((int32_t * )TEMPCALLOCPOINTER48)+1, memset(TEMPCALLOCPOINTER48,0,regArr*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER49;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER49)[0] = regArr, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER50;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER50)[0] = regArr, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER51;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER51)[0] = regArr, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,regArr*sizeof(Point1 )) ); 

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
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER53;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER53 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER53)[0] = RX10_TEMP14, TEMPCALLOCPOINTER53 = ((int32_t * )TEMPCALLOCPOINTER53)+1, memset(TEMPCALLOCPOINTER53,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP13 = 0.0; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC5) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int32_t RX10_TEMP40 = utmpz .RX10_TEMP40 ; 
const place_t RX10_TEMP36 = utmpz .RX10_TEMP36 ; 
const int32_t RX10_TEMP35 = utmpz .RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = utmpz .RX10_TEMP34 ; 

{ 
const int32_t RX10_TEMP42 = /*SimpleDistributionExpression*/ RX10_TEMP40 +1; 
void * TEMPCALLOCPOINTER55;
/*Updatable ARRAY*/ double * const RX10_TEMP43 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER55 = malloc(sizeof(int32_t)+(RX10_TEMP42*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP42*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER55)[0] = RX10_TEMP42, TEMPCALLOCPOINTER55 = ((int32_t * )TEMPCALLOCPOINTER55)+1, memset(TEMPCALLOCPOINTER55,0,RX10_TEMP42*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP41 = 0;RX10_TEMP41 < RX10_TEMP42; RX10_TEMP41++) 

{ 
const double X10_TEMP29 = 0.0; 
RX10_TEMP43[RX10_TEMP41] = X10_TEMP29 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP44  ; 
doubleStub_doubleStub( &RX10_TEMP44/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP43 ) ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP44 , RX10_TEMP35 , RX10_TEMP34 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC6) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, RX10_TEMP36 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
struct doubleRefArray2 tA = utmpz .tA ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 
const place_t curr_place = utmpz .curr_place ; 
const int32_t jj = utmpz .jj ; 
const int32_t ii = utmpz .ii ; 

{ 
struct Point2 RX10_TEMP57  ; 
Point2_Point2( &RX10_TEMP57/*OBJECT INIT IN ASSIGNMENT*/, jj , ii ) ; 
struct Dist2 RX10_TEMP58 = tA .distValue ; 
struct Region2 RX10_TEMP59 = RX10_TEMP58 .dReg ; 
const int32_t RX10_TEMP60 = searchPointInRegion2 ( RX10_TEMP59 , RX10_TEMP57 ) ; 
const int32_t RX10_TEMP61 = 0 ; 
const uint32_t RX10_TEMP62 = RX10_TEMP60 < RX10_TEMP61 ; 
if ( RX10_TEMP62 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP63 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP63 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP64 = getPlaceFromDist2 ( RX10_TEMP58 , RX10_TEMP60 ) ; 
const place_t RX10_TEMP66 = /* here  */ _here(); 
const uint32_t RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66 ; 
if ( RX10_TEMP67 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP65 = "Bad place access for array tA" ; 
fprintf(stderr, "%s",RX10_TEMP65 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP68 = getRefArrayValue2double ( tA , RX10_TEMP60 ) ; 
const double temp = RX10_TEMP68 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, temp , tempref ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC7) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, curr_place );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER57;
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER57 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER57)[0] = RX10_TEMP13, TEMPCALLOCPOINTER57 = ((int32_t * )TEMPCALLOCPOINTER57)+1, memset(TEMPCALLOCPOINTER57,0,RX10_TEMP13*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP15  ; 
doubleStub_doubleStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC8) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread5 (  struct T5 const utmpz ) 
{ 
struct Point1 p = utmpz .p ; 
struct doubleRefArray2 tA = utmpz .tA ; 
struct Dist1 U = utmpz .U ; 
const double omega = utmpz .omega ; 
struct Series * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
/*UpdatableVariableDeclaration*/
int32_t ilow = 0 ; 
struct Region1 RX10_TEMP23 = U .dReg ; 
const int32_t RX10_TEMP24 = searchPointInRegion1 ( RX10_TEMP23 , p ) ; 
const int32_t RX10_TEMP25 = 0 ; 
const uint32_t RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; 
if ( RX10_TEMP26 ) 
{ 
const char * RX10_TEMP27 = "Point p not found in the distribution U." ; 
fprintf(stderr, "%s",RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP28 = getPlaceFromDist1 ( U , RX10_TEMP24 ) ; 
const place_t X10_TEMP34 = RX10_TEMP28 ; 
const uint32_t X10_TEMP36 = /* X10_TEMP34 . isFirst ( )  */ _isfirst(X10_TEMP34); 
if ( X10_TEMP36 ) 
{ 
const int32_t X10_TEMP38 = 1 ; 
ilow = X10_TEMP38 ;; } 
else 
{ 
const int32_t X10_TEMP40 = 0 ; 
ilow = X10_TEMP40 ; } 


struct Dist2 RX10_TEMP29 = tA .distValue ; 
struct Dist2 X10_TEMP41 = RX10_TEMP29 ; 
const place_t X10_TEMP42 = /* here  */ _here(); 
struct Dist2 X10_TEMP44 = restrictDist2 ( X10_TEMP41 , X10_TEMP42 ) ; 
struct Region2 RX10_TEMP31 = X10_TEMP44 .dReg ; 
const int32_t RX10_TEMP34 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP32 = RX10_TEMP31 .regSize ; 
RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34 ; const int32_t RX10_TEMP33 = RX10_TEMP32 + 1; 
for ( int32_t RX10_TEMP30= 0; RX10_TEMP30<  RX10_TEMP33; RX10_TEMP30++ )
 
{ 
const int32_t RX10_TEMP35 = /*PointAccess*/RX10_TEMP30 ; 
struct Point2 pp = regionOrdinalPoint2 ( RX10_TEMP31 , RX10_TEMP35 ) ; 
const int32_t X10_TEMP46 = pp .f1 ; 
const uint32_t X10_TEMP48 = X10_TEMP46 >= ilow ; 
if ( X10_TEMP48 ) 
{ 
const int32_t X10_TEMP50 = pp .f0 ; 
const int32_t X10_TEMP51 = 0 ; 
const uint32_t X10_TEMP53 = X10_TEMP50 == X10_TEMP51 ; 
if ( X10_TEMP53 ) 
{ 
const double X10_TEMP55 = 0.0; 
const double X10_TEMP65 = /*casting*/( double ) X10_TEMP55 ; 
const double X10_TEMP57 = 2.0; 
const double X10_TEMP66 = /*casting*/( double ) X10_TEMP57 ; 
const int32_t X10_TEMP67 = 1000 ; 
const int32_t X10_TEMP61 = pp .f1 ; 
const double X10_TEMP62 = /*casting*/( double ) X10_TEMP61 ; 
const double X10_TEMP68 = omega * X10_TEMP62 ; 
const int32_t X10_TEMP69 = 1 ; 
const double X10_TEMP71 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP65 , X10_TEMP66 , X10_TEMP67 , X10_TEMP68 , X10_TEMP69 ) ; 
const double X10_TEMP72 = X10_TEMP71 ; 
struct Dist2 RX10_TEMP36 = tA .distValue ; 
struct Region2 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int32_t RX10_TEMP38 = searchPointInRegion2 ( RX10_TEMP37 , pp ) ; 
const int32_t RX10_TEMP39 = 0 ; 
const uint32_t RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP41 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP42 = getPlaceFromDist2 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const place_t RX10_TEMP44 = /* here  */ _here(); 
const uint32_t RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Bad place access for array tA" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( tA , RX10_TEMP38 , X10_TEMP72 ) ; 
} 
else 
{ 
const double X10_TEMP74 = 0.0; 
const double X10_TEMP84 = /*casting*/( double ) X10_TEMP74 ; 
const double X10_TEMP76 = 2.0; 
const double X10_TEMP85 = /*casting*/( double ) X10_TEMP76 ; 
const int32_t X10_TEMP86 = 1000 ; 
const int32_t X10_TEMP80 = pp .f1 ; 
const double X10_TEMP81 = /*casting*/( double ) X10_TEMP80 ; 
const double X10_TEMP87 = omega * X10_TEMP81 ; 
const int32_t X10_TEMP88 = 2 ; 
const double X10_TEMP90 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP84 , X10_TEMP85 , X10_TEMP86 , X10_TEMP87 , X10_TEMP88 ) ; 
const double X10_TEMP91 = X10_TEMP90 ; 
struct Dist2 RX10_TEMP46 = tA .distValue ; 
struct Region2 RX10_TEMP47 = RX10_TEMP46 .dReg ; 
const int32_t RX10_TEMP48 = searchPointInRegion2 ( RX10_TEMP47 , pp ) ; 
const int32_t RX10_TEMP49 = 0 ; 
const uint32_t RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; 
if ( RX10_TEMP50 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP51 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP52 = getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 ) ; 
const place_t RX10_TEMP54 = /* here  */ _here(); 
const uint32_t RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; 
if ( RX10_TEMP55 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP53 = "Bad place access for array tA" ; 
fprintf(stderr, "%s",RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( tA , RX10_TEMP48 , X10_TEMP91 ) ; 
} 


} 

} 

} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread10 (  struct T10 const utmpz ) 
{ 
struct doubleStub RX10_TEMP44 = utmpz .RX10_TEMP44 ; 
const int32_t RX10_TEMP35 = utmpz .RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = utmpz .RX10_TEMP34 ; 

{ 
RX10_TEMP34 [ RX10_TEMP35 ] = ( RX10_TEMP44 ) ; 
} 
} 

void /*static*/thread11 (  struct T11 const utmpz ) 
{ 
const double temp = utmpz .temp ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 

{ 
const int32_t X10_TEMP43 = 0 ; 
const double X10_TEMP45 = temp ; 
struct Point1 RX10_TEMP69  ; 
Point1_Point1( &RX10_TEMP69/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP43 ) ; 
struct Dist1 RX10_TEMP70 = tempref .distValue ; 
struct Region1 RX10_TEMP71 = RX10_TEMP70 .dReg ; 
const int32_t RX10_TEMP72 = searchPointInRegion1 ( RX10_TEMP71 , RX10_TEMP69 ) ; 
const int32_t RX10_TEMP73 = 0 ; 
const uint32_t RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73 ; 
if ( RX10_TEMP74 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP75 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP76 = getPlaceFromDist1 ( RX10_TEMP70 , RX10_TEMP72 ) ; 
const place_t RX10_TEMP78 = /* here  */ _here(); 
const uint32_t RX10_TEMP79 = RX10_TEMP76 != RX10_TEMP78 ; 
if ( RX10_TEMP79 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP77 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP77 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( tempref , RX10_TEMP72 , X10_TEMP45 ) ; 
} 
} 

void /*static*/thread12 (  struct T12 const utmpz ) 
{ 
struct doubleStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T1THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T1THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T1THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T1THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP40 , const place_t a_RX10_TEMP36 , const int32_t a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) 
{ 
T2THIS->RX10_TEMP40 = ( a_RX10_TEMP40 ) ; 
T2THIS->RX10_TEMP36 = ( a_RX10_TEMP36 ) ; 
T2THIS->RX10_TEMP35 = ( a_RX10_TEMP35 ) ; 
T2THIS->RX10_TEMP34 = ( a_RX10_TEMP34 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS,  struct doubleRefArray2 const a_tA ,  struct doubleRefArray1 const a_tempref , const place_t a_curr_place , const int32_t a_jj , const int32_t a_ii ) 
{ 
T3THIS->tA = ( a_tA ) ; 
T3THIS->tempref = ( a_tempref ) ; 
T3THIS->curr_place = ( a_curr_place ) ; 
T3THIS->jj = ( a_jj ) ; 
T3THIS->ii = ( a_ii ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T4THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T4THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T4THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T4THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS,  struct Point1 const a_p ,  struct doubleRefArray2 const a_tA ,  struct Dist1 const a_U , const double a_omega ,  struct Series  * const a_X10_TEMP0 ) 
{ 
T5THIS->p = ( a_p ) ; 
T5THIS->tA = ( a_tA ) ; 
T5THIS->U = ( a_U ) ; 
T5THIS->omega = ( a_omega ) ; 
T5THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T6THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T6THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T6THIS->THIS = *TimerTHIS;
 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T7THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T7THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T7THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T7THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T7THIS->THIS = *TimerTHIS;
 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T8THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T8THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T8THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T8THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T8THIS->THIS = *TimerTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T9THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T9THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T9THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS,  struct doubleStub const a_RX10_TEMP44 , const int32_t a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) 
{ 
T10THIS->RX10_TEMP44 = ( a_RX10_TEMP44 ) ; 
T10THIS->RX10_TEMP35 = ( a_RX10_TEMP35 ) ; 
T10THIS->RX10_TEMP34 = ( a_RX10_TEMP34 ) ; 

 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS, const double a_temp ,  struct doubleRefArray1 const a_tempref ) 
{ 
T11THIS->temp = ( a_temp ) ; 
T11THIS->tempref = ( a_tempref ) ; 

 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T12THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T12THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T12THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T13THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T13THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T13THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T13THIS->THIS = *TimerTHIS;
 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T14THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T14THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T14THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T14THIS->THIS = *TimerTHIS;
 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T15THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T15THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T15THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T15THIS->THIS = *TimerTHIS;
 return  *T15THIS; 

} 

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray2THIS->distValue = ( distValue_ ) ; 
doubleRefArray2THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray2THIS; 

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

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int32_t f0_ , const int32_t f1_ ) 
{ 
Point2THIS->f0 = ( f0_ ) ; 
Point2THIS->f1 = ( f1_ ) ; 

 return  *Point2THIS; 

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
void * TEMPCALLOCPOINTER61;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER61 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(countDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER61)[0] = countDist, TEMPCALLOCPOINTER61 = ((int32_t * )TEMPCALLOCPOINTER61)+1, memset(TEMPCALLOCPOINTER61,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER62;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER62 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(runSumDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER62)[0] = runSumDist, TEMPCALLOCPOINTER62 = ((int32_t * )TEMPCALLOCPOINTER62)+1, memset(TEMPCALLOCPOINTER62,0,runSumDist*sizeof(int32_t ) ) ); 
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

Series *Series_Series ( struct Series *SeriesTHIS) 
{ 

 return  SeriesTHIS; 

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
void * TEMPCALLOCPOINTER65;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER65 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER65)[0] = RX10_TEMP5, TEMPCALLOCPOINTER65 = ((int32_t * )TEMPCALLOCPOINTER65)+1, memset(TEMPCALLOCPOINTER65,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC9) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER66;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER66 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER66)[0] = RX10_TEMP4, TEMPCALLOCPOINTER66 = ((int32_t * )TEMPCALLOCPOINTER66)+1, memset(TEMPCALLOCPOINTER66,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER67;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER67 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER67)[0] = RX10_TEMP26, TEMPCALLOCPOINTER67 = ((int32_t * )TEMPCALLOCPOINTER67)+1, memset(TEMPCALLOCPOINTER67,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC10) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER68;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER68 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER68)[0] = RX10_TEMP25, TEMPCALLOCPOINTER68 = ((int32_t * )TEMPCALLOCPOINTER68)+1, memset(TEMPCALLOCPOINTER68,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER69;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER69 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER69)[0] = RX10_TEMP47, TEMPCALLOCPOINTER69 = ((int32_t * )TEMPCALLOCPOINTER69)+1, memset(TEMPCALLOCPOINTER69,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC11) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER70;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER70 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER70)[0] = RX10_TEMP46, TEMPCALLOCPOINTER70 = ((int32_t * )TEMPCALLOCPOINTER70)+1, memset(TEMPCALLOCPOINTER70,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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

void thread6 ( struct Timer *TimerTHIS,  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER72;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER72 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER72)[0] = RX10_TEMP14, TEMPCALLOCPOINTER72 = ((int32_t * )TEMPCALLOCPOINTER72)+1, memset(TEMPCALLOCPOINTER72,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
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

void thread7 ( struct Timer *TimerTHIS,  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER74;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER74 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER74)[0] = RX10_TEMP35, TEMPCALLOCPOINTER74 = ((int32_t * )TEMPCALLOCPOINTER74)+1, memset(TEMPCALLOCPOINTER74,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC13) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread8 ( struct Timer *TimerTHIS,  struct T8 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER76;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER76 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER76)[0] = RX10_TEMP56, TEMPCALLOCPOINTER76 = ((int32_t * )TEMPCALLOCPOINTER76)+1, memset(TEMPCALLOCPOINTER76,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC14) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread13 ( struct Timer *TimerTHIS,  struct T13 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) 
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
/* class RunMain */ int32_t  runmain( ) 
{ 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_Timer_max_counters = _Timer_max_counters_init ( ) ; 

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
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC6 :
		 fixPointerT10(((struct T10 * const )params), (params+sizeof(struct T10)));
		thread10(*(struct T10 * const )params);
		break;
	 case ASYNC7 :
		 fixPointerT11(((struct T11 * const )params), (params+sizeof(struct T11)));
		thread11(*(struct T11 * const )params);
		break;
	 case ASYNC8 :
		 fixPointerT12(((struct T12 * const )params), (params+sizeof(struct T12)));
		thread12(*(struct T12 * const )params);
		break;
	 case ASYNC9 :
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
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
	 case ASYNC14 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
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
		thread9(*(struct T9 * const )params);
		break;
	 case ASYNC6 :
		thread10(*(struct T10 * const )params);
		break;
	 case ASYNC7 :
		thread11(*(struct T11 * const )params);
		break;
	 case ASYNC8 :
		thread12(*(struct T12 * const )params);
		break;
	 case ASYNC9 :
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
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
	 case ASYNC14 :
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
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
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC6 :
		 sizeToMalloc = child.size+ getSizeOfT10((struct T10 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT10((struct T10 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC7 :
		 sizeToMalloc = child.size+ getSizeOfT11((struct T11 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT11((struct T11 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC8 :
		 sizeToMalloc = child.size+ getSizeOfT12((struct T12 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT12((struct T12 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC9 :
		 sizeToMalloc = child.size+ getSizeOfT6((struct T6 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT6((struct T6 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC10 :
		 sizeToMalloc = child.size+ getSizeOfT7((struct T7 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT7((struct T7 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC14 :
		 sizeToMalloc = child.size+ getSizeOfT15((struct T15 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT15((struct T15 * const )child.params,(buf+headerSize+child.size));
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
    temp += getSizeOfPoint1(&(className -> p));
    temp += getSizeOfdoubleRefArray2(&(className -> tA));
    temp += getSizeOfDist1(&(className -> U));
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
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
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
    temp += getSizeOfdoubleRefArray2(&(className -> tA));
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
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
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP44));
return temp;
 }
int32_t getSizeOfT11( struct T11 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
return temp;
 }
int32_t getSizeOfT12( struct T12 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT13( struct T13 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT14( struct T14 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
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
int32_t getSizeOfT15( struct T15 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
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
offset = deepCopyPoint1(&(className -> p), offset);
offset = deepCopydoubleRefArray2(&(className -> tA), offset);
offset = deepCopyDist1(&(className -> U), offset);
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
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
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
offset = deepCopydoubleRefArray2(&(className -> tA), offset);
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
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
offset = deepCopydoubleStub(&(className -> RX10_TEMP44), offset);
return offset;
 }
void* deepCopyT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void* deepCopyT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
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
void* deepCopyT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
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
offset  = fixPointerPoint1(&(className -> p), offset);
offset  = fixPointerdoubleRefArray2(&(className -> tA), offset);
offset  = fixPointerDist1(&(className -> U), offset);
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
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
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
offset  = fixPointerdoubleRefArray2(&(className -> tA), offset);
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
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
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP44), offset);
return offset;
 }
void * fixPointerT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void * fixPointerT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT14( struct T14 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
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
void * fixPointerT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
