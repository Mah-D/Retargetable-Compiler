public class RunMain {
public static void main (String[] args) {
 Program.runMain();
}

}

class Program {
public static final region(:rank==1) _MGOP_reg = Program._MGOP_reg_init();
public static final double _MGOP_Ac0 = Program._MGOP_Ac0_init();
public static final double _MGOP_Ac1 = Program._MGOP_Ac1_init();
public static final double _MGOP_Ac2 = Program._MGOP_Ac2_init();
public static final double _MGOP_Ac3 = Program._MGOP_Ac3_init();
public static final double _MGOP_Sac0 = Program._MGOP_Sac0_init();
public static final double _MGOP_Sac1 = Program._MGOP_Sac1_init();
public static final double _MGOP_Sac2 = Program._MGOP_Sac2_init();
public static final double _MGOP_Sac3 = Program._MGOP_Sac3_init();
public static final double _MGOP_Pc0 = Program._MGOP_Pc0_init();
public static final double _MGOP_Pc1 = Program._MGOP_Pc1_init();
public static final double _MGOP_Pc2 = Program._MGOP_Pc2_init();
public static final double _MGOP_Pc3 = Program._MGOP_Pc3_init();
public static final int _Timer_max_counters = Program._Timer_max_counters_init();
public static final boolean _Util_PERF_OUTPUT = Program._Util_PERF_OUTPUT_init();
public static final double _Util_CLOCK_SPEED = Program._Util_CLOCK_SPEED_init();
public static final double _Util_FP_PERCLOCK = Program._Util_FP_PERCLOCK_init();
public static final double _Util_COMM_LATENCY = Program._Util_COMM_LATENCY_init();
public static final double _Util_COMM_BANDWIDTH = Program._Util_COMM_BANDWIDTH_init();
public static final boolean _Util_IN_LOOP = Program._Util_IN_LOOP_init();
public static final boolean _Util_COMP_ONLY = Program._Util_COMP_ONLY_init();
public static final boolean _Util_COMM_ONLY = Program._Util_COMM_ONLY_init();
public static final int _Util_THREADS_PERFOREACH = Program._Util_THREADS_PERFOREACH_init();
public static final boolean _Util_OVERLAP_COMMANDCOMP = Program._Util_OVERLAP_COMMANDCOMP_init();
public static final boolean _Util_EXCHANGE_AFTER = Program._Util_EXCHANGE_AFTER_init();
public static final int _Util_P2SLEVEL = Program._Util_P2SLEVEL_init();
public static final int _Util_N_PLACES = Program._Util_N_PLACES_init();
public static final region(:rank==3) _Util_UNIT_CUBE = Program._Util_UNIT_CUBE_init();
public static final int _Util_LOW = Program._Util_LOW_init();
public static final int _Util_HIGH = Program._Util_HIGH_init();
public static final boolean _LevelData_PERF_On = Program._LevelData_PERF_On_init();
public static final boolean _MGOP_PERF_On = Program._MGOP_PERF_On_init();
public static final double _LevelData_PERF_Comp = Program._LevelData_PERF_Comp_init();
public static final double _MGOP_PERF_Comp = Program._MGOP_PERF_Comp_init();
public static final double _LevelData_PERF_CommL = Program._LevelData_PERF_CommL_init();
public static final double _MGOP_PERF_CommL = Program._MGOP_PERF_CommL_init();
public static final double _LevelData_PERF_CommB = Program._LevelData_PERF_CommB_init();
public static final double _MGOP_PERF_CommB = Program._MGOP_PERF_CommB_init();
public static final boolean _LevelData_PERF_InLoop = Program._LevelData_PERF_InLoop_init();
public static final boolean _MGOP_PERF_InLoop = Program._MGOP_PERF_InLoop_init();
public static final boolean _LevelData_PERF_CompOnly = Program._LevelData_PERF_CompOnly_init();
public static final boolean _MGOP_PERF_CompOnly = Program._MGOP_PERF_CompOnly_init();
public static final boolean _LevelData_PERF_CommOnly = Program._LevelData_PERF_CommOnly_init();
public static final boolean _MGOP_PERF_CommOnly = Program._MGOP_PERF_CommOnly_init();
public static final boolean _MGOP_OVERLAPPED = Program._MGOP_OVERLAPPED_init();
public static final int _MGOP_P2SLEVEL = Program._MGOP_P2SLEVEL_init();
public static final int _LevelData_N_PLACES = Program._LevelData_N_PLACES_init();
public static final region(:rank==3) value[:rank==3] _Util_QREGIONS = Program._Util_QREGIONS_init();
public static final int _LevelData_LOW = Program._LevelData_LOW_init();
public static final int _LevelData_HIGH = Program._LevelData_HIGH_init();


public static String LevelData_toString(final LevelData X10_TEMP0) {
final String X10_TEMP2 = ("");
return X10_TEMP2;
}
public static boolean _LevelData_PERF_On_init() {

return _Util_PERF_OUTPUT;
}
public static double _LevelData_PERF_Comp_init() {
final double X10_TEMP1 = (1.0);

final double X10_TEMP3 = (X10_TEMP1/_Util_FP_PERCLOCK);
return X10_TEMP3;
}
public static double _LevelData_PERF_CommL_init() {

final double X10_TEMP2 = (_Util_COMM_LATENCY*_Util_CLOCK_SPEED);
return X10_TEMP2;
}
public static double _LevelData_PERF_CommB_init() {
final double X10_TEMP1 = ((double)_Util_CLOCK_SPEED);
final double X10_TEMP2 = ((double)_Util_COMM_BANDWIDTH);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
final double X10_TEMP5 = (8.0);

final double X10_TEMP7 = (X10_TEMP4*X10_TEMP5);
return X10_TEMP7;
}
public static boolean _LevelData_PERF_InLoop_init() {

return _Util_IN_LOOP;
}
public static boolean _LevelData_PERF_CompOnly_init() {

return _Util_COMP_ONLY;
}
public static boolean _LevelData_PERF_CommOnly_init() {

return _Util_COMM_ONLY;
}
public static int _LevelData_N_PLACES_init() {

return _Util_N_PLACES;
}
public static int _LevelData_HIGH_init() {

return _Util_HIGH;
}
public static int _LevelData_LOW_init() {

return _Util_LOW;
}
public static dist(:rank==1) LevelData_getPlaces(final LevelData X10_TEMP0) {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
return X10_TEMP2;
}
public static double [:rank==3] LevelData_getArray(final LevelData X10_TEMP0, final int a_idx) {
final Wrapper[:rank==1] X10_TEMP1 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP3 = (X10_TEMP1[a_idx]);

final double[:rank==3] X10_TEMP5 = (double[:rank==3])(X10_TEMP3.m_array);

return X10_TEMP5;
}
public static region(:rank==3) LevelData_getInnerRegion(final LevelData X10_TEMP0, final int a_idx) {
final region(:rank==3) X10_TEMP2 = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,a_idx));

return X10_TEMP2;
}
public static region(:rank==3) LevelData_getINNERRegion(final LevelData X10_TEMP0, final int a_idx) {
final region(:rank==3)[:rank==1] X10_TEMP1 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_regions);
final region(:rank==3) X10_TEMP3 = (region(:rank==3))(X10_TEMP1[a_idx]);

region(:rank==3) R = (region(:rank==3))(X10_TEMP3);
final int X10_TEMP6 = (0);
final int X10_TEMP8 = 3;
final boolean X10_TEMP7 = X10_TEMP6>=X10_TEMP8;
if (X10_TEMP7) {
final String X10_TEMP9 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP10 = ", expected 3";
String X10_TEMP11 = X10_TEMP9 + X10_TEMP6;
X10_TEMP11 = X10_TEMP11 + X10_TEMP10;
throw new RuntimeException(X10_TEMP11);
}
final int X10_TEMP12 = 0;
final int X10_TEMP13 = 1;
final int X10_TEMP15 = X10_TEMP12 - X10_TEMP13;
region(:rank==1) X10_TEMP14 = (region(:rank==1))([X10_TEMP12:X10_TEMP15]);
final int X10_TEMP16 = 0;
final boolean X10_TEMP19 = X10_TEMP6 == X10_TEMP16;
final int X10_TEMP17 = 1;
final boolean X10_TEMP20 = X10_TEMP6 == X10_TEMP17;
final int X10_TEMP18 = 2;
final boolean X10_TEMP21 = X10_TEMP6 == X10_TEMP18;
for(point(:rank==3)[X10_TEMP22, X10_TEMP23, X10_TEMP24]:R) {
if(X10_TEMP19) {
final region(:rank==1) X10_TEMP25 = [X10_TEMP22:X10_TEMP22];
X10_TEMP14 = X10_TEMP14 || X10_TEMP25;
}
else {
 if(X10_TEMP20) {
final region(:rank==1) X10_TEMP25 = [X10_TEMP23:X10_TEMP23];
X10_TEMP14 = X10_TEMP14 || X10_TEMP25;
}
else {
 if(X10_TEMP21) {
final region(:rank==1) X10_TEMP25 = [X10_TEMP24:X10_TEMP24];
X10_TEMP14 = X10_TEMP14 || X10_TEMP25;
}
}
}
}
final region(:rank==1) X10_TEMP26 = X10_TEMP14;
final int X10_TEMP27 = (X10_TEMP26.low());
final int X10_TEMP28 = (1);
final int X10_TEMP55 = (X10_TEMP27+X10_TEMP28);
final int X10_TEMP31 = (0);
final int X10_TEMP33 = 3;
final boolean X10_TEMP32 = X10_TEMP31>=X10_TEMP33;
if (X10_TEMP32) {
final String X10_TEMP34 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP35 = ", expected 3";
String X10_TEMP36 = X10_TEMP34 + X10_TEMP31;
X10_TEMP36 = X10_TEMP36 + X10_TEMP35;
throw new RuntimeException(X10_TEMP36);
}
final int X10_TEMP37 = 0;
final int X10_TEMP38 = 1;
final int X10_TEMP40 = X10_TEMP37 - X10_TEMP38;
region(:rank==1) X10_TEMP39 = (region(:rank==1))([X10_TEMP37:X10_TEMP40]);
final int X10_TEMP41 = 0;
final boolean X10_TEMP44 = X10_TEMP31 == X10_TEMP41;
final int X10_TEMP42 = 1;
final boolean X10_TEMP45 = X10_TEMP31 == X10_TEMP42;
final int X10_TEMP43 = 2;
final boolean X10_TEMP46 = X10_TEMP31 == X10_TEMP43;
for(point(:rank==3)[X10_TEMP47, X10_TEMP48, X10_TEMP49]:R) {
if(X10_TEMP44) {
final region(:rank==1) X10_TEMP50 = [X10_TEMP47:X10_TEMP47];
X10_TEMP39 = X10_TEMP39 || X10_TEMP50;
}
else {
 if(X10_TEMP45) {
final region(:rank==1) X10_TEMP50 = [X10_TEMP48:X10_TEMP48];
X10_TEMP39 = X10_TEMP39 || X10_TEMP50;
}
else {
 if(X10_TEMP46) {
final region(:rank==1) X10_TEMP50 = [X10_TEMP49:X10_TEMP49];
X10_TEMP39 = X10_TEMP39 || X10_TEMP50;
}
}
}
}
final region(:rank==1) X10_TEMP51 = X10_TEMP39;
final int X10_TEMP52 = (X10_TEMP51.high());
final int X10_TEMP53 = (1);
final int X10_TEMP56 = (X10_TEMP52-X10_TEMP53);
final int X10_TEMP58 = (1);
final int X10_TEMP60 = 3;
final boolean X10_TEMP59 = X10_TEMP58>=X10_TEMP60;
if (X10_TEMP59) {
final String X10_TEMP61 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP62 = ", expected 3";
String X10_TEMP63 = X10_TEMP61 + X10_TEMP58;
X10_TEMP63 = X10_TEMP63 + X10_TEMP62;
throw new RuntimeException(X10_TEMP63);
}
final int X10_TEMP64 = 0;
final int X10_TEMP65 = 1;
final int X10_TEMP67 = X10_TEMP64 - X10_TEMP65;
region(:rank==1) X10_TEMP66 = (region(:rank==1))([X10_TEMP64:X10_TEMP67]);
final int X10_TEMP68 = 0;
final boolean X10_TEMP71 = X10_TEMP58 == X10_TEMP68;
final int X10_TEMP69 = 1;
final boolean X10_TEMP72 = X10_TEMP58 == X10_TEMP69;
final int X10_TEMP70 = 2;
final boolean X10_TEMP73 = X10_TEMP58 == X10_TEMP70;
for(point(:rank==3)[X10_TEMP74, X10_TEMP75, X10_TEMP76]:R) {
if(X10_TEMP71) {
final region(:rank==1) X10_TEMP77 = [X10_TEMP74:X10_TEMP74];
X10_TEMP66 = X10_TEMP66 || X10_TEMP77;
}
else {
 if(X10_TEMP72) {
final region(:rank==1) X10_TEMP77 = [X10_TEMP75:X10_TEMP75];
X10_TEMP66 = X10_TEMP66 || X10_TEMP77;
}
else {
 if(X10_TEMP73) {
final region(:rank==1) X10_TEMP77 = [X10_TEMP76:X10_TEMP76];
X10_TEMP66 = X10_TEMP66 || X10_TEMP77;
}
}
}
}
final region(:rank==1) X10_TEMP78 = X10_TEMP66;
final int X10_TEMP79 = (X10_TEMP78.low());
final int X10_TEMP80 = (1);
final int X10_TEMP107 = (X10_TEMP79+X10_TEMP80);
final int X10_TEMP83 = (1);
final int X10_TEMP85 = 3;
final boolean X10_TEMP84 = X10_TEMP83>=X10_TEMP85;
if (X10_TEMP84) {
final String X10_TEMP86 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP87 = ", expected 3";
String X10_TEMP88 = X10_TEMP86 + X10_TEMP83;
X10_TEMP88 = X10_TEMP88 + X10_TEMP87;
throw new RuntimeException(X10_TEMP88);
}
final int X10_TEMP89 = 0;
final int X10_TEMP90 = 1;
final int X10_TEMP92 = X10_TEMP89 - X10_TEMP90;
region(:rank==1) X10_TEMP91 = (region(:rank==1))([X10_TEMP89:X10_TEMP92]);
final int X10_TEMP93 = 0;
final boolean X10_TEMP96 = X10_TEMP83 == X10_TEMP93;
final int X10_TEMP94 = 1;
final boolean X10_TEMP97 = X10_TEMP83 == X10_TEMP94;
final int X10_TEMP95 = 2;
final boolean X10_TEMP98 = X10_TEMP83 == X10_TEMP95;
for(point(:rank==3)[X10_TEMP99, X10_TEMP100, X10_TEMP101]:R) {
if(X10_TEMP96) {
final region(:rank==1) X10_TEMP102 = [X10_TEMP99:X10_TEMP99];
X10_TEMP91 = X10_TEMP91 || X10_TEMP102;
}
else {
 if(X10_TEMP97) {
final region(:rank==1) X10_TEMP102 = [X10_TEMP100:X10_TEMP100];
X10_TEMP91 = X10_TEMP91 || X10_TEMP102;
}
else {
 if(X10_TEMP98) {
final region(:rank==1) X10_TEMP102 = [X10_TEMP101:X10_TEMP101];
X10_TEMP91 = X10_TEMP91 || X10_TEMP102;
}
}
}
}
final region(:rank==1) X10_TEMP103 = X10_TEMP91;
final int X10_TEMP104 = (X10_TEMP103.high());
final int X10_TEMP105 = (1);
final int X10_TEMP108 = (X10_TEMP104-X10_TEMP105);
final int X10_TEMP110 = (2);
final int X10_TEMP112 = 3;
final boolean X10_TEMP111 = X10_TEMP110>=X10_TEMP112;
if (X10_TEMP111) {
final String X10_TEMP113 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP114 = ", expected 3";
String X10_TEMP115 = X10_TEMP113 + X10_TEMP110;
X10_TEMP115 = X10_TEMP115 + X10_TEMP114;
throw new RuntimeException(X10_TEMP115);
}
final int X10_TEMP116 = 0;
final int X10_TEMP117 = 1;
final int X10_TEMP119 = X10_TEMP116 - X10_TEMP117;
region(:rank==1) X10_TEMP118 = (region(:rank==1))([X10_TEMP116:X10_TEMP119]);
final int X10_TEMP120 = 0;
final boolean X10_TEMP123 = X10_TEMP110 == X10_TEMP120;
final int X10_TEMP121 = 1;
final boolean X10_TEMP124 = X10_TEMP110 == X10_TEMP121;
final int X10_TEMP122 = 2;
final boolean X10_TEMP125 = X10_TEMP110 == X10_TEMP122;
for(point(:rank==3)[X10_TEMP126, X10_TEMP127, X10_TEMP128]:R) {
if(X10_TEMP123) {
final region(:rank==1) X10_TEMP129 = [X10_TEMP126:X10_TEMP126];
X10_TEMP118 = X10_TEMP118 || X10_TEMP129;
}
else {
 if(X10_TEMP124) {
final region(:rank==1) X10_TEMP129 = [X10_TEMP127:X10_TEMP127];
X10_TEMP118 = X10_TEMP118 || X10_TEMP129;
}
else {
 if(X10_TEMP125) {
final region(:rank==1) X10_TEMP129 = [X10_TEMP128:X10_TEMP128];
X10_TEMP118 = X10_TEMP118 || X10_TEMP129;
}
}
}
}
final region(:rank==1) X10_TEMP130 = X10_TEMP118;
final int X10_TEMP131 = (X10_TEMP130.low());
final int X10_TEMP132 = (1);
final int X10_TEMP159 = (X10_TEMP131+X10_TEMP132);
final int X10_TEMP135 = (2);
final int X10_TEMP137 = 3;
final boolean X10_TEMP136 = X10_TEMP135>=X10_TEMP137;
if (X10_TEMP136) {
final String X10_TEMP138 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP139 = ", expected 3";
String X10_TEMP140 = X10_TEMP138 + X10_TEMP135;
X10_TEMP140 = X10_TEMP140 + X10_TEMP139;
throw new RuntimeException(X10_TEMP140);
}
final int X10_TEMP141 = 0;
final int X10_TEMP142 = 1;
final int X10_TEMP144 = X10_TEMP141 - X10_TEMP142;
region(:rank==1) X10_TEMP143 = (region(:rank==1))([X10_TEMP141:X10_TEMP144]);
final int X10_TEMP145 = 0;
final boolean X10_TEMP148 = X10_TEMP135 == X10_TEMP145;
final int X10_TEMP146 = 1;
final boolean X10_TEMP149 = X10_TEMP135 == X10_TEMP146;
final int X10_TEMP147 = 2;
final boolean X10_TEMP150 = X10_TEMP135 == X10_TEMP147;
for(point(:rank==3)[X10_TEMP151, X10_TEMP152, X10_TEMP153]:R) {
if(X10_TEMP148) {
final region(:rank==1) X10_TEMP154 = [X10_TEMP151:X10_TEMP151];
X10_TEMP143 = X10_TEMP143 || X10_TEMP154;
}
else {
 if(X10_TEMP149) {
final region(:rank==1) X10_TEMP154 = [X10_TEMP152:X10_TEMP152];
X10_TEMP143 = X10_TEMP143 || X10_TEMP154;
}
else {
 if(X10_TEMP150) {
final region(:rank==1) X10_TEMP154 = [X10_TEMP153:X10_TEMP153];
X10_TEMP143 = X10_TEMP143 || X10_TEMP154;
}
}
}
}
final region(:rank==1) X10_TEMP155 = X10_TEMP143;
final int X10_TEMP156 = (X10_TEMP155.high());
final int X10_TEMP157 = (1);
final int X10_TEMP160 = (X10_TEMP156-X10_TEMP157);

final region(:rank==3) X10_TEMP162 = (region(:rank==3))([X10_TEMP55:X10_TEMP56,X10_TEMP107:X10_TEMP108,X10_TEMP159:X10_TEMP160]);

return X10_TEMP162;
}
public static region(:rank==3) LevelData_getShrinkedRegion(final LevelData X10_TEMP0, final int a_idx) {
final region(:rank==3) X10_TEMP2 = (region(:rank==3))(Program.LevelData_get_m_REGIONs(X10_TEMP0,a_idx));

region(:rank==3) R = (region(:rank==3))(X10_TEMP2);
final int X10_TEMP5 = (0);
final int X10_TEMP7 = 3;
final boolean X10_TEMP6 = X10_TEMP5>=X10_TEMP7;
if (X10_TEMP6) {
final String X10_TEMP8 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP9 = ", expected 3";
String X10_TEMP10 = X10_TEMP8 + X10_TEMP5;
X10_TEMP10 = X10_TEMP10 + X10_TEMP9;
throw new RuntimeException(X10_TEMP10);
}
final int X10_TEMP11 = 0;
final int X10_TEMP12 = 1;
final int X10_TEMP14 = X10_TEMP11 - X10_TEMP12;
region(:rank==1) X10_TEMP13 = (region(:rank==1))([X10_TEMP11:X10_TEMP14]);
final int X10_TEMP15 = 0;
final boolean X10_TEMP18 = X10_TEMP5 == X10_TEMP15;
final int X10_TEMP16 = 1;
final boolean X10_TEMP19 = X10_TEMP5 == X10_TEMP16;
final int X10_TEMP17 = 2;
final boolean X10_TEMP20 = X10_TEMP5 == X10_TEMP17;
for(point(:rank==3)[X10_TEMP21, X10_TEMP22, X10_TEMP23]:R) {
if(X10_TEMP18) {
final region(:rank==1) X10_TEMP24 = [X10_TEMP21:X10_TEMP21];
X10_TEMP13 = X10_TEMP13 || X10_TEMP24;
}
else {
 if(X10_TEMP19) {
final region(:rank==1) X10_TEMP24 = [X10_TEMP22:X10_TEMP22];
X10_TEMP13 = X10_TEMP13 || X10_TEMP24;
}
else {
 if(X10_TEMP20) {
final region(:rank==1) X10_TEMP24 = [X10_TEMP23:X10_TEMP23];
X10_TEMP13 = X10_TEMP13 || X10_TEMP24;
}
}
}
}
final region(:rank==1) X10_TEMP25 = X10_TEMP13;
final int X10_TEMP52 = (X10_TEMP25.low());
final int X10_TEMP28 = (0);
final int X10_TEMP30 = 3;
final boolean X10_TEMP29 = X10_TEMP28>=X10_TEMP30;
if (X10_TEMP29) {
final String X10_TEMP31 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP32 = ", expected 3";
String X10_TEMP33 = X10_TEMP31 + X10_TEMP28;
X10_TEMP33 = X10_TEMP33 + X10_TEMP32;
throw new RuntimeException(X10_TEMP33);
}
final int X10_TEMP34 = 0;
final int X10_TEMP35 = 1;
final int X10_TEMP37 = X10_TEMP34 - X10_TEMP35;
region(:rank==1) X10_TEMP36 = (region(:rank==1))([X10_TEMP34:X10_TEMP37]);
final int X10_TEMP38 = 0;
final boolean X10_TEMP41 = X10_TEMP28 == X10_TEMP38;
final int X10_TEMP39 = 1;
final boolean X10_TEMP42 = X10_TEMP28 == X10_TEMP39;
final int X10_TEMP40 = 2;
final boolean X10_TEMP43 = X10_TEMP28 == X10_TEMP40;
for(point(:rank==3)[X10_TEMP44, X10_TEMP45, X10_TEMP46]:R) {
if(X10_TEMP41) {
final region(:rank==1) X10_TEMP47 = [X10_TEMP44:X10_TEMP44];
X10_TEMP36 = X10_TEMP36 || X10_TEMP47;
}
else {
 if(X10_TEMP42) {
final region(:rank==1) X10_TEMP47 = [X10_TEMP45:X10_TEMP45];
X10_TEMP36 = X10_TEMP36 || X10_TEMP47;
}
else {
 if(X10_TEMP43) {
final region(:rank==1) X10_TEMP47 = [X10_TEMP46:X10_TEMP46];
X10_TEMP36 = X10_TEMP36 || X10_TEMP47;
}
}
}
}
final region(:rank==1) X10_TEMP48 = X10_TEMP36;
final int X10_TEMP49 = (X10_TEMP48.high());
final int X10_TEMP50 = (1);
final int X10_TEMP53 = (X10_TEMP49-X10_TEMP50);
final int X10_TEMP55 = (1);
final int X10_TEMP57 = 3;
final boolean X10_TEMP56 = X10_TEMP55>=X10_TEMP57;
if (X10_TEMP56) {
final String X10_TEMP58 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP59 = ", expected 3";
String X10_TEMP60 = X10_TEMP58 + X10_TEMP55;
X10_TEMP60 = X10_TEMP60 + X10_TEMP59;
throw new RuntimeException(X10_TEMP60);
}
final int X10_TEMP61 = 0;
final int X10_TEMP62 = 1;
final int X10_TEMP64 = X10_TEMP61 - X10_TEMP62;
region(:rank==1) X10_TEMP63 = (region(:rank==1))([X10_TEMP61:X10_TEMP64]);
final int X10_TEMP65 = 0;
final boolean X10_TEMP68 = X10_TEMP55 == X10_TEMP65;
final int X10_TEMP66 = 1;
final boolean X10_TEMP69 = X10_TEMP55 == X10_TEMP66;
final int X10_TEMP67 = 2;
final boolean X10_TEMP70 = X10_TEMP55 == X10_TEMP67;
for(point(:rank==3)[X10_TEMP71, X10_TEMP72, X10_TEMP73]:R) {
if(X10_TEMP68) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP71:X10_TEMP71];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
else {
 if(X10_TEMP69) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP72:X10_TEMP72];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
else {
 if(X10_TEMP70) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP73:X10_TEMP73];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
}
}
}
final region(:rank==1) X10_TEMP75 = X10_TEMP63;
final int X10_TEMP102 = (X10_TEMP75.low());
final int X10_TEMP78 = (1);
final int X10_TEMP80 = 3;
final boolean X10_TEMP79 = X10_TEMP78>=X10_TEMP80;
if (X10_TEMP79) {
final String X10_TEMP81 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP82 = ", expected 3";
String X10_TEMP83 = X10_TEMP81 + X10_TEMP78;
X10_TEMP83 = X10_TEMP83 + X10_TEMP82;
throw new RuntimeException(X10_TEMP83);
}
final int X10_TEMP84 = 0;
final int X10_TEMP85 = 1;
final int X10_TEMP87 = X10_TEMP84 - X10_TEMP85;
region(:rank==1) X10_TEMP86 = (region(:rank==1))([X10_TEMP84:X10_TEMP87]);
final int X10_TEMP88 = 0;
final boolean X10_TEMP91 = X10_TEMP78 == X10_TEMP88;
final int X10_TEMP89 = 1;
final boolean X10_TEMP92 = X10_TEMP78 == X10_TEMP89;
final int X10_TEMP90 = 2;
final boolean X10_TEMP93 = X10_TEMP78 == X10_TEMP90;
for(point(:rank==3)[X10_TEMP94, X10_TEMP95, X10_TEMP96]:R) {
if(X10_TEMP91) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP94:X10_TEMP94];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
else {
 if(X10_TEMP92) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP95:X10_TEMP95];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
else {
 if(X10_TEMP93) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP96:X10_TEMP96];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
}
}
}
final region(:rank==1) X10_TEMP98 = X10_TEMP86;
final int X10_TEMP99 = (X10_TEMP98.high());
final int X10_TEMP100 = (1);
final int X10_TEMP103 = (X10_TEMP99-X10_TEMP100);
final int X10_TEMP105 = (2);
final int X10_TEMP107 = 3;
final boolean X10_TEMP106 = X10_TEMP105>=X10_TEMP107;
if (X10_TEMP106) {
final String X10_TEMP108 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP109 = ", expected 3";
String X10_TEMP110 = X10_TEMP108 + X10_TEMP105;
X10_TEMP110 = X10_TEMP110 + X10_TEMP109;
throw new RuntimeException(X10_TEMP110);
}
final int X10_TEMP111 = 0;
final int X10_TEMP112 = 1;
final int X10_TEMP114 = X10_TEMP111 - X10_TEMP112;
region(:rank==1) X10_TEMP113 = (region(:rank==1))([X10_TEMP111:X10_TEMP114]);
final int X10_TEMP115 = 0;
final boolean X10_TEMP118 = X10_TEMP105 == X10_TEMP115;
final int X10_TEMP116 = 1;
final boolean X10_TEMP119 = X10_TEMP105 == X10_TEMP116;
final int X10_TEMP117 = 2;
final boolean X10_TEMP120 = X10_TEMP105 == X10_TEMP117;
for(point(:rank==3)[X10_TEMP121, X10_TEMP122, X10_TEMP123]:R) {
if(X10_TEMP118) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP121:X10_TEMP121];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
else {
 if(X10_TEMP119) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP122:X10_TEMP122];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
else {
 if(X10_TEMP120) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP123:X10_TEMP123];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
}
}
}
final region(:rank==1) X10_TEMP125 = X10_TEMP113;
final int X10_TEMP152 = (X10_TEMP125.low());
final int X10_TEMP128 = (2);
final int X10_TEMP130 = 3;
final boolean X10_TEMP129 = X10_TEMP128>=X10_TEMP130;
if (X10_TEMP129) {
final String X10_TEMP131 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP132 = ", expected 3";
String X10_TEMP133 = X10_TEMP131 + X10_TEMP128;
X10_TEMP133 = X10_TEMP133 + X10_TEMP132;
throw new RuntimeException(X10_TEMP133);
}
final int X10_TEMP134 = 0;
final int X10_TEMP135 = 1;
final int X10_TEMP137 = X10_TEMP134 - X10_TEMP135;
region(:rank==1) X10_TEMP136 = (region(:rank==1))([X10_TEMP134:X10_TEMP137]);
final int X10_TEMP138 = 0;
final boolean X10_TEMP141 = X10_TEMP128 == X10_TEMP138;
final int X10_TEMP139 = 1;
final boolean X10_TEMP142 = X10_TEMP128 == X10_TEMP139;
final int X10_TEMP140 = 2;
final boolean X10_TEMP143 = X10_TEMP128 == X10_TEMP140;
for(point(:rank==3)[X10_TEMP144, X10_TEMP145, X10_TEMP146]:R) {
if(X10_TEMP141) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP144:X10_TEMP144];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
else {
 if(X10_TEMP142) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP145:X10_TEMP145];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
else {
 if(X10_TEMP143) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP146:X10_TEMP146];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
}
}
}
final region(:rank==1) X10_TEMP148 = X10_TEMP136;
final int X10_TEMP149 = (X10_TEMP148.high());
final int X10_TEMP150 = (1);
final int X10_TEMP153 = (X10_TEMP149-X10_TEMP150);

final region(:rank==3) X10_TEMP155 = (region(:rank==3))([X10_TEMP52:X10_TEMP53,X10_TEMP102:X10_TEMP103,X10_TEMP152:X10_TEMP153]);

return X10_TEMP155;
}
public static region(:rank==3) LevelData_getRegion(final LevelData X10_TEMP0, final int a_idx) {
final region(:rank==3)[:rank==1] X10_TEMP1 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_REGIONs);
final region(:rank==3) X10_TEMP3 = (region(:rank==3))(X10_TEMP1[a_idx]);

return X10_TEMP3;
}
public static void LevelData_print(final LevelData X10_TEMP0) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
double res = (0);
final Wrapper[:rank==1] X10_TEMP6 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP8 = (X10_TEMP6[i]);
final double[:rank==3] X10_TEMP9 = (double[:rank==3])(X10_TEMP8.m_array);

double[:rank==3] temp = (double[:rank==3])(X10_TEMP9);
final region(:rank==3)[:rank==1] X10_TEMP11 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_REGIONs);

final region(:rank==3) X10_TEMP14 = (region(:rank==3))(X10_TEMP11[i]);
for(point(:rank==3)p:X10_TEMP14) {
final double X10_TEMP17 = (temp[p]);
final double X10_TEMP18 = (Math.abs(X10_TEMP17));

final double X10_TEMP20 = (res+X10_TEMP18);
res = (X10_TEMP20);
}
final String X10_TEMP21 = ("block at place ");
final String X10_TEMP22 = (X10_TEMP21+i);
final String X10_TEMP23 = (" : ");
final String X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
final region(:rank==3) X10_TEMP25 = (region(:rank==3))(temp.region);
final String X10_TEMP26 = (X10_TEMP24+X10_TEMP25);
final String X10_TEMP27 = (" sum of m_u=");
final String X10_TEMP28 = (X10_TEMP26+X10_TEMP27);

final String X10_TEMP30 = (X10_TEMP28+res);
System.out.println(X10_TEMP30);
}
}
}
}
public static void LevelData_PRINT(final LevelData X10_TEMP0) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final String X10_TEMP5 = ("block at place ");
final String X10_TEMP6 = (X10_TEMP5+i);
final String X10_TEMP7 = (" : ");

final String X10_TEMP9 = (X10_TEMP6+X10_TEMP7);
System.out.println(X10_TEMP9);
final Wrapper[:rank==1] X10_TEMP10 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP12 = (X10_TEMP10[i]);
final double[:rank==3] X10_TEMP13 = (double[:rank==3])(X10_TEMP12.m_array);

double[:rank==3] temp = (double[:rank==3])(X10_TEMP13);
int counter = (0);
final region(:rank==3)[:rank==1] X10_TEMP16 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_regions);

final region(:rank==3) X10_TEMP19 = (region(:rank==3))(X10_TEMP16[i]);
for(point(:rank==3)p:X10_TEMP19) {
final String X10_TEMP20 = (" [");
final String X10_TEMP21 = (X10_TEMP20+p);
final String X10_TEMP22 = ("]= ");
final String X10_TEMP24 = (X10_TEMP21+X10_TEMP22);
final double X10_TEMP25 = (temp[p]);

final String X10_TEMP27 = (X10_TEMP24+X10_TEMP25);
System.out.print(X10_TEMP27);
final int X10_TEMP28 = (counter);
final int X10_TEMP29 = 1;
counter = counter + X10_TEMP29;

final int X10_TEMP30 = (4);

final boolean X10_TEMP32 = counter==X10_TEMP30;
if (X10_TEMP32) {
final String X10_TEMP34 = ("\n");
System.out.print(X10_TEMP34);
final int X10_TEMP36 = (0);
counter = (X10_TEMP36);
}
}
final String X10_TEMP38 = ("");
System.out.println(X10_TEMP38);
}
}
}
}
public static double LevelData_norm2(final LevelData X10_TEMP0) {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(X10_TEMP0.m_places);

final double[:rank==1] results = (double[:rank==1])(new double[X10_TEMP1]);
finish {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP5[i]:X10_TEMP4) {
final place X10_TEMP6 = X10_TEMP4.get(X10_TEMP5);
async(X10_TEMP6) {
double res = (0);
final Wrapper[:rank==1] X10_TEMP8 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP10 = (X10_TEMP8[i]);
final double[:rank==3] X10_TEMP11 = (double[:rank==3])(X10_TEMP10.m_array);

final double[:rank==3] temp = (double[:rank==3])(X10_TEMP11);
final region(:rank==3) X10_TEMP15 = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,i));
for(point(:rank==3)p:X10_TEMP15) {
final place h = (here);
final int X10_TEMP19 = (0);
final int X10_TEMP20 = (0);
final region(:rank==1) X10_TEMP21 = (region(:rank==1))([X10_TEMP19:X10_TEMP20]);
final place X10_TEMP22 = (here);

final dist(:rank==1) X10_TEMP24 = (dist(:rank==1))(X10_TEMP21->X10_TEMP22);

final dist(:rank==1) dRecv = (dist(:rank==1))(X10_TEMP24);
final double[:rank==1] aRecv = (double[:rank==1])(new double[dRecv]);
finish {
final dist(:rank==3) X10_TEMP27 = (dist(:rank==3))(temp.distribution);

final place X10_TEMP30 = X10_TEMP27.get(p);
async(X10_TEMP30) {
final double X10_TEMP33 = (temp[p]);
final double X10_TEMP34 = (temp[p]);

final double temp3 = (X10_TEMP33*X10_TEMP34);
async(h) {
final int X10_TEMP38 = (0);

final double X10_TEMP41 = (temp3);
aRecv[X10_TEMP38] = (X10_TEMP41);
}
}
}
final int X10_TEMP43 = (0);
final double X10_TEMP44 = (aRecv[X10_TEMP43]);

final double X10_TEMP46 = (res+X10_TEMP44);
res = (X10_TEMP46);
}
final double X10_TEMP50 = (res);
results[i] = (X10_TEMP50);
}
}
}
final double X10_TEMP57 = (Program.doublerefArraySum1(results));
final int X10_TEMP51 = (X10_TEMP0.SIZE);
final int X10_TEMP52 = (X10_TEMP0.SIZE);
final int X10_TEMP53 = (X10_TEMP51*X10_TEMP52);
final int X10_TEMP54 = (X10_TEMP0.SIZE);

final int X10_TEMP56 = (X10_TEMP53*X10_TEMP54);

double temp = (X10_TEMP57/X10_TEMP56);
final double X10_TEMP61 = (Math.sqrt(temp));
return X10_TEMP61;
}
public static void LevelData_initialize(final LevelData X10_TEMP0, final int a_CLASS) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final Wrapper[:rank==1] X10_TEMP5 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP7 = (X10_TEMP5[i]);
final double[:rank==3] X10_TEMP8 = (double[:rank==3])(X10_TEMP7.m_array);

final double[:rank==3] temp = (double[:rank==3])(X10_TEMP8);
final region(:rank==3) R = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,i));
final place X10_TEMP13 = here;
for(point(:rank==3)p[x,y,z]:temp) {
async(X10_TEMP13) {
final int X10_TEMP16 = 1;
final int X10_TEMP298 = 2;
final int X10_TEMP580 = 3;
final int X10_TEMP582 = 4;
final int X10_TEMP864 = 5;
final int X10_TEMP1146 = 6;
switch(a_CLASS){
case X10_TEMP16:
{
final int X10_TEMP17 = (0);

final boolean X10_TEMP19 = (x==X10_TEMP17);
final int X10_TEMP20 = (11);

final boolean X10_TEMP22 = (y==X10_TEMP20);
final boolean X10_TEMP26 = (X10_TEMP19&&X10_TEMP22);
final int X10_TEMP23 = (2);

final boolean X10_TEMP25 = (z==X10_TEMP23);

final boolean X10_TEMP28 = (X10_TEMP26&&X10_TEMP25);
final int X10_TEMP29 = (13);

final boolean X10_TEMP31 = (x==X10_TEMP29);
final int X10_TEMP32 = (8);

final boolean X10_TEMP34 = (y==X10_TEMP32);
final boolean X10_TEMP38 = (X10_TEMP31&&X10_TEMP34);
final int X10_TEMP35 = (17);

final boolean X10_TEMP37 = (z==X10_TEMP35);

final boolean X10_TEMP40 = (X10_TEMP38&&X10_TEMP37);
final boolean X10_TEMP53 = (X10_TEMP28||X10_TEMP40);
final int X10_TEMP41 = (5);

final boolean X10_TEMP43 = (x==X10_TEMP41);
final int X10_TEMP44 = (14);

final boolean X10_TEMP46 = (y==X10_TEMP44);
final boolean X10_TEMP50 = (X10_TEMP43&&X10_TEMP46);
final int X10_TEMP47 = (0);

final boolean X10_TEMP49 = (z==X10_TEMP47);

final boolean X10_TEMP52 = (X10_TEMP50&&X10_TEMP49);
final boolean X10_TEMP66 = (X10_TEMP53||X10_TEMP52);
final int X10_TEMP54 = (4);

final boolean X10_TEMP56 = (x==X10_TEMP54);
final int X10_TEMP57 = (28);

final boolean X10_TEMP59 = (y==X10_TEMP57);
final boolean X10_TEMP63 = (X10_TEMP56&&X10_TEMP59);
final int X10_TEMP60 = (15);

final boolean X10_TEMP62 = (z==X10_TEMP60);

final boolean X10_TEMP65 = (X10_TEMP63&&X10_TEMP62);
final boolean X10_TEMP79 = (X10_TEMP66||X10_TEMP65);
final int X10_TEMP67 = (12);

final boolean X10_TEMP69 = (x==X10_TEMP67);
final int X10_TEMP70 = (2);

final boolean X10_TEMP72 = (y==X10_TEMP70);
final boolean X10_TEMP76 = (X10_TEMP69&&X10_TEMP72);
final int X10_TEMP73 = (1);

final boolean X10_TEMP75 = (z==X10_TEMP73);

final boolean X10_TEMP78 = (X10_TEMP76&&X10_TEMP75);
final boolean X10_TEMP92 = (X10_TEMP79||X10_TEMP78);
final int X10_TEMP80 = (5);

final boolean X10_TEMP82 = (x==X10_TEMP80);
final int X10_TEMP83 = (17);

final boolean X10_TEMP85 = (y==X10_TEMP83);
final boolean X10_TEMP89 = (X10_TEMP82&&X10_TEMP85);
final int X10_TEMP86 = (8);

final boolean X10_TEMP88 = (z==X10_TEMP86);

final boolean X10_TEMP91 = (X10_TEMP89&&X10_TEMP88);
final boolean X10_TEMP105 = (X10_TEMP92||X10_TEMP91);
final int X10_TEMP93 = (20);

final boolean X10_TEMP95 = (x==X10_TEMP93);
final int X10_TEMP96 = (19);

final boolean X10_TEMP98 = (y==X10_TEMP96);
final boolean X10_TEMP102 = (X10_TEMP95&&X10_TEMP98);
final int X10_TEMP99 = (11);

final boolean X10_TEMP101 = (z==X10_TEMP99);

final boolean X10_TEMP104 = (X10_TEMP102&&X10_TEMP101);
final boolean X10_TEMP118 = (X10_TEMP105||X10_TEMP104);
final int X10_TEMP106 = (26);

final boolean X10_TEMP108 = (x==X10_TEMP106);
final int X10_TEMP109 = (15);

final boolean X10_TEMP111 = (y==X10_TEMP109);
final boolean X10_TEMP115 = (X10_TEMP108&&X10_TEMP111);
final int X10_TEMP112 = (31);

final boolean X10_TEMP114 = (z==X10_TEMP112);

final boolean X10_TEMP117 = (X10_TEMP115&&X10_TEMP114);
final boolean X10_TEMP131 = (X10_TEMP118||X10_TEMP117);
final int X10_TEMP119 = (8);

final boolean X10_TEMP121 = (x==X10_TEMP119);
final int X10_TEMP122 = (25);

final boolean X10_TEMP124 = (y==X10_TEMP122);
final boolean X10_TEMP128 = (X10_TEMP121&&X10_TEMP124);
final int X10_TEMP125 = (22);

final boolean X10_TEMP127 = (z==X10_TEMP125);

final boolean X10_TEMP130 = (X10_TEMP128&&X10_TEMP127);
final boolean X10_TEMP144 = (X10_TEMP131||X10_TEMP130);
final int X10_TEMP132 = (7);

final boolean X10_TEMP134 = (x==X10_TEMP132);
final int X10_TEMP135 = (14);

final boolean X10_TEMP137 = (y==X10_TEMP135);
final boolean X10_TEMP141 = (X10_TEMP134&&X10_TEMP137);
final int X10_TEMP138 = (26);

final boolean X10_TEMP140 = (z==X10_TEMP138);

final boolean X10_TEMP143 = (X10_TEMP141&&X10_TEMP140);

final boolean X10_TEMP146 = (X10_TEMP144||X10_TEMP143);
final boolean X10_TEMP148 = (R.contains(p));

final boolean X10_TEMP150 = X10_TEMP146&&X10_TEMP148;
if (X10_TEMP150) {
final int X10_TEMP152 = (1);
final int X10_TEMP153 = 0;

final double X10_TEMP156 = (X10_TEMP153 - X10_TEMP152);
final double X10_TEMP157 = (X10_TEMP156);
temp[p] = (X10_TEMP157);
}
final int X10_TEMP158 = (7);

final boolean X10_TEMP160 = (x==X10_TEMP158);
final int X10_TEMP161 = (1);

final boolean X10_TEMP163 = (y==X10_TEMP161);
final boolean X10_TEMP167 = (X10_TEMP160&&X10_TEMP163);
final int X10_TEMP164 = (20);

final boolean X10_TEMP166 = (z==X10_TEMP164);

final boolean X10_TEMP169 = (X10_TEMP167&&X10_TEMP166);
final int X10_TEMP170 = (19);

final boolean X10_TEMP172 = (x==X10_TEMP170);
final int X10_TEMP173 = (29);

final boolean X10_TEMP175 = (y==X10_TEMP173);
final boolean X10_TEMP179 = (X10_TEMP172&&X10_TEMP175);
final int X10_TEMP176 = (31);

final boolean X10_TEMP178 = (z==X10_TEMP176);

final boolean X10_TEMP181 = (X10_TEMP179&&X10_TEMP178);
final boolean X10_TEMP194 = (X10_TEMP169||X10_TEMP181);
final int X10_TEMP182 = (2);

final boolean X10_TEMP184 = (x==X10_TEMP182);
final int X10_TEMP185 = (0);

final boolean X10_TEMP187 = (y==X10_TEMP185);
final boolean X10_TEMP191 = (X10_TEMP184&&X10_TEMP187);
final int X10_TEMP188 = (3);

final boolean X10_TEMP190 = (z==X10_TEMP188);

final boolean X10_TEMP193 = (X10_TEMP191&&X10_TEMP190);
final boolean X10_TEMP207 = (X10_TEMP194||X10_TEMP193);
final int X10_TEMP195 = (4);

final boolean X10_TEMP197 = (x==X10_TEMP195);
final int X10_TEMP198 = (22);

final boolean X10_TEMP200 = (y==X10_TEMP198);
final boolean X10_TEMP204 = (X10_TEMP197&&X10_TEMP200);
final int X10_TEMP201 = (3);

final boolean X10_TEMP203 = (z==X10_TEMP201);

final boolean X10_TEMP206 = (X10_TEMP204&&X10_TEMP203);
final boolean X10_TEMP220 = (X10_TEMP207||X10_TEMP206);
final int X10_TEMP208 = (1);

final boolean X10_TEMP210 = (x==X10_TEMP208);
final int X10_TEMP211 = (16);

final boolean X10_TEMP213 = (y==X10_TEMP211);
final boolean X10_TEMP217 = (X10_TEMP210&&X10_TEMP213);
final int X10_TEMP214 = (21);

final boolean X10_TEMP216 = (z==X10_TEMP214);

final boolean X10_TEMP219 = (X10_TEMP217&&X10_TEMP216);
final boolean X10_TEMP233 = (X10_TEMP220||X10_TEMP219);
final int X10_TEMP221 = (21);

final boolean X10_TEMP223 = (x==X10_TEMP221);
final int X10_TEMP224 = (31);

final boolean X10_TEMP226 = (y==X10_TEMP224);
final boolean X10_TEMP230 = (X10_TEMP223&&X10_TEMP226);
final int X10_TEMP227 = (6);

final boolean X10_TEMP229 = (z==X10_TEMP227);

final boolean X10_TEMP232 = (X10_TEMP230&&X10_TEMP229);
final boolean X10_TEMP246 = (X10_TEMP233||X10_TEMP232);
final int X10_TEMP234 = (12);

final boolean X10_TEMP236 = (x==X10_TEMP234);
final int X10_TEMP237 = (15);

final boolean X10_TEMP239 = (y==X10_TEMP237);
final boolean X10_TEMP243 = (X10_TEMP236&&X10_TEMP239);
final int X10_TEMP240 = (12);

final boolean X10_TEMP242 = (z==X10_TEMP240);

final boolean X10_TEMP245 = (X10_TEMP243&&X10_TEMP242);
final boolean X10_TEMP259 = (X10_TEMP246||X10_TEMP245);
final int X10_TEMP247 = (30);

final boolean X10_TEMP249 = (x==X10_TEMP247);
final int X10_TEMP250 = (4);

final boolean X10_TEMP252 = (y==X10_TEMP250);
final boolean X10_TEMP256 = (X10_TEMP249&&X10_TEMP252);
final int X10_TEMP253 = (25);

final boolean X10_TEMP255 = (z==X10_TEMP253);

final boolean X10_TEMP258 = (X10_TEMP256&&X10_TEMP255);
final boolean X10_TEMP272 = (X10_TEMP259||X10_TEMP258);
final int X10_TEMP260 = (28);

final boolean X10_TEMP262 = (x==X10_TEMP260);
final int X10_TEMP263 = (0);

final boolean X10_TEMP265 = (y==X10_TEMP263);
final boolean X10_TEMP269 = (X10_TEMP262&&X10_TEMP265);
final int X10_TEMP266 = (28);

final boolean X10_TEMP268 = (z==X10_TEMP266);

final boolean X10_TEMP271 = (X10_TEMP269&&X10_TEMP268);
final boolean X10_TEMP285 = (X10_TEMP272||X10_TEMP271);
final int X10_TEMP273 = (17);

final boolean X10_TEMP275 = (x==X10_TEMP273);
final int X10_TEMP276 = (26);

final boolean X10_TEMP278 = (y==X10_TEMP276);
final boolean X10_TEMP282 = (X10_TEMP275&&X10_TEMP278);
final int X10_TEMP279 = (17);

final boolean X10_TEMP281 = (z==X10_TEMP279);

final boolean X10_TEMP284 = (X10_TEMP282&&X10_TEMP281);

final boolean X10_TEMP287 = (X10_TEMP285||X10_TEMP284);
final boolean X10_TEMP289 = (R.contains(p));

final boolean X10_TEMP291 = X10_TEMP287&&X10_TEMP289;
if (X10_TEMP291) {
final double X10_TEMP295 = (1);
final double X10_TEMP296 = (X10_TEMP295);
temp[p] = (X10_TEMP296);
}
break;
}
case X10_TEMP298:
{
final int X10_TEMP299 = (38);

final boolean X10_TEMP301 = (x==X10_TEMP299);
final int X10_TEMP302 = (60);

final boolean X10_TEMP304 = (y==X10_TEMP302);
final boolean X10_TEMP308 = (X10_TEMP301&&X10_TEMP304);
final int X10_TEMP305 = (51);

final boolean X10_TEMP307 = (z==X10_TEMP305);

final boolean X10_TEMP310 = (X10_TEMP308&&X10_TEMP307);
final int X10_TEMP311 = (50);

final boolean X10_TEMP313 = (x==X10_TEMP311);
final int X10_TEMP314 = (15);

final boolean X10_TEMP316 = (y==X10_TEMP314);
final boolean X10_TEMP320 = (X10_TEMP313&&X10_TEMP316);
final int X10_TEMP317 = (23);

final boolean X10_TEMP319 = (z==X10_TEMP317);

final boolean X10_TEMP322 = (X10_TEMP320&&X10_TEMP319);
final boolean X10_TEMP335 = (X10_TEMP310||X10_TEMP322);
final int X10_TEMP323 = (18);

final boolean X10_TEMP325 = (x==X10_TEMP323);
final int X10_TEMP326 = (45);

final boolean X10_TEMP328 = (y==X10_TEMP326);
final boolean X10_TEMP332 = (X10_TEMP325&&X10_TEMP328);
final int X10_TEMP329 = (36);

final boolean X10_TEMP331 = (z==X10_TEMP329);

final boolean X10_TEMP334 = (X10_TEMP332&&X10_TEMP331);
final boolean X10_TEMP348 = (X10_TEMP335||X10_TEMP334);
final int X10_TEMP336 = (25);

final boolean X10_TEMP338 = (x==X10_TEMP336);
final int X10_TEMP339 = (14);

final boolean X10_TEMP341 = (y==X10_TEMP339);
final boolean X10_TEMP345 = (X10_TEMP338&&X10_TEMP341);
final int X10_TEMP342 = (36);

final boolean X10_TEMP344 = (z==X10_TEMP342);

final boolean X10_TEMP347 = (X10_TEMP345&&X10_TEMP344);
final boolean X10_TEMP361 = (X10_TEMP348||X10_TEMP347);
final int X10_TEMP349 = (26);

final boolean X10_TEMP351 = (x==X10_TEMP349);
final int X10_TEMP352 = (25);

final boolean X10_TEMP354 = (y==X10_TEMP352);
final boolean X10_TEMP358 = (X10_TEMP351&&X10_TEMP354);
final int X10_TEMP355 = (25);

final boolean X10_TEMP357 = (z==X10_TEMP355);

final boolean X10_TEMP360 = (X10_TEMP358&&X10_TEMP357);
final boolean X10_TEMP374 = (X10_TEMP361||X10_TEMP360);
final int X10_TEMP362 = (32);

final boolean X10_TEMP364 = (x==X10_TEMP362);
final int X10_TEMP365 = (37);

final boolean X10_TEMP367 = (y==X10_TEMP365);
final boolean X10_TEMP371 = (X10_TEMP364&&X10_TEMP367);
final int X10_TEMP368 = (0);

final boolean X10_TEMP370 = (z==X10_TEMP368);

final boolean X10_TEMP373 = (X10_TEMP371&&X10_TEMP370);
final boolean X10_TEMP387 = (X10_TEMP374||X10_TEMP373);
final int X10_TEMP375 = (29);

final boolean X10_TEMP377 = (x==X10_TEMP375);
final int X10_TEMP378 = (62);

final boolean X10_TEMP380 = (y==X10_TEMP378);
final boolean X10_TEMP384 = (X10_TEMP377&&X10_TEMP380);
final int X10_TEMP381 = (54);

final boolean X10_TEMP383 = (z==X10_TEMP381);

final boolean X10_TEMP386 = (X10_TEMP384&&X10_TEMP383);
final boolean X10_TEMP400 = (X10_TEMP387||X10_TEMP386);
final int X10_TEMP388 = (39);

final boolean X10_TEMP390 = (x==X10_TEMP388);
final int X10_TEMP391 = (49);

final boolean X10_TEMP393 = (y==X10_TEMP391);
final boolean X10_TEMP397 = (X10_TEMP390&&X10_TEMP393);
final int X10_TEMP394 = (57);

final boolean X10_TEMP396 = (z==X10_TEMP394);

final boolean X10_TEMP399 = (X10_TEMP397&&X10_TEMP396);
final boolean X10_TEMP413 = (X10_TEMP400||X10_TEMP399);
final int X10_TEMP401 = (12);

final boolean X10_TEMP403 = (x==X10_TEMP401);
final int X10_TEMP404 = (29);

final boolean X10_TEMP406 = (y==X10_TEMP404);
final boolean X10_TEMP410 = (X10_TEMP403&&X10_TEMP406);
final int X10_TEMP407 = (28);

final boolean X10_TEMP409 = (z==X10_TEMP407);

final boolean X10_TEMP412 = (X10_TEMP410&&X10_TEMP409);
final boolean X10_TEMP426 = (X10_TEMP413||X10_TEMP412);
final int X10_TEMP414 = (63);

final boolean X10_TEMP416 = (x==X10_TEMP414);
final int X10_TEMP417 = (46);

final boolean X10_TEMP419 = (y==X10_TEMP417);
final boolean X10_TEMP423 = (X10_TEMP416&&X10_TEMP419);
final int X10_TEMP420 = (25);

final boolean X10_TEMP422 = (z==X10_TEMP420);

final boolean X10_TEMP425 = (X10_TEMP423&&X10_TEMP422);

final boolean X10_TEMP428 = (X10_TEMP426||X10_TEMP425);
final boolean X10_TEMP430 = (R.contains(p));

final boolean X10_TEMP432 = X10_TEMP428&&X10_TEMP430;
if (X10_TEMP432) {
final int X10_TEMP434 = (1);
final int X10_TEMP435 = 0;

final double X10_TEMP438 = (X10_TEMP435 - X10_TEMP434);
final double X10_TEMP439 = (X10_TEMP438);
temp[p] = (X10_TEMP439);
}
final int X10_TEMP440 = (27);

final boolean X10_TEMP442 = (x==X10_TEMP440);
final int X10_TEMP443 = (32);

final boolean X10_TEMP445 = (y==X10_TEMP443);
final boolean X10_TEMP449 = (X10_TEMP442&&X10_TEMP445);
final int X10_TEMP446 = (45);

final boolean X10_TEMP448 = (z==X10_TEMP446);

final boolean X10_TEMP451 = (X10_TEMP449&&X10_TEMP448);
final int X10_TEMP452 = (39);

final boolean X10_TEMP454 = (x==X10_TEMP452);
final int X10_TEMP455 = (0);

final boolean X10_TEMP457 = (y==X10_TEMP455);
final boolean X10_TEMP461 = (X10_TEMP454&&X10_TEMP457);
final int X10_TEMP458 = (5);

final boolean X10_TEMP460 = (z==X10_TEMP458);

final boolean X10_TEMP463 = (X10_TEMP461&&X10_TEMP460);
final boolean X10_TEMP476 = (X10_TEMP451||X10_TEMP463);
final int X10_TEMP464 = (45);

final boolean X10_TEMP466 = (x==X10_TEMP464);
final int X10_TEMP467 = (23);

final boolean X10_TEMP469 = (y==X10_TEMP467);
final boolean X10_TEMP473 = (X10_TEMP466&&X10_TEMP469);
final int X10_TEMP470 = (49);

final boolean X10_TEMP472 = (z==X10_TEMP470);

final boolean X10_TEMP475 = (X10_TEMP473&&X10_TEMP472);
final boolean X10_TEMP489 = (X10_TEMP476||X10_TEMP475);
final int X10_TEMP477 = (20);

final boolean X10_TEMP479 = (x==X10_TEMP477);
final int X10_TEMP480 = (32);

final boolean X10_TEMP482 = (y==X10_TEMP480);
final boolean X10_TEMP486 = (X10_TEMP479&&X10_TEMP482);
final int X10_TEMP483 = (58);

final boolean X10_TEMP485 = (z==X10_TEMP483);

final boolean X10_TEMP488 = (X10_TEMP486&&X10_TEMP485);
final boolean X10_TEMP502 = (X10_TEMP489||X10_TEMP488);
final int X10_TEMP490 = (23);

final boolean X10_TEMP492 = (x==X10_TEMP490);
final int X10_TEMP493 = (47);

final boolean X10_TEMP495 = (y==X10_TEMP493);
final boolean X10_TEMP499 = (X10_TEMP492&&X10_TEMP495);
final int X10_TEMP496 = (57);

final boolean X10_TEMP498 = (z==X10_TEMP496);

final boolean X10_TEMP501 = (X10_TEMP499&&X10_TEMP498);
final boolean X10_TEMP515 = (X10_TEMP502||X10_TEMP501);
final int X10_TEMP503 = (17);

final boolean X10_TEMP505 = (x==X10_TEMP503);
final int X10_TEMP506 = (43);

final boolean X10_TEMP508 = (y==X10_TEMP506);
final boolean X10_TEMP512 = (X10_TEMP505&&X10_TEMP508);
final int X10_TEMP509 = (53);

final boolean X10_TEMP511 = (z==X10_TEMP509);

final boolean X10_TEMP514 = (X10_TEMP512&&X10_TEMP511);
final boolean X10_TEMP528 = (X10_TEMP515||X10_TEMP514);
final int X10_TEMP516 = (8);

final boolean X10_TEMP518 = (x==X10_TEMP516);
final int X10_TEMP519 = (16);

final boolean X10_TEMP521 = (y==X10_TEMP519);
final boolean X10_TEMP525 = (X10_TEMP518&&X10_TEMP521);
final int X10_TEMP522 = (48);

final boolean X10_TEMP524 = (z==X10_TEMP522);

final boolean X10_TEMP527 = (X10_TEMP525&&X10_TEMP524);
final boolean X10_TEMP541 = (X10_TEMP528||X10_TEMP527);
final int X10_TEMP529 = (51);

final boolean X10_TEMP531 = (x==X10_TEMP529);
final int X10_TEMP532 = (46);

final boolean X10_TEMP534 = (y==X10_TEMP532);
final boolean X10_TEMP538 = (X10_TEMP531&&X10_TEMP534);
final int X10_TEMP535 = (26);

final boolean X10_TEMP537 = (z==X10_TEMP535);

final boolean X10_TEMP540 = (X10_TEMP538&&X10_TEMP537);
final boolean X10_TEMP554 = (X10_TEMP541||X10_TEMP540);
final int X10_TEMP542 = (58);

final boolean X10_TEMP544 = (x==X10_TEMP542);
final int X10_TEMP545 = (19);

final boolean X10_TEMP547 = (y==X10_TEMP545);
final boolean X10_TEMP551 = (X10_TEMP544&&X10_TEMP547);
final int X10_TEMP548 = (62);

final boolean X10_TEMP550 = (z==X10_TEMP548);

final boolean X10_TEMP553 = (X10_TEMP551&&X10_TEMP550);
final boolean X10_TEMP567 = (X10_TEMP554||X10_TEMP553);
final int X10_TEMP555 = (58);

final boolean X10_TEMP557 = (x==X10_TEMP555);
final int X10_TEMP558 = (15);

final boolean X10_TEMP560 = (y==X10_TEMP558);
final boolean X10_TEMP564 = (X10_TEMP557&&X10_TEMP560);
final int X10_TEMP561 = (54);

final boolean X10_TEMP563 = (z==X10_TEMP561);

final boolean X10_TEMP566 = (X10_TEMP564&&X10_TEMP563);

final boolean X10_TEMP569 = (X10_TEMP567||X10_TEMP566);
final boolean X10_TEMP571 = (R.contains(p));

final boolean X10_TEMP573 = X10_TEMP569&&X10_TEMP571;
if (X10_TEMP573) {
final double X10_TEMP577 = (1);
final double X10_TEMP578 = (X10_TEMP577);
temp[p] = (X10_TEMP578);
}
break;
}
case X10_TEMP580:
{
}
case X10_TEMP582:
{
final int X10_TEMP583 = (221);

final boolean X10_TEMP585 = (x==X10_TEMP583);
final int X10_TEMP586 = (40);

final boolean X10_TEMP588 = (y==X10_TEMP586);
final boolean X10_TEMP592 = (X10_TEMP585&&X10_TEMP588);
final int X10_TEMP589 = (238);

final boolean X10_TEMP591 = (z==X10_TEMP589);

final boolean X10_TEMP594 = (X10_TEMP592&&X10_TEMP591);
final int X10_TEMP595 = (152);

final boolean X10_TEMP597 = (x==X10_TEMP595);
final int X10_TEMP598 = (160);

final boolean X10_TEMP600 = (y==X10_TEMP598);
final boolean X10_TEMP604 = (X10_TEMP597&&X10_TEMP600);
final int X10_TEMP601 = (34);

final boolean X10_TEMP603 = (z==X10_TEMP601);

final boolean X10_TEMP606 = (X10_TEMP604&&X10_TEMP603);
final boolean X10_TEMP619 = (X10_TEMP594||X10_TEMP606);
final int X10_TEMP607 = (80);

final boolean X10_TEMP609 = (x==X10_TEMP607);
final int X10_TEMP610 = (182);

final boolean X10_TEMP612 = (y==X10_TEMP610);
final boolean X10_TEMP616 = (X10_TEMP609&&X10_TEMP612);
final int X10_TEMP613 = (253);

final boolean X10_TEMP615 = (z==X10_TEMP613);

final boolean X10_TEMP618 = (X10_TEMP616&&X10_TEMP615);
final boolean X10_TEMP632 = (X10_TEMP619||X10_TEMP618);
final int X10_TEMP620 = (248);

final boolean X10_TEMP622 = (x==X10_TEMP620);
final int X10_TEMP623 = (168);

final boolean X10_TEMP625 = (y==X10_TEMP623);
final boolean X10_TEMP629 = (X10_TEMP622&&X10_TEMP625);
final int X10_TEMP626 = (155);

final boolean X10_TEMP628 = (z==X10_TEMP626);

final boolean X10_TEMP631 = (X10_TEMP629&&X10_TEMP628);
final boolean X10_TEMP645 = (X10_TEMP632||X10_TEMP631);
final int X10_TEMP633 = (197);

final boolean X10_TEMP635 = (x==X10_TEMP633);
final int X10_TEMP636 = (5);

final boolean X10_TEMP638 = (y==X10_TEMP636);
final boolean X10_TEMP642 = (X10_TEMP635&&X10_TEMP638);
final int X10_TEMP639 = (201);

final boolean X10_TEMP641 = (z==X10_TEMP639);

final boolean X10_TEMP644 = (X10_TEMP642&&X10_TEMP641);
final boolean X10_TEMP658 = (X10_TEMP645||X10_TEMP644);
final int X10_TEMP646 = (90);

final boolean X10_TEMP648 = (x==X10_TEMP646);
final int X10_TEMP649 = (61);

final boolean X10_TEMP651 = (y==X10_TEMP649);
final boolean X10_TEMP655 = (X10_TEMP648&&X10_TEMP651);
final int X10_TEMP652 = (203);

final boolean X10_TEMP654 = (z==X10_TEMP652);

final boolean X10_TEMP657 = (X10_TEMP655&&X10_TEMP654);
final boolean X10_TEMP671 = (X10_TEMP658||X10_TEMP657);
final int X10_TEMP659 = (15);

final boolean X10_TEMP661 = (x==X10_TEMP659);
final int X10_TEMP662 = (203);

final boolean X10_TEMP664 = (y==X10_TEMP662);
final boolean X10_TEMP668 = (X10_TEMP661&&X10_TEMP664);
final int X10_TEMP665 = (30);

final boolean X10_TEMP667 = (z==X10_TEMP665);

final boolean X10_TEMP670 = (X10_TEMP668&&X10_TEMP667);
final boolean X10_TEMP684 = (X10_TEMP671||X10_TEMP670);
final int X10_TEMP672 = (99);

final boolean X10_TEMP674 = (x==X10_TEMP672);
final int X10_TEMP675 = (154);

final boolean X10_TEMP677 = (y==X10_TEMP675);
final boolean X10_TEMP681 = (X10_TEMP674&&X10_TEMP677);
final int X10_TEMP678 = (57);

final boolean X10_TEMP680 = (z==X10_TEMP678);

final boolean X10_TEMP683 = (X10_TEMP681&&X10_TEMP680);
final boolean X10_TEMP697 = (X10_TEMP684||X10_TEMP683);
final int X10_TEMP685 = (100);

final boolean X10_TEMP687 = (x==X10_TEMP685);
final int X10_TEMP688 = (136);

final boolean X10_TEMP690 = (y==X10_TEMP688);
final boolean X10_TEMP694 = (X10_TEMP687&&X10_TEMP690);
final int X10_TEMP691 = (110);

final boolean X10_TEMP693 = (z==X10_TEMP691);

final boolean X10_TEMP696 = (X10_TEMP694&&X10_TEMP693);
final boolean X10_TEMP710 = (X10_TEMP697||X10_TEMP696);
final int X10_TEMP698 = (209);

final boolean X10_TEMP700 = (x==X10_TEMP698);
final int X10_TEMP701 = (152);

final boolean X10_TEMP703 = (y==X10_TEMP701);
final boolean X10_TEMP707 = (X10_TEMP700&&X10_TEMP703);
final int X10_TEMP704 = (96);

final boolean X10_TEMP706 = (z==X10_TEMP704);

final boolean X10_TEMP709 = (X10_TEMP707&&X10_TEMP706);

final boolean X10_TEMP712 = (X10_TEMP710||X10_TEMP709);
final boolean X10_TEMP714 = (R.contains(p));

final boolean X10_TEMP716 = X10_TEMP712&&X10_TEMP714;
if (X10_TEMP716) {
final int X10_TEMP718 = (1);
final int X10_TEMP719 = 0;

final double X10_TEMP722 = (X10_TEMP719 - X10_TEMP718);
final double X10_TEMP723 = (X10_TEMP722);
temp[p] = (X10_TEMP723);
}
final int X10_TEMP724 = (52);

final boolean X10_TEMP726 = (x==X10_TEMP724);
final int X10_TEMP727 = (207);

final boolean X10_TEMP729 = (y==X10_TEMP727);
final boolean X10_TEMP733 = (X10_TEMP726&&X10_TEMP729);
final int X10_TEMP730 = (38);

final boolean X10_TEMP732 = (z==X10_TEMP730);

final boolean X10_TEMP735 = (X10_TEMP733&&X10_TEMP732);
final int X10_TEMP736 = (241);

final boolean X10_TEMP738 = (x==X10_TEMP736);
final int X10_TEMP739 = (170);

final boolean X10_TEMP741 = (y==X10_TEMP739);
final boolean X10_TEMP745 = (X10_TEMP738&&X10_TEMP741);
final int X10_TEMP742 = (12);

final boolean X10_TEMP744 = (z==X10_TEMP742);

final boolean X10_TEMP747 = (X10_TEMP745&&X10_TEMP744);
final boolean X10_TEMP760 = (X10_TEMP735||X10_TEMP747);
final int X10_TEMP748 = (201);

final boolean X10_TEMP750 = (x==X10_TEMP748);
final int X10_TEMP751 = (16);

final boolean X10_TEMP753 = (y==X10_TEMP751);
final boolean X10_TEMP757 = (X10_TEMP750&&X10_TEMP753);
final int X10_TEMP754 = (196);

final boolean X10_TEMP756 = (z==X10_TEMP754);

final boolean X10_TEMP759 = (X10_TEMP757&&X10_TEMP756);
final boolean X10_TEMP773 = (X10_TEMP760||X10_TEMP759);
final int X10_TEMP761 = (200);

final boolean X10_TEMP763 = (x==X10_TEMP761);
final int X10_TEMP764 = (81);

final boolean X10_TEMP766 = (y==X10_TEMP764);
final boolean X10_TEMP770 = (X10_TEMP763&&X10_TEMP766);
final int X10_TEMP767 = (207);

final boolean X10_TEMP769 = (z==X10_TEMP767);

final boolean X10_TEMP772 = (X10_TEMP770&&X10_TEMP769);
final boolean X10_TEMP786 = (X10_TEMP773||X10_TEMP772);
final int X10_TEMP774 = (113);

final boolean X10_TEMP776 = (x==X10_TEMP774);
final int X10_TEMP777 = (121);

final boolean X10_TEMP779 = (y==X10_TEMP777);
final boolean X10_TEMP783 = (X10_TEMP776&&X10_TEMP779);
final int X10_TEMP780 = (205);

final boolean X10_TEMP782 = (z==X10_TEMP780);

final boolean X10_TEMP785 = (X10_TEMP783&&X10_TEMP782);
final boolean X10_TEMP799 = (X10_TEMP786||X10_TEMP785);
final int X10_TEMP787 = (210);

final boolean X10_TEMP789 = (x==X10_TEMP787);
final int X10_TEMP790 = (5);

final boolean X10_TEMP792 = (y==X10_TEMP790);
final boolean X10_TEMP796 = (X10_TEMP789&&X10_TEMP792);
final int X10_TEMP793 = (246);

final boolean X10_TEMP795 = (z==X10_TEMP793);

final boolean X10_TEMP798 = (X10_TEMP796&&X10_TEMP795);
final boolean X10_TEMP812 = (X10_TEMP799||X10_TEMP798);
final int X10_TEMP800 = (43);

final boolean X10_TEMP802 = (x==X10_TEMP800);
final int X10_TEMP803 = (192);

final boolean X10_TEMP805 = (y==X10_TEMP803);
final boolean X10_TEMP809 = (X10_TEMP802&&X10_TEMP805);
final int X10_TEMP806 = (232);

final boolean X10_TEMP808 = (z==X10_TEMP806);

final boolean X10_TEMP811 = (X10_TEMP809&&X10_TEMP808);
final boolean X10_TEMP825 = (X10_TEMP812||X10_TEMP811);
final int X10_TEMP813 = (174);

final boolean X10_TEMP815 = (x==X10_TEMP813);
final int X10_TEMP816 = (244);

final boolean X10_TEMP818 = (y==X10_TEMP816);
final boolean X10_TEMP822 = (X10_TEMP815&&X10_TEMP818);
final int X10_TEMP819 = (162);

final boolean X10_TEMP821 = (z==X10_TEMP819);

final boolean X10_TEMP824 = (X10_TEMP822&&X10_TEMP821);
final boolean X10_TEMP838 = (X10_TEMP825||X10_TEMP824);
final int X10_TEMP826 = (3);

final boolean X10_TEMP828 = (x==X10_TEMP826);
final int X10_TEMP829 = (116);

final boolean X10_TEMP831 = (y==X10_TEMP829);
final boolean X10_TEMP835 = (X10_TEMP828&&X10_TEMP831);
final int X10_TEMP832 = (173);

final boolean X10_TEMP834 = (z==X10_TEMP832);

final boolean X10_TEMP837 = (X10_TEMP835&&X10_TEMP834);
final boolean X10_TEMP851 = (X10_TEMP838||X10_TEMP837);
final int X10_TEMP839 = (55);

final boolean X10_TEMP841 = (x==X10_TEMP839);
final int X10_TEMP842 = (118);

final boolean X10_TEMP844 = (y==X10_TEMP842);
final boolean X10_TEMP848 = (X10_TEMP841&&X10_TEMP844);
final int X10_TEMP845 = (165);

final boolean X10_TEMP847 = (z==X10_TEMP845);

final boolean X10_TEMP850 = (X10_TEMP848&&X10_TEMP847);

final boolean X10_TEMP853 = (X10_TEMP851||X10_TEMP850);
final boolean X10_TEMP855 = (R.contains(p));

final boolean X10_TEMP857 = X10_TEMP853&&X10_TEMP855;
if (X10_TEMP857) {
final double X10_TEMP861 = (1);
final double X10_TEMP862 = (X10_TEMP861);
temp[p] = (X10_TEMP862);
}
break;
}
case X10_TEMP864:
{
final int X10_TEMP865 = (397);

final boolean X10_TEMP867 = (x==X10_TEMP865);
final int X10_TEMP868 = (310);

final boolean X10_TEMP870 = (y==X10_TEMP868);
final boolean X10_TEMP874 = (X10_TEMP867&&X10_TEMP870);
final int X10_TEMP871 = (198);

final boolean X10_TEMP873 = (z==X10_TEMP871);

final boolean X10_TEMP876 = (X10_TEMP874&&X10_TEMP873);
final int X10_TEMP877 = (94);

final boolean X10_TEMP879 = (x==X10_TEMP877);
final int X10_TEMP880 = (399);

final boolean X10_TEMP882 = (y==X10_TEMP880);
final boolean X10_TEMP886 = (X10_TEMP879&&X10_TEMP882);
final int X10_TEMP883 = (236);

final boolean X10_TEMP885 = (z==X10_TEMP883);

final boolean X10_TEMP888 = (X10_TEMP886&&X10_TEMP885);
final boolean X10_TEMP901 = (X10_TEMP876||X10_TEMP888);
final int X10_TEMP889 = (221);

final boolean X10_TEMP891 = (x==X10_TEMP889);
final int X10_TEMP892 = (276);

final boolean X10_TEMP894 = (y==X10_TEMP892);
final boolean X10_TEMP898 = (X10_TEMP891&&X10_TEMP894);
final int X10_TEMP895 = (59);

final boolean X10_TEMP897 = (z==X10_TEMP895);

final boolean X10_TEMP900 = (X10_TEMP898&&X10_TEMP897);
final boolean X10_TEMP914 = (X10_TEMP901||X10_TEMP900);
final int X10_TEMP902 = (342);

final boolean X10_TEMP904 = (x==X10_TEMP902);
final int X10_TEMP905 = (137);

final boolean X10_TEMP907 = (y==X10_TEMP905);
final boolean X10_TEMP911 = (X10_TEMP904&&X10_TEMP907);
final int X10_TEMP908 = (166);

final boolean X10_TEMP910 = (z==X10_TEMP908);

final boolean X10_TEMP913 = (X10_TEMP911&&X10_TEMP910);
final boolean X10_TEMP927 = (X10_TEMP914||X10_TEMP913);
final int X10_TEMP915 = (381);

final boolean X10_TEMP917 = (x==X10_TEMP915);
final int X10_TEMP918 = (72);

final boolean X10_TEMP920 = (y==X10_TEMP918);
final boolean X10_TEMP924 = (X10_TEMP917&&X10_TEMP920);
final int X10_TEMP921 = (281);

final boolean X10_TEMP923 = (z==X10_TEMP921);

final boolean X10_TEMP926 = (X10_TEMP924&&X10_TEMP923);
final boolean X10_TEMP940 = (X10_TEMP927||X10_TEMP926);
final int X10_TEMP928 = (350);

final boolean X10_TEMP930 = (x==X10_TEMP928);
final int X10_TEMP931 = (192);

final boolean X10_TEMP933 = (y==X10_TEMP931);
final boolean X10_TEMP937 = (X10_TEMP930&&X10_TEMP933);
final int X10_TEMP934 = (416);

final boolean X10_TEMP936 = (z==X10_TEMP934);

final boolean X10_TEMP939 = (X10_TEMP937&&X10_TEMP936);
final boolean X10_TEMP953 = (X10_TEMP940||X10_TEMP939);
final int X10_TEMP941 = (16);

final boolean X10_TEMP943 = (x==X10_TEMP941);
final int X10_TEMP944 = (19);

final boolean X10_TEMP946 = (y==X10_TEMP944);
final boolean X10_TEMP950 = (X10_TEMP943&&X10_TEMP946);
final int X10_TEMP947 = (455);

final boolean X10_TEMP949 = (z==X10_TEMP947);

final boolean X10_TEMP952 = (X10_TEMP950&&X10_TEMP949);
final boolean X10_TEMP966 = (X10_TEMP953||X10_TEMP952);
final int X10_TEMP954 = (152);

final boolean X10_TEMP956 = (x==X10_TEMP954);
final int X10_TEMP957 = (336);

final boolean X10_TEMP959 = (y==X10_TEMP957);
final boolean X10_TEMP963 = (X10_TEMP956&&X10_TEMP959);
final int X10_TEMP960 = (8);

final boolean X10_TEMP962 = (z==X10_TEMP960);

final boolean X10_TEMP965 = (X10_TEMP963&&X10_TEMP962);
final boolean X10_TEMP979 = (X10_TEMP966||X10_TEMP965);
final int X10_TEMP967 = (400);

final boolean X10_TEMP969 = (x==X10_TEMP967);
final int X10_TEMP970 = (502);

final boolean X10_TEMP972 = (y==X10_TEMP970);
final boolean X10_TEMP976 = (X10_TEMP969&&X10_TEMP972);
final int X10_TEMP973 = (447);

final boolean X10_TEMP975 = (z==X10_TEMP973);

final boolean X10_TEMP978 = (X10_TEMP976&&X10_TEMP975);
final boolean X10_TEMP992 = (X10_TEMP979||X10_TEMP978);
final int X10_TEMP980 = (72);

final boolean X10_TEMP982 = (x==X10_TEMP980);
final int X10_TEMP983 = (0);

final boolean X10_TEMP985 = (y==X10_TEMP983);
final boolean X10_TEMP989 = (X10_TEMP982&&X10_TEMP985);
final int X10_TEMP986 = (105);

final boolean X10_TEMP988 = (z==X10_TEMP986);

final boolean X10_TEMP991 = (X10_TEMP989&&X10_TEMP988);

final boolean X10_TEMP994 = (X10_TEMP992||X10_TEMP991);
final boolean X10_TEMP996 = (R.contains(p));

final boolean X10_TEMP998 = X10_TEMP994&&X10_TEMP996;
if (X10_TEMP998) {
final int X10_TEMP1000 = (1);
final int X10_TEMP1001 = 0;

final double X10_TEMP1004 = (X10_TEMP1001 - X10_TEMP1000);
final double X10_TEMP1005 = (X10_TEMP1004);
temp[p] = (X10_TEMP1005);
}
final int X10_TEMP1006 = (308);

final boolean X10_TEMP1008 = (x==X10_TEMP1006);
final int X10_TEMP1009 = (359);

final boolean X10_TEMP1011 = (y==X10_TEMP1009);
final boolean X10_TEMP1015 = (X10_TEMP1008&&X10_TEMP1011);
final int X10_TEMP1012 = (9);

final boolean X10_TEMP1014 = (z==X10_TEMP1012);

final boolean X10_TEMP1017 = (X10_TEMP1015&&X10_TEMP1014);
final int X10_TEMP1018 = (9);

final boolean X10_TEMP1020 = (x==X10_TEMP1018);
final int X10_TEMP1021 = (491);

final boolean X10_TEMP1023 = (y==X10_TEMP1021);
final boolean X10_TEMP1027 = (X10_TEMP1020&&X10_TEMP1023);
final int X10_TEMP1024 = (116);

final boolean X10_TEMP1026 = (z==X10_TEMP1024);

final boolean X10_TEMP1029 = (X10_TEMP1027&&X10_TEMP1026);
final boolean X10_TEMP1042 = (X10_TEMP1017||X10_TEMP1029);
final int X10_TEMP1030 = (449);

final boolean X10_TEMP1032 = (x==X10_TEMP1030);
final int X10_TEMP1033 = (268);

final boolean X10_TEMP1035 = (y==X10_TEMP1033);
final boolean X10_TEMP1039 = (X10_TEMP1032&&X10_TEMP1035);
final int X10_TEMP1036 = (441);

final boolean X10_TEMP1038 = (z==X10_TEMP1036);

final boolean X10_TEMP1041 = (X10_TEMP1039&&X10_TEMP1038);
final boolean X10_TEMP1055 = (X10_TEMP1042||X10_TEMP1041);
final int X10_TEMP1043 = (147);

final boolean X10_TEMP1045 = (x==X10_TEMP1043);
final int X10_TEMP1046 = (115);

final boolean X10_TEMP1048 = (y==X10_TEMP1046);
final boolean X10_TEMP1052 = (X10_TEMP1045&&X10_TEMP1048);
final int X10_TEMP1049 = (197);

final boolean X10_TEMP1051 = (z==X10_TEMP1049);

final boolean X10_TEMP1054 = (X10_TEMP1052&&X10_TEMP1051);
final boolean X10_TEMP1068 = (X10_TEMP1055||X10_TEMP1054);
final int X10_TEMP1056 = (241);

final boolean X10_TEMP1058 = (x==X10_TEMP1056);
final int X10_TEMP1059 = (85);

final boolean X10_TEMP1061 = (y==X10_TEMP1059);
final boolean X10_TEMP1065 = (X10_TEMP1058&&X10_TEMP1061);
final int X10_TEMP1062 = (3);

final boolean X10_TEMP1064 = (z==X10_TEMP1062);

final boolean X10_TEMP1067 = (X10_TEMP1065&&X10_TEMP1064);
final boolean X10_TEMP1081 = (X10_TEMP1068||X10_TEMP1067);
final int X10_TEMP1069 = (507);

final boolean X10_TEMP1071 = (x==X10_TEMP1069);
final int X10_TEMP1072 = (41);

final boolean X10_TEMP1074 = (y==X10_TEMP1072);
final boolean X10_TEMP1078 = (X10_TEMP1071&&X10_TEMP1074);
final int X10_TEMP1075 = (125);

final boolean X10_TEMP1077 = (z==X10_TEMP1075);

final boolean X10_TEMP1080 = (X10_TEMP1078&&X10_TEMP1077);
final boolean X10_TEMP1094 = (X10_TEMP1081||X10_TEMP1080);
final int X10_TEMP1082 = (161);

final boolean X10_TEMP1084 = (x==X10_TEMP1082);
final int X10_TEMP1085 = (278);

final boolean X10_TEMP1087 = (y==X10_TEMP1085);
final boolean X10_TEMP1091 = (X10_TEMP1084&&X10_TEMP1087);
final int X10_TEMP1088 = (73);

final boolean X10_TEMP1090 = (z==X10_TEMP1088);

final boolean X10_TEMP1093 = (X10_TEMP1091&&X10_TEMP1090);
final boolean X10_TEMP1107 = (X10_TEMP1094||X10_TEMP1093);
final int X10_TEMP1095 = (144);

final boolean X10_TEMP1097 = (x==X10_TEMP1095);
final int X10_TEMP1098 = (91);

final boolean X10_TEMP1100 = (y==X10_TEMP1098);
final boolean X10_TEMP1104 = (X10_TEMP1097&&X10_TEMP1100);
final int X10_TEMP1101 = (310);

final boolean X10_TEMP1103 = (z==X10_TEMP1101);

final boolean X10_TEMP1106 = (X10_TEMP1104&&X10_TEMP1103);
final boolean X10_TEMP1120 = (X10_TEMP1107||X10_TEMP1106);
final int X10_TEMP1108 = (201);

final boolean X10_TEMP1110 = (x==X10_TEMP1108);
final int X10_TEMP1111 = (8);

final boolean X10_TEMP1113 = (y==X10_TEMP1111);
final boolean X10_TEMP1117 = (X10_TEMP1110&&X10_TEMP1113);
final int X10_TEMP1114 = (49);

final boolean X10_TEMP1116 = (z==X10_TEMP1114);

final boolean X10_TEMP1119 = (X10_TEMP1117&&X10_TEMP1116);
final boolean X10_TEMP1133 = (X10_TEMP1120||X10_TEMP1119);
final int X10_TEMP1121 = (149);

final boolean X10_TEMP1123 = (x==X10_TEMP1121);
final int X10_TEMP1124 = (399);

final boolean X10_TEMP1126 = (y==X10_TEMP1124);
final boolean X10_TEMP1130 = (X10_TEMP1123&&X10_TEMP1126);
final int X10_TEMP1127 = (329);

final boolean X10_TEMP1129 = (z==X10_TEMP1127);

final boolean X10_TEMP1132 = (X10_TEMP1130&&X10_TEMP1129);

final boolean X10_TEMP1135 = (X10_TEMP1133||X10_TEMP1132);
final boolean X10_TEMP1137 = (R.contains(p));

final boolean X10_TEMP1139 = X10_TEMP1135&&X10_TEMP1137;
if (X10_TEMP1139) {
final double X10_TEMP1143 = (1);
final double X10_TEMP1144 = (X10_TEMP1143);
temp[p] = (X10_TEMP1144);
}
break;
}
case X10_TEMP1146:
{
final int X10_TEMP1147 = (186);

final boolean X10_TEMP1149 = (x==X10_TEMP1147);
final int X10_TEMP1150 = (374);

final boolean X10_TEMP1152 = (y==X10_TEMP1150);
final boolean X10_TEMP1156 = (X10_TEMP1149&&X10_TEMP1152);
final int X10_TEMP1153 = (694);

final boolean X10_TEMP1155 = (z==X10_TEMP1153);

final boolean X10_TEMP1158 = (X10_TEMP1156&&X10_TEMP1155);
final int X10_TEMP1159 = (773);

final boolean X10_TEMP1161 = (x==X10_TEMP1159);
final int X10_TEMP1162 = (345);

final boolean X10_TEMP1164 = (y==X10_TEMP1162);
final boolean X10_TEMP1168 = (X10_TEMP1161&&X10_TEMP1164);
final int X10_TEMP1165 = (474);

final boolean X10_TEMP1167 = (z==X10_TEMP1165);

final boolean X10_TEMP1170 = (X10_TEMP1168&&X10_TEMP1167);
final boolean X10_TEMP1183 = (X10_TEMP1158||X10_TEMP1170);
final int X10_TEMP1171 = (478);

final boolean X10_TEMP1173 = (x==X10_TEMP1171);
final int X10_TEMP1174 = (874);

final boolean X10_TEMP1176 = (y==X10_TEMP1174);
final boolean X10_TEMP1180 = (X10_TEMP1173&&X10_TEMP1176);
final int X10_TEMP1177 = (804);

final boolean X10_TEMP1179 = (z==X10_TEMP1177);

final boolean X10_TEMP1182 = (X10_TEMP1180&&X10_TEMP1179);
final boolean X10_TEMP1196 = (X10_TEMP1183||X10_TEMP1182);
final int X10_TEMP1184 = (306);

final boolean X10_TEMP1186 = (x==X10_TEMP1184);
final int X10_TEMP1187 = (75);

final boolean X10_TEMP1189 = (y==X10_TEMP1187);
final boolean X10_TEMP1193 = (X10_TEMP1186&&X10_TEMP1189);
final int X10_TEMP1190 = (624);

final boolean X10_TEMP1192 = (z==X10_TEMP1190);

final boolean X10_TEMP1195 = (X10_TEMP1193&&X10_TEMP1192);
final boolean X10_TEMP1209 = (X10_TEMP1196||X10_TEMP1195);
final int X10_TEMP1197 = (397);

final boolean X10_TEMP1199 = (x==X10_TEMP1197);
final int X10_TEMP1200 = (667);

final boolean X10_TEMP1202 = (y==X10_TEMP1200);
final boolean X10_TEMP1206 = (X10_TEMP1199&&X10_TEMP1202);
final int X10_TEMP1203 = (49);

final boolean X10_TEMP1205 = (z==X10_TEMP1203);

final boolean X10_TEMP1208 = (X10_TEMP1206&&X10_TEMP1205);
final boolean X10_TEMP1222 = (X10_TEMP1209||X10_TEMP1208);
final int X10_TEMP1210 = (606);

final boolean X10_TEMP1212 = (x==X10_TEMP1210);
final int X10_TEMP1213 = (199);

final boolean X10_TEMP1215 = (y==X10_TEMP1213);
final boolean X10_TEMP1219 = (X10_TEMP1212&&X10_TEMP1215);
final int X10_TEMP1216 = (59);

final boolean X10_TEMP1218 = (z==X10_TEMP1216);

final boolean X10_TEMP1221 = (X10_TEMP1219&&X10_TEMP1218);
final boolean X10_TEMP1235 = (X10_TEMP1222||X10_TEMP1221);
final int X10_TEMP1223 = (892);

final boolean X10_TEMP1225 = (x==X10_TEMP1223);
final int X10_TEMP1226 = (70);

final boolean X10_TEMP1228 = (y==X10_TEMP1226);
final boolean X10_TEMP1232 = (X10_TEMP1225&&X10_TEMP1228);
final int X10_TEMP1229 = (361);

final boolean X10_TEMP1231 = (z==X10_TEMP1229);

final boolean X10_TEMP1234 = (X10_TEMP1232&&X10_TEMP1231);
final boolean X10_TEMP1248 = (X10_TEMP1235||X10_TEMP1234);
final int X10_TEMP1236 = (844);

final boolean X10_TEMP1238 = (x==X10_TEMP1236);
final int X10_TEMP1239 = (261);

final boolean X10_TEMP1241 = (y==X10_TEMP1239);
final boolean X10_TEMP1245 = (X10_TEMP1238&&X10_TEMP1241);
final int X10_TEMP1242 = (252);

final boolean X10_TEMP1244 = (z==X10_TEMP1242);

final boolean X10_TEMP1247 = (X10_TEMP1245&&X10_TEMP1244);
final boolean X10_TEMP1261 = (X10_TEMP1248||X10_TEMP1247);
final int X10_TEMP1249 = (221);

final boolean X10_TEMP1251 = (x==X10_TEMP1249);
final int X10_TEMP1252 = (906);

final boolean X10_TEMP1254 = (y==X10_TEMP1252);
final boolean X10_TEMP1258 = (X10_TEMP1251&&X10_TEMP1254);
final int X10_TEMP1255 = (14);

final boolean X10_TEMP1257 = (z==X10_TEMP1255);

final boolean X10_TEMP1260 = (X10_TEMP1258&&X10_TEMP1257);
final boolean X10_TEMP1274 = (X10_TEMP1261||X10_TEMP1260);
final int X10_TEMP1262 = (85);

final boolean X10_TEMP1264 = (x==X10_TEMP1262);
final int X10_TEMP1265 = (327);

final boolean X10_TEMP1267 = (y==X10_TEMP1265);
final boolean X10_TEMP1271 = (X10_TEMP1264&&X10_TEMP1267);
final int X10_TEMP1268 = (232);

final boolean X10_TEMP1270 = (z==X10_TEMP1268);

final boolean X10_TEMP1273 = (X10_TEMP1271&&X10_TEMP1270);

final boolean X10_TEMP1276 = (X10_TEMP1274||X10_TEMP1273);
final boolean X10_TEMP1278 = (R.contains(p));

final boolean X10_TEMP1280 = X10_TEMP1276&&X10_TEMP1278;
if (X10_TEMP1280) {
final int X10_TEMP1282 = (1);
final int X10_TEMP1283 = 0;

final double X10_TEMP1286 = (X10_TEMP1283 - X10_TEMP1282);
final double X10_TEMP1287 = (X10_TEMP1286);
temp[p] = (X10_TEMP1287);
}
final int X10_TEMP1288 = (739);

final boolean X10_TEMP1290 = (x==X10_TEMP1288);
final int X10_TEMP1291 = (879);

final boolean X10_TEMP1293 = (y==X10_TEMP1291);
final boolean X10_TEMP1297 = (X10_TEMP1290&&X10_TEMP1293);
final int X10_TEMP1294 = (781);

final boolean X10_TEMP1296 = (z==X10_TEMP1294);

final boolean X10_TEMP1299 = (X10_TEMP1297&&X10_TEMP1296);
final int X10_TEMP1300 = (742);

final boolean X10_TEMP1302 = (x==X10_TEMP1300);
final int X10_TEMP1303 = (641);

final boolean X10_TEMP1305 = (y==X10_TEMP1303);
final boolean X10_TEMP1309 = (X10_TEMP1302&&X10_TEMP1305);
final int X10_TEMP1306 = (147);

final boolean X10_TEMP1308 = (z==X10_TEMP1306);

final boolean X10_TEMP1311 = (X10_TEMP1309&&X10_TEMP1308);
final boolean X10_TEMP1324 = (X10_TEMP1299||X10_TEMP1311);
final int X10_TEMP1312 = (335);

final boolean X10_TEMP1314 = (x==X10_TEMP1312);
final int X10_TEMP1315 = (295);

final boolean X10_TEMP1317 = (y==X10_TEMP1315);
final boolean X10_TEMP1321 = (X10_TEMP1314&&X10_TEMP1317);
final int X10_TEMP1318 = (600);

final boolean X10_TEMP1320 = (z==X10_TEMP1318);

final boolean X10_TEMP1323 = (X10_TEMP1321&&X10_TEMP1320);
final boolean X10_TEMP1337 = (X10_TEMP1324||X10_TEMP1323);
final int X10_TEMP1325 = (982);

final boolean X10_TEMP1327 = (x==X10_TEMP1325);
final int X10_TEMP1328 = (944);

final boolean X10_TEMP1330 = (y==X10_TEMP1328);
final boolean X10_TEMP1334 = (X10_TEMP1327&&X10_TEMP1330);
final int X10_TEMP1331 = (696);

final boolean X10_TEMP1333 = (z==X10_TEMP1331);

final boolean X10_TEMP1336 = (X10_TEMP1334&&X10_TEMP1333);
final boolean X10_TEMP1350 = (X10_TEMP1337||X10_TEMP1336);
final int X10_TEMP1338 = (622);

final boolean X10_TEMP1340 = (x==X10_TEMP1338);
final int X10_TEMP1341 = (881);

final boolean X10_TEMP1343 = (y==X10_TEMP1341);
final boolean X10_TEMP1347 = (X10_TEMP1340&&X10_TEMP1343);
final int X10_TEMP1344 = (180);

final boolean X10_TEMP1346 = (z==X10_TEMP1344);

final boolean X10_TEMP1349 = (X10_TEMP1347&&X10_TEMP1346);
final boolean X10_TEMP1363 = (X10_TEMP1350||X10_TEMP1349);
final int X10_TEMP1351 = (956);

final boolean X10_TEMP1353 = (x==X10_TEMP1351);
final int X10_TEMP1354 = (217);

final boolean X10_TEMP1356 = (y==X10_TEMP1354);
final boolean X10_TEMP1360 = (X10_TEMP1353&&X10_TEMP1356);
final int X10_TEMP1357 = (952);

final boolean X10_TEMP1359 = (z==X10_TEMP1357);

final boolean X10_TEMP1362 = (X10_TEMP1360&&X10_TEMP1359);
final boolean X10_TEMP1376 = (X10_TEMP1363||X10_TEMP1362);
final int X10_TEMP1364 = (777);

final boolean X10_TEMP1366 = (x==X10_TEMP1364);
final int X10_TEMP1367 = (453);

final boolean X10_TEMP1369 = (y==X10_TEMP1367);
final boolean X10_TEMP1373 = (X10_TEMP1366&&X10_TEMP1369);
final int X10_TEMP1370 = (706);

final boolean X10_TEMP1372 = (z==X10_TEMP1370);

final boolean X10_TEMP1375 = (X10_TEMP1373&&X10_TEMP1372);
final boolean X10_TEMP1389 = (X10_TEMP1376||X10_TEMP1375);
final int X10_TEMP1377 = (258);

final boolean X10_TEMP1379 = (x==X10_TEMP1377);
final int X10_TEMP1380 = (730);

final boolean X10_TEMP1382 = (y==X10_TEMP1380);
final boolean X10_TEMP1386 = (X10_TEMP1379&&X10_TEMP1382);
final int X10_TEMP1383 = (482);

final boolean X10_TEMP1385 = (z==X10_TEMP1383);

final boolean X10_TEMP1388 = (X10_TEMP1386&&X10_TEMP1385);
final boolean X10_TEMP1402 = (X10_TEMP1389||X10_TEMP1388);
final int X10_TEMP1390 = (271);

final boolean X10_TEMP1392 = (x==X10_TEMP1390);
final int X10_TEMP1393 = (75);

final boolean X10_TEMP1395 = (y==X10_TEMP1393);
final boolean X10_TEMP1399 = (X10_TEMP1392&&X10_TEMP1395);
final int X10_TEMP1396 = (815);

final boolean X10_TEMP1398 = (z==X10_TEMP1396);

final boolean X10_TEMP1401 = (X10_TEMP1399&&X10_TEMP1398);
final boolean X10_TEMP1415 = (X10_TEMP1402||X10_TEMP1401);
final int X10_TEMP1403 = (78);

final boolean X10_TEMP1405 = (x==X10_TEMP1403);
final int X10_TEMP1406 = (276);

final boolean X10_TEMP1408 = (y==X10_TEMP1406);
final boolean X10_TEMP1412 = (X10_TEMP1405&&X10_TEMP1408);
final int X10_TEMP1409 = (250);

final boolean X10_TEMP1411 = (z==X10_TEMP1409);

final boolean X10_TEMP1414 = (X10_TEMP1412&&X10_TEMP1411);

final boolean X10_TEMP1417 = (X10_TEMP1415||X10_TEMP1414);
final boolean X10_TEMP1419 = (R.contains(p));

final boolean X10_TEMP1421 = X10_TEMP1417&&X10_TEMP1419;
if (X10_TEMP1421) {
final double X10_TEMP1425 = (1);
final double X10_TEMP1426 = (X10_TEMP1425);
temp[p] = (X10_TEMP1426);
}
break;
}
}
}
}
}
}
}
final boolean X10_TEMP1428 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP1428) {
finish {
Program.LevelData_exchange(X10_TEMP0);
}
}
}
public static void LevelData_set(final LevelData X10_TEMP0, final double a_db) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final Wrapper X10_TEMP6 = (Program.LevelData_get_m_u(X10_TEMP0,i));
final double[:rank==3] X10_TEMP7 = (double[:rank==3])(X10_TEMP6.m_array);

final double[:rank==3] temp = (double[:rank==3])(X10_TEMP7);
final region(:rank==3) X10_TEMP11 = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,i));
for(point(:rank==3)p:X10_TEMP11) {
final double X10_TEMP15 = (a_db);
temp[p] = (X10_TEMP15);
}
}
}
}
final boolean X10_TEMP17 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP17) {
finish {
Program.LevelData_exchange(X10_TEMP0);
}
}
}
public static void LevelData_setLevelData(final LevelData X10_TEMP0, final LevelData a_LD) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final Wrapper[:rank==1] X10_TEMP5 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP7 = (X10_TEMP5[i]);
final double[:rank==3] X10_TEMP8 = (double[:rank==3])(X10_TEMP7.m_array);

final double[:rank==3] u = (double[:rank==3])(X10_TEMP8);
final double[:rank==3] temp = (double[:rank==3])(Program.LevelData_getArray(a_LD,i));
final region(:rank==3) mri = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,i));
for(point(:rank==3)p:mri) {
final double tp = (temp[p]);
final dist(:rank==3) X10_TEMP17 = (dist(:rank==3))(u.distribution);

final place X10_TEMP20 = X10_TEMP17.get(p);
async(X10_TEMP20) {
final double X10_TEMP24 = (tp);
u[p] = (X10_TEMP24);
}
}
}
}
}
final boolean X10_TEMP26 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP26) {
finish {
Program.LevelData_exchange(X10_TEMP0);
}
}
}
public static void LevelData_add(final LevelData X10_TEMP0, final LevelData a_LD) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final Wrapper X10_TEMP6 = (Program.LevelData_get_m_u(X10_TEMP0,i));
final double[:rank==3] X10_TEMP7 = (double[:rank==3])(X10_TEMP6.m_array);

final double[:rank==3] u = (double[:rank==3])(X10_TEMP7);
final double[:rank==3] temp = (double[:rank==3])(Program.LevelData_getArray(a_LD,i));
final region(:rank==3) X10_TEMP13 = (region(:rank==3))(Program.LevelData_get_m_regions(X10_TEMP0,i));
for(point(:rank==3)p:X10_TEMP13) {
final double X10_TEMP17 = (u[p]);
final double X10_TEMP18 = (temp[p]);

final double X10_TEMP21 = (X10_TEMP17+X10_TEMP18);
final double X10_TEMP22 = (X10_TEMP21);
u[p] = (X10_TEMP22);
}
}
}
}
final boolean X10_TEMP24 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP24) {
finish {
Program.LevelData_exchange(X10_TEMP0);
}
}
}
public static void LevelData_Exchange(final LevelData X10_TEMP0) {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (2);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
for(point(:rank==1)[j]:X10_TEMP6) {
final int jj = (j);
finish {
final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP10[i]:X10_TEMP9) {
final place X10_TEMP11 = X10_TEMP9.get(X10_TEMP10);
async(X10_TEMP11) {
final region(:rank==3) X10_TEMP12 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest0 = (X10_TEMP12.coord(i)[0]);
final region(:rank==3) X10_TEMP15 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest1 = (X10_TEMP15.coord(i)[1]);
final region(:rank==3) X10_TEMP18 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest2 = (X10_TEMP18.coord(i)[2]);
final int ii = (i);
final region(:rank==1) X10_TEMP25 = (region(:rank==1))([_LevelData_LOW:_LevelData_HIGH]);
for(point(:rank==1)[p]:X10_TEMP25) {
int disp0 = (0);
int disp1 = (0);
int disp2 = (0);
int source0 = (0);
int source1 = (0);
int source2 = (0);
int trans0 = (0);
int trans1 = (0);
int trans2 = (0);
int sourceID = (0);
int k = (0);
final boolean X10_TEMP38 = p==_LevelData_LOW;
if (X10_TEMP38) {
final int X10_TEMP39 = (2);

final int X10_TEMP41 = (jj*X10_TEMP39);
k = (X10_TEMP41);
final int X10_TEMP42 = (0);
final boolean X10_TEMP43 = jj==X10_TEMP42;
int X10_TEMP46 = 0;
if(X10_TEMP43){
X10_TEMP46 = 1;
}
final int X10_TEMP47 = X10_TEMP46;

final int X10_TEMP48 = (X10_TEMP47);

disp0 = (X10_TEMP48);
final int X10_TEMP50 = (1);
final boolean X10_TEMP51 = jj==X10_TEMP50;
int X10_TEMP54 = 0;
if(X10_TEMP51){
X10_TEMP54 = 1;
}
final int X10_TEMP55 = X10_TEMP54;

final int X10_TEMP56 = (X10_TEMP55);

disp1 = (X10_TEMP56);
final int X10_TEMP58 = (2);
final boolean X10_TEMP59 = jj==X10_TEMP58;
int X10_TEMP62 = 0;
if(X10_TEMP59){
X10_TEMP62 = 1;
}
final int X10_TEMP63 = X10_TEMP62;

final int X10_TEMP64 = (X10_TEMP63);

disp2 = (X10_TEMP64);
}
else {
final int X10_TEMP66 = (2);
final int X10_TEMP67 = (jj*X10_TEMP66);
final int X10_TEMP68 = (1);

final int X10_TEMP70 = (X10_TEMP67+X10_TEMP68);
k = (X10_TEMP70);
final int X10_TEMP71 = (0);
final boolean X10_TEMP72 = jj==X10_TEMP71;
final int X10_TEMP73 = (1);
final int X10_TEMP74 = 0;
int X10_TEMP77 = 0;
if(X10_TEMP72){
X10_TEMP77 = X10_TEMP74 - X10_TEMP73;
}
final int X10_TEMP78 = X10_TEMP77;

final int X10_TEMP79 = (X10_TEMP78);

disp0 = (X10_TEMP79);
final int X10_TEMP81 = (1);
final boolean X10_TEMP82 = jj==X10_TEMP81;
final int X10_TEMP83 = (1);
final int X10_TEMP84 = 0;
int X10_TEMP87 = 0;
if(X10_TEMP82){
X10_TEMP87 = X10_TEMP84 - X10_TEMP83;
}
final int X10_TEMP88 = X10_TEMP87;

final int X10_TEMP89 = (X10_TEMP88);

disp1 = (X10_TEMP89);
final int X10_TEMP91 = (2);
final boolean X10_TEMP92 = jj==X10_TEMP91;
final int X10_TEMP93 = (1);
final int X10_TEMP94 = 0;
int X10_TEMP97 = 0;
if(X10_TEMP92){
X10_TEMP97 = X10_TEMP94 - X10_TEMP93;
}
final int X10_TEMP98 = X10_TEMP97;

final int X10_TEMP99 = (X10_TEMP98);

disp2 = (X10_TEMP99);
}
final int X10_TEMP102 = (dest0-disp0);
source0 = (X10_TEMP102);
final int X10_TEMP104 = (dest1-disp1);
source1 = (X10_TEMP104);
final int X10_TEMP106 = (dest2-disp2);
source2 = (X10_TEMP106);
final region(:rank==3) X10_TEMP107 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final boolean X10_TEMP112 = X10_TEMP107.contains([source0,source1,source2]);
if (X10_TEMP112) {
final region(:rank==3) X10_TEMP113 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int X10_TEMP118 = (X10_TEMP113.ordinal([source0,source1,source2]));
sourceID = (X10_TEMP118);
final Wrapper[:rank==1] X10_TEMP119 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP121 = (X10_TEMP119[ii]);
final double[:rank==3] X10_TEMP122 = (double[:rank==3])(X10_TEMP121.m_array);

final region(:rank==3) X10_TEMP126 = (region(:rank==3))(Program.LevelData_get_m_boundaries(X10_TEMP0,k,ii));

final Wrapper[:rank==1] X10_TEMP128 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP130 = (X10_TEMP128[sourceID]);
final double[:rank==3] X10_TEMP131 = (double[:rank==3])(X10_TEMP130.m_array);


Program.Util_arraycopy3(X10_TEMP122,X10_TEMP126,X10_TEMP131);
}
else {
final int X10_TEMP133 = (0);

final boolean X10_TEMP135 = jj==X10_TEMP133;
if (X10_TEMP135) {
final int X10_TEMP136 = (X10_TEMP0.m_block0);
final int X10_TEMP137 = (1);

final int X10_TEMP139 = (X10_TEMP136-X10_TEMP137);
final int X10_TEMP140 = (disp0*X10_TEMP139);

final int X10_TEMP142 = (dest0+X10_TEMP140);
source0 = (X10_TEMP142);
final int X10_TEMP143 = (X10_TEMP0.m_block0);
final int X10_TEMP144 = (1);

final int X10_TEMP146 = (X10_TEMP143-X10_TEMP144);
final int X10_TEMP147 = (disp1*X10_TEMP146);

final int X10_TEMP149 = (dest1+X10_TEMP147);
source1 = (X10_TEMP149);
final int X10_TEMP150 = (X10_TEMP0.m_block0);
final int X10_TEMP151 = (1);

final int X10_TEMP153 = (X10_TEMP150-X10_TEMP151);
final int X10_TEMP154 = (disp2*X10_TEMP153);

final int X10_TEMP156 = (dest2+X10_TEMP154);
source2 = (X10_TEMP156);
}
else {
final int X10_TEMP157 = (1);

final boolean X10_TEMP159 = jj==X10_TEMP157;
if (X10_TEMP159) {
final int X10_TEMP160 = (X10_TEMP0.m_block1);
final int X10_TEMP161 = (1);

final int X10_TEMP163 = (X10_TEMP160-X10_TEMP161);
final int X10_TEMP164 = (disp0*X10_TEMP163);

final int X10_TEMP166 = (dest0+X10_TEMP164);
source0 = (X10_TEMP166);
final int X10_TEMP167 = (X10_TEMP0.m_block1);
final int X10_TEMP168 = (1);

final int X10_TEMP170 = (X10_TEMP167-X10_TEMP168);
final int X10_TEMP171 = (disp1*X10_TEMP170);

final int X10_TEMP173 = (dest1+X10_TEMP171);
source1 = (X10_TEMP173);
final int X10_TEMP174 = (X10_TEMP0.m_block1);
final int X10_TEMP175 = (1);

final int X10_TEMP177 = (X10_TEMP174-X10_TEMP175);
final int X10_TEMP178 = (disp2*X10_TEMP177);

final int X10_TEMP180 = (dest2+X10_TEMP178);
source2 = (X10_TEMP180);
}
else {
final int X10_TEMP181 = (X10_TEMP0.m_block2);
final int X10_TEMP182 = (1);

final int X10_TEMP184 = (X10_TEMP181-X10_TEMP182);
final int X10_TEMP185 = (disp0*X10_TEMP184);

final int X10_TEMP187 = (dest0+X10_TEMP185);
source0 = (X10_TEMP187);
final int X10_TEMP188 = (X10_TEMP0.m_block2);
final int X10_TEMP189 = (1);

final int X10_TEMP191 = (X10_TEMP188-X10_TEMP189);
final int X10_TEMP192 = (disp1*X10_TEMP191);

final int X10_TEMP194 = (dest1+X10_TEMP192);
source1 = (X10_TEMP194);
final int X10_TEMP195 = (X10_TEMP0.m_block2);
final int X10_TEMP196 = (1);

final int X10_TEMP198 = (X10_TEMP195-X10_TEMP196);
final int X10_TEMP199 = (disp2*X10_TEMP198);

final int X10_TEMP201 = (dest2+X10_TEMP199);
source2 = (X10_TEMP201);
}
}
final region(:rank==3) X10_TEMP202 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int X10_TEMP207 = (X10_TEMP202.ordinal([source0,source1,source2]));
sourceID = (X10_TEMP207);
final int X10_TEMP208 = (0);

final boolean X10_TEMP210 = jj==X10_TEMP208;
if (X10_TEMP210) {
final int X10_TEMP211 = (X10_TEMP0.m_size0);

final int X10_TEMP213 = (disp0*X10_TEMP211);
trans0 = (X10_TEMP213);
final int X10_TEMP214 = (X10_TEMP0.m_size0);

final int X10_TEMP216 = (disp1*X10_TEMP214);
trans1 = (X10_TEMP216);
final int X10_TEMP217 = (X10_TEMP0.m_size0);

final int X10_TEMP219 = (disp2*X10_TEMP217);
trans2 = (X10_TEMP219);
}
else {
final int X10_TEMP220 = (1);

final boolean X10_TEMP222 = jj==X10_TEMP220;
if (X10_TEMP222) {
final int X10_TEMP223 = (X10_TEMP0.m_size1);

final int X10_TEMP225 = (disp0*X10_TEMP223);
trans0 = (X10_TEMP225);
final int X10_TEMP226 = (X10_TEMP0.m_size1);

final int X10_TEMP228 = (disp1*X10_TEMP226);
trans1 = (X10_TEMP228);
final int X10_TEMP229 = (X10_TEMP0.m_size1);

final int X10_TEMP231 = (disp2*X10_TEMP229);
trans2 = (X10_TEMP231);
}
else {
final int X10_TEMP232 = (X10_TEMP0.m_size2);

final int X10_TEMP234 = (disp0*X10_TEMP232);
trans0 = (X10_TEMP234);
final int X10_TEMP235 = (X10_TEMP0.m_size2);

final int X10_TEMP237 = (disp1*X10_TEMP235);
trans1 = (X10_TEMP237);
final int X10_TEMP238 = (X10_TEMP0.m_size2);

final int X10_TEMP240 = (disp2*X10_TEMP238);
trans2 = (X10_TEMP240);
}
}
final Wrapper[:rank==1] X10_TEMP241 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP243 = (X10_TEMP241[ii]);
final double[:rank==3] X10_TEMP244 = (double[:rank==3])(X10_TEMP243.m_array);

final region(:rank==3)[:rank==2] X10_TEMP246 = (region(:rank==3)[:rank==2])(X10_TEMP0.m_boundaries);
final region(:rank==3) X10_TEMP249 = (region(:rank==3))(X10_TEMP246[k,ii]);

final Wrapper[:rank==1] X10_TEMP251 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final Wrapper X10_TEMP253 = (X10_TEMP251[sourceID]);
final double[:rank==3] X10_TEMP254 = (double[:rank==3])(X10_TEMP253.m_array);


Program.Util_arraycopy4(X10_TEMP244,X10_TEMP249,X10_TEMP254,trans0,trans1,trans2);
}
}
}
}
}
}
}
public static void LevelData_exchange(final LevelData X10_TEMP0) {
final place X10_TEMP2 = here;
async(X10_TEMP2) {
final int X10_TEMP5 = (0);
final int X10_TEMP6 = (2);

final region(:rank==1) X10_TEMP8 = (region(:rank==1))([X10_TEMP5:X10_TEMP6]);
for(point(:rank==1)[j]:X10_TEMP8) {
finish {
final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(X10_TEMP0.m_places);
for(point(:rank==1)X10_TEMP11[i]:X10_TEMP10) {
final place X10_TEMP12 = X10_TEMP10.get(X10_TEMP11);
async(X10_TEMP12) {
final int jj = (j);
final region(:rank==3) X10_TEMP14 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest0 = (X10_TEMP14.coord(i)[0]);
final region(:rank==3) X10_TEMP17 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest1 = (X10_TEMP17.coord(i)[1]);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int dest2 = (X10_TEMP20.coord(i)[2]);
final int ii = (i);
finish {
final region(:rank==1) X10_TEMP27 = (region(:rank==1))([_LevelData_LOW:_LevelData_HIGH]);
final place X10_TEMP28 = here;
for(point(:rank==1)[p]:X10_TEMP27) {
async(X10_TEMP28) {
int disp0 = (0);
int disp1 = (0);
int disp2 = (0);
int trans0 = (0);
int trans1 = (0);
int trans2 = (0);
int sourceID = (0);
int k = (0);
final boolean X10_TEMP38 = p==_LevelData_LOW;
if (X10_TEMP38) {
final int X10_TEMP39 = (2);

final int X10_TEMP41 = (jj*X10_TEMP39);
k = (X10_TEMP41);
final int X10_TEMP42 = (0);
final boolean X10_TEMP43 = jj==X10_TEMP42;
int X10_TEMP46 = 0;
if(X10_TEMP43){
X10_TEMP46 = 1;
}
final int X10_TEMP47 = X10_TEMP46;

final int X10_TEMP48 = (X10_TEMP47);

disp0 = (X10_TEMP48);
final int X10_TEMP50 = (1);
final boolean X10_TEMP51 = jj==X10_TEMP50;
int X10_TEMP54 = 0;
if(X10_TEMP51){
X10_TEMP54 = 1;
}
final int X10_TEMP55 = X10_TEMP54;

final int X10_TEMP56 = (X10_TEMP55);

disp1 = (X10_TEMP56);
final int X10_TEMP58 = (2);
final boolean X10_TEMP59 = jj==X10_TEMP58;
int X10_TEMP62 = 0;
if(X10_TEMP59){
X10_TEMP62 = 1;
}
final int X10_TEMP63 = X10_TEMP62;

final int X10_TEMP64 = (X10_TEMP63);

disp2 = (X10_TEMP64);
}
else {
final int X10_TEMP66 = (2);
final int X10_TEMP67 = (jj*X10_TEMP66);
final int X10_TEMP68 = (1);

final int X10_TEMP70 = (X10_TEMP67+X10_TEMP68);
k = (X10_TEMP70);
final int X10_TEMP71 = (0);
final boolean X10_TEMP72 = jj==X10_TEMP71;
final int X10_TEMP73 = (1);
final int X10_TEMP74 = 0;
int X10_TEMP77 = 0;
if(X10_TEMP72){
X10_TEMP77 = X10_TEMP74 - X10_TEMP73;
}
final int X10_TEMP78 = X10_TEMP77;

final int X10_TEMP79 = (X10_TEMP78);

disp0 = (X10_TEMP79);
final int X10_TEMP81 = (1);
final boolean X10_TEMP82 = jj==X10_TEMP81;
final int X10_TEMP83 = (1);
final int X10_TEMP84 = 0;
int X10_TEMP87 = 0;
if(X10_TEMP82){
X10_TEMP87 = X10_TEMP84 - X10_TEMP83;
}
final int X10_TEMP88 = X10_TEMP87;

final int X10_TEMP89 = (X10_TEMP88);

disp1 = (X10_TEMP89);
final int X10_TEMP91 = (2);
final boolean X10_TEMP92 = jj==X10_TEMP91;
final int X10_TEMP93 = (1);
final int X10_TEMP94 = 0;
int X10_TEMP97 = 0;
if(X10_TEMP92){
X10_TEMP97 = X10_TEMP94 - X10_TEMP93;
}
final int X10_TEMP98 = X10_TEMP97;

final int X10_TEMP99 = (X10_TEMP98);

disp2 = (X10_TEMP99);
}
int source0 = (dest0-disp0);
int source1 = (dest1-disp1);
int source2 = (dest2-disp2);
final region(:rank==3) X10_TEMP104 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final boolean X10_TEMP109 = X10_TEMP104.contains([source0,source1,source2]);
if (X10_TEMP109) {
final region(:rank==3) X10_TEMP110 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int X10_TEMP115 = (X10_TEMP110.ordinal([source0,source1,source2]));
sourceID = (X10_TEMP115);
final Wrapper X10_TEMP117 = (Program.LevelData_get_m_u(X10_TEMP0,ii));
final double[:rank==3] X10_TEMP118 = (double[:rank==3])(X10_TEMP117.m_array);

double[:rank==3] ma = (double[:rank==3])(X10_TEMP118);
final Wrapper X10_TEMP121 = (Program.LevelData_get_m_u(X10_TEMP0,ii));
final double[:rank==3] X10_TEMP122 = (double[:rank==3])(X10_TEMP121.m_array);

final region(:rank==3) X10_TEMP126 = (region(:rank==3))(Program.LevelData_get_m_boundaries(X10_TEMP0,k,ii));

final Wrapper X10_TEMP129 = (Program.LevelData_get_m_u(X10_TEMP0,sourceID));
final double[:rank==3] X10_TEMP130 = (double[:rank==3])(X10_TEMP129.m_array);


Program.Util_arraycopy3(X10_TEMP122,X10_TEMP126,X10_TEMP130);
}
else {
final int X10_TEMP132 = (0);

final boolean X10_TEMP134 = jj==X10_TEMP132;
if (X10_TEMP134) {
final int X10_TEMP135 = (X10_TEMP0.m_block0);
final int X10_TEMP136 = (1);

final int X10_TEMP138 = (X10_TEMP135-X10_TEMP136);
final int X10_TEMP139 = (disp0*X10_TEMP138);

final int X10_TEMP141 = (dest0+X10_TEMP139);
source0 = (X10_TEMP141);
final int X10_TEMP142 = (X10_TEMP0.m_block0);
final int X10_TEMP143 = (1);

final int X10_TEMP145 = (X10_TEMP142-X10_TEMP143);
final int X10_TEMP146 = (disp1*X10_TEMP145);

final int X10_TEMP148 = (dest1+X10_TEMP146);
source1 = (X10_TEMP148);
final int X10_TEMP149 = (X10_TEMP0.m_block0);
final int X10_TEMP150 = (1);

final int X10_TEMP152 = (X10_TEMP149-X10_TEMP150);
final int X10_TEMP153 = (disp2*X10_TEMP152);

final int X10_TEMP155 = (dest2+X10_TEMP153);
source2 = (X10_TEMP155);
}
else {
final int X10_TEMP156 = (1);

final boolean X10_TEMP158 = jj==X10_TEMP156;
if (X10_TEMP158) {
final int X10_TEMP159 = (X10_TEMP0.m_block1);
final int X10_TEMP160 = (1);

final int X10_TEMP162 = (X10_TEMP159-X10_TEMP160);
final int X10_TEMP163 = (disp0*X10_TEMP162);

final int X10_TEMP165 = (dest0+X10_TEMP163);
source0 = (X10_TEMP165);
final int X10_TEMP166 = (X10_TEMP0.m_block1);
final int X10_TEMP167 = (1);

final int X10_TEMP169 = (X10_TEMP166-X10_TEMP167);
final int X10_TEMP170 = (disp1*X10_TEMP169);

final int X10_TEMP172 = (dest1+X10_TEMP170);
source1 = (X10_TEMP172);
final int X10_TEMP173 = (X10_TEMP0.m_block1);
final int X10_TEMP174 = (1);

final int X10_TEMP176 = (X10_TEMP173-X10_TEMP174);
final int X10_TEMP177 = (disp2*X10_TEMP176);

final int X10_TEMP179 = (dest2+X10_TEMP177);
source2 = (X10_TEMP179);
}
else {
final int X10_TEMP180 = (X10_TEMP0.m_block2);
final int X10_TEMP181 = (1);

final int X10_TEMP183 = (X10_TEMP180-X10_TEMP181);
final int X10_TEMP184 = (disp0*X10_TEMP183);

final int X10_TEMP186 = (dest0+X10_TEMP184);
source0 = (X10_TEMP186);
final int X10_TEMP187 = (X10_TEMP0.m_block2);
final int X10_TEMP188 = (1);

final int X10_TEMP190 = (X10_TEMP187-X10_TEMP188);
final int X10_TEMP191 = (disp1*X10_TEMP190);

final int X10_TEMP193 = (dest1+X10_TEMP191);
source1 = (X10_TEMP193);
final int X10_TEMP194 = (X10_TEMP0.m_block2);
final int X10_TEMP195 = (1);

final int X10_TEMP197 = (X10_TEMP194-X10_TEMP195);
final int X10_TEMP198 = (disp2*X10_TEMP197);

final int X10_TEMP200 = (dest2+X10_TEMP198);
source2 = (X10_TEMP200);
}
}
final region(:rank==3) X10_TEMP201 = (region(:rank==3))(X10_TEMP0.m_placeGrid);

final int X10_TEMP206 = (X10_TEMP201.ordinal([source0,source1,source2]));
sourceID = (X10_TEMP206);
final int X10_TEMP207 = (0);

final boolean X10_TEMP209 = jj==X10_TEMP207;
if (X10_TEMP209) {
final int X10_TEMP210 = (X10_TEMP0.m_size0);

final int X10_TEMP212 = (disp0*X10_TEMP210);
trans0 = (X10_TEMP212);
final int X10_TEMP213 = (X10_TEMP0.m_size0);

final int X10_TEMP215 = (disp1*X10_TEMP213);
trans1 = (X10_TEMP215);
final int X10_TEMP216 = (X10_TEMP0.m_size0);

final int X10_TEMP218 = (disp2*X10_TEMP216);
trans2 = (X10_TEMP218);
}
else {
final int X10_TEMP219 = (1);

final boolean X10_TEMP221 = jj==X10_TEMP219;
if (X10_TEMP221) {
final int X10_TEMP222 = (X10_TEMP0.m_size1);

final int X10_TEMP224 = (disp0*X10_TEMP222);
trans0 = (X10_TEMP224);
final int X10_TEMP225 = (X10_TEMP0.m_size1);

final int X10_TEMP227 = (disp1*X10_TEMP225);
trans1 = (X10_TEMP227);
final int X10_TEMP228 = (X10_TEMP0.m_size1);

final int X10_TEMP230 = (disp2*X10_TEMP228);
trans2 = (X10_TEMP230);
}
else {
final int X10_TEMP231 = (X10_TEMP0.m_size2);

final int X10_TEMP233 = (disp0*X10_TEMP231);
trans0 = (X10_TEMP233);
final int X10_TEMP234 = (X10_TEMP0.m_size2);

final int X10_TEMP236 = (disp1*X10_TEMP234);
trans1 = (X10_TEMP236);
final int X10_TEMP237 = (X10_TEMP0.m_size2);

final int X10_TEMP239 = (disp2*X10_TEMP237);
trans2 = (X10_TEMP239);
}
}
final Wrapper X10_TEMP241 = (Program.LevelData_get_m_u(X10_TEMP0,ii));
final double[:rank==3] X10_TEMP242 = (double[:rank==3])(X10_TEMP241.m_array);

final region(:rank==3) X10_TEMP246 = (region(:rank==3))(Program.LevelData_get_m_boundaries(X10_TEMP0,k,ii));

final Wrapper X10_TEMP249 = (Program.LevelData_get_m_u(X10_TEMP0,sourceID));
final double[:rank==3] X10_TEMP250 = (double[:rank==3])(X10_TEMP249.m_array);


Program.Util_arraycopy4(X10_TEMP242,X10_TEMP246,X10_TEMP250,trans0,trans1,trans2);
}
}
}
}
}
}
}
}
}
}
public static region(:rank==3) LevelData_get_m_regions(final LevelData X10_TEMP0, final int i) {
final place h = (here);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(X10_TEMP6->X10_TEMP7);

final dist(:rank==1) dRecv = (dist(:rank==1))(X10_TEMP9);
final region(:rank==3)[:rank==1&&distribution==dRecv] X10_TEMP11 = (region(:rank==3)[:rank==1&&distribution==dRecv])(new region(:rank==3)[dRecv]);

final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])(X10_TEMP11);
finish {
final region(:rank==3)[:rank==1] X10_TEMP13 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_regions);
final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP13.distribution);

final place X10_TEMP17 = X10_TEMP14.get(i);
async(X10_TEMP17) {
final region(:rank==3)[:rank==1] X10_TEMP18 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_regions);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(X10_TEMP18[i]);

final region(:rank==3) temp3 = (region(:rank==3))(X10_TEMP20);
async(h) {
final int X10_TEMP24 = (0);

final region(:rank==3) X10_TEMP27 = (region(:rank==3))(temp3);
aRecv[X10_TEMP24] = (X10_TEMP27);
}
}
}
final int X10_TEMP29 = (0);
final region(:rank==3) X10_TEMP30 = (region(:rank==3))(aRecv[X10_TEMP29]);

final region(:rank==3) mri = (region(:rank==3))(X10_TEMP30);
return mri;
}
public static region(:rank==3) LevelData_get_m_REGIONs(final LevelData X10_TEMP0, final int i) {
final place h = (here);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(X10_TEMP6->X10_TEMP7);

final dist(:rank==1) dRecv = (dist(:rank==1))(X10_TEMP9);
final region(:rank==3)[:rank==1&&distribution==dRecv] X10_TEMP11 = (region(:rank==3)[:rank==1&&distribution==dRecv])(new region(:rank==3)[dRecv]);

final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])(X10_TEMP11);
finish {
final region(:rank==3)[:rank==1] X10_TEMP13 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_REGIONs);
final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP13.distribution);

final place X10_TEMP17 = X10_TEMP14.get(i);
async(X10_TEMP17) {
final region(:rank==3)[:rank==1] X10_TEMP18 = (region(:rank==3)[:rank==1])(X10_TEMP0.m_REGIONs);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(X10_TEMP18[i]);

final region(:rank==3) temp3 = (region(:rank==3))(X10_TEMP20);
async(h) {
final int X10_TEMP24 = (0);

final region(:rank==3) X10_TEMP27 = (region(:rank==3))(temp3);
aRecv[X10_TEMP24] = (X10_TEMP27);
}
}
}
final int X10_TEMP29 = (0);
final region(:rank==3) X10_TEMP30 = (region(:rank==3))(aRecv[X10_TEMP29]);

final region(:rank==3) mri = (region(:rank==3))(X10_TEMP30);
return mri;
}
public static region(:rank==3) LevelData_get_m_boundaries(final LevelData X10_TEMP0, final int i, final int j) {
final place h = (here);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(X10_TEMP6->X10_TEMP7);

final dist(:rank==1) dRecv = (dist(:rank==1))(X10_TEMP9);
final region(:rank==3)[:rank==1&&distribution==dRecv] X10_TEMP11 = (region(:rank==3)[:rank==1&&distribution==dRecv])(new region(:rank==3)[dRecv]);

final region(:rank==3)[:rank==1] aRecv = (region(:rank==3)[:rank==1])(X10_TEMP11);
finish {
final region(:rank==3)[:rank==2] X10_TEMP13 = (region(:rank==3)[:rank==2])(X10_TEMP0.m_boundaries);
final dist(:rank==2) X10_TEMP14 = (dist(:rank==2))(X10_TEMP13.distribution);

final place X10_TEMP18 = X10_TEMP14.get(i,j);
async(X10_TEMP18) {
final region(:rank==3)[:rank==2] X10_TEMP19 = (region(:rank==3)[:rank==2])(X10_TEMP0.m_boundaries);
final region(:rank==3) X10_TEMP22 = (region(:rank==3))(X10_TEMP19[i,j]);

final region(:rank==3) temp4 = (region(:rank==3))(X10_TEMP22);
async(h) {
final int X10_TEMP26 = (0);

final region(:rank==3) X10_TEMP29 = (region(:rank==3))(temp4);
aRecv[X10_TEMP26] = (X10_TEMP29);
}
}
}
final int X10_TEMP31 = (0);
final region(:rank==3) X10_TEMP32 = (region(:rank==3))(aRecv[X10_TEMP31]);

final region(:rank==3) mri = (region(:rank==3))(X10_TEMP32);
return mri;
}
public static Wrapper LevelData_get_m_u(final LevelData X10_TEMP0, final int i) {
final place h = (here);
final int X10_TEMP4 = (0);
final int X10_TEMP5 = (0);
final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP4:X10_TEMP5]);
final place X10_TEMP7 = (here);

final dist(:rank==1) X10_TEMP9 = (dist(:rank==1))(X10_TEMP6->X10_TEMP7);

final dist(:rank==1) dRecv = (dist(:rank==1))(X10_TEMP9);
final Wrapper[:rank==1&&distribution==dRecv] X10_TEMP11 = (Wrapper[:rank==1&&distribution==dRecv])(new Wrapper[dRecv]);

final Wrapper[:rank==1] aRecv = (Wrapper[:rank==1])(X10_TEMP11);
finish {
final Wrapper[:rank==1] X10_TEMP13 = (Wrapper[:rank==1])(X10_TEMP0.m_u);
final dist(:rank==1) X10_TEMP14 = (dist(:rank==1))(X10_TEMP13.distribution);

final place X10_TEMP17 = X10_TEMP14.get(i);
async(X10_TEMP17) {
final Wrapper[:rank==1] X10_TEMP18 = (Wrapper[:rank==1])(X10_TEMP0.m_u);

final Wrapper temp4 = (X10_TEMP18[i]);
async(h) {
final int X10_TEMP23 = (0);

final Wrapper X10_TEMP26 = (temp4);
aRecv[X10_TEMP23] = (X10_TEMP26);
}
}
}
final int X10_TEMP28 = (0);

final Wrapper mri = (aRecv[X10_TEMP28]);
return mri;
}
public static void MGDriver_driver() {
int CLASS = (1);
final boolean isDistributed = (true);
int problemSize = (0);
int numberIterations = (0);
double reference2Norm = (0);
final int X10_TEMP8 = 1;
final int X10_TEMP16 = 2;
final int X10_TEMP24 = 3;
final int X10_TEMP32 = 4;
final int X10_TEMP40 = 5;
final int X10_TEMP48 = 6;
switch(CLASS){
case X10_TEMP8:
{
final int X10_TEMP10 = (32);
problemSize = (X10_TEMP10);
final int X10_TEMP12 = (4);
numberIterations = (X10_TEMP12);
final double X10_TEMP14 = (5.30770700573E-5);
reference2Norm = (X10_TEMP14);
break;
}
case X10_TEMP16:
{
final int X10_TEMP18 = (64);
problemSize = (X10_TEMP18);
final int X10_TEMP20 = (40);
numberIterations = (X10_TEMP20);
final double X10_TEMP22 = (2.50391406439E-18);
reference2Norm = (X10_TEMP22);
break;
}
case X10_TEMP24:
{
final int X10_TEMP26 = (256);
problemSize = (X10_TEMP26);
final int X10_TEMP28 = (4);
numberIterations = (X10_TEMP28);
final double X10_TEMP30 = (2.433365309e-6);
reference2Norm = (X10_TEMP30);
break;
}
case X10_TEMP32:
{
final int X10_TEMP34 = (256);
problemSize = (X10_TEMP34);
final int X10_TEMP36 = (20);
numberIterations = (X10_TEMP36);
final double X10_TEMP38 = (1.80056440132e-6);
reference2Norm = (X10_TEMP38);
break;
}
case X10_TEMP40:
{
final int X10_TEMP42 = (512);
problemSize = (X10_TEMP42);
final int X10_TEMP44 = (20);
numberIterations = (X10_TEMP44);
final double X10_TEMP46 = (5.70674826298e-7);
reference2Norm = (X10_TEMP46);
break;
}
case X10_TEMP48:
{
final int X10_TEMP50 = (1024);
problemSize = (X10_TEMP50);
final int X10_TEMP52 = (50);
numberIterations = (X10_TEMP52);
final double X10_TEMP54 = (1.58327506043e-10);
reference2Norm = (X10_TEMP54);
break;
}
default:
{
final String X10_TEMP56 = ("Class must be one of {S,W,A,B,C,D}!");
System.err.println(X10_TEMP56);
}
}
LevelData u = (new LevelData(problemSize,isDistributed));
LevelData v = (new LevelData(problemSize,isDistributed));
Program.LevelData_initialize(v,CLASS);
MGOP MG = (new MGOP(problemSize));
final String X10_TEMP66 = ("There are ");
final String X10_TEMP67 = (X10_TEMP66+_Util_N_PLACES);
final String X10_TEMP68 = (" places. Running problem of class ");
final String X10_TEMP69 = (X10_TEMP67+X10_TEMP68);

final String X10_TEMP71 = (X10_TEMP69+CLASS);
System.out.println(X10_TEMP71);
Timer tmr = (new Timer());
int count = (0);
Program.Timer_start(tmr,count);
double res = (0);
final double X10_TEMP80 = (Program.MGOP_MGSolve(MG,u,v,numberIterations));
res = (X10_TEMP80);
Program.Timer_stop(tmr,count);
final String X10_TEMP82 = ("The reference 2norm is ");
final String X10_TEMP83 = (X10_TEMP82+reference2Norm);
final String X10_TEMP84 = (". The difference is ");
final String X10_TEMP87 = (X10_TEMP83+X10_TEMP84);
final double X10_TEMP86 = (res-reference2Norm);

final String X10_TEMP89 = (X10_TEMP87+X10_TEMP86);
System.out.println(X10_TEMP89);
final String X10_TEMP91 = ("Wall-clock time for MGSolve: ");
final double X10_TEMP92 = (Program.Timer_readTimer(tmr,count));
final String X10_TEMP93 = (X10_TEMP91+X10_TEMP92);
final String X10_TEMP94 = ("secs");

final String X10_TEMP96 = (X10_TEMP93+X10_TEMP94);
System.out.println(X10_TEMP96);
}
public static void runMain() {
final MGDriver X10_TEMP1 = (new MGDriver());

Program.MGDriver_driver();
}
public static boolean _MGOP_PERF_On_init() {

return _Util_PERF_OUTPUT;
}
public static double _MGOP_PERF_Comp_init() {
final double X10_TEMP1 = (1.0);

final double X10_TEMP3 = (X10_TEMP1/_Util_FP_PERCLOCK);
return X10_TEMP3;
}
public static double _MGOP_PERF_CommL_init() {

final double X10_TEMP2 = (_Util_COMM_LATENCY*_Util_CLOCK_SPEED);
return X10_TEMP2;
}
public static double _MGOP_PERF_CommB_init() {
final double X10_TEMP1 = ((double)_Util_CLOCK_SPEED);
final double X10_TEMP2 = ((double)_Util_COMM_BANDWIDTH);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
final double X10_TEMP5 = (8.0);

final double X10_TEMP7 = (X10_TEMP4*X10_TEMP5);
return X10_TEMP7;
}
public static boolean _MGOP_PERF_InLoop_init() {

return _Util_IN_LOOP;
}
public static boolean _MGOP_PERF_CompOnly_init() {

return _Util_COMP_ONLY;
}
public static boolean _MGOP_PERF_CommOnly_init() {

return _Util_COMM_ONLY;
}
public static boolean _MGOP_OVERLAPPED_init() {

return _Util_OVERLAP_COMMANDCOMP;
}
public static region(:rank==1) _MGOP_reg_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (3);

final region(:rank==1) X10_TEMP6 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
return X10_TEMP6;
}
public static double _MGOP_Ac0_init() {
final double X10_TEMP1 = (8.0);
final int X10_TEMP2 = 0;
final double X10_TEMP3 = (X10_TEMP2 - X10_TEMP1);
final double X10_TEMP4 = (3.0);

final double X10_TEMP6 = (X10_TEMP3/X10_TEMP4);
return X10_TEMP6;
}
public static double _MGOP_Ac1_init() {

final double X10_TEMP2 = (0.0);
return X10_TEMP2;
}
public static double _MGOP_Ac2_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (6.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Ac3_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (12.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Sac0_init() {
final double X10_TEMP1 = (3.0);
final int X10_TEMP2 = 0;
final double X10_TEMP3 = (X10_TEMP2 - X10_TEMP1);
final double X10_TEMP4 = (8.0);

final double X10_TEMP6 = (X10_TEMP3/X10_TEMP4);
return X10_TEMP6;
}
public static double _MGOP_Sac1_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (32.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Sac2_init() {
final double X10_TEMP1 = (1.0);
final int X10_TEMP2 = 0;
final double X10_TEMP3 = (X10_TEMP2 - X10_TEMP1);
final double X10_TEMP4 = (64.0);

final double X10_TEMP6 = (X10_TEMP3/X10_TEMP4);
return X10_TEMP6;
}
public static double _MGOP_Sac3_init() {

final double X10_TEMP2 = (0.0);
return X10_TEMP2;
}
public static double _MGOP_Pc0_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (2.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Pc1_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (4.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Pc2_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (8.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static double _MGOP_Pc3_init() {
final double X10_TEMP1 = (1.0);
final double X10_TEMP2 = (16.0);

final double X10_TEMP4 = (X10_TEMP1/X10_TEMP2);
return X10_TEMP4;
}
public static int _MGOP_P2SLEVEL_init() {
final int X10_TEMP1 = (1);

final int X10_TEMP3 = (_Util_P2SLEVEL-X10_TEMP1);
return X10_TEMP3;
}
public static void MGOP_computeResidual2(final MGOP X10_TEMP0, final LevelData RES, final LevelData a_arg) {
finish {
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(Program.LevelData_getPlaces(RES));
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(RES,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getInnerRegion(RES,i));
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (0);
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP29 = (res[p]);
final double X10_TEMP23 = (_MGOP_Ac0*d0);
final double X10_TEMP24 = (_MGOP_Ac2*d2);
final double X10_TEMP25 = (X10_TEMP23+X10_TEMP24);
final double X10_TEMP26 = (_MGOP_Ac3*d3);

final double X10_TEMP28 = (X10_TEMP25+X10_TEMP26);

final double X10_TEMP32 = (X10_TEMP29-X10_TEMP28);
final double X10_TEMP33 = (X10_TEMP32);
res[p] = (X10_TEMP33);
}
}
}
}
final boolean X10_TEMP35 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP35) {
finish {
Program.LevelData_exchange(RES);
}
}
}
public static void MGOP_computeResidual3(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
if (_MGOP_OVERLAPPED) {
Program.MGOP_ComputeResidual_Overlapped(X10_TEMP0,a_res,a_arg1,a_arg2);
}
else {
Program.MGOP_ComputeResidual(X10_TEMP0,a_res,a_arg1,a_arg2);
}
}
public static void MGOP_ComputeResidual(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
final boolean X10_TEMP1 = (X10_TEMP0.EXCHANGE_After);

final boolean X10_TEMP3 = !X10_TEMP1;
if (X10_TEMP3) {
finish {
Program.LevelData_exchange(a_arg2);
}
}
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP6[i]:X10_TEMP5) {
final place X10_TEMP7 = X10_TEMP5.get(X10_TEMP6);
async(X10_TEMP7) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg1 = (double[:rank==3])(Program.LevelData_getArray(a_arg1,i));
final double[:rank==3] arg2 = (double[:rank==3])(Program.LevelData_getArray(a_arg2,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg2[p]);
double d2 = (Program.Util_sumDIFF2(p,arg2));
double d3 = (Program.Util_sumDIFF3(p,arg2));
final double X10_TEMP27 = (arg1[p]);
final double X10_TEMP28 = (_MGOP_Ac0*d0);
final double X10_TEMP29 = (X10_TEMP27-X10_TEMP28);
final double X10_TEMP30 = (_MGOP_Ac2*d2);
final double X10_TEMP31 = (X10_TEMP29-X10_TEMP30);
final double X10_TEMP32 = (_MGOP_Ac3*d3);

final double X10_TEMP35 = (X10_TEMP31-X10_TEMP32);
final double X10_TEMP36 = (X10_TEMP35);
res[p] = (X10_TEMP36);
}
}
}
}
final boolean X10_TEMP38 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP38) {
finish {
Program.LevelData_exchange(a_res);
}
}
}
public static void MGOP_ComputeResidual_Overlapped1(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
finish {
Program.LevelData_exchange(a_arg2);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg1 = (double[:rank==3])(Program.LevelData_getArray(a_arg1,i));
final double[:rank==3] arg2 = (double[:rank==3])(Program.LevelData_getArray(a_arg2,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg2[p]);
double d2 = (Program.Util_sumDIFF2(p,arg2));
double d3 = (Program.Util_sumDIFF3(p,arg2));
final double X10_TEMP24 = (arg1[p]);
final double X10_TEMP25 = (_MGOP_Ac0*d0);
final double X10_TEMP26 = (X10_TEMP24-X10_TEMP25);
final double X10_TEMP27 = (_MGOP_Ac2*d2);
final double X10_TEMP28 = (X10_TEMP26-X10_TEMP27);
final double X10_TEMP29 = (_MGOP_Ac3*d3);

final double X10_TEMP32 = (X10_TEMP28-X10_TEMP29);
final double X10_TEMP33 = (X10_TEMP32);
res[p] = (X10_TEMP33);
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP35 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP36[i]:X10_TEMP35) {
final place X10_TEMP37 = X10_TEMP35.get(X10_TEMP36);
async(X10_TEMP37) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg1 = (double[:rank==3])(Program.LevelData_getArray(a_arg1,i));
final double[:rank==3] arg2 = (double[:rank==3])(Program.LevelData_getArray(a_arg2,i));
final region(:rank==3) X10_TEMP46 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP47 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP48 = 0;
final int X10_TEMP49 = 1;
final int X10_TEMP50 = X10_TEMP48 - X10_TEMP49;
final place X10_TEMP51 = here;
region(:rank==3) X10_TEMP52 = [X10_TEMP48:X10_TEMP50, X10_TEMP48:X10_TEMP50, X10_TEMP48:X10_TEMP50];
for(point(:rank==3)X10_TEMP53[X10_TEMP54, X10_TEMP55, X10_TEMP56]:X10_TEMP46) {
	boolean X10_TEMP57 = X10_TEMP47.contains(X10_TEMP53);
	X10_TEMP57 = !X10_TEMP57;
	if(X10_TEMP57) {
		final region(:rank==3) X10_TEMP58 = [X10_TEMP54:X10_TEMP54, X10_TEMP55:X10_TEMP55, X10_TEMP56:X10_TEMP56];
		X10_TEMP52 = X10_TEMP52 || X10_TEMP58;
	}
}
final region(:rank==3) X10_TEMP59 = X10_TEMP52;

region(:rank==3) R = (region(:rank==3))(X10_TEMP59);
for(point(:rank==3)p:R) {
double d0 = (arg2[p]);
double d2 = (Program.Util_sumDIFF2(p,arg2));
double d3 = (Program.Util_sumDIFF3(p,arg2));
final double X10_TEMP72 = (arg1[p]);
final double X10_TEMP73 = (_MGOP_Ac0*d0);
final double X10_TEMP74 = (X10_TEMP72-X10_TEMP73);
final double X10_TEMP75 = (_MGOP_Ac2*d2);
final double X10_TEMP76 = (X10_TEMP74-X10_TEMP75);
final double X10_TEMP77 = (_MGOP_Ac3*d3);

final double X10_TEMP80 = (X10_TEMP76-X10_TEMP77);
final double X10_TEMP81 = (X10_TEMP80);
res[p] = (X10_TEMP81);
}
}
}
}
}
public static void MGOP_ComputeResidual_Overlapped(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg1, final LevelData a_arg2) {
finish {
final place X10_TEMP2 = here;
async(X10_TEMP2) {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP5[i]:X10_TEMP4) {
final place X10_TEMP6 = X10_TEMP4.get(X10_TEMP5);
async(X10_TEMP6) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg1 = (double[:rank==3])(Program.LevelData_getArray(a_arg1,i));
final double[:rank==3] arg2 = (double[:rank==3])(Program.LevelData_getArray(a_arg2,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg2[p]);
double d2 = (Program.Util_sumDIFF2(p,arg2));
double d3 = (Program.Util_sumDIFF3(p,arg2));
final double X10_TEMP26 = (arg1[p]);
final double X10_TEMP27 = (_MGOP_Ac0*d0);
final double X10_TEMP28 = (X10_TEMP26-X10_TEMP27);
final double X10_TEMP29 = (_MGOP_Ac2*d2);
final double X10_TEMP30 = (X10_TEMP28-X10_TEMP29);
final double X10_TEMP31 = (_MGOP_Ac3*d3);

final double X10_TEMP34 = (X10_TEMP30-X10_TEMP31);
final double X10_TEMP35 = (X10_TEMP34);
res[p] = (X10_TEMP35);
}
}
}
finish {
Program.LevelData_exchange(a_arg2);
}
final dist(:rank==1) X10_TEMP37 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP38[i]:X10_TEMP37) {
final place X10_TEMP39 = X10_TEMP37.get(X10_TEMP38);
async(X10_TEMP39) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg1 = (double[:rank==3])(Program.LevelData_getArray(a_arg1,i));
final double[:rank==3] arg2 = (double[:rank==3])(Program.LevelData_getArray(a_arg2,i));
final region(:rank==3) X10_TEMP48 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP49 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP50 = 0;
final int X10_TEMP51 = 1;
final int X10_TEMP52 = X10_TEMP50 - X10_TEMP51;
final place X10_TEMP53 = here;
region(:rank==3) X10_TEMP54 = [X10_TEMP50:X10_TEMP52, X10_TEMP50:X10_TEMP52, X10_TEMP50:X10_TEMP52];
for(point(:rank==3)X10_TEMP55[X10_TEMP56, X10_TEMP57, X10_TEMP58]:X10_TEMP48) {
	boolean X10_TEMP59 = X10_TEMP49.contains(X10_TEMP55);
	X10_TEMP59 = !X10_TEMP59;
	if(X10_TEMP59) {
		final region(:rank==3) X10_TEMP60 = [X10_TEMP56:X10_TEMP56, X10_TEMP57:X10_TEMP57, X10_TEMP58:X10_TEMP58];
		X10_TEMP54 = X10_TEMP54 || X10_TEMP60;
	}
}
final region(:rank==3) X10_TEMP61 = X10_TEMP54;

region(:rank==3) R = (region(:rank==3))(X10_TEMP61);
for(point(:rank==3)p:R) {
double d0 = (arg2[p]);
double d2 = (Program.Util_sumDIFF2(p,arg2));
double d3 = (Program.Util_sumDIFF3(p,arg2));
final double X10_TEMP74 = (arg1[p]);
final double X10_TEMP75 = (_MGOP_Ac0*d0);
final double X10_TEMP76 = (X10_TEMP74-X10_TEMP75);
final double X10_TEMP77 = (_MGOP_Ac2*d2);
final double X10_TEMP78 = (X10_TEMP76-X10_TEMP77);
final double X10_TEMP79 = (_MGOP_Ac3*d3);

final double X10_TEMP82 = (X10_TEMP78-X10_TEMP79);
final double X10_TEMP83 = (X10_TEMP82);
res[p] = (X10_TEMP83);
}
}
}
}
}
}
public static void MGOP_smooth(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
if (_MGOP_OVERLAPPED) {
Program.MGOP_Smooth_Overlapped(X10_TEMP0,a_res,a_arg,a_isBottom);
}
else {
Program.MGOP_Smooth(X10_TEMP0,a_res,a_arg,a_isBottom);
}
}
public static void MGOP_Smooth(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
final boolean X10_TEMP1 = (X10_TEMP0.EXCHANGE_After);

final boolean X10_TEMP3 = !X10_TEMP1;
if (X10_TEMP3) {
finish {
Program.LevelData_exchange(a_arg);
}
}
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP6[i]:X10_TEMP5) {
final place X10_TEMP7 = X10_TEMP5.get(X10_TEMP6);
async(X10_TEMP7) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
final double X10_TEMP25 = (res[p]);
final double X10_TEMP26 = (_MGOP_Sac0*d0);
final double X10_TEMP27 = (X10_TEMP25+X10_TEMP26);
final double X10_TEMP28 = (_MGOP_Sac1*d1);
final double X10_TEMP29 = (X10_TEMP27+X10_TEMP28);
final double X10_TEMP30 = (_MGOP_Sac2*d2);

final double X10_TEMP33 = (X10_TEMP29+X10_TEMP30);
final double X10_TEMP34 = (X10_TEMP33);
res[p] = (X10_TEMP34);
}
}
}
}
final boolean X10_TEMP36 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP36) {
finish {
Program.LevelData_exchange(a_res);
}
}
}
public static void MGOP_Smooth_Overlapped1(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
finish {
Program.LevelData_exchange(a_arg);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
final double X10_TEMP22 = (res[p]);
final double X10_TEMP23 = (_MGOP_Sac0*d0);
final double X10_TEMP24 = (X10_TEMP22+X10_TEMP23);
final double X10_TEMP25 = (_MGOP_Sac1*d1);
final double X10_TEMP26 = (X10_TEMP24+X10_TEMP25);
final double X10_TEMP27 = (_MGOP_Sac2*d2);

final double X10_TEMP30 = (X10_TEMP26+X10_TEMP27);
final double X10_TEMP31 = (X10_TEMP30);
res[p] = (X10_TEMP31);
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP33 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP34[i]:X10_TEMP33) {
final place X10_TEMP35 = X10_TEMP33.get(X10_TEMP34);
async(X10_TEMP35) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final region(:rank==3) X10_TEMP42 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP43 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP44 = 0;
final int X10_TEMP45 = 1;
final int X10_TEMP46 = X10_TEMP44 - X10_TEMP45;
final place X10_TEMP47 = here;
region(:rank==3) X10_TEMP48 = [X10_TEMP44:X10_TEMP46, X10_TEMP44:X10_TEMP46, X10_TEMP44:X10_TEMP46];
for(point(:rank==3)X10_TEMP49[X10_TEMP50, X10_TEMP51, X10_TEMP52]:X10_TEMP42) {
	boolean X10_TEMP53 = X10_TEMP43.contains(X10_TEMP49);
	X10_TEMP53 = !X10_TEMP53;
	if(X10_TEMP53) {
		final region(:rank==3) X10_TEMP54 = [X10_TEMP50:X10_TEMP50, X10_TEMP51:X10_TEMP51, X10_TEMP52:X10_TEMP52];
		X10_TEMP48 = X10_TEMP48 || X10_TEMP54;
	}
}
final region(:rank==3) X10_TEMP55 = X10_TEMP48;

region(:rank==3) R = (region(:rank==3))(X10_TEMP55);
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
final double X10_TEMP68 = (res[p]);
final double X10_TEMP69 = (_MGOP_Sac0*d0);
final double X10_TEMP70 = (X10_TEMP68+X10_TEMP69);
final double X10_TEMP71 = (_MGOP_Sac1*d1);
final double X10_TEMP72 = (X10_TEMP70+X10_TEMP71);
final double X10_TEMP73 = (_MGOP_Sac2*d2);

final double X10_TEMP76 = (X10_TEMP72+X10_TEMP73);
final double X10_TEMP77 = (X10_TEMP76);
res[p] = (X10_TEMP77);
}
}
}
}
}
public static void MGOP_Smooth_Overlapped(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final boolean a_isBottom) {
finish {
final place X10_TEMP2 = here;
async(X10_TEMP2) {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP5[i]:X10_TEMP4) {
final place X10_TEMP6 = X10_TEMP4.get(X10_TEMP5);
async(X10_TEMP6) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
final double X10_TEMP24 = (res[p]);
final double X10_TEMP25 = (_MGOP_Sac0*d0);
final double X10_TEMP26 = (X10_TEMP24+X10_TEMP25);
final double X10_TEMP27 = (_MGOP_Sac1*d1);
final double X10_TEMP28 = (X10_TEMP26+X10_TEMP27);
final double X10_TEMP29 = (_MGOP_Sac2*d2);

final double X10_TEMP32 = (X10_TEMP28+X10_TEMP29);
final double X10_TEMP33 = (X10_TEMP32);
res[p] = (X10_TEMP33);
}
}
}
finish {
Program.LevelData_exchange(a_arg);
}
final dist(:rank==1) X10_TEMP35 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP36[i]:X10_TEMP35) {
final place X10_TEMP37 = X10_TEMP35.get(X10_TEMP36);
async(X10_TEMP37) {
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final region(:rank==3) X10_TEMP44 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP45 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP46 = 0;
final int X10_TEMP47 = 1;
final int X10_TEMP48 = X10_TEMP46 - X10_TEMP47;
final place X10_TEMP49 = here;
region(:rank==3) X10_TEMP50 = [X10_TEMP46:X10_TEMP48, X10_TEMP46:X10_TEMP48, X10_TEMP46:X10_TEMP48];
for(point(:rank==3)X10_TEMP51[X10_TEMP52, X10_TEMP53, X10_TEMP54]:X10_TEMP44) {
	boolean X10_TEMP55 = X10_TEMP45.contains(X10_TEMP51);
	X10_TEMP55 = !X10_TEMP55;
	if(X10_TEMP55) {
		final region(:rank==3) X10_TEMP56 = [X10_TEMP52:X10_TEMP52, X10_TEMP53:X10_TEMP53, X10_TEMP54:X10_TEMP54];
		X10_TEMP50 = X10_TEMP50 || X10_TEMP56;
	}
}
final region(:rank==3) X10_TEMP57 = X10_TEMP50;

region(:rank==3) R = (region(:rank==3))(X10_TEMP57);
for(point(:rank==3)p:R) {
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
final double X10_TEMP70 = (res[p]);
final double X10_TEMP71 = (_MGOP_Sac0*d0);
final double X10_TEMP72 = (X10_TEMP70+X10_TEMP71);
final double X10_TEMP73 = (_MGOP_Sac1*d1);
final double X10_TEMP74 = (X10_TEMP72+X10_TEMP73);
final double X10_TEMP75 = (_MGOP_Sac2*d2);

final double X10_TEMP78 = (X10_TEMP74+X10_TEMP75);
final double X10_TEMP79 = (X10_TEMP78);
res[p] = (X10_TEMP79);
}
}
}
}
}
}
public static void MGOP_applyOpP3(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final int a_level) {
final boolean X10_TEMP2 = a_level==_MGOP_P2SLEVEL;
if (X10_TEMP2) {
final LevelData X10_TEMP5 = (X10_TEMP0.m_tempLD);

Program.MGOP_applyOpP2(X10_TEMP0,X10_TEMP5,a_arg);
final int X10_TEMP7 = (0);

final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,X10_TEMP7));
finish {
final LevelData X10_TEMP9 = (X10_TEMP0.m_tempLD);

final dist(:rank==1) X10_TEMP11 = (dist(:rank==1))(Program.LevelData_getPlaces(X10_TEMP9));
for(point(:rank==1)X10_TEMP12[i]:X10_TEMP11) {
final place X10_TEMP13 = X10_TEMP11.get(X10_TEMP12);
async(X10_TEMP13) {
final LevelData X10_TEMP14 = (X10_TEMP0.m_tempLD);

double[:rank==3] temp = (double[:rank==3])(Program.LevelData_getArray(X10_TEMP14,i));
final LevelData X10_TEMP18 = (X10_TEMP0.m_tempLD);
final region(:rank==3) X10_TEMP20 = (region(:rank==3))(Program.LevelData_getInnerRegion(X10_TEMP18,i));


Program.Util_arraycopy3(res,X10_TEMP20,temp);
}
}
}
}
else {
Program.MGOP_applyOpP2(X10_TEMP0,a_res,a_arg);
}
final boolean X10_TEMP26 = X10_TEMP0.EXCHANGE_After;
if (X10_TEMP26) {
finish {
Program.LevelData_exchange(a_res);
}
}
}
public static void MGOP_applyOpP2(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
if (_MGOP_OVERLAPPED) {
Program.MGOP_ApplyOpP_Overlapped(X10_TEMP0,a_res,a_arg);
}
else {
Program.MGOP_ApplyOpP(X10_TEMP0,a_res,a_arg);
}
}
public static void MGOP_ApplyOpP(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
final boolean X10_TEMP1 = (X10_TEMP0.EXCHANGE_After);

final boolean X10_TEMP3 = !X10_TEMP1;
if (X10_TEMP3) {
finish {
Program.LevelData_exchange(a_arg);
}
}
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP6[i]:X10_TEMP5) {
final place X10_TEMP7 = X10_TEMP5.get(X10_TEMP6);
async(X10_TEMP7) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
for(point(:rank==3)pp:R) {
final int X10_TEMP15 = (2);
final point(:rank==3) X10_TEMP19 = (pp*X10_TEMP15);
int X10_TEMP20 = (1);
int X10_TEMP21 = (1);
int X10_TEMP22 = (1);

point(:rank==3) p = (X10_TEMP19+[X10_TEMP20,X10_TEMP21,X10_TEMP22]);
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP36 = (_MGOP_Pc0*d0);
final double X10_TEMP37 = (_MGOP_Pc1*d1);
final double X10_TEMP38 = (X10_TEMP36+X10_TEMP37);
final double X10_TEMP39 = (_MGOP_Pc2*d2);
final double X10_TEMP40 = (X10_TEMP38+X10_TEMP39);
final double X10_TEMP41 = (_MGOP_Pc3*d3);

final double X10_TEMP44 = (X10_TEMP40+X10_TEMP41);
final double X10_TEMP45 = (X10_TEMP44);
res[pp] = (X10_TEMP45);
}
}
}
}
}
public static void MGOP_ApplyOpP_Overlapped1(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
finish {
Program.LevelData_exchange(a_arg);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)pp:R) {
final int X10_TEMP12 = (2);
final point(:rank==3) X10_TEMP16 = (pp*X10_TEMP12);
int X10_TEMP17 = (1);
int X10_TEMP18 = (1);
int X10_TEMP19 = (1);

point(:rank==3) p = (X10_TEMP16+[X10_TEMP17,X10_TEMP18,X10_TEMP19]);
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP33 = (_MGOP_Pc0*d0);
final double X10_TEMP34 = (_MGOP_Pc1*d1);
final double X10_TEMP35 = (X10_TEMP33+X10_TEMP34);
final double X10_TEMP36 = (_MGOP_Pc2*d2);
final double X10_TEMP37 = (X10_TEMP35+X10_TEMP36);
final double X10_TEMP38 = (_MGOP_Pc3*d3);

final double X10_TEMP41 = (X10_TEMP37+X10_TEMP38);
final double X10_TEMP42 = (X10_TEMP41);
res[pp] = (X10_TEMP42);
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP44 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP45[i]:X10_TEMP44) {
final place X10_TEMP46 = X10_TEMP44.get(X10_TEMP45);
async(X10_TEMP46) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final region(:rank==3) X10_TEMP53 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP54 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP55 = 0;
final int X10_TEMP56 = 1;
final int X10_TEMP57 = X10_TEMP55 - X10_TEMP56;
final place X10_TEMP58 = here;
region(:rank==3) X10_TEMP59 = [X10_TEMP55:X10_TEMP57, X10_TEMP55:X10_TEMP57, X10_TEMP55:X10_TEMP57];
for(point(:rank==3)X10_TEMP60[X10_TEMP61, X10_TEMP62, X10_TEMP63]:X10_TEMP53) {
	boolean X10_TEMP64 = X10_TEMP54.contains(X10_TEMP60);
	X10_TEMP64 = !X10_TEMP64;
	if(X10_TEMP64) {
		final region(:rank==3) X10_TEMP65 = [X10_TEMP61:X10_TEMP61, X10_TEMP62:X10_TEMP62, X10_TEMP63:X10_TEMP63];
		X10_TEMP59 = X10_TEMP59 || X10_TEMP65;
	}
}
final region(:rank==3) X10_TEMP66 = X10_TEMP59;

region(:rank==3) R = (region(:rank==3))(X10_TEMP66);
for(point(:rank==3)pp:R) {
final int X10_TEMP69 = (2);
final point(:rank==3) X10_TEMP73 = (pp*X10_TEMP69);
int X10_TEMP74 = (1);
int X10_TEMP75 = (1);
int X10_TEMP76 = (1);

point(:rank==3) p = (X10_TEMP73+[X10_TEMP74,X10_TEMP75,X10_TEMP76]);
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP90 = (_MGOP_Pc0*d0);
final double X10_TEMP91 = (_MGOP_Pc1*d1);
final double X10_TEMP92 = (X10_TEMP90+X10_TEMP91);
final double X10_TEMP93 = (_MGOP_Pc2*d2);
final double X10_TEMP94 = (X10_TEMP92+X10_TEMP93);
final double X10_TEMP95 = (_MGOP_Pc3*d3);

final double X10_TEMP98 = (X10_TEMP94+X10_TEMP95);
final double X10_TEMP99 = (X10_TEMP98);
res[pp] = (X10_TEMP99);
}
}
}
}
}
public static void MGOP_ApplyOpP_Overlapped(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
finish {
final place X10_TEMP2 = here;
async(X10_TEMP2) {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP5[i]:X10_TEMP4) {
final place X10_TEMP6 = X10_TEMP4.get(X10_TEMP5);
async(X10_TEMP6) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
for(point(:rank==3)pp:R) {
final int X10_TEMP14 = (2);
final point(:rank==3) X10_TEMP18 = (pp*X10_TEMP14);
int X10_TEMP19 = (1);
int X10_TEMP20 = (1);
int X10_TEMP21 = (1);

point(:rank==3) p = (X10_TEMP18+[X10_TEMP19,X10_TEMP20,X10_TEMP21]);
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP35 = (_MGOP_Pc0*d0);
final double X10_TEMP36 = (_MGOP_Pc1*d1);
final double X10_TEMP37 = (X10_TEMP35+X10_TEMP36);
final double X10_TEMP38 = (_MGOP_Pc2*d2);
final double X10_TEMP39 = (X10_TEMP37+X10_TEMP38);
final double X10_TEMP40 = (_MGOP_Pc3*d3);

final double X10_TEMP43 = (X10_TEMP39+X10_TEMP40);
final double X10_TEMP44 = (X10_TEMP43);
res[pp] = (X10_TEMP44);
}
}
}
finish {
Program.LevelData_exchange(a_arg);
}
final dist(:rank==1) X10_TEMP46 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP47[i]:X10_TEMP46) {
final place X10_TEMP48 = X10_TEMP46.get(X10_TEMP47);
async(X10_TEMP48) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final region(:rank==3) X10_TEMP55 = (region(:rank==3))(Program.LevelData_getInnerRegion(a_res,i));
final region(:rank==3) X10_TEMP56 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_res,i));
final int X10_TEMP57 = 0;
final int X10_TEMP58 = 1;
final int X10_TEMP59 = X10_TEMP57 - X10_TEMP58;
final place X10_TEMP60 = here;
region(:rank==3) X10_TEMP61 = [X10_TEMP57:X10_TEMP59, X10_TEMP57:X10_TEMP59, X10_TEMP57:X10_TEMP59];
for(point(:rank==3)X10_TEMP62[X10_TEMP63, X10_TEMP64, X10_TEMP65]:X10_TEMP55) {
	boolean X10_TEMP66 = X10_TEMP56.contains(X10_TEMP62);
	X10_TEMP66 = !X10_TEMP66;
	if(X10_TEMP66) {
		final region(:rank==3) X10_TEMP67 = [X10_TEMP63:X10_TEMP63, X10_TEMP64:X10_TEMP64, X10_TEMP65:X10_TEMP65];
		X10_TEMP61 = X10_TEMP61 || X10_TEMP67;
	}
}
final region(:rank==3) X10_TEMP68 = X10_TEMP61;

region(:rank==3) R = (region(:rank==3))(X10_TEMP68);
for(point(:rank==3)pp:R) {
final int X10_TEMP71 = (2);
final point(:rank==3) X10_TEMP75 = (pp*X10_TEMP71);
int X10_TEMP76 = (1);
int X10_TEMP77 = (1);
int X10_TEMP78 = (1);

point(:rank==3) p = (X10_TEMP75+[X10_TEMP76,X10_TEMP77,X10_TEMP78]);
double d0 = (arg[p]);
double d1 = (Program.Util_sumDIFF1(p,arg));
double d2 = (Program.Util_sumDIFF2(p,arg));
double d3 = (Program.Util_sumDIFF3(p,arg));
final double X10_TEMP92 = (_MGOP_Pc0*d0);
final double X10_TEMP93 = (_MGOP_Pc1*d1);
final double X10_TEMP94 = (X10_TEMP92+X10_TEMP93);
final double X10_TEMP95 = (_MGOP_Pc2*d2);
final double X10_TEMP96 = (X10_TEMP94+X10_TEMP95);
final double X10_TEMP97 = (_MGOP_Pc3*d3);

final double X10_TEMP100 = (X10_TEMP96+X10_TEMP97);
final double X10_TEMP101 = (X10_TEMP100);
res[pp] = (X10_TEMP101);
}
}
}
}
}
}
public static void MGOP_applyOpQ3(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg, final int a_level) {
final int X10_TEMP1 = (1);
final int X10_TEMP2 = (_MGOP_P2SLEVEL-X10_TEMP1);

final boolean X10_TEMP4 = a_level==X10_TEMP2;
if (X10_TEMP4) {
final int X10_TEMP6 = (0);

final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,X10_TEMP6));
finish {
final LevelData X10_TEMP8 = (X10_TEMP0.m_tempLD);

final dist(:rank==1) X10_TEMP10 = (dist(:rank==1))(Program.LevelData_getPlaces(X10_TEMP8));
for(point(:rank==1)X10_TEMP11[i]:X10_TEMP10) {
final place X10_TEMP12 = X10_TEMP10.get(X10_TEMP11);
async(X10_TEMP12) {
final LevelData X10_TEMP13 = (X10_TEMP0.m_tempLD);

double[:rank==3] temp = (double[:rank==3])(Program.LevelData_getArray(X10_TEMP13,i));
final region(:rank==3) X10_TEMP17 = (region(:rank==3))(temp.region);


Program.Util_arraycopy3(temp,X10_TEMP17,arg);
}
}
}
final LevelData X10_TEMP22 = (X10_TEMP0.m_tempLD);

Program.MGOP_applyOpQ2(X10_TEMP0,a_res,X10_TEMP22);
}
else {
Program.MGOP_applyOpQ2(X10_TEMP0,a_res,a_arg);
}
}
public static void MGOP_applyOpQ2(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
if (_MGOP_OVERLAPPED) {
Program.MGOP_ApplyOpQ_Overlapped(X10_TEMP0,a_res,a_arg);
}
else {
Program.MGOP_ApplyOpQ(X10_TEMP0,a_res,a_arg);
}
}
public static void MGOP_ApplyOpQ(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
final boolean X10_TEMP1 = (X10_TEMP0.EXCHANGE_After);

final boolean X10_TEMP3 = !X10_TEMP1;
if (X10_TEMP3) {
finish {
Program.LevelData_exchange(a_arg);
}
}
finish {
final dist(:rank==1) X10_TEMP5 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP6[i]:X10_TEMP5) {
final place X10_TEMP7 = X10_TEMP5.get(X10_TEMP6);
async(X10_TEMP7) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getShrinkedRegion(a_arg,i));
for(point(:rank==3)p:R) {
double d = (0);
final int X10_TEMP16 = (2);
final point(:rank==3) X10_TEMP20 = (p*X10_TEMP16);
int X10_TEMP21 = (1);
int X10_TEMP22 = (1);
int X10_TEMP23 = (1);

point(:rank==3) pp = (X10_TEMP20+[X10_TEMP21,X10_TEMP22,X10_TEMP23]);
for(point(:rank==3)o[i2,j2,k2]:_Util_UNIT_CUBE) {
final double X10_TEMP27 = (0);
d = (X10_TEMP27);
final region(:rank==3) X10_TEMP30 = (region(:rank==3))(_Util_QREGIONS[o]);
for(point(:rank==3)[i1,j1,k1]:X10_TEMP30) {
final point(:rank==3) temp = (p+[i1,j1,k1]);
final double X10_TEMP36 = (arg[temp]);

final double X10_TEMP38 = (d+X10_TEMP36);
d = (X10_TEMP38);
}
final point(:rank==3) X10_TEMP43 = (pp+[i2,j2,k2]);

final region(:rank==3) X10_TEMP45 = (region(:rank==3))(_Util_QREGIONS[o]);
final int X10_TEMP46 = (X10_TEMP45.size());

final double X10_TEMP49 = (d/X10_TEMP46);
final double X10_TEMP50 = (X10_TEMP49);
res[X10_TEMP43] = (X10_TEMP50);
}
}
}
}
}
}
public static void MGOP_ApplyOpQ_Overlapped1(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
finish {
Program.LevelData_exchange(a_arg);
final dist(:rank==1) X10_TEMP2 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP3[i]:X10_TEMP2) {
final place X10_TEMP4 = X10_TEMP2.get(X10_TEMP3);
async(X10_TEMP4) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_arg,i));
for(point(:rank==3)p:R) {
double d = (0);
final int X10_TEMP13 = (2);
final point(:rank==3) X10_TEMP17 = (p*X10_TEMP13);
int X10_TEMP18 = (1);
int X10_TEMP19 = (1);
int X10_TEMP20 = (1);

point(:rank==3) pp = (X10_TEMP17+[X10_TEMP18,X10_TEMP19,X10_TEMP20]);
for(point(:rank==3)o[i2,j2,k2]:_Util_UNIT_CUBE) {
final double X10_TEMP24 = (0);
d = (X10_TEMP24);
final region(:rank==3) X10_TEMP27 = (region(:rank==3))(_Util_QREGIONS[o]);
for(point(:rank==3)[i1,j1,k1]:X10_TEMP27) {
final point(:rank==3) temp = (p+[i1,j1,k1]);
final double X10_TEMP33 = (arg[temp]);

final double X10_TEMP35 = (d+X10_TEMP33);
d = (X10_TEMP35);
}
final point(:rank==3) X10_TEMP40 = (pp+[i2,j2,k2]);

final region(:rank==3) X10_TEMP42 = (region(:rank==3))(_Util_QREGIONS[o]);
final int X10_TEMP43 = (X10_TEMP42.size());

final double X10_TEMP46 = (d/X10_TEMP43);
final double X10_TEMP47 = (X10_TEMP46);
res[X10_TEMP40] = (X10_TEMP47);
}
}
}
}
}
finish {
final dist(:rank==1) X10_TEMP49 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP50[i]:X10_TEMP49) {
final place X10_TEMP51 = X10_TEMP49.get(X10_TEMP50);
async(X10_TEMP51) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final region(:rank==3) X10_TEMP58 = (region(:rank==3))(Program.LevelData_getShrinkedRegion(a_arg,i));
final region(:rank==3) X10_TEMP59 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_arg,i));
final int X10_TEMP60 = 0;
final int X10_TEMP61 = 1;
final int X10_TEMP62 = X10_TEMP60 - X10_TEMP61;
final place X10_TEMP63 = here;
region(:rank==3) X10_TEMP64 = [X10_TEMP60:X10_TEMP62, X10_TEMP60:X10_TEMP62, X10_TEMP60:X10_TEMP62];
for(point(:rank==3)X10_TEMP65[X10_TEMP66, X10_TEMP67, X10_TEMP68]:X10_TEMP58) {
	boolean X10_TEMP69 = X10_TEMP59.contains(X10_TEMP65);
	X10_TEMP69 = !X10_TEMP69;
	if(X10_TEMP69) {
		final region(:rank==3) X10_TEMP70 = [X10_TEMP66:X10_TEMP66, X10_TEMP67:X10_TEMP67, X10_TEMP68:X10_TEMP68];
		X10_TEMP64 = X10_TEMP64 || X10_TEMP70;
	}
}
final region(:rank==3) X10_TEMP71 = X10_TEMP64;

region(:rank==3) R = (region(:rank==3))(X10_TEMP71);
for(point(:rank==3)p:R) {
double d = (0);
final int X10_TEMP75 = (2);
final point(:rank==3) X10_TEMP79 = (p*X10_TEMP75);
int X10_TEMP80 = (1);
int X10_TEMP81 = (1);
int X10_TEMP82 = (1);

point(:rank==3) pp = (X10_TEMP79+[X10_TEMP80,X10_TEMP81,X10_TEMP82]);
for(point(:rank==3)o[i2,j2,k2]:_Util_UNIT_CUBE) {
final double X10_TEMP86 = (0);
d = (X10_TEMP86);
final region(:rank==3) X10_TEMP89 = (region(:rank==3))(_Util_QREGIONS[o]);
for(point(:rank==3)[i1,j1,k1]:X10_TEMP89) {
final point(:rank==3) temp = (p+[i1,j1,k1]);
final double X10_TEMP95 = (arg[temp]);

final double X10_TEMP97 = (d+X10_TEMP95);
d = (X10_TEMP97);
}
final point(:rank==3) X10_TEMP102 = (pp+[i2,j2,k2]);

final region(:rank==3) X10_TEMP104 = (region(:rank==3))(_Util_QREGIONS[o]);
final int X10_TEMP105 = (X10_TEMP104.size());

final double X10_TEMP108 = (d/X10_TEMP105);
final double X10_TEMP109 = (X10_TEMP108);
res[X10_TEMP102] = (X10_TEMP109);
}
}
}
}
}
}
public static void MGOP_ApplyOpQ_Overlapped(final MGOP X10_TEMP0, final LevelData a_res, final LevelData a_arg) {
finish {
final place X10_TEMP2 = here;
async(X10_TEMP2) {
final dist(:rank==1) X10_TEMP4 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP5[i]:X10_TEMP4) {
final place X10_TEMP6 = X10_TEMP4.get(X10_TEMP5);
async(X10_TEMP6) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
region(:rank==3) R = (region(:rank==3))(Program.LevelData_getINNERRegion(a_arg,i));
for(point(:rank==3)p:R) {
double d = (0);
final int X10_TEMP15 = (2);
final point(:rank==3) X10_TEMP19 = (p*X10_TEMP15);
int X10_TEMP20 = (1);
int X10_TEMP21 = (1);
int X10_TEMP22 = (1);

point(:rank==3) pp = (X10_TEMP19+[X10_TEMP20,X10_TEMP21,X10_TEMP22]);
for(point(:rank==3)o[i2,j2,k2]:_Util_UNIT_CUBE) {
final double X10_TEMP26 = (0);
d = (X10_TEMP26);
final region(:rank==3) X10_TEMP29 = (region(:rank==3))(_Util_QREGIONS[o]);
for(point(:rank==3)[i1,j1,k1]:X10_TEMP29) {
final point(:rank==3) temp = (p+[i1,j1,k1]);
final double X10_TEMP35 = (arg[temp]);

final double X10_TEMP37 = (d+X10_TEMP35);
d = (X10_TEMP37);
}
final point(:rank==3) X10_TEMP42 = (pp+[i2,j2,k2]);

final region(:rank==3) X10_TEMP44 = (region(:rank==3))(_Util_QREGIONS[o]);
final int X10_TEMP45 = (X10_TEMP44.size());

final double X10_TEMP48 = (d/X10_TEMP45);
final double X10_TEMP49 = (X10_TEMP48);
res[X10_TEMP42] = (X10_TEMP49);
}
}
}
}
finish {
Program.LevelData_exchange(a_arg);
}
final dist(:rank==1) X10_TEMP51 = (dist(:rank==1))(Program.LevelData_getPlaces(a_res));
for(point(:rank==1)X10_TEMP52[i]:X10_TEMP51) {
final place X10_TEMP53 = X10_TEMP51.get(X10_TEMP52);
async(X10_TEMP53) {
final double[:rank==3] arg = (double[:rank==3])(Program.LevelData_getArray(a_arg,i));
final double[:rank==3] res = (double[:rank==3])(Program.LevelData_getArray(a_res,i));
final region(:rank==3) X10_TEMP60 = (region(:rank==3))(Program.LevelData_getShrinkedRegion(a_arg,i));
final region(:rank==3) X10_TEMP61 = (region(:rank==3))(Program.LevelData_getINNERRegion(a_arg,i));
final int X10_TEMP62 = 0;
final int X10_TEMP63 = 1;
final int X10_TEMP64 = X10_TEMP62 - X10_TEMP63;
final place X10_TEMP65 = here;
region(:rank==3) X10_TEMP66 = [X10_TEMP62:X10_TEMP64, X10_TEMP62:X10_TEMP64, X10_TEMP62:X10_TEMP64];
for(point(:rank==3)X10_TEMP67[X10_TEMP68, X10_TEMP69, X10_TEMP70]:X10_TEMP60) {
	boolean X10_TEMP71 = X10_TEMP61.contains(X10_TEMP67);
	X10_TEMP71 = !X10_TEMP71;
	if(X10_TEMP71) {
		final region(:rank==3) X10_TEMP72 = [X10_TEMP68:X10_TEMP68, X10_TEMP69:X10_TEMP69, X10_TEMP70:X10_TEMP70];
		X10_TEMP66 = X10_TEMP66 || X10_TEMP72;
	}
}
final region(:rank==3) X10_TEMP73 = X10_TEMP66;

region(:rank==3) R = (region(:rank==3))(X10_TEMP73);
for(point(:rank==3)p:R) {
double d = (0);
final int X10_TEMP77 = (2);
final point(:rank==3) X10_TEMP81 = (p*X10_TEMP77);
int X10_TEMP82 = (1);
int X10_TEMP83 = (1);
int X10_TEMP84 = (1);

point(:rank==3) pp = (X10_TEMP81+[X10_TEMP82,X10_TEMP83,X10_TEMP84]);
for(point(:rank==3)o[i2,j2,k2]:_Util_UNIT_CUBE) {
final double X10_TEMP88 = (0);
d = (X10_TEMP88);
final region(:rank==3) X10_TEMP91 = (region(:rank==3))(_Util_QREGIONS[o]);
for(point(:rank==3)[i1,j1,k1]:X10_TEMP91) {
final point(:rank==3) temp = (p+[i1,j1,k1]);
final double X10_TEMP97 = (arg[temp]);

final double X10_TEMP99 = (d+X10_TEMP97);
d = (X10_TEMP99);
}
final point(:rank==3) X10_TEMP104 = (pp+[i2,j2,k2]);

final region(:rank==3) X10_TEMP106 = (region(:rank==3))(_Util_QREGIONS[o]);
final int X10_TEMP107 = (X10_TEMP106.size());

final double X10_TEMP110 = (d/X10_TEMP107);
final double X10_TEMP111 = (X10_TEMP110);
res[X10_TEMP104] = (X10_TEMP111);
}
}
}
}
}
}
}
public static double MGOP_MGSolve(final MGOP X10_TEMP0, final LevelData a_u, final LevelData a_v, final int a_its) {
final int X10_TEMP1 = (X10_TEMP0.m_levels);
final int X10_TEMP2 = (1);

int l = (X10_TEMP1-X10_TEMP2);
final LevelData[:rank==1] X10_TEMP4 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final LevelData X10_TEMP6 = (X10_TEMP4[l]);

Program.LevelData_setLevelData(X10_TEMP6,a_v);
final String X10_TEMP11 = ("The init residual norm is ");
final LevelData[:rank==1] X10_TEMP8 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final LevelData X10_TEMP10 = (X10_TEMP8[l]);
final double X10_TEMP12 = (Program.LevelData_norm2(X10_TEMP10));

final String X10_TEMP14 = (X10_TEMP11+X10_TEMP12);
System.out.println(X10_TEMP14);
double res = (0.0);
int i = (0);
boolean X10_TEMP19 = i<a_its;
while(X10_TEMP19) {
final String X10_TEMP20 = ("Iteration ");

final String X10_TEMP22 = (X10_TEMP20+i);
System.out.println(X10_TEMP22);
Program.MGOP_MG(X10_TEMP0);
final LevelData[:rank==1] X10_TEMP23 = (LevelData[:rank==1])(X10_TEMP0.m_z);

final LevelData X10_TEMP26 = (X10_TEMP23[l]);

Program.LevelData_add(a_u,X10_TEMP26);
final LevelData[:rank==1] X10_TEMP27 = (LevelData[:rank==1])(X10_TEMP0.m_r);

final LevelData X10_TEMP32 = (X10_TEMP27[l]);

Program.MGOP_computeResidual3(X10_TEMP0,X10_TEMP32,a_v,a_u);
final LevelData[:rank==1] X10_TEMP33 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final LevelData X10_TEMP35 = (X10_TEMP33[l]);

final double X10_TEMP37 = (Program.LevelData_norm2(X10_TEMP35));
res = (X10_TEMP37);
final String X10_TEMP38 = ("The residual norm is ");

final String X10_TEMP40 = (X10_TEMP38+res);
System.out.println(X10_TEMP40);
final int X10_TEMP41 = (i);
final int X10_TEMP42 = 1;
i = i + X10_TEMP42;

X10_TEMP19 = i<a_its;
}
return res;
}
public static void MGOP_MG(final MGOP X10_TEMP0) {
final int X10_TEMP1 = (X10_TEMP0.m_levels);
final int X10_TEMP2 = (1);

int i2 = (X10_TEMP1-X10_TEMP2);
final int X10_TEMP4 = (0);
boolean X10_TEMP8 = i2>X10_TEMP4;
while(X10_TEMP8) {
final LevelData[:rank==1] X10_TEMP9 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final int X10_TEMP10 = (1);

final int X10_TEMP12 = (i2-X10_TEMP10);

final LevelData X10_TEMP18 = (X10_TEMP9[X10_TEMP12]);
final LevelData[:rank==1] X10_TEMP14 = (LevelData[:rank==1])(X10_TEMP0.m_r);

final LevelData X10_TEMP19 = (X10_TEMP14[i2]);

Program.MGOP_applyOpP3(X10_TEMP0,X10_TEMP18,X10_TEMP19,i2);
final int X10_TEMP20 = (i2);
final int X10_TEMP21 = 1;
i2 = i2 - X10_TEMP21;

final int X10_TEMP6 = (0);
X10_TEMP8 = i2>X10_TEMP6;
}
final LevelData[:rank==1] X10_TEMP22 = (LevelData[:rank==1])(X10_TEMP0.m_z);
final int X10_TEMP24 = (0);
final LevelData X10_TEMP25 = (X10_TEMP22[X10_TEMP24]);
final int X10_TEMP27 = (0);

Program.LevelData_set(X10_TEMP25,X10_TEMP27);
final LevelData[:rank==1] X10_TEMP28 = (LevelData[:rank==1])(X10_TEMP0.m_z);
final int X10_TEMP30 = (0);

final LevelData X10_TEMP37 = (X10_TEMP28[X10_TEMP30]);
final LevelData[:rank==1] X10_TEMP32 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final int X10_TEMP34 = (0);

final LevelData X10_TEMP38 = (X10_TEMP32[X10_TEMP34]);
final boolean X10_TEMP39 = (true);

Program.MGOP_smooth(X10_TEMP0,X10_TEMP37,X10_TEMP38,X10_TEMP39);
int i3 = (1);
final int X10_TEMP41 = (X10_TEMP0.m_levels);
boolean X10_TEMP45 = i3<X10_TEMP41;
while(X10_TEMP45) {
final LevelData[:rank==1] X10_TEMP46 = (LevelData[:rank==1])(X10_TEMP0.m_z);

final LevelData X10_TEMP56 = (X10_TEMP46[i3]);
final LevelData[:rank==1] X10_TEMP49 = (LevelData[:rank==1])(X10_TEMP0.m_z);
final int X10_TEMP50 = (1);

final int X10_TEMP52 = (i3-X10_TEMP50);

final LevelData X10_TEMP57 = (X10_TEMP49[X10_TEMP52]);
final int X10_TEMP54 = (1);

final int X10_TEMP58 = (i3-X10_TEMP54);

Program.MGOP_applyOpQ3(X10_TEMP0,X10_TEMP56,X10_TEMP57,X10_TEMP58);
final LevelData[:rank==1] X10_TEMP59 = (LevelData[:rank==1])(X10_TEMP0.m_r);

final LevelData X10_TEMP65 = (X10_TEMP59[i3]);
final LevelData[:rank==1] X10_TEMP62 = (LevelData[:rank==1])(X10_TEMP0.m_z);

final LevelData X10_TEMP66 = (X10_TEMP62[i3]);

Program.MGOP_computeResidual2(X10_TEMP0,X10_TEMP65,X10_TEMP66);
final LevelData[:rank==1] X10_TEMP67 = (LevelData[:rank==1])(X10_TEMP0.m_z);

final LevelData X10_TEMP74 = (X10_TEMP67[i3]);
final LevelData[:rank==1] X10_TEMP70 = (LevelData[:rank==1])(X10_TEMP0.m_r);

final LevelData X10_TEMP75 = (X10_TEMP70[i3]);
final boolean X10_TEMP76 = (false);

Program.MGOP_smooth(X10_TEMP0,X10_TEMP74,X10_TEMP75,X10_TEMP76);
final int X10_TEMP77 = (i3);
final int X10_TEMP78 = 1;
i3 = i3 + X10_TEMP78;

final int X10_TEMP43 = (X10_TEMP0.m_levels);
X10_TEMP45 = i3<X10_TEMP43;
}
}
public static double MGOP_residualNorm(final MGOP X10_TEMP0) {
final int X10_TEMP1 = (X10_TEMP0.m_levels);
final int X10_TEMP2 = (1);

int l = (X10_TEMP1-X10_TEMP2);
final LevelData[:rank==1] X10_TEMP4 = (LevelData[:rank==1])(X10_TEMP0.m_r);
final LevelData X10_TEMP6 = (X10_TEMP4[l]);

final double X10_TEMP8 = (Program.LevelData_norm2(X10_TEMP6));
return X10_TEMP8;
}
public static int _Timer_max_counters_init() {

final int X10_TEMP2 = (64);
return X10_TEMP2;
}
public static void Timer_start(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.start_time);

final double X10_TEMP5 = (System.currentTimeMillis());
final double X10_TEMP6 = (X10_TEMP5);
X10_TEMP1[n] = (X10_TEMP6);
}
public static void Timer_stop(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double X10_TEMP5 = (System.currentTimeMillis());
final double[:rank==1] X10_TEMP3 = (double[:rank==1])(X10_TEMP0.start_time);
final double X10_TEMP6 = (X10_TEMP3[n]);

final double X10_TEMP9 = (X10_TEMP5-X10_TEMP6);
final double X10_TEMP10 = (X10_TEMP9);
X10_TEMP1[n] = (X10_TEMP10);
final double[:rank==1] X10_TEMP11 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double[:rank==1] X10_TEMP13 = (double[:rank==1])(X10_TEMP0.elapsed_time);
final double X10_TEMP15 = (X10_TEMP13[n]);
final int X10_TEMP16 = (1000);

final double X10_TEMP19 = (X10_TEMP15/X10_TEMP16);
final double X10_TEMP20 = (X10_TEMP19);
X10_TEMP11[n] = (X10_TEMP20);
final double[:rank==1] X10_TEMP21 = (double[:rank==1])(X10_TEMP0.total_time);

final double[:rank==1] X10_TEMP23 = (double[:rank==1])(X10_TEMP0.total_time);
final double X10_TEMP27 = (X10_TEMP23[n]);
final double[:rank==1] X10_TEMP25 = (double[:rank==1])(X10_TEMP0.elapsed_time);
final double X10_TEMP28 = (X10_TEMP25[n]);

final double X10_TEMP31 = (X10_TEMP27+X10_TEMP28);
final double X10_TEMP32 = (X10_TEMP31);
X10_TEMP21[n] = (X10_TEMP32);
}
public static double Timer_readTimer(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.total_time);

final double X10_TEMP4 = (X10_TEMP1[n]);
return X10_TEMP4;
}
public static void Timer_resetTimer(final Timer X10_TEMP0, final int n) {
final double[:rank==1] X10_TEMP1 = (double[:rank==1])(X10_TEMP0.total_time);

final double X10_TEMP5 = (0);
final double X10_TEMP6 = (X10_TEMP5);
X10_TEMP1[n] = (X10_TEMP6);
final double[:rank==1] X10_TEMP7 = (double[:rank==1])(X10_TEMP0.start_time);

final double X10_TEMP11 = (0);
final double X10_TEMP12 = (X10_TEMP11);
X10_TEMP7[n] = (X10_TEMP12);
final double[:rank==1] X10_TEMP13 = (double[:rank==1])(X10_TEMP0.elapsed_time);

final double X10_TEMP17 = (0);
final double X10_TEMP18 = (X10_TEMP17);
X10_TEMP13[n] = (X10_TEMP18);
}
public static void Timer_resetAllTimers(final Timer X10_TEMP0) {
int i = (0);
boolean X10_TEMP4 = i<_Timer_max_counters;
while(X10_TEMP4) {
Program.Timer_resetTimer(X10_TEMP0,i);
final int X10_TEMP6 = (i);
final int X10_TEMP7 = 1;
i = i + X10_TEMP7;

X10_TEMP4 = i<_Timer_max_counters;
}
}
public static boolean _Util_PERF_OUTPUT_init() {

final boolean X10_TEMP2 = (true);
return X10_TEMP2;
}
public static double _Util_CLOCK_SPEED_init() {

final double X10_TEMP2 = (375);
return X10_TEMP2;
}
public static double _Util_FP_PERCLOCK_init() {

final double X10_TEMP2 = (4);
return X10_TEMP2;
}
public static double _Util_COMM_LATENCY_init() {

final double X10_TEMP2 = (1);
return X10_TEMP2;
}
public static double _Util_COMM_BANDWIDTH_init() {

final double X10_TEMP2 = (2000);
return X10_TEMP2;
}
public static boolean _Util_IN_LOOP_init() {

final boolean X10_TEMP2 = (false);
return X10_TEMP2;
}
public static boolean _Util_COMP_ONLY_init() {

final boolean X10_TEMP2 = (false);
return X10_TEMP2;
}
public static boolean _Util_COMM_ONLY_init() {

final boolean X10_TEMP2 = (false);
return X10_TEMP2;
}
public static int _Util_THREADS_PERFOREACH_init() {

final int X10_TEMP2 = (1);
return X10_TEMP2;
}
public static boolean _Util_OVERLAP_COMMANDCOMP_init() {

final boolean X10_TEMP2 = (false);
return X10_TEMP2;
}
public static boolean _Util_EXCHANGE_AFTER_init() {

final boolean X10_TEMP2 = (false);
return X10_TEMP2;
}
public static int _Util_P2SLEVEL_init() {

final int X10_TEMP2 = (1);
return X10_TEMP2;
}
public static int _Util_N_PLACES_init() {

final int X10_TEMP2 = (place.MAX_PLACES);
return X10_TEMP2;
}
public static double Util_sumDIFF1(final point(:rank==3) p, final double [:rank==3] arg) {
double d1 = (0);
int X10_TEMP5 = (1);
int X10_TEMP6 = (0);
int X10_TEMP7 = (0);

final point(:rank==3) X10_TEMP9 = (p+[X10_TEMP5,X10_TEMP6,X10_TEMP7]);
final double X10_TEMP10 = (arg[X10_TEMP9]);

final double X10_TEMP12 = (d1+X10_TEMP10);
d1 = (X10_TEMP12);
final int X10_TEMP13 = (1);
final int X10_TEMP14 = 0;

int X10_TEMP18 = (X10_TEMP14 - X10_TEMP13);
int X10_TEMP19 = (0);
int X10_TEMP20 = (0);

final point(:rank==3) X10_TEMP22 = (p+[X10_TEMP18,X10_TEMP19,X10_TEMP20]);
final double X10_TEMP23 = (arg[X10_TEMP22]);

final double X10_TEMP25 = (d1+X10_TEMP23);
d1 = (X10_TEMP25);
int X10_TEMP29 = (0);
int X10_TEMP30 = (1);
int X10_TEMP31 = (0);

final point(:rank==3) X10_TEMP33 = (p+[X10_TEMP29,X10_TEMP30,X10_TEMP31]);
final double X10_TEMP34 = (arg[X10_TEMP33]);

final double X10_TEMP36 = (d1+X10_TEMP34);
d1 = (X10_TEMP36);
int X10_TEMP42 = (0);
final int X10_TEMP38 = (1);
final int X10_TEMP39 = 0;

int X10_TEMP43 = (X10_TEMP39 - X10_TEMP38);
int X10_TEMP44 = (0);

final point(:rank==3) X10_TEMP46 = (p+[X10_TEMP42,X10_TEMP43,X10_TEMP44]);
final double X10_TEMP47 = (arg[X10_TEMP46]);

final double X10_TEMP49 = (d1+X10_TEMP47);
d1 = (X10_TEMP49);
int X10_TEMP53 = (0);
int X10_TEMP54 = (0);
int X10_TEMP55 = (1);

final point(:rank==3) X10_TEMP57 = (p+[X10_TEMP53,X10_TEMP54,X10_TEMP55]);
final double X10_TEMP58 = (arg[X10_TEMP57]);

final double X10_TEMP60 = (d1+X10_TEMP58);
d1 = (X10_TEMP60);
int X10_TEMP66 = (0);
int X10_TEMP67 = (0);
final int X10_TEMP63 = (1);
final int X10_TEMP64 = 0;

int X10_TEMP68 = (X10_TEMP64 - X10_TEMP63);

final point(:rank==3) X10_TEMP70 = (p+[X10_TEMP66,X10_TEMP67,X10_TEMP68]);
final double X10_TEMP71 = (arg[X10_TEMP70]);

final double X10_TEMP73 = (d1+X10_TEMP71);
d1 = (X10_TEMP73);
return d1;
}
public static double Util_sumDIFF2(final point(:rank==3) p, final double [:rank==3] arg) {
double d1 = (0);
int X10_TEMP5 = (1);
int X10_TEMP6 = (1);
int X10_TEMP7 = (0);

final point(:rank==3) X10_TEMP9 = (p+[X10_TEMP5,X10_TEMP6,X10_TEMP7]);
final double X10_TEMP10 = (arg[X10_TEMP9]);

final double X10_TEMP12 = (d1+X10_TEMP10);
d1 = (X10_TEMP12);
int X10_TEMP18 = (1);
final int X10_TEMP14 = (1);
final int X10_TEMP15 = 0;

int X10_TEMP19 = (X10_TEMP15 - X10_TEMP14);
int X10_TEMP20 = (0);

final point(:rank==3) X10_TEMP22 = (p+[X10_TEMP18,X10_TEMP19,X10_TEMP20]);
final double X10_TEMP23 = (arg[X10_TEMP22]);

final double X10_TEMP25 = (d1+X10_TEMP23);
d1 = (X10_TEMP25);
final int X10_TEMP26 = (1);
final int X10_TEMP27 = 0;

int X10_TEMP31 = (X10_TEMP27 - X10_TEMP26);
int X10_TEMP32 = (1);
int X10_TEMP33 = (0);

final point(:rank==3) X10_TEMP35 = (p+[X10_TEMP31,X10_TEMP32,X10_TEMP33]);
final double X10_TEMP36 = (arg[X10_TEMP35]);

final double X10_TEMP38 = (d1+X10_TEMP36);
d1 = (X10_TEMP38);
final int X10_TEMP39 = (1);
final int X10_TEMP40 = 0;

int X10_TEMP46 = (X10_TEMP40 - X10_TEMP39);
final int X10_TEMP42 = (1);
final int X10_TEMP43 = 0;

int X10_TEMP47 = (X10_TEMP43 - X10_TEMP42);
int X10_TEMP48 = (0);

final point(:rank==3) X10_TEMP50 = (p+[X10_TEMP46,X10_TEMP47,X10_TEMP48]);
final double X10_TEMP51 = (arg[X10_TEMP50]);

final double X10_TEMP53 = (d1+X10_TEMP51);
d1 = (X10_TEMP53);
int X10_TEMP57 = (1);
int X10_TEMP58 = (0);
int X10_TEMP59 = (1);

final point(:rank==3) X10_TEMP61 = (p+[X10_TEMP57,X10_TEMP58,X10_TEMP59]);
final double X10_TEMP62 = (arg[X10_TEMP61]);

final double X10_TEMP64 = (d1+X10_TEMP62);
d1 = (X10_TEMP64);
int X10_TEMP70 = (1);
int X10_TEMP71 = (0);
final int X10_TEMP67 = (1);
final int X10_TEMP68 = 0;

int X10_TEMP72 = (X10_TEMP68 - X10_TEMP67);

final point(:rank==3) X10_TEMP74 = (p+[X10_TEMP70,X10_TEMP71,X10_TEMP72]);
final double X10_TEMP75 = (arg[X10_TEMP74]);

final double X10_TEMP77 = (d1+X10_TEMP75);
d1 = (X10_TEMP77);
final int X10_TEMP78 = (1);
final int X10_TEMP79 = 0;

int X10_TEMP83 = (X10_TEMP79 - X10_TEMP78);
int X10_TEMP84 = (0);
int X10_TEMP85 = (1);

final point(:rank==3) X10_TEMP87 = (p+[X10_TEMP83,X10_TEMP84,X10_TEMP85]);
final double X10_TEMP88 = (arg[X10_TEMP87]);

final double X10_TEMP90 = (d1+X10_TEMP88);
d1 = (X10_TEMP90);
final int X10_TEMP91 = (1);
final int X10_TEMP92 = 0;

int X10_TEMP98 = (X10_TEMP92 - X10_TEMP91);
int X10_TEMP99 = (0);
final int X10_TEMP95 = (1);
final int X10_TEMP96 = 0;

int X10_TEMP100 = (X10_TEMP96 - X10_TEMP95);

final point(:rank==3) X10_TEMP102 = (p+[X10_TEMP98,X10_TEMP99,X10_TEMP100]);
final double X10_TEMP103 = (arg[X10_TEMP102]);

final double X10_TEMP105 = (d1+X10_TEMP103);
d1 = (X10_TEMP105);
int X10_TEMP109 = (0);
int X10_TEMP110 = (1);
int X10_TEMP111 = (1);

final point(:rank==3) X10_TEMP113 = (p+[X10_TEMP109,X10_TEMP110,X10_TEMP111]);
final double X10_TEMP114 = (arg[X10_TEMP113]);

final double X10_TEMP116 = (d1+X10_TEMP114);
d1 = (X10_TEMP116);
int X10_TEMP122 = (0);
int X10_TEMP123 = (1);
final int X10_TEMP119 = (1);
final int X10_TEMP120 = 0;

int X10_TEMP124 = (X10_TEMP120 - X10_TEMP119);

final point(:rank==3) X10_TEMP126 = (p+[X10_TEMP122,X10_TEMP123,X10_TEMP124]);
final double X10_TEMP127 = (arg[X10_TEMP126]);

final double X10_TEMP129 = (d1+X10_TEMP127);
d1 = (X10_TEMP129);
int X10_TEMP135 = (0);
final int X10_TEMP131 = (1);
final int X10_TEMP132 = 0;

int X10_TEMP136 = (X10_TEMP132 - X10_TEMP131);
int X10_TEMP137 = (1);

final point(:rank==3) X10_TEMP139 = (p+[X10_TEMP135,X10_TEMP136,X10_TEMP137]);
final double X10_TEMP140 = (arg[X10_TEMP139]);

final double X10_TEMP142 = (d1+X10_TEMP140);
d1 = (X10_TEMP142);
int X10_TEMP150 = (0);
final int X10_TEMP144 = (1);
final int X10_TEMP145 = 0;

int X10_TEMP151 = (X10_TEMP145 - X10_TEMP144);
final int X10_TEMP147 = (1);
final int X10_TEMP148 = 0;

int X10_TEMP152 = (X10_TEMP148 - X10_TEMP147);

final point(:rank==3) X10_TEMP154 = (p+[X10_TEMP150,X10_TEMP151,X10_TEMP152]);
final double X10_TEMP155 = (arg[X10_TEMP154]);

final double X10_TEMP157 = (d1+X10_TEMP155);
d1 = (X10_TEMP157);
return d1;
}
public static double Util_sumDIFF3(final point(:rank==3) p, final double [:rank==3] arg) {
double d1 = (0);
int X10_TEMP5 = (1);
int X10_TEMP6 = (1);
int X10_TEMP7 = (1);

final point(:rank==3) X10_TEMP9 = (p+[X10_TEMP5,X10_TEMP6,X10_TEMP7]);
final double X10_TEMP10 = (arg[X10_TEMP9]);

final double X10_TEMP12 = (d1+X10_TEMP10);
d1 = (X10_TEMP12);
int X10_TEMP18 = (1);
int X10_TEMP19 = (1);
final int X10_TEMP15 = (1);
final int X10_TEMP16 = 0;

int X10_TEMP20 = (X10_TEMP16 - X10_TEMP15);

final point(:rank==3) X10_TEMP22 = (p+[X10_TEMP18,X10_TEMP19,X10_TEMP20]);
final double X10_TEMP23 = (arg[X10_TEMP22]);

final double X10_TEMP25 = (d1+X10_TEMP23);
d1 = (X10_TEMP25);
int X10_TEMP31 = (1);
final int X10_TEMP27 = (1);
final int X10_TEMP28 = 0;

int X10_TEMP32 = (X10_TEMP28 - X10_TEMP27);
int X10_TEMP33 = (1);

final point(:rank==3) X10_TEMP35 = (p+[X10_TEMP31,X10_TEMP32,X10_TEMP33]);
final double X10_TEMP36 = (arg[X10_TEMP35]);

final double X10_TEMP38 = (d1+X10_TEMP36);
d1 = (X10_TEMP38);
int X10_TEMP46 = (1);
final int X10_TEMP40 = (1);
final int X10_TEMP41 = 0;

int X10_TEMP47 = (X10_TEMP41 - X10_TEMP40);
final int X10_TEMP43 = (1);
final int X10_TEMP44 = 0;

int X10_TEMP48 = (X10_TEMP44 - X10_TEMP43);

final point(:rank==3) X10_TEMP50 = (p+[X10_TEMP46,X10_TEMP47,X10_TEMP48]);
final double X10_TEMP51 = (arg[X10_TEMP50]);

final double X10_TEMP53 = (d1+X10_TEMP51);
d1 = (X10_TEMP53);
final int X10_TEMP54 = (1);
final int X10_TEMP55 = 0;

int X10_TEMP59 = (X10_TEMP55 - X10_TEMP54);
int X10_TEMP60 = (1);
int X10_TEMP61 = (1);

final point(:rank==3) X10_TEMP63 = (p+[X10_TEMP59,X10_TEMP60,X10_TEMP61]);
final double X10_TEMP64 = (arg[X10_TEMP63]);

final double X10_TEMP66 = (d1+X10_TEMP64);
d1 = (X10_TEMP66);
final int X10_TEMP67 = (1);
final int X10_TEMP68 = 0;

int X10_TEMP74 = (X10_TEMP68 - X10_TEMP67);
int X10_TEMP75 = (1);
final int X10_TEMP71 = (1);
final int X10_TEMP72 = 0;

int X10_TEMP76 = (X10_TEMP72 - X10_TEMP71);

final point(:rank==3) X10_TEMP78 = (p+[X10_TEMP74,X10_TEMP75,X10_TEMP76]);
final double X10_TEMP79 = (arg[X10_TEMP78]);

final double X10_TEMP81 = (d1+X10_TEMP79);
d1 = (X10_TEMP81);
final int X10_TEMP82 = (1);
final int X10_TEMP83 = 0;

int X10_TEMP89 = (X10_TEMP83 - X10_TEMP82);
final int X10_TEMP85 = (1);
final int X10_TEMP86 = 0;

int X10_TEMP90 = (X10_TEMP86 - X10_TEMP85);
int X10_TEMP91 = (1);

final point(:rank==3) X10_TEMP93 = (p+[X10_TEMP89,X10_TEMP90,X10_TEMP91]);
final double X10_TEMP94 = (arg[X10_TEMP93]);

final double X10_TEMP96 = (d1+X10_TEMP94);
d1 = (X10_TEMP96);
final int X10_TEMP97 = (1);
final int X10_TEMP98 = 0;

int X10_TEMP106 = (X10_TEMP98 - X10_TEMP97);
final int X10_TEMP100 = (1);
final int X10_TEMP101 = 0;

int X10_TEMP107 = (X10_TEMP101 - X10_TEMP100);
final int X10_TEMP103 = (1);
final int X10_TEMP104 = 0;

int X10_TEMP108 = (X10_TEMP104 - X10_TEMP103);

final point(:rank==3) X10_TEMP110 = (p+[X10_TEMP106,X10_TEMP107,X10_TEMP108]);
final double X10_TEMP111 = (arg[X10_TEMP110]);

final double X10_TEMP113 = (d1+X10_TEMP111);
d1 = (X10_TEMP113);
return d1;
}
public static region(:rank==3) _Util_UNIT_CUBE_init() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (1);
final int X10_TEMP7 = (0);
final int X10_TEMP8 = (1);
final int X10_TEMP11 = (0);
final int X10_TEMP12 = (1);

final region(:rank==3) X10_TEMP14 = (region(:rank==3))([X10_TEMP3:X10_TEMP4,X10_TEMP7:X10_TEMP8,X10_TEMP11:X10_TEMP12]);
return X10_TEMP14;
}
public static region(:rank==3) value[:rank==3] _Util_QREGIONS_init() {
final region(:rank==3) value[:rank==3] X10_TEMP12 = (region(:rank==3) value[:rank==3])(new region(:rank==3) value[_Util_UNIT_CUBE](point(:rank==3)p[a,b,c]) {
final int X10_TEMP3 = (0);
final int X10_TEMP6 = (0);
final int X10_TEMP9 = (0);

final region(:rank==3) X10_TEMP11 = (region(:rank==3))([X10_TEMP3:a,X10_TEMP6:b,X10_TEMP9:c]);
return X10_TEMP11;
}

);

return X10_TEMP12;
}
public static int _Util_LOW_init() {

final int X10_TEMP2 = (0);
return X10_TEMP2;
}
public static int _Util_HIGH_init() {

final int X10_TEMP2 = (1);
return X10_TEMP2;
}
public static boolean Util_powerOf2(final int a_int) {
final int X10_TEMP2 = (Math.abs(a_int));

int i = ((int)X10_TEMP2);
final int X10_TEMP4 = (0);

final boolean X10_TEMP6 = i==X10_TEMP4;
if (X10_TEMP6) {
final boolean X10_TEMP8 = (false);
return X10_TEMP8;
}
else {
final int X10_TEMP11 = (Program.Util_log2(i));

final int X10_TEMP13 = (Program.Util_pow2(X10_TEMP11));

final boolean X10_TEMP15 = i!=X10_TEMP13;
if (X10_TEMP15) {
final boolean X10_TEMP17 = (false);
return X10_TEMP17;
}
}
final boolean X10_TEMP19 = (true);
return X10_TEMP19;
}
public static int Util_log2(final int a_int) {
final double X10_TEMP4 = (Math.log(a_int));
final int X10_TEMP3 = (2);
final double X10_TEMP5 = (Math.log(X10_TEMP3));

final double X10_TEMP7 = (X10_TEMP4/X10_TEMP5);

final int X10_TEMP9 = ((int)X10_TEMP7);
return X10_TEMP9;
}
public static int Util_pow2(final int a_int) {
final int X10_TEMP3 = (2);
final double X10_TEMP4 = (Math.pow(X10_TEMP3,a_int));

final int X10_TEMP6 = ((int)X10_TEMP4);
return X10_TEMP6;
}
public static region(:rank==3) Util_boundary(final region(:rank==3) a_R, final int a_direction, final int a_padSize0, final int a_padSize1, final int a_padSize2) {
final int X10_TEMP2 = (Math.abs(a_direction));

int i = ((int)X10_TEMP2);
final int X10_TEMP4 = (0);

final boolean X10_TEMP6 = (a_direction>X10_TEMP4);

boolean IsHigh = (X10_TEMP6);
final int X10_TEMP9 = (0);
final int X10_TEMP11 = 3;
final boolean X10_TEMP10 = X10_TEMP9>=X10_TEMP11;
if (X10_TEMP10) {
final String X10_TEMP12 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP13 = ", expected 3";
String X10_TEMP14 = X10_TEMP12 + X10_TEMP9;
X10_TEMP14 = X10_TEMP14 + X10_TEMP13;
throw new RuntimeException(X10_TEMP14);
}
final int X10_TEMP15 = 0;
final int X10_TEMP16 = 1;
final int X10_TEMP18 = X10_TEMP15 - X10_TEMP16;
region(:rank==1) X10_TEMP17 = (region(:rank==1))([X10_TEMP15:X10_TEMP18]);
final int X10_TEMP19 = 0;
final boolean X10_TEMP22 = X10_TEMP9 == X10_TEMP19;
final int X10_TEMP20 = 1;
final boolean X10_TEMP23 = X10_TEMP9 == X10_TEMP20;
final int X10_TEMP21 = 2;
final boolean X10_TEMP24 = X10_TEMP9 == X10_TEMP21;
for(point(:rank==3)[X10_TEMP25, X10_TEMP26, X10_TEMP27]:a_R) {
if(X10_TEMP22) {
final region(:rank==1) X10_TEMP28 = [X10_TEMP25:X10_TEMP25];
X10_TEMP17 = X10_TEMP17 || X10_TEMP28;
}
else {
 if(X10_TEMP23) {
final region(:rank==1) X10_TEMP28 = [X10_TEMP26:X10_TEMP26];
X10_TEMP17 = X10_TEMP17 || X10_TEMP28;
}
else {
 if(X10_TEMP24) {
final region(:rank==1) X10_TEMP28 = [X10_TEMP27:X10_TEMP27];
X10_TEMP17 = X10_TEMP17 || X10_TEMP28;
}
}
}
}
final region(:rank==1) X10_TEMP29 = X10_TEMP17;

int low0 = (X10_TEMP29.low());
final int X10_TEMP32 = (1);
final int X10_TEMP34 = 3;
final boolean X10_TEMP33 = X10_TEMP32>=X10_TEMP34;
if (X10_TEMP33) {
final String X10_TEMP35 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP36 = ", expected 3";
String X10_TEMP37 = X10_TEMP35 + X10_TEMP32;
X10_TEMP37 = X10_TEMP37 + X10_TEMP36;
throw new RuntimeException(X10_TEMP37);
}
final int X10_TEMP38 = 0;
final int X10_TEMP39 = 1;
final int X10_TEMP41 = X10_TEMP38 - X10_TEMP39;
region(:rank==1) X10_TEMP40 = (region(:rank==1))([X10_TEMP38:X10_TEMP41]);
final int X10_TEMP42 = 0;
final boolean X10_TEMP45 = X10_TEMP32 == X10_TEMP42;
final int X10_TEMP43 = 1;
final boolean X10_TEMP46 = X10_TEMP32 == X10_TEMP43;
final int X10_TEMP44 = 2;
final boolean X10_TEMP47 = X10_TEMP32 == X10_TEMP44;
for(point(:rank==3)[X10_TEMP48, X10_TEMP49, X10_TEMP50]:a_R) {
if(X10_TEMP45) {
final region(:rank==1) X10_TEMP51 = [X10_TEMP48:X10_TEMP48];
X10_TEMP40 = X10_TEMP40 || X10_TEMP51;
}
else {
 if(X10_TEMP46) {
final region(:rank==1) X10_TEMP51 = [X10_TEMP49:X10_TEMP49];
X10_TEMP40 = X10_TEMP40 || X10_TEMP51;
}
else {
 if(X10_TEMP47) {
final region(:rank==1) X10_TEMP51 = [X10_TEMP50:X10_TEMP50];
X10_TEMP40 = X10_TEMP40 || X10_TEMP51;
}
}
}
}
final region(:rank==1) X10_TEMP52 = X10_TEMP40;

int low1 = (X10_TEMP52.low());
final int X10_TEMP55 = (2);
final int X10_TEMP57 = 3;
final boolean X10_TEMP56 = X10_TEMP55>=X10_TEMP57;
if (X10_TEMP56) {
final String X10_TEMP58 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP59 = ", expected 3";
String X10_TEMP60 = X10_TEMP58 + X10_TEMP55;
X10_TEMP60 = X10_TEMP60 + X10_TEMP59;
throw new RuntimeException(X10_TEMP60);
}
final int X10_TEMP61 = 0;
final int X10_TEMP62 = 1;
final int X10_TEMP64 = X10_TEMP61 - X10_TEMP62;
region(:rank==1) X10_TEMP63 = (region(:rank==1))([X10_TEMP61:X10_TEMP64]);
final int X10_TEMP65 = 0;
final boolean X10_TEMP68 = X10_TEMP55 == X10_TEMP65;
final int X10_TEMP66 = 1;
final boolean X10_TEMP69 = X10_TEMP55 == X10_TEMP66;
final int X10_TEMP67 = 2;
final boolean X10_TEMP70 = X10_TEMP55 == X10_TEMP67;
for(point(:rank==3)[X10_TEMP71, X10_TEMP72, X10_TEMP73]:a_R) {
if(X10_TEMP68) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP71:X10_TEMP71];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
else {
 if(X10_TEMP69) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP72:X10_TEMP72];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
else {
 if(X10_TEMP70) {
final region(:rank==1) X10_TEMP74 = [X10_TEMP73:X10_TEMP73];
X10_TEMP63 = X10_TEMP63 || X10_TEMP74;
}
}
}
}
final region(:rank==1) X10_TEMP75 = X10_TEMP63;

int low2 = (X10_TEMP75.low());
final int X10_TEMP78 = (0);
final int X10_TEMP80 = 3;
final boolean X10_TEMP79 = X10_TEMP78>=X10_TEMP80;
if (X10_TEMP79) {
final String X10_TEMP81 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP82 = ", expected 3";
String X10_TEMP83 = X10_TEMP81 + X10_TEMP78;
X10_TEMP83 = X10_TEMP83 + X10_TEMP82;
throw new RuntimeException(X10_TEMP83);
}
final int X10_TEMP84 = 0;
final int X10_TEMP85 = 1;
final int X10_TEMP87 = X10_TEMP84 - X10_TEMP85;
region(:rank==1) X10_TEMP86 = (region(:rank==1))([X10_TEMP84:X10_TEMP87]);
final int X10_TEMP88 = 0;
final boolean X10_TEMP91 = X10_TEMP78 == X10_TEMP88;
final int X10_TEMP89 = 1;
final boolean X10_TEMP92 = X10_TEMP78 == X10_TEMP89;
final int X10_TEMP90 = 2;
final boolean X10_TEMP93 = X10_TEMP78 == X10_TEMP90;
for(point(:rank==3)[X10_TEMP94, X10_TEMP95, X10_TEMP96]:a_R) {
if(X10_TEMP91) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP94:X10_TEMP94];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
else {
 if(X10_TEMP92) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP95:X10_TEMP95];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
else {
 if(X10_TEMP93) {
final region(:rank==1) X10_TEMP97 = [X10_TEMP96:X10_TEMP96];
X10_TEMP86 = X10_TEMP86 || X10_TEMP97;
}
}
}
}
final region(:rank==1) X10_TEMP98 = X10_TEMP86;

int high0 = (X10_TEMP98.high());
final int X10_TEMP101 = (1);
final int X10_TEMP103 = 3;
final boolean X10_TEMP102 = X10_TEMP101>=X10_TEMP103;
if (X10_TEMP102) {
final String X10_TEMP104 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP105 = ", expected 3";
String X10_TEMP106 = X10_TEMP104 + X10_TEMP101;
X10_TEMP106 = X10_TEMP106 + X10_TEMP105;
throw new RuntimeException(X10_TEMP106);
}
final int X10_TEMP107 = 0;
final int X10_TEMP108 = 1;
final int X10_TEMP110 = X10_TEMP107 - X10_TEMP108;
region(:rank==1) X10_TEMP109 = (region(:rank==1))([X10_TEMP107:X10_TEMP110]);
final int X10_TEMP111 = 0;
final boolean X10_TEMP114 = X10_TEMP101 == X10_TEMP111;
final int X10_TEMP112 = 1;
final boolean X10_TEMP115 = X10_TEMP101 == X10_TEMP112;
final int X10_TEMP113 = 2;
final boolean X10_TEMP116 = X10_TEMP101 == X10_TEMP113;
for(point(:rank==3)[X10_TEMP117, X10_TEMP118, X10_TEMP119]:a_R) {
if(X10_TEMP114) {
final region(:rank==1) X10_TEMP120 = [X10_TEMP117:X10_TEMP117];
X10_TEMP109 = X10_TEMP109 || X10_TEMP120;
}
else {
 if(X10_TEMP115) {
final region(:rank==1) X10_TEMP120 = [X10_TEMP118:X10_TEMP118];
X10_TEMP109 = X10_TEMP109 || X10_TEMP120;
}
else {
 if(X10_TEMP116) {
final region(:rank==1) X10_TEMP120 = [X10_TEMP119:X10_TEMP119];
X10_TEMP109 = X10_TEMP109 || X10_TEMP120;
}
}
}
}
final region(:rank==1) X10_TEMP121 = X10_TEMP109;

int high1 = (X10_TEMP121.high());
final int X10_TEMP124 = (2);
final int X10_TEMP126 = 3;
final boolean X10_TEMP125 = X10_TEMP124>=X10_TEMP126;
if (X10_TEMP125) {
final String X10_TEMP127 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP128 = ", expected 3";
String X10_TEMP129 = X10_TEMP127 + X10_TEMP124;
X10_TEMP129 = X10_TEMP129 + X10_TEMP128;
throw new RuntimeException(X10_TEMP129);
}
final int X10_TEMP130 = 0;
final int X10_TEMP131 = 1;
final int X10_TEMP133 = X10_TEMP130 - X10_TEMP131;
region(:rank==1) X10_TEMP132 = (region(:rank==1))([X10_TEMP130:X10_TEMP133]);
final int X10_TEMP134 = 0;
final boolean X10_TEMP137 = X10_TEMP124 == X10_TEMP134;
final int X10_TEMP135 = 1;
final boolean X10_TEMP138 = X10_TEMP124 == X10_TEMP135;
final int X10_TEMP136 = 2;
final boolean X10_TEMP139 = X10_TEMP124 == X10_TEMP136;
for(point(:rank==3)[X10_TEMP140, X10_TEMP141, X10_TEMP142]:a_R) {
if(X10_TEMP137) {
final region(:rank==1) X10_TEMP143 = [X10_TEMP140:X10_TEMP140];
X10_TEMP132 = X10_TEMP132 || X10_TEMP143;
}
else {
 if(X10_TEMP138) {
final region(:rank==1) X10_TEMP143 = [X10_TEMP141:X10_TEMP141];
X10_TEMP132 = X10_TEMP132 || X10_TEMP143;
}
else {
 if(X10_TEMP139) {
final region(:rank==1) X10_TEMP143 = [X10_TEMP142:X10_TEMP142];
X10_TEMP132 = X10_TEMP132 || X10_TEMP143;
}
}
}
}
final region(:rank==1) X10_TEMP144 = X10_TEMP132;

int high2 = (X10_TEMP144.high());
int r = (3);
final boolean X10_TEMP148 = (i<=r);
final int X10_TEMP147 = (3);
final boolean X10_TEMP149 = (r==X10_TEMP147);

final boolean X10_TEMP151 = X10_TEMP148&&X10_TEMP149;
if (X10_TEMP151) {
if (IsHigh) {
final int X10_TEMP153 = (1);
final boolean X10_TEMP154 = i==X10_TEMP153;
final int X10_TEMP155 = (1);
int X10_TEMP158 = low0;
if(X10_TEMP154){
X10_TEMP158 = high0+X10_TEMP155;
}
final int X10_TEMP159 = X10_TEMP158;

final int X10_TEMP160 = (X10_TEMP159);
final int X10_TEMP171 = (X10_TEMP160-a_padSize0);
final int X10_TEMP162 = (1);
final boolean X10_TEMP163 = i==X10_TEMP162;
final int X10_TEMP164 = (1);
int X10_TEMP167 = high0;
if(X10_TEMP163){
X10_TEMP167 = high0+X10_TEMP164;
}
final int X10_TEMP168 = X10_TEMP167;

final int X10_TEMP169 = (X10_TEMP168);
final int X10_TEMP172 = (X10_TEMP169+a_padSize0);
final int X10_TEMP173 = (2);
final boolean X10_TEMP174 = i==X10_TEMP173;
final int X10_TEMP175 = (1);
int X10_TEMP178 = low1;
if(X10_TEMP174){
X10_TEMP178 = high1+X10_TEMP175;
}
final int X10_TEMP179 = X10_TEMP178;

final int X10_TEMP180 = (X10_TEMP179);
final int X10_TEMP191 = (X10_TEMP180-a_padSize1);
final int X10_TEMP182 = (2);
final boolean X10_TEMP183 = i==X10_TEMP182;
final int X10_TEMP184 = (1);
int X10_TEMP187 = high1;
if(X10_TEMP183){
X10_TEMP187 = high1+X10_TEMP184;
}
final int X10_TEMP188 = X10_TEMP187;

final int X10_TEMP189 = (X10_TEMP188);
final int X10_TEMP192 = (X10_TEMP189+a_padSize1);
final int X10_TEMP193 = (3);
final boolean X10_TEMP194 = i==X10_TEMP193;
final int X10_TEMP195 = (1);
int X10_TEMP198 = low2;
if(X10_TEMP194){
X10_TEMP198 = high2+X10_TEMP195;
}
final int X10_TEMP199 = X10_TEMP198;

final int X10_TEMP200 = (X10_TEMP199);
final int X10_TEMP211 = (X10_TEMP200-a_padSize2);
final int X10_TEMP202 = (3);
final boolean X10_TEMP203 = i==X10_TEMP202;
final int X10_TEMP204 = (1);
int X10_TEMP207 = high2;
if(X10_TEMP203){
X10_TEMP207 = high2+X10_TEMP204;
}
final int X10_TEMP208 = X10_TEMP207;

final int X10_TEMP209 = (X10_TEMP208);
final int X10_TEMP212 = (X10_TEMP209+a_padSize2);

final region(:rank==3) X10_TEMP214 = (region(:rank==3))([X10_TEMP171:X10_TEMP172,X10_TEMP191:X10_TEMP192,X10_TEMP211:X10_TEMP212]);
return X10_TEMP214;
}
else {
final int X10_TEMP215 = (1);
final boolean X10_TEMP216 = i==X10_TEMP215;
final int X10_TEMP217 = (1);
int X10_TEMP220 = low0;
if(X10_TEMP216){
X10_TEMP220 = low0-X10_TEMP217;
}
final int X10_TEMP221 = X10_TEMP220;

final int X10_TEMP222 = (X10_TEMP221);
final int X10_TEMP233 = (X10_TEMP222-a_padSize0);
final int X10_TEMP224 = (1);
final boolean X10_TEMP225 = i==X10_TEMP224;
final int X10_TEMP226 = (1);
int X10_TEMP229 = high0;
if(X10_TEMP225){
X10_TEMP229 = low0-X10_TEMP226;
}
final int X10_TEMP230 = X10_TEMP229;

final int X10_TEMP231 = (X10_TEMP230);
final int X10_TEMP234 = (X10_TEMP231+a_padSize0);
final int X10_TEMP235 = (2);
final boolean X10_TEMP236 = i==X10_TEMP235;
final int X10_TEMP237 = (1);
int X10_TEMP240 = low1;
if(X10_TEMP236){
X10_TEMP240 = low1-X10_TEMP237;
}
final int X10_TEMP241 = X10_TEMP240;

final int X10_TEMP242 = (X10_TEMP241);
final int X10_TEMP253 = (X10_TEMP242-a_padSize1);
final int X10_TEMP244 = (2);
final boolean X10_TEMP245 = i==X10_TEMP244;
final int X10_TEMP246 = (1);
int X10_TEMP249 = high1;
if(X10_TEMP245){
X10_TEMP249 = low1-X10_TEMP246;
}
final int X10_TEMP250 = X10_TEMP249;

final int X10_TEMP251 = (X10_TEMP250);
final int X10_TEMP254 = (X10_TEMP251+a_padSize1);
final int X10_TEMP255 = (3);
final boolean X10_TEMP256 = i==X10_TEMP255;
final int X10_TEMP257 = (1);
int X10_TEMP260 = low2;
if(X10_TEMP256){
X10_TEMP260 = low2-X10_TEMP257;
}
final int X10_TEMP261 = X10_TEMP260;

final int X10_TEMP262 = (X10_TEMP261);
final int X10_TEMP273 = (X10_TEMP262-a_padSize2);
final int X10_TEMP264 = (3);
final boolean X10_TEMP265 = i==X10_TEMP264;
final int X10_TEMP266 = (1);
int X10_TEMP269 = high2;
if(X10_TEMP265){
X10_TEMP269 = low2-X10_TEMP266;
}
final int X10_TEMP270 = X10_TEMP269;

final int X10_TEMP271 = (X10_TEMP270);
final int X10_TEMP274 = (X10_TEMP271+a_padSize2);

final region(:rank==3) X10_TEMP276 = (region(:rank==3))([X10_TEMP233:X10_TEMP234,X10_TEMP253:X10_TEMP254,X10_TEMP273:X10_TEMP274]);
return X10_TEMP276;
}
}
else {
final String X10_TEMP278 = ("MG3TongValue1.boundary():Warning! invalid inputs!");
System.out.println(X10_TEMP278);
final int X10_TEMP283 = (0);
final int X10_TEMP280 = (1);
final int X10_TEMP281 = 0;
final int X10_TEMP284 = (X10_TEMP281 - X10_TEMP280);
final int X10_TEMP289 = (0);
final int X10_TEMP286 = (1);
final int X10_TEMP287 = 0;
final int X10_TEMP290 = (X10_TEMP287 - X10_TEMP286);
final int X10_TEMP295 = (0);
final int X10_TEMP292 = (1);
final int X10_TEMP293 = 0;
final int X10_TEMP296 = (X10_TEMP293 - X10_TEMP292);

final region(:rank==3) X10_TEMP298 = (region(:rank==3))([X10_TEMP283:X10_TEMP284,X10_TEMP289:X10_TEMP290,X10_TEMP295:X10_TEMP296]);
return X10_TEMP298;
}
}
public static void Util_arraycopy3(final double [:rank==3] a_dest, final region(:rank==3) a_destR, final double [:rank==3] a_src) {
for(point(:rank==3)p:a_destR) {
final place h = (here);
final dist(:rank==3) X10_TEMP3 = (dist(:rank==3))(a_src.distribution);

final place X10_TEMP6 = X10_TEMP3.get(p);
async(X10_TEMP6) {
final double d = (a_src[p]);
async(h) {
final double X10_TEMP13 = (d);
a_dest[p] = (X10_TEMP13);
}
}
}
}
public static void Util_arraycopy4(final double [:rank==3] a_dest, final region(:rank==3) a_destR, final double [:rank==3] a_src, final int a_trans0, final int a_trans1, final int a_trans2) {
for(point(:rank==3)p:a_destR) {
final place h = (here);
final dist(:rank==3) X10_TEMP3 = (dist(:rank==3))(a_src.distribution);
point(:rank==3) X10_TEMP8 = (p+[a_trans0,a_trans1,a_trans2]);

final place X10_TEMP10 = X10_TEMP3.get(X10_TEMP8);
async(X10_TEMP10) {
final point(:rank==3) X10_TEMP15 = (p+[a_trans0,a_trans1,a_trans2]);

final double d = (a_src[X10_TEMP15]);
async(h) {
final double X10_TEMP21 = (d);
a_dest[p] = (X10_TEMP21);
}
}
}
}
public static String Wrapper_toString(final Wrapper X10_TEMP0) {
final String X10_TEMP2 = ("");
return X10_TEMP2;
}
public static double doublerefArraySum1(final double[:rank==1] sumArray) {
	final int maxPlaces = place.MAX_PLACES;
	final int one = 1;
	final int zero = 0;
	final int maxPlacesMinusOne = maxPlaces-one;
	final region(:rank==1) dReg = (region(:rank==1))([zero:maxPlacesMinusOne]);
	final place source = here;
	final dist(:rank==1) dSum = (dist(:rank==1))(dReg->source);
	final double initVal = 0;
	final double[:rank==1] localSumArray = (double[:rank==1])(new double[dSum](point(:rank==1)p) {return initVal;});
	final dist(:rank==1) dUnique = (dist(:rank==1))(dist.UNIQUE);
	finish {
		for(point(:rank==1)p : dUnique) {
			final place nthPlace = dUnique.get(p);
			async(nthPlace) {
				double localSumTemp = 0;
				final place thisPlace = here;
				final dist(:rank==1) sumArrayDist = (dist(:rank==1))(sumArray.distribution);
				final dist(:rank==1) sumArrayDistHere = (dist(:rank==1))(sumArrayDist|thisPlace);
				for(point(:rank==1)pt:sumArrayDistHere) {
					final double localSumCurr = sumArray[pt];
					localSumTemp = localSumTemp + localSumCurr;
				}
				final boolean isNotEqual = localSumTemp!=zero;
				if (isNotEqual) {
					final int index = thisPlace.id;
					final double localSum = localSumTemp;
					async(source) {
						localSumArray[index] = (localSum);
					}
				}
			}
		}
	}
	double globalSum = 0;
	for(point(:rank==1)p:localSumArray) {
		final double localSumCurr = localSumArray[p];
		globalSum = globalSum + localSumCurr;
	}
	return globalSum;
}

}

value LevelData {
public final boolean EXCHANGE_After;
public final int SIZE;
public final region(:rank==3) P_DOMAIN;
public final boolean ISPARALLEL;
public final region(:rank==3) [:rank==1] m_regions;
public final region(:rank==3) [:rank==1] m_REGIONs;
public final region(:rank==3) [:rank==2] m_boundaries;
public final dist(:rank==1) m_places;
public final int m_numPlaces;
public final region(:rank==3) m_placeGrid;
public final int m_size0;
public final int m_size1;
public final int m_size2;
public final int m_block0;
public final int m_block1;
public final int m_block2;
public final dist(:rank==3) [:rank==1] m_dist;
public final dist(:rank==3) [:rank==1] m_DIST;
public final Wrapper [:rank==1] m_u;


public LevelData(final int a_problemDomainSize, final boolean a_isParallel) {
final dist(:rank==1) X10_TEMP1 = (dist(:rank==1))(dist.UNIQUE);

final dist(:rank==1) ALLPLACES = (dist(:rank==1))(X10_TEMP1);
final boolean X10_TEMP4 = Program._Util_OVERLAP_COMMANDCOMP;
if (X10_TEMP4) {
final boolean X10_TEMP6 = (false);
EXCHANGE_After = (X10_TEMP6);
}
else {
final boolean X10_TEMP8 = (Program._Util_EXCHANGE_AFTER);
EXCHANGE_After = (X10_TEMP8);
}
SIZE = (a_problemDomainSize);
ISPARALLEL = (a_isParallel);
final int X10_TEMP14 = (0);
final int X10_TEMP12 = (1);
final int X10_TEMP15 = (a_problemDomainSize-X10_TEMP12);
final int X10_TEMP19 = (0);
final int X10_TEMP17 = (1);
final int X10_TEMP20 = (a_problemDomainSize-X10_TEMP17);
final int X10_TEMP24 = (0);
final int X10_TEMP22 = (1);
final int X10_TEMP25 = (a_problemDomainSize-X10_TEMP22);

final region(:rank==3) temp_P_DOMAIN = (region(:rank==3))([X10_TEMP14:X10_TEMP15,X10_TEMP19:X10_TEMP20,X10_TEMP24:X10_TEMP25]);
P_DOMAIN = (region(:rank==3))(temp_P_DOMAIN);
int numCuts = (0);
int temp_m_numPlaces = (0);
if (a_isParallel) {
m_places = (dist(:rank==1))(ALLPLACES);
final int X10_TEMP33 = (Program._LevelData_N_PLACES);
temp_m_numPlaces = (X10_TEMP33);
final int X10_TEMP35 = (Program._LevelData_N_PLACES);

final int X10_TEMP37 = (Program.Util_log2(X10_TEMP35));
numCuts = (X10_TEMP37);
}
else {
final int X10_TEMP40 = (0);
final int X10_TEMP41 = (0);
final region(:rank==1) X10_TEMP44 = (region(:rank==1))([X10_TEMP40:X10_TEMP41]);
int X10_TEMP43 = (0);
final place X10_TEMP45 = (ALLPLACES.get(X10_TEMP43));

final dist(:rank==1) X10_TEMP47 = (dist(:rank==1))(X10_TEMP44->X10_TEMP45);
m_places = (dist(:rank==1))(X10_TEMP47);
final int X10_TEMP49 = (1);
temp_m_numPlaces = (X10_TEMP49);
final int X10_TEMP51 = (0);
numCuts = (X10_TEMP51);
}
m_numPlaces = (temp_m_numPlaces);
final int X10_TEMP55 = (0);
final region(:rank==1) X10_TEMP56 = (region(:rank==1))([X10_TEMP55:temp_m_numPlaces]);
final place X10_TEMP57 = (here);

dist(:rank==1) d = (dist(:rank==1))(X10_TEMP56->X10_TEMP57);
final int X10_TEMP61 = (0);
final int X10_TEMP62 = (5);
final int X10_TEMP66 = (0);
final int X10_TEMP64 = (1);
final int X10_TEMP67 = (temp_m_numPlaces-X10_TEMP64);
final region(:rank==2) X10_TEMP68 = (region(:rank==2))([X10_TEMP61:X10_TEMP62,X10_TEMP66:X10_TEMP67]);
final place X10_TEMP69 = (here);

dist(:rank==2) di = (dist(:rank==2))(X10_TEMP68->X10_TEMP69);
final dist(:rank==3)[:rank==1] X10_TEMP73 = (dist(:rank==3)[:rank==1])(this.LevelData_getDist3Array(d));

final dist(:rank==3)[:rank==1] temp_m_dist = (dist(:rank==3)[:rank==1])(X10_TEMP73);
m_dist = (dist(:rank==3)[:rank==1])(temp_m_dist);
final dist(:rank==3)[:rank==1] X10_TEMP78 = (dist(:rank==3)[:rank==1])(this.LevelData_getDist3Array(d));

final dist(:rank==3)[:rank==1] temp_m_DIST = (dist(:rank==3)[:rank==1])(X10_TEMP78);
m_DIST = (dist(:rank==3)[:rank==1])(temp_m_DIST);
final int X10_TEMP82 = (0);
final int X10_TEMP84 = 3;
final boolean X10_TEMP83 = X10_TEMP82>=X10_TEMP84;
if (X10_TEMP83) {
final String X10_TEMP85 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP86 = ", expected 3";
String X10_TEMP87 = X10_TEMP85 + X10_TEMP82;
X10_TEMP87 = X10_TEMP87 + X10_TEMP86;
throw new RuntimeException(X10_TEMP87);
}
final int X10_TEMP88 = 0;
final int X10_TEMP89 = 1;
final int X10_TEMP91 = X10_TEMP88 - X10_TEMP89;
region(:rank==1) X10_TEMP90 = (region(:rank==1))([X10_TEMP88:X10_TEMP91]);
final int X10_TEMP92 = 0;
final boolean X10_TEMP95 = X10_TEMP82 == X10_TEMP92;
final int X10_TEMP93 = 1;
final boolean X10_TEMP96 = X10_TEMP82 == X10_TEMP93;
final int X10_TEMP94 = 2;
final boolean X10_TEMP97 = X10_TEMP82 == X10_TEMP94;
for(point(:rank==3)[X10_TEMP98, X10_TEMP99, X10_TEMP100]:temp_P_DOMAIN) {
if(X10_TEMP95) {
final region(:rank==1) X10_TEMP101 = [X10_TEMP98:X10_TEMP98];
X10_TEMP90 = X10_TEMP90 || X10_TEMP101;
}
else {
 if(X10_TEMP96) {
final region(:rank==1) X10_TEMP101 = [X10_TEMP99:X10_TEMP99];
X10_TEMP90 = X10_TEMP90 || X10_TEMP101;
}
else {
 if(X10_TEMP97) {
final region(:rank==1) X10_TEMP101 = [X10_TEMP100:X10_TEMP100];
X10_TEMP90 = X10_TEMP90 || X10_TEMP101;
}
}
}
}
final region(:rank==1) X10_TEMP102 = X10_TEMP90;

final int m_low0 = (X10_TEMP102.low());
final int X10_TEMP105 = (1);
final int X10_TEMP107 = 3;
final boolean X10_TEMP106 = X10_TEMP105>=X10_TEMP107;
if (X10_TEMP106) {
final String X10_TEMP108 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP109 = ", expected 3";
String X10_TEMP110 = X10_TEMP108 + X10_TEMP105;
X10_TEMP110 = X10_TEMP110 + X10_TEMP109;
throw new RuntimeException(X10_TEMP110);
}
final int X10_TEMP111 = 0;
final int X10_TEMP112 = 1;
final int X10_TEMP114 = X10_TEMP111 - X10_TEMP112;
region(:rank==1) X10_TEMP113 = (region(:rank==1))([X10_TEMP111:X10_TEMP114]);
final int X10_TEMP115 = 0;
final boolean X10_TEMP118 = X10_TEMP105 == X10_TEMP115;
final int X10_TEMP116 = 1;
final boolean X10_TEMP119 = X10_TEMP105 == X10_TEMP116;
final int X10_TEMP117 = 2;
final boolean X10_TEMP120 = X10_TEMP105 == X10_TEMP117;
for(point(:rank==3)[X10_TEMP121, X10_TEMP122, X10_TEMP123]:temp_P_DOMAIN) {
if(X10_TEMP118) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP121:X10_TEMP121];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
else {
 if(X10_TEMP119) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP122:X10_TEMP122];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
else {
 if(X10_TEMP120) {
final region(:rank==1) X10_TEMP124 = [X10_TEMP123:X10_TEMP123];
X10_TEMP113 = X10_TEMP113 || X10_TEMP124;
}
}
}
}
final region(:rank==1) X10_TEMP125 = X10_TEMP113;

final int m_low1 = (X10_TEMP125.low());
final int X10_TEMP128 = (2);
final int X10_TEMP130 = 3;
final boolean X10_TEMP129 = X10_TEMP128>=X10_TEMP130;
if (X10_TEMP129) {
final String X10_TEMP131 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP132 = ", expected 3";
String X10_TEMP133 = X10_TEMP131 + X10_TEMP128;
X10_TEMP133 = X10_TEMP133 + X10_TEMP132;
throw new RuntimeException(X10_TEMP133);
}
final int X10_TEMP134 = 0;
final int X10_TEMP135 = 1;
final int X10_TEMP137 = X10_TEMP134 - X10_TEMP135;
region(:rank==1) X10_TEMP136 = (region(:rank==1))([X10_TEMP134:X10_TEMP137]);
final int X10_TEMP138 = 0;
final boolean X10_TEMP141 = X10_TEMP128 == X10_TEMP138;
final int X10_TEMP139 = 1;
final boolean X10_TEMP142 = X10_TEMP128 == X10_TEMP139;
final int X10_TEMP140 = 2;
final boolean X10_TEMP143 = X10_TEMP128 == X10_TEMP140;
for(point(:rank==3)[X10_TEMP144, X10_TEMP145, X10_TEMP146]:temp_P_DOMAIN) {
if(X10_TEMP141) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP144:X10_TEMP144];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
else {
 if(X10_TEMP142) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP145:X10_TEMP145];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
else {
 if(X10_TEMP143) {
final region(:rank==1) X10_TEMP147 = [X10_TEMP146:X10_TEMP146];
X10_TEMP136 = X10_TEMP136 || X10_TEMP147;
}
}
}
}
final region(:rank==1) X10_TEMP148 = X10_TEMP136;

final int m_low2 = (X10_TEMP148.low());
final int X10_TEMP151 = (0);
final int X10_TEMP153 = 3;
final boolean X10_TEMP152 = X10_TEMP151>=X10_TEMP153;
if (X10_TEMP152) {
final String X10_TEMP154 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP155 = ", expected 3";
String X10_TEMP156 = X10_TEMP154 + X10_TEMP151;
X10_TEMP156 = X10_TEMP156 + X10_TEMP155;
throw new RuntimeException(X10_TEMP156);
}
final int X10_TEMP157 = 0;
final int X10_TEMP158 = 1;
final int X10_TEMP160 = X10_TEMP157 - X10_TEMP158;
region(:rank==1) X10_TEMP159 = (region(:rank==1))([X10_TEMP157:X10_TEMP160]);
final int X10_TEMP161 = 0;
final boolean X10_TEMP164 = X10_TEMP151 == X10_TEMP161;
final int X10_TEMP162 = 1;
final boolean X10_TEMP165 = X10_TEMP151 == X10_TEMP162;
final int X10_TEMP163 = 2;
final boolean X10_TEMP166 = X10_TEMP151 == X10_TEMP163;
for(point(:rank==3)[X10_TEMP167, X10_TEMP168, X10_TEMP169]:temp_P_DOMAIN) {
if(X10_TEMP164) {
final region(:rank==1) X10_TEMP170 = [X10_TEMP167:X10_TEMP167];
X10_TEMP159 = X10_TEMP159 || X10_TEMP170;
}
else {
 if(X10_TEMP165) {
final region(:rank==1) X10_TEMP170 = [X10_TEMP168:X10_TEMP168];
X10_TEMP159 = X10_TEMP159 || X10_TEMP170;
}
else {
 if(X10_TEMP166) {
final region(:rank==1) X10_TEMP170 = [X10_TEMP169:X10_TEMP169];
X10_TEMP159 = X10_TEMP159 || X10_TEMP170;
}
}
}
}
final region(:rank==1) X10_TEMP171 = X10_TEMP159;

final int m_hi0 = (X10_TEMP171.high());
final int X10_TEMP174 = (1);
final int X10_TEMP176 = 3;
final boolean X10_TEMP175 = X10_TEMP174>=X10_TEMP176;
if (X10_TEMP175) {
final String X10_TEMP177 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP178 = ", expected 3";
String X10_TEMP179 = X10_TEMP177 + X10_TEMP174;
X10_TEMP179 = X10_TEMP179 + X10_TEMP178;
throw new RuntimeException(X10_TEMP179);
}
final int X10_TEMP180 = 0;
final int X10_TEMP181 = 1;
final int X10_TEMP183 = X10_TEMP180 - X10_TEMP181;
region(:rank==1) X10_TEMP182 = (region(:rank==1))([X10_TEMP180:X10_TEMP183]);
final int X10_TEMP184 = 0;
final boolean X10_TEMP187 = X10_TEMP174 == X10_TEMP184;
final int X10_TEMP185 = 1;
final boolean X10_TEMP188 = X10_TEMP174 == X10_TEMP185;
final int X10_TEMP186 = 2;
final boolean X10_TEMP189 = X10_TEMP174 == X10_TEMP186;
for(point(:rank==3)[X10_TEMP190, X10_TEMP191, X10_TEMP192]:temp_P_DOMAIN) {
if(X10_TEMP187) {
final region(:rank==1) X10_TEMP193 = [X10_TEMP190:X10_TEMP190];
X10_TEMP182 = X10_TEMP182 || X10_TEMP193;
}
else {
 if(X10_TEMP188) {
final region(:rank==1) X10_TEMP193 = [X10_TEMP191:X10_TEMP191];
X10_TEMP182 = X10_TEMP182 || X10_TEMP193;
}
else {
 if(X10_TEMP189) {
final region(:rank==1) X10_TEMP193 = [X10_TEMP192:X10_TEMP192];
X10_TEMP182 = X10_TEMP182 || X10_TEMP193;
}
}
}
}
final region(:rank==1) X10_TEMP194 = X10_TEMP182;

final int m_hi1 = (X10_TEMP194.high());
final int X10_TEMP197 = (2);
final int X10_TEMP199 = 3;
final boolean X10_TEMP198 = X10_TEMP197>=X10_TEMP199;
if (X10_TEMP198) {
final String X10_TEMP200 = "Invalid dimension for rank projection. Got ";
final String X10_TEMP201 = ", expected 3";
String X10_TEMP202 = X10_TEMP200 + X10_TEMP197;
X10_TEMP202 = X10_TEMP202 + X10_TEMP201;
throw new RuntimeException(X10_TEMP202);
}
final int X10_TEMP203 = 0;
final int X10_TEMP204 = 1;
final int X10_TEMP206 = X10_TEMP203 - X10_TEMP204;
region(:rank==1) X10_TEMP205 = (region(:rank==1))([X10_TEMP203:X10_TEMP206]);
final int X10_TEMP207 = 0;
final boolean X10_TEMP210 = X10_TEMP197 == X10_TEMP207;
final int X10_TEMP208 = 1;
final boolean X10_TEMP211 = X10_TEMP197 == X10_TEMP208;
final int X10_TEMP209 = 2;
final boolean X10_TEMP212 = X10_TEMP197 == X10_TEMP209;
for(point(:rank==3)[X10_TEMP213, X10_TEMP214, X10_TEMP215]:temp_P_DOMAIN) {
if(X10_TEMP210) {
final region(:rank==1) X10_TEMP216 = [X10_TEMP213:X10_TEMP213];
X10_TEMP205 = X10_TEMP205 || X10_TEMP216;
}
else {
 if(X10_TEMP211) {
final region(:rank==1) X10_TEMP216 = [X10_TEMP214:X10_TEMP214];
X10_TEMP205 = X10_TEMP205 || X10_TEMP216;
}
else {
 if(X10_TEMP212) {
final region(:rank==1) X10_TEMP216 = [X10_TEMP215:X10_TEMP215];
X10_TEMP205 = X10_TEMP205 || X10_TEMP216;
}
}
}
}
final region(:rank==1) X10_TEMP217 = X10_TEMP205;

final int m_hi2 = (X10_TEMP217.high());
final int X10_TEMP219 = (m_hi0-m_low0);
final int X10_TEMP220 = (1);

final int temp_m_size0 = (X10_TEMP219+X10_TEMP220);
final int X10_TEMP222 = (m_hi1-m_low1);
final int X10_TEMP223 = (1);

final int temp_m_size1 = (X10_TEMP222+X10_TEMP223);
final int X10_TEMP225 = (m_hi2-m_low2);
final int X10_TEMP226 = (1);

final int temp_m_size2 = (X10_TEMP225+X10_TEMP226);
m_size0 = (temp_m_size0);
m_size1 = (temp_m_size1);
m_size2 = (temp_m_size2);
final int X10_TEMP231 = (3);

int a = (numCuts/X10_TEMP231);
final int X10_TEMP233 = (3);

int b = (numCuts%X10_TEMP233);
final int X10_TEMP235 = (0);
final boolean X10_TEMP236 = b>X10_TEMP235;
int X10_TEMP239 = 0;
if(X10_TEMP236){
X10_TEMP239 = 1;
}
final int X10_TEMP240 = X10_TEMP239;

final int X10_TEMP241 = (X10_TEMP240);

final int m_cut0 = (a+X10_TEMP241);
final int X10_TEMP243 = (1);
final boolean X10_TEMP244 = b>X10_TEMP243;
int X10_TEMP247 = 0;
if(X10_TEMP244){
X10_TEMP247 = 1;
}
final int X10_TEMP248 = X10_TEMP247;

final int X10_TEMP249 = (X10_TEMP248);

final int m_cut1 = (a+X10_TEMP249);
final int m_cut2 = (a);
final int pow2_m_cut0 = (Program.Util_pow2(m_cut0));
final int pow2_m_cut1 = (Program.Util_pow2(m_cut1));
final int pow2_m_cut2 = (Program.Util_pow2(m_cut2));
m_block0 = (pow2_m_cut0);
m_block1 = (pow2_m_cut1);
m_block2 = (pow2_m_cut2);
final int m_blockSize0 = (temp_m_size0/pow2_m_cut0);
final int m_blockSize1 = (temp_m_size1/pow2_m_cut1);
final int m_blockSize2 = (temp_m_size2/pow2_m_cut2);
final int X10_TEMP267 = (0);
final int X10_TEMP265 = (1);
final int X10_TEMP268 = (pow2_m_cut0-X10_TEMP265);
final int X10_TEMP272 = (0);
final int X10_TEMP270 = (1);
final int X10_TEMP273 = (pow2_m_cut1-X10_TEMP270);
final int X10_TEMP277 = (0);
final int X10_TEMP275 = (1);
final int X10_TEMP278 = (pow2_m_cut2-X10_TEMP275);

final region(:rank==3) temp_m_placeGrid = (region(:rank==3))([X10_TEMP267:X10_TEMP268,X10_TEMP272:X10_TEMP273,X10_TEMP277:X10_TEMP278]);
m_placeGrid = (region(:rank==3))(temp_m_placeGrid);
int i = (0);
final region(:rank==3)[:rank==1] X10_TEMP284 = (region(:rank==3)[:rank==1])(this.LevelData_getRegion3Array1(d));

region(:rank==3)[:rank==1] m_reg = (region(:rank==3)[:rank==1])(X10_TEMP284);
final region(:rank==3)[:rank==1] X10_TEMP288 = (region(:rank==3)[:rank==1])(this.LevelData_getRegion3Array1(d));

region(:rank==3)[:rank==1] m_REG = (region(:rank==3)[:rank==1])(X10_TEMP288);
for(point(:rank==3)[x,y,z]:temp_m_placeGrid) {
final int X10_TEMP291 = (m_blockSize0*x);

final int mrl0 = (X10_TEMP291+m_low0);
final int X10_TEMP293 = (m_blockSize1*y);

final int mrl1 = (X10_TEMP293+m_low1);
final int X10_TEMP295 = (m_blockSize2*z);

final int mrl2 = (X10_TEMP295+m_low2);
final int X10_TEMP297 = (1);

final int X10_TEMP299 = (x+X10_TEMP297);
final int X10_TEMP300 = (m_blockSize0*X10_TEMP299);

final int mrh0 = (X10_TEMP300+m_low0);
final int X10_TEMP302 = (1);

final int X10_TEMP304 = (y+X10_TEMP302);
final int X10_TEMP305 = (m_blockSize1*X10_TEMP304);

final int mrh1 = (X10_TEMP305+m_low1);
final int X10_TEMP307 = (1);

final int X10_TEMP309 = (z+X10_TEMP307);
final int X10_TEMP310 = (m_blockSize2*X10_TEMP309);

final int mrh2 = (X10_TEMP310+m_low2);
final int X10_TEMP314 = (1);
final int X10_TEMP316 = (mrh0-X10_TEMP314);
final int X10_TEMP318 = (1);
final int X10_TEMP320 = (mrh1-X10_TEMP318);
final int X10_TEMP322 = (1);
final int X10_TEMP324 = (mrh2-X10_TEMP322);

final region(:rank==3) X10_TEMP327 = (region(:rank==3))([mrl0:X10_TEMP316,mrl1:X10_TEMP320,mrl2:X10_TEMP324]);
final region(:rank==3) X10_TEMP328 = (region(:rank==3))(X10_TEMP327);
m_reg[i] = (X10_TEMP328);
final int X10_TEMP330 = (1);
final int X10_TEMP333 = (mrl0-X10_TEMP330);
final int X10_TEMP334 = (1);
final int X10_TEMP337 = (mrl1-X10_TEMP334);
final int X10_TEMP338 = (1);
final int X10_TEMP341 = (mrl2-X10_TEMP338);

final region(:rank==3) X10_TEMP344 = (region(:rank==3))([X10_TEMP333:mrh0,X10_TEMP337:mrh1,X10_TEMP341:mrh2]);
final region(:rank==3) X10_TEMP345 = (region(:rank==3))(X10_TEMP344);
m_REG[i] = (X10_TEMP345);
final int X10_TEMP348 = (1);
final int X10_TEMP350 = (mrh0-X10_TEMP348);
final int X10_TEMP352 = (1);
final int X10_TEMP354 = (mrh1-X10_TEMP352);
final int X10_TEMP356 = (1);
final int X10_TEMP358 = (mrh2-X10_TEMP356);
final region(:rank==3) X10_TEMP360 = (region(:rank==3))([mrl0:X10_TEMP350,mrl1:X10_TEMP354,mrl2:X10_TEMP358]);
final place X10_TEMP361 = (place.places(i));

final dist(:rank==3) X10_TEMP364 = (dist(:rank==3))(X10_TEMP360->X10_TEMP361);
final dist(:rank==3) X10_TEMP365 = (dist(:rank==3))(X10_TEMP364);
temp_m_dist[i] = (X10_TEMP365);
final int X10_TEMP367 = (1);
final int X10_TEMP370 = (mrl0-X10_TEMP367);
final int X10_TEMP371 = (1);
final int X10_TEMP374 = (mrl1-X10_TEMP371);
final int X10_TEMP375 = (1);
final int X10_TEMP378 = (mrl2-X10_TEMP375);
final region(:rank==3) X10_TEMP380 = (region(:rank==3))([X10_TEMP370:mrh0,X10_TEMP374:mrh1,X10_TEMP378:mrh2]);
final place X10_TEMP381 = (place.places(i));

final dist(:rank==3) X10_TEMP384 = (dist(:rank==3))(X10_TEMP380->X10_TEMP381);
final dist(:rank==3) X10_TEMP385 = (dist(:rank==3))(X10_TEMP384);
temp_m_DIST[i] = (X10_TEMP385);
final int X10_TEMP386 = (i);
final int X10_TEMP387 = 1;
i = i + X10_TEMP387;

}
m_regions = (region(:rank==3)[:rank==1])(m_reg);
m_REGIONs = (region(:rank==3)[:rank==1])(m_REG);
final region(:rank==3)[:rank==2] X10_TEMP392 = (region(:rank==3)[:rank==2])(this.LevelData_getRegion3Array2(di));

region(:rank==3)[:rank==2] temp_m_boundaries = (region(:rank==3)[:rank==2])(X10_TEMP392);
for(point(:rank==2)[j,ii]:di) {
final int X10_TEMP395 = (0);

final boolean X10_TEMP397 = j==X10_TEMP395;
if (X10_TEMP397) {
final region(:rank==3) X10_TEMP401 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP403 = (0);
final int X10_TEMP404 = (1);

final int X10_TEMP406 = (X10_TEMP403+X10_TEMP404);
final int X10_TEMP407 = 0;

final int X10_TEMP428 = (X10_TEMP407 - X10_TEMP406);
final int X10_TEMP409 = (0);
final int X10_TEMP410 = (0);
final boolean X10_TEMP411 = X10_TEMP409>X10_TEMP410;
int X10_TEMP414 = 0;
if(X10_TEMP411){
X10_TEMP414 = 1;
}
final int X10_TEMP415 = X10_TEMP414;

final int X10_TEMP416 = (X10_TEMP415);

final int X10_TEMP418 = (0);
final int X10_TEMP419 = (1);
final boolean X10_TEMP420 = X10_TEMP418>X10_TEMP419;
int X10_TEMP423 = 0;
if(X10_TEMP420){
X10_TEMP423 = 1;
}
final int X10_TEMP424 = X10_TEMP423;

final int X10_TEMP425 = (X10_TEMP424);

final int X10_TEMP429 = (0);

final region(:rank==3) X10_TEMP432 = (region(:rank==3))(Program.Util_boundary(X10_TEMP401,X10_TEMP428,X10_TEMP416,X10_TEMP425,X10_TEMP429));
final region(:rank==3) X10_TEMP433 = (region(:rank==3))(X10_TEMP432);
temp_m_boundaries[j,ii] = (X10_TEMP433);
}
final int X10_TEMP434 = (2);

final boolean X10_TEMP436 = j==X10_TEMP434;
if (X10_TEMP436) {
final region(:rank==3) X10_TEMP440 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP442 = (1);
final int X10_TEMP443 = (1);

final int X10_TEMP445 = (X10_TEMP442+X10_TEMP443);
final int X10_TEMP446 = 0;

final int X10_TEMP467 = (X10_TEMP446 - X10_TEMP445);
final int X10_TEMP448 = (1);
final int X10_TEMP449 = (0);
final boolean X10_TEMP450 = X10_TEMP448>X10_TEMP449;
int X10_TEMP453 = 0;
if(X10_TEMP450){
X10_TEMP453 = 1;
}
final int X10_TEMP454 = X10_TEMP453;

final int X10_TEMP455 = (X10_TEMP454);

final int X10_TEMP457 = (1);
final int X10_TEMP458 = (1);
final boolean X10_TEMP459 = X10_TEMP457>X10_TEMP458;
int X10_TEMP462 = 0;
if(X10_TEMP459){
X10_TEMP462 = 1;
}
final int X10_TEMP463 = X10_TEMP462;

final int X10_TEMP464 = (X10_TEMP463);

final int X10_TEMP468 = (0);

final region(:rank==3) X10_TEMP471 = (region(:rank==3))(Program.Util_boundary(X10_TEMP440,X10_TEMP467,X10_TEMP455,X10_TEMP464,X10_TEMP468));
final region(:rank==3) X10_TEMP472 = (region(:rank==3))(X10_TEMP471);
temp_m_boundaries[j,ii] = (X10_TEMP472);
}
final int X10_TEMP473 = (4);

final boolean X10_TEMP475 = j==X10_TEMP473;
if (X10_TEMP475) {
final region(:rank==3) X10_TEMP479 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP481 = (2);
final int X10_TEMP482 = (1);

final int X10_TEMP484 = (X10_TEMP481+X10_TEMP482);
final int X10_TEMP485 = 0;

final int X10_TEMP506 = (X10_TEMP485 - X10_TEMP484);
final int X10_TEMP487 = (2);
final int X10_TEMP488 = (0);
final boolean X10_TEMP489 = X10_TEMP487>X10_TEMP488;
int X10_TEMP492 = 0;
if(X10_TEMP489){
X10_TEMP492 = 1;
}
final int X10_TEMP493 = X10_TEMP492;

final int X10_TEMP494 = (X10_TEMP493);

final int X10_TEMP496 = (2);
final int X10_TEMP497 = (1);
final boolean X10_TEMP498 = X10_TEMP496>X10_TEMP497;
int X10_TEMP501 = 0;
if(X10_TEMP498){
X10_TEMP501 = 1;
}
final int X10_TEMP502 = X10_TEMP501;

final int X10_TEMP503 = (X10_TEMP502);

final int X10_TEMP507 = (0);

final region(:rank==3) X10_TEMP510 = (region(:rank==3))(Program.Util_boundary(X10_TEMP479,X10_TEMP506,X10_TEMP494,X10_TEMP503,X10_TEMP507));
final region(:rank==3) X10_TEMP511 = (region(:rank==3))(X10_TEMP510);
temp_m_boundaries[j,ii] = (X10_TEMP511);
}
final int X10_TEMP512 = (1);

final boolean X10_TEMP514 = j==X10_TEMP512;
if (X10_TEMP514) {
final region(:rank==3) X10_TEMP518 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP520 = (0);
final int X10_TEMP521 = (1);

final int X10_TEMP523 = (X10_TEMP520+X10_TEMP521);

final int X10_TEMP525 = (0);
final int X10_TEMP526 = (0);
final boolean X10_TEMP527 = X10_TEMP525>X10_TEMP526;
int X10_TEMP530 = 0;
if(X10_TEMP527){
X10_TEMP530 = 1;
}
final int X10_TEMP531 = X10_TEMP530;

final int X10_TEMP532 = (X10_TEMP531);

final int X10_TEMP534 = (0);
final int X10_TEMP535 = (1);
final boolean X10_TEMP536 = X10_TEMP534>X10_TEMP535;
int X10_TEMP539 = 0;
if(X10_TEMP536){
X10_TEMP539 = 1;
}
final int X10_TEMP540 = X10_TEMP539;

final int X10_TEMP541 = (X10_TEMP540);

final int X10_TEMP544 = (0);

final region(:rank==3) X10_TEMP547 = (region(:rank==3))(Program.Util_boundary(X10_TEMP518,X10_TEMP523,X10_TEMP532,X10_TEMP541,X10_TEMP544));
final region(:rank==3) X10_TEMP548 = (region(:rank==3))(X10_TEMP547);
temp_m_boundaries[j,ii] = (X10_TEMP548);
}
final int X10_TEMP549 = (3);

final boolean X10_TEMP551 = j==X10_TEMP549;
if (X10_TEMP551) {
final region(:rank==3) X10_TEMP555 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP557 = (1);
final int X10_TEMP558 = (1);

final int X10_TEMP560 = (X10_TEMP557+X10_TEMP558);

final int X10_TEMP562 = (1);
final int X10_TEMP563 = (0);
final boolean X10_TEMP564 = X10_TEMP562>X10_TEMP563;
int X10_TEMP567 = 0;
if(X10_TEMP564){
X10_TEMP567 = 1;
}
final int X10_TEMP568 = X10_TEMP567;

final int X10_TEMP569 = (X10_TEMP568);

final int X10_TEMP571 = (1);
final int X10_TEMP572 = (1);
final boolean X10_TEMP573 = X10_TEMP571>X10_TEMP572;
int X10_TEMP576 = 0;
if(X10_TEMP573){
X10_TEMP576 = 1;
}
final int X10_TEMP577 = X10_TEMP576;

final int X10_TEMP578 = (X10_TEMP577);

final int X10_TEMP581 = (0);

final region(:rank==3) X10_TEMP584 = (region(:rank==3))(Program.Util_boundary(X10_TEMP555,X10_TEMP560,X10_TEMP569,X10_TEMP578,X10_TEMP581));
final region(:rank==3) X10_TEMP585 = (region(:rank==3))(X10_TEMP584);
temp_m_boundaries[j,ii] = (X10_TEMP585);
}
final int X10_TEMP586 = (5);

final boolean X10_TEMP588 = j==X10_TEMP586;
if (X10_TEMP588) {
final region(:rank==3) X10_TEMP592 = (region(:rank==3))(m_reg[ii]);

final int X10_TEMP594 = (2);
final int X10_TEMP595 = (1);

final int X10_TEMP597 = (X10_TEMP594+X10_TEMP595);

final int X10_TEMP599 = (2);
final int X10_TEMP600 = (0);
final boolean X10_TEMP601 = X10_TEMP599>X10_TEMP600;
int X10_TEMP604 = 0;
if(X10_TEMP601){
X10_TEMP604 = 1;
}
final int X10_TEMP605 = X10_TEMP604;

final int X10_TEMP606 = (X10_TEMP605);

final int X10_TEMP608 = (2);
final int X10_TEMP609 = (1);
final boolean X10_TEMP610 = X10_TEMP608>X10_TEMP609;
int X10_TEMP613 = 0;
if(X10_TEMP610){
X10_TEMP613 = 1;
}
final int X10_TEMP614 = X10_TEMP613;

final int X10_TEMP615 = (X10_TEMP614);

final int X10_TEMP618 = (0);

final region(:rank==3) X10_TEMP621 = (region(:rank==3))(Program.Util_boundary(X10_TEMP592,X10_TEMP597,X10_TEMP606,X10_TEMP615,X10_TEMP618));
final region(:rank==3) X10_TEMP622 = (region(:rank==3))(X10_TEMP621);
temp_m_boundaries[j,ii] = (X10_TEMP622);
}
}
m_boundaries = (region(:rank==3)[:rank==2])(temp_m_boundaries);
final Wrapper[:rank==1] temp_m_u = (Wrapper[:rank==1])(this.LevelData_getWrapperArray(ALLPLACES));
m_u = (Wrapper[:rank==1])(temp_m_u);
final int X10_TEMP632 = (0);
final int X10_TEMP629 = (Program._LevelData_N_PLACES);
final int X10_TEMP630 = (1);
final int X10_TEMP633 = (X10_TEMP629-X10_TEMP630);

final region(:rank==1) X10_TEMP635 = (region(:rank==1))([X10_TEMP632:X10_TEMP633]);
for(point(:rank==1)[k]:X10_TEMP635) {
final dist(:rank==3) X10_TEMP637 = (dist(:rank==3))(temp_m_DIST[k]);

final dist(:rank==3) disi = (dist(:rank==3))(X10_TEMP637);
finish {
final dist(:rank==1) X10_TEMP639 = (dist(:rank==1))(temp_m_u.distribution);

final place X10_TEMP642 = X10_TEMP639.get(k);
async(X10_TEMP642) {
double[:rank==3] X10_TEMP647 = (double[:rank==3])(this.LevelData_getDoubleArray(disi));

final Wrapper X10_TEMP650 = (new Wrapper(X10_TEMP647));
final Wrapper X10_TEMP651 = (X10_TEMP650);
temp_m_u[k] = (X10_TEMP651);
}
}
}
}


public dist(:rank==3) [:rank==1] LevelData_getDist3Array(final dist(:rank==1) d) {
final dist(:rank==3)[:rank==1&&distribution==d] X10_TEMP1 = (dist(:rank==3)[:rank==1&&distribution==d])(new dist(:rank==3)[d]);

return X10_TEMP1;
}
public region(:rank==3) [:rank==1] LevelData_getRegion3Array1(final dist(:rank==1) d) {
final region(:rank==3)[:rank==1&&distribution==d] X10_TEMP1 = (region(:rank==3)[:rank==1&&distribution==d])(new region(:rank==3)[d]);

return X10_TEMP1;
}
public region(:rank==3) [:rank==2] LevelData_getRegion3Array2(final dist(:rank==2) d) {
final region(:rank==3)[:rank==2&&distribution==d] X10_TEMP1 = (region(:rank==3)[:rank==2&&distribution==d])(new region(:rank==3)[d]);

return X10_TEMP1;
}
public Wrapper [:rank==1] LevelData_getWrapperArray(final dist(:rank==1) d) {
final Wrapper[:rank==1] X10_TEMP2 = (Wrapper[:rank==1&&distribution==d])(new Wrapper[d]);
return X10_TEMP2;
}
public double [:rank==3] LevelData_getDoubleArray(final dist(:rank==3) d) {
final double[:rank==3] X10_TEMP4 = (double[:rank==3&&distribution==d])(new double[d](point(:rank==3)pp) {
final double X10_TEMP2 = (0);
return X10_TEMP2;
}

);
return X10_TEMP4;
}

}

class MGDriver {
}

class MGOP {
public final boolean EXCHANGE_After;
public final int m_size;
public final region(:rank==3) m_problemDomain;
public final int m_levels;


public LevelData [:rank==1] m_r;
public LevelData [:rank==1] m_z;
public LevelData m_tempLD;


public MGOP(final int a_size) {
boolean temp_EXCHANGE_After = (false);
final boolean X10_TEMP3 = Program._Util_OVERLAP_COMMANDCOMP;
if (X10_TEMP3) {
final boolean X10_TEMP5 = (false);
temp_EXCHANGE_After = (X10_TEMP5);
}
else {
final boolean X10_TEMP7 = (Program._Util_EXCHANGE_AFTER);
temp_EXCHANGE_After = (X10_TEMP7);
}
EXCHANGE_After = (temp_EXCHANGE_After);
int i = (0);
int j = (0);
int k = (0);
m_size = (a_size);
final int X10_TEMP16 = (0);
final int X10_TEMP14 = (1);
final int X10_TEMP17 = (a_size-X10_TEMP14);
final int X10_TEMP21 = (0);
final int X10_TEMP19 = (1);
final int X10_TEMP22 = (a_size-X10_TEMP19);
final int X10_TEMP26 = (0);
final int X10_TEMP24 = (1);
final int X10_TEMP27 = (a_size-X10_TEMP24);

final region(:rank==3) X10_TEMP29 = (region(:rank==3))([X10_TEMP16:X10_TEMP17,X10_TEMP21:X10_TEMP22,X10_TEMP26:X10_TEMP27]);
m_problemDomain = (region(:rank==3))(X10_TEMP29);
final int log_a_size = (Program.Util_log2(a_size));
m_levels = (log_a_size);
final int X10_TEMP33 = (Program._MGOP_P2SLEVEL);
final int X10_TEMP34 = (0);

final boolean X10_TEMP36 = X10_TEMP33>X10_TEMP34;
if (X10_TEMP36) {
final int X10_TEMP38 = (Program._MGOP_P2SLEVEL);

final int X10_TEMP40 = (Program.Util_pow2(X10_TEMP38));
i = (X10_TEMP40);
final int X10_TEMP41 = (i*i);

final int X10_TEMP43 = (X10_TEMP41*i);
j = (X10_TEMP43);
}
else {
}
final int X10_TEMP46 = (0);
final region(:rank==1) X10_TEMP47 = (region(:rank==1))([X10_TEMP46:log_a_size]);
final place X10_TEMP48 = (here);

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP47->X10_TEMP48);
final LevelData[:rank==1] X10_TEMP65 = (LevelData[:rank==1])(new LevelData[d](point(:rank==1)p) {
final int X10_TEMP51 = (p[0]);
final int X10_TEMP52 = (1);

final int X10_TEMP54 = (X10_TEMP51+X10_TEMP52);

int X10_TEMP60 = (Program.Util_pow2(X10_TEMP54));
final int X10_TEMP57 = (p[0]);
final int X10_TEMP58 = (Program._MGOP_P2SLEVEL);

boolean X10_TEMP61 = (X10_TEMP57>=X10_TEMP58);

final LevelData X10_TEMP63 = (new LevelData(X10_TEMP60,X10_TEMP61));
return X10_TEMP63;
}

);
m_r = (LevelData[:rank==1])(X10_TEMP65);
final LevelData[:rank==1] X10_TEMP81 = (LevelData[:rank==1])(new LevelData[d](point(:rank==1)p) {
final int X10_TEMP67 = (p[0]);
final int X10_TEMP68 = (1);

final int X10_TEMP70 = (X10_TEMP67+X10_TEMP68);

int X10_TEMP76 = (Program.Util_pow2(X10_TEMP70));
final int X10_TEMP73 = (p[0]);
final int X10_TEMP74 = (Program._MGOP_P2SLEVEL);

boolean X10_TEMP77 = (X10_TEMP73>=X10_TEMP74);

final LevelData X10_TEMP79 = (new LevelData(X10_TEMP76,X10_TEMP77));
return X10_TEMP79;
}

);
m_z = (LevelData[:rank==1])(X10_TEMP81);
final int X10_TEMP82 = (Program._MGOP_P2SLEVEL);
final int X10_TEMP83 = (0);

final boolean X10_TEMP85 = X10_TEMP82>X10_TEMP83;
if (X10_TEMP85) {
final int X10_TEMP87 = (Program._MGOP_P2SLEVEL);

int X10_TEMP90 = (Program.Util_pow2(X10_TEMP87));
boolean X10_TEMP91 = (true);

final LevelData X10_TEMP93 = (new LevelData(X10_TEMP90,X10_TEMP91));
m_tempLD = (X10_TEMP93);
}
final String X10_TEMP94 = ("Overlapping communication and computation? ");
final boolean X10_TEMP95 = (Program._MGOP_OVERLAPPED);
final String X10_TEMP96 = (X10_TEMP94+X10_TEMP95);
final String X10_TEMP97 = (". If not, doing exchange after computation? ");
final String X10_TEMP98 = (X10_TEMP96+X10_TEMP97);

final String X10_TEMP100 = (X10_TEMP98+temp_EXCHANGE_After);
System.out.println(X10_TEMP100);
}


}

class Timer {
public double [:rank==1] start_time;
public double [:rank==1] elapsed_time;
public double [:rank==1] total_time;


public Timer() {
final int X10_TEMP3 = (0);
final int X10_TEMP4 = (Program._Timer_max_counters);
final region(:rank==1) X10_TEMP5 = (region(:rank==1))([X10_TEMP3:X10_TEMP4]);
final place X10_TEMP6 = (place.FIRST_PLACE);

final dist(:rank==1) d = (dist(:rank==1))(X10_TEMP5->X10_TEMP6);
final double[:rank==1] X10_TEMP11 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP9 = (0);
return X10_TEMP9;
}

);
start_time = (double[:rank==1])(X10_TEMP11);
final double[:rank==1] X10_TEMP15 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP13 = (0);
return X10_TEMP13;
}

);
elapsed_time = (double[:rank==1])(X10_TEMP15);
final double[:rank==1] X10_TEMP19 = (double[:rank==1])(new double[d](point(:rank==1)p) {
final double X10_TEMP17 = (0);
return X10_TEMP17;
}

);
total_time = (double[:rank==1])(X10_TEMP19);
}


}

class Util {
public Util() {
}


}

value Wrapper {
public final double [:rank==3] m_array;


public Wrapper(final double [:rank==3] a_array) {
m_array = (double[:rank==3])(a_array);
}


}

