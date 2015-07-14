#!/bin/bash

###############################################################################
# Local Functions
###############################################################################

print_help () {
  echo "Usage: $(basename ${0}) <option>"
  echo ""
  echo "Options:"
  echo "    --text: Use text installation."
}

###############################################################################
# Main
###############################################################################

#Find the path to install directory
tmpdir=`dirname $0`
currdir=`pwd`
if echo $tmpdir | grep -q -s ^/ || echo $tmpdir | grep -q -s ^~ ; then
  # absolute path
  FULL_PATH=$tmpdir
else
  # relative path 
  FULL_PATH=$currdir/$tmpdir
fi

#Extract to /tmp/rotateright-zoom-installer-XXXXX
printf "Extracting archive"
tmpdir=/tmp/rotateright-zoom-installer-${RANDOM}
mkdir -p $tmpdir
tar -C $tmpdir -xvf $FULL_PATH/.install.tar | while read line; do printf .; done
printf '\n'
cp $FULL_PATH/Zoom_EULA.txt $tmpdir 
cp $FULL_PATH/Zoom_ReleaseNotes.txt $tmpdir 
cd $tmpdir/.install

#Launch installer
if [ -d $tmpdir ]; then
  trap 'echo Signal caught, cleaning up >&2; cd $tmpdir; /bin/rm -rf $tmpdir; exit 2' 1 2 3 15

  if [ $# -eq 0 ]; then
    ./install.sh
  elif [ $# -eq 1 ] && [ $1 == "--text" ]; then
    ./install.sh run_text
  else
    print_help
    exit 1
  fi

else
  echo "ERROR: Unable to extract to $tmpdir"
  exit 2
fi

rm -fr $tmpdir
exit 0

