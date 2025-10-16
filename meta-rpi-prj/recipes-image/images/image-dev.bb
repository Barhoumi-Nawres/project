DESCRIPTION= "development image for testing and debugging "
SUMMARY ="development image for raspberry pi"
LICENSE = "CLOSED"

inherit core-image
IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

#Disable GPLv3 packages for image
#INCOMPATIBLE_LICENSE = "GPL-3.0* LGPL-3.0* AGPL-3.0*"

#remove root password 
IMAGE_FEATURES = " allow-empty-password allow-root-login empty-root-password ssh-server-openssh tools-debug"

#dbg-pkgs :including symbol information for debugging and profiling.
EXTRA_IMAGE_FEATURES ="dbg-pkgs debug-tweaks dev-pkgs"


IMAGE_INSTALL:append = " systemd-analyze hello-mod rauc rauc-conf"
