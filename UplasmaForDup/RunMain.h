typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* class Random */ typedef struct Random { 
int64_t seed ; 
} Random ; 

/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct Point2 { 
int32_t  /*const*/ f0 ; 
int32_t  /*const*/ f1 ; 
} Point2 ;
 
/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct Region2 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
int32_t  /*const*/ low1 ; 
int32_t  /*const*/ dim1 ; 
/*VALUE ARRAY*/ struct Point2 *  /*const*/ pointArray ; 
} Region2 ;
 
/* value */ typedef struct T3 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T3 ;
 
/* value */ typedef struct T1 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T1 ;
 
/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T6 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
double  /*const*/ initVal ; 
} T6 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct T15 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T15 ;
 
/* class SOR */ typedef struct SOR { 
struct Random *R ; 
} SOR ; 

/* value */ typedef struct T12 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T12 ;
 
/* value */ typedef struct T11 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T11 ;
 
/* value */ typedef struct Dist2 { 
struct Region2 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist2 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct doubleRefArray2 { 
struct Dist2 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray2 ;
 
/* value */ typedef struct T16 { 
double  /*const*/ localSum ; 
int32_t  /*const*/ index ; 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
} T16 ;
 
/* value */ typedef struct T14 { 
struct Point2 /*value*/  /*const*/ ij ; 
double  /*const*/ one_minus_omega ; 
double  /*const*/ omega_over_four ; 
struct doubleRefArray2 /*value*/  /*const*/ G ; 
struct SOR *  /*const*/ X10_TEMP0 ; 
} T14 ;
 
/* value */ typedef struct T13 { 
double  /*const*/ val ; 
struct doubleRefArray1 /*value*/  /*const*/ result ; 
} T13 ;
 
/* value */ typedef struct T2 { 
double  /*const*/ v ; 
struct Point2 /*value*/  /*const*/ p ; 
struct doubleRefArray2 /*value*/  /*const*/ t ; 
} T2 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T5 { 
struct Point2 /*value*/  /*const*/ pt ; 
struct Point2 /*value*/  /*const*/ po ; 
double  /*const*/ one_minus_omega ; 
double  /*const*/ omega_over_four ; 
struct doubleRefArray2 /*value*/  /*const*/ G ; 
struct SOR *  /*const*/ X10_TEMP0 ; 
} T5 ;
 
/* value */ typedef struct T4 { 
place_t  /*const*/ phere ; 
struct doubleRefArray1 /*value*/  /*const*/ result ; 
struct Point2 /*value*/  /*const*/ pt ; 
struct doubleRefArray2 /*value*/  /*const*/ G ; 
} T4 ;
 
/* value */ typedef struct T7 { 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
place_t  /*const*/ source ; 
int32_t  /*const*/ zero ; 
struct doubleRefArray2 /*value*/  /*const*/ sumArray ; 
} T7 ;
 
/* value */ typedef struct T19 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T19 ;
 
/* value */ typedef struct T18 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T18 ;
 
/* value */ typedef struct T17 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T17 ;
 
/* value */ typedef struct T10 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T10 ;
 
/* value */ typedef struct T9 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T9 ;
 
/* value */ typedef struct T8 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T8 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18};
void /*static*/runMain ( ) ;
int32_t /*static*/_SOR_JACOBI_NUM_ITER_init ( ) ;
int64_t /*static*/_SOR_RANDOM_SEED_init ( ) ;
void /*static*/SOR_run (  struct SOR  * const X10_TEMP0 ) ;
double /*static*/SOR_kernel (  struct SOR  * const X10_TEMP0 ) ;
doubleRefArray2 /*static*/SOR_RandomMatrix (  struct SOR  * const X10_TEMP0 , const int32_t M , const int32_t N ,  struct Random  * const R ) ;
void /*static*/SOR_write (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2 const t ,  struct Point2 const p , const double v ) ;
Dist2 /*static*/SOR_blockStar (  struct SOR  * const X10_TEMP0 ,  struct Region1 const r1 ,  struct Region1 const r2 ) ;
Dist2 /*static*/SOR_distTimesRegion (  struct SOR  * const X10_TEMP0 ,  struct Dist1 const d ,  struct Region1 const r ) ;
void /*static*/SOR_validate (  struct SOR  * const X10_TEMP0 , const double gtotal ) ;
double /*static*/SOR_read (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2 const G ,  struct Point2 const pt ) ;
double /*static*/SOR_SORrun (  struct SOR  * const X10_TEMP0 , const double omega ,  struct doubleRefArray2 const G , const int32_t num_iterations ) ;
int64_t /*static*/_Random_multiplier_init ( ) ;
int64_t /*static*/_Random_addend_init ( ) ;
int64_t /*static*/_Random_mask_init ( ) ;
int32_t /*static*/Random_nextbits (  struct Random  * const X10_TEMP0 , const int32_t bits ) ;
int32_t /*static*/Random_nextInt (  struct Random  * const X10_TEMP0 ) ;
int64_t /*static*/Random_nextLong (  struct Random  * const X10_TEMP0 ) ;
uint32_t /*static*/Random_nextBoolean (  struct Random  * const X10_TEMP0 ) ;
double /*static*/Random_nextDouble (  struct Random  * const X10_TEMP0 ) ;
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
double /*static*/doublerefArraySum2 (  struct doubleRefArray2 const sumArray ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index , const double val ) ;
int32_t /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
place_t /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int32_t index ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int32_t /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) ;
Region1 /*static*/getRank2 (  struct Region2 const r , const int32_t dim ) ;
Region1 /*static*/getRankArbitrary2 (  struct Region2 const r , const int32_t dim ) ;
Region1 /*static*/getRankRegular2 (  struct Region2 const r , const int32_t dim ) ;
Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) ;
Dist2 /*static*/unionDist2 (  struct Dist2 const d1 ,  struct Dist2 const d2 ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
int32_t /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int32_t placeIndex ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index ) ;
Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const place_t p ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
Dist2 /*static*/restrictDist2 (  struct Dist2 const dn , const place_t p ) ;
Dist2 /*static*/restrictDistRegular2 (  struct Dist2 const d , const place_t p ) ;
Dist2 /*static*/restrictDistArbitrary2 (  struct Dist2 const d , const place_t p ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
Region2 /*static*/createNewRegion2RR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 ) ;
Region2 /*static*/createNewRegion2AA (  struct Region1 const v1_0 ,  struct Region1 const v2_0 ) ;
void /*static*/thread1 (  struct T1 const utmpz ) ;
void /*static*/thread2 (  struct T2 const utmpz ) ;
void /*static*/thread3 (  struct T3 const utmpz ) ;
void /*static*/thread4 (  struct T4 const utmpz ) ;
void /*static*/thread5 (  struct T5 const utmpz ) ;
void /*static*/thread6 (  struct T6 const utmpz ) ;
void /*static*/thread7 (  struct T7 const utmpz ) ;
void /*static*/thread11 (  struct T11 const utmpz ) ;
void /*static*/thread12 (  struct T12 const utmpz ) ;
void /*static*/thread13 (  struct T13 const utmpz ) ;
void /*static*/thread14 (  struct T14 const utmpz ) ;
void /*static*/thread15 (  struct T15 const utmpz ) ;
void /*static*/thread16 (  struct T16 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T2 T2_T2 ( struct T2 *T2THIS, const double a_v ,  struct Point2 const a_p ,  struct doubleRefArray2 const a_t ) ;

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T4 T4_T4 ( struct T4 *T4THIS, const place_t a_phere ,  struct doubleRefArray1 const a_result ,  struct Point2 const a_pt ,  struct doubleRefArray2 const a_G ) ;

T5 T5_T5 ( struct T5 *T5THIS,  struct Point2 const a_pt ,  struct Point2 const a_po , const double a_one_minus_omega , const double a_omega_over_four ,  struct doubleRefArray2 const a_G ,  struct SOR  * const a_X10_TEMP0 ) ;

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 , const double a_initVal ) ;

T7 T7_T7 ( struct T7 *T7THIS,  struct doubleRefArray1 const a_localSumArray , const place_t a_source , const int32_t a_zero ,  struct doubleRefArray2 const a_sumArray ) ;

T8 T8_T8 ( struct T8 *T8THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T9 T9_T9 ( struct T9 *T9THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T11 T11_T11 ( struct T11 *T11THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T13 T13_T13 ( struct T13 *T13THIS, const double a_val ,  struct doubleRefArray1 const a_result ) ;

T14 T14_T14 ( struct T14 *T14THIS,  struct Point2 const a_ij , const double a_one_minus_omega , const double a_omega_over_four ,  struct doubleRefArray2 const a_G ,  struct SOR  * const a_X10_TEMP0 ) ;

T15 T15_T15 ( struct T15 *T15THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T16 T16_T16 ( struct T16 *T16THIS, const double a_localSum , const int32_t a_index ,  struct doubleRefArray1 const a_localSumArray ) ;

T17 T17_T17 ( struct T17 *T17THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T18 T18_T18 ( struct T18 *T18THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T19 T19_T19 ( struct T19 *T19THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread8 ( struct Timer *TimerTHIS,  struct T8 const utmpz ) ;
void thread9 ( struct Timer *TimerTHIS,  struct T9 const utmpz ) ;
void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) ;
void thread17 ( struct Timer *TimerTHIS,  struct T17 const utmpz ) ;
void thread18 ( struct Timer *TimerTHIS,  struct T18 const utmpz ) ;
void thread19 ( struct Timer *TimerTHIS,  struct T19 const utmpz ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ ) ;

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int32_t f0_ , const int32_t f1_ ) ;

SOR *SOR_SOR ( struct SOR *SORTHIS) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

Random *Random_Random ( struct Random *RandomTHIS, const int64_t rseed ) ;
void Random_setSeed ( struct Random *RandomTHIS, const int64_t rseed ) ;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfdoubleRefArray2( struct doubleRefArray2 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfDist2( struct Dist2 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfRegion2( struct Region2 * className);
int32_t getSizeOfT2( struct T2 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfPoint2( struct Point2 * className);
int32_t getSizeOfT10( struct T10 * className);
int32_t getSizeOfT11( struct T11 * className);
int32_t getSizeOfT12( struct T12 * className);
int32_t getSizeOfT13( struct T13 * className);
int32_t getSizeOfDist( struct Dist * className);
int32_t getSizeOfT14( struct T14 * className);
int32_t getSizeOfT15( struct T15 * className);
int32_t getSizeOfT16( struct T16 * className);
int32_t getSizeOfT17( struct T17 * className);
int32_t getSizeOfT18( struct T18 * className);
int32_t getSizeOfT19( struct T19 * className);
void* deepCopydoubleStub( struct doubleStub * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopydoubleRefArray2( struct doubleRefArray2 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyDist2( struct Dist2 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyRegion2( struct Region2 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyPoint2( struct Point2 * className, void * offset);
void* deepCopyT10( struct T10 * className, void * offset);
void* deepCopyT11( struct T11 * className, void * offset);
void* deepCopyT12( struct T12 * className, void * offset);
void* deepCopyT13( struct T13 * className, void * offset);
void* deepCopyDist( struct Dist * className, void * offset);
void* deepCopyT14( struct T14 * className, void * offset);
void* deepCopyT15( struct T15 * className, void * offset);
void* deepCopyT16( struct T16 * className, void * offset);
void* deepCopyT17( struct T17 * className, void * offset);
void* deepCopyT18( struct T18 * className, void * offset);
void* deepCopyT19( struct T19 * className, void * offset);
void * fixPointerdoubleStub( struct doubleStub * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerdoubleRefArray2( struct doubleRefArray2 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerDist2( struct Dist2 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerRegion2( struct Region2 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerPoint2( struct Point2 * className, void * offset);
void * fixPointerT10( struct T10 * className, void * offset);
void * fixPointerT11( struct T11 * className, void * offset);
void * fixPointerT12( struct T12 * className, void * offset);
void * fixPointerT13( struct T13 * className, void * offset);
void * fixPointerDist( struct Dist * className, void * offset);
void * fixPointerT14( struct T14 * className, void * offset);
void * fixPointerT15( struct T15 * className, void * offset);
void * fixPointerT16( struct T16 * className, void * offset);
void * fixPointerT17( struct T17 * className, void * offset);
void * fixPointerT18( struct T18 * className, void * offset);
void * fixPointerT19( struct T19 * className, void * offset);
