#!/bin/bash

export JAVA_HOME=/usr/java/jdk1.6.0_04
/project/jkenl/x10/x10.common/bin/x10c -BAD_PLACE_RUNTIME_CHECK=true Stream.x10
/project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true -NUMBER_OF_LOCAL_PLACES=4 Stream 8
