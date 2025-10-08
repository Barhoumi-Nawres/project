
# YOCTO-Project using Raspberry pi02w 
This project aims to learn and practive different ways in yocto build system such as creating image ,developping distro ,BSP ,wrting recipes ..etc 


Using Raspberrypi0 2w 
## Hardware Requirements:
Raspberry Pi Zero 2 W
SD Card (16 GB)

## Project Architecture:

### Main Directories :
- docker 
- kas 
- meta-rpi-bsp
- meta-rpi-distro
- meta-rpi-prj

### Project Goals :

-Prepare KAS yml file for all layers ans local configuration file .
-Develop BSP layer 
-Develop Distro layer without using Poky (from scratch).
-Create images (for development and production )
-......etc 

## Setup process : 
Kas makes the setup of yocto build environment super simple and fast .



  1.install kas :
```bash
git clone https://github.com/siemens/kas.git
```
  2.Commands :
```bash
 kas-container checkout file.yml
  kas-container shell  file.yml 
  kas-container build  file.yml
```

Unmount all partitions :

```bash
host$ umount /dev/<your_device><number>
```

Flash image into SD card :
```bash
host$ sudo dd if=<IMAGENAME>.<Type> of=/dev/<your_device> bs=1MB conv=fsync
```

Connection between board and Computer:
Using :
USB To RS232 TTL UART PL2303.

Install picocom :
```bash
sudo apt-get install picocom
```
 
Running picocom :
```bash
sudo picocom -b 115200 -r -l /dev/ttyUSB0
```

### Test Development image:

![TEST graph](test.png)
![raspberry image](raspberrypi02w.jpg)
