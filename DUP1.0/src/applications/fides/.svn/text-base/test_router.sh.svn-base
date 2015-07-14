#!/bin/bash
#Test case for router program

exe=./router
base=test_router

cat > $base.in <<EOF
EVENT testEvent1 t1 42
EVENT testEvent2 t2 42
EVENT testEvent3 t3 42
EVENT testEvent4 t1 42
EVENT testEvent5 t2 42
EVENT testEvent6 t3 42
VTIME 100
VTACK
END
EOF

cat > test_router_1.good <<EOF
EVENT testEvent1 t1 42
EVENT testEvent4 t1 42
VTACK
EOF

cat > test_router_2.good <<EOF
EVENT testEvent2 t2 42
EVENT testEvent5 t2 42
EOF

cat > test_router_3.good <<EOF
EVENT testEvent3 t3 42
EVENT testEvent6 t3 42
EOF


#Actual test
if $exe t1:1,t2:2,t3:3 1>test_router_1.out 2>test_router_2.out 3>test_router_3.out < test_router.in; then
  diff test_router_1.out test_router_1.good > /dev/null
  if [ $? -ne 0 ]; then
  	echo "diff test_router_1.out test_router_1.good differ"
  	echo "FAIL"
  	exit 1
  fi
  diff test_router_2.out test_router_2.good > /dev/null
  if [ $? -ne 0 ]; then
  	echo "FAIL"
  	exit 1
  fi
  diff test_router_3.out test_router_3.good > /dev/null
  if [ $? -ne 0 ]; then
  	echo "FAIL"
  	exit 1
  fi
fi

echo "PASS"
