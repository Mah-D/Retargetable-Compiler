typedef unsigned char byte;
#include <stdint.h>
#include "place.h"
/*initilizing constants*/ void initconstants();/* value */ typedef struct Dist { 
/*VALUE ARRAY*/ place_t *  /*const*/ placeArray ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ counts ; 
/*VALUE ARRAY*/ int32_t *  /*const*/ runningSum ; 
} Dist ;
 
/* value */ typedef struct WrapperStub { 
/*Updatable ARRAY*/ struct Wrapper *  /*const*/ localArray ; 
} WrapperStub ;
 
/* value */ typedef struct Dist3Stub { 
/*Updatable ARRAY*/ struct Dist3 *  /*const*/ localArray ; 
} Dist3Stub ;
 
/* value */ typedef struct Point3 { 
int32_t  /*const*/ f0 ; 
int32_t  /*const*/ f1 ; 
int32_t  /*const*/ f2 ; 
} Point3 ;
 
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
 
/* value */ typedef struct T64 { 
int32_t  /*const*/ RX10_TEMP61 ; 
place_t  /*const*/ RX10_TEMP57 ; 
int32_t  /*const*/ RX10_TEMP56 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP55 ; 
} T64 ;
 
/* value */ typedef struct Region3Stub { 
/*Updatable ARRAY*/ struct Region3 *  /*const*/ localArray ; 
} Region3Stub ;
 
/* value */ typedef struct T40 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
double  /*const*/ initVal ; 
} T40 ;
 
/* class MGDriver */ typedef struct MGDriver { 
} MGDriver ; 

/* value */ typedef struct T32 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T32 ;
 
/* value */ typedef struct T36 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T36 ;
 
/* value */ typedef struct T34 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T34 ;
 
/* value */ typedef struct T38 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct WrapperStub *  /*const*/ RX10_TEMP6 ; 
} T38 ;
 
/* value */ typedef struct T24 { 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T24 ;
 
/* value */ typedef struct LevelDataStub { 
/*Updatable ARRAY*/ struct LevelData *  /*const*/ localArray ; 
} LevelDataStub ;
 
/* value */ typedef struct doubleStub { 
/*Updatable ARRAY*/ double *  /*const*/ localArray ; 
} doubleStub ;
 
/* class Util */ typedef struct Util { 
} Util ; 

/* value */ typedef struct T89 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP64 ; 
int32_t  /*const*/ RX10_TEMP56 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP55 ; 
} T89 ;
 
/* value */ typedef struct T69 { 
struct Region3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T69 ;
 
/* value */ typedef struct Region3ValArray3 { 
struct Region3 /*value*/  /*const*/ regionValue ; 
/*VALUE ARRAY*/ struct Region3 *  /*const*/ contents ; 
} Region3ValArray3 ;
 
/* value */ typedef struct T63 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T63 ;
 
/* value */ typedef struct T71 { 
struct Region3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T71 ;
 
/* value */ typedef struct T77 { 
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T77 ;
 
/* value */ typedef struct T73 { 
struct Region3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T73 ;
 
/* value */ typedef struct T75 { 
struct WrapperStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct WrapperStub *  /*const*/ RX10_TEMP6 ; 
} T75 ;
 
/* value */ typedef struct Dist3 { 
struct Region3 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist3 ;
 
/* value */ typedef struct Dist2 { 
struct Region2 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist2 ;
 
/* value */ typedef struct Dist1 { 
struct Region1 /*value*/  /*const*/ dReg ; 
struct Dist /*value*/  /*const*/ dDist ; 
} Dist1 ;
 
/* value */ typedef struct doubleRefArray3 { 
struct Dist3 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray3 ;
 
/* value */ typedef struct LevelDataRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct LevelDataStub *  /*const*/ contents ; 
} LevelDataRefArray1 ;
 
/* value */ typedef struct doubleRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct doubleStub *  /*const*/ contents ; 
} doubleRefArray1 ;
 
/* value */ typedef struct Region3RefArray2 { 
struct Dist2 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct Region3Stub *  /*const*/ contents ; 
} Region3RefArray2 ;
 
/* value */ typedef struct Region3RefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct Region3Stub *  /*const*/ contents ; 
} Region3RefArray1 ;
 
/* value */ typedef struct WrapperRefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct WrapperStub *  /*const*/ contents ; 
} WrapperRefArray1 ;
 
/* value */ typedef struct Dist3RefArray1 { 
struct Dist1 /*value*/  /*const*/ distValue ; 
/*VALUE ARRAY*/ struct Dist3Stub *  /*const*/ contents ; 
} Dist3RefArray1 ;
 
/* value */ typedef struct T90 { 
double  /*const*/ temp3 ; 
struct doubleRefArray1 /*value*/  /*const*/ aRecv ; 
} T90 ;
 
/* value */ typedef struct LevelData { 
uint32_t  /*const*/ EXCHANGE_After ; 
int32_t  /*const*/ SIZE ; 
struct Region3 /*value*/  /*const*/ P_DOMAIN ; 
uint32_t  /*const*/ ISPARALLEL ; 
struct Region3RefArray1 /*value*/  /*const*/ m_regions ; 
struct Region3RefArray1 /*value*/  /*const*/ m_REGIONs ; 
struct Region3RefArray2 /*value*/  /*const*/ m_boundaries ; 
struct Dist1 /*value*/  /*const*/ m_places ; 
int32_t  /*const*/ m_numPlaces ; 
struct Region3 /*value*/  /*const*/ m_placeGrid ; 
int32_t  /*const*/ m_size0 ; 
int32_t  /*const*/ m_size1 ; 
int32_t  /*const*/ m_size2 ; 
int32_t  /*const*/ m_block0 ; 
int32_t  /*const*/ m_block1 ; 
int32_t  /*const*/ m_block2 ; 
struct Dist3RefArray1 /*value*/  /*const*/ m_dist ; 
struct Dist3RefArray1 /*value*/  /*const*/ m_DIST ; 
struct WrapperRefArray1 /*value*/  /*const*/ m_u ; 
} LevelData ;
 
/* value */ typedef struct T61 { 
double  /*const*/ d ; 
struct Point3 /*value*/  /*const*/ p ; 
struct doubleRefArray3 /*value*/  /*const*/ a_dest ; 
} T61 ;
 
/* value */ typedef struct T67 { 
double  /*const*/ tp ; 
struct Point3 /*value*/  /*const*/ p ; 
struct doubleRefArray3 /*value*/  /*const*/ u ; 
} T67 ;
 
/* value */ typedef struct T66 { 
int32_t  /*const*/ z ; 
int32_t  /*const*/ y ; 
int32_t  /*const*/ x ; 
struct Point3 /*value*/  /*const*/ p ; 
struct Region3 /*value*/  /*const*/ R ; 
struct doubleRefArray3 /*value*/  /*const*/ temp ; 
int32_t  /*const*/ a_CLASS ; 
} T66 ;
 
/* value */ typedef struct T65 { 
struct doubleRefArray1 /*value*/  /*const*/ aRecv ; 
place_t  /*const*/ h ; 
struct Point3 /*value*/  /*const*/ p ; 
struct doubleRefArray3 /*value*/  /*const*/ temp ; 
} T65 ;
 
/* value */ typedef struct T62 { 
double  /*const*/ d ; 
struct Point3 /*value*/  /*const*/ p ; 
struct doubleRefArray3 /*value*/  /*const*/ a_dest ; 
} T62 ;
 
/* value */ typedef struct T70 { 
struct Region3 /*value*/  /*const*/ temp3 ; 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
} T70 ;
 
/* value */ typedef struct T72 { 
struct Region3 /*value*/  /*const*/ temp3 ; 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
} T72 ;
 
/* value */ typedef struct T78 { 
double  /*const*/ localSum ; 
int32_t  /*const*/ index ; 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
} T78 ;
 
/* value */ typedef struct T74 { 
struct Region3 /*value*/  /*const*/ temp4 ; 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
} T74 ;
 
/* class Timer */ typedef struct Timer { 
struct doubleRefArray1 start_time ; 
struct doubleRefArray1 elapsed_time ; 
struct doubleRefArray1 total_time ; 
} Timer ; 

/* value */ typedef struct T41 { 
struct doubleRefArray1 /*value*/  /*const*/ localSumArray ; 
place_t  /*const*/ source ; 
int32_t  /*const*/ zero ; 
struct doubleRefArray1 /*value*/  /*const*/ sumArray ; 
} T41 ;
 
/* value */ typedef struct Wrapper { 
struct doubleRefArray3 /*value*/  /*const*/ m_array ; 
} Wrapper ;
 
/* value */ typedef struct T20 { 
place_t  /*const*/ h ; 
struct Point3 /*value*/  /*const*/ p ; 
struct doubleRefArray3 /*value*/  /*const*/ a_src ; 
struct doubleRefArray3 /*value*/  /*const*/ a_dest ; 
} T20 ;
 
/* value */ typedef struct T21 { 
place_t  /*const*/ h ; 
struct Point3 /*value*/  /*const*/ p ; 
int32_t  /*const*/ a_trans2 ; 
int32_t  /*const*/ a_trans1 ; 
int32_t  /*const*/ a_trans0 ; 
struct doubleRefArray3 /*value*/  /*const*/ a_src ; 
struct doubleRefArray3 /*value*/  /*const*/ a_dest ; 
} T21 ;
 
/* class MGOP */ typedef struct MGOP { 
uint32_t  /*const*/ EXCHANGE_After ; 
int32_t  /*const*/ m_size ; 
struct Region3 /*value*/  /*const*/ m_problemDomain ; 
int32_t  /*const*/ m_levels ; 
struct LevelDataRefArray1 m_r ; 
struct LevelDataRefArray1 m_z ; 
struct LevelData m_tempLD ; 
} MGOP ; 

/* value */ typedef struct T19 { 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T19 ;
 
/* value */ typedef struct T18 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T18 ;
 
/* value */ typedef struct T82 { 
struct LevelData THIS /*this*/;
struct Region3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T82 ;
 
/* value */ typedef struct T17 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T17 ;
 
/* value */ typedef struct T83 { 
struct LevelData THIS /*this*/;
struct Region3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T83 ;
 
/* value */ typedef struct T16 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T16 ;
 
/* value */ typedef struct T81 { 
struct LevelData THIS /*this*/;
struct Dist3Stub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Dist3Stub *  /*const*/ RX10_TEMP6 ; 
} T81 ;
 
/* value */ typedef struct T14 { 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T14 ;
 
/* value */ typedef struct T13 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T13 ;
 
/* value */ typedef struct T12 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T12 ;
 
/* value */ typedef struct T11 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T11 ;
 
/* value */ typedef struct T2 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T2 ;
 
/* value */ typedef struct T3 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T3 ;
 
/* value */ typedef struct T1 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ RES ; 
} T1 ;
 
/* value */ typedef struct T87 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP37 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T87 ;
 
/* value */ typedef struct T86 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T86 ;
 
/* value */ typedef struct T85 { 
struct LevelData THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP16 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T85 ;
 
/* value */ typedef struct T84 { 
struct LevelData THIS /*this*/;
struct WrapperStub /*value*/  /*const*/ RX10_TEMP15 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct WrapperStub *  /*const*/ RX10_TEMP6 ; 
} T84 ;
 
/* value */ typedef struct T88 { 
struct Timer THIS /*this*/;
struct doubleStub /*value*/  /*const*/ RX10_TEMP58 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T88 ;
 
/* value */ typedef struct T91 { 
int32_t  /*const*/ p ; 
int32_t  /*const*/ ii ; 
int32_t  /*const*/ dest2 ; 
int32_t  /*const*/ dest1 ; 
int32_t  /*const*/ dest0 ; 
int32_t  /*const*/ jj ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T91 ;
 
/* value */ typedef struct T9 { 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T9 ;
 
/* value */ typedef struct T8 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T8 ;
 
/* value */ typedef struct T5 { 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T5 ;
 
/* value */ typedef struct T4 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T4 ;
 
/* value */ typedef struct T7 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T7 ;
 
/* value */ typedef struct T6 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T6 ;
 
/* value */ typedef struct T60 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T60 ;
 
/* value */ typedef struct T68 { 
int32_t  /*const*/ i ; 
int32_t  /*const*/ j ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T68 ;
 
/* value */ typedef struct T76 { 
struct Wrapper /*value*/  /*const*/ temp4 ; 
struct WrapperRefArray1 /*value*/  /*const*/ aRecv ; 
} T76 ;
 
/* value */ typedef struct T57 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T57 ;
 
/* value */ typedef struct T58 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T58 ;
 
/* value */ typedef struct T55 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T55 ;
 
/* value */ typedef struct T56 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T56 ;
 
/* value */ typedef struct T53 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T53 ;
 
/* value */ typedef struct T54 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg2 ; 
struct LevelData /*value*/  /*const*/ a_arg1 ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T54 ;
 
/* value */ typedef struct T51 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP33 ; 
place_t  /*const*/ RX10_TEMP29 ; 
int32_t  /*const*/ RX10_TEMP28 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP27 ; 
} T51 ;
 
/* value */ typedef struct T52 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP54 ; 
place_t  /*const*/ RX10_TEMP50 ; 
int32_t  /*const*/ RX10_TEMP49 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP48 ; 
} T52 ;
 
/* value */ typedef struct T59 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_arg ; 
struct LevelData /*value*/  /*const*/ a_res ; 
} T59 ;
 
/* value */ typedef struct T50 { 
struct Timer THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T50 ;
 
/* value */ typedef struct T44 { 
struct LevelData THIS /*this*/;
struct Dist3 /*value*/  /*const*/ disi ; 
int32_t  /*const*/ k ; 
struct WrapperRefArray1 /*value*/  /*const*/ temp_m_u ; 
} T44 ;
 
/* value */ typedef struct T45 { 
struct LevelData THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Dist3Stub *  /*const*/ RX10_TEMP6 ; 
} T45 ;
 
/* value */ typedef struct T46 { 
struct LevelData THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T46 ;
 
/* value */ typedef struct T47 { 
struct LevelData THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct Region3Stub *  /*const*/ RX10_TEMP6 ; 
} T47 ;
 
/* value */ typedef struct T48 { 
struct LevelData THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct WrapperStub *  /*const*/ RX10_TEMP6 ; 
} T48 ;
 
/* value */ typedef struct T49 { 
struct LevelData THIS /*this*/;
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct doubleStub *  /*const*/ RX10_TEMP6 ; 
} T49 ;
 
/* value */ typedef struct T31 { 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T31 ;
 
/* value */ typedef struct T30 { 
int32_t  /*const*/ i ; 
int32_t  /*const*/ jj ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T30 ;
 
/* value */ typedef struct T35 { 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
place_t  /*const*/ h ; 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T35 ;
 
/* value */ typedef struct T33 { 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
place_t  /*const*/ h ; 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T33 ;
 
/* value */ typedef struct T39 { 
struct WrapperRefArray1 /*value*/  /*const*/ aRecv ; 
place_t  /*const*/ h ; 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T39 ;
 
/* value */ typedef struct T37 { 
struct Region3RefArray1 /*value*/  /*const*/ aRecv ; 
place_t  /*const*/ h ; 
int32_t  /*const*/ j ; 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T37 ;
 
/* value */ typedef struct T22 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T22 ;
 
/* value */ typedef struct T23 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T23 ;
 
/* value */ typedef struct T25 { 
int32_t  /*const*/ i ; 
struct doubleRefArray1 /*value*/  /*const*/ results ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T25 ;
 
/* value */ typedef struct T26 { 
int32_t  /*const*/ i ; 
int32_t  /*const*/ a_CLASS ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T26 ;
 
/* value */ typedef struct T27 { 
int32_t  /*const*/ i ; 
double  /*const*/ a_db ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T27 ;
 
/* value */ typedef struct T28 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_LD ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T28 ;
 
/* value */ typedef struct T29 { 
int32_t  /*const*/ i ; 
struct LevelData /*value*/  /*const*/ a_LD ; 
struct LevelData /*value*/  /*const*/ X10_TEMP0 ; 
} T29 ;
 
/* value */ typedef struct T80 { 
struct MGOP THIS /*this*/;
struct LevelDataStub /*value*/  /*const*/ RX10_TEMP43 ; 
int32_t  /*const*/ RX10_TEMP31 ; 
/*Updatable ARRAY*/ struct LevelDataStub *  /*const*/ RX10_TEMP30 ; 
} T80 ;
 
/* value */ typedef struct T15 { 
int32_t  /*const*/ i ; 
struct doubleRefArray3 /*value*/  /*const*/ arg ; 
struct MGOP *  /*const*/ X10_TEMP0 ; 
} T15 ;
 
/* value */ typedef struct T10 { 
int32_t  /*const*/ i ; 
struct doubleRefArray3 /*value*/  /*const*/ res ; 
struct MGOP *  /*const*/ X10_TEMP0 ; 
} T10 ;
 
/* value */ typedef struct T79 { 
struct MGOP THIS /*this*/;
struct LevelDataStub /*value*/  /*const*/ RX10_TEMP19 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LevelDataStub *  /*const*/ RX10_TEMP6 ; 
} T79 ;
 
/* value */ typedef struct T42 { 
struct MGOP THIS /*this*/;
struct Region1 /*value*/  /*const*/ RX10_TEMP14 ; 
int32_t  /*const*/ RX10_TEMP12 ; 
place_t  /*const*/ RX10_TEMP8 ; 
int32_t  /*const*/ RX10_TEMP7 ; 
/*Updatable ARRAY*/ struct LevelDataStub *  /*const*/ RX10_TEMP6 ; 
} T42 ;
 
/* value */ typedef struct T43 { 
struct MGOP THIS /*this*/;
struct Region1 /*value*/  /*const*/ RX10_TEMP38 ; 
int32_t  /*const*/ RX10_TEMP36 ; 
place_t  /*const*/ RX10_TEMP32 ; 
int32_t  /*const*/ RX10_TEMP31 ; 
/*Updatable ARRAY*/ struct LevelDataStub *  /*const*/ RX10_TEMP30 ; 
} T43 ;
 
enum AsyncMappings { ASYNC0,ASYNC1,ASYNC2,ASYNC3,ASYNC4,ASYNC5,ASYNC6,ASYNC7,ASYNC8,ASYNC9,ASYNC10,ASYNC11,ASYNC12,ASYNC13,ASYNC14,ASYNC15,ASYNC16,ASYNC17,ASYNC18,ASYNC19,ASYNC20,ASYNC21,ASYNC22,ASYNC23,ASYNC24,ASYNC25,ASYNC26,ASYNC27,ASYNC28,ASYNC29,ASYNC30,ASYNC31,ASYNC32,ASYNC33,ASYNC34,ASYNC35,ASYNC36,ASYNC37,ASYNC38,ASYNC39,ASYNC40,ASYNC41,ASYNC42,ASYNC43,ASYNC44,ASYNC45,ASYNC46,ASYNC47,ASYNC48,ASYNC49,ASYNC50,ASYNC51,ASYNC52,ASYNC53,ASYNC54,ASYNC55,ASYNC56,ASYNC57,ASYNC58,ASYNC59,ASYNC60,ASYNC61,ASYNC62,ASYNC63,ASYNC64,ASYNC65,ASYNC66,ASYNC67,ASYNC68,ASYNC69,ASYNC70,ASYNC71,ASYNC72,ASYNC73,ASYNC74,ASYNC75,ASYNC76,ASYNC77,ASYNC78,ASYNC79,ASYNC80,ASYNC81,ASYNC82,ASYNC83,ASYNC84,ASYNC85,ASYNC86,ASYNC87,ASYNC88,ASYNC89,ASYNC90};
uint32_t /*static*/_MGOP_PERF_On_init ( ) ;
double /*static*/_MGOP_PERF_Comp_init ( ) ;
double /*static*/_MGOP_PERF_CommL_init ( ) ;
double /*static*/_MGOP_PERF_CommB_init ( ) ;
uint32_t /*static*/_MGOP_PERF_InLoop_init ( ) ;
uint32_t /*static*/_MGOP_PERF_CompOnly_init ( ) ;
uint32_t /*static*/_MGOP_PERF_CommOnly_init ( ) ;
uint32_t /*static*/_MGOP_OVERLAPPED_init ( ) ;
Region1 /*static*/_MGOP_reg_init ( ) ;
double /*static*/_MGOP_Ac0_init ( ) ;
double /*static*/_MGOP_Ac1_init ( ) ;
double /*static*/_MGOP_Ac2_init ( ) ;
double /*static*/_MGOP_Ac3_init ( ) ;
double /*static*/_MGOP_Sac0_init ( ) ;
double /*static*/_MGOP_Sac1_init ( ) ;
double /*static*/_MGOP_Sac2_init ( ) ;
double /*static*/_MGOP_Sac3_init ( ) ;
double /*static*/_MGOP_Pc0_init ( ) ;
double /*static*/_MGOP_Pc1_init ( ) ;
double /*static*/_MGOP_Pc2_init ( ) ;
double /*static*/_MGOP_Pc3_init ( ) ;
int32_t /*static*/_MGOP_P2SLEVEL_init ( ) ;
void /*static*/MGOP_computeResidual2 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const RES ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_computeResidual3 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg1 ,  struct LevelData const a_arg2 ) ;
void /*static*/MGOP_ComputeResidual (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg1 ,  struct LevelData const a_arg2 ) ;
void /*static*/MGOP_ComputeResidual_Overlapped1 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg1 ,  struct LevelData const a_arg2 ) ;
void /*static*/MGOP_ComputeResidual_Overlapped (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg1 ,  struct LevelData const a_arg2 ) ;
void /*static*/MGOP_smooth (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const uint32_t a_isBottom ) ;
void /*static*/MGOP_Smooth (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const uint32_t a_isBottom ) ;
void /*static*/MGOP_Smooth_Overlapped1 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const uint32_t a_isBottom ) ;
void /*static*/MGOP_Smooth_Overlapped (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const uint32_t a_isBottom ) ;
void /*static*/MGOP_applyOpP3 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const int32_t a_level ) ;
void /*static*/MGOP_applyOpP2 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpP (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpP_Overlapped1 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpP_Overlapped (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_applyOpQ3 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg , const int32_t a_level ) ;
void /*static*/MGOP_applyOpQ2 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpQ (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpQ_Overlapped1 (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
void /*static*/MGOP_ApplyOpQ_Overlapped (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_res ,  struct LevelData const a_arg ) ;
double /*static*/MGOP_MGSolve (  struct MGOP  * const X10_TEMP0 ,  struct LevelData const a_u ,  struct LevelData const a_v , const int32_t a_its ) ;
void /*static*/MGOP_MG (  struct MGOP  * const X10_TEMP0 ) ;
double /*static*/MGOP_residualNorm (  struct MGOP  * const X10_TEMP0 ) ;
void /*static*/runMain ( ) ;
uint32_t /*static*/_Util_PERF_OUTPUT_init ( ) ;
double /*static*/_Util_CLOCK_SPEED_init ( ) ;
double /*static*/_Util_FP_PERCLOCK_init ( ) ;
double /*static*/_Util_COMM_LATENCY_init ( ) ;
double /*static*/_Util_COMM_BANDWIDTH_init ( ) ;
uint32_t /*static*/_Util_IN_LOOP_init ( ) ;
uint32_t /*static*/_Util_COMP_ONLY_init ( ) ;
uint32_t /*static*/_Util_COMM_ONLY_init ( ) ;
int32_t /*static*/_Util_THREADS_PERFOREACH_init ( ) ;
uint32_t /*static*/_Util_OVERLAP_COMMANDCOMP_init ( ) ;
uint32_t /*static*/_Util_EXCHANGE_AFTER_init ( ) ;
int32_t /*static*/_Util_P2SLEVEL_init ( ) ;
int32_t /*static*/_Util_N_PLACES_init ( ) ;
double /*static*/Util_sumDIFF1 (  struct Point3 const p ,  struct doubleRefArray3 const arg ) ;
double /*static*/Util_sumDIFF2 (  struct Point3 const p ,  struct doubleRefArray3 const arg ) ;
double /*static*/Util_sumDIFF3 (  struct Point3 const p ,  struct doubleRefArray3 const arg ) ;
Region3 /*static*/_Util_UNIT_CUBE_init ( ) ;
Region3ValArray3 /*static*/_Util_QREGIONS_init ( ) ;
int32_t /*static*/_Util_LOW_init ( ) ;
int32_t /*static*/_Util_HIGH_init ( ) ;
uint32_t /*static*/Util_powerOf2 ( const int32_t a_int ) ;
int32_t /*static*/Util_log2 ( const int32_t a_int ) ;
int32_t /*static*/Util_pow2 ( const int32_t a_int ) ;
Region3 /*static*/Util_boundary (  struct Region3 const a_R , const int32_t a_direction , const int32_t a_padSize0 , const int32_t a_padSize1 , const int32_t a_padSize2 ) ;
void /*static*/Util_arraycopy3 (  struct doubleRefArray3 const a_dest ,  struct Region3 const a_destR ,  struct doubleRefArray3 const a_src ) ;
void /*static*/Util_arraycopy4 (  struct doubleRefArray3 const a_dest ,  struct Region3 const a_destR ,  struct doubleRefArray3 const a_src , const int32_t a_trans0 , const int32_t a_trans1 , const int32_t a_trans2 ) ;
void /*static*/MGDriver_driver ( ) ;
char * /*static*/Wrapper_toString (  struct Wrapper const X10_TEMP0 ) ;
char * /*static*/LevelData_toString (  struct LevelData const X10_TEMP0 ) ;
uint32_t /*static*/_LevelData_PERF_On_init ( ) ;
double /*static*/_LevelData_PERF_Comp_init ( ) ;
double /*static*/_LevelData_PERF_CommL_init ( ) ;
double /*static*/_LevelData_PERF_CommB_init ( ) ;
uint32_t /*static*/_LevelData_PERF_InLoop_init ( ) ;
uint32_t /*static*/_LevelData_PERF_CompOnly_init ( ) ;
uint32_t /*static*/_LevelData_PERF_CommOnly_init ( ) ;
int32_t /*static*/_LevelData_N_PLACES_init ( ) ;
int32_t /*static*/_LevelData_HIGH_init ( ) ;
int32_t /*static*/_LevelData_LOW_init ( ) ;
Dist1 /*static*/LevelData_getPlaces (  struct LevelData const X10_TEMP0 ) ;
doubleRefArray3 /*static*/LevelData_getArray (  struct LevelData const X10_TEMP0 , const int32_t a_idx ) ;
Region3 /*static*/LevelData_getInnerRegion (  struct LevelData const X10_TEMP0 , const int32_t a_idx ) ;
Region3 /*static*/LevelData_getINNERRegion (  struct LevelData const X10_TEMP0 , const int32_t a_idx ) ;
Region3 /*static*/LevelData_getShrinkedRegion (  struct LevelData const X10_TEMP0 , const int32_t a_idx ) ;
Region3 /*static*/LevelData_getRegion (  struct LevelData const X10_TEMP0 , const int32_t a_idx ) ;
void /*static*/LevelData_print (  struct LevelData const X10_TEMP0 ) ;
void /*static*/LevelData_PRINT (  struct LevelData const X10_TEMP0 ) ;
double /*static*/LevelData_norm2 (  struct LevelData const X10_TEMP0 ) ;
void /*static*/LevelData_initialize (  struct LevelData const X10_TEMP0 , const int32_t a_CLASS ) ;
void /*static*/LevelData_set (  struct LevelData const X10_TEMP0 , const double a_db ) ;
void /*static*/LevelData_setLevelData (  struct LevelData const X10_TEMP0 ,  struct LevelData const a_LD ) ;
void /*static*/LevelData_add (  struct LevelData const X10_TEMP0 ,  struct LevelData const a_LD ) ;
void /*static*/LevelData_Exchange (  struct LevelData const X10_TEMP0 ) ;
void /*static*/LevelData_exchange (  struct LevelData const X10_TEMP0 ) ;
Region3 /*static*/LevelData_get_m_regions (  struct LevelData const X10_TEMP0 , const int32_t i ) ;
Region3 /*static*/LevelData_get_m_REGIONs (  struct LevelData const X10_TEMP0 , const int32_t i ) ;
Region3 /*static*/LevelData_get_m_boundaries (  struct LevelData const X10_TEMP0 , const int32_t i , const int32_t j ) ;
Wrapper /*static*/LevelData_get_m_u (  struct LevelData const X10_TEMP0 , const int32_t i ) ;
int32_t /*static*/_Timer_max_counters_init ( ) ;
void /*static*/Timer_start (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_stop (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
double /*static*/Timer_readTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetTimer (  struct Timer  * const X10_TEMP0 , const int32_t n ) ;
void /*static*/Timer_resetAllTimers (  struct Timer  * const X10_TEMP0 ) ;
double /*static*/doublerefArraySum1 (  struct doubleRefArray1 const sumArray ) ;
int32_t /*static*/constantSearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
int32_t /*static*/constantSearchRegion3 (  struct Region3 const r ,  struct Point3 const target ) ;
int32_t /*static*/constantSearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/binarySearchRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
LevelData /*static*/getRefArrayValue1LevelData (  struct LevelDataRefArray1 const array , const int32_t index ) ;
char * /*static*/toStringPoint3 (  struct Point3 const p ) ;
void /*static*/setRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index , const double val ) ;
int32_t /*static*/binarySearchRegion3 (  struct Region3 const r ,  struct Point3 const target ) ;
void /*static*/setRefArrayValue2Region3 (  struct Region3RefArray2 const array , const int32_t index ,  struct Region3 const val ) ;
Dist1 /*static*/getUniqueDist ( ) ;
place_t /*static*/getPlaceFromDist3 (  struct Dist3 const dn , const int32_t index ) ;
place_t /*static*/getPlaceFromDist1 (  struct Dist1 const dn , const int32_t index ) ;
void /*static*/setRefArrayValue3double (  struct doubleRefArray3 const array , const int32_t index , const double val ) ;
void /*static*/setRefArrayValue1Region3 (  struct Region3RefArray1 const array , const int32_t index ,  struct Region3 const val ) ;
Region3 /*static*/getRefArrayValue2Region3 (  struct Region3RefArray2 const array , const int32_t index ) ;
place_t /*static*/getPlaceFromDist2 (  struct Dist2 const dn , const int32_t index ) ;
int32_t /*static*/regionHigh (  struct Region1 const r ) ;
int32_t /*static*/regionHighRegular (  struct Region1 const r ) ;
int32_t /*static*/regionHighArbitrary (  struct Region1 const r ) ;
int32_t /*static*/comparePoint1 (  struct Point1 const pt1 ,  struct Point1 const pt2 ) ;
int32_t /*static*/comparePoint2 (  struct Point2 const pt1 ,  struct Point2 const pt2 ) ;
Point2 /*static*/regionOrdinalPoint2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointRegular2 (  struct Region2 const reg , const int32_t ordl ) ;
Point2 /*static*/regionOrdinalPointArbitrary2 (  struct Region2 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPoint1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointRegular1 (  struct Region1 const reg , const int32_t ordl ) ;
Point1 /*static*/regionOrdinalPointArbitrary1 (  struct Region1 const reg , const int32_t ordl ) ;
Region1 /*static*/getRank3 (  struct Region3 const r , const int32_t dim ) ;
Region1 /*static*/getRankArbitrary3 (  struct Region3 const r , const int32_t dim ) ;
Region1 /*static*/getRankRegular3 (  struct Region3 const r , const int32_t dim ) ;
int32_t /*static*/comparePoint3 (  struct Point3 const pt1 ,  struct Point3 const pt2 ) ;
double /*static*/getRefArrayValue3double (  struct doubleRefArray3 const array , const int32_t index ) ;
double /*static*/getRefArrayValue1double (  struct doubleRefArray1 const array , const int32_t index ) ;
int32_t /*static*/regionLow (  struct Region1 const r ) ;
int32_t /*static*/regionLowRegular (  struct Region1 const r ) ;
int32_t /*static*/regionLowArbitrary (  struct Region1 const r ) ;
Dist1 /*static*/restrictDist1 (  struct Dist1 const dn , const place_t p ) ;
Dist1 /*static*/restrictDistRegular1 (  struct Dist1 const d , const place_t p ) ;
Dist1 /*static*/restrictDistArbitrary1 (  struct Dist1 const d , const place_t p ) ;
Wrapper /*static*/getRefArrayValue1Wrapper (  struct WrapperRefArray1 const array , const int32_t index ) ;
Point3 /*static*/regionOrdinalPoint3 (  struct Region3 const reg , const int32_t ordl ) ;
Point3 /*static*/regionOrdinalPointRegular3 (  struct Region3 const reg , const int32_t ordl ) ;
Point3 /*static*/regionOrdinalPointArbitrary3 (  struct Region3 const reg , const int32_t ordl ) ;
Dist3 /*static*/getRefArrayValue1Dist3 (  struct Dist3RefArray1 const array , const int32_t index ) ;
uint32_t /*static*/regionContainsPoint3 (  struct Region3 const r ,  struct Point3 const target ) ;
void /*static*/getCyclic ( /*Updatable ARRAY*/ place_t * const placeArray , const int32_t arraySize , const place_t initPlace , const int32_t blockSize ) ;
char * /*static*/toStringRegion3 (  struct Region3 const r ) ;
int32_t /*static*/getDistLocalCount2 (  struct Dist2 const dn , const int32_t placeIndex ) ;
Region3 /*static*/getRefArrayValue1Region3 (  struct Region3RefArray1 const array , const int32_t index ) ;
int32_t /*static*/getDistLocalCount3 (  struct Dist3 const dn , const int32_t placeIndex ) ;
void /*static*/setRefArrayValue1Dist3 (  struct Dist3RefArray1 const array , const int32_t index ,  struct Dist3 const val ) ;
int32_t /*static*/getDistLocalCount1 (  struct Dist1 const dn , const int32_t placeIndex ) ;
int32_t /*static*/searchPointInRegion2 (  struct Region2 const r ,  struct Point2 const target ) ;
int32_t /*static*/searchPointInRegion1 (  struct Region1 const r ,  struct Point1 const target ) ;
void /*static*/setRefArrayValue1Wrapper (  struct WrapperRefArray1 const array , const int32_t index ,  struct Wrapper const val ) ;
int32_t /*static*/searchPointInRegion3 (  struct Region3 const r ,  struct Point3 const target ) ;
Dist2 /*static*/getPlaceDist2 (  struct Region2 const r , const place_t p ) ;
Region3 /*static*/unionRegion3 (  struct Region3 const reg1 ,  struct Region3 const reg2 ) ;
Dist1 /*static*/getPlaceDist1 (  struct Region1 const r , const place_t p ) ;
Dist3 /*static*/getPlaceDist3 (  struct Region3 const r , const place_t p ) ;
/*VALUE ARRAY*/ int32_t * /*static*/initDist ( /*Updatable ARRAY*/ int32_t * const tempArr , const int32_t tempReg ) ;
Region2 /*static*/createNewRegion2RR ( const int32_t v1_0 , const int32_t v1_1 , const int32_t v2_0 , const int32_t v2_1 ) ;
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
void /*static*/thread11 (  struct T11 const utmpz ) ;
void /*static*/thread12 (  struct T12 const utmpz ) ;
void /*static*/thread13 (  struct T13 const utmpz ) ;
void /*static*/thread14 (  struct T14 const utmpz ) ;
void /*static*/thread15 (  struct T15 const utmpz ) ;
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
void /*static*/thread29 (  struct T29 const utmpz ) ;
void /*static*/thread30 (  struct T30 const utmpz ) ;
void /*static*/thread31 (  struct T31 const utmpz ) ;
void /*static*/thread32 (  struct T32 const utmpz ) ;
void /*static*/thread33 (  struct T33 const utmpz ) ;
void /*static*/thread34 (  struct T34 const utmpz ) ;
void /*static*/thread35 (  struct T35 const utmpz ) ;
void /*static*/thread36 (  struct T36 const utmpz ) ;
void /*static*/thread37 (  struct T37 const utmpz ) ;
void /*static*/thread38 (  struct T38 const utmpz ) ;
void /*static*/thread39 (  struct T39 const utmpz ) ;
void /*static*/thread40 (  struct T40 const utmpz ) ;
void /*static*/thread41 (  struct T41 const utmpz ) ;
void /*static*/thread53 (  struct T53 const utmpz ) ;
void /*static*/thread54 (  struct T54 const utmpz ) ;
void /*static*/thread55 (  struct T55 const utmpz ) ;
void /*static*/thread56 (  struct T56 const utmpz ) ;
void /*static*/thread57 (  struct T57 const utmpz ) ;
void /*static*/thread58 (  struct T58 const utmpz ) ;
void /*static*/thread59 (  struct T59 const utmpz ) ;
void /*static*/thread60 (  struct T60 const utmpz ) ;
void /*static*/thread61 (  struct T61 const utmpz ) ;
void /*static*/thread62 (  struct T62 const utmpz ) ;
void /*static*/thread63 (  struct T63 const utmpz ) ;
void /*static*/thread64 (  struct T64 const utmpz ) ;
void /*static*/thread65 (  struct T65 const utmpz ) ;
void /*static*/thread66 (  struct T66 const utmpz ) ;
void /*static*/thread67 (  struct T67 const utmpz ) ;
void /*static*/thread68 (  struct T68 const utmpz ) ;
void /*static*/thread69 (  struct T69 const utmpz ) ;
void /*static*/thread70 (  struct T70 const utmpz ) ;
void /*static*/thread71 (  struct T71 const utmpz ) ;
void /*static*/thread72 (  struct T72 const utmpz ) ;
void /*static*/thread73 (  struct T73 const utmpz ) ;
void /*static*/thread74 (  struct T74 const utmpz ) ;
void /*static*/thread75 (  struct T75 const utmpz ) ;
void /*static*/thread76 (  struct T76 const utmpz ) ;
void /*static*/thread77 (  struct T77 const utmpz ) ;
void /*static*/thread78 (  struct T78 const utmpz ) ;
void /*static*/thread89 (  struct T89 const utmpz ) ;
void /*static*/thread90 (  struct T90 const utmpz ) ;
void /*static*/thread91 (  struct T91 const utmpz ) ;

T1 T1_T1 ( struct T1 *T1THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_RES ) ;

T2 T2_T2 ( struct T2 *T2THIS, const int32_t a_i ,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T3 T3_T3 ( struct T3 *T3THIS, const int32_t a_i ,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T4 T4_T4 ( struct T4 *T4THIS, const int32_t a_i ,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T5 T5_T5 ( struct T5 *T5THIS,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T6 T6_T6 ( struct T6 *T6THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T7 T7_T7 ( struct T7 *T7THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T8 T8_T8 ( struct T8 *T8THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T9 T9_T9 ( struct T9 *T9THIS,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T10 T10_T10 ( struct T10 *T10THIS, const int32_t a_i ,  struct doubleRefArray3 const a_res ,  struct MGOP  * const a_X10_TEMP0 ) ;

T11 T11_T11 ( struct T11 *T11THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T12 T12_T12 ( struct T12 *T12THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T13 T13_T13 ( struct T13 *T13THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T14 T14_T14 ( struct T14 *T14THIS,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T15 T15_T15 ( struct T15 *T15THIS, const int32_t a_i ,  struct doubleRefArray3 const a_arg ,  struct MGOP  * const a_X10_TEMP0 ) ;

T16 T16_T16 ( struct T16 *T16THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T17 T17_T17 ( struct T17 *T17THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T18 T18_T18 ( struct T18 *T18THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T19 T19_T19 ( struct T19 *T19THIS,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T20 T20_T20 ( struct T20 *T20THIS, const place_t a_h ,  struct Point3 const a_p ,  struct doubleRefArray3 const a_a_src ,  struct doubleRefArray3 const a_a_dest ) ;

T21 T21_T21 ( struct T21 *T21THIS, const place_t a_h ,  struct Point3 const a_p , const int32_t a_a_trans2 , const int32_t a_a_trans1 , const int32_t a_a_trans0 ,  struct doubleRefArray3 const a_a_src ,  struct doubleRefArray3 const a_a_dest ) ;

T22 T22_T22 ( struct T22 *T22THIS, const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T23 T23_T23 ( struct T23 *T23THIS, const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T24 T24_T24 ( struct T24 *T24THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T25 T25_T25 ( struct T25 *T25THIS, const int32_t a_i ,  struct doubleRefArray1 const a_results ,  struct LevelData const a_X10_TEMP0 ) ;

T26 T26_T26 ( struct T26 *T26THIS, const int32_t a_i , const int32_t a_a_CLASS ,  struct LevelData const a_X10_TEMP0 ) ;

T27 T27_T27 ( struct T27 *T27THIS, const int32_t a_i , const double a_a_db ,  struct LevelData const a_X10_TEMP0 ) ;

T28 T28_T28 ( struct T28 *T28THIS, const int32_t a_i ,  struct LevelData const a_a_LD ,  struct LevelData const a_X10_TEMP0 ) ;

T29 T29_T29 ( struct T29 *T29THIS, const int32_t a_i ,  struct LevelData const a_a_LD ,  struct LevelData const a_X10_TEMP0 ) ;

T30 T30_T30 ( struct T30 *T30THIS, const int32_t a_i , const int32_t a_jj ,  struct LevelData const a_X10_TEMP0 ) ;

T31 T31_T31 ( struct T31 *T31THIS,  struct LevelData const a_X10_TEMP0 ) ;

T32 T32_T32 ( struct T32 *T32THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T33 T33_T33 ( struct T33 *T33THIS,  struct Region3RefArray1 const a_aRecv , const place_t a_h , const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T34 T34_T34 ( struct T34 *T34THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T35 T35_T35 ( struct T35 *T35THIS,  struct Region3RefArray1 const a_aRecv , const place_t a_h , const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T36 T36_T36 ( struct T36 *T36THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T37 T37_T37 ( struct T37 *T37THIS,  struct Region3RefArray1 const a_aRecv , const place_t a_h , const int32_t a_j , const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T38 T38_T38 ( struct T38 *T38THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct WrapperStub * const a_RX10_TEMP6 ) ;

T39 T39_T39 ( struct T39 *T39THIS,  struct WrapperRefArray1 const a_aRecv , const place_t a_h , const int32_t a_i ,  struct LevelData const a_X10_TEMP0 ) ;

T40 T40_T40 ( struct T40 *T40THIS, const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 , const double a_initVal ) ;

T41 T41_T41 ( struct T41 *T41THIS,  struct doubleRefArray1 const a_localSumArray , const place_t a_source , const int32_t a_zero ,  struct doubleRefArray1 const a_sumArray ) ;

T42 T42_T42 ( struct T42 *T42THIS, struct MGOP * MGOPTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP14 , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LevelDataStub * const a_RX10_TEMP6 ) ;

T43 T43_T43 ( struct T43 *T43THIS, struct MGOP * MGOPTHIS /*this*/ ,  struct Region1 const a_RX10_TEMP38 , const int32_t a_RX10_TEMP36 , const place_t a_RX10_TEMP32 , const int32_t a_RX10_TEMP31 , /*Updatable ARRAY*/ struct LevelDataStub * const a_RX10_TEMP30 ) ;

T44 T44_T44 ( struct T44 *T44THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct Dist3 const a_disi , const int32_t a_k ,  struct WrapperRefArray1 const a_temp_m_u ) ;

T45 T45_T45 ( struct T45 *T45THIS, struct LevelData * LevelDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Dist3Stub * const a_RX10_TEMP6 ) ;

T46 T46_T46 ( struct T46 *T46THIS, struct LevelData * LevelDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T47 T47_T47 ( struct T47 *T47THIS, struct LevelData * LevelDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T48 T48_T48 ( struct T48 *T48THIS, struct LevelData * LevelDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct WrapperStub * const a_RX10_TEMP6 ) ;

T49 T49_T49 ( struct T49 *T49THIS, struct LevelData * LevelDataTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T50 T50_T50 ( struct T50 *T50THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP12 , const place_t a_RX10_TEMP8 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T51 T51_T51 ( struct T51 *T51THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP33 , const place_t a_RX10_TEMP29 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T52 T52_T52 ( struct T52 *T52THIS, struct Timer * TimerTHIS /*this*/ , const int32_t a_RX10_TEMP54 , const place_t a_RX10_TEMP50 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T53 T53_T53 ( struct T53 *T53THIS, const int32_t a_i ,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T54 T54_T54 ( struct T54 *T54THIS, const int32_t a_i ,  struct LevelData const a_a_arg2 ,  struct LevelData const a_a_arg1 ,  struct LevelData const a_a_res ) ;

T55 T55_T55 ( struct T55 *T55THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T56 T56_T56 ( struct T56 *T56THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T57 T57_T57 ( struct T57 *T57THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T58 T58_T58 ( struct T58 *T58THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T59 T59_T59 ( struct T59 *T59THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T60 T60_T60 ( struct T60 *T60THIS, const int32_t a_i ,  struct LevelData const a_a_arg ,  struct LevelData const a_a_res ) ;

T61 T61_T61 ( struct T61 *T61THIS, const double a_d ,  struct Point3 const a_p ,  struct doubleRefArray3 const a_a_dest ) ;

T62 T62_T62 ( struct T62 *T62THIS, const double a_d ,  struct Point3 const a_p ,  struct doubleRefArray3 const a_a_dest ) ;

T63 T63_T63 ( struct T63 *T63THIS,  struct doubleStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T64 T64_T64 ( struct T64 *T64THIS, const int32_t a_RX10_TEMP61 , const place_t a_RX10_TEMP57 , const int32_t a_RX10_TEMP56 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP55 ) ;

T65 T65_T65 ( struct T65 *T65THIS,  struct doubleRefArray1 const a_aRecv , const place_t a_h ,  struct Point3 const a_p ,  struct doubleRefArray3 const a_temp ) ;

T66 T66_T66 ( struct T66 *T66THIS, const int32_t a_z , const int32_t a_y , const int32_t a_x ,  struct Point3 const a_p ,  struct Region3 const a_R ,  struct doubleRefArray3 const a_temp , const int32_t a_a_CLASS ) ;

T67 T67_T67 ( struct T67 *T67THIS, const double a_tp ,  struct Point3 const a_p ,  struct doubleRefArray3 const a_u ) ;

T68 T68_T68 ( struct T68 *T68THIS, const int32_t a_i , const int32_t a_j ,  struct LevelData const a_X10_TEMP0 ) ;

T69 T69_T69 ( struct T69 *T69THIS,  struct Region3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T70 T70_T70 ( struct T70 *T70THIS,  struct Region3 const a_temp3 ,  struct Region3RefArray1 const a_aRecv ) ;

T71 T71_T71 ( struct T71 *T71THIS,  struct Region3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T72 T72_T72 ( struct T72 *T72THIS,  struct Region3 const a_temp3 ,  struct Region3RefArray1 const a_aRecv ) ;

T73 T73_T73 ( struct T73 *T73THIS,  struct Region3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T74 T74_T74 ( struct T74 *T74THIS,  struct Region3 const a_temp4 ,  struct Region3RefArray1 const a_aRecv ) ;

T75 T75_T75 ( struct T75 *T75THIS,  struct WrapperStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct WrapperStub * const a_RX10_TEMP6 ) ;

T76 T76_T76 ( struct T76 *T76THIS,  struct Wrapper const a_temp4 ,  struct WrapperRefArray1 const a_aRecv ) ;

T77 T77_T77 ( struct T77 *T77THIS,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T78 T78_T78 ( struct T78 *T78THIS, const double a_localSum , const int32_t a_index ,  struct doubleRefArray1 const a_localSumArray ) ;

T79 T79_T79 ( struct T79 *T79THIS, struct MGOP * MGOPTHIS /*this*/ ,  struct LevelDataStub const a_RX10_TEMP19 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct LevelDataStub * const a_RX10_TEMP6 ) ;

T80 T80_T80 ( struct T80 *T80THIS, struct MGOP * MGOPTHIS /*this*/ ,  struct LevelDataStub const a_RX10_TEMP43 , const int32_t a_RX10_TEMP31 , /*Updatable ARRAY*/ struct LevelDataStub * const a_RX10_TEMP30 ) ;

T81 T81_T81 ( struct T81 *T81THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct Dist3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Dist3Stub * const a_RX10_TEMP6 ) ;

T82 T82_T82 ( struct T82 *T82THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct Region3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T83 T83_T83 ( struct T83 *T83THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct Region3Stub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct Region3Stub * const a_RX10_TEMP6 ) ;

T84 T84_T84 ( struct T84 *T84THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct WrapperStub const a_RX10_TEMP15 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct WrapperStub * const a_RX10_TEMP6 ) ;

T85 T85_T85 ( struct T85 *T85THIS, struct LevelData * LevelDataTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T86 T86_T86 ( struct T86 *T86THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP16 , const int32_t a_RX10_TEMP7 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP6 ) ;

T87 T87_T87 ( struct T87 *T87THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP37 , const int32_t a_RX10_TEMP28 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP27 ) ;

T88 T88_T88 ( struct T88 *T88THIS, struct Timer * TimerTHIS /*this*/ ,  struct doubleStub const a_RX10_TEMP58 , const int32_t a_RX10_TEMP49 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP48 ) ;

T89 T89_T89 ( struct T89 *T89THIS,  struct doubleStub const a_RX10_TEMP64 , const int32_t a_RX10_TEMP56 , /*Updatable ARRAY*/ struct doubleStub * const a_RX10_TEMP55 ) ;

T90 T90_T90 ( struct T90 *T90THIS, const double a_temp3 ,  struct doubleRefArray1 const a_aRecv ) ;

T91 T91_T91 ( struct T91 *T91THIS, const int32_t a_p , const int32_t a_ii , const int32_t a_dest2 , const int32_t a_dest1 , const int32_t a_dest0 , const int32_t a_jj ,  struct LevelData const a_X10_TEMP0 ) ;

Util *Util_Util ( struct Util *UtilTHIS) ;

Region3RefArray1 Region3RefArray1_Region3RefArray1 ( struct Region3RefArray1 *Region3RefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct Region3Stub * const contents_ ) ;

Region3RefArray2 Region3RefArray2_Region3RefArray2 ( struct Region3RefArray2 *Region3RefArray2THIS,  struct Dist2 const distValue_ , /*VALUE ARRAY*/ struct Region3Stub * const contents_ ) ;

Wrapper Wrapper_Wrapper ( struct Wrapper *WrapperTHIS,  struct doubleRefArray3 const a_array ) ;
MGDriver* MGDriver_MGDriver(struct MGDriver * MGDriverTHIS);
;

doubleStub doubleStub_doubleStub ( struct doubleStub *doubleStubTHIS, /*Updatable ARRAY*/ double * const localArray_ ) ;

LevelDataStub LevelDataStub_LevelDataStub ( struct LevelDataStub *LevelDataStubTHIS, /*Updatable ARRAY*/ struct LevelData * const localArray_ ) ;

Dist3RefArray1 Dist3RefArray1_Dist3RefArray1 ( struct Dist3RefArray1 *Dist3RefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct Dist3Stub * const contents_ ) ;

LevelData LevelData_LevelData ( struct LevelData *LevelDataTHIS, const int32_t a_problemDomainSize , const uint32_t a_isParallel ) ;
Dist3RefArray1 LevelData_getDist3Array ( struct LevelData *LevelDataTHIS,  struct Dist1 const d ) ;
Region3RefArray1 LevelData_getRegion3Array1 ( struct LevelData *LevelDataTHIS,  struct Dist1 const d ) ;
Region3RefArray2 LevelData_getRegion3Array2 ( struct LevelData *LevelDataTHIS,  struct Dist2 const d ) ;
WrapperRefArray1 LevelData_getWrapperArray ( struct LevelData *LevelDataTHIS,  struct Dist1 const d ) ;
doubleRefArray3 LevelData_getDoubleArray ( struct LevelData *LevelDataTHIS,  struct Dist3 const d ) ;
void thread44 ( struct LevelData *LevelDataTHIS,  struct T44 const utmpz ) ;
void thread45 ( struct LevelData *LevelDataTHIS,  struct T45 const utmpz ) ;
void thread46 ( struct LevelData *LevelDataTHIS,  struct T46 const utmpz ) ;
void thread47 ( struct LevelData *LevelDataTHIS,  struct T47 const utmpz ) ;
void thread48 ( struct LevelData *LevelDataTHIS,  struct T48 const utmpz ) ;
void thread49 ( struct LevelData *LevelDataTHIS,  struct T49 const utmpz ) ;
void thread81 ( struct LevelData *LevelDataTHIS,  struct T81 const utmpz ) ;
void thread82 ( struct LevelData *LevelDataTHIS,  struct T82 const utmpz ) ;
void thread83 ( struct LevelData *LevelDataTHIS,  struct T83 const utmpz ) ;
void thread84 ( struct LevelData *LevelDataTHIS,  struct T84 const utmpz ) ;
void thread85 ( struct LevelData *LevelDataTHIS,  struct T85 const utmpz ) ;

Region3Stub Region3Stub_Region3Stub ( struct Region3Stub *Region3StubTHIS, /*Updatable ARRAY*/ struct Region3 * const localArray_ ) ;

doubleRefArray1 doubleRefArray1_doubleRefArray1 ( struct doubleRefArray1 *doubleRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Dist1 Dist1_Dist1 ( struct Dist1 *Dist1THIS,  struct Region1 const dReg_ ,  struct Dist const dDist_ ) ;

LevelDataRefArray1 LevelDataRefArray1_LevelDataRefArray1 ( struct LevelDataRefArray1 *LevelDataRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct LevelDataStub * const contents_ ) ;

Dist2 Dist2_Dist2 ( struct Dist2 *Dist2THIS,  struct Region2 const dReg_ ,  struct Dist const dDist_ ) ;

Dist3 Dist3_Dist3 ( struct Dist3 *Dist3THIS,  struct Region3 const dReg_ ,  struct Dist const dDist_ ) ;

Region3ValArray3 Region3ValArray3_Region3ValArray3 ( struct Region3ValArray3 *Region3ValArray3THIS,  struct Region3 const regionValue_ , /*VALUE ARRAY*/ struct Region3 * const contents_ ) ;

doubleRefArray3 doubleRefArray3_doubleRefArray3 ( struct doubleRefArray3 *doubleRefArray3THIS,  struct Dist3 const distValue_ , /*VALUE ARRAY*/ struct doubleStub * const contents_ ) ;

Timer *Timer_Timer ( struct Timer *TimerTHIS) ;
void thread50 ( struct Timer *TimerTHIS,  struct T50 const utmpz ) ;
void thread51 ( struct Timer *TimerTHIS,  struct T51 const utmpz ) ;
void thread52 ( struct Timer *TimerTHIS,  struct T52 const utmpz ) ;
void thread86 ( struct Timer *TimerTHIS,  struct T86 const utmpz ) ;
void thread87 ( struct Timer *TimerTHIS,  struct T87 const utmpz ) ;
void thread88 ( struct Timer *TimerTHIS,  struct T88 const utmpz ) ;

Region1 Region1_Region1_2( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ ) ;

Region1 Region1_Region1_4( struct Region1 *Region1THIS, /*VALUE ARRAY*/ struct Point1 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ ) ;

WrapperRefArray1 WrapperRefArray1_WrapperRefArray1 ( struct WrapperRefArray1 *WrapperRefArray1THIS,  struct Dist1 const distValue_ , /*VALUE ARRAY*/ struct WrapperStub * const contents_ ) ;

Region3 Region3_Region3_2( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ ) ;

Region3 Region3_Region3_8( struct Region3 *Region3THIS, /*VALUE ARRAY*/ struct Point3 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ , const int32_t low2_ , const int32_t dim2_ ) ;

Region2 Region2_Region2_2( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ ) ;

Region2 Region2_Region2_6( struct Region2 *Region2THIS, /*VALUE ARRAY*/ struct Point2 * const pointArray_ , const int32_t regSize_ , const int32_t low0_ , const int32_t dim0_ , const int32_t low1_ , const int32_t dim1_ ) ;

Point1 Point1_Point1 ( struct Point1 *Point1THIS, const int32_t f0_ ) ;

Point2 Point2_Point2 ( struct Point2 *Point2THIS, const int32_t f0_ , const int32_t f1_ ) ;

Point3 Point3_Point3 ( struct Point3 *Point3THIS, const int32_t f0_ , const int32_t f1_ , const int32_t f2_ ) ;

Dist Dist_Dist ( struct Dist *DistTHIS, /*VALUE ARRAY*/ place_t * const vPlaceArray , const int32_t arraySize ) ;

Dist3Stub Dist3Stub_Dist3Stub ( struct Dist3Stub *Dist3StubTHIS, /*Updatable ARRAY*/ struct Dist3 * const localArray_ ) ;

WrapperStub WrapperStub_WrapperStub ( struct WrapperStub *WrapperStubTHIS, /*Updatable ARRAY*/ struct Wrapper * const localArray_ ) ;

MGOP *MGOP_MGOP ( struct MGOP *MGOPTHIS, const int32_t a_size ) ;
void thread42 ( struct MGOP *MGOPTHIS,  struct T42 const utmpz ) ;
void thread43 ( struct MGOP *MGOPTHIS,  struct T43 const utmpz ) ;
void thread79 ( struct MGOP *MGOPTHIS,  struct T79 const utmpz ) ;
void thread80 ( struct MGOP *MGOPTHIS,  struct T80 const utmpz ) ;
const double getTIME(); 
void _thread_run(uint32_t method, void * params);
void _thread_run_local(uint32_t method, void * params);
int32_t getSizeOfdoubleStub( struct doubleStub * className);
int32_t getSizeOfLevelDataStub( struct LevelDataStub * className);
int32_t getSizeOfDist3RefArray1( struct Dist3RefArray1 * className);
int32_t getSizeOfT29( struct T29 * className);
int32_t getSizeOfT28( struct T28 * className);
int32_t getSizeOfT27( struct T27 * className);
int32_t getSizeOfT26( struct T26 * className);
int32_t getSizeOfT25( struct T25 * className);
int32_t getSizeOfT24( struct T24 * className);
int32_t getSizeOfT23( struct T23 * className);
int32_t getSizeOfT22( struct T22 * className);
int32_t getSizeOfT21( struct T21 * className);
int32_t getSizeOfT20( struct T20 * className);
int32_t getSizeOfWrapperRefArray1( struct WrapperRefArray1 * className);
int32_t getSizeOfT38( struct T38 * className);
int32_t getSizeOfT37( struct T37 * className);
int32_t getSizeOfT39( struct T39 * className);
int32_t getSizeOfT34( struct T34 * className);
int32_t getSizeOfT33( struct T33 * className);
int32_t getSizeOfT36( struct T36 * className);
int32_t getSizeOfT35( struct T35 * className);
int32_t getSizeOfT30( struct T30 * className);
int32_t getSizeOfT32( struct T32 * className);
int32_t getSizeOfT31( struct T31 * className);
int32_t getSizeOfWrapper( struct Wrapper * className);
int32_t getSizeOfT49( struct T49 * className);
int32_t getSizeOfT48( struct T48 * className);
int32_t getSizeOfT43( struct T43 * className);
int32_t getSizeOfT42( struct T42 * className);
int32_t getSizeOfT41( struct T41 * className);
int32_t getSizeOfT40( struct T40 * className);
int32_t getSizeOfT47( struct T47 * className);
int32_t getSizeOfT46( struct T46 * className);
int32_t getSizeOfT45( struct T45 * className);
int32_t getSizeOfT44( struct T44 * className);
int32_t getSizeOfRegion3Stub( struct Region3Stub * className);
int32_t getSizeOfDist1( struct Dist1 * className);
int32_t getSizeOfDist2( struct Dist2 * className);
int32_t getSizeOfDist3( struct Dist3 * className);
int32_t getSizeOfT50( struct T50 * className);
int32_t getSizeOfT59( struct T59 * className);
int32_t getSizeOfT52( struct T52 * className);
int32_t getSizeOfT51( struct T51 * className);
int32_t getSizeOfT54( struct T54 * className);
int32_t getSizeOfT53( struct T53 * className);
int32_t getSizeOfT56( struct T56 * className);
int32_t getSizeOfT55( struct T55 * className);
int32_t getSizeOfT58( struct T58 * className);
int32_t getSizeOfT57( struct T57 * className);
int32_t getSizeOfT75( struct T75 * className);
int32_t getSizeOfT76( struct T76 * className);
int32_t getSizeOfT73( struct T73 * className);
int32_t getSizeOfRegion3RefArray1( struct Region3RefArray1 * className);
int32_t getSizeOfT74( struct T74 * className);
int32_t getSizeOfRegion3RefArray2( struct Region3RefArray2 * className);
int32_t getSizeOfT79( struct T79 * className);
int32_t getSizeOfT77( struct T77 * className);
int32_t getSizeOfT78( struct T78 * className);
int32_t getSizeOfT72( struct T72 * className);
int32_t getSizeOfT71( struct T71 * className);
int32_t getSizeOfT70( struct T70 * className);
int32_t getSizeOfT62( struct T62 * className);
int32_t getSizeOfdoubleRefArray1( struct doubleRefArray1 * className);
int32_t getSizeOfT63( struct T63 * className);
int32_t getSizeOfT64( struct T64 * className);
int32_t getSizeOfLevelDataRefArray1( struct LevelDataRefArray1 * className);
int32_t getSizeOfT65( struct T65 * className);
int32_t getSizeOfT66( struct T66 * className);
int32_t getSizeOfT67( struct T67 * className);
int32_t getSizeOfRegion3ValArray3( struct Region3ValArray3 * className);
int32_t getSizeOfT68( struct T68 * className);
int32_t getSizeOfdoubleRefArray3( struct doubleRefArray3 * className);
int32_t getSizeOfT69( struct T69 * className);
int32_t getSizeOfRegion1( struct Region1 * className);
int32_t getSizeOfRegion3( struct Region3 * className);
int32_t getSizeOfRegion2( struct Region2 * className);
int32_t getSizeOfPoint1( struct Point1 * className);
int32_t getSizeOfPoint2( struct Point2 * className);
int32_t getSizeOfPoint3( struct Point3 * className);
int32_t getSizeOfDist3Stub( struct Dist3Stub * className);
int32_t getSizeOfWrapperStub( struct WrapperStub * className);
int32_t getSizeOfT61( struct T61 * className);
int32_t getSizeOfT60( struct T60 * className);
int32_t getSizeOfT6( struct T6 * className);
int32_t getSizeOfT7( struct T7 * className);
int32_t getSizeOfT4( struct T4 * className);
int32_t getSizeOfT5( struct T5 * className);
int32_t getSizeOfLevelData( struct LevelData * className);
int32_t getSizeOfT8( struct T8 * className);
int32_t getSizeOfT9( struct T9 * className);
int32_t getSizeOfT91( struct T91 * className);
int32_t getSizeOfT90( struct T90 * className);
int32_t getSizeOfT88( struct T88 * className);
int32_t getSizeOfT89( struct T89 * className);
int32_t getSizeOfT84( struct T84 * className);
int32_t getSizeOfT85( struct T85 * className);
int32_t getSizeOfT86( struct T86 * className);
int32_t getSizeOfT87( struct T87 * className);
int32_t getSizeOfT1( struct T1 * className);
int32_t getSizeOfT3( struct T3 * className);
int32_t getSizeOfT2( struct T2 * className);
int32_t getSizeOfT10( struct T10 * className);
int32_t getSizeOfT11( struct T11 * className);
int32_t getSizeOfT12( struct T12 * className);
int32_t getSizeOfT13( struct T13 * className);
int32_t getSizeOfDist( struct Dist * className);
int32_t getSizeOfT14( struct T14 * className);
int32_t getSizeOfT15( struct T15 * className);
int32_t getSizeOfT81( struct T81 * className);
int32_t getSizeOfT16( struct T16 * className);
int32_t getSizeOfT80( struct T80 * className);
int32_t getSizeOfT17( struct T17 * className);
int32_t getSizeOfT83( struct T83 * className);
int32_t getSizeOfT18( struct T18 * className);
int32_t getSizeOfT82( struct T82 * className);
int32_t getSizeOfT19( struct T19 * className);
void* deepCopydoubleStub( struct doubleStub * className, void * offset);
void* deepCopyLevelDataStub( struct LevelDataStub * className, void * offset);
void* deepCopyDist3RefArray1( struct Dist3RefArray1 * className, void * offset);
void* deepCopyT29( struct T29 * className, void * offset);
void* deepCopyT28( struct T28 * className, void * offset);
void* deepCopyT27( struct T27 * className, void * offset);
void* deepCopyT26( struct T26 * className, void * offset);
void* deepCopyT25( struct T25 * className, void * offset);
void* deepCopyT24( struct T24 * className, void * offset);
void* deepCopyT23( struct T23 * className, void * offset);
void* deepCopyT22( struct T22 * className, void * offset);
void* deepCopyT21( struct T21 * className, void * offset);
void* deepCopyT20( struct T20 * className, void * offset);
void* deepCopyWrapperRefArray1( struct WrapperRefArray1 * className, void * offset);
void* deepCopyT38( struct T38 * className, void * offset);
void* deepCopyT37( struct T37 * className, void * offset);
void* deepCopyT39( struct T39 * className, void * offset);
void* deepCopyT34( struct T34 * className, void * offset);
void* deepCopyT33( struct T33 * className, void * offset);
void* deepCopyT36( struct T36 * className, void * offset);
void* deepCopyT35( struct T35 * className, void * offset);
void* deepCopyT30( struct T30 * className, void * offset);
void* deepCopyT32( struct T32 * className, void * offset);
void* deepCopyT31( struct T31 * className, void * offset);
void* deepCopyWrapper( struct Wrapper * className, void * offset);
void* deepCopyT49( struct T49 * className, void * offset);
void* deepCopyT48( struct T48 * className, void * offset);
void* deepCopyT43( struct T43 * className, void * offset);
void* deepCopyT42( struct T42 * className, void * offset);
void* deepCopyT41( struct T41 * className, void * offset);
void* deepCopyT40( struct T40 * className, void * offset);
void* deepCopyT47( struct T47 * className, void * offset);
void* deepCopyT46( struct T46 * className, void * offset);
void* deepCopyT45( struct T45 * className, void * offset);
void* deepCopyT44( struct T44 * className, void * offset);
void* deepCopyRegion3Stub( struct Region3Stub * className, void * offset);
void* deepCopyDist1( struct Dist1 * className, void * offset);
void* deepCopyDist2( struct Dist2 * className, void * offset);
void* deepCopyDist3( struct Dist3 * className, void * offset);
void* deepCopyT50( struct T50 * className, void * offset);
void* deepCopyT59( struct T59 * className, void * offset);
void* deepCopyT52( struct T52 * className, void * offset);
void* deepCopyT51( struct T51 * className, void * offset);
void* deepCopyT54( struct T54 * className, void * offset);
void* deepCopyT53( struct T53 * className, void * offset);
void* deepCopyT56( struct T56 * className, void * offset);
void* deepCopyT55( struct T55 * className, void * offset);
void* deepCopyT58( struct T58 * className, void * offset);
void* deepCopyT57( struct T57 * className, void * offset);
void* deepCopyT75( struct T75 * className, void * offset);
void* deepCopyT76( struct T76 * className, void * offset);
void* deepCopyT73( struct T73 * className, void * offset);
void* deepCopyRegion3RefArray1( struct Region3RefArray1 * className, void * offset);
void* deepCopyT74( struct T74 * className, void * offset);
void* deepCopyRegion3RefArray2( struct Region3RefArray2 * className, void * offset);
void* deepCopyT79( struct T79 * className, void * offset);
void* deepCopyT77( struct T77 * className, void * offset);
void* deepCopyT78( struct T78 * className, void * offset);
void* deepCopyT72( struct T72 * className, void * offset);
void* deepCopyT71( struct T71 * className, void * offset);
void* deepCopyT70( struct T70 * className, void * offset);
void* deepCopyT62( struct T62 * className, void * offset);
void* deepCopydoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void* deepCopyT63( struct T63 * className, void * offset);
void* deepCopyT64( struct T64 * className, void * offset);
void* deepCopyLevelDataRefArray1( struct LevelDataRefArray1 * className, void * offset);
void* deepCopyT65( struct T65 * className, void * offset);
void* deepCopyT66( struct T66 * className, void * offset);
void* deepCopyT67( struct T67 * className, void * offset);
void* deepCopyRegion3ValArray3( struct Region3ValArray3 * className, void * offset);
void* deepCopyT68( struct T68 * className, void * offset);
void* deepCopydoubleRefArray3( struct doubleRefArray3 * className, void * offset);
void* deepCopyT69( struct T69 * className, void * offset);
void* deepCopyRegion1( struct Region1 * className, void * offset);
void* deepCopyRegion3( struct Region3 * className, void * offset);
void* deepCopyRegion2( struct Region2 * className, void * offset);
void* deepCopyPoint1( struct Point1 * className, void * offset);
void* deepCopyPoint2( struct Point2 * className, void * offset);
void* deepCopyPoint3( struct Point3 * className, void * offset);
void* deepCopyDist3Stub( struct Dist3Stub * className, void * offset);
void* deepCopyWrapperStub( struct WrapperStub * className, void * offset);
void* deepCopyT61( struct T61 * className, void * offset);
void* deepCopyT60( struct T60 * className, void * offset);
void* deepCopyT6( struct T6 * className, void * offset);
void* deepCopyT7( struct T7 * className, void * offset);
void* deepCopyT4( struct T4 * className, void * offset);
void* deepCopyT5( struct T5 * className, void * offset);
void* deepCopyLevelData( struct LevelData * className, void * offset);
void* deepCopyT8( struct T8 * className, void * offset);
void* deepCopyT9( struct T9 * className, void * offset);
void* deepCopyT91( struct T91 * className, void * offset);
void* deepCopyT90( struct T90 * className, void * offset);
void* deepCopyT88( struct T88 * className, void * offset);
void* deepCopyT89( struct T89 * className, void * offset);
void* deepCopyT84( struct T84 * className, void * offset);
void* deepCopyT85( struct T85 * className, void * offset);
void* deepCopyT86( struct T86 * className, void * offset);
void* deepCopyT87( struct T87 * className, void * offset);
void* deepCopyT1( struct T1 * className, void * offset);
void* deepCopyT3( struct T3 * className, void * offset);
void* deepCopyT2( struct T2 * className, void * offset);
void* deepCopyT10( struct T10 * className, void * offset);
void* deepCopyT11( struct T11 * className, void * offset);
void* deepCopyT12( struct T12 * className, void * offset);
void* deepCopyT13( struct T13 * className, void * offset);
void* deepCopyDist( struct Dist * className, void * offset);
void* deepCopyT14( struct T14 * className, void * offset);
void* deepCopyT15( struct T15 * className, void * offset);
void* deepCopyT81( struct T81 * className, void * offset);
void* deepCopyT16( struct T16 * className, void * offset);
void* deepCopyT80( struct T80 * className, void * offset);
void* deepCopyT17( struct T17 * className, void * offset);
void* deepCopyT83( struct T83 * className, void * offset);
void* deepCopyT18( struct T18 * className, void * offset);
void* deepCopyT82( struct T82 * className, void * offset);
void* deepCopyT19( struct T19 * className, void * offset);
void * fixPointerdoubleStub( struct doubleStub * className, void * offset);
void * fixPointerLevelDataStub( struct LevelDataStub * className, void * offset);
void * fixPointerDist3RefArray1( struct Dist3RefArray1 * className, void * offset);
void * fixPointerT29( struct T29 * className, void * offset);
void * fixPointerT28( struct T28 * className, void * offset);
void * fixPointerT27( struct T27 * className, void * offset);
void * fixPointerT26( struct T26 * className, void * offset);
void * fixPointerT25( struct T25 * className, void * offset);
void * fixPointerT24( struct T24 * className, void * offset);
void * fixPointerT23( struct T23 * className, void * offset);
void * fixPointerT22( struct T22 * className, void * offset);
void * fixPointerT21( struct T21 * className, void * offset);
void * fixPointerT20( struct T20 * className, void * offset);
void * fixPointerWrapperRefArray1( struct WrapperRefArray1 * className, void * offset);
void * fixPointerT38( struct T38 * className, void * offset);
void * fixPointerT37( struct T37 * className, void * offset);
void * fixPointerT39( struct T39 * className, void * offset);
void * fixPointerT34( struct T34 * className, void * offset);
void * fixPointerT33( struct T33 * className, void * offset);
void * fixPointerT36( struct T36 * className, void * offset);
void * fixPointerT35( struct T35 * className, void * offset);
void * fixPointerT30( struct T30 * className, void * offset);
void * fixPointerT32( struct T32 * className, void * offset);
void * fixPointerT31( struct T31 * className, void * offset);
void * fixPointerWrapper( struct Wrapper * className, void * offset);
void * fixPointerT49( struct T49 * className, void * offset);
void * fixPointerT48( struct T48 * className, void * offset);
void * fixPointerT43( struct T43 * className, void * offset);
void * fixPointerT42( struct T42 * className, void * offset);
void * fixPointerT41( struct T41 * className, void * offset);
void * fixPointerT40( struct T40 * className, void * offset);
void * fixPointerT47( struct T47 * className, void * offset);
void * fixPointerT46( struct T46 * className, void * offset);
void * fixPointerT45( struct T45 * className, void * offset);
void * fixPointerT44( struct T44 * className, void * offset);
void * fixPointerRegion3Stub( struct Region3Stub * className, void * offset);
void * fixPointerDist1( struct Dist1 * className, void * offset);
void * fixPointerDist2( struct Dist2 * className, void * offset);
void * fixPointerDist3( struct Dist3 * className, void * offset);
void * fixPointerT50( struct T50 * className, void * offset);
void * fixPointerT59( struct T59 * className, void * offset);
void * fixPointerT52( struct T52 * className, void * offset);
void * fixPointerT51( struct T51 * className, void * offset);
void * fixPointerT54( struct T54 * className, void * offset);
void * fixPointerT53( struct T53 * className, void * offset);
void * fixPointerT56( struct T56 * className, void * offset);
void * fixPointerT55( struct T55 * className, void * offset);
void * fixPointerT58( struct T58 * className, void * offset);
void * fixPointerT57( struct T57 * className, void * offset);
void * fixPointerT75( struct T75 * className, void * offset);
void * fixPointerT76( struct T76 * className, void * offset);
void * fixPointerT73( struct T73 * className, void * offset);
void * fixPointerRegion3RefArray1( struct Region3RefArray1 * className, void * offset);
void * fixPointerT74( struct T74 * className, void * offset);
void * fixPointerRegion3RefArray2( struct Region3RefArray2 * className, void * offset);
void * fixPointerT79( struct T79 * className, void * offset);
void * fixPointerT77( struct T77 * className, void * offset);
void * fixPointerT78( struct T78 * className, void * offset);
void * fixPointerT72( struct T72 * className, void * offset);
void * fixPointerT71( struct T71 * className, void * offset);
void * fixPointerT70( struct T70 * className, void * offset);
void * fixPointerT62( struct T62 * className, void * offset);
void * fixPointerdoubleRefArray1( struct doubleRefArray1 * className, void * offset);
void * fixPointerT63( struct T63 * className, void * offset);
void * fixPointerT64( struct T64 * className, void * offset);
void * fixPointerLevelDataRefArray1( struct LevelDataRefArray1 * className, void * offset);
void * fixPointerT65( struct T65 * className, void * offset);
void * fixPointerT66( struct T66 * className, void * offset);
void * fixPointerT67( struct T67 * className, void * offset);
void * fixPointerRegion3ValArray3( struct Region3ValArray3 * className, void * offset);
void * fixPointerT68( struct T68 * className, void * offset);
void * fixPointerdoubleRefArray3( struct doubleRefArray3 * className, void * offset);
void * fixPointerT69( struct T69 * className, void * offset);
void * fixPointerRegion1( struct Region1 * className, void * offset);
void * fixPointerRegion3( struct Region3 * className, void * offset);
void * fixPointerRegion2( struct Region2 * className, void * offset);
void * fixPointerPoint1( struct Point1 * className, void * offset);
void * fixPointerPoint2( struct Point2 * className, void * offset);
void * fixPointerPoint3( struct Point3 * className, void * offset);
void * fixPointerDist3Stub( struct Dist3Stub * className, void * offset);
void * fixPointerWrapperStub( struct WrapperStub * className, void * offset);
void * fixPointerT61( struct T61 * className, void * offset);
void * fixPointerT60( struct T60 * className, void * offset);
void * fixPointerT6( struct T6 * className, void * offset);
void * fixPointerT7( struct T7 * className, void * offset);
void * fixPointerT4( struct T4 * className, void * offset);
void * fixPointerT5( struct T5 * className, void * offset);
void * fixPointerLevelData( struct LevelData * className, void * offset);
void * fixPointerT8( struct T8 * className, void * offset);
void * fixPointerT9( struct T9 * className, void * offset);
void * fixPointerT91( struct T91 * className, void * offset);
void * fixPointerT90( struct T90 * className, void * offset);
void * fixPointerT88( struct T88 * className, void * offset);
void * fixPointerT89( struct T89 * className, void * offset);
void * fixPointerT84( struct T84 * className, void * offset);
void * fixPointerT85( struct T85 * className, void * offset);
void * fixPointerT86( struct T86 * className, void * offset);
void * fixPointerT87( struct T87 * className, void * offset);
void * fixPointerT1( struct T1 * className, void * offset);
void * fixPointerT3( struct T3 * className, void * offset);
void * fixPointerT2( struct T2 * className, void * offset);
void * fixPointerT10( struct T10 * className, void * offset);
void * fixPointerT11( struct T11 * className, void * offset);
void * fixPointerT12( struct T12 * className, void * offset);
void * fixPointerT13( struct T13 * className, void * offset);
void * fixPointerDist( struct Dist * className, void * offset);
void * fixPointerT14( struct T14 * className, void * offset);
void * fixPointerT15( struct T15 * className, void * offset);
void * fixPointerT81( struct T81 * className, void * offset);
void * fixPointerT16( struct T16 * className, void * offset);
void * fixPointerT80( struct T80 * className, void * offset);
void * fixPointerT17( struct T17 * className, void * offset);
void * fixPointerT83( struct T83 * className, void * offset);
void * fixPointerT18( struct T18 * className, void * offset);
void * fixPointerT82( struct T82 * className, void * offset);
void * fixPointerT19( struct T19 * className, void * offset);
