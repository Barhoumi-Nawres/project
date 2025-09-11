DESCRIPTION= "development image "

inherit core-image
#heritage from core-image.bbclass (path:oe-core/meta/classes/core-image.bbclass)

#Disable GPLv3 packages for image
INCOMPATIBLE_LICENSE = "GPL-3.0* LGPL-3.0* AGPL-3.0*"
