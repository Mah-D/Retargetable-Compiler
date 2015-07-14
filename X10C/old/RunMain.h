typedef unsigned char byte;
/* class Random */ typedef struct Random { 
long long seed ; 
} Random ; 

/* class SOR */ typedef struct SOR { 
struct Random *R ; 
} SOR ; 

/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 *start_time ; 
struct doubleRefArray1 *elapsed_time ; 
struct doubleRefArray1 *total_time ; 
} Timer ; 

/* value */ typedef struct Dist { 
/*Updatable ARRAY*/ int *  /*const*/ placeArray ; 
/*Updatable ARRAY*/ int *  /*const*/ counts ; 
/*Updatable ARRAY*/ int *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct Region2 { 
int  /*const*/ regRank ; 
int  /*const*/ regSize ; 
int  /*const*/ regType ; 
int  /*const*/ low0 ; 
int  /*const*/ dim0 ; 
int  /*const*/ low1 ; 
int  /*const*/ dim1 ; 
/*Updatable ARRAY*/ struct Point2 **  /*const*/ pointArray ; 
} Region2 ;
 
/* value */ typedef struct Point1 { 
int  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct Region1 { 
int  /*const*/ regRank ; 
int  /*const*/ regSize ; 
int  /*const*/ regType ; 
int  /*const*/ low0 ; 
int  /*const*/ dim0 ; 
/*Updatable ARRAY*/ struct Point1 **  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct Point2 { 
int  /*const*/ f0 ; 
int  /*const*/ f1 ; 
} Point2 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 *  /*const*/ dReg ; 
struct Dist *  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct Dist2 { 
struct Region2 *  /*const*/ dReg ; 
struct Dist *  /*const*/ dDist ; 
} Dist2 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 *  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct doubleStub **  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct doubleRefArray2 { 
struct Dist2 *  /*const*/ distValue ; 
/*Updatable ARRAY*/ struct doubleStub **  /*const*/ contents ; 
} doubleRefArray2 ;
 
long long _Random_multiplier_init ( ) ;
long long _Random_addend_init ( ) ;
long long _Random_mask_init ( ) ;
int Random_nextbits (  struct Random  * const X10_TEMP0 , const int bits ) ;
int Random_nextInt (  struct Random  * const X10_TEMP0 ) ;
long long Random_nextLong (  struct Random  * const X10_TEMP0 ) ;
int Random_nextBoolean (  struct Random  * const X10_TEMP0 ) ;
double Random_nextDouble (  struct Random  * const X10_TEMP0 ) ;
void runMain ( ) ;
int _SOR_JACOBI_NUM_ITER_init ( ) ;
long long _SOR_RANDOM_SEED_init ( ) ;
void SOR_run (  struct SOR  * const X10_TEMP0 ) ;
double SOR_kernel (  struct SOR  * const X10_TEMP0 ) ;
doubleRefArray2  * SOR_RandomMatrix (  struct SOR  * const X10_TEMP0 , const int M , const int N ,  struct Random  * const R ) ;
void SOR_write (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2  * const t ,  struct Point2  * const p , const double v ) ;
Dist2  * SOR_blockStar (  struct SOR  * const X10_TEMP0 ,  struct Region1  * const r1 ,  struct Region1  * const r2 ) ;
Dist2  * SOR_distTimesRegion (  struct SOR  * const X10_TEMP0 ,  struct Dist1  * const d ,  struct Region1  * const r ) ;
void SOR_validate (  struct SOR  * const X10_TEMP0 , const double gtotal ) ;
double SOR_read (  struct SOR  * const X10_TEMP0 ,  struct doubleRefArray2  * const G ,  struct Point2  * const pt ) ;
double SOR_SORrun (  struct SOR  * const X10_TEMP0 , const double omega ,  struct doubleRefArray2  * const G , const int num_iterations ) ;
int _Timer_max_counters_init ( ) ;
void Timer_start (  struct Timer  * const X10_TEMP0 , const int n ) ;
void Timer_stop (  struct Timer  * const X10_TEMP0 , const int n ) ;
double Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int n ) ;
void Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
double doublerefArraySum2 (  struct doubleRefArray2  * const sumArray ) ;
int constantSearchRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) ;
void setRefArrayValue2double (  struct doubleRefArray2  * const array , const int index , const double val ) ;
int constantSearchRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) ;
int binarySearchRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) ;
int binarySearchRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) ;
void setRefArrayValue1double (  struct doubleRefArray1  * const array , const int index , const double val ) ;
Dist1  * getUniqueDist ( ) ;
int getPlaceFromDist1 (  struct Dist1  * const dn , const int index ) ;
int getPlaceFromDist2 (  struct Dist2  * const dn , const int index ) ;
int comparePoint1 (  struct Point1  * const pt1 ,  struct Point1  * const pt2 ) ;
int comparePoint2 (  struct Point2  * const pt1 ,  struct Point2  * const pt2 ) ;
Region1  * getRank2 (  struct Region2  * const r , const int dim ) ;
Region1  * getRankArbitrary2 (  struct Region2  * const r , const int dim ) ;
Region1  * getRankRegular2 (  struct Region2  * const r , const int dim ) ;
Point2  * regionOrdinalPoint2 (  struct Region2  * const reg , const int ordl ) ;
Point2  * regionOrdinalPointRegular2 (  struct Region2  * const reg , const int ordl ) ;
Point2  * regionOrdinalPointArbitrary2 (  struct Region2  * const reg , const int ordl ) ;
Point1  * regionOrdinalPoint1 (  struct Region1  * const reg , const int ordl ) ;
Point1  * regionOrdinalPointRegular1 (  struct Region1  * const reg , const int ordl ) ;
Point1  * regionOrdinalPointArbitrary1 (  struct Region1  * const reg , const int ordl ) ;
double getRefArrayValue1double (  struct doubleRefArray1  * const array , const int index ) ;
Dist1  * restrictDist1 (  struct Dist1  * const dn , const int p ) ;
Dist1  * restrictDistRegular1 (  struct Dist1  * const d , const int p ) ;
Dist1  * restrictDistArbitrary1 (  struct Dist1  * const d , const int p ) ;
Dist1  * getBlockDist1 (  struct Region1  * const r ) ;
Dist2  * unionDist2 (  struct Dist2  * const d1 ,  struct Dist2  * const d2 ) ;
void getCyclic ( /*Updatable ARRAY*/ int * const placeArray , const int arraySize , const int initPlace , const int blockSize ) ;
int getDistLocalCount2 (  struct Dist2  * const dn , const int placeIndex ) ;
int getDistLocalCount1 (  struct Dist1  * const dn , const int placeIndex ) ;
int searchPointInRegion2 (  struct Region2  * const r ,  struct Point2  * const target ) ;
int searchPointInRegion1 (  struct Region1  * const r ,  struct Point1  * const target ) ;
double getRefArrayValue2double (  struct doubleRefArray2  * const array , const int index ) ;
Dist2  * getPlaceDist2 (  struct Region2  * const r , const int p ) ;
Dist1  * getPlaceDist1 (  struct Region1  * const r , const int p ) ;
Dist2  * restrictDist2 (  struct Dist2  * const dn , const int p ) ;
Dist2  * restrictDistRegular2 (  struct Dist2  * const d , const int p ) ;
Dist2  * restrictDistArbitrary2 (  struct Dist2  * const d , const int p ) ;
/*Updatable ARRAY*/ int * initDist ( /*Updatable ARRAY*/ int * const tempArr , const int tempReg ) ;
Region1  * createNewRegion1R ( const int v1_0 , const int v1_1 ) ;
Region2  * createNewRegion2RR ( const int v1_0 , const int v1_1 , const int v2_0 , const int v2_1 ) ;
Region2  * createNewRegion2AA (  struct Region1  * const v1_0 ,  struct Region1  * const v2_0 ) ;

Random * Random_Random ( struct Random *RandomTEMP, const long long rseed ) ;
void Random_setSeed ( struct Random *RandomTEMP, const long long rseed ) ;

SOR * SOR_SOR ( struct SOR *SORTEMP) ;

Timer * Timer_Timer ( struct Timer *TimerTEMP) ;

Dist * Dist_Dist ( struct Dist *DistTEMP, /*Updatable ARRAY*/ int * const vPlaceArray , const int arraySize ) ;

Region2 * Region2_Region2_2( struct Region2 *Region2TEMP, /*Updatable ARRAY*/ struct Point2 ** const pointArray_ , const int regSize_ ) ;

Region2 * Region2_Region2_6( struct Region2 *Region2TEMP, /*Updatable ARRAY*/ struct Point2 ** const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ , const int low1_ , const int dim1_ ) ;

Point1 * Point1_Point1 ( struct Point1 *Point1TEMP, const int f0_ ) ;

doubleStub * doubleStub_doubleStub ( struct doubleStub *doubleStubTEMP, /*Updatable ARRAY*/ double * const localArray_ ) ;

Region1 * Region1_Region1_2( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 ** const pointArray_ , const int regSize_ ) ;

Region1 * Region1_Region1_4( struct Region1 *Region1TEMP, /*Updatable ARRAY*/ struct Point1 ** const pointArray_ , const int regSize_ , const int low0_ , const int dim0_ ) ;

Point2 * Point2_Point2 ( struct Point2 *Point2TEMP, const int f0_ , const int f1_ ) ;

Dist1 * Dist1_Dist1 ( struct Dist1 *Dist1TEMP,  struct Region1  * const dReg_ ,  struct Dist  * const dDist_ ) ;

Dist2 * Dist2_Dist2 ( struct Dist2 *Dist2TEMP,  struct Region2  * const dReg_ ,  struct Dist  * const dDist_ ) ;

doubleRefArray1 * doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1TEMP,  struct Dist1  * const distValue_ , /*Updatable ARRAY*/ struct doubleStub ** const contents_ ) ;

doubleRefArray2 * doubleRefArray2_doubleRefArray2 ( struct doubleRefArray2 *doubleRefArray2TEMP,  struct Dist2  * const distValue_ , /*Updatable ARRAY*/ struct doubleStub ** const contents_ ) ;
const double getTIME(); 
