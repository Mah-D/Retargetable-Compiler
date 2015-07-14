#!/bin/bash
for i in caspian juhu hama
do
ssh dupper@$i "./cleanup.sh"
done
