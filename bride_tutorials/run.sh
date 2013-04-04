#!/bin/bash

#TODO: GUI Tests mit Jubula oder Q7

# Generation of ROS package for talker
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg talker
cd talker
mkdir model
cp `rospack find bride_tutorials`/model/talker.ros_package model/talker.ros_package
rosrun bride_compilers m2t -o talker -l cpp -p talker model/talker.ros_package

# Modification and building of talker package
cd `rospack find talker`
cp `rospack find bride_tutorials`/src/talker_common.cpp common/src/talker_common.cpp
rosmake

# Generation of ROS package for listener
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg listener
cd listener
mkdir model
cp `rospack find bride_tutorials`/model/listener.ros_package model/listener.ros_package
rosrun bride_compilers m2t -o listener -l cpp -p listener model/listener.ros_package

# Modification and building of listener package
cd `rospack find listener`
cp `rospack find bride_tutorials`/src/listener_common.cpp common/src/listener_common.cpp
rosmake

# Generation of ROS package for behaviour
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg behaviour
cd behaviour
mkdir model
cp `rospack find bride_tutorials`/model/behaviour.ros_coordinator model/behaviour.ros_coordinator
rosrun bride_compilers m2t -o behaviour -p behaviour model/behaviour.ros_coordinator

# Generation of ROS system package
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg deployment
cd deployment
mkdir model
cp `rospack find bride_tutorials`/model/deployment.ros_system model/deployment.ros_system
rosrun bride_compilers m2t -o deployment -p deployment model/deployment.ros_system

# ROSTesting of ROS system

