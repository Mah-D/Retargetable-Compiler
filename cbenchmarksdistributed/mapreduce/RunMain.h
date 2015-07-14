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
 
/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct T2 { 
int32_t  /*const*/ RX10_TEMP14 ; 
place_t  /*const*/ RX10_TEMP10 ; 
int32_t  /*const*/ RX10_TEMP9 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP8 ; 
} T2 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T8 { 
struct intStub /*value*/  /*const*/ RX10_TEMP17 ; 
int32_t  /*const*/ RX10_TEMP9 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP8 ; 
} T8 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct intRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct intStub *  /*const*/ contents ; 
} intRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct T9 { 
int32_t  /*const*/ v ; 
struct Point1 /*value*/  /*const*/ p ; 
struct intRefArray1 /*value*/  /*const*/ result ; 
} T9 ;
 
/* value */ typedef struct T3 { 
struct intRefArray1 /*value*/  /*const*/ c ; 
struct Point1 /*value*/  /*const*/ p ; 
struct intRefArray1 /*value*/  /*const*/ result ; 
place_t  /*const*/ h ; 
} T3 ;
 
/* class MR */ typedef struct MR { 
struct intRefArray1 a ; 
int32_t total ; 
} MR ; 

/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T13 { 
struct MR THIS /*this*/;
struct intStub /*value*/  /*const*/ RX10_TEMP19 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T13 ;
 
/* value */ typedef struct T12 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T12 ;
 
/* value */ typedef struct T11 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T11 ;
 
/* value */ typedef struct T5 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T5 ;
 
/* value */ typedef struct T10 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T10 ;
 
/* value */ typedef struct T4 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T4 ;
 
/* value */ typedef struct T7 { 
struct MR THIS /*this*/;
struct Region1 /*value*/  /*const*/ RX10_TEMP14 ; 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T7 ;
 
/* value */ typedef struct T6 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T6 ;
 
/* value */ typedef struct T1 { 
struct Point1 /*value*/  /*const*/ p ; 
struct intRefArray1 /*value*/  /*const*/ b ; 
struct MR *  /*const*/ X10_TEMP0 ; 
} T1 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12};
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
Region1 /*static*/_MR_r_init ( ) ;
void /*static*/MR_run (  struct MR  * const X10_TEMP0 ) ;
void /*static*/MR_map (  struct MR  * const X10_TEMP0 ) ;
int32_t /*static*/MR_f (  struct MR  * const X10_TEMP0 , const int32_t x ) ;
void /*static*/MR_reduce (  struct MR  * const X10_TEMP0 ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
int32_t /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int32_t index ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int32_t index , const int32_t val ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
void /*static*/thread1 (  struct T1 const utmpz ) ;
void /*static*/thread2 (  struct T2 const utmpz ) ;
void /*static*/thread3 (  struct T3 const utmpz ) ;
void /*static*/thread8 (  struct T8 const utmpz ) ;
void /*static*/thread9 (  struct T9 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS,  struct Point1 const a_p ,  struct intRefArray1 const a_b ,  struct MR  * const a_X10_TEMP0 ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP14 , const place_t a_RX10_TEMP10 , const int32_t a_RX10_TEMP9 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP8 ) ;

T3 T3_T3 ( struct T3 *T3THIS,  struct intRefArray1 const a_c ,  struct Point1 const a_p ,  struct intRefArray1 const a_result , const place_t a_h ) ;

T4 T4_T4 ( struct T4 *T4THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T5 T5_T5 ( struct T5 *T5THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T6 T6_T6 ( struct T6 *T6THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T7 T7_T7 ( struct T7 *T7THIS, struct MR * MRTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP14 , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T8 T8_T8 ( struct T8 *T8THIS,  struct intStub const a_RX10_TEMP17 , const int32_t a_RX10_TEMP9 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP8 ) ;

T9 T9_T9 ( struct T9 *T9THIS, const int32_t a_v ,  struct Point1 const a_p ,  struct intRefArray1 const a_result ) ;

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T11 T11_T11 ( struct T11 *T11THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T12 T12_T12 ( struct T12 *T12THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T13 T13_T13 ( struct T13 *T13THIS, struct MR * MRTHIS /*this*/ ,  struct intStub const a_RX10_TEMP19 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

intStub intStub_intStub ( struct intStub *intStubTHIS, /*Updatable ARRAY*/ int32_t * const localArray_ ) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread4 ( struct Timer *TimerTHIS,  struct T4 const utmpz ) ;
void thread5 ( struct Timer *TimerTHIS,  struct T5 const utmpz ) ;
void thread6 ( struct Timer *TimerTHIS,  struct T6 const utmpz ) ;
void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) ;
void thread11 ( struct Timer *TimerTHIS,  struct T11 const utmpz ) ;
void thread12 ( struct Timer *TimerTHIS,  struct T12 const utmpz ) ;

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

MR *MR_MR ( struct MR *MRTHIS) ;
void thread7 ( struct MR *MRTHIS,  struct T7 const utmpz ) ;
void thread13 ( struct MR *MRTHIS,  struct T13 const utmpz ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;
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
int32_t getSizeOfintRefArray1( struct intRefArray1 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfT2( struct T2 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfT10( struct T10 * className);
int32_t getSizeOfT11( struct T11 * className);
int32_t getSizeOfintStub( struct intStub * className);
int32_t getSizeOfT12( struct T12 * className);
int32_t getSizeOfT13( struct T13 * className);
int32_t getSizeOfDist( struct Dist * className);
void* deepCopydoubleStub( struct doubleStub * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyintRefArray1( struct intRefArray1 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyT10( struct T10 * className, void * offset);
void* deepCopyT11( struct T11 * className, void * offset);
void* deepCopyintStub( struct intStub * className, void * offset);
void* deepCopyT12( struct T12 * className, void * offset);
void* deepCopyT13( struct T13 * className, void * offset);
void* deepCopyDist( struct Dist * className, void * offset);
void * fixPointerdoubleStub( struct doubleStub * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerintRefArray1( struct intRefArray1 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerT10( struct T10 * className, void * offset);
void * fixPointerT11( struct T11 * className, void * offset);
void * fixPointerintStub( struct intStub * className, void * offset);
void * fixPointerT12( struct T12 * className, void * offset);
void * fixPointerT13( struct T13 * className, void * offset);
void * fixPointerDist( struct Dist * className, void * offset);
