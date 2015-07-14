typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* class Random */ typedef struct Random { 
int32_t iseed ; 
double v1 ; 
double v2 ; 
} Random ; 

/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct T10 { 
int32_t  /*const*/ RX10_TEMP74 ; 
place_t  /*const*/ RX10_TEMP70 ; 
int32_t  /*const*/ RX10_TEMP69 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP68 ; 
} T10 ;
 
/* value */ typedef struct ParticleStub { 
/*Updatable ARRAY*/ struct Particle * *  /*const*/ localArray ; 
} ParticleStub ;
 
/* value */ typedef struct T1 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct mdStub *  /*const*/ RX10_TEMP6 ; 
} T1 ;
 
/* value */ typedef struct T9 { 
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T9 ;
 
/* value */ typedef struct T8 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ParticleStub *  /*const*/ RX10_TEMP6 ; 
} T8 ;
 
/* value */ typedef struct T7 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ParticleStub *  /*const*/ RX10_TEMP6 ; 
} T7 ;
 
/* class Particle */ typedef struct Particle { 
double xcoord ; 
double ycoord ; 
double zcoord ; 
double xvelocity ; 
double yvelocity ; 
double zvelocity ; 
double xforce ; 
double yforce ; 
double zforce ; 
} Particle ; 

/* value */ typedef struct mdStub { 
/*Updatable ARRAY*/ struct md * *  /*const*/ localArray ; 
} mdStub ;
 
/* value */ typedef struct intStub { 
/*Updatable ARRAY*/ int32_t *  /*const*/ localArray ; 
} intStub ;
 
/* value */ typedef struct Point4 { 
int32_t  /*const*/ f0 ; 
int32_t  /*const*/ f1 ; 
int32_t  /*const*/ f2 ; 
int32_t  /*const*/ f3 ; 
} Point4 ;
 
/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T24 { 
int32_t  /*const*/ RX10_TEMP429 ; 
place_t  /*const*/ RX10_TEMP425 ; 
int32_t  /*const*/ RX10_TEMP424 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP423 ; 
} T24 ;
 
/* value */ typedef struct T26 { 
int32_t  /*const*/ RX10_TEMP622 ; 
place_t  /*const*/ RX10_TEMP618 ; 
int32_t  /*const*/ RX10_TEMP617 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP616 ; 
} T26 ;
 
/* value */ typedef struct Region4 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
int32_t  /*const*/ low1 ; 
int32_t  /*const*/ dim1 ; 
int32_t  /*const*/ low2 ; 
int32_t  /*const*/ dim2 ; 
int32_t  /*const*/ low3 ; 
int32_t  /*const*/ dim3 ; 
/*VALUE ARRAY*/ struct Point4 *  /*const*/ pointArray ; 
} Region4 ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct T19 { 
struct ParticleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ParticleStub *  /*const*/ RX10_TEMP6 ; 
} T19 ;
 
/* value */ typedef struct T18 { 
struct ParticleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct ParticleStub *  /*const*/ RX10_TEMP6 ; 
} T18 ;
 
/* value */ typedef struct T17 { 
struct mdStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct mdStub *  /*const*/ RX10_TEMP6 ; 
} T17 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct T31 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP432 ; 
int32_t  /*const*/ RX10_TEMP424 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP423 ; 
} T31 ;
 
/* value */ typedef struct T33 { 
struct intStub /*value*/  /*const*/ RX10_TEMP625 ; 
int32_t  /*const*/ RX10_TEMP617 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP616 ; 
} T33 ;
 
/* value */ typedef struct T20 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP57 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T20 ;
 
/* value */ typedef struct T21 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP77 ; 
int32_t  /*const*/ RX10_TEMP69 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP68 ; 
} T21 ;
 
/* value */ typedef struct intRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct intStub *  /*const*/ contents ; 
} intRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct ParticleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct ParticleStub *  /*const*/ contents ; 
} ParticleRefArray1 ;
 
/* value */ typedef struct mdRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct mdStub *  /*const*/ contents ; 
} mdRefArray1 ;
 
/* value */ typedef struct T12 { 
struct doubleRefArray1 /*value*/  /*const*/ dataI ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
struct Point1 /*value*/  /*const*/ j ; 
place_t  /*const*/ tHere ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T12 ;
 
/* value */ typedef struct T11 { 
struct Point1 /*value*/  /*const*/ k ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
struct Point1 /*value*/  /*const*/ j ; 
place_t  /*const*/ tHere ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T11 ;
 
/* value */ typedef struct T2 { 
struct Point1 /*value*/  /*const*/ j ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T2 ;
 
/* value */ typedef struct T3 { 
struct Point1 /*value*/  /*const*/ j ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T3 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* class md */ typedef struct md { 
struct ParticleRefArray1 one ; 
double epot ; 
double vir ; 
int32_t interactions ; 
double count ; 
int32_t mdsize ; 
double l ; 
double rcoff ; 
double rcoffs ; 
double side ; 
double sideh ; 
double hsq ; 
double hsq2 ; 
double a ; 
double tscale ; 
double sc ; 
double ekin ; 
double ek ; 
double vaver ; 
double vaverh ; 
double etot ; 
double temp ; 
double pres ; 
double rp ; 
int32_t npartm ; 
int32_t rnk ; 
int32_t nprocess ; 
} md ; 

/* value */ typedef struct T5 { 
struct Point1 /*value*/  /*const*/ j ; 
struct Point1 /*value*/  /*const*/ move ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T5 ;
 
/* value */ typedef struct T4 { 
struct Point1 /*value*/  /*const*/ j ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T4 ;
 
/* value */ typedef struct T6 { 
struct Point1 /*value*/  /*const*/ j ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T6 ;
 
/* value */ typedef struct T32 { 
double  /*const*/ zf ; 
double  /*const*/ yf ; 
double  /*const*/ xf ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
} T32 ;
 
/* value */ typedef struct T34 { 
int32_t  /*const*/ tinter ; 
double  /*const*/ tepot ; 
double  /*const*/ tvir ; 
struct intRefArray1 /*value*/  /*const*/ dataI ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
} T34 ;
 
/* value */ typedef struct T22 { 
double  /*const*/ fz ; 
double  /*const*/ fy ; 
double  /*const*/ fx ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
} T22 ;
 
/* value */ typedef struct T23 { 
int32_t  /*const*/ jinter ; 
double  /*const*/ jepot ; 
double  /*const*/ jvir ; 
struct doubleRefArray1 /*value*/  /*const*/ dataI ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
} T23 ;
 
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
struct Point1 /*value*/  /*const*/ j ; 
int32_t  /*const*/ mymdsize ; 
place_t  /*const*/ tHere ; 
struct md *  /*const*/ t ; 
struct mdRefArray1 /*value*/  /*const*/ P ; 
} T13 ;
 
/* value */ typedef struct T30 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T30 ;
 
/* value */ typedef struct T25 { 
struct Point1 /*value*/  /*const*/ k ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
place_t  /*const*/ pHere ; 
struct md *  /*const*/ t ; 
} T25 ;
 
/* value */ typedef struct T27 { 
struct intRefArray1 /*value*/  /*const*/ dataI ; 
struct doubleRefArray1 /*value*/  /*const*/ dataD ; 
place_t  /*const*/ pHere ; 
struct md *  /*const*/ t ; 
} T27 ;
 
/* value */ typedef struct T28 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T28 ;
 
/* value */ typedef struct T29 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T29 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18,ASYNC19,ASYNC20,ASYNC21,ASYNC22,ASYNC23,ASYNC24,ASYNC25,ASYNC26,ASYNC27,ASYNC28,ASYNC29,ASYNC30,ASYNC31,ASYNC32,ASYNC33};
int32_t /*static*/_md_ITERS_init ( ) ;
double /*static*/_md_LENGTH_init ( ) ;
double /*static*/_md_m_init ( ) ;
double /*static*/_md_mu_init ( ) ;
double /*static*/_md_kb_init ( ) ;
double /*static*/_md_TSIM_init ( ) ;
double /*static*/_md_deltat_init ( ) ;
double /*static*/_md_den_init ( ) ;
double /*static*/_md_tref_init ( ) ;
double /*static*/_md_h_init ( ) ;
int32_t /*static*/_md_irep_init ( ) ;
int32_t /*static*/_md_istop_init ( ) ;
int32_t /*static*/_md_iprint_init ( ) ;
int32_t /*static*/_md_movemx_init ( ) ;
void /*static*/md_exec ( ) ;
void /*static*/md_init (  struct Dist1 const D ,  struct mdRefArray1 const P ) ;
void /*static*/md_run (  struct Dist1 const D ,  struct mdRefArray1 const P ) ;
void /*static*/md_validate (  struct Dist1 const D ,  struct mdRefArray1 const P ) ;
void /*static*/md_initialise (  struct md  * const X10_TEMP0 , const int32_t rank0 , const int32_t nprocess0 ) ;
void /*static*/md_runiters1 (  struct md  * const X10_TEMP0 ) ;
void /*static*/md_runiters2 (  struct md  * const X10_TEMP0 ,  struct mdRefArray1 const P ) ;
void /*static*/md_runiters3 (  struct md  * const X10_TEMP0 , const int32_t move ) ;
void /*static*/md_allreduce (  struct md  * const X10_TEMP0 ,  struct mdRefArray1 const P ) ;
void /*static*/runMain ( ) ;
double /*static*/Random_update (  struct Random  * const X10_TEMP0 ) ;
double /*static*/Random_seed (  struct Random  * const X10_TEMP0 ) ;
void /*static*/Particle_domove (  struct Particle  * const X10_TEMP0 , const double side ) ;
void /*static*/Particle_force (  struct Particle  * const X10_TEMP0 , const double side , const double rcoff , const int32_t mdsize , const int32_t x ,  struct md  * const md1 ) ;
double /*static*/Particle_mkekin (  struct Particle  * const X10_TEMP0 , const double hsq2 ) ;
double /*static*/Particle_velavg (  struct Particle  * const X10_TEMP0 , const double vaverh , const double h ,  struct md  * const md1 ) ;
void /*static*/Particle_dscal (  struct Particle  * const X10_TEMP0 , const double sc , const int32_t incx ) ;
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
void /*static*/setRefArrayValue1Particle (  struct ParticleRefArray1 const array , const int32_t index ,  struct Particle  * const val ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
Point4 /*static*/regionOrdinalPoint4 (  struct Region4 const reg , const int32_t ordl ) ;
Point4 /*static*/regionOrdinalPointRegular4 (  struct Region4 const reg , const int32_t ordl ) ;
Point4 /*static*/regionOrdinalPointArbitrary4 (  struct Region4 const reg , const int32_t ordl ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
Particle  * /*static*/getRefArrayValue1Particle (  struct ParticleRefArray1 const array , const int32_t index ) ;
int32_t /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int32_t index ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
md  * /*static*/getRefArrayValue1md (  struct mdRefArray1 const array , const int32_t index ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int32_t index , const int32_t val ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
Region4 /*static*/createNewRegion4RRRR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 , const int32_t v3_0 , const int32_t v3_1 , const int32_t v4_0 , const int32_t v4_1 ) ;
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
void /*static*/thread26 (  struct T26 const utmpz ) ;
void /*static*/thread27 (  struct T27 const utmpz ) ;
void /*static*/thread31 (  struct T31 const utmpz ) ;
void /*static*/thread32 (  struct T32 const utmpz ) ;
void /*static*/thread33 (  struct T33 const utmpz ) ;
void /*static*/thread34 (  struct T34 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct mdStub * const a_RX10_TEMP6 ) ;

T2 T2_T2 ( struct T2 *T2THIS,  struct Point1 const a_j ,  struct mdRefArray1 const a_P ) ;

T3 T3_T3 ( struct T3 *T3THIS,  struct Point1 const a_j ,  struct mdRefArray1 const a_P ) ;

T4 T4_T4 ( struct T4 *T4THIS,  struct Point1 const a_j ,  struct mdRefArray1 const a_P ) ;

T5 T5_T5 ( struct T5 *T5THIS,  struct Point1 const a_j ,  struct Point1 const a_move ,  struct mdRefArray1 const a_P ) ;

T6 T6_T6 ( struct T6 *T6THIS,  struct Point1 const a_j ,  struct mdRefArray1 const a_P ) ;

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ParticleStub * const a_RX10_TEMP6 ) ;

T8 T8_T8 ( struct T8 *T8THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ParticleStub * const a_RX10_TEMP6 ) ;

T9 T9_T9 ( struct T9 *T9THIS, const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T10 T10_T10 ( struct T10 *T10THIS, const int32_t a_RX10_TEMP74 , const place_t a_RX10_TEMP70 , const int32_t a_RX10_TEMP69 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP68 ) ;

T11 T11_T11 ( struct T11 *T11THIS,  struct Point1 const a_k ,  struct doubleRefArray1 const a_dataD ,  struct Point1 const a_j , const place_t a_tHere ,  struct mdRefArray1 const a_P ) ;

T12 T12_T12 ( struct T12 *T12THIS,  struct doubleRefArray1 const a_dataI ,  struct doubleRefArray1 const a_dataD ,  struct Point1 const a_j , const place_t a_tHere ,  struct mdRefArray1 const a_P ) ;

T13 T13_T13 ( struct T13 *T13THIS,  struct Point1 const a_j , const int32_t a_mymdsize , const place_t a_tHere ,  struct md  * const a_t ,  struct mdRefArray1 const a_P ) ;

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T16 T16_T16 ( struct T16 *T16THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T17 T17_T17 ( struct T17 *T17THIS,  struct mdStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct mdStub * const a_RX10_TEMP6 ) ;

T18 T18_T18 ( struct T18 *T18THIS,  struct ParticleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ParticleStub * const a_RX10_TEMP6 ) ;

T19 T19_T19 ( struct T19 *T19THIS,  struct ParticleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct ParticleStub * const a_RX10_TEMP6 ) ;

T20 T20_T20 ( struct T20 *T20THIS,  struct doubleStub const a_RX10_TEMP57 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T21 T21_T21 ( struct T21 *T21THIS,  struct doubleStub const a_RX10_TEMP77 , const int32_t a_RX10_TEMP69 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP68 ) ;

T22 T22_T22 ( struct T22 *T22THIS, const double a_fz , const double a_fy , const double a_fx ,  struct doubleRefArray1 const a_dataD ) ;

T23 T23_T23 ( struct T23 *T23THIS, const int32_t a_jinter , const double a_jepot , const double a_jvir ,  struct doubleRefArray1 const a_dataI ,  struct doubleRefArray1 const a_dataD ) ;

T24 T24_T24 ( struct T24 *T24THIS, const int32_t a_RX10_TEMP429 , const place_t a_RX10_TEMP425 , const int32_t a_RX10_TEMP424 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP423 ) ;

T25 T25_T25 ( struct T25 *T25THIS,  struct Point1 const a_k ,  struct doubleRefArray1 const a_dataD , const place_t a_pHere ,  struct md  * const a_t ) ;

T26 T26_T26 ( struct T26 *T26THIS, const int32_t a_RX10_TEMP622 , const place_t a_RX10_TEMP618 , const int32_t a_RX10_TEMP617 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP616 ) ;

T27 T27_T27 ( struct T27 *T27THIS,  struct intRefArray1 const a_dataI ,  struct doubleRefArray1 const a_dataD , const place_t a_pHere ,  struct md  * const a_t ) ;

T28 T28_T28 ( struct T28 *T28THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T29 T29_T29 ( struct T29 *T29THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T30 T30_T30 ( struct T30 *T30THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T31 T31_T31 ( struct T31 *T31THIS,  struct doubleStub const a_RX10_TEMP432 , const int32_t a_RX10_TEMP424 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP423 ) ;

T32 T32_T32 ( struct T32 *T32THIS, const double a_zf , const double a_yf , const double a_xf ,  struct doubleRefArray1 const a_dataD ) ;

T33 T33_T33 ( struct T33 *T33THIS,  struct intStub const a_RX10_TEMP625 , const int32_t a_RX10_TEMP617 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP616 ) ;

T34 T34_T34 ( struct T34 *T34THIS, const int32_t a_tinter , const double a_tepot , const double a_tvir ,  struct intRefArray1 const a_dataI ,  struct doubleRefArray1 const a_dataD ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

mdStub mdStub_mdStub ( struct mdStub *mdStubTHIS, /*Updatable ARRAY*/ struct md * * const localArray_ ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) ;
void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) ;
void thread16 ( struct Timer *TimerTHIS,  struct T16 const utmpz ) ;
void thread28 ( struct Timer *TimerTHIS,  struct T28 const utmpz ) ;
void thread29 ( struct Timer *TimerTHIS,  struct T29 const utmpz ) ;
void thread30 ( struct Timer *TimerTHIS,  struct T30 const utmpz ) ;

Particle *Particle_Particle ( struct Particle *ParticleTHIS, const double xcoord0 , const double ycoord0 , const double zcoord0 , const double xvelocity0 , const double yvelocity0 , const double zvelocity0 , const double xforce0 , const double yforce0 , const double zforce0 ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

ParticleStub ParticleStub_ParticleStub ( struct ParticleStub *ParticleStubTHIS, /*Updatable ARRAY*/ struct Particle * * const localArray_ ) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

Region4 Region4_Region4_2( struct Region4 *Region4THIS, /*VALUE ARRAY*/ struct Point4 * const pointArray_ , const int32_t regSize_ ) ;

Region4 Region4_Region4_10( struct Region4 *Region4THIS, /*VALUE ARRAY*/ struct Point4 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ , const int32_t low2_ , const int32_t dim2_ , const int32_t low3_ , const int32_t dim3_ ) ;

intStub intStub_intStub ( struct intStub *intStubTHIS, /*Updatable ARRAY*/ int32_t * const localArray_ ) ;

Point4 Point4_Point4 ( struct Point4 *Point4THIS, const int32_t f0_ , const int32_t f1_ , const int32_t f2_ , const int32_t f3_ ) ;
md* md_md(struct md * mdTHIS);
;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

mdRefArray1 mdRefArray1_mdRefArray1 ( struct mdRefArray1 *mdRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct mdStub * const contents_ ) ;

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) ;

Random *Random_Random ( struct Random *RandomTHIS, const int32_t iseed0 , const double v10 , const double v20 ) ;

ParticleRefArray1 ParticleRefArray1_ParticleRefArray1 ( struct ParticleRefArray1 *ParticleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct ParticleStub * const contents_ ) ;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfRegion4( struct Region4 * className);
int32_t getSizeOfT29( struct T29 * className);
int32_t getSizeOfT28( struct T28 * className);
int32_t getSizeOfT27( struct T27 * className);
int32_t getSizeOfmdRefArray1( struct mdRefArray1 * className);
int32_t getSizeOfT26( struct T26 * className);
int32_t getSizeOfT25( struct T25 * className);
int32_t getSizeOfT24( struct T24 * className);
int32_t getSizeOfT23( struct T23 * className);
int32_t getSizeOfT22( struct T22 * className);
int32_t getSizeOfT21( struct T21 * className);
int32_t getSizeOfT20( struct T20 * className);
int32_t getSizeOfParticleRefArray1( struct ParticleRefArray1 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfintStub( struct intStub * className);
int32_t getSizeOfPoint4( struct Point4 * className);
int32_t getSizeOfT34( struct T34 * className);
int32_t getSizeOfT33( struct T33 * className);
int32_t getSizeOfT30( struct T30 * className);
int32_t getSizeOfT32( struct T32 * className);
int32_t getSizeOfT31( struct T31 * className);
int32_t getSizeOfmdStub( struct mdStub * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfintRefArray1( struct intRefArray1 * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfParticleStub( struct ParticleStub * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfT2( struct T2 * className);
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
void* deepCopyRegion4( struct Region4 * className, void * offset);
void* deepCopyT29( struct T29 * className, void * offset);
void* deepCopyT28( struct T28 * className, void * offset);
void* deepCopyT27( struct T27 * className, void * offset);
void* deepCopymdRefArray1( struct mdRefArray1 * className, void * offset);
void* deepCopyT26( struct T26 * className, void * offset);
void* deepCopyT25( struct T25 * className, void * offset);
void* deepCopyT24( struct T24 * className, void * offset);
void* deepCopyT23( struct T23 * className, void * offset);
void* deepCopyT22( struct T22 * className, void * offset);
void* deepCopyT21( struct T21 * className, void * offset);
void* deepCopyT20( struct T20 * className, void * offset);
void* deepCopyParticleRefArray1( struct ParticleRefArray1 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyintStub( struct intStub * className, void * offset);
void* deepCopyPoint4( struct Point4 * className, void * offset);
void* deepCopyT34( struct T34 * className, void * offset);
void* deepCopyT33( struct T33 * className, void * offset);
void* deepCopyT30( struct T30 * className, void * offset);
void* deepCopyT32( struct T32 * className, void * offset);
void* deepCopyT31( struct T31 * className, void * offset);
void* deepCopymdStub( struct mdStub * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyintRefArray1( struct intRefArray1 * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyParticleStub( struct ParticleStub * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
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
void * fixPointerRegion4( struct Region4 * className, void * offset);
void * fixPointerT29( struct T29 * className, void * offset);
void * fixPointerT28( struct T28 * className, void * offset);
void * fixPointerT27( struct T27 * className, void * offset);
void * fixPointermdRefArray1( struct mdRefArray1 * className, void * offset);
void * fixPointerT26( struct T26 * className, void * offset);
void * fixPointerT25( struct T25 * className, void * offset);
void * fixPointerT24( struct T24 * className, void * offset);
void * fixPointerT23( struct T23 * className, void * offset);
void * fixPointerT22( struct T22 * className, void * offset);
void * fixPointerT21( struct T21 * className, void * offset);
void * fixPointerT20( struct T20 * className, void * offset);
void * fixPointerParticleRefArray1( struct ParticleRefArray1 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerintStub( struct intStub * className, void * offset);
void * fixPointerPoint4( struct Point4 * className, void * offset);
void * fixPointerT34( struct T34 * className, void * offset);
void * fixPointerT33( struct T33 * className, void * offset);
void * fixPointerT30( struct T30 * className, void * offset);
void * fixPointerT32( struct T32 * className, void * offset);
void * fixPointerT31( struct T31 * className, void * offset);
void * fixPointermdStub( struct mdStub * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerintRefArray1( struct intRefArray1 * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerParticleStub( struct ParticleStub * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
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
