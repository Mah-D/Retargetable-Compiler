 public class RunMain { public static void main ( String [ ] args ) { Program . runMain ( ) ; } }
 class Program { public static final int _Scene_maxObjects = Program . _Scene_maxObjects_init ( ) ; public static final int _Scene_maxLights = Program . _Scene_maxLights_init ( ) ; public static final int _Timer_max_counters = Program . _Timer_max_counters_init ( ) ; public static final int _RayTracer_alpha = Program . _RayTracer_alpha_init ( ) ; public static final Vec _RayTracer_voidVec = Program . _RayTracer_voidVec_init ( ) ; public static String Envelope2_toString ( final Envelope2 X10_TEMP0 ) { final String X10_TEMP2 = ( "" ) ; return X10_TEMP2 ; }
 public static Ray Ray_d ( final Ray X10_TEMP0 , final Vec d_ ) { Vec X10_TEMP4 = ( X10_TEMP0 . p ) ; boolean X10_TEMP5 = ( false ) ; final Ray X10_TEMP7 = ( new Ray ( X10_TEMP4 , d_ , X10_TEMP5 ) ) ; return X10_TEMP7 ; }
 public static Vec Ray_rayPoint ( final Ray X10_TEMP0 , final double t ) { final Vec X10_TEMP1 = ( X10_TEMP0 . p ) ; final double X10_TEMP4 = ( X10_TEMP1 . x ) ; final Vec X10_TEMP2 = ( X10_TEMP0 . d ) ; final double X10_TEMP3 = ( X10_TEMP2 . x ) ; final double X10_TEMP5 = ( X10_TEMP3 * t ) ; double X10_TEMP20 = ( X10_TEMP4 + X10_TEMP5 ) ; final Vec X10_TEMP7 = ( X10_TEMP0 . p ) ; final double X10_TEMP10 = ( X10_TEMP7 . y ) ; final Vec X10_TEMP8 = ( X10_TEMP0 . d ) ; final double X10_TEMP9 = ( X10_TEMP8 . y ) ; final double X10_TEMP11 = ( X10_TEMP9 * t ) ; double X10_TEMP21 = ( X10_TEMP10 + X10_TEMP11 ) ; final Vec X10_TEMP13 = ( X10_TEMP0 . p ) ; final double X10_TEMP16 = ( X10_TEMP13 . z ) ; final Vec X10_TEMP14 = ( X10_TEMP0 . d ) ; final double X10_TEMP15 = ( X10_TEMP14 . z ) ; final double X10_TEMP17 = ( X10_TEMP15 * t ) ; double X10_TEMP22 = ( X10_TEMP16 + X10_TEMP17 ) ; boolean X10_TEMP23 = ( false ) ; final Vec X10_TEMP25 = ( new Vec ( X10_TEMP20 , X10_TEMP21 , X10_TEMP22 , X10_TEMP23 ) ) ; return X10_TEMP25 ; }
 public static String Ray_toString ( final Ray X10_TEMP0 ) { final String X10_TEMP2 = ( " { " ) ; final Vec X10_TEMP1 = ( X10_TEMP0 . p ) ; final String X10_TEMP3 = ( Program . Vec_toString ( X10_TEMP1 ) ) ; final String X10_TEMP4 = ( X10_TEMP2 + X10_TEMP3 ) ; final String X10_TEMP5 = ( "->" ) ; final String X10_TEMP7 = ( X10_TEMP4 + X10_TEMP5 ) ; final Vec X10_TEMP6 = ( X10_TEMP0 . d ) ; final String X10_TEMP8 = ( Program . Vec_toString ( X10_TEMP6 ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " } " ) ; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; return X10_TEMP12 ; }
 public static void runMain ( ) { Timer tmr = ( new Timer ( ) ) ; int count = ( 0 ) ; finish { Program . Timer_start ( tmr , count ) ; }
 finish { final RayTracer X10_TEMP4 = ( new RayTracer ( ) ) ; Program . RayTracer_run ( X10_TEMP4 ) ; }
 Program . Timer_stop ( tmr , count ) ; final String X10_TEMP7 = ( "Wall-clock time for raytracer: " ) ; final double X10_TEMP8 = ( Program . Timer_readTimer ( tmr , count ) ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " secs" ) ; final String X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; System.out.println ( X10_TEMP12 ) ; }
 public static String Envelope_toString ( final Envelope X10_TEMP0 ) { final String X10_TEMP2 = ( "" ) ; return X10_TEMP2 ; }
 public static String Light_toString ( final Light X10_TEMP0 ) { final Vec X10_TEMP1 = ( X10_TEMP0 . pos ) ; final String X10_TEMP2 = ( " " ) ; final String X10_TEMP3 = ( Program . Vec_toString ( X10_TEMP1 ) ) ; final String X10_TEMP4 = ( X10_TEMP3 + X10_TEMP2 ) ; final double X10_TEMP5 = ( X10_TEMP0 . brightness ) ; final String X10_TEMP7 = ( X10_TEMP4 + X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static Isect Sphere_intersect ( final Sphere X10_TEMP0 , final Ray ry ) { final Vec X10_TEMP3 = ( X10_TEMP0 . c ) ; final Vec X10_TEMP4 = ( ry . p ) ; Vec v = ( Program . Vec_sub ( X10_TEMP3 , X10_TEMP4 ) ) ; final Vec X10_TEMP8 = ( ry . d ) ; double b = ( Program . Vec_dot ( v , X10_TEMP8 ) ) ; final double X10_TEMP12 = ( b * b ) ; final double X10_TEMP13 = ( Program . Vec_dot ( v , v ) ) ; final double X10_TEMP14 = ( X10_TEMP12 - X10_TEMP13 ) ; final double X10_TEMP15 = ( X10_TEMP0 . r2 ) ; double disc = ( X10_TEMP14 + X10_TEMP15 ) ; final double X10_TEMP17 = ( 0.0 ) ; final boolean X10_TEMP19 = disc < X10_TEMP17 ; if ( X10_TEMP19 ) { double X10_TEMP25 = ( 0.0 ) ; int X10_TEMP26 = ( 0 ) ; boolean X10_TEMP27 = ( true ) ; Surface X10_TEMP28 = ( X10_TEMP0 . surf ) ; final Isect X10_TEMP30 = ( new Isect ( X10_TEMP25 , X10_TEMP26 , X10_TEMP27 , X10_TEMP0 , X10_TEMP28 ) ) ; return X10_TEMP30 ; }
 final double X10_TEMP33 = ( Math . sqrt ( disc ) ) ; disc = ( X10_TEMP33 ) ; final double X10_TEMP34 = ( b - disc ) ; final double X10_TEMP35 = ( 1e-6 ) ; final boolean X10_TEMP37 = ( X10_TEMP34 < X10_TEMP35 ) ; final boolean X10_TEMP38 = X10_TEMP37 ; double X10_TEMP41 = b - disc ; if ( X10_TEMP38 ) { X10_TEMP41 = b + disc ; }
 final double X10_TEMP42 = X10_TEMP41 ; double t = ( X10_TEMP42 ) ; final double X10_TEMP43 = ( 1e-6 ) ; final boolean X10_TEMP45 = t < X10_TEMP43 ; if ( X10_TEMP45 ) { double X10_TEMP51 = ( 0.0 ) ; int X10_TEMP52 = ( 0 ) ; boolean X10_TEMP53 = ( true ) ; Surface X10_TEMP54 = ( X10_TEMP0 . surf ) ; final Isect X10_TEMP56 = ( new Isect ( X10_TEMP51 , X10_TEMP52 , X10_TEMP53 , X10_TEMP0 , X10_TEMP54 ) ) ; return X10_TEMP56 ; }
 final double X10_TEMP62 = ( Program . Vec_dot ( v , v ) ) ; final double X10_TEMP60 = ( X10_TEMP0 . r2 ) ; final double X10_TEMP61 = ( 1e-6 ) ; final double X10_TEMP63 = ( X10_TEMP60 + X10_TEMP61 ) ; final boolean X10_TEMP64 = X10_TEMP62 > X10_TEMP63 ; int X10_TEMP67 = 0 ; if ( X10_TEMP64 ) { X10_TEMP67 = 1 ; }
 final int X10_TEMP68 = X10_TEMP67 ; boolean X10_TEMP72 = ( false ) ; Surface X10_TEMP73 = ( X10_TEMP0 . surf ) ; Isect ip = ( new Isect ( t , X10_TEMP68 , X10_TEMP72 , X10_TEMP0 , X10_TEMP73 ) ) ; return ip ; }
 public static Vec Sphere_normal ( final Sphere X10_TEMP0 , final Vec p ) { final Vec X10_TEMP3 = ( X10_TEMP0 . c ) ; final Vec X10_TEMP4 = ( Program . Vec_sub ( p , X10_TEMP3 ) ) ; final Vec X10_TEMP6 = ( Program . Vec_normalized ( X10_TEMP4 ) ) ; return X10_TEMP6 ; }
 public static String Sphere_toString ( final Sphere X10_TEMP0 ) { final String X10_TEMP2 = ( "Sphere {" ) ; final Vec X10_TEMP1 = ( X10_TEMP0 . c ) ; final String X10_TEMP3 = ( Program . Vec_toString ( X10_TEMP1 ) ) ; final String X10_TEMP4 = ( X10_TEMP2 + X10_TEMP3 ) ; final String X10_TEMP5 = ( "," ) ; final String X10_TEMP6 = ( X10_TEMP4 + X10_TEMP5 ) ; final double X10_TEMP7 = ( X10_TEMP0 . r ) ; final String X10_TEMP8 = ( X10_TEMP6 + X10_TEMP7 ) ; final String X10_TEMP9 = ( "}" ) ; final String X10_TEMP11 = ( X10_TEMP8 + X10_TEMP9 ) ; return X10_TEMP11 ; }
 public static Vec Sphere_getCenter ( final Sphere X10_TEMP0 ) { final Vec X10_TEMP2 = ( X10_TEMP0 . c ) ; return X10_TEMP2 ; }
 public static Vec Vec_added ( final Vec X10_TEMP0 , final Vec a ) { final double X10_TEMP1 = ( X10_TEMP0 . x ) ; final double X10_TEMP2 = ( a . x ) ; double X10_TEMP11 = ( X10_TEMP1 + X10_TEMP2 ) ; final double X10_TEMP4 = ( X10_TEMP0 . y ) ; final double X10_TEMP5 = ( a . y ) ; double X10_TEMP12 = ( X10_TEMP4 + X10_TEMP5 ) ; final double X10_TEMP7 = ( X10_TEMP0 . z ) ; final double X10_TEMP8 = ( a . z ) ; double X10_TEMP13 = ( X10_TEMP7 + X10_TEMP8 ) ; boolean X10_TEMP14 = ( false ) ; final Vec X10_TEMP16 = ( new Vec ( X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ) ; return X10_TEMP16 ; }
 public static Vec Vec_adds3 ( final double s , final Vec a , final Vec b ) { final double X10_TEMP1 = ( a . x ) ; final double X10_TEMP2 = ( s * X10_TEMP1 ) ; final double X10_TEMP3 = ( b . x ) ; double X10_TEMP14 = ( X10_TEMP2 + X10_TEMP3 ) ; final double X10_TEMP5 = ( a . y ) ; final double X10_TEMP6 = ( s * X10_TEMP5 ) ; final double X10_TEMP7 = ( b . y ) ; double X10_TEMP15 = ( X10_TEMP6 + X10_TEMP7 ) ; final double X10_TEMP9 = ( a . z ) ; final double X10_TEMP10 = ( s * X10_TEMP9 ) ; final double X10_TEMP11 = ( b . z ) ; double X10_TEMP16 = ( X10_TEMP10 + X10_TEMP11 ) ; boolean X10_TEMP17 = ( false ) ; final Vec X10_TEMP19 = ( new Vec ( X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 ) ) ; return X10_TEMP19 ; }
 public static Vec Vec_adds2 ( final Vec X10_TEMP0 , final double s , final Vec b ) { final double X10_TEMP2 = ( X10_TEMP0 . x ) ; final double X10_TEMP1 = ( b . x ) ; final double X10_TEMP3 = ( s * X10_TEMP1 ) ; double X10_TEMP14 = ( X10_TEMP2 + X10_TEMP3 ) ; final double X10_TEMP6 = ( X10_TEMP0 . y ) ; final double X10_TEMP5 = ( b . y ) ; final double X10_TEMP7 = ( s * X10_TEMP5 ) ; double X10_TEMP15 = ( X10_TEMP6 + X10_TEMP7 ) ; final double X10_TEMP10 = ( X10_TEMP0 . z ) ; final double X10_TEMP9 = ( b . z ) ; final double X10_TEMP11 = ( s * X10_TEMP9 ) ; double X10_TEMP16 = ( X10_TEMP10 + X10_TEMP11 ) ; boolean X10_TEMP17 = ( false ) ; final Vec X10_TEMP19 = ( new Vec ( X10_TEMP14 , X10_TEMP15 , X10_TEMP16 , X10_TEMP17 ) ) ; return X10_TEMP19 ; }
 public static Vec Vec_sub ( final Vec a , final Vec b ) { final double X10_TEMP1 = ( a . x ) ; final double X10_TEMP2 = ( b . x ) ; double X10_TEMP11 = ( X10_TEMP1 - X10_TEMP2 ) ; final double X10_TEMP4 = ( a . y ) ; final double X10_TEMP5 = ( b . y ) ; double X10_TEMP12 = ( X10_TEMP4 - X10_TEMP5 ) ; final double X10_TEMP7 = ( a . z ) ; final double X10_TEMP8 = ( b . z ) ; double X10_TEMP13 = ( X10_TEMP7 - X10_TEMP8 ) ; boolean X10_TEMP14 = ( false ) ; final Vec X10_TEMP16 = ( new Vec ( X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ) ; return X10_TEMP16 ; }
 public static Vec Vec_mult ( final Vec a , final Vec b ) { final double X10_TEMP1 = ( a . x ) ; final double X10_TEMP2 = ( b . x ) ; double X10_TEMP11 = ( X10_TEMP1 * X10_TEMP2 ) ; final double X10_TEMP4 = ( a . y ) ; final double X10_TEMP5 = ( b . y ) ; double X10_TEMP12 = ( X10_TEMP4 * X10_TEMP5 ) ; final double X10_TEMP7 = ( a . z ) ; final double X10_TEMP8 = ( b . z ) ; double X10_TEMP13 = ( X10_TEMP7 * X10_TEMP8 ) ; boolean X10_TEMP14 = ( false ) ; final Vec X10_TEMP16 = ( new Vec ( X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ) ; return X10_TEMP16 ; }
 public static Vec Vec_cross ( final Vec a , final Vec b ) { final double X10_TEMP1 = ( a . y ) ; final double X10_TEMP2 = ( b . z ) ; final double X10_TEMP5 = ( X10_TEMP1 * X10_TEMP2 ) ; final double X10_TEMP3 = ( a . z ) ; final double X10_TEMP4 = ( b . y ) ; final double X10_TEMP6 = ( X10_TEMP3 * X10_TEMP4 ) ; double X10_TEMP23 = ( X10_TEMP5 - X10_TEMP6 ) ; final double X10_TEMP8 = ( a . z ) ; final double X10_TEMP9 = ( b . x ) ; final double X10_TEMP12 = ( X10_TEMP8 * X10_TEMP9 ) ; final double X10_TEMP10 = ( a . x ) ; final double X10_TEMP11 = ( b . z ) ; final double X10_TEMP13 = ( X10_TEMP10 * X10_TEMP11 ) ; double X10_TEMP24 = ( X10_TEMP12 - X10_TEMP13 ) ; final double X10_TEMP15 = ( a . x ) ; final double X10_TEMP16 = ( b . y ) ; final double X10_TEMP19 = ( X10_TEMP15 * X10_TEMP16 ) ; final double X10_TEMP17 = ( a . y ) ; final double X10_TEMP18 = ( b . x ) ; final double X10_TEMP20 = ( X10_TEMP17 * X10_TEMP18 ) ; double X10_TEMP25 = ( X10_TEMP19 - X10_TEMP20 ) ; boolean X10_TEMP26 = ( false ) ; final Vec X10_TEMP28 = ( new Vec ( X10_TEMP23 , X10_TEMP24 , X10_TEMP25 , X10_TEMP26 ) ) ; return X10_TEMP28 ; }
 public static double Vec_dot ( final Vec a , final Vec b ) { final double X10_TEMP1 = ( a . x ) ; final double X10_TEMP2 = ( b . x ) ; final double X10_TEMP5 = ( X10_TEMP1 * X10_TEMP2 ) ; final double X10_TEMP3 = ( a . y ) ; final double X10_TEMP4 = ( b . y ) ; final double X10_TEMP6 = ( X10_TEMP3 * X10_TEMP4 ) ; final double X10_TEMP9 = ( X10_TEMP5 + X10_TEMP6 ) ; final double X10_TEMP7 = ( a . z ) ; final double X10_TEMP8 = ( b . z ) ; final double X10_TEMP10 = ( X10_TEMP7 * X10_TEMP8 ) ; final double X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; return X10_TEMP12 ; }
 public static Vec Vec_comb ( final double a , final Vec A , final double b , final Vec B ) { final double X10_TEMP1 = ( A . x ) ; final double X10_TEMP3 = ( a * X10_TEMP1 ) ; final double X10_TEMP2 = ( B . x ) ; final double X10_TEMP4 = ( b * X10_TEMP2 ) ; double X10_TEMP17 = ( X10_TEMP3 + X10_TEMP4 ) ; final double X10_TEMP6 = ( A . y ) ; final double X10_TEMP8 = ( a * X10_TEMP6 ) ; final double X10_TEMP7 = ( B . y ) ; final double X10_TEMP9 = ( b * X10_TEMP7 ) ; double X10_TEMP18 = ( X10_TEMP8 + X10_TEMP9 ) ; final double X10_TEMP11 = ( A . z ) ; final double X10_TEMP13 = ( a * X10_TEMP11 ) ; final double X10_TEMP12 = ( B . z ) ; final double X10_TEMP14 = ( b * X10_TEMP12 ) ; double X10_TEMP19 = ( X10_TEMP13 + X10_TEMP14 ) ; boolean X10_TEMP20 = ( false ) ; final Vec X10_TEMP22 = ( new Vec ( X10_TEMP17 , X10_TEMP18 , X10_TEMP19 , X10_TEMP20 ) ) ; return X10_TEMP22 ; }
 public static Vec Vec_scale ( final Vec X10_TEMP0 , final double t ) { final double X10_TEMP1 = ( X10_TEMP0 . x ) ; double X10_TEMP8 = ( X10_TEMP1 * t ) ; final double X10_TEMP3 = ( X10_TEMP0 . y ) ; double X10_TEMP9 = ( X10_TEMP3 * t ) ; final double X10_TEMP5 = ( X10_TEMP0 . z ) ; double X10_TEMP10 = ( X10_TEMP5 * t ) ; boolean X10_TEMP11 = ( false ) ; final Vec X10_TEMP13 = ( new Vec ( X10_TEMP8 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 ) ) ; return X10_TEMP13 ; }
 public static Vec Vec_negate ( final Vec X10_TEMP0 ) { final double X10_TEMP1 = ( X10_TEMP0 . x ) ; final int X10_TEMP2 = 0 ; double X10_TEMP11 = ( X10_TEMP2 - X10_TEMP1 ) ; final double X10_TEMP4 = ( X10_TEMP0 . y ) ; final int X10_TEMP5 = 0 ; double X10_TEMP12 = ( X10_TEMP5 - X10_TEMP4 ) ; final double X10_TEMP7 = ( X10_TEMP0 . z ) ; final int X10_TEMP8 = 0 ; double X10_TEMP13 = ( X10_TEMP8 - X10_TEMP7 ) ; boolean X10_TEMP14 = ( false ) ; final Vec X10_TEMP16 = ( new Vec ( X10_TEMP11 , X10_TEMP12 , X10_TEMP13 , X10_TEMP14 ) ) ; return X10_TEMP16 ; }
 public static Vec Vec_normalized ( final Vec X10_TEMP0 ) { final double X10_TEMP1 = ( X10_TEMP0 . x ) ; final double X10_TEMP2 = ( X10_TEMP0 . x ) ; final double X10_TEMP5 = ( X10_TEMP1 * X10_TEMP2 ) ; final double X10_TEMP3 = ( X10_TEMP0 . y ) ; final double X10_TEMP4 = ( X10_TEMP0 . y ) ; final double X10_TEMP6 = ( X10_TEMP3 * X10_TEMP4 ) ; final double X10_TEMP9 = ( X10_TEMP5 + X10_TEMP6 ) ; final double X10_TEMP7 = ( X10_TEMP0 . z ) ; final double X10_TEMP8 = ( X10_TEMP0 . z ) ; final double X10_TEMP10 = ( X10_TEMP7 * X10_TEMP8 ) ; final double X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; double len = ( Math . sqrt ( X10_TEMP12 ) ) ; final double X10_TEMP14 = ( 0.0 ) ; final boolean X10_TEMP16 = ( len > X10_TEMP14 ) ; final boolean X10_TEMP17 = X10_TEMP16 ; final double X10_TEMP18 = ( X10_TEMP0 . x ) ; double X10_TEMP25 = ( X10_TEMP18 / len ) ; final double X10_TEMP20 = ( X10_TEMP0 . y ) ; double X10_TEMP26 = ( X10_TEMP20 / len ) ; final double X10_TEMP22 = ( X10_TEMP0 . z ) ; double X10_TEMP27 = ( X10_TEMP22 / len ) ; boolean X10_TEMP28 = ( false ) ; Vec X10_TEMP31 = X10_TEMP0 ; if ( X10_TEMP17 ) { X10_TEMP31 = new Vec ( X10_TEMP25 , X10_TEMP26 , X10_TEMP27 , X10_TEMP28 ) ; }
 final Vec X10_TEMP32 = X10_TEMP31 ; return X10_TEMP32 ; }
 public static double Vec_length ( final Vec X10_TEMP0 ) { final double X10_TEMP1 = ( X10_TEMP0 . x ) ; final double X10_TEMP2 = ( X10_TEMP0 . x ) ; final double X10_TEMP5 = ( X10_TEMP1 * X10_TEMP2 ) ; final double X10_TEMP3 = ( X10_TEMP0 . y ) ; final double X10_TEMP4 = ( X10_TEMP0 . y ) ; final double X10_TEMP6 = ( X10_TEMP3 * X10_TEMP4 ) ; final double X10_TEMP9 = ( X10_TEMP5 + X10_TEMP6 ) ; final double X10_TEMP7 = ( X10_TEMP0 . z ) ; final double X10_TEMP8 = ( X10_TEMP0 . z ) ; final double X10_TEMP10 = ( X10_TEMP7 * X10_TEMP8 ) ; final double X10_TEMP12 = ( X10_TEMP9 + X10_TEMP10 ) ; final double X10_TEMP14 = ( Math . sqrt ( X10_TEMP12 ) ) ; return X10_TEMP14 ; }
 public static String Vec_toString ( final Vec X10_TEMP0 ) { final String X10_TEMP1 = ( "<" ) ; final double X10_TEMP2 = ( X10_TEMP0 . x ) ; final String X10_TEMP3 = ( X10_TEMP1 + X10_TEMP2 ) ; final String X10_TEMP4 = ( "," ) ; final String X10_TEMP5 = ( X10_TEMP3 + X10_TEMP4 ) ; final double X10_TEMP6 = ( X10_TEMP0 . y ) ; final String X10_TEMP7 = ( X10_TEMP5 + X10_TEMP6 ) ; final String X10_TEMP8 = ( "," ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final double X10_TEMP10 = ( X10_TEMP0 . z ) ; final String X10_TEMP11 = ( X10_TEMP9 + X10_TEMP10 ) ; final String X10_TEMP12 = ( ">" ) ; final String X10_TEMP14 = ( X10_TEMP11 + X10_TEMP12 ) ; return X10_TEMP14 ; }
 public static int _Scene_maxObjects_init ( ) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; }
 public static int _Scene_maxLights_init ( ) { final int X10_TEMP2 = ( 5 ) ; return X10_TEMP2 ; }
 public static void Scene_addLight ( final Scene X10_TEMP0 , final Light l ) { final int X10_TEMP2 = ( X10_TEMP0 . lightCount ) ; final int X10_TEMP1 = ( 1 ) ; final int X10_TEMP3 = ( _Scene_maxLights - X10_TEMP1 ) ; final boolean X10_TEMP5 = X10_TEMP2 > X10_TEMP3 ; if ( X10_TEMP5 ) { final String X10_TEMP6 = ( "Only " ) ; final String X10_TEMP7 = ( X10_TEMP6 + _Scene_maxLights ) ; final String X10_TEMP8 = ( " lights allowed" ) ; final String X10_TEMP10 = ( X10_TEMP7 + X10_TEMP8 ) ; throw new RuntimeException ( X10_TEMP10 ) ; }
 final LightRefArray1 X10_TEMP11 = X10_TEMP0 . lights ; final int X10_TEMP13 = ( X10_TEMP0 . lightCount ) ; final Light X10_TEMP15 = ( l ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP13 ) ; final Dist1 RX10_TEMP1 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1Light ( X10_TEMP11 , RX10_TEMP3 , X10_TEMP15 ) ; final int X10_TEMP16 = ( X10_TEMP0 . lightCount ) ; final int X10_TEMP17 = ( 1 ) ; final int X10_TEMP19 = ( X10_TEMP16 + X10_TEMP17 ) ; final int X10_TEMP20 = ( X10_TEMP19 ) ; X10_TEMP0 . lightCount = ( X10_TEMP20 ) ; }
 public static void Scene_addObject ( final Scene X10_TEMP0 , final Sphere object ) { final int X10_TEMP2 = ( X10_TEMP0 . objectCount ) ; final int X10_TEMP1 = ( 1 ) ; final int X10_TEMP3 = ( _Scene_maxObjects - X10_TEMP1 ) ; final boolean X10_TEMP5 = X10_TEMP2 > X10_TEMP3 ; if ( X10_TEMP5 ) { final String X10_TEMP6 = ( "Only " ) ; final String X10_TEMP7 = ( X10_TEMP6 + _Scene_maxObjects ) ; final String X10_TEMP8 = ( " objects allowed" ) ; final String X10_TEMP10 = ( X10_TEMP7 + X10_TEMP8 ) ; throw new RuntimeException ( X10_TEMP10 ) ; }
 final SphereRefArray1 X10_TEMP11 = X10_TEMP0 . objects ; final int X10_TEMP13 = ( X10_TEMP0 . objectCount ) ; final Sphere X10_TEMP15 = ( object ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP13 ) ; final Dist1 RX10_TEMP1 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1Sphere ( X10_TEMP11 , RX10_TEMP3 , X10_TEMP15 ) ; final int X10_TEMP16 = ( X10_TEMP0 . objectCount ) ; final int X10_TEMP17 = ( 1 ) ; final int X10_TEMP19 = ( X10_TEMP16 + X10_TEMP17 ) ; final int X10_TEMP20 = ( X10_TEMP19 ) ; X10_TEMP0 . objectCount = ( X10_TEMP20 ) ; }
 public static View Scene_getView ( final Scene X10_TEMP0 ) { final View X10_TEMP2 = ( X10_TEMP0 . view ) ; return X10_TEMP2 ; }
 public static Light Scene_getLight ( final Scene X10_TEMP0 , final Point1 number ) { final LightRefArray1 X10_TEMP1 = X10_TEMP0 . lights ; final Dist1 RX10_TEMP0 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP1 = RX10_TEMP0 . dReg ; final int RX10_TEMP2 = Program . searchPointInRegion1 ( RX10_TEMP1 , number ) ; final int RX10_TEMP3 = 0 ; final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; if ( RX10_TEMP4 ) { String RX10_TEMP5 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP5 ) ; }
 final place RX10_TEMP6 = Program . getPlaceFromDist1 ( RX10_TEMP0 , RX10_TEMP2 ) ; final place RX10_TEMP8 = here ; final boolean RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8 ; if ( RX10_TEMP9 ) { String RX10_TEMP7 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP7 ) ; }
 final Light RX10_TEMP10 = Program . getRefArrayValue1Light ( X10_TEMP1 , RX10_TEMP2 ) ; final Light X10_TEMP4 = ( RX10_TEMP10 ) ; return X10_TEMP4 ; }
 public static Sphere Scene_getObject ( final Scene X10_TEMP0 , final Point1 number ) { final SphereRefArray1 X10_TEMP1 = X10_TEMP0 . objects ; final Dist1 RX10_TEMP0 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP1 = RX10_TEMP0 . dReg ; final int RX10_TEMP2 = Program . searchPointInRegion1 ( RX10_TEMP1 , number ) ; final int RX10_TEMP3 = 0 ; final boolean RX10_TEMP4 = RX10_TEMP2 < RX10_TEMP3 ; if ( RX10_TEMP4 ) { String RX10_TEMP5 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP5 ) ; }
 final place RX10_TEMP6 = Program . getPlaceFromDist1 ( RX10_TEMP0 , RX10_TEMP2 ) ; final place RX10_TEMP8 = here ; final boolean RX10_TEMP9 = RX10_TEMP6 != RX10_TEMP8 ; if ( RX10_TEMP9 ) { String RX10_TEMP7 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP7 ) ; }
 final Sphere RX10_TEMP10 = Program . getRefArrayValue1Sphere ( X10_TEMP1 , RX10_TEMP2 ) ; final Sphere X10_TEMP4 = ( RX10_TEMP10 ) ; return X10_TEMP4 ; }
 public static int Scene_getLights ( final Scene X10_TEMP0 ) { final int X10_TEMP2 = ( X10_TEMP0 . lightCount ) ; return X10_TEMP2 ; }
 public static int Scene_getObjects ( final Scene X10_TEMP0 ) { final int X10_TEMP2 = ( X10_TEMP0 . objectCount ) ; return X10_TEMP2 ; }
 public static int _Timer_max_counters_init ( ) { final int X10_TEMP2 = ( 64 ) ; return X10_TEMP2 ; }
 public static void Timer_start ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . start_time ; final double X10_TEMP4 = ( System.currentTimeMillis ( ) ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; }
 public static void Timer_stop ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . elapsed_time ; final double X10_TEMP5 = ( System.currentTimeMillis ( ) ) ; final doubleRefArray1 X10_TEMP3 = X10_TEMP0 . start_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP3 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP3" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP3 , RX10_TEMP3 ) ; final double X10_TEMP6 = ( RX10_TEMP11 ) ; final double X10_TEMP8 = ( X10_TEMP5 - X10_TEMP6 ) ; final double X10_TEMP9 = ( X10_TEMP8 ) ; final Point1 RX10_TEMP12 = new Point1 ( n ) ; final Dist1 RX10_TEMP13 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP15 , X10_TEMP9 ) ; final doubleRefArray1 X10_TEMP10 = X10_TEMP0 . elapsed_time ; final doubleRefArray1 X10_TEMP12 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP23 = new Point1 ( n ) ; final Dist1 RX10_TEMP24 = X10_TEMP12 . distValue ; final Region1 RX10_TEMP25 = RX10_TEMP24 . dReg ; final int RX10_TEMP26 = Program . searchPointInRegion1 ( RX10_TEMP25 , RX10_TEMP23 ) ; final int RX10_TEMP27 = 0 ; final boolean RX10_TEMP28 = RX10_TEMP26 < RX10_TEMP27 ; if ( RX10_TEMP28 ) { String RX10_TEMP29 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP29 ) ; }
 final place RX10_TEMP30 = Program . getPlaceFromDist1 ( RX10_TEMP24 , RX10_TEMP26 ) ; final place RX10_TEMP32 = here ; final boolean RX10_TEMP33 = RX10_TEMP30 != RX10_TEMP32 ; if ( RX10_TEMP33 ) { String RX10_TEMP31 = "Bad place access for array X10_TEMP12" ; throw new RuntimeException ( RX10_TEMP31 ) ; }
 final double RX10_TEMP34 = Program . getRefArrayValue1double ( X10_TEMP12 , RX10_TEMP26 ) ; final double X10_TEMP14 = ( RX10_TEMP34 ) ; final int X10_TEMP15 = ( 1000 ) ; final double X10_TEMP17 = ( X10_TEMP14 / X10_TEMP15 ) ; final double X10_TEMP18 = ( X10_TEMP17 ) ; final Point1 RX10_TEMP35 = new Point1 ( n ) ; final Dist1 RX10_TEMP36 = X10_TEMP10 . distValue ; final Region1 RX10_TEMP37 = RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP41 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final place RX10_TEMP42 = Program . getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access for array X10_TEMP10" ; throw new RuntimeException ( RX10_TEMP43 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP10 , RX10_TEMP38 , X10_TEMP18 ) ; final doubleRefArray1 X10_TEMP19 = X10_TEMP0 . total_time ; final doubleRefArray1 X10_TEMP21 = X10_TEMP0 . total_time ; final Point1 RX10_TEMP46 = new Point1 ( n ) ; final Dist1 RX10_TEMP47 = X10_TEMP21 . distValue ; final Region1 RX10_TEMP48 = RX10_TEMP47 . dReg ; final int RX10_TEMP49 = Program . searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final place RX10_TEMP53 = Program . getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ; final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array X10_TEMP21" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final double RX10_TEMP57 = Program . getRefArrayValue1double ( X10_TEMP21 , RX10_TEMP49 ) ; final double X10_TEMP25 = ( RX10_TEMP57 ) ; final doubleRefArray1 X10_TEMP23 = X10_TEMP0 . elapsed_time ; final Point1 RX10_TEMP58 = new Point1 ( n ) ; final Dist1 RX10_TEMP59 = X10_TEMP23 . distValue ; final Region1 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion1 ( RX10_TEMP60 , RX10_TEMP58 ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array X10_TEMP23" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 final double RX10_TEMP69 = Program . getRefArrayValue1double ( X10_TEMP23 , RX10_TEMP61 ) ; final double X10_TEMP26 = ( RX10_TEMP69 ) ; final double X10_TEMP28 = ( X10_TEMP25 + X10_TEMP26 ) ; final double X10_TEMP29 = ( X10_TEMP28 ) ; final Point1 RX10_TEMP70 = new Point1 ( n ) ; final Dist1 RX10_TEMP71 = X10_TEMP19 . distValue ; final Region1 RX10_TEMP72 = RX10_TEMP71 . dReg ; final int RX10_TEMP73 = Program . searchPointInRegion1 ( RX10_TEMP72 , RX10_TEMP70 ) ; final int RX10_TEMP74 = 0 ; final boolean RX10_TEMP75 = RX10_TEMP73 < RX10_TEMP74 ; if ( RX10_TEMP75 ) { String RX10_TEMP76 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP76 ) ; }
 final place RX10_TEMP77 = Program . getPlaceFromDist1 ( RX10_TEMP71 , RX10_TEMP73 ) ; final place RX10_TEMP79 = here ; final boolean RX10_TEMP80 = RX10_TEMP77 != RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP78 = "Bad place access for array X10_TEMP19" ; throw new RuntimeException ( RX10_TEMP78 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP19 , RX10_TEMP73 , X10_TEMP29 ) ; }
 public static double Timer_readTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final double RX10_TEMP11 = Program . getRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 ) ; final double X10_TEMP4 = ( RX10_TEMP11 ) ; return X10_TEMP4 ; }
 public static void Timer_resetTimer ( final Timer X10_TEMP0 , final int n ) { final doubleRefArray1 X10_TEMP1 = X10_TEMP0 . total_time ; final double X10_TEMP4 = ( 0 ) ; final double X10_TEMP5 = ( X10_TEMP4 ) ; final Point1 RX10_TEMP0 = new Point1 ( n ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP1 , RX10_TEMP3 , X10_TEMP5 ) ; final doubleRefArray1 X10_TEMP6 = X10_TEMP0 . start_time ; final double X10_TEMP9 = ( 0 ) ; final double X10_TEMP10 = ( X10_TEMP9 ) ; final Point1 RX10_TEMP11 = new Point1 ( n ) ; final Dist1 RX10_TEMP12 = X10_TEMP6 . distValue ; final Region1 RX10_TEMP13 = RX10_TEMP12 . dReg ; final int RX10_TEMP14 = Program . searchPointInRegion1 ( RX10_TEMP13 , RX10_TEMP11 ) ; final int RX10_TEMP15 = 0 ; final boolean RX10_TEMP16 = RX10_TEMP14 < RX10_TEMP15 ; if ( RX10_TEMP16 ) { String RX10_TEMP17 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP17 ) ; }
 final place RX10_TEMP18 = Program . getPlaceFromDist1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final place RX10_TEMP20 = here ; final boolean RX10_TEMP21 = RX10_TEMP18 != RX10_TEMP20 ; if ( RX10_TEMP21 ) { String RX10_TEMP19 = "Bad place access for array X10_TEMP6" ; throw new RuntimeException ( RX10_TEMP19 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP6 , RX10_TEMP14 , X10_TEMP10 ) ; final doubleRefArray1 X10_TEMP11 = X10_TEMP0 . elapsed_time ; final double X10_TEMP14 = ( 0 ) ; final double X10_TEMP15 = ( X10_TEMP14 ) ; final Point1 RX10_TEMP22 = new Point1 ( n ) ; final Dist1 RX10_TEMP23 = X10_TEMP11 . distValue ; final Region1 RX10_TEMP24 = RX10_TEMP23 . dReg ; final int RX10_TEMP25 = Program . searchPointInRegion1 ( RX10_TEMP24 , RX10_TEMP22 ) ; final int RX10_TEMP26 = 0 ; final boolean RX10_TEMP27 = RX10_TEMP25 < RX10_TEMP26 ; if ( RX10_TEMP27 ) { String RX10_TEMP28 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 final place RX10_TEMP29 = Program . getPlaceFromDist1 ( RX10_TEMP23 , RX10_TEMP25 ) ; final place RX10_TEMP31 = here ; final boolean RX10_TEMP32 = RX10_TEMP29 != RX10_TEMP31 ; if ( RX10_TEMP32 ) { String RX10_TEMP30 = "Bad place access for array X10_TEMP11" ; throw new RuntimeException ( RX10_TEMP30 ) ; }
 Program . setRefArrayValue1double ( X10_TEMP11 , RX10_TEMP25 , X10_TEMP15 ) ; }
 public static void Timer_resetAllTimers ( final Timer X10_TEMP0 ) { int i = ( 0 ) ; boolean X10_TEMP4 = i < _Timer_max_counters ; while ( X10_TEMP4 ) { Program . Timer_resetTimer ( X10_TEMP0 , i ) ; final int X10_TEMP6 = ( i ) ; final int X10_TEMP7 = 1 ; i = i + X10_TEMP7 ; X10_TEMP4 = i < _Timer_max_counters ; }
 }
 public static int _RayTracer_alpha_init ( ) { final int X10_TEMP1 = ( 255 ) ; final int X10_TEMP2 = ( 24 ) ; final int X10_TEMP4 = ( X10_TEMP1 << X10_TEMP2 ) ; return X10_TEMP4 ; }
 public static Vec _RayTracer_voidVec_init ( ) { final Vec X10_TEMP2 = ( new Vec ( ) ) ; return X10_TEMP2 ; }
 public static void RayTracer_JGFsetsize ( final RayTracer X10_TEMP0 , final int size_tt ) { final long X10_TEMP2 = ( 0 ) ; final long X10_TEMP3 = ( X10_TEMP2 ) ; X10_TEMP0 . checksum = ( X10_TEMP3 ) ; final int X10_TEMP6 = ( 0 ) ; final int X10_TEMP7 = ( 1 ) ; final Region1 X10_TEMP8 = Program . createNewRegion1R ( X10_TEMP6 , X10_TEMP7 ) ; final place X10_TEMP9 = ( here ) ; Dist1 d1 = Program . getPlaceDist1 ( X10_TEMP8 , X10_TEMP9 ) ; final Region1 RX10_TEMP0 = d1 . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP6 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d1 , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T1 utmp1 = new T1(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread1(utmp1); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP16 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final intRefArray1 RX10_TEMP19 = new intRefArray1 ( d1 , RX10_TEMP16 ) ; final intRefArray1 X10_TEMP12 = RX10_TEMP19 ; final intRefArray1 X10_TEMP13 = X10_TEMP12 ; X10_TEMP0 . datasizes = ( X10_TEMP13 ) ; final intRefArray1 X10_TEMP14 = X10_TEMP0 . datasizes ; final int X10_TEMP16 = ( 0 ) ; final int X10_TEMP18 = ( 20 ) ; final int X10_TEMP19 = ( X10_TEMP18 ) ; final Point1 RX10_TEMP20 = new Point1 ( X10_TEMP16 ) ; final Dist1 RX10_TEMP21 = X10_TEMP14 . distValue ; final Region1 RX10_TEMP22 = RX10_TEMP21 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { String RX10_TEMP26 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; final place RX10_TEMP29 = here ; final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; if ( RX10_TEMP30 ) { String RX10_TEMP28 = "Bad place access for array X10_TEMP14" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 Program . setRefArrayValue1int ( X10_TEMP14 , RX10_TEMP23 , X10_TEMP19 ) ; final intRefArray1 X10_TEMP20 = X10_TEMP0 . datasizes ; final int X10_TEMP22 = ( 1 ) ; final int X10_TEMP24 = ( 500 ) ; final int X10_TEMP25 = ( X10_TEMP24 ) ; final Point1 RX10_TEMP31 = new Point1 ( X10_TEMP22 ) ; final Dist1 RX10_TEMP32 = X10_TEMP20 . distValue ; final Region1 RX10_TEMP33 = RX10_TEMP32 . dReg ; final int RX10_TEMP34 = Program . searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; final int RX10_TEMP35 = 0 ; final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP37 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP37 ) ; }
 final place RX10_TEMP38 = Program . getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; final place RX10_TEMP40 = here ; final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP39 = "Bad place access for array X10_TEMP20" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 Program . setRefArrayValue1int ( X10_TEMP20 , RX10_TEMP34 , X10_TEMP25 ) ; final int X10_TEMP27 = ( size_tt ) ; X10_TEMP0 . size_tt = ( X10_TEMP27 ) ; }
 public static void RayTracer_JGFinitialise ( final RayTracer X10_TEMP0 ) { final intRefArray1 X10_TEMP1 = X10_TEMP0 . datasizes ; final int X10_TEMP3 = ( X10_TEMP0 . size_tt ) ; final Point1 RX10_TEMP0 = new Point1 ( X10_TEMP3 ) ; final Dist1 RX10_TEMP1 = X10_TEMP1 . distValue ; final Region1 RX10_TEMP2 = RX10_TEMP1 . dReg ; final int RX10_TEMP3 = Program . searchPointInRegion1 ( RX10_TEMP2 , RX10_TEMP0 ) ; final int RX10_TEMP4 = 0 ; final boolean RX10_TEMP5 = RX10_TEMP3 < RX10_TEMP4 ; if ( RX10_TEMP5 ) { String RX10_TEMP6 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP6 ) ; }
 final place RX10_TEMP7 = Program . getPlaceFromDist1 ( RX10_TEMP1 , RX10_TEMP3 ) ; final place RX10_TEMP9 = here ; final boolean RX10_TEMP10 = RX10_TEMP7 != RX10_TEMP9 ; if ( RX10_TEMP10 ) { String RX10_TEMP8 = "Bad place access for array X10_TEMP1" ; throw new RuntimeException ( RX10_TEMP8 ) ; }
 final int RX10_TEMP11 = Program . getRefArrayValue1int ( X10_TEMP1 , RX10_TEMP3 ) ; final int X10_TEMP5 = ( RX10_TEMP11 ) ; final int X10_TEMP6 = ( X10_TEMP5 ) ; X10_TEMP0 . width = ( X10_TEMP6 ) ; final intRefArray1 X10_TEMP7 = X10_TEMP0 . datasizes ; final int X10_TEMP9 = ( X10_TEMP0 . size_tt ) ; final Point1 RX10_TEMP12 = new Point1 ( X10_TEMP9 ) ; final Dist1 RX10_TEMP13 = X10_TEMP7 . distValue ; final Region1 RX10_TEMP14 = RX10_TEMP13 . dReg ; final int RX10_TEMP15 = Program . searchPointInRegion1 ( RX10_TEMP14 , RX10_TEMP12 ) ; final int RX10_TEMP16 = 0 ; final boolean RX10_TEMP17 = RX10_TEMP15 < RX10_TEMP16 ; if ( RX10_TEMP17 ) { String RX10_TEMP18 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP18 ) ; }
 final place RX10_TEMP19 = Program . getPlaceFromDist1 ( RX10_TEMP13 , RX10_TEMP15 ) ; final place RX10_TEMP21 = here ; final boolean RX10_TEMP22 = RX10_TEMP19 != RX10_TEMP21 ; if ( RX10_TEMP22 ) { String RX10_TEMP20 = "Bad place access for array X10_TEMP7" ; throw new RuntimeException ( RX10_TEMP20 ) ; }
 final int RX10_TEMP23 = Program . getRefArrayValue1int ( X10_TEMP7 , RX10_TEMP15 ) ; final int X10_TEMP11 = ( RX10_TEMP23 ) ; final int X10_TEMP12 = ( X10_TEMP11 ) ; X10_TEMP0 . height = ( X10_TEMP12 ) ; final Scene X10_TEMP14 = ( Program . RayTracer_createScene ( X10_TEMP0 ) ) ; final Scene X10_TEMP15 = ( X10_TEMP14 ) ; X10_TEMP0 . scene = ( X10_TEMP15 ) ; final Scene X10_TEMP17 = ( X10_TEMP0 . scene ) ; Program . RayTracer_setScene ( X10_TEMP0 , X10_TEMP17 ) ; final Scene X10_TEMP18 = ( X10_TEMP0 . scene ) ; final int X10_TEMP20 = ( Program . Scene_getObjects ( X10_TEMP18 ) ) ; final int X10_TEMP21 = ( X10_TEMP20 ) ; X10_TEMP0 . numobjects = ( X10_TEMP21 ) ; }
 public static void RayTracer_JGFapplication ( final RayTracer X10_TEMP0 ) { int X10_TEMP7 = ( 0 ) ; int X10_TEMP8 = ( X10_TEMP0 . width ) ; int X10_TEMP9 = ( X10_TEMP0 . height ) ; int X10_TEMP10 = ( 0 ) ; int X10_TEMP11 = ( X10_TEMP0 . height ) ; int X10_TEMP12 = ( 1 ) ; Interval interval = ( new Interval ( X10_TEMP7 , X10_TEMP8 , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 , X10_TEMP12 ) ) ; Program . RayTracer_render ( X10_TEMP0 , interval ) ; }
 public static void RayTracer_JGFvalidate ( final RayTracer X10_TEMP0 ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( 1 ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( here ) ; Dist1 d1 = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d1 . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final longStub [ : rank==1 ] RX10_TEMP6 = ( longStub [ : rank==1 ] ) ( new longStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d1 , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T2 utmp2 = new T2(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread2(utmp2); }
 }
 }
 final longStub value [ : rank==1 ] RX10_TEMP16 = ( longStub value [ : rank==1 ] ) ( new longStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final longStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final longRefArray1 RX10_TEMP19 = new longRefArray1 ( d1 , RX10_TEMP16 ) ; longRefArray1 refval = RX10_TEMP19 ; final int X10_TEMP10 = ( 0 ) ; final long X10_TEMP12 = ( 51428 ) ; final long X10_TEMP13 = ( X10_TEMP12 ) ; final Point1 RX10_TEMP20 = new Point1 ( X10_TEMP10 ) ; final Dist1 RX10_TEMP21 = refval . distValue ; final Region1 RX10_TEMP22 = RX10_TEMP21 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { String RX10_TEMP26 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; final place RX10_TEMP29 = here ; final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; if ( RX10_TEMP30 ) { String RX10_TEMP28 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 Program . setRefArrayValue1long ( refval , RX10_TEMP23 , X10_TEMP13 ) ; final int X10_TEMP15 = ( 1 ) ; final long X10_TEMP17 = ( 29827635 ) ; final long X10_TEMP18 = ( X10_TEMP17 ) ; final Point1 RX10_TEMP31 = new Point1 ( X10_TEMP15 ) ; final Dist1 RX10_TEMP32 = refval . distValue ; final Region1 RX10_TEMP33 = RX10_TEMP32 . dReg ; final int RX10_TEMP34 = Program . searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; final int RX10_TEMP35 = 0 ; final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP37 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP37 ) ; }
 final place RX10_TEMP38 = Program . getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; final place RX10_TEMP40 = here ; final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP39 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 Program . setRefArrayValue1long ( refval , RX10_TEMP34 , X10_TEMP18 ) ; final long X10_TEMP21 = ( X10_TEMP0 . checksum ) ; final int X10_TEMP20 = ( X10_TEMP0 . size_tt ) ; final Point1 RX10_TEMP42 = new Point1 ( X10_TEMP20 ) ; final Dist1 RX10_TEMP43 = refval . distValue ; final Region1 RX10_TEMP44 = RX10_TEMP43 . dReg ; final int RX10_TEMP45 = Program . searchPointInRegion1 ( RX10_TEMP44 , RX10_TEMP42 ) ; final int RX10_TEMP46 = 0 ; final boolean RX10_TEMP47 = RX10_TEMP45 < RX10_TEMP46 ; if ( RX10_TEMP47 ) { String RX10_TEMP48 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP48 ) ; }
 final place RX10_TEMP49 = Program . getPlaceFromDist1 ( RX10_TEMP43 , RX10_TEMP45 ) ; final place RX10_TEMP51 = here ; final boolean RX10_TEMP52 = RX10_TEMP49 != RX10_TEMP51 ; if ( RX10_TEMP52 ) { String RX10_TEMP50 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP50 ) ; }
 final long RX10_TEMP53 = Program . getRefArrayValue1long ( refval , RX10_TEMP45 ) ; final long X10_TEMP22 = ( RX10_TEMP53 ) ; long dev = ( X10_TEMP21 - X10_TEMP22 ) ; final int X10_TEMP24 = ( 0 ) ; final boolean X10_TEMP26 = dev != X10_TEMP24 ; if ( X10_TEMP26 ) { final String X10_TEMP28 = ( "Validation failed" ) ; System.out.println ( X10_TEMP28 ) ; final String X10_TEMP29 = ( "Pixel checksum = " ) ; final long X10_TEMP30 = ( X10_TEMP0 . checksum ) ; final String X10_TEMP32 = ( X10_TEMP29 + X10_TEMP30 ) ; System.out.println ( X10_TEMP32 ) ; final String X10_TEMP35 = ( "Reference value = " ) ; final int X10_TEMP34 = ( X10_TEMP0 . size_tt ) ; final Point1 RX10_TEMP54 = new Point1 ( X10_TEMP34 ) ; final Dist1 RX10_TEMP55 = refval . distValue ; final Region1 RX10_TEMP56 = RX10_TEMP55 . dReg ; final int RX10_TEMP57 = Program . searchPointInRegion1 ( RX10_TEMP56 , RX10_TEMP54 ) ; final int RX10_TEMP58 = 0 ; final boolean RX10_TEMP59 = RX10_TEMP57 < RX10_TEMP58 ; if ( RX10_TEMP59 ) { String RX10_TEMP60 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP60 ) ; }
 final place RX10_TEMP61 = Program . getPlaceFromDist1 ( RX10_TEMP55 , RX10_TEMP57 ) ; final place RX10_TEMP63 = here ; final boolean RX10_TEMP64 = RX10_TEMP61 != RX10_TEMP63 ; if ( RX10_TEMP64 ) { String RX10_TEMP62 = "Bad place access for array refval" ; throw new RuntimeException ( RX10_TEMP62 ) ; }
 final long RX10_TEMP65 = Program . getRefArrayValue1long ( refval , RX10_TEMP57 ) ; final long X10_TEMP36 = ( RX10_TEMP65 ) ; final String X10_TEMP38 = ( X10_TEMP35 + X10_TEMP36 ) ; System.out.println ( X10_TEMP38 ) ; final String X10_TEMP40 = ( "Validation failed" ) ; throw new RuntimeException ( X10_TEMP40 ) ; }
 }
 public static void RayTracer_JGFtidyup ( final RayTracer X10_TEMP0 ) { }
 public static void RayTracer_run ( final RayTracer X10_TEMP0 ) { final int X10_TEMP2 = ( 0 ) ; Program . RayTracer_JGFsetsize ( X10_TEMP0 , X10_TEMP2 ) ; Program . RayTracer_JGFinitialise ( X10_TEMP0 ) ; Program . RayTracer_JGFapplication ( X10_TEMP0 ) ; Program . RayTracer_JGFvalidate ( X10_TEMP0 ) ; Program . RayTracer_JGFtidyup ( X10_TEMP0 ) ; }
 public static Scene RayTracer_createScene ( final RayTracer X10_TEMP0 ) { final int x = ( 0 ) ; final int y = ( 0 ) ; int X10_TEMP9 = ( 20 ) ; final int X10_TEMP5 = ( 30 ) ; final int X10_TEMP6 = 0 ; int X10_TEMP10 = ( X10_TEMP6 - X10_TEMP5 ) ; boolean X10_TEMP11 = ( false ) ; Vec X10_TEMP36 = ( new Vec ( x , X10_TEMP9 , X10_TEMP10 , X10_TEMP11 ) ) ; int X10_TEMP17 = ( 0 ) ; boolean X10_TEMP18 = ( false ) ; Vec X10_TEMP37 = ( new Vec ( x , y , X10_TEMP17 , X10_TEMP18 ) ) ; int X10_TEMP24 = ( 0 ) ; int X10_TEMP25 = ( 1 ) ; int X10_TEMP26 = ( 0 ) ; boolean X10_TEMP27 = ( false ) ; Vec X10_TEMP38 = ( new Vec ( X10_TEMP24 , X10_TEMP25 , X10_TEMP26 , X10_TEMP27 ) ) ; double X10_TEMP39 = ( 1.0 ) ; final double X10_TEMP30 = ( 35.0 ) ; final double X10_TEMP31 = ( 3.14159265 ) ; final double X10_TEMP32 = ( X10_TEMP30 * X10_TEMP31 ) ; final double X10_TEMP33 = ( 180.0 ) ; double X10_TEMP40 = ( X10_TEMP32 / X10_TEMP33 ) ; double X10_TEMP41 = ( 1.0 ) ; View X10_TEMP43 = ( new View ( X10_TEMP36 , X10_TEMP37 , X10_TEMP38 , X10_TEMP39 , X10_TEMP40 , X10_TEMP41 ) ) ; Scene scene = ( new Scene ( X10_TEMP43 ) ) ; final int nx = ( 4 ) ; final int ny = ( 4 ) ; final int nz = ( 4 ) ; final int X10_TEMP51 = ( 0 ) ; final int X10_TEMP49 = ( 1 ) ; final int X10_TEMP52 = ( nx - X10_TEMP49 ) ; final int X10_TEMP56 = ( 0 ) ; final int X10_TEMP54 = ( 1 ) ; final int X10_TEMP57 = ( ny - X10_TEMP54 ) ; final int X10_TEMP61 = ( 0 ) ; final int X10_TEMP59 = ( 1 ) ; final int X10_TEMP62 = ( nz - X10_TEMP59 ) ; final Region3 reg = Program . createNewRegion3RRR ( X10_TEMP51 , X10_TEMP52 , X10_TEMP56 , X10_TEMP57 , X10_TEMP61 , X10_TEMP62 ) ; final int RX10_TEMP3 = 1 ; int RX10_TEMP1 = reg . regSize ; RX10_TEMP1 = RX10_TEMP1 - RX10_TEMP3 ; final region ( : rank==1 ) RX10_TEMP2 = [ 0 : RX10_TEMP1 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP2 ) { final int RX10_TEMP4 = RX10_TEMP0 [0] ; final Point3 pp = Program . regionOrdinalPoint3 ( reg , RX10_TEMP4 ) ; final double X10_TEMP68 = ( 20.0 ) ; final int X10_TEMP65 = ( 1 ) ; final int X10_TEMP67 = ( nx - X10_TEMP65 ) ; final double X10_TEMP70 = ( X10_TEMP68 / X10_TEMP67 ) ; final int X10_TEMP71 = ( pp . f0 ) ; final double X10_TEMP72 = ( X10_TEMP70 * X10_TEMP71 ) ; final double X10_TEMP73 = ( 10.0 ) ; double xx = ( X10_TEMP72 - X10_TEMP73 ) ; final double X10_TEMP78 = ( 20.0 ) ; final int X10_TEMP75 = ( 1 ) ; final int X10_TEMP77 = ( ny - X10_TEMP75 ) ; final double X10_TEMP80 = ( X10_TEMP78 / X10_TEMP77 ) ; final int X10_TEMP81 = ( pp . f1 ) ; final double X10_TEMP82 = ( X10_TEMP80 * X10_TEMP81 ) ; final double X10_TEMP83 = ( 10.0 ) ; double yy = ( X10_TEMP82 - X10_TEMP83 ) ; final double X10_TEMP88 = ( 20.0 ) ; final int X10_TEMP85 = ( 1 ) ; final int X10_TEMP87 = ( nz - X10_TEMP85 ) ; final double X10_TEMP90 = ( X10_TEMP88 / X10_TEMP87 ) ; final int X10_TEMP91 = ( pp . f2 ) ; final double X10_TEMP92 = ( X10_TEMP90 * X10_TEMP91 ) ; final double X10_TEMP93 = ( 10.0 ) ; double zz = ( X10_TEMP92 - X10_TEMP93 ) ; boolean X10_TEMP99 = ( false ) ; Vec X10_TEMP136 = ( new Vec ( xx , yy , zz , X10_TEMP99 ) ) ; int X10_TEMP137 = ( 3 ) ; double X10_TEMP130 = ( 15.0 ) ; final double X10_TEMP103 = ( 1.5 ) ; final double X10_TEMP104 = ( 1.0 ) ; double X10_TEMP131 = ( X10_TEMP103 - X10_TEMP104 ) ; final double X10_TEMP106 = ( 1.5 ) ; final double X10_TEMP107 = ( 1.0 ) ; double X10_TEMP132 = ( X10_TEMP106 - X10_TEMP107 ) ; int X10_TEMP124 = ( 0 ) ; int X10_TEMP125 = ( 0 ) ; final int X10_TEMP113 = ( pp . f0 ) ; final int X10_TEMP114 = ( pp . f1 ) ; final int X10_TEMP116 = ( X10_TEMP113 + X10_TEMP114 ) ; final int X10_TEMP117 = ( nx + ny ) ; final int X10_TEMP118 = ( 2 ) ; final int X10_TEMP120 = ( X10_TEMP117 - X10_TEMP118 ) ; final double X10_TEMP121 = ( ( double ) X10_TEMP120 ) ; double X10_TEMP126 = ( X10_TEMP116 / X10_TEMP121 ) ; boolean X10_TEMP127 = ( false ) ; Vec X10_TEMP133 = ( new Vec ( X10_TEMP124 , X10_TEMP125 , X10_TEMP126 , X10_TEMP127 ) ) ; boolean X10_TEMP134 = ( false ) ; Surface X10_TEMP138 = ( new Surface ( X10_TEMP130 , X10_TEMP131 , X10_TEMP132 , X10_TEMP133 , X10_TEMP134 ) ) ; Sphere p = ( new Sphere ( X10_TEMP136 , X10_TEMP137 , X10_TEMP138 ) ) ; Program . Scene_addObject ( scene , p ) ; }
 int X10_TEMP147 = ( 100 ) ; int X10_TEMP148 = ( 100 ) ; final int X10_TEMP143 = ( 50 ) ; final int X10_TEMP144 = 0 ; int X10_TEMP149 = ( X10_TEMP144 - X10_TEMP143 ) ; double X10_TEMP150 = ( 1.0 ) ; final Light X10_TEMP152 = ( new Light ( X10_TEMP147 , X10_TEMP148 , X10_TEMP149 , X10_TEMP150 ) ) ; Program . Scene_addLight ( scene , X10_TEMP152 ) ; final int X10_TEMP153 = ( 100 ) ; final int X10_TEMP154 = 0 ; int X10_TEMP161 = ( X10_TEMP154 - X10_TEMP153 ) ; int X10_TEMP162 = ( 100 ) ; final int X10_TEMP157 = ( 50 ) ; final int X10_TEMP158 = 0 ; int X10_TEMP163 = ( X10_TEMP158 - X10_TEMP157 ) ; double X10_TEMP164 = ( 1.0 ) ; final Light X10_TEMP166 = ( new Light ( X10_TEMP161 , X10_TEMP162 , X10_TEMP163 , X10_TEMP164 ) ) ; Program . Scene_addLight ( scene , X10_TEMP166 ) ; int X10_TEMP175 = ( 100 ) ; final int X10_TEMP168 = ( 100 ) ; final int X10_TEMP169 = 0 ; int X10_TEMP176 = ( X10_TEMP169 - X10_TEMP168 ) ; final int X10_TEMP171 = ( 50 ) ; final int X10_TEMP172 = 0 ; int X10_TEMP177 = ( X10_TEMP172 - X10_TEMP171 ) ; double X10_TEMP178 = ( 1.0 ) ; final Light X10_TEMP180 = ( new Light ( X10_TEMP175 , X10_TEMP176 , X10_TEMP177 , X10_TEMP178 ) ) ; Program . Scene_addLight ( scene , X10_TEMP180 ) ; final int X10_TEMP181 = ( 100 ) ; final int X10_TEMP182 = 0 ; int X10_TEMP191 = ( X10_TEMP182 - X10_TEMP181 ) ; final int X10_TEMP184 = ( 100 ) ; final int X10_TEMP185 = 0 ; int X10_TEMP192 = ( X10_TEMP185 - X10_TEMP184 ) ; final int X10_TEMP187 = ( 50 ) ; final int X10_TEMP188 = 0 ; int X10_TEMP193 = ( X10_TEMP188 - X10_TEMP187 ) ; double X10_TEMP194 = ( 1.0 ) ; final Light X10_TEMP196 = ( new Light ( X10_TEMP191 , X10_TEMP192 , X10_TEMP193 , X10_TEMP194 ) ) ; Program . Scene_addLight ( scene , X10_TEMP196 ) ; int X10_TEMP201 = ( 200 ) ; int X10_TEMP202 = ( 200 ) ; int X10_TEMP203 = ( 0 ) ; double X10_TEMP204 = ( 1.0 ) ; final Light X10_TEMP206 = ( new Light ( X10_TEMP201 , X10_TEMP202 , X10_TEMP203 , X10_TEMP204 ) ) ; Program . Scene_addLight ( scene , X10_TEMP206 ) ; return scene ; }
 public static void RayTracer_setScene ( final RayTracer X10_TEMP0 , final Scene scene ) { final int X10_TEMP2 = ( Program . Scene_getLights ( scene ) ) ; final int X10_TEMP3 = ( X10_TEMP2 ) ; X10_TEMP0 . lightCount = ( X10_TEMP3 ) ; final int X10_TEMP5 = ( Program . Scene_getObjects ( scene ) ) ; final int X10_TEMP6 = ( X10_TEMP5 ) ; X10_TEMP0 . objCount = ( X10_TEMP6 ) ; final Scene sc = ( scene ) ; final Dist1 X10_TEMP8 = Program . getUniqueDist ( ) ; final Dist1 U = X10_TEMP8 ; final int mylightCount = ( X10_TEMP0 . lightCount ) ; final int myobjCount = ( X10_TEMP0 . objCount ) ; finish { final Region1 RX10_TEMP1 = U . dReg ; final int RX10_TEMP4 = 1 ; int RX10_TEMP2 = RX10_TEMP1 . regSize ; RX10_TEMP2 = RX10_TEMP2 - RX10_TEMP4 ; final region ( : rank==1 ) RX10_TEMP3 = [ 0 : RX10_TEMP2 ] ; for ( point ( : rank==1 ) RX10_TEMP0 : RX10_TEMP3 ) { final int RX10_TEMP5 = RX10_TEMP0 [0] ; final Point1 pl = Program . regionOrdinalPoint1 ( RX10_TEMP1 , RX10_TEMP5 ) ; final Region1 RX10_TEMP6 = U . dReg ; final int RX10_TEMP7 = Program . searchPointInRegion1 ( RX10_TEMP6 , pl ) ; final int RX10_TEMP8 = 0 ; final boolean RX10_TEMP9 = RX10_TEMP7 < RX10_TEMP8 ; if ( RX10_TEMP9 ) { final String RX10_TEMP10 = "Point pl not found in the distribution U." ; throw new RuntimeException ( RX10_TEMP10 ) ; }
 final place RX10_TEMP11 = Program . getPlaceFromDist1 ( U , RX10_TEMP7 ) ; final place X10_TEMP13 = RX10_TEMP11 ; 
 final T3 utmp3 = new T3(myobjCount, mylightCount, sc, X10_TEMP0);
 async (X10_TEMP13) {Program.thread3(utmp3); }
 }
 }
 final View X10_TEMP82 = ( Program . Scene_getView ( scene ) ) ; final View X10_TEMP83 = ( X10_TEMP82 ) ; X10_TEMP0 . view = ( X10_TEMP83 ) ; }
 public static void RayTracer_render ( final RayTracer X10_TEMP0 , final Interval interval ) { final int X10_TEMP11 = ( 0 ) ; final int X10_TEMP6 = ( interval . width ) ; final int X10_TEMP2 = ( interval . yto ) ; final int X10_TEMP3 = ( interval . yfrom ) ; final int X10_TEMP5 = ( X10_TEMP2 - X10_TEMP3 ) ; final int X10_TEMP8 = ( X10_TEMP6 * X10_TEMP5 ) ; final int X10_TEMP9 = ( 1 ) ; final int X10_TEMP12 = ( X10_TEMP8 - X10_TEMP9 ) ; final Region1 R = Program . createNewRegion1R ( X10_TEMP11 , X10_TEMP12 ) ; final Dist1 X10_TEMP15 = Program . getBlockDist1 ( R ) ; final Dist1 DBlock = X10_TEMP15 ; final Dist1 X10_TEMP17 = Program . getUniqueDist ( ) ; final Dist1 U = X10_TEMP17 ; final Region1 RX10_TEMP0 = DBlock . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final intStub [ : rank==1 ] RX10_TEMP6 = ( intStub [ : rank==1 ] ) ( new intStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( DBlock , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T4 utmp4 = new T4(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread4(utmp4); }
 }
 }
 final intStub value [ : rank==1 ] RX10_TEMP16 = ( intStub value [ : rank==1 ] ) ( new intStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final intStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final intRefArray1 RX10_TEMP19 = new intRefArray1 ( DBlock , RX10_TEMP16 ) ; final intRefArray1 row = RX10_TEMP19 ; final Region1 RX10_TEMP20 = U . dReg ; final Region1 chkSumReg = RX10_TEMP20 ; final place pHere = ( here ) ; final place fp = ( place.FIRST_PLACE ) ; final Dist1 chkSumDist = Program . getPlaceDist1 ( chkSumReg , fp ) ; final Region1 RX10_TEMP21 = chkSumDist . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final longStub [ : rank==1 ] RX10_TEMP27 = ( longStub [ : rank==1 ] ) ( new longStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( chkSumDist , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T5 utmp5 = new T5(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {Program.thread5(utmp5); }
 }
 }
 final longStub value [ : rank==1 ] RX10_TEMP37 = ( longStub value [ : rank==1 ] ) ( new longStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP39 ) { final longStub RX10_TEMP38 = RX10_TEMP27 [ RX10_TEMP39 ] ; return RX10_TEMP38 ; }
 ) ; final longRefArray1 RX10_TEMP40 = new longRefArray1 ( chkSumDist , RX10_TEMP37 ) ; final longRefArray1 X10_TEMP25 = RX10_TEMP40 ; final longRefArray1 X10_TEMP26 = X10_TEMP25 ; X10_TEMP0 . checkSumArray = ( X10_TEMP26 ) ; final View myview = ( X10_TEMP0 . view ) ; finish { final Region1 RX10_TEMP42 = U . dReg ; final int RX10_TEMP45 = 1 ; int RX10_TEMP43 = RX10_TEMP42 . regSize ; RX10_TEMP43 = RX10_TEMP43 - RX10_TEMP45 ; final region ( : rank==1 ) RX10_TEMP44 = [ 0 : RX10_TEMP43 ] ; for ( point ( : rank==1 ) RX10_TEMP41 : RX10_TEMP44 ) { final int RX10_TEMP46 = RX10_TEMP41 [0] ; final Point1 pl = Program . regionOrdinalPoint1 ( RX10_TEMP42 , RX10_TEMP46 ) ; final Region1 RX10_TEMP47 = U . dReg ; final int RX10_TEMP48 = Program . searchPointInRegion1 ( RX10_TEMP47 , pl ) ; final int RX10_TEMP49 = 0 ; final boolean RX10_TEMP50 = RX10_TEMP48 < RX10_TEMP49 ; if ( RX10_TEMP50 ) { final String RX10_TEMP51 = "Point pl not found in the distribution U." ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final place RX10_TEMP52 = Program . getPlaceFromDist1 ( U , RX10_TEMP48 ) ; final place X10_TEMP29 = RX10_TEMP52 ; 
 final T6 utmp6 = new T6(pl, myview, fp, DBlock, interval, X10_TEMP0);
 async (X10_TEMP29) {Program.thread6(utmp6); }
 }
 }
 final longRefArray1 X10_TEMP170 = X10_TEMP0 . checkSumArray ; final Dist1 RX10_TEMP69 = X10_TEMP170 . distValue ; final Dist1 X10_TEMP171 = RX10_TEMP69 ; final Region1 RX10_TEMP70 = X10_TEMP171 . dReg ; final Region1 regSum = RX10_TEMP70 ; final int RX10_TEMP74 = 1 ; int RX10_TEMP72 = chkSumReg . regSize ; RX10_TEMP72 = RX10_TEMP72 - RX10_TEMP74 ; final region ( : rank==1 ) RX10_TEMP73 = [ 0 : RX10_TEMP72 ] ; for ( point ( : rank==1 ) RX10_TEMP71 : RX10_TEMP73 ) { final int RX10_TEMP75 = RX10_TEMP71 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( chkSumReg , RX10_TEMP75 ) ; final long X10_TEMP176 = ( X10_TEMP0 . checksum ) ; final longRefArray1 X10_TEMP174 = X10_TEMP0 . checkSumArray ; final Dist1 RX10_TEMP76 = X10_TEMP174 . distValue ; final Region1 RX10_TEMP77 = RX10_TEMP76 . dReg ; final int RX10_TEMP78 = Program . searchPointInRegion1 ( RX10_TEMP77 , i ) ; final int RX10_TEMP79 = 0 ; final boolean RX10_TEMP80 = RX10_TEMP78 < RX10_TEMP79 ; if ( RX10_TEMP80 ) { String RX10_TEMP81 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP81 ) ; }
 final place RX10_TEMP82 = Program . getPlaceFromDist1 ( RX10_TEMP76 , RX10_TEMP78 ) ; final place RX10_TEMP84 = here ; final boolean RX10_TEMP85 = RX10_TEMP82 != RX10_TEMP84 ; if ( RX10_TEMP85 ) { String RX10_TEMP83 = "Bad place access for array X10_TEMP174" ; throw new RuntimeException ( RX10_TEMP83 ) ; }
 final long RX10_TEMP86 = Program . getRefArrayValue1long ( X10_TEMP174 , RX10_TEMP78 ) ; final long X10_TEMP177 = ( RX10_TEMP86 ) ; final long X10_TEMP179 = ( X10_TEMP176 + X10_TEMP177 ) ; final long X10_TEMP180 = ( X10_TEMP179 ) ; X10_TEMP0 . checksum = ( X10_TEMP180 ) ; }
 }
 public static boolean RayTracer_intersect ( final RayTracer X10_TEMP0 , final Ray r , final double maxt , final Isect inter ) { int nhits = ( 0 ) ; final double X10_TEMP3 = ( 1e9 ) ; final double X10_TEMP4 = ( X10_TEMP3 ) ; inter . t = ( X10_TEMP4 ) ; final place h = ( here ) ; final int X10_TEMP8 = ( 0 ) ; final int X10_TEMP9 = ( 0 ) ; final Region1 X10_TEMP10 = Program . createNewRegion1R ( X10_TEMP8 , X10_TEMP9 ) ; final place X10_TEMP11 = ( here ) ; final Dist1 dTemp = Program . getPlaceDist1 ( X10_TEMP10 , X10_TEMP11 ) ; final Region1 RX10_TEMP0 = dTemp . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final EnvelopeStub [ : rank==1 ] RX10_TEMP6 = ( EnvelopeStub [ : rank==1 ] ) ( new EnvelopeStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dTemp , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T7 utmp7 = new T7(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread7(utmp7); }
 }
 }
 final EnvelopeStub value [ : rank==1 ] RX10_TEMP16 = ( EnvelopeStub value [ : rank==1 ] ) ( new EnvelopeStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final EnvelopeStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final EnvelopeRefArray1 RX10_TEMP19 = new EnvelopeRefArray1 ( dTemp , RX10_TEMP16 ) ; final EnvelopeRefArray1 temp = RX10_TEMP19 ; finish { final place X10_TEMP15 = place.FIRST_PLACE ; 
 final T8 utmp8 = new T8(temp, h, X10_TEMP0);
 async (X10_TEMP15) {Program.thread8(utmp8); }
 }
 final int X10_TEMP27 = ( 0 ) ; final Point1 RX10_TEMP31 = new Point1 ( X10_TEMP27 ) ; final Dist1 RX10_TEMP32 = temp . distValue ; final Region1 RX10_TEMP33 = RX10_TEMP32 . dReg ; final int RX10_TEMP34 = Program . searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; final int RX10_TEMP35 = 0 ; final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP37 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP37 ) ; }
 final place RX10_TEMP38 = Program . getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; final place RX10_TEMP40 = here ; final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP39 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 final Envelope RX10_TEMP42 = Program . getRefArrayValue1Envelope ( temp , RX10_TEMP34 ) ; final Envelope X10_TEMP28 = ( RX10_TEMP42 ) ; final int myobjCount = ( X10_TEMP28 . i ) ; final int X10_TEMP31 = ( 0 ) ; final Point1 RX10_TEMP43 = new Point1 ( X10_TEMP31 ) ; final Dist1 RX10_TEMP44 = temp . distValue ; final Region1 RX10_TEMP45 = RX10_TEMP44 . dReg ; final int RX10_TEMP46 = Program . searchPointInRegion1 ( RX10_TEMP45 , RX10_TEMP43 ) ; final int RX10_TEMP47 = 0 ; final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP49 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP49 ) ; }
 final place RX10_TEMP50 = Program . getPlaceFromDist1 ( RX10_TEMP44 , RX10_TEMP46 ) ; final place RX10_TEMP52 = here ; final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52 ; if ( RX10_TEMP53 ) { String RX10_TEMP51 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final Envelope RX10_TEMP54 = Program . getRefArrayValue1Envelope ( temp , RX10_TEMP46 ) ; final Envelope X10_TEMP32 = ( RX10_TEMP54 ) ; final SphereValArray1 X10_TEMP34 = X10_TEMP32 . a ; final SphereValArray1 myprim = X10_TEMP34 ; final int X10_TEMP39 = ( 0 ) ; final int X10_TEMP37 = ( 1 ) ; final int X10_TEMP40 = ( myobjCount - X10_TEMP37 ) ; final Region1 X10_TEMP42 = Program . createNewRegion1R ( X10_TEMP39 , X10_TEMP40 ) ; final int RX10_TEMP58 = 1 ; int RX10_TEMP56 = X10_TEMP42 . regSize ; RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58 ; final region ( : rank==1 ) RX10_TEMP57 = [ 0 : RX10_TEMP56 ] ; for ( point ( : rank==1 ) RX10_TEMP55 : RX10_TEMP57 ) { final int RX10_TEMP59 = RX10_TEMP55 [0] ; final Point1 i = Program . regionOrdinalPoint1 ( X10_TEMP42 , RX10_TEMP59 ) ; final Region1 RX10_TEMP60 = myprim . regionValue ; final int RX10_TEMP61 = Program . searchPointInRegion1 ( RX10_TEMP60 , i ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final Sphere value [ : rank==1 ] RX10_TEMP65 = ( Sphere value [ : rank==1 ] ) ( myprim . contents ) ; final Sphere X10_TEMP44 = ( RX10_TEMP65 [ RX10_TEMP61 ] ) ; Isect tp = ( Program . Sphere_intersect ( X10_TEMP44 , r ) ) ; final boolean X10_TEMP47 = ( tp . isNull ) ; final boolean X10_TEMP50 = ( ! X10_TEMP47 ) ; final double X10_TEMP48 = ( tp . t ) ; final double X10_TEMP49 = ( inter . t ) ; final boolean X10_TEMP51 = ( X10_TEMP48 < X10_TEMP49 ) ; final boolean X10_TEMP53 = X10_TEMP50 && X10_TEMP51 ; if ( X10_TEMP53 ) { final double X10_TEMP55 = ( tp . t ) ; final double X10_TEMP56 = ( X10_TEMP55 ) ; inter . t = ( X10_TEMP56 ) ; final Sphere X10_TEMP58 = ( tp . prim ) ; final Sphere X10_TEMP59 = ( X10_TEMP58 ) ; inter . prim = ( X10_TEMP59 ) ; final Surface X10_TEMP61 = ( tp . surf ) ; final Surface X10_TEMP62 = ( X10_TEMP61 ) ; inter . surf = ( X10_TEMP62 ) ; final int X10_TEMP64 = ( tp . enter ) ; final int X10_TEMP65 = ( X10_TEMP64 ) ; inter . enter = ( X10_TEMP65 ) ; final int X10_TEMP66 = ( nhits ) ; final int X10_TEMP67 = 1 ; nhits = nhits + X10_TEMP67 ; }
 }
 final int X10_TEMP68 = ( 0 ) ; final boolean X10_TEMP69 = nhits > X10_TEMP68 ; boolean X10_TEMP72 = false ; if ( X10_TEMP69 ) { X10_TEMP72 = true ; }
 final boolean X10_TEMP73 = X10_TEMP72 ; return X10_TEMP73 ; }
 public static int RayTracer_Shadow ( final RayTracer X10_TEMP0 , final Ray r , final double tmax , final Isect inter ) { final boolean X10_TEMP5 = Program . RayTracer_intersect ( X10_TEMP0 , r , tmax , inter ) ; if ( X10_TEMP5 ) { final int X10_TEMP7 = ( 0 ) ; return X10_TEMP7 ; }
 final int X10_TEMP9 = ( 1 ) ; return X10_TEMP9 ; }
 public static Vec RayTracer_SpecularDirection ( final RayTracer X10_TEMP0 , final Vec I , final Vec N ) { final double X10_TEMP5 = ( 1.0 ) ; final double X10_TEMP4 = ( Program . Vec_dot ( I , N ) ) ; final double X10_TEMP6 = ( Math . abs ( X10_TEMP4 ) ) ; final double X10_TEMP11 = ( X10_TEMP5 / X10_TEMP6 ) ; final double X10_TEMP12 = ( 2.0 ) ; final Vec X10_TEMP13 = ( Program . Vec_comb ( X10_TEMP11 , I , X10_TEMP12 , N ) ) ; final Vec X10_TEMP15 = ( Program . Vec_normalized ( X10_TEMP13 ) ) ; return X10_TEMP15 ; }
 public static Vec RayTracer_TransDir ( final RayTracer X10_TEMP0 , final Surface m1 , final Surface m2 , final Vec I , final Vec N ) { final boolean X10_TEMP1 = m1 . isNull ; double X10_TEMP4 = m1 . ior ; if ( X10_TEMP1 ) { X10_TEMP4 = 1.0 ; }
 final double X10_TEMP5 = X10_TEMP4 ; double n1 = ( X10_TEMP5 ) ; final boolean X10_TEMP6 = m2 . isNull ; double X10_TEMP9 = m2 . ior ; if ( X10_TEMP6 ) { X10_TEMP9 = 1.0 ; }
 final double X10_TEMP10 = X10_TEMP9 ; double n2 = ( X10_TEMP10 ) ; double eta = ( n1 / n2 ) ; final double X10_TEMP14 = ( Program . Vec_dot ( I , N ) ) ; final int X10_TEMP15 = 0 ; double c1 = ( X10_TEMP15 - X10_TEMP14 ) ; final double X10_TEMP22 = ( 1.0 ) ; final double X10_TEMP21 = ( eta * eta ) ; final double X10_TEMP17 = ( 1.0 ) ; final double X10_TEMP18 = ( c1 * c1 ) ; final double X10_TEMP20 = ( X10_TEMP17 - X10_TEMP18 ) ; final double X10_TEMP23 = ( X10_TEMP21 * X10_TEMP20 ) ; double cs2 = ( X10_TEMP22 - X10_TEMP23 ) ; final double X10_TEMP25 = ( 0.0 ) ; final boolean X10_TEMP27 = cs2 < X10_TEMP25 ; if ( X10_TEMP27 ) { double X10_TEMP32 = ( 0.0 ) ; double X10_TEMP33 = ( 0.0 ) ; double X10_TEMP34 = ( 0.0 ) ; boolean X10_TEMP35 = ( true ) ; final Vec X10_TEMP37 = ( new Vec ( X10_TEMP32 , X10_TEMP33 , X10_TEMP34 , X10_TEMP35 ) ) ; return X10_TEMP37 ; }
 final double X10_TEMP41 = ( eta * c1 ) ; final double X10_TEMP42 = ( Math . sqrt ( cs2 ) ) ; final double X10_TEMP45 = ( X10_TEMP41 - X10_TEMP42 ) ; final Vec X10_TEMP46 = ( Program . Vec_comb ( eta , I , X10_TEMP45 , N ) ) ; final Vec X10_TEMP48 = ( Program . Vec_normalized ( X10_TEMP46 ) ) ; return X10_TEMP48 ; }
 public static Vec RayTracer_shade ( final RayTracer X10_TEMP0 , final int level , final double weight , final Vec P , final Vec N , final Vec I , final Isect hit , final Ray tRay ) { Surface surf = ( hit . surf ) ; Vec bigr = ( new Vec ( ) ) ; final double X10_TEMP3 = ( surf . shine ) ; final double X10_TEMP4 = ( 1e-6 ) ; final boolean X10_TEMP6 = X10_TEMP3 > X10_TEMP4 ; if ( X10_TEMP6 ) { final Vec X10_TEMP10 = ( Program . RayTracer_SpecularDirection ( X10_TEMP0 , I , N ) ) ; bigr = ( X10_TEMP10 ) ; }
 final place h = ( here ) ; final int X10_TEMP14 = ( 0 ) ; final int X10_TEMP15 = ( 0 ) ; final Region1 X10_TEMP16 = Program . createNewRegion1R ( X10_TEMP14 , X10_TEMP15 ) ; final place X10_TEMP17 = ( here ) ; final Dist1 dTemp = Program . getPlaceDist1 ( X10_TEMP16 , X10_TEMP17 ) ; final Region1 RX10_TEMP0 = dTemp . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final Envelope2Stub [ : rank==1 ] RX10_TEMP6 = ( Envelope2Stub [ : rank==1 ] ) ( new Envelope2Stub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( dTemp , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T9 utmp9 = new T9(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {Program.thread9(utmp9); }
 }
 }
 final Envelope2Stub value [ : rank==1 ] RX10_TEMP16 = ( Envelope2Stub value [ : rank==1 ] ) ( new Envelope2Stub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final Envelope2Stub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final Envelope2RefArray1 RX10_TEMP19 = new Envelope2RefArray1 ( dTemp , RX10_TEMP16 ) ; final Envelope2RefArray1 temp = RX10_TEMP19 ; finish { final place X10_TEMP21 = place.FIRST_PLACE ; 
 final T10 utmp10 = new T10(temp, h, X10_TEMP0);
 async (X10_TEMP21) {Program.thread10(utmp10); }
 }
 final int X10_TEMP33 = ( 0 ) ; final Point1 RX10_TEMP31 = new Point1 ( X10_TEMP33 ) ; final Dist1 RX10_TEMP32 = temp . distValue ; final Region1 RX10_TEMP33 = RX10_TEMP32 . dReg ; final int RX10_TEMP34 = Program . searchPointInRegion1 ( RX10_TEMP33 , RX10_TEMP31 ) ; final int RX10_TEMP35 = 0 ; final boolean RX10_TEMP36 = RX10_TEMP34 < RX10_TEMP35 ; if ( RX10_TEMP36 ) { String RX10_TEMP37 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP37 ) ; }
 final place RX10_TEMP38 = Program . getPlaceFromDist1 ( RX10_TEMP32 , RX10_TEMP34 ) ; final place RX10_TEMP40 = here ; final boolean RX10_TEMP41 = RX10_TEMP38 != RX10_TEMP40 ; if ( RX10_TEMP41 ) { String RX10_TEMP39 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP39 ) ; }
 final Envelope2 RX10_TEMP42 = Program . getRefArrayValue1Envelope2 ( temp , RX10_TEMP34 ) ; final Envelope2 X10_TEMP34 = ( RX10_TEMP42 ) ; final int mylightCount = ( X10_TEMP34 . i ) ; final int X10_TEMP37 = ( 0 ) ; final Point1 RX10_TEMP43 = new Point1 ( X10_TEMP37 ) ; final Dist1 RX10_TEMP44 = temp . distValue ; final Region1 RX10_TEMP45 = RX10_TEMP44 . dReg ; final int RX10_TEMP46 = Program . searchPointInRegion1 ( RX10_TEMP45 , RX10_TEMP43 ) ; final int RX10_TEMP47 = 0 ; final boolean RX10_TEMP48 = RX10_TEMP46 < RX10_TEMP47 ; if ( RX10_TEMP48 ) { String RX10_TEMP49 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP49 ) ; }
 final place RX10_TEMP50 = Program . getPlaceFromDist1 ( RX10_TEMP44 , RX10_TEMP46 ) ; final place RX10_TEMP52 = here ; final boolean RX10_TEMP53 = RX10_TEMP50 != RX10_TEMP52 ; if ( RX10_TEMP53 ) { String RX10_TEMP51 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP51 ) ; }
 final Envelope2 RX10_TEMP54 = Program . getRefArrayValue1Envelope2 ( temp , RX10_TEMP46 ) ; final Envelope2 X10_TEMP38 = ( RX10_TEMP54 ) ; final LightValArray1 X10_TEMP40 = X10_TEMP38 . a ; final LightValArray1 mylights = X10_TEMP40 ; Vec col = ( new Vec ( ) ) ; final int X10_TEMP46 = ( 0 ) ; final int X10_TEMP44 = ( 1 ) ; final int X10_TEMP47 = ( mylightCount - X10_TEMP44 ) ; final Region1 X10_TEMP49 = Program . createNewRegion1R ( X10_TEMP46 , X10_TEMP47 ) ; final int RX10_TEMP58 = 1 ; int RX10_TEMP56 = X10_TEMP49 . regSize ; RX10_TEMP56 = RX10_TEMP56 - RX10_TEMP58 ; final region ( : rank==1 ) RX10_TEMP57 = [ 0 : RX10_TEMP56 ] ; for ( point ( : rank==1 ) RX10_TEMP55 : RX10_TEMP57 ) { final int RX10_TEMP59 = RX10_TEMP55 [0] ; final Point1 l = Program . regionOrdinalPoint1 ( X10_TEMP49 , RX10_TEMP59 ) ; final Region1 RX10_TEMP60 = mylights . regionValue ; final int RX10_TEMP61 = Program . searchPointInRegion1 ( RX10_TEMP60 , l ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final Light value [ : rank==1 ] RX10_TEMP65 = ( Light value [ : rank==1 ] ) ( mylights . contents ) ; final Light X10_TEMP51 = ( RX10_TEMP65 [ RX10_TEMP61 ] ) ; final Vec X10_TEMP54 = ( X10_TEMP51 . pos ) ; Vec L = ( Program . Vec_sub ( X10_TEMP54 , P ) ) ; final double X10_TEMP58 = ( Program . Vec_dot ( N , L ) ) ; final double X10_TEMP59 = ( 0.0 ) ; final boolean X10_TEMP61 = X10_TEMP58 >= X10_TEMP59 ; if ( X10_TEMP61 ) { final Vec X10_TEMP63 = ( Program . Vec_normalized ( L ) ) ; L = ( X10_TEMP63 ) ; double t = ( Program . Vec_length ( L ) ) ; final Vec X10_TEMP66 = ( P ) ; tRay . p = ( X10_TEMP66 ) ; final Vec X10_TEMP68 = ( L ) ; tRay . d = ( X10_TEMP68 ) ; final int X10_TEMP72 = ( Program . RayTracer_Shadow ( X10_TEMP0 , tRay , t , hit ) ) ; final int X10_TEMP73 = ( 0 ) ; final boolean X10_TEMP75 = X10_TEMP72 > X10_TEMP73 ; if ( X10_TEMP75 ) { final double X10_TEMP78 = ( Program . Vec_dot ( N , L ) ) ; final double X10_TEMP79 = ( surf . kd ) ; final double X10_TEMP82 = ( X10_TEMP78 * X10_TEMP79 ) ; final Region1 RX10_TEMP66 = mylights . regionValue ; final int RX10_TEMP67 = Program . searchPointInRegion1 ( RX10_TEMP66 , l ) ; final int RX10_TEMP68 = 0 ; final boolean RX10_TEMP69 = RX10_TEMP67 < RX10_TEMP68 ; if ( RX10_TEMP69 ) { String RX10_TEMP70 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP70 ) ; }
 final Light value [ : rank==1 ] RX10_TEMP71 = ( Light value [ : rank==1 ] ) ( mylights . contents ) ; final Light X10_TEMP81 = ( RX10_TEMP71 [ RX10_TEMP67 ] ) ; final double X10_TEMP83 = ( X10_TEMP81 . brightness ) ; double diff = ( X10_TEMP82 * X10_TEMP83 ) ; final Vec X10_TEMP87 = ( surf . color ) ; final Vec X10_TEMP89 = ( Program . Vec_adds2 ( col , diff , X10_TEMP87 ) ) ; col = ( X10_TEMP89 ) ; final double X10_TEMP90 = ( surf . shine ) ; final double X10_TEMP91 = ( 1e-6 ) ; final boolean X10_TEMP93 = X10_TEMP90 > X10_TEMP91 ; if ( X10_TEMP93 ) { double spec = ( Program . Vec_dot ( bigr , L ) ) ; final double X10_TEMP97 = ( 1e-6 ) ; final boolean X10_TEMP99 = spec > X10_TEMP97 ; if ( X10_TEMP99 ) { final double X10_TEMP102 = ( surf . shine ) ; final double X10_TEMP104 = ( Math . pow ( spec , X10_TEMP102 ) ) ; spec = ( X10_TEMP104 ) ; boolean X10_TEMP109 = ( false ) ; final Vec X10_TEMP111 = ( new Vec ( spec , spec , spec , X10_TEMP109 ) ) ; final Vec X10_TEMP113 = ( Program . Vec_added ( col , X10_TEMP111 ) ) ; col = ( X10_TEMP113 ) ; }
 }
 }
 }
 }
 final Vec X10_TEMP115 = ( P ) ; tRay . p = ( X10_TEMP115 ) ; final double X10_TEMP116 = ( surf . ks ) ; final double X10_TEMP117 = ( X10_TEMP116 * weight ) ; final double X10_TEMP118 = ( 1e-3 ) ; final boolean X10_TEMP120 = X10_TEMP117 > X10_TEMP118 ; if ( X10_TEMP120 ) { final Vec X10_TEMP124 = ( Program . RayTracer_SpecularDirection ( X10_TEMP0 , I , N ) ) ; final Vec X10_TEMP125 = ( X10_TEMP124 ) ; tRay . d = ( X10_TEMP125 ) ; final int X10_TEMP126 = ( 1 ) ; final int X10_TEMP133 = ( level + X10_TEMP126 ) ; final double X10_TEMP128 = ( surf . ks ) ; final double X10_TEMP134 = ( X10_TEMP128 * weight ) ; Vec tcol = ( Program . RayTracer_trace ( X10_TEMP0 , X10_TEMP133 , X10_TEMP134 , tRay , hit , tRay ) ) ; final double X10_TEMP138 = ( surf . ks ) ; final Vec X10_TEMP140 = ( Program . Vec_adds2 ( col , X10_TEMP138 , tcol ) ) ; col = ( X10_TEMP140 ) ; }
 final double X10_TEMP141 = ( surf . kt ) ; final double X10_TEMP142 = ( X10_TEMP141 * weight ) ; final double X10_TEMP143 = ( 1e-3 ) ; final boolean X10_TEMP145 = X10_TEMP142 > X10_TEMP143 ; if ( X10_TEMP145 ) { final int X10_TEMP146 = ( hit . enter ) ; final int X10_TEMP147 = ( 0 ) ; final boolean X10_TEMP149 = X10_TEMP146 > X10_TEMP147 ; if ( X10_TEMP149 ) { int X10_TEMP155 = ( 0 ) ; int X10_TEMP156 = ( 0 ) ; int X10_TEMP157 = ( 0 ) ; Vec X10_TEMP158 = ( new Vec ( ) ) ; boolean X10_TEMP159 = ( true ) ; final Surface X10_TEMP164 = ( new Surface ( X10_TEMP155 , X10_TEMP156 , X10_TEMP157 , X10_TEMP158 , X10_TEMP159 ) ) ; final Vec X10_TEMP166 = ( Program . RayTracer_TransDir ( X10_TEMP0 , X10_TEMP164 , surf , I , N ) ) ; final Vec X10_TEMP167 = ( X10_TEMP166 ) ; tRay . d = ( X10_TEMP167 ) ; }
 else { int X10_TEMP174 = ( 0 ) ; int X10_TEMP175 = ( 0 ) ; int X10_TEMP176 = ( 0 ) ; Vec X10_TEMP177 = ( new Vec ( ) ) ; boolean X10_TEMP178 = ( true ) ; final Surface X10_TEMP182 = ( new Surface ( X10_TEMP174 , X10_TEMP175 , X10_TEMP176 , X10_TEMP177 , X10_TEMP178 ) ) ; final Vec X10_TEMP184 = ( Program . RayTracer_TransDir ( X10_TEMP0 , surf , X10_TEMP182 , I , N ) ) ; final Vec X10_TEMP185 = ( X10_TEMP184 ) ; tRay . d = ( X10_TEMP185 ) ; }
 final int X10_TEMP186 = ( 1 ) ; final int X10_TEMP193 = ( level + X10_TEMP186 ) ; final double X10_TEMP188 = ( surf . kt ) ; final double X10_TEMP194 = ( X10_TEMP188 * weight ) ; Vec tcol = ( Program . RayTracer_trace ( X10_TEMP0 , X10_TEMP193 , X10_TEMP194 , tRay , hit , tRay ) ) ; final double X10_TEMP198 = ( surf . kt ) ; final Vec X10_TEMP200 = ( Program . Vec_adds2 ( col , X10_TEMP198 , tcol ) ) ; col = ( X10_TEMP200 ) ; }
 return col ; }
 public static Vec RayTracer_trace ( final RayTracer X10_TEMP0 , final int level , final double weight , final Ray r , final Isect inter , final Ray tRay ) { final int X10_TEMP1 = ( 6 ) ; final boolean X10_TEMP3 = level > X10_TEMP1 ; if ( X10_TEMP3 ) { final Vec X10_TEMP5 = ( new Vec ( ) ) ; return X10_TEMP5 ; }
 final double X10_TEMP9 = ( 1e6 ) ; boolean hit = ( Program . RayTracer_intersect ( X10_TEMP0 , r , X10_TEMP9 , inter ) ) ; if ( hit ) { final double X10_TEMP13 = ( inter . t ) ; Vec P = ( Program . Ray_rayPoint ( r , X10_TEMP13 ) ) ; final Sphere X10_TEMP15 = ( inter . prim ) ; Vec N = ( Program . Sphere_normal ( X10_TEMP15 , P ) ) ; final Vec X10_TEMP20 = ( r . d ) ; final double X10_TEMP21 = ( Program . Vec_dot ( X10_TEMP20 , N ) ) ; final double X10_TEMP22 = ( 0.0 ) ; final boolean X10_TEMP24 = X10_TEMP21 >= X10_TEMP22 ; if ( X10_TEMP24 ) { final Vec X10_TEMP26 = ( Program . Vec_negate ( N ) ) ; N = ( X10_TEMP26 ) ; }
 final Vec X10_TEMP34 = ( r . d ) ; final Vec X10_TEMP36 = ( Program . RayTracer_shade ( X10_TEMP0 , level , weight , P , N , X10_TEMP34 , inter , tRay ) ) ; return X10_TEMP36 ; }
 return _RayTracer_voidVec ; }
 public static String Surface_toString ( final Surface X10_TEMP0 ) { final String X10_TEMP1 = ( "Surface { color = " ) ; final Vec X10_TEMP2 = ( X10_TEMP0 . color ) ; final String X10_TEMP3 = ( Program . Vec_toString ( X10_TEMP2 ) ) ; final String X10_TEMP4 = ( X10_TEMP1 + X10_TEMP3 ) ; final String X10_TEMP5 = ( " }" ) ; final String X10_TEMP7 = ( X10_TEMP4 + X10_TEMP5 ) ; return X10_TEMP7 ; }
 public static String Interval_toString ( final Interval X10_TEMP0 ) { final int X10_TEMP1 = ( X10_TEMP0 . number ) ; final String X10_TEMP2 = ( " " ) ; final String X10_TEMP3 = ( X10_TEMP1 + X10_TEMP2 ) ; final int X10_TEMP4 = ( X10_TEMP0 . width ) ; final String X10_TEMP5 = ( X10_TEMP3 + X10_TEMP4 ) ; final String X10_TEMP6 = ( " " ) ; final String X10_TEMP7 = ( X10_TEMP5 + X10_TEMP6 ) ; final int X10_TEMP8 = ( X10_TEMP0 . height ) ; final String X10_TEMP9 = ( X10_TEMP7 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " " ) ; final String X10_TEMP11 = ( X10_TEMP9 + X10_TEMP10 ) ; final int X10_TEMP12 = ( X10_TEMP0 . yfrom ) ; final String X10_TEMP13 = ( X10_TEMP11 + X10_TEMP12 ) ; final String X10_TEMP14 = ( " " ) ; final String X10_TEMP15 = ( X10_TEMP13 + X10_TEMP14 ) ; final int X10_TEMP16 = ( X10_TEMP0 . yto ) ; final String X10_TEMP17 = ( X10_TEMP15 + X10_TEMP16 ) ; final String X10_TEMP18 = ( " " ) ; final String X10_TEMP19 = ( X10_TEMP17 + X10_TEMP18 ) ; final int X10_TEMP20 = ( X10_TEMP0 . total ) ; final String X10_TEMP22 = ( X10_TEMP19 + X10_TEMP20 ) ; return X10_TEMP22 ; }
 public static String View_toString ( final View X10_TEMP0 ) { final String X10_TEMP1 = ( "View { from = " ) ; final Vec X10_TEMP2 = ( X10_TEMP0 . from ) ; final String X10_TEMP3 = ( Program . Vec_toString ( X10_TEMP2 ) ) ; final String X10_TEMP4 = ( X10_TEMP1 + X10_TEMP3 ) ; final String X10_TEMP5 = ( " at = " ) ; final String X10_TEMP6 = ( X10_TEMP4 + X10_TEMP5 ) ; final Vec X10_TEMP7 = ( X10_TEMP0 . at ) ; final String X10_TEMP8 = ( Program . Vec_toString ( X10_TEMP7 ) ) ; final String X10_TEMP9 = ( X10_TEMP6 + X10_TEMP8 ) ; final String X10_TEMP10 = ( " up = " ) ; final String X10_TEMP11 = ( X10_TEMP9 + X10_TEMP10 ) ; final Vec X10_TEMP12 = ( X10_TEMP0 . up ) ; final String X10_TEMP13 = ( Program . Vec_toString ( X10_TEMP12 ) ) ; final String X10_TEMP14 = ( X10_TEMP11 + X10_TEMP13 ) ; final String X10_TEMP15 = ( " distance = " ) ; final String X10_TEMP16 = ( X10_TEMP14 + X10_TEMP15 ) ; final double X10_TEMP17 = ( X10_TEMP0 . distance ) ; final String X10_TEMP18 = ( X10_TEMP16 + X10_TEMP17 ) ; final String X10_TEMP19 = ( " angle = " ) ; final String X10_TEMP20 = ( X10_TEMP18 + X10_TEMP19 ) ; final double X10_TEMP21 = ( X10_TEMP0 . angle ) ; final String X10_TEMP22 = ( X10_TEMP20 + X10_TEMP21 ) ; final String X10_TEMP23 = ( " aspect = " ) ; final String X10_TEMP24 = ( X10_TEMP22 + X10_TEMP23 ) ; final double X10_TEMP25 = ( X10_TEMP0 . aspect ) ; final String X10_TEMP26 = ( X10_TEMP24 + X10_TEMP25 ) ; final String X10_TEMP27 = ( "}" ) ; final String X10_TEMP29 = ( X10_TEMP26 + X10_TEMP27 ) ; return X10_TEMP29 ; }
 public static int constantSearchRegion1 ( final Region1 r , final Point1 target ) { final int zero = 0 ; final int one = 1 ; final int dim0 = r . dim0 ; final int low0 = r . low0 ; final int high0 = low0 + dim0 ; int pt0 = target . f0 ; final boolean lbound0 = pt0 < low0 ; final boolean hbound0 = pt0 >= high0 ; final int dim1 = 1 ; boolean outRegion = false ; outRegion = outRegion || lbound0 ; outRegion = outRegion || hbound0 ; if ( outRegion ) { int notFound = 0 ; notFound = notFound - one ; return notFound ; }
 final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; pt0 = pt0 - low0 ; final int offset0 = stride0 * pt0 ; int found = 0 ; found = found + offset0 ; return found ; }
 public static void setRefArrayValue1Light ( final LightRefArray1 array , final int index , final Light val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final LightStub value [ : rank==1 ] contents = array . contents ; final LightStub indexStub = contents [ placeIndex ] ; final Light [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static int binarySearchRegion1 ( final Region1 r , final Point1 target ) { final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( r . pointArray ) ; int start = 0 ; int end = r . regSize ; final int zero = 0 ; final int one = 1 ; final int two = 2 ; end = end - one ; int result = zero - one ; boolean notDone = start <= end ; while ( notDone ) { int mid = start + end ; mid = mid / two ; final Point1 temp = pointArray [ mid ] ; final int pointCompare = Program . comparePoint1 ( target , temp ) ; final boolean eq = pointCompare == zero ; final boolean lt = pointCompare == one ; if ( eq ) { return mid ; }
 else { if ( lt ) { end = mid - one ; }
 else { start = mid + one ; }
 }
 notDone = start <= end ; }
 return result ; }
 public static void setRefArrayValue1double ( final doubleRefArray1 array , final int index , final double val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 getUniqueDist ( ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int rSize = maxPlaces - one ; final region ( : rank==1 ) placeRegion = [ 0 : rSize ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ placeRegion ] ( point ( : rank==1 ) p ) { final int i = p [0] ; final place pl1 = place.places ( i ) ; return pl1 ; }
 ) ; final int minusOne = zero - one ; final region ( : rank==1 ) pointRegion = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ pointRegion ] ( point ( : rank==1 ) p ) { final Point1 pt1 = new Point1 ( zero ) ; return pt1 ; }
 ) ; final Region1 reg = new Region1 ( pointArray , maxPlaces , zero , maxPlaces ) ; final Dist pointDist1 = new Dist ( vPlaceArray , maxPlaces ) ; final Dist1 retDist = new Dist1 ( reg , pointDist1 ) ; return retDist ; }
 public static Envelope2 getRefArrayValue1Envelope2 ( final Envelope2RefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Envelope2Stub value [ : rank==1 ] contents = array . contents ; final Envelope2Stub indexStub = contents [ placeIndex ] ; final Envelope2 [ : rank==1 ] localArray = indexStub . localArray ; final Envelope2 returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static place getPlaceFromDist1 ( final Dist1 dn , final int index ) { final Dist d = dn . dDist ; final place value [ : rank==1 ] placeArray = d . placeArray ; final place retPlace = placeArray [ index ] ; return retPlace ; }
 public static void setRefArrayValue1Envelope ( final EnvelopeRefArray1 array , final int index , final Envelope val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final EnvelopeStub value [ : rank==1 ] contents = array . contents ; final EnvelopeStub indexStub = contents [ placeIndex ] ; final Envelope [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Envelope getRefArrayValue1Envelope ( final EnvelopeRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final EnvelopeStub value [ : rank==1 ] contents = array . contents ; final EnvelopeStub indexStub = contents [ placeIndex ] ; final Envelope [ : rank==1 ] localArray = indexStub . localArray ; final Envelope returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int getRefArrayValue1int ( final intRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final intStub value [ : rank==1 ] contents = array . contents ; final intStub indexStub = contents [ placeIndex ] ; final int [ : rank==1 ] localArray = indexStub . localArray ; final int returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static int comparePoint1 ( final Point1 pt1 , final Point1 pt2 ) { final int zero = 0 ; final int one = 1 ; final int two = 2 ; int point1 = 0 ; int point2 = 0 ; boolean lt = false ; boolean gt = false ; point1 = pt1 . f0 ; point2 = pt2 . f0 ; lt = point1 < point2 ; gt = point1 > point2 ; if ( lt ) { return one ; }
 if ( gt ) { return two ; }
 return zero ; }
 public static Sphere getRefArrayValue1Sphere ( final SphereRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final SphereStub value [ : rank==1 ] contents = array . contents ; final SphereStub indexStub = contents [ placeIndex ] ; final Sphere [ : rank==1 ] localArray = indexStub . localArray ; final Sphere returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static Point1 regionOrdinalPoint1 ( final Region1 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point1 pt = Program . regionOrdinalPointRegular1 ( reg , ordl ) ; return pt ; }
 final Point1 pt = Program . regionOrdinalPointArbitrary1 ( reg , ordl ) ; return pt ; }
 public static Point1 regionOrdinalPointRegular1 ( final Region1 reg , final int ordl ) { final int stride1 = 1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 pt = new Point1 ( f1 ) ; return pt ; }
 public static Point1 regionOrdinalPointArbitrary1 ( final Region1 reg , final int ordl ) { final Point1 value [ : rank==1 ] pointArray = reg . pointArray ; final Point1 pt = pointArray [ ordl ] ; return pt ; }
 public static void setRefArrayValue1int ( final intRefArray1 array , final int index , final int val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final intStub value [ : rank==1 ] contents = array . contents ; final intStub indexStub = contents [ placeIndex ] ; final int [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Light getRefArrayValue1Light ( final LightRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final LightStub value [ : rank==1 ] contents = array . contents ; final LightStub indexStub = contents [ placeIndex ] ; final Light [ : rank==1 ] localArray = indexStub . localArray ; final Light returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static double getRefArrayValue1double ( final doubleRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final doubleStub value [ : rank==1 ] contents = array . contents ; final doubleStub indexStub = contents [ placeIndex ] ; final double [ : rank==1 ] localArray = indexStub . localArray ; final double returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static void setRefArrayValue1Sphere ( final SphereRefArray1 array , final int index , final Sphere val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final SphereStub value [ : rank==1 ] contents = array . contents ; final SphereStub indexStub = contents [ placeIndex ] ; final Sphere [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 restrictDist1 ( final Dist1 dn , final place p ) { final Region1 r = dn . dReg ; final boolean regType = r . regType ; if ( regType ) { final Dist1 regDist = Program . restrictDistRegular1 ( dn , p ) ; return regDist ; }
 final Dist1 arbDist = Program . restrictDistArbitrary1 ( dn , p ) ; return arbDist ; }
 public static Dist1 restrictDistRegular1 ( final Dist1 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region1 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final int stride1 = 1 ; final int dim1 = dReg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = dReg . low0 ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; int f1 = idx / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point1 dpt = new Point1 ( f1 ) ; return dpt ; }
 ) ; final Region1 dpReg = new Region1 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist1 dpDistn = new Dist1 ( dpReg , dpDist ) ; return dpDistn ; }
 public static Dist1 restrictDistArbitrary1 ( final Dist1 d , final place p ) { final int zero = 0 ; final int one = 1 ; final place h = here ; final Region1 dReg = d . dReg ; final Dist dDist = d . dDist ; final int dim = dReg . regSize ; final int dimMinusOne = dim - one ; final region ( : rank==1 ) dRegReg = [ 0 : dimMinusOne ] ; final Point1 value [ : rank==1 ] dArray = ( Point1 value [ : rank==1 ] ) ( dReg . pointArray ) ; final place value [ : rank==1 ] dPlace = ( place value [ : rank==1 ] ) ( dDist . placeArray ) ; final int value [ : rank==1 ] dCounts = ( int value [ : rank==1 ] ) ( dDist . counts ) ; final int index = p . id ; int numPoints = dCounts [ index ] ; final int rSizeNumPoints = numPoints ; final int rSize = numPoints - one ; final region ( : rank==1 ) tempReg = [ 0 : rSize ] ; final dist ( : rank==1 ) tempDist = [ 0 : rSize ] -> here ; final place value [ : rank==1 ] rPlace = ( place value [ : rank==1 ] ) ( new place value [ tempReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final int [ : rank==1 ] tempArray = ( int [ : rank==1 ] ) ( new int [ tempDist ] ) ; final boolean cond1 = numPoints > zero ; if ( cond1 ) { numPoints = 0 ; for ( point ( : rank==1 ) pt : dRegReg ) { final place dP = dPlace [ pt ] ; final boolean cond2 = p == dP ; if ( cond2 ) { final int i = pt [0] ; tempArray [ numPoints ] = ( i ) ; numPoints = numPoints + one ; }
 }
 }
 final Point1 value [ : rank==1 ] pointArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ tempReg ] ( point ( : rank==1 ) pt ) { final int idx = tempArray [ pt ] ; final Point1 dpt = dArray [ idx ] ; return dpt ; }
 ) ; final Region1 dpReg = new Region1 ( pointArray , rSizeNumPoints ) ; final Dist dpDist = new Dist ( rPlace , rSizeNumPoints ) ; final Dist1 dpDistn = new Dist1 ( dpReg , dpDist ) ; return dpDistn ; }
 public static Dist1 getBlockDist1 ( final Region1 r ) { final int rSize = r . regSize ; final int zero = 0 ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final dist ( : rank==1 ) dDist = [ 0 : rSizeMinusOne ] -> here ; final place [ : rank==1 ] placeArray = ( place [ : rank==1 ] ) ( new place [ dDist ] ) ; final int N = place.MAX_PLACES ; final int q = rSize % N ; final int p = rSize / N ; int blockSize = p + one ; int arraySize = q * blockSize ; int offset = 0 ; place initPlace = place.FIRST_PLACE ; Program . getCyclic ( placeArray , arraySize , initPlace , blockSize ) ; int remainingPlaces = N - q ; final boolean cond = remainingPlaces == zero ; if ( cond ) { final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; }
 ) ; final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist1 ) ; return retDist ; }
 offset = arraySize ; blockSize = p ; arraySize = remainingPlaces * blockSize ; initPlace = place.places ( q ) ; int chunk = blockSize ; final boolean ifCond = blockSize > arraySize ; if ( ifCond ) { chunk = arraySize ; }
 int index = offset ; int dSize = index + chunk ; dSize = dSize - one ; final int ub0 = chunk - one ; final region ( : rank==1 ) pointReg0 = [ 0 : ub0 ] ; for ( point ( : rank==1 ) pt : pointReg0 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( initPlace ) ; }
 index = index + chunk ; arraySize = arraySize - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = arraySize != zero ; while ( whileCond ) { final boolean tailCond = chunk > arraySize ; if ( tailCond ) { dSize = index + arraySize ; dSize = dSize - one ; final int ub = arraySize - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 arraySize = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) pt : pointReg1 ) { final point ( : rank==1 ) tempPt = pt + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; arraySize = arraySize - chunk ; }
 pl = pl . next ( ) ; whileCond = arraySize != zero ; }
 final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { final place tempPl = placeArray [ pt ] ; return tempPl ; }
 ) ; final Dist pointDist1 = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist1 ) ; return retDist ; }
 public static Point3 regionOrdinalPoint3 ( final Region3 reg , final int ordl ) { final boolean regType = reg . regType ; if ( regType ) { final Point3 pt = Program . regionOrdinalPointRegular3 ( reg , ordl ) ; return pt ; }
 final Point3 pt = Program . regionOrdinalPointArbitrary3 ( reg , ordl ) ; return pt ; }
 public static Point3 regionOrdinalPointRegular3 ( final Region3 reg , final int ordl ) { final int stride3 = 1 ; final int dim3 = reg . dim2 ; final int stride2 = stride3 * dim3 ; final int regLow3 = reg . low2 ; final int dim2 = reg . dim1 ; final int stride1 = stride2 * dim2 ; final int regLow2 = reg . low1 ; final int dim1 = reg . dim0 ; final int stride0 = stride1 * dim1 ; final int regLow1 = reg . low0 ; int f3 = ordl / stride3 ; f3 = f3 % dim3 ; f3 = f3 + regLow3 ; int f2 = ordl / stride2 ; f2 = f2 % dim2 ; f2 = f2 + regLow2 ; int f1 = ordl / stride1 ; f1 = f1 % dim1 ; f1 = f1 + regLow1 ; final Point3 pt = new Point3 ( f1 , f2 , f3 ) ; return pt ; }
 public static Point3 regionOrdinalPointArbitrary3 ( final Region3 reg , final int ordl ) { final Point3 value [ : rank==1 ] pointArray = reg . pointArray ; final Point3 pt = pointArray [ ordl ] ; return pt ; }
 public static void setRefArrayValue1long ( final longRefArray1 array , final int index , final long val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final longStub value [ : rank==1 ] contents = array . contents ; final longStub indexStub = contents [ placeIndex ] ; final long [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static void getCyclic ( final place [ : rank==1 ] placeArray , final int arraySize , final place initPlace , final int blockSize ) { final int zero = 0 ; final int one = 1 ; int N = arraySize ; int chunk = blockSize ; final boolean ifCond = blockSize > N ; if ( ifCond ) { chunk = N ; }
 int index = 0 ; int dSize = index + chunk ; dSize = dSize - one ; final region ( : rank==1 ) pointReg = [ 0 : dSize ] ; for ( point ( : rank==1 ) p : pointReg ) { placeArray [ p ] = ( initPlace ) ; }
 index = index + chunk ; N = N - chunk ; place pl = initPlace . next ( ) ; boolean whileCond = N != zero ; while ( whileCond ) { final boolean tailCond = chunk > N ; if ( tailCond ) { dSize = index + N ; dSize = dSize - one ; final int ub = N - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 N = 0 ; }
 else { dSize = index + chunk ; dSize = dSize - one ; final int ub = chunk - one ; final region ( : rank==1 ) pointReg1 = [ 0 : ub ] ; for ( point ( : rank==1 ) p : pointReg1 ) { final point ( : rank==1 ) tempPt = p + [ index ] ; placeArray [ tempPt ] = ( pl ) ; }
 index = index + chunk ; N = N - chunk ; }
 pl = pl . next ( ) ; whileCond = N != zero ; }
 }
 public static int getDistLocalCount1 ( final Dist1 dn , final int placeIndex ) { final Dist d = dn . dDist ; final int value [ : rank==1 ] counts = d . counts ; final int localCount = counts [ placeIndex ] ; return localCount ; }
 public static int searchPointInRegion1 ( final Region1 r , final Point1 target ) { final boolean regType = r . regType ; if ( regType ) { final int constantSearch = Program . constantSearchRegion1 ( r , target ) ; return constantSearch ; }
 final int binarySearch = Program . binarySearchRegion1 ( r , target ) ; return binarySearch ; }
 public static long getRefArrayValue1long ( final longRefArray1 array , final int index ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final longStub value [ : rank==1 ] contents = array . contents ; final longStub indexStub = contents [ placeIndex ] ; final long [ : rank==1 ] localArray = indexStub . localArray ; final long returnValue = localArray [ localIndex ] ; return returnValue ; }
 public static void setRefArrayValue1Envelope2 ( final Envelope2RefArray1 array , final int index , final Envelope2 val ) { final place pl = here ; final int placeIndex = pl . id ; final Dist1 dArray = array . distValue ; final Dist dDist = dArray . dDist ; final int value [ : rank==1 ] runSum = dDist . runningSum ; final int localIndex = runSum [ index ] ; final Envelope2Stub value [ : rank==1 ] contents = array . contents ; final Envelope2Stub indexStub = contents [ placeIndex ] ; final Envelope2 [ : rank==1 ] localArray = indexStub . localArray ; localArray [ localIndex ] = ( val ) ; }
 public static Dist1 getPlaceDist1 ( final Region1 r , final place p ) { final int rSize = r . regSize ; final int one = 1 ; final int rSizeMinusOne = rSize - one ; final region ( : rank==1 ) dReg = [ 0 : rSizeMinusOne ] ; final place value [ : rank==1 ] vPlaceArray = ( place value [ : rank==1 ] ) ( new place value [ dReg ] ( point ( : rank==1 ) pt ) { return p ; }
 ) ; final Dist pointDist = new Dist ( vPlaceArray , rSize ) ; final Dist1 retDist = new Dist1 ( r , pointDist ) ; return retDist ; }
 public static int value [ : rank==1 ] initDist ( final int [ : rank==1 ] tempArr , final region ( : rank==1 ) tempReg ) { final int value [ : rank==1 ] vTemp = ( int value [ : rank==1 ] ) ( new int value [ tempReg ] ( point ( : rank==1 ) p ) { final int tempInt = tempArr [ p ] ; return tempInt ; }
 ) ; return vTemp ; }
 public static Region1 createNewRegion1R ( final int v1_0 , final int v1_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; regType = regType && tempBool1 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int stride1 = 1 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegEmpty = new Region1 ( ptArray , stride0 , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) p ) { final Point1 pt = new Point1 ( zero ) ; return pt ; }
 ) ; final Region1 retRegRegular = new Region1 ( ptArray , stride0 , v1_0 , dim1 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point1 value [ : rank==1 ] ptArray = ( Point1 value [ : rank==1 ] ) ( new Point1 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; final Point1 retPoint = new Point1 ( f1 ) ; return retPoint ; }
 ) ; final Region1 retReg = new Region1 ( ptArray , stride0 ) ; return retReg ; }
 }
 public static Region3 createNewRegion3RRR ( final int v1_0 , final int v1_1 , final int v2_0 , final int v2_1 , final int v3_0 , final int v3_1 ) { final int zero = 0 ; final int one = 1 ; boolean regType = true ; final boolean tempBool1 = true ; final boolean tempBool2 = true ; final boolean tempBool3 = true ; regType = regType && tempBool1 ; regType = regType && tempBool2 ; regType = regType && tempBool3 ; final int l1 = v1_1 - v1_0 ; final int dim1 = l1 + one ; final int l2 = v2_1 - v2_0 ; final int dim2 = l2 + one ; final int l3 = v3_1 - v3_0 ; final int dim3 = l3 + one ; final int stride3 = 1 ; final int stride2 = stride3 * dim3 ; final int stride1 = stride2 * dim2 ; final int stride0 = stride1 * dim1 ; final int rSize = stride0 - one ; final boolean cond = stride0 <= zero ; if ( cond ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) p ) { final Point3 pt = new Point3 ( zero , zero , zero ) ; return pt ; }
 ) ; final Region3 retRegEmpty = new Region3 ( ptArray , stride0 , zero , zero , zero , zero , zero , zero ) ; return retRegEmpty ; }
 if ( regType ) { final int minusOne = zero - one ; final region ( : rank==1 ) regArr = [ 0 : minusOne ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) p ) { final Point3 pt = new Point3 ( zero , zero , zero ) ; return pt ; }
 ) ; final Region3 retRegRegular = new Region3 ( ptArray , stride0 , v1_0 , dim1 , v2_0 , dim2 , v3_0 , dim3 ) ; return retRegRegular ; }
 else { final region ( : rank==1 ) regArr = [ 0 : rSize ] ; final Point3 value [ : rank==1 ] ptArray = ( Point3 value [ : rank==1 ] ) ( new Point3 value [ regArr ] ( point ( : rank==1 ) pt ) { final int p = pt [0] ; int f1 = p / stride1 ; f1 = f1 % dim1 ; f1 = f1 + v1_0 ; int f2 = p / stride2 ; f2 = f2 % dim2 ; f2 = f2 + v2_0 ; int f3 = p / stride3 ; f3 = f3 % dim3 ; f3 = f3 + v3_0 ; final Point3 retPoint = new Point3 ( f1 , f2 , f3 ) ; return retPoint ; }
 ) ; final Region3 retReg = new Region3 ( ptArray , stride0 ) ; return retReg ; }
 }

 public static void thread1(final T1 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final int [ : rank==1 ] RX10_TEMP14 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP13 ] ) ; final intStub RX10_TEMP15 = new intStub ( RX10_TEMP14 ) ; 
 final T16 utmp16 = new T16(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread16(utmp16); }
 }
 }
 public static void thread2(final T2 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  longStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final long [ : rank==1 ] RX10_TEMP14 = ( long [ : rank==1 ] ) ( new long [ RX10_TEMP13 ] ) ; final longStub RX10_TEMP15 = new longStub ( RX10_TEMP14 ) ; 
 final T17 utmp17 = new T17(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread17(utmp17); }
 }
 }
 public static void thread3(final T3 utmpz) {final  int myobjCount = utmpz.myobjCount;
final  int mylightCount = utmpz.mylightCount;
final  Scene sc = utmpz.sc;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final place pHere = ( here ) ; final int X10_TEMP18 = ( 0 ) ; final int X10_TEMP16 = ( 1 ) ; final int X10_TEMP19 = ( mylightCount - X10_TEMP16 ) ; Region1 d1 = Program . createNewRegion1R ( X10_TEMP18 , X10_TEMP19 ) ; final int X10_TEMP24 = ( 0 ) ; final int X10_TEMP22 = ( 1 ) ; final int X10_TEMP25 = ( myobjCount - X10_TEMP22 ) ; Region1 d2 = Program . createNewRegion1R ( X10_TEMP24 , X10_TEMP25 ) ; final Region1 RX10_TEMP12 = d1 ; final int RX10_TEMP59 = d1 . regSize ; final int RX10_TEMP60 = 1 ; final int RX10_TEMP61 = RX10_TEMP59 - RX10_TEMP60 ; final region ( : rank==1 ) RX10_TEMP58 = [ 0 : RX10_TEMP61 ] ; final Light value [ : rank==1 ] RX10_TEMP62 = ( Light value [ : rank==1 ] ) ( new Light value [ RX10_TEMP58 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final int RX10_TEMP14 = RX10_TEMP13 [0] ; final Point1 l = Program . regionOrdinalPoint1 ( RX10_TEMP12 , RX10_TEMP14 ) ; final int X10_TEMP29 = ( 0 ) ; final int X10_TEMP30 = ( 0 ) ; final Region1 X10_TEMP31 = Program . createNewRegion1R ( X10_TEMP29 , X10_TEMP30 ) ; final Dist1 dTemp = Program . getPlaceDist1 ( X10_TEMP31 , pHere ) ; final Region1 RX10_TEMP15 = dTemp . dReg ; final int RX10_TEMP16 = 0 ; final int RX10_TEMP17 = 1 ; int RX10_TEMP18 = place.MAX_PLACES ; RX10_TEMP18 = RX10_TEMP18 - RX10_TEMP17 ; final region ( : rank==1 ) RX10_TEMP19 = [ 0 : RX10_TEMP18 ] ; final dist ( : rank==1 ) RX10_TEMP20 = [ 0 : RX10_TEMP18 ] -> here ; final LightStub [ : rank==1 ] RX10_TEMP21 = ( LightStub [ : rank==1 ] ) ( new LightStub [ RX10_TEMP20 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP22 : RX10_TEMP19 ) { final place RX10_TEMP23 = here ; final int RX10_TEMP24 = RX10_TEMP22 [0] ; final place RX10_TEMP25 = place.places ( RX10_TEMP24 ) ; final int RX10_TEMP26 = Program . getDistLocalCount1 ( dTemp , RX10_TEMP24 ) ; final int RX10_TEMP27 = RX10_TEMP26 - RX10_TEMP17 ; 
 final T18 utmp18 = new T18(RX10_TEMP27, RX10_TEMP23, RX10_TEMP22, RX10_TEMP21);
 async (RX10_TEMP25) {Program.thread18(utmp18); }
 }
 }
 final LightStub value [ : rank==1 ] RX10_TEMP31 = ( LightStub value [ : rank==1 ] ) ( new LightStub value [ RX10_TEMP19 ] ( point ( : rank==1 ) RX10_TEMP33 ) { final LightStub RX10_TEMP32 = RX10_TEMP21 [ RX10_TEMP33 ] ; return RX10_TEMP32 ; }
 ) ; final LightRefArray1 RX10_TEMP34 = new LightRefArray1 ( dTemp , RX10_TEMP31 ) ; final LightRefArray1 temp = RX10_TEMP34 ; final Point1 temp_l = ( l ) ; finish { final place X10_TEMP36 = place.FIRST_PLACE ; 
 final T19 utmp19 = new T19(temp_l, temp, pHere, sc);
 async (X10_TEMP36) {Program.thread19(utmp19); }
 }
 final int X10_TEMP45 = ( 0 ) ; final Point1 RX10_TEMP46 = new Point1 ( X10_TEMP45 ) ; final Dist1 RX10_TEMP47 = temp . distValue ; final Region1 RX10_TEMP48 = RX10_TEMP47 . dReg ; final int RX10_TEMP49 = Program . searchPointInRegion1 ( RX10_TEMP48 , RX10_TEMP46 ) ; final int RX10_TEMP50 = 0 ; final boolean RX10_TEMP51 = RX10_TEMP49 < RX10_TEMP50 ; if ( RX10_TEMP51 ) { String RX10_TEMP52 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP52 ) ; }
 final place RX10_TEMP53 = Program . getPlaceFromDist1 ( RX10_TEMP47 , RX10_TEMP49 ) ; final place RX10_TEMP55 = here ; final boolean RX10_TEMP56 = RX10_TEMP53 != RX10_TEMP55 ; if ( RX10_TEMP56 ) { String RX10_TEMP54 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP54 ) ; }
 final Light RX10_TEMP57 = Program . getRefArrayValue1Light ( temp , RX10_TEMP49 ) ; final Light X10_TEMP47 = ( RX10_TEMP57 ) ; return X10_TEMP47 ; }
 ) ; final LightValArray1 RX10_TEMP63 = new LightValArray1 ( d1 , RX10_TEMP62 ) ; final LightValArray1 X10_TEMP48 = RX10_TEMP63 ; final LightValArray1 templights = X10_TEMP48 ; finish { final place X10_TEMP51 = place.FIRST_PLACE ; 
 final T20 utmp20 = new T20(templights, X10_TEMP0);
 async (X10_TEMP51) {Program.thread20(utmp20); }
 }
 final Region1 RX10_TEMP64 = d2 ; final int RX10_TEMP111 = d2 . regSize ; final int RX10_TEMP112 = 1 ; final int RX10_TEMP113 = RX10_TEMP111 - RX10_TEMP112 ; final region ( : rank==1 ) RX10_TEMP110 = [ 0 : RX10_TEMP113 ] ; final Sphere value [ : rank==1 ] RX10_TEMP114 = ( Sphere value [ : rank==1 ] ) ( new Sphere value [ RX10_TEMP110 ] ( point ( : rank==1 ) RX10_TEMP65 ) { final int RX10_TEMP66 = RX10_TEMP65 [0] ; final Point1 o = Program . regionOrdinalPoint1 ( RX10_TEMP64 , RX10_TEMP66 ) ; final int X10_TEMP56 = ( 0 ) ; final int X10_TEMP57 = ( 0 ) ; final Region1 X10_TEMP58 = Program . createNewRegion1R ( X10_TEMP56 , X10_TEMP57 ) ; final Dist1 dTemp1 = Program . getPlaceDist1 ( X10_TEMP58 , pHere ) ; final Region1 RX10_TEMP67 = dTemp1 . dReg ; final int RX10_TEMP68 = 0 ; final int RX10_TEMP69 = 1 ; int RX10_TEMP70 = place.MAX_PLACES ; RX10_TEMP70 = RX10_TEMP70 - RX10_TEMP69 ; final region ( : rank==1 ) RX10_TEMP71 = [ 0 : RX10_TEMP70 ] ; final dist ( : rank==1 ) RX10_TEMP72 = [ 0 : RX10_TEMP70 ] -> here ; final SphereStub [ : rank==1 ] RX10_TEMP73 = ( SphereStub [ : rank==1 ] ) ( new SphereStub [ RX10_TEMP72 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP74 : RX10_TEMP71 ) { final place RX10_TEMP75 = here ; final int RX10_TEMP76 = RX10_TEMP74 [0] ; final place RX10_TEMP77 = place.places ( RX10_TEMP76 ) ; final int RX10_TEMP78 = Program . getDistLocalCount1 ( dTemp1 , RX10_TEMP76 ) ; final int RX10_TEMP79 = RX10_TEMP78 - RX10_TEMP69 ; 
 final T21 utmp21 = new T21(RX10_TEMP79, RX10_TEMP75, RX10_TEMP74, RX10_TEMP73);
 async (RX10_TEMP77) {Program.thread21(utmp21); }
 }
 }
 final SphereStub value [ : rank==1 ] RX10_TEMP83 = ( SphereStub value [ : rank==1 ] ) ( new SphereStub value [ RX10_TEMP71 ] ( point ( : rank==1 ) RX10_TEMP85 ) { final SphereStub RX10_TEMP84 = RX10_TEMP73 [ RX10_TEMP85 ] ; return RX10_TEMP84 ; }
 ) ; final SphereRefArray1 RX10_TEMP86 = new SphereRefArray1 ( dTemp1 , RX10_TEMP83 ) ; final SphereRefArray1 temp1 = RX10_TEMP86 ; final Point1 temp_o = ( o ) ; finish { final place X10_TEMP63 = place.FIRST_PLACE ; 
 final T22 utmp22 = new T22(temp_o, temp1, pHere, sc);
 async (X10_TEMP63) {Program.thread22(utmp22); }
 }
 final int X10_TEMP72 = ( 0 ) ; final Point1 RX10_TEMP98 = new Point1 ( X10_TEMP72 ) ; final Dist1 RX10_TEMP99 = temp1 . distValue ; final Region1 RX10_TEMP100 = RX10_TEMP99 . dReg ; final int RX10_TEMP101 = Program . searchPointInRegion1 ( RX10_TEMP100 , RX10_TEMP98 ) ; final int RX10_TEMP102 = 0 ; final boolean RX10_TEMP103 = RX10_TEMP101 < RX10_TEMP102 ; if ( RX10_TEMP103 ) { String RX10_TEMP104 = "Array access index out of bounds" ; throw new RuntimeException ( RX10_TEMP104 ) ; }
 final place RX10_TEMP105 = Program . getPlaceFromDist1 ( RX10_TEMP99 , RX10_TEMP101 ) ; final place RX10_TEMP107 = here ; final boolean RX10_TEMP108 = RX10_TEMP105 != RX10_TEMP107 ; if ( RX10_TEMP108 ) { String RX10_TEMP106 = "Bad place access for array temp1" ; throw new RuntimeException ( RX10_TEMP106 ) ; }
 final Sphere RX10_TEMP109 = Program . getRefArrayValue1Sphere ( temp1 , RX10_TEMP101 ) ; final Sphere X10_TEMP74 = ( RX10_TEMP109 ) ; return X10_TEMP74 ; }
 ) ; final SphereValArray1 RX10_TEMP115 = new SphereValArray1 ( d2 , RX10_TEMP114 ) ; final SphereValArray1 X10_TEMP75 = RX10_TEMP115 ; final SphereValArray1 tempprim = X10_TEMP75 ; finish { final place X10_TEMP78 = place.FIRST_PLACE ; 
 final T23 utmp23 = new T23(tempprim, X10_TEMP0);
 async (X10_TEMP78) {Program.thread23(utmp23); }
 }
 }
 }
 public static void thread4(final T4 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final int [ : rank==1 ] RX10_TEMP14 = ( int [ : rank==1 ] ) ( new int [ RX10_TEMP13 ] ) ; final intStub RX10_TEMP15 = new intStub ( RX10_TEMP14 ) ; 
 final T24 utmp24 = new T24(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread24(utmp24); }
 }
 }
 public static void thread5(final T5 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  longStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP34 = [ 0 : RX10_TEMP33 ] -> here ; final long [ : rank==1 ] RX10_TEMP35 = ( long [ : rank==1 ] ) ( new long [ RX10_TEMP34 ] ) ; final longStub RX10_TEMP36 = new longStub ( RX10_TEMP35 ) ; 
 final T25 utmp25 = new T25(RX10_TEMP36, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {Program.thread25(utmp25); }
 }
 }
 public static void thread6(final T6 utmpz) {final  Point1 pl = utmpz.pl;
final  View myview = utmpz.myview;
final  place fp = utmpz.fp;
final  Dist1 DBlock = utmpz.DBlock;
final  Interval interval = utmpz.interval;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final place X10_TEMP30 = ( here ) ; final Dist1 my_dist = Program . restrictDist1 ( DBlock , X10_TEMP30 ) ; long checksum1 = ( 0 ) ; final double X10_TEMP41 = ( myview . distance ) ; final double X10_TEMP34 = ( myview . angle ) ; final double X10_TEMP37 = ( Math . sin ( X10_TEMP34 ) ) ; final double X10_TEMP36 = ( myview . angle ) ; final double X10_TEMP38 = ( Math . cos ( X10_TEMP36 ) ) ; final double X10_TEMP40 = ( X10_TEMP37 / X10_TEMP38 ) ; double frustrumwidth = ( X10_TEMP41 * X10_TEMP40 ) ; final Vec X10_TEMP45 = ( myview . at ) ; final Vec X10_TEMP46 = ( myview . from ) ; final Vec X10_TEMP47 = ( Program . Vec_sub ( X10_TEMP45 , X10_TEMP46 ) ) ; Vec viewVec = ( Program . Vec_normalized ( X10_TEMP47 ) ) ; boolean X10_TEMP51 = ( false ) ; final Vec X10_TEMP52 = ( new Vec ( viewVec , X10_TEMP51 ) ) ; final Vec X10_TEMP55 = ( myview . up ) ; final double X10_TEMP57 = ( Program . Vec_dot ( X10_TEMP55 , viewVec ) ) ; Vec tmpVec = ( Program . Vec_scale ( X10_TEMP52 , X10_TEMP57 ) ) ; final Vec X10_TEMP61 = ( myview . up ) ; final Vec X10_TEMP62 = ( Program . Vec_sub ( X10_TEMP61 , tmpVec ) ) ; final Vec X10_TEMP63 = ( Program . Vec_normalized ( X10_TEMP62 ) ) ; final int X10_TEMP64 = 0 ; final double X10_TEMP66 = ( X10_TEMP64 - frustrumwidth ) ; Vec upVec = ( Program . Vec_scale ( X10_TEMP63 , X10_TEMP66 ) ) ; final Vec X10_TEMP70 = ( myview . up ) ; final Vec X10_TEMP71 = ( Program . Vec_cross ( X10_TEMP70 , viewVec ) ) ; final Vec X10_TEMP72 = ( Program . Vec_normalized ( X10_TEMP71 ) ) ; final double X10_TEMP73 = ( myview . aspect ) ; final double X10_TEMP75 = ( X10_TEMP73 * frustrumwidth ) ; Vec leftVec = ( Program . Vec_scale ( X10_TEMP72 , X10_TEMP75 ) ) ; Vec X10_TEMP79 = ( myview . from ) ; Ray r = ( new Ray ( X10_TEMP79 , _RayTracer_voidVec ) ) ; final Region1 RX10_TEMP53 = my_dist . dReg ; final Region1 X10_TEMP82 = RX10_TEMP53 ; final int RX10_TEMP57 = 1 ; int RX10_TEMP55 = X10_TEMP82 . regSize ; RX10_TEMP55 = RX10_TEMP55 - RX10_TEMP57 ; final region ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP55 ] ; for ( point ( : rank==1 ) RX10_TEMP54 : RX10_TEMP56 ) { final int RX10_TEMP58 = RX10_TEMP54 [0] ; final Point1 pixCounter = Program . regionOrdinalPoint1 ( X10_TEMP82 , RX10_TEMP58 ) ; final int X10_TEMP84 = ( pixCounter . f0 ) ; final int X10_TEMP85 = ( interval . width ) ; int y = ( X10_TEMP84 / X10_TEMP85 ) ; final int X10_TEMP88 = ( pixCounter . f0 ) ; final int X10_TEMP89 = ( interval . width ) ; int x = ( X10_TEMP88 % X10_TEMP89 ) ; final double X10_TEMP91 = ( 2.0 ) ; final double X10_TEMP93 = ( X10_TEMP91 * y ) ; final double X10_TEMP95 = ( ( double ) X10_TEMP93 ) ; final int X10_TEMP94 = ( interval . width ) ; final double X10_TEMP96 = ( ( double ) X10_TEMP94 ) ; final double X10_TEMP97 = ( X10_TEMP95 / X10_TEMP96 ) ; final double X10_TEMP98 = ( 1.0 ) ; double ylen = ( X10_TEMP97 - X10_TEMP98 ) ; final double X10_TEMP100 = ( 2.0 ) ; final double X10_TEMP102 = ( X10_TEMP100 * x ) ; final double X10_TEMP104 = ( ( double ) X10_TEMP102 ) ; final int X10_TEMP103 = ( interval . width ) ; final double X10_TEMP105 = ( ( double ) X10_TEMP103 ) ; final double X10_TEMP106 = ( X10_TEMP104 / X10_TEMP105 ) ; final double X10_TEMP107 = ( 1.0 ) ; double xlen = ( X10_TEMP106 - X10_TEMP107 ) ; final Vec X10_TEMP113 = ( Program . Vec_comb ( xlen , leftVec , ylen , upVec ) ) ; final Vec X10_TEMP115 = ( Program . Vec_added ( X10_TEMP113 , viewVec ) ) ; final Vec X10_TEMP117 = ( Program . Vec_normalized ( X10_TEMP115 ) ) ; final Ray X10_TEMP119 = ( Program . Ray_d ( r , X10_TEMP117 ) ) ; r = ( X10_TEMP119 ) ; final int X10_TEMP125 = ( 0 ) ; final double X10_TEMP126 = ( 1.0 ) ; final Isect X10_TEMP127 = ( new Isect ( ) ) ; final Ray X10_TEMP128 = ( new Ray ( ) ) ; Vec col = ( Program . RayTracer_trace ( X10_TEMP0 , X10_TEMP125 , X10_TEMP126 , r , X10_TEMP127 , X10_TEMP128 ) ) ; final double X10_TEMP130 = ( col . x ) ; final double X10_TEMP131 = ( 255.0 ) ; final double X10_TEMP133 = ( X10_TEMP130 * X10_TEMP131 ) ; int red = ( ( int ) X10_TEMP133 ) ; final int X10_TEMP135 = ( 255 ) ; final boolean X10_TEMP137 = red > X10_TEMP135 ; if ( X10_TEMP137 ) { final int X10_TEMP139 = ( 255 ) ; red = ( X10_TEMP139 ) ; }
 final double X10_TEMP140 = ( col . y ) ; final double X10_TEMP141 = ( 255.0 ) ; final double X10_TEMP143 = ( X10_TEMP140 * X10_TEMP141 ) ; int green = ( ( int ) X10_TEMP143 ) ; final int X10_TEMP145 = ( 255 ) ; final boolean X10_TEMP147 = green > X10_TEMP145 ; if ( X10_TEMP147 ) { final int X10_TEMP149 = ( 255 ) ; green = ( X10_TEMP149 ) ; }
 final double X10_TEMP150 = ( col . z ) ; final double X10_TEMP151 = ( 255.0 ) ; final double X10_TEMP153 = ( X10_TEMP150 * X10_TEMP151 ) ; int blue = ( ( int ) X10_TEMP153 ) ; final int X10_TEMP155 = ( 255 ) ; final boolean X10_TEMP157 = blue > X10_TEMP155 ; if ( X10_TEMP157 ) { final int X10_TEMP159 = ( 255 ) ; blue = ( X10_TEMP159 ) ; }
 final long X10_TEMP160 = ( checksum1 + red ) ; final long X10_TEMP161 = ( X10_TEMP160 + green ) ; final long X10_TEMP163 = ( X10_TEMP161 + blue ) ; checksum1 = ( X10_TEMP163 ) ; }
 final long checksumx = ( checksum1 ) ; finish { 
 final T26 utmp26 = new T26(checksumx, pl, X10_TEMP0);
 async (fp) {Program.thread26(utmp26); }
 }
 }
 }
 public static void thread7(final T7 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  EnvelopeStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Envelope [ : rank==1 ] RX10_TEMP14 = ( Envelope [ : rank==1 ] ) ( new Envelope [ RX10_TEMP13 ] ) ; final EnvelopeStub RX10_TEMP15 = new EnvelopeStub ( RX10_TEMP14 ) ; 
 final T27 utmp27 = new T27(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread27(utmp27); }
 }
 }
 public static void thread8(final T8 utmpz) {final  EnvelopeRefArray1 temp = utmpz.temp;
final  place h = utmpz.h;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final int tempobjCount = ( X10_TEMP0 . objCount ) ; final SphereValArray1 tempprim = X10_TEMP0 . prim ; 
 final T28 utmp28 = new T28(tempprim, tempobjCount, temp);
 async (h) {Program.thread28(utmp28); }
 }
 }
 public static void thread9(final T9 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Envelope2Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Envelope2 [ : rank==1 ] RX10_TEMP14 = ( Envelope2 [ : rank==1 ] ) ( new Envelope2 [ RX10_TEMP13 ] ) ; final Envelope2Stub RX10_TEMP15 = new Envelope2Stub ( RX10_TEMP14 ) ; 
 final T29 utmp29 = new T29(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {Program.thread29(utmp29); }
 }
 }
 public static void thread10(final T10 utmpz) {final  Envelope2RefArray1 temp = utmpz.temp;
final  place h = utmpz.h;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final int templightCount = ( X10_TEMP0 . lightCount ) ; final LightValArray1 templights = X10_TEMP0 . lights ; 
 final T30 utmp30 = new T30(templights, templightCount, temp);
 async (h) {Program.thread30(utmp30); }
 }
 }
 public static void thread16(final T16 utmpz) {final  intStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread17(final T17 utmpz) {final  longStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  longStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread18(final T18 utmpz) {final  int RX10_TEMP27 = utmpz.RX10_TEMP27;
final  place RX10_TEMP23 = utmpz.RX10_TEMP23;
final  point ( : rank==1 ) RX10_TEMP22 = utmpz.RX10_TEMP22;
final  LightStub [ : rank==1 ] RX10_TEMP21 = utmpz.RX10_TEMP21;
 { final dist ( : rank==1 ) RX10_TEMP28 = [ 0 : RX10_TEMP27 ] -> here ; final Light [ : rank==1 ] RX10_TEMP29 = ( Light [ : rank==1 ] ) ( new Light [ RX10_TEMP28 ] ) ; final LightStub RX10_TEMP30 = new LightStub ( RX10_TEMP29 ) ; 
 final T36 utmp36 = new T36(RX10_TEMP30, RX10_TEMP22, RX10_TEMP21);
 async (RX10_TEMP23) {Program.thread36(utmp36); }
 }
 }
 public static void thread19(final T19 utmpz) {final  Point1 temp_l = utmpz.temp_l;
final  LightRefArray1 temp = utmpz.temp;
final  place pHere = utmpz.pHere;
final  Scene sc = utmpz.sc;
 { final Light tempLight = ( Program . Scene_getLight ( sc , temp_l ) ) ; 
 final T37 utmp37 = new T37(tempLight, temp);
 async (pHere) {Program.thread37(utmp37); }
 }
 }
 public static void thread20(final T20 utmpz) {final  LightValArray1 templights = utmpz.templights;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final LightValArray1 X10_TEMP53 = templights ; X10_TEMP0 . lights = ( X10_TEMP53 ) ; }
 }
 public static void thread21(final T21 utmpz) {final  int RX10_TEMP79 = utmpz.RX10_TEMP79;
final  place RX10_TEMP75 = utmpz.RX10_TEMP75;
final  point ( : rank==1 ) RX10_TEMP74 = utmpz.RX10_TEMP74;
final  SphereStub [ : rank==1 ] RX10_TEMP73 = utmpz.RX10_TEMP73;
 { final dist ( : rank==1 ) RX10_TEMP80 = [ 0 : RX10_TEMP79 ] -> here ; final Sphere [ : rank==1 ] RX10_TEMP81 = ( Sphere [ : rank==1 ] ) ( new Sphere [ RX10_TEMP80 ] ) ; final SphereStub RX10_TEMP82 = new SphereStub ( RX10_TEMP81 ) ; 
 final T38 utmp38 = new T38(RX10_TEMP82, RX10_TEMP74, RX10_TEMP73);
 async (RX10_TEMP75) {Program.thread38(utmp38); }
 }
 }
 public static void thread22(final T22 utmpz) {final  Point1 temp_o = utmpz.temp_o;
final  SphereRefArray1 temp1 = utmpz.temp1;
final  place pHere = utmpz.pHere;
final  Scene sc = utmpz.sc;
 { final Sphere tempObject = ( Program . Scene_getObject ( sc , temp_o ) ) ; 
 final T39 utmp39 = new T39(tempObject, temp1);
 async (pHere) {Program.thread39(utmp39); }
 }
 }
 public static void thread23(final T23 utmpz) {final  SphereValArray1 tempprim = utmpz.tempprim;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final SphereValArray1 X10_TEMP80 = tempprim ; X10_TEMP0 . prim = ( X10_TEMP80 ) ; }
 }
 public static void thread24(final T24 utmpz) {final  intStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  intStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread25(final T25 utmpz) {final  longStub RX10_TEMP36 = utmpz.RX10_TEMP36;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  longStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP36 ) ; }
 }
 public static void thread26(final T26 utmpz) {final  long checksumx = utmpz.checksumx;
final  Point1 pl = utmpz.pl;
final  RayTracer X10_TEMP0 = utmpz.X10_TEMP0;
 { final longRefArray1 X10_TEMP166 = X10_TEMP0 . checkSumArray ; final long X10_TEMP169 = ( checksumx ) ; final Dist1 RX10_TEMP59 = X10_TEMP166 . distValue ; final Region1 RX10_TEMP60 = RX10_TEMP59 . dReg ; final int RX10_TEMP61 = Program . searchPointInRegion1 ( RX10_TEMP60 , pl ) ; final int RX10_TEMP62 = 0 ; final boolean RX10_TEMP63 = RX10_TEMP61 < RX10_TEMP62 ; if ( RX10_TEMP63 ) { String RX10_TEMP64 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP64 ) ; }
 final place RX10_TEMP65 = Program . getPlaceFromDist1 ( RX10_TEMP59 , RX10_TEMP61 ) ; final place RX10_TEMP67 = here ; final boolean RX10_TEMP68 = RX10_TEMP65 != RX10_TEMP67 ; if ( RX10_TEMP68 ) { String RX10_TEMP66 = "Bad place access for array X10_TEMP166" ; throw new RuntimeException ( RX10_TEMP66 ) ; }
 Program . setRefArrayValue1long ( X10_TEMP166 , RX10_TEMP61 , X10_TEMP169 ) ; }
 }
 public static void thread27(final T27 utmpz) {final  EnvelopeStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  EnvelopeStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread28(final T28 utmpz) {final  SphereValArray1 tempprim = utmpz.tempprim;
final  int tempobjCount = utmpz.tempobjCount;
final  EnvelopeRefArray1 temp = utmpz.temp;
 { final int X10_TEMP20 = ( 0 ) ; final Envelope X10_TEMP24 = ( new Envelope ( tempobjCount , tempprim ) ) ; final Envelope X10_TEMP25 = ( X10_TEMP24 ) ; final Point1 RX10_TEMP20 = new Point1 ( X10_TEMP20 ) ; final Dist1 RX10_TEMP21 = temp . distValue ; final Region1 RX10_TEMP22 = RX10_TEMP21 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { String RX10_TEMP26 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; final place RX10_TEMP29 = here ; final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; if ( RX10_TEMP30 ) { String RX10_TEMP28 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 Program . setRefArrayValue1Envelope ( temp , RX10_TEMP23 , X10_TEMP25 ) ; }
 }
 public static void thread29(final T29 utmpz) {final  Envelope2Stub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  Envelope2Stub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public static void thread30(final T30 utmpz) {final  LightValArray1 templights = utmpz.templights;
final  int templightCount = utmpz.templightCount;
final  Envelope2RefArray1 temp = utmpz.temp;
 { final int X10_TEMP26 = ( 0 ) ; final Envelope2 X10_TEMP30 = ( new Envelope2 ( templightCount , templights ) ) ; final Envelope2 X10_TEMP31 = ( X10_TEMP30 ) ; final Point1 RX10_TEMP20 = new Point1 ( X10_TEMP26 ) ; final Dist1 RX10_TEMP21 = temp . distValue ; final Region1 RX10_TEMP22 = RX10_TEMP21 . dReg ; final int RX10_TEMP23 = Program . searchPointInRegion1 ( RX10_TEMP22 , RX10_TEMP20 ) ; final int RX10_TEMP24 = 0 ; final boolean RX10_TEMP25 = RX10_TEMP23 < RX10_TEMP24 ; if ( RX10_TEMP25 ) { String RX10_TEMP26 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP26 ) ; }
 final place RX10_TEMP27 = Program . getPlaceFromDist1 ( RX10_TEMP21 , RX10_TEMP23 ) ; final place RX10_TEMP29 = here ; final boolean RX10_TEMP30 = RX10_TEMP27 != RX10_TEMP29 ; if ( RX10_TEMP30 ) { String RX10_TEMP28 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP28 ) ; }
 Program . setRefArrayValue1Envelope2 ( temp , RX10_TEMP23 , X10_TEMP31 ) ; }
 }
 public static void thread36(final T36 utmpz) {final  LightStub RX10_TEMP30 = utmpz.RX10_TEMP30;
final  point ( : rank==1 ) RX10_TEMP22 = utmpz.RX10_TEMP22;
final  LightStub [ : rank==1 ] RX10_TEMP21 = utmpz.RX10_TEMP21;
 { RX10_TEMP21 [ RX10_TEMP22 ] = ( RX10_TEMP30 ) ; }
 }
 public static void thread37(final T37 utmpz) {final  Light tempLight = utmpz.tempLight;
final  LightRefArray1 temp = utmpz.temp;
 { final int X10_TEMP41 = ( 0 ) ; final Light X10_TEMP43 = ( tempLight ) ; final Point1 RX10_TEMP35 = new Point1 ( X10_TEMP41 ) ; final Dist1 RX10_TEMP36 = temp . distValue ; final Region1 RX10_TEMP37 = RX10_TEMP36 . dReg ; final int RX10_TEMP38 = Program . searchPointInRegion1 ( RX10_TEMP37 , RX10_TEMP35 ) ; final int RX10_TEMP39 = 0 ; final boolean RX10_TEMP40 = RX10_TEMP38 < RX10_TEMP39 ; if ( RX10_TEMP40 ) { String RX10_TEMP41 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP41 ) ; }
 final place RX10_TEMP42 = Program . getPlaceFromDist1 ( RX10_TEMP36 , RX10_TEMP38 ) ; final place RX10_TEMP44 = here ; final boolean RX10_TEMP45 = RX10_TEMP42 != RX10_TEMP44 ; if ( RX10_TEMP45 ) { String RX10_TEMP43 = "Bad place access for array temp" ; throw new RuntimeException ( RX10_TEMP43 ) ; }
 Program . setRefArrayValue1Light ( temp , RX10_TEMP38 , X10_TEMP43 ) ; }
 }
 public static void thread38(final T38 utmpz) {final  SphereStub RX10_TEMP82 = utmpz.RX10_TEMP82;
final  point ( : rank==1 ) RX10_TEMP74 = utmpz.RX10_TEMP74;
final  SphereStub [ : rank==1 ] RX10_TEMP73 = utmpz.RX10_TEMP73;
 { RX10_TEMP73 [ RX10_TEMP74 ] = ( RX10_TEMP82 ) ; }
 }
 public static void thread39(final T39 utmpz) {final  Sphere tempObject = utmpz.tempObject;
final  SphereRefArray1 temp1 = utmpz.temp1;
 { final int X10_TEMP68 = ( 0 ) ; final Sphere X10_TEMP70 = ( tempObject ) ; final Point1 RX10_TEMP87 = new Point1 ( X10_TEMP68 ) ; final Dist1 RX10_TEMP88 = temp1 . distValue ; final Region1 RX10_TEMP89 = RX10_TEMP88 . dReg ; final int RX10_TEMP90 = Program . searchPointInRegion1 ( RX10_TEMP89 , RX10_TEMP87 ) ; final int RX10_TEMP91 = 0 ; final boolean RX10_TEMP92 = RX10_TEMP90 < RX10_TEMP91 ; if ( RX10_TEMP92 ) { String RX10_TEMP93 = "Array index out of bounds" ; throw new RuntimeException ( RX10_TEMP93 ) ; }
 final place RX10_TEMP94 = Program . getPlaceFromDist1 ( RX10_TEMP88 , RX10_TEMP90 ) ; final place RX10_TEMP96 = here ; final boolean RX10_TEMP97 = RX10_TEMP94 != RX10_TEMP96 ; if ( RX10_TEMP97 ) { String RX10_TEMP95 = "Bad place access for array temp1" ; throw new RuntimeException ( RX10_TEMP95 ) ; }
 Program . setRefArrayValue1Sphere ( temp1 , RX10_TEMP90 , X10_TEMP70 ) ; }
 }

}

 
 value T1 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T1( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T2 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  longStub [ : rank==1 ] RX10_TEMP6;
public T2( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  longStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T3 {

 public final  int myobjCount;

 public final  int mylightCount;

 public final  Scene sc;

 public final  RayTracer X10_TEMP0;
public T3( final  int a_myobjCount,  final  int a_mylightCount,  final  Scene a_sc,  final  RayTracer a_X10_TEMP0) { 
 this.myobjCount = (a_myobjCount);
 this.mylightCount = (a_mylightCount);
 this.sc = (a_sc);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T4 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T4( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T5 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  longStub [ : rank==1 ] RX10_TEMP27;
public T5( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  longStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T6 {

 public final  Point1 pl;

 public final  View myview;

 public final  place fp;

 public final  Dist1 DBlock;

 public final  Interval interval;

 public final  RayTracer X10_TEMP0;
public T6( final  Point1 a_pl,  final  View a_myview,  final  place a_fp,  final  Dist1 a_DBlock,  final  Interval a_interval,  final  RayTracer a_X10_TEMP0) { 
 this.pl = (a_pl);
 this.myview = (a_myview);
 this.fp = (a_fp);
 this.DBlock = (a_DBlock);
 this.interval = (a_interval);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T7 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  EnvelopeStub [ : rank==1 ] RX10_TEMP6;
public T7( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  EnvelopeStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T8 {

 public final  EnvelopeRefArray1 temp;

 public final  place h;

 public final  RayTracer X10_TEMP0;
public T8( final  EnvelopeRefArray1 a_temp,  final  place a_h,  final  RayTracer a_X10_TEMP0) { 
 this.temp = (a_temp);
 this.h = (a_h);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T9 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Envelope2Stub [ : rank==1 ] RX10_TEMP6;
public T9( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Envelope2Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T10 {

 public final  Envelope2RefArray1 temp;

 public final  place h;

 public final  RayTracer X10_TEMP0;
public T10( final  Envelope2RefArray1 a_temp,  final  place a_h,  final  RayTracer a_X10_TEMP0) { 
 this.temp = (a_temp);
 this.h = (a_h);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T11 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  LightStub [ : rank==1 ] RX10_TEMP6;
public T11( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  LightStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T12 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  SphereStub [ : rank==1 ] RX10_TEMP6;
public T12( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  SphereStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T13 {

 public final  int RX10_TEMP12;

 public final  place RX10_TEMP8;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T13( final  int a_RX10_TEMP12,  final  place a_RX10_TEMP8,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP12 = (a_RX10_TEMP12);
 this.RX10_TEMP8 = (a_RX10_TEMP8);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T14 {

 public final  int RX10_TEMP33;

 public final  place RX10_TEMP29;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T14( final  int a_RX10_TEMP33,  final  place a_RX10_TEMP29,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP33 = (a_RX10_TEMP33);
 this.RX10_TEMP29 = (a_RX10_TEMP29);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T15 {

 public final  int RX10_TEMP54;

 public final  place RX10_TEMP50;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T15( final  int a_RX10_TEMP54,  final  place a_RX10_TEMP50,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP54 = (a_RX10_TEMP54);
 this.RX10_TEMP50 = (a_RX10_TEMP50);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T16 {

 public final  intStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T16( final  intStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T17 {

 public final  longStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  longStub [ : rank==1 ] RX10_TEMP6;
public T17( final  longStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  longStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T18 {

 public final  int RX10_TEMP27;

 public final  place RX10_TEMP23;

 public final  point ( : rank==1 ) RX10_TEMP22;

 public final  LightStub [ : rank==1 ] RX10_TEMP21;
public T18( final  int a_RX10_TEMP27,  final  place a_RX10_TEMP23,  final  point ( : rank==1 ) a_RX10_TEMP22,  final  LightStub [ : rank==1 ] a_RX10_TEMP21) { 
 this.RX10_TEMP27 = (a_RX10_TEMP27);
 this.RX10_TEMP23 = (a_RX10_TEMP23);
 this.RX10_TEMP22 = (a_RX10_TEMP22);
 this.RX10_TEMP21 = (a_RX10_TEMP21);
}
}
 
 value T19 {

 public final  Point1 temp_l;

 public final  LightRefArray1 temp;

 public final  place pHere;

 public final  Scene sc;
public T19( final  Point1 a_temp_l,  final  LightRefArray1 a_temp,  final  place a_pHere,  final  Scene a_sc) { 
 this.temp_l = (a_temp_l);
 this.temp = (a_temp);
 this.pHere = (a_pHere);
 this.sc = (a_sc);
}
}
 
 value T20 {

 public final  LightValArray1 templights;

 public final  RayTracer X10_TEMP0;
public T20( final  LightValArray1 a_templights,  final  RayTracer a_X10_TEMP0) { 
 this.templights = (a_templights);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T21 {

 public final  int RX10_TEMP79;

 public final  place RX10_TEMP75;

 public final  point ( : rank==1 ) RX10_TEMP74;

 public final  SphereStub [ : rank==1 ] RX10_TEMP73;
public T21( final  int a_RX10_TEMP79,  final  place a_RX10_TEMP75,  final  point ( : rank==1 ) a_RX10_TEMP74,  final  SphereStub [ : rank==1 ] a_RX10_TEMP73) { 
 this.RX10_TEMP79 = (a_RX10_TEMP79);
 this.RX10_TEMP75 = (a_RX10_TEMP75);
 this.RX10_TEMP74 = (a_RX10_TEMP74);
 this.RX10_TEMP73 = (a_RX10_TEMP73);
}
}
 
 value T22 {

 public final  Point1 temp_o;

 public final  SphereRefArray1 temp1;

 public final  place pHere;

 public final  Scene sc;
public T22( final  Point1 a_temp_o,  final  SphereRefArray1 a_temp1,  final  place a_pHere,  final  Scene a_sc) { 
 this.temp_o = (a_temp_o);
 this.temp1 = (a_temp1);
 this.pHere = (a_pHere);
 this.sc = (a_sc);
}
}
 
 value T23 {

 public final  SphereValArray1 tempprim;

 public final  RayTracer X10_TEMP0;
public T23( final  SphereValArray1 a_tempprim,  final  RayTracer a_X10_TEMP0) { 
 this.tempprim = (a_tempprim);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T24 {

 public final  intStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  intStub [ : rank==1 ] RX10_TEMP6;
public T24( final  intStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  intStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T25 {

 public final  longStub RX10_TEMP36;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  longStub [ : rank==1 ] RX10_TEMP27;
public T25( final  longStub a_RX10_TEMP36,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  longStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP36 = (a_RX10_TEMP36);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T26 {

 public final  long checksumx;

 public final  Point1 pl;

 public final  RayTracer X10_TEMP0;
public T26( final  long a_checksumx,  final  Point1 a_pl,  final  RayTracer a_X10_TEMP0) { 
 this.checksumx = (a_checksumx);
 this.pl = (a_pl);
 this.X10_TEMP0 = (a_X10_TEMP0);
}
}
 
 value T27 {

 public final  EnvelopeStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  EnvelopeStub [ : rank==1 ] RX10_TEMP6;
public T27( final  EnvelopeStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  EnvelopeStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T28 {

 public final  SphereValArray1 tempprim;

 public final  int tempobjCount;

 public final  EnvelopeRefArray1 temp;
public T28( final  SphereValArray1 a_tempprim,  final  int a_tempobjCount,  final  EnvelopeRefArray1 a_temp) { 
 this.tempprim = (a_tempprim);
 this.tempobjCount = (a_tempobjCount);
 this.temp = (a_temp);
}
}
 
 value T29 {

 public final  Envelope2Stub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  Envelope2Stub [ : rank==1 ] RX10_TEMP6;
public T29( final  Envelope2Stub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  Envelope2Stub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T30 {

 public final  LightValArray1 templights;

 public final  int templightCount;

 public final  Envelope2RefArray1 temp;
public T30( final  LightValArray1 a_templights,  final  int a_templightCount,  final  Envelope2RefArray1 a_temp) { 
 this.templights = (a_templights);
 this.templightCount = (a_templightCount);
 this.temp = (a_temp);
}
}
 
 value T31 {

 public final  LightStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  LightStub [ : rank==1 ] RX10_TEMP6;
public T31( final  LightStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  LightStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T32 {

 public final  SphereStub RX10_TEMP15;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  SphereStub [ : rank==1 ] RX10_TEMP6;
public T32( final  SphereStub a_RX10_TEMP15,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  SphereStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP15 = (a_RX10_TEMP15);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T33 {

 public final  doubleStub RX10_TEMP16;

 public final  point ( : rank==1 ) RX10_TEMP7;

 public final  doubleStub [ : rank==1 ] RX10_TEMP6;
public T33( final  doubleStub a_RX10_TEMP16,  final  point ( : rank==1 ) a_RX10_TEMP7,  final  doubleStub [ : rank==1 ] a_RX10_TEMP6) { 
 this.RX10_TEMP16 = (a_RX10_TEMP16);
 this.RX10_TEMP7 = (a_RX10_TEMP7);
 this.RX10_TEMP6 = (a_RX10_TEMP6);
}
}
 
 value T34 {

 public final  doubleStub RX10_TEMP37;

 public final  point ( : rank==1 ) RX10_TEMP28;

 public final  doubleStub [ : rank==1 ] RX10_TEMP27;
public T34( final  doubleStub a_RX10_TEMP37,  final  point ( : rank==1 ) a_RX10_TEMP28,  final  doubleStub [ : rank==1 ] a_RX10_TEMP27) { 
 this.RX10_TEMP37 = (a_RX10_TEMP37);
 this.RX10_TEMP28 = (a_RX10_TEMP28);
 this.RX10_TEMP27 = (a_RX10_TEMP27);
}
}
 
 value T35 {

 public final  doubleStub RX10_TEMP58;

 public final  point ( : rank==1 ) RX10_TEMP49;

 public final  doubleStub [ : rank==1 ] RX10_TEMP48;
public T35( final  doubleStub a_RX10_TEMP58,  final  point ( : rank==1 ) a_RX10_TEMP49,  final  doubleStub [ : rank==1 ] a_RX10_TEMP48) { 
 this.RX10_TEMP58 = (a_RX10_TEMP58);
 this.RX10_TEMP49 = (a_RX10_TEMP49);
 this.RX10_TEMP48 = (a_RX10_TEMP48);
}
}
 
 value T36 {

 public final  LightStub RX10_TEMP30;

 public final  point ( : rank==1 ) RX10_TEMP22;

 public final  LightStub [ : rank==1 ] RX10_TEMP21;
public T36( final  LightStub a_RX10_TEMP30,  final  point ( : rank==1 ) a_RX10_TEMP22,  final  LightStub [ : rank==1 ] a_RX10_TEMP21) { 
 this.RX10_TEMP30 = (a_RX10_TEMP30);
 this.RX10_TEMP22 = (a_RX10_TEMP22);
 this.RX10_TEMP21 = (a_RX10_TEMP21);
}
}
 
 value T37 {

 public final  Light tempLight;

 public final  LightRefArray1 temp;
public T37( final  Light a_tempLight,  final  LightRefArray1 a_temp) { 
 this.tempLight = (a_tempLight);
 this.temp = (a_temp);
}
}
 
 value T38 {

 public final  SphereStub RX10_TEMP82;

 public final  point ( : rank==1 ) RX10_TEMP74;

 public final  SphereStub [ : rank==1 ] RX10_TEMP73;
public T38( final  SphereStub a_RX10_TEMP82,  final  point ( : rank==1 ) a_RX10_TEMP74,  final  SphereStub [ : rank==1 ] a_RX10_TEMP73) { 
 this.RX10_TEMP82 = (a_RX10_TEMP82);
 this.RX10_TEMP74 = (a_RX10_TEMP74);
 this.RX10_TEMP73 = (a_RX10_TEMP73);
}
}
 
 value T39 {

 public final  Sphere tempObject;

 public final  SphereRefArray1 temp1;
public T39( final  Sphere a_tempObject,  final  SphereRefArray1 a_temp1) { 
 this.tempObject = (a_tempObject);
 this.temp1 = (a_temp1);
}
}

 class RayTracer { public Scene scene ; public int lightCount ; public int objCount ; public LightValArray1 lights ; public SphereValArray1 prim ; public View view ; public int height ; public int width ; public intRefArray1 datasizes ; public long checksum ; public longRefArray1 checkSumArray ; public int size_tt ; public int numobjects ; public RayTracer ( ) { }

} 

 value Interval { public final int number ; public final int width ; public final int height ; public final int yfrom ; public final int yto ; public final int total ; public Interval ( final int number_ , final int width_ , final int height_ , final int yfrom_ , final int yto_ , final int total_ ) { this . number = ( number_ ) ; this . width = ( width_ ) ; this . height = ( height_ ) ; this . yfrom = ( yfrom_ ) ; this . yto = ( yto_ ) ; this . total = ( total_ ) ; }

} 

 value Vec { public final double x ; public final double y ; public final double z ; public final boolean isNull ; public Vec ( final double a , final double b , final double c , final boolean isNull_ ) { this . x = ( a ) ; this . y = ( b ) ; this . z = ( c ) ; this . isNull = ( isNull_ ) ; }
 public Vec ( final Vec a , final boolean isNull_ ) { final double X10_TEMP2 = ( a . x ) ; this . x = ( X10_TEMP2 ) ; final double X10_TEMP4 = ( a . y ) ; this . y = ( X10_TEMP4 ) ; final double X10_TEMP6 = ( a . z ) ; this . z = ( X10_TEMP6 ) ; this . isNull = ( isNull_ ) ; }
 public Vec ( ) { final double X10_TEMP2 = ( 0.0 ) ; this . x = ( X10_TEMP2 ) ; final double X10_TEMP4 = ( 0.0 ) ; this . y = ( X10_TEMP4 ) ; final double X10_TEMP6 = ( 0.0 ) ; this . z = ( X10_TEMP6 ) ; final boolean X10_TEMP8 = ( false ) ; this . isNull = ( X10_TEMP8 ) ; }

} 

 value doubleStub { public final double [ : rank==1 ] localArray ; public doubleStub ( final double [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value View { public final Vec from ; public final Vec at ; public final Vec up ; public final double distance ; public final double angle ; public final double aspect ; public View ( final Vec from_ , final Vec at_ , final Vec up_ , final double dist_ , final double angle_ , final double aspect_ ) { this . from = ( from_ ) ; this . at = ( at_ ) ; this . up = ( up_ ) ; this . distance = ( dist_ ) ; this . angle = ( angle_ ) ; this . aspect = ( aspect_ ) ; }

} 

 value longRefArray1 { public final Dist1 distValue ; public final longStub value [ : rank==1 ] contents ; public longRefArray1 ( final Dist1 distValue_ , final longStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Surface { public final Vec color ; public final double kd ; public final double ks ; public final double shine ; public final double kt ; public final double ior ; public final boolean isNull ; public Surface ( ) { int X10_TEMP5 = ( 1 ) ; int X10_TEMP6 = ( 0 ) ; int X10_TEMP7 = ( 0 ) ; boolean X10_TEMP8 = ( false ) ; final Vec X10_TEMP10 = ( new Vec ( X10_TEMP5 , X10_TEMP6 , X10_TEMP7 , X10_TEMP8 ) ) ; this . color = ( X10_TEMP10 ) ; final double X10_TEMP12 = ( 1.0 ) ; this . kd = ( X10_TEMP12 ) ; final double X10_TEMP14 = ( 0.0 ) ; this . ks = ( X10_TEMP14 ) ; final double X10_TEMP16 = ( 0.0 ) ; this . shine = ( X10_TEMP16 ) ; final double X10_TEMP18 = ( 0.0 ) ; this . kt = ( X10_TEMP18 ) ; final double X10_TEMP20 = ( 1.0 ) ; this . ior = ( X10_TEMP20 ) ; final boolean X10_TEMP22 = ( false ) ; this . isNull = ( X10_TEMP22 ) ; }
 public Surface ( final double shine_ , final double ks_ , final double kt_ , final Vec c_ , final boolean isNull_ ) { final double X10_TEMP2 = ( 1.0 ) ; this . kd = ( X10_TEMP2 ) ; this . ks = ( ks_ ) ; this . shine = ( shine_ ) ; this . kt = ( kt_ ) ; final double X10_TEMP7 = ( 1.0 ) ; this . ior = ( X10_TEMP7 ) ; this . color = ( c_ ) ; this . isNull = ( isNull_ ) ; }

} 

 value Light { public final Vec pos ; public final double brightness ; public Light ( final double x , final double y , final double z , final double b ) { boolean X10_TEMP5 = ( false ) ; final Vec X10_TEMP7 = ( new Vec ( x , y , z , X10_TEMP5 ) ) ; this . pos = ( X10_TEMP7 ) ; this . brightness = ( b ) ; }

} 

 value intRefArray1 { public final Dist1 distValue ; public final intStub value [ : rank==1 ] contents ; public intRefArray1 ( final Dist1 distValue_ , final intStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value SphereValArray1 { public final Region1 regionValue ; public final Sphere value [ : rank==1 ] contents ; public SphereValArray1 ( final Region1 regionValue_ , final Sphere value [ : rank==1 ] contents_ ) { this . regionValue = ( regionValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Sphere { public final Vec c ; public final double r ; public final double r2 ; public final Surface surf ; public Sphere ( final Vec center , final double radius , final Surface s ) { this . surf = ( s ) ; this . c = ( center ) ; this . r = ( radius ) ; final double X10_TEMP5 = ( radius * radius ) ; this . r2 = ( X10_TEMP5 ) ; }
 public Sphere ( final Vec center , final double radius ) { this . c = ( center ) ; this . r = ( radius ) ; final double X10_TEMP4 = ( radius * radius ) ; this . r2 = ( X10_TEMP4 ) ; final Surface X10_TEMP6 = ( new Surface ( ) ) ; this . surf = ( X10_TEMP6 ) ; }

} 

 value Envelope2Stub { public final Envelope2 [ : rank==1 ] localArray ; public Envelope2Stub ( final Envelope2 [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 class Ray { public Vec p ; public Vec d ; public Ray ( final Vec pnt , final Vec dir ) { double X10_TEMP5 = ( pnt . x ) ; double X10_TEMP6 = ( pnt . y ) ; double X10_TEMP7 = ( pnt . z ) ; boolean X10_TEMP8 = ( false ) ; final Vec X10_TEMP10 = ( new Vec ( X10_TEMP5 , X10_TEMP6 , X10_TEMP7 , X10_TEMP8 ) ) ; this . p = ( X10_TEMP10 ) ; double X10_TEMP15 = ( dir . x ) ; double X10_TEMP16 = ( dir . y ) ; double X10_TEMP17 = ( dir . z ) ; boolean X10_TEMP18 = ( false ) ; final Vec X10_TEMP19 = ( new Vec ( X10_TEMP15 , X10_TEMP16 , X10_TEMP17 , X10_TEMP18 ) ) ; final Vec X10_TEMP21 = ( Program . Vec_normalized ( X10_TEMP19 ) ) ; this . d = ( X10_TEMP21 ) ; }
 public Ray ( final Vec pnt , final Vec dir , final boolean normalize ) { if ( normalize ) { double X10_TEMP6 = ( pnt . x ) ; double X10_TEMP7 = ( pnt . y ) ; double X10_TEMP8 = ( pnt . z ) ; boolean X10_TEMP9 = ( false ) ; final Vec X10_TEMP11 = ( new Vec ( X10_TEMP6 , X10_TEMP7 , X10_TEMP8 , X10_TEMP9 ) ) ; this . p = ( X10_TEMP11 ) ; double X10_TEMP16 = ( dir . x ) ; double X10_TEMP17 = ( dir . y ) ; double X10_TEMP18 = ( dir . z ) ; boolean X10_TEMP19 = ( false ) ; final Vec X10_TEMP20 = ( new Vec ( X10_TEMP16 , X10_TEMP17 , X10_TEMP18 , X10_TEMP19 ) ) ; final Vec X10_TEMP22 = ( Program . Vec_normalized ( X10_TEMP20 ) ) ; this . d = ( X10_TEMP22 ) ; }
 else { this . p = ( pnt ) ; this . d = ( dir ) ; }
 }
 public Ray ( ) { final Vec X10_TEMP2 = ( new Vec ( ) ) ; this . p = ( X10_TEMP2 ) ; final Vec X10_TEMP4 = ( new Vec ( ) ) ; this . d = ( X10_TEMP4 ) ; }

} 

 value Envelope2 { public final int i ; public final LightValArray1 a ; public Envelope2 ( final int i1 , final LightValArray1 a1 ) { this . i = ( i1 ) ; this . a = ( a1 ) ; }

} 

 value LightValArray1 { public final Region1 regionValue ; public final Light value [ : rank==1 ] contents ; public LightValArray1 ( final Region1 regionValue_ , final Light value [ : rank==1 ] contents_ ) { this . regionValue = ( regionValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value LightRefArray1 { public final Dist1 distValue ; public final LightStub value [ : rank==1 ] contents ; public LightRefArray1 ( final Dist1 distValue_ , final LightStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value doubleRefArray1 { public final Dist1 distValue ; public final doubleStub value [ : rank==1 ] contents ; public doubleRefArray1 ( final Dist1 distValue_ , final doubleStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Dist1 { public final Region1 dReg ; public final Dist dDist ; public Dist1 ( final Region1 dReg_ , final Dist dDist_ ) { this . dReg = ( dReg_ ) ; this . dDist = ( dDist_ ) ; }

} 

 value Envelope { public final int i ; public final SphereValArray1 a ; public Envelope ( final int i1 , final SphereValArray1 a1 ) { this . i = ( i1 ) ; this . a = ( a1 ) ; }

} 

 class Scene { public final LightRefArray1 lights ; public final SphereRefArray1 objects ; public final View view ; public int lightCount ; public int objectCount ; public Scene ( final View v ) { final int X10_TEMP5 = ( 0 ) ; final int X10_TEMP2 = ( Program . _Scene_maxLights ) ; final int X10_TEMP3 = ( 1 ) ; final int X10_TEMP6 = ( X10_TEMP2 - X10_TEMP3 ) ; final Region1 X10_TEMP7 = Program . createNewRegion1R ( X10_TEMP5 , X10_TEMP6 ) ; final place X10_TEMP8 = ( here ) ; Dist1 d1 = Program . getPlaceDist1 ( X10_TEMP7 , X10_TEMP8 ) ; final LightRefArray1 X10_TEMP13 = this . Scene_getLightArray ( d1 ) ; this . lights = ( X10_TEMP13 ) ; final int X10_TEMP18 = ( 0 ) ; final int X10_TEMP15 = ( Program . _Scene_maxObjects ) ; final int X10_TEMP16 = ( 1 ) ; final int X10_TEMP19 = ( X10_TEMP15 - X10_TEMP16 ) ; final Region1 X10_TEMP20 = Program . createNewRegion1R ( X10_TEMP18 , X10_TEMP19 ) ; final place X10_TEMP21 = ( here ) ; Dist1 d2 = Program . getPlaceDist1 ( X10_TEMP20 , X10_TEMP21 ) ; final SphereRefArray1 X10_TEMP26 = this . Scene_getSphereArray ( d2 ) ; this . objects = ( X10_TEMP26 ) ; this . view = ( v ) ; final int X10_TEMP29 = ( 0 ) ; this . lightCount = ( X10_TEMP29 ) ; final int X10_TEMP31 = ( 0 ) ; this . objectCount = ( X10_TEMP31 ) ; }
 public LightRefArray1 Scene_getLightArray ( final Dist1 d ) { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final LightStub [ : rank==1 ] RX10_TEMP6 = ( LightStub [ : rank==1 ] ) ( new LightStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T11 utmp11 = new T11(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread11(utmp11); }
 }
 }
 final LightStub value [ : rank==1 ] RX10_TEMP16 = ( LightStub value [ : rank==1 ] ) ( new LightStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final LightStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final LightRefArray1 RX10_TEMP19 = new LightRefArray1 ( d , RX10_TEMP16 ) ; final LightRefArray1 X10_TEMP2 = RX10_TEMP19 ; return X10_TEMP2 ; }
 public SphereRefArray1 Scene_getSphereArray ( final Dist1 d ) { final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final SphereStub [ : rank==1 ] RX10_TEMP6 = ( SphereStub [ : rank==1 ] ) ( new SphereStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T12 utmp12 = new T12(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread12(utmp12); }
 }
 }
 final SphereStub value [ : rank==1 ] RX10_TEMP16 = ( SphereStub value [ : rank==1 ] ) ( new SphereStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP18 ) { final SphereStub RX10_TEMP17 = RX10_TEMP6 [ RX10_TEMP18 ] ; return RX10_TEMP17 ; }
 ) ; final SphereRefArray1 RX10_TEMP19 = new SphereRefArray1 ( d , RX10_TEMP16 ) ; final SphereRefArray1 X10_TEMP2 = RX10_TEMP19 ; return X10_TEMP2 ; }
 public void thread11(final T11 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  LightStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Light [ : rank==1 ] RX10_TEMP14 = ( Light [ : rank==1 ] ) ( new Light [ RX10_TEMP13 ] ) ; final LightStub RX10_TEMP15 = new LightStub ( RX10_TEMP14 ) ; 
 final T31 utmp31 = new T31(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread31(utmp31); }
 }
 }
 public void thread12(final T12 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  SphereStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP13 = [ 0 : RX10_TEMP12 ] -> here ; final Sphere [ : rank==1 ] RX10_TEMP14 = ( Sphere [ : rank==1 ] ) ( new Sphere [ RX10_TEMP13 ] ) ; final SphereStub RX10_TEMP15 = new SphereStub ( RX10_TEMP14 ) ; 
 final T32 utmp32 = new T32(RX10_TEMP15, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread32(utmp32); }
 }
 }
 public void thread31(final T31 utmpz) {final  LightStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  LightStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }
 public void thread32(final T32 utmpz) {final  SphereStub RX10_TEMP15 = utmpz.RX10_TEMP15;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  SphereStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP15 ) ; }
 }

} 

 class Timer { public doubleRefArray1 start_time ; public doubleRefArray1 elapsed_time ; public doubleRefArray1 total_time ; public Timer ( ) { final int X10_TEMP3 = ( 0 ) ; final int X10_TEMP4 = ( Program . _Timer_max_counters ) ; final Region1 X10_TEMP5 = Program . createNewRegion1R ( X10_TEMP3 , X10_TEMP4 ) ; final place X10_TEMP6 = ( place.FIRST_PLACE ) ; final Dist1 d = Program . getPlaceDist1 ( X10_TEMP5 , X10_TEMP6 ) ; final Region1 RX10_TEMP0 = d . dReg ; final int RX10_TEMP1 = 0 ; final int RX10_TEMP2 = 1 ; int RX10_TEMP3 = place.MAX_PLACES ; RX10_TEMP3 = RX10_TEMP3 - RX10_TEMP2 ; final region ( : rank==1 ) RX10_TEMP4 = [ 0 : RX10_TEMP3 ] ; final dist ( : rank==1 ) RX10_TEMP5 = [ 0 : RX10_TEMP3 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP6 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP5 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP7 : RX10_TEMP4 ) { final place RX10_TEMP8 = here ; final int RX10_TEMP9 = RX10_TEMP7 [0] ; final place RX10_TEMP10 = place.places ( RX10_TEMP9 ) ; final int RX10_TEMP11 = Program . getDistLocalCount1 ( d , RX10_TEMP9 ) ; final int RX10_TEMP12 = RX10_TEMP11 - RX10_TEMP2 ; 
 final T13 utmp13 = new T13(RX10_TEMP12, RX10_TEMP8, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP10) {this.thread13(utmp13); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP17 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP4 ] ( point ( : rank==1 ) RX10_TEMP19 ) { final doubleStub RX10_TEMP18 = RX10_TEMP6 [ RX10_TEMP19 ] ; return RX10_TEMP18 ; }
 ) ; final doubleRefArray1 RX10_TEMP20 = new doubleRefArray1 ( d , RX10_TEMP17 ) ; final doubleRefArray1 X10_TEMP11 = RX10_TEMP20 ; this . start_time = ( X10_TEMP11 ) ; final Region1 RX10_TEMP21 = d . dReg ; final int RX10_TEMP22 = 0 ; final int RX10_TEMP23 = 1 ; int RX10_TEMP24 = place.MAX_PLACES ; RX10_TEMP24 = RX10_TEMP24 - RX10_TEMP23 ; final region ( : rank==1 ) RX10_TEMP25 = [ 0 : RX10_TEMP24 ] ; final dist ( : rank==1 ) RX10_TEMP26 = [ 0 : RX10_TEMP24 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP27 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP26 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP28 : RX10_TEMP25 ) { final place RX10_TEMP29 = here ; final int RX10_TEMP30 = RX10_TEMP28 [0] ; final place RX10_TEMP31 = place.places ( RX10_TEMP30 ) ; final int RX10_TEMP32 = Program . getDistLocalCount1 ( d , RX10_TEMP30 ) ; final int RX10_TEMP33 = RX10_TEMP32 - RX10_TEMP23 ; 
 final T14 utmp14 = new T14(RX10_TEMP33, RX10_TEMP29, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP31) {this.thread14(utmp14); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP38 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP25 ] ( point ( : rank==1 ) RX10_TEMP40 ) { final doubleStub RX10_TEMP39 = RX10_TEMP27 [ RX10_TEMP40 ] ; return RX10_TEMP39 ; }
 ) ; final doubleRefArray1 RX10_TEMP41 = new doubleRefArray1 ( d , RX10_TEMP38 ) ; final doubleRefArray1 X10_TEMP15 = RX10_TEMP41 ; this . elapsed_time = ( X10_TEMP15 ) ; final Region1 RX10_TEMP42 = d . dReg ; final int RX10_TEMP43 = 0 ; final int RX10_TEMP44 = 1 ; int RX10_TEMP45 = place.MAX_PLACES ; RX10_TEMP45 = RX10_TEMP45 - RX10_TEMP44 ; final region ( : rank==1 ) RX10_TEMP46 = [ 0 : RX10_TEMP45 ] ; final dist ( : rank==1 ) RX10_TEMP47 = [ 0 : RX10_TEMP45 ] -> here ; final doubleStub [ : rank==1 ] RX10_TEMP48 = ( doubleStub [ : rank==1 ] ) ( new doubleStub [ RX10_TEMP47 ] ) ; finish { for ( point ( : rank==1 ) RX10_TEMP49 : RX10_TEMP46 ) { final place RX10_TEMP50 = here ; final int RX10_TEMP51 = RX10_TEMP49 [0] ; final place RX10_TEMP52 = place.places ( RX10_TEMP51 ) ; final int RX10_TEMP53 = Program . getDistLocalCount1 ( d , RX10_TEMP51 ) ; final int RX10_TEMP54 = RX10_TEMP53 - RX10_TEMP44 ; 
 final T15 utmp15 = new T15(RX10_TEMP54, RX10_TEMP50, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP52) {this.thread15(utmp15); }
 }
 }
 final doubleStub value [ : rank==1 ] RX10_TEMP59 = ( doubleStub value [ : rank==1 ] ) ( new doubleStub value [ RX10_TEMP46 ] ( point ( : rank==1 ) RX10_TEMP61 ) { final doubleStub RX10_TEMP60 = RX10_TEMP48 [ RX10_TEMP61 ] ; return RX10_TEMP60 ; }
 ) ; final doubleRefArray1 RX10_TEMP62 = new doubleRefArray1 ( d , RX10_TEMP59 ) ; final doubleRefArray1 X10_TEMP19 = RX10_TEMP62 ; this . total_time = ( X10_TEMP19 ) ; }
 public void thread13(final T13 utmpz) {final  int RX10_TEMP12 = utmpz.RX10_TEMP12;
final  place RX10_TEMP8 = utmpz.RX10_TEMP8;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { final dist ( : rank==1 ) RX10_TEMP14 = [ 0 : RX10_TEMP12 ] -> here ; final double [ : rank==1 ] RX10_TEMP15 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP14 ] ( point ( : rank==1 ) RX10_TEMP13 ) { final double X10_TEMP9 = ( 0 ) ; return X10_TEMP9 ; }
 ) ; final doubleStub RX10_TEMP16 = new doubleStub ( RX10_TEMP15 ) ; 
 final T33 utmp33 = new T33(RX10_TEMP16, RX10_TEMP7, RX10_TEMP6);
 async (RX10_TEMP8) {this.thread33(utmp33); }
 }
 }
 public void thread14(final T14 utmpz) {final  int RX10_TEMP33 = utmpz.RX10_TEMP33;
final  place RX10_TEMP29 = utmpz.RX10_TEMP29;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { final dist ( : rank==1 ) RX10_TEMP35 = [ 0 : RX10_TEMP33 ] -> here ; final double [ : rank==1 ] RX10_TEMP36 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP35 ] ( point ( : rank==1 ) RX10_TEMP34 ) { final double X10_TEMP13 = ( 0 ) ; return X10_TEMP13 ; }
 ) ; final doubleStub RX10_TEMP37 = new doubleStub ( RX10_TEMP36 ) ; 
 final T34 utmp34 = new T34(RX10_TEMP37, RX10_TEMP28, RX10_TEMP27);
 async (RX10_TEMP29) {this.thread34(utmp34); }
 }
 }
 public void thread15(final T15 utmpz) {final  int RX10_TEMP54 = utmpz.RX10_TEMP54;
final  place RX10_TEMP50 = utmpz.RX10_TEMP50;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { final dist ( : rank==1 ) RX10_TEMP56 = [ 0 : RX10_TEMP54 ] -> here ; final double [ : rank==1 ] RX10_TEMP57 = ( double [ : rank==1 ] ) ( new double [ RX10_TEMP56 ] ( point ( : rank==1 ) RX10_TEMP55 ) { final double X10_TEMP17 = ( 0 ) ; return X10_TEMP17 ; }
 ) ; final doubleStub RX10_TEMP58 = new doubleStub ( RX10_TEMP57 ) ; 
 final T35 utmp35 = new T35(RX10_TEMP58, RX10_TEMP49, RX10_TEMP48);
 async (RX10_TEMP50) {this.thread35(utmp35); }
 }
 }
 public void thread33(final T33 utmpz) {final  doubleStub RX10_TEMP16 = utmpz.RX10_TEMP16;
final  point ( : rank==1 ) RX10_TEMP7 = utmpz.RX10_TEMP7;
final  doubleStub [ : rank==1 ] RX10_TEMP6 = utmpz.RX10_TEMP6;
 { RX10_TEMP6 [ RX10_TEMP7 ] = ( RX10_TEMP16 ) ; }
 }
 public void thread34(final T34 utmpz) {final  doubleStub RX10_TEMP37 = utmpz.RX10_TEMP37;
final  point ( : rank==1 ) RX10_TEMP28 = utmpz.RX10_TEMP28;
final  doubleStub [ : rank==1 ] RX10_TEMP27 = utmpz.RX10_TEMP27;
 { RX10_TEMP27 [ RX10_TEMP28 ] = ( RX10_TEMP37 ) ; }
 }
 public void thread35(final T35 utmpz) {final  doubleStub RX10_TEMP58 = utmpz.RX10_TEMP58;
final  point ( : rank==1 ) RX10_TEMP49 = utmpz.RX10_TEMP49;
final  doubleStub [ : rank==1 ] RX10_TEMP48 = utmpz.RX10_TEMP48;
 { RX10_TEMP48 [ RX10_TEMP49 ] = ( RX10_TEMP58 ) ; }
 }

} 

 value LightStub { public final Light [ : rank==1 ] localArray ; public LightStub ( final Light [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Region1 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final Point1 value [ : rank==1 ] pointArray ; public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; }
 public Region1 ( final Point1 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ ) { final boolean t = true ; final int regR = 1 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; }

} 

 value Region3 { public final int regRank ; public final int regSize ; public final boolean regType ; public final int low0 ; public final int dim0 ; public final int low1 ; public final int dim1 ; public final int low2 ; public final int dim2 ; public final Point3 value [ : rank==1 ] pointArray ; public Region3 ( final Point3 value [ : rank==1 ] pointArray_ , final int regSize_ ) { final int zero = 0 ; final int one = 1 ; final int minusOne = zero - one ; final boolean f = false ; final int regR = 3 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( f ) ; this . low0 = ( minusOne ) ; this . dim0 = ( zero ) ; this . low1 = ( minusOne ) ; this . dim1 = ( zero ) ; this . low2 = ( minusOne ) ; this . dim2 = ( zero ) ; }
 public Region3 ( final Point3 value [ : rank==1 ] pointArray_ , final int regSize_ , final int low0_ , final int dim0_ , final int low1_ , final int dim1_ , final int low2_ , final int dim2_ ) { final boolean t = true ; final int regR = 3 ; this . regRank = ( regR ) ; this . regSize = ( regSize_ ) ; this . pointArray = ( pointArray_ ) ; this . regType = ( t ) ; this . low0 = ( low0_ ) ; this . dim0 = ( dim0_ ) ; this . low1 = ( low1_ ) ; this . dim1 = ( dim1_ ) ; this . low2 = ( low2_ ) ; this . dim2 = ( dim2_ ) ; }

} 

 value Envelope2RefArray1 { public final Dist1 distValue ; public final Envelope2Stub value [ : rank==1 ] contents ; public Envelope2RefArray1 ( final Dist1 distValue_ , final Envelope2Stub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Point1 { public final int f0 ; public Point1 ( final int f0_ ) { this . f0 = ( f0_ ) ; }

} 

 value SphereRefArray1 { public final Dist1 distValue ; public final SphereStub value [ : rank==1 ] contents ; public SphereRefArray1 ( final Dist1 distValue_ , final SphereStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value Point3 { public final int f0 ; public final int f1 ; public final int f2 ; public Point3 ( final int f0_ , final int f1_ , final int f2_ ) { this . f0 = ( f0_ ) ; this . f1 = ( f1_ ) ; this . f2 = ( f2_ ) ; }

} 

 value intStub { public final int [ : rank==1 ] localArray ; public intStub ( final int [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value Dist { public final place value [ : rank==1 ] placeArray ; public final int value [ : rank==1 ] counts ; public final int value [ : rank==1 ] runningSum ; public Dist ( final place value [ : rank==1 ] vPlaceArray , final int arraySize ) { final int one = 1 ; final int zero = 0 ; final int maxPlaces = place.MAX_PLACES ; final int ub = maxPlaces - one ; final region ( : rank==1 ) countReg = [ 0 : ub ] ; final dist ( : rank==1 ) countDist = [ 0 : ub ] -> here ; final int rSize = arraySize - one ; final region ( : rank==1 ) arrayReg = [ 0 : rSize ] ; final dist ( : rank==1 ) runSumDist = [ 0 : rSize ] -> here ; final int [ : rank==1 ] tempCounts = ( int [ : rank==1 ] ) ( new int [ countDist ] ) ; final int [ : rank==1 ] tempRunSum = ( int [ : rank==1 ] ) ( new int [ runSumDist ] ) ; for ( point ( : rank==1 ) p : countReg ) { tempCounts [ p ] = ( zero ) ; }
 for ( point ( : rank==1 ) p : arrayReg ) { final place pl = vPlaceArray [ p ] ; final int index = pl . id ; final int oldVal = tempCounts [ index ] ; tempRunSum [ p ] = ( oldVal ) ; final int oldValPlusOne = oldVal + one ; tempCounts [ index ] = ( oldValPlusOne ) ; }
 this . placeArray = ( vPlaceArray ) ; final int value [ : rank==1 ] tempCountsV = Program . initDist ( tempCounts , countReg ) ; this . counts = ( tempCountsV ) ; final int value [ : rank==1 ] tempRunSumV = Program . initDist ( tempRunSum , arrayReg ) ; this . runningSum = ( tempRunSumV ) ; }

} 

 class Isect { public double t ; public int enter ; public Sphere prim ; public Surface surf ; public boolean isNull ; public Isect ( ) { final double X10_TEMP2 = ( 0.0 ) ; this . t = ( X10_TEMP2 ) ; final int X10_TEMP4 = ( 0 ) ; this . enter = ( X10_TEMP4 ) ; final boolean X10_TEMP6 = ( false ) ; this . isNull = ( X10_TEMP6 ) ; }
 public Isect ( final double t_ , final int enter_ , final boolean isNull_ , final Sphere prim_ , final Surface surf_ ) { this . t = ( t_ ) ; this . isNull = ( isNull_ ) ; this . enter = ( enter_ ) ; this . prim = ( prim_ ) ; this . surf = ( surf_ ) ; }

} 

 value EnvelopeRefArray1 { public final Dist1 distValue ; public final EnvelopeStub value [ : rank==1 ] contents ; public EnvelopeRefArray1 ( final Dist1 distValue_ , final EnvelopeStub value [ : rank==1 ] contents_ ) { this . distValue = ( distValue_ ) ; this . contents = ( contents_ ) ; }

} 

 value EnvelopeStub { public final Envelope [ : rank==1 ] localArray ; public EnvelopeStub ( final Envelope [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value longStub { public final long [ : rank==1 ] localArray ; public longStub ( final long [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

 value SphereStub { public final Sphere [ : rank==1 ] localArray ; public SphereStub ( final Sphere [ : rank==1 ] localArray_ ) { this . localArray = ( localArray_ ) ; }

} 

