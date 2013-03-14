all: installed

UNPACK_CMD  	= tar zxf
SOURCE_DIR 	= build/eclipse
#32 bit version
TARBALL		= build/eclipse-modeling-juno-SR2-linux-gtk.tar.gz
TARBALL_URL 	= http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/juno/SR2/eclipse-modeling-juno-SR2-linux-gtk.tar.gz
MD5SUM_FILE 	= eclipse-modeling-juno-SR2-linux-gtk.tar.gz.md5sum

#64 bit version
UNAME = $(shell uname -m)
ifeq ($(UNAME),x86_64)
	TARBALL		= build/eclipse-modeling-juno-SR2-linux-gtk-x86_64.tar.gz
	TARBALL_URL 	= http://mirror.netcologne.de/eclipse//technology/epp/downloads/release/juno/SR2/eclipse-modeling-juno-SR2-linux-gtk-x86_64.tar.gz
	MD5SUM_FILE 	= eclipse-modeling-juno-SR2-linux-gtk-x86_64.tar.gz.md5sum	
endif

SYSNAME = $(shell uname)
ifeq ($(SYSNAME),Darwin)
        TARBALL         = build/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64.tar.gz
        TARBALL_URL     = http://ftp.wh2.tu-dresden.de/pub/mirrors/eclipse/technology/epp/downloads/release/juno/SR2/eclipse-modeling-juno-SR2-macosx-cocoa-x86_64.tar.gz
        MD5SUM_FILE     = eclipse-modeling-juno-SR2-macosx-cocoa-x86_64.tar.gz.md5sum
endif



include $(shell rospack find mk)/download_unpack_build.mk

installed: $(SOURCE_DIR)/unpacked
	mv build/eclipse eclipse
	./installer.py eclipse_plugins.yaml

update:
	./installer.py -u eclipse_plugins.yaml

clean:
	rm -rf $(SOURCE_DIR) $(TARBALL) build
