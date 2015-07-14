#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
#include "RunMain.h"
/* class Program */ 
struct Dist1 /*VALUE*/ UniqueDistribution ;
int _Timer_max_counters ;
void /*static*/Series_setSize (  struct Series  * const X10_TEMP0 , const int setsize ) 
{ 

{ 
const int X10_TEMP2 = setsize ; 
X10_TEMP0 ->setsize = ( X10_TEMP2 ) ; 
} 
} 

void /*static*/Series_initialise (  struct Series  * const X10_TEMP0 , const int n ) 
{ 

{ 
const int X10_TEMP2 = n ; 
X10_TEMP0 ->array_rows = ( X10_TEMP2 ) ; 
Series_buildTestData ( X10_TEMP0 ) ; 
} 
} 

void /*static*/Series_kernel (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
Series_Do ( X10_TEMP0 ) ; 
} 
} 

void /*static*/Series_initRefArray (  struct Series  * const X10_TEMP0 ,  struct doubleRefArray2 const ref ) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 0 ; 
const double X10_TEMP6 = 2.8729524964837996; 
const double X10_TEMP7 = X10_TEMP6 ; 
struct Point2 RX10_TEMP0  ; 
Point2_Point2( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP3 , X10_TEMP4 ) ; 
struct Dist2 RX10_TEMP1 = ref .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP3 , X10_TEMP7 ) ; 
const int X10_TEMP10 = 0 ; 
const int X10_TEMP11 = 1 ; 
const double X10_TEMP13 = 0.0; 
const double X10_TEMP14 = X10_TEMP13 ; 
struct Point2 RX10_TEMP11  ; 
Point2_Point2( &RX10_TEMP11/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP10 , X10_TEMP11 ) ; 
struct Dist2 RX10_TEMP12 = ref .distValue ; 
struct Region2 RX10_TEMP13 = RX10_TEMP12 .dReg ; 
const int RX10_TEMP14 = searchPointInRegion2 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int RX10_TEMP15 = 0 ; 
const int RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP18 = getPlaceFromDist2 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const int RX10_TEMP20 = /* here  */ 0 ; 
const int RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP19 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP19 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP14 , X10_TEMP14 ) ; 
const int X10_TEMP17 = 1 ; 
const int X10_TEMP18 = 0 ; 
const double X10_TEMP20 = 1.1161046676147888; 
const double X10_TEMP21 = X10_TEMP20 ; 
struct Point2 RX10_TEMP22  ; 
Point2_Point2( &RX10_TEMP22/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP17 , X10_TEMP18 ) ; 
struct Dist2 RX10_TEMP23 = ref .distValue ; 
struct Region2 RX10_TEMP24 = RX10_TEMP23 .dReg ; 
const int RX10_TEMP25 = searchPointInRegion2 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int RX10_TEMP26 = 0 ; 
const int RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP29 = getPlaceFromDist2 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const int RX10_TEMP31 = /* here  */ 0 ; 
const int RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP30 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP25 , X10_TEMP21 ) ; 
const int X10_TEMP24 = 1 ; 
const int X10_TEMP25 = 1 ; 
const double X10_TEMP26 = 1.8819691893398025; 
const int X10_TEMP27 = 0 ; 
const double X10_TEMP29 = X10_TEMP27 - X10_TEMP26 ; 
const double X10_TEMP30 = X10_TEMP29 ; 
struct Point2 RX10_TEMP33  ; 
Point2_Point2( &RX10_TEMP33/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP24 , X10_TEMP25 ) ; 
struct Dist2 RX10_TEMP34 = ref .distValue ; 
struct Region2 RX10_TEMP35 = RX10_TEMP34 .dReg ; 
const int RX10_TEMP36 = searchPointInRegion2 ( RX10_TEMP35 , RX10_TEMP33 ) ; 
const int RX10_TEMP37 = 0 ; 
const int RX10_TEMP38 = RX10_TEMP36 < RX10_TEMP37 ; 
if ( RX10_TEMP38 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP39 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP39 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP40 = getPlaceFromDist2 ( RX10_TEMP34 , RX10_TEMP36 ) ; 
const int RX10_TEMP42 = /* here  */ 0 ; 
const int RX10_TEMP43 = RX10_TEMP40 != RX10_TEMP42 ; 
if ( RX10_TEMP43 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP41 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP36 , X10_TEMP30 ) ; 
const int X10_TEMP33 = 2 ; 
const int X10_TEMP34 = 0 ; 
const double X10_TEMP36 = 0.34429060398168704; 
const double X10_TEMP37 = X10_TEMP36 ; 
struct Point2 RX10_TEMP44  ; 
Point2_Point2( &RX10_TEMP44/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP33 , X10_TEMP34 ) ; 
struct Dist2 RX10_TEMP45 = ref .distValue ; 
struct Region2 RX10_TEMP46 = RX10_TEMP45 .dReg ; 
const int RX10_TEMP47 = searchPointInRegion2 ( RX10_TEMP46 , RX10_TEMP44 ) ; 
const int RX10_TEMP48 = 0 ; 
const int RX10_TEMP49 = RX10_TEMP47 < RX10_TEMP48 ; 
if ( RX10_TEMP49 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP50 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP50 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP51 = getPlaceFromDist2 ( RX10_TEMP45 , RX10_TEMP47 ) ; 
const int RX10_TEMP53 = /* here  */ 0 ; 
const int RX10_TEMP54 = RX10_TEMP51 != RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP52 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP47 , X10_TEMP37 ) ; 
const int X10_TEMP40 = 2 ; 
const int X10_TEMP41 = 1 ; 
const double X10_TEMP42 = 1.1645642623320958; 
const int X10_TEMP43 = 0 ; 
const double X10_TEMP45 = X10_TEMP43 - X10_TEMP42 ; 
const double X10_TEMP46 = X10_TEMP45 ; 
struct Point2 RX10_TEMP55  ; 
Point2_Point2( &RX10_TEMP55/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP40 , X10_TEMP41 ) ; 
struct Dist2 RX10_TEMP56 = ref .distValue ; 
struct Region2 RX10_TEMP57 = RX10_TEMP56 .dReg ; 
const int RX10_TEMP58 = searchPointInRegion2 ( RX10_TEMP57 , RX10_TEMP55 ) ; 
const int RX10_TEMP59 = 0 ; 
const int RX10_TEMP60 = RX10_TEMP58 < RX10_TEMP59 ; 
if ( RX10_TEMP60 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP61 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP61 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP62 = getPlaceFromDist2 ( RX10_TEMP56 , RX10_TEMP58 ) ; 
const int RX10_TEMP64 = /* here  */ 0 ; 
const int RX10_TEMP65 = RX10_TEMP62 != RX10_TEMP64 ; 
if ( RX10_TEMP65 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP63 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP63 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP58 , X10_TEMP46 ) ; 
const int X10_TEMP49 = 3 ; 
const int X10_TEMP50 = 0 ; 
const double X10_TEMP52 = 0.15238898702519288; 
const double X10_TEMP53 = X10_TEMP52 ; 
struct Point2 RX10_TEMP66  ; 
Point2_Point2( &RX10_TEMP66/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP49 , X10_TEMP50 ) ; 
struct Dist2 RX10_TEMP67 = ref .distValue ; 
struct Region2 RX10_TEMP68 = RX10_TEMP67 .dReg ; 
const int RX10_TEMP69 = searchPointInRegion2 ( RX10_TEMP68 , RX10_TEMP66 ) ; 
const int RX10_TEMP70 = 0 ; 
const int RX10_TEMP71 = RX10_TEMP69 < RX10_TEMP70 ; 
if ( RX10_TEMP71 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP72 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP72 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP73 = getPlaceFromDist2 ( RX10_TEMP67 , RX10_TEMP69 ) ; 
const int RX10_TEMP75 = /* here  */ 0 ; 
const int RX10_TEMP76 = RX10_TEMP73 != RX10_TEMP75 ; 
if ( RX10_TEMP76 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP74 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP74 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP69 , X10_TEMP53 ) ; 
const int X10_TEMP56 = 3 ; 
const int X10_TEMP57 = 1 ; 
const double X10_TEMP58 = 0.8143461113044298; 
const int X10_TEMP59 = 0 ; 
const double X10_TEMP61 = X10_TEMP59 - X10_TEMP58 ; 
const double X10_TEMP62 = X10_TEMP61 ; 
struct Point2 RX10_TEMP77  ; 
Point2_Point2( &RX10_TEMP77/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP56 , X10_TEMP57 ) ; 
struct Dist2 RX10_TEMP78 = ref .distValue ; 
struct Region2 RX10_TEMP79 = RX10_TEMP78 .dReg ; 
const int RX10_TEMP80 = searchPointInRegion2 ( RX10_TEMP79 , RX10_TEMP77 ) ; 
const int RX10_TEMP81 = 0 ; 
const int RX10_TEMP82 = RX10_TEMP80 < RX10_TEMP81 ; 
if ( RX10_TEMP82 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP83 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP83 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP84 = getPlaceFromDist2 ( RX10_TEMP78 , RX10_TEMP80 ) ; 
const int RX10_TEMP86 = /* here  */ 0 ; 
const int RX10_TEMP87 = RX10_TEMP84 != RX10_TEMP86 ; 
if ( RX10_TEMP87 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP85 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP85 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( ref , RX10_TEMP80 , X10_TEMP62 ) ; 
} 
} 

void /*static*/Series_validate (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 3 ; 
const int X10_TEMP7 = 0 ; 
const int X10_TEMP8 = 1 ; 
struct Region2 r = createNewRegion2RR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP7 , X10_TEMP8 ) ; 
const int X10_TEMP10 = /* here  */ 0 ; 
struct Dist2 vd = getPlaceDist2 ( r , X10_TEMP10 ) ; 
struct Region2 RX10_TEMP0 = vd .dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (doubleStub *)calloc(RX10_TEMP5,sizeof( doubleStub )); 
/* finish  */ 
{ 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ 
const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount2 ( vd , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T1 utmp1  ; 
T1_T1( &utmp1/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread1 (utmp1 );

}/*END OF ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP4 = (doubleStub *)calloc(RX10_TEMP4,sizeof( doubleStub )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < RX10_TEMP4 ; SX10_TEMP5 ++ ) 
{ 
const int RX10_TEMP19 = SX10_TEMP5 ; 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
SX10_TEMP4 [ RX10_TEMP19 ] = RX10_TEMP18 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP17 = SX10_TEMP4 ; 
struct doubleRefArray2 RX10_TEMP20  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, vd , RX10_TEMP17 ) ; 
struct doubleRefArray2 ref = RX10_TEMP20 ; 
Series_initRefArray ( X10_TEMP0 , ref ) ; 
struct Region2 RX10_TEMP23 = vd .dReg ; 
const int RX10_TEMP26 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP24 = RX10_TEMP23 .regSize ; 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP26 ; const int SX10_TEMP6 = 1 ; 
const int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP6 ; 
for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < RX10_TEMP25 ; SX10_TEMP7 ++ ) 
{ 
const int RX10_TEMP21 = SX10_TEMP7 ; 
const int RX10_TEMP27 = RX10_TEMP21 ; 
struct Point2 RX10_TEMP22 = regionOrdinalPoint2 ( RX10_TEMP23 , RX10_TEMP27 ) ; 
const int i = RX10_TEMP22 .f0 ; 
const int j = RX10_TEMP22 .f1 ; 

{ 
const int ii = i ; 
const int jj = j ; 
/*UpdatableVariableDeclaration*/double cval = 0 ; 
const int curr_place = /* here  */ 0 ; 
const int X10_TEMP23 = 0 ; 
const int X10_TEMP24 = 0 ; 
struct Region1 tempr = createNewRegion1R ( X10_TEMP23 , X10_TEMP24 ) ; 
const int X10_TEMP26 = /* here  */ 0 ; 
struct Dist1 tempvd = getPlaceDist1 ( tempr , X10_TEMP26 ) ; 
struct Region1 RX10_TEMP28 = tempvd .dReg ; 
const int RX10_TEMP29 = 0 ; 
const int RX10_TEMP30 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP31 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP31 = RX10_TEMP31 - RX10_TEMP30 ; const int SX10_TEMP8 = 1 ; 
const int RX10_TEMP32 = RX10_TEMP31 + SX10_TEMP8 ; 
const int SX10_TEMP9 = 1 ; 
const int RX10_TEMP33 = RX10_TEMP31 + SX10_TEMP9 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = (doubleStub *)calloc(RX10_TEMP33,sizeof( doubleStub )); 
/* finish  */ 
{ 
for ( int SX10_TEMP11 = 0 ; SX10_TEMP11 < RX10_TEMP32 ; SX10_TEMP11 ++ ) 
{ 
const int RX10_TEMP35 = SX10_TEMP11 ; 
const int RX10_TEMP36 = /* here  */ 0 ; 
const int RX10_TEMP37 = RX10_TEMP35 ; 
const int RX10_TEMP38 = /* place.places ( RX10_TEMP37 )  */ 0 
; 
const int RX10_TEMP39 = getDistLocalCount1 ( tempvd , RX10_TEMP37 ) ; 
const int RX10_TEMP40 = RX10_TEMP39 - RX10_TEMP30 ; 
struct T2 utmp2  ; 
T2_T2( &utmp2/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP40 , RX10_TEMP36 , RX10_TEMP35 , RX10_TEMP34 ) ; 
/* async  */
 {
thread2 (utmp2 );

}/*END OF ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP12 = (doubleStub *)calloc(RX10_TEMP32,sizeof( doubleStub )); 
for ( int SX10_TEMP13 = 0 ; SX10_TEMP13 < RX10_TEMP32 ; SX10_TEMP13 ++ ) 
{ 
const int RX10_TEMP47 = SX10_TEMP13 ; 
struct doubleStub RX10_TEMP46 = RX10_TEMP34 [ RX10_TEMP47 ] 
; 
SX10_TEMP12 [ RX10_TEMP47 ] = RX10_TEMP46 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP45 = SX10_TEMP12 ; 
struct doubleRefArray1 RX10_TEMP48  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP48/*OBJECT INIT IN ASSIGNMENT*/, tempvd , RX10_TEMP45 ) ; 
struct doubleRefArray1 tempref = RX10_TEMP48 ; 
struct doubleRefArray2 tA = X10_TEMP0 ->testArray ; 
/* finish  */ 
{ 
struct doubleRefArray2 X10_TEMP32 = X10_TEMP0 ->testArray ; 
struct Dist2 RX10_TEMP49 = X10_TEMP32 .distValue ; 
struct Dist2 X10_TEMP33 = RX10_TEMP49 ; 
struct Point2 RX10_TEMP50  ; 
Point2_Point2( &RX10_TEMP50/*OBJECT INIT IN ASSIGNMENT*/, j , i ) ; 
struct Region2 RX10_TEMP51 = X10_TEMP33 .dReg ; 
const int RX10_TEMP52 = searchPointInRegion2 ( RX10_TEMP51 , RX10_TEMP50 ) ; 
const int RX10_TEMP53 = 0 ; 
const int RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ 
const char * RX10_TEMP55 = "Point RX10_TEMP50 not found in the distribution X10_TEMP33." ; 
fprintf(stderr, RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP56 = getPlaceFromDist2 ( X10_TEMP33 , RX10_TEMP52 ) ; 
const int X10_TEMP37 = RX10_TEMP56 ; 
struct T3 utmp3  ; 
T3_T3( &utmp3/*OBJECT INIT IN ASSIGNMENT*/, tA , tempref , curr_place , jj , ii ) ; 
/* async  */
 {
thread3 (utmp3 );

}/*END OF ASYNC*/
} 

const int X10_TEMP47 = 0 ; 
struct Point1 RX10_TEMP80  ; 
Point1_Point1( &RX10_TEMP80/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP47 ) ; 
struct Dist1 RX10_TEMP81 = tempref .distValue ; 
struct Region1 RX10_TEMP82 = RX10_TEMP81 .dReg ; 
const int RX10_TEMP83 = searchPointInRegion1 ( RX10_TEMP82 , RX10_TEMP80 ) ; 
const int RX10_TEMP84 = 0 ; 
const int RX10_TEMP85 = RX10_TEMP83 < RX10_TEMP84 ; 
if ( RX10_TEMP85 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP86 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP86 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP87 = getPlaceFromDist1 ( RX10_TEMP81 , RX10_TEMP83 ) ; 
const int RX10_TEMP89 = /* here  */ 0 ; 
const int RX10_TEMP90 = RX10_TEMP87 != RX10_TEMP89 ; 
if ( RX10_TEMP90 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP88 = "Bad place access for array tempref" ; 
fprintf(stderr, RX10_TEMP88 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP91 = getRefArrayValue1double ( tempref , RX10_TEMP83 ) ; 
const double X10_TEMP49 = RX10_TEMP91 ; 
cval = X10_TEMP49 ; struct Point2 RX10_TEMP92  ; 
Point2_Point2( &RX10_TEMP92/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP93 = ref .distValue ; 
struct Region2 RX10_TEMP94 = RX10_TEMP93 .dReg ; 
const int RX10_TEMP95 = searchPointInRegion2 ( RX10_TEMP94 , RX10_TEMP92 ) ; 
const int RX10_TEMP96 = 0 ; 
const int RX10_TEMP97 = RX10_TEMP95 < RX10_TEMP96 ; 
if ( RX10_TEMP97 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP98 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP98 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP99 = getPlaceFromDist2 ( RX10_TEMP93 , RX10_TEMP95 ) ; 
const int RX10_TEMP101 = /* here  */ 0 ; 
const int RX10_TEMP102 = RX10_TEMP99 != RX10_TEMP101 ; 
if ( RX10_TEMP102 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP100 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP100 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP103 = getRefArrayValue2double ( ref , RX10_TEMP95 ) ; 
const double X10_TEMP52 = RX10_TEMP103 ; 
const double X10_TEMP54 = cval - X10_TEMP52 ; 
/*UpdatableVariableDeclaration*/double error = fabs ( X10_TEMP54 ) ; 
const double X10_TEMP56 = 1.0e-12; 
const int X10_TEMP58 = error > X10_TEMP56 ; 
if ( X10_TEMP58 ) 
{ 

{ 
const char * X10_TEMP59 = "Validation failed for coefficient " ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC1, "%s%d",X10_TEMP59,j);
const char * X10_TEMP60 = tempC1;; 
const char * X10_TEMP61 = "," ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC2, "%s%s",X10_TEMP60,X10_TEMP61);
const char * X10_TEMP62 = tempC2;; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC3, "%s%d",X10_TEMP62,i);
const char * X10_TEMP64 = tempC3;; 
printf( "%s\n",X10_TEMP64 ) ; 
const char * X10_TEMP65 = "Computed value = " ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC4, "%s%f",X10_TEMP65,cval);
const char * X10_TEMP67 = tempC4;; 
printf( "%s\n",X10_TEMP67 ) ; 
const char * X10_TEMP70 = "Reference value = " ; 
struct Point2 RX10_TEMP104  ; 
Point2_Point2( &RX10_TEMP104/*OBJECT INIT IN ASSIGNMENT*/, i , j ) ; 
struct Dist2 RX10_TEMP105 = ref .distValue ; 
struct Region2 RX10_TEMP106 = RX10_TEMP105 .dReg ; 
const int RX10_TEMP107 = searchPointInRegion2 ( RX10_TEMP106 , RX10_TEMP104 ) ; 
const int RX10_TEMP108 = 0 ; 
const int RX10_TEMP109 = RX10_TEMP107 < RX10_TEMP108 ; 
if ( RX10_TEMP109 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP110 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP110 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP111 = getPlaceFromDist2 ( RX10_TEMP105 , RX10_TEMP107 ) ; 
const int RX10_TEMP113 = /* here  */ 0 ; 
const int RX10_TEMP114 = RX10_TEMP111 != RX10_TEMP113 ; 
if ( RX10_TEMP114 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP112 = "Bad place access for array ref" ; 
fprintf(stderr, RX10_TEMP112 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP115 = getRefArrayValue2double ( ref , RX10_TEMP107 ) ; 
const double X10_TEMP71 = RX10_TEMP115 ; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC5, "%s%f",X10_TEMP70,X10_TEMP71);
const char * X10_TEMP73 = tempC5;; 
printf( "%s\n",X10_TEMP73 ) ; 
const char * X10_TEMP75 = "Validation failed" ; 
fprintf(stderr, X10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 
} 

} 
} 

} 
} 

void /*static*/Series_tidyup (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
Series_freeTestData ( X10_TEMP0 ) ; 
} 
} 

void /*static*/Series_run (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 0 ; 
struct Region1 tempregion = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const int X10_TEMP6 = /* here  */ 0 ; 
struct Dist1 tempdist = getPlaceDist1 ( tempregion , X10_TEMP6 ) ; 
/*UpdatableVariableDeclaration*/int j = 10000 ; 
struct Region1 RX10_TEMP1 = tempdist .dReg ; 
const int RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP2 = RX10_TEMP1 .regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP3 ; SX10_TEMP1 ++ ) 
{ 
const int RX10_TEMP0 = SX10_TEMP1 ; 
const int RX10_TEMP5 = RX10_TEMP0 ; 
struct Point1 i = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 

{ 
const int X10_TEMP11 = 1 ; 
Series_setSize ( X10_TEMP0 , X10_TEMP11 ) ; 
const int X10_TEMP14 = 100 ; 
const int X10_TEMP15 = 1 ; 
const double X10_TEMP16 = pow ( X10_TEMP14 , X10_TEMP15 ) ; 
const double X10_TEMP18 = j * X10_TEMP16 ; 
const int X10_TEMP20 = /*casting*/( int ) X10_TEMP18 ; 
Series_initialise ( X10_TEMP0 , X10_TEMP20 ) ; 
Series_kernel ( X10_TEMP0 ) ; 
} 
} 

Series_tidyup ( X10_TEMP0 ) ; 
} 
} 

void /*static*/Series_buildTestData (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 1 ; 
const int X10_TEMP9 = 0 ; 
const int X10_TEMP6 = X10_TEMP0 ->array_rows ; 
const int X10_TEMP7 = 1 ; 
const int X10_TEMP10 = X10_TEMP6 - X10_TEMP7 ; 
struct Region2 R = createNewRegion2RR ( X10_TEMP3 , X10_TEMP4 , X10_TEMP9 , X10_TEMP10 ) ; 
struct Dist2 X10_TEMP13 = getBlockDist2 ( R ) ; 
struct Dist2 d = X10_TEMP13 ; 
struct Region2 RX10_TEMP0 = d .dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = (doubleStub *)calloc(RX10_TEMP5,sizeof( doubleStub )); 
/* finish  */ 
{ 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ 
const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount2 ( d , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T4 utmp4  ; 
T4_T4( &utmp4/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread4 (utmp4 );

}/*END OF ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP4 = (doubleStub *)calloc(RX10_TEMP4,sizeof( doubleStub )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < RX10_TEMP4 ; SX10_TEMP5 ++ ) 
{ 
const int RX10_TEMP18 = SX10_TEMP5 ; 
struct doubleStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
SX10_TEMP4 [ RX10_TEMP18 ] = RX10_TEMP17 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP16 = SX10_TEMP4 ; 
struct doubleRefArray2 RX10_TEMP19  ; 
doubleRefArray2_doubleRefArray2( &RX10_TEMP19/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP16 ) ; 
struct doubleRefArray2 X10_TEMP15 = RX10_TEMP19 ; 
struct doubleRefArray2 X10_TEMP17 = X10_TEMP15 ; 
X10_TEMP0 ->testArray = ( X10_TEMP17 ) ; 
} 
} 

void /*static*/Series_Do (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
struct doubleRefArray2 X10_TEMP1 = X10_TEMP0 ->testArray ; 
const int X10_TEMP4 = 0 ; 
const int X10_TEMP5 = 0 ; 
const double X10_TEMP6 = 0.0; 
const double X10_TEMP14 = /*casting*/( double ) X10_TEMP6 ; 
const double X10_TEMP8 = 2.0; 
const double X10_TEMP15 = /*casting*/( double ) X10_TEMP8 ; 
const int X10_TEMP16 = 1000 ; 
const double X10_TEMP11 = 0.0; 
const double X10_TEMP17 = /*casting*/( double ) X10_TEMP11 ; 
const int X10_TEMP18 = 0 ; 
const double X10_TEMP20 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 , X10_TEMP18 ) ; 
const double X10_TEMP19 = 2.0; 
const double X10_TEMP21 = /*casting*/( double ) X10_TEMP19 ; 
const double X10_TEMP23 = X10_TEMP20 / X10_TEMP21 ; 
const double X10_TEMP24 = X10_TEMP23 ; 
struct Point2 RX10_TEMP0  ; 
Point2_Point2( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP4 , X10_TEMP5 ) ; 
struct Dist2 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region2 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion2 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist2 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP24 ) ; 
const double X10_TEMP25 = 3.1415926535897932; 
const double omega = /*casting*/( double ) X10_TEMP25 ; 
struct Dist1 X10_TEMP27 = /*program*/UniqueDistribution ; 
struct Dist1 U = X10_TEMP27 ; 
struct doubleRefArray2 tA = X10_TEMP0 ->testArray ; 
/* finish  */ 
{ 

{ 
struct Region1 RX10_TEMP12 = U .dReg ; 
const int RX10_TEMP15 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP13 = RX10_TEMP12 .regSize ; 
RX10_TEMP13 = RX10_TEMP13 - RX10_TEMP15 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP14 = RX10_TEMP13 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP14 ; SX10_TEMP1 ++ ) 
{ 
const int RX10_TEMP11 = SX10_TEMP1 ; 
const int RX10_TEMP16 = RX10_TEMP11 ; 
struct Point1 p = regionOrdinalPoint1 ( RX10_TEMP12 , RX10_TEMP16 ) ; 
struct Region1 RX10_TEMP17 = U .dReg ; 
const int RX10_TEMP18 = searchPointInRegion1 ( RX10_TEMP17 , p ) ; 
const int RX10_TEMP19 = 0 ; 
const int RX10_TEMP20 = RX10_TEMP18 < RX10_TEMP19 ; 
if ( RX10_TEMP20 ) 
{ 
const char * RX10_TEMP21 = "Point p not found in the distribution U." ; 
fprintf(stderr, RX10_TEMP21 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP22 = getPlaceFromDist1 ( U , RX10_TEMP18 ) ; 
const int X10_TEMP31 = RX10_TEMP22 ; 
struct T5 utmp5  ; 
T5_T5( &utmp5/*OBJECT INIT IN ASSIGNMENT*/, p , tA , U , omega , X10_TEMP0 ) ; 
/* async  */
 {
thread5 (utmp5 );

}/*END OF ASYNC*/
} 

} 
} 

} 
} 

double /*static*/Series_TrapezoidIntegrate (  struct Series  * const X10_TEMP0 , const double x0 , const double x1 , const int a_nsteps , const double omegan , const int select ) 
{ 

{ 
/*UpdatableVariableDeclaration*/double x = 0.0; 
/*UpdatableVariableDeclaration*/double dx = 0.0; 
/*UpdatableVariableDeclaration*/double rvalue = 0.0; 
/*UpdatableVariableDeclaration*/int nsteps = a_nsteps ; 
x = x0 ; const double X10_TEMP7 = x1 - x0 ; 
const double X10_TEMP8 = /*casting*/( double ) nsteps ; 
const double X10_TEMP10 = X10_TEMP7 / X10_TEMP8 ; 
dx = X10_TEMP10 ; const double X10_TEMP15 = Series_thefunction ( X10_TEMP0 , x0 , omegan , select ) ; 
const double X10_TEMP14 = 2.0; 
const double X10_TEMP16 = /*casting*/( double ) X10_TEMP14 ; 
const double X10_TEMP18 = X10_TEMP15 / X10_TEMP16 ; 
rvalue = X10_TEMP18 ; const int X10_TEMP19 = 1 ; 
const int X10_TEMP21 = nsteps != X10_TEMP19 ; 
if ( X10_TEMP21 ) 
{ 

{ 
const int X10_TEMP22 = nsteps ; 
const int X10_TEMP23 = 1 ; 
nsteps = nsteps - X10_TEMP23 ; const int X10_TEMP24 = nsteps ; 
const int X10_TEMP25 = 1 ; 
nsteps = nsteps - X10_TEMP25 ; const int X10_TEMP26 = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP30 = nsteps > X10_TEMP26 ; 

while ( X10_TEMP30 ) 
{ 

{ 
const double X10_TEMP32 = x + dx ; 
x = X10_TEMP32 ; const double X10_TEMP36 = Series_thefunction ( X10_TEMP0 , x , omegan , select ) ; 
const double X10_TEMP38 = rvalue + X10_TEMP36 ; 
rvalue = X10_TEMP38 ; const int X10_TEMP39 = nsteps ; 
const int X10_TEMP40 = 1 ; 
nsteps = nsteps - X10_TEMP40 ; } 
const int X10_TEMP28 = 0 ; 
X10_TEMP30 = nsteps > X10_TEMP28 ; } 

} 
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
} 

double /*static*/Series_thefunction (  struct Series  * const X10_TEMP0 , const double x , const double omegan , const int select ) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
const int X10_TEMP13 = 1 ; 
const int X10_TEMP27 = 2 ; 
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
} 

void /*static*/Series_freeTestData (  struct Series  * const X10_TEMP0 ) 
{ 

{ 
} 
} 

void /*static*/runMain ( ) 
{ 

{ 
/*UpdatableVariableDeclaration*/ struct Timer  * tmr = (struct Timer  *) malloc(sizeof(struct Timer ));  
Timer_Timer( tmr/*OBJECT INIT IN ASSIGNMENT*/) ; 
/*UpdatableVariableDeclaration*/int count = 0 ; 
/* finish  */ 
{ 

{ 
Timer_start ( tmr , count ) ; 
} 
} 

/* finish  */ 
{ 

{ 
struct Series * X10_TEMP4 = (struct Series  *)  malloc(sizeof(struct Series ));  
Series_Series( X10_TEMP4/*OBJECT INIT IN ASSIGNMENT*/) ; 
Series_run ( X10_TEMP4 ) ; 
} 
} 

Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for series: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC6, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC6;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(1000 * sizeof(char));
sprintf(tempC7, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC7;; 
printf( "%s\n",X10_TEMP12 ) ; 
} 
} 

int /*static*/_Timer_max_counters_init ( ) 
{ 
const int X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) 
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
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; 
} 
} 

void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) 
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
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
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
const int RX10_TEMP15 = searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; 
const int RX10_TEMP16 = 0 ; 
const int RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; 
if ( RX10_TEMP17 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP18 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP18 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP19 = getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; 
const int RX10_TEMP21 = /* here  */ 0 ; 
const int RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; 
if ( RX10_TEMP22 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP20 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; 
struct doubleRefArray1 X10_TEMP10 = X10_TEMP0 ->elapsed_time ; 
struct doubleRefArray1 X10_TEMP12 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP23  ; 
Point1_Point1( &RX10_TEMP23/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP24 = X10_TEMP12 .distValue ; 
struct Region1 RX10_TEMP25 = RX10_TEMP24 .dReg ; 
const int RX10_TEMP26 = searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; 
const int RX10_TEMP27 = 0 ; 
const int RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; 
if ( RX10_TEMP28 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP29 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP29 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP30 = getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; 
const int RX10_TEMP32 = /* here  */ 0 ; 
const int RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32 ; 
if ( RX10_TEMP33 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; 
fprintf(stderr, RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP34 = getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; 
const double X10_TEMP14 = RX10_TEMP34 ; 
const int X10_TEMP15 = 1000 ; 
const double X10_TEMP17 = X10_TEMP14 / X10_TEMP15 ; 
const double X10_TEMP18 = X10_TEMP17 ; 
struct Point1 RX10_TEMP35  ; 
Point1_Point1( &RX10_TEMP35/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP36 = X10_TEMP10 .distValue ; 
struct Region1 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int RX10_TEMP38 = searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; 
const int RX10_TEMP39 = 0 ; 
const int RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP41 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP42 = getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const int RX10_TEMP44 = /* here  */ 0 ; 
const int RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP43 = "Bad place access for array X10_TEMP10" ; 
fprintf(stderr, RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 , X10_TEMP18 ) ; 
struct doubleRefArray1 X10_TEMP19 = X10_TEMP0 ->total_time ; 
struct doubleRefArray1 X10_TEMP21 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP46  ; 
Point1_Point1( &RX10_TEMP46/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP47 = X10_TEMP21 .distValue ; 
struct Region1 RX10_TEMP48 = RX10_TEMP47 .dReg ; 
const int RX10_TEMP49 = searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; 
const int RX10_TEMP50 = 0 ; 
const int RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; 
if ( RX10_TEMP51 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP52 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP52 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP53 = getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; 
const int RX10_TEMP55 = /* here  */ 0 ; 
const int RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP54 = "Bad place access for array X10_TEMP21" ; 
fprintf(stderr, RX10_TEMP54 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP57 = getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ; 
const double X10_TEMP25 = RX10_TEMP57 ; 
struct doubleRefArray1 X10_TEMP23 = X10_TEMP0 ->elapsed_time ; 
struct Point1 RX10_TEMP58  ; 
Point1_Point1( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP59 = X10_TEMP23 .distValue ; 
struct Region1 RX10_TEMP60 = RX10_TEMP59 .dReg ; 
const int RX10_TEMP61 = searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; 
const int RX10_TEMP62 = 0 ; 
const int RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; 
if ( RX10_TEMP63 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP64 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP65 = getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; 
const int RX10_TEMP67 = /* here  */ 0 ; 
const int RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; 
if ( RX10_TEMP68 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; 
fprintf(stderr, RX10_TEMP66 ) ; 
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
const int RX10_TEMP73 = searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; 
const int RX10_TEMP74 = 0 ; 
const int RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; 
if ( RX10_TEMP75 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP76 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP77 = getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; 
const int RX10_TEMP79 = /* here  */ 0 ; 
const int RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; 
if ( RX10_TEMP80 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP78 = "Bad place access for array X10_TEMP19" ; 
fprintf(stderr, RX10_TEMP78 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; 
} 
} 

double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) 
{ 

{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
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

{ 
struct doubleRefArray1 X10_TEMP1 = X10_TEMP0 ->total_time ; 
const double X10_TEMP4 = 0 ; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 RX10_TEMP0  ; 
Point1_Point1( &RX10_TEMP0/*OBJECT INIT IN ASSIGNMENT*/, n ) ; 
struct Dist1 RX10_TEMP1 = X10_TEMP1 .distValue ; 
struct Region1 RX10_TEMP2 = RX10_TEMP1 .dReg ; 
const int RX10_TEMP3 = searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; 
const int RX10_TEMP4 = 0 ; 
const int RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; 
if ( RX10_TEMP5 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP6 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP6 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP7 = getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; 
const int RX10_TEMP9 = /* here  */ 0 ; 
const int RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; 
if ( RX10_TEMP10 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; 
fprintf(stderr, RX10_TEMP8 ) ; 
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
const int RX10_TEMP14 = searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; 
const int RX10_TEMP15 = 0 ; 
const int RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP17 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP18 = getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; 
const int RX10_TEMP20 = /* here  */ 0 ; 
const int RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; 
if ( RX10_TEMP21 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; 
fprintf(stderr, RX10_TEMP19 ) ; 
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
const int RX10_TEMP25 = searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; 
const int RX10_TEMP26 = 0 ; 
const int RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; 
if ( RX10_TEMP27 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP28 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP28 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP29 = getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; 
const int RX10_TEMP31 = /* here  */ 0 ; 
const int RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; 
if ( RX10_TEMP32 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; 
fprintf(stderr, RX10_TEMP30 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; 
} 
} 

void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) 
{ 

{ 
/*UpdatableVariableDeclaration*/int i = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP4 = i < _Timer_max_counters ; 

while ( X10_TEMP4 ) 
{ 

{ 
Timer_resetTimer ( X10_TEMP0 , i ) ; 
const int X10_TEMP6 = i ; 
const int X10_TEMP7 = 1 ; 
i = i + X10_TEMP7 ; } 
X10_TEMP4 = i < _Timer_max_counters ; } 

} 
} 

int /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int placeIndex ) 
{ 
struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const counts = d .counts ; 
const int localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
/*Updatable ARRAY*/ struct Point2 * const pointArray = r .pointArray ; 
/*UpdatableVariableDeclaration*/int start = 0 ; 
/*UpdatableVariableDeclaration*/int end = r .regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/int result = zero - one ; 
/*UpdatableVariableDeclaration*/int notDone = start <= end ; 

while ( notDone ) 
{ 
/*UpdatableVariableDeclaration*/int mid = start + end ; 
mid = mid / two ; struct Point2 temp = pointArray [ mid ] 
; 
const int pointCompare = comparePoint2 ( target , temp ) ; 
const int eq = pointCompare == zero ; 
const int lt = pointCompare == one ; 
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

int /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
const int regType = r .regType ; 
if ( regType ) 
{ 
const int constantSearch = constantSearchRegion2 ( r , target ) ; 
return constantSearch ; 
} 

const int binarySearch = binarySearchRegion2 ( r , target ) ; 
return binarySearch ; 
} 

int /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
const int zero = 0 ; 
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
{ 
/*UpdatableVariableDeclaration*/int notFound = 0 ; 
notFound = notFound - one ; return notFound ; 
} 

const int stride1 = 1 ; 
const int stride0 = stride1 * dim1 ; 
pt0 = pt0 - low0 ; const int offset0 = stride0 * pt0 ; 
/*UpdatableVariableDeclaration*/int found = 0 ; 
found = found + offset0 ; return found ; 
} 

/*Updatable ARRAY*/ int * /*static*/initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) 
{ 
/*Updatable ARRAY*/ int * const SX10_TEMP0 = (int *)calloc(tempReg,sizeof( int )); 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < tempReg ; SX10_TEMP1 ++ ) 
{ 
const int p = SX10_TEMP1 ; 
const int tempInt = tempArr [ p ] 
; 
SX10_TEMP0 [ p ] = tempInt ; 
} 

/*Updatable ARRAY*/ int * const vTemp = SX10_TEMP0 ; 
return vTemp ; 
} 

int /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
/*UpdatableVariableDeclaration*/int point1 = 0 ; 
/*UpdatableVariableDeclaration*/int point2 = 0 ; 
/*UpdatableVariableDeclaration*/int lt = 0 ; 
/*UpdatableVariableDeclaration*/int gt = 0 ; 
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

Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const int p ) 
{ 
const int rSize = r .regSize ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < dReg ; SX10_TEMP2 ++ ) 
{ 
const int pt = SX10_TEMP2 ; 
SX10_TEMP1 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist ) ; 
return retDist ; 
} 

double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int index ) 
{ 
const int pl = /* here  */ 0 ; 
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

int /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
/*UpdatableVariableDeclaration*/int point1 = 0 ; 
/*UpdatableVariableDeclaration*/int point2 = 0 ; 
/*UpdatableVariableDeclaration*/int lt = 0 ; 
/*UpdatableVariableDeclaration*/int gt = 0 ; 
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

void /*static*/getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
/*UpdatableVariableDeclaration*/int N = arraySize ; 
/*UpdatableVariableDeclaration*/int chunk = blockSize ; 
const int ifCond = blockSize > N ; 
if ( ifCond ) 
{ 
chunk = N ; } 

/*UpdatableVariableDeclaration*/int index = 0 ; 
/*UpdatableVariableDeclaration*/int dSize = index + chunk ; 
dSize = dSize - one ; const int SX10_TEMP0 = 1 ; 
const int pointReg = dSize + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < pointReg ; SX10_TEMP1 ++ ) 
{ 
const int p = SX10_TEMP1 ; 
placeArray [ p ] = initPlace ; 
} 

index = index + chunk ; N = N - chunk ; /*UpdatableVariableDeclaration*/int pl = /* initPlace . next ( )  */ 0 ; 
/*UpdatableVariableDeclaration*/int whileCond = N != zero ; 

while ( whileCond ) 
{ 
const int tailCond = chunk > N ; 
if ( tailCond ) 
{ 
dSize = index + N ; dSize = dSize - one ; const int ub = N - one ; 
const int SX10_TEMP2 = 1 ; 
const int pointReg1 = ub + SX10_TEMP2 ; 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < pointReg1 ; SX10_TEMP3 ++ ) 
{ 
const int p = SX10_TEMP3 ; 
const int tempPt = p + index ; 
placeArray [ tempPt ] = pl ; 
} 

N = 0 ; } 
else 
{ 
dSize = index + chunk ; dSize = dSize - one ; const int ub = chunk - one ; 
const int SX10_TEMP4 = 1 ; 
const int pointReg1 = ub + SX10_TEMP4 ; 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < pointReg1 ; SX10_TEMP5 ++ ) 
{ 
const int p = SX10_TEMP5 ; 
const int tempPt = p + index ; 
placeArray [ tempPt ] = pl ; 
} 

index = index + chunk ; N = N - chunk ; } 


pl = /* pl . next ( )  */ 0 ; whileCond = N != zero ; } 

} 

int /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int placeIndex ) 
{ 
struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const counts = d .counts ; 
const int localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
/*Updatable ARRAY*/ struct Point1 * const pointArray = r .pointArray ; 
/*UpdatableVariableDeclaration*/int start = 0 ; 
/*UpdatableVariableDeclaration*/int end = r .regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/int result = zero - one ; 
/*UpdatableVariableDeclaration*/int notDone = start <= end ; 

while ( notDone ) 
{ 
/*UpdatableVariableDeclaration*/int mid = start + end ; 
mid = mid / two ; struct Point1 temp = pointArray [ mid ] 
; 
const int pointCompare = comparePoint1 ( target , temp ) ; 
const int eq = pointCompare == zero ; 
const int lt = pointCompare == one ; 
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

Dist2 /*static*/restrictDist2 (  struct Dist2 const dn , const int p ) 
{ 
struct Region2 r = dn .dReg ; 
const int regType = r .regType ; 
if ( regType ) 
{ 
struct Dist2 regDist = restrictDistRegular2 ( dn , p ) ; 
return regDist ; 
} 

struct Dist2 arbDist = restrictDistArbitrary2 ( dn , p ) ; 
return arbDist ; 
} 

Dist2 /*static*/restrictDistRegular2 (  struct Dist2 const d , const int p ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region2 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int dim = dReg .regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
const int stride2 = 1 ; 
const int dim2 = dReg .dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = dReg .low1 ; 
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
{ 
const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int )); 
const int cond1 = numPoints > zero ; 
if ( cond1 ) 
{ 
numPoints = 0 ; for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < dRegReg ; SX10_TEMP6 ++ ) 
{ 
const int pt = SX10_TEMP6 ; 
const int dP = dPlace [ pt ] 
; 
const int cond2 = p == dP ; 
if ( cond2 ) 
{ 
const int i = pt ; 
tempArray [ numPoints ] = i ; 
numPoints = numPoints + one ; } 

} 

} 

/*Updatable ARRAY*/ struct Point2 * const SX10_TEMP7 = (Point2 *)calloc(tempReg,sizeof( Point2 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ 
const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/int f2 = idx / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 dpt  ; 
Point2_Point2( &dpt/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point2 * const pointArray = SX10_TEMP7 ; 
struct Region2 dpReg  ; 
Region2_Region2_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist2 dpDistn  ; 
Dist2_Dist2( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist2 /*static*/restrictDistArbitrary2 (  struct Dist2 const d , const int p ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region2 dReg = d .dReg ; 
struct Dist dDist = d .dDist ; 
const int dim = dReg .regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 * const dArray = dReg .pointArray ; 
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
{ 
const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int )); 
const int cond1 = numPoints > zero ; 
if ( cond1 ) 
{ 
numPoints = 0 ; for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < dRegReg ; SX10_TEMP6 ++ ) 
{ 
const int pt = SX10_TEMP6 ; 
const int dP = dPlace [ pt ] 
; 
const int cond2 = p == dP ; 
if ( cond2 ) 
{ 
const int i = pt ; 
tempArray [ numPoints ] = i ; 
numPoints = numPoints + one ; } 

} 

} 

/*Updatable ARRAY*/ struct Point2 * const SX10_TEMP7 = (Point2 *)calloc(tempReg,sizeof( Point2 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ 
const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
struct Point2 dpt = dArray [ idx ] 
; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point2 * const pointArray = SX10_TEMP7 ; 
struct Region2 dpReg  ; 
Region2_Region2_2( &dpReg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , rSizeNumPoints ) ; 
struct Dist dpDist  ; 
Dist_Dist( &dpDist/*OBJECT INIT IN ASSIGNMENT*/, rPlace , rSizeNumPoints ) ; 
struct Dist2 dpDistn  ; 
Dist2_Dist2( &dpDistn/*OBJECT INIT IN ASSIGNMENT*/, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const int p ) 
{ 
const int rSize = r .regSize ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < dReg ; SX10_TEMP2 ++ ) 
{ 
const int pt = SX10_TEMP2 ; 
SX10_TEMP1 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
struct Dist pointDist  ; 
Dist_Dist( &pointDist/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist ) ; 
return retDist ; 
} 

Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int ordl ) 
{ 
const int regType = reg .regType ; 
if ( regType ) 
{ 
struct Point1 pt = regionOrdinalPointRegular1 ( reg , ordl ) ; 
return pt ; 
} 

struct Point1 pt = regionOrdinalPointArbitrary1 ( reg , ordl ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int ordl ) 
{ 
const int stride1 = 1 ; 
const int dim1 = reg .dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/int f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, f1 ) ; 
return pt ; 
} 

Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int ordl ) 
{ 
/*Updatable ARRAY*/ struct Point1 * const pointArray = reg .pointArray ; 
struct Point1 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

int /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int index ) 
{ 
struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const placeArray = d .placeArray ; 
const int retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

int /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int index ) 
{ 
struct Dist d = dn .dDist ; 
/*Updatable ARRAY*/ int * const placeArray = d .placeArray ; 
const int retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

int /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int dim0 = r .dim0 ; 
const int low0 = r .low0 ; 
const int high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/int pt0 = target .f0 ; 
const int lbound0 = pt0 < low0 ; 
const int hbound0 = pt0 >= high0 ; 
const int dim1 = r .dim1 ; 
const int low1 = r .low1 ; 
const int high1 = low1 + dim1 ; 
/*UpdatableVariableDeclaration*/int pt1 = target .f1 ; 
const int lbound1 = pt1 < low1 ; 
const int hbound1 = pt1 >= high1 ; 
const int dim2 = 1 ; 
/*UpdatableVariableDeclaration*/int outRegion = 0 ; 
outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion || hbound1 ; if ( outRegion ) 
{ 
/*UpdatableVariableDeclaration*/int notFound = 0 ; 
notFound = notFound - one ; return notFound ; 
} 

const int stride2 = 1 ; 
const int stride1 = stride2 * dim2 ; 
const int stride0 = stride1 * dim1 ; 
pt0 = pt0 - low0 ; const int offset0 = stride0 * pt0 ; 
pt1 = pt1 - low1 ; const int offset1 = stride1 * pt1 ; 
/*UpdatableVariableDeclaration*/int found = 0 ; 
found = found + offset0 ; found = found + offset1 ; return found ; 
} 

int /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) 
{ 
const int regType = r .regType ; 
if ( regType ) 
{ 
const int constantSearch = constantSearchRegion1 ( r , target ) ; 
return constantSearch ; 
} 

const int binarySearch = binarySearchRegion1 ( r , target ) ; 
return binarySearch ; 
} 

double /*static*/getRefArrayValue2double (  struct doubleRefArray2 const array , const int index ) 
{ 
const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist2 dArray = array .distValue ; 
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

Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int ordl ) 
{ 
const int regType = reg .regType ; 
if ( regType ) 
{ 
struct Point2 pt = regionOrdinalPointRegular2 ( reg , ordl ) ; 
return pt ; 
} 

struct Point2 pt = regionOrdinalPointArbitrary2 ( reg , ordl ) ; 
return pt ; 
} 

Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int ordl ) 
{ 
const int stride2 = 1 ; 
const int dim2 = reg .dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = reg .low1 ; 
const int dim1 = reg .dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg .low0 ; 
/*UpdatableVariableDeclaration*/int f2 = ordl / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
return pt ; 
} 

Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int ordl ) 
{ 
/*Updatable ARRAY*/ struct Point2 * const pointArray = reg .pointArray ; 
struct Point2 pt = pointArray [ ordl ] 
; 
return pt ; 
} 

void /*static*/setRefArrayValue2double (  struct doubleRefArray2 const array , const int index , const double val ) 
{ 
const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist2 dArray = array .distValue ; 
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

Dist1 /*static*/getUniqueDist ( ) 
{ 
const int one = 1 ; 
const int zero = 0 ; 
const int maxPlaces = /* place.MAX_PLACES  */ 1 ; 
const int rSize = maxPlaces - one ; 
const int SX10_TEMP0 = 1 ; 
const int placeRegion = rSize + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(placeRegion,sizeof( int )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < placeRegion ; SX10_TEMP2 ++ ) 
{ 
const int p = SX10_TEMP2 ; 
const int i = p ; 
const int pl1 = /* place.places ( i )  */ 0 
; 
SX10_TEMP1 [ p ] = pl1 ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int pointRegion = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP4 = (Point1 *)calloc(pointRegion,sizeof( Point1 )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < pointRegion ; SX10_TEMP5 ++ ) 
{ 
const int p = SX10_TEMP5 ; 
struct Point1 pt1  ; 
Point1_Point1( &pt1/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
SX10_TEMP4 [ p ] = pt1 ; 
} 

/*Updatable ARRAY*/ struct Point1 * const pointArray = SX10_TEMP4 ; 
struct Region1 reg  ; 
Region1_Region1_4( &reg/*OBJECT INIT IN ASSIGNMENT*/, pointArray , maxPlaces , zero , maxPlaces ) ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , maxPlaces ) ; 
struct Dist1 retDist  ; 
Dist1_Dist1( &retDist/*OBJECT INIT IN ASSIGNMENT*/, reg , pointDist1 ) ; 
return retDist ; 
} 

void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int index , const double val ) 
{ 
const int pl = /* here  */ 0 ; 
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

Dist2 /*static*/getBlockDist2 (  struct Region2 const r ) 
{ 
const int rSize = r .regSize ; 
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
{ 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < dReg ; SX10_TEMP4 ++ ) 
{ 
const int pt = SX10_TEMP4 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP3 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP3 ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
return retDist ; 
} 

offset = arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = /* place.places ( q )  */ 0 
; /*UpdatableVariableDeclaration*/int chunk = blockSize ; 
const int ifCond = blockSize > arraySize ; 
if ( ifCond ) 
{ 
chunk = arraySize ; } 

/*UpdatableVariableDeclaration*/int index = offset ; 
/*UpdatableVariableDeclaration*/int dSize = index + chunk ; 
dSize = dSize - one ; const int ub0 = chunk - one ; 
const int SX10_TEMP5 = 1 ; 
const int pointReg0 = ub0 + SX10_TEMP5 ; 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < pointReg0 ; SX10_TEMP6 ++ ) 
{ 
const int pt = SX10_TEMP6 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = initPlace ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; /*UpdatableVariableDeclaration*/int pl = /* initPlace . next ( )  */ 0 ; 
/*UpdatableVariableDeclaration*/int whileCond = arraySize != zero ; 

while ( whileCond ) 
{ 
const int tailCond = chunk > arraySize ; 
if ( tailCond ) 
{ 
dSize = index + arraySize ; dSize = dSize - one ; const int ub = arraySize - one ; 
const int SX10_TEMP7 = 1 ; 
const int pointReg1 = ub + SX10_TEMP7 ; 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < pointReg1 ; SX10_TEMP8 ++ ) 
{ 
const int pt = SX10_TEMP8 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = pl ; 
} 

arraySize = 0 ; } 
else 
{ 
dSize = index + chunk ; dSize = dSize - one ; const int ub = chunk - one ; 
const int SX10_TEMP9 = 1 ; 
const int pointReg1 = ub + SX10_TEMP9 ; 
for ( int SX10_TEMP10 = 0 ; SX10_TEMP10 < pointReg1 ; SX10_TEMP10 ++ ) 
{ 
const int pt = SX10_TEMP10 ; 
const int tempPt = pt + index ; 
placeArray [ tempPt ] = pl ; 
} 

index = index + chunk ; arraySize = arraySize - chunk ; } 


pl = /* pl . next ( )  */ 0 ; whileCond = arraySize != zero ; } 

/*Updatable ARRAY*/ int * const SX10_TEMP11 = (int *)calloc(dReg,sizeof( int )); 
for ( int SX10_TEMP12 = 0 ; SX10_TEMP12 < dReg ; SX10_TEMP12 ++ ) 
{ 
const int pt = SX10_TEMP12 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP11 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP11 ; 
struct Dist pointDist1  ; 
Dist_Dist( &pointDist1/*OBJECT INIT IN ASSIGNMENT*/, vPlaceArray , rSize ) ; 
struct Dist2 retDist  ; 
Dist2_Dist2( &retDist/*OBJECT INIT IN ASSIGNMENT*/, r , pointDist1 ) ; 
return retDist ; 
} 

Region2 /*static*/createNewRegion2RR ( const int v1_0 , const int v1_1 , const int v2_0 , const int v2_1 ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
/*UpdatableVariableDeclaration*/int regType = 1 ; 
const int tempBool1 = 1 ; 
const int tempBool2 = 1 ; 
regType = regType && tempBool1 ; regType = regType && tempBool2 ; const int l1 = v1_1 - v1_0 ; 
const int dim1 = l1 + one ; 
const int l2 = v2_1 - v2_0 ; 
const int dim2 = l2 + one ; 
const int stride2 = 1 ; 
const int stride1 = stride2 * dim2 ; 
const int stride0 = stride1 * dim1 ; 
const int rSize = stride0 - one ; 
const int cond = stride0 <= zero ; 
if ( cond ) 
{ 
const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 * const SX10_TEMP1 = (Point2 *)calloc(regArr,sizeof( Point2 )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ 
const int p = SX10_TEMP2 ; 
struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 * const ptArray = SX10_TEMP1 ; 
struct Region2 retRegEmpty  ; 
Region2_Region2_6( &retRegEmpty/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , zero , zero , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ 
const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point2 * const SX10_TEMP4 = (Point2 *)calloc(regArr,sizeof( Point2 )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ 
const int p = SX10_TEMP5 ; 
struct Point2 pt  ; 
Point2_Point2( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero , zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 * const ptArray = SX10_TEMP4 ; 
struct Region2 retRegRegular  ; 
Region2_Region2_6( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point2 * const SX10_TEMP7 = (Point2 *)calloc(regArr,sizeof( Point2 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ 
const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; /*UpdatableVariableDeclaration*/int f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + v2_0 ; struct Point2 retPoint  ; 
Point2_Point2( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 , f2 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point2 * const ptArray = SX10_TEMP7 ; 
struct Region2 retReg  ; 
Region2_Region2_2( &retReg/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

Region1 /*static*/createNewRegion1R ( const int v1_0 , const int v1_1 ) 
{ 
const int zero = 0 ; 
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
{ 
const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP1 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ 
const int p = SX10_TEMP2 ; 
struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP1 ; 
struct Region1 retRegEmpty  ; 
Region1_Region1_4( &retRegEmpty/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ 
const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP4 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ 
const int p = SX10_TEMP5 ; 
struct Point1 pt  ; 
Point1_Point1( &pt/*OBJECT INIT IN ASSIGNMENT*/, zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP4 ; 
struct Region1 retRegRegular  ; 
Region1_Region1_4( &retRegRegular/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 , v1_0 , dim1 ) ; 
return retRegRegular ; 
} 
else 
{ 
const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point1 * const SX10_TEMP7 = (Point1 *)calloc(regArr,sizeof( Point1 )); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ 
const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; struct Point1 retPoint  ; 
Point1_Point1( &retPoint/*OBJECT INIT IN ASSIGNMENT*/, f1 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point1 * const ptArray = SX10_TEMP7 ; 
struct Region1 retReg  ; 
Region1_Region1_2( &retReg/*OBJECT INIT IN ASSIGNMENT*/, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

void /*static*/thread1 (  struct T1 const utmpz ) 
{ 
const int RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const int RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP1 = (double *)calloc(RX10_TEMP14,sizeof( double )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < RX10_TEMP14 ; SX10_TEMP2 ++ ) 
{ 
const int RX10_TEMP13 = SX10_TEMP2 ; 

{ 
const double X10_TEMP13 = 0.0; 
SX10_TEMP1 [ RX10_TEMP13 ] = X10_TEMP13 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP15 = SX10_TEMP1 ; 
struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T9 utmp9  ; 
T9_T9( &utmp9/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread9 (utmp9 );

}/*END OF ASYNC*/
} 
} 

void /*static*/thread2 (  struct T2 const utmpz ) 
{ 
const int RX10_TEMP40 = utmpz .RX10_TEMP40 ; 
const int RX10_TEMP36 = utmpz .RX10_TEMP36 ; 
const int RX10_TEMP35 = utmpz .RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = utmpz .RX10_TEMP34 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP42 = RX10_TEMP40 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP1 = (double *)calloc(RX10_TEMP42,sizeof( double )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < RX10_TEMP42 ; SX10_TEMP2 ++ ) 
{ 
const int RX10_TEMP41 = SX10_TEMP2 ; 

{ 
const double X10_TEMP29 = 0.0; 
SX10_TEMP1 [ RX10_TEMP41 ] = X10_TEMP29 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP43 = SX10_TEMP1 ; 
struct doubleStub RX10_TEMP44  ; 
doubleStub_doubleStub( &RX10_TEMP44/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP43 ) ; 
struct T10 utmp10  ; 
T10_T10( &utmp10/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP44 , RX10_TEMP35 , RX10_TEMP34 ) ; 
/* async  */
 {
thread10 (utmp10 );

}/*END OF ASYNC*/
} 
} 

void /*static*/thread3 (  struct T3 const utmpz ) 
{ 
struct doubleRefArray2 tA = utmpz .tA ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 
const int curr_place = utmpz .curr_place ; 
const int jj = utmpz .jj ; 
const int ii = utmpz .ii ; 

{ 

{ 
struct Point2 RX10_TEMP57  ; 
Point2_Point2( &RX10_TEMP57/*OBJECT INIT IN ASSIGNMENT*/, jj , ii ) ; 
struct Dist2 RX10_TEMP58 = tA .distValue ; 
struct Region2 RX10_TEMP59 = RX10_TEMP58 .dReg ; 
const int RX10_TEMP60 = searchPointInRegion2 ( RX10_TEMP59 , RX10_TEMP57 ) ; 
const int RX10_TEMP61 = 0 ; 
const int RX10_TEMP62 = RX10_TEMP60 < RX10_TEMP61 ; 
if ( RX10_TEMP62 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP63 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP63 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP64 = getPlaceFromDist2 ( RX10_TEMP58 , RX10_TEMP60 ) ; 
const int RX10_TEMP66 = /* here  */ 0 ; 
const int RX10_TEMP67 = RX10_TEMP64 != RX10_TEMP66 ; 
if ( RX10_TEMP67 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP65 = "Bad place access for array tA" ; 
fprintf(stderr, RX10_TEMP65 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP68 = getRefArrayValue2double ( tA , RX10_TEMP60 ) ; 
const double temp = RX10_TEMP68 ; 
struct T11 utmp11  ; 
T11_T11( &utmp11/*OBJECT INIT IN ASSIGNMENT*/, temp , tempref ) ; 
/* async  */
 {
thread11 (utmp11 );

}/*END OF ASYNC*/
} 
} 
} 

void /*static*/thread4 (  struct T4 const utmpz ) 
{ 
const int RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const int RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (double *)calloc(RX10_TEMP13,sizeof( double )); 
struct doubleStub RX10_TEMP15  ; 
doubleStub_doubleStub( &RX10_TEMP15/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP14 ) ; 
struct T12 utmp12  ; 
T12_T12( &utmp12/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread12 (utmp12 );

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

{ 
/*UpdatableVariableDeclaration*/int ilow = 0 ; 
struct Region1 RX10_TEMP23 = U .dReg ; 
const int RX10_TEMP24 = searchPointInRegion1 ( RX10_TEMP23 , p ) ; 
const int RX10_TEMP25 = 0 ; 
const int RX10_TEMP26 = RX10_TEMP24 < RX10_TEMP25 ; 
if ( RX10_TEMP26 ) 
{ 
const char * RX10_TEMP27 = "Point p not found in the distribution U." ; 
fprintf(stderr, RX10_TEMP27 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP28 = getPlaceFromDist1 ( U , RX10_TEMP24 ) ; 
const int X10_TEMP34 = RX10_TEMP28 ; 
const int X10_TEMP36 = /* X10_TEMP34 . isFirst ( )  */ 1 ; 
if ( X10_TEMP36 ) 
{ 

{ 
const int X10_TEMP38 = 1 ; 
ilow = X10_TEMP38 ; } 
} 
else 
{ 

{ 
const int X10_TEMP40 = 0 ; 
ilow = X10_TEMP40 ; } 
} 


struct Dist2 RX10_TEMP29 = tA .distValue ; 
struct Dist2 X10_TEMP41 = RX10_TEMP29 ; 
const int X10_TEMP42 = /* here  */ 0 ; 
struct Dist2 X10_TEMP44 = restrictDist2 ( X10_TEMP41 , X10_TEMP42 ) ; 
struct Region2 RX10_TEMP31 = X10_TEMP44 .dReg ; 
const int RX10_TEMP34 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP32 = RX10_TEMP31 .regSize ; 
RX10_TEMP32 = RX10_TEMP32 - RX10_TEMP34 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP33 = RX10_TEMP32 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP33 ; SX10_TEMP1 ++ ) 
{ 
const int RX10_TEMP30 = SX10_TEMP1 ; 
const int RX10_TEMP35 = RX10_TEMP30 ; 
struct Point2 pp = regionOrdinalPoint2 ( RX10_TEMP31 , RX10_TEMP35 ) ; 

{ 
const int X10_TEMP46 = pp .f1 ; 
const int X10_TEMP48 = X10_TEMP46 >= ilow ; 
if ( X10_TEMP48 ) 
{ 

{ 
const int X10_TEMP50 = pp .f0 ; 
const int X10_TEMP51 = 0 ; 
const int X10_TEMP53 = X10_TEMP50 == X10_TEMP51 ; 
if ( X10_TEMP53 ) 
{ 

{ 
const double X10_TEMP55 = 0.0; 
const double X10_TEMP65 = /*casting*/( double ) X10_TEMP55 ; 
const double X10_TEMP57 = 2.0; 
const double X10_TEMP66 = /*casting*/( double ) X10_TEMP57 ; 
const int X10_TEMP67 = 1000 ; 
const int X10_TEMP61 = pp .f1 ; 
const double X10_TEMP62 = /*casting*/( double ) X10_TEMP61 ; 
const double X10_TEMP68 = omega * X10_TEMP62 ; 
const int X10_TEMP69 = 1 ; 
const double X10_TEMP71 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP65 , X10_TEMP66 , X10_TEMP67 , X10_TEMP68 , X10_TEMP69 ) ; 
const double X10_TEMP72 = X10_TEMP71 ; 
struct Dist2 RX10_TEMP36 = tA .distValue ; 
struct Region2 RX10_TEMP37 = RX10_TEMP36 .dReg ; 
const int RX10_TEMP38 = searchPointInRegion2 ( RX10_TEMP37 , pp ) ; 
const int RX10_TEMP39 = 0 ; 
const int RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; 
if ( RX10_TEMP40 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP41 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP41 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP42 = getPlaceFromDist2 ( RX10_TEMP36 , RX10_TEMP38 ) ; 
const int RX10_TEMP44 = /* here  */ 0 ; 
const int RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; 
if ( RX10_TEMP45 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP43 = "Bad place access for array tA" ; 
fprintf(stderr, RX10_TEMP43 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( tA , RX10_TEMP38 , X10_TEMP72 ) ; 
} 
} 
else 
{ 

{ 
const double X10_TEMP74 = 0.0; 
const double X10_TEMP84 = /*casting*/( double ) X10_TEMP74 ; 
const double X10_TEMP76 = 2.0; 
const double X10_TEMP85 = /*casting*/( double ) X10_TEMP76 ; 
const int X10_TEMP86 = 1000 ; 
const int X10_TEMP80 = pp .f1 ; 
const double X10_TEMP81 = /*casting*/( double ) X10_TEMP80 ; 
const double X10_TEMP87 = omega * X10_TEMP81 ; 
const int X10_TEMP88 = 2 ; 
const double X10_TEMP90 = Series_TrapezoidIntegrate ( X10_TEMP0 , X10_TEMP84 , X10_TEMP85 , X10_TEMP86 , X10_TEMP87 , X10_TEMP88 ) ; 
const double X10_TEMP91 = X10_TEMP90 ; 
struct Dist2 RX10_TEMP46 = tA .distValue ; 
struct Region2 RX10_TEMP47 = RX10_TEMP46 .dReg ; 
const int RX10_TEMP48 = searchPointInRegion2 ( RX10_TEMP47 , pp ) ; 
const int RX10_TEMP49 = 0 ; 
const int RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; 
if ( RX10_TEMP50 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP51 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP52 = getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 ) ; 
const int RX10_TEMP54 = /* here  */ 0 ; 
const int RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; 
if ( RX10_TEMP55 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP53 = "Bad place access for array tA" ; 
fprintf(stderr, RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( tA , RX10_TEMP48 , X10_TEMP91 ) ; 
} 
} 


} 
} 

} 
} 

} 
} 
} 

void /*static*/thread9 (  struct T9 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP16 ; 
} 
} 

void /*static*/thread10 (  struct T10 const utmpz ) 
{ 
struct doubleStub RX10_TEMP44 = utmpz .RX10_TEMP44 ; 
const int RX10_TEMP35 = utmpz .RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP34 = utmpz .RX10_TEMP34 ; 

{ 
RX10_TEMP34 [ RX10_TEMP35 ] = RX10_TEMP44 ; 
} 
} 

void /*static*/thread11 (  struct T11 const utmpz ) 
{ 
const double temp = utmpz .temp ; 
struct doubleRefArray1 tempref = utmpz .tempref ; 

{ 

{ 
const int X10_TEMP43 = 0 ; 
const double X10_TEMP45 = temp ; 
struct Point1 RX10_TEMP69  ; 
Point1_Point1( &RX10_TEMP69/*OBJECT INIT IN ASSIGNMENT*/, X10_TEMP43 ) ; 
struct Dist1 RX10_TEMP70 = tempref .distValue ; 
struct Region1 RX10_TEMP71 = RX10_TEMP70 .dReg ; 
const int RX10_TEMP72 = searchPointInRegion1 ( RX10_TEMP71 , RX10_TEMP69 ) ; 
const int RX10_TEMP73 = 0 ; 
const int RX10_TEMP74 = RX10_TEMP72 < RX10_TEMP73 ; 
if ( RX10_TEMP74 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP75 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP76 = getPlaceFromDist1 ( RX10_TEMP70 , RX10_TEMP72 ) ; 
const int RX10_TEMP78 = /* here  */ 0 ; 
const int RX10_TEMP79 = RX10_TEMP76 != RX10_TEMP78 ; 
if ( RX10_TEMP79 ) 
{ 
/*UpdatableVariableDeclaration*/char * RX10_TEMP77 = "Bad place access for array tempref" ; 
fprintf(stderr, RX10_TEMP77 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( tempref , RX10_TEMP72 , X10_TEMP45 ) ; 
} 
} 
} 

void /*static*/thread12 (  struct T12 const utmpz ) 
{ 
struct doubleStub RX10_TEMP15 = utmpz .RX10_TEMP15 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP15 ; 
} 
} 



T1 T1_T1 ( struct T1 *T1THIS, const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T1THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T1THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T1THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T1THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T1THIS; 

} 

T2 T2_T2 ( struct T2 *T2THIS, const int a_RX10_TEMP40 , const int a_RX10_TEMP36 , const int a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) 
{ 
T2THIS->RX10_TEMP40 = ( a_RX10_TEMP40 ) ; 
T2THIS->RX10_TEMP36 = ( a_RX10_TEMP36 ) ; 
T2THIS->RX10_TEMP35 = ( a_RX10_TEMP35 ) ; 
T2THIS->RX10_TEMP34 = ( a_RX10_TEMP34 ) ; 

 return  *T2THIS; 

} 

T3 T3_T3 ( struct T3 *T3THIS,  struct doubleRefArray2 const a_tA ,  struct doubleRefArray1 const a_tempref , const int a_curr_place , const int a_jj , const int a_ii ) 
{ 
T3THIS->tA = ( a_tA ) ; 
T3THIS->tempref = ( a_tempref ) ; 
T3THIS->curr_place = ( a_curr_place ) ; 
T3THIS->jj = ( a_jj ) ; 
T3THIS->ii = ( a_ii ) ; 

 return  *T3THIS; 

} 

T4 T4_T4 ( struct T4 *T4THIS, const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
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

T6 T6_T6 ( struct T6 *T6THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T6THIS->RX10_TEMP12 = ( a_RX10_TEMP12 ) ; 
T6THIS->RX10_TEMP8 = ( a_RX10_TEMP8 ) ; 
T6THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T6THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T6THIS->THIS = *TimerTHIS;
 return  *T6THIS; 

} 

T7 T7_T7 ( struct T7 *T7THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP33 , const int a_RX10_TEMP29 , const int a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T7THIS->RX10_TEMP33 = ( a_RX10_TEMP33 ) ; 
T7THIS->RX10_TEMP29 = ( a_RX10_TEMP29 ) ; 
T7THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T7THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T7THIS->THIS = *TimerTHIS;
 return  *T7THIS; 

} 

T8 T8_T8 ( struct T8 *T8THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP54 , const int a_RX10_TEMP50 , const int a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T8THIS->RX10_TEMP54 = ( a_RX10_TEMP54 ) ; 
T8THIS->RX10_TEMP50 = ( a_RX10_TEMP50 ) ; 
T8THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T8THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T8THIS->THIS = *TimerTHIS;
 return  *T8THIS; 

} 

T9 T9_T9 ( struct T9 *T9THIS,  struct doubleStub const a_RX10_TEMP16 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T9THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T9THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T9THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T9THIS; 

} 

T10 T10_T10 ( struct T10 *T10THIS,  struct doubleStub const a_RX10_TEMP44 , const int a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) 
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

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleStub const a_RX10_TEMP15 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T12THIS->RX10_TEMP15 = ( a_RX10_TEMP15 ) ; 
T12THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T12THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 

 return  *T12THIS; 

} 

T13 T13_T13 ( struct T13 *T13THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) 
{ 
T13THIS->RX10_TEMP16 = ( a_RX10_TEMP16 ) ; 
T13THIS->RX10_TEMP7 = ( a_RX10_TEMP7 ) ; 
T13THIS->RX10_TEMP6 = ( a_RX10_TEMP6 ) ; 
T13THIS->THIS = *TimerTHIS;
 return  *T13THIS; 

} 

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) 
{ 
T14THIS->RX10_TEMP37 = ( a_RX10_TEMP37 ) ; 
T14THIS->RX10_TEMP28 = ( a_RX10_TEMP28 ) ; 
T14THIS->RX10_TEMP27 = ( a_RX10_TEMP27 ) ; 
T14THIS->THIS = *TimerTHIS;
 return  *T14THIS; 

} 

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) 
{ 
T15THIS->RX10_TEMP58 = ( a_RX10_TEMP58 ) ; 
T15THIS->RX10_TEMP49 = ( a_RX10_TEMP49 ) ; 
T15THIS->RX10_TEMP48 = ( a_RX10_TEMP48 ) ; 
T15THIS->THIS = *TimerTHIS;
 return  *T15THIS; 

} 

Dist Dist_Dist ( struct Dist *DistTHIS, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) 
{ 
const int one = 1 ; 
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
{ 
const int p = SX10_TEMP6 ; 
tempCounts [ p ] = zero ; 
} 

for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < arrayReg ; SX10_TEMP7 ++ ) 
{ 
const int p = SX10_TEMP7 ; 
const int pl = vPlaceArray [ p ] 
; 
const int index = /* pl . id  */ 0 ; 
const int oldVal = tempCounts [ index ] 
; 
tempRunSum [ p ] = oldVal ; 
const int oldValPlusOne = oldVal + one ; 
tempCounts [ index ] = oldValPlusOne ; 
} 

DistTHIS->placeArray = ( vPlaceArray ) ; 
/*Updatable ARRAY*/ int * const tempCountsV = initDist ( tempCounts , countReg ) ; 
DistTHIS->counts = ( tempCountsV ) ; 
/*Updatable ARRAY*/ int * const tempRunSumV = initDist ( tempRunSum , arrayReg ) ; 
DistTHIS->runningSum = ( tempRunSumV ) ; 

 return  *DistTHIS; 

} 

Timer *Timer_Timer ( struct Timer *TimerTHIS) 
{ 

{ 
const int X10_TEMP3 = 0 ; 
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
{ 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ 
const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount1 ( d , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
struct T6 utmp6  ; 
T6_T6( &utmp6/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP12 , RX10_TEMP8 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread6 (&utmp6.THIS,utmp6 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP4 = (doubleStub *)calloc(RX10_TEMP4,sizeof( doubleStub )); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < RX10_TEMP4 ; SX10_TEMP5 ++ ) 
{ 
const int RX10_TEMP19 = SX10_TEMP5 ; 
struct doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
SX10_TEMP4 [ RX10_TEMP19 ] = RX10_TEMP18 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP17 = SX10_TEMP4 ; 
struct doubleRefArray1 RX10_TEMP20  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP20/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP17 ) ; 
struct doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; 
TimerTHIS->start_time = ( X10_TEMP11 ) ; 
struct Region1 RX10_TEMP21 = d .dReg ; 
const int RX10_TEMP22 = 0 ; 
const int RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP24 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int SX10_TEMP6 = 1 ; 
const int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP6 ; 
const int SX10_TEMP7 = 1 ; 
const int RX10_TEMP26 = RX10_TEMP24 + SX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = (doubleStub *)calloc(RX10_TEMP26,sizeof( doubleStub )); 
/* finish  */ 
{ 
for ( int SX10_TEMP9 = 0 ; SX10_TEMP9 < RX10_TEMP25 ; SX10_TEMP9 ++ ) 
{ 
const int RX10_TEMP28 = SX10_TEMP9 ; 
const int RX10_TEMP29 = /* here  */ 0 ; 
const int RX10_TEMP30 = RX10_TEMP28 ; 
const int RX10_TEMP31 = /* place.places ( RX10_TEMP30 )  */ 0 
; 
const int RX10_TEMP32 = getDistLocalCount1 ( d , RX10_TEMP30 ) ; 
const int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
struct T7 utmp7  ; 
T7_T7( &utmp7/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP33 , RX10_TEMP29 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
thread7 (&utmp7.THIS,utmp7 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP10 = (doubleStub *)calloc(RX10_TEMP25,sizeof( doubleStub )); 
for ( int SX10_TEMP11 = 0 ; SX10_TEMP11 < RX10_TEMP25 ; SX10_TEMP11 ++ ) 
{ 
const int RX10_TEMP40 = SX10_TEMP11 ; 
struct doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] 
; 
SX10_TEMP10 [ RX10_TEMP40 ] = RX10_TEMP39 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP38 = SX10_TEMP10 ; 
struct doubleRefArray1 RX10_TEMP41  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP41/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP38 ) ; 
struct doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; 
TimerTHIS->elapsed_time = ( X10_TEMP15 ) ; 
struct Region1 RX10_TEMP42 = d .dReg ; 
const int RX10_TEMP43 = 0 ; 
const int RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP45 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; const int SX10_TEMP12 = 1 ; 
const int RX10_TEMP46 = RX10_TEMP45 + SX10_TEMP12 ; 
const int SX10_TEMP13 = 1 ; 
const int RX10_TEMP47 = RX10_TEMP45 + SX10_TEMP13 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = (doubleStub *)calloc(RX10_TEMP47,sizeof( doubleStub )); 
/* finish  */ 
{ 
for ( int SX10_TEMP15 = 0 ; SX10_TEMP15 < RX10_TEMP46 ; SX10_TEMP15 ++ ) 
{ 
const int RX10_TEMP49 = SX10_TEMP15 ; 
const int RX10_TEMP50 = /* here  */ 0 ; 
const int RX10_TEMP51 = RX10_TEMP49 ; 
const int RX10_TEMP52 = /* place.places ( RX10_TEMP51 )  */ 0 
; 
const int RX10_TEMP53 = getDistLocalCount1 ( d , RX10_TEMP51 ) ; 
const int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
struct T8 utmp8  ; 
T8_T8( &utmp8/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP54 , RX10_TEMP50 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
thread8 (&utmp8.THIS,utmp8 );

}/*End of CONSTRUCTOR ASYNC*/
} 

} 

/*Updatable ARRAY*/ struct doubleStub * const SX10_TEMP16 = (doubleStub *)calloc(RX10_TEMP46,sizeof( doubleStub )); 
for ( int SX10_TEMP17 = 0 ; SX10_TEMP17 < RX10_TEMP46 ; SX10_TEMP17 ++ ) 
{ 
const int RX10_TEMP61 = SX10_TEMP17 ; 
struct doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] 
; 
SX10_TEMP16 [ RX10_TEMP61 ] = RX10_TEMP60 ; 
} 

/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP59 = SX10_TEMP16 ; 
struct doubleRefArray1 RX10_TEMP62  ; 
doubleRefArray1_doubleRefArray1( &RX10_TEMP62/*OBJECT INIT IN ASSIGNMENT*/, d , RX10_TEMP59 ) ; 
struct doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; 
TimerTHIS->total_time = ( X10_TEMP19 ) ; 
} 

 return  TimerTHIS; 

} 

void thread6 ( struct Timer *TimerTHIS,  struct T6 const utmpz ) 
{ 
const int RX10_TEMP12 = utmpz .RX10_TEMP12 ; 
const int RX10_TEMP8 = utmpz .RX10_TEMP8 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP1 = (double *)calloc(RX10_TEMP14,sizeof( double )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < RX10_TEMP14 ; SX10_TEMP2 ++ ) 
{ 
const int RX10_TEMP13 = SX10_TEMP2 ; 

{ 
const double X10_TEMP9 = 0 ; 
SX10_TEMP1 [ RX10_TEMP13 ] = X10_TEMP9 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP15 = SX10_TEMP1 ; 
struct doubleStub RX10_TEMP16  ; 
doubleStub_doubleStub( &RX10_TEMP16/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP15 ) ; 
struct T13 utmp13  ; 
T13_T13( &utmp13/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP16 , RX10_TEMP7 , RX10_TEMP6 ) ; 
/* async  */
 {
thread13 (&utmp13.THIS,utmp13 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread7 ( struct Timer *TimerTHIS,  struct T7 const utmpz ) 
{ 
const int RX10_TEMP33 = utmpz .RX10_TEMP33 ; 
const int RX10_TEMP29 = utmpz .RX10_TEMP29 ; 
const int RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP35 = RX10_TEMP33 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP1 = (double *)calloc(RX10_TEMP35,sizeof( double )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < RX10_TEMP35 ; SX10_TEMP2 ++ ) 
{ 
const int RX10_TEMP34 = SX10_TEMP2 ; 

{ 
const double X10_TEMP13 = 0 ; 
SX10_TEMP1 [ RX10_TEMP34 ] = X10_TEMP13 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP36 = SX10_TEMP1 ; 
struct doubleStub RX10_TEMP37  ; 
doubleStub_doubleStub( &RX10_TEMP37/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP36 ) ; 
struct T14 utmp14  ; 
T14_T14( &utmp14/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP37 , RX10_TEMP28 , RX10_TEMP27 ) ; 
/* async  */
 {
thread14 (&utmp14.THIS,utmp14 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread8 ( struct Timer *TimerTHIS,  struct T8 const utmpz ) 
{ 
const int RX10_TEMP54 = utmpz .RX10_TEMP54 ; 
const int RX10_TEMP50 = utmpz .RX10_TEMP50 ; 
const int RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP56 = RX10_TEMP54 + SX10_TEMP0 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP1 = (double *)calloc(RX10_TEMP56,sizeof( double )); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < RX10_TEMP56 ; SX10_TEMP2 ++ ) 
{ 
const int RX10_TEMP55 = SX10_TEMP2 ; 

{ 
const double X10_TEMP17 = 0 ; 
SX10_TEMP1 [ RX10_TEMP55 ] = X10_TEMP17 ; 
} 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP57 = SX10_TEMP1 ; 
struct doubleStub RX10_TEMP58  ; 
doubleStub_doubleStub( &RX10_TEMP58/*OBJECT INIT IN ASSIGNMENT*/, RX10_TEMP57 ) ; 
struct T15 utmp15  ; 
T15_T15( &utmp15/*OBJECT INIT IN ASSIGNMENT*/, TimerTHIS /*this*/, RX10_TEMP58 , RX10_TEMP49 , RX10_TEMP48 ) ; 
/* async  */
 {
thread15 (&utmp15.THIS,utmp15 );

}/*End of CONSTRUCTOR ASYNC*/
} 
} 

void thread13 ( struct Timer *TimerTHIS,  struct T13 const utmpz ) 
{ 
struct doubleStub RX10_TEMP16 = utmpz .RX10_TEMP16 ; 
const int RX10_TEMP7 = utmpz .RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP6 = utmpz .RX10_TEMP6 ; 

{ 
RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP16 ; 
} 
} 

void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) 
{ 
struct doubleStub RX10_TEMP37 = utmpz .RX10_TEMP37 ; 
const int RX10_TEMP28 = utmpz .RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP27 = utmpz .RX10_TEMP27 ; 

{ 
RX10_TEMP27 [ RX10_TEMP28 ] = RX10_TEMP37 ; 
} 
} 

void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) 
{ 
struct doubleStub RX10_TEMP58 = utmpz .RX10_TEMP58 ; 
const int RX10_TEMP49 = utmpz .RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub * const RX10_TEMP48 = utmpz .RX10_TEMP48 ; 

{ 
RX10_TEMP48 [ RX10_TEMP49 ] = RX10_TEMP58 ; 
} 
} 


Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*Updatable ARRAY*/ struct Point2 * const pointArray_ , const int regSize_ ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int minusOne = zero - one ; 
const int f = 0 ; 
const int regR = 2 ; 
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

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*Updatable ARRAY*/ struct Point2 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ , const int low1_ , const int dim1_ ) 
{ 
const int t = 1 ; 
const int regR = 2 ; 
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

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray1THIS->distValue = ( distValue_ ) ; 
doubleRefArray1THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray1THIS; 

} 

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ ) 
{ 
const int zero = 0 ; 
const int one = 1 ; 
const int minusOne = zero - one ; 
const int f = 0 ; 
const int regR = 1 ; 
Region1THIS->regRank = ( regR ) ; 
Region1THIS->regSize = ( regSize_ ) ; 
Region1THIS->pointArray = ( pointArray_ ) ; 
Region1THIS->regType = ( f ) ; 
Region1THIS->low0 = ( minusOne ) ; 
Region1THIS->dim0 = ( zero ) ; 

 return  *Region1THIS; 

} 

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) 
{ 
const int t = 1 ; 
const int regR = 1 ; 
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

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int f0_ ) 
{ 
Point1THIS->f0 = ( f0_ ) ; 

 return  *Point1THIS; 

} 

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) 
{ 
doubleRefArray2THIS->distValue = ( distValue_ ) ; 
doubleRefArray2THIS->contents = ( contents_ ) ; 

 return  *doubleRefArray2THIS; 

} 

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist2THIS->dReg = ( dReg_ ) ; 
Dist2THIS->dDist = ( dDist_ ) ; 

 return  *Dist2THIS; 

} 

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) 
{ 
Dist1THIS->dReg = ( dReg_ ) ; 
Dist1THIS->dDist = ( dDist_ ) ; 

 return  *Dist1THIS; 

} 

Series *Series_Series ( struct Series *SeriesTHIS) 
{ 

{ 
} 

 return  SeriesTHIS; 

} 


Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int f0_ , const int f1_ ) 
{ 
Point2THIS->f0 = ( f0_ ) ; 
Point2THIS->f1 = ( f1_ ) ; 

 return  *Point2THIS; 

} 
/* class RunMain */ int  main ( /*TODO*/) { UniqueDistribution = getUniqueDist ( ) ; 
_Timer_max_counters = _Timer_max_counters_init ( ) ; 
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
