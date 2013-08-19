cmake_minimum_required(VERSION 2.8.3)
project(bride_tutorials)


find_package(catkin REQUIRED COMPONENTS actionlib std_msgs actionlib_msgs message_generation)

add_action_files(
  FILES
  TriggerPublish.action
)

## Generate added messages and services with any dependencies listed here
generate_messages(
  DEPENDENCIES actionlib_msgs  std_msgs
)

###################################
## catkin specific configuration ##
###################################

catkin_package(
    CATKIN_DEPENDS message_runtime std_msgs actionlib
)
