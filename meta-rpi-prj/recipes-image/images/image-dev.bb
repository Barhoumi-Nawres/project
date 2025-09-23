DESCRIPTION= "development image for testing and debugging "
SUMMARY ="development image for raspberry pi"
LICENSE = "CLOSED"

inherit core-image

#size of rootfs 
#IMAGE_ROOTFS_SIZE ?= "8192"



#Disable GPLv3 packages for image
INCOMPATIBLE_LICENSE = "GPL-3.0* LGPL-3.0* AGPL-3.0*"

#remove root password 
IMAGE_FEATURES = " allow-empty-password"

#dbg-pkgs :including symbol information for debugging and profiling.
EXTRA_IMAGE_FEATURES ="dbg-pkgs debug-tweaks dev-pkgs"



 
