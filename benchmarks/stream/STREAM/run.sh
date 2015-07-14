#!/bin/bash

/project/jkenl/x10/x10.common/bin/x10c -d directoryForGeneratedFiles -BAD_PLACE_RUNTIME_CHECK=true Stream.x10
project/jkenl/x10/x10.common/bin/x10 -BAD_PLACE_RUNTIME_CHECK=true -classpath directoryForGeneratedfiles -NUMBER_OF_LOCAL_PLACES=4 Stream localSize
