#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int32_t _RayTracer_alpha ;
struct Vec /*VALUE*/ _RayTracer_voidVec ;
int32_t _Scene_maxObjects ;
int32_t _Scene_maxLights ;
int32_t _Timer_max_counters ;
int32_t /*static*/_RayTracer_alpha_init ( ) 
{ 
const int32_t X10_TEMP1 = 255 ; 
const int32_t X10_TEMP2 = 24 ; 
const int32_t X10_TEMP4 = X10_TEMP1 << X10_TEMP2 ; 
return X10_TEMP4 ; 
} 

Vec /*static*/_RayTracer_voidVec_init ( ) 
{ 
struct Vec X10_TEMP2  ; 
Vec_Vec_0( &X10_TEMP2/*OBJECT INIT IN ASSIGNMENT*/) ; 
return X10_TEMP2 ; 
} 

void /*static*/RayTracer_JGFsetsize (  struct RayTracer  * const X10_TEMP0 , const int32_t sizet ) 
{ 

{ 
const int64_t X10_TEMP2 = 0 ; 
const int64_t X10_TEMP3 = X10_TEMP2 ; 
X10_TEMP0 ->checksum = ( X10_TEMP3 ) ; 
const int32_t X10_TEMP6 = 0 ; 
const int32_t X10_TEMP7 = 1 ; 
struct Region1 X10_TEMP8 = createNewRegion1R ( X10_TEMP6 , X10_TEMP7 ) ; 
const place_t X10_TEMP9 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 d1 = getPlaceDist1 ( X10_TEMP8 , X10_TEMP9 ) ; 
struct Region1 RX10_TEMP0 = d1 .dReg ; 
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
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d1 , RX10_TEMP9 ) ; 
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
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER2 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER2)[0] = RX10_TEMP4, TEMPCALLOCPOINTER2 = ((int32_t * )TEMPCALLOCPOINTER2)+1, memset(TEMPCALLOCPOINTER2,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d1 , RX10_TEMP16 ) ; 
struct intRefArray1 X10_TEMP12 = RX10_TEMP19 ; 
struct intRefArray1 X10_TEMP13 = X10_TEMP12 ; 
X10_TEMP0 ->datasizes = ( X10_TEMP13 ) ; 
struct intRefArray1 X10_TEMP14 = X10_TEMP0 ->datasizes ; 
const int32_t X10_TEMP16 = 0 ; 
const int32_t X10_TEMP18 = 20 ; 
const int32_t X10_TEMP19 = X10_TEMP18 ; 
struct Point1 RX10_TEMP20  ; 
Point1_Point1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP16 ) ; 
struct Dist1 RX10_TEMP21 = X10_TEMP14 .distValue ; 
struct Region1 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; 
const int32_t RX10_TEMP24 = 0 ; 
const uint32_t RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; 
if ( RX10_TEMP25 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP26 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP27 = getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const uint32_t RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP28 = "Bad place access for array X10_TEMP14" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( X10_TEMP14 , RX10_TEMP23 , X10_TEMP19 ) ; 
struct intRefArray1 X10_TEMP20 = X10_TEMP0 ->datasizes ; 
const int32_t X10_TEMP22 = 1 ; 
const int32_t X10_TEMP24 = 500 ; 
const int32_t X10_TEMP25 = X10_TEMP24 ; 
struct Point1 RX10_TEMP31  ; 
Point1_Point1( &RX10_TEMP31/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP22 ) ; 
struct Dist1 RX10_TEMP32 = X10_TEMP20 .distValue ; 
struct Region1 RX10_TEMP33 = RX10_TEMP32 .dReg ; 
const int32_t RX10_TEMP34 = searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; 
const int32_t RX10_TEMP35 = 0 ; 
const uint32_t RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP38 = getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; 
const place_t RX10_TEMP40 = /* here  */ _here(); 
const uint32_t RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; 
if ( RX10_TEMP41 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Bad place access for array X10_TEMP20" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( X10_TEMP20 , RX10_TEMP34 , X10_TEMP25 ) ; 
const int32_t X10_TEMP27 = sizet ; 
X10_TEMP0 ->sizet = ( X10_TEMP27 ) ; 
} 
} 

void /*static*/RayTracer_JGFinitialise (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
struct intRefArray1 X10_TEMP1 = X10_TEMP0 ->datasizes ; 
const int32_t X10_TEMP3 = X10_TEMP0 ->sizet ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP3 ) ; 
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

const int32_t RX10_TEMP11 = getRefArrayValue1int ( X10_TEMP1 , RX10_TEMP3 ) ; 
const int32_t X10_TEMP5 = RX10_TEMP11 ; 
const int32_t X10_TEMP6 = X10_TEMP5 ; 
X10_TEMP0 ->width = ( X10_TEMP6 ) ; 
struct intRefArray1 X10_TEMP7 = X10_TEMP0 ->datasizes ; 
const int32_t X10_TEMP9 = X10_TEMP0 ->sizet ; 
struct Point1 RX10_TEMP12  ; 
Point1_Point1( &RX10_TEMP12/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP9 ) ; 
struct Dist1 RX10_TEMP13 = X10_TEMP7 .distValue ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
const int32_t RX10_TEMP15 = searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; 
const int32_t RX10_TEMP16 = 0 ; 
const uint32_t RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP18 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP18 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP19 = getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; 
const place_t RX10_TEMP21 = /* here  */ _here(); 
const uint32_t RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; 
if ( RX10_TEMP22 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP20 = "Bad place access for array X10_TEMP7" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP23 = getRefArrayValue1int ( X10_TEMP7 , RX10_TEMP15 ) ; 
const int32_t X10_TEMP11 = RX10_TEMP23 ; 
const int32_t X10_TEMP12 = X10_TEMP11 ; 
X10_TEMP0 ->height = ( X10_TEMP12 ) ; 
struct Scene * X10_TEMP14 = RayTracer_createScene ( X10_TEMP0 ) ; 
struct Scene * X10_TEMP15 = X10_TEMP14 ; 
X10_TEMP0 ->scene = ( X10_TEMP15 ) ; 
struct Scene * X10_TEMP17 = X10_TEMP0 ->scene ; 
RayTracer_setScene ( X10_TEMP0 , X10_TEMP17 ) ; 
struct Scene * X10_TEMP18 = X10_TEMP0 ->scene ; 
const int32_t X10_TEMP20 = Scene_getObjects ( X10_TEMP18 ) ; 
const int32_t X10_TEMP21 = X10_TEMP20 ; 
X10_TEMP0 ->numobjects = ( X10_TEMP21 ) ; 
} 
} 

void /*static*/RayTracer_JGFapplication (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP7 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP8 = X10_TEMP0 ->width ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP9 = X10_TEMP0 ->height ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP10 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP11 = X10_TEMP0 ->height ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP12 = 1 ; 
/*UpdatableVariableDeclaration*/
 struct Interval interval = Interval_Interval( &interval/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP7 , X10_TEMP8 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 , X10_TEMP12 ) ; 
RayTracer_render ( X10_TEMP0 , interval ) ; 
} 
} 

void /*static*/RayTracer_JGFvalidate (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
const int32_t X10_TEMP3 = 0 ; 
const int32_t X10_TEMP4 = 1 ; 
struct Region1 X10_TEMP5 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const place_t X10_TEMP6 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 d1 = getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; 
struct Region1 RX10_TEMP0 = d1 .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER3;
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct longStub * ) ( TEMPCALLOCPOINTER3 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( longStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( longStub )))),((int32_t * )TEMPCALLOCPOINTER3)[0] = RX10_TEMP5, TEMPCALLOCPOINTER3 = ((int32_t * )TEMPCALLOCPOINTER3)+1, memset(TEMPCALLOCPOINTER3,0,RX10_TEMP5*sizeof(longStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d1 , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER4;
/*VALUE ARRAY*/ struct longStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct longStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER4 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( longStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( longStub )))),((int32_t * )TEMPCALLOCPOINTER4)[0] = RX10_TEMP4, TEMPCALLOCPOINTER4 = ((int32_t * )TEMPCALLOCPOINTER4)+1, memset(TEMPCALLOCPOINTER4,0,RX10_TEMP4*sizeof(longStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct longStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct longRefArray1 RX10_TEMP19  ; 
longRefArray1_longRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d1 , RX10_TEMP16 ) ; 
/*UpdatableVariableDeclaration*/
 struct longRefArray1 refval = RX10_TEMP19 ; 
const int32_t X10_TEMP10 = 0 ; 
const int64_t X10_TEMP12 = 51428 ; 
const int64_t X10_TEMP13 = X10_TEMP12 ; 
struct Point1 RX10_TEMP20  ; 
Point1_Point1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP10 ) ; 
struct Dist1 RX10_TEMP21 = refval .distValue ; 
struct Region1 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; 
const int32_t RX10_TEMP24 = 0 ; 
const uint32_t RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; 
if ( RX10_TEMP25 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP26 = "Array index out of bounds" ; 
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

setRefArrayValue1long ( refval , RX10_TEMP23 , X10_TEMP13 ) ; 
const int32_t X10_TEMP15 = 1 ; 
const int64_t X10_TEMP17 = 29827635 ; 
const int64_t X10_TEMP18 = X10_TEMP17 ; 
struct Point1 RX10_TEMP31  ; 
Point1_Point1( &RX10_TEMP31/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP15 ) ; 
struct Dist1 RX10_TEMP32 = refval .distValue ; 
struct Region1 RX10_TEMP33 = RX10_TEMP32 .dReg ; 
const int32_t RX10_TEMP34 = searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; 
const int32_t RX10_TEMP35 = 0 ; 
const uint32_t RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP38 = getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; 
const place_t RX10_TEMP40 = /* here  */ _here(); 
const uint32_t RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; 
if ( RX10_TEMP41 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1long ( refval , RX10_TEMP34 , X10_TEMP18 ) ; 
const int64_t X10_TEMP21 = X10_TEMP0 ->checksum ; 
const int32_t X10_TEMP20 = X10_TEMP0 ->sizet ; 
struct Point1 RX10_TEMP42  ; 
Point1_Point1( &RX10_TEMP42/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP20 ) ; 
struct Dist1 RX10_TEMP43 = refval .distValue ; 
struct Region1 RX10_TEMP44 = RX10_TEMP43 .dReg ; 
const int32_t RX10_TEMP45 = searchPointInRegion1 ( RX10_TEMP44 , RX10_TEMP42 ) ; 
const int32_t RX10_TEMP46 = 0 ; 
const uint32_t RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP48 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP48 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP49 = getPlaceFromDist1 ( RX10_TEMP43 , RX10_TEMP45 ) ; 
const place_t RX10_TEMP51 = /* here  */ _here(); 
const uint32_t RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; 
if ( RX10_TEMP52 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP50 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP53 = getRefArrayValue1long ( refval , RX10_TEMP45 ) ; 
const int64_t X10_TEMP22 = RX10_TEMP53 ; 
/*UpdatableVariableDeclaration*/
int64_t dev = X10_TEMP21 - X10_TEMP22 ; 
const int32_t X10_TEMP24 = 0 ; 
const uint32_t X10_TEMP26 = dev != X10_TEMP24 ; 
if ( X10_TEMP26 ) 
{ 

{ 
const char * X10_TEMP28 = "Validation failed" ; 
fprintf(  stdout, "%s\n",X10_TEMP28 ) ; 
const char * X10_TEMP29 = "Pixel checksum = " ; 
const int64_t X10_TEMP30 = X10_TEMP0 ->checksum ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC1, "%s%lld",X10_TEMP29,X10_TEMP30);
const char * X10_TEMP32 = tempC1;; 
fprintf(  stdout, "%s\n",X10_TEMP32 ) ; 
const char * X10_TEMP35 = "Reference value = " ; 
const int32_t X10_TEMP34 = X10_TEMP0 ->sizet ; 
struct Point1 RX10_TEMP54  ; 
Point1_Point1( &RX10_TEMP54/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP34 ) ; 
struct Dist1 RX10_TEMP55 = refval .distValue ; 
struct Region1 RX10_TEMP56 = RX10_TEMP55 .dReg ; 
const int32_t RX10_TEMP57 = searchPointInRegion1 ( RX10_TEMP56 , RX10_TEMP54 ) ; 
const int32_t RX10_TEMP58 = 0 ; 
const uint32_t RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58 ; 
if ( RX10_TEMP59 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP60 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP60 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP61 = getPlaceFromDist1 ( RX10_TEMP55 , RX10_TEMP57 ) ; 
const place_t RX10_TEMP63 = /* here  */ _here(); 
const uint32_t RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63 ; 
if ( RX10_TEMP64 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP62 = "Bad place access for array refval" ; 
fprintf(stderr, "%s",RX10_TEMP62 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP65 = getRefArrayValue1long ( refval , RX10_TEMP57 ) ; 
const int64_t X10_TEMP36 = RX10_TEMP65 ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC2, "%s%lld",X10_TEMP35,X10_TEMP36);
const char * X10_TEMP38 = tempC2;; 
fprintf(  stdout, "%s\n",X10_TEMP38 ) ; 
const char * X10_TEMP40 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 
} 

} 
} 

void /*static*/RayTracer_JGFtidyup (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
} 
} 

void /*static*/RayTracer_run (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
const int32_t X10_TEMP2 = 0 ; 
RayTracer_JGFsetsize ( X10_TEMP0 , X10_TEMP2 ) ; 
RayTracer_JGFinitialise ( X10_TEMP0 ) ; 
RayTracer_JGFapplication ( X10_TEMP0 ) ; 
RayTracer_JGFvalidate ( X10_TEMP0 ) ; 
RayTracer_JGFtidyup ( X10_TEMP0 ) ; 
} 
} 

Scene  * /*static*/RayTracer_createScene (  struct RayTracer  * const X10_TEMP0 ) 
{ 

{ 
const int32_t x = 0 ; 
const int32_t y = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP9 = 20 ; 
const int32_t X10_TEMP5 = 30 ; 
const int32_t X10_TEMP6 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP10 = X10_TEMP6 - X10_TEMP5 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP11 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP36 = Vec_Vec_4( &X10_TEMP36/*OBJECT INIT IN ASSIGNMENT*/, x , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP17 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP18 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP37 = Vec_Vec_4( &X10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, x , y , X10_TEMP17 , X10_TEMP18 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP24 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP26 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP27 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP38 = Vec_Vec_4( &X10_TEMP38/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP24 , X10_TEMP25 , X10_TEMP26 , X10_TEMP27 ) ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP39 = 1.0; 
const double X10_TEMP30 = 35.0; 
const double X10_TEMP31 = 3.14159265; 
const double X10_TEMP32 = X10_TEMP30 * X10_TEMP31 ; 
const double X10_TEMP33 = 180.0; 
/*UpdatableVariableDeclaration*/
double X10_TEMP40 = X10_TEMP32 / X10_TEMP33 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP41 = 1.0; 
/*UpdatableVariableDeclaration*/
 struct View X10_TEMP43 = View_View( &X10_TEMP43/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP36 , X10_TEMP37 , X10_TEMP38 , X10_TEMP39 , X10_TEMP40 , X10_TEMP41 ) ; 
/*UpdatableVariableDeclaration*/
 struct Scene  * scene = (struct Scene  *) ((((_task*)_thread_getspecific()) -> total_memory_class) += 4*ceil(0.25 *(  sizeof(struct Scene ))),malloc(sizeof(struct Scene )));  
memset(scene,0,sizeof(struct Scene )); 
Scene_Scene( scene/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP43 ) ; 
const int32_t nx = 4 ; 
const int32_t ny = 4 ; 
const int32_t nz = 4 ; 
const int32_t X10_TEMP51 = 0 ; 
const int32_t X10_TEMP49 = 1 ; 
const int32_t X10_TEMP52 = nx - X10_TEMP49 ; 
const int32_t X10_TEMP56 = 0 ; 
const int32_t X10_TEMP54 = 1 ; 
const int32_t X10_TEMP57 = ny - X10_TEMP54 ; 
const int32_t X10_TEMP61 = 0 ; 
const int32_t X10_TEMP59 = 1 ; 
const int32_t X10_TEMP62 = nz - X10_TEMP59 ; 
struct Region3 reg = createNewRegion3RRR ( X10_TEMP51 , X10_TEMP52 , X10_TEMP56 , X10_TEMP57 , X10_TEMP61 , X10_TEMP62 ) ; 
const int32_t RX10_TEMP3 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP1 = reg .regSize ; 
RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; const int32_t RX10_TEMP2 = RX10_TEMP1 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP2; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP4 = /*PointAccess*/RX10_TEMP0 ; 
struct Point3 pp = regionOrdinalPoint3 ( reg , RX10_TEMP4 ) ; 

{ 
const double X10_TEMP68 = 20.0; 
const int32_t X10_TEMP65 = 1 ; 
const int32_t X10_TEMP67 = nx - X10_TEMP65 ; 
const double X10_TEMP70 = X10_TEMP68 / X10_TEMP67 ; 
const int32_t X10_TEMP71 = pp .f0 ; 
const double X10_TEMP72 = X10_TEMP70 * X10_TEMP71 ; 
const double X10_TEMP73 = 10.0; 
/*UpdatableVariableDeclaration*/
double xx = X10_TEMP72 - X10_TEMP73 ; 
const double X10_TEMP78 = 20.0; 
const int32_t X10_TEMP75 = 1 ; 
const int32_t X10_TEMP77 = ny - X10_TEMP75 ; 
const double X10_TEMP80 = X10_TEMP78 / X10_TEMP77 ; 
const int32_t X10_TEMP81 = pp .f1 ; 
const double X10_TEMP82 = X10_TEMP80 * X10_TEMP81 ; 
const double X10_TEMP83 = 10.0; 
/*UpdatableVariableDeclaration*/
double yy = X10_TEMP82 - X10_TEMP83 ; 
const double X10_TEMP88 = 20.0; 
const int32_t X10_TEMP85 = 1 ; 
const int32_t X10_TEMP87 = nz - X10_TEMP85 ; 
const double X10_TEMP90 = X10_TEMP88 / X10_TEMP87 ; 
const int32_t X10_TEMP91 = pp .f2 ; 
const double X10_TEMP92 = X10_TEMP90 * X10_TEMP91 ; 
const double X10_TEMP93 = 10.0; 
/*UpdatableVariableDeclaration*/
double zz = X10_TEMP92 - X10_TEMP93 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP99 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP136 = Vec_Vec_4( &X10_TEMP136/*OBJECT INIT IN ASSIGNMENT*/, xx , yy , zz , X10_TEMP99 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP137 = 3 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP130 = 15.0; 
const double X10_TEMP103 = 1.5; 
const double X10_TEMP104 = 1.0; 
/*UpdatableVariableDeclaration*/
double X10_TEMP131 = X10_TEMP103 - X10_TEMP104 ; 
const double X10_TEMP106 = 1.5; 
const double X10_TEMP107 = 1.0; 
/*UpdatableVariableDeclaration*/
double X10_TEMP132 = X10_TEMP106 - X10_TEMP107 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP124 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP125 = 0 ; 
const int32_t X10_TEMP113 = pp .f0 ; 
const int32_t X10_TEMP114 = pp .f1 ; 
const int32_t X10_TEMP116 = X10_TEMP113 + X10_TEMP114 ; 
const int32_t X10_TEMP117 = nx + ny ; 
const int32_t X10_TEMP118 = 2 ; 
const int32_t X10_TEMP120 = X10_TEMP117 - X10_TEMP118 ; 
const double X10_TEMP121 = /*casting*/( double ) X10_TEMP120 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP126 = X10_TEMP116 / X10_TEMP121 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP127 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP133 = Vec_Vec_4( &X10_TEMP133/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP124 , X10_TEMP125 , X10_TEMP126 , X10_TEMP127 ) ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP134 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Surface X10_TEMP138 = Surface_Surface_5( &X10_TEMP138/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP130 , X10_TEMP131 , X10_TEMP132 , X10_TEMP133 , X10_TEMP134 ) ; 
/*UpdatableVariableDeclaration*/
 struct Sphere p = Sphere_Sphere_3( &p/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP136 , X10_TEMP137 , X10_TEMP138 ) ; 
Scene_addObject ( scene , p ) ; 
} 
} 

/*UpdatableVariableDeclaration*/
int32_t X10_TEMP147 = 100 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP148 = 100 ; 
const int32_t X10_TEMP143 = 50 ; 
const int32_t X10_TEMP144 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP149 = X10_TEMP144 - X10_TEMP143 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP150 = 1.0; 
struct Light X10_TEMP152  ; 
Light_Light( &X10_TEMP152/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP147 , X10_TEMP148 , X10_TEMP149 , X10_TEMP150 ) ; 
Scene_addLight ( scene , X10_TEMP152 ) ; 
const int32_t X10_TEMP153 = 100 ; 
const int32_t X10_TEMP154 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP161 = X10_TEMP154 - X10_TEMP153 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP162 = 100 ; 
const int32_t X10_TEMP157 = 50 ; 
const int32_t X10_TEMP158 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP163 = X10_TEMP158 - X10_TEMP157 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP164 = 1.0; 
struct Light X10_TEMP166  ; 
Light_Light( &X10_TEMP166/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP161 , X10_TEMP162 , X10_TEMP163 , X10_TEMP164 ) ; 
Scene_addLight ( scene , X10_TEMP166 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP175 = 100 ; 
const int32_t X10_TEMP168 = 100 ; 
const int32_t X10_TEMP169 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP176 = X10_TEMP169 - X10_TEMP168 ; 
const int32_t X10_TEMP171 = 50 ; 
const int32_t X10_TEMP172 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP177 = X10_TEMP172 - X10_TEMP171 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP178 = 1.0; 
struct Light X10_TEMP180  ; 
Light_Light( &X10_TEMP180/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP175 , X10_TEMP176 , X10_TEMP177 , X10_TEMP178 ) ; 
Scene_addLight ( scene , X10_TEMP180 ) ; 
const int32_t X10_TEMP181 = 100 ; 
const int32_t X10_TEMP182 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP191 = X10_TEMP182 - X10_TEMP181 ; 
const int32_t X10_TEMP184 = 100 ; 
const int32_t X10_TEMP185 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP192 = X10_TEMP185 - X10_TEMP184 ; 
const int32_t X10_TEMP187 = 50 ; 
const int32_t X10_TEMP188 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP193 = X10_TEMP188 - X10_TEMP187 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP194 = 1.0; 
struct Light X10_TEMP196  ; 
Light_Light( &X10_TEMP196/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP191 , X10_TEMP192 , X10_TEMP193 , X10_TEMP194 ) ; 
Scene_addLight ( scene , X10_TEMP196 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP201 = 200 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP202 = 200 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP203 = 0 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP204 = 1.0; 
struct Light X10_TEMP206  ; 
Light_Light( &X10_TEMP206/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP201 , X10_TEMP202 , X10_TEMP203 , X10_TEMP204 ) ; 
Scene_addLight ( scene , X10_TEMP206 ) ; 
return scene ; 
} 
} 

void /*static*/RayTracer_setScene (  struct RayTracer  * const X10_TEMP0 ,  struct Scene  * const scene ) 
{ 

{ 
const int32_t X10_TEMP2 = Scene_getLights ( scene ) ; 
const int32_t X10_TEMP3 = X10_TEMP2 ; 
X10_TEMP0 ->lightCount = ( X10_TEMP3 ) ; 
const int32_t X10_TEMP5 = Scene_getObjects ( scene ) ; 
const int32_t X10_TEMP6 = X10_TEMP5 ; 
X10_TEMP0 ->objCount = ( X10_TEMP6 ) ; 
struct Scene * sc = scene ; 
struct Dist1 X10_TEMP8 = getUniqueDist ( ) ; 
struct Dist1 U = X10_TEMP8 ; 
const int32_t mylightCount = X10_TEMP0 ->lightCount ; 
const int32_t myobjCount = X10_TEMP0 ->objCount ; 
/* finish  */ task_start_finish();

{ 
struct Region1 RX10_TEMP1 = U .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 pl = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Region1 RX10_TEMP6 = U .dReg ; 
const int32_t RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , pl ) ; 
const int32_t RX10_TEMP8 = 0 ; 
const uint32_t RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
const char * RX10_TEMP10 = "Point pl not found in the distribution U." ; 
fprintf(stderr, "%s",RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP11 = getPlaceFromDist1 ( U , RX10_TEMP7 ) ; 
const place_t X10_TEMP13 = RX10_TEMP11 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, myobjCount , mylightCount , sc , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, X10_TEMP13 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
struct View X10_TEMP86 = Scene_getView ( scene ) ; 
struct View X10_TEMP87 = X10_TEMP86 ; 
X10_TEMP0 ->view = ( X10_TEMP87 ) ; 
} 
} 

void /*static*/RayTracer_render (  struct RayTracer  * const X10_TEMP0 ,  struct Interval const interval ) 
{ 

{ 
const int32_t X10_TEMP11 = 0 ; 
const int32_t X10_TEMP6 = interval .width ; 
const int32_t X10_TEMP2 = interval .yto ; 
const int32_t X10_TEMP3 = interval .yfrom ; 
const int32_t X10_TEMP5 = X10_TEMP2 - X10_TEMP3 ; 
const int32_t X10_TEMP8 = X10_TEMP6 * X10_TEMP5 ; 
const int32_t X10_TEMP9 = 1 ; 
const int32_t X10_TEMP12 = X10_TEMP8 - X10_TEMP9 ; 
struct Region1 R = createNewRegion1R ( X10_TEMP11 , X10_TEMP12 ) ; 
struct Dist1 X10_TEMP15 = getBlockDist1 ( R ) ; 
struct Dist1 DBlock = X10_TEMP15 ; 
struct Dist1 X10_TEMP17 = getUniqueDist ( ) ; 
struct Dist1 U = X10_TEMP17 ; 
struct Region1 RX10_TEMP0 = DBlock .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER5;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER5 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER5)[0] = RX10_TEMP5, TEMPCALLOCPOINTER5 = ((int32_t * )TEMPCALLOCPOINTER5)+1, memset(TEMPCALLOCPOINTER5,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( DBlock , RX10_TEMP9 ) ; 
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
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER6)[0] = RX10_TEMP4, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, DBlock , RX10_TEMP16 ) ; 
struct intRefArray1 row = RX10_TEMP19 ; 
struct Region1 RX10_TEMP20 = U .dReg ; 
struct Region1 chkSumReg = RX10_TEMP20 ; 
const place_t pHere = /* here  */ _here(); 
const place_t fp = /* place.FIRST_PLACE  */ _place_first(); 
struct Dist1 chkSumDist = getPlaceDist1 ( chkSumReg , fp ) ; 
struct Region1 RX10_TEMP21 = chkSumDist .dReg ; 
const int32_t RX10_TEMP22 = 0 ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP24 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int32_t RX10_TEMP25 = RX10_TEMP24 + 1; 
const int32_t RX10_TEMP26 = /*SimpleDistributionExpression*/ RX10_TEMP24 +1; 
void * TEMPCALLOCPOINTER7;
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct longStub * ) ( TEMPCALLOCPOINTER7 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( longStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( longStub )))),((int32_t * )TEMPCALLOCPOINTER7)[0] = RX10_TEMP26, TEMPCALLOCPOINTER7 = ((int32_t * )TEMPCALLOCPOINTER7)+1, memset(TEMPCALLOCPOINTER7,0,RX10_TEMP26*sizeof(longStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( chkSumDist , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP31 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER8;
/*VALUE ARRAY*/ struct longStub * const RX10_TEMP37 = (/*VALUE ARRAY*/ struct longStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER8 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( longStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( longStub )))),((int32_t * )TEMPCALLOCPOINTER8)[0] = RX10_TEMP25, TEMPCALLOCPOINTER8 = ((int32_t * )TEMPCALLOCPOINTER8)+1, memset(TEMPCALLOCPOINTER8,0,RX10_TEMP25*sizeof(longStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP39 = 0;RX10_TEMP39 < RX10_TEMP25; RX10_TEMP39++) 

{ 
struct longStub RX10_TEMP38 = RX10_TEMP27 [ RX10_TEMP39 ] 
; 
RX10_TEMP37[RX10_TEMP39] = RX10_TEMP38 ; 
} 
/*END OF ARRAY INIT*/struct longRefArray1 RX10_TEMP40  ; 
longRefArray1_longRefArray1( &RX10_TEMP40/*OBJECT INIT IN ASSIGNMENT*/, chkSumDist , RX10_TEMP37 ) ; 
struct longRefArray1 X10_TEMP25 = RX10_TEMP40 ; 
struct longRefArray1 X10_TEMP26 = X10_TEMP25 ; 
X10_TEMP0 ->checkSumArray = ( X10_TEMP26 ) ; 
struct View myview = X10_TEMP0 ->view ; 
/* finish  */ task_start_finish();

{ 
struct Region1 RX10_TEMP42 = U .dReg ; 
const int32_t RX10_TEMP45 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP43 = RX10_TEMP42 .regSize ; 
RX10_TEMP43 = RX10_TEMP43 - RX10_TEMP45 ; const int32_t RX10_TEMP44 = RX10_TEMP43 + 1; 
for ( int32_t RX10_TEMP41= 0; RX10_TEMP41<  RX10_TEMP44; RX10_TEMP41++ )
 
{ 
const int32_t RX10_TEMP46 = /*PointAccess*/RX10_TEMP41 ; 
struct Point1 pl = regionOrdinalPoint1 ( RX10_TEMP42 , RX10_TEMP46 ) ; 
struct Region1 RX10_TEMP47 = U .dReg ; 
const int32_t RX10_TEMP48 = searchPointInRegion1 ( RX10_TEMP47 , pl ) ; 
const int32_t RX10_TEMP49 = 0 ; 
const uint32_t RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; 
if ( RX10_TEMP50 ) 
{ 
const char * RX10_TEMP51 = "Point pl not found in the distribution U." ; 
fprintf(stderr, "%s",RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP52 = getPlaceFromDist1 ( U , RX10_TEMP48 ) ; 
const place_t X10_TEMP29 = RX10_TEMP52 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, pl , myview , fp , DBlock , interval , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC5) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, X10_TEMP29 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
struct longRefArray1 X10_TEMP170 = X10_TEMP0 ->checkSumArray ; 
struct Dist1 RX10_TEMP69 = X10_TEMP170 .distValue ; 
struct Dist1 X10_TEMP171 = RX10_TEMP69 ; 
struct Region1 RX10_TEMP70 = X10_TEMP171 .dReg ; 
struct Region1 regSum = RX10_TEMP70 ; 
const int32_t RX10_TEMP74 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP72 = chkSumReg .regSize ; 
RX10_TEMP72 = RX10_TEMP72 - RX10_TEMP74 ; const int32_t RX10_TEMP73 = RX10_TEMP72 + 1; 
for ( int32_t RX10_TEMP71= 0; RX10_TEMP71<  RX10_TEMP73; RX10_TEMP71++ )
 
{ 
const int32_t RX10_TEMP75 = /*PointAccess*/RX10_TEMP71 ; 
struct Point1 i = regionOrdinalPoint1 ( chkSumReg , RX10_TEMP75 ) ; 

{ 
const int64_t X10_TEMP176 = X10_TEMP0 ->checksum ; 
struct longRefArray1 X10_TEMP174 = X10_TEMP0 ->checkSumArray ; 
struct Dist1 RX10_TEMP76 = X10_TEMP174 .distValue ; 
struct Region1 RX10_TEMP77 = RX10_TEMP76 .dReg ; 
const int32_t RX10_TEMP78 = searchPointInRegion1 ( RX10_TEMP77 , i ) ; 
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
char * RX10_TEMP83 = "Bad place access for array X10_TEMP174" ; 
fprintf(stderr, "%s",RX10_TEMP83 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP86 = getRefArrayValue1long ( X10_TEMP174 , RX10_TEMP78 ) ; 
const int64_t X10_TEMP177 = RX10_TEMP86 ; 
const int64_t X10_TEMP179 = X10_TEMP176 + X10_TEMP177 ; 
const int64_t X10_TEMP180 = X10_TEMP179 ; 
X10_TEMP0 ->checksum = ( X10_TEMP180 ) ; 
} 
} 

} 
} 

uint32_t /*static*/RayTracer_intersect (  struct RayTracer  * const X10_TEMP0 ,  struct Ray  * const r , const double maxt ,  struct Isect  * const inter ) 
{ 

{ 
const double X10_TEMP2 = 1e9; 
const double X10_TEMP3 = X10_TEMP2 ; 
inter ->t = ( X10_TEMP3 ) ; 
const place_t h = /* here  */ _here(); 
const int32_t X10_TEMP7 = 0 ; 
const int32_t X10_TEMP8 = 0 ; 
struct Region1 X10_TEMP9 = createNewRegion1R ( X10_TEMP7 , X10_TEMP8 ) ; 
const place_t X10_TEMP10 = /* here  */ _here(); 
struct Dist1 dTemp = getPlaceDist1 ( X10_TEMP9 , X10_TEMP10 ) ; 
struct Region1 RX10_TEMP0 = dTemp .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER9;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER9 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER9)[0] = RX10_TEMP5, TEMPCALLOCPOINTER9 = ((int32_t * )TEMPCALLOCPOINTER9)+1, memset(TEMPCALLOCPOINTER9,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dTemp , RX10_TEMP9 ) ; 
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
void * TEMPCALLOCPOINTER10;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER10 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )))),((int32_t * )TEMPCALLOCPOINTER10)[0] = RX10_TEMP4, TEMPCALLOCPOINTER10 = ((int32_t * )TEMPCALLOCPOINTER10)+1, memset(TEMPCALLOCPOINTER10,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dTemp , RX10_TEMP16 ) ; 
struct intRefArray1 temp = RX10_TEMP19 ; 
/* finish  */ task_start_finish();

{ 
const place_t X10_TEMP14 = /* place.FIRST_PLACE  */ _place_first(); 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, temp , h , inter , r , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC7) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, X10_TEMP14 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP56 = 0 ; 
struct Point1 RX10_TEMP42  ; 
Point1_Point1( &RX10_TEMP42/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP56 ) ; 
struct Dist1 RX10_TEMP43 = temp .distValue ; 
struct Region1 RX10_TEMP44 = RX10_TEMP43 .dReg ; 
const int32_t RX10_TEMP45 = searchPointInRegion1 ( RX10_TEMP44 , RX10_TEMP42 ) ; 
const int32_t RX10_TEMP46 = 0 ; 
const uint32_t RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP48 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP48 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP49 = getPlaceFromDist1 ( RX10_TEMP43 , RX10_TEMP45 ) ; 
const place_t RX10_TEMP51 = /* here  */ _here(); 
const uint32_t RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; 
if ( RX10_TEMP52 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP50 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP53 = getRefArrayValue1int ( temp , RX10_TEMP45 ) ; 
const int32_t X10_TEMP57 = RX10_TEMP53 ; 
const int32_t X10_TEMP58 = 0 ; 
const uint32_t X10_TEMP59 = X10_TEMP57 > X10_TEMP58 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP62 = 0 ; 
if ( X10_TEMP59 ) 
{ 
X10_TEMP62 = 1 ; } 

const uint32_t X10_TEMP63 = X10_TEMP62 ; 
return X10_TEMP63 ; 
} 
} 

int32_t /*static*/RayTracer_Shadow (  struct RayTracer  * const X10_TEMP0 ,  struct Ray  * const r , const double tmax ,  struct Isect  * const inter ) 
{ 

{ 
const uint32_t X10_TEMP5 = RayTracer_intersect ( X10_TEMP0 , r , tmax , inter ) ; 
if ( X10_TEMP5 ) 
{ 
const int32_t X10_TEMP7 = 0 ; 
return X10_TEMP7 ; 
} 

const int32_t X10_TEMP9 = 1 ; 
return X10_TEMP9 ; 
} 
} 

Vec /*static*/RayTracer_SpecularDirection (  struct RayTracer  * const X10_TEMP0 ,  struct Vec const I ,  struct Vec const N ) 
{ 

{ 
const double X10_TEMP5 = 1.0; 
const double X10_TEMP4 = Vec_dot ( I , N ) ; 
const double X10_TEMP6 = fabs ( X10_TEMP4 ) ; 
const double X10_TEMP11 = X10_TEMP5 / X10_TEMP6 ; 
const double X10_TEMP12 = 2.0; 
struct Vec X10_TEMP13 = Vec_comb ( X10_TEMP11 , I , X10_TEMP12 , N ) ; 
struct Vec X10_TEMP15 = Vec_normalized ( X10_TEMP13 ) ; 
return X10_TEMP15 ; 
} 
} 

Vec /*static*/RayTracer_TransDir (  struct RayTracer  * const X10_TEMP0 ,  struct Surface const m1 ,  struct Surface const m2 ,  struct Vec const I ,  struct Vec const N ) 
{ 

{ 
const uint32_t X10_TEMP1 = m1 .isNull ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP4 = m1 .ior ; 
if ( X10_TEMP1 ) 
{ 
X10_TEMP4 = 1.0; } 

const double X10_TEMP5 = X10_TEMP4 ; 
/*UpdatableVariableDeclaration*/
double n1 = X10_TEMP5 ; 
const uint32_t X10_TEMP6 = m2 .isNull ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP9 = m2 .ior ; 
if ( X10_TEMP6 ) 
{ 
X10_TEMP9 = 1.0; } 

const double X10_TEMP10 = X10_TEMP9 ; 
/*UpdatableVariableDeclaration*/
double n2 = X10_TEMP10 ; 
/*UpdatableVariableDeclaration*/
double eta = n1 / n2 ; 
const double X10_TEMP14 = Vec_dot ( I , N ) ; 
const int32_t X10_TEMP15 = 0 ; 
/*UpdatableVariableDeclaration*/
double c1 = X10_TEMP15 - X10_TEMP14 ; 
const double X10_TEMP22 = 1.0; 
const double X10_TEMP21 = eta * eta ; 
const double X10_TEMP17 = 1.0; 
const double X10_TEMP18 = c1 * c1 ; 
const double X10_TEMP20 = X10_TEMP17 - X10_TEMP18 ; 
const double X10_TEMP23 = X10_TEMP21 * X10_TEMP20 ; 
/*UpdatableVariableDeclaration*/
double cs2 = X10_TEMP22 - X10_TEMP23 ; 
const double X10_TEMP25 = 0.0; 
const uint32_t X10_TEMP27 = cs2 < X10_TEMP25 ; 
if ( X10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/
double X10_TEMP32 = 0.0; 
/*UpdatableVariableDeclaration*/
double X10_TEMP33 = 0.0; 
/*UpdatableVariableDeclaration*/
double X10_TEMP34 = 0.0; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP35 = 1 ; 
struct Vec X10_TEMP37  ; 
Vec_Vec_4( &X10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP32 , X10_TEMP33 , X10_TEMP34 , X10_TEMP35 ) ; 
return X10_TEMP37 ; 
} 

const double X10_TEMP41 = eta * c1 ; 
const double X10_TEMP42 = sqrt ( cs2 ) ; 
const double X10_TEMP45 = X10_TEMP41 - X10_TEMP42 ; 
struct Vec X10_TEMP46 = Vec_comb ( eta , I , X10_TEMP45 , N ) ; 
struct Vec X10_TEMP48 = Vec_normalized ( X10_TEMP46 ) ; 
return X10_TEMP48 ; 
} 
} 

Vec /*static*/RayTracer_shade (  struct RayTracer  * const X10_TEMP0 , const int32_t level , const double weight ,  struct Vec const P ,  struct Vec const N ,  struct Vec const I ,  struct Isect  * const hit ,  struct Ray  * const tRay ) 
{ 

{ 
struct Surface surf = hit ->surf ; 
/*UpdatableVariableDeclaration*/
 struct Vec bigr1 = Vec_Vec_0( &bigr1/*OBJECT INIT IN ASSIGNMENT*/) ; 
const double X10_TEMP3 = surf .shine ; 
const double X10_TEMP4 = 1e-6; 
const uint32_t X10_TEMP6 = X10_TEMP3 > X10_TEMP4 ; 
if ( X10_TEMP6 ) 
{ 

{ 
struct Vec X10_TEMP10 = RayTracer_SpecularDirection ( X10_TEMP0 , I , N ) ; 
bigr1 = X10_TEMP10 ; } 
} 

struct Vec bigr = bigr1 ; 
const place_t h = /* here  */ _here(); 
const int32_t X10_TEMP15 = 0 ; 
const int32_t X10_TEMP16 = 0 ; 
struct Region1 X10_TEMP17 = createNewRegion1R ( X10_TEMP15 , X10_TEMP16 ) ; 
const place_t X10_TEMP18 = /* here  */ _here(); 
struct Dist1 dTemp = getPlaceDist1 ( X10_TEMP17 , X10_TEMP18 ) ; 
struct Region1 RX10_TEMP0 = dTemp .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER11;
/*Updatable ARRAY*/ struct VecStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct VecStub * ) ( TEMPCALLOCPOINTER11 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( VecStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( VecStub )))),((int32_t * )TEMPCALLOCPOINTER11)[0] = RX10_TEMP5, TEMPCALLOCPOINTER11 = ((int32_t * )TEMPCALLOCPOINTER11)+1, memset(TEMPCALLOCPOINTER11,0,RX10_TEMP5*sizeof(VecStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dTemp , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC8) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP10 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER12;
/*VALUE ARRAY*/ struct VecStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct VecStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER12 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( VecStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( VecStub )))),((int32_t * )TEMPCALLOCPOINTER12)[0] = RX10_TEMP4, TEMPCALLOCPOINTER12 = ((int32_t * )TEMPCALLOCPOINTER12)+1, memset(TEMPCALLOCPOINTER12,0,RX10_TEMP4*sizeof(VecStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct VecStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct VecRefArray1 RX10_TEMP19  ; 
VecRefArray1_VecRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dTemp , RX10_TEMP16 ) ; 
struct VecRefArray1 temp = RX10_TEMP19 ; 
/* finish  */ task_start_finish();

{ 
const place_t X10_TEMP22 = /* place.FIRST_PLACE  */ _place_first(); 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, temp , h , bigr , surf , tRay , hit , N , P , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC9) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, X10_TEMP22 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP103 = 0 ; 
struct Point1 RX10_TEMP48  ; 
Point1_Point1( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP103 ) ; 
struct Dist1 RX10_TEMP49 = temp .distValue ; 
struct Region1 RX10_TEMP50 = RX10_TEMP49 .dReg ; 
const int32_t RX10_TEMP51 = searchPointInRegion1 ( RX10_TEMP50 , RX10_TEMP48 ) ; 
const int32_t RX10_TEMP52 = 0 ; 
const uint32_t RX10_TEMP53 = RX10_TEMP51 < RX10_TEMP52 ; 
if ( RX10_TEMP53 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP54 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP55 = getPlaceFromDist1 ( RX10_TEMP49 , RX10_TEMP51 ) ; 
const place_t RX10_TEMP57 = /* here  */ _here(); 
const uint32_t RX10_TEMP58 = RX10_TEMP55 != RX10_TEMP57 ; 
if ( RX10_TEMP58 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP56 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP56 ) ; 
exit(EXIT_FAILURE);
} 

struct Vec RX10_TEMP59 = getRefArrayValue1Vec ( temp , RX10_TEMP51 ) ; 
/*UpdatableVariableDeclaration*/
 struct Vec col = RX10_TEMP59 ; 
struct Vec X10_TEMP106 = P ; 
tRay ->p = ( X10_TEMP106 ) ; 
const double X10_TEMP107 = surf .ks ; 
const double X10_TEMP108 = X10_TEMP107 * weight ; 
const double X10_TEMP109 = 1e-3; 
const uint32_t X10_TEMP111 = X10_TEMP108 > X10_TEMP109 ; 
if ( X10_TEMP111 ) 
{ 

{ 
struct Vec X10_TEMP115 = RayTracer_SpecularDirection ( X10_TEMP0 , I , N ) ; 
struct Vec X10_TEMP116 = X10_TEMP115 ; 
tRay ->d = ( X10_TEMP116 ) ; 
const int32_t X10_TEMP117 = 1 ; 
const int32_t X10_TEMP124 = level + X10_TEMP117 ; 
const double X10_TEMP119 = surf .ks ; 
const double X10_TEMP125 = X10_TEMP119 * weight ; 
/*UpdatableVariableDeclaration*/
 struct Vec tcol = RayTracer_trace ( X10_TEMP0 , X10_TEMP124 , X10_TEMP125 , tRay , hit , tRay ) ; 
const double X10_TEMP129 = surf .ks ; 
struct Vec X10_TEMP131 = Vec_adds2 ( col , X10_TEMP129 , tcol ) ; 
col = X10_TEMP131 ; } 
} 

const double X10_TEMP132 = surf .kt ; 
const double X10_TEMP133 = X10_TEMP132 * weight ; 
const double X10_TEMP134 = 1e-3; 
const uint32_t X10_TEMP136 = X10_TEMP133 > X10_TEMP134 ; 
if ( X10_TEMP136 ) 
{ 

{ 
const int32_t X10_TEMP137 = hit ->enter ; 
const int32_t X10_TEMP138 = 0 ; 
const uint32_t X10_TEMP140 = X10_TEMP137 > X10_TEMP138 ; 
if ( X10_TEMP140 ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP146 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP147 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP148 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP149 = Vec_Vec_0( &X10_TEMP149/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP150 = 1 ; 
struct Surface X10_TEMP155  ; 
Surface_Surface_5( &X10_TEMP155/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP146 , X10_TEMP147 , X10_TEMP148 , X10_TEMP149 , X10_TEMP150 ) ; 
struct Vec X10_TEMP157 = RayTracer_TransDir ( X10_TEMP0 , X10_TEMP155 , surf , I , N ) ; 
struct Vec X10_TEMP158 = X10_TEMP157 ; 
tRay ->d = ( X10_TEMP158 ) ; 
} 
else 
{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP165 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP166 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP167 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP168 = Vec_Vec_0( &X10_TEMP168/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP169 = 1 ; 
struct Surface X10_TEMP173  ; 
Surface_Surface_5( &X10_TEMP173/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP165 , X10_TEMP166 , X10_TEMP167 , X10_TEMP168 , X10_TEMP169 ) ; 
struct Vec X10_TEMP175 = RayTracer_TransDir ( X10_TEMP0 , surf , X10_TEMP173 , I , N ) ; 
struct Vec X10_TEMP176 = X10_TEMP175 ; 
tRay ->d = ( X10_TEMP176 ) ; 
} 
} 


const int32_t X10_TEMP177 = 1 ; 
const int32_t X10_TEMP184 = level + X10_TEMP177 ; 
const double X10_TEMP179 = surf .kt ; 
const double X10_TEMP185 = X10_TEMP179 * weight ; 
/*UpdatableVariableDeclaration*/
 struct Vec tcol = RayTracer_trace ( X10_TEMP0 , X10_TEMP184 , X10_TEMP185 , tRay , hit , tRay ) ; 
const double X10_TEMP189 = surf .kt ; 
struct Vec X10_TEMP191 = Vec_adds2 ( col , X10_TEMP189 , tcol ) ; 
col = X10_TEMP191 ; } 
} 

return col ; 
} 
} 

Vec /*static*/RayTracer_trace (  struct RayTracer  * const X10_TEMP0 , const int32_t level , const double weight ,  struct Ray  * const r ,  struct Isect  * const inter ,  struct Ray  * const tRay ) 
{ 

{ 
const int32_t X10_TEMP1 = 6 ; 
const uint32_t X10_TEMP3 = level > X10_TEMP1 ; 
if ( X10_TEMP3 ) 
{ 

{ 
struct Vec X10_TEMP5  ; 
Vec_Vec_0( &X10_TEMP5/*OBJECT INIT IN ASSIGNMENT*/) ; 
return X10_TEMP5 ; 
} 
} 

const double X10_TEMP9 = 1e6; 
/*UpdatableVariableDeclaration*/
uint32_t hit = RayTracer_intersect ( X10_TEMP0 , r , X10_TEMP9 , inter ) ; 
if ( hit ) 
{ 

{ 
const double X10_TEMP13 = inter ->t ; 
/*UpdatableVariableDeclaration*/
 struct Vec P = Ray_rayPoint ( r , X10_TEMP13 ) ; 
struct Sphere X10_TEMP15 = inter ->prim ; 
/*UpdatableVariableDeclaration*/
 struct Vec N = Sphere_normal ( X10_TEMP15 , P ) ; 
struct Vec X10_TEMP20 = r ->d ; 
const double X10_TEMP21 = Vec_dot ( X10_TEMP20 , N ) ; 
const double X10_TEMP22 = 0.0; 
const uint32_t X10_TEMP24 = X10_TEMP21 >= X10_TEMP22 ; 
if ( X10_TEMP24 ) 
{ 

{ 
struct Vec X10_TEMP26 = Vec_negate ( N ) ; 
N = X10_TEMP26 ; } 
} 

struct Vec X10_TEMP34 = r ->d ; 
struct Vec X10_TEMP36 = RayTracer_shade ( X10_TEMP0 , level , weight , P , N , X10_TEMP34 , inter , tRay ) ; 
return X10_TEMP36 ; 
} 
} 

return _RayTracer_voidVec ; 
} 
} 

Ray  * /*static*/Ray_d (  struct Ray  * const X10_TEMP0 ,  struct Vec const d_ ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP4 = X10_TEMP0 ->p ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP5 = 0 ; 
struct Ray * X10_TEMP7 = (struct Ray  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Ray ))),malloc(sizeof(struct Ray )));  
memset(X10_TEMP7,0,sizeof(struct Ray )); 
Ray_Ray_3( X10_TEMP7/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP4 , d_ , X10_TEMP5 ) ; 
return X10_TEMP7 ; 
} 
} 

Vec /*static*/Ray_rayPoint (  struct Ray  * const X10_TEMP0 , const double t ) 
{ 

{ 
struct Vec X10_TEMP1 = X10_TEMP0 ->p ; 
const double X10_TEMP4 = X10_TEMP1 .x ; 
struct Vec X10_TEMP2 = X10_TEMP0 ->d ; 
const double X10_TEMP3 = X10_TEMP2 .x ; 
const double X10_TEMP5 = X10_TEMP3 * t ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP20 = X10_TEMP4 + X10_TEMP5 ; 
struct Vec X10_TEMP7 = X10_TEMP0 ->p ; 
const double X10_TEMP10 = X10_TEMP7 .y ; 
struct Vec X10_TEMP8 = X10_TEMP0 ->d ; 
const double X10_TEMP9 = X10_TEMP8 .y ; 
const double X10_TEMP11 = X10_TEMP9 * t ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP21 = X10_TEMP10 + X10_TEMP11 ; 
struct Vec X10_TEMP13 = X10_TEMP0 ->p ; 
const double X10_TEMP16 = X10_TEMP13 .z ; 
struct Vec X10_TEMP14 = X10_TEMP0 ->d ; 
const double X10_TEMP15 = X10_TEMP14 .z ; 
const double X10_TEMP17 = X10_TEMP15 * t ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP22 = X10_TEMP16 + X10_TEMP17 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP23 = 0 ; 
struct Vec X10_TEMP25  ; 
Vec_Vec_4( &X10_TEMP25/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP20 , X10_TEMP21 , X10_TEMP22 , X10_TEMP23 ) ; 
return X10_TEMP25 ; 
} 
} 

char * /*static*/Ray_toString (  struct Ray  * const X10_TEMP0 ) 
{ 

{ 
const char * X10_TEMP2 = " { " ; 
struct Vec X10_TEMP1 = X10_TEMP0 ->p ; 
const char * X10_TEMP3 = Vec_toString ( X10_TEMP1 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC3, "%s%s",X10_TEMP2,X10_TEMP3);
const char * X10_TEMP4 = tempC3;; 
const char * X10_TEMP5 = "->" ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC4, "%s%s",X10_TEMP4,X10_TEMP5);
const char * X10_TEMP7 = tempC4;; 
struct Vec X10_TEMP6 = X10_TEMP0 ->d ; 
const char * X10_TEMP8 = Vec_toString ( X10_TEMP6 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC5, "%s%s",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC5;; 
const char * X10_TEMP10 = " } " ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC6, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC6;; 
return X10_TEMP12 ; 
} 
} 

void /*static*/runMain ( ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
 struct Timer  * tmr = (struct Timer  *) ((((_task*)_thread_getspecific()) -> total_memory_class) += 4*ceil(0.25 *(  sizeof(struct Timer ))),malloc(sizeof(struct Timer )));  
memset(tmr,0,sizeof(struct Timer )); 
Timer_Timer( tmr/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/
int32_t count = 0 ; 
/* finish  */ task_start_finish();

{ 

{ 
Timer_start ( tmr , count ) ; 
} 
} 
task_end_finish();
/*END OF FINISH*/
/* finish  */ task_start_finish();

{ 

{ 
struct RayTracer * X10_TEMP4 = (struct RayTracer  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct RayTracer ))),malloc(sizeof(struct RayTracer )));  
memset(X10_TEMP4,0,sizeof(struct RayTracer )); 
RayTracer_RayTracer( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
RayTracer_run ( X10_TEMP4 ) ; 
} 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for raytracer: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC7, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC7;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC8 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC8, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC8;; 
fprintf(  stdout, "%s\n",X10_TEMP12 ) ; 
} 
} 

Vec /*static*/Vec_added (  struct Vec const X10_TEMP0 ,  struct Vec const a ) 
{ 

{ 
const double X10_TEMP1 = X10_TEMP0 .x ; 
const double X10_TEMP2 = a .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP11 = X10_TEMP1 + X10_TEMP2 ; 
const double X10_TEMP4 = X10_TEMP0 .y ; 
const double X10_TEMP5 = a .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP12 = X10_TEMP4 + X10_TEMP5 ; 
const double X10_TEMP7 = X10_TEMP0 .z ; 
const double X10_TEMP8 = a .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP13 = X10_TEMP7 + X10_TEMP8 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP14 = 0 ; 
struct Vec X10_TEMP16  ; 
Vec_Vec_4( &X10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ; 
return X10_TEMP16 ; 
} 
} 

Vec /*static*/Vec_adds3 ( const double s ,  struct Vec const a ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP1 = a .x ; 
const double X10_TEMP2 = s * X10_TEMP1 ; 
const double X10_TEMP3 = b .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP14 = X10_TEMP2 + X10_TEMP3 ; 
const double X10_TEMP5 = a .y ; 
const double X10_TEMP6 = s * X10_TEMP5 ; 
const double X10_TEMP7 = b .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP15 = X10_TEMP6 + X10_TEMP7 ; 
const double X10_TEMP9 = a .z ; 
const double X10_TEMP10 = s * X10_TEMP9 ; 
const double X10_TEMP11 = b .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP16 = X10_TEMP10 + X10_TEMP11 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP17 = 0 ; 
struct Vec X10_TEMP19  ; 
Vec_Vec_4( &X10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 ) ; 
return X10_TEMP19 ; 
} 
} 

Vec /*static*/Vec_adds2 (  struct Vec const X10_TEMP0 , const double s ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP2 = X10_TEMP0 .x ; 
const double X10_TEMP1 = b .x ; 
const double X10_TEMP3 = s * X10_TEMP1 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP14 = X10_TEMP2 + X10_TEMP3 ; 
const double X10_TEMP6 = X10_TEMP0 .y ; 
const double X10_TEMP5 = b .y ; 
const double X10_TEMP7 = s * X10_TEMP5 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP15 = X10_TEMP6 + X10_TEMP7 ; 
const double X10_TEMP10 = X10_TEMP0 .z ; 
const double X10_TEMP9 = b .z ; 
const double X10_TEMP11 = s * X10_TEMP9 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP16 = X10_TEMP10 + X10_TEMP11 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP17 = 0 ; 
struct Vec X10_TEMP19  ; 
Vec_Vec_4( &X10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 ) ; 
return X10_TEMP19 ; 
} 
} 

Vec /*static*/Vec_sub (  struct Vec const a ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP1 = a .x ; 
const double X10_TEMP2 = b .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP11 = X10_TEMP1 - X10_TEMP2 ; 
const double X10_TEMP4 = a .y ; 
const double X10_TEMP5 = b .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP12 = X10_TEMP4 - X10_TEMP5 ; 
const double X10_TEMP7 = a .z ; 
const double X10_TEMP8 = b .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP13 = X10_TEMP7 - X10_TEMP8 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP14 = 0 ; 
struct Vec X10_TEMP16  ; 
Vec_Vec_4( &X10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ; 
return X10_TEMP16 ; 
} 
} 

Vec /*static*/Vec_mult (  struct Vec const a ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP1 = a .x ; 
const double X10_TEMP2 = b .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP11 = X10_TEMP1 * X10_TEMP2 ; 
const double X10_TEMP4 = a .y ; 
const double X10_TEMP5 = b .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP12 = X10_TEMP4 * X10_TEMP5 ; 
const double X10_TEMP7 = a .z ; 
const double X10_TEMP8 = b .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP13 = X10_TEMP7 * X10_TEMP8 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP14 = 0 ; 
struct Vec X10_TEMP16  ; 
Vec_Vec_4( &X10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ; 
return X10_TEMP16 ; 
} 
} 

Vec /*static*/Vec_cross (  struct Vec const a ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP1 = a .y ; 
const double X10_TEMP2 = b .z ; 
const double X10_TEMP5 = X10_TEMP1 * X10_TEMP2 ; 
const double X10_TEMP3 = a .z ; 
const double X10_TEMP4 = b .y ; 
const double X10_TEMP6 = X10_TEMP3 * X10_TEMP4 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP23 = X10_TEMP5 - X10_TEMP6 ; 
const double X10_TEMP8 = a .z ; 
const double X10_TEMP9 = b .x ; 
const double X10_TEMP12 = X10_TEMP8 * X10_TEMP9 ; 
const double X10_TEMP10 = a .x ; 
const double X10_TEMP11 = b .z ; 
const double X10_TEMP13 = X10_TEMP10 * X10_TEMP11 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP24 = X10_TEMP12 - X10_TEMP13 ; 
const double X10_TEMP15 = a .x ; 
const double X10_TEMP16 = b .y ; 
const double X10_TEMP19 = X10_TEMP15 * X10_TEMP16 ; 
const double X10_TEMP17 = a .y ; 
const double X10_TEMP18 = b .x ; 
const double X10_TEMP20 = X10_TEMP17 * X10_TEMP18 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP25 = X10_TEMP19 - X10_TEMP20 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP26 = 0 ; 
struct Vec X10_TEMP28  ; 
Vec_Vec_4( &X10_TEMP28/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP23 , X10_TEMP24 , X10_TEMP25 , X10_TEMP26 ) ; 
return X10_TEMP28 ; 
} 
} 

double /*static*/Vec_dot (  struct Vec const a ,  struct Vec const b ) 
{ 

{ 
const double X10_TEMP1 = a .x ; 
const double X10_TEMP2 = b .x ; 
const double X10_TEMP5 = X10_TEMP1 * X10_TEMP2 ; 
const double X10_TEMP3 = a .y ; 
const double X10_TEMP4 = b .y ; 
const double X10_TEMP6 = X10_TEMP3 * X10_TEMP4 ; 
const double X10_TEMP9 = X10_TEMP5 + X10_TEMP6 ; 
const double X10_TEMP7 = a .z ; 
const double X10_TEMP8 = b .z ; 
const double X10_TEMP10 = X10_TEMP7 * X10_TEMP8 ; 
const double X10_TEMP12 = X10_TEMP9 + X10_TEMP10 ; 
return X10_TEMP12 ; 
} 
} 

Vec /*static*/Vec_comb ( const double a ,  struct Vec const A , const double b ,  struct Vec const B ) 
{ 

{ 
const double X10_TEMP1 = A .x ; 
const double X10_TEMP3 = a * X10_TEMP1 ; 
const double X10_TEMP2 = B .x ; 
const double X10_TEMP4 = b * X10_TEMP2 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP17 = X10_TEMP3 + X10_TEMP4 ; 
const double X10_TEMP6 = A .y ; 
const double X10_TEMP8 = a * X10_TEMP6 ; 
const double X10_TEMP7 = B .y ; 
const double X10_TEMP9 = b * X10_TEMP7 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP18 = X10_TEMP8 + X10_TEMP9 ; 
const double X10_TEMP11 = A .z ; 
const double X10_TEMP13 = a * X10_TEMP11 ; 
const double X10_TEMP12 = B .z ; 
const double X10_TEMP14 = b * X10_TEMP12 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP19 = X10_TEMP13 + X10_TEMP14 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP20 = 0 ; 
struct Vec X10_TEMP22  ; 
Vec_Vec_4( &X10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP17 , X10_TEMP18 , X10_TEMP19 , X10_TEMP20 ) ; 
return X10_TEMP22 ; 
} 
} 

Vec /*static*/Vec_scale (  struct Vec const X10_TEMP0 , const double t ) 
{ 

{ 
const double X10_TEMP1 = X10_TEMP0 .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP8 = X10_TEMP1 * t ; 
const double X10_TEMP3 = X10_TEMP0 .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP9 = X10_TEMP3 * t ; 
const double X10_TEMP5 = X10_TEMP0 .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP10 = X10_TEMP5 * t ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP11 = 0 ; 
struct Vec X10_TEMP13  ; 
Vec_Vec_4( &X10_TEMP13/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP8 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 ) ; 
return X10_TEMP13 ; 
} 
} 

Vec /*static*/Vec_negate (  struct Vec const X10_TEMP0 ) 
{ 

{ 
const double X10_TEMP1 = X10_TEMP0 .x ; 
const int32_t X10_TEMP2 = 0 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP11 = X10_TEMP2 - X10_TEMP1 ; 
const double X10_TEMP4 = X10_TEMP0 .y ; 
const int32_t X10_TEMP5 = 0 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP12 = X10_TEMP5 - X10_TEMP4 ; 
const double X10_TEMP7 = X10_TEMP0 .z ; 
const int32_t X10_TEMP8 = 0 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP13 = X10_TEMP8 - X10_TEMP7 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP14 = 0 ; 
struct Vec X10_TEMP16  ; 
Vec_Vec_4( &X10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ; 
return X10_TEMP16 ; 
} 
} 

Vec /*static*/Vec_normalized (  struct Vec const X10_TEMP0 ) 
{ 

{ 
const double X10_TEMP1 = X10_TEMP0 .x ; 
const double X10_TEMP2 = X10_TEMP0 .x ; 
const double X10_TEMP5 = X10_TEMP1 * X10_TEMP2 ; 
const double X10_TEMP3 = X10_TEMP0 .y ; 
const double X10_TEMP4 = X10_TEMP0 .y ; 
const double X10_TEMP6 = X10_TEMP3 * X10_TEMP4 ; 
const double X10_TEMP9 = X10_TEMP5 + X10_TEMP6 ; 
const double X10_TEMP7 = X10_TEMP0 .z ; 
const double X10_TEMP8 = X10_TEMP0 .z ; 
const double X10_TEMP10 = X10_TEMP7 * X10_TEMP8 ; 
const double X10_TEMP12 = X10_TEMP9 + X10_TEMP10 ; 
/*UpdatableVariableDeclaration*/
double len = sqrt ( X10_TEMP12 ) ; 
const double X10_TEMP14 = 0.0; 
const uint32_t X10_TEMP16 = len > X10_TEMP14 ; 
const uint32_t X10_TEMP17 = X10_TEMP16 ; 
const double X10_TEMP18 = X10_TEMP0 .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP25 = X10_TEMP18 / len ; 
const double X10_TEMP20 = X10_TEMP0 .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP26 = X10_TEMP20 / len ; 
const double X10_TEMP22 = X10_TEMP0 .z ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP27 = X10_TEMP22 / len ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP28 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP31 = X10_TEMP0 ; 
if ( X10_TEMP17 ) 
{ 
X10_TEMP31 = Vec_Vec_4( &X10_TEMP31/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP25 , X10_TEMP26 , X10_TEMP27 , X10_TEMP28 ) ; } 

struct Vec X10_TEMP32 = X10_TEMP31 ; 
return X10_TEMP32 ; 
} 
} 

double /*static*/Vec_length (  struct Vec const X10_TEMP0 ) 
{ 

{ 
const double X10_TEMP1 = X10_TEMP0 .x ; 
const double X10_TEMP2 = X10_TEMP0 .x ; 
const double X10_TEMP5 = X10_TEMP1 * X10_TEMP2 ; 
const double X10_TEMP3 = X10_TEMP0 .y ; 
const double X10_TEMP4 = X10_TEMP0 .y ; 
const double X10_TEMP6 = X10_TEMP3 * X10_TEMP4 ; 
const double X10_TEMP9 = X10_TEMP5 + X10_TEMP6 ; 
const double X10_TEMP7 = X10_TEMP0 .z ; 
const double X10_TEMP8 = X10_TEMP0 .z ; 
const double X10_TEMP10 = X10_TEMP7 * X10_TEMP8 ; 
const double X10_TEMP12 = X10_TEMP9 + X10_TEMP10 ; 
const double X10_TEMP14 = sqrt ( X10_TEMP12 ) ; 
return X10_TEMP14 ; 
} 
} 

char * /*static*/Vec_toString (  struct Vec const X10_TEMP0 ) 
{ 

{ 
const char * X10_TEMP1 = "<" ; 
const double X10_TEMP2 = X10_TEMP0 .x ; 
/*ASSIGNMENT STRING*/
 char * tempC9 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC9, "%s%f",X10_TEMP1,X10_TEMP2);
const char * X10_TEMP3 = tempC9;; 
const char * X10_TEMP4 = "," ; 
/*ASSIGNMENT STRING*/
 char * tempC10 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC10, "%s%s",X10_TEMP3,X10_TEMP4);
const char * X10_TEMP5 = tempC10;; 
const double X10_TEMP6 = X10_TEMP0 .y ; 
/*ASSIGNMENT STRING*/
 char * tempC11 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC11, "%s%f",X10_TEMP5,X10_TEMP6);
const char * X10_TEMP7 = tempC11;; 
const char * X10_TEMP8 = "," ; 
/*ASSIGNMENT STRING*/
 char * tempC12 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC12, "%s%s",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC12;; 
const double X10_TEMP10 = X10_TEMP0 .z ; 
/*ASSIGNMENT STRING*/
 char * tempC13 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC13, "%s%f",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP11 = tempC13;; 
const char * X10_TEMP12 = ">" ; 
/*ASSIGNMENT STRING*/
 char * tempC14 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC14, "%s%s",X10_TEMP11,X10_TEMP12);
const char * X10_TEMP14 = tempC14;; 
return X10_TEMP14 ; 
} 
} 

char * /*static*/Light_toString (  struct Light const X10_TEMP0 ) 
{ 

{ 
struct Vec X10_TEMP1 = X10_TEMP0 .pos ; 
const char * X10_TEMP2 = " " ; 
const char * X10_TEMP3 = Vec_toString ( X10_TEMP1 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC15 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC15, "%s%s",X10_TEMP3,X10_TEMP2);
const char * X10_TEMP4 = tempC15;; 
const double X10_TEMP5 = X10_TEMP0 .brightness ; 
/*ASSIGNMENT STRING*/
 char * tempC16 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC16, "%s%f",X10_TEMP4,X10_TEMP5);
const char * X10_TEMP7 = tempC16;; 
return X10_TEMP7 ; 
} 
} 

Isect  * /*static*/Sphere_intersect (  struct Sphere const X10_TEMP0 ,  struct Ray  * const ry ) 
{ 

{ 
struct Vec X10_TEMP3 = X10_TEMP0 .c ; 
struct Vec X10_TEMP4 = ry ->p ; 
/*UpdatableVariableDeclaration*/
 struct Vec v = Vec_sub ( X10_TEMP3 , X10_TEMP4 ) ; 
struct Vec X10_TEMP8 = ry ->d ; 
/*UpdatableVariableDeclaration*/
double b = Vec_dot ( v , X10_TEMP8 ) ; 
const double X10_TEMP12 = b * b ; 
const double X10_TEMP13 = Vec_dot ( v , v ) ; 
const double X10_TEMP14 = X10_TEMP12 - X10_TEMP13 ; 
const double X10_TEMP15 = X10_TEMP0 .r2 ; 
/*UpdatableVariableDeclaration*/
double disc = X10_TEMP14 + X10_TEMP15 ; 
const double X10_TEMP17 = 0.0; 
const uint32_t X10_TEMP19 = disc < X10_TEMP17 ; 
if ( X10_TEMP19 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
double X10_TEMP25 = 0.0; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP26 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP27 = 1 ; 
/*UpdatableVariableDeclaration*/
 struct Surface X10_TEMP28 = X10_TEMP0 .surf ; 
struct Isect * X10_TEMP30 = (struct Isect  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Isect ))),malloc(sizeof(struct Isect )));  
memset(X10_TEMP30,0,sizeof(struct Isect )); 
Isect_Isect_5( X10_TEMP30/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP25 , X10_TEMP26 , X10_TEMP27 , X10_TEMP0 , X10_TEMP28 ) ; 
return X10_TEMP30 ; 
} 
} 

const double X10_TEMP33 = sqrt ( disc ) ; 
disc = X10_TEMP33 ; const double X10_TEMP34 = b - disc ; 
const double X10_TEMP35 = 1e-6; 
const uint32_t X10_TEMP37 = X10_TEMP34 < X10_TEMP35 ; 
const uint32_t X10_TEMP38 = X10_TEMP37 ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP41 = b - disc ; 
if ( X10_TEMP38 ) 
{ 
X10_TEMP41 = b + disc ; } 

const double X10_TEMP42 = X10_TEMP41 ; 
/*UpdatableVariableDeclaration*/
double t = X10_TEMP42 ; 
const double X10_TEMP43 = 1e-6; 
const uint32_t X10_TEMP45 = t < X10_TEMP43 ; 
if ( X10_TEMP45 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
double X10_TEMP51 = 0.0; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP52 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP53 = 1 ; 
/*UpdatableVariableDeclaration*/
 struct Surface X10_TEMP54 = X10_TEMP0 .surf ; 
struct Isect * X10_TEMP56 = (struct Isect  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Isect ))),malloc(sizeof(struct Isect )));  
memset(X10_TEMP56,0,sizeof(struct Isect )); 
Isect_Isect_5( X10_TEMP56/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP51 , X10_TEMP52 , X10_TEMP53 , X10_TEMP0 , X10_TEMP54 ) ; 
return X10_TEMP56 ; 
} 
} 

const double X10_TEMP62 = Vec_dot ( v , v ) ; 
const double X10_TEMP60 = X10_TEMP0 .r2 ; 
const double X10_TEMP61 = 1e-6; 
const double X10_TEMP63 = X10_TEMP60 + X10_TEMP61 ; 
const uint32_t X10_TEMP64 = X10_TEMP62 > X10_TEMP63 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP67 = 0 ; 
if ( X10_TEMP64 ) 
{ 
X10_TEMP67 = 1 ; } 

const int32_t X10_TEMP68 = X10_TEMP67 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP72 = 0 ; 
/*UpdatableVariableDeclaration*/
 struct Surface X10_TEMP73 = X10_TEMP0 .surf ; 
/*UpdatableVariableDeclaration*/
 struct Isect  * ip = (struct Isect  *) ((((_task*)_thread_getspecific()) -> total_memory_class) += 4*ceil(0.25 *(  sizeof(struct Isect ))),malloc(sizeof(struct Isect )));  
memset(ip,0,sizeof(struct Isect )); 
Isect_Isect_5( ip/*OBJECT INIT IN ASSIGNMENT*/, t , X10_TEMP68 , X10_TEMP72 , X10_TEMP0 , X10_TEMP73 ) ; 
return ip ; 
} 
} 

Vec /*static*/Sphere_normal (  struct Sphere const X10_TEMP0 ,  struct Vec const p ) 
{ 

{ 
struct Vec X10_TEMP3 = X10_TEMP0 .c ; 
struct Vec X10_TEMP4 = Vec_sub ( p , X10_TEMP3 ) ; 
struct Vec X10_TEMP6 = Vec_normalized ( X10_TEMP4 ) ; 
return X10_TEMP6 ; 
} 
} 

char * /*static*/Sphere_toString (  struct Sphere const X10_TEMP0 ) 
{ 

{ 
const char * X10_TEMP2 = "Sphere {" ; 
struct Vec X10_TEMP1 = X10_TEMP0 .c ; 
const char * X10_TEMP3 = Vec_toString ( X10_TEMP1 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC17 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC17, "%s%s",X10_TEMP2,X10_TEMP3);
const char * X10_TEMP4 = tempC17;; 
const char * X10_TEMP5 = "," ; 
/*ASSIGNMENT STRING*/
 char * tempC18 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC18, "%s%s",X10_TEMP4,X10_TEMP5);
const char * X10_TEMP6 = tempC18;; 
const double X10_TEMP7 = X10_TEMP0 .r ; 
/*ASSIGNMENT STRING*/
 char * tempC19 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC19, "%s%f",X10_TEMP6,X10_TEMP7);
const char * X10_TEMP8 = tempC19;; 
const char * X10_TEMP9 = "}" ; 
/*ASSIGNMENT STRING*/
 char * tempC20 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC20, "%s%s",X10_TEMP8,X10_TEMP9);
const char * X10_TEMP11 = tempC20;; 
return X10_TEMP11 ; 
} 
} 

Vec /*static*/Sphere_getCenter (  struct Sphere const X10_TEMP0 ) 
{ 

{ 
struct Vec X10_TEMP2 = X10_TEMP0 .c ; 
return X10_TEMP2 ; 
} 
} 

int32_t /*static*/_Scene_maxObjects_init ( ) 
{ 
const int32_t X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

int32_t /*static*/_Scene_maxLights_init ( ) 
{ 
const int32_t X10_TEMP2 = 5 ; 
return X10_TEMP2 ; 
} 

void /*static*/Scene_addLight (  struct Scene  * const X10_TEMP0 ,  struct Light const l ) 
{ 

{ 
const int32_t X10_TEMP2 = X10_TEMP0 ->lightCount ; 
const int32_t X10_TEMP1 = 1 ; 
const int32_t X10_TEMP3 = _Scene_maxLights - X10_TEMP1 ; 
const uint32_t X10_TEMP5 = X10_TEMP2 > X10_TEMP3 ; 
if ( X10_TEMP5 ) 
{ 

{ 
const char * X10_TEMP6 = "Only " ; 
/*ASSIGNMENT STRING*/
 char * tempC21 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC21, "%s%d",X10_TEMP6,_Scene_maxLights);
const char * X10_TEMP7 = tempC21;; 
const char * X10_TEMP8 = " lights allowed" ; 
/*ASSIGNMENT STRING*/
 char * tempC22 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC22, "%s%s",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP10 = tempC22;; 
fprintf(stderr, "%s",X10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 
} 

struct LightRefArray1 X10_TEMP11 = X10_TEMP0 ->lights ; 
const int32_t X10_TEMP13 = X10_TEMP0 ->lightCount ; 
struct Light X10_TEMP15 = l ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP13 ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP11 .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array X10_TEMP11" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1Light ( X10_TEMP11 , RX10_TEMP3 , X10_TEMP15 ) ; 
const int32_t X10_TEMP16 = X10_TEMP0 ->lightCount ; 
const int32_t X10_TEMP17 = 1 ; 
const int32_t X10_TEMP19 = X10_TEMP16 + X10_TEMP17 ; 
const int32_t X10_TEMP20 = X10_TEMP19 ; 
X10_TEMP0 ->lightCount = ( X10_TEMP20 ) ; 
} 
} 

void /*static*/Scene_addObject (  struct Scene  * const X10_TEMP0 ,  struct Sphere const object ) 
{ 

{ 
const int32_t X10_TEMP2 = X10_TEMP0 ->objectCount ; 
const int32_t X10_TEMP1 = 1 ; 
const int32_t X10_TEMP3 = _Scene_maxObjects - X10_TEMP1 ; 
const uint32_t X10_TEMP5 = X10_TEMP2 > X10_TEMP3 ; 
if ( X10_TEMP5 ) 
{ 

{ 
const char * X10_TEMP6 = "Only " ; 
/*ASSIGNMENT STRING*/
 char * tempC23 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC23, "%s%d",X10_TEMP6,_Scene_maxObjects);
const char * X10_TEMP7 = tempC23;; 
const char * X10_TEMP8 = " objects allowed" ; 
/*ASSIGNMENT STRING*/
 char * tempC24 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC24, "%s%s",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP10 = tempC24;; 
fprintf(stderr, "%s",X10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 
} 

struct SphereRefArray1 X10_TEMP11 = X10_TEMP0 ->objects ; 
const int32_t X10_TEMP13 = X10_TEMP0 ->objectCount ; 
struct Sphere X10_TEMP15 = object ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP13 ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP11 .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array X10_TEMP11" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1Sphere ( X10_TEMP11 , RX10_TEMP3 , X10_TEMP15 ) ; 
const int32_t X10_TEMP16 = X10_TEMP0 ->objectCount ; 
const int32_t X10_TEMP17 = 1 ; 
const int32_t X10_TEMP19 = X10_TEMP16 + X10_TEMP17 ; 
const int32_t X10_TEMP20 = X10_TEMP19 ; 
X10_TEMP0 ->objectCount = ( X10_TEMP20 ) ; 
} 
} 

View /*static*/Scene_getView (  struct Scene  * const X10_TEMP0 ) 
{ 

{ 
struct View X10_TEMP2 = X10_TEMP0 ->view ; 
return X10_TEMP2 ; 
} 
} 

Light /*static*/Scene_getLight (  struct Scene  * const X10_TEMP0 ,  struct Point1 const number ) 
{ 

{ 
struct LightRefArray1 X10_TEMP1 = X10_TEMP0 ->lights ; 
struct Dist1 RX10_TEMP0 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP1 = RX10_TEMP0 .dReg ; 
const int32_t RX10_TEMP2 = searchPointInRegion1 ( RX10_TEMP1 , number ) ; 
const int32_t RX10_TEMP3 = 0 ; 
const uint32_t RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; 
if ( RX10_TEMP4 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP5 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP5 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP6 = getPlaceFromDist1 ( RX10_TEMP0 , RX10_TEMP2 ) ; 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const uint32_t RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP7 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP7 ) ; 
exit(EXIT_FAILURE);
} 

struct Light RX10_TEMP10 = getRefArrayValue1Light ( X10_TEMP1 , RX10_TEMP2 ) ; 
struct Light X10_TEMP4 = RX10_TEMP10 ; 
return X10_TEMP4 ; 
} 
} 

Sphere /*static*/Scene_getObject (  struct Scene  * const X10_TEMP0 ,  struct Point1 const number ) 
{ 

{ 
struct SphereRefArray1 X10_TEMP1 = X10_TEMP0 ->objects ; 
struct Dist1 RX10_TEMP0 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP1 = RX10_TEMP0 .dReg ; 
const int32_t RX10_TEMP2 = searchPointInRegion1 ( RX10_TEMP1 , number ) ; 
const int32_t RX10_TEMP3 = 0 ; 
const uint32_t RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; 
if ( RX10_TEMP4 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP5 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP5 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP6 = getPlaceFromDist1 ( RX10_TEMP0 , RX10_TEMP2 ) ; 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const uint32_t RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP7 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, "%s",RX10_TEMP7 ) ; 
exit(EXIT_FAILURE);
} 

struct Sphere RX10_TEMP10 = getRefArrayValue1Sphere ( X10_TEMP1 , RX10_TEMP2 ) ; 
struct Sphere X10_TEMP4 = RX10_TEMP10 ; 
return X10_TEMP4 ; 
} 
} 

int32_t /*static*/Scene_getLights (  struct Scene  * const X10_TEMP0 ) 
{ 

{ 
const int32_t X10_TEMP2 = X10_TEMP0 ->lightCount ; 
return X10_TEMP2 ; 
} 
} 

int32_t /*static*/Scene_getObjects (  struct Scene  * const X10_TEMP0 ) 
{ 

{ 
const int32_t X10_TEMP2 = X10_TEMP0 ->objectCount ; 
return X10_TEMP2 ; 
} 
} 

char * /*static*/Interval_toString (  struct Interval const X10_TEMP0 ) 
{ 

{ 
const int32_t X10_TEMP1 = X10_TEMP0 .number ; 
const char * X10_TEMP2 = " " ; 
/*ASSIGNMENT STRING*/
 char * tempC25 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC25, "%d%s",X10_TEMP1,X10_TEMP2);
const char * X10_TEMP3 = tempC25;; 
const int32_t X10_TEMP4 = X10_TEMP0 .width ; 
/*ASSIGNMENT STRING*/
 char * tempC26 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC26, "%s%d",X10_TEMP3,X10_TEMP4);
const char * X10_TEMP5 = tempC26;; 
const char * X10_TEMP6 = " " ; 
/*ASSIGNMENT STRING*/
 char * tempC27 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC27, "%s%s",X10_TEMP5,X10_TEMP6);
const char * X10_TEMP7 = tempC27;; 
const int32_t X10_TEMP8 = X10_TEMP0 .height ; 
/*ASSIGNMENT STRING*/
 char * tempC28 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC28, "%s%d",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC28;; 
const char * X10_TEMP10 = " " ; 
/*ASSIGNMENT STRING*/
 char * tempC29 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC29, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP11 = tempC29;; 
const int32_t X10_TEMP12 = X10_TEMP0 .yfrom ; 
/*ASSIGNMENT STRING*/
 char * tempC30 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC30, "%s%d",X10_TEMP11,X10_TEMP12);
const char * X10_TEMP13 = tempC30;; 
const char * X10_TEMP14 = " " ; 
/*ASSIGNMENT STRING*/
 char * tempC31 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC31, "%s%s",X10_TEMP13,X10_TEMP14);
const char * X10_TEMP15 = tempC31;; 
const int32_t X10_TEMP16 = X10_TEMP0 .yto ; 
/*ASSIGNMENT STRING*/
 char * tempC32 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC32, "%s%d",X10_TEMP15,X10_TEMP16);
const char * X10_TEMP17 = tempC32;; 
const char * X10_TEMP18 = " " ; 
/*ASSIGNMENT STRING*/
 char * tempC33 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC33, "%s%s",X10_TEMP17,X10_TEMP18);
const char * X10_TEMP19 = tempC33;; 
const int32_t X10_TEMP20 = X10_TEMP0 .total ; 
/*ASSIGNMENT STRING*/
 char * tempC34 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC34, "%s%d",X10_TEMP19,X10_TEMP20);
const char * X10_TEMP22 = tempC34;; 
return X10_TEMP22 ; 
} 
} 

char * /*static*/Surface_toString (  struct Surface const X10_TEMP0 ) 
{ 

{ 
const char * X10_TEMP1 = "Surface { color = " ; 
struct Vec X10_TEMP2 = X10_TEMP0 .color ; 
const char * X10_TEMP3 = Vec_toString ( X10_TEMP2 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC35 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC35, "%s%s",X10_TEMP1,X10_TEMP3);
const char * X10_TEMP4 = tempC35;; 
const char * X10_TEMP5 = " }" ; 
/*ASSIGNMENT STRING*/
 char * tempC36 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC36, "%s%s",X10_TEMP4,X10_TEMP5);
const char * X10_TEMP7 = tempC36;; 
return X10_TEMP7 ; 
} 
} 

char * /*static*/View_toString (  struct View const X10_TEMP0 ) 
{ 

{ 
const char * X10_TEMP1 = "View { from = " ; 
struct Vec X10_TEMP2 = X10_TEMP0 .from ; 
const char * X10_TEMP3 = Vec_toString ( X10_TEMP2 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC37 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC37, "%s%s",X10_TEMP1,X10_TEMP3);
const char * X10_TEMP4 = tempC37;; 
const char * X10_TEMP5 = " at = " ; 
/*ASSIGNMENT STRING*/
 char * tempC38 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC38, "%s%s",X10_TEMP4,X10_TEMP5);
const char * X10_TEMP6 = tempC38;; 
struct Vec X10_TEMP7 = X10_TEMP0 .att ; 
const char * X10_TEMP8 = Vec_toString ( X10_TEMP7 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC39 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC39, "%s%s",X10_TEMP6,X10_TEMP8);
const char * X10_TEMP9 = tempC39;; 
const char * X10_TEMP10 = " up = " ; 
/*ASSIGNMENT STRING*/
 char * tempC40 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC40, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP11 = tempC40;; 
struct Vec X10_TEMP12 = X10_TEMP0 .up ; 
const char * X10_TEMP13 = Vec_toString ( X10_TEMP12 ) ; 
/*ASSIGNMENT STRING*/
 char * tempC41 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC41, "%s%s",X10_TEMP11,X10_TEMP13);
const char * X10_TEMP14 = tempC41;; 
const char * X10_TEMP15 = " distance = " ; 
/*ASSIGNMENT STRING*/
 char * tempC42 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC42, "%s%s",X10_TEMP14,X10_TEMP15);
const char * X10_TEMP16 = tempC42;; 
const double X10_TEMP17 = X10_TEMP0 .distance ; 
/*ASSIGNMENT STRING*/
 char * tempC43 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC43, "%s%f",X10_TEMP16,X10_TEMP17);
const char * X10_TEMP18 = tempC43;; 
const char * X10_TEMP19 = " angle = " ; 
/*ASSIGNMENT STRING*/
 char * tempC44 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC44, "%s%s",X10_TEMP18,X10_TEMP19);
const char * X10_TEMP20 = tempC44;; 
const double X10_TEMP21 = X10_TEMP0 .angle ; 
/*ASSIGNMENT STRING*/
 char * tempC45 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC45, "%s%f",X10_TEMP20,X10_TEMP21);
const char * X10_TEMP22 = tempC45;; 
const char * X10_TEMP23 = " aspect = " ; 
/*ASSIGNMENT STRING*/
 char * tempC46 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC46, "%s%s",X10_TEMP22,X10_TEMP23);
const char * X10_TEMP24 = tempC46;; 
const double X10_TEMP25 = X10_TEMP0 .aspect ; 
/*ASSIGNMENT STRING*/
 char * tempC47 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC47, "%s%f",X10_TEMP24,X10_TEMP25);
const char * X10_TEMP26 = tempC47;; 
const char * X10_TEMP27 = "}" ; 
/*ASSIGNMENT STRING*/
 char * tempC48 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory_string) += 4*ceil(0.25 *(  1000 * sizeof(char)));
sprintf(tempC48, "%s%s",X10_TEMP26,X10_TEMP27);
const char * X10_TEMP29 = tempC48;; 
return X10_TEMP29 ; 
} 
} 

int32_t /*static*/_Timer_max_counters_init ( ) 
{ 
const int32_t X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 

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
} 

void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 

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
} 

double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 

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
} 

void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) 
{ 

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
} 

void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t i = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP4 = i < _Timer_max_counters ; 

while ( X10_TEMP4 ) 
{ 

{ 
Timer_resetTimer ( X10_TEMP0 , i ) ; 
const int32_t X10_TEMP6 = i ; 
const int32_t X10_TEMP7 = 1 ; 
i = i + X10_TEMP7 ; } 
X10_TEMP4 = i < _Timer_max_counters ; } 

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

void /*static*/setRefArrayValue1Light (  struct LightRefArray1 const array , const int32_t index ,  struct Light const val ) 
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
/*VALUE ARRAY*/ struct LightStub * const contents = array .contents ; 
struct LightStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Light * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
} 

Vec /*static*/getRefArrayValue1Vec (  struct VecRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct VecStub * const contents = array .contents ; 
struct VecStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Vec * const localArray = indexStub .localArray ; 
struct Vec returnValue = localArray [ localIndex ] 
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
void * TEMPCALLOCPOINTER23;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER23 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(placeRegion*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER23)[0] = placeRegion, TEMPCALLOCPOINTER23 = ((int32_t * )TEMPCALLOCPOINTER23)+1, memset(TEMPCALLOCPOINTER23,0,placeRegion*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER24;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER24 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(pointRegion*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER24)[0] = pointRegion, TEMPCALLOCPOINTER24 = ((int32_t * )TEMPCALLOCPOINTER24)+1, memset(TEMPCALLOCPOINTER24,0,pointRegion*sizeof(Point1 )) ); 

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

void /*static*/setRefArrayValue1Vec (  struct VecRefArray1 const array , const int32_t index ,  struct Vec const val ) 
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
/*VALUE ARRAY*/ struct VecStub * const contents = array .contents ; 
struct VecStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Vec * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
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

Sphere /*static*/getRefArrayValue1Sphere (  struct SphereRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct SphereStub * const contents = array .contents ; 
struct SphereStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Sphere * const localArray = indexStub .localArray ; 
struct Sphere returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
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

Light /*static*/getRefArrayValue1Light (  struct LightRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct LightStub * const contents = array .contents ; 
struct LightStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Light * const localArray = indexStub .localArray ; 
struct Light returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
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

void /*static*/setRefArrayValue1Sphere (  struct SphereRefArray1 const array , const int32_t index ,  struct Sphere const val ) 
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
/*VALUE ARRAY*/ struct SphereStub * const contents = array .contents ; 
struct SphereStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct Sphere * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
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
void * TEMPCALLOCPOINTER50;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER50)[0] = tempReg, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER51;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER51)[0] = tempDist, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER52;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER52 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER52)[0] = tempReg, TEMPCALLOCPOINTER52 = ((int32_t * )TEMPCALLOCPOINTER52)+1, memset(TEMPCALLOCPOINTER52,0,tempReg*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER56;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER56 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER56)[0] = tempReg, TEMPCALLOCPOINTER56 = ((int32_t * )TEMPCALLOCPOINTER56)+1, memset(TEMPCALLOCPOINTER56,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER57;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER57 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER57)[0] = tempDist, TEMPCALLOCPOINTER57 = ((int32_t * )TEMPCALLOCPOINTER57)+1, memset(TEMPCALLOCPOINTER57,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER58;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER58 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(tempReg*sizeof( Point1 )))),((int32_t * )TEMPCALLOCPOINTER58)[0] = tempReg, TEMPCALLOCPOINTER58 = ((int32_t * )TEMPCALLOCPOINTER58)+1, memset(TEMPCALLOCPOINTER58,0,tempReg*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER59;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER59 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dDist*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER59)[0] = dDist, TEMPCALLOCPOINTER59 = ((int32_t * )TEMPCALLOCPOINTER59)+1, memset(TEMPCALLOCPOINTER59,0,dDist*sizeof(place_t ) ) ); 
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
void * TEMPCALLOCPOINTER60;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER60 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER60)[0] = dReg, TEMPCALLOCPOINTER60 = ((int32_t * )TEMPCALLOCPOINTER60)+1, memset(TEMPCALLOCPOINTER60,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER61;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER61 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER61)[0] = dReg, TEMPCALLOCPOINTER61 = ((int32_t * )TEMPCALLOCPOINTER61)+1, memset(TEMPCALLOCPOINTER61,0,dReg*sizeof(place_t )) ); 

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

Point3 /*static*/regionOrdinalPoint3 (  struct Region3 const reg , const int32_t ordl ) 
{ 
const uint32_t regType = reg .regType ; 
if ( regType ) 
{ 
struct Point3 pt = regionOrdinalPointRegular3 ( reg , ordl ) ; 
return pt ; 
} 

struct Point3 pt = regionOrdinalPointArbitrary3 ( reg , ordl ) ; 
return pt ; 
} 

Point3 /*static*/regionOrdinalPointRegular3 (  struct Region3 const reg , const int32_t ordl ) 
{ 
const int32_t stride3 = 1 ; 
const int32_t dim3 = reg .dim2 ; 
const int32_t stride2 = stride3 * dim3 ; 
const int32_t regLow3 = reg .low2 ; 
const int32_t dim2 = reg .dim1 ; 
const int32_t stride1 = stride2 * dim2 ; 
const int32_t regLow2 = reg .low1 ; 
const int32_t dim1 = reg .dim0 ; 
const int32_t stride0 = stride1 * dim1 ; 
const int32_t regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/
int32_t f3 = ordl / stride3 ; 
f3 = f3 % dim3 ; f3 = f3 + regLow3 ; /*UpdatableVariableDeclaration*/
int32_t f2 = ordl / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/
int32_t f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point3 pt  ; 
Point3_Point3( &pt/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 , f3 ) ; 
return pt ; 
} 

Point3 /*static*/regionOrdinalPointArbitrary3 (  struct Region3 const reg , const int32_t ordl ) 
{ 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Point3 * const pointArray = reg .pointArray ; 
struct Point3 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

void /*static*/setRefArrayValue1long (  struct longRefArray1 const array , const int32_t index , const int64_t val ) 
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
/*VALUE ARRAY*/ struct longStub * const contents = array .contents ; 
struct longStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int64_t * const localArray = indexStub .localArray ; 
localArray [ localIndex ] = ( val ) ; 
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

int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) 
{ 
struct Dist d = dn .dDist ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const counts = d .counts ; 
const int32_t localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int64_t /*static*/getRefArrayValue1long (  struct longRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct longStub * const contents = array .contents ; 
struct longStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ int64_t * const localArray = indexStub .localArray ; 
const int64_t returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
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

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER70;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER70 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(dReg*sizeof( place_t )))),((int32_t * )TEMPCALLOCPOINTER70)[0] = dReg, TEMPCALLOCPOINTER70 = ((int32_t * )TEMPCALLOCPOINTER70)+1, memset(TEMPCALLOCPOINTER70,0,dReg*sizeof(place_t )) ); 

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

Region3 /*static*/createNewRegion3RRR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 , const int32_t v3_0 , const int32_t v3_1 ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
/*UpdatableVariableDeclaration*/
uint32_t regType = 1 ; 
const uint32_t tempBool1 = 1 ; 
const uint32_t tempBool2 = 1 ; 
const uint32_t tempBool3 = 1 ; 
regType = regType && tempBool1 ; regType = regType && tempBool2 ; regType = regType && tempBool3 ; const int32_t l1 = v1_1 - v1_0 ; 
const int32_t dim1 = l1 + one ; 
const int32_t l2 = v2_1 - v2_0 ; 
const int32_t dim2 = l2 + one ; 
const int32_t l3 = v3_1 - v3_0 ; 
const int32_t dim3 = l3 + one ; 
const int32_t stride3 = 1 ; 
const int32_t stride2 = stride3 * dim3 ; 
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
/*VALUE ARRAY*/ struct Point3 * const ptArray = (/*VALUE ARRAY*/ struct Point3 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER75 = malloc(sizeof(int32_t)+(regArr*sizeof( Point3 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point3 )))),((int32_t * )TEMPCALLOCPOINTER75)[0] = regArr, TEMPCALLOCPOINTER75 = ((int32_t * )TEMPCALLOCPOINTER75)+1, memset(TEMPCALLOCPOINTER75,0,regArr*sizeof(Point3 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point3 pt  ; 
Point3_Point3( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero , zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region3 retRegEmpty  ; 
Region3_Region3_8( &retRegEmpty/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , zero , zero , zero , zero , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ 
const int32_t minusOne = zero - one ; 
const int32_t regArr = minusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER76;
/*VALUE ARRAY*/ struct Point3 * const ptArray = (/*VALUE ARRAY*/ struct Point3 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER76 = malloc(sizeof(int32_t)+(regArr*sizeof( Point3 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point3 )))),((int32_t * )TEMPCALLOCPOINTER76)[0] = regArr, TEMPCALLOCPOINTER76 = ((int32_t * )TEMPCALLOCPOINTER76)+1, memset(TEMPCALLOCPOINTER76,0,regArr*sizeof(Point3 )) ); 

/*ArrayInitializer*/
for( int32_t p = 0;p < regArr; p++) 

{ 
struct Point3 pt  ; 
Point3_Point3( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero , zero ) ; 
ptArray[p] = pt ; 
} 
/*END OF ARRAY INIT*/struct Region3 retRegRegular  ; 
Region3_Region3_8( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 , v3_0 , dim3 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int32_t regArr = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER77;
/*VALUE ARRAY*/ struct Point3 * const ptArray = (/*VALUE ARRAY*/ struct Point3 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER77 = malloc(sizeof(int32_t)+(regArr*sizeof( Point3 ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(regArr*sizeof( Point3 )))),((int32_t * )TEMPCALLOCPOINTER77)[0] = regArr, TEMPCALLOCPOINTER77 = ((int32_t * )TEMPCALLOCPOINTER77)+1, memset(TEMPCALLOCPOINTER77,0,regArr*sizeof(Point3 )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < regArr; pt++) 

{ 
const int32_t p = /*PointAccess*/pt ; 
/*UpdatableVariableDeclaration*/
int32_t f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; /*UpdatableVariableDeclaration*/
int32_t f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + v2_0 ; /*UpdatableVariableDeclaration*/
int32_t f3 = p / stride3 ; 
f3 = f3 % dim3 ; f3 = f3 + v3_0 ; struct Point3 retPoint  ; 
Point3_Point3( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 , f3 ) ; 
ptArray[pt] = retPoint ; 
} 
/*END OF ARRAY INIT*/struct Region3 retReg  ; 
Region3_Region3_2( &retReg/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 ) ; 
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
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER79;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER79 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER79)[0] = RX10_TEMP13, TEMPCALLOCPOINTER79 = ((int32_t * )TEMPCALLOCPOINTER79)+1, memset(TEMPCALLOCPOINTER79,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T16 utmp16  ; 
T16_T16( &utmp16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC10) ;
a.size = sizeof(utmp16 );
a.params = (void *)(&utmp16 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER81;
/*Updatable ARRAY*/ int64_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int64_t * ) ( TEMPCALLOCPOINTER81 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int64_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( int64_t )))),((int32_t * )TEMPCALLOCPOINTER81)[0] = RX10_TEMP13, TEMPCALLOCPOINTER81 = ((int32_t * )TEMPCALLOCPOINTER81)+1, memset(TEMPCALLOCPOINTER81,0,RX10_TEMP13*sizeof(int64_t ) ) ); 
struct longStub RX10_TEMP15  ; 
longStub_longStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T17 utmp17  ; 
T17_T17( &utmp17/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC11) ;
a.size = sizeof(utmp17 );
a.params = (void *)(&utmp17 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
const int32_t myobjCount = utmpz .myobjCount ; 
const int32_t mylightCount = utmpz .mylightCount ; 
struct Scene * sc = utmpz .sc ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
const place_t pHere = /* here  */ _here(); 
const int32_t X10_TEMP18 = 0 ; 
const int32_t X10_TEMP16 = 1 ; 
const int32_t X10_TEMP19 = mylightCount - X10_TEMP16 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 d1 = createNewRegion1R ( X10_TEMP18 , X10_TEMP19 ) ; 
const int32_t X10_TEMP24 = 0 ; 
const int32_t X10_TEMP22 = 1 ; 
const int32_t X10_TEMP25 = myobjCount - X10_TEMP22 ; 
/*UpdatableVariableDeclaration*/
 struct Region1 d2 = createNewRegion1R ( X10_TEMP24 , X10_TEMP25 ) ; 
struct Region1 RX10_TEMP12 = d1 ; 
const int32_t RX10_TEMP59 = d1 .regSize ; 
const int32_t RX10_TEMP60 = 1 ; 
const int32_t RX10_TEMP61 = RX10_TEMP59 - RX10_TEMP60 ; 
const int32_t RX10_TEMP58 = RX10_TEMP61 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER82;
/*VALUE ARRAY*/ struct Light * const RX10_TEMP62 = (/*VALUE ARRAY*/ struct Light * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER82 = malloc(sizeof(int32_t)+(RX10_TEMP58*sizeof( Light ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP58*sizeof( Light )))),((int32_t * )TEMPCALLOCPOINTER82)[0] = RX10_TEMP58, TEMPCALLOCPOINTER82 = ((int32_t * )TEMPCALLOCPOINTER82)+1, memset(TEMPCALLOCPOINTER82,0,RX10_TEMP58*sizeof(Light )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP58; RX10_TEMP13++) 

{ 
const int32_t RX10_TEMP14 = /*PointAccess*/RX10_TEMP13 ; 
struct Point1 l = regionOrdinalPoint1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 

{ 
const int32_t X10_TEMP29 = 0 ; 
const int32_t X10_TEMP30 = 0 ; 
struct Region1 X10_TEMP31 = createNewRegion1R ( X10_TEMP29 , X10_TEMP30 ) ; 
struct Dist1 dTemp = getPlaceDist1 ( X10_TEMP31 , pHere ) ; 
struct Region1 RX10_TEMP15 = dTemp .dReg ; 
const int32_t RX10_TEMP16 = 0 ; 
const int32_t RX10_TEMP17 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP18 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP18 = RX10_TEMP18 - RX10_TEMP17 ; const int32_t RX10_TEMP19 = RX10_TEMP18 + 1; 
const int32_t RX10_TEMP20 = /*SimpleDistributionExpression*/ RX10_TEMP18 +1; 
void * TEMPCALLOCPOINTER83;
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP21 = (/*Updatable ARRAY*/ struct LightStub * ) ( TEMPCALLOCPOINTER83 = malloc(sizeof(int32_t)+(RX10_TEMP20*sizeof( LightStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP20*sizeof( LightStub )))),((int32_t * )TEMPCALLOCPOINTER83)[0] = RX10_TEMP20, TEMPCALLOCPOINTER83 = ((int32_t * )TEMPCALLOCPOINTER83)+1, memset(TEMPCALLOCPOINTER83,0,RX10_TEMP20*sizeof(LightStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP22= 0; RX10_TEMP22<  RX10_TEMP19; RX10_TEMP22++ )
 
{ 
const place_t RX10_TEMP23 = /* here  */ _here(); 
const int32_t RX10_TEMP24 = /*PointAccess*/RX10_TEMP22 ; 
const place_t RX10_TEMP25 = /* place.places ( RX10_TEMP24 )  */ _toplace(RX10_TEMP24 ); 
const int32_t RX10_TEMP26 = getDistLocalCount1 ( dTemp , RX10_TEMP24 ) ; 
const int32_t RX10_TEMP27 = RX10_TEMP26 - RX10_TEMP17 ; 
struct T18 utmp18  ; 
T18_T18( &utmp18/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP27 , RX10_TEMP23 , RX10_TEMP22 , RX10_TEMP21 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC12) ;
a.size = sizeof(utmp18 );
a.params = (void *)(&utmp18 );
task_dispatch(a, RX10_TEMP25 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER84;
/*VALUE ARRAY*/ struct LightStub * const RX10_TEMP31 = (/*VALUE ARRAY*/ struct LightStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER84 = malloc(sizeof(int32_t)+(RX10_TEMP19*sizeof( LightStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP19*sizeof( LightStub )))),((int32_t * )TEMPCALLOCPOINTER84)[0] = RX10_TEMP19, TEMPCALLOCPOINTER84 = ((int32_t * )TEMPCALLOCPOINTER84)+1, memset(TEMPCALLOCPOINTER84,0,RX10_TEMP19*sizeof(LightStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP33 = 0;RX10_TEMP33 < RX10_TEMP19; RX10_TEMP33++) 

{ 
struct LightStub RX10_TEMP32 = RX10_TEMP21 [ RX10_TEMP33 ] 
; 
RX10_TEMP31[RX10_TEMP33] = RX10_TEMP32 ; 
} 
/*END OF ARRAY INIT*/struct LightRefArray1 RX10_TEMP34  ; 
LightRefArray1_LightRefArray1( &RX10_TEMP34/*OBJECT INIT IN ASSIGNMENT*/, dTemp , RX10_TEMP31 ) ; 
struct LightRefArray1 temp = RX10_TEMP34 ; 
struct Point1 temp_l = l ; 
/* finish  */ task_start_finish();

{ 
const place_t X10_TEMP36 = /* place.FIRST_PLACE  */ _place_first(); 
struct T19 utmp19  ; 
T19_T19( &utmp19/*OBJECT INIT IN ASSIGNMENT*/, temp_l , temp , pHere , sc ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC13) ;
a.size = sizeof(utmp19 );
a.params = (void *)(&utmp19 );
task_dispatch(a, X10_TEMP36 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP45 = 0 ; 
struct Point1 RX10_TEMP46  ; 
Point1_Point1( &RX10_TEMP46/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP45 ) ; 
struct Dist1 RX10_TEMP47 = temp .distValue ; 
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
char * RX10_TEMP54 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

struct Light RX10_TEMP57 = getRefArrayValue1Light ( temp , RX10_TEMP49 ) ; 
struct Light X10_TEMP47 = RX10_TEMP57 ; 
RX10_TEMP62[RX10_TEMP13] = X10_TEMP47 ; 
} 
} 
/*END OF ARRAY INIT*/struct LightValArray1 RX10_TEMP63  ; 
LightValArray1_LightValArray1( &RX10_TEMP63/*OBJECT INIT IN ASSIGNMENT*/, d1 , RX10_TEMP62 ) ; 
struct LightValArray1 X10_TEMP48 = RX10_TEMP63 ; 
struct LightValArray1 templights = X10_TEMP48 ; 
const place_t X10_TEMP50 = /* here  */ _here(); 
const place_t X10_TEMP51 = /* place.FIRST_PLACE  */ _place_first(); 
const uint32_t X10_TEMP53 = X10_TEMP50 == X10_TEMP51 ; 
if ( X10_TEMP53 ) 
{ 

{ 
struct LightValArray1 X10_TEMP55 = templights ; 
X10_TEMP0 ->lights = ( X10_TEMP55 ) ; 
} 
} 

struct Region1 RX10_TEMP64 = d2 ; 
const int32_t RX10_TEMP111 = d2 .regSize ; 
const int32_t RX10_TEMP112 = 1 ; 
const int32_t RX10_TEMP113 = RX10_TEMP111 - RX10_TEMP112 ; 
const int32_t RX10_TEMP110 = RX10_TEMP113 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER85;
/*VALUE ARRAY*/ struct Sphere * const RX10_TEMP114 = (/*VALUE ARRAY*/ struct Sphere * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER85 = malloc(sizeof(int32_t)+(RX10_TEMP110*sizeof( Sphere ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP110*sizeof( Sphere )))),((int32_t * )TEMPCALLOCPOINTER85)[0] = RX10_TEMP110, TEMPCALLOCPOINTER85 = ((int32_t * )TEMPCALLOCPOINTER85)+1, memset(TEMPCALLOCPOINTER85,0,RX10_TEMP110*sizeof(Sphere )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP65 = 0;RX10_TEMP65 < RX10_TEMP110; RX10_TEMP65++) 

{ 
const int32_t RX10_TEMP66 = /*PointAccess*/RX10_TEMP65 ; 
struct Point1 o = regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP66 ) ; 

{ 
const int32_t X10_TEMP58 = 0 ; 
const int32_t X10_TEMP59 = 0 ; 
struct Region1 X10_TEMP60 = createNewRegion1R ( X10_TEMP58 , X10_TEMP59 ) ; 
struct Dist1 dTemp1 = getPlaceDist1 ( X10_TEMP60 , pHere ) ; 
struct Region1 RX10_TEMP67 = dTemp1 .dReg ; 
const int32_t RX10_TEMP68 = 0 ; 
const int32_t RX10_TEMP69 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP70 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP70 = RX10_TEMP70 - RX10_TEMP69 ; const int32_t RX10_TEMP71 = RX10_TEMP70 + 1; 
const int32_t RX10_TEMP72 = /*SimpleDistributionExpression*/ RX10_TEMP70 +1; 
void * TEMPCALLOCPOINTER86;
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP73 = (/*Updatable ARRAY*/ struct SphereStub * ) ( TEMPCALLOCPOINTER86 = malloc(sizeof(int32_t)+(RX10_TEMP72*sizeof( SphereStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP72*sizeof( SphereStub )))),((int32_t * )TEMPCALLOCPOINTER86)[0] = RX10_TEMP72, TEMPCALLOCPOINTER86 = ((int32_t * )TEMPCALLOCPOINTER86)+1, memset(TEMPCALLOCPOINTER86,0,RX10_TEMP72*sizeof(SphereStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP74= 0; RX10_TEMP74<  RX10_TEMP71; RX10_TEMP74++ )
 
{ 
const place_t RX10_TEMP75 = /* here  */ _here(); 
const int32_t RX10_TEMP76 = /*PointAccess*/RX10_TEMP74 ; 
const place_t RX10_TEMP77 = /* place.places ( RX10_TEMP76 )  */ _toplace(RX10_TEMP76 ); 
const int32_t RX10_TEMP78 = getDistLocalCount1 ( dTemp1 , RX10_TEMP76 ) ; 
const int32_t RX10_TEMP79 = RX10_TEMP78 - RX10_TEMP69 ; 
struct T20 utmp20  ; 
T20_T20( &utmp20/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP79 , RX10_TEMP75 , RX10_TEMP74 , RX10_TEMP73 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC14) ;
a.size = sizeof(utmp20 );
a.params = (void *)(&utmp20 );
task_dispatch(a, RX10_TEMP77 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER87;
/*VALUE ARRAY*/ struct SphereStub * const RX10_TEMP83 = (/*VALUE ARRAY*/ struct SphereStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER87 = malloc(sizeof(int32_t)+(RX10_TEMP71*sizeof( SphereStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP71*sizeof( SphereStub )))),((int32_t * )TEMPCALLOCPOINTER87)[0] = RX10_TEMP71, TEMPCALLOCPOINTER87 = ((int32_t * )TEMPCALLOCPOINTER87)+1, memset(TEMPCALLOCPOINTER87,0,RX10_TEMP71*sizeof(SphereStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP85 = 0;RX10_TEMP85 < RX10_TEMP71; RX10_TEMP85++) 

{ 
struct SphereStub RX10_TEMP84 = RX10_TEMP73 [ RX10_TEMP85 ] 
; 
RX10_TEMP83[RX10_TEMP85] = RX10_TEMP84 ; 
} 
/*END OF ARRAY INIT*/struct SphereRefArray1 RX10_TEMP86  ; 
SphereRefArray1_SphereRefArray1( &RX10_TEMP86/*OBJECT INIT IN ASSIGNMENT*/, dTemp1 , RX10_TEMP83 ) ; 
struct SphereRefArray1 temp1 = RX10_TEMP86 ; 
struct Point1 temp_o = o ; 
/* finish  */ task_start_finish();

{ 
const place_t X10_TEMP65 = /* place.FIRST_PLACE  */ _place_first(); 
struct T21 utmp21  ; 
T21_T21( &utmp21/*OBJECT INIT IN ASSIGNMENT*/, temp_o , temp1 , pHere , sc ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC15) ;
a.size = sizeof(utmp21 );
a.params = (void *)(&utmp21 );
task_dispatch(a, X10_TEMP65 );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
const int32_t X10_TEMP74 = 0 ; 
struct Point1 RX10_TEMP98  ; 
Point1_Point1( &RX10_TEMP98/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP74 ) ; 
struct Dist1 RX10_TEMP99 = temp1 .distValue ; 
struct Region1 RX10_TEMP100 = RX10_TEMP99 .dReg ; 
const int32_t RX10_TEMP101 = searchPointInRegion1 ( RX10_TEMP100 , RX10_TEMP98 ) ; 
const int32_t RX10_TEMP102 = 0 ; 
const uint32_t RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102 ; 
if ( RX10_TEMP103 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP104 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP104 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP105 = getPlaceFromDist1 ( RX10_TEMP99 , RX10_TEMP101 ) ; 
const place_t RX10_TEMP107 = /* here  */ _here(); 
const uint32_t RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107 ; 
if ( RX10_TEMP108 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP106 = "Bad place access for array temp1" ; 
fprintf(stderr, "%s",RX10_TEMP106 ) ; 
exit(EXIT_FAILURE);
} 

struct Sphere RX10_TEMP109 = getRefArrayValue1Sphere ( temp1 , RX10_TEMP101 ) ; 
struct Sphere X10_TEMP76 = RX10_TEMP109 ; 
RX10_TEMP114[RX10_TEMP65] = X10_TEMP76 ; 
} 
} 
/*END OF ARRAY INIT*/struct SphereValArray1 RX10_TEMP115  ; 
SphereValArray1_SphereValArray1( &RX10_TEMP115/*OBJECT INIT IN ASSIGNMENT*/, d2 , RX10_TEMP114 ) ; 
struct SphereValArray1 X10_TEMP77 = RX10_TEMP115 ; 
struct SphereValArray1 tempprim = X10_TEMP77 ; 
const place_t X10_TEMP79 = /* here  */ _here(); 
const place_t X10_TEMP80 = /* place.FIRST_PLACE  */ _place_first(); 
const uint32_t X10_TEMP82 = X10_TEMP79 == X10_TEMP80 ; 
if ( X10_TEMP82 ) 
{ 

{ 
struct SphereValArray1 X10_TEMP84 = tempprim ; 
X10_TEMP0 ->prim = ( X10_TEMP84 ) ; 
} 
} 

} 
} 
} 

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER89;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER89 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER89)[0] = RX10_TEMP13, TEMPCALLOCPOINTER89 = ((int32_t * )TEMPCALLOCPOINTER89)+1, memset(TEMPCALLOCPOINTER89,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T22 utmp22  ; 
T22_T22( &utmp22/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC16) ;
a.size = sizeof(utmp22 );
a.params = (void *)(&utmp22 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread5 (  struct T5 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP34 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER91;
/*Updatable ARRAY*/ int64_t * const RX10_TEMP35 = (/*Updatable ARRAY*/ int64_t * ) ( TEMPCALLOCPOINTER91 = malloc(sizeof(int32_t)+(RX10_TEMP34*sizeof( int64_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP34*sizeof( int64_t )))),((int32_t * )TEMPCALLOCPOINTER91)[0] = RX10_TEMP34, TEMPCALLOCPOINTER91 = ((int32_t * )TEMPCALLOCPOINTER91)+1, memset(TEMPCALLOCPOINTER91,0,RX10_TEMP34*sizeof(int64_t ) ) ); 
struct longStub RX10_TEMP36  ; 
longStub_longStub( &RX10_TEMP36/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP35 ) ; 
struct T23 utmp23  ; 
T23_T23( &utmp23/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC17) ;
a.size = sizeof(utmp23 );
a.params = (void *)(&utmp23 );
task_dispatch(a, RX10_TEMP29 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread6 (  struct T6 const utmpz ) 
{ 
struct Point1 pl = utmpz .pl ; 
struct View myview = utmpz .myview ; 
const place_t fp = utmpz .fp ; 
struct Dist1 DBlock = utmpz .DBlock ; 
struct Interval interval = utmpz .interval ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
const place_t X10_TEMP30 = /* here  */ _here(); 
struct Dist1 my_dist = restrictDist1 ( DBlock , X10_TEMP30 ) ; 
/*UpdatableVariableDeclaration*/
int64_t checksum1 = 0 ; 
const double X10_TEMP41 = myview .distance ; 
const double X10_TEMP34 = myview .angle ; 
const double X10_TEMP37 = sin ( X10_TEMP34 ) ; 
const double X10_TEMP36 = myview .angle ; 
const double X10_TEMP38 = cos ( X10_TEMP36 ) ; 
const double X10_TEMP40 = X10_TEMP37 / X10_TEMP38 ; 
/*UpdatableVariableDeclaration*/
double frustrumwidth = X10_TEMP41 * X10_TEMP40 ; 
struct Vec X10_TEMP45 = myview .att ; 
struct Vec X10_TEMP46 = myview .from ; 
struct Vec X10_TEMP47 = Vec_sub ( X10_TEMP45 , X10_TEMP46 ) ; 
/*UpdatableVariableDeclaration*/
 struct Vec viewVec = Vec_normalized ( X10_TEMP47 ) ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP51 = 0 ; 
struct Vec X10_TEMP52  ; 
Vec_Vec_2( &X10_TEMP52/*OBJECT INIT IN ASSIGNMENT*/, viewVec , X10_TEMP51 ) ; 
struct Vec X10_TEMP55 = myview .up ; 
const double X10_TEMP57 = Vec_dot ( X10_TEMP55 , viewVec ) ; 
/*UpdatableVariableDeclaration*/
 struct Vec tmpVec = Vec_scale ( X10_TEMP52 , X10_TEMP57 ) ; 
struct Vec X10_TEMP61 = myview .up ; 
struct Vec X10_TEMP62 = Vec_sub ( X10_TEMP61 , tmpVec ) ; 
struct Vec X10_TEMP63 = Vec_normalized ( X10_TEMP62 ) ; 
const int32_t X10_TEMP64 = 0 ; 
const double X10_TEMP66 = X10_TEMP64 - frustrumwidth ; 
/*UpdatableVariableDeclaration*/
 struct Vec upVec = Vec_scale ( X10_TEMP63 , X10_TEMP66 ) ; 
struct Vec X10_TEMP70 = myview .up ; 
struct Vec X10_TEMP71 = Vec_cross ( X10_TEMP70 , viewVec ) ; 
struct Vec X10_TEMP72 = Vec_normalized ( X10_TEMP71 ) ; 
const double X10_TEMP73 = myview .aspect ; 
const double X10_TEMP75 = X10_TEMP73 * frustrumwidth ; 
/*UpdatableVariableDeclaration*/
 struct Vec leftVec = Vec_scale ( X10_TEMP72 , X10_TEMP75 ) ; 
/*UpdatableVariableDeclaration*/
 struct Vec X10_TEMP79 = myview .from ; 
/*UpdatableVariableDeclaration*/
 struct Ray  * r = (struct Ray  *) ((((_task*)_thread_getspecific()) -> total_memory_class) += 4*ceil(0.25 *(  sizeof(struct Ray ))),malloc(sizeof(struct Ray )));  
memset(r,0,sizeof(struct Ray )); 
Ray_Ray_2( r/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP79 , _RayTracer_voidVec ) ; 
struct Region1 RX10_TEMP53 = my_dist .dReg ; 
struct Region1 X10_TEMP82 = RX10_TEMP53 ; 
const int32_t RX10_TEMP57 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP55 = X10_TEMP82 .regSize ; 
RX10_TEMP55 = RX10_TEMP55 - RX10_TEMP57 ; const int32_t RX10_TEMP56 = RX10_TEMP55 + 1; 
for ( int32_t RX10_TEMP54= 0; RX10_TEMP54<  RX10_TEMP56; RX10_TEMP54++ )
 
{ 
const int32_t RX10_TEMP58 = /*PointAccess*/RX10_TEMP54 ; 
struct Point1 pixCounter = regionOrdinalPoint1 ( X10_TEMP82 , RX10_TEMP58 ) ; 

{ 
const int32_t X10_TEMP84 = pixCounter .f0 ; 
const int32_t X10_TEMP85 = interval .width ; 
/*UpdatableVariableDeclaration*/
int32_t y = X10_TEMP84 / X10_TEMP85 ; 
const int32_t X10_TEMP88 = pixCounter .f0 ; 
const int32_t X10_TEMP89 = interval .width ; 
/*UpdatableVariableDeclaration*/
int32_t x = X10_TEMP88 % X10_TEMP89 ; 
const double X10_TEMP91 = 2.0; 
const double X10_TEMP93 = X10_TEMP91 * y ; 
const double X10_TEMP95 = /*casting*/( double ) X10_TEMP93 ; 
const int32_t X10_TEMP94 = interval .width ; 
const double X10_TEMP96 = /*casting*/( double ) X10_TEMP94 ; 
const double X10_TEMP97 = X10_TEMP95 / X10_TEMP96 ; 
const double X10_TEMP98 = 1.0; 
/*UpdatableVariableDeclaration*/
double ylen = X10_TEMP97 - X10_TEMP98 ; 
const double X10_TEMP100 = 2.0; 
const double X10_TEMP102 = X10_TEMP100 * x ; 
const double X10_TEMP104 = /*casting*/( double ) X10_TEMP102 ; 
const int32_t X10_TEMP103 = interval .width ; 
const double X10_TEMP105 = /*casting*/( double ) X10_TEMP103 ; 
const double X10_TEMP106 = X10_TEMP104 / X10_TEMP105 ; 
const double X10_TEMP107 = 1.0; 
/*UpdatableVariableDeclaration*/
double xlen = X10_TEMP106 - X10_TEMP107 ; 
struct Vec X10_TEMP113 = Vec_comb ( xlen , leftVec , ylen , upVec ) ; 
struct Vec X10_TEMP115 = Vec_added ( X10_TEMP113 , viewVec ) ; 
struct Vec X10_TEMP117 = Vec_normalized ( X10_TEMP115 ) ; 
struct Ray * X10_TEMP119 = Ray_d ( r , X10_TEMP117 ) ; 
r = X10_TEMP119 ; const int32_t X10_TEMP125 = 0 ; 
const double X10_TEMP126 = 1.0; 
struct Isect * X10_TEMP127 = (struct Isect  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Isect ))),malloc(sizeof(struct Isect )));  
memset(X10_TEMP127,0,sizeof(struct Isect )); 
Isect_Isect_0( X10_TEMP127/*OBJECT INIT IN ASSIGNMENT*/) ; 
struct Ray * X10_TEMP128 = (struct Ray  *)  ((((_task*)_thread_getspecific()) -> total_memory_value_class) += 4*ceil(0.25 *(  sizeof(struct Ray ))),malloc(sizeof(struct Ray )));  
memset(X10_TEMP128,0,sizeof(struct Ray )); 
Ray_Ray_0( X10_TEMP128/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/
 struct Vec col = RayTracer_trace ( X10_TEMP0 , X10_TEMP125 , X10_TEMP126 , r , X10_TEMP127 , X10_TEMP128 ) ; 
const double X10_TEMP130 = col .x ; 
const double X10_TEMP131 = 255.0; 
const double X10_TEMP133 = X10_TEMP130 * X10_TEMP131 ; 
/*UpdatableVariableDeclaration*/
int32_t red = /*casting*/( int32_t ) X10_TEMP133 ; 
const int32_t X10_TEMP135 = 255 ; 
const uint32_t X10_TEMP137 = red > X10_TEMP135 ; 
if ( X10_TEMP137 ) 
{ 
const int32_t X10_TEMP139 = 255 ; 
red = X10_TEMP139 ; } 

const double X10_TEMP140 = col .y ; 
const double X10_TEMP141 = 255.0; 
const double X10_TEMP143 = X10_TEMP140 * X10_TEMP141 ; 
/*UpdatableVariableDeclaration*/
int32_t green = /*casting*/( int32_t ) X10_TEMP143 ; 
const int32_t X10_TEMP145 = 255 ; 
const uint32_t X10_TEMP147 = green > X10_TEMP145 ; 
if ( X10_TEMP147 ) 
{ 
const int32_t X10_TEMP149 = 255 ; 
green = X10_TEMP149 ; } 

const double X10_TEMP150 = col .z ; 
const double X10_TEMP151 = 255.0; 
const double X10_TEMP153 = X10_TEMP150 * X10_TEMP151 ; 
/*UpdatableVariableDeclaration*/
int32_t blue = /*casting*/( int32_t ) X10_TEMP153 ; 
const int32_t X10_TEMP155 = 255 ; 
const uint32_t X10_TEMP157 = blue > X10_TEMP155 ; 
if ( X10_TEMP157 ) 
{ 
const int32_t X10_TEMP159 = 255 ; 
blue = X10_TEMP159 ; } 

const int64_t X10_TEMP160 = checksum1 + red ; 
const int64_t X10_TEMP161 = X10_TEMP160 + green ; 
const int64_t X10_TEMP163 = X10_TEMP161 + blue ; 
checksum1 = X10_TEMP163 ; } 
} 

const int64_t checksumx = checksum1 ; 
/* finish  */ task_start_finish();

{ 
struct T24 utmp24  ; 
T24_T24( &utmp24/*OBJECT INIT IN ASSIGNMENT*/, checksumx , pl , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC18) ;
a.size = sizeof(utmp24 );
a.params = (void *)(&utmp24 );
task_dispatch(a, fp );


}/*END OF ASYNC*/
} 
task_end_finish();
/*END OF FINISH*/
} 
} 
} 

void /*static*/thread7 (  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER93;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER93 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER93)[0] = RX10_TEMP13, TEMPCALLOCPOINTER93 = ((int32_t * )TEMPCALLOCPOINTER93)+1, memset(TEMPCALLOCPOINTER93,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T25 utmp25  ; 
T25_T25( &utmp25/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC19) ;
a.size = sizeof(utmp25 );
a.params = (void *)(&utmp25 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread8 (  struct T8 const utmpz ) 
{ 
struct intRefArray1 temp = utmpz .temp ; 
const place_t h = utmpz .h ; 
struct Isect * inter = utmpz .inter ; 
struct Ray * r = utmpz .r ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
const int32_t tempobjCount = X10_TEMP0 ->objCount ; 
struct SphereValArray1 tempprim = X10_TEMP0 ->prim ; 
struct T26 utmp26  ; 
T26_T26( &utmp26/*OBJECT INIT IN ASSIGNMENT*/, tempprim , tempobjCount , temp , inter , r ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC20) ;
a.size = sizeof(utmp26 );
a.params = (void *)(&utmp26 );
task_dispatch(a, h );


}/*END OF ASYNC*/
} 
} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct VecStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER95;
/*Updatable ARRAY*/ struct Vec * const RX10_TEMP14 = (/*Updatable ARRAY*/ struct Vec * ) ( TEMPCALLOCPOINTER95 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( Vec ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( Vec )))),((int32_t * )TEMPCALLOCPOINTER95)[0] = RX10_TEMP13, TEMPCALLOCPOINTER95 = ((int32_t * )TEMPCALLOCPOINTER95)+1, memset(TEMPCALLOCPOINTER95,0,RX10_TEMP13*sizeof(Vec ) ) ); 
struct VecStub RX10_TEMP15  ; 
VecStub_VecStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T27 utmp27  ; 
T27_T27( &utmp27/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC21) ;
a.size = sizeof(utmp27 );
a.params = (void *)(&utmp27 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread10 (  struct T10 const utmpz ) 
{ 
struct VecRefArray1 temp = utmpz .temp ; 
const place_t h = utmpz .h ; 
struct Vec bigr = utmpz .bigr ; 
struct Surface surf = utmpz .surf ; 
struct Ray * tRay = utmpz .tRay ; 
struct Isect * hit = utmpz .hit ; 
struct Vec N = utmpz .N ; 
struct Vec P = utmpz .P ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
const int32_t templightCount = X10_TEMP0 ->lightCount ; 
struct LightValArray1 templights = X10_TEMP0 ->lights ; 
struct T28 utmp28  ; 
T28_T28( &utmp28/*OBJECT INIT IN ASSIGNMENT*/, templights , templightCount , temp , bigr , surf , tRay , hit , N , P , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC22) ;
a.size = sizeof(utmp28 );
a.params = (void *)(&utmp28 );
task_dispatch(a, h );


}/*END OF ASYNC*/
} 
} 
} 

void /*static*/thread16 (  struct T16 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread17 (  struct T17 const utmpz ) 
{ 
struct longStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread18 (  struct T18 const utmpz ) 
{ 
const int32_t RX10_TEMP27 = utmpz .RX10_TEMP27 ; 
const place_t RX10_TEMP23 = utmpz .RX10_TEMP23 ; 
const int32_t RX10_TEMP22 = utmpz .RX10_TEMP22 ; 
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP21 = utmpz .RX10_TEMP21 ; 

{ 
const int32_t RX10_TEMP28 = /*SimpleDistributionExpression*/ RX10_TEMP27 +1; 
void * TEMPCALLOCPOINTER99;
/*Updatable ARRAY*/ struct Light * const RX10_TEMP29 = (/*Updatable ARRAY*/ struct Light * ) ( TEMPCALLOCPOINTER99 = malloc(sizeof(int32_t)+(RX10_TEMP28*sizeof( Light ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP28*sizeof( Light )))),((int32_t * )TEMPCALLOCPOINTER99)[0] = RX10_TEMP28, TEMPCALLOCPOINTER99 = ((int32_t * )TEMPCALLOCPOINTER99)+1, memset(TEMPCALLOCPOINTER99,0,RX10_TEMP28*sizeof(Light ) ) ); 
struct LightStub RX10_TEMP30  ; 
LightStub_LightStub( &RX10_TEMP30/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP29 ) ; 
struct T34 utmp34  ; 
T34_T34( &utmp34/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP30 , RX10_TEMP22 , RX10_TEMP21 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC23) ;
a.size = sizeof(utmp34 );
a.params = (void *)(&utmp34 );
task_dispatch(a, RX10_TEMP23 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread19 (  struct T19 const utmpz ) 
{ 
struct Point1 temp_l = utmpz .temp_l ; 
struct LightRefArray1 temp = utmpz .temp ; 
const place_t pHere = utmpz .pHere ; 
struct Scene * sc = utmpz .sc ; 

{ 

{ 
struct Light tempLight = Scene_getLight ( sc , temp_l ) ; 
struct T35 utmp35  ; 
T35_T35( &utmp35/*OBJECT INIT IN ASSIGNMENT*/, tempLight , temp ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC24) ;
a.size = sizeof(utmp35 );
a.params = (void *)(&utmp35 );
task_dispatch(a, pHere );


}/*END OF ASYNC*/
} 
} 
} 

void /*static*/thread20 (  struct T20 const utmpz ) 
{ 
const int32_t RX10_TEMP79 = utmpz .RX10_TEMP79 ; 
const place_t RX10_TEMP75 = utmpz .RX10_TEMP75 ; 
const int32_t RX10_TEMP74 = utmpz .RX10_TEMP74 ; 
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP73 = utmpz .RX10_TEMP73 ; 

{ 
const int32_t RX10_TEMP80 = /*SimpleDistributionExpression*/ RX10_TEMP79 +1; 
void * TEMPCALLOCPOINTER101;
/*Updatable ARRAY*/ struct Sphere * const RX10_TEMP81 = (/*Updatable ARRAY*/ struct Sphere * ) ( TEMPCALLOCPOINTER101 = malloc(sizeof(int32_t)+(RX10_TEMP80*sizeof( Sphere ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP80*sizeof( Sphere )))),((int32_t * )TEMPCALLOCPOINTER101)[0] = RX10_TEMP80, TEMPCALLOCPOINTER101 = ((int32_t * )TEMPCALLOCPOINTER101)+1, memset(TEMPCALLOCPOINTER101,0,RX10_TEMP80*sizeof(Sphere ) ) ); 
struct SphereStub RX10_TEMP82  ; 
SphereStub_SphereStub( &RX10_TEMP82/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP81 ) ; 
struct T36 utmp36  ; 
T36_T36( &utmp36/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP82 , RX10_TEMP74 , RX10_TEMP73 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC25) ;
a.size = sizeof(utmp36 );
a.params = (void *)(&utmp36 );
task_dispatch(a, RX10_TEMP75 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread21 (  struct T21 const utmpz ) 
{ 
struct Point1 temp_o = utmpz .temp_o ; 
struct SphereRefArray1 temp1 = utmpz .temp1 ; 
const place_t pHere = utmpz .pHere ; 
struct Scene * sc = utmpz .sc ; 

{ 

{ 
struct Sphere tempObject = Scene_getObject ( sc , temp_o ) ; 
struct T37 utmp37  ; 
T37_T37( &utmp37/*OBJECT INIT IN ASSIGNMENT*/, tempObject , temp1 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC26) ;
a.size = sizeof(utmp37 );
a.params = (void *)(&utmp37 );
task_dispatch(a, pHere );


}/*END OF ASYNC*/
} 
} 
} 

void /*static*/thread22 (  struct T22 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread23 (  struct T23 const utmpz ) 
{ 
struct longStub RX10_TEMP36 = utmpz .RX10_TEMP36 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP36 ) ; 
} 
} 

void /*static*/thread24 (  struct T24 const utmpz ) 
{ 
const int64_t checksumx = utmpz .checksumx ; 
struct Point1 pl = utmpz .pl ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
struct longRefArray1 X10_TEMP166 = X10_TEMP0 ->checkSumArray ; 
const int64_t X10_TEMP169 = checksumx ; 
struct Dist1 RX10_TEMP59 = X10_TEMP166 .distValue ; 
struct Region1 RX10_TEMP60 = RX10_TEMP59 .dReg ; 
const int32_t RX10_TEMP61 = searchPointInRegion1 ( RX10_TEMP60 , pl ) ; 
const int32_t RX10_TEMP62 = 0 ; 
const uint32_t RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; 
if ( RX10_TEMP63 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP64 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP65 = getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; 
const place_t RX10_TEMP67 = /* here  */ _here(); 
const uint32_t RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP66 = "Bad place access for array X10_TEMP166" ; 
fprintf(stderr, "%s",RX10_TEMP66 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1long ( X10_TEMP166 , RX10_TEMP61 , X10_TEMP169 ) ; 
} 
} 
} 

void /*static*/thread25 (  struct T25 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread26 (  struct T26 const utmpz ) 
{ 
struct SphereValArray1 tempprim = utmpz .tempprim ; 
const int32_t tempobjCount = utmpz .tempobjCount ; 
struct intRefArray1 temp = utmpz .temp ; 
struct Isect * inter = utmpz .inter ; 
struct Ray * r = utmpz .r ; 

{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t nhits = 0 ; 
const int32_t X10_TEMP22 = 0 ; 
const int32_t X10_TEMP20 = 1 ; 
const int32_t X10_TEMP23 = tempobjCount - X10_TEMP20 ; 
struct Region1 X10_TEMP25 = createNewRegion1R ( X10_TEMP22 , X10_TEMP23 ) ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP21 = X10_TEMP25 .regSize ; 
RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23 ; const int32_t RX10_TEMP22 = RX10_TEMP21 + 1; 
for ( int32_t RX10_TEMP20= 0; RX10_TEMP20<  RX10_TEMP22; RX10_TEMP20++ )
 
{ 
const int32_t RX10_TEMP24 = /*PointAccess*/RX10_TEMP20 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP25 , RX10_TEMP24 ) ; 

{ 
struct Region1 RX10_TEMP25 = tempprim .regionValue ; 
const int32_t RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , i ) ; 
const int32_t RX10_TEMP27 = 0 ; 
const uint32_t RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP29 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Sphere * const RX10_TEMP30 = (/*VALUE ARRAY*/ struct Sphere * ) tempprim .contents ; 
struct Sphere X10_TEMP27 = RX10_TEMP30 [ RX10_TEMP26 ] 
; 
/*UpdatableVariableDeclaration*/
 struct Isect  * tp = Sphere_intersect ( X10_TEMP27 , r ) ; 
const uint32_t X10_TEMP30 = tp ->isNull ; 
const uint32_t X10_TEMP33 = ! X10_TEMP30 ; 
const double X10_TEMP31 = tp ->t ; 
const double X10_TEMP32 = inter ->t ; 
const uint32_t X10_TEMP34 = X10_TEMP31 < X10_TEMP32 ; 
const uint32_t X10_TEMP36 = X10_TEMP33 && X10_TEMP34 ; 
if ( X10_TEMP36 ) 
{ 

{ 
const double X10_TEMP38 = tp ->t ; 
const double X10_TEMP39 = X10_TEMP38 ; 
inter ->t = ( X10_TEMP39 ) ; 
struct Sphere X10_TEMP41 = tp ->prim ; 
struct Sphere X10_TEMP42 = X10_TEMP41 ; 
inter ->prim = ( X10_TEMP42 ) ; 
struct Surface X10_TEMP44 = tp ->surf ; 
struct Surface X10_TEMP45 = X10_TEMP44 ; 
inter ->surf = ( X10_TEMP45 ) ; 
const int32_t X10_TEMP47 = tp ->enter ; 
const int32_t X10_TEMP48 = X10_TEMP47 ; 
inter ->enter = ( X10_TEMP48 ) ; 
const int32_t X10_TEMP49 = nhits ; 
const int32_t X10_TEMP50 = 1 ; 
nhits = nhits + X10_TEMP50 ; } 
} 

} 
} 

const int32_t X10_TEMP52 = 0 ; 
const int32_t X10_TEMP54 = nhits ; 
struct Point1 RX10_TEMP31  ; 
Point1_Point1( &RX10_TEMP31/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP52 ) ; 
struct Dist1 RX10_TEMP32 = temp .distValue ; 
struct Region1 RX10_TEMP33 = RX10_TEMP32 .dReg ; 
const int32_t RX10_TEMP34 = searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; 
const int32_t RX10_TEMP35 = 0 ; 
const uint32_t RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP38 = getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; 
const place_t RX10_TEMP40 = /* here  */ _here(); 
const uint32_t RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; 
if ( RX10_TEMP41 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( temp , RX10_TEMP34 , X10_TEMP54 ) ; 
} 
} 
} 

void /*static*/thread27 (  struct T27 const utmpz ) 
{ 
struct VecStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct VecStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread28 (  struct T28 const utmpz ) 
{ 
struct LightValArray1 templights = utmpz .templights ; 
const int32_t templightCount = utmpz .templightCount ; 
struct VecRefArray1 temp = utmpz .temp ; 
struct Vec bigr = utmpz .bigr ; 
struct Surface surf = utmpz .surf ; 
struct Ray * tRay = utmpz .tRay ; 
struct Isect * hit = utmpz .hit ; 
struct Vec N = utmpz .N ; 
struct Vec P = utmpz .P ; 
struct RayTracer * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
/*UpdatableVariableDeclaration*/
 struct Vec col = Vec_Vec_0( &col/*OBJECT INIT IN ASSIGNMENT*/) ; 
const int32_t X10_TEMP30 = 0 ; 
const int32_t X10_TEMP28 = 1 ; 
const int32_t X10_TEMP31 = templightCount - X10_TEMP28 ; 
struct Region1 X10_TEMP33 = createNewRegion1R ( X10_TEMP30 , X10_TEMP31 ) ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP21 = X10_TEMP33 .regSize ; 
RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23 ; const int32_t RX10_TEMP22 = RX10_TEMP21 + 1; 
for ( int32_t RX10_TEMP20= 0; RX10_TEMP20<  RX10_TEMP22; RX10_TEMP20++ )
 
{ 
const int32_t RX10_TEMP24 = /*PointAccess*/RX10_TEMP20 ; 
struct Point1 l = regionOrdinalPoint1 ( X10_TEMP33 , RX10_TEMP24 ) ; 

{ 
struct Region1 RX10_TEMP25 = templights .regionValue ; 
const int32_t RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , l ) ; 
const int32_t RX10_TEMP27 = 0 ; 
const uint32_t RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP29 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Light * const RX10_TEMP30 = (/*VALUE ARRAY*/ struct Light * ) templights .contents ; 
struct Light X10_TEMP35 = RX10_TEMP30 [ RX10_TEMP26 ] 
; 
struct Vec X10_TEMP38 = X10_TEMP35 .pos ; 
/*UpdatableVariableDeclaration*/
 struct Vec L = Vec_sub ( X10_TEMP38 , P ) ; 
const double X10_TEMP42 = Vec_dot ( N , L ) ; 
const double X10_TEMP43 = 0.0; 
const uint32_t X10_TEMP45 = X10_TEMP42 >= X10_TEMP43 ; 
if ( X10_TEMP45 ) 
{ 

{ 
struct Vec X10_TEMP47 = Vec_normalized ( L ) ; 
L = X10_TEMP47 ; /*UpdatableVariableDeclaration*/
double t = Vec_length ( L ) ; 
struct Vec X10_TEMP50 = P ; 
tRay ->p = ( X10_TEMP50 ) ; 
struct Vec X10_TEMP52 = L ; 
tRay ->d = ( X10_TEMP52 ) ; 
const int32_t X10_TEMP56 = RayTracer_Shadow ( X10_TEMP0 , tRay , t , hit ) ; 
const int32_t X10_TEMP57 = 0 ; 
const uint32_t X10_TEMP59 = X10_TEMP56 > X10_TEMP57 ; 
if ( X10_TEMP59 ) 
{ 

{ 
const double X10_TEMP62 = Vec_dot ( N , L ) ; 
const double X10_TEMP63 = surf .kd ; 
const double X10_TEMP66 = X10_TEMP62 * X10_TEMP63 ; 
struct Region1 RX10_TEMP31 = templights .regionValue ; 
const int32_t RX10_TEMP32 = searchPointInRegion1 ( RX10_TEMP31 , l ) ; 
const int32_t RX10_TEMP33 = 0 ; 
const uint32_t RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33 ; 
if ( RX10_TEMP34 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP35 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP35 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ struct Light * const RX10_TEMP36 = (/*VALUE ARRAY*/ struct Light * ) templights .contents ; 
struct Light X10_TEMP65 = RX10_TEMP36 [ RX10_TEMP32 ] 
; 
const double X10_TEMP67 = X10_TEMP65 .brightness ; 
/*UpdatableVariableDeclaration*/
double diff = X10_TEMP66 * X10_TEMP67 ; 
struct Vec X10_TEMP71 = surf .color ; 
struct Vec X10_TEMP73 = Vec_adds2 ( col , diff , X10_TEMP71 ) ; 
col = X10_TEMP73 ; const double X10_TEMP74 = surf .shine ; 
const double X10_TEMP75 = 1e-6; 
const uint32_t X10_TEMP77 = X10_TEMP74 > X10_TEMP75 ; 
if ( X10_TEMP77 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
double spec = Vec_dot ( bigr , L ) ; 
const double X10_TEMP81 = 1e-6; 
const uint32_t X10_TEMP83 = spec > X10_TEMP81 ; 
if ( X10_TEMP83 ) 
{ 

{ 
const double X10_TEMP86 = surf .shine ; 
const double X10_TEMP88 = pow ( spec , X10_TEMP86 ) ; 
spec = X10_TEMP88 ; /*UpdatableVariableDeclaration*/
uint32_t X10_TEMP93 = 0 ; 
struct Vec X10_TEMP95  ; 
Vec_Vec_4( &X10_TEMP95/*OBJECT INIT IN ASSIGNMENT*/, spec , spec , spec , X10_TEMP93 ) ; 
struct Vec X10_TEMP97 = Vec_added ( col , X10_TEMP95 ) ; 
col = X10_TEMP97 ; } 
} 

} 
} 

} 
} 

} 
} 

} 
} 

const int32_t X10_TEMP99 = 0 ; 
struct Vec X10_TEMP101 = col ; 
struct Point1 RX10_TEMP37  ; 
Point1_Point1( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP99 ) ; 
struct Dist1 RX10_TEMP38 = temp .distValue ; 
struct Region1 RX10_TEMP39 = RX10_TEMP38 .dReg ; 
const int32_t RX10_TEMP40 = searchPointInRegion1 ( RX10_TEMP39 , RX10_TEMP37 ) ; 
const int32_t RX10_TEMP41 = 0 ; 
const uint32_t RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP44 = getPlaceFromDist1 ( RX10_TEMP38 , RX10_TEMP40 ) ; 
const place_t RX10_TEMP46 = /* here  */ _here(); 
const uint32_t RX10_TEMP47 = RX10_TEMP44 != RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP45 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP45 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1Vec ( temp , RX10_TEMP40 , X10_TEMP101 ) ; 
} 
} 
} 

void /*static*/thread34 (  struct T34 const utmpz ) 
{ 
struct LightStub RX10_TEMP30 = utmpz .RX10_TEMP30 ; 
const int32_t RX10_TEMP22 = utmpz .RX10_TEMP22 ; 
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP21 = utmpz .RX10_TEMP21 ; 

{ 
RX10_TEMP21 [ RX10_TEMP22 ] = ( RX10_TEMP30 ) ; 
} 
} 

void /*static*/thread35 (  struct T35 const utmpz ) 
{ 
struct Light tempLight = utmpz .tempLight ; 
struct LightRefArray1 temp = utmpz .temp ; 

{ 

{ 
const int32_t X10_TEMP41 = 0 ; 
struct Light X10_TEMP43 = tempLight ; 
struct Point1 RX10_TEMP35  ; 
Point1_Point1( &RX10_TEMP35/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP41 ) ; 
struct Dist1 RX10_TEMP36 = temp .distValue ; 
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
char * RX10_TEMP43 = "Bad place access for array temp" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1Light ( temp , RX10_TEMP38 , X10_TEMP43 ) ; 
} 
} 
} 

void /*static*/thread36 (  struct T36 const utmpz ) 
{ 
struct SphereStub RX10_TEMP82 = utmpz .RX10_TEMP82 ; 
const int32_t RX10_TEMP74 = utmpz .RX10_TEMP74 ; 
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP73 = utmpz .RX10_TEMP73 ; 

{ 
RX10_TEMP73 [ RX10_TEMP74 ] = ( RX10_TEMP82 ) ; 
} 
} 

void /*static*/thread37 (  struct T37 const utmpz ) 
{ 
struct Sphere tempObject = utmpz .tempObject ; 
struct SphereRefArray1 temp1 = utmpz .temp1 ; 

{ 

{ 
const int32_t X10_TEMP70 = 0 ; 
struct Sphere X10_TEMP72 = tempObject ; 
struct Point1 RX10_TEMP87  ; 
Point1_Point1( &RX10_TEMP87/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP70 ) ; 
struct Dist1 RX10_TEMP88 = temp1 .distValue ; 
struct Region1 RX10_TEMP89 = RX10_TEMP88 .dReg ; 
const int32_t RX10_TEMP90 = searchPointInRegion1 ( RX10_TEMP89 , RX10_TEMP87 ) ; 
const int32_t RX10_TEMP91 = 0 ; 
const uint32_t RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91 ; 
if ( RX10_TEMP92 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP93 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP93 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP94 = getPlaceFromDist1 ( RX10_TEMP88 , RX10_TEMP90 ) ; 
const place_t RX10_TEMP96 = /* here  */ _here(); 
const uint32_t RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP95 = "Bad place access for array temp1" ; 
fprintf(stderr, "%s",RX10_TEMP95 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1Sphere ( temp1 , RX10_TEMP90 , X10_TEMP72 ) ; 
} 
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

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T2THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T2THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T2THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T2THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_myobjCount , const int32_t a_mylightCount ,  struct Scene  * const a_sc ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T3THIS->myobjCount = ( a_myobjCount ) ; 
T3THIS->mylightCount = ( a_mylightCount ) ; 
T3THIS->sc = ( a_sc ) ; 
T3THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T4THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T4THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T4THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T4THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP27 ) 
{ 
T5THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T5THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T5THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T5THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 

 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS,  struct Point1 const a_pl ,  struct View const a_myview , const place_t a_fp ,  struct Dist1 const a_DBlock ,  struct Interval const a_interval ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T6THIS->pl = ( a_pl ) ; 
T6THIS->myview = ( a_myview ) ; 
T6THIS->fp = ( a_fp ) ; 
T6THIS->DBlock = ( a_DBlock ) ; 
T6THIS->interval = ( a_interval ) ; 
T6THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T7THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T7THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T7THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T7THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS,  struct intRefArray1 const a_temp , const place_t a_h ,  struct Isect  * const a_inter ,  struct Ray  * const a_r ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T8THIS->temp = ( a_temp ) ; 
T8THIS->h = ( a_h ) ; 
T8THIS->inter = ( a_inter ) ; 
T8THIS->r = ( a_r ) ; 
T8THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct VecStub * const a_RX10_TEMP6 ) 
{ 
T9THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T9THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T9THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T9THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS,  struct VecRefArray1 const a_temp , const place_t a_h ,  struct Vec const a_bigr ,  struct Surface const a_surf ,  struct Ray  * const a_tRay ,  struct Isect  * const a_hit ,  struct Vec const a_N ,  struct Vec const a_P ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T10THIS->temp = ( a_temp ) ; 
T10THIS->h = ( a_h ) ; 
T10THIS->bigr = ( a_bigr ) ; 
T10THIS->surf = ( a_surf ) ; 
T10THIS->tRay = ( a_tRay ) ; 
T10THIS->hit = ( a_hit ) ; 
T10THIS->N = ( a_N ) ; 
T10THIS->P = ( a_P ) ; 
T10THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS, struct Scene * SceneTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP6 ) 
{ 
T11THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T11THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T11THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T11THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T11THIS->THIS = *SceneTHIS;
 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS, struct Scene * SceneTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP6 ) 
{ 
T12THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T12THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T12THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T12THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T12THIS->THIS = *SceneTHIS;
 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T13THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T13THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T13THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T13THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T13THIS->THIS = *TimerTHIS;
 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T14THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T14THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T14THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T14THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T14THIS->THIS = *TimerTHIS;
 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T15THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T15THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T15THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T15THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T15THIS->THIS = *TimerTHIS;
 return  *T15THIS; 

} 

T16 T16_T16 ( struct T16 *T16THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T16THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T16THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T16THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T16THIS; 

} 

T17 T17_T17 ( struct T17 *T17THIS,  struct longStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T17THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T17THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T17THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T17THIS; 

} 

T18 T18_T18 ( struct T18 *T18THIS, const int32_t a_RX10_TEMP27 , const place_t a_RX10_TEMP23 , const int32_t a_RX10_TEMP22 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP21 ) 
{ 
T18THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T18THIS->RX10_TEMP23 = ( a_RX10_TEMP23 ) ; 
T18THIS->RX10_TEMP22 = ( a_RX10_TEMP22 ) ; 
T18THIS->RX10_TEMP21 = ( a_RX10_TEMP21 ) ; 

 return  *T18THIS; 

} 

T19 T19_T19 ( struct T19 *T19THIS,  struct Point1 const a_temp_l ,  struct LightRefArray1 const a_temp , const place_t a_pHere ,  struct Scene  * const a_sc ) 
{ 
T19THIS->temp_l = ( a_temp_l ) ; 
T19THIS->temp = ( a_temp ) ; 
T19THIS->pHere = ( a_pHere ) ; 
T19THIS->sc = ( a_sc ) ; 

 return  *T19THIS; 

} 

T20 T20_T20 ( struct T20 *T20THIS, const int32_t a_RX10_TEMP79 , const place_t a_RX10_TEMP75 , const int32_t a_RX10_TEMP74 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP73 ) 
{ 
T20THIS->RX10_TEMP79 = ( a_RX10_TEMP79 ) ; 
T20THIS->RX10_TEMP75 = ( a_RX10_TEMP75 ) ; 
T20THIS->RX10_TEMP74 = ( a_RX10_TEMP74 ) ; 
T20THIS->RX10_TEMP73 = ( a_RX10_TEMP73 ) ; 

 return  *T20THIS; 

} 

T21 T21_T21 ( struct T21 *T21THIS,  struct Point1 const a_temp_o ,  struct SphereRefArray1 const a_temp1 , const place_t a_pHere ,  struct Scene  * const a_sc ) 
{ 
T21THIS->temp_o = ( a_temp_o ) ; 
T21THIS->temp1 = ( a_temp1 ) ; 
T21THIS->pHere = ( a_pHere ) ; 
T21THIS->sc = ( a_sc ) ; 

 return  *T21THIS; 

} 

T22 T22_T22 ( struct T22 *T22THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T22THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T22THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T22THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T22THIS; 

} 

T23 T23_T23 ( struct T23 *T23THIS,  struct longStub const a_RX10_TEMP36 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP27 ) 
{ 
T23THIS->RX10_TEMP36 = ( a_RX10_TEMP36 ) ; 
T23THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T23THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 

 return  *T23THIS; 

} 

T24 T24_T24 ( struct T24 *T24THIS, const int64_t a_checksumx ,  struct Point1 const a_pl ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T24THIS->checksumx = ( a_checksumx ) ; 
T24THIS->pl = ( a_pl ) ; 
T24THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T24THIS; 

} 

T25 T25_T25 ( struct T25 *T25THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T25THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T25THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T25THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T25THIS; 

} 

T26 T26_T26 ( struct T26 *T26THIS,  struct SphereValArray1 const a_tempprim , const int32_t a_tempobjCount ,  struct intRefArray1 const a_temp ,  struct Isect  * const a_inter ,  struct Ray  * const a_r ) 
{ 
T26THIS->tempprim = ( a_tempprim ) ; 
T26THIS->tempobjCount = ( a_tempobjCount ) ; 
T26THIS->temp = ( a_temp ) ; 
T26THIS->inter = ( a_inter ) ; 
T26THIS->r = ( a_r ) ; 

 return  *T26THIS; 

} 

T27 T27_T27 ( struct T27 *T27THIS,  struct VecStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct VecStub * const a_RX10_TEMP6 ) 
{ 
T27THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T27THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T27THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T27THIS; 

} 

T28 T28_T28 ( struct T28 *T28THIS,  struct LightValArray1 const a_templights , const int32_t a_templightCount ,  struct VecRefArray1 const a_temp ,  struct Vec const a_bigr ,  struct Surface const a_surf ,  struct Ray  * const a_tRay ,  struct Isect  * const a_hit ,  struct Vec const a_N ,  struct Vec const a_P ,  struct RayTracer  * const a_X10_TEMP0 ) 
{ 
T28THIS->templights = ( a_templights ) ; 
T28THIS->templightCount = ( a_templightCount ) ; 
T28THIS->temp = ( a_temp ) ; 
T28THIS->bigr = ( a_bigr ) ; 
T28THIS->surf = ( a_surf ) ; 
T28THIS->tRay = ( a_tRay ) ; 
T28THIS->hit = ( a_hit ) ; 
T28THIS->N = ( a_N ) ; 
T28THIS->P = ( a_P ) ; 
T28THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T28THIS; 

} 

T29 T29_T29 ( struct T29 *T29THIS, struct Scene * SceneTHIS /*this*/ ,  struct LightStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP6 ) 
{ 
T29THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T29THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T29THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T29THIS->THIS = *SceneTHIS;
 return  *T29THIS; 

} 

T30 T30_T30 ( struct T30 *T30THIS, struct Scene * SceneTHIS /*this*/ ,  struct SphereStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP6 ) 
{ 
T30THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T30THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T30THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T30THIS->THIS = *SceneTHIS;
 return  *T30THIS; 

} 

T31 T31_T31 ( struct T31 *T31THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T31THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T31THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T31THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T31THIS->THIS = *TimerTHIS;
 return  *T31THIS; 

} 

T32 T32_T32 ( struct T32 *T32THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T32THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T32THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T32THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T32THIS->THIS = *TimerTHIS;
 return  *T32THIS; 

} 

T33 T33_T33 ( struct T33 *T33THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T33THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T33THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T33THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T33THIS->THIS = *TimerTHIS;
 return  *T33THIS; 

} 

T34 T34_T34 ( struct T34 *T34THIS,  struct LightStub const a_RX10_TEMP30 , const int32_t a_RX10_TEMP22 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP21 ) 
{ 
T34THIS->RX10_TEMP30 = ( a_RX10_TEMP30 ) ; 
T34THIS->RX10_TEMP22 = ( a_RX10_TEMP22 ) ; 
T34THIS->RX10_TEMP21 = ( a_RX10_TEMP21 ) ; 

 return  *T34THIS; 

} 

T35 T35_T35 ( struct T35 *T35THIS,  struct Light const a_tempLight ,  struct LightRefArray1 const a_temp ) 
{ 
T35THIS->tempLight = ( a_tempLight ) ; 
T35THIS->temp = ( a_temp ) ; 

 return  *T35THIS; 

} 

T36 T36_T36 ( struct T36 *T36THIS,  struct SphereStub const a_RX10_TEMP82 , const int32_t a_RX10_TEMP74 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP73 ) 
{ 
T36THIS->RX10_TEMP82 = ( a_RX10_TEMP82 ) ; 
T36THIS->RX10_TEMP74 = ( a_RX10_TEMP74 ) ; 
T36THIS->RX10_TEMP73 = ( a_RX10_TEMP73 ) ; 

 return  *T36THIS; 

} 

T37 T37_T37 ( struct T37 *T37THIS,  struct Sphere const a_tempObject ,  struct SphereRefArray1 const a_temp1 ) 
{ 
T37THIS->tempObject = ( a_tempObject ) ; 
T37THIS->temp1 = ( a_temp1 ) ; 

 return  *T37THIS; 

} 

RayTracer *RayTracer_RayTracer ( struct RayTracer *RayTracerTHIS) 
{ 

{ 
} 

 return  RayTracerTHIS; 

} 


Interval Interval_Interval ( struct Interval *IntervalTHIS, const int32_t number_ , const int32_t width_ , const int32_t height_ , const int32_t yfrom_ , const int32_t yto_ , const int32_t total_ ) 
{ 

{ 
IntervalTHIS->number = ( number_ ) ; 
IntervalTHIS->width = ( width_ ) ; 
IntervalTHIS->height = ( height_ ) ; 
IntervalTHIS->yfrom = ( yfrom_ ) ; 
IntervalTHIS->yto = ( yto_ ) ; 
IntervalTHIS->total = ( total_ ) ; 
} 

 return  *IntervalTHIS; 

} 

Vec Vec_Vec_4( struct Vec *VecTHIS, const double a , const double b , const double c , const uint32_t isNull_ ) 
{ 

{ 
VecTHIS->x = ( a ) ; 
VecTHIS->y = ( b ) ; 
VecTHIS->z = ( c ) ; 
VecTHIS->isNull = ( isNull_ ) ; 
} 

 return  *VecTHIS; 

} 

Vec Vec_Vec_2( struct Vec *VecTHIS,  struct Vec const a , const uint32_t isNull_ ) 
{ 

{ 
const double X10_TEMP2 = a .x ; 
VecTHIS->x = ( X10_TEMP2 ) ; 
const double X10_TEMP4 = a .y ; 
VecTHIS->y = ( X10_TEMP4 ) ; 
const double X10_TEMP6 = a .z ; 
VecTHIS->z = ( X10_TEMP6 ) ; 
VecTHIS->isNull = ( isNull_ ) ; 
} 

 return  *VecTHIS; 

} 

Vec Vec_Vec_0( struct Vec *VecTHIS) 
{ 

{ 
const double X10_TEMP2 = 0.0; 
VecTHIS->x = ( X10_TEMP2 ) ; 
const double X10_TEMP4 = 0.0; 
VecTHIS->y = ( X10_TEMP4 ) ; 
const double X10_TEMP6 = 0.0; 
VecTHIS->z = ( X10_TEMP6 ) ; 
const uint32_t X10_TEMP8 = 0 ; 
VecTHIS->isNull = ( X10_TEMP8 ) ; 
} 

 return  *VecTHIS; 

} 

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) 
{ 
doubleStubTHIS->localArray = ( localArray_ ) ; 

 return  *doubleStubTHIS; 

} 

View View_View ( struct View *ViewTHIS,  struct Vec const from_ ,  struct Vec const at_ ,  struct Vec const up_ , const double dist_ , const double angle_ , const double aspect_ ) 
{ 

{ 
ViewTHIS->from = ( from_ ) ; 
ViewTHIS->att = ( at_ ) ; 
ViewTHIS->up = ( up_ ) ; 
ViewTHIS->distance = ( dist_ ) ; 
ViewTHIS->angle = ( angle_ ) ; 
ViewTHIS->aspect = ( aspect_ ) ; 
} 

 return  *ViewTHIS; 

} 

VecStub VecStub_VecStub ( struct VecStub *VecStubTHIS, /*Updatable ARRAY*/ struct Vec * const localArray_ ) 
{ 
VecStubTHIS->localArray = ( localArray_ ) ; 

 return  *VecStubTHIS; 

} 

longRefArray1 longRefArray1_longRefArray1 ( struct longRefArray1 *longRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct longStub * const contents_ ) 
{ 
longRefArray1THIS->distValue = ( distValue_ ) ; 
longRefArray1THIS->contents = ( contents_ ) ; 

 return  *longRefArray1THIS; 

} 

Surface Surface_Surface_0( struct Surface *SurfaceTHIS) 
{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP6 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP7 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP8 = 0 ; 
struct Vec X10_TEMP10  ; 
Vec_Vec_4( &X10_TEMP10/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP5 , X10_TEMP6 , X10_TEMP7 , X10_TEMP8 ) ; 
SurfaceTHIS->color = ( X10_TEMP10 ) ; 
const double X10_TEMP12 = 1.0; 
SurfaceTHIS->kd = ( X10_TEMP12 ) ; 
const double X10_TEMP14 = 0.0; 
SurfaceTHIS->ks = ( X10_TEMP14 ) ; 
const double X10_TEMP16 = 0.0; 
SurfaceTHIS->shine = ( X10_TEMP16 ) ; 
const double X10_TEMP18 = 0.0; 
SurfaceTHIS->kt = ( X10_TEMP18 ) ; 
const double X10_TEMP20 = 1.0; 
SurfaceTHIS->ior = ( X10_TEMP20 ) ; 
const uint32_t X10_TEMP22 = 0 ; 
SurfaceTHIS->isNull = ( X10_TEMP22 ) ; 
} 

 return  *SurfaceTHIS; 

} 

Surface Surface_Surface_5( struct Surface *SurfaceTHIS, const double shine_ , const double ks_ , const double kt_ ,  struct Vec const c_ , const uint32_t isNull_ ) 
{ 

{ 
const double X10_TEMP2 = 1.0; 
SurfaceTHIS->kd = ( X10_TEMP2 ) ; 
SurfaceTHIS->ks = ( ks_ ) ; 
SurfaceTHIS->shine = ( shine_ ) ; 
SurfaceTHIS->kt = ( kt_ ) ; 
const double X10_TEMP7 = 1.0; 
SurfaceTHIS->ior = ( X10_TEMP7 ) ; 
SurfaceTHIS->color = ( c_ ) ; 
SurfaceTHIS->isNull = ( isNull_ ) ; 
} 

 return  *SurfaceTHIS; 

} 

VecRefArray1 VecRefArray1_VecRefArray1 ( struct VecRefArray1 *VecRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct VecStub * const contents_ ) 
{ 
VecRefArray1THIS->distValue = ( distValue_ ) ; 
VecRefArray1THIS->contents = ( contents_ ) ; 

 return  *VecRefArray1THIS; 

} 

Light Light_Light ( struct Light *LightTHIS, const double x , const double y , const double z , const double b ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP5 = 0 ; 
struct Vec X10_TEMP7  ; 
Vec_Vec_4( &X10_TEMP7/*OBJECT INIT IN ASSIGNMENT*/, x , y , z , X10_TEMP5 ) ; 
LightTHIS->pos = ( X10_TEMP7 ) ; 
LightTHIS->brightness = ( b ) ; 
} 

 return  *LightTHIS; 

} 

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) 
{ 
intRefArray1THIS->distValue = ( distValue_ ) ; 
intRefArray1THIS->contents = ( contents_ ) ; 

 return  *intRefArray1THIS; 

} 

SphereValArray1 SphereValArray1_SphereValArray1 ( struct SphereValArray1 *SphereValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ struct Sphere * const contents_ ) 
{ 
SphereValArray1THIS->regionValue = ( regionValue_ ) ; 
SphereValArray1THIS->contents = ( contents_ ) ; 

 return  *SphereValArray1THIS; 

} 

Sphere Sphere_Sphere_3( struct Sphere *SphereTHIS,  struct Vec const center , const double radius ,  struct Surface const s ) 
{ 

{ 
SphereTHIS->surf = ( s ) ; 
SphereTHIS->c = ( center ) ; 
SphereTHIS->r = ( radius ) ; 
const double X10_TEMP5 = radius * radius ; 
SphereTHIS->r2 = ( X10_TEMP5 ) ; 
} 

 return  *SphereTHIS; 

} 

Sphere Sphere_Sphere_2( struct Sphere *SphereTHIS,  struct Vec const center , const double radius ) 
{ 

{ 
SphereTHIS->c = ( center ) ; 
SphereTHIS->r = ( radius ) ; 
const double X10_TEMP4 = radius * radius ; 
SphereTHIS->r2 = ( X10_TEMP4 ) ; 
struct Surface X10_TEMP6  ; 
Surface_Surface_0( &X10_TEMP6/*OBJECT INIT IN ASSIGNMENT*/) ; 
SphereTHIS->surf = ( X10_TEMP6 ) ; 
} 

 return  *SphereTHIS; 

} 

Ray *Ray_Ray_2( struct Ray *RayTHIS,  struct Vec const pnt ,  struct Vec const dir ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
double X10_TEMP5 = pnt .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP6 = pnt .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP7 = pnt .z ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP8 = 0 ; 
struct Vec X10_TEMP10  ; 
Vec_Vec_4( &X10_TEMP10/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP5 , X10_TEMP6 , X10_TEMP7 , X10_TEMP8 ) ; 
RayTHIS->p = ( X10_TEMP10 ) ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP15 = dir .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP16 = dir .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP17 = dir .z ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP18 = 0 ; 
struct Vec X10_TEMP19  ; 
Vec_Vec_4( &X10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP15 , X10_TEMP16 , X10_TEMP17 , X10_TEMP18 ) ; 
struct Vec X10_TEMP21 = Vec_normalized ( X10_TEMP19 ) ; 
RayTHIS->d = ( X10_TEMP21 ) ; 
} 

 return  RayTHIS; 

} 

Ray *Ray_Ray_3( struct Ray *RayTHIS,  struct Vec const pnt ,  struct Vec const dir , const uint32_t normalize ) 
{ 

{ 
if ( normalize ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
double X10_TEMP6 = pnt .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP7 = pnt .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP8 = pnt .z ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP9 = 0 ; 
struct Vec X10_TEMP11  ; 
Vec_Vec_4( &X10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP6 , X10_TEMP7 , X10_TEMP8 , X10_TEMP9 ) ; 
RayTHIS->p = ( X10_TEMP11 ) ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP16 = dir .x ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP17 = dir .y ; 
/*UpdatableVariableDeclaration*/
double X10_TEMP18 = dir .z ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP19 = 0 ; 
struct Vec X10_TEMP20  ; 
Vec_Vec_4( &X10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP16 , X10_TEMP17 , X10_TEMP18 , X10_TEMP19 ) ; 
struct Vec X10_TEMP22 = Vec_normalized ( X10_TEMP20 ) ; 
RayTHIS->d = ( X10_TEMP22 ) ; 
} 
} 
else 
{ 

{ 
RayTHIS->p = ( pnt ) ; 
RayTHIS->d = ( dir ) ; 
} 
} 


} 

 return  RayTHIS; 

} 

Ray *Ray_Ray_0( struct Ray *RayTHIS) 
{ 

{ 
struct Vec X10_TEMP2  ; 
Vec_Vec_0( &X10_TEMP2/*OBJECT INIT IN ASSIGNMENT*/) ; 
RayTHIS->p = ( X10_TEMP2 ) ; 
struct Vec X10_TEMP4  ; 
Vec_Vec_0( &X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
RayTHIS->d = ( X10_TEMP4 ) ; 
} 

 return  RayTHIS; 

} 


LightValArray1 LightValArray1_LightValArray1 ( struct LightValArray1 *LightValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ struct Light * const contents_ ) 
{ 
LightValArray1THIS->regionValue = ( regionValue_ ) ; 
LightValArray1THIS->contents = ( contents_ ) ; 

 return  *LightValArray1THIS; 

} 

LightRefArray1 LightRefArray1_LightRefArray1 ( struct LightRefArray1 *LightRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct LightStub * const contents_ ) 
{ 
LightRefArray1THIS->distValue = ( distValue_ ) ; 
LightRefArray1THIS->contents = ( contents_ ) ; 

 return  *LightRefArray1THIS; 

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

Scene *Scene_Scene ( struct Scene *SceneTHIS,  struct View const v ) 
{ 

{ 
const int32_t X10_TEMP5 = 0 ; 
const int32_t X10_TEMP2 = /*program*/_Scene_maxLights ; 
const int32_t X10_TEMP3 = 1 ; 
const int32_t X10_TEMP6 = X10_TEMP2 - X10_TEMP3 ; 
struct Region1 X10_TEMP7 = createNewRegion1R ( X10_TEMP5 , X10_TEMP6 ) ; 
const place_t X10_TEMP8 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 d1 = getPlaceDist1 ( X10_TEMP7 , X10_TEMP8 ) ; 
struct LightRefArray1 X10_TEMP13 = Scene_getLightArray ( SceneTHIS, d1 ) ; 
SceneTHIS->lights = ( X10_TEMP13 ) ; 
const int32_t X10_TEMP18 = 0 ; 
const int32_t X10_TEMP15 = /*program*/_Scene_maxObjects ; 
const int32_t X10_TEMP16 = 1 ; 
const int32_t X10_TEMP19 = X10_TEMP15 - X10_TEMP16 ; 
struct Region1 X10_TEMP20 = createNewRegion1R ( X10_TEMP18 , X10_TEMP19 ) ; 
const place_t X10_TEMP21 = /* here  */ _here(); 
/*UpdatableVariableDeclaration*/
 struct Dist1 d2 = getPlaceDist1 ( X10_TEMP20 , X10_TEMP21 ) ; 
struct SphereRefArray1 X10_TEMP26 = Scene_getSphereArray ( SceneTHIS, d2 ) ; 
SceneTHIS->objects = ( X10_TEMP26 ) ; 
SceneTHIS->view = ( v ) ; 
const int32_t X10_TEMP29 = 0 ; 
SceneTHIS->lightCount = ( X10_TEMP29 ) ; 
const int32_t X10_TEMP31 = 0 ; 
SceneTHIS->objectCount = ( X10_TEMP31 ) ; 
} 

 return  SceneTHIS; 

} 
Scene* Scene_Scene_0(struct Scene *SceneTHIS){return SceneTHIS;}

LightRefArray1 Scene_getLightArray ( struct Scene *SceneTHIS,  struct Dist1 const d ) 
{ 

{ 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER111;
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct LightStub * ) ( TEMPCALLOCPOINTER111 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( LightStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( LightStub )))),((int32_t * )TEMPCALLOCPOINTER111)[0] = RX10_TEMP5, TEMPCALLOCPOINTER111 = ((int32_t * )TEMPCALLOCPOINTER111)+1, memset(TEMPCALLOCPOINTER111,0,RX10_TEMP5*sizeof(LightStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, SceneTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC27) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER112;
/*VALUE ARRAY*/ struct LightStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct LightStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER112 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( LightStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( LightStub )))),((int32_t * )TEMPCALLOCPOINTER112)[0] = RX10_TEMP4, TEMPCALLOCPOINTER112 = ((int32_t * )TEMPCALLOCPOINTER112)+1, memset(TEMPCALLOCPOINTER112,0,RX10_TEMP4*sizeof(LightStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct LightStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct LightRefArray1 RX10_TEMP19  ; 
LightRefArray1_LightRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct LightRefArray1 X10_TEMP2 = RX10_TEMP19 ; 
return X10_TEMP2 ; 
} 
} 

SphereRefArray1 Scene_getSphereArray ( struct Scene *SceneTHIS,  struct Dist1 const d ) 
{ 

{ 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER113;
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct SphereStub * ) ( TEMPCALLOCPOINTER113 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( SphereStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( SphereStub )))),((int32_t * )TEMPCALLOCPOINTER113)[0] = RX10_TEMP5, TEMPCALLOCPOINTER113 = ((int32_t * )TEMPCALLOCPOINTER113)+1, memset(TEMPCALLOCPOINTER113,0,RX10_TEMP5*sizeof(SphereStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, SceneTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC28) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER114;
/*VALUE ARRAY*/ struct SphereStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct SphereStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER114 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( SphereStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( SphereStub )))),((int32_t * )TEMPCALLOCPOINTER114)[0] = RX10_TEMP4, TEMPCALLOCPOINTER114 = ((int32_t * )TEMPCALLOCPOINTER114)+1, memset(TEMPCALLOCPOINTER114,0,RX10_TEMP4*sizeof(SphereStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct SphereStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct SphereRefArray1 RX10_TEMP19  ; 
SphereRefArray1_SphereRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct SphereRefArray1 X10_TEMP2 = RX10_TEMP19 ; 
return X10_TEMP2 ; 
} 
} 

void thread11 ( struct Scene *SceneTHIS,  struct T11 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER116;
/*Updatable ARRAY*/ struct Light * const RX10_TEMP14 = (/*Updatable ARRAY*/ struct Light * ) ( TEMPCALLOCPOINTER116 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( Light ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( Light )))),((int32_t * )TEMPCALLOCPOINTER116)[0] = RX10_TEMP13, TEMPCALLOCPOINTER116 = ((int32_t * )TEMPCALLOCPOINTER116)+1, memset(TEMPCALLOCPOINTER116,0,RX10_TEMP13*sizeof(Light ) ) ); 
struct LightStub RX10_TEMP15  ; 
LightStub_LightStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T29 utmp29  ; 
T29_T29( &utmp29/*OBJECT INIT IN ASSIGNMENT*/, SceneTHIS /*this*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC29) ;
a.size = sizeof(utmp29 );
a.params = (void *)(&utmp29 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread12 ( struct Scene *SceneTHIS,  struct T12 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER118;
/*Updatable ARRAY*/ struct Sphere * const RX10_TEMP14 = (/*Updatable ARRAY*/ struct Sphere * ) ( TEMPCALLOCPOINTER118 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( Sphere ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP13*sizeof( Sphere )))),((int32_t * )TEMPCALLOCPOINTER118)[0] = RX10_TEMP13, TEMPCALLOCPOINTER118 = ((int32_t * )TEMPCALLOCPOINTER118)+1, memset(TEMPCALLOCPOINTER118,0,RX10_TEMP13*sizeof(Sphere ) ) ); 
struct SphereStub RX10_TEMP15  ; 
SphereStub_SphereStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T30 utmp30  ; 
T30_T30( &utmp30/*OBJECT INIT IN ASSIGNMENT*/, SceneTHIS /*this*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC30) ;
a.size = sizeof(utmp30 );
a.params = (void *)(&utmp30 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread29 ( struct Scene *SceneTHIS,  struct T29 const utmpz ) 
{ 
struct LightStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LightStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void thread30 ( struct Scene *SceneTHIS,  struct T30 const utmpz ) 
{ 
struct SphereStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct SphereStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 


Timer *Timer_Timer ( struct Timer *TimerTHIS) 
{ 

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
void * TEMPCALLOCPOINTER121;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER121 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER121)[0] = RX10_TEMP5, TEMPCALLOCPOINTER121 = ((int32_t * )TEMPCALLOCPOINTER121)+1, memset(TEMPCALLOCPOINTER121,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC31) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER122;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER122 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER122)[0] = RX10_TEMP4, TEMPCALLOCPOINTER122 = ((int32_t * )TEMPCALLOCPOINTER122)+1, memset(TEMPCALLOCPOINTER122,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER123;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER123 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER123)[0] = RX10_TEMP26, TEMPCALLOCPOINTER123 = ((int32_t * )TEMPCALLOCPOINTER123)+1, memset(TEMPCALLOCPOINTER123,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC32) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER124;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER124 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER124)[0] = RX10_TEMP25, TEMPCALLOCPOINTER124 = ((int32_t * )TEMPCALLOCPOINTER124)+1, memset(TEMPCALLOCPOINTER124,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER125;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER125 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER125)[0] = RX10_TEMP47, TEMPCALLOCPOINTER125 = ((int32_t * )TEMPCALLOCPOINTER125)+1, memset(TEMPCALLOCPOINTER125,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC33) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER126;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER126 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory_value_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )))),((int32_t * )TEMPCALLOCPOINTER126)[0] = RX10_TEMP46, TEMPCALLOCPOINTER126 = ((int32_t * )TEMPCALLOCPOINTER126)+1, memset(TEMPCALLOCPOINTER126,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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
} 

 return  TimerTHIS; 

} 

void thread13 ( struct Timer *TimerTHIS,  struct T13 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER128;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER128 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP14*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER128)[0] = RX10_TEMP14, TEMPCALLOCPOINTER128 = ((int32_t * )TEMPCALLOCPOINTER128)+1, memset(TEMPCALLOCPOINTER128,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T31 utmp31  ; 
T31_T31( &utmp31/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC34) ;
a.size = sizeof(utmp31 );
a.params = (void *)(&utmp31 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER130;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER130 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP35*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER130)[0] = RX10_TEMP35, TEMPCALLOCPOINTER130 = ((int32_t * )TEMPCALLOCPOINTER130)+1, memset(TEMPCALLOCPOINTER130,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T32 utmp32  ; 
T32_T32( &utmp32/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC35) ;
a.size = sizeof(utmp32 );
a.params = (void *)(&utmp32 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER132;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER132 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(RX10_TEMP56*sizeof( double )))),((int32_t * )TEMPCALLOCPOINTER132)[0] = RX10_TEMP56, TEMPCALLOCPOINTER132 = ((int32_t * )TEMPCALLOCPOINTER132)+1, memset(TEMPCALLOCPOINTER132,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T33 utmp33  ; 
T33_T33( &utmp33/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC36) ;
a.size = sizeof(utmp33 );
a.params = (void *)(&utmp33 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread31 ( struct Timer *TimerTHIS,  struct T31 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread32 ( struct Timer *TimerTHIS,  struct T32 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread33 ( struct Timer *TimerTHIS,  struct T33 const utmpz ) 
{ 
struct doubleStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; 
} 
} 


LightStub LightStub_LightStub ( struct LightStub *LightStubTHIS, /*Updatable ARRAY*/ struct Light * const localArray_ ) 
{ 
LightStubTHIS->localArray = ( localArray_ ) ; 

 return  *LightStubTHIS; 

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

Region3 Region3_Region3_2( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ ) 
{ 
const int32_t zero = 0 ; 
const int32_t one = 1 ; 
const int32_t minusOne = zero - one ; 
const uint32_t f = 0 ; 
const int32_t regR = 3 ; 
Region3THIS->regRank = ( regR ) ; 
Region3THIS->regSize = ( regSize_ ) ; 
Region3THIS->pointArray = ( pointArray_ ) ; 
Region3THIS->regType = ( f ) ; 
Region3THIS->low0 = ( minusOne ) ; 
Region3THIS->dim0 = ( zero ) ; 
Region3THIS->low1 = ( minusOne ) ; 
Region3THIS->dim1 = ( zero ) ; 
Region3THIS->low2 = ( minusOne ) ; 
Region3THIS->dim2 = ( zero ) ; 

 return  *Region3THIS; 

} 

Region3 Region3_Region3_8( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ , const int32_t low2_ , const int32_t dim2_ ) 
{ 
const uint32_t t = 1 ; 
const int32_t regR = 3 ; 
Region3THIS->regRank = ( regR ) ; 
Region3THIS->regSize = ( regSize_ ) ; 
Region3THIS->pointArray = ( pointArray_ ) ; 
Region3THIS->regType = ( t ) ; 
Region3THIS->low0 = ( low0_ ) ; 
Region3THIS->dim0 = ( dim0_ ) ; 
Region3THIS->low1 = ( low1_ ) ; 
Region3THIS->dim1 = ( dim1_ ) ; 
Region3THIS->low2 = ( low2_ ) ; 
Region3THIS->dim2 = ( dim2_ ) ; 

 return  *Region3THIS; 

} 

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

} 

SphereRefArray1 SphereRefArray1_SphereRefArray1 ( struct SphereRefArray1 *SphereRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct SphereStub * const contents_ ) 
{ 
SphereRefArray1THIS->distValue = ( distValue_ ) ; 
SphereRefArray1THIS->contents = ( contents_ ) ; 

 return  *SphereRefArray1THIS; 

} 

Point3 Point3_Point3 ( struct Point3 *Point3THIS, const int32_t f0_ , const int32_t f1_ , const int32_t f2_ ) 
{ 
Point3THIS->f0 = ( f0_ ) ; 
Point3THIS->f1 = ( f1_ ) ; 
Point3THIS->f2 = ( f2_ ) ; 

 return  *Point3THIS; 

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
void * TEMPCALLOCPOINTER136;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER136 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(countDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER136)[0] = countDist, TEMPCALLOCPOINTER136 = ((int32_t * )TEMPCALLOCPOINTER136)+1, memset(TEMPCALLOCPOINTER136,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER137;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER137 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory_update_array) += 4*ceil(0.25 *( sizeof(int32_t)+(runSumDist*sizeof( int32_t )))),((int32_t * )TEMPCALLOCPOINTER137)[0] = runSumDist, TEMPCALLOCPOINTER137 = ((int32_t * )TEMPCALLOCPOINTER137)+1, memset(TEMPCALLOCPOINTER137,0,runSumDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER138;
/*VALUE ARRAY*/ int32_t * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

} 

Isect *Isect_Isect_0( struct Isect *IsectTHIS) 
{ 

{ 
const double X10_TEMP2 = 0.0; 
IsectTHIS->t = ( X10_TEMP2 ) ; 
const int32_t X10_TEMP4 = 0 ; 
IsectTHIS->enter = ( X10_TEMP4 ) ; 
const uint32_t X10_TEMP6 = 0 ; 
IsectTHIS->isNull = ( X10_TEMP6 ) ; 
} 

 return  IsectTHIS; 

} 

Isect *Isect_Isect_5( struct Isect *IsectTHIS, const double t_ , const int32_t enter_ , const uint32_t isNull_ ,  struct Sphere const prim_ ,  struct Surface const surf_ ) 
{ 

{ 
IsectTHIS->t = ( t_ ) ; 
IsectTHIS->isNull = ( isNull_ ) ; 
IsectTHIS->enter = ( enter_ ) ; 
IsectTHIS->prim = ( prim_ ) ; 
IsectTHIS->surf = ( surf_ ) ; 
} 

 return  IsectTHIS; 

} 


SphereStub SphereStub_SphereStub ( struct SphereStub *SphereStubTHIS, /*Updatable ARRAY*/ struct Sphere * const localArray_ ) 
{ 
SphereStubTHIS->localArray = ( localArray_ ) ; 

 return  *SphereStubTHIS; 

} 

longStub longStub_longStub ( struct longStub *longStubTHIS, /*Updatable ARRAY*/ int64_t * const localArray_ ) 
{ 
longStubTHIS->localArray = ( localArray_ ) ; 

 return  *longStubTHIS; 

} 
/* class RunMain */ int32_t  runmain( ) 
{ 
_RayTracer_alpha = _RayTracer_alpha_init ( ) ; 
_RayTracer_voidVec = _RayTracer_voidVec_init ( ) ; 
_Scene_maxObjects = _Scene_maxObjects_init ( ) ; 
_Scene_maxLights = _Scene_maxLights_init ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_RayTracer_alpha = _RayTracer_alpha_init ( ) ; 
_RayTracer_voidVec = _RayTracer_voidVec_init ( ) ; 
_Scene_maxObjects = _Scene_maxObjects_init ( ) ; 
_Scene_maxLights = _Scene_maxLights_init ( ) ; 
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
		 fixPointerT16(((struct T16 * const )params), (params+sizeof(struct T16)));
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC11 :
		 fixPointerT17(((struct T17 * const )params), (params+sizeof(struct T17)));
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC12 :
		 fixPointerT18(((struct T18 * const )params), (params+sizeof(struct T18)));
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC13 :
		 fixPointerT19(((struct T19 * const )params), (params+sizeof(struct T19)));
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC14 :
		 fixPointerT20(((struct T20 * const )params), (params+sizeof(struct T20)));
		thread20(*(struct T20 * const )params);
		break;
	 case ASYNC15 :
		 fixPointerT21(((struct T21 * const )params), (params+sizeof(struct T21)));
		thread21(*(struct T21 * const )params);
		break;
	 case ASYNC16 :
		 fixPointerT22(((struct T22 * const )params), (params+sizeof(struct T22)));
		thread22(*(struct T22 * const )params);
		break;
	 case ASYNC17 :
		 fixPointerT23(((struct T23 * const )params), (params+sizeof(struct T23)));
		thread23(*(struct T23 * const )params);
		break;
	 case ASYNC18 :
		 fixPointerT24(((struct T24 * const )params), (params+sizeof(struct T24)));
		thread24(*(struct T24 * const )params);
		break;
	 case ASYNC19 :
		 fixPointerT25(((struct T25 * const )params), (params+sizeof(struct T25)));
		thread25(*(struct T25 * const )params);
		break;
	 case ASYNC20 :
		 fixPointerT26(((struct T26 * const )params), (params+sizeof(struct T26)));
		thread26(*(struct T26 * const )params);
		break;
	 case ASYNC21 :
		 fixPointerT27(((struct T27 * const )params), (params+sizeof(struct T27)));
		thread27(*(struct T27 * const )params);
		break;
	 case ASYNC22 :
		 fixPointerT28(((struct T28 * const )params), (params+sizeof(struct T28)));
		thread28(*(struct T28 * const )params);
		break;
	 case ASYNC23 :
		 fixPointerT34(((struct T34 * const )params), (params+sizeof(struct T34)));
		thread34(*(struct T34 * const )params);
		break;
	 case ASYNC24 :
		 fixPointerT35(((struct T35 * const )params), (params+sizeof(struct T35)));
		thread35(*(struct T35 * const )params);
		break;
	 case ASYNC25 :
		 fixPointerT36(((struct T36 * const )params), (params+sizeof(struct T36)));
		thread36(*(struct T36 * const )params);
		break;
	 case ASYNC26 :
		 fixPointerT37(((struct T37 * const )params), (params+sizeof(struct T37)));
		thread37(*(struct T37 * const )params);
		break;
	 case ASYNC27 :
		 fixPointerT11(((struct T11 * const )params), (params+sizeof(struct T11)));
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC28 :
		 fixPointerT12(((struct T12 * const )params), (params+sizeof(struct T12)));
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC29 :
		 fixPointerT29(((struct T29 * const )params), (params+sizeof(struct T29)));
		thread29(&(*((struct T29 * const )params)).THIS, *((struct T29 * const )params));
		break;
	 case ASYNC30 :
		 fixPointerT30(((struct T30 * const )params), (params+sizeof(struct T30)));
		thread30(&(*((struct T30 * const )params)).THIS, *((struct T30 * const )params));
		break;
	 case ASYNC31 :
		 fixPointerT13(((struct T13 * const )params), (params+sizeof(struct T13)));
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC32 :
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC33 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC34 :
		 fixPointerT31(((struct T31 * const )params), (params+sizeof(struct T31)));
		thread31(&(*((struct T31 * const )params)).THIS, *((struct T31 * const )params));
		break;
	 case ASYNC35 :
		 fixPointerT32(((struct T32 * const )params), (params+sizeof(struct T32)));
		thread32(&(*((struct T32 * const )params)).THIS, *((struct T32 * const )params));
		break;
	 case ASYNC36 :
		 fixPointerT33(((struct T33 * const )params), (params+sizeof(struct T33)));
		thread33(&(*((struct T33 * const )params)).THIS, *((struct T33 * const )params));
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
		thread16(*(struct T16 * const )params);
		break;
	 case ASYNC11 :
		thread17(*(struct T17 * const )params);
		break;
	 case ASYNC12 :
		thread18(*(struct T18 * const )params);
		break;
	 case ASYNC13 :
		thread19(*(struct T19 * const )params);
		break;
	 case ASYNC14 :
		thread20(*(struct T20 * const )params);
		break;
	 case ASYNC15 :
		thread21(*(struct T21 * const )params);
		break;
	 case ASYNC16 :
		thread22(*(struct T22 * const )params);
		break;
	 case ASYNC17 :
		thread23(*(struct T23 * const )params);
		break;
	 case ASYNC18 :
		thread24(*(struct T24 * const )params);
		break;
	 case ASYNC19 :
		thread25(*(struct T25 * const )params);
		break;
	 case ASYNC20 :
		thread26(*(struct T26 * const )params);
		break;
	 case ASYNC21 :
		thread27(*(struct T27 * const )params);
		break;
	 case ASYNC22 :
		thread28(*(struct T28 * const )params);
		break;
	 case ASYNC23 :
		thread34(*(struct T34 * const )params);
		break;
	 case ASYNC24 :
		thread35(*(struct T35 * const )params);
		break;
	 case ASYNC25 :
		thread36(*(struct T36 * const )params);
		break;
	 case ASYNC26 :
		thread37(*(struct T37 * const )params);
		break;
	 case ASYNC27 :
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC28 :
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC29 :
		thread29(&(*((struct T29 * const )params)).THIS, *((struct T29 * const )params));
		break;
	 case ASYNC30 :
		thread30(&(*((struct T30 * const )params)).THIS, *((struct T30 * const )params));
		break;
	 case ASYNC31 :
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC32 :
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC33 :
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC34 :
		thread31(&(*((struct T31 * const )params)).THIS, *((struct T31 * const )params));
		break;
	 case ASYNC35 :
		thread32(&(*((struct T32 * const )params)).THIS, *((struct T32 * const )params));
		break;
	 case ASYNC36 :
		thread33(&(*((struct T33 * const )params)).THIS, *((struct T33 * const )params));
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
		 sizeToMalloc = child.size+ getSizeOfT16((struct T16 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT16((struct T16 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT17((struct T17 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT17((struct T17 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT18((struct T18 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT18((struct T18 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT19((struct T19 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT19((struct T19 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC14 :
		 sizeToMalloc = child.size+ getSizeOfT20((struct T20 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT20((struct T20 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC15 :
		 sizeToMalloc = child.size+ getSizeOfT21((struct T21 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT21((struct T21 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC16 :
		 sizeToMalloc = child.size+ getSizeOfT22((struct T22 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT22((struct T22 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC17 :
		 sizeToMalloc = child.size+ getSizeOfT23((struct T23 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT23((struct T23 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC18 :
		 sizeToMalloc = child.size+ getSizeOfT24((struct T24 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT24((struct T24 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC19 :
		 sizeToMalloc = child.size+ getSizeOfT25((struct T25 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT25((struct T25 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC20 :
		 sizeToMalloc = child.size+ getSizeOfT26((struct T26 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT26((struct T26 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC21 :
		 sizeToMalloc = child.size+ getSizeOfT27((struct T27 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT27((struct T27 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC22 :
		 sizeToMalloc = child.size+ getSizeOfT28((struct T28 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT28((struct T28 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC23 :
		 sizeToMalloc = child.size+ getSizeOfT34((struct T34 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT34((struct T34 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC24 :
		 sizeToMalloc = child.size+ getSizeOfT35((struct T35 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT35((struct T35 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC25 :
		 sizeToMalloc = child.size+ getSizeOfT36((struct T36 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT36((struct T36 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC26 :
		 sizeToMalloc = child.size+ getSizeOfT37((struct T37 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT37((struct T37 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC27 :
		 sizeToMalloc = child.size+ getSizeOfT11((struct T11 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT11((struct T11 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC28 :
		 sizeToMalloc = child.size+ getSizeOfT12((struct T12 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT12((struct T12 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC29 :
		 sizeToMalloc = child.size+ getSizeOfT29((struct T29 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT29((struct T29 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC30 :
		 sizeToMalloc = child.size+ getSizeOfT30((struct T30 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT30((struct T30 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC31 :
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC32 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC33 :
		 sizeToMalloc = child.size+ getSizeOfT15((struct T15 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT15((struct T15 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC34 :
		 sizeToMalloc = child.size+ getSizeOfT31((struct T31 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT31((struct T31 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC35 :
		 sizeToMalloc = child.size+ getSizeOfT32((struct T32 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT32((struct T32 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC36 :
		 sizeToMalloc = child.size+ getSizeOfT33((struct T33 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT33((struct T33 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 default:
 
	fprintf(stderr, "%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\n", _here());
	break;
}
}
int32_t getSizeOfVec( struct Vec * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfdoubleStub( struct doubleStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfVecStub( struct VecStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT29( struct T29 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLightStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT28( struct T28 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLightValArray1(&(className -> templights));
    temp += getSizeOfVecRefArray1(&(className -> temp));
    temp += getSizeOfVec(&(className -> bigr));
    temp += getSizeOfSurface(&(className -> surf));
    temp += getSizeOfVec(&(className -> N));
    temp += getSizeOfVec(&(className -> P));
return temp;
 }
int32_t getSizeOfT27( struct T27 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVecStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT26( struct T26 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfSphereValArray1(&(className -> tempprim));
    temp += getSizeOfintRefArray1(&(className -> temp));
return temp;
 }
int32_t getSizeOfT25( struct T25 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfSurface( struct Surface * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVec(&(className -> color));
return temp;
 }
int32_t getSizeOfT24( struct T24 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> pl));
return temp;
 }
int32_t getSizeOfVecRefArray1( struct VecRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(VecStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfVecStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfT23( struct T23 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOflongStub(&(className -> RX10_TEMP36));
return temp;
 }
int32_t getSizeOfLight( struct Light * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVec(&(className -> pos));
return temp;
 }
int32_t getSizeOfT22( struct T22 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT21( struct T21 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> temp_o));
    temp += getSizeOfSphereRefArray1(&(className -> temp1));
return temp;
 }
int32_t getSizeOfSphere( struct Sphere * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVec(&(className -> c));
    temp += getSizeOfSurface(&(className -> surf));
return temp;
 }
int32_t getSizeOfT20( struct T20 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfLightValArray1( struct LightValArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> regionValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(Light);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfLight(&(className -> contents[i]));
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
int32_t getSizeOfRegion3( struct Region3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
		temp += sizeof(int);
		size = *(((int32_t *)className -> pointArray)-1);
		temp += size*sizeof(Point3);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfPoint3(&(className -> pointArray[i]));
	}
return temp;
 }
int32_t getSizeOfPoint1( struct Point1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfPoint3( struct Point3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfintStub( struct intStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT37( struct T37 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfSphere(&(className -> tempObject));
    temp += getSizeOfSphereRefArray1(&(className -> temp1));
return temp;
 }
int32_t getSizeOfT34( struct T34 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLightStub(&(className -> RX10_TEMP30));
return temp;
 }
int32_t getSizeOfT33( struct T33 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfT36( struct T36 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfSphereStub(&(className -> RX10_TEMP82));
return temp;
 }
int32_t getSizeOfT35( struct T35 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLight(&(className -> tempLight));
    temp += getSizeOfLightRefArray1(&(className -> temp));
return temp;
 }
int32_t getSizeOfT30( struct T30 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfSphereStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfSphereStub( struct SphereStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT32( struct T32 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
 }
int32_t getSizeOfT31( struct T31 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfInterval( struct Interval * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT6( struct T6 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> pl));
    temp += getSizeOfView(&(className -> myview));
    temp += getSizeOfDist1(&(className -> DBlock));
    temp += getSizeOfInterval(&(className -> interval));
return temp;
 }
int32_t getSizeOfT7( struct T7 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfView( struct View * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVec(&(className -> from));
    temp += getSizeOfVec(&(className -> att));
    temp += getSizeOfVec(&(className -> up));
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
int32_t getSizeOflongRefArray1( struct longRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(longStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOflongStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfT8( struct T8 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintRefArray1(&(className -> temp));
return temp;
 }
int32_t getSizeOfT9( struct T9 * className) {
    int32_t temp = 0;
    int32_t size = 0;
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
int32_t getSizeOfSphereValArray1( struct SphereValArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> regionValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(Sphere);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfSphere(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfLightRefArray1( struct LightRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(LightStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfLightStub(&(className -> contents[i]));
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
int32_t getSizeOfLightStub( struct LightStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
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
int32_t getSizeOfSphereRefArray1( struct SphereRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(SphereStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfSphereStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOfT10( struct T10 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfVecRefArray1(&(className -> temp));
    temp += getSizeOfVec(&(className -> bigr));
    temp += getSizeOfSurface(&(className -> surf));
    temp += getSizeOfVec(&(className -> N));
    temp += getSizeOfVec(&(className -> P));
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
    temp += getSizeOfintStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT17( struct T17 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOflongStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT18( struct T18 * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
int32_t getSizeOfT19( struct T19 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> temp_l));
    temp += getSizeOfLightRefArray1(&(className -> temp));
return temp;
 }
int32_t getSizeOflongStub( struct longStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
void* deepCopyVec( struct Vec * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopydoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyVecStub( struct VecStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT29( struct T29 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLightStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLightValArray1(&(className -> templights), offset);
offset = deepCopyVecRefArray1(&(className -> temp), offset);
offset = deepCopyVec(&(className -> bigr), offset);
offset = deepCopySurface(&(className -> surf), offset);
offset = deepCopyVec(&(className -> N), offset);
offset = deepCopyVec(&(className -> P), offset);
return offset;
 }
void* deepCopyT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVecStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopySphereValArray1(&(className -> tempprim), offset);
offset = deepCopyintRefArray1(&(className -> temp), offset);
return offset;
 }
void* deepCopyT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopySurface( struct Surface * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVec(&(className -> color), offset);
return offset;
 }
void* deepCopyT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> pl), offset);
return offset;
 }
void* deepCopyVecRefArray1( struct VecRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(VecStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyVecStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopylongStub(&(className -> RX10_TEMP36), offset);
return offset;
 }
void* deepCopyLight( struct Light * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVec(&(className -> pos), offset);
return offset;
 }
void* deepCopyT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> temp_o), offset);
offset = deepCopySphereRefArray1(&(className -> temp1), offset);
return offset;
 }
void* deepCopySphere( struct Sphere * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVec(&(className -> c), offset);
offset = deepCopySurface(&(className -> surf), offset);
return offset;
 }
void* deepCopyT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyLightValArray1( struct LightValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> regionValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(Light);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyLight(&(className -> contents[i]), offset);
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
void* deepCopyRegion3( struct Region3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
size = *(((int32_t *)className -> pointArray)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(Point3);
memcpy(offset, (void *) className -> pointArray, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyPoint3(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void* deepCopyPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyPoint3( struct Point3 * className, void * offset) {
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
void* deepCopyT37( struct T37 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopySphere(&(className -> tempObject), offset);
offset = deepCopySphereRefArray1(&(className -> temp1), offset);
return offset;
 }
void* deepCopyT34( struct T34 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLightStub(&(className -> RX10_TEMP30), offset);
return offset;
 }
void* deepCopyT33( struct T33 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopyT36( struct T36 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopySphereStub(&(className -> RX10_TEMP82), offset);
return offset;
 }
void* deepCopyT35( struct T35 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLight(&(className -> tempLight), offset);
offset = deepCopyLightRefArray1(&(className -> temp), offset);
return offset;
 }
void* deepCopyT30( struct T30 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopySphereStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopySphereStub( struct SphereStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT32( struct T32 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void* deepCopyT31( struct T31 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyInterval( struct Interval * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> pl), offset);
offset = deepCopyView(&(className -> myview), offset);
offset = deepCopyDist1(&(className -> DBlock), offset);
offset = deepCopyInterval(&(className -> interval), offset);
return offset;
 }
void* deepCopyT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyView( struct View * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVec(&(className -> from), offset);
offset = deepCopyVec(&(className -> att), offset);
offset = deepCopyVec(&(className -> up), offset);
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
void* deepCopylongRefArray1( struct longRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(longStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopylongStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintRefArray1(&(className -> temp), offset);
return offset;
 }
void* deepCopyT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
void* deepCopySphereValArray1( struct SphereValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> regionValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(Sphere);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopySphere(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyLightRefArray1( struct LightRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(LightStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyLightStub(&(className -> contents[i]), offset);
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
void* deepCopyLightStub( struct LightStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
void* deepCopySphereRefArray1( struct SphereRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(SphereStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopySphereStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopyT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyVecRefArray1(&(className -> temp), offset);
offset = deepCopyVec(&(className -> bigr), offset);
offset = deepCopySurface(&(className -> surf), offset);
offset = deepCopyVec(&(className -> N), offset);
offset = deepCopyVec(&(className -> P), offset);
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
offset = deepCopyintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopylongStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void* deepCopyT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> temp_l), offset);
offset = deepCopyLightRefArray1(&(className -> temp), offset);
return offset;
 }
void* deepCopylongStub( struct longStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerVec( struct Vec * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerdoubleStub( struct doubleStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerVecStub( struct VecStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT29( struct T29 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLightStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT28( struct T28 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLightValArray1(&(className -> templights), offset);
offset  = fixPointerVecRefArray1(&(className -> temp), offset);
offset  = fixPointerVec(&(className -> bigr), offset);
offset  = fixPointerSurface(&(className -> surf), offset);
offset  = fixPointerVec(&(className -> N), offset);
offset  = fixPointerVec(&(className -> P), offset);
return offset;
 }
void * fixPointerT27( struct T27 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVecStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT26( struct T26 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerSphereValArray1(&(className -> tempprim), offset);
offset  = fixPointerintRefArray1(&(className -> temp), offset);
return offset;
 }
void * fixPointerT25( struct T25 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerSurface( struct Surface * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVec(&(className -> color), offset);
return offset;
 }
void * fixPointerT24( struct T24 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> pl), offset);
return offset;
 }
void * fixPointerVecRefArray1( struct VecRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(VecStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerVecStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerT23( struct T23 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerlongStub(&(className -> RX10_TEMP36), offset);
return offset;
 }
void * fixPointerLight( struct Light * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVec(&(className -> pos), offset);
return offset;
 }
void * fixPointerT22( struct T22 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT21( struct T21 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> temp_o), offset);
offset  = fixPointerSphereRefArray1(&(className -> temp1), offset);
return offset;
 }
void * fixPointerSphere( struct Sphere * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVec(&(className -> c), offset);
offset  = fixPointerSurface(&(className -> surf), offset);
return offset;
 }
void * fixPointerT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerLightValArray1( struct LightValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> regionValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(Light);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerLight(&(className -> contents[i]), offset);
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
void * fixPointerRegion3( struct Region3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
className -> pointArray = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> pointArray)-1);
offset += size*sizeof(Point3);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerPoint3(&(className -> pointArray[i]), offset);
    }
return offset;
 }
void * fixPointerPoint1( struct Point1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerPoint3( struct Point3 * className, void * offset) {
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
void * fixPointerT37( struct T37 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerSphere(&(className -> tempObject), offset);
offset  = fixPointerSphereRefArray1(&(className -> temp1), offset);
return offset;
 }
void * fixPointerT34( struct T34 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLightStub(&(className -> RX10_TEMP30), offset);
return offset;
 }
void * fixPointerT33( struct T33 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerT36( struct T36 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerSphereStub(&(className -> RX10_TEMP82), offset);
return offset;
 }
void * fixPointerT35( struct T35 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLight(&(className -> tempLight), offset);
offset  = fixPointerLightRefArray1(&(className -> temp), offset);
return offset;
 }
void * fixPointerT30( struct T30 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerSphereStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerSphereStub( struct SphereStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT32( struct T32 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
void * fixPointerT31( struct T31 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerInterval( struct Interval * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> pl), offset);
offset  = fixPointerView(&(className -> myview), offset);
offset  = fixPointerDist1(&(className -> DBlock), offset);
offset  = fixPointerInterval(&(className -> interval), offset);
return offset;
 }
void * fixPointerT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerView( struct View * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVec(&(className -> from), offset);
offset  = fixPointerVec(&(className -> att), offset);
offset  = fixPointerVec(&(className -> up), offset);
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
void * fixPointerlongRefArray1( struct longRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(longStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerlongStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerT8( struct T8 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintRefArray1(&(className -> temp), offset);
return offset;
 }
void * fixPointerT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
void * fixPointerSphereValArray1( struct SphereValArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> regionValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(Sphere);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerSphere(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerLightRefArray1( struct LightRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(LightStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerLightStub(&(className -> contents[i]), offset);
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
void * fixPointerLightStub( struct LightStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
void * fixPointerSphereRefArray1( struct SphereRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(SphereStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerSphereStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerT10( struct T10 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerVecRefArray1(&(className -> temp), offset);
offset  = fixPointerVec(&(className -> bigr), offset);
offset  = fixPointerSurface(&(className -> surf), offset);
offset  = fixPointerVec(&(className -> N), offset);
offset  = fixPointerVec(&(className -> P), offset);
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
offset  = fixPointerintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT17( struct T17 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerlongStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
void * fixPointerT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> temp_l), offset);
offset  = fixPointerLightRefArray1(&(className -> temp), offset);
return offset;
 }
void * fixPointerlongStub( struct longStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
