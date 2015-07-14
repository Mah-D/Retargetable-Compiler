#!/bin/bash

exe=./statekeeper
base=test_statekeeper

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid arguments..."

if $exe these arguments should not be here < /dev/null >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: ignoring unrecognized inputs..."

cat > $base.in <<EOF
# this comment should be ignored
VTIME 10
EVENT someEvent someProcess 0
EVENT someEvent someProcess 0
# another comment
VTIME 100000
EOF

if ! $exe < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: some state output..."

cat > $base.in <<EOF
# this comment should be ignored
VTIME 10
STATE processType processName 1010101 name1 value1
EVENT someEvent someProcess 0
EVENT someEvent someProcess 0
STATE processType2 processName2 20 name2 value
# another comment
VTIME 100000
EOF

if ! $exe < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
1010101	processType	processName	name1	value1
20	processType2	processName2	name2	value
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

