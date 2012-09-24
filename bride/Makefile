all: installed

TARBALL		= build/eclipse-modeling-juno-linux-gtk-x86_64.tar.gz
TARBALL_URL 	= http://ftp-stud.fht-esslingen.de/pub/Mirrors/eclipse/technology/epp/downloads/release/juno/R/eclipse-modeling-juno-linux-gtk-x86_64.tar.gz
UNPACK_CMD  	= tar zxf
SOURCE_DIR 	= build/eclipse
MD5SUM_FILE 	= eclipse-modeling-juno-linux-gtk-x86_64.tar.gz.md5sum

include $(shell rospack find mk)/download_unpack_build.mk

installed: $(SOURCE_DIR)/unpacked
	mv build/eclipse eclipse
	./installer.py installgmf
	./installer.py installepsilon
	./installer.py installcdt
	./installer.py installbrics


clean:
	rm -rf $(SOURCE_DIR) $(TARBALL) build
