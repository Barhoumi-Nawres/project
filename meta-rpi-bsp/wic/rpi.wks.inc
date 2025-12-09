#Create Raspberry pi SD card image 
#U-boot environment partition
  
#Boot partition 
part /boot --source bootimg-partition --ondisk mmcblk0 --fstype=vfat --label boot0 --active --align 4096 --size 100

part /boot --source bootimg-partition --ondisk mmcblk0 --fstype=vfat --label boot1 --active --align 4096 --size 100

# Rootfs partition 
part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label root0 --align 4096

part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label root1 --align 4096

#Data partition for log files...etc 

part /data --ondisk mmcblk0 --fstype=ext4 --label data --size=500M
