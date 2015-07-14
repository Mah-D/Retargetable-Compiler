#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int32_t _SOR_JACOBI_NUM_ITER ;
int64_t _SOR_RANDOM_SEED ;
int64_t _Random_multiplier ;
int64_t _Random_addend ;
int64_t _Random_mask ;
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
struct SOR * X10_TEMP4 = (struct SOR  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct SOR ))),malloc(sizeof(struct SOR )));  
memset(X10_TEMP4,0,sizeof(struct SOR )); 
SOR_SOR( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
SOR_run ( X10_TEMP4 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for sor: " ; 
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

int32_t /*static*/_SOR_JACOBI_NUM_ITER_init ( ) 
{ 
const int32_t X10_TEMP2 = 100 ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/_SOR_RANDOM_SEED_init ( ) 
{ 
const int64_t X10_TEMP2 = 10101010 ; 
return X10_TEMP2 ; 
} 

void /*static*/SOR_run (  struct SOR  * const X10_TEMP0 ) 
{ 
const double X10_TEMP2 = SOR_kernel ( X10_TEMP0 ) ; 
SOR_validate ( X10_TEMP0 , X10_TEMP2 ) ; 
} 

double /*static*/SOR_kernel (  struct SOR  * const X10_TEMP0 ) 
{ 
const int32_t X10_TEMP4 = 10 ; 
const int32_t X10_TEMP5 = 10 ; 
struct Random * X10_TEMP6 = X10_TEMP0 ->R ; 
/*UpdatableVariableDeclaration*/
 struct doubleRefArray2 G = SOR_RandomMatrix ( X10_TEMP0 , X10_TEMP4 , X10_TEMP5 , X10_TEMP6 ) ; 
const double X10_TEMP11 = 1.25; 
const double X10_TEMP13 = SOR_SORrun ( X10_TEMP0 , X10_TEMP11 , G , _SOR_JACOBI_NUM_ITER ) ; 
return X10_TEMP13 ; 
} 

doubleRefArray2 /*static*/SOR_RandomMatrix (  struct SOR  * const X10_TEMP0 , const int32_t M , const int32_t N ,  struct Random  * const R ) 
{ 
const int32_t X10_TEMP4 = 0 ; 
const int32_t X10_TEMP2 = 1 ; 
const int32_t X10_TEMP5 = M - X10_TEMP2 ; 
struct Region1 X10_TEMP13 = createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; 
const int32_t X10_TEMP10 = 0 ; 
const int32_t X10_TEMP8 = 1 ; 
const int32_t X10_TEMP11 = N - X10_TEMP8 ; 
struct Region1 X10_TEMP14 = createNewRegion1R ( X10_TEMP10 , X10_TEMP11 ) ; 
struct Dist2 d = SOR_blockStar ( X10_TEMP0 , X10_TEMP13 , X10_TEMP14 ) ; 
struct Region2 RX10_TEMP0 = d .dReg ; 
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
const int32_t RX10_TEMP11 = getDistLocalCount2 ( d , RX10_TEMP9 ) ; 
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
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER2 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER2)[0] = RX10_TEMP4, TEMPCALLOCPOINTER2 = ((int32_t * )TEMPCALLOCPOINTER2)+1, memset(TEMPCALLOCPOINTER2,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray2 RX10_TEMP19  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct doubleRefArray2 t = RX10_TEMP19 ; 
struct Dist2 RX10_TEMP20 = t .distValue ; 
struct Region2 RX10_TEMP21 = RX10_TEMP20 .dReg ; 
struct Region2 X10_TEMP18 = RX10_TEMP21 ; 
const int32_t RX10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP23 = X10_TEMP18 .regSize ; 
RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; const int32_t RX10_TEMP24 = RX10_TEMP23 + 1; 
for ( int32_t RX10_TEMP22= 0; RX10_TEMP22<  RX10_TEMP24; RX10_TEMP22++ )
 
{ 
const int32_t RX10_TEMP26 = /*PointAccess*/RX10_TEMP22 ; 
struct Point2 p = regionOrdinalPoint2 ( X10_TEMP18 , RX10_TEMP26 ) ; 
const double X10_TEMP21 = Random_nextDouble ( R ) ; 
const double X10_TEMP22 = 1e-6; 
const double X10_TEMP24 = X10_TEMP21 * X10_TEMP22 ; 
SOR_write ( X10_TEMP0 , t , p , X10_TEMP24 ) ; 
} 

return t ; 
} 

void /*static*/SOR_write (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2 const t ,  struct Point2 const p , const double v ) 
{ 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP0 = t .distValue ; 
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
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, v , p , t ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, X10_TEMP4 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 

Dist2 /*static*/SOR_blockStar (  struct SOR  * const X10_TEMP0 ,  struct Region1 const r1 ,  struct Region1 const r2 ) 
{ 
struct Dist1 X10_TEMP2 = getBlockDist1 ( r1 ) ; 
struct Dist1 d1 = X10_TEMP2 ; 
struct Dist2 X10_TEMP7 = SOR_distTimesRegion ( X10_TEMP0 , d1 , r2 ) ; 
return X10_TEMP7 ; 
} 

Dist2 /*static*/SOR_distTimesRegion (  struct SOR  * const X10_TEMP0 ,  struct Dist1 const d ,  struct Region1 const r ) 
{ 
const int32_t X10_TEMP1 = 0 ; 
const int32_t X10_TEMP2 = 1 ; 
const int32_t X10_TEMP3 = X10_TEMP1 - X10_TEMP2 ; 
struct Region2 X10_TEMP4 = createNewRegion2RR ( X10_TEMP1 , X10_TEMP3 , X10_TEMP1 , X10_TEMP3 ) ; 
struct Region2 X10_TEMP6 = X10_TEMP4 ; 
const place_t X10_TEMP7 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist2 d0 = getPlaceDist2 ( X10_TEMP6 , X10_TEMP7 ) ; 
struct Dist1 X10_TEMP10 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP1 = X10_TEMP10 .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 pl = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Dist1 X10_TEMP11 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP6 = X10_TEMP11 .dReg ; 
const int32_t RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , pl ) ; 
const int32_t RX10_TEMP8 = 0 ; 
const uint32_t RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
const char * RX10_TEMP10 = "Point pl not found in the distribution X10_TEMP11." ; 
fprintf(stderr, "%s",RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP11 = getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP7 ) ; 
/*UpdatableVariableDeclaration*/
place_t p = RX10_TEMP11 ; 
struct Dist1 X10_TEMP15 = restrictDist1 ( d , p ) ; 
struct Region1 RX10_TEMP12 = X10_TEMP15 .dReg ; 
struct Region1 X10_TEMP16 = RX10_TEMP12 ; 
struct Region2 X10_TEMP19 = createNewRegion2AA ( X10_TEMP16 , r ) ; 
struct Dist2 X10_TEMP21 = getPlaceDist2 ( X10_TEMP19 , p ) ; 
struct Dist2 X10_TEMP23 = unionDist2 ( d0 , X10_TEMP21 ) ; 
d0 = X10_TEMP23 ; } 

return d0 ; 
} 

void /*static*/SOR_validate (  struct SOR  * const X10_TEMP0 , const double gtotal ) 
{ 
const double X10_TEMP1 = 4.5185971433257635E-5; 
const double X10_TEMP3 = gtotal - X10_TEMP1 ; 
/*UpdatableVariableDeclaration*/
double dev = fabs ( X10_TEMP3 ) ; 
const double X10_TEMP5 = 1.0e-12; 
const uint32_t X10_TEMP7 = dev > X10_TEMP5 ; 
if ( X10_TEMP7 ) 
{ 
const char * X10_TEMP9 = "Validation failed" ; 
fprintf(  stdout, "%s\n",X10_TEMP9 ) ; 
const char * X10_TEMP10 = "gtotal = " ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC3, "%s%f",X10_TEMP10,gtotal);
const char * X10_TEMP11 = tempC3;; 
const char * X10_TEMP12 = "  " ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC4, "%s%s",X10_TEMP11,X10_TEMP12);
const char * X10_TEMP13 = tempC4;; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC5, "%s%f",X10_TEMP13,dev);
const char * X10_TEMP15 = tempC5;; 
fprintf(  stdout, "%s\n",X10_TEMP15 ) ; 
const char * X10_TEMP17 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

} 

double /*static*/SOR_read (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2 const G ,  struct Point2 const pt ) 
{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 0 ; 
struct Region1 r = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
struct Dist1 d = getPlaceDist1 ( r , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER3;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER3 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER3)[0] = RX10_TEMP5, TEMPCALLOCPOINTER3 = ((int32_t * )TEMPCALLOCPOINTER3)+1, memset(TEMPCALLOCPOINTER3,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER4;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER4 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER4)[0] = RX10_TEMP4, TEMPCALLOCPOINTER4 = ((int32_t * )TEMPCALLOCPOINTER4)+1, memset(TEMPCALLOCPOINTER4,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP19  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct doubleRefArray1 result = RX10_TEMP19 ; 
const place_t phere = /* here  */ _here(); 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP20 = G .distValue ; 
struct Dist2 X10_TEMP10 = RX10_TEMP20 ; 
struct Region2 RX10_TEMP21 = X10_TEMP10 .dReg ; 
const int32_t RX10_TEMP22 = searchPointInRegion2 ( RX10_TEMP21 , pt ) ; 
const int32_t RX10_TEMP23 = 0 ; 
const uint32_t RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ 
const char * RX10_TEMP25 = "Point pt not found in the distribution X10_TEMP10." ; 
fprintf(stderr, "%s",RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP26 = getPlaceFromDist2 ( X10_TEMP10 , RX10_TEMP22 ) ; 
const place_t X10_TEMP13 = RX10_TEMP26 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, phere , result , pt , G ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, X10_TEMP13 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP22 = 0 ; 
struct Point1 RX10_TEMP49  ; 
Point1_Point1( &RX10_TEMP49/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP22 ) ; 
struct Dist1 RX10_TEMP50 = result .distValue ; 
struct Region1 RX10_TEMP51 = RX10_TEMP50 .dReg ; 
const int32_t RX10_TEMP52 = searchPointInRegion1 ( RX10_TEMP51 , RX10_TEMP49 ) ; 
const int32_t RX10_TEMP53 = 0 ; 
const uint32_t RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP55 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP56 = getPlaceFromDist1 ( RX10_TEMP50 , RX10_TEMP52 ) ; 
const place_t RX10_TEMP58 = /* here  */ _here(); 
const uint32_t RX10_TEMP59 = RX10_TEMP56 != RX10_TEMP58 ; 
if ( RX10_TEMP59 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP57 = "Bad place access for array result" ; 
fprintf(stderr, "%s",RX10_TEMP57 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP60 = getRefArrayValue1double ( result , RX10_TEMP52 ) ; 
const double X10_TEMP24 = RX10_TEMP60 ; 
return X10_TEMP24 ; 
} 

double /*static*/SOR_SORrun (  struct SOR  * const X10_TEMP0 , const double omega ,  struct doubleRefArray2 const G , const int32_t num_iterations ) 
{ 
struct Dist2 RX10_TEMP0 = G .distValue ; 
struct Dist2 X10_TEMP1 = RX10_TEMP0 ; 
struct Region2 RX10_TEMP1 = X10_TEMP1 .dReg ; 
struct Region2 X10_TEMP2 = RX10_TEMP1 ; 
const int32_t X10_TEMP4 = 0 ; 
struct Region1 RX10_TEMP2 = getRank2 ( X10_TEMP2 , X10_TEMP4 ) ; 
struct Region1 X10_TEMP5 = RX10_TEMP2 ; 
const int32_t M = X10_TEMP5 .regSize ; 
struct Dist2 RX10_TEMP3 = G .distValue ; 
struct Dist2 X10_TEMP7 = RX10_TEMP3 ; 
struct Region2 RX10_TEMP4 = X10_TEMP7 .dReg ; 
struct Region2 X10_TEMP8 = RX10_TEMP4 ; 
const int32_t X10_TEMP10 = 1 ; 
struct Region1 RX10_TEMP5 = getRank2 ( X10_TEMP8 , X10_TEMP10 ) ; 
struct Region1 X10_TEMP11 = RX10_TEMP5 ; 
const int32_t N = X10_TEMP11 .regSize ; 
const double X10_TEMP13 = 0.25; 
const double omega_over_four = omega * X10_TEMP13 ; 
const double X10_TEMP15 = 1.0; 
const double one_minus_omega = X10_TEMP15 - omega ; 
const int32_t X10_TEMP17 = 1 ; 
const int32_t Mm1 = M - X10_TEMP17 ; 
const int32_t X10_TEMP19 = 1 ; 
const int32_t Nm1 = N - X10_TEMP19 ; 
const int32_t X10_TEMP24 = 0 ; 
const int32_t X10_TEMP22 = 1 ; 
const int32_t X10_TEMP25 = num_iterations - X10_TEMP22 ; 
const int32_t X10_TEMP28 = 0 ; 
const int32_t X10_TEMP29 = 1 ; 
struct Region2 X10_TEMP31 = createNewRegion2RR ( X10_TEMP24 , X10_TEMP25 , X10_TEMP28 , X10_TEMP29 ) ; 
const int32_t RX10_TEMP9 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP7 = X10_TEMP31 .regSize ; 
RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9 ; const int32_t RX10_TEMP8 = RX10_TEMP7 + 1; 
for ( int32_t RX10_TEMP6= 0; RX10_TEMP6<  RX10_TEMP8; RX10_TEMP6++ )
 
{ 
const int32_t RX10_TEMP10 = /*PointAccess*/RX10_TEMP6 ; 
struct Point2 po = regionOrdinalPoint2 ( X10_TEMP31 , RX10_TEMP10 ) ; 
/* finish  */ task_start_finish();

{ 
const int32_t X10_TEMP47 = 0 ; 
const int32_t X10_TEMP33 = 1 ; 
const int32_t X10_TEMP35 = Mm1 - X10_TEMP33 ; 
const int32_t X10_TEMP37 = 1 ; 
const int32_t X10_TEMP38 = po .f1 ; 
const int32_t X10_TEMP40 = X10_TEMP37 + X10_TEMP38 ; 
const int32_t X10_TEMP42 = X10_TEMP35 - X10_TEMP40 ; 
const int32_t X10_TEMP43 = 2 ; 
const int32_t X10_TEMP45 = X10_TEMP42 / X10_TEMP43 ; 
const int32_t X10_TEMP51 = 1 ; 
const int32_t X10_TEMP49 = 1 ; 
const int32_t X10_TEMP52 = Nm1 - X10_TEMP49 ; 
struct Region2 X10_TEMP54 = createNewRegion2RR ( X10_TEMP47 , X10_TEMP45 , X10_TEMP51 , X10_TEMP52 ) ; 
const place_t X10_TEMP55 = /* here  */ _here(); 
const int32_t RX10_TEMP14 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP12 = X10_TEMP54 .regSize ; 
RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14 ; const int32_t RX10_TEMP13 = RX10_TEMP12 + 1; 
for ( int32_t RX10_TEMP11= 0; RX10_TEMP11<  RX10_TEMP13; RX10_TEMP11++ )
 
{ 
const int32_t RX10_TEMP15 = /*PointAccess*/RX10_TEMP11 ; 
struct Point2 pt = regionOrdinalPoint2 ( X10_TEMP54 , RX10_TEMP15 ) ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, pt , po , one_minus_omega , omega_over_four , G , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, X10_TEMP55 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 

const double X10_TEMP120 = doublerefArraySum2 ( G ) ; 
return X10_TEMP120 ; 
} 

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

double /*static*/doublerefArraySum2 (  struct doubleRefArray2 const sumArray ) 
{ 
const int32_t maxPlaces = /* place.MAX_PLACES  */ _max_places(); 
const int32_t one = 1 ; 
const int32_t zero = 0 ; 
const int32_t maxPlacesMinusOne = maxPlaces - one ; 
struct Region1 dReg = createNewRegion1R ( zero , maxPlacesMinusOne ) ; 
const place_t source = /* here  */ _here(); 
struct Dist1 dSum = getPlaceDist1 ( dReg , source ) ; 
const double initVal = 0 ; 
struct Region1 RX10_TEMP0 = dSum .dReg ; 
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
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dSum , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 , initVal ) ; 
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
void * TEMPCALLOCPOINTER6;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER6)[0] = RX10_TEMP4, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,RX10_TEMP4*sizeof(doubleStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, dSum , RX10_TEMP17 ) ; 
struct doubleRefArray1 localSumArray = RX10_TEMP20 ; 
struct Dist1 dUnique = getUniqueDist ( ) ; 
/* finish  */ task_start_finish();

{ 
struct Region1 RX10_TEMP22 = dUnique .dReg ; 
const int32_t RX10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP23 = RX10_TEMP22 .regSize ; 
RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; const int32_t RX10_TEMP24 = RX10_TEMP23 + 1; 
for ( int32_t RX10_TEMP21= 0; RX10_TEMP21<  RX10_TEMP24; RX10_TEMP21++ )
 
{ 
const int32_t RX10_TEMP26 = /*PointAccess*/RX10_TEMP21 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP22 , RX10_TEMP26 ) ; 
struct Region1 RX10_TEMP27 = dUnique .dReg ; 
const int32_t RX10_TEMP28 = searchPointInRegion1 ( RX10_TEMP27 , p ) ; 
const int32_t RX10_TEMP29 = 0 ; 
const uint32_t RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
const char * RX10_TEMP31 = "Point p not found in the distribution dUnique." ; 
fprintf(stderr, "%s",RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP32 = getPlaceFromDist1 ( dUnique , RX10_TEMP28 ) ; 
const place_t nthPlace = RX10_TEMP32 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, localSumArray , source , zero , sumArray ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC6) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, nthPlace );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*UpdatableVariableDeclaration*/
double globalSum = 0 ; 
struct Dist1 RX10_TEMP63 = localSumArray .distValue ; 
struct Region1 RX10_TEMP64 = RX10_TEMP63 .dReg ; 
const int32_t RX10_TEMP67 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP65 = RX10_TEMP64 .regSize ; 
RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67 ; const int32_t RX10_TEMP66 = RX10_TEMP65 + 1; 
for ( int32_t RX10_TEMP62= 0; RX10_TEMP62<  RX10_TEMP66; RX10_TEMP62++ )
 
{ 
const int32_t RX10_TEMP68 = /*PointAccess*/RX10_TEMP62 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP68 ) ; 
struct Dist1 RX10_TEMP69 = localSumArray .distValue ; 
struct Region1 RX10_TEMP70 = RX10_TEMP69 .dReg ; 
const int32_t RX10_TEMP71 = searchPointInRegion1 ( RX10_TEMP70 , p ) ; 
const int32_t RX10_TEMP72 = 0 ; 
const uint32_t RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72 ; 
if ( RX10_TEMP73 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP74 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP74 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP75 = getPlaceFromDist1 ( RX10_TEMP69 , RX10_TEMP71 ) ; 
const place_t RX10_TEMP77 = /* here  */ _here(); 
const uint32_t RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77 ; 
if ( RX10_TEMP78 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP76 = "Bad place access for array localSumArray" ; 
fprintf(stderr, "%s",RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP79 = getRefArrayValue1double ( localSumArray , RX10_TEMP71 ) ; 
const double localSumCurr = RX10_TEMP79 ; 
globalSum = globalSum + localSumCurr ; } 

return globalSum ; 
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

Region1 /*static*/getRank2 (  struct Region2 const r , const int32_t dim ) 
{ 
const int32_t zero = 0 ; 
const int32_t regRank = 2 ; 
const uint32_t cond1 = dim >= regRank ; 
const uint32_t cond2 = dim < zero ; 
const uint32_t invalidRank = cond1 || cond2 ; 
if ( invalidRank ) 
{ 
const char * errorMsgHeader = "Invalid dimension for rank projection. Got " ; 
const char * errorMsgTrailer = ", expected value between 0 and 2" ; 
/*UpdatableVariableDeclaration*/
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC6, "%s%d",errorMsgHeader,dim);
char * errorMsg = tempC6;
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC7, "%s%s",errorMsg,errorMsgTrailer);
errorMsg = tempC7;fprintf(stderr, "%s",errorMsg ) ; 
exit(EXIT_FAILURE);
} 

const uint32_t regType = r .regType ; 
if ( regType ) 
{ 
struct Region1 regularRank = getRankRegular2 ( r , dim ) ; 
return regularRank ; 
} 

struct Region1 arbitraryRank = getRankArbitrary2 ( r , dim ) ; 
return arbitraryRank ; 
} 

Region1 /*static*/getRankArbitrary2 (  struct Region2 const r , const int32_t dim ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t two = 2 ; 
const int32_t minusOne = zero - one ; 
const int32_t proj0 = 0 ; 
const int32_t proj1 = 1 ; 
/*UpdatableVariableDeclaration*/
/*VALUE ARRAY*/ struct Point2 * regArr = r .pointArray ; 
const int32_t regSize = r .regSize ; 
const int32_t regSizeMinusOne = regSize - one ; 
const int32_t regArrRegion = regSizeMinusOne + 1; 
const int32_t distArrRegion = /*SimpleDistributionExpression*/ regSizeMinusOne +1; 
/*UpdatableVariableDeclaration*/
int32_t maxIndex = minusOne ; 
/*UpdatableVariableDeclaration*/
int32_t minIndex = zero ; 
/*UpdatableVariableDeclaration*/
uint32_t isFirstMinIndex = 1 ; 
for ( int32_t p= 0; p<  regArrRegion; p++ )
 
{ 
const int32_t idx = /*PointAccess*/p ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs0;
else if(proj1== dim)
goto cs1;
goto cs2;

cs0:
{ 
struct Point2 tempPt = regArr [ idx ] 
; 
const int32_t crd = tempPt .f0 ; 
const uint32_t isMax = crd >= maxIndex ; 
if ( isMax ) 
{ 
maxIndex = crd ; } 

const uint32_t lt = crd <= minIndex ; 
const uint32_t isMin = lt || isFirstMinIndex ; 
if ( isMin ) 
{ 
isFirstMinIndex = 0 ; minIndex = crd ; } 

break ; 
goto cs1;
} 


cs1:
{ 
struct Point2 tempPt = regArr [ idx ] 
; 
const int32_t crd = tempPt .f1 ; 
const uint32_t isMax = crd >= maxIndex ; 
if ( isMax ) 
{ 
maxIndex = crd ; } 

const uint32_t lt = crd <= minIndex ; 
const uint32_t isMin = lt || isFirstMinIndex ; 
if ( isMin ) 
{ 
isFirstMinIndex = 0 ; minIndex = crd ; } 

break ; 
} 

cs2: {break;}} /*END OF SWITCH*/
} 

const int32_t regIndexSizeMinusOne = maxIndex - minIndex ; 
const int32_t regIndexSize = regIndexSizeMinusOne + one ; 
const int32_t regIndexRegion = regIndexSizeMinusOne + 1; 
const int32_t regIndexDist = /*SimpleDistributionExpression*/ regIndexSizeMinusOne +1; 
void * TEMPCALLOCPOINTER19;
/*Updatable ARRAY*/ int32_t * const indexArr = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER19 = malloc(sizeof(int32_t)+(regIndexDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regIndexDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER19)[0] = regIndexDist, TEMPCALLOCPOINTER19 = ((int32_t * )TEMPCALLOCPOINTER19)+1, memset(TEMPCALLOCPOINTER19,0,regIndexDist*sizeof(int32_t ) ) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regIndexDist; p++) 

{ 
indexArr[p] = zero ; 
} 
/*END OF ARRAY INIT*/for ( int32_t p= 0; p<  regArrRegion; p++ )
 
{ 
const int32_t idx = /*PointAccess*/p ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs3;
else if(proj1== dim)
goto cs4;
goto cs5;

cs3:
{ 
struct Point2 tempPt = regArr [ idx ] 
; 
const int32_t crd = tempPt .f0 ; 
const int32_t newRegIndex = crd - minIndex ; 
indexArr [ newRegIndex ] = ( one ) ; 
break ; 
goto cs4;
} 


cs4:
{ 
struct Point2 tempPt = regArr [ idx ] 
; 
const int32_t crd = tempPt .f1 ; 
const int32_t newRegIndex = crd - minIndex ; 
indexArr [ newRegIndex ] = ( one ) ; 
break ; 
} 

cs5: {break;}} /*END OF SWITCH*/
} 

/*UpdatableVariableDeclaration*/
int32_t newRegSize = 0 ; 
for ( int32_t p= 0; p<  regIndexRegion; p++ )
 
{ 
const int32_t hit = indexArr [ p ] 
; 
newRegSize = newRegSize + hit ;; } 

const uint32_t isRegular = newRegSize == regIndexSize ; 
if ( isRegular ) 
{ 
const int32_t regRegularRegion = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER20;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER20 = malloc(sizeof(int32_t)+(regRegularRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regRegularRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER20)[0] = regRegularRegion, TEMPCALLOCPOINTER20 = ((int32_t * )TEMPCALLOCPOINTER20)+1, memset(TEMPCALLOCPOINTER20,0,regRegularRegion*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regRegularRegion; p++) 

{ 
struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region1 retRegRegular  ; 
Region1_Region1_4( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , regIndexSize , minIndex , regIndexSize ) ; 
return retRegRegular ; 
} 

const int32_t newRegSizeMinusOne = newRegSize - one ; 
const int32_t newRegRegion = newRegSizeMinusOne + 1; 
const int32_t newRegDist = /*SimpleDistributionExpression*/ newRegSizeMinusOne +1; 
void * TEMPCALLOCPOINTER21;
/*Updatable ARRAY*/ struct Point1 * const indexPointArr = (/*Updatable ARRAY*/ struct Point1 * ) ( TEMPCALLOCPOINTER21 = malloc(sizeof(int32_t)+(newRegDist*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(newRegDist*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER21)[0] = newRegDist, TEMPCALLOCPOINTER21 = ((int32_t * )TEMPCALLOCPOINTER21)+1, memset(TEMPCALLOCPOINTER21,0,newRegDist*sizeof(Point1 ) ) ); 
/*UpdatableVariableDeclaration*/
int32_t newArrIndex = 0 ; 
for ( int32_t p= 0; p<  regIndexRegion; p++ )
 
{ 
const int32_t indx = indexArr [ p ] 
; 
const uint32_t isOne = indx == one ; 
if ( isOne ) 
{ 
const int32_t idx = /*PointAccess*/p ; 
const int32_t pointValue = idx + minIndex ; 
struct Point1 tempPoint  ; 
Point1_Point1( &tempPoint/*OBJECT INIT IN ASSIGNMENT*/, pointValue ) ; 
indexPointArr [ newArrIndex ] = ( tempPoint ) ; 
newArrIndex = newArrIndex + one ; } 

} 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER22;
/*VALUE ARRAY*/ struct Point1 * const indexPointValueArr = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER22 = malloc(sizeof(int32_t)+(newRegRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(newRegRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER22)[0] = newRegRegion, TEMPCALLOCPOINTER22 = ((int32_t * )TEMPCALLOCPOINTER22)+1, memset(TEMPCALLOCPOINTER22,0,newRegRegion*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < newRegRegion; p++) 

{ 
struct Point1 pt = indexPointArr [ p ] 
; 
indexPointValueArr[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region1 retRegArbitrary  ; 
Region1_Region1_2( &retRegArbitrary/*OBJECT INIT IN ASSIGNMENT*/, indexPointValueArr , regIndexSize ) ; 
return retRegArbitrary ; 
} 

Region1 /*static*/getRankRegular2 (  struct Region2 const r , const int32_t dim ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t minusOne = zero - one ; 
const int32_t pointRegion = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER23;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER23 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(pointRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER23)[0] = pointRegion, TEMPCALLOCPOINTER23 = ((int32_t * )TEMPCALLOCPOINTER23)+1, memset(TEMPCALLOCPOINTER23,0,pointRegion*sizeof(Point1 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < pointRegion; p++) 

{ 
struct Point1 pt1  ; 
Point1_Point1( &pt1/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
pointArray[p] = pt1 ; 
} 
/*END OF ARRAY INIT*/const int32_t proj0 = 0 ; 
const int32_t proj1 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t low0 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t dim0 = 0 ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs6;
else if(proj1== dim)
goto cs7;
goto cs8;

cs6:
{ 
low0 = r .low0 ; dim0 = r .dim0 ; break ; 
goto cs7;
} 


cs7:
{ 
low0 = r .low1 ; dim0 = r .dim1 ; break ; 
} 

cs8: {break;}} /*END OF SWITCH*/
struct Region1 retRegRegular  ; 
Region1_Region1_4( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, pointArray , dim0 , low0 , dim0 ) ; 
return retRegRegular ; 
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
void * TEMPCALLOCPOINTER31;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER31 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER31)[0] = tempReg, TEMPCALLOCPOINTER31 = ((int32_t * )TEMPCALLOCPOINTER31)+1, memset(TEMPCALLOCPOINTER31,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER32;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER32 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER32)[0] = tempDist, TEMPCALLOCPOINTER32 = ((int32_t * )TEMPCALLOCPOINTER32)+1, memset(TEMPCALLOCPOINTER32,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER33)[0] = tempReg, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,tempReg*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER37;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER37)[0] = tempReg, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER38;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER38 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER38)[0] = tempDist, TEMPCALLOCPOINTER38 = ((int32_t * )TEMPCALLOCPOINTER38)+1, memset(TEMPCALLOCPOINTER38,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER39;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER39 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER39)[0] = tempReg, TEMPCALLOCPOINTER39 = ((int32_t * )TEMPCALLOCPOINTER39)+1, memset(TEMPCALLOCPOINTER39,0,tempReg*sizeof(Point1 )) ); 

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

Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
const int32_t dDist = /*SimpleDistributionExpression*/ rSizeMinusOne +1; 
void * TEMPCALLOCPOINTER40;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER40 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER40)[0] = dDist, TEMPCALLOCPOINTER40 = ((int32_t * )TEMPCALLOCPOINTER40)+1, memset(TEMPCALLOCPOINTER40,0,dDist*sizeof(place_t ) ) ); 
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
void * TEMPCALLOCPOINTER41;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER41 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER41)[0] = dReg, TEMPCALLOCPOINTER41 = ((int32_t * )TEMPCALLOCPOINTER41)+1, memset(TEMPCALLOCPOINTER41,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER42;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER42 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER42)[0] = dReg, TEMPCALLOCPOINTER42 = ((int32_t * )TEMPCALLOCPOINTER42)+1, memset(TEMPCALLOCPOINTER42,0,dReg*sizeof(place_t )) ); 

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

Dist2 /*static*/unionDist2 (  struct Dist2 const d1 ,  struct Dist2 const d2 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t index1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t index2 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t index = 0 ; 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
struct Region2 reg1 = d1 .dReg ; 
struct Region2 reg2 = d2 .dReg ; 
const uint32_t regType1 = reg1 .regType ; 
const uint32_t regType2 = reg2 .regType ; 
/*UpdatableVariableDeclaration*/
/*VALUE ARRAY*/ struct Point2 * tempArr1 = reg1 .pointArray ; 
/*UpdatableVariableDeclaration*/
/*VALUE ARRAY*/ struct Point2 * tempArr2 = reg2 .pointArray ; 
if ( regType1 ) 
{ 
const int32_t stride2 = 1 ; 
const int32_t dim2 = reg1 .dim1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t regLow2 = reg1 .low1 ; 
const int32_t dim1 = reg1 .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = reg1 .low0 ; 
const int32_t regSize1 = reg1 .regSize ; 
const int32_t sizeMinusOne = regSize1 - one ; 
const int32_t regArr = sizeMinusOne + 1; 
void * TEMPCALLOCPOINTER43;
tempArr1 = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER43 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER43)[0] = regArr, TEMPCALLOCPOINTER43 = ((int32_t * )TEMPCALLOCPOINTER43)+1, memset(TEMPCALLOCPOINTER43,0,regArr*sizeof(Point2 )) );
/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 retPoint  ; 
Point2_Point2( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
tempArr1[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/; } 

if ( regType2 ) 
{ 
const int32_t stride2 = 1 ; 
const int32_t dim2 = reg2 .dim1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t regLow2 = reg2 .low1 ; 
const int32_t dim1 = reg2 .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = reg2 .low0 ; 
const int32_t regSize2 = reg2 .regSize ; 
const int32_t sizeMinusOne = regSize2 - one ; 
const int32_t regArr = sizeMinusOne + 1; 
void * TEMPCALLOCPOINTER44;
tempArr2 = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER44 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER44)[0] = regArr, TEMPCALLOCPOINTER44 = ((int32_t * )TEMPCALLOCPOINTER44)+1, memset(TEMPCALLOCPOINTER44,0,regArr*sizeof(Point2 )) );
/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 retPoint  ; 
Point2_Point2( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
tempArr2[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/; } 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point2 * const arr1 = tempArr1 ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point2 * const arr2 = tempArr2 ; 
struct Dist dDist1 = d1 .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const dPlaceArray1 = dDist1 .placeArray ; 
struct Dist dDist2 = d2 .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ place_t * const dPlaceArray2 = dDist2 .placeArray ; 
const int32_t size1 = reg1 .regSize ; 
const int32_t size2 = reg2 .regSize ; 
const int32_t rSize = size1 + size2 ; 
const int32_t sizeMinusOne = rSize - one ; 
const int32_t tempReg = sizeMinusOne + 1; 
const int32_t tempDist = /*SimpleDistributionExpression*/ sizeMinusOne +1; 
void * TEMPCALLOCPOINTER49;
/*Updatable ARRAY*/ struct Point2 * const tempArr = ( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(tempDist*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER49)[0] = tempDist, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,tempDist*sizeof(Point2 ) ) ); 
void * TEMPCALLOCPOINTER50;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(tempDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER50)[0] = tempDist, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,tempDist*sizeof(place_t ) ) ); 
/*UpdatableVariableDeclaration*/
uint32_t cond1 = index1 < size1 ; 
/*UpdatableVariableDeclaration*/
uint32_t cond2 = index2 < size2 ; 
/*UpdatableVariableDeclaration*/
uint32_t cond = cond1 && cond2 ; 

while ( cond ) 
{ 
struct Point2 p1 = arr1 [ index1 ] 
; 
struct Point2 p2 = arr2 [ index2 ] 
; 
const int32_t pointCompare = comparePoint2 ( p1 , p2 ) ; 
const uint32_t eq = pointCompare == zero ; 
const uint32_t lt = pointCompare == one ; 
if ( eq ) 
{ 
const char * errMsg = "Non-disjoint region in a disjoint union" ; 
fprintf(stderr, "%s",errMsg ) ; 
exit(EXIT_FAILURE);
} 

if ( lt ) 
{ 
tempArr [ index ] = ( p1 ) ; 
const place_t pPlace = dPlaceArray1 [ index1 ] 
; 
placeArray [ index ] = ( pPlace ) ; 
index1 = index1 + one ; } 
else 
{ 
tempArr [ index ] = ( p2 ) ; 
const place_t pPlace = dPlaceArray2 [ index2 ] 
; 
placeArray [ index ] = ( pPlace ) ; 
index2 = index2 + one ; } 


index = index + one ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; } 

cond1 = index1 < size1 ; 
while ( cond1 ) 
{ 
struct Point2 tempArrPt = arr1 [ index1 ] 
; 
tempArr [ index ] = ( tempArrPt ) ; 
const place_t pPlace = dPlaceArray1 [ index1 ] 
; 
placeArray [ index ] = ( pPlace ) ; 
index1 = index1 + one ; index = index + one ; cond1 = index1 < size1 ; } 

cond2 = index2 < size2 ; 
while ( cond2 ) 
{ 
struct Point2 tempArrPt = arr2 [ index2 ] 
; 
tempArr [ index ] = ( tempArrPt ) ; 
const place_t pPlace = dPlaceArray2 [ index2 ] 
; 
placeArray [ index ] = ( pPlace ) ; 
index2 = index2 + one ; index = index + one ; cond2 = index2 < size2 ; } 

/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER51;
/*VALUE ARRAY*/ struct Point2 * const arr = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER51)[0] = tempReg, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,tempReg*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
struct Point2 retPoint = tempArr [ pt ] 
; 
arr[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/struct Region2 unionReg  ; 
Region2_Region2_2( &unionReg/*OBJECT INIT IN ASSIGNMENT*/, arr , rSize ) ; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER52;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER52 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER52)[0] = tempReg, TEMPCALLOCPOINTER52 = ((int32_t * )TEMPCALLOCPOINTER52)+1, memset(TEMPCALLOCPOINTER52,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
const place_t tempPl = placeArray [ pt ] 
; 
vPlaceArray[pt] = tempPl ; 
} 
/*END OF ARRAY INIT*/struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 unionDist  ; 
Dist2_Dist2( &unionDist/*OBJECT INIT IN ASSIGNMENT*/, unionReg , pointDist ) ; 
return unionDist ; 
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
void * TEMPCALLOCPOINTER58;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER58 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER58)[0] = dReg, TEMPCALLOCPOINTER58 = ((int32_t * )TEMPCALLOCPOINTER58)+1, memset(TEMPCALLOCPOINTER58,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER59;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER59 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER59)[0] = dReg, TEMPCALLOCPOINTER59 = ((int32_t * )TEMPCALLOCPOINTER59)+1, memset(TEMPCALLOCPOINTER59,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER62;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER62 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER62)[0] = tempReg, TEMPCALLOCPOINTER62 = ((int32_t * )TEMPCALLOCPOINTER62)+1, memset(TEMPCALLOCPOINTER62,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER63;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER63 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER63)[0] = tempDist, TEMPCALLOCPOINTER63 = ((int32_t * )TEMPCALLOCPOINTER63)+1, memset(TEMPCALLOCPOINTER63,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER64;
/*VALUE ARRAY*/ struct Point2 * const pointArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER64 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER64)[0] = tempReg, TEMPCALLOCPOINTER64 = ((int32_t * )TEMPCALLOCPOINTER64)+1, memset(TEMPCALLOCPOINTER64,0,tempReg*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER68;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER68 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER68)[0] = tempReg, TEMPCALLOCPOINTER68 = ((int32_t * )TEMPCALLOCPOINTER68)+1, memset(TEMPCALLOCPOINTER68,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER69;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER69 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER69)[0] = tempDist, TEMPCALLOCPOINTER69 = ((int32_t * )TEMPCALLOCPOINTER69)+1, memset(TEMPCALLOCPOINTER69,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER70;
/*VALUE ARRAY*/ struct Point2 * const pointArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER70 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER70)[0] = tempReg, TEMPCALLOCPOINTER70 = ((int32_t * )TEMPCALLOCPOINTER70)+1, memset(TEMPCALLOCPOINTER70,0,tempReg*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER71;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER71 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER71)[0] = tempReg, TEMPCALLOCPOINTER71 = ((int32_t * )TEMPCALLOCPOINTER71)+1, memset(TEMPCALLOCPOINTER71,0,tempReg*sizeof(int32_t )) ); 

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
void * TEMPCALLOCPOINTER72;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER72 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER72)[0] = regArr, TEMPCALLOCPOINTER72 = ((int32_t * )TEMPCALLOCPOINTER72)+1, memset(TEMPCALLOCPOINTER72,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER73;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER73 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER73)[0] = regArr, TEMPCALLOCPOINTER73 = ((int32_t * )TEMPCALLOCPOINTER73)+1, memset(TEMPCALLOCPOINTER73,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER74;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER74 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER74)[0] = regArr, TEMPCALLOCPOINTER74 = ((int32_t * )TEMPCALLOCPOINTER74)+1, memset(TEMPCALLOCPOINTER74,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER75;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER75 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER75)[0] = regArr, TEMPCALLOCPOINTER75 = ((int32_t * )TEMPCALLOCPOINTER75)+1, memset(TEMPCALLOCPOINTER75,0,regArr*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER76;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER76 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER76)[0] = regArr, TEMPCALLOCPOINTER76 = ((int32_t * )TEMPCALLOCPOINTER76)+1, memset(TEMPCALLOCPOINTER76,0,regArr*sizeof(Point2 )) ); 

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
void * TEMPCALLOCPOINTER77;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER77 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER77)[0] = regArr, TEMPCALLOCPOINTER77 = ((int32_t * )TEMPCALLOCPOINTER77)+1, memset(TEMPCALLOCPOINTER77,0,regArr*sizeof(Point2 )) ); 

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

Region2 /*static*/createNewRegion2AA (  struct Region1 const v1_0 ,  struct Region1 const v2_0 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t regType = 1 ; 
const uint32_t tempBool1 = v1_0 .regType ; 
const uint32_t tempBool2 = v2_0 .regType ; 
regType = regType && tempBool1 ; regType = regType && tempBool2 ; const int32_t l1 = v1_0 .regSize ; 
const int32_t dim1 = l1 ; 
const int32_t l2 = v2_0 .regSize ; 
const int32_t dim2 = l2 ; 
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
void * TEMPCALLOCPOINTER78;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER78 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER78)[0] = regArr, TEMPCALLOCPOINTER78 = ((int32_t * )TEMPCALLOCPOINTER78)+1, memset(TEMPCALLOCPOINTER78,0,regArr*sizeof(Point2 )) ); 

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
const int32_t low1 = v1_0 .low0 ; 
const int32_t low2 = v2_0 .low0 ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER79;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER79 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER79)[0] = regArr, TEMPCALLOCPOINTER79 = ((int32_t * )TEMPCALLOCPOINTER79)+1, memset(TEMPCALLOCPOINTER79,0,regArr*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region2 retRegRegular  ; 
Region2_Region2_6( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , low1 , dim1 , low2 , dim2 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int32_t regArr = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER80;
/*VALUE ARRAY*/ struct Point2 * const ptArray = (/*VALUE ARRAY*/ struct Point2 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER80 = malloc(sizeof(int32_t)+(regArr*sizeof( Point2 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point2 )))),((int32_t * )TEMPCALLOCPOINTER80)[0] = regArr, TEMPCALLOCPOINTER80 = ((int32_t * )TEMPCALLOCPOINTER80)+1, memset(TEMPCALLOCPOINTER80,0,regArr*sizeof(Point2 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; if ( tempBool1 ) 
{ 
const int32_t low1 = v1_0 .low0 ; 
f1 = f1 + low1 ; } 
else 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point1 * const rArray1 = v1_0 .pointArray ; 
struct Point1 rArrayPt1 = rArray1 [ f1 ] 
; 
f1 = rArrayPt1 .f0 ; } 


/*UpdatableVariableDeclaration*/
int32_t f2 = p / stride2 ; 
f2 = f2 % dim2 ; if ( tempBool2 ) 
{ 
const int32_t low2 = v2_0 .low0 ; 
f2 = f2 + low2 ; } 
else 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point1 * const rArray2 = v2_0 .pointArray ; 
struct Point1 rArrayPt2 = rArray2 [ f2 ] 
; 
f2 = rArrayPt2 .f0 ; } 


struct Point2 retPoint  ; 
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
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER84;
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER84 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER84)[0] = RX10_TEMP13, TEMPCALLOCPOINTER84 = ((int32_t * )TEMPCALLOCPOINTER84)+1, memset(TEMPCALLOCPOINTER84,0,RX10_TEMP13*sizeof(double ) ) ); 
struct doubleStub RX10_TEMP15  ; 
doubleStub_doubleStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC7) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const double v = utmpz .v ; 
struct Point2 p = utmpz .p ; 
struct doubleRefArray2 t = utmpz .t ; 

{ 
const double X10_TEMP7 = v ; 
struct Dist2 RX10_TEMP7 = t .distValue ; 
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
char * RX10_TEMP14 = "Bad place access for array t" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( t , RX10_TEMP9 , X10_TEMP7 ) ; 
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER86;
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER86 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER86)[0] = RX10_TEMP13, TEMPCALLOCPOINTER86 = ((int32_t * )TEMPCALLOCPOINTER86)+1, memset(TEMPCALLOCPOINTER86,0,RX10_TEMP13*sizeof(double ) ) ); 
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

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const place_t phere = utmpz .phere ; 
struct doubleRefArray1 result = utmpz .result ; 
struct Point2 pt = utmpz .pt ; 
struct doubleRefArray2 G = utmpz .G ; 

{ 
struct Dist2 RX10_TEMP27 = G .distValue ; 
struct Region2 RX10_TEMP28 = RX10_TEMP27 .dReg ; 
const int32_t RX10_TEMP29 = searchPointInRegion2 ( RX10_TEMP28 , pt ) ; 
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
char * RX10_TEMP34 = "Bad place access for array G" ; 
fprintf(stderr, "%s",RX10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP37 = getRefArrayValue2double ( G , RX10_TEMP29 ) ; 
const double val = RX10_TEMP37 ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, val , result ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC9) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, phere );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread5 (  struct T5 const utmpz ) 
{ 
struct Point2 pt = utmpz .pt ; 
struct Point2 po = utmpz .po ; 
const double one_minus_omega = utmpz .one_minus_omega ; 
const double omega_over_four = utmpz .omega_over_four ; 
struct doubleRefArray2 G = utmpz .G ; 
struct SOR * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP58 = 2 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP59 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP16 = pt .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP17 = pt .f1 ; 
RX10_TEMP16 = RX10_TEMP16 * X10_TEMP58 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP59 ; struct Point2 X10_TEMP65  ; 
Point2_Point2( &X10_TEMP65/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP17 ) ; 
const int32_t X10_TEMP61 = 1 ; 
const int32_t X10_TEMP62 = po .f1 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP66 = X10_TEMP61 + X10_TEMP62 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP67 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP18 = X10_TEMP65 .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP19 = X10_TEMP65 .f1 ; 
RX10_TEMP18 = RX10_TEMP18 + X10_TEMP66 ; RX10_TEMP19 = RX10_TEMP19 + X10_TEMP67 ; struct Point2 ij  ; 
Point2_Point2( &ij/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP18 , RX10_TEMP19 ) ; 
/* finish  */ task_start_finish();

{ 
struct Dist2 RX10_TEMP20 = G .distValue ; 
struct Dist2 X10_TEMP69 = RX10_TEMP20 ; 
struct Region2 RX10_TEMP21 = X10_TEMP69 .dReg ; 
const int32_t RX10_TEMP22 = searchPointInRegion2 ( RX10_TEMP21 , ij ) ; 
const int32_t RX10_TEMP23 = 0 ; 
const uint32_t RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ 
const char * RX10_TEMP25 = "Point ij not found in the distribution X10_TEMP69." ; 
fprintf(stderr, "%s",RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP26 = getPlaceFromDist2 ( X10_TEMP69 , RX10_TEMP22 ) ; 
const place_t X10_TEMP72 = RX10_TEMP26 ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, ij , one_minus_omega , omega_over_four , G , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC10) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, X10_TEMP72 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 
} 

void /*static*/thread6 (  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 
const double initVal = utmpz .initVal ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER88;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER88 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER88)[0] = RX10_TEMP14, TEMPCALLOCPOINTER88 = ((int32_t * )TEMPCALLOCPOINTER88)+1, memset(TEMPCALLOCPOINTER88,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
RX10_TEMP15[RX10_TEMP13] = initVal ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC11) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread7 (  struct T7 const utmpz ) 
{ 
struct doubleRefArray1 localSumArray = utmpz .localSumArray ; 
const place_t source = utmpz .source ; 
const int32_t zero = utmpz .zero ; 
struct doubleRefArray2 sumArray = utmpz .sumArray ; 

{ 
/*UpdatableVariableDeclaration*/
double localSumTemp = 0 ; 
const place_t thisPlace = /* here  */ _here(); 
struct Dist2 RX10_TEMP33 = sumArray .distValue ; 
struct Dist2 sumArrayDist = RX10_TEMP33 ; 
struct Dist2 sumArrayDistHere = restrictDist2 ( sumArrayDist , thisPlace ) ; 
struct Region2 RX10_TEMP35 = sumArrayDistHere .dReg ; 
const int32_t RX10_TEMP38 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP36 = RX10_TEMP35 .regSize ; 
RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ;; const int32_t RX10_TEMP37 = RX10_TEMP36 + 1; 
for ( int32_t RX10_TEMP34= 0; RX10_TEMP34<  RX10_TEMP37; RX10_TEMP34++ )
 
{ 
const int32_t RX10_TEMP39 = /*PointAccess*/RX10_TEMP34 ; 
struct Point2 pt = regionOrdinalPoint2 ( RX10_TEMP35 , RX10_TEMP39 ) ; 
struct Dist2 RX10_TEMP40 = sumArray .distValue ; 
struct Region2 RX10_TEMP41 = RX10_TEMP40 .dReg ; 
const int32_t RX10_TEMP42 = searchPointInRegion2 ( RX10_TEMP41 , pt ) ; 
const int32_t RX10_TEMP43 = 0 ; 
const uint32_t RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43 ; 
if ( RX10_TEMP44 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP45 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP45 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP46 = getPlaceFromDist2 ( RX10_TEMP40 , RX10_TEMP42 ) ; 
const place_t RX10_TEMP48 = /* here  */ _here(); 
const uint32_t RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48 ; 
if ( RX10_TEMP49 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP47 = "Bad place access for array sumArray" ; 
fprintf(stderr, "%s",RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP50 = getRefArrayValue2double ( sumArray , RX10_TEMP42 ) ; 
const double localSumCurr = RX10_TEMP50 ; 
localSumTemp = localSumTemp + localSumCurr ; } 

const uint32_t isNotEqual = localSumTemp != zero ; 
if ( isNotEqual ) 
{ 
const int32_t index = /* thisPlace . id  */ thisPlace; 
const double localSum = localSumTemp ; 
struct T16 utmp16  ; 
T16_T16( &utmp16/*OBJECT INIT IN ASSIGNMENT*/, localSum , index , localSumArray ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC12) ;
a.size = sizeof(utmp16 );
a.params = (void *)(&utmp16 );
task_dispatch(a, source );


}/*END OF ASYNC*/
} 

} 
} 

void /*static*/thread11 (  struct T11 const utmpz ) 
{ 
struct doubleStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
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

void /*static*/thread13 (  struct T13 const utmpz ) 
{ 
const double val = utmpz .val ; 
struct doubleRefArray1 result = utmpz .result ; 

{ 
const int32_t X10_TEMP18 = 0 ; 
const double X10_TEMP20 = val ; 
struct Point1 RX10_TEMP38  ; 
Point1_Point1( &RX10_TEMP38/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP18 ) ; 
struct Dist1 RX10_TEMP39 = result .distValue ; 
struct Region1 RX10_TEMP40 = RX10_TEMP39 .dReg ; 
const int32_t RX10_TEMP41 = searchPointInRegion1 ( RX10_TEMP40 , RX10_TEMP38 ) ; 
const int32_t RX10_TEMP42 = 0 ; 
const uint32_t RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; 
if ( RX10_TEMP43 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP44 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP44 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP45 = getPlaceFromDist1 ( RX10_TEMP39 , RX10_TEMP41 ) ; 
const place_t RX10_TEMP47 = /* here  */ _here(); 
const uint32_t RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; 
if ( RX10_TEMP48 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP46 = "Bad place access for array result" ; 
fprintf(stderr, "%s",RX10_TEMP46 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( result , RX10_TEMP41 , X10_TEMP20 ) ; 
} 
} 

void /*static*/thread14 (  struct T14 const utmpz ) 
{ 
struct Point2 ij = utmpz .ij ; 
const double one_minus_omega = utmpz .one_minus_omega ; 
const double omega_over_four = utmpz .omega_over_four ; 
struct doubleRefArray2 G = utmpz .G ; 
struct SOR * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
const int32_t X10_TEMP75 = 1 ; 
const int32_t X10_TEMP76 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP79 = X10_TEMP76 - X10_TEMP75 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP80 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP27 = ij .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP28 = ij .f1 ; 
RX10_TEMP27 = RX10_TEMP27 + X10_TEMP79 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP80 ; struct Point2 X10_TEMP82  ; 
Point2_Point2( &X10_TEMP82/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP27 , RX10_TEMP28 ) ; 
const double X10_TEMP90 = SOR_read ( X10_TEMP0 , G , X10_TEMP82 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP86 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP87 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP29 = ij .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP30 = ij .f1 ; 
RX10_TEMP29 = RX10_TEMP29 + X10_TEMP86 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP87 ; struct Point2 X10_TEMP89  ; 
Point2_Point2( &X10_TEMP89/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP29 , RX10_TEMP30 ) ; 
const double X10_TEMP91 = SOR_read ( X10_TEMP0 , G , X10_TEMP89 ) ; 
const double X10_TEMP100 = X10_TEMP90 + X10_TEMP91 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP96 = 0 ; 
const int32_t X10_TEMP93 = 1 ; 
const int32_t X10_TEMP94 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP97 = X10_TEMP94 - X10_TEMP93 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP31 = ij .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP32 = ij .f1 ; 
RX10_TEMP31 = RX10_TEMP31 + X10_TEMP96 ; RX10_TEMP32 = RX10_TEMP32 + X10_TEMP97 ; struct Point2 X10_TEMP99  ; 
Point2_Point2( &X10_TEMP99/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP31 , RX10_TEMP32 ) ; 
struct Dist2 RX10_TEMP33 = G .distValue ; 
struct Region2 RX10_TEMP34 = RX10_TEMP33 .dReg ; 
const int32_t RX10_TEMP35 = searchPointInRegion2 ( RX10_TEMP34 , X10_TEMP99 ) ; 
const int32_t RX10_TEMP36 = 0 ; 
const uint32_t RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; 
if ( RX10_TEMP37 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP39 = getPlaceFromDist2 ( RX10_TEMP33 , RX10_TEMP35 ) ; 
const place_t RX10_TEMP41 = /* here  */ _here(); 
const uint32_t RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP40 = "Bad place access for array G" ; 
fprintf(stderr, "%s",RX10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP43 = getRefArrayValue2double ( G , RX10_TEMP35 ) ; 
const double X10_TEMP101 = RX10_TEMP43 ; 
const double X10_TEMP108 = X10_TEMP100 + X10_TEMP101 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP104 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP105 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP44 = ij .f0 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP45 = ij .f1 ; 
RX10_TEMP44 = RX10_TEMP44 + X10_TEMP104 ; RX10_TEMP45 = RX10_TEMP45 + X10_TEMP105 ; struct Point2 X10_TEMP107  ; 
Point2_Point2( &X10_TEMP107/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP44 , RX10_TEMP45 ) ; 
struct Dist2 RX10_TEMP46 = G .distValue ; 
struct Region2 RX10_TEMP47 = RX10_TEMP46 .dReg ; 
const int32_t RX10_TEMP48 = searchPointInRegion2 ( RX10_TEMP47 , X10_TEMP107 ) ; 
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
char * RX10_TEMP53 = "Bad place access for array G" ; 
fprintf(stderr, "%s",RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP56 = getRefArrayValue2double ( G , RX10_TEMP48 ) ; 
const double X10_TEMP109 = RX10_TEMP56 ; 
const double X10_TEMP111 = X10_TEMP108 + X10_TEMP109 ; 
const double X10_TEMP114 = omega_over_four * X10_TEMP111 ; 
struct Dist2 RX10_TEMP57 = G .distValue ; 
struct Region2 RX10_TEMP58 = RX10_TEMP57 .dReg ; 
const int32_t RX10_TEMP59 = searchPointInRegion2 ( RX10_TEMP58 , ij ) ; 
const int32_t RX10_TEMP60 = 0 ; 
const uint32_t RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60 ; 
if ( RX10_TEMP61 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP62 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP62 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP63 = getPlaceFromDist2 ( RX10_TEMP57 , RX10_TEMP59 ) ; 
const place_t RX10_TEMP65 = /* here  */ _here(); 
const uint32_t RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65 ; 
if ( RX10_TEMP66 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP64 = "Bad place access for array G" ; 
fprintf(stderr, "%s",RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP67 = getRefArrayValue2double ( G , RX10_TEMP59 ) ; 
const double X10_TEMP113 = RX10_TEMP67 ; 
const double X10_TEMP115 = one_minus_omega * X10_TEMP113 ; 
const double X10_TEMP117 = X10_TEMP114 + X10_TEMP115 ; 
const double X10_TEMP118 = X10_TEMP117 ; 
struct Dist2 RX10_TEMP68 = G .distValue ; 
struct Region2 RX10_TEMP69 = RX10_TEMP68 .dReg ; 
const int32_t RX10_TEMP70 = searchPointInRegion2 ( RX10_TEMP69 , ij ) ; 
const int32_t RX10_TEMP71 = 0 ; 
const uint32_t RX10_TEMP72 = RX10_TEMP70 < RX10_TEMP71 ; 
if ( RX10_TEMP72 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP73 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP73 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP74 = getPlaceFromDist2 ( RX10_TEMP68 , RX10_TEMP70 ) ; 
const place_t RX10_TEMP76 = /* here  */ _here(); 
const uint32_t RX10_TEMP77 = RX10_TEMP74 != RX10_TEMP76 ; 
if ( RX10_TEMP77 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP75 = "Bad place access for array G" ; 
fprintf(stderr, "%s",RX10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( G , RX10_TEMP70 , X10_TEMP118 ) ; 
} 
} 

void /*static*/thread15 (  struct T15 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void /*static*/thread16 (  struct T16 const utmpz ) 
{ 
const double localSum = utmpz .localSum ; 
const int32_t index = utmpz .index ; 
struct doubleRefArray1 localSumArray = utmpz .localSumArray ; 

{ 
struct Point1 RX10_TEMP51  ; 
Point1_Point1( &RX10_TEMP51/*OBJECT INIT IN ASSIGNMENT*/, index ) ; 
struct Dist1 RX10_TEMP52 = localSumArray .distValue ; 
struct Region1 RX10_TEMP53 = RX10_TEMP52 .dReg ; 
const int32_t RX10_TEMP54 = searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP55 = 0 ; 
const uint32_t RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP57 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP57 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP58 = getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; 
const place_t RX10_TEMP60 = /* here  */ _here(); 
const uint32_t RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; 
if ( RX10_TEMP61 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP59 = "Bad place access for array localSumArray" ; 
fprintf(stderr, "%s",RX10_TEMP59 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( localSumArray , RX10_TEMP54 , localSum ) ; 
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

T2 T2_T2 ( struct T2 *T2THIS, const double a_v ,  struct Point2 const a_p ,  struct doubleRefArray2 const a_t ) 
{ 
T2THIS->v = ( a_v ) ; 
T2THIS->p = ( a_p ) ; 
T2THIS->t = ( a_t ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T3THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T3THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T3THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T3THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const place_t a_phere ,  struct doubleRefArray1 const a_result ,  struct Point2 const a_pt ,  struct doubleRefArray2 const a_G ) 
{ 
T4THIS->phere = ( a_phere ) ; 
T4THIS->result = ( a_result ) ; 
T4THIS->pt = ( a_pt ) ; 
T4THIS->G = ( a_G ) ; 

 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS,  struct Point2 const a_pt ,  struct Point2 const a_po , const double a_one_minus_omega , const double a_omega_over_four ,  struct doubleRefArray2 const a_G ,  struct SOR  * const a_X10_TEMP0 ) 
{ 
T5THIS->pt = ( a_pt ) ; 
T5THIS->po = ( a_po ) ; 
T5THIS->one_minus_omega = ( a_one_minus_omega ) ; 
T5THIS->omega_over_four = ( a_omega_over_four ) ; 
T5THIS->G = ( a_G ) ; 
T5THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 , const double a_initVal ) 
{ 
T6THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T6THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T6THIS->initVal = ( a_initVal ) ; 

 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS,  struct doubleRefArray1 const a_localSumArray , const place_t a_source , const int32_t a_zero ,  struct doubleRefArray2 const a_sumArray ) 
{ 
T7THIS->localSumArray = ( a_localSumArray ) ; 
T7THIS->source = ( a_source ) ; 
T7THIS->zero = ( a_zero ) ; 
T7THIS->sumArray = ( a_sumArray ) ; 

 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T8THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T8THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T8THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T8THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T8THIS->THIS = *TimerTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T9THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T9THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T9THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T9THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T9THIS->THIS = *TimerTHIS;
 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T10THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T10THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T10THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T10THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T10THIS->THIS = *TimerTHIS;
 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T11THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T11THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T11THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T12THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T12THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T12THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, const double a_val ,  struct doubleRefArray1 const a_result ) 
{ 
T13THIS->val = ( a_val ) ; 
T13THIS->result = ( a_result ) ; 

 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS,  struct Point2 const a_ij , const double a_one_minus_omega , const double a_omega_over_four ,  struct doubleRefArray2 const a_G ,  struct SOR  * const a_X10_TEMP0 ) 
{ 
T14THIS->ij = ( a_ij ) ; 
T14THIS->one_minus_omega = ( a_one_minus_omega ) ; 
T14THIS->omega_over_four = ( a_omega_over_four ) ; 
T14THIS->G = ( a_G ) ; 
T14THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T15THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T15THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T15THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T15THIS; 

} 

T16 T16_T16 ( struct T16 *T16THIS, const double a_localSum , const int32_t a_index ,  struct doubleRefArray1 const a_localSumArray ) 
{ 
T16THIS->localSum = ( a_localSum ) ; 
T16THIS->index = ( a_index ) ; 
T16THIS->localSumArray = ( a_localSumArray ) ; 

 return  *T16THIS; 

} 

T17 T17_T17 ( struct T17 *T17THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T17THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T17THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T17THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T17THIS->THIS = *TimerTHIS;
 return  *T17THIS; 

} 

T18 T18_T18 ( struct T18 *T18THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T18THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T18THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T18THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T18THIS->THIS = *TimerTHIS;
 return  *T18THIS; 

} 

T19 T19_T19 ( struct T19 *T19THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T19THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T19THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T19THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T19THIS->THIS = *TimerTHIS;
 return  *T19THIS; 

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
void * TEMPCALLOCPOINTER92;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER92 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER92)[0] = RX10_TEMP5, TEMPCALLOCPOINTER92 = ((int32_t * )TEMPCALLOCPOINTER92)+1, memset(TEMPCALLOCPOINTER92,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
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
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC13) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER93;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER93 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER93)[0] = RX10_TEMP4, TEMPCALLOCPOINTER93 = ((int32_t * )TEMPCALLOCPOINTER93)+1, memset(TEMPCALLOCPOINTER93,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER94;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER94 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER94)[0] = RX10_TEMP26, TEMPCALLOCPOINTER94 = ((int32_t * )TEMPCALLOCPOINTER94)+1, memset(TEMPCALLOCPOINTER94,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC14) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER95;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER95 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER95)[0] = RX10_TEMP25, TEMPCALLOCPOINTER95 = ((int32_t * )TEMPCALLOCPOINTER95)+1, memset(TEMPCALLOCPOINTER95,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER96;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER96 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER96)[0] = RX10_TEMP47, TEMPCALLOCPOINTER96 = ((int32_t * )TEMPCALLOCPOINTER96)+1, memset(TEMPCALLOCPOINTER96,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC15) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER97;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER97 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER97)[0] = RX10_TEMP46, TEMPCALLOCPOINTER97 = ((int32_t * )TEMPCALLOCPOINTER97)+1, memset(TEMPCALLOCPOINTER97,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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

void thread8 ( struct Timer *TimerTHIS,  struct T8 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER99;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER99 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER99)[0] = RX10_TEMP14, TEMPCALLOCPOINTER99 = ((int32_t * )TEMPCALLOCPOINTER99)+1, memset(TEMPCALLOCPOINTER99,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T17 utmp17  ; 
T17_T17( &utmp17/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC16) ;
a.size = sizeof(utmp17 );
a.params = (void *)(&utmp17 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread9 ( struct Timer *TimerTHIS,  struct T9 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER101;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER101 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER101)[0] = RX10_TEMP35, TEMPCALLOCPOINTER101 = ((int32_t * )TEMPCALLOCPOINTER101)+1, memset(TEMPCALLOCPOINTER101,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T18 utmp18  ; 
T18_T18( &utmp18/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC17) ;
a.size = sizeof(utmp18 );
a.params = (void *)(&utmp18 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER103;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER103 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER103)[0] = RX10_TEMP56, TEMPCALLOCPOINTER103 = ((int32_t * )TEMPCALLOCPOINTER103)+1, memset(TEMPCALLOCPOINTER103,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T19 utmp19  ; 
T19_T19( &utmp19/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC18) ;
a.size = sizeof(utmp19 );
a.params = (void *)(&utmp19 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread17 ( struct Timer *TimerTHIS,  struct T17 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread18 ( struct Timer *TimerTHIS,  struct T18 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread19 ( struct Timer *TimerTHIS,  struct T19 const utmpz ) 
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

SOR *SOR_SOR ( struct SOR *SORTHIS) 
{ 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP2 = /*program*/_SOR_RANDOM_SEED ; 
struct Random * X10_TEMP4 = (struct Random  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Random ))),malloc(sizeof(struct Random )));  
memset(X10_TEMP4,0,sizeof(struct Random )); 
Random_Random( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
SORTHIS->R = ( X10_TEMP4 ) ; 

 return  SORTHIS; 

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
void * TEMPCALLOCPOINTER107;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER107 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(countDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER107)[0] = countDist, TEMPCALLOCPOINTER107 = ((int32_t * )TEMPCALLOCPOINTER107)+1, memset(TEMPCALLOCPOINTER107,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER108;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER108 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(runSumDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER108)[0] = runSumDist, TEMPCALLOCPOINTER108 = ((int32_t * )TEMPCALLOCPOINTER108)+1, memset(TEMPCALLOCPOINTER108,0,runSumDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER109;
/*VALUE ARRAY*/ int32_t * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

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
_SOR_JACOBI_NUM_ITER = _SOR_JACOBI_NUM_ITER_init ( ) ; 
_SOR_RANDOM_SEED = _SOR_RANDOM_SEED_init ( ) ; 
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_SOR_JACOBI_NUM_ITER = _SOR_JACOBI_NUM_ITER_init ( ) ; 
_SOR_RANDOM_SEED = _SOR_RANDOM_SEED_init ( ) ; 
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
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
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(*(struct T6 * const )params);
		break;
	 case ASYNC6 :
		 fixPointerT7(((struct T7 * const )params), (params+sizeof(struct T7)));
		thread7(*(struct T7 * const )params);
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
		 fixPointerT13(((struct T13 * const )params), (params+sizeof(struct T13)));
		thread13(*(struct T13 * const )params);
		break;
	 case ASYNC10 :
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(*(struct T14 * const )params);
		break;
	 case ASYNC11 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(*(struct T15 * const )params);
		break;
	 case ASYNC12 :
		 fixPointerT16(((struct T16 * const )params), (params+sizeof(struct T16)));
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC13 :
		 fixPointerT8(((struct T8 * const )params), (params+sizeof(struct T8)));
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC14 :
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC15 :
		 fixPointerT10(((struct T10 * const )params), (params+sizeof(struct T10)));
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC16 :
		 fixPointerT17(((struct T17 * const )params), (params+sizeof(struct T17)));
		thread17(&(*((struct T17 * const )params)).THIS, *((struct T17 * const )params));
		break;
	 case ASYNC17 :
		 fixPointerT18(((struct T18 * const )params), (params+sizeof(struct T18)));
		thread18(&(*((struct T18 * const )params)).THIS, *((struct T18 * const )params));
		break;
	 case ASYNC18 :
		 fixPointerT19(((struct T19 * const )params), (params+sizeof(struct T19)));
		thread19(&(*((struct T19 * const )params)).THIS, *((struct T19 * const )params));
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
		thread11(*(struct T11 * const )params);
		break;
	 case ASYNC8 :
		thread12(*(struct T12 * const )params);
		break;
	 case ASYNC9 :
		thread13(*(struct T13 * const )params);
		break;
	 case ASYNC10 :
		thread14(*(struct T14 * const )params);
		break;
	 case ASYNC11 :
		thread15(*(struct T15 * const )params);
		break;
	 case ASYNC12 :
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC13 :
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC14 :
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC15 :
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC16 :
		thread17(&(*((struct T17 * const )params)).THIS, *((struct T17 * const )params));
		break;
	 case ASYNC17 :
		thread18(&(*((struct T18 * const )params)).THIS, *((struct T18 * const )params));
		break;
	 case ASYNC18 :
		thread19(&(*((struct T19 * const )params)).THIS, *((struct T19 * const )params));
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
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC10 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT15((struct T15 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT15((struct T15 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT16((struct T16 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT16((struct T16 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC14 :
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC15 :
		 sizeToMalloc = child.size+ getSizeOfT10((struct T10 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT10((struct T10 * const )child.params,(buf+headerSize+child.size));
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
    temp += getSizeOfdoubleRefArray1(&(className -> localSumArray));
    temp += getSizeOfdoubleRefArray2(&(className -> sumArray));
return temp;
 }
int32_t getSizeOfT4( struct T4 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> result));
    temp += getSizeOfPoint2(&(className -> pt));
    temp += getSizeOfdoubleRefArray2(&(className -> G));
return temp;
 }
int32_t getSizeOfT5( struct T5 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint2(&(className -> pt));
    temp += getSizeOfPoint2(&(className -> po));
    temp += getSizeOfdoubleRefArray2(&(className -> G));
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
    temp += getSizeOfPoint2(&(className -> p));
    temp += getSizeOfdoubleRefArray2(&(className -> t));
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
return temp;
 }
int32_t getSizeOfT11( struct T11 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP15));
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
    temp += getSizeOfdoubleRefArray1(&(className -> result));
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
    temp += getSizeOfPoint2(&(className -> ij));
    temp += getSizeOfdoubleRefArray2(&(className -> G));
return temp;
 }
int32_t getSizeOfT15( struct T15 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT16( struct T16 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleRefArray1(&(className -> localSumArray));
return temp;
 }
int32_t getSizeOfT17( struct T17 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT18( struct T18 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT19( struct T19 * className) {
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
offset = deepCopydoubleRefArray1(&(className -> localSumArray), offset);
offset = deepCopydoubleRefArray2(&(className -> sumArray), offset);
return offset;
 }
void* deepCopyT4( struct T4 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> result), offset);
offset = deepCopyPoint2(&(className -> pt), offset);
offset = deepCopydoubleRefArray2(&(className -> G), offset);
return offset;
 }
void* deepCopyT5( struct T5 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint2(&(className -> pt), offset);
offset = deepCopyPoint2(&(className -> po), offset);
offset = deepCopydoubleRefArray2(&(className -> G), offset);
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
offset = deepCopyPoint2(&(className -> p), offset);
offset = deepCopydoubleRefArray2(&(className -> t), offset);
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
return offset;
 }
void* deepCopyT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP15), offset);
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
offset = deepCopydoubleRefArray1(&(className -> result), offset);
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
offset = deepCopyPoint2(&(className -> ij), offset);
offset = deepCopydoubleRefArray2(&(className -> G), offset);
return offset;
 }
void* deepCopyT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT16( struct T16 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleRefArray1(&(className -> localSumArray), offset);
return offset;
 }
void* deepCopyT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT19( struct T19 * className, void * offset) {
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
offset  = fixPointerdoubleRefArray1(&(className -> localSumArray), offset);
offset  = fixPointerdoubleRefArray2(&(className -> sumArray), offset);
return offset;
 }
void * fixPointerT4( struct T4 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> result), offset);
offset  = fixPointerPoint2(&(className -> pt), offset);
offset  = fixPointerdoubleRefArray2(&(className -> G), offset);
return offset;
 }
void * fixPointerT5( struct T5 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint2(&(className -> pt), offset);
offset  = fixPointerPoint2(&(className -> po), offset);
offset  = fixPointerdoubleRefArray2(&(className -> G), offset);
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
offset  = fixPointerPoint2(&(className -> p), offset);
offset  = fixPointerdoubleRefArray2(&(className -> t), offset);
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
return offset;
 }
void * fixPointerT11( struct T11 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP15), offset);
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
offset  = fixPointerdoubleRefArray1(&(className -> result), offset);
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
offset  = fixPointerPoint2(&(className -> ij), offset);
offset  = fixPointerdoubleRefArray2(&(className -> G), offset);
return offset;
 }
void * fixPointerT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT16( struct T16 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleRefArray1(&(className -> localSumArray), offset);
return offset;
 }
void * fixPointerT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
