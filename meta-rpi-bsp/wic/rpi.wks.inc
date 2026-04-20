#Create Raspberry pi SD card image 
#U-boot environment partition
  
#Boot partition 
part /boot --source bootimg-partition --ondisk mmcblk0 --fstype=vfat --label boot --active --align 4096 --size 100

# Rootfs partition 
part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label rootA --align 4096

part / --source rootfs --ondisk mmcblk0 --fstype=ext4 --label rootB --align 4096

#Data partition
part /data --ondisk mmcblk0 --fstype=ext4 --label data --size=500M
