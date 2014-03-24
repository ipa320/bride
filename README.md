## Status ##

[![Build Status](https://travis-ci.org/abubeck/bride.png)](https://travis-ci.org/abubeck/bride)

## Installation ##

Checkout repository into a directory that is part of your $ROS_PACKAGE_PATH (or add bride directory into $ROS_PACKAGE_PATH afterwards)

      # git clone git://github.com/ipa320/bride.git

Install eclipse and all necessary plugins

      # roscd bride

      # make

To start bride use:

      # rosrun bride eclipse

## Updating Installation ##

After updates in the brics plugins a complete installation is not necessary. 
To reinstall the updated brics plugins in your existing bride installation do the following steps:

      # roscd bride

      # make update
