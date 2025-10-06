SUMMARY = "simple recipe"
DESCRIPTION = "hello recipe as an example"

LICENSE = "CLOSED"

SRC_URI = "file://hello.c;subdir=hello"

S= "${WORKDIR}/hello"

B= "${WORKDIR}/build"
do_compile(){

	${CC} ${S}/hello.c ${CFLAGS} ${LDFLAGS} -o ${B}/main

}


do_install(){

	install -d ${D}${bindir}
	install -m 0744 ${B}/main ${D}${bindir}


}
