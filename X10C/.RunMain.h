typedef unsigned char byte;

#define calloc(m,n) GC_MALLOC((m)*(n))
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct Region1 { 
int  /*const*/ regRank ; 
int  /*const*/ regSize ; 
int  /*const*/ regType ; 
int  /*const*/ low0 ; 
int  /*const*/ dim0 ; 
/*Updatable ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct Dist { 
/*Updatable ARRAY*/ int *  /*const*/ placeArray ; 
/*Updatable ARRAY*/ int *  /*const*/ counts ; 
/*Updatable ARRAY*/ int *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct intStub { 
/*Updatable ARRAY*/ int *  /*const*/ localArray ; 
} intStub ;
 
/* value */ typedef struct Point1 { 
int  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct intRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ contents ; 
} intRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* class MR */ typedef struct MR { 
struct intRefArray1 a ; 
int total ; 
} MR ; 

/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

int /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
Region1 /*static*/_MR_r_init ( ) ;
void /*static*/MR_run (  struct MR  * const X10_TEMP0 ) ;
void /*static*/MR_map (  struct MR  * const X10_TEMP0 ) ;
int /*static*/MR_f (  struct MR  * const X10_TEMP0 , const int x ) ;
void /*static*/MR_reduce (  struct MR  * const X10_TEMP0 ) ;
int /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int index ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const int p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const int p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const int p ) ;
int /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int index , const double val ) ;
int /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int index ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) ;
int /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int index ) ;
int /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int placeIndex ) ;
int /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int ordl ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const int p ) ;
/*Updatable ARRAY*/ int * /*static*/initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) ;
void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int index , const int val ) ;
Region1 /*static*/createNewRegion1R ( const int v1_0 , const int v1_1 ) ;

Timer *Timer_Timer ( struct Timer *TimerTEMP) ;

MR *MR_MR ( struct MR *MRTEMP) ;

Region1 Region1_Region1_2( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 * const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) ;

Dist Dist_Dist ( struct Dist *DistTEMP, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTEMP, /*Updatable ARRAY*/ double * const localArray_ ) ;

intStub intStub_intStub ( struct intStub *intStubTEMP, /*Updatable ARRAY*/ int * const localArray_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1TEMP,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1TEMP, const int f0_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1TEMP,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct doubleStub * const contents_ ) ;

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1TEMP,  struct Dist1 const distValue_ , /*Updatable ARRAY*/ struct intStub * const contents_ ) ;
const double getTIME(); 
