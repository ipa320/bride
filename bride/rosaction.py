#!/usr/bin/env python

import roslib.message
import rospkg
import genmsg
import sys
import os


if __name__ == '__main__':
	if(len(sys.argv) != 2):
		print "usage: rosaction.py PACKAGENAME"
	else:
		rospack = rospkg.RosPack()
		path = os.path.join(rospack.get_path(sys.argv[1]), "action")
		resources = [f for f in os.listdir(path) if os.path.isfile(os.path.join(path, f))]
		for r in resources:
			print sys.argv[1]+"/"+r.replace(".action","")

