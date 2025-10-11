SUMMARY = "recipe for hello module "
DESCRIPTION = "${SUMMARY}"

LICENSE = "CLOSED"
inherit module 

SRC_URI = "file://Makefile \
           file://hello.c \
	   "


S = "${WORKDIR}"

#RPROVIDES_${PN} += "kernel-module-hello"
