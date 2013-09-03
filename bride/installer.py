#!/usr/bin/python

#based on script for SCALA see https://github.com/scala-ide/scala-ide
#ported to python an adapted for BRIDE

import os
import sys
import subprocess
import yaml
import yaml.constructor
try:
	from collections import OrderedDict
except ImportError:
	print "Python 2.7+ OrderedDict collection not available"
	try:
		from ordereddict import OrderedDict
		print "Using backported OrderedDict implementation"
	except ImportError:
		print "Backported OrderedDict implementation not available"

class OrderedDictYAMLLoader(yaml.Loader):
    """
    A YAML loader that loads mappings into ordered dictionaries. Taken from gist https://gist.github.com/enaeseth/844388
    """
 
    def __init__(self, *args, **kwargs):
        yaml.Loader.__init__(self, *args, **kwargs)
 
        self.add_constructor(u'tag:yaml.org,2002:map', type(self).construct_yaml_map)
        self.add_constructor(u'tag:yaml.org,2002:omap', type(self).construct_yaml_map)
 
    def construct_yaml_map(self, node):
        data = OrderedDict()
        yield data
        value = self.construct_mapping(node)
        data.update(value)
 
    def construct_mapping(self, node, deep=False):
        if isinstance(node, yaml.MappingNode):
            self.flatten_mapping(node)
        else:
            raise yaml.constructor.ConstructorError(None, None,
                'expected a mapping node, but found %s' % node.id, node.start_mark)
 
        mapping = OrderedDict()
        for key_node, value_node in node.value:
            key = self.construct_object(key_node, deep=deep)
            try:
                hash(key)
            except TypeError, exc:
                raise yaml.constructor.ConstructorError('while constructing a mapping',
                    node.start_mark, 'found unacceptable key (%s)' % exc, key_node.start_mark)
            value = self.construct_object(value_node, deep=deep)
            mapping[key] = value
        return mapping


eclipse_app = "org.eclipse.equinox.p2.director"
eclipse_opts = "-nosplash"

def install(eclipse_repo, eclipse_component):
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]

def install_local():
	eclipse_repo = "file://"+os.getcwd()+"/bride_plugins"
	eclipse_component = "org.ros.model.ros_coordinator.diagram"
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]
	eclipse_component = "org.ros.model.ros_package.diagram"
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]
	eclipse_component = "org.best_of_robotics.transform.ros.to.cplusplus"
	p = subprocess.Popen("./eclipse/eclipse " + eclipse_opts + " -application " + eclipse_app + " -repository " + eclipse_repo + " -installIU " + eclipse_component, shell=True)
	sts = os.waitpid(p.pid, 0)[1]
	eclipse_component = "org.best_of_robotics.transform.service.access"
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
		toinstall = yaml.load(stream, OrderedDictYAMLLoader)
		for repo in toinstall:
			for package in toinstall[repo]:
				install(repo, package)
		install_local()
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
		
