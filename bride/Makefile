all: installed

UNPACK_CMD  	= tar zxf
SOURCE_DIR 	= build/eclipse
#32 bit version
TARBALL		= build/eclipse-modeling-kepler-R-linux-gtk.tar.gz
TARBALL_URL 	= http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/kepler/R/eclipse-modeling-kepler-R-linux-gtk.tar.gz
MD5SUM_FILE 	= eclipse-modeling-kepler-R-linux-gtk.tar.gz.md5sum

#64 bit version
UNAME = $(shell uname -m)
ifeq ($(UNAME),x86_64)
	TARBALL		= build/eclipse-modeling-kepler-R-linux-gtk-x86_64.tar.gz
	TARBALL_URL 	= http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/kepler/R/eclipse-modeling-kepler-R-linux-gtk-x86_64.tar.gz
	MD5SUM_FILE 	= eclipse-modeling-kepler-R-linux-gtk-x86_64.tar.gz.md5sum	
endif

SYSNAME = $(shell uname)
ifeq ($(SYSNAME),Darwin)
        TARBALL         = build/eclipse-modeling-kepler-R-macosx-cocoa-x86_64.tar.gz
        TARBALL_URL     = http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/kepler/R/eclipse-modeling-kepler-R-macosx-cocoa-x86_64.tar.gz
        MD5SUM_FILE     = eclipse-modeling-kepler-R-macosx-cocoa-x86_64.tar.gz.md5sum
endif

url 	= http://bride.cybernotic.org/eclipse_plugins_0.2.yaml
outputfile  	= eclipse_plugins.yaml


include $(shell rospack find mk)/download_unpack_build.mk

installed: $(SOURCE_DIR)/unpacked
	#echo "Downloading eclipse_plugins.yaml for automated eclipse installer"
	#curl -L -v  $(url) -o $(outputfile) 2>> logfile.txt
	mv build/eclipse eclipse
	./installer.py eclipse_plugins.yaml

update:
	./installer.py -u eclipse_plugins.yaml

clean:
	rm -rf $(SOURCE_DIR) $(TARBALL) build
