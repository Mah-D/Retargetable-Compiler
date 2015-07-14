#!/bin/sh
# make sure configure was run with coverage enabled...
lcov --directory . --zerocounters
make check
lcov --directory . --capture --output-file app.info
rm -rf doc/coverage
mkdir doc/coverage
genhtml -o doc/coverage app.info
