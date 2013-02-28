#!/usr/bin/python

#based on script for SCALA see https://github.com/scala-ide/scala-ide
#ported to python an adapted for BRIDE

import roslib
import os
import sys
import subprocess
import yaml

eclipse_app = "org.eclipse.equinox.p2.director"
eclipse_opts = "-nosplash"

def install(eclipse_repo, eclipse_component):
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]

def uninstall(eclipse_repo, eclipse_component):
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -uninstallIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]

def update(eclipse_repo, eclipse_component):
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component + " -uninstallIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]


def install_emfatic():
	eclipse_repo = "http://download.eclipse.org/emfatic/update/"
	eclipse_repo = "http://download.eclipse.org/epsilon/updates/"
	eclipse_component = "org.eclipse.emf.emfatic"
	eclipse_component = "org.eclipse.epsilon.feature.feature"
	install(eclipse_repo, eclipse_component)

if __name__ == "__main__":
	if(len(sys.argv) == 2):
		stream = file(sys.argv[1], 'r') 
		toinstall = yaml.load(stream)
		for repo in toinstall:
			for package in toinstall[repo]:
				install(repo, package)
	elif(len(sys.argv) == 3):
		if(sys.argv[1] == '-u'):
			stream = file(sys.argv[2], 'r') 
			toinstall = yaml.load(stream)
			for repo in toinstall:
				for package in toinstall[repo]:
					update(repo, package)
		else:
			print "Usage: installer.py [-u] resource_yaml_file"
	else:
		print "Usage: installer.py [-u] resource_yaml_file"
		
