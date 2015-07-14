#!/bin/bash

exe=./vtimekeeper
base=test_vtimekeeper

# ----------------------------------------------------------------------------------
echo -n "TEST: no arguments..."

if $exe >> /dev/null 2>>/dev/null; then
  echo "FAIL: $exe should have failed"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: zero processes..."

if ! $exe 0 < /dev/null > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: one process, no events..."

cat > $base.in <<EOF
VTACK 1
EOF

if ! $exe 1 < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
END
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: one process, one event at zero..."

cat > $base.in <<EOF
EVENT someProcess 0 someEvent
VTACK 1
VTACK 1
END
EOF

if ! $exe 1 < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
VTIME 0
END
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: one process, some more events..."

cat > $base.in <<EOF
EVENT someEvent someProcess 0
EVENT anotherEvent anotherProcess 10
VTACK 1
VTACK 1
VTACK 1
EVENT 3rdEvent anotherProcess 10000
VTACK 1
VTACK 1
EOF

if ! $exe 2 < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
VTIME 0
VTIME 10
VTIME 10000
END
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: three processes, some more events..."

cat > $base.in <<EOF
EVENT someEvent someProcess 0
EVENT anotherEvent anotherProcess 10
VTACK 1
VTACK 1
VTACK 1
VTACK 1
EVENT 3rdEvent anotherProcess 10000
VTACK 1
VTACK 1
EOF

if ! $exe 3 < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
VTIME 0
VTIME 10
VTIME 10000
END
EOF

if ! diff $base.oracle $base.out; then
    echo "FAIL: actual does not match expected"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: 10 processes, some more events..."

cat > $base.in <<EOF
EVENT someEvent someProcess 0
EVENT anotherEvent anotherProcess 10
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
VTACK 1
EVENT 3rdEvent anotherProcess 10000
VTACK 1
VTACK 1
EOF

if ! $exe 10 < $base.in > $base.out 2>>/dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi

cat > $base.oracle <<EOF
VTIME 0
VTIME 0
VTIME 10
VTIME 10000
END
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

