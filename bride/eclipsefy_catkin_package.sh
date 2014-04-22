#!/bin/bash
# creates eclipse project settings for existing catkin package
cd `rospack find $1`
mkdir bride
cd bride
cmake -DCMAKE_ECLIPSE_MAKE_ARGUMENTS=-j8 -G "Eclipse CDT4 - Unix Makefiles" .. 
cmake -DCMAKE_ECLIPSE_MAKE_ARGUMENTS=-j8 -DCMAKE_MAKE_PROGRAM="catmake" -G "Eclipse CDT4 - Unix Makefiles" .. 
mv .project .. 
mv .cproject .. 
cd .. 
rm -rf bride 