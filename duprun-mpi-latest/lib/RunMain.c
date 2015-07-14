#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int32_t _IDEATest_array_rows ;
int64_t _Random_multiplier ;
int64_t _Random_addend ;
int64_t _Random_mask ;
int32_t _Timer_max_counters ;
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
struct IDEATest * X10_TEMP4 = (struct IDEATest  *)  ((((_task*)_thread_getspecific()) -> total_memory) +=  sizeof(struct IDEATest ),malloc(sizeof(struct IDEATest )));  
IDEATest_IDEATest( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
IDEATest_run ( X10_TEMP4 ) ; 
} 
task_end_finish();
/*END OF FINISH*/
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for crypt: " ; 
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

int32_t /*static*/_IDEATest_array_rows_init ( ) 
{ 
const int32_t X10_TEMP2 = 32000 ; 
return X10_TEMP2 ; 
} 

void /*static*/IDEATest_run (  struct IDEATest  * const X10_TEMP0 ) 
{ 
IDEATest_kernel ( X10_TEMP0 ) ; 
IDEATest_validate ( X10_TEMP0 ) ; 
} 

void /*static*/IDEATest_kernel (  struct IDEATest  * const X10_TEMP0 ) 
{ 
IDEATest_Do ( X10_TEMP0 ) ; 
} 

void /*static*/IDEATest_validate (  struct IDEATest  * const X10_TEMP0 ) 
{ 
struct byteRefArray1 p1 = X10_TEMP0 ->plain1 ; 
struct byteRefArray1 c1 = X10_TEMP0 ->crypt1 ; 
struct byteRefArray1 p2 = X10_TEMP0 ->plain2 ; 
/* finish  */ task_start_finish();

{ 
struct byteRefArray1 X10_TEMP4 = X10_TEMP0 ->plain1 ; 
struct Dist1 RX10_TEMP0 = X10_TEMP4 .distValue ; 
struct Dist1 X10_TEMP6 = RX10_TEMP0 ; 
struct Region1 RX10_TEMP2 = X10_TEMP6 .dReg ; 
const int32_t RX10_TEMP5 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = RX10_TEMP2 .regSize ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP5 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
for ( int32_t RX10_TEMP1= 0; RX10_TEMP1<  RX10_TEMP4; RX10_TEMP1++ )
 
{ 
const int32_t RX10_TEMP6 = /*PointAccess*/RX10_TEMP1 ; 
struct Point1 pt = regionOrdinalPoint1 ( RX10_TEMP2 , RX10_TEMP6 ) ; 
struct Region1 RX10_TEMP7 = X10_TEMP6 .dReg ; 
const int32_t RX10_TEMP8 = searchPointInRegion1 ( RX10_TEMP7 , pt ) ; 
const int32_t RX10_TEMP9 = 0 ; 
const uint32_t RX10_TEMP10 = RX10_TEMP8 < RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
const char * RX10_TEMP11 = "Point pt not found in the distribution X10_TEMP6." ; 
fprintf(stderr, "%s",RX10_TEMP11 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP12 = getPlaceFromDist1 ( X10_TEMP6 , RX10_TEMP8 ) ; 
const place_t X10_TEMP7 = RX10_TEMP12 ; 
struct T1 utmp1  ; 
T1_T1( &utmp1/*OBJECT INIT IN ASSIGNMENT*/, pt , p2 , c1 , p1 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC0) ;
a.size = sizeof(utmp1 );
a.params = (void *)(&utmp1 );
task_dispatch(a, X10_TEMP7 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 

void /*static*/IDEATest_Do (  struct IDEATest  * const X10_TEMP0 ) 
{ 
struct byteRefArray1 p1 = X10_TEMP0 ->plain1 ; 
struct byteRefArray1 c1 = X10_TEMP0 ->crypt1 ; 
struct byteRefArray1 p2 = X10_TEMP0 ->plain2 ; 
struct intValArray1 fzr = X10_TEMP0 ->ZR ; 
struct intValArray1 fdkr = X10_TEMP0 ->DKR ; 
/* finish  */ task_start_finish();

{ 
struct Dist1 X10_TEMP7 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP1 = X10_TEMP7 .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 pt = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Region1 RX10_TEMP6 = X10_TEMP7 .dReg ; 
const int32_t RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , pt ) ; 
const int32_t RX10_TEMP8 = 0 ; 
const uint32_t RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
const char * RX10_TEMP10 = "Point pt not found in the distribution X10_TEMP7." ; 
fprintf(stderr, "%s",RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP11 = getPlaceFromDist1 ( X10_TEMP7 , RX10_TEMP7 ) ; 
const place_t X10_TEMP8 = RX10_TEMP11 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, fdkr , fzr , p2 , c1 , p1 , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, X10_TEMP8 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 

void /*static*/IDEATest_cipher_idea (  struct IDEATest  * const X10_TEMP0 ,  struct byteRefArray1 const text1 ,  struct byteRefArray1 const text2 ,  struct intValArray1 const key ) 
{ 
struct Dist1 RX10_TEMP0 = text1 .distValue ; 
struct Region1 RX10_TEMP1 = RX10_TEMP0 .dReg ; 
struct Region1 X10_TEMP1 = RX10_TEMP1 ; 
const int32_t X10_TEMP6 = X10_TEMP1 .regSize ; 
const int32_t X10_TEMP2 = 8 ; 
const int32_t X10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
const int32_t X10_TEMP5 = X10_TEMP2 * X10_TEMP3 ; 
const int32_t X10_TEMP7 = X10_TEMP6 % X10_TEMP5 ; 
const int32_t X10_TEMP8 = 0 ; 
const uint32_t X10_TEMP10 = X10_TEMP7 != X10_TEMP8 ; 
if ( X10_TEMP10 ) 
{ 
const char * X10_TEMP12 = "Invalid number of places for the distribution size" ; 
fprintf(stderr, "%s",X10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

struct Dist1 RX10_TEMP2 = text1 .distValue ; 
struct Dist1 X10_TEMP13 = RX10_TEMP2 ; 
const place_t X10_TEMP14 = /* here  */ _here(); 
struct Dist1 X10_TEMP16 = restrictDist1 ( X10_TEMP13 , X10_TEMP14 ) ; 
struct Region1 RX10_TEMP4 = X10_TEMP16 .dReg ; 
const int32_t RX10_TEMP7 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP5 = RX10_TEMP4 .regSize ; 
RX10_TEMP5 = RX10_TEMP5 - RX10_TEMP7 ; const int32_t RX10_TEMP6 = RX10_TEMP5 + 1; 
for ( int32_t RX10_TEMP3= 0; RX10_TEMP3<  RX10_TEMP6; RX10_TEMP3++ )
 
{ 
const int32_t RX10_TEMP8 = /*PointAccess*/RX10_TEMP3 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP4 , RX10_TEMP8 ) ; 
const int32_t X10_TEMP18 = i .f0 ; 
const int32_t X10_TEMP19 = 8 ; 
const int32_t X10_TEMP20 = X10_TEMP18 % X10_TEMP19 ; 
const int32_t X10_TEMP21 = 0 ; 
const uint32_t X10_TEMP23 = X10_TEMP20 == X10_TEMP21 ; 
if ( X10_TEMP23 ) 
{ 
/*UpdatableVariableDeclaration*/
 struct Point1 i1 = i ; 
/*UpdatableVariableDeclaration*/
 struct Point1 i2 = i ; 
/*UpdatableVariableDeclaration*/
int32_t ik = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t x1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t x2 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t x3 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t x4 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t2 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t r = 0 ; 
const int32_t X10_TEMP35 = 0 ; 
ik = X10_TEMP35 ; const int32_t X10_TEMP37 = 8 ; 
r = X10_TEMP37 ; struct Dist1 RX10_TEMP9 = text1 .distValue ; 
struct Region1 RX10_TEMP10 = RX10_TEMP9 .dReg ; 
const int32_t RX10_TEMP11 = searchPointInRegion1 ( RX10_TEMP10 , i1 ) ; 
const int32_t RX10_TEMP12 = 0 ; 
const uint32_t RX10_TEMP13 = RX10_TEMP11 < RX10_TEMP12 ; 
if ( RX10_TEMP13 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP14 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP15 = getPlaceFromDist1 ( RX10_TEMP9 , RX10_TEMP11 ) ; 
const place_t RX10_TEMP17 = /* here  */ _here(); 
const uint32_t RX10_TEMP18 = RX10_TEMP15 != RX10_TEMP17 ; 
if ( RX10_TEMP18 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP16 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP16 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP19 = getRefArrayValue1byte ( text1 , RX10_TEMP11 ) ; 
const char /**/X10_TEMP39 = ( char) RX10_TEMP19 ; 
const int32_t X10_TEMP40 = 0xff ; 
const int32_t X10_TEMP42 = X10_TEMP39 & X10_TEMP40 ; 
x1 = X10_TEMP42 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP20 = i1 .f0 ; 
RX10_TEMP20 = RX10_TEMP20 + X10_TEMP44 ; struct Point1 X10_TEMP46  ; 
Point1_Point1( &X10_TEMP46/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP20 ) ; 
i1 = X10_TEMP46 ; struct Dist1 RX10_TEMP21 = text1 .distValue ; 
struct Region1 RX10_TEMP22 = RX10_TEMP21 .dReg ; 
const int32_t RX10_TEMP23 = searchPointInRegion1 ( RX10_TEMP22 , i1 ) ; 
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
char * RX10_TEMP28 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP31 = getRefArrayValue1byte ( text1 , RX10_TEMP23 ) ; 
const char /**/X10_TEMP48 = ( char) RX10_TEMP31 ; 
const int32_t X10_TEMP49 = 0xff ; 
const int32_t X10_TEMP51 = X10_TEMP48 & X10_TEMP49 ; 
const int32_t X10_TEMP52 = 8 ; 
const int32_t X10_TEMP53 = X10_TEMP51 << X10_TEMP52 ; 
const int32_t X10_TEMP55 = x1 | X10_TEMP53 ; 
x1 = X10_TEMP55 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP57 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP32 = i1 .f0 ; 
RX10_TEMP32 = RX10_TEMP32 + X10_TEMP57 ; struct Point1 X10_TEMP59  ; 
Point1_Point1( &X10_TEMP59/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP32 ) ; 
i1 = X10_TEMP59 ; struct Dist1 RX10_TEMP33 = text1 .distValue ; 
struct Region1 RX10_TEMP34 = RX10_TEMP33 .dReg ; 
const int32_t RX10_TEMP35 = searchPointInRegion1 ( RX10_TEMP34 , i1 ) ; 
const int32_t RX10_TEMP36 = 0 ; 
const uint32_t RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; 
if ( RX10_TEMP37 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP39 = getPlaceFromDist1 ( RX10_TEMP33 , RX10_TEMP35 ) ; 
const place_t RX10_TEMP41 = /* here  */ _here(); 
const uint32_t RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP40 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP43 = getRefArrayValue1byte ( text1 , RX10_TEMP35 ) ; 
const char /**/X10_TEMP61 = ( char) RX10_TEMP43 ; 
const int32_t X10_TEMP62 = 0xff ; 
const int32_t X10_TEMP64 = X10_TEMP61 & X10_TEMP62 ; 
x2 = X10_TEMP64 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP66 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP44 = i1 .f0 ; 
RX10_TEMP44 = RX10_TEMP44 + X10_TEMP66 ; struct Point1 X10_TEMP68  ; 
Point1_Point1( &X10_TEMP68/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP44 ) ; 
i1 = X10_TEMP68 ; struct Dist1 RX10_TEMP45 = text1 .distValue ; 
struct Region1 RX10_TEMP46 = RX10_TEMP45 .dReg ; 
const int32_t RX10_TEMP47 = searchPointInRegion1 ( RX10_TEMP46 , i1 ) ; 
const int32_t RX10_TEMP48 = 0 ; 
const uint32_t RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; 
if ( RX10_TEMP49 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP50 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP51 = getPlaceFromDist1 ( RX10_TEMP45 , RX10_TEMP47 ) ; 
const place_t RX10_TEMP53 = /* here  */ _here(); 
const uint32_t RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP52 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP55 = getRefArrayValue1byte ( text1 , RX10_TEMP47 ) ; 
const char /**/X10_TEMP70 = ( char) RX10_TEMP55 ; 
const int32_t X10_TEMP71 = 0xff ; 
const int32_t X10_TEMP73 = X10_TEMP70 & X10_TEMP71 ; 
const int32_t X10_TEMP74 = 8 ; 
const int32_t X10_TEMP75 = X10_TEMP73 << X10_TEMP74 ; 
const int32_t X10_TEMP77 = x2 | X10_TEMP75 ; 
x2 = X10_TEMP77 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP79 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP56 = i1 .f0 ; 
RX10_TEMP56 = RX10_TEMP56 + X10_TEMP79 ; struct Point1 X10_TEMP81  ; 
Point1_Point1( &X10_TEMP81/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP56 ) ; 
i1 = X10_TEMP81 ; struct Dist1 RX10_TEMP57 = text1 .distValue ; 
struct Region1 RX10_TEMP58 = RX10_TEMP57 .dReg ; 
const int32_t RX10_TEMP59 = searchPointInRegion1 ( RX10_TEMP58 , i1 ) ; 
const int32_t RX10_TEMP60 = 0 ; 
const uint32_t RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60 ; 
if ( RX10_TEMP61 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP62 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP62 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP63 = getPlaceFromDist1 ( RX10_TEMP57 , RX10_TEMP59 ) ; 
const place_t RX10_TEMP65 = /* here  */ _here(); 
const uint32_t RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65 ; 
if ( RX10_TEMP66 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP64 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP67 = getRefArrayValue1byte ( text1 , RX10_TEMP59 ) ; 
const char /**/X10_TEMP83 = ( char) RX10_TEMP67 ; 
const int32_t X10_TEMP84 = 0xff ; 
const int32_t X10_TEMP86 = X10_TEMP83 & X10_TEMP84 ; 
x3 = X10_TEMP86 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP88 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP68 = i1 .f0 ; 
RX10_TEMP68 = RX10_TEMP68 + X10_TEMP88 ; struct Point1 X10_TEMP90  ; 
Point1_Point1( &X10_TEMP90/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP68 ) ; 
i1 = X10_TEMP90 ; struct Dist1 RX10_TEMP69 = text1 .distValue ; 
struct Region1 RX10_TEMP70 = RX10_TEMP69 .dReg ; 
const int32_t RX10_TEMP71 = searchPointInRegion1 ( RX10_TEMP70 , i1 ) ; 
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
char * RX10_TEMP76 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP79 = getRefArrayValue1byte ( text1 , RX10_TEMP71 ) ; 
const char /**/X10_TEMP92 = ( char) RX10_TEMP79 ; 
const int32_t X10_TEMP93 = 0xff ; 
const int32_t X10_TEMP95 = X10_TEMP92 & X10_TEMP93 ; 
const int32_t X10_TEMP96 = 8 ; 
const int32_t X10_TEMP97 = X10_TEMP95 << X10_TEMP96 ; 
const int32_t X10_TEMP99 = x3 | X10_TEMP97 ; 
x3 = X10_TEMP99 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP101 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP80 = i1 .f0 ; 
RX10_TEMP80 = RX10_TEMP80 + X10_TEMP101 ; struct Point1 X10_TEMP103  ; 
Point1_Point1( &X10_TEMP103/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP80 ) ; 
i1 = X10_TEMP103 ; struct Dist1 RX10_TEMP81 = text1 .distValue ; 
struct Region1 RX10_TEMP82 = RX10_TEMP81 .dReg ; 
const int32_t RX10_TEMP83 = searchPointInRegion1 ( RX10_TEMP82 , i1 ) ; 
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
char * RX10_TEMP88 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP88 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP91 = getRefArrayValue1byte ( text1 , RX10_TEMP83 ) ; 
const char /**/X10_TEMP105 = ( char) RX10_TEMP91 ; 
const int32_t X10_TEMP106 = 0xff ; 
const int32_t X10_TEMP108 = X10_TEMP105 & X10_TEMP106 ; 
x4 = X10_TEMP108 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP110 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP92 = i1 .f0 ; 
RX10_TEMP92 = RX10_TEMP92 + X10_TEMP110 ; struct Point1 X10_TEMP112  ; 
Point1_Point1( &X10_TEMP112/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP92 ) ; 
i1 = X10_TEMP112 ; struct Dist1 RX10_TEMP93 = text1 .distValue ; 
struct Region1 RX10_TEMP94 = RX10_TEMP93 .dReg ; 
const int32_t RX10_TEMP95 = searchPointInRegion1 ( RX10_TEMP94 , i1 ) ; 
const int32_t RX10_TEMP96 = 0 ; 
const uint32_t RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP98 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP98 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP99 = getPlaceFromDist1 ( RX10_TEMP93 , RX10_TEMP95 ) ; 
const place_t RX10_TEMP101 = /* here  */ _here(); 
const uint32_t RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101 ; 
if ( RX10_TEMP102 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP100 = "Bad place access for array text1" ; 
fprintf(stderr, "%s",RX10_TEMP100 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP103 = getRefArrayValue1byte ( text1 , RX10_TEMP95 ) ; 
const char /**/X10_TEMP114 = ( char) RX10_TEMP103 ; 
const int32_t X10_TEMP115 = 0xff ; 
const int32_t X10_TEMP117 = X10_TEMP114 & X10_TEMP115 ; 
const int32_t X10_TEMP118 = 8 ; 
const int32_t X10_TEMP119 = X10_TEMP117 << X10_TEMP118 ; 
const int32_t X10_TEMP121 = x4 | X10_TEMP119 ; 
x4 = X10_TEMP121 ; /*UpdatableVariableDeclaration*/
int32_t X10_TEMP123 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP104 = i1 .f0 ; 
RX10_TEMP104 = RX10_TEMP104 + X10_TEMP123 ; struct Point1 X10_TEMP125  ; 
Point1_Point1( &X10_TEMP125/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP104 ) ; 
i1 = X10_TEMP125 ; /*UpdatableVariableDeclaration*/
uint32_t X10_TEMP126 = 0 ; 
do 
{ 
const int64_t X10_TEMP130 = /*casting*/( int64_t ) x1 ; 
const int32_t X10_TEMP127 = ik ; 
const int32_t X10_TEMP128 = 1 ; 
ik = ik + X10_TEMP128 ; struct Point1 RX10_TEMP105  ; 
Point1_Point1( &RX10_TEMP105/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP127 ) ; 
struct Region1 RX10_TEMP106 = key .regionValue ; 
const int32_t RX10_TEMP107 = searchPointInRegion1 ( RX10_TEMP106 , RX10_TEMP105 ) ; 
const int32_t RX10_TEMP108 = 0 ; 
const uint32_t RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108 ; 
if ( RX10_TEMP109 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP110 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP110 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP111 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP131 = RX10_TEMP111 [ RX10_TEMP107 ] 
; 
const int64_t X10_TEMP132 = X10_TEMP130 * X10_TEMP131 ; 
const int64_t X10_TEMP133 = 0x10001L ; 
const int64_t X10_TEMP134 = X10_TEMP132 % X10_TEMP133 ; 
const int32_t X10_TEMP135 = 0xffff ; 
const int64_t X10_TEMP137 = X10_TEMP134 & X10_TEMP135 ; 
const int32_t X10_TEMP139 = /*casting*/( int32_t ) X10_TEMP137 ; 
x1 = X10_TEMP139 ; const int32_t X10_TEMP140 = ik ; 
const int32_t X10_TEMP141 = 1 ; 
ik = ik + X10_TEMP141 ; struct Point1 RX10_TEMP112  ; 
Point1_Point1( &RX10_TEMP112/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP140 ) ; 
struct Region1 RX10_TEMP113 = key .regionValue ; 
const int32_t RX10_TEMP114 = searchPointInRegion1 ( RX10_TEMP113 , RX10_TEMP112 ) ; 
const int32_t RX10_TEMP115 = 0 ; 
const uint32_t RX10_TEMP116 = RX10_TEMP114 < RX10_TEMP115 ; 
if ( RX10_TEMP116 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP117 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP117 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP118 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP143 = RX10_TEMP118 [ RX10_TEMP114 ] 
; 
const int32_t X10_TEMP144 = x2 + X10_TEMP143 ; 
const int32_t X10_TEMP145 = 0xffff ; 
const int32_t X10_TEMP147 = X10_TEMP144 & X10_TEMP145 ; 
x2 = X10_TEMP147 ; const int32_t X10_TEMP148 = ik ; 
const int32_t X10_TEMP149 = 1 ; 
ik = ik + X10_TEMP149 ; struct Point1 RX10_TEMP119  ; 
Point1_Point1( &RX10_TEMP119/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP148 ) ; 
struct Region1 RX10_TEMP120 = key .regionValue ; 
const int32_t RX10_TEMP121 = searchPointInRegion1 ( RX10_TEMP120 , RX10_TEMP119 ) ; 
const int32_t RX10_TEMP122 = 0 ; 
const uint32_t RX10_TEMP123 = RX10_TEMP121 < RX10_TEMP122 ; 
if ( RX10_TEMP123 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP124 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP124 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP125 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP151 = RX10_TEMP125 [ RX10_TEMP121 ] 
; 
const int32_t X10_TEMP152 = x3 + X10_TEMP151 ; 
const int32_t X10_TEMP153 = 0xffff ; 
const int32_t X10_TEMP155 = X10_TEMP152 & X10_TEMP153 ; 
x3 = X10_TEMP155 ; const int64_t X10_TEMP159 = /*casting*/( int64_t ) x4 ; 
const int32_t X10_TEMP156 = ik ; 
const int32_t X10_TEMP157 = 1 ; 
ik = ik + X10_TEMP157 ; struct Point1 RX10_TEMP126  ; 
Point1_Point1( &RX10_TEMP126/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP156 ) ; 
struct Region1 RX10_TEMP127 = key .regionValue ; 
const int32_t RX10_TEMP128 = searchPointInRegion1 ( RX10_TEMP127 , RX10_TEMP126 ) ; 
const int32_t RX10_TEMP129 = 0 ; 
const uint32_t RX10_TEMP130 = RX10_TEMP128 < RX10_TEMP129 ; 
if ( RX10_TEMP130 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP131 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP131 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP132 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP160 = RX10_TEMP132 [ RX10_TEMP128 ] 
; 
const int64_t X10_TEMP161 = X10_TEMP159 * X10_TEMP160 ; 
const int64_t X10_TEMP162 = 0x10001L ; 
const int64_t X10_TEMP163 = X10_TEMP161 % X10_TEMP162 ; 
const int32_t X10_TEMP164 = 0xffff ; 
const int64_t X10_TEMP166 = X10_TEMP163 & X10_TEMP164 ; 
const int32_t X10_TEMP168 = /*casting*/( int32_t ) X10_TEMP166 ; 
x4 = X10_TEMP168 ; const int32_t X10_TEMP170 = x1 ^ x3 ; 
t2 = X10_TEMP170 ; const int64_t X10_TEMP174 = /*casting*/( int64_t ) t2 ; 
const int32_t X10_TEMP171 = ik ; 
const int32_t X10_TEMP172 = 1 ; 
ik = ik + X10_TEMP172 ; struct Point1 RX10_TEMP133  ; 
Point1_Point1( &RX10_TEMP133/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP171 ) ; 
struct Region1 RX10_TEMP134 = key .regionValue ; 
const int32_t RX10_TEMP135 = searchPointInRegion1 ( RX10_TEMP134 , RX10_TEMP133 ) ; 
const int32_t RX10_TEMP136 = 0 ; 
const uint32_t RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136 ; 
if ( RX10_TEMP137 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP138 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP138 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP139 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP175 = RX10_TEMP139 [ RX10_TEMP135 ] 
; 
const int64_t X10_TEMP176 = X10_TEMP174 * X10_TEMP175 ; 
const int64_t X10_TEMP177 = 0x10001L ; 
const int64_t X10_TEMP178 = X10_TEMP176 % X10_TEMP177 ; 
const int32_t X10_TEMP179 = 0xffff ; 
const int64_t X10_TEMP181 = X10_TEMP178 & X10_TEMP179 ; 
const int32_t X10_TEMP183 = /*casting*/( int32_t ) X10_TEMP181 ; 
t2 = X10_TEMP183 ; const int32_t X10_TEMP185 = x2 ^ x4 ; 
const int32_t X10_TEMP186 = t2 + X10_TEMP185 ; 
const int32_t X10_TEMP187 = 0xffff ; 
const int32_t X10_TEMP189 = X10_TEMP186 & X10_TEMP187 ; 
t1 = X10_TEMP189 ; const int64_t X10_TEMP193 = /*casting*/( int64_t ) t1 ; 
const int32_t X10_TEMP190 = ik ; 
const int32_t X10_TEMP191 = 1 ; 
ik = ik + X10_TEMP191 ; struct Point1 RX10_TEMP140  ; 
Point1_Point1( &RX10_TEMP140/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP190 ) ; 
struct Region1 RX10_TEMP141 = key .regionValue ; 
const int32_t RX10_TEMP142 = searchPointInRegion1 ( RX10_TEMP141 , RX10_TEMP140 ) ; 
const int32_t RX10_TEMP143 = 0 ; 
const uint32_t RX10_TEMP144 = RX10_TEMP142 < RX10_TEMP143 ; 
if ( RX10_TEMP144 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP145 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP145 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP146 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP194 = RX10_TEMP146 [ RX10_TEMP142 ] 
; 
const int64_t X10_TEMP195 = X10_TEMP193 * X10_TEMP194 ; 
const int64_t X10_TEMP196 = 0x10001L ; 
const int64_t X10_TEMP197 = X10_TEMP195 % X10_TEMP196 ; 
const int32_t X10_TEMP198 = 0xffff ; 
const int64_t X10_TEMP200 = X10_TEMP197 & X10_TEMP198 ; 
const int32_t X10_TEMP202 = /*casting*/( int32_t ) X10_TEMP200 ; 
t1 = X10_TEMP202 ; const int32_t X10_TEMP203 = t1 + t2 ; 
const int32_t X10_TEMP204 = 0xffff ; 
const int32_t X10_TEMP206 = X10_TEMP203 & X10_TEMP204 ; 
t2 = X10_TEMP206 ; const int32_t X10_TEMP208 = x1 ^ t1 ; 
x1 = X10_TEMP208 ; const int32_t X10_TEMP210 = x4 ^ t2 ; 
x4 = X10_TEMP210 ; const int32_t X10_TEMP212 = t2 ^ x2 ; 
t2 = X10_TEMP212 ; const int32_t X10_TEMP214 = x3 ^ t1 ; 
x2 = X10_TEMP214 ; x3 = t2 ; const int32_t X10_TEMP216 = 1 ; 
r = r - X10_TEMP216 ; const int32_t X10_TEMP217 = 0 ; 
X10_TEMP126 = r != X10_TEMP217 ; } 
while ( X10_TEMP126 ) ; 
const int64_t X10_TEMP222 = /*casting*/( int64_t ) x1 ; 
const int32_t X10_TEMP219 = ik ; 
const int32_t X10_TEMP220 = 1 ; 
ik = ik + X10_TEMP220 ; struct Point1 RX10_TEMP147  ; 
Point1_Point1( &RX10_TEMP147/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP219 ) ; 
struct Region1 RX10_TEMP148 = key .regionValue ; 
const int32_t RX10_TEMP149 = searchPointInRegion1 ( RX10_TEMP148 , RX10_TEMP147 ) ; 
const int32_t RX10_TEMP150 = 0 ; 
const uint32_t RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150 ; 
if ( RX10_TEMP151 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP152 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP152 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP153 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP223 = RX10_TEMP153 [ RX10_TEMP149 ] 
; 
const int64_t X10_TEMP224 = X10_TEMP222 * X10_TEMP223 ; 
const int64_t X10_TEMP225 = 0x10001L ; 
const int64_t X10_TEMP226 = X10_TEMP224 % X10_TEMP225 ; 
const int32_t X10_TEMP227 = 0xffff ; 
const int64_t X10_TEMP229 = X10_TEMP226 & X10_TEMP227 ; 
const int32_t X10_TEMP231 = /*casting*/( int32_t ) X10_TEMP229 ; 
x1 = X10_TEMP231 ; const int32_t X10_TEMP232 = ik ; 
const int32_t X10_TEMP233 = 1 ; 
ik = ik + X10_TEMP233 ; struct Point1 RX10_TEMP154  ; 
Point1_Point1( &RX10_TEMP154/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP232 ) ; 
struct Region1 RX10_TEMP155 = key .regionValue ; 
const int32_t RX10_TEMP156 = searchPointInRegion1 ( RX10_TEMP155 , RX10_TEMP154 ) ; 
const int32_t RX10_TEMP157 = 0 ; 
const uint32_t RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157 ; 
if ( RX10_TEMP158 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP159 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP159 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP160 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP235 = RX10_TEMP160 [ RX10_TEMP156 ] 
; 
const int32_t X10_TEMP236 = x3 + X10_TEMP235 ; 
const int32_t X10_TEMP237 = 0xffff ; 
const int32_t X10_TEMP239 = X10_TEMP236 & X10_TEMP237 ; 
x3 = X10_TEMP239 ; const int32_t X10_TEMP240 = ik ; 
const int32_t X10_TEMP241 = 1 ; 
ik = ik + X10_TEMP241 ; struct Point1 RX10_TEMP161  ; 
Point1_Point1( &RX10_TEMP161/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP240 ) ; 
struct Region1 RX10_TEMP162 = key .regionValue ; 
const int32_t RX10_TEMP163 = searchPointInRegion1 ( RX10_TEMP162 , RX10_TEMP161 ) ; 
const int32_t RX10_TEMP164 = 0 ; 
const uint32_t RX10_TEMP165 = RX10_TEMP163 < RX10_TEMP164 ; 
if ( RX10_TEMP165 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP166 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP166 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP167 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP243 = RX10_TEMP167 [ RX10_TEMP163 ] 
; 
const int32_t X10_TEMP244 = x2 + X10_TEMP243 ; 
const int32_t X10_TEMP245 = 0xffff ; 
const int32_t X10_TEMP247 = X10_TEMP244 & X10_TEMP245 ; 
x2 = X10_TEMP247 ; const int64_t X10_TEMP251 = /*casting*/( int64_t ) x4 ; 
const int32_t X10_TEMP248 = ik ; 
const int32_t X10_TEMP249 = 1 ; 
ik = ik + X10_TEMP249 ; struct Point1 RX10_TEMP168  ; 
Point1_Point1( &RX10_TEMP168/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP248 ) ; 
struct Region1 RX10_TEMP169 = key .regionValue ; 
const int32_t RX10_TEMP170 = searchPointInRegion1 ( RX10_TEMP169 , RX10_TEMP168 ) ; 
const int32_t RX10_TEMP171 = 0 ; 
const uint32_t RX10_TEMP172 = RX10_TEMP170 < RX10_TEMP171 ; 
if ( RX10_TEMP172 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP173 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP173 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP174 = (/*VALUE ARRAY*/ int32_t * ) key .contents ; 
const int32_t X10_TEMP252 = RX10_TEMP174 [ RX10_TEMP170 ] 
; 
const int64_t X10_TEMP253 = X10_TEMP251 * X10_TEMP252 ; 
const int64_t X10_TEMP254 = 0x10001L ; 
const int64_t X10_TEMP255 = X10_TEMP253 % X10_TEMP254 ; 
const int32_t X10_TEMP256 = 0xffff ; 
const int64_t X10_TEMP258 = X10_TEMP255 & X10_TEMP256 ; 
const int32_t X10_TEMP260 = /*casting*/( int32_t ) X10_TEMP258 ; 
x4 = X10_TEMP260 ; const char /**/X10_TEMP263 = ( char) ( char) x1 ; 
const char /**/X10_TEMP264 = ( char) X10_TEMP263 ; 
struct Dist1 RX10_TEMP175 = text2 .distValue ; 
struct Region1 RX10_TEMP176 = RX10_TEMP175 .dReg ; 
const int32_t RX10_TEMP177 = searchPointInRegion1 ( RX10_TEMP176 , i2 ) ; 
const int32_t RX10_TEMP178 = 0 ; 
const uint32_t RX10_TEMP179 = RX10_TEMP177 < RX10_TEMP178 ; 
if ( RX10_TEMP179 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP180 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP180 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP181 = getPlaceFromDist1 ( RX10_TEMP175 , RX10_TEMP177 ) ; 
const place_t RX10_TEMP183 = /* here  */ _here(); 
const uint32_t RX10_TEMP184 = RX10_TEMP181 != RX10_TEMP183 ; 
if ( RX10_TEMP184 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP182 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP182 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP177 , X10_TEMP264 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP266 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP185 = i2 .f0 ; 
RX10_TEMP185 = RX10_TEMP185 + X10_TEMP266 ; struct Point1 X10_TEMP268  ; 
Point1_Point1( &X10_TEMP268/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP185 ) ; 
i2 = X10_TEMP268 ; const int32_t X10_TEMP270 = 8 ; 
const int32_t X10_TEMP272 = (((x1 >> X10_TEMP270) ) & ((2147483647 >> X10_TEMP270))); 
const char /**/X10_TEMP274 = ( char) ( char) X10_TEMP272 ; 
const char /**/X10_TEMP275 = ( char) X10_TEMP274 ; 
struct Dist1 RX10_TEMP186 = text2 .distValue ; 
struct Region1 RX10_TEMP187 = RX10_TEMP186 .dReg ; 
const int32_t RX10_TEMP188 = searchPointInRegion1 ( RX10_TEMP187 , i2 ) ; 
const int32_t RX10_TEMP189 = 0 ; 
const uint32_t RX10_TEMP190 = RX10_TEMP188 < RX10_TEMP189 ; 
if ( RX10_TEMP190 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP191 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP191 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP192 = getPlaceFromDist1 ( RX10_TEMP186 , RX10_TEMP188 ) ; 
const place_t RX10_TEMP194 = /* here  */ _here(); 
const uint32_t RX10_TEMP195 = RX10_TEMP192 != RX10_TEMP194 ; 
if ( RX10_TEMP195 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP193 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP193 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP188 , X10_TEMP275 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP277 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP196 = i2 .f0 ; 
RX10_TEMP196 = RX10_TEMP196 + X10_TEMP277 ; struct Point1 X10_TEMP279  ; 
Point1_Point1( &X10_TEMP279/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP196 ) ; 
i2 = X10_TEMP279 ; const char /**/X10_TEMP282 = ( char) ( char) x3 ; 
const char /**/X10_TEMP283 = ( char) X10_TEMP282 ; 
struct Dist1 RX10_TEMP197 = text2 .distValue ; 
struct Region1 RX10_TEMP198 = RX10_TEMP197 .dReg ; 
const int32_t RX10_TEMP199 = searchPointInRegion1 ( RX10_TEMP198 , i2 ) ; 
const int32_t RX10_TEMP200 = 0 ; 
const uint32_t RX10_TEMP201 = RX10_TEMP199 < RX10_TEMP200 ; 
if ( RX10_TEMP201 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP202 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP202 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP203 = getPlaceFromDist1 ( RX10_TEMP197 , RX10_TEMP199 ) ; 
const place_t RX10_TEMP205 = /* here  */ _here(); 
const uint32_t RX10_TEMP206 = RX10_TEMP203 != RX10_TEMP205 ; 
if ( RX10_TEMP206 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP204 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP204 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP199 , X10_TEMP283 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP285 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP207 = i2 .f0 ; 
RX10_TEMP207 = RX10_TEMP207 + X10_TEMP285 ; struct Point1 X10_TEMP287  ; 
Point1_Point1( &X10_TEMP287/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP207 ) ; 
i2 = X10_TEMP287 ; const int32_t X10_TEMP289 = 8 ; 
const int32_t X10_TEMP291 = (((x3 >> X10_TEMP289) ) & ((2147483647 >> X10_TEMP289))); 
const char /**/X10_TEMP293 = ( char) ( char) X10_TEMP291 ; 
const char /**/X10_TEMP294 = ( char) X10_TEMP293 ; 
struct Dist1 RX10_TEMP208 = text2 .distValue ; 
struct Region1 RX10_TEMP209 = RX10_TEMP208 .dReg ; 
const int32_t RX10_TEMP210 = searchPointInRegion1 ( RX10_TEMP209 , i2 ) ; 
const int32_t RX10_TEMP211 = 0 ; 
const uint32_t RX10_TEMP212 = RX10_TEMP210 < RX10_TEMP211 ; 
if ( RX10_TEMP212 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP213 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP213 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP214 = getPlaceFromDist1 ( RX10_TEMP208 , RX10_TEMP210 ) ; 
const place_t RX10_TEMP216 = /* here  */ _here(); 
const uint32_t RX10_TEMP217 = RX10_TEMP214 != RX10_TEMP216 ; 
if ( RX10_TEMP217 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP215 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP215 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP210 , X10_TEMP294 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP296 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP218 = i2 .f0 ; 
RX10_TEMP218 = RX10_TEMP218 + X10_TEMP296 ; struct Point1 X10_TEMP298  ; 
Point1_Point1( &X10_TEMP298/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP218 ) ; 
i2 = X10_TEMP298 ; const char /**/X10_TEMP301 = ( char) ( char) x2 ; 
const char /**/X10_TEMP302 = ( char) X10_TEMP301 ; 
struct Dist1 RX10_TEMP219 = text2 .distValue ; 
struct Region1 RX10_TEMP220 = RX10_TEMP219 .dReg ; 
const int32_t RX10_TEMP221 = searchPointInRegion1 ( RX10_TEMP220 , i2 ) ; 
const int32_t RX10_TEMP222 = 0 ; 
const uint32_t RX10_TEMP223 = RX10_TEMP221 < RX10_TEMP222 ; 
if ( RX10_TEMP223 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP224 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP224 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP225 = getPlaceFromDist1 ( RX10_TEMP219 , RX10_TEMP221 ) ; 
const place_t RX10_TEMP227 = /* here  */ _here(); 
const uint32_t RX10_TEMP228 = RX10_TEMP225 != RX10_TEMP227 ; 
if ( RX10_TEMP228 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP226 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP226 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP221 , X10_TEMP302 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP304 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP229 = i2 .f0 ; 
RX10_TEMP229 = RX10_TEMP229 + X10_TEMP304 ; struct Point1 X10_TEMP306  ; 
Point1_Point1( &X10_TEMP306/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP229 ) ; 
i2 = X10_TEMP306 ; const int32_t X10_TEMP308 = 8 ; 
const int32_t X10_TEMP310 = (((x2 >> X10_TEMP308) ) & ((2147483647 >> X10_TEMP308))); 
const char /**/X10_TEMP312 = ( char) ( char) X10_TEMP310 ; 
const char /**/X10_TEMP313 = ( char) X10_TEMP312 ; 
struct Dist1 RX10_TEMP230 = text2 .distValue ; 
struct Region1 RX10_TEMP231 = RX10_TEMP230 .dReg ; 
const int32_t RX10_TEMP232 = searchPointInRegion1 ( RX10_TEMP231 , i2 ) ; 
const int32_t RX10_TEMP233 = 0 ; 
const uint32_t RX10_TEMP234 = RX10_TEMP232 < RX10_TEMP233 ; 
if ( RX10_TEMP234 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP235 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP235 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP236 = getPlaceFromDist1 ( RX10_TEMP230 , RX10_TEMP232 ) ; 
const place_t RX10_TEMP238 = /* here  */ _here(); 
const uint32_t RX10_TEMP239 = RX10_TEMP236 != RX10_TEMP238 ; 
if ( RX10_TEMP239 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP237 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP237 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP232 , X10_TEMP313 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP315 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP240 = i2 .f0 ; 
RX10_TEMP240 = RX10_TEMP240 + X10_TEMP315 ; struct Point1 X10_TEMP317  ; 
Point1_Point1( &X10_TEMP317/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP240 ) ; 
i2 = X10_TEMP317 ; const char /**/X10_TEMP320 = ( char) ( char) x4 ; 
const char /**/X10_TEMP321 = ( char) X10_TEMP320 ; 
struct Dist1 RX10_TEMP241 = text2 .distValue ; 
struct Region1 RX10_TEMP242 = RX10_TEMP241 .dReg ; 
const int32_t RX10_TEMP243 = searchPointInRegion1 ( RX10_TEMP242 , i2 ) ; 
const int32_t RX10_TEMP244 = 0 ; 
const uint32_t RX10_TEMP245 = RX10_TEMP243 < RX10_TEMP244 ; 
if ( RX10_TEMP245 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP246 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP246 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP247 = getPlaceFromDist1 ( RX10_TEMP241 , RX10_TEMP243 ) ; 
const place_t RX10_TEMP249 = /* here  */ _here(); 
const uint32_t RX10_TEMP250 = RX10_TEMP247 != RX10_TEMP249 ; 
if ( RX10_TEMP250 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP248 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP248 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP243 , X10_TEMP321 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP323 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP251 = i2 .f0 ; 
RX10_TEMP251 = RX10_TEMP251 + X10_TEMP323 ; struct Point1 X10_TEMP325  ; 
Point1_Point1( &X10_TEMP325/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP251 ) ; 
i2 = X10_TEMP325 ; const int32_t X10_TEMP327 = 8 ; 
const int32_t X10_TEMP329 = (((x4 >> X10_TEMP327) ) & ((2147483647 >> X10_TEMP327))); 
const char /**/X10_TEMP331 = ( char) ( char) X10_TEMP329 ; 
const char /**/X10_TEMP332 = ( char) X10_TEMP331 ; 
struct Dist1 RX10_TEMP252 = text2 .distValue ; 
struct Region1 RX10_TEMP253 = RX10_TEMP252 .dReg ; 
const int32_t RX10_TEMP254 = searchPointInRegion1 ( RX10_TEMP253 , i2 ) ; 
const int32_t RX10_TEMP255 = 0 ; 
const uint32_t RX10_TEMP256 = RX10_TEMP254 < RX10_TEMP255 ; 
if ( RX10_TEMP256 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP257 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP257 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP258 = getPlaceFromDist1 ( RX10_TEMP252 , RX10_TEMP254 ) ; 
const place_t RX10_TEMP260 = /* here  */ _here(); 
const uint32_t RX10_TEMP261 = RX10_TEMP258 != RX10_TEMP260 ; 
if ( RX10_TEMP261 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP259 = "Bad place access for array text2" ; 
fprintf(stderr, "%s",RX10_TEMP259 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1byte ( text2 , RX10_TEMP254 , X10_TEMP332 ) ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP334 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP262 = i2 .f0 ; 
RX10_TEMP262 = RX10_TEMP262 + X10_TEMP334 ; struct Point1 X10_TEMP336  ; 
Point1_Point1( &X10_TEMP336/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP262 ) ; 
i2 = X10_TEMP336 ; } 

} 

} 

int32_t /*static*/IDEATest_mul (  struct IDEATest  * const X10_TEMP0 , const int32_t aa , const int32_t ab ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t a = aa ; 
/*UpdatableVariableDeclaration*/
int32_t b = ab ; 
/*UpdatableVariableDeclaration*/
int64_t p = 0L ; 
const int32_t X10_TEMP4 = 0 ; 
const uint32_t X10_TEMP6 = a != X10_TEMP4 ; 
if ( X10_TEMP6 ) 
{ 
const int32_t X10_TEMP7 = 0 ; 
const uint32_t X10_TEMP9 = b != X10_TEMP7 ; 
if ( X10_TEMP9 ) 
{ 
const int64_t X10_TEMP10 = /*casting*/( int64_t ) a ; 
const int64_t X10_TEMP12 = X10_TEMP10 * b ; 
p = X10_TEMP12 ; const int32_t X10_TEMP13 = /*casting*/( int32_t ) p ; 
const int32_t X10_TEMP14 = 0xFFFF ; 
const int32_t X10_TEMP16 = X10_TEMP13 & X10_TEMP14 ; 
b = X10_TEMP16 ; const int32_t X10_TEMP17 = /*casting*/( int32_t ) p ; 
const int32_t X10_TEMP18 = 16 ; 
const int32_t X10_TEMP20 = (((X10_TEMP17 >> X10_TEMP18) ) & ((2147483647 >> X10_TEMP18))); 
a = X10_TEMP20 ; const int32_t X10_TEMP27 = b - a ; 
const uint32_t X10_TEMP21 = b < a ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP24 = 0 ; 
if ( X10_TEMP21 ) 
{ 
X10_TEMP24 = 1 ; } 

const int32_t X10_TEMP25 = X10_TEMP24 ; 
const int32_t X10_TEMP26 = X10_TEMP25 ; 
const int32_t X10_TEMP28 = X10_TEMP27 + X10_TEMP26 ; 
const int32_t X10_TEMP29 = 0xFFFF ; 
const int32_t X10_TEMP31 = X10_TEMP28 & X10_TEMP29 ; 
return X10_TEMP31 ; 
} 
else 
{ 
const int32_t X10_TEMP33 = 1 ; 
const int32_t X10_TEMP35 = X10_TEMP33 - a ; 
const int32_t X10_TEMP36 = 0xFFFF ; 
const int32_t X10_TEMP38 = X10_TEMP35 & X10_TEMP36 ; 
return X10_TEMP38 ; 
} 


} 
else 
{ 
const int32_t X10_TEMP40 = 1 ; 
const int32_t X10_TEMP42 = X10_TEMP40 - b ; 
const int32_t X10_TEMP43 = 0xFFFF ; 
const int32_t X10_TEMP45 = X10_TEMP42 & X10_TEMP43 ; 
return X10_TEMP45 ; 
} 


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
void * TEMPCALLOCPOINTER16;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER16 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER16)[0] = tempReg, TEMPCALLOCPOINTER16 = ((int32_t * )TEMPCALLOCPOINTER16)+1, memset(TEMPCALLOCPOINTER16,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER17;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER17 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER17)[0] = tempDist, TEMPCALLOCPOINTER17 = ((int32_t * )TEMPCALLOCPOINTER17)+1, memset(TEMPCALLOCPOINTER17,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER18;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER18 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER18)[0] = tempReg, TEMPCALLOCPOINTER18 = ((int32_t * )TEMPCALLOCPOINTER18)+1, memset(TEMPCALLOCPOINTER18,0,tempReg*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER22;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER22 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER22)[0] = tempReg, TEMPCALLOCPOINTER22 = ((int32_t * )TEMPCALLOCPOINTER22)+1, memset(TEMPCALLOCPOINTER22,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER23;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER23 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER23)[0] = tempDist, TEMPCALLOCPOINTER23 = ((int32_t * )TEMPCALLOCPOINTER23)+1, memset(TEMPCALLOCPOINTER23,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER24;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER24 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER24)[0] = tempReg, TEMPCALLOCPOINTER24 = ((int32_t * )TEMPCALLOCPOINTER24)+1, memset(TEMPCALLOCPOINTER24,0,tempReg*sizeof(Point1 )) ); 

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

char * /*static*/toStringPoint1 (  struct Point1 const p ) 
{ 
/*UpdatableVariableDeclaration*/
char * str = "" ; 
const int32_t f0 = p .f0 ; 
/*UpdatableVariableDeclaration*/
char * lSq = "[" ; 
/*UpdatableVariableDeclaration*/
char * rSq = "]" ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC3, "%s%s",str,lSq);
str = tempC3;/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC4, "%s%d",str,f0);
str = tempC4;/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC5, "%s%s",str,rSq);
str = tempC5;return str ; 
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
void * TEMPCALLOCPOINTER26;
/*Updatable ARRAY*/ place_t * const placeArray = (/*Updatable ARRAY*/ place_t * ) ( TEMPCALLOCPOINTER26 = malloc(sizeof(int32_t)+(dDist*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dDist*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER26)[0] = dDist, TEMPCALLOCPOINTER26 = ((int32_t * )TEMPCALLOCPOINTER26)+1, memset(TEMPCALLOCPOINTER26,0,dDist*sizeof(place_t ) ) ); 
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
void * TEMPCALLOCPOINTER27;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER27 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER27)[0] = dReg, TEMPCALLOCPOINTER27 = ((int32_t * )TEMPCALLOCPOINTER27)+1, memset(TEMPCALLOCPOINTER27,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER28;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER28 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER28)[0] = dReg, TEMPCALLOCPOINTER28 = ((int32_t * )TEMPCALLOCPOINTER28)+1, memset(TEMPCALLOCPOINTER28,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER32;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER32 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(placeRegion*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER32)[0] = placeRegion, TEMPCALLOCPOINTER32 = ((int32_t * )TEMPCALLOCPOINTER32)+1, memset(TEMPCALLOCPOINTER32,0,placeRegion*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(pointRegion*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER33)[0] = pointRegion, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,pointRegion*sizeof(Point1 )) ); 

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

void /*static*/setRefArrayValue1byte (  struct byteRefArray1 const array , const int32_t index , const char /**/val ) 
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
/*VALUE ARRAY*/ struct byteStub * const contents = array .contents ; 
struct byteStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ char /**/* const localArray = indexStub .localArray ; 
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

char /**//*static*/getRefArrayValue1byte (  struct byteRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct byteStub * const contents = array .contents ; 
struct byteStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ char /**/* const localArray = indexStub .localArray ; 
const char /**/returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) 
{ 
const int32_t rSize = r .regSize ; 
const int32_t one = 1 ; 
const int32_t rSizeMinusOne = rSize - one ; 
const int32_t dReg = rSizeMinusOne + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER46;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER46 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(dReg*sizeof( place_t )),((int32_t * )TEMPCALLOCPOINTER46)[0] = dReg, TEMPCALLOCPOINTER46 = ((int32_t * )TEMPCALLOCPOINTER46)+1, memset(TEMPCALLOCPOINTER46,0,dReg*sizeof(place_t )) ); 

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

/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) 
{ 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER50;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER50 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(tempReg*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER50)[0] = tempReg, TEMPCALLOCPOINTER50 = ((int32_t * )TEMPCALLOCPOINTER50)+1, memset(TEMPCALLOCPOINTER50,0,tempReg*sizeof(int32_t )) ); 

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
void * TEMPCALLOCPOINTER51;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER51 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER51)[0] = regArr, TEMPCALLOCPOINTER51 = ((int32_t * )TEMPCALLOCPOINTER51)+1, memset(TEMPCALLOCPOINTER51,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER52;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER52 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER52)[0] = regArr, TEMPCALLOCPOINTER52 = ((int32_t * )TEMPCALLOCPOINTER52)+1, memset(TEMPCALLOCPOINTER52,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER53;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER53 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(regArr*sizeof( Point1 )),((int32_t * )TEMPCALLOCPOINTER53)[0] = regArr, TEMPCALLOCPOINTER53 = ((int32_t * )TEMPCALLOCPOINTER53)+1, memset(TEMPCALLOCPOINTER53,0,regArr*sizeof(Point1 )) ); 

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
struct Point1 pt = utmpz .pt ; 
struct byteRefArray1 p2 = utmpz .p2 ; 
struct byteRefArray1 c1 = utmpz .c1 ; 
struct byteRefArray1 p1 = utmpz .p1 ; 

{ 
struct Dist1 RX10_TEMP13 = p1 .distValue ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
const int32_t RX10_TEMP15 = searchPointInRegion1 ( RX10_TEMP14 , pt ) ; 
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
char * RX10_TEMP20 = "Bad place access for array p1" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP23 = getRefArrayValue1byte ( p1 , RX10_TEMP15 ) ; 
const char /**/X10_TEMP10 = ( char) RX10_TEMP23 ; 
struct Dist1 RX10_TEMP24 = p2 .distValue ; 
struct Region1 RX10_TEMP25 = RX10_TEMP24 .dReg ; 
const int32_t RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , pt ) ; 
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
char * RX10_TEMP31 = "Bad place access for array p2" ; 
fprintf(stderr, "%s",RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP34 = getRefArrayValue1byte ( p2 , RX10_TEMP26 ) ; 
const char /**/X10_TEMP11 = ( char) RX10_TEMP34 ; 
const uint32_t X10_TEMP13 = X10_TEMP10 != X10_TEMP11 ; 
if ( X10_TEMP13 ) 
{ 
const char * X10_TEMP15 = "Validation failed" ; 
fprintf(  stdout, "%s\n",X10_TEMP15 ) ; 
const char * X10_TEMP16 = "Original Byte " ; 
const char * RX10_TEMP35 = toStringPoint1 ( pt ) ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC6, "%s%s",X10_TEMP16,RX10_TEMP35);
const char * X10_TEMP17 = tempC6;; 
const char * X10_TEMP18 = " = " ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC7, "%s%s",X10_TEMP17,X10_TEMP18);
const char * X10_TEMP20 = tempC7;; 
struct Dist1 RX10_TEMP36 = p1 .distValue ; 
struct Region1 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int32_t RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , pt ) ; 
const int32_t RX10_TEMP39 = 0 ; 
const uint32_t RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP41 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP42 = getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const place_t RX10_TEMP44 = /* here  */ _here(); 
const uint32_t RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Bad place access for array p1" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP46 = getRefArrayValue1byte ( p1 , RX10_TEMP38 ) ; 
const char /**/X10_TEMP21 = ( char) RX10_TEMP46 ; 
/*ASSIGNMENT STRING*/
 char * tempC8 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC8, "%s%d",X10_TEMP20,X10_TEMP21);
const char * X10_TEMP23 = tempC8;; 
fprintf(  stdout, "%s\n",X10_TEMP23 ) ; 
const char * X10_TEMP24 = "Encrypted Byte " ; 
const char * RX10_TEMP47 = toStringPoint1 ( pt ) ; 
/*ASSIGNMENT STRING*/
 char * tempC9 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC9, "%s%s",X10_TEMP24,RX10_TEMP47);
const char * X10_TEMP25 = tempC9;; 
const char * X10_TEMP26 = " = " ; 
/*ASSIGNMENT STRING*/
 char * tempC10 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC10, "%s%s",X10_TEMP25,X10_TEMP26);
const char * X10_TEMP28 = tempC10;; 
struct Dist1 RX10_TEMP48 = c1 .distValue ; 
struct Region1 RX10_TEMP49 = RX10_TEMP48 .dReg ; 
const int32_t RX10_TEMP50 = searchPointInRegion1 ( RX10_TEMP49 , pt ) ; 
const int32_t RX10_TEMP51 = 0 ; 
const uint32_t RX10_TEMP52 = RX10_TEMP50 < RX10_TEMP51 ; 
if ( RX10_TEMP52 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP53 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP54 = getPlaceFromDist1 ( RX10_TEMP48 , RX10_TEMP50 ) ; 
const place_t RX10_TEMP56 = /* here  */ _here(); 
const uint32_t RX10_TEMP57 = RX10_TEMP54 != RX10_TEMP56 ; 
if ( RX10_TEMP57 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP55 = "Bad place access for array c1" ; 
fprintf(stderr, "%s",RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP58 = getRefArrayValue1byte ( c1 , RX10_TEMP50 ) ; 
const char /**/X10_TEMP29 = ( char) RX10_TEMP58 ; 
/*ASSIGNMENT STRING*/
 char * tempC11 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC11, "%s%d",X10_TEMP28,X10_TEMP29);
const char * X10_TEMP31 = tempC11;; 
fprintf(  stdout, "%s\n",X10_TEMP31 ) ; 
const char * X10_TEMP32 = "Decrypted Byte " ; 
const char * RX10_TEMP59 = toStringPoint1 ( pt ) ; 
/*ASSIGNMENT STRING*/
 char * tempC12 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC12, "%s%s",X10_TEMP32,RX10_TEMP59);
const char * X10_TEMP33 = tempC12;; 
const char * X10_TEMP34 = " = " ; 
/*ASSIGNMENT STRING*/
 char * tempC13 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC13, "%s%s",X10_TEMP33,X10_TEMP34);
const char * X10_TEMP36 = tempC13;; 
struct Dist1 RX10_TEMP60 = p2 .distValue ; 
struct Region1 RX10_TEMP61 = RX10_TEMP60 .dReg ; 
const int32_t RX10_TEMP62 = searchPointInRegion1 ( RX10_TEMP61 , pt ) ; 
const int32_t RX10_TEMP63 = 0 ; 
const uint32_t RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63 ; 
if ( RX10_TEMP64 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP65 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP65 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP66 = getPlaceFromDist1 ( RX10_TEMP60 , RX10_TEMP62 ) ; 
const place_t RX10_TEMP68 = /* here  */ _here(); 
const uint32_t RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68 ; 
if ( RX10_TEMP69 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP67 = "Bad place access for array p2" ; 
fprintf(stderr, "%s",RX10_TEMP67 ) ; 
exit(EXIT_FAILURE);
} 

const char /**/RX10_TEMP70 = getRefArrayValue1byte ( p2 , RX10_TEMP62 ) ; 
const char /**/X10_TEMP37 = ( char) RX10_TEMP70 ; 
/*ASSIGNMENT STRING*/
 char * tempC14 = (char *)malloc(1000 * sizeof(char));
(((_task*)_thread_getspecific()) -> total_memory) +=  1000 * sizeof(char);
sprintf(tempC14, "%s%d",X10_TEMP36,X10_TEMP37);
const char * X10_TEMP39 = tempC14;; 
fprintf(  stdout, "%s\n",X10_TEMP39 ) ; 
const char * X10_TEMP41 = "Validation failed" ; 
fprintf(stderr, "%s",X10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
struct intValArray1 fdkr = utmpz .fdkr ; 
struct intValArray1 fzr = utmpz .fzr ; 
struct byteRefArray1 p2 = utmpz .p2 ; 
struct byteRefArray1 c1 = utmpz .c1 ; 
struct byteRefArray1 p1 = utmpz .p1 ; 
struct IDEATest * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 
IDEATest_cipher_idea ( X10_TEMP0 , p1 , c1 , fzr ) ; 
IDEATest_cipher_idea ( X10_TEMP0 , c1 , p2 , fdkr ) ; 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS,  struct Point1 const a_pt ,  struct byteRefArray1 const a_p2 ,  struct byteRefArray1 const a_c1 ,  struct byteRefArray1 const a_p1 ) 
{ 
T1THIS->pt = ( a_pt ) ; 
T1THIS->p2 = ( a_p2 ) ; 
T1THIS->c1 = ( a_c1 ) ; 
T1THIS->p1 = ( a_p1 ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS,  struct intValArray1 const a_fdkr ,  struct intValArray1 const a_fzr ,  struct byteRefArray1 const a_p2 ,  struct byteRefArray1 const a_c1 ,  struct byteRefArray1 const a_p1 ,  struct IDEATest  * const a_X10_TEMP0 ) 
{ 
T2THIS->fdkr = ( a_fdkr ) ; 
T2THIS->fzr = ( a_fzr ) ; 
T2THIS->p2 = ( a_p2 ) ; 
T2THIS->c1 = ( a_c1 ) ; 
T2THIS->p1 = ( a_p1 ) ; 
T2THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP14 , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP6 ) 
{ 
T3THIS->RX10_TEMP14 = ( a_RX10_TEMP14 ) ; 
T3THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T3THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T3THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T3THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T3THIS->THIS = *IDEATestTHIS;
 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, struct IDEATest * IDEATestTHIS /*this*/ , const int32_t a_RX10_TEMP36 , const place_t a_RX10_TEMP32 , const int32_t a_RX10_TEMP31 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP30 ) 
{ 
T4THIS->RX10_TEMP36 = ( a_RX10_TEMP36 ) ; 
T4THIS->RX10_TEMP32 = ( a_RX10_TEMP32 ) ; 
T4THIS->RX10_TEMP31 = ( a_RX10_TEMP31 ) ; 
T4THIS->RX10_TEMP30 = ( a_RX10_TEMP30 ) ; 
T4THIS->THIS = *IDEATestTHIS;
 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, struct IDEATest * IDEATestTHIS /*this*/ , const int32_t a_RX10_TEMP56 , const place_t a_RX10_TEMP52 , const int32_t a_RX10_TEMP51 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP50 ) 
{ 
T5THIS->RX10_TEMP56 = ( a_RX10_TEMP56 ) ; 
T5THIS->RX10_TEMP52 = ( a_RX10_TEMP52 ) ; 
T5THIS->RX10_TEMP51 = ( a_RX10_TEMP51 ) ; 
T5THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T5THIS->THIS = *IDEATestTHIS;
 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS, struct IDEATest * IDEATestTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T6THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T6THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T6THIS->THIS = *IDEATestTHIS;
 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, struct IDEATest * IDEATestTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T7THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T7THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T7THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T7THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T7THIS->THIS = *IDEATestTHIS;
 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct IDEATest * IDEATestTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T8THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T8THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T8THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T8THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T8THIS->THIS = *IDEATestTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T9THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T9THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T9THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T9THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T9THIS->THIS = *TimerTHIS;
 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T10THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T10THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T10THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T10THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T10THIS->THIS = *TimerTHIS;
 return  *T10THIS; 

} 

T11 T11_T11 ( struct T11 *T11THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T11THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T11THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T11THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T11THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T11THIS->THIS = *TimerTHIS;
 return  *T11THIS; 

} 

T12 T12_T12 ( struct T12 *T12THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct byteStub const a_RX10_TEMP19 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP6 ) 
{ 
T12THIS->RX10_TEMP19 = ( a_RX10_TEMP19 ) ; 
T12THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T12THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T12THIS->THIS = *IDEATestTHIS;
 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct byteStub const a_RX10_TEMP39 , const int32_t a_RX10_TEMP31 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP30 ) 
{ 
T13THIS->RX10_TEMP39 = ( a_RX10_TEMP39 ) ; 
T13THIS->RX10_TEMP31 = ( a_RX10_TEMP31 ) ; 
T13THIS->RX10_TEMP30 = ( a_RX10_TEMP30 ) ; 
T13THIS->THIS = *IDEATestTHIS;
 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct byteStub const a_RX10_TEMP59 , const int32_t a_RX10_TEMP51 , /*Updatable ARRAY*/ struct byteStub * const a_RX10_TEMP50 ) 
{ 
T14THIS->RX10_TEMP59 = ( a_RX10_TEMP59 ) ; 
T14THIS->RX10_TEMP51 = ( a_RX10_TEMP51 ) ; 
T14THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T14THIS->THIS = *IDEATestTHIS;
 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T15THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T15THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T15THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T15THIS->THIS = *IDEATestTHIS;
 return  *T15THIS; 

} 

T16 T16_T16 ( struct T16 *T16THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T16THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T16THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T16THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T16THIS->THIS = *IDEATestTHIS;
 return  *T16THIS; 

} 

T17 T17_T17 ( struct T17 *T17THIS, struct IDEATest * IDEATestTHIS /*this*/ ,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) 
{ 
T17THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T17THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T17THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T17THIS->THIS = *IDEATestTHIS;
 return  *T17THIS; 

} 

T18 T18_T18 ( struct T18 *T18THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T18THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T18THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T18THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T18THIS->THIS = *TimerTHIS;
 return  *T18THIS; 

} 

T19 T19_T19 ( struct T19 *T19THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T19THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T19THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T19THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T19THIS->THIS = *TimerTHIS;
 return  *T19THIS; 

} 

T20 T20_T20 ( struct T20 *T20THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T20THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T20THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T20THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T20THIS->THIS = *TimerTHIS;
 return  *T20THIS; 

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
void * TEMPCALLOCPOINTER54;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER54 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER54)[0] = RX10_TEMP5, TEMPCALLOCPOINTER54 = ((int32_t * )TEMPCALLOCPOINTER54)+1, memset(TEMPCALLOCPOINTER54,0,RX10_TEMP5*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC2) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER55;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER55 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER55)[0] = RX10_TEMP4, TEMPCALLOCPOINTER55 = ((int32_t * )TEMPCALLOCPOINTER55)+1, memset(TEMPCALLOCPOINTER55,0,RX10_TEMP4*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER56;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER56 = malloc(sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP26*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER56)[0] = RX10_TEMP26, TEMPCALLOCPOINTER56 = ((int32_t * )TEMPCALLOCPOINTER56)+1, memset(TEMPCALLOCPOINTER56,0,RX10_TEMP26*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP28= 0; RX10_TEMP28<  RX10_TEMP25; RX10_TEMP28++ )
 
{ 
const place_t RX10_TEMP29 = /* here  */ _here(); 
const int32_t RX10_TEMP30 = /*PointAccess*/RX10_TEMP28 ; 
const place_t RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ _toplace(RX10_TEMP30 ); 
const int32_t RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int32_t RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC3) ;
a.size = sizeof(utmp10 );
a.params = (void *)(&utmp10 );
task_dispatch(a, RX10_TEMP31 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER57;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP38 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER57 = malloc(sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP25*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER57)[0] = RX10_TEMP25, TEMPCALLOCPOINTER57 = ((int32_t * )TEMPCALLOCPOINTER57)+1, memset(TEMPCALLOCPOINTER57,0,RX10_TEMP25*sizeof(doubleStub )) ); 

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
void * TEMPCALLOCPOINTER58;
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (/*Updatable ARRAY*/ struct doubleStub * ) ( TEMPCALLOCPOINTER58 = malloc(sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP47*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER58)[0] = RX10_TEMP47, TEMPCALLOCPOINTER58 = ((int32_t * )TEMPCALLOCPOINTER58)+1, memset(TEMPCALLOCPOINTER58,0,RX10_TEMP47*sizeof(doubleStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP49= 0; RX10_TEMP49<  RX10_TEMP46; RX10_TEMP49++ )
 
{ 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const int32_t RX10_TEMP51 = /*PointAccess*/RX10_TEMP49 ; 
const place_t RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ _toplace(RX10_TEMP51 ); 
const int32_t RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int32_t RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC4) ;
a.size = sizeof(utmp11 );
a.params = (void *)(&utmp11 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER59;
/*VALUE ARRAY*/ struct doubleStub * const RX10_TEMP59 = (/*VALUE ARRAY*/ struct doubleStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER59 = malloc(sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP46*sizeof( doubleStub )),((int32_t * )TEMPCALLOCPOINTER59)[0] = RX10_TEMP46, TEMPCALLOCPOINTER59 = ((int32_t * )TEMPCALLOCPOINTER59)+1, memset(TEMPCALLOCPOINTER59,0,RX10_TEMP46*sizeof(doubleStub )) ); 

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

void thread9 ( struct Timer *TimerTHIS,  struct T9 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER61;
/*Updatable ARRAY*/ double * const RX10_TEMP15 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER61 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP14*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER61)[0] = RX10_TEMP14, TEMPCALLOCPOINTER61 = ((int32_t * )TEMPCALLOCPOINTER61)+1, memset(TEMPCALLOCPOINTER61,0,RX10_TEMP14*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 
const double X10_TEMP9 = 0 ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP9 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T18 utmp18  ; 
T18_T18( &utmp18/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC5) ;
a.size = sizeof(utmp18 );
a.params = (void *)(&utmp18 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) 
{ 
const int32_t RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const place_t RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int32_t RX10_TEMP35 = /*SimpleDistributionExpression*/ RX10_TEMP33 +1; 
void * TEMPCALLOCPOINTER63;
/*Updatable ARRAY*/ double * const RX10_TEMP36 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER63 = malloc(sizeof(int32_t)+(RX10_TEMP35*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP35*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER63)[0] = RX10_TEMP35, TEMPCALLOCPOINTER63 = ((int32_t * )TEMPCALLOCPOINTER63)+1, memset(TEMPCALLOCPOINTER63,0,RX10_TEMP35*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP34 = 0;RX10_TEMP34 < RX10_TEMP35; RX10_TEMP34++) 

{ 
const double X10_TEMP13 = 0 ; 
RX10_TEMP36[RX10_TEMP34] = X10_TEMP13 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T19 utmp19  ; 
T19_T19( &utmp19/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC6) ;
a.size = sizeof(utmp19 );
a.params = (void *)(&utmp19 );
task_dispatch(a, RX10_TEMP29 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread11 ( struct Timer *TimerTHIS,  struct T11 const utmpz ) 
{ 
const int32_t RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const place_t RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int32_t RX10_TEMP56 = /*SimpleDistributionExpression*/ RX10_TEMP54 +1; 
void * TEMPCALLOCPOINTER65;
/*Updatable ARRAY*/ double * const RX10_TEMP57 = (/*Updatable ARRAY*/ double * ) ( TEMPCALLOCPOINTER65 = malloc(sizeof(int32_t)+(RX10_TEMP56*sizeof( double ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP56*sizeof( double )),((int32_t * )TEMPCALLOCPOINTER65)[0] = RX10_TEMP56, TEMPCALLOCPOINTER65 = ((int32_t * )TEMPCALLOCPOINTER65)+1, memset(TEMPCALLOCPOINTER65,0,RX10_TEMP56*sizeof(double ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP55 = 0;RX10_TEMP55 < RX10_TEMP56; RX10_TEMP55++) 

{ 
const double X10_TEMP17 = 0 ; 
RX10_TEMP57[RX10_TEMP55] = X10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T20 utmp20  ; 
T20_T20( &utmp20/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC7) ;
a.size = sizeof(utmp20 );
a.params = (void *)(&utmp20 );
task_dispatch(a, RX10_TEMP50 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread18 ( struct Timer *TimerTHIS,  struct T18 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 

void thread19 ( struct Timer *TimerTHIS,  struct T19 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int32_t RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; 
} 
} 

void thread20 ( struct Timer *TimerTHIS,  struct T20 const utmpz ) 
{ 
struct doubleStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int32_t RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; 
} 
} 


byteStub byteStub_byteStub ( struct byteStub *byteStubTHIS, /*Updatable ARRAY*/ char /**/* const localArray_ ) 
{ 
byteStubTHIS->localArray = ( localArray_ ) ; 

 return  *byteStubTHIS; 

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
void * TEMPCALLOCPOINTER69;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER69 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(countDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER69)[0] = countDist, TEMPCALLOCPOINTER69 = ((int32_t * )TEMPCALLOCPOINTER69)+1, memset(TEMPCALLOCPOINTER69,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER70;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER70 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(runSumDist*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER70)[0] = runSumDist, TEMPCALLOCPOINTER70 = ((int32_t * )TEMPCALLOCPOINTER70)+1, memset(TEMPCALLOCPOINTER70,0,runSumDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER71;
/*VALUE ARRAY*/ int32_t * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

} 

IDEATest *IDEATest_IDEATest ( struct IDEATest *IDEATestTHIS) 
{ 
IDEATest_buildTestData ( IDEATestTHIS) ; 
const int32_t X10_TEMP6 = 0 ; 
const int32_t X10_TEMP3 = /*program*/_IDEATest_array_rows ; 
const int32_t X10_TEMP4 = 1 ; 
const int32_t X10_TEMP7 = X10_TEMP3 - X10_TEMP4 ; 
struct Region1 X10_TEMP9 = createNewRegion1R ( X10_TEMP6 , X10_TEMP7 ) ; 
struct Dist1 X10_TEMP10 = getBlockDist1 ( X10_TEMP9 ) ; 
struct Dist1 D = X10_TEMP10 ; 
struct Region1 RX10_TEMP0 = D .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER73;
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct byteStub * ) ( TEMPCALLOCPOINTER73 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER73)[0] = RX10_TEMP5, TEMPCALLOCPOINTER73 = ((int32_t * )TEMPCALLOCPOINTER73)+1, memset(TEMPCALLOCPOINTER73,0,RX10_TEMP5*sizeof(byteStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( D , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct Dist1 RX10_TEMP13 = restrictDist1 ( D , RX10_TEMP10 ) ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP14 , RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC8) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER74;
/*VALUE ARRAY*/ struct byteStub * const RX10_TEMP20 = (/*VALUE ARRAY*/ struct byteStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER74 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER74)[0] = RX10_TEMP4, TEMPCALLOCPOINTER74 = ((int32_t * )TEMPCALLOCPOINTER74)+1, memset(TEMPCALLOCPOINTER74,0,RX10_TEMP4*sizeof(byteStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP22 = 0;RX10_TEMP22 < RX10_TEMP4; RX10_TEMP22++) 

{ 
struct byteStub RX10_TEMP21 = RX10_TEMP6 [ RX10_TEMP22 ] 
; 
RX10_TEMP20[RX10_TEMP22] = RX10_TEMP21 ; 
} 
/*END OF ARRAY INIT*/struct byteRefArray1 RX10_TEMP23  ; 
byteRefArray1_byteRefArray1( &RX10_TEMP23/*OBJECT INIT IN ASSIGNMENT*/, D , RX10_TEMP20 ) ; 
struct byteRefArray1 X10_TEMP17 = RX10_TEMP23 ; 
IDEATestTHIS->plain1 = ( X10_TEMP17 ) ; 
struct Region1 RX10_TEMP24 = D .dReg ; 
const int32_t RX10_TEMP25 = 0 ; 
const int32_t RX10_TEMP26 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP27 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP27 = RX10_TEMP27 - RX10_TEMP26 ; const int32_t RX10_TEMP28 = RX10_TEMP27 + 1; 
const int32_t RX10_TEMP29 = /*SimpleDistributionExpression*/ RX10_TEMP27 +1; 
void * TEMPCALLOCPOINTER75;
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP30 = (/*Updatable ARRAY*/ struct byteStub * ) ( TEMPCALLOCPOINTER75 = malloc(sizeof(int32_t)+(RX10_TEMP29*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP29*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER75)[0] = RX10_TEMP29, TEMPCALLOCPOINTER75 = ((int32_t * )TEMPCALLOCPOINTER75)+1, memset(TEMPCALLOCPOINTER75,0,RX10_TEMP29*sizeof(byteStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP31= 0; RX10_TEMP31<  RX10_TEMP28; RX10_TEMP31++ )
 
{ 
const place_t RX10_TEMP32 = /* here  */ _here(); 
const int32_t RX10_TEMP33 = /*PointAccess*/RX10_TEMP31 ; 
const place_t RX10_TEMP34 = /* place.places ( RX10_TEMP33 )  */ _toplace(RX10_TEMP33 ); 
const int32_t RX10_TEMP35 = getDistLocalCount1 ( D , RX10_TEMP33 ) ; 
const int32_t RX10_TEMP36 = RX10_TEMP35 - RX10_TEMP26 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP36 , RX10_TEMP32 , RX10_TEMP31 , RX10_TEMP30 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC9) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP34 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER76;
/*VALUE ARRAY*/ struct byteStub * const RX10_TEMP40 = (/*VALUE ARRAY*/ struct byteStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER76 = malloc(sizeof(int32_t)+(RX10_TEMP28*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP28*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER76)[0] = RX10_TEMP28, TEMPCALLOCPOINTER76 = ((int32_t * )TEMPCALLOCPOINTER76)+1, memset(TEMPCALLOCPOINTER76,0,RX10_TEMP28*sizeof(byteStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP42 = 0;RX10_TEMP42 < RX10_TEMP28; RX10_TEMP42++) 

{ 
struct byteStub RX10_TEMP41 = RX10_TEMP30 [ RX10_TEMP42 ] 
; 
RX10_TEMP40[RX10_TEMP42] = RX10_TEMP41 ; 
} 
/*END OF ARRAY INIT*/struct byteRefArray1 RX10_TEMP43  ; 
byteRefArray1_byteRefArray1( &RX10_TEMP43/*OBJECT INIT IN ASSIGNMENT*/, D , RX10_TEMP40 ) ; 
struct byteRefArray1 X10_TEMP19 = RX10_TEMP43 ; 
IDEATestTHIS->crypt1 = ( X10_TEMP19 ) ; 
struct Region1 RX10_TEMP44 = D .dReg ; 
const int32_t RX10_TEMP45 = 0 ; 
const int32_t RX10_TEMP46 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP47 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP47 = RX10_TEMP47 - RX10_TEMP46 ; const int32_t RX10_TEMP48 = RX10_TEMP47 + 1; 
const int32_t RX10_TEMP49 = /*SimpleDistributionExpression*/ RX10_TEMP47 +1; 
void * TEMPCALLOCPOINTER77;
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP50 = (/*Updatable ARRAY*/ struct byteStub * ) ( TEMPCALLOCPOINTER77 = malloc(sizeof(int32_t)+(RX10_TEMP49*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP49*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER77)[0] = RX10_TEMP49, TEMPCALLOCPOINTER77 = ((int32_t * )TEMPCALLOCPOINTER77)+1, memset(TEMPCALLOCPOINTER77,0,RX10_TEMP49*sizeof(byteStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP51= 0; RX10_TEMP51<  RX10_TEMP48; RX10_TEMP51++ )
 
{ 
const place_t RX10_TEMP52 = /* here  */ _here(); 
const int32_t RX10_TEMP53 = /*PointAccess*/RX10_TEMP51 ; 
const place_t RX10_TEMP54 = /* place.places ( RX10_TEMP53 )  */ _toplace(RX10_TEMP53 ); 
const int32_t RX10_TEMP55 = getDistLocalCount1 ( D , RX10_TEMP53 ) ; 
const int32_t RX10_TEMP56 = RX10_TEMP55 - RX10_TEMP46 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP56 , RX10_TEMP52 , RX10_TEMP51 , RX10_TEMP50 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC10) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP54 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER78;
/*VALUE ARRAY*/ struct byteStub * const RX10_TEMP60 = (/*VALUE ARRAY*/ struct byteStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER78 = malloc(sizeof(int32_t)+(RX10_TEMP48*sizeof( byteStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP48*sizeof( byteStub )),((int32_t * )TEMPCALLOCPOINTER78)[0] = RX10_TEMP48, TEMPCALLOCPOINTER78 = ((int32_t * )TEMPCALLOCPOINTER78)+1, memset(TEMPCALLOCPOINTER78,0,RX10_TEMP48*sizeof(byteStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP62 = 0;RX10_TEMP62 < RX10_TEMP48; RX10_TEMP62++) 

{ 
struct byteStub RX10_TEMP61 = RX10_TEMP50 [ RX10_TEMP62 ] 
; 
RX10_TEMP60[RX10_TEMP62] = RX10_TEMP61 ; 
} 
/*END OF ARRAY INIT*/struct byteRefArray1 RX10_TEMP63  ; 
byteRefArray1_byteRefArray1( &RX10_TEMP63/*OBJECT INIT IN ASSIGNMENT*/, D , RX10_TEMP60 ) ; 
struct byteRefArray1 X10_TEMP21 = RX10_TEMP63 ; 
IDEATestTHIS->plain2 = ( X10_TEMP21 ) ; 

 return  IDEATestTHIS; 

} 

void IDEATest_buildTestData ( struct IDEATest *IDEATestTHIS) 
{ 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP2 = 136506717L ; 
struct Random * rndnum = (struct Random  *)  ((((_task*)_thread_getspecific()) -> total_memory) +=  sizeof(struct Random ),malloc(sizeof(struct Random )));  
Random_Random( rndnum/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP2 ) ; 
const int32_t X10_TEMP6 = 0 ; 
const int32_t X10_TEMP7 = 7 ; 
struct Region1 rUserKey = createNewRegion1R ( X10_TEMP6 , X10_TEMP7 ) ; 
const place_t X10_TEMP9 = /* here  */ _here(); 
struct Dist1 dUserKey = getPlaceDist1 ( rUserKey , X10_TEMP9 ) ; 
struct Region1 RX10_TEMP0 = dUserKey .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER79;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER79 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER79)[0] = RX10_TEMP5, TEMPCALLOCPOINTER79 = ((int32_t * )TEMPCALLOCPOINTER79)+1, memset(TEMPCALLOCPOINTER79,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dUserKey , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC11) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER80;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER80 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER80)[0] = RX10_TEMP4, TEMPCALLOCPOINTER80 = ((int32_t * )TEMPCALLOCPOINTER80)+1, memset(TEMPCALLOCPOINTER80,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dUserKey , RX10_TEMP16 ) ; 
struct intRefArray1 tUserKey = RX10_TEMP19 ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP21 = rUserKey .regSize ; 
RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23 ; const int32_t RX10_TEMP22 = RX10_TEMP21 + 1; 
for ( int32_t RX10_TEMP20= 0; RX10_TEMP20<  RX10_TEMP22; RX10_TEMP20++ )
 
{ 
const int32_t RX10_TEMP24 = /*PointAccess*/RX10_TEMP20 ; 
struct Point1 pt = regionOrdinalPoint1 ( rUserKey , RX10_TEMP24 ) ; 
const int32_t X10_TEMP14 = Random_nextInt ( rndnum ) ; 
const int32_t X10_TEMP16 = /*casting*/( int16_t ) X10_TEMP14 ; 
const int32_t X10_TEMP17 = X10_TEMP16 ; 
struct Dist1 RX10_TEMP25 = tUserKey .distValue ; 
struct Region1 RX10_TEMP26 = RX10_TEMP25 .dReg ; 
const int32_t RX10_TEMP27 = searchPointInRegion1 ( RX10_TEMP26 , pt ) ; 
const int32_t RX10_TEMP28 = 0 ; 
const uint32_t RX10_TEMP29 = RX10_TEMP27 < RX10_TEMP28 ; 
if ( RX10_TEMP29 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP30 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP31 = getPlaceFromDist1 ( RX10_TEMP25 , RX10_TEMP27 ) ; 
const place_t RX10_TEMP33 = /* here  */ _here(); 
const uint32_t RX10_TEMP34 = RX10_TEMP31 != RX10_TEMP33 ; 
if ( RX10_TEMP34 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP32 = "Bad place access for array tUserKey" ; 
fprintf(stderr, "%s",RX10_TEMP32 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( tUserKey , RX10_TEMP27 , X10_TEMP17 ) ; 
} 

struct Region1 RX10_TEMP35 = rUserKey ; 
const int32_t RX10_TEMP50 = rUserKey .regSize ; 
const int32_t RX10_TEMP51 = 1 ; 
const int32_t RX10_TEMP52 = RX10_TEMP50 - RX10_TEMP51 ; 
const int32_t RX10_TEMP49 = RX10_TEMP52 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER81;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP53 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER81 = malloc(sizeof(int32_t)+(RX10_TEMP49*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP49*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER81)[0] = RX10_TEMP49, TEMPCALLOCPOINTER81 = ((int32_t * )TEMPCALLOCPOINTER81)+1, memset(TEMPCALLOCPOINTER81,0,RX10_TEMP49*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP36 = 0;RX10_TEMP36 < RX10_TEMP49; RX10_TEMP36++) 

{ 
const int32_t RX10_TEMP37 = /*PointAccess*/RX10_TEMP36 ; 
struct Point1 pt = regionOrdinalPoint1 ( RX10_TEMP35 , RX10_TEMP37 ) ; 
struct Dist1 RX10_TEMP38 = tUserKey .distValue ; 
struct Region1 RX10_TEMP39 = RX10_TEMP38 .dReg ; 
const int32_t RX10_TEMP40 = searchPointInRegion1 ( RX10_TEMP39 , pt ) ; 
const int32_t RX10_TEMP41 = 0 ; 
const uint32_t RX10_TEMP42 = RX10_TEMP40 < RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP43 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP44 = getPlaceFromDist1 ( RX10_TEMP38 , RX10_TEMP40 ) ; 
const place_t RX10_TEMP46 = /* here  */ _here(); 
const uint32_t RX10_TEMP47 = RX10_TEMP44 != RX10_TEMP46 ; 
if ( RX10_TEMP47 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP45 = "Bad place access for array tUserKey" ; 
fprintf(stderr, "%s",RX10_TEMP45 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP48 = getRefArrayValue1int ( tUserKey , RX10_TEMP40 ) ; 
const int32_t X10_TEMP20 = RX10_TEMP48 ; 
RX10_TEMP53[RX10_TEMP36] = X10_TEMP20 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP54  ; 
intValArray1_intValArray1( &RX10_TEMP54/*OBJECT INIT IN ASSIGNMENT*/, rUserKey , RX10_TEMP53 ) ; 
struct intValArray1 X10_TEMP21 = RX10_TEMP54 ; 
struct intValArray1 tempuserkey = X10_TEMP21 ; 
IDEATestTHIS->userkey = ( tempuserkey ) ; 
struct intValArray1 tempZR = IDEATest_calcEncryptKey ( IDEATestTHIS, tempuserkey ) ; 
IDEATestTHIS->ZR = ( tempZR ) ; 
IDEATest_calcDecryptKey ( IDEATestTHIS, tempZR ) ; 
} 

intValArray1 IDEATest_calcEncryptKey ( struct IDEATest *IDEATestTHIS,  struct intValArray1 const auserkey ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t j = 0 ; 
const int32_t X10_TEMP4 = 0 ; 
const int32_t X10_TEMP5 = 51 ; 
struct Region1 rZ = createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; 
const place_t X10_TEMP7 = /* here  */ _here(); 
struct Dist1 dZ = getPlaceDist1 ( rZ , X10_TEMP7 ) ; 
struct Region1 RX10_TEMP0 = dZ .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER82;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER82 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER82)[0] = RX10_TEMP5, TEMPCALLOCPOINTER82 = ((int32_t * )TEMPCALLOCPOINTER82)+1, memset(TEMPCALLOCPOINTER82,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dZ , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC12) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER83;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER83 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER83)[0] = RX10_TEMP4, TEMPCALLOCPOINTER83 = ((int32_t * )TEMPCALLOCPOINTER83)+1, memset(TEMPCALLOCPOINTER83,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dZ , RX10_TEMP16 ) ; 
struct intRefArray1 Z = RX10_TEMP19 ; 
const int32_t X10_TEMP12 = 0 ; 
const int32_t X10_TEMP13 = 7 ; 
struct Region1 X10_TEMP15 = createNewRegion1R ( X10_TEMP12 , X10_TEMP13 ) ; 
const int32_t RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP21 = X10_TEMP15 .regSize ; 
RX10_TEMP21 = RX10_TEMP21 - RX10_TEMP23 ; const int32_t RX10_TEMP22 = RX10_TEMP21 + 1; 
for ( int32_t RX10_TEMP20= 0; RX10_TEMP20<  RX10_TEMP22; RX10_TEMP20++ )
 
{ 
const int32_t RX10_TEMP24 = /*PointAccess*/RX10_TEMP20 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP15 , RX10_TEMP24 ) ; 
struct Region1 RX10_TEMP25 = auserkey .regionValue ; 
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
/*VALUE ARRAY*/ int32_t * const RX10_TEMP30 = (/*VALUE ARRAY*/ int32_t * ) auserkey .contents ; 
const int32_t X10_TEMP18 = RX10_TEMP30 [ RX10_TEMP26 ] 
; 
const int32_t X10_TEMP19 = 0xffff ; 
const int32_t X10_TEMP21 = X10_TEMP18 & X10_TEMP19 ; 
const int32_t X10_TEMP22 = X10_TEMP21 ; 
struct Dist1 RX10_TEMP31 = Z .distValue ; 
struct Region1 RX10_TEMP32 = RX10_TEMP31 .dReg ; 
const int32_t RX10_TEMP33 = searchPointInRegion1 ( RX10_TEMP32 , i ) ; 
const int32_t RX10_TEMP34 = 0 ; 
const uint32_t RX10_TEMP35 = RX10_TEMP33 < RX10_TEMP34 ; 
if ( RX10_TEMP35 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP36 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP36 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP37 = getPlaceFromDist1 ( RX10_TEMP31 , RX10_TEMP33 ) ; 
const place_t RX10_TEMP39 = /* here  */ _here(); 
const uint32_t RX10_TEMP40 = RX10_TEMP37 != RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP38 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( Z , RX10_TEMP33 , X10_TEMP22 ) ; 
} 

const int32_t X10_TEMP25 = 8 ; 
const int32_t X10_TEMP26 = 51 ; 
struct Region1 X10_TEMP28 = createNewRegion1R ( X10_TEMP25 , X10_TEMP26 ) ; 
const int32_t RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP42 = X10_TEMP28 .regSize ; 
RX10_TEMP42 = RX10_TEMP42 - RX10_TEMP44 ; const int32_t RX10_TEMP43 = RX10_TEMP42 + 1; 
for ( int32_t RX10_TEMP41= 0; RX10_TEMP41<  RX10_TEMP43; RX10_TEMP41++ )
 
{ 
const int32_t RX10_TEMP45 = /*PointAccess*/RX10_TEMP41 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP28 , RX10_TEMP45 ) ; 
const int32_t X10_TEMP30 = i .f0 ; 
const int32_t X10_TEMP31 = 8 ; 
const int32_t X10_TEMP33 = X10_TEMP30 % X10_TEMP31 ; 
j = X10_TEMP33 ; const int32_t X10_TEMP34 = 6 ; 
const uint32_t X10_TEMP36 = j < X10_TEMP34 ; 
if ( X10_TEMP36 ) 
{ 
const int32_t X10_TEMP38 = 7 ; 
const int32_t X10_TEMP39 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP41 = X10_TEMP39 - X10_TEMP38 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP46 = i .f0 ; 
RX10_TEMP46 = RX10_TEMP46 + X10_TEMP41 ; struct Point1 X10_TEMP43  ; 
Point1_Point1( &X10_TEMP43/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP46 ) ; 
struct Dist1 RX10_TEMP47 = Z .distValue ; 
struct Region1 RX10_TEMP48 = RX10_TEMP47 .dReg ; 
const int32_t RX10_TEMP49 = searchPointInRegion1 ( RX10_TEMP48 , X10_TEMP43 ) ; 
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
char * RX10_TEMP54 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP57 = getRefArrayValue1int ( Z , RX10_TEMP49 ) ; 
const int32_t X10_TEMP44 = RX10_TEMP57 ; 
const int32_t X10_TEMP45 = 9 ; 
const int32_t X10_TEMP47 = (((X10_TEMP44 >> X10_TEMP45) ) & ((2147483647 >> X10_TEMP45))); 
const int32_t X10_TEMP48 = 6 ; 
const int32_t X10_TEMP49 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP51 = X10_TEMP49 - X10_TEMP48 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP58 = i .f0 ; 
RX10_TEMP58 = RX10_TEMP58 + X10_TEMP51 ; struct Point1 X10_TEMP53  ; 
Point1_Point1( &X10_TEMP53/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP58 ) ; 
struct Dist1 RX10_TEMP59 = Z .distValue ; 
struct Region1 RX10_TEMP60 = RX10_TEMP59 .dReg ; 
const int32_t RX10_TEMP61 = searchPointInRegion1 ( RX10_TEMP60 , X10_TEMP53 ) ; 
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
char * RX10_TEMP66 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP66 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP69 = getRefArrayValue1int ( Z , RX10_TEMP61 ) ; 
const int32_t X10_TEMP54 = RX10_TEMP69 ; 
const int32_t X10_TEMP55 = 7 ; 
const int32_t X10_TEMP57 = X10_TEMP54 << X10_TEMP55 ; 
const int32_t X10_TEMP59 = X10_TEMP47 | X10_TEMP57 ; 
const int32_t X10_TEMP60 = 0xFFFF ; 
const int32_t X10_TEMP62 = X10_TEMP59 & X10_TEMP60 ; 
const int32_t X10_TEMP63 = X10_TEMP62 ; 
struct Dist1 RX10_TEMP70 = Z .distValue ; 
struct Region1 RX10_TEMP71 = RX10_TEMP70 .dReg ; 
const int32_t RX10_TEMP72 = searchPointInRegion1 ( RX10_TEMP71 , i ) ; 
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
char * RX10_TEMP77 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP77 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( Z , RX10_TEMP72 , X10_TEMP63 ) ; 
continue ; 
} 

const int32_t X10_TEMP64 = 6 ; 
const uint32_t X10_TEMP66 = j == X10_TEMP64 ; 
if ( X10_TEMP66 ) 
{ 
const int32_t X10_TEMP68 = 7 ; 
const int32_t X10_TEMP69 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP71 = X10_TEMP69 - X10_TEMP68 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP80 = i .f0 ; 
RX10_TEMP80 = RX10_TEMP80 + X10_TEMP71 ; struct Point1 X10_TEMP73  ; 
Point1_Point1( &X10_TEMP73/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP80 ) ; 
struct Dist1 RX10_TEMP81 = Z .distValue ; 
struct Region1 RX10_TEMP82 = RX10_TEMP81 .dReg ; 
const int32_t RX10_TEMP83 = searchPointInRegion1 ( RX10_TEMP82 , X10_TEMP73 ) ; 
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
char * RX10_TEMP88 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP88 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP91 = getRefArrayValue1int ( Z , RX10_TEMP83 ) ; 
const int32_t X10_TEMP74 = RX10_TEMP91 ; 
const int32_t X10_TEMP75 = 9 ; 
const int32_t X10_TEMP77 = (((X10_TEMP74 >> X10_TEMP75) ) & ((2147483647 >> X10_TEMP75))); 
const int32_t X10_TEMP78 = 14 ; 
const int32_t X10_TEMP79 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP81 = X10_TEMP79 - X10_TEMP78 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP92 = i .f0 ; 
RX10_TEMP92 = RX10_TEMP92 + X10_TEMP81 ; struct Point1 X10_TEMP83  ; 
Point1_Point1( &X10_TEMP83/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP92 ) ; 
struct Dist1 RX10_TEMP93 = Z .distValue ; 
struct Region1 RX10_TEMP94 = RX10_TEMP93 .dReg ; 
const int32_t RX10_TEMP95 = searchPointInRegion1 ( RX10_TEMP94 , X10_TEMP83 ) ; 
const int32_t RX10_TEMP96 = 0 ; 
const uint32_t RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP98 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP98 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP99 = getPlaceFromDist1 ( RX10_TEMP93 , RX10_TEMP95 ) ; 
const place_t RX10_TEMP101 = /* here  */ _here(); 
const uint32_t RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101 ; 
if ( RX10_TEMP102 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP100 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP100 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP103 = getRefArrayValue1int ( Z , RX10_TEMP95 ) ; 
const int32_t X10_TEMP84 = RX10_TEMP103 ; 
const int32_t X10_TEMP85 = 7 ; 
const int32_t X10_TEMP87 = X10_TEMP84 << X10_TEMP85 ; 
const int32_t X10_TEMP89 = X10_TEMP77 | X10_TEMP87 ; 
const int32_t X10_TEMP90 = 0xFFFF ; 
const int32_t X10_TEMP92 = X10_TEMP89 & X10_TEMP90 ; 
const int32_t X10_TEMP93 = X10_TEMP92 ; 
struct Dist1 RX10_TEMP104 = Z .distValue ; 
struct Region1 RX10_TEMP105 = RX10_TEMP104 .dReg ; 
const int32_t RX10_TEMP106 = searchPointInRegion1 ( RX10_TEMP105 , i ) ; 
const int32_t RX10_TEMP107 = 0 ; 
const uint32_t RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107 ; 
if ( RX10_TEMP108 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP109 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP109 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP110 = getPlaceFromDist1 ( RX10_TEMP104 , RX10_TEMP106 ) ; 
const place_t RX10_TEMP112 = /* here  */ _here(); 
const uint32_t RX10_TEMP113 = RX10_TEMP110 != RX10_TEMP112 ; 
if ( RX10_TEMP113 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP111 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP111 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( Z , RX10_TEMP106 , X10_TEMP93 ) ; 
continue ; 
} 

const int32_t X10_TEMP95 = 15 ; 
const int32_t X10_TEMP96 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP98 = X10_TEMP96 - X10_TEMP95 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP114 = i .f0 ; 
RX10_TEMP114 = RX10_TEMP114 + X10_TEMP98 ; struct Point1 X10_TEMP100  ; 
Point1_Point1( &X10_TEMP100/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP114 ) ; 
struct Dist1 RX10_TEMP115 = Z .distValue ; 
struct Region1 RX10_TEMP116 = RX10_TEMP115 .dReg ; 
const int32_t RX10_TEMP117 = searchPointInRegion1 ( RX10_TEMP116 , X10_TEMP100 ) ; 
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
char * RX10_TEMP122 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP122 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP125 = getRefArrayValue1int ( Z , RX10_TEMP117 ) ; 
const int32_t X10_TEMP101 = RX10_TEMP125 ; 
const int32_t X10_TEMP102 = 9 ; 
const int32_t X10_TEMP104 = (((X10_TEMP101 >> X10_TEMP102) ) & ((2147483647 >> X10_TEMP102))); 
const int32_t X10_TEMP105 = 14 ; 
const int32_t X10_TEMP106 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t X10_TEMP108 = X10_TEMP106 - X10_TEMP105 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP126 = i .f0 ; 
RX10_TEMP126 = RX10_TEMP126 + X10_TEMP108 ; struct Point1 X10_TEMP110  ; 
Point1_Point1( &X10_TEMP110/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP126 ) ; 
struct Dist1 RX10_TEMP127 = Z .distValue ; 
struct Region1 RX10_TEMP128 = RX10_TEMP127 .dReg ; 
const int32_t RX10_TEMP129 = searchPointInRegion1 ( RX10_TEMP128 , X10_TEMP110 ) ; 
const int32_t RX10_TEMP130 = 0 ; 
const uint32_t RX10_TEMP131 = RX10_TEMP129 < RX10_TEMP130 ; 
if ( RX10_TEMP131 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP132 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP132 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP133 = getPlaceFromDist1 ( RX10_TEMP127 , RX10_TEMP129 ) ; 
const place_t RX10_TEMP135 = /* here  */ _here(); 
const uint32_t RX10_TEMP136 = RX10_TEMP133 != RX10_TEMP135 ; 
if ( RX10_TEMP136 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP134 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP134 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP137 = getRefArrayValue1int ( Z , RX10_TEMP129 ) ; 
const int32_t X10_TEMP111 = RX10_TEMP137 ; 
const int32_t X10_TEMP112 = 7 ; 
const int32_t X10_TEMP114 = X10_TEMP111 << X10_TEMP112 ; 
const int32_t X10_TEMP116 = X10_TEMP104 | X10_TEMP114 ; 
const int32_t X10_TEMP117 = 0xFFFF ; 
const int32_t X10_TEMP119 = X10_TEMP116 & X10_TEMP117 ; 
const int32_t X10_TEMP120 = X10_TEMP119 ; 
struct Dist1 RX10_TEMP138 = Z .distValue ; 
struct Region1 RX10_TEMP139 = RX10_TEMP138 .dReg ; 
const int32_t RX10_TEMP140 = searchPointInRegion1 ( RX10_TEMP139 , i ) ; 
const int32_t RX10_TEMP141 = 0 ; 
const uint32_t RX10_TEMP142 = RX10_TEMP140 < RX10_TEMP141 ; 
if ( RX10_TEMP142 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP143 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP143 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP144 = getPlaceFromDist1 ( RX10_TEMP138 , RX10_TEMP140 ) ; 
const place_t RX10_TEMP146 = /* here  */ _here(); 
const uint32_t RX10_TEMP147 = RX10_TEMP144 != RX10_TEMP146 ; 
if ( RX10_TEMP147 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP145 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP145 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( Z , RX10_TEMP140 , X10_TEMP120 ) ; 
} 

struct Region1 RX10_TEMP148 = rZ ; 
const int32_t RX10_TEMP163 = rZ .regSize ; 
const int32_t RX10_TEMP164 = 1 ; 
const int32_t RX10_TEMP165 = RX10_TEMP163 - RX10_TEMP164 ; 
const int32_t RX10_TEMP162 = RX10_TEMP165 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER85;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP166 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER85 = malloc(sizeof(int32_t)+(RX10_TEMP162*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP162*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER85)[0] = RX10_TEMP162, TEMPCALLOCPOINTER85 = ((int32_t * )TEMPCALLOCPOINTER85)+1, memset(TEMPCALLOCPOINTER85,0,RX10_TEMP162*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP149 = 0;RX10_TEMP149 < RX10_TEMP162; RX10_TEMP149++) 

{ 
const int32_t RX10_TEMP150 = /*PointAccess*/RX10_TEMP149 ; 
struct Point1 pt = regionOrdinalPoint1 ( RX10_TEMP148 , RX10_TEMP150 ) ; 
struct Dist1 RX10_TEMP151 = Z .distValue ; 
struct Region1 RX10_TEMP152 = RX10_TEMP151 .dReg ; 
const int32_t RX10_TEMP153 = searchPointInRegion1 ( RX10_TEMP152 , pt ) ; 
const int32_t RX10_TEMP154 = 0 ; 
const uint32_t RX10_TEMP155 = RX10_TEMP153 < RX10_TEMP154 ; 
if ( RX10_TEMP155 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP156 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP156 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP157 = getPlaceFromDist1 ( RX10_TEMP151 , RX10_TEMP153 ) ; 
const place_t RX10_TEMP159 = /* here  */ _here(); 
const uint32_t RX10_TEMP160 = RX10_TEMP157 != RX10_TEMP159 ; 
if ( RX10_TEMP160 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP158 = "Bad place access for array Z" ; 
fprintf(stderr, "%s",RX10_TEMP158 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP161 = getRefArrayValue1int ( Z , RX10_TEMP153 ) ; 
const int32_t X10_TEMP123 = RX10_TEMP161 ; 
RX10_TEMP166[RX10_TEMP149] = X10_TEMP123 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP167  ; 
intValArray1_intValArray1( &RX10_TEMP167/*OBJECT INIT IN ASSIGNMENT*/, rZ , RX10_TEMP166 ) ; 
struct intValArray1 X10_TEMP124 = RX10_TEMP167 ; 
return X10_TEMP124 ; 
} 

void IDEATest_calcDecryptKey ( struct IDEATest *IDEATestTHIS,  struct intValArray1 const aZR ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t j = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t k = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t2 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t3 = 0 ; 
const int32_t X10_TEMP8 = 0 ; 
const int32_t X10_TEMP9 = 51 ; 
struct Region1 rDK = createNewRegion1R ( X10_TEMP8 , X10_TEMP9 ) ; 
const place_t X10_TEMP11 = /* here  */ _here(); 
struct Dist1 dDK = getPlaceDist1 ( rDK , X10_TEMP11 ) ; 
struct Region1 RX10_TEMP0 = dDK .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER86;
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct intStub * ) ( TEMPCALLOCPOINTER86 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP5*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER86)[0] = RX10_TEMP5, TEMPCALLOCPOINTER86 = ((int32_t * )TEMPCALLOCPOINTER86)+1, memset(TEMPCALLOCPOINTER86,0,RX10_TEMP5*sizeof(intStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dDK , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
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
void * TEMPCALLOCPOINTER87;
/*VALUE ARRAY*/ struct intStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct intStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER87 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP4*sizeof( intStub )),((int32_t * )TEMPCALLOCPOINTER87)[0] = RX10_TEMP4, TEMPCALLOCPOINTER87 = ((int32_t * )TEMPCALLOCPOINTER87)+1, memset(TEMPCALLOCPOINTER87,0,RX10_TEMP4*sizeof(intStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct intRefArray1 RX10_TEMP19  ; 
intRefArray1_intRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dDK , RX10_TEMP16 ) ; 
struct intRefArray1 DK = RX10_TEMP19 ; 
struct intValArray1 Z = aZR ; 
const int32_t X10_TEMP17 = 0 ; 
struct Point1 RX10_TEMP20  ; 
Point1_Point1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP17 ) ; 
struct Region1 RX10_TEMP21 = Z .regionValue ; 
const int32_t RX10_TEMP22 = searchPointInRegion1 ( RX10_TEMP21 , RX10_TEMP20 ) ; 
const int32_t RX10_TEMP23 = 0 ; 
const uint32_t RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP25 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP26 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP19 = RX10_TEMP26 [ RX10_TEMP22 ] 
; 
const int32_t X10_TEMP21 = IDEATest_inv ( IDEATestTHIS, X10_TEMP19 ) ; 
t1 = X10_TEMP21 ; const int32_t X10_TEMP23 = 1 ; 
struct Point1 RX10_TEMP27  ; 
Point1_Point1( &RX10_TEMP27/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP23 ) ; 
struct Region1 RX10_TEMP28 = Z .regionValue ; 
const int32_t RX10_TEMP29 = searchPointInRegion1 ( RX10_TEMP28 , RX10_TEMP27 ) ; 
const int32_t RX10_TEMP30 = 0 ; 
const uint32_t RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; 
if ( RX10_TEMP31 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP32 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP32 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP33 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP24 = RX10_TEMP33 [ RX10_TEMP29 ] 
; 
const int32_t X10_TEMP25 = 0 ; 
const int32_t X10_TEMP26 = X10_TEMP25 - X10_TEMP24 ; 
const int32_t X10_TEMP27 = 0xffff ; 
const int32_t X10_TEMP29 = X10_TEMP26 & X10_TEMP27 ; 
t2 = X10_TEMP29 ; const int32_t X10_TEMP31 = 2 ; 
struct Point1 RX10_TEMP34  ; 
Point1_Point1( &RX10_TEMP34/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP31 ) ; 
struct Region1 RX10_TEMP35 = Z .regionValue ; 
const int32_t RX10_TEMP36 = searchPointInRegion1 ( RX10_TEMP35 , RX10_TEMP34 ) ; 
const int32_t RX10_TEMP37 = 0 ; 
const uint32_t RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; 
if ( RX10_TEMP38 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP39 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP40 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP32 = RX10_TEMP40 [ RX10_TEMP36 ] 
; 
const int32_t X10_TEMP33 = 0 ; 
const int32_t X10_TEMP34 = X10_TEMP33 - X10_TEMP32 ; 
const int32_t X10_TEMP35 = 0xffff ; 
const int32_t X10_TEMP37 = X10_TEMP34 & X10_TEMP35 ; 
t3 = X10_TEMP37 ; const int32_t X10_TEMP39 = 51 ; 
const int32_t X10_TEMP42 = 3 ; 
struct Point1 RX10_TEMP41  ; 
Point1_Point1( &RX10_TEMP41/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP42 ) ; 
struct Region1 RX10_TEMP42 = Z .regionValue ; 
const int32_t RX10_TEMP43 = searchPointInRegion1 ( RX10_TEMP42 , RX10_TEMP41 ) ; 
const int32_t RX10_TEMP44 = 0 ; 
const uint32_t RX10_TEMP45 = RX10_TEMP43 < RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP46 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP46 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP47 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP44 = RX10_TEMP47 [ RX10_TEMP43 ] 
; 
const int32_t X10_TEMP46 = IDEATest_inv ( IDEATestTHIS, X10_TEMP44 ) ; 
const int32_t X10_TEMP47 = X10_TEMP46 ; 
struct Point1 RX10_TEMP48  ; 
Point1_Point1( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP39 ) ; 
struct Dist1 RX10_TEMP49 = DK .distValue ; 
struct Region1 RX10_TEMP50 = RX10_TEMP49 .dReg ; 
const int32_t RX10_TEMP51 = searchPointInRegion1 ( RX10_TEMP50 , RX10_TEMP48 ) ; 
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
char * RX10_TEMP56 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP56 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP51 , X10_TEMP47 ) ; 
const int32_t X10_TEMP49 = 50 ; 
const int32_t X10_TEMP51 = t3 ; 
struct Point1 RX10_TEMP59  ; 
Point1_Point1( &RX10_TEMP59/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP49 ) ; 
struct Dist1 RX10_TEMP60 = DK .distValue ; 
struct Region1 RX10_TEMP61 = RX10_TEMP60 .dReg ; 
const int32_t RX10_TEMP62 = searchPointInRegion1 ( RX10_TEMP61 , RX10_TEMP59 ) ; 
const int32_t RX10_TEMP63 = 0 ; 
const uint32_t RX10_TEMP64 = RX10_TEMP62 < RX10_TEMP63 ; 
if ( RX10_TEMP64 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP65 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP65 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP66 = getPlaceFromDist1 ( RX10_TEMP60 , RX10_TEMP62 ) ; 
const place_t RX10_TEMP68 = /* here  */ _here(); 
const uint32_t RX10_TEMP69 = RX10_TEMP66 != RX10_TEMP68 ; 
if ( RX10_TEMP69 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP67 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP67 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP62 , X10_TEMP51 ) ; 
const int32_t X10_TEMP53 = 49 ; 
const int32_t X10_TEMP55 = t2 ; 
struct Point1 RX10_TEMP70  ; 
Point1_Point1( &RX10_TEMP70/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP53 ) ; 
struct Dist1 RX10_TEMP71 = DK .distValue ; 
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
char * RX10_TEMP78 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP73 , X10_TEMP55 ) ; 
const int32_t X10_TEMP57 = 48 ; 
const int32_t X10_TEMP59 = t1 ; 
struct Point1 RX10_TEMP81  ; 
Point1_Point1( &RX10_TEMP81/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP57 ) ; 
struct Dist1 RX10_TEMP82 = DK .distValue ; 
struct Region1 RX10_TEMP83 = RX10_TEMP82 .dReg ; 
const int32_t RX10_TEMP84 = searchPointInRegion1 ( RX10_TEMP83 , RX10_TEMP81 ) ; 
const int32_t RX10_TEMP85 = 0 ; 
const uint32_t RX10_TEMP86 = RX10_TEMP84 < RX10_TEMP85 ; 
if ( RX10_TEMP86 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP87 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP87 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP88 = getPlaceFromDist1 ( RX10_TEMP82 , RX10_TEMP84 ) ; 
const place_t RX10_TEMP90 = /* here  */ _here(); 
const uint32_t RX10_TEMP91 = RX10_TEMP88 != RX10_TEMP90 ; 
if ( RX10_TEMP91 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP89 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP89 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP84 , X10_TEMP59 ) ; 
const int32_t X10_TEMP61 = 47 ; 
j = X10_TEMP61 ; const int32_t X10_TEMP63 = 4 ; 
k = X10_TEMP63 ; const int32_t X10_TEMP66 = 0 ; 
const int32_t X10_TEMP67 = 6 ; 
struct Region1 X10_TEMP69 = createNewRegion1R ( X10_TEMP66 , X10_TEMP67 ) ; 
const int32_t RX10_TEMP95 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP93 = X10_TEMP69 .regSize ; 
RX10_TEMP93 = RX10_TEMP93 - RX10_TEMP95 ; const int32_t RX10_TEMP94 = RX10_TEMP93 + 1; 
for ( int32_t RX10_TEMP92= 0; RX10_TEMP92<  RX10_TEMP94; RX10_TEMP92++ )
 
{ 
const int32_t RX10_TEMP96 = /*PointAccess*/RX10_TEMP92 ; 
struct Point1 i = regionOrdinalPoint1 ( X10_TEMP69 , RX10_TEMP96 ) ; 
const int32_t X10_TEMP70 = k ; 
const int32_t X10_TEMP71 = 1 ; 
k = k + X10_TEMP71 ; struct Point1 RX10_TEMP97  ; 
Point1_Point1( &RX10_TEMP97/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP70 ) ; 
struct Region1 RX10_TEMP98 = Z .regionValue ; 
const int32_t RX10_TEMP99 = searchPointInRegion1 ( RX10_TEMP98 , RX10_TEMP97 ) ; 
const int32_t RX10_TEMP100 = 0 ; 
const uint32_t RX10_TEMP101 = RX10_TEMP99 < RX10_TEMP100 ; 
if ( RX10_TEMP101 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP102 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP102 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP103 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP74 = RX10_TEMP103 [ RX10_TEMP99 ] 
; 
t1 = X10_TEMP74 ; const int32_t X10_TEMP75 = j ; 
const int32_t X10_TEMP76 = 1 ; 
j = j - X10_TEMP76 ; const int32_t X10_TEMP78 = k ; 
const int32_t X10_TEMP79 = 1 ; 
k = k + X10_TEMP79 ; struct Point1 RX10_TEMP104  ; 
Point1_Point1( &RX10_TEMP104/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP78 ) ; 
struct Region1 RX10_TEMP105 = Z .regionValue ; 
const int32_t RX10_TEMP106 = searchPointInRegion1 ( RX10_TEMP105 , RX10_TEMP104 ) ; 
const int32_t RX10_TEMP107 = 0 ; 
const uint32_t RX10_TEMP108 = RX10_TEMP106 < RX10_TEMP107 ; 
if ( RX10_TEMP108 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP109 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP109 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP110 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP82 = RX10_TEMP110 [ RX10_TEMP106 ] 
; 
const int32_t X10_TEMP83 = X10_TEMP82 ; 
struct Point1 RX10_TEMP111  ; 
Point1_Point1( &RX10_TEMP111/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP75 ) ; 
struct Dist1 RX10_TEMP112 = DK .distValue ; 
struct Region1 RX10_TEMP113 = RX10_TEMP112 .dReg ; 
const int32_t RX10_TEMP114 = searchPointInRegion1 ( RX10_TEMP113 , RX10_TEMP111 ) ; 
const int32_t RX10_TEMP115 = 0 ; 
const uint32_t RX10_TEMP116 = RX10_TEMP114 < RX10_TEMP115 ; 
if ( RX10_TEMP116 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP117 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP117 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP118 = getPlaceFromDist1 ( RX10_TEMP112 , RX10_TEMP114 ) ; 
const place_t RX10_TEMP120 = /* here  */ _here(); 
const uint32_t RX10_TEMP121 = RX10_TEMP118 != RX10_TEMP120 ; 
if ( RX10_TEMP121 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP119 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP119 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP114 , X10_TEMP83 ) ; 
const int32_t X10_TEMP84 = j ; 
const int32_t X10_TEMP85 = 1 ; 
j = j - X10_TEMP85 ; const int32_t X10_TEMP88 = t1 ; 
struct Point1 RX10_TEMP122  ; 
Point1_Point1( &RX10_TEMP122/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP84 ) ; 
struct Dist1 RX10_TEMP123 = DK .distValue ; 
struct Region1 RX10_TEMP124 = RX10_TEMP123 .dReg ; 
const int32_t RX10_TEMP125 = searchPointInRegion1 ( RX10_TEMP124 , RX10_TEMP122 ) ; 
const int32_t RX10_TEMP126 = 0 ; 
const uint32_t RX10_TEMP127 = RX10_TEMP125 < RX10_TEMP126 ; 
if ( RX10_TEMP127 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP128 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP128 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP129 = getPlaceFromDist1 ( RX10_TEMP123 , RX10_TEMP125 ) ; 
const place_t RX10_TEMP131 = /* here  */ _here(); 
const uint32_t RX10_TEMP132 = RX10_TEMP129 != RX10_TEMP131 ; 
if ( RX10_TEMP132 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP130 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP130 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP125 , X10_TEMP88 ) ; 
const int32_t X10_TEMP90 = k ; 
const int32_t X10_TEMP91 = 1 ; 
k = k + X10_TEMP91 ; struct Point1 RX10_TEMP133  ; 
Point1_Point1( &RX10_TEMP133/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP90 ) ; 
struct Region1 RX10_TEMP134 = Z .regionValue ; 
const int32_t RX10_TEMP135 = searchPointInRegion1 ( RX10_TEMP134 , RX10_TEMP133 ) ; 
const int32_t RX10_TEMP136 = 0 ; 
const uint32_t RX10_TEMP137 = RX10_TEMP135 < RX10_TEMP136 ; 
if ( RX10_TEMP137 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP138 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP138 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP139 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP94 = RX10_TEMP139 [ RX10_TEMP135 ] 
; 
const int32_t X10_TEMP96 = IDEATest_inv ( IDEATestTHIS, X10_TEMP94 ) ; 
t1 = X10_TEMP96 ; const int32_t X10_TEMP97 = k ; 
const int32_t X10_TEMP98 = 1 ; 
k = k + X10_TEMP98 ; struct Point1 RX10_TEMP140  ; 
Point1_Point1( &RX10_TEMP140/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP97 ) ; 
struct Region1 RX10_TEMP141 = Z .regionValue ; 
const int32_t RX10_TEMP142 = searchPointInRegion1 ( RX10_TEMP141 , RX10_TEMP140 ) ; 
const int32_t RX10_TEMP143 = 0 ; 
const uint32_t RX10_TEMP144 = RX10_TEMP142 < RX10_TEMP143 ; 
if ( RX10_TEMP144 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP145 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP145 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP146 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP100 = RX10_TEMP146 [ RX10_TEMP142 ] 
; 
const int32_t X10_TEMP101 = 0 ; 
const int32_t X10_TEMP102 = X10_TEMP101 - X10_TEMP100 ; 
const int32_t X10_TEMP103 = 0xffff ; 
const int32_t X10_TEMP105 = X10_TEMP102 & X10_TEMP103 ; 
t2 = X10_TEMP105 ; const int32_t X10_TEMP106 = k ; 
const int32_t X10_TEMP107 = 1 ; 
k = k + X10_TEMP107 ; struct Point1 RX10_TEMP147  ; 
Point1_Point1( &RX10_TEMP147/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP106 ) ; 
struct Region1 RX10_TEMP148 = Z .regionValue ; 
const int32_t RX10_TEMP149 = searchPointInRegion1 ( RX10_TEMP148 , RX10_TEMP147 ) ; 
const int32_t RX10_TEMP150 = 0 ; 
const uint32_t RX10_TEMP151 = RX10_TEMP149 < RX10_TEMP150 ; 
if ( RX10_TEMP151 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP152 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP152 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP153 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP109 = RX10_TEMP153 [ RX10_TEMP149 ] 
; 
const int32_t X10_TEMP110 = 0 ; 
const int32_t X10_TEMP111 = X10_TEMP110 - X10_TEMP109 ; 
const int32_t X10_TEMP112 = 0xffff ; 
const int32_t X10_TEMP114 = X10_TEMP111 & X10_TEMP112 ; 
t3 = X10_TEMP114 ; const int32_t X10_TEMP115 = j ; 
const int32_t X10_TEMP116 = 1 ; 
j = j - X10_TEMP116 ; const int32_t X10_TEMP119 = k ; 
const int32_t X10_TEMP120 = 1 ; 
k = k + X10_TEMP120 ; struct Point1 RX10_TEMP154  ; 
Point1_Point1( &RX10_TEMP154/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP119 ) ; 
struct Region1 RX10_TEMP155 = Z .regionValue ; 
const int32_t RX10_TEMP156 = searchPointInRegion1 ( RX10_TEMP155 , RX10_TEMP154 ) ; 
const int32_t RX10_TEMP157 = 0 ; 
const uint32_t RX10_TEMP158 = RX10_TEMP156 < RX10_TEMP157 ; 
if ( RX10_TEMP158 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP159 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP159 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP160 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP123 = RX10_TEMP160 [ RX10_TEMP156 ] 
; 
const int32_t X10_TEMP125 = IDEATest_inv ( IDEATestTHIS, X10_TEMP123 ) ; 
const int32_t X10_TEMP126 = X10_TEMP125 ; 
struct Point1 RX10_TEMP161  ; 
Point1_Point1( &RX10_TEMP161/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP115 ) ; 
struct Dist1 RX10_TEMP162 = DK .distValue ; 
struct Region1 RX10_TEMP163 = RX10_TEMP162 .dReg ; 
const int32_t RX10_TEMP164 = searchPointInRegion1 ( RX10_TEMP163 , RX10_TEMP161 ) ; 
const int32_t RX10_TEMP165 = 0 ; 
const uint32_t RX10_TEMP166 = RX10_TEMP164 < RX10_TEMP165 ; 
if ( RX10_TEMP166 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP167 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP167 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP168 = getPlaceFromDist1 ( RX10_TEMP162 , RX10_TEMP164 ) ; 
const place_t RX10_TEMP170 = /* here  */ _here(); 
const uint32_t RX10_TEMP171 = RX10_TEMP168 != RX10_TEMP170 ; 
if ( RX10_TEMP171 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP169 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP169 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP164 , X10_TEMP126 ) ; 
const int32_t X10_TEMP127 = j ; 
const int32_t X10_TEMP128 = 1 ; 
j = j - X10_TEMP128 ; const int32_t X10_TEMP131 = t2 ; 
struct Point1 RX10_TEMP172  ; 
Point1_Point1( &RX10_TEMP172/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP127 ) ; 
struct Dist1 RX10_TEMP173 = DK .distValue ; 
struct Region1 RX10_TEMP174 = RX10_TEMP173 .dReg ; 
const int32_t RX10_TEMP175 = searchPointInRegion1 ( RX10_TEMP174 , RX10_TEMP172 ) ; 
const int32_t RX10_TEMP176 = 0 ; 
const uint32_t RX10_TEMP177 = RX10_TEMP175 < RX10_TEMP176 ; 
if ( RX10_TEMP177 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP178 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP178 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP179 = getPlaceFromDist1 ( RX10_TEMP173 , RX10_TEMP175 ) ; 
const place_t RX10_TEMP181 = /* here  */ _here(); 
const uint32_t RX10_TEMP182 = RX10_TEMP179 != RX10_TEMP181 ; 
if ( RX10_TEMP182 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP180 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP180 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP175 , X10_TEMP131 ) ; 
const int32_t X10_TEMP132 = j ; 
const int32_t X10_TEMP133 = 1 ; 
j = j - X10_TEMP133 ; const int32_t X10_TEMP136 = t3 ; 
struct Point1 RX10_TEMP183  ; 
Point1_Point1( &RX10_TEMP183/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP132 ) ; 
struct Dist1 RX10_TEMP184 = DK .distValue ; 
struct Region1 RX10_TEMP185 = RX10_TEMP184 .dReg ; 
const int32_t RX10_TEMP186 = searchPointInRegion1 ( RX10_TEMP185 , RX10_TEMP183 ) ; 
const int32_t RX10_TEMP187 = 0 ; 
const uint32_t RX10_TEMP188 = RX10_TEMP186 < RX10_TEMP187 ; 
if ( RX10_TEMP188 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP189 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP189 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP190 = getPlaceFromDist1 ( RX10_TEMP184 , RX10_TEMP186 ) ; 
const place_t RX10_TEMP192 = /* here  */ _here(); 
const uint32_t RX10_TEMP193 = RX10_TEMP190 != RX10_TEMP192 ; 
if ( RX10_TEMP193 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP191 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP191 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP186 , X10_TEMP136 ) ; 
const int32_t X10_TEMP137 = j ; 
const int32_t X10_TEMP138 = 1 ; 
j = j - X10_TEMP138 ; const int32_t X10_TEMP141 = t1 ; 
struct Point1 RX10_TEMP194  ; 
Point1_Point1( &RX10_TEMP194/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP137 ) ; 
struct Dist1 RX10_TEMP195 = DK .distValue ; 
struct Region1 RX10_TEMP196 = RX10_TEMP195 .dReg ; 
const int32_t RX10_TEMP197 = searchPointInRegion1 ( RX10_TEMP196 , RX10_TEMP194 ) ; 
const int32_t RX10_TEMP198 = 0 ; 
const uint32_t RX10_TEMP199 = RX10_TEMP197 < RX10_TEMP198 ; 
if ( RX10_TEMP199 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP200 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP200 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP201 = getPlaceFromDist1 ( RX10_TEMP195 , RX10_TEMP197 ) ; 
const place_t RX10_TEMP203 = /* here  */ _here(); 
const uint32_t RX10_TEMP204 = RX10_TEMP201 != RX10_TEMP203 ; 
if ( RX10_TEMP204 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP202 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP202 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP197 , X10_TEMP141 ) ; 
} 

const int32_t X10_TEMP142 = k ; 
const int32_t X10_TEMP143 = 1 ; 
k = k + X10_TEMP143 ; struct Point1 RX10_TEMP205  ; 
Point1_Point1( &RX10_TEMP205/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP142 ) ; 
struct Region1 RX10_TEMP206 = Z .regionValue ; 
const int32_t RX10_TEMP207 = searchPointInRegion1 ( RX10_TEMP206 , RX10_TEMP205 ) ; 
const int32_t RX10_TEMP208 = 0 ; 
const uint32_t RX10_TEMP209 = RX10_TEMP207 < RX10_TEMP208 ; 
if ( RX10_TEMP209 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP210 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP210 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP211 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP146 = RX10_TEMP211 [ RX10_TEMP207 ] 
; 
t1 = X10_TEMP146 ; const int32_t X10_TEMP147 = j ; 
const int32_t X10_TEMP148 = 1 ; 
j = j - X10_TEMP148 ; const int32_t X10_TEMP150 = k ; 
const int32_t X10_TEMP151 = 1 ; 
k = k + X10_TEMP151 ; struct Point1 RX10_TEMP212  ; 
Point1_Point1( &RX10_TEMP212/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP150 ) ; 
struct Region1 RX10_TEMP213 = Z .regionValue ; 
const int32_t RX10_TEMP214 = searchPointInRegion1 ( RX10_TEMP213 , RX10_TEMP212 ) ; 
const int32_t RX10_TEMP215 = 0 ; 
const uint32_t RX10_TEMP216 = RX10_TEMP214 < RX10_TEMP215 ; 
if ( RX10_TEMP216 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP217 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP217 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP218 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP154 = RX10_TEMP218 [ RX10_TEMP214 ] 
; 
const int32_t X10_TEMP155 = X10_TEMP154 ; 
struct Point1 RX10_TEMP219  ; 
Point1_Point1( &RX10_TEMP219/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP147 ) ; 
struct Dist1 RX10_TEMP220 = DK .distValue ; 
struct Region1 RX10_TEMP221 = RX10_TEMP220 .dReg ; 
const int32_t RX10_TEMP222 = searchPointInRegion1 ( RX10_TEMP221 , RX10_TEMP219 ) ; 
const int32_t RX10_TEMP223 = 0 ; 
const uint32_t RX10_TEMP224 = RX10_TEMP222 < RX10_TEMP223 ; 
if ( RX10_TEMP224 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP225 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP225 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP226 = getPlaceFromDist1 ( RX10_TEMP220 , RX10_TEMP222 ) ; 
const place_t RX10_TEMP228 = /* here  */ _here(); 
const uint32_t RX10_TEMP229 = RX10_TEMP226 != RX10_TEMP228 ; 
if ( RX10_TEMP229 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP227 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP227 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP222 , X10_TEMP155 ) ; 
const int32_t X10_TEMP156 = j ; 
const int32_t X10_TEMP157 = 1 ; 
j = j - X10_TEMP157 ; const int32_t X10_TEMP160 = t1 ; 
struct Point1 RX10_TEMP230  ; 
Point1_Point1( &RX10_TEMP230/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP156 ) ; 
struct Dist1 RX10_TEMP231 = DK .distValue ; 
struct Region1 RX10_TEMP232 = RX10_TEMP231 .dReg ; 
const int32_t RX10_TEMP233 = searchPointInRegion1 ( RX10_TEMP232 , RX10_TEMP230 ) ; 
const int32_t RX10_TEMP234 = 0 ; 
const uint32_t RX10_TEMP235 = RX10_TEMP233 < RX10_TEMP234 ; 
if ( RX10_TEMP235 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP236 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP236 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP237 = getPlaceFromDist1 ( RX10_TEMP231 , RX10_TEMP233 ) ; 
const place_t RX10_TEMP239 = /* here  */ _here(); 
const uint32_t RX10_TEMP240 = RX10_TEMP237 != RX10_TEMP239 ; 
if ( RX10_TEMP240 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP238 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP238 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP233 , X10_TEMP160 ) ; 
const int32_t X10_TEMP162 = k ; 
const int32_t X10_TEMP163 = 1 ; 
k = k + X10_TEMP163 ; struct Point1 RX10_TEMP241  ; 
Point1_Point1( &RX10_TEMP241/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP162 ) ; 
struct Region1 RX10_TEMP242 = Z .regionValue ; 
const int32_t RX10_TEMP243 = searchPointInRegion1 ( RX10_TEMP242 , RX10_TEMP241 ) ; 
const int32_t RX10_TEMP244 = 0 ; 
const uint32_t RX10_TEMP245 = RX10_TEMP243 < RX10_TEMP244 ; 
if ( RX10_TEMP245 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP246 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP246 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP247 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP166 = RX10_TEMP247 [ RX10_TEMP243 ] 
; 
const int32_t X10_TEMP168 = IDEATest_inv ( IDEATestTHIS, X10_TEMP166 ) ; 
t1 = X10_TEMP168 ; const int32_t X10_TEMP169 = k ; 
const int32_t X10_TEMP170 = 1 ; 
k = k + X10_TEMP170 ; struct Point1 RX10_TEMP248  ; 
Point1_Point1( &RX10_TEMP248/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP169 ) ; 
struct Region1 RX10_TEMP249 = Z .regionValue ; 
const int32_t RX10_TEMP250 = searchPointInRegion1 ( RX10_TEMP249 , RX10_TEMP248 ) ; 
const int32_t RX10_TEMP251 = 0 ; 
const uint32_t RX10_TEMP252 = RX10_TEMP250 < RX10_TEMP251 ; 
if ( RX10_TEMP252 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP253 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP253 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP254 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP172 = RX10_TEMP254 [ RX10_TEMP250 ] 
; 
const int32_t X10_TEMP173 = 0 ; 
const int32_t X10_TEMP174 = X10_TEMP173 - X10_TEMP172 ; 
const int32_t X10_TEMP175 = 0xffff ; 
const int32_t X10_TEMP177 = X10_TEMP174 & X10_TEMP175 ; 
t2 = X10_TEMP177 ; const int32_t X10_TEMP178 = k ; 
const int32_t X10_TEMP179 = 1 ; 
k = k + X10_TEMP179 ; struct Point1 RX10_TEMP255  ; 
Point1_Point1( &RX10_TEMP255/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP178 ) ; 
struct Region1 RX10_TEMP256 = Z .regionValue ; 
const int32_t RX10_TEMP257 = searchPointInRegion1 ( RX10_TEMP256 , RX10_TEMP255 ) ; 
const int32_t RX10_TEMP258 = 0 ; 
const uint32_t RX10_TEMP259 = RX10_TEMP257 < RX10_TEMP258 ; 
if ( RX10_TEMP259 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP260 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP260 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP261 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP181 = RX10_TEMP261 [ RX10_TEMP257 ] 
; 
const int32_t X10_TEMP182 = 0 ; 
const int32_t X10_TEMP183 = X10_TEMP182 - X10_TEMP181 ; 
const int32_t X10_TEMP184 = 0xffff ; 
const int32_t X10_TEMP186 = X10_TEMP183 & X10_TEMP184 ; 
t3 = X10_TEMP186 ; const int32_t X10_TEMP187 = j ; 
const int32_t X10_TEMP188 = 1 ; 
j = j - X10_TEMP188 ; const int32_t X10_TEMP191 = k ; 
const int32_t X10_TEMP192 = 1 ; 
k = k + X10_TEMP192 ; struct Point1 RX10_TEMP262  ; 
Point1_Point1( &RX10_TEMP262/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP191 ) ; 
struct Region1 RX10_TEMP263 = Z .regionValue ; 
const int32_t RX10_TEMP264 = searchPointInRegion1 ( RX10_TEMP263 , RX10_TEMP262 ) ; 
const int32_t RX10_TEMP265 = 0 ; 
const uint32_t RX10_TEMP266 = RX10_TEMP264 < RX10_TEMP265 ; 
if ( RX10_TEMP266 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP267 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP267 ) ; 
exit(EXIT_FAILURE);
} 

/*VALUE ARRAY FOR SURE*/
/*VALUE ARRAY*/ int32_t * const RX10_TEMP268 = (/*VALUE ARRAY*/ int32_t * ) Z .contents ; 
const int32_t X10_TEMP195 = RX10_TEMP268 [ RX10_TEMP264 ] 
; 
const int32_t X10_TEMP197 = IDEATest_inv ( IDEATestTHIS, X10_TEMP195 ) ; 
const int32_t X10_TEMP198 = X10_TEMP197 ; 
struct Point1 RX10_TEMP269  ; 
Point1_Point1( &RX10_TEMP269/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP187 ) ; 
struct Dist1 RX10_TEMP270 = DK .distValue ; 
struct Region1 RX10_TEMP271 = RX10_TEMP270 .dReg ; 
const int32_t RX10_TEMP272 = searchPointInRegion1 ( RX10_TEMP271 , RX10_TEMP269 ) ; 
const int32_t RX10_TEMP273 = 0 ; 
const uint32_t RX10_TEMP274 = RX10_TEMP272 < RX10_TEMP273 ; 
if ( RX10_TEMP274 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP275 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP275 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP276 = getPlaceFromDist1 ( RX10_TEMP270 , RX10_TEMP272 ) ; 
const place_t RX10_TEMP278 = /* here  */ _here(); 
const uint32_t RX10_TEMP279 = RX10_TEMP276 != RX10_TEMP278 ; 
if ( RX10_TEMP279 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP277 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP277 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP272 , X10_TEMP198 ) ; 
const int32_t X10_TEMP199 = j ; 
const int32_t X10_TEMP200 = 1 ; 
j = j - X10_TEMP200 ; const int32_t X10_TEMP203 = t3 ; 
struct Point1 RX10_TEMP280  ; 
Point1_Point1( &RX10_TEMP280/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP199 ) ; 
struct Dist1 RX10_TEMP281 = DK .distValue ; 
struct Region1 RX10_TEMP282 = RX10_TEMP281 .dReg ; 
const int32_t RX10_TEMP283 = searchPointInRegion1 ( RX10_TEMP282 , RX10_TEMP280 ) ; 
const int32_t RX10_TEMP284 = 0 ; 
const uint32_t RX10_TEMP285 = RX10_TEMP283 < RX10_TEMP284 ; 
if ( RX10_TEMP285 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP286 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP286 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP287 = getPlaceFromDist1 ( RX10_TEMP281 , RX10_TEMP283 ) ; 
const place_t RX10_TEMP289 = /* here  */ _here(); 
const uint32_t RX10_TEMP290 = RX10_TEMP287 != RX10_TEMP289 ; 
if ( RX10_TEMP290 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP288 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP288 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP283 , X10_TEMP203 ) ; 
const int32_t X10_TEMP204 = j ; 
const int32_t X10_TEMP205 = 1 ; 
j = j - X10_TEMP205 ; const int32_t X10_TEMP208 = t2 ; 
struct Point1 RX10_TEMP291  ; 
Point1_Point1( &RX10_TEMP291/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP204 ) ; 
struct Dist1 RX10_TEMP292 = DK .distValue ; 
struct Region1 RX10_TEMP293 = RX10_TEMP292 .dReg ; 
const int32_t RX10_TEMP294 = searchPointInRegion1 ( RX10_TEMP293 , RX10_TEMP291 ) ; 
const int32_t RX10_TEMP295 = 0 ; 
const uint32_t RX10_TEMP296 = RX10_TEMP294 < RX10_TEMP295 ; 
if ( RX10_TEMP296 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP297 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP297 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP298 = getPlaceFromDist1 ( RX10_TEMP292 , RX10_TEMP294 ) ; 
const place_t RX10_TEMP300 = /* here  */ _here(); 
const uint32_t RX10_TEMP301 = RX10_TEMP298 != RX10_TEMP300 ; 
if ( RX10_TEMP301 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP299 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP299 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP294 , X10_TEMP208 ) ; 
const int32_t X10_TEMP209 = j ; 
const int32_t X10_TEMP210 = 1 ; 
j = j - X10_TEMP210 ; const int32_t X10_TEMP213 = t1 ; 
struct Point1 RX10_TEMP302  ; 
Point1_Point1( &RX10_TEMP302/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP209 ) ; 
struct Dist1 RX10_TEMP303 = DK .distValue ; 
struct Region1 RX10_TEMP304 = RX10_TEMP303 .dReg ; 
const int32_t RX10_TEMP305 = searchPointInRegion1 ( RX10_TEMP304 , RX10_TEMP302 ) ; 
const int32_t RX10_TEMP306 = 0 ; 
const uint32_t RX10_TEMP307 = RX10_TEMP305 < RX10_TEMP306 ; 
if ( RX10_TEMP307 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP308 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP308 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP309 = getPlaceFromDist1 ( RX10_TEMP303 , RX10_TEMP305 ) ; 
const place_t RX10_TEMP311 = /* here  */ _here(); 
const uint32_t RX10_TEMP312 = RX10_TEMP309 != RX10_TEMP311 ; 
if ( RX10_TEMP312 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP310 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP310 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1int ( DK , RX10_TEMP305 , X10_TEMP213 ) ; 
struct Region1 RX10_TEMP313 = rDK ; 
const int32_t RX10_TEMP328 = rDK .regSize ; 
const int32_t RX10_TEMP329 = 1 ; 
const int32_t RX10_TEMP330 = RX10_TEMP328 - RX10_TEMP329 ; 
const int32_t RX10_TEMP327 = RX10_TEMP330 + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER104;
/*VALUE ARRAY*/ int32_t * const RX10_TEMP331 = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER104 = malloc(sizeof(int32_t)+(RX10_TEMP327*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP327*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER104)[0] = RX10_TEMP327, TEMPCALLOCPOINTER104 = ((int32_t * )TEMPCALLOCPOINTER104)+1, memset(TEMPCALLOCPOINTER104,0,RX10_TEMP327*sizeof(int32_t )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP314 = 0;RX10_TEMP314 < RX10_TEMP327; RX10_TEMP314++) 

{ 
const int32_t RX10_TEMP315 = /*PointAccess*/RX10_TEMP314 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP313 , RX10_TEMP315 ) ; 
struct Dist1 RX10_TEMP316 = DK .distValue ; 
struct Region1 RX10_TEMP317 = RX10_TEMP316 .dReg ; 
const int32_t RX10_TEMP318 = searchPointInRegion1 ( RX10_TEMP317 , i ) ; 
const int32_t RX10_TEMP319 = 0 ; 
const uint32_t RX10_TEMP320 = RX10_TEMP318 < RX10_TEMP319 ; 
if ( RX10_TEMP320 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP321 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP321 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP322 = getPlaceFromDist1 ( RX10_TEMP316 , RX10_TEMP318 ) ; 
const place_t RX10_TEMP324 = /* here  */ _here(); 
const uint32_t RX10_TEMP325 = RX10_TEMP322 != RX10_TEMP324 ; 
if ( RX10_TEMP325 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP323 = "Bad place access for array DK" ; 
fprintf(stderr, "%s",RX10_TEMP323 ) ; 
exit(EXIT_FAILURE);
} 

const int32_t RX10_TEMP326 = getRefArrayValue1int ( DK , RX10_TEMP318 ) ; 
const int32_t X10_TEMP216 = RX10_TEMP326 ; 
RX10_TEMP331[RX10_TEMP314] = X10_TEMP216 ; 
} 
/*END OF ARRAY INIT*/struct intValArray1 RX10_TEMP332  ; 
intValArray1_intValArray1( &RX10_TEMP332/*OBJECT INIT IN ASSIGNMENT*/, rDK , RX10_TEMP331 ) ; 
struct intValArray1 X10_TEMP217 = RX10_TEMP332 ; 
IDEATestTHIS->DKR = ( X10_TEMP217 ) ; 
} 

int32_t IDEATest_inv ( struct IDEATest *IDEATestTHIS, const int32_t ax ) 
{ 
/*UpdatableVariableDeclaration*/
int32_t t0 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t t1 = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t q = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t y = 0 ; 
/*UpdatableVariableDeclaration*/
int32_t x = ax ; 
const int32_t X10_TEMP6 = 1 ; 
const uint32_t X10_TEMP8 = x <= X10_TEMP6 ; 
if ( X10_TEMP8 ) 
{ 
const int32_t X10_TEMP10 = x ; 
return X10_TEMP10 ; 
} 

const int32_t X10_TEMP12 = 0x10001 ; 
const int32_t X10_TEMP14 = X10_TEMP12 / x ; 
t1 = X10_TEMP14 ; const int32_t X10_TEMP15 = 0x10001 ; 
const int32_t X10_TEMP17 = X10_TEMP15 % x ; 
y = X10_TEMP17 ; const int32_t X10_TEMP18 = 1 ; 
const uint32_t X10_TEMP20 = y == X10_TEMP18 ; 
if ( X10_TEMP20 ) 
{ 
const int32_t X10_TEMP21 = 1 ; 
const int32_t X10_TEMP23 = X10_TEMP21 - t1 ; 
const int32_t X10_TEMP24 = 0xFFFF ; 
const int32_t X10_TEMP26 = X10_TEMP23 & X10_TEMP24 ; 
return X10_TEMP26 ; 
} 

const int32_t X10_TEMP29 = 1 ; 
t0 = X10_TEMP29 ; /*UpdatableVariableDeclaration*/
uint32_t X10_TEMP30 = 0 ; 
do 
{ 
const int32_t X10_TEMP32 = x / y ; 
q = X10_TEMP32 ; const int32_t X10_TEMP34 = x % y ; 
x = X10_TEMP34 ; const int32_t X10_TEMP35 = q * t1 ; 
const int32_t X10_TEMP37 = t0 + X10_TEMP35 ; 
t0 = X10_TEMP37 ; const int32_t X10_TEMP38 = 1 ; 
const uint32_t X10_TEMP40 = x == X10_TEMP38 ; 
if ( X10_TEMP40 ) 
{ 
const int32_t X10_TEMP42 = t0 ; 
return X10_TEMP42 ; 
} 

const int32_t X10_TEMP45 = y / x ; 
q = X10_TEMP45 ; const int32_t X10_TEMP47 = y % x ; 
y = X10_TEMP47 ; const int32_t X10_TEMP48 = q * t0 ; 
const int32_t X10_TEMP50 = t1 + X10_TEMP48 ; 
t1 = X10_TEMP50 ; const int32_t X10_TEMP51 = 1 ; 
X10_TEMP30 = y != X10_TEMP51 ; } 
while ( X10_TEMP30 ) ; 
const int32_t X10_TEMP53 = 1 ; 
const int32_t X10_TEMP55 = X10_TEMP53 - t1 ; 
const int32_t X10_TEMP56 = 0xFFFF ; 
const int32_t X10_TEMP58 = X10_TEMP55 & X10_TEMP56 ; 
return X10_TEMP58 ; 
} 

void thread3 ( struct IDEATest *IDEATestTHIS,  struct T3 const utmpz ) 
{ 
struct Region1 RX10_TEMP14 = utmpz .RX10_TEMP14 ; 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP17 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER106;
/*Updatable ARRAY*/ char /**/* const RX10_TEMP18 = (/*Updatable ARRAY*/ char /**/* ) ( TEMPCALLOCPOINTER106 = malloc(sizeof(int32_t)+(RX10_TEMP17*sizeof( char /**/))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP17*sizeof( char /**/)),((int32_t * )TEMPCALLOCPOINTER106)[0] = RX10_TEMP17, TEMPCALLOCPOINTER106 = ((int32_t * )TEMPCALLOCPOINTER106)+1, memset(TEMPCALLOCPOINTER106,0,RX10_TEMP17*sizeof(char /**/) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP15 = 0;RX10_TEMP15 < RX10_TEMP17; RX10_TEMP15++) 

{ 
const int32_t RX10_TEMP16 = /*PointAccess*/RX10_TEMP15 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; 
const int32_t X10_TEMP13 = p .f0 ; 
const char /**/X10_TEMP15 = ( char) ( char) X10_TEMP13 ; 
RX10_TEMP18[RX10_TEMP15] = X10_TEMP15 ; 
} 
/*END OF ARRAY INIT*/struct byteStub RX10_TEMP19  ; 
byteStub_byteStub( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP18 ) ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP19 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC14) ;
a.size = sizeof(utmp12 );
a.params = (void *)(&utmp12 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread4 ( struct IDEATest *IDEATestTHIS,  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP36 = utmpz .RX10_TEMP36 ; 
const place_t RX10_TEMP32 = utmpz .RX10_TEMP32 ; 
const int32_t RX10_TEMP31 = utmpz .RX10_TEMP31 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP30 = utmpz .RX10_TEMP30 ; 

{ 
const int32_t RX10_TEMP37 = /*SimpleDistributionExpression*/ RX10_TEMP36 +1; 
void * TEMPCALLOCPOINTER108;
/*Updatable ARRAY*/ char /**/* const RX10_TEMP38 = (/*Updatable ARRAY*/ char /**/* ) ( TEMPCALLOCPOINTER108 = malloc(sizeof(int32_t)+(RX10_TEMP37*sizeof( char /**/))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP37*sizeof( char /**/)),((int32_t * )TEMPCALLOCPOINTER108)[0] = RX10_TEMP37, TEMPCALLOCPOINTER108 = ((int32_t * )TEMPCALLOCPOINTER108)+1, memset(TEMPCALLOCPOINTER108,0,RX10_TEMP37*sizeof(char /**/) ) ); 
struct byteStub RX10_TEMP39  ; 
byteStub_byteStub( &RX10_TEMP39/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP38 ) ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP39 , RX10_TEMP31 , RX10_TEMP30 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC15) ;
a.size = sizeof(utmp13 );
a.params = (void *)(&utmp13 );
task_dispatch(a, RX10_TEMP32 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread5 ( struct IDEATest *IDEATestTHIS,  struct T5 const utmpz ) 
{ 
const int32_t RX10_TEMP56 = utmpz .RX10_TEMP56 ; 
const place_t RX10_TEMP52 = utmpz .RX10_TEMP52 ; 
const int32_t RX10_TEMP51 = utmpz .RX10_TEMP51 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP50 = utmpz .RX10_TEMP50 ; 

{ 
const int32_t RX10_TEMP57 = /*SimpleDistributionExpression*/ RX10_TEMP56 +1; 
void * TEMPCALLOCPOINTER110;
/*Updatable ARRAY*/ char /**/* const RX10_TEMP58 = (/*Updatable ARRAY*/ char /**/* ) ( TEMPCALLOCPOINTER110 = malloc(sizeof(int32_t)+(RX10_TEMP57*sizeof( char /**/))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP57*sizeof( char /**/)),((int32_t * )TEMPCALLOCPOINTER110)[0] = RX10_TEMP57, TEMPCALLOCPOINTER110 = ((int32_t * )TEMPCALLOCPOINTER110)+1, memset(TEMPCALLOCPOINTER110,0,RX10_TEMP57*sizeof(char /**/) ) ); 
struct byteStub RX10_TEMP59  ; 
byteStub_byteStub( &RX10_TEMP59/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP58 ) ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP59 , RX10_TEMP51 , RX10_TEMP50 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC16) ;
a.size = sizeof(utmp14 );
a.params = (void *)(&utmp14 );
task_dispatch(a, RX10_TEMP52 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread6 ( struct IDEATest *IDEATestTHIS,  struct T6 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER112;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER112 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER112)[0] = RX10_TEMP13, TEMPCALLOCPOINTER112 = ((int32_t * )TEMPCALLOCPOINTER112)+1, memset(TEMPCALLOCPOINTER112,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC17) ;
a.size = sizeof(utmp15 );
a.params = (void *)(&utmp15 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread7 ( struct IDEATest *IDEATestTHIS,  struct T7 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER114;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER114 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER114)[0] = RX10_TEMP13, TEMPCALLOCPOINTER114 = ((int32_t * )TEMPCALLOCPOINTER114)+1, memset(TEMPCALLOCPOINTER114,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T16 utmp16  ; 
T16_T16( &utmp16/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC18) ;
a.size = sizeof(utmp16 );
a.params = (void *)(&utmp16 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread8 ( struct IDEATest *IDEATestTHIS,  struct T8 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER116;
/*Updatable ARRAY*/ int32_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER116 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t ))),   (((_task*)_thread_getspecific()) -> total_memory) += sizeof(int32_t)+(RX10_TEMP13*sizeof( int32_t )),((int32_t * )TEMPCALLOCPOINTER116)[0] = RX10_TEMP13, TEMPCALLOCPOINTER116 = ((int32_t * )TEMPCALLOCPOINTER116)+1, memset(TEMPCALLOCPOINTER116,0,RX10_TEMP13*sizeof(int32_t ) ) ); 
struct intStub RX10_TEMP15  ; 
intStub_intStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T17 utmp17  ; 
T17_T17( &utmp17/*OBJECT INIT IN ASSIGNMENT*/, IDEATestTHIS /*this*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC19) ;
a.size = sizeof(utmp17 );
a.params = (void *)(&utmp17 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread12 ( struct IDEATest *IDEATestTHIS,  struct T12 const utmpz ) 
{ 
struct byteStub RX10_TEMP19 = utmpz .RX10_TEMP19 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP19 ) ; 
} 
} 

void thread13 ( struct IDEATest *IDEATestTHIS,  struct T13 const utmpz ) 
{ 
struct byteStub RX10_TEMP39 = utmpz .RX10_TEMP39 ; 
const int32_t RX10_TEMP31 = utmpz .RX10_TEMP31 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP30 = utmpz .RX10_TEMP30 ; 

{ 
RX10_TEMP30 [ RX10_TEMP31 ] = ( RX10_TEMP39 ) ; 
} 
} 

void thread14 ( struct IDEATest *IDEATestTHIS,  struct T14 const utmpz ) 
{ 
struct byteStub RX10_TEMP59 = utmpz .RX10_TEMP59 ; 
const int32_t RX10_TEMP51 = utmpz .RX10_TEMP51 ; 
/*Updatable ARRAY*/ struct byteStub * const RX10_TEMP50 = utmpz .RX10_TEMP50 ; 

{ 
RX10_TEMP50 [ RX10_TEMP51 ] = ( RX10_TEMP59 ) ; 
} 
} 

void thread15 ( struct IDEATest *IDEATestTHIS,  struct T15 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void thread16 ( struct IDEATest *IDEATestTHIS,  struct T16 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void thread17 ( struct IDEATest *IDEATestTHIS,  struct T17 const utmpz ) 
{ 
struct intStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
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


byteRefArray1 byteRefArray1_byteRefArray1 ( struct byteRefArray1 *byteRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct byteStub * const contents_ ) 
{ 
byteRefArray1THIS->distValue = ( distValue_ ) ; 
byteRefArray1THIS->contents = ( contents_ ) ; 

 return  *byteRefArray1THIS; 

} 
/* class RunMain */ int32_t  runmain( ) 
{ 
_IDEATest_array_rows = _IDEATest_array_rows_init ( ) ; 
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_IDEATest_array_rows = _IDEATest_array_rows_init ( ) ; 
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
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC3 :
		 fixPointerT10(((struct T10 * const )params), (params+sizeof(struct T10)));
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC4 :
		 fixPointerT11(((struct T11 * const )params), (params+sizeof(struct T11)));
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC5 :
		 fixPointerT18(((struct T18 * const )params), (params+sizeof(struct T18)));
		thread18(&(*((struct T18 * const )params)).THIS, *((struct T18 * const )params));
		break;
	 case ASYNC6 :
		 fixPointerT19(((struct T19 * const )params), (params+sizeof(struct T19)));
		thread19(&(*((struct T19 * const )params)).THIS, *((struct T19 * const )params));
		break;
	 case ASYNC7 :
		 fixPointerT20(((struct T20 * const )params), (params+sizeof(struct T20)));
		thread20(&(*((struct T20 * const )params)).THIS, *((struct T20 * const )params));
		break;
	 case ASYNC8 :
		 fixPointerT3(((struct T3 * const )params), (params+sizeof(struct T3)));
		thread3(&(*((struct T3 * const )params)).THIS, *((struct T3 * const )params));
		break;
	 case ASYNC9 :
		 fixPointerT4(((struct T4 * const )params), (params+sizeof(struct T4)));
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC10 :
		 fixPointerT5(((struct T5 * const )params), (params+sizeof(struct T5)));
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC11 :
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
		break;
	 case ASYNC12 :
		 fixPointerT7(((struct T7 * const )params), (params+sizeof(struct T7)));
		thread7(&(*((struct T7 * const )params)).THIS, *((struct T7 * const )params));
		break;
	 case ASYNC13 :
		 fixPointerT8(((struct T8 * const )params), (params+sizeof(struct T8)));
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC14 :
		 fixPointerT12(((struct T12 * const )params), (params+sizeof(struct T12)));
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC15 :
		 fixPointerT13(((struct T13 * const )params), (params+sizeof(struct T13)));
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC16 :
		 fixPointerT14(((struct T14 * const )params), (params+sizeof(struct T14)));
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC17 :
		 fixPointerT15(((struct T15 * const )params), (params+sizeof(struct T15)));
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC18 :
		 fixPointerT16(((struct T16 * const )params), (params+sizeof(struct T16)));
		thread16(&(*((struct T16 * const )params)).THIS, *((struct T16 * const )params));
		break;
	 case ASYNC19 :
		 fixPointerT17(((struct T17 * const )params), (params+sizeof(struct T17)));
		thread17(&(*((struct T17 * const )params)).THIS, *((struct T17 * const )params));
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
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC3 :
		thread10(&(*((struct T10 * const )params)).THIS, *((struct T10 * const )params));
		break;
	 case ASYNC4 :
		thread11(&(*((struct T11 * const )params)).THIS, *((struct T11 * const )params));
		break;
	 case ASYNC5 :
		thread18(&(*((struct T18 * const )params)).THIS, *((struct T18 * const )params));
		break;
	 case ASYNC6 :
		thread19(&(*((struct T19 * const )params)).THIS, *((struct T19 * const )params));
		break;
	 case ASYNC7 :
		thread20(&(*((struct T20 * const )params)).THIS, *((struct T20 * const )params));
		break;
	 case ASYNC8 :
		thread3(&(*((struct T3 * const )params)).THIS, *((struct T3 * const )params));
		break;
	 case ASYNC9 :
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC10 :
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC11 :
		thread6(&(*((struct T6 * const )params)).THIS, *((struct T6 * const )params));
		break;
	 case ASYNC12 :
		thread7(&(*((struct T7 * const )params)).THIS, *((struct T7 * const )params));
		break;
	 case ASYNC13 :
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
		break;
	 case ASYNC14 :
		thread12(&(*((struct T12 * const )params)).THIS, *((struct T12 * const )params));
		break;
	 case ASYNC15 :
		thread13(&(*((struct T13 * const )params)).THIS, *((struct T13 * const )params));
		break;
	 case ASYNC16 :
		thread14(&(*((struct T14 * const )params)).THIS, *((struct T14 * const )params));
		break;
	 case ASYNC17 :
		thread15(&(*((struct T15 * const )params)).THIS, *((struct T15 * const )params));
		break;
	 case ASYNC18 :
		thread16(&(*((struct T16 * const )params)).THIS, *((struct T16 * const )params));
		break;
	 case ASYNC19 :
		thread17(&(*((struct T17 * const )params)).THIS, *((struct T17 * const )params));
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
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT1((struct T1 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC1 :
		 sizeToMalloc = child.size+ getSizeOfT2((struct T2 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT2((struct T2 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC2 :
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC3 :
		 sizeToMalloc = child.size+ getSizeOfT10((struct T10 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT10((struct T10 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC4 :
		 sizeToMalloc = child.size+ getSizeOfT11((struct T11 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT11((struct T11 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC5 :
		 sizeToMalloc = child.size+ getSizeOfT18((struct T18 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT18((struct T18 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC6 :
		 sizeToMalloc = child.size+ getSizeOfT19((struct T19 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT19((struct T19 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC7 :
		 sizeToMalloc = child.size+ getSizeOfT20((struct T20 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT20((struct T20 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC8 :
		 sizeToMalloc = child.size+ getSizeOfT3((struct T3 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT3((struct T3 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC9 :
		 sizeToMalloc = child.size+ getSizeOfT4((struct T4 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT4((struct T4 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC10 :
		 sizeToMalloc = child.size+ getSizeOfT5((struct T5 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT5((struct T5 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC11 :
		 sizeToMalloc = child.size+ getSizeOfT6((struct T6 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT6((struct T6 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC12 :
		 sizeToMalloc = child.size+ getSizeOfT7((struct T7 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT7((struct T7 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC13 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC14 :
		 sizeToMalloc = child.size+ getSizeOfT12((struct T12 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT12((struct T12 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC15 :
		 sizeToMalloc = child.size+ getSizeOfT13((struct T13 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT13((struct T13 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC16 :
		 sizeToMalloc = child.size+ getSizeOfT14((struct T14 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT14((struct T14 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC17 :
		 sizeToMalloc = child.size+ getSizeOfT15((struct T15 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT15((struct T15 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC18 :
		 sizeToMalloc = child.size+ getSizeOfT16((struct T16 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT16((struct T16 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC19 :
		 sizeToMalloc = child.size+ getSizeOfT17((struct T17 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
(((_task*)_thread_getspecific()) -> total_memory) += sizeToMalloc+headerSize;
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT17((struct T17 * const )child.params,(buf+headerSize+child.size));
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
int32_t getSizeOfintValArray1( struct intValArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> regionValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(int32_t);
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
int32_t getSizeOfT20( struct T20 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP58));
return temp;
 }
int32_t getSizeOfbyteRefArray1( struct byteRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(byteStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfbyteStub(&(className -> contents[i]));
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
int32_t getSizeOfbyteStub( struct byteStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
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
    temp += getSizeOfPoint1(&(className -> pt));
    temp += getSizeOfbyteRefArray1(&(className -> p2));
    temp += getSizeOfbyteRefArray1(&(className -> c1));
    temp += getSizeOfbyteRefArray1(&(className -> p1));
return temp;
 }
int32_t getSizeOfT3( struct T3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> RX10_TEMP14));
return temp;
 }
int32_t getSizeOfT2( struct T2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintValArray1(&(className -> fdkr));
    temp += getSizeOfintValArray1(&(className -> fzr));
    temp += getSizeOfbyteRefArray1(&(className -> p2));
    temp += getSizeOfbyteRefArray1(&(className -> c1));
    temp += getSizeOfbyteRefArray1(&(className -> p1));
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
return temp;
 }
int32_t getSizeOfT12( struct T12 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfbyteStub(&(className -> RX10_TEMP19));
return temp;
 }
int32_t getSizeOfT13( struct T13 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfbyteStub(&(className -> RX10_TEMP39));
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
    temp += getSizeOfbyteStub(&(className -> RX10_TEMP59));
return temp;
 }
int32_t getSizeOfT15( struct T15 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfintStub(&(className -> RX10_TEMP15));
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
    temp += getSizeOfintStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT18( struct T18 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP16));
return temp;
 }
int32_t getSizeOfT19( struct T19 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfdoubleStub(&(className -> RX10_TEMP37));
return temp;
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
void* deepCopyT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void* deepCopybyteRefArray1( struct byteRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(byteStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopybyteStub(&(className -> contents[i]), offset);
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
void* deepCopybyteStub( struct byteStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
offset = deepCopyPoint1(&(className -> pt), offset);
offset = deepCopybyteRefArray1(&(className -> p2), offset);
offset = deepCopybyteRefArray1(&(className -> c1), offset);
offset = deepCopybyteRefArray1(&(className -> p1), offset);
return offset;
 }
void* deepCopyT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> RX10_TEMP14), offset);
return offset;
 }
void* deepCopyT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintValArray1(&(className -> fdkr), offset);
offset = deepCopyintValArray1(&(className -> fzr), offset);
offset = deepCopybyteRefArray1(&(className -> p2), offset);
offset = deepCopybyteRefArray1(&(className -> c1), offset);
offset = deepCopybyteRefArray1(&(className -> p1), offset);
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
return offset;
 }
void* deepCopyT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopybyteStub(&(className -> RX10_TEMP19), offset);
return offset;
 }
void* deepCopyT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopybyteStub(&(className -> RX10_TEMP39), offset);
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
offset = deepCopybyteStub(&(className -> RX10_TEMP59), offset);
return offset;
 }
void* deepCopyT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyintStub(&(className -> RX10_TEMP15), offset);
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
offset = deepCopyintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void* deepCopyT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopydoubleStub(&(className -> RX10_TEMP37), offset);
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
void * fixPointerT20( struct T20 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP58), offset);
return offset;
 }
void * fixPointerbyteRefArray1( struct byteRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(byteStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerbyteStub(&(className -> contents[i]), offset);
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
void * fixPointerbyteStub( struct byteStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
offset  = fixPointerPoint1(&(className -> pt), offset);
offset  = fixPointerbyteRefArray1(&(className -> p2), offset);
offset  = fixPointerbyteRefArray1(&(className -> c1), offset);
offset  = fixPointerbyteRefArray1(&(className -> p1), offset);
return offset;
 }
void * fixPointerT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerRegion1(&(className -> RX10_TEMP14), offset);
return offset;
 }
void * fixPointerT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintValArray1(&(className -> fdkr), offset);
offset  = fixPointerintValArray1(&(className -> fzr), offset);
offset  = fixPointerbyteRefArray1(&(className -> p2), offset);
offset  = fixPointerbyteRefArray1(&(className -> c1), offset);
offset  = fixPointerbyteRefArray1(&(className -> p1), offset);
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
return offset;
 }
void * fixPointerT12( struct T12 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerbyteStub(&(className -> RX10_TEMP19), offset);
return offset;
 }
void * fixPointerT13( struct T13 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerbyteStub(&(className -> RX10_TEMP39), offset);
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
offset  = fixPointerbyteStub(&(className -> RX10_TEMP59), offset);
return offset;
 }
void * fixPointerT15( struct T15 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerintStub(&(className -> RX10_TEMP15), offset);
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
offset  = fixPointerintStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT18( struct T18 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP16), offset);
return offset;
 }
void * fixPointerT19( struct T19 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerdoubleStub(&(className -> RX10_TEMP37), offset);
return offset;
 }
