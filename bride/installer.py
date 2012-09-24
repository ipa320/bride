#!/usr/bin/python

#based on script for SCALA see https://github.com/scala-ide/scala-ide
#ported to python an adapted for BRIDE

import roslib
import sys
import subprocess

eclipse_app = "org.eclipse.equinox.p2.director"
#eclipse_repo = "http://download.eclipse.org/releases/juno/"
eclipse_opts = "-nosplash"

def install(eclipse_repo, eclipse_component):
	str = subprocess.check_output(["./eclipse/eclipse", eclipse_opts, "-application", eclipse_app, "-repository", eclipse_repo, "-installIU", eclipse_component])
	print str

def uninstall(eclipse_repo, eclipse_component):
	str = subprocess.check_output(["./eclipse/eclipse", eclipse_opts, "-application", eclipse_app, "-repository", eclipse_repo, "-uninstallIU", eclipse_component])
	print str


def install_gmf():
	eclipse_repo = "http://download.eclipse.org/releases/juno/"
	#eclipse_component = "org.eclipse.gmf.tooling"
	eclipse_component = "org.eclipse.gmf.tooling.runtime"
	install(eclipse_repo, eclipse_component)

def install_epsilon():
	eclipse_repo = "http://download.eclipse.org/epsilon/updates/"

	#eclipse_component = "org.eclipse.epsilon.feature.feature.jar"
	#install(eclipse_repo, eclipse_component)
	#eclipse_component = "org.eclipse.epsilon.gmf.feature.feature.jar"
	#install(eclipse_repo, eclipse_component)
	
	eclipse_component = "org.antlr.runtime_3.1.b1"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.dependencies"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.commons"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.eol.engine"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.erl.engine"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.common.dt"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.eol.dt"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.egl.engine"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.epsilon.emc.emf"
	install(eclipse_repo, eclipse_component)


def install_brics_from_local():
	bride_plugins_dir = roslib.packages.get_pkg_dir("bride_plugins")
	eclipse_repo = "file://" + bride_plugins_dir + "/features/"
	#Capability builder
	eclipse_component = "org.ros.model.ros_package.diagram"
	install(eclipse_repo, eclipse_component)
	
	#General UI
	eclipse_component = "org.best_of_robotics.bride.ui"
	install(eclipse_repo, eclipse_component)
	
	#Code Generation
	eclipse_component = "org.best_of_robotics.transform.ros.to.cplusplus"
	install(eclipse_repo, eclipse_component)

def uninstall_brics_from_local():
	bride_plugins_dir = roslib.packages.get_pkg_dir("bride_plugins")
	eclipse_repo = "file://" + bride_plugins_dir + "/features/"
	#Capability builder
	eclipse_component = "org.ros.model.ros_package.diagram"
	uninstall(eclipse_repo, eclipse_component)
	
	#General UI
	eclipse_component = "org.best_of_robotics.bride.ui"
	uninstall(eclipse_repo, eclipse_component)
	
	#Code Generation
	eclipse_component = "org.best_of_robotics.transform.ros.to.cplusplus"
	uninstall(eclipse_repo, eclipse_component)

def install_cdt():
	eclipse_repo = "http://download.eclipse.org/releases/juno/"
	eclipse_component = "org.eclipse.cdt"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.cdt.core.linux"
	install(eclipse_repo, eclipse_component)

	eclipse_component = "org.eclipse.linuxtools.cdt.autotools.core"
	install(eclipse_repo, eclipse_component)

def install_pydev():
	pass

def install_rse():
	pass

def install_emfatic():
	eclipse_repo = "http://download.eclipse.org/emfatic/update/"
	eclipse_repo = "http://download.eclipse.org/epsilon/updates/"
	eclipse_component = "org.eclipse.emf.emfatic"
	eclipse_component = "org.eclipse.epsilon.feature.feature"
	install(eclipse_repo, eclipse_component)

def list():
	bride_plugins_dir = roslib.packages.get_pkg_dir("bride_plugins")
	eclipse_repo = "file://" + bride_plugins_dir + "/features/"
	#eclipse_repo = "http://download.eclipse.org/releases/juno/"
	#eclipse_repo = "http://download.eclipse.org/epsilon/updates/"
	str = subprocess.check_output(["./eclipse/eclipse", eclipse_opts, "-application", eclipse_app, "-repository", eclipse_repo, "-list"])
	print str

if __name__ == "__main__":
	if len(sys.argv) == 2:
		if(sys.argv[1] == "list"):
			list()
		if(sys.argv[1] == "installgmf"):
			install_gmf()
		if(sys.argv[1] == "installepsilon"):
			install_epsilon()	
		if(sys.argv[1] == "installbrics"):
			install_brics_from_local()
		if(sys.argv[1] == "installcdt"):
			install_cdt()	
		if(sys.argv[1] == "reinstallbrics"):
			uninstall_brics_from_local()
			install_brics_from_local()	
		