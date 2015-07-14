#!/bin/bash

# ----------------------------------------------------------------------------------
# All it has to do is execute successfully
# ----------------------------------------------------------------------------------
echo -n "TEST: basic operation stdin..."
if ! ./exec_no_stdin echo "Hello World" > out; then
    echo "FAIL: error running exec_no_stdin"
    exit 1
fi
echo "Hello World" > oracle
if ! diff oracle out; then
    echo "FAIL: unexpected output"
    exit 1;
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# All it has to do is execute successfully
# ----------------------------------------------------------------------------------
echo -n "TEST: basic operation stdout..."
if ./exec_no_stdout echo "Hello World" > out 2> /dev/null; then
    echo "FAIL: error running exec_no_stdin"
    exit 1
fi
echo -n "" > oracle
if ! diff oracle out; then
    echo "FAIL: unexpected output"
    exit 1;
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# All it has to do is fail...
# ----------------------------------------------------------------------------------
echo -n "TEST: no-command stdin operation..."
if ./exec_no_stdin foobar 2> /dev/null ; then
    echo "FAIL: error running exec_no_stdin"
    exit 1
fi
echo "PASS"


# ----------------------------------------------------------------------------------
# All it has to do is fail...
# ----------------------------------------------------------------------------------
echo -n "TEST: no-command stdout operation..."
if ./exec_no_stdout foobar 2> /dev/null ; then
    echo "FAIL: error running exec_no_stdin"
    exit 1
fi
echo "PASS"



rm -f out oracle


