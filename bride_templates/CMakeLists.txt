cmake_minimum_required(VERSION 2.8.3)
project(bride_templates)

find_package(catkin REQUIRED COMPONENTS)


catkin_package()

install(DIRECTORY cpp/
    DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/cpp
)

install(DIRECTORY python/
    DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/python
)

install(DIRECTORY system/
    DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/system
)