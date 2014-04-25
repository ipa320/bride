cmake_minimum_required(VERSION 2.8.3)
project(bride)

find_package(catkin REQUIRED COMPONENTS)
file(MAKE_DIRECTORY ${CATKIN_DEVEL_PREFIX}/bin/)


add_custom_target(
    bride_install ALL COMMAND cmake -E chdir ${PROJECT_SOURCE_DIR} make -f Makefile.tarball) 


add_custom_target(
    copy_catmake ALL
    COMMAND ${CMAKE_COMMAND} -E copy ${PROJECT_SOURCE_DIR}/catmake ${CATKIN_DEVEL_PREFIX}/bin/
    )

add_dependencies(bride_install copy_catmake)

catkin_package()


## Mark executables and/or libraries for installation

install(DIRECTORY eclipse/
    DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/
)

install(PROGRAMS eclipse/eclipse DESTINATION ${CATKIN_PACKAGE_SHARE_DESTINATION}/)

install(PROGRAMS catkin_create_eclipse_package.sh eclipsefy_catkin_package.sh rosaction.py 
  DESTINATION ${CATKIN_PACKAGE_BIN_DESTINATION}
)

install(PROGRAMS catmake
  DESTINATION ${CATKIN_GLOBAL_BIN_DESTINATION})
