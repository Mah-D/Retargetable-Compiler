typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct intStub { 
/*Updatable ARRAY*/ int32_t *  /*const*/ localArray ; 
} intStub ;
 
/* value */ typedef struct Point2 { 
int32_t  /*const*/ f0 ; 
int32_t  /*const*/ f1 ; 
} Point2 ;
 
/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct T2 { 
int32_t  /*const*/ RX10_TEMP45 ; 
place_t  /*const*/ RX10_TEMP41 ; 
int32_t  /*const*/ RX10_TEMP40 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP39 ; 
} T2 ;
 
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
int32_t  /*const*/ RX10_TEMP65 ; 
place_t  /*const*/ RX10_TEMP61 ; 
int32_t  /*const*/ RX10_TEMP60 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP59 ; 
} T3 ;
 
/* value */ typedef struct T1 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T1 ;
 
/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T5 { 
int32_t  /*const*/ RX10_TEMP105 ; 
place_t  /*const*/ RX10_TEMP101 ; 
int32_t  /*const*/ RX10_TEMP100 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP99 ; 
} T5 ;
 
/* value */ typedef struct T4 { 
int32_t  /*const*/ RX10_TEMP85 ; 
place_t  /*const*/ RX10_TEMP81 ; 
int32_t  /*const*/ RX10_TEMP80 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP79 ; 
} T4 ;
 
/* value */ typedef struct T7 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T7 ;
 
/* value */ typedef struct T6 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T6 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct T19 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP68 ; 
int32_t  /*const*/ RX10_TEMP60 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP59 ; 
} T19 ;
 
/* value */ typedef struct T18 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP48 ; 
int32_t  /*const*/ RX10_TEMP40 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP39 ; 
} T18 ;
 
/* value */ typedef struct T17 { 
struct intStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T17 ;
 
/* value */ typedef struct Dist2 { 
struct Region2 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist2 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct T20 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP88 ; 
int32_t  /*const*/ RX10_TEMP80 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP79 ; 
} T20 ;
 
/* value */ typedef struct T21 { 
struct intStub /*value*/  /*const*/ RX10_TEMP108 ; 
int32_t  /*const*/ RX10_TEMP100 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP99 ; 
} T21 ;
 
/* value */ typedef struct T22 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T22 ;
 
/* value */ typedef struct T23 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T23 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct doubleRefArray2 { 
struct Dist2 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray2 ;
 
/* value */ typedef struct intRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct intStub *  /*const*/ contents ; 
} intRefArray1 ;
 
/* value */ typedef struct T11 { 
struct Point2 /*value*/  /*const*/ p ; 
struct doubleRefArray2 /*value*/  /*const*/ b ; 
} T11 ;
 
/* value */ typedef struct T10 { 
double  /*const*/ val ; 
int32_t  /*const*/ j ; 
int32_t  /*const*/ i ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
} T10 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T24 { 
double  /*const*/ temp ; 
struct doubleRefArray1 /*value*/  /*const*/ tempref ; 
} T24 ;
 
/* value */ typedef struct T9 { 
double  /*const*/ val ; 
struct Point2 /*value*/  /*const*/ p ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
} T9 ;
 
/* value */ typedef struct T8 { 
struct doubleRefArray1 /*value*/  /*const*/ tempref ; 
place_t  /*const*/ curr_place ; 
int32_t  /*const*/ j ; 
int32_t  /*const*/ i ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
} T8 ;
 
/* class Linpack */ typedef struct Linpack { 
int32_t setSize ; 
struct doubleRefArray2 a ; 
struct doubleRefArray2 b ; 
struct doubleRefArray2 x ; 
double ops ; 
double total ; 
double norma ; 
double normx ; 
double resid ; 
double time ; 
double kf ; 
int32_t n ; 
int32_t i ; 
int32_t ntimes ; 
int32_t info ; 
int32_t lda ; 
int32_t ldaa ; 
int32_t kflops ; 
struct intRefArray1 ipvt ; 
int32_t infodgefa ; 
} Linpack ; 

/* value */ typedef struct T16 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T16 ;
 
/* value */ typedef struct T15 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T15 ;
 
/* value */ typedef struct T14 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T14 ;
 
/* value */ typedef struct T13 { 
int32_t  /*const*/ l ; 
int32_t  /*const*/ k ; 
int32_t  /*const*/ n ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
struct Linpack *  /*const*/ X10_TEMP0 ; 
} T13 ;
 
/* value */ typedef struct T12 { 
int32_t  /*const*/ j ; 
int32_t  /*const*/ i ; 
struct doubleRefArray2 /*value*/  /*const*/ b ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
struct Linpack *  /*const*/ X10_TEMP0 ; 
} T12 ;
 
/* value */ typedef struct T25 { 
int32_t  /*const*/ j ; 
int32_t  /*const*/ kp1 ; 
int32_t  /*const*/ l ; 
int32_t  /*const*/ k ; 
int32_t  /*const*/ n ; 
struct doubleRefArray2 /*value*/  /*const*/ a ; 
struct Linpack *  /*const*/ X10_TEMP0 ; 
} T25 ;
 
/* value */ typedef struct T26 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T26 ;
 
/* value */ typedef struct T27 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T27 ;
 
/* value */ typedef struct T28 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T28 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18,ASYNC19,ASYNC20,ASYNC21,ASYNC22,ASYNC23,ASYNC24,ASYNC25,ASYNC26,ASYNC27};
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
Region1 /*static*/_Linpack_r_init ( ) ;
void /*static*/Linpack_initdataSizesArray (  struct Linpack  * const X10_TEMP0 ,  struct intRefArray1 const datasizes ) ;
void /*static*/Linpack_JGFsetsize (  struct Linpack  * const X10_TEMP0 , const int32_t setSize ) ;
void /*static*/Linpack_JGFinitialise (  struct Linpack  * const X10_TEMP0 ,  struct Dist1 const vd ) ;
void /*static*/Linpack_JGFkernel (  struct Linpack  * const X10_TEMP0 ) ;
void /*static*/Linpack_JGFvalidate (  struct Linpack  * const X10_TEMP0 ,  struct Dist1 const vd ) ;
void /*static*/Linpack_JGFtidyup (  struct Linpack  * const X10_TEMP0 ) ;
void /*static*/Linpack_run (  struct Linpack  * const X10_TEMP0 ) ;
double /*static*/Linpack_read (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t i , const int32_t j ) ;
void /*static*/Linpack_write (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a ,  struct Point2 const p , const double val ) ;
void /*static*/Linpack_plusWrite (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t i , const int32_t j , const double val ) ;
double /*static*/Linpack_myabs (  struct Linpack  * const X10_TEMP0 , const double d ) ;
double /*static*/Linpack_matgen (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct doubleRefArray2 const b ) ;
int32_t /*static*/Linpack_dgefa (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct intRefArray1 const ipvt ) ;
void /*static*/Linpack_dgesl (  struct Linpack  * const X10_TEMP0 ,  struct doubleRefArray2 const a , const int32_t lda , const int32_t n ,  struct intRefArray1 const ipvt ,  struct doubleRefArray2 const b , const int32_t job ) ;
void /*static*/Linpack_daxpy (  struct Linpack  * const X10_TEMP0 , const int32_t n , const double da ,  struct doubleRefArray2 const dx , const int32_t dxCol , const int32_t dx_off , const int32_t incx ,  struct doubleRefArray2 const dy , const int32_t dyCol , const int32_t dy_off , const int32_t incy ) ;
double /*static*/Linpack_ddot (  struct Linpack  * const X10_TEMP0 , const int32_t n ,  struct doubleRefArray2 const dx , const int32_t dxCol , const int32_t dx_off , const int32_t incx ,  struct doubleRefArray2 const dy , const int32_t dyCol , const int32_t dy_off , const int32_t incy ) ;
void /*static*/Linpack_dscal (  struct Linpack  * const X10_TEMP0 , const int32_t n , const double da ,  struct doubleRefArray2 const dx , const int32_t currentCol , const int32_t dx_off , const int32_t incx ) ;
int32_t /*static*/Linpack_idamax (  struct Linpack  * const X10_TEMP0 , const int32_t n ,  struct doubleRefArray2 const dx , const int32_t dxk , const int32_t dx_off , const int32_t incx ) ;
double /*static*/Linpack_epslon (  struct Linpack  * const X10_TEMP0 , const double x ) ;
void /*static*/Linpack_dmxpy (  struct Linpack  * const X10_TEMP0 , const int32_t n1 ,  struct doubleRefArray2 const y , const int32_t n2 , const int32_t ldm ,  struct doubleRefArray2 const x ,  struct doubleRefArray2 const m ) ;
void /*static*/runMain ( ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index , const double val ) ;
int32_t /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
place_t /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int32_t index ) ;
int32_t /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int32_t index ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int32_t /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) ;
Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int32_t index , const int32_t val ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
Dist2 /*static*/getBlockCyclicDist2 (  struct Region2 const r , const int32_t blockSize ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
int32_t /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int32_t placeIndex ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue2double (  struct doubleRefArray2 const array , const int32_t index ) ;
Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const place_t p ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
Region2 /*static*/createNewRegion2RR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 ) ;
void /*static*/thread1 (  struct T1 const utmpz ) ;
void /*static*/thread2 (  struct T2 const utmpz ) ;
void /*static*/thread3 (  struct T3 const utmpz ) ;
void /*static*/thread4 (  struct T4 const utmpz ) ;
void /*static*/thread5 (  struct T5 const utmpz ) ;
void /*static*/thread6 (  struct T6 const utmpz ) ;
void /*static*/thread7 (  struct T7 const utmpz ) ;
void /*static*/thread8 (  struct T8 const utmpz ) ;
void /*static*/thread9 (  struct T9 const utmpz ) ;
void /*static*/thread10 (  struct T10 const utmpz ) ;
void /*static*/thread11 (  struct T11 const utmpz ) ;
void /*static*/thread12 (  struct T12 const utmpz ) ;
void /*static*/thread13 (  struct T13 const utmpz ) ;
void /*static*/thread17 (  struct T17 const utmpz ) ;
void /*static*/thread18 (  struct T18 const utmpz ) ;
void /*static*/thread19 (  struct T19 const utmpz ) ;
void /*static*/thread20 (  struct T20 const utmpz ) ;
void /*static*/thread21 (  struct T21 const utmpz ) ;
void /*static*/thread22 (  struct T22 const utmpz ) ;
void /*static*/thread23 (  struct T23 const utmpz ) ;
void /*static*/thread24 (  struct T24 const utmpz ) ;
void /*static*/thread25 (  struct T25 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP45 , const place_t a_RX10_TEMP41 , const int32_t a_RX10_TEMP40 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP39 ) ;

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP65 , const place_t a_RX10_TEMP61 , const int32_t a_RX10_TEMP60 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP59 ) ;

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP85 , const place_t a_RX10_TEMP81 , const int32_t a_RX10_TEMP80 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP79 ) ;

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP105 , const place_t a_RX10_TEMP101 , const int32_t a_RX10_TEMP100 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP99 ) ;

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T8 T8_T8 ( struct T8 *T8THIS,  struct doubleRefArray1 const a_tempref , const place_t a_curr_place , const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_a ) ;

T9 T9_T9 ( struct T9 *T9THIS, const double a_val ,  struct Point2 const a_p ,  struct doubleRefArray2 const a_a ) ;

T10 T10_T10 ( struct T10 *T10THIS, const double a_val , const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_a ) ;

T11 T11_T11 ( struct T11 *T11THIS,  struct Point2 const a_p ,  struct doubleRefArray2 const a_b ) ;

T12 T12_T12 ( struct T12 *T12THIS, const int32_t a_j , const int32_t a_i ,  struct doubleRefArray2 const a_b ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) ;

T13 T13_T13 ( struct T13 *T13THIS, const int32_t a_l , const int32_t a_k , const int32_t a_n ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) ;

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T16 T16_T16 ( struct T16 *T16THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T17 T17_T17 ( struct T17 *T17THIS,  struct intStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T18 T18_T18 ( struct T18 *T18THIS,  struct doubleStub const a_RX10_TEMP48 , const int32_t a_RX10_TEMP40 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP39 ) ;

T19 T19_T19 ( struct T19 *T19THIS,  struct doubleStub const a_RX10_TEMP68 , const int32_t a_RX10_TEMP60 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP59 ) ;

T20 T20_T20 ( struct T20 *T20THIS,  struct doubleStub const a_RX10_TEMP88 , const int32_t a_RX10_TEMP80 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP79 ) ;

T21 T21_T21 ( struct T21 *T21THIS,  struct intStub const a_RX10_TEMP108 , const int32_t a_RX10_TEMP100 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP99 ) ;

T22 T22_T22 ( struct T22 *T22THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T23 T23_T23 ( struct T23 *T23THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T24 T24_T24 ( struct T24 *T24THIS, const double a_temp ,  struct doubleRefArray1 const a_tempref ) ;

T25 T25_T25 ( struct T25 *T25THIS, const int32_t a_j , const int32_t a_kp1 , const int32_t a_l , const int32_t a_k , const int32_t a_n ,  struct doubleRefArray2 const a_a ,  struct Linpack  * const a_X10_TEMP0 ) ;

T26 T26_T26 ( struct T26 *T26THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T27 T27_T27 ( struct T27 *T27THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T28 T28_T28 ( struct T28 *T28THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) ;
void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) ;
void thread16 ( struct Timer *TimerTHIS,  struct T16 const utmpz ) ;
void thread26 ( struct Timer *TimerTHIS,  struct T26 const utmpz ) ;
void thread27 ( struct Timer *TimerTHIS,  struct T27 const utmpz ) ;
void thread28 ( struct Timer *TimerTHIS,  struct T28 const utmpz ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ ) ;

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ ) ;
Linpack* Linpack_Linpack(struct Linpack * LinpackTHIS);
;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int32_t f0_ , const int32_t f1_ ) ;

intStub intStub_intStub ( struct intStub *intStubTHIS, /*Updatable ARRAY*/ int32_t * const localArray_ ) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) ;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOfT28( struct T28 * className);
int32_t getSizeOfT27( struct T27 * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT26( struct T26 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfT25( struct T25 * className);
int32_t getSizeOfT24( struct T24 * className);
int32_t getSizeOfT23( struct T23 * className);
int32_t getSizeOfintRefArray1( struct intRefArray1 * className);
int32_t getSizeOfT22( struct T22 * className);
int32_t getSizeOfT21( struct T21 * className);
int32_t getSizeOfT20( struct T20 * className);
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
int32_t getSizeOfintStub( struct intStub * className);
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
void* deepCopyT28( struct T28 * className, void * offset);
void* deepCopyT27( struct T27 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT26( struct T26 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyT25( struct T25 * className, void * offset);
void* deepCopyT24( struct T24 * className, void * offset);
void* deepCopyT23( struct T23 * className, void * offset);
void* deepCopyintRefArray1( struct intRefArray1 * className, void * offset);
void* deepCopyT22( struct T22 * className, void * offset);
void* deepCopyT21( struct T21 * className, void * offset);
void* deepCopyT20( struct T20 * className, void * offset);
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
void* deepCopyintStub( struct intStub * className, void * offset);
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
void * fixPointerT28( struct T28 * className, void * offset);
void * fixPointerT27( struct T27 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT26( struct T26 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerT25( struct T25 * className, void * offset);
void * fixPointerT24( struct T24 * className, void * offset);
void * fixPointerT23( struct T23 * className, void * offset);
void * fixPointerintRefArray1( struct intRefArray1 * className, void * offset);
void * fixPointerT22( struct T22 * className, void * offset);
void * fixPointerT21( struct T21 * className, void * offset);
void * fixPointerT20( struct T20 * className, void * offset);
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
void * fixPointerintStub( struct intStub * className, void * offset);
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
