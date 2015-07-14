#!/bin/sh
#
# TODO:
# - write actual correct input tests
# - write pretty printer (in parser.cc and related classes)
# - write more bogus input tests

exe="./parser"
base=test_parser
BAD_INPUT=tests/malformed_input/
GOOD_INPUT=tests/good_tests/

homogenize () {
    #this doesn't do anything yet.  
    #I've been trying to think of a way to script a homogenization routine
    #when I figure something out, it will go here
    for arg in $@
    do
	cat $arg > ${arg}.aux
    done
}

# ----------------------------------------------------------------------------------
# No input test
# ----------------------------------------------------------------------------------
echo -n "TEST: instant terminate if no input..."
if ! $exe < /dev/null ; then
    echo "FAIL: error running $exe"
    exit 1
fi
echo "PASS"

# ----------------------------------------------------------------------------------
# Correct input test
# ----------------------------------------------------------------------------------
echo -n "TEST: correct inputs... "
for f in `ls $GOOD_INPUT`
do
    if ! $exe < $GOOD_INPUT$f 1> $base.out 
    then 
	echo "FAIL: error parsing $f"
	exit 1
    fi
done
echo "PASS"

# echo -n "TEST: pretty-print correct input..."
# cat > $base.in <<EOF
# nodeOne@localhost:8888[0</input/file, 1|nodeTwo:0, 3>/some/file]$ command arg "more args";
# nodeTwo@127.0.0.1:8888[1>/dev/tty, 3>>/another/file]$ command 'more args';
# EOF

# if ! $exe < $base.in > $base.out ; then
#     echo "FAIL: error running $exe"
#     exit 1
# fi

#need to run the input and output files through a script to make them the same without
#generating false negatives and false positives.  Take out spaces, and homogenize the 
#quoting.  

#homogenize $base.in $base.out


#Until I figure out how to homogenize things, I'm going to concentrate 
#on testing invalid input

# if ! diff $base.in.aux $base.out.aux; then
#     echo "FAIL: unexpected output"
#     exit 1
# fi
#echo "PASS"


# ----------------------------------------------------------------------------------
# Bogus input tests
# ----------------------------------------------------------------------------------
echo -n "TEST: incorrect input: missing dollar..."
echo 'foo@localhost:1234[3<fn] echo a;'  > $base.in 
if $exe < $base.in 2> /dev/null
then
    echo "FAIL: should not have parsed successfully"
    exit 1
fi
echo "PASS"


echo -n "TEST: incorrect inputs... "
for f in `ls $BAD_INPUT`
do
    if $exe < $BAD_INPUT$f > $base.out 2> /dev/null; 
    then
	echo "FAIL.  Should have failed on malformed input $f."
	exit 1
    fi
done
echo "PASS"

rm -f $base.out
