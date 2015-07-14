#!/bin/bash
#
# Todo:
# - validate output to FD 3...
#
exe=./cmd
base=test_cmd

# ----------------------------------------------------------------------------------
# EOF test
# ----------------------------------------------------------------------------------
echo -n "TEST: instant terminate if no inputs..."
if ! ./exec_no_stdin $exe ; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# CMD-line test
# ----------------------------------------------------------------------------------
echo -n "TEST: run CMD line..."
if ! ./exec_no_stdin $exe echo hello > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "hello" > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Input processing
# ----------------------------------------------------------------------------------
echo -n "TEST: run inputs..."
echo "echo hello" > $base.in
echo "echo world" >> $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "hello" > $base.oracle
echo "world" >> $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Double Quote processing
# ----------------------------------------------------------------------------------
echo -n "TEST: double quotes..."
echo "echo \"hello  world\"" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "hello  world" > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

echo -n "TEST: double quotes in string..."
echo "echo hello\"  world\"" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "hello  world" > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: double quotes with escape..."
echo "echo -e \"hello\\n\\t\\\\world\"" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo -e "hello\n\t\\world" > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# Single-Quote processing
# ----------------------------------------------------------------------------------
echo -n "TEST: single quotes..."
echo "echo 'hello\n  world'" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo 'hello\n  world' > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

echo -n "TEST: single quotes in string..."
echo "echo hello'\n  world'" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo 'hello\n  world' > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: unquoted escape..."
echo "echo \\tfoo\\n\\\\" > $base.in
if ! $exe < $base.in > $base.out; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo \tfoo\n\\ > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
echo -n "TEST: ignore stdout..."
rm -f $base.have
echo "touch $base.have" > $base.in
if ! ./exec_no_stdout $exe < $base.in ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: handle bad command..."
rm -f $base.have
echo "foo" > $base.in
echo "touch $base.have" >> $base.in
if ! ./exec_no_stdout $exe < $base.in 2> /dev/null ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"

echo -n "TEST: handle empty command..."
rm -f $base.have
echo " " > $base.in
echo "touch $base.have" >> $base.in
if ! ./exec_no_stdout $exe < $base.in ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"


echo -n "TEST: handle unbalanced quotes in command..."
rm -f $base.have
echo " echo \"foo" > $base.in
echo "touch $base.have" >> $base.in
if ! $exe < $base.in > $base.out 2> /dev/null ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi

echo -n "" > $base.oracle
if ! diff $base.oracle $base.out; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"



# ----------------------------------------------------------------------------------
echo -n "TEST: handle space before command..."
rm -f $base.have
echo " touch $base.have" > $base.in
if ! ./exec_no_stdout $exe < $base.in ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"


# ----------------------------------------------------------------------------------
echo -n "TEST: handle tab before command..."
rm -f $base.have
echo -e "\ttouch $base.have" > $base.in
if ! ./exec_no_stdout $exe < $base.in ; then
    echo "FAIL: error running $exe"
    exit 1
fi
if ! test -e $base.have; then
  echo "FAIL: unexpected output"
  exit 1
fi
rm -f $base.have
echo "PASS"


# ----------------------------------------------------------------------------------
# cleanup -- only here if successful
# ----------------------------------------------------------------------------------
rm -f $base.in $base.out1 $base.out2 $base.out3 $base.oracle $base.out

