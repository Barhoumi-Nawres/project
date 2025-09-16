#Create Raspberry pi SD card image 

part /boot --source bootimg-partition --ondisk mmcblk0 --fstype=vfat --label boot --active --align 4096 --size ${WKS_BOOTIMAGESIZE}
part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label root --align 4096


