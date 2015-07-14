typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* value */ typedef struct ToTaskStub { 
/*Updatable ARRAY*/ struct ToTask * *  /*const*/ localArray ; 
} ToTaskStub ;
 
/* class Random */ typedef struct Random { 
int64_t seed ; 
uint32_t haveNextNextGaussian ; 
double nextNextGaussian ; 
} Random ; 

/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct T2 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T2 ;
 
/* value */ typedef struct T3 { 
int32_t  /*const*/ RX10_TEMP32 ; 
place_t  /*const*/ RX10_TEMP28 ; 
int32_t  /*const*/ RX10_TEMP27 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP26 ; 
} T3 ;
 
/* value */ typedef struct T5 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
double  /*const*/ initVal ; 
} T5 ;
 
/* value */ typedef struct T4 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T4 ;
 
/* class Data1 */ typedef struct Data1 { 
} Data1 ; 

/* class Data0 */ typedef struct Data0 { 
} Data0 ; 

/* class Data5 */ typedef struct Data5 { 
} Data5 ; 

/* class Data4 */ typedef struct Data4 { 
} Data4 ; 

/* class Data3 */ typedef struct Data3 { 
} Data3 ; 

/* class Data2 */ typedef struct Data2 { 
} Data2 ; 

/* class Data8 */ typedef struct Data8 { 
} Data8 ; 

/* class Data7 */ typedef struct Data7 { 
} Data7 ; 

/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* class Data6 */ typedef struct Data6 { 
} Data6 ; 

/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* class ToTask */ typedef struct ToTask { 
int64_t rseed ; 
} ToTask ; 

/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct ToInitAllTasks { 
double  /*const*/ dTime ; 
int32_t  /*const*/ returnDefinition ; 
double  /*const*/ expectedReturnRate ; 
double  /*const*/ volatility ; 
int32_t  /*const*/ nTimeSteps ; 
double  /*const*/ pathStartValue ; 
} ToInitAllTasks ;
 
/* value */ typedef struct T17 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T17 ;
 
/* value */ typedef struct T16 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T16 ;
 
/* value */ typedef struct T15 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP35 ; 
int32_t  /*const*/ RX10_TEMP27 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP26 ; 
} T15 ;
 
/* value */ typedef struct T14 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T14 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct ToTaskRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct ToTaskStub *  /*const*/ contents ; 
} ToTaskRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* class MonteCarloPath */ typedef struct MonteCarloPath { 
double dTime ; 
struct doubleRefArray1 fluctuations ; 
struct doubleRefArray1 pathValue ; 
int32_t returnDefinition ; 
double expectedReturnRate ; 
double volatility ; 
int32_t nTimeSteps ; 
double pathStartValue ; 
} MonteCarloPath ; 

/* value */ typedef struct T18 { 
double  /*const*/ localSum ; 
int32_t  /*const*/ index ; 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
} T18 ;
 
/* value */ typedef struct T13 { 
struct Point1 /*value*/  /*const*/ i ; 
struct doubleRefArray1 /*value*/  /*const*/ myvolatility ; 
struct doubleRefArray1 /*value*/  /*const*/ myexpectedReturnRate ; 
struct ToTaskRefArray1 /*value*/  /*const*/ mytasks ; 
struct ToInitAllTasks /*value*/  /*const*/ t ; 
} T13 ;
 
/* value */ typedef struct T1 { 
struct doubleRefArray1 /*value*/  /*const*/ myvolatility ; 
struct doubleRefArray1 /*value*/  /*const*/ myexpectedReturnRate ; 
struct ToTaskRefArray1 /*value*/  /*const*/ mytasks ; 
struct ToInitAllTasks /*value*/  /*const*/ t ; 
} T1 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* class ReturnPath */ typedef struct ReturnPath { 
double dTime ; 
struct doubleRefArray1 pathValue ; 
int32_t nPathValue ; 
int32_t returnDefinition ; 
double expectedReturnRate ; 
double volatility ; 
double volatility2 ; 
double mean ; 
double variance ; 
} ReturnPath ; 

/* value */ typedef struct T6 { 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
place_t  /*const*/ source ; 
int32_t  /*const*/ zero ; 
struct doubleRefArray1 /*value*/  /*const*/ sumArray ; 
} T6 ;
 
/* class RatePath */ typedef struct RatePath { 
struct doubleRefArray1 pathValue ; 
int32_t nAcceptedPathValue ; 
double dTime ; 
} RatePath ; 

/* class ToResult */ typedef struct ToResult { 
double expectedReturnRate ; 
double volatility ; 
double volatility2 ; 
double finalStockPrice ; 
struct doubleRefArray1 pathValue ; 
} ToResult ; 

/* value */ typedef struct T12 { 
struct RatePath THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T12 ;
 
/* value */ typedef struct T11 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T11 ;
 
/* value */ typedef struct T10 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T10 ;
 
/* value */ typedef struct T9 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T9 ;
 
/* class PriceStock */ typedef struct PriceStock { 
struct MonteCarloPath *  /*const*/ mcPath ; 
int64_t randomSeed ; 
double pathStartValue ; 
double expectedReturnRate ; 
double volatility ; 
double volatility2 ; 
double finalStockPrice ; 
struct doubleRefArray1 pathValue ; 
} PriceStock ; 

/* value */ typedef struct T21 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T21 ;
 
/* value */ typedef struct T22 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T22 ;
 
/* value */ typedef struct T23 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T23 ;
 
/* value */ typedef struct T24 { 
struct RatePath THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T24 ;
 
/* class AppDemo */ typedef struct AppDemo { 
struct doubleRefArray1 /*value*/  /*const*/ expectedReturnRate ; 
struct doubleRefArray1 /*value*/  /*const*/ volatility ; 
struct doubleRefArray1 /*value*/  /*const*/ result ; 
struct Dist1 D ; 
struct ToTaskRefArray1 tasks ; 
struct ToInitAllTasks initAllTasks ; 
struct PriceStock *psMC ; 
double aExpectedReturnRateMC ; 
double aVolatilityMC ; 
int32_t nTimeStepsMC ; 
int32_t nRunsMC ; 
uint32_t initialised ; 
} AppDemo ; 

/* value */ typedef struct T19 { 
struct AppDemo THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T19 ;
 
/* value */ typedef struct T8 { 
struct AppDemo THIS /*this*/;
struct Region1 /*value*/  /*const*/ RX10_TEMP14 ; 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ToTaskStub *  /*const*/ RX10_TEMP6 ; 
} T8 ;
 
/* value */ typedef struct T7 { 
struct AppDemo THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T7 ;
 
/* value */ typedef struct T20 { 
struct AppDemo THIS /*this*/;
struct ToTaskStub /*value*/  /*const*/ RX10_TEMP19 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ToTaskStub *  /*const*/ RX10_TEMP6 ; 
} T20 ;
 
/* class CallAppDemo */ typedef struct CallAppDemo { 
struct AppDemo *ap ; 
} CallAppDemo ; 

enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18,ASYNC19,ASYNC20,ASYNC21,ASYNC22,ASYNC23};
void /*static*/Data1_fill (  struct doubleRefArray1 const d ) ;
int64_t /*static*/_Random_multiplier_init ( ) ;
int64_t /*static*/_Random_addend_init ( ) ;
int64_t /*static*/_Random_mask_init ( ) ;
int32_t /*static*/Random_nextbits (  struct Random  * const X10_TEMP0 , const int32_t bits ) ;
int32_t /*static*/Random_nextInt (  struct Random  * const X10_TEMP0 ) ;
int64_t /*static*/Random_nextLong (  struct Random  * const X10_TEMP0 ) ;
uint32_t /*static*/Random_nextBoolean (  struct Random  * const X10_TEMP0 ) ;
double /*static*/Random_nextDouble (  struct Random  * const X10_TEMP0 ) ;
double /*static*/Random_nextGaussian (  struct Random  * const X10_TEMP0 ) ;
double /*static*/ToInitAllTasks_getDTime (  struct ToInitAllTasks const X10_TEMP0 ) ;
int32_t /*static*/ToInitAllTasks_getReturnDefinition (  struct ToInitAllTasks const X10_TEMP0 ) ;
double /*static*/ToInitAllTasks_getExpectedReturnRate (  struct ToInitAllTasks const X10_TEMP0 ) ;
double /*static*/ToInitAllTasks_getVolatility (  struct ToInitAllTasks const X10_TEMP0 ) ;
int32_t /*static*/ToInitAllTasks_getNTimeSteps (  struct ToInitAllTasks const X10_TEMP0 ) ;
double /*static*/ToInitAllTasks_getPathStartValue (  struct ToInitAllTasks const X10_TEMP0 ) ;
char * /*static*/ToInitAllTasks_toString (  struct ToInitAllTasks const X10_TEMP0 ) ;
void /*static*/CallAppDemo_runiters (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/CallAppDemo_presults (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/CallAppDemo_go (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/CallAppDemo_init (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/CallAppDemo_kernel (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/CallAppDemo_validate (  struct CallAppDemo  * const X10_TEMP0 ) ;
void /*static*/Data6_fill (  struct doubleRefArray1 const d ) ;
void /*static*/AppDemo_runSerial (  struct AppDemo  * const X10_TEMP0 ) ;
void /*static*/AppDemo_presults (  struct AppDemo  * const X10_TEMP0 ) ;
void /*static*/AppDemo_processResults (  struct AppDemo  * const X10_TEMP0 ) ;
void /*static*/MonteCarloPath_computeFluctuationsGaussian (  struct MonteCarloPath  * const X10_TEMP0 , const int64_t seed ) ;
void /*static*/MonteCarloPath_computePathValue (  struct MonteCarloPath  * const X10_TEMP0 , const double startValue ) ;
double /*static*/MonteCarloPath_getDTime (  struct MonteCarloPath  * const X10_TEMP0 ) ;
doubleRefArray1 /*static*/MonteCarloPath_getPathValue (  struct MonteCarloPath  * const X10_TEMP0 ) ;
int32_t /*static*/MonteCarloPath_getNTimeSteps (  struct MonteCarloPath  * const X10_TEMP0 ) ;
void /*static*/MonteCarloPath_setDTime (  struct MonteCarloPath  * const X10_TEMP0 , const double d ) ;
void /*static*/MonteCarloPath_setReturnDefinition (  struct MonteCarloPath  * const X10_TEMP0 , const int32_t r ) ;
void /*static*/MonteCarloPath_setExpectedReturnRate (  struct MonteCarloPath  * const X10_TEMP0 , const double e ) ;
void /*static*/MonteCarloPath_setVolatility (  struct MonteCarloPath  * const X10_TEMP0 , const double v ) ;
void /*static*/MonteCarloPath_setNTimeSteps (  struct MonteCarloPath  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/MonteCarloPath_setPathStartValue (  struct MonteCarloPath  * const X10_TEMP0 , const double p ) ;
void /*static*/MonteCarloPath_setPathValue (  struct MonteCarloPath  * const X10_TEMP0 ,  struct doubleRefArray1 const p ) ;
void /*static*/MonteCarloPath_setFluctuations (  struct MonteCarloPath  * const X10_TEMP0 ,  struct doubleRefArray1 const f ) ;
void /*static*/Data3_fill (  struct doubleRefArray1 const d ) ;
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
int32_t /*static*/_ReturnPath_COMPOUNDED_init ( ) ;
int32_t /*static*/_ReturnPath_NONCOMPOUNDED_init ( ) ;
void /*static*/ReturnPath_setDTime (  struct ReturnPath  * const X10_TEMP0 , const double d ) ;
double /*static*/ReturnPath_getDTime (  struct ReturnPath  * const X10_TEMP0 ) ;
int32_t /*static*/ReturnPath_getReturnDefinition (  struct ReturnPath  * const X10_TEMP0 ) ;
double /*static*/ReturnPath_getExpectedReturnRate (  struct ReturnPath  * const X10_TEMP0 ) ;
double /*static*/ReturnPath_getVolatility (  struct ReturnPath  * const X10_TEMP0 ) ;
double /*static*/ReturnPath_getVolatility2 (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/ReturnPath_estimatePath (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/ReturnPath_computeMean (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/ReturnPath_computeVariance (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/ReturnPath_computeExpectedReturnRate (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/ReturnPath_computeVolatility (  struct ReturnPath  * const X10_TEMP0 ) ;
void /*static*/Data4_fill (  struct doubleRefArray1 const d ) ;
void /*static*/Data8_fill (  struct doubleRefArray1 const d ) ;
void /*static*/Data0_fill (  struct doubleRefArray1 const d ) ;
void /*static*/PriceStock_setInitAllTasks (  struct PriceStock  * const X10_TEMP0 ,  struct ToInitAllTasks const initAllTasks ) ;
void /*static*/PriceStock_setTask (  struct PriceStock  * const X10_TEMP0 ,  struct ToTask  * const task ) ;
void /*static*/PriceStock_run (  struct PriceStock  * const X10_TEMP0 ) ;
ToResult  * /*static*/PriceStock_getResult (  struct PriceStock  * const X10_TEMP0 ) ;
ReturnPath  * /*static*/RatePath_getReturnCompounded (  struct RatePath  * const X10_TEMP0 ) ;
double /*static*/RatePath_getEndPathValue (  struct RatePath  * const X10_TEMP0 ) ;
void /*static*/Data7_fill (  struct doubleRefArray1 const d ) ;
int64_t /*static*/ToTask_getRandomSeed (  struct ToTask  * const X10_TEMP0 ) ;
void /*static*/Data2_fill (  struct doubleRefArray1 const d ) ;
void /*static*/Data5_fill (  struct doubleRefArray1 const d ) ;
double /*static*/ToResult_getExpectedReturnRate (  struct ToResult  * const X10_TEMP0 ) ;
double /*static*/ToResult_getVolatility (  struct ToResult  * const X10_TEMP0 ) ;
double /*static*/ToResult_getVolatility2 (  struct ToResult  * const X10_TEMP0 ) ;
double /*static*/ToResult_getFinalStockPrice (  struct ToResult  * const X10_TEMP0 ) ;
doubleRefArray1 /*static*/ToResult_getPathValue (  struct ToResult  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
double /*static*/doublerefArraySum1 (  struct doubleRefArray1 const sumArray ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
ToTask  * /*static*/getRefArrayValue1ToTask (  struct ToTaskRefArray1 const array , const int32_t index ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
void /*static*/thread1 (  struct T1 const utmpz ) ;
void /*static*/thread2 (  struct T2 const utmpz ) ;
void /*static*/thread3 (  struct T3 const utmpz ) ;
void /*static*/thread4 (  struct T4 const utmpz ) ;
void /*static*/thread5 (  struct T5 const utmpz ) ;
void /*static*/thread6 (  struct T6 const utmpz ) ;
void /*static*/thread13 (  struct T13 const utmpz ) ;
void /*static*/thread14 (  struct T14 const utmpz ) ;
void /*static*/thread15 (  struct T15 const utmpz ) ;
void /*static*/thread16 (  struct T16 const utmpz ) ;
void /*static*/thread17 (  struct T17 const utmpz ) ;
void /*static*/thread18 (  struct T18 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS,  struct doubleRefArray1 const a_myvolatility ,  struct doubleRefArray1 const a_myexpectedReturnRate ,  struct ToTaskRefArray1 const a_mytasks ,  struct ToInitAllTasks const a_t ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_RX10_TEMP32 , const place_t a_RX10_TEMP28 , const int32_t a_RX10_TEMP27 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP26 ) ;

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 , const double a_initVal ) ;

T6 T6_T6 ( struct T6 *T6THIS,  struct doubleRefArray1 const a_localSumArray , const place_t a_source , const int32_t a_zero ,  struct doubleRefArray1 const a_sumArray ) ;

T7 T7_T7 ( struct T7 *T7THIS, struct AppDemo * AppDemoTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T8 T8_T8 ( struct T8 *T8THIS, struct AppDemo * AppDemoTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP14 , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ToTaskStub * const a_RX10_TEMP6 ) ;

T9 T9_T9 ( struct T9 *T9THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T10 T10_T10 ( struct T10 *T10THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T11 T11_T11 ( struct T11 *T11THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T12 T12_T12 ( struct T12 *T12THIS, struct RatePath * RatePathTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T13 T13_T13 ( struct T13 *T13THIS,  struct Point1 const a_i ,  struct doubleRefArray1 const a_myvolatility ,  struct doubleRefArray1 const a_myexpectedReturnRate ,  struct ToTaskRefArray1 const a_mytasks ,  struct ToInitAllTasks const a_t ) ;

T14 T14_T14 ( struct T14 *T14THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T15 T15_T15 ( struct T15 *T15THIS,  struct doubleStub const a_RX10_TEMP35 , const int32_t a_RX10_TEMP27 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP26 ) ;

T16 T16_T16 ( struct T16 *T16THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T17 T17_T17 ( struct T17 *T17THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T18 T18_T18 ( struct T18 *T18THIS, const double a_localSum , const int32_t a_index ,  struct doubleRefArray1 const a_localSumArray ) ;

T19 T19_T19 ( struct T19 *T19THIS, struct AppDemo * AppDemoTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T20 T20_T20 ( struct T20 *T20THIS, struct AppDemo * AppDemoTHIS /*this*/ ,  struct ToTaskStub const a_RX10_TEMP19 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ToTaskStub * const a_RX10_TEMP6 ) ;

T21 T21_T21 ( struct T21 *T21THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T22 T22_T22 ( struct T22 *T22THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T23 T23_T23 ( struct T23 *T23THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T24 T24_T24 ( struct T24 *T24THIS, struct RatePath * RatePathTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

PriceStock *PriceStock_PriceStock ( struct PriceStock *PriceStockTHIS) ;

RatePath *RatePath_RatePath_0( struct RatePath *RatePathTHIS) ;

RatePath *RatePath_RatePath_1( struct RatePath *RatePathTHIS,  struct MonteCarloPath  * const mc ) ;
void thread12 ( struct RatePath *RatePathTHIS,  struct T12 const utmpz ) ;
void thread24 ( struct RatePath *RatePathTHIS,  struct T24 const utmpz ) ;

ToInitAllTasks ToInitAllTasks_ToInitAllTasks ( struct ToInitAllTasks *ToInitAllTasksTHIS,  struct ReturnPath  * const r , const int32_t nts , const double psv ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

CallAppDemo *CallAppDemo_CallAppDemo ( struct CallAppDemo *CallAppDemoTHIS) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

ReturnPath *ReturnPath_ReturnPath ( struct ReturnPath *ReturnPathTHIS,  struct doubleRefArray1 const pv , const int32_t npv , const int32_t rd ) ;

ToTask *ToTask_ToTask ( struct ToTask *ToTaskTHIS, const int64_t rseed0 ) ;

ToTaskRefArray1 ToTaskRefArray1_ToTaskRefArray1 ( struct ToTaskRefArray1 *ToTaskRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct ToTaskStub * const contents_ ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread9 ( struct Timer *TimerTHIS,  struct T9 const utmpz ) ;
void thread10 ( struct Timer *TimerTHIS,  struct T10 const utmpz ) ;
void thread11 ( struct Timer *TimerTHIS,  struct T11 const utmpz ) ;
void thread21 ( struct Timer *TimerTHIS,  struct T21 const utmpz ) ;
void thread22 ( struct Timer *TimerTHIS,  struct T22 const utmpz ) ;
void thread23 ( struct Timer *TimerTHIS,  struct T23 const utmpz ) ;

ToResult *ToResult_ToResult ( struct ToResult *ToResultTHIS, const double e , const double v , const double v2 , const double f ,  struct doubleRefArray1 const p ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

AppDemo *AppDemo_AppDemo ( struct AppDemo *AppDemoTHIS, const int32_t nTimeStepsMC0 , const int32_t nRunsMC0 ) ;
doubleRefArray1 AppDemo_getDoubleArray ( struct AppDemo *AppDemoTHIS,  struct Dist1 const d ) ;
void AppDemo_initTasks ( struct AppDemo *AppDemoTHIS, const int32_t nRunsMC ,  struct Dist1 const aD ) ;
void thread7 ( struct AppDemo *AppDemoTHIS,  struct T7 const utmpz ) ;
void thread8 ( struct AppDemo *AppDemoTHIS,  struct T8 const utmpz ) ;
void thread19 ( struct AppDemo *AppDemoTHIS,  struct T19 const utmpz ) ;
void thread20 ( struct AppDemo *AppDemoTHIS,  struct T20 const utmpz ) ;
Data6* Data6_Data6(struct Data6 * Data6THIS);
;
Data7* Data7_Data7(struct Data7 * Data7THIS);
;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;
Data8* Data8_Data8(struct Data8 * Data8THIS);
;
Data2* Data2_Data2(struct Data2 * Data2THIS);
;
Data3* Data3_Data3(struct Data3 * Data3THIS);
;
Data4* Data4_Data4(struct Data4 * Data4THIS);
;
Data5* Data5_Data5(struct Data5 * Data5THIS);
;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;
Data0* Data0_Data0(struct Data0 * Data0THIS);
;
Data1* Data1_Data1(struct Data1 * Data1THIS);
;

Random *Random_Random ( struct Random *RandomTHIS, const int64_t rseed ) ;
void Random_setSeed ( struct Random *RandomTHIS, const int64_t rseed ) ;

ToTaskStub ToTaskStub_ToTaskStub ( struct ToTaskStub *ToTaskStubTHIS, /*Updatable ARRAY*/ struct ToTask * * const localArray_ ) ;
MonteCarloPath* MonteCarloPath_MonteCarloPath(struct MonteCarloPath * MonteCarloPathTHIS);
;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfToInitAllTasks( struct ToInitAllTasks * className);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfT24( struct T24 * className);
int32_t getSizeOfT23( struct T23 * className);
int32_t getSizeOfT22( struct T22 * className);
int32_t getSizeOfT21( struct T21 * className);
int32_t getSizeOfT20( struct T20 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfToTaskRefArray1( struct ToTaskRefArray1 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfT2( struct T2 * className);
int32_t getSizeOfT10( struct T10 * className);
int32_t getSizeOfT11( struct T11 * className);
int32_t getSizeOfT12( struct T12 * className);
int32_t getSizeOfT13( struct T13 * className);
int32_t getSizeOfT14( struct T14 * className);
int32_t getSizeOfDist( struct Dist * className);
int32_t getSizeOfT15( struct T15 * className);
int32_t getSizeOfT16( struct T16 * className);
int32_t getSizeOfT17( struct T17 * className);
int32_t getSizeOfT18( struct T18 * className);
int32_t getSizeOfT19( struct T19 * className);
int32_t getSizeOfToTaskStub( struct ToTaskStub * className);
void* deepCopyToInitAllTasks( struct ToInitAllTasks * className, void * offset);
void* deepCopydoubleStub( struct doubleStub * className, void * offset);
void* deepCopyT24( struct T24 * className, void * offset);
void* deepCopyT23( struct T23 * className, void * offset);
void* deepCopyT22( struct T22 * className, void * offset);
void* deepCopyT21( struct T21 * className, void * offset);
void* deepCopyT20( struct T20 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyToTaskRefArray1( struct ToTaskRefArray1 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
void* deepCopyT10( struct T10 * className, void * offset);
void* deepCopyT11( struct T11 * className, void * offset);
void* deepCopyT12( struct T12 * className, void * offset);
void* deepCopyT13( struct T13 * className, void * offset);
void* deepCopyT14( struct T14 * className, void * offset);
void* deepCopyDist( struct Dist * className, void * offset);
void* deepCopyT15( struct T15 * className, void * offset);
void* deepCopyT16( struct T16 * className, void * offset);
void* deepCopyT17( struct T17 * className, void * offset);
void* deepCopyT18( struct T18 * className, void * offset);
void* deepCopyT19( struct T19 * className, void * offset);
void* deepCopyToTaskStub( struct ToTaskStub * className, void * offset);
void * fixPointerToInitAllTasks( struct ToInitAllTasks * className, void * offset);
void * fixPointerdoubleStub( struct doubleStub * className, void * offset);
void * fixPointerT24( struct T24 * className, void * offset);
void * fixPointerT23( struct T23 * className, void * offset);
void * fixPointerT22( struct T22 * className, void * offset);
void * fixPointerT21( struct T21 * className, void * offset);
void * fixPointerT20( struct T20 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerToTaskRefArray1( struct ToTaskRefArray1 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
void * fixPointerT10( struct T10 * className, void * offset);
void * fixPointerT11( struct T11 * className, void * offset);
void * fixPointerT12( struct T12 * className, void * offset);
void * fixPointerT13( struct T13 * className, void * offset);
void * fixPointerT14( struct T14 * className, void * offset);
void * fixPointerDist( struct Dist * className, void * offset);
void * fixPointerT15( struct T15 * className, void * offset);
void * fixPointerT16( struct T16 * className, void * offset);
void * fixPointerT17( struct T17 * className, void * offset);
void * fixPointerT18( struct T18 * className, void * offset);
void * fixPointerT19( struct T19 * className, void * offset);
void * fixPointerToTaskStub( struct ToTaskStub * className, void * offset);
