#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.6.0_04
#export JAVA_HOME=/usr/lib/jvm/java-6-sun/
#time /r/rfhaque/project/x10/xre/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true Test.x10
#time /r/rfhaque/project/x10/xre/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true Test
time /project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true Test.x10
time /project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true Test
