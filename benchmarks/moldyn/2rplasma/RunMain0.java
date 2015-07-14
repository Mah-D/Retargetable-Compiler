import x10.lang.*;

public class RunMain0
extends x10.
  lang.
  Object
{
    
    
//#line 2
/* template:Main { */
    public static class Main extends x10.runtime.Activity {
    	private final String[] form;
    	public Main(String[] args) {
    		super("Main Activity");
    		this.form = args;
    	}
    	public void runX10Task() {
    		main(form);
    	}
    }
    
    // the original app-main method
    public static void main(java.
      lang.
      String[] args) {
    	if (x10.lang.Runtime.runtime == null) {
    		System.err.println("Please use the 'x10' script to invoke X10 programs, or see the generated");
    		System.err.println("Java code for alternate invocation instructions.");
    		System.exit(128);
    	}
    {
        
//#line 3
Program0.
                     runMain();
    }
    }
    
    // How to invoke?  Use the following general command:
    // java $(javaArgs) x10.lang.Runtime $(x10Args) ClassName $(x10AppArgs)
    /* } */
    
    
    
//#line 1
public RunMain0() {
        
//#line 1
super();
    }
}

class Program0
extends x10.
  lang.
  Object
{
    
//#line 9
final public static int
      _Program__md_ITERS =
      Program0.
        _Program__md_ITERS_init();
    
//#line 10
final public static double
      _Program__md_LENGTH =
      Program0.
        _Program__md_LENGTH_init();
    
//#line 11
final public static double
      _Program__md_m =
      Program0.
        _Program__md_m_init();
    
//#line 12
final public static double
      _Program__md_mu =
      Program0.
        _Program__md_mu_init();
    
//#line 13
final public static double
      _Program__md_kb =
      Program0.
        _Program__md_kb_init();
    
//#line 14
final public static double
      _Program__md_TSIM =
      Program0.
        _Program__md_TSIM_init();
    
//#line 15
final public static double
      _Program__md_deltat =
      Program0.
        _Program__md_deltat_init();
    
//#line 16
final public static double
      _Program__md_den =
      Program0.
        _Program__md_den_init();
    
//#line 17
final public static double
      _Program__md_tref =
      Program0.
        _Program__md_tref_init();
    
//#line 18
final public static double
      _Program__md_h =
      Program0.
        _Program__md_h_init();
    
//#line 19
final public static int
      _Program__md_irep =
      Program0.
        _Program__md_irep_init();
    
//#line 20
final public static int
      _Program__md_istop =
      Program0.
        _Program__md_istop_init();
    
//#line 21
final public static int
      _Program__md_iprint =
      Program0.
        _Program__md_iprint_init();
    
//#line 22
final public static int
      _Program__md_movemx =
      Program0.
        _Program__md_movemx_init();
    
//#line 23
final public static int
      _Program__Timer_max_counters =
      Program0.
        _Program__Timer_max_counters_init();
    
    
//#line 26
public static void
                  runMain(
                  ) {
        
//#line 27
Program0.
                      Program_runMain();
    }
    
    
//#line 29
public static int
                  _Program__md_ITERS_init(
                  ) {
        
//#line 31
final int X10_TEMP576 =
          (Program0.
             Program__md_ITERS_init());
        
//#line 32
return X10_TEMP576;
    }
    
    
//#line 34
public static double
                  _Program__md_LENGTH_init(
                  ) {
        
//#line 36
final double X10_TEMP576 =
          (Program0.
             Program__md_LENGTH_init());
        
//#line 37
return X10_TEMP576;
    }
    
    
//#line 39
public static double
                  _Program__md_m_init(
                  ) {
        
//#line 41
final double X10_TEMP576 =
          (Program0.
             Program__md_m_init());
        
//#line 42
return X10_TEMP576;
    }
    
    
//#line 44
public static double
                  _Program__md_mu_init(
                  ) {
        
//#line 46
final double X10_TEMP576 =
          (Program0.
             Program__md_mu_init());
        
//#line 47
return X10_TEMP576;
    }
    
    
//#line 49
public static double
                  _Program__md_kb_init(
                  ) {
        
//#line 51
final double X10_TEMP576 =
          (Program0.
             Program__md_kb_init());
        
//#line 52
return X10_TEMP576;
    }
    
    
//#line 54
public static double
                  _Program__md_TSIM_init(
                  ) {
        
//#line 56
final double X10_TEMP576 =
          (Program0.
             Program__md_TSIM_init());
        
//#line 57
return X10_TEMP576;
    }
    
    
//#line 59
public static double
                  _Program__md_deltat_init(
                  ) {
        
//#line 61
final double X10_TEMP576 =
          (Program0.
             Program__md_deltat_init());
        
//#line 62
return X10_TEMP576;
    }
    
    
//#line 64
public static double
                  _Program__md_den_init(
                  ) {
        
//#line 66
final double X10_TEMP576 =
          (Program0.
             Program__md_den_init());
        
//#line 67
return X10_TEMP576;
    }
    
    
//#line 69
public static double
                  _Program__md_tref_init(
                  ) {
        
//#line 71
final double X10_TEMP576 =
          (Program0.
             Program__md_tref_init());
        
//#line 72
return X10_TEMP576;
    }
    
    
//#line 74
public static double
                  _Program__md_h_init(
                  ) {
        
//#line 76
final double X10_TEMP576 =
          (Program0.
             Program__md_h_init());
        
//#line 77
return X10_TEMP576;
    }
    
    
//#line 79
public static int
                  _Program__md_irep_init(
                  ) {
        
//#line 81
final int X10_TEMP576 =
          (Program0.
             Program__md_irep_init());
        
//#line 82
return X10_TEMP576;
    }
    
    
//#line 84
public static int
                  _Program__md_istop_init(
                  ) {
        
//#line 86
final int X10_TEMP576 =
          (Program0.
             Program__md_istop_init());
        
//#line 87
return X10_TEMP576;
    }
    
    
//#line 89
public static int
                  _Program__md_iprint_init(
                  ) {
        
//#line 91
final int X10_TEMP576 =
          (Program0.
             Program__md_iprint_init());
        
//#line 92
return X10_TEMP576;
    }
    
    
//#line 94
public static int
                  _Program__md_movemx_init(
                  ) {
        
//#line 96
final int X10_TEMP576 =
          (Program0.
             Program__md_movemx_init());
        
//#line 97
return X10_TEMP576;
    }
    
    
//#line 99
public static int
                  _Program__Timer_max_counters_init(
                  ) {
        
//#line 101
final int X10_TEMP576 =
          (Program0.
             Program__Timer_max_counters_init());
        
//#line 102
return X10_TEMP576;
    }
    
    
//#line 104
public static void
                   Program_Particle_domove(
                   final Particle X10_TEMP0,
                   final double side) {
        
//#line 105
final double X10_TEMP576 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 107
final double X10_TEMP1 =
          (X10_TEMP576);
        
//#line 108
final double X10_TEMP579 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 110
final double X10_TEMP2 =
          (X10_TEMP579);
        
//#line 111
final double X10_TEMP582 =
          (X10_TEMP1 +
             X10_TEMP2);
        
//#line 113
final double X10_TEMP3 =
          (X10_TEMP582);
        
//#line 114
final double X10_TEMP585 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 116
final double X10_TEMP4 =
          (X10_TEMP585);
        
//#line 117
final double X10_TEMP588 =
          (X10_TEMP3 +
             X10_TEMP4);
        
//#line 119
final double X10_TEMP7 =
          (X10_TEMP588);
        
//#line 120
final double X10_TEMP591 =
          (X10_TEMP7);
        
//#line 122
final double X10_TEMP8 =
          (X10_TEMP591);
        
//#line 123
final double X10_TEMP594 =
          (X10_TEMP8);
        
//#line 125
final double X10_TEMP597 =
          (X10_TEMP594);
        
//#line 126
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
          ((X10_TEMP597));
        
//#line 127
final double X10_TEMP599 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 129
final double X10_TEMP9 =
          (X10_TEMP599);
        
//#line 130
final double X10_TEMP602 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 132
final double X10_TEMP10 =
          (X10_TEMP602);
        
//#line 133
final double X10_TEMP605 =
          (X10_TEMP9 +
             X10_TEMP10);
        
//#line 135
final double X10_TEMP11 =
          (X10_TEMP605);
        
//#line 136
final double X10_TEMP608 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 138
final double X10_TEMP12 =
          (X10_TEMP608);
        
//#line 139
final double X10_TEMP611 =
          (X10_TEMP11 +
             X10_TEMP12);
        
//#line 141
final double X10_TEMP15 =
          (X10_TEMP611);
        
//#line 142
final double X10_TEMP614 =
          (X10_TEMP15);
        
//#line 144
final double X10_TEMP16 =
          (X10_TEMP614);
        
//#line 145
final double X10_TEMP617 =
          (X10_TEMP16);
        
//#line 147
final double X10_TEMP620 =
          (X10_TEMP617);
        
//#line 148
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
          ((X10_TEMP620));
        
//#line 149
final double X10_TEMP622 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 151
final double X10_TEMP17 =
          (X10_TEMP622);
        
//#line 152
final double X10_TEMP625 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 154
final double X10_TEMP18 =
          (X10_TEMP625);
        
//#line 155
final double X10_TEMP628 =
          (X10_TEMP17 +
             X10_TEMP18);
        
//#line 157
final double X10_TEMP19 =
          (X10_TEMP628);
        
//#line 158
final double X10_TEMP631 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 160
final double X10_TEMP20 =
          (X10_TEMP631);
        
//#line 161
final double X10_TEMP634 =
          (X10_TEMP19 +
             X10_TEMP20);
        
//#line 163
final double X10_TEMP23 =
          (X10_TEMP634);
        
//#line 164
final double X10_TEMP637 =
          (X10_TEMP23);
        
//#line 166
final double X10_TEMP24 =
          (X10_TEMP637);
        
//#line 167
final double X10_TEMP640 =
          (X10_TEMP24);
        
//#line 169
final double X10_TEMP643 =
          (X10_TEMP640);
        
//#line 170
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
          ((X10_TEMP643));
        
//#line 171
final double X10_TEMP645 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 173
final double X10_TEMP25 =
          (X10_TEMP645);
        
//#line 174
final int X10_TEMP648 =
          (0);
        
//#line 176
final int X10_TEMP26 =
          (X10_TEMP648);
        
//#line 177
final boolean X10_TEMP28 =
          (X10_TEMP25 <
             X10_TEMP26);
        
//#line 178
if (X10_TEMP28) {
            
//#line 179
final double X10_TEMP653 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
            
//#line 181
final double X10_TEMP29 =
              (X10_TEMP653);
            
//#line 182
final double X10_TEMP656 =
              (X10_TEMP29 +
                 side);
            
//#line 184
final double X10_TEMP32 =
              (X10_TEMP656);
            
//#line 185
final double X10_TEMP659 =
              (X10_TEMP32);
            
//#line 187
final double X10_TEMP33 =
              (X10_TEMP659);
            
//#line 188
final double X10_TEMP662 =
              (X10_TEMP33);
            
//#line 190
final double X10_TEMP665 =
              (X10_TEMP662);
            
//#line 191
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
              ((X10_TEMP665));
        }
        
//#line 193
final double X10_TEMP667 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 195
final double X10_TEMP34 =
          (X10_TEMP667);
        
//#line 196
final boolean X10_TEMP36 =
          (X10_TEMP34 >
             side);
        
//#line 197
if (X10_TEMP36) {
            
//#line 198
final double X10_TEMP672 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
            
//#line 200
final double X10_TEMP37 =
              (X10_TEMP672);
            
//#line 201
final double X10_TEMP675 =
              (X10_TEMP37 -
                 side);
            
//#line 203
final double X10_TEMP40 =
              (X10_TEMP675);
            
//#line 204
final double X10_TEMP678 =
              (X10_TEMP40);
            
//#line 206
final double X10_TEMP41 =
              (X10_TEMP678);
            
//#line 207
final double X10_TEMP681 =
              (X10_TEMP41);
            
//#line 209
final double X10_TEMP684 =
              (X10_TEMP681);
            
//#line 210
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord =
              ((X10_TEMP684));
        }
        
//#line 212
final double X10_TEMP686 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 214
final double X10_TEMP42 =
          (X10_TEMP686);
        
//#line 215
final int X10_TEMP689 =
          (0);
        
//#line 217
final int X10_TEMP43 =
          (X10_TEMP689);
        
//#line 218
final boolean X10_TEMP45 =
          (X10_TEMP42 <
             X10_TEMP43);
        
//#line 219
if (X10_TEMP45) {
            
//#line 220
final double X10_TEMP694 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
            
//#line 222
final double X10_TEMP46 =
              (X10_TEMP694);
            
//#line 223
final double X10_TEMP697 =
              (X10_TEMP46 +
                 side);
            
//#line 225
final double X10_TEMP49 =
              (X10_TEMP697);
            
//#line 226
final double X10_TEMP700 =
              (X10_TEMP49);
            
//#line 228
final double X10_TEMP50 =
              (X10_TEMP700);
            
//#line 229
final double X10_TEMP703 =
              (X10_TEMP50);
            
//#line 231
final double X10_TEMP706 =
              (X10_TEMP703);
            
//#line 232
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
              ((X10_TEMP706));
        }
        
//#line 234
final double X10_TEMP708 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 236
final double X10_TEMP51 =
          (X10_TEMP708);
        
//#line 237
final boolean X10_TEMP53 =
          (X10_TEMP51 >
             side);
        
//#line 238
if (X10_TEMP53) {
            
//#line 239
final double X10_TEMP713 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
            
//#line 241
final double X10_TEMP54 =
              (X10_TEMP713);
            
//#line 242
final double X10_TEMP716 =
              (X10_TEMP54 -
                 side);
            
//#line 244
final double X10_TEMP57 =
              (X10_TEMP716);
            
//#line 245
final double X10_TEMP719 =
              (X10_TEMP57);
            
//#line 247
final double X10_TEMP58 =
              (X10_TEMP719);
            
//#line 248
final double X10_TEMP722 =
              (X10_TEMP58);
            
//#line 250
final double X10_TEMP725 =
              (X10_TEMP722);
            
//#line 251
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord =
              ((X10_TEMP725));
        }
        
//#line 253
final double X10_TEMP727 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 255
final double X10_TEMP59 =
          (X10_TEMP727);
        
//#line 256
final int X10_TEMP730 =
          (0);
        
//#line 258
final int X10_TEMP60 =
          (X10_TEMP730);
        
//#line 259
final boolean X10_TEMP62 =
          (X10_TEMP59 <
             X10_TEMP60);
        
//#line 260
if (X10_TEMP62) {
            
//#line 261
final double X10_TEMP735 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
            
//#line 263
final double X10_TEMP63 =
              (X10_TEMP735);
            
//#line 264
final double X10_TEMP738 =
              (X10_TEMP63 +
                 side);
            
//#line 266
final double X10_TEMP66 =
              (X10_TEMP738);
            
//#line 267
final double X10_TEMP741 =
              (X10_TEMP66);
            
//#line 269
final double X10_TEMP67 =
              (X10_TEMP741);
            
//#line 270
final double X10_TEMP744 =
              (X10_TEMP67);
            
//#line 272
final double X10_TEMP747 =
              (X10_TEMP744);
            
//#line 273
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
              ((X10_TEMP747));
        }
        
//#line 275
final double X10_TEMP749 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 277
final double X10_TEMP68 =
          (X10_TEMP749);
        
//#line 278
final boolean X10_TEMP70 =
          (X10_TEMP68 >
             side);
        
//#line 279
if (X10_TEMP70) {
            
//#line 280
final double X10_TEMP754 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
            
//#line 282
final double X10_TEMP71 =
              (X10_TEMP754);
            
//#line 283
final double X10_TEMP757 =
              (X10_TEMP71 -
                 side);
            
//#line 285
final double X10_TEMP74 =
              (X10_TEMP757);
            
//#line 286
final double X10_TEMP760 =
              (X10_TEMP74);
            
//#line 288
final double X10_TEMP75 =
              (X10_TEMP760);
            
//#line 289
final double X10_TEMP763 =
              (X10_TEMP75);
            
//#line 291
final double X10_TEMP766 =
              (X10_TEMP763);
            
//#line 292
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord =
              ((X10_TEMP766));
        }
        
//#line 294
final double X10_TEMP768 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 296
final double X10_TEMP76 =
          (X10_TEMP768);
        
//#line 297
final double X10_TEMP771 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 299
final double X10_TEMP77 =
          (X10_TEMP771);
        
//#line 300
final double X10_TEMP774 =
          (X10_TEMP76 +
             X10_TEMP77);
        
//#line 302
final double X10_TEMP80 =
          (X10_TEMP774);
        
//#line 303
final double X10_TEMP777 =
          (X10_TEMP80);
        
//#line 305
final double X10_TEMP81 =
          (X10_TEMP777);
        
//#line 306
final double X10_TEMP780 =
          (X10_TEMP81);
        
//#line 308
final double X10_TEMP783 =
          (X10_TEMP780);
        
//#line 309
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP783));
        
//#line 310
final double X10_TEMP785 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 312
final double X10_TEMP82 =
          (X10_TEMP785);
        
//#line 313
final double X10_TEMP788 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 315
final double X10_TEMP83 =
          (X10_TEMP788);
        
//#line 316
final double X10_TEMP791 =
          (X10_TEMP82 +
             X10_TEMP83);
        
//#line 318
final double X10_TEMP86 =
          (X10_TEMP791);
        
//#line 319
final double X10_TEMP794 =
          (X10_TEMP86);
        
//#line 321
final double X10_TEMP87 =
          (X10_TEMP794);
        
//#line 322
final double X10_TEMP797 =
          (X10_TEMP87);
        
//#line 324
final double X10_TEMP800 =
          (X10_TEMP797);
        
//#line 325
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP800));
        
//#line 326
final double X10_TEMP802 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 328
final double X10_TEMP88 =
          (X10_TEMP802);
        
//#line 329
final double X10_TEMP805 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 331
final double X10_TEMP89 =
          (X10_TEMP805);
        
//#line 332
final double X10_TEMP808 =
          (X10_TEMP88 +
             X10_TEMP89);
        
//#line 334
final double X10_TEMP92 =
          (X10_TEMP808);
        
//#line 335
final double X10_TEMP811 =
          (X10_TEMP92);
        
//#line 337
final double X10_TEMP93 =
          (X10_TEMP811);
        
//#line 338
final double X10_TEMP814 =
          (X10_TEMP93);
        
//#line 340
final double X10_TEMP817 =
          (X10_TEMP814);
        
//#line 341
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP817));
        
//#line 342
final double X10_TEMP819 =
          (0.0);
        
//#line 344
final double X10_TEMP96 =
          (X10_TEMP819);
        
//#line 345
final double X10_TEMP822 =
          (X10_TEMP96);
        
//#line 347
final double X10_TEMP97 =
          (X10_TEMP822);
        
//#line 348
final double X10_TEMP825 =
          (X10_TEMP97);
        
//#line 350
final double X10_TEMP828 =
          (X10_TEMP825);
        
//#line 351
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP828));
        
//#line 352
final double X10_TEMP830 =
          (0.0);
        
//#line 354
final double X10_TEMP100 =
          (X10_TEMP830);
        
//#line 355
final double X10_TEMP833 =
          (X10_TEMP100);
        
//#line 357
final double X10_TEMP101 =
          (X10_TEMP833);
        
//#line 358
final double X10_TEMP836 =
          (X10_TEMP101);
        
//#line 360
final double X10_TEMP839 =
          (X10_TEMP836);
        
//#line 361
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP839));
        
//#line 362
final double X10_TEMP841 =
          (0.0);
        
//#line 364
final double X10_TEMP104 =
          (X10_TEMP841);
        
//#line 365
final double X10_TEMP844 =
          (X10_TEMP104);
        
//#line 367
final double X10_TEMP105 =
          (X10_TEMP844);
        
//#line 368
final double X10_TEMP847 =
          (X10_TEMP105);
        
//#line 370
final double X10_TEMP850 =
          (X10_TEMP847);
        
//#line 371
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP850));
    }
    
    
//#line 373
public static void
                   Program_Particle_force(
                   final Particle X10_TEMP0,
                   final double side,
                   final double rcoff,
                   final int mdsize,
                   final int x,
                   final md md1) {
        
//#line 374
final double X10_TEMP576 =
          (0.0);
        
//#line 376
double sideh =
          (X10_TEMP576);
        
//#line 377
final double X10_TEMP579 =
          (0.0);
        
//#line 379
double rcoffs =
          (X10_TEMP579);
        
//#line 380
final double X10_TEMP582 =
          (0.0);
        
//#line 382
double xx =
          (X10_TEMP582);
        
//#line 383
final double X10_TEMP585 =
          (0.0);
        
//#line 385
double yy =
          (X10_TEMP585);
        
//#line 386
final double X10_TEMP588 =
          (0.0);
        
//#line 388
double zz =
          (X10_TEMP588);
        
//#line 389
final double X10_TEMP591 =
          (0.0);
        
//#line 391
double xi =
          (X10_TEMP591);
        
//#line 392
final double X10_TEMP594 =
          (0.0);
        
//#line 394
double yi =
          (X10_TEMP594);
        
//#line 395
final double X10_TEMP597 =
          (0.0);
        
//#line 397
double zi =
          (X10_TEMP597);
        
//#line 398
final double X10_TEMP600 =
          (0.0);
        
//#line 400
double fxi =
          (X10_TEMP600);
        
//#line 401
final double X10_TEMP603 =
          (0.0);
        
//#line 403
double fyi =
          (X10_TEMP603);
        
//#line 404
final double X10_TEMP606 =
          (0.0);
        
//#line 406
double fzi =
          (X10_TEMP606);
        
//#line 407
final double X10_TEMP609 =
          (0.0);
        
//#line 409
double rd =
          (X10_TEMP609);
        
//#line 410
final double X10_TEMP612 =
          (0.0);
        
//#line 412
double rrd =
          (X10_TEMP612);
        
//#line 413
final double X10_TEMP615 =
          (0.0);
        
//#line 415
double rrd2 =
          (X10_TEMP615);
        
//#line 416
final double X10_TEMP618 =
          (0.0);
        
//#line 418
double rrd3 =
          (X10_TEMP618);
        
//#line 419
final double X10_TEMP621 =
          (0.0);
        
//#line 421
double rrd4 =
          (X10_TEMP621);
        
//#line 422
final double X10_TEMP624 =
          (0.0);
        
//#line 424
double rrd6 =
          (X10_TEMP624);
        
//#line 425
final double X10_TEMP627 =
          (0.0);
        
//#line 427
double rrd7 =
          (X10_TEMP627);
        
//#line 428
final double X10_TEMP630 =
          (0.0);
        
//#line 430
double r148 =
          (X10_TEMP630);
        
//#line 431
final double X10_TEMP633 =
          (0.0);
        
//#line 433
double forcex =
          (X10_TEMP633);
        
//#line 434
final double X10_TEMP636 =
          (0.0);
        
//#line 436
double forcey =
          (X10_TEMP636);
        
//#line 437
final double X10_TEMP639 =
          (0.0);
        
//#line 439
double forcez =
          (X10_TEMP639);
        
//#line 440
final double X10_TEMP642 =
          (0.5);
        
//#line 442
final double X10_TEMP23 =
          (X10_TEMP642);
        
//#line 443
final double X10_TEMP645 =
          (X10_TEMP23 *
             side);
        
//#line 445
final double X10_TEMP25 =
          (X10_TEMP645);
        
//#line 446
final double X10_TEMP648 =
          (X10_TEMP25);
        
//#line 448
sideh =
          ((X10_TEMP648));
        
//#line 449
final double X10_TEMP651 =
          (rcoff *
             rcoff);
        
//#line 451
final double X10_TEMP27 =
          (X10_TEMP651);
        
//#line 452
final double X10_TEMP654 =
          (X10_TEMP27);
        
//#line 454
rcoffs =
          ((X10_TEMP654));
        
//#line 455
final double X10_TEMP657 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xcoord);
        
//#line 457
final double X10_TEMP29 =
          (X10_TEMP657);
        
//#line 458
final double X10_TEMP660 =
          (X10_TEMP29);
        
//#line 460
xi =
          ((X10_TEMP660));
        
//#line 461
final double X10_TEMP663 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ycoord);
        
//#line 463
final double X10_TEMP31 =
          (X10_TEMP663);
        
//#line 464
final double X10_TEMP666 =
          (X10_TEMP31);
        
//#line 466
yi =
          ((X10_TEMP666));
        
//#line 467
final double X10_TEMP669 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zcoord);
        
//#line 469
final double X10_TEMP33 =
          (X10_TEMP669);
        
//#line 470
final double X10_TEMP672 =
          (X10_TEMP33);
        
//#line 472
zi =
          ((X10_TEMP672));
        
//#line 473
final double X10_TEMP675 =
          (0.0);
        
//#line 475
final double X10_TEMP35 =
          (X10_TEMP675);
        
//#line 476
final double X10_TEMP678 =
          (X10_TEMP35);
        
//#line 478
fxi =
          ((X10_TEMP678));
        
//#line 479
final double X10_TEMP681 =
          (0.0);
        
//#line 481
final double X10_TEMP37 =
          (X10_TEMP681);
        
//#line 482
final double X10_TEMP684 =
          (X10_TEMP37);
        
//#line 484
fyi =
          ((X10_TEMP684));
        
//#line 485
final double X10_TEMP687 =
          (0.0);
        
//#line 487
final double X10_TEMP39 =
          (X10_TEMP687);
        
//#line 488
final double X10_TEMP690 =
          (X10_TEMP39);
        
//#line 490
fzi =
          ((X10_TEMP690));
        
//#line 491
final int X10_TEMP693 =
          (1);
        
//#line 493
final int X10_TEMP40 =
          (X10_TEMP693);
        
//#line 494
final int X10_TEMP696 =
          (x +
             X10_TEMP40);
        
//#line 496
final int X10_TEMP44 =
          (X10_TEMP696);
        
//#line 497
final int X10_TEMP699 =
          (1);
        
//#line 499
final int X10_TEMP42 =
          (X10_TEMP699);
        
//#line 500
final int X10_TEMP702 =
          (mdsize -
             X10_TEMP42);
        
//#line 502
final int X10_TEMP45 =
          (X10_TEMP702);
        
//#line 503
final x10.
          lang.
          region X10_TEMP707 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP44,
                  X10_TEMP45))));
        
//#line 505
final x10.
          lang.
          region X10_TEMP47 =
          (x10.
            lang.
            region)
            ((X10_TEMP707));
        
//#line 506
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP47).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 507
final x10.
              lang.
              GenericReferenceArray X10_TEMP711 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
            
//#line 509
final x10.
              lang.
              GenericReferenceArray X10_TEMP48 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP711));
            
//#line 510
final Particle X10_TEMP715 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP48).get(i))/* } */))/* } */);
            
//#line 512
final Particle X10_TEMP50 =
              (X10_TEMP715);
            
//#line 513
final double X10_TEMP718 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP50))/* } */.xcoord);
            
//#line 515
final double X10_TEMP51 =
              (X10_TEMP718);
            
//#line 516
final double X10_TEMP721 =
              (xi -
                 X10_TEMP51);
            
//#line 518
final double X10_TEMP53 =
              (X10_TEMP721);
            
//#line 519
final double X10_TEMP724 =
              (X10_TEMP53);
            
//#line 521
xx =
              ((X10_TEMP724));
            
//#line 522
final x10.
              lang.
              GenericReferenceArray X10_TEMP727 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
            
//#line 524
final x10.
              lang.
              GenericReferenceArray X10_TEMP54 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP727));
            
//#line 525
final Particle X10_TEMP731 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP54).get(i))/* } */))/* } */);
            
//#line 527
final Particle X10_TEMP56 =
              (X10_TEMP731);
            
//#line 528
final double X10_TEMP734 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP56))/* } */.ycoord);
            
//#line 530
final double X10_TEMP57 =
              (X10_TEMP734);
            
//#line 531
final double X10_TEMP737 =
              (yi -
                 X10_TEMP57);
            
//#line 533
final double X10_TEMP59 =
              (X10_TEMP737);
            
//#line 534
final double X10_TEMP740 =
              (X10_TEMP59);
            
//#line 536
yy =
              ((X10_TEMP740));
            
//#line 537
final x10.
              lang.
              GenericReferenceArray X10_TEMP743 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
            
//#line 539
final x10.
              lang.
              GenericReferenceArray X10_TEMP60 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP743));
            
//#line 540
final Particle X10_TEMP747 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP60).get(i))/* } */))/* } */);
            
//#line 542
final Particle X10_TEMP62 =
              (X10_TEMP747);
            
//#line 543
final double X10_TEMP750 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP62))/* } */.zcoord);
            
//#line 545
final double X10_TEMP63 =
              (X10_TEMP750);
            
//#line 546
final double X10_TEMP753 =
              (zi -
                 X10_TEMP63);
            
//#line 548
final double X10_TEMP65 =
              (X10_TEMP753);
            
//#line 549
final double X10_TEMP756 =
              (X10_TEMP65);
            
//#line 551
zz =
              ((X10_TEMP756));
            
//#line 552
final int X10_TEMP66 =
              (0);
            
//#line 553
final double X10_TEMP760 =
              (X10_TEMP66 -
                 sideh);
            
//#line 555
final double X10_TEMP68 =
              (X10_TEMP760);
            
//#line 556
final boolean X10_TEMP70 =
              (xx <
                 X10_TEMP68);
            
//#line 557
if (X10_TEMP70) {
                
//#line 558
final double X10_TEMP765 =
                  (xx +
                     side);
                
//#line 560
final double X10_TEMP72 =
                  (X10_TEMP765);
                
//#line 561
final double X10_TEMP768 =
                  (X10_TEMP72);
                
//#line 563
xx =
                  ((X10_TEMP768));
            }
            
//#line 565
final double X10_TEMP771 =
              (sideh);
            
//#line 567
final double X10_TEMP74 =
              (X10_TEMP771);
            
//#line 568
final boolean X10_TEMP76 =
              (xx >
                 X10_TEMP74);
            
//#line 569
if (X10_TEMP76) {
                
//#line 570
final double X10_TEMP776 =
                  (xx -
                     side);
                
//#line 572
final double X10_TEMP78 =
                  (X10_TEMP776);
                
//#line 573
final double X10_TEMP779 =
                  (X10_TEMP78);
                
//#line 575
xx =
                  ((X10_TEMP779));
            }
            
//#line 577
final int X10_TEMP79 =
              (0);
            
//#line 578
final double X10_TEMP783 =
              (X10_TEMP79 -
                 sideh);
            
//#line 580
final double X10_TEMP81 =
              (X10_TEMP783);
            
//#line 581
final boolean X10_TEMP83 =
              (yy <
                 X10_TEMP81);
            
//#line 582
if (X10_TEMP83) {
                
//#line 583
final double X10_TEMP788 =
                  (yy +
                     side);
                
//#line 585
final double X10_TEMP85 =
                  (X10_TEMP788);
                
//#line 586
final double X10_TEMP791 =
                  (X10_TEMP85);
                
//#line 588
yy =
                  ((X10_TEMP791));
            }
            
//#line 590
final double X10_TEMP794 =
              (sideh);
            
//#line 592
final double X10_TEMP87 =
              (X10_TEMP794);
            
//#line 593
final boolean X10_TEMP89 =
              (yy >
                 X10_TEMP87);
            
//#line 594
if (X10_TEMP89) {
                
//#line 595
final double X10_TEMP799 =
                  (yy -
                     side);
                
//#line 597
final double X10_TEMP91 =
                  (X10_TEMP799);
                
//#line 598
final double X10_TEMP802 =
                  (X10_TEMP91);
                
//#line 600
yy =
                  ((X10_TEMP802));
            }
            
//#line 602
final int X10_TEMP92 =
              (0);
            
//#line 603
final double X10_TEMP806 =
              (X10_TEMP92 -
                 sideh);
            
//#line 605
final double X10_TEMP94 =
              (X10_TEMP806);
            
//#line 606
final boolean X10_TEMP96 =
              (zz <
                 X10_TEMP94);
            
//#line 607
if (X10_TEMP96) {
                
//#line 608
final double X10_TEMP811 =
                  (zz +
                     side);
                
//#line 610
final double X10_TEMP98 =
                  (X10_TEMP811);
                
//#line 611
final double X10_TEMP814 =
                  (X10_TEMP98);
                
//#line 613
zz =
                  ((X10_TEMP814));
            }
            
//#line 615
final double X10_TEMP817 =
              (sideh);
            
//#line 617
final double X10_TEMP100 =
              (X10_TEMP817);
            
//#line 618
final boolean X10_TEMP102 =
              (zz >
                 X10_TEMP100);
            
//#line 619
if (X10_TEMP102) {
                
//#line 620
final double X10_TEMP822 =
                  (zz -
                     side);
                
//#line 622
final double X10_TEMP104 =
                  (X10_TEMP822);
                
//#line 623
final double X10_TEMP825 =
                  (X10_TEMP104);
                
//#line 625
zz =
                  ((X10_TEMP825));
            }
            
//#line 627
final double X10_TEMP828 =
              (xx *
                 xx);
            
//#line 629
final double X10_TEMP105 =
              (X10_TEMP828);
            
//#line 630
final double X10_TEMP831 =
              (yy *
                 yy);
            
//#line 632
final double X10_TEMP106 =
              (X10_TEMP831);
            
//#line 633
final double X10_TEMP834 =
              (X10_TEMP105 +
                 X10_TEMP106);
            
//#line 635
final double X10_TEMP107 =
              (X10_TEMP834);
            
//#line 636
final double X10_TEMP837 =
              (zz *
                 zz);
            
//#line 638
final double X10_TEMP108 =
              (X10_TEMP837);
            
//#line 639
final double X10_TEMP840 =
              (X10_TEMP107 +
                 X10_TEMP108);
            
//#line 641
final double X10_TEMP110 =
              (X10_TEMP840);
            
//#line 642
final double X10_TEMP843 =
              (X10_TEMP110);
            
//#line 644
rd =
              ((X10_TEMP843));
            
//#line 645
final boolean X10_TEMP112 =
              (rd <=
                 rcoffs);
            
//#line 646
if (X10_TEMP112) {
                
//#line 647
final double X10_TEMP848 =
                  (1.0);
                
//#line 649
final double X10_TEMP113 =
                  (X10_TEMP848);
                
//#line 650
final double X10_TEMP851 =
                  (X10_TEMP113 /
                     rd);
                
//#line 652
final double X10_TEMP115 =
                  (X10_TEMP851);
                
//#line 653
final double X10_TEMP854 =
                  (X10_TEMP115);
                
//#line 655
rrd =
                  ((X10_TEMP854));
                
//#line 656
final double X10_TEMP857 =
                  (rrd *
                     rrd);
                
//#line 658
final double X10_TEMP117 =
                  (X10_TEMP857);
                
//#line 659
final double X10_TEMP860 =
                  (X10_TEMP117);
                
//#line 661
rrd2 =
                  ((X10_TEMP860));
                
//#line 662
final double X10_TEMP863 =
                  (rrd2 *
                     rrd);
                
//#line 664
final double X10_TEMP119 =
                  (X10_TEMP863);
                
//#line 665
final double X10_TEMP866 =
                  (X10_TEMP119);
                
//#line 667
rrd3 =
                  ((X10_TEMP866));
                
//#line 668
final double X10_TEMP869 =
                  (rrd2 *
                     rrd2);
                
//#line 670
final double X10_TEMP121 =
                  (X10_TEMP869);
                
//#line 671
final double X10_TEMP872 =
                  (X10_TEMP121);
                
//#line 673
rrd4 =
                  ((X10_TEMP872));
                
//#line 674
final double X10_TEMP875 =
                  (rrd2 *
                     rrd4);
                
//#line 676
final double X10_TEMP123 =
                  (X10_TEMP875);
                
//#line 677
final double X10_TEMP878 =
                  (X10_TEMP123);
                
//#line 679
rrd6 =
                  ((X10_TEMP878));
                
//#line 680
final double X10_TEMP881 =
                  (rrd6 *
                     rrd);
                
//#line 682
final double X10_TEMP125 =
                  (X10_TEMP881);
                
//#line 683
final double X10_TEMP884 =
                  (X10_TEMP125);
                
//#line 685
rrd7 =
                  ((X10_TEMP884));
                
//#line 686
final double X10_TEMP887 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot);
                
//#line 688
final double X10_TEMP128 =
                  (X10_TEMP887);
                
//#line 689
final double X10_TEMP890 =
                  (rrd6 -
                     rrd3);
                
//#line 691
final double X10_TEMP127 =
                  (X10_TEMP890);
                
//#line 692
final double X10_TEMP893 =
                  (X10_TEMP128 +
                     X10_TEMP127);
                
//#line 694
final double X10_TEMP131 =
                  (X10_TEMP893);
                
//#line 695
final double X10_TEMP896 =
                  (X10_TEMP131);
                
//#line 697
final double X10_TEMP132 =
                  (X10_TEMP896);
                
//#line 698
final double X10_TEMP899 =
                  (X10_TEMP132);
                
//#line 700
final double X10_TEMP902 =
                  (X10_TEMP899);
                
//#line 701
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot =
                  ((X10_TEMP902));
                
//#line 702
final double X10_TEMP904 =
                  (0.5);
                
//#line 704
final double X10_TEMP133 =
                  (X10_TEMP904);
                
//#line 705
final double X10_TEMP907 =
                  (X10_TEMP133 *
                     rrd4);
                
//#line 707
final double X10_TEMP134 =
                  (X10_TEMP907);
                
//#line 708
final double X10_TEMP910 =
                  (rrd7 -
                     X10_TEMP134);
                
//#line 710
final double X10_TEMP136 =
                  (X10_TEMP910);
                
//#line 711
final double X10_TEMP913 =
                  (X10_TEMP136);
                
//#line 713
r148 =
                  ((X10_TEMP913));
                
//#line 714
final double X10_TEMP916 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir);
                
//#line 716
final double X10_TEMP137 =
                  (X10_TEMP916);
                
//#line 717
final double X10_TEMP919 =
                  (rd *
                     r148);
                
//#line 719
final double X10_TEMP138 =
                  (X10_TEMP919);
                
//#line 720
final double X10_TEMP922 =
                  (X10_TEMP137 -
                     X10_TEMP138);
                
//#line 722
final double X10_TEMP141 =
                  (X10_TEMP922);
                
//#line 723
final double X10_TEMP925 =
                  (X10_TEMP141);
                
//#line 725
final double X10_TEMP142 =
                  (X10_TEMP925);
                
//#line 726
final double X10_TEMP928 =
                  (X10_TEMP142);
                
//#line 728
final double X10_TEMP931 =
                  (X10_TEMP928);
                
//#line 729
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir =
                  ((X10_TEMP931));
                
//#line 730
final double X10_TEMP933 =
                  (xx *
                     r148);
                
//#line 732
final double X10_TEMP144 =
                  (X10_TEMP933);
                
//#line 733
final double X10_TEMP936 =
                  (X10_TEMP144);
                
//#line 735
forcex =
                  ((X10_TEMP936));
                
//#line 736
final double X10_TEMP939 =
                  (fxi +
                     forcex);
                
//#line 738
final double X10_TEMP146 =
                  (X10_TEMP939);
                
//#line 739
final double X10_TEMP942 =
                  (X10_TEMP146);
                
//#line 741
fxi =
                  ((X10_TEMP942));
                
//#line 742
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP945 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 744
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP147 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP945));
                
//#line 745
final Particle X10_TEMP949 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP147).get(i))/* } */))/* } */);
                
//#line 747
final Particle X10_TEMP149 =
                  (X10_TEMP949);
                
//#line 748
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP952 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 750
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP150 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP952));
                
//#line 751
final Particle X10_TEMP956 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP150).get(i))/* } */))/* } */);
                
//#line 753
final Particle X10_TEMP152 =
                  (X10_TEMP956);
                
//#line 754
final double X10_TEMP959 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP152))/* } */.xforce);
                
//#line 756
final double X10_TEMP153 =
                  (X10_TEMP959);
                
//#line 757
final double X10_TEMP962 =
                  (X10_TEMP153 -
                     forcex);
                
//#line 759
final double X10_TEMP156 =
                  (X10_TEMP962);
                
//#line 760
final double X10_TEMP965 =
                  (X10_TEMP156);
                
//#line 762
final double X10_TEMP157 =
                  (X10_TEMP965);
                
//#line 763
final double X10_TEMP968 =
                  (X10_TEMP157);
                
//#line 765
final double X10_TEMP971 =
                  (X10_TEMP968);
                
//#line 766
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP149))/* } */.xforce =
                  ((X10_TEMP971));
                
//#line 767
final double X10_TEMP973 =
                  (yy *
                     r148);
                
//#line 769
final double X10_TEMP159 =
                  (X10_TEMP973);
                
//#line 770
final double X10_TEMP976 =
                  (X10_TEMP159);
                
//#line 772
forcey =
                  ((X10_TEMP976));
                
//#line 773
final double X10_TEMP979 =
                  (fyi +
                     forcey);
                
//#line 775
final double X10_TEMP161 =
                  (X10_TEMP979);
                
//#line 776
final double X10_TEMP982 =
                  (X10_TEMP161);
                
//#line 778
fyi =
                  ((X10_TEMP982));
                
//#line 779
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP985 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 781
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP162 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP985));
                
//#line 782
final Particle X10_TEMP989 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP162).get(i))/* } */))/* } */);
                
//#line 784
final Particle X10_TEMP164 =
                  (X10_TEMP989);
                
//#line 785
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP992 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 787
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP165 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP992));
                
//#line 788
final Particle X10_TEMP996 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP165).get(i))/* } */))/* } */);
                
//#line 790
final Particle X10_TEMP167 =
                  (X10_TEMP996);
                
//#line 791
final double X10_TEMP999 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP167))/* } */.yforce);
                
//#line 793
final double X10_TEMP168 =
                  (X10_TEMP999);
                
//#line 794
final double X10_TEMP1002 =
                  (X10_TEMP168 -
                     forcey);
                
//#line 796
final double X10_TEMP171 =
                  (X10_TEMP1002);
                
//#line 797
final double X10_TEMP1005 =
                  (X10_TEMP171);
                
//#line 799
final double X10_TEMP172 =
                  (X10_TEMP1005);
                
//#line 800
final double X10_TEMP1008 =
                  (X10_TEMP172);
                
//#line 802
final double X10_TEMP1011 =
                  (X10_TEMP1008);
                
//#line 803
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP164))/* } */.yforce =
                  ((X10_TEMP1011));
                
//#line 804
final double X10_TEMP1013 =
                  (zz *
                     r148);
                
//#line 806
final double X10_TEMP174 =
                  (X10_TEMP1013);
                
//#line 807
final double X10_TEMP1016 =
                  (X10_TEMP174);
                
//#line 809
forcez =
                  ((X10_TEMP1016));
                
//#line 810
final double X10_TEMP1019 =
                  (fzi +
                     forcez);
                
//#line 812
final double X10_TEMP176 =
                  (X10_TEMP1019);
                
//#line 813
final double X10_TEMP1022 =
                  (X10_TEMP176);
                
//#line 815
fzi =
                  ((X10_TEMP1022));
                
//#line 816
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1025 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 818
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP177 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1025));
                
//#line 819
final Particle X10_TEMP1029 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP177).get(i))/* } */))/* } */);
                
//#line 821
final Particle X10_TEMP179 =
                  (X10_TEMP1029);
                
//#line 822
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP1032 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one));
                
//#line 824
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP180 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP1032));
                
//#line 825
final Particle X10_TEMP1036 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP180).get(i))/* } */))/* } */);
                
//#line 827
final Particle X10_TEMP182 =
                  (X10_TEMP1036);
                
//#line 828
final double X10_TEMP1039 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP182))/* } */.zforce);
                
//#line 830
final double X10_TEMP183 =
                  (X10_TEMP1039);
                
//#line 831
final double X10_TEMP1042 =
                  (X10_TEMP183 -
                     forcez);
                
//#line 833
final double X10_TEMP186 =
                  (X10_TEMP1042);
                
//#line 834
final double X10_TEMP1045 =
                  (X10_TEMP186);
                
//#line 836
final double X10_TEMP187 =
                  (X10_TEMP1045);
                
//#line 837
final double X10_TEMP1048 =
                  (X10_TEMP187);
                
//#line 839
final double X10_TEMP1051 =
                  (X10_TEMP1048);
                
//#line 840
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP179))/* } */.zforce =
                  ((X10_TEMP1051));
                
//#line 841
final int X10_TEMP1053 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.interactions);
                
//#line 843
final int X10_TEMP188 =
                  (X10_TEMP1053);
                
//#line 844
final int X10_TEMP189 =
                  (1);
                
//#line 845
final int X10_TEMP1057 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.interactions);
                
//#line 847
final int X10_TEMP190 =
                  (X10_TEMP1057);
                
//#line 848
final int X10_TEMP1060 =
                  (X10_TEMP190 +
                     X10_TEMP189);
                
//#line 850
final int X10_TEMP191 =
                  (X10_TEMP1060);
                
//#line 851
final int X10_TEMP1063 =
                  (X10_TEMP191);
                
//#line 853
final int X10_TEMP1066 =
                  (X10_TEMP1063);
                
//#line 854
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.interactions =
                  ((X10_TEMP1066));
            }
        }/* } */
        }
        /* } */
        
        
//#line 857
final double X10_TEMP1068 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 859
final double X10_TEMP192 =
          (X10_TEMP1068);
        
//#line 860
final double X10_TEMP1071 =
          (X10_TEMP192 +
             fxi);
        
//#line 862
final double X10_TEMP195 =
          (X10_TEMP1071);
        
//#line 863
final double X10_TEMP1074 =
          (X10_TEMP195);
        
//#line 865
final double X10_TEMP196 =
          (X10_TEMP1074);
        
//#line 866
final double X10_TEMP1077 =
          (X10_TEMP196);
        
//#line 868
final double X10_TEMP1080 =
          (X10_TEMP1077);
        
//#line 869
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP1080));
        
//#line 870
final double X10_TEMP1082 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 872
final double X10_TEMP197 =
          (X10_TEMP1082);
        
//#line 873
final double X10_TEMP1085 =
          (X10_TEMP197 +
             fyi);
        
//#line 875
final double X10_TEMP200 =
          (X10_TEMP1085);
        
//#line 876
final double X10_TEMP1088 =
          (X10_TEMP200);
        
//#line 878
final double X10_TEMP201 =
          (X10_TEMP1088);
        
//#line 879
final double X10_TEMP1091 =
          (X10_TEMP201);
        
//#line 881
final double X10_TEMP1094 =
          (X10_TEMP1091);
        
//#line 882
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP1094));
        
//#line 883
final double X10_TEMP1096 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 885
final double X10_TEMP202 =
          (X10_TEMP1096);
        
//#line 886
final double X10_TEMP1099 =
          (X10_TEMP202 +
             fzi);
        
//#line 888
final double X10_TEMP205 =
          (X10_TEMP1099);
        
//#line 889
final double X10_TEMP1102 =
          (X10_TEMP205);
        
//#line 891
final double X10_TEMP206 =
          (X10_TEMP1102);
        
//#line 892
final double X10_TEMP1105 =
          (X10_TEMP206);
        
//#line 894
final double X10_TEMP1108 =
          (X10_TEMP1105);
        
//#line 895
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP1108));
    }
    
    
//#line 897
public static double
                   Program_Particle_mkekin(
                   final Particle X10_TEMP0,
                   final double hsq2) {
        
//#line 898
final double X10_TEMP576 =
          (0.0);
        
//#line 900
double sumt =
          (X10_TEMP576);
        
//#line 901
final double X10_TEMP579 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 903
final double X10_TEMP2 =
          (X10_TEMP579);
        
//#line 904
final double X10_TEMP582 =
          (X10_TEMP2 *
             hsq2);
        
//#line 906
final double X10_TEMP5 =
          (X10_TEMP582);
        
//#line 907
final double X10_TEMP585 =
          (X10_TEMP5);
        
//#line 909
final double X10_TEMP6 =
          (X10_TEMP585);
        
//#line 910
final double X10_TEMP588 =
          (X10_TEMP6);
        
//#line 912
final double X10_TEMP591 =
          (X10_TEMP588);
        
//#line 913
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce =
          ((X10_TEMP591));
        
//#line 914
final double X10_TEMP593 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 916
final double X10_TEMP7 =
          (X10_TEMP593);
        
//#line 917
final double X10_TEMP596 =
          (X10_TEMP7 *
             hsq2);
        
//#line 919
final double X10_TEMP10 =
          (X10_TEMP596);
        
//#line 920
final double X10_TEMP599 =
          (X10_TEMP10);
        
//#line 922
final double X10_TEMP11 =
          (X10_TEMP599);
        
//#line 923
final double X10_TEMP602 =
          (X10_TEMP11);
        
//#line 925
final double X10_TEMP605 =
          (X10_TEMP602);
        
//#line 926
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce =
          ((X10_TEMP605));
        
//#line 927
final double X10_TEMP607 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 929
final double X10_TEMP12 =
          (X10_TEMP607);
        
//#line 930
final double X10_TEMP610 =
          (X10_TEMP12 *
             hsq2);
        
//#line 932
final double X10_TEMP15 =
          (X10_TEMP610);
        
//#line 933
final double X10_TEMP613 =
          (X10_TEMP15);
        
//#line 935
final double X10_TEMP16 =
          (X10_TEMP613);
        
//#line 936
final double X10_TEMP616 =
          (X10_TEMP16);
        
//#line 938
final double X10_TEMP619 =
          (X10_TEMP616);
        
//#line 939
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce =
          ((X10_TEMP619));
        
//#line 940
final double X10_TEMP621 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 942
final double X10_TEMP17 =
          (X10_TEMP621);
        
//#line 943
final double X10_TEMP624 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xforce);
        
//#line 945
final double X10_TEMP18 =
          (X10_TEMP624);
        
//#line 946
final double X10_TEMP627 =
          (X10_TEMP17 +
             X10_TEMP18);
        
//#line 948
final double X10_TEMP21 =
          (X10_TEMP627);
        
//#line 949
final double X10_TEMP630 =
          (X10_TEMP21);
        
//#line 951
final double X10_TEMP22 =
          (X10_TEMP630);
        
//#line 952
final double X10_TEMP633 =
          (X10_TEMP22);
        
//#line 954
final double X10_TEMP636 =
          (X10_TEMP633);
        
//#line 955
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP636));
        
//#line 956
final double X10_TEMP638 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 958
final double X10_TEMP23 =
          (X10_TEMP638);
        
//#line 959
final double X10_TEMP641 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yforce);
        
//#line 961
final double X10_TEMP24 =
          (X10_TEMP641);
        
//#line 962
final double X10_TEMP644 =
          (X10_TEMP23 +
             X10_TEMP24);
        
//#line 964
final double X10_TEMP27 =
          (X10_TEMP644);
        
//#line 965
final double X10_TEMP647 =
          (X10_TEMP27);
        
//#line 967
final double X10_TEMP28 =
          (X10_TEMP647);
        
//#line 968
final double X10_TEMP650 =
          (X10_TEMP28);
        
//#line 970
final double X10_TEMP653 =
          (X10_TEMP650);
        
//#line 971
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP653));
        
//#line 972
final double X10_TEMP655 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 974
final double X10_TEMP29 =
          (X10_TEMP655);
        
//#line 975
final double X10_TEMP658 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zforce);
        
//#line 977
final double X10_TEMP30 =
          (X10_TEMP658);
        
//#line 978
final double X10_TEMP661 =
          (X10_TEMP29 +
             X10_TEMP30);
        
//#line 980
final double X10_TEMP33 =
          (X10_TEMP661);
        
//#line 981
final double X10_TEMP664 =
          (X10_TEMP33);
        
//#line 983
final double X10_TEMP34 =
          (X10_TEMP664);
        
//#line 984
final double X10_TEMP667 =
          (X10_TEMP34);
        
//#line 986
final double X10_TEMP670 =
          (X10_TEMP667);
        
//#line 987
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP670));
        
//#line 988
final double X10_TEMP672 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 990
final double X10_TEMP35 =
          (X10_TEMP672);
        
//#line 991
final double X10_TEMP675 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 993
final double X10_TEMP36 =
          (X10_TEMP675);
        
//#line 994
final double X10_TEMP678 =
          (X10_TEMP35 *
             X10_TEMP36);
        
//#line 996
final double X10_TEMP38 =
          (X10_TEMP678);
        
//#line 997
final double X10_TEMP681 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 999
final double X10_TEMP39 =
          (X10_TEMP681);
        
//#line 1000
final double X10_TEMP684 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 1002
final double X10_TEMP40 =
          (X10_TEMP684);
        
//#line 1003
final double X10_TEMP687 =
          (X10_TEMP39 *
             X10_TEMP40);
        
//#line 1005
final double X10_TEMP42 =
          (X10_TEMP687);
        
//#line 1006
final double X10_TEMP690 =
          (X10_TEMP38 +
             X10_TEMP42);
        
//#line 1008
final double X10_TEMP47 =
          (X10_TEMP690);
        
//#line 1009
final double X10_TEMP693 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 1011
final double X10_TEMP43 =
          (X10_TEMP693);
        
//#line 1012
final double X10_TEMP696 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 1014
final double X10_TEMP44 =
          (X10_TEMP696);
        
//#line 1015
final double X10_TEMP699 =
          (X10_TEMP43 *
             X10_TEMP44);
        
//#line 1017
final double X10_TEMP46 =
          (X10_TEMP699);
        
//#line 1018
final double X10_TEMP702 =
          (X10_TEMP47 +
             X10_TEMP46);
        
//#line 1020
final double X10_TEMP49 =
          (X10_TEMP702);
        
//#line 1021
final double X10_TEMP705 =
          (X10_TEMP49);
        
//#line 1023
sumt =
          ((X10_TEMP705));
        
//#line 1024
return sumt;
    }
    
    
//#line 1026
public static double
                    Program_Particle_velavg(
                    final Particle X10_TEMP0,
                    final double vaverh,
                    final double h,
                    final md md1) {
        
//#line 1027
final double X10_TEMP576 =
          (0.0);
        
//#line 1029
double velt =
          (X10_TEMP576);
        
//#line 1030
final double X10_TEMP579 =
          (0.0);
        
//#line 1032
double sq =
          (X10_TEMP579);
        
//#line 1033
final double X10_TEMP582 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 1035
final double X10_TEMP3 =
          (X10_TEMP582);
        
//#line 1036
final double X10_TEMP585 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 1038
final double X10_TEMP4 =
          (X10_TEMP585);
        
//#line 1039
final double X10_TEMP588 =
          (X10_TEMP3 *
             X10_TEMP4);
        
//#line 1041
final double X10_TEMP7 =
          (X10_TEMP588);
        
//#line 1042
final double X10_TEMP591 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 1044
final double X10_TEMP5 =
          (X10_TEMP591);
        
//#line 1045
final double X10_TEMP594 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 1047
final double X10_TEMP6 =
          (X10_TEMP594);
        
//#line 1048
final double X10_TEMP597 =
          (X10_TEMP5 *
             X10_TEMP6);
        
//#line 1050
final double X10_TEMP8 =
          (X10_TEMP597);
        
//#line 1051
final double X10_TEMP600 =
          (X10_TEMP7 +
             X10_TEMP8);
        
//#line 1053
final double X10_TEMP11 =
          (X10_TEMP600);
        
//#line 1054
final double X10_TEMP603 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 1056
final double X10_TEMP9 =
          (X10_TEMP603);
        
//#line 1057
final double X10_TEMP606 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 1059
final double X10_TEMP10 =
          (X10_TEMP606);
        
//#line 1060
final double X10_TEMP609 =
          (X10_TEMP9 *
             X10_TEMP10);
        
//#line 1062
final double X10_TEMP12 =
          (X10_TEMP609);
        
//#line 1063
final double X10_TEMP612 =
          (X10_TEMP11 +
             X10_TEMP12);
        
//#line 1065
final double X10_TEMP14 =
          (X10_TEMP612);
        
//#line 1066
final double X10_TEMP616 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP14));
        
//#line 1068
final double X10_TEMP16 =
          (X10_TEMP616);
        
//#line 1069
final double X10_TEMP619 =
          (X10_TEMP16);
        
//#line 1071
sq =
          ((X10_TEMP619));
        
//#line 1072
final boolean X10_TEMP18 =
          (sq >
             vaverh);
        
//#line 1073
if (X10_TEMP18) {
            
//#line 1074
final double X10_TEMP624 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count);
            
//#line 1076
final double X10_TEMP19 =
              (X10_TEMP624);
            
//#line 1077
final double X10_TEMP627 =
              (1.0);
            
//#line 1079
final double X10_TEMP20 =
              (X10_TEMP627);
            
//#line 1080
final double X10_TEMP630 =
              (X10_TEMP19 +
                 X10_TEMP20);
            
//#line 1082
final double X10_TEMP23 =
              (X10_TEMP630);
            
//#line 1083
final double X10_TEMP633 =
              (X10_TEMP23);
            
//#line 1085
final double X10_TEMP24 =
              (X10_TEMP633);
            
//#line 1086
final double X10_TEMP636 =
              (X10_TEMP24);
            
//#line 1088
final double X10_TEMP639 =
              (X10_TEMP636);
            
//#line 1089
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count =
              ((X10_TEMP639));
        }
        
//#line 1091
final double X10_TEMP641 =
          (sq);
        
//#line 1093
velt =
          ((X10_TEMP641));
        
//#line 1094
return velt;
    }
    
    
//#line 1096
public static void
                    Program_Particle_dscal(
                    final Particle X10_TEMP0,
                    final double sc,
                    final int incx) {
        
//#line 1097
final double X10_TEMP576 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity);
        
//#line 1099
final double X10_TEMP1 =
          (X10_TEMP576);
        
//#line 1100
final double X10_TEMP579 =
          (X10_TEMP1 *
             sc);
        
//#line 1102
final double X10_TEMP4 =
          (X10_TEMP579);
        
//#line 1103
final double X10_TEMP582 =
          (X10_TEMP4);
        
//#line 1105
final double X10_TEMP5 =
          (X10_TEMP582);
        
//#line 1106
final double X10_TEMP585 =
          (X10_TEMP5);
        
//#line 1108
final double X10_TEMP588 =
          (X10_TEMP585);
        
//#line 1109
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.xvelocity =
          ((X10_TEMP588));
        
//#line 1110
final double X10_TEMP590 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity);
        
//#line 1112
final double X10_TEMP6 =
          (X10_TEMP590);
        
//#line 1113
final double X10_TEMP593 =
          (X10_TEMP6 *
             sc);
        
//#line 1115
final double X10_TEMP9 =
          (X10_TEMP593);
        
//#line 1116
final double X10_TEMP596 =
          (X10_TEMP9);
        
//#line 1118
final double X10_TEMP10 =
          (X10_TEMP596);
        
//#line 1119
final double X10_TEMP599 =
          (X10_TEMP10);
        
//#line 1121
final double X10_TEMP602 =
          (X10_TEMP599);
        
//#line 1122
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.yvelocity =
          ((X10_TEMP602));
        
//#line 1123
final double X10_TEMP604 =
          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity);
        
//#line 1125
final double X10_TEMP11 =
          (X10_TEMP604);
        
//#line 1126
final double X10_TEMP607 =
          (X10_TEMP11 *
             sc);
        
//#line 1128
final double X10_TEMP14 =
          (X10_TEMP607);
        
//#line 1129
final double X10_TEMP610 =
          (X10_TEMP14);
        
//#line 1131
final double X10_TEMP15 =
          (X10_TEMP610);
        
//#line 1132
final double X10_TEMP613 =
          (X10_TEMP15);
        
//#line 1134
final double X10_TEMP616 =
          (X10_TEMP613);
        
//#line 1135
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.zvelocity =
          ((X10_TEMP616));
    }
    
    
//#line 1137
public static double
                    Program_Random_update(
                    final Random X10_TEMP0) {
        
//#line 1138
final double X10_TEMP576 =
          (0.0);
        
//#line 1140
double rand =
          (X10_TEMP576);
        
//#line 1141
final double X10_TEMP579 =
          (4.656612875E-10);
        
//#line 1143
double scale =
          (X10_TEMP579);
        
//#line 1144
final int X10_TEMP582 =
          (0);
        
//#line 1146
int is1 =
          (X10_TEMP582);
        
//#line 1147
final int X10_TEMP585 =
          (0);
        
//#line 1149
int is2 =
          (X10_TEMP585);
        
//#line 1150
final int X10_TEMP588 =
          (0);
        
//#line 1152
int iss2 =
          (X10_TEMP588);
        
//#line 1153
final int X10_TEMP591 =
          (16807);
        
//#line 1155
int imult =
          (X10_TEMP591);
        
//#line 1156
final int X10_TEMP594 =
          (2147483647);
        
//#line 1158
int imod =
          (X10_TEMP594);
        
//#line 1159
final int X10_TEMP597 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 1161
final int X10_TEMP8 =
          (X10_TEMP597);
        
//#line 1162
final int X10_TEMP600 =
          (0);
        
//#line 1164
final int X10_TEMP9 =
          (X10_TEMP600);
        
//#line 1165
final boolean X10_TEMP11 =
          (X10_TEMP8 <=
             X10_TEMP9);
        
//#line 1166
if (X10_TEMP11) {
            
//#line 1167
final int X10_TEMP605 =
              (1);
            
//#line 1169
final int X10_TEMP14 =
              (X10_TEMP605);
            
//#line 1170
final int X10_TEMP608 =
              (X10_TEMP14);
            
//#line 1172
final int X10_TEMP15 =
              (X10_TEMP608);
            
//#line 1173
final int X10_TEMP611 =
              (X10_TEMP15);
            
//#line 1175
final int X10_TEMP614 =
              (X10_TEMP611);
            
//#line 1176
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed =
              ((X10_TEMP614));
        }
        
//#line 1178
final int X10_TEMP616 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 1180
final int X10_TEMP16 =
          (X10_TEMP616);
        
//#line 1181
final int X10_TEMP619 =
          (32768);
        
//#line 1183
final int X10_TEMP17 =
          (X10_TEMP619);
        
//#line 1184
final int X10_TEMP622 =
          (X10_TEMP16 %
             X10_TEMP17);
        
//#line 1186
final int X10_TEMP19 =
          (X10_TEMP622);
        
//#line 1187
final int X10_TEMP625 =
          (X10_TEMP19);
        
//#line 1189
is2 =
          ((X10_TEMP625));
        
//#line 1190
final int X10_TEMP628 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 1192
final int X10_TEMP20 =
          (X10_TEMP628);
        
//#line 1193
final int X10_TEMP631 =
          (X10_TEMP20 -
             is2);
        
//#line 1195
final int X10_TEMP22 =
          (X10_TEMP631);
        
//#line 1196
final int X10_TEMP634 =
          (32768);
        
//#line 1198
final int X10_TEMP23 =
          (X10_TEMP634);
        
//#line 1199
final int X10_TEMP637 =
          (X10_TEMP22 /
             X10_TEMP23);
        
//#line 1201
final int X10_TEMP25 =
          (X10_TEMP637);
        
//#line 1202
final int X10_TEMP640 =
          (X10_TEMP25);
        
//#line 1204
is1 =
          ((X10_TEMP640));
        
//#line 1205
final int X10_TEMP643 =
          (is2 *
             imult);
        
//#line 1207
final int X10_TEMP27 =
          (X10_TEMP643);
        
//#line 1208
final int X10_TEMP646 =
          (X10_TEMP27);
        
//#line 1210
iss2 =
          ((X10_TEMP646));
        
//#line 1211
final int X10_TEMP649 =
          (32768);
        
//#line 1213
final int X10_TEMP28 =
          (X10_TEMP649);
        
//#line 1214
final int X10_TEMP652 =
          (iss2 %
             X10_TEMP28);
        
//#line 1216
final int X10_TEMP30 =
          (X10_TEMP652);
        
//#line 1217
final int X10_TEMP655 =
          (X10_TEMP30);
        
//#line 1219
is2 =
          ((X10_TEMP655));
        
//#line 1220
final int X10_TEMP658 =
          (is1 *
             imult);
        
//#line 1222
final int X10_TEMP34 =
          (X10_TEMP658);
        
//#line 1223
final int X10_TEMP661 =
          (iss2 -
             is2);
        
//#line 1225
final int X10_TEMP32 =
          (X10_TEMP661);
        
//#line 1226
final int X10_TEMP664 =
          (32768);
        
//#line 1228
final int X10_TEMP33 =
          (X10_TEMP664);
        
//#line 1229
final int X10_TEMP667 =
          (X10_TEMP32 /
             X10_TEMP33);
        
//#line 1231
final int X10_TEMP35 =
          (X10_TEMP667);
        
//#line 1232
final int X10_TEMP670 =
          (X10_TEMP34 +
             X10_TEMP35);
        
//#line 1234
final int X10_TEMP37 =
          (X10_TEMP670);
        
//#line 1235
final int X10_TEMP673 =
          (65536);
        
//#line 1237
final int X10_TEMP39 =
          (X10_TEMP673);
        
//#line 1238
final int X10_TEMP676 =
          (X10_TEMP37 %
             X10_TEMP39);
        
//#line 1240
final int X10_TEMP41 =
          (X10_TEMP676);
        
//#line 1241
final int X10_TEMP679 =
          (X10_TEMP41);
        
//#line 1243
is1 =
          ((X10_TEMP679));
        
//#line 1244
final int X10_TEMP682 =
          (32768);
        
//#line 1246
final int X10_TEMP42 =
          (X10_TEMP682);
        
//#line 1247
final int X10_TEMP685 =
          (is1 *
             X10_TEMP42);
        
//#line 1249
final int X10_TEMP43 =
          (X10_TEMP685);
        
//#line 1250
final int X10_TEMP688 =
          (X10_TEMP43 +
             is2);
        
//#line 1252
final int X10_TEMP45 =
          (X10_TEMP688);
        
//#line 1253
final int X10_TEMP691 =
          (X10_TEMP45 %
             imod);
        
//#line 1255
final int X10_TEMP48 =
          (X10_TEMP691);
        
//#line 1256
final int X10_TEMP694 =
          (X10_TEMP48);
        
//#line 1258
final int X10_TEMP49 =
          (X10_TEMP694);
        
//#line 1259
final int X10_TEMP697 =
          (X10_TEMP49);
        
//#line 1261
final int X10_TEMP700 =
          (X10_TEMP697);
        
//#line 1262
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed =
          ((X10_TEMP700));
        
//#line 1263
final int X10_TEMP702 =
          (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.iseed);
        
//#line 1265
final int X10_TEMP50 =
          (X10_TEMP702);
        
//#line 1266
final double X10_TEMP705 =
          (scale *
             X10_TEMP50);
        
//#line 1268
final double X10_TEMP52 =
          (X10_TEMP705);
        
//#line 1269
final double X10_TEMP708 =
          (X10_TEMP52);
        
//#line 1271
rand =
          ((X10_TEMP708));
        
//#line 1272
return rand;
    }
    
    
//#line 1274
public static double
                    Program_Random_seed(
                    final Random X10_TEMP0) {
        
//#line 1275
final double X10_TEMP576 =
          (0.0);
        
//#line 1277
double s =
          (X10_TEMP576);
        
//#line 1278
final double X10_TEMP579 =
          (0.0);
        
//#line 1280
double u1 =
          (X10_TEMP579);
        
//#line 1281
final double X10_TEMP582 =
          (0.0);
        
//#line 1283
double u2 =
          (X10_TEMP582);
        
//#line 1284
final double X10_TEMP585 =
          (0.0);
        
//#line 1286
double r =
          (X10_TEMP585);
        
//#line 1287
final double X10_TEMP588 =
          (1.0);
        
//#line 1289
final double X10_TEMP6 =
          (X10_TEMP588);
        
//#line 1290
final double X10_TEMP591 =
          (X10_TEMP6);
        
//#line 1292
s =
          ((X10_TEMP591));
        
//#line 1293
boolean X10_TEMP7 =
          (false);
        
//#line 1294
boolean X10_TEMP594 =
          false;
        
//#line 1295
do  {
            
//#line 1296
final double X10_TEMP597 =
              (Program0.
                 Program_Random_update(
                 X10_TEMP0));
            
//#line 1298
final double X10_TEMP9 =
              (X10_TEMP597);
            
//#line 1299
final double X10_TEMP600 =
              (X10_TEMP9);
            
//#line 1301
u1 =
              ((X10_TEMP600));
            
//#line 1302
final double X10_TEMP604 =
              (Program0.
                 Program_Random_update(
                 X10_TEMP0));
            
//#line 1304
final double X10_TEMP11 =
              (X10_TEMP604);
            
//#line 1305
final double X10_TEMP607 =
              (X10_TEMP11);
            
//#line 1307
u2 =
              ((X10_TEMP607));
            
//#line 1308
final double X10_TEMP610 =
              (2.0);
            
//#line 1310
final double X10_TEMP12 =
              (X10_TEMP610);
            
//#line 1311
final double X10_TEMP613 =
              (X10_TEMP12 *
                 u1);
            
//#line 1313
final double X10_TEMP13 =
              (X10_TEMP613);
            
//#line 1314
final double X10_TEMP616 =
              (1.0);
            
//#line 1316
final double X10_TEMP14 =
              (X10_TEMP616);
            
//#line 1317
final double X10_TEMP619 =
              (X10_TEMP13 -
                 X10_TEMP14);
            
//#line 1319
final double X10_TEMP17 =
              (X10_TEMP619);
            
//#line 1320
final double X10_TEMP622 =
              (X10_TEMP17);
            
//#line 1322
final double X10_TEMP18 =
              (X10_TEMP622);
            
//#line 1323
final double X10_TEMP625 =
              (X10_TEMP18);
            
//#line 1325
final double X10_TEMP628 =
              (X10_TEMP625);
            
//#line 1326
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1 =
              ((X10_TEMP628));
            
//#line 1327
final double X10_TEMP630 =
              (2.0);
            
//#line 1329
final double X10_TEMP19 =
              (X10_TEMP630);
            
//#line 1330
final double X10_TEMP633 =
              (X10_TEMP19 *
                 u2);
            
//#line 1332
final double X10_TEMP20 =
              (X10_TEMP633);
            
//#line 1333
final double X10_TEMP636 =
              (1.0);
            
//#line 1335
final double X10_TEMP21 =
              (X10_TEMP636);
            
//#line 1336
final double X10_TEMP639 =
              (X10_TEMP20 -
                 X10_TEMP21);
            
//#line 1338
final double X10_TEMP24 =
              (X10_TEMP639);
            
//#line 1339
final double X10_TEMP642 =
              (X10_TEMP24);
            
//#line 1341
final double X10_TEMP25 =
              (X10_TEMP642);
            
//#line 1342
final double X10_TEMP645 =
              (X10_TEMP25);
            
//#line 1344
final double X10_TEMP648 =
              (X10_TEMP645);
            
//#line 1345
/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2 =
              ((X10_TEMP648));
            
//#line 1346
final double X10_TEMP650 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1);
            
//#line 1348
final double X10_TEMP26 =
              (X10_TEMP650);
            
//#line 1349
final double X10_TEMP653 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v1);
            
//#line 1351
final double X10_TEMP27 =
              (X10_TEMP653);
            
//#line 1352
final double X10_TEMP656 =
              (X10_TEMP26 *
                 X10_TEMP27);
            
//#line 1354
final double X10_TEMP30 =
              (X10_TEMP656);
            
//#line 1355
final double X10_TEMP659 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2);
            
//#line 1357
final double X10_TEMP28 =
              (X10_TEMP659);
            
//#line 1358
final double X10_TEMP662 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.v2);
            
//#line 1360
final double X10_TEMP29 =
              (X10_TEMP662);
            
//#line 1361
final double X10_TEMP665 =
              (X10_TEMP28 *
                 X10_TEMP29);
            
//#line 1363
final double X10_TEMP31 =
              (X10_TEMP665);
            
//#line 1364
final double X10_TEMP668 =
              (X10_TEMP30 +
                 X10_TEMP31);
            
//#line 1366
final double X10_TEMP33 =
              (X10_TEMP668);
            
//#line 1367
final double X10_TEMP671 =
              (X10_TEMP33);
            
//#line 1369
s =
              ((X10_TEMP671));
            
//#line 1370
final double X10_TEMP674 =
              (1.0);
            
//#line 1372
final double X10_TEMP34 =
              (X10_TEMP674);
            
//#line 1373
final boolean X10_TEMP677 =
              (s >=
                 X10_TEMP34);
            
//#line 1374
X10_TEMP7 =
              ((X10_TEMP677));
            
//#line 1375
X10_TEMP594 =
              X10_TEMP7;
        }while(X10_TEMP594); 
        
//#line 1377
final double X10_TEMP680 =
          (2.0);
        
//#line 1379
final double X10_TEMP36 =
          (X10_TEMP680);
        
//#line 1380
final int X10_TEMP37 =
          (0);
        
//#line 1381
final double X10_TEMP684 =
          (X10_TEMP37 -
             X10_TEMP36);
        
//#line 1383
final double X10_TEMP39 =
          (X10_TEMP684);
        
//#line 1384
final double X10_TEMP688 =
          (java.
             lang.
             Math.
             log(
             s));
        
//#line 1386
final double X10_TEMP40 =
          (X10_TEMP688);
        
//#line 1387
final double X10_TEMP691 =
          (X10_TEMP39 *
             X10_TEMP40);
        
//#line 1389
final double X10_TEMP41 =
          (X10_TEMP691);
        
//#line 1390
final double X10_TEMP694 =
          (X10_TEMP41 /
             s);
        
//#line 1392
final double X10_TEMP43 =
          (X10_TEMP694);
        
//#line 1393
final double X10_TEMP698 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP43));
        
//#line 1395
final double X10_TEMP45 =
          (X10_TEMP698);
        
//#line 1396
final double X10_TEMP701 =
          (X10_TEMP45);
        
//#line 1398
r =
          ((X10_TEMP701));
        
//#line 1399
return r;
    }
    
    
//#line 1401
public static int
                    Program__md_ITERS_init(
                    ) {
        
//#line 1402
final int X10_TEMP576 =
          (100);
        
//#line 1404
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1405
return X10_TEMP2;
    }
    
    
//#line 1407
public static double
                    Program__md_LENGTH_init(
                    ) {
        
//#line 1408
final double X10_TEMP576 =
          (5.0E-9);
        
//#line 1410
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1411
return X10_TEMP2;
    }
    
    
//#line 1413
public static double
                    Program__md_m_init(
                    ) {
        
//#line 1414
final double X10_TEMP576 =
          (4.0026);
        
//#line 1416
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1417
return X10_TEMP2;
    }
    
    
//#line 1419
public static double
                    Program__md_mu_init(
                    ) {
        
//#line 1420
final double X10_TEMP576 =
          (1.66056E-27);
        
//#line 1422
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1423
return X10_TEMP2;
    }
    
    
//#line 1425
public static double
                    Program__md_kb_init(
                    ) {
        
//#line 1426
final double X10_TEMP576 =
          (1.38066E-23);
        
//#line 1428
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1429
return X10_TEMP2;
    }
    
    
//#line 1431
public static double
                    Program__md_TSIM_init(
                    ) {
        
//#line 1432
final int X10_TEMP576 =
          (50);
        
//#line 1434
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1435
return X10_TEMP2;
    }
    
    
//#line 1437
public static double
                    Program__md_deltat_init(
                    ) {
        
//#line 1438
final double X10_TEMP576 =
          (5.0E-16);
        
//#line 1440
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1441
return X10_TEMP2;
    }
    
    
//#line 1443
public static double
                    Program__md_den_init(
                    ) {
        
//#line 1444
final double X10_TEMP576 =
          (0.83134);
        
//#line 1446
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1447
return X10_TEMP2;
    }
    
    
//#line 1449
public static double
                    Program__md_tref_init(
                    ) {
        
//#line 1450
final double X10_TEMP576 =
          (0.722);
        
//#line 1452
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1453
return X10_TEMP2;
    }
    
    
//#line 1455
public static double
                    Program__md_h_init(
                    ) {
        
//#line 1456
final double X10_TEMP576 =
          (0.064);
        
//#line 1458
final double X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1459
return X10_TEMP2;
    }
    
    
//#line 1461
public static int
                    Program__md_irep_init(
                    ) {
        
//#line 1462
final int X10_TEMP576 =
          (10);
        
//#line 1464
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1465
return X10_TEMP2;
    }
    
    
//#line 1467
public static int
                    Program__md_istop_init(
                    ) {
        
//#line 1468
final int X10_TEMP576 =
          (19);
        
//#line 1470
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1471
return X10_TEMP2;
    }
    
    
//#line 1473
public static int
                    Program__md_iprint_init(
                    ) {
        
//#line 1474
final int X10_TEMP576 =
          (10);
        
//#line 1476
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1477
return X10_TEMP2;
    }
    
    
//#line 1479
public static int
                    Program__md_movemx_init(
                    ) {
        
//#line 1480
final int X10_TEMP576 =
          (50);
        
//#line 1482
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 1483
return X10_TEMP2;
    }
    
    
//#line 1485
public static void
                    Program_md_exec(
                    ) {
        
//#line 1486
final x10.
          lang.
          dist X10_TEMP576 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                UNIQUE));
        
//#line 1488
final x10.
          lang.
          dist X10_TEMP1 =
          (x10.
            lang.
            dist)
            ((X10_TEMP576));
        
//#line 1489
final x10.
          lang.
          dist X10_TEMP579 =
          (x10.
            lang.
            dist)
            ((X10_TEMP1));
        
//#line 1491
final x10.
          lang.
          dist D =
          (x10.
            lang.
            dist)
            ((X10_TEMP579));
        
//#line 1492
final x10.
          lang.
          GenericReferenceArray X10_TEMP586 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(D,/* template:array_init_closure { */new x10.array.Operator.Pointwise() {
              	public x10.compilergenerated.Parameter1 apply(/* Join: { */x10.
                lang.
                point pt/* } */, x10.compilergenerated.Parameter1 dummy) { {
                  
//#line 1493
final md X10_TEMP582 =
                    (new md(
                       ));
                  
//#line 1495
final md X10_TEMP4 =
                    (X10_TEMP582);
                  
//#line 1496
return X10_TEMP4;
              } }
              }/* } */,true,true,false)/* } */));
        
//#line 1501
final x10.
          lang.
          GenericReferenceArray P =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP586));
        
//#line 1502
Program0.
                        Program_md_init(
                        D,
                        P);
        
//#line 1503
Program0.
                        Program_md_run(
                        D,
                        P);
        
//#line 1504
Program0.
                        Program_md_validate(
                        D,
                        P);
    }
    
    
//#line 1506
public static void
                    Program_md_init(
                    final x10.
                      lang.
                      dist D,
                    final x10.
                      lang.
                      GenericReferenceArray P) {
        
//#line 1507
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1508
/* template:forloop { */
            for (java.util.Iterator j__ = (D.
                                             region).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1509
final x10.
                  lang.
                  place X10_TEMP2 =
                  (D.
                     get(
                     j));
                
//#line 1510
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP2)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1511
final md X10_TEMP581 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 1513
final md X10_TEMP5 =
                      (X10_TEMP581);
                    
//#line 1514
final x10.
                      lang.
                      region X10_TEMP584 =
                      (x10.
                        lang.
                        region)
                        ((D.
                            region));
                    
//#line 1516
final x10.
                      lang.
                      region X10_TEMP6 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP584));
                    
//#line 1517
final int X10_TEMP588 =
                      (X10_TEMP6.
                         ordinal(
                         j));
                    
//#line 1519
final int X10_TEMP10 =
                      (X10_TEMP588);
                    
//#line 1520
final int X10_TEMP591 =
                      (x10.
                         lang.
                         place.
                         MAX_PLACES);
                    
//#line 1522
final int X10_TEMP11 =
                      (X10_TEMP591);
                    
//#line 1523
Program0.
                                    Program_md_initialise(
                                    X10_TEMP5,
                                    X10_TEMP10,
                                    X10_TEMP11);
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp9) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp9);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1528
public static void
                    Program_md_run(
                    final x10.
                      lang.
                      dist D,
                    final x10.
                      lang.
                      GenericReferenceArray P) {
        
//#line 1529
final int X10_TEMP576 =
          (0);
        
//#line 1531
int n =
          (X10_TEMP576);
        
//#line 1532
final int X10_TEMP579 =
          (0);
        
//#line 1534
final int X10_TEMP5 =
          (X10_TEMP579);
        
//#line 1535
final int X10_TEMP582 =
          (1);
        
//#line 1537
final int X10_TEMP3 =
          (X10_TEMP582);
        
//#line 1538
final int X10_TEMP585 =
          (_Program__md_movemx -
             X10_TEMP3);
        
//#line 1540
final int X10_TEMP6 =
          (X10_TEMP585);
        
//#line 1541
final x10.
          lang.
          region X10_TEMP590 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP5,
                  X10_TEMP6))));
        
//#line 1543
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP590));
        
//#line 1544
/* template:forloop-mult { */{
        x10.lang.region __var10__ = (x10.lang.region) X10_TEMP8;
        if (__var10__.size() > 0 && (__var10__ instanceof x10.array.MultiDimRegion || __var10__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var11__ = __var10__.rank(0).low(), __var12__ = __var10__.rank(0).high(); __var11__ <= __var12__; __var11__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int move = __var11__;
        /* } */
        /* } */
{
            
//#line 1545
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1546
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1547
final x10.
                      lang.
                      place X10_TEMP10 =
                      (D.
                         get(
                         j));
                    
//#line 1548
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP10)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1549
final md X10_TEMP599 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1551
final md X10_TEMP12 =
                          (X10_TEMP599);
                        
//#line 1552
Program0.
                                        Program_md_runiters1(
                                        X10_TEMP12);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp13) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp13);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1556
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1557
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1558
final x10.
                      lang.
                      place X10_TEMP14 =
                      (D.
                         get(
                         j));
                    
//#line 1559
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP14)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1560
final md X10_TEMP608 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1562
final md X10_TEMP16 =
                          (X10_TEMP608);
                        
//#line 1563
Program0.
                                        Program_md_runiters2(
                                        X10_TEMP16,
                                        P);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp14) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp14);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1567
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1568
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1569
final x10.
                      lang.
                      place X10_TEMP19 =
                      (D.
                         get(
                         j));
                    
//#line 1570
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP19)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1571
final md X10_TEMP618 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1573
final md X10_TEMP21 =
                          (X10_TEMP618);
                        
//#line 1574
Program0.
                                        Program_md_runiters3(
                                        X10_TEMP21,
                                        move);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp15) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp15);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var0____ = (__var10__).iterator(); __var0____.hasNext(); ) {
        	final  x10.
          lang.
          point __var0__ = (x10.
          lang.
          point) __var0____.next();
        	/* Join: { *//* Join: { */final int move =
          /* template:array_get { */((__var0__).get(0))/* } */;/* } */
{
            
//#line 1545
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1546
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1547
final x10.
                      lang.
                      place X10_TEMP10 =
                      (D.
                         get(
                         j));
                    
//#line 1548
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP10)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1549
final md X10_TEMP599 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1551
final md X10_TEMP12 =
                          (X10_TEMP599);
                        
//#line 1552
Program0.
                                        Program_md_runiters1(
                                        X10_TEMP12);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp16) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp16);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1556
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1557
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1558
final x10.
                      lang.
                      place X10_TEMP14 =
                      (D.
                         get(
                         j));
                    
//#line 1559
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP14)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1560
final md X10_TEMP608 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1562
final md X10_TEMP16 =
                          (X10_TEMP608);
                        
//#line 1563
Program0.
                                        Program_md_runiters2(
                                        X10_TEMP16,
                                        P);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp17) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp17);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 1567
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 1568
/* template:forloop { */
                for (java.util.Iterator j__ = (D.
                                                 region).iterator(); j__.hasNext(); ) {
                	final  x10.
                  lang.
                  point j = (x10.
                  lang.
                  point) j__.next();
                	/* Join: { *//* Join: { *//* } */
{
                    
//#line 1569
final x10.
                      lang.
                      place X10_TEMP19 =
                      (D.
                         get(
                         j));
                    
//#line 1570
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP19)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 1571
final md X10_TEMP618 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1573
final md X10_TEMP21 =
                          (X10_TEMP618);
                        
//#line 1574
Program0.
                                        Program_md_runiters3(
                                        X10_TEMP21,
                                        move);
                    }
                    		}
                    	});/* } */
                }/* } */
                }
                /* } */
                
            }
            	} catch (Throwable tmp18) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp18);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
    }
    
    
//#line 1580
public static void
                    Program_md_validate(
                    final x10.
                      lang.
                      dist D,
                    final x10.
                      lang.
                      GenericReferenceArray P) {
        
//#line 1581
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 1582
/* template:forloop { */
            for (java.util.Iterator j__ = (D.
                                             region).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 1583
final x10.
                  lang.
                  place X10_TEMP2 =
                  (D.
                     get(
                     j));
                
//#line 1584
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP2)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 1585
final double X10_TEMP580 =
                      (275.97175611773514);
                    
//#line 1587
double ref =
                      (X10_TEMP580);
                    
//#line 1588
final md X10_TEMP584 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 1590
final md X10_TEMP5 =
                      (X10_TEMP584);
                    
//#line 1591
final double X10_TEMP587 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP5))/* } */.ek);
                    
//#line 1593
final double X10_TEMP6 =
                      (X10_TEMP587);
                    
//#line 1594
final double X10_TEMP590 =
                      (X10_TEMP6 -
                         ref);
                    
//#line 1596
final double X10_TEMP8 =
                      (X10_TEMP590);
                    
//#line 1597
final double X10_TEMP594 =
                      (java.
                         lang.
                         Math.
                         abs(
                         X10_TEMP8));
                    
//#line 1599
double dev =
                      (X10_TEMP594);
                    
//#line 1600
final double X10_TEMP597 =
                      (1.0E-12);
                    
//#line 1602
final double X10_TEMP10 =
                      (X10_TEMP597);
                    
//#line 1603
final boolean X10_TEMP12 =
                      (dev >
                         X10_TEMP10);
                    
//#line 1604
if (X10_TEMP12) {
                        
//#line 1605
final java.
                          lang.
                          String X10_TEMP602 =
                          ("Validation failed at place: ");
                        
//#line 1607
final java.
                          lang.
                          String X10_TEMP15 =
                          (X10_TEMP602);
                        
//#line 1608
final x10.
                          lang.
                          region X10_TEMP605 =
                          (x10.
                            lang.
                            region)
                            ((D.
                                region));
                        
//#line 1610
final x10.
                          lang.
                          region X10_TEMP13 =
                          (x10.
                            lang.
                            region)
                            ((X10_TEMP605));
                        
//#line 1611
final int X10_TEMP609 =
                          (X10_TEMP13.
                             ordinal(
                             j));
                        
//#line 1613
final int X10_TEMP16 =
                          (X10_TEMP609);
                        
//#line 1614
final java.
                          lang.
                          String X10_TEMP612 =
                          (X10_TEMP15 +
                           X10_TEMP16);
                        
//#line 1616
final java.
                          lang.
                          String X10_TEMP18 =
                          (X10_TEMP612);
                        
//#line 1617
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println(X10_TEMP18);
                        
//#line 1618
final java.
                          lang.
                          String X10_TEMP616 =
                          ("Kinetic energy = ");
                        
//#line 1620
final java.
                          lang.
                          String X10_TEMP21 =
                          (X10_TEMP616);
                        
//#line 1621
final md X10_TEMP620 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 1623
final md X10_TEMP20 =
                          (X10_TEMP620);
                        
//#line 1624
final double X10_TEMP623 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP20))/* } */.ek);
                        
//#line 1626
final double X10_TEMP22 =
                          (X10_TEMP623);
                        
//#line 1627
final java.
                          lang.
                          String X10_TEMP626 =
                          (X10_TEMP21 +
                           X10_TEMP22);
                        
//#line 1629
final java.
                          lang.
                          String X10_TEMP23 =
                          (X10_TEMP626);
                        
//#line 1630
final java.
                          lang.
                          String X10_TEMP629 =
                          (" ");
                        
//#line 1632
final java.
                          lang.
                          String X10_TEMP24 =
                          (X10_TEMP629);
                        
//#line 1633
final java.
                          lang.
                          String X10_TEMP632 =
                          (X10_TEMP23 +
                           X10_TEMP24);
                        
//#line 1635
final java.
                          lang.
                          String X10_TEMP25 =
                          (X10_TEMP632);
                        
//#line 1636
final java.
                          lang.
                          String X10_TEMP635 =
                          (X10_TEMP25 +
                           dev);
                        
//#line 1638
final java.
                          lang.
                          String X10_TEMP26 =
                          (X10_TEMP635);
                        
//#line 1639
final java.
                          lang.
                          String X10_TEMP638 =
                          (" ");
                        
//#line 1641
final java.
                          lang.
                          String X10_TEMP27 =
                          (X10_TEMP638);
                        
//#line 1642
final java.
                          lang.
                          String X10_TEMP641 =
                          (X10_TEMP26 +
                           X10_TEMP27);
                        
//#line 1644
final java.
                          lang.
                          String X10_TEMP28 =
                          (X10_TEMP641);
                        
//#line 1645
final java.
                          lang.
                          String X10_TEMP644 =
                          (X10_TEMP28 +
                           ref);
                        
//#line 1647
final java.
                          lang.
                          String X10_TEMP30 =
                          (X10_TEMP644);
                        
//#line 1648
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                                      lang.
                                                                                                                      System.
                                                                                                                      out))/* } */.println(X10_TEMP30);
                        
//#line 1649
final java.
                          lang.
                          String X10_TEMP648 =
                          ("Validation failed");
                        
//#line 1651
final java.
                          lang.
                          String X10_TEMP32 =
                          (X10_TEMP648);
                        
//#line 1652
throw new java.
                          lang.
                          RuntimeException(
                          X10_TEMP32);
                    }
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp19) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp19);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 1658
public static void
                    Program_md_initialise(
                    final md X10_TEMP0,
                    final int rank0,
                    final int nprocess0) {
        
//#line 1659
final int X10_TEMP576 =
          (rank0);
        
//#line 1661
final int X10_TEMP3 =
          (X10_TEMP576);
        
//#line 1662
final int X10_TEMP579 =
          (X10_TEMP3);
        
//#line 1664
final int X10_TEMP582 =
          (X10_TEMP579);
        
//#line 1665
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk =
          ((X10_TEMP582));
        
//#line 1666
final int X10_TEMP584 =
          (nprocess0);
        
//#line 1668
final int X10_TEMP6 =
          (X10_TEMP584);
        
//#line 1669
final int X10_TEMP587 =
          (X10_TEMP6);
        
//#line 1671
final int X10_TEMP590 =
          (X10_TEMP587);
        
//#line 1672
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nprocess =
          ((X10_TEMP590));
        
//#line 1673
final double X10_TEMP592 =
          (0.0);
        
//#line 1675
final double X10_TEMP9 =
          (X10_TEMP592);
        
//#line 1676
final double X10_TEMP595 =
          (X10_TEMP9);
        
//#line 1678
final double X10_TEMP10 =
          (X10_TEMP595);
        
//#line 1679
final double X10_TEMP598 =
          (X10_TEMP10);
        
//#line 1681
final double X10_TEMP601 =
          (X10_TEMP598);
        
//#line 1682
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir =
          ((X10_TEMP601));
        
//#line 1683
final double X10_TEMP603 =
          (0.0);
        
//#line 1685
final double X10_TEMP13 =
          (X10_TEMP603);
        
//#line 1686
final double X10_TEMP606 =
          (X10_TEMP13);
        
//#line 1688
final double X10_TEMP14 =
          (X10_TEMP606);
        
//#line 1689
final double X10_TEMP609 =
          (X10_TEMP14);
        
//#line 1691
final double X10_TEMP612 =
          (X10_TEMP609);
        
//#line 1692
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
          ((X10_TEMP612));
        
//#line 1693
final int X10_TEMP614 =
          (0);
        
//#line 1695
final int X10_TEMP17 =
          (X10_TEMP614);
        
//#line 1696
final int X10_TEMP617 =
          (X10_TEMP17);
        
//#line 1698
final int X10_TEMP18 =
          (X10_TEMP617);
        
//#line 1699
final int X10_TEMP620 =
          (X10_TEMP18);
        
//#line 1701
final int X10_TEMP623 =
          (X10_TEMP620);
        
//#line 1702
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.interactions =
          ((X10_TEMP623));
        
//#line 1703
final int X10_TEMP625 =
          (4);
        
//#line 1705
int mm =
          (X10_TEMP625);
        
//#line 1706
final int X10_TEMP628 =
          (mm *
             mm);
        
//#line 1708
final int X10_TEMP20 =
          (X10_TEMP628);
        
//#line 1709
final int X10_TEMP631 =
          (X10_TEMP20 *
             mm);
        
//#line 1711
final int X10_TEMP21 =
          (X10_TEMP631);
        
//#line 1712
final int X10_TEMP634 =
          (4);
        
//#line 1714
final int X10_TEMP22 =
          (X10_TEMP634);
        
//#line 1715
final int X10_TEMP637 =
          (X10_TEMP21 *
             X10_TEMP22);
        
//#line 1717
int partsize =
          (X10_TEMP637);
        
//#line 1718
final int X10_TEMP640 =
          (partsize);
        
//#line 1720
final int X10_TEMP26 =
          (X10_TEMP640);
        
//#line 1721
final int X10_TEMP643 =
          (X10_TEMP26);
        
//#line 1723
final int X10_TEMP646 =
          (X10_TEMP643);
        
//#line 1724
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize =
          ((X10_TEMP646));
        
//#line 1725
final int X10_TEMP648 =
          (0);
        
//#line 1727
final int X10_TEMP31 =
          (X10_TEMP648);
        
//#line 1728
final int X10_TEMP651 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1730
final int X10_TEMP28 =
          (X10_TEMP651);
        
//#line 1731
final int X10_TEMP654 =
          (1);
        
//#line 1733
final int X10_TEMP29 =
          (X10_TEMP654);
        
//#line 1734
final int X10_TEMP657 =
          (X10_TEMP28 -
             X10_TEMP29);
        
//#line 1736
final int X10_TEMP32 =
          (X10_TEMP657);
        
//#line 1737
final x10.
          lang.
          region X10_TEMP662 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP31,
                  X10_TEMP32))));
        
//#line 1739
final x10.
          lang.
          region X10_TEMP33 =
          (x10.
            lang.
            region)
            ((X10_TEMP662));
        
//#line 1740
final x10.
          lang.
          place X10_TEMP665 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 1742
final x10.
          lang.
          place X10_TEMP34 =
          (X10_TEMP665);
        
//#line 1743
final x10.
          lang.
          dist X10_TEMP668 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP33,
                X10_TEMP34)));
        
//#line 1745
x10.
          lang.
          dist dOne =
          (x10.
            lang.
            dist)
            ((X10_TEMP668));
        
//#line 1746
final x10.
          lang.
          GenericReferenceArray X10_TEMP671 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 1748
final x10.
          lang.
          GenericReferenceArray X10_TEMP38 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP671));
        
//#line 1749
final x10.
          lang.
          GenericReferenceArray X10_TEMP674 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP38));
        
//#line 1751
final x10.
          lang.
          GenericReferenceArray X10_TEMP39 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP674));
        
//#line 1752
final x10.
          lang.
          GenericReferenceArray X10_TEMP677 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP39));
        
//#line 1754
final x10.
          lang.
          GenericReferenceArray X10_TEMP680 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP677));
        
//#line 1755
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one =
          ((X10_TEMP680));
        
//#line 1756
final double X10_TEMP682 =
          (_Program__md_LENGTH);
        
//#line 1758
final double X10_TEMP42 =
          (X10_TEMP682);
        
//#line 1759
final double X10_TEMP685 =
          (X10_TEMP42);
        
//#line 1761
final double X10_TEMP688 =
          (X10_TEMP685);
        
//#line 1762
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.l =
          ((X10_TEMP688));
        
//#line 1763
final int X10_TEMP690 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1765
final double X10_TEMP43 =
          (X10_TEMP690);
        
//#line 1766
final double X10_TEMP693 =
          (X10_TEMP43 /
             _Program__md_den);
        
//#line 1768
final double X10_TEMP45 =
          (X10_TEMP693);
        
//#line 1769
final double X10_TEMP696 =
          (0.3333333);
        
//#line 1771
final double X10_TEMP48 =
          (X10_TEMP696);
        
//#line 1772
final double X10_TEMP701 =
          (java.
             lang.
             Math.
             pow(
             X10_TEMP45,
             X10_TEMP48));
        
//#line 1774
final double X10_TEMP51 =
          (X10_TEMP701);
        
//#line 1775
final double X10_TEMP704 =
          (X10_TEMP51);
        
//#line 1777
final double X10_TEMP52 =
          (X10_TEMP704);
        
//#line 1778
final double X10_TEMP707 =
          (X10_TEMP52);
        
//#line 1780
final double X10_TEMP710 =
          (X10_TEMP707);
        
//#line 1781
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side =
          ((X10_TEMP710));
        
//#line 1782
final double X10_TEMP712 =
          (4.0);
        
//#line 1784
final double X10_TEMP53 =
          (X10_TEMP712);
        
//#line 1785
final double X10_TEMP715 =
          (mm /
             X10_TEMP53);
        
//#line 1787
final double X10_TEMP56 =
          (X10_TEMP715);
        
//#line 1788
final double X10_TEMP718 =
          (X10_TEMP56);
        
//#line 1790
final double X10_TEMP57 =
          (X10_TEMP718);
        
//#line 1791
final double X10_TEMP721 =
          (X10_TEMP57);
        
//#line 1793
final double X10_TEMP724 =
          (X10_TEMP721);
        
//#line 1794
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff =
          ((X10_TEMP724));
        
//#line 1795
final double X10_TEMP726 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
        
//#line 1797
final double X10_TEMP58 =
          (X10_TEMP726);
        
//#line 1798
final double X10_TEMP729 =
          (X10_TEMP58 /
             mm);
        
//#line 1800
final double X10_TEMP61 =
          (X10_TEMP729);
        
//#line 1801
final double X10_TEMP732 =
          (X10_TEMP61);
        
//#line 1803
final double X10_TEMP62 =
          (X10_TEMP732);
        
//#line 1804
final double X10_TEMP735 =
          (X10_TEMP62);
        
//#line 1806
final double X10_TEMP738 =
          (X10_TEMP735);
        
//#line 1807
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a =
          ((X10_TEMP738));
        
//#line 1808
final double X10_TEMP740 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
        
//#line 1810
final double X10_TEMP63 =
          (X10_TEMP740);
        
//#line 1811
final double X10_TEMP743 =
          (0.5);
        
//#line 1813
final double X10_TEMP64 =
          (X10_TEMP743);
        
//#line 1814
final double X10_TEMP746 =
          (X10_TEMP63 *
             X10_TEMP64);
        
//#line 1816
final double X10_TEMP67 =
          (X10_TEMP746);
        
//#line 1817
final double X10_TEMP749 =
          (X10_TEMP67);
        
//#line 1819
final double X10_TEMP68 =
          (X10_TEMP749);
        
//#line 1820
final double X10_TEMP752 =
          (X10_TEMP68);
        
//#line 1822
final double X10_TEMP755 =
          (X10_TEMP752);
        
//#line 1823
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sideh =
          ((X10_TEMP755));
        
//#line 1824
final double X10_TEMP757 =
          (_Program__md_h *
             _Program__md_h);
        
//#line 1826
final double X10_TEMP71 =
          (X10_TEMP757);
        
//#line 1827
final double X10_TEMP760 =
          (X10_TEMP71);
        
//#line 1829
final double X10_TEMP72 =
          (X10_TEMP760);
        
//#line 1830
final double X10_TEMP763 =
          (X10_TEMP72);
        
//#line 1832
final double X10_TEMP766 =
          (X10_TEMP763);
        
//#line 1833
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq =
          ((X10_TEMP766));
        
//#line 1834
final double X10_TEMP768 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq);
        
//#line 1836
final double X10_TEMP73 =
          (X10_TEMP768);
        
//#line 1837
final double X10_TEMP771 =
          (0.5);
        
//#line 1839
final double X10_TEMP74 =
          (X10_TEMP771);
        
//#line 1840
final double X10_TEMP774 =
          (X10_TEMP73 *
             X10_TEMP74);
        
//#line 1842
final double X10_TEMP77 =
          (X10_TEMP774);
        
//#line 1843
final double X10_TEMP777 =
          (X10_TEMP77);
        
//#line 1845
final double X10_TEMP78 =
          (X10_TEMP777);
        
//#line 1846
final double X10_TEMP780 =
          (X10_TEMP78);
        
//#line 1848
final double X10_TEMP783 =
          (X10_TEMP780);
        
//#line 1849
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq2 =
          ((X10_TEMP783));
        
//#line 1850
final int X10_TEMP785 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1852
final int X10_TEMP79 =
          (X10_TEMP785);
        
//#line 1853
final int X10_TEMP788 =
          (1);
        
//#line 1855
final int X10_TEMP80 =
          (X10_TEMP788);
        
//#line 1856
final int X10_TEMP791 =
          (X10_TEMP79 -
             X10_TEMP80);
        
//#line 1858
final int X10_TEMP83 =
          (X10_TEMP791);
        
//#line 1859
final int X10_TEMP794 =
          (X10_TEMP83);
        
//#line 1861
final int X10_TEMP84 =
          (X10_TEMP794);
        
//#line 1862
final int X10_TEMP797 =
          (X10_TEMP84);
        
//#line 1864
final int X10_TEMP800 =
          (X10_TEMP797);
        
//#line 1865
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.npartm =
          ((X10_TEMP800));
        
//#line 1866
final double X10_TEMP802 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
        
//#line 1868
final double X10_TEMP85 =
          (X10_TEMP802);
        
//#line 1869
final double X10_TEMP805 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
        
//#line 1871
final double X10_TEMP86 =
          (X10_TEMP805);
        
//#line 1872
final double X10_TEMP808 =
          (X10_TEMP85 *
             X10_TEMP86);
        
//#line 1874
final double X10_TEMP89 =
          (X10_TEMP808);
        
//#line 1875
final double X10_TEMP811 =
          (X10_TEMP89);
        
//#line 1877
final double X10_TEMP90 =
          (X10_TEMP811);
        
//#line 1878
final double X10_TEMP814 =
          (X10_TEMP90);
        
//#line 1880
final double X10_TEMP817 =
          (X10_TEMP814);
        
//#line 1881
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoffs =
          ((X10_TEMP817));
        
//#line 1882
final double X10_TEMP819 =
          (16.0);
        
//#line 1884
final double X10_TEMP97 =
          (X10_TEMP819);
        
//#line 1885
final double X10_TEMP822 =
          (1.0);
        
//#line 1887
final double X10_TEMP91 =
          (X10_TEMP822);
        
//#line 1888
final int X10_TEMP825 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 1890
final int X10_TEMP92 =
          (X10_TEMP825);
        
//#line 1891
final double X10_TEMP828 =
          (X10_TEMP91 *
             X10_TEMP92);
        
//#line 1893
final double X10_TEMP93 =
          (X10_TEMP828);
        
//#line 1894
final double X10_TEMP831 =
          (1.0);
        
//#line 1896
final double X10_TEMP94 =
          (X10_TEMP831);
        
//#line 1897
final double X10_TEMP834 =
          (X10_TEMP93 -
             X10_TEMP94);
        
//#line 1899
final double X10_TEMP96 =
          (X10_TEMP834);
        
//#line 1900
final double X10_TEMP837 =
          (X10_TEMP97 /
             X10_TEMP96);
        
//#line 1902
final double X10_TEMP100 =
          (X10_TEMP837);
        
//#line 1903
final double X10_TEMP840 =
          (X10_TEMP100);
        
//#line 1905
final double X10_TEMP101 =
          (X10_TEMP840);
        
//#line 1906
final double X10_TEMP843 =
          (X10_TEMP101);
        
//#line 1908
final double X10_TEMP846 =
          (X10_TEMP843);
        
//#line 1909
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale =
          ((X10_TEMP846));
        
//#line 1910
final double X10_TEMP848 =
          (1.13);
        
//#line 1912
final double X10_TEMP105 =
          (X10_TEMP848);
        
//#line 1913
final double X10_TEMP851 =
          (24.0);
        
//#line 1915
final double X10_TEMP102 =
          (X10_TEMP851);
        
//#line 1916
final double X10_TEMP854 =
          (_Program__md_tref /
             X10_TEMP102);
        
//#line 1918
final double X10_TEMP104 =
          (X10_TEMP854);
        
//#line 1919
final double X10_TEMP858 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP104));
        
//#line 1921
final double X10_TEMP106 =
          (X10_TEMP858);
        
//#line 1922
final double X10_TEMP861 =
          (X10_TEMP105 *
             X10_TEMP106);
        
//#line 1924
final double X10_TEMP109 =
          (X10_TEMP861);
        
//#line 1925
final double X10_TEMP864 =
          (X10_TEMP109);
        
//#line 1927
final double X10_TEMP110 =
          (X10_TEMP864);
        
//#line 1928
final double X10_TEMP867 =
          (X10_TEMP110);
        
//#line 1930
final double X10_TEMP870 =
          (X10_TEMP867);
        
//#line 1931
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaver =
          ((X10_TEMP870));
        
//#line 1932
final double X10_TEMP872 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaver);
        
//#line 1934
final double X10_TEMP111 =
          (X10_TEMP872);
        
//#line 1935
final double X10_TEMP875 =
          (X10_TEMP111 *
             _Program__md_h);
        
//#line 1937
final double X10_TEMP114 =
          (X10_TEMP875);
        
//#line 1938
final double X10_TEMP878 =
          (X10_TEMP114);
        
//#line 1940
final double X10_TEMP115 =
          (X10_TEMP878);
        
//#line 1941
final double X10_TEMP881 =
          (X10_TEMP115);
        
//#line 1943
final double X10_TEMP884 =
          (X10_TEMP881);
        
//#line 1944
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaverh =
          ((X10_TEMP884));
        
//#line 1945
final int X10_TEMP886 =
          (0);
        
//#line 1947
int ijk =
          (X10_TEMP886);
        
//#line 1948
final int X10_TEMP889 =
          (0);
        
//#line 1950
final int X10_TEMP119 =
          (X10_TEMP889);
        
//#line 1951
final int X10_TEMP892 =
          (1);
        
//#line 1953
final int X10_TEMP120 =
          (X10_TEMP892);
        
//#line 1954
final x10.
          lang.
          region X10_TEMP897 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP119,
                  X10_TEMP120))));
        
//#line 1956
final x10.
          lang.
          region X10_TEMP122 =
          (x10.
            lang.
            region)
            ((X10_TEMP897));
        
//#line 1957
/* template:forloop-mult { */{
        x10.lang.region __var20__ = (x10.lang.region) X10_TEMP122;
        if (__var20__.size() > 0 && (__var20__ instanceof x10.array.MultiDimRegion || __var20__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var21__ = __var20__.rank(0).low(), __var22__ = __var20__.rank(0).high(); __var21__ <= __var22__; __var21__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int lg = __var21__;
        /* } */
        /* } */
{
            
//#line 1958
final int X10_TEMP901 =
              (0);
            
//#line 1960
final int X10_TEMP126 =
              (X10_TEMP901);
            
//#line 1961
final int X10_TEMP904 =
              (1);
            
//#line 1963
final int X10_TEMP124 =
              (X10_TEMP904);
            
//#line 1964
final int X10_TEMP907 =
              (mm -
                 X10_TEMP124);
            
//#line 1966
final int X10_TEMP127 =
              (X10_TEMP907);
            
//#line 1967
final x10.
              lang.
              region X10_TEMP912 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP126,
                      X10_TEMP127))));
            
//#line 1969
final x10.
              lang.
              region X10_TEMP129 =
              (x10.
                lang.
                region)
                ((X10_TEMP912));
            
//#line 1970
/* template:forloop-mult { */{
            x10.lang.region __var23__ = (x10.lang.region) X10_TEMP129;
            if (__var23__.size() > 0 && (__var23__ instanceof x10.array.MultiDimRegion || __var23__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var24__ = __var23__.rank(0).low(), __var25__ = __var23__.rank(0).high(); __var24__ <= __var25__; __var24__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var24__;
            /* } */
            /* } */
{
                
//#line 1971
final int X10_TEMP916 =
                  (0);
                
//#line 1973
final int X10_TEMP133 =
                  (X10_TEMP916);
                
//#line 1974
final int X10_TEMP919 =
                  (1);
                
//#line 1976
final int X10_TEMP131 =
                  (X10_TEMP919);
                
//#line 1977
final int X10_TEMP922 =
                  (mm -
                     X10_TEMP131);
                
//#line 1979
final int X10_TEMP134 =
                  (X10_TEMP922);
                
//#line 1980
final x10.
                  lang.
                  region X10_TEMP927 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP133,
                          X10_TEMP134))));
                
//#line 1982
final x10.
                  lang.
                  region X10_TEMP136 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP927));
                
//#line 1983
/* template:forloop-mult { */{
                x10.lang.region __var26__ = (x10.lang.region) X10_TEMP136;
                if (__var26__.size() > 0 && (__var26__ instanceof x10.array.MultiDimRegion || __var26__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var27__ = __var26__.rank(0).low(), __var28__ = __var26__.rank(0).high(); __var27__ <= __var28__; __var27__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var27__;
                /* } */
                /* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var29__ = (x10.lang.region) X10_TEMP143;
                    if (__var29__.size() > 0 && (__var29__ instanceof x10.array.MultiDimRegion || __var29__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var30__ = __var29__.rank(0).low(), __var31__ = __var29__.rank(0).high(); __var30__ <= __var31__; __var30__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var30__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var29__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var26__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var32__ = (x10.lang.region) X10_TEMP143;
                    if (__var32__.size() > 0 && (__var32__ instanceof x10.array.MultiDimRegion || __var32__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var33__ = __var32__.rank(0).low(), __var34__ = __var32__.rank(0).high(); __var33__ <= __var34__; __var33__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var33__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var32__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var23__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 1971
final int X10_TEMP916 =
                  (0);
                
//#line 1973
final int X10_TEMP133 =
                  (X10_TEMP916);
                
//#line 1974
final int X10_TEMP919 =
                  (1);
                
//#line 1976
final int X10_TEMP131 =
                  (X10_TEMP919);
                
//#line 1977
final int X10_TEMP922 =
                  (mm -
                     X10_TEMP131);
                
//#line 1979
final int X10_TEMP134 =
                  (X10_TEMP922);
                
//#line 1980
final x10.
                  lang.
                  region X10_TEMP927 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP133,
                          X10_TEMP134))));
                
//#line 1982
final x10.
                  lang.
                  region X10_TEMP136 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP927));
                
//#line 1983
/* template:forloop-mult { */{
                x10.lang.region __var35__ = (x10.lang.region) X10_TEMP136;
                if (__var35__.size() > 0 && (__var35__ instanceof x10.array.MultiDimRegion || __var35__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var36__ = __var35__.rank(0).low(), __var37__ = __var35__.rank(0).high(); __var36__ <= __var37__; __var36__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var36__;
                /* } */
                /* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var38__ = (x10.lang.region) X10_TEMP143;
                    if (__var38__.size() > 0 && (__var38__ instanceof x10.array.MultiDimRegion || __var38__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var39__ = __var38__.rank(0).low(), __var40__ = __var38__.rank(0).high(); __var39__ <= __var40__; __var39__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var39__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var38__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var35__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var41__ = (x10.lang.region) X10_TEMP143;
                    if (__var41__.size() > 0 && (__var41__ instanceof x10.array.MultiDimRegion || __var41__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var42__ = __var41__.rank(0).low(), __var43__ = __var41__.rank(0).high(); __var42__ <= __var43__; __var42__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var42__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var41__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var1____ = (__var20__).iterator(); __var1____.hasNext(); ) {
        	final  x10.
          lang.
          point __var1__ = (x10.
          lang.
          point) __var1____.next();
        	/* Join: { *//* Join: { */final int lg =
          /* template:array_get { */((__var1__).get(0))/* } */;/* } */
{
            
//#line 1958
final int X10_TEMP901 =
              (0);
            
//#line 1960
final int X10_TEMP126 =
              (X10_TEMP901);
            
//#line 1961
final int X10_TEMP904 =
              (1);
            
//#line 1963
final int X10_TEMP124 =
              (X10_TEMP904);
            
//#line 1964
final int X10_TEMP907 =
              (mm -
                 X10_TEMP124);
            
//#line 1966
final int X10_TEMP127 =
              (X10_TEMP907);
            
//#line 1967
final x10.
              lang.
              region X10_TEMP912 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP126,
                      X10_TEMP127))));
            
//#line 1969
final x10.
              lang.
              region X10_TEMP129 =
              (x10.
                lang.
                region)
                ((X10_TEMP912));
            
//#line 1970
/* template:forloop-mult { */{
            x10.lang.region __var44__ = (x10.lang.region) X10_TEMP129;
            if (__var44__.size() > 0 && (__var44__ instanceof x10.array.MultiDimRegion || __var44__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var45__ = __var44__.rank(0).low(), __var46__ = __var44__.rank(0).high(); __var45__ <= __var46__; __var45__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var45__;
            /* } */
            /* } */
{
                
//#line 1971
final int X10_TEMP916 =
                  (0);
                
//#line 1973
final int X10_TEMP133 =
                  (X10_TEMP916);
                
//#line 1974
final int X10_TEMP919 =
                  (1);
                
//#line 1976
final int X10_TEMP131 =
                  (X10_TEMP919);
                
//#line 1977
final int X10_TEMP922 =
                  (mm -
                     X10_TEMP131);
                
//#line 1979
final int X10_TEMP134 =
                  (X10_TEMP922);
                
//#line 1980
final x10.
                  lang.
                  region X10_TEMP927 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP133,
                          X10_TEMP134))));
                
//#line 1982
final x10.
                  lang.
                  region X10_TEMP136 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP927));
                
//#line 1983
/* template:forloop-mult { */{
                x10.lang.region __var47__ = (x10.lang.region) X10_TEMP136;
                if (__var47__.size() > 0 && (__var47__ instanceof x10.array.MultiDimRegion || __var47__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var48__ = __var47__.rank(0).low(), __var49__ = __var47__.rank(0).high(); __var48__ <= __var49__; __var48__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var48__;
                /* } */
                /* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var50__ = (x10.lang.region) X10_TEMP143;
                    if (__var50__.size() > 0 && (__var50__ instanceof x10.array.MultiDimRegion || __var50__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var51__ = __var50__.rank(0).low(), __var52__ = __var50__.rank(0).high(); __var51__ <= __var52__; __var51__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var51__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var50__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var47__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var53__ = (x10.lang.region) X10_TEMP143;
                    if (__var53__.size() > 0 && (__var53__ instanceof x10.array.MultiDimRegion || __var53__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var54__ = __var53__.rank(0).low(), __var55__ = __var53__.rank(0).high(); __var54__ <= __var55__; __var54__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var54__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var53__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var2____ = (__var44__).iterator(); __var2____.hasNext(); ) {
            	final  x10.
              lang.
              point __var2__ = (x10.
              lang.
              point) __var2____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var2__).get(0))/* } */;/* } */
{
                
//#line 1971
final int X10_TEMP916 =
                  (0);
                
//#line 1973
final int X10_TEMP133 =
                  (X10_TEMP916);
                
//#line 1974
final int X10_TEMP919 =
                  (1);
                
//#line 1976
final int X10_TEMP131 =
                  (X10_TEMP919);
                
//#line 1977
final int X10_TEMP922 =
                  (mm -
                     X10_TEMP131);
                
//#line 1979
final int X10_TEMP134 =
                  (X10_TEMP922);
                
//#line 1980
final x10.
                  lang.
                  region X10_TEMP927 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP133,
                          X10_TEMP134))));
                
//#line 1982
final x10.
                  lang.
                  region X10_TEMP136 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP927));
                
//#line 1983
/* template:forloop-mult { */{
                x10.lang.region __var56__ = (x10.lang.region) X10_TEMP136;
                if (__var56__.size() > 0 && (__var56__ instanceof x10.array.MultiDimRegion || __var56__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var57__ = __var56__.rank(0).low(), __var58__ = __var56__.rank(0).high(); __var57__ <= __var58__; __var57__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var57__;
                /* } */
                /* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var59__ = (x10.lang.region) X10_TEMP143;
                    if (__var59__.size() > 0 && (__var59__ instanceof x10.array.MultiDimRegion || __var59__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var60__ = __var59__.rank(0).low(), __var61__ = __var59__.rank(0).high(); __var60__ <= __var61__; __var60__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var60__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var59__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var3____ = (__var56__).iterator(); __var3____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var3__ = (x10.
                  lang.
                  point) __var3____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var3__).get(0))/* } */;/* } */
{
                    
//#line 1984
final int X10_TEMP931 =
                      (0);
                    
//#line 1986
final int X10_TEMP140 =
                      (X10_TEMP931);
                    
//#line 1987
final int X10_TEMP934 =
                      (1);
                    
//#line 1989
final int X10_TEMP138 =
                      (X10_TEMP934);
                    
//#line 1990
final int X10_TEMP937 =
                      (mm -
                         X10_TEMP138);
                    
//#line 1992
final int X10_TEMP141 =
                      (X10_TEMP937);
                    
//#line 1993
final x10.
                      lang.
                      region X10_TEMP942 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP140,
                              X10_TEMP141))));
                    
//#line 1995
final x10.
                      lang.
                      region X10_TEMP143 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP942));
                    
//#line 1996
/* template:forloop-mult { */{
                    x10.lang.region __var62__ = (x10.lang.region) X10_TEMP143;
                    if (__var62__.size() > 0 && (__var62__ instanceof x10.array.MultiDimRegion || __var62__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var63__ = __var62__.rank(0).low(), __var64__ = __var62__.rank(0).high(); __var63__ <= __var64__; __var63__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var63__;
                    /* } */
                    /* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var4____ = (__var62__).iterator(); __var4____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var4__ = (x10.
                      lang.
                      point) __var4____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var4__).get(0))/* } */;/* } */
{
                        
//#line 1997
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP946 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 1999
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP144 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP946));
                        
//#line 2000
final double X10_TEMP949 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2002
final double X10_TEMP146 =
                          (X10_TEMP949);
                        
//#line 2003
final double X10_TEMP952 =
                          (i *
                             X10_TEMP146);
                        
//#line 2005
final double X10_TEMP150 =
                          (X10_TEMP952);
                        
//#line 2006
final double X10_TEMP955 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2008
final double X10_TEMP147 =
                          (X10_TEMP955);
                        
//#line 2009
final double X10_TEMP958 =
                          (lg *
                             X10_TEMP147);
                        
//#line 2011
final double X10_TEMP148 =
                          (X10_TEMP958);
                        
//#line 2012
final double X10_TEMP961 =
                          (0.5);
                        
//#line 2014
final double X10_TEMP149 =
                          (X10_TEMP961);
                        
//#line 2015
final double X10_TEMP964 =
                          (X10_TEMP148 *
                             X10_TEMP149);
                        
//#line 2017
final double X10_TEMP151 =
                          (X10_TEMP964);
                        
//#line 2018
final double X10_TEMP967 =
                          (X10_TEMP150 +
                             X10_TEMP151);
                        
//#line 2020
final double X10_TEMP153 =
                          (X10_TEMP967);
                        
//#line 2021
final double X10_TEMP970 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2023
final double X10_TEMP155 =
                          (X10_TEMP970);
                        
//#line 2024
final double X10_TEMP973 =
                          (j *
                             X10_TEMP155);
                        
//#line 2026
final double X10_TEMP159 =
                          (X10_TEMP973);
                        
//#line 2027
final double X10_TEMP976 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2029
final double X10_TEMP156 =
                          (X10_TEMP976);
                        
//#line 2030
final double X10_TEMP979 =
                          (lg *
                             X10_TEMP156);
                        
//#line 2032
final double X10_TEMP157 =
                          (X10_TEMP979);
                        
//#line 2033
final double X10_TEMP982 =
                          (0.5);
                        
//#line 2035
final double X10_TEMP158 =
                          (X10_TEMP982);
                        
//#line 2036
final double X10_TEMP985 =
                          (X10_TEMP157 *
                             X10_TEMP158);
                        
//#line 2038
final double X10_TEMP160 =
                          (X10_TEMP985);
                        
//#line 2039
final double X10_TEMP988 =
                          (X10_TEMP159 +
                             X10_TEMP160);
                        
//#line 2041
final double X10_TEMP162 =
                          (X10_TEMP988);
                        
//#line 2042
final double X10_TEMP991 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2044
final double X10_TEMP164 =
                          (X10_TEMP991);
                        
//#line 2045
final double X10_TEMP994 =
                          (k *
                             X10_TEMP164);
                        
//#line 2047
final double X10_TEMP166 =
                          (X10_TEMP994);
                        
//#line 2048
final double X10_TEMP997 =
                          (0.0);
                        
//#line 2050
double X10_TEMP174 =
                          (X10_TEMP997);
                        
//#line 2051
final double X10_TEMP1000 =
                          (0.0);
                        
//#line 2053
double X10_TEMP175 =
                          (X10_TEMP1000);
                        
//#line 2054
final double X10_TEMP1003 =
                          (0.0);
                        
//#line 2056
double X10_TEMP176 =
                          (X10_TEMP1003);
                        
//#line 2057
final double X10_TEMP1006 =
                          (0.0);
                        
//#line 2059
double X10_TEMP177 =
                          (X10_TEMP1006);
                        
//#line 2060
final double X10_TEMP1009 =
                          (0.0);
                        
//#line 2062
double X10_TEMP178 =
                          (X10_TEMP1009);
                        
//#line 2063
final double X10_TEMP1012 =
                          (0.0);
                        
//#line 2065
double X10_TEMP179 =
                          (X10_TEMP1012);
                        
//#line 2066
final Particle X10_TEMP1024 =
                          (new Particle(
                             X10_TEMP153,
                             X10_TEMP162,
                             X10_TEMP166,
                             X10_TEMP174,
                             X10_TEMP175,
                             X10_TEMP176,
                             X10_TEMP177,
                             X10_TEMP178,
                             X10_TEMP179));
                        
//#line 2068
final Particle X10_TEMP182 =
                          (X10_TEMP1024);
                        
//#line 2069
final Particle X10_TEMP1027 =
                          (X10_TEMP182);
                        
//#line 2071
final Particle X10_TEMP183 =
                          (X10_TEMP1027);
                        
//#line 2072
final Particle X10_TEMP1031 =
                          (X10_TEMP183);
                        
//#line 2074
final Particle X10_TEMP1034 =
                          (X10_TEMP1031);
                        
//#line 2075
/* template:array_set { */(X10_TEMP144).set((X10_TEMP1034),ijk)/* } */;
                        
//#line 2076
final int X10_TEMP1036 =
                          (1);
                        
//#line 2078
final int X10_TEMP184 =
                          (X10_TEMP1036);
                        
//#line 2079
final int X10_TEMP1039 =
                          (ijk +
                             X10_TEMP184);
                        
//#line 2081
final int X10_TEMP186 =
                          (X10_TEMP1039);
                        
//#line 2082
final int X10_TEMP1042 =
                          (X10_TEMP186);
                        
//#line 2084
ijk =
                          ((X10_TEMP1042));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2089
final int X10_TEMP1045 =
          (1);
        
//#line 2091
final int X10_TEMP189 =
          (X10_TEMP1045);
        
//#line 2092
final int X10_TEMP1048 =
          (2);
        
//#line 2094
final int X10_TEMP190 =
          (X10_TEMP1048);
        
//#line 2095
final x10.
          lang.
          region X10_TEMP1053 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP189,
                  X10_TEMP190))));
        
//#line 2097
final x10.
          lang.
          region X10_TEMP192 =
          (x10.
            lang.
            region)
            ((X10_TEMP1053));
        
//#line 2098
/* template:forloop-mult { */{
        x10.lang.region __var65__ = (x10.lang.region) X10_TEMP192;
        if (__var65__.size() > 0 && (__var65__ instanceof x10.array.MultiDimRegion || __var65__ instanceof x10.array.ContiguousRange)) {
        	/* Loop: { *//* template:forloop-mult-each { */
        for (int __var66__ = __var65__.rank(0).low(), __var67__ = __var65__.rank(0).high(); __var66__ <= __var67__; __var66__++)
        /* } */
        /* } */ {
        		/* Join: { *//* Loop: { *//* template:final-var-assign { */
        final int lg = __var66__;
        /* } */
        /* } */
{
            
//#line 2099
final int X10_TEMP1057 =
              (0);
            
//#line 2101
final int X10_TEMP196 =
              (X10_TEMP1057);
            
//#line 2102
final int X10_TEMP1060 =
              (1);
            
//#line 2104
final int X10_TEMP194 =
              (X10_TEMP1060);
            
//#line 2105
final int X10_TEMP1063 =
              (mm -
                 X10_TEMP194);
            
//#line 2107
final int X10_TEMP197 =
              (X10_TEMP1063);
            
//#line 2108
final x10.
              lang.
              region X10_TEMP1068 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP196,
                      X10_TEMP197))));
            
//#line 2110
final x10.
              lang.
              region X10_TEMP199 =
              (x10.
                lang.
                region)
                ((X10_TEMP1068));
            
//#line 2111
/* template:forloop-mult { */{
            x10.lang.region __var68__ = (x10.lang.region) X10_TEMP199;
            if (__var68__.size() > 0 && (__var68__ instanceof x10.array.MultiDimRegion || __var68__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var69__ = __var68__.rank(0).low(), __var70__ = __var68__.rank(0).high(); __var69__ <= __var70__; __var69__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var69__;
            /* } */
            /* } */
{
                
//#line 2112
final int X10_TEMP1072 =
                  (0);
                
//#line 2114
final int X10_TEMP203 =
                  (X10_TEMP1072);
                
//#line 2115
final int X10_TEMP1075 =
                  (1);
                
//#line 2117
final int X10_TEMP201 =
                  (X10_TEMP1075);
                
//#line 2118
final int X10_TEMP1078 =
                  (mm -
                     X10_TEMP201);
                
//#line 2120
final int X10_TEMP204 =
                  (X10_TEMP1078);
                
//#line 2121
final x10.
                  lang.
                  region X10_TEMP1083 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP203,
                          X10_TEMP204))));
                
//#line 2123
final x10.
                  lang.
                  region X10_TEMP206 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1083));
                
//#line 2124
/* template:forloop-mult { */{
                x10.lang.region __var71__ = (x10.lang.region) X10_TEMP206;
                if (__var71__.size() > 0 && (__var71__ instanceof x10.array.MultiDimRegion || __var71__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var72__ = __var71__.rank(0).low(), __var73__ = __var71__.rank(0).high(); __var72__ <= __var73__; __var72__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var72__;
                /* } */
                /* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var74__ = (x10.lang.region) X10_TEMP213;
                    if (__var74__.size() > 0 && (__var74__ instanceof x10.array.MultiDimRegion || __var74__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var75__ = __var74__.rank(0).low(), __var76__ = __var74__.rank(0).high(); __var75__ <= __var76__; __var75__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var75__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var74__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var71__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var77__ = (x10.lang.region) X10_TEMP213;
                    if (__var77__.size() > 0 && (__var77__ instanceof x10.array.MultiDimRegion || __var77__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var78__ = __var77__.rank(0).low(), __var79__ = __var77__.rank(0).high(); __var78__ <= __var79__; __var78__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var78__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var77__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var6____ = (__var68__).iterator(); __var6____.hasNext(); ) {
            	final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 2112
final int X10_TEMP1072 =
                  (0);
                
//#line 2114
final int X10_TEMP203 =
                  (X10_TEMP1072);
                
//#line 2115
final int X10_TEMP1075 =
                  (1);
                
//#line 2117
final int X10_TEMP201 =
                  (X10_TEMP1075);
                
//#line 2118
final int X10_TEMP1078 =
                  (mm -
                     X10_TEMP201);
                
//#line 2120
final int X10_TEMP204 =
                  (X10_TEMP1078);
                
//#line 2121
final x10.
                  lang.
                  region X10_TEMP1083 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP203,
                          X10_TEMP204))));
                
//#line 2123
final x10.
                  lang.
                  region X10_TEMP206 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1083));
                
//#line 2124
/* template:forloop-mult { */{
                x10.lang.region __var80__ = (x10.lang.region) X10_TEMP206;
                if (__var80__.size() > 0 && (__var80__ instanceof x10.array.MultiDimRegion || __var80__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var81__ = __var80__.rank(0).low(), __var82__ = __var80__.rank(0).high(); __var81__ <= __var82__; __var81__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var81__;
                /* } */
                /* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var83__ = (x10.lang.region) X10_TEMP213;
                    if (__var83__.size() > 0 && (__var83__ instanceof x10.array.MultiDimRegion || __var83__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var84__ = __var83__.rank(0).low(), __var85__ = __var83__.rank(0).high(); __var84__ <= __var85__; __var84__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var84__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var83__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var80__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var86__ = (x10.lang.region) X10_TEMP213;
                    if (__var86__.size() > 0 && (__var86__ instanceof x10.array.MultiDimRegion || __var86__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var87__ = __var86__.rank(0).low(), __var88__ = __var86__.rank(0).high(); __var87__ <= __var88__; __var87__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var87__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var86__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        	}
        } else {
        	/* template:forloop { */
        for (java.util.Iterator __var5____ = (__var65__).iterator(); __var5____.hasNext(); ) {
        	final  x10.
          lang.
          point __var5__ = (x10.
          lang.
          point) __var5____.next();
        	/* Join: { *//* Join: { */final int lg =
          /* template:array_get { */((__var5__).get(0))/* } */;/* } */
{
            
//#line 2099
final int X10_TEMP1057 =
              (0);
            
//#line 2101
final int X10_TEMP196 =
              (X10_TEMP1057);
            
//#line 2102
final int X10_TEMP1060 =
              (1);
            
//#line 2104
final int X10_TEMP194 =
              (X10_TEMP1060);
            
//#line 2105
final int X10_TEMP1063 =
              (mm -
                 X10_TEMP194);
            
//#line 2107
final int X10_TEMP197 =
              (X10_TEMP1063);
            
//#line 2108
final x10.
              lang.
              region X10_TEMP1068 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP196,
                      X10_TEMP197))));
            
//#line 2110
final x10.
              lang.
              region X10_TEMP199 =
              (x10.
                lang.
                region)
                ((X10_TEMP1068));
            
//#line 2111
/* template:forloop-mult { */{
            x10.lang.region __var89__ = (x10.lang.region) X10_TEMP199;
            if (__var89__.size() > 0 && (__var89__ instanceof x10.array.MultiDimRegion || __var89__ instanceof x10.array.ContiguousRange)) {
            	/* Loop: { *//* template:forloop-mult-each { */
            for (int __var90__ = __var89__.rank(0).low(), __var91__ = __var89__.rank(0).high(); __var90__ <= __var91__; __var90__++)
            /* } */
            /* } */ {
            		/* Join: { *//* Loop: { *//* template:final-var-assign { */
            final int i = __var90__;
            /* } */
            /* } */
{
                
//#line 2112
final int X10_TEMP1072 =
                  (0);
                
//#line 2114
final int X10_TEMP203 =
                  (X10_TEMP1072);
                
//#line 2115
final int X10_TEMP1075 =
                  (1);
                
//#line 2117
final int X10_TEMP201 =
                  (X10_TEMP1075);
                
//#line 2118
final int X10_TEMP1078 =
                  (mm -
                     X10_TEMP201);
                
//#line 2120
final int X10_TEMP204 =
                  (X10_TEMP1078);
                
//#line 2121
final x10.
                  lang.
                  region X10_TEMP1083 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP203,
                          X10_TEMP204))));
                
//#line 2123
final x10.
                  lang.
                  region X10_TEMP206 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1083));
                
//#line 2124
/* template:forloop-mult { */{
                x10.lang.region __var92__ = (x10.lang.region) X10_TEMP206;
                if (__var92__.size() > 0 && (__var92__ instanceof x10.array.MultiDimRegion || __var92__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var93__ = __var92__.rank(0).low(), __var94__ = __var92__.rank(0).high(); __var93__ <= __var94__; __var93__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var93__;
                /* } */
                /* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var95__ = (x10.lang.region) X10_TEMP213;
                    if (__var95__.size() > 0 && (__var95__ instanceof x10.array.MultiDimRegion || __var95__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var96__ = __var95__.rank(0).low(), __var97__ = __var95__.rank(0).high(); __var96__ <= __var97__; __var96__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var96__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var95__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var92__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var98__ = (x10.lang.region) X10_TEMP213;
                    if (__var98__.size() > 0 && (__var98__ instanceof x10.array.MultiDimRegion || __var98__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var99__ = __var98__.rank(0).low(), __var100__ = __var98__.rank(0).high(); __var99__ <= __var100__; __var99__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var99__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var98__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            	}
            } else {
            	/* template:forloop { */
            for (java.util.Iterator __var6____ = (__var89__).iterator(); __var6____.hasNext(); ) {
            	final  x10.
              lang.
              point __var6__ = (x10.
              lang.
              point) __var6____.next();
            	/* Join: { *//* Join: { */final int i =
              /* template:array_get { */((__var6__).get(0))/* } */;/* } */
{
                
//#line 2112
final int X10_TEMP1072 =
                  (0);
                
//#line 2114
final int X10_TEMP203 =
                  (X10_TEMP1072);
                
//#line 2115
final int X10_TEMP1075 =
                  (1);
                
//#line 2117
final int X10_TEMP201 =
                  (X10_TEMP1075);
                
//#line 2118
final int X10_TEMP1078 =
                  (mm -
                     X10_TEMP201);
                
//#line 2120
final int X10_TEMP204 =
                  (X10_TEMP1078);
                
//#line 2121
final x10.
                  lang.
                  region X10_TEMP1083 =
                  (x10.
                    lang.
                    region)
                    ((x10.
                        lang.
                        region.
                        factory.
                        region(
                        x10.
                          lang.
                          region.
                          factory.
                          region(
                          X10_TEMP203,
                          X10_TEMP204))));
                
//#line 2123
final x10.
                  lang.
                  region X10_TEMP206 =
                  (x10.
                    lang.
                    region)
                    ((X10_TEMP1083));
                
//#line 2124
/* template:forloop-mult { */{
                x10.lang.region __var101__ = (x10.lang.region) X10_TEMP206;
                if (__var101__.size() > 0 && (__var101__ instanceof x10.array.MultiDimRegion || __var101__ instanceof x10.array.ContiguousRange)) {
                	/* Loop: { *//* template:forloop-mult-each { */
                for (int __var102__ = __var101__.rank(0).low(), __var103__ = __var101__.rank(0).high(); __var102__ <= __var103__; __var102__++)
                /* } */
                /* } */ {
                		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                final int j = __var102__;
                /* } */
                /* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var104__ = (x10.lang.region) X10_TEMP213;
                    if (__var104__.size() > 0 && (__var104__ instanceof x10.array.MultiDimRegion || __var104__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var105__ = __var104__.rank(0).low(), __var106__ = __var104__.rank(0).high(); __var105__ <= __var106__; __var105__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var105__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var104__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                	}
                } else {
                	/* template:forloop { */
                for (java.util.Iterator __var7____ = (__var101__).iterator(); __var7____.hasNext(); ) {
                	final  x10.
                  lang.
                  point __var7__ = (x10.
                  lang.
                  point) __var7____.next();
                	/* Join: { *//* Join: { */final int j =
                  /* template:array_get { */((__var7__).get(0))/* } */;/* } */
{
                    
//#line 2125
final int X10_TEMP1087 =
                      (0);
                    
//#line 2127
final int X10_TEMP210 =
                      (X10_TEMP1087);
                    
//#line 2128
final int X10_TEMP1090 =
                      (1);
                    
//#line 2130
final int X10_TEMP208 =
                      (X10_TEMP1090);
                    
//#line 2131
final int X10_TEMP1093 =
                      (mm -
                         X10_TEMP208);
                    
//#line 2133
final int X10_TEMP211 =
                      (X10_TEMP1093);
                    
//#line 2134
final x10.
                      lang.
                      region X10_TEMP1098 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP210,
                              X10_TEMP211))));
                    
//#line 2136
final x10.
                      lang.
                      region X10_TEMP213 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1098));
                    
//#line 2137
/* template:forloop-mult { */{
                    x10.lang.region __var107__ = (x10.lang.region) X10_TEMP213;
                    if (__var107__.size() > 0 && (__var107__ instanceof x10.array.MultiDimRegion || __var107__ instanceof x10.array.ContiguousRange)) {
                    	/* Loop: { *//* template:forloop-mult-each { */
                    for (int __var108__ = __var107__.rank(0).low(), __var109__ = __var107__.rank(0).high(); __var108__ <= __var109__; __var108__++)
                    /* } */
                    /* } */ {
                    		/* Join: { *//* Loop: { *//* template:final-var-assign { */
                    final int k = __var108__;
                    /* } */
                    /* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    	}
                    } else {
                    	/* template:forloop { */
                    for (java.util.Iterator __var8____ = (__var107__).iterator(); __var8____.hasNext(); ) {
                    	final  x10.
                      lang.
                      point __var8__ = (x10.
                      lang.
                      point) __var8____.next();
                    	/* Join: { *//* Join: { */final int k =
                      /* template:array_get { */((__var8__).get(0))/* } */;/* } */
{
                        
//#line 2138
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1102 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                        
//#line 2140
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP214 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1102));
                        
//#line 2141
final double X10_TEMP1105 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2143
final double X10_TEMP216 =
                          (X10_TEMP1105);
                        
//#line 2144
final double X10_TEMP1108 =
                          (i *
                             X10_TEMP216);
                        
//#line 2146
final double X10_TEMP223 =
                          (X10_TEMP1108);
                        
//#line 2147
final int X10_TEMP1111 =
                          (2);
                        
//#line 2149
final int X10_TEMP217 =
                          (X10_TEMP1111);
                        
//#line 2150
final int X10_TEMP1114 =
                          (X10_TEMP217 -
                             lg);
                        
//#line 2152
final int X10_TEMP219 =
                          (X10_TEMP1114);
                        
//#line 2153
final double X10_TEMP1117 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2155
final double X10_TEMP220 =
                          (X10_TEMP1117);
                        
//#line 2156
final double X10_TEMP1120 =
                          (X10_TEMP219 *
                             X10_TEMP220);
                        
//#line 2158
final double X10_TEMP221 =
                          (X10_TEMP1120);
                        
//#line 2159
final double X10_TEMP1123 =
                          (0.5);
                        
//#line 2161
final double X10_TEMP222 =
                          (X10_TEMP1123);
                        
//#line 2162
final double X10_TEMP1126 =
                          (X10_TEMP221 *
                             X10_TEMP222);
                        
//#line 2164
final double X10_TEMP224 =
                          (X10_TEMP1126);
                        
//#line 2165
final double X10_TEMP1129 =
                          (X10_TEMP223 +
                             X10_TEMP224);
                        
//#line 2167
final double X10_TEMP226 =
                          (X10_TEMP1129);
                        
//#line 2168
final double X10_TEMP1132 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2170
final double X10_TEMP228 =
                          (X10_TEMP1132);
                        
//#line 2171
final double X10_TEMP1135 =
                          (j *
                             X10_TEMP228);
                        
//#line 2173
final double X10_TEMP235 =
                          (X10_TEMP1135);
                        
//#line 2174
final int X10_TEMP1138 =
                          (1);
                        
//#line 2176
final int X10_TEMP229 =
                          (X10_TEMP1138);
                        
//#line 2177
final int X10_TEMP1141 =
                          (lg -
                             X10_TEMP229);
                        
//#line 2179
final int X10_TEMP231 =
                          (X10_TEMP1141);
                        
//#line 2180
final double X10_TEMP1144 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2182
final double X10_TEMP232 =
                          (X10_TEMP1144);
                        
//#line 2183
final double X10_TEMP1147 =
                          (X10_TEMP231 *
                             X10_TEMP232);
                        
//#line 2185
final double X10_TEMP233 =
                          (X10_TEMP1147);
                        
//#line 2186
final double X10_TEMP1150 =
                          (0.5);
                        
//#line 2188
final double X10_TEMP234 =
                          (X10_TEMP1150);
                        
//#line 2189
final double X10_TEMP1153 =
                          (X10_TEMP233 *
                             X10_TEMP234);
                        
//#line 2191
final double X10_TEMP236 =
                          (X10_TEMP1153);
                        
//#line 2192
final double X10_TEMP1156 =
                          (X10_TEMP235 +
                             X10_TEMP236);
                        
//#line 2194
final double X10_TEMP238 =
                          (X10_TEMP1156);
                        
//#line 2195
final double X10_TEMP1159 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2197
final double X10_TEMP240 =
                          (X10_TEMP1159);
                        
//#line 2198
final double X10_TEMP1162 =
                          (k *
                             X10_TEMP240);
                        
//#line 2200
final double X10_TEMP243 =
                          (X10_TEMP1162);
                        
//#line 2201
final double X10_TEMP1165 =
                          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.a);
                        
//#line 2203
final double X10_TEMP241 =
                          (X10_TEMP1165);
                        
//#line 2204
final double X10_TEMP1168 =
                          (0.5);
                        
//#line 2206
final double X10_TEMP242 =
                          (X10_TEMP1168);
                        
//#line 2207
final double X10_TEMP1171 =
                          (X10_TEMP241 *
                             X10_TEMP242);
                        
//#line 2209
final double X10_TEMP244 =
                          (X10_TEMP1171);
                        
//#line 2210
final double X10_TEMP1174 =
                          (X10_TEMP243 +
                             X10_TEMP244);
                        
//#line 2212
final double X10_TEMP246 =
                          (X10_TEMP1174);
                        
//#line 2213
final double X10_TEMP1177 =
                          (0.0);
                        
//#line 2215
double X10_TEMP254 =
                          (X10_TEMP1177);
                        
//#line 2216
final double X10_TEMP1180 =
                          (0.0);
                        
//#line 2218
double X10_TEMP255 =
                          (X10_TEMP1180);
                        
//#line 2219
final double X10_TEMP1183 =
                          (0.0);
                        
//#line 2221
double X10_TEMP256 =
                          (X10_TEMP1183);
                        
//#line 2222
final double X10_TEMP1186 =
                          (0.0);
                        
//#line 2224
double X10_TEMP257 =
                          (X10_TEMP1186);
                        
//#line 2225
final double X10_TEMP1189 =
                          (0.0);
                        
//#line 2227
double X10_TEMP258 =
                          (X10_TEMP1189);
                        
//#line 2228
final double X10_TEMP1192 =
                          (0.0);
                        
//#line 2230
double X10_TEMP259 =
                          (X10_TEMP1192);
                        
//#line 2231
final Particle X10_TEMP1204 =
                          (new Particle(
                             X10_TEMP226,
                             X10_TEMP238,
                             X10_TEMP246,
                             X10_TEMP254,
                             X10_TEMP255,
                             X10_TEMP256,
                             X10_TEMP257,
                             X10_TEMP258,
                             X10_TEMP259));
                        
//#line 2233
final Particle X10_TEMP262 =
                          (X10_TEMP1204);
                        
//#line 2234
final Particle X10_TEMP1207 =
                          (X10_TEMP262);
                        
//#line 2236
final Particle X10_TEMP263 =
                          (X10_TEMP1207);
                        
//#line 2237
final Particle X10_TEMP1211 =
                          (X10_TEMP263);
                        
//#line 2239
final Particle X10_TEMP1214 =
                          (X10_TEMP1211);
                        
//#line 2240
/* template:array_set { */(X10_TEMP214).set((X10_TEMP1214),ijk)/* } */;
                        
//#line 2241
final int X10_TEMP1216 =
                          (1);
                        
//#line 2243
final int X10_TEMP264 =
                          (X10_TEMP1216);
                        
//#line 2244
final int X10_TEMP1219 =
                          (ijk +
                             X10_TEMP264);
                        
//#line 2246
final int X10_TEMP266 =
                          (X10_TEMP1219);
                        
//#line 2247
final int X10_TEMP1222 =
                          (X10_TEMP266);
                        
//#line 2249
ijk =
                          ((X10_TEMP1222));
                    }/* } */
                    }
                    /* } */
                    
                    }
                    }
                    /* } */
                    
                }/* } */
                }
                /* } */
                
                }
                }
                /* } */
                
            }/* } */
            }
            /* } */
            
            }
            }
            /* } */
            
        }/* } */
        }
        /* } */
        
        }
        }
        /* } */
        
        
//#line 2254
final int X10_TEMP1225 =
          (0);
        
//#line 2256
int iseed =
          (X10_TEMP1225);
        
//#line 2257
final double X10_TEMP1228 =
          (0.0);
        
//#line 2259
double v1 =
          (X10_TEMP1228);
        
//#line 2260
final double X10_TEMP1231 =
          (0.0);
        
//#line 2262
double v2 =
          (X10_TEMP1231);
        
//#line 2263
final Random X10_TEMP1237 =
          (new Random(
             iseed,
             v1,
             v2));
        
//#line 2265
Random randnum =
          (X10_TEMP1237);
        
//#line 2266
final double X10_TEMP1240 =
          (0.0);
        
//#line 2268
double r =
          (X10_TEMP1240);
        
//#line 2269
final int X10_TEMP1243 =
          (0);
        
//#line 2271
int k =
          (X10_TEMP1243);
        
//#line 2272
final int X10_TEMP1246 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2274
final int X10_TEMP276 =
          (X10_TEMP1246);
        
//#line 2275
boolean X10_TEMP280 =
          (k <
             X10_TEMP276);
        
//#line 2276
boolean X10_TEMP1251 =
          X10_TEMP280;
        
//#line 2277
while (X10_TEMP1251) {
            
//#line 2278
final double X10_TEMP1254 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 2280
final double X10_TEMP282 =
              (X10_TEMP1254);
            
//#line 2281
final double X10_TEMP1257 =
              (X10_TEMP282);
            
//#line 2283
r =
              ((X10_TEMP1257));
            
//#line 2284
final x10.
              lang.
              GenericReferenceArray X10_TEMP1260 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2286
final x10.
              lang.
              GenericReferenceArray X10_TEMP283 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1260));
            
//#line 2287
final Particle X10_TEMP1264 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP283).get(k))/* } */))/* } */);
            
//#line 2289
final Particle X10_TEMP285 =
              (X10_TEMP1264);
            
//#line 2290
final double X10_TEMP1267 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 2292
final double X10_TEMP286 =
              (X10_TEMP1267);
            
//#line 2293
final double X10_TEMP1270 =
              (r *
                 X10_TEMP286);
            
//#line 2295
final double X10_TEMP289 =
              (X10_TEMP1270);
            
//#line 2296
final double X10_TEMP1273 =
              (X10_TEMP289);
            
//#line 2298
final double X10_TEMP290 =
              (X10_TEMP1273);
            
//#line 2299
final double X10_TEMP1276 =
              (X10_TEMP290);
            
//#line 2301
final double X10_TEMP1279 =
              (X10_TEMP1276);
            
//#line 2302
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP285))/* } */.xvelocity =
              ((X10_TEMP1279));
            
//#line 2303
final x10.
              lang.
              GenericReferenceArray X10_TEMP1281 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2305
final x10.
              lang.
              GenericReferenceArray X10_TEMP291 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1281));
            
//#line 2306
final int X10_TEMP1284 =
              (1);
            
//#line 2308
final int X10_TEMP292 =
              (X10_TEMP1284);
            
//#line 2309
final int X10_TEMP1287 =
              (k +
                 X10_TEMP292);
            
//#line 2311
final int X10_TEMP294 =
              (X10_TEMP1287);
            
//#line 2312
final Particle X10_TEMP1291 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP291).get(X10_TEMP294))/* } */))/* } */);
            
//#line 2314
final Particle X10_TEMP295 =
              (X10_TEMP1291);
            
//#line 2315
final double X10_TEMP1294 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 2317
final double X10_TEMP296 =
              (X10_TEMP1294);
            
//#line 2318
final double X10_TEMP1297 =
              (r *
                 X10_TEMP296);
            
//#line 2320
final double X10_TEMP299 =
              (X10_TEMP1297);
            
//#line 2321
final double X10_TEMP1300 =
              (X10_TEMP299);
            
//#line 2323
final double X10_TEMP300 =
              (X10_TEMP1300);
            
//#line 2324
final double X10_TEMP1303 =
              (X10_TEMP300);
            
//#line 2326
final double X10_TEMP1306 =
              (X10_TEMP1303);
            
//#line 2327
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP295))/* } */.xvelocity =
              ((X10_TEMP1306));
            
//#line 2328
final int X10_TEMP1308 =
              (2);
            
//#line 2330
final int X10_TEMP302 =
              (X10_TEMP1308);
            
//#line 2331
final int X10_TEMP1311 =
              (k +
                 X10_TEMP302);
            
//#line 2333
k =
              ((X10_TEMP1311));
            
//#line 2334
final int X10_TEMP1314 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2336
final int X10_TEMP278 =
              (X10_TEMP1314);
            
//#line 2337
final boolean X10_TEMP1317 =
              (k <
                 X10_TEMP278);
            
//#line 2338
X10_TEMP280 =
              ((X10_TEMP1317));
            
//#line 2339
X10_TEMP1251 =
              X10_TEMP280;
        }
        
//#line 2341
final int X10_TEMP1319 =
          (0);
        
//#line 2343
final int X10_TEMP304 =
          (X10_TEMP1319);
        
//#line 2344
final int X10_TEMP1322 =
          (X10_TEMP304);
        
//#line 2346
k =
          ((X10_TEMP1322));
        
//#line 2347
final int X10_TEMP1325 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2349
final int X10_TEMP305 =
          (X10_TEMP1325);
        
//#line 2350
boolean X10_TEMP309 =
          (k <
             X10_TEMP305);
        
//#line 2351
boolean X10_TEMP1330 =
          X10_TEMP309;
        
//#line 2352
while (X10_TEMP1330) {
            
//#line 2353
final double X10_TEMP1333 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 2355
final double X10_TEMP311 =
              (X10_TEMP1333);
            
//#line 2356
final double X10_TEMP1336 =
              (X10_TEMP311);
            
//#line 2358
r =
              ((X10_TEMP1336));
            
//#line 2359
final x10.
              lang.
              GenericReferenceArray X10_TEMP1339 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2361
final x10.
              lang.
              GenericReferenceArray X10_TEMP312 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1339));
            
//#line 2362
final Particle X10_TEMP1343 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP312).get(k))/* } */))/* } */);
            
//#line 2364
final Particle X10_TEMP314 =
              (X10_TEMP1343);
            
//#line 2365
final double X10_TEMP1346 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 2367
final double X10_TEMP315 =
              (X10_TEMP1346);
            
//#line 2368
final double X10_TEMP1349 =
              (r *
                 X10_TEMP315);
            
//#line 2370
final double X10_TEMP318 =
              (X10_TEMP1349);
            
//#line 2371
final double X10_TEMP1352 =
              (X10_TEMP318);
            
//#line 2373
final double X10_TEMP319 =
              (X10_TEMP1352);
            
//#line 2374
final double X10_TEMP1355 =
              (X10_TEMP319);
            
//#line 2376
final double X10_TEMP1358 =
              (X10_TEMP1355);
            
//#line 2377
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP314))/* } */.yvelocity =
              ((X10_TEMP1358));
            
//#line 2378
final x10.
              lang.
              GenericReferenceArray X10_TEMP1360 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2380
final x10.
              lang.
              GenericReferenceArray X10_TEMP320 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1360));
            
//#line 2381
final int X10_TEMP1363 =
              (1);
            
//#line 2383
final int X10_TEMP321 =
              (X10_TEMP1363);
            
//#line 2384
final int X10_TEMP1366 =
              (k +
                 X10_TEMP321);
            
//#line 2386
final int X10_TEMP323 =
              (X10_TEMP1366);
            
//#line 2387
final Particle X10_TEMP1370 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP320).get(X10_TEMP323))/* } */))/* } */);
            
//#line 2389
final Particle X10_TEMP324 =
              (X10_TEMP1370);
            
//#line 2390
final double X10_TEMP1373 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 2392
final double X10_TEMP325 =
              (X10_TEMP1373);
            
//#line 2393
final double X10_TEMP1376 =
              (r *
                 X10_TEMP325);
            
//#line 2395
final double X10_TEMP328 =
              (X10_TEMP1376);
            
//#line 2396
final double X10_TEMP1379 =
              (X10_TEMP328);
            
//#line 2398
final double X10_TEMP329 =
              (X10_TEMP1379);
            
//#line 2399
final double X10_TEMP1382 =
              (X10_TEMP329);
            
//#line 2401
final double X10_TEMP1385 =
              (X10_TEMP1382);
            
//#line 2402
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP324))/* } */.yvelocity =
              ((X10_TEMP1385));
            
//#line 2403
final int X10_TEMP1387 =
              (2);
            
//#line 2405
final int X10_TEMP331 =
              (X10_TEMP1387);
            
//#line 2406
final int X10_TEMP1390 =
              (k +
                 X10_TEMP331);
            
//#line 2408
k =
              ((X10_TEMP1390));
            
//#line 2409
final int X10_TEMP1393 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2411
final int X10_TEMP307 =
              (X10_TEMP1393);
            
//#line 2412
final boolean X10_TEMP1396 =
              (k <
                 X10_TEMP307);
            
//#line 2413
X10_TEMP309 =
              ((X10_TEMP1396));
            
//#line 2414
X10_TEMP1330 =
              X10_TEMP309;
        }
        
//#line 2416
final int X10_TEMP1398 =
          (0);
        
//#line 2418
final int X10_TEMP333 =
          (X10_TEMP1398);
        
//#line 2419
final int X10_TEMP1401 =
          (X10_TEMP333);
        
//#line 2421
k =
          ((X10_TEMP1401));
        
//#line 2422
final int X10_TEMP1404 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2424
final int X10_TEMP334 =
          (X10_TEMP1404);
        
//#line 2425
boolean X10_TEMP338 =
          (k <
             X10_TEMP334);
        
//#line 2426
boolean X10_TEMP1409 =
          X10_TEMP338;
        
//#line 2427
while (X10_TEMP1409) {
            
//#line 2428
final double X10_TEMP1412 =
              (Program0.
                 Program_Random_seed(
                 randnum));
            
//#line 2430
final double X10_TEMP340 =
              (X10_TEMP1412);
            
//#line 2431
final double X10_TEMP1415 =
              (X10_TEMP340);
            
//#line 2433
r =
              ((X10_TEMP1415));
            
//#line 2434
final x10.
              lang.
              GenericReferenceArray X10_TEMP1418 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2436
final x10.
              lang.
              GenericReferenceArray X10_TEMP341 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1418));
            
//#line 2437
final Particle X10_TEMP1422 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP341).get(k))/* } */))/* } */);
            
//#line 2439
final Particle X10_TEMP343 =
              (X10_TEMP1422);
            
//#line 2440
final double X10_TEMP1425 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v1);
            
//#line 2442
final double X10_TEMP344 =
              (X10_TEMP1425);
            
//#line 2443
final double X10_TEMP1428 =
              (r *
                 X10_TEMP344);
            
//#line 2445
final double X10_TEMP347 =
              (X10_TEMP1428);
            
//#line 2446
final double X10_TEMP1431 =
              (X10_TEMP347);
            
//#line 2448
final double X10_TEMP348 =
              (X10_TEMP1431);
            
//#line 2449
final double X10_TEMP1434 =
              (X10_TEMP348);
            
//#line 2451
final double X10_TEMP1437 =
              (X10_TEMP1434);
            
//#line 2452
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP343))/* } */.zvelocity =
              ((X10_TEMP1437));
            
//#line 2453
final x10.
              lang.
              GenericReferenceArray X10_TEMP1439 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2455
final x10.
              lang.
              GenericReferenceArray X10_TEMP349 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1439));
            
//#line 2456
final int X10_TEMP1442 =
              (1);
            
//#line 2458
final int X10_TEMP350 =
              (X10_TEMP1442);
            
//#line 2459
final int X10_TEMP1445 =
              (k +
                 X10_TEMP350);
            
//#line 2461
final int X10_TEMP352 =
              (X10_TEMP1445);
            
//#line 2462
final Particle X10_TEMP1449 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP349).get(X10_TEMP352))/* } */))/* } */);
            
//#line 2464
final Particle X10_TEMP353 =
              (X10_TEMP1449);
            
//#line 2465
final double X10_TEMP1452 =
              (/* template:place-check { */((Random) x10.lang.Runtime.hereCheck(randnum))/* } */.v2);
            
//#line 2467
final double X10_TEMP354 =
              (X10_TEMP1452);
            
//#line 2468
final double X10_TEMP1455 =
              (r *
                 X10_TEMP354);
            
//#line 2470
final double X10_TEMP357 =
              (X10_TEMP1455);
            
//#line 2471
final double X10_TEMP1458 =
              (X10_TEMP357);
            
//#line 2473
final double X10_TEMP358 =
              (X10_TEMP1458);
            
//#line 2474
final double X10_TEMP1461 =
              (X10_TEMP358);
            
//#line 2476
final double X10_TEMP1464 =
              (X10_TEMP1461);
            
//#line 2477
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP353))/* } */.zvelocity =
              ((X10_TEMP1464));
            
//#line 2478
final int X10_TEMP1466 =
              (2);
            
//#line 2480
final int X10_TEMP360 =
              (X10_TEMP1466);
            
//#line 2481
final int X10_TEMP1469 =
              (k +
                 X10_TEMP360);
            
//#line 2483
k =
              ((X10_TEMP1469));
            
//#line 2484
final int X10_TEMP1472 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 2486
final int X10_TEMP336 =
              (X10_TEMP1472);
            
//#line 2487
final boolean X10_TEMP1475 =
              (k <
                 X10_TEMP336);
            
//#line 2488
X10_TEMP338 =
              ((X10_TEMP1475));
            
//#line 2489
X10_TEMP1409 =
              X10_TEMP338;
        }
        
//#line 2491
final double X10_TEMP1477 =
          (0.0);
        
//#line 2493
final double X10_TEMP363 =
          (X10_TEMP1477);
        
//#line 2494
final double X10_TEMP1480 =
          (X10_TEMP363);
        
//#line 2496
final double X10_TEMP364 =
          (X10_TEMP1480);
        
//#line 2497
final double X10_TEMP1483 =
          (X10_TEMP364);
        
//#line 2499
final double X10_TEMP1486 =
          (X10_TEMP1483);
        
//#line 2500
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
          ((X10_TEMP1486));
        
//#line 2501
final double X10_TEMP1488 =
          (0.0);
        
//#line 2503
double sp =
          (X10_TEMP1488);
        
//#line 2504
final int X10_TEMP1491 =
          (0);
        
//#line 2506
final int X10_TEMP370 =
          (X10_TEMP1491);
        
//#line 2507
final int X10_TEMP1494 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2509
final int X10_TEMP367 =
          (X10_TEMP1494);
        
//#line 2510
final int X10_TEMP1497 =
          (1);
        
//#line 2512
final int X10_TEMP368 =
          (X10_TEMP1497);
        
//#line 2513
final int X10_TEMP1500 =
          (X10_TEMP367 -
             X10_TEMP368);
        
//#line 2515
final int X10_TEMP371 =
          (X10_TEMP1500);
        
//#line 2516
final x10.
          lang.
          region X10_TEMP1505 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP370,
                  X10_TEMP371))));
        
//#line 2518
final x10.
          lang.
          region X10_TEMP373 =
          (x10.
            lang.
            region)
            ((X10_TEMP1505));
        
//#line 2519
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP373).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2520
final x10.
              lang.
              GenericReferenceArray X10_TEMP1509 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2522
final x10.
              lang.
              GenericReferenceArray X10_TEMP374 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1509));
            
//#line 2523
final Particle X10_TEMP1513 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP374).get(i))/* } */))/* } */);
            
//#line 2525
final Particle X10_TEMP376 =
              (X10_TEMP1513);
            
//#line 2526
final double X10_TEMP1516 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP376))/* } */.xvelocity);
            
//#line 2528
final double X10_TEMP377 =
              (X10_TEMP1516);
            
//#line 2529
final double X10_TEMP1519 =
              (sp +
                 X10_TEMP377);
            
//#line 2531
final double X10_TEMP379 =
              (X10_TEMP1519);
            
//#line 2532
final double X10_TEMP1522 =
              (X10_TEMP379);
            
//#line 2534
sp =
              ((X10_TEMP1522));
        }/* } */
        }
        /* } */
        
        
//#line 2536
final int X10_TEMP1525 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2538
final int X10_TEMP380 =
          (X10_TEMP1525);
        
//#line 2539
final double X10_TEMP1528 =
          (sp /
             X10_TEMP380);
        
//#line 2541
final double X10_TEMP382 =
          (X10_TEMP1528);
        
//#line 2542
final double X10_TEMP1531 =
          (X10_TEMP382);
        
//#line 2544
sp =
          ((X10_TEMP1531));
        
//#line 2545
final int X10_TEMP1534 =
          (0);
        
//#line 2547
final int X10_TEMP387 =
          (X10_TEMP1534);
        
//#line 2548
final int X10_TEMP1537 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2550
final int X10_TEMP384 =
          (X10_TEMP1537);
        
//#line 2551
final int X10_TEMP1540 =
          (1);
        
//#line 2553
final int X10_TEMP385 =
          (X10_TEMP1540);
        
//#line 2554
final int X10_TEMP1543 =
          (X10_TEMP384 -
             X10_TEMP385);
        
//#line 2556
final int X10_TEMP388 =
          (X10_TEMP1543);
        
//#line 2557
final x10.
          lang.
          region X10_TEMP1548 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP387,
                  X10_TEMP388))));
        
//#line 2559
final x10.
          lang.
          region X10_TEMP390 =
          (x10.
            lang.
            region)
            ((X10_TEMP1548));
        
//#line 2560
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP390).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2561
final x10.
              lang.
              GenericReferenceArray X10_TEMP1552 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2563
final x10.
              lang.
              GenericReferenceArray X10_TEMP391 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1552));
            
//#line 2564
final Particle X10_TEMP1556 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP391).get(i))/* } */))/* } */);
            
//#line 2566
final Particle X10_TEMP393 =
              (X10_TEMP1556);
            
//#line 2567
final x10.
              lang.
              GenericReferenceArray X10_TEMP1559 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2569
final x10.
              lang.
              GenericReferenceArray X10_TEMP394 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1559));
            
//#line 2570
final Particle X10_TEMP1563 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP394).get(i))/* } */))/* } */);
            
//#line 2572
final Particle X10_TEMP396 =
              (X10_TEMP1563);
            
//#line 2573
final double X10_TEMP1566 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP396))/* } */.xvelocity);
            
//#line 2575
final double X10_TEMP397 =
              (X10_TEMP1566);
            
//#line 2576
final double X10_TEMP1569 =
              (X10_TEMP397 -
                 sp);
            
//#line 2578
final double X10_TEMP400 =
              (X10_TEMP1569);
            
//#line 2579
final double X10_TEMP1572 =
              (X10_TEMP400);
            
//#line 2581
final double X10_TEMP401 =
              (X10_TEMP1572);
            
//#line 2582
final double X10_TEMP1575 =
              (X10_TEMP401);
            
//#line 2584
final double X10_TEMP1578 =
              (X10_TEMP1575);
            
//#line 2585
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP393))/* } */.xvelocity =
              ((X10_TEMP1578));
            
//#line 2586
final double X10_TEMP1580 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2588
final double X10_TEMP410 =
              (X10_TEMP1580);
            
//#line 2589
final x10.
              lang.
              GenericReferenceArray X10_TEMP1583 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2591
final x10.
              lang.
              GenericReferenceArray X10_TEMP402 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1583));
            
//#line 2592
final Particle X10_TEMP1587 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP402).get(i))/* } */))/* } */);
            
//#line 2594
final Particle X10_TEMP404 =
              (X10_TEMP1587);
            
//#line 2595
final double X10_TEMP1590 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP404))/* } */.xvelocity);
            
//#line 2597
final double X10_TEMP408 =
              (X10_TEMP1590);
            
//#line 2598
final x10.
              lang.
              GenericReferenceArray X10_TEMP1593 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2600
final x10.
              lang.
              GenericReferenceArray X10_TEMP405 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1593));
            
//#line 2601
final Particle X10_TEMP1597 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP405).get(i))/* } */))/* } */);
            
//#line 2603
final Particle X10_TEMP407 =
              (X10_TEMP1597);
            
//#line 2604
final double X10_TEMP1600 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP407))/* } */.xvelocity);
            
//#line 2606
final double X10_TEMP409 =
              (X10_TEMP1600);
            
//#line 2607
final double X10_TEMP1603 =
              (X10_TEMP408 *
                 X10_TEMP409);
            
//#line 2609
final double X10_TEMP411 =
              (X10_TEMP1603);
            
//#line 2610
final double X10_TEMP1606 =
              (X10_TEMP410 +
                 X10_TEMP411);
            
//#line 2612
final double X10_TEMP414 =
              (X10_TEMP1606);
            
//#line 2613
final double X10_TEMP1609 =
              (X10_TEMP414);
            
//#line 2615
final double X10_TEMP415 =
              (X10_TEMP1609);
            
//#line 2616
final double X10_TEMP1612 =
              (X10_TEMP415);
            
//#line 2618
final double X10_TEMP1615 =
              (X10_TEMP1612);
            
//#line 2619
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1615));
        }/* } */
        }
        /* } */
        
        
//#line 2621
final double X10_TEMP1617 =
          (0.0);
        
//#line 2623
final double X10_TEMP417 =
          (X10_TEMP1617);
        
//#line 2624
final double X10_TEMP1620 =
          (X10_TEMP417);
        
//#line 2626
sp =
          ((X10_TEMP1620));
        
//#line 2627
final int X10_TEMP1623 =
          (0);
        
//#line 2629
final int X10_TEMP422 =
          (X10_TEMP1623);
        
//#line 2630
final int X10_TEMP1626 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2632
final int X10_TEMP419 =
          (X10_TEMP1626);
        
//#line 2633
final int X10_TEMP1629 =
          (1);
        
//#line 2635
final int X10_TEMP420 =
          (X10_TEMP1629);
        
//#line 2636
final int X10_TEMP1632 =
          (X10_TEMP419 -
             X10_TEMP420);
        
//#line 2638
final int X10_TEMP423 =
          (X10_TEMP1632);
        
//#line 2639
final x10.
          lang.
          region X10_TEMP1637 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP422,
                  X10_TEMP423))));
        
//#line 2641
final x10.
          lang.
          region X10_TEMP425 =
          (x10.
            lang.
            region)
            ((X10_TEMP1637));
        
//#line 2642
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP425).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2643
final x10.
              lang.
              GenericReferenceArray X10_TEMP1641 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2645
final x10.
              lang.
              GenericReferenceArray X10_TEMP426 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1641));
            
//#line 2646
final Particle X10_TEMP1645 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP426).get(i))/* } */))/* } */);
            
//#line 2648
final Particle X10_TEMP428 =
              (X10_TEMP1645);
            
//#line 2649
final double X10_TEMP1648 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP428))/* } */.yvelocity);
            
//#line 2651
final double X10_TEMP429 =
              (X10_TEMP1648);
            
//#line 2652
final double X10_TEMP1651 =
              (sp +
                 X10_TEMP429);
            
//#line 2654
final double X10_TEMP431 =
              (X10_TEMP1651);
            
//#line 2655
final double X10_TEMP1654 =
              (X10_TEMP431);
            
//#line 2657
sp =
              ((X10_TEMP1654));
        }/* } */
        }
        /* } */
        
        
//#line 2659
final int X10_TEMP1657 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2661
final int X10_TEMP432 =
          (X10_TEMP1657);
        
//#line 2662
final double X10_TEMP1660 =
          (sp /
             X10_TEMP432);
        
//#line 2664
final double X10_TEMP434 =
          (X10_TEMP1660);
        
//#line 2665
final double X10_TEMP1663 =
          (X10_TEMP434);
        
//#line 2667
sp =
          ((X10_TEMP1663));
        
//#line 2668
final int X10_TEMP1666 =
          (0);
        
//#line 2670
final int X10_TEMP439 =
          (X10_TEMP1666);
        
//#line 2671
final int X10_TEMP1669 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2673
final int X10_TEMP436 =
          (X10_TEMP1669);
        
//#line 2674
final int X10_TEMP1672 =
          (1);
        
//#line 2676
final int X10_TEMP437 =
          (X10_TEMP1672);
        
//#line 2677
final int X10_TEMP1675 =
          (X10_TEMP436 -
             X10_TEMP437);
        
//#line 2679
final int X10_TEMP440 =
          (X10_TEMP1675);
        
//#line 2680
final x10.
          lang.
          region X10_TEMP1680 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP439,
                  X10_TEMP440))));
        
//#line 2682
final x10.
          lang.
          region X10_TEMP442 =
          (x10.
            lang.
            region)
            ((X10_TEMP1680));
        
//#line 2683
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP442).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2684
final x10.
              lang.
              GenericReferenceArray X10_TEMP1684 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2686
final x10.
              lang.
              GenericReferenceArray X10_TEMP443 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1684));
            
//#line 2687
final Particle X10_TEMP1688 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP443).get(i))/* } */))/* } */);
            
//#line 2689
final Particle X10_TEMP445 =
              (X10_TEMP1688);
            
//#line 2690
final x10.
              lang.
              GenericReferenceArray X10_TEMP1691 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2692
final x10.
              lang.
              GenericReferenceArray X10_TEMP446 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1691));
            
//#line 2693
final Particle X10_TEMP1695 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP446).get(i))/* } */))/* } */);
            
//#line 2695
final Particle X10_TEMP448 =
              (X10_TEMP1695);
            
//#line 2696
final double X10_TEMP1698 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP448))/* } */.yvelocity);
            
//#line 2698
final double X10_TEMP449 =
              (X10_TEMP1698);
            
//#line 2699
final double X10_TEMP1701 =
              (X10_TEMP449 -
                 sp);
            
//#line 2701
final double X10_TEMP452 =
              (X10_TEMP1701);
            
//#line 2702
final double X10_TEMP1704 =
              (X10_TEMP452);
            
//#line 2704
final double X10_TEMP453 =
              (X10_TEMP1704);
            
//#line 2705
final double X10_TEMP1707 =
              (X10_TEMP453);
            
//#line 2707
final double X10_TEMP1710 =
              (X10_TEMP1707);
            
//#line 2708
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP445))/* } */.yvelocity =
              ((X10_TEMP1710));
            
//#line 2709
final double X10_TEMP1712 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2711
final double X10_TEMP462 =
              (X10_TEMP1712);
            
//#line 2712
final x10.
              lang.
              GenericReferenceArray X10_TEMP1715 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2714
final x10.
              lang.
              GenericReferenceArray X10_TEMP454 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1715));
            
//#line 2715
final Particle X10_TEMP1719 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP454).get(i))/* } */))/* } */);
            
//#line 2717
final Particle X10_TEMP456 =
              (X10_TEMP1719);
            
//#line 2718
final double X10_TEMP1722 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP456))/* } */.yvelocity);
            
//#line 2720
final double X10_TEMP460 =
              (X10_TEMP1722);
            
//#line 2721
final x10.
              lang.
              GenericReferenceArray X10_TEMP1725 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2723
final x10.
              lang.
              GenericReferenceArray X10_TEMP457 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1725));
            
//#line 2724
final Particle X10_TEMP1729 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP457).get(i))/* } */))/* } */);
            
//#line 2726
final Particle X10_TEMP459 =
              (X10_TEMP1729);
            
//#line 2727
final double X10_TEMP1732 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP459))/* } */.yvelocity);
            
//#line 2729
final double X10_TEMP461 =
              (X10_TEMP1732);
            
//#line 2730
final double X10_TEMP1735 =
              (X10_TEMP460 *
                 X10_TEMP461);
            
//#line 2732
final double X10_TEMP463 =
              (X10_TEMP1735);
            
//#line 2733
final double X10_TEMP1738 =
              (X10_TEMP462 +
                 X10_TEMP463);
            
//#line 2735
final double X10_TEMP466 =
              (X10_TEMP1738);
            
//#line 2736
final double X10_TEMP1741 =
              (X10_TEMP466);
            
//#line 2738
final double X10_TEMP467 =
              (X10_TEMP1741);
            
//#line 2739
final double X10_TEMP1744 =
              (X10_TEMP467);
            
//#line 2741
final double X10_TEMP1747 =
              (X10_TEMP1744);
            
//#line 2742
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1747));
        }/* } */
        }
        /* } */
        
        
//#line 2744
final double X10_TEMP1749 =
          (0.0);
        
//#line 2746
final double X10_TEMP469 =
          (X10_TEMP1749);
        
//#line 2747
final double X10_TEMP1752 =
          (X10_TEMP469);
        
//#line 2749
sp =
          ((X10_TEMP1752));
        
//#line 2750
final int X10_TEMP1755 =
          (0);
        
//#line 2752
final int X10_TEMP474 =
          (X10_TEMP1755);
        
//#line 2753
final int X10_TEMP1758 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2755
final int X10_TEMP471 =
          (X10_TEMP1758);
        
//#line 2756
final int X10_TEMP1761 =
          (1);
        
//#line 2758
final int X10_TEMP472 =
          (X10_TEMP1761);
        
//#line 2759
final int X10_TEMP1764 =
          (X10_TEMP471 -
             X10_TEMP472);
        
//#line 2761
final int X10_TEMP475 =
          (X10_TEMP1764);
        
//#line 2762
final x10.
          lang.
          region X10_TEMP1769 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP474,
                  X10_TEMP475))));
        
//#line 2764
final x10.
          lang.
          region X10_TEMP477 =
          (x10.
            lang.
            region)
            ((X10_TEMP1769));
        
//#line 2765
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP477).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2766
final x10.
              lang.
              GenericReferenceArray X10_TEMP1773 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2768
final x10.
              lang.
              GenericReferenceArray X10_TEMP478 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1773));
            
//#line 2769
final Particle X10_TEMP1777 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP478).get(i))/* } */))/* } */);
            
//#line 2771
final Particle X10_TEMP480 =
              (X10_TEMP1777);
            
//#line 2772
final double X10_TEMP1780 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP480))/* } */.zvelocity);
            
//#line 2774
final double X10_TEMP481 =
              (X10_TEMP1780);
            
//#line 2775
final double X10_TEMP1783 =
              (sp +
                 X10_TEMP481);
            
//#line 2777
final double X10_TEMP483 =
              (X10_TEMP1783);
            
//#line 2778
final double X10_TEMP1786 =
              (X10_TEMP483);
            
//#line 2780
sp =
              ((X10_TEMP1786));
        }/* } */
        }
        /* } */
        
        
//#line 2782
final int X10_TEMP1789 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2784
final int X10_TEMP484 =
          (X10_TEMP1789);
        
//#line 2785
final double X10_TEMP1792 =
          (sp /
             X10_TEMP484);
        
//#line 2787
final double X10_TEMP486 =
          (X10_TEMP1792);
        
//#line 2788
final double X10_TEMP1795 =
          (X10_TEMP486);
        
//#line 2790
sp =
          ((X10_TEMP1795));
        
//#line 2791
final int X10_TEMP1798 =
          (0);
        
//#line 2793
final int X10_TEMP491 =
          (X10_TEMP1798);
        
//#line 2794
final int X10_TEMP1801 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2796
final int X10_TEMP488 =
          (X10_TEMP1801);
        
//#line 2797
final int X10_TEMP1804 =
          (1);
        
//#line 2799
final int X10_TEMP489 =
          (X10_TEMP1804);
        
//#line 2800
final int X10_TEMP1807 =
          (X10_TEMP488 -
             X10_TEMP489);
        
//#line 2802
final int X10_TEMP492 =
          (X10_TEMP1807);
        
//#line 2803
final x10.
          lang.
          region X10_TEMP1812 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP491,
                  X10_TEMP492))));
        
//#line 2805
final x10.
          lang.
          region X10_TEMP494 =
          (x10.
            lang.
            region)
            ((X10_TEMP1812));
        
//#line 2806
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP494).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2807
final x10.
              lang.
              GenericReferenceArray X10_TEMP1816 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2809
final x10.
              lang.
              GenericReferenceArray X10_TEMP495 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1816));
            
//#line 2810
final Particle X10_TEMP1820 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP495).get(i))/* } */))/* } */);
            
//#line 2812
final Particle X10_TEMP497 =
              (X10_TEMP1820);
            
//#line 2813
final x10.
              lang.
              GenericReferenceArray X10_TEMP1823 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2815
final x10.
              lang.
              GenericReferenceArray X10_TEMP498 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1823));
            
//#line 2816
final Particle X10_TEMP1827 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP498).get(i))/* } */))/* } */);
            
//#line 2818
final Particle X10_TEMP500 =
              (X10_TEMP1827);
            
//#line 2819
final double X10_TEMP1830 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP500))/* } */.zvelocity);
            
//#line 2821
final double X10_TEMP501 =
              (X10_TEMP1830);
            
//#line 2822
final double X10_TEMP1833 =
              (X10_TEMP501 -
                 sp);
            
//#line 2824
final double X10_TEMP504 =
              (X10_TEMP1833);
            
//#line 2825
final double X10_TEMP1836 =
              (X10_TEMP504);
            
//#line 2827
final double X10_TEMP505 =
              (X10_TEMP1836);
            
//#line 2828
final double X10_TEMP1839 =
              (X10_TEMP505);
            
//#line 2830
final double X10_TEMP1842 =
              (X10_TEMP1839);
            
//#line 2831
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP497))/* } */.zvelocity =
              ((X10_TEMP1842));
            
//#line 2832
final double X10_TEMP1844 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 2834
final double X10_TEMP514 =
              (X10_TEMP1844);
            
//#line 2835
final x10.
              lang.
              GenericReferenceArray X10_TEMP1847 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2837
final x10.
              lang.
              GenericReferenceArray X10_TEMP506 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1847));
            
//#line 2838
final Particle X10_TEMP1851 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP506).get(i))/* } */))/* } */);
            
//#line 2840
final Particle X10_TEMP508 =
              (X10_TEMP1851);
            
//#line 2841
final double X10_TEMP1854 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP508))/* } */.zvelocity);
            
//#line 2843
final double X10_TEMP512 =
              (X10_TEMP1854);
            
//#line 2844
final x10.
              lang.
              GenericReferenceArray X10_TEMP1857 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2846
final x10.
              lang.
              GenericReferenceArray X10_TEMP509 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1857));
            
//#line 2847
final Particle X10_TEMP1861 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP509).get(i))/* } */))/* } */);
            
//#line 2849
final Particle X10_TEMP511 =
              (X10_TEMP1861);
            
//#line 2850
final double X10_TEMP1864 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP511))/* } */.zvelocity);
            
//#line 2852
final double X10_TEMP513 =
              (X10_TEMP1864);
            
//#line 2853
final double X10_TEMP1867 =
              (X10_TEMP512 *
                 X10_TEMP513);
            
//#line 2855
final double X10_TEMP515 =
              (X10_TEMP1867);
            
//#line 2856
final double X10_TEMP1870 =
              (X10_TEMP514 +
                 X10_TEMP515);
            
//#line 2858
final double X10_TEMP518 =
              (X10_TEMP1870);
            
//#line 2859
final double X10_TEMP1873 =
              (X10_TEMP518);
            
//#line 2861
final double X10_TEMP519 =
              (X10_TEMP1873);
            
//#line 2862
final double X10_TEMP1876 =
              (X10_TEMP519);
            
//#line 2864
final double X10_TEMP1879 =
              (X10_TEMP1876);
            
//#line 2865
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP1879));
        }/* } */
        }
        /* } */
        
        
//#line 2867
final double X10_TEMP1881 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
        
//#line 2869
final double X10_TEMP520 =
          (X10_TEMP1881);
        
//#line 2870
final double X10_TEMP1884 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
        
//#line 2872
final double X10_TEMP521 =
          (X10_TEMP1884);
        
//#line 2873
final double X10_TEMP1887 =
          (X10_TEMP520 *
             X10_TEMP521);
        
//#line 2875
double ts =
          (X10_TEMP1887);
        
//#line 2876
final double X10_TEMP1890 =
          (_Program__md_tref /
             ts);
        
//#line 2878
final double X10_TEMP524 =
          (X10_TEMP1890);
        
//#line 2879
final double X10_TEMP1894 =
          (java.
             lang.
             Math.
             sqrt(
             X10_TEMP524));
        
//#line 2881
final double X10_TEMP525 =
          (X10_TEMP1894);
        
//#line 2882
final double X10_TEMP1897 =
          (_Program__md_h *
             X10_TEMP525);
        
//#line 2884
final double X10_TEMP528 =
          (X10_TEMP1897);
        
//#line 2885
final double X10_TEMP1900 =
          (X10_TEMP528);
        
//#line 2887
final double X10_TEMP529 =
          (X10_TEMP1900);
        
//#line 2888
final double X10_TEMP1903 =
          (X10_TEMP529);
        
//#line 2890
final double X10_TEMP1906 =
          (X10_TEMP1903);
        
//#line 2891
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc =
          ((X10_TEMP1906));
        
//#line 2892
final int X10_TEMP1908 =
          (0);
        
//#line 2894
final int X10_TEMP534 =
          (X10_TEMP1908);
        
//#line 2895
final int X10_TEMP1911 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 2897
final int X10_TEMP531 =
          (X10_TEMP1911);
        
//#line 2898
final int X10_TEMP1914 =
          (1);
        
//#line 2900
final int X10_TEMP532 =
          (X10_TEMP1914);
        
//#line 2901
final int X10_TEMP1917 =
          (X10_TEMP531 -
             X10_TEMP532);
        
//#line 2903
final int X10_TEMP535 =
          (X10_TEMP1917);
        
//#line 2904
final x10.
          lang.
          region X10_TEMP1922 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP534,
                  X10_TEMP535))));
        
//#line 2906
final x10.
          lang.
          region X10_TEMP537 =
          (x10.
            lang.
            region)
            ((X10_TEMP1922));
        
//#line 2907
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP537).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 2908
final x10.
              lang.
              GenericReferenceArray X10_TEMP1926 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2910
final x10.
              lang.
              GenericReferenceArray X10_TEMP538 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1926));
            
//#line 2911
final Particle X10_TEMP1930 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP538).get(i))/* } */))/* } */);
            
//#line 2913
final Particle X10_TEMP540 =
              (X10_TEMP1930);
            
//#line 2914
final x10.
              lang.
              GenericReferenceArray X10_TEMP1933 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2916
final x10.
              lang.
              GenericReferenceArray X10_TEMP541 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1933));
            
//#line 2917
final Particle X10_TEMP1937 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP541).get(i))/* } */))/* } */);
            
//#line 2919
final Particle X10_TEMP543 =
              (X10_TEMP1937);
            
//#line 2920
final double X10_TEMP1940 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP543))/* } */.xvelocity);
            
//#line 2922
final double X10_TEMP544 =
              (X10_TEMP1940);
            
//#line 2923
final double X10_TEMP1943 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 2925
final double X10_TEMP545 =
              (X10_TEMP1943);
            
//#line 2926
final double X10_TEMP1946 =
              (X10_TEMP544 *
                 X10_TEMP545);
            
//#line 2928
final double X10_TEMP548 =
              (X10_TEMP1946);
            
//#line 2929
final double X10_TEMP1949 =
              (X10_TEMP548);
            
//#line 2931
final double X10_TEMP549 =
              (X10_TEMP1949);
            
//#line 2932
final double X10_TEMP1952 =
              (X10_TEMP549);
            
//#line 2934
final double X10_TEMP1955 =
              (X10_TEMP1952);
            
//#line 2935
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP540))/* } */.xvelocity =
              ((X10_TEMP1955));
            
//#line 2936
final x10.
              lang.
              GenericReferenceArray X10_TEMP1957 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2938
final x10.
              lang.
              GenericReferenceArray X10_TEMP550 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1957));
            
//#line 2939
final Particle X10_TEMP1961 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP550).get(i))/* } */))/* } */);
            
//#line 2941
final Particle X10_TEMP552 =
              (X10_TEMP1961);
            
//#line 2942
final x10.
              lang.
              GenericReferenceArray X10_TEMP1964 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2944
final x10.
              lang.
              GenericReferenceArray X10_TEMP553 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1964));
            
//#line 2945
final Particle X10_TEMP1968 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP553).get(i))/* } */))/* } */);
            
//#line 2947
final Particle X10_TEMP555 =
              (X10_TEMP1968);
            
//#line 2948
final double X10_TEMP1971 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP555))/* } */.yvelocity);
            
//#line 2950
final double X10_TEMP556 =
              (X10_TEMP1971);
            
//#line 2951
final double X10_TEMP1974 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 2953
final double X10_TEMP557 =
              (X10_TEMP1974);
            
//#line 2954
final double X10_TEMP1977 =
              (X10_TEMP556 *
                 X10_TEMP557);
            
//#line 2956
final double X10_TEMP560 =
              (X10_TEMP1977);
            
//#line 2957
final double X10_TEMP1980 =
              (X10_TEMP560);
            
//#line 2959
final double X10_TEMP561 =
              (X10_TEMP1980);
            
//#line 2960
final double X10_TEMP1983 =
              (X10_TEMP561);
            
//#line 2962
final double X10_TEMP1986 =
              (X10_TEMP1983);
            
//#line 2963
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP552))/* } */.yvelocity =
              ((X10_TEMP1986));
            
//#line 2964
final x10.
              lang.
              GenericReferenceArray X10_TEMP1988 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2966
final x10.
              lang.
              GenericReferenceArray X10_TEMP562 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1988));
            
//#line 2967
final Particle X10_TEMP1992 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP562).get(i))/* } */))/* } */);
            
//#line 2969
final Particle X10_TEMP564 =
              (X10_TEMP1992);
            
//#line 2970
final x10.
              lang.
              GenericReferenceArray X10_TEMP1995 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 2972
final x10.
              lang.
              GenericReferenceArray X10_TEMP565 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP1995));
            
//#line 2973
final Particle X10_TEMP1999 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP565).get(i))/* } */))/* } */);
            
//#line 2975
final Particle X10_TEMP567 =
              (X10_TEMP1999);
            
//#line 2976
final double X10_TEMP2002 =
              (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP567))/* } */.zvelocity);
            
//#line 2978
final double X10_TEMP568 =
              (X10_TEMP2002);
            
//#line 2979
final double X10_TEMP2005 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
            
//#line 2981
final double X10_TEMP569 =
              (X10_TEMP2005);
            
//#line 2982
final double X10_TEMP2008 =
              (X10_TEMP568 *
                 X10_TEMP569);
            
//#line 2984
final double X10_TEMP572 =
              (X10_TEMP2008);
            
//#line 2985
final double X10_TEMP2011 =
              (X10_TEMP572);
            
//#line 2987
final double X10_TEMP573 =
              (X10_TEMP2011);
            
//#line 2988
final double X10_TEMP2014 =
              (X10_TEMP573);
            
//#line 2990
final double X10_TEMP2017 =
              (X10_TEMP2014);
            
//#line 2991
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP564))/* } */.zvelocity =
              ((X10_TEMP2017));
        }/* } */
        }
        /* } */
        
    }
    
    
//#line 2994
public static void
                    Program_md_runiters1(
                    final md X10_TEMP0) {
        
//#line 2995
final int X10_TEMP576 =
          (0);
        
//#line 2997
final int X10_TEMP5 =
          (X10_TEMP576);
        
//#line 2998
final int X10_TEMP579 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3000
final int X10_TEMP2 =
          (X10_TEMP579);
        
//#line 3001
final int X10_TEMP582 =
          (1);
        
//#line 3003
final int X10_TEMP3 =
          (X10_TEMP582);
        
//#line 3004
final int X10_TEMP585 =
          (X10_TEMP2 -
             X10_TEMP3);
        
//#line 3006
final int X10_TEMP6 =
          (X10_TEMP585);
        
//#line 3007
final x10.
          lang.
          region X10_TEMP590 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP5,
                  X10_TEMP6))));
        
//#line 3009
final x10.
          lang.
          region X10_TEMP8 =
          (x10.
            lang.
            region)
            ((X10_TEMP590));
        
//#line 3010
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP8).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 3011
final x10.
              lang.
              GenericReferenceArray X10_TEMP594 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 3013
final x10.
              lang.
              GenericReferenceArray X10_TEMP9 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP594));
            
//#line 3014
final Particle X10_TEMP598 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP9).get(i))/* } */))/* } */);
            
//#line 3016
final Particle X10_TEMP11 =
              (X10_TEMP598);
            
//#line 3017
final double X10_TEMP601 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
            
//#line 3019
final double X10_TEMP13 =
              (X10_TEMP601);
            
//#line 3020
Program0.
                            Program_Particle_domove(
                            X10_TEMP11,
                            X10_TEMP13);
        }/* } */
        }
        /* } */
        
        
//#line 3022
final double X10_TEMP606 =
          (0.0);
        
//#line 3024
final double X10_TEMP16 =
          (X10_TEMP606);
        
//#line 3025
final double X10_TEMP609 =
          (X10_TEMP16);
        
//#line 3027
final double X10_TEMP17 =
          (X10_TEMP609);
        
//#line 3028
final double X10_TEMP612 =
          (X10_TEMP17);
        
//#line 3030
final double X10_TEMP615 =
          (X10_TEMP612);
        
//#line 3031
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
          ((X10_TEMP615));
        
//#line 3032
final double X10_TEMP617 =
          (0.0);
        
//#line 3034
final double X10_TEMP20 =
          (X10_TEMP617);
        
//#line 3035
final double X10_TEMP620 =
          (X10_TEMP20);
        
//#line 3037
final double X10_TEMP21 =
          (X10_TEMP620);
        
//#line 3038
final double X10_TEMP623 =
          (X10_TEMP21);
        
//#line 3040
final double X10_TEMP626 =
          (X10_TEMP623);
        
//#line 3041
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir =
          ((X10_TEMP626));
        
//#line 3042
final int X10_TEMP628 =
          (0);
        
//#line 3044
final int X10_TEMP22 =
          (X10_TEMP628);
        
//#line 3045
final int X10_TEMP631 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk);
        
//#line 3047
final int X10_TEMP23 =
          (X10_TEMP631);
        
//#line 3048
final int X10_TEMP634 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 3050
int i =
          (X10_TEMP634);
        
//#line 3051
final int X10_TEMP637 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3053
final int X10_TEMP25 =
          (X10_TEMP637);
        
//#line 3054
boolean X10_TEMP29 =
          (i <
             X10_TEMP25);
        
//#line 3055
boolean X10_TEMP642 =
          X10_TEMP29;
        
//#line 3056
while (X10_TEMP642) {
            
//#line 3057
final x10.
              lang.
              GenericReferenceArray X10_TEMP644 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 3059
final x10.
              lang.
              GenericReferenceArray X10_TEMP30 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP644));
            
//#line 3060
final Particle X10_TEMP648 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP30).get(i))/* } */))/* } */);
            
//#line 3062
final Particle X10_TEMP32 =
              (X10_TEMP648);
            
//#line 3063
final double X10_TEMP651 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.side);
            
//#line 3065
final double X10_TEMP38 =
              (X10_TEMP651);
            
//#line 3066
final double X10_TEMP654 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rcoff);
            
//#line 3068
final double X10_TEMP39 =
              (X10_TEMP654);
            
//#line 3069
final int X10_TEMP657 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3071
final int X10_TEMP40 =
              (X10_TEMP657);
            
//#line 3072
Program0.
                            Program_Particle_force(
                            X10_TEMP32,
                            X10_TEMP38,
                            X10_TEMP39,
                            X10_TEMP40,
                            i,
                            X10_TEMP0);
            
//#line 3073
final int X10_TEMP666 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.nprocess);
            
//#line 3075
final int X10_TEMP42 =
              (X10_TEMP666);
            
//#line 3076
final int X10_TEMP669 =
              (i +
                 X10_TEMP42);
            
//#line 3078
i =
              ((X10_TEMP669));
            
//#line 3079
final int X10_TEMP672 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3081
final int X10_TEMP27 =
              (X10_TEMP672);
            
//#line 3082
final boolean X10_TEMP675 =
              (i <
                 X10_TEMP27);
            
//#line 3083
X10_TEMP29 =
              ((X10_TEMP675));
            
//#line 3084
X10_TEMP642 =
              X10_TEMP29;
        }
    }
    
    
//#line 3087
public static void
                    Program_md_runiters2(
                    final md X10_TEMP0,
                    final x10.
                      lang.
                      GenericReferenceArray P) {
        
//#line 3088
Program0.
                        Program_md_allreduce(
                        X10_TEMP0,
                        P);
    }
    
    
//#line 3090
public static void
                    Program_md_runiters3(
                    final md X10_TEMP0,
                    final int move) {
        
//#line 3091
final double X10_TEMP576 =
          (0.0);
        
//#line 3093
double summation =
          (X10_TEMP576);
        
//#line 3094
final int X10_TEMP579 =
          (0);
        
//#line 3096
final int X10_TEMP6 =
          (X10_TEMP579);
        
//#line 3097
final int X10_TEMP582 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3099
final int X10_TEMP3 =
          (X10_TEMP582);
        
//#line 3100
final int X10_TEMP585 =
          (1);
        
//#line 3102
final int X10_TEMP4 =
          (X10_TEMP585);
        
//#line 3103
final int X10_TEMP588 =
          (X10_TEMP3 -
             X10_TEMP4);
        
//#line 3105
final int X10_TEMP7 =
          (X10_TEMP588);
        
//#line 3106
final x10.
          lang.
          region X10_TEMP593 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP6,
                  X10_TEMP7))));
        
//#line 3108
final x10.
          lang.
          region X10_TEMP9 =
          (x10.
            lang.
            region)
            ((X10_TEMP593));
        
//#line 3109
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP9).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 3110
final x10.
              lang.
              GenericReferenceArray X10_TEMP597 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 3112
final x10.
              lang.
              GenericReferenceArray X10_TEMP10 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP597));
            
//#line 3113
final Particle X10_TEMP601 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP10).get(i))/* } */))/* } */);
            
//#line 3115
final Particle X10_TEMP12 =
              (X10_TEMP601);
            
//#line 3116
final double X10_TEMP604 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq2);
            
//#line 3118
final double X10_TEMP14 =
              (X10_TEMP604);
            
//#line 3119
final double X10_TEMP609 =
              (Program0.
                 Program_Particle_mkekin(
                 X10_TEMP12,
                 X10_TEMP14));
            
//#line 3121
final double X10_TEMP15 =
              (X10_TEMP609);
            
//#line 3122
final double X10_TEMP612 =
              (summation +
                 X10_TEMP15);
            
//#line 3124
final double X10_TEMP17 =
              (X10_TEMP612);
            
//#line 3125
final double X10_TEMP615 =
              (X10_TEMP17);
            
//#line 3127
summation =
              ((X10_TEMP615));
        }/* } */
        }
        /* } */
        
        
//#line 3129
final double X10_TEMP618 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.hsq);
        
//#line 3131
final double X10_TEMP18 =
          (X10_TEMP618);
        
//#line 3132
final double X10_TEMP621 =
          (summation /
             X10_TEMP18);
        
//#line 3134
final double X10_TEMP21 =
          (X10_TEMP621);
        
//#line 3135
final double X10_TEMP624 =
          (X10_TEMP21);
        
//#line 3137
final double X10_TEMP22 =
          (X10_TEMP624);
        
//#line 3138
final double X10_TEMP627 =
          (X10_TEMP22);
        
//#line 3140
final double X10_TEMP630 =
          (X10_TEMP627);
        
//#line 3141
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
          ((X10_TEMP630));
        
//#line 3142
final double X10_TEMP632 =
          (0.0);
        
//#line 3144
double vel =
          (X10_TEMP632);
        
//#line 3145
final double X10_TEMP635 =
          (0.0);
        
//#line 3147
final double X10_TEMP26 =
          (X10_TEMP635);
        
//#line 3148
final double X10_TEMP638 =
          (X10_TEMP26);
        
//#line 3150
final double X10_TEMP27 =
          (X10_TEMP638);
        
//#line 3151
final double X10_TEMP641 =
          (X10_TEMP27);
        
//#line 3153
final double X10_TEMP644 =
          (X10_TEMP641);
        
//#line 3154
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.count =
          ((X10_TEMP644));
        
//#line 3155
final int X10_TEMP646 =
          (0);
        
//#line 3157
final int X10_TEMP32 =
          (X10_TEMP646);
        
//#line 3158
final int X10_TEMP649 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3160
final int X10_TEMP29 =
          (X10_TEMP649);
        
//#line 3161
final int X10_TEMP652 =
          (1);
        
//#line 3163
final int X10_TEMP30 =
          (X10_TEMP652);
        
//#line 3164
final int X10_TEMP655 =
          (X10_TEMP29 -
             X10_TEMP30);
        
//#line 3166
final int X10_TEMP33 =
          (X10_TEMP655);
        
//#line 3167
final x10.
          lang.
          region X10_TEMP660 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP32,
                  X10_TEMP33))));
        
//#line 3169
final x10.
          lang.
          region X10_TEMP35 =
          (x10.
            lang.
            region)
            ((X10_TEMP660));
        
//#line 3170
/* template:forloop { */
        for (java.util.Iterator i__ = (X10_TEMP35).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 3171
final x10.
              lang.
              GenericReferenceArray X10_TEMP664 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
            
//#line 3173
final x10.
              lang.
              GenericReferenceArray X10_TEMP36 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP664));
            
//#line 3174
final Particle X10_TEMP668 =
              (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP36).get(i))/* } */))/* } */);
            
//#line 3176
final Particle X10_TEMP38 =
              (X10_TEMP668);
            
//#line 3177
final double X10_TEMP671 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vaverh);
            
//#line 3179
final double X10_TEMP42 =
              (X10_TEMP671);
            
//#line 3180
final double X10_TEMP678 =
              (Program0.
                 Program_Particle_velavg(
                 X10_TEMP38,
                 X10_TEMP42,
                 _Program__md_h,
                 X10_TEMP0));
            
//#line 3182
final double X10_TEMP43 =
              (X10_TEMP678);
            
//#line 3183
final double X10_TEMP681 =
              (vel +
                 X10_TEMP43);
            
//#line 3185
final double X10_TEMP45 =
              (X10_TEMP681);
            
//#line 3186
final double X10_TEMP684 =
              (X10_TEMP45);
            
//#line 3188
vel =
              ((X10_TEMP684));
        }/* } */
        }
        /* } */
        
        
//#line 3190
final double X10_TEMP687 =
          (vel /
             _Program__md_h);
        
//#line 3192
final double X10_TEMP47 =
          (X10_TEMP687);
        
//#line 3193
final double X10_TEMP690 =
          (X10_TEMP47);
        
//#line 3195
vel =
          ((X10_TEMP690));
        
//#line 3196
final boolean X10_TEMP693 =
          (move <
             _Program__md_istop);
        
//#line 3198
final boolean X10_TEMP49 =
          (X10_TEMP693);
        
//#line 3199
final int X10_TEMP696 =
          (1);
        
//#line 3201
final int X10_TEMP50 =
          (X10_TEMP696);
        
//#line 3202
final int X10_TEMP699 =
          (move +
             X10_TEMP50);
        
//#line 3204
final int X10_TEMP52 =
          (X10_TEMP699);
        
//#line 3205
final int X10_TEMP702 =
          (X10_TEMP52 %
             _Program__md_irep);
        
//#line 3207
final int X10_TEMP54 =
          (X10_TEMP702);
        
//#line 3208
final int X10_TEMP705 =
          (0);
        
//#line 3210
final int X10_TEMP55 =
          (X10_TEMP705);
        
//#line 3211
final boolean X10_TEMP708 =
          (X10_TEMP54 ==
             X10_TEMP55);
        
//#line 3213
final boolean X10_TEMP57 =
          (X10_TEMP708);
        
//#line 3214
final boolean X10_TEMP59 =
          (X10_TEMP49 &&
             X10_TEMP57);
        
//#line 3215
if (X10_TEMP59) {
            
//#line 3216
final double X10_TEMP713 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 3218
final double X10_TEMP60 =
              (X10_TEMP713);
            
//#line 3219
final double X10_TEMP716 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 3221
final double X10_TEMP61 =
              (X10_TEMP716);
            
//#line 3222
final double X10_TEMP719 =
              (X10_TEMP60 *
                 X10_TEMP61);
            
//#line 3224
final double X10_TEMP63 =
              (X10_TEMP719);
            
//#line 3225
final double X10_TEMP722 =
              (_Program__md_tref /
                 X10_TEMP63);
            
//#line 3227
final double X10_TEMP65 =
              (X10_TEMP722);
            
//#line 3228
final double X10_TEMP726 =
              (java.
                 lang.
                 Math.
                 sqrt(
                 X10_TEMP65));
            
//#line 3230
final double X10_TEMP68 =
              (X10_TEMP726);
            
//#line 3231
final double X10_TEMP729 =
              (X10_TEMP68);
            
//#line 3233
final double X10_TEMP69 =
              (X10_TEMP729);
            
//#line 3234
final double X10_TEMP732 =
              (X10_TEMP69);
            
//#line 3236
final double X10_TEMP735 =
              (X10_TEMP732);
            
//#line 3237
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc =
              ((X10_TEMP735));
            
//#line 3238
final int X10_TEMP737 =
              (0);
            
//#line 3240
final int X10_TEMP74 =
              (X10_TEMP737);
            
//#line 3241
final int X10_TEMP740 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3243
final int X10_TEMP71 =
              (X10_TEMP740);
            
//#line 3244
final int X10_TEMP743 =
              (1);
            
//#line 3246
final int X10_TEMP72 =
              (X10_TEMP743);
            
//#line 3247
final int X10_TEMP746 =
              (X10_TEMP71 -
                 X10_TEMP72);
            
//#line 3249
final int X10_TEMP75 =
              (X10_TEMP746);
            
//#line 3250
final x10.
              lang.
              region X10_TEMP751 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP74,
                      X10_TEMP75))));
            
//#line 3252
final x10.
              lang.
              region X10_TEMP77 =
              (x10.
                lang.
                region)
                ((X10_TEMP751));
            
//#line 3253
/* template:forloop { */
            for (java.util.Iterator i__ = (X10_TEMP77).iterator(); i__.hasNext(); ) {
            	final  x10.
              lang.
              point i = (x10.
              lang.
              point) i__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 3254
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP755 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.one));
                
//#line 3256
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP78 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP755));
                
//#line 3257
final Particle X10_TEMP759 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP78).get(i))/* } */))/* } */);
                
//#line 3259
final Particle X10_TEMP80 =
                  (X10_TEMP759);
                
//#line 3260
final double X10_TEMP762 =
                  (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.sc);
                
//#line 3262
final double X10_TEMP83 =
                  (X10_TEMP762);
                
//#line 3263
final int X10_TEMP765 =
                  (1);
                
//#line 3265
final int X10_TEMP84 =
                  (X10_TEMP765);
                
//#line 3266
Program0.
                                Program_Particle_dscal(
                                X10_TEMP80,
                                X10_TEMP83,
                                X10_TEMP84);
            }/* } */
            }
            /* } */
            
            
//#line 3268
final double X10_TEMP771 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 3270
final double X10_TEMP85 =
              (X10_TEMP771);
            
//#line 3271
final double X10_TEMP774 =
              (_Program__md_tref /
                 X10_TEMP85);
            
//#line 3273
final double X10_TEMP88 =
              (X10_TEMP774);
            
//#line 3274
final double X10_TEMP777 =
              (X10_TEMP88);
            
//#line 3276
final double X10_TEMP89 =
              (X10_TEMP777);
            
//#line 3277
final double X10_TEMP780 =
              (X10_TEMP89);
            
//#line 3279
final double X10_TEMP783 =
              (X10_TEMP780);
            
//#line 3280
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin =
              ((X10_TEMP783));
        }
        
//#line 3282
final int X10_TEMP785 =
          (1);
        
//#line 3284
final int X10_TEMP90 =
          (X10_TEMP785);
        
//#line 3285
final int X10_TEMP788 =
          (move +
             X10_TEMP90);
        
//#line 3287
final int X10_TEMP92 =
          (X10_TEMP788);
        
//#line 3288
final int X10_TEMP791 =
          (X10_TEMP92 %
             _Program__md_iprint);
        
//#line 3290
final int X10_TEMP94 =
          (X10_TEMP791);
        
//#line 3291
final int X10_TEMP794 =
          (0);
        
//#line 3293
final int X10_TEMP95 =
          (X10_TEMP794);
        
//#line 3294
final boolean X10_TEMP97 =
          (X10_TEMP94 ==
             X10_TEMP95);
        
//#line 3295
if (X10_TEMP97) {
            
//#line 3296
final double X10_TEMP799 =
              (24.0);
            
//#line 3298
final double X10_TEMP98 =
              (X10_TEMP799);
            
//#line 3299
final double X10_TEMP802 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 3301
final double X10_TEMP99 =
              (X10_TEMP802);
            
//#line 3302
final double X10_TEMP805 =
              (X10_TEMP98 *
                 X10_TEMP99);
            
//#line 3304
final double X10_TEMP102 =
              (X10_TEMP805);
            
//#line 3305
final double X10_TEMP808 =
              (X10_TEMP102);
            
//#line 3307
final double X10_TEMP103 =
              (X10_TEMP808);
            
//#line 3308
final double X10_TEMP811 =
              (X10_TEMP103);
            
//#line 3310
final double X10_TEMP814 =
              (X10_TEMP811);
            
//#line 3311
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ek =
              ((X10_TEMP814));
            
//#line 3312
final double X10_TEMP816 =
              (4.0);
            
//#line 3314
final double X10_TEMP104 =
              (X10_TEMP816);
            
//#line 3315
final double X10_TEMP819 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot);
            
//#line 3317
final double X10_TEMP105 =
              (X10_TEMP819);
            
//#line 3318
final double X10_TEMP822 =
              (X10_TEMP104 *
                 X10_TEMP105);
            
//#line 3320
final double X10_TEMP108 =
              (X10_TEMP822);
            
//#line 3321
final double X10_TEMP825 =
              (X10_TEMP108);
            
//#line 3323
final double X10_TEMP109 =
              (X10_TEMP825);
            
//#line 3324
final double X10_TEMP828 =
              (X10_TEMP109);
            
//#line 3326
final double X10_TEMP831 =
              (X10_TEMP828);
            
//#line 3327
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot =
              ((X10_TEMP831));
            
//#line 3328
final double X10_TEMP833 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ek);
            
//#line 3330
final double X10_TEMP110 =
              (X10_TEMP833);
            
//#line 3331
final double X10_TEMP836 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.epot);
            
//#line 3333
final double X10_TEMP111 =
              (X10_TEMP836);
            
//#line 3334
final double X10_TEMP839 =
              (X10_TEMP110 +
                 X10_TEMP111);
            
//#line 3336
final double X10_TEMP114 =
              (X10_TEMP839);
            
//#line 3337
final double X10_TEMP842 =
              (X10_TEMP114);
            
//#line 3339
final double X10_TEMP115 =
              (X10_TEMP842);
            
//#line 3340
final double X10_TEMP845 =
              (X10_TEMP115);
            
//#line 3342
final double X10_TEMP848 =
              (X10_TEMP845);
            
//#line 3343
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.etot =
              ((X10_TEMP848));
            
//#line 3344
final double X10_TEMP850 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.tscale);
            
//#line 3346
final double X10_TEMP116 =
              (X10_TEMP850);
            
//#line 3347
final double X10_TEMP853 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 3349
final double X10_TEMP117 =
              (X10_TEMP853);
            
//#line 3350
final double X10_TEMP856 =
              (X10_TEMP116 *
                 X10_TEMP117);
            
//#line 3352
final double X10_TEMP120 =
              (X10_TEMP856);
            
//#line 3353
final double X10_TEMP859 =
              (X10_TEMP120);
            
//#line 3355
final double X10_TEMP121 =
              (X10_TEMP859);
            
//#line 3356
final double X10_TEMP862 =
              (X10_TEMP121);
            
//#line 3358
final double X10_TEMP865 =
              (X10_TEMP862);
            
//#line 3359
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.temp =
              ((X10_TEMP865));
            
//#line 3360
final double X10_TEMP867 =
              (16.0);
            
//#line 3362
final double X10_TEMP122 =
              (X10_TEMP867);
            
//#line 3363
final double X10_TEMP870 =
              (_Program__md_den *
                 X10_TEMP122);
            
//#line 3365
final double X10_TEMP127 =
              (X10_TEMP870);
            
//#line 3366
final double X10_TEMP873 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.ekin);
            
//#line 3368
final double X10_TEMP123 =
              (X10_TEMP873);
            
//#line 3369
final double X10_TEMP876 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.vir);
            
//#line 3371
final double X10_TEMP124 =
              (X10_TEMP876);
            
//#line 3372
final double X10_TEMP879 =
              (X10_TEMP123 -
                 X10_TEMP124);
            
//#line 3374
final double X10_TEMP126 =
              (X10_TEMP879);
            
//#line 3375
final double X10_TEMP882 =
              (X10_TEMP127 *
                 X10_TEMP126);
            
//#line 3377
final double X10_TEMP128 =
              (X10_TEMP882);
            
//#line 3378
final int X10_TEMP885 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3380
final int X10_TEMP129 =
              (X10_TEMP885);
            
//#line 3381
final double X10_TEMP888 =
              (X10_TEMP128 /
                 X10_TEMP129);
            
//#line 3383
final double X10_TEMP132 =
              (X10_TEMP888);
            
//#line 3384
final double X10_TEMP891 =
              (X10_TEMP132);
            
//#line 3386
final double X10_TEMP133 =
              (X10_TEMP891);
            
//#line 3387
final double X10_TEMP894 =
              (X10_TEMP133);
            
//#line 3389
final double X10_TEMP897 =
              (X10_TEMP894);
            
//#line 3390
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.pres =
              ((X10_TEMP897));
            
//#line 3391
final int X10_TEMP899 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3393
final int X10_TEMP134 =
              (X10_TEMP899);
            
//#line 3394
final double X10_TEMP902 =
              (vel /
                 X10_TEMP134);
            
//#line 3396
final double X10_TEMP136 =
              (X10_TEMP902);
            
//#line 3397
final double X10_TEMP905 =
              (X10_TEMP136);
            
//#line 3399
vel =
              ((X10_TEMP905));
            
//#line 3400
final double X10_TEMP908 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.count);
            
//#line 3402
final double X10_TEMP137 =
              (X10_TEMP908);
            
//#line 3403
final int X10_TEMP911 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3405
final int X10_TEMP138 =
              (X10_TEMP911);
            
//#line 3406
final double X10_TEMP914 =
              (X10_TEMP137 /
                 X10_TEMP138);
            
//#line 3408
final double X10_TEMP140 =
              (X10_TEMP914);
            
//#line 3409
final double X10_TEMP917 =
              (100.0);
            
//#line 3411
final double X10_TEMP141 =
              (X10_TEMP917);
            
//#line 3412
final double X10_TEMP920 =
              (X10_TEMP140 *
                 X10_TEMP141);
            
//#line 3414
final double X10_TEMP144 =
              (X10_TEMP920);
            
//#line 3415
final double X10_TEMP923 =
              (X10_TEMP144);
            
//#line 3417
final double X10_TEMP145 =
              (X10_TEMP923);
            
//#line 3418
final double X10_TEMP926 =
              (X10_TEMP145);
            
//#line 3420
final double X10_TEMP929 =
              (X10_TEMP926);
            
//#line 3421
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rp =
              ((X10_TEMP929));
        }
    }
    
    
//#line 3424
public static void
                    Program_md_allreduce(
                    final md X10_TEMP0,
                    final x10.
                      lang.
                      GenericReferenceArray P) {
        
//#line 3425
final int X10_TEMP576 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.rnk);
        
//#line 3427
final int X10_TEMP1 =
          (X10_TEMP576);
        
//#line 3428
final int X10_TEMP579 =
          (0);
        
//#line 3430
final int X10_TEMP2 =
          (X10_TEMP579);
        
//#line 3431
final boolean X10_TEMP4 =
          (X10_TEMP1 !=
             X10_TEMP2);
        
//#line 3432
if (X10_TEMP4) {
            
//#line 3433
return;
        }
        
//#line 3435
final md X10_TEMP584 =
          (new md(
             ));
        
//#line 3437
final md t =
          (X10_TEMP584);
        
//#line 3438
final int X10_TEMP587 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3440
final int X10_TEMP8 =
          (X10_TEMP587);
        
//#line 3441
final int X10_TEMP590 =
          (X10_TEMP8);
        
//#line 3443
final int X10_TEMP9 =
          (X10_TEMP590);
        
//#line 3444
final int X10_TEMP593 =
          (X10_TEMP9);
        
//#line 3446
final int X10_TEMP596 =
          (X10_TEMP593);
        
//#line 3447
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.mdsize =
          ((X10_TEMP596));
        
//#line 3448
final int X10_TEMP598 =
          (0);
        
//#line 3450
final int X10_TEMP14 =
          (X10_TEMP598);
        
//#line 3451
final int X10_TEMP601 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3453
final int X10_TEMP11 =
          (X10_TEMP601);
        
//#line 3454
final int X10_TEMP604 =
          (1);
        
//#line 3456
final int X10_TEMP12 =
          (X10_TEMP604);
        
//#line 3457
final int X10_TEMP607 =
          (X10_TEMP11 -
             X10_TEMP12);
        
//#line 3459
final int X10_TEMP15 =
          (X10_TEMP607);
        
//#line 3460
final x10.
          lang.
          region X10_TEMP612 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP14,
                  X10_TEMP15))));
        
//#line 3462
final x10.
          lang.
          region X10_TEMP16 =
          (x10.
            lang.
            region)
            ((X10_TEMP612));
        
//#line 3463
final x10.
          lang.
          place X10_TEMP615 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3465
final x10.
          lang.
          place X10_TEMP17 =
          (X10_TEMP615);
        
//#line 3466
final x10.
          lang.
          dist X10_TEMP618 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP16,
                X10_TEMP17)));
        
//#line 3468
final x10.
          lang.
          dist dOne =
          (x10.
            lang.
            dist)
            ((X10_TEMP618));
        
//#line 3469
final x10.
          lang.
          GenericReferenceArray X10_TEMP621 =
          (x10.
            lang.
            GenericReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.GenericArray(dOne,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 3471
final x10.
          lang.
          GenericReferenceArray X10_TEMP21 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP621));
        
//#line 3472
final x10.
          lang.
          GenericReferenceArray X10_TEMP624 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP21));
        
//#line 3474
final x10.
          lang.
          GenericReferenceArray X10_TEMP22 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP624));
        
//#line 3475
final x10.
          lang.
          GenericReferenceArray X10_TEMP627 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP22));
        
//#line 3477
final x10.
          lang.
          GenericReferenceArray X10_TEMP630 =
          (x10.
            lang.
            GenericReferenceArray)
            ((X10_TEMP627));
        
//#line 3478
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one =
          ((X10_TEMP630));
        
//#line 3479
final x10.
          lang.
          place X10_TEMP632 =
          (/* template:here { */x10.lang.Runtime.here()/* } */);
        
//#line 3481
final x10.
          lang.
          place tHere =
          (X10_TEMP632);
        
//#line 3482
final int X10_TEMP635 =
          (0);
        
//#line 3484
final int X10_TEMP30 =
          (X10_TEMP635);
        
//#line 3485
final int X10_TEMP638 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3487
final int X10_TEMP25 =
          (X10_TEMP638);
        
//#line 3488
final int X10_TEMP641 =
          (1);
        
//#line 3490
final int X10_TEMP26 =
          (X10_TEMP641);
        
//#line 3491
final int X10_TEMP644 =
          (X10_TEMP25 -
             X10_TEMP26);
        
//#line 3493
final int X10_TEMP28 =
          (X10_TEMP644);
        
//#line 3494
final x10.
          lang.
          region X10_TEMP649 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP30,
                  X10_TEMP28))));
        
//#line 3496
final x10.
          lang.
          region X10_TEMP32 =
          (x10.
            lang.
            region)
            ((X10_TEMP649));
        
//#line 3497
/* template:forloop { */
        for (java.util.Iterator k__ = (X10_TEMP32).iterator(); k__.hasNext(); ) {
        	final  x10.
          lang.
          point k = (x10.
          lang.
          point) k__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 3498
final x10.
              lang.
              GenericReferenceArray X10_TEMP653 =
              (x10.
                lang.
                GenericReferenceArray)
                ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
            
//#line 3500
final x10.
              lang.
              GenericReferenceArray X10_TEMP33 =
              (x10.
                lang.
                GenericReferenceArray)
                ((X10_TEMP653));
            
//#line 3501
final double X10_TEMP656 =
              (0.0);
            
//#line 3503
double X10_TEMP44 =
              (X10_TEMP656);
            
//#line 3504
final double X10_TEMP659 =
              (0.0);
            
//#line 3506
double X10_TEMP45 =
              (X10_TEMP659);
            
//#line 3507
final double X10_TEMP662 =
              (0.0);
            
//#line 3509
double X10_TEMP46 =
              (X10_TEMP662);
            
//#line 3510
final double X10_TEMP665 =
              (0.0);
            
//#line 3512
double X10_TEMP47 =
              (X10_TEMP665);
            
//#line 3513
final double X10_TEMP668 =
              (0.0);
            
//#line 3515
double X10_TEMP48 =
              (X10_TEMP668);
            
//#line 3516
final double X10_TEMP671 =
              (0.0);
            
//#line 3518
double X10_TEMP49 =
              (X10_TEMP671);
            
//#line 3519
final double X10_TEMP674 =
              (0.0);
            
//#line 3521
double X10_TEMP50 =
              (X10_TEMP674);
            
//#line 3522
final double X10_TEMP677 =
              (0.0);
            
//#line 3524
double X10_TEMP51 =
              (X10_TEMP677);
            
//#line 3525
final double X10_TEMP680 =
              (0.0);
            
//#line 3527
double X10_TEMP52 =
              (X10_TEMP680);
            
//#line 3528
final Particle X10_TEMP692 =
              (new Particle(
                 X10_TEMP44,
                 X10_TEMP45,
                 X10_TEMP46,
                 X10_TEMP47,
                 X10_TEMP48,
                 X10_TEMP49,
                 X10_TEMP50,
                 X10_TEMP51,
                 X10_TEMP52));
            
//#line 3530
final Particle X10_TEMP55 =
              (X10_TEMP692);
            
//#line 3531
final Particle X10_TEMP695 =
              (X10_TEMP55);
            
//#line 3533
final Particle X10_TEMP56 =
              (X10_TEMP695);
            
//#line 3534
final Particle X10_TEMP699 =
              (X10_TEMP56);
            
//#line 3536
final Particle X10_TEMP702 =
              (X10_TEMP699);
            
//#line 3537
/* template:array_set { */(X10_TEMP33).set((X10_TEMP702),k)/* } */;
        }/* } */
        }
        /* } */
        
        
//#line 3539
/* template:forloop { */
        for (java.util.Iterator j__ = (P.
                                         distribution.
                                         region).iterator(); j__.hasNext(); ) {
        	final  x10.
          lang.
          point j = (x10.
          lang.
          point) j__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 3540
final int X10_TEMP705 =
              (0);
            
//#line 3542
final int X10_TEMP60 =
              (X10_TEMP705);
            
//#line 3543
final int X10_TEMP708 =
              (2);
            
//#line 3545
final int X10_TEMP61 =
              (X10_TEMP708);
            
//#line 3546
final x10.
              lang.
              region X10_TEMP713 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP60,
                      X10_TEMP61))));
            
//#line 3548
final x10.
              lang.
              region X10_TEMP62 =
              (x10.
                lang.
                region)
                ((X10_TEMP713));
            
//#line 3549
final x10.
              lang.
              place X10_TEMP716 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 3551
final x10.
              lang.
              place X10_TEMP63 =
              (X10_TEMP716);
            
//#line 3552
final x10.
              lang.
              dist X10_TEMP719 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP62,
                    X10_TEMP63)));
            
//#line 3554
final x10.
              lang.
              dist dD =
              (x10.
                lang.
                dist)
                ((X10_TEMP719));
            
//#line 3555
final int X10_TEMP722 =
              (0);
            
//#line 3557
final int X10_TEMP67 =
              (X10_TEMP722);
            
//#line 3558
final int X10_TEMP725 =
              (0);
            
//#line 3560
final int X10_TEMP68 =
              (X10_TEMP725);
            
//#line 3561
final x10.
              lang.
              region X10_TEMP730 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP67,
                      X10_TEMP68))));
            
//#line 3563
final x10.
              lang.
              region X10_TEMP69 =
              (x10.
                lang.
                region)
                ((X10_TEMP730));
            
//#line 3564
final x10.
              lang.
              place X10_TEMP733 =
              (/* template:here { */x10.lang.Runtime.here()/* } */);
            
//#line 3566
final x10.
              lang.
              place X10_TEMP70 =
              (X10_TEMP733);
            
//#line 3567
final x10.
              lang.
              dist X10_TEMP736 =
              (x10.
                lang.
                dist)
                ((x10.
                    lang.
                    dist.
                    factory.
                    constant(
                    X10_TEMP69,
                    X10_TEMP70)));
            
//#line 3569
final x10.
              lang.
              dist dI =
              (x10.
                lang.
                dist)
                ((X10_TEMP736));
            
//#line 3570
final x10.
              lang.
              DoubleReferenceArray X10_TEMP739 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 3572
final x10.
              lang.
              DoubleReferenceArray dataD =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP739));
            
//#line 3573
final x10.
              lang.
              DoubleReferenceArray X10_TEMP742 =
              (x10.
                lang.
                DoubleReferenceArray)
                ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
            
//#line 3575
final x10.
              lang.
              DoubleReferenceArray dataI =
              (x10.
                lang.
                DoubleReferenceArray)
                ((X10_TEMP742));
            
//#line 3576
final int X10_TEMP745 =
              (0);
            
//#line 3578
final int X10_TEMP80 =
              (X10_TEMP745);
            
//#line 3579
final int X10_TEMP748 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
            
//#line 3581
final int X10_TEMP75 =
              (X10_TEMP748);
            
//#line 3582
final int X10_TEMP751 =
              (1);
            
//#line 3584
final int X10_TEMP76 =
              (X10_TEMP751);
            
//#line 3585
final int X10_TEMP754 =
              (X10_TEMP75 -
                 X10_TEMP76);
            
//#line 3587
final int X10_TEMP78 =
              (X10_TEMP754);
            
//#line 3588
final x10.
              lang.
              region X10_TEMP759 =
              (x10.
                lang.
                region)
                ((x10.
                    lang.
                    region.
                    factory.
                    region(
                    x10.
                      lang.
                      region.
                      factory.
                      region(
                      X10_TEMP80,
                      X10_TEMP78))));
            
//#line 3590
final x10.
              lang.
              region X10_TEMP82 =
              (x10.
                lang.
                region)
                ((X10_TEMP759));
            
//#line 3591
/* template:forloop { */
            for (java.util.Iterator k__ = (X10_TEMP82).iterator(); k__.hasNext(); ) {
            	final  x10.
              lang.
              point k = (x10.
              lang.
              point) k__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 3592
/* template:finish { */
                {
                	x10.lang.Runtime.getCurrentActivity().startFinish();
                	try {
                		{
                    
//#line 3593
final x10.
                      lang.
                      dist X10_TEMP763 =
                      (x10.
                        lang.
                        dist)
                        ((P.
                            distribution));
                    
//#line 3595
final x10.
                      lang.
                      dist X10_TEMP83 =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP763));
                    
//#line 3596
final x10.
                      lang.
                      place X10_TEMP86 =
                      (X10_TEMP83.
                         get(
                         j));
                    
//#line 3597
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP86)).runAsync
                    	(new x10.runtime.Activity() {
                    		public void runX10Task() {
                    			{
                        
//#line 3598
final md X10_TEMP770 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 3600
final md X10_TEMP88 =
                          (X10_TEMP770);
                        
//#line 3601
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP773 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP88))/* } */.one));
                        
//#line 3603
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP89 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP773));
                        
//#line 3604
final Particle X10_TEMP777 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP89).get(k))/* } */))/* } */);
                        
//#line 3606
final Particle X10_TEMP91 =
                          (X10_TEMP777);
                        
//#line 3607
final double X10_TEMP780 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP91))/* } */.xforce);
                        
//#line 3609
final double fx =
                          (X10_TEMP780);
                        
//#line 3610
final md X10_TEMP784 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 3612
final md X10_TEMP94 =
                          (X10_TEMP784);
                        
//#line 3613
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP787 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP94))/* } */.one));
                        
//#line 3615
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP95 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP787));
                        
//#line 3616
final Particle X10_TEMP791 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP95).get(k))/* } */))/* } */);
                        
//#line 3618
final Particle X10_TEMP97 =
                          (X10_TEMP791);
                        
//#line 3619
final double X10_TEMP794 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP97))/* } */.yforce);
                        
//#line 3621
final double fy =
                          (X10_TEMP794);
                        
//#line 3622
final md X10_TEMP798 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 3624
final md X10_TEMP100 =
                          (X10_TEMP798);
                        
//#line 3625
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP801 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP100))/* } */.one));
                        
//#line 3627
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP101 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP801));
                        
//#line 3628
final Particle X10_TEMP805 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP101).get(k))/* } */))/* } */);
                        
//#line 3630
final Particle X10_TEMP103 =
                          (X10_TEMP805);
                        
//#line 3631
final double X10_TEMP808 =
                          (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP103))/* } */.zforce);
                        
//#line 3633
final double fz =
                          (X10_TEMP808);
                        
//#line 3634
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 3635
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 3636
final int X10_TEMP812 =
                                  (0);
                                
//#line 3638
final int X10_TEMP107 =
                                  (X10_TEMP812);
                                
//#line 3639
final double X10_TEMP815 =
                                  (fx);
                                
//#line 3641
final double X10_TEMP110 =
                                  (X10_TEMP815);
                                
//#line 3642
final double X10_TEMP819 =
                                  (X10_TEMP110);
                                
//#line 3644
final double X10_TEMP822 =
                                  (X10_TEMP819);
                                
//#line 3645
/* template:array_set { */(dataD).set((X10_TEMP822),X10_TEMP107)/* } */;
                                
//#line 3646
final int X10_TEMP824 =
                                  (1);
                                
//#line 3648
final int X10_TEMP112 =
                                  (X10_TEMP824);
                                
//#line 3649
final double X10_TEMP827 =
                                  (fy);
                                
//#line 3651
final double X10_TEMP115 =
                                  (X10_TEMP827);
                                
//#line 3652
final double X10_TEMP831 =
                                  (X10_TEMP115);
                                
//#line 3654
final double X10_TEMP834 =
                                  (X10_TEMP831);
                                
//#line 3655
/* template:array_set { */(dataD).set((X10_TEMP834),X10_TEMP112)/* } */;
                                
//#line 3656
final int X10_TEMP836 =
                                  (2);
                                
//#line 3658
final int X10_TEMP117 =
                                  (X10_TEMP836);
                                
//#line 3659
final double X10_TEMP839 =
                                  (fz);
                                
//#line 3661
final double X10_TEMP120 =
                                  (X10_TEMP839);
                                
//#line 3662
final double X10_TEMP843 =
                                  (X10_TEMP120);
                                
//#line 3664
final double X10_TEMP846 =
                                  (X10_TEMP843);
                                
//#line 3665
/* template:array_set { */(dataD).set((X10_TEMP846),X10_TEMP117)/* } */;
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp111) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp111);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                    }
                    		}
                    	});/* } */
                }
                	} catch (Throwable tmp110) {
                		x10.lang.Runtime.getCurrentActivity().pushException(tmp110);
                	} finally {
                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                	}
                }
                /* } */
                
                
//#line 3670
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP848 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 3672
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP121 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP848));
                
//#line 3673
final Particle X10_TEMP852 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP121).get(k))/* } */))/* } */);
                
//#line 3675
final Particle X10_TEMP123 =
                  (X10_TEMP852);
                
//#line 3676
final int X10_TEMP855 =
                  (0);
                
//#line 3678
final int X10_TEMP125 =
                  (X10_TEMP855);
                
//#line 3679
final double X10_TEMP858 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP123))/* } */.xforce);
                
//#line 3681
final double X10_TEMP127 =
                  (X10_TEMP858);
                
//#line 3682
final double X10_TEMP862 =
                  (/* template:array_get { */((dataD).get(X10_TEMP125))/* } */);
                
//#line 3684
final double X10_TEMP128 =
                  (X10_TEMP862);
                
//#line 3685
final double X10_TEMP865 =
                  (X10_TEMP127 +
                     X10_TEMP128);
                
//#line 3687
final double X10_TEMP129 =
                  (X10_TEMP865);
                
//#line 3688
final double X10_TEMP868 =
                  (X10_TEMP129);
                
//#line 3690
final double X10_TEMP871 =
                  (X10_TEMP868);
                
//#line 3691
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP123))/* } */.xforce =
                  ((X10_TEMP871));
                
//#line 3692
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP873 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 3694
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP130 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP873));
                
//#line 3695
final Particle X10_TEMP877 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP130).get(k))/* } */))/* } */);
                
//#line 3697
final Particle X10_TEMP132 =
                  (X10_TEMP877);
                
//#line 3698
final int X10_TEMP880 =
                  (1);
                
//#line 3700
final int X10_TEMP134 =
                  (X10_TEMP880);
                
//#line 3701
final double X10_TEMP883 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP132))/* } */.yforce);
                
//#line 3703
final double X10_TEMP136 =
                  (X10_TEMP883);
                
//#line 3704
final double X10_TEMP887 =
                  (/* template:array_get { */((dataD).get(X10_TEMP134))/* } */);
                
//#line 3706
final double X10_TEMP137 =
                  (X10_TEMP887);
                
//#line 3707
final double X10_TEMP890 =
                  (X10_TEMP136 +
                     X10_TEMP137);
                
//#line 3709
final double X10_TEMP138 =
                  (X10_TEMP890);
                
//#line 3710
final double X10_TEMP893 =
                  (X10_TEMP138);
                
//#line 3712
final double X10_TEMP896 =
                  (X10_TEMP893);
                
//#line 3713
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP132))/* } */.yforce =
                  ((X10_TEMP896));
                
//#line 3714
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP898 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                
//#line 3716
final x10.
                  lang.
                  GenericReferenceArray X10_TEMP139 =
                  (x10.
                    lang.
                    GenericReferenceArray)
                    ((X10_TEMP898));
                
//#line 3717
final Particle X10_TEMP902 =
                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP139).get(k))/* } */))/* } */);
                
//#line 3719
final Particle X10_TEMP141 =
                  (X10_TEMP902);
                
//#line 3720
final int X10_TEMP905 =
                  (2);
                
//#line 3722
final int X10_TEMP143 =
                  (X10_TEMP905);
                
//#line 3723
final double X10_TEMP908 =
                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP141))/* } */.zforce);
                
//#line 3725
final double X10_TEMP145 =
                  (X10_TEMP908);
                
//#line 3726
final double X10_TEMP912 =
                  (/* template:array_get { */((dataD).get(X10_TEMP143))/* } */);
                
//#line 3728
final double X10_TEMP146 =
                  (X10_TEMP912);
                
//#line 3729
final double X10_TEMP915 =
                  (X10_TEMP145 +
                     X10_TEMP146);
                
//#line 3731
final double X10_TEMP147 =
                  (X10_TEMP915);
                
//#line 3732
final double X10_TEMP918 =
                  (X10_TEMP147);
                
//#line 3734
final double X10_TEMP921 =
                  (X10_TEMP918);
                
//#line 3735
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP141))/* } */.zforce =
                  ((X10_TEMP921));
            }/* } */
            }
            /* } */
            
            
//#line 3737
/* template:finish { */
            {
            	x10.lang.Runtime.getCurrentActivity().startFinish();
            	try {
            		{
                
//#line 3738
final x10.
                  lang.
                  dist X10_TEMP923 =
                  (x10.
                    lang.
                    dist)
                    ((P.
                        distribution));
                
//#line 3740
final x10.
                  lang.
                  dist X10_TEMP148 =
                  (x10.
                    lang.
                    dist)
                    ((X10_TEMP923));
                
//#line 3741
final x10.
                  lang.
                  place X10_TEMP151 =
                  (X10_TEMP148.
                     get(
                     j));
                
//#line 3742
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP151)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 3743
final md X10_TEMP930 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 3745
final md X10_TEMP153 =
                      (X10_TEMP930);
                    
//#line 3746
final double X10_TEMP933 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP153))/* } */.vir);
                    
//#line 3748
final double jvir =
                      (X10_TEMP933);
                    
//#line 3749
final md X10_TEMP937 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 3751
final md X10_TEMP156 =
                      (X10_TEMP937);
                    
//#line 3752
final double X10_TEMP940 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP156))/* } */.epot);
                    
//#line 3754
final double jepot =
                      (X10_TEMP940);
                    
//#line 3755
final md X10_TEMP944 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 3757
final md X10_TEMP159 =
                      (X10_TEMP944);
                    
//#line 3758
final int X10_TEMP947 =
                      (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP159))/* } */.interactions);
                    
//#line 3760
final int jinter =
                      (X10_TEMP947);
                    
//#line 3761
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 3762
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 3763
final int X10_TEMP951 =
                              (0);
                            
//#line 3765
final int X10_TEMP163 =
                              (X10_TEMP951);
                            
//#line 3766
final double X10_TEMP954 =
                              (jvir);
                            
//#line 3768
final double X10_TEMP166 =
                              (X10_TEMP954);
                            
//#line 3769
final double X10_TEMP958 =
                              (X10_TEMP166);
                            
//#line 3771
final double X10_TEMP961 =
                              (X10_TEMP958);
                            
//#line 3772
/* template:array_set { */(dataD).set((X10_TEMP961),X10_TEMP163)/* } */;
                            
//#line 3773
final int X10_TEMP963 =
                              (1);
                            
//#line 3775
final int X10_TEMP168 =
                              (X10_TEMP963);
                            
//#line 3776
final double X10_TEMP966 =
                              (jepot);
                            
//#line 3778
final double X10_TEMP171 =
                              (X10_TEMP966);
                            
//#line 3779
final double X10_TEMP970 =
                              (X10_TEMP171);
                            
//#line 3781
final double X10_TEMP973 =
                              (X10_TEMP970);
                            
//#line 3782
/* template:array_set { */(dataD).set((X10_TEMP973),X10_TEMP168)/* } */;
                            
//#line 3783
final int X10_TEMP975 =
                              (0);
                            
//#line 3785
final int X10_TEMP173 =
                              (X10_TEMP975);
                            
//#line 3786
final int X10_TEMP978 =
                              (jinter);
                            
//#line 3788
final double X10_TEMP176 =
                              (X10_TEMP978);
                            
//#line 3789
final double X10_TEMP982 =
                              (X10_TEMP176);
                            
//#line 3791
final double X10_TEMP985 =
                              (X10_TEMP982);
                            
//#line 3792
/* template:array_set { */(dataI).set((X10_TEMP985),X10_TEMP173)/* } */;
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp113) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp113);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                }
                		}
                	});/* } */
            }
            	} catch (Throwable tmp112) {
            		x10.lang.Runtime.getCurrentActivity().pushException(tmp112);
            	} finally {
            		x10.lang.Runtime.getCurrentActivity().stopFinish();
            	}
            }
            /* } */
            
            
//#line 3797
final int X10_TEMP987 =
              (0);
            
//#line 3799
final int X10_TEMP178 =
              (X10_TEMP987);
            
//#line 3800
final double X10_TEMP990 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
            
//#line 3802
final double X10_TEMP180 =
              (X10_TEMP990);
            
//#line 3803
final double X10_TEMP994 =
              (/* template:array_get { */((dataD).get(X10_TEMP178))/* } */);
            
//#line 3805
final double X10_TEMP181 =
              (X10_TEMP994);
            
//#line 3806
final double X10_TEMP997 =
              (X10_TEMP180 +
                 X10_TEMP181);
            
//#line 3808
final double X10_TEMP182 =
              (X10_TEMP997);
            
//#line 3809
final double X10_TEMP1000 =
              (X10_TEMP182);
            
//#line 3811
final double X10_TEMP1003 =
              (X10_TEMP1000);
            
//#line 3812
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir =
              ((X10_TEMP1003));
            
//#line 3813
final int X10_TEMP1005 =
              (1);
            
//#line 3815
final int X10_TEMP184 =
              (X10_TEMP1005);
            
//#line 3816
final double X10_TEMP1008 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
            
//#line 3818
final double X10_TEMP186 =
              (X10_TEMP1008);
            
//#line 3819
final double X10_TEMP1012 =
              (/* template:array_get { */((dataD).get(X10_TEMP184))/* } */);
            
//#line 3821
final double X10_TEMP187 =
              (X10_TEMP1012);
            
//#line 3822
final double X10_TEMP1015 =
              (X10_TEMP186 +
                 X10_TEMP187);
            
//#line 3824
final double X10_TEMP188 =
              (X10_TEMP1015);
            
//#line 3825
final double X10_TEMP1018 =
              (X10_TEMP188);
            
//#line 3827
final double X10_TEMP1021 =
              (X10_TEMP1018);
            
//#line 3828
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot =
              ((X10_TEMP1021));
            
//#line 3829
final int X10_TEMP1023 =
              (0);
            
//#line 3831
final int X10_TEMP190 =
              (X10_TEMP1023);
            
//#line 3832
final double X10_TEMP1027 =
              (/* template:array_get { */((dataI).get(X10_TEMP190))/* } */);
            
//#line 3834
final double X10_TEMP191 =
              (X10_TEMP1027);
            
//#line 3835
final int X10_TEMP1030 =
              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
            
//#line 3837
final int X10_TEMP193 =
              (X10_TEMP1030);
            
//#line 3838
final int X10_TEMP1033 =
              ((int)
                 X10_TEMP191);
            
//#line 3840
final int X10_TEMP194 =
              (X10_TEMP1033);
            
//#line 3841
final int X10_TEMP1036 =
              (X10_TEMP193 +
                 X10_TEMP194);
            
//#line 3843
final int X10_TEMP195 =
              (X10_TEMP1036);
            
//#line 3844
final int X10_TEMP1039 =
              (X10_TEMP195);
            
//#line 3846
final int X10_TEMP1042 =
              (X10_TEMP1039);
            
//#line 3847
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions =
              ((X10_TEMP1042));
        }/* } */
        }
        /* } */
        
        
//#line 3849
final int X10_TEMP1044 =
          (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.mdsize);
        
//#line 3851
final int mymdsize =
          (X10_TEMP1044);
        
//#line 3852
/* template:finish { */
        {
        	x10.lang.Runtime.getCurrentActivity().startFinish();
        	try {
        		{
            
//#line 3853
final x10.
              lang.
              dist X10_TEMP1047 =
              (x10.
                lang.
                dist)
                ((P.
                    distribution));
            
//#line 3855
final x10.
              lang.
              dist X10_TEMP198 =
              (x10.
                lang.
                dist)
                ((X10_TEMP1047));
            
//#line 3856
/* template:forloop { */
            for (java.util.Iterator j__ = (X10_TEMP198.
                                             region).iterator(); j__.hasNext(); ) {
            	final  x10.
              lang.
              point j = (x10.
              lang.
              point) j__.next();
            	/* Join: { *//* Join: { *//* } */
{
                
//#line 3857
final x10.
                  lang.
                  place X10_TEMP199 =
                  (X10_TEMP198.
                     get(
                     j));
                
//#line 3858
/* template:Async { */(x10.lang.Runtime.asPlace(X10_TEMP199)).runAsync
                	(new x10.runtime.Activity() {
                		public void runX10Task() {
                			{
                    
//#line 3859
final x10.
                      lang.
                      place X10_TEMP1054 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 3861
final x10.
                      lang.
                      place pHere =
                      (X10_TEMP1054);
                    
//#line 3862
final int X10_TEMP1057 =
                      (0);
                    
//#line 3864
final int X10_TEMP203 =
                      (X10_TEMP1057);
                    
//#line 3865
final int X10_TEMP1060 =
                      (2);
                    
//#line 3867
final int X10_TEMP204 =
                      (X10_TEMP1060);
                    
//#line 3868
final x10.
                      lang.
                      region X10_TEMP1065 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP203,
                              X10_TEMP204))));
                    
//#line 3870
final x10.
                      lang.
                      region X10_TEMP205 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1065));
                    
//#line 3871
final x10.
                      lang.
                      place X10_TEMP1068 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 3873
final x10.
                      lang.
                      place X10_TEMP206 =
                      (X10_TEMP1068);
                    
//#line 3874
final x10.
                      lang.
                      dist X10_TEMP1071 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP205,
                            X10_TEMP206)));
                    
//#line 3876
final x10.
                      lang.
                      dist dD =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1071));
                    
//#line 3877
final x10.
                      lang.
                      DoubleReferenceArray X10_TEMP1074 =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(dD,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 3879
final x10.
                      lang.
                      DoubleReferenceArray dataD =
                      (x10.
                        lang.
                        DoubleReferenceArray)
                        ((X10_TEMP1074));
                    
//#line 3880
final int X10_TEMP1077 =
                      (0);
                    
//#line 3882
final int X10_TEMP214 =
                      (X10_TEMP1077);
                    
//#line 3883
final int X10_TEMP1080 =
                      (1);
                    
//#line 3885
final int X10_TEMP210 =
                      (X10_TEMP1080);
                    
//#line 3886
final int X10_TEMP1083 =
                      (mymdsize -
                         X10_TEMP210);
                    
//#line 3888
final int X10_TEMP212 =
                      (X10_TEMP1083);
                    
//#line 3889
final x10.
                      lang.
                      region X10_TEMP1088 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP214,
                              X10_TEMP212))));
                    
//#line 3891
final x10.
                      lang.
                      region X10_TEMP216 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1088));
                    
//#line 3892
/* template:forloop { */
                    for (java.util.Iterator k__ = (X10_TEMP216).iterator(); k__.hasNext(); ) {
                    	final  x10.
                      lang.
                      point k = (x10.
                      lang.
                      point) k__.next();
                    	/* Join: { *//* Join: { *//* } */
{
                        
//#line 3893
/* template:finish { */
                        {
                        	x10.lang.Runtime.getCurrentActivity().startFinish();
                        	try {
                        		{
                            
//#line 3894
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                            	(new x10.runtime.Activity() {
                            		public void runX10Task() {
                            			{
                                
//#line 3895
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1093 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 3897
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP218 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1093));
                                
//#line 3898
final Particle X10_TEMP1097 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP218).get(k))/* } */))/* } */);
                                
//#line 3900
final Particle X10_TEMP220 =
                                  (X10_TEMP1097);
                                
//#line 3901
final double X10_TEMP1100 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP220))/* } */.xforce);
                                
//#line 3903
final double xf =
                                  (X10_TEMP1100);
                                
//#line 3904
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1103 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 3906
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP222 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1103));
                                
//#line 3907
final Particle X10_TEMP1107 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP222).get(k))/* } */))/* } */);
                                
//#line 3909
final Particle X10_TEMP224 =
                                  (X10_TEMP1107);
                                
//#line 3910
final double X10_TEMP1110 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP224))/* } */.yforce);
                                
//#line 3912
final double yf =
                                  (X10_TEMP1110);
                                
//#line 3913
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP1113 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.one));
                                
//#line 3915
final x10.
                                  lang.
                                  GenericReferenceArray X10_TEMP226 =
                                  (x10.
                                    lang.
                                    GenericReferenceArray)
                                    ((X10_TEMP1113));
                                
//#line 3916
final Particle X10_TEMP1117 =
                                  (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP226).get(k))/* } */))/* } */);
                                
//#line 3918
final Particle X10_TEMP228 =
                                  (X10_TEMP1117);
                                
//#line 3919
final double X10_TEMP1120 =
                                  (/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP228))/* } */.zforce);
                                
//#line 3921
final double zf =
                                  (X10_TEMP1120);
                                
//#line 3922
/* template:finish { */
                                {
                                	x10.lang.Runtime.getCurrentActivity().startFinish();
                                	try {
                                		{
                                    
//#line 3923
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                    	(new x10.runtime.Activity() {
                                    		public void runX10Task() {
                                    			{
                                        
//#line 3924
final int X10_TEMP1124 =
                                          (0);
                                        
//#line 3926
final int X10_TEMP232 =
                                          (X10_TEMP1124);
                                        
//#line 3927
final double X10_TEMP1127 =
                                          (xf);
                                        
//#line 3929
final double X10_TEMP235 =
                                          (X10_TEMP1127);
                                        
//#line 3930
final double X10_TEMP1131 =
                                          (X10_TEMP235);
                                        
//#line 3932
final double X10_TEMP1134 =
                                          (X10_TEMP1131);
                                        
//#line 3933
/* template:array_set { */(dataD).set((X10_TEMP1134),X10_TEMP232)/* } */;
                                        
//#line 3934
final int X10_TEMP1136 =
                                          (1);
                                        
//#line 3936
final int X10_TEMP237 =
                                          (X10_TEMP1136);
                                        
//#line 3937
final double X10_TEMP1139 =
                                          (yf);
                                        
//#line 3939
final double X10_TEMP240 =
                                          (X10_TEMP1139);
                                        
//#line 3940
final double X10_TEMP1143 =
                                          (X10_TEMP240);
                                        
//#line 3942
final double X10_TEMP1146 =
                                          (X10_TEMP1143);
                                        
//#line 3943
/* template:array_set { */(dataD).set((X10_TEMP1146),X10_TEMP237)/* } */;
                                        
//#line 3944
final int X10_TEMP1148 =
                                          (2);
                                        
//#line 3946
final int X10_TEMP242 =
                                          (X10_TEMP1148);
                                        
//#line 3947
final double X10_TEMP1151 =
                                          (zf);
                                        
//#line 3949
final double X10_TEMP245 =
                                          (X10_TEMP1151);
                                        
//#line 3950
final double X10_TEMP1155 =
                                          (X10_TEMP245);
                                        
//#line 3952
final double X10_TEMP1158 =
                                          (X10_TEMP1155);
                                        
//#line 3953
/* template:array_set { */(dataD).set((X10_TEMP1158),X10_TEMP242)/* } */;
                                    }
                                    		}
                                    	});/* } */
                                }
                                	} catch (Throwable tmp116) {
                                		x10.lang.Runtime.getCurrentActivity().pushException(tmp116);
                                	} finally {
                                		x10.lang.Runtime.getCurrentActivity().stopFinish();
                                	}
                                }
                                /* } */
                                
                            }
                            		}
                            	});/* } */
                        }
                        	} catch (Throwable tmp115) {
                        		x10.lang.Runtime.getCurrentActivity().pushException(tmp115);
                        	} finally {
                        		x10.lang.Runtime.getCurrentActivity().stopFinish();
                        	}
                        }
                        /* } */
                        
                        
//#line 3958
final md X10_TEMP1161 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 3960
final md X10_TEMP247 =
                          (X10_TEMP1161);
                        
//#line 3961
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1164 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP247))/* } */.one));
                        
//#line 3963
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP248 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1164));
                        
//#line 3964
final Particle X10_TEMP1168 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP248).get(k))/* } */))/* } */);
                        
//#line 3966
final Particle X10_TEMP250 =
                          (X10_TEMP1168);
                        
//#line 3967
final int X10_TEMP1171 =
                          (0);
                        
//#line 3969
final int X10_TEMP252 =
                          (X10_TEMP1171);
                        
//#line 3970
final double X10_TEMP1175 =
                          (/* template:array_get { */((dataD).get(X10_TEMP252))/* } */);
                        
//#line 3972
final double X10_TEMP255 =
                          (X10_TEMP1175);
                        
//#line 3973
final double X10_TEMP1178 =
                          (X10_TEMP255);
                        
//#line 3975
final double X10_TEMP256 =
                          (X10_TEMP1178);
                        
//#line 3976
final double X10_TEMP1181 =
                          (X10_TEMP256);
                        
//#line 3978
final double X10_TEMP1184 =
                          (X10_TEMP1181);
                        
//#line 3979
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP250))/* } */.xforce =
                          ((X10_TEMP1184));
                        
//#line 3980
final md X10_TEMP1187 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 3982
final md X10_TEMP258 =
                          (X10_TEMP1187);
                        
//#line 3983
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1190 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP258))/* } */.one));
                        
//#line 3985
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP259 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1190));
                        
//#line 3986
final Particle X10_TEMP1194 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP259).get(k))/* } */))/* } */);
                        
//#line 3988
final Particle X10_TEMP261 =
                          (X10_TEMP1194);
                        
//#line 3989
final int X10_TEMP1197 =
                          (1);
                        
//#line 3991
final int X10_TEMP263 =
                          (X10_TEMP1197);
                        
//#line 3992
final double X10_TEMP1201 =
                          (/* template:array_get { */((dataD).get(X10_TEMP263))/* } */);
                        
//#line 3994
final double X10_TEMP266 =
                          (X10_TEMP1201);
                        
//#line 3995
final double X10_TEMP1204 =
                          (X10_TEMP266);
                        
//#line 3997
final double X10_TEMP267 =
                          (X10_TEMP1204);
                        
//#line 3998
final double X10_TEMP1207 =
                          (X10_TEMP267);
                        
//#line 4000
final double X10_TEMP1210 =
                          (X10_TEMP1207);
                        
//#line 4001
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP261))/* } */.yforce =
                          ((X10_TEMP1210));
                        
//#line 4002
final md X10_TEMP1213 =
                          (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                        
//#line 4004
final md X10_TEMP269 =
                          (X10_TEMP1213);
                        
//#line 4005
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP1216 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP269))/* } */.one));
                        
//#line 4007
final x10.
                          lang.
                          GenericReferenceArray X10_TEMP270 =
                          (x10.
                            lang.
                            GenericReferenceArray)
                            ((X10_TEMP1216));
                        
//#line 4008
final Particle X10_TEMP1220 =
                          (/* template:parametric { */((Particle)(/* template:array_get { */((X10_TEMP270).get(k))/* } */))/* } */);
                        
//#line 4010
final Particle X10_TEMP272 =
                          (X10_TEMP1220);
                        
//#line 4011
final int X10_TEMP1223 =
                          (2);
                        
//#line 4013
final int X10_TEMP274 =
                          (X10_TEMP1223);
                        
//#line 4014
final double X10_TEMP1227 =
                          (/* template:array_get { */((dataD).get(X10_TEMP274))/* } */);
                        
//#line 4016
final double X10_TEMP277 =
                          (X10_TEMP1227);
                        
//#line 4017
final double X10_TEMP1230 =
                          (X10_TEMP277);
                        
//#line 4019
final double X10_TEMP278 =
                          (X10_TEMP1230);
                        
//#line 4020
final double X10_TEMP1233 =
                          (X10_TEMP278);
                        
//#line 4022
final double X10_TEMP1236 =
                          (X10_TEMP1233);
                        
//#line 4023
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(X10_TEMP272))/* } */.zforce =
                          ((X10_TEMP1236));
                    }/* } */
                    }
                    /* } */
                    
                    
//#line 4025
final int X10_TEMP1238 =
                      (0);
                    
//#line 4027
final int X10_TEMP281 =
                      (X10_TEMP1238);
                    
//#line 4028
final int X10_TEMP1241 =
                      (0);
                    
//#line 4030
final int X10_TEMP282 =
                      (X10_TEMP1241);
                    
//#line 4031
final x10.
                      lang.
                      region X10_TEMP1246 =
                      (x10.
                        lang.
                        region)
                        ((x10.
                            lang.
                            region.
                            factory.
                            region(
                            x10.
                              lang.
                              region.
                              factory.
                              region(
                              X10_TEMP281,
                              X10_TEMP282))));
                    
//#line 4033
final x10.
                      lang.
                      region X10_TEMP283 =
                      (x10.
                        lang.
                        region)
                        ((X10_TEMP1246));
                    
//#line 4034
final x10.
                      lang.
                      place X10_TEMP1249 =
                      (/* template:here { */x10.lang.Runtime.here()/* } */);
                    
//#line 4036
final x10.
                      lang.
                      place X10_TEMP284 =
                      (X10_TEMP1249);
                    
//#line 4037
final x10.
                      lang.
                      dist X10_TEMP1252 =
                      (x10.
                        lang.
                        dist)
                        ((x10.
                            lang.
                            dist.
                            factory.
                            constant(
                            X10_TEMP283,
                            X10_TEMP284)));
                    
//#line 4039
final x10.
                      lang.
                      dist dI =
                      (x10.
                        lang.
                        dist)
                        ((X10_TEMP1252));
                    
//#line 4040
final x10.
                      lang.
                      IntReferenceArray X10_TEMP1255 =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.IntArray(dI,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
                    
//#line 4042
final x10.
                      lang.
                      IntReferenceArray dataI =
                      (x10.
                        lang.
                        IntReferenceArray)
                        ((X10_TEMP1255));
                    
//#line 4043
/* template:finish { */
                    {
                    	x10.lang.Runtime.getCurrentActivity().startFinish();
                    	try {
                    		{
                        
//#line 4044
/* template:Async { */(x10.lang.Runtime.asPlace(tHere)).runAsync
                        	(new x10.runtime.Activity() {
                        		public void runX10Task() {
                        			{
                            
//#line 4045
final double X10_TEMP1259 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.vir);
                            
//#line 4047
final double tvir =
                              (X10_TEMP1259);
                            
//#line 4048
final double X10_TEMP1262 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.epot);
                            
//#line 4050
final double tepot =
                              (X10_TEMP1262);
                            
//#line 4051
final int X10_TEMP1265 =
                              (/* template:place-check { */((md) x10.lang.Runtime.hereCheck(t))/* } */.interactions);
                            
//#line 4053
final int tinter =
                              (X10_TEMP1265);
                            
//#line 4054
/* template:finish { */
                            {
                            	x10.lang.Runtime.getCurrentActivity().startFinish();
                            	try {
                            		{
                                
//#line 4055
/* template:Async { */(x10.lang.Runtime.asPlace(pHere)).runAsync
                                	(new x10.runtime.Activity() {
                                		public void runX10Task() {
                                			{
                                    
//#line 4056
final int X10_TEMP1269 =
                                      (0);
                                    
//#line 4058
final int X10_TEMP293 =
                                      (X10_TEMP1269);
                                    
//#line 4059
final double X10_TEMP1272 =
                                      (tvir);
                                    
//#line 4061
final double X10_TEMP296 =
                                      (X10_TEMP1272);
                                    
//#line 4062
final double X10_TEMP1276 =
                                      (X10_TEMP296);
                                    
//#line 4064
final double X10_TEMP1279 =
                                      (X10_TEMP1276);
                                    
//#line 4065
/* template:array_set { */(dataD).set((X10_TEMP1279),X10_TEMP293)/* } */;
                                    
//#line 4066
final int X10_TEMP1281 =
                                      (1);
                                    
//#line 4068
final int X10_TEMP298 =
                                      (X10_TEMP1281);
                                    
//#line 4069
final double X10_TEMP1284 =
                                      (tepot);
                                    
//#line 4071
final double X10_TEMP301 =
                                      (X10_TEMP1284);
                                    
//#line 4072
final double X10_TEMP1288 =
                                      (X10_TEMP301);
                                    
//#line 4074
final double X10_TEMP1291 =
                                      (X10_TEMP1288);
                                    
//#line 4075
/* template:array_set { */(dataD).set((X10_TEMP1291),X10_TEMP298)/* } */;
                                    
//#line 4076
final int X10_TEMP1293 =
                                      (0);
                                    
//#line 4078
final int X10_TEMP303 =
                                      (X10_TEMP1293);
                                    
//#line 4079
final int X10_TEMP1296 =
                                      (tinter);
                                    
//#line 4081
final int X10_TEMP306 =
                                      (X10_TEMP1296);
                                    
//#line 4082
final int X10_TEMP1300 =
                                      (X10_TEMP306);
                                    
//#line 4084
final int X10_TEMP1303 =
                                      (X10_TEMP1300);
                                    
//#line 4085
/* template:array_set { */(dataI).set((X10_TEMP1303),X10_TEMP303)/* } */;
                                }
                                		}
                                	});/* } */
                            }
                            	} catch (Throwable tmp118) {
                            		x10.lang.Runtime.getCurrentActivity().pushException(tmp118);
                            	} finally {
                            		x10.lang.Runtime.getCurrentActivity().stopFinish();
                            	}
                            }
                            /* } */
                            
                        }
                        		}
                        	});/* } */
                    }
                    	} catch (Throwable tmp117) {
                    		x10.lang.Runtime.getCurrentActivity().pushException(tmp117);
                    	} finally {
                    		x10.lang.Runtime.getCurrentActivity().stopFinish();
                    	}
                    }
                    /* } */
                    
                    
//#line 4090
final md X10_TEMP1306 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 4092
final md X10_TEMP308 =
                      (X10_TEMP1306);
                    
//#line 4093
final int X10_TEMP1309 =
                      (0);
                    
//#line 4095
final int X10_TEMP310 =
                      (X10_TEMP1309);
                    
//#line 4096
final double X10_TEMP1313 =
                      (/* template:array_get { */((dataD).get(X10_TEMP310))/* } */);
                    
//#line 4098
final double X10_TEMP313 =
                      (X10_TEMP1313);
                    
//#line 4099
final double X10_TEMP1316 =
                      (X10_TEMP313);
                    
//#line 4101
final double X10_TEMP314 =
                      (X10_TEMP1316);
                    
//#line 4102
final double X10_TEMP1319 =
                      (X10_TEMP314);
                    
//#line 4104
final double X10_TEMP1322 =
                      (X10_TEMP1319);
                    
//#line 4105
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP308))/* } */.vir =
                      ((X10_TEMP1322));
                    
//#line 4106
final md X10_TEMP1325 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 4108
final md X10_TEMP316 =
                      (X10_TEMP1325);
                    
//#line 4109
final int X10_TEMP1328 =
                      (1);
                    
//#line 4111
final int X10_TEMP318 =
                      (X10_TEMP1328);
                    
//#line 4112
final double X10_TEMP1332 =
                      (/* template:array_get { */((dataD).get(X10_TEMP318))/* } */);
                    
//#line 4114
final double X10_TEMP321 =
                      (X10_TEMP1332);
                    
//#line 4115
final double X10_TEMP1335 =
                      (X10_TEMP321);
                    
//#line 4117
final double X10_TEMP322 =
                      (X10_TEMP1335);
                    
//#line 4118
final double X10_TEMP1338 =
                      (X10_TEMP322);
                    
//#line 4120
final double X10_TEMP1341 =
                      (X10_TEMP1338);
                    
//#line 4121
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP316))/* } */.epot =
                      ((X10_TEMP1341));
                    
//#line 4122
final md X10_TEMP1344 =
                      (/* template:parametric { */((md)(/* template:array_get { */((P).get(j))/* } */))/* } */);
                    
//#line 4124
final md X10_TEMP324 =
                      (X10_TEMP1344);
                    
//#line 4125
final int X10_TEMP1347 =
                      (0);
                    
//#line 4127
final int X10_TEMP326 =
                      (X10_TEMP1347);
                    
//#line 4128
final int X10_TEMP1351 =
                      (/* template:array_get { */((dataI).get(X10_TEMP326))/* } */);
                    
//#line 4130
final int X10_TEMP329 =
                      (X10_TEMP1351);
                    
//#line 4131
final int X10_TEMP1354 =
                      (X10_TEMP329);
                    
//#line 4133
final int X10_TEMP330 =
                      (X10_TEMP1354);
                    
//#line 4134
final int X10_TEMP1357 =
                      (X10_TEMP330);
                    
//#line 4136
final int X10_TEMP1360 =
                      (X10_TEMP1357);
                    
//#line 4137
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(X10_TEMP324))/* } */.interactions =
                      ((X10_TEMP1360));
                }
                		}
                	});/* } */
            }/* } */
            }
            /* } */
            
        }
        	} catch (Throwable tmp114) {
        		x10.lang.Runtime.getCurrentActivity().pushException(tmp114);
        	} finally {
        		x10.lang.Runtime.getCurrentActivity().stopFinish();
        	}
        }
        /* } */
        
    }
    
    
//#line 4142
public static void
                    Program_runMain(
                    ) {
        
//#line 4143
final Timer X10_TEMP576 =
          (new Timer(
             ));
        
//#line 4145
Timer tmr =
          (X10_TEMP576);
        
//#line 4146
final int X10_TEMP579 =
          (0);
        
//#line 4148
int count =
          (X10_TEMP579);
        
//#line 4149
Program0.
                        Program_Timer_start(
                        tmr,
                        count);
        
//#line 4150
Program0.
                        Program_md_exec();
        
//#line 4151
Program0.
                        Program_Timer_stop(
                        tmr,
                        count);
        
//#line 4152
final java.
          lang.
          String X10_TEMP586 =
          ("Wall-clock time for moldyn: ");
        
//#line 4154
final java.
          lang.
          String X10_TEMP6 =
          (X10_TEMP586);
        
//#line 4155
final double X10_TEMP591 =
          (Program0.
             Program_Timer_readTimer(
             tmr,
             count));
        
//#line 4157
final double X10_TEMP7 =
          (X10_TEMP591);
        
//#line 4158
final java.
          lang.
          String X10_TEMP594 =
          (X10_TEMP6 +
           X10_TEMP7);
        
//#line 4160
final java.
          lang.
          String X10_TEMP8 =
          (X10_TEMP594);
        
//#line 4161
final java.
          lang.
          String X10_TEMP597 =
          (" secs");
        
//#line 4163
final java.
          lang.
          String X10_TEMP9 =
          (X10_TEMP597);
        
//#line 4164
final java.
          lang.
          String X10_TEMP600 =
          (X10_TEMP8 +
           X10_TEMP9);
        
//#line 4166
final java.
          lang.
          String X10_TEMP11 =
          (X10_TEMP600);
        
//#line 4167
/* template:place-check { */((java.io.PrintStream) x10.lang.Runtime.hereCheck(java.
                                                                                                      lang.
                                                                                                      System.
                                                                                                      out))/* } */.println(X10_TEMP11);
    }
    
    
//#line 4169
public static int
                    Program__Timer_max_counters_init(
                    ) {
        
//#line 4170
final int X10_TEMP576 =
          (64);
        
//#line 4172
final int X10_TEMP2 =
          (X10_TEMP576);
        
//#line 4173
return X10_TEMP2;
    }
    
    
//#line 4175
public static void
                    Program_Timer_start(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 4176
final x10.
          lang.
          DoubleReferenceArray X10_TEMP576 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 4178
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP576));
        
//#line 4179
final long X10_TEMP579 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 4181
final double X10_TEMP5 =
          (X10_TEMP579);
        
//#line 4182
final double X10_TEMP582 =
          (X10_TEMP5);
        
//#line 4184
final double X10_TEMP6 =
          (X10_TEMP582);
        
//#line 4185
final double X10_TEMP586 =
          (X10_TEMP6);
        
//#line 4187
final double X10_TEMP589 =
          (X10_TEMP586);
        
//#line 4188
/* template:array_set { */(X10_TEMP1).set((X10_TEMP589),n)/* } */;
    }
    
    
//#line 4190
public static void
                    Program_Timer_stop(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 4191
final x10.
          lang.
          DoubleReferenceArray X10_TEMP576 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 4193
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP576));
        
//#line 4194
final long X10_TEMP579 =
          (java.
             lang.
             System.
             currentTimeMillis());
        
//#line 4196
final double X10_TEMP5 =
          (X10_TEMP579);
        
//#line 4197
final x10.
          lang.
          DoubleReferenceArray X10_TEMP582 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 4199
final x10.
          lang.
          DoubleReferenceArray X10_TEMP3 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP582));
        
//#line 4200
final double X10_TEMP586 =
          (/* template:array_get { */((X10_TEMP3).get(n))/* } */);
        
//#line 4202
final double X10_TEMP6 =
          (X10_TEMP586);
        
//#line 4203
final double X10_TEMP589 =
          (X10_TEMP5 -
             X10_TEMP6);
        
//#line 4205
final double X10_TEMP9 =
          (X10_TEMP589);
        
//#line 4206
final double X10_TEMP592 =
          (X10_TEMP9);
        
//#line 4208
final double X10_TEMP10 =
          (X10_TEMP592);
        
//#line 4209
final double X10_TEMP596 =
          (X10_TEMP10);
        
//#line 4211
final double X10_TEMP599 =
          (X10_TEMP596);
        
//#line 4212
/* template:array_set { */(X10_TEMP1).set((X10_TEMP599),n)/* } */;
        
//#line 4213
final x10.
          lang.
          DoubleReferenceArray X10_TEMP601 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 4215
final x10.
          lang.
          DoubleReferenceArray X10_TEMP11 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP601));
        
//#line 4216
final double X10_TEMP605 =
          (/* template:array_get { */((X10_TEMP11).get(n))/* } */);
        
//#line 4218
final double X10_TEMP14 =
          (X10_TEMP605);
        
//#line 4219
final int X10_TEMP608 =
          (1000);
        
//#line 4221
final double X10_TEMP15 =
          (X10_TEMP608);
        
//#line 4222
final double X10_TEMP611 =
          (X10_TEMP14 /
             X10_TEMP15);
        
//#line 4224
final double X10_TEMP16 =
          (X10_TEMP611);
        
//#line 4225
final double X10_TEMP615 =
          (X10_TEMP16);
        
//#line 4227
final double X10_TEMP618 =
          (X10_TEMP615);
        
//#line 4228
/* template:array_set { */(X10_TEMP11).set((X10_TEMP618),n)/* } */;
        
//#line 4229
final x10.
          lang.
          DoubleReferenceArray X10_TEMP620 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 4231
final x10.
          lang.
          DoubleReferenceArray X10_TEMP17 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP620));
        
//#line 4232
final x10.
          lang.
          DoubleReferenceArray X10_TEMP623 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 4234
final x10.
          lang.
          DoubleReferenceArray X10_TEMP19 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP623));
        
//#line 4235
final double X10_TEMP627 =
          (/* template:array_get { */((X10_TEMP17).get(n))/* } */);
        
//#line 4237
final double X10_TEMP22 =
          (X10_TEMP627);
        
//#line 4238
final double X10_TEMP631 =
          (/* template:array_get { */((X10_TEMP19).get(n))/* } */);
        
//#line 4240
final double X10_TEMP23 =
          (X10_TEMP631);
        
//#line 4241
final double X10_TEMP634 =
          (X10_TEMP22 +
             X10_TEMP23);
        
//#line 4243
final double X10_TEMP24 =
          (X10_TEMP634);
        
//#line 4244
final double X10_TEMP638 =
          (X10_TEMP24);
        
//#line 4246
final double X10_TEMP641 =
          (X10_TEMP638);
        
//#line 4247
/* template:array_set { */(X10_TEMP17).set((X10_TEMP641),n)/* } */;
    }
    
    
//#line 4249
public static double
                    Program_Timer_readTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 4250
final x10.
          lang.
          DoubleReferenceArray X10_TEMP576 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 4252
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP576));
        
//#line 4253
final double X10_TEMP580 =
          (/* template:array_get { */((X10_TEMP1).get(n))/* } */);
        
//#line 4255
final double X10_TEMP4 =
          (X10_TEMP580);
        
//#line 4256
return X10_TEMP4;
    }
    
    
//#line 4258
public static void
                    Program_Timer_resetTimer(
                    final Timer X10_TEMP0,
                    final int n) {
        
//#line 4259
final x10.
          lang.
          DoubleReferenceArray X10_TEMP576 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.total_time));
        
//#line 4261
final x10.
          lang.
          DoubleReferenceArray X10_TEMP1 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP576));
        
//#line 4262
final int X10_TEMP579 =
          (0);
        
//#line 4264
final double X10_TEMP5 =
          (X10_TEMP579);
        
//#line 4265
final double X10_TEMP582 =
          (X10_TEMP5);
        
//#line 4267
final double X10_TEMP6 =
          (X10_TEMP582);
        
//#line 4268
final double X10_TEMP586 =
          (X10_TEMP6);
        
//#line 4270
final double X10_TEMP589 =
          (X10_TEMP586);
        
//#line 4271
/* template:array_set { */(X10_TEMP1).set((X10_TEMP589),n)/* } */;
        
//#line 4272
final x10.
          lang.
          DoubleReferenceArray X10_TEMP591 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.start_time));
        
//#line 4274
final x10.
          lang.
          DoubleReferenceArray X10_TEMP7 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP591));
        
//#line 4275
final int X10_TEMP594 =
          (0);
        
//#line 4277
final double X10_TEMP11 =
          (X10_TEMP594);
        
//#line 4278
final double X10_TEMP597 =
          (X10_TEMP11);
        
//#line 4280
final double X10_TEMP12 =
          (X10_TEMP597);
        
//#line 4281
final double X10_TEMP601 =
          (X10_TEMP12);
        
//#line 4283
final double X10_TEMP604 =
          (X10_TEMP601);
        
//#line 4284
/* template:array_set { */(X10_TEMP7).set((X10_TEMP604),n)/* } */;
        
//#line 4285
final x10.
          lang.
          DoubleReferenceArray X10_TEMP606 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:place-check { */((Timer) x10.lang.Runtime.hereCheck(X10_TEMP0))/* } */.elapsed_time));
        
//#line 4287
final x10.
          lang.
          DoubleReferenceArray X10_TEMP13 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP606));
        
//#line 4288
final int X10_TEMP609 =
          (0);
        
//#line 4290
final double X10_TEMP17 =
          (X10_TEMP609);
        
//#line 4291
final double X10_TEMP612 =
          (X10_TEMP17);
        
//#line 4293
final double X10_TEMP18 =
          (X10_TEMP612);
        
//#line 4294
final double X10_TEMP616 =
          (X10_TEMP18);
        
//#line 4296
final double X10_TEMP619 =
          (X10_TEMP616);
        
//#line 4297
/* template:array_set { */(X10_TEMP13).set((X10_TEMP619),n)/* } */;
    }
    
    
//#line 4299
public static void
                    Program_Timer_resetAllTimers(
                    final Timer X10_TEMP0) {
        
//#line 4300
final int X10_TEMP576 =
          (0);
        
//#line 4302
int i =
          (X10_TEMP576);
        
//#line 4303
boolean X10_TEMP4 =
          (i <
             _Program__Timer_max_counters);
        
//#line 4304
boolean X10_TEMP581 =
          X10_TEMP4;
        
//#line 4305
while (X10_TEMP581) {
            
//#line 4306
Program0.
                            Program_Timer_resetTimer(
                            X10_TEMP0,
                            i);
            
//#line 4307
final int X10_TEMP585 =
              (i);
            
//#line 4309
final int X10_TEMP6 =
              (X10_TEMP585);
            
//#line 4310
final int X10_TEMP7 =
              (1);
            
//#line 4311
final int X10_TEMP589 =
              (i +
                 X10_TEMP7);
            
//#line 4312
i =
              ((X10_TEMP589));
            
//#line 4313
final boolean X10_TEMP591 =
              (i <
                 _Program__Timer_max_counters);
            
//#line 4314
X10_TEMP4 =
              ((X10_TEMP591));
            
//#line 4315
X10_TEMP581 =
              X10_TEMP4;
        }
    }
    
    
//#line 8
public Program0() {
        
//#line 8
super();
    }
}

class Program
extends x10.
  lang.
  Object
{
    
    
//#line 4321
public Program() {
        
//#line 4321
super();
    }
}

class Particle
extends x10.
  lang.
  Object
{
    
//#line 4325
public double
      xcoord;
    
//#line 4326
public double
      ycoord;
    
//#line 4327
public double
      zcoord;
    
//#line 4328
public double
      xvelocity;
    
//#line 4329
public double
      yvelocity;
    
//#line 4330
public double
      zvelocity;
    
//#line 4331
public double
      xforce;
    
//#line 4332
public double
      yforce;
    
//#line 4333
public double
      zforce;
    
    
//#line 4336
public Particle(final double xcoord0,
                                  final double ycoord0,
                                  final double zcoord0,
                                  final double xvelocity0,
                                  final double yvelocity0,
                                  final double zvelocity0,
                                  final double xforce0,
                                  final double yforce0,
                                  final double zforce0) {
        
//#line 4336
super();
        
//#line 4337
final double X10_TEMP576 =
          (xcoord0);
        
//#line 4339
xcoord =
          ((X10_TEMP576));
        
//#line 4340
final double X10_TEMP579 =
          (ycoord0);
        
//#line 4342
ycoord =
          ((X10_TEMP579));
        
//#line 4343
final double X10_TEMP582 =
          (zcoord0);
        
//#line 4345
zcoord =
          ((X10_TEMP582));
        
//#line 4346
final double X10_TEMP585 =
          (xvelocity0);
        
//#line 4348
xvelocity =
          ((X10_TEMP585));
        
//#line 4349
final double X10_TEMP588 =
          (yvelocity0);
        
//#line 4351
yvelocity =
          ((X10_TEMP588));
        
//#line 4352
final double X10_TEMP591 =
          (zvelocity0);
        
//#line 4354
zvelocity =
          ((X10_TEMP591));
        
//#line 4355
final double X10_TEMP594 =
          (xforce0);
        
//#line 4357
xforce =
          ((X10_TEMP594));
        
//#line 4358
final double X10_TEMP597 =
          (yforce0);
        
//#line 4360
yforce =
          ((X10_TEMP597));
        
//#line 4361
final double X10_TEMP600 =
          (zforce0);
        
//#line 4363
zforce =
          ((X10_TEMP600));
    }
}

class Random
extends x10.
  lang.
  Object
{
    
//#line 4370
public int
      iseed;
    
//#line 4371
public double
      v1;
    
//#line 4372
public double
      v2;
    
    
//#line 4375
public Random(final int iseed0,
                                final double v10,
                                final double v20) {
        
//#line 4375
super();
        
//#line 4376
final int X10_TEMP576 =
          (iseed0);
        
//#line 4378
iseed =
          ((X10_TEMP576));
        
//#line 4379
final double X10_TEMP579 =
          (v10);
        
//#line 4381
v1 =
          ((X10_TEMP579));
        
//#line 4382
final double X10_TEMP582 =
          (v20);
        
//#line 4384
v2 =
          ((X10_TEMP582));
    }
}

class md
extends x10.
  lang.
  Object
{
    
//#line 4391
public x10.
      lang.
      GenericReferenceArray
      one;
    
//#line 4392
public double
      epot;
    
//#line 4393
public double
      vir;
    
//#line 4394
public int
      interactions;
    
//#line 4395
public double
      count;
    
//#line 4396
public int
      mdsize;
    
//#line 4397
public double
      l;
    
//#line 4398
public double
      rcoff;
    
//#line 4399
public double
      rcoffs;
    
//#line 4400
public double
      side;
    
//#line 4401
public double
      sideh;
    
//#line 4402
public double
      hsq;
    
//#line 4403
public double
      hsq2;
    
//#line 4404
public double
      a;
    
//#line 4405
public double
      tscale;
    
//#line 4406
public double
      sc;
    
//#line 4407
public double
      ekin;
    
//#line 4408
public double
      ek;
    
//#line 4409
public double
      vaver;
    
//#line 4410
public double
      vaverh;
    
//#line 4411
public double
      etot;
    
//#line 4412
public double
      temp;
    
//#line 4413
public double
      pres;
    
//#line 4414
public double
      rp;
    
//#line 4415
public int
      npartm;
    
//#line 4416
public int
      rnk;
    
//#line 4417
public int
      nprocess;
    
    
//#line 4390
public md() {
        
//#line 4390
super();
    }
}

class Timer
extends x10.
  lang.
  Object
{
    
//#line 4423
final public x10.
      lang.
      DoubleReferenceArray
      start_time;
    
//#line 4424
final public x10.
      lang.
      DoubleReferenceArray
      elapsed_time;
    
//#line 4425
final public x10.
      lang.
      DoubleReferenceArray
      total_time;
    
    
//#line 4428
public Timer() {
        
//#line 4428
super();
        
//#line 4429
final int X10_TEMP576 =
          (0);
        
//#line 4431
int i =
          (X10_TEMP576);
        
//#line 4432
final int X10_TEMP579 =
          (0);
        
//#line 4434
final int X10_TEMP4 =
          (X10_TEMP579);
        
//#line 4435
final int X10_TEMP582 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 4437
final int X10_TEMP5 =
          (X10_TEMP582);
        
//#line 4438
final x10.
          lang.
          region X10_TEMP587 =
          (x10.
            lang.
            region)
            ((x10.
                lang.
                region.
                factory.
                region(
                x10.
                  lang.
                  region.
                  factory.
                  region(
                  X10_TEMP4,
                  X10_TEMP5))));
        
//#line 4440
final x10.
          lang.
          region X10_TEMP6 =
          (x10.
            lang.
            region)
            ((X10_TEMP587));
        
//#line 4441
final x10.
          lang.
          place X10_TEMP590 =
          (x10.
             lang.
             place.
             FIRST_PLACE);
        
//#line 4443
final x10.
          lang.
          place X10_TEMP7 =
          (X10_TEMP590);
        
//#line 4444
final x10.
          lang.
          dist X10_TEMP593 =
          (x10.
            lang.
            dist)
            ((x10.
                lang.
                dist.
                factory.
                constant(
                X10_TEMP6,
                X10_TEMP7)));
        
//#line 4446
final x10.
          lang.
          dist d =
          (x10.
            lang.
            dist)
            ((X10_TEMP593));
        
//#line 4447
final x10.
          lang.
          DoubleReferenceArray X10_TEMP596 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4449
final x10.
          lang.
          DoubleReferenceArray X10_TEMP10 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP596));
        
//#line 4450
final x10.
          lang.
          DoubleReferenceArray X10_TEMP599 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP10));
        
//#line 4452
start_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP599));
        
//#line 4453
final x10.
          lang.
          DoubleReferenceArray X10_TEMP602 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4455
final x10.
          lang.
          DoubleReferenceArray X10_TEMP12 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP602));
        
//#line 4456
final x10.
          lang.
          DoubleReferenceArray X10_TEMP605 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP12));
        
//#line 4458
elapsed_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP605));
        
//#line 4459
final x10.
          lang.
          DoubleReferenceArray X10_TEMP608 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((/* template:array_specialized_init { */x10.array.sharedmemory.SpecializedArrayFactory.factory.DoubleArray(d,(x10.array.Operator.Pointwise)null,true,true,false)/* } */));
        
//#line 4461
final x10.
          lang.
          DoubleReferenceArray X10_TEMP14 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP608));
        
//#line 4462
final x10.
          lang.
          DoubleReferenceArray X10_TEMP611 =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP14));
        
//#line 4464
total_time =
          (x10.
            lang.
            DoubleReferenceArray)
            ((X10_TEMP611));
        
//#line 4465
final int X10_TEMP614 =
          (Program0.
             _Program__Timer_max_counters);
        
//#line 4467
final int X10_TEMP15 =
          (X10_TEMP614);
        
//#line 4468
boolean X10_TEMP19 =
          (i <
             X10_TEMP15);
        
//#line 4469
boolean X10_TEMP619 =
          X10_TEMP19;
        
//#line 4470
while (X10_TEMP619) {
            
//#line 4471
final int X10_TEMP621 =
              (0);
            
//#line 4473
final double X10_TEMP23 =
              (X10_TEMP621);
            
//#line 4474
final double X10_TEMP624 =
              (X10_TEMP23);
            
//#line 4476
final double X10_TEMP24 =
              (X10_TEMP624);
            
//#line 4477
final double X10_TEMP628 =
              (X10_TEMP24);
            
//#line 4479
final double X10_TEMP631 =
              (X10_TEMP628);
            
//#line 4480
/* template:array_set { */(start_time).set((X10_TEMP631),i)/* } */;
            
//#line 4481
final int X10_TEMP633 =
              (0);
            
//#line 4483
final double X10_TEMP28 =
              (X10_TEMP633);
            
//#line 4484
final double X10_TEMP636 =
              (X10_TEMP28);
            
//#line 4486
final double X10_TEMP29 =
              (X10_TEMP636);
            
//#line 4487
final double X10_TEMP640 =
              (X10_TEMP29);
            
//#line 4489
final double X10_TEMP643 =
              (X10_TEMP640);
            
//#line 4490
/* template:array_set { */(elapsed_time).set((X10_TEMP643),i)/* } */;
            
//#line 4491
final int X10_TEMP645 =
              (0);
            
//#line 4493
final double X10_TEMP33 =
              (X10_TEMP645);
            
//#line 4494
final double X10_TEMP648 =
              (X10_TEMP33);
            
//#line 4496
final double X10_TEMP34 =
              (X10_TEMP648);
            
//#line 4497
final double X10_TEMP652 =
              (X10_TEMP34);
            
//#line 4499
final double X10_TEMP655 =
              (X10_TEMP652);
            
//#line 4500
/* template:array_set { */(total_time).set((X10_TEMP655),i)/* } */;
            
//#line 4501
final int X10_TEMP657 =
              (i);
            
//#line 4503
final int X10_TEMP35 =
              (X10_TEMP657);
            
//#line 4504
final int X10_TEMP36 =
              (1);
            
//#line 4505
final int X10_TEMP661 =
              (i +
                 X10_TEMP36);
            
//#line 4506
i =
              ((X10_TEMP661));
            
//#line 4507
final int X10_TEMP663 =
              (Program0.
                 _Program__Timer_max_counters);
            
//#line 4509
final int X10_TEMP17 =
              (X10_TEMP663);
            
//#line 4510
final boolean X10_TEMP666 =
              (i <
                 X10_TEMP17);
            
//#line 4511
X10_TEMP19 =
              ((X10_TEMP666));
            
//#line 4512
X10_TEMP619 =
              X10_TEMP19;
        }
    }
}
