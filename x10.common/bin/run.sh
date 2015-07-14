#!/bin/bash

if [ $1 = 0 ]
then
export JAVA_HOME=/usr/lib/jvm/java-6-openjdk/
/project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true RunMain.x10
/project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true RunMain
fi
if [ $1 != 0 ]
then
export JAVA_HOME=/usr/lib/jvm/java-6-openjdk/
/r/rfhaque/project/x10/xre/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true RunMain.x10
/r/rfhaque/project/x10/xre/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true RunMain
fi
