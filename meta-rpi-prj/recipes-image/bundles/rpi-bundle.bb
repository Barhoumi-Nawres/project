DESCRIPTION = "bundle recipe"
SUMMARY = "${DESCRIPTION}"

inherit bundle

RAUC_BUNDLE_COMPATIBLE = "${MACHINE}"
RAUC_BUNDLE_VERSION = "${DISTRO_VERSION}"
RAUC_BUNDLE_SLOTS ?= "rootfs"
RAUC_SLOT_rootfs ?= "image-dev"
RAUC_IMAGE_FSTYPE = "ext4"
RAUC_BUNDLE_FORMAT ?= "verity"

RAUC_KEY_FILE = "${THISDIR}/keys/development-1.key.pem"
RAUC_CERT_FILE = "${THISDIR}/keys/development-1.cert.pem"
