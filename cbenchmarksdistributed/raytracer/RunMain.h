typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* value */ typedef struct longStub { 
/*Updatable ARRAY*/ int64_t *  /*const*/ localArray ; 
} longStub ;
 
/* value */ typedef struct T18 { 
int32_t  /*const*/ RX10_TEMP27 ; 
place_t  /*const*/ RX10_TEMP23 ; 
int32_t  /*const*/ RX10_TEMP22 ; 
/*Updatable ARRAY*/ struct LightStub *  /*const*/ RX10_TEMP21 ; 
} T18 ;
 
/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct T2 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub *  /*const*/ RX10_TEMP6 ; 
} T2 ;
 
/* value */ typedef struct T1 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T1 ;
 
/* value */ typedef struct LightStub { 
/*Updatable ARRAY*/ struct Light *  /*const*/ localArray ; 
} LightStub ;
 
/* value */ typedef struct T9 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct VecStub *  /*const*/ RX10_TEMP6 ; 
} T9 ;
 
/* value */ typedef struct T5 { 
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct longStub *  /*const*/ RX10_TEMP27 ; 
} T5 ;
 
/* value */ typedef struct T4 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T4 ;
 
/* value */ typedef struct T7 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T7 ;
 
/* value */ typedef struct Interval { 
int32_t  /*const*/ number ; 
int32_t  /*const*/ width ; 
int32_t  /*const*/ height ; 
int32_t  /*const*/ yfrom ; 
int32_t  /*const*/ yto ; 
int32_t  /*const*/ total ; 
} Interval ;
 
/* value */ typedef struct SphereStub { 
/*Updatable ARRAY*/ struct Sphere *  /*const*/ localArray ; 
} SphereStub ;
 
/* value */ typedef struct intStub { 
/*Updatable ARRAY*/ int32_t *  /*const*/ localArray ; 
} intStub ;
 
/* value */ typedef struct Point3 { 
int32_t  /*const*/ f0 ; 
int32_t  /*const*/ f1 ; 
int32_t  /*const*/ f2 ; 
} Point3 ;
 
/* value */ typedef struct Point1 { 
int32_t  /*const*/ f0 ; 
} Point1 ;
 
/* value */ typedef struct Region3 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
int32_t  /*const*/ low1 ; 
int32_t  /*const*/ dim1 ; 
int32_t  /*const*/ low2 ; 
int32_t  /*const*/ dim2 ; 
/*VALUE ARRAY*/ struct Point3 *  /*const*/ pointArray ; 
} Region3 ;
 
/* value */ typedef struct Region1 { 
int32_t  /*const*/ regRank ; 
int32_t  /*const*/ regSize ; 
uint32_t  /*const*/ regType ; 
int32_t  /*const*/ low0 ; 
int32_t  /*const*/ dim0 ; 
/*VALUE ARRAY*/ struct Point1 *  /*const*/ pointArray ; 
} Region1 ;
 
/* value */ typedef struct T20 { 
int32_t  /*const*/ RX10_TEMP79 ; 
place_t  /*const*/ RX10_TEMP75 ; 
int32_t  /*const*/ RX10_TEMP74 ; 
/*Updatable ARRAY*/ struct SphereStub *  /*const*/ RX10_TEMP73 ; 
} T20 ;
 
/* value */ typedef struct VecStub { 
/*Updatable ARRAY*/ struct Vec *  /*const*/ localArray ; 
} VecStub ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* value */ typedef struct Vec { 
double  /*const*/ x ; 
double  /*const*/ y ; 
double  /*const*/ z ; 
uint32_t  /*const*/ isNull ; 
} Vec ;
 
/* value */ typedef struct T17 { 
struct longStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct longStub *  /*const*/ RX10_TEMP6 ; 
} T17 ;
 
/* value */ typedef struct T16 { 
struct intStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T16 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct SphereValArray1 { 
struct Region1 /*value*/  /*const*/ regionValue ; 
/*VALUE ARRAY*/ struct Sphere *  /*const*/ contents ; 
} SphereValArray1 ;
 
/* value */ typedef struct View { 
struct Vec /*value*/  /*const*/ from ; 
struct Vec /*value*/  /*const*/ att ; 
struct Vec /*value*/  /*const*/ up ; 
double  /*const*/ distance ; 
double  /*const*/ angle ; 
double  /*const*/ aspect ; 
} View ;
 
/* value */ typedef struct T36 { 
struct SphereStub /*value*/  /*const*/ RX10_TEMP82 ; 
int32_t  /*const*/ RX10_TEMP74 ; 
/*Updatable ARRAY*/ struct SphereStub *  /*const*/ RX10_TEMP73 ; 
} T36 ;
 
/* value */ typedef struct T34 { 
struct LightStub /*value*/  /*const*/ RX10_TEMP30 ; 
int32_t  /*const*/ RX10_TEMP22 ; 
/*Updatable ARRAY*/ struct LightStub *  /*const*/ RX10_TEMP21 ; 
} T34 ;
 
/* class Ray */ typedef struct Ray { 
struct Vec p ; 
struct Vec d ; 
} Ray ; 

/* value */ typedef struct LightValArray1 { 
struct Region1 /*value*/  /*const*/ regionValue ; 
/*VALUE ARRAY*/ struct Light *  /*const*/ contents ; 
} LightValArray1 ;
 
/* value */ typedef struct T22 { 
struct intStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T22 ;
 
/* value */ typedef struct T23 { 
struct longStub /*value*/  /*const*/ RX10_TEMP36 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct longStub *  /*const*/ RX10_TEMP27 ; 
} T23 ;
 
/* value */ typedef struct Light { 
struct Vec /*value*/  /*const*/ pos ; 
double  /*const*/ brightness ; 
} Light ;
 
/* value */ typedef struct T25 { 
struct intStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct intStub *  /*const*/ RX10_TEMP6 ; 
} T25 ;
 
/* value */ typedef struct Surface { 
struct Vec /*value*/  /*const*/ color ; 
double  /*const*/ kd ; 
double  /*const*/ ks ; 
double  /*const*/ shine ; 
double  /*const*/ kt ; 
double  /*const*/ ior ; 
uint32_t  /*const*/ isNull ; 
} Surface ;
 
/* value */ typedef struct T27 { 
struct VecStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct VecStub *  /*const*/ RX10_TEMP6 ; 
} T27 ;
 
/* value */ typedef struct SphereRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct SphereStub *  /*const*/ contents ; 
} SphereRefArray1 ;
 
/* value */ typedef struct LightRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct LightStub *  /*const*/ contents ; 
} LightRefArray1 ;
 
/* value */ typedef struct intRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct intStub *  /*const*/ contents ; 
} intRefArray1 ;
 
/* value */ typedef struct longRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct longStub *  /*const*/ contents ; 
} longRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct Sphere { 
struct Vec /*value*/  /*const*/ c ; 
double  /*const*/ r ; 
double  /*const*/ r2 ; 
struct Surface /*value*/  /*const*/ surf ; 
} Sphere ;
 
/* value */ typedef struct VecRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct VecStub *  /*const*/ contents ; 
} VecRefArray1 ;
 
/* class Isect */ typedef struct Isect { 
double t ; 
int32_t enter ; 
struct Sphere prim ; 
struct Surface surf ; 
uint32_t isNull ; 
} Isect ; 

/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T35 { 
struct Light /*value*/  /*const*/ tempLight ; 
struct LightRefArray1 /*value*/  /*const*/ temp ; 
} T35 ;
 
/* value */ typedef struct T37 { 
struct Sphere /*value*/  /*const*/ tempObject ; 
struct SphereRefArray1 /*value*/  /*const*/ temp1 ; 
} T37 ;
 
/* class Scene */ typedef struct Scene { 
struct LightRefArray1 /*value*/  /*const*/ lights ; 
struct SphereRefArray1 /*value*/  /*const*/ objects ; 
struct View /*value*/  /*const*/ view ; 
int32_t lightCount ; 
int32_t objectCount ; 
} Scene ; 

/* value */ typedef struct T19 { 
struct Point1 /*value*/  /*const*/ temp_l ; 
struct LightRefArray1 /*value*/  /*const*/ temp ; 
place_t  /*const*/ pHere ; 
struct Scene *  /*const*/ sc ; 
} T19 ;
 
/* value */ typedef struct T15 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T15 ;
 
/* value */ typedef struct T14 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T14 ;
 
/* value */ typedef struct T13 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T13 ;
 
/* value */ typedef struct T12 { 
struct Scene THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct SphereStub *  /*const*/ RX10_TEMP6 ; 
} T12 ;
 
/* value */ typedef struct T11 { 
struct Scene THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LightStub *  /*const*/ RX10_TEMP6 ; 
} T11 ;
 
/* class RayTracer */ typedef struct RayTracer { 
struct Scene *scene ; 
int32_t lightCount ; 
int32_t objCount ; 
struct LightValArray1 lights ; 
struct SphereValArray1 prim ; 
struct View view ; 
int32_t height ; 
int32_t width ; 
struct intRefArray1 datasizes ; 
int64_t checksum ; 
struct longRefArray1 checkSumArray ; 
int32_t sizet ; 
int32_t numobjects ; 
} RayTracer ; 

/* value */ typedef struct T31 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T31 ;
 
/* value */ typedef struct T32 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T32 ;
 
/* value */ typedef struct T30 { 
struct Scene THIS /*this*/;
struct SphereStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct SphereStub *  /*const*/ RX10_TEMP6 ; 
} T30 ;
 
/* value */ typedef struct T33 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T33 ;
 
/* value */ typedef struct T21 { 
struct Point1 /*value*/  /*const*/ temp_o ; 
struct SphereRefArray1 /*value*/  /*const*/ temp1 ; 
place_t  /*const*/ pHere ; 
struct Scene *  /*const*/ sc ; 
} T21 ;
 
/* value */ typedef struct T26 { 
struct SphereValArray1 /*value*/  /*const*/ tempprim ; 
int32_t  /*const*/ tempobjCount ; 
struct intRefArray1 /*value*/  /*const*/ temp ; 
struct Isect *  /*const*/ inter ; 
struct Ray *  /*const*/ r ; 
} T26 ;
 
/* value */ typedef struct T29 { 
struct Scene THIS /*this*/;
struct LightStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LightStub *  /*const*/ RX10_TEMP6 ; 
} T29 ;
 
/* value */ typedef struct T10 { 
struct VecRefArray1 /*value*/  /*const*/ temp ; 
place_t  /*const*/ h ; 
struct Vec /*value*/  /*const*/ bigr ; 
struct Surface /*value*/  /*const*/ surf ; 
struct Ray *  /*const*/ tRay ; 
struct Isect *  /*const*/ hit ; 
struct Vec /*value*/  /*const*/ N ; 
struct Vec /*value*/  /*const*/ P ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T10 ;
 
/* value */ typedef struct T3 { 
int32_t  /*const*/ myobjCount ; 
int32_t  /*const*/ mylightCount ; 
struct Scene *  /*const*/ sc ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T3 ;
 
/* value */ typedef struct T8 { 
struct intRefArray1 /*value*/  /*const*/ temp ; 
place_t  /*const*/ h ; 
struct Isect *  /*const*/ inter ; 
struct Ray *  /*const*/ r ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T8 ;
 
/* value */ typedef struct T6 { 
struct Point1 /*value*/  /*const*/ pl ; 
struct View /*value*/  /*const*/ myview ; 
place_t  /*const*/ fp ; 
struct Dist1 /*value*/  /*const*/ DBlock ; 
struct Interval /*value*/  /*const*/ interval ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T6 ;
 
/* value */ typedef struct T24 { 
int64_t  /*const*/ checksumx ; 
struct Point1 /*value*/  /*const*/ pl ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T24 ;
 
/* value */ typedef struct T28 { 
struct LightValArray1 /*value*/  /*const*/ templights ; 
int32_t  /*const*/ templightCount ; 
struct VecRefArray1 /*value*/  /*const*/ temp ; 
struct Vec /*value*/  /*const*/ bigr ; 
struct Surface /*value*/  /*const*/ surf ; 
struct Ray *  /*const*/ tRay ; 
struct Isect *  /*const*/ hit ; 
struct Vec /*value*/  /*const*/ N ; 
struct Vec /*value*/  /*const*/ P ; 
struct RayTracer *  /*const*/ X10_TEMP0 ; 
} T28 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18,ASYNC19,ASYNC20,ASYNC21,ASYNC22,ASYNC23,ASYNC24,ASYNC25,ASYNC26,ASYNC27,ASYNC28,ASYNC29,ASYNC30,ASYNC31,ASYNC32,ASYNC33,ASYNC34,ASYNC35,ASYNC36};
int32_t /*static*/_RayTracer_alpha_init ( ) ;
Vec /*static*/_RayTracer_voidVec_init ( ) ;
void /*static*/RayTracer_JGFsetsize (  struct RayTracer  * const X10_TEMP0 , const int32_t sizet ) ;
void /*static*/RayTracer_JGFinitialise (  struct RayTracer  * const X10_TEMP0 ) ;
void /*static*/RayTracer_JGFapplication (  struct RayTracer  * const X10_TEMP0 ) ;
void /*static*/RayTracer_JGFvalidate (  struct RayTracer  * const X10_TEMP0 ) ;
void /*static*/RayTracer_JGFtidyup (  struct RayTracer  * const X10_TEMP0 ) ;
void /*static*/RayTracer_run (  struct RayTracer  * const X10_TEMP0 ) ;
Scene  * /*static*/RayTracer_createScene (  struct RayTracer  * const X10_TEMP0 ) ;
void /*static*/RayTracer_setScene (  struct RayTracer  * const X10_TEMP0 ,  struct Scene  * const scene ) ;
void /*static*/RayTracer_render (  struct RayTracer  * const X10_TEMP0 ,  struct Interval const interval ) ;
uint32_t /*static*/RayTracer_intersect (  struct RayTracer  * const X10_TEMP0 ,  struct Ray  * const r , const double maxt ,  struct Isect  * const inter ) ;
int32_t /*static*/RayTracer_Shadow (  struct RayTracer  * const X10_TEMP0 ,  struct Ray  * const r , const double tmax ,  struct Isect  * const inter ) ;
Vec /*static*/RayTracer_SpecularDirection (  struct RayTracer  * const X10_TEMP0 ,  struct Vec const I ,  struct Vec const N ) ;
Vec /*static*/RayTracer_TransDir (  struct RayTracer  * const X10_TEMP0 ,  struct Surface const m1 ,  struct Surface const m2 ,  struct Vec const I ,  struct Vec const N ) ;
Vec /*static*/RayTracer_shade (  struct RayTracer  * const X10_TEMP0 , const int32_t level , const double weight ,  struct Vec const P ,  struct Vec const N ,  struct Vec const I ,  struct Isect  * const hit ,  struct Ray  * const tRay ) ;
Vec /*static*/RayTracer_trace (  struct RayTracer  * const X10_TEMP0 , const int32_t level , const double weight ,  struct Ray  * const r ,  struct Isect  * const inter ,  struct Ray  * const tRay ) ;
Ray  * /*static*/Ray_d (  struct Ray  * const X10_TEMP0 ,  struct Vec const d_ ) ;
Vec /*static*/Ray_rayPoint (  struct Ray  * const X10_TEMP0 , const double t ) ;
char * /*static*/Ray_toString (  struct Ray  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
Vec /*static*/Vec_added (  struct Vec const X10_TEMP0 ,  struct Vec const a ) ;
Vec /*static*/Vec_adds3 ( const double s ,  struct Vec const a ,  struct Vec const b ) ;
Vec /*static*/Vec_adds2 (  struct Vec const X10_TEMP0 , const double s ,  struct Vec const b ) ;
Vec /*static*/Vec_sub (  struct Vec const a ,  struct Vec const b ) ;
Vec /*static*/Vec_mult (  struct Vec const a ,  struct Vec const b ) ;
Vec /*static*/Vec_cross (  struct Vec const a ,  struct Vec const b ) ;
double /*static*/Vec_dot (  struct Vec const a ,  struct Vec const b ) ;
Vec /*static*/Vec_comb ( const double a ,  struct Vec const A , const double b ,  struct Vec const B ) ;
Vec /*static*/Vec_scale (  struct Vec const X10_TEMP0 , const double t ) ;
Vec /*static*/Vec_negate (  struct Vec const X10_TEMP0 ) ;
Vec /*static*/Vec_normalized (  struct Vec const X10_TEMP0 ) ;
double /*static*/Vec_length (  struct Vec const X10_TEMP0 ) ;
char * /*static*/Vec_toString (  struct Vec const X10_TEMP0 ) ;
char * /*static*/Light_toString (  struct Light const X10_TEMP0 ) ;
Isect  * /*static*/Sphere_intersect (  struct Sphere const X10_TEMP0 ,  struct Ray  * const ry ) ;
Vec /*static*/Sphere_normal (  struct Sphere const X10_TEMP0 ,  struct Vec const p ) ;
char * /*static*/Sphere_toString (  struct Sphere const X10_TEMP0 ) ;
Vec /*static*/Sphere_getCenter (  struct Sphere const X10_TEMP0 ) ;
int32_t /*static*/_Scene_maxObjects_init ( ) ;
int32_t /*static*/_Scene_maxLights_init ( ) ;
void /*static*/Scene_addLight (  struct Scene  * const X10_TEMP0 ,  struct Light const l ) ;
void /*static*/Scene_addObject (  struct Scene  * const X10_TEMP0 ,  struct Sphere const object ) ;
View /*static*/Scene_getView (  struct Scene  * const X10_TEMP0 ) ;
Light /*static*/Scene_getLight (  struct Scene  * const X10_TEMP0 ,  struct Point1 const number ) ;
Sphere /*static*/Scene_getObject (  struct Scene  * const X10_TEMP0 ,  struct Point1 const number ) ;
int32_t /*static*/Scene_getLights (  struct Scene  * const X10_TEMP0 ) ;
int32_t /*static*/Scene_getObjects (  struct Scene  * const X10_TEMP0 ) ;
char * /*static*/Interval_toString (  struct Interval const X10_TEMP0 ) ;
char * /*static*/Surface_toString (  struct Surface const X10_TEMP0 ) ;
char * /*static*/View_toString (  struct View const X10_TEMP0 ) ;
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1Light (  struct LightRefArray1 const array , const int32_t index ,  struct Light const val ) ;
Vec /*static*/getRefArrayValue1Vec (  struct VecRefArray1 const array , const int32_t index ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
void /*static*/setRefArrayValue1Vec (  struct VecRefArray1 const array , const int32_t index ,  struct Vec const val ) ;
int32_t /*static*/getRefArrayValue1int (  struct intRefArray1 const array , const int32_t index ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
Sphere /*static*/getRefArrayValue1Sphere (  struct SphereRefArray1 const array , const int32_t index ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
void /*static*/setRefArrayValue1int (  struct intRefArray1 const array , const int32_t index , const int32_t val ) ;
Light /*static*/getRefArrayValue1Light (  struct LightRefArray1 const array , const int32_t index ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
void /*static*/setRefArrayValue1Sphere (  struct SphereRefArray1 const array , const int32_t index ,  struct Sphere const val ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/getBlockDist1 (  struct Region1 const r ) ;
Point3 /*static*/regionOrdinalPoint3 (  struct Region3 const reg , const int32_t ordl ) ;
Point3 /*static*/regionOrdinalPointRegular3 (  struct Region3 const reg , const int32_t ordl ) ;
Point3 /*static*/regionOrdinalPointArbitrary3 (  struct Region3 const reg , const int32_t ordl ) ;
void /*static*/setRefArrayValue1long (  struct longRefArray1 const array , const int32_t index , const int64_t val ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int64_t /*static*/getRefArrayValue1long (  struct longRefArray1 const array , const int32_t index ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region1 /*static*/createNewRegion1R ( const int32_t v1_0 , const int32_t v1_1 ) ;
Region3 /*static*/createNewRegion3RRR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 , const int32_t v3_0 , const int32_t v3_1 ) ;
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
void /*static*/thread16 (  struct T16 const utmpz ) ;
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
void /*static*/thread28 (  struct T28 const utmpz ) ;
void /*static*/thread34 (  struct T34 const utmpz ) ;
void /*static*/thread35 (  struct T35 const utmpz ) ;
void /*static*/thread36 (  struct T36 const utmpz ) ;
void /*static*/thread37 (  struct T37 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) ;

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_myobjCount , const int32_t a_mylightCount ,  struct Scene  * const a_sc ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T5 T5_T5 ( struct T5 *T5THIS, const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP27 ) ;

T6 T6_T6 ( struct T6 *T6THIS,  struct Point1 const a_pl ,  struct View const a_myview , const place_t a_fp ,  struct Dist1 const a_DBlock ,  struct Interval const a_interval ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T8 T8_T8 ( struct T8 *T8THIS,  struct intRefArray1 const a_temp , const place_t a_h ,  struct Isect  * const a_inter ,  struct Ray  * const a_r ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T9 T9_T9 ( struct T9 *T9THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct VecStub * const a_RX10_TEMP6 ) ;

T10 T10_T10 ( struct T10 *T10THIS,  struct VecRefArray1 const a_temp , const place_t a_h ,  struct Vec const a_bigr ,  struct Surface const a_surf ,  struct Ray  * const a_tRay ,  struct Isect  * const a_hit ,  struct Vec const a_N ,  struct Vec const a_P ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T11 T11_T11 ( struct T11 *T11THIS, struct Scene * SceneTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP6 ) ;

T12 T12_T12 ( struct T12 *T12THIS, struct Scene * SceneTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP6 ) ;

T13 T13_T13 ( struct T13 *T13THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T14 T14_T14 ( struct T14 *T14THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T15 T15_T15 ( struct T15 *T15THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T16 T16_T16 ( struct T16 *T16THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T17 T17_T17 ( struct T17 *T17THIS,  struct longStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP6 ) ;

T18 T18_T18 ( struct T18 *T18THIS, const int32_t a_RX10_TEMP27 , const place_t a_RX10_TEMP23 , const int32_t a_RX10_TEMP22 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP21 ) ;

T19 T19_T19 ( struct T19 *T19THIS,  struct Point1 const a_temp_l ,  struct LightRefArray1 const a_temp , const place_t a_pHere ,  struct Scene  * const a_sc ) ;

T20 T20_T20 ( struct T20 *T20THIS, const int32_t a_RX10_TEMP79 , const place_t a_RX10_TEMP75 , const int32_t a_RX10_TEMP74 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP73 ) ;

T21 T21_T21 ( struct T21 *T21THIS,  struct Point1 const a_temp_o ,  struct SphereRefArray1 const a_temp1 , const place_t a_pHere ,  struct Scene  * const a_sc ) ;

T22 T22_T22 ( struct T22 *T22THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T23 T23_T23 ( struct T23 *T23THIS,  struct longStub const a_RX10_TEMP36 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct longStub * const a_RX10_TEMP27 ) ;

T24 T24_T24 ( struct T24 *T24THIS, const int64_t a_checksumx ,  struct Point1 const a_pl ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T25 T25_T25 ( struct T25 *T25THIS,  struct intStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct intStub * const a_RX10_TEMP6 ) ;

T26 T26_T26 ( struct T26 *T26THIS,  struct SphereValArray1 const a_tempprim , const int32_t a_tempobjCount ,  struct intRefArray1 const a_temp ,  struct Isect  * const a_inter ,  struct Ray  * const a_r ) ;

T27 T27_T27 ( struct T27 *T27THIS,  struct VecStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct VecStub * const a_RX10_TEMP6 ) ;

T28 T28_T28 ( struct T28 *T28THIS,  struct LightValArray1 const a_templights , const int32_t a_templightCount ,  struct VecRefArray1 const a_temp ,  struct Vec const a_bigr ,  struct Surface const a_surf ,  struct Ray  * const a_tRay ,  struct Isect  * const a_hit ,  struct Vec const a_N ,  struct Vec const a_P ,  struct RayTracer  * const a_X10_TEMP0 ) ;

T29 T29_T29 ( struct T29 *T29THIS, struct Scene * SceneTHIS /*this*/ ,  struct LightStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP6 ) ;

T30 T30_T30 ( struct T30 *T30THIS, struct Scene * SceneTHIS /*this*/ ,  struct SphereStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP6 ) ;

T31 T31_T31 ( struct T31 *T31THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T32 T32_T32 ( struct T32 *T32THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T33 T33_T33 ( struct T33 *T33THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T34 T34_T34 ( struct T34 *T34THIS,  struct LightStub const a_RX10_TEMP30 , const int32_t a_RX10_TEMP22 , /*Updatable ARRAY*/ struct LightStub * const a_RX10_TEMP21 ) ;

T35 T35_T35 ( struct T35 *T35THIS,  struct Light const a_tempLight ,  struct LightRefArray1 const a_temp ) ;

T36 T36_T36 ( struct T36 *T36THIS,  struct SphereStub const a_RX10_TEMP82 , const int32_t a_RX10_TEMP74 , /*Updatable ARRAY*/ struct SphereStub * const a_RX10_TEMP73 ) ;

T37 T37_T37 ( struct T37 *T37THIS,  struct Sphere const a_tempObject ,  struct SphereRefArray1 const a_temp1 ) ;

RayTracer *RayTracer_RayTracer ( struct RayTracer *RayTracerTHIS) ;

Interval Interval_Interval ( struct Interval *IntervalTHIS, const int32_t number_ , const int32_t width_ , const int32_t height_ , const int32_t yfrom_ , const int32_t yto_ , const int32_t total_ ) ;

Vec Vec_Vec_4( struct Vec *VecTHIS, const double a , const double b , const double c , const uint32_t isNull_ ) ;

Vec Vec_Vec_2( struct Vec *VecTHIS,  struct Vec const a , const uint32_t isNull_ ) ;

Vec Vec_Vec_0( struct Vec *VecTHIS) ;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

View View_View ( struct View *ViewTHIS,  struct Vec const from_ ,  struct Vec const at_ ,  struct Vec const up_ , const double dist_ , const double angle_ , const double aspect_ ) ;

VecStub VecStub_VecStub ( struct VecStub *VecStubTHIS, /*Updatable ARRAY*/ struct Vec * const localArray_ ) ;

longRefArray1 longRefArray1_longRefArray1 ( struct longRefArray1 *longRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct longStub * const contents_ ) ;

Surface Surface_Surface_0( struct Surface *SurfaceTHIS) ;

Surface Surface_Surface_5( struct Surface *SurfaceTHIS, const double shine_ , const double ks_ , const double kt_ ,  struct Vec const c_ , const uint32_t isNull_ ) ;

VecRefArray1 VecRefArray1_VecRefArray1 ( struct VecRefArray1 *VecRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct VecStub * const contents_ ) ;

Light Light_Light ( struct Light *LightTHIS, const double x , const double y , const double z , const double b ) ;

intRefArray1 intRefArray1_intRefArray1 ( struct intRefArray1 *intRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct intStub * const contents_ ) ;

SphereValArray1 SphereValArray1_SphereValArray1 ( struct SphereValArray1 *SphereValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ struct Sphere * const contents_ ) ;

Sphere Sphere_Sphere_3( struct Sphere *SphereTHIS,  struct Vec const center , const double radius ,  struct Surface const s ) ;

Sphere Sphere_Sphere_2( struct Sphere *SphereTHIS,  struct Vec const center , const double radius ) ;

Ray *Ray_Ray_2( struct Ray *RayTHIS,  struct Vec const pnt ,  struct Vec const dir ) ;

Ray *Ray_Ray_3( struct Ray *RayTHIS,  struct Vec const pnt ,  struct Vec const dir , const uint32_t normalize ) ;

Ray *Ray_Ray_0( struct Ray *RayTHIS) ;

LightValArray1 LightValArray1_LightValArray1 ( struct LightValArray1 *LightValArray1THIS,  struct Region1 const regionValue_ , /*VALUE ARRAY*/ struct Light * const contents_ ) ;

LightRefArray1 LightRefArray1_LightRefArray1 ( struct LightRefArray1 *LightRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct LightStub * const contents_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

Scene *Scene_Scene ( struct Scene *SceneTHIS,  struct View const v ) ;
LightRefArray1 Scene_getLightArray ( struct Scene *SceneTHIS,  struct Dist1 const d ) ;
SphereRefArray1 Scene_getSphereArray ( struct Scene *SceneTHIS,  struct Dist1 const d ) ;
void thread11 ( struct Scene *SceneTHIS,  struct T11 const utmpz ) ;
void thread12 ( struct Scene *SceneTHIS,  struct T12 const utmpz ) ;
void thread29 ( struct Scene *SceneTHIS,  struct T29 const utmpz ) ;
void thread30 ( struct Scene *SceneTHIS,  struct T30 const utmpz ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread13 ( struct Timer *TimerTHIS,  struct T13 const utmpz ) ;
void thread14 ( struct Timer *TimerTHIS,  struct T14 const utmpz ) ;
void thread15 ( struct Timer *TimerTHIS,  struct T15 const utmpz ) ;
void thread31 ( struct Timer *TimerTHIS,  struct T31 const utmpz ) ;
void thread32 ( struct Timer *TimerTHIS,  struct T32 const utmpz ) ;
void thread33 ( struct Timer *TimerTHIS,  struct T33 const utmpz ) ;

LightStub LightStub_LightStub ( struct LightStub *LightStubTHIS, /*Updatable ARRAY*/ struct Light * const localArray_ ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

Region3 Region3_Region3_2( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ ) ;

Region3 Region3_Region3_8( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ , const int32_t low2_ , const int32_t dim2_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

SphereRefArray1 SphereRefArray1_SphereRefArray1 ( struct SphereRefArray1 *SphereRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct SphereStub * const contents_ ) ;

Point3 Point3_Point3 ( struct Point3 *Point3THIS, const int32_t f0_ , const int32_t f1_ , const int32_t f2_ ) ;

intStub intStub_intStub ( struct intStub *intStubTHIS, /*Updatable ARRAY*/ int32_t * const localArray_ ) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

Isect *Isect_Isect_0( struct Isect *IsectTHIS) ;

Isect *Isect_Isect_5( struct Isect *IsectTHIS, const double t_ , const int32_t enter_ , const uint32_t isNull_ ,  struct Sphere const prim_ ,  struct Surface const surf_ ) ;

SphereStub SphereStub_SphereStub ( struct SphereStub *SphereStubTHIS, /*Updatable ARRAY*/ struct Sphere * const localArray_ ) ;

longStub longStub_longStub ( struct longStub *longStubTHIS, /*Updatable ARRAY*/ int64_t * const localArray_ ) ;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfVec( struct Vec * className);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfVecStub( struct VecStub * className);
int32_t getSizeOfT29( struct T29 * className);
int32_t getSizeOfT28( struct T28 * className);
int32_t getSizeOfT27( struct T27 * className);
int32_t getSizeOfT26( struct T26 * className);
int32_t getSizeOfT25( struct T25 * className);
int32_t getSizeOfSurface( struct Surface * className);
int32_t getSizeOfT24( struct T24 * className);
int32_t getSizeOfVecRefArray1( struct VecRefArray1 * className);
int32_t getSizeOfT23( struct T23 * className);
int32_t getSizeOfLight( struct Light * className);
int32_t getSizeOfT22( struct T22 * className);
int32_t getSizeOfT21( struct T21 * className);
int32_t getSizeOfSphere( struct Sphere * className);
int32_t getSizeOfT20( struct T20 * className);
int32_t getSizeOfLightValArray1( struct LightValArray1 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfRegion3( struct Region3 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfPoint3( struct Point3 * className);
int32_t getSizeOfintStub( struct intStub * className);
int32_t getSizeOfT37( struct T37 * className);
int32_t getSizeOfT34( struct T34 * className);
int32_t getSizeOfT33( struct T33 * className);
int32_t getSizeOfT36( struct T36 * className);
int32_t getSizeOfT35( struct T35 * className);
int32_t getSizeOfT30( struct T30 * className);
int32_t getSizeOfSphereStub( struct SphereStub * className);
int32_t getSizeOfT32( struct T32 * className);
int32_t getSizeOfT31( struct T31 * className);
int32_t getSizeOfInterval( struct Interval * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfView( struct View * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOflongRefArray1( struct longRefArray1 * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfintRefArray1( struct intRefArray1 * className);
int32_t getSizeOfSphereValArray1( struct SphereValArray1 * className);
int32_t getSizeOfLightRefArray1( struct LightRefArray1 * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfLightStub( struct LightStub * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfT2( struct T2 * className);
int32_t getSizeOfSphereRefArray1( struct SphereRefArray1 * className);
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
int32_t getSizeOflongStub( struct longStub * className);
void* deepCopyVec( struct Vec * className, void * offset);
void* deepCopydoubleStub( struct doubleStub * className, void * offset);
void* deepCopyVecStub( struct VecStub * className, void * offset);
void* deepCopyT29( struct T29 * className, void * offset);
void* deepCopyT28( struct T28 * className, void * offset);
void* deepCopyT27( struct T27 * className, void * offset);
void* deepCopyT26( struct T26 * className, void * offset);
void* deepCopyT25( struct T25 * className, void * offset);
void* deepCopySurface( struct Surface * className, void * offset);
void* deepCopyT24( struct T24 * className, void * offset);
void* deepCopyVecRefArray1( struct VecRefArray1 * className, void * offset);
void* deepCopyT23( struct T23 * className, void * offset);
void* deepCopyLight( struct Light * className, void * offset);
void* deepCopyT22( struct T22 * className, void * offset);
void* deepCopyT21( struct T21 * className, void * offset);
void* deepCopySphere( struct Sphere * className, void * offset);
void* deepCopyT20( struct T20 * className, void * offset);
void* deepCopyLightValArray1( struct LightValArray1 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyRegion3( struct Region3 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyPoint3( struct Point3 * className, void * offset);
void* deepCopyintStub( struct intStub * className, void * offset);
void* deepCopyT37( struct T37 * className, void * offset);
void* deepCopyT34( struct T34 * className, void * offset);
void* deepCopyT33( struct T33 * className, void * offset);
void* deepCopyT36( struct T36 * className, void * offset);
void* deepCopyT35( struct T35 * className, void * offset);
void* deepCopyT30( struct T30 * className, void * offset);
void* deepCopySphereStub( struct SphereStub * className, void * offset);
void* deepCopyT32( struct T32 * className, void * offset);
void* deepCopyT31( struct T31 * className, void * offset);
void* deepCopyInterval( struct Interval * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyView( struct View * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopylongRefArray1( struct longRefArray1 * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyintRefArray1( struct intRefArray1 * className, void * offset);
void* deepCopySphereValArray1( struct SphereValArray1 * className, void * offset);
void* deepCopyLightRefArray1( struct LightRefArray1 * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyLightStub( struct LightStub * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
void* deepCopySphereRefArray1( struct SphereRefArray1 * className, void * offset);
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
void* deepCopylongStub( struct longStub * className, void * offset);
void * fixPointerVec( struct Vec * className, void * offset);
void * fixPointerdoubleStub( struct doubleStub * className, void * offset);
void * fixPointerVecStub( struct VecStub * className, void * offset);
void * fixPointerT29( struct T29 * className, void * offset);
void * fixPointerT28( struct T28 * className, void * offset);
void * fixPointerT27( struct T27 * className, void * offset);
void * fixPointerT26( struct T26 * className, void * offset);
void * fixPointerT25( struct T25 * className, void * offset);
void * fixPointerSurface( struct Surface * className, void * offset);
void * fixPointerT24( struct T24 * className, void * offset);
void * fixPointerVecRefArray1( struct VecRefArray1 * className, void * offset);
void * fixPointerT23( struct T23 * className, void * offset);
void * fixPointerLight( struct Light * className, void * offset);
void * fixPointerT22( struct T22 * className, void * offset);
void * fixPointerT21( struct T21 * className, void * offset);
void * fixPointerSphere( struct Sphere * className, void * offset);
void * fixPointerT20( struct T20 * className, void * offset);
void * fixPointerLightValArray1( struct LightValArray1 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerRegion3( struct Region3 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerPoint3( struct Point3 * className, void * offset);
void * fixPointerintStub( struct intStub * className, void * offset);
void * fixPointerT37( struct T37 * className, void * offset);
void * fixPointerT34( struct T34 * className, void * offset);
void * fixPointerT33( struct T33 * className, void * offset);
void * fixPointerT36( struct T36 * className, void * offset);
void * fixPointerT35( struct T35 * className, void * offset);
void * fixPointerT30( struct T30 * className, void * offset);
void * fixPointerSphereStub( struct SphereStub * className, void * offset);
void * fixPointerT32( struct T32 * className, void * offset);
void * fixPointerT31( struct T31 * className, void * offset);
void * fixPointerInterval( struct Interval * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerView( struct View * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerlongRefArray1( struct longRefArray1 * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerintRefArray1( struct intRefArray1 * className, void * offset);
void * fixPointerSphereValArray1( struct SphereValArray1 * className, void * offset);
void * fixPointerLightRefArray1( struct LightRefArray1 * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerLightStub( struct LightStub * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
void * fixPointerSphereRefArray1( struct SphereRefArray1 * className, void * offset);
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
void * fixPointerlongStub( struct longStub * className, void * offset);
