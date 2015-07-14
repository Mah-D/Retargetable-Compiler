#!/bin/bash

exe=./manufacturer
base=test_manufacturer

# ----------------------------------------------------------------------------------
echo -n "TEST: no arguments..."

if $exe >> /dev/null 2>$base.err; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: only process name..."

if $exe dummyProcessName >> /dev/null 2>$base.err; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: invalid argument format..."

if $exe 'dummyProcessName|dummyItem@junk' >> /dev/null 2>$base.err; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: a few Orders received..."

cat > $base.in <<EOF
EVENT Order dummyProcessName 0 item = item1 orderId = 12 quantity = 20 deliverTo = retailer1
EVENT Order dummyProcessName 0 item = item2 orderId = 13 quantity = 1 deliverTo = retailer2
VTIME 0
EOF

if ! $exe 'dummyProcessName|item1:10,item2:20' < $base.in >$base.out 2>$base.err; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
EVENT Delivery retailer1 10 item = item1 orderId = 12 quantity = 20
EVENT Delivery retailer2 20 item = item2 orderId = 13 quantity = 1
VTACK 1
EOF

if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: a few Orders received at different times..."

cat > $base.in <<EOF
EVENT Order dummyProcessName 100 item = item1 orderId = 12 quantity = 20 deliverTo = retailer1
EVENT Order dummyProcessName 20 item = item2 orderId = 13 quantity = 1 deliverTo = retailer2
VTIME 10
EVENT Order dummyProcessName 21 item = item3 orderId = 15 quantity = 1000 deliverTo = retailer3
VTIME 20
VTIME 21
VTIME 100
EOF

if ! $exe 'dummyProcessName|item1:10,item2:20,item3:100' < $base.in >$base.out 2>$base.err; then
  echo "FAIL: output differs from expected"
  exit 1
fi

cat > $base.oracle <<EOF
EVENT Delivery retailer2 40 item = item2 orderId = 13 quantity = 1
VTACK 1
EVENT Delivery retailer3 121 item = item3 orderId = 15 quantity = 1000
VTACK 1
EVENT Delivery retailer1 110 item = item1 orderId = 12 quantity = 20
VTACK 1
EOF

if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: a few Orders received for multiple manufacturers..."

cat > $base.in <<EOF
EVENT Order dummyProcessName 0 item = item1 orderId = 12 quantity = 20 deliverTo = retailer1
EVENT Order dummyProcessName2 0 item = item3 orderId = 15 quantity = 25 deliverTo = retailer3
EVENT Order dummyProcessName 0 item = item2 orderId = 13 quantity = 1 deliverTo = retailer2
EVENT Order dummyProcessName2 0 item = item4 orderId = 16 quantity = 2 deliverTo = retailer4
VTIME 0
EOF

if ! $exe 'dummyProcessName|item1:10,item2:20' 'dummyProcessName2|item3:20,item4:40' < $base.in >$base.out 2>$base.err; then
  echo "FAIL: output differs from expected"
  exit 1
fi

cat > $base.oracle <<EOF
EVENT Delivery retailer1 10 item = item1 orderId = 12 quantity = 20
EVENT Delivery retailer2 20 item = item2 orderId = 13 quantity = 1
EVENT Delivery retailer3 20 item = item3 orderId = 15 quantity = 25
EVENT Delivery retailer4 40 item = item4 orderId = 16 quantity = 2
VTACK 2
EOF

if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: a few Orders received at different times -- multiple manufacturers..."

cat > $base.in <<EOF
EVENT Order dummyProcessName 100 item = item1 orderId = 12 quantity = 20 deliverTo = retailer1
EVENT Order dummyProcessName2 100 item = item9 orderId = 20 quantity = 5 deliverTo = retailer9
EVENT Order dummyProcessName 20 item = item2 orderId = 13 quantity = 1 deliverTo = retailer2
VTIME 10
EVENT Order dummyProcessName 21 item = item3 orderId = 15 quantity = 1000 deliverTo = retailer3
EVENT Order dummyProcessName2 21 item = item11 orderId = 21 quantity = 1000 deliverTo = retailer10
VTIME 20
VTIME 21
VTIME 100
EOF

if ! $exe 'dummyProcessName|item1:10,item2:20,item3:100' 'dummyProcessName2|item9:20,item10:30,item11:200' < $base.in >$base.out 2>$base.err; then
  echo "FAIL: output differs from expected"
  exit 1
fi

cat > $base.oracle <<EOF
EVENT Delivery retailer2 40 item = item2 orderId = 13 quantity = 1
VTACK 1
EVENT Delivery retailer3 121 item = item3 orderId = 15 quantity = 1000
EVENT Delivery retailer10 221 item = item11 orderId = 21 quantity = 1000
VTACK 2
EVENT Delivery retailer1 110 item = item1 orderId = 12 quantity = 20
EVENT Delivery retailer9 120 item = item9 orderId = 20 quantity = 5
VTACK 2
EOF

if ! diff $base.oracle $base.out > /dev/null; then
    echo "FAIL: output differs from expected"
    exit 1
fi

echo "PASS"


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.in1 $base.in2 $base.in3 $base.oracle $base.out $base.err

