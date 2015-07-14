#!/bin/bash

exe=./eof
base=test_eof

# ----------------------------------------------------------------------------------
# All it has to do is execute successfully
# ----------------------------------------------------------------------------------
echo -n "TEST: basic operation..."
if ! $exe; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# "test" mstime as well...
./mstime > /dev/null
