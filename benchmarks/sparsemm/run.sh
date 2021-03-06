#!/bin/bash

rm *.class
rm *.java

if [ $1 = 0 ]
then
export JAVA_HOME=/usr/java/jdk1.6.0_04
/project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true SparseMatmultMain.x10 Timer.x10 
/project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true SparseMatmultMain -NUMBER_OF_LOCAL_PLACES=10
fi
if [ $1 != 0 ]
then
export JAVA_HOME=/usr/lib/jvm/java-6-sun/
/r/rfhaque/project/x10/xre/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true SparseMatmultMain.x10 Timer.x10
/r/rfhaque/project/x10/xre/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true SparseMatmultMain -NUMBER_OF_LOCAL_PLACES=10
fi
