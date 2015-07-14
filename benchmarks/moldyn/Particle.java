import x10.lang.*;

public class Particle
extends x10.
  lang.
  Object
{
    
//#line 12
public double
      xcoord;
    
//#line 13
public double
      ycoord;
    
//#line 14
public double
      zcoord;
    
//#line 15
public double
      xvelocity;
    
//#line 16
public double
      yvelocity;
    
//#line 17
public double
      zvelocity;
    
//#line 18
public double
      xforce;
    
//#line 19
public double
      yforce;
    
//#line 20
public double
      zforce;
    
    
//#line 22
public Particle(final double xcoord0,
                                final double ycoord0,
                                final double zcoord0,
                                final double xvelocity0,
                                final double yvelocity0,
                                final double zvelocity0,
                                final double xforce0,
                                final double yforce0,
                                final double zforce0) {
        
//#line 24
super();
        
//#line 25
xcoord =
          xcoord0;
        
//#line 26
ycoord =
          ycoord0;
        
//#line 27
zcoord =
          zcoord0;
        
//#line 28
xvelocity =
          xvelocity0;
        
//#line 29
yvelocity =
          yvelocity0;
        
//#line 30
zvelocity =
          zvelocity0;
        
//#line 31
xforce =
          xforce0;
        
//#line 32
yforce =
          yforce0;
        
//#line 33
zforce =
          zforce0;
    }
    
    
//#line 36
public void
                  domove(
                  final double side) {
        
//#line 37
xcoord =
          xcoord +
            xvelocity +
            xforce;
        
//#line 38
ycoord =
          ycoord +
            yvelocity +
            yforce;
        
//#line 39
zcoord =
          zcoord +
            zvelocity +
            zforce;
        
//#line 41
if (xcoord <
                          0) {
            
//#line 41
xcoord =
              xcoord +
                side;
        }
        
//#line 42
if (xcoord >
                          side) {
            
//#line 42
xcoord =
              xcoord -
                side;
        }
        
//#line 43
if (ycoord <
                          0) {
            
//#line 43
ycoord =
              ycoord +
                side;
        }
        
//#line 44
if (ycoord >
                          side) {
            
//#line 44
ycoord =
              ycoord -
                side;
        }
        
//#line 45
if (zcoord <
                          0) {
            
//#line 45
zcoord =
              zcoord +
                side;
        }
        
//#line 46
if (zcoord >
                          side) {
            
//#line 46
zcoord =
              zcoord -
                side;
        }
        
//#line 48
xvelocity =
          xvelocity +
            xforce;
        
//#line 49
yvelocity =
          yvelocity +
            yforce;
        
//#line 50
zvelocity =
          zvelocity +
            zforce;
        
//#line 52
xforce =
          0.0;
        
//#line 53
yforce =
          0.0;
        
//#line 54
zforce =
          0.0;
    }
    
    
//#line 57
public void
                  force(
                  final double side,
                  final double rcoff,
                  final int mdsize,
                  final int x,
                  final md md1) {
        
//#line 58
double sideh =
          0.0;
        
//#line 59
double rcoffs =
          0.0;
        
//#line 61
double xx =
          0.0;
        
//#line 62
double yy =
          0.0;
        
//#line 63
double zz =
          0.0;
        
//#line 64
double xi =
          0.0;
        
//#line 65
double yi =
          0.0;
        
//#line 66
double zi =
          0.0;
        
//#line 67
double fxi =
          0.0;
        
//#line 68
double fyi =
          0.0;
        
//#line 69
double fzi =
          0.0;
        
//#line 70
double rd =
          0.0;
        
//#line 71
double rrd =
          0.0;
        
//#line 72
double rrd2 =
          0.0;
        
//#line 73
double rrd3 =
          0.0;
        
//#line 74
double rrd4 =
          0.0;
        
//#line 75
double rrd6 =
          0.0;
        
//#line 76
double rrd7 =
          0.0;
        
//#line 77
double r148 =
          0.0;
        
//#line 78
double forcex =
          0.0;
        
//#line 79
double forcey =
          0.0;
        
//#line 80
double forcez =
          0.0;
        
//#line 83
sideh =
          0.5 *
            side;
        
//#line 84
rcoffs =
          rcoff *
            rcoff;
        
//#line 86
xi =
          xcoord;
        
//#line 87
yi =
          ycoord;
        
//#line 88
zi =
          zcoord;
        
//#line 89
fxi =
          0.0;
        
//#line 90
fyi =
          0.0;
        
//#line 91
fzi =
          0.0;
        
//#line 93
/* template:forloop { */
        for (java.util.Iterator i__ = (x10.
                                         lang.
                                         region.
                                         factory.
                                         region(
                                         x10.
                                           lang.
                                           region.
                                           factory.
                                           region(
                                           x +
                                             1,
                                           mdsize -
                                             1))).iterator(); i__.hasNext(); ) {
        	final  x10.
          lang.
          point i = (x10.
          lang.
          point) i__.next();
        	/* Join: { *//* Join: { *//* } */
{
            
//#line 94
xx =
              xi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xcoord;
            
//#line 95
yy =
              yi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.ycoord;
            
//#line 96
zz =
              zi -
                /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zcoord;
            
//#line 98
if (xx <
                              ((-sideh))) {
                
//#line 98
xx =
                  xx +
                    side;
            }
            
//#line 99
if (xx >
                              ((sideh))) {
                
//#line 99
xx =
                  xx -
                    side;
            }
            
//#line 100
if (yy <
                               ((-sideh))) {
                
//#line 100
yy =
                  yy +
                    side;
            }
            
//#line 101
if (yy >
                               ((sideh))) {
                
//#line 101
yy =
                  yy -
                    side;
            }
            
//#line 102
if (zz <
                               ((-sideh))) {
                
//#line 102
zz =
                  zz +
                    side;
            }
            
//#line 103
if (zz >
                               ((sideh))) {
                
//#line 103
zz =
                  zz -
                    side;
            }
            
//#line 105
rd =
              xx *
                xx +
                yy *
                yy +
                zz *
                zz;
            
//#line 107
if (rd <=
                               rcoffs) {
                
//#line 108
rrd =
                  1.0 /
                    rd;
                
//#line 109
rrd2 =
                  rrd *
                    rrd;
                
//#line 110
rrd3 =
                  rrd2 *
                    rrd;
                
//#line 111
rrd4 =
                  rrd2 *
                    rrd2;
                
//#line 112
rrd6 =
                  rrd2 *
                    rrd4;
                
//#line 113
rrd7 =
                  rrd6 *
                    rrd;
                
//#line 114
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot =
                  /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.epot +
                    ((rrd6 -
                        rrd3));
                
//#line 115
r148 =
                  rrd7 -
                    0.5 *
                    rrd4;
                
//#line 116
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir =
                  /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.vir -
                    rd *
                    r148;
                
//#line 117
forcex =
                  xx *
                    r148;
                
//#line 118
fxi =
                  fxi +
                    forcex;
                
//#line 119
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.xforce -
                    forcex;
                
//#line 120
forcey =
                  yy *
                    r148;
                
//#line 121
fyi =
                  fyi +
                    forcey;
                
//#line 122
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.yforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.yforce -
                    forcey;
                
//#line 123
forcez =
                  zz *
                    r148;
                
//#line 124
fzi =
                  fzi +
                    forcez;
                
//#line 125
/* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zforce =
                  /* template:place-check { */((Particle) x10.lang.Runtime.hereCheck(/* template:parametric { */((Particle)(/* template:array_get { */((/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.one).get(i))/* } */))/* } */))/* } */.zforce -
                    forcez;
                
//#line 126
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.interactions++;
            }
        }/* } */
        }
        /* } */
        
        
//#line 130
xforce =
          xforce +
            fxi;
        
//#line 131
yforce =
          yforce +
            fyi;
        
//#line 132
zforce =
          zforce +
            fzi;
    }
    
    
//#line 135
public double
                   mkekin(
                   final double hsq2) {
        
//#line 136
double sumt =
          0.0;
        
//#line 138
xforce =
          xforce *
            hsq2;
        
//#line 139
yforce =
          yforce *
            hsq2;
        
//#line 140
zforce =
          zforce *
            hsq2;
        
//#line 142
xvelocity =
          xvelocity +
            xforce;
        
//#line 143
yvelocity =
          yvelocity +
            yforce;
        
//#line 144
zvelocity =
          zvelocity +
            zforce;
        
//#line 146
sumt =
          ((xvelocity *
              xvelocity)) +
            ((yvelocity *
                yvelocity)) +
            ((zvelocity *
                zvelocity));
        
//#line 149
return sumt;
    }
    
    
//#line 152
public double
                   velavg(
                   final double vaverh,
                   final double h,
                   final md md1) {
        
//#line 153
double velt =
          0.0;
        
//#line 154
double sq =
          0.0;
        
//#line 156
sq =
          java.
            lang.
            Math.
            sqrt(
            xvelocity *
              xvelocity +
              yvelocity *
              yvelocity +
              zvelocity *
              zvelocity);
        
//#line 159
if (sq >
                           vaverh) {
            
//#line 159
/* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count =
              /* template:place-check { */((md) x10.lang.Runtime.hereCheck(md1))/* } */.count +
                1.0;
        }
        
//#line 161
velt =
          sq;
        
//#line 162
return velt;
    }
    
    
//#line 165
public void
                   dscal(
                   final double sc,
                   final int incx) {
        
//#line 166
xvelocity =
          xvelocity *
            sc;
        
//#line 167
yvelocity =
          yvelocity *
            sc;
        
//#line 168
zvelocity =
          zvelocity *
            sc;
    }
}
