#!/bin/bash

exe=./consumer
base=test_consumer

# ----------------------------------------------------------------------------------
echo -n "TEST: no arguments..."

if $exe >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: one arguments..."

if $exe dummyProcessName >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid argument format 1..."

if $exe dummyProcessName dummyRetailer:junkItem >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid argument format 2..."

if $exe dummyProcessName dummyRetailer:junkItem:quantity >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid argument format 3..."

if $exe dummyProcessName dummyRetailer:junkItem:quantity:delay >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid argument format 3..."

if $exe dummyProcessName dummyRetailer:junkItem:0:100 >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: valid call, one item, zero delay..."

cat > $base.in <<EOF
VTIME 0
EOF

cat > $base.oracle <<EOF
EVENT Order dummyRetailer 0 deliverTo = dummyProcessName item = dummyItem orderId = 1804289383 quantity = 1
VTACK 1
EOF

if ! $exe 'dummyProcessName|dummyRetailer:dummyItem:1:0' < $base.in > $base.out; then
  echo "FAIL: $exe failed"
  exit 1
fi
if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: valid call, one item, non-zero delay..."

cat > $base.in <<EOF
VTIME 0
EOF

cat > $base.oracle <<EOF
EVENT Order dummyRetailer 1012 deliverTo = dummyProcessName item = dummyItem orderId = 1804289383 quantity = 1
VTACK 1
EOF

if ! $exe dummyProcessName\|dummyRetailer:dummyItem:1:1012 < $base.in > $base.out; then
  echo "FAIL: $exe failed"
  exit 1
fi
if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: valid call, multiple items..."

cat > $base.in <<EOF
VTIME 0
EOF

cat > $base.oracle <<EOF
EVENT Order dummyRetailer 1012 deliverTo = dummyProcessName item = dummyItem orderId = 1804289383 quantity = 1
EVENT Order dummyRetailer2 5 deliverTo = dummyProcessName item = item2 orderId = 846930886 quantity = 10001
VTACK 1
EOF

if ! $exe dummyProcessName\|dummyRetailer:dummyItem:1:1012,dummyRetailer2:item2:10001:5 < $base.in > $base.out; then
  echo "FAIL: $exe failed"
  exit 1
fi
if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: single item and delivery..."

cat > $base.in <<EOF
VTIME 0
EVENT Delivery dummyProcessName 2000 item = dummyItem orderId = 1804289383 quantity = 1
VTIME 2000
EOF

cat > $base.oracle <<EOF
EVENT Order dummyRetailer 1012 deliverTo = dummyProcessName item = dummyItem orderId = 1804289383 quantity = 1
VTACK 1
VTACK 1
EOF

if ! $exe dummyProcessName\|dummyRetailer:dummyItem:1:1012 < $base.in > $base.out; then
  echo "FAIL: $exe failed"
  exit 1
fi
if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out

