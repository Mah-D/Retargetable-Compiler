#include <math.h>
#include <string.h>
#include <sys/time.h>
#include <stdlib.h>
#include <stdio.h>
#include "RunMain.h"
/* class Program */ 
struct Dist1 * UniqueDistribution ;
long long _Random_multiplier ;
long long _Random_addend ;
long long _Random_mask ;
int _SOR_JACOBI_NUM_ITER ;
long long _SOR_RANDOM_SEED ;
int _Timer_max_counters ;
long long _Random_multiplier_init ( ) 
{ const long long X10_TEMP2 = 0x5DEECE66DL ; 
return X10_TEMP2 ; 
} 

long long _Random_addend_init ( ) 
{ const long long X10_TEMP2 = 0xBL ; 
return X10_TEMP2 ; 
} 

long long _Random_mask_init ( ) 
{ const long long X10_TEMP1 = 1L ; 
const int X10_TEMP2 = 48 ; 
const long long X10_TEMP4 = X10_TEMP1 << X10_TEMP2 ; 
const int X10_TEMP5 = 1 ; 
const long long X10_TEMP7 = X10_TEMP4 - X10_TEMP5 ; 
return X10_TEMP7 ; 
} 

int Random_nextbits (  struct Random  * const X10_TEMP0 , const int bits ) 
{ /*UpdatableVariableDeclaration*/long long oldseed = X10_TEMP0 ->seed ; 
const long long X10_TEMP2 = oldseed * _Random_multiplier ; 
const long long X10_TEMP4 = X10_TEMP2 + _Random_addend ; 
/*UpdatableVariableDeclaration*/long long nextseed = X10_TEMP4 & _Random_mask ; 
const long long X10_TEMP7 = nextseed ; 
X10_TEMP0 ->seed = ( X10_TEMP7 ) ; 
const int X10_TEMP8 = 48 ; 
const int X10_TEMP10 = X10_TEMP8 - bits ; 
const long long X10_TEMP12 = ((nextseed >> X10_TEMP10 ) & (2147483647 >> X10_TEMP10)); 
const int X10_TEMP14 = /*casting*/( int ) X10_TEMP12 ; 
return X10_TEMP14 ; 
} 

int Random_nextInt (  struct Random  * const X10_TEMP0 ) 
{ const int X10_TEMP2 = 32 ; 
const int X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
return X10_TEMP4 ; 
} 

long long Random_nextLong (  struct Random  * const X10_TEMP0 ) 
{ const int X10_TEMP2 = 32 ; 
const int X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const long long X10_TEMP5 = /*casting*/( long  long /*CASTING*/) X10_TEMP4 ; 
const int X10_TEMP6 = 32 ; 
const long long X10_TEMP8 = X10_TEMP5 << X10_TEMP6 ; 
const int X10_TEMP10 = 32 ; 
const int X10_TEMP11 = Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ; 
const long long X10_TEMP13 = X10_TEMP8 + X10_TEMP11 ; 
return X10_TEMP13 ; 
} 

int Random_nextBoolean (  struct Random  * const X10_TEMP0 ) 
{ const int X10_TEMP2 = 1 ; 
const int X10_TEMP3 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const int X10_TEMP4 = 0 ; 
const int X10_TEMP6 = X10_TEMP3 != X10_TEMP4 ; 
return X10_TEMP6 ; 
} 

double Random_nextDouble (  struct Random  * const X10_TEMP0 ) 
{ const int X10_TEMP2 = 26 ; 
const int X10_TEMP4 = Random_nextbits ( X10_TEMP0 , X10_TEMP2 ) ; 
const long long X10_TEMP5 = /*casting*/( long  long /*CASTING*/) X10_TEMP4 ; 
const int X10_TEMP6 = 27 ; 
const long long X10_TEMP8 = X10_TEMP5 << X10_TEMP6 ; 
const int X10_TEMP10 = 27 ; 
const int X10_TEMP11 = Random_nextbits ( X10_TEMP0 , X10_TEMP10 ) ; 
const long long X10_TEMP13 = X10_TEMP8 + X10_TEMP11 ; 
const long long X10_TEMP14 = 1L ; 
const int X10_TEMP15 = 53 ; 
const long long X10_TEMP17 = X10_TEMP14 << X10_TEMP15 ; 
const double X10_TEMP18 = /*casting*/( double ) X10_TEMP17 ; 
const double X10_TEMP20 = X10_TEMP13 / X10_TEMP18 ; 
return X10_TEMP20 ; 
} 

void runMain ( ) 
{ /*UpdatableVariableDeclaration*/ struct Timer  * tmr = (struct Timer  *) malloc(sizeof(struct Timer ));  
Timer_Timer( tmr) ; 
/*UpdatableVariableDeclaration*/int count = 0 ; 
Timer_start ( tmr , count ) ; 
struct SOR * X10_TEMP4 = (struct SOR  *) malloc(sizeof(struct SOR ));  
SOR_SOR( X10_TEMP4) ; 
SOR_run ( X10_TEMP4 ) ; 
Timer_stop ( tmr , count ) ; 
const char * X10_TEMP7 = "Wall-clock time for sor: " ; 
const double X10_TEMP8 = Timer_readTimer ( tmr , count ) ; 
/*ASSIGNMENT STRING*/
 char * tempC1 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC1, "%s%f",X10_TEMP7,X10_TEMP8);
const char * X10_TEMP9 = tempC1;; 
const char * X10_TEMP10 = " secs" ; 
/*ASSIGNMENT STRING*/
 char * tempC2 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC2, "%s%s",X10_TEMP9,X10_TEMP10);
const char * X10_TEMP12 = tempC2;; 
printf( "%s",X10_TEMP12 ) ; 
printf(" \n");} 

int _SOR_JACOBI_NUM_ITER_init ( ) 
{ const int X10_TEMP2 = 100 ; 
return X10_TEMP2 ; 
} 

long long _SOR_RANDOM_SEED_init ( ) 
{ const long long X10_TEMP2 = 10101010 ; 
return X10_TEMP2 ; 
} 

void SOR_run (  struct SOR  * const X10_TEMP0 ) 
{ const double X10_TEMP2 = SOR_kernel ( X10_TEMP0 ) ; 
SOR_validate ( X10_TEMP0 , X10_TEMP2 ) ; 
} 

double SOR_kernel (  struct SOR  * const X10_TEMP0 ) 
{ const int X10_TEMP4 = 10 ; 
const int X10_TEMP5 = 10 ; 
struct Random * X10_TEMP6 = X10_TEMP0 ->R ; 
/*UpdatableVariableDeclaration*/ struct doubleRefArray2  * G = SOR_RandomMatrix ( X10_TEMP0 , X10_TEMP4 , X10_TEMP5 , X10_TEMP6 ) ; 
const double X10_TEMP11 = 1.25; 
const double X10_TEMP13 = SOR_SORrun ( X10_TEMP0 , X10_TEMP11 , G , _SOR_JACOBI_NUM_ITER ) ; 
return X10_TEMP13 ; 
} 

doubleRefArray2  * SOR_RandomMatrix (  struct SOR  * const X10_TEMP0 , const int M , const int N ,  struct Random  * const R ) 
{ const int X10_TEMP4 = 0 ; 
const int X10_TEMP2 = 1 ; 
const int X10_TEMP5 = M - X10_TEMP2 ; 
struct Region1 * X10_TEMP13 = createNewRegion1R ( X10_TEMP4 , X10_TEMP5 ) ; 
const int X10_TEMP10 = 0 ; 
const int X10_TEMP8 = 1 ; 
const int X10_TEMP11 = N - X10_TEMP8 ; 
struct Region1 * X10_TEMP14 = createNewRegion1R ( X10_TEMP10 , X10_TEMP11 ) ; 
struct Dist2 * d = SOR_blockStar ( X10_TEMP0 , X10_TEMP13 , X10_TEMP14 ) ; 
struct Region2 * RX10_TEMP0 = d ->dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP5,sizeof( doubleStub *)); 
/* finish  */ 
{ for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount2 ( d , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
/* async ( RX10_TEMP10 )  */ 
{ const int SX10_TEMP4 = 1 ; 
const int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (double *)calloc(RX10_TEMP13,sizeof( double *)); 
struct doubleStub * RX10_TEMP15 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP15, RX10_TEMP14 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP15 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP4,sizeof( doubleStub *)); 
for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < RX10_TEMP4 ; SX10_TEMP7 ++ ) 
{ const int RX10_TEMP18 = SX10_TEMP7 ; 
struct doubleStub * RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
SX10_TEMP6 [ RX10_TEMP18 ] = RX10_TEMP17 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP16 = SX10_TEMP6 ; 
struct doubleRefArray2 * RX10_TEMP19 = (struct doubleRefArray2  *) malloc(sizeof(struct doubleRefArray2 ));  
doubleRefArray2_doubleRefArray2( RX10_TEMP19, d , RX10_TEMP16 ) ; 
struct doubleRefArray2 * t = RX10_TEMP19 ; 
struct Dist2 * RX10_TEMP20 = t ->distValue ; 
struct Region2 * RX10_TEMP21 = RX10_TEMP20 ->dReg ; 
struct Region2 * X10_TEMP18 = RX10_TEMP21 ; 
const int RX10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP23 = X10_TEMP18 ->regSize ; 
RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; const int SX10_TEMP8 = 1 ; 
const int RX10_TEMP24 = RX10_TEMP23 + SX10_TEMP8 ; 
for ( int SX10_TEMP9 = 0 ; SX10_TEMP9 < RX10_TEMP24 ; SX10_TEMP9 ++ ) 
{ const int RX10_TEMP22 = SX10_TEMP9 ; 
const int RX10_TEMP26 = RX10_TEMP22 ; 
struct Point2 * p = regionOrdinalPoint2 ( X10_TEMP18 , RX10_TEMP26 ) ; 
const double X10_TEMP21 = Random_nextDouble ( R ) ; 
const double X10_TEMP22 = 1e-6; 
const double X10_TEMP24 = X10_TEMP21 * X10_TEMP22 ; 
SOR_write ( X10_TEMP0 , t , p , X10_TEMP24 ) ; 
} 

return t ; 
} 

void SOR_write (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2  * const t ,  struct Point2  * const p , const double v ) 
{ /* finish  */ 
{ struct Dist2 * RX10_TEMP0 = t ->distValue ; 
struct Dist2 * X10_TEMP1 = RX10_TEMP0 ; 
struct Region2 * RX10_TEMP1 = X10_TEMP1 ->dReg ; 
const int RX10_TEMP2 = searchPointInRegion2 ( RX10_TEMP1 , p ) ; 
const int RX10_TEMP3 = 0 ; 
const int RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; 
if ( RX10_TEMP4 ) 
{ const char * RX10_TEMP5 = "Point p not found in the distribution X10_TEMP1." ; 
fprintf(stderr, RX10_TEMP5 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP6 = getPlaceFromDist2 ( X10_TEMP1 , RX10_TEMP2 ) ; 
const int X10_TEMP4 = RX10_TEMP6 ; 
/* async ( X10_TEMP4 )  */ 
{ const double X10_TEMP7 = v ; 
struct Dist2 * RX10_TEMP7 = t ->distValue ; 
struct Region2 * RX10_TEMP8 = RX10_TEMP7 ->dReg ; 
const int RX10_TEMP9 = searchPointInRegion2 ( RX10_TEMP8 , p ) ; 
const int RX10_TEMP10 = 0 ; 
const int RX10_TEMP11 = RX10_TEMP9 < RX10_TEMP10 ; 
if ( RX10_TEMP11 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP12 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP12 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP13 = getPlaceFromDist2 ( RX10_TEMP7 , RX10_TEMP9 ) ; 
const int RX10_TEMP15 = /* here  */ 0 ; 
const int RX10_TEMP16 = RX10_TEMP13 != RX10_TEMP15 ; 
if ( RX10_TEMP16 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP14 = "Bad place access for array t" ; 
fprintf(stderr, RX10_TEMP14 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( t , RX10_TEMP9 , X10_TEMP7 ) ; 
} 

} 

} 

Dist2  * SOR_blockStar (  struct SOR  * const X10_TEMP0 ,  struct Region1  * const r1 ,  struct Region1  * const r2 ) 
{ struct Dist1 * X10_TEMP2 = getBlockDist1 ( r1 ) ; 
struct Dist1 * d1 = X10_TEMP2 ; 
struct Dist2 * X10_TEMP7 = SOR_distTimesRegion ( X10_TEMP0 , d1 , r2 ) ; 
return X10_TEMP7 ; 
} 

Dist2  * SOR_distTimesRegion (  struct SOR  * const X10_TEMP0 ,  struct Dist1  * const d ,  struct Region1  * const r ) 
{ const int X10_TEMP1 = 0 ; 
const int X10_TEMP2 = 1 ; 
const int X10_TEMP3 = X10_TEMP1 - X10_TEMP2 ; 
struct Region2 * X10_TEMP4 = createNewRegion2RR ( X10_TEMP1 , X10_TEMP3 , X10_TEMP1 , X10_TEMP3 ) ; 
struct Region2 * X10_TEMP6 = X10_TEMP4 ; 
const int X10_TEMP7 = /* here  */ 0 ; 
/*UpdatableVariableDeclaration*/ struct Dist2  * d0 = getPlaceDist2 ( X10_TEMP6 , X10_TEMP7 ) ; 
struct Dist1 * X10_TEMP10 = /*program*/UniqueDistribution ; 
struct Region1 * RX10_TEMP1 = X10_TEMP10 ->dReg ; 
const int RX10_TEMP4 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP2 = RX10_TEMP1 ->regSize ; 
RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP3 = RX10_TEMP2 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP3 ; SX10_TEMP1 ++ ) 
{ const int RX10_TEMP0 = SX10_TEMP1 ; 
const int RX10_TEMP5 = RX10_TEMP0 ; 
struct Point1 * pl = regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; 
struct Dist1 * X10_TEMP11 = /*program*/UniqueDistribution ; 
struct Region1 * RX10_TEMP6 = X10_TEMP11 ->dReg ; 
const int RX10_TEMP7 = searchPointInRegion1 ( RX10_TEMP6 , pl ) ; 
const int RX10_TEMP8 = 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; 
if ( RX10_TEMP9 ) 
{ const char * RX10_TEMP10 = "Point pl not found in the distribution X10_TEMP11." ; 
fprintf(stderr, RX10_TEMP10 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP11 = getPlaceFromDist1 ( X10_TEMP11 , RX10_TEMP7 ) ; 
/*UpdatableVariableDeclaration*/int p = RX10_TEMP11 ; 
struct Dist1 * X10_TEMP15 = restrictDist1 ( d , p ) ; 
struct Region1 * RX10_TEMP12 = X10_TEMP15 ->dReg ; 
struct Region1 * X10_TEMP16 = RX10_TEMP12 ; 
struct Region2 * X10_TEMP19 = createNewRegion2AA ( X10_TEMP16 , r ) ; 
struct Dist2 * X10_TEMP21 = getPlaceDist2 ( X10_TEMP19 , p ) ; 
struct Dist2 * X10_TEMP23 = unionDist2 ( d0 , X10_TEMP21 ) ; 
d0 = X10_TEMP23 ; } 

return d0 ; 
} 

void SOR_validate (  struct SOR  * const X10_TEMP0 , const double gtotal ) 
{ const double X10_TEMP1 = 4.5185971433257635E-5; 
const double X10_TEMP3 = gtotal - X10_TEMP1 ; 
/*UpdatableVariableDeclaration*/double dev = fabs ( X10_TEMP3 ) ; 
const double X10_TEMP5 = 1.0e-12; 
const int X10_TEMP7 = dev > X10_TEMP5 ; 
if ( X10_TEMP7 ) 
{ const char * X10_TEMP9 = "Validation failed" ; 
printf( "%s",X10_TEMP9 ) ; 
printf(" \n");const char * X10_TEMP10 = "gtotal = " ; 
/*ASSIGNMENT STRING*/
 char * tempC3 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC3, "%s%f",X10_TEMP10,gtotal);
const char * X10_TEMP11 = tempC3;; 
const char * X10_TEMP12 = "  " ; 
/*ASSIGNMENT STRING*/
 char * tempC4 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC4, "%s%s",X10_TEMP11,X10_TEMP12);
const char * X10_TEMP13 = tempC4;; 
/*ASSIGNMENT STRING*/
 char * tempC5 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC5, "%s%f",X10_TEMP13,dev);
const char * X10_TEMP15 = tempC5;; 
printf( "%s",X10_TEMP15 ) ; 
printf(" \n");const char * X10_TEMP17 = "Validation failed" ; 
fprintf(stderr, X10_TEMP17 ) ; 
exit(EXIT_FAILURE);
} 

} 

double SOR_read (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2  * const G ,  struct Point2  * const pt ) 
{ const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = 0 ; 
struct Region1 * r = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const int X10_TEMP6 = /* here  */ 0 ; 
struct Dist1 * d = getPlaceDist1 ( r , X10_TEMP6 ) ; 
struct Region1 * RX10_TEMP0 = d ->dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP5,sizeof( doubleStub *)); 
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
const int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ double * const RX10_TEMP14 = (double *)calloc(RX10_TEMP13,sizeof( double *)); 
struct doubleStub * RX10_TEMP15 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP15, RX10_TEMP14 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP15 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP4,sizeof( doubleStub *)); 
for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < RX10_TEMP4 ; SX10_TEMP7 ++ ) 
{ const int RX10_TEMP18 = SX10_TEMP7 ; 
struct doubleStub * RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] 
; 
SX10_TEMP6 [ RX10_TEMP18 ] = RX10_TEMP17 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP16 = SX10_TEMP6 ; 
struct doubleRefArray1 * RX10_TEMP19 = (struct doubleRefArray1  *) malloc(sizeof(struct doubleRefArray1 ));  
doubleRefArray1_doubleRefArray1( RX10_TEMP19, d , RX10_TEMP16 ) ; 
struct doubleRefArray1 * result = RX10_TEMP19 ; 
const int phere = /* here  */ 0 ; 
/* finish  */ 
{ struct Dist2 * RX10_TEMP20 = G ->distValue ; 
struct Dist2 * X10_TEMP10 = RX10_TEMP20 ; 
struct Region2 * RX10_TEMP21 = X10_TEMP10 ->dReg ; 
const int RX10_TEMP22 = searchPointInRegion2 ( RX10_TEMP21 , pt ) ; 
const int RX10_TEMP23 = 0 ; 
const int RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ const char * RX10_TEMP25 = "Point pt not found in the distribution X10_TEMP10." ; 
fprintf(stderr, RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP26 = getPlaceFromDist2 ( X10_TEMP10 , RX10_TEMP22 ) ; 
const int X10_TEMP13 = RX10_TEMP26 ; 
/* async ( X10_TEMP13 )  */ 
{ struct Dist2 * RX10_TEMP27 = G ->distValue ; 
struct Region2 * RX10_TEMP28 = RX10_TEMP27 ->dReg ; 
const int RX10_TEMP29 = searchPointInRegion2 ( RX10_TEMP28 , pt ) ; 
const int RX10_TEMP30 = 0 ; 
const int RX10_TEMP31 = RX10_TEMP29 < RX10_TEMP30 ; 
if ( RX10_TEMP31 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP32 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP32 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP33 = getPlaceFromDist2 ( RX10_TEMP27 , RX10_TEMP29 ) ; 
const int RX10_TEMP35 = /* here  */ 0 ; 
const int RX10_TEMP36 = RX10_TEMP33 != RX10_TEMP35 ; 
if ( RX10_TEMP36 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP34 = "Bad place access for array G" ; 
fprintf(stderr, RX10_TEMP34 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP37 = getRefArrayValue2double ( G , RX10_TEMP29 ) ; 
const double val = RX10_TEMP37 ; 
/* async ( phere )  */ 
{ const int X10_TEMP18 = 0 ; 
const double X10_TEMP20 = val ; 
struct Point1 * RX10_TEMP38 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP38, X10_TEMP18 ) ; 
struct Dist1 * RX10_TEMP39 = result ->distValue ; 
struct Region1 * RX10_TEMP40 = RX10_TEMP39 ->dReg ; 
const int RX10_TEMP41 = searchPointInRegion1 ( RX10_TEMP40 , RX10_TEMP38 ) ; 
const int RX10_TEMP42 = 0 ; 
const int RX10_TEMP43 = RX10_TEMP41 < RX10_TEMP42 ; 
if ( RX10_TEMP43 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP44 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP44 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP45 = getPlaceFromDist1 ( RX10_TEMP39 , RX10_TEMP41 ) ; 
const int RX10_TEMP47 = /* here  */ 0 ; 
const int RX10_TEMP48 = RX10_TEMP45 != RX10_TEMP47 ; 
if ( RX10_TEMP48 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP46 = "Bad place access for array result" ; 
fprintf(stderr, RX10_TEMP46 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( result , RX10_TEMP41 , X10_TEMP20 ) ; 
} 

} 

} 

const int X10_TEMP22 = 0 ; 
struct Point1 * RX10_TEMP49 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP49, X10_TEMP22 ) ; 
struct Dist1 * RX10_TEMP50 = result ->distValue ; 
struct Region1 * RX10_TEMP51 = RX10_TEMP50 ->dReg ; 
const int RX10_TEMP52 = searchPointInRegion1 ( RX10_TEMP51 , RX10_TEMP49 ) ; 
const int RX10_TEMP53 = 0 ; 
const int RX10_TEMP54 = RX10_TEMP52 < RX10_TEMP53 ; 
if ( RX10_TEMP54 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP55 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP55 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP56 = getPlaceFromDist1 ( RX10_TEMP50 , RX10_TEMP52 ) ; 
const int RX10_TEMP58 = /* here  */ 0 ; 
const int RX10_TEMP59 = RX10_TEMP56 != RX10_TEMP58 ; 
if ( RX10_TEMP59 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP57 = "Bad place access for array result" ; 
fprintf(stderr, RX10_TEMP57 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP60 = getRefArrayValue1double ( result , RX10_TEMP52 ) ; 
const double X10_TEMP24 = RX10_TEMP60 ; 
return X10_TEMP24 ; 
} 

double SOR_SORrun (  struct SOR  * const X10_TEMP0 , const double omega ,  struct doubleRefArray2  * const G , const int num_iterations ) 
{ struct Dist2 * RX10_TEMP0 = G ->distValue ; 
struct Dist2 * X10_TEMP1 = RX10_TEMP0 ; 
struct Region2 * RX10_TEMP1 = X10_TEMP1 ->dReg ; 
struct Region2 * X10_TEMP2 = RX10_TEMP1 ; 
const int X10_TEMP4 = 0 ; 
struct Region1 * RX10_TEMP2 = getRank2 ( X10_TEMP2 , X10_TEMP4 ) ; 
struct Region1 * X10_TEMP5 = RX10_TEMP2 ; 
const int M = X10_TEMP5 ->regSize ; 
struct Dist2 * RX10_TEMP3 = G ->distValue ; 
struct Dist2 * X10_TEMP7 = RX10_TEMP3 ; 
struct Region2 * RX10_TEMP4 = X10_TEMP7 ->dReg ; 
struct Region2 * X10_TEMP8 = RX10_TEMP4 ; 
const int X10_TEMP10 = 1 ; 
struct Region1 * RX10_TEMP5 = getRank2 ( X10_TEMP8 , X10_TEMP10 ) ; 
struct Region1 * X10_TEMP11 = RX10_TEMP5 ; 
const int N = X10_TEMP11 ->regSize ; 
const double X10_TEMP13 = 0.25; 
const double omega_over_four = omega * X10_TEMP13 ; 
const double X10_TEMP15 = 1.0; 
const double one_minus_omega = X10_TEMP15 - omega ; 
const int X10_TEMP17 = 1 ; 
const int Mm1 = M - X10_TEMP17 ; 
const int X10_TEMP19 = 1 ; 
const int Nm1 = N - X10_TEMP19 ; 
const int X10_TEMP24 = 0 ; 
const int X10_TEMP22 = 1 ; 
const int X10_TEMP25 = num_iterations - X10_TEMP22 ; 
const int X10_TEMP28 = 0 ; 
const int X10_TEMP29 = 1 ; 
struct Region2 * X10_TEMP31 = createNewRegion2RR ( X10_TEMP24 , X10_TEMP25 , X10_TEMP28 , X10_TEMP29 ) ; 
const int RX10_TEMP9 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP7 = X10_TEMP31 ->regSize ; 
RX10_TEMP7 = RX10_TEMP7 - RX10_TEMP9 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP8 = RX10_TEMP7 + SX10_TEMP0 ; 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < RX10_TEMP8 ; SX10_TEMP1 ++ ) 
{ const int RX10_TEMP6 = SX10_TEMP1 ; 
const int RX10_TEMP10 = RX10_TEMP6 ; 
struct Point2 * po = regionOrdinalPoint2 ( X10_TEMP31 , RX10_TEMP10 ) ; 
/* finish  */ 
{ const int X10_TEMP47 = 0 ; 
const int X10_TEMP33 = 1 ; 
const int X10_TEMP35 = Mm1 - X10_TEMP33 ; 
const int X10_TEMP37 = 1 ; 
const int X10_TEMP38 = po ->f1 ; 
const int X10_TEMP40 = X10_TEMP37 + X10_TEMP38 ; 
const int X10_TEMP42 = X10_TEMP35 - X10_TEMP40 ; 
const int X10_TEMP43 = 2 ; 
const int X10_TEMP45 = X10_TEMP42 / X10_TEMP43 ; 
const int X10_TEMP51 = 1 ; 
const int X10_TEMP49 = 1 ; 
const int X10_TEMP52 = Nm1 - X10_TEMP49 ; 
struct Region2 * X10_TEMP54 = createNewRegion2RR ( X10_TEMP47 , X10_TEMP45 , X10_TEMP51 , X10_TEMP52 ) ; 
const int X10_TEMP55 = /* here  */ 0 ; 
const int RX10_TEMP14 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP12 = X10_TEMP54 ->regSize ; 
RX10_TEMP12 = RX10_TEMP12 - RX10_TEMP14 ; const int SX10_TEMP2 = 1 ; 
const int RX10_TEMP13 = RX10_TEMP12 + SX10_TEMP2 ; 
for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP13 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP11 = SX10_TEMP3 ; 
const int RX10_TEMP15 = RX10_TEMP11 ; 
struct Point2 * pt = regionOrdinalPoint2 ( X10_TEMP54 , RX10_TEMP15 ) ; 
/* async ( X10_TEMP55 )  */ 
{ /*UpdatableVariableDeclaration*/int X10_TEMP58 = 2 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP59 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP16 = pt ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP17 = pt ->f1 ; 
RX10_TEMP16 = RX10_TEMP16 * X10_TEMP58 ; RX10_TEMP17 = RX10_TEMP17 * X10_TEMP59 ; struct Point2 * X10_TEMP65 = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( X10_TEMP65, RX10_TEMP16 , RX10_TEMP17 ) ; 
const int X10_TEMP61 = 1 ; 
const int X10_TEMP62 = po ->f1 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP66 = X10_TEMP61 + X10_TEMP62 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP67 = 0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP18 = X10_TEMP65 ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP19 = X10_TEMP65 ->f1 ; 
RX10_TEMP18 = RX10_TEMP18 + X10_TEMP66 ; RX10_TEMP19 = RX10_TEMP19 + X10_TEMP67 ; struct Point2 * ij = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( ij, RX10_TEMP18 , RX10_TEMP19 ) ; 
/* finish  */ 
{ struct Dist2 * RX10_TEMP20 = G ->distValue ; 
struct Dist2 * X10_TEMP69 = RX10_TEMP20 ; 
struct Region2 * RX10_TEMP21 = X10_TEMP69 ->dReg ; 
const int RX10_TEMP22 = searchPointInRegion2 ( RX10_TEMP21 , ij ) ; 
const int RX10_TEMP23 = 0 ; 
const int RX10_TEMP24 = RX10_TEMP22 < RX10_TEMP23 ; 
if ( RX10_TEMP24 ) 
{ const char * RX10_TEMP25 = "Point ij not found in the distribution X10_TEMP69." ; 
fprintf(stderr, RX10_TEMP25 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP26 = getPlaceFromDist2 ( X10_TEMP69 , RX10_TEMP22 ) ; 
const int X10_TEMP72 = RX10_TEMP26 ; 
/* async ( X10_TEMP72 )  */ 
{ const int X10_TEMP75 = 1 ; 
const int X10_TEMP76 = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP79 = X10_TEMP76 - X10_TEMP75 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP80 = 0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP27 = ij ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP28 = ij ->f1 ; 
RX10_TEMP27 = RX10_TEMP27 + X10_TEMP79 ; RX10_TEMP28 = RX10_TEMP28 + X10_TEMP80 ; struct Point2 * X10_TEMP82 = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( X10_TEMP82, RX10_TEMP27 , RX10_TEMP28 ) ; 
const double X10_TEMP90 = SOR_read ( X10_TEMP0 , G , X10_TEMP82 ) ; 
/*UpdatableVariableDeclaration*/int X10_TEMP86 = 1 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP87 = 0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP29 = ij ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP30 = ij ->f1 ; 
RX10_TEMP29 = RX10_TEMP29 + X10_TEMP86 ; RX10_TEMP30 = RX10_TEMP30 + X10_TEMP87 ; struct Point2 * X10_TEMP89 = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( X10_TEMP89, RX10_TEMP29 , RX10_TEMP30 ) ; 
const double X10_TEMP91 = SOR_read ( X10_TEMP0 , G , X10_TEMP89 ) ; 
const double X10_TEMP100 = X10_TEMP90 + X10_TEMP91 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP96 = 0 ; 
const int X10_TEMP93 = 1 ; 
const int X10_TEMP94 = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP97 = X10_TEMP94 - X10_TEMP93 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP31 = ij ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP32 = ij ->f1 ; 
RX10_TEMP31 = RX10_TEMP31 + X10_TEMP96 ; RX10_TEMP32 = RX10_TEMP32 + X10_TEMP97 ; struct Point2 * X10_TEMP99 = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( X10_TEMP99, RX10_TEMP31 , RX10_TEMP32 ) ; 
struct Dist2 * RX10_TEMP33 = G ->distValue ; 
struct Region2 * RX10_TEMP34 = RX10_TEMP33 ->dReg ; 
const int RX10_TEMP35 = searchPointInRegion2 ( RX10_TEMP34 , X10_TEMP99 ) ; 
const int RX10_TEMP36 = 0 ; 
const int RX10_TEMP37 = RX10_TEMP35 < RX10_TEMP36 ; 
if ( RX10_TEMP37 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP38 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP38 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP39 = getPlaceFromDist2 ( RX10_TEMP33 , RX10_TEMP35 ) ; 
const int RX10_TEMP41 = /* here  */ 0 ; 
const int RX10_TEMP42 = RX10_TEMP39 != RX10_TEMP41 ; 
if ( RX10_TEMP42 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP40 = "Bad place access for array G" ; 
fprintf(stderr, RX10_TEMP40 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP43 = getRefArrayValue2double ( G , RX10_TEMP35 ) ; 
const double X10_TEMP101 = RX10_TEMP43 ; 
const double X10_TEMP108 = X10_TEMP100 + X10_TEMP101 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP104 = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP105 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP44 = ij ->f0 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP45 = ij ->f1 ; 
RX10_TEMP44 = RX10_TEMP44 + X10_TEMP104 ; RX10_TEMP45 = RX10_TEMP45 + X10_TEMP105 ; struct Point2 * X10_TEMP107 = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( X10_TEMP107, RX10_TEMP44 , RX10_TEMP45 ) ; 
struct Dist2 * RX10_TEMP46 = G ->distValue ; 
struct Region2 * RX10_TEMP47 = RX10_TEMP46 ->dReg ; 
const int RX10_TEMP48 = searchPointInRegion2 ( RX10_TEMP47 , X10_TEMP107 ) ; 
const int RX10_TEMP49 = 0 ; 
const int RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; 
if ( RX10_TEMP50 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP51 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP51 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP52 = getPlaceFromDist2 ( RX10_TEMP46 , RX10_TEMP48 ) ; 
const int RX10_TEMP54 = /* here  */ 0 ; 
const int RX10_TEMP55 = RX10_TEMP52 != RX10_TEMP54 ; 
if ( RX10_TEMP55 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP53 = "Bad place access for array G" ; 
fprintf(stderr, RX10_TEMP53 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP56 = getRefArrayValue2double ( G , RX10_TEMP48 ) ; 
const double X10_TEMP109 = RX10_TEMP56 ; 
const double X10_TEMP111 = X10_TEMP108 + X10_TEMP109 ; 
const double X10_TEMP114 = omega_over_four * X10_TEMP111 ; 
struct Dist2 * RX10_TEMP57 = G ->distValue ; 
struct Region2 * RX10_TEMP58 = RX10_TEMP57 ->dReg ; 
const int RX10_TEMP59 = searchPointInRegion2 ( RX10_TEMP58 , ij ) ; 
const int RX10_TEMP60 = 0 ; 
const int RX10_TEMP61 = RX10_TEMP59 < RX10_TEMP60 ; 
if ( RX10_TEMP61 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP62 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP62 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP63 = getPlaceFromDist2 ( RX10_TEMP57 , RX10_TEMP59 ) ; 
const int RX10_TEMP65 = /* here  */ 0 ; 
const int RX10_TEMP66 = RX10_TEMP63 != RX10_TEMP65 ; 
if ( RX10_TEMP66 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP64 = "Bad place access for array G" ; 
fprintf(stderr, RX10_TEMP64 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP67 = getRefArrayValue2double ( G , RX10_TEMP59 ) ; 
const double X10_TEMP113 = RX10_TEMP67 ; 
const double X10_TEMP115 = one_minus_omega * X10_TEMP113 ; 
const double X10_TEMP117 = X10_TEMP114 + X10_TEMP115 ; 
const double X10_TEMP118 = X10_TEMP117 ; 
struct Dist2 * RX10_TEMP68 = G ->distValue ; 
struct Region2 * RX10_TEMP69 = RX10_TEMP68 ->dReg ; 
const int RX10_TEMP70 = searchPointInRegion2 ( RX10_TEMP69 , ij ) ; 
const int RX10_TEMP71 = 0 ; 
const int RX10_TEMP72 = RX10_TEMP70 < RX10_TEMP71 ; 
if ( RX10_TEMP72 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP73 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP73 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP74 = getPlaceFromDist2 ( RX10_TEMP68 , RX10_TEMP70 ) ; 
const int RX10_TEMP76 = /* here  */ 0 ; 
const int RX10_TEMP77 = RX10_TEMP74 != RX10_TEMP76 ; 
if ( RX10_TEMP77 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP75 = "Bad place access for array G" ; 
fprintf(stderr, RX10_TEMP75 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue2double ( G , RX10_TEMP70 , X10_TEMP118 ) ; 
} 

} 

} 

} 

} 

} 

const double X10_TEMP120 = doublerefArraySum2 ( G ) ; 
return X10_TEMP120 ; 
} 

int _Timer_max_counters_init ( ) 
{ const int X10_TEMP2 = 64 ; 
return X10_TEMP2 ; 
} 

void Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) 
{ struct doubleRefArray1 * X10_TEMP1 = X10_TEMP0 ->start_time ; 
const double X10_TEMP4 = getTIME( ) 
; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 * RX10_TEMP0 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP0, n ) ; 
struct Dist1 * RX10_TEMP1 = X10_TEMP1 ->distValue ; 
struct Region1 * RX10_TEMP2 = RX10_TEMP1 ->dReg ; 
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

void Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) 
{ struct doubleRefArray1 * X10_TEMP1 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP5 = getTIME( ) 
; 
struct doubleRefArray1 * X10_TEMP3 = X10_TEMP0 ->start_time ; 
struct Point1 * RX10_TEMP0 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP0, n ) ; 
struct Dist1 * RX10_TEMP1 = X10_TEMP3 ->distValue ; 
struct Region1 * RX10_TEMP2 = RX10_TEMP1 ->dReg ; 
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
struct Point1 * RX10_TEMP12 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP12, n ) ; 
struct Dist1 * RX10_TEMP13 = X10_TEMP1 ->distValue ; 
struct Region1 * RX10_TEMP14 = RX10_TEMP13 ->dReg ; 
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
struct doubleRefArray1 * X10_TEMP10 = X10_TEMP0 ->elapsed_time ; 
struct doubleRefArray1 * X10_TEMP12 = X10_TEMP0 ->elapsed_time ; 
struct Point1 * RX10_TEMP23 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP23, n ) ; 
struct Dist1 * RX10_TEMP24 = X10_TEMP12 ->distValue ; 
struct Region1 * RX10_TEMP25 = RX10_TEMP24 ->dReg ; 
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
struct Point1 * RX10_TEMP35 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP35, n ) ; 
struct Dist1 * RX10_TEMP36 = X10_TEMP10 ->distValue ; 
struct Region1 * RX10_TEMP37 = RX10_TEMP36 ->dReg ; 
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
struct doubleRefArray1 * X10_TEMP19 = X10_TEMP0 ->total_time ; 
struct doubleRefArray1 * X10_TEMP21 = X10_TEMP0 ->total_time ; 
struct Point1 * RX10_TEMP46 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP46, n ) ; 
struct Dist1 * RX10_TEMP47 = X10_TEMP21 ->distValue ; 
struct Region1 * RX10_TEMP48 = RX10_TEMP47 ->dReg ; 
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
struct doubleRefArray1 * X10_TEMP23 = X10_TEMP0 ->elapsed_time ; 
struct Point1 * RX10_TEMP58 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP58, n ) ; 
struct Dist1 * RX10_TEMP59 = X10_TEMP23 ->distValue ; 
struct Region1 * RX10_TEMP60 = RX10_TEMP59 ->dReg ; 
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
struct Point1 * RX10_TEMP70 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP70, n ) ; 
struct Dist1 * RX10_TEMP71 = X10_TEMP19 ->distValue ; 
struct Region1 * RX10_TEMP72 = RX10_TEMP71 ->dReg ; 
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

double Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) 
{ struct doubleRefArray1 * X10_TEMP1 = X10_TEMP0 ->total_time ; 
struct Point1 * RX10_TEMP0 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP0, n ) ; 
struct Dist1 * RX10_TEMP1 = X10_TEMP1 ->distValue ; 
struct Region1 * RX10_TEMP2 = RX10_TEMP1 ->dReg ; 
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

void Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int n ) 
{ struct doubleRefArray1 * X10_TEMP1 = X10_TEMP0 ->total_time ; 
const double X10_TEMP4 = 0 ; 
const double X10_TEMP5 = X10_TEMP4 ; 
struct Point1 * RX10_TEMP0 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP0, n ) ; 
struct Dist1 * RX10_TEMP1 = X10_TEMP1 ->distValue ; 
struct Region1 * RX10_TEMP2 = RX10_TEMP1 ->dReg ; 
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
struct doubleRefArray1 * X10_TEMP6 = X10_TEMP0 ->start_time ; 
const double X10_TEMP9 = 0 ; 
const double X10_TEMP10 = X10_TEMP9 ; 
struct Point1 * RX10_TEMP11 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP11, n ) ; 
struct Dist1 * RX10_TEMP12 = X10_TEMP6 ->distValue ; 
struct Region1 * RX10_TEMP13 = RX10_TEMP12 ->dReg ; 
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
struct doubleRefArray1 * X10_TEMP11 = X10_TEMP0 ->elapsed_time ; 
const double X10_TEMP14 = 0 ; 
const double X10_TEMP15 = X10_TEMP14 ; 
struct Point1 * RX10_TEMP22 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP22, n ) ; 
struct Dist1 * RX10_TEMP23 = X10_TEMP11 ->distValue ; 
struct Region1 * RX10_TEMP24 = RX10_TEMP23 ->dReg ; 
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

void Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) 
{ /*UpdatableVariableDeclaration*/int i = 0 ; 
/*UpdatableVariableDeclaration*/int X10_TEMP4 = i < _Timer_max_counters ; 

while ( X10_TEMP4 ) 
{ Timer_resetTimer ( X10_TEMP0 , i ) ; 
const int X10_TEMP6 = i ; 
const int X10_TEMP7 = 1 ; 
i = i + X10_TEMP7 ; X10_TEMP4 = i < _Timer_max_counters ; } 

} 

double doublerefArraySum2 (  struct doubleRefArray2  * const sumArray ) 
{ const int maxPlaces = /* place.MAX_PLACES  */ 1 ; 
const int one = 1 ; 
const int zero = 0 ; 
const int maxPlacesMinusOne = maxPlaces - one ; 
struct Region1 * dReg = createNewRegion1R ( zero , maxPlacesMinusOne ) ; 
const int source = /* here  */ 0 ; 
struct Dist1 * dSum = getPlaceDist1 ( dReg , source ) ; 
const double initVal = 0 ; 
struct Region1 * RX10_TEMP0 = dSum ->dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP5,sizeof( doubleStub *)); 
/* finish  */ 
{ for ( int SX10_TEMP3 = 0 ; SX10_TEMP3 < RX10_TEMP4 ; SX10_TEMP3 ++ ) 
{ const int RX10_TEMP7 = SX10_TEMP3 ; 
const int RX10_TEMP8 = /* here  */ 0 ; 
const int RX10_TEMP9 = RX10_TEMP7 ; 
const int RX10_TEMP10 = /* place.places ( RX10_TEMP9 )  */ 0 
; 
const int RX10_TEMP11 = getDistLocalCount1 ( dSum , RX10_TEMP9 ) ; 
const int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
/* async ( RX10_TEMP10 )  */ 
{ const int SX10_TEMP4 = 1 ; 
const int RX10_TEMP14 = RX10_TEMP12 + SX10_TEMP4 ; 
/*Updatable ARRAY*/ double * const SX10_TEMP5 = (double *)calloc(RX10_TEMP14,sizeof( double *)); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < RX10_TEMP14 ; SX10_TEMP6 ++ ) 
{ const int RX10_TEMP13 = SX10_TEMP6 ; 
SX10_TEMP5 [ RX10_TEMP13 ] = initVal ; 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP15 = SX10_TEMP5 ; 
struct doubleStub * RX10_TEMP16 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP16, RX10_TEMP15 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP16 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP7 = (doubleStub **)calloc(RX10_TEMP4,sizeof( doubleStub *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < RX10_TEMP4 ; SX10_TEMP8 ++ ) 
{ const int RX10_TEMP19 = SX10_TEMP8 ; 
struct doubleStub * RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
SX10_TEMP7 [ RX10_TEMP19 ] = RX10_TEMP18 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP17 = SX10_TEMP7 ; 
struct doubleRefArray1 * RX10_TEMP20 = (struct doubleRefArray1  *) malloc(sizeof(struct doubleRefArray1 ));  
doubleRefArray1_doubleRefArray1( RX10_TEMP20, dSum , RX10_TEMP17 ) ; 
struct doubleRefArray1 * localSumArray = RX10_TEMP20 ; 
struct Dist1 * dUnique = /*program*/UniqueDistribution ; 
/* finish  */ 
{ struct Region1 * RX10_TEMP22 = dUnique ->dReg ; 
const int RX10_TEMP25 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP23 = RX10_TEMP22 ->regSize ; 
RX10_TEMP23 = RX10_TEMP23 - RX10_TEMP25 ; const int SX10_TEMP9 = 1 ; 
const int RX10_TEMP24 = RX10_TEMP23 + SX10_TEMP9 ; 
for ( int SX10_TEMP10 = 0 ; SX10_TEMP10 < RX10_TEMP24 ; SX10_TEMP10 ++ ) 
{ const int RX10_TEMP21 = SX10_TEMP10 ; 
const int RX10_TEMP26 = RX10_TEMP21 ; 
struct Point1 * p = regionOrdinalPoint1 ( RX10_TEMP22 , RX10_TEMP26 ) ; 
struct Region1 * RX10_TEMP27 = dUnique ->dReg ; 
const int RX10_TEMP28 = searchPointInRegion1 ( RX10_TEMP27 , p ) ; 
const int RX10_TEMP29 = 0 ; 
const int RX10_TEMP30 = RX10_TEMP28 < RX10_TEMP29 ; 
if ( RX10_TEMP30 ) 
{ const char * RX10_TEMP31 = "Point p not found in the distribution dUnique." ; 
fprintf(stderr, RX10_TEMP31 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP32 = getPlaceFromDist1 ( dUnique , RX10_TEMP28 ) ; 
const int nthPlace = RX10_TEMP32 ; 
/* async ( nthPlace )  */ 
{ /*UpdatableVariableDeclaration*/double localSumTemp = 0 ; 
const int thisPlace = /* here  */ 0 ; 
struct Dist2 * RX10_TEMP33 = sumArray ->distValue ; 
struct Dist2 * sumArrayDist = RX10_TEMP33 ; 
struct Dist2 * sumArrayDistHere = restrictDist2 ( sumArrayDist , thisPlace ) ; 
struct Region2 * RX10_TEMP35 = sumArrayDistHere ->dReg ; 
const int RX10_TEMP38 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP36 = RX10_TEMP35 ->regSize ; 
RX10_TEMP36 = RX10_TEMP36 - RX10_TEMP38 ; const int SX10_TEMP11 = 1 ; 
const int RX10_TEMP37 = RX10_TEMP36 + SX10_TEMP11 ; 
for ( int SX10_TEMP12 = 0 ; SX10_TEMP12 < RX10_TEMP37 ; SX10_TEMP12 ++ ) 
{ const int RX10_TEMP34 = SX10_TEMP12 ; 
const int RX10_TEMP39 = RX10_TEMP34 ; 
struct Point2 * pt = regionOrdinalPoint2 ( RX10_TEMP35 , RX10_TEMP39 ) ; 
struct Dist2 * RX10_TEMP40 = sumArray ->distValue ; 
struct Region2 * RX10_TEMP41 = RX10_TEMP40 ->dReg ; 
const int RX10_TEMP42 = searchPointInRegion2 ( RX10_TEMP41 , pt ) ; 
const int RX10_TEMP43 = 0 ; 
const int RX10_TEMP44 = RX10_TEMP42 < RX10_TEMP43 ; 
if ( RX10_TEMP44 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP45 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP45 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP46 = getPlaceFromDist2 ( RX10_TEMP40 , RX10_TEMP42 ) ; 
const int RX10_TEMP48 = /* here  */ 0 ; 
const int RX10_TEMP49 = RX10_TEMP46 != RX10_TEMP48 ; 
if ( RX10_TEMP49 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP47 = "Bad place access for array sumArray" ; 
fprintf(stderr, RX10_TEMP47 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP50 = getRefArrayValue2double ( sumArray , RX10_TEMP42 ) ; 
const double localSumCurr = RX10_TEMP50 ; 
localSumTemp = localSumTemp + localSumCurr ; } 

const int isNotEqual = localSumTemp != zero ; 
if ( isNotEqual ) 
{ const int index = /* thisPlace . id  */ 0 ; 
const double localSum = localSumTemp ; 
/* async ( source )  */ 
{ struct Point1 * RX10_TEMP51 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( RX10_TEMP51, index ) ; 
struct Dist1 * RX10_TEMP52 = localSumArray ->distValue ; 
struct Region1 * RX10_TEMP53 = RX10_TEMP52 ->dReg ; 
const int RX10_TEMP54 = searchPointInRegion1 ( RX10_TEMP53 , RX10_TEMP51 ) ; 
const int RX10_TEMP55 = 0 ; 
const int RX10_TEMP56 = RX10_TEMP54 < RX10_TEMP55 ; 
if ( RX10_TEMP56 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP57 = "Array index out of bounds" ; 
fprintf(stderr, RX10_TEMP57 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP58 = getPlaceFromDist1 ( RX10_TEMP52 , RX10_TEMP54 ) ; 
const int RX10_TEMP60 = /* here  */ 0 ; 
const int RX10_TEMP61 = RX10_TEMP58 != RX10_TEMP60 ; 
if ( RX10_TEMP61 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP59 = "Bad place access for array localSumArray" ; 
fprintf(stderr, RX10_TEMP59 ) ; 
exit(EXIT_FAILURE);
} 

setRefArrayValue1double ( localSumArray , RX10_TEMP54 , localSum ) ; 
} 

} 

} 

} 

} 

/*UpdatableVariableDeclaration*/double globalSum = 0 ; 
struct Dist1 * RX10_TEMP63 = localSumArray ->distValue ; 
struct Region1 * RX10_TEMP64 = RX10_TEMP63 ->dReg ; 
const int RX10_TEMP67 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP65 = RX10_TEMP64 ->regSize ; 
RX10_TEMP65 = RX10_TEMP65 - RX10_TEMP67 ; const int SX10_TEMP13 = 1 ; 
const int RX10_TEMP66 = RX10_TEMP65 + SX10_TEMP13 ; 
for ( int SX10_TEMP14 = 0 ; SX10_TEMP14 < RX10_TEMP66 ; SX10_TEMP14 ++ ) 
{ const int RX10_TEMP62 = SX10_TEMP14 ; 
const int RX10_TEMP68 = RX10_TEMP62 ; 
struct Point1 * p = regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP68 ) ; 
struct Dist1 * RX10_TEMP69 = localSumArray ->distValue ; 
struct Region1 * RX10_TEMP70 = RX10_TEMP69 ->dReg ; 
const int RX10_TEMP71 = searchPointInRegion1 ( RX10_TEMP70 , p ) ; 
const int RX10_TEMP72 = 0 ; 
const int RX10_TEMP73 = RX10_TEMP71 < RX10_TEMP72 ; 
if ( RX10_TEMP73 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP74 = "Array access index out of bounds" ; 
fprintf(stderr, RX10_TEMP74 ) ; 
exit(EXIT_FAILURE);
} 

const int RX10_TEMP75 = getPlaceFromDist1 ( RX10_TEMP69 , RX10_TEMP71 ) ; 
const int RX10_TEMP77 = /* here  */ 0 ; 
const int RX10_TEMP78 = RX10_TEMP75 != RX10_TEMP77 ; 
if ( RX10_TEMP78 ) 
{ /*UpdatableVariableDeclaration*/char * RX10_TEMP76 = "Bad place access for array localSumArray" ; 
fprintf(stderr, RX10_TEMP76 ) ; 
exit(EXIT_FAILURE);
} 

const double RX10_TEMP79 = getRefArrayValue1double ( localSumArray , RX10_TEMP71 ) ; 
const double localSumCurr = RX10_TEMP79 ; 
globalSum = globalSum + localSumCurr ; } 

return globalSum ; 
} 

int constantSearchRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int dim0 = r ->dim0 ; 
const int low0 = r ->low0 ; 
const int high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/int pt0 = target ->f0 ; 
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

void setRefArrayValue2double (  struct doubleRefArray2  * const array , const int index , const double val ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist2 * dArray = array ->distValue ; 
struct Dist * dDist = dArray ->dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist ->runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub ** const contents = array ->contents ; 
struct doubleStub * indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub ->localArray ; 
localArray [ localIndex ] = val ; 
} 

int constantSearchRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int dim0 = r ->dim0 ; 
const int low0 = r ->low0 ; 
const int high0 = low0 + dim0 ; 
/*UpdatableVariableDeclaration*/int pt0 = target ->f0 ; 
const int lbound0 = pt0 < low0 ; 
const int hbound0 = pt0 >= high0 ; 
const int dim1 = r ->dim1 ; 
const int low1 = r ->low1 ; 
const int high1 = low1 + dim1 ; 
/*UpdatableVariableDeclaration*/int pt1 = target ->f1 ; 
const int lbound1 = pt1 < low1 ; 
const int hbound1 = pt1 >= high1 ; 
const int dim2 = 1 ; 
/*UpdatableVariableDeclaration*/int outRegion = 0 ; 
outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; outRegion = outRegion || lbound1 ; outRegion = outRegion || hbound1 ; if ( outRegion ) 
{ /*UpdatableVariableDeclaration*/int notFound = 0 ; 
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

int binarySearchRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) 
{ /*Updatable ARRAY*/ struct Point2 ** const pointArray = r ->pointArray ; 
/*UpdatableVariableDeclaration*/int start = 0 ; 
/*UpdatableVariableDeclaration*/int end = r ->regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/int result = zero - one ; 
/*UpdatableVariableDeclaration*/int notDone = start <= end ; 

while ( notDone ) 
{ /*UpdatableVariableDeclaration*/int mid = start + end ; 
mid = mid / two ; struct Point2 * temp = pointArray [ mid ] 
; 
const int pointCompare = comparePoint2 ( target , temp ) ; 
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

int binarySearchRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) 
{ /*Updatable ARRAY*/ struct Point1 ** const pointArray = r ->pointArray ; 
/*UpdatableVariableDeclaration*/int start = 0 ; 
/*UpdatableVariableDeclaration*/int end = r ->regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
end = end - one ; /*UpdatableVariableDeclaration*/int result = zero - one ; 
/*UpdatableVariableDeclaration*/int notDone = start <= end ; 

while ( notDone ) 
{ /*UpdatableVariableDeclaration*/int mid = start + end ; 
mid = mid / two ; struct Point1 * temp = pointArray [ mid ] 
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

void setRefArrayValue1double (  struct doubleRefArray1  * const array , const int index , const double val ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 * dArray = array ->distValue ; 
struct Dist * dDist = dArray ->dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist ->runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub ** const contents = array ->contents ; 
struct doubleStub * indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub ->localArray ; 
localArray [ localIndex ] = val ; 
} 

Dist1  * getUniqueDist ( ) 
{ const int one = 1 ; 
const int zero = 0 ; 
const int maxPlaces = /* place.MAX_PLACES  */ 1 ; 
const int rSize = maxPlaces - one ; 
const int SX10_TEMP0 = 1 ; 
const int placeRegion = rSize + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(placeRegion,sizeof( int *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < placeRegion ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
const int i = p ; 
const int pl1 = /* place.places ( i )  */ 0 
; 
SX10_TEMP1 [ p ] = pl1 ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int pointRegion = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP4 = (Point1 **)calloc(pointRegion,sizeof( Point1 *)); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < pointRegion ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
struct Point1 * pt1 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt1, zero ) ; 
SX10_TEMP4 [ p ] = pt1 ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const pointArray = SX10_TEMP4 ; 
struct Region1 * reg = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_4( reg, pointArray , maxPlaces , zero , maxPlaces ) ; 
struct Dist * pointDist1 = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist1, vPlaceArray , maxPlaces ) ; 
struct Dist1 * retDist = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( retDist, reg , pointDist1 ) ; 
return retDist ; 
} 

int getPlaceFromDist1 (  struct Dist1  * const dn , const int index ) 
{ struct Dist * d = dn ->dDist ; 
/*Updatable ARRAY*/ int * const placeArray = d ->placeArray ; 
const int retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

int getPlaceFromDist2 (  struct Dist2  * const dn , const int index ) 
{ struct Dist * d = dn ->dDist ; 
/*Updatable ARRAY*/ int * const placeArray = d ->placeArray ; 
const int retPlace = placeArray [ index ] 
; 
return retPlace ; 
} 

int comparePoint1 (  struct Point1  * const pt1 ,  struct Point1  * const pt2 ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
/*UpdatableVariableDeclaration*/int point1 = 0 ; 
/*UpdatableVariableDeclaration*/int point2 = 0 ; 
/*UpdatableVariableDeclaration*/int lt = 0 ; 
/*UpdatableVariableDeclaration*/int gt = 0 ; 
point1 = pt1 ->f0 ; point2 = pt2 ->f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ return one ; 
} 

if ( gt ) 
{ return two ; 
} 

return zero ; 
} 

int comparePoint2 (  struct Point2  * const pt1 ,  struct Point2  * const pt2 ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
/*UpdatableVariableDeclaration*/int point1 = 0 ; 
/*UpdatableVariableDeclaration*/int point2 = 0 ; 
/*UpdatableVariableDeclaration*/int lt = 0 ; 
/*UpdatableVariableDeclaration*/int gt = 0 ; 
point1 = pt1 ->f0 ; point2 = pt2 ->f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ return one ; 
} 

if ( gt ) 
{ return two ; 
} 

point1 = pt1 ->f1 ; point2 = pt2 ->f1 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) 
{ return one ; 
} 

if ( gt ) 
{ return two ; 
} 

return zero ; 
} 

Region1  * getRank2 (  struct Region2  * const r , const int dim ) 
{ const int zero = 0 ; 
const int regRank = 2 ; 
const int cond1 = dim >= regRank ; 
const int cond2 = dim < zero ; 
const int invalidRank = cond1 || cond2 ; 
if ( invalidRank ) 
{ const char * errorMsgHeader = "Invalid dimension for rank projection. Got " ; 
const char * errorMsgTrailer = ", expected value between 0 and 2" ; 
/*UpdatableVariableDeclaration*//*ASSIGNMENT STRING*/
 char * tempC6 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC6, "%s%d",errorMsgHeader,dim);
char * errorMsg = tempC6;
/*ASSIGNMENT STRING*/
 char * tempC7 = (char *)malloc(10000 * sizeof(char));
sprintf(tempC7, "%s%s",errorMsg,errorMsgTrailer);
errorMsg = tempC7;fprintf(stderr, errorMsg ) ; 
exit(EXIT_FAILURE);
} 

const int regType = r ->regType ; 
if ( regType ) 
{ struct Region1 * regularRank = getRankRegular2 ( r , dim ) ; 
return regularRank ; 
} 

struct Region1 * arbitraryRank = getRankArbitrary2 ( r , dim ) ; 
return arbitraryRank ; 
} 

Region1  * getRankArbitrary2 (  struct Region2  * const r , const int dim ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int two = 2 ; 
const int minusOne = zero - one ; 
const int proj0 = 0 ; 
const int proj1 = 1 ; 
/*UpdatableVariableDeclaration*//*Updatable ARRAY*/ struct Point2 ** regArr = r ->pointArray ; 
const int regSize = r ->regSize ; 
const int regSizeMinusOne = regSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArrRegion = regSizeMinusOne + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int distArrRegion = regSizeMinusOne + SX10_TEMP1 ; 
/*UpdatableVariableDeclaration*/int maxIndex = minusOne ; 
/*UpdatableVariableDeclaration*/int minIndex = zero ; 
/*UpdatableVariableDeclaration*/int isFirstMinIndex = 1 ; 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArrRegion ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
const int idx = p ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs0;
else if(proj1== dim)
goto cs1;


cs0:
{ struct Point2 * tempPt = regArr [ idx ] 
; 
const int crd = tempPt ->f0 ; 
const int isMax = crd >= maxIndex ; 
if ( isMax ) 
{ maxIndex = crd ; } 

const int lt = crd <= minIndex ; 
const int isMin = lt || isFirstMinIndex ; 
if ( isMin ) 
{ isFirstMinIndex = 0 ; minIndex = crd ; } 

break ; 
goto cs1;
} 


cs1:
{ struct Point2 * tempPt = regArr [ idx ] 
; 
const int crd = tempPt ->f1 ; 
const int isMax = crd >= maxIndex ; 
if ( isMax ) 
{ maxIndex = crd ; } 

const int lt = crd <= minIndex ; 
const int isMin = lt || isFirstMinIndex ; 
if ( isMin ) 
{ isFirstMinIndex = 0 ; minIndex = crd ; } 

break ; 
} 

break;} /*END OF SWITCH*/
} 

const int regIndexSizeMinusOne = maxIndex - minIndex ; 
const int regIndexSize = regIndexSizeMinusOne + one ; 
const int SX10_TEMP3 = 1 ; 
const int regIndexRegion = regIndexSizeMinusOne + SX10_TEMP3 ; 
const int SX10_TEMP4 = 1 ; 
const int regIndexDist = regIndexSizeMinusOne + SX10_TEMP4 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP5 = (int *)calloc(regIndexDist,sizeof( int *)); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < regIndexDist ; SX10_TEMP6 ++ ) 
{ const int p = SX10_TEMP6 ; 
SX10_TEMP5 [ p ] = zero ; 
} 

/*Updatable ARRAY*/ int * const indexArr = SX10_TEMP5 ; 
for ( int SX10_TEMP7 = 0 ; SX10_TEMP7 < regArrRegion ; SX10_TEMP7 ++ ) 
{ const int p = SX10_TEMP7 ; 
const int idx = p ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs2;
else if(proj1== dim)
goto cs3;


cs2:
{ struct Point2 * tempPt = regArr [ idx ] 
; 
const int crd = tempPt ->f0 ; 
const int newRegIndex = crd - minIndex ; 
indexArr [ newRegIndex ] = one ; 
break ; 
goto cs3;
} 


cs3:
{ struct Point2 * tempPt = regArr [ idx ] 
; 
const int crd = tempPt ->f1 ; 
const int newRegIndex = crd - minIndex ; 
indexArr [ newRegIndex ] = one ; 
break ; 
} 

break;} /*END OF SWITCH*/
} 

/*UpdatableVariableDeclaration*/int newRegSize = 0 ; 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regIndexRegion ; SX10_TEMP8 ++ ) 
{ const int p = SX10_TEMP8 ; 
const int hit = indexArr [ p ] 
; 
newRegSize = newRegSize + hit ; } 

const int isRegular = newRegSize == regIndexSize ; 
if ( isRegular ) 
{ const int SX10_TEMP9 = 1 ; 
const int regRegularRegion = minusOne + SX10_TEMP9 ; 
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP10 = (Point1 **)calloc(regRegularRegion,sizeof( Point1 *)); 
for ( int SX10_TEMP11 = 0 ; SX10_TEMP11 < regRegularRegion ; SX10_TEMP11 ++ ) 
{ const int p = SX10_TEMP11 ; 
struct Point1 * pt = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt, zero ) ; 
SX10_TEMP10 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const ptArray = SX10_TEMP10 ; 
struct Region1 * retRegRegular = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_4( retRegRegular, ptArray , regIndexSize , minIndex , regIndexSize ) ; 
return retRegRegular ; 
} 

const int newRegSizeMinusOne = newRegSize - one ; 
const int SX10_TEMP12 = 1 ; 
const int newRegRegion = newRegSizeMinusOne + SX10_TEMP12 ; 
const int SX10_TEMP13 = 1 ; 
const int newRegDist = newRegSizeMinusOne + SX10_TEMP13 ; 
/*Updatable ARRAY*/ struct Point1 ** const indexPointArr = (Point1 **)calloc(newRegDist,sizeof( Point1 *)); 
/*UpdatableVariableDeclaration*/int newArrIndex = 0 ; 
for ( int SX10_TEMP15 = 0 ; SX10_TEMP15 < regIndexRegion ; SX10_TEMP15 ++ ) 
{ const int p = SX10_TEMP15 ; 
const int indx = indexArr [ p ] 
; 
const int isOne = indx == one ; 
if ( isOne ) 
{ const int idx = p ; 
const int pointValue = idx + minIndex ; 
struct Point1 * tempPoint = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( tempPoint, pointValue ) ; 
indexPointArr [ newArrIndex ] = tempPoint ; 
newArrIndex = newArrIndex + one ; } 

} 

/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP16 = (Point1 **)calloc(newRegRegion,sizeof( Point1 *)); 
for ( int SX10_TEMP17 = 0 ; SX10_TEMP17 < newRegRegion ; SX10_TEMP17 ++ ) 
{ const int p = SX10_TEMP17 ; 
struct Point1 * pt = indexPointArr [ p ] 
; 
SX10_TEMP16 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const indexPointValueArr = SX10_TEMP16 ; 
struct Region1 * retRegArbitrary = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_2( retRegArbitrary, indexPointValueArr , regIndexSize ) ; 
return retRegArbitrary ; 
} 

Region1  * getRankRegular2 (  struct Region2  * const r , const int dim ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int pointRegion = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP1 = (Point1 **)calloc(pointRegion,sizeof( Point1 *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < pointRegion ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
struct Point1 * pt1 = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt1, zero ) ; 
SX10_TEMP1 [ p ] = pt1 ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const pointArray = SX10_TEMP1 ; 
const int proj0 = 0 ; 
const int proj1 = 1 ; 
/*UpdatableVariableDeclaration*/int low0 = 0 ; 
/*UpdatableVariableDeclaration*/int dim0 = 0 ; 
/*SWITCH CASE*/while(1)
{ 
 if(proj0== dim)
goto cs4;
else if(proj1== dim)
goto cs5;


cs4:
{ low0 = r ->low0 ; dim0 = r ->dim0 ; break ; 
goto cs5;
} 


cs5:
{ low0 = r ->low1 ; dim0 = r ->dim1 ; break ; 
} 

break;} /*END OF SWITCH*/
struct Region1 * retRegRegular = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_4( retRegRegular, pointArray , dim0 , low0 , dim0 ) ; 
return retRegRegular ; 
} 

Point2  * regionOrdinalPoint2 (  struct Region2  * const reg , const int ordl ) 
{ const int regType = reg ->regType ; 
if ( regType ) 
{ struct Point2 * pt = regionOrdinalPointRegular2 ( reg , ordl ) ; 
return pt ; 
} 

struct Point2 * pt = regionOrdinalPointArbitrary2 ( reg , ordl ) ; 
return pt ; 
} 

Point2  * regionOrdinalPointRegular2 (  struct Region2  * const reg , const int ordl ) 
{ const int stride2 = 1 ; 
const int dim2 = reg ->dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = reg ->low1 ; 
const int dim1 = reg ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg ->low0 ; 
/*UpdatableVariableDeclaration*/int f2 = ordl / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 * pt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( pt, f1 , f2 ) ; 
return pt ; 
} 

Point2  * regionOrdinalPointArbitrary2 (  struct Region2  * const reg , const int ordl ) 
{ /*Updatable ARRAY*/ struct Point2 ** const pointArray = reg ->pointArray ; 
struct Point2 * pt = pointArray [ ordl ] 
; 
return pt ; 
} 

Point1  * regionOrdinalPoint1 (  struct Region1  * const reg , const int ordl ) 
{ const int regType = reg ->regType ; 
if ( regType ) 
{ struct Point1 * pt = regionOrdinalPointRegular1 ( reg , ordl ) ; 
return pt ; 
} 

struct Point1 * pt = regionOrdinalPointArbitrary1 ( reg , ordl ) ; 
return pt ; 
} 

Point1  * regionOrdinalPointRegular1 (  struct Region1  * const reg , const int ordl ) 
{ const int stride1 = 1 ; 
const int dim1 = reg ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg ->low0 ; 
/*UpdatableVariableDeclaration*/int f1 = ordl / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 * pt = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt, f1 ) ; 
return pt ; 
} 

Point1  * regionOrdinalPointArbitrary1 (  struct Region1  * const reg , const int ordl ) 
{ /*Updatable ARRAY*/ struct Point1 ** const pointArray = reg ->pointArray ; 
struct Point1 * pt = pointArray [ ordl ] 
; 
return pt ; 
} 

double getRefArrayValue1double (  struct doubleRefArray1  * const array , const int index ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist1 * dArray = array ->distValue ; 
struct Dist * dDist = dArray ->dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist ->runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub ** const contents = array ->contents ; 
struct doubleStub * indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub ->localArray ; 
const double returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist1  * restrictDist1 (  struct Dist1  * const dn , const int p ) 
{ struct Region1 * r = dn ->dReg ; 
const int regType = r ->regType ; 
if ( regType ) 
{ struct Dist1 * regDist = restrictDistRegular1 ( dn , p ) ; 
return regDist ; 
} 

struct Dist1 * arbDist = restrictDistArbitrary1 ( dn , p ) ; 
return arbDist ; 
} 

Dist1  * restrictDistRegular1 (  struct Dist1  * const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region1 * dReg = d ->dReg ; 
struct Dist * dDist = d ->dDist ; 
const int dim = dReg ->regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
const int stride1 = 1 ; 
const int dim1 = dReg ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = dReg ->low0 ; 
/*Updatable ARRAY*/ int * const dPlace = dDist ->placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist ->counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int *)); 
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

/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP7 = (Point1 **)calloc(tempReg,sizeof( Point1 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/int f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point1 * dpt = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( dpt, f1 ) ; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const pointArray = SX10_TEMP7 ; 
struct Region1 * dpReg = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_2( dpReg, pointArray , rSizeNumPoints ) ; 
struct Dist * dpDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( dpDist, rPlace , rSizeNumPoints ) ; 
struct Dist1 * dpDistn = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( dpDistn, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist1  * restrictDistArbitrary1 (  struct Dist1  * const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region1 * dReg = d ->dReg ; 
struct Dist * dDist = d ->dDist ; 
const int dim = dReg ->regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point1 ** const dArray = dReg ->pointArray ; 
/*Updatable ARRAY*/ int * const dPlace = dDist ->placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist ->counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int *)); 
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

/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP7 = (Point1 **)calloc(tempReg,sizeof( Point1 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
struct Point1 * dpt = dArray [ idx ] 
; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const pointArray = SX10_TEMP7 ; 
struct Region1 * dpReg = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_2( dpReg, pointArray , rSizeNumPoints ) ; 
struct Dist * dpDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( dpDist, rPlace , rSizeNumPoints ) ; 
struct Dist1 * dpDistn = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( dpDistn, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist1  * getBlockDist1 (  struct Region1  * const r ) 
{ const int rSize = r ->regSize ; 
const int zero = 0 ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int dDist = rSizeMinusOne + SX10_TEMP1 ; 
/*Updatable ARRAY*/ int * const placeArray = (int *)calloc(dDist,sizeof( int *)); 
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
{ /*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(dReg,sizeof( int *)); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < dReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP3 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP3 ; 
struct Dist * pointDist1 = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist1, vPlaceArray , rSize ) ; 
struct Dist1 * retDist = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( retDist, r , pointDist1 ) ; 
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

/*Updatable ARRAY*/ int * const SX10_TEMP11 = (int *)calloc(dReg,sizeof( int *)); 
for ( int SX10_TEMP12 = 0 ; SX10_TEMP12 < dReg ; SX10_TEMP12 ++ ) 
{ const int pt = SX10_TEMP12 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP11 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP11 ; 
struct Dist * pointDist1 = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist1, vPlaceArray , rSize ) ; 
struct Dist1 * retDist = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( retDist, r , pointDist1 ) ; 
return retDist ; 
} 

Dist2  * unionDist2 (  struct Dist2  * const d1 ,  struct Dist2  * const d2 ) 
{ /*UpdatableVariableDeclaration*/int index1 = 0 ; 
/*UpdatableVariableDeclaration*/int index2 = 0 ; 
/*UpdatableVariableDeclaration*/int index = 0 ; 
const int zero = 0 ; 
const int one = 1 ; 
struct Region2 * reg1 = d1 ->dReg ; 
struct Region2 * reg2 = d2 ->dReg ; 
const int regType1 = reg1 ->regType ; 
const int regType2 = reg2 ->regType ; 
/*UpdatableVariableDeclaration*//*Updatable ARRAY*/ struct Point2 ** tempArr1 = reg1 ->pointArray ; 
/*UpdatableVariableDeclaration*//*Updatable ARRAY*/ struct Point2 ** tempArr2 = reg2 ->pointArray ; 
if ( regType1 ) 
{ const int stride2 = 1 ; 
const int dim2 = reg1 ->dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = reg1 ->low1 ; 
const int dim1 = reg1 ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg1 ->low0 ; 
const int regSize1 = reg1 ->regSize ; 
const int sizeMinusOne = regSize1 - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = sizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP1 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ const int pt = SX10_TEMP2 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 * retPoint = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( retPoint, f1 , f2 ) ; 
SX10_TEMP1 [ pt ] = retPoint ; 
} 

tempArr1 = SX10_TEMP1 ; } 

if ( regType2 ) 
{ const int stride2 = 1 ; 
const int dim2 = reg2 ->dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = reg2 ->low1 ; 
const int dim1 = reg2 ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = reg2 ->low0 ; 
const int regSize2 = reg2 ->regSize ; 
const int sizeMinusOne = regSize2 - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = sizeMinusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP4 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ const int pt = SX10_TEMP5 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 * retPoint = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( retPoint, f1 , f2 ) ; 
SX10_TEMP4 [ pt ] = retPoint ; 
} 

tempArr2 = SX10_TEMP4 ; } 

/*Updatable ARRAY*/ struct Point2 ** const arr1 = tempArr1 ; 
/*Updatable ARRAY*/ struct Point2 ** const arr2 = tempArr2 ; 
struct Dist * dDist1 = d1 ->dDist ; 
/*Updatable ARRAY*/ int * const dPlaceArray1 = dDist1 ->placeArray ; 
struct Dist * dDist2 = d2 ->dDist ; 
/*Updatable ARRAY*/ int * const dPlaceArray2 = dDist2 ->placeArray ; 
const int size1 = reg1 ->regSize ; 
const int size2 = reg2 ->regSize ; 
const int rSize = size1 + size2 ; 
const int sizeMinusOne = rSize - one ; 
const int SX10_TEMP6 = 1 ; 
const int tempReg = sizeMinusOne + SX10_TEMP6 ; 
const int SX10_TEMP7 = 1 ; 
const int tempDist = sizeMinusOne + SX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Point2 ** const tempArr = (Point2 **)calloc(tempDist,sizeof( Point2 *)); 
/*Updatable ARRAY*/ int * const placeArray = (int *)calloc(tempDist,sizeof( int *)); 
/*UpdatableVariableDeclaration*/int cond1 = index1 < size1 ; 
/*UpdatableVariableDeclaration*/int cond2 = index2 < size2 ; 
/*UpdatableVariableDeclaration*/int cond = cond1 && cond2 ; 

while ( cond ) 
{ struct Point2 * p1 = arr1 [ index1 ] 
; 
struct Point2 * p2 = arr2 [ index2 ] 
; 
const int pointCompare = comparePoint2 ( p1 , p2 ) ; 
const int eq = pointCompare == zero ; 
const int lt = pointCompare == one ; 
if ( eq ) 
{ const char * errMsg = "Non-disjoint region in a disjoint union" ; 
fprintf(stderr, errMsg ) ; 
exit(EXIT_FAILURE);
} 

if ( lt ) 
{ tempArr [ index ] = p1 ; 
const int pPlace = dPlaceArray1 [ index1 ] 
; 
placeArray [ index ] = pPlace ; 
index1 = index1 + one ; } 
else 
{ tempArr [ index ] = p2 ; 
const int pPlace = dPlaceArray2 [ index2 ] 
; 
placeArray [ index ] = pPlace ; 
index2 = index2 + one ; } 


index = index + one ; cond1 = index1 < size1 ; cond2 = index2 < size2 ; cond = cond1 && cond2 ; } 

cond1 = index1 < size1 ; 
while ( cond1 ) 
{ struct Point2 * tempArrPt = arr1 [ index1 ] 
; 
tempArr [ index ] = tempArrPt ; 
const int pPlace = dPlaceArray1 [ index1 ] 
; 
placeArray [ index ] = pPlace ; 
index1 = index1 + one ; index = index + one ; cond1 = index1 < size1 ; } 

cond2 = index2 < size2 ; 
while ( cond2 ) 
{ struct Point2 * tempArrPt = arr2 [ index2 ] 
; 
tempArr [ index ] = tempArrPt ; 
const int pPlace = dPlaceArray2 [ index2 ] 
; 
placeArray [ index ] = pPlace ; 
index2 = index2 + one ; index = index + one ; cond2 = index2 < size2 ; } 

/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP10 = (Point2 **)calloc(tempReg,sizeof( Point2 *)); 
for ( int SX10_TEMP11 = 0 ; SX10_TEMP11 < tempReg ; SX10_TEMP11 ++ ) 
{ const int pt = SX10_TEMP11 ; 
struct Point2 * retPoint = tempArr [ pt ] 
; 
SX10_TEMP10 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const arr = SX10_TEMP10 ; 
struct Region2 * unionReg = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_2( unionReg, arr , rSize ) ; 
/*Updatable ARRAY*/ int * const SX10_TEMP12 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP13 = 0 ; SX10_TEMP13 < tempReg ; SX10_TEMP13 ++ ) 
{ const int pt = SX10_TEMP13 ; 
const int tempPl = placeArray [ pt ] 
; 
SX10_TEMP12 [ pt ] = tempPl ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP12 ; 
struct Dist * pointDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist, vPlaceArray , rSize ) ; 
struct Dist2 * unionDist = (struct Dist2  *) malloc(sizeof(struct Dist2 ));  
Dist2_Dist2( unionDist, unionReg , pointDist ) ; 
return unionDist ; 
} 

void getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) 
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

int getDistLocalCount2 (  struct Dist2  * const dn , const int placeIndex ) 
{ struct Dist * d = dn ->dDist ; 
/*Updatable ARRAY*/ int * const counts = d ->counts ; 
const int localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int getDistLocalCount1 (  struct Dist1  * const dn , const int placeIndex ) 
{ struct Dist * d = dn ->dDist ; 
/*Updatable ARRAY*/ int * const counts = d ->counts ; 
const int localCount = counts [ placeIndex ] 
; 
return localCount ; 
} 

int searchPointInRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) 
{ const int regType = r ->regType ; 
if ( regType ) 
{ const int constantSearch = constantSearchRegion2 ( r , target ) ; 
return constantSearch ; 
} 

const int binarySearch = binarySearchRegion2 ( r , target ) ; 
return binarySearch ; 
} 

int searchPointInRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) 
{ const int regType = r ->regType ; 
if ( regType ) 
{ const int constantSearch = constantSearchRegion1 ( r , target ) ; 
return constantSearch ; 
} 

const int binarySearch = binarySearchRegion1 ( r , target ) ; 
return binarySearch ; 
} 

double getRefArrayValue2double (  struct doubleRefArray2  * const array , const int index ) 
{ const int pl = /* here  */ 0 ; 
const int placeIndex = /* pl . id  */ 0 ; 
struct Dist2 * dArray = array ->distValue ; 
struct Dist * dDist = dArray ->dDist ; 
/*Updatable ARRAY*/ int * const runSum = dDist ->runningSum ; 
const int localIndex = runSum [ index ] 
; 
/*Updatable ARRAY*/ struct doubleStub ** const contents = array ->contents ; 
struct doubleStub * indexStub = contents [ placeIndex ] 
; 
/*Updatable ARRAY*/ double * const localArray = indexStub ->localArray ; 
const double returnValue = localArray [ localIndex ] 
; 
return returnValue ; 
} 

Dist2  * getPlaceDist2 (  struct Region2  * const r , const int p ) 
{ const int rSize = r ->regSize ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(dReg,sizeof( int *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < dReg ; SX10_TEMP2 ++ ) 
{ const int pt = SX10_TEMP2 ; 
SX10_TEMP1 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
struct Dist * pointDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist, vPlaceArray , rSize ) ; 
struct Dist2 * retDist = (struct Dist2  *) malloc(sizeof(struct Dist2 ));  
Dist2_Dist2( retDist, r , pointDist ) ; 
return retDist ; 
} 

Dist1  * getPlaceDist1 (  struct Region1  * const r , const int p ) 
{ const int rSize = r ->regSize ; 
const int one = 1 ; 
const int rSizeMinusOne = rSize - one ; 
const int SX10_TEMP0 = 1 ; 
const int dReg = rSizeMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP1 = (int *)calloc(dReg,sizeof( int *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < dReg ; SX10_TEMP2 ++ ) 
{ const int pt = SX10_TEMP2 ; 
SX10_TEMP1 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const vPlaceArray = SX10_TEMP1 ; 
struct Dist * pointDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( pointDist, vPlaceArray , rSize ) ; 
struct Dist1 * retDist = (struct Dist1  *) malloc(sizeof(struct Dist1 ));  
Dist1_Dist1( retDist, r , pointDist ) ; 
return retDist ; 
} 

Dist2  * restrictDist2 (  struct Dist2  * const dn , const int p ) 
{ struct Region2 * r = dn ->dReg ; 
const int regType = r ->regType ; 
if ( regType ) 
{ struct Dist2 * regDist = restrictDistRegular2 ( dn , p ) ; 
return regDist ; 
} 

struct Dist2 * arbDist = restrictDistArbitrary2 ( dn , p ) ; 
return arbDist ; 
} 

Dist2  * restrictDistRegular2 (  struct Dist2  * const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region2 * dReg = d ->dReg ; 
struct Dist * dDist = d ->dDist ; 
const int dim = dReg ->regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
const int stride2 = 1 ; 
const int dim2 = dReg ->dim1 ; 
const int stride1 = stride2 * dim2 ; 
const int regLow2 = dReg ->low1 ; 
const int dim1 = dReg ->dim0 ; 
const int stride0 = stride1 * dim1 ; 
const int regLow1 = dReg ->low0 ; 
/*Updatable ARRAY*/ int * const dPlace = dDist ->placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist ->counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int *)); 
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

/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP7 = (Point2 **)calloc(tempReg,sizeof( Point2 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
/*UpdatableVariableDeclaration*/int f2 = idx / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + regLow2 ; /*UpdatableVariableDeclaration*/int f1 = idx / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + regLow1 ; struct Point2 * dpt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( dpt, f1 , f2 ) ; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const pointArray = SX10_TEMP7 ; 
struct Region2 * dpReg = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_2( dpReg, pointArray , rSizeNumPoints ) ; 
struct Dist * dpDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( dpDist, rPlace , rSizeNumPoints ) ; 
struct Dist2 * dpDistn = (struct Dist2  *) malloc(sizeof(struct Dist2 ));  
Dist2_Dist2( dpDistn, dpReg , dpDist ) ; 
return dpDistn ; 
} 

Dist2  * restrictDistArbitrary2 (  struct Dist2  * const d , const int p ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int h = /* here  */ 0 ; 
struct Region2 * dReg = d ->dReg ; 
struct Dist * dDist = d ->dDist ; 
const int dim = dReg ->regSize ; 
const int dimMinusOne = dim - one ; 
const int SX10_TEMP0 = 1 ; 
const int dRegReg = dimMinusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 ** const dArray = dReg ->pointArray ; 
/*Updatable ARRAY*/ int * const dPlace = dDist ->placeArray ; 
/*Updatable ARRAY*/ int * const dCounts = dDist ->counts ; 
const int index = /* p . id  */ 0 ; 
/*UpdatableVariableDeclaration*/int numPoints = dCounts [ index ] 
; 
const int rSizeNumPoints = numPoints ; 
const int rSize = numPoints - one ; 
const int SX10_TEMP1 = 1 ; 
const int tempReg = rSize + SX10_TEMP1 ; 
const int SX10_TEMP2 = 1 ; 
const int tempDist = rSize + SX10_TEMP2 ; 
/*Updatable ARRAY*/ int * const SX10_TEMP3 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP4 = 0 ; SX10_TEMP4 < tempReg ; SX10_TEMP4 ++ ) 
{ const int pt = SX10_TEMP4 ; 
SX10_TEMP3 [ pt ] = p ; 
} 

/*Updatable ARRAY*/ int * const rPlace = SX10_TEMP3 ; 
/*Updatable ARRAY*/ int * const tempArray = (int *)calloc(tempDist,sizeof( int *)); 
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

/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP7 = (Point2 **)calloc(tempReg,sizeof( Point2 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < tempReg ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int idx = tempArray [ pt ] 
; 
struct Point2 * dpt = dArray [ idx ] 
; 
SX10_TEMP7 [ pt ] = dpt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const pointArray = SX10_TEMP7 ; 
struct Region2 * dpReg = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_2( dpReg, pointArray , rSizeNumPoints ) ; 
struct Dist * dpDist = (struct Dist  *) malloc(sizeof(struct Dist ));  
Dist_Dist( dpDist, rPlace , rSizeNumPoints ) ; 
struct Dist2 * dpDistn = (struct Dist2  *) malloc(sizeof(struct Dist2 ));  
Dist2_Dist2( dpDistn, dpReg , dpDist ) ; 
return dpDistn ; 
} 

/*Updatable ARRAY*/ int * initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) 
{ /*Updatable ARRAY*/ int * const SX10_TEMP0 = (int *)calloc(tempReg,sizeof( int *)); 
for ( int SX10_TEMP1 = 0 ; SX10_TEMP1 < tempReg ; SX10_TEMP1 ++ ) 
{ const int p = SX10_TEMP1 ; 
const int tempInt = tempArr [ p ] 
; 
SX10_TEMP0 [ p ] = tempInt ; 
} 

/*Updatable ARRAY*/ int * const vTemp = SX10_TEMP0 ; 
return vTemp ; 
} 

Region1  * createNewRegion1R ( const int v1_0 , const int v1_1 ) 
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
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP1 = (Point1 **)calloc(regArr,sizeof( Point1 *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
struct Point1 * pt = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt, zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const ptArray = SX10_TEMP1 ; 
struct Region1 * retRegEmpty = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_4( retRegEmpty, ptArray , stride0 , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP4 = (Point1 **)calloc(regArr,sizeof( Point1 *)); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
struct Point1 * pt = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( pt, zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const ptArray = SX10_TEMP4 ; 
struct Region1 * retRegRegular = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_4( retRegRegular, ptArray , stride0 , v1_0 , dim1 ) ; 
return retRegRegular ; 
} 
else 
{ const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point1 ** const SX10_TEMP7 = (Point1 **)calloc(regArr,sizeof( Point1 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; struct Point1 * retPoint = (struct Point1  *) malloc(sizeof(struct Point1 ));  
Point1_Point1( retPoint, f1 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point1 ** const ptArray = SX10_TEMP7 ; 
struct Region1 * retReg = (struct Region1  *) malloc(sizeof(struct Region1 ));  
Region1_Region1_2( retReg, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

Region2  * createNewRegion2RR ( const int v1_0 , const int v1_1 , const int v2_0 , const int v2_1 ) 
{ const int zero = 0 ; 
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
{ const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP1 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
struct Point2 * pt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( pt, zero , zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP1 ; 
struct Region2 * retRegEmpty = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_6( retRegEmpty, ptArray , stride0 , zero , zero , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ const int minusOne = zero - one ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP4 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
struct Point2 * pt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( pt, zero , zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP4 ; 
struct Region2 * retRegRegular = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_6( retRegRegular, ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 ) ; 
return retRegRegular ; 
} 
else 
{ const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP7 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; f1 = f1 + v1_0 ; /*UpdatableVariableDeclaration*/int f2 = p / stride2 ; 
f2 = f2 % dim2 ; f2 = f2 + v2_0 ; struct Point2 * retPoint = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( retPoint, f1 , f2 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP7 ; 
struct Region2 * retReg = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_2( retReg, ptArray , stride0 ) ; 
return retReg ; 
} 


} 

Region2  * createNewRegion2AA (  struct Region1  * const v1_0 ,  struct Region1  * const v2_0 ) 
{ const int zero = 0 ; 
const int one = 1 ; 
/*UpdatableVariableDeclaration*/int regType = 1 ; 
const int tempBool1 = v1_0 ->regType ; 
const int tempBool2 = v2_0 ->regType ; 
regType = regType && tempBool1 ; regType = regType && tempBool2 ; const int l1 = v1_0 ->regSize ; 
const int dim1 = l1 ; 
const int l2 = v2_0 ->regSize ; 
const int dim2 = l2 ; 
const int stride2 = 1 ; 
const int stride1 = stride2 * dim2 ; 
const int stride0 = stride1 * dim1 ; 
const int rSize = stride0 - one ; 
const int cond = stride0 <= zero ; 
if ( cond ) 
{ const int minusOne = zero - one ; 
const int SX10_TEMP0 = 1 ; 
const int regArr = minusOne + SX10_TEMP0 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP1 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP2 = 0 ; SX10_TEMP2 < regArr ; SX10_TEMP2 ++ ) 
{ const int p = SX10_TEMP2 ; 
struct Point2 * pt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( pt, zero , zero ) ; 
SX10_TEMP1 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP1 ; 
struct Region2 * retRegEmpty = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_6( retRegEmpty, ptArray , stride0 , zero , zero , zero , zero ) ; 
return retRegEmpty ; 
} 

if ( regType ) 
{ const int minusOne = zero - one ; 
const int low1 = v1_0 ->low0 ; 
const int low2 = v2_0 ->low0 ; 
const int SX10_TEMP3 = 1 ; 
const int regArr = minusOne + SX10_TEMP3 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP4 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP5 = 0 ; SX10_TEMP5 < regArr ; SX10_TEMP5 ++ ) 
{ const int p = SX10_TEMP5 ; 
struct Point2 * pt = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( pt, zero , zero ) ; 
SX10_TEMP4 [ p ] = pt ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP4 ; 
struct Region2 * retRegRegular = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_6( retRegRegular, ptArray , stride0 , low1 , dim1 , low2 , dim2 ) ; 
return retRegRegular ; 
} 
else 
{ const int SX10_TEMP6 = 1 ; 
const int regArr = rSize + SX10_TEMP6 ; 
/*Updatable ARRAY*/ struct Point2 ** const SX10_TEMP7 = (Point2 **)calloc(regArr,sizeof( Point2 *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < regArr ; SX10_TEMP8 ++ ) 
{ const int pt = SX10_TEMP8 ; 
const int p = pt ; 
/*UpdatableVariableDeclaration*/int f1 = p / stride1 ; 
f1 = f1 % dim1 ; if ( tempBool1 ) 
{ const int low1 = v1_0 ->low0 ; 
f1 = f1 + low1 ; } 
else 
{ /*Updatable ARRAY*/ struct Point1 ** const rArray1 = v1_0 ->pointArray ; 
struct Point1 * rArrayPt1 = rArray1 [ f1 ] 
; 
f1 = rArrayPt1 ->f0 ; } 


/*UpdatableVariableDeclaration*/int f2 = p / stride2 ; 
f2 = f2 % dim2 ; if ( tempBool2 ) 
{ const int low2 = v2_0 ->low0 ; 
f2 = f2 + low2 ; } 
else 
{ /*Updatable ARRAY*/ struct Point1 ** const rArray2 = v2_0 ->pointArray ; 
struct Point1 * rArrayPt2 = rArray2 [ f2 ] 
; 
f2 = rArrayPt2 ->f0 ; } 


struct Point2 * retPoint = (struct Point2  *) malloc(sizeof(struct Point2 ));  
Point2_Point2( retPoint, f1 , f2 ) ; 
SX10_TEMP7 [ pt ] = retPoint ; 
} 

/*Updatable ARRAY*/ struct Point2 ** const ptArray = SX10_TEMP7 ; 
struct Region2 * retReg = (struct Region2  *) malloc(sizeof(struct Region2 ));  
Region2_Region2_2( retReg, ptArray , stride0 ) ; 
return retReg ; 
} 


} 



Random * Random_Random ( struct Random *RandomTEMP, const long long rseed ) 
{ Random_setSeed ( RandomTEMP, rseed ) ; 

 return  RandomTEMP; 

} 
Random* Random_Random_0(struct Random *RandomTEMP){return RandomTEMP;}

void Random_setSeed ( struct Random *RandomTEMP, const long long rseed ) 
{ const long long X10_TEMP1 = /*program*/_Random_multiplier ; 
const long long X10_TEMP3 = rseed ^ X10_TEMP1 ; 
const long long X10_TEMP4 = /*program*/_Random_mask ; 
const long long X10_TEMP6 = X10_TEMP3 & X10_TEMP4 ; 
RandomTEMP->seed = ( X10_TEMP6 ) ; 
} 


SOR * SOR_SOR ( struct SOR *SORTEMP) 
{ /*UpdatableVariableDeclaration*/long long X10_TEMP2 = /*program*/_SOR_RANDOM_SEED ; 
struct Random * X10_TEMP4 = (struct Random  *) malloc(sizeof(struct Random ));  
Random_Random( X10_TEMP4, X10_TEMP2 ) ; 
SORTEMP->R = ( X10_TEMP4 ) ; 

 return  SORTEMP; 

} 


Timer * Timer_Timer ( struct Timer *TimerTEMP) 
{ const int X10_TEMP3 = 0 ; 
const int X10_TEMP4 = /*program*/_Timer_max_counters ; 
struct Region1 * X10_TEMP5 = createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; 
const int X10_TEMP6 = /* place.FIRST_PLACE  */ 0 ; 
struct Dist1 * d = getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; 
struct Region1 * RX10_TEMP0 = d ->dReg ; 
const int RX10_TEMP1 = 0 ; 
const int RX10_TEMP2 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP3 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; const int SX10_TEMP0 = 1 ; 
const int RX10_TEMP4 = RX10_TEMP3 + SX10_TEMP0 ; 
const int SX10_TEMP1 = 1 ; 
const int RX10_TEMP5 = RX10_TEMP3 + SX10_TEMP1 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP6 = (doubleStub **)calloc(RX10_TEMP5,sizeof( doubleStub *)); 
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
/*Updatable ARRAY*/ double * const SX10_TEMP5 = (double *)calloc(RX10_TEMP14,sizeof( double *)); 
for ( int SX10_TEMP6 = 0 ; SX10_TEMP6 < RX10_TEMP14 ; SX10_TEMP6 ++ ) 
{ const int RX10_TEMP13 = SX10_TEMP6 ; 
const double X10_TEMP9 = 0 ; 
SX10_TEMP5 [ RX10_TEMP13 ] = X10_TEMP9 ; 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP15 = SX10_TEMP5 ; 
struct doubleStub * RX10_TEMP16 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP16, RX10_TEMP15 ) ; 
/* async ( RX10_TEMP8 )  */ 
{ RX10_TEMP6 [ RX10_TEMP7 ] = RX10_TEMP16 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP7 = (doubleStub **)calloc(RX10_TEMP4,sizeof( doubleStub *)); 
for ( int SX10_TEMP8 = 0 ; SX10_TEMP8 < RX10_TEMP4 ; SX10_TEMP8 ++ ) 
{ const int RX10_TEMP19 = SX10_TEMP8 ; 
struct doubleStub * RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] 
; 
SX10_TEMP7 [ RX10_TEMP19 ] = RX10_TEMP18 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP17 = SX10_TEMP7 ; 
struct doubleRefArray1 * RX10_TEMP20 = (struct doubleRefArray1  *) malloc(sizeof(struct doubleRefArray1 ));  
doubleRefArray1_doubleRefArray1( RX10_TEMP20, d , RX10_TEMP17 ) ; 
struct doubleRefArray1 * X10_TEMP11 = RX10_TEMP20 ; 
TimerTEMP->start_time = ( X10_TEMP11 ) ; 
struct Region1 * RX10_TEMP21 = d ->dReg ; 
const int RX10_TEMP22 = 0 ; 
const int RX10_TEMP23 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP24 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; const int SX10_TEMP9 = 1 ; 
const int RX10_TEMP25 = RX10_TEMP24 + SX10_TEMP9 ; 
const int SX10_TEMP10 = 1 ; 
const int RX10_TEMP26 = RX10_TEMP24 + SX10_TEMP10 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP27 = (doubleStub **)calloc(RX10_TEMP26,sizeof( doubleStub *)); 
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
/*Updatable ARRAY*/ double * const SX10_TEMP14 = (double *)calloc(RX10_TEMP35,sizeof( double *)); 
for ( int SX10_TEMP15 = 0 ; SX10_TEMP15 < RX10_TEMP35 ; SX10_TEMP15 ++ ) 
{ const int RX10_TEMP34 = SX10_TEMP15 ; 
const double X10_TEMP13 = 0 ; 
SX10_TEMP14 [ RX10_TEMP34 ] = X10_TEMP13 ; 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP36 = SX10_TEMP14 ; 
struct doubleStub * RX10_TEMP37 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP37, RX10_TEMP36 ) ; 
/* async ( RX10_TEMP29 )  */ 
{ RX10_TEMP27 [ RX10_TEMP28 ] = RX10_TEMP37 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP16 = (doubleStub **)calloc(RX10_TEMP25,sizeof( doubleStub *)); 
for ( int SX10_TEMP17 = 0 ; SX10_TEMP17 < RX10_TEMP25 ; SX10_TEMP17 ++ ) 
{ const int RX10_TEMP40 = SX10_TEMP17 ; 
struct doubleStub * RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] 
; 
SX10_TEMP16 [ RX10_TEMP40 ] = RX10_TEMP39 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP38 = SX10_TEMP16 ; 
struct doubleRefArray1 * RX10_TEMP41 = (struct doubleRefArray1  *) malloc(sizeof(struct doubleRefArray1 ));  
doubleRefArray1_doubleRefArray1( RX10_TEMP41, d , RX10_TEMP38 ) ; 
struct doubleRefArray1 * X10_TEMP15 = RX10_TEMP41 ; 
TimerTEMP->elapsed_time = ( X10_TEMP15 ) ; 
struct Region1 * RX10_TEMP42 = d ->dReg ; 
const int RX10_TEMP43 = 0 ; 
const int RX10_TEMP44 = 1 ; 
/*UpdatableVariableDeclaration*/int RX10_TEMP45 = /* place.MAX_PLACES  */ 1 ; 
RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; const int SX10_TEMP18 = 1 ; 
const int RX10_TEMP46 = RX10_TEMP45 + SX10_TEMP18 ; 
const int SX10_TEMP19 = 1 ; 
const int RX10_TEMP47 = RX10_TEMP45 + SX10_TEMP19 ; 
/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP48 = (doubleStub **)calloc(RX10_TEMP47,sizeof( doubleStub *)); 
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
/*Updatable ARRAY*/ double * const SX10_TEMP23 = (double *)calloc(RX10_TEMP56,sizeof( double *)); 
for ( int SX10_TEMP24 = 0 ; SX10_TEMP24 < RX10_TEMP56 ; SX10_TEMP24 ++ ) 
{ const int RX10_TEMP55 = SX10_TEMP24 ; 
const double X10_TEMP17 = 0 ; 
SX10_TEMP23 [ RX10_TEMP55 ] = X10_TEMP17 ; 
} 

/*Updatable ARRAY*/ double * const RX10_TEMP57 = SX10_TEMP23 ; 
struct doubleStub * RX10_TEMP58 = (struct doubleStub  *) malloc(sizeof(struct doubleStub ));  
doubleStub_doubleStub( RX10_TEMP58, RX10_TEMP57 ) ; 
/* async ( RX10_TEMP50 )  */ 
{ RX10_TEMP48 [ RX10_TEMP49 ] = RX10_TEMP58 ; 
} 

} 

} 

} 

/*Updatable ARRAY*/ struct doubleStub ** const SX10_TEMP25 = (doubleStub **)calloc(RX10_TEMP46,sizeof( doubleStub *)); 
for ( int SX10_TEMP26 = 0 ; SX10_TEMP26 < RX10_TEMP46 ; SX10_TEMP26 ++ ) 
{ const int RX10_TEMP61 = SX10_TEMP26 ; 
struct doubleStub * RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] 
; 
SX10_TEMP25 [ RX10_TEMP61 ] = RX10_TEMP60 ; 
} 

/*Updatable ARRAY*/ struct doubleStub ** const RX10_TEMP59 = SX10_TEMP25 ; 
struct doubleRefArray1 * RX10_TEMP62 = (struct doubleRefArray1  *) malloc(sizeof(struct doubleRefArray1 ));  
doubleRefArray1_doubleRefArray1( RX10_TEMP62, d , RX10_TEMP59 ) ; 
struct doubleRefArray1 * X10_TEMP19 = RX10_TEMP62 ; 
TimerTEMP->total_time = ( X10_TEMP19 ) ; 

 return  TimerTEMP; 

} 


Dist * Dist_Dist ( struct Dist *DistTEMP, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) 
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
/*Updatable ARRAY*/ int * const tempCounts = (int *)calloc(countDist,sizeof( int *)); 
/*Updatable ARRAY*/ int * const tempRunSum = (int *)calloc(runSumDist,sizeof( int *)); 
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

 return  DistTEMP; 

} 

Region2 * Region2_Region2_2( struct Region2 *Region2TEMP, /*Updatable ARRAY*/ struct Point2 ** const pointArray_ , const int regSize_ ) 
{ const int zero = 0 ; 
const int one = 1 ; 
const int minusOne = zero - one ; 
const int f = 0 ; 
const int regR = 2 ; 
Region2TEMP->regRank = ( regR ) ; 
Region2TEMP->regSize = ( regSize_ ) ; 
Region2TEMP->pointArray = ( pointArray_ ) ; 
Region2TEMP->regType = ( f ) ; 
Region2TEMP->low0 = ( minusOne ) ; 
Region2TEMP->dim0 = ( zero ) ; 
Region2TEMP->low1 = ( minusOne ) ; 
Region2TEMP->dim1 = ( zero ) ; 

 return  Region2TEMP; 

} 

Region2 * Region2_Region2_6( struct Region2 *Region2TEMP, /*Updatable ARRAY*/ struct Point2 ** const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ , const int low1_ , const int dim1_ ) 
{ const int t = 1 ; 
const int regR = 2 ; 
Region2TEMP->regRank = ( regR ) ; 
Region2TEMP->regSize = ( regSize_ ) ; 
Region2TEMP->pointArray = ( pointArray_ ) ; 
Region2TEMP->regType = ( t ) ; 
Region2TEMP->low0 = ( low0_ ) ; 
Region2TEMP->dim0 = ( dim0_ ) ; 
Region2TEMP->low1 = ( low1_ ) ; 
Region2TEMP->dim1 = ( dim1_ ) ; 

 return  Region2TEMP; 

} 

Point1 * Point1_Point1 ( struct Point1 *Point1TEMP, const int f0_ ) 
{ Point1TEMP->f0 = ( f0_ ) ; 

 return  Point1TEMP; 

} 

doubleStub * doubleStub_doubleStub ( struct doubleStub *doubleStubTEMP, /*Updatable ARRAY*/ double * const localArray_ ) 
{ doubleStubTEMP->localArray = ( localArray_ ) ; 

 return  doubleStubTEMP; 

} 

Region1 * Region1_Region1_2( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 ** const pointArray_ , const int regSize_ ) 
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

 return  Region1TEMP; 

} 

Region1 * Region1_Region1_4( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 ** const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) 
{ const int t = 1 ; 
const int regR = 1 ; 
Region1TEMP->regRank = ( regR ) ; 
Region1TEMP->regSize = ( regSize_ ) ; 
Region1TEMP->pointArray = ( pointArray_ ) ; 
Region1TEMP->regType = ( t ) ; 
Region1TEMP->low0 = ( low0_ ) ; 
Region1TEMP->dim0 = ( dim0_ ) ; 

 return  Region1TEMP; 

} 

Point2 * Point2_Point2 ( struct Point2 *Point2TEMP, const int f0_ , const int f1_ ) 
{ Point2TEMP->f0 = ( f0_ ) ; 
Point2TEMP->f1 = ( f1_ ) ; 

 return  Point2TEMP; 

} 

Dist1 * Dist1_Dist1 ( struct Dist1 *Dist1TEMP,  struct Region1  * const dReg_ ,  struct Dist  * const dDist_ ) 
{ Dist1TEMP->dReg = ( dReg_ ) ; 
Dist1TEMP->dDist = ( dDist_ ) ; 

 return  Dist1TEMP; 

} 

Dist2 * Dist2_Dist2 ( struct Dist2 *Dist2TEMP,  struct Region2  * const dReg_ ,  struct Dist  * const dDist_ ) 
{ Dist2TEMP->dReg = ( dReg_ ) ; 
Dist2TEMP->dDist = ( dDist_ ) ; 

 return  Dist2TEMP; 

} 

doubleRefArray1 * doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1TEMP,  struct Dist1  * const distValue_ , /*Updatable ARRAY*/ struct doubleStub ** const contents_ ) 
{ doubleRefArray1TEMP->distValue = ( distValue_ ) ; 
doubleRefArray1TEMP->contents = ( contents_ ) ; 

 return  doubleRefArray1TEMP; 

} 

doubleRefArray2 * doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2TEMP,  struct Dist2  * const distValue_ , /*Updatable ARRAY*/ struct doubleStub ** const contents_ ) 
{ doubleRefArray2TEMP->distValue = ( distValue_ ) ; 
doubleRefArray2TEMP->contents = ( contents_ ) ; 

 return  doubleRefArray2TEMP; 

} 
/* class RunMain */ int  main ( /*TODO*/) { UniqueDistribution = getUniqueDist ( ) ; 
_Random_multiplier = _Random_multiplier_init ( ) ; 
_Random_addend = _Random_addend_init ( ) ; 
_Random_mask = _Random_mask_init ( ) ; 
_SOR_JACOBI_NUM_ITER = _SOR_JACOBI_NUM_ITER_init ( ) ; 
_SOR_RANDOM_SEED = _SOR_RANDOM_SEED_init ( ) ; 
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
