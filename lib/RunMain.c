#include "../inc/async.h"
#include "../inc/place.h"
#include "../inc/RunMain.h"
#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
/* class Program */ 
int64_t _FragmentedRandomAccess_POLY ;
int64_t _FragmentedRandomAccess_PERIOD ;
int32_t _FragmentedRandomAccess_NUM_PLACES ;
int32_t _FragmentedRandomAccess_logLocalTableSize ;
int32_t _FragmentedRandomAccess_updates ;
int32_t _FragmentedRandomAccess_PLACE_ID_MASK ;
int64_t /*static*/_FragmentedRandomAccess_POLY_init ( ) 
{ 
const int64_t X10_TEMP2 = 0x0000000000000007L ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/_FragmentedRandomAccess_PERIOD_init ( ) 
{ 
const int64_t X10_TEMP2 = 1317624576693539401L ; 
return X10_TEMP2 ; 
} 

int32_t /*static*/_FragmentedRandomAccess_NUM_PLACES_init ( ) 
{ 
const int32_t X10_TEMP2 = /* place.MAX_PLACES  */ _max_places(); 
return X10_TEMP2 ; 
} 

int32_t /*static*/_FragmentedRandomAccess_PLACE_ID_MASK_init ( ) 
{ 
const int32_t X10_TEMP1 = 1 ; 
const int32_t X10_TEMP3 = _FragmentedRandomAccess_NUM_PLACES - X10_TEMP1 ; 
return X10_TEMP3 ; 
} 

int32_t /*static*/_FragmentedRandomAccess_logLocalTableSize_init ( ) 
{ 
const int32_t X10_TEMP2 = 20; 
return X10_TEMP2 ; 
} 

int32_t /*static*/_FragmentedRandomAccess_updates_init ( ) 
{ 
const int32_t X10_TEMP2 = 4 ; 
return X10_TEMP2 ; 
} 

int64_t /*static*/FragmentedRandomAccess_startRandGen (  struct FragmentedRandomAccess  * const X10_TEMP0 , const int64_t nn , const int64_t period , const int64_t poly ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
int32_t i = 0 ; 
/*UpdatableVariableDeclaration*/
int64_t n = nn ; 
const int32_t X10_TEMP5 = 0 ; 
const int32_t X10_TEMP6 = 63 ; 
struct Region1 X10_TEMP7 = createNewRegion1R ( X10_TEMP5 , X10_TEMP6 ) ; 
const place_t X10_TEMP8 = /* here  */ _here(); 
struct Dist1 dReg = getPlaceDist1 ( X10_TEMP7 , X10_TEMP8 ) ; 
struct Region1 RX10_TEMP0 = dReg .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER1;
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct longStub * ) ( TEMPCALLOCPOINTER1 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( longStub ))),   ((int32_t * )TEMPCALLOCPOINTER1)[0] = RX10_TEMP5, TEMPCALLOCPOINTER1 = ((int32_t * )TEMPCALLOCPOINTER1)+1, memset(TEMPCALLOCPOINTER1,0,RX10_TEMP5*sizeof(longStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( dReg , RX10_TEMP9 ) ; 
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
/*VALUE ARRAY*/ struct longStub * const RX10_TEMP16 = (/*VALUE ARRAY*/ struct longStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER2 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( longStub ))),   ((int32_t * )TEMPCALLOCPOINTER2)[0] = RX10_TEMP4, TEMPCALLOCPOINTER2 = ((int32_t * )TEMPCALLOCPOINTER2)+1, memset(TEMPCALLOCPOINTER2,0,RX10_TEMP4*sizeof(longStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP18 = 0;RX10_TEMP18 < RX10_TEMP4; RX10_TEMP18++) 

{ 
struct longStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
RX10_TEMP16[RX10_TEMP18] = RX10_TEMP17 ; 
} 
/*END OF ARRAY INIT*/struct longRefArray1 RX10_TEMP19  ; 
longRefArray1_longRefArray1( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, dReg , RX10_TEMP16 ) ; 
struct longRefArray1 X10_TEMP11 = RX10_TEMP19 ; 
/*UpdatableVariableDeclaration*/
 struct longRefArray1 m2 = X10_TEMP11 ; 
const int32_t X10_TEMP13 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP17 = n < X10_TEMP13 ; 

while ( X10_TEMP17 ) 
{ 

{ 
const int64_t X10_TEMP19 = n + period ; 
n = X10_TEMP19 ; } 
const int32_t X10_TEMP15 = 0 ; 
X10_TEMP17 = n < X10_TEMP15 ; } 

/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP22 = n > period ; 

while ( X10_TEMP22 ) 
{ 

{ 
const int64_t X10_TEMP24 = n - period ; 
n = X10_TEMP24 ; } 
X10_TEMP22 = n > period ; } 

const int32_t X10_TEMP25 = 0 ; 
const uint32_t X10_TEMP27 = n == X10_TEMP25 ; 
if ( X10_TEMP27 ) 
{ 
const int64_t X10_TEMP29 = 0x1L ; 
return X10_TEMP29 ; 
} 

/*UpdatableVariableDeclaration*/
int64_t temp = 0x1L ; 
struct Region1 RX10_TEMP21 = dReg .dReg ; 
const int32_t RX10_TEMP24 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP22 = RX10_TEMP21 .regSize ; 
RX10_TEMP22 = RX10_TEMP22 - RX10_TEMP24 ; const int32_t RX10_TEMP23 = RX10_TEMP22 + 1; 
for ( int32_t RX10_TEMP20= 0; RX10_TEMP20<  RX10_TEMP23; RX10_TEMP20++ )
 
{ 
const int32_t RX10_TEMP25 = /*PointAccess*/RX10_TEMP20 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP21 , RX10_TEMP25 ) ; 

{ 
const int64_t X10_TEMP34 = temp ; 
struct Dist1 RX10_TEMP26 = m2 .distValue ; 
struct Region1 RX10_TEMP27 = RX10_TEMP26 .dReg ; 
const int32_t RX10_TEMP28 = searchPointInRegion1 ( RX10_TEMP27 , p ) ; 
const int32_t RX10_TEMP29 = 0 ; 
const uint32_t RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP31 = "Array index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP32 = getPlaceFromDist1 ( RX10_TEMP26 , RX10_TEMP28 ) ; 
const place_t RX10_TEMP34 = /* here  */ _here(); 
const uint32_t RX10_TEMP35 = RX10_TEMP32 != RX10_TEMP34 ; 
if ( RX10_TEMP35 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP33 = "Bad place access for array m2" ; 
fprintf(stderr, "%s",RX10_TEMP33 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1long ( m2 , RX10_TEMP28 , X10_TEMP34 ) ; 
const int32_t X10_TEMP35 = 1 ; 
const int64_t X10_TEMP37 = temp << X10_TEMP35 ; 
const int32_t X10_TEMP38 = 0 ; 
const uint32_t X10_TEMP39 = temp < X10_TEMP38 ; 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP42 = 0L ; 
if ( X10_TEMP39 ) 
{ 
X10_TEMP42 = poly ; } 

const int64_t X10_TEMP43 = X10_TEMP42 ; 
const int64_t X10_TEMP44 = X10_TEMP43 ; 
const int64_t X10_TEMP46 = X10_TEMP37 ^ X10_TEMP44 ; 
temp = X10_TEMP46 ; const int32_t X10_TEMP47 = 1 ; 
const int64_t X10_TEMP49 = temp << X10_TEMP47 ; 
const int32_t X10_TEMP50 = 0 ; 
const uint32_t X10_TEMP51 = temp < X10_TEMP50 ; 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP54 = 0L ; 
if ( X10_TEMP51 ) 
{ 
X10_TEMP54 = poly ; } 

const int64_t X10_TEMP55 = X10_TEMP54 ; 
const int64_t X10_TEMP56 = X10_TEMP55 ; 
const int64_t X10_TEMP58 = X10_TEMP49 ^ X10_TEMP56 ; 
temp = X10_TEMP58 ; } 
} 

const int32_t X10_TEMP60 = 62 ; 
i = X10_TEMP60 ; const int32_t X10_TEMP61 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP65 = i >= X10_TEMP61 ; 

while ( X10_TEMP65 ) 
{ 

{ 
const int64_t X10_TEMP67 = n >> i ; 
const int32_t X10_TEMP68 = 1 ; 
const int64_t X10_TEMP70 = X10_TEMP67 & X10_TEMP68 ; 
const int32_t X10_TEMP71 = 0 ; 
const uint32_t X10_TEMP73 = X10_TEMP70 != X10_TEMP71 ; 
if ( X10_TEMP73 ) 
{ 
break ; 
} 

const int32_t X10_TEMP74 = i ; 
const int32_t X10_TEMP75 = 1 ; 
i = i - X10_TEMP75 ; } 
const int32_t X10_TEMP63 = 0 ; 
X10_TEMP65 = i >= X10_TEMP63 ; } 

/*UpdatableVariableDeclaration*/
int64_t ran = 0x2L ; 
const int32_t X10_TEMP77 = 0 ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP81 = i > X10_TEMP77 ; 

while ( X10_TEMP81 ) 
{ 

{ 
const int64_t X10_TEMP83 = 0L ; 
temp = X10_TEMP83 ; struct Region1 RX10_TEMP37 = dReg .dReg ; 
const int32_t RX10_TEMP40 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP38 = RX10_TEMP37 .regSize ; 
RX10_TEMP38 = RX10_TEMP38 - RX10_TEMP40 ; const int32_t RX10_TEMP39 = RX10_TEMP38 + 1; 
for ( int32_t RX10_TEMP36= 0; RX10_TEMP36<  RX10_TEMP39; RX10_TEMP36++ )
 
{ 
const int32_t RX10_TEMP41 = /*PointAccess*/RX10_TEMP36 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP37 , RX10_TEMP41 ) ; 
const int32_t X10_TEMP86 = p .f0 ; 
const int64_t X10_TEMP88 = ran >> X10_TEMP86 ; 
const int32_t X10_TEMP89 = 1 ; 
const int64_t X10_TEMP91 = X10_TEMP88 & X10_TEMP89 ; 
const int32_t X10_TEMP92 = 0 ; 
const uint32_t X10_TEMP94 = X10_TEMP91 != X10_TEMP92 ; 
if ( X10_TEMP94 ) 
{ 
struct Dist1 RX10_TEMP42 = m2 .distValue ; 
struct Region1 RX10_TEMP43 = RX10_TEMP42 .dReg ; 
const int32_t RX10_TEMP44 = searchPointInRegion1 ( RX10_TEMP43 , p ) ; 
const int32_t RX10_TEMP45 = 0 ; 
const uint32_t RX10_TEMP46 = RX10_TEMP44 < RX10_TEMP45 ; 
if ( RX10_TEMP46 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP47 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP48 = getPlaceFromDist1 ( RX10_TEMP42 , RX10_TEMP44 ) ; 
const place_t RX10_TEMP50 = /* here  */ _here(); 
const uint32_t RX10_TEMP51 = RX10_TEMP48 != RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP49 = "Bad place access for array m2" ; 
fprintf(stderr, "%s",RX10_TEMP49 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP52 = getRefArrayValue1long ( m2 , RX10_TEMP44 ) ; 
const int64_t X10_TEMP96 = RX10_TEMP52 ; 
const int64_t X10_TEMP98 = temp ^ X10_TEMP96 ; 
temp = X10_TEMP98 ; } 

} 

ran = temp ; const int32_t X10_TEMP100 = 1 ; 
const int32_t X10_TEMP102 = i - X10_TEMP100 ; 
i = X10_TEMP102 ; const int64_t X10_TEMP104 = n >> i ; 
const int32_t X10_TEMP105 = 1 ; 
const int64_t X10_TEMP107 = X10_TEMP104 & X10_TEMP105 ; 
const int32_t X10_TEMP108 = 0 ; 
const uint32_t X10_TEMP110 = X10_TEMP107 != X10_TEMP108 ; 
if ( X10_TEMP110 ) 
{ 
const int32_t X10_TEMP111 = 1 ; 
const int64_t X10_TEMP113 = ran << X10_TEMP111 ; 
const int64_t X10_TEMP114 = /*casting*/( int64_t ) ran ; 
const int32_t X10_TEMP115 = 0 ; 
const uint32_t X10_TEMP116 = X10_TEMP114 < X10_TEMP115 ; 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP119 = 0 ; 
if ( X10_TEMP116 ) 
{ 
X10_TEMP119 = poly ; } 

const int64_t X10_TEMP120 = X10_TEMP119 ; 
const int64_t X10_TEMP121 = X10_TEMP120 ; 
const int64_t X10_TEMP123 = X10_TEMP113 ^ X10_TEMP121 ; 
ran = X10_TEMP123 ; } 

} 
const int32_t X10_TEMP79 = 0 ; 
X10_TEMP81 = i > X10_TEMP79 ; } 

return ran ; 
} 
} 

void /*static*/FragmentedRandomAccess_update (  struct FragmentedRandomAccess  * const X10_TEMP0 ) 
{ 

{ 
struct LocalTableRefArray1 table = X10_TEMP0 ->table ; 
const int32_t logLocalTableSize = _FragmentedRandomAccess_logLocalTableSize ; 
const int32_t numPlaces = _FragmentedRandomAccess_NUM_PLACES ; 
const int32_t placeIdMask = _FragmentedRandomAccess_PLACE_ID_MASK ; 
const int64_t numUpdates = X10_TEMP0 ->numUpdates ; 
const int64_t poly = _FragmentedRandomAccess_POLY ; 
const int64_t period = _FragmentedRandomAccess_PERIOD ; 
const int32_t X10_TEMP9 = numPlaces ; 
const int64_t X10_TEMP11 = /*casting*/( int64_t ) X10_TEMP9 ; 
const int64_t lu = numUpdates / X10_TEMP11 ; 
/* finish  */ task_start_finish();

{ 
struct Dist1 X10_TEMP14 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP1 = X10_TEMP14 .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Region1 RX10_TEMP6 = X10_TEMP14 .dReg ; 
const int32_t RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , p ) ; 
const int32_t RX10_TEMP8 = 0 ; 
const uint32_t RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
const char * RX10_TEMP10 = "Point p not found in the distribution X10_TEMP14." ; 
fprintf(stderr, "%s",RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP11 = getPlaceFromDist1 ( X10_TEMP14 , RX10_TEMP7 ) ; 
const place_t X10_TEMP15 = RX10_TEMP11 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, lu , period , poly , placeIdMask , logLocalTableSize , table , X10_TEMP0 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC1) ;
a.size = sizeof(utmp2 );
a.params = (void *)(&utmp2 );
task_dispatch(a, X10_TEMP15 );


}/*END OF ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
} 
} 

void /*static*/runMain ( ) 
{ 

{ 
/*UpdatableVariableDeclaration*/
 struct FragmentedRandomAccess  * fra = (struct FragmentedRandomAccess  *) malloc(sizeof(struct FragmentedRandomAccess ));  
memset(fra,0,sizeof(struct FragmentedRandomAccess )); 
FragmentedRandomAccess_FragmentedRandomAccess( fra/*OBJECT INIT IN ASSIGNMENT*/) ; 
const char * X10_TEMP2 = "Main table size   = 2^" ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC1, "%s%d",X10_TEMP2,_FragmentedRandomAccess_logLocalTableSize);
const char * X10_TEMP3 = tempC1;; 
const char * X10_TEMP4 = "*" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC2, "%s%s",X10_TEMP3,X10_TEMP4);
const char * X10_TEMP5 = tempC2;; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC3, "%s%d",X10_TEMP5,_FragmentedRandomAccess_NUM_PLACES);
const char * X10_TEMP6 = tempC3;; 
const char * X10_TEMP7 = " = " ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC4, "%s%s",X10_TEMP6,X10_TEMP7);
const char * X10_TEMP8 = tempC4;; 
const int64_t X10_TEMP9 = fra ->tableSize ; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC5, "%s%lld",X10_TEMP8,X10_TEMP9);
const char * X10_TEMP10 = tempC5;; 
const char * X10_TEMP11 = " words" ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC6, "%s%s",X10_TEMP10,X10_TEMP11);
const char * X10_TEMP13 = tempC6;; 
fprintf(  stdout, "%s\n",X10_TEMP13 ) ; 
const char * X10_TEMP14 = "Number of places  = " ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC7, "%s%d",X10_TEMP14,_FragmentedRandomAccess_NUM_PLACES);
const char * X10_TEMP16 = tempC7;; 
fprintf(  stdout, "%s\n",X10_TEMP16 ) ; 
const char * X10_TEMP17 = "Number of updates = " ; 
const int64_t X10_TEMP18 = fra ->numUpdates ; 
/*ASSIGNMENT STRING*/
 char * tempC8 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC8, "%s%lld",X10_TEMP17,X10_TEMP18);
const char * X10_TEMP20 = tempC8;; 
fprintf(  stdout, "%s\n",X10_TEMP20 ) ; 
/*UpdatableVariableDeclaration*/
double start_time = getTIME( ) 
; 
double start_time_all = start_time; 
/* finish  */ task_start_finish();

{ 

{ 
FragmentedRandomAccess_update ( fra ) ; 
} 
} 
task_end_finish();
/*END OF FINISH*/
const double X10_TEMP22 = getTIME( ) 
; 
const double X10_TEMP24 = X10_TEMP22 - start_time ; 
const int32_t X10_TEMP25 = 1000 ; 
const double X10_TEMP27 = X10_TEMP24 / X10_TEMP25 ; 
start_time = X10_TEMP27 ; const char * X10_TEMP28 = "cpu time for randomaccess: " ; 
/*ASSIGNMENT STRING*/
 char * tempC9 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC9, "%s%f",X10_TEMP28,start_time);
const char * X10_TEMP29 = tempC9;; 
const char * X10_TEMP30 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC10 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC10, "%s%s",X10_TEMP29,X10_TEMP30);
const char * X10_TEMP32 = tempC10;; 
fprintf(  stdout, "%s\n",X10_TEMP32 ) ; 
FragmentedRandomAccess_update ( fra ) ; 
/* finish  */ task_start_finish();

{ 

{ 
struct LocalTableRefArray1 X10_TEMP33 = fra ->table ; 
struct LocalTableRefArray1 table = X10_TEMP33 ; 
struct Dist1 X10_TEMP36 = getUniqueDist ( ) ; 
struct Region1 RX10_TEMP1 = X10_TEMP36 .dReg ; 
const int32_t RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int32_t RX10_TEMP3 = RX10_TEMP2 + 1; 
for ( int32_t RX10_TEMP0= 0; RX10_TEMP0<  RX10_TEMP3; RX10_TEMP0++ )
 
{ 
const int32_t RX10_TEMP5 = /*PointAccess*/RX10_TEMP0 ; 
struct Point1 pt = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Region1 RX10_TEMP6 = X10_TEMP36 .dReg ; 
const int32_t RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , pt ) ; 
const int32_t RX10_TEMP8 = 0 ; 
const uint32_t RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ 
const char * RX10_TEMP10 = "Point pt not found in the distribution X10_TEMP36." ; 
fprintf(stderr, "%s",RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP11 = getPlaceFromDist1 ( X10_TEMP36 , RX10_TEMP7 ) ; 
const place_t X10_TEMP37 = RX10_TEMP11 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, pt , table ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC2) ;
a.size = sizeof(utmp3 );
a.params = (void *)(&utmp3 );
task_dispatch(a, X10_TEMP37 );


}/*END OF ASYNC*/
} 

} 
} 
task_end_finish();
/*END OF FINISH*/
start_time_all = getTIME( ) - start_time_all;
start_time_all = start_time_all/1000;
const char * X10_TEMP61 = "Wall-clock time for randomaccess: " ; 
/*ASSIGNMENT STRING*/
 char * tempC11 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC11, "%s%f",X10_TEMP61,start_time_all);
const char * X10_TEMP62 = tempC11;; 
const char * X10_TEMP63 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC12 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC12, "%s%s",X10_TEMP62,X10_TEMP63);
const char * X10_TEMP65 = tempC12;; 
fprintf(  stdout, "%s\n",X10_TEMP65 ) ; 
} 
} 

void /*static*/LocalTable_update (  struct LocalTable  * const X10_TEMP0 , const int64_t ran ) 
{ 

{ 
const int64_t X10_TEMP1 = X10_TEMP0 ->mask ; 
const int64_t X10_TEMP3 = ran & X10_TEMP1 ; 
const int32_t bound = /*casting*/( int32_t ) X10_TEMP3 ; 
struct longRefArray1 X10_TEMP5 = X10_TEMP0 ->a ; 
struct longRefArray1 X10_TEMP7 = X10_TEMP0 ->a ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, bound ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP7 .distValue ; 
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
char * RX10_TEMP8 = "Bad place access for array X10_TEMP7" ; 
fprintf(stderr, "%s",RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP11 = getRefArrayValue1long ( X10_TEMP7 , RX10_TEMP3 ) ; 
const int64_t X10_TEMP9 = RX10_TEMP11 ; 
const int64_t X10_TEMP11 = X10_TEMP9 ^ ran ; 
const int64_t X10_TEMP12 = X10_TEMP11 ; 
struct Point1 RX10_TEMP12  ; 
Point1_Point1( &RX10_TEMP12/*OBJECT INIT IN ASSIGNMENT*/, bound ) ; 
struct Dist1 RX10_TEMP13 = X10_TEMP5 .distValue ; 
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
char * RX10_TEMP20 = "Bad place access for array X10_TEMP5" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1long ( X10_TEMP5 , RX10_TEMP15 , X10_TEMP12 ) ; 
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
void * TEMPCALLOCPOINTER5;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER5 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   ((int32_t * )TEMPCALLOCPOINTER5)[0] = tempReg, TEMPCALLOCPOINTER5 = ((int32_t * )TEMPCALLOCPOINTER5)+1, memset(TEMPCALLOCPOINTER5,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER6;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER6 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   ((int32_t * )TEMPCALLOCPOINTER6)[0] = tempDist, TEMPCALLOCPOINTER6 = ((int32_t * )TEMPCALLOCPOINTER6)+1, memset(TEMPCALLOCPOINTER6,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER7;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER7 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER7)[0] = tempReg, TEMPCALLOCPOINTER7 = ((int32_t * )TEMPCALLOCPOINTER7)+1, memset(TEMPCALLOCPOINTER7,0,tempReg*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER11;
/*VALUE ARRAY*/ place_t * const rPlace = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER11 = malloc(sizeof(int32_t)+(tempReg*sizeof( place_t ))),   ((int32_t * )TEMPCALLOCPOINTER11)[0] = tempReg, TEMPCALLOCPOINTER11 = ((int32_t * )TEMPCALLOCPOINTER11)+1, memset(TEMPCALLOCPOINTER11,0,tempReg*sizeof(place_t )) ); 

/*ArrayInitializer*/
for( int32_t pt = 0;pt < tempReg; pt++) 

{ 
rPlace[pt] = p ; 
} 
/*END OF ARRAY INIT*/void * TEMPCALLOCPOINTER12;
/*Updatable ARRAY*/ int32_t * const tempArray = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER12 = malloc(sizeof(int32_t)+(tempDist*sizeof( int32_t ))),   ((int32_t * )TEMPCALLOCPOINTER12)[0] = tempDist, TEMPCALLOCPOINTER12 = ((int32_t * )TEMPCALLOCPOINTER12)+1, memset(TEMPCALLOCPOINTER12,0,tempDist*sizeof(int32_t ) ) ); 
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
void * TEMPCALLOCPOINTER13;
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER13 = malloc(sizeof(int32_t)+(tempReg*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER13)[0] = tempReg, TEMPCALLOCPOINTER13 = ((int32_t * )TEMPCALLOCPOINTER13)+1, memset(TEMPCALLOCPOINTER13,0,tempReg*sizeof(Point1 )) ); 

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

Dist1 /*static*/getUniqueDist ( ) 
{ 
const int32_t one = 1 ; 
const int32_t zero = 0 ; 
const int32_t maxPlaces = /* place.MAX_PLACES  */ _max_places(); 
const int32_t rSize = maxPlaces - one ; 
const int32_t placeRegion = rSize + 1; 
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER15;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER15 = malloc(sizeof(int32_t)+(placeRegion*sizeof( place_t ))),   ((int32_t * )TEMPCALLOCPOINTER15)[0] = placeRegion, TEMPCALLOCPOINTER15 = ((int32_t * )TEMPCALLOCPOINTER15)+1, memset(TEMPCALLOCPOINTER15,0,placeRegion*sizeof(place_t )) ); 

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
/*VALUE ARRAY*/ struct Point1 * const pointArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER16 = malloc(sizeof(int32_t)+(pointRegion*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER16)[0] = pointRegion, TEMPCALLOCPOINTER16 = ((int32_t * )TEMPCALLOCPOINTER16)+1, memset(TEMPCALLOCPOINTER16,0,pointRegion*sizeof(Point1 )) ); 

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

LocalTable  * /*static*/getRefArrayValue1LocalTable (  struct LocalTableRefArray1 const array , const int32_t index ) 
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
/*VALUE ARRAY*/ struct LocalTableStub * const contents = array .contents ; 
struct LocalTableStub indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ struct LocalTable * * const localArray = indexStub .localArray ; 
struct LocalTable * returnValue = localArray [ localIndex ] 
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
void * TEMPCALLOCPOINTER29;
/*VALUE ARRAY*/ place_t * const vPlaceArray = (/*VALUE ARRAY*/ place_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER29 = malloc(sizeof(int32_t)+(dReg*sizeof( place_t ))),   ((int32_t * )TEMPCALLOCPOINTER29)[0] = dReg, TEMPCALLOCPOINTER29 = ((int32_t * )TEMPCALLOCPOINTER29)+1, memset(TEMPCALLOCPOINTER29,0,dReg*sizeof(place_t )) ); 

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
void * TEMPCALLOCPOINTER30;
/*VALUE ARRAY*/ int32_t * const vTemp = (/*VALUE ARRAY*/ int32_t * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER30 = malloc(sizeof(int32_t)+(tempReg*sizeof( int32_t ))),   ((int32_t * )TEMPCALLOCPOINTER30)[0] = tempReg, TEMPCALLOCPOINTER30 = ((int32_t * )TEMPCALLOCPOINTER30)+1, memset(TEMPCALLOCPOINTER30,0,tempReg*sizeof(int32_t )) ); 

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
void * TEMPCALLOCPOINTER31;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER31 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER31)[0] = regArr, TEMPCALLOCPOINTER31 = ((int32_t * )TEMPCALLOCPOINTER31)+1, memset(TEMPCALLOCPOINTER31,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER32;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER32 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER32)[0] = regArr, TEMPCALLOCPOINTER32 = ((int32_t * )TEMPCALLOCPOINTER32)+1, memset(TEMPCALLOCPOINTER32,0,regArr*sizeof(Point1 )) ); 

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
void * TEMPCALLOCPOINTER33;
/*VALUE ARRAY*/ struct Point1 * const ptArray = (/*VALUE ARRAY*/ struct Point1 * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER33 = malloc(sizeof(int32_t)+(regArr*sizeof( Point1 ))),   ((int32_t * )TEMPCALLOCPOINTER33)[0] = regArr, TEMPCALLOCPOINTER33 = ((int32_t * )TEMPCALLOCPOINTER33)+1, memset(TEMPCALLOCPOINTER33,0,regArr*sizeof(Point1 )) ); 

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
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP13 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER35;
/*Updatable ARRAY*/ int64_t * const RX10_TEMP14 = (/*Updatable ARRAY*/ int64_t * ) ( TEMPCALLOCPOINTER35 = malloc(sizeof(int32_t)+(RX10_TEMP13*sizeof( int64_t ))),   ((int32_t * )TEMPCALLOCPOINTER35)[0] = RX10_TEMP13, TEMPCALLOCPOINTER35 = ((int32_t * )TEMPCALLOCPOINTER35)+1, memset(TEMPCALLOCPOINTER35,0,RX10_TEMP13*sizeof(int64_t ) ) ); 
struct longStub RX10_TEMP15  ; 
longStub_longStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC3) ;
a.size = sizeof(utmp6 );
a.params = (void *)(&utmp6 );
task_dispatch(a, RX10_TEMP8 );


}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int64_t lu = utmpz .lu ; 
const int64_t period = utmpz .period ; 
const int64_t poly = utmpz .poly ; 
const int32_t placeIdMask = utmpz .placeIdMask ; 
const int32_t logLocalTableSize = utmpz .logLocalTableSize ; 
struct LocalTableRefArray1 table = utmpz .table ; 
struct FragmentedRandomAccess * X10_TEMP0 = utmpz .X10_TEMP0 ; 

{ 

{ 
const place_t X10_TEMP16 = /* here  */ _here(); 
const int64_t X10_TEMP17 = /* X10_TEMP16 . id  */ X10_TEMP16; 
const int64_t X10_TEMP21 = X10_TEMP17 * lu ; 
/*UpdatableVariableDeclaration*/
int64_t ran = FragmentedRandomAccess_startRandGen ( X10_TEMP0 , X10_TEMP21 , period , poly ) ; 
/*UpdatableVariableDeclaration*/
int64_t i = 0L ; 
/*UpdatableVariableDeclaration*/
uint32_t X10_TEMP26 = i < lu ; 

while ( X10_TEMP26 ) 
{ 

{ 
const int64_t temp = ran ; 
const int64_t X10_TEMP29 = ran >> logLocalTableSize ; 
const int32_t X10_TEMP31 = /*casting*/( int32_t ) X10_TEMP29 ; 
const int32_t placeId = X10_TEMP31 & placeIdMask ; 
const place_t pl = /* place.places ( placeId )  */ _toplace(placeId ); 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, placeId , temp , table ) ; 
/* async  */
 {
struct _struct_async a;
a.method =  (ASYNC4) ;
a.size = sizeof(utmp7 );
a.params = (void *)(&utmp7 );
//double start_time = getTIME();
task_dispatch(a, pl );
//start_time = getTIME() - start_time;
//fprintf(stderr, "Time for workhorse async %4.9f\n", start_time/1000);


}/*END OF ASYNC*/
const int32_t X10_TEMP39 = 1 ; 
const int64_t X10_TEMP41 = ran << X10_TEMP39 ; 
const int64_t X10_TEMP42 = 0L ; 
const uint32_t X10_TEMP43 = ran < X10_TEMP42 ; 
/*UpdatableVariableDeclaration*/
int64_t X10_TEMP46 = 0L ; 
if ( X10_TEMP43 ) 
{ 
X10_TEMP46 = poly ; } 

const int64_t X10_TEMP47 = X10_TEMP46 ; 
const int64_t X10_TEMP48 = X10_TEMP47 ; 
const int64_t X10_TEMP50 = X10_TEMP41 ^ X10_TEMP48 ; 
ran = X10_TEMP50 ; const int64_t X10_TEMP51 = i ; 
const int32_t X10_TEMP52 = 1 ; 
i = i + X10_TEMP52 ; } 
X10_TEMP26 = i < lu ; } 

} 
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
struct Point1 pt = utmpz .pt ; 
struct LocalTableRefArray1 table = utmpz .table ; 

{ 

{ 
/*UpdatableVariableDeclaration*/
int64_t err = 0 ; 
struct Dist1 RX10_TEMP12 = table .distValue ; 
struct Region1 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int32_t RX10_TEMP14 = searchPointInRegion1 ( RX10_TEMP13 , pt ) ; 
const int32_t RX10_TEMP15 = 0 ; 
const uint32_t RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP17 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP18 = getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const place_t RX10_TEMP20 = /* here  */ _here(); 
const uint32_t RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP19 = "Bad place access for array table" ; 
fprintf(stderr, "%s",RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

struct LocalTable * RX10_TEMP22 = getRefArrayValue1LocalTable ( table , RX10_TEMP14 ) ; 
/*UpdatableVariableDeclaration*/
 struct LocalTable  * l = RX10_TEMP22 ; 
struct longRefArray1 X10_TEMP42 = l ->a ; 
struct Dist1 RX10_TEMP24 = X10_TEMP42 .distValue ; 
struct Region1 RX10_TEMP25 = RX10_TEMP24 .dReg ; 
const int32_t RX10_TEMP28 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP26 = RX10_TEMP25 .regSize ; 
RX10_TEMP26 = RX10_TEMP26 - RX10_TEMP28 ; const int32_t RX10_TEMP27 = RX10_TEMP26 + 1; 
for ( int32_t RX10_TEMP23= 0; RX10_TEMP23<  RX10_TEMP27; RX10_TEMP23++ )
 
{ 
const int32_t RX10_TEMP29 = /*PointAccess*/RX10_TEMP23 ; 
struct Point1 q = regionOrdinalPoint1 ( RX10_TEMP25 , RX10_TEMP29 ) ; 

{ 
struct longRefArray1 X10_TEMP43 = l ->a ; 
struct Dist1 RX10_TEMP30 = X10_TEMP43 .distValue ; 
struct Region1 RX10_TEMP31 = RX10_TEMP30 .dReg ; 
const int32_t RX10_TEMP32 = searchPointInRegion1 ( RX10_TEMP31 , q ) ; 
const int32_t RX10_TEMP33 = 0 ; 
const uint32_t RX10_TEMP34 = RX10_TEMP32 < RX10_TEMP33 ; 
if ( RX10_TEMP34 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP35 = "Array access index out of bounds" ; 
fprintf(stderr, "%s",RX10_TEMP35 ) ; 
exit(EXIT_FAILURE);
} 

const place_t RX10_TEMP36 = getPlaceFromDist1 ( RX10_TEMP30 , RX10_TEMP32 ) ; 
const place_t RX10_TEMP38 = /* here  */ _here(); 
const uint32_t RX10_TEMP39 = RX10_TEMP36 != RX10_TEMP38 ; 
if ( RX10_TEMP39 ) 
{ 
/*UpdatableVariableDeclaration*/
char * RX10_TEMP37 = "Bad place access for array X10_TEMP43" ; 
fprintf(stderr, "%s",RX10_TEMP37 ) ; 
exit(EXIT_FAILURE);
} 

const int64_t RX10_TEMP40 = getRefArrayValue1long ( X10_TEMP43 , RX10_TEMP32 ) ; 
const int64_t X10_TEMP46 = RX10_TEMP40 ; 
const int32_t X10_TEMP47 = q .f0 ; 
const uint32_t X10_TEMP49 = X10_TEMP46 != X10_TEMP47 ; 
if ( X10_TEMP49 ) 
{ 
const int64_t X10_TEMP50 = err ; 
const int32_t X10_TEMP51 = 1 ; 
err = err + X10_TEMP51 ; } 

} 
} 

const int64_t errSum = err ; 
const char * X10_TEMP53 = "Found " ; 
/*ASSIGNMENT STRING*/
 char * tempC13 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC13, "%s%lld",X10_TEMP53,errSum);
const char * X10_TEMP54 = tempC13;; 
const char * X10_TEMP55 = " errors at place " ; 
/*ASSIGNMENT STRING*/
 char * tempC14 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC14, "%s%s",X10_TEMP54,X10_TEMP55);
const char * X10_TEMP57 = tempC14;; 
const place_t X10_TEMP56 = /* here  */ _here(); 
const int32_t X10_TEMP58 = /* X10_TEMP56 . id  */ X10_TEMP56; 
/*ASSIGNMENT STRING*/
 char * tempC15 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC15, "%s%d",X10_TEMP57,X10_TEMP58);
const char * X10_TEMP60 = tempC15;; 
fprintf(  stdout, "%s\n",X10_TEMP60 ) ; 
} 
} 
} 

void /*static*/thread6 (  struct T6 const utmpz ) 
{ 
struct longStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; 
} 
} 

void /*static*/thread7 (  struct T7 const utmpz ) 
{ 
const int32_t placeId = utmpz .placeId ; 
const int64_t temp = utmpz .temp ; 
struct LocalTableRefArray1 table = utmpz .table ; 

{ 

{ 
struct Point1 RX10_TEMP12  ; 
Point1_Point1( &RX10_TEMP12/*OBJECT INIT IN ASSIGNMENT*/, placeId ) ; 
struct Dist1 RX10_TEMP13 = table .distValue ; 
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
char * RX10_TEMP20 = "Bad place access for array table" ; 
fprintf(stderr, "%s",RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

struct LocalTable * RX10_TEMP23 = getRefArrayValue1LocalTable ( table , RX10_TEMP15 ) ; 
struct LocalTable * X10_TEMP37 = RX10_TEMP23 ; 
LocalTable_update ( X10_TEMP37 , temp ) ; 
} 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T1THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T1THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T1THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T1THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS, const int64_t a_lu , const int64_t a_period , const int64_t a_poly , const int32_t a_placeIdMask , const int32_t a_logLocalTableSize ,  struct LocalTableRefArray1 const a_table ,  struct FragmentedRandomAccess  * const a_X10_TEMP0 ) 
{ 
T2THIS->lu = ( a_lu ) ; 
T2THIS->period = ( a_period ) ; 
T2THIS->poly = ( a_poly ) ; 
T2THIS->placeIdMask = ( a_placeIdMask ) ; 
T2THIS->logLocalTableSize = ( a_logLocalTableSize ) ; 
T2THIS->table = ( a_table ) ; 
T2THIS->X10_TEMP0 = ( a_X10_TEMP0 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS,  struct Point1 const a_pt ,  struct LocalTableRefArray1 const a_table ) 
{ 
T3THIS->pt = ( a_pt ) ; 
T3THIS->table = ( a_table ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, struct FragmentedRandomAccess * FragmentedRandomAccessTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LocalTableStub * const a_RX10_TEMP6 , const int64_t a_localTableSize ) 
{ 
T4THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T4THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T4THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T4THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T4THIS->localTableSize = ( a_localTableSize ) ; 
T4THIS->THIS = *FragmentedRandomAccessTHIS;
 return  *T4THIS; 

} 

T5 T5_T5 ( struct T5 *T5THIS, struct LocalTable * LocalTableTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP14 , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T5THIS->RX10_TEMP14 = ( a_RX10_TEMP14 ) ; 
T5THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T5THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T5THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T5THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T5THIS->THIS = *LocalTableTHIS;
 return  *T5THIS; 

} 

T6 T6_T6 ( struct T6 *T6THIS,  struct longStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T6THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_placeId , const int64_t a_temp ,  struct LocalTableRefArray1 const a_table ) 
{ 
T7THIS->placeId = ( a_placeId ) ; 
T7THIS->temp = ( a_temp ) ; 
T7THIS->table = ( a_table ) ; 

 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct FragmentedRandomAccess * FragmentedRandomAccessTHIS /*this*/ ,  struct LocalTableStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LocalTableStub * const a_RX10_TEMP6 ) 
{ 
T8THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T8THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T8THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T8THIS->THIS = *FragmentedRandomAccessTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS, struct LocalTable * LocalTableTHIS /*this*/ ,  struct longStub const a_RX10_TEMP19 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) 
{ 
T9THIS->RX10_TEMP19 = ( a_RX10_TEMP19 ) ; 
T9THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T9THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T9THIS->THIS = *LocalTableTHIS;
 return  *T9THIS; 

} 

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

} 

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist1THIS->dReg = ( dReg_ ) ; 
Dist1THIS->dDist = ( dDist_ ) ; 

 return  *Dist1THIS; 

} 

longRefArray1 longRefArray1_longRefArray1 ( struct longRefArray1 *longRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct longStub * const contents_ ) 
{ 
longRefArray1THIS->distValue = ( distValue_ ) ; 
longRefArray1THIS->contents = ( contents_ ) ; 

 return  *longRefArray1THIS; 

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
void * TEMPCALLOCPOINTER37;
/*Updatable ARRAY*/ int32_t * const tempCounts = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER37 = malloc(sizeof(int32_t)+(countDist*sizeof( int32_t ))),   ((int32_t * )TEMPCALLOCPOINTER37)[0] = countDist, TEMPCALLOCPOINTER37 = ((int32_t * )TEMPCALLOCPOINTER37)+1, memset(TEMPCALLOCPOINTER37,0,countDist*sizeof(int32_t ) ) ); 
void * TEMPCALLOCPOINTER38;
/*Updatable ARRAY*/ int32_t * const tempRunSum = (/*Updatable ARRAY*/ int32_t * ) ( TEMPCALLOCPOINTER38 = malloc(sizeof(int32_t)+(runSumDist*sizeof( int32_t ))),   ((int32_t * )TEMPCALLOCPOINTER38)[0] = runSumDist, TEMPCALLOCPOINTER38 = ((int32_t * )TEMPCALLOCPOINTER38)+1, memset(TEMPCALLOCPOINTER38,0,runSumDist*sizeof(int32_t ) ) ); 
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

LocalTable *LocalTable_LocalTable ( struct LocalTable *LocalTableTHIS, const int64_t sz ) 
{ 

{ 
const int32_t X10_TEMP1 = 1 ; 
const int64_t mask = sz - X10_TEMP1 ; 
const int64_t X10_TEMP4 = mask ; 
LocalTableTHIS->mask = ( X10_TEMP4 ) ; 
const int32_t bound = /*casting*/( int32_t ) mask ; 
const int32_t X10_TEMP8 = 0 ; 
struct Region1 X10_TEMP9 = createNewRegion1R ( X10_TEMP8 , bound ) ; 
const place_t X10_TEMP10 = /* here  */ _here(); 
struct Dist1 X10_TEMP12 = getPlaceDist1 ( X10_TEMP9 , X10_TEMP10 ) ; 
struct Dist1 d = X10_TEMP12 ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER41;
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct longStub * ) ( TEMPCALLOCPOINTER41 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( longStub ))),   ((int32_t * )TEMPCALLOCPOINTER41)[0] = RX10_TEMP5, TEMPCALLOCPOINTER41 = ((int32_t * )TEMPCALLOCPOINTER41)+1, memset(TEMPCALLOCPOINTER41,0,RX10_TEMP5*sizeof(longStub ) ) ); 
/* finish  */ task_start_finish();

{ 
for ( int32_t RX10_TEMP7= 0; RX10_TEMP7<  RX10_TEMP4; RX10_TEMP7++ )
 
{ 
const place_t RX10_TEMP8 = /* here  */ _here(); 
const int32_t RX10_TEMP9 = /*PointAccess*/RX10_TEMP7 ; 
const place_t RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ _toplace(RX10_TEMP9 ); 
const int32_t RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int32_t RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct Dist1 RX10_TEMP13 = restrictDist1 ( d , RX10_TEMP10 ) ; 
struct Region1 RX10_TEMP14 = RX10_TEMP13 .dReg ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, LocalTableTHIS /*this*/, RX10_TEMP14 , RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC5) ;
a.size = sizeof(utmp5 );
a.params = (void *)(&utmp5 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER42;
/*VALUE ARRAY*/ struct longStub * const RX10_TEMP20 = (/*VALUE ARRAY*/ struct longStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER42 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( longStub ))),   ((int32_t * )TEMPCALLOCPOINTER42)[0] = RX10_TEMP4, TEMPCALLOCPOINTER42 = ((int32_t * )TEMPCALLOCPOINTER42)+1, memset(TEMPCALLOCPOINTER42,0,RX10_TEMP4*sizeof(longStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP22 = 0;RX10_TEMP22 < RX10_TEMP4; RX10_TEMP22++) 

{ 
struct longStub RX10_TEMP21 = RX10_TEMP6 [ RX10_TEMP22 ] 
; 
RX10_TEMP20[RX10_TEMP22] = RX10_TEMP21 ; 
} 
/*END OF ARRAY INIT*/struct longRefArray1 RX10_TEMP23  ; 
longRefArray1_longRefArray1( &RX10_TEMP23/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP20 ) ; 
struct longRefArray1 X10_TEMP18 = RX10_TEMP23 ; 
struct longRefArray1 X10_TEMP20 = X10_TEMP18 ; 
LocalTableTHIS->a = ( X10_TEMP20 ) ; 
} 

 return  LocalTableTHIS; 

} 
LocalTable* LocalTable_LocalTable_0(struct LocalTable *LocalTableTHIS){return LocalTableTHIS;}

void thread5 ( struct LocalTable *LocalTableTHIS,  struct T5 const utmpz ) 
{ 
struct Region1 RX10_TEMP14 = utmpz .RX10_TEMP14 ; 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int32_t RX10_TEMP17 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER44;
/*Updatable ARRAY*/ int64_t * const RX10_TEMP18 = (/*Updatable ARRAY*/ int64_t * ) ( TEMPCALLOCPOINTER44 = malloc(sizeof(int32_t)+(RX10_TEMP17*sizeof( int64_t ))),   ((int32_t * )TEMPCALLOCPOINTER44)[0] = RX10_TEMP17, TEMPCALLOCPOINTER44 = ((int32_t * )TEMPCALLOCPOINTER44)+1, memset(TEMPCALLOCPOINTER44,0,RX10_TEMP17*sizeof(int64_t ) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP15 = 0;RX10_TEMP15 < RX10_TEMP17; RX10_TEMP15++) 

{ 
const int32_t RX10_TEMP16 = /*PointAccess*/RX10_TEMP15 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP14 , RX10_TEMP16 ) ; 

{ 
const int64_t X10_TEMP16 = p .f0 ; 
RX10_TEMP18[RX10_TEMP15] = X10_TEMP16 ; 
} 
} 
/*END OF ARRAY INIT*/struct longStub RX10_TEMP19  ; 
longStub_longStub( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP18 ) ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, LocalTableTHIS /*this*/, RX10_TEMP19 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC6) ;
a.size = sizeof(utmp9 );
a.params = (void *)(&utmp9 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread9 ( struct LocalTable *LocalTableTHIS,  struct T9 const utmpz ) 
{ 
struct longStub RX10_TEMP19 = utmpz .RX10_TEMP19 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP19 ) ; 
} 
} 


FragmentedRandomAccess *FragmentedRandomAccess_FragmentedRandomAccess ( struct FragmentedRandomAccess *FragmentedRandomAccessTHIS) 
{ 

{ 
const int32_t X10_TEMP1 = 1 ; 
const int32_t X10_TEMP2 = /*program*/_FragmentedRandomAccess_logLocalTableSize ; 
const int64_t localTableSize = X10_TEMP1 << X10_TEMP2 ; 
const int32_t X10_TEMP4 = /*program*/_FragmentedRandomAccess_NUM_PLACES ; 
const int64_t tableSize = localTableSize * X10_TEMP4 ; 
struct Dist1 X10_TEMP7 = getUniqueDist ( ) ; 
struct Dist1 d = X10_TEMP7 ; 
struct Region1 RX10_TEMP0 = d .dReg ; 
const int32_t RX10_TEMP1 = 0 ; 
const int32_t RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/
int32_t RX10_TEMP3 = /* place.MAX_PLACES  */ _max_places(); 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ;; const int32_t RX10_TEMP4 = RX10_TEMP3 + 1; 
const int32_t RX10_TEMP5 = /*SimpleDistributionExpression*/ RX10_TEMP3 +1; 
void * TEMPCALLOCPOINTER46;
/*Updatable ARRAY*/ struct LocalTableStub * const RX10_TEMP6 = (/*Updatable ARRAY*/ struct LocalTableStub * ) ( TEMPCALLOCPOINTER46 = malloc(sizeof(int32_t)+(RX10_TEMP5*sizeof( LocalTableStub ))),   ((int32_t * )TEMPCALLOCPOINTER46)[0] = RX10_TEMP5, TEMPCALLOCPOINTER46 = ((int32_t * )TEMPCALLOCPOINTER46)+1, memset(TEMPCALLOCPOINTER46,0,RX10_TEMP5*sizeof(LocalTableStub ) ) ); 
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
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, FragmentedRandomAccessTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 , localTableSize ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC7) ;
a.size = sizeof(utmp4 );
a.params = (void *)(&utmp4 );
task_dispatch(a, RX10_TEMP10 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 
task_end_finish();
/*END OF FINISH*/
/*VALUE ARRAY FOR SURE*/
void * TEMPCALLOCPOINTER47;
/*VALUE ARRAY*/ struct LocalTableStub * const RX10_TEMP17 = (/*VALUE ARRAY*/ struct LocalTableStub * ) /*New VALUE ARRAY*/( TEMPCALLOCPOINTER47 = malloc(sizeof(int32_t)+(RX10_TEMP4*sizeof( LocalTableStub ))),   ((int32_t * )TEMPCALLOCPOINTER47)[0] = RX10_TEMP4, TEMPCALLOCPOINTER47 = ((int32_t * )TEMPCALLOCPOINTER47)+1, memset(TEMPCALLOCPOINTER47,0,RX10_TEMP4*sizeof(LocalTableStub )) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP19 = 0;RX10_TEMP19 < RX10_TEMP4; RX10_TEMP19++) 

{ 
struct LocalTableStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
RX10_TEMP17[RX10_TEMP19] = RX10_TEMP18 ; 
} 
/*END OF ARRAY INIT*/struct LocalTableRefArray1 RX10_TEMP20  ; 
LocalTableRefArray1_LocalTableRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP17 ) ; 
struct LocalTableRefArray1 X10_TEMP13 = RX10_TEMP20 ; 
struct LocalTableRefArray1 X10_TEMP15 = X10_TEMP13 ; 
FragmentedRandomAccessTHIS->table = ( X10_TEMP15 ) ; 
const int64_t X10_TEMP17 = tableSize ; 
FragmentedRandomAccessTHIS->tableSize = ( X10_TEMP17 ) ; 
const int64_t X10_TEMP18 = /*program*/_FragmentedRandomAccess_updates ; 
const int64_t X10_TEMP20 = X10_TEMP18 * tableSize ; 
const int64_t X10_TEMP21 = X10_TEMP20 ; 
FragmentedRandomAccessTHIS->numUpdates = ( X10_TEMP21 ) ; 
} 

 return  FragmentedRandomAccessTHIS; 

} 

void thread4 ( struct FragmentedRandomAccess *FragmentedRandomAccessTHIS,  struct T4 const utmpz ) 
{ 
const int32_t RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const place_t RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LocalTableStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 
const int64_t localTableSize = utmpz .localTableSize ; 

{ 
const int32_t RX10_TEMP14 = /*SimpleDistributionExpression*/ RX10_TEMP12 +1; 
void * TEMPCALLOCPOINTER49;
/*Updatable ARRAY*/ struct LocalTable * * const RX10_TEMP15 = (/*Updatable ARRAY*/ struct LocalTable * * ) ( TEMPCALLOCPOINTER49 = malloc(sizeof(int32_t)+(RX10_TEMP14*sizeof( LocalTable * ))),   ((int32_t * )TEMPCALLOCPOINTER49)[0] = RX10_TEMP14, TEMPCALLOCPOINTER49 = ((int32_t * )TEMPCALLOCPOINTER49)+1, memset(TEMPCALLOCPOINTER49,0,RX10_TEMP14*sizeof(LocalTable *) ) ); 

/*ArrayInitializer*/
for( int32_t RX10_TEMP13 = 0;RX10_TEMP13 < RX10_TEMP14; RX10_TEMP13++) 

{ 

{ 
struct LocalTable * X10_TEMP11 = (struct LocalTable  *)  malloc(sizeof(struct LocalTable ));  
memset(X10_TEMP11,0,sizeof(struct LocalTable )); 
LocalTable_LocalTable( X10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, localTableSize ) ; 
RX10_TEMP15[RX10_TEMP13] = X10_TEMP11 ; 
} 
} 
/*END OF ARRAY INIT*/struct LocalTableStub RX10_TEMP16  ; 
LocalTableStub_LocalTableStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, FragmentedRandomAccessTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
struct _struct_async a;
a.method = (ASYNC8) ;
a.size = sizeof(utmp8 );
a.params = (void *)(&utmp8 );
task_dispatch(a, RX10_TEMP8 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread8 ( struct FragmentedRandomAccess *FragmentedRandomAccessTHIS,  struct T8 const utmpz ) 
{ 
struct LocalTableStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int32_t RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LocalTableStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; 
} 
} 


LocalTableRefArray1 LocalTableRefArray1_LocalTableRefArray1 ( struct LocalTableRefArray1 *LocalTableRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct LocalTableStub * const contents_ ) 
{ 
LocalTableRefArray1THIS->distValue = ( distValue_ ) ; 
LocalTableRefArray1THIS->contents = ( contents_ ) ; 

 return  *LocalTableRefArray1THIS; 

} 

LocalTableStub LocalTableStub_LocalTableStub ( struct LocalTableStub *LocalTableStubTHIS, /*Updatable ARRAY*/ struct LocalTable * * const localArray_ ) 
{ 
LocalTableStubTHIS->localArray = ( localArray_ ) ; 

 return  *LocalTableStubTHIS; 

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

longStub longStub_longStub ( struct longStub *longStubTHIS, /*Updatable ARRAY*/ int64_t * const localArray_ ) 
{ 
longStubTHIS->localArray = ( localArray_ ) ; 

 return  *longStubTHIS; 

} 
/* class RunMain */ int32_t  runmain( ) 
{ 
_FragmentedRandomAccess_POLY = _FragmentedRandomAccess_POLY_init ( ) ; 
_FragmentedRandomAccess_PERIOD = _FragmentedRandomAccess_PERIOD_init ( ) ; 
_FragmentedRandomAccess_NUM_PLACES = _FragmentedRandomAccess_NUM_PLACES_init ( ) ; 
_FragmentedRandomAccess_logLocalTableSize = _FragmentedRandomAccess_logLocalTableSize_init ( ) ; 
_FragmentedRandomAccess_updates = _FragmentedRandomAccess_updates_init ( ) ; 
_FragmentedRandomAccess_PLACE_ID_MASK = _FragmentedRandomAccess_PLACE_ID_MASK_init ( ) ; 
runMain ( ) ; 
return 0;
} 
/*initilizing constants*/ void initconstants(){
_FragmentedRandomAccess_POLY = _FragmentedRandomAccess_POLY_init ( ) ; 
_FragmentedRandomAccess_PERIOD = _FragmentedRandomAccess_PERIOD_init ( ) ; 
_FragmentedRandomAccess_NUM_PLACES = _FragmentedRandomAccess_NUM_PLACES_init ( ) ; 
_FragmentedRandomAccess_logLocalTableSize = _FragmentedRandomAccess_logLocalTableSize_init ( ) ; 
_FragmentedRandomAccess_updates = _FragmentedRandomAccess_updates_init ( ) ; 
_FragmentedRandomAccess_PLACE_ID_MASK = _FragmentedRandomAccess_PLACE_ID_MASK_init ( ) ; 

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
		 fixPointerT6(((struct T6 * const )params), (params+sizeof(struct T6)));
		thread6(*(struct T6 * const )params);
		break;
	 case ASYNC4 :
		 fixPointerT7(((struct T7 * const )params), (params+sizeof(struct T7)));
		thread7(*(struct T7 * const )params);
		break;
	 case ASYNC5 :
		 fixPointerT5(((struct T5 * const )params), (params+sizeof(struct T5)));
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC6 :
		 fixPointerT9(((struct T9 * const )params), (params+sizeof(struct T9)));
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC7 :
		 fixPointerT4(((struct T4 * const )params), (params+sizeof(struct T4)));
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC8 :
		 fixPointerT8(((struct T8 * const )params), (params+sizeof(struct T8)));
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
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
		thread6(*(struct T6 * const )params);
		break;
	 case ASYNC4 :
		thread7(*(struct T7 * const )params);
		break;
	 case ASYNC5 :
		thread5(&(*((struct T5 * const )params)).THIS, *((struct T5 * const )params));
		break;
	 case ASYNC6 :
		thread9(&(*((struct T9 * const )params)).THIS, *((struct T9 * const )params));
		break;
	 case ASYNC7 :
		thread4(&(*((struct T4 * const )params)).THIS, *((struct T4 * const )params));
		break;
	 case ASYNC8 :
		thread8(&(*((struct T8 * const )params)).THIS, *((struct T8 * const )params));
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
		 sizeToMalloc = child.size+ getSizeOfT6((struct T6 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT6((struct T6 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC4 :
		 sizeToMalloc = child.size+ getSizeOfT7((struct T7 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT7((struct T7 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC5 :
		 sizeToMalloc = child.size+ getSizeOfT5((struct T5 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT5((struct T5 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC6 :
		 sizeToMalloc = child.size+ getSizeOfT9((struct T9 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT9((struct T9 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC7 :
		 sizeToMalloc = child.size+ getSizeOfT4((struct T4 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT4((struct T4 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 case ASYNC8 :
		 sizeToMalloc = child.size+ getSizeOfT8((struct T8 * const )child.params);
		buf = (void*) malloc(sizeToMalloc+headerSize);
	*bufSize = (sizeToMalloc+headerSize);
		memcpy((buf+headerSize), child.params, child.size);
		  deepCopyT8((struct T8 * const )child.params,(buf+headerSize+child.size));
		return buf;
	 default:
 
	fprintf(stderr, "%d:ERROR PROBLEM IN CODE METHOD NUMBER WRONG\n", _here());
	break;
}
}
int32_t getSizeOfDist1( struct Dist1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfRegion1(&(className -> dReg));
    temp += getSizeOfDist(&(className -> dDist));
return temp;
 }
int32_t getSizeOfLocalTableStub( struct LocalTableStub * className) {
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
return temp;
 }
int32_t getSizeOfT3( struct T3 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfPoint1(&(className -> pt));
    temp += getSizeOfLocalTableRefArray1(&(className -> table));
return temp;
 }
int32_t getSizeOfT2( struct T2 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLocalTableRefArray1(&(className -> table));
return temp;
 }
int32_t getSizeOfT6( struct T6 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOflongStub(&(className -> RX10_TEMP15));
return temp;
 }
int32_t getSizeOfT7( struct T7 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfLocalTableRefArray1(&(className -> table));
return temp;
 }
int32_t getSizeOfPoint1( struct Point1 * className) {
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
    temp += getSizeOfRegion1(&(className -> RX10_TEMP14));
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
    temp += getSizeOfLocalTableStub(&(className -> RX10_TEMP16));
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
int32_t getSizeOfT9( struct T9 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOflongStub(&(className -> RX10_TEMP19));
return temp;
 }
int32_t getSizeOfLocalTableRefArray1( struct LocalTableRefArray1 * className) {
    int32_t temp = 0;
    int32_t size = 0;
    temp += getSizeOfDist1(&(className -> distValue));
		temp += sizeof(int);
		size = *(((int32_t *)className -> contents)-1);
		temp += size*sizeof(LocalTableStub);
	for(int32_t i = 0; i<size; i++) {
		temp += getSizeOfLocalTableStub(&(className -> contents[i]));
	}
return temp;
 }
int32_t getSizeOflongStub( struct longStub * className) {
    int32_t temp = 0;
    int32_t size = 0;
return temp;
 }
void* deepCopyDist1( struct Dist1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyRegion1(&(className -> dReg), offset);
offset = deepCopyDist(&(className -> dDist), offset);
return offset;
 }
void* deepCopyLocalTableStub( struct LocalTableStub * className, void * offset) {
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
return offset;
 }
void* deepCopyT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyPoint1(&(className -> pt), offset);
offset = deepCopyLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void* deepCopyT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void* deepCopyT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopylongStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void* deepCopyT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void* deepCopyPoint1( struct Point1 * className, void * offset) {
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
offset = deepCopyRegion1(&(className -> RX10_TEMP14), offset);
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
offset = deepCopyLocalTableStub(&(className -> RX10_TEMP16), offset);
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
void* deepCopyT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopylongStub(&(className -> RX10_TEMP19), offset);
return offset;
 }
void* deepCopyLocalTableRefArray1( struct LocalTableRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset = deepCopyDist1(&(className -> distValue), offset);
size = *(((int32_t *)className -> contents)-1);
*((int32_t *)offset) = size;
offset += sizeof(int32_t);
temp = size*sizeof(LocalTableStub);
memcpy(offset, (void *) className -> contents, temp);
offset += temp;
    for(int32_t i = 0; i<size; i++) {
    offset = deepCopyLocalTableStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void* deepCopylongStub( struct longStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
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
void * fixPointerLocalTableStub( struct LocalTableStub * className, void * offset) {
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
return offset;
 }
void * fixPointerT3( struct T3 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerPoint1(&(className -> pt), offset);
offset  = fixPointerLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void * fixPointerT2( struct T2 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void * fixPointerT6( struct T6 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerlongStub(&(className -> RX10_TEMP15), offset);
return offset;
 }
void * fixPointerT7( struct T7 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerLocalTableRefArray1(&(className -> table), offset);
return offset;
 }
void * fixPointerPoint1( struct Point1 * className, void * offset) {
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
offset  = fixPointerRegion1(&(className -> RX10_TEMP14), offset);
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
offset  = fixPointerLocalTableStub(&(className -> RX10_TEMP16), offset);
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
void * fixPointerT9( struct T9 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerlongStub(&(className -> RX10_TEMP19), offset);
return offset;
 }
void * fixPointerLocalTableRefArray1( struct LocalTableRefArray1 * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
offset  = fixPointerDist1(&(className -> distValue), offset);
className -> contents = offset+sizeof(int32_t);
offset += sizeof(int32_t);
size = *(((int32_t *)className -> contents)-1);
offset += size*sizeof(LocalTableStub);
    for(int32_t i = 0; i<size; i++) {
    offset = fixPointerLocalTableStub(&(className -> contents[i]), offset);
    }
return offset;
 }
void * fixPointerlongStub( struct longStub * className, void * offset) {
    int32_t temp = 0;
    int32_t size = 0;
    int32_t i = 0;
return offset;
 }
