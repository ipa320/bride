cmake_minimum_required(VERSION 2.8.3)
project(bride_tutorials)


find_package(catkin REQUIRED COMPONENTS actionlib std_msgs actionlib_msgs message_generation roscpp)

include_directories(${catkin_INCLUDE_DIRS} ${Boost_INCLUDE_DIRS})

add_message_files(
  FILES
  Dummy.msg
  )

add_action_files(DIRECTORY action
  FILES
  TriggerPublish.action
)

add_custom_target(bride_tutorials)
add_dependencies(bride_tutorials actionlib_gencpp)


## Generate added messages and services with any dependencies listed here
generate_messages(
  DEPENDENCIES actionlib_msgs std_msgs
)

#add_dependencies(bride_tutorials bride_tutorials_gencpp)


###################################
## catkin specific configuration ##
###################################

catkin_package(
    CATKIN_DEPENDS message_runtime std_msgs actionlib_msgs
)
