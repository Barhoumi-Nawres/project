DESCRIPTION= "development image "

inherit core-image
#heritage from core-image.bbclass (path:oe-core/meta/classes/core-image.bbclass)
IMAGE_FSTYPES = "tar.bz2 ext4 wic wic.bmap"

IMAGE_FEATURES = "debug-tweaks package-management"


