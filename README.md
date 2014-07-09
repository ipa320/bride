BRIDE - The MDE tool chain for ROS
==================

BRIDE is a model driven engineering tool chain based on Eclipse for the development of ROS components, systems and applications.

![BRIDE screenshot](http://cybernotic.org/bride/img/small_system.png "BRIDE screenshot")


Installation
------------

## From official ROS repositories ##

~~~ sh
$ sudo apt-get install ros-hydro-bride
~~~

## From source ##

~~~ sh
$ mkdir -p ~/git/bride_ws/src                  (or somewhere else)
$ cd git/bride_ws/src
$ catkin_init_workspace
~~~

Clone the release version of the BRIDE repository

~~~ sh
$ git clone https://github.com/ipa320/bride.git
$ cd ..
~~~

Install eclipse and the necessary plugins by building the workspace:

~~~ sh
$ catkin_make
~~~

Run bride from the workspace 

~~~ sh
$ source devel/setup.sh
$ rosrun bride eclipse
~~~


## Updating a source installation ##

If you installed BRIDE from source you can update your installed version by updating the repository with git:

~~~ sh
$ git pull origin develop
~~~

Afterwards start BRIDE as usually and go into the "Help" menu and select "Check for Updates". If there are updates in the generated plugins in the repository, Eclipse should install them during the update process.

Development
------------

Please report issues here on github. If you want to develop for BRIDE you can find documentation on the setup here:
<https://github.com/ipa320/bride/wiki/Developer-setup>


Tutorials
------------

You can find detailed examples and tutorials on the [ROS wiki pages](http://wiki.ros.org/bride).


Status
------------

[![Build Status](https://travis-ci.org/ipa320/bride.png)](https://travis-ci.org/ipa320/bride)
