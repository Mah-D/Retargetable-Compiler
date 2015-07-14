#!/bin/bash
if [ "$(hostname)" != 'tuvalu' ]; then
	killp=/Users/dupper
else
	killp=/home/dupper
fi

for i in tuvalu caspian juhu hama redondo
do
	if [ "$(hostname)" != $i ]; then
		ssh dupper@$i "$killp/duprun-mpi/cleanup.sh"
	else
		$killp/duprun-mpi/cleanup.sh
	fi
done
