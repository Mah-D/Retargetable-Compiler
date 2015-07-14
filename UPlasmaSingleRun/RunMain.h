typedef unsigned char byte;
/* value */ typedef struct Dist { 
/*Updatable ARRAY*/ int *  /*const*/ placeArray ; 
/*Updatable ARRAY*/ int *  /*const*/ counts ; 
/*Updatable ARRAY*/ int *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct Point2 { 
int  /*const*/ f0 ; 
int  /*const*/ f1 ; 
} Point2 ;
 
/* value */ typedef struct Point1 { 
int  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct T2 { 
int  /*const*/ RX10_TEMP40 ; 
int  /*const*/ RX10_TEMP36 ; 
int  /*const*/ RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP34 ; 
} T2 ;
 
/* value */ typedef struct Region2 { 
int  /*const*/ regRank ; 
int  /*const*/ regSize ; 
int  /*const*/ regType ; 
int  /*const*/ low0 ; 
int  /*const*/ dim0 ; 
int  /*const*/ low1 ; 
int  /*const*/ dim1 ; 
/*Updatable ARRAY*/ struct Point2 *  /*const*/ pointArray ; 
} Region2 ;
 
/* value */ typedef struct T1 { 
int  /*const*/ RX10_TEMP12 ; 
int  /*const*/ RX10_TEMP8 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T1 ;
 
/* value */ typedef struct Region1 { 
int  /*const*/ regRank ; 
int  /*const*/ regSize ; 
int  /*const*/ regType ; 
int  /*const*/ low0 ; 
int  /*const*/ dim0 ; 
/*Updatable ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T4 { 
int  /*const*/ RX10_TEMP12 ; 
int  /*const*/ RX10_TEMP8 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T4 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct T12 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T12 ;
 
/* value */ typedef struct T10 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP44 ; 
int  /*const*/ RX10_TEMP35 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP34 ; 
} T10 ;
 
/* value */ typedef struct Dist2 { 
struct Region2 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist2 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct T9 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T9 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct doubleRefArray2 { 
struct Dist2 /*value*/  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray2 ;
 
/* class Series */ typedef struct Series { 
int setsize ; 
int array_rows ; 
struct doubleRefArray2 testArray ; 
} Series ; 

/* value */ typedef struct T11 { 
double  /*const*/ temp ; 
struct doubleRefArray1 /*value*/  /*const*/ tempref ; 
} T11 ;
 
/* value */ typedef struct T3 { 
struct doubleRefArray2 /*value*/  /*const*/ tA ; 
struct doubleRefArray1 /*value*/  /*const*/ tempref ; 
int  /*const*/ curr_place ; 
int  /*const*/ jj ; 
int  /*const*/ ii ; 
} T3 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T15 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T15 ;
 
/* value */ typedef struct T14 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T14 ;
 
/* value */ typedef struct T13 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T13 ;
 
/* value */ typedef struct T8 { 
struct Timer THIS /*this*/;
int  /*const*/ RX10_TEMP54 ; 
int  /*const*/ RX10_TEMP50 ; 
int  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T8 ;
 
/* value */ typedef struct T5 { 
struct Point1 /*value*/  /*const*/ p ; 
struct doubleRefArray2 /*value*/  /*const*/ tA ; 
struct Dist1 /*value*/  /*const*/ U ; 
double  /*const*/ omega ; 
struct Series *  /*const*/ X10_TEMP0 ; 
} T5 ;
 
/* value */ typedef struct T7 { 
struct Timer THIS /*this*/;
int  /*const*/ RX10_TEMP33 ; 
int  /*const*/ RX10_TEMP29 ; 
int  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T7 ;
 
/* value */ typedef struct T6 { 
struct Timer THIS /*this*/;
int  /*const*/ RX10_TEMP12 ; 
int  /*const*/ RX10_TEMP8 ; 
int  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T6 ;
 
void /*static*/Series_setSize (  struct Series  * const X10_TEMP0 , const int setsize ) ;
void /*static*/Series_initialise (  struct Series  * const X10_TEMP0 , const int n ) ;
void /*static*/Series_kernel (  struct Series  * const X10_TEMP0 ) ;
void /*static*/Series_initRefArray (  struct Series  * const X10_TEMP0 ,  struct doubleRefArray2 const ref ) ;
void /*static*/Series_validate (  struct Series  * const X10_TEMP0 ) ;
void /*static*/Series_tidyup (  struct Series  * const X10_TEMP0 ) ;
void /*static*/Series_run (  struct Series  * const X10_TEMP0 ) ;
void /*static*/Series_buildTestData (  struct Series  * const X10_TEMP0 ) ;
void /*static*/Series_Do (  struct Series  * const X10_TEMP0 ) ;
double /*static*/Series_TrapezoidIntegrate (  struct Series  * const X10_TEMP0 , const double x0 , const double x1 , const int a_nsteps , const double omegan , const int select ) ;
double /*static*/Series_thefunction (  struct Series  * const X10_TEMP0 , const double x , const double omegan , const int select ) ;
void /*static*/Series_freeTestData (  struct Series  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
int /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
int /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int placeIndex ) ;
int /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
/*Updatable ARRAY*/ int * /*static*/initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) ;
int /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const int p ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int index ) ;
int /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) ;
int /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int placeIndex ) ;
int /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Dist2 /*static*/restrictDist2 (  struct Dist2 const dn , const int p ) ;
Dist2 /*static*/restrictDistRegular2 (  struct Dist2 const d , const int p ) ;
Dist2 /*static*/restrictDistArbitrary2 (  struct Dist2 const d , const int p ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const int p ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int ordl ) ;
int /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int index ) ;
int /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int index ) ;
int /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue2double (  struct doubleRefArray2 const array , const int index ) ;
Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int ordl ) ;
Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int ordl ) ;
Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int ordl ) ;
void /*static*/setRefArrayValue2double (  struct doubleRefArray2 const array , const int index , const double val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int index , const double val ) ;
Dist2 /*static*/getBlockDist2 (  struct Region2 const r ) ;
Region2 /*static*/createNewRegion2RR ( const int v1_0 , const int v1_1 , const int v2_0 , const int v2_1 ) ;
Region1 /*static*/createNewRegion1R ( const int v1_0 , const int v1_1 ) ;
void /*static*/thread1 (  struct T1 const utmpz ) ;
void /*static*/thread2 (  struct T2 const utmpz ) ;
void /*static*/thread3 (  struct T3 const utmpz ) ;
void /*static*/thread4 (  struct T4 const utmpz ) ;
void /*static*/thread5 (  struct T5 const utmpz ) ;
void /*static*/thread9 (  struct T9 const utmpz ) ;
void /*static*/thread10 (  struct T10 const utmpz ) ;
void /*static*/thread11 (  struct T11 const utmpz ) ;
void /*static*/thread12 (  struct T12 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int a_RX10_TEMP40 , const int a_RX10_TEMP36 , const int a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) ;

T3 T3_T3 ( struct T3 *T3THIS,  struct doubleRefArray2 const a_tA ,  struct doubleRefArray1 const a_tempref , const int a_curr_place , const int a_jj , const int a_ii ) ;

T4 T4_T4 ( struct T4 *T4THIS, const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T5 T5_T5 ( struct T5 *T5THIS,  struct Point1 const a_p ,  struct doubleRefArray2 const a_tA ,  struct Dist1 const a_U , const double a_omega ,  struct Series  * const a_X10_TEMP0 ) ;

T6 T6_T6 ( struct T6 *T6THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP12 , const int a_RX10_TEMP8 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T7 T7_T7 ( struct T7 *T7THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP33 , const int a_RX10_TEMP29 , const int a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T8 T8_T8 ( struct T8 *T8THIS, struct Timer * TimerTHIS /*this*/ , const int a_RX10_TEMP54 , const int a_RX10_TEMP50 , const int a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T9 T9_T9 ( struct T9 *T9THIS,  struct doubleStub const a_RX10_TEMP16 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T10 T10_T10 ( struct T10 *T10THIS,  struct doubleStub const a_RX10_TEMP44 , const int a_RX10_TEMP35 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP34 ) ;

T11 T11_T11 ( struct T11 *T11THIS, const double a_temp ,  struct doubleRefArray1 const a_tempref ) ;

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleStub const a_RX10_TEMP15 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T13 T13_T13 ( struct T13 *T13THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread6 ( struct Timer *TimerTHIS,  struct T6 const utmpz ) ;
void thread7 ( struct Timer *TimerTHIS,  struct T7 const utmpz ) ;
void thread8 ( struct Timer *TimerTHIS,  struct T8 const utmpz ) ;
void thread13 ( struct Timer *TimerTHIS,  struct T13 const utmpz ) ;
void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) ;
void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) ;

Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*Updatable ARRAY*/ struct Point2 * const pointArray_ , const int regSize_ ) ;

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*Updatable ARRAY*/ struct Point2 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ , const int low1_ , const int dim1_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int f0_ ) ;

doubleRefArray2 doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2THIS,  struct Dist2 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) ;

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

Series *Series_Series ( struct Series *SeriesTHIS) ;

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int f0_ , const int f1_ ) ;
const double getTIME(); 
