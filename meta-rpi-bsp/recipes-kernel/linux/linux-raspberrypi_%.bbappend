FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://fragment.cfg \
	    file://rauc.cfg \
            file://myled-overlay.dts \
	   " 

# Make sure that a new-dtb present in the main makefile 

do_configure:append(){
      cp ${WORKDIR}/myled-overlay.dts ${S}/arch/arm/boot/dts/overlays/
      echo "dtbo-$(CONFIG_ARCH_BCM2835) += myled.dtbo" >> ${S}/arch/arm/boot/dts/overlays/Makefile

}


