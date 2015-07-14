#!/bin/bash
rm inc/*.gch
rm relay/inc/*.gch
gcc inc/*.h lib/*.c -o dispatcher
gcc relay/inc/*.h relay/lib/*.c -o relayer
scp -r * dupper@juhu:/Users/dupper/Desktop/dupTestCode/.
scp -r * dupper@hama:/Users/dupper/Desktop/dupTestCode/.
