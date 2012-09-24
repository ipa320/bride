all: libntcan

ifeq (`uname -m`,"x86_64")
	CFLAGS = "-g"
else
	CFLAGS = "-gs"
endif

libntcan:
	echo $(CFLAGS)

#include $(shell rospack find mk)/cmake.mk