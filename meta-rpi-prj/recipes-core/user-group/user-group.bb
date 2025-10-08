DESCRIPTION = "Create a custom user and group with encrypted password "

LICENSE = "CLOSED"

inherit useradd

#to get password encrypted use the following command : 
#printf "%q" $(openssl passwd PASSWD)

PASSWD = "\$1\$VgbB7Q/h\$vnBa/i3vyWGguX44f/fx/0"

NEWUSER= "rpi"


USERADD_PACKAGES= "${PN}"


USERADD_PARAM:${PN} = " -d /home/${NEWUSER} -p '${PASSWD}' ${NEWUSER}"


do_install (){

install -d ${D}${datadir}${NEWUSER}

}

FILES:${PN} += "${datadir}${NEWUSER}"
