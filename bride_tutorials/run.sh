#!/bin/bash

#TODO: GUI Tests mit Jubula oder Q7

# Generation of ROS package for talker
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg talker
rosrun bride_compilers m2t -o talker -l cpp -p bride_tutorials model/talker.ros_package

# Modification and building of talker package
cd `rospack find talker`
rosmake

# Generation of ROS package for listener
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg listener
rosrun bride_compilers m2t -o listener -l cpp -p bride_tutorials model/listener.ros_package

# Modification and building of listener package
cd `rospack find listener`
rosmake

# Generation of ROS system package
cd `rospack find bride_tutorials`
cd ..
roscreate-pkg deployment
rosrun bride_compilers m2t -o deployment -p bride_tutorials model/deployment.ros_system

# ROSTesting of ROS system

