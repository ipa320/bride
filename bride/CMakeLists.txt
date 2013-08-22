cmake_minimum_required(VERSION 2.8.3)
project(bride)



add_custom_target(
    bride_install ALL COMMAND cmake -E chdir ${PROJECT_SOURCE_DIR} make -f Makefile.tarball) 

catkin_package()


## Mark executables and/or libraries for installation

install(DIRECTORY eclipse/
    DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/
)

install(PROGRAMS eclipse/eclipse DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/)