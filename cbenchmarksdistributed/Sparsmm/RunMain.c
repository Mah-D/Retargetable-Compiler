#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int64_t _Random_multiplier ;
int64_t _Random_addend ;
int64_t _Random_mask ;
int32_t _Timer_max_counters ;
int64_t _SparseMatmult_RANDOM_SEED ;
int32_t _SparseMatmult_SPARSE_NUM_ITER ;
struct Random * _SparseMatmult_R ;
int64_t /*static*/_Random_multiplier_init ( ) 
{ 
const int64_t X10_TEMP2 = 0x5DEECE66DL ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/_Random_addend_init ( ) 
{ 
const int64_t X10_TEMP2 = 0xBL ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/_Random_mask_init ( ) 
{ 
const int64_t X10_TEMP1 = 1L ; 
const int32_t X10_TEMP2 = 48 ; 
const int64_t X10_TEMP4 = X10_TEMP1 << X10_TEMP2 ; 
const int32_t X10_TEMP5 = 1 ; 
const int64_t X10_TEMP7 = X10_TEMP4 - X10_TEMP5 ; 
return X10_TEMP7 ; 
} 

int32_t /*static*/Random_nextbits (  struct Random  * const X10_TEMP0 , const int32_t bits ) 
{ 
/*UpdatableVariableDeclaration*/
int64_t oldseed = X10_TEMP0 ->seed ; 
const int64_t X10_TEMP2 = oldseed * _Random_multiplier ; 
const int64_t X10_TEMP4 = X10_TEMP2 + _Random_addend ; 
/*UpdatableVariableDeclaration*/
int64_t nextseed = X10_TEMP4 & _Random_mask ; 
const int64_t X10_TEMP7 = nextseed ; 
X10_TEMP0 ->seed = ( X10_TEMP7 ) ; 
const int32_t X10_TEMP8 = 48 ; 
const int32_t X10_TEMP10 = X10_TEMP8 - bits ; 
const int64_t X10_TEMP12 = (((nextseed >> X10_TEMP10) ) & ((9223372036854775807 >> X10_TEMP10))); 
const int32_t X10_TEMP14 = /*casting*/( int32_t ) X10_TEMP12 ; 
return X10_TEMP14 ; 
} 

int32_t /*static*/Random_nextInt (  struct Random  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP2 = 32 ; 
const int32_t X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
return X10_TEMP4 ; 
} 

int64_t /*static*/Random_nextLong (  struct Random  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP2 = 32 ; 
const int32_t X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const int64_t X10_TEMP5 = /*casting*/( int64_t ) X10_TEMP4 ; 
const int32_t X10_TEMP6 = 32 ; 
const int64_t X10_TEMP8 = X10_TEMP5 << X10_TEMP6 ; 
const int32_t X10_TEMP10 = 32 ; 
const int32_t X10_TEMP11 = Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ; 
const int64_t X10_TEMP13 = X10_TEMP8 + X10_TEMP11 ; 
return X10_TEMP13 ; 
} 

uint32_t /*static*/Random_nextBoolean (  struct Random  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP2 = 1 ; 
const int32_t X10_TEMP3 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const int32_t X10_TEMP4 = 0 ; 
const uint32_t X10_TEMP6 = X10_TEMP3 != X10_TEMP4 ; 
return X10_TEMP6 ; 
} 

double /*static*/Random_nextDouble (  struct Random  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP2 = 26 ; 
const int32_t X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const int64_t X10_TEMP5 = /*casting*/( int64_t ) X10_TEMP4 ; 
const int32_t X10_TEMP6 = 27 ; 
const int64_t X10_TEMP8 = X10_TEMP5 << X10_TEMP6 ; 
const int32_t X10_TEMP10 = 27 ; 
const int32_t X10_TEMP11 = Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ; 
const int64_t X10_TEMP13 = X10_TEMP8 + X10_TEMP11 ; 
const int64_t X10_TEMP14 = 1L ; 
const int32_t X10_TEMP15 = 53 ; 
const int64_t X10_TEMP17 = X10_TEMP14 << X10_TEMP15 ; 
const double X10_TEMP18 = /*casting*/( double ) X10_TEMP17 ; 
const double X10_TEMP20 = X10_TEMP13 / X10_TEMP18 ; 
return X10_TEMP20 ; 
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
struct SparseMatmult * X10_TEMP4 = (struct SparseMatmult  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct SparseMatmult ))),malloc(sizeof(struct SparseMatmult )));  
memset(X10_TEMP4,0,sizeof(struct SparseMatmult )); 
SparseMatmult_SparseMatmult( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
const int32_t X10_TEMP6 = 0 ; 
SparseMatmult_run ( X10_TEMP4 , X10_TEMP6 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP9 = "Wall-clock time for sparsemm: " ; 
const double X10_TEMP10 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC1, "%s%f",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP11 = tempC1;; 
const char * X10_TEMP12 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC2, "%s%s",X10_TEMP11,X10_TEMP12);
const char * X10_TEMP14 = tempC2;; 
fprintf(  stdout, "%s\n",X10_TEMP14 ) ; 
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

int64_t /*static*/_SparseMatmult_RANDOM_SEED_init ( ) 
{ 
const int64_t X10_TEMP2 = 10101010 ; 
return X10_TEMP2 ; 
} 

int32_t /*static*/_SparseMatmult_SPARSE_NUM_ITER_init ( ) 
{ 
const int32_t X10_TEMP2 = 200 ; 
return X10_TEMP2 ; 
} 

void /*static*/SparseMatmult_initDataSizes_M (  struct SparseMatmult  * const X10_TEMP0 ,  struct intRefArray1 const datasizesM ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const int32_t X10_TEMP4 = 100 ; 
const int32_t X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
struct Dist1 RX10_TEMP1 = datasizesM .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array datasizesM" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesM , RX10_TEMP3 , X10_TEMP5 ) ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP9 = 100000 ; 
const int32_t X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP12 = datasizesM .distValue ; 
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
char * RX10_TEMP19 = "Bad place access for array datasizesM" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesM , RX10_TEMP14 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 2 ; 
const int32_t X10_TEMP14 = 500000 ; 
const int32_t X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP23 = datasizesM .distValue ; 
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
char * RX10_TEMP30 = "Bad place access for array datasizesM" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesM , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

void /*static*/SparseMatmult_initDataSizes_N (  struct SparseMatmult  * const X10_TEMP0 ,  struct intRefArray1 const datasizesN ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const int32_t X10_TEMP4 = 100 ; 
const int32_t X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
struct Dist1 RX10_TEMP1 = datasizesN .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array datasizesN" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesN , RX10_TEMP3 , X10_TEMP5 ) ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP9 = 100000 ; 
const int32_t X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP12 = datasizesN .distValue ; 
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
char * RX10_TEMP19 = "Bad place access for array datasizesN" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesN , RX10_TEMP14 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 2 ; 
const int32_t X10_TEMP14 = 500000 ; 
const int32_t X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP23 = datasizesN .distValue ; 
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
char * RX10_TEMP30 = "Bad place access for array datasizesN" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesN , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

void /*static*/SparseMatmult_initDataSizes_NZ (  struct SparseMatmult  * const X10_TEMP0 ,  struct intRefArray1 const datasizesNZ ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const int32_t X10_TEMP4 = 500 ; 
const int32_t X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
struct Dist1 RX10_TEMP1 = datasizesNZ .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array datasizesNZ" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesNZ , RX10_TEMP3 , X10_TEMP5 ) ; 
const int32_t X10_TEMP7 = 1 ; 
const int32_t X10_TEMP9 = 500000 ; 
const int32_t X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP12 = datasizesNZ .distValue ; 
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
char * RX10_TEMP19 = "Bad place access for array datasizesNZ" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesNZ , RX10_TEMP14 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 2 ; 
const int32_t X10_TEMP14 = 2500000 ; 
const int32_t X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP23 = datasizesNZ .distValue ; 
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
char * RX10_TEMP30 = "Bad place access for array datasizesNZ" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( datasizesNZ , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

Random  * /*static*/_SparseMatmult_R_init ( ) 
{ 
struct Random * X10_TEMP3 = (struct Random  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Random ))),malloc(sizeof(struct Random )));  
memset(X10_TEMP3,0,sizeof(struct Random )); 
Random_Random( X10_TEMP3/*OBJECT INIT IN ASSIGNMENT*/, _SparseMatmult_RANDOM_SEED ) ; 
return X10_TEMP3 ; 
} 

void /*static*/SparseMatmult_JGFsetsize (  struct SparseMatmult  * const X10_TEMP0 , const int32_t setSize ) 
{ 
const int32_t X10_TEMP2 = setSize ; 
X10_TEMP0 ->setSize = ( X10_TEMP2 ) ; 
} 

void /*static*/SparseMatmult_JGFinitialise (  struct SparseMatmult  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 2 ; 
struct Region1 ar = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
struct Dist1 dr = getPlaceDist1 ( ar , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = dr .dReg ; 
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
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dr , RX10_TEMP9 ) ; 
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
intRefArray1_intRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, dr , RX10_TEMP17 ) ; 
struct intRefArray1 datasizes_M = RX10_TEMP20 ; 
struct Region1 RX10_TEMP21 = dr .dReg ; 
const int32_t RX10_TEMP22 = 0 ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP24 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int32_t RX10_TEMP25 = RX10_TEMP24 + 1; 
const int32_t RX10_TEMP26 = /*SimpleDistributionExpression*/ RX10_TEMP24 +1; 
void * TEMPCALLOCPOINTER3;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER3 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER3)[0] = RX10_TEMP26, TEMPCALLOCPOINTER3 = ((int32_t * )TEMPCALLOCPOINTER3)+1, memset(TEMPCALLOCPOINTER3,0,RX10_TEMP26*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( dr , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, RX10_TEMP31 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER4;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER4 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER4)[0] = RX10_TEMP25, TEMPCALLOCPOINTER4 = ((int32_t * )TEMPCALLOCPOINTER4)+1, memset(TEMPCALLOCPOINTER4,0,RX10_TEMP25*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP40 = 0;RX10_TEMP40 < RX10_TEMP25; RX10_TEMP40++) 

{ 
struct intStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] 
; 
RX10_TEMP38[RX10_TEMP40] = RX10_TEMP39 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP41  ; 
intRefArray1_intRefArray1( &RX10_TEMP41/*OBJECT INIT IN ASSIGNMENT*/, dr , RX10_TEMP38 ) ; 
struct intRefArray1 datasizes_N = RX10_TEMP41 ; 
struct Region1 RX10_TEMP42 = dr .dReg ; 
const int32_t RX10_TEMP43 = 0 ; 
const int32_t RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP45 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; const int32_t RX10_TEMP46 = RX10_TEMP45 + 1; 
const int32_t RX10_TEMP47 = /*SimpleDistributionExpression*/ RX10_TEMP45 +1; 
void * TEMPCALLOCPOINTER5;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER5 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER5)[0] = RX10_TEMP47, TEMPCALLOCPOINTER5 = ((int32_t * )TEMPCALLOCPOINTER5)+1, memset(TEMPCALLOCPOINTER5,0,RX10_TEMP47*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( dr , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, RX10_TEMP52 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER6;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER6)[0] = RX10_TEMP46, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,RX10_TEMP46*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP61 = 0;RX10_TEMP61 < RX10_TEMP46; RX10_TEMP61++) 

{ 
struct intStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] 
; 
RX10_TEMP59[RX10_TEMP61] = RX10_TEMP60 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP62  ; 
intRefArray1_intRefArray1( &RX10_TEMP62/*OBJECT INIT IN ASSIGNMENT*/, dr , RX10_TEMP59 ) ; 
struct intRefArray1 datasizes_nz = RX10_TEMP62 ; 
SparseMatmult_initDataSizes_M ( X10_TEMP0 , datasizes_M ) ; 
SparseMatmult_initDataSizes_N ( X10_TEMP0 , datasizes_N ) ; 
SparseMatmult_initDataSizes_NZ ( X10_TEMP0 , datasizes_nz ) ; 
const int32_t X10_TEMP21 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP63  ; 
Point1_Point1( &RX10_TEMP63/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP21 ) ; 
struct Dist1 RX10_TEMP64 = datasizes_N .distValue ; 
struct Region1 RX10_TEMP65 = RX10_TEMP64 .dReg ; 
const int32_t RX10_TEMP66 = searchPointInRegion1 ( RX10_TEMP65 , RX10_TEMP63 ) ; 
const int32_t RX10_TEMP67 = 0 ; 
const uint32_t RX10_TEMP68 = RX10_TEMP66 < RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP69 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP69 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP70 = getPlaceFromDist1 ( RX10_TEMP64 , RX10_TEMP66 ) ; 
const place_t RX10_TEMP72 = /* here  */ _here(); 
const uint32_t RX10_TEMP73 = RX10_TEMP70 != RX10_TEMP72 ; 
if ( RX10_TEMP73 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP71 = "Bad place access for array datasizes_N" ; 
fprintf(stderr, "%s",RX10_TEMP71 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP74 = getRefArrayValue1int ( datasizes_N , RX10_TEMP66 ) ; 
const int32_t ds_N = RX10_TEMP74 ; 
const int32_t X10_TEMP24 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP75  ; 
Point1_Point1( &RX10_TEMP75/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP24 ) ; 
struct Dist1 RX10_TEMP76 = datasizes_M .distValue ; 
struct Region1 RX10_TEMP77 = RX10_TEMP76 .dReg ; 
const int32_t RX10_TEMP78 = searchPointInRegion1 ( RX10_TEMP77 , RX10_TEMP75 ) ; 
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
char * RX10_TEMP83 = "Bad place access for array datasizes_M" ; 
fprintf(stderr, "%s",RX10_TEMP83 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP86 = getRefArrayValue1int ( datasizes_M , RX10_TEMP78 ) ; 
const int32_t ds_M = RX10_TEMP86 ; 
const int32_t X10_TEMP27 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP87  ; 
Point1_Point1( &RX10_TEMP87/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP27 ) ; 
struct Dist1 RX10_TEMP88 = datasizes_nz .distValue ; 
struct Region1 RX10_TEMP89 = RX10_TEMP88 .dReg ; 
const int32_t RX10_TEMP90 = searchPointInRegion1 ( RX10_TEMP89 , RX10_TEMP87 ) ; 
const int32_t RX10_TEMP91 = 0 ; 
const uint32_t RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91 ; 
if ( RX10_TEMP92 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP93 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP93 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP94 = getPlaceFromDist1 ( RX10_TEMP88 , RX10_TEMP90 ) ; 
const place_t RX10_TEMP96 = /* here  */ _here(); 
const uint32_t RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP95 = "Bad place access for array datasizes_nz" ; 
fprintf(stderr, "%s",RX10_TEMP95 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP98 = getRefArrayValue1int ( datasizes_nz , RX10_TEMP90 ) ; 
const int32_t ds_nz = RX10_TEMP98 ; 
const int32_t X10_TEMP32 = 0 ; 
const int32_t X10_TEMP30 = 1 ; 
const int32_t X10_TEMP33 = ds_nz - X10_TEMP30 ; 
struct Region1 r_nz = createNewRegion1R ( X10_TEMP32 , X10_TEMP33 ) ; 
const int32_t X10_TEMP39 = 0 ; 
const int32_t X10_TEMP36 = X10_TEMP0 ->nthreads ; 
const int32_t X10_TEMP37 = 1 ; 
const int32_t X10_TEMP40 = X10_TEMP36 - X10_TEMP37 ; 
struct Region1 r_nthreads = createNewRegion1R ( X10_TEMP39 , X10_TEMP40 ) ; 
const int32_t X10_TEMP45 = 0 ; 
const int32_t X10_TEMP43 = 1 ; 
const int32_t X10_TEMP46 = ds_M - X10_TEMP43 ; 
struct Region1 X10_TEMP48 = createNewRegion1R ( X10_TEMP45 , X10_TEMP46 ) ; 
struct Dist1 X10_TEMP49 = getBlockDist1 ( X10_TEMP48 ) ; 
struct Dist1 d_M = X10_TEMP49 ; 
const int32_t X10_TEMP53 = 0 ; 
const int32_t X10_TEMP54 = X10_TEMP0 ->nthreads ; 
struct Region1 r_nthreadsPlus1 = createNewRegion1R ( X10_TEMP53 , X10_TEMP54 ) ; 
const int32_t X10_TEMP59 = 0 ; 
const int32_t X10_TEMP57 = 1 ; 
const int32_t X10_TEMP60 = ds_N - X10_TEMP57 ; 
struct Region1 ds_NReg = createNewRegion1R ( X10_TEMP59 , X10_TEMP60 ) ; 
const place_t X10_TEMP62 = /* here  */ _here(); 
struct Dist1 ds_NRegDist = getPlaceDist1 ( ds_NReg , X10_TEMP62 ) ; 
struct Region1 RX10_TEMP99 = ds_NRegDist .dReg ; 
const int32_t RX10_TEMP100 = 0 ; 
const int32_t RX10_TEMP101 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP102 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP102 = RX10_TEMP102 - RX10_TEMP101 ; const int32_t RX10_TEMP103 = RX10_TEMP102 + 1; 
const int32_t RX10_TEMP104 = /*SimpleDistributionExpression*/ RX10_TEMP102 +1; 
void * TEMPCALLOCPOINTER7;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP105 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER7 = malloc(sizeof(int32_t)+(RX10_TEMP104*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP104*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER7)[0] = RX10_TEMP104, TEMPCALLOCPOINTER7 = ((int32_t * )TEMPCALLOCPOINTER7)+1, memset(TEMPCALLOCPOINTER7,0,RX10_TEMP104*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP106= 0; RX10_TEMP106<  RX10_TEMP103; RX10_TEMP106++ )
 
{ 
const place_t RX10_TEMP107 = /* here  */ _here(); 
const int32_t RX10_TEMP108 = /*PointAccess*/RX10_TEMP106 ; 
const place_t RX10_TEMP109 = /* place.places ( RX10_TEMP108 )  */ _toplace(RX10_TEMP108 ); 
const int32_t RX10_TEMP110 = getDistLocalCount1 ( ds_NRegDist , RX10_TEMP108 ) ; 
const int32_t RX10_TEMP111 = RX10_TEMP110 - RX10_TEMP101 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP111 , RX10_TEMP107 , RX10_TEMP106 , RX10_TEMP105 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP109 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER8;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP115 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER8 = malloc(sizeof(int32_t)+(RX10_TEMP103*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP103*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER8)[0] = RX10_TEMP103, TEMPCALLOCPOINTER8 = ((int32_t * )TEMPCALLOCPOINTER8)+1, memset(TEMPCALLOCPOINTER8,0,RX10_TEMP103*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP117 = 0;RX10_TEMP117 < RX10_TEMP103; RX10_TEMP117++) 

{ 
struct doubleStub RX10_TEMP116 = RX10_TEMP105 [ RX10_TEMP117 ] 
; 
RX10_TEMP115[RX10_TEMP117] = RX10_TEMP116 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP118  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP118/*OBJECT INIT IN ASSIGNMENT*/, ds_NRegDist , RX10_TEMP115 ) ; 
struct doubleRefArray1 X10_TEMP64 = RX10_TEMP118 ; 
struct doubleRefArray1 X10_TEMP67 = SparseMatmult_init ( X10_TEMP64 , _SparseMatmult_R ) ; 
struct doubleRefArray1 xin = X10_TEMP67 ; 
const int32_t X10_TEMP75 = 0 ; 
struct Dist1 RX10_TEMP119 = xin .distValue ; 
struct Dist1 X10_TEMP70 = RX10_TEMP119 ; 
struct Region1 RX10_TEMP120 = X10_TEMP70 .dReg ; 
struct Region1 X10_TEMP71 = RX10_TEMP120 ; 
const int32_t X10_TEMP72 = X10_TEMP71 .regSize ; 
const int32_t X10_TEMP73 = 1 ; 
const int32_t X10_TEMP76 = X10_TEMP72 - X10_TEMP73 ; 
struct Region1 xinreg = createNewRegion1R ( X10_TEMP75 , X10_TEMP76 ) ; 
const place_t X10_TEMP78 = /* here  */ _here(); 
struct Dist1 xinregDist = getPlaceDist1 ( xinreg , X10_TEMP78 ) ; 
struct Region1 RX10_TEMP121 = xinreg ; 
const int32_t RX10_TEMP136 = xinreg .regSize ; 
const int32_t RX10_TEMP137 = 1 ; 
const int32_t RX10_TEMP138 = RX10_TEMP136 - RX10_TEMP137 ; 
const int32_t RX10_TEMP135 = RX10_TEMP138 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER9;
/*VALUE ARRAY*/ double * const RX10_TEMP139 = (/*VALUE ARRAY*/ double * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER9 = malloc(sizeof(int32_t)+(RX10_TEMP135*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP135*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER9)[0] = RX10_TEMP135, TEMPCALLOCPOINTER9 = ((int32_t * )TEMPCALLOCPOINTER9)+1, memset(TEMPCALLOCPOINTER9,0,RX10_TEMP135*sizeof(double )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP122 = 0;RX10_TEMP122 < RX10_TEMP135; RX10_TEMP122++) 

{ 
const int32_t RX10_TEMP123 = /*PointAccess*/RX10_TEMP122 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP121 , RX10_TEMP123 ) ; 
struct Dist1 RX10_TEMP124 = xin .distValue ; 
struct Region1 RX10_TEMP125 = RX10_TEMP124 .dReg ; 
const int32_t RX10_TEMP126 = searchPointInRegion1 ( RX10_TEMP125 , p ) ; 
const int32_t RX10_TEMP127 = 0 ; 
const uint32_t RX10_TEMP128 = RX10_TEMP126 < RX10_TEMP127 ; 
if ( RX10_TEMP128 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP129 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP129 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP130 = getPlaceFromDist1 ( RX10_TEMP124 , RX10_TEMP126 ) ; 
const place_t RX10_TEMP132 = /* here  */ _here(); 
const uint32_t RX10_TEMP133 = RX10_TEMP130 != RX10_TEMP132 ; 
if ( RX10_TEMP133 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP131 = "Bad place access for array xin" ; 
fprintf(stderr, "%s",RX10_TEMP131 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP134 = getRefArrayValue1double ( xin , RX10_TEMP126 ) ; 
const double X10_TEMP82 = RX10_TEMP134 ; 
RX10_TEMP139[RX10_TEMP122] = X10_TEMP82 ; 
} 
/*END OF ARRAY INIT*/struct doubleValArray1 RX10_TEMP140  ; 
doubleValArray1_doubleValArray1( &RX10_TEMP140/*OBJECT INIT IN ASSIGNMENT*/, xinreg , RX10_TEMP139 ) ; 
struct doubleValArray1 X10_TEMP83 = RX10_TEMP140 ; 
struct doubleValArray1 X10_TEMP85 = X10_TEMP83 ; 
X10_TEMP0 ->x = ( X10_TEMP85 ) ; 
struct Region1 RX10_TEMP141 = d_M .dReg ; 
const int32_t RX10_TEMP142 = 0 ; 
const int32_t RX10_TEMP143 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP144 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP144 = RX10_TEMP144 - RX10_TEMP143 ; const int32_t RX10_TEMP145 = RX10_TEMP144 + 1; 
const int32_t RX10_TEMP146 = /*SimpleDistributionExpression*/ RX10_TEMP144 +1; 
void * TEMPCALLOCPOINTER10;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP147 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER10 = malloc(sizeof(int32_t)+(RX10_TEMP146*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP146*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER10)[0] = RX10_TEMP146, TEMPCALLOCPOINTER10 = ((int32_t * )TEMPCALLOCPOINTER10)+1, memset(TEMPCALLOCPOINTER10,0,RX10_TEMP146*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP148= 0; RX10_TEMP148<  RX10_TEMP145; RX10_TEMP148++ )
 
{ 
const place_t RX10_TEMP149 = /* here  */ _here(); 
const int32_t RX10_TEMP150 = /*PointAccess*/RX10_TEMP148 ; 
const place_t RX10_TEMP151 = /* place.places ( RX10_TEMP150 )  */ _toplace(RX10_TEMP150 ); 
const int32_t RX10_TEMP152 = getDistLocalCount1 ( d_M , RX10_TEMP150 ) ; 
const int32_t RX10_TEMP153 = RX10_TEMP152 - RX10_TEMP143 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP153 , RX10_TEMP149 , RX10_TEMP148 , RX10_TEMP147 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP151 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER11;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP157 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER11 = malloc(sizeof(int32_t)+(RX10_TEMP145*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP145*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER11)[0] = RX10_TEMP145, TEMPCALLOCPOINTER11 = ((int32_t * )TEMPCALLOCPOINTER11)+1, memset(TEMPCALLOCPOINTER11,0,RX10_TEMP145*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP159 = 0;RX10_TEMP159 < RX10_TEMP145; RX10_TEMP159++) 

{ 
struct doubleStub RX10_TEMP158 = RX10_TEMP147 [ RX10_TEMP159 ] 
; 
RX10_TEMP157[RX10_TEMP159] = RX10_TEMP158 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP160  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP160/*OBJECT INIT IN ASSIGNMENT*/, d_M , RX10_TEMP157 ) ; 
struct doubleRefArray1 X10_TEMP87 = RX10_TEMP160 ; 
struct doubleRefArray1 X10_TEMP88 = X10_TEMP87 ; 
X10_TEMP0 ->y = ( X10_TEMP88 ) ; 
const place_t X10_TEMP89 = /* here  */ _here(); 
struct Dist1 r_nthreadsregDist = getPlaceDist1 ( r_nthreads , X10_TEMP89 ) ; 
struct Region1 RX10_TEMP161 = r_nthreadsregDist .dReg ; 
const int32_t RX10_TEMP162 = 0 ; 
const int32_t RX10_TEMP163 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP164 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP164 = RX10_TEMP164 - RX10_TEMP163 ; const int32_t RX10_TEMP165 = RX10_TEMP164 + 1; 
const int32_t RX10_TEMP166 = /*SimpleDistributionExpression*/ RX10_TEMP164 +1; 
void * TEMPCALLOCPOINTER12;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP167 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER12 = malloc(sizeof(int32_t)+(RX10_TEMP166*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP166*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER12)[0] = RX10_TEMP166, TEMPCALLOCPOINTER12 = ((int32_t * )TEMPCALLOCPOINTER12)+1, memset(TEMPCALLOCPOINTER12,0,RX10_TEMP166*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP168= 0; RX10_TEMP168<  RX10_TEMP165; RX10_TEMP168++ )
 
{ 
const place_t RX10_TEMP169 = /* here  */ _here(); 
const int32_t RX10_TEMP170 = /*PointAccess*/RX10_TEMP168 ; 
const place_t RX10_TEMP171 = /* place.places ( RX10_TEMP170 )  */ _toplace(RX10_TEMP170 ); 
const int32_t RX10_TEMP172 = getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP170 ) ; 
const int32_t RX10_TEMP173 = RX10_TEMP172 - RX10_TEMP163 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP173 , RX10_TEMP169 , RX10_TEMP168 , RX10_TEMP167 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC5) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP171 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER13;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP177 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER13 = malloc(sizeof(int32_t)+(RX10_TEMP165*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP165*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER13)[0] = RX10_TEMP165, TEMPCALLOCPOINTER13 = ((int32_t * )TEMPCALLOCPOINTER13)+1, memset(TEMPCALLOCPOINTER13,0,RX10_TEMP165*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP179 = 0;RX10_TEMP179 < RX10_TEMP165; RX10_TEMP179++) 

{ 
struct intStub RX10_TEMP178 = RX10_TEMP167 [ RX10_TEMP179 ] 
; 
RX10_TEMP177[RX10_TEMP179] = RX10_TEMP178 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP180  ; 
intRefArray1_intRefArray1( &RX10_TEMP180/*OBJECT INIT IN ASSIGNMENT*/, r_nthreadsregDist , RX10_TEMP177 ) ; 
struct intRefArray1 X10_TEMP91 = RX10_TEMP180 ; 
/*UpdatableVariableDeclaration*/
 struct intRefArray1 ilow = X10_TEMP91 ; 
struct Region1 RX10_TEMP181 = r_nthreadsregDist .dReg ; 
const int32_t RX10_TEMP182 = 0 ; 
const int32_t RX10_TEMP183 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP184 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP184 = RX10_TEMP184 - RX10_TEMP183 ; const int32_t RX10_TEMP185 = RX10_TEMP184 + 1; 
const int32_t RX10_TEMP186 = /*SimpleDistributionExpression*/ RX10_TEMP184 +1; 
void * TEMPCALLOCPOINTER14;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP187 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER14 = malloc(sizeof(int32_t)+(RX10_TEMP186*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP186*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER14)[0] = RX10_TEMP186, TEMPCALLOCPOINTER14 = ((int32_t * )TEMPCALLOCPOINTER14)+1, memset(TEMPCALLOCPOINTER14,0,RX10_TEMP186*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP188= 0; RX10_TEMP188<  RX10_TEMP185; RX10_TEMP188++ )
 
{ 
const place_t RX10_TEMP189 = /* here  */ _here(); 
const int32_t RX10_TEMP190 = /*PointAccess*/RX10_TEMP188 ; 
const place_t RX10_TEMP191 = /* place.places ( RX10_TEMP190 )  */ _toplace(RX10_TEMP190 ); 
const int32_t RX10_TEMP192 = getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP190 ) ; 
const int32_t RX10_TEMP193 = RX10_TEMP192 - RX10_TEMP183 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP193 , RX10_TEMP189 , RX10_TEMP188 , RX10_TEMP187 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC6) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, RX10_TEMP191 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER15;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP197 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER15 = malloc(sizeof(int32_t)+(RX10_TEMP185*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP185*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER15)[0] = RX10_TEMP185, TEMPCALLOCPOINTER15 = ((int32_t * )TEMPCALLOCPOINTER15)+1, memset(TEMPCALLOCPOINTER15,0,RX10_TEMP185*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP199 = 0;RX10_TEMP199 < RX10_TEMP185; RX10_TEMP199++) 

{ 
struct intStub RX10_TEMP198 = RX10_TEMP187 [ RX10_TEMP199 ] 
; 
RX10_TEMP197[RX10_TEMP199] = RX10_TEMP198 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP200  ; 
intRefArray1_intRefArray1( &RX10_TEMP200/*OBJECT INIT IN ASSIGNMENT*/, r_nthreadsregDist , RX10_TEMP197 ) ; 
struct intRefArray1 X10_TEMP93 = RX10_TEMP200 ; 
/*UpdatableVariableDeclaration*/
 struct intRefArray1 iup = X10_TEMP93 ; 
const place_t X10_TEMP95 = /* here  */ _here(); 
struct Dist1 r_nthreadsplus1regDist = getPlaceDist1 ( r_nthreadsPlus1 , X10_TEMP95 ) ; 
const place_t X10_TEMP97 = /* here  */ _here(); 
struct Dist1 dsnzDist = getPlaceDist1 ( r_nz , X10_TEMP97 ) ; 
struct Region1 RX10_TEMP201 = dsnzDist .dReg ; 
const int32_t RX10_TEMP202 = 0 ; 
const int32_t RX10_TEMP203 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP204 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP204 = RX10_TEMP204 - RX10_TEMP203 ; const int32_t RX10_TEMP205 = RX10_TEMP204 + 1; 
const int32_t RX10_TEMP206 = /*SimpleDistributionExpression*/ RX10_TEMP204 +1; 
void * TEMPCALLOCPOINTER16;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP207 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER16 = malloc(sizeof(int32_t)+(RX10_TEMP206*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP206*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER16)[0] = RX10_TEMP206, TEMPCALLOCPOINTER16 = ((int32_t * )TEMPCALLOCPOINTER16)+1, memset(TEMPCALLOCPOINTER16,0,RX10_TEMP206*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP208= 0; RX10_TEMP208<  RX10_TEMP205; RX10_TEMP208++ )
 
{ 
const place_t RX10_TEMP209 = /* here  */ _here(); 
const int32_t RX10_TEMP210 = /*PointAccess*/RX10_TEMP208 ; 
const place_t RX10_TEMP211 = /* place.places ( RX10_TEMP210 )  */ _toplace(RX10_TEMP210 ); 
const int32_t RX10_TEMP212 = getDistLocalCount1 ( dsnzDist , RX10_TEMP210 ) ; 
const int32_t RX10_TEMP213 = RX10_TEMP212 - RX10_TEMP203 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP213 , RX10_TEMP209 , RX10_TEMP208 , RX10_TEMP207 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC7) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, RX10_TEMP211 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER17;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP217 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER17 = malloc(sizeof(int32_t)+(RX10_TEMP205*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP205*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER17)[0] = RX10_TEMP205, TEMPCALLOCPOINTER17 = ((int32_t * )TEMPCALLOCPOINTER17)+1, memset(TEMPCALLOCPOINTER17,0,RX10_TEMP205*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP219 = 0;RX10_TEMP219 < RX10_TEMP205; RX10_TEMP219++) 

{ 
struct intStub RX10_TEMP218 = RX10_TEMP207 [ RX10_TEMP219 ] 
; 
RX10_TEMP217[RX10_TEMP219] = RX10_TEMP218 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP220  ; 
intRefArray1_intRefArray1( &RX10_TEMP220/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP217 ) ; 
struct intRefArray1 rowt = RX10_TEMP220 ; 
struct Region1 RX10_TEMP221 = dsnzDist .dReg ; 
const int32_t RX10_TEMP222 = 0 ; 
const int32_t RX10_TEMP223 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP224 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP224 = RX10_TEMP224 - RX10_TEMP223 ; const int32_t RX10_TEMP225 = RX10_TEMP224 + 1; 
const int32_t RX10_TEMP226 = /*SimpleDistributionExpression*/ RX10_TEMP224 +1; 
void * TEMPCALLOCPOINTER18;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP227 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER18 = malloc(sizeof(int32_t)+(RX10_TEMP226*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP226*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER18)[0] = RX10_TEMP226, TEMPCALLOCPOINTER18 = ((int32_t * )TEMPCALLOCPOINTER18)+1, memset(TEMPCALLOCPOINTER18,0,RX10_TEMP226*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP228= 0; RX10_TEMP228<  RX10_TEMP225; RX10_TEMP228++ )
 
{ 
const place_t RX10_TEMP229 = /* here  */ _here(); 
const int32_t RX10_TEMP230 = /*PointAccess*/RX10_TEMP228 ; 
const place_t RX10_TEMP231 = /* place.places ( RX10_TEMP230 )  */ _toplace(RX10_TEMP230 ); 
const int32_t RX10_TEMP232 = getDistLocalCount1 ( dsnzDist , RX10_TEMP230 ) ; 
const int32_t RX10_TEMP233 = RX10_TEMP232 - RX10_TEMP223 ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP233 , RX10_TEMP229 , RX10_TEMP228 , RX10_TEMP227 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC8) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP231 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER19;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP237 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER19 = malloc(sizeof(int32_t)+(RX10_TEMP225*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP225*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER19)[0] = RX10_TEMP225, TEMPCALLOCPOINTER19 = ((int32_t * )TEMPCALLOCPOINTER19)+1, memset(TEMPCALLOCPOINTER19,0,RX10_TEMP225*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP239 = 0;RX10_TEMP239 < RX10_TEMP225; RX10_TEMP239++) 

{ 
struct intStub RX10_TEMP238 = RX10_TEMP227 [ RX10_TEMP239 ] 
; 
RX10_TEMP237[RX10_TEMP239] = RX10_TEMP238 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP240  ; 
intRefArray1_intRefArray1( &RX10_TEMP240/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP237 ) ; 
struct intRefArray1 colt = RX10_TEMP240 ; 
struct Region1 RX10_TEMP241 = dsnzDist .dReg ; 
const int32_t RX10_TEMP242 = 0 ; 
const int32_t RX10_TEMP243 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP244 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP244 = RX10_TEMP244 - RX10_TEMP243 ; const int32_t RX10_TEMP245 = RX10_TEMP244 + 1; 
const int32_t RX10_TEMP246 = /*SimpleDistributionExpression*/ RX10_TEMP244 +1; 
void * TEMPCALLOCPOINTER20;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP247 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER20 = malloc(sizeof(int32_t)+(RX10_TEMP246*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP246*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER20)[0] = RX10_TEMP246, TEMPCALLOCPOINTER20 = ((int32_t * )TEMPCALLOCPOINTER20)+1, memset(TEMPCALLOCPOINTER20,0,RX10_TEMP246*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP248= 0; RX10_TEMP248<  RX10_TEMP245; RX10_TEMP248++ )
 
{ 
const place_t RX10_TEMP249 = /* here  */ _here(); 
const int32_t RX10_TEMP250 = /*PointAccess*/RX10_TEMP248 ; 
const place_t RX10_TEMP251 = /* place.places ( RX10_TEMP250 )  */ _toplace(RX10_TEMP250 ); 
const int32_t RX10_TEMP252 = getDistLocalCount1 ( dsnzDist , RX10_TEMP250 ) ; 
const int32_t RX10_TEMP253 = RX10_TEMP252 - RX10_TEMP243 ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP253 , RX10_TEMP249 , RX10_TEMP248 , RX10_TEMP247 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC9) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, RX10_TEMP251 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER21;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP257 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER21 = malloc(sizeof(int32_t)+(RX10_TEMP245*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP245*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER21)[0] = RX10_TEMP245, TEMPCALLOCPOINTER21 = ((int32_t * )TEMPCALLOCPOINTER21)+1, memset(TEMPCALLOCPOINTER21,0,RX10_TEMP245*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP259 = 0;RX10_TEMP259 < RX10_TEMP245; RX10_TEMP259++) 

{ 
struct doubleStub RX10_TEMP258 = RX10_TEMP247 [ RX10_TEMP259 ] 
; 
RX10_TEMP257[RX10_TEMP259] = RX10_TEMP258 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP260  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP260/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP257 ) ; 
struct doubleRefArray1 valt = RX10_TEMP260 ; 
struct Region1 RX10_TEMP261 = r_nthreadsplus1regDist .dReg ; 
const int32_t RX10_TEMP262 = 0 ; 
const int32_t RX10_TEMP263 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP264 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP264 = RX10_TEMP264 - RX10_TEMP263 ; const int32_t RX10_TEMP265 = RX10_TEMP264 + 1; 
const int32_t RX10_TEMP266 = /*SimpleDistributionExpression*/ RX10_TEMP264 +1; 
void * TEMPCALLOCPOINTER22;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP267 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER22 = malloc(sizeof(int32_t)+(RX10_TEMP266*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP266*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER22)[0] = RX10_TEMP266, TEMPCALLOCPOINTER22 = ((int32_t * )TEMPCALLOCPOINTER22)+1, memset(TEMPCALLOCPOINTER22,0,RX10_TEMP266*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP268= 0; RX10_TEMP268<  RX10_TEMP265; RX10_TEMP268++ )
 
{ 
const place_t RX10_TEMP269 = /* here  */ _here(); 
const int32_t RX10_TEMP270 = /*PointAccess*/RX10_TEMP268 ; 
const place_t RX10_TEMP271 = /* place.places ( RX10_TEMP270 )  */ _toplace(RX10_TEMP270 ); 
const int32_t RX10_TEMP272 = getDistLocalCount1 ( r_nthreadsplus1regDist , RX10_TEMP270 ) ; 
const int32_t RX10_TEMP273 = RX10_TEMP272 - RX10_TEMP263 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP273 , RX10_TEMP269 , RX10_TEMP268 , RX10_TEMP267 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC10) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, RX10_TEMP271 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER23;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP277 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER23 = malloc(sizeof(int32_t)+(RX10_TEMP265*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP265*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER23)[0] = RX10_TEMP265, TEMPCALLOCPOINTER23 = ((int32_t * )TEMPCALLOCPOINTER23)+1, memset(TEMPCALLOCPOINTER23,0,RX10_TEMP265*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP279 = 0;RX10_TEMP279 < RX10_TEMP265; RX10_TEMP279++) 

{ 
struct intStub RX10_TEMP278 = RX10_TEMP267 [ RX10_TEMP279 ] 
; 
RX10_TEMP277[RX10_TEMP279] = RX10_TEMP278 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP280  ; 
intRefArray1_intRefArray1( &RX10_TEMP280/*OBJECT INIT IN ASSIGNMENT*/, r_nthreadsplus1regDist , RX10_TEMP277 ) ; 
/*UpdatableVariableDeclaration*/
 struct intRefArray1 sumT = RX10_TEMP280 ; 
const int32_t X10_TEMP103 = X10_TEMP0 ->nthreads ; 
const int32_t X10_TEMP104 = ds_M + X10_TEMP103 ; 
const int32_t X10_TEMP105 = 1 ; 
const int32_t X10_TEMP107 = X10_TEMP104 - X10_TEMP105 ; 
const int32_t X10_TEMP108 = X10_TEMP0 ->nthreads ; 
/*UpdatableVariableDeclaration*/
int32_t sect = X10_TEMP107 / X10_TEMP108 ; 
struct Region1 RX10_TEMP281 = dsnzDist .dReg ; 
const int32_t RX10_TEMP282 = 0 ; 
const int32_t RX10_TEMP283 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP284 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP284 = RX10_TEMP284 - RX10_TEMP283 ; const int32_t RX10_TEMP285 = RX10_TEMP284 + 1; 
const int32_t RX10_TEMP286 = /*SimpleDistributionExpression*/ RX10_TEMP284 +1; 
void * TEMPCALLOCPOINTER24;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP287 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER24 = malloc(sizeof(int32_t)+(RX10_TEMP286*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP286*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER24)[0] = RX10_TEMP286, TEMPCALLOCPOINTER24 = ((int32_t * )TEMPCALLOCPOINTER24)+1, memset(TEMPCALLOCPOINTER24,0,RX10_TEMP286*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP288= 0; RX10_TEMP288<  RX10_TEMP285; RX10_TEMP288++ )
 
{ 
const place_t RX10_TEMP289 = /* here  */ _here(); 
const int32_t RX10_TEMP290 = /*PointAccess*/RX10_TEMP288 ; 
const place_t RX10_TEMP291 = /* place.places ( RX10_TEMP290 )  */ _toplace(RX10_TEMP290 ); 
const int32_t RX10_TEMP292 = getDistLocalCount1 ( dsnzDist , RX10_TEMP290 ) ; 
const int32_t RX10_TEMP293 = RX10_TEMP292 - RX10_TEMP283 ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP293 , RX10_TEMP289 , RX10_TEMP288 , RX10_TEMP287 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC11) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, RX10_TEMP291 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER25;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP297 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER25 = malloc(sizeof(int32_t)+(RX10_TEMP285*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP285*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER25)[0] = RX10_TEMP285, TEMPCALLOCPOINTER25 = ((int32_t * )TEMPCALLOCPOINTER25)+1, memset(TEMPCALLOCPOINTER25,0,RX10_TEMP285*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP299 = 0;RX10_TEMP299 < RX10_TEMP285; RX10_TEMP299++) 

{ 
struct intStub RX10_TEMP298 = RX10_TEMP287 [ RX10_TEMP299 ] 
; 
RX10_TEMP297[RX10_TEMP299] = RX10_TEMP298 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP300  ; 
intRefArray1_intRefArray1( &RX10_TEMP300/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP297 ) ; 
/*UpdatableVariableDeclaration*/
 struct intRefArray1 rowin = RX10_TEMP300 ; 
struct Region1 RX10_TEMP301 = dsnzDist .dReg ; 
const int32_t RX10_TEMP302 = 0 ; 
const int32_t RX10_TEMP303 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP304 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP304 = RX10_TEMP304 - RX10_TEMP303 ; const int32_t RX10_TEMP305 = RX10_TEMP304 + 1; 
const int32_t RX10_TEMP306 = /*SimpleDistributionExpression*/ RX10_TEMP304 +1; 
void * TEMPCALLOCPOINTER26;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP307 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER26 = malloc(sizeof(int32_t)+(RX10_TEMP306*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP306*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER26)[0] = RX10_TEMP306, TEMPCALLOCPOINTER26 = ((int32_t * )TEMPCALLOCPOINTER26)+1, memset(TEMPCALLOCPOINTER26,0,RX10_TEMP306*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP308= 0; RX10_TEMP308<  RX10_TEMP305; RX10_TEMP308++ )
 
{ 
const place_t RX10_TEMP309 = /* here  */ _here(); 
const int32_t RX10_TEMP310 = /*PointAccess*/RX10_TEMP308 ; 
const place_t RX10_TEMP311 = /* place.places ( RX10_TEMP310 )  */ _toplace(RX10_TEMP310 ); 
const int32_t RX10_TEMP312 = getDistLocalCount1 ( dsnzDist , RX10_TEMP310 ) ; 
const int32_t RX10_TEMP313 = RX10_TEMP312 - RX10_TEMP303 ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP313 , RX10_TEMP309 , RX10_TEMP308 , RX10_TEMP307 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC12) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, RX10_TEMP311 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER27;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP317 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER27 = malloc(sizeof(int32_t)+(RX10_TEMP305*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP305*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER27)[0] = RX10_TEMP305, TEMPCALLOCPOINTER27 = ((int32_t * )TEMPCALLOCPOINTER27)+1, memset(TEMPCALLOCPOINTER27,0,RX10_TEMP305*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP319 = 0;RX10_TEMP319 < RX10_TEMP305; RX10_TEMP319++) 

{ 
struct intStub RX10_TEMP318 = RX10_TEMP307 [ RX10_TEMP319 ] 
; 
RX10_TEMP317[RX10_TEMP319] = RX10_TEMP318 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP320  ; 
intRefArray1_intRefArray1( &RX10_TEMP320/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP317 ) ; 
/*UpdatableVariableDeclaration*/
 struct intRefArray1 colin = RX10_TEMP320 ; 
struct Region1 RX10_TEMP321 = dsnzDist .dReg ; 
const int32_t RX10_TEMP322 = 0 ; 
const int32_t RX10_TEMP323 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP324 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP324 = RX10_TEMP324 - RX10_TEMP323 ; const int32_t RX10_TEMP325 = RX10_TEMP324 + 1; 
const int32_t RX10_TEMP326 = /*SimpleDistributionExpression*/ RX10_TEMP324 +1; 
void * TEMPCALLOCPOINTER28;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP327 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER28 = malloc(sizeof(int32_t)+(RX10_TEMP326*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP326*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER28)[0] = RX10_TEMP326, TEMPCALLOCPOINTER28 = ((int32_t * )TEMPCALLOCPOINTER28)+1, memset(TEMPCALLOCPOINTER28,0,RX10_TEMP326*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP328= 0; RX10_TEMP328<  RX10_TEMP325; RX10_TEMP328++ )
 
{ 
const place_t RX10_TEMP329 = /* here  */ _here(); 
const int32_t RX10_TEMP330 = /*PointAccess*/RX10_TEMP328 ; 
const place_t RX10_TEMP331 = /* place.places ( RX10_TEMP330 )  */ _toplace(RX10_TEMP330 ); 
const int32_t RX10_TEMP332 = getDistLocalCount1 ( dsnzDist , RX10_TEMP330 ) ; 
const int32_t RX10_TEMP333 = RX10_TEMP332 - RX10_TEMP323 ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP333 , RX10_TEMP329 , RX10_TEMP328 , RX10_TEMP327 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC13) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP331 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER29;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP337 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER29 = malloc(sizeof(int32_t)+(RX10_TEMP325*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP325*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER29)[0] = RX10_TEMP325, TEMPCALLOCPOINTER29 = ((int32_t * )TEMPCALLOCPOINTER29)+1, memset(TEMPCALLOCPOINTER29,0,RX10_TEMP325*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP339 = 0;RX10_TEMP339 < RX10_TEMP325; RX10_TEMP339++) 

{ 
struct doubleStub RX10_TEMP338 = RX10_TEMP327 [ RX10_TEMP339 ] 
; 
RX10_TEMP337[RX10_TEMP339] = RX10_TEMP338 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP340  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP340/*OBJECT INIT IN ASSIGNMENT*/, dsnzDist , RX10_TEMP337 ) ; 
/*UpdatableVariableDeclaration*/
 struct doubleRefArray1 valin = RX10_TEMP340 ; 
struct Region1 RX10_TEMP341 = r_nthreadsregDist .dReg ; 
const int32_t RX10_TEMP342 = 0 ; 
const int32_t RX10_TEMP343 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP344 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP344 = RX10_TEMP344 - RX10_TEMP343 ; const int32_t RX10_TEMP345 = RX10_TEMP344 + 1; 
const int32_t RX10_TEMP346 = /*SimpleDistributionExpression*/ RX10_TEMP344 +1; 
void * TEMPCALLOCPOINTER30;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP347 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER30 = malloc(sizeof(int32_t)+(RX10_TEMP346*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP346*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER30)[0] = RX10_TEMP346, TEMPCALLOCPOINTER30 = ((int32_t * )TEMPCALLOCPOINTER30)+1, memset(TEMPCALLOCPOINTER30,0,RX10_TEMP346*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP348= 0; RX10_TEMP348<  RX10_TEMP345; RX10_TEMP348++ )
 
{ 
const place_t RX10_TEMP349 = /* here  */ _here(); 
const int32_t RX10_TEMP350 = /*PointAccess*/RX10_TEMP348 ; 
const place_t RX10_TEMP351 = /* place.places ( RX10_TEMP350 )  */ _toplace(RX10_TEMP350 ); 
const int32_t RX10_TEMP352 = getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP350 ) ; 
const int32_t RX10_TEMP353 = RX10_TEMP352 - RX10_TEMP343 ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP353 , RX10_TEMP349 , RX10_TEMP348 , RX10_TEMP347 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC14) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP351 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER31;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP357 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER31 = malloc(sizeof(int32_t)+(RX10_TEMP345*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP345*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER31)[0] = RX10_TEMP345, TEMPCALLOCPOINTER31 = ((int32_t * )TEMPCALLOCPOINTER31)+1, memset(TEMPCALLOCPOINTER31,0,RX10_TEMP345*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP359 = 0;RX10_TEMP359 < RX10_TEMP345; RX10_TEMP359++) 

{ 
struct intStub RX10_TEMP358 = RX10_TEMP347 [ RX10_TEMP359 ] 
; 
RX10_TEMP357[RX10_TEMP359] = RX10_TEMP358 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP360  ; 
intRefArray1_intRefArray1( &RX10_TEMP360/*OBJECT INIT IN ASSIGNMENT*/, r_nthreadsregDist , RX10_TEMP357 ) ; 
struct intRefArray1 X10_TEMP113 = RX10_TEMP360 ; 
struct intRefArray1 lowsumin = X10_TEMP113 ; 
struct Region1 RX10_TEMP361 = r_nthreadsregDist .dReg ; 
const int32_t RX10_TEMP362 = 0 ; 
const int32_t RX10_TEMP363 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP364 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP364 = RX10_TEMP364 - RX10_TEMP363 ; const int32_t RX10_TEMP365 = RX10_TEMP364 + 1; 
const int32_t RX10_TEMP366 = /*SimpleDistributionExpression*/ RX10_TEMP364 +1; 
void * TEMPCALLOCPOINTER32;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP367 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER32 = malloc(sizeof(int32_t)+(RX10_TEMP366*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP366*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER32)[0] = RX10_TEMP366, TEMPCALLOCPOINTER32 = ((int32_t * )TEMPCALLOCPOINTER32)+1, memset(TEMPCALLOCPOINTER32,0,RX10_TEMP366*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP368= 0; RX10_TEMP368<  RX10_TEMP365; RX10_TEMP368++ )
 
{ 
const place_t RX10_TEMP369 = /* here  */ _here(); 
const int32_t RX10_TEMP370 = /*PointAccess*/RX10_TEMP368 ; 
const place_t RX10_TEMP371 = /* place.places ( RX10_TEMP370 )  */ _toplace(RX10_TEMP370 ); 
const int32_t RX10_TEMP372 = getDistLocalCount1 ( r_nthreadsregDist , RX10_TEMP370 ) ; 
const int32_t RX10_TEMP373 = RX10_TEMP372 - RX10_TEMP363 ; 
struct T16 utmp16  ; 
T16_T16( &utmp16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP373 , RX10_TEMP369 , RX10_TEMP368 , RX10_TEMP367 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC15) ;
a.size = sizeof(utmp16 );
a.params = (void *)(&utmp16 );
task_dispatch(a, RX10_TEMP371 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP377 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(RX10_TEMP365*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP365*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER33)[0] = RX10_TEMP365, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,RX10_TEMP365*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP379 = 0;RX10_TEMP379 < RX10_TEMP365; RX10_TEMP379++) 

{ 
struct intStub RX10_TEMP378 = RX10_TEMP367 [ RX10_TEMP379 ] 
; 
RX10_TEMP377[RX10_TEMP379] = RX10_TEMP378 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP380  ; 
intRefArray1_intRefArray1( &RX10_TEMP380/*OBJECT INIT IN ASSIGNMENT*/, r_nthreadsregDist , RX10_TEMP377 ) ; 
struct intRefArray1 X10_TEMP115 = RX10_TEMP380 ; 
struct intRefArray1 highsumin = X10_TEMP115 ; 
const int32_t X10_TEMP120 = 0 ; 
const int32_t X10_TEMP118 = 1 ; 
const int32_t X10_TEMP121 = ds_nz - X10_TEMP118 ; 
struct Region1 X10_TEMP123 = createNewRegion1R ( X10_TEMP120 , X10_TEMP121 ) ; 
const int32_t RX10_TEMP384 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP382 = X10_TEMP123 .regSize ; 
RX10_TEMP382 = RX10_TEMP382 - RX10_TEMP384 ; const int32_t RX10_TEMP383 = RX10_TEMP382 + 1; 
for ( int32_t RX10_TEMP381= 0; RX10_TEMP381<  RX10_TEMP383; RX10_TEMP381++ )
 
{ 
const int32_t RX10_TEMP385 = /*PointAccess*/RX10_TEMP381 ; 
struct Point1 p = regionOrdinalPoint1 ( X10_TEMP123 , RX10_TEMP385 ) ; 
const int32_t X10_TEMP126 = Random_nextInt ( _SparseMatmult_R ) ; 
const int32_t X10_TEMP127 = fabs ( X10_TEMP126 ) ; 
const int32_t X10_TEMP129 = X10_TEMP127 % ds_M ; 
const int32_t X10_TEMP130 = X10_TEMP129 ; 
struct Dist1 RX10_TEMP386 = rowin .distValue ; 
struct Region1 RX10_TEMP387 = RX10_TEMP386 .dReg ; 
const int32_t RX10_TEMP388 = searchPointInRegion1 ( RX10_TEMP387 , p ) ; 
const int32_t RX10_TEMP389 = 0 ; 
const uint32_t RX10_TEMP390 = RX10_TEMP388 < RX10_TEMP389 ; 
if ( RX10_TEMP390 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP391 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP391 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP392 = getPlaceFromDist1 ( RX10_TEMP386 , RX10_TEMP388 ) ; 
const place_t RX10_TEMP394 = /* here  */ _here(); 
const uint32_t RX10_TEMP395 = RX10_TEMP392 != RX10_TEMP394 ; 
if ( RX10_TEMP395 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP393 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP393 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( rowin , RX10_TEMP388 , X10_TEMP130 ) ; 
const int32_t X10_TEMP133 = Random_nextInt ( _SparseMatmult_R ) ; 
const int32_t X10_TEMP134 = fabs ( X10_TEMP133 ) ; 
const int32_t X10_TEMP136 = X10_TEMP134 % ds_N ; 
const int32_t X10_TEMP137 = X10_TEMP136 ; 
struct Dist1 RX10_TEMP396 = colin .distValue ; 
struct Region1 RX10_TEMP397 = RX10_TEMP396 .dReg ; 
const int32_t RX10_TEMP398 = searchPointInRegion1 ( RX10_TEMP397 , p ) ; 
const int32_t RX10_TEMP399 = 0 ; 
const uint32_t RX10_TEMP400 = RX10_TEMP398 < RX10_TEMP399 ; 
if ( RX10_TEMP400 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP401 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP401 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP402 = getPlaceFromDist1 ( RX10_TEMP396 , RX10_TEMP398 ) ; 
const place_t RX10_TEMP404 = /* here  */ _here(); 
const uint32_t RX10_TEMP405 = RX10_TEMP402 != RX10_TEMP404 ; 
if ( RX10_TEMP405 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP403 = "Bad place access for array colin" ; 
fprintf(stderr, "%s",RX10_TEMP403 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( colin , RX10_TEMP398 , X10_TEMP137 ) ; 
const double X10_TEMP140 = Random_nextDouble ( _SparseMatmult_R ) ; 
const double X10_TEMP141 = X10_TEMP140 ; 
struct Dist1 RX10_TEMP406 = valin .distValue ; 
struct Region1 RX10_TEMP407 = RX10_TEMP406 .dReg ; 
const int32_t RX10_TEMP408 = searchPointInRegion1 ( RX10_TEMP407 , p ) ; 
const int32_t RX10_TEMP409 = 0 ; 
const uint32_t RX10_TEMP410 = RX10_TEMP408 < RX10_TEMP409 ; 
if ( RX10_TEMP410 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP411 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP411 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP412 = getPlaceFromDist1 ( RX10_TEMP406 , RX10_TEMP408 ) ; 
const place_t RX10_TEMP414 = /* here  */ _here(); 
const uint32_t RX10_TEMP415 = RX10_TEMP412 != RX10_TEMP414 ; 
if ( RX10_TEMP415 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP413 = "Bad place access for array valin" ; 
fprintf(stderr, "%s",RX10_TEMP413 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( valin , RX10_TEMP408 , X10_TEMP141 ) ; 
} 

const int32_t RX10_TEMP419 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP417 = r_nthreads .regSize ; 
RX10_TEMP417 = RX10_TEMP417 - RX10_TEMP419 ; const int32_t RX10_TEMP418 = RX10_TEMP417 + 1; 
for ( int32_t RX10_TEMP416= 0; RX10_TEMP416<  RX10_TEMP418; RX10_TEMP416++ )
 
{ 
const int32_t RX10_TEMP420 = /*PointAccess*/RX10_TEMP416 ; 
struct Point1 i = regionOrdinalPoint1 ( r_nthreads , RX10_TEMP420 ) ; 
const int32_t X10_TEMP145 = i .f0 ; 
const int32_t X10_TEMP147 = X10_TEMP145 * sect ; 
const int32_t X10_TEMP148 = X10_TEMP147 ; 
struct Dist1 RX10_TEMP421 = ilow .distValue ; 
struct Region1 RX10_TEMP422 = RX10_TEMP421 .dReg ; 
const int32_t RX10_TEMP423 = searchPointInRegion1 ( RX10_TEMP422 , i ) ; 
const int32_t RX10_TEMP424 = 0 ; 
const uint32_t RX10_TEMP425 = RX10_TEMP423 < RX10_TEMP424 ; 
if ( RX10_TEMP425 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP426 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP426 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP427 = getPlaceFromDist1 ( RX10_TEMP421 , RX10_TEMP423 ) ; 
const place_t RX10_TEMP429 = /* here  */ _here(); 
const uint32_t RX10_TEMP430 = RX10_TEMP427 != RX10_TEMP429 ; 
if ( RX10_TEMP430 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP428 = "Bad place access for array ilow" ; 
fprintf(stderr, "%s",RX10_TEMP428 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( ilow , RX10_TEMP423 , X10_TEMP148 ) ; 
const int32_t X10_TEMP151 = i .f0 ; 
const int32_t X10_TEMP152 = 1 ; 
const int32_t X10_TEMP154 = X10_TEMP151 + X10_TEMP152 ; 
const int32_t X10_TEMP156 = X10_TEMP154 * sect ; 
const int32_t X10_TEMP157 = 1 ; 
const int32_t X10_TEMP159 = X10_TEMP156 - X10_TEMP157 ; 
const int32_t X10_TEMP160 = X10_TEMP159 ; 
struct Dist1 RX10_TEMP431 = iup .distValue ; 
struct Region1 RX10_TEMP432 = RX10_TEMP431 .dReg ; 
const int32_t RX10_TEMP433 = searchPointInRegion1 ( RX10_TEMP432 , i ) ; 
const int32_t RX10_TEMP434 = 0 ; 
const uint32_t RX10_TEMP435 = RX10_TEMP433 < RX10_TEMP434 ; 
if ( RX10_TEMP435 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP436 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP436 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP437 = getPlaceFromDist1 ( RX10_TEMP431 , RX10_TEMP433 ) ; 
const place_t RX10_TEMP439 = /* here  */ _here(); 
const uint32_t RX10_TEMP440 = RX10_TEMP437 != RX10_TEMP439 ; 
if ( RX10_TEMP440 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP438 = "Bad place access for array iup" ; 
fprintf(stderr, "%s",RX10_TEMP438 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( iup , RX10_TEMP433 , X10_TEMP160 ) ; 
struct Dist1 RX10_TEMP441 = iup .distValue ; 
struct Region1 RX10_TEMP442 = RX10_TEMP441 .dReg ; 
const int32_t RX10_TEMP443 = searchPointInRegion1 ( RX10_TEMP442 , i ) ; 
const int32_t RX10_TEMP444 = 0 ; 
const uint32_t RX10_TEMP445 = RX10_TEMP443 < RX10_TEMP444 ; 
if ( RX10_TEMP445 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP446 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP446 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP447 = getPlaceFromDist1 ( RX10_TEMP441 , RX10_TEMP443 ) ; 
const place_t RX10_TEMP449 = /* here  */ _here(); 
const uint32_t RX10_TEMP450 = RX10_TEMP447 != RX10_TEMP449 ; 
if ( RX10_TEMP450 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP448 = "Bad place access for array iup" ; 
fprintf(stderr, "%s",RX10_TEMP448 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP451 = getRefArrayValue1int ( iup , RX10_TEMP443 ) ; 
const int32_t X10_TEMP162 = RX10_TEMP451 ; 
const uint32_t X10_TEMP164 = X10_TEMP162 > ds_M ; 
if ( X10_TEMP164 ) 
{ 
const int32_t X10_TEMP167 = ds_M ; 
struct Dist1 RX10_TEMP452 = iup .distValue ; 
struct Region1 RX10_TEMP453 = RX10_TEMP452 .dReg ; 
const int32_t RX10_TEMP454 = searchPointInRegion1 ( RX10_TEMP453 , i ) ; 
const int32_t RX10_TEMP455 = 0 ; 
const uint32_t RX10_TEMP456 = RX10_TEMP454 < RX10_TEMP455 ; 
if ( RX10_TEMP456 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP457 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP457 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP458 = getPlaceFromDist1 ( RX10_TEMP452 , RX10_TEMP454 ) ; 
const place_t RX10_TEMP460 = /* here  */ _here(); 
const uint32_t RX10_TEMP461 = RX10_TEMP458 != RX10_TEMP460 ; 
if ( RX10_TEMP461 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP459 = "Bad place access for array iup" ; 
fprintf(stderr, "%s",RX10_TEMP459 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( iup , RX10_TEMP454 , X10_TEMP167 ) ; 
} 

} 

const int32_t RX10_TEMP465 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP463 = r_nz .regSize ; 
RX10_TEMP463 = RX10_TEMP463 - RX10_TEMP465 ; const int32_t RX10_TEMP464 = RX10_TEMP463 + 1; 
for ( int32_t RX10_TEMP462= 0; RX10_TEMP462<  RX10_TEMP464; RX10_TEMP462++ )
 
{ 
const int32_t RX10_TEMP466 = /*PointAccess*/RX10_TEMP462 ; 
struct Point1 i = regionOrdinalPoint1 ( r_nz , RX10_TEMP466 ) ; 
const int32_t RX10_TEMP470 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP468 = r_nthreads .regSize ; 
RX10_TEMP468 = RX10_TEMP468 - RX10_TEMP470 ; const int32_t RX10_TEMP469 = RX10_TEMP468 + 1; 
for ( int32_t RX10_TEMP467= 0; RX10_TEMP467<  RX10_TEMP469; RX10_TEMP467++ )
 
{ 
const int32_t RX10_TEMP471 = /*PointAccess*/RX10_TEMP467 ; 
struct Point1 j = regionOrdinalPoint1 ( r_nthreads , RX10_TEMP471 ) ; 
struct Dist1 RX10_TEMP472 = rowin .distValue ; 
struct Region1 RX10_TEMP473 = RX10_TEMP472 .dReg ; 
const int32_t RX10_TEMP474 = searchPointInRegion1 ( RX10_TEMP473 , i ) ; 
const int32_t RX10_TEMP475 = 0 ; 
const uint32_t RX10_TEMP476 = RX10_TEMP474 < RX10_TEMP475 ; 
if ( RX10_TEMP476 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP477 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP477 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP478 = getPlaceFromDist1 ( RX10_TEMP472 , RX10_TEMP474 ) ; 
const place_t RX10_TEMP480 = /* here  */ _here(); 
const uint32_t RX10_TEMP481 = RX10_TEMP478 != RX10_TEMP480 ; 
if ( RX10_TEMP481 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP479 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP479 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP482 = getRefArrayValue1int ( rowin , RX10_TEMP474 ) ; 
const int32_t X10_TEMP172 = RX10_TEMP482 ; 
struct Dist1 RX10_TEMP483 = ilow .distValue ; 
struct Region1 RX10_TEMP484 = RX10_TEMP483 .dReg ; 
const int32_t RX10_TEMP485 = searchPointInRegion1 ( RX10_TEMP484 , j ) ; 
const int32_t RX10_TEMP486 = 0 ; 
const uint32_t RX10_TEMP487 = RX10_TEMP485 < RX10_TEMP486 ; 
if ( RX10_TEMP487 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP488 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP488 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP489 = getPlaceFromDist1 ( RX10_TEMP483 , RX10_TEMP485 ) ; 
const place_t RX10_TEMP491 = /* here  */ _here(); 
const uint32_t RX10_TEMP492 = RX10_TEMP489 != RX10_TEMP491 ; 
if ( RX10_TEMP492 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP490 = "Bad place access for array ilow" ; 
fprintf(stderr, "%s",RX10_TEMP490 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP493 = getRefArrayValue1int ( ilow , RX10_TEMP485 ) ; 
const int32_t X10_TEMP173 = RX10_TEMP493 ; 
const uint32_t X10_TEMP175 = X10_TEMP172 >= X10_TEMP173 ; 
struct Dist1 RX10_TEMP494 = rowin .distValue ; 
struct Region1 RX10_TEMP495 = RX10_TEMP494 .dReg ; 
const int32_t RX10_TEMP496 = searchPointInRegion1 ( RX10_TEMP495 , i ) ; 
const int32_t RX10_TEMP497 = 0 ; 
const uint32_t RX10_TEMP498 = RX10_TEMP496 < RX10_TEMP497 ; 
if ( RX10_TEMP498 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP499 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP499 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP500 = getPlaceFromDist1 ( RX10_TEMP494 , RX10_TEMP496 ) ; 
const place_t RX10_TEMP502 = /* here  */ _here(); 
const uint32_t RX10_TEMP503 = RX10_TEMP500 != RX10_TEMP502 ; 
if ( RX10_TEMP503 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP501 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP501 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP504 = getRefArrayValue1int ( rowin , RX10_TEMP496 ) ; 
const int32_t X10_TEMP178 = RX10_TEMP504 ; 
struct Dist1 RX10_TEMP505 = iup .distValue ; 
struct Region1 RX10_TEMP506 = RX10_TEMP505 .dReg ; 
const int32_t RX10_TEMP507 = searchPointInRegion1 ( RX10_TEMP506 , j ) ; 
const int32_t RX10_TEMP508 = 0 ; 
const uint32_t RX10_TEMP509 = RX10_TEMP507 < RX10_TEMP508 ; 
if ( RX10_TEMP509 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP510 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP510 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP511 = getPlaceFromDist1 ( RX10_TEMP505 , RX10_TEMP507 ) ; 
const place_t RX10_TEMP513 = /* here  */ _here(); 
const uint32_t RX10_TEMP514 = RX10_TEMP511 != RX10_TEMP513 ; 
if ( RX10_TEMP514 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP512 = "Bad place access for array iup" ; 
fprintf(stderr, "%s",RX10_TEMP512 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP515 = getRefArrayValue1int ( iup , RX10_TEMP507 ) ; 
const int32_t X10_TEMP179 = RX10_TEMP515 ; 
const uint32_t X10_TEMP181 = X10_TEMP178 <= X10_TEMP179 ; 
const uint32_t X10_TEMP183 = X10_TEMP175 && X10_TEMP181 ; 
if ( X10_TEMP183 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP185 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP516 = j .f0 ; 
RX10_TEMP516 = RX10_TEMP516 + X10_TEMP185 ; struct Point1 X10_TEMP187  ; 
Point1_Point1( &X10_TEMP187/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP516 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP189 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP517 = j .f0 ; 
RX10_TEMP517 = RX10_TEMP517 + X10_TEMP189 ; struct Point1 X10_TEMP191  ; 
Point1_Point1( &X10_TEMP191/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP517 ) ; 
struct Dist1 RX10_TEMP518 = sumT .distValue ; 
struct Region1 RX10_TEMP519 = RX10_TEMP518 .dReg ; 
const int32_t RX10_TEMP520 = searchPointInRegion1 ( RX10_TEMP519 , X10_TEMP191 ) ; 
const int32_t RX10_TEMP521 = 0 ; 
const uint32_t RX10_TEMP522 = RX10_TEMP520 < RX10_TEMP521 ; 
if ( RX10_TEMP522 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP523 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP523 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP524 = getPlaceFromDist1 ( RX10_TEMP518 , RX10_TEMP520 ) ; 
const place_t RX10_TEMP526 = /* here  */ _here(); 
const uint32_t RX10_TEMP527 = RX10_TEMP524 != RX10_TEMP526 ; 
if ( RX10_TEMP527 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP525 = "Bad place access for array sumT" ; 
fprintf(stderr, "%s",RX10_TEMP525 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP528 = getRefArrayValue1int ( sumT , RX10_TEMP520 ) ; 
const int32_t X10_TEMP192 = RX10_TEMP528 ; 
const int32_t X10_TEMP193 = 1 ; 
const int32_t X10_TEMP195 = X10_TEMP192 + X10_TEMP193 ; 
const int32_t X10_TEMP196 = X10_TEMP195 ; 
struct Dist1 RX10_TEMP529 = sumT .distValue ; 
struct Region1 RX10_TEMP530 = RX10_TEMP529 .dReg ; 
const int32_t RX10_TEMP531 = searchPointInRegion1 ( RX10_TEMP530 , X10_TEMP187 ) ; 
const int32_t RX10_TEMP532 = 0 ; 
const uint32_t RX10_TEMP533 = RX10_TEMP531 < RX10_TEMP532 ; 
if ( RX10_TEMP533 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP534 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP534 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP535 = getPlaceFromDist1 ( RX10_TEMP529 , RX10_TEMP531 ) ; 
const place_t RX10_TEMP537 = /* here  */ _here(); 
const uint32_t RX10_TEMP538 = RX10_TEMP535 != RX10_TEMP537 ; 
if ( RX10_TEMP538 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP536 = "Bad place access for array sumT" ; 
fprintf(stderr, "%s",RX10_TEMP536 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( sumT , RX10_TEMP531 , X10_TEMP196 ) ; 
} 

} 

} 

const int32_t RX10_TEMP543 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP541 = r_nthreads .regSize ; 
RX10_TEMP541 = RX10_TEMP541 - RX10_TEMP543 ; const int32_t RX10_TEMP542 = RX10_TEMP541 + 1; 
for ( int32_t RX10_TEMP539= 0; RX10_TEMP539<  RX10_TEMP542; RX10_TEMP539++ )
 
{ 
const int32_t RX10_TEMP544 = /*PointAccess*/RX10_TEMP539 ; 
struct Point1 RX10_TEMP540 = regionOrdinalPoint1 ( r_nthreads , RX10_TEMP544 ) ; 
const int32_t j = RX10_TEMP540 .f0 ; 
const int32_t X10_TEMP200 = 0 ; 
struct Region1 X10_TEMP202 = createNewRegion1R ( X10_TEMP200 , j ) ; 
const int32_t RX10_TEMP549 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP547 = X10_TEMP202 .regSize ; 
RX10_TEMP547 = RX10_TEMP547 - RX10_TEMP549 ; const int32_t RX10_TEMP548 = RX10_TEMP547 + 1; 
for ( int32_t RX10_TEMP545= 0; RX10_TEMP545<  RX10_TEMP548; RX10_TEMP545++ )
 
{ 
const int32_t RX10_TEMP550 = /*PointAccess*/RX10_TEMP545 ; 
struct Point1 RX10_TEMP546 = regionOrdinalPoint1 ( X10_TEMP202 , RX10_TEMP550 ) ; 
const int32_t i = RX10_TEMP546 .f0 ; 
struct Point1 RX10_TEMP551  ; 
Point1_Point1( &RX10_TEMP551/*OBJECT INIT IN ASSIGNMENT*/, j ) ; 
struct Dist1 RX10_TEMP552 = lowsumin .distValue ; 
struct Region1 RX10_TEMP553 = RX10_TEMP552 .dReg ; 
const int32_t RX10_TEMP554 = searchPointInRegion1 ( RX10_TEMP553 , RX10_TEMP551 ) ; 
const int32_t RX10_TEMP555 = 0 ; 
const uint32_t RX10_TEMP556 = RX10_TEMP554 < RX10_TEMP555 ; 
if ( RX10_TEMP556 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP557 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP557 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP558 = getPlaceFromDist1 ( RX10_TEMP552 , RX10_TEMP554 ) ; 
const place_t RX10_TEMP560 = /* here  */ _here(); 
const uint32_t RX10_TEMP561 = RX10_TEMP558 != RX10_TEMP560 ; 
if ( RX10_TEMP561 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP559 = "Bad place access for array lowsumin" ; 
fprintf(stderr, "%s",RX10_TEMP559 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP562 = getRefArrayValue1int ( lowsumin , RX10_TEMP554 ) ; 
const int32_t X10_TEMP207 = RX10_TEMP562 ; 
const int32_t X10_TEMP206 = j - i ; 
struct Point1 RX10_TEMP563  ; 
Point1_Point1( &RX10_TEMP563/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP206 ) ; 
struct Dist1 RX10_TEMP564 = sumT .distValue ; 
struct Region1 RX10_TEMP565 = RX10_TEMP564 .dReg ; 
const int32_t RX10_TEMP566 = searchPointInRegion1 ( RX10_TEMP565 , RX10_TEMP563 ) ; 
const int32_t RX10_TEMP567 = 0 ; 
const uint32_t RX10_TEMP568 = RX10_TEMP566 < RX10_TEMP567 ; 
if ( RX10_TEMP568 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP569 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP569 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP570 = getPlaceFromDist1 ( RX10_TEMP564 , RX10_TEMP566 ) ; 
const place_t RX10_TEMP572 = /* here  */ _here(); 
const uint32_t RX10_TEMP573 = RX10_TEMP570 != RX10_TEMP572 ; 
if ( RX10_TEMP573 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP571 = "Bad place access for array sumT" ; 
fprintf(stderr, "%s",RX10_TEMP571 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP574 = getRefArrayValue1int ( sumT , RX10_TEMP566 ) ; 
const int32_t X10_TEMP208 = RX10_TEMP574 ; 
const int32_t X10_TEMP210 = X10_TEMP207 + X10_TEMP208 ; 
const int32_t X10_TEMP211 = X10_TEMP210 ; 
struct Point1 RX10_TEMP575  ; 
Point1_Point1( &RX10_TEMP575/*OBJECT INIT IN ASSIGNMENT*/, j ) ; 
struct Dist1 RX10_TEMP576 = lowsumin .distValue ; 
struct Region1 RX10_TEMP577 = RX10_TEMP576 .dReg ; 
const int32_t RX10_TEMP578 = searchPointInRegion1 ( RX10_TEMP577 , RX10_TEMP575 ) ; 
const int32_t RX10_TEMP579 = 0 ; 
const uint32_t RX10_TEMP580 = RX10_TEMP578 < RX10_TEMP579 ; 
if ( RX10_TEMP580 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP581 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP581 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP582 = getPlaceFromDist1 ( RX10_TEMP576 , RX10_TEMP578 ) ; 
const place_t RX10_TEMP584 = /* here  */ _here(); 
const uint32_t RX10_TEMP585 = RX10_TEMP582 != RX10_TEMP584 ; 
if ( RX10_TEMP585 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP583 = "Bad place access for array lowsumin" ; 
fprintf(stderr, "%s",RX10_TEMP583 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( lowsumin , RX10_TEMP578 , X10_TEMP211 ) ; 
struct Point1 RX10_TEMP586  ; 
Point1_Point1( &RX10_TEMP586/*OBJECT INIT IN ASSIGNMENT*/, j ) ; 
struct Dist1 RX10_TEMP587 = highsumin .distValue ; 
struct Region1 RX10_TEMP588 = RX10_TEMP587 .dReg ; 
const int32_t RX10_TEMP589 = searchPointInRegion1 ( RX10_TEMP588 , RX10_TEMP586 ) ; 
const int32_t RX10_TEMP590 = 0 ; 
const uint32_t RX10_TEMP591 = RX10_TEMP589 < RX10_TEMP590 ; 
if ( RX10_TEMP591 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP592 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP592 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP593 = getPlaceFromDist1 ( RX10_TEMP587 , RX10_TEMP589 ) ; 
const place_t RX10_TEMP595 = /* here  */ _here(); 
const uint32_t RX10_TEMP596 = RX10_TEMP593 != RX10_TEMP595 ; 
if ( RX10_TEMP596 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP594 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP594 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP597 = getRefArrayValue1int ( highsumin , RX10_TEMP589 ) ; 
const int32_t X10_TEMP216 = RX10_TEMP597 ; 
const int32_t X10_TEMP215 = j - i ; 
struct Point1 RX10_TEMP598  ; 
Point1_Point1( &RX10_TEMP598/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP215 ) ; 
struct Dist1 RX10_TEMP599 = sumT .distValue ; 
struct Region1 RX10_TEMP600 = RX10_TEMP599 .dReg ; 
const int32_t RX10_TEMP601 = searchPointInRegion1 ( RX10_TEMP600 , RX10_TEMP598 ) ; 
const int32_t RX10_TEMP602 = 0 ; 
const uint32_t RX10_TEMP603 = RX10_TEMP601 < RX10_TEMP602 ; 
if ( RX10_TEMP603 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP604 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP604 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP605 = getPlaceFromDist1 ( RX10_TEMP599 , RX10_TEMP601 ) ; 
const place_t RX10_TEMP607 = /* here  */ _here(); 
const uint32_t RX10_TEMP608 = RX10_TEMP605 != RX10_TEMP607 ; 
if ( RX10_TEMP608 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP606 = "Bad place access for array sumT" ; 
fprintf(stderr, "%s",RX10_TEMP606 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP609 = getRefArrayValue1int ( sumT , RX10_TEMP601 ) ; 
const int32_t X10_TEMP217 = RX10_TEMP609 ; 
const int32_t X10_TEMP219 = X10_TEMP216 + X10_TEMP217 ; 
const int32_t X10_TEMP220 = X10_TEMP219 ; 
struct Point1 RX10_TEMP610  ; 
Point1_Point1( &RX10_TEMP610/*OBJECT INIT IN ASSIGNMENT*/, j ) ; 
struct Dist1 RX10_TEMP611 = highsumin .distValue ; 
struct Region1 RX10_TEMP612 = RX10_TEMP611 .dReg ; 
const int32_t RX10_TEMP613 = searchPointInRegion1 ( RX10_TEMP612 , RX10_TEMP610 ) ; 
const int32_t RX10_TEMP614 = 0 ; 
const uint32_t RX10_TEMP615 = RX10_TEMP613 < RX10_TEMP614 ; 
if ( RX10_TEMP615 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP616 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP616 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP617 = getPlaceFromDist1 ( RX10_TEMP611 , RX10_TEMP613 ) ; 
const place_t RX10_TEMP619 = /* here  */ _here(); 
const uint32_t RX10_TEMP620 = RX10_TEMP617 != RX10_TEMP619 ; 
if ( RX10_TEMP620 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP618 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP618 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( highsumin , RX10_TEMP613 , X10_TEMP220 ) ; 
} 

} 

const int32_t RX10_TEMP624 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP622 = r_nz .regSize ; 
RX10_TEMP622 = RX10_TEMP622 - RX10_TEMP624 ; const int32_t RX10_TEMP623 = RX10_TEMP622 + 1; 
for ( int32_t RX10_TEMP621= 0; RX10_TEMP621<  RX10_TEMP623; RX10_TEMP621++ )
 
{ 
const int32_t RX10_TEMP625 = /*PointAccess*/RX10_TEMP621 ; 
struct Point1 i1 = regionOrdinalPoint1 ( r_nz , RX10_TEMP625 ) ; 
const int32_t RX10_TEMP629 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP627 = r_nthreads .regSize ; 
RX10_TEMP627 = RX10_TEMP627 - RX10_TEMP629 ; const int32_t RX10_TEMP628 = RX10_TEMP627 + 1; 
for ( int32_t RX10_TEMP626= 0; RX10_TEMP626<  RX10_TEMP628; RX10_TEMP626++ )
 
{ 
const int32_t RX10_TEMP630 = /*PointAccess*/RX10_TEMP626 ; 
struct Point1 j1 = regionOrdinalPoint1 ( r_nthreads , RX10_TEMP630 ) ; 
struct Dist1 RX10_TEMP631 = rowin .distValue ; 
struct Region1 RX10_TEMP632 = RX10_TEMP631 .dReg ; 
const int32_t RX10_TEMP633 = searchPointInRegion1 ( RX10_TEMP632 , i1 ) ; 
const int32_t RX10_TEMP634 = 0 ; 
const uint32_t RX10_TEMP635 = RX10_TEMP633 < RX10_TEMP634 ; 
if ( RX10_TEMP635 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP636 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP636 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP637 = getPlaceFromDist1 ( RX10_TEMP631 , RX10_TEMP633 ) ; 
const place_t RX10_TEMP639 = /* here  */ _here(); 
const uint32_t RX10_TEMP640 = RX10_TEMP637 != RX10_TEMP639 ; 
if ( RX10_TEMP640 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP638 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP638 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP641 = getRefArrayValue1int ( rowin , RX10_TEMP633 ) ; 
const int32_t X10_TEMP225 = RX10_TEMP641 ; 
struct Dist1 RX10_TEMP642 = ilow .distValue ; 
struct Region1 RX10_TEMP643 = RX10_TEMP642 .dReg ; 
const int32_t RX10_TEMP644 = searchPointInRegion1 ( RX10_TEMP643 , j1 ) ; 
const int32_t RX10_TEMP645 = 0 ; 
const uint32_t RX10_TEMP646 = RX10_TEMP644 < RX10_TEMP645 ; 
if ( RX10_TEMP646 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP647 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP647 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP648 = getPlaceFromDist1 ( RX10_TEMP642 , RX10_TEMP644 ) ; 
const place_t RX10_TEMP650 = /* here  */ _here(); 
const uint32_t RX10_TEMP651 = RX10_TEMP648 != RX10_TEMP650 ; 
if ( RX10_TEMP651 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP649 = "Bad place access for array ilow" ; 
fprintf(stderr, "%s",RX10_TEMP649 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP652 = getRefArrayValue1int ( ilow , RX10_TEMP644 ) ; 
const int32_t X10_TEMP226 = RX10_TEMP652 ; 
const uint32_t X10_TEMP228 = X10_TEMP225 >= X10_TEMP226 ; 
struct Dist1 RX10_TEMP653 = rowin .distValue ; 
struct Region1 RX10_TEMP654 = RX10_TEMP653 .dReg ; 
const int32_t RX10_TEMP655 = searchPointInRegion1 ( RX10_TEMP654 , i1 ) ; 
const int32_t RX10_TEMP656 = 0 ; 
const uint32_t RX10_TEMP657 = RX10_TEMP655 < RX10_TEMP656 ; 
if ( RX10_TEMP657 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP658 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP658 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP659 = getPlaceFromDist1 ( RX10_TEMP653 , RX10_TEMP655 ) ; 
const place_t RX10_TEMP661 = /* here  */ _here(); 
const uint32_t RX10_TEMP662 = RX10_TEMP659 != RX10_TEMP661 ; 
if ( RX10_TEMP662 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP660 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP660 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP663 = getRefArrayValue1int ( rowin , RX10_TEMP655 ) ; 
const int32_t X10_TEMP231 = RX10_TEMP663 ; 
struct Dist1 RX10_TEMP664 = iup .distValue ; 
struct Region1 RX10_TEMP665 = RX10_TEMP664 .dReg ; 
const int32_t RX10_TEMP666 = searchPointInRegion1 ( RX10_TEMP665 , j1 ) ; 
const int32_t RX10_TEMP667 = 0 ; 
const uint32_t RX10_TEMP668 = RX10_TEMP666 < RX10_TEMP667 ; 
if ( RX10_TEMP668 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP669 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP669 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP670 = getPlaceFromDist1 ( RX10_TEMP664 , RX10_TEMP666 ) ; 
const place_t RX10_TEMP672 = /* here  */ _here(); 
const uint32_t RX10_TEMP673 = RX10_TEMP670 != RX10_TEMP672 ; 
if ( RX10_TEMP673 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP671 = "Bad place access for array iup" ; 
fprintf(stderr, "%s",RX10_TEMP671 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP674 = getRefArrayValue1int ( iup , RX10_TEMP666 ) ; 
const int32_t X10_TEMP232 = RX10_TEMP674 ; 
const uint32_t X10_TEMP234 = X10_TEMP231 <= X10_TEMP232 ; 
const uint32_t X10_TEMP236 = X10_TEMP228 && X10_TEMP234 ; 
if ( X10_TEMP236 ) 
{ 
struct Dist1 RX10_TEMP675 = highsumin .distValue ; 
struct Region1 RX10_TEMP676 = RX10_TEMP675 .dReg ; 
const int32_t RX10_TEMP677 = searchPointInRegion1 ( RX10_TEMP676 , j1 ) ; 
const int32_t RX10_TEMP678 = 0 ; 
const uint32_t RX10_TEMP679 = RX10_TEMP677 < RX10_TEMP678 ; 
if ( RX10_TEMP679 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP680 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP680 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP681 = getPlaceFromDist1 ( RX10_TEMP675 , RX10_TEMP677 ) ; 
const place_t RX10_TEMP683 = /* here  */ _here(); 
const uint32_t RX10_TEMP684 = RX10_TEMP681 != RX10_TEMP683 ; 
if ( RX10_TEMP684 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP682 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP682 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP685 = getRefArrayValue1int ( highsumin , RX10_TEMP677 ) ; 
const int32_t X10_TEMP239 = RX10_TEMP685 ; 
struct Dist1 RX10_TEMP686 = rowin .distValue ; 
struct Region1 RX10_TEMP687 = RX10_TEMP686 .dReg ; 
const int32_t RX10_TEMP688 = searchPointInRegion1 ( RX10_TEMP687 , i1 ) ; 
const int32_t RX10_TEMP689 = 0 ; 
const uint32_t RX10_TEMP690 = RX10_TEMP688 < RX10_TEMP689 ; 
if ( RX10_TEMP690 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP691 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP691 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP692 = getPlaceFromDist1 ( RX10_TEMP686 , RX10_TEMP688 ) ; 
const place_t RX10_TEMP694 = /* here  */ _here(); 
const uint32_t RX10_TEMP695 = RX10_TEMP692 != RX10_TEMP694 ; 
if ( RX10_TEMP695 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP693 = "Bad place access for array rowin" ; 
fprintf(stderr, "%s",RX10_TEMP693 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP696 = getRefArrayValue1int ( rowin , RX10_TEMP688 ) ; 
const int32_t X10_TEMP242 = RX10_TEMP696 ; 
const int32_t X10_TEMP243 = X10_TEMP242 ; 
struct Point1 RX10_TEMP697  ; 
Point1_Point1( &RX10_TEMP697/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP239 ) ; 
struct Dist1 RX10_TEMP698 = rowt .distValue ; 
struct Region1 RX10_TEMP699 = RX10_TEMP698 .dReg ; 
const int32_t RX10_TEMP700 = searchPointInRegion1 ( RX10_TEMP699 , RX10_TEMP697 ) ; 
const int32_t RX10_TEMP701 = 0 ; 
const uint32_t RX10_TEMP702 = RX10_TEMP700 < RX10_TEMP701 ; 
if ( RX10_TEMP702 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP703 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP703 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP704 = getPlaceFromDist1 ( RX10_TEMP698 , RX10_TEMP700 ) ; 
const place_t RX10_TEMP706 = /* here  */ _here(); 
const uint32_t RX10_TEMP707 = RX10_TEMP704 != RX10_TEMP706 ; 
if ( RX10_TEMP707 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP705 = "Bad place access for array rowt" ; 
fprintf(stderr, "%s",RX10_TEMP705 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( rowt , RX10_TEMP700 , X10_TEMP243 ) ; 
struct Dist1 RX10_TEMP708 = highsumin .distValue ; 
struct Region1 RX10_TEMP709 = RX10_TEMP708 .dReg ; 
const int32_t RX10_TEMP710 = searchPointInRegion1 ( RX10_TEMP709 , j1 ) ; 
const int32_t RX10_TEMP711 = 0 ; 
const uint32_t RX10_TEMP712 = RX10_TEMP710 < RX10_TEMP711 ; 
if ( RX10_TEMP712 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP713 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP713 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP714 = getPlaceFromDist1 ( RX10_TEMP708 , RX10_TEMP710 ) ; 
const place_t RX10_TEMP716 = /* here  */ _here(); 
const uint32_t RX10_TEMP717 = RX10_TEMP714 != RX10_TEMP716 ; 
if ( RX10_TEMP717 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP715 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP715 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP718 = getRefArrayValue1int ( highsumin , RX10_TEMP710 ) ; 
const int32_t X10_TEMP246 = RX10_TEMP718 ; 
struct Dist1 RX10_TEMP719 = colin .distValue ; 
struct Region1 RX10_TEMP720 = RX10_TEMP719 .dReg ; 
const int32_t RX10_TEMP721 = searchPointInRegion1 ( RX10_TEMP720 , i1 ) ; 
const int32_t RX10_TEMP722 = 0 ; 
const uint32_t RX10_TEMP723 = RX10_TEMP721 < RX10_TEMP722 ; 
if ( RX10_TEMP723 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP724 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP724 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP725 = getPlaceFromDist1 ( RX10_TEMP719 , RX10_TEMP721 ) ; 
const place_t RX10_TEMP727 = /* here  */ _here(); 
const uint32_t RX10_TEMP728 = RX10_TEMP725 != RX10_TEMP727 ; 
if ( RX10_TEMP728 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP726 = "Bad place access for array colin" ; 
fprintf(stderr, "%s",RX10_TEMP726 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP729 = getRefArrayValue1int ( colin , RX10_TEMP721 ) ; 
const int32_t X10_TEMP249 = RX10_TEMP729 ; 
const int32_t X10_TEMP250 = X10_TEMP249 ; 
struct Point1 RX10_TEMP730  ; 
Point1_Point1( &RX10_TEMP730/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP246 ) ; 
struct Dist1 RX10_TEMP731 = colt .distValue ; 
struct Region1 RX10_TEMP732 = RX10_TEMP731 .dReg ; 
const int32_t RX10_TEMP733 = searchPointInRegion1 ( RX10_TEMP732 , RX10_TEMP730 ) ; 
const int32_t RX10_TEMP734 = 0 ; 
const uint32_t RX10_TEMP735 = RX10_TEMP733 < RX10_TEMP734 ; 
if ( RX10_TEMP735 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP736 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP736 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP737 = getPlaceFromDist1 ( RX10_TEMP731 , RX10_TEMP733 ) ; 
const place_t RX10_TEMP739 = /* here  */ _here(); 
const uint32_t RX10_TEMP740 = RX10_TEMP737 != RX10_TEMP739 ; 
if ( RX10_TEMP740 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP738 = "Bad place access for array colt" ; 
fprintf(stderr, "%s",RX10_TEMP738 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( colt , RX10_TEMP733 , X10_TEMP250 ) ; 
struct Dist1 RX10_TEMP741 = highsumin .distValue ; 
struct Region1 RX10_TEMP742 = RX10_TEMP741 .dReg ; 
const int32_t RX10_TEMP743 = searchPointInRegion1 ( RX10_TEMP742 , j1 ) ; 
const int32_t RX10_TEMP744 = 0 ; 
const uint32_t RX10_TEMP745 = RX10_TEMP743 < RX10_TEMP744 ; 
if ( RX10_TEMP745 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP746 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP746 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP747 = getPlaceFromDist1 ( RX10_TEMP741 , RX10_TEMP743 ) ; 
const place_t RX10_TEMP749 = /* here  */ _here(); 
const uint32_t RX10_TEMP750 = RX10_TEMP747 != RX10_TEMP749 ; 
if ( RX10_TEMP750 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP748 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP748 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP751 = getRefArrayValue1int ( highsumin , RX10_TEMP743 ) ; 
const int32_t X10_TEMP253 = RX10_TEMP751 ; 
struct Dist1 RX10_TEMP752 = valin .distValue ; 
struct Region1 RX10_TEMP753 = RX10_TEMP752 .dReg ; 
const int32_t RX10_TEMP754 = searchPointInRegion1 ( RX10_TEMP753 , i1 ) ; 
const int32_t RX10_TEMP755 = 0 ; 
const uint32_t RX10_TEMP756 = RX10_TEMP754 < RX10_TEMP755 ; 
if ( RX10_TEMP756 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP757 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP757 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP758 = getPlaceFromDist1 ( RX10_TEMP752 , RX10_TEMP754 ) ; 
const place_t RX10_TEMP760 = /* here  */ _here(); 
const uint32_t RX10_TEMP761 = RX10_TEMP758 != RX10_TEMP760 ; 
if ( RX10_TEMP761 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP759 = "Bad place access for array valin" ; 
fprintf(stderr, "%s",RX10_TEMP759 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP762 = getRefArrayValue1double ( valin , RX10_TEMP754 ) ; 
const double X10_TEMP256 = RX10_TEMP762 ; 
const double X10_TEMP257 = X10_TEMP256 ; 
struct Point1 RX10_TEMP763  ; 
Point1_Point1( &RX10_TEMP763/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP253 ) ; 
struct Dist1 RX10_TEMP764 = valt .distValue ; 
struct Region1 RX10_TEMP765 = RX10_TEMP764 .dReg ; 
const int32_t RX10_TEMP766 = searchPointInRegion1 ( RX10_TEMP765 , RX10_TEMP763 ) ; 
const int32_t RX10_TEMP767 = 0 ; 
const uint32_t RX10_TEMP768 = RX10_TEMP766 < RX10_TEMP767 ; 
if ( RX10_TEMP768 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP769 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP769 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP770 = getPlaceFromDist1 ( RX10_TEMP764 , RX10_TEMP766 ) ; 
const place_t RX10_TEMP772 = /* here  */ _here(); 
const uint32_t RX10_TEMP773 = RX10_TEMP770 != RX10_TEMP772 ; 
if ( RX10_TEMP773 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP771 = "Bad place access for array valt" ; 
fprintf(stderr, "%s",RX10_TEMP771 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( valt , RX10_TEMP766 , X10_TEMP257 ) ; 
struct Dist1 RX10_TEMP774 = highsumin .distValue ; 
struct Region1 RX10_TEMP775 = RX10_TEMP774 .dReg ; 
const int32_t RX10_TEMP776 = searchPointInRegion1 ( RX10_TEMP775 , j1 ) ; 
const int32_t RX10_TEMP777 = 0 ; 
const uint32_t RX10_TEMP778 = RX10_TEMP776 < RX10_TEMP777 ; 
if ( RX10_TEMP778 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP779 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP779 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP780 = getPlaceFromDist1 ( RX10_TEMP774 , RX10_TEMP776 ) ; 
const place_t RX10_TEMP782 = /* here  */ _here(); 
const uint32_t RX10_TEMP783 = RX10_TEMP780 != RX10_TEMP782 ; 
if ( RX10_TEMP783 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP781 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP781 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP784 = getRefArrayValue1int ( highsumin , RX10_TEMP776 ) ; 
const int32_t X10_TEMP260 = RX10_TEMP784 ; 
const int32_t X10_TEMP261 = 1 ; 
const int32_t X10_TEMP263 = X10_TEMP260 + X10_TEMP261 ; 
const int32_t X10_TEMP264 = X10_TEMP263 ; 
struct Dist1 RX10_TEMP785 = highsumin .distValue ; 
struct Region1 RX10_TEMP786 = RX10_TEMP785 .dReg ; 
const int32_t RX10_TEMP787 = searchPointInRegion1 ( RX10_TEMP786 , j1 ) ; 
const int32_t RX10_TEMP788 = 0 ; 
const uint32_t RX10_TEMP789 = RX10_TEMP787 < RX10_TEMP788 ; 
if ( RX10_TEMP789 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP790 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP790 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP791 = getPlaceFromDist1 ( RX10_TEMP785 , RX10_TEMP787 ) ; 
const place_t RX10_TEMP793 = /* here  */ _here(); 
const uint32_t RX10_TEMP794 = RX10_TEMP791 != RX10_TEMP793 ; 
if ( RX10_TEMP794 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP792 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP792 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( highsumin , RX10_TEMP787 , X10_TEMP264 ) ; 
} 

} 

} 

const int32_t X10_TEMP271 = 0 ; 
struct Dist1 RX10_TEMP795 = rowt .distValue ; 
struct Dist1 X10_TEMP266 = RX10_TEMP795 ; 
struct Region1 RX10_TEMP796 = X10_TEMP266 .dReg ; 
struct Region1 X10_TEMP267 = RX10_TEMP796 ; 
const int32_t X10_TEMP268 = X10_TEMP267 .regSize ; 
const int32_t X10_TEMP269 = 1 ; 
const int32_t X10_TEMP272 = X10_TEMP268 - X10_TEMP269 ; 
struct Region1 rowtregion = createNewRegion1R ( X10_TEMP271 , X10_TEMP272 ) ; 
const place_t X10_TEMP274 = /* here  */ _here(); 
struct Dist1 rowtdist = getPlaceDist1 ( rowtregion , X10_TEMP274 ) ; 
struct Region1 RX10_TEMP797 = rowtregion ; 
const int32_t RX10_TEMP812 = rowtregion .regSize ; 
const int32_t RX10_TEMP813 = 1 ; 
const int32_t RX10_TEMP814 = RX10_TEMP812 - RX10_TEMP813 ; 
const int32_t RX10_TEMP811 = RX10_TEMP814 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER34;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP815 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER34 = malloc(sizeof(int32_t)+(RX10_TEMP811*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP811*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER34)[0] = RX10_TEMP811, TEMPCALLOCPOINTER34 = ((int32_t * )TEMPCALLOCPOINTER34)+1, memset(TEMPCALLOCPOINTER34,0,RX10_TEMP811*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP798 = 0;RX10_TEMP798 < RX10_TEMP811; RX10_TEMP798++) 

{ 
const int32_t RX10_TEMP799 = /*PointAccess*/RX10_TEMP798 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP797 , RX10_TEMP799 ) ; 
struct Dist1 RX10_TEMP800 = rowt .distValue ; 
struct Region1 RX10_TEMP801 = RX10_TEMP800 .dReg ; 
const int32_t RX10_TEMP802 = searchPointInRegion1 ( RX10_TEMP801 , i ) ; 
const int32_t RX10_TEMP803 = 0 ; 
const uint32_t RX10_TEMP804 = RX10_TEMP802 < RX10_TEMP803 ; 
if ( RX10_TEMP804 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP805 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP805 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP806 = getPlaceFromDist1 ( RX10_TEMP800 , RX10_TEMP802 ) ; 
const place_t RX10_TEMP808 = /* here  */ _here(); 
const uint32_t RX10_TEMP809 = RX10_TEMP806 != RX10_TEMP808 ; 
if ( RX10_TEMP809 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP807 = "Bad place access for array rowt" ; 
fprintf(stderr, "%s",RX10_TEMP807 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP810 = getRefArrayValue1int ( rowt , RX10_TEMP802 ) ; 
const int32_t X10_TEMP278 = RX10_TEMP810 ; 
RX10_TEMP815[RX10_TEMP798] = X10_TEMP278 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP816  ; 
intValArray1_intValArray1( &RX10_TEMP816/*OBJECT INIT IN ASSIGNMENT*/, rowtregion , RX10_TEMP815 ) ; 
struct intValArray1 X10_TEMP279 = RX10_TEMP816 ; 
struct intValArray1 X10_TEMP281 = X10_TEMP279 ; 
X10_TEMP0 ->row = ( X10_TEMP281 ) ; 
const int32_t X10_TEMP288 = 0 ; 
struct Dist1 RX10_TEMP817 = colt .distValue ; 
struct Dist1 X10_TEMP283 = RX10_TEMP817 ; 
struct Region1 RX10_TEMP818 = X10_TEMP283 .dReg ; 
struct Region1 X10_TEMP284 = RX10_TEMP818 ; 
const int32_t X10_TEMP285 = X10_TEMP284 .regSize ; 
const int32_t X10_TEMP286 = 1 ; 
const int32_t X10_TEMP289 = X10_TEMP285 - X10_TEMP286 ; 
struct Region1 coltregion = createNewRegion1R ( X10_TEMP288 , X10_TEMP289 ) ; 
const place_t X10_TEMP291 = /* here  */ _here(); 
struct Dist1 coltdist = getPlaceDist1 ( coltregion , X10_TEMP291 ) ; 
struct Region1 RX10_TEMP819 = coltregion ; 
const int32_t RX10_TEMP834 = coltregion .regSize ; 
const int32_t RX10_TEMP835 = 1 ; 
const int32_t RX10_TEMP836 = RX10_TEMP834 - RX10_TEMP835 ; 
const int32_t RX10_TEMP833 = RX10_TEMP836 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER35;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP837 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER35 = malloc(sizeof(int32_t)+(RX10_TEMP833*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP833*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER35)[0] = RX10_TEMP833, TEMPCALLOCPOINTER35 = ((int32_t * )TEMPCALLOCPOINTER35)+1, memset(TEMPCALLOCPOINTER35,0,RX10_TEMP833*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP820 = 0;RX10_TEMP820 < RX10_TEMP833; RX10_TEMP820++) 

{ 
const int32_t RX10_TEMP821 = /*PointAccess*/RX10_TEMP820 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP819 , RX10_TEMP821 ) ; 
struct Dist1 RX10_TEMP822 = colt .distValue ; 
struct Region1 RX10_TEMP823 = RX10_TEMP822 .dReg ; 
const int32_t RX10_TEMP824 = searchPointInRegion1 ( RX10_TEMP823 , i ) ; 
const int32_t RX10_TEMP825 = 0 ; 
const uint32_t RX10_TEMP826 = RX10_TEMP824 < RX10_TEMP825 ; 
if ( RX10_TEMP826 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP827 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP827 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP828 = getPlaceFromDist1 ( RX10_TEMP822 , RX10_TEMP824 ) ; 
const place_t RX10_TEMP830 = /* here  */ _here(); 
const uint32_t RX10_TEMP831 = RX10_TEMP828 != RX10_TEMP830 ; 
if ( RX10_TEMP831 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP829 = "Bad place access for array colt" ; 
fprintf(stderr, "%s",RX10_TEMP829 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP832 = getRefArrayValue1int ( colt , RX10_TEMP824 ) ; 
const int32_t X10_TEMP295 = RX10_TEMP832 ; 
RX10_TEMP837[RX10_TEMP820] = X10_TEMP295 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP838  ; 
intValArray1_intValArray1( &RX10_TEMP838/*OBJECT INIT IN ASSIGNMENT*/, coltregion , RX10_TEMP837 ) ; 
struct intValArray1 X10_TEMP296 = RX10_TEMP838 ; 
struct intValArray1 X10_TEMP298 = X10_TEMP296 ; 
X10_TEMP0 ->col = ( X10_TEMP298 ) ; 
const int32_t X10_TEMP305 = 0 ; 
struct Dist1 RX10_TEMP839 = valt .distValue ; 
struct Dist1 X10_TEMP300 = RX10_TEMP839 ; 
struct Region1 RX10_TEMP840 = X10_TEMP300 .dReg ; 
struct Region1 X10_TEMP301 = RX10_TEMP840 ; 
const int32_t X10_TEMP302 = X10_TEMP301 .regSize ; 
const int32_t X10_TEMP303 = 1 ; 
const int32_t X10_TEMP306 = X10_TEMP302 - X10_TEMP303 ; 
struct Region1 valtregion = createNewRegion1R ( X10_TEMP305 , X10_TEMP306 ) ; 
const place_t X10_TEMP308 = /* here  */ _here(); 
struct Dist1 valtdist = getPlaceDist1 ( valtregion , X10_TEMP308 ) ; 
struct Region1 RX10_TEMP841 = valtregion ; 
const int32_t RX10_TEMP856 = valtregion .regSize ; 
const int32_t RX10_TEMP857 = 1 ; 
const int32_t RX10_TEMP858 = RX10_TEMP856 - RX10_TEMP857 ; 
const int32_t RX10_TEMP855 = RX10_TEMP858 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER36;
/*VALUE ARRAY*/ double * const RX10_TEMP859 = (/*VALUE ARRAY*/ double * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER36 = malloc(sizeof(int32_t)+(RX10_TEMP855*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP855*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER36)[0] = RX10_TEMP855, TEMPCALLOCPOINTER36 = ((int32_t * )TEMPCALLOCPOINTER36)+1, memset(TEMPCALLOCPOINTER36,0,RX10_TEMP855*sizeof(double )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP842 = 0;RX10_TEMP842 < RX10_TEMP855; RX10_TEMP842++) 

{ 
const int32_t RX10_TEMP843 = /*PointAccess*/RX10_TEMP842 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP841 , RX10_TEMP843 ) ; 
struct Dist1 RX10_TEMP844 = valt .distValue ; 
struct Region1 RX10_TEMP845 = RX10_TEMP844 .dReg ; 
const int32_t RX10_TEMP846 = searchPointInRegion1 ( RX10_TEMP845 , i ) ; 
const int32_t RX10_TEMP847 = 0 ; 
const uint32_t RX10_TEMP848 = RX10_TEMP846 < RX10_TEMP847 ; 
if ( RX10_TEMP848 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP849 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP849 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP850 = getPlaceFromDist1 ( RX10_TEMP844 , RX10_TEMP846 ) ; 
const place_t RX10_TEMP852 = /* here  */ _here(); 
const uint32_t RX10_TEMP853 = RX10_TEMP850 != RX10_TEMP852 ; 
if ( RX10_TEMP853 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP851 = "Bad place access for array valt" ; 
fprintf(stderr, "%s",RX10_TEMP851 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP854 = getRefArrayValue1double ( valt , RX10_TEMP846 ) ; 
const double X10_TEMP312 = RX10_TEMP854 ; 
RX10_TEMP859[RX10_TEMP842] = X10_TEMP312 ; 
} 
/*END OF ARRAY INIT*/struct doubleValArray1 RX10_TEMP860  ; 
doubleValArray1_doubleValArray1( &RX10_TEMP860/*OBJECT INIT IN ASSIGNMENT*/, valtregion , RX10_TEMP859 ) ; 
struct doubleValArray1 X10_TEMP313 = RX10_TEMP860 ; 
struct doubleValArray1 X10_TEMP315 = X10_TEMP313 ; 
X10_TEMP0 ->val = ( X10_TEMP315 ) ; 
const int32_t X10_TEMP322 = 0 ; 
struct Dist1 RX10_TEMP861 = lowsumin .distValue ; 
struct Dist1 X10_TEMP317 = RX10_TEMP861 ; 
struct Region1 RX10_TEMP862 = X10_TEMP317 .dReg ; 
struct Region1 X10_TEMP318 = RX10_TEMP862 ; 
const int32_t X10_TEMP319 = X10_TEMP318 .regSize ; 
const int32_t X10_TEMP320 = 1 ; 
const int32_t X10_TEMP323 = X10_TEMP319 - X10_TEMP320 ; 
struct Region1 lowsuminregion = createNewRegion1R ( X10_TEMP322 , X10_TEMP323 ) ; 
const place_t X10_TEMP325 = /* here  */ _here(); 
struct Dist1 lowsumindist = getPlaceDist1 ( lowsuminregion , X10_TEMP325 ) ; 
struct Region1 RX10_TEMP863 = lowsuminregion ; 
const int32_t RX10_TEMP878 = lowsuminregion .regSize ; 
const int32_t RX10_TEMP879 = 1 ; 
const int32_t RX10_TEMP880 = RX10_TEMP878 - RX10_TEMP879 ; 
const int32_t RX10_TEMP877 = RX10_TEMP880 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER37;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP881 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(RX10_TEMP877*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP877*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER37)[0] = RX10_TEMP877, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,RX10_TEMP877*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP864 = 0;RX10_TEMP864 < RX10_TEMP877; RX10_TEMP864++) 

{ 
const int32_t RX10_TEMP865 = /*PointAccess*/RX10_TEMP864 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP863 , RX10_TEMP865 ) ; 
struct Dist1 RX10_TEMP866 = lowsumin .distValue ; 
struct Region1 RX10_TEMP867 = RX10_TEMP866 .dReg ; 
const int32_t RX10_TEMP868 = searchPointInRegion1 ( RX10_TEMP867 , i ) ; 
const int32_t RX10_TEMP869 = 0 ; 
const uint32_t RX10_TEMP870 = RX10_TEMP868 < RX10_TEMP869 ; 
if ( RX10_TEMP870 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP871 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP871 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP872 = getPlaceFromDist1 ( RX10_TEMP866 , RX10_TEMP868 ) ; 
const place_t RX10_TEMP874 = /* here  */ _here(); 
const uint32_t RX10_TEMP875 = RX10_TEMP872 != RX10_TEMP874 ; 
if ( RX10_TEMP875 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP873 = "Bad place access for array lowsumin" ; 
fprintf(stderr, "%s",RX10_TEMP873 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP876 = getRefArrayValue1int ( lowsumin , RX10_TEMP868 ) ; 
const int32_t X10_TEMP329 = RX10_TEMP876 ; 
RX10_TEMP881[RX10_TEMP864] = X10_TEMP329 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP882  ; 
intValArray1_intValArray1( &RX10_TEMP882/*OBJECT INIT IN ASSIGNMENT*/, lowsuminregion , RX10_TEMP881 ) ; 
struct intValArray1 X10_TEMP330 = RX10_TEMP882 ; 
struct intValArray1 X10_TEMP332 = X10_TEMP330 ; 
X10_TEMP0 ->lowsum = ( X10_TEMP332 ) ; 
const int32_t X10_TEMP339 = 0 ; 
struct Dist1 RX10_TEMP883 = highsumin .distValue ; 
struct Dist1 X10_TEMP334 = RX10_TEMP883 ; 
struct Region1 RX10_TEMP884 = X10_TEMP334 .dReg ; 
struct Region1 X10_TEMP335 = RX10_TEMP884 ; 
const int32_t X10_TEMP336 = X10_TEMP335 .regSize ; 
const int32_t X10_TEMP337 = 1 ; 
const int32_t X10_TEMP340 = X10_TEMP336 - X10_TEMP337 ; 
struct Region1 highsuminregion = createNewRegion1R ( X10_TEMP339 , X10_TEMP340 ) ; 
const place_t X10_TEMP342 = /* here  */ _here(); 
struct Dist1 highsumindist = getPlaceDist1 ( highsuminregion , X10_TEMP342 ) ; 
struct Region1 RX10_TEMP885 = highsuminregion ; 
const int32_t RX10_TEMP900 = highsuminregion .regSize ; 
const int32_t RX10_TEMP901 = 1 ; 
const int32_t RX10_TEMP902 = RX10_TEMP900 - RX10_TEMP901 ; 
const int32_t RX10_TEMP899 = RX10_TEMP902 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER38;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP903 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER38 = malloc(sizeof(int32_t)+(RX10_TEMP899*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP899*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER38)[0] = RX10_TEMP899, TEMPCALLOCPOINTER38 = ((int32_t * )TEMPCALLOCPOINTER38)+1, memset(TEMPCALLOCPOINTER38,0,RX10_TEMP899*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP886 = 0;RX10_TEMP886 < RX10_TEMP899; RX10_TEMP886++) 

{ 
const int32_t RX10_TEMP887 = /*PointAccess*/RX10_TEMP886 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP885 , RX10_TEMP887 ) ; 
struct Dist1 RX10_TEMP888 = highsumin .distValue ; 
struct Region1 RX10_TEMP889 = RX10_TEMP888 .dReg ; 
const int32_t RX10_TEMP890 = searchPointInRegion1 ( RX10_TEMP889 , i ) ; 
const int32_t RX10_TEMP891 = 0 ; 
const uint32_t RX10_TEMP892 = RX10_TEMP890 < RX10_TEMP891 ; 
if ( RX10_TEMP892 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP893 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP893 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP894 = getPlaceFromDist1 ( RX10_TEMP888 , RX10_TEMP890 ) ; 
const place_t RX10_TEMP896 = /* here  */ _here(); 
const uint32_t RX10_TEMP897 = RX10_TEMP894 != RX10_TEMP896 ; 
if ( RX10_TEMP897 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP895 = "Bad place access for array highsumin" ; 
fprintf(stderr, "%s",RX10_TEMP895 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP898 = getRefArrayValue1int ( highsumin , RX10_TEMP890 ) ; 
const int32_t X10_TEMP346 = RX10_TEMP898 ; 
RX10_TEMP903[RX10_TEMP886] = X10_TEMP346 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP904  ; 
intValArray1_intValArray1( &RX10_TEMP904/*OBJECT INIT IN ASSIGNMENT*/, highsuminregion , RX10_TEMP903 ) ; 
struct intValArray1 X10_TEMP347 = RX10_TEMP904 ; 
struct intValArray1 X10_TEMP349 = X10_TEMP347 ; 
X10_TEMP0 ->highsum = ( X10_TEMP349 ) ; 
} 

void /*static*/SparseMatmult_JGFkernel (  struct SparseMatmult  * const X10_TEMP0 ) 
{ 
struct doubleRefArray1 X10_TEMP9 = X10_TEMP0 ->y ; 
struct doubleValArray1 X10_TEMP10 = X10_TEMP0 ->val ; 
struct intValArray1 X10_TEMP11 = X10_TEMP0 ->row ; 
struct intValArray1 X10_TEMP12 = X10_TEMP0 ->col ; 
struct doubleValArray1 X10_TEMP13 = X10_TEMP0 ->x ; 
struct intValArray1 X10_TEMP14 = X10_TEMP0 ->lowsum ; 
struct intValArray1 X10_TEMP15 = X10_TEMP0 ->highsum ; 
SparseMatmult_test ( X10_TEMP0 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , _SparseMatmult_SPARSE_NUM_ITER , X10_TEMP14 , X10_TEMP15 ) ; 
} 

void /*static*/SparseMatmult_initRefVal (  struct SparseMatmult  * const X10_TEMP0 ,  struct doubleRefArray1 const refval ) 
{ 
const int32_t X10_TEMP2 = 0 ; 
const double X10_TEMP4 = 0.1436496372119012; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
struct Dist1 RX10_TEMP1 = refval .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( refval , RX10_TEMP3 , X10_TEMP5 ) ; 
const int32_t X10_TEMP7 = 1 ; 
const double X10_TEMP9 = 150.0130719633895; 
const double X10_TEMP10 = X10_TEMP9 ; 
struct Point1 RX10_TEMP11  ; 
Point1_Point1( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 ) ; 
struct Dist1 RX10_TEMP12 = refval .distValue ; 
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
char * RX10_TEMP19 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( refval , RX10_TEMP14 , X10_TEMP10 ) ; 
const int32_t X10_TEMP12 = 2 ; 
const double X10_TEMP14 = 749.5245870753752; 
const double X10_TEMP15 = X10_TEMP14 ; 
struct Point1 RX10_TEMP22  ; 
Point1_Point1( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP12 ) ; 
struct Dist1 RX10_TEMP23 = refval .distValue ; 
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
char * RX10_TEMP30 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( refval , RX10_TEMP25 , X10_TEMP15 ) ; 
} 

void /*static*/SparseMatmult_JGFvalidate (  struct SparseMatmult  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 2 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 rtemp = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 dtemp = getPlaceDist1 ( rtemp , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = dtemp .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER39;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER39 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER39)[0] = RX10_TEMP5, TEMPCALLOCPOINTER39 = ((int32_t * )TEMPCALLOCPOINTER39)+1, memset(TEMPCALLOCPOINTER39,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dtemp , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T17 utmp17  ; 
T17_T17( &utmp17/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC16) ;
a.size = sizeof(utmp17 );
a.params = (void *)(&utmp17 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER40;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER40 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER40)[0] = RX10_TEMP4, TEMPCALLOCPOINTER40 = ((int32_t * )TEMPCALLOCPOINTER40)+1, memset(TEMPCALLOCPOINTER40,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP19  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dtemp , RX10_TEMP16 ) ; 
/*UpdatableVariableDeclaration*/
 struct doubleRefArray1 refval = RX10_TEMP19 ; 
SparseMatmult_initRefVal ( X10_TEMP0 , refval ) ; 
const double X10_TEMP12 = X10_TEMP0 ->ytotal ; 
const int32_t X10_TEMP11 = X10_TEMP0 ->setSize ; 
struct Point1 RX10_TEMP20  ; 
Point1_Point1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP11 ) ; 
struct Dist1 RX10_TEMP21 = refval .distValue ; 
struct Region1 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; 
const int32_t RX10_TEMP24 = 0 ; 
const uint32_t RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; 
if ( RX10_TEMP25 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP27 = getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const uint32_t RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP31 = getRefArrayValue1double ( refval , RX10_TEMP23 ) ; 
const double X10_TEMP13 = RX10_TEMP31 ; 
const double X10_TEMP15 = X10_TEMP12 - X10_TEMP13 ; 
/*UpdatableVariableDeclaration*/
double dev = fabs ( X10_TEMP15 ) ; 
const double X10_TEMP17 = 1.0e-10; 
const uint32_t X10_TEMP19 = dev > X10_TEMP17 ; 
if ( X10_TEMP19 ) 
{ 
const char * X10_TEMP21 = "Validation failed" ; 
fprintf(  stdout, "%s\n",X10_TEMP21 ) ; 
const char * X10_TEMP22 = "ytotal = " ; 
const double X10_TEMP23 = X10_TEMP0 ->ytotal ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC3, "%s%f",X10_TEMP22,X10_TEMP23);
const char * X10_TEMP24 = tempC3;; 
const char * X10_TEMP25 = "  " ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC4, "%s%s",X10_TEMP24,X10_TEMP25);
const char * X10_TEMP26 = tempC4;; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC5, "%s%f",X10_TEMP26,dev);
const char * X10_TEMP27 = tempC5;; 
const char * X10_TEMP28 = "  " ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC6, "%s%s",X10_TEMP27,X10_TEMP28);
const char * X10_TEMP29 = tempC6;; 
const int32_t X10_TEMP30 = X10_TEMP0 ->setSize ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC7, "%s%d",X10_TEMP29,X10_TEMP30);
const char * X10_TEMP32 = tempC7;; 
fprintf(  stdout, "%s\n",X10_TEMP32 ) ; 
const char * X10_TEMP34 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

} 

void /*static*/SparseMatmult_JGFtidyup (  struct SparseMatmult  * const X10_TEMP0 ) 
{ 
} 

void /*static*/SparseMatmult_run (  struct SparseMatmult  * const X10_TEMP0 , const int32_t setSize ) 
{ 
SparseMatmult_JGFsetsize ( X10_TEMP0 , setSize ) ; 
SparseMatmult_JGFinitialise ( X10_TEMP0 ) ; 
SparseMatmult_JGFkernel ( X10_TEMP0 ) ; 
SparseMatmult_JGFvalidate ( X10_TEMP0 ) ; 
SparseMatmult_JGFtidyup ( X10_TEMP0 ) ; 
} 

doubleRefArray1 /*static*/SparseMatmult_init (  struct doubleRefArray1 const a ,  struct Random  * const R ) 
{ 
const int32_t X10_TEMP7 = 0 ; 
struct Dist1 RX10_TEMP0 = a .distValue ; 
struct Dist1 X10_TEMP2 = RX10_TEMP0 ; 
struct Region1 RX10_TEMP1 = X10_TEMP2 .dReg ; 
struct Region1 X10_TEMP3 = RX10_TEMP1 ; 
const int32_t X10_TEMP4 = X10_TEMP3 .regSize ; 
const int32_t X10_TEMP5 = 1 ; 
const int32_t X10_TEMP8 = X10_TEMP4 - X10_TEMP5 ; 
struct Region1 areg = createNewRegion1R ( X10_TEMP7 , X10_TEMP8 ) ; 
const place_t X10_TEMP10 = /* here  */ _here(); 
struct Dist1 adist = getPlaceDist1 ( areg , X10_TEMP10 ) ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = areg .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP2= 0; RX10_TEMP2<  RX10_TEMP4; RX10_TEMP2++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP2 ; 
struct Point1 i = regionOrdinalPoint1 ( areg , RX10_TEMP6 ) ; 
const double X10_TEMP14 = Random_nextDouble ( R ) ; 
const double X10_TEMP15 = 1e-6; 
const double X10_TEMP17 = X10_TEMP14 * X10_TEMP15 ; 
const double X10_TEMP18 = X10_TEMP17 ; 
struct Dist1 RX10_TEMP7 = a .distValue ; 
struct Region1 RX10_TEMP8 = RX10_TEMP7 .dReg ; 
const int32_t RX10_TEMP9 = searchPointInRegion1 ( RX10_TEMP8 , i ) ; 
const int32_t RX10_TEMP10 = 0 ; 
const uint32_t RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP12 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP13 = getPlaceFromDist1 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const place_t RX10_TEMP15 = /* here  */ _here(); 
const uint32_t RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Bad place access for array a" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( a , RX10_TEMP9 , X10_TEMP18 ) ; 
} 

return a ; 
} 

void /*static*/SparseMatmult_test (  struct SparseMatmult  * const X10_TEMP0 ,  struct doubleRefArray1 const y ,  struct doubleValArray1 const val ,  struct intValArray1 const row ,  struct intValArray1 const col ,  struct doubleValArray1 const x , const int32_t NUM_ITERATIONS ,  struct intValArray1 const lowsum ,  struct intValArray1 const highsum ) 
{ 
struct Region1 RX10_TEMP0 = val .regionValue ; 
struct Region1 X10_TEMP1 = RX10_TEMP0 ; 
const int32_t nz = X10_TEMP1 .regSize ; 
struct Dist1 X10_TEMP3 = getUniqueDist ( ) ; 
struct Dist1 dDistU = X10_TEMP3 ; 
const double X10_TEMP6 = 0.0; 
const double X10_TEMP7 = X10_TEMP6 ; 
X10_TEMP0 ->ytotal = ( X10_TEMP7 ) ; 
/* finish  */ task_start_finish();

{ 
const place_t X10_TEMP9 = /* here  */ _here(); 
struct Region1 RX10_TEMP2 = dDistU .dReg ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP1= 0; RX10_TEMP1<  RX10_TEMP4; RX10_TEMP1++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP1 ; 
struct Point1 id1 = regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
struct T18 utmp18  ; 
T18_T18( &utmp18/*OBJECT INIT IN ASSIGNMENT*/, id1 , highsum , lowsum , NUM_ITERATIONS , x , col , row , val , y ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC17) ;
a.size = sizeof(utmp18 );
a.params = (void *)(&utmp18 );
task_dispatch(a, X10_TEMP9 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
const place_t curr_place = /* here  */ _here(); 
const int32_t X10_TEMP53 = 0 ; 
const int32_t X10_TEMP54 = 0 ; 
struct Region1 tempr = createNewRegion1R ( X10_TEMP53 , X10_TEMP54 ) ; 
const place_t X10_TEMP56 = /* here  */ _here(); 
struct Dist1 tempvd = getPlaceDist1 ( tempr , X10_TEMP56 ) ; 
struct Region1 RX10_TEMP97 = tempvd .dReg ; 
const int32_t RX10_TEMP98 = 0 ; 
const int32_t RX10_TEMP99 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP100 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP100 = RX10_TEMP100 - RX10_TEMP99 ; const int32_t RX10_TEMP101 = RX10_TEMP100 + 1; 
const int32_t RX10_TEMP102 = /*SimpleDistributionExpression*/ RX10_TEMP100 +1; 
void * TEMPCALLOCPOINTER41;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP103 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER41 = malloc(sizeof(int32_t)+(RX10_TEMP102*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP102*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER41)[0] = RX10_TEMP102, TEMPCALLOCPOINTER41 = ((int32_t * )TEMPCALLOCPOINTER41)+1, memset(TEMPCALLOCPOINTER41,0,RX10_TEMP102*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP104= 0; RX10_TEMP104<  RX10_TEMP101; RX10_TEMP104++ )
 
{ 
const place_t RX10_TEMP105 = /* here  */ _here(); 
const int32_t RX10_TEMP106 = /*PointAccess*/RX10_TEMP104 ; 
const place_t RX10_TEMP107 = /* place.places ( RX10_TEMP106 )  */ _toplace(RX10_TEMP106 ); 
const int32_t RX10_TEMP108 = getDistLocalCount1 ( tempvd , RX10_TEMP106 ) ; 
const int32_t RX10_TEMP109 = RX10_TEMP108 - RX10_TEMP99 ; 
struct T19 utmp19  ; 
T19_T19( &utmp19/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP109 , RX10_TEMP105 , RX10_TEMP104 , RX10_TEMP103 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC18) ;
a.size = sizeof(utmp19 );
a.params = (void *)(&utmp19 );
task_dispatch(a, RX10_TEMP107 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER42;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP114 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER42 = malloc(sizeof(int32_t)+(RX10_TEMP101*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP101*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER42)[0] = RX10_TEMP101, TEMPCALLOCPOINTER42 = ((int32_t * )TEMPCALLOCPOINTER42)+1, memset(TEMPCALLOCPOINTER42,0,RX10_TEMP101*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP116 = 0;RX10_TEMP116 < RX10_TEMP101; RX10_TEMP116++) 

{ 
struct doubleStub RX10_TEMP115 = RX10_TEMP103 [ RX10_TEMP116 ] 
; 
RX10_TEMP114[RX10_TEMP116] = RX10_TEMP115 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP117  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP117/*OBJECT INIT IN ASSIGNMENT*/, tempvd , RX10_TEMP114 ) ; 
struct doubleRefArray1 tempref = RX10_TEMP117 ; 
const int32_t X10_TEMP64 = 0 ; 
const int32_t X10_TEMP62 = 1 ; 
const int32_t X10_TEMP65 = nz - X10_TEMP62 ; 
struct Region1 X10_TEMP67 = createNewRegion1R ( X10_TEMP64 , X10_TEMP65 ) ; 
const int32_t RX10_TEMP121 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP119 = X10_TEMP67 .regSize ; 
RX10_TEMP119 = RX10_TEMP119 - RX10_TEMP121 ; const int32_t RX10_TEMP120 = RX10_TEMP119 + 1; 
for ( int32_t RX10_TEMP118= 0; RX10_TEMP118<  RX10_TEMP120; RX10_TEMP118++ )
 
{ 
const int32_t RX10_TEMP122 = /*PointAccess*/RX10_TEMP118 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP67 , RX10_TEMP122 ) ; 
/* finish  */ task_start_finish();

{ 
struct Dist1 RX10_TEMP123 = y .distValue ; 
struct Dist1 X10_TEMP68 = RX10_TEMP123 ; 
struct Region1 RX10_TEMP124 = row .regionValue ; 
const int32_t RX10_TEMP125 = searchPointInRegion1 ( RX10_TEMP124 , i ) ; 
const int32_t RX10_TEMP126 = 0 ; 
const uint32_t RX10_TEMP127 = RX10_TEMP125 < RX10_TEMP126 ; 
if ( RX10_TEMP127 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP128 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP128 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP129 = (/*VALUE ARRAY*/ int32_t * ) row .contents ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP71 = RX10_TEMP129 [ RX10_TEMP125 ] 
; 
struct Point1 RX10_TEMP130  ; 
Point1_Point1( &RX10_TEMP130/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP71 ) ; 
struct Region1 RX10_TEMP131 = X10_TEMP68 .dReg ; 
const int32_t RX10_TEMP132 = searchPointInRegion1 ( RX10_TEMP131 , RX10_TEMP130 ) ; 
const int32_t RX10_TEMP133 = 0 ; 
const uint32_t RX10_TEMP134 = RX10_TEMP132 < RX10_TEMP133 ; 
if ( RX10_TEMP134 ) 
{ 
const char * RX10_TEMP135 = "Point RX10_TEMP130 not found in the distribution X10_TEMP68." ; 
fprintf(stderr, "%s",RX10_TEMP135 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP136 = getPlaceFromDist1 ( X10_TEMP68 , RX10_TEMP132 ) ; 
const place_t X10_TEMP73 = RX10_TEMP136 ; 
struct T20 utmp20  ; 
T20_T20( &utmp20/*OBJECT INIT IN ASSIGNMENT*/, i , tempref , curr_place , row , y ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC19) ;
a.size = sizeof(utmp20 );
a.params = (void *)(&utmp20 );
task_dispatch(a, X10_TEMP73 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const double X10_TEMP85 = X10_TEMP0 ->ytotal ; 
const int32_t X10_TEMP84 = 0 ; 
struct Point1 RX10_TEMP166  ; 
Point1_Point1( &RX10_TEMP166/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP84 ) ; 
struct Dist1 RX10_TEMP167 = tempref .distValue ; 
struct Region1 RX10_TEMP168 = RX10_TEMP167 .dReg ; 
const int32_t RX10_TEMP169 = searchPointInRegion1 ( RX10_TEMP168 , RX10_TEMP166 ) ; 
const int32_t RX10_TEMP170 = 0 ; 
const uint32_t RX10_TEMP171 = RX10_TEMP169 < RX10_TEMP170 ; 
if ( RX10_TEMP171 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP172 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP172 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP173 = getPlaceFromDist1 ( RX10_TEMP167 , RX10_TEMP169 ) ; 
const place_t RX10_TEMP175 = /* here  */ _here(); 
const uint32_t RX10_TEMP176 = RX10_TEMP173 != RX10_TEMP175 ; 
if ( RX10_TEMP176 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP174 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP174 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP177 = getRefArrayValue1double ( tempref , RX10_TEMP169 ) ; 
const double X10_TEMP86 = RX10_TEMP177 ; 
const double X10_TEMP88 = X10_TEMP85 + X10_TEMP86 ; 
const double X10_TEMP89 = X10_TEMP88 ; 
X10_TEMP0 ->ytotal = ( X10_TEMP89 ) ; 
} 

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
void * TEMPCALLOCPOINTER48;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER48 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER48)[0] = dDist, TEMPCALLOCPOINTER48 = ((int32_t * )TEMPCALLOCPOINTER48)+1, memset(TEMPCALLOCPOINTER48,0,dDist*sizeof(place_t ) ) ); 
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
void * TEMPCALLOCPOINTER49;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER49)[0] = dReg, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER50;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER50)[0] = dReg, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER54;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER54 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(placeRegion*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER54)[0] = placeRegion, TEMPCALLOCPOINTER54 = ((int32_t * )TEMPCALLOCPOINTER54)+1, memset(TEMPCALLOCPOINTER54,0,placeRegion*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER55;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER55 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(pointRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER55)[0] = pointRegion, TEMPCALLOCPOINTER55 = ((int32_t * )TEMPCALLOCPOINTER55)+1, memset(TEMPCALLOCPOINTER55,0,pointRegion*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER62;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER62 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER62)[0] = dReg, TEMPCALLOCPOINTER62 = ((int32_t * )TEMPCALLOCPOINTER62)+1, memset(TEMPCALLOCPOINTER62,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER63;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER63 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER63)[0] = tempReg, TEMPCALLOCPOINTER63 = ((int32_t * )TEMPCALLOCPOINTER63)+1, memset(TEMPCALLOCPOINTER63,0,tempReg*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < tempReg; p++) 

{ 
const int32_t tempInt = tempArr [ p ] 
; 
vTemp[p] = tempInt ; 
} 
/*END OF ARRAY INIT*/return vTemp ; 
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
void * TEMPCALLOCPOINTER67;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER67 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER67)[0] = regArr, TEMPCALLOCPOINTER67 = ((int32_t * )TEMPCALLOCPOINTER67)+1, memset(TEMPCALLOCPOINTER67,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER68;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER68 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER68)[0] = regArr, TEMPCALLOCPOINTER68 = ((int32_t * )TEMPCALLOCPOINTER68)+1, memset(TEMPCALLOCPOINTER68,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER69;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER69 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER69)[0] = regArr, TEMPCALLOCPOINTER69 = ((int32_t * )TEMPCALLOCPOINTER69)+1, memset(TEMPCALLOCPOINTER69,0,regArr*sizeof(Point1 )) ); 

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
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER71;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP15 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER71 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER71)[0] = RX10_TEMP14, TEMPCALLOCPOINTER71 = ((int32_t * )TEMPCALLOCPOINTER71)+1, memset(TEMPCALLOCPOINTER71,0,RX10_TEMP14*sizeof(int32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const int32_t X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct intStub RX10_TEMP16  ; 
intStub_intStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T24 utmp24  ; 
T24_T24( &utmp24/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC20) ;
a.size = sizeof(utmp24 );
a.params = (void *)(&utmp24 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER73;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP36 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER73 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER73)[0] = RX10_TEMP35, TEMPCALLOCPOINTER73 = ((int32_t * )TEMPCALLOCPOINTER73)+1, memset(TEMPCALLOCPOINTER73,0,RX10_TEMP35*sizeof(int32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const int32_t X10_TEMP12 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP12 ; 
} 
/*END OF ARRAY INIT*/struct intStub RX10_TEMP37  ; 
intStub_intStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T25 utmp25  ; 
T25_T25( &utmp25/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC21) ;
a.size = sizeof(utmp25 );
a.params = (void *)(&utmp25 );
task_dispatch(a, RX10_TEMP29 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER75;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP57 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER75 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER75)[0] = RX10_TEMP56, TEMPCALLOCPOINTER75 = ((int32_t * )TEMPCALLOCPOINTER75)+1, memset(TEMPCALLOCPOINTER75,0,RX10_TEMP56*sizeof(int32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const int32_t X10_TEMP15 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP15 ; 
} 
/*END OF ARRAY INIT*/struct intStub RX10_TEMP58  ; 
intStub_intStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T26 utmp26  ; 
T26_T26( &utmp26/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC22) ;
a.size = sizeof(utmp26 );
a.params = (void *)(&utmp26 );
task_dispatch(a, RX10_TEMP50 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP111 = utmpz .RX10_TEMP111 ; 
const place_t RX10_TEMP107 = utmpz .RX10_TEMP107 ; 
const int32_t RX10_TEMP106 = utmpz .RX10_TEMP106 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP105 = utmpz .RX10_TEMP105 ; 

{ 
const int32_t RX10_TEMP112 = /*SimpleDistributionExpression*/ RX10_TEMP111 +1; 
void * TEMPCALLOCPOINTER77;
/*Updatable ARRAY*/ double * const RX10_TEMP113 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER77 = malloc(sizeof(int32_t)+(RX10_TEMP112*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP112*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER77)[0] = RX10_TEMP112, TEMPCALLOCPOINTER77 = ((int32_t * )TEMPCALLOCPOINTER77)+1, memset(TEMPCALLOCPOINTER77,0,RX10_TEMP112*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP114  ; 
doubleStub_doubleStub( &RX10_TEMP114/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP113 ) ; 
struct T27 utmp27  ; 
T27_T27( &utmp27/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP114 , RX10_TEMP106 , RX10_TEMP105 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC23) ;
a.size = sizeof(utmp27 );
a.params = (void *)(&utmp27 );
task_dispatch(a, RX10_TEMP107 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread5 (  struct T5 const utmpz ) 
{ 
const int32_t RX10_TEMP153 = utmpz .RX10_TEMP153 ; 
const place_t RX10_TEMP149 = utmpz .RX10_TEMP149 ; 
const int32_t RX10_TEMP148 = utmpz .RX10_TEMP148 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP147 = utmpz .RX10_TEMP147 ; 

{ 
const int32_t RX10_TEMP154 = /*SimpleDistributionExpression*/ RX10_TEMP153 +1; 
void * TEMPCALLOCPOINTER79;
/*Updatable ARRAY*/ double * const RX10_TEMP155 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER79 = malloc(sizeof(int32_t)+(RX10_TEMP154*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP154*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER79)[0] = RX10_TEMP154, TEMPCALLOCPOINTER79 = ((int32_t * )TEMPCALLOCPOINTER79)+1, memset(TEMPCALLOCPOINTER79,0,RX10_TEMP154*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP156  ; 
doubleStub_doubleStub( &RX10_TEMP156/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP155 ) ; 
struct T28 utmp28  ; 
T28_T28( &utmp28/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP156 , RX10_TEMP148 , RX10_TEMP147 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC24) ;
a.size = sizeof(utmp28 );
a.params = (void *)(&utmp28 );
task_dispatch(a, RX10_TEMP149 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread6 (  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP173 = utmpz .RX10_TEMP173 ; 
const place_t RX10_TEMP169 = utmpz .RX10_TEMP169 ; 
const int32_t RX10_TEMP168 = utmpz .RX10_TEMP168 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP167 = utmpz .RX10_TEMP167 ; 

{ 
const int32_t RX10_TEMP174 = /*SimpleDistributionExpression*/ RX10_TEMP173 +1; 
void * TEMPCALLOCPOINTER81;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP175 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER81 = malloc(sizeof(int32_t)+(RX10_TEMP174*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP174*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER81)[0] = RX10_TEMP174, TEMPCALLOCPOINTER81 = ((int32_t * )TEMPCALLOCPOINTER81)+1, memset(TEMPCALLOCPOINTER81,0,RX10_TEMP174*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP176  ; 
intStub_intStub( &RX10_TEMP176/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP175 ) ; 
struct T29 utmp29  ; 
T29_T29( &utmp29/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP176 , RX10_TEMP168 , RX10_TEMP167 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC25) ;
a.size = sizeof(utmp29 );
a.params = (void *)(&utmp29 );
task_dispatch(a, RX10_TEMP169 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread7 (  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP193 = utmpz .RX10_TEMP193 ; 
const place_t RX10_TEMP189 = utmpz .RX10_TEMP189 ; 
const int32_t RX10_TEMP188 = utmpz .RX10_TEMP188 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP187 = utmpz .RX10_TEMP187 ; 

{ 
const int32_t RX10_TEMP194 = /*SimpleDistributionExpression*/ RX10_TEMP193 +1; 
void * TEMPCALLOCPOINTER83;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP195 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER83 = malloc(sizeof(int32_t)+(RX10_TEMP194*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP194*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER83)[0] = RX10_TEMP194, TEMPCALLOCPOINTER83 = ((int32_t * )TEMPCALLOCPOINTER83)+1, memset(TEMPCALLOCPOINTER83,0,RX10_TEMP194*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP196  ; 
intStub_intStub( &RX10_TEMP196/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP195 ) ; 
struct T30 utmp30  ; 
T30_T30( &utmp30/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP196 , RX10_TEMP188 , RX10_TEMP187 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC26) ;
a.size = sizeof(utmp30 );
a.params = (void *)(&utmp30 );
task_dispatch(a, RX10_TEMP189 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread8 (  struct T8 const utmpz ) 
{ 
const int32_t RX10_TEMP213 = utmpz .RX10_TEMP213 ; 
const place_t RX10_TEMP209 = utmpz .RX10_TEMP209 ; 
const int32_t RX10_TEMP208 = utmpz .RX10_TEMP208 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP207 = utmpz .RX10_TEMP207 ; 

{ 
const int32_t RX10_TEMP214 = /*SimpleDistributionExpression*/ RX10_TEMP213 +1; 
void * TEMPCALLOCPOINTER85;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP215 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER85 = malloc(sizeof(int32_t)+(RX10_TEMP214*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP214*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER85)[0] = RX10_TEMP214, TEMPCALLOCPOINTER85 = ((int32_t * )TEMPCALLOCPOINTER85)+1, memset(TEMPCALLOCPOINTER85,0,RX10_TEMP214*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP216  ; 
intStub_intStub( &RX10_TEMP216/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP215 ) ; 
struct T31 utmp31  ; 
T31_T31( &utmp31/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP216 , RX10_TEMP208 , RX10_TEMP207 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC27) ;
a.size = sizeof(utmp31 );
a.params = (void *)(&utmp31 );
task_dispatch(a, RX10_TEMP209 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
const int32_t RX10_TEMP233 = utmpz .RX10_TEMP233 ; 
const place_t RX10_TEMP229 = utmpz .RX10_TEMP229 ; 
const int32_t RX10_TEMP228 = utmpz .RX10_TEMP228 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP227 = utmpz .RX10_TEMP227 ; 

{ 
const int32_t RX10_TEMP234 = /*SimpleDistributionExpression*/ RX10_TEMP233 +1; 
void * TEMPCALLOCPOINTER87;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP235 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER87 = malloc(sizeof(int32_t)+(RX10_TEMP234*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP234*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER87)[0] = RX10_TEMP234, TEMPCALLOCPOINTER87 = ((int32_t * )TEMPCALLOCPOINTER87)+1, memset(TEMPCALLOCPOINTER87,0,RX10_TEMP234*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP236  ; 
intStub_intStub( &RX10_TEMP236/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP235 ) ; 
struct T32 utmp32  ; 
T32_T32( &utmp32/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP236 , RX10_TEMP228 , RX10_TEMP227 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC28) ;
a.size = sizeof(utmp32 );
a.params = (void *)(&utmp32 );
task_dispatch(a, RX10_TEMP229 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread10 (  struct T10 const utmpz ) 
{ 
const int32_t RX10_TEMP253 = utmpz .RX10_TEMP253 ; 
const place_t RX10_TEMP249 = utmpz .RX10_TEMP249 ; 
const int32_t RX10_TEMP248 = utmpz .RX10_TEMP248 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP247 = utmpz .RX10_TEMP247 ; 

{ 
const int32_t RX10_TEMP254 = /*SimpleDistributionExpression*/ RX10_TEMP253 +1; 
void * TEMPCALLOCPOINTER89;
/*Updatable ARRAY*/ double * const RX10_TEMP255 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER89 = malloc(sizeof(int32_t)+(RX10_TEMP254*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP254*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER89)[0] = RX10_TEMP254, TEMPCALLOCPOINTER89 = ((int32_t * )TEMPCALLOCPOINTER89)+1, memset(TEMPCALLOCPOINTER89,0,RX10_TEMP254*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP256  ; 
doubleStub_doubleStub( &RX10_TEMP256/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP255 ) ; 
struct T33 utmp33  ; 
T33_T33( &utmp33/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP256 , RX10_TEMP248 , RX10_TEMP247 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC29) ;
a.size = sizeof(utmp33 );
a.params = (void *)(&utmp33 );
task_dispatch(a, RX10_TEMP249 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread11 (  struct T11 const utmpz ) 
{ 
const int32_t RX10_TEMP273 = utmpz .RX10_TEMP273 ; 
const place_t RX10_TEMP269 = utmpz .RX10_TEMP269 ; 
const int32_t RX10_TEMP268 = utmpz .RX10_TEMP268 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP267 = utmpz .RX10_TEMP267 ; 

{ 
const int32_t RX10_TEMP274 = /*SimpleDistributionExpression*/ RX10_TEMP273 +1; 
void * TEMPCALLOCPOINTER91;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP275 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER91 = malloc(sizeof(int32_t)+(RX10_TEMP274*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP274*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER91)[0] = RX10_TEMP274, TEMPCALLOCPOINTER91 = ((int32_t * )TEMPCALLOCPOINTER91)+1, memset(TEMPCALLOCPOINTER91,0,RX10_TEMP274*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP276  ; 
intStub_intStub( &RX10_TEMP276/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP275 ) ; 
struct T34 utmp34  ; 
T34_T34( &utmp34/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP276 , RX10_TEMP268 , RX10_TEMP267 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC30) ;
a.size = sizeof(utmp34 );
a.params = (void *)(&utmp34 );
task_dispatch(a, RX10_TEMP269 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread12 (  struct T12 const utmpz ) 
{ 
const int32_t RX10_TEMP293 = utmpz .RX10_TEMP293 ; 
const place_t RX10_TEMP289 = utmpz .RX10_TEMP289 ; 
const int32_t RX10_TEMP288 = utmpz .RX10_TEMP288 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP287 = utmpz .RX10_TEMP287 ; 

{ 
const int32_t RX10_TEMP294 = /*SimpleDistributionExpression*/ RX10_TEMP293 +1; 
void * TEMPCALLOCPOINTER93;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP295 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER93 = malloc(sizeof(int32_t)+(RX10_TEMP294*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP294*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER93)[0] = RX10_TEMP294, TEMPCALLOCPOINTER93 = ((int32_t * )TEMPCALLOCPOINTER93)+1, memset(TEMPCALLOCPOINTER93,0,RX10_TEMP294*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP296  ; 
intStub_intStub( &RX10_TEMP296/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP295 ) ; 
struct T35 utmp35  ; 
T35_T35( &utmp35/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP296 , RX10_TEMP288 , RX10_TEMP287 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC31) ;
a.size = sizeof(utmp35 );
a.params = (void *)(&utmp35 );
task_dispatch(a, RX10_TEMP289 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread13 (  struct T13 const utmpz ) 
{ 
const int32_t RX10_TEMP313 = utmpz .RX10_TEMP313 ; 
const place_t RX10_TEMP309 = utmpz .RX10_TEMP309 ; 
const int32_t RX10_TEMP308 = utmpz .RX10_TEMP308 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP307 = utmpz .RX10_TEMP307 ; 

{ 
const int32_t RX10_TEMP314 = /*SimpleDistributionExpression*/ RX10_TEMP313 +1; 
void * TEMPCALLOCPOINTER95;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP315 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER95 = malloc(sizeof(int32_t)+(RX10_TEMP314*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP314*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER95)[0] = RX10_TEMP314, TEMPCALLOCPOINTER95 = ((int32_t * )TEMPCALLOCPOINTER95)+1, memset(TEMPCALLOCPOINTER95,0,RX10_TEMP314*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP316  ; 
intStub_intStub( &RX10_TEMP316/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP315 ) ; 
struct T36 utmp36  ; 
T36_T36( &utmp36/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP316 , RX10_TEMP308 , RX10_TEMP307 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC32) ;
a.size = sizeof(utmp36 );
a.params = (void *)(&utmp36 );
task_dispatch(a, RX10_TEMP309 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread14 (  struct T14 const utmpz ) 
{ 
const int32_t RX10_TEMP333 = utmpz .RX10_TEMP333 ; 
const place_t RX10_TEMP329 = utmpz .RX10_TEMP329 ; 
const int32_t RX10_TEMP328 = utmpz .RX10_TEMP328 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP327 = utmpz .RX10_TEMP327 ; 

{ 
const int32_t RX10_TEMP334 = /*SimpleDistributionExpression*/ RX10_TEMP333 +1; 
void * TEMPCALLOCPOINTER97;
/*Updatable ARRAY*/ double * const RX10_TEMP335 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER97 = malloc(sizeof(int32_t)+(RX10_TEMP334*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP334*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER97)[0] = RX10_TEMP334, TEMPCALLOCPOINTER97 = ((int32_t * )TEMPCALLOCPOINTER97)+1, memset(TEMPCALLOCPOINTER97,0,RX10_TEMP334*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP336  ; 
doubleStub_doubleStub( &RX10_TEMP336/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP335 ) ; 
struct T37 utmp37  ; 
T37_T37( &utmp37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP336 , RX10_TEMP328 , RX10_TEMP327 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC33) ;
a.size = sizeof(utmp37 );
a.params = (void *)(&utmp37 );
task_dispatch(a, RX10_TEMP329 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread15 (  struct T15 const utmpz ) 
{ 
const int32_t RX10_TEMP353 = utmpz .RX10_TEMP353 ; 
const place_t RX10_TEMP349 = utmpz .RX10_TEMP349 ; 
const int32_t RX10_TEMP348 = utmpz .RX10_TEMP348 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP347 = utmpz .RX10_TEMP347 ; 

{ 
const int32_t RX10_TEMP354 = /*SimpleDistributionExpression*/ RX10_TEMP353 +1; 
void * TEMPCALLOCPOINTER99;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP355 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER99 = malloc(sizeof(int32_t)+(RX10_TEMP354*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP354*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER99)[0] = RX10_TEMP354, TEMPCALLOCPOINTER99 = ((int32_t * )TEMPCALLOCPOINTER99)+1, memset(TEMPCALLOCPOINTER99,0,RX10_TEMP354*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP356  ; 
intStub_intStub( &RX10_TEMP356/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP355 ) ; 
struct T38 utmp38  ; 
T38_T38( &utmp38/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP356 , RX10_TEMP348 , RX10_TEMP347 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC34) ;
a.size = sizeof(utmp38 );
a.params = (void *)(&utmp38 );
task_dispatch(a, RX10_TEMP349 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread16 (  struct T16 const utmpz ) 
{ 
const int32_t RX10_TEMP373 = utmpz .RX10_TEMP373 ; 
const place_t RX10_TEMP369 = utmpz .RX10_TEMP369 ; 
const int32_t RX10_TEMP368 = utmpz .RX10_TEMP368 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP367 = utmpz .RX10_TEMP367 ; 

{ 
const int32_t RX10_TEMP374 = /*SimpleDistributionExpression*/ RX10_TEMP373 +1; 
void * TEMPCALLOCPOINTER101;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP375 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER101 = malloc(sizeof(int32_t)+(RX10_TEMP374*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP374*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER101)[0] = RX10_TEMP374, TEMPCALLOCPOINTER101 = ((int32_t * )TEMPCALLOCPOINTER101)+1, memset(TEMPCALLOCPOINTER101,0,RX10_TEMP374*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP376  ; 
intStub_intStub( &RX10_TEMP376/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP375 ) ; 
struct T39 utmp39  ; 
T39_T39( &utmp39/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP376 , RX10_TEMP368 , RX10_TEMP367 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC35) ;
a.size = sizeof(utmp39 );
a.params = (void *)(&utmp39 );
task_dispatch(a, RX10_TEMP369 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread17 (  struct T17 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER103;
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER103 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER103)[0] = RX10_TEMP13, TEMPCALLOCPOINTER103 = ((int32_t * )TEMPCALLOCPOINTER103)+1, memset(TEMPCALLOCPOINTER103,0,RX10_TEMP13*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP15  ; 
doubleStub_doubleStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T40 utmp40  ; 
T40_T40( &utmp40/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC36) ;
a.size = sizeof(utmp40 );
a.params = (void *)(&utmp40 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread18 (  struct T18 const utmpz ) 
{ 
struct Point1 id1 = utmpz .id1 ; 
struct intValArray1 highsum = utmpz .highsum ; 
struct intValArray1 lowsum = utmpz .lowsum ; 
const int32_t NUM_ITERATIONS = utmpz .NUM_ITERATIONS ; 
struct doubleValArray1 x = utmpz .x ; 
struct intValArray1 col = utmpz .col ; 
struct intValArray1 row = utmpz .row ; 
struct doubleValArray1 val = utmpz .val ; 
struct doubleRefArray1 y = utmpz .y ; 

{ 
const int32_t X10_TEMP13 = 0 ; 
const int32_t X10_TEMP11 = 1 ; 
const int32_t X10_TEMP14 = NUM_ITERATIONS - X10_TEMP11 ; 
struct Region1 X10_TEMP16 = createNewRegion1R ( X10_TEMP13 , X10_TEMP14 ) ; 
const int32_t RX10_TEMP10 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP8 = X10_TEMP16 .regSize ; 
RX10_TEMP8 = RX10_TEMP8 - RX10_TEMP10 ;; const int32_t RX10_TEMP9 = RX10_TEMP8 + 1; 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP9; RX10_TEMP7++ )
 
{ 
const int32_t RX10_TEMP11 = /*PointAccess*/RX10_TEMP7 ; 
struct Point1 reps = regionOrdinalPoint1 ( X10_TEMP16 , RX10_TEMP11 ) ; 
struct Region1 RX10_TEMP12 = lowsum .regionValue ; 
const int32_t RX10_TEMP13 = searchPointInRegion1 ( RX10_TEMP12 , id1 ) ; 
const int32_t RX10_TEMP14 = 0 ; 
const uint32_t RX10_TEMP15 = RX10_TEMP13 < RX10_TEMP14 ; 
if ( RX10_TEMP15 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP16 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP16 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP17 = (/*VALUE ARRAY*/ int32_t * ) lowsum .contents ; 
const int32_t X10_TEMP23 = RX10_TEMP17 [ RX10_TEMP13 ] 
; 
struct Region1 RX10_TEMP18 = highsum .regionValue ; 
const int32_t RX10_TEMP19 = searchPointInRegion1 ( RX10_TEMP18 , id1 ) ; 
const int32_t RX10_TEMP20 = 0 ; 
const uint32_t RX10_TEMP21 = RX10_TEMP19 < RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP22 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP22 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP23 = (/*VALUE ARRAY*/ int32_t * ) highsum .contents ; 
const int32_t X10_TEMP20 = RX10_TEMP23 [ RX10_TEMP19 ] 
; 
const int32_t X10_TEMP21 = 1 ; 
const int32_t X10_TEMP24 = X10_TEMP20 - X10_TEMP21 ; 
struct Region1 X10_TEMP26 = createNewRegion1R ( X10_TEMP23 , X10_TEMP24 ) ; 
const int32_t RX10_TEMP27 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP25 = X10_TEMP26 .regSize ; 
RX10_TEMP25 = RX10_TEMP25 - RX10_TEMP27 ; const int32_t RX10_TEMP26 = RX10_TEMP25 + 1; 
for ( int32_t RX10_TEMP24= 0; RX10_TEMP24<  RX10_TEMP26; RX10_TEMP24++ )
 
{ 
const int32_t RX10_TEMP28 = /*PointAccess*/RX10_TEMP24 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP26 , RX10_TEMP28 ) ; 
/* finish  */ task_start_finish();

{ 
struct Dist1 RX10_TEMP29 = y .distValue ; 
struct Dist1 X10_TEMP27 = RX10_TEMP29 ; 
struct Region1 RX10_TEMP30 = row .regionValue ; 
const int32_t RX10_TEMP31 = searchPointInRegion1 ( RX10_TEMP30 , i ) ; 
const int32_t RX10_TEMP32 = 0 ; 
const uint32_t RX10_TEMP33 = RX10_TEMP31 < RX10_TEMP32 ; 
if ( RX10_TEMP33 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP34 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP35 = (/*VALUE ARRAY*/ int32_t * ) row .contents ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP30 = RX10_TEMP35 [ RX10_TEMP31 ] 
; 
struct Point1 RX10_TEMP36  ; 
Point1_Point1( &RX10_TEMP36/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP30 ) ; 
struct Region1 RX10_TEMP37 = X10_TEMP27 .dReg ; 
const int32_t RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP36 ) ; 
const int32_t RX10_TEMP39 = 0 ; 
const uint32_t RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
const char * RX10_TEMP41 = "Point RX10_TEMP36 not found in the distribution X10_TEMP27." ; 
fprintf(stderr, "%s",RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP42 = getPlaceFromDist1 ( X10_TEMP27 , RX10_TEMP38 ) ; 
const place_t X10_TEMP32 = RX10_TEMP42 ; 
struct T41 utmp41  ; 
T41_T41( &utmp41/*OBJECT INIT IN ASSIGNMENT*/, i , x , col , row , val , y ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC37) ;
a.size = sizeof(utmp41 );
a.params = (void *)(&utmp41 );
task_dispatch(a, X10_TEMP32 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 

} 

} 
} 

void /*static*/thread19 (  struct T19 const utmpz ) 
{ 
const int32_t RX10_TEMP109 = utmpz .RX10_TEMP109 ; 
const place_t RX10_TEMP105 = utmpz .RX10_TEMP105 ; 
const int32_t RX10_TEMP104 = utmpz .RX10_TEMP104 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP103 = utmpz .RX10_TEMP103 ; 

{ 
const int32_t RX10_TEMP111 = /*SimpleDistributionExpression*/ RX10_TEMP109 +1; 
void * TEMPCALLOCPOINTER108;
/*Updatable ARRAY*/ double * const RX10_TEMP112 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER108 = malloc(sizeof(int32_t)+(RX10_TEMP111*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP111*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER108)[0] = RX10_TEMP111, TEMPCALLOCPOINTER108 = ((int32_t * )TEMPCALLOCPOINTER108)+1, memset(TEMPCALLOCPOINTER108,0,RX10_TEMP111*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP110 = 0;RX10_TEMP110 < RX10_TEMP111; RX10_TEMP110++) 

{ 
const double X10_TEMP59 = 0.0; 
RX10_TEMP112[RX10_TEMP110] = X10_TEMP59 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP113  ; 
doubleStub_doubleStub( &RX10_TEMP113/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP112 ) ; 
struct T42 utmp42  ; 
T42_T42( &utmp42/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP113 , RX10_TEMP104 , RX10_TEMP103 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC38) ;
a.size = sizeof(utmp42 );
a.params = (void *)(&utmp42 );
task_dispatch(a, RX10_TEMP105 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread20 (  struct T20 const utmpz ) 
{ 
struct Point1 i = utmpz .i ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 
const place_t curr_place = utmpz .curr_place ; 
struct intValArray1 row = utmpz .row ; 
struct doubleRefArray1 y = utmpz .y ; 

{ 
struct Region1 RX10_TEMP137 = row .regionValue ; 
const int32_t RX10_TEMP138 = searchPointInRegion1 ( RX10_TEMP137 , i ) ; 
const int32_t RX10_TEMP139 = 0 ; 
const uint32_t RX10_TEMP140 = RX10_TEMP138 < RX10_TEMP139 ; 
if ( RX10_TEMP140 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP141 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP141 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER109;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP142 = (/*VALUE ARRAY*/ int32_t * ) row .contents ; 
const int32_t X10_TEMP76 = RX10_TEMP142 [ RX10_TEMP138 ] 
; 
struct Point1 RX10_TEMP143  ; 
Point1_Point1( &RX10_TEMP143/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP76 ) ; 
struct Dist1 RX10_TEMP144 = y .distValue ; 
struct Region1 RX10_TEMP145 = RX10_TEMP144 .dReg ; 
const int32_t RX10_TEMP146 = searchPointInRegion1 ( RX10_TEMP145 , RX10_TEMP143 ) ; 
const int32_t RX10_TEMP147 = 0 ; 
const uint32_t RX10_TEMP148 = RX10_TEMP146 < RX10_TEMP147 ; 
if ( RX10_TEMP148 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP149 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP149 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP150 = getPlaceFromDist1 ( RX10_TEMP144 , RX10_TEMP146 ) ; 
const place_t RX10_TEMP152 = /* here  */ _here(); 
const uint32_t RX10_TEMP153 = RX10_TEMP150 != RX10_TEMP152 ; 
if ( RX10_TEMP153 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP151 = "Bad place access for array y" ; 
fprintf(stderr, "%s",RX10_TEMP151 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP154 = getRefArrayValue1double ( y , RX10_TEMP146 ) ; 
const double temp = RX10_TEMP154 ; 
struct T43 utmp43  ; 
T43_T43( &utmp43/*OBJECT INIT IN ASSIGNMENT*/, temp , tempref ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC39) ;
a.size = sizeof(utmp43 );
a.params = (void *)(&utmp43 );
task_dispatch(a, curr_place );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread24 (  struct T24 const utmpz ) 
{ 
struct intStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread25 (  struct T25 const utmpz ) 
{ 
struct intStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void /*static*/thread26 (  struct T26 const utmpz ) 
{ 
struct intStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; 
} 
} 

void /*static*/thread27 (  struct T27 const utmpz ) 
{ 
struct doubleStub RX10_TEMP114 = utmpz .RX10_TEMP114 ; 
const int32_t RX10_TEMP106 = utmpz .RX10_TEMP106 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP105 = utmpz .RX10_TEMP105 ; 

{ 
RX10_TEMP105 [ RX10_TEMP106 ] = ( RX10_TEMP114 ) ; 
} 
} 

void /*static*/thread28 (  struct T28 const utmpz ) 
{ 
struct doubleStub RX10_TEMP156 = utmpz .RX10_TEMP156 ; 
const int32_t RX10_TEMP148 = utmpz .RX10_TEMP148 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP147 = utmpz .RX10_TEMP147 ; 

{ 
RX10_TEMP147 [ RX10_TEMP148 ] = ( RX10_TEMP156 ) ; 
} 
} 

void /*static*/thread29 (  struct T29 const utmpz ) 
{ 
struct intStub RX10_TEMP176 = utmpz .RX10_TEMP176 ; 
const int32_t RX10_TEMP168 = utmpz .RX10_TEMP168 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP167 = utmpz .RX10_TEMP167 ; 

{ 
RX10_TEMP167 [ RX10_TEMP168 ] = ( RX10_TEMP176 ) ; 
} 
} 

void /*static*/thread30 (  struct T30 const utmpz ) 
{ 
struct intStub RX10_TEMP196 = utmpz .RX10_TEMP196 ; 
const int32_t RX10_TEMP188 = utmpz .RX10_TEMP188 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP187 = utmpz .RX10_TEMP187 ; 

{ 
RX10_TEMP187 [ RX10_TEMP188 ] = ( RX10_TEMP196 ) ; 
} 
} 

void /*static*/thread31 (  struct T31 const utmpz ) 
{ 
struct intStub RX10_TEMP216 = utmpz .RX10_TEMP216 ; 
const int32_t RX10_TEMP208 = utmpz .RX10_TEMP208 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP207 = utmpz .RX10_TEMP207 ; 

{ 
RX10_TEMP207 [ RX10_TEMP208 ] = ( RX10_TEMP216 ) ; 
} 
} 

void /*static*/thread32 (  struct T32 const utmpz ) 
{ 
struct intStub RX10_TEMP236 = utmpz .RX10_TEMP236 ; 
const int32_t RX10_TEMP228 = utmpz .RX10_TEMP228 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP227 = utmpz .RX10_TEMP227 ; 

{ 
RX10_TEMP227 [ RX10_TEMP228 ] = ( RX10_TEMP236 ) ; 
} 
} 

void /*static*/thread33 (  struct T33 const utmpz ) 
{ 
struct doubleStub RX10_TEMP256 = utmpz .RX10_TEMP256 ; 
const int32_t RX10_TEMP248 = utmpz .RX10_TEMP248 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP247 = utmpz .RX10_TEMP247 ; 

{ 
RX10_TEMP247 [ RX10_TEMP248 ] = ( RX10_TEMP256 ) ; 
} 
} 

void /*static*/thread34 (  struct T34 const utmpz ) 
{ 
struct intStub RX10_TEMP276 = utmpz .RX10_TEMP276 ; 
const int32_t RX10_TEMP268 = utmpz .RX10_TEMP268 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP267 = utmpz .RX10_TEMP267 ; 

{ 
RX10_TEMP267 [ RX10_TEMP268 ] = ( RX10_TEMP276 ) ; 
} 
} 

void /*static*/thread35 (  struct T35 const utmpz ) 
{ 
struct intStub RX10_TEMP296 = utmpz .RX10_TEMP296 ; 
const int32_t RX10_TEMP288 = utmpz .RX10_TEMP288 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP287 = utmpz .RX10_TEMP287 ; 

{ 
RX10_TEMP287 [ RX10_TEMP288 ] = ( RX10_TEMP296 ) ; 
} 
} 

void /*static*/thread36 (  struct T36 const utmpz ) 
{ 
struct intStub RX10_TEMP316 = utmpz .RX10_TEMP316 ; 
const int32_t RX10_TEMP308 = utmpz .RX10_TEMP308 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP307 = utmpz .RX10_TEMP307 ; 

{ 
RX10_TEMP307 [ RX10_TEMP308 ] = ( RX10_TEMP316 ) ; 
} 
} 

void /*static*/thread37 (  struct T37 const utmpz ) 
{ 
struct doubleStub RX10_TEMP336 = utmpz .RX10_TEMP336 ; 
const int32_t RX10_TEMP328 = utmpz .RX10_TEMP328 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP327 = utmpz .RX10_TEMP327 ; 

{ 
RX10_TEMP327 [ RX10_TEMP328 ] = ( RX10_TEMP336 ) ; 
} 
} 

void /*static*/thread38 (  struct T38 const utmpz ) 
{ 
struct intStub RX10_TEMP356 = utmpz .RX10_TEMP356 ; 
const int32_t RX10_TEMP348 = utmpz .RX10_TEMP348 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP347 = utmpz .RX10_TEMP347 ; 

{ 
RX10_TEMP347 [ RX10_TEMP348 ] = ( RX10_TEMP356 ) ; 
} 
} 

void /*static*/thread39 (  struct T39 const utmpz ) 
{ 
struct intStub RX10_TEMP376 = utmpz .RX10_TEMP376 ; 
const int32_t RX10_TEMP368 = utmpz .RX10_TEMP368 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP367 = utmpz .RX10_TEMP367 ; 

{ 
RX10_TEMP367 [ RX10_TEMP368 ] = ( RX10_TEMP376 ) ; 
} 
} 

void /*static*/thread40 (  struct T40 const utmpz ) 
{ 
struct doubleStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread41 (  struct T41 const utmpz ) 
{ 
struct Point1 i = utmpz .i ; 
struct doubleValArray1 x = utmpz .x ; 
struct intValArray1 col = utmpz .col ; 
struct intValArray1 row = utmpz .row ; 
struct doubleValArray1 val = utmpz .val ; 
struct doubleRefArray1 y = utmpz .y ; 

{ 
struct Region1 RX10_TEMP43 = row .regionValue ; 
const int32_t RX10_TEMP44 = searchPointInRegion1 ( RX10_TEMP43 , i ) ; 
const int32_t RX10_TEMP45 = 0 ; 
const uint32_t RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; 
if ( RX10_TEMP46 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP47 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP48 = (/*VALUE ARRAY*/ int32_t * ) row .contents ; 
const int32_t X10_TEMP35 = RX10_TEMP48 [ RX10_TEMP44 ] 
; 
struct Region1 RX10_TEMP49 = row .regionValue ; 
const int32_t RX10_TEMP50 = searchPointInRegion1 ( RX10_TEMP49 , i ) ; 
const int32_t RX10_TEMP51 = 0 ; 
const uint32_t RX10_TEMP52 = RX10_TEMP50 < RX10_TEMP51 ; 
if ( RX10_TEMP52 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP53 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP54 = (/*VALUE ARRAY*/ int32_t * ) row .contents ; 
const int32_t X10_TEMP38 = RX10_TEMP54 [ RX10_TEMP50 ] 
; 
struct Point1 RX10_TEMP55  ; 
Point1_Point1( &RX10_TEMP55/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP38 ) ; 
struct Dist1 RX10_TEMP56 = y .distValue ; 
struct Region1 RX10_TEMP57 = RX10_TEMP56 .dReg ; 
const int32_t RX10_TEMP58 = searchPointInRegion1 ( RX10_TEMP57 , RX10_TEMP55 ) ; 
const int32_t RX10_TEMP59 = 0 ; 
const uint32_t RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; 
if ( RX10_TEMP60 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP61 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP61 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP62 = getPlaceFromDist1 ( RX10_TEMP56 , RX10_TEMP58 ) ; 
const place_t RX10_TEMP64 = /* here  */ _here(); 
const uint32_t RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64 ; 
if ( RX10_TEMP65 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP63 = "Bad place access for array y" ; 
fprintf(stderr, "%s",RX10_TEMP63 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP66 = getRefArrayValue1double ( y , RX10_TEMP58 ) ; 
const double X10_TEMP45 = RX10_TEMP66 ; 
struct Region1 RX10_TEMP67 = col .regionValue ; 
const int32_t RX10_TEMP68 = searchPointInRegion1 ( RX10_TEMP67 , i ) ; 
const int32_t RX10_TEMP69 = 0 ; 
const uint32_t RX10_TEMP70 = RX10_TEMP68 < RX10_TEMP69 ; 
if ( RX10_TEMP70 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP71 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP71 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP72 = (/*VALUE ARRAY*/ int32_t * ) col .contents ; 
const int32_t X10_TEMP41 = RX10_TEMP72 [ RX10_TEMP68 ] 
; 
struct Point1 RX10_TEMP73  ; 
Point1_Point1( &RX10_TEMP73/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP41 ) ; 
struct Region1 RX10_TEMP74 = x .regionValue ; 
const int32_t RX10_TEMP75 = searchPointInRegion1 ( RX10_TEMP74 , RX10_TEMP73 ) ; 
const int32_t RX10_TEMP76 = 0 ; 
const uint32_t RX10_TEMP77 = RX10_TEMP75 < RX10_TEMP76 ; 
if ( RX10_TEMP77 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP78 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ double * const RX10_TEMP79 = (/*VALUE ARRAY*/ double * ) x .contents ; 
const double X10_TEMP43 = RX10_TEMP79 [ RX10_TEMP75 ] 
; 
struct Region1 RX10_TEMP80 = val .regionValue ; 
const int32_t RX10_TEMP81 = searchPointInRegion1 ( RX10_TEMP80 , i ) ; 
const int32_t RX10_TEMP82 = 0 ; 
const uint32_t RX10_TEMP83 = RX10_TEMP81 < RX10_TEMP82 ; 
if ( RX10_TEMP83 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP84 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP84 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ double * const RX10_TEMP85 = (/*VALUE ARRAY*/ double * ) val .contents ; 
const double X10_TEMP44 = RX10_TEMP85 [ RX10_TEMP81 ] 
; 
const double X10_TEMP46 = X10_TEMP43 * X10_TEMP44 ; 
const double X10_TEMP48 = X10_TEMP45 + X10_TEMP46 ; 
const double X10_TEMP49 = X10_TEMP48 ; 
struct Point1 RX10_TEMP86  ; 
Point1_Point1( &RX10_TEMP86/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP35 ) ; 
struct Dist1 RX10_TEMP87 = y .distValue ; 
struct Region1 RX10_TEMP88 = RX10_TEMP87 .dReg ; 
const int32_t RX10_TEMP89 = searchPointInRegion1 ( RX10_TEMP88 , RX10_TEMP86 ) ; 
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
char * RX10_TEMP94 = "Bad place access for array y" ; 
fprintf(stderr, "%s",RX10_TEMP94 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( y , RX10_TEMP89 , X10_TEMP49 ) ; 
} 
} 

void /*static*/thread42 (  struct T42 const utmpz ) 
{ 
struct doubleStub RX10_TEMP113 = utmpz .RX10_TEMP113 ; 
const int32_t RX10_TEMP104 = utmpz .RX10_TEMP104 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP103 = utmpz .RX10_TEMP103 ; 

{ 
RX10_TEMP103 [ RX10_TEMP104 ] = ( RX10_TEMP113 ) ; 
} 
} 

void /*static*/thread43 (  struct T43 const utmpz ) 
{ 
const double temp = utmpz .temp ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 

{ 
const int32_t X10_TEMP80 = 0 ; 
const double X10_TEMP82 = temp ; 
struct Point1 RX10_TEMP155  ; 
Point1_Point1( &RX10_TEMP155/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP80 ) ; 
struct Dist1 RX10_TEMP156 = tempref .distValue ; 
struct Region1 RX10_TEMP157 = RX10_TEMP156 .dReg ; 
const int32_t RX10_TEMP158 = searchPointInRegion1 ( RX10_TEMP157 , RX10_TEMP155 ) ; 
const int32_t RX10_TEMP159 = 0 ; 
const uint32_t RX10_TEMP160 = RX10_TEMP158 < RX10_TEMP159 ; 
if ( RX10_TEMP160 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP161 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP161 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP162 = getPlaceFromDist1 ( RX10_TEMP156 , RX10_TEMP158 ) ; 
const place_t RX10_TEMP164 = /* here  */ _here(); 
const uint32_t RX10_TEMP165 = RX10_TEMP162 != RX10_TEMP164 ; 
if ( RX10_TEMP165 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP163 = "Bad place access for array tempref" ; 
fprintf(stderr, "%s",RX10_TEMP163 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( tempref , RX10_TEMP158 , X10_TEMP82 ) ; 
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

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP27 ) 
{ 
T2THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T2THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T2THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T2THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP48 ) 
{ 
T3THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T3THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T3THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T3THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP111 , const place_t a_RX10_TEMP107 , const int32_t a_RX10_TEMP106 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP105 ) 
{ 
T4THIS->RX10_TEMP111 = ( a_RX10_TEMP111 ) ; 
T4THIS->RX10_TEMP107 = ( a_RX10_TEMP107 ) ; 
T4THIS->RX10_TEMP106 = ( a_RX10_TEMP106 ) ; 
T4THIS->RX10_TEMP105 = ( a_RX10_TEMP105 ) ; 

 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP153 , const place_t a_RX10_TEMP149 , const int32_t a_RX10_TEMP148 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP147 ) 
{ 
T5THIS->RX10_TEMP153 = ( a_RX10_TEMP153 ) ; 
T5THIS->RX10_TEMP149 = ( a_RX10_TEMP149 ) ; 
T5THIS->RX10_TEMP148 = ( a_RX10_TEMP148 ) ; 
T5THIS->RX10_TEMP147 = ( a_RX10_TEMP147 ) ; 

 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_RX10_TEMP173 , const place_t a_RX10_TEMP169 , const int32_t a_RX10_TEMP168 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP167 ) 
{ 
T6THIS->RX10_TEMP173 = ( a_RX10_TEMP173 ) ; 
T6THIS->RX10_TEMP169 = ( a_RX10_TEMP169 ) ; 
T6THIS->RX10_TEMP168 = ( a_RX10_TEMP168 ) ; 
T6THIS->RX10_TEMP167 = ( a_RX10_TEMP167 ) ; 

 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP193 , const place_t a_RX10_TEMP189 , const int32_t a_RX10_TEMP188 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP187 ) 
{ 
T7THIS->RX10_TEMP193 = ( a_RX10_TEMP193 ) ; 
T7THIS->RX10_TEMP189 = ( a_RX10_TEMP189 ) ; 
T7THIS->RX10_TEMP188 = ( a_RX10_TEMP188 ) ; 
T7THIS->RX10_TEMP187 = ( a_RX10_TEMP187 ) ; 

 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, const int32_t a_RX10_TEMP213 , const place_t a_RX10_TEMP209 , const int32_t a_RX10_TEMP208 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP207 ) 
{ 
T8THIS->RX10_TEMP213 = ( a_RX10_TEMP213 ) ; 
T8THIS->RX10_TEMP209 = ( a_RX10_TEMP209 ) ; 
T8THIS->RX10_TEMP208 = ( a_RX10_TEMP208 ) ; 
T8THIS->RX10_TEMP207 = ( a_RX10_TEMP207 ) ; 

 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, const int32_t a_RX10_TEMP233 , const place_t a_RX10_TEMP229 , const int32_t a_RX10_TEMP228 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP227 ) 
{ 
T9THIS->RX10_TEMP233 = ( a_RX10_TEMP233 ) ; 
T9THIS->RX10_TEMP229 = ( a_RX10_TEMP229 ) ; 
T9THIS->RX10_TEMP228 = ( a_RX10_TEMP228 ) ; 
T9THIS->RX10_TEMP227 = ( a_RX10_TEMP227 ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS, const int32_t a_RX10_TEMP253 , const place_t a_RX10_TEMP249 , const int32_t a_RX10_TEMP248 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP247 ) 
{ 
T10THIS->RX10_TEMP253 = ( a_RX10_TEMP253 ) ; 
T10THIS->RX10_TEMP249 = ( a_RX10_TEMP249 ) ; 
T10THIS->RX10_TEMP248 = ( a_RX10_TEMP248 ) ; 
T10THIS->RX10_TEMP247 = ( a_RX10_TEMP247 ) ; 

 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS, const int32_t a_RX10_TEMP273 , const place_t a_RX10_TEMP269 , const int32_t a_RX10_TEMP268 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP267 ) 
{ 
T11THIS->RX10_TEMP273 = ( a_RX10_TEMP273 ) ; 
T11THIS->RX10_TEMP269 = ( a_RX10_TEMP269 ) ; 
T11THIS->RX10_TEMP268 = ( a_RX10_TEMP268 ) ; 
T11THIS->RX10_TEMP267 = ( a_RX10_TEMP267 ) ; 

 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS, const int32_t a_RX10_TEMP293 , const place_t a_RX10_TEMP289 , const int32_t a_RX10_TEMP288 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP287 ) 
{ 
T12THIS->RX10_TEMP293 = ( a_RX10_TEMP293 ) ; 
T12THIS->RX10_TEMP289 = ( a_RX10_TEMP289 ) ; 
T12THIS->RX10_TEMP288 = ( a_RX10_TEMP288 ) ; 
T12THIS->RX10_TEMP287 = ( a_RX10_TEMP287 ) ; 

 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, const int32_t a_RX10_TEMP313 , const place_t a_RX10_TEMP309 , const int32_t a_RX10_TEMP308 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP307 ) 
{ 
T13THIS->RX10_TEMP313 = ( a_RX10_TEMP313 ) ; 
T13THIS->RX10_TEMP309 = ( a_RX10_TEMP309 ) ; 
T13THIS->RX10_TEMP308 = ( a_RX10_TEMP308 ) ; 
T13THIS->RX10_TEMP307 = ( a_RX10_TEMP307 ) ; 

 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, const int32_t a_RX10_TEMP333 , const place_t a_RX10_TEMP329 , const int32_t a_RX10_TEMP328 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP327 ) 
{ 
T14THIS->RX10_TEMP333 = ( a_RX10_TEMP333 ) ; 
T14THIS->RX10_TEMP329 = ( a_RX10_TEMP329 ) ; 
T14THIS->RX10_TEMP328 = ( a_RX10_TEMP328 ) ; 
T14THIS->RX10_TEMP327 = ( a_RX10_TEMP327 ) ; 

 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, const int32_t a_RX10_TEMP353 , const place_t a_RX10_TEMP349 , const int32_t a_RX10_TEMP348 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP347 ) 
{ 
T15THIS->RX10_TEMP353 = ( a_RX10_TEMP353 ) ; 
T15THIS->RX10_TEMP349 = ( a_RX10_TEMP349 ) ; 
T15THIS->RX10_TEMP348 = ( a_RX10_TEMP348 ) ; 
T15THIS->RX10_TEMP347 = ( a_RX10_TEMP347 ) ; 

 return  *T15THIS; 

} 

T16 T16_T16 ( struct T16 *T16THIS, const int32_t a_RX10_TEMP373 , const place_t a_RX10_TEMP369 , const int32_t a_RX10_TEMP368 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP367 ) 
{ 
T16THIS->RX10_TEMP373 = ( a_RX10_TEMP373 ) ; 
T16THIS->RX10_TEMP369 = ( a_RX10_TEMP369 ) ; 
T16THIS->RX10_TEMP368 = ( a_RX10_TEMP368 ) ; 
T16THIS->RX10_TEMP367 = ( a_RX10_TEMP367 ) ; 

 return  *T16THIS; 

} 

T17 T17_T17 ( struct T17 *T17THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T17THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T17THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T17THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T17THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T17THIS; 

} 

T18 T18_T18 ( struct T18 *T18THIS,  struct Point1 const a_id1 ,  struct intValArray1 const a_highsum ,  struct intValArray1 const a_lowsum , const int32_t a_NUM_ITERATIONS ,  struct doubleValArray1 const a_x ,  struct intValArray1 const a_col ,  struct intValArray1 const a_row ,  struct doubleValArray1 const a_val ,  struct doubleRefArray1 const a_y ) 
{ 
T18THIS->id1 = ( a_id1 ) ; 
T18THIS->highsum = ( a_highsum ) ; 
T18THIS->lowsum = ( a_lowsum ) ; 
T18THIS->NUM_ITERATIONS = ( a_NUM_ITERATIONS ) ; 
T18THIS->x = ( a_x ) ; 
T18THIS->col = ( a_col ) ; 
T18THIS->row = ( a_row ) ; 
T18THIS->val = ( a_val ) ; 
T18THIS->y = ( a_y ) ; 

 return  *T18THIS; 

} 

T19 T19_T19 ( struct T19 *T19THIS, const int32_t a_RX10_TEMP109 , const place_t a_RX10_TEMP105 , const int32_t a_RX10_TEMP104 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP103 ) 
{ 
T19THIS->RX10_TEMP109 = ( a_RX10_TEMP109 ) ; 
T19THIS->RX10_TEMP105 = ( a_RX10_TEMP105 ) ; 
T19THIS->RX10_TEMP104 = ( a_RX10_TEMP104 ) ; 
T19THIS->RX10_TEMP103 = ( a_RX10_TEMP103 ) ; 

 return  *T19THIS; 

} 

T20 T20_T20 ( struct T20 *T20THIS,  struct Point1 const a_i ,  struct doubleRefArray1 const a_tempref , const place_t a_curr_place ,  struct intValArray1 const a_row ,  struct doubleRefArray1 const a_y ) 
{ 
T20THIS->i = ( a_i ) ; 
T20THIS->tempref = ( a_tempref ) ; 
T20THIS->curr_place = ( a_curr_place ) ; 
T20THIS->row = ( a_row ) ; 
T20THIS->y = ( a_y ) ; 

 return  *T20THIS; 

} 

T21 T21_T21 ( struct T21 *T21THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T21THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T21THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T21THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T21THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T21THIS->THIS = *TimerTHIS;
 return  *T21THIS; 

} 

T22 T22_T22 ( struct T22 *T22THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T22THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T22THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T22THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T22THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T22THIS->THIS = *TimerTHIS;
 return  *T22THIS; 

} 

T23 T23_T23 ( struct T23 *T23THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T23THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T23THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T23THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T23THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T23THIS->THIS = *TimerTHIS;
 return  *T23THIS; 

} 

T24 T24_T24 ( struct T24 *T24THIS,  struct intStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T24THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T24THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T24THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T24THIS; 

} 

T25 T25_T25 ( struct T25 *T25THIS,  struct intStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP27 ) 
{ 
T25THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T25THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T25THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 

 return  *T25THIS; 

} 

T26 T26_T26 ( struct T26 *T26THIS,  struct intStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP48 ) 
{ 
T26THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T26THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T26THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 

 return  *T26THIS; 

} 

T27 T27_T27 ( struct T27 *T27THIS,  struct doubleStub const a_RX10_TEMP114 , const int32_t a_RX10_TEMP106 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP105 ) 
{ 
T27THIS->RX10_TEMP114 = ( a_RX10_TEMP114 ) ; 
T27THIS->RX10_TEMP106 = ( a_RX10_TEMP106 ) ; 
T27THIS->RX10_TEMP105 = ( a_RX10_TEMP105 ) ; 

 return  *T27THIS; 

} 

T28 T28_T28 ( struct T28 *T28THIS,  struct doubleStub const a_RX10_TEMP156 , const int32_t a_RX10_TEMP148 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP147 ) 
{ 
T28THIS->RX10_TEMP156 = ( a_RX10_TEMP156 ) ; 
T28THIS->RX10_TEMP148 = ( a_RX10_TEMP148 ) ; 
T28THIS->RX10_TEMP147 = ( a_RX10_TEMP147 ) ; 

 return  *T28THIS; 

} 

T29 T29_T29 ( struct T29 *T29THIS,  struct intStub const a_RX10_TEMP176 , const int32_t a_RX10_TEMP168 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP167 ) 
{ 
T29THIS->RX10_TEMP176 = ( a_RX10_TEMP176 ) ; 
T29THIS->RX10_TEMP168 = ( a_RX10_TEMP168 ) ; 
T29THIS->RX10_TEMP167 = ( a_RX10_TEMP167 ) ; 

 return  *T29THIS; 

} 

T30 T30_T30 ( struct T30 *T30THIS,  struct intStub const a_RX10_TEMP196 , const int32_t a_RX10_TEMP188 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP187 ) 
{ 
T30THIS->RX10_TEMP196 = ( a_RX10_TEMP196 ) ; 
T30THIS->RX10_TEMP188 = ( a_RX10_TEMP188 ) ; 
T30THIS->RX10_TEMP187 = ( a_RX10_TEMP187 ) ; 

 return  *T30THIS; 

} 

T31 T31_T31 ( struct T31 *T31THIS,  struct intStub const a_RX10_TEMP216 , const int32_t a_RX10_TEMP208 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP207 ) 
{ 
T31THIS->RX10_TEMP216 = ( a_RX10_TEMP216 ) ; 
T31THIS->RX10_TEMP208 = ( a_RX10_TEMP208 ) ; 
T31THIS->RX10_TEMP207 = ( a_RX10_TEMP207 ) ; 

 return  *T31THIS; 

} 

T32 T32_T32 ( struct T32 *T32THIS,  struct intStub const a_RX10_TEMP236 , const int32_t a_RX10_TEMP228 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP227 ) 
{ 
T32THIS->RX10_TEMP236 = ( a_RX10_TEMP236 ) ; 
T32THIS->RX10_TEMP228 = ( a_RX10_TEMP228 ) ; 
T32THIS->RX10_TEMP227 = ( a_RX10_TEMP227 ) ; 

 return  *T32THIS; 

} 

T33 T33_T33 ( struct T33 *T33THIS,  struct doubleStub const a_RX10_TEMP256 , const int32_t a_RX10_TEMP248 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP247 ) 
{ 
T33THIS->RX10_TEMP256 = ( a_RX10_TEMP256 ) ; 
T33THIS->RX10_TEMP248 = ( a_RX10_TEMP248 ) ; 
T33THIS->RX10_TEMP247 = ( a_RX10_TEMP247 ) ; 

 return  *T33THIS; 

} 

T34 T34_T34 ( struct T34 *T34THIS,  struct intStub const a_RX10_TEMP276 , const int32_t a_RX10_TEMP268 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP267 ) 
{ 
T34THIS->RX10_TEMP276 = ( a_RX10_TEMP276 ) ; 
T34THIS->RX10_TEMP268 = ( a_RX10_TEMP268 ) ; 
T34THIS->RX10_TEMP267 = ( a_RX10_TEMP267 ) ; 

 return  *T34THIS; 

} 

T35 T35_T35 ( struct T35 *T35THIS,  struct intStub const a_RX10_TEMP296 , const int32_t a_RX10_TEMP288 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP287 ) 
{ 
T35THIS->RX10_TEMP296 = ( a_RX10_TEMP296 ) ; 
T35THIS->RX10_TEMP288 = ( a_RX10_TEMP288 ) ; 
T35THIS->RX10_TEMP287 = ( a_RX10_TEMP287 ) ; 

 return  *T35THIS; 

} 

T36 T36_T36 ( struct T36 *T36THIS,  struct intStub const a_RX10_TEMP316 , const int32_t a_RX10_TEMP308 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP307 ) 
{ 
T36THIS->RX10_TEMP316 = ( a_RX10_TEMP316 ) ; 
T36THIS->RX10_TEMP308 = ( a_RX10_TEMP308 ) ; 
T36THIS->RX10_TEMP307 = ( a_RX10_TEMP307 ) ; 

 return  *T36THIS; 

} 

T37 T37_T37 ( struct T37 *T37THIS,  struct doubleStub const a_RX10_TEMP336 , const int32_t a_RX10_TEMP328 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP327 ) 
{ 
T37THIS->RX10_TEMP336 = ( a_RX10_TEMP336 ) ; 
T37THIS->RX10_TEMP328 = ( a_RX10_TEMP328 ) ; 
T37THIS->RX10_TEMP327 = ( a_RX10_TEMP327 ) ; 

 return  *T37THIS; 

} 

T38 T38_T38 ( struct T38 *T38THIS,  struct intStub const a_RX10_TEMP356 , const int32_t a_RX10_TEMP348 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP347 ) 
{ 
T38THIS->RX10_TEMP356 = ( a_RX10_TEMP356 ) ; 
T38THIS->RX10_TEMP348 = ( a_RX10_TEMP348 ) ; 
T38THIS->RX10_TEMP347 = ( a_RX10_TEMP347 ) ; 

 return  *T38THIS; 

} 

T39 T39_T39 ( struct T39 *T39THIS,  struct intStub const a_RX10_TEMP376 , const int32_t a_RX10_TEMP368 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP367 ) 
{ 
T39THIS->RX10_TEMP376 = ( a_RX10_TEMP376 ) ; 
T39THIS->RX10_TEMP368 = ( a_RX10_TEMP368 ) ; 
T39THIS->RX10_TEMP367 = ( a_RX10_TEMP367 ) ; 

 return  *T39THIS; 

} 

T40 T40_T40 ( struct T40 *T40THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T40THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T40THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T40THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T40THIS; 

} 

T41 T41_T41 ( struct T41 *T41THIS,  struct Point1 const a_i ,  struct doubleValArray1 const a_x ,  struct intValArray1 const a_col ,  struct intValArray1 const a_row ,  struct doubleValArray1 const a_val ,  struct doubleRefArray1 const a_y ) 
{ 
T41THIS->i = ( a_i ) ; 
T41THIS->x = ( a_x ) ; 
T41THIS->col = ( a_col ) ; 
T41THIS->row = ( a_row ) ; 
T41THIS->val = ( a_val ) ; 
T41THIS->y = ( a_y ) ; 

 return  *T41THIS; 

} 

T42 T42_T42 ( struct T42 *T42THIS,  struct doubleStub const a_RX10_TEMP113 , const int32_t a_RX10_TEMP104 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP103 ) 
{ 
T42THIS->RX10_TEMP113 = ( a_RX10_TEMP113 ) ; 
T42THIS->RX10_TEMP104 = ( a_RX10_TEMP104 ) ; 
T42THIS->RX10_TEMP103 = ( a_RX10_TEMP103 ) ; 

 return  *T42THIS; 

} 

T43 T43_T43 ( struct T43 *T43THIS, const double a_temp ,  struct doubleRefArray1 const a_tempref ) 
{ 
T43THIS->temp = ( a_temp ) ; 
T43THIS->tempref = ( a_tempref ) ; 

 return  *T43THIS; 

} 

T44 T44_T44 ( struct T44 *T44THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T44THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T44THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T44THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T44THIS->THIS = *TimerTHIS;
 return  *T44THIS; 

} 

T45 T45_T45 ( struct T45 *T45THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T45THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T45THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T45THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T45THIS->THIS = *TimerTHIS;
 return  *T45THIS; 

} 

T46 T46_T46 ( struct T46 *T46THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T46THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T46THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T46THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T46THIS->THIS = *TimerTHIS;
 return  *T46THIS; 

} 

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray1THIS->distValue = ( distValue_ ) ; 
doubleRefArray1THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray1THIS; 

} 

doubleValArray1 doubleValArray1_doubleValArray1 ( struct doubleValArray1 *doubleValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ double * const contents_ ) 
{ 
doubleValArray1THIS->regionValue = ( regionValue_ ) ; 
doubleValArray1THIS->contents = ( contents_ ) ; 

 return  *doubleValArray1THIS; 

} 

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist1THIS->dReg = ( dReg_ ) ; 
Dist1THIS->dDist = ( dDist_ ) ; 

 return  *Dist1THIS; 

} 

SparseMatmult *SparseMatmult_SparseMatmult ( struct SparseMatmult *SparseMatmultTHIS) 
{ 
const int32_t X10_TEMP2 = /* place.MAX_PLACES  */ _max_places(); 
const int32_t X10_TEMP3 = X10_TEMP2 ; 
SparseMatmultTHIS->nthreads = ( X10_TEMP3 ) ; 

 return  SparseMatmultTHIS; 

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
void * TEMPCALLOCPOINTER133;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER133 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER133)[0] = RX10_TEMP5, TEMPCALLOCPOINTER133 = ((int32_t * )TEMPCALLOCPOINTER133)+1, memset(TEMPCALLOCPOINTER133,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T21 utmp21  ; 
T21_T21( &utmp21/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC40) ;
a.size = sizeof(utmp21 );
a.params = (void *)(&utmp21 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER134;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER134 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER134)[0] = RX10_TEMP4, TEMPCALLOCPOINTER134 = ((int32_t * )TEMPCALLOCPOINTER134)+1, memset(TEMPCALLOCPOINTER134,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER135;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER135 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER135)[0] = RX10_TEMP26, TEMPCALLOCPOINTER135 = ((int32_t * )TEMPCALLOCPOINTER135)+1, memset(TEMPCALLOCPOINTER135,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T22 utmp22  ; 
T22_T22( &utmp22/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC41) ;
a.size = sizeof(utmp22 );
a.params = (void *)(&utmp22 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER136;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER136 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER136)[0] = RX10_TEMP25, TEMPCALLOCPOINTER136 = ((int32_t * )TEMPCALLOCPOINTER136)+1, memset(TEMPCALLOCPOINTER136,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER137;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER137 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER137)[0] = RX10_TEMP47, TEMPCALLOCPOINTER137 = ((int32_t * )TEMPCALLOCPOINTER137)+1, memset(TEMPCALLOCPOINTER137,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T23 utmp23  ; 
T23_T23( &utmp23/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC42) ;
a.size = sizeof(utmp23 );
a.params = (void *)(&utmp23 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER138;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER138 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER138)[0] = RX10_TEMP46, TEMPCALLOCPOINTER138 = ((int32_t * )TEMPCALLOCPOINTER138)+1, memset(TEMPCALLOCPOINTER138,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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

void thread21 ( struct Timer *TimerTHIS,  struct T21 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER140;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER140 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER140)[0] = RX10_TEMP14, TEMPCALLOCPOINTER140 = ((int32_t * )TEMPCALLOCPOINTER140)+1, memset(TEMPCALLOCPOINTER140,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T44 utmp44  ; 
T44_T44( &utmp44/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC43) ;
a.size = sizeof(utmp44 );
a.params = (void *)(&utmp44 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread22 ( struct Timer *TimerTHIS,  struct T22 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER142;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER142 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER142)[0] = RX10_TEMP35, TEMPCALLOCPOINTER142 = ((int32_t * )TEMPCALLOCPOINTER142)+1, memset(TEMPCALLOCPOINTER142,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T45 utmp45  ; 
T45_T45( &utmp45/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC44) ;
a.size = sizeof(utmp45 );
a.params = (void *)(&utmp45 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread23 ( struct Timer *TimerTHIS,  struct T23 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER144;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER144 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER144)[0] = RX10_TEMP56, TEMPCALLOCPOINTER144 = ((int32_t * )TEMPCALLOCPOINTER144)+1, memset(TEMPCALLOCPOINTER144,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T46 utmp46  ; 
T46_T46( &utmp46/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC45) ;
a.size = sizeof(utmp46 );
a.params = (void *)(&utmp46 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread44 ( struct Timer *TimerTHIS,  struct T44 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread45 ( struct Timer *TimerTHIS,  struct T45 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread46 ( struct Timer *TimerTHIS,  struct T46 const utmpz ) 
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

intValArray1 intValArray1_intValArray1 ( struct intValArray1 *intValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ int32_t * const contents_ ) 
{ 
intValArray1THIS->regionValue = ( regionValue_ ) ; 
intValArray1THIS->contents = ( contents_ ) ; 

 return  *intValArray1THIS; 

} 

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

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
void * TEMPCALLOCPOINTER148;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER148 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(countDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER148)[0] = countDist, TEMPCALLOCPOINTER148 = ((int32_t * )TEMPCALLOCPOINTER148)+1, memset(TEMPCALLOCPOINTER148,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER149;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER149 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(runSumDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER149)[0] = runSumDist, TEMPCALLOCPOINTER149 = ((int32_t * )TEMPCALLOCPOINTER149)+1, memset(TEMPCALLOCPOINTER149,0,runSumDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER150;
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

Random *Random_Random ( struct Random *RandomTHIS, const int64_t rseed ) 
{ 
Random_setSeed ( RandomTHIS, rseed ) ; 

 return  RandomTHIS; 

} 
Random* Random_Random_0(struct Random *RandomTHIS){return RandomTHIS;}

void Random_setSeed ( struct Random *RandomTHIS, const int64_t rseed ) 
{ 
const int64_t X10_TEMP1 = /*program*/_Random_multiplier ; 
const int64_t X10_TEMP3 = rseed ^ X10_TEMP1 ; 
const int64_t X10_TEMP4 = /*program*/_Random_mask ; 
const int64_t X10_TEMP6 = X10_TEMP3 & X10_TEMP4 ; 
RandomTHIS->seed = ( X10_TEMP6 ) ; 
} 

/* class RunMain */ int32_t  runmain( ) 
{ 
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_SparseMatmult_RANDOM_SEED = _SparseMatmult_RANDOM_SEED_init ( ) ; 
_SparseMatmult_SPARSE_NUM_ITER = _SparseMatmult_SPARSE_NUM_ITER_init ( ) ; 
_SparseMatmult_R = _SparseMatmult_R_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
_SparseMatmult_RANDOM_SEED = _SparseMatmult_RANDOM_SEED_init ( ) ; 
_SparseMatmult_SPARSE_NUM_ITER = _SparseMatmult_SPARSE_NUM_ITER_init ( ) ; 
_SparseMatmult_R = _SparseMatmult_R_init ( ) ; 

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
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(*(struct T14 * const )params);
		break;
	 case ASYNC14 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(*(struct T15 * const )params);
		break;
	 case ASYNC15 :
		 fixPointerT16(((struct T16 * const )params), (params+sizeof(struct T16)));
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC16 :
		 fixPointerT17(((struct T17 * const )params), (params+sizeof(struct T17)));
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC17 :
		 fixPointerT18(((struct T18 * const )params), (params+sizeof(struct T18)));
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC18 :
		 fixPointerT19(((struct T19 * const )params), (params+sizeof(struct T19)));
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC19 :
		 fixPointerT20(((struct T20 * const )params), (params+sizeof(struct T20)));
		thread20(*(struct T20 * const )params);
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
		 fixPointerT26(((struct T26 * const )params), (params+sizeof(struct T26)));
		thread26(*(struct T26 * const )params);
		break;
	 case ASYNC23 :
		 fixPointerT27(((struct T27 * const )params), (params+sizeof(struct T27)));
		thread27(*(struct T27 * const )params);
		break;
	 case ASYNC24 :
		 fixPointerT28(((struct T28 * const )params), (params+sizeof(struct T28)));
		thread28(*(struct T28 * const )params);
		break;
	 case ASYNC25 :
		 fixPointerT29(((struct T29 * const )params), (params+sizeof(struct T29)));
		thread29(*(struct T29 * const )params);
		break;
	 case ASYNC26 :
		 fixPointerT30(((struct T30 * const )params), (params+sizeof(struct T30)));
		thread30(*(struct T30 * const )params);
		break;
	 case ASYNC27 :
		 fixPointerT31(((struct T31 * const )params), (params+sizeof(struct T31)));
		thread31(*(struct T31 * const )params);
		break;
	 case ASYNC28 :
		 fixPointerT32(((struct T32 * const )params), (params+sizeof(struct T32)));
		thread32(*(struct T32 * const )params);
		break;
	 case ASYNC29 :
		 fixPointerT33(((struct T33 * const )params), (params+sizeof(struct T33)));
		thread33(*(struct T33 * const )params);
		break;
	 case ASYNC30 :
		 fixPointerT34(((struct T34 * const )params), (params+sizeof(struct T34)));
		thread34(*(struct T34 * const )params);
		break;
	 case ASYNC31 :
		 fixPointerT35(((struct T35 * const )params), (params+sizeof(struct T35)));
		thread35(*(struct T35 * const )params);
		break;
	 case ASYNC32 :
		 fixPointerT36(((struct T36 * const )params), (params+sizeof(struct T36)));
		thread36(*(struct T36 * const )params);
		break;
	 case ASYNC33 :
		 fixPointerT37(((struct T37 * const )params), (params+sizeof(struct T37)));
		thread37(*(struct T37 * const )params);
		break;
	 case ASYNC34 :
		 fixPointerT38(((struct T38 * const )params), (params+sizeof(struct T38)));
		thread38(*(struct T38 * const )params);
		break;
	 case ASYNC35 :
		 fixPointerT39(((struct T39 * const )params), (params+sizeof(struct T39)));
		thread39(*(struct T39 * const )params);
		break;
	 case ASYNC36 :
		 fixPointerT40(((struct T40 * const )params), (params+sizeof(struct T40)));
		thread40(*(struct T40 * const )params);
		break;
	 case ASYNC37 :
		 fixPointerT41(((struct T41 * const )params), (params+sizeof(struct T41)));
		thread41(*(struct T41 * const )params);
		break;
	 case ASYNC38 :
		 fixPointerT42(((struct T42 * const )params), (params+sizeof(struct T42)));
		thread42(*(struct T42 * const )params);
		break;
	 case ASYNC39 :
		 fixPointerT43(((struct T43 * const )params), (params+sizeof(struct T43)));
		thread43(*(struct T43 * const )params);
		break;
	 case ASYNC40 :
		 fixPointerT21(((struct T21 * const )params), (params+sizeof(struct T21)));
		thread21(&(*((struct T21 * const )params)).THIS, *((struct T21 * const )params));
		break;
	 case ASYNC41 :
		 fixPointerT22(((struct T22 * const )params), (params+sizeof(struct T22)));
		thread22(&(*((struct T22 * const )params)).THIS, *((struct T22 * const )params));
		break;
	 case ASYNC42 :
		 fixPointerT23(((struct T23 * const )params), (params+sizeof(struct T23)));
		thread23(&(*((struct T23 * const )params)).THIS, *((struct T23 * const )params));
		break;
	 case ASYNC43 :
		 fixPointerT44(((struct T44 * const )params), (params+sizeof(struct T44)));
		thread44(&(*((struct T44 * const )params)).THIS, *((struct T44 * const )params));
		break;
	 case ASYNC44 :
		 fixPointerT45(((struct T45 * const )params), (params+sizeof(struct T45)));
		thread45(&(*((struct T45 * const )params)).THIS, *((struct T45 * const )params));
		break;
	 case ASYNC45 :
		 fixPointerT46(((struct T46 * const )params), (params+sizeof(struct T46)));
		thread46(&(*((struct T46 * const )params)).THIS, *((struct T46 * const )params));
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
		thread14(*(struct T14 * const )params);
		break;
	 case ASYNC14 :
		thread15(*(struct T15 * const )params);
		break;
	 case ASYNC15 :
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC16 :
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC17 :
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC18 :
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC19 :
		thread20(*(struct T20 * const )params);
		break;
	 case ASYNC20 :
		thread24(*(struct T24 * const )params);
		break;
	 case ASYNC21 :
		thread25(*(struct T25 * const )params);
		break;
	 case ASYNC22 :
		thread26(*(struct T26 * const )params);
		break;
	 case ASYNC23 :
		thread27(*(struct T27 * const )params);
		break;
	 case ASYNC24 :
		thread28(*(struct T28 * const )params);
		break;
	 case ASYNC25 :
		thread29(*(struct T29 * const )params);
		break;
	 case ASYNC26 :
		thread30(*(struct T30 * const )params);
		break;
	 case ASYNC27 :
		thread31(*(struct T31 * const )params);
		break;
	 case ASYNC28 :
		thread32(*(struct T32 * const )params);
		break;
	 case ASYNC29 :
		thread33(*(struct T33 * const )params);
		break;
	 case ASYNC30 :
		thread34(*(struct T34 * const )params);
		break;
	 case ASYNC31 :
		thread35(*(struct T35 * const )params);
		break;
	 case ASYNC32 :
		thread36(*(struct T36 * const )params);
		break;
	 case ASYNC33 :
		thread37(*(struct T37 * const )params);
		break;
	 case ASYNC34 :
		thread38(*(struct T38 * const )params);
		break;
	 case ASYNC35 :
		thread39(*(struct T39 * const )params);
		break;
	 case ASYNC36 :
		thread40(*(struct T40 * const )params);
		break;
	 case ASYNC37 :
		thread41(*(struct T41 * const )params);
		break;
	 case ASYNC38 :
		thread42(*(struct T42 * const )params);
		break;
	 case ASYNC39 :
		thread43(*(struct T43 * const )params);
		break;
	 case ASYNC40 :
		thread21(&(*((struct T21 * const )params)).THIS, *((struct T21 * const )params));
		break;
	 case ASYNC41 :
		thread22(&(*((struct T22 * const )params)).THIS, *((struct T22 * const )params));
		break;
	 case ASYNC42 :
		thread23(&(*((struct T23 * const )params)).THIS, *((struct T23 * const )params));
		break;
	 case ASYNC43 :
		thread44(&(*((struct T44 * const )params)).THIS, *((struct T44 * const )params));
		break;
	 case ASYNC44 :
		thread45(&(*((struct T45 * const )params)).THIS, *((struct T45 * const )params));
		break;
	 case ASYNC45 :
		thread46(&(*((struct T46 * const )params)).THIS, *((struct T46 * const )params));
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
	 case ASYNC15 :
		 sizeToMalloc = child.size+ getSizeOfT16((struct T16 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT16((struct T16 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC16 :
		 sizeToMalloc = child.size+ getSizeOfT17((struct T17 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT17((struct T17 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC17 :
		 sizeToMalloc = child.size+ getSizeOfT18((struct T18 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT18((struct T18 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC18 :
		 sizeToMalloc = child.size+ getSizeOfT19((struct T19 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT19((struct T19 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC19 :
		 sizeToMalloc = child.size+ getSizeOfT20((struct T20 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT20((struct T20 * const )child.params,(buf+headerSize+child.size));
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
		 sizeToMalloc = child.size+ getSizeOfT26((struct T26 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT26((struct T26 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC23 :
		 sizeToMalloc = child.size+ getSizeOfT27((struct T27 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT27((struct T27 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC24 :
		 sizeToMalloc = child.size+ getSizeOfT28((struct T28 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT28((struct T28 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC25 :
		 sizeToMalloc = child.size+ getSizeOfT29((struct T29 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT29((struct T29 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC26 :
		 sizeToMalloc = child.size+ getSizeOfT30((struct T30 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT30((struct T30 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC27 :
		 sizeToMalloc = child.size+ getSizeOfT31((struct T31 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT31((struct T31 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC28 :
		 sizeToMalloc = child.size+ getSizeOfT32((struct T32 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT32((struct T32 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC29 :
		 sizeToMalloc = child.size+ getSizeOfT33((struct T33 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT33((struct T33 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC30 :
		 sizeToMalloc = child.size+ getSizeOfT34((struct T34 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT34((struct T34 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC31 :
		 sizeToMalloc = child.size+ getSizeOfT35((struct T35 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT35((struct T35 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC32 :
		 sizeToMalloc = child.size+ getSizeOfT36((struct T36 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT36((struct T36 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC33 :
		 sizeToMalloc = child.size+ getSizeOfT37((struct T37 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT37((struct T37 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC34 :
		 sizeToMalloc = child.size+ getSizeOfT38((struct T38 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT38((struct T38 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC35 :
		 sizeToMalloc = child.size+ getSizeOfT39((struct T39 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT39((struct T39 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC36 :
		 sizeToMalloc = child.size+ getSizeOfT40((struct T40 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT40((struct T40 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC37 :
		 sizeToMalloc = child.size+ getSizeOfT41((struct T41 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT41((struct T41 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC38 :
		 sizeToMalloc = child.size+ getSizeOfT42((struct T42 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT42((struct T42 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC39 :
		 sizeToMalloc = child.size+ getSizeOfT43((struct T43 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT43((struct T43 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC40 :
		 sizeToMalloc = child.size+ getSizeOfT21((struct T21 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT21((struct T21 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC41 :
		 sizeToMalloc = child.size+ getSizeOfT22((struct T22 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT22((struct T22 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC42 :
		 sizeToMalloc = child.size+ getSizeOfT23((struct T23 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT23((struct T23 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC43 :
		 sizeToMalloc = child.size+ getSizeOfT44((struct T44 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT44((struct T44 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC44 :
		 sizeToMalloc = child.size+ getSizeOfT45((struct T45 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT45((struct T45 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC45 :
		 sizeToMalloc = child.size+ getSizeOfT46((struct T46 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT46((struct T46 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 default:
 
	fprintf(stderr, "%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\n", _here());
	break;
}
}
int32_t getSizeOfdoubleValArray1( struct doubleValArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> regionValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(double);
return temp;
 }
int32_t getSizeOfdoubleStub( struct doubleStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfintValArray1( struct intValArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> regionValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(int32_t);
return temp;
 }
int32_t getSizeOfT29( struct T29 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP176));
return temp;
 }
int32_t getSizeOfT28( struct T28 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP156));
return temp;
 }
int32_t getSizeOfT27( struct T27 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP114));
return temp;
 }
int32_t getSizeOfT26( struct T26 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfT25( struct T25 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT24( struct T24 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT23( struct T23 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT22( struct T22 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT21( struct T21 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT20( struct T20 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> i));
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
    temp += getSizeOfintValArray1(&(className -> row));
    temp += getSizeOfdoubleRefArray1(&(className -> y));
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
int32_t getSizeOfPoint1( struct Point1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfintStub( struct intStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT38( struct T38 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP356));
return temp;
 }
int32_t getSizeOfT37( struct T37 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP336));
return temp;
 }
int32_t getSizeOfT39( struct T39 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP376));
return temp;
 }
int32_t getSizeOfT34( struct T34 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP276));
return temp;
 }
int32_t getSizeOfT33( struct T33 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP256));
return temp;
 }
int32_t getSizeOfT36( struct T36 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP316));
return temp;
 }
int32_t getSizeOfT35( struct T35 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP296));
return temp;
 }
int32_t getSizeOfT30( struct T30 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP196));
return temp;
 }
int32_t getSizeOfT32( struct T32 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP236));
return temp;
 }
int32_t getSizeOfT31( struct T31 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP216));
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
return temp;
 }
int32_t getSizeOfT43( struct T43 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> tempref));
return temp;
 }
int32_t getSizeOfT42( struct T42 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP113));
return temp;
 }
int32_t getSizeOfT41( struct T41 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> i));
    temp += getSizeOfdoubleValArray1(&(className -> x));
    temp += getSizeOfintValArray1(&(className -> col));
    temp += getSizeOfintValArray1(&(className -> row));
    temp += getSizeOfdoubleValArray1(&(className -> val));
    temp += getSizeOfdoubleRefArray1(&(className -> y));
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
int32_t getSizeOfT40( struct T40 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT46( struct T46 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfT45( struct T45 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT44( struct T44 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
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
return temp;
 }
int32_t getSizeOfT3( struct T3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT2( struct T2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT10( struct T10 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT11( struct T11 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT12( struct T12 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT13( struct T13 * className) {
    int32_t temp = 0;
    int32_t size = 0;
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
return temp;
 }
int32_t getSizeOfT18( struct T18 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> id1));
    temp += getSizeOfintValArray1(&(className -> highsum));
    temp += getSizeOfintValArray1(&(className -> lowsum));
    temp += getSizeOfdoubleValArray1(&(className -> x));
    temp += getSizeOfintValArray1(&(className -> col));
    temp += getSizeOfintValArray1(&(className -> row));
    temp += getSizeOfdoubleValArray1(&(className -> val));
    temp += getSizeOfdoubleRefArray1(&(className -> y));
return temp;
 }
int32_t getSizeOfT19( struct T19 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
void* deepCopydoubleValArray1( struct doubleValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> regionValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(double);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
return offset;
 }
void* deepCopydoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyintValArray1( struct intValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> regionValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(int32_t);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
return offset;
 }
void* deepCopyT29( struct T29 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP176), offset);
return offset;
 }
void* deepCopyT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP156), offset);
return offset;
 }
void* deepCopyT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP114), offset);
return offset;
 }
void* deepCopyT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopyT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> i), offset);
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
offset = deepCopyintValArray1(&(className -> row), offset);
offset = deepCopydoubleRefArray1(&(className -> y), offset);
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
void* deepCopyPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyintStub( struct intStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT38( struct T38 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP356), offset);
return offset;
 }
void* deepCopyT37( struct T37 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP336), offset);
return offset;
 }
void* deepCopyT39( struct T39 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP376), offset);
return offset;
 }
void* deepCopyT34( struct T34 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP276), offset);
return offset;
 }
void* deepCopyT33( struct T33 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP256), offset);
return offset;
 }
void* deepCopyT36( struct T36 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP316), offset);
return offset;
 }
void* deepCopyT35( struct T35 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP296), offset);
return offset;
 }
void* deepCopyT30( struct T30 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP196), offset);
return offset;
 }
void* deepCopyT32( struct T32 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP236), offset);
return offset;
 }
void* deepCopyT31( struct T31 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP216), offset);
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
return offset;
 }
void* deepCopyT43( struct T43 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void* deepCopyT42( struct T42 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP113), offset);
return offset;
 }
void* deepCopyT41( struct T41 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> i), offset);
offset = deepCopydoubleValArray1(&(className -> x), offset);
offset = deepCopyintValArray1(&(className -> col), offset);
offset = deepCopyintValArray1(&(className -> row), offset);
offset = deepCopydoubleValArray1(&(className -> val), offset);
offset = deepCopydoubleRefArray1(&(className -> y), offset);
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
void* deepCopyT40( struct T40 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT46( struct T46 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopyT45( struct T45 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT44( struct T44 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
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
return offset;
 }
void* deepCopyT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
return offset;
 }
void* deepCopyT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> id1), offset);
offset = deepCopyintValArray1(&(className -> highsum), offset);
offset = deepCopyintValArray1(&(className -> lowsum), offset);
offset = deepCopydoubleValArray1(&(className -> x), offset);
offset = deepCopyintValArray1(&(className -> col), offset);
offset = deepCopyintValArray1(&(className -> row), offset);
offset = deepCopydoubleValArray1(&(className -> val), offset);
offset = deepCopydoubleRefArray1(&(className -> y), offset);
return offset;
 }
void* deepCopyT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerdoubleValArray1( struct doubleValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> regionValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(double);
return offset;
 }
void * fixPointerdoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerintValArray1( struct intValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> regionValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(int32_t);
return offset;
 }
void * fixPointerT29( struct T29 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP176), offset);
return offset;
 }
void * fixPointerT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP156), offset);
return offset;
 }
void * fixPointerT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP114), offset);
return offset;
 }
void * fixPointerT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> i), offset);
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
offset  = fixPointerintValArray1(&(className -> row), offset);
offset  = fixPointerdoubleRefArray1(&(className -> y), offset);
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
void * fixPointerPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerintStub( struct intStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT38( struct T38 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP356), offset);
return offset;
 }
void * fixPointerT37( struct T37 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP336), offset);
return offset;
 }
void * fixPointerT39( struct T39 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP376), offset);
return offset;
 }
void * fixPointerT34( struct T34 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP276), offset);
return offset;
 }
void * fixPointerT33( struct T33 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP256), offset);
return offset;
 }
void * fixPointerT36( struct T36 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP316), offset);
return offset;
 }
void * fixPointerT35( struct T35 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP296), offset);
return offset;
 }
void * fixPointerT30( struct T30 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP196), offset);
return offset;
 }
void * fixPointerT32( struct T32 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP236), offset);
return offset;
 }
void * fixPointerT31( struct T31 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP216), offset);
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
return offset;
 }
void * fixPointerT43( struct T43 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> tempref), offset);
return offset;
 }
void * fixPointerT42( struct T42 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP113), offset);
return offset;
 }
void * fixPointerT41( struct T41 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> i), offset);
offset  = fixPointerdoubleValArray1(&(className -> x), offset);
offset  = fixPointerintValArray1(&(className -> col), offset);
offset  = fixPointerintValArray1(&(className -> row), offset);
offset  = fixPointerdoubleValArray1(&(className -> val), offset);
offset  = fixPointerdoubleRefArray1(&(className -> y), offset);
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
void * fixPointerT40( struct T40 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT46( struct T46 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerT45( struct T45 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT44( struct T44 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
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
return offset;
 }
void * fixPointerT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
return offset;
 }
void * fixPointerT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> id1), offset);
offset  = fixPointerintValArray1(&(className -> highsum), offset);
offset  = fixPointerintValArray1(&(className -> lowsum), offset);
offset  = fixPointerdoubleValArray1(&(className -> x), offset);
offset  = fixPointerintValArray1(&(className -> col), offset);
offset  = fixPointerintValArray1(&(className -> row), offset);
offset  = fixPointerdoubleValArray1(&(className -> val), offset);
offset  = fixPointerdoubleRefArray1(&(className -> y), offset);
return offset;
 }
void * fixPointerT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
