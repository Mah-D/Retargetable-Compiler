#!/bin/bash

rm *.class
rm *.java

if [ $1 = 0 ]
then
export JAVA_HOME=/usr/java/jdk1.6.0_04
/project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true MGMain.x10 
/project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true -J-mx1000m -J-ms1000m -libpath . -classpath . -NUMBER_OF_LOCAL_PLACES=4 -INIT_THREADS_PER_PLACE=1 -ABSTRACT_EXECUTION_STATS=true MGMain -s
fi
if [ $1 != 0 ]
then
export JAVA_HOME=/usr/lib/jvm/java-6-sun/
/r/rfhaque/project/x10/xre/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true MGMain.x10
/r/rfhaque/project/x10/xre/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true -J-mx1000m -J-ms1000m -libpath . -classpath . -NUMBER_OF_LOCAL_PLACES=4 -INIT_THREADS_PER_PLACE=1 -ABSTRACT_EXECUTION_STATS=true MGMain -s
fi
