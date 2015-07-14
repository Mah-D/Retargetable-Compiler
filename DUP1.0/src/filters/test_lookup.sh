#!/bin/bash

exe=./lookup
base=test_lookup


# ----------------------------------------------------------------------------------
echo -n "TEST: Bad argument checking..."

if $exe 1 < /dev/null 2> /dev/null 3< /dev/zero; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Missing keys input..."

if $exe < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: Missing stdin..."

if ./exec_no_stdin $exe < /dev/null 2> /dev/null; then
  echo "FAIL: error running $exe"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# EOF tests
# ----------------------------------------------------------------------------------
echo -n "TEST: keep going on stdout EOF..."

cat > $base.in <<EOF
aaaa
aaaa
aaaa
aaaa
this is just a test, there are many like it, but this one is mine
EOF
echo "aaaa" > $base.keys
for n in `seq 1 10`
do
  echo "aaaa" >> $base.in
done
if ! $exe < $base.in 3< $base.keys 4> $base.out4 5> $base.out5 | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "this is just a test, there are many like it, but this one is mine" > $base.oracle
if ! diff $base.out4 $base.oracle; then
    echo "FAIL: unexpected output"
    exit 1
fi
if(( $(wc -c < $base.out5) != 0 )); then
    echo "FAIL: incorrect number of output bytes"
    exit 1
fi
echo "PASS"


echo -n "TEST: keep going on stdout closed..."

cat > $base.in <<EOF
aaaa
aaaa
aaaa
aaaa
this is just a test, there are many like it, but this one is mine
EOF
echo "aaaa" > $base.keys
for n in `seq 1 10`
do
  echo "aaaa" >> $base.in
done
if ! ./exec_no_stdout $exe < $base.in 3< $base.keys 4> $base.out4 5> $base.out5 ; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "this is just a test, there are many like it, but this one is mine" > $base.oracle
if ! diff $base.out4 $base.oracle; then
    echo "FAIL: unexpected output"
    exit 1
fi
if(( $(wc -c < $base.out5) != 0 )); then
    echo "FAIL: incorrect number of output bytes"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: keep going on FD 4 closed..."

cat > $base.in <<EOF
aaaa
aaa
this is just a test, there are many like it, but this one is mine
z
aaaaa
EOF
echo "z" > $base.keys
for n in `seq 1 100`
do
  echo "aaaaaaaaaaaaaaaaaaaaaaaaa\n" >> $base.in
done
if ! $exe < $base.in 3< $base.keys 5> $base.out5 > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
if(( $(wc -c < $base.out5) != 0 )); then
    echo "FAIL: incorrect number of output bytes"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: terminate on all outputs closed..."

echo "z" > $base.keys
if ! ./exec_no_stdout $exe < /dev/urandom 3< $base.keys ; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: terminate on all outputs closing"

echo "ABC" > $base.keys
for n in `seq 1 10000`
do
 echo "ABC" >> $base.in
done
echo -n "..."
if ! $exe < $base.in 3< $base.keys | ./eof ; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: keep going on FD 5 closed..."

cat > $base.in <<EOF
a
a
this is just a test, there are many like it, but this one is mine
EOF
for n in `seq 1 100`
do
  echo "a" >> $base.in
done
echo "a" > $base.keys
if ! $exe < $base.in 3< $base.keys 4> $base.out4 > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "this is just a test, there are many like it, but this one is mine" > $base.oracle
if ! diff $base.out4 $base.oracle; then
    echo "FAIL: unexpected output"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: keep going on FD1 EOF and FD 4 closed..."

cat > $base.in <<EOF
aa
aa
this is just a test, there are many like it, but this one is mine
aa
aa
EOF
echo "aa" > $base.keys
echo "zz" >> $base.keys
if ! $exe < $base.in 3< $base.keys 5> $base.out5 | ./eof; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "zz" > $base.oracle
if ! diff $base.out5 $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: basic lookup..."

echo "abc" > $base.in
echo "def" >> $base.in
echo "efg" >> $base.in
echo "hij" >> $base.in
echo "lkm" >> $base.in
echo "mno" >> $base.in
echo "def" > $base.keys
echo "lkm" >> $base.keys
echo "xyz" >> $base.keys
if ! $exe < $base.in > $base.out 3< $base.keys 4> $base.out4 5> $base.out5; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "def" > $base.oracle
echo "lkm" >> $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi

echo "abc" > $base.oracle
echo "efg" >> $base.oracle
echo "hij" >> $base.oracle
echo "mno" >> $base.oracle
if ! diff $base.out4 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi

echo "xyz" > $base.oracle
if ! diff $base.out5 $base.oracle; then
    echo "FAIL: unexpected output (non-matched keys)"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------


echo -n "TEST: basic lookup without NEWLINE..."

echo "abc" > $base.in
echo "def" >> $base.in
echo "efg" >> $base.in
echo "hij" >> $base.in
echo "lkm" >> $base.in
echo -n "mno" >> $base.in
echo "def" > $base.keys
echo "lkm" >> $base.keys
echo "xyz" >> $base.keys
if $exe < $base.in > $base.out 3< $base.keys 4> $base.out4 5> $base.out5 2> /dev/null; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "def" > $base.oracle
echo "lkm" >> $base.oracle
if ! diff $base.out $base.oracle; then
    echo "FAIL: unexpected output (matching)"
    exit 1
fi

echo "abc" > $base.oracle
echo "efg" >> $base.oracle
echo "hij" >> $base.oracle
if ! diff $base.out4 $base.oracle; then
    echo "FAIL: unexpected output (non-matching)"
    exit 1
fi

echo -n "" > $base.oracle
if ! diff $base.out5 $base.oracle; then
    echo "FAIL: unexpected output (non-matched keys)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: duplicate key..."

cat > $base.in <<EOF
ab
cd
ef
EOF
echo "z"  > $base.keys
echo "cd" >> $base.keys
echo "z"  >> $base.keys
if ! $exe < $base.in 3< $base.keys 5> $base.out5 > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi

echo "z" > $base.oracle
if ! diff $base.out5 $base.oracle; then
    echo "FAIL: unexpected output (non-matched keys)"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out? $base.oracle $base.out $base.keys

