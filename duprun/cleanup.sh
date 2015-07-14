#!/bin/bash
ps -ef | grep dup | grep -v grep | grep -v ssh | awk '{print $2}' | xargs kill -9
