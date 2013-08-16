cmake_minimum_required(VERSION 2.8.3)
project(bride)

add_custom_target(
    bride_install ALL COMMAND ${PROJECT_SOURCE_DIR}/installer.py ${PROJECT_SOURCE_DIR}/eclipse_plugins.yaml) 

catkin_package()