#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.6.0_04
rm *.class
rm *.java
/project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true MGDriver.x10 
/project/jkenl/x10/x10.common/bin/x10 -J-mx1000m -J-ms1000m -libpath . -classpath . -NUMBER_OF_LOCAL_PLACES=4 -INIT_THREADS_PER_PLACE=1 -ABSTRACT_EXECUTION_STATS=boolean -BAD_PLACE_RUNTIME_CHECK=true NPB3_0_X10.MGDriver -s
