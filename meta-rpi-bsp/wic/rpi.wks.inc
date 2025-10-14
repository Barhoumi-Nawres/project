#Create Raspberry pi SD card image 

part /boot --source bootimg-partition --ondisk mmcblk0 --fstype=vfat --label boot --active --align 4096 --size 100
part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label root0 --align 4096

part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label root1 --align 4096


#Data partition for log files...etc 

part /data --ondisk mmcblk0 --fstype=ext4 --label data --size=500M
