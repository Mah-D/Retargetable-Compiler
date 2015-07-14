#!/bin/bash

if [ $1 = 0 ]
then
export JAVA_HOME=/usr/java/jdk1.6.0_04
fi
if [ $1 != 0 ]
then
export JAVA_HOME=/usr/lib/jvm/java-6-sun/
fi
export PATH=${JAVA_HOME}/bin:$PATH
export HJ_HOME=/r/rfhaque/Desktop/hj-1.1.0.1
export PATH=$HJ_HOME/bin:$PATH
#/r/rfhaque/Desktop/hj-1.1.0.1/bin/hjc RunMain.hj
#/r/rfhaque/Desktop/hj-1.1.0.1/bin/hj RunMain
hjc StreamHJ.hj
hj StreamHJ
